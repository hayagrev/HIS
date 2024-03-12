package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.Medical_Birth_Registration_Pages;
import com.qa.pages.Medical_Death_Record_Pages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Medical_Death_Record_Test extends CrossBrowser {
	public Medical_Death_Record_Test() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Medical_Death_Record_Pages MedicalDeathRecordPages;
	Medical_Birth_Registration_Pages MBRP;
	String Admmission;
	String UHID;

	@Test(priority =0)
	public void doLoginTest_01() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));	

	}	
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest_02() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
//	@Test(priority = 2)
//	@Parameters("browser")
//	public void changeHospitalLocationTest(String Browser) throws InterruptedException {
//		
//		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
//	}
//		@Test(priority = 3)
//		@Parameters("browser")
//public void CreateUHIDforPatient(String Browser) throws InterruptedException {
//		MBRP=hishomepage.donavigatetoUHidCreateForBirthRegistration();
//		MBRP.testcaseforUHID(prop.getProperty("Titlefemale"),prop.getProperty("FirstName"),prop.getProperty("LastName"),
//				prop.getProperty("MaritalStatus"),prop.getProperty("Age"),prop.getProperty("Address"),Browser);
//		UHID=MBRP.testcasegetUhid();
//		}
//		@Test(priority = 4)
//		@Parameters("browser")
//		public void PatientadmissionForMother(String Browser) throws InterruptedException {
//		MBRP.testcaseforPatientAdmission(UHID,Browser);
//		Admmission=MBRP.getAdmissionNO();
//		}
//		@Test(priority = 5)
//		@Parameters("browser")
//		public void InpatientServicerForMother(String Browser) throws InterruptedException {
//			
//	MBRP.testcaseforINPAtientMangement(Browser);
//	
//		}
//		@Test(priority = 6)
//		@Parameters("browser")
//		public void testcaseforpatientDescharge(String Browser) throws InterruptedException {
//			MBRP.testcaseforpatientDescharge(Admmission,Browser);
//		}
	@Test(priority = 2)
	@Parameters("browser")
	public void dotestMedicalRecordDeathRegistration_TC_03(String Browser) throws InterruptedException {
		
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameMedicalRecordDepartment"),Browser);
		MedicalDeathRecordPages=hishomepage.donavigatetoMedical_Death_Record_Pages();
		//MedicalDeathRecordPages.testcase_for_MedicalDeathRecordPages(Admmission);
		Thread.sleep(2000);
		MedicalDeathRecordPages.getDeath_Record_admission_searchimg().click();
		Thread.sleep(2000);
		MedicalDeathRecordPages.getDeath_Record_admissionNo_searchbox().sendKeys("IP0");
		Thread.sleep(2000);
		MedicalDeathRecordPages.getDeath_Record_admissionNo_searchbutton().click();
		Thread.sleep(2000);
		MedicalDeathRecordPages.getDeath_Record_admissionsearch_checkbox().click();
		Thread.sleep(2000);
		MedicalDeathRecordPages.getDeath_Record_admission_selectbutton().click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnModify")).click();
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("/html/body/div[2]/div[1]/img"))));
		
//		ctl00_cphpage_MyMessageBoxInfo_ButtonOK
//		ctl00_cphpage_btnModify
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
//		  Calendar cal = Calendar.getInstance();
//		String Date = sdf.format(cal.getTime());
//		  System.out.println(Date);
//		  Thread.sleep(4000);
//		  cal.add(Calendar.DAY_OF_MONTH, 1);
//		  String newDate = sdf.format(cal.getTime());
//		  System.out.println(newDate);
//		  Thread.sleep(2000);
//		 // utilobj.JSEnterText(getDeath_Record_TimeOfDeath(), driver, Date);
//		  driver.findElement(By.id("ctl00_cphpage_ChkUnknown")).click();
//		  Thread.sleep(2000); 
//		  MedicalDeathRecordPages.getDeath_Record_autopsycheckbox().click();
//		Thread.sleep(2000);
//		MedicalDeathRecordPages.getDeath_Record_DoctorSearchIMG().click();
//		Thread.sleep(2000);
//		MedicalDeathRecordPages.getDeath_Record_EmpNO().sendKeys("1122332");
//		Thread.sleep(2000);
//		MedicalDeathRecordPages.getDeath_Record_BtnSearch().click();
//		Thread.sleep(2000);
//		MedicalDeathRecordPages.getDeath_Record_DoctorRadioButton().click();
//		Thread.sleep(2000);
//		MedicalDeathRecordPages.getDeath_Record_DoctorSearchSelect().click();
//		Thread.sleep(2000);
////		getDeath_Record_PrintButton().click();
////		Thread.sleep(2000);
//		MedicalDeathRecordPages.getDeath_Record_SavetButton().click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
//		Thread.sleep(2000);
//		String Certification_no=MedicalDeathRecordPages.getDeath_Record_CertificationNO().getText();
//		Thread.sleep(2000);
//		System.out.println(Certification_no);
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