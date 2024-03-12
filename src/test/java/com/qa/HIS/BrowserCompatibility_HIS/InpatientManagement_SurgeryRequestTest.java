package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_surgeryrequestpages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class InpatientManagement_SurgeryRequestTest extends CrossBrowser {
  
	
	
	  
    public InpatientManagement_SurgeryRequestTest(){
		
	   }
    util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_surgeryrequestpages IMSR;
	
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
   	@Test(priority =3)
 	public void doNavigateToSpecialityProcedure() throws InterruptedException {

   		IMSR = hishomepage.donavigatetoSurgeryRequest();
 	}
	  @Test(priority = 4)
	  public void IPM_Surgery_Request_TC_1() throws InterruptedException, AWTException {

		
		 
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		
		IMSR.getAdmissionnosearchicon().click();
		wait.until(ExpectedConditions.visibilityOf(IMSR.getDropdown()));
		Thread.sleep(2000);
		
		Select select=new Select(IMSR.getDropdown());
		select.selectByVisibleText("Contains");
		Thread.sleep(1000);
		
		IMSR.getBednametxtbox().sendKeys("Fbed6");
		
		Thread.sleep(1000);
		
		IMSR.getSearch().click();
		wait.until(ExpectedConditions.visibilityOf(IMSR.getRadiobtn()));
		Thread.sleep(4000);
		
		IMSR.getRadiobtn().click();
		Thread.sleep(1000);
		
		IMSR.getSelect().click();
		Thread.sleep(4000);
		
	     //Selecting the date of surgery	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		//Getting current date
		Calendar cal = Calendar.getInstance();
		//Displaying current date in the desired format
		System.out.println("Current Date: "+sdf.format(cal.getTime()));
		   
		//Number of Days to add
	    cal.add(Calendar.DAY_OF_MONTH, 1);  
		//Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());  
		//Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+newDate);   
		
		Thread.sleep(2000);
		IMSR.getDateselect().clear();
		Thread.sleep(2000);
		IMSR.getDateselect().sendKeys(newDate);
		Thread.sleep(2000);
		
		IMSR.getSearchProcedure().click();
		Thread.sleep(1000);
		
		//Selecting the surgery
		Select select1=new Select(IMSR.getDropdown2());
		select1.selectByVisibleText("Contains");
		Thread.sleep(1000);
		
		IMSR.getSurgeryNametxtbox().sendKeys("app");
		Thread.sleep(1000);
		
		
		IMSR.getSearch1().click();
		Thread.sleep(5000);
		
		IMSR.getRadiobtn1().click();
		Thread.sleep(1000);
		
		IMSR.getSelect1().click();
		Thread.sleep(2000);
		
		IMSR.getcheckbox().click();
		Thread.sleep(1000);
		
		
		IMSR.getSave().click();
		Thread.sleep(4000);
		
	    Robot robot= new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
		
	    }
	
	
	
}


