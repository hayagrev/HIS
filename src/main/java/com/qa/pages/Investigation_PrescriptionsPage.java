package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Investigation_PrescriptionsPage extends BasePage {

	public Investigation_PrescriptionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By imgSearchUHID = By.id("ctl00_cphpage_imgsearchuhid");
	private By UHID_textBOX = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By UHID_Searchbutton = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch");
	private By UHID_DLL = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria");
	private By UHID_RadioButton = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By UHID_ButtonSelect = By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	private By imgSearchUHIDDoctor = By.id("ctl00_cphpage_imgDoctor");
	private By UHIDDoctor_Name = By.id("txtName");
	private By UHIDDoctor_CheckBox = By.id("ChkSelect0");
	private By UHIDDoctor_SelectButton = By.id("btnSelect");
	private By Investigation_IMG_Search = By.id("ctl00_cphpage_gdvInvestigations_ctl02_imgbtnSearchItem");
	private By Prescription_Save = By.id("ctl00_cphpage_btnSave");
	private By Prescription_Clear = By.id("ctl00_cphpage_btnClear");
	
	
	
	public WebElement getimgSearchUHID() {
		return getElement(imgSearchUHID);
	}
	public WebElement getUHID_textBOX() {
		return getElement(UHID_textBOX);
	}
	public WebElement getUHID_Searchbutton() {
		return getElement(UHID_Searchbutton);
	}
	public WebElement getUHID_DLL() {
		return getElement(UHID_DLL);
	}
	public WebElement getUHID_RadioButton() {
		return getElement(UHID_RadioButton);
	}
	public WebElement getUHID_ButtonSelect() {
		return getElement(UHID_ButtonSelect);
	}
	public WebElement getimgSearchUHIDDoctor() {
		return getElement(imgSearchUHIDDoctor);
	}
	public WebElement getUHIDDoctor_Name() {
		return getElement(UHIDDoctor_Name);
	}
	public WebElement getUHIDDoctor_CheckBox() {
		return getElement(UHIDDoctor_CheckBox);
	}
	public WebElement getUHIDDoctor_SelectButton() {
		return getElement(UHIDDoctor_SelectButton);
	}
	public WebElement getInvestigation_IMG_Search() {
		return getElement(Investigation_IMG_Search);
	}
	public WebElement getPrescription_Save() {
		return getElement(Prescription_Save);
	}
	public WebElement getPrescription_Clear() {
		return getElement(Prescription_Clear);
	}
}
