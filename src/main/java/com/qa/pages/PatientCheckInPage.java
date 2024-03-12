package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

 public class PatientCheckInPage extends BasePage {
	
	 util utilobj = new util();
	HomePage homeobj;
	HISHomePage hisobj;
	SelectHospitalLocationPage selecthospitallocationpage;

	public PatientCheckInPage(WebDriver driver) {
		super(driver);

	}

	private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");
	                           
	// Livelist Control

	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");

	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	private By hisLiveListControlchkUHID2 = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl03_chkUHID");

	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	                                                
	
	
	
	
	// Checkin page 
	private By change_facility_location_link=By.id("ctl00_lnkbtnChangeHospital");
	private By information_popup_ok=By.id("popup_ok");
	
	private By btnOK = By.id("ctl00_cphpage_btnOK");

	private By btnSaveDisplay = By.id("ctl00_cphpage_btnSaveDisplay");

	private By btncancel = By.id("popup_cancel");

	private By popupmessage = By.id("popup_message");

	private By ddlSpecialisation = By.id("ctl00_cphpage_ddlSpecialisation");
    private By popokbutton=By.id("popup_cancel");
    private By btnclear=By.id("ctl00_cphpage_btnClear");
    private By refferls  =By.id("ctl00_cphpage_lnkReferral");
    private By UhidSearchImg  =By.id("ctl00_cphpage_imgsearchuhid");
    private By UhidLiveListTextBox  =By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
    private By UhidLiveListSearchButton  =By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch");
    private By UhidLiveListRadioButton  =By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
    private By UhidLiveListSelect  =By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
    
    public WebElement getUhidSearchImg() {
    	return getElement(UhidSearchImg);
    }
    public WebElement getUhidLiveListTextBox() {
    	return getElement(UhidLiveListTextBox);
    }
    public WebElement getUhidLiveListSearchButton() {
    	return getElement(UhidLiveListSearchButton);
    }
    public WebElement getUhidLiveListRadioButton() {
    	return getElement(UhidLiveListRadioButton);
    }
    public WebElement getUhidLiveListSelect() {
    	return getElement(UhidLiveListSelect);
    }
	/**
	 * @return the ddlSpecialisation
	 */
    public WebElement getrefferlsLink() {
    	return getElement(refferls);
    }
    public WebElement getclearbuttonLink() {
    	return getElement(btnclear);
    }
    public WebElement getpopokbuttonLink() {
    	return getElement(popokbutton);
    }
	public WebElement gethisLiveListControlchkUHID2Link() {
		return getElement(hisLiveListControlchkUHID2);
	}
	public WebElement getDdlSpecialisation() {
		return getElement(ddlSpecialisation);
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

	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	public WebElement getchange_facility_location_linkLink() {
		return getElement(change_facility_location_link);
	}

	public String verifyPatientCheckInPageTitle() {

		return driver.getTitle();

	}
	public WebElement getinformation_popup_ok() {
		return getElement(information_popup_ok);
	}
	
	public void doPatientCheckIN(String IPNumber, String SpecialisationName) {

		try {

			getTxtIPNO().sendKeys("1111111111");
			getLnkbtnIPNo().click();
			 Thread.sleep(2000);
			getHisLiveListControlchkUHID().click();
			Thread.sleep(2000);
			getHisLiveListControlbtnSelect().click();
			Thread.sleep(3000);
			getBtnSaveDisplay().isEnabled();
			//utilobj.selectDropdown(getDdlSpecialisation(), driver, SpecialisationName);

			// driver.switchTo().defaultContent();

			// utilobj.JSClick(getBtnOK(), driver);
			Thread.sleep(2000);
			utilobj.ActionClick(getBtnOK(), driver);

			//getBtnSaveDisplay().isEnabled();
			Thread.sleep(2000);

			// getBtnOK().click();
			//utilobj.ActionClick(getBtnSaveDisplay(), driver);
			// utilobj.JSClick(getBtnSaveDisplay(), driver);

			 getBtnSaveDisplay().click();
			Thread.sleep(2000);
//			System.out.println(getPopupmessage().getText());
//			System.out.println(utilobj.GetCheckinNumberText(getPopupmessage(), driver));
//			 getBtncancel().click();
			

		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}

	public String getPatientCheckinNumber() throws InterruptedException {

		System.out.println(getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(getPopupmessage(), driver));

		String strCheckinNumber = utilobj.GetCheckinNumberText(getPopupmessage(), driver);

		//getBtncancel().click();
	    getpopokbuttonLink().click();
	    Thread.sleep(5000);
	    utilobj.SwitchToChildWindow(driver, "RegistrationPrintReports.aspx");
	    Thread.sleep(5000);
	    driver.close();
	    Thread.sleep(5000);
	    utilobj.SwitchToChildWindow(driver, "Patient_CheckIn");
	    Thread.sleep(10000);
	    getclearbuttonLink().click();
	    Thread.sleep(1000);
	    //driver.close();
	    //hisobj.donavigatetodoctorworklist();
	    
	   
//	    utilobj.changeLocationFacility(driver);
	   // homeobj.doNavigateToSelectHospitalLocation();
	    
	    
//	    String parent3=driver.getWindowHandle();
//	    driver.switchTo().window(parent3);
//	 System.out.println(driver.getTitle());
//	    utilobj.Window(driver);
//	    utilobj.ChildWindow(driver);
//	    String title=driver.getTitle();
//	    System.out.println(title);
//	    String subWindowHandler = null;
//	    Set<String> handles = driver.getWindowHandles();
//	    Iterator<String> iterator = handles.iterator();
//	    Thread.sleep(5000);
//	    subWindowHandler = iterator.next();
//	    driver.switchTo().window(subWindowHandler);
//	    System.out.println("hello");
//	    Thread.sleep(5000);
//	    System.out.println(driver.getTitle());
	    

		
		return strCheckinNumber;
	}
	public void GenrateCheckInNumber() {
		getTxtIPNO().sendKeys("1199900090");
		getLnkbtnIPNo().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		gethisLiveListControlchkUHID2Link().click();
		getHisLiveListControlbtnSelect().click();
	}
    public void changelocationfacility() throws InterruptedException {
    	Thread.sleep(2000);
    	getchange_facility_location_linkLink().click();
    	Thread.sleep(5000);  	
    	
    }
    
}
