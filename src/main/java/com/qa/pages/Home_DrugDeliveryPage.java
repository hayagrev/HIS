package com.qa.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class Home_DrugDeliveryPage extends BasePage  {
	
	 util utilobj = new util();
	public Home_DrugDeliveryPage(WebDriver driver) {
		super(driver);

	
	}
	private By drug_delivery_checkbox = By.xpath("//input[@id='ctl00_cphpage_ChkEligible']");	
	private By confirm_popup = By.xpath("//input[@id='ctl00_cphpage_MyMessageBoxInfo_ButtonYes']");	
	private By view_edit_link = By.xpath("//a[@id='ctl00_cphpage_Lnkaddress']");	
	
	private By Address = By.xpath("//textarea[@id='ctl00_cphpage_txtDrugAddress']");	
	private By state = By.xpath("//select[@id='ctl00_cphpage_ddlPermanentLGDState']");	
	private By dstrict = By.xpath("//select[@id='ctl00_cphpage_ddlPermanentLGDDistrict']");	
	private By subdistrict = By.xpath("//select[@id='ctl00_cphpage_ddlPermanentLGDSubDistrict']");	
	private By pincode = By.xpath("//input[@id='ctl00_cphpage_txtPermtPin']");	
	private By mobilenum = By.xpath("//input[@id='ctl00_cphpage_txtPermtMobileNo']");	
	private By savebtn = By.xpath("//input[@id='ctl00_cphpage_btnSave']");	
	private By clearbtn = By.xpath("//input[@id='ctl00_cphpage_btnClear']");	
	private By Worklist = By.linkText("Pharmacy Issue Worklist for Home Drug Delivery");
	private By FromDate = By.xpath("//input[@id='ctl00_cphpage_txtFromDate']");
	private By ToDate = By.xpath("//input[@id='ctl00_cphpage_txtToDate']");
	private By Search = By.xpath("//input[@id='ctl00_cphpage_btnSearch']");
	private By Print = By.xpath("//input[@id='ctl00_cphpage_btnHDDPrint']");
	private By Close = By.xpath("//input[@id='ctl00_cphpage_Button1']");
	
	public WebElement drug_delivery_Worklist() {
		return getElement(Worklist);
	}
	public WebElement drug_delivery_FromDate() {
		return getElement(FromDate);
	}
	public WebElement drug_delivery_ToDate() {
		return getElement(ToDate);
	}
	public WebElement drug_delivery_Search() {
		return getElement(Search);
	}
	public WebElement drug_delivery_Print() {
		return getElement(Print);
	}
	public WebElement drug_delivery_Close() {
		return getElement(Close);
	}
	
	public WebElement hddcheckBox() {
		return getElement(drug_delivery_checkbox);
	}
	public WebElement getpopup_homedrugdelivery() {
		return getElement(confirm_popup);
	}
	public WebElement Home_Drug_Delivery_link() {
		return getElement(view_edit_link);
	}
	
	public WebElement drug_delivery_Address() {
		return getElement(Address);
	}
	public WebElement drug_delivery_state() {
		return getElement(state);
	}
	public WebElement drug_delivery_dstrict() {
		return getElement(dstrict);
	}
	public WebElement drug_delivery_subdistrict() {
		return getElement(subdistrict);
	}
	public WebElement drug_delivery_pincode() {
		return getElement(pincode);
	}
	public WebElement drug_delivery_mobilenum() {
		return getElement(mobilenum);
	}
	public WebElement drug_delivery_savebtn() {
		return getElement(savebtn);
	}
	public WebElement drug_delivery_clearbtn() {
		return getElement(clearbtn);
	}

	
}
