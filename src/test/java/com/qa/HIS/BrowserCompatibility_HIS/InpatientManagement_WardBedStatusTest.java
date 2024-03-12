package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;

import com.qa.pages.InpatientManagement_wardbedstatuspages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


public class InpatientManagement_WardBedStatusTest extends CrossBrowser {
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	util utilobj = new util();
	InpatientManagement_wardbedstatuspages IM_WSP;
     public InpatientManagement_WardBedStatusTest(){
		
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
  	@Test(priority = 3)
  	public void donaviagteWardBedStatus() {
  		IM_WSP=hishomepage.donavigatetoWardBedStatus();
  	}
	  @Test(priority = 4)
	  @Parameters("browser")
	  public void WardBedStatus(String Browser) throws InterruptedException, AWTException 
	  {
	
		IM_WSP.getPlusicon().click();
			Thread.sleep(2000);
			
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlView")), driver, "Icons",Browser);
			Thread.sleep(6000);
			for(int i=1;i<=13;i+=2) {
				
				if(i<11) {
				driver.findElement(By.id("ctl00_cphpage_lstLegend_ctrl0_ctl0"+i+"_imgLegendButton")).click();
				Thread.sleep(2000);
				}
				else {
					driver.findElement(By.id("ctl00_cphpage_lstLegend_ctrl0_ctl"+i+"_imgLegendButton")).click();
					Thread.sleep(2000);
					
				}				
			}
			driver.findElement(By.id("ctl00_cphpage_lstLegend_ctrl0_ctl05_imgLegendButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_ListViewThumb_ctrl0_ctl01_imgButton")).click();
	    }	  	
	}