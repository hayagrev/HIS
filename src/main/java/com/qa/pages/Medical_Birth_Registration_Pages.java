package com.qa.pages;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.qa.util.util;

public class Medical_Birth_Registration_Pages extends BasePage {

	public Medical_Birth_Registration_Pages(WebDriver driver) {
		super(driver);
	}
	util utilobj = new util();
	private By Birth_register_MotherDetail_Admission=By.id("ctl00_cphpage_imgbtnadmissionno");
	public WebElement getBirth_register_MotherDetail_Admission() {
		return getElement(Birth_register_MotherDetail_Admission);
	}
	private By Birth_register_MotherDetail_Admission_searchTextxbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getBirth_register_MotherDetail_Admission_searchTextxbox() {
		return getElement(Birth_register_MotherDetail_Admission_searchTextxbox);
	}
	private By Birth_register_MotherDetail_Admission_searchButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	public WebElement getBirth_register_MotherDetail_Admission_searchButton() {
		return getElement(Birth_register_MotherDetail_Admission_searchButton);
	}
	private By Birth_register_MotherDetail_Admission_radioButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getBirth_register_MotherDetail_Admission_radioButton() {
		return getElement(Birth_register_MotherDetail_Admission_radioButton);
	}
	private By Birth_register_MotherDetail_Admission_selectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getBirth_register_MotherDetail_Admission_selectButton() {
		return getElement(Birth_register_MotherDetail_Admission_selectButton);
	}		
private By Birth_registr_BabyDetail_Weigth=By.id("ctl00_cphpage_txtWeightkg");
public WebElement getBirth_registr_BabyDetail_Weigth() {
	return getElement(Birth_registr_BabyDetail_Weigth);
}
private By Birth_registr_BabyDetail_WeigthGm=By.id("ctl00_cphpage_txtWeightgm");
public WebElement getBirth_registr_BabyDetail_WeigthGm() {
	return getElement(Birth_registr_BabyDetail_WeigthGm);
}
private By Birth_registr_HPD_DCB=By.id("ctl00_cphpage_ddlDeliveryby1");
public WebElement getBirth_registr_HPD_DCB() {
	return getElement(Birth_registr_HPD_DCB);
}
private By Birth_register_HPD_Place_of_birth=By.id("ctl00_cphpage_txtPlaceofBirth");
public WebElement getBirth_register_HPD_Place_of_birth() {
	return getElement(Birth_register_HPD_Place_of_birth);
}
private By Birth_register_methodofDelivery=By.id("ctl00_cphpage_ddlMethodofDel");
public WebElement getBirth_register_methodofDelivery() {
	return getElement(Birth_register_methodofDelivery);
}
private By Birth_register_birthsequence=By.id("ctl00_cphpage_txtBirthseq");
public WebElement getBirth_register_birthsequence() {
	return getElement(Birth_register_birthsequence);
}
private By Birth_register_buttinPrint=By.id("ctl00_cphpage_btnPrint");
public WebElement getBirth_register_buttinPrint() {
	return getElement(Birth_register_buttinPrint);
}
private By Birth_register_medicalofficername=By.id("ctl00_cphpage_txtName1");
public WebElement getBirth_register_medicalofficername() {
	return getElement(Birth_register_medicalofficername);
}
private By Birth_register_buttonSave=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[5]/div/input[1]");

public WebElement getBirth_register_buttonSave() {
	return getElement(Birth_register_buttonSave);
}
private By Birth_register_buttonClear=By.id("ctl00_cphpage_btn_Clear");
public WebElement getBirth_register_buttonClear() {
	return getElement(Birth_register_buttonClear);
}
private By Birth_register_msgokButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
public WebElement getBirth_register_msgokButton() {
	return getElement(Birth_register_msgokButton);
}
private By changeLocation = By.id("ctl00_lnkbtnChangeHospital");
private By SelectHospitalLocationDDL = By.id("ctl00_cphpage_ddlHospital");
private By SelectFacilityLocationDDL = By.id("ctl00_cphpage_ddlFacility");
private By SelectFacilityLocationSubmitButton = By.id("ctl00_cphpage_btnSubmit");


private By Registration=By.linkText("Registration");
private By patientAdmission=By.linkText("Patient Admission");
private By ClinicalRecordLink=By.linkText("Clinical Records");
private By Inpatients_EmergencyPatientsLink=By.linkText("Inpatients/Emergency Patients");

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
//private By ddlAdmissionType =By.id("ctl00_cphpage_ddlAdmissionType");
//private By ddlAdmissionSrc =By.id("ctl00_cphpage_ddlAdmissionSrc");
private By ddlSpeciallization =By.id("ctl00_cphpage_ddlSpecialisation");
private By ddlunit =By.id("ctl00_cphpage_ddlUnit");
private By ddlwardType =By.id("ctl00_cphpage_ddlWardType");
private By patientAdmission_permanantsameaspresent =By.id("ctl00_cphpage_PermanentSameAsPresent");
private By patientAdmission_SaveButton =By.id("ctl00_cphpage_btnSave");
private By patientAdmission_informationOKButton =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
private By patientAdmission_succesokbutton =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
private By patientAdmission_AdmissionNoTextBox =By.id("ctl00_cphpage_txtAdmissionNo");
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
private By inpatientManagement=By.linkText("InPatient Management");
private By IPMDischargeIntemation=By.linkText("Discharge Intimations");
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
//public WebElement getddlUnit() {
//	return getElement(ddlunit);
//}
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
//public WebElement getDdlAdmissionType() {
//	return getElement(ddlAdmissionType);
//}

//public WebElement getDdlAdmissionSrc() {
//	return getElement(ddlAdmissionSrc);
//}
public WebElement getpatientAdmission_SaveButton() {
	return getElement(patientAdmission_SaveButton);
}
public WebElement getpatientAdmission_informationOKButton() {
	return getElement(patientAdmission_informationOKButton);
}
public WebElement getpatientAdmission_succesokbutton() {
	return getElement(patientAdmission_succesokbutton);
}
public WebElement getregistrationLink() {
	return getElement(Registration);
}
public WebElement getpatientAdmission() {
	return getElement(patientAdmission);
}
public WebElement getUHID_TextBox() {
	return getElement(UHID_TextBox);
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
public WebElement getINpatientmanagementUpdateStatus_changetostatusddl() {
	return getElement(INpatientmanagementUpdateStatus_changetostatusddl);
}
public WebElement getINpatientmanagementUpdateStatus_saveButton() {
	return getElement(INpatientmanagementUpdateStatus_saveButton);
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
	}
public WebElement getinpatientManagementLink() {
	
	return getElement(inpatientManagement);
}
public WebElement getIPMDischargeintimationLink() {
	
	return getElement(IPMDischargeIntemation);
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
//	return  getElements(ddlUnit);
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
private By ProcessImage1=By.xpath("/html/body/form/div[3]/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[1]/img");
public WebElement getProcessImage1() {
	return getElement(ProcessImage1);
}

public void testcaseforUHID(String Title, String FirstName, String LastName, String MaritalStatus1, String Age,String Address,String Browser) throws InterruptedException {
	Random F=new Random();
	int Num=F.nextInt(1000);
	System.out.println("Random ="+Num);
	String name=Integer.toString(Num);
	Thread.sleep(2000);
	Random L=new Random();
	int Num1=L.nextInt(1000);
	System.out.println("Random ="+Num1);
	String Lname=Integer.toString(Num1);
	Thread.sleep(2000);
	utilobj.selectDropdown(getTitle(), driver, "Mrs.",Browser);
	Thread.sleep(3000);
	getFirstName().sendKeys(FirstName+name);
	Thread.sleep(3000);
	getLastName().sendKeys(LastName+Lname);
	
	driver.findElement(By.id("ctl00_cphpage_ddlGender")).sendKeys("Female");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	//System.out.println(MaritalStatus1 + getMarriageStatus());
	Thread.sleep(3000);
	utilobj.selectDropdown(getMarriageStatus(), driver, "Married",Browser);
	Thread.sleep(3000);
	getAge().sendKeys(Age);
	Thread.sleep(3000);
	getPresentAddres().sendKeys(Address);
	Thread.sleep(3000);
	utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDState")), driver, "Maharashtra",Browser);
	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/img")));
	Thread.sleep(4000);
	utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDDistrict")), driver, "Mumbai",Browser);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/img")));
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_txtPincode")).sendKeys("230532");
	

	getSavebutton().click();
	Thread.sleep(3000);
	getbtnYes().click();
	Thread.sleep(3000);
	
	utilobj.ActionClick(driver.findElement(By.id("ctl00_cphpage_btnOK11")), driver);
	Thread.sleep(3000);
	}
public String testcasegetUhid() throws InterruptedException {
	String typeValue=getUHID_TextBox().getAttribute("value");
	Thread.sleep(3000);
	System.out.println(typeValue);
	
	Thread.sleep(1000);
	return typeValue;
}
public void getchangeLocation() throws InterruptedException {
	Thread.sleep(1000);
	getchange_facility_location_linkLink().click();
	Thread.sleep(1000);
}
//public void againloginForChild() throws InterruptedException {
//	driver.navigate().to("http://10.30.26.86/hospital/login.aspx");
//	Thread.sleep(1000);
//	utilobj.selectDropdown(driver.findElement(By.id("txtUsername")), driver,"applone" );
//	Thread.sleep(1000);
//	utilobj.selectDropdown(driver.findElement(By.id("txtpassword")), driver, "his@1234");
//	Thread.sleep(1000);
//	utilobj.JSClick(driver.findElement(By.id("btnLogin")), driver);
//	Thread.sleep(1000);
//}
public void testcaseforPatientAdmission(String s,String Browser) throws InterruptedException {
	Thread.sleep(3000);
	utilobj.MoveElement(getregistrationLink(), driver);
	Thread.sleep(3000);
	utilobj.JSClick(getpatientAdmission(), driver);
	Thread.sleep(3000);
	//search by uhid
	getpatientAdmission_UHIDImgSearch().click();
	Thread.sleep(3000);
	getpatientAdmission_UHIDSearchPOPTXTBOX().sendKeys(s);
	Thread.sleep(3000);
	getpatientAdmission_UHIDSearchButtonSearch().click();
	Thread.sleep(3000);
	getpatientAdmission_UHIDRadioButtonBox().click();
	Thread.sleep(3000);
	getpatientAdmission_UHIDSearchBTNSelect().click();
	Thread.sleep(4000);
	getpatientAdmission_permanantsameaspresent().click();
	Thread.sleep(3000);
	utilobj.selectDropdown(getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
	Thread.sleep(3000);
	utilobj.selectDropdown(getDdlAdmissionSrc(), driver, "Transferred from a private hospital",Browser);
	Thread.sleep(3000);
	utilobj.selectDropdown(getddlSpeciallization(), driver, "General Medicine",Browser);
	Thread.sleep(4000);
	utilobj.selectDropdown(getddlUnit(), driver, "Medicine",Browser);
	Thread.sleep(4000);
	utilobj.selectDropdown(getddlwardType(), driver, "Female medical ward",Browser);
	Thread.sleep(4000);
	getpatientAdmission_SaveButton().click();
	Thread.sleep(3000);
	getpatientAdmission_informationOKButton().click();
	Thread.sleep(3000);
	
	getpatientAdmission_succesokbutton().click();
	
	Thread.sleep(3000);
	
	
}
public String getAdmissionNO() throws InterruptedException {
	String AdmissionNo=getpatientAdmission_AdmissionNoTextBox().getAttribute("value");
	System.out.println(AdmissionNo);
	Thread.sleep(3000);
	return AdmissionNo;
	
}
public void testcaseforUHIDForChild(String Title, String FirstName, String LastName, String MaritalStatus1, String Age,
		String Address,String Browser) throws InterruptedException {
	Thread.sleep(3000);
	Random F=new Random();
	int Num=F.nextInt(2000);
	System.out.println("Random ="+Num);
	String name=Integer.toString(Num);
	Thread.sleep(2000);
	Random L=new Random();
	int Num1=L.nextInt(1000);
	System.out.println("Random ="+Num1);
	String Lname=Integer.toString(Num1);
	Thread.sleep(2000);
	utilobj.selectDropdown(getTitle(), driver, "Baby",Browser);
	Thread.sleep(3000);
	getFirstName().sendKeys(FirstName+name);
	Thread.sleep(3000);
	getLastName().sendKeys(LastName+Lname);
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	
	//System.out.println(MaritalStatus1 + getMarriageStatus());
	Thread.sleep(3000);
	utilobj.selectDropdown(getMarriageStatus(), driver, "Single",Browser);
	Thread.sleep(3000);
	getAge().sendKeys("30");
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_ddlAgeUnit")).sendKeys("Minutes");
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_ddlGender")).sendKeys("Femail");
	Thread.sleep(3000);
	getPresentAddres().sendKeys(Address);
	Thread.sleep(3000);
	utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDState")), driver, "Maharashtra",Browser);
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/img")));
	Thread.sleep(4000);
	utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDDistrict")), driver, "Mumbai",Browser);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/img")));
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_txtPincode")).sendKeys("230532");
	
	Thread.sleep(2000);
	getSavebutton().click();
	//Thread.sleep(3000);
	//MBRP.getbtnYes().click();
	Thread.sleep(1000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/img")));
	Thread.sleep(1000);
	utilobj.ActionClick(driver.findElement(By.id("ctl00_cphpage_btnOK11")), driver);
	Thread.sleep(3000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_btnOK11")));

	}
public WebElement getchange_facility_location_linkLink() {
	return getElement(changeLocation);

}
public WebElement getSelectHospitalLocationDDL() {
	return getElement(SelectHospitalLocationDDL);
}
public WebElement getSelectFacilityLocationDDL() {
	return getElement(SelectFacilityLocationDDL);
}
public WebElement getSelectFacilityLocationSubmitButton() {
	return getElement(SelectFacilityLocationSubmitButton);
}

public void testcaseforINPAtientMangement(String Browser) throws InterruptedException {
	Thread.sleep(3000);
	utilobj.JSClick(getchange_facility_location_linkLink(), driver);
	//getchange_facility_location_linkLink().click();
	Thread.sleep(3000);
	utilobj.selectDropdown(getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL",Browser);
	Thread.sleep(3000);
	utilobj.selectDropdown(getSelectFacilityLocationDDL(), driver, "Female medical ward",Browser);
	Thread.sleep(3000);
	utilobj.JSClick(getSelectFacilityLocationSubmitButton(), driver);
	Thread.sleep(3000);
	utilobj.MoveElement(getINpatientmanagementLink(), driver);
	Thread.sleep(3000);
	utilobj.JSClick(getINpatientmanagementAllotBedLink(), driver);
	Thread.sleep(3000);
	
	getINpatientmanagementAllotbedadmissionNO().click();
	Thread.sleep(5000);

	utilobj.selectDropdown(getINpatientmanagementAllotbed_bedName(), driver, "Fbed3",Browser);
	 Thread.sleep(3000);

		 getINpatientmanagementAllotbed_saveButton().click();
		 Thread.sleep(3000);
		 getINpatientmanagementAllotbed_Succusokbutton().click();
		 Thread.sleep(3000);
		 boolean popupdisplay=driver.findElement(By.id("popup_ok")).isDisplayed();
			if(popupdisplay==true)
			{
				driver.findElement(By.id("popup_ok")).click();
				System.out.println("popok button is there");
			}
		// driver.findElement(By.id("popup_ok")).click();
		 Thread.sleep(3000);
		 utilobj.MoveElement(getINpatientmanagementLink(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(getINpatientmanagementUpdateStatus(), driver);
			Thread.sleep(3000);
			utilobj.selectDropdown(getINpatientmanagementUpdateStatus_bednametxtDDL(), driver, "Fbed3",Browser);

			
  			Thread.sleep(3000);
			utilobj.selectDropdown(getINpatientmanagementUpdateStatus_changetostatusddl(), driver, "Occupied",Browser);
			Thread.sleep(3000);
			getINpatientmanagementUpdateStatus_saveButton().click();
			Thread.sleep(3000);
			utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
			
			Thread.sleep(3000);
}
		public void testcaseforpatientDescharge(String Addmission,String Browser) throws InterruptedException {
			utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")), driver);
			utilobj.JSClick(driver.findElement(By.linkText("Discharge Intimation")), driver);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_ImgBtnAdmin")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("AdmissionNumber")).sendKeys(Addmission);
			Thread.sleep(3000);
			driver.findElement(By.id("btnSearch")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("radio")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnSearchSelect")).click();
			Thread.sleep(3000);
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlRequestType")), driver, "Death",Browser);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_txtRemarks")).sendKeys("Death Test");
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
			Thread.sleep(3000);		
					
			utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
			Thread.sleep(3000);
			utilobj.MoveElement(getinpatientManagementLink(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(getIPMDischargeintimationLink(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/div/table/tbody/tr[2]/td[1]/span")), driver);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
			Thread.sleep(3000);
			utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
			Thread.sleep(3000);
			utilobj.JSClick(getchange_facility_location_linkLink(), driver);
}



public void testCaseForBirthRegistration(String Admission,String UHID,String Browser) throws InterruptedException {
	Thread.sleep(1000);

	Thread.sleep(2000);
	utilobj.selectDropdown(getBirth_register_methodofDelivery(), driver, "Normal",Browser);
	Thread.sleep(2000);
	getBirth_register_HPD_Place_of_birth().sendKeys("TEST ESIC Hospital");
	Thread.sleep(2000);
	utilobj.selectDropdown(getBirth_registr_HPD_DCB(), driver, "Medical Officer",Browser);
	Thread.sleep(2000);
	getBirth_registr_BabyDetail_Weigth().sendKeys("2");
	Thread.sleep(2000);
	getBirth_registr_BabyDetail_WeigthGm().sendKeys("600");	
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission().click();
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_searchTextxbox().sendKeys(Admission);
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_searchButton().click();
	Thread.sleep(2000);
	getBirth_register_MotherDetail_Admission_radioButton().click();
	Thread.sleep(2000);
	utilobj.JSClick(getBirth_register_MotherDetail_Admission_selectButton(),driver);
	//getBirth_register_MotherDetail_Admission_selectButton().click();
	Thread.sleep(20000);
	getBirth_register_birthsequence().clear();
	Thread.sleep(2000);
	getBirth_register_birthsequence().sendKeys("1");
	Thread.sleep(2000);
	getBirth_register_medicalofficername().sendKeys("Dr Test.");
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_imgbtnbabyUHID")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys(UHID);
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
	Thread.sleep(2000);
//	getBirth_register_buttonClear().click();//check the functionality of clear button
//	Thread.sleep(2000);
//	Thread.sleep(2000);
//	utilobj.selectDropdown(getBirth_register_methodofDelivery(), driver, "Normal");
//	Thread.sleep(2000);
//	getBirth_register_HPD_Place_of_birth().sendKeys("TEST ESIC Hospital");
//	Thread.sleep(2000);
//	utilobj.selectDropdown(getBirth_registr_HPD_DCB(), driver, "Medical Officer");
//	Thread.sleep(2000);
//	getBirth_registr_BabyDetail_Weigth().sendKeys("2");
//	Thread.sleep(2000);
//	getBirth_registr_BabyDetail_WeigthGm().sendKeys("600");	
//	Thread.sleep(2000);
//	getBirth_register_MotherDetail_Admission().click();
//	Thread.sleep(2000);
//	getBirth_register_MotherDetail_Admission_searchTextxbox().sendKeys("IP061900013");
//	Thread.sleep(2000);
//	getBirth_register_MotherDetail_Admission_searchButton().click();
//	Thread.sleep(2000);
//	getBirth_register_MotherDetail_Admission_radioButton().click();
//	Thread.sleep(2000);
//	getBirth_register_MotherDetail_Admission_selectButton().click();
//	Thread.sleep(2000);
//	getBirth_register_birthsequence().clear();
//	Thread.sleep(2000);
//	getBirth_register_birthsequence().sendKeys("1");
//	Thread.sleep(2000);
//	
//	getBirth_register_medicalofficername().sendKeys("Dr Test.");
//	Thread.sleep(2000);
////	
//	//getBirth_register_buttonSave().click();DUMM.0000000520
//	Thread.sleep(20000);
//	getBirth_register_msgokButton().click();
	//Thread.sleep(20000);
//	getBirth_register_buttinPrint().click();
//	Thread.sleep(20000);
//	utilobj.SwitchToChildWindow(driver, "  ");
//	Thread.sleep(2000);
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	driver.close();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver, "Dhanwantri");
	Thread.sleep(2000);
	utilobj.JSClick(getBirth_register_buttonSave(), driver);
	Thread.sleep(2000);
	getBirth_register_msgokButton().click();
	
}

}
