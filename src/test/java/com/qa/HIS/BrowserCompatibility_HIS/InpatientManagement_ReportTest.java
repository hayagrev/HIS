package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_Reportspages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class InpatientManagement_ReportTest extends CrossBrowser {
public InpatientManagement_ReportTest() {
	
}
util utilobj = new util();
Loginpage loginpage;
HomePage homepage;
SelectHospitalLocationPage selecthospitallocationpage;
HISHomePage hishomepage;
InpatientManagement_Reportspages IMR;
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

	IMR = hishomepage.doNavigateToInpatientmanagementReports();	
	}
@Test(priority =4)
@Parameters("browser")
public void IPM_Inpatient_Management_Reports_TC_1(String Browser) throws InterruptedException {

IMR.getDischargeIntimation().click();
WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
wait.until(ExpectedConditions.visibilityOf(IMR.getpreviewButton()));
IMR.getpreviewButton().click();
wait.until(ExpectedConditions.visibilityOf(IMR.getExportButton()));
}
@Test(priority =5)
@Parameters("browser")
public void IPM_Inpatient_Management_Reports_TC_2(String Browser) throws InterruptedException {
	
String parent3 = driver.getWindowHandle();
Thread.sleep(2000);
utilobj.Window(driver);
Thread.sleep(2000);
IMR.getExportButton().click();
Thread.sleep(2000);
utilobj.ChildWindow(driver);
Thread.sleep(1000);
System.out.println(driver.getTitle());
Thread.sleep(2000);
utilobj.selectDropdown(IMR.getFormateDDl(), driver, "Acrobat Format (PDF)", Browser);
Thread.sleep(2000);
IMR.getOKButton().click();
//Thread.sleep(2000);
//driver.close();
Thread.sleep(2000);
driver.switchTo().window(parent3);
}
@Test(priority =6)
public void IPM_Inpatient_Management_Reports_TC_7() throws InterruptedException {
Thread.sleep(2000);
String parent4 = driver.getWindowHandle();
Thread.sleep(2000);
utilobj.Window(driver);
Thread.sleep(2000);
IMR.getprintButton().click();
//WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
//wait.until(ExpectedConditions.visibilityOf(IMR.getOKButton()));
Thread.sleep(2000);
utilobj.ChildWindow(driver);
Thread.sleep(2000);
IMR.getOKButton().click();
Thread.sleep(2000);
driver.switchTo().window(parent4);
}
}
