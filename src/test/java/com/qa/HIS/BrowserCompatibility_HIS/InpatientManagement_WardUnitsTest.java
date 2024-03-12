package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_wardunitspages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
//import com.qa.util.IPM_Ward;
import com.qa.util.util;


public class InpatientManagement_WardUnitsTest extends CrossBrowser {
      
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_wardunitspages IMWU;
	util utilobj=new util();
	String BedUnitname;
    public InpatientManagement_WardUnitsTest(){
		
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

public void donavigatewardUnit() {
	IMWU=hishomepage.doNavigateTogetwardUnitPage();
}
   	@Test(priority = 4)
   	@Parameters("browser")
   	public void IPM_Ward_Units_TC_1(String Browser) throws InterruptedException {
   	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));

   	//Selecting the date of surgery	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		//Getting current date
		Calendar cal = Calendar.getInstance();
		//Displaying current date in the desired format
		System.out.println("Current Date: "+sdf.format(cal.getTime()));
		   
		//Number of Days to add
	    cal.add(Calendar.DAY_OF_MONTH, 0);  
		//Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());  
		//Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+newDate); 
		BedUnitname="DummyBedUnit"+newDate;
		Thread.sleep(3000);
   		IMWU.getUnitNameTextBox().sendKeys(BedUnitname);//enter unit name
   		Thread.sleep(3000);
   		utilobj.selectDropdown(IMWU.getSpecilisationDDL(), driver, "Administrative Service", Browser);//select unit specialisation
   	   wait.until(ExpectedConditions.visibilityOf(IMWU.getDoctorCheckBox()));
   		Thread.sleep(3000);
   		utilobj.selectDropdown(IMWU.getHeadofUnit(), driver, "Amit Arya",Browser);//select unit of head
   		Thread.sleep(3000);
   		IMWU.getBedtab().click();//select bed tab
   		Thread.sleep(3000);
   		utilobj.selectDropdown(IMWU.getWardDDL(), driver, "Female Surgical Ward",Browser);//get ward 
   		Thread.sleep(3000);
   		IMWU.getSave().click();
   		Thread.sleep(3000);
   		IMWU.getMessageBox_ButtonOK().click();
   		Thread.sleep(2000);
   		
   	}
	  @Test(priority = 5)
	@Parameters("browser") 
	  public void IPM_Ward_Units_TC_2(String Browser) throws InterruptedException, AWTException {
		   //Selecting the date of surgery	
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Displaying current date in the desired format
				System.out.println("Current Date: "+sdf.format(cal.getTime()));
				   
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);  
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());  
				//Displaying the new Date after addition of Days to current date
				System.out.println("Date after Addition: "+newDate); 
				Thread.sleep(3000);
               WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
               wait.until(ExpectedConditions.visibilityOf(IMWU.getUnitNameicon()));
				Thread.sleep(3000);
				
				IMWU.getUnitNameicon().click();
				Thread.sleep(2000);
				
				IMWU.getUnitNametxtbox().sendKeys("Dumm");
				Thread.sleep(3000);
				
				IMWU.getSearch().click();
				Thread.sleep(3000);
				
				IMWU.getRadiobtn().click();
				Thread.sleep(3000);
				
				IMWU.getSelect().click();
				Thread.sleep(3000);
				IMWU.getDoctortab().click();
				Thread.sleep(3000);
				IMWU.getCheckbox().click();
				Thread.sleep(3000);
				IMWU.getBed().click();
				Thread.sleep(5000);
				utilobj.selectDropdown(IMWU.getddlward(), driver, "Female Surgical Ward",Browser);
				Thread.sleep(3000);
				IMWU.getbedcheckbox().click();
				Thread.sleep(3000);
				IMWU.getModify().click();
				Thread.sleep(3000);
			   driver.findElement(By.id("ctl00_cphpage_MyMessageBox_ButtonOK")).click();
			   Thread.sleep(2000);
			    driver.findElement(By.id("ctl00_cphpage_imgSearchUnit")).click();
			   
				Thread.sleep(2000);
				driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("Dumm");
				
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSearch")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("ctl00_cphpage_btnClear")).click();
				Thread.sleep(1000);

				
	    }
	
	
		
}
