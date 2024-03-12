package com.qa.HIS.BrowserCompatibility_HIS;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MISReportPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class MISReportTest extends CrossBrowser{
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MISReportPages MRP;
	String ReportName;
	util utilobj=new util();
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
	}
	
	
	@Test(priority = 3)
	public void doNavigateMISReportLinkTest() {

		MRP = hishomepage.donavigatetoMISReportPageLINK();
	}

	
//	  @Test(priority = 4)
//	  public void MIS_TC_01() throws InterruptedException {
//	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
//	  MRP.getAAAMobileAppReportPluseButton().click(); for(int i=1;i<=9;i++) {
//	  ReportName=driver.findElement(By.id(
//	  "ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//	  System.out.println(ReportName); if(ReportName.equals("List of Holidays")) {
//	  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).
//	  click();
//	  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//	  Thread.sleep(1000); MRP.getYearTextBox().sendKeys("2022");
//	  Thread.sleep(1000); MRP.getButtonPreview().click();
//	  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//	  Thread.sleep(1000); MRP.getAAAMobileAppReportPluseButton().click();
//	  
//	  } else {
//	  
//	  
//	  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).
//	  click();
//	  
//	  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//	  Thread.sleep(1000); MRP.getButtonPreview().click();
//	  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//	  Thread.sleep(1000); MRP.getAAAMobileAppReportPluseButton().click(); }} }
//	 
//@Test(priority = 5)
//@Parameters("browser")
//public void MIS_TC_02(String Browser) throws InterruptedException
//{
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//	MRP.getDispensryReprtPluseButton().click();
//	for(int i=11;i<=25;i++) {
//		ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//		System.out.println(ReportName);
//		if(ReportName.equals("Diagnosis wise Census report")||ReportName.equals("MIS - BED Occupancy Report")||ReportName.equals("MIS-Inpatient Department wise procedure performed")||ReportName.equals("Monthly Report for Department wise OPD Attendance")) {
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getButtonPreview().click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getDispensryReprtPluseButton().click();
//		}
//		
//		else if (ReportName.equals("Super Speciality Patient Referrals")) {
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//		utilobj.selectDropdown(MRP.getEmpanalStateDLL(), driver, "Delhi", Browser);
//		Thread.sleep(3000);
//			utilobj.selectDropdown(MRP.getLocationDLL(),driver, "ESIC Hospital & Dental College,Rohini", Browser);
//			Thread.sleep(1000);
//			utilobj.selectDropdown(MRP.getReportTypeDLL(), driver, "Consultative", Browser);
//			Thread.sleep(1000);
//			MRP.getButtonPreview().click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getDispensryReprtPluseButton().click();
//		}
//		else {
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getYearTextBox().sendKeys("2022");
//			Thread.sleep(1000);
//			MRP.getButtonPreview().click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getDispensryReprtPluseButton().click();
//		}
//	}
//}
//@Test(priority =6 )
//	public void MIS_TC_03() throws InterruptedException
//	{
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//		MRP.getGroupPluseButton().click();
//		for(int i=27;i<=34;i++) {
//			ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//			System.out.println(ReportName);
//			if(ReportName.equals("Investigation Report DepartmentWise")) {
//				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//				Thread.sleep(1000);
//				MRP.getYearTextBox().sendKeys("2022");
//				Thread.sleep(1000);
//				MRP.getButtonPreview().click();
//				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//				Thread.sleep(1000);
//				MRP.getGroupPluseButton().click();
//			}
//			else
//			{
//				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//				Thread.sleep(1000);
//				MRP.getButtonPreview().click();
//				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//				Thread.sleep(1000);
//				MRP.getGroupPluseButton().click();
//			}
//		}
//		
//	}
//	
//@Test(priority = 7)
//public void MIS_TC_04() throws InterruptedException {
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//	MRP.getHospitalReportPluseButton().click();
//	for(int i=36;i<=77;i++) {
//		ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//		System.out.println(ReportName);
//		if(ReportName.equals("Statistics on Death Occurring beyond 48 hours of Admission")||ReportName.equals("MIS - Daily Census")||ReportName.equals("Monthly Report for Department of Blood Bank-Blood type and Out of stock days")) {
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getButtonPreview().click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getHospitalReportPluseButton().click();
//		}
//		else {
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getYearTextBox().sendKeys("2022");
//			MRP.getButtonPreview().click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getHospitalReportPluseButton().click();
//		}
//		
//	}
//}
//
//@Test(priority = 8)
//@Parameters("browser")
//public void MIS_TC_05(String Browser) throws InterruptedException {
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//	MRP.getIMP_mEUDReportsPluseButtonPluseButton().click();
//	for(int i=79;i<=80;i++) {
//		ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//		System.out.println(ReportName);
//		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		Thread.sleep(1000);
//		utilobj.selectDropdown(MRP.getEmpanalStateDLL(), driver, "Delhi", Browser);
//		Thread.sleep(2000);
//		utilobj.selectDropdown(MRP.getNameCodeIMP_mEUDDLLDLL(), driver, "IMP/DL/11/39 - Final Test", Browser);
//		Thread.sleep(2000);
//		MRP.getButtonPreview().click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		Thread.sleep(1000);
//		MRP.getIMP_mEUDReportsPluseButtonPluseButton().click();
//
//	}
//}
//@Test(priority = 9)
//public void MIS_TC_06() throws InterruptedException {
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//	MRP.getInpatientAdmissionReportPluseButton().click();
//	for(int i=82;i<=102;i++) {
//		ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//		System.out.println(ReportName);
//		if(ReportName.equals("MIS-Inpatient-Statistics-Monthly Day Wise")||ReportName.equals("MIS-Inpatient-Statistics-Monthly Week Wise")||ReportName.equals("MIS-Inpatient-Statistics-Quarterly Month Wise")||ReportName.equals("MIS-Inpatient-Statistics-Quarterly week wise")||ReportName.equals("MIS-Inpatient-Statistics-Yearly Month Wise")||ReportName.equals("MIS-Inpatient-Statistics-Yearly Quarter Wise")) {
//			
//		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		Thread.sleep(1000);
//		MRP.getYearTextBox().sendKeys("2022");
//		Thread.sleep(1000);
//		MRP.getButtonPreview().click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		Thread.sleep(1000);
//		MRP.getInpatientAdmissionReportPluseButton().click();
//	}
//	
//	else {
//		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		MRP.getButtonPreview().click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		Thread.sleep(1000);
//		MRP.getInpatientAdmissionReportPluseButton().click();
//	}
//}}
//@Test(priority = 10)
//@Parameters("browser")
//public void MIS_TC_07(String Browser) throws InterruptedException {
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//	MRP.getLGDReportPluseButton().click();
//	for(int i=104;i<=109;i++) {
//		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		Thread.sleep(1000);
//		utilobj.selectDropdown(MRP.getLGDStateDLL(), driver, "Delhi", Browser);
//		Thread.sleep(2000);
//		utilobj.selectDropdown(MRP.getLGDDistrictDLL(), driver, "North West", Browser);
//		Thread.sleep(2000);
//		utilobj.selectDropdown(MRP.getLGDSubDistrictDLL(), driver, "Rohini", Browser);
//		Thread.sleep(2000);
//		MRP.getButtonPreview().click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		Thread.sleep(1000);
//		MRP.getLGDReportPluseButton().click();
//	}
//	
//}
//	@Test(priority = 11)
//	public void MIS_TC_08() throws InterruptedException {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//		MRP.getMasterDataPluseButton().click();
//		for(int i=111;i<=119;i++) {
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getButtonPreview().click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getMasterDataPluseButton().click();
//			
//		}
//		
//		
//	}
//	@Test(priority = 12)
//	public void MIS_TC_09() throws InterruptedException
//	{
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//		MRP.getMobileAppReportsPluseButton().click();
//		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst121")).click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		Thread.sleep(1000);
//		utilobj.JSEnterText(MRP.getFromDateTextBox(), driver, "18-May-2022");
//		
//		Thread.sleep(1000);
//		utilobj.JSEnterText(MRP.geToDateTextBox(), driver, "19-May-2022");
//		
//		Thread.sleep(1000);
//		MRP.getButtonPreview().click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		
//	}
//	
//	@Test(priority = 13)
//	public void MIS_TC_10() throws InterruptedException
//	{
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//		MRP.getMonthlyStateReportsPluseButton().click();
//		for(int i=123;i<=126;i++) {
//		ReportName=	driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//		if(ReportName.equals("OPD specialization wise and service wise cost to patient")) {
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(2000);
//			MRP.getYearTextBox().sendKeys("2022");
//			Thread.sleep(2000);
//MRP.getButtonPreview().click();
//wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//Thread.sleep(2000);
//MRP.getMonthlyStateReportsPluseButton().click();
//		}
//else {
//	driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//	wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//	Thread.sleep(2000);
//	MRP.getButtonPreview().click();
//	wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//	Thread.sleep(2000);
//	MRP.getMonthlyStateReportsPluseButton().click();
//}}
//		
//	}
//	
//	@Test(priority = 14)
//	public void MIS_TC_11() throws InterruptedException {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//		MRP.getOTReportsReportsPluseButton().click();
//		for(int i=128;i<=130;i++) {
//			ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(2000);
//			MRP.getButtonPreview().click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(2000);
//			MRP.getOTReportsReportsPluseButton().click();
//		}
//		
//	}
//	
//	@Test(priority = 15)
//	public void MIS_TC_12() throws InterruptedException {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//		MRP.getReferencePluseButton().click();
//		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst132")).click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		MRP.getButtonPreview().click();
//		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//		
//	}
//	@Test(priority = 16)
//	public void MIS_TC_13() throws InterruptedException {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//		MRP.getStatitsticsReportPluseButton().click();
//		for(int i=134;i<=157;i++) {
//			ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//			if(ReportName.equals("OccupancyRegister-Xrays")) {
//				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//				MRP.getButtonPreview().click();
//				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//				MRP.getStatitsticsReportPluseButton().click();
//			}
//			else {
//				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//				Thread.sleep(2000);
//				MRP.getYearTextBox().sendKeys("2022");
//				MRP.getButtonPreview().click();
//				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//				Thread.sleep(2000);
//				MRP.getStatitsticsReportPluseButton().click();
//			}
//			
//		}
//	}
//	@Test(priority = 17)
//	public void MIS_TC_14() throws InterruptedException {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
//		MRP.getStoreReportPluseButton().click();
//		for(int i=159;i<=169;i++) {
//			ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(1000);
//			MRP.getButtonPreview().click();
//			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//			Thread.sleep(2000);
//			MRP.getStoreReportPluseButton().click();
//		}
//	}
/*@Test(priority = 18)
@Parameters("browser")
public void MIS_TC_15(String Browser) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	MRP.getSuperSpecialityPatientRefferelReportPluseButton().click();
	for(int i=171;i<=172;i++) {
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		utilobj.selectDropdown(MRP.getEmpanalStateDLL(), driver, "Delhi", Browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(MRP.getLocationNameDLL(), driver, "ESIC Hospital & Dental College,Rohini", Browser);
		Thread.sleep(3000);
		MRP.getButtonPreview().click();
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		MRP.getSuperSpecialityPatientRefferelReportPluseButton().click();
		
	}
	
}
*/

//  @Test(priority = 19)
//  
//  @Parameters("browser") 
//  public void MIS_TC_16(String Browser) throws InterruptedException { 
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(4));
//	  for(int i=175;i<=205;i++) {
//  ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getText();
//  if(ReportName.equals("Duty Roster Report")||ReportName.equals("Month wise / Location wise OD case count")||ReportName.equals("OPD Break up patient wise service wise Report")) {
//  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).
//  click();
//  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//  Thread.sleep(1000);
//  MRP.getYearTextBox().sendKeys("2022");
//  Thread.sleep(2000); 
// // utilobj.JSClick(MRP.getButtonPreview(), driver);
//  MRP.getButtonPreview().click();
//  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss())); }
////  else if (ReportName.equals("2 Dispensary Reports")) {
////  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
////  Thread.sleep(1000); 
////  utilobj.selectDropdown(MRP.getReportNameDLL(),driver, "Dispensary Wise IP/Family Count Report", Browser);
////  Thread.sleep(2000);
////  MRP.getDispanseryFromDateTextBox().sendKeys("19-May-2022");
////  Thread.sleep(1000); 
////  MRP.getDispanseryToDateTextBox().sendKeys("24-May-2022");
////  Thread.sleep(1000); 
////  utilobj.selectDropdown(MRP.getDispanseryStateDll(),driver, "Delhi", Browser); 
////  Thread.sleep(1000);
////  utilobj.selectDropdown(MRP.getDispanseryLocationTypeDll(), driver,"ESIC Dispensary", Browser); 
////  Thread.sleep(1000);
////  utilobj.selectDropdown(MRP.getDispanseryLocationNameDll(), driver,"Rohini Sec-V, DL (ESIC Disp.)", Browser);
////  Thread.sleep(2000);
////  MRP.getButtonPreview1().click(); Thread.sleep(2000);
////  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
////  
////  
////  
////  
////  
////  }
//  else {
//  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).
//  click();
//  
//  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
//  Thread.sleep(2000); 
// // utilobj.JSClick(MRP.getButtonPreview(), driver);
//  MRP.getButtonPreview().click();
//  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss())); }
//  
//  }
//}
	
 
@Test(priority = 19)
@Parameters("browser")
public void MIS_TC_19(String Browser) {
	driver.findElement(By.linkText("Summery of Requests for Home Sample Collection")).click();
	
}

}

