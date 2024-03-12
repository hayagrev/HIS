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
import com.qa.pages.InpatientManagement_intakeoutputentrypages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class InpatientManagement_IntakeOutputEntryTest extends CrossBrowser {
 
	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_intakeoutputentrypages IMIOE;
	 util utilobj=new util();
      public InpatientManagement_IntakeOutputEntryTest(){
		
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
  	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

  		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), "Female medical ward",Browser);
  	}

  	@Test(priority = 3)
  	public void donavigattoIntakeoutputEntry() {
  		IMIOE=hishomepage.doNavigateTogetIntakeOutputEntryPage();
  	}
	  @Test(priority = 4)
	  public void IPM_Intake_Output_Entry_TC_1() throws InterruptedException, AWTException {

		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getAdmissionNoSearch()));
		Thread.sleep(4000);
		
		//Entering the IP No to search a patient
		
		IMIOE.getAdmissionNoSearch().click();
		
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getIPNoSearchtxtbox()));
		Thread.sleep(3000);
		

		
		IMIOE.getIPNoSearchtxtbox().sendKeys("IP0");
		Thread.sleep(2000);
		
		IMIOE.getSearchbtn().click();//IP111900031
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getRadiobtnselect()));
		Thread.sleep(2000);
		
		
		IMIOE.getRadiobtnselect().click();
		Thread.sleep(2000);
		
		IMIOE.getSelectbtn().click();
		//wait.until(ExpectedConditions.invisibilityOf(IMIOE.getBlackOverLay()));
		Thread.sleep(5000);
		
		//selecting an intake name
		utilobj.JSClick(IMIOE.getIntakeNameSelect(), driver);
		//IntakeNameSelect.click();
		
		
		
		Thread.sleep(4000);
		IMIOE.getintakenametxtbox().sendKeys("Juice");
		Thread.sleep(2000);
		
		IMIOE.getintakeitemsearch().click();
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getIntakeNameradiobtn()));
		Thread.sleep(2000);
		
		IMIOE.getIntakeNameradiobtn().click();
		Thread.sleep(2000);
		
		IMIOE.getSelectbtn1().click();
//		wait.until(ExpectedConditions.invisibilityOf(BlackOverLay));
		Thread.sleep(5000);
		
//		Actions action3= new Actions(driver);
//		action3.moveToElement(Quantity).click().build().perform();
		
		IMIOE.getQuantity().clear();
		Thread.sleep(2000);
		IMIOE.getQuantity().sendKeys("40");
		Thread.sleep(2000);
		
		IMIOE.getSave().click();
//		wait.until(ExpectedConditions.visibilityOf(SuccusMessageOkButton));
		Thread.sleep(4000);
		IMIOE.getSuccusMessageOkButton().click();
	  }
	  @Test(priority = 5)
	  public void IPM_Intake_Output_Entry_TC_2() throws InterruptedException {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rdIntakeOuput_1")).click();//output entry
		Thread.sleep(4000);
		//input[@id='ctl00_cphpage_imgbtnSearchAdmissionNo']
		IMIOE.getAdmissionNoSearch().click();
		
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getIPNoSearchtxtbox()));
		Thread.sleep(3000);
		

		
		IMIOE.getIPNoSearchtxtbox().sendKeys("IP0");
		Thread.sleep(2000);
		
		IMIOE.getSearchbtn().click();//IP111900031
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getRadiobtnselect()));
		Thread.sleep(2000);
		
		
		IMIOE.getRadiobtnselect().click();
		Thread.sleep(2000);
		
		IMIOE.getSelectbtn().click();
//		wait.until(ExpectedConditions.invisibilityOf(BlackOverLay));
		Thread.sleep(5000);

		
		IMIOE.getIntakeNameSelect().click();
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getintakenametxtbox()));
		Thread.sleep(2000);
		
		
		IMIOE.getintakenametxtbox().sendKeys("Vomit");
		Thread.sleep(2000);
		
		IMIOE.getintakeitemsearch().click();
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getIntakeNameradiobtn()));
		Thread.sleep(2000);
		
		IMIOE.getIntakeNameradiobtn().click();
		Thread.sleep(2000);
		
		IMIOE.getSelectbtn1().click();
//		wait.until(ExpectedConditions.invisibilityOf(BlackOverLay));
		Thread.sleep(4000);		
		IMIOE.getQuantity().clear();
		Thread.sleep(2000);
		IMIOE.getQuantity().sendKeys("40");
		Thread.sleep(2000);
		
		IMIOE.getSave().click();
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getSuccusMessageOkButton()));
		Thread.sleep(2000);
		IMIOE.getSuccusMessageOkButton().click();
		Thread.sleep(2000);
	  }
	  @Test(priority = 6)
	  public void IPM_Intake_Output_Entry_TC_3() throws InterruptedException {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		IMIOE.getview().click();
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getbackButton()));
		Thread.sleep(2000);
	  }
	  @Test(priority = 7)
	  public void IPM_Intake_Output_Entry_TC_8() throws InterruptedException {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		IMIOE.getRecordNo().click();
		Thread.sleep(2000);
		IMIOE.getSave().click();
		wait.until(ExpectedConditions.visibilityOf(IMIOE.getSuccusMessageOkButton()));
		Thread.sleep(2000);
		IMIOE.getSuccusMessageOkButton().click();
		
	    }
	
	
	
}
