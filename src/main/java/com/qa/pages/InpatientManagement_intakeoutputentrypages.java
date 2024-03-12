package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InpatientManagement_intakeoutputentrypages extends BasePage{
  
	
    WebDriver driver;
   
	
	public InpatientManagement_intakeoutputentrypages(WebDriver driver){
		
		super(driver);
		
	}
 private By AdmissionNoSearch=By.xpath("//input[@id='ctl00_cphpage_imgbtnSearchAdmissionNo']");
 public WebElement getAdmissionNoSearch() {
	 return getElement(AdmissionNoSearch);
 }
 private By IPNoSearchtxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
 public WebElement getIPNoSearchtxtbox() {
	 return getElement(IPNoSearchtxtbox);
 }
 private By Searchbtn=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_btnSearch']");
 public WebElement getSearchbtn() {
	 return getElement(Searchbtn);
 }
 private By Radiobtnselect=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp']");
 public WebElement getRadiobtnselect() {
	 return getElement(Radiobtnselect);
 }
 private By Selectbtn=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']");
 public WebElement getSelectbtn() {
	 return getElement(Selectbtn);
 }
 private By IntakeNameSelect=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/div/div/table/tbody/tr[2]/td[2]/input");
 public WebElement getIntakeNameSelect() {
	 return getElement(IntakeNameSelect);
 }
 private By intakenametxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
 public WebElement getintakenametxtbox() {
	 return getElement(intakenametxtbox);
 }
 private By intakeitemsearch=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_btnSearch']");
 public WebElement getintakeitemsearch() {
	 return getElement(intakeitemsearch);
 }
 private By IntakeNameradiobtn=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl03_rdbTemp']");
 public WebElement getIntakeNameradiobtn() {
	 return getElement(IntakeNameradiobtn);
 }
 private By Quantity=By.xpath("//input[@id='ctl00_cphpage_gdvIntakeOuput_ctl02_txtQty']");
 public WebElement getQuantity() {
	 return getElement(Quantity);
 }
 private By Selectbtn1=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']");
 public WebElement getSelectbtn1() {
	 return getElement(Selectbtn1);
 }
 private By Save=By.xpath("//input[@id='ctl00_cphpage_btnSave']");
 public WebElement getSave() {
	 return getElement(Save);
 }
 private By Clear=By.id("ctl00_cphpage_btnClear");
 public WebElement getClear() {
	 return getElement(Clear);
 }
 private By SuccusMessageOkButton=By.id("ctl00_cphpage_MyMessageBox_ButtonOK");
 public WebElement getSuccusMessageOkButton() {
	 return getElement(SuccusMessageOkButton);
 }
 private By BlackOverLay=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[6]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]");
 public WebElement getBlackOverLay() {
	 return getElement(BlackOverLay);
 }
 private By view=By.id("ctl00_cphpage_btnView");
 public WebElement getview() {
	 return getElement(view);
 }
 private By RecordNo=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/div[1]/div/table/tbody/tr[2]/td[1]");
 public WebElement getRecordNo() {
	 return getElement(RecordNo);
 }
 private By backButton=By.id("ctl00_cphpage_btnBack");
 public WebElement getbackButton() {
	 return getElement(backButton);
 }
 
	
}
