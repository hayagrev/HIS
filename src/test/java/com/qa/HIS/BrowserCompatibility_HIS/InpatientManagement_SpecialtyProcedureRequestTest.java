package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_specialtyprocedurerequestpages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;



public class InpatientManagement_SpecialtyProcedureRequestTest extends CrossBrowser {
    
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_specialtyprocedurerequestpages IMSPR;
     public InpatientManagement_SpecialtyProcedureRequestTest(){
		
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
 	@Test(priority =3)
 	public void doNavigateToSpecialityProcedure() throws InterruptedException {

 		IMSPR = hishomepage.donavigatetoSpecilityProcedureOrdertest();
 	}

 	
	  @Test(priority = 4)
	  public void IPM_Specialty_Procedure_Request_TC_3() throws InterruptedException, AWTException {

      
		  Thread.sleep(3000);
		IMSPR.getSearchBed().click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(IMSPR.getBednametxtbox()));
		IMSPR.getBednametxtbox().sendKeys("Fbed6");//female med bed 002 
		Thread.sleep(1000);
		
		IMSPR.getSearchbtn().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOf(IMSPR.getprocessImage()));
		IMSPR.getRadiobtnselect().click();
		Thread.sleep(1000);
		
		IMSPR.getSelectbtn().click();
		Thread.sleep(3000);
		
		//Selecting the date of surgery	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		//Getting current date
		Calendar cal = Calendar.getInstance();
		//Displaying current date in the desired format
		System.out.println("Current Date: "+sdf.format(cal.getTime()));
				   
		//Number of Days to add
	    cal.add(Calendar.DAY_OF_MONTH, 1);  
		//Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());  
	    //Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+newDate);  
		
		IMSPR.getDateSelect().clear();
		IMSPR.getDateSelect().click();
		IMSPR.getDateSelect().sendKeys(newDate);
		Thread.sleep(1000);
		IMSPR.getDateSelect().sendKeys(Keys.TAB);
	  }
	  @Test(priority = 5)
	 public void  IPM_Specialty_Procedure_Request_TC_4() throws InterruptedException{
		  
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));		
		IMSPR.getSearchProcedureicon().click();
		Thread.sleep(1000);
		
		
		
		
		wait.until(ExpectedConditions.visibilityOf(IMSPR.getProcedureNametxtbox())); 
		IMSPR.getProcedureNametxtbox().sendKeys("Bandaging and dressing");
		Thread.sleep(1000);
		
		IMSPR.getSearchbtn1().click();
		wait.until(ExpectedConditions.visibilityOf(IMSPR.getRadiobtnselect1()));
		IMSPR.getRadiobtnselect1().click();
		Thread.sleep(1000);
		
		IMSPR.getSelect1().click();
		wait.until(ExpectedConditions.invisibilityOf(IMSPR.getSelect1()));
	  }
		@Test(priority = 6)
		public void IPM_Specialty_Procedure_Request_TC_1() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		Thread.sleep(3000);
		utilobj.JSClick(IMSPR.getSave(), driver);
	
		wait.until(ExpectedConditions.invisibilityOf(IMSPR.getprocessImage()));
		IMSPR.getSuccessMessageOkButton().click();
	    }
	
	
	
	
}
