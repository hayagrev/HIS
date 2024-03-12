package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MISReportPages;
import com.qa.pages.MaLetterPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class MonthlyAssesmentReport extends CrossBrowser {

	public MonthlyAssesmentReport() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MISReportPages Mis;
	MaLetterPage mal;
	util utilobj = new util();

	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		// homepage = loginpage.doLogin(prop.getProperty("uidd"),
		// prop.getProperty("StagingPass"));

		// for prod use only
		homepage = loginpage.doLoginProd(prop.getProperty("userhq"), prop.getProperty("pwdhq"));

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

		Mis = hishomepage.doNavigateMisReports();
	}

	@Test(priority = 4)
	@Parameters("browser")
	public void MonthlyAssessmentReport() throws InterruptedException {
		Mis.getMonthlyReport().click();
		utilobj.selectDropdownValue(Mis.getSelectState(), driver, "47");
		Thread.sleep(5000);
		utilobj.selectDropdownValue(Mis.getSelectLocation(), driver, "12051");
		Thread.sleep(2000);
		utilobj.selectDropdownValue(Mis.getSelectYear(), driver, "2023");
		Thread.sleep(2000);
		utilobj.selectDropdownValue(Mis.getSelectMonth(), driver, "1");
		Mis.getButtonPreview().click();
		Thread.sleep(15000);
	}

	@Test(priority = 5)
	@Parameters("browser")
	public void MonthlyAssessmentStatusReport(String Browser) throws InterruptedException {
		Thread.sleep(5000);
		Mis.getMonthlyStatusReport().click();
		utilobj.selectDropdownValue(Mis.getSelectYear(), driver, "2023");
		Thread.sleep(5000);
		utilobj.selectDropdownValue(Mis.getSelectMonth(), driver, "1");
		Mis.getButtonPreview().click();
		Thread.sleep(5000);
		
	}

	@Test(priority = 6)
	@Parameters("browser")
	public void MonthlyAssessmentReportDo(String Browser) throws InterruptedException {
		driver.navigate().to("http://myesic.esic.in");
		Mis.getSLoggoutButton().click();
		loginpage = new Loginpage(driver);
		homepage = loginpage.doLoginProd(prop.getProperty("uidd"), prop.getProperty("pwd"));
		doNavigateToSelectHospitalLocationTest();
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName1"),
				prop.getProperty("facilityName"), Browser);
		doNavigateToMasterManagement();
		Mis.getSelectMonthlyAssessmentDo().click();
		utilobj.selectDropdownValue(Mis.getSelectYear(), driver, "2023");
		Thread.sleep(2000);
		utilobj.selectDropdownValue(Mis.getSelectMonth(), driver, "1");
		Thread.sleep(2000);
		Mis.getButtonPreview().click();
		Thread.sleep(2000);

	}
}