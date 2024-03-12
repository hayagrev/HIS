package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InpatientManagment_DoctorVisitPage extends BasePage {

	public InpatientManagment_DoctorVisitPage(WebDriver driver) {
		super(driver);
		
	}
	private By BedDll=By.id("ctl00_cphpage_ddlBedName");
	public WebElement getBedDll() {
		return getElement(BedDll);
	}
	private By DoctorSerchImage=By.id("ctl00_cphpage_gdvDoctorVisits_ctl02_ibtnDoctor");
	public WebElement getDoctorSerchImage() {
		return getElement(DoctorSerchImage);
	}
	private By DoctorsearchDoctorname=By.id("txtName");
	public WebElement getDoctorsearchDoctorname() {
		return getElement(DoctorsearchDoctorname);
	}
	private By DoctorsearchSearchButton=By.id("btnSearch");
	public WebElement getDoctorsearchSearchButton() {
		return getElement(DoctorsearchSearchButton);
	}
	private By DoctorsearchCheckboxSelect=By.id("ChkSelect0");
	public WebElement getDoctorsearchCheckboxSelect() {
		return getElement(DoctorsearchCheckboxSelect);
	}
	private By DoctorsearchSelectButton=By.id("btnSelect");
	public WebElement getDoctorsearchSelectButton() {
		return getElement(DoctorsearchSelectButton);
	}
	private By SaveButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getSaveButton() {
		return getElement(SaveButton);
	}
	private By OKButton=By.xpath("//*[@id='popup_ok']");
	public WebElement getOKButton()
	{
		return getElement(OKButton);
	}
	private By processImage = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]");
	public WebElement getprocessImage() {
		return getElement(processImage);
	}
	private By saveOkbutton=By.id("ctl00_cphpage_MyMessageBox_ButtonOK");
	public WebElement getsaveOkbutton()
	{
		return getElement(saveOkbutton);
	}
	private By VisitTypeDll=By.id("ctl00_cphpage_gdvDoctorVisits_ctl02_ddlVisistType");
	public WebElement getVisitTypeDll()
	{
		return getElement(VisitTypeDll);
	}
	private By ViewButton=By.id("ctl00_cphpage_btnView");
	public WebElement getViewButton()
	{
		return getElement(ViewButton);
	}
	private By Recordnumber=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div[2]/table/tbody/tr/td/div/div/div/table/tbody/tr[2]/td[2]");
	public WebElement getRecordnumber()
	{
		return getElement(Recordnumber);
	}
	
}
