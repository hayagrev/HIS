package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrevantingHealthCheckUpPage extends BasePage {

	public PrevantingHealthCheckUpPage(WebDriver driver) {
		super(driver);
		
	}
	private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");
	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");

	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	private By hisLiveListControlchkUHID2 = By.id("ctl00_cphpage_hisLiveListControl_Grdhrms_ctl02_chkHRMSUHID");
	
	
	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	     

	// Checkin page 
	private By change_facility_location_link=By.id("ctl00_lnkbtnChangeHospital");
	private By information_popup_ok=By.id("popup_ok");
	
	private By btnOK = By.id("ctl00_cphpage_btnOK");
	private By servicedeletebutton = By.id("ctl00_cphpage_gdvservices_ctl02_btnServiceDelete");
	private By btnSaveDisplay = By.id("ctl00_cphpage_btnSaveDisplay");
	

	private By btncancel = By.id("popup_cancel");
	
	private By popupmessage = By.id("popup_message");

	private By ddlSpecialisation = By.id("ctl00_cphpage_ddlSpecialisation");
    private By popokbutton=By.id("popup_cancel");
    private By btnclear=By.id("ctl00_cphpage_btnClear");
    private By refferls  =By.id("ctl00_cphpage_lnkReferral");
    private By UhidSearchImg  =By.id("ctl00_cphpage_imgsearchuhid");
    private By UhidLiveListTextBox  =By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
    private By UhidLiveListSearchButton  =By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch");
    private By UhidLiveListRadioButton  =By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
    private By depandentRadiobutton =By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl04_chkUHID");
    private By UhidLiveListSelect  =By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
    private By WarningOkButton  =By.id("popup_ok");
    private By WarningMessageText  =By.id("popup_message");
    private By ESICPensionerRadioButton  =By.id("ctl00_cphpage_rbl_2");
    private By ESICEmployeeRadioButton  =By.id("ctl00_cphpage_rbl_1");
    private By IPNumberRadioButton  =By.id("ctl00_cphpage_rbl_0");
    private By progressImage  =By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div/div[8]/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/div[1]/div[3]/div[1]/img");
    private By ClinicalRecord=By.linkText("Clinical Records");
    private By DoctorWorkList=By.linkText("Doctor Worklist");
    private By CheckInNumberTextBox=By.id("ctl00_cphpage_txtCheckinno");
    private By CheckInNumberImageSearch=By.id("ctl00_cphpage_imgCheckinno");
    private By OpencasesheetButton=By.id("ctl00_cphpage_btnCOpenCaseSheet");
    private By InformationmessageOkButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
    private By TemplateDll=By.id("ctl00_cphpage_ddlTemplates");
    public WebElement getTemplateDll() {
    	return getElement(TemplateDll);
    }
    public WebElement getInformationmessageOkButton() {
    	return getElement(InformationmessageOkButton);
    }
    public WebElement getservicedeletebutton() {
    	return getElement(servicedeletebutton);
    }
    public WebElement getOpencasesheetButton() {
    	return getElement(OpencasesheetButton);
    }
    public WebElement getCheckInNumberImageSearch() {
    	return getElement(CheckInNumberImageSearch);
    }
    public WebElement getCheckInNumberTextBox() {
    	return getElement(CheckInNumberTextBox);
    }
    public WebElement getClinicalRecord() {
    	return getElement(ClinicalRecord);
    }
    public WebElement getDoctorWorkList() {
    	return getElement(DoctorWorkList);
    }
    public WebElement getprogressImage() {
    	return getElement(progressImage);
    }
    public WebElement getESICPensionerRadioButton() {
    	return getElement(ESICPensionerRadioButton);
    }
    public WebElement getdepandentRadiobutton() {
    	return getElement(depandentRadiobutton);
    }
    public WebElement getIPNumberRadioButton() {
    	return getElement(IPNumberRadioButton);
    }
    public WebElement getESICEmployeeRadioButton() {
    	return getElement(ESICEmployeeRadioButton);
    }
    public WebElement getWarningOkButton() {
    	return getElement(WarningOkButton);
    }
    public WebElement getWarningMessageText() {
    	return getElement(WarningMessageText);
    }
    
    public WebElement getUhidSearchImg() {
    	return getElement(UhidSearchImg);
    }
    public WebElement getUhidLiveListTextBox() {
    	return getElement(UhidLiveListTextBox);
    }
    public WebElement getUhidLiveListSearchButton() {
    	return getElement(UhidLiveListSearchButton);
    }
    public WebElement getUhidLiveListRadioButton() {
    	return getElement(UhidLiveListRadioButton);
    }
    public WebElement getUhidLiveListSelect() {
    	return getElement(UhidLiveListSelect);
    }
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
	public WebElement getinformation_popup_ok() {
		return getElement(information_popup_ok);
	}

}
