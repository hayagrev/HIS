package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class ANMServicesPage extends BasePage {
	
	util utilobj = new util();

	public ANMServicesPage(WebDriver driver) {
		super(driver);
	}
	

	private By popupmessage = By.id("popup_message");
	private By popupmessageInformation = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[3]/div[1]/div[2]/p");
	
	private By ActionTaken=By.id("ctl00_cphpage_grvResults_ctl03_ddlActionTaken");
	private By SaveBtn=By.id("ctl00_cphpage_btnSave");
	private By OkBtn=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");
	String lblchkin1 = "//span[text()='";
	String lblchkin2 = "']";
	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	

	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	private By btnOK = By.id("ctl00_cphpage_btnOK");

	private By btnSaveDisplay = By.id("ctl00_cphpage_btnSaveDisplay");

	private By btncancel = By.id("popup_cancel");
	private By ddlSpecialisation = By.id("ctl00_cphpage_ddlSpecialisation");
	private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");
	private By lableprecripstionlink = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[4]/table[1]/tbody/tr/td[3]/a");
    /* before */
//private By lableprecripstionlink = By.("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[2]/table[1]/tbody/tr/td[3]/a");
private By txtOrdPackSearch = By.id("txtOrdPackSearch");
private By orderpack = By.id("97701");

private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

private By orderpackselection = By.id("18929"); //

private By btnISaveClose = By.id("btnISaveClose"); //

private By popok = By.id("popup_ok");
	public WebElement getActionTaken() {
		return getElement(ActionTaken);
	}

	public WebElement getSaveBtn() {
		return getElement(SaveBtn);
	}
	

	public WebElement getOkBtn() {
		return getElement(OkBtn);
	}
	public WebElement getTxtIPNO() {
		return getElement(txtIPNO);
	}
	public WebElement getLnkbtnIPNo() {
		return getElement(lnkbtnIPNo);
	}

	public WebElement getHisLiveListControlchkUHID() {
		return getElement(hisLiveListControlchkUHID);
	}

	public WebElement getHisLiveListControlbtnSelect() {
		return getElement(hisLiveListControlbtnSelect);
	}

	public WebElement getBtnOK() {
		return getElement(btnOK);
	}

	public WebElement getBtnSaveDisplay() {
		return getElement(btnSaveDisplay);
	}

	public WebElement getBtncancel() {
		return getElement(btncancel);
	}
	public WebElement getDdlSpecialisation() {
		return getElement(ddlSpecialisation);
	}
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	public WebElement getpopupmessageInformation() {
		return getElement(popupmessageInformation);

	}
	
	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

	}

	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}

	public WebElement getorderpack() {
		return getElement(orderpack);

	}

	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}

	public WebElement getlblBillNo1(String checkinNumber) {
		return getElement(By.xpath(lblchkin1 + checkinNumber + lblchkin2));
		//// span[text()='OPGENE012100026']
	}
	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}

	public WebElement getpopok() {
		return getElement(popok);

	}
	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}
//	public void doPatientCheckIN(String IPNumber, String SpecialisationName) throws InterruptedException {
//
//		
//
//			getTxtIPNO().sendKeys("1100099900");
//			Thread.sleep(2000);
//			getLnkbtnIPNo().click();
//			Thread.sleep(2000);
//			getHisLiveListControlchkUHID().click();
//			Thread.sleep(2000);
//			getHisLiveListControlbtnSelect().click();
//			
//			Thread.sleep(3000);
//			getBtnSaveDisplay().isEnabled();
//			Thread.sleep(2000);
//			utilobj.selectDropdown(getDdlSpecialisation(), driver, SpecialisationName);
//			Thread.sleep(2000);
//			
//
//			utilobj.ActionClick(getBtnOK(), driver);
//
//			
//			Thread.sleep(2000);
//
//			
//
//			 getBtnSaveDisplay().click();
//			Thread.sleep(2000);
//			
//			
//
//			
//			
//
//		}
//
//		
//	
//	public String getPatientCheckinNumber() throws InterruptedException {
//		Thread.sleep(2000);
//		System.out.println(getPopupmessage().getText());
//		Thread.sleep(2000);
//		System.out.println(utilobj.GetCheckinNumberText(getPopupmessage(), driver));
//		Thread.sleep(2000);
//		String strCheckinNumber = utilobj.GetCheckinNumberText(getPopupmessage(), driver);
//		Thread.sleep(2000);
//		getBtncancel().click();
//		Thread.sleep(2000);
//		return strCheckinNumber;
//		
//		
//	}
//	public void doCasesheetprecripstion(String orderpackname) throws InterruptedException {
//
//		
//			Thread.sleep(2000);
//			getpopok().click();
//			Thread.sleep(2000);
//			String parent3 = driver.getWindowHandle();
//
//			utilobj.Window(driver);
//			Thread.sleep(2000);
//			getlableprecripstionlink().click();
//
//			Thread.sleep(2000);
//
//			
//			utilobj.ChildWindow(driver);
//			Thread.sleep(2000);
//
//			
//			System.out.println(driver.getTitle());
//			Thread.sleep(2000);
//			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);
//			Thread.sleep(2000);
//
//			utilobj.JSClick(getclickorderpackbutton(), driver);
//			Thread.sleep(5000);	
//
//			utilobj.JSClick(getorderpackselection(), driver);
//
//			Thread.sleep(5000);
//
//			
//			utilobj.JSClick(getbtnISaveClose(), driver);
//			Thread.sleep(2000);
//			utilobj.waitForalert(driver);
//			Thread.sleep(2000);
//			driver.switchTo().alert().accept();
//			Thread.sleep(2000);
//			driver.switchTo().window(parent3);
//
//			
//			Thread.sleep(2000);
//			getpopok().click();
//		
//
//	}
//		
//
//	public void doANMServices(String ActionTaken,String txtcheckIN) {
//
//		try
//
//		{Thread.sleep(1000);
//			//WebElement checkin  = driver.findElement(By.xpath("//*[@id='ctl00_cphpage_lblCheckinNO_OP']"));
//		
//		utilobj.JSEnterText(driver.findElement(By.xpath("//*[@id='ctl00_cphpage_txtAdmissionno']")), driver, txtcheckIN);
//		 Thread.sleep(1000);
//		 utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgAdmissionno")), driver);
//			Thread.sleep(1000);
//		WebElement searchCheckIn = driver.findElement(By.xpath("//*[@id='ctl00_cphpage_imgAdmissionno']"));
//		 
//		 Thread.sleep(1000);
//			getActionTaken().sendKeys(ActionTaken);
//			 Thread.sleep(1000);
//
//			getSaveBtn().click();
//			 Thread.sleep(2000);
//			 getOkBtn().click();
//			 Thread.sleep(2000);
//			 utilobj.JSEnterText(driver.findElement(By.xpath("//*[@id='ctl00_cphpage_txtAdmissionno']")), driver, txtcheckIN);
//			 Thread.sleep(2000);
//			 utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgAdmissionno")), driver);
//				
//			 Thread.sleep(2000);
//			 
//			 driver.findElement(By.id("ctl00_cphpage_grvResults_ctl02_chkselect")).click();
//			 Thread.sleep(2000);
//			 driver.findElement(By.id("ctl00_cphpage_grvResults_ctl02_txtReason")).sendKeys("test Reason");
//			 Thread.sleep(2000);
//			 driver.findElement(By.id("ctl00_cphpage_btnDelete1")).click();
//			 Thread.sleep(2000);
//			 getOkBtn().click();
//			 
//		}
//
//		catch (Exception ex) {
//			System.err.println(ex);
//		}
//
//	}

}