package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Sample_Collection_WorklistPage extends BasePage {

	public Home_Sample_Collection_WorklistPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By clearButton = By.id("ctl00_cphpage_btnClear");
	public WebElement getclearButton() {
		return getElement(clearButton);		
	}
	private By okButton = By.id("ctl00_cphpage_btnAdd");
	public WebElement getokButton() {
		return getElement(okButton);
	}
	private By dateTextBox = By.id("ctl00_cphpage_txt_MakeHolidayDate");
	public WebElement getdateTextBox() {
		return getElement(dateTextBox);
	}
	private By RequiredFieldValidatorTextbox = By.id("ctl00_cphpage_RequiredFieldValidator1");
	public WebElement getRequiredFieldValidatorTextbox() {
		return getElement(RequiredFieldValidatorTextbox);
	}
	private By TableHeaderText = By.id("/html/body/div/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr[1]");
	public WebElement getTableHeaderText() {
		return getElement(TableHeaderText);
	}
	
	
	
}
