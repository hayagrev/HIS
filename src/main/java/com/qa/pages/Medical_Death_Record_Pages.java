package com.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class Medical_Death_Record_Pages extends BasePage {
	public Medical_Death_Record_Pages( WebDriver driver) {
		super(driver);
	}
	util utilobj = new util();
	private By Death_Record_admission_searchimg=By.id("ctl00_cphpage_imgSearchAdmNo");
	public WebElement getDeath_Record_admission_searchimg() {
		return getElement(Death_Record_admission_searchimg);
	}
	private By Death_Record_admissionNo_searchbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getDeath_Record_admissionNo_searchbox() {
		return getElement(Death_Record_admissionNo_searchbox);
	}
	
	private By Death_Record_admissionNo_searchbutton=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getDeath_Record_admissionNo_searchbutton() {
		return getElement(Death_Record_admissionNo_searchbutton);
	}
	private By Death_Record_admissionsearch_checkbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getDeath_Record_admissionsearch_checkbox() {
		return getElement(Death_Record_admissionsearch_checkbox);
	}
	private By Death_Record_admission_selectbutton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getDeath_Record_admission_selectbutton() {
		return getElement(Death_Record_admission_selectbutton);
	}
	private By Death_Record_autopsycheckbox=By.id("ctl00_cphpage_chkbxPosrmortemCarried");
	public WebElement getDeath_Record_autopsycheckbox() {
		return getElement(Death_Record_autopsycheckbox);
	}
	private By Death_Record_imidiatecause=By.id("ctl00_cphpage_txtCauseOfDeath");
	public WebElement getDeath_Record_imidiatecause() {
		return getElement(Death_Record_imidiatecause);
	}
	private By Death_Record_Mannerofdeath=By.id("ctl00_cphpage_ddlMannerOfDeath");
	public WebElement getDeath_Record_Mannerofdeath() {
		return getElement(Death_Record_Mannerofdeath);
	}
	private By Death_Record_PrintButton=By.id("ctl00_cphpage_btnPrint");
	public WebElement getDeath_Record_PrintButton() {
		return getElement(Death_Record_PrintButton);
	}
	private By Death_Record_SavetButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getDeath_Record_SavetButton() {
		return getElement(Death_Record_SavetButton);
	}
	private By Death_Record_ClearButton=By.id("ctl00_cphpage_btnClear");
	public WebElement getDeath_Record_ClearButton() {
		return getElement(Death_Record_ClearButton);
	}
	private By Death_Record_DoctorSearchIMG=By.id("ctl00_cphpage_imgDoctorName");
	public WebElement getDeath_Record_DoctorSearchIMG() {
		return getElement(Death_Record_DoctorSearchIMG);
	}
	private By Death_Record_EmpNO=By.id("Empno");
	public WebElement getDeath_Record_EmpNO() {
		return getElement(Death_Record_EmpNO);
	}
	private By Death_Record_BtnSearch=By.id("btnSearch");
	public WebElement getDeath_Record_BtnSearch() {
		return getElement(Death_Record_BtnSearch);
	}
	private By Death_Record_DoctorRadioButton=By.name("radio");
	public WebElement getDeath_Record_DoctorRadioButton() {
		return getElement(Death_Record_DoctorRadioButton);
	}
	private By Death_Record_DoctorSearchSelect=By.id("btnSearchSelect");
	public WebElement getDeath_Record_DoctorSearchSelect() {
		return getElement(Death_Record_DoctorSearchSelect);
	}
	
	private By Death_Record_CertificationNO=By.id("ctl00_cphpage_txtDeathCertNumber");
	public WebElement getDeath_Record_CertificationNO() {
		return getElement(Death_Record_CertificationNO);
	}
	private By Death_Record_TimeOfDeath=By.id("ctl00_cphpage_txtDeathDateTime");
	public WebElement getDeath_Record_TimeOfDeath() {
		return getElement(Death_Record_TimeOfDeath);
	}
	
	
	
	public void testcase_for_MedicalDeathRecordPages(String Admission) throws InterruptedException {
		Thread.sleep(2000);
		getDeath_Record_admission_searchimg().click();
		Thread.sleep(2000);
		getDeath_Record_admissionNo_searchbox().sendKeys(Admission);
		Thread.sleep(2000);
		getDeath_Record_admissionNo_searchbutton().click();
		Thread.sleep(2000);
		getDeath_Record_admissionsearch_checkbox().click();
		Thread.sleep(2000);
		getDeath_Record_admission_selectbutton().click();
		Thread.sleep(2000);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		  Calendar cal = Calendar.getInstance();
		String Date = sdf.format(cal.getTime());
		  System.out.println(Date);
		  Thread.sleep(4000);
		  cal.add(Calendar.DAY_OF_MONTH, 1);
		  String newDate = sdf.format(cal.getTime());
		  System.out.println(newDate);
		  Thread.sleep(2000);
		 // utilobj.JSEnterText(getDeath_Record_TimeOfDeath(), driver, Date);
		  driver.findElement(By.id("ctl00_cphpage_ChkUnknown")).click();
		  Thread.sleep(2000); 
		getDeath_Record_autopsycheckbox().click();
		Thread.sleep(2000);
		getDeath_Record_DoctorSearchIMG().click();
		Thread.sleep(2000);
		getDeath_Record_EmpNO().sendKeys("1122332");
		Thread.sleep(2000);
		getDeath_Record_BtnSearch().click();
		Thread.sleep(2000);
		getDeath_Record_DoctorRadioButton().click();
		Thread.sleep(2000);
		getDeath_Record_DoctorSearchSelect().click();
		Thread.sleep(2000);
//		getDeath_Record_PrintButton().click();
//		Thread.sleep(2000);
		getDeath_Record_SavetButton().click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		Thread.sleep(2000);
		String Certification_no=getDeath_Record_CertificationNO().getText();
		Thread.sleep(2000);
		System.out.println(Certification_no);
		//getDeath_Record_PrintButton().click();
//		utilobj.SwitchToChildWindow(driver, "");
//		Thread.sleep(2000);
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	driver.close();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver, "Dhanwantri");
//	Thread.sleep(2000);
//	
//	getDeath_Record_ClearButton().click();
	
	
	
	}
	
	
}	


