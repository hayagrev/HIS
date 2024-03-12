package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
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
import com.qa.pages.IPDFlowPages;
import com.qa.pages.Loginpage;

import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class IPDFlowTest extends CrossBrowser{
	public IPDFlowTest() {
		
	}
	String parent6 = "";
	Loginpage loginpage;
	String laboratoryresultEntry; 
	String laboratoryresultDispatch; 
	String imaggingresultDispatch;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	String getUhid=null;
	String Addmision="IP042200018";
	util utilobj = new util();
	IPDFlowPages IPDflowpages;
	String ReqNo;
	boolean progress;
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
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}
	@Test(priority = 3)
	public void dotestcaseIPDFlowPageUHID() throws InterruptedException, AWTException {

		IPDflowpages=hishomepage.doNavigateToAdmissionIPDFLowLink();

	}
	
	@Test(priority = 4)
	@Parameters("browser")
		public void dotestcaseIPDFlowPagepatientAddmission(String Browser) throws InterruptedException, AWTException {
			
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_txtInsuranceNo")).sendKeys("1100099900");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID"))));
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
		wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		
		Thread.sleep(3000);
		IPDflowpages.getpatientAdmission_permanantsameaspresent().click();
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		progress=IPDflowpages.getBlackOverLay().isDisplayed();
		if(progress==true)
		{
			wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		}
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getDdlAdmissionSrc(), driver, "Transferred from a private hospital",Browser);
		progress=IPDflowpages.getBlackOverLay().isDisplayed();
		if(progress==true)
		{
			wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		}
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getddlSpeciallization(), driver, "General Medicine",Browser);
		progress=IPDflowpages.getBlackOverLay().isDisplayed();
		if(progress==true)
		{
			wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		}
		Thread.sleep(4000);
		utilobj.selectDropdown(IPDflowpages.getddlUnit(), driver, "Medicine",Browser);
		progress=IPDflowpages.getBlackOverLay().isDisplayed();
		if(progress==true)
		{
			wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		}
		Thread.sleep(4000);
		utilobj.selectDropdown(IPDflowpages.getddlwardType(), driver, "Male Medical Ward",Browser);
		progress=IPDflowpages.getBlackOverLay().isDisplayed();
		if(progress==true)
		{
			wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		}
		Thread.sleep(4000);
		IPDflowpages.getpatientAdmission_SaveButton().click();
		wait.until(ExpectedConditions.visibilityOf(IPDflowpages.getpatientAdmission_informationOKButton()));
		Thread.sleep(3000);
		IPDflowpages.getpatientAdmission_informationOKButton().click();
		wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getpatientAdmission_informationOKButton()));
		Thread.sleep(3000);
		
		IPDflowpages.getpatientAdmission_succesokbutton().click();
		Thread.sleep(3000);
		Addmision=IPDflowpages.getAdmissionNO();
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void dotestcaseIPDFlowPagepatientInpatientmanagement(String Browser) throws InterruptedException {
		
		
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
		
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "Male Medical Ward",Browser);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(IPDflowpages.getINpatientmanagementLink(), driver);
		Thread.sleep(3000);
		
		utilobj.JSClick(IPDflowpages.getINpatientmanagementAllotBedLink(), driver);
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(IPDflowpages.getINpatientmanagementAllotbedadmissionNO()));
		Thread.sleep(3000);
		IPDflowpages.getINpatientmanagementAllotbedadmissionNO().click();
		wait.until(ExpectedConditions.visibilityOf(IPDflowpages.getINpatientmanagementAllotbed_bedName()));
		Thread.sleep(2000);

		utilobj.selectDropdown(IPDflowpages.getINpatientmanagementAllotbed_bedName(), driver, "Dum4",Browser);
		 Thread.sleep(3000);

		 IPDflowpages.getINpatientmanagementAllotbed_saveButton().click();
			 Thread.sleep(3000);
			 IPDflowpages.getINpatientmanagementAllotbed_Succusokbutton().click();
			 Thread.sleep(3000);
			
				if(driver.findElement(By.id("popup_ok")).isDisplayed()==true)
				{
					driver.findElement(By.id("popup_ok")).click();
					System.out.println("popok button is there");
				}
			
				 utilobj.MoveElement(IPDflowpages.getINpatientmanagementLink(), driver);
					Thread.sleep(3000);
					utilobj.JSClick(IPDflowpages.getINpatientmanagementUpdateStatus(), driver);
					Thread.sleep(3000);
					utilobj.selectDropdown(IPDflowpages.getINpatientmanagementUpdateStatus_bednametxtDDL(), driver, "Dum4",Browser);

					
	      			Thread.sleep(3000);
					utilobj.selectDropdown(IPDflowpages.getINpatientmanagementUpdateStatus_changetostatusddl(), driver, "Occupied",Browser);
					Thread.sleep(3000);
					IPDflowpages.getINpatientmanagementUpdateStatus_saveButton().click();
					Thread.sleep(3000);
					utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
					
					Thread.sleep(3000);

					utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
					Thread.sleep(3000);

		
	}
	@Test(priority = 6)
	@Parameters("browser")
	public void dotestcaseIPDFlowPagepatientIPcasesheetPrecription(String Browser) throws InterruptedException, AWTException {
		
		
			
			utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
			Thread.sleep(3000);
			utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "ADMINISTRATIVE SERVICES",Browser);
			
			Thread.sleep(3000);
			utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
			
			Thread.sleep(3000);
			utilobj.MoveElement(IPDflowpages.getClinicalRecordLink(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(IPDflowpages.getInpatientEmergancyPatientLink(), driver);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo"))));
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys(Addmision);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
		   wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
			wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		wait.until(ExpectedConditions.visibilityOf(IPDflowpages.getpopok()));
			
			Thread.sleep(5000);

			IPDflowpages.getpopok().click();

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			IPDflowpages.getlableprecripstionlink().click();

			Thread.sleep(3000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(IPDflowpages.gettxtOrdPackSearch(), driver, prop.getProperty("orderpacknameA"));
			Thread.sleep(1000);
			utilobj.JSClick(IPDflowpages.getclickorderpackbutton(), driver);

			

			Thread.sleep(3000);

			utilobj.JSClick(IPDflowpages.getorderpackselection(), driver);

			
			Thread.sleep(5000);

			utilobj.JSClick(IPDflowpages.getbtnISaveClose(), driver);
			Thread.sleep(3000);
			utilobj.waitForalert(driver);
			Thread.sleep(3000);

			driver.switchTo().alert().accept();
			Thread.sleep(3000);

			driver.switchTo().window(parent3);
			wait.until(ExpectedConditions.visibilityOf(IPDflowpages.getpopok()));
			Thread.sleep(3000);
			IPDflowpages.getpopok().click();
			Thread.sleep(3000);
			utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
			Thread.sleep(3000);
		}
		
	
	
	@Test(priority = 7)
	@Parameters("browser")
	public void testcaseforLaboratory(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "LABORATORY SERVICE",Browser);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("Laboratory")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Lab Worklist")), driver);
		Thread.sleep(3000);
		if(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).isDisplayed()==true) {
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		}
		
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_imgInPatient")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl08_txtCriteria")).sendKeys(Addmision);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_btnOK")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.id("ctl00_cphpage_btnLast")).isEnabled()==true) {
			System.out.println("hello");
			driver.findElement(By.id("ctl00_cphpage_btnLast")).click();
			Thread.sleep(2000);
			List<WebElement>RowDateOrder=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
			System.out.println(RowDateOrder.size());
			int rowsize=RowDateOrder.size()+1;
			System.out.println(rowsize);
			
				
				
			
			String parent3 = driver.getWindowHandle();
		   	
			utilobj.Window(driver);
			Thread.sleep(2000);
			
			ReqNo=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).getText();
			System.out.println(ReqNo);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);
		
		    utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OPSC_checkboxLink(), driver);
			
		   	Thread.sleep(5000);
		   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);
		   	
		   	Thread.sleep(60000);
		   	utilobj.JSClick(IPDflowpages.getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), driver);
		   	
		   	Thread.sleep(5000);
		   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);
		   	Thread.sleep(60000);
		   	laboratoryresultEntry = driver.getWindowHandle();
		   	Thread.sleep(2000);
			utilobj.Window(driver);
			utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			utilobj.selectDropdown(driver.findElement(By.id("gdvComponents_ctl02_ddlControl")), driver, "A", Browser);
			//IPDflowpages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox().sendKeys("13");
			Thread.sleep(3000);
			IPDflowpages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton().click();
			progress=IPDflowpages.getBlackOverLay().isDisplayed();
			if(progress==true)
			{
				wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
			}
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultEntry);
			//forresultverification
			Thread.sleep(1000);
			laboratoryresultEntry = driver.getWindowHandle();
			Thread.sleep(1000);
			utilobj.Window(driver);
			Thread.sleep(1000);
			utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntry(), driver);
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
            Thread.sleep(3000);
            IPDflowpages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
			Thread.sleep(3000);
			IPDflowpages.getLaboratoryOPworkListImageResultEntrycheckResultcheckBox().click();
			Thread.sleep(3000);
			IPDflowpages.getLaboratoryOPworkListImageResultEntryBtnUpdate().click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(1000);
			driver.switchTo().window(laboratoryresultEntry);
			Thread.sleep(1000);
			laboratoryresultDispatch=driver.getWindowHandle();
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
			driver.close();
			
		   	
			
			
		   	driver.switchTo().window(parent3);
			}
		
		
			else {
				
			
			List<WebElement>RowDateOrder=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
			System.out.println(RowDateOrder.size());
			int rowsize=RowDateOrder.size()+1;
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofMinutes(4));
		System.out.println(rowsize);
		
		String parent3 = driver.getWindowHandle();
	   	
		utilobj.Window(driver);
		Thread.sleep(2000);
		
		ReqNo=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).getText();
		System.out.println(ReqNo);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsize+"]/td[1]")).click();
		
		utilobj.ChildWindow(driver);
		wait1.until(ExpectedConditions.visibilityOf(IPDflowpages.getlaboratory_Requisition_Details_IP_OPSC_checkboxLink()));
		Thread.sleep(2000);
	
		 utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OPSC_checkboxLink(), driver);
			
		   	Thread.sleep(5000);
		   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);
		   	
		   	Thread.sleep(2000);
		   	utilobj.JSClick(IPDflowpages.getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), driver);
		   	
		   	Thread.sleep(2000);
		   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);
		   	Thread.sleep(2000);
	   	laboratoryresultEntry = driver.getWindowHandle();
	   	Thread.sleep(2000);
		utilobj.Window(driver);
		utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntry(), driver);
		Thread.sleep(3000);
		utilobj.ChildWindow(driver);
		
		Thread.sleep(3000);
		utilobj.selectDropdown(driver.findElement(By.id("gdvComponents_ctl02_ddlControl")), driver, "A", Browser);
		//IPDflowpages.getLaboratoryOPworkListImageResultEntryHemoglobinTextBox().sendKeys("13");
		Thread.sleep(3000);
		IPDflowpages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
		Thread.sleep(3000);
		IPDflowpages.getLaboratoryOPworkListImageResultEntrySaveButton().click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnClose")).click();
		Thread.sleep(3000);
		driver.switchTo().window(laboratoryresultEntry);
		//forresultverification
		Thread.sleep(3000);
		laboratoryresultEntry = driver.getWindowHandle();
		Thread.sleep(3000);
		utilobj.Window(driver);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getLaboratoryOPworkListImageResultEntry(), driver);
		Thread.sleep(3000);
		utilobj.ChildWindow(driver);
		Thread.sleep(3000);
		IPDflowpages.getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox().click();
		Thread.sleep(3000);
		IPDflowpages.getLaboratoryOPworkListImageResultEntrycheckResultcheckBox().click();
		Thread.sleep(3000);
		IPDflowpages.getLaboratoryOPworkListImageResultEntryBtnUpdate().click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnClose")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(laboratoryresultEntry);
		Thread.sleep(3000);
			laboratoryresultDispatch=driver.getWindowHandle();
			Thread.sleep(3000);
			utilobj.Window(driver);
			Thread.sleep(3000);
			driver.findElement(By.id("gvTestOrderItems_ctl02_imgresultDispatch")).click();
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(3000);
			driver.findElement(By.id("txtDispatachedTo")).sendKeys("test doctor");
			Thread.sleep(3000);
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnClose")).click();
			Thread.sleep(3000);
			driver.switchTo().window(laboratoryresultDispatch);
			Thread.sleep(3000);
			driver.close();
			Thread.sleep(1000);
	   	driver.switchTo().window(parent3);
		
			}
	}
	@Test(priority = 8)
	@Parameters("browser")
	public void TestcaseforImaggingServices(String Browser) throws InterruptedException {
		Thread.sleep(3000);
   		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
   		Thread.sleep(3000);
	utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
	Thread.sleep(3000);
	utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "IMAGING SERVICES",Browser);
	Thread.sleep(3000);
	utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
	Thread.sleep(3000);
	utilobj.MoveElement(driver.findElement(By.linkText("IMAGING SERVICES")), driver);
	Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.linkText("Worklist")), driver);
	Thread.sleep(3000);
	if(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).isDisplayed()==true) {
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
	}
	
	Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgInPatient")), driver);
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl07_txtCriteria")).sendKeys(Addmision);
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_btnOK")).click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	
	Thread.sleep(3000);
//	String pageStatus= driver.findElement(By.id("//*[@id='ctl00_cphpage_lblPageStatus']")).getText();
//	String numberofpage=pageStatus.substring(pageStatus.length()-1,pageStatus.length());
//	System.out.println("Number of page"+numberofpage);
	
	if(driver.findElement(By.id("ctl00_cphpage_btnLast")).isEnabled()==true)
	{
	driver.findElement(By.id("ctl00_cphpage_btnLast")).click();
	Thread.sleep(2000);
	List<WebElement> rowcount=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
	System.out.println("the size of req is:"+rowcount.size());
	int rowsizeimagging=rowcount.size()+1;
	System.out.println(rowsizeimagging);
String parent3 = driver.getWindowHandle();
   	
	utilobj.Window(driver);
	Thread.sleep(2000);
	ReqNo=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsizeimagging+"]/td[1]")).getText();
	System.out.println(ReqNo);
	driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsizeimagging+"]/td[1]")).click();
	//opdflowPages.getimageWorkListUHIDOKBUtReqNO().click();
	Thread.sleep(3000);
	utilobj.ChildWindow(driver);
	Thread.sleep(3000);
    utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailPAcheckBox(),driver);
	
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailSaveButton(),driver);
   	Thread.sleep(3000);
   
   	wait.until(ExpectedConditions.visibilityOf(IPDflowpages.getimageWorkListReqDetailTPINFOMESSAGE()));
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPINFOMESSAGE(),driver);
   	
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPcheckBox(),driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPInformationyesButton(),driver);
   	Thread.sleep(3000);
   	utilobj.selectDropdown(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ITEMddl(), driver, "Dry Lase Film 14 into 17 inch",Browser);
   	Thread.sleep(3000);
   	utilobj.selectDropdown(IPDflowpages.getimageWorkListReqDetailTP_NOFU_BATCHddl(), driver, "bv32",Browser);
   	Thread.sleep(2000);
   	utilobj.JSEnterText(IPDflowpages.getimageWorkListReqDetailTP_NOFU_Quantity(), driver, "1");
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ButtonADD(), driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ButtonOK(), driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPINFOMESSAGE(),driver);
  
   	parent6 = driver.getWindowHandle();

	utilobj.Window(driver);
	utilobj.JSClick(IPDflowpages.getimgReportEntry(), driver);

	Thread.sleep(3000);

	utilobj.ChildWindow(driver);
	Thread.sleep(3000);
	driver.switchTo().frame("txtEditor_ctl02_ctl00");
	Thread.sleep(3000);
	IPDflowpages.gettxtResultentry().sendKeys(prop.getProperty("resultText"));
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	IPDflowpages.getchkDoctor().click();
	Thread.sleep(3000);
	IPDflowpages.getbtnSave().click();
	Thread.sleep(3000);
	IPDflowpages.getButtonOKpopup().click();
	Thread.sleep(3000);
	IPDflowpages.getchkVerify().click();
	Thread.sleep(3000);
	IPDflowpages.getbtnUpdate().click();
	Thread.sleep(3000);
	IPDflowpages.getButtonOKpopup().click();
	Thread.sleep(3000);
	driver.close();
	driver.switchTo().window(parent6);
	Thread.sleep(3000);
	driver.findElement(By.id("btnTPCancel")).click();
	Thread.sleep(3000);
	imaggingresultDispatch=driver.getWindowHandle();
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
	
	
		List<WebElement> rowcount=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]"));
		System.out.println("the size of req is:"+rowcount.size());
		int rowsizeimagging=rowcount.size()+1;
		System.out.println(rowsizeimagging);
	
	
	
	
    String parent3 = driver.getWindowHandle();
   	
	utilobj.Window(driver);
	Thread.sleep(2000);
	
	ReqNo=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsizeimagging+"]/td[1]")).getText();
	System.out.println(ReqNo);
	driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr["+rowsizeimagging+"]/td[1]")).click();
	Thread.sleep(3000);
	utilobj.ChildWindow(driver);
	Thread.sleep(3000);
	                
    utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailPAcheckBox(),driver);
	
   	Thread.sleep(3000);
   	                
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailSaveButton(),driver);
   	Thread.sleep(3000);
   	
   	wait.until(ExpectedConditions.visibilityOf(IPDflowpages.getimageWorkListReqDetailTPINFOMESSAGE()));
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPINFOMESSAGE(),driver);
   	
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPcheckBox(),driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPInformationyesButton(),driver);
   	Thread.sleep(3000);
   	utilobj.selectDropdown(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ITEMddl(), driver, "Dry Lase Film 14 into 17 inch",Browser);
   	Thread.sleep(3000);
   	utilobj.selectDropdown(IPDflowpages.getimageWorkListReqDetailTP_NOFU_BATCHddl(), driver, "bv32",Browser);
   	Thread.sleep(2000);
   	utilobj.JSEnterText(IPDflowpages.getimageWorkListReqDetailTP_NOFU_Quantity(), driver, "1");
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ButtonADD(), driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTP_NOFU_ButtonOK(), driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getlaboratory_Requisition_Details_savebuttonLink(), driver);
   	Thread.sleep(3000);
   	utilobj.JSClick(IPDflowpages.getimageWorkListReqDetailTPINFOMESSAGE(),driver);
  
   	parent6 = driver.getWindowHandle();

	utilobj.Window(driver);
	utilobj.JSClick(IPDflowpages.getimgReportEntry(), driver);

	Thread.sleep(3000);

	utilobj.ChildWindow(driver);
	Thread.sleep(3000);
	driver.switchTo().frame("txtEditor_ctl02_ctl00");
	Thread.sleep(3000);
	IPDflowpages.gettxtResultentry().sendKeys(prop.getProperty("resultText"));
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	IPDflowpages.getchkDoctor().click();
	Thread.sleep(3000);
	IPDflowpages.getbtnSave().click();
	Thread.sleep(3000);
	IPDflowpages.getButtonOKpopup().click();
	Thread.sleep(3000);
	IPDflowpages.getchkVerify().click();
	Thread.sleep(3000);
	IPDflowpages.getbtnUpdate().click();
	Thread.sleep(3000);
	IPDflowpages.getButtonOKpopup().click();
	Thread.sleep(3000);
	driver.close();
	Thread.sleep(3000);
	driver.switchTo().window(parent6);
	Thread.sleep(3000);
	imaggingresultDispatch=driver.getWindowHandle();
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
	@Test(priority = 9)
	@Parameters("browser")
	public void testcaseforInpatientIssues(String Browser) throws InterruptedException {
  	Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);

		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "STORE SERVICE",Browser);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		
		utilobj.MoveElement(driver.findElement(By.linkText("Stores")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Inpatient Issues")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgBtnAdmissionNo")),driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria"))));
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")), driver, Addmision);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_btnSearch")), driver);//click on serch Button
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp"))));
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_btnSelect")),driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnOK")), driver);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_Grid_ctl02_txtIssueQty"))));
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_Grid_ctl02_txtIssueQty")), driver, "");
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_Grid_ctl02_txtIssueQty")), driver, "3");
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
		
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 10)
	@Parameters("browser")
	public void TestcaseforDischageIntimation(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "ADMINISTRATIVE SERVICES",Browser);
		
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Discharge Intimation")), driver);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ImgBtnAdmin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria")).sendKeys(Addmision);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSearch")).click();
		wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
		wait.until(ExpectedConditions.invisibilityOf(IPDflowpages.getBlackOverLay()));
		Thread.sleep(3000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlRequestType")), driver, "Normal Discharge",Browser);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_txtRemarks")).sendKeys("test Remarks");
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
		//driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getchange_facility_location_linkLink(), driver);
	   	Thread.sleep(3000);
	   	Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(IPDflowpages.getSelectFacilityLocationDDL(), driver, "Male Medical Ward",Browser);
		Thread.sleep(3000);
		Thread.sleep(3000);
		utilobj.JSClick(IPDflowpages.getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("InPatient Management")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Discharge Intimations")), driver);
		Thread.sleep(3000);
	   	driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/div/table/tbody/tr[2]/td[1]/span")).click();
	   	Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
	}
		
	}
	
	

