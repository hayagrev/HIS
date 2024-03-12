package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AdjustmentLBStoreConsumptionPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class LossBreakageTest  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	AdjustmentLBStoreConsumptionPage LossBreakage;
	
	
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
	
	
	@Test(priority = 3)
	public void doNavigateLossBreakageLinkTest() {

		LossBreakage = hishomepage.doNavigateLossBreakageLink();
	}

			
	@Test(priority =4)
	public void TC_Store_Loss_and_Breakage_004() throws InterruptedException {

		//LossBreakage.doAdjustmentLBStoreConsumption();
		LossBreakage.gettxtRefNo().sendKeys("Test Ref");
		
		LossBreakage.getimgbtnMultiItemSearch().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(LossBreakage.gettxtCriteria()));

		Thread.sleep(2000);
		LossBreakage.gettxtCriteria().sendKeys("12016014015005");
		
		LossBreakage.getbtnSearch().click();
		wait.until(ExpectedConditions.visibilityOf(LossBreakage.getchkTemp()));
	}
	@Test(priority =5)
	public void TC_Store_Loss_and_Breakage_005() throws InterruptedException {
		LossBreakage.getchkTemp().click();
		LossBreakage.getbtnSelect().click();
		Thread.sleep(2000);
		LossBreakage.getimgSearchBatchNo().click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(LossBreakage.getchkBSSelect()));

		LossBreakage.getchkBSSelect().click();
		Thread.sleep(2000);
		LossBreakage.getbtnBSSelect().click();
	}
	@Test(priority = 6)
	public void TC_Store_Loss_and_Breakage_006() throws InterruptedException {
		
		
		Thread.sleep(2000);

		LossBreakage.gettxtQTY().sendKeys("1");
		Thread.sleep(2000);
		LossBreakage.gettxtRemarks().sendKeys("Test Remarks");
		Thread.sleep(2000);
		LossBreakage.getbtnSave().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(LossBreakage.getButtonOK()));

		Thread.sleep(2000);
		LossBreakage.getButtonOK().click();
		
	}
	@Test(priority = 7)
	public void TC_Store_Loss_and_Breakage_009() throws InterruptedException {
		Thread.sleep(2000);
		LossBreakage.getClearButton().click();
		Thread.sleep(2000);
		
	}
	@Test(priority = 8)
	public void TC_Store_Loss_and_Breakage_010() throws InterruptedException {
		Thread.sleep(2000);
		LossBreakage.getAdjustmentNumberSearchImage().click();
		Thread.sleep(2000);
		LossBreakage.getAdjustmentNoCheckbox().click();
		Thread.sleep(2000);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
//		wait.until(ExpectedConditions.invisibilityOf(LossBreakage.getAdjustmentNoCheckbox()));
	}
	@Test(priority = 9)
	public void TC_Store_Loss_and_Breakage_011() throws InterruptedException {
		Thread.sleep(2000);
		LossBreakage.getAcceptButton().click();
		Thread.sleep(2000);
		LossBreakage.getButtonOK().click();
		
	}
	@Test(priority = 10)
	public void TC_Store_Loss_and_Breakage_012() throws InterruptedException {
		Thread.sleep(2000);
		LossBreakage.getAdjustmentNumberSearchImage().click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnvwok")).click();
		Thread.sleep(2000);
		LossBreakage.getAdjustmentNoCheckbox2().click();
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
//		wait.until(ExpectedConditions.invisibilityOf(LossBreakage.getAdjustmentNoCheckbox()));
//		Thread.sleep(2000);
//		
//		utilobj.JSClick(LossBreakage.getRejectButton(), driver); //LossBreakage.getRejectButton().click();
//		wait.until(ExpectedConditions.visibilityOf(LossBreakage.getButtonOK()));
//		Thread.sleep(2000);
//		LossBreakage.getButtonOK().click();
	}
	
}
