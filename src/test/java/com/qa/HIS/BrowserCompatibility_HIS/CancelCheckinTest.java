package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.CancelCheckinPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class CancelCheckinTest extends CrossBrowser{

	public CancelCheckinTest() {
		// TODO Auto-generated constructor stub
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CancelCheckinPage cancelCheckinpage;
	String UHID_number;
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {//ctl00_cphpage_imgCheckinno

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
	}
	
	@Test(priority =3)
	public void doNavigateToCancelCheckinTest() {

		cancelCheckinpage = hishomepage.doNavigateToCancelCheckinLink();
	}
@Test(priority = 4)
public void cencelcheck_ingetUHIdNumber() {
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getImgUhidSearch().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getCancelCheckIn_uhidsearchtxtbox().sendKeys(prop.getProperty("IPnumber"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getbtnSearch().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	 UHID_number =cancelCheckinpage.getCancelCheckIn_uhidsearchUHIDgetDynamicaly().getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		System.out.println(UHID_number);
		cancelCheckinpage.getPatientSearchCloseButton().click();
}//Registration_Cancel check in_04
@Test(priority =5)
public void Registration_Cancel_check_in_04() throws InterruptedException {
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.imgcheckInnosearch().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getUhidSearchUHIDTextBox().sendKeys(UHID_number);
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getbtnSearch().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getrdbUhid().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getbtnSelect().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	Thread.sleep(2000);
	cancelCheckinpage.getbtnCancel().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	String getInformation= cancelCheckinpage.getMyInformationMessageText().getText();
	System.out.println(getInformation);
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getMyMessageBoxSuccusButtonYes().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	assertEquals(getInformation, "Select atleast one Record");
	
}
@Test(priority = 6)
public void Registration_Cancel_check_in_01() {
	cancelCheckinpage.getchkCancel().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getbtnCancel().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	
	String Succusmessage=cancelCheckinpage.getMyMessageBoxSuccusButtonText().getText();
	System.out.println(Succusmessage);
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getMyMessageBoxSuccusButtonYes().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	assertEquals(Succusmessage, "Checkin(s) Cancelled Successfully");
	
}
@Test(priority = 7)
public void Registration_Cancel_check_in_05() {
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getbtnClear().click();
	
}
@Test(priority = 8)
public void Registration_Cancel_check_in_03() {
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getImgUhidSearch().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getCancelCheckIn_uhidsearchtxtbox().sendKeys(prop.getProperty("IPNumber"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getbtnSearch().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl09_rdbTemp")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	cancelCheckinpage.getbtnSelect().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
//	String GetInformationtext=cancelCheckinpage.getMyInformationMessageText().getText();
//	System.out.println(GetInformationtext);
//	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
//	cancelCheckinpage.getMyMessageBoxSuccusButtonYes().click();
//	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
//	assertEquals(GetInformationtext, "No Record(s) Found");
}
@Test(priority = 9)
public void Registration_Cancel_check_in_06() {
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
cancelCheckinpage.getImgUhidSearch().click();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
cancelCheckinpage.getCancelCheckIn_uhidsearchtxtbox().sendKeys(prop.getProperty("IPNumber"));
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
cancelCheckinpage.getbtnSearch().click();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
cancelCheckinpage.getrdbUhid().click();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
cancelCheckinpage.getbtnSelect().click();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
cancelCheckinpage.getchkCancel1().click();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
cancelCheckinpage.getchkCancel2().click();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
cancelCheckinpage.getbtnCancel().click();

}
}
