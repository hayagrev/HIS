package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Home_Sample_Collection_WorklistPage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Home_Sample_Collection_WorklistTest extends CrossBrowser {
	public Home_Sample_Collection_WorklistTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Home_Sample_Collection_WorklistPage HSCWL;
	String Status;
	String notification;
	util utilobj = new util();
	String validationText;
	String wantedToDeleteDate;
	int flag=0;
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
				"LABORATORY SERVICE", Browser);

	}

	@Test(priority = 4)
	public void HIS_HSCW_TC_3() {
		//2023-03-01
		HSCWL = hishomepage.doNavigateToHome_Sample_Collection_Worklist();
	}
	@Test(priority = 5)
	public void HIS_HSCW_TC_5() throws InterruptedException {
		Thread.sleep(2000);
		HSCWL.getokButton().click();
		validationText=HSCWL.getRequiredFieldValidatorTextbox().getText();
		assertEquals(validationText, "Select Collection Date.");
		
	}
	@Test(priority = 6)
	public void HIS_HSCW_TC_4() throws InterruptedException {
		Thread.sleep(2000);
		List<String> TableHeading = new ArrayList<>(Arrays.asList("S.No","IP No./ESIC Employee No. /ESIC Pensioner No.","Beneficiary Name","Address for Home Sample Collection (Name, Address, Sub district, District, PIN Code, State)","Mobile No.","Request No.","Request Raise On","Sample Collected by Agency (Date & Time )","Sample delivered to Hospital(Date & Time)","Sample Acccepted by Hospital"));
	//TableHeading.add("S.No","IP No./ESIC Employee No. /ESIC Pensioner No.","Beneficiary Name","Address for Home Sample Collection (Name, Address, Sub district, District, PIN Code, State)","Mobile No.","Request No.","Request Raise On","Sample Collected by Agency (Date & Time )","Sample delivered to Hospital(Date & Time)","Sample Acccepted by Hospital");
		utilobj.JSEnterText(HSCWL.getdateTextBox(), driver, "2023-03-01");
		HSCWL.getokButton().click();
	   List<WebElement> TableHeaderText=driver.findElements(By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr[1]//th"));
		System.out.println(TableHeaderText.size());
	   for(int i=0;i<TableHeaderText.size()-1;i++) {
			//System.out.println(TableHeaderText.get(i).getText());
			if(TableHeaderText.get(i).getText().contains(TableHeading.get(i))) {
				
				System.out.println("this is Table heading number:- "+i+" and text is "+TableHeaderText.get(i).getText());
				flag=flag+1;
			}
			
			}
	  if(flag==10) {
			System.out.println("matched "+flag);
	  }
		
	}
	@Test(priority = 7)
	public void HIS_HSCW_TC_6() throws InterruptedException {
		Thread.sleep(2000);
		HSCWL.getclearButton().click();
	}
	
	
}
