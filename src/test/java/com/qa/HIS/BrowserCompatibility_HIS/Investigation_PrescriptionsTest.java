package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Investigation_PrescriptionsPage;
import com.qa.pages.Loginpage;

import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Investigation_PrescriptionsTest extends CrossBrowser {
	public void getInvestigation_PrescriptionsPage() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	
	Investigation_PrescriptionsPage IPP;
	util utilobj=new util();
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

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
	public void doNavigateToPatientCheckInTest() {

		IPP=hishomepage.doNavigateTogetInvestigation_PrescriptionsLink();
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void tochecktheFunctinalityofSaveButton(String Browser) throws AWTException, InterruptedException {
		Thread.sleep(1000);
		IPP.getimgSearchUHID().click();
		Thread.sleep(1000);
		Robot rb=new Robot();
		utilobj.selectDropdown(IPP.getUHID_DLL(), driver, "Starts With",Browser);
		
		Thread.sleep(1000);
		IPP.getUHID_textBOX().sendKeys("DUMM");
		Thread.sleep(1000);
		IPP.getUHID_Searchbutton().click();
		IPP.getUHID_RadioButton().click();
		IPP.getUHID_ButtonSelect();
		Thread.sleep(1000);

		String parent3 = driver.getWindowHandle();

		//doctor search
		utilobj.Window(driver);
		Thread.sleep(2000);
		IPP.getimgSearchUHIDDoctor().click();
		Thread.sleep(2000);
		 utilobj.ChildWindow(driver);
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
			Thread.sleep(2000);
		IPP.getUHIDDoctor_Name().sendKeys("test");
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		IPP.getUHIDDoctor_CheckBox().click();
		Thread.sleep(2000);
		IPP.getUHIDDoctor_SelectButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
		
		
		
	}
	
}


