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
import com.qa.pages.Inpatient_EmergencyPatientpages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class InpatientEmergencyPatientTest extends CrossBrowser {
public	InpatientEmergencyPatientTest() {
	
}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	Inpatient_EmergencyPatientpages IPEP;
	
	util utilobj = new util();
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
	public void CLM_Inpatients_Emergency_Patients_TC_3() throws InterruptedException {
		
		IPEP=hishomepage.doNavigateInpatientsEmergencyPatients();
		Thread.sleep(5000);
		IPEP.getInpatient_Emergencypatient_Medicine_pluselink().click();
		Thread.sleep(5000);	
		IPEP.getInpatient_Emergencypatient_Medicine_minusLink().click();
		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_EmergencyUnit_pluseLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_EmergencyUnit_MinusLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_IcuUnit_PluseLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_IcuUnit_MinusLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_CasualityUnit_PluseLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_CasualityUnit_MinusLink().click();
//		Thread.sleep(5000);		
//		IPEP.getInpatient_Emergencypatient_SurgeryUnit_PluseLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_SurgeryUnit_MinusLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_ENTUnit_PluseLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_ENTUnit_MinusLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_TestingUnit_PluseLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_TestingUnit_MinusLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_l1dcUnit_pluseLink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_l1dcUnit_MinusLink().click();
//		Thread.sleep(5000);
//		
//		IPEP.getInpatient_Emergencypatient_GenralUnit_pluselink().click();
//		Thread.sleep(5000);
//		IPEP.getInpatient_Emergencypatient_GenralUnit_Minuslink().click();
//		Thread.sleep(5000);
		
		
		IPEP.getInpatient_Emergencypatient_Medicine_pluselink().click();
		Thread.sleep(5000);
		IPEP.getInpatient_Emergencypatient_Medicine_bed02imgclickLink().click();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_back_buttonLink()));
		
		Thread.sleep(2000);
		driver.findElement(By.id("popup_ok")).click();
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_Medicine_pluselink()));
	}
	@Test(priority = 4)
	public void  CLM_Inpatients_Emergency_Patients_TC_4() throws InterruptedException{
		Thread.sleep(5000);
		IPEP=hishomepage.doNavigateInpatientsEmergencyPatients();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_txtCriteria")));
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_txtCriteria")).sendKeys("1199900090");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
		wait.until(ExpectedConditions.invisibilityOf(IPEP.getBlackOverlay()));
		
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
       // wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_back_buttonLink()));
//		IPEP.getInpatient_Emergencypatient_ipcasesheet_back_buttonLink().click();
        wait.until(ExpectedConditions.invisibilityOf(IPEP.getBlackOverlay()));
		
	}
	
	@Test(priority = 5)
	public void  CLM_Inpatients_Emergency_Patients_TC_7() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(60000);	
		if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
//			wait.until(ExpectedConditions.visibilityOf(IPEP.CasesheetpopupOKbuton()));
			Thread.sleep(2000);
			//IPEP.CasesheetpopupOKbuton().click();
			Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_ChiefComplain().click();
		Thread.sleep(2000);	
		utilobj.ChildWindow(driver);
		
		
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplainTextBox()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplainTextBox().sendKeys("Tenement");
		wait.until(ExpectedConditions.visibilityOf(IPEP.Inpatient_Emergencypatient_ipcasesheet_ChiefComplainVlaue()));
		IPEP.Inpatient_Emergencypatient_ipcasesheet_ChiefComplainVlaue().click();
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_ChiefComplainAddButton().click();
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_ChiefComplainSubmitButon().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
	}
	@Test(priority = 6)
	public void  CLM_Inpatients_Emergency_Patients_TC_8() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(60000);	
		if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
		//wait.until(ExpectedConditions.visibilityOf(IPEP.CasesheetpopupOKbuton()));
		Thread.sleep(2000);
		//IPEP.CasesheetpopupOKbuton().click();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllness().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		
		wait.until(ExpectedConditions.visibilityOf(IPEP.Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessTextBox()));
		IPEP.Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessTextBox().sendKeys("test present Illness");
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessSaveButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 7)
	public void  CLM_Inpatients_Emergency_Patients_TC_9() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(60000);	
		if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
		//wait.until(ExpectedConditions.visibilityOf(IPEP.CasesheetpopupOKbuton()));
		Thread.sleep(2000);
		//IPEP.CasesheetpopupOKbuton().click();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_PastHistory().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		
		wait.until(ExpectedConditions.visibilityOf(IPEP.Inpatient_Emergencypatient_ipcasesheet_PastHistoryTextBox()));
		IPEP.Inpatient_Emergencypatient_ipcasesheet_PastHistoryTextBox().sendKeys("test past History");
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_PastHistorysaveButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 8)
	public void  CLM_Inpatients_Emergency_Patients_TC_10() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		Thread.sleep(60000);	
		if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
		//wait.until(ExpectedConditions.visibilityOf(IPEP.CasesheetpopupOKbuton()));
		Thread.sleep(2000);
	//	IPEP.CasesheetpopupOKbuton().click();
		Thread.sleep(2000);	
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_GenralExamination().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		
		wait.until(ExpectedConditions.visibilityOf(IPEP.Inpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorRadioButton()));
		IPEP.Inpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorRadioButton().click();
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorSaveButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 9)
	public void  CLM_Inpatients_Emergency_Patients_TC_11() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(60000);	
		if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
		
		//wait.until(ExpectedConditions.visibilityOf(IPEP.CasesheetpopupOKbuton()));
		Thread.sleep(2000);
		//IPEP.CasesheetpopupOKbuton().click();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_SystemincExamination().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		
		wait.until(ExpectedConditions.visibilityOf(IPEP.Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem()));
		IPEP.Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem().sendKeys("test Respiratory System");
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystemSave().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 10)
	public void  CLM_Inpatients_Emergency_Patients_TC_12() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(60000);	
		if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
		//wait.until(ExpectedConditions.visibilityOf(IPEP.CasesheetpopupOKbuton()));
		Thread.sleep(2000);
		//IPEP.CasesheetpopupOKbuton().click();
		Thread.sleep(2000);	
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExamination().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		
		wait.until(ExpectedConditions.visibilityOf(IPEP.Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleTextBox()));
		IPEP.Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleTextBox().sendKeys("Muscle Test");
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleSaveButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 11)
	@Parameters("browser")
	public void  CLM_Inpatients_Emergency_Patients_TC_13(String Browser) throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(60000);	
		Thread.sleep(2000);	
		if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
		//wait.until(ExpectedConditions.visibilityOf(IPEP.CasesheetpopupOKbuton()));
		Thread.sleep(2000);
		//IPEP.CasesheetpopupOKbuton().click();
		Thread.sleep(2000);	
		
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_Diagnos().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
	
		wait.until(ExpectedConditions.visibilityOf(IPEP.Inpatient_Emergencypatient_ipcasesheet_DiagnosSerchTextBox()));
		IPEP.Inpatient_Emergencypatient_ipcasesheet_DiagnosSerchTextBox().sendKeys("Chest");
		wait.until(ExpectedConditions.visibilityOf(IPEP.Inpatient_Emergencypatient_ipcasesheet_DiagnosVlaue()));
		IPEP.Inpatient_Emergencypatient_ipcasesheet_DiagnosVlaue().click();
		Thread.sleep(5000);
		utilobj.selectDropdown(IPEP.Inpatient_Emergencypatient_ipcasesheet_DiagnosTypeDdl(), driver, "Provisional Diagnosis", Browser);
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_DiagnosADDbutton().click();
		Thread.sleep(2000);
		IPEP.Inpatient_Emergencypatient_ipcasesheet_DiagnosSaveButton().click();
		Thread.sleep(2000);
		utilobj.waitForalert(driver);
		
		driver.switchTo().alert().accept();
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
	}
	@Test(priority = 12)
	
	public void  CLM_Inpatients_Emergency_Patients_TC_14() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(60000);	
		if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
		
		//wait.until(ExpectedConditions.visibilityOf(IPEP.CasesheetpopupOKbuton()));
		Thread.sleep(2000);
		//IPEP.CasesheetpopupOKbuton().click();
		Thread.sleep(2000);	
		
		String parent3 = driver.getWindowHandle();
		
			utilobj.Window(driver);
		
			IPEP.Inpatient_Emergencypatient_ipcasesheet_Prescription().click();
		
			Thread.sleep(2000);
		
			
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.visibilityOf(IPEP.gettxtOrdPackSearch()));
			System.out.println(driver.getTitle());
		
			utilobj.JSEnterText(IPEP.gettxtOrdPackSearch(), driver, "Automation");
			Thread.sleep(2000);
		
			utilobj.JSClick(IPEP.getclickorderpackbutton(), driver);
			
		
			
			Thread.sleep(5000);
		
			utilobj.JSClick(IPEP.getorderpackselection(), driver);
		
			Thread.sleep(5000);
		
			utilobj.JSClick(IPEP.getbtnISaveClose(), driver);
		
			utilobj.waitForalert(driver);
		
			driver.switchTo().alert().accept();
			driver.switchTo().window(parent3);
		
			driver.switchTo().defaultContent();
	}
	
}

