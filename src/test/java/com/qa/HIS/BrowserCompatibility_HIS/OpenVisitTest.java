package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OpenVisitPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class OpenVisitTest extends CrossBrowser{
	public OpenVisitTest() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OpenVisitPage OCP;
	
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
	public void doNavigateToOpenVisitTest() {

		
		OCP=hishomepage.doNavigateToOpenVisitPageLink();
		
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_5(String Browser) throws InterruptedException, AWTException {//clear
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_search().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_TextBox().sendKeys("Spouse");
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_Search().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOf(OCP.getBlackoverlay()));
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_RadioButton().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(2000);
		utilobj.JSClick(OCP.getOpenVisitUHID_Clear(),driver);
		
		
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_6(String Browser) throws AWTException, InterruptedException {//close MR
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_search().click();
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		OCP.getOpenVisitUHID_TextBox().sendKeys("Spouse");
		OCP.getOpenVisitUHID_Search().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOf(OCP.getBlackoverlay()));
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_RadioButton().click();
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_OK().click();
		wait.until(ExpectedConditions.visibilityOf(OCP.getOpenVisitUHID_CheckBox()));
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_CheckBox().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_closeMR().click();
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}
	@Test(priority = 6)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_9(String Browser) throws AWTException, InterruptedException {//nagitive closed MR
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_search().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_TextBox().sendKeys("Spouse");
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_Search().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOf(OCP.getBlackoverlay()));
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_RadioButton().click();
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_OK().click();
		wait.until(ExpectedConditions.visibilityOf(OCP.getOpenVisitUHID_CheckBox()));
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_CheckBox().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_closeMR().click();
		Thread.sleep(2000);
		
		
	}
	@Test(priority = 7)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_8(String Browser) throws AWTException, InterruptedException {//open MR
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_search().click();
		Thread.sleep(1000);
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_TextBox().sendKeys("Spouse");
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_Search().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.invisibilityOf(OCP.getBlackoverlay()));
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_RadioButton().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_OK().click();
		wait.until(ExpectedConditions.visibilityOf(OCP.getOpenVisitUHID_CheckBox()));
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_CheckBox().click();
		Thread.sleep(2000);
		OCP.getOpenVisitUHID_OpenMR().click();
		Thread.sleep(2000);
		
		
	}
	@Test(priority = 8)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_7(String Browser) throws InterruptedException, AWTException {//nagitive Scenario Open MR
		Thread.sleep(2000);
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	OCP.getOpenVisitUHID_search().click();
	Thread.sleep(1000);
	utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
	Thread.sleep(1000);
	OCP.getOpenVisitUHID_TextBox().sendKeys("Spouse");
	Thread.sleep(1000);
	OCP.getOpenVisitUHID_Search().click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	wait.until(ExpectedConditions.invisibilityOf(OCP.getBlackoverlay()));
	Thread.sleep(1000);
	OCP.getOpenVisitUHID_RadioButton().click();
	OCP.getOpenVisitUHID_SelectButton().click();
	Thread.sleep(2000);
	OCP.getOpenVisitUHID_OK().click();
	wait.until(ExpectedConditions.visibilityOf(OCP.getOpenVisitUHID_CheckBox()));
	Thread.sleep(2000);
	OCP.getOpenVisitUHID_CheckBox().click();
	Thread.sleep(2000);
	OCP.getOpenVisitUHID_OpenMR().click();
	Thread.sleep(2000);
	Robot rb2=new Robot();
	rb2.keyPress(KeyEvent.VK_ENTER);
	}
	
}
