package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_bedsideproceduresorderpages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class InpatientManagement_BedsideProceduresOrderTest extends CrossBrowser {
      

	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_bedsideproceduresorderpages IPMBSP;
    public InpatientManagement_BedsideProceduresOrderTest(){
		
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
	@Test(priority =3)
 	public void doPrimarydoctorChangetest() {

		IPMBSP = hishomepage.donavigatetoBedSideProcedureOrdertest();	
 	}
	  @Test(priority = 4)
	  @Parameters("browser")
	  public void IPM_Bedside_Procedures_Order_TC_3(String Browser) throws InterruptedException, AWTException {

		
		 IPMBSP. getSearchAdmission().click();
		 Thread.sleep(2000);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
			wait.until(ExpectedConditions.visibilityOf(IPMBSP.getPatientNameIP()));
		 
//			Actions ac=new Actions(driver);
//			ac.moveToElement(IPMBSP.getDropDown()).click().moveToElement(IPMBSP.getDropdownclauseValue()).click().build().perform();
			
//			Thread.sleep(2000);
			utilobj.selectDropdown(IPMBSP.getDropDown(), driver, "Contains", Browser);
//			Thread.sleep(2000);
			//Searching the patient
			IPMBSP.getPatientNameIP().sendKeys("IP0");
			Thread.sleep(1000);
			
			IPMBSP.getSearchBtn().click();
			
			wait.until(ExpectedConditions.invisibilityOf(IPMBSP.getprocessImage()));
			//Selecting the patient 
			IPMBSP.getRadiobtnselect().click();
			Thread.sleep(1000);
			
			IPMBSP.getSelect().click();
		
			wait.until(ExpectedConditions.invisibilityOf(IPMBSP.getSelect()));
			//Selecting the date of bedside procedures
			Thread.sleep(1000);
	  }
	  @Test(priority = 5)
	  public void IPM_Bedside_Procedures_Order_TC_1() throws InterruptedException {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
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
			
			IPMBSP.getDateselect().clear();
			IPMBSP.getDateselect().click();
			IPMBSP.getDateselect().sendKeys(newDate);
			Thread.sleep(1000);
			IPMBSP.getDateselect().sendKeys(Keys.TAB);
			
			//Selecting the bedside procedure
			IPMBSP.getProcedureSearch().click();
			Thread.sleep(2000);
			
			
		
			IPMBSP.getProcedureName().sendKeys("Catheterisation Procedure");
			Thread.sleep(2000);
			
			IPMBSP.getProcedureBtnSearch().click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(IPMBSP.getRadiobtnselect1()));
			//Selecting the procedure
			IPMBSP.getRadiobtnselect1().click();
			Thread.sleep(1000);
		
			IPMBSP.getSelect1().click();
	
			Thread.sleep(4000);
				driver.findElement(By.id("ctl00_cphpage_btnSave")).click();;//save
			//Save.click();
			wait.until(ExpectedConditions.visibilityOf(IPMBSP.getSuccessMessageOkButton()));
			Thread.sleep(1000);
			IPMBSP.getSuccessMessageOkButton().click();
			
		
	    }
	
	
	}

