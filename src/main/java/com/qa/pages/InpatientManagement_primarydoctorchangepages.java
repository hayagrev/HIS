package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InpatientManagement_primarydoctorchangepages extends BasePage {
     
	
WebDriver driver;
	
	public InpatientManagement_primarydoctorchangepages(WebDriver driver){
		
		super(driver);
		
	}
	private By Admissionnoicon = By.xpath("//input[@id='ctl00_cphpage_imgbtnPatientNo']");
	public WebElement getAdmissionnoicon() {
		return getElement(Admissionnoicon);
	}
	private By Dropdown = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_ddlCriteria");
	public WebElement getDropdown() {
		return getElement(Dropdown);
	}
	private By PatientNametxtbox = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getPatientNametxtbox() {
		return getElement(PatientNametxtbox);
	}
	private By Search = By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getSearch() {
		return getElement(Search);
	}
	private By Radiobtn = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtn() {
		return getElement(Radiobtn);
	}
	private By Select = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getSelect() {
		return getElement(Select);
	}
	private By PrimaryDoctorNametxtbox = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getPrimaryDoctorNametxtbox() {
		return getElement(PrimaryDoctorNametxtbox);
	}
	private By Primarydoctoricon = By.id("ctl00_cphpage_gdvPrimaryDoctor_ctl03_btnDoctor");
	public WebElement getPrimarydoctoricon() {
		return getElement(Primarydoctoricon);
	}
	private By Searchdoctorfirstname = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getSearchdoctorfirstname() {
		return getElement(Searchdoctorfirstname);
	}
	private By Search1 = By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getSearch1() {
		return getElement(Search1);
	}
	private By Radiobtn1 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtn1() {
		return getElement(Radiobtn1);
	}
	private By Select1 = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getSelect1() {
		return getElement(Select1);
	}
	private By Save = By.id("ctl00_cphpage_btnSave");
	public WebElement getSave() {
		return getElement(Save);
	}
	private By MSGBtnOK = By.id("ctl00_cphpage_MyMessageBox_ButtonOK");
	public WebElement getMSGBtnOK() {
		return getElement(MSGBtnOK);
	}
	private By PrimaryDoctorSearchImageButton = By.id("ctl00_cphpage_gdvPrimaryDoctor_ctl02_btnDoctor");
	public WebElement getPrimaryDoctorSearchImageButton() {
		return getElement(PrimaryDoctorSearchImageButton);
	}
	private By DoctorDeleteImage = By.id("ctl00_cphpage_gdvPrimaryDoctor_ctl02_btnImgDelete");
	public WebElement getDoctorDeleteImage() {
		return getElement(DoctorDeleteImage);
	}
	private By DoctorsearchNameTextbox = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getDoctorsearchNameTextbox() {
		return getElement(DoctorsearchNameTextbox);
	}
	private By updateprocess = By.xpath("//*[@id='ctl00_PageUpdateProgress']");
	public WebElement getupdateprocess() {
		return getElement(updateprocess);
	}
	

	
	
	
		
}


