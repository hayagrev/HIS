package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.ReportTemplatePage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class ReportTemplateTest extends CrossBrowser {
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	util utilobj=new util();
	ReportTemplatePage RTP;
	String Tamplate= "test Automation test";
	String TamplateName;
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("imagingfacilityname"),Browser);
	}
	
	
	@Test(priority = 3)
	public void doNavigateMISReportLinkTest() {

		RTP = hishomepage.doNavigateToImagingWorklistLink();
	}
	@Test(priority = 4)
	public void TC_Report_Template_Creation_004() throws InterruptedException {
		Random F=new Random();
		int Num=F.nextInt(4000);
		String Fname=Integer.toString(Num);
		TamplateName=Tamplate+Fname;
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		RTP.getTamplateNameTextBox().sendKeys(TamplateName);
		Thread.sleep(2000);
		RTP.getProcedureImageSearch().click();
		Thread.sleep(2000);
		RTP.getProcedureNameTextbox().sendKeys("CLOTRETRACTIONTEST");
		Thread.sleep(2000);
		RTP.getProcedureSearchButton().click();
		wait.until(ExpectedConditions.visibilityOf(RTP.getProcedureChekbox()));
		Thread.sleep(2000);
		RTP.getProcedureChekbox().click();
		Thread.sleep(2000);
		RTP.getProcedureSelectButton().click();
		Thread.sleep(2000);
		driver.switchTo().frame(RTP.getiframe());
		Thread.sleep(2000);
		RTP.getTamplateBody().sendKeys("Automation Test Body");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		RTP.getSaveButton().click();
		wait.until(ExpectedConditions.visibilityOf(RTP.getMessageButtonOK()));
		Thread.sleep(2000);
		RTP.getMessageButtonOK().click();
		Thread.sleep(2000);
		
	}
@Test(priority = 5)
public void TC_Report_Template_Creation_005() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	RTP.getTamplateNameImaageSearch().click();
	Thread.sleep(2000);
	RTP.getProcedureNameTextbox().sendKeys(TamplateName);
	Thread.sleep(2000);
	RTP.getProcedureSearchButton().click();
	wait.until(ExpectedConditions.visibilityOf(RTP.getTamplateRadioButton()));
	Thread.sleep(2000);
	RTP.getTamplateRadioButton().click();
	Thread.sleep(2000);
	RTP.getProcedureSelectButton().click();
	wait.until(ExpectedConditions.invisibilityOf(RTP.getProcedureDropDownSelect()));
	Thread.sleep(2000);
	
	RTP.getProcedureDropDownSelect().click();
	Thread.sleep(2000);
	RTP.getRemoveButton().click();
	Thread.sleep(2000);
	RTP.getUpdateButton().click();
	
	
	
}

}
