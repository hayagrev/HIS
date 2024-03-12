package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.C13622_MISC_Change_In_HIS_ITR2_Page;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class C13636_MISC_Change_In_HIS_ITR2_Test extends CrossBrowser {
	


HomePage homepage;
SelectHospitalLocationPage selecthospitallocationpage;
HISHomePage hishomepage;
String getUhid=null;
String checkIN=null;
Loginpage loginpage;
C13622_MISC_Change_In_HIS_ITR2_Page MISC2;
String PresentPrimaryMobileNumberLableText;
String PermanantPrimaryMobileNumberLableText;
String PresentAlternativeMobileNumberLableText;
String PermanantAlternativeMobileNumberLableText;
String getMobileNumber;
String getMobileNumberpermanant;
util utilobj = new util();
String date;
String splitdate;
String splitOrderdate;
String parent3;
String MedicineQuantity;
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
			prop.getProperty("facilityName"),Browser);
}
@Test(priority = 3)
public void DoTestForGotoCheckInScreen() {
	MISC2=hishomepage.doNavigateToCheckIn_SCreenForMISC_Change_In_HISITR2();
}
@Test(priority = 4)
public void HIS_ClinicalRecord_Casesheet_TC_3() throws InterruptedException {
	

	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
	MISC2.getUHIDScreen_clearButton().click();
	Thread.sleep(2000);
	MISC2.getPatientCheckIn_IPtextBox().sendKeys("1100099900");
	Thread.sleep(2000);
	MISC2.getLiveListLink().click();
	wait.until(ExpectedConditions.visibilityOf(MISC2.getLiveListDepandentRadioButton()));
	MISC2.getLiveListDepandentRadioButton().click();
	Thread.sleep(2000);
	MISC2.getLiveListSelectButton().click();

	
	wait.until(ExpectedConditions.invisibilityOf(MISC2.getBlackOverlay()));
	
	Thread.sleep(4000);
	//PM10639.getpatientCheckInNumberSeviceOkButton().click();
	utilobj.JSClick(MISC2.getpatientCheckInNumberSeviceOkButton(), driver);
Thread.sleep(4000);
// 
MISC2.getpatientCheckInNumberSaveButton().click();
Thread.sleep(4000);

System.out.println(MISC2.getPopupmessage().getText());
System.out.println(utilobj.GetCheckinNumberText(MISC2.getPopupmessage(), driver));

checkIN = utilobj.GetCheckinNumberText(MISC2.getPopupmessage(), driver);
}
@Test(priority = 5)
@Parameters("browser")
public void DoTest_FunctionalityOfGenricRadioButtonwithAllopathicRadioButton(String Browser) throws InterruptedException {

	
	MISC2.getBtncancel().click();
	Thread.sleep(1000);
	getUhid= MISC2.getUHID_creation_Uhid_txtbox().getAttribute("value");
	Thread.sleep(3000);
	System.out.println(getUhid);
	
	Thread.sleep(1000);
	utilobj.MoveElement(MISC2.getClinicalRecordsLink(), driver);
	Thread.sleep(2000);
	MISC2.getDoctorWorklistLink().click();
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	wait.until(ExpectedConditions.visibilityOf(MISC2.getdoctorworklist_checkintextBox()));
	Thread.sleep(2000);
	utilobj.JSEnterText(MISC2.getdoctorworklist_checkintextBox(), driver, checkIN);
	Thread.sleep(2000);

utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);


	
		Thread.sleep(2000);

		MISC2.getpopupok().click();
		
		
	

		 parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		MISC2.getlableprecripstionlink().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		MISC2.getMedicationADDButton().click();
		Thread.sleep(1000);
			driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][1]")).click();
			Thread.sleep(1000);
			MISC2.getMedicationSearchTextBox().sendKeys("paracetamol");
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
			Thread.sleep(8000);
			List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
			Thread.sleep(1000);
			System.out.println("size of list is:-"+list.size());
			for(int i=1;i<list.size();i++) {
				
				String getValue=list.get(i).getText();
				System.out.println(getValue);
				 boolean Matchingvalue=(getValue.toLowerCase()).contains("paracetamol");
				System.out.println(Matchingvalue);
			}
			Thread.sleep(1000);
}

@Test(priority = 6)
@Parameters("browser")
public void DoTest_FunctionalityOfGenricRadioButtonwithAyurvadicRadioButton(String Browser) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));		
	MISC2.getMedicationSearchTextBox().clear();
			driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][2]")).click();
			Thread.sleep(1000);
			MISC2.getMedicationSearchTextBox().sendKeys("kwath");
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
			Thread.sleep(8000);
			List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
			Thread.sleep(1000);
			System.out.println("size of list is:-"+list.size());
			for(int i=1;i<list.size();i++) {
				
				String getValue=list.get(i).getText();
				System.out.println(getValue);
				 boolean Matchingvalue=(getValue.toLowerCase()).contains("kwath");
				System.out.println(Matchingvalue);
			}
}
@Test(priority = 7)
@Parameters("browser")
public void DoTest_FunctionalityOfGenricRadioButtonwithHomeopahicRadioButton(String Browser) throws InterruptedException {
WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
			MISC2.getMedicationSearchTextBox().clear();
			driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][3]")).click();
			Thread.sleep(1000);
			MISC2.getMedicationSearchTextBox().sendKeys("caladium");
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
			Thread.sleep(8000);
			List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
			Thread.sleep(1000);
			System.out.println("size of list is:-"+list.size());
			for(int i=1;i<list.size();i++) {
				
				String getValue=list.get(i).getText();
				System.out.println(getValue);
				 boolean Matchingvalue=(getValue.toLowerCase()).contains("caladium");
				System.out.println(Matchingvalue);
			}
}
@Test(priority = 8)
@Parameters("browser")
public void DoTest_FunctionalityOfGenricRadioButtonwithCRCRadioButton(String Browser) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));		
	MISC2.getMedicationSearchTextBox().clear();
			driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][4]")).click();
			Thread.sleep(1000);
			MISC2.getMedicationSearchTextBox().sendKeys("Paracetamol");
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
			Thread.sleep(8000);
			List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
			Thread.sleep(1000);
			System.out.println("size of list is:-"+list.size());
			for(int i=1;i<list.size();i++) {
				
				String getValue=list.get(i).getText();
				System.out.println(getValue);
				 boolean Matchingvalue=(getValue.toLowerCase()).contains("Paracetamol");
				System.out.println(Matchingvalue);
			}
}

			@Test(priority = 9)
			@Parameters("browser")
			public void DoTest_FunctionalityOfGenricRadioButtonwithAllRadioButton(String Browser) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
			MISC2.getMedicationSearchTextBox().clear();
			driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][5]")).click();
			Thread.sleep(1000);
			MISC2.getMedicationSearchTextBox().sendKeys("Paracetamol");
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
			Thread.sleep(8000);
			List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
			Thread.sleep(1000);
			System.out.println("size of list is:-"+list.size());
			for(int i=1;i<list.size();i++) {
				
				String getValue=list.get(i).getText();
				System.out.println(getValue);
				 boolean Matchingvalue=(getValue.toLowerCase()).contains("Paracetamol");
				System.out.println(Matchingvalue);
			}
			MISC2.getMedicationSearchTextBox().clear();
//			utilobj.JSClick(MISC2.getbtnISaveClose(), driver);
//			Thread.sleep(1000);
//			utilobj.waitForalert(driver);
		//	Thread.sleep(1000);
			//driver.switchTo().alert().accept();
		//	MISC2.geMedicationSearchCloseimage().click();
//			Thread.sleep(1000);
//			MISC2.gePrescriptionWindowCloseButton().click();
//			Thread.sleep(1000);
//			driver.switchTo().window(parent3);
//			Thread.sleep(1000);
			//MISC2.getpopupok().click();
			//Thread.sleep(4000);
//			utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[1]/tbody/tr[1]/td/span")));
//			Thread.sleep(5000);
//			date=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[2]/tbody/tr[2]/td/a[1]")).getText();
//			System.out.println(date);
//			splitdate=date.substring(0, 17);
//			System.out.println(splitdate);
			//Thread.sleep(1000);
			
		}
			@Test(priority = 10)
			@Parameters("browser")
			public void DoTest_CloseThePrescriptionWindow(String Browser) throws InterruptedException {
				MISC2.getMedicationSearchCloseimage().click();
				Thread.sleep(1000);
				MISC2.getPrescriptionWindowCloseButton().click();
				Thread.sleep(1000);
				driver.switchTo().window(parent3);
				Thread.sleep(1000);
			}
			/*Drug button*/
			@Test(priority = 11)
			@Parameters("browser")
			public void DoTest_FunctionalityOfDrugRadioButtonwithAllopaticRadioButton(String Browser) throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
				parent3 = driver.getWindowHandle();
				utilobj.Window(driver);
				MISC2.getlableprecripstionlink().click();
				Thread.sleep(2000);
				utilobj.ChildWindow(driver);
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
				Thread.sleep(1000);
				
				MISC2.getMedicationADDButton().click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/table/tbody/tr/td/div/table[1]/tbody/tr[2]/td[1]/input")).click();
				Thread.sleep(1000);
					driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][1]")).click();
					Thread.sleep(1000);
					MISC2.getMedicationSearchTextBox().sendKeys("paracetamol");
					Thread.sleep(1000);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
					Thread.sleep(8000);
					List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
					Thread.sleep(1000);
					System.out.println("size of list is:-"+list.size());
					for(int i=1;i<list.size();i++) {
						
						String getValue=list.get(i).getText();
						System.out.println(getValue);
						 boolean Matchingvalue=(getValue.toLowerCase()).contains("paracetamol");
						System.out.println(Matchingvalue);
					}
		}
		@Test(priority = 12)
		@Parameters("browser")
		public void DoTest_FunctionalityOfDrugRadioButtonwithAyurvadicRadioButton(String Browser) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));		
			MISC2.getMedicationSearchTextBox().clear();
					driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][2]")).click();
					Thread.sleep(1000);
					MISC2.getMedicationSearchTextBox().sendKeys("kwath");
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
					Thread.sleep(8000);
					List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
					Thread.sleep(1000);
					System.out.println("size of list is:-"+list.size());
					for(int i=1;i<list.size();i++) {
						
						String getValue=list.get(i).getText();
						System.out.println(getValue);
						 boolean Matchingvalue=(getValue.toLowerCase()).contains("kwath");
						System.out.println(Matchingvalue);
					}
		}
		@Test(priority = 13)
		@Parameters("browser")
		public void DoTest_FunctionalityOfDrugRadioButtonwithHomeopahicRadioButton(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
					MISC2.getMedicationSearchTextBox().clear();
					driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][3]")).click();
					Thread.sleep(1000);
					MISC2.getMedicationSearchTextBox().sendKeys("caladium");
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
					Thread.sleep(8000);
					List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
					Thread.sleep(1000);
					System.out.println("size of list is:-"+list.size());
					for(int i=1;i<list.size();i++) {
						
						String getValue=list.get(i).getText();
						System.out.println(getValue);
						 boolean Matchingvalue=(getValue.toLowerCase()).contains("caladium");
						System.out.println(Matchingvalue);
					}
		}
		@Test(priority = 14)
		@Parameters("browser")
		public void DoTest_FunctionalityOfDrugRadioButtonwithCRCRadioButton(String Browser) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));		
			MISC2.getMedicationSearchTextBox().clear();
					driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][4]")).click();
					Thread.sleep(1000);
					MISC2.getMedicationSearchTextBox().sendKeys("paracetamol");
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
					Thread.sleep(10000);
					List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
					Thread.sleep(1000);
					System.out.println("size of list is:-"+list.size());
					for(int i=1;i<list.size();i++) {
						
						String getValue=list.get(i).getText();
						System.out.println(getValue);
						 boolean Matchingvalue=(getValue.toLowerCase()).contains("paracetamol");
						System.out.println(Matchingvalue);
					}
		}
					@Test(priority = 15)
					@Parameters("browser")
					public void DoTest_FunctionalityOfDrugRadioButtonwithAllRadioButton(String Browser) throws InterruptedException {
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
					MISC2.getMedicationSearchTextBox().clear();
					driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][5]")).click();
					Thread.sleep(1000);
					MISC2.getMedicationSearchTextBox().sendKeys("paracetamol");
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
					Thread.sleep(10000);
					List<WebElement> list=driver.findElements(By.xpath("//*[@id='divSystemList1']//a"));
					Thread.sleep(1000);
					System.out.println("size of list is:-"+list.size());
					for(int i=1;i<list.size();i++) {
						
						String getValue=list.get(i).getText();
						System.out.println(getValue);
						 boolean Matchingvalue=(getValue.toLowerCase()).contains("paracetamol");
						System.out.println(Matchingvalue);
					}
					//MISC2.getMedicationSearchTextBox().clear();
//					utilobj.JSClick(MISC2.getbtnISaveClose(), driver);
//					Thread.sleep(1000);
//					utilobj.waitForalert(driver);
				//	Thread.sleep(1000);
					//driver.switchTo().alert().accept();
//					MISC2.geMedicationSearchCloseimage().click();
//					Thread.sleep(1000);
//					MISC2.gePrescriptionWindowCloseButton().click();
//					Thread.sleep(1000);
//					driver.switchTo().window(parent3);
					Thread.sleep(1000);
					//MISC2.getpopupok().click();
					//Thread.sleep(4000);
//					utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[1]/tbody/tr[1]/td/span")));
//					Thread.sleep(5000);
//					date=driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/div/div[4]/table/tbody/tr[2]/td/div/div/div[1]/table[2]/tbody/tr[2]/td/a[1]")).getText();
//					System.out.println(date);
//					splitdate=date.substring(0, 17);
//					System.out.println(splitdate);
					//Thread.sleep(1000);
					
				}
			/*Drug button End*/
//					@Test(priority = 16)
//					@Parameters("browser")
//					public void DoTest_CloseThePrescriptionWindowDrugButton(String Browser) throws InterruptedException {
//						MISC2.geMedicationSearchCloseimage().click();
//						Thread.sleep(1000);
//						MISC2.gePrescriptionWindowCloseButton().click();
//						Thread.sleep(1000);
//						driver.switchTo().window(parent3);
//						Thread.sleep(1000);
//					}

					@Test(priority = 16)
					@Parameters("browser")
					public void DoTest_Prescripbe_Medicine(String Browser) throws InterruptedException {
						WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
						MISC2.getMedicationSearchTextBox().clear();
						driver.findElement(By.xpath("//html//body//form//div[3]//div[2]//table//tbody//tr//td//div//table[1]//tbody//tr[1]//td//input[@type='radio'][5]")).click();
						Thread.sleep(1000);
						MISC2.getMedicationSearchTextBox().sendKeys("Crocin 500 Tab");
						Thread.sleep(20000);
						wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divSystemList1']"))));
						Thread.sleep(20000);

						MedicineQuantity=MISC2.getParacetamolTab500mgRDPL().getText();
						Thread.sleep(2000);
						MISC2.getParacetamolTab500mgRDPL().click();
						Thread.sleep(2000);
						MISC2.getMedicationSearchDrugDosetxtbox().clear();
						Thread.sleep(2000);
						MISC2.getMedicationSearchDrugDosetxtbox().sendKeys("8");
						Thread.sleep(2000);
						utilobj.selectDropdown(MISC2.getMedicationSearchDrugDoseDDL(), driver,"Tablet(s)", Browser);
						Thread.sleep(2000);
						MISC2.getMedicationSearchDurationtxtbox().sendKeys("4");
						Thread.sleep(2000);
						utilobj.selectDropdown(MISC2.getMedicationSearchFrequencyDDL(), driver,"2X - Twice", Browser);
						Thread.sleep(2000);
						MISC2.getMedicationSearchQuantitytxtbox().sendKeys("8");
						Thread.sleep(2000);
						utilobj.selectDropdown(MISC2.getMedicationSearchQuantityDDL(), driver,"Tablet(s)", Browser);
						Thread.sleep(2000);
						utilobj.selectDropdown(MISC2.getRoutofAdminDDL(), driver,"Oral", Browser);
						Thread.sleep(2000);
						utilobj.JSClick(MISC2.getMedicineSearchOKButton(), driver);
						
						Thread.sleep(2000);
						utilobj.JSClick(MISC2.getMedicineSearchCloseButton(), driver);
						
						Thread.sleep(2000);
//						utilobj.JSClick(MISC2.getbtnISaveClose(), driver);
//						Thread.sleep(2000);
//						String Quantity=MedicineQuantity.substring((MedicineQuantity.length()-5),MedicineQuantity.length());
//						Thread.sleep(2000);                          
//						System.out.println(Quantity);
//						Thread.sleep(2000);
//						utilobj.waitForalert(driver);
//						Thread.sleep(2000);
//						driver.switchTo().alert().accept();
//						Thread.sleep(1000);
// 					driver.switchTo().window(parent3);
						
						

					}
					@Test(priority = 17)
					@Parameters("browser")
					public void DoTest_OneDoctorOnePrescriptionWithNoIssue(String Browser) throws InterruptedException {
						utilobj.JSClick(MISC2.getbtnISaveClose(), driver);
						Thread.sleep(2000);
						String Quantity=MedicineQuantity.substring((MedicineQuantity.length()-5),MedicineQuantity.length());
						Thread.sleep(2000);                          
						System.out.println(Quantity);
						Thread.sleep(2000);
						utilobj.waitForalert(driver);
						Thread.sleep(2000);
						driver.switchTo().alert().accept();
						Thread.sleep(1000);
 					driver.switchTo().window(parent3);
						Thread.sleep(6000);
					 parent3 = driver.getWindowHandle();
						utilobj.Window(driver);
						MISC2.getlableprecripstionlink().click();
						Thread.sleep(2000);
						utilobj.ChildWindow(driver);
						Thread.sleep(1000);
						System.out.println(driver.getTitle());
						Thread.sleep(6000);
						String MedicineName=MISC2.getPrescription_MedicationBlock_MedicineNameRow().getText();
						Thread.sleep(1000);
						System.out.println("the madicine name:-"+MedicineName);
						Thread.sleep(6000);
						boolean MedicinenameStatus=MedicineName.isEmpty();
						Thread.sleep(1000);
						
	 					assertEquals(MedicinenameStatus, false);
	 					
						}
					@Test(priority = 18)
					@Parameters("browser")
					public void DoTest_PartllyIssue(String Browser) throws InterruptedException {
						Thread.sleep(5000);
						MISC2.getPrescriptionWindowCloseButton().click();
	 					Thread.sleep(1000);						
	 					driver.switchTo().window(parent3);
	 					Thread.sleep(4000);
						MISC2=hishomepage.doNavigateToPharmacyIssueforMISC_Change_In_HISITR2();
						WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
						MISC2.getStoreUhidTextBox().sendKeys(checkIN);
						Thread.sleep(2000);
						MISC2.getStoreUhidImgSerch().click();
						wait.until(ExpectedConditions.invisibilityOf(MISC2.getBlackOverlay()));
						
						 parent3 = driver.getWindowHandle();
							utilobj.Window(driver);
							driver.findElement(By.id("ctl00_cphpage_grdIssueDetails_ctl02_imgbtnSearchSubstituteNew")).click();
							Thread.sleep(1000);
							utilobj.ChildWindow(driver);
							Thread.sleep(1000);
							System.out.println(driver.getTitle());
							Thread.sleep(1000);
							
//							MISC2.getlableprecripstionlink().click();
							driver.findElement(By.xpath("//*[@id='ChkSelect0']")).click();
							Thread.sleep(2000);
							driver.findElement(By.xpath("//*[@id='btnSelect']")).click();
							
							
							Thread.sleep(20000);
							//wait.until(ExpectedConditions.invisibilityOf(MISC2.getBlackOverlay()));
							driver.switchTo().window(parent3);
		 					
		 					
						Thread.sleep(20000);
						MISC2.getStoreUhidIssueQuantity().clear();
						Thread.sleep(1000);
						MISC2.getStoreUhidIssueQuantity().sendKeys("3");
						Thread.sleep(2000);
						MISC2.getStoreUhidIssueSaveButton().click();
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
						
						
					}
					@Test(priority = 19)
					@Parameters("browser")
					public void DoTest_OneDoctorOnePrescriptionWithPartellyIssue(String Browser) throws InterruptedException {
						Thread.sleep(2000);
						utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
						Thread.sleep(2000);
						
						utilobj.MoveElement(MISC2.getClinicalRecordsLink(), driver);
						Thread.sleep(2000);
						MISC2.getDoctorWorklistLink().click();
						Thread.sleep(4000);
						boolean InformationBoxPresent=MISC2.getDoctorWorklist_informationMessageBox_CancelButton().isDisplayed();
						if(InformationBoxPresent==true) {
							MISC2.getDoctorWorklist_informationMessageBox_CancelButton().click();
						}
						WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
						wait.until(ExpectedConditions.visibilityOf(MISC2.getdoctorworklist_checkintextBox()));
						Thread.sleep(2000);
						utilobj.JSEnterText(MISC2.getdoctorworklist_checkintextBox(), driver, checkIN);
						Thread.sleep(2000);

					utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
					Thread.sleep(2000);
					utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
						Thread.sleep(2000);
					 parent3 = driver.getWindowHandle();
						utilobj.Window(driver);
						MISC2.getlableprecripstionlink().click();
						Thread.sleep(2000);
						utilobj.ChildWindow(driver);
						Thread.sleep(1000);
						System.out.println(driver.getTitle());
						Thread.sleep(1000);
						String MedicineName=MISC2.getPrescription_MedicationBlock_MedicineNameRow().getText();
						Thread.sleep(1000);
						boolean MedicinenameStatus=MedicineName.isEmpty();
						
						assertEquals(MedicinenameStatus, false);
						}
					@Test(priority = 20)
					@Parameters("browser")
					public void DoTest_FullyIssue(String Browser) throws InterruptedException {
						Thread.sleep(1000);
						MISC2.getPrescriptionWindowCloseButton().click();
						Thread.sleep(1000);
	 					driver.switchTo().window(parent3);
	 					Thread.sleep(1000);
						MISC2=hishomepage.doNavigateToPharmacyIssueforMISC_Change_In_HISITR2();
						WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
						MISC2.getStoreUhidTextBox().sendKeys(checkIN);
						Thread.sleep(2000);
						MISC2.getStoreUhidImgSerch().click();
						wait.until(ExpectedConditions.invisibilityOf(MISC2.getBlackOverlay()));
						MISC2.getStoreUhidIssueQuantity().clear();
						
						Thread.sleep(10000);
						parent3 = driver.getWindowHandle();
						utilobj.Window(driver);
						driver.findElement(By.id("ctl00_cphpage_grdIssueDetails_ctl02_imgbtnSearchSubstituteNew")).click();
						Thread.sleep(1000);
						utilobj.ChildWindow(driver);
						Thread.sleep(1000);
						System.out.println(driver.getTitle());
						Thread.sleep(1000);
						
//						MISC2.getlableprecripstionlink().click();
						driver.findElement(By.xpath("//*[@id='ChkSelect0']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id='btnSelect']")).click();
						
						
//						wait.until(ExpectedConditions.invisibilityOf(MISC2.getBlackOverlay()));
						driver.switchTo().window(parent3);
	 					Thread.sleep(20000);
						MISC2.getStoreUhidIssueQuantity().clear();
						Thread.sleep(1000);
						MISC2.getStoreUhidIssueQuantity().sendKeys("5");
						Thread.sleep(2000);
						MISC2.getStoreUhidIssueSaveButton().click();
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
						
						
					}
					@Test(priority = 21)
					@Parameters("browser")
					public void DoTest_OneDoctorOnePrescriptionWithFullyIssue(String Browser) throws InterruptedException {
						Thread.sleep(2000);
						utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
						Thread.sleep(2000);
						Thread.sleep(1000);
						utilobj.MoveElement(MISC2.getClinicalRecordsLink(), driver);
						Thread.sleep(2000);
						MISC2.getDoctorWorklistLink().click();
						Thread.sleep(4000);
						boolean InformationBoxPresent=MISC2.getDoctorWorklist_informationMessageBox_CancelButton().isDisplayed();
						if(InformationBoxPresent==true) {
							MISC2.getDoctorWorklist_informationMessageBox_CancelButton().click();
						}
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
						wait.until(ExpectedConditions.visibilityOf(MISC2.getdoctorworklist_checkintextBox()));
						Thread.sleep(2000);
						utilobj.JSEnterText(MISC2.getdoctorworklist_checkintextBox(), driver, checkIN);
						Thread.sleep(2000);

					utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
					Thread.sleep(2000);
					utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
//						Thread.sleep(2000);
						Thread.sleep(2000);
					 parent3 = driver.getWindowHandle();
						utilobj.Window(driver);
						MISC2.getlableprecripstionlink().click();
						Thread.sleep(2000);
						utilobj.ChildWindow(driver);
						Thread.sleep(1000);
						System.out.println(driver.getTitle());
						Thread.sleep(1000);
//						String MedicineName=MISC2.getPrescription_MedicationBlock_MedicineNameRow().getText();
//						Thread.sleep(1000);
						
//						Thread.sleep(1000);
//						MISC2.getPrescriptionWindowCloseButton().click();
//						Thread.sleep(1000);
//	 					driver.switchTo().window(parent3);
//	 					Thread.sleep(1000);
//						assertEquals(MedicineName, null);
						}
					
					
}

