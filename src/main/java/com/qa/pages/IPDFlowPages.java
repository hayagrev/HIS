package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class IPDFlowPages extends BasePage{
	String parent10;
	public IPDFlowPages(WebDriver driver) {
		super(driver);
		parent10="";
		
			}
	util utilobj = new util();
	
	/*UHID */
	private By changeLocation = By.id("ctl00_lnkbtnChangeHospital");
	private By SelectHospitalLocationDDL = By.id("ctl00_cphpage_ddlHospital");
	private By SelectFacilityLocationDDL = By.id("ctl00_cphpage_ddlFacility");
	private By SelectFacilityLocationSubmitButton = By.id("ctl00_cphpage_btnSubmit");
	
	
	private By Registration=By.linkText("Registration");
	private By patientAdmission=By.linkText("Patient Admission");
	private By ClinicalRecordLink=By.linkText("Clinical Records");
	private By DischargeIntimationLink=By.linkText("Discharge Intimation");
	private By Inpatient_EmergancyPatient=By.linkText("Inpatients/Emergency Patients");
	private By Title = By.id("ctl00_cphpage_ddlTitle");
	private By FirstName = By.id("ctl00_cphpage_txtFirstName");
	private By LastName = By.id("ctl00_cphpage_txtLastName");
	private By MarriageStatus = By.xpath("//*[@id='ctl00_cphpage_ddlMarriage']");
	private By Age = By.id("ctl00_cphpage_txtAge");
	private By PresentAddres = By.id("ctl00_cphpage_txtPresentAddress1");
	private By Savebutton = By.id("ctl00_cphpage_btnSaveDisplay");
	private By btnYes = By.id("ctl00_cphpage_btnYes1");
	private By InformationPopUp = By.id("ctl00_cphpage_btnYes");
	private By UHID_creation_printButton = By.id("ctl00_cphpage_btnPrint");
	private By UHID_creation_Uhid_txtbox = By.id("ctl00_cphpage_txtUhid");
	private By UHID_creation_Uhid_succes = By.id("ctl00_cphpage_btnOK11");
	private By UHID_creation_Uhid_OPDNumber = By.id("ctl00_cphpage_lnkbtnCheckIn");
	private By patientCheckInNumberUHIDTXTBOX=By.id("ctl00_cphpage_txtuhid");
	private By patientCheckInNumberSeviceOkButton=By.id("ctl00_cphpage_btnOK");
	private By patientCheckInNumberSaveButton=By.id("ctl00_cphpage_btnSaveDisplay");
	private By patientCheckInNumberinfoMsgboxcancelbutton=By.id("popup_cancel");
	private By patientCheckInNumberRegistration=By.id("ctl00_cphpage_lnkRegistration");
	private By UHID_creation_clearButton=By.id("ctl00_cphpage_btnClear");
	private By UHID_TextBox=By.id("ctl00_cphpage_txtUhid");
	private By inpatientManagement=By.linkText("InPatient Management");
	private By IPMDischargeIntemation=By.linkText("Discharge Intimations");
	private By ClinicalrecordDischargeIntemation=By.linkText("Discharge Intimations");
	public WebElement getClinicalrecordDischargeIntemationLink() {
		return getElement(ClinicalrecordDischargeIntemation);
	}
	public WebElement getSelectFacilityLocationSubmitButton() {
		return getElement(SelectFacilityLocationSubmitButton);
	}
	public WebElement getinpatientManagementLink() {
		
		return getElement(inpatientManagement);
	}
public WebElement getIPMDischargeintimationLink() {
		
		return getElement(IPMDischargeIntemation);
	}
	public WebElement getSelectHospitalLocationDDL() {
		return getElement(SelectHospitalLocationDDL);
	}
	public WebElement getSelectFacilityLocationDDL() {
		return getElement(SelectFacilityLocationDDL);
	}
	public WebElement getUHID_TextBox() {
		return getElement(UHID_TextBox);
	}
	public WebElement getregistrationLink() {
		return getElement(Registration);
	}
	public WebElement getpatientAdmission() {
		return getElement(patientAdmission);
	}
	public WebElement getClinicalRecordLink() {
		return getElement(ClinicalRecordLink);
	}
	public WebElement getDischargeIntimationLink() {
		return getElement(DischargeIntimationLink);
	}
	public WebElement getInpatientEmergancyPatientLink() {
		return getElement(Inpatient_EmergancyPatient);
	}
	public WebElement getchange_facility_location_linkLink() {
		return getElement(changeLocation);

	}

	
	public WebElement getUHID_creation_clearButton() {
		return getElement(UHID_creation_clearButton);
	}
	public WebElement getpatientCheckInNumberinfoMsgboxcancelbutton() {
		return getElement(patientCheckInNumberinfoMsgboxcancelbutton);
	}
	public WebElement getpatientCheckInNumberRegistration() {
		return getElement(patientCheckInNumberRegistration);
	}
	public WebElement getpatientCheckInNumberSaveButton() {
		return getElement(patientCheckInNumberSaveButton);
	}
	public WebElement getpatientCheckInNumberSeviceOkButton() {
		return getElement(patientCheckInNumberSeviceOkButton);
	}
	public WebElement getpatientCheckInNumberUHIDTXTBOX() {
		return getElement(patientCheckInNumberUHIDTXTBOX);
	}
	public WebElement getUHID_creation_Uhid_OPDNumber() {
		return getElement(UHID_creation_Uhid_OPDNumber);
	}
	public WebElement getUHID_creation_Uhid_succes() {
		return getElement(UHID_creation_Uhid_succes);
	}

	public WebElement getUHID_creation_Uhid_txtbox() {
		return getElement(UHID_creation_Uhid_txtbox);
	}
	public WebElement getUHID_creation_printButton() {
		return getElement(UHID_creation_printButton);
	}
	public WebElement getTitle() {
		return getElement(Title);
	}

	public WebElement getFirstName() {
		return getElement(FirstName);
	}

	public WebElement getLastName() {
		return getElement(LastName);
	}

	public WebElement getMarriageStatus() {
		return getElement(MarriageStatus);
	}

	public WebElement getAge() {
		return getElement(Age);
	}

	public WebElement getPresentAddres() {
		return getElement(PresentAddres);
	}

	public WebElement getSavebutton() {
		return getElement(Savebutton);
	}
	
	public WebElement getbtnYes() {
		return getElement(btnYes);
	}
	
	public WebElement getInformationPopUp() {
		return getElement(InformationPopUp);
	}
	

	public String verifyUHIDPageTitle() {

		return driver.getTitle();

	}
	/*Registration*/
	private By patientAdmission_UHIDImgSearch =By.id("ctl00_cphpage_imgsearchUHID");
	private By patientAdmission_UHIDSearchPOPTXTBOX =By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By patientAdmission_UHIDSearchButtonSearch =By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	private By patientAdmission_UHIDRadioButtonBox =By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By patientAdmission_UHIDSearchBTNSelect =By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	private By ddlAdmissionType =By.id("ctl00_cphpage_ddlAdmissionType");
	private By ddlAdmissionSrc =By.id("ctl00_cphpage_ddlAdmissionSrc");
	private By ddlSpeciallization =By.id("ctl00_cphpage_ddlSpecialisation");
	private By ddlunit =By.id("ctl00_cphpage_ddlUnit");
	private By ddlwardType =By.id("ctl00_cphpage_ddlWardType");
	private By patientAdmission_permanantsameaspresent =By.id("ctl00_cphpage_PermanentSameAsPresent");
	private By patientAdmission_SaveButton =By.id("ctl00_cphpage_btnSave");
	private By patientAdmission_informationOKButton =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	private By patientAdmission_succesokbutton =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By patientAdmission_AdmissionNoTextBox =By.id("ctl00_cphpage_txtAdmissionNo");
	
	public WebElement getpatientAdmission_AdmissionNoTextBox() {
		return getElement(patientAdmission_AdmissionNoTextBox);
	}
	public WebElement getpatientAdmission_permanantsameaspresent() {
		return getElement(patientAdmission_permanantsameaspresent);
	}
	public WebElement getpatientAdmission_UHIDSearchPOPTXTBOX() {
		return getElement(patientAdmission_UHIDSearchPOPTXTBOX);
	}
	public WebElement getddlSpeciallization() {
		return getElement(ddlSpeciallization);
	}
	public WebElement getddlUnit() {
		return getElement(ddlunit);
	}
	public WebElement getddlwardType() {
		return getElement(ddlwardType);
	}
	public WebElement getpatientAdmission_UHIDSearchButtonSearch() {
		return getElement(patientAdmission_UHIDSearchButtonSearch);
	}
	public WebElement getpatientAdmission_UHIDRadioButtonBox() {
		return getElement(patientAdmission_UHIDRadioButtonBox);
	}
	public WebElement getpatientAdmission_UHIDImgSearch() {
		return getElement(patientAdmission_UHIDImgSearch);
	}
	
	public WebElement getpatientAdmission_UHIDSearchBTNSelect() {
		return getElement(patientAdmission_UHIDSearchBTNSelect);
	}
	public WebElement getDdlAdmissionType() {
		return getElement(ddlAdmissionType);
	}

	public WebElement getDdlAdmissionSrc() {
		return getElement(ddlAdmissionSrc);
	}
	public WebElement getpatientAdmission_SaveButton() {
		return getElement(patientAdmission_SaveButton);
	}
	public WebElement getpatientAdmission_informationOKButton() {
		return getElement(patientAdmission_informationOKButton);
	}
	public WebElement getpatientAdmission_succesokbutton() {
		return getElement(patientAdmission_succesokbutton);
	}
	/*ip casesheet*/
	private By popok = By.id("popup_ok");

	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");

	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");

	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

	private By orderpackselection = By.id("18929"); //

	private By btnISaveClose = By.id("btnISaveClose"); //
	private By btnclear=By.id("btnClear");
	private By btnclose=By.id("btnIClose");
	private By change_facility_location_link=By.id("ctl00_lnkbtnChangeHospital");
	
	
	public WebElement getbtn_close_Link() {
		return getElement(btnclose);
	}
	public WebElement getbtn_clear_Link() {
		return getElement(btnclear);
	}
	



	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}

	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}

	public WebElement getpopok() {
		return getElement(popok);

	}

	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

	}

	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}

	public WebElement getorderpack() {
		return getElement(orderpack);

	}

	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}
	/*End ip casesheet*/
	/*inpatient management*/
	private By INpatientmanagementLink=By.linkText("InPatient Management");
	private By INpatientmanagementAllotBedLink=By.linkText("Allot Bed");
	private By INpatientmanagementAllotbedadmissionNO=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr/td/div/div/table/tbody/tr[2]/td[1]/a");
	                                                            
	private By INpatientmanagementAllotbedinformtionokbutton=By.id("popup_ok");
	private By INpatientmanagementAllotbed_bedName=By.id("ctl00_cphpage_ddlBedName");
	private By INpatientmanagementAllotbed_saveButton=By.id("ctl00_cphpage_btnSave");
	private By INpatientmanagementAllotbed_Succusokbutton=By.id("popup_ok");
	private By INpatientmanagementUpdateStatus=By.linkText("Update Bed Status");
	private By INpatientmanagementUpdateStatus_bednameDDL=By.id("ctl00_cphpage_ddlBedName");
	private By INpatientmanagementUpdateStatus_changetostatusddl=By.id("ctl00_cphpage_ddlChangetoStatus");
	private By INpatientmanagementUpdateStatus_saveButton=By.id("ctl00_cphpage_btnSave");
	private By InpatientEmargancyPatientSurgeryUnitpluebutton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[2]/th[1]/img");
	private By InpatientEmargancyPatientSurgeryUnitBedIMG=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[7]/td[2]/input");
	                                                                
	//popup_ok
	
	public WebElement getInpatientEmargancyPatientSurgeryUnitBedIMG() {
		return getElement(InpatientEmargancyPatientSurgeryUnitBedIMG);
	}
	public WebElement getINpatientmanagementUpdateStatus_saveButton() {
		return getElement(INpatientmanagementUpdateStatus_saveButton);
	}
	public WebElement getInpatientEmargancyPatientSurgeryUnitpluebuuton() {
		return getElement(InpatientEmargancyPatientSurgeryUnitpluebutton);
	}
	public WebElement getINpatientmanagementUpdateStatus_changetostatusddl() {
		return getElement(INpatientmanagementUpdateStatus_changetostatusddl);
	}
	public WebElement getINpatientmanagementLink() {
		return getElement(INpatientmanagementLink);
	}
	public WebElement getINpatientmanagementUpdateStatus() {
		return getElement(INpatientmanagementUpdateStatus);
	}
	public WebElement getINpatientmanagementUpdateStatus_bednametxtDDL() {
		return getElement(INpatientmanagementUpdateStatus_bednameDDL);
	}
	public WebElement getINpatientmanagementAllotBedLink() {
		return getElement(INpatientmanagementAllotBedLink);
	}
	public WebElement getINpatientmanagementAllotbedadmissionNO() {
		return getElement(INpatientmanagementAllotbedadmissionNO);
	}
	public WebElement getINpatientmanagementAllotbedinformtionokbutton() {
		return getElement(INpatientmanagementAllotbedinformtionokbutton);
	}
	public WebElement getINpatientmanagementAllotbed_bedName() {
		return getElement(INpatientmanagementAllotbed_bedName);
	}
	public WebElement getINpatientmanagementAllotbed_saveButton() {
		return getElement(INpatientmanagementAllotbed_saveButton);
	}
	public WebElement getINpatientmanagementAllotbed_Succusokbutton() {
		return getElement(INpatientmanagementAllotbed_Succusokbutton);
	}/*end inpatient management*/
	/*laboratory*/
	private By reqNo=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a");
	public WebElement getreqNoLink() 
	{
		return getElement(reqNo);
	}
	private By laboratory_Requisition_Details_IP_OPSC_checkbox =By.id("gvTestOrderItems_ctl02_chksamplecollect");
	public WebElement getlaboratory_Requisition_Details_IP_OPSC_checkboxLink() {
		return getElement(laboratory_Requisition_Details_IP_OPSC_checkbox);
		
	}
	private By laboratory_Requisition_Details_IP_OP_savebutton =By.id("btnSave");
	public WebElement getlaboratory_Requisition_Details_IP_OP_savebuttonLink() {
		return getElement(laboratory_Requisition_Details_IP_OP_savebutton);
	}
	private By  laboratory_requisition_details_IP_OP_SA_CheckBox=By.id("gvTestOrderItems_ctl02_chksampleack");
	public WebElement getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink() {
		return getElement(laboratory_requisition_details_IP_OP_SA_CheckBox);
	}
	private By LaboratoryOPworkListImageResultEntry=By.id("gvTestOrderItems_ctl02_imgresultentry");
	public WebElement getLaboratoryOPworkListImageResultEntry() {
		return getElement(LaboratoryOPworkListImageResultEntry);
	}
	private By LaboratoryOPworkListImageResultEntryHemoglobinTextBox=By.id("gdvComponents_ctl02_txtControl");
	public WebElement getLaboratoryOPworkListImageResultEntryHemoglobinTextBox() {
		return getElement(LaboratoryOPworkListImageResultEntryHemoglobinTextBox);
	}
	private By LaboratoryOPworkListImageResultEntryDoctorNameCheckBox=By.id("gdvSearchResult_ctl02_chkDoctor");
	public WebElement getLaboratoryOPworkListImageResultEntryDoctorNameCheckBox() {
		return getElement(LaboratoryOPworkListImageResultEntryDoctorNameCheckBox);
	}
	private By LaboratoryOPworkListImageResultEntrySaveButton=By.id("btnSave");
	public WebElement getLaboratoryOPworkListImageResultEntrySaveButton() {
		return getElement(LaboratoryOPworkListImageResultEntrySaveButton);
	}
	private By LaboratoryOPworkListImageResultEntrycheckResultcheckBox=By.id("chkResults");
	public WebElement getLaboratoryOPworkListImageResultEntrycheckResultcheckBox() {
		return getElement(LaboratoryOPworkListImageResultEntrycheckResultcheckBox);
	}
	private By LaboratoryOPworkListImageResultEntryBtnUpdate=By.id("btnUpdate");
	public WebElement getLaboratoryOPworkListImageResultEntryBtnUpdate() {
		return getElement(LaboratoryOPworkListImageResultEntryBtnUpdate);
	}
	private By Requisition_close_button=By.id("btnClose");
	public WebElement getRequisition_close_buttonLink() {
		return getElement(Requisition_close_button);
		
	}
	private By imagingWorklist_ReqNO=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a");
	public WebElement getimagingWorklist_ReqNO() {
		return getElement(imagingWorklist_ReqNO);
		
	}
	/*end laboratory*/
	
	
	
	public String getAdmissionNO() {
		String AdmissionNo=getpatientAdmission_AdmissionNoTextBox().getAttribute("value");
		System.out.println(AdmissionNo);
		return AdmissionNo;
	}
	
	
	
	private By imageWorkListReqDetailPAcheckBox=By.xpath("/html/body/form/div[3]/div/div[2]/div/table/tbody/tr[2]/td[7]/input");
	                                                      
	public WebElement getimageWorkListReqDetailPAcheckBox() {
		return getElement(imageWorkListReqDetailPAcheckBox);
	}
	private By imageWorkListReqDetailTPcheckBox=By.xpath("/html/body/form/div[3]/div/div[2]/div/table/tbody/tr[2]/td[8]/input");
	public WebElement getimageWorkListReqDetailTPcheckBox() {
		return getElement(imageWorkListReqDetailTPcheckBox);
	}
	private By imageWorkListReqDetailTPINFOMESSAGE=By.id("MyMessageBoxInfo_ButtonOK");
	public WebElement getimageWorkListReqDetailTPINFOMESSAGE() {
		return getElement(imageWorkListReqDetailTPINFOMESSAGE);
	}
	private By imageWorkListReqDetailSaveButton=By.id("btnSave");
	public WebElement getimageWorkListReqDetailSaveButton() {
		return getElement(imageWorkListReqDetailSaveButton);
	}
	private By imageWorkListReqDetailTPInformationyesButton=By.id("MyMessageBoxInfo_ButtonYes");
	public WebElement getimageWorkListReqDetailTPInformationyesButton() {
		return getElement(imageWorkListReqDetailTPInformationyesButton);
	}
	private By imageWorkListReqDetailTP_NOFU_ITEMddl=By.id("ddlItems");
	public WebElement getimageWorkListReqDetailTP_NOFU_ITEMddl() {
		return getElement(imageWorkListReqDetailTP_NOFU_ITEMddl);
	}
	private By imageWorkListReqDetailTP_NOFU_BATCHddl=By.id("ddlBatches");
	public WebElement getimageWorkListReqDetailTP_NOFU_BATCHddl() {
		return getElement(imageWorkListReqDetailTP_NOFU_BATCHddl);
	}
	private By imageWorkListReqDetailTP_NOFU_Quantity=By.id("txtXRayQty");
	public WebElement getimageWorkListReqDetailTP_NOFU_Quantity() {
		return getElement(imageWorkListReqDetailTP_NOFU_Quantity);
	}
	private By imageWorkListReqDetailTP_NOFU_ButtonADD=By.id("btnAdd");
	public WebElement getimageWorkListReqDetailTP_NOFU_ButtonADD() {
		return getElement(imageWorkListReqDetailTP_NOFU_ButtonADD);
	}
	private By imageWorkListReqDetailTP_NOFU_ButtonOK=By.id("btnTPOK");
	public WebElement getimageWorkListReqDetailTP_NOFU_ButtonOK() {
		return getElement(imageWorkListReqDetailTP_NOFU_ButtonOK);
	}
	private By imgReportEntry = By.id("gdvTOItems_ctl02_imgReportEntry");
	public WebElement getimgReportEntry() {
		return getElement(imgReportEntry);
	}
	private By laboratory_Requisition_Details_savebutton=By.id("btnSave");
	public WebElement getlaboratory_Requisition_Details_savebuttonLink() {
		return getElement(laboratory_Requisition_Details_savebutton);
	}
	private By txtResultentry = By.xpath("/html/body");
	public WebElement gettxtResultentry() {
		return getElement(txtResultentry);
	}
	private By chkDoctor = By.id("gdvSearchResult_ctl02_chkDoctor");
	public WebElement getchkDoctor() {
		return getElement(chkDoctor);
	}
	private By chkVerify = By.id("chkVerify");
	public WebElement getchkVerify() {
		return getElement(chkVerify);
	}
	private By btnUpdate = By.id("btnUpdate");
	public WebElement getbtnUpdate() {
		return getElement(btnUpdate);
	}
	private By btnSave = By.id("btnSave"); // btnUpdate
	public WebElement getbtnSave() {
		return getElement(btnSave);
	}
	private By ButtonOKpopup = By.id("popup_ok");
	public WebElement getButtonOKpopup() {
		return getElement(ButtonOKpopup);
	}
	
	private By ClinicalSummary=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table[2]/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]/a[2]/img");
	private By ClinicalSummaryEditBtn=By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/img[1]");
	private By DoneBtn=By.id("btnDone");
	private By Dignose=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table[2]/tbody/tr/td[1]/div/table/tbody/tr/td/div[8]/a[2]/img");
private By RequestTypeDDL=By.id("ctl00_cphpage_hypDischargeintimation");
public WebElement getRequestTypeDDL() {
	return getElement(RequestTypeDDL);
}
	public WebElement getDignose() {
		return getElement(Dignose);
	}
	public WebElement getClinicalSummary() {
		return getElement(ClinicalSummary);
	}
	
	public WebElement getClinicalSummaryEditBtn() {
		return getElement(ClinicalSummaryEditBtn);
	}
	
	public WebElement getDoneBtn() {
		return getElement(DoneBtn);
	}
	private By BlackOverLay = By.xpath("/html/body/div[2]/div[1]/img");
//	/html/body/div[1]/form/div[4]/div[2]/div[1]/div[5]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]/img
	            
	public WebElement getBlackOverLay() {
		return getElement(BlackOverLay);
	}
}
		
	
	
	
	
    
		
	
	
	

