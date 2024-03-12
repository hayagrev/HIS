package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OrderPacksPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class OrderPacksTest extends CrossBrowser {

	public OrderPacksTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OrderPacksPage   orderpackspage;
	boolean InvestigationSearch;
	String OrderPackName;
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
	public void doNavigateToOrderPacksTest()  {
		
		orderpackspage = hishomepage.doNavigateToOrderPacks();
	}
	
	@Test(priority=4)
	@Parameters("browser")
	public void CLM_Order_Packs_TC_03(String Browser) throws InterruptedException{
		
//		orderpackspage.doOrderPacks(prop.getProperty("OrderPacks"),prop.getProperty("TestName"),prop.getProperty("Quantity"),
		//prop.getProperty("DrugName"),prop.getProperty("DoseType"),prop.getProperty("Frequency"),
//				       prop.getProperty("Admin_Route"),prop.getProperty("TestName1"),prop.getProperty("Diagnosis_Search"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		Random F=new Random();
		int Num=F.nextInt(2000);
		OrderPackName=prop.getProperty("OrderPacks")+"_"+Num;
		System.out.println(OrderPackName);
		Thread.sleep(2000);
		orderpackspage.getOrderPacks().sendKeys(OrderPackName);
		
	/*Investigations*/	
	/*
	 * String parent3 = driver.getWindowHandle();
	 * 
	 * utilobj.Window(driver);
	 * 
	 * orderpackspage.getInvestigations().click(); Thread.sleep(2000);
	 * utilobj.ChildWindow(driver); Thread.sleep(1000);
	 * System.out.println(driver.getTitle());
	 * 
	 * 
	 * utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver,
	 * prop.getProperty("TestName")); Thread.sleep(2000);
	 * utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
	 * Thread.sleep(2000); utilobj.JSClick(orderpackspage.getWindowCheckBox(),
	 * driver); Thread.sleep(2000);
	 * utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
	 * //driver.close(); Thread.sleep(1000); driver.switchTo().window(parent3);
	 * Thread.sleep(10000);
	 */
		 
//	 InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
//		if(InvestigationSearch==true) {
		orderpackspage.getInvestigations().click();
			orderpackspage.getTestName().sendKeys(prop.getProperty("TestName"));
			orderpackspage. getSearchBtn().click();
			orderpackspage.getChkBox().click();
			Thread.sleep(2000);
			orderpackspage.getSelectBtn().click();
			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
			 wait.until(ExpectedConditions.invisibilityOf(orderpackspage.getSelectBtn()));
			 Thread.sleep(2000);
		utilobj.JSEnterText(orderpackspage.getQuantity(), driver, "1"); 
		 Thread.sleep(2000);
		 orderpackspage.getTickMark().click();
		Thread.sleep(4000);
		/*Medications*/
		/*
		 * orderpackspage.getMedications().click(); String parent4 =
		 * driver.getWindowHandle();
		 * 
		 * utilobj.Window(driver);
		 * 
		 * orderpackspage.getDrugSearchBtn().click(); Thread.sleep(2000);
		 * utilobj.ChildWindow(driver); Thread.sleep(1000);
		 * System.out.println(driver.getTitle());
		 * 
		 * 
		 * utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver, "abaca");
		 * Thread.sleep(2000);
		 * utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
		 * Thread.sleep(2000); utilobj.JSClick(orderpackspage.getWindowDrugChkBx(),
		 * driver); Thread.sleep(2000);
		 * utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
		 * //driver.close(); Thread.sleep(1000); driver.switchTo().window(parent4);
		 * Thread.sleep(2000);
		 */
		
//		 InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
//		if(InvestigationSearch==true) {
		orderpackspage.getMedications().click();
		Thread.sleep(2000);
		orderpackspage.getDrugSearchBtn().click(); 
			orderpackspage.getDrugName().sendKeys("abaca");
			orderpackspage.getDrugNameSearchBtn().click();
			Thread.sleep(2000);
			orderpackspage.getDrugNameChkBx().click();
			orderpackspage.getDrugSelectBtn().click();
			Thread.sleep(2000);
			orderpackspage.getDoseQty().clear();
			
			 wait.until(ExpectedConditions.invisibilityOf(orderpackspage.getSelectBtn()));
				/*
				 * }
				 * 
				 * else { }
				 */
		 Thread.sleep(2000);
		orderpackspage.getDoseQty().clear();
			 Thread.sleep(2000);
			 orderpackspage.getDoseQty().sendKeys("1");
		Thread.sleep(2000);
		utilobj.selectDropdown(orderpackspage.getDoseType(), driver, prop.getProperty("DoseType"), Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(orderpackspage.getFrequency(), driver, prop.getProperty("Frequency"), Browser);
		
		Thread.sleep(2000);
		orderpackspage.getDuration().sendKeys("3");
		 Thread.sleep(4000);
		 utilobj.selectDropdown(orderpackspage.getAdmin_Route(), driver,"ORAL / BY MOUTH", Browser);
		 //orderpackspage.getAdmin_Route().sendKeys(prop.getProperty("Admin_Route"));
		 Thread.sleep(2000);
		 orderpackspage.getTotal_Strength().sendKeys("3");
		 Thread.sleep(2000);
		 utilobj.selectDropdown(orderpackspage.getTotal_Strength_drpdwn(), driver,prop.getProperty("DoseType"), Browser);
		// orderpackspage.getTotal_Strength_drpdwn().sendKeys(prop.getProperty("DoseType"));
		 Thread.sleep(2000);
		 orderpackspage. getRemarks().sendKeys("Test");
		 Thread.sleep(2000);
		 orderpackspage.getMedication_Tick().click();
		 Thread.sleep(2000);
		 orderpackspage.getSaveBtn().click();
			Thread.sleep(2000);
			orderpackspage.getpopup().click();
}
	@Test(priority = 5)
	public void CLM_Order_Packs_TC_06() throws InterruptedException {
	/*Diagnosis*/	
		orderpackspage = hishomepage.doNavigateToOrderPacks();//open window again
		Thread.sleep(2000);
		String parent4 = driver.getWindowHandle();

		utilobj.Window(driver);

		driver.findElement(By.id("ctl00_cphpage_ImgName")).click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver, OrderPackName);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getWindowDrugChkBx(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
		//driver.close();
		Thread.sleep(1000);
		 driver.switchTo().window(parent4);
		Thread.sleep(2000);		
		orderpackspage.getDiagnosis().click();
	Thread.sleep(2000);
	orderpackspage.getDiagnosis_Search().sendKeys(prop.getProperty("Diagnosis_Search"));
	Thread.sleep(2000);
	orderpackspage.getCovid().click();
	Thread.sleep(2000);
	orderpackspage.getDiagnosis_Tick().click();
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[4]/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[1]/a")).click();
	Thread.sleep(2000);
String Status=driver.findElement(By.id("ctl00_cphpage_tabSearch_tabPnlDiagnosis_gdvDiagnosis_ctl02_status")).getText();
Thread.sleep(2000);
System.out.println(Status);
Thread.sleep(2000);
assertEquals(Status, "Deleted");
}
	@Test(priority = 6)
	public void CLM_Order_Packs_TC_04() throws InterruptedException {
		Thread.sleep(2000);
		orderpackspage.getSaveBtn().click();
		Thread.sleep(2000);
		orderpackspage.getpopup().click();
		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void CLM_Order_Packs_TC_07() throws InterruptedException {
		Thread.sleep(2000);
		orderpackspage.getSaveBtn().click();
		Thread.sleep(2000);
		orderpackspage.getpopup().click();
		boolean warningmsg=orderpackspage.getpopup().isDisplayed();
		assertEquals(warningmsg, true);
	}
	
}