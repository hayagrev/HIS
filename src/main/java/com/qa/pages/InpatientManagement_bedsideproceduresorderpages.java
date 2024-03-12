package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class InpatientManagement_bedsideproceduresorderpages extends BasePage {
  
	    WebDriver driver;
		
		public InpatientManagement_bedsideproceduresorderpages(WebDriver driver){
			
			super(driver);
			
		}
		util utillobj=new util();
		private By SearchAdmission = By.id("ctl00_cphpage_imgSearchAdmissionNo");
		public WebElement getSearchAdmission() {
			return getElement(SearchAdmission);
		}
		private By SearchAdmission1 = By.id("ctl00_cphpage_imgSearchAdmissionNo");
		public WebElement getSearchAdmission1() {
			return getElement(SearchAdmission1);
		}
		private By DropDown = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria");
		public WebElement getDropDown() {
			return getElement(DropDown);
		}
		private By DropDown2 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria");
		public WebElement getDropDown2() {
			return getElement(DropDown2);
		}
		private By PatientNameIP = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
		public WebElement getPatientNameIP() {
			return getElement(PatientNameIP);
		}
		private By PatientNameIP1 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria");
		public WebElement getPatientNameIP1() {
			return getElement(PatientNameIP1);
		}
		private By SearchBtn = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
		public WebElement getSearchBtn() {
			return getElement(SearchBtn);
		}
		private By SearchBtn1 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
		public WebElement getSearchBtn1() {
			return getElement(SearchBtn1);
		}
		private By Radiobtnselect = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
		public WebElement getRadiobtnselect() {
			return getElement(Radiobtnselect);
		}
		private By Radiobtnselect2 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
		public WebElement getRadiobtnselect2() {
			return getElement(Radiobtnselect2);
		}
		private By Select = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
		public WebElement getSelect() {
			return getElement(Select);
		}
		private By Select2 = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
		public WebElement getSelect2() {
			return getElement(Select2);
		}
		private By Dateselect = By.id("ctl00_cphpage_txtOrderDatetime");
		public WebElement getDateselect() {
			return getElement(Dateselect);
		}
		private By Dateselect1 = By.id("ctl00_cphpage_txtOrderDatetime");
		public WebElement getDateselect1() {
			return getElement(Dateselect1);
		}
		private By ProcedureSearch = By.id("ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure");
		public WebElement getProcedureSearch() {
			return getElement(ProcedureSearch);
		}
		private By ProcedureSearch1 = By.id("ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure");
		public WebElement getProcedureSearch1() {
			return getElement(ProcedureSearch1);
		}
		private By DropDown1 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria");
		public WebElement getDropDown1() {
			return getElement(DropDown1);
		}
		private By DropDown3 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria");
		public WebElement getDropDown3() {
			return getElement(DropDown3);
		}
		private By ProcedureName = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria");
		public WebElement getProcedureName() {
			return getElement(ProcedureName);
		}
		private By ProcedureName1 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria");
		public WebElement getProcedureName1() {
			return getElement(ProcedureName1);
		}
		private By ProcedureBtnSearch = By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']");
		public WebElement getProcedureBtnSearch() {
			return getElement(ProcedureBtnSearch);
		}
		private By ProcedureBtnSearch1 = By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']");
		public WebElement getProcedureBtnSearch1() {
			return getElement(ProcedureBtnSearch1);
		}
		private By Radiobtnselect1 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
		public WebElement getRadiobtnselect1() {
			return getElement(Radiobtnselect1);
		}
		private By Radiobtnselect3 = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
		public WebElement getRadiobtnselect3() {
			return getElement(Radiobtnselect3);
		}
		private By Select1 = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
		public WebElement getSelect1() {
			return getElement(Select1);
		}
		private By Select3 = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
		public WebElement getSelect3() {
			return getElement(Select3);
		}
		private By Save = By.id("ctl00_cphpage_btnSave");
		public WebElement getSave() {
			return getElement(Save);
		}
		private By RemoveProccesor = By.id("ctl00_cphpage_gdvProcedureResult_ctl02_imgbtnProcRemove");
		public WebElement getRemoveProccesor() {
			return getElement(RemoveProccesor);
		}
		private By View = By.id("ctl00_cphpage_btnView");
		public WebElement getView() {
			return getElement(View);
		}
		private By Clear = By.id("ctl00_cphpage_btnMainClear");
		public WebElement getClear() {
			return getElement(Clear);
		}
		private By Delete = By.id("ctl00_cphpage_btnDelete");
		public WebElement getDelete() {
			return getElement(Delete);
		}
		private By Back = By.id("ctl00_cphpage_btnBack");
		public WebElement getBack() {
			return getElement(Back);
		}
		private By DropdownclauseValue = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[1]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/select/option[3]");
		public WebElement getDropdownclauseValue() {
			return getElement(DropdownclauseValue);
		}
		private By SuccessMessageOkButton = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
		public WebElement getSuccessMessageOkButton() {
			return getElement(SuccessMessageOkButton);
		}
		private By processImage = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]");
		public WebElement getprocessImage() {
			return getElement(processImage);
		}
		
		
		
		
		
		
		
		
		
		
}
