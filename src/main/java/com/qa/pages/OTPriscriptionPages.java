package com.qa.pages;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class OTPriscriptionPages extends BasePage{
	util utilobj=new util();
	public OTPriscriptionPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By processImage=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table/tbody/tr[3]/td/div/div[5]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]/img");
	public WebElement getprocessImage() {
		return getElement(processImage);
	}
	public void testcaseforOTPriscription() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_imgsearchuhid")).click();
		Thread.sleep(2000);
			
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("RegCode")), driver, "DUMM.0000000489");
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("btnSearch")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.name("radio")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("btnSearchSelect")), driver);
		
		
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
		//driver.close();
		
	}

}
