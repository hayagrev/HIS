package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class InpatientManagement_warddashboardpages extends BasePage{
  
WebDriver driver;
	
	public InpatientManagement_warddashboardpages(WebDriver driver){
		
		super(driver);
		
	}
 util utilobj=new util();
	
	private By Link=By.xpath("//a[@id='ctl00_cphpage_gdvDashBoard_ctl02_lnkslot6']");
	public WebElement getLink() {
		return getElement(Link);
		
	}
	private By Admissionnolink=By.id("ctl00_cphpage_gdvPatients_ctl02_admissionNo");
	public WebElement getAdmissionnolink() {
		return getElement(Admissionnolink);
		
	}
	private By Temperaturetxtbox=By.id("ctl00_cphpage_grdVital_ctl02_txtValue");
	public WebElement getTemperaturetxtbox() {
		return getElement(Temperaturetxtbox);
		
	}
	private By Pulsetxtbox=By.xpath("//input[@id='ctl00_cphpage_grdVital_ctl03_txtValue']");
	public WebElement getPulsetxtbox() {
		return getElement(Pulsetxtbox);
		
	}
	private By Save=By.xpath("//input[@id='ctl00_cphpage_btnSave']");
	public WebElement getSave() {
		return getElement(Save);
		
	}
	private By OK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getOK() {
		return getElement(OK);
		
	}
	private By Backbtn=By.id("ctl00_cphpage_btnClear");
	public WebElement getBackbtn() {
		return getElement(Backbtn);
		
	}
	private By PreviousDate=By.id("ctl00_cphpage_btnPreviousDate");
	public WebElement getPreviousDate() {
		return getElement(PreviousDate);
		
	}
	private By CurrentDate=By.id("ctl00_cphpage_btnCurrentDate");
	public WebElement getCurrentDate() {
		return getElement(CurrentDate);
	}
	private By Screenname=By.id("/html/body/div[1]/form/div[4]/div[2]/div/div/h1/span");
	public WebElement getScreenname() {
		return getElement(Screenname);
	}

	
	
	
		
	    
	   
					 
	}
	

	


