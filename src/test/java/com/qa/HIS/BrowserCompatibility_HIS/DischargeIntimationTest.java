package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.DischargeIntimationPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class DischargeIntimationTest  extends CrossBrowser {

	public DischargeIntimationTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	DischargeIntimationPage DIP;
	util utilobj = new util();
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
	public void doNavigateTogetDischargeIntimationLinkTest() {

		DIP = hishomepage.doNavigateToDischargeIntimationLink();
	}
	
	@Test(priority = 4)
	@Parameters("browser")
	public void CLM_Discharge_Intimation_TC_4(String Browser) throws InterruptedException {
					utilobj.ActionClick(DIP.getAdmissionSearchBtn(), driver);
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
					wait.until(ExpectedConditions.visibilityOf(DIP.getAdmissionSearchNo()));
					//DIP.getAdmissionSearchNo().click();
		
					DIP.getAdmissionSearchNo().sendKeys(prop.getProperty("AdmissionNo"));
					Thread.sleep(2000);
					DIP.getSearchBtn().click();
					wait.until(ExpectedConditions.invisibilityOf(DIP.getBlackOverlay()));
					DIP.getChkBox().click();
					Thread.sleep(2000);
					DIP.getSelectBtn().click();					
					Thread.sleep(2000);		
					utilobj.selectDropdown(DIP.getRequestType(), driver, prop.getProperty("RequestType"),Browser);
					Thread.sleep(2000);
		
					DIP.getRemarks().sendKeys(prop.getProperty("Remarks"));
					Thread.sleep(2000);
					DIP.getSaveBtn().click();
					wait.until(ExpectedConditions.visibilityOf(DIP.getSuccusfullOkButton()));
		
	}	
	@Test(priority = 5)
public void CLM_Discharge_Intimation_TC_5() throws InterruptedException {
		Thread.sleep(3000);
		DIP.getSuccusfullOkButton().click();
		Thread.sleep(3000);
DIP.getClearButton().click();

}
}