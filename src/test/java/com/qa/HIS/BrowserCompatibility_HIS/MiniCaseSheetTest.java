package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MiniCaseSheetPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class MiniCaseSheetTest extends CrossBrowser{
	 
		util utilobj=new util();
		 public MiniCaseSheetTest() {
			// TODO Auto-generated constructor stub
		}
			
		
		Loginpage loginpage;
		HomePage homepage;
		SelectHospitalLocationPage selecthospitallocationpage;
		HISHomePage hishomepage;
		BedStatusPage bedstatuspage;
		 String txtcheckInNumber;
		MiniCaseSheetPages minicasesheetpages;
		//private WebDriver driver=null;
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
		@Test(priority = 3)
		@Parameters("browser")
		public void donavigateToPatientCheckIn(String Browser) throws InterruptedException
		{
			minicasesheetpages=hishomepage.doNavigateToPatientCheckInForMinicasesheet();
			//minicasesheetpages.GoToPatient_check_in(prop.getProperty("Staging_IPNumber2"));
			Thread.sleep(2000);
			minicasesheetpages.getpatientcheck_in_ip_txtboxLink().sendKeys(prop.getProperty("IPnumber2"));
			Thread.sleep(2000);
			minicasesheetpages.getpatientcheck_in_LiveList_linkLink().click();
			Thread.sleep(2000);
			minicasesheetpages.getpationcheck_in_Livelist_select_UHIDradiobuttonLink().click();
			Thread.sleep(2000);
			minicasesheetpages.getpatientcheck_in_Livelist_SelectbuttonLink().click();
			Thread.sleep(2000);
			utilobj.selectDropdown(minicasesheetpages.getpatientcheckin_registration_selectddlLink(), driver, "General Medicine", Browser);
			Thread.sleep(2000);
			minicasesheetpages.getpatientcheck_in_registration_okbuttonLink().click();
			
			Thread.sleep(2000);
			minicasesheetpages.getpatientcheck_in_registration_savebuttonLink().click();
			
			Thread.sleep(2000);
			
			System.out.println(minicasesheetpages.getPopupmessage().getText());
			Thread.sleep(2000);
			System.out.println(utilobj.GetCheckinNumberText(minicasesheetpages.getPopupmessage(), driver));
			Thread.sleep(2000);
			 txtcheckInNumber  = utilobj.GetCheckinNumberText(minicasesheetpages.getPopupmessage(), driver);
			 Thread.sleep(2000);
			utilobj.JSClick(minicasesheetpages.getpopcencelbuttonLink(), driver);
			
			
			
		}
		@Test(priority = 4)
		public void CLM_Mini_Standard_Casesheet_5() throws InterruptedException {
			Thread.sleep(3000);
			minicasesheetpages=hishomepage.doNavigateToDoctorWorklistLinkforMiniCaseSheet();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_txtCheckinno")).sendKeys(txtcheckInNumber);
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_imgCheckinno")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_btnCMiniCS")).click();
		}
		@Test(priority = 5)
		@Parameters("browser")
		public void CLM_Mini_Standard_Casesheet_6(String Browser) throws InterruptedException {//save
			
			Thread.sleep(2000);
			//minicasesheetpages.getMiniCaseSheetOpenLink().click();//open minicase sheet
			minicasesheetpages.getminicasesheetcmplatetxt_boxLink().sendKeys("abu");//add complain
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheetcmplain_autoserchLink().click();
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheetcmplain_remark_explanationsLink().sendKeys("abuse......");///give remarks
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_addcomplainbuttonlink().click();//add complin
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_othercomplainlink().sendKeys(".......Abuse........");//add other complain
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_pallor_chkbox_yesLink().click();//select pallor checkbox
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_pallor_remark_txtboxLink().sendKeys("pallorrrr...");
			minicasesheetpages.getminicasesheet_caynosis_chkbox_yesLink().click();//select caynosis
			minicasesheetpages.getminicasesheet_cynosis_remark_txtboxLink().sendKeys(".........cynosis......");
			minicasesheetpages.getminicasesheet_icterus_chkbox_yesLink().click();//select iceterus
			minicasesheetpages.getminicasesheet_iceterus_remark_txtboxLink().sendKeys("...icetrus....");
			minicasesheetpages.getminicasesheet_clubing_chkbox_yesLink().click();//select clubing
			minicasesheetpages.getminicasesheet_clubing_remark_txtboxLink().sendKeys("....clubing...");
			minicasesheetpages.getminicasesheet_scinchanges_radiobuttonLink().click();
			minicasesheetpages.getminicasesheet_naturetxtboxLink().sendKeys(".....nature.....");
			minicasesheetpages.getminicasesheet_hydration_status_radiobutton_normalLink().click();
			minicasesheetpages.getminicasesheet_RemarksHydrationStatustxtLink().sendKeys(".....hydration normal...");
			minicasesheetpages.getminicasesheet_heighttxtboxLink().sendKeys("4");
			minicasesheetpages.getminicasesheet_weighttxtboxLink().sendKeys("72");
			minicasesheetpages.getminicasesheet_LymphadenopathyradiobuttonLink().click();
			minicasesheetpages.getminicasesheet_radPedalOedemaradiobuttonLink().click();
			minicasesheetpages.getminicasesheet_PulsextboxLink().sendKeys("72");
			minicasesheetpages.getminicasesheet_RhythmradiobuttonLink().click();
			minicasesheetpages.getminicasesheet_RespirationtxtboxLink().sendKeys("50");
			minicasesheetpages.getminicasesheet_BPtxtboxLink().sendKeys("70 to 120");
			minicasesheetpages.getminicasesheet_JVPradioboxLink().click();
			minicasesheetpages.getminicasesheet_ThyroidtxtboxLink().sendKeys("NO");
			minicasesheetpages.getminicasesheet_SNOMED_searchLink().sendKeys("abu");
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_SNOMED_search_selectAbscessLink().click();
			Thread.sleep(2000);
			//driver.findElement(By.id("ctl00_cphpage_txtICDDiagnosis")).sendKeys("Snapped cord");
			//Thread.sleep(2000);
//			Select select=new Select(minicasesheetpages.getminicasesheet_selectTypeddlLink());
//			select.selectByVisibleText("Provisional Diagnosis");
			utilobj.selectDropdown(minicasesheetpages.getminicasesheet_selectTypeddlLink(), driver, "Provisional Diagnosis", Browser);
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_ODDiagnosissearchboxLink().sendKeys("biological");
			Thread.sleep(4000);
			minicasesheetpages.getminicasesheet_ODDiagnosisselectdiseasesLink().click();
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_ADDButtonLink().click();

			Thread.sleep(2000);
			//driver.findElement(By.id("popup_ok")).click();
			minicasesheetpages.getminicasesheet_DiscriptionLink().sendKeys("......TestDescription......");
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_BUTTONSaveLink().click();
			Thread.sleep(2000);
			

			
				}
		@Test(priority = 6)
		public void CLM_Mini_Standard_Casesheet_7() throws InterruptedException {//prescription
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
			wait.until(ExpectedConditions.visibilityOf(minicasesheetpages.getminicasesheet_SaveSuccus_OK_Button()));
			utilobj.JSClick(minicasesheetpages.getminicasesheet_SaveSuccus_OK_Button(), driver);
			
			Thread.sleep(2000);
			
			
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			minicasesheetpages.getminicasesheet_Prescription_FUPButton().click();

			Thread.sleep(2000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);

			wait.until(ExpectedConditions.visibilityOf(minicasesheetpages.gettxtOrdPackSearch()));
			System.out.println(driver.getTitle());
			Thread.sleep(10000);
			utilobj.JSEnterText(minicasesheetpages.gettxtOrdPackSearch(), driver, "Automation");
			Thread.sleep(2000);

			utilobj.JSClick(minicasesheetpages.getclickorderpackbutton(), driver);
			

			
			Thread.sleep(5000);

			utilobj.JSClick(minicasesheetpages.getorderpackselection(), driver);

			Thread.sleep(5000);

			utilobj.JSClick(minicasesheetpages.getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);
			 driver.switchTo().alert().accept();
				driver.switchTo().window(parent3);
				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
			
		}
	   @Test(priority = 7)
	   public void CLM_Mini_Standard_Casesheet_8() throws InterruptedException {//Investigation
		  
		
			Thread.sleep(2000);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			minicasesheetpages.getminicasesheet_InvestigationButton().click();

			Thread.sleep(2000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);

			wait.until(ExpectedConditions.visibilityOf(minicasesheetpages.getminicasesheet_Investigationtxtbox()));
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(minicasesheetpages.getminicasesheet_Investigationtxtbox(), driver, "chestXray");
			Thread.sleep(2000);

			utilobj.JSClick(minicasesheetpages.getminicasesheet_InvestigationSearchButton(), driver);
			

			
			Thread.sleep(5000);

			utilobj.JSClick(minicasesheetpages.getminicasesheet_InvestigationValue(), driver);

			Thread.sleep(5000);
			minicasesheetpages.getminicasesheet_InvestigationOKButton().click();
			Thread.sleep(2000);
			utilobj.JSClick(minicasesheetpages.getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();
			driver.switchTo().window(parent3);

			driver.switchTo().defaultContent();

	   }
	   @Test(priority =8)
	   @Parameters("browser")
	   public void CLM_Mini_Standard_Casesheet_9(String Browser) throws InterruptedException {//medication
		   Thread.sleep(2000);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			minicasesheetpages.getminicasesheet_MedicationButton().click();

			Thread.sleep(2000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);

			wait.until(ExpectedConditions.visibilityOf(minicasesheetpages.getminicasesheet_Investigationtxtbox()));
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(minicasesheetpages.getminicasesheet_Investigationtxtbox(), driver, "paracetamol Tab. 500mg.");
			Thread.sleep(2000);

			utilobj.JSClick(minicasesheetpages.getminicasesheet_MedicationDrugSerchButton(), driver);
			

			
			Thread.sleep(5000);

			utilobj.JSClick(minicasesheetpages.getminicasesheet_MedicationDrugValue(), driver);

			Thread.sleep(5000);
			minicasesheetpages.getminicasesheet_MedicationDrugDose().clear();
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_MedicationDrugDose().sendKeys("1");	
			Thread.sleep(2000);
			utilobj.selectDropdown(minicasesheetpages.getminicasesheet_MedicationDrugDoseDLL(), driver, "Tablet(s)", Browser);
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_MedicationDuratiionTextBox().sendKeys("1");
			Thread.sleep(2000);
			utilobj.selectDropdown(minicasesheetpages.getminicasesheet_MedicationFrequencyDLL(), driver, "1X - Once", Browser);
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_MedicationQuantityTextBox().sendKeys("1");
			Thread.sleep(2000);
			utilobj.selectDropdown(minicasesheetpages.getminicasesheet_MedicationQuantityUOMDll(), driver, "Tablet(s)", Browser);
			Thread.sleep(2000);
			utilobj.selectDropdown(minicasesheetpages.getminicasesheet_MedicationRouteOfAdmin(), driver, "ORAL / BY MOUTH", Browser);
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_InvestigationOKButton().click();
			Thread.sleep(2000);
			utilobj.JSClick(minicasesheetpages.getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			driver.findElement(By.id("btnIClose")).click();
			driver.switchTo().window(parent3);

			driver.switchTo().defaultContent();
	   }
	   @Test(priority = 9)
	   public void CLM_Mini_Standard_Casesheet_10() throws InterruptedException {
		   Thread.sleep(2000);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);
			minicasesheetpages.getminicasesheet_HealthInterventionButton().click();
			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(minicasesheetpages.getminicasesheet_Investigationtxtbox()));
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_Investigationtxtbox().sendKeys("ECG");
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_HealthIntervention_HealthInterventionButton().click();
			Thread.sleep(2000);
			minicasesheetpages.getminicasesheet_HealthIntervention_value().click();
			Thread.sleep(2000);
			utilobj.JSClick(minicasesheetpages.getbtnISaveClose(), driver);
			Thread.sleep(2000);
			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();
			driver.switchTo().window(parent3);

			driver.switchTo().defaultContent();
	   }
	   
@Test(priority = 10)
@Parameters("browser")
public void CLM_Mini_Standard_Casesheet_11(String Browser) throws InterruptedException{
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
	String parent3 = driver.getWindowHandle();

	utilobj.Window(driver);

	minicasesheetpages.getminicasesheet_ButtonAdvice().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(minicasesheetpages.getminicasesheet_AdviceRefferlRadioButton()));
	Thread.sleep(2000);

	minicasesheetpages.getminicasesheet_AdviceRefferlRadioButton().click();
	Thread.sleep(2000);
	utilobj.selectDropdown(minicasesheetpages.getminicasesheet_AdviceSpecialLization(), driver, "General Medicine", Browser);
	Thread.sleep(2000);
	minicasesheetpages.getminicasesheet_AdviceAddbutton().click();
	
	Thread.sleep(2000);
	utilobj.JSClick(driver.findElement(By.id("btnSaveClose")), driver);
	Thread.sleep(2000);
//	utilobj.waitForalert(driver);
//
//	driver.switchTo().alert().accept();
	driver.switchTo().window(parent3);

	driver.switchTo().defaultContent();
	
}
@Test(priority = 11)
public void CLM_Mini_Standard_Casesheet_15() throws InterruptedException{
	Thread.sleep(2000);
	String parent3 = driver.getWindowHandle();
	
	utilobj.Window(driver);
	minicasesheetpages.getminicasesheet_PrintButton().click();
	Thread.sleep(10000);	
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
	wait.until(ExpectedConditions.visibilityOf(minicasesheetpages.getminicasesheet_PrintButtonInprintWindow()));
	Thread.sleep(2000);	
	//driver.close();
	driver.switchTo().window(parent3);
	driver.switchTo().defaultContent();
}
@Test(priority = 12)
public void CLM_Mini_Standard_Casesheet_17() throws InterruptedException{
	Thread.sleep(2000);	
	minicasesheetpages.getminicasesheet_BackButton().click();
	Thread.sleep(2000);	
}



	}



