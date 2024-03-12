package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.qa.util.util;

public class Emergency_Check_In_RegistrationPages extends BasePage {

	public Emergency_Check_In_RegistrationPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utilobj = new util();
	
	private By ECRIP_titleDDL = By.id("ctl00_cphpage_ddlTitle");
	public WebElement getECRIP_titleDDL() {
		return getElement(ECRIP_titleDDL);
	}
	private By ECRIP_Firstname = By.id("ctl00_cphpage_txtFirstName");
	public WebElement getECRIP_Firstname() {
		return getElement(ECRIP_Firstname);
	}
	private By ECRIP_Lastname = By.id("ctl00_cphpage_txtLastName");
	public WebElement getECRIP_Lastname() {
		return getElement(ECRIP_Lastname);
	}
	private By ECRIP_Age = By.id("ctl00_cphpage_txtAge");
	public WebElement getECRIP_Age() {
		return getElement(ECRIP_Age);
	}
	private By ECRIP_genderDDL = By.id("ctl00_cphpage_ddlGender");
	public WebElement getECRIP_genderDDL() {
		return getElement(ECRIP_genderDDL);
	}
	private By ECRIP_AdmisiontypeDDL = By.id("ctl00_cphpage_ddlAdmissionType");
	public WebElement getECRIP_AdmisiontypeDDL() {
		return getElement(ECRIP_AdmisiontypeDDL);
	}
	private By ECRIP_AdmisionsrcDDl = By.id("ctl00_cphpage_ddlAdmissionSrc");
	public WebElement getECRIP_AdmisionsrcDDl() {
		return getElement(ECRIP_AdmisionsrcDDl);
	}
	private By ECRIP_SuccesmsgOKBUTTON = By.xpath("//*[@id='ctl00_cphpage_MyMessageBoxInfo_ButtonOK']");
	                                            
	public WebElement getECRIP_SuccesmsgOKBUTTON() {
		return getElement(ECRIP_SuccesmsgOKBUTTON);
	}
	private By ECRIP_InformationmsgOKBUTTON = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	                                                 
	public WebElement getECRIP_InformationmsgOKBUTTON() {
		return getElement(ECRIP_InformationmsgOKBUTTON);
	}
	private By ECRIP_Addresstxtbox = By.id("ctl00_cphpage_txtPresentAddress1");
	public WebElement getECRIP_Addresstxtbox() {
		return getElement(ECRIP_Addresstxtbox);
	}
	private By ECRIP_AdmissionNotxtbox = By.id("ctl00_cphpage_txtAdmissionNo");
	public WebElement getECRIP_AdmissionNotxtbox() {
		return getElement(ECRIP_AdmissionNotxtbox);
	}
	private By ECRIP_UHIDNotxtbox = By.id("ctl00_cphpage_txtUHID");
	public WebElement getECRIP_UHIDNotxtbox() {
		return getElement(ECRIP_UHIDNotxtbox);
	}
	private By ECRIP_IMGadmissionSearch = By.id("ctl00_cphpage_imgadmissionsearch");
	public WebElement getECRIP_IMGadmissionSearch() {
		return getElement(ECRIP_IMGadmissionSearch);
	}
	private By ECRIP_IMGadmissionSearch_txtbox = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	                                                      
	public WebElement getECRIP_IMGadmissionSearch_txtbox() {
		return getElement(ECRIP_IMGadmissionSearch_txtbox);
	}
	private By ECRIP_IMGadmissionSearch_Searchbutton = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	                                                          
	public WebElement getECRIP_IMGadmissionSearch_Searchbutton() {
		return getElement(ECRIP_IMGadmissionSearch_Searchbutton);
	}                                                        
	private By ECRIP_IMGadmissionSearch_Radiobutton = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getECRIP_IMGadmissionSearch_Radiobutton() {
		return getElement(ECRIP_IMGadmissionSearch_Radiobutton);
	}
	private By ECRIP_IMGadmissionSearch_Selectbutton = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	                                                          
	public WebElement getECRIP_IMGadmissionSearch_Selectbutton() {
		return getElement(ECRIP_IMGadmissionSearch_Selectbutton);
	}
	private By ECRIP_IMgUHIDSearch = By.id("ctl00_cphpage_imgsearchUHID");
	public WebElement getECRIP_IMgUHIDSearch() {
		return getElement(ECRIP_IMgUHIDSearch);
	}
	private By ECRIP_lnkbtnMLCdetails = By.id("ctl00_cphpage_lnkbtnMLCdetails");
	public WebElement getECRIP_lnkbtnMLCdetails() {
		return getElement(ECRIP_lnkbtnMLCdetails);
	}
	private By ECRIP_lnkbtnContactdetails = By.id("ctl00_cphpage_lnkbtnContactDetails");
	public WebElement getECRIP_lnkbtnContactdetails() {
		return getElement(ECRIP_lnkbtnContactdetails);
	}
	private By ECRIP_lnkbtnPassportdetails = By.id("ctl00_cphpage_lnkbtnPassportDetails");
	public WebElement getECRIP_lnkbtnPassportdetails() {
		return getElement(ECRIP_lnkbtnPassportdetails);
	}
	private By ECRIP_lnkbtnAllergiesdetails = By.id("ctl00_cphpage_lnkbtnAllergies");
	public WebElement getECRIP_lnkbtnAllergiesdetails() {
		return getElement(ECRIP_lnkbtnAllergiesdetails);
	}
	private By ECRIP_lnkbtnEmployeedetails = By.id("ctl00_cphpage_lnkbtnEmployee");
	public WebElement getECRIP_lnkbtnEmployeedetails() {
		return getElement(ECRIP_lnkbtnEmployeedetails);
	}
	
	
	private By ECRIP_InsuranceNotxtbox = By.id("ctl00_cphpage_txtInsuranceNo");

	public WebElement getECRIP_InsuranceNotxtbox() {
		return getElement(ECRIP_InsuranceNotxtbox);
	}
	private By ECRIP_InsuranceNolinkbutton = By.id("ctl00_cphpage_lnkbtnIPNo");

	public WebElement getECRIP_InsuranceNolinkbutton() {
		return getElement(ECRIP_InsuranceNolinkbutton);
	}
	private By ECRIP_InsuranceNo_UHIDchekbox = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl04_chkUHID");

	public WebElement getECRIP_InsuranceNo_UHIDchekbox() {
		return getElement(ECRIP_InsuranceNo_UHIDchekbox);
	}
	private By ECRIP_InsuranceNo_LiveListbtnselect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");

	public WebElement getECRIP_InsuranceNo_LiveListbtnselect() {
		return getElement(ECRIP_InsuranceNo_LiveListbtnselect);
	}
	private By ECRIP_Specialisation_DDL = By.id("ctl00_cphpage_ddlSpecialisation");

	public WebElement getECRIP_Specialisation_DDL() {
		return getElement(ECRIP_Specialisation_DDL);
	}
	private By ECRIP_Unit_DDL = By.id("ctl00_cphpage_ddlUnit");

	public WebElement  getECRIP_Unit_DDL() {
		return getElement(ECRIP_Unit_DDL);
	}
	private By ECRIP_SaveButton = By.id("ctl00_cphpage_btnSave");
	
	public WebElement  getECRIP_SaveButton() {
		return getElement(ECRIP_SaveButton);
	}
	private By ECRIP_ClearButton = By.id("ctl00_cphpage_btnClear");

	public WebElement  getECRIP_ClearButton() {
		return getElement(ECRIP_ClearButton);
	}
	private By ECRIP_PrintButton = By.id("ctl00_cphpage_btnPrint");

	public WebElement  getECRIP_PrintButton() {
		return getElement(ECRIP_PrintButton);
	}
	private By ECRIP_DepositeButton = By.id("ctl00_cphpage_btnDepositDetails");

	public WebElement  getECRIP_DepositeButton() {
		return getElement(ECRIP_DepositeButton);
	}
	private By ECRIP_SuccesMYmessageBoxokbutton = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");

	public WebElement  getECRIP_SuccesMYmessageBoxokbutton() {
		return getElement(ECRIP_SuccesMYmessageBoxokbutton);
	}
	private By ECRIP_IPNumberradiobutton = By.id("ctl00_cphpage_rbl_0");

	public WebElement  getECRIP_IPNumberradiobutton() {
		return getElement(ECRIP_IPNumberradiobutton);
	}
	private By ECRIP_WardTypeDLL= By.id("ctl00_cphpage_ddlWardType");// ctl00_cphpage_ddlWardType

	public WebElement  getECRIP_WardTypeDLL() {
		return getElement(ECRIP_WardTypeDLL);
	}
	private By BlackOverlay= By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[5]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[2];");

	public WebElement  getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	
	
	
}
