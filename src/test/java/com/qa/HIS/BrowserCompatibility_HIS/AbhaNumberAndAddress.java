package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.itextpdf.text.log.SysoCounter;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPDFlowPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class AbhaNumberAndAddress extends CrossBrowser {

	public AbhaNumberAndAddress() {

	}
	public static ExtentTest extentTest;
	public static ExtentReports extent;
	String parent6 = "";
	String laboratoryresultEntry;
	String laboratoryresultDispatch;
	String imaggingresultDispatch;
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	String getUhid = null;
	String checkIN = null;
	OPDFlowPages opdflowPages;
	String sheduledateTime;
	String Orderdate;
	String date;
	String splitdate;
	String splitOrderdate;
	String ReqNo;
	util utilobj = new util();
	WebDriverWait wait;

	@Test(priority = 0)
	public void doLoginTest() {
		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {// OPGENE042100042

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("Location"),
				prop.getProperty("facilityName"), Browser);
		
	}

	@Test(priority = 3)
	public void doNavigateToPatientCheckinLinkTest() {

		opdflowPages = hishomepage.doNavigateToPatientCheck_InforOPDFLowLink();
	}

	@Test(priority = 4)
	public void doCreateCheckInPageTest() throws InterruptedException {

		// opdflowPages.getgenratechekIn();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys("1100099900");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));

		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
		wait.until(ExpectedConditions.invisibilityOf(opdflowPages.getBlackOverlay()));

		Thread.sleep(4000);
		// opdflowPages.getpatientCheckInNumberSeviceOkButton().click();
		utilobj.JSClick(opdflowPages.getpatientCheckInNumberSeviceOkButton(), driver);
		Thread.sleep(4000);
		
		opdflowPages.getpatientCheckInNumberSaveButton().click();
		Thread.sleep(4000);

		System.out.println(opdflowPages.getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(opdflowPages.getPopupmessage(), driver));

		checkIN = utilobj.GetCheckinNumberText(opdflowPages.getPopupmessage(), driver);

	}
	
	@Test(priority = 5)
	public void dodoctorworklistForMiniCaseSheet() throws InterruptedException, IOException {
		opdflowPages.getBtncancel().click();
		Thread.sleep(1000);
		getUhid = opdflowPages.getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(3000);
		System.out.println(getUhid);

		Thread.sleep(5000);
		utilobj.MoveElement(opdflowPages.getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		opdflowPages.getDoctorWorklistLink().click(); 
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(opdflowPages.getdoctorworklist_checkintextBox()));
		Thread.sleep(2000);
		utilobj.JSEnterText(opdflowPages.getdoctorworklist_checkintextBox(), driver, checkIN);
		Thread.sleep(5000);
//		getdoctorworklist_checkintextBox().sendKeys(checkin);
//		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
		Thread.sleep(5000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCMiniCS")), driver);
//Thread.sleep(2000);
//getDoctorworklistCheckINno().click();
		
		String AbhaNumberMiniCseSheet=opdflowPages.getAbhaNumberMiniCaseSheet().getText();
		System.out.println("ABHA Number is"+ AbhaNumberMiniCseSheet);
		
		String AadharNumberMiniCaseSheet=opdflowPages.getAadharMiniCaseSheet().getText();
		System.out.println("Aadhar Number is"+ AadharNumberMiniCaseSheet);

		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		opdflowPages.getSaveAndPrescribe().click();

		Thread.sleep(2000);

		utilobj.ChildWindow(driver);
		Thread.sleep(1000);

		System.out.println(driver.getTitle());

		utilobj.JSEnterText(opdflowPages.gettxtOrdPackSearch(), driver, "AutomationdummyOrderPack");
		Thread.sleep(1000);

		utilobj.JSClick(opdflowPages.getclickorderpackbutton(), driver);

		Thread.sleep(3000);

		utilobj.JSClick(opdflowPages.getorderpackselection(), driver);
  
		Thread.sleep(15000);
		
		utilobj.JSClick(opdflowPages.getbtnSavePrint(), driver);
		utilobj.acceptForalert(driver); 
        Thread.sleep(20000);
		utilobj.ChildWindowOfChild(driver, "ShowCLMPrintReport.aspx");
		Thread.sleep(2000);
	//	utilobj.takeScreenshotAndAddToReport(driver, "print1",extentTest);
		Thread.sleep(5000); 
		utilobj.windowClose(driver);
		 
		utilobj.ChildWindow(driver);
		Thread.sleep(10000);
		utilobj.JSView(opdflowPages.getbtnclose(), driver);
		utilobj.JSClick(opdflowPages.getbtnclose(), driver);

		driver.switchTo().window(parent3);
		Thread.sleep(5000);
		
		opdflowPages.getbtnprint();
		
		 Thread.sleep(20000);
			utilobj.ChildWindowOfChild(driver, "ShowCLMPrintReport.aspx");
			Thread.sleep(2000);
		//	utilobj.takeScreenshotAndAddToReport(driver, "print1",extentTest);
			Thread.sleep(5000);
	}

	@Test(priority = 6)
	public void dodoctorworklistForCaseSheet() throws InterruptedException, IOException {
//		opdflowPages.getBtncancel().click();
//		Thread.sleep(1000);
//		getUhid = opdflowPages.getUHID_creation_Uhid_txtbox().getAttribute("value");
//		Thread.sleep(3000);
//		System.out.println(getUhid);

		Thread.sleep(5000);
		utilobj.MoveElement(opdflowPages.getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		opdflowPages.getDoctorWorklistLink().click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(opdflowPages.getdoctorworklist_checkintextBox()));
		Thread.sleep(2000);
		utilobj.JSEnterText(opdflowPages.getdoctorworklist_checkintextBox(), driver, checkIN);
		Thread.sleep(5000);
//		getdoctorworklist_checkintextBox().sendKeys(checkin);
//		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
		Thread.sleep(5000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
//Thread.sleep(2000);
//getDoctorworklistCheckINno().click();

		Thread.sleep(2000);

		opdflowPages.getpopupok().click();
		
		String AbhaNumber=opdflowPages.getAbhaNumber().getText();
		System.out.println("ABHA Number is"+ AbhaNumber);
		
		String AadharNumber=opdflowPages.getAadhar().getText();
		System.out.println("Aadhar Number is"+ AadharNumber);

		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		opdflowPages.getlableprecripstionlink().click();

		Thread.sleep(2000);

		utilobj.ChildWindow(driver);
		Thread.sleep(1000);

		System.out.println(driver.getTitle());

		utilobj.JSEnterText(opdflowPages.gettxtOrdPackSearch(), driver, "AutomationdummyOrderPack");
		Thread.sleep(1000);

		utilobj.JSClick(opdflowPages.getclickorderpackbutton(), driver);

		Thread.sleep(3000);

		utilobj.JSClick(opdflowPages.getorderpackselection(), driver);

		Thread.sleep(15000);
		
		utilobj.JSClick(opdflowPages.getbtnSavePrint(), driver);
		utilobj.acceptForalert(driver); 
        Thread.sleep(20000);
		utilobj.ChildWindowOfChild(driver, "ShowCLMPrintReport.aspx");
		Thread.sleep(2000);
	//	utilobj.takeScreenshotAndAddToReport(driver, "print1",extentTest);
		Thread.sleep(5000);
		utilobj.windowClose(driver);
		
		utilobj.ChildWindow(driver);
		Thread.sleep(10000);
		utilobj.JSView(opdflowPages.getbtnclose(), driver);
		utilobj.JSClick(opdflowPages.getbtnclose(), driver);

		driver.switchTo().window(parent3);
		Thread.sleep(5000);
		opdflowPages.getpopupok().click();
		Thread.sleep(5000);
		
		opdflowPages.getbtnprint();
		
		 Thread.sleep(20000);
			utilobj.ChildWindowOfChild(driver, "ShowCLMPrintReport.aspx");
			Thread.sleep(2000);
		//	utilobj.takeScreenshotAndAddToReport(driver, "print1",extentTest);
			Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_ddlHospital")));

	}
	
}
