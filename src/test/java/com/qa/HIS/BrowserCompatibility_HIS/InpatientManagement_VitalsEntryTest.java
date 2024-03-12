package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_vitalsentrypages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class InpatientManagement_VitalsEntryTest extends CrossBrowser {
	
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_vitalsentrypages IM_VE;
	public InpatientManagement_VitalsEntryTest(){
		
	}
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), "Female medical ward",Browser);
	}
	@Test(priority =3)
	public void donavigateVitalEntry() {
		IM_VE=hishomepage.doNavigateTogetvitalEntry();
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void IPM_Vitals_Entry_TC_11(String Browser) throws InterruptedException, AWTException {

		
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(IM_VE.getTempValue()));
		Thread.sleep(1000);
		IM_VE.getTempValue().sendKeys("100");
		Thread.sleep(1000);
		IM_VE.getPulse().sendKeys("180");
		Thread.sleep(1000);
		IM_VE.getRespiratoryRate().sendKeys("50");
		Thread.sleep(1000);
		IM_VE.getMeanBP().sendKeys("140");
		Thread.sleep(1000);
		IM_VE.getSPO2().sendKeys("95");
		Thread.sleep(1000);
		IM_VE.getSystolicBP().sendKeys("280");
		Thread.sleep(1000);
		IM_VE.getDiastolicBP().sendKeys("100");
		Thread.sleep(1000);
		IM_VE.getBMI().sendKeys("20");
		Thread.sleep(1000);
		IM_VE.getClear().click();

		Thread.sleep(5000);
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void IPM_Vitals_Entry_TC_5(String Browser) throws InterruptedException, AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		utilobj.selectDropdown(IM_VE.getBedDll(), driver, "Fbed6",Browser);
       // wait.until(ExpectedConditions.invisibilityOf(IM_VE.getprocessImage()));
		Thread.sleep(5000);
		//Enter the value and remarks for the patient
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl02_txtValue")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl02_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl03_txtValue")).sendKeys("180");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl03_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl04_txtValue")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl04_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl05_txtValue")).sendKeys("140");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl05_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl06_txtValue")).sendKeys("95");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl06_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl07_txtValue")).sendKeys("280");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl07_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl08_txtValue")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl08_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl09_txtValue")).sendKeys("20");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl09_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
	}
	@Test(priority = 6)
		public void IPM_Vitals_Entry_TC_2() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		wait.until(ExpectedConditions.visibilityOf(IM_VE.getOKButton()));
		Thread.sleep(2000);
		utilobj.JSClick(IM_VE.getOKButton(), driver); 
	}
	@Test(priority = 7)
	public void IPM_Vitals_Entry_TC_3() throws InterruptedException {
		Thread.sleep(1000);
		IM_VE.getViewButton().click();
		Thread.sleep(1000);
		IM_VE.getRecordButton().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.visibilityOf(IM_VE.getUpdateButton()));
		Thread.sleep(1000);
		
	}
	@Test(priority = 8)
	public void IPM_Vitals_Entry_TC_10() throws InterruptedException {
		
		IM_VE.getUpdateButton().click();
		
	
		
	
	
}	
}		
		
		