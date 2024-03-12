package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clinical_Record_ReportPages extends BasePage{

	public Clinical_Record_ReportPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	private By Expand_Super_Speciality_Patient_Referrals=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[1]/tbody/tr/td[1]/a/img");
	private By Item_Master_Data=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst0");
	private By prescreption_itemIssue=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst4");
	private By StockStatus_StationWise=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst2");
	private By ZeroStock_Item=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst3");
	private By PreviewButton=By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	private By IPNumber_textBox=By.id("ctl00_ctl00_cphpage_cphReport_txtIpNumber");
	private By Department_DLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlList");
	private By ExprotReport=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[2]/input");
	private By ExprotReport_DLL=By.id("exportFormatList");
	private By ExprotReport_OKButon=By.id("submitexport");
	private By ClearButton=By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
	private By Blackoverlay=By.xpath("/html/body/div[2]/div[1]/img");
	
	public WebElement getClearButton() {
		return getElement(ClearButton);
	}
	public WebElement getExpand_Super_Speciality_Patient_Referrals() {
		return getElement(Expand_Super_Speciality_Patient_Referrals);
	}	                                 
public WebElement getItem_Master_Data() {
	return getElement(Item_Master_Data);
}
public WebElement getprescreption_itemIssue() {
	return getElement(prescreption_itemIssue);
}
public WebElement getStockStatus_StationWise() {
	return getElement(StockStatus_StationWise);
}
public WebElement getZeroStock_Item() {
	return getElement(ZeroStock_Item);
}
public WebElement getPreviewButton() {
	return getElement(PreviewButton);
}
public WebElement getIPNumber_textBox() {
	return getElement(IPNumber_textBox);
}
public WebElement getDepartment_DLL() {
	return getElement(Department_DLL);
}
public WebElement getExprotReport() {
	return getElement(ExprotReport);
}
public WebElement getExprotReport_DLL() {
	return getElement(ExprotReport_DLL);
}
public WebElement getExprotReport_OKButon() {
	return getElement(ExprotReport_OKButon);
}
public WebElement getBlackoverlay() {
	return getElement(Blackoverlay);
}
}
