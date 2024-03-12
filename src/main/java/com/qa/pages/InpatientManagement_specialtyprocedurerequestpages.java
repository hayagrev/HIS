package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class InpatientManagement_specialtyprocedurerequestpages extends BasePage {
  
    WebDriver driver;
	
	public InpatientManagement_specialtyprocedurerequestpages(WebDriver driver){
		
		super(driver);
		
	}
	util utillobj=new util();
 
	
	private By SearchBed=By.xpath("//input[@id='ctl00_cphpage_imgSearchBedNo']");
	public WebElement getSearchBed()
	{
		return getElement(SearchBed);
		
	}
	private By DropDown=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria");
	public WebElement getDropDown()
	{
		return getElement(DropDown);
		
	}
	private By Bednametxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getBednametxtbox()
	{
		return getElement(Bednametxtbox);
		
	}
	private By Searchbtn=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']");
	public WebElement getSearchbtn()
	{
		return getElement(Searchbtn);
		
	}
	private By AdmissionSearchbtn=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	public WebElement getAdmissionSearchbtn()
	{
		return getElement(AdmissionSearchbtn);
		
	}
	private By Radiobtnselect=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtnselect()
	{
		return getElement(Radiobtnselect);
		
	}
	private By Selectbtn=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']");
	public WebElement getSelectbtn()
	{
		return getElement(Selectbtn);
	
		
	}	
	private By DateSelect=By.id("ctl00_cphpage_txtOrderDatetime");
	public WebElement getDateSelect()
	{
		return getElement(DateSelect);
		
	}
	private By DateSelect2=By.id("ctl00_cphpage_txtOrderDatetime");
	public WebElement getDateSelect2()
	{
		return getElement(DateSelect2);
		
	}
	private By Hour=By.xpath("//input[@id='ctl00$cphpage$hisTimeSelect_txtHour']");
	public WebElement getHour()
	{
		return getElement(Hour);
		
	}
	private By Hour2=By.xpath("//input[@id='ctl00$cphpage$hisTimeSelect_txtHour']");
	public WebElement getHour2()
	{
		return getElement(Hour2);
		
	}
	private By SearchProcedureicon=By.id("ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure");
	public WebElement getSearchProcedureicon()
	{
		return getElement(SearchProcedureicon);
		
	}
	private By SearchProcedureicon2=By.id("ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure");
	public WebElement getSearchProcedureicon2()
	{
		return getElement(SearchProcedureicon2);
		
	}
	private By Dropdown2=By.xpath("//select[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria']");
	public WebElement getDropdown2()
	{
		return getElement(Dropdown2);
		
	}
	private By Dropdown3=By.xpath("//select[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria']");
	public WebElement getDropdown3()
	{
		return getElement(Dropdown3);
		
	}
	private By ProcedureNametxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria");
	public WebElement getProcedureNametxtbox()
	{
		return getElement(ProcedureNametxtbox);
		
	}
	private By ProcedureNametxtbox2=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria");
	public WebElement getProcedureNametxtbox2()
	{
		return getElement(ProcedureNametxtbox2);
		
	}
	private By Searchbtn1=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']");
	public WebElement getSearchbtn1()
	{
		return getElement(Searchbtn1);
		
	}
	private By Searchbtn2=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']");
	public WebElement getSearchbtn2()
	{
		return getElement(Searchbtn2);
		
		
	}
	private By Radiobtnselect1=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtnselect1()
	{
		return getElement(Radiobtnselect1);
		
	}
	private By Radiobtnselect2=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtnselect2()
	{
		return getElement(Radiobtnselect2);
		
	}
	private By Radiobtnselect3=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getRadiobtnselect3()
	{
		return getElement(Radiobtnselect3);
		
	}
	private By Select1=By.xpath("//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']");
	public WebElement getSelect1()
	{
		return getElement(Select1);
		
	}
	private By Select2=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getSelect2()
	{
		return getElement(Select2);
		
	}
	private By Select3=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getSelect3()
	{
		return getElement(Select3);
		
	}
	private By Save=By.xpath("//input[@id='ctl00_cphpage_btnSave']");
	public WebElement getSave()
	{
		return getElement(Save);
		
	}
	private By clear=By.id("ctl00_cphpage_btnMainClear");
	public WebElement getclear()
	{
		return getElement(clear);
		
	}
	private By AdmissionNO=By.id("ctl00_cphpage_imgSearchAdmissionNo");
	public WebElement getAdmissionNO()
	{
		return getElement(AdmissionNO);
		
	}
	private By UHIDTxtBox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getUHIDTxtBox()
	{
		return getElement(UHIDTxtBox);
		
	}
	private By SuccessMessageOkButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getSuccessMessageOkButton()
	{
		return getElement(SuccessMessageOkButton);
		
	}

	private By processImage = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]");
	public WebElement getprocessImage() {
		return getElement(processImage);
	}
}
	

	
	
