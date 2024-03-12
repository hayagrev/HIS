package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AlterMRPPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class AlterMRPPageTest  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	AlterMRPPage alterMRPPage;
	util utilobj=new util();
	String NewMrp="5";
	String MedicineName="Paracetamol Tab";
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"),Browser);
	}
	
	
	@Test(priority = 3)
	public void doNavigateAlterMRPLinkTest() {

		alterMRPPage = hishomepage.doNavigateAlterMRPLink();
	}

			
	@Test(priority =4)
	public void TC_Alter_MRP_004() throws InterruptedException, IOException {
		//String path=System.getProperty("user.dir")+"\\ExcelTestdata";

//		alterMRPPage.doAlterMRP();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(alterMRPPage.getimgBtnItemSearch()));
				
		alterMRPPage.getimgBtnItemSearch().click();
		alterMRPPage.gettxtCriteria().sendKeys(MedicineName);
		alterMRPPage.getbtnSearch().click();
		wait.until(ExpectedConditions.invisibilityOf(alterMRPPage.getBlackOverlay()));
		alterMRPPage.getrdbTemp().click();
		alterMRPPage.getbtnSelect().click();
		wait.until(ExpectedConditions.invisibilityOf(alterMRPPage.getBlackOverlay()));
		Thread.sleep(3000);
		
		alterMRPPage.getimgBtnBatchSearch().click();
		wait.until(ExpectedConditions.invisibilityOf(alterMRPPage.getBlackOverlay()));
		alterMRPPage.getchkSelect().click();
		alterMRPPage.getbtnSelectBatch().click();
		Thread.sleep(3000);

		alterMRPPage.gettxtNewMRP().sendKeys(NewMrp);
		alterMRPPage.getbtnSave().click();
		wait.until(ExpectedConditions.visibilityOf(alterMRPPage.getButtonOK()));
	//System.out.println(getpopuptxt().getText());
		
		//utilobj.readExcel(path, "ExportExcelFile.xlsx", "AlterMrp");
	}
	@Test(priority =5)
	public void TC_Alter_MRP_005() throws InterruptedException, IOException {
		//String path=System.getProperty("user.dir")+"\\ExcelTestdata";
		alterMRPPage.getButtonOK().click();
		Thread.sleep(3000);
//		alterMRPPage.doAlterMRP();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(alterMRPPage.getimgBtnItemSearch()));
				
		alterMRPPage.getimgBtnItemSearch().click();
		alterMRPPage.gettxtCriteria().sendKeys(MedicineName);
		alterMRPPage.getbtnSearch().click();
		wait.until(ExpectedConditions.invisibilityOf(alterMRPPage.getBlackOverlay()));
		alterMRPPage.getrdbTemp().click();
		alterMRPPage.getbtnSelect().click();
		wait.until(ExpectedConditions.invisibilityOf(alterMRPPage.getBlackOverlay()));
		Thread.sleep(3000);
		
		alterMRPPage.getimgBtnBatchSearch().click();
		wait.until(ExpectedConditions.invisibilityOf(alterMRPPage.getBlackOverlay()));
		alterMRPPage.getchkSelect().click();
		alterMRPPage.getbtnSelectBatch().click();
		Thread.sleep(3000);
String oldMrp=alterMRPPage.getOldMrp().getText();
Thread.sleep(3000);
assertEquals(oldMrp, NewMrp);
		
	}
	@Test(priority =6)
	public void TC_Alter_MRP_007() throws InterruptedException, IOException {
		Thread.sleep(3000);
		alterMRPPage.getClearButton().click();
		
	}
	
}
