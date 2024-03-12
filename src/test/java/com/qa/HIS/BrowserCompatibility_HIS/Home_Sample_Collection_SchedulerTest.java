package com.qa.HIS.BrowserCompatibility_HIS;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Home_Sample_Collection_SchedulerPage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Home_Sample_Collection_SchedulerTest extends CrossBrowser{
	public Home_Sample_Collection_SchedulerTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Home_Sample_Collection_SchedulerPage HSCSP;
	String Status;
	String notification;
	util utilobj=new util();
	@Test(priority =1)

	public void doLoginTest() throws IOException {


		loginpage = new Loginpage(driver);
		

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));
		
	}

		@Test(priority =2)
		public void doNavigateToSelectHospitalLocationTest() {

			selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
		}
		@Test(priority =3)
		@Parameters("browser")
		public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

			hishomepage = selecthospitallocationpage.doNavigateToHISHome("Alwar, RJ (ESIC Hosp.)", "ADMINISTRATIVE SERVICES",Browser);
			
		}
	@Test(priority =4)
	public void HIS_HSCS_TC_3() {

		HSCSP = hishomepage.doNavigateToHome_Sample_Collection_Scheduler();	
	}

@Test(priority = 5)
public void HIS_HSCS_TC_4() throws InterruptedException {
	Thread.sleep(2000);
	HSCSP.getClearButton().click();
	Thread.sleep(2000);
	HSCSP.getsaveButton().click();
	notification=HSCSP.getnotificationSpan().getText();
	System.out.println(notification);
	assertEquals(notification, "Enter value.");
	
}
@Test(priority = 6)
public void HIS_HSCS_TC_5() throws InterruptedException {
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
	HSCSP.getmaximumRequestTextbox().sendKeys("500");
HSCSP.getbookedDaysTextbox().sendKeys("16");//15
HSCSP.getsaveButton().click();
wait.until(ExpectedConditions.visibilityOf(HSCSP.getnotificationMessageButtonOk()));
notification=HSCSP.getinformationMessageText().getText();
assertEquals(notification, "Sample Collection can only booked within 15 days!");

}
@Test(priority = 7)
public void HIS_HSCS_TC_6() throws InterruptedException {
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
	HSCSP.getnotificationMessageButtonOk().click();
	Thread.sleep(2000);
	HSCSP.getbookedDaysTextbox().clear();
	Thread.sleep(2000);
	HSCSP.getbookedDaysTextbox().sendKeys("15");
	HSCSP.getsaveButton().click();
	wait.until(ExpectedConditions.visibilityOf(HSCSP.getnotificationMessageButtonOk()));
	notification=HSCSP.getinformationMessageText().getText();
	System.out.println(notification);
	assertEquals(notification, "Data Modified successfully.");
}
@Test(priority = 8)
public void HIS_HSCS_TC_7() throws InterruptedException {
	Thread.sleep(2000);
	HSCSP.getnotificationMessageButtonOk().click();
	Thread.sleep(2000);
	HSCSP.getbookedDaysTextbox().clear();
	
	
	

}

}
