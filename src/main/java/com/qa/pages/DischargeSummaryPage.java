package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class DischargeSummaryPage extends BasePage {
	
	util utilobj = new util();

	public DischargeSummaryPage(WebDriver driver) {
		super(driver);
	}

	private By AdmissionSearchBtn = By.id("ctl00_cphpage_imgAdmNo");
	
	
    private By AdmissionSearchNo = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	
	private By SearchBtn = By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	
	private By ChkBox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");

	private By SelectBtn=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	
	private By ClinicalSummary=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table[2]/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]/a[2]/img");
	                                     
	private By ClinicalSummaryEditBtn=By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/img[1]");
	
	private By SaveBtn=By.id("ctl00_cphpage_btnSave");
	
	private By OkPopup=By.id("popup_ok");
	private By popupMessageText=By.id("popup_message");
	
	private By DoneBtn=By.id("btnDone");
	private By printBtn=By.id("ctl00_cphpage_btnPrint");
	private By templateScreenBtnDDL=By.id("dpScreenSelect");
	private By templateScreenOK=By.id("btnSelectOK");
	
	
	public WebElement gettemplateScreenBtnDDl() {
		return getElement(templateScreenBtnDDL);
	}
	public WebElement getAdmissionSearchBtn() {
		return getElement(AdmissionSearchBtn);
	}
	public WebElement getprintBtn() {
		return getElement(printBtn);
	}
	
	public WebElement getAdmissionSearchTextBox() {
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
	

	public WebElement getClinicalSummary() {
		return getElement(ClinicalSummary);
	}
	
	public WebElement getClinicalSummaryEditBtn() {
		return getElement(ClinicalSummaryEditBtn);
	}
	
	public WebElement getDoneBtn() {
		return getElement(DoneBtn);
	}
	
	public WebElement getSaveBtn() {
		return getElement(SaveBtn);
	}
	
	public WebElement getOkPopup() {
		return getElement(OkPopup);
	}
	public WebElement gettemplateScreenOK() {
		return getElement(templateScreenOK);
	}
	public WebElement getpopupMessageText() {
		return getElement(popupMessageText);
	}
	private By ChangeLocationLink=By.id("ctl00_lnkbtnChangeHospital");
	public WebElement getChangeLocationLink() {
		return getElement(ChangeLocationLink);
	}
	private By StoresLink=By.linkText("Stores");
	public WebElement getStoresLink() {
		return getElement(StoresLink);
	}
	private By PharmacyIssueLink=By.xpath("/html/body/div[1]/form/div[3]/div[2]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div/ul[4]/li[10]/a");
	public WebElement getPharmacyIssueLink() {
		return getElement(PharmacyIssueLink);
	}
	
	private By IPNumberTextbox=By.id("ctl00_cphpage_txtIPNO");
	public WebElement getIPNumberTextbox() {
		return getElement(IPNumberTextbox);
	}
	private By Linktext=By.id("ctl00_cphpage_lnkbtnIPNo");
	public WebElement getLinktext() {
		return getElement(Linktext);
	}
	private By UhidCheckBox=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	public WebElement getUhidCheckBox() {
		return getElement(UhidCheckBox);
	}
	private By SelectButton=By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	public WebElement getSelectButton() {
		return getElement(SelectButton);
	}
	private By PrescriptionDDL=By.id("ctl00_cphpage_ddlPrescription");
	public WebElement getPrescriptionDDL() {
		return getElement(PrescriptionDDL);
	}
	private By ViewButton=By.id("ctl00_cphpage_btnPrescriptionView");
	public WebElement getViewButton() {
		return getElement(ViewButton);
	}
	private By CloseButton=By.id("ctl00_cphpage_btnIssueDetails");
	public WebElement getCloseButton() {
		return getElement(CloseButton);
	}
	
	private By BlackOverlay=By.xpath("/html/body/div[2]/div[1]/img");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	private By frame=By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/iframe[1]");
	public WebElement getframe() {
		return getElement(frame);
	}
	private By frameBody=By.xpath("/html/body/br");
	public WebElement getframeBody() {
		return getElement(frameBody);
	}
	
	}
