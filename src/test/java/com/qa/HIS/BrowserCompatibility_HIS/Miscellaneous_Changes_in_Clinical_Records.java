package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.Miscellaneous_Changes_in_Clinical_RecordsPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Miscellaneous_Changes_in_Clinical_Records extends CrossBrowser {

	public Miscellaneous_Changes_in_Clinical_Records() {
		// TODO Auto-generated constructor stub
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Miscellaneous_Changes_in_Clinical_RecordsPage MCICRP;
	String getUhid ;
	String checkIN;
	util utilobj=new util();
	String InsuredPersonNumber="1100099900";
	
@Test(priority =1)

public void doLoginTest() throws IOException {


	loginpage = new Loginpage(driver);
	

	homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));
	
}

	@Test(priority =2)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	@Test(priority =3)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome("ESIC TEST HOSPITAL DL", "ADMINISTRATIVE SERVICES",Browser);
		
	}
	@Test(priority = 4)
	public void ESIC_HIS_Location_and_Facility_Selection_Registration_Patient_Check_In_Clinical_Records_Dr_Worklist_TC_006() throws InterruptedException {
		MCICRP=hishomepage.doNavigateToDrWorkList();
		if(MCICRP.getInformationOkButton().isDisplayed()) {
			MCICRP.getInformationOkButton().click();
			
		}
		Thread.sleep(2000);
		boolean searchboxDisplayStatus=MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_NoText().isDisplayed();
		String labletextstatus=MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_NoLable().getText();
		assertEquals(searchboxDisplayStatus, true);
		assertEquals(labletextstatus, "ESIC Employee/ ESIC Pensioner/ Insurance No");
	}
	@Test(priority = 5)
	public void ESIC_HIS_Location_and_Facility_Selection_Clinical_Records_Dr_Worklist_ESIC_Employee_Esic_Pensioner_insurance_number_Search_Icon_Functionality_TC_007() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_NoText().sendKeys("1100099900");
		MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_No_ImageSearchbutton().click();
		wait.until(ExpectedConditions.invisibilityOf(MCICRP.getImageofprocees()));
		List<WebElement> list=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[4]/div/table[2]/tbody/tr/td[1]"));
		for(int i=0;i<=list.size()-1;i++) {
			System.out.println(list.get(i).getText());
		}
		MCICRP.getPopupCloseButton().click();
		Thread.sleep(2000);
		MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_NoText().sendKeys("169321");
		MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_No_ImageSearchbutton().click();
		wait.until(ExpectedConditions.invisibilityOf(MCICRP.getImageofprocees()));
		MCICRP.getPopupCloseButton().click();
		Thread.sleep(2000);
		MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_NoText().sendKeys("116223");
		MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_No_ImageSearchbutton().click();
		wait.until(ExpectedConditions.invisibilityOf(MCICRP.getImageofprocees()));
		
		MCICRP.getCheck_in_noDDL().click();
		assertEquals(list.size(), 10);
		}
	
	@Test(priority = 6)
	@Parameters("browser")
	public void ESIC_HIS_Location_and_Facility_Selection_Clinical_Records_Dr_Worklist_ESIC_Employee_Esic_Pensioner_insurance_number_Search_Icon_Functionality_TC_008(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		MCICRP.getPopupCloseButton().click();
		Thread.sleep(2000);
		utilobj.MoveElement(MCICRP.getRegistrationLink(), driver);
		MCICRP.getPatientCheckInLink().click();
		Thread.sleep(2000);
		MCICRP.getTxtIPNO().sendKeys(InsuredPersonNumber);
		Thread.sleep(2000);
		MCICRP.getLnkbtnIPNo().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(MCICRP.getHisLiveListControlchkUHID()));
		MCICRP.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		MCICRP.getHisLiveListControlbtnSelect().click();
		wait.until(ExpectedConditions.invisibilityOf(MCICRP.getBlackOverlay()));
		Thread.sleep(2000);
		utilobj.JSClick(MCICRP.getBtnOK(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(MCICRP.getBtnSaveDisplay(), driver);

		wait.until(ExpectedConditions.visibilityOf(MCICRP.getPopupmessage()));
		checkIN = utilobj.GetCheckinNumberText(MCICRP.getPopupmessage(), driver);
		System.out.println(checkIN);
		MCICRP.getBtncancel().click();
		getUhid = MCICRP.getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(3000);
		System.out.println(getUhid);
		
		Thread.sleep(1000);
		utilobj.MoveElement(MCICRP.getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		MCICRP.getDoctorWorklistLink().click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOf(MCICRP.getdoctorworklist_checkintextBox()));
		Thread.sleep(2000);
		utilobj.JSEnterText(MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_NoText(), driver, InsuredPersonNumber);
		Thread.sleep(2000);
		utilobj.JSClick(MCICRP.getESIC_Employee_ESIC_Pensioner_Insurance_No_ImageSearchbutton(), driver);
		Thread.sleep(2000);
		utilobj.selectDropdown(MCICRP.getCheck_in_noDDL(), driver, checkIN, Browser);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnOpenCaseSheet")), driver);
		wait.until(ExpectedConditions.invisibilityOf(MCICRP.getBlackOverlay()));
		Thread.sleep(2000);
		MCICRP.getpopupok().click();
		Thread.sleep(2000);//open casesheet
	}
	@Test(priority = 7)
	@Parameters("browser")
	public void ESIC_HIS_Clinical_Records_Dr_Worklist_casesheet_add_DiagnosWithoutICDCode_Diagnosis_TC_010(String Browser) throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		String parent3= driver.getWindowHandle();
		utilobj.Window(driver);
		MCICRP.getprescriptionLink().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.visibilityOf(MCICRP.getICDdiagnosisTextbox()));
		MCICRP.getICDdiagnosisTextbox().click();
		//MCICRP.getICDdiagnosisTextbox().sendKeys("fever");
		
    	Robot robot=new Robot();
    	robot.keyPress(KeyEvent.VK_D);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_I);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_S);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_O);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_R);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_D);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_E);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_R);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_SPACE);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_O);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_F);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_SPACE);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_L);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_A);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_B);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_O);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_U);Thread.sleep(1000);
    	robot.keyPress(KeyEvent.VK_R);Thread.sleep(1000);//38362002$Dengue fever
    	wait.until(ExpectedConditions.visibilityOf(MCICRP.getdiagnosisName()));
    	utilobj.ActionClick(MCICRP.getdiagnosisName(), driver);
    	Thread.sleep(5000);
    	MCICRP.getdiagnosisremarks().sendKeys("test automation");
    	utilobj.selectDropdown(MCICRP.getdiagnosisTypeDDL(), driver, "Provisional Diagnosis", Browser);
    	MCICRP.getdiagnosisADDbutton().click();
    	MCICRP.getprescriptionSavePrintButton().click();		
	    Thread.sleep(5000);
		utilobj.waitForalert(driver);
		driver.switchTo().alert().accept();
	//	driver.switchTo().window(parent3);
		
	//handle the window
	}
	@Test(priority = 8)
	public void test() throws InterruptedException {
		Thread.sleep(5000);

		 Set<String> windowHandles = driver.getWindowHandles();
	        List<String> windowHandlesList = new ArrayList<>(windowHandles); //Set to List Conversion
	        System.out.println("Total window number: " + windowHandlesList.size() + "\n");
	        driver.switchTo().window(windowHandlesList.get(2));
	        System.out.println(driver.getTitle());
	        driver.manage().window().maximize();
	        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
	        Thread.sleep(5000);
	     
	          driver.switchTo().window(windowHandlesList.get(0));
	          
	}
	@Test(priority = 9)
	public void test2() throws InterruptedException {
		Thread.sleep(5000);
		MCICRP.getpopupok().click();
		driver.findElement(By.id("ctl00_cphpage_btnPrint")).click();
		Thread.sleep(5000);
	}
	
}
