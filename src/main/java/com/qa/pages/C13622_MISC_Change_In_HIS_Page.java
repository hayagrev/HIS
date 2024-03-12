package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C13622_MISC_Change_In_HIS_Page extends BasePage{

	public C13622_MISC_Change_In_HIS_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By InsuranceTxtBox=By.id("ctl00_cphpage_txtInsuranceNo");
	public WebElement getInsuranceTxtBox() {
		return getElement(InsuranceTxtBox);
	}
	private By ESICEmployeeRadioButton=By.id("ctl00_cphpage_rbl_1");
	public WebElement getESICEmployeeRadioButton() {
		return getElement(ESICEmployeeRadioButton);
	}
	private By ESICPensionerRadioButton=By.id("ctl00_cphpage_rbl_2");
	public WebElement getESICPensionerRadioButton() {
		return getElement(ESICPensionerRadioButton);
	}
	
	private By LiveListLink=By.id("ctl00_cphpage_lnkbtnIPNo");
	public WebElement getLiveListLink() {
		return getElement(LiveListLink);
	}   
	private By progressimage=By.xpath("/html/body/div[2]/div[1]");
	public WebElement getprogressimage() {
		return getElement(progressimage);
	} 
	
	private By LiveListSelfRadioButton=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	                                           
	public WebElement getLiveListSelfRadioButton() {
		return getElement(LiveListSelfRadioButton);
	}
	private By LiveListDepandentRadioButton=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl03_chkUHID");
	public WebElement getLiveListDepandentRadioButton() {
		return getElement(LiveListDepandentRadioButton);
	}
	private By LiveListSelectButton=By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	public WebElement getLiveListSelectButton() {
		return getElement(LiveListSelectButton);
	}
	private By presentPrimaryMobileNumberLable=By.id("ctl00_cphpage_txtPresentMobileNew");
	public WebElement getpresentPrimaryMobileNumberLable() {
		return getElement(presentPrimaryMobileNumberLable);
	}
	private By PresentPrimaryMobileNumberTextBox=By.id("ctl00_cphpage_txtPresentMobileNew");
	public WebElement getPresentPrimaryMobileNumberTextBox() {
		return getElement(PresentPrimaryMobileNumberTextBox);
	}
	private By ParmanantPrimaryMobileNumberLable=By.id("ctl00_cphpage_lblPermtMobileNoNew");
	public WebElement getParmanantPrimaryMobileNumberLable() {
		return getElement(ParmanantPrimaryMobileNumberLable);
	}
	private By ParmanantPrimaryMobileNumberTextbox=By.id("ctl00_cphpage_txtPresentMobileNew");
	public WebElement getParmanantPrimaryMobileNumberTextbox() {
		return getElement(ParmanantPrimaryMobileNumberTextbox);
	}
	private By presentAlternativeMobileNumberLable=By.id("ctl00_cphpage_lblpresentmobile");
	public WebElement getpresentAlternativeMobileNumberLable() {
		return getElement(presentAlternativeMobileNumberLable);
	}
	
	private By ParmanantAlternativeMobileNumberLable=By.id("ctl00_cphpage_lblpermtmobileno");
	public WebElement getParmanantAlternativeMobileNumberLable() {
		return getElement(ParmanantAlternativeMobileNumberLable);
	}
	private By CheckIn_ContectNumberLable=By.id("ctl00_cphpage_lblMobile");
	public WebElement getCheckIn_ContectNumberLable() {
		return getElement(CheckIn_ContectNumberLable);
	}
	private By CheckIn_ContectNumberTextBox=By.id("ctl00_cphpage_txtIPMobile");
	public WebElement getCheckIn_ContectNumberTextBox() {
		return getElement(CheckIn_ContectNumberTextBox);
	}
	private By UHIDScreen_clearButton=By.id("ctl00_cphpage_btnClear");
	public WebElement getUHIDScreen_clearButton() {
		return getElement(UHIDScreen_clearButton);
	}
	private By UHIDScreen_ESICEmployeeSelfRadioButton=By.id("ctl00_cphpage_hisLiveListControl_Grdhrms_ctl02_chkHRMSUHID");
	                                                         
	public WebElement getUHIDScreen_ESICEmployeeSelfRadioButton() {
		return getElement(UHIDScreen_ESICEmployeeSelfRadioButton);
	}
	private By UHIDScreen_ESICEmployeeDepandentRadioButton=By.id("ctl00_cphpage_hisLiveListControl_Grdhrms_ctl03_chkHRMSUHID");
	public WebElement getUHIDScreen_ESICEmployeeDepandentRadioButton() {
		return getElement(UHIDScreen_ESICEmployeeDepandentRadioButton);
	}
	private By PatientCheckIn_ContectNoTextBox=By.id("ctl00_cphpage_txtIPMobile");
	public WebElement getPatientCheckIn_ContectNoTextBox() {
		return getElement(PatientCheckIn_ContectNoTextBox);
	}
	private By PatientCheckIn_IPtextBox=By.id("ctl00_cphpage_txtIPNO");
	public WebElement getPatientCheckIn_IPtextBox() {
		return getElement(PatientCheckIn_IPtextBox);
	}
	
	private By patientCheckInNumberSeviceOkButton=By.id("ctl00_cphpage_btnOK");
	public WebElement getpatientCheckInNumberSeviceOkButton() {
		return getElement(patientCheckInNumberSeviceOkButton);
	}
	private By BlackOverlay=By.xpath("/html/body/div[2]/div[2]");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	private By patientCheckInNumberSaveButton=By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getpatientCheckInNumberSaveButton() {
		return getElement(patientCheckInNumberSaveButton);
	}
	private By popupmessage = By.id("popup_message");
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	private By btncancel = By.id("popup_cancel");
	public WebElement getBtncancel() {
		return getElement(btncancel);
	}
	private By UHID_creation_Uhid_txtbox = By.id("ctl00_cphpage_txtuhid");
	public WebElement getUHID_creation_Uhid_txtbox() {
		return getElement(UHID_creation_Uhid_txtbox);
	}
	private By ClinicalRecordsLink = By.linkText("Clinical Records");
	public WebElement getClinicalRecordsLink() {
		return getElement(ClinicalRecordsLink);

	}
	private By Registration = By.linkText("Registration");
	public WebElement getRegistration() {
		return getElement(Registration);

	}
	private By PatientChekIn = By.linkText("Patient Check-In /Registration");
	public WebElement getPatientChekIn() {
		return getElement(PatientChekIn);

	}
	private By DoctorWorklistLink = By.linkText("Doctor Worklist");
	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklistLink);

	}
	private By doctorworklist_checkintextBox=By.id("ctl00_cphpage_txtCheckinno");
	public WebElement getdoctorworklist_checkintextBox() {
		return getElement(doctorworklist_checkintextBox);
	}
	private By popupok = By.id("popup_ok");
	public WebElement getpopupok() {
		return getElement(popupok);

	}
	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}
	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701
	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}
	private By orderpackselection = By.id("18929"); //
	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}
	private By btnISaveClose = By.id("btnISaveClose");
	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);
}
	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");
	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

	}
	private By prescriptiondeletemedicineButton = By.id("btnDeLeteM3");
	public WebElement getprescriptiondeletemedicineButtonLink() {
		return getElement(prescriptiondeletemedicineButton);

	}
	private By changeLocation = By.id("ctl00_lnkbtnChangeHospital");
	public WebElement getchange_facility_location_linkLink() {
		return getElement(changeLocation);

	}	
	private By StoreUhidTextBox = By.id("ctl00_cphpage_txtCheckinNo");
	public WebElement getStoreUhidTextBox() {
		return getElement(StoreUhidTextBox);

	}
	private By StoreUhidImgSerch = By.id("ctl00_cphpage_imgCheckinno");
	public WebElement getStoreUhidImgSerch() {
		return getElement(StoreUhidImgSerch);

	}
	private By StoreUhidIssueQuantity = By.id("ctl00_cphpage_grdIssueDetails_ctl02_txtIssueQty");
	public WebElement getStoreUhidIssueQuantity() {
		return getElement(StoreUhidIssueQuantity);

	}
	private By StoreUhidIssueSaveButton = By.id("ctl00_cphpage_btnSave");
	public WebElement getStoreUhidIssueSaveButton() {
		return getElement(StoreUhidIssueSaveButton);

	}
	private By LastTenPrescriptionButton = By.xpath("/html/body/form/div[3]/div[1]/fieldset/table/tbody/tr[5]/td/table/tbody/tr[1]/td/div/div[2]/input[2]");
	public WebElement getLastTenPrescriptionButton() {
		return getElement(LastTenPrescriptionButton);

	}
	
}
