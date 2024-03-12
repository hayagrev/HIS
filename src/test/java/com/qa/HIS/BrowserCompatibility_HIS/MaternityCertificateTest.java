package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.apache.xmlbeans.XmlException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MaternityCertificatepages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class MaternityCertificateTest extends CrossBrowser {
	public MaternityCertificateTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	MaternityCertificatepages MC;
	util utilobj=new util();
	
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
	}
	@Test(priority =3)
	public void doNavigateToClinicalRecord_genrate_certificate() throws InterruptedException, AWTException {
		MC=hishomepage.doNavigatematernitycertificagte();
		
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void testcaseforMaternityCertification_SaveANDclear(String Browser) throws InterruptedException, AWTException, IOException, XmlException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		
		Thread.sleep(2000);
	MC.getMaternitycertification_IPnoLink().click();
		Thread.sleep(4000);
		utilobj.selectDropdown(MC.getMaternitycertification_IPno_DDLLink(), driver, "Equals", Browser);
		Thread.sleep(2000);
		MC.getMaternitycertification_IPno_searchtextboxLink().sendKeys("1199900090");
		Thread.sleep(4000);
		MC.getMaternitycertification_IPno_searchbuttonlink().click();
		wait.until(ExpectedConditions.visibilityOf(MC.getMaternitycertification_IPno_selectRadioButtonLink()));
		
		Thread.sleep(4000);
		MC.getMaternitycertification_IPno_selectRadioButtonLink().click();
		Thread.sleep(4000);
		MC.getMaternitycertification_IPno_selectButtonLink().click();
		wait.until(ExpectedConditions.invisibilityOf(MC.getBlackOverlay()));
		Thread.sleep(4000);
		MC.getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys("22");
		Thread.sleep(4000);
		MC.getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		MC.getMaternitycertification_layout_certificateOfpregnancyradiobuttonLink().click();
		Thread.sleep(4000);
		MC.getMaternitycertification_layout_certificateOfpregnancy_RemarxLink().sendKeys("...........TestRemarks.........");
		  Thread.sleep(4000);
		  MC.getMaternitycertification_Layout_DurationofpragnancytxtboxLink().clear();
		  Thread.sleep(4000);
		  MC.getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys("37");
		  Thread.sleep(4000);
		  MC. getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys(Keys.ENTER);
		  Thread.sleep(4000);
		  MC.getMaternitycertification_layout_certificateofconfinementform18RadioButton().click();
		  Thread.sleep(2000);
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		  Calendar cal = Calendar.getInstance();
		  String Date = sdf.format(cal.getTime());
		  System.out.println(Date);
		  Thread.sleep(4000);
		  utilobj.JSEnterText(MC.getMaternitycertification_Layout_DateOfConfinement(), driver, Date);
		  Thread.sleep(4000);
		  cal.add(Calendar.DAY_OF_MONTH, 1);
		  String newDate = sdf.format(cal.getTime());
		  System.out.println(newDate);
		  Thread.sleep(4000);
		  utilobj.selectDropdown(MC.getMaternitycertification_layout_outcomeofpregnancyDDL(), driver, "Live Birth",Browser);
		  Thread.sleep(4000);
		  MC.getMaternitycertification_layout_Placeofconfinementtxtbox().sendKeys("test hospital");
		  Thread.sleep(4000);
		  MC.getMaternitycertification_layout_Remarks().sendKeys("Test Remarks...");
		  Thread.sleep(4000);
		  utilobj.JSEnterText(MC.getMaternitycertification_layout_IWintend(), driver, newDate);
		  Thread.sleep(4000);
		  utilobj.JSClick(MC.getMaternitycertification_SaveButton(),driver);
		  wait.until(ExpectedConditions.visibilityOf(MC.getMaternitycertification_SaveButtonSuccesOK()));

		MC.getMaternitycertification_SaveButtonSuccesOK().click();
		

		  String certificationNo=driver.findElement(By.id("ctl00_cphpage_txtCertificateno")).getAttribute("value");
		  Thread.sleep(2000);
		  System.out.println(certificationNo);
		  
		  String parent3 = driver.getWindowHandle();
			Thread.sleep(2000);
			utilobj.Window(driver);
			Thread.sleep(1000);
			MC.getMaternitycertification_printButton().click();
			Thread.sleep(3000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			System.out.println("hello window handle");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(parent3);
			Thread.sleep(1000);
			MC.getMaternitycertification_ClearButton().clear();
			Thread.sleep(1000);

	}


}
