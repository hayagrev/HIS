package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.swing.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Home_DrugDeliveryPage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPDFlowPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Home_DrugDelivery extends CrossBrowser {

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
	// Home_DrugDeliveryPage hddpage;
	String sheduledateTime;
	String Orderdate;
	String date;
	String splitdate;
	String splitOrderdate;
	String ReqNo;
	util utilobj = new util();

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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
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
		driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys("1199900090");
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
		//
		opdflowPages.getpatientCheckInNumberSaveButton().click();
		Thread.sleep(4000);

		System.out.println(opdflowPages.getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(opdflowPages.getPopupmessage(), driver));

		checkIN = utilobj.GetCheckinNumberText(opdflowPages.getPopupmessage(), driver);

	}

	@Test(priority = 5)
	@Parameters("browser")
	public void homedrugdelivery(String Browser) throws Exception {
		Home_DrugDeliveryPage hddpage = new Home_DrugDeliveryPage(driver);
		opdflowPages.getBtncancel().click();
		Thread.sleep(1000);
		getUhid = opdflowPages.getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(3000);
		System.out.println(getUhid);
		Thread.sleep(1000);
		utilobj.MoveElement(opdflowPages.getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		opdflowPages.getDoctorWorklistLink().click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(opdflowPages.getdoctorworklist_checkintextBox()));
		Thread.sleep(2000);
		utilobj.JSEnterText(opdflowPages.getdoctorworklist_checkintextBox(), driver, checkIN);
		Thread.sleep(2000);
//		getdoctorworklist_checkintextBox().sendKeys(checkin);
//		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
//Thread.sleep(2000);
//getDoctorworklistCheckINno().click();

		Thread.sleep(2000);

		opdflowPages.getpopupok().click();
		Thread.sleep(2000);
		utilobj.checkbox(hddpage.hddcheckBox());
		// hddpage.hddcheckBox().click();
		Thread.sleep(2000);
		utilobj.elementapear(hddpage.getpopup_homedrugdelivery());
		// hddpage.getpopup_homedrugdelivery().click();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);
		hddpage.Home_Drug_Delivery_link().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		wait.until(ExpectedConditions.visibilityOf(hddpage.drug_delivery_Address()));
		// hddpage.drug_delivery_clearbtn().click();
		// Thread.sleep(5000);
		// hddpage.drug_delivery_clearbtn().sendKeys("Andhra Pradesh");
		utilobj.selectDropdown(hddpage.drug_delivery_state(), driver, "Andhra Pradesh", Browser);
		Thread.sleep(5000);
		utilobj.selectDropdown(hddpage.drug_delivery_dstrict(), driver, "Guntur", Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(hddpage.drug_delivery_subdistrict(), driver, "Amaravathi", Browser);
		hddpage.drug_delivery_pincode().sendKeys("523154");
		hddpage.drug_delivery_mobilenum().sendKeys("6675455835");
		hddpage.drug_delivery_Address().sendKeys("Test test test test");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(hddpage.drug_delivery_savebtn()));
		hddpage.drug_delivery_savebtn().click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_SPACE);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_ALT);
		rb.keyRelease(KeyEvent.VK_SPACE);
		rb.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		wait.until(ExpectedConditions.visibilityOf(opdflowPages.getlableprecripstionlink()));
	}

	@Test(priority = 6)
	public void dodoctorworklist() throws InterruptedException {

//		utilobj.MoveElement(opdflowPages.getClinicalRecordsLink(), driver);
//		Thread.sleep(2000);
//		opdflowPages.getDoctorWorklistLink().click();
//		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
//		wait.until(ExpectedConditions.visibilityOf(opdflowPages.getdoctorworklist_checkintextBox()));
//		Thread.sleep(2000);
//		utilobj.JSEnterText(opdflowPages.getdoctorworklist_checkintextBox(), driver, checkIN);
//		Thread.sleep(2000);
////		getdoctorworklist_checkintextBox().sendKeys(checkin);
////		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
////Thread.sleep(2000);
////getDoctorworklistCheckINno().click();
//
//		Thread.sleep(2000);
//
//		opdflowPages.getpopupok().click();
//
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		utilobj.scroolDownintoview(driver, opdflowPages.getlableprecripstionlink());

		Thread.sleep(2000);

		opdflowPages.getlableprecripstionlink().click();

		Thread.sleep(10000);

		utilobj.ChildWindow(driver);
		Thread.sleep(1000);

		System.out.println(driver.getTitle());

		utilobj.JSEnterText(opdflowPages.gettxtOrdPackSearch(), driver, "AutomationdummyOrderPack");

		utilobj.JSClick(opdflowPages.getclickorderpackbutton(), driver);

		Thread.sleep(3000);

		utilobj.JSClick(opdflowPages.getorderpackselection(), driver);

		Thread.sleep(5000);
		// sheduledateTime=opdflowPages.getcasesheetDateTime().getText();

		Thread.sleep(5000);
		utilobj.JSClick(opdflowPages.getbtnISaveClose(), driver);

		utilobj.waitForalert(driver);

		driver.switchTo().alert().accept();

		driver.switchTo().window(parent3);
		Thread.sleep(5000);
		opdflowPages.getpopupok().click();
		Thread.sleep(4000);
		utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("//a[@id='ctl00_lnkbtnChangeHospital']")));
//		Thread.sleep(5000);
//		date = driver.findElement(By.xpath(
//				"/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[2]/tbody/tr[2]/td/a[1]"))
//				.getText();
//		System.out.println(date);
//		splitdate = date.substring(0, 17);
//		System.out.println(splitdate);
//		wait.until(ExpectedConditions.visibilityOf(opdflowPages.getchange_facility_location_linkLink()));
//		Thread.sleep(2000);
		opdflowPages.getchange_facility_location_linkLink().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_ddlHospital"))));

	}

	@Test(priority = 7)
	@Parameters("browser")
	public void doNavigateToHISHomeTestforfacilityStore(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("StoreServices"), Browser);

	}

	@Test(priority = 8)
	public void dofacilityStore() throws InterruptedException {

		// opdflowPages.TestCaseforStoreServices(checkIN);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
//		wait.until(ExpectedConditions.visibilityOf(opdflowPages.getStores()));
		opdflowPages = hishomepage.doNavigateToPharmacyIssueforOPDflowLink();
//		utilobj.MoveElement(opdflowPages.getStores(), driver);
//		Thread.sleep(2000);		
//		opdflowPages.getPharmacyIssue().click();		
		Thread.sleep(2000);
		opdflowPages.getStoreUhidTextBox().sendKeys(checkIN);
		Thread.sleep(2000);
		opdflowPages.getStoreUhidImgSerch().click();
		// wait.until(ExpectedConditions.invisibilityOf(opdflowPages.getBlackOverlay()));
		opdflowPages.getStoreUhidIssueQuantity().clear();
		Thread.sleep(4000);
		opdflowPages.getStoreUhidIssueQuantity().sendKeys("3");
		Thread.sleep(2000);
		opdflowPages.getStoreUhidIssueSaveButton().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);

	}
	
	@Test(priority = 9)
	public void Drupdeliveryprint() throws InterruptedException, Exception {

		Home_DrugDeliveryPage hddpage=new Home_DrugDeliveryPage(driver);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		hddpage.drug_delivery_Worklist().click();
		utilobj.ChildWindow(driver);
		hddpage.drug_delivery_Search().click();
		String parent4 = driver.getWindowHandle();
		utilobj.Window(driver);
		hddpage.drug_delivery_Print().click();
		utilobj.ChildWindow(driver);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_SPACE);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_ALT);
		rb.keyRelease(KeyEvent.VK_SPACE);
		rb.keyRelease(KeyEvent.VK_C);
		driver.switchTo().window(parent3);
		utilobj.windowClose(driver);
	}
}
