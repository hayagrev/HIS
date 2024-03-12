package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class InpatientManagement_nursetaskspages extends BasePage {
  
WebDriver driver;
util utilobj = new util();
	public InpatientManagement_nursetaskspages(WebDriver driver){
		
		super(driver);
		
	}
 
	
private By Bedsearchicon=By.id("ctl00_cphpage_imgbtnBed");
	public WebElement getBedsearchicon() {
		return getElement(Bedsearchicon);
	}
	private By Dropdown1=By.xpath("//select[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_ddlCriteria']");
	public WebElement getDropdown1() {
		return getElement(Dropdown1);
	}
	private By DropdownclauseValue=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[1]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/select/option[3]");
	public WebElement getDropdownclauseValue() {
		return getElement(DropdownclauseValue);
	}
	private By Patientnametxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getPatientnametxtbox() {
		return getElement(Patientnametxtbox);
	}
	private By Search=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	public WebElement getSearch() {
		return getElement(Search);
	}
	private By Radiobtn1=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtn1() {
		return getElement(Radiobtn1);
	}
	private By Select=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getSelect() {
		return getElement(Select);
	}
	private By FromDate=By.id("ctl00_cphpage_txtFrmDate");
	public WebElement getFromDate() {
		return getElement(FromDate);
	}
	private By ToDate=By.id("ctl00_cphpage_txtToDate");
	public WebElement getToDate() {
		return getElement(ToDate);
	}
	private By Frequency=By.xpath("//select[@id='ctl00_cphpage_ddlFrequency']");
	public WebElement getFrequency() {
		return getElement(Frequency);
	}
	private By Task=By.xpath("//select[@id='ctl00_cphpage_ddlTask']");
	public WebElement getTask() {
		return getElement(Task);
	}
	private By Ok=By.xpath("//input[@id='ctl00_cphpage_btnOK']");
	public WebElement getOk() {
		return getElement(Ok);
	}
	private By Interval=By.xpath("//input[@id='ctl00_cphpage_gdvDisplay_ctl02_txtInterval']");
	public WebElement getInterval() {
		return getElement(Interval);
	}
	private By Save=By.xpath("//input[@id='ctl00_cphpage_btnSave']");
	public WebElement getSave() {
		return getElement(Save);
	}
	private By Clear=By.id("ctl00_cphpage_btnClear");
	public WebElement getClear() {
		return getElement(Clear);
	}
	private By SuccessMessageOkButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getSuccessMessageOkButton() {
		return getElement(SuccessMessageOkButton);
	}
	
	private By processImage = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]");
	public WebElement getprocessImage() {
		return getElement(processImage);
	}
		
}

