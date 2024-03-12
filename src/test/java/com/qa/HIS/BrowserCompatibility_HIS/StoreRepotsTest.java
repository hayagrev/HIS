package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.StoreReportPage;
import com.qa.util.util;

public class StoreRepotsTest extends CrossBrowser{
	public StoreRepotsTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	StoreReportPage SR;
	util utilobj=new util();
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));	

	}
	 
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"),Browser);
	}
	@Test(priority =3)
	public void TC_Store_003() throws InterruptedException, AWTException {
		SR=hishomepage.donavigateToStoreReport();
		
	}
	@Test(priority =4)
	public void TC_Store_004() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		SR.getitemMasterReport().click();
		wait.until(ExpectedConditions.invisibilityOf(SR.getproccesImage()));
		SR.getpreviewButton().click();
		wait.until(ExpectedConditions.invisibilityOf(SR.getproccesImage()));
		Thread.sleep(2000);
	}
	@Test(priority =5)
	public void TC_Store_007() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		SR.getphysicalStockEntry().click();
		wait.until(ExpectedConditions.invisibilityOf(SR.getproccesImage()));
		SR.getpreviewButton().click();
		wait.until(ExpectedConditions.invisibilityOf(SR.getproccesImage()));
		Thread.sleep(2000);
	}
	@Test(priority =6)
	public void TC_Store_010() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		SR.getRetailMasterStockQuantitySummary().click();
		wait.until(ExpectedConditions.invisibilityOf(SR.getproccesImage()));
		SR.getpreviewButton().click();
		wait.until(ExpectedConditions.invisibilityOf(SR.getproccesImage()));
		Thread.sleep(2000);
	}
	
	}

