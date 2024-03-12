package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MaLetterPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class MaLetterGeneration extends CrossBrowser {

	public MaLetterGeneration() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MaLetterPage mal;
	util utilobj = new util();

	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));
		
		//for prod use only
		//homepage = loginpage.doLoginProd(prop.getProperty("uidd"), prop.getProperty("pwd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"), Browser);
	}

	@Test(priority = 3)
	public void doNavigateToMasterManagement() throws InterruptedException {

		mal = hishomepage.doNavigateMaLetterLink();
	}

	@Test(priority = 4)
	@Parameters("browser")
	public void Ma_Letter_Generation_Page1() throws InterruptedException {
		Thread.sleep(5000);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Fully");
		utilobj.selectCheckBox(mal.SelectCheckbox(), driver);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Partially using Dhanwantri Application");
		utilobj.enterText(mal.EnterNumericalValueText(), driver, "223");
		utilobj.enterText(mal.EnterFloatText(), driver, "223");
		Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", mal.Next());
	}

	@Test(priority = 5)
	@Parameters("browser")
	public void Ma_Letter_Generation_Page2() throws InterruptedException {
		Thread.sleep(2000);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Yes");
		utilobj.selectCheckBox(mal.SelectCheckbox(), driver);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Partially using Dhanwantri Application");
		utilobj.enterText(mal.EnterNumericalValueText(), driver, "223");
		Thread.sleep(2000);
		mal.Next().click();

	}

	@Test(priority = 6)
	@Parameters("browser")
	public void Ma_Letter_Generation_Page3() throws InterruptedException {
		Thread.sleep(2000);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Yes");
		utilobj.selectCheckBox(mal.SelectCheckbox(), driver);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Partially using Dhanwantri Application");
		utilobj.enterText(mal.EnterNumericalValueText(), driver, "80");
		utilobj.enterText(mal.EnterFloatValueText(), driver, "80");
		Thread.sleep(2000);
		mal.Next().click();
	}

	@Test(priority = 7)
	@Parameters("browser")
	public void Ma_Letter_Generation_Page4() throws InterruptedException {
		Thread.sleep(2000);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Yes");
		utilobj.enterText(mal.EnterNumericalValueText(), driver, "20");
		Thread.sleep(2000);
		mal.Next().click();
	}

	@Test(priority = 8)
	@Parameters("browser")
	public void Ma_Letter_Generation_Page5(String exDate) throws InterruptedException {
		Thread.sleep(2000);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Yes");
		utilobj.enterText(mal.EnterFloatValueText(), driver, "20");
		utilobj.enterText(mal.EnterNumericalValueText(), driver, "20");
		utilobj.enterText(mal.EnterText(), driver, "Test");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript(
				"document.getElementById('ctl00_cphpage_Page5_txtDateLastCondemnedMedical').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript(
				"document.getElementById('ctl00_cphpage_Page5_txtDateLastCondemnedNonMedical').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript(
				"document.getElementById('ctl00_cphpage_Page5_txtDateDisposalItemMedical').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript(
				"document.getElementById('ctl00_cphpage_Page5_txtDateDisposalItemNonMedical').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("document.getElementById('ctl00_cphpage_Page5_txtRecordWeeding').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript(
				"document.getElementById('ctl00_cphpage_Page5_txtHouseKeepingDateOnsetContract').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript(
				"document.getElementById('ctl00_cphpage_Page5_txtSecurityStaffDateOnsetContract').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("document.getElementById('ctl00_cphpage_Page5_txtARMDateOnsetContract').value='02/02/2024'");
		Thread.sleep(2000);
		mal.Next().click();
	}

	@Test(priority = 9)
	@Parameters("browser")
	public void Ma_Letter_Generation_Page6() throws InterruptedException {
		
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Yes");
		Thread.sleep(2000);
		utilobj.enterText(mal.EnterAlphaText(), driver, "25");
		Thread.sleep(2000);
		utilobj.enterText(mal.EnterNumericalValueText(), driver, "20");
		Thread.sleep(2000);
		utilobj.enterText(mal.EnterText(), driver, "Test");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("document.getElementById('ctl00_cphpage_Page6_txtFireSysMockDrill').value='02/02/2024'");
		Thread.sleep(2000);
		mal.Next().click();
	}

	@Test(priority = 10)
	@Parameters("browser")
	public void Ma_Letter_Generation_Page7() throws InterruptedException {
		Thread.sleep(2000);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "RO");
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Adequate");
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Yes");
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Available");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('ctl00_cphpage_Page7_txtCanteenUpgraded').value='02/02/2024'");
		Thread.sleep(2000);
		utilobj.enterText(mal.EnterFloatValueText(), driver, "25");
		utilobj.enterText(mal.EnterNumericalValueText(), driver, "20");
		utilobj.enterText(mal.EnterText(), driver, "Test");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript(
				"document.getElementById('ctl00_cphpage_Page7_txtConstructionPendingDate').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript(
				"document.getElementById('ctl00_cphpage_Page7_txtHouseKeepingPaymentMonth').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('ctl00_cphpage_Page7_txtSecurityPaymentMonth').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("document.getElementById('ctl00_cphpage_Page7_txtARMPaymentMonth').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript(
				"document.getElementById('ctl00_cphpage_Page7_txtContractualNursesPaymentMonth').value='02/02/2024'");
		Thread.sleep(2000);
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript(
				"document.getElementById('ctl00_cphpage_Page7_txtContractualDoctorsPaymentMonth').value='02/02/2024'");
		Thread.sleep(2000);
		mal.Next().click();
	}

	@Test(priority = 11)
	@Parameters("browser")
	public void Ma_Letter_Generation_Page8() throws InterruptedException {
		Thread.sleep(2000);
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "OBG");
		utilobj.enterText(mal.EnterAlphaText(), driver, "32");
		utilobj.enterText(mal.EnterNumericText(), driver, "20");
		utilobj.selectDropdownValues(mal.SelectDropDown(), driver, "Yes");
		utilobj.enterText(mal.EnterText(), driver, "Test");
		Thread.sleep(2000);
		mal.Next().click();
		
	}
}