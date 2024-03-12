package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InpatientManagement_surgeryrequestpages extends BasePage{
  
	
WebDriver driver;
	
	public InpatientManagement_surgeryrequestpages(WebDriver driver){
		
		super(driver);
		
	}
 
	private By Admissionnosearchicon=By.xpath("//input[@id='ctl00_cphpage_imgSearchAdmissionNo']");
	public WebElement getAdmissionnosearchicon() {
		return getElement(Admissionnosearchicon);
	}
	private By Dropdown=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl03_ddlCriteria");
	public WebElement getDropdown() {
		return getElement(Dropdown);
	}
	
	private By Bednametxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl03_txtCriteria");
	public WebElement getBednametxtbox() {
		return getElement(Bednametxtbox);
	}
	private By Search=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']");
	public WebElement getSearch() {
		return getElement(Search);
	}
	private By Radiobtn=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtn() {
		return getElement(Radiobtn);
	}
	private By Select=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']");
	public WebElement getSelect() {
		return getElement(Select);
	}
	private By Dateselect=By.id("ctl00_cphpage_txtOrderDatetime");
	public WebElement getDateselect() {
		return getElement(Dateselect);
	}	
	private By SearchProcedure=By.xpath("//input[@id='ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure']");
	public WebElement getSearchProcedure() {
		return getElement(SearchProcedure);
	}
	private By Dropdown2=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria");
	public WebElement getDropdown2() {
		return getElement(Dropdown2);
	}
	private By SurgeryNametxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria");
	public WebElement getSurgeryNametxtbox() {
		return getElement(SurgeryNametxtbox);
	}
	private By Search1=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']");
	public WebElement getSearch1() {
		return getElement(Search1);
	}
	private By Radiobtn1=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl05_rdbTemp");
	public WebElement getRadiobtn1() {
		return getElement(Radiobtn1);
	}
	private By Select1=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getSelect1() {
		return getElement(Select1);
	}
	private By checkbox=By.xpath("//input[@id='ctl00_cphpage_gdvProcedureResult_ctl02_chkIsAnastasiaRequired']");
	public WebElement getcheckbox() {
		return getElement(checkbox);
	}
	private By Save=By.xpath("//input[@id='ctl00_cphpage_btnSave']");
	public WebElement getSave() {
		return getElement(Save);
	}
	private By processImage = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]");
	public WebElement getprocessImage() {
		return getElement(processImage);
	}
	
    
		
}


