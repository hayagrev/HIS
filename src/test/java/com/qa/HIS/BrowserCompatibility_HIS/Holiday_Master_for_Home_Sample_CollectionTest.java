package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.Holiday_Master_for_Home_Sample_CollectionPage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Holiday_Master_for_Home_Sample_CollectionTest extends CrossBrowser {
	public Holiday_Master_for_Home_Sample_CollectionTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Holiday_Master_for_Home_Sample_CollectionPage HMFHSC;
	String Status;
	String notification;
	util utilobj = new util();
	String validation;
	String wantedToDeleteDate;

	@Test(priority = 1)

	public void doLoginTest() throws IOException {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 2)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 3)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome("Alwar, RJ (ESIC Hosp.)",
				"ADMINISTRATIVE SERVICES", Browser);

	}

	@Test(priority = 4)
	public void HIS_HMHSC_TC_3() {

		HMFHSC = hishomepage.doNavigateToHoliday_Master_for_Home_Sample_Collection();
	}

	@Test(priority = 5)
	public void HIS_HMHSC_TC_4() throws InterruptedException {
		Thread.sleep(2000);
		HMFHSC.getdeleteButton().click();
	}

	@Test(priority = 6)
	@Parameters("browser")
	public void HIS_HMHSC_TC_5(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		HMFHSC.getaddButton().click();
		Thread.sleep(2000);
		String dateValidation = HMFHSC.getdateValidation().getText();
		String holidayValidation = HMFHSC.getholidayValidation().getText();
		System.out.println(dateValidation + " " + holidayValidation);
		// click on add button after adding past date
		HMFHSC.getholidayDateTextBox().click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_calExptDischarge_day_0_2")).click();
		Thread.sleep(2000);
		utilobj.selectDropdown(HMFHSC.gettypeholidayDDL(), driver, "National Holiday", Browser);
		HMFHSC.getaddButton().click();
		validation = HMFHSC.geterrorValidation().getText();
		Thread.sleep(2000);
		System.out.println(validation);
	}

	@Test(priority = 7)
	@Parameters("browser")
	public void HIS_HMHSC_TC_6(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		HMFHSC.geterrorMessageOkbutton().click();
//click on add button after adding past date
		HMFHSC.getholidayDateTextBox().click();
		Thread.sleep(2000);
		HMFHSC.getcurrentDateLink().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(HMFHSC.gettypeholidayDDL(), driver, "National Holiday", Browser);
		HMFHSC.getaddButton().click();	
	}
	@Test(priority = 8)
	@Parameters("browser")
	public void HIS_HMHSC_TC_8(String Browser) throws InterruptedException {
		Thread.sleep(2000);
		HMFHSC.geterrorMessageOkbutton().click();
//click on add button after adding past date
		String date=HMFHSC.getholidayDateTextBox().getAttribute("value");
		System.out.println(date);
		int currentDate=Integer.parseInt(date.substring(date.length()-2, date.length()));
		System.out.println(currentDate+2);
		HMFHSC.getholidayDateTextBox().clear();
		HMFHSC.getholidayDateTextBox().click();
		Thread.sleep(2000);
		/*get all date from calender important note
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='ctl00_cphpage_calExptDischarge_daysBody']//tr//td//div"));
		List<Integer> list2 = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			list2.add(Integer.parseInt(list.get(i).getText()));
			
		}
		System.out.println(list2);
		Set<Integer> set=new LinkedHashSet<>();
		set.addAll(list2);
		list2.clear();
		list2.addAll(set);
		System.out.println(list2);
		 end get all date from calender*/
		List<WebElement> holidayCountBeforeAdd=driver.findElements(By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[4]/td/table/tbody//tr//td//a"));
	    System.out.println(holidayCountBeforeAdd.size());
		String futureDate="2023-03-"+Integer.toString(currentDate+3);
		String strtextDate[] = date.split("-");
		String FutureDate = strtextDate[0]+"-"+strtextDate[1]+"-"+Integer.toString(currentDate+3);
		wantedToDeleteDate=Integer.toString(currentDate+3);
		System.out.println(FutureDate);
		utilobj.JSEnterText(HMFHSC.getholidayDateTextBox(), driver, FutureDate);
		Thread.sleep(2000);
		utilobj.selectDropdown(HMFHSC.gettypeholidayDDL(), driver, "National Holiday", Browser);
		Thread.sleep(2000);
		HMFHSC.getaddButton().click();	
		Thread.sleep(5000);
		List<WebElement> holidayCountAfterAdd=driver.findElements(By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[4]/td/table/tbody//tr//td//a"));
	    holidayCountAfterAdd.size();
	  boolean condition=holidayCountAfterAdd.size()>holidayCountBeforeAdd.size();
	  assertEquals(condition, true);

	   
	}
	@Test(priority = 9)
	public void HIS_HMHSC_TC_9() throws InterruptedException { 
		Thread.sleep(2000);
		HMFHSC.getsaveButton().click();
		Thread.sleep(2000);
		String succesMessageText=HMFHSC.geterrorValidation().getText();
		Thread.sleep(2000);
		assertEquals(succesMessageText, "Saved Successfully.");
	}
	@Test(priority = 10)
	public void HIS_HMHSC_TC_10() throws InterruptedException {
		Thread.sleep(2000);
		HMFHSC.geterrorMessageOkbutton().click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(wantedToDeleteDate)).click();
		Thread.sleep(2000);
		HMFHSC.getdeleteButton().click();
		Thread.sleep(2000);
		HMFHSC.getinformationOkButton().click();
		Thread.sleep(2000);
		HMFHSC.getsaveButton().click();	
	}
	@Test(priority = 11)
	public void HIS_HMHSC_TC_11() throws InterruptedException {
		Thread.sleep(2000);
		HMFHSC.geterrorMessageOkbutton().click();
		Thread.sleep(2000);
		HMFHSC.getclearButton().click();
	}
}
