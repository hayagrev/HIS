package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class InpatientManagement_progressnotespages extends BasePage {
  
	util utilobj=new util();
    WebDriver driver;
	
	public InpatientManagement_progressnotespages(WebDriver driver){
		
		super(driver);
		
	}
 	private By Admissionnosearchicon=By.id("ctl00_cphpage_imgsearchadmissionno");
 	public WebElement getAdmissionnosearchicon() {
 		return getElement(Admissionnosearchicon);
 	}
 	private By Dropdown1=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria");
 	public WebElement getDropdown1() {
 		return getElement(Dropdown1);
 	}
 	private By Admissionnotxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
 	public WebElement getAdmissionnotxtbox() {
 		return getElement(Admissionnotxtbox);
 	}
 	private By Search=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
 	public WebElement getSearch() {
 		return getElement(Search);
 	}
 	private By Radiobutton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
 	public WebElement getRadiobutton() {
 		return getElement(Radiobutton);
 	}
 	private By Select=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
 	public WebElement getSelect() {
 		return getElement(Select);
 	}
 	private By NotesBy=By.xpath("//select[@id='ctl00_cphpage_ddlNotesType']");
 	public WebElement getNotesBy() {
 		return getElement(NotesBy);
 	}
 	private By ObservationBySearchicon=By.id("ctl00_cphpage_ImageButton1");
 	public WebElement getObservationBySearchicon() {
 		return getElement(ObservationBySearchicon);
 	}
 	private By Doctornametxtbox=By.id("ctl00_cphpage_txtObservationBy");
 	public WebElement getDoctornametxtbox() {
 		return getElement(Doctornametxtbox);
 	}
 	private By Searchbtn=By.id("btnSearch");
 	public WebElement getSearchbtn() {
 		return getElement(Searchbtn);
 	}
 	private By Radiobtn=By.id("ChkSelect0");
 	public WebElement getRadiobtn() {
 		return getElement(Radiobtn);
 	}
 	private By Selectbtn=By.id("btnSelect");
 	public WebElement getSelectbtn() {
 		return getElement(Selectbtn);
 	}
 	private By Remarks=By.xpath("//textarea[@id='ctl00_cphpage_txtRemarks']");
 	public WebElement getRemarks() {
 		return getElement(Remarks);
 	}
 	private By Save=By.id("ctl00_cphpage_btnSave");
 	public WebElement getSave() {
 		return getElement(Save);
 	}
 	private By Form=By.id("form1");
 	public WebElement getForm() {
 		return getElement(Form);
 	}
 	private By BedDll=By.id("ctl00_cphpage_ddlBedName");
 	public WebElement getBedDll() {
 		return getElement(BedDll);
 	}
 	private By BedDllvalue=By.xpath("//html/body//div[1]//form//div[4]//div[2]//div[1]//div//div[1]//table//tbody//tr[1]//td[4]//select//option[@value='44602']");
 	public WebElement getBedDllvalue() {
 		return getElement(BedDllvalue);
 	}
 	private By ObserveByTextBox=By.id("txtName");
 	public WebElement getObserveByTextBox() {
 		return getElement(ObserveByTextBox);
 	}
 	private By ObserveBySearchButton=By.id("btnSearch");
 	public WebElement getObserveBySearchButton() {
 		return getElement(ObserveBySearchButton);
 	}
 	private By ObserveByRadioButton=By.id("ChkSelect0");
 	public WebElement getObserveByRadioButton() {
 		return getElement(ObserveByRadioButton);
 	}
 	private By ObserveBySelectButton=By.id("btnSelect");
 	public WebElement getObserveBySelectButton() {
 		return getElement(ObserveBySelectButton);
 	}
	
 	private By updateprocess = By.xpath("//*[@id='ctl00_PageUpdateProgress']");
	public WebElement getupdateprocess() {
		return getElement(updateprocess);
	}
	private By SuccessokButton = By.id("popup_ok");
	public WebElement getSuccessokButton() {
		return getElement(SuccessokButton);
	}
	private By ViewButton = By.id("ctl00_cphpage_btnView");
	public WebElement getViewButton() {
		return getElement(ViewButton);
	}
	private By BackButton = By.id("ctl00_cphpage_btnBack");
	public WebElement getBackButton() {
		return getElement(BackButton);
	}
	private By Recordno = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div/div[1]/div[1]/div/table/tbody/tr[2]/td[1]");
	public WebElement getRecordno() {
		return getElement(Recordno);
	}
	private By Updatebutton = By.id("ctl00_cphpage_btnSave");
	public WebElement getUpdatebutton() {
		return getElement(Updatebutton);
	}
	
	
	
}
	


