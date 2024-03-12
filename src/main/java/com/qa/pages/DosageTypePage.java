package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DosageTypePage extends BasePage{

	public DosageTypePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	private By DosageTypeIMG_search=By.id("ctl00_cphpage_imgsearch");
	private By DosageTypeSearch_TextBox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By DosageTypeSearch_BTNSearch=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By DosageTypeSearch_RadioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By DosageTypeSearch_SelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	private By DosageTypeSearch_UpDate=By.id("ctl00_cphpage_btnSave");
	private By DosageType_MessageButtonOK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	                                             
	private By DosagetypeTextBox=By.id("ctl00_cphpage_txtName");
	
	public WebElement getDosageTypeIMG_search() {
		return getElement(DosageTypeIMG_search);

	}
	public WebElement getDosagetypeTextBox() {
		return getElement(DosagetypeTextBox);

	}
	public WebElement getDosageType_MessageButtonOK() {
		return getElement(DosageType_MessageButtonOK);

	}
	public WebElement getDosageTypeSearch_TextBox() {
		return getElement(DosageTypeSearch_TextBox);

	}
	public WebElement getDosageTypeSearch_BTNSearch() {
		return getElement(DosageTypeSearch_BTNSearch);

	}
	public WebElement getDosageTypeSearch_RadioButton() {
		return getElement(DosageTypeSearch_RadioButton);

	}
	public WebElement getDosageTypeSearch_SelectButton() {
		return getElement(DosageTypeSearch_SelectButton);

	}
	public WebElement getDosageTypeSearch_UpDate() {
		return getElement(DosageTypeSearch_UpDate);

	}

}
