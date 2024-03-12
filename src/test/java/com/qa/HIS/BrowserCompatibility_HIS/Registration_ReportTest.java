package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;

import com.qa.pages.Loginpage;
import com.qa.pages.Registration_ReportPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Registration_ReportTest extends CrossBrowser {
	public Registration_ReportTest() {
		// TODO Auto-generated constructor stub
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Registration_ReportPages RRP;
	util utilobj=new util();
	String NextWeakday;
	String nextDate;
	String Currentdate;
	String CurrentWeekDay;
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
	@Test(priority = 3)
	public void DoNatigatetoLinkRegistration_Report() {
		RRP=hishomepage.donavigatetoRegistration_Report();
	}
	@Test(priority = 4)
	public void RegistrationReport_TC_1() throws AWTException, InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-EEEE");
		  Calendar cal = Calendar.getInstance();
String Date = sdf.format(cal.getTime());
System.out.println(Date);
//cuttent date formating
CurrentWeekDay=Date.substring(Date.indexOf("-")+1, Date.length());
System.out.println(CurrentWeekDay);
Currentdate=Date.substring(0, Date.indexOf("-"));
System.out.println(Currentdate);

cal.add(Calendar.DAY_OF_MONTH, 1);
String newDate = sdf.format(cal.getTime());
//next date formating
System.out.println(newDate);
System.out.println(newDate.indexOf("-"));
NextWeakday=newDate.substring(newDate.indexOf("-")+1, newDate.length());
System.out.println(NextWeakday);
nextDate=newDate.substring(0, newDate.indexOf("-"));
System.out.println(nextDate);


RRP.getOPD_Check_In_Vs_DoctorLink_Visits().click();
WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
wait.until(ExpectedConditions.visibilityOf(RRP.getDispensary_Report_FO_List_RegistrationDate()));
RRP.getDispensary_Report_FO_List_RegistrationDate().click();
Thread.sleep(4000);
String text=driver.findElement(By.xpath("//*[@title='"+NextWeakday+", March "+nextDate+", 2022']")).getText();
System.out.println("the next dayis -"+text);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@title='"+NextWeakday+", March "+nextDate+", 2022']")).click();
Thread.sleep(2000);
String TextOfMessage=driver.switchTo().alert().getText();
System.out.println(TextOfMessage);
Thread.sleep(2000);
driver.switchTo().alert().accept();
Thread.sleep(2000);
assertEquals(TextOfMessage, "From Date Cannot be Greater than Current Date");

	}
	@Test(priority = 4)
	public void RegistrationReport_TC_2() throws InterruptedException, AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		Thread.sleep(2000);
		RRP=hishomepage.donavigatetoRegistration_Report();
		Thread.sleep(2000);
		RRP.getOPD_Check_In_Vs_DoctorLink_Visits().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(RRP.getDispensary_Report_FO_List_RegistrationDate()));
		RRP.getDispensary_Report_FO_List_RegistrationDate().click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@title='"+CurrentWeekDay+", March "+Currentdate+", 2022']")).click();
		Thread.sleep(4000);
		RRP.getDispensary_Report_FO_List_previewButton().click();
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[2]/input")));
//		
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void RegistrationReport_TC_3(String Browser) throws InterruptedException {
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportREport().click();
		Thread.sleep(1000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		String Title=driver.getTitle();
		System.out.println(Title);
		utilobj.selectDropdown(RRP.getDispensary_Report_FO_List_ExportthereportDLL(), driver, "Acrobat Format (PDF)",Browser);
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ExportReport_SubmitButton().click();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(parent3);
		Thread.sleep(1000);
		assertEquals(Title, "Export the Report");
	}
	@Test(priority = 6)
	public void RegistrationReport_TC_4() throws InterruptedException {
		Thread.sleep(1000);
		RRP.getDispensary_Report_FO_List_ClearButton().click();
	}

}
