package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Clinical_Record_ReportPages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


public class Clinical_Record_ReportTest extends CrossBrowser {
	public  Clinical_Record_ReportTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Clinical_Record_ReportPages CRR;
	util utilobj=new util();
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}

	@Test(priority = 3)
	public void doNavigateToClinical_Record_Reports() {

		
		CRR=hishomepage.doNavigateToClinical_Record_Reports();
	}
	@Test(priority = 4)
	public void checkTheFunctionalityOfItemMasterdata() throws InterruptedException {
		Thread.sleep(2000);
		CRR.getExpand_Super_Speciality_Patient_Referrals().click();
		Thread.sleep(2000);
		CRR.getItem_Master_Data().click();
		Thread.sleep(2000);
		
	}
	@Test(priority = 5)
	public void checkTheFunctionalityOfprescreption_itemIssue() throws InterruptedException  {
		
		CRR.getItem_Master_Data().click();
		Thread.sleep(2000);
		
	}
	@Test(priority = 6)
	public void checkTheFunctionalityOfStockStatus_StationWise() throws InterruptedException {
		Thread.sleep(2000);
		CRR.getExpand_Super_Speciality_Patient_Referrals().click();
		Thread.sleep(2000);
		CRR.getStockStatus_StationWise().click();	
		Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	@Parameters("browser")
	public void checkTheFunctionalityOfExportReport(String Browser) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		CRR.getExpand_Super_Speciality_Patient_Referrals().click();
		Thread.sleep(2000);
		CRR.getZeroStock_Item().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(CRR.getDepartment_DLL(), driver, "ADMINISTRATIVE SERVICES",Browser);
		Thread.sleep(2000);
		CRR.getPreviewButton().click();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		CRR.getExprotReport().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "Crystal Reports (RPT)",Browser);
		Thread.sleep(2000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "MS Excel 97-2000",Browser);
		Thread.sleep(2000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(2000);
		
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "MS Word",Browser);
		Thread.sleep(2000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(2000);
		
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "Acrobat Format (PDF)",Browser);
		Thread.sleep(2000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
	}
		@Test(priority = 8)
		@Parameters("browser")
		public void ChecktheFunctionalityofClearButton(String Browser) throws InterruptedException, AWTException {
			Thread.sleep(2000);
			CRR.getExpand_Super_Speciality_Patient_Referrals().click();
			Thread.sleep(2000);
			CRR.getZeroStock_Item().click();
			Thread.sleep(2000);
			utilobj.selectDropdown(CRR.getDepartment_DLL(), driver, "ADMINISTRATIVE SERVICES",Browser);
			Thread.sleep(2000);
			CRR.getPreviewButton().click();
			Thread.sleep(2000);
		CRR.getClearButton().click();
		

	}
	@Test(priority = 8)
	@Parameters("browser")
	public void ChecktheFunctionalityofLinkandPreviewButton(String Browser) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	List<WebElement> colectLink=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table/tbody/tr/td[2]/a"));
	System.out.println(colectLink.size());
	for(int i=1;i<=colectLink.size();i++) {
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table["+i+"]/tbody/tr/td[2]/a")).click();
	//wait.until(ExpectedConditions.invisibilityOf(CRR.getBlackoverlay()));
	}
	Thread.sleep(2000);
	utilobj.selectDropdown(CRR.getDepartment_DLL(), driver, "ADMINISTRATIVE SERVICES",Browser);
	Thread.sleep(2000);
	CRR.getPreviewButton().click();
	wait.until(ExpectedConditions.invisibilityOf(CRR.getBlackoverlay()));
	Thread.sleep(2000);
    CRR.getClearButton().click();
}
	}
