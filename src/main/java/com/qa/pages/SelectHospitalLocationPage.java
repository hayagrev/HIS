package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.ReadDataFile;
import com.qa.util.util;

public class SelectHospitalLocationPage extends BasePage {
	
	util utilobj = new util();
	ReadDataFile readdata = new ReadDataFile();
	
	public SelectHospitalLocationPage(WebDriver driver) {
		super(driver);

	
	}
	
	/* Location */
	private By Location = By.id("ctl00_cphpage_ddlHospital");
	                             
	/* Facility */
	private By facility = By.id("ctl00_cphpage_ddlFacility");
	
	/* Submit */
	private By submit = By.id("ctl00_cphpage_btnSubmit");

	
	public WebElement getLocation() {
		return getElement(Location);
	}

	
	public WebElement getFacility() {
		return getElement(facility);
	}

	
	public WebElement getSubmit() {
		return getElement(submit);
	}
	
	public HISHomePage doNavigateToHISHome(String LocationName, String FacilityName,String Browser) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(getLocation()));
		System.out.println(Browser);


if(Browser.equalsIgnoreCase("Chrome")|| Browser.equalsIgnoreCase("Opera")  ) {
	Thread.sleep(8000);
	getLocation().sendKeys(LocationName);
	Thread.sleep(4000);

	getFacility().sendKeys(FacilityName);
	Thread.sleep(4000);
}
else if(Browser.equalsIgnoreCase("Firefox")|| Browser.equalsIgnoreCase("Edge"))
{  Thread.sleep(8000);
	utilobj.selectDropdown(getLocation(), driver, LocationName,Browser);
	
	Thread.sleep(2000);

	utilobj.selectDropdown(getFacility(), driver, FacilityName,Browser);
	

	
}
else {
	System.out.println("do nothing");
}
		
		
		getSubmit().click();
		
		return new HISHomePage(driver);
		
	}
	

}
