package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Define_Store_For_OPD_Pharmacy_Pages extends BasePage {

	public Define_Store_For_OPD_Pharmacy_Pages(WebDriver driver) {
		super(driver);
	}
	private By noteContent=By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[3]/td");
	public WebElement getnoteContent() {
		return getElement(noteContent);
	}
	private By AvailbilityStoreFacilityDLL=By.id("ctl00_cphpage_ddlStoreEntry");
	public WebElement getAvailbilityStoreFacilityDLL() {
		return getElement(AvailbilityStoreFacilityDLL);
	}
	private By saveButton=By.xpath("//*[@id='ctl00_cphpage_btnSave']");
	public WebElement getsaveButton() {
		return getElement(saveButton);
	}
	private By Savebutton_SucessMessageContent=By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/p");
	public WebElement getSavebutton_SucessMessageContent() {
		return getElement(Savebutton_SucessMessageContent);
	}
	private By Savebutton_OkButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getSavebutton_OkButton() {
		return getElement(Savebutton_OkButton);
	}
	private By Note_Content=By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[3]/td");
	public WebElement getNote_Content() {
		return getElement(Note_Content);
	}
	
	
	
}
