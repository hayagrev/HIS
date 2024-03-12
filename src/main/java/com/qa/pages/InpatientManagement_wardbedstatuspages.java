package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class InpatientManagement_wardbedstatuspages extends BasePage {

	WebDriver driver;
	
	public InpatientManagement_wardbedstatuspages(WebDriver driver){
		
		super(driver);
		
	}
	util utilobj = new util();
	private By Plusicon=By.xpath("//tbody/tr[@id='ctl00_cphpage_lstViewWard_ctrl0_row']/th[1]/img[1]");
	public WebElement getPlusicon() {
		return getElement(Plusicon);
	}
	
	
}

