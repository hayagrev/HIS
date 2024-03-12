package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InpatientManagement_Reportspages extends BasePage{

	public InpatientManagement_Reportspages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By DischargeIntimation = By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst9");
	public WebElement getDischargeIntimation() {
		return getElement(DischargeIntimation);
	}
	private By previewButton = By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	public WebElement getpreviewButton() {
		return getElement(previewButton);
	}
	private By ClearButton = By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
	public WebElement getClearButton() {
		return getElement(ClearButton);
	}
	private By ExportButton = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[2]/input");
	public WebElement getExportButton() {
		return getElement(ExportButton);
	}
	private By FormateDDl = By.id("exportFormatList");
	public WebElement getFormateDDl() {
		return getElement(FormateDDl);
	}
	private By OKButton = By.id("submitexport");
	public WebElement getOKButton() {
		return getElement(OKButton);
	}
	private By printButton = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[4]/input");
	public WebElement getprintButton() {
		return getElement(printButton);
	}
	
	
	
}
