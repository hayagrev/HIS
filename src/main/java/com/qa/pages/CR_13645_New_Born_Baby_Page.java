package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CR_13645_New_Born_Baby_Page extends BasePage {

	public CR_13645_New_Born_Baby_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By MyMessageBoxInfoButtonYes =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	private By MyMessageBoxSuccusButtonYes =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By txtIPNO = By.id("ctl00_cphpage_txtInsuranceNo");
	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	//Patient admission Screen
	private By ddlAdmissionType =By.id("ctl00_cphpage_ddlAdmissionType");

	private By ddlAdmissionSrc =By.id("ctl00_cphpage_ddlAdmissionSrc");

	private By btnSave =By.id("ctl00_cphpage_btnSave");

	private By ddlSpecialisation =By.id("ctl00_cphpage_ddlSpecialisation");


	//Livelist Control

	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");

	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");

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

	public WebElement getDdlAdmissionType() {
		return getElement(ddlAdmissionType);
	}

	public WebElement getDdlAdmissionSrc() {
		return getElement(ddlAdmissionSrc);
	}
	private By ddlUnit =By.id("ctl00_cphpage_ddlUnit");
	public WebElement getddlUnit() {
		return getElement(ddlUnit);
	}

	//public WebElement getDdlUnit() {
//		return  getElements(ddlUnit);
	//}



	public WebElement getddlSpecialisation() {
		return getElement( ddlSpecialisation);}

	public WebElement getBtnSave() {
		return getElement(btnSave);
	}
	private By PermanentSameAsPresentRadiobutton =By.id("ctl00_cphpage_PermanentSameAsPresent");
	public WebElement getPermanentSameAsPresentRadiobutton() {
		return getElement(PermanentSameAsPresentRadiobutton);
	}


	public WebElement getMyMessageBoxInfoButtonYes() {
		return getElement(MyMessageBoxInfoButtonYes);
	}
	public WebElement getMyMessageBoxSuccusButtonYes() {
		return getElement(MyMessageBoxSuccusButtonYes);
	}
	private By Wardtypeddl =By.id("ctl00_cphpage_ddlWardType");
	public WebElement getWardtypeddl() {
		return getElement(Wardtypeddl);
	}
	private By ChangeLocation =By.id("ctl00_lnkbtnChangeHospital");
	public WebElement getChangeLocation() {
		return getElement(ChangeLocation);
	}
	private By AdmissionTextbox =By.id("ctl00_cphpage_txtAdmissionNo");
	public WebElement getAdmissionTextbox() {
		return getElement(AdmissionTextbox);
	}

	private By InPatientManagement=By.linkText("InPatient Management");
	public WebElement getInPatientManagement() {
		return getElement(InPatientManagement);
	}
	private By AllotBed=By.linkText("Allot Bed");
	public WebElement getAllotBed() {
		return getElement(AllotBed);
	}
	private By AllotBed_WarningOKbutton=By.id("popup_ok Bed");
	public WebElement getAllotBed_WarningOKbutton() {
		return getElement(AllotBed_WarningOKbutton);
	}
	private By AllotBed_BedName=By.id("ctl00_cphpage_ddlBedName");
	public WebElement getAllotBed_BedName() {
		return getElement(AllotBed_BedName);//FEMALE BEDK MED 15
	}
	private By AllotBed_SaveButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getAllotBed_SaveButton() {
		return getElement(AllotBed_SaveButton);
	}
	private By AllotBed_SuccessOkButton=By.id("popup_ok");
	public WebElement getAllotBed_SuccessOkButton() {
		return getElement(AllotBed_SuccessOkButton);
	}
	private By Admission_NewBornCheckBox=By.id("ctl00_cphpage_chkNewBorn");
	public WebElement getAdmission_NewBornCheckBox() {
		return getElement(Admission_NewBornCheckBox);
	}
	private By Admission_NewBornImage=By.id("ctl00_cphpage_imgbtnNewBorn");
	public WebElement getAdmission_NewBornImage() {
		return getElement(Admission_NewBornImage);
	}
	private By NewBornSearchImageButton=By.id("imgMothersadmissionNosearch");
	public WebElement getNewBornSearchImageButton() {
		return getElement(NewBornSearchImageButton);
	}
	private By MotherAdmissionNoTextBox=By.id("ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getMotherAdmissionNoTextBox() {
		return getElement(MotherAdmissionNoTextBox);
	}
	private By MotherAdmissionNoSearchButton=By.id("ucCommonSearch_btnSearch");
	public WebElement getMotherAdmissionNoSearchButton() {
		return getElement(MotherAdmissionNoSearchButton);
	}
	private By ProcessImage=By.xpath("/html/body/form/div[3]/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[1]/img");
	public WebElement getProcessImage() {
		return getElement(ProcessImage);
	}
	
	private By MotherAdmissionRadioButton=By.id("ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getMotherAdmissionRadioButton() {
		return getElement(MotherAdmissionRadioButton);
	}
	private By MotherAdmissionSelectButton=By.id("ucCommonSearch_btnSelect");
	public WebElement getMotherAdmissionSelectButton() {
		return getElement(MotherAdmissionSelectButton);
	}
	private By BabyAdmissionOkButton=By.id("btnOk");
	public WebElement getBabyAdmissionOkButton() {
		return getElement(BabyAdmissionOkButton);
	}
	private By MotherAdmissionDateTextBox=By.id("txtAdmissionDate");
	public WebElement getMotherAdmissionDateTextBox() {
		return getElement(MotherAdmissionDateTextBox);
	}
	private By MotherNameTextBox=By.id("txtMotherName");
	public WebElement getMotherNameTextBox() {
		return getElement(MotherNameTextBox);
	}
	private By MotherUHIDNoTextBox=By.id("txtMotherAdmissionNo");
	public WebElement getMotherUHIDNoTextBox() {
		return getElement(MotherUHIDNoTextBox);
	}
	private By MotherIPNumberTextBox=By.id("txtMontherIP");
	public WebElement getMotherIPNumberTextBox() {
		return getElement(MotherIPNumberTextBox);
	}
	private By RadioButtonInsideESICHospital=By.id("rbl_0");
	public WebElement getRadioButtonInsideESICHospital() {
		return getElement(RadioButtonInsideESICHospital);
	}
	private By RadioButtonOutsideESICHospital=By.id("rbl_1");
	public WebElement getRadioButtonOutsideESICHospital() {
		return getElement(RadioButtonOutsideESICHospital);
	}
	private By BabyGenderDDL=By.id("ddlBabyGender");
	public WebElement getBabyGenderDDL() {
		return getElement(BabyGenderDDL);
	}
	private By BabyDOBL=By.id("txtDOB");
	public WebElement getBabyDOBL() {
		return getElement(BabyDOBL);
	}
	
	
}
