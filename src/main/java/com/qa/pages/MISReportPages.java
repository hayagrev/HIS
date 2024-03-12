package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MISReportPages extends BasePage{

	public MISReportPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By ButtonPreview=By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	                                   
	public WebElement getButtonPreview() {
		return getElement(ButtonPreview);
	}
	private By ButtonPreview1=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/div/table/tbody/tr/td/table/tbody/tr[4]/td/input[1]");
    
	
	private By MonthlyReport=By.linkText("Monthly Assessment Report of Hospitals to HQ (DO Letter)");
	public WebElement getMonthlyReport() {
		return getElement(MonthlyReport);
	}
	//Status Report of Monthly Assessment Report (DO Letter)
	private By MonthlyStatusReport=By.xpath("//a[@id='ctl00_ctl00_cphpage_cphReportMenu_trvReportst1']");
	public WebElement getMonthlyStatusReport() {
		return getElement(MonthlyStatusReport);
	}
	
	private By SelectState=By.xpath("//select[@id='ctl00_ctl00_cphpage_cphReport_ddlStateFuture']");
	public WebElement getSelectState() {
		return getElement(SelectState);
	}
	
	private By SelectLocation=By.id("ctl00_ctl00_cphpage_cphReport_ddlHospitalFuture");
	public WebElement getSelectLocation() {
		return getElement(SelectLocation);
	}
	
	private By SelectYear=By.xpath("//select[@id='ctl00_ctl00_cphpage_cphReport_ddl_year']");
	public WebElement getSelectYear() {
		return getElement(SelectYear);
	}
	
	private By SelectMonth=By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth");
	public WebElement getSelectMonth() {
		return getElement(SelectMonth);
	}
	//Status Report of Monthly Assessment Report (DO Letter)
	
	private By SelectMonthlyAssessmentDo=By.linkText("Monthly Assessment Report of Hospital (DO Letter)");
	public WebElement getSelectMonthlyAssessmentDo() {
		return getElement(SelectMonthlyAssessmentDo);  
	}
	
	private By LoggoutButton=By.xpath("//img[@alt='lbl_logout']");
	public WebElement getSLoggoutButton() {
		return getElement(LoggoutButton);
	}
	
	public WebElement getButtonPreview1() {
		return getElement(ButtonPreview1);
	}
	
	private By ButtonClear=By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
	public WebElement getButtonClear() {
		return getElement(ButtonClear);
	}
	private By AAAMobileAppReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[1]/tbody/tr/td[1]/a/img");
	public WebElement getAAAMobileAppReportPluseButton() {
		return getElement(AAAMobileAppReportPluseButton);
	}
	private By DispensryReprtPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[2]/tbody/tr/td[1]/a/img");
	public WebElement getDispensryReprtPluseButton() {
		return getElement(DispensryReprtPluseButton);
	}
	private By GroupPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[3]/tbody/tr/td[1]/a/img");
	public WebElement getGroupPluseButton() {
		return getElement(GroupPluseButton);
	}
	private By HospitalReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[4]/tbody/tr/td[1]/a/img");
	public WebElement getHospitalReportPluseButton() {
		return getElement(HospitalReportPluseButton);
	}
	private By IMP_mEUDReportsPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[5]/tbody/tr/td[1]/a/img");
	public WebElement getIMP_mEUDReportsPluseButtonPluseButton() {
		return getElement(IMP_mEUDReportsPluseButton);
	}
	private By InpatientAdmissionReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[6]/tbody/tr/td[1]/a/img");
	public WebElement getInpatientAdmissionReportPluseButton() {
		return getElement(InpatientAdmissionReportPluseButton);
	}
	private By LGDReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[7]/tbody/tr/td[1]/a/img");
	public WebElement getLGDReportPluseButton() {
		return getElement(LGDReportPluseButton);
	}
	private By MasterDataPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[8]/tbody/tr/td[1]/a/img");
	public WebElement getMasterDataPluseButton() {
		return getElement(MasterDataPluseButton);
	}
	private By MobileAppReportsPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[9]/tbody/tr/td[1]/a/img");
	public WebElement getMobileAppReportsPluseButton() {
		return getElement(MobileAppReportsPluseButton);
	}
	private By MonthlyStateReportsPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[10]/tbody/tr/td[1]/a/img");
	public WebElement getMonthlyStateReportsPluseButton() {
		return getElement(MonthlyStateReportsPluseButton);
	}
	private By OTReportsReportsPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[11]/tbody/tr/td[1]/a/img");
	public WebElement getOTReportsReportsPluseButton() {
		return getElement(OTReportsReportsPluseButton);
	}
	private By ReferencePluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[12]/tbody/tr/td[1]/a/img");
	public WebElement getReferencePluseButton() {
		return getElement(ReferencePluseButton);
	}
	private By StatitsticsReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[13]/tbody/tr/td[1]/a/img");
	public WebElement getStatitsticsReportPluseButton() {
		return getElement(StatitsticsReportPluseButton);
	}
	private By StoreReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[14]/tbody/tr/td[1]/a/img");
	public WebElement getStoreReportPluseButton() {
		return getElement(StoreReportPluseButton);
	}
	private By SuperSpecialityPatientRefferelReportPluseButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[15]/tbody/tr/td[1]/a/img");
	public WebElement getSuperSpecialityPatientRefferelReportPluseButton() {
		return getElement(SuperSpecialityPatientRefferelReportPluseButton);
	}
	
	private By PageUpdatePrograss=By.xpath("//*[@id='ctl00_ctl00_PageUpdateProgress']");
	
	public WebElement getPageUpdatePrograss() {
		return getElement(PageUpdatePrograss);
	}
	private By YearTextBox=By.id("ctl00_ctl00_cphpage_cphReport_txt_year");
	public WebElement getYearTextBox() {
		return getElement(YearTextBox);
	}
	private By EmpanalStateDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlP1State");
	public WebElement getEmpanalStateDLL() {
		return getElement(EmpanalStateDLL);
	}
	private By NameCodeIMP_mEUDDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlList2");
	public WebElement getNameCodeIMP_mEUDDLLDLL() {
		return getElement(NameCodeIMP_mEUDDLL);
	}
	private By LocationDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlP1State");
	public WebElement getLocationDLL() {
		return getElement(LocationDLL);
	}
	private By LocationNameDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlList1");
	public WebElement getLocationNameDLL() {
		return getElement(LocationNameDLL);
	}
	private By ReportTypeDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlempreftype");
	public WebElement getReportTypeDLL() {
		return getElement(ReportTypeDLL);
	}
	private By ReportNameDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddl_ReportName");
	public WebElement getReportNameDLL() {
		return getElement(ReportNameDLL);
	}
	private By LGDStateDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlPresentLGDState");
	public WebElement getLGDStateDLL() {
		return getElement(LGDStateDLL);
	}
	private By LGDDistrictDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlPresentLGDDistrict");
	public WebElement getLGDDistrictDLL() {
		return getElement(LGDDistrictDLL);
	}
	private By LGDSubDistrictDLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlPresentLGDSubDistrict");
	public WebElement getLGDSubDistrictDLL() {
		return getElement(LGDSubDistrictDLL);
	}
	private By FromDateTextBox=By.id("ctl00_ctl00_cphpage_cphReport_txtFromDate");
	public WebElement getFromDateTextBox() {
		return getElement(FromDateTextBox);
	}
	private By ToDateTextBox=By.id("ctl00_ctl00_cphpage_cphReport_txtToDate");
	public WebElement geToDateTextBox() {
		return getElement(ToDateTextBox);
	}
	private By DispanseryFromDateTextBox=By.id("ctl00_ctl00_cphpage_cphReport_txt_FromDate1");
	public WebElement getDispanseryFromDateTextBox() {
		return getElement(DispanseryFromDateTextBox);
	}
	private By DispanseryToDateTextBox=By.id("ctl00_ctl00_cphpage_cphReport_txt_ToDate1");
	public WebElement getDispanseryToDateTextBox() {
		return getElement(DispanseryToDateTextBox);
	}
	private By DispanseryStateDll=By.id("ctl00_ctl00_cphpage_cphReport_ddl_State1");
	public WebElement getDispanseryStateDll() {
		return getElement(DispanseryStateDll);
	}
	private By DispanseryLocationTypeDll=By.id("ctl00_ctl00_cphpage_cphReport_ddl_LocationType1");
	public WebElement getDispanseryLocationTypeDll() {
		return getElement(DispanseryLocationTypeDll);
	}
	private By DispanseryLocationNameDll=By.id("ctl00_ctl00_cphpage_cphReport_ddl_LocationName1");
	public WebElement getDispanseryLocationNameDll() {
		return getElement(DispanseryLocationNameDll);
	}
	
	
	
	
	
}
