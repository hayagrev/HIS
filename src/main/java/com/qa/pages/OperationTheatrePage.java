package com.qa.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class OperationTheatrePage extends BasePage {

	public OperationTheatrePage(WebDriver driver) {
		super(driver);
		
	}
	 String newDate;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	util utilobj = new util();
	private By Title = By.id("ctl00_cphpage_ddlTitle");
	private By FirstName = By.id("ctl00_cphpage_txtFirstName");
	private By LastName = By.id("ctl00_cphpage_txtLastName");
	private By MarriageStatus = By.xpath("//*[@id='ctl00_cphpage_ddlMarriage']");
	private By Age = By.id("ctl00_cphpage_txtAge");
	private By PresentAddres = By.id("ctl00_cphpage_txtPresentAddress1");
	private By Savebutton = By.id("ctl00_cphpage_btnSaveDisplay");
	private By btnYes = By.id("ctl00_cphpage_btnYes1");
	private By InformationPopUp = By.id("ctl00_cphpage_btnYes");
	private By UHID_creation_printButton = By.id("ctl00_cphpage_btnPrint");
	private By UHID_creation_Uhid_txtbox = By.id("ctl00_cphpage_txtUhid");//ctl00_cphpage_btnOK
	private By UHID_creation_Uhid_succes = By.id("ctl00_cphpage_btnOK11");
	private By UHID_creation_Uhid_OPDNumber = By.id("ctl00_cphpage_lnkbtnCheckIn");
	private By patientCheckInNumberUHIDTXTBOX=By.id("ctl00_cphpage_txtuhid");
	private By patientCheckInNumberSeviceOkButton=By.id("ctl00_cphpage_btnOK");
	private By patientCheckInNumberSaveButton=By.id("ctl00_cphpage_btnSaveDisplay");
	private By patientCheckInNumberinfoMsgboxcancelbutton=By.id("popup_cancel");
	private By patientCheckInNumberRegistration=By.id("ctl00_cphpage_lnkRegistration");
	private By ClinicalRecords=By.linkText("Clinical Records");
	private By DoctorWorklist=By.linkText("Doctor Worklist");
	private By Registration=By.linkText("Registration");
	private By PatientCheck_In=By.linkText("Patient Check-In /Registration");
	private By btnISaveClose = By.id("btnISaveClose");
	private By popupmessage = By.id("popup_message");
	private By DoctorWorkList_CheckINnoTXTbox = By.id("ctl00_cphpage_txtCheckinno");
	private By DoctorWorkList_CheckINnoSearchIMG = By.id("ctl00_cphpage_imgCheckinno");
	private By DoctorWorkList_CheckINnoOpenCasesheet = By.id("ctl00_cphpage_btnCOpenCaseSheet");
	private By DoctorWorkList_IPcaseSheet_Prescription = By.id("ctl00_cphpage_trvSectionst11");
	
	private By HI_SurgerybuttonADD=By.id("btnAddP");
	
	private By HI_TXTSearch=By.id("txtPSearch");
	private By HI_procedurebutton=By.id("btnProcedures");
	private By HI_selectitem=By.id("57002,5");
	//html/body/form/div[3]/div[2]/table/tbody/tr/td/div/div[3]/a[1]
	
	private By HI_checksurgerychkbox=By.id("chkSurgery");
	private By HI_TXTOKButton=By.id("btnOKP");
	private By HI_TXTcloseButton=By.id("btnP");
	private By OTandResourceScheduling=By.linkText("OT and Resource Scheduling");
	private By ViewOTList=By.linkText("View OT List");
	private By HIS=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div[1]/div/table/tbody/tr[2]/td[7]/a");
	
	private By HISnewTask_OKButton=By.id("ctl00_cphpage_btnNextTask");
	private By PAC_BPtxtBox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[2]/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div/div/table[2]/tbody/tr/td[2]/input");
	private By PAC_TemptxtBox=By.id("ctl00_cphpage_txtTemp");
	private By PAC_HeighttxtBox=By.id("ctl00_cphpage_txtHeight");
	private By PAC_ASAPhyscicalstatusDDL=By.id("ctl00_cphpage_ddlASA");
	private By PAC_backgroundsearchIMG=By.id("//*[@id='mpeTests_backgroundElement']");
	
	private By PAC_SaveButton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[5]/div/div/input[1]");
	private By PAC_nexttaskDDL=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div[2]/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/select");
	private By Schduling_date=By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/fieldset/table/tbody/tr[1]/td[6]/input");
	
	
	
	
	
	
	
	/*priscription*/
	public WebElement getHI_SurgerybuttonADD() {
		return getElement(HI_SurgerybuttonADD);
	}
	public WebElement getPAC_backgroundsearchIMG() {
		return getElement(PAC_backgroundsearchIMG);
	}
	public WebElement getHI_TXTSearch() {
		return getElement(HI_TXTSearch);
	}
	public WebElement  getHI_procedurebutton() {
		return getElement( HI_procedurebutton);
	}
	public WebElement getHI_selectitem() {
		return getElement(HI_selectitem);
	}
	public WebElement getHI_checksurgerychkbox() {
		return getElement(HI_checksurgerychkbox);
	}
	public WebElement getHI_TXTOKButton() {
		return getElement(HI_TXTOKButton);
	}
	public WebElement getHI_TXTcloseButton() {
		return getElement(HI_TXTcloseButton);
	}

	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}
	/*END priscription*/
	/*Operationtheatre*/
	public WebElement getOTandResourceSchedulingLink() {
		return getElement(OTandResourceScheduling);
	}
	public WebElement getViewOTList() {
		return getElement(ViewOTList);
	}
	public WebElement getHIS() {
		return getElement(HIS);
	}
	public WebElement getHISnewTask_OKButton() {
		return getElement(HISnewTask_OKButton);
	}
	public WebElement getPAC_BPtxtBox() {
		return getElement(PAC_BPtxtBox);
	}
	public WebElement getPAC_TemptxtBox() {
		return getElement(PAC_TemptxtBox);
	}
	public WebElement getPAC_HeighttxtBox() {
		return getElement(PAC_HeighttxtBox);
	}
	public WebElement getPAC_SaveButton() {
		return getElement(PAC_SaveButton);
	}
	/*END Operationtheatre*/
	
	public WebElement getTitle() {
		return getElement(Title);
	}

	public WebElement getFirstName() {
		return getElement(FirstName);
	}

	public WebElement getLastName() {
		return getElement(LastName);
	}

	public WebElement getMarriageStatus() {
		return getElement(MarriageStatus);
	}

	public WebElement getAge() {
		return getElement(Age);
	}

	public WebElement getPresentAddres() {
		return getElement(PresentAddres);
	}

	public WebElement getSavebutton() {
		return getElement(Savebutton);
	}
	
	public WebElement getbtnYes() {
		return getElement(btnYes);
	}
	
	public WebElement getInformationPopUp() {
		return getElement(InformationPopUp);
	}

	public WebElement getUHID_creation_Uhid_OPDNumber() {
		return getElement(UHID_creation_Uhid_OPDNumber);
	}
	public WebElement getUHID_creation_Uhid_succes() {
		return getElement(UHID_creation_Uhid_succes);
	}

	public WebElement getUHID_creation_Uhid_txtbox() {
		return getElement(UHID_creation_Uhid_txtbox);
	}
	public WebElement getpatientCheckInNumberinfoMsgboxcancelbutton() {
		return getElement(patientCheckInNumberinfoMsgboxcancelbutton);
	}
	public WebElement getpatientCheckInNumberRegistration() {
		return getElement(patientCheckInNumberRegistration);
	}
	public WebElement getpatientCheckInNumberSaveButton() {
		return getElement(patientCheckInNumberSaveButton);
	}
	public WebElement getpatientCheckInNumberSeviceOkButton() {
		return getElement(patientCheckInNumberSeviceOkButton);
	}
	public WebElement getpatientCheckInNumberUHIDTXTBOX() {
		return getElement(patientCheckInNumberUHIDTXTBOX);
	}
	public WebElement getRegistrationLink() {
		return getElement(Registration);
	}
	public WebElement getPatientCheck_inLink() {
		return getElement(PatientCheck_In);
	}
	public WebElement getClinicalRecordLink() {
		return getElement(ClinicalRecords);
	}
	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklist);
	}
	
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	public WebElement getDoctorWorkList_CheckINnoTXTbox() {
		return getElement(DoctorWorkList_CheckINnoTXTbox);

	}
	public WebElement getDoctorWorkList_CheckINnoSearchIMG() {
		return getElement(DoctorWorkList_CheckINnoSearchIMG);

	}
	public WebElement getDoctorWorkList_CheckINnoOpenCasesheet() {
		return getElement(DoctorWorkList_CheckINnoOpenCasesheet);

	}
	public WebElement getDoctorWorkList_IPcaseSheet_Prescription() {
		return getElement(DoctorWorkList_IPcaseSheet_Prescription);

	}
	public WebElement getPAC_ASAPhyscicalstatusDDL() {
		return getElement(PAC_ASAPhyscicalstatusDDL);

	}
	public WebElement getSchduling_date() {
		return getElement(Schduling_date);

	}
	public WebElement getPAC_nexttaskDDL() {
		return getElement(PAC_nexttaskDDL);

	}
	private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");

	public WebElement getTxtIPNO() {
		return getElement(txtIPNO);
	}
	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");
	public WebElement getLnkbtnIPNo() {
		return getElement(lnkbtnIPNo);
	}
	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	public WebElement getHisLiveListControlchkUHID() {
		return getElement(hisLiveListControlchkUHID);
	}
	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	public WebElement getHisLiveListControlbtnSelect() {
		return getElement(hisLiveListControlbtnSelect);
	}
	private By btnOK = By.id("ctl00_cphpage_btnOK");
	public WebElement getBtnOK() {
		return getElement(btnOK);
	}
	private By btnSaveDisplay = By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getBtnSaveDisplay() {
		return getElement(btnSaveDisplay);
	}
	private By popok = By.id("popup_ok");
	public WebElement getpopok() {
		return getElement(popok);

	}

	
	
	
//	public  void testcaseforUhidCreate(String Title, String FirstName, String LastName, String MaritalStatus1, String Age,
//			String Address) throws InterruptedException {
////		Thread.sleep(1000);
////		utilobj.MoveElement(getRegistrationLink(), driver);
////		Thread.sleep(1000);
////		utilobj.JSClick(getUHIDcreationLinkLink(), driver);
//		Thread.sleep(2000);
//	utilobj.selectDropdown(getTitle(), driver, Title);
//	Thread.sleep(2000);
//	getFirstName().sendKeys(FirstName);
//	Thread.sleep(2000);
//	getLastName().sendKeys(LastName);
//	
//	Thread.sleep(2000);
//	
//	System.out.println(MaritalStatus1 + getMarriageStatus());
//	//utilobj.selectDropdown(getMarriageStatus(), driver, MaritalStatus1);
//	Thread.sleep(2000);
//	getAge().sendKeys(Age);
//	Thread.sleep(2000);
//	getPresentAddres().sendKeys(Address);
//	Thread.sleep(2000);
//	getSavebutton().click();
//	Thread.sleep(2000);
//	getbtnYes().click();
//	Thread.sleep(2000);
//	getInformationPopUp().click();
//	Thread.sleep(2000);
//	getUHID_creation_Uhid_succes().click();
//	Thread.sleep(2000);
//	utilobj.JSClick(getUHID_creation_Uhid_OPDNumber(), driver);
//	//getUHID_creation_Uhid_OPDNumber().click();
//
//	
//	
//
//}
	public String getUhid() {
		String uhid=getpatientCheckInNumberUHIDTXTBOX().getAttribute("value");
		System.out.println(uhid);
		
		
		return uhid;
	}
//	public void get_CreateCheckINnumber() throws InterruptedException {
//		Thread.sleep(2000);
//		getTxtIPNO().sendKeys("1111111111");
//		Thread.sleep(2000);
//		getLnkbtnIPNo().click();
//		Thread.sleep(2000);
//		getHisLiveListControlchkUHID().click();
//		Thread.sleep(2000);
//		getHisLiveListControlbtnSelect().click();
//		Thread.sleep(3000);
//		getBtnSaveDisplay().isEnabled();
//		Thread.sleep(3000);
//		utilobj.JSClick(getpatientCheckInNumberSeviceOkButton(), driver);
//		
//		Thread.sleep(2000);
//		getpatientCheckInNumberSaveButton().click();
//		Thread.sleep(2000);
//
//		Thread.sleep(2000);
//		System.out.println(getPopupmessage().getText());
//		
//		Thread.sleep(2000);
//		}
	public String getCHKIN() throws InterruptedException
	{
		System.out.println(utilobj.GetCheckinNumberText(getPopupmessage(), driver));
		Thread.sleep(2000);
		String strCheckinNumber = utilobj.GetCheckinNumberText(getPopupmessage(), driver);
		Thread.sleep(2000);
        System.out.println(strCheckinNumber);
        Thread.sleep(2000);    
		
		 return strCheckinNumber;
		
	}
//	public void getdoctorworkList(String chkIN) throws InterruptedException {
//		 Thread.sleep(1000);
//		 getpatientCheckInNumberinfoMsgboxcancelbutton().click();
//		 Thread.sleep(2000);
//		 utilobj.MoveElement(getClinicalRecordLink(),driver);
//		 Thread.sleep(2000);
//		 utilobj.JSClick(getDoctorWorklistLink(), driver);		
//		Thread.sleep(2000);
//		utilobj.JSEnterText(getDoctorWorkList_CheckINnoTXTbox(), driver,chkIN);
//		Thread.sleep(2000);
//		//getDoctorWorkList_CheckINnoTXTbox().sendKeys(chkIN);
//		//hread.sleep(2000);
//		getDoctorWorkList_CheckINnoSearchIMG().click();
//		Thread.sleep(2000);
//		getDoctorWorkList_CheckINnoOpenCasesheet().click();
//		Thread.sleep(2000);
//		
//
//		getpopok().click();
//
//		String parent3 = driver.getWindowHandle();
//
//		utilobj.Window(driver);
//
//		getDoctorWorkList_IPcaseSheet_Prescription().click();
//
//		Thread.sleep(2000);
//
//		// utilobj.ChildWindowforPrescription(driver);
//		utilobj.ChildWindow(driver);
//		Thread.sleep(2000);
//
//		// driver.switchTo().window("ClientSide_Prescriptions");
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//
//		utilobj.JSClick(getHI_SurgerybuttonADD(), driver);
//		Thread.sleep(2000);
//		
//		utilobj.JSEnterText(getHI_TXTSearch(),driver,"Appendicectomy");
//		Thread.sleep(2000);
//
//		utilobj.JSClick(getHI_procedurebutton(), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(getHI_selectitem(), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(getHI_checksurgerychkbox(), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(getHI_TXTOKButton(), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(getHI_TXTcloseButton(), driver);		
//		Thread.sleep(2000);	
//		
//
//		utilobj.JSClick(getbtnISaveClose(), driver);
//		Thread.sleep(2000);	
//		utilobj.waitForalert(driver);
//		Thread.sleep(2000);	
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);	
//		driver.switchTo().window(parent3);
//		Thread.sleep(2000);	
//		getpopok().click();
//		utilobj.MoveElement(getOTandResourceSchedulingLink(), driver);
//		Thread.sleep(2000);	
//		utilobj.JSClick(getViewOTList(), driver);
//		Thread.sleep(2000);	
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
//		Calendar cal = Calendar.getInstance();
//		String Date = sdf.format(cal.getTime());
//		System.out.println(Date);	
//		cal.add(Calendar.DAY_OF_MONTH, 1);
// 	  newDate = sdf.format(cal.getTime());
//		  Thread.sleep(2000);
//		 
//		  cal.add(Calendar.DAY_OF_MONTH, -20);
//		  String newDateforsearch = sdf.format(cal.getTime());
//		  Thread.sleep(2000);
//		  System.out.println(newDateforsearch);	
//		  utilobj.JSEnterText(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[1]/tbody/tr[1]/td[2]/input")), driver, newDateforsearch);
//		  Thread.sleep(2000);
//		  
//		  utilobj.JSClick(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[1]/tbody/tr[1]/td[5]/div/div/input[1]")), driver);
//		  Thread.sleep(2000);
//		 // utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_gdvPatientList_ctl04_btnCancelSurgery")), driver);//cencel button
//		 // Thread.sleep(2000);
//		 // utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBox_ButtonNo")), driver);//cencel button no button
//		  
//		  utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnClear")), driver);
//		  Thread.sleep(2000);
//		  utilobj.JSClick(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[1]/tbody/tr[1]/td[5]/div/div/input[1]")), driver);
//		  Thread.sleep(2000);
//		getHIS().click();	
//		Thread.sleep(2000);
//	//System.out.println(getPAC_nexttaskDDL().getText());
//		
//			
//			Thread.sleep(2000);
//		String parent4 = driver.getWindowHandle();//for PAC
//		utilobj.Window(driver);
//		getHISnewTask_OKButton().click();
//		Thread.sleep(2000);
//		utilobj.ChildWindow(driver);
//		Thread.sleep(2000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		//utilobj.JSEnterText(getPAC_BPtxtBox(), driver,"120");
//	//Thread.sleep(1000);
////	utilobj.JSEnterText(getPAC_HeighttxtBox(), driver, "172");
////		Thread.sleep(2000);
//	utilobj.JSEnterText(getPAC_TemptxtBox(), driver, "96c");
//	Thread.sleep(2000);
//	utilobj.selectDropdown(getPAC_ASAPhyscicalstatusDDL(), driver, "ASA I - A normal healthy patient");
//		Thread.sleep(2000);
//		utilobj.JSClick(getPAC_SaveButton(), driver);
//		Thread.sleep(2000);
//		driver.close();
//		Thread.sleep(2000);
//		driver.switchTo().window(parent4);
//		Thread.sleep(2000);
//		}
		
			
	
//		public void testcaseforSchduling() throws InterruptedException {
//			Thread.sleep(2000);	
//		utilobj.MoveElement(getOTandResourceSchedulingLink(), driver);
//		Thread.sleep(2000);	
//		utilobj.JSClick(getViewOTList(), driver);
//		Thread.sleep(2000);	
//		
//		Thread.sleep(2000);//schduling
//		getHIS().click();
//		Thread.sleep(2000);
//		String parent5 = driver.getWindowHandle();
//		utilobj.Window(driver);
//		getHISnewTask_OKButton().click();
//		Thread.sleep(2000);
//		utilobj.ChildWindow(driver);
//		Thread.sleep(2000);
//		utilobj.JSEnterText(getSchduling_date(), driver, newDate);
//		Thread.sleep(2000);
//		utilobj.JSEnterText(driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/fieldset/table/tbody/tr[3]/td[2]/input")), driver, "Test Remarks");
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/fieldset/table/tbody/tr[3]/td[3]/input")), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("tsTOTime_imgUp")), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("tsTOTime_imgUp")), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("btnSave")), driver);
//		Thread.sleep(2000);
////		/html/body/form/div[3]/div/div[2]/div[3]/div/input[1]
//		
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.close();
//		Thread.sleep(2000);
//		driver.switchTo().window(parent5);
//		Thread.sleep(2000);
//       }



}
		
		
		
		
		
		
		
		
		
		
	
	

