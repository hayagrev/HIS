package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_progressnotespages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class InpatientManagement_ProgressNotesTest extends CrossBrowser {
    
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	String AdmissionNu;
	InpatientManagement_progressnotespages IM_PN;
	  util utilobj=new util();
    public InpatientManagement_ProgressNotesTest(){
		
	   }
	
    @Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
    
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException
	{

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), "Female medical ward",Browser);
	}
	@Test(priority = 3)
	public void donavigatetoProgressNotes() {
		IM_PN=hishomepage.doNavigateTogetprograssNote();
		
	}
	  @Test(priority = 4)
	  @Parameters("browser")
	  public void IPM_Progress_Notes_TC_7(String Browser) throws InterruptedException, AWTException {

		
		

		Thread.sleep(2000);

		 utilobj.selectDropdown(IM_PN.getBedDll(), driver, "Fbed6", Browser);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.invisibilityOf(IM_PN.getupdateprocess()));
	  }
	  @Test(priority = 5)
	  @Parameters("browser")
	 public void IPM_Progress_Notes_TC_4(String Browser) throws InterruptedException {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		Thread.sleep(2000);
		utilobj.selectDropdown(IM_PN.getNotesBy(), driver, "Doctor", Browser);

		Thread.sleep(6000);
		
		  
				String parent4 = driver.getWindowHandle();

				utilobj.Window(driver);
				IM_PN.getObservationBySearchicon().click();
				Thread.sleep(2000);
				utilobj.ChildWindow(driver);
				Thread.sleep(2000);
				
				wait.until(ExpectedConditions.visibilityOf(IM_PN.getObserveByTextBox()));
				
						
				IM_PN.getObserveByTextBox().sendKeys("test");
				Thread.sleep(2000);
				IM_PN.getObserveBySearchButton().click();
				
				wait.until(ExpectedConditions.visibilityOf(IM_PN.getObserveByRadioButton()));
				IM_PN.getObserveByRadioButton().click();
				Thread.sleep(2000);
				IM_PN.getObserveBySelectButton().click();
				Thread.sleep(4000);
				 driver.switchTo().window(parent4);
				 		 Thread.sleep(2000);
	  
				 		IM_PN.getRemarks().sendKeys("test");
	
				 		Thread.sleep(4000);
				 		IM_PN.getSave().click();
				 		 Thread.sleep(2000);
				 		 IM_PN.getSuccessokButton().click();
				 		 Thread.sleep(2000);
				 		
				 		 
	  }
	  @Test(priority = 6)
	  public void IPM_Progress_Notes_TC_5() {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		IM_PN.getViewButton().click();
		wait.until(ExpectedConditions.visibilityOf(IM_PN.getBackButton()));
	    }
	
	@Test(priority = 7)
	public void IPM_Progress_Notes_TC_13() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		IM_PN.getRecordno().click();
		wait.until(ExpectedConditions.visibilityOf(IM_PN.getViewButton()));
		 AdmissionNu=driver.findElement(By.id("ctl00_cphpage_txtAdmissionNo")).getAttribute("value");
 		 System.out.println(AdmissionNu);
 		 Thread.sleep(2000);
		IM_PN.getUpdatebutton().click();
		 Thread.sleep(2000);
 		 IM_PN.getSuccessokButton().click();
 		Thread.sleep(2000);
	}
  @Test(priority = 8)
  public void IPM_Progress_Notes_TC_6() throws InterruptedException {
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	  IM_PN.getAdmissionnosearchicon().click();
	  wait.until(ExpectedConditions.visibilityOf(IM_PN.getAdmissionnotxtbox()));
		Thread.sleep(3000);
		
	
		
		IM_PN.getAdmissionnotxtbox().sendKeys(AdmissionNu);
		Thread.sleep(1000);
		
		IM_PN.getSearch().click();
		Thread.sleep(5000);
		
		IM_PN.getRadiobutton().click();
		Thread.sleep(2000);
		
		IM_PN.getSelect().click();
  }
}


