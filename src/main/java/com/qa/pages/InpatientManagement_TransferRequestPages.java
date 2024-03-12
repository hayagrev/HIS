package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InpatientManagement_TransferRequestPages extends BasePage {

	public InpatientManagement_TransferRequestPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By admistionImgSearch=By.id("ctl00_cphpage_ImgBtnAdmin");
	public WebElement getadmistionImgSearch() {
		return getElement(admistionImgSearch);
	}
	private By AdmistiontextBox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getAdmistiontextBox() {
		return getElement(AdmistiontextBox);
	}
	private By AdmistionSearchButton=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getAdmistionSearchButton() {
		return getElement(AdmistionSearchButton);
	}
	private By RadioButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadioButton() {
		return getElement(RadioButton);
	}
	private By SelectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getSelectButton() {
		return getElement(SelectButton);
	}
	
}
