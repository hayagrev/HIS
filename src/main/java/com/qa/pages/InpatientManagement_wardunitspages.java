package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InpatientManagement_wardunitspages extends BasePage {
  
	
WebDriver driver;
	
	public InpatientManagement_wardunitspages(WebDriver driver){
		super(driver);	
	}

	
	private By UnitNameicon=By.id("ctl00_cphpage_imgSearchUnit");
	public WebElement getUnitNameicon() {
		return getElement(UnitNameicon);
	}
	private By UnitNametxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getUnitNametxtbox() {
		return getElement(UnitNametxtbox);
	}
	private By Search=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getSearch() {
		return getElement(Search);
	}
	private By Radiobtn=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtn() {
		return getElement(Radiobtn);
	}
	private By Select=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getSelect() {
		return getElement(Select);
	}
	private By Checkbox=By.id("ctl00_cphpage_tabSearch_tabPnlDoctors_chkDoctors_0");
	public WebElement getCheckbox() {
		return getElement(Checkbox);
	}
	private By Modify=By.id("ctl00_cphpage_btnSave");
	public WebElement getModify() {
		return getElement(Modify);
	}
	private By Bed=By.id("__tab_ctl00_cphpage_tabSearch_tabPnlBeds");
	public WebElement getBed() {
		return getElement(Bed);
	}
	private By ddlward=By.id("ctl00_cphpage_tabSearch_tabPnlBeds_ddlWard");
	public WebElement getddlward() {
		return getElement(ddlward);
	}
	private By bedcheckbox=By.id("ctl00_cphpage_tabSearch_tabPnlBeds_gdvBeds_ctl02_chkBed");
	public WebElement getbedcheckbox() {
		return getElement(bedcheckbox);
	}
	private By UnitNameTextBox=By.id("ctl00_cphpage_txtUnitName");
	public WebElement getUnitNameTextBox() {
		return getElement(UnitNameTextBox);
	}
	private By SpecilisationDDL=By.id("ctl00_cphpage_ddlUnitSpecialisation");
	public WebElement getSpecilisationDDL() {
		return getElement(SpecilisationDDL);
	}
	private By HeadofUnit=By.id("ctl00_cphpage_ddlHeadofUnit");
	public WebElement getHeadofUnit() {
		return getElement(HeadofUnit);
	}
	private By Bedtab=By.id("__tab_ctl00_cphpage_tabSearch_tabPnlBeds");
	public WebElement getBedtab() {
		return getElement(Bedtab);
	}
	private By Doctortab=By.id("__tab_ctl00_cphpage_tabSearch_tabPnlDoctors");
	public WebElement getDoctortab() {
		return getElement(Doctortab);
	}
	private By Save=By.id("ctl00_cphpage_btnSave");
	public WebElement getSave() {
		return getElement(Save);
	}
	private By WardDDL=By.id("ctl00_cphpage_tabSearch_tabPnlBeds_ddlWard");
	public WebElement getWardDDL() {
		return getElement(WardDDL);
	}
	private By DoctorCheckBox=By.id("ctl00_cphpage_tabSearch_tabPnlDoctors_chkDoctors_0");
	public WebElement getDoctorCheckBox() {
		return getElement(DoctorCheckBox);
	}
	private By MessageBox_ButtonOK=By.id("ctl00_cphpage_MyMessageBox_ButtonOK");
	public WebElement getMessageBox_ButtonOK() {
		return getElement(MessageBox_ButtonOK);
	}
	
	
	
	
	
		
}
