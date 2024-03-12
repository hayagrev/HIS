package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreReportPage extends BasePage{

	public StoreReportPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By itemMasterReport=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst15");
	public WebElement getitemMasterReport() {
		return getElement(itemMasterReport);
	}
	private By previewButton=By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	public WebElement getpreviewButton() {
		return getElement(previewButton);
	}
	private By StoreReportpluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[4]/tbody/tr/td[1]/a/img");
	public WebElement getStoreReportpluseButton() {
		return getElement(StoreReportpluseButton);
	}
	private By physicalStockEntry=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst25");
	public WebElement getphysicalStockEntry() {
		return getElement(physicalStockEntry);
	}
	private By proccesImage=By.xpath("/html/body/div[2]/div[1]/img");
	public WebElement getproccesImage() {
		return getElement(proccesImage);
	}
	private By RetailMasterStockQuantitySummary=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst33");
	public WebElement getRetailMasterStockQuantitySummary() {
		return getElement(RetailMasterStockQuantitySummary);
	}
	
	
}
