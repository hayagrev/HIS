package com.qa.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class SupplierManufactureBrandPages extends BasePage {

	public SupplierManufactureBrandPages(WebDriver driver) {
		super(driver);
		
	}
	util utilobj=new util();
	public void dotestcaseforsupplier() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_imgbtnSearchSupplier")).click();//click the supplier searchImg
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("test");//enter the supplier name
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();//click on search button
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch"))));
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl03_rdbTemp")).click();//click on radio button
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();//click on select button
		
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtEmail")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtEmail")).sendKeys("Kolkatatestsupplier@gmail.com");//enter the supplier mail id
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnModify")).click();//click the modyfied button
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();//enter the supplier name
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnClear")).click();//enter the clear button
		Thread.sleep(2000);
		
		
	}
	public void dotestcaseforManufacture() throws InterruptedException {
		
		utilobj.MoveElement(driver.findElement(By.linkText("Purchase")), driver);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Manufacturer")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_imgbtnSearchManufacturer")).click();//click the manufacure searchImg
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("test");//click the manufacure searchImg
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();//click the manufacture searchImg
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();//click the manufacure radio
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();//select the button
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtEmail")).clear();//clear the manufacure email
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtEmail")).sendKeys("test123@gmail.com");//enter the manufacture email
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnModify")).click();//click the modyfied button
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();//click on modyfying button
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnClear")).click();//click on clear button
		Thread.sleep(2000);
		
		
		
	}
	public void testcaseforBrand() throws InterruptedException {
		
		utilobj.MoveElement(driver.findElement(By.linkText("Purchase")), driver);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Brand")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_BrandID")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl03_rdbTemp")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnModify")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();//enter the supplier name
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnClear")).click();//enter the clear button
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
