package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class Registration_ReportPages extends BasePage {

	public Registration_ReportPages(WebDriver driver) {
		super(driver);
		
	}
util utilobj=new util();
private By Dispensary_ReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[1]/tbody/tr/td[1]/a/img");
private By Dispensary_Report_FO_List=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst1");
private By Dispensary_Report_MIS_List=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst1");

private By Monthly_ReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[3]/tbody/tr/td[1]/a/img");
private By List_of_Check_In_for_a_Day_Link=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[4]/tbody/tr/td[2]/a");
private By OPD_Check_In_Vs_DoctorLink_Visits=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst13");
private By Dispensary_Report_FO_List_previewButton=By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");                                                        
private By Dispensary_Report_FO_List_ClearButton=By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
private By Dispensary_Report_FO_List_RegistrationDate=By.id("ctl00_ctl00_cphpage_cphReport_txtFromDate");                    
private By Dispensary_Report_FO_List_ExportReport_SubmitButton=By.id("submitexport");
private By Dispensary_Report_FO_List_ExportREport=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[2]/input");
private By Dispensary_Report_FO_List_Exportthereport=By.id("exportFormatList");

public WebElement getDispensary_Report_FO_List_ExportthereportDLL() {
	return getElement(Dispensary_Report_FO_List_Exportthereport);
}
public WebElement getDispensary_Report_FO_List_ExportReport_SubmitButton() {
	return getElement(Dispensary_Report_FO_List_ExportReport_SubmitButton);
}
public WebElement getDispensary_ReportPluseButton() {
	return getElement(Dispensary_ReportPluseButton);
}
public WebElement getDispensary_ReportMIS_List() {
	return getElement(Dispensary_Report_MIS_List);
}
public WebElement getDispensary_Report_FO_List() {
	return getElement(Dispensary_Report_FO_List);
}
public WebElement getDispensary_Report_FO_List_previewButton() {
	return getElement(Dispensary_Report_FO_List_previewButton);
}
public WebElement getDispensary_Report_FO_List_ClearButton() {
	return getElement(Dispensary_Report_FO_List_ClearButton);
}
public WebElement getDispensary_Report_FO_List_RegistrationDate() {
	return getElement(Dispensary_Report_FO_List_RegistrationDate);
}
public WebElement getDispensary_Report_FO_List_ExportREport() {
	return getElement(Dispensary_Report_FO_List_ExportREport);
}
public WebElement getMonthly_ReportPluseButton() {
	return getElement(Monthly_ReportPluseButton);
}

public WebElement getList_of_Check_In_for_a_Day_Link() {
	return getElement(List_of_Check_In_for_a_Day_Link);
}
public WebElement getOPD_Check_In_Vs_DoctorLink_Visits() {
	return getElement(OPD_Check_In_Vs_DoctorLink_Visits);
}



//main hospital report
private By MainHosp_ReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[2]/tbody/tr/td[1]/a/img");
private By MainHosp_ReportFO_List=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst4");
private By MainHosp_ReportFO_List_WardDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlList");

public WebElement getMainHosp_ReportPluseButton() {
	return getElement(MainHosp_ReportPluseButton);
}
public WebElement getMainHosp_ReportFO_List_WardDLL() {
	return getElement(MainHosp_ReportFO_List_WardDLL);
}
public WebElement getMainHosp_ReportFO_List() {
	return getElement(MainHosp_ReportFO_List);
	
}
}
