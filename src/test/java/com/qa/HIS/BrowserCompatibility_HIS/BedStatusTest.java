package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class BedStatusTest extends CrossBrowser {

	public BedStatusTest() {
		// TODO Auto-generated constructor stub
	}

	util utilobj=new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	
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
	public void doNavigateToBedStatusLink() throws InterruptedException {

		bedstatuspage = hishomepage.doNavigateToBedStatusLink();
		
		
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void Registration_Bed_Status_TC_1(String Browser) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(2000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_selectview(), driver, "Icons",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(bedstatuspage.getBedStatus_Ward(), driver, "Female medical ward",Browser);
		Thread.sleep(2000);
		bedstatuspage.getBedStatus_AllocateNotocupied().click();
		Thread.sleep(2000);
		boolean statusofward=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div")).isDisplayed();
		if(statusofward==true) {
			String text=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div")).getText();
		System.out.println(text);
		}
		else {
			
		
		bedstatuspage.getBedStatus_bedDetail().click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		utilobj.SwitchToChildWindow(driver, "BedDetails");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		bedstatuspage.getBedStatus_bedDetail_closeButton().click();
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
		Thread.sleep(2000);
		}
	}
		@Test(priority = 5)
		public void Registration_Bed_Status_TC_2() throws InterruptedException {
			
		
		bedstatuspage.getBedStatus_Ocupied().click();
		Thread.sleep(2000);
		boolean statusofward=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div")).isDisplayed();
		if(statusofward==true) {
			String text=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div")).getText();
		System.out.println(text);
		}
		else {
		bedstatuspage.getBedStatus_bedDetail().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		utilobj.SwitchToChildWindow(driver, "BedDetails");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		bedstatuspage.getBedStatus_bedDetail_closeButton().click();
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
		Thread.sleep(2000);
		}
	
		}
	@Test(priority = 6)
	public void Registration_Bed_Status_TC_4() throws InterruptedException {
		Thread.sleep(2000);
		bedstatuspage.getBedStatus_ExtraBed().click();
	}
	@Test(priority = 7)
	public void Registration_Bed_Status_TC_3() throws InterruptedException {
		Thread.sleep(2000);
		bedstatuspage.getBedStatus_Vecant().click();
		Thread.sleep(2000);
		boolean statusofward=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div")).isDisplayed();
		if(statusofward==true) {
			String text=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div")).getText();
		System.out.println(text);
		}
		else {
		bedstatuspage.getBedStatus_bedDetail().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.switchTo().alert().accept();
		String bedname=bedstatuspage.getddlBed().getText();
		System.out.println(bedname);
		}
	}


}
