package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_primarydoctorchangepages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;



public class InpatientManagement_PrimaryDoctorChangeTest extends CrossBrowser {
      
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	InpatientManagement_primarydoctorchangepages IMPDC;
     public InpatientManagement_PrimaryDoctorChangeTest(){
		
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
 	public void doPrimarydoctorChangetest() {

 		IMPDC = hishomepage.donavigatetoPrimarydoctorChangetest();	
 	}
	
	@Test(priority = 4)
	public void IPM_Primary_Doctor_Change_TC_2() throws InterruptedException, AWTException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		Thread.sleep(2000);
		IMPDC.getAdmissionnoicon().click();
		
		
		wait.until(ExpectedConditions.visibilityOf(IMPDC.getPatientNametxtbox()));
		
		IMPDC.getPatientNametxtbox().sendKeys("IP0");
		Thread.sleep(2000);
				
		IMPDC.getSearch().click();
		
		wait.until(ExpectedConditions.visibilityOf(IMPDC.getRadiobtn()));
	
		IMPDC.getRadiobtn().click();
		
		Thread.sleep(2000);
		IMPDC.getSelect().click();
		wait.until(ExpectedConditions.invisibilityOf(IMPDC.getupdateprocess()));
	}
	@Test(priority = 5)
	public void  IPM_Primary_Doctor_Change_TC_3() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		Thread.sleep(2000);
		IMPDC.getDoctorDeleteImage().click();
		Thread.sleep(2000);
		IMPDC.getPrimaryDoctorSearchImageButton().click();
		Thread.sleep(2000);
		IMPDC.getDoctorsearchNameTextbox().sendKeys("test");
		Thread.sleep(2000);
		IMPDC.getSearch().click();
		wait.until(ExpectedConditions.visibilityOf(IMPDC.getRadiobtn1()));
		Thread.sleep(2000);
		IMPDC.getRadiobtn1().click();
		Thread.sleep(2000);
		IMPDC.getSelect1().click();
		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void IPM_Primary_Doctor_Change_TC_1() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		Thread.sleep(2000);
		IMPDC.getSave().click();
	wait.until(ExpectedConditions.visibilityOf(IMPDC.getMSGBtnOK()));
	IMPDC.getMSGBtnOK().click();
	
	}
	
}

