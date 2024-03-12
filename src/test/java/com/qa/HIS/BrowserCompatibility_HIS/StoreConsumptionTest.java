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

public class StoreConsumptionTest  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	AdjustmentLBStoreConsumptionPage storeconsumptions;
	
	
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
	public void doNavigateStoreConsumptionTest() {

		storeconsumptions = hishomepage.doNavigateStoreConsumptionLink();
	}

			
	@Test(priority =4)
	public void TC_Store_Consumption_004() throws InterruptedException {

		
		storeconsumptions.gettxtRefNo().sendKeys("Test Ref");
		
		storeconsumptions.getimgbtnMultiItemSearch().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(storeconsumptions.gettxtCriteria()));

		Thread.sleep(2000);
		storeconsumptions.gettxtCriteria().sendKeys("12016014015005");
		
		storeconsumptions.getbtnSearch().click();
		wait.until(ExpectedConditions.visibilityOf(storeconsumptions.getchkTemp()));
	}
	@Test(priority =5)
	public void TC_Store_Consumption_005() throws InterruptedException {
		storeconsumptions.getchkTemp().click();
		storeconsumptions.getbtnSelect().click();
		Thread.sleep(2000);
		storeconsumptions.getimgSearchBatchNo().click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(storeconsumptions.getchkBSSelect()));

		storeconsumptions.getchkBSSelect().click();
		Thread.sleep(2000);
		storeconsumptions.getbtnBSSelect().click();
	}
	@Test(priority = 6)
	public void TC_Store_Consumption_006() throws InterruptedException {
		
		
		Thread.sleep(2000);

		storeconsumptions.gettxtQTY().sendKeys("1");
		Thread.sleep(2000);
		storeconsumptions.gettxtRemarks().sendKeys("Test Remarks");
		Thread.sleep(2000);
		storeconsumptions.getbtnSave().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(storeconsumptions.getButtonOK()));

		Thread.sleep(2000);
		storeconsumptions.getButtonOK().click();
		
	}
	@Test(priority = 7)
	public void TC_Store_Consumption_009() throws InterruptedException {
		Thread.sleep(2000);
		storeconsumptions.getClearButton().click();
		Thread.sleep(2000);
		
	}
	@Test(priority = 8)
	public void TC_Store_Consumption_010() throws InterruptedException {
		Thread.sleep(2000);
		storeconsumptions.getAdjustmentNumberSearchImage().click();
		Thread.sleep(2000);
		storeconsumptions.getAdjustmentNoCheckbox().click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
//		wait.until(ExpectedConditions.invisibilityOf(storeconsumptions.getAdjustmentNoCheckbox()));
	}
	@Test(priority = 9)
	public void TC_Store_Consumption_011() throws InterruptedException {
		Thread.sleep(2000);
		storeconsumptions.getAcceptButton().click();
		Thread.sleep(2000);
		storeconsumptions.getButtonOK().click();
		
	}
	@Test(priority = 10)
	public void TC_Store_Consumption_012() throws InterruptedException {
		Thread.sleep(2000);
		storeconsumptions.getAdjustmentNumberSearchImage().click();
		driver.findElement(By.id("ctl00_cphpage_btnvwok"));
		Thread.sleep(2000);
		storeconsumptions.getAdjustmentNoCheckbox().click();
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
//		wait.until(ExpectedConditions.invisibilityOf(storeconsumptions.getAdjustmentNoCheckbox()));
//		Thread.sleep(2000);
//		
//		storeconsumptions.getRejectButton().click();
//		Thread.sleep(2000);
//		storeconsumptions.getButtonOK().click();
	}
	
	
	
}
