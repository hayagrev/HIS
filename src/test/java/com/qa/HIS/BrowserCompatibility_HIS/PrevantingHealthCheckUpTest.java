package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PrevantingHealthCheckUpPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class PrevantingHealthCheckUpTest extends CrossBrowser {
	public PrevantingHealthCheckUpTest() {
		
	}
	 util utilobj = new util();
		Loginpage loginpage;
		HomePage homepage;
		SelectHospitalLocationPage selecthospitallocationpage;
		HISHomePage hishomepage;
		PrevantingHealthCheckUpPage PHCU;
		String Getmessage;
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

	   		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
	   	}
	   	@Test(priority =3)
		public void doNavigateToPatientCheckInTest() {

	   		PHCU = hishomepage.doNavigateToPatientCheckInforPHCU();
		}
		@Test(priority = 4)
		@Parameters("browser")
		//check the Functionality of ESIC Pensioner
		public void Annual_Preventive_Check_up_Validation_TC_05(String Browser) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
			wait.until(ExpectedConditions.visibilityOf(PHCU.getESICPensionerRadioButton()));
			PHCU.getESICPensionerRadioButton().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getTxtIPNO()));
			PHCU.getTxtIPNO().sendKeys("116223");
			wait.until(ExpectedConditions.visibilityOf(PHCU.getLnkbtnIPNo()));
			PHCU.getLnkbtnIPNo().click();
			wait.until(ExpectedConditions.invisibilityOf(PHCU.getprogressImage()));
			PHCU.gethisLiveListControlchkUHID2Link().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getHisLiveListControlbtnSelect()));
			PHCU.getHisLiveListControlbtnSelect().click();
			wait.until(ExpectedConditions.invisibilityOf(PHCU.getprogressImage()));
			Thread.sleep(2000);
			utilobj.selectDropdown(PHCU.getDdlSpecialisation(), driver, "Preventive Heath Check-up Clinic", Browser);
			Thread.sleep(2000);
			PHCU.getBtnOK().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getWarningMessageText()));
			Getmessage=PHCU.getWarningMessageText().getText();
			System.out.println(Getmessage);
			assertEquals(Getmessage, "Only IP/IW are eligible for this specialisation.");
		}
		@Test(priority = 5)
		@Parameters("browser")
		//check the Functionality for ESIC Employee
		public void Annual_Preventive_Check_up_Validation_TC_06(String Browser) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
			wait.until(ExpectedConditions.visibilityOf(PHCU.getESICEmployeeRadioButton()));
			PHCU.getinformation_popup_ok().click();
			Thread.sleep(2000);
			PHCU.getESICEmployeeRadioButton().click();
			Thread.sleep(2000);
			PHCU.getTxtIPNO().clear();
			Thread.sleep(2000);
			PHCU.getTxtIPNO().sendKeys("112100");
			wait.until(ExpectedConditions.visibilityOf(PHCU.getLnkbtnIPNo()));
			PHCU.getLnkbtnIPNo().click();
			wait.until(ExpectedConditions.invisibilityOf(PHCU.getprogressImage()));
			PHCU.gethisLiveListControlchkUHID2Link().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getHisLiveListControlbtnSelect()));
			PHCU.getHisLiveListControlbtnSelect().click();
			//utilobj.selectDropdown(PHCU.getDdlSpecialisation(), driver, "Preventive Heath Check-up Clinic", Browser);
			Thread.sleep(2000);
			PHCU.getBtnOK().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getWarningMessageText()));
			Getmessage=PHCU.getWarningMessageText().getText();
			System.out.println(Getmessage);
			assertEquals(Getmessage, "Only IP/IW are eligible for this specialisation.");
		}
		
		@Test(priority = 6)
		@Parameters("browser")
		public void Annual_Preventive_Check_up_Validation_TC_07(String Browser) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
			wait.until(ExpectedConditions.visibilityOf(PHCU.getESICEmployeeRadioButton()));
			PHCU.getinformation_popup_ok().click();
			Thread.sleep(2000);
			PHCU.getIPNumberRadioButton().click();
			Thread.sleep(2000);
			PHCU.getTxtIPNO().clear();
			Thread.sleep(2000);
			PHCU.getTxtIPNO().sendKeys("1100099900");
			wait.until(ExpectedConditions.visibilityOf(PHCU.getLnkbtnIPNo()));
			PHCU.getLnkbtnIPNo().click();
			wait.until(ExpectedConditions.invisibilityOf(PHCU.getprogressImage()));
			PHCU.getdepandentRadiobutton().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getHisLiveListControlbtnSelect()));
			PHCU.getHisLiveListControlbtnSelect().click();
			wait.until(ExpectedConditions.invisibilityOf(PHCU.getprogressImage()));
			Thread.sleep(2000);
			PHCU.getBtnOK().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getWarningMessageText()));
			Getmessage=PHCU.getWarningMessageText().getText();
			System.out.println(Getmessage);
			assertEquals(Getmessage, "Only IP/IW are eligible for this specialisation.");	
		}
		
		}
