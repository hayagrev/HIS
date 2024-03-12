package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_nursetaskspages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


public class InpatientManagement_NurseTasksTest extends CrossBrowser {
  
	
	  
    public InpatientManagement_NurseTasksTest(){
		
	   }
	
    util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_nursetaskspages IPM_NT;
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
	public void doNavigateTONurseTask() {
		IPM_NT=hishomepage.donavigatetoNurseTask();
	}

	  @Test(priority = 4)
	  @Parameters("browser")
	  public void IPM_Nurse_Tasks_TC_3(String Browser) throws InterruptedException, AWTException {
		  WebDriverWait wait =new WebDriverWait(driver, Duration.ofMinutes(4));
		  
		  IPM_NT.getBedsearchicon().click();
		  wait.until(ExpectedConditions.visibilityOf(IPM_NT.getPatientnametxtbox()));
		Thread.sleep(3000);
//		Actions ac=new Actions(driver);
//		ac.moveToElement(IPM_NT.getDropdown1()).click().moveToElement(IPM_NT.getDropdownclauseValue()).click().build().perform();
		utilobj.selectDropdown(IPM_NT.getDropdown1(), driver, "Starts With", Browser);
//		utilobj.selectDropdown(Dropdown1, driver, "Starts With");
		//Dropdown1.sendKeys("Starts With");
		Thread.sleep(3000);
		
		
		IPM_NT.getPatientnametxtbox().sendKeys("IP0");
		Thread.sleep(1000);
		
		IPM_NT.getSearch().click();
		wait.until(ExpectedConditions.invisibilityOf(IPM_NT.getprocessImage()));
		//Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.visibilityOf(IPM_NT.getRadiobtn1()));
		IPM_NT.getRadiobtn1().click();
		Thread.sleep(1000);
		
		IPM_NT.getSelect().click();
		wait.until(ExpectedConditions.invisibilityOf(IPM_NT.getSelect()));	
	  }
	  @Test(priority = 5)
	  @Parameters("browser")
	  public void IPM_Nurse_Tasks_TC_1(String Browser) throws InterruptedException {
		  WebDriverWait wait =new WebDriverWait(driver, Duration.ofMinutes(4));
//		Selecting the dates from calendar From date and To date
		
		        //Selecting the date of surgery	
		        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		        //Getting current date
				Calendar cal = Calendar.getInstance();
				//Displaying current date in the desired format
				System.out.println("Current Date: "+sdf.format(cal.getTime()));
						   
				String newDate = sdf.format(cal.getTime());  
			    //Displaying the new Date after addition of Days to current date
				System.out.println("Date after Addition: "+newDate);  
				Thread.sleep(1000);
//				IPM_NT.getFromDate().clear();
//		Thread.sleep(1000);
//		IPM_NT.getFromDate().click();
//		Thread.sleep(1000);
		IPM_NT.getFromDate().sendKeys(newDate);
		Thread.sleep(1000);
		        
		//Selecting the date of surgery	
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
        //Getting current date
		Calendar cal1 = Calendar.getInstance();
		//Displaying current date in the desired format
		System.out.println("Current Date: "+sdf1.format(cal1.getTime()));
				   
		//Number of Days to add
	    cal1.add(Calendar.DAY_OF_MONTH, 15);  
		//Date after adding the days to the current date
		String toDate = sdf.format(cal1.getTime());  
	    //Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+toDate);  
		
		IPM_NT.getToDate().clear();
		IPM_NT.getToDate().click();
		IPM_NT.getToDate().sendKeys(toDate);
		Thread.sleep(1000);
		
//		Select select1= new Select(IPM_NT.getFrequency());
//		select1.selectByVisibleText("BID");
		utilobj.selectDropdown(IPM_NT.getFrequency(), driver, "BID", Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(IPM_NT.getTask(), driver, "Vitals", Browser);
//		Select select2= new Select(IPM_NT.getTask());
//		select2.selectByVisibleText("Vitals");
		
		Thread.sleep(2000);
		
		IPM_NT.getOk().click();
		Thread.sleep(3000);
		
		IPM_NT.getInterval().clear();
		Thread.sleep(3000);
		IPM_NT.getInterval().sendKeys("5");
		Thread.sleep(1000);	
	  }
		@Test(priority = 6)
		public void IPM_Nurse_Tasks_TC_2() {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofMinutes(4));
		
		IPM_NT.getSave().click();
wait.until(ExpectedConditions.visibilityOf(IPM_NT.getSuccessMessageOkButton()));
IPM_NT.getSuccessMessageOkButton().click();
		
			    }
	
	
	
		
	}	


