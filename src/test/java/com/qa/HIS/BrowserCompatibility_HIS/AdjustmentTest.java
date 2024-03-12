package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AdjustmentLBStoreConsumptionPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class AdjustmentTest  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	AdjustmentLBStoreConsumptionPage adjustmentpage;
	String RefferenceNo;
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
	public void doNavigateAdjustmentLinkTest() {

		adjustmentpage = hishomepage.doNavigateAdjustmentLink();
	}

			
	@Test(priority =4)
	public void TC_Store_Adjustment_004() throws InterruptedException {

WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));

		adjustmentpage.gettxtRefNo().sendKeys("Test Ref");
		
		adjustmentpage.getimgbtnMultiItemSearch().click();
		Thread.sleep(2000);
		adjustmentpage.gettxtCriteria().sendKeys("12016014015005");
		
		adjustmentpage.getbtnSearch().click();
		wait.until(ExpectedConditions.visibilityOf(adjustmentpage.getchkTemp()));
	}
	@Test(priority =5)
	public void TC_Store_Adjustment_005() throws InterruptedException {
		
		adjustmentpage.getchkTemp().click();
		adjustmentpage.getbtnSelect().click();
		Thread.sleep(2000);
	}
	@Test(priority =6)
	public void TC_Store_Adjustment_006() throws InterruptedException {
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		
		adjustmentpage.getimgSearchBatchNo().click();
		wait.until(ExpectedConditions.visibilityOf(adjustmentpage.getchkBSSelect()));
		Thread.sleep(2000);
		//adjustmentpage.getchkBSSelect().click();
	List<WebElement> list=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[4]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div/table/tbody/tr/td[3]"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {


		int j=i;
		j=j+2;
				
if (list.get(i).getText().equals("ABC")) {
	

		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[4]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div/table/tbody/tr["+j+"]/td[1]/input")).click();
		
		break;
}

		
	}
	
		adjustmentpage.getbtnBSSelect().click();
		
		Thread.sleep(2000);

		adjustmentpage.gettxtQTY().sendKeys("1");
		Thread.sleep(2000);
		adjustmentpage.gettxtRemarks().sendKeys("Test Remarks");
		Thread.sleep(2000);
		adjustmentpage.getbtnSave().click();
		Thread.sleep(2000);
		adjustmentpage.getButtonOK().click();
		Thread.sleep(2000);
		RefferenceNo=adjustmentpage.getAdjustmentNumber().getText();
		System.out.println(RefferenceNo);
		
	}
	@Test(priority = 7)
	public void  TC_Store_Adjustment_009() throws InterruptedException
	{
		Thread.sleep(2000);
		adjustmentpage.getClearButton().click();
		Thread.sleep(2000);
	}
@Test(priority = 8)
public void TC_Store_Adjustment_008() throws InterruptedException {//near Expiry batch Select
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));

	adjustmentpage.gettxtRefNo().sendKeys("Test Ref");
	
	adjustmentpage.getimgbtnMultiItemSearch().click();
	Thread.sleep(2000);
	adjustmentpage.gettxtCriteria().sendKeys("12016014015005");
	
	adjustmentpage.getbtnSearch().click();
	wait.until(ExpectedConditions.visibilityOf(adjustmentpage.getchkTemp()));
	adjustmentpage.getchkTemp().click();
	adjustmentpage.getbtnSelect().click();
	Thread.sleep(2000);
	
	
	adjustmentpage.getimgSearchBatchNo().click();
	wait.until(ExpectedConditions.visibilityOf(adjustmentpage.getchkBSSelect()));
	Thread.sleep(2000);
	
List<WebElement> list=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[4]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div/table/tbody/tr/td[3]"));
System.out.println(list.size());
for(int i=0;i<list.size();i++) {


	int j=i;
	j=j+2;
			
if (list.get(i).getText().equals("k1")) {
	driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[4]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div/table/tbody/tr["+j+"]/td[1]/input")).click();	
	break;
}
	
}

	adjustmentpage.getbtnBSSelect().click();
	
	Thread.sleep(2000);
	adjustmentpage.gettxtQTY().clear();
	Thread.sleep(2000);
	adjustmentpage.gettxtQTY().sendKeys("1");
	Thread.sleep(2000);
	adjustmentpage.gettxtRemarks().sendKeys("Test Remarks");
	
	Thread.sleep(2000);
	adjustmentpage.getbtnSave().click();
	Thread.sleep(2000);
	adjustmentpage.getButtonOK().click();
	Thread.sleep(2000);
	adjustmentpage.getClearButton().click();
	Thread.sleep(2000);
}
@Test(priority = 9)
public void TC_Store_Adjustment_010() throws InterruptedException {//View the Adjustment
	
	adjustmentpage.getAdjustmentNumberSearchImage().click();
	Thread.sleep(2000);
	adjustmentpage.getAdjustmentNoCheckbox().click();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	
}
@Test(priority = 10)
public void TC_Store_Adjustment_011() throws InterruptedException {//Accept
	Thread.sleep(2000);
	adjustmentpage.getAcceptButton().click();
	Thread.sleep(2000);
	adjustmentpage.getButtonOK().click();
	Thread.sleep(2000);
	
}
@Test(priority = 11)
public void TC_Store_Adjustment_012() throws InterruptedException {//Reject
	adjustmentpage.getAdjustmentNumberSearchImage().click();
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_btnvwok")).click();
	Thread.sleep(2000);
	adjustmentpage.getAdjustmentNoCheckbox().click();
	Thread.sleep(2000);
	adjustmentpage.getRejectButton().click();
	Thread.sleep(2000);
	adjustmentpage.getButtonOK().click();
	Thread.sleep(2000);
}
	
}
