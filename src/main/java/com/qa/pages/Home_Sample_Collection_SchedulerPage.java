package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Sample_Collection_SchedulerPage extends BasePage {

	public Home_Sample_Collection_SchedulerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	private By ClearButton = By.id("ctl00_cphpage_btnClear");

	public WebElement getClearButton() {
		return getElement(ClearButton);
	}
	private By saveButton = By.id("ctl00_cphpage_btnSave");

	public WebElement getsaveButton() {
		return getElement(saveButton);
	}
	private By maximumRequestTextbox = By.id("ctl00_cphpage_txtMaximumRequest");

	public WebElement getmaximumRequestTextbox() {
		return getElement(maximumRequestTextbox);
	}
	private By bookedDaysTextbox = By.id("ctl00_cphpage_txtBookedUpto");

	public WebElement getbookedDaysTextbox() {
		return getElement(bookedDaysTextbox);
	}
	public By notificationSpan=By.id("ctl00_cphpage_RequiredFieldValidator1");
			public WebElement getnotificationSpan() {
		return getElement(notificationSpan);
	}	
			public By informationMessageText=By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/p");
			public WebElement getinformationMessageText() {
			return getElement(informationMessageText);	
			}
				
			public By notificationMessageButtonOk=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
			public WebElement getnotificationMessageButtonOk() {
		return getElement(notificationMessageButtonOk);
	}	
				
	
}
