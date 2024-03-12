package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class DischargeIntimationPage extends BasePage {
	
	util utilobj = new util();

	public DischargeIntimationPage(WebDriver driver) {
		super(driver);
	}

	//private By AdmissionNo = By.id("ctl00_cphpage_txtAdmNo");
	/*Discharge intimation home page*/
	private By AdmissionSearchBtn = By.id("ctl00_cphpage_ImgBtnAdmin");
	
	private By AdmissionSearchNo = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	
	private By SearchBtn = By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	
	private By ChkBox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");

	private By SelectBtn=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");

	private By RequestType=By.id("ctl00_cphpage_ddlRequestType");
	
	private By Remarks=By.id("ctl00_cphpage_txtRemarks");
	
	private By SaveBtn=By.id("ctl00_cphpage_btnSave");
	
	public WebElement getAdmissionSearchBtn() {
		return getElement(AdmissionSearchBtn);
	}
	
	public WebElement getAdmissionSearchNo() {
		return getElement(AdmissionSearchNo);
	}
	public WebElement getSearchBtn() {
		return getElement(SearchBtn);
	}
	
	public WebElement getChkBox() {
		return getElement(ChkBox);
	}
	
	public WebElement getSelectBtn() {
		return getElement(SelectBtn);
	}
	
	public WebElement getRequestType() {
		return getElement(RequestType);
	}
	
	public WebElement getRemarks() {
		return getElement(Remarks);
	}
	
	public WebElement getSaveBtn() {
		return getElement(SaveBtn);
	}
	private By SuccusfullOkButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getSuccusfullOkButton() {
		return getElement(SuccusfullOkButton);
	}
	private By ClearButton=By.id("ctl00_cphpage_btnClear");
	public WebElement getClearButton() {
		return getElement(ClearButton);
	}
	private By BlackOverlay=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[5]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	
	
}

