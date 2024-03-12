package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CasesheetPages extends BasePage {

	public CasesheetPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
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
	private By AdviceLink = By.id("ctl00_cphpage_trvSectionst13");
	public WebElement getAdviceLink() {
		return getElement(AdviceLink);

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
	
	
}
