package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.DoctorWorklistPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;

import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class DoctorWorklistTest extends CrossBrowser {

	public DoctorWorklistTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	DoctorWorklistPage DWP;
	PatientCheckInPage patientcheckInpage;
	util utilobj = new util();
	String txtcheckInNumber;
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
	public void doNavigateToPatientCheckInTest() {

		
		DWP=hishomepage.doNavigateToPatientCheckInforDoctorWorklist();
	}

	@Test(priority = 4)
	@Parameters("browser")
	public void doPatientCheckINTest(String Browser) throws InterruptedException {


		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
			DWP.getTxtIPNO().sendKeys("1100099900");
			DWP.getLnkbtnIPNo().click();
			 Thread.sleep(2000);
			DWP.getHisLiveListControlchkUHID().click();
			 Thread.sleep(2000);
			 
			DWP.getHisLiveListControlbtnSelect().click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]")));
			DWP.getBtnSaveDisplay().isEnabled();
			Thread.sleep(3000);
		
			Thread.sleep(3000);
			
			utilobj.ActionClick(DWP.getBtnOK(), driver);

			
			Thread.sleep(5000);

			
			DWP.getBtnSaveDisplay().click();
			Thread.sleep(2000);
			
			

		}

		



	

	
	@Test(priority = 5)
	public void doNavigateToDoctorWorklistTest() throws InterruptedException {

		
		System.out.println(DWP.getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(DWP.getPopupmessage(), driver));

		 txtcheckInNumber  = utilobj.GetCheckinNumberText(DWP.getPopupmessage(), driver);

		DWP.getBtncancel().click();
		
	    
	  
		
		DWP = hishomepage.donavigatetoDoctorworklist();
	
		
		
		
		
		
	}
@Test(priority = 6)
public void CLM_Dr_worklist_TC_4() throws InterruptedException {
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	wait.until(ExpectedConditions.visibilityOf(DWP.getcheckin_no_link_Link()));
	DWP.getTxtboxCheckInno().sendKeys(txtcheckInNumber);
	Thread.sleep(2000);
	DWP.getimgCheckinnosearch().click();
	Thread.sleep(2000);
	utilobj.JSClick(DWP.getOpenStanderdCaseSheet(), driver);
	//DWP.getOpenStanderdCaseSheet().click();
	Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
DWP.getpopok().click();
	wait.until(ExpectedConditions.visibilityOf(DWP.getlableprecripstionlink()));
	
	//DWP.getpopok().click();
	Thread.sleep(2000);
//	String parent3 = driver.getWindowHandle();
//
//	utilobj.Window(driver);
//
//	DWP.getlableprecripstionlink().click();
//
//	Thread.sleep(2000);
//
//	
//	utilobj.ChildWindow(driver);
//	Thread.sleep(2000);
//
//	wait.until(ExpectedConditions.visibilityOf(DWP.gettxtOrdPackSearch()));
//	System.out.println(driver.getTitle());
//
//	utilobj.JSEnterText(DWP.gettxtOrdPackSearch(), driver, "Automation");
//	Thread.sleep(2000);
//
//	utilobj.JSClick(DWP.getclickorderpackbutton(), driver);
//	
//
//	
//	Thread.sleep(5000);
//
//	utilobj.JSClick(DWP.getorderpackselection(), driver);
//
//	Thread.sleep(5000);
//
//	utilobj.JSClick(DWP.getbtnISaveClose(), driver);
//
//	utilobj.waitForalert(driver);
//
//	driver.switchTo().alert().accept();
//	driver.switchTo().window(parent3);
//
//	driver.switchTo().defaultContent();
//	wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
//	DWP.getpopok().click();




//	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm aaa");
//	  Calendar cal = Calendar.getInstance();
//String Date = sdf.format(cal.getTime());
//System.out.println(Date);
//Thread.sleep(5000);
//
//utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[1]/tbody/tr[1]/td/span")));
//Thread.sleep(5000);
//String text= driver.findElement(By.linkText(Date)).getText();
//System.out.println("the text of a tag:- "+text);
//Thread.sleep(5000);
//utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/div/div/div/table/tbody/tr[1]/td/span")));
//Thread.sleep(5000);
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,400)");
//
//Thread.sleep(2000);
//JavascriptExecutor js2 = (JavascriptExecutor) driver;
//js2.executeScript("window.scrollTo(400,0)");
//
//assertEquals(text, Date);
}
@Test(priority = 7)
@Parameters("browser")
public void CLM_Dr_worklist_TC_5(String Browser) throws InterruptedException {
	DWP = hishomepage.donavigatetoDoctorworklist();
	Thread.sleep(2000);
	boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
	if(message==true) {
		
		DWP.getDoctorworkListInfo_buttonOK().click();
		
		
	}
	DWP.getDoctorworkListconsultent().click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	wait.until(ExpectedConditions.visibilityOf(DWP.getConsultenttabCheck_no_link()));
	
	DWP.getConsultenttabCheck_no_link().click();
	wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
	DWP.getpopok().click();
	utilobj.scroolDownintoview(driver, DWP.getcaseSheetAdviceLink());
	
	Thread.sleep(2000);
	String parent3 = driver.getWindowHandle();

	utilobj.Window(driver);

	DWP.getcaseSheetAdviceLink().click();

	Thread.sleep(2000);

	
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	wait.until(ExpectedConditions.visibilityOf(DWP.getRefferalRadiobutoon()));
	Thread.sleep(2000);
	utilobj.JSClick(DWP.getRefferalRadiobutoon(), driver);
	//DWP.getRefferalRadiobutoon().click();
	Thread.sleep(2000);
	utilobj.selectDropdown(DWP.getSpecializationDDL(), driver, "General Medicine", Browser);
	Thread.sleep(10000);
	DWP.getReasonTextbox().sendKeys("Test");
	Thread.sleep(10000);
	DWP.getaddButton().click();
	Thread.sleep(10000);
	DWP.getSave_closeButton().click();
	
//	utilobj.waitForalert(driver);
//
//	driver.switchTo().alert().accept();
	driver.switchTo().window(parent3);

	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
	DWP.getpopok().click();
	

	
}
@Test(priority = 8)
public void CLM_Dr_worklist_TC_6() throws InterruptedException {
	DWP = hishomepage.donavigatetoDoctorworklist();
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
	boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
	if(message==true) {
		
		DWP.getDoctorworkListInfo_buttonOK().click();
		
		
	}
	DWP.getDoctorworkListReferral().click();
	wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral_Link()));
	DWP.getDoctorworkListReferral_Link().click();
	wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
	DWP.getpopok().click();
	
	
	
}
@Test(priority = 10)
public void CLM_Dr_worklist_TC_10() throws InterruptedException {
	Thread.sleep(2000);
	DWP = hishomepage.donavigatetoDoctorworklist();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
	boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
	if(message==true) {
		
		DWP.getDoctorworkListInfo_buttonOK().click();
		
		
	}
	Thread.sleep(2000);
	DWP.getTxtboxCheckInno().sendKeys(txtcheckInNumber);
	Thread.sleep(2000);
	DWP.getimgCheckinnosearch().click();
	wait.until(ExpectedConditions.visibilityOf(DWP.getOpenMiniCaseSheet()));
	Thread.sleep(2000);
	DWP.getOpenStanderdCaseSheet().click();
	Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));//check in nu se casesheet open
DWP.getpopok().click();


	
}
@Test(priority = 9)
public void CLM_Dr_worklist_TC_11() throws InterruptedException {
	Thread.sleep(2000);
	DWP = hishomepage.donavigatetoDoctorworklist();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
	boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
	if(message==true) {
		
		DWP.getDoctorworkListInfo_buttonOK().click();
		
		
	}
	Thread.sleep(2000);
	DWP.getTxtboxCheckInno().sendKeys(txtcheckInNumber);
	Thread.sleep(2000);
	DWP.getimgCheckinnosearch().click();
	wait.until(ExpectedConditions.visibilityOf(DWP.getOpenMiniCaseSheet()));
	Thread.sleep(2000);
	DWP.getOpenMiniCaseSheet().click();
	Thread.sleep(2000);
wait.until(ExpectedConditions.invisibilityOf(DWP.getOpenMiniCaseSheet()));//check in nu se mini sheet open
Thread.sleep(2000);
	
}
@Test(priority = 11)
public void CLM_Dr_worklist_TC_12() throws InterruptedException {
	Thread.sleep(2000);
WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));

DWP = hishomepage.donavigatetoDoctorworklist();//
wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
if(message==true) {
	
	DWP.getDoctorworkListInfo_buttonOK().click();
	
	
}
Thread.sleep(2000);
DWP.getTxtboxCheckInno().sendKeys(txtcheckInNumber);
Thread.sleep(2000);
DWP.getimgCheckinnosearch().click();
Thread.sleep(2000);
DWP.getClosedButton().click();//check in nu se closed buttn
}
@Test(priority = 12)
public void CLM_Dr_worklist_TC_15() throws InterruptedException {
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	DWP.getDWLInsuranceNumberTxtbox().sendKeys("1100099900");
	Thread.sleep(2000);
	DWP.getDWLInsuranceSearchImage().click();
	
	Thread.sleep(8000);
	DWP.getOpenStanderdCaseSheet().click();
	Thread.sleep(1000);
wait.until(ExpectedConditions.invisibilityOf(DWP.getOpenStanderdCaseSheet()));
Thread.sleep(2000);

wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
DWP.getpopok().click();//ip se  casesheet open
}

@Test(priority = 13)
public void CLM_Dr_worklist_TC_16() throws InterruptedException {
Thread.sleep(2000);
DWP = hishomepage.donavigatetoDoctorworklist();
WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
if(message==true) {
	DWP.getDoctorworkListInfo_buttonOK().click();	
}
Thread.sleep(2000);
DWP.getDWLInsuranceNumberTxtbox().sendKeys("1100099900");
Thread.sleep(2000);
DWP.getDWLInsuranceSearchImage().click();
Thread.sleep(2000);
DWP.getOpenMiniCaseSheet().click();
Thread.sleep(2000);
wait.until(ExpectedConditions.invisibilityOf(DWP.getOpenMiniCaseSheet()));//ip  se minisheet open
Thread.sleep(2000);
	
}

@Test(priority = 14)
public void CLM_Dr_worklist_TC_17() throws InterruptedException {
	DWP=hishomepage.doNavigateToPatientCheckInforDoctorWorklist();//go to check in screen
	//make a check in
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	DWP.getTxtIPNO().sendKeys("1100099900");
	DWP.getLnkbtnIPNo().click();
	 Thread.sleep(2000);
	DWP.getHisLiveListControlchkUHID().click();
	 Thread.sleep(2000);
	 
	DWP.getHisLiveListControlbtnSelect().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]")));
	DWP.getBtnSaveDisplay().isEnabled();
	Thread.sleep(3000);

	Thread.sleep(3000);
	
	utilobj.ActionClick(DWP.getBtnOK(), driver);

	
	Thread.sleep(5000);

	
	DWP.getBtnSaveDisplay().click();
	Thread.sleep(2000);
	DWP.getBtncancel().click();
	Thread.sleep(2000);
	DWP = hishomepage.donavigatetoDoctorworklist();//go to doctor worklist
	
	wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
	boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
	if(message==true) {
		DWP.getDoctorworkListInfo_buttonOK().click();	
	}
	
		DWP.getDWLMiniSheetOpenLink().click();//click on mini sheet
	
		Thread.sleep(4000);
}
@Test(priority = 15)
public void CLM_Dr_worklist_TC_3() throws InterruptedException {//cancel chek in
	Thread.sleep(2000);
	DWP = hishomepage.donavigatetoDoctorworklist();//
	Thread.sleep(2000);
	DWP.getDoctorworkListCancelcheckIN().click();
	Thread.sleep(2000);
	DWP.getDoctorworkListCancelcheckINNoButton().click();//click on no button
	Thread.sleep(2000);
	DWP.getDoctorworkListCancelcheckIN().click();
	Thread.sleep(2000);
	DWP.getDoctorworkListCancelcheckINYesButton().click();
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_txtReason")).sendKeys("test reason");
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_btnOK")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
	
}

}
