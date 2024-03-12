package com.qa.HIS.BrowserCompatibility_HIS;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.UHIDPage;
import com.qa.util.util;

public class UHIDPageTest extends CrossBrowser {

	public UHIDPageTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	UHIDPage uhidpage;
	String typevalue;

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
	public void doNavigateToUHIDcreationLinkTest() throws IOException {
		
		uhidpage = hishomepage.doNavigateToUHIDcreationLink();
	}
	
	
	@Test(priority = 4)
	@Parameters("browser")
	public void To_Check_Functionality_SaveButton(String Browser) throws InterruptedException, IOException {


		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(uhidpage.getTitle()));
		Random F=new Random();
		int Num=F.nextInt(4000);
		System.out.println("Random ="+Num);
		String Fname=Integer.toString(Num);
		Random U=new Random();
		int Num_U= U.nextInt(4000);
		System.out.println("Random ="+Num_U);
		String Lname=Integer.toString(Num_U);
		
		utilobj.selectDropdown(uhidpage.getTitle(), driver, "Mr.",Browser);
		Thread.sleep(4000);
		
	
		uhidpage.getFirstName().sendKeys(prop.getProperty("FirstName")+Fname);
		Thread.sleep(4000);
		uhidpage.getLastName().sendKeys(prop.getProperty("LastName")+Lname);
		
		Thread.sleep(4000);
		
		System.out.println(prop.getProperty("MaritalStatus") + uhidpage.getMarriageStatus());
		Thread.sleep(4000);
		utilobj.selectDropdown(uhidpage.getMarriageStatus(), driver, "Single",Browser);
		
		Thread.sleep(4000);
		uhidpage.getAge().sendKeys(prop.getProperty("Age"));
		Thread.sleep(4000);
		uhidpage.getPresentAddres().sendKeys(prop.getProperty("Address"));
		Thread.sleep(4000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDState")), driver, "Maharashtra",Browser);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/img")));
		Thread.sleep(4000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDDistrict")), driver, "Mumbai",Browser);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/img")));
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtPincode")).sendKeys("230532");
		
	
		
		uhidpage.getSavebutton().click();
		wait.until(ExpectedConditions.visibilityOf(uhidpage.getUHID_creation_Uhid_succes()));
//		uhidpage.getbtnYes().click();
//		Thread.sleep(4000);
		
		
		Thread.sleep(4000);
		utilobj.JSClick(uhidpage.getUHID_creation_Uhid_succes(), driver);
		
		
		Thread.sleep(4000);
		System.out.println(uhidpage.getUHID_creation_Uhid_txtbox().getText());	
		Thread.sleep(4000);
		typevalue=uhidpage.getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(4000);
		System.out.println(typevalue);
		Thread.sleep(4000);
		utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
		Thread.sleep(4000);
		utilobj.JSClick(driver.findElement(By.linkText("UHID Creation")), driver);
		Thread.sleep(4000);
	}
	@Test(priority = 5)
	
	public void To_Check_Functionality_UHIDSearch() throws InterruptedException, IOException {
		
	Thread.sleep(4000);
	uhidpage.getUHID_creation_IMGsearchUhid().click();//uhid search
	Thread.sleep(4000);
	uhidpage.getUHID_creation_UHIDsearchtxtbox().sendKeys(typevalue);
	Thread.sleep(4000);
	uhidpage.getUHID_creation_UHIDButtonsearch().click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
	uhidpage.getUHID_creation_UHIDRadiobuttonselect().click();
	Thread.sleep(4000);
	uhidpage.getUHID_creation_UHIDsearchselect().click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
	uhidpage.getUHID_creation_sameaddrescheckbox().click();//update button
	Thread.sleep(4000);
	}
	@Test(priority = 6)
	public void To_Check_Functionality_UpdateButton() throws InterruptedException {
		Thread.sleep(2000);
	utilobj.JSClick(uhidpage.getUHID_creation_UpdateButton(), driver);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(5));
	wait.until(ExpectedConditions.visibilityOf(uhidpage.getbtnYes()));
	uhidpage.getbtnYes().click();
	Thread.sleep(4000);
	
	uhidpage.getUHID_creation_Uhid_succesUpdate().click();
	Thread.sleep(3000);
	
	}
		@Test(priority = 7)
		public void Check_the_Functionality_Of_OPDNumber() throws InterruptedException {
	
		Thread.sleep(4000);//opd link functionality
		
		uhidpage.getUHID_creation_Uhid_OPDNumber().click();

		Thread.sleep(4000);
		uhidpage.getpatientCheckInNumberRegistration().click();
		Thread.sleep(4000);
		}
		@Test(priority = 8)
		@Parameters("browser")
		public void Check_FunctionalityOf_ClearButton(String Browser) throws InterruptedException {
		//clear button functionelity
			
		utilobj.selectDropdown(uhidpage.getTitle(), driver, prop.getProperty("Title"),Browser);
			//uhidpage.getTitle().sendKeys("Title");
		Thread.sleep(4000);
		uhidpage.getFirstName().sendKeys(prop.getProperty("FirstName"));
		Thread.sleep(4000);
		uhidpage.getLastName().sendKeys(prop.getProperty("LastName"));
		
		Thread.sleep(4000);
		
		System.out.println(prop.getProperty("MaritalStatus") + uhidpage.getMarriageStatus());
		utilobj.selectDropdown(uhidpage.getMarriageStatus(), driver, prop.getProperty("MaritalStatus"),Browser);
		//uhidpage.getMarriageStatus().sendKeys("Single");
		Thread.sleep(4000);
		uhidpage.getAge().sendKeys(prop.getProperty("Age"));
		Thread.sleep(4000);
		uhidpage.getPresentAddres().sendKeys(prop.getProperty("Address"));
		Thread.sleep(4000);
		uhidpage.getUHID_creation_clearButton().click();
		Thread.sleep(4000);
		}
		
		
		@Test(priority = 9)
		public void Search_Patient_detailBy_IPnumber() throws Exception {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
			Thread.sleep(4000);
		uhidpage.getUHID_creation_InsouranceNOtxtbox().sendKeys("1199900090");
		Thread.sleep(4000);
		uhidpage.getUHID_creation_LivelistLink().click();
		Thread.sleep(4000);
		uhidpage.getUHID_creation_LivelistradioButton().click();
		Thread.sleep(4000);
		uhidpage.getUHID_creation_LivelistSelect().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
		uhidpage.getUHID_creation_clearButton().click();
		Thread.sleep(4000);
		
	}
		@Test(priority = 10)
		public void Search_Patient_detailBy_IPnumberwith_nagative_Scenario() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2)); 
			wait.until(ExpectedConditions.visibilityOf(uhidpage.getTitle()));
		uhidpage.getUHID_creation_InsouranceNOtxtbox().sendKeys("abcdef#@");
		Thread.sleep(4000);
		uhidpage.getUHID_creation_LivelistLink().click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOf(uhidpage.getinvalid_insurance_EmployeeNo_CloseButton()));
		String messageLable=uhidpage.getinvalid_insurance_EmployeeNo_message().getText();
		System.out.println(messageLable);
		uhidpage.getinvalid_insurance_EmployeeNo_message().click();
		}
	
}


