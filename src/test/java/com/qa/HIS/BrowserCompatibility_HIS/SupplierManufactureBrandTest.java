package com.qa.HIS.BrowserCompatibility_HIS;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.SupplierManufactureBrandPages;

public class SupplierManufactureBrandTest extends CrossBrowser {
	public SupplierManufactureBrandTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	SupplierManufactureBrandPages suppliermanufacturebrandpages;
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityNamepurchase"),Browser);
	}
	
	@Test(priority = 3)
	public void doTestToSupplierManufactuereBrandTest() throws InterruptedException  {
		
		suppliermanufacturebrandpages = hishomepage.doNavigateToSupplierManufactureBrandLink();
		suppliermanufacturebrandpages.dotestcaseforsupplier();
		suppliermanufacturebrandpages.dotestcaseforManufacture();
		suppliermanufacturebrandpages.testcaseforBrand();
	}
	

}
