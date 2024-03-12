package com.qa.HIS.BrowserCompatibility_HIS;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OperationTheatrePage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class OperationTheatreTest extends CrossBrowser {
	public OperationTheatreTest()
	{
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OperationTheatrePage operationtheatrepage;
	public String UHID=null;
	public String CHKINno=null;
	util utilobj = new util();
	String newDate;
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("OperationTheatreFacility"),Browser);
	}
	@Test(priority =3)
	
	public void doNavigateTopatientCheck_in_Link() throws InterruptedException {
		operationtheatrepage=hishomepage.doNavigateToUHIDcreationOperationtheartreLink();}
	@Test(priority = 4)
		public void doTestForcreatePatientCheck_IN() throws InterruptedException {
			
		

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOf(operationtheatrepage.getTxtIPNO()));
		Thread.sleep(1000);
		operationtheatrepage.getTxtIPNO().sendKeys("1100099900");
		Thread.sleep(2000);
		operationtheatrepage.getLnkbtnIPNo().click();
		wait.until(ExpectedConditions.visibilityOf(operationtheatrepage.getHisLiveListControlchkUHID()));
		Thread.sleep(2000);
		operationtheatrepage.getHisLiveListControlchkUHID().click();
		Thread.sleep(2000);
		operationtheatrepage.getHisLiveListControlbtnSelect().click();
		Thread.sleep(3000);
//		operationtheatrepage.getBtnSaveDisplay().isEnabled();
//		Thread.sleep(3000);
		utilobj.JSClick(operationtheatrepage.getpatientCheckInNumberSeviceOkButton(), driver);
		Thread.sleep(3000);
		
		operationtheatrepage.getpatientCheckInNumberSaveButton().click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		System.out.println(operationtheatrepage.getPopupmessage().getText());
		
		Thread.sleep(2000);
		System.out.println(utilobj.GetCheckinNumberText(operationtheatrepage.getPopupmessage(), driver));
		Thread.sleep(2000);
		String strCheckinNumber = utilobj.GetCheckinNumberText(operationtheatrepage.getPopupmessage(), driver);
		Thread.sleep(2000);
        System.out.println(strCheckinNumber);
        Thread.sleep(2000);  
		CHKINno=strCheckinNumber;
		}
	@Test(priority = 5)
	@Parameters("browser")
	public void dotestforOT_PAC(String Browser) throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		Thread.sleep(1000);
		operationtheatrepage.getpatientCheckInNumberinfoMsgboxcancelbutton().click();
		 Thread.sleep(2000);
		 utilobj.MoveElement(operationtheatrepage.getClinicalRecordLink(),driver);
		 Thread.sleep(2000);
		 utilobj.JSClick(operationtheatrepage.getDoctorWorklistLink(), driver);
		 wait.until(ExpectedConditions.visibilityOf(operationtheatrepage.getDoctorWorkList_CheckINnoTXTbox()));
		Thread.sleep(2000);
		utilobj.JSEnterText(operationtheatrepage.getDoctorWorkList_CheckINnoTXTbox(), driver,CHKINno);
		Thread.sleep(2000);
		//getDoctorWorkList_CheckINnoTXTbox().sendKeys(chkIN);
		//hread.sleep(2000);
		operationtheatrepage.getDoctorWorkList_CheckINnoSearchIMG().click();
		Thread.sleep(2000);
		operationtheatrepage.getDoctorWorkList_CheckINnoOpenCasesheet().click();
		wait.until(ExpectedConditions.visibilityOf(operationtheatrepage.getDoctorWorkList_IPcaseSheet_Prescription()));
		Thread.sleep(2000);
		

		operationtheatrepage.getpopok().click();

		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		operationtheatrepage.getDoctorWorkList_IPcaseSheet_Prescription().click();

		Thread.sleep(2000);

		
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);

		
		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.visibilityOf(operationtheatrepage.getHI_SurgerybuttonADD()));
		Thread.sleep(2000);

		utilobj.JSClick(operationtheatrepage.getHI_SurgerybuttonADD(), driver);
		Thread.sleep(2000);
		
		utilobj.JSEnterText(operationtheatrepage.getHI_TXTSearch(),driver,"Bone regeneration/repair procedure - as part of a flap operation");//shi h
		Thread.sleep(2000);

		utilobj.JSClick(operationtheatrepage.getHI_procedurebutton(), driver);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(operationtheatrepage.getHI_selectitem()));
		Thread.sleep(2000);
		utilobj.JSClick(operationtheatrepage.getHI_selectitem(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(operationtheatrepage.getHI_checksurgerychkbox(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(operationtheatrepage.getHI_TXTOKButton(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(operationtheatrepage.getHI_TXTcloseButton(), driver);		
		Thread.sleep(2000);	
		

		utilobj.JSClick(operationtheatrepage.getbtnISaveClose(), driver);
		Thread.sleep(2000);	
		utilobj.waitForalert(driver);
		Thread.sleep(2000);	
		driver.switchTo().alert().accept();
		Thread.sleep(2000);	
		driver.switchTo().window(parent3);
		Thread.sleep(2000);	
		operationtheatrepage.getpopok().click();
	}
		@Test(priority = 6)
		@Parameters("browser")
		public void dotestforOT_PACandShduling(String Browser) throws InterruptedException {
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		utilobj.MoveElement(operationtheatrepage.getOTandResourceSchedulingLink(), driver);
		Thread.sleep(2000);	
		utilobj.JSClick(operationtheatrepage.getViewOTList(), driver);
		Thread.sleep(2000);	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		Calendar cal = Calendar.getInstance();
		String Date = sdf.format(cal.getTime());
		System.out.println(Date);	
		cal.add(Calendar.DAY_OF_MONTH, 1);
	  newDate = sdf.format(cal.getTime());
		  Thread.sleep(2000);
		 
		  cal.add(Calendar.DAY_OF_MONTH, -20);
		  String newDateforsearch = sdf.format(cal.getTime()); 
		  Thread.sleep(2000);
		  System.out.println(newDateforsearch);	
		  utilobj.JSEnterText(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[1]/tbody/tr[1]/td[2]/input")), driver, newDateforsearch);
		  Thread.sleep(2000);
		  
		  utilobj.JSClick(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[1]/tbody/tr[1]/td[5]/div/div/input[1]")), driver);
		  Thread.sleep(2000);
		 // utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_gdvPatientList_ctl04_btnCancelSurgery")), driver);//cencel button
		 // Thread.sleep(2000);
		 // utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBox_ButtonNo")), driver);//cencel button no button
		  
		  utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnClear")), driver);
		  Thread.sleep(2000);
		  utilobj.JSClick(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[1]/tbody/tr[1]/td[5]/div/div/input[1]")), driver);
		  Thread.sleep(2000);
		//  operationtheatrepage.getHIS().click();	
		//Thread.sleep(2000);
	//System.out.println(getPAC_nexttaskDDL().getText());
		List<WebElement>list=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div[1]/div/table/tbody/tr/td[7]//a"));
		int trno=list.size()+1;
		System.out.println(trno);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div[1]/div/table/tbody/tr["+trno+"]/td[7]//a")).click();
			Thread.sleep(2000);
		String parent4 = driver.getWindowHandle();//for PAC
		utilobj.Window(driver);
		operationtheatrepage.getHISnewTask_OKButton().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//utilobj.JSEnterText(getPAC_BPtxtBox(), driver,"120");
	//Thread.sleep(1000);
//	utilobj.JSEnterText(getPAC_HeighttxtBox(), driver, "172");
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(operationtheatrepage.getPAC_TemptxtBox()));
	utilobj.JSEnterText(operationtheatrepage.getPAC_TemptxtBox(), driver, "96c");
	
	Thread.sleep(2000);
	utilobj.selectDropdown(operationtheatrepage.getPAC_ASAPhyscicalstatusDDL(), driver, "ASA I - A normal healthy patient",Browser);
		Thread.sleep(2000);
		utilobj.JSClick(operationtheatrepage.getPAC_SaveButton(), driver);
		Thread.sleep(2000);
		driver.findElement(By.id("popup_ok")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent4);
		Thread.sleep(2000);
//		operationtheatrepage.testcaseforSchduling();
		Thread.sleep(2000);	
		utilobj.MoveElement(operationtheatrepage.getOTandResourceSchedulingLink(), driver);
		Thread.sleep(2000);	
		utilobj.JSClick(operationtheatrepage.getViewOTList(), driver);
		
		Thread.sleep(2000);//schduling
//		operationtheatrepage.getHIS().click();
//		Thread.sleep(2000);
		List<WebElement>list2=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div[1]/div/table/tbody/tr/td[7]//a"));
		int trno1=list2.size()+1;
		System.out.println(trno);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div[1]/div/table/tbody/tr["+trno1+"]/td[7]//a")).click();
			Thread.sleep(2000);
		String parent5 = driver.getWindowHandle();
		utilobj.Window(driver);
		operationtheatrepage.getHISnewTask_OKButton().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		utilobj.JSEnterText(operationtheatrepage.getSchduling_date(), driver, newDate);
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/fieldset/table/tbody/tr[3]/td[2]/input")), driver, "Test Remarks");
				Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("tsTOTime_imgUp")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("tsTOTime_imgUp")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/fieldset/table/tbody/tr[3]/td[3]/input")), driver);
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("gdvResourceDetails_ctl02_ddlresource")), driver, "Anandan  N", Browser);
		
		utilobj.JSClick(driver.findElement(By.id("btnSave")), driver);
		Thread.sleep(2000);
//		/html/body/form/div[3]/div/div[2]/div[3]/div/input[1]
		driver.findElement(By.id("MyMessageBoxInfo_ButtonOK")).click();
	
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("btnclose")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent5);
		Thread.sleep(2000);
		
	}

	

}
