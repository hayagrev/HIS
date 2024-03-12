package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class InpatientManagement_vitalsentrypages extends BasePage {
	
	WebDriver driver;
	util utilobj=new util();
	public InpatientManagement_vitalsentrypages(WebDriver driver){
		super(driver);
	}
	
	
	private By Bed=By.xpath("//select[@id='ctl00_cphpage_ddlBedName']");
	public WebElement getBed()
	{
		return getElement(Bed);
	}
	private By TempValue=By.id("ctl00_cphpage_grdVital_ctl02_txtValue");
	public WebElement getTempValue()
	{
		return getElement(TempValue);
	}
	private By Pulse=By.xpath("//input[@id='ctl00_cphpage_grdVital_ctl03_txtValue']");
	public WebElement getPulse()
	{
		return getElement(Pulse);
	}
	private By RespiratoryRate=By.xpath("//input[@id='ctl00_cphpage_grdVital_ctl04_txtValue']");
	public WebElement getRespiratoryRate()
	{
		return getElement(RespiratoryRate);
	}
	private By MeanBP=By.xpath("//input[@id='ctl00_cphpage_grdVital_ctl05_txtValue']");
	public WebElement getMeanBP()
	{
		return getElement(MeanBP);
	}
	private By SPO2=By.xpath("//input[@id='ctl00_cphpage_grdVital_ctl06_txtValue']");
	public WebElement getSPO2()
	{
		return getElement(SPO2);
	}
	private By SystolicBP=By.xpath("//input[@id='ctl00_cphpage_grdVital_ctl07_txtValue']");
	public WebElement getSystolicBP()
	{
		return getElement(SystolicBP);
	}
	private By DiastolicBP=By.xpath("//input[@id='ctl00_cphpage_grdVital_ctl08_txtValue']");
	public WebElement getDiastolicBP()
	{
		return getElement(DiastolicBP);
	}
	private By BMI=By.xpath("//input[@id='ctl00_cphpage_grdVital_ctl09_txtValue']");
	public WebElement getBMI()
	{
		return getElement(BMI);
	}
	private By Save=By.xpath("//input[@id='ctl00_cphpage_btnSave']");
	public WebElement getSave()
	{
		return getElement(Save);
	}
	private By Clear=By.id("ctl00_cphpage_btnClear");
	public WebElement getClear()
	{
		return getElement(Clear);
	}
	private By BedDll=By.id("ctl00_cphpage_ddlBedName");
	public WebElement getBedDll()
	{
		return getElement(BedDll);
	}
	private By BedDllvalue=By.xpath("//html//body//div[1]//form//div[4]//div[2]//div//div[1]//div[1]//table//tbody//tr//td//table//tbody//tr[1]//td[4]//select//option[@value='44602']");
	public WebElement getBedDllvalue()
	{
		return getElement(BedDllvalue);
	}

	private By processImage = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]");
	public WebElement getprocessImage() {
		return getElement(processImage);
	}
	private By ViewButton = By.id("ctl00_cphpage_btnView");
	public WebElement getViewButton() {
		return getElement(ViewButton);
	}
	private By RecordButton = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/div[1]/table/tbody/tr/td/div/div/table/tbody/tr[2]/td[1]");
	public WebElement getRecordButton() {
		return getElement(RecordButton);
	}
	private By UpdateButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getUpdateButton()
	{
		return getElement(UpdateButton);
	}
	private By OKButton=By.xpath("//*[@id='popup_ok']");
	public WebElement getOKButton()
	{
		return getElement(OKButton);
	}

	
	
}
