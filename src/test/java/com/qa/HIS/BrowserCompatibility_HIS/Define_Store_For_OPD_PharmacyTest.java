package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.Define_Store_For_OPD_Pharmacy_Pages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Define_Store_For_OPD_PharmacyTest extends CrossBrowser{
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Define_Store_For_OPD_Pharmacy_Pages DSOPDP;
	String UHID_number;
	util utilobj = new util();
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
	public void doNavigateToDefine_Store_For_OPD_Pharmacy() {

		DSOPDP = hishomepage.doNavigateToDefine_Store_For_OPD_Pharmacy_Pages();
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void Check_the_FunctionalityOfNote(String Browser) throws InterruptedException {
		
		Thread.sleep(2000);
		String note=DSOPDP.getNote_Content().getText();
		Thread.sleep(2000);
		System.out.println(note);
		Thread.sleep(2000);
		assertEquals("Notes :-\r\n"
				+ "*The clinician must assign store facility from where the OPD drug distribution shall take place. For example, an ayurvedic doctor may define the ayurvedic pharmacy\r\n"
				+ "as the store facility from where the ayurvedic drugs shall be distributed. This shall be one time activity for an user(doctor) but editable.", "Notes :-\r\n"
						+ "*The clinician must assign store facility from where the OPD drug distribution shall take place. For example, an ayurvedic doctor may define the ayurvedic pharmacy\r\n"
						+ "as the store facility from where the ayurvedic drugs shall be distributed. This shall be one time activity for an user(doctor) but editable.");
	}
		@Test(priority = 5)
		@Parameters("browser")
		public void Check_the_FunctionalityofSaveButton(String Browser) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		utilobj.selectDropdown(DSOPDP.getAvailbilityStoreFacilityDLL(), driver, "ADMINISTRATIVE SERVICES", Browser);

       Thread.sleep(2000);
       DSOPDP.getsaveButton().click();
       Thread.sleep(2000);
      String Message_Content= DSOPDP.getSavebutton_SucessMessageContent().getText();
      System.out.println(Message_Content);
      Thread.sleep(2000);
      DSOPDP.getSavebutton_OkButton().click();
      Thread.sleep(2000);
      utilobj.selectDropdown(DSOPDP.getAvailbilityStoreFacilityDLL(), driver, "STORE SERVICE", Browser);
      Thread.sleep(4000);

     DSOPDP.getsaveButton().click();
     assertEquals("Saved Successfully.","Saved Successfully.");


	}
	
}
