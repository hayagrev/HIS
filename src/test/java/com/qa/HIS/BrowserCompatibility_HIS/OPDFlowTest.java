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

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPDFlowPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class OPDFlowTest extends CrossBrowser {

	public OPDFlowTest() {

	}

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
		//
		opdflowPages.getpatientCheckInNumberSaveButton().click();
		Thread.sleep(4000);

		System.out.println(opdflowPages.getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(opdflowPages.getPopupmessage(), driver));

		checkIN = utilobj.GetCheckinNumberText(opdflowPages.getPopupmessage(), driver);

	}

	@Test(priority = 5)
	public void dodoctorworklist() throws InterruptedException, IOException {
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
		utilobj.JSEnterText(opdflowPages.getdoctorworklist_checkintextBox(), driver, "OPGENE022400284");
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

		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		opdflowPages.getlableprecripstionlink().click();

		Thread.sleep(2000);

		utilobj.ChildWindow(driver);
		Thread.sleep(1000);

		System.out.println(driver.getTitle());

		utilobj.JSEnterText(opdflowPages.gettxtOrdPackSearch(), driver, "AutomationdummyOrderPack");

		utilobj.JSClick(opdflowPages.getclickorderpackbutton(), driver);

		Thread.sleep(3000);

		utilobj.JSClick(opdflowPages.getorderpackselection(), driver);

		Thread.sleep(15000);
		
		utilobj.ChildWindow(driver);
		Thread.sleep(10000);
		utilobj.JSView(opdflowPages.getbtnclose(), driver);
		utilobj.JSClick(opdflowPages.getbtnclose(), driver);

		driver.switchTo().window(parent3);
		Thread.sleep(5000);
		opdflowPages.getpopupok().click();
		Thread.sleep(5000);
		
		opdflowPages.getchange_facility_location_linkLink().click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_ddlHospital")));

	}

	@Test(priority = 6)
	@Parameters("browser")
	public void doNavigateToHISHomeTestforfacilityStore(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("Location"),
				prop.getProperty("StoreServices"), Browser);

	}

	@Test(priority = 7)
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
		wait.until(ExpectedConditions.invisibilityOf(opdflowPages.getBlackOverlay()));
		opdflowPages.getStoreUhidIssueQuantity().clear();
		Thread.sleep(4000);
		opdflowPages.getStoreUhidIssueQuantity().sendKeys("3");
		Thread.sleep(2000);
		opdflowPages.getStoreUhidIssueSaveButton().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);

	}

	@Test(priority = 8)
	@Parameters("browser")
	public void doNavigateToHISHomeTestforLaboratoryworklist(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		opdflowPages.getchange_facility_location_linkLink().click();
		Thread.sleep(2000);
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityNameLABORATORYSERVICE"), Browser);// ok

	}

	@Test(priority = 9)
	@Parameters("browser")
	public void testcaseforLaboratoryworkListOPD(String Browser) throws InterruptedException {

		Thread.sleep(2000);
		utilobj.MoveElement(opdflowPages.getlaboratoryLink(), driver);
		Thread.sleep(2000);
		opdflowPages.getlabWorkListLink().click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(opdflowPages.LaboratoryOPworkListTxtboxsearch()));
		opdflowPages.LaboratoryOPworkListTxtboxsearch().sendKeys(getUhid);
		Thread.sleep(2000);

		opdflowPages.getlaboratoryWorklistOKButton().click();
		wait.until(ExpectedConditions.invisibilityOf(opdflowPages.getBlackOverlay()));
		Thread.sleep(4000);

		if (driver.findElement(By.id("ctl00_cphpage_btnNext")).isEnabled() == true) {
			System.out.println("hello");
			driver.findElement(By.id("ctl00_cphpage_btnNext")).click();
			Thread.sleep(2000);
			List<WebElement> RowDateOrder = driver.findElements(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
			System.out.println(RowDateOrder.size());
			int rowsize = RowDateOrder.size() + 1;
			System.out.println(rowsize);

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);
			Thread.sleep(2000);

			ReqNo = driver.findElement(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["
							+ rowsize + "]/td[1]"))
					.getText();
			System.out.println(ReqNo);
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["
							+ rowsize + "]/td[1]"))
					.click();

			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);

			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox(), driver);

			Thread.sleep(5000);
			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);

			Thread.sleep(2000);
			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SAcheckboxLink(), driver);

			Thread.sleep(2000);
			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
			Thread.sleep(2000);
			laboratoryresultEntry = driver.getWindowHandle();
			Thread.sleep(2000);
			utilobj.Window(driver);
			utilobj.JSClick(opdflowPages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			utilobj.selectDropdown(opdflowPages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox(), driver,
					"Positive", Browser);
			// opdflowPages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox().sendKeys("13");
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntrySaveButton().click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultEntry);
			// forresultverification
			Thread.sleep(1000);
			laboratoryresultEntry = driver.getWindowHandle();
			Thread.sleep(1000);
			utilobj.Window(driver);
			Thread.sleep(1000);
			utilobj.JSClick(opdflowPages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntrycheckResultcheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryBtnUpdate().click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultEntry);
			Thread.sleep(1000);
			laboratoryresultDispatch = driver.getWindowHandle();
			Thread.sleep(1000);
			utilobj.Window(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("gvTestOrderItems_ctl02_imgresultDispatch")).click();
			Thread.sleep(1000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("txtDispatachedTo")).sendKeys("test doctor");
			Thread.sleep(1000);
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultDispatch);
			Thread.sleep(1000);
			driver.findElement(By.id("btnClose")).click();

			driver.switchTo().window(parent3);
		}

		else {

			List<WebElement> RowDateOrder = driver.findElements(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
			System.out.println(RowDateOrder.size());
			int rowsize = RowDateOrder.size() + 1;

			System.out.println(rowsize);

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);
			Thread.sleep(2000);
			// String ReqNo=getlabotatory_reqnoLink().getText();
			// opdflowPages.getlabotatory_reqnoLink().click();
			ReqNo = driver.findElement(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["
							+ rowsize + "]/td[1]"))
					.getText();
			System.out.println(ReqNo);
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["
							+ rowsize + "]/td[1]"))
					.click();

			utilobj.ChildWindow(driver);
			wait.until(ExpectedConditions
					.visibilityOf(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox()));
			Thread.sleep(2000);

			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox(), driver);

			Thread.sleep(5000);
			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);

			Thread.sleep(2000);
			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_IP_OP_SAcheckboxLink(), driver);

			Thread.sleep(2000);
			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
			Thread.sleep(2000);
			laboratoryresultEntry = driver.getWindowHandle();
			Thread.sleep(2000);
			utilobj.Window(driver);
			utilobj.JSClick(opdflowPages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);

			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox().sendKeys("13");
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntrySaveButton().click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultEntry);
			// forresultverification
			laboratoryresultEntry = driver.getWindowHandle();

			utilobj.Window(driver);
			utilobj.JSClick(opdflowPages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntrycheckResultcheckBox().click();
			Thread.sleep(3000);
			opdflowPages.getLaboratoryOPworkListImageResultEntryBtnUpdate().click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);

			driver.switchTo().window(laboratoryresultEntry);
			Thread.sleep(1000);
			laboratoryresultDispatch = driver.getWindowHandle();
			Thread.sleep(1000);
			utilobj.Window(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("gvTestOrderItems_ctl02_imgresultDispatch")).click();

			Thread.sleep(1000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("txtDispatachedTo")).sendKeys("test doctor");
			Thread.sleep(1000);
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultDispatch);
			Thread.sleep(2000);
			driver.findElement(By.id("btnClose")).click();

			driver.switchTo().window(parent3);

		}
		Thread.sleep(5000);

		opdflowPages.getchange_facility_location_linkLink().click();
		Thread.sleep(2000);

	}

	@Test(priority = 10)
	@Parameters("browser")
	public void doNavigateToHISHomeTestforImagingServices(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("imagingfacilityname"), Browser);

	}

	@Test(priority = 11)
	@Parameters("browser")
	public void doImagingServices(String Browser) throws InterruptedException {
		opdflowPages = hishomepage.doNavigateToImagingWorklistOforOPDFlowPages();

		Thread.sleep(2000);
		opdflowPages.getimageWorkListUHIDtxtsearch().sendKeys(getUhid);
		Thread.sleep(2000);
		opdflowPages.getimageWorkListUHIDOKBUtton().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.invisibilityOf(opdflowPages.getBlackOverlay()));
		Thread.sleep(2000);
		if (driver.findElement(By.id("ctl00_cphpage_btnNext")).isEnabled() == true) {
			driver.findElement(By.id("ctl00_cphpage_btnNext")).click();
			Thread.sleep(2000);
			List<WebElement> rowcount = driver.findElements(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
			System.out.println("the size of req is:" + rowcount.size());
			int rowsizeimagging = rowcount.size() + 1;
			System.out.println(rowsizeimagging);
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);
			Thread.sleep(2000);
			ReqNo = driver.findElement(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["
							+ rowsizeimagging + "]/td[1]"))
					.getText();
			System.out.println(ReqNo);
			driver.findElement(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["
							+ rowsizeimagging + "]/td[1]"))
					.click();
			// opdflowPages.getimageWorkListUHIDOKBUtReqNO().click();
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailPAcheckBox(), driver);

			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailSaveButton(), driver);
			Thread.sleep(3000);

			wait.until(ExpectedConditions.visibilityOf(opdflowPages.getimageWorkListReqDetailTPINFOMESSAGE()));
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTPINFOMESSAGE(), driver);

			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTPcheckBox(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTPInformationyesButton(), driver);
			Thread.sleep(3000);
			utilobj.selectDropdown(opdflowPages.getimageWorkListReqDetailTP_NOFU_ITEMddl(), driver,
					"Dry Lase Film 14 into 17 inch", Browser);
			Thread.sleep(3000);
			utilobj.selectDropdown(opdflowPages.getimageWorkListReqDetailTP_NOFU_BATCHddl(), driver, "bv32", Browser);
			Thread.sleep(2000);
			utilobj.JSEnterText(opdflowPages.getimageWorkListReqDetailTP_NOFU_Quantity(), driver, "1");
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTP_NOFU_ButtonADD(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTP_NOFU_ButtonOK(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTPINFOMESSAGE(), driver);

			parent6 = driver.getWindowHandle();

			utilobj.Window(driver);
			utilobj.JSClick(opdflowPages.getimgReportEntry(), driver);

			Thread.sleep(3000);

			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			driver.switchTo().frame("txtEditor_ctl02_ctl00");
			Thread.sleep(3000);
			opdflowPages.gettxtResultentry().sendKeys(prop.getProperty("resultText"));
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			opdflowPages.getchkDoctor().click();
			Thread.sleep(3000);
			opdflowPages.getbtnSave().click();
			Thread.sleep(3000);
			opdflowPages.getButtonOKpopup().click();
			Thread.sleep(3000);
			opdflowPages.getchkVerify().click();
			Thread.sleep(3000);
			opdflowPages.getbtnUpdate().click();
			Thread.sleep(3000);
			opdflowPages.getButtonOKpopup().click();
			Thread.sleep(3000);
			driver.close();
			driver.switchTo().window(parent6);
			Thread.sleep(3000);
			driver.findElement(By.id("btnTPCancel")).click();
			Thread.sleep(3000);
			imaggingresultDispatch = driver.getWindowHandle();
			Thread.sleep(3000);
			utilobj.Window(driver);
			Thread.sleep(3000);
			driver.findElement(By.id("gdvTOItems_ctl02_imgReportDispatch")).click();
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.findElement(By.id("txtDispatachedTo")).sendKeys("test doctor");
			Thread.sleep(3000);
			driver.findElement(By.id("btnSaveDisplay")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("popup_ok")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(3000);
			driver.switchTo().window(imaggingresultDispatch);
			Thread.sleep(3000);
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parent3);

		}

		else {

			List<WebElement> rowcount = driver.findElements(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
			System.out.println("the size of req is:" + rowcount.size());
			int rowsizeimagging = rowcount.size() + 1;
			System.out.println(rowsizeimagging);

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);
			Thread.sleep(2000);

			ReqNo = driver.findElement(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["
							+ rowsizeimagging + "]/td[1]"))
					.getText();
			System.out.println(ReqNo);
			driver.findElement(By.xpath(
					"/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["
							+ rowsizeimagging + "]/td[1]"))
					.click();
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailPAcheckBox(), driver);

			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailSaveButton(), driver);
			Thread.sleep(3000);

			wait.until(ExpectedConditions.visibilityOf(opdflowPages.getimageWorkListReqDetailTPINFOMESSAGE()));
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTPINFOMESSAGE(), driver);

			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTPcheckBox(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTPInformationyesButton(), driver);
			Thread.sleep(3000);
			utilobj.selectDropdown(opdflowPages.getimageWorkListReqDetailTP_NOFU_ITEMddl(), driver,
					"Dry Lase Film 14 into 17 inch", Browser);
			Thread.sleep(3000);
			utilobj.selectDropdown(opdflowPages.getimageWorkListReqDetailTP_NOFU_BATCHddl(), driver, "bv32", Browser);
			Thread.sleep(2000);
			utilobj.JSEnterText(opdflowPages.getimageWorkListReqDetailTP_NOFU_Quantity(), driver, "1");
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTP_NOFU_ButtonADD(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTP_NOFU_ButtonOK(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(opdflowPages.getimageWorkListReqDetailTPINFOMESSAGE(), driver);

			parent6 = driver.getWindowHandle();

			utilobj.Window(driver);
			utilobj.JSClick(opdflowPages.getimgReportEntry(), driver);

			Thread.sleep(3000);

			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			driver.switchTo().frame("txtEditor_ctl02_ctl00");
			Thread.sleep(3000);
			opdflowPages.gettxtResultentry().sendKeys(prop.getProperty("resultText"));
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			opdflowPages.getchkDoctor().click();
			Thread.sleep(3000);
			opdflowPages.getbtnSave().click();
			Thread.sleep(3000);
			opdflowPages.getButtonOKpopup().click();
			Thread.sleep(3000);
			opdflowPages.getchkVerify().click();
			Thread.sleep(3000);
			opdflowPages.getbtnUpdate().click();
			Thread.sleep(3000);
			opdflowPages.getButtonOKpopup().click();
			Thread.sleep(3000);
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parent6);
			Thread.sleep(3000);
			imaggingresultDispatch = driver.getWindowHandle();
			Thread.sleep(3000);
			utilobj.Window(driver);
			Thread.sleep(3000);
			driver.findElement(By.id("gdvTOItems_ctl02_imgReportDispatch")).click();
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.findElement(By.id("txtDispatachedTo")).sendKeys("test doctor");
			Thread.sleep(3000);
			driver.findElement(By.id("btnSaveDisplay")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("popup_ok")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(3000);
			driver.switchTo().window(imaggingresultDispatch);
			Thread.sleep(3000);
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parent3);

		}

	}

}
