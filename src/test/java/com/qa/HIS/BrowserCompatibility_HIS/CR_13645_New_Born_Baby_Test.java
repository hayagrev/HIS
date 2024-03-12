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

import com.qa.pages.CR_13645_New_Born_Baby_Page;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientAdmissionPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class CR_13645_New_Born_Baby_Test extends CrossBrowser{
public CR_13645_New_Born_Baby_Test() {
	
}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CR_13645_New_Born_Baby_Page NBB;
	PatientAdmissionPage patientAdmissionpage;
	String typevalue;
	String admissionNumber;
	String AdmissionNo;
	String AlertInfo;
	String MotherAdmissionDate;
	String MotherName;
	String MotherUHIDNo;
	String MotherIPnumber;
	int flag=0;
	
	@Test(priority = 0)
	public void doLoginTest() throws InterruptedException, IOException {

		loginpage = new Loginpage(driver);
		
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() throws InterruptedException {
		Thread.sleep(1000);
		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();

		
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws IOException, InterruptedException {
		System.out.println(Browser);
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}

	@Test(priority = 3)
	public void doNavigateToPatientAdmissionTest() throws IOException {
		
		NBB = hishomepage.doNavigateToPatientAdmissionfornewBorn();
	}	
/*	@Test(priority = 4)
	@Parameters("browser")
	public void Registration_Patient_Admission_Admit_Mother(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		NBB.getTxtIPNO().sendKeys("1100099900");
		Thread.sleep(2000);
		NBB.getLnkbtnIPNo().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		NBB.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		NBB.getHisLiveListControlbtnSelect().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));		
		utilobj.JSClick(NBB.getPermanentSameAsPresentRadiobutton(), driver);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(NBB.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(NBB.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(NBB.getddlSpecialisation(), driver, "General Medicine",Browser);
		Thread.sleep(10000);
		utilobj.selectDropdown(NBB.getddlUnit(), driver, "Medicine",Browser);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(NBB.getWardtypeddl(), driver, "Female medical ward", Browser);
	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));

		NBB.getBtnSave().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
		
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void Registration_Patient_Admission_Alot_Bed(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		AdmissionNo=NBB.getAdmissionTextbox().getText();
		NBB.getChangeLocation().click();
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("Ward"),Browser);
		wait.until(ExpectedConditions.visibilityOf(NBB.getInPatientManagement()));
		utilobj.MoveElement(NBB.getInPatientManagement(), driver);
		NBB.getAllotBed().click();
		Thread.sleep(6000);
		driver.findElement(By.linkText(AdmissionNo)).click();
		Thread.sleep(6000);
		utilobj.selectDropdown(NBB.getAllotBed_BedName(), driver, "FEMALE BEDK MED 15", Browser);
		Thread.sleep(6000);
		NBB.getAllotBed_SaveButton().click();
		wait.until(ExpectedConditions.visibilityOf(NBB.getAllotBed_SuccessOkButton()));
		NBB.getAllotBed_SuccessOkButton().click();
	Boolean status=	NBB.getAllotBed_WarningOKbutton().isDisplayed();
	Thread.sleep(2000);
		if(status==true) {
	    NBB.getAllotBed_WarningOKbutton().click();
		}
		
		
	}
	@Test(priority = 6)
	@Parameters("browser")
	public void doNavigateToHISHomeTestforNewBorn(String Browser) throws IOException, InterruptedException {
		Thread.sleep(2000);
		System.out.println(Browser);
		NBB.getChangeLocation().click();
		Thread.sleep(2000);
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}

	@Test(priority = 7)
	public void doNavigateToPatientAdmissionTestforNewBorn() throws IOException {
		
		NBB = hishomepage.doNavigateToPatientAdmissionfornewBorn();
	}*/
	@Test(priority = 8)
	@Parameters("browser")
	public void To_ChecktheFunctionalityOfFatchtheDetail(String Browser) throws IOException, InterruptedException {

		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now)); 
		   //System.out.println(dtf.format(now).substring(0, 2));
		 String CurrentDate=(dtf.format(now).substring(0, 2));
		  
		 
		 System.out.println(CurrentDate);
		  Thread.sleep(2000);
		NBB.getAdmission_NewBornCheckBox().click();//EMR022300001
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		Thread.sleep(2000);
		utilobj.Window(driver);
		Thread.sleep(4000);
		NBB.getAdmission_NewBornImage().click();
		Thread.sleep(8000);
		utilobj.ChildWindow(driver);
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
//		 driver.findElement(By.id("txtDOB")).click();
//		  Thread.sleep(2000);
//		  List<WebElement>calender=driver.findElements(By.xpath("//html//body//div[@id='txtDob_CalendarExtender2_days']//table//tbody[@id='txtDob_CalendarExtender2_daysBody']//tr//td"));
//		  System.out.println(calender.size());
//		  List<String> dateofcalender=new ArrayList<String>();
//	        for(int i=0;i<calender.size();i++) {
//	        	
//	        	dateofcalender.add(calender.get(i).getText());
//	        	System.out.println(dateofcalender);
//	        	System.out.println(calender.get(i).getText());
//	        	Thread.sleep(1000);
//	        	calender.get(i).click();
//	        	Thread.sleep(1000);
//	        	NBB.getBabyAdmissionOkButton().click();
//	        	 driver.findElement(By.id("txtDOB")).click();
//	        	
//	        	calender=driver.findElements(By.xpath("//html//body//div[@id='txtDob_CalendarExtender2_days']//table//tbody[@id='txtDob_CalendarExtender2_daysBody']//tr//td"));
//	        	}
//	        System.out.println("dates of calender:-"+dateofcalender);
//	       List<String> withoutduplicatevalue=dateofcalender.stream().distinct().collect(Collectors.toList());
//	        System.out.println("Remove Duplicate value"+withoutduplicatevalue);
//	        for(String date:withoutduplicatevalue) {
//	        	 driver.findElement(By.id("txtDOB")).click();
//	       driver.findElement(By.linkText(date));
//	       driver.findElement(By.id("txtDOB")).click();
//	        }
		NBB.getNewBornSearchImageButton().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ucCommonSearch_hisSearchCriteria_dlData_ctl01_ddlCriteria")), driver, "Equals", Browser);
		Thread.sleep(2000);
		NBB.getMotherAdmissionNoTextBox().sendKeys("IP032300006");//IP022300081 EMR022300001 	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		NBB.getMotherAdmissionNoSearchButton().click();
		wait.until(ExpectedConditions.invisibilityOf(NBB.getProcessImage()));
		NBB.getMotherAdmissionRadioButton().click();
		Thread.sleep(2000);
		NBB.getMotherAdmissionSelectButton().click();
		wait.until(ExpectedConditions.invisibilityOf(NBB.getProcessImage()));
		Thread.sleep(2000);
		MotherAdmissionDate=NBB.getMotherAdmissionDateTextBox().getAttribute("value");
		Thread.sleep(2000);
		MotherName=NBB.getMotherNameTextBox().getAttribute("value");
		Thread.sleep(2000);
		MotherUHIDNo=NBB.getMotherUHIDNoTextBox().getAttribute("value");
		Thread.sleep(2000);
		MotherIPnumber=NBB.getMotherIPNumberTextBox().getAttribute("value");
		Thread.sleep(2000);
		System.out.println(MotherAdmissionDate+" "+MotherName+" "+MotherUHIDNo+" "+MotherIPnumber);
		Thread.sleep(2000);
		NBB.getRadioButtonOutsideESICHospital().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(NBB.getBabyGenderDDL(), driver, "Male", Browser);
		Thread.sleep(2000);  
		utilobj.JSEnterText(NBB.getBabyDOBL(), driver,dtf.format(now));
		Thread.sleep(2000);
		NBB.getBabyAdmissionOkButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(10000);
	}
	@Test(priority = 9)
	@Parameters("browser")
	public void To_ChecktheFunctionalityoFBabyAdmission(String Browser) throws IOException, InterruptedException {
		Thread.sleep(2000);		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		utilobj.JSClick(NBB.getPermanentSameAsPresentRadiobutton(), driver);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(NBB.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(NBB.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(NBB.getddlSpecialisation(), driver, "General Medicine",Browser);
		Thread.sleep(10000);
		utilobj.selectDropdown(NBB.getddlUnit(), driver, "Medicine",Browser);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(NBB.getWardtypeddl(), driver, "Female medical ward", Browser);
	
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		NBB.getBtnSave().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
		Thread.sleep(2000);
		AdmissionNo=NBB.getAdmissionTextbox().getAttribute("value");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnClear")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_imgadmissionsearch")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys(AdmissionNo);
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
        Thread.sleep(2000);        
        driver.findElement(By.id("ctl00_cphpage_btnCancel")).click();
        Thread.sleep(2000); 
	}
}
