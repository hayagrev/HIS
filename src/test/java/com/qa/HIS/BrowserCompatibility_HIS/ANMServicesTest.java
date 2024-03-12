package com.qa.HIS.BrowserCompatibility_HIS;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.ANMServicesPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;

import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class ANMServicesTest extends CrossBrowser {

	public ANMServicesTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	//OPCaseSheetPage opCaseSheetPage;
	PatientCheckInPage patientcheckInpage;
    ANMServicesPage anmservicespage;
    String txtcheckInNumber;
    util utilobj = new util();

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

		anmservicespage = hishomepage.doNavigateToPatientCheckInforANMServices();
	}
	
	@Test(priority = 4)
	@Parameters("browser")
	public void doPatientCheckINTest(String Browser) throws InterruptedException {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		anmservicespage.getTxtIPNO().sendKeys("1100099900");
		Thread.sleep(2000);
		anmservicespage.getLnkbtnIPNo().click();
		wait.until(ExpectedConditions.visibilityOf(anmservicespage.getHisLiveListControlchkUHID()));
		
		anmservicespage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		anmservicespage.getHisLiveListControlbtnSelect().click();
		
		wait.until(ExpectedConditions.visibilityOf(anmservicespage.getBtnSaveDisplay()));
		anmservicespage.getBtnSaveDisplay().isEnabled();
		Thread.sleep(2000);
		utilobj.selectDropdown(anmservicespage.getDdlSpecialisation(), driver, prop.getProperty("specialisationName"),Browser);
		Thread.sleep(2000);
		

		utilobj.ActionClick(anmservicespage.getBtnOK(), driver);

		
		Thread.sleep(2000);

		

		anmservicespage.getBtnSaveDisplay().click();
		wait.until(ExpectedConditions.visibilityOf(anmservicespage.getPopupmessage()));
		Thread.sleep(2000);
		System.out.println(anmservicespage.getPopupmessage().getText());
		Thread.sleep(2000);
		System.out.println(utilobj.GetCheckinNumberText(anmservicespage.getPopupmessage(), driver));
		Thread.sleep(2000);
		txtcheckInNumber = utilobj.GetCheckinNumberText(anmservicespage.getPopupmessage(), driver);
		Thread.sleep(2000);
		anmservicespage.getBtncancel().click();
		Thread.sleep(2000);
		
		

	//	txtcheckInNumber =anmservicespage.getPatientCheckinNumber();
	}

	@Test(priority = 5)
	public void doNavigateToDoctorWorklistTest() throws InterruptedException {

			
		Thread.sleep(2000);
		utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")) , driver);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Doctor Worklist")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtCheckinno")).sendKeys(txtcheckInNumber);
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_imgCheckinno")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(anmservicespage.getpopok()));
		
		
		
	}
	
	@Test(priority = 6)
	public void doCasesheetprecripstionTest() throws InterruptedException {
		Thread.sleep(2000);
		anmservicespage.getpopok().click();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);
		Thread.sleep(2000);
		anmservicespage.getlableprecripstionlink().click();

		Thread.sleep(2000);

		
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);

		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(anmservicespage.gettxtOrdPackSearch()));
		utilobj.JSEnterText(anmservicespage.gettxtOrdPackSearch(), driver, prop.getProperty("orderpacknameA"));
		Thread.sleep(2000);

		utilobj.JSClick(anmservicespage.getclickorderpackbutton(), driver);
		Thread.sleep(5000);	

		utilobj.JSClick(anmservicespage.getorderpackselection(), driver);

		Thread.sleep(5000);

		
		utilobj.JSClick(anmservicespage.getbtnISaveClose(), driver);
		Thread.sleep(2000);
		utilobj.waitForalert(driver);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);

		
		Thread.sleep(2000);
		anmservicespage.getpopok().click();
		
		//anmservicespage.doCasesheetprecripstion(prop.getProperty("orderpackname"));
	}
		
	@Test(priority=7)
	public void doANMServicesTest() throws InterruptedException{	
		
		
		
		
		anmservicespage = hishomepage.doNavigateTogetANMServicesPageLink();
		
		
	}
	@Test(priority = 8)
	public void CLM_ANM_servicess_TC_004() throws InterruptedException {
		
		//anmservicespage.doANMServices(prop.getProperty("ActionTaken"),txtcheckInNumber);
		utilobj.JSEnterText(driver.findElement(By.xpath("//*[@id='ctl00_cphpage_txtAdmissionno']")), driver, txtcheckInNumber);
		 Thread.sleep(1000);
		 utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgAdmissionno")), driver);
			Thread.sleep(1000);
		//WebElement searchCheckIn = driver.findElement(By.xpath("//*[@id='ctl00_cphpage_imgAdmissionno']"));
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		 wait.until(ExpectedConditions.visibilityOf(anmservicespage.getActionTaken()));
		 
	}
	@Test(priority = 9)
	public void CLM_ANM_servicess_TC_005() throws InterruptedException {
		
		 Thread.sleep(1000);
		 anmservicespage.getActionTaken().sendKeys(prop.getProperty("ActionTaken"));
			 Thread.sleep(1000);

			 anmservicespage.getSaveBtn().click();
			 Thread.sleep(2000);
			 String SuccessMessage=anmservicespage.getpopupmessageInformation().getText();
			 
			 anmservicespage.getOkBtn().click();
			 assertEquals(SuccessMessage, "Record(s) saved successfully");
			 Thread.sleep(2000);
	}
	@Test(priority = 10)
	public void CLM_ANM_servicess_TC_006() throws InterruptedException {
		 anmservicespage.getSaveBtn().click();
		 Thread.sleep(2000);
		 String WarningMessage=anmservicespage.getpopupmessageInformation().getText();
		 Thread.sleep(2000);
		 anmservicespage.getOkBtn().click();
		 Thread.sleep(2000);
		 assertEquals(WarningMessage, "Select OP-Checkin No.");
		 
	}
	@Test(priority = 11)
	public void CLM_ANM_servicess_TC_0010() throws InterruptedException {
		Thread.sleep(2000);
			 utilobj.JSEnterText(driver.findElement(By.xpath("//*[@id='ctl00_cphpage_txtAdmissionno']")), driver, txtcheckInNumber);
			 Thread.sleep(2000);
			 utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgAdmissionno")), driver);
				
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("ctl00_cphpage_grvResults_ctl02_chkselect")).click();
			 Thread.sleep(2000);
	          driver.findElement(By.id("ctl00_cphpage_btnDelete1")).click();
	          Thread.sleep(2000);//Please enter the reason for deleting
	          String WarningMessage=anmservicespage.getpopupmessageInformation().getText();
	          Thread.sleep(2000);
	          anmservicespage.getOkBtn().click();
	          Thread.sleep(2000);
	          assertEquals(WarningMessage, "Please enter the reason for deleting");
	}
	@Test(priority = 12)
	public void CLM_ANM_servicess_TC_008() throws InterruptedException {
		Thread.sleep(2000);
			 driver.findElement(By.id("ctl00_cphpage_grvResults_ctl02_txtReason")).sendKeys("test Reason");
			 Thread.sleep(2000);
			 driver.findElement(By.id("ctl00_cphpage_btnDelete1")).click();
			 Thread.sleep(2000);
			 anmservicespage.getOkBtn().click();
		
	}
}

