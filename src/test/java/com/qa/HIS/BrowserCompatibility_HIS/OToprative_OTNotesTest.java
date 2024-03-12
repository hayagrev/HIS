package com.qa.HIS.BrowserCompatibility_HIS;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OToprative_OTNotesPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class OToprative_OTNotesTest extends CrossBrowser {
	public OToprative_OTNotesTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OToprative_OTNotesPages OToprativeOTNotesPages;
	util utilobj = new util();
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}//DUMM.0000000489
	//	SGO2021100001

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("OtFacilityname"),Browser);
	}
	@Test(priority = 3)
	public void doNavigateToOTandResourceSchedulingTest() {

		OToprativeOTNotesPages = hishomepage.doNavigateTooprativeOTNoteLink();
	}
	@Test(priority = 4)
	@Parameters("browser")
	
public void dotestcaseforotoperativeotnotesLink(String Browser)throws InterruptedException {
		
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgSearchOrderNo")), driver);
		
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl02_txtCriteria")).sendKeys("DUMM.0000000489");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlNotes")), driver, "Anaesthesia Chart or Record",Browser);
		
		Thread.sleep(5000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddkPhysicalstatusASA")), driver, "ASA I - A normal healthy patient",Browser);
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rdEmergencyelective_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rdpatientidentified_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rdConsenttaken_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtLastpreoperativeoralintake")).sendKeys("Test");
		Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_cphpage_txtBP")).sendKeys("120");
		//Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_chkgeneralregionalMAC_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_chk3LEAD5LEAD_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rdcentralperipheral_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rdNerve_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_chkcvp")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_lblpaone")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rtnAnaesthesia_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtPosition")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtAnas")).sendKeys("12:00");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_lblanast")).sendKeys("13:00");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txturi")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_chkregional_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtNeedlesize")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rbtparasthesi_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtCatheteratSkin")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtrelevel")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtCommentsregco")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rbtApproac_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rbtTransportat_0")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_btn_Clear")).click();
//		driver.findElement(By.id("ctl00_cphpage_btnSaveDisplay")).click();
//		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		
		
		
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlNotes")), driver, "Surgery Notes",Browser);
		Thread.sleep(7000);
		//clear
		driver.findElement(By.id("ctl00_cphpage_txtNameoftheprocedureperformed")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtPositionofpatient")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtIncision")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtPreOperativefindings")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtDescriptionoftheprocedures")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtDescriptionoftheIntraOpe")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtHaemostasis")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtCutsectionfinding")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtInstrumentandpackverifi")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txttransfusion")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtUrination")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtClosure")).clear();
		Thread.sleep(2000);//enter
		driver.findElement(By.id("ctl00_cphpage_txtNameoftheprocedureperformed")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtPositionofpatient")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtIncision")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtPreOperativefindings")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtDescriptionoftheprocedures")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtDescriptionoftheIntraOpe")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtHaemostasis")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtCutsectionfinding")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtInstrumentandpackverifi")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txttransfusion")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtUrination")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtClosure")).sendKeys("test procedure performence");
		Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_cphpage_btn_Clear")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_btnSaveDisplay")).click();
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		Thread.sleep(2000);
		
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlNotes")), driver, "PAC",Browser);
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtBP")).sendKeys("120/80");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtHRPulseRate")).sendKeys("55");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtRR")).sendKeys("30");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtTemp")).sendKeys("97");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtHeight")).sendKeys("180");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtWeight")).sendKeys("80");
		Thread.sleep(2000);

        utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlNotes")), driver, "Pre Anaesthesia Checklist",Browser);
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_cphpage_chkpatient_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtsite_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtanaesthesia_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtdoespatient_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtdoespatienthave_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtconfirm_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtnursing_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtanaesthesiateam_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtNURSINGTHEREEQUIPMENT_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtnursingANTIBIOTIC_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtNURSINGISESSENTIAL_0")).click();
        Thread.sleep(2000);
       // driver.findElement(By.id("ctl00_cphpage_btn_Clear")).click();
      	//Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_cphpage_btnSaveDisplay")).click();
//        utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
//        Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlNotes")), driver, "Post Surgery Checklist",Browser);
		Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabPatentAirway_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabHypopharyngeal_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabO2Saturation_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabpulmonary_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabVitalSigns_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabConsciousness_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabOrientation_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabMotor_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabCardiovascularFunction_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabCondition_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabHemorrhage_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabPain_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rabUrineOutput_0")).click();
        Thread.sleep(2000);
       // driver.findElement(By.id("ctl00_cphpage_btn_Clear")).click();
      	//Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_cphpage_btnSaveDisplay")).click();
      //  utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlNotes")), driver, "Post Anaesthesia Checklist",Browser);
		//Thread.sleep(2000);
		//utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_rbtNURSENAME_0")), driver);
		Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtNURSEINSTRUMENT_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rbtNURSESPECIMEN_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_cphpage_rdlist_0")).click();
        Thread.sleep(2000);
       // driver.findElement(By.id("ctl00_cphpage_btn_Clear")).click();
      	//Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_cphpage_btnSaveDisplay")).click();
       // utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlNotes")), driver, "PACU Record",Browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlNotes")), driver, "PACU Checklist",Browser);
		
		
	}
	
}
