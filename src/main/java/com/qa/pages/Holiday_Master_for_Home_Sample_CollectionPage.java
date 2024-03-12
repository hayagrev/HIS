package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Holiday_Master_for_Home_Sample_CollectionPage extends BasePage{

	public Holiday_Master_for_Home_Sample_CollectionPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	private By deleteButton = By.id("ctl00_cphpage_btnDelete");

	public WebElement getdeleteButton() {
		return getElement(deleteButton);
	}
	private By addButton = By.id("ctl00_cphpage_btnAdd");

	public WebElement getaddButton() {
		return getElement(addButton);
	}
	private By currentDateLink = By.id("ctl00_cphpage_calExptDischarge_today");
	public WebElement getcurrentDateLink() {
		return getElement(currentDateLink);
	}
	private By holidayDateTextBox = By.id("ctl00_cphpage_txt_MakeHolidayDate");
	public WebElement getholidayDateTextBox() {
		return getElement(holidayDateTextBox);
	}
	private By typeholidayDDL = By.id("ctl00_cphpage_ddl_ReasonForHoliday");
	public WebElement gettypeholidayDDL() {
		return getElement(typeholidayDDL);
	}
	private By clearButton = By.id("ctl00_cphpage_btnClear");
	public WebElement getclearButton() {
		return getElement(clearButton);
	}
	private By saveButton = By.id("ctl00_cphpage_btnSave");
	public WebElement getsaveButton() {
		return getElement(saveButton);
	}
	private By dateValidation = By.id("ctl00_cphpage_RequiredFieldValidator1");
	public WebElement getdateValidation() {
		return getElement(dateValidation);
	}
	private By holidayValidation = By.id("ctl00_cphpage_RequiredFieldValidator4");
	public WebElement getholidayValidation() {
		return getElement(holidayValidation);
	}
	private By errorValidation = By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]");
	                                       
	public WebElement geterrorValidation() {
		return getElement(errorValidation);
	}
	private By errorMessageOkbutton = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement geterrorMessageOkbutton() {
		return getElement(errorMessageOkbutton);
	}
	private By informationOkButton= By.id("ctl00_cphpage_btnYes1");
	public WebElement getinformationOkButton() {
		return getElement(informationOkButton);
	}
	
	//*[@id="ctl00_cphpage_calExptDischarge_daysBody"]
	//*[@id="ctl00_cphpage_calExptDischarge_day_0_0"]
	
	
	
}
