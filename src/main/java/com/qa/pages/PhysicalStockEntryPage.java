package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class PhysicalStockEntryPage extends BasePage {

	util utilobj = new util();

	public PhysicalStockEntryPage(WebDriver driver) {
		super(driver);

	}

	private By btnSearch = By.id("btnSearch");

	private By txtName = By.id("txtName");
	private By btnSearchpopup = By.xpath("//*[@id='ctl00_cphpage_td1']/input[@id='btnSearch']");
	private By btnSelect = By.id("btnSelect");
	private By gridrecord = By.id("ChkSelect0");////*[@id="ChkSelect0"]

	private By txtQty = By.id("ctl00_cphpage_gdvPhysicalStock_ctl02_txtQty");
	private By txtPRate = By.id("ctl00_cphpage_gdvPhysicalStock_ctl02_txtPRate");
	private By txtMRP = By.id("ctl00_cphpage_gdvPhysicalStock_ctl02_txtMRP");
	private By txtExpiryDate = By.id("ctl00_cphpage_gdvPhysicalStock_ctl02_txtExpiryDate");
	private By txtMFDDate = By.id("ctl00_cphpage_gdvPhysicalStock_ctl02_txtMFDDate");
	private By txtRemarks1 = By.id("ctl00_cphpage_gdvPhysicalStock_ctl02_txtRemarks1");
	private By txtBatch = By.id("ctl00_cphpage_gdvPhysicalStock_ctl02_txtBatch");
	private By btnSave = By.id("ctl00_cphpage_btnSave");
	private By popupok = By.id("popup_ok");

	public WebElement getpopupok() {
		return getElement(popupok);
	}

	public WebElement getbtnSave() {
		return getElement(btnSave);
	}

	public WebElement getbtnSearch() {
		return getElement(btnSearch);
	}

	public WebElement gettxtName() {
		return getElement(txtName);
	}

	public WebElement getbtnSearchpopup() {
		return getElement(btnSearchpopup);
	}

	public WebElement getbtnSelect() {
		return getElement(btnSelect);
	}

	public WebElement getgridrecord() {
		return getElement(gridrecord);
	}

	public WebElement gettxtQty() {
		return getElement(txtQty);
	}

	public WebElement gettxtPRate() {
		return getElement(txtPRate);
	}

	public WebElement gettxtMRP() {
		return getElement(txtMRP);
	}

	public WebElement gettxtBatch() {
		return getElement(txtBatch);
	}

	public WebElement gettxtExpiryDate() {
		return getElement(txtExpiryDate);
	}

	public WebElement gettxtMFDDate() {
		return getElement(txtMFDDate);
	}

	public WebElement gettxtRemarks1() {
		return getElement(txtRemarks1);
	}

	private By BlackOverlay = By.xpath("//html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);

	}
	private By EntryNoImage=By.id("ctl00_cphpage_imgEntryNo");
	public WebElement getEntryNoImage() {
		return getElement(EntryNoImage);
	}
	private By PrintButton=By.id("ctl00_cphpage_btnPrint");
	public WebElement getPrintButton() {
		return getElement(PrintButton);
	}
	private By ClearButton=By.id("ctl00_cphpage_btnClear");
	public WebElement getClearButton() {
		return getElement(ClearButton);
	}
	private By SerachPhysicalStockEnryRadiobutton=By.id("grdPhysicalStockPopGrid_ctl02_rdbtnSelect");
	public WebElement getSerachPhysicalStockEnryRadiobutton() {
		return getElement(SerachPhysicalStockEnryRadiobutton);
	}
	private By SerachPhysicalStockEnrySelectButton=By.id("btnShow");
	public WebElement getSerachPhysicalStockEnrySelectButton() {
		return getElement(SerachPhysicalStockEnrySelectButton);
	}
	
	
}
