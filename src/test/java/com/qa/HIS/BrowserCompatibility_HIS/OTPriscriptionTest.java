package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OTPriscriptionPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class OTPriscriptionTest extends CrossBrowser {
	public OTPriscriptionTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OTPriscriptionPages OTPriscriptionpages;
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
				prop.getProperty("OtFacilityname"),Browser);
	}
	@Test(priority = 3)
	public void doNavigateToOTandResourceSchedulingTest() {

		OTPriscriptionpages = hishomepage.doNavigateToOTPrescriptionLink();
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void donavigateTotestcaseOTprescription(String Browser) throws InterruptedException, AWTException {
		//OTPriscriptionpages.testcaseforOTPriscription();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_imgsearchuhid")).click();
		Thread.sleep(2000);
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria")), driver, "Equals", Browser);
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")), driver, "DUMM.0000000489");
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOf(OTPriscriptionpages.getprocessImage()));
				
		
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")), driver);
		
		
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_gdvInvestigations_ctl02_imgbtnSearchItem")), driver);

		Thread.sleep(2000);

		
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("txtName")), driver, "cbc");
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("btnSearch")), driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ChkSelect4")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("btnSelect")), driver);
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_gdvInvestigations_ctl02_lblInvestigation")), driver, "COMPLETE BLOOD COUNT ROUTINE, CBC ROUTINE");
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_gdvInvestigations_ctl02_lblspcimen")), driver, "BLOOD WHOLE EDTA");
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtDoctor")), driver, "Dr. Tester  ");
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		Thread.sleep(2000);
		
	}
	
	

}
