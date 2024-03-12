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

public class PrevantingHealthCheckUpTest2 extends CrossBrowser {
	public PrevantingHealthCheckUpTest2() {
		
	}
	 util utilobj = new util();
		Loginpage loginpage;
		HomePage homepage;
		SelectHospitalLocationPage selecthospitallocationpage;
		HISHomePage hishomepage;
		PrevantingHealthCheckUpPage PHCU;
		String Getmessage;
		String CheckInNumber;
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
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
			wait.until(ExpectedConditions.visibilityOf(PHCU.getESICPensionerRadioButton()));
			PHCU.getIPNumberRadioButton().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getTxtIPNO()));
			PHCU.getTxtIPNO().sendKeys("1199900090");
			wait.until(ExpectedConditions.visibilityOf(PHCU.getLnkbtnIPNo()));
			PHCU.getLnkbtnIPNo().click();
			wait.until(ExpectedConditions.invisibilityOf(PHCU.getprogressImage()));
			PHCU.getHisLiveListControlchkUHID().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getHisLiveListControlbtnSelect()));
			PHCU.getHisLiveListControlbtnSelect().click();
			wait.until(ExpectedConditions.invisibilityOf(PHCU.getprogressImage()));
			Thread.sleep(2000);
			utilobj.selectDropdown(PHCU.getDdlSpecialisation(), driver, "Preventive Heath Check-up Clinic", Browser);
			Thread.sleep(2000);
			PHCU.getBtnOK().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getservicedeletebutton()));
			PHCU.getBtnSaveDisplay().click();
			wait.until(ExpectedConditions.visibilityOf(PHCU.getWarningMessageText()));
			Getmessage=PHCU.getWarningMessageText().getText();
			System.out.println(Getmessage);
			CheckInNumber=utilobj.GetCheckinNumberText(PHCU.getWarningMessageText(), driver);
			System.out.println(CheckInNumber);
			
			
		}
		@Test(priority = 5)
		@Parameters("browser")
		public void Annual_Preventive_Check_up_Validation_TC_06(String Browser) throws InterruptedException {
			
			Thread.sleep(2000);
			PHCU.getBtncancel().click();
			Thread.sleep(2000);
			utilobj.MoveElement(PHCU.getClinicalRecord(), driver);
			PHCU.getDoctorWorkList().click();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
			wait.until(ExpectedConditions.visibilityOf(PHCU.getCheckInNumberTextBox()));
			boolean presenseofInformation=PHCU.getInformationmessageOkButton().isDisplayed();
			System.out.println(presenseofInformation);
			Thread.sleep(2000);
			if(presenseofInformation==true) {
				PHCU.getInformationmessageOkButton().click();
			}
			else {
				utilobj.MoveElement(PHCU.getClinicalRecord(), driver);
				PHCU.getDoctorWorkList().click();
				wait.until(ExpectedConditions.visibilityOf(PHCU.getCheckInNumberTextBox()));
			}
			
			PHCU.getCheckInNumberTextBox().sendKeys(CheckInNumber); 
			Thread.sleep(2000);
			PHCU.getCheckInNumberImageSearch().click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(PHCU.getOpencasesheetButton()));
			PHCU.getOpencasesheetButton().click();
			Thread.sleep(1000);
			PHCU.getinformation_popup_ok().click();
			/*
			 * ArrayList<String> al=new ArrayList<String>(); for(int i=0;i<=25;i++) { String
			 * templatelinkName=driver.findElement(By.id("ctl00_cphpage_trvSectionst"+i)).
			 * getText(); System.out.println(templatelinkName); al.add(templatelinkName); }
			 * System.out.println(al.size()); int size=al.size(); assertEquals(size,27);
			 */
			
		}
		@Test(priority = 6)
		@Parameters("browser")
		public void Annual_Preventive_Check_up_Validation_TC_07(String Browser) throws InterruptedException {
			String templatename= PHCU.getTemplateDll().getText();
			System.out.println("selected template is:-"+templatename+"hello");
			int lenth=templatename.length();
			assertEquals(lenth, 40);
		}
			
	//	you need db connection for delete the Used IP for APHCUP from The database
		//connection the database 
		//execute the delete Query 
		// closed the Database
		//Template check In 
		

		
		}
