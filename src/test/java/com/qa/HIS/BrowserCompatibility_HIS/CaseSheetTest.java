package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.CasesheetPages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class CaseSheetTest extends CrossBrowser {

	public CaseSheetTest() {
		

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CasesheetPages CSP;
	util utilobj = new util();
	String checkIN;
	String getUhid;
	
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"), browser);
	}

	@Test(priority = 3)
	public void doNavigateToPatientCheckInTest() {

		CSP = hishomepage.doNavigateToPatientCheckInforcaseSheet();
	}

	@Test(priority = 4)
	public void CreateCheck_in() throws InterruptedException {
		Thread.sleep(2000);
		CSP.getTxtIPNO().sendKeys("1100099900");
		Thread.sleep(2000);
		CSP.getLnkbtnIPNo().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(CSP.getHisLiveListControlchkUHID()));
		CSP.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		CSP.getHisLiveListControlbtnSelect().click();
		wait.until(ExpectedConditions.visibilityOf(CSP.getBlackOverlay()));
		Thread.sleep(2000);

		CSP.getLnkbtnIPNo().click();
		
		wait.until(ExpectedConditions.visibilityOf(CSP.getHisLiveListControlchkUHID()));
		CSP.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		CSP.getHisLiveListControlbtnSelect().click();
		wait.until(ExpectedConditions.invisibilityOf(CSP.getBlackOverlay()));
		Thread.sleep(2000);
		utilobj.JSClick(CSP.getBtnOK(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(CSP.getBtnSaveDisplay(), driver);

		wait.until(ExpectedConditions.visibilityOf(CSP.getPopupmessage()));
		checkIN = utilobj.GetCheckinNumberText(CSP.getPopupmessage(), driver);
		System.out.println(checkIN);
		CSP.getBtncancel().click();
		getUhid = CSP.getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(3000);
		System.out.println(getUhid);
	}

	@Test(priority = 5)
	@Parameters("browser")
	public void PM10610_1(String Browser) throws InterruptedException {

		Thread.sleep(1000);
		utilobj.MoveElement(CSP.getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		CSP.getDoctorWorklistLink().click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(CSP.getdoctorworklist_checkintextBox()));
		Thread.sleep(2000);
		utilobj.JSEnterText(CSP.getdoctorworklist_checkintextBox(), driver, checkIN);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
		Thread.sleep(2000);
		CSP.getpopupok().click();
		Thread.sleep(2000);
		String parent3= driver.getWindowHandle();
		utilobj.Window(driver);
		CSP.getAdviceLink().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.visibilityOf(CSP.getIntraInterRefferalRadioButton()));
		CSP.getIntraInterRefferalRadioButton().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(CSP.getHospitalDDl(), driver, "Sanathnagar, TS (ESIC Medical College Hosp.)", Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(CSP.getSpeciliazationDDl(), driver, "General Medicine", Browser);
		Thread.sleep(2000);
		CSP.getReferralRemarkTextBox().sendKeys("test Automation");
		Thread.sleep(2000);
		CSP.getAddButton().click();
		Thread.sleep(2000);
		CSP.getSaveCloseButton().click();//IP042300019 
		
	Thread.sleep(5000);
//		utilobj.waitForalert(driver);
//		driver.switchTo().alert().accept();
		driver.switchTo().window(parent3);
	}
		@Test(priority = 6)
		@Parameters("browser")
		public void PM10610_2(String Browser) throws InterruptedException {

//		CSP.getAddButton().click();
//		Thread.sleep(2000);
//		CSP.getSaveCloseButton().click();
//		
//		
//		utilobj.waitForalert(driver);
//		driver.switchTo().alert().accept();
//		driver.switchTo().window(parent3);
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(CSP.getpopupok()));
		
		utilobj.JSClick(CSP.getpopupok(), driver);
		Thread.sleep(2000);
	//	CSP.getpopupok().click();
		CSP.gettab().click();
		Thread.sleep(2000);

	}
}
