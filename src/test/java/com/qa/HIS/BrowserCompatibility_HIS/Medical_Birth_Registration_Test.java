package com.qa.HIS.BrowserCompatibility_HIS;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.Medical_Birth_Registration_Pages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Medical_Birth_Registration_Test extends CrossBrowser {
	public Medical_Birth_Registration_Test() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Medical_Birth_Registration_Pages MBRP;
	String Admmission;
	String UHID;
	String Child_UHID;
	String typevalue;
	String admissionNumber;
	String AdmissionNo;
	String AlertInfo;
	String MotherAdmissionDate;
	String MotherName;
	String MotherUHIDNo;
	String MotherIPnumber;
	int flag=0;
	@Test(priority =0)
	public void doLoginTest_01() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));	

	}
	
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest_02() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	@Test(priority = 2)
	@Parameters("browser")
	public void changeHospitalLocationTest_03(String Browser) throws InterruptedException {
		
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
	}
	@Test(priority = 3)
	@Parameters("browser")
	public void To_ChecktheFunctionalityOfFatchtheDetail_04(String Browser) throws IOException, InterruptedException {
		MBRP=hishomepage.donavigatetoPatientadmissionForMother();
		  Thread.sleep(3000);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now)); 
		   //System.out.println(dtf.format(now).substring(0, 2));
		 String CurrentDate=(dtf.format(now).substring(0, 2));
		  
		 
		 System.out.println(CurrentDate);
		  Thread.sleep(2000);
		MBRP.getAdmission_NewBornCheckBox().click();//EMR022300001
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		Thread.sleep(2000);
		utilobj.Window(driver);
		Thread.sleep(4000);
		MBRP.getAdmission_NewBornImage().click();
		Thread.sleep(8000);
		utilobj.ChildWindow(driver);
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		MBRP.getNewBornSearchImageButton().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ucCommonSearch_hisSearchCriteria_dlData_ctl01_ddlCriteria")), driver, "Equals", Browser);
		Thread.sleep(2000);
		MBRP.getMotherAdmissionNoTextBox().sendKeys("IP032300006");//IP022300081 EMR022300001 	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		MBRP.getMotherAdmissionNoSearchButton().click();
		wait.until(ExpectedConditions.invisibilityOf(MBRP.getProcessImage()));
		MBRP.getMotherAdmissionRadioButton().click();
		Thread.sleep(2000);
		MBRP.getMotherAdmissionSelectButton().click();
		wait.until(ExpectedConditions.invisibilityOf(MBRP.getProcessImage()));
		Thread.sleep(2000);
		MotherAdmissionDate=MBRP.getMotherAdmissionDateTextBox().getAttribute("value");
		Thread.sleep(2000);
		MotherName=MBRP.getMotherNameTextBox().getAttribute("value");
		Thread.sleep(2000);
		MotherUHIDNo=MBRP.getMotherUHIDNoTextBox().getAttribute("value");
		Thread.sleep(2000);
		MotherIPnumber=MBRP.getMotherIPNumberTextBox().getAttribute("value");
		Thread.sleep(2000);
		System.out.println(MotherAdmissionDate+" "+MotherName+" "+MotherUHIDNo+" "+MotherIPnumber);
		Thread.sleep(2000);
		MBRP.getRadioButtonOutsideESICHospital().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(MBRP.getBabyGenderDDL(), driver, "Male", Browser);
		Thread.sleep(2000);  
		utilobj.JSEnterText(MBRP.getBabyDOBL(), driver,dtf.format(now));
		Thread.sleep(2000);
		MBRP.getBabyAdmissionOkButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(10000);
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void To_ChecktheFunctionalityoFBabyAdmission_05(String Browser) throws IOException, InterruptedException {
		Thread.sleep(2000);		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		utilobj.JSClick(MBRP.getPermanentSameAsPresentRadiobutton(), driver);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(MBRP.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(MBRP.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(MBRP.getddlSpecialisation(), driver, "General Medicine",Browser);
		Thread.sleep(10000);
		utilobj.selectDropdown(MBRP.getddlUnit(), driver, "Medicine",Browser);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(MBRP.getWardtypeddl(), driver, "Female medical ward", Browser);
	
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		MBRP.getBtnSave().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
		Thread.sleep(2000);
		AdmissionNo=MBRP.getAdmissionTextbox().getAttribute("value");
		Child_UHID=driver.findElement(By.id("ctl00_cphpage_txtUHID")).getAttribute("value");
		System.out.println(AdmissionNo+"and"+Child_UHID);
		Thread.sleep(2000);
	}
	/*
	 * @Test(priority = 3)
	 * 
	 * @Parameters("browser") public void CreateUHIDforMother(String Browser) throws
	 * InterruptedException {
	 * MBRP=hishomepage.donavigatetoUHidCreateForBirthRegistration(); Random F=new
	 * Random(); int Num=F.nextInt(1000); System.out.println("Random ="+Num); String
	 * name=Integer.toString(Num); Thread.sleep(2000); Random L=new Random(); int
	 * Num1=L.nextInt(1000); System.out.println("Random ="+Num1); String
	 * Lname=Integer.toString(Num1); Thread.sleep(2000);
	 * utilobj.selectDropdown(MBRP.getTitle(), driver, "Mrs.",Browser);
	 * Thread.sleep(3000);
	 * MBRP.getFirstName().sendKeys(prop.getProperty("FirstName")+name);
	 * Thread.sleep(3000);
	 * MBRP.getLastName().sendKeys(prop.getProperty("LastName")+Lname);
	 * 
	 * driver.findElement(By.id("ctl00_cphpage_ddlGender")).sendKeys("Female");
	 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	 * //System.out.println(MaritalStatus1 + getMarriageStatus());
	 * Thread.sleep(3000); utilobj.selectDropdown(MBRP.getMarriageStatus(), driver,
	 * "Married",Browser); Thread.sleep(3000);
	 * MBRP.getAge().sendKeys(prop.getProperty("Age")); Thread.sleep(3000);
	 * MBRP.getPresentAddres().sendKeys(prop.getProperty("Address"));
	 * Thread.sleep(3000); utilobj.selectDropdown(driver.findElement(By.id(
	 * "ctl00_cphpage_ddlPresentLGDState")), driver, "Maharashtra",Browser);
	 * Thread.sleep(2000);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
	 * "/html/body/div[2]/div[1]/img"))); Thread.sleep(4000);
	 * utilobj.selectDropdown(driver.findElement(By.id(
	 * "ctl00_cphpage_ddlPresentLGDDistrict")), driver, "Mumbai",Browser);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
	 * "/html/body/div[2]/div[1]/img"))); Thread.sleep(2000);
	 * driver.findElement(By.id("ctl00_cphpage_txtPincode")).sendKeys("230532");
	 * 
	 * Thread.sleep(2000); MBRP.getSavebutton().click(); //Thread.sleep(3000);
	 * //MBRP.getbtnYes().click(); Thread.sleep(1000);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
	 * "/html/body/div[2]/div[1]/img"))); Thread.sleep(1000);
	 * utilobj.ActionClick(driver.findElement(By.id("ctl00_cphpage_btnOK11")),
	 * driver); Thread.sleep(3000);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(
	 * "ctl00_cphpage_btnOK11")));
	 * 
	 * //UHID=MBRP.testcasegetUhid();
	 * UHID=MBRP.getUHID_TextBox().getAttribute("value"); Thread.sleep(3000);
	 * System.out.println(UHID); }
	 * 
	 * @Test(priority = 4)
	 * 
	 * @Parameters("browser") public void PatientadmissionForMother(String Browser)
	 * throws InterruptedException { // Thread.sleep(3000); //
	 * utilobj.MoveElement(MBRP.getregistrationLink(), driver); Thread.sleep(3000);
	 * // utilobj.JSClick(MBRP.getpatientAdmission(), driver);
	 * MBRP=hishomepage.donavigatetoPatientadmissionForMother(); Thread.sleep(3000);
	 * //search by uhid MBRP.getpatientAdmission_UHIDImgSearch().click();
	 * Thread.sleep(3000);
	 * MBRP.getpatientAdmission_UHIDSearchPOPTXTBOX().sendKeys(UHID);
	 * Thread.sleep(3000);
	 * MBRP.getpatientAdmission_UHIDSearchButtonSearch().click();
	 * Thread.sleep(3000); MBRP.getpatientAdmission_UHIDRadioButtonBox().click();
	 * Thread.sleep(3000); MBRP.getpatientAdmission_UHIDSearchBTNSelect().click();
	 * Thread.sleep(4000);
	 * MBRP.getpatientAdmission_permanantsameaspresent().click();
	 * Thread.sleep(3000); utilobj.selectDropdown(MBRP.getDdlAdmissionType(),
	 * driver, "On Transfer/Referral",Browser); Thread.sleep(3000);
	 * utilobj.selectDropdown(MBRP.getDdlAdmissionSrc(), driver,
	 * "Transferred from a private hospital",Browser); Thread.sleep(3000);
	 * utilobj.selectDropdown(MBRP.getddlSpeciallization(), driver,
	 * "General Medicine",Browser); Thread.sleep(4000);
	 * utilobj.selectDropdown(MBRP.getddlUnit(), driver, "Medicine",Browser);
	 * Thread.sleep(4000); utilobj.selectDropdown(MBRP.getddlwardType(), driver,
	 * "Female medical ward",Browser); Thread.sleep(4000);
	 * MBRP.getpatientAdmission_SaveButton().click(); Thread.sleep(3000);
	 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	 * 
	 * MBRP.getpatientAdmission_informationOKButton().click(); Thread.sleep(1000);
	 * wait.until(ExpectedConditions.invisibilityOf(MBRP.
	 * getpatientAdmission_informationOKButton())); Thread.sleep(3000);
	 * 
	 * MBRP.getpatientAdmission_succesokbutton().click();
	 * 
	 * Thread.sleep(1000); wait.until(ExpectedConditions.invisibilityOf(MBRP.
	 * getpatientAdmission_succesokbutton())); Thread.sleep(1000);
	 * //MBRP.testcaseforPatientAdmission(UHID,Browser);
	 * Admmission=MBRP.getAdmissionNO(); }
	 * 
	 * @Test(priority = 5)
	 * 
	 * @Parameters("browser") public void InpatientServicerForMother(String Browser)
	 * throws InterruptedException {
	 * 
	 * MBRP.testcaseforINPAtientMangement(Browser); MBRP.getchangeLocation(); }
	 * 
	 * @Test(priority = 6)
	 * 
	 * @Parameters("browser") public void NavigatetoRegistration(String Browser)
	 * throws InterruptedException {
	 * 
	 * hishomepage =
	 * selecthospitallocationpage.doNavigateToHISHome(prop.getProperty(
	 * "locationName"), prop.getProperty("facilityName"),Browser);
	 * MBRP=hishomepage.donavigatetoUHidCreateForBirthRegistration();
	 * 
	 * }
	 * 
	 * @Test(priority = 7)
	 * 
	 * @Parameters("browser") public void CreateUhidForChild(String Browser) throws
	 * InterruptedException { WebDriverWait wait=new WebDriverWait(driver,
	 * Duration.ofMinutes(5));
	 * 
	 * // hishomepage =
	 * selecthospitallocationpage.doNavigateToHISHome(prop.getProperty(
	 * "locationName"), prop.getProperty("facilityName"));
	 * //MBRP=hishomepage.donavigatetoUHidCreateForBirthRegistration(); //
	 * MBRP.testcaseforUHIDForChild(prop.getProperty("TitleBaby"),prop.getProperty(
	 * "FirstName"),prop.getProperty("LastName"), //
	 * prop.getProperty("MaritalStatus"),prop.getProperty("1"),prop.getProperty(
	 * "Address"),Browser); Thread.sleep(3000); Random F=new Random(); int
	 * Num=F.nextInt(2000); System.out.println("Random ="+Num); String
	 * name=Integer.toString(Num); Thread.sleep(2000); Random L=new Random(); int
	 * Num1=L.nextInt(1000); System.out.println("Random ="+Num1); String
	 * Lname=Integer.toString(Num1); Thread.sleep(2000);
	 * utilobj.selectDropdown(MBRP.getTitle(), driver, "Baby",Browser);
	 * Thread.sleep(3000);
	 * MBRP.getFirstName().sendKeys(prop.getProperty("FirstName")+name);
	 * Thread.sleep(3000);
	 * MBRP.getLastName().sendKeys(prop.getProperty("LastName")+Lname);
	 * 
	 * 
	 * 
	 * //System.out.println(MaritalStatus1 + getMarriageStatus());
	 * Thread.sleep(3000); utilobj.selectDropdown(MBRP.getMarriageStatus(), driver,
	 * "Single",Browser); Thread.sleep(3000); MBRP.getAge().sendKeys("30");
	 * Thread.sleep(3000);
	 * driver.findElement(By.id("ctl00_cphpage_ddlAgeUnit")).sendKeys("Minutes");
	 * Thread.sleep(3000);
	 * driver.findElement(By.id("ctl00_cphpage_ddlGender")).sendKeys("Femail");
	 * Thread.sleep(3000);
	 * MBRP.getPresentAddres().sendKeys(prop.getProperty("Address"));
	 * Thread.sleep(3000); utilobj.selectDropdown(driver.findElement(By.id(
	 * "ctl00_cphpage_ddlPresentLGDState")), driver, "Maharashtra",Browser);
	 * Thread.sleep(2000);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
	 * "/html/body/div[2]/div[1]/img"))); Thread.sleep(4000);
	 * utilobj.selectDropdown(driver.findElement(By.id(
	 * "ctl00_cphpage_ddlPresentLGDDistrict")), driver, "Mumbai",Browser);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
	 * "/html/body/div[2]/div[1]/img"))); Thread.sleep(2000);
	 * driver.findElement(By.id("ctl00_cphpage_txtPincode")).sendKeys("230532");
	 * 
	 * Thread.sleep(2000); MBRP.getSavebutton().click(); //Thread.sleep(3000);
	 * //MBRP.getbtnYes().click(); Thread.sleep(1000);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
	 * "/html/body/div[2]/div[1]/img"))); Thread.sleep(1000);
	 * utilobj.ActionClick(driver.findElement(By.id("ctl00_cphpage_btnOK11")),
	 * driver); Thread.sleep(3000);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(
	 * "ctl00_cphpage_btnOK11")));
	 * 
	 * Child_UHID=MBRP.getUHID_TextBox().getAttribute("value"); Thread.sleep(3000);
	 * System.out.println(Child_UHID);
	 * 
	 * 
	 * 
	 * }
	 */
			
			@Test(priority = 5)
			@Parameters("browser")
			public void testcaseforBirthRegistration_06(String Browser) throws InterruptedException {
				MBRP.getchangeLocation();
				hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameMedicalRecordDepartment"),Browser);
				MBRP=hishomepage.donavigatetoMedical_Birth_Registration_Pages();
			//MBRP.testCaseForBirthRegistration(AdmissionNo,Child_UHID,Browser);
			Thread.sleep(1000);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
			//wait.until(ExpectedConditions.invisibilityOf(MBRP.getProcessImage1()));
			
			MBRP.getBirth_register_MotherDetail_Admission().click();
			Thread.sleep(2000);
			MBRP.getBirth_register_MotherDetail_Admission_searchTextxbox().sendKeys("IP032300006");
			Thread.sleep(2000);
			MBRP.getBirth_register_MotherDetail_Admission_searchButton().click();
			wait.until(ExpectedConditions.visibilityOf(MBRP.getBirth_register_MotherDetail_Admission_radioButton()));
			Thread.sleep(2000);
			MBRP.getBirth_register_MotherDetail_Admission_radioButton().click();
			Thread.sleep(2000);
			utilobj.JSClick(MBRP.getBirth_register_MotherDetail_Admission_selectButton(),driver);
			Thread.sleep(1000);
			//wait.until(ExpectedConditions.invisibilityOf(MBRP.getProcessImage1()));
			//getBirth_register_MotherDetail_Admission_selectButton().click();
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlBabyUHID")), driver, Child_UHID, Browser);
			Thread.sleep(20000);
			utilobj.selectDropdown(MBRP.getBirth_register_methodofDelivery(), driver, "Normal",Browser);
			Thread.sleep(2000);
			MBRP.getBirth_register_HPD_Place_of_birth().sendKeys("TEST ESIC Hospital");
			Thread.sleep(2000);
			utilobj.selectDropdown(MBRP.getBirth_registr_HPD_DCB(), driver, "Medical Officer",Browser);
			Thread.sleep(2000);
			MBRP.getBirth_registr_BabyDetail_Weigth().sendKeys("2");
			Thread.sleep(2000);
			MBRP.getBirth_registr_BabyDetail_WeigthGm().sendKeys("600");	
			Thread.sleep(2000);
			MBRP.getBirth_register_birthsequence().clear();
			Thread.sleep(2000);
			MBRP.getBirth_register_birthsequence().sendKeys("1");
			Thread.sleep(2000);
			MBRP.getBirth_register_medicalofficername().sendKeys("Dr Test.");
			Thread.sleep(2000);
			
			
			
//			driver.findElement(By.id("ctl00_cphpage_imgbtnbabyUHID")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys(Child_UHID);
//			Thread.sleep(2000);
//			driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
//			Thread.sleep(4000);
			utilobj.JSClick(MBRP.getBirth_register_buttonSave(), driver);
			Thread.sleep(2000);
			//MBRP.getBirth_register_msgokButton().click();
				//print command is not working bug
			}
//		
}
