package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class OpenVisitPage extends BasePage {

	public OpenVisitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utilobj = new util();             
	
	private By DosageTypeIMG_search=By.id("ctl00_cphpage_imgsearch");
	private By DosageTypeSearch_TextBox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By DosageTypeSearch_BTNSearch=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By DosageTypeSearch_RadioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By DosageTypeSearch_SelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	private By DosageTypeSearch_UpDate=By.id("ctl00_cphpage_btnSave");
	private By OpenVisitUHID_search=By.id("ctl00_cphpage_imgUHIDSearch");
	private By OpenVisitUHID_DLL=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_ddlCriteria");
	private By OpenVisitUHID_TextBox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	private By OpenVisitUHID_Search=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	private By OpenVisitUHID_RadioButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By OpenVisitUHID_SelectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	private By OpenVisitUHID_OK=By.id("ctl00_cphpage_btnOk");
	private By OpenVisitUHID_Clear=By.id("ctl00_cphpage_btnClear");
	private By OpenVisitUHID_CheckBox=By.id("ctl00_cphpage_gdvOpenVists_ctl02_chkSelect");
	private By OpenVisitUHID_closeMR=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[2]/input[4]");
	private By OpenVisitUHID_OpenMR=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[2]/input[3]");
	private By BlackOverLay=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[1]/img");
	
	public WebElement getOpenVisitUHID_search() {
		return getElement(OpenVisitUHID_search);

	}
	public WebElement getOpenVisitUHID_DLL() {
		return getElement(OpenVisitUHID_DLL);

	}
	public WebElement getBlackoverlay() {
		return getElement(BlackOverLay);

	}
	public WebElement getOpenVisitUHID_TextBox() {
		return getElement(OpenVisitUHID_TextBox);

	}
	public WebElement getOpenVisitUHID_Search() {
		return getElement(OpenVisitUHID_Search);

	}
	public WebElement getOpenVisitUHID_RadioButton() {
		return getElement(OpenVisitUHID_RadioButton);

	}
	public WebElement getOpenVisitUHID_SelectButton() {
		return getElement(OpenVisitUHID_SelectButton);

	}
	public WebElement getOpenVisitUHID_OK() {
		return getElement(OpenVisitUHID_OK);

	}
	public WebElement getOpenVisitUHID_Clear() {
		return getElement(OpenVisitUHID_Clear);

	}
	public WebElement getOpenVisitUHID_CheckBox() {
		return getElement(OpenVisitUHID_CheckBox);

	}
	public WebElement getOpenVisitUHID_closeMR() {
		return getElement(OpenVisitUHID_closeMR);

	}
	public WebElement getOpenVisitUHID_OpenMR() {
		return getElement(OpenVisitUHID_OpenMR);

	}
	public WebElement getDosageTypeIMG_search() {
		return getElement(DosageTypeIMG_search);

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
