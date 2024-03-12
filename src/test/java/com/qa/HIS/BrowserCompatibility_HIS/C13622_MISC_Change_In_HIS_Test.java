package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.C13622_MISC_Change_In_HIS_Page;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class C13622_MISC_Change_In_HIS_Test extends CrossBrowser {
	public C13622_MISC_Change_In_HIS_Test() {
		
	}
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	String getUhid=null;
	String checkIN=null;
	Loginpage loginpage;
	C13622_MISC_Change_In_HIS_Page MISC;
	String PresentPrimaryMobileNumberLableText;
	String PermanantPrimaryMobileNumberLableText;
	String PresentAlternativeMobileNumberLableText;
	String PermanantAlternativeMobileNumberLableText;
	String getMobileNumber;
	String getMobileNumberpermanant;
	util utilobj = new util();
	String date;
	String splitdate;
	String splitOrderdate;
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {// 	OPGENE042100042

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}
@Test(priority = 3)
public void Do_navigatetoUHID_Screen() {
	MISC=hishomepage.doNavigateToUHID_SCreen();
}
@Test(priority = 4)
public void Do_testForFatchingDetailForIPSelf() throws InterruptedException {
	//fatch the detail for IP Self and Match the Detail
	Thread.sleep(2000);
	MISC.getInsuranceTxtBox().sendKeys("1100099900");//enter ip 
	Thread.sleep(2000);
	MISC.getLiveListLink().click();//click on link
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
	wait.until(ExpectedConditions.visibilityOf(MISC.getLiveListSelfRadioButton())); 
	MISC.getLiveListSelfRadioButton().click();//select radio Button
	Thread.sleep(2000);
	MISC.getLiveListSelectButton().click();//click on select 
	wait.until(ExpectedConditions.invisibilityOf(MISC.getprogressimage()));
	
	Thread.sleep(2000);
	PresentPrimaryMobileNumberLableText=MISC.getpresentPrimaryMobileNumberLable().getAttribute("value");//get present primary mobile number
	Thread.sleep(2000);
	 PermanantPrimaryMobileNumberLableText=MISC.getParmanantPrimaryMobileNumberLable().getAttribute("value");//get permanent Mobile number
	 Thread.sleep(2000);
	 PresentAlternativeMobileNumberLableText=MISC.getpresentAlternativeMobileNumberLable().getText();//get present alternative mobile number
	 Thread.sleep(2000);
	 PermanantAlternativeMobileNumberLableText=MISC.getParmanantAlternativeMobileNumberLable().getText();//get present alternative mobile number
	 Thread.sleep(2000);
	 getMobileNumber=MISC.getPresentPrimaryMobileNumberTextBox().getAttribute("value");//get mobile number
	 Thread.sleep(2000);
	 getMobileNumberpermanant=MISC.getParmanantPrimaryMobileNumberTextbox().getAttribute("value");//get mobile number permanant
	 Thread.sleep(2000);
	 System.out.println(PresentPrimaryMobileNumberLableText+" "+PermanantPrimaryMobileNumberLableText+" "+PresentAlternativeMobileNumberLableText+" "+PermanantAlternativeMobileNumberLableText+" "+getMobileNumber+" "+getMobileNumberpermanant);
	 Thread.sleep(2000);
//	 assertEquals(PresentPrimaryMobileNumberLableText, "Primary Contact No");
//	 Thread.sleep(2000);
//		assertEquals(PermanantPrimaryMobileNumberLableText, "Primary Contact No");
//		Thread.sleep(2000);
//		assertEquals(PresentAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(PermanantAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(getMobileNumber,getMobileNumberpermanant);
		Thread.sleep(2000);
	 
	 
}
//@Test(priority = 5)
//public void Do_testForFatchingDetailForIPDepandent() throws InterruptedException {
//	//fatch the detail for IP Depandent and Match the Detail
//	Thread.sleep(2000);
//	MISC.getUHIDScreen_clearButton().click();
//	Thread.sleep(2000);
//	MISC.getInsuranceTxtBox().sendKeys("1100099900");
//	Thread.sleep(2000);
//	MISC.getLiveListLink().click();
//	Thread.sleep(2000);
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
//	wait.until(ExpectedConditions.visibilityOf(MISC.getLiveListDepandentRadioButton()));
//	MISC.getLiveListDepandentRadioButton().click();
//	Thread.sleep(2000);
//	MISC.getLiveListSelectButton().click();
//	Thread.sleep(2000);
//	PresentPrimaryMobileNumberLableText=MISC.getpresentPrimaryMobileNumberLable().getText();//get present primary mobile number
//	Thread.sleep(2000);
//	 PermanantPrimaryMobileNumberLableText=MISC.getParmanantPrimaryMobileNumberLable().getText();//get permanent Mobile number
//	 Thread.sleep(2000);
//	 PresentAlternativeMobileNumberLableText=MISC.getpresentAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 PermanantAlternativeMobileNumberLableText=MISC.getParmanantAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 getMobileNumber=MISC.getPresentPrimaryMobileNumberTextBox().getAttribute("value");//get mobile number
//	 Thread.sleep(2000);
//	 getMobileNumberpermanant=MISC.getParmanantPrimaryMobileNumberTextbox().getAttribute("value");//get mobile number permanant
//	 Thread.sleep(2000);
//	 System.out.println(PresentPrimaryMobileNumberLableText+" "+PermanantPrimaryMobileNumberLableText+" "+PresentAlternativeMobileNumberLableText+" "+PermanantAlternativeMobileNumberLableText+" "+getMobileNumber+" "+getMobileNumberpermanant);
//	 Thread.sleep(2000);
//	 assertEquals(PresentPrimaryMobileNumberLableText, "Primary Contact No");
//	 Thread.sleep(2000);
//		assertEquals(PermanantPrimaryMobileNumberLableText, "Primary Contact No");
//		Thread.sleep(2000);
//		assertEquals(PresentAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(PermanantAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(getMobileNumber,getMobileNumberpermanant);
//	
//	
//}
//@Test(priority = 6)
//public void Do_testFatchingDetailForESICEmployeeSelf() throws InterruptedException {
//	//fatch the detail for Esic Employee Self and Match the Detail
//	Thread.sleep(2000);
//	MISC.getUHIDScreen_clearButton().click();
//	Thread.sleep(2000);
//	MISC.getESICEmployeeRadioButton().click();
//	Thread.sleep(2000);
//	MISC.getInsuranceTxtBox().sendKeys("147267");
//	Thread.sleep(2000);
//	MISC.getLiveListLink().click();
//	Thread.sleep(2000);
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
//	wait.until(ExpectedConditions.visibilityOf(MISC.getUHIDScreen_ESICEmployeeSelfRadioButton()));
//	MISC.getUHIDScreen_ESICEmployeeSelfRadioButton().click();
//	Thread.sleep(2000);
//	MISC.getLiveListSelectButton().click();
//	Thread.sleep(2000);
//	PresentPrimaryMobileNumberLableText=MISC.getpresentPrimaryMobileNumberLable().getText();//get present primary mobile number
//	Thread.sleep(2000);
//	 PermanantPrimaryMobileNumberLableText=MISC.getParmanantPrimaryMobileNumberLable().getText();//get permanent Mobile number
//	 Thread.sleep(2000);
//	 PresentAlternativeMobileNumberLableText=MISC.getpresentAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 PermanantAlternativeMobileNumberLableText=MISC.getParmanantAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 getMobileNumber=MISC.getPresentPrimaryMobileNumberTextBox().getAttribute("value");//get mobile number
//	 Thread.sleep(2000);
//	 getMobileNumberpermanant=MISC.getParmanantPrimaryMobileNumberTextbox().getAttribute("value");//get mobile number permanant
//	 Thread.sleep(2000);
//	 System.out.println(PresentPrimaryMobileNumberLableText+" "+PermanantPrimaryMobileNumberLableText+" "+PresentAlternativeMobileNumberLableText+" "+PermanantAlternativeMobileNumberLableText+" "+getMobileNumber+" "+getMobileNumberpermanant);
//	 Thread.sleep(2000);
//	 assertEquals(PresentPrimaryMobileNumberLableText, "Primary Contact No");
//	 Thread.sleep(2000);
//		assertEquals(PermanantPrimaryMobileNumberLableText, "Primary Contact No");
//		Thread.sleep(2000);
//		assertEquals(PresentAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(PermanantAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(getMobileNumber,getMobileNumberpermanant);
//	
//}
//@Test(priority = 7)
//public void Do_TestFatchingDetailForESICEmployeeDepandents() throws InterruptedException {
//	//fatch the detail for Esic Employee Depandent and Match the Detail
//	Thread.sleep(2000);
//	MISC.getUHIDScreen_clearButton().click();
//	Thread.sleep(2000);
//	MISC.getESICEmployeeRadioButton().click();
//	Thread.sleep(2000);
//	MISC.getInsuranceTxtBox().sendKeys("147267");
//	Thread.sleep(2000);
//	MISC.getLiveListLink().click();
////	Thread.sleep(2000);
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
//	wait.until(ExpectedConditions.visibilityOf(MISC.getUHIDScreen_ESICEmployeeSelfRadioButton()));
//	MISC.getUHIDScreen_ESICEmployeeSelfRadioButton().click();
//	MISC.getUHIDScreen_ESICEmployeeDepandentRadioButton().click();
//	Thread.sleep(2000);
//	MISC.getLiveListSelectButton().click();
//	Thread.sleep(2000);
//	PresentPrimaryMobileNumberLableText=MISC.getpresentPrimaryMobileNumberLable().getText();//get present primary mobile number
//	Thread.sleep(2000);
//	 PermanantPrimaryMobileNumberLableText=MISC.getParmanantPrimaryMobileNumberLable().getText();//get permanent Mobile number
//	 Thread.sleep(2000);
//	 PresentAlternativeMobileNumberLableText=MISC.getpresentAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 PermanantAlternativeMobileNumberLableText=MISC.getParmanantAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 getMobileNumber=MISC.getPresentPrimaryMobileNumberTextBox().getAttribute("value");//get mobile number
//	 Thread.sleep(2000);
//	 getMobileNumberpermanant=MISC.getParmanantPrimaryMobileNumberTextbox().getAttribute("value");//get mobile number permanant
//	 Thread.sleep(2000);
//	 System.out.println(PresentPrimaryMobileNumberLableText+" "+PermanantPrimaryMobileNumberLableText+" "+PresentAlternativeMobileNumberLableText+" "+PermanantAlternativeMobileNumberLableText+" "+getMobileNumber+" "+getMobileNumberpermanant);
//	 Thread.sleep(2000);
//	 assertEquals(PresentPrimaryMobileNumberLableText, "Primary Contact No");
//	 Thread.sleep(2000);
//		assertEquals(PermanantPrimaryMobileNumberLableText, "Primary Contact No");
//		Thread.sleep(2000);
//		assertEquals(PresentAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(PermanantAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(getMobileNumber,getMobileNumberpermanant);
//}
//@Test(priority = 8)
//public void Do_testFatchingDetailForESICPensionerSelf() throws InterruptedException {
//	//fatch the detail for Esic Pensioner Self and Match the Detail
//	Thread.sleep(2000);
//	MISC.getUHIDScreen_clearButton().click();
//	Thread.sleep(2000);
//	MISC.getESICPensionerRadioButton().click();
//	Thread.sleep(2000);
//	MISC.getInsuranceTxtBox().sendKeys("116223");
//	Thread.sleep(2000);
//	MISC.getLiveListLink().click();
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_Grdhrms_ctl02_chkHRMSUHID"))));
//	
//	driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_Grdhrms_ctl02_chkHRMSUHID")).click();
//	
//	Thread.sleep(2000);
//	MISC.getLiveListSelectButton().click();
//	Thread.sleep(2000);
//	PresentPrimaryMobileNumberLableText=MISC.getpresentPrimaryMobileNumberLable().getText();//get present primary mobile number
//	Thread.sleep(2000);
//	 PermanantPrimaryMobileNumberLableText=MISC.getParmanantPrimaryMobileNumberLable().getText();//get permanent Mobile number
//	 Thread.sleep(2000);
//	 PresentAlternativeMobileNumberLableText=MISC.getpresentAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 PermanantAlternativeMobileNumberLableText=MISC.getParmanantAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 getMobileNumber=MISC.getPresentPrimaryMobileNumberTextBox().getAttribute("value");//get mobile number
//	 Thread.sleep(2000);
//	 getMobileNumberpermanant=MISC.getParmanantPrimaryMobileNumberTextbox().getAttribute("value");//get mobile number permanant
//	 Thread.sleep(2000);
//	 System.out.println(PresentPrimaryMobileNumberLableText+" "+PermanantPrimaryMobileNumberLableText+" "+PresentAlternativeMobileNumberLableText+" "+PermanantAlternativeMobileNumberLableText+" "+getMobileNumber+" "+getMobileNumberpermanant);
//	 Thread.sleep(2000);
//	 assertEquals(PresentPrimaryMobileNumberLableText, "Primary Contact No");
//	 Thread.sleep(2000);
//		assertEquals(PermanantPrimaryMobileNumberLableText, "Primary Contact No");
//		Thread.sleep(2000);
//		assertEquals(PresentAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(PermanantAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(getMobileNumber,getMobileNumberpermanant);
//	
//}
//@Test(priority = 9)
//public void Do_TestFatchingDetailForESICPensionerDepandents() throws InterruptedException {
//	//fatch the detail for Esic Pensioner Depandent and Match the Detail
//	Thread.sleep(2000);
//	MISC.getUHIDScreen_clearButton().click();
//	Thread.sleep(2000);
//	MISC.getESICPensionerRadioButton().click();
//	Thread.sleep(2000);
//	MISC.getInsuranceTxtBox().sendKeys("116223");
//	Thread.sleep(2000);
//	MISC.getLiveListLink().click();
//	Thread.sleep(2000);
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_Grdhrms_ctl04_chkHRMSUHID"))));
//	driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_Grdhrms_ctl04_chkHRMSUHID")).click();
//	
//	Thread.sleep(2000);
//	MISC.getLiveListSelectButton().click();
//	Thread.sleep(2000);
//	PresentPrimaryMobileNumberLableText=MISC.getpresentPrimaryMobileNumberLable().getText();//get present primary mobile number
//	Thread.sleep(2000);
//	 PermanantPrimaryMobileNumberLableText=MISC.getParmanantPrimaryMobileNumberLable().getText();//get permanent Mobile number
//	 Thread.sleep(2000);
//	 PresentAlternativeMobileNumberLableText=MISC.getpresentAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 PermanantAlternativeMobileNumberLableText=MISC.getParmanantAlternativeMobileNumberLable().getText();//get present alternative mobile number
//	 Thread.sleep(2000);
//	 getMobileNumber=MISC.getPresentPrimaryMobileNumberTextBox().getAttribute("value");//get mobile number
//	 Thread.sleep(2000);
//	 getMobileNumberpermanant=MISC.getParmanantPrimaryMobileNumberTextbox().getAttribute("value");//get mobile number permanant
//	 Thread.sleep(2000);
//	 System.out.println(PresentPrimaryMobileNumberLableText+" "+PermanantPrimaryMobileNumberLableText+" "+PresentAlternativeMobileNumberLableText+" "+PermanantAlternativeMobileNumberLableText+" "+getMobileNumber+" "+getMobileNumberpermanant);
//	 Thread.sleep(4000);
//	 assertEquals(PresentPrimaryMobileNumberLableText, "Primary Contact No");
//	 Thread.sleep(2000);
//		assertEquals(PermanantPrimaryMobileNumberLableText, "Primary Contact No");
//		Thread.sleep(2000);
//		assertEquals(PresentAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(PermanantAlternativeMobileNumberLableText, "Alternate Contact No");
//		Thread.sleep(2000);
//		assertEquals(getMobileNumber,getMobileNumberpermanant);
//}

@Test(priority = 10)
public void Do_NavigateToPatientCheck_in() throws InterruptedException {
	MISC=hishomepage.doNavigateToCheckIn_SCreenForMISC_Change_In_HISITR1();

	
}
//IP number
@Test(priority = 11)
public void Do_testFatchingdetailforIPSelf() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	wait.until(ExpectedConditions.visibilityOf(MISC.getPatientCheckIn_IPtextBox()));
	Thread.sleep(2000);
	MISC.getPatientCheckIn_IPtextBox().sendKeys("1100099900");
	Thread.sleep(2000);
	MISC.getLiveListLink().click();
	
	wait.until(ExpectedConditions.visibilityOf(MISC.getLiveListSelfRadioButton()));
	MISC.getLiveListSelfRadioButton().click();
	Thread.sleep(2000);
	MISC.getLiveListSelectButton().click();
	Thread.sleep(2000);
	PresentPrimaryMobileNumberLableText=MISC.getCheckIn_ContectNumberLable().getText();
	Thread.sleep(2000);
	getMobileNumber=MISC.getCheckIn_ContectNumberTextBox().getAttribute("value");
	Thread.sleep(2000);
	assertEquals(PresentPrimaryMobileNumberLableText,"Contact No.");	
}

//@Test(priority = 12)
//public void do_testFatchingdetailforIPDepandent() throws InterruptedException {
//	Thread.sleep(2000);
//	MISC.getUHIDScreen_clearButton().click();
//	Thread.sleep(2000);
//	MISC.getPatientCheckIn_IPtextBox().sendKeys("1100099900");
//	Thread.sleep(2000);
//	MISC.getLiveListLink().click();
//	Thread.sleep(2000);
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
//	wait.until(ExpectedConditions.visibilityOf(MISC.getLiveListDepandentRadioButton()));
//	MISC.getLiveListDepandentRadioButton().click();
//	Thread.sleep(2000);
//	MISC.getLiveListSelectButton().click();
//	Thread.sleep(2000);
//	PresentPrimaryMobileNumberLableText=MISC.getCheckIn_ContectNumberLable().getText();
//	Thread.sleep(2000);
//	assertEquals(PresentPrimaryMobileNumberLableText,"Contact No.");
//	
//}
@Test(priority = 13)
public void Do_testCreateCheckInforPharmacyIssue() throws InterruptedException {
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
	MISC.getUHIDScreen_clearButton().click();
	Thread.sleep(2000);
	MISC.getPatientCheckIn_IPtextBox().sendKeys("1100099900");
	Thread.sleep(2000);
	MISC.getLiveListLink().click();
	wait.until(ExpectedConditions.visibilityOf(MISC.getLiveListSelfRadioButton()));
	MISC.getLiveListSelfRadioButton().click();
	Thread.sleep(2000);
	MISC.getLiveListSelectButton().click();

	
	wait.until(ExpectedConditions.invisibilityOf(MISC.getBlackOverlay()));
	
	Thread.sleep(4000);
	//PM10639.getpatientCheckInNumberSeviceOkButton().click();
	utilobj.JSClick(MISC.getpatientCheckInNumberSeviceOkButton(), driver);
Thread.sleep(4000);
// 
MISC.getpatientCheckInNumberSaveButton().click();
Thread.sleep(4000);

System.out.println(MISC.getPopupmessage().getText());
System.out.println(utilobj.GetCheckinNumberText(MISC.getPopupmessage(), driver));

checkIN = utilobj.GetCheckinNumberText(MISC.getPopupmessage(), driver);
}
@Test(priority = 14)
@Parameters("browser")
public void dodoctorworklist(String Browser) throws InterruptedException {
	MISC.getBtncancel().click();
	Thread.sleep(1000);
	getUhid= MISC.getUHID_creation_Uhid_txtbox().getAttribute("value");
	Thread.sleep(3000);
	System.out.println(getUhid);
	
	Thread.sleep(1000);
	utilobj.MoveElement(MISC.getClinicalRecordsLink(), driver);
	Thread.sleep(2000);
	MISC.getDoctorWorklistLink().click();
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	wait.until(ExpectedConditions.visibilityOf(MISC.getdoctorworklist_checkintextBox()));
	Thread.sleep(2000);
	utilobj.JSEnterText(MISC.getdoctorworklist_checkintextBox(), driver, checkIN);
	Thread.sleep(2000);

utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);


	
		Thread.sleep(2000);

		MISC.getpopupok().click();
		
		
	

		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		MISC.getlableprecripstionlink().click();

		Thread.sleep(2000);

		
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);

		
		System.out.println(driver.getTitle());

		utilobj.JSEnterText(MISC.gettxtOrdPackSearch(), driver, "AutomationdummyOrderPack");

		utilobj.JSClick(MISC.getclickorderpackbutton(), driver);

		
		Thread.sleep(3000);

		utilobj.JSClick(MISC.getorderpackselection(), driver);

		
		utilobj.JSClick(MISC.getbtnISaveClose(), driver);
		Thread.sleep(1000);
		utilobj.waitForalert(driver);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().window(parent3);
		Thread.sleep(1000);
		MISC.getpopupok().click();
		Thread.sleep(4000);
		utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[1]/tbody/tr[1]/td/span")));
		Thread.sleep(5000);
		date=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[2]/tbody/tr[2]/td/a[1]")).getText();
		System.out.println(date);
		splitdate=date.substring(0, 17);
		System.out.println(splitdate);
		Thread.sleep(1000);
}

@Test(priority = 15)
@Parameters("browser")
public void Do_Test_for_ChaangeLocationForStoreServices(String Browser) throws InterruptedException {
	
	Thread.sleep(2000);	
	MISC.getchange_facility_location_linkLink().click();//click on change Location
	Thread.sleep(2000);	
	hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),prop.getProperty("StoreServices"),Browser);//select location and facility
	Thread.sleep(2000);	
	MISC=hishomepage.doNavigateToPharmacyIssueforMISC();//navigate to pharmacy issue
	Thread.sleep(2000);	
	
	
}
@Test(priority = 16)
public void Do_Test_for_pharmacyIssue() throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
	MISC.getStoreUhidTextBox().sendKeys(checkIN);
	Thread.sleep(2000);
	MISC.getStoreUhidImgSerch().click();
	wait.until(ExpectedConditions.invisibilityOf(MISC.getBlackOverlay()));
	MISC.getStoreUhidIssueQuantity().clear();
	
	Thread.sleep(10000);
	MISC.getStoreUhidIssueQuantity().sendKeys("3");
	Thread.sleep(2000);
	MISC.getStoreUhidIssueSaveButton().click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
	Thread.sleep(2000);
	utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
	Thread.sleep(2000);
}
@Test(priority = 17)
@Parameters("browser")
public void Do_Test_for_ChangeLocation(String Browser) throws InterruptedException {
	Thread.sleep(2000);	
	MISC.getchange_facility_location_linkLink().click();//click on change Location
	Thread.sleep(2000);	
hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
		prop.getProperty("facilityName"),Browser);
}
@Test(priority = 18)
public void Do_test_for_Last10Prescription() throws InterruptedException {
	Thread.sleep(1000);
	utilobj.MoveElement(MISC.getClinicalRecordsLink(), driver);
	Thread.sleep(2000);
	MISC.getDoctorWorklistLink().click();
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	wait.until(ExpectedConditions.visibilityOf(MISC.getdoctorworklist_checkintextBox()));
	Thread.sleep(2000);
	utilobj.JSEnterText(MISC.getdoctorworklist_checkintextBox(), driver, checkIN);
	Thread.sleep(2000);

utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);


	
		Thread.sleep(2000);

		MISC.getpopupok().click();
		Thread.sleep(2000);
		
	

		String parent3 = driver.getWindowHandle();
		Thread.sleep(2000);
		utilobj.Window(driver);
		Thread.sleep(2000);
		MISC.getlableprecripstionlink().click();

		Thread.sleep(2000);

		
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
        String paraent4=driver.getWindowHandle();
        Thread.sleep(2000);
        utilobj.Window(driver);
        Thread.sleep(2000);
		MISC.getLastTenPrescriptionButton().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		String Issuequantity= driver.findElement(By.xpath("/html/body/form/div[3]/div/table/tbody/tr[1]/th[26]")).getText();
		System.out.println(Issuequantity);
		Thread.sleep(1000);
		String NotelblText= driver.findElement(By.id("lblNote")).getText();
		System.out.println(NotelblText);
		Thread.sleep(1000);
		driver.findElement(By.id("btnClose")).click(); 
		Thread.sleep(1000);
		driver.switchTo().window(paraent4);
		Thread.sleep(1000);
		driver.findElement(By.id("btnIClose")).click();
		Thread.sleep(1000);
		String StockStationWiseLinkText=driver.findElement(By.id("lnkresults")).getText();
		System.out.println(StockStationWiseLinkText);
		Thread.sleep(1000);
		driver.switchTo().window(parent3);
		
		Thread.sleep(1000);
		assertEquals(Issuequantity, "Issued Quantity*");
		assertEquals(NotelblText, "Note - *Information retrieved");
		
		//MISC.getpopupok().click();
		

}





}
