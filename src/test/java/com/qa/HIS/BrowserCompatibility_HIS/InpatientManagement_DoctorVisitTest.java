package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagment_DoctorVisitPage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class InpatientManagement_DoctorVisitTest extends CrossBrowser {
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagment_DoctorVisitPage IMDV;
public InpatientManagement_DoctorVisitTest(){
		
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
	public void donavigateDoctorVisit() {
		IMDV=hishomepage.doNavigateTogetDoctorVisit();
		
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void IPM_Doctor_Visits_TC_2(String Browser) throws InterruptedException {
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		Thread.sleep(2000);
		utilobj.selectDropdown(IMDV.getBedDll(), driver, "Fbed6", Browser);
		wait.until(ExpectedConditions.visibilityOf(IMDV.getDoctorSerchImage()));
		String parent4 = driver.getWindowHandle();
		Thread.sleep(2000);
		utilobj.Window(driver);
		Thread.sleep(2000);
		IMDV.getDoctorSerchImage().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(IMDV.getDoctorsearchDoctorname()));
		Thread.sleep(2000);
		IMDV.getDoctorsearchDoctorname().sendKeys("test");
		Thread.sleep(2000);
		IMDV.getDoctorsearchSearchButton().click();
		wait.until(ExpectedConditions.visibilityOf(IMDV.getDoctorsearchCheckboxSelect()));
		
		Thread.sleep(2000);
		IMDV.getDoctorsearchCheckboxSelect().click();
		Thread.sleep(2000);
		IMDV.getDoctorsearchSelectButton().click();
		Thread.sleep(2000);
		 driver.switchTo().window(parent4);
		 Thread.sleep(2000);
		 utilobj.selectDropdown(IMDV.getVisitTypeDll(), driver, "NORMAL VISIT", Browser);
		 Thread.sleep(2000);
		 IMDV.getSaveButton().click();
		 wait.until(ExpectedConditions.visibilityOf(IMDV.getsaveOkbutton()));
		 Thread.sleep(2000);
		 IMDV.getsaveOkbutton().click();
	}
	@Test(priority = 5)
	public void IPM_Doctor_Visits_TC_3() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		 Thread.sleep(2000);
		 IMDV.getViewButton().click();
		 wait.until(ExpectedConditions.visibilityOf(IMDV.getRecordnumber()));
		 Thread.sleep(2000);
		 IMDV.getRecordnumber().click();
		 wait.until(ExpectedConditions.visibilityOf(IMDV.getSaveButton()));
	}
	@Test(priority = 6)
		public void IPM_Doctor_Visits_TC_10() throws InterruptedException {
		 Thread.sleep(2000);
		 IMDV.getSaveButton().click();
		 Thread.sleep(2000);
		 IMDV.getsaveOkbutton().click();
		
		
	}

}
