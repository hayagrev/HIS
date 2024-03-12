package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_warddashboardpages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class InpatientManagement_WardDashBoardTest extends CrossBrowser {
    
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_warddashboardpages IM_WDB;
     public InpatientManagement_WardDashBoardTest(){
		
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
public void doNavigateToWarddeshbord() {
	IM_WDB=hishomepage.doNavigateTogetwarddeshboard();
}

	  @Test(priority = 4)
	  public void IPM_Ward_Dashboard_TC_2() throws InterruptedException, AWTException {

		
		
		
		//Get all the links with the link text of value 1 in the webelement link
        List<WebElement> link=driver.findElements(By.linkText("1"));
       
		System.out.println(link.size());
		
		for(int i=0;i<link.size();i++)
    	{
			if(!(link.get(i).getText().isEmpty()))
			{
				System.out.println(link.get(i).getText());
				if(link.get(i).getText()=="1")
					Thread.sleep(2000);
			
				link.get(i).click();
				Thread.sleep(2000);
			
			   
				IM_WDB.getAdmissionnolink().click();
		        Thread.sleep(6000);
		        WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		        wait.until(ExpectedConditions.visibilityOf(IM_WDB.getBackbtn()));
		        IM_WDB.getBackbtn().click();
	    	    Thread.sleep(2000);
	    		break;
			}
    	}	
	  }
		@Test(priority = 5)
		public void IPM_Ward_Dashboard_TC_3() throws InterruptedException {
			
		
		IM_WDB.getPreviousDate().click();
		Thread.sleep(2000);
		IM_WDB.getCurrentDate().click();
		
		
	    }
	 
	
	
}
