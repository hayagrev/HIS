package com.qa.HIS.BrowserCompatibility_HIS;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientAdmissionPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class PatientAdmissionTest extends CrossBrowser {
	public PatientAdmissionTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	PatientAdmissionPage patientAdmissionpage;
	String typevalue;
	String admissionNumber;
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
		
		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void Registration_Patient_Admission_TC_1(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		patientAdmissionpage.getTxtIPNO().sendKeys("1100000022");
		Thread.sleep(2000);
		patientAdmissionpage.getLnkbtnIPNo().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlbtnSelect().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));		
		utilobj.JSClick(patientAdmissionpage.getPermanentSameAsPresentRadiobutton(), driver);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(patientAdmissionpage.getddlSpecialisation(), driver, "General Medicine",Browser);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(patientAdmissionpage.getddlUnit(), driver, "Medicine",Browser);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		utilobj.selectDropdown(patientAdmissionpage.getWardtypeddl(), driver, "Male Medical Ward", Browser);
	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		patientAdmissionpage.getBtnSave().click();
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")));
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
		
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void Registration_Patient_Admission_TC_2(String Browser) throws InterruptedException {
		
		Thread.sleep(4000);
		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(4000);
		patientAdmissionpage.getTxtIPNO().sendKeys("1100000022");
		Thread.sleep(4000);
		patientAdmissionpage.getLnkbtnIPNo().click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		patientAdmissionpage.getHisLiveListControlbtnSelect().click();
		
		Thread.sleep(4000);
		utilobj.selectDropdown(patientAdmissionpage.getddlReligion(), driver, "BUDHISM", Browser);
		Thread.sleep(2000);
		utilobj.JSClick(patientAdmissionpage.getBtnSave(), driver);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		utilobj.JSClick(patientAdmissionpage.getMyMessageBoxSuccusButtonYes(), driver);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		admissionNumber=patientAdmissionpage.getAdmissionNoTextBox().getAttribute("value");//IP042100003IP102100048
		Thread.sleep(2000);
	System.out.println(admissionNumber);
	}
	@Test(priority = 6)
public void Registration_Patient_Admission_TC_3() throws InterruptedException {
		
		Thread.sleep(2000);
			
			 
				utilobj.JSClick(patientAdmissionpage.getpritnButton(), driver);
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(10));
				 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
				 Thread.sleep(120000);
			 utilobj.SwitchToChildWindow(driver, "PrintReports.aspx");
			 Thread.sleep(6000);
			 driver.close();
			 utilobj.SwitchToChildWindow(driver, "Dhanwantri");
	}
	@Test(priority = 7)
	public void	Registration_Patient_Admission_TC_5() throws InterruptedException {
		Thread.sleep(8000);	
		patientAdmissionpage.getpatientAdmission_UHIDDepositedetail().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
	utilobj.SwitchToChildWindow(driver, " 	DepositDetails-Dhanwantri ");
	Thread.sleep(6000);		
//	/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]
	driver.findElement(By.id("txtamt")).sendKeys("2000");
	Thread.sleep(2000);	
	driver.findElement(By.id("btnSaveDepositDetails")).click();
	
	Thread.sleep(10000);
	utilobj.SwitchToChildWindow(driver, "Dhanwantri");
	}
//	@Test(priority = 8)
//	@Parameters("browser")
//	public void Registration_Patient_Admission_TC_7(String Browser) throws InterruptedException {
//		Thread.sleep(4000);
//		String dateName=new SimpleDateFormat("ddMMyyyy").format(new Date());
//		Thread.sleep(4000);
//		patientAdmissionpage = hishomepage.doNavigateToPatientAdmission();
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornCheckBox().click();
//		Thread.sleep(4000);
//		String parent3 = driver.getWindowHandle();
//		utilobj.Window(driver);
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgBtn().click();
//		Thread.sleep(8000);
//		utilobj.ChildWindow(driver);
//		Thread.sleep(4000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionSearch().click();
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionTextbox().sendKeys("mahila");
//		Thread.sleep(4000);//IP032200087 	
//		patientAdmissionpage.getnewBornImgMotherAdmissionBtnSearch().click();
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		Thread.sleep(120000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionRadioButton().click();
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionSelectButton().click();
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornImgMotherAdmissionOkButton().click();
//		Thread.sleep(4000);
//		driver.switchTo().window(parent3);
//		Thread.sleep(4000);
//		patientAdmissionpage.getnewBornDOB().sendKeys(dateName);
//		Thread.sleep(4000);
//		utilobj.JSClick(patientAdmissionpage.getPermanentSameAsPresentRadiobutton(), driver);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionType(), driver, "On Transfer/Referral",Browser);
//		Thread.sleep(2000);
//		utilobj.selectDropdown(patientAdmissionpage.getDdlAdmissionSrc(), driver, "Transferred from near by dispensary",Browser);
//		Thread.sleep(2000);
//		utilobj.selectDropdown(patientAdmissionpage.getddlSpecialisation(), driver, "General Medicine",Browser);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		utilobj.selectDropdown(patientAdmissionpage.getddlUnit(), driver, "MEDICINE",Browser);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		utilobj.selectDropdown(patientAdmissionpage.getWardtypeddl(), driver, "Female medical ward", Browser);
//	
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		patientAdmissionpage.getBtnSave().click();
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
//	
//		
//		
//	}
	@Test(priority = 9)
	public void Registration_Patient_Admission_TC_9() throws InterruptedException {
		Thread.sleep(2000);
		patientAdmissionpage.getAdmissionSearchImage().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		Thread.sleep(2000);
		patientAdmissionpage.getAdmissionSearchtextbox().sendKeys(admissionNumber);
		Thread.sleep(2000);
		patientAdmissionpage.getAdmissionSearchButton().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		patientAdmissionpage.getAdmissionSearchRadioButton().click();
		Thread.sleep(2000);
		patientAdmissionpage.getAdmissionSearchSelectButton().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
	}
	
	@Test(priority = 10)
	public void Registration_Patient_Admission_TC_6() throws InterruptedException
	{
		Thread.sleep(2000);	
		patientAdmissionpage.getAdmissionCancelButton().click();
		Thread.sleep(2000);	
	patientAdmissionpage.getMyMessageBoxSuccusButtonYes().click();
	Thread.sleep(2000);	
	}
}
