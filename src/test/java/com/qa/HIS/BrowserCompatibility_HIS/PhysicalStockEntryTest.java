package com.qa.HIS.BrowserCompatibility_HIS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PhysicalStockEntryPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class PhysicalStockEntryTest  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	PhysicalStockEntryPage physicalStockEntrypage;
	String EntryNo;
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"),Browser);
	}
	
	
	@Test(priority = 3)
	public void doNavigateToPhysicalStockEntryLink() {

		physicalStockEntrypage = hishomepage.doNavigateToPhysicalStockEntryLink();
	}

			
	@Test(priority =4)
	public void TC_Store_Physical_Stock_Entry_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";


		String MedicineName=prop.getProperty("itemname");
		
		
		
		Thread.sleep(2000);
		physicalStockEntrypage.getbtnSearch().click();
		Thread.sleep(2000);
		physicalStockEntrypage.gettxtName().sendKeys(MedicineName);

		physicalStockEntrypage.getbtnSearchpopup().click();
		Thread.sleep(2000);
	}
	@Test(priority =5)
	public void TC_Store_Physical_Stock_Entry_005() throws InterruptedException, IOException {
		String Mrp="5";
		String Quantity="1000";
		String perRate="1",Batch="ABC",ExpiryDate="01-Feb-2030",MFDate="01-Feb-2020",Remarks="Test Remarks";
		Thread.sleep(2000);
		physicalStockEntrypage.getgridrecord().click();
		Thread.sleep(2000);
		physicalStockEntrypage.getbtnSelect().click();
		
		
		Thread.sleep(10000);

		//utilobj.JSEnterText(gettxtQty(), driver, "100");
		
		physicalStockEntrypage.gettxtQty().sendKeys(Quantity);
		Thread.sleep(2000);
		physicalStockEntrypage.gettxtPRate().sendKeys(perRate);
		Thread.sleep(2000);
		physicalStockEntrypage.gettxtMRP().sendKeys(Mrp);
		Thread.sleep(2000);
		physicalStockEntrypage.gettxtBatch().sendKeys(Batch);
		Thread.sleep(2000);
		physicalStockEntrypage.gettxtExpiryDate().sendKeys(ExpiryDate);
		Thread.sleep(2000);
		physicalStockEntrypage.gettxtMFDDate().sendKeys(MFDate);
		Thread.sleep(2000);
		physicalStockEntrypage.gettxtRemarks1().sendKeys(Remarks);
		Thread.sleep(2000);
}
	@Test(priority =6)
public void  TC_Store_Physical_Stock_Entry_006() throws InterruptedException {
	
		physicalStockEntrypage.getbtnSave().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(physicalStockEntrypage.getpopupok()));
		Thread.sleep(2000);
		physicalStockEntrypage.getpopupok().click();
	 EntryNo=	driver.findElement(By.id("ctl00_cphpage_txtEntry")).getAttribute("value");
	System.out.println(EntryNo);
//		Thread.sleep(2000);
//		String[] valuetoinsert= {MedicineName,Quantity,perRate,Mrp,Batch,ExpiryDate,MFDate,Remarks};
//		utilobj.writeExcel(path, "ExportExcelFile.xlsx", "AlterMrp", valuetoinsert);
//		
		
	}
	@Test(priority =7)
public void  TC_Store_Physical_Stock_Entry_007() throws InterruptedException {
	Thread.sleep(2000);
	String parent3 = driver.getWindowHandle();
	Thread.sleep(2000);
	utilobj.Window(driver);
	Thread.sleep(2000);
	physicalStockEntrypage.getPrintButton().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(parent3);
}
	@Test(priority =8)
public void TC_Store_Physical_Stock_Entry_008() throws InterruptedException {
	Thread.sleep(2000);
	physicalStockEntrypage.getClearButton().click();
}
	@Test(priority =9)
public void TC_Store_Physical_Stock_Entry_012() throws InterruptedException {
	Thread.sleep(2000);
	String parent3 = driver.getWindowHandle();
	Thread.sleep(2000);
	utilobj.Window(driver);
	Thread.sleep(2000);
	physicalStockEntrypage.getEntryNoImage().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
	physicalStockEntrypage.getSerachPhysicalStockEnryRadiobutton().click();
	Thread.sleep(2000);
physicalStockEntrypage.getSerachPhysicalStockEnrySelectButton().click();
	Thread.sleep(2000);
	driver.switchTo().window(parent3);
}
	
	
}
