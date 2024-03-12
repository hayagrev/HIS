package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Miscellaneous_Changes_in_Clinical_RecordsPage extends BasePage{

	public Miscellaneous_Changes_in_Clinical_RecordsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By ESIC_Employee_ESIC_Pensioner_Insurance_No=By.id("ctl00_cphpage_txtinsurenceno");
	public WebElement getESIC_Employee_ESIC_Pensioner_Insurance_NoText() {
		return getElement(ESIC_Employee_ESIC_Pensioner_Insurance_No);
		
	}
	private By ESIC_Employee_ESIC_Pensioner_Insurance_NoImage=By.id("ctl00_cphpage_imageScreenSearch");
	public WebElement getESIC_Employee_ESIC_Pensioner_Insurance_No_ImageSearchbutton() {
		return getElement(ESIC_Employee_ESIC_Pensioner_Insurance_NoImage);
		
	}
	private By ESIC_Employee_ESIC_Pensioner_Insurance_NoLable=By.id("ctl00_cphpage_lblInsurencenos");
	public WebElement getESIC_Employee_ESIC_Pensioner_Insurance_NoLable() {
		return getElement(ESIC_Employee_ESIC_Pensioner_Insurance_NoLable);
		
	}
	private By Imageofprocees=By.xpath("/html/body/div[2]/div[1]/img");
	public WebElement getImageofprocees() {
		return getElement(Imageofprocees);
		
	}
	private By PopupCloseButton=By.id("ctl00_cphpage_btnClose");
	public WebElement getPopupCloseButton() {
		return getElement(PopupCloseButton);
		
	}
	private By Check_in_noDDL=By.id("ctl00_cphpage_ddlCheckinNo");
	public WebElement getCheck_in_noDDL() {
		return getElement(Check_in_noDDL);
		
	}
	private By InformationOkButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getInformationOkButton() {
		return getElement(InformationOkButton);
		
	}
	private By Registration=By.linkText("Registration");
	public WebElement getRegistrationLink() {
		return getElement(Registration);
		
	}
	private By PatientCheckIn=By.linkText("Patient Check-In /Registration");
	public WebElement getPatientCheckInLink() {
		return getElement(PatientCheckIn);
		
	}
	
	//casesheet
private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");
    
	// Livelist Control

	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");

	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	private By hisLiveListControlchkUHID2 = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl03_chkUHID");

	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	
	
	
	
	
	// Checkin page
	private By change_facility_location_link=By.id("ctl00_lnkbtnChangeHospital");


	private By btnOK = By.id("ctl00_cphpage_btnOK");

	private By btnSaveDisplay = By.id("ctl00_cphpage_btnSaveDisplay");

	private By btncancel = By.id("popup_cancel");

	private By popupmessage = By.id("popup_message");

	private By ddlSpecialisation = By.id("ctl00_cphpage_ddlSpecialisation");
    private By popokbutton=By.id("popup_ok");
    private By btnclear=By.id("ctl00_cphpage_btnClear");
    private By refferls  =By.id("ctl00_cphpage_lnkReferral");
	/**
	 * @return the ddlSpecialisation
	 */
    public WebElement getrefferlsLink() {
    	return getElement(refferls);
    }
    public WebElement getclearbuttonLink() {
    	return getElement(btnclear);
    }
    public WebElement getpopokbuttonLink() {
    	return getElement(popokbutton);
    }
	public WebElement gethisLiveListControlchkUHID2Link() {
		return getElement(hisLiveListControlchkUHID2);
	}
	public WebElement getDdlSpecialisation() {
		return getElement(ddlSpecialisation);
	}

	public WebElement getTxtIPNO() {
		return getElement(txtIPNO);
	}

	public WebElement getLnkbtnIPNo() {
		return getElement(lnkbtnIPNo);
	}

	public WebElement getHisLiveListControlchkUHID() {
		return getElement(hisLiveListControlchkUHID);
	}

	public WebElement getHisLiveListControlbtnSelect() {
		return getElement(hisLiveListControlbtnSelect);
	}

	public WebElement getBtnOK() {
		return getElement(btnOK);
	}

	public WebElement getBtnSaveDisplay() {
		return getElement(btnSaveDisplay);
	}

	public WebElement getBtncancel() {
		return getElement(btncancel);
	}

	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	public WebElement getchange_facility_location_linkLink() {
		return getElement(change_facility_location_link);
	}

	public String verifyPatientCheckInPageTitle() {

		return driver.getTitle();

	}
	private By DoctorWorklistLink = By.linkText("Doctor Worklist");
	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklistLink);

	}
	private By ClinicalRecordsLink = By.linkText("Clinical Records");
	public WebElement getClinicalRecordsLink() {
		return getElement(ClinicalRecordsLink);

	}
	private By BlackOverlay=By.xpath("/html/body/div[2]/div[1]/img");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	private By UHID_creation_Uhid_txtbox=By.id("ctl00_cphpage_txtuhid");
	public WebElement getUHID_creation_Uhid_txtbox() {
		return getElement(UHID_creation_Uhid_txtbox);
	}
	private By doctorworklist_checkintextBox=By.id("ctl00_cphpage_txtCheckinno");
	public WebElement getdoctorworklist_checkintextBox() {
		return getElement(doctorworklist_checkintextBox);
	}
	private By popupok = By.id("popup_ok");
	public WebElement getpopupok() {
		return getElement(popupok);

	}
	private By prescriptionLink = By.id("ctl00_cphpage_trvSectionst11");
	public WebElement getprescriptionLink() {
		return getElement(prescriptionLink);

	}
	private By IntraInterRefferalRadioButton = By.id("radbtnadmitafter1");
	public WebElement getIntraInterRefferalRadioButton() {
		return getElement(IntraInterRefferalRadioButton);//Sanathnagar,TS(ESIC Medical College Hosp.)

	}
	private By HospitalDDl = By.id("ddlHospitals");
	public WebElement getHospitalDDl() {
		return getElement(HospitalDDl);

	}
	private By SpeciliazationDDl = By.id("ddlESICSpecialization");
	public WebElement getSpeciliazationDDl() {
		return getElement(SpeciliazationDDl);

	}
	private By ReferralRemarkTextBox = By.id("txtreasonForReferral");
	public WebElement getReferralRemarkTextBox() {
		return getElement(ReferralRemarkTextBox);

	}
	private By AddButton = By.id("btnOk");
	public WebElement getAddButton() {
		return getElement(AddButton);

	}
	private By SaveCloseButton = By.id("btnSaveClose");
	public WebElement getSaveCloseButton() {
		return getElement(SaveCloseButton);

	}
	private By tab = By.id("ctl00_cphpage_imgTitlePanel");
	public WebElement gettab() {
		return getElement(tab);

	}
	private By ICDdiagnosisTextbox = By.id("txtICDDiagnosis");
	public WebElement getICDdiagnosisTextbox() {
		return getElement(ICDdiagnosisTextbox);

	}
	private By diagnosisName = By.id("362972006$Disorder of labour / delivery");// 38362002$Dengue fever
	public WebElement getdiagnosisName() {
		return getElement(diagnosisName);

	}
	private By diagnosisremarks = By.id("txt_Remarks");
	public WebElement getdiagnosisremarks() {
		return getElement(diagnosisremarks);

	}
	private By diagnosisTypeDDL = By.id("ddl_DropDown");
	public WebElement getdiagnosisTypeDDL() {
		return getElement(diagnosisTypeDDL);

	}
	private By diagnosisADDbutton = By.id("btnOK");
	public WebElement getdiagnosisADDbutton() {
		return getElement(diagnosisADDbutton);

	}
	private By prescriptionSavePrintButton = By.id("btnSave");
	public WebElement getprescriptionSavePrintButton() {
		return getElement(prescriptionSavePrintButton);

	}
	
	
	
	
	
	
}
