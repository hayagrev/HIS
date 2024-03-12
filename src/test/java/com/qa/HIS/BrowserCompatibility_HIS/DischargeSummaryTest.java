package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.DischargeSummaryPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class DischargeSummaryTest extends CrossBrowser {

	public DischargeSummaryTest() {

	}
	util utilobj = new util();
  Loginpage loginpage;
  HomePage homepage;
  SelectHospitalLocationPage selecthospitallocationpage;
  HISHomePage hishomepage; 
  DischargeSummaryPage DSP;
  String parent3;
  @Test(priority = 0) 
  public void doLoginTest() {
  
  loginpage = new Loginpage(driver);
  
  homepage = loginpage.doLogin(prop.getProperty("uidd"),
  prop.getProperty("StagingPass"));
  
  }
  
  @Test(priority = 1) 
  public void doNavigateToSelectHospitalLocationTest() {
  
  selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation(); }
  
  @Test(priority = 2) 
  @Parameters("browser")
  public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {
  
  hishomepage =  selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
  }
  
  @Test(priority = 3)
  public void doNavigateTogetDischargeSummaryLinkTest() {
  
  DSP = hishomepage.doNavigateToDischargeSummaryLink();
  }
  
  @Test(priority = 4) 
  public void CLM_Discharge_Summary_TC_7() {
	  
	  DSP.getSaveBtn().click();
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
	  wait.until(ExpectedConditions.visibilityOf(DSP.getOkPopup()));
	  String Message=DSP.getpopupMessageText().getText();
	  System.out.println(Message);
	  DSP.getOkPopup().click();
  assertEquals(Message, "Enter Admission Number");
  }
  @Test(priority = 5)
 @Parameters("browser")
  public void CLM_Discharge_Summary_TC_6(String Browser) throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		utilobj.ActionClick( DSP.getAdmissionSearchBtn(), driver);
		
	Thread.sleep(2000);
		
	DSP.getAdmissionSearchTextBox().click();
	Thread.sleep(2000);
	DSP.getAdmissionSearchTextBox().sendKeys("IP0");
	Thread.sleep(1000);
	DSP.getSearchBtn().click();
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(DSP.getChkBox()));
	DSP.getChkBox().click();
	Thread.sleep(1000);
	DSP.getSelectBtn().click();
	wait.until(ExpectedConditions.invisibilityOf(DSP.getBlackOverlay()));
//		Thread.sleep(2000);
//		 DSP.getSaveBtn().click();
//		wait.until(ExpectedConditions.visibilityOf( DSP.getOkPopup()));
//		 DSP.getOkPopup().click();
		Thread.sleep(2000);
		parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		 DSP.getprintBtn().click();
		Thread.sleep(2000);	
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);	
		
		utilobj.selectDropdown( DSP.gettemplateScreenBtnDDl(), driver, "Discharge Summary",Browser);
		Thread.sleep(1000);
		 DSP.gettemplateScreenOK().click();
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//html//body//iframe[@id='txtEditor_ctl02_ctl02']")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/p[10]/b/u")));
		

		Thread.sleep(5000);	
  }
  @Test(priority = 6)
  public void CLM_Discharge_Summary_TC_10() throws InterruptedException, AWTException {
	  driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
	  Thread.sleep(2000);
		String parent4 = driver.getWindowHandle();
		utilobj.Window(driver);
		DSP.getClinicalSummary().click();
		Thread.sleep(2000);	
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);	
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		DSP.getClinicalSummaryEditBtn().click();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		DSP.getDoneBtn().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent4);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		 DSP.getSaveBtn().click();
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
			wait.until(ExpectedConditions.visibilityOf( DSP.getOkPopup()));
		 Thread.sleep(2000);
//		 DSP.getOkPopup().click();
  }
//  @Test(priority = 7)
//  @Parameters("browser")
//  public void C13511_1(String Browser) throws InterruptedException {
//	  DSP.getOkPopup().click();
//	  Thread.sleep(2000);
//	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
//	  DSP.getChangeLocationLink().click();//
//	  Thread.sleep(2000);
//	  hishomepage =  selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), "STORE SERVICE",Browser); 
//	  Thread.sleep(2000);
//utilobj.MoveElement(DSP.getStoresLink(), driver);
//wait.until(ExpectedConditions.visibilityOf(DSP.getPharmacyIssueLink()));
//DSP.getPharmacyIssueLink().click();
//Thread.sleep(2000);
//DSP.getIPNumberTextbox().sendKeys("1199900090");
//DSP.getLinktext().click();
//wait.until(ExpectedConditions.visibilityOf(DSP.getUhidCheckBox()));
//DSP.getUhidCheckBox().click();
//DSP.getSelectButton().click();
//wait.until(ExpectedConditions.invisibilityOf(DSP.getBlackOverlay()));
//DSP.getPrescriptionDDL().click();
//
//  }
//  @Test(priority = 8)
//  @Parameters("browser")
//  public void C13511_2(String Browser) throws InterruptedException, AWTException {
//	  Thread.sleep(2000);
//	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
//	  Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		DSP.getViewButton().click();
//		wait.until(ExpectedConditions.visibilityOf(DSP.getCloseButton()));
//  }
  }
