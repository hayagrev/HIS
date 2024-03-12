package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class FUPPage extends BasePage {
	
	
	util utilobj = new util();

	public FUPPage(WebDriver driver) {
		super(driver);
	}
	String parent3=null;
	/*Investigations*/	

   private By DeleteCBC=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[1]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[1]/a[2]");

   private By Investigations=By.id("ctl00_cphpage_tabSearch_tabPnlSearchResults_imgbtnInvestigationsSearch");
  
   private By TestNameTxtBx=By.id("txtName");
   
   private By SearchBtnInvestigation=By.id("btnSearch");
   
   private By WindowCheckBox=By.id("ChkSelect4");
   
   private By SelectBtnInvestigation=By.id("btnSelect");
   
   private By TestName=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");

	private By SearchBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	
	private By ChkBox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl06_rdbTemp");

	private By SelectBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	
	private By Quantity=By.xpath("//input[@id='ctl00_cphpage_tabSearch_tabPnlSearchResults_txtQty']");
	
	private By TickMark=By.id("ctl00_cphpage_tabSearch_tabPnlSearchResults_imgBtnAckInvestigations");
	
    private By UpdateBtn=By.xpath("//*[@id='ctl00_cphpage_btnSave']");
	    
	private By popup=By.id("popup_ok");
	private By Edit=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[1]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[1]/a[1]");
	
/*Medications*/
	private By Medications=By.id("__tab_ctl00_cphpage_tabSearch_tabPnlSelectedRecords");
	
	private By DrugSearchBtn=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_imgbtnDrugSearch");
	
	private By WindowDrugChkBx=By.id("ChkSelect95");
	
	private By DrugName=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	
	private By DrugNameSearchBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	
	private By DrugNameChkBx=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	
	private By DrugSelectBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	
	private By DoseQty=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_txtDose");
	
	private By DoseType=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_ddlDose");
	
	private By Frequency=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_ddlFrequency");
	
	private By Duration=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_txtDuration");
	
	private By Admin_Route=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_ddlAdminRoute");
	
	private By Total_Strength=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_txtQuantity");
	
	private By Total_Strength_drpdwn=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_ddlQuantityUOM");
	
	private By Remarks=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_txtMedicationsRemarks");
	
	private By Medication_Tick=By.id("ctl00_cphpage_tabSearch_tabPnlSelectedRecords_imgbtnAckMedications");
	
	private By DeleteMedication=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[2]/table/tbody/tr[7]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[1]/a[2]");
	private By DeleteInvesigation=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[1]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[1]/a[2]");
/*HealthInterventions*/
	private By HealthIntervensions=By.id("__tab_ctl00_cphpage_tabSearch_tabpnlProc");
	
	private By WindowHealthInterventions=By.id("ChkSelect4");
	
	private By Procedures=By.id("ctl00_cphpage_tabSearch_tabpnlProc_imgbtnProceduresSearch");
	
	private By HealthInterventionsTestName=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl06_rdbTemp");
	
	private By HealthTnterventionsQty=By.id("ctl00_cphpage_tabSearch_tabpnlProc_txtProceduresQuantity");
	
	private By HealthInterventions_Tick=By.id("ctl00_cphpage_tabSearch_tabpnlProc_imgbtnAckProcedures");
	
	private By HealthInterventions_Delete=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[3]/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[1]/a[2]");
	
/*Diagnosis*/	
	private By Diagnosis=By.id("__tab_ctl00_cphpage_tabSearch_tabPnlDiagnosis");
	
	private By Diagnosis_Search=By.id("ctl00_cphpage_tabSearch_tabPnlDiagnosis_txtDiagnosis");
	
	private By Diagnosis_Tick=By.id("ctl00_cphpage_tabSearch_tabPnlDiagnosis_imgSNOWMEDAdd");
	
	private By Covid=By.id("840539006$COVID-19");
	
	private By Covid_Delete=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[4]/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[1]/a");
	
/*Investigations*/	
	public WebElement getDeleteCBC() {
		return getElement(DeleteCBC);
	}
	
	public WebElement getUpdateBtn() {
		return getElement(UpdateBtn);
	}
	
	public WebElement getpopup() {
		return getElement(popup);
	}
	
	public WebElement getInvestigations() {
		return getElement(Investigations);
	}
	
	public WebElement getTestNameTxtBx() {
		return getElement(TestNameTxtBx);
	}
	
	public WebElement getSearchBtnInvestigation() {
		return getElement(SearchBtnInvestigation);
	}
	
	public WebElement getWindowCheckBox() {
		return getElement(WindowCheckBox);
	}
	
	public WebElement getSelectBtnInvestigation() {
		return getElement(SelectBtnInvestigation);
	}
	
	public WebElement getTestName() {
		return getElement(TestName);
	}
	
	public WebElement getSearchBtn() {
		return getElement(SearchBtn);
	}
	
	public WebElement getChkBox() {
		return getElement(ChkBox);
	}
	
	public WebElement getSelectBtn() {
		return getElement(SelectBtn);
	}
	
	public WebElement getQuantity() {
		return getElement(Quantity);
	}
	
	public WebElement getTickMark() {
		return getElement(TickMark);
	}
	public WebElement getEdit() {
		return getElement(Edit);
	}
	
/*Medications*/	
	 public WebElement getMedications() {
		return getElement(Medications);
	}
	
	public WebElement getDrugSearchBtn() {
		return getElement(DrugSearchBtn);
	}
	
	public WebElement getWindowDrugChkBx() {
		return getElement(WindowDrugChkBx);
	}
	
	public WebElement getDrugName() {
		return getElement(DrugName);
	}

	public WebElement getDrugNameSearchBtn() {
		return getElement(DrugNameSearchBtn);
	}
	
	public WebElement getDrugNameChkBx() {
		return getElement(DrugNameChkBx);
	}
	
	public WebElement getDrugSelectBtn() {
		return getElement(DrugSelectBtn);
	}
	
	public WebElement getDoseQty() {
		return getElement(DoseQty);
	}
    
	public WebElement getDoseType() {
		return getElement(DoseType);
	}
  
	public WebElement getFrequency() {
		return getElement(Frequency);
	}
	
	public WebElement getDuration() {
		return getElement(Duration);
	}

	public WebElement getAdmin_Route() {
		return getElement(Admin_Route);
	}
	
	public WebElement getTotal_Strength() {
		return getElement(Total_Strength);
	}

	public WebElement getTotal_Strength_drpdwn() {
		return getElement(Total_Strength_drpdwn);
	}

	public WebElement getRemarks() {
		return getElement(Remarks);
	}
	
	public WebElement getMedication_Tick() {
		return getElement(Medication_Tick);
	}

	public WebElement getDeleteMedication() {
		return getElement(DeleteMedication);
	}

/*HealthInterventions*/
	public WebElement getDeleteInvesigation() {
		return getElement(DeleteInvesigation);
	}
	
	public WebElement getHealthIntervensions() {
		return getElement(HealthIntervensions);
	}
	
	public WebElement getWindowHealthInterventions() {
		return getElement(WindowHealthInterventions);
	}
	
	public WebElement getProcedures() {
		return getElement(Procedures);
	}
	
	public WebElement getHealthInterventionsTestName() {
		return getElement(HealthInterventionsTestName);
	}
	
	public WebElement getHealthTnterventionsQty() {
		return getElement(HealthTnterventionsQty);
	}

	public WebElement getHealthInterventions_Tick() {
		return getElement(HealthInterventions_Tick);
	}
	
	public WebElement getHealthInterventions_Delete() {
		return getElement(HealthInterventions_Delete);
	}
	
/*Diagnosis*/
	public WebElement getDiagnosis() {
		return getElement(Diagnosis);
	}
	
	public WebElement getDiagnosis_Search() {
		return getElement(Diagnosis_Search);
	}
	
	public WebElement getCovid() {
		return getElement(Covid);
	}
	
	public WebElement getDiagnosis_Tick() {
		return getElement(Diagnosis_Tick);
	}

	public WebElement getCovid_Delete() {
		return getElement(Covid_Delete);
	}

   
	public void doInvestigation(String TestName,String Quantity,String DrugName,String DoseType,String Frequency,String Admin_Route,String TestName1,String Diagnosis_Search) throws InterruptedException {

		
/*Investigations Starts*/
			
			Thread.sleep(4000);			
            getDeleteInvesigation().click();
			Thread.sleep(3000);
			getUpdateBtn().click();
			Thread.sleep(3000);
			getpopup().click();

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getInvestigations().click();
			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			//driver.close();
			Thread.sleep(1000);
			 driver.switchTo().window(parent3);
			 
			Thread.sleep(2000);
			
		   getTestName().sendKeys(TestName);
		   Thread.sleep(2000);
		   WebDriverWait wait=new WebDriverWait(driver,java.time.Duration.ofMinutes(2));
			 getSearchBtn().click();
			 wait.until(ExpectedConditions.visibilityOf(getChkBox()));
			 getChkBox().click();
			 getSelectBtn().click();
			 Thread.sleep(3000);
			 getQuantity().sendKeys("1");
			 Thread.sleep(2000);
			getTickMark().click();
			Thread.sleep(2000);
			getUpdateBtn().click();
			Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOf(getpopup()));
		getpopup().click();
			//medication Start
		Thread.sleep(4000);
		utilobj.JSClick(getMedications(), driver);
		//getMedications().click();
		Thread.sleep(2000);
		
		getDeleteMedication().click();
		Thread.sleep(3000);
		getUpdateBtn().click();
		Thread.sleep(3000);
		getpopup().click();
		
		
		String parent4 = driver.getWindowHandle();

		utilobj.Window(driver);

		getDrugSearchBtn().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);


		//driver.close();
		 driver.switchTo().window(parent4);
		
		Thread.sleep(4000);
		
		
		getDrugName().sendKeys("abaca");
		Thread.sleep(2000);
		getDrugNameSearchBtn().click();
		Thread.sleep(2000);
		getDrugNameChkBx().click();
		Thread.sleep(2000);
		getDrugSelectBtn().click();
		Thread.sleep(2000);
		getDoseQty().clear();
		Thread.sleep(2000);
		getDoseQty().sendKeys("1");
		Thread.sleep(2000);
		getDoseType().sendKeys(DoseType);
		Thread.sleep(2000);
		getFrequency().sendKeys(Frequency);
		Thread.sleep(2000);
	    getDuration().sendKeys("3");
		 Thread.sleep(2000);
		 getAdmin_Route().sendKeys(Admin_Route);
		 Thread.sleep(2000);
		 getTotal_Strength().sendKeys("3");
		 Thread.sleep(2000);
		 getTotal_Strength_drpdwn().sendKeys(DoseType);
		 Thread.sleep(2000);
		 getRemarks().sendKeys("Test");
		 Thread.sleep(2000);
		 getMedication_Tick().click();
		 Thread.sleep(2000);
		 getUpdateBtn().click();
		Thread.sleep(2000);
		getpopup().click();
		Thread.sleep(2000);
	}
/*Investigations End*/
		//	utilobj.ActionClick(getMedications(), driver);
			
/*Medications Starts*/
			public void DoMedication(String TestName,String Quantity,String DrugName,String DoseType,String Frequency,String Admin_Route,String TestName1,String Diagnosis_Search) throws InterruptedException {
				
			
			Thread.sleep(4000);
			utilobj.JSClick(getMedications(), driver);
			//getMedications().click();
			Thread.sleep(2000);
			
			getDeleteMedication().click();
			Thread.sleep(3000);
			getUpdateBtn().click();
			Thread.sleep(3000);
			getpopup().click();
			
			
			String parent4 = driver.getWindowHandle();

			utilobj.Window(driver);

			getDrugSearchBtn().click();
			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);


			//driver.close();
			 driver.switchTo().window(parent4);
			
			Thread.sleep(4000);
			
			
			getDrugName().sendKeys("abaca");
			Thread.sleep(2000);
			getDrugNameSearchBtn().click();
			Thread.sleep(2000);
			getDrugNameChkBx().click();
			Thread.sleep(2000);
			getDrugSelectBtn().click();
			Thread.sleep(2000);
			getDoseQty().clear();
			Thread.sleep(2000);
			getDoseQty().sendKeys("1");
			Thread.sleep(2000);
			getDoseType().sendKeys(DoseType);
			Thread.sleep(2000);
			getFrequency().sendKeys(Frequency);
			Thread.sleep(2000);
		    getDuration().sendKeys("3");
			 Thread.sleep(2000);
			 getAdmin_Route().sendKeys(Admin_Route);
			 Thread.sleep(2000);
			 getTotal_Strength().sendKeys("3");
			 Thread.sleep(2000);
			 getTotal_Strength_drpdwn().sendKeys(DoseType);
			 Thread.sleep(2000);
			 getRemarks().sendKeys("Test");
			 Thread.sleep(2000);
			 getMedication_Tick().click();
			 Thread.sleep(2000);
			 getUpdateBtn().click();
			Thread.sleep(2000);
			getpopup().click();
			Thread.sleep(2000);
			}
/*Medications End*/
	
			
/*Health Interventions Start*/	
			public void DoHealthIntervention(String TestName,String Quantity,String DrugName,String DoseType,String Frequency,String Admin_Route,String TestName1,String Diagnosis_Search) throws InterruptedException {
			Thread.sleep(2000);
			utilobj.JSClick(getHealthIntervensions(), driver);
			Thread.sleep(2000);
			String parent5 = driver.getWindowHandle();

			utilobj.Window(driver);

			getProcedures().click();

			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
            // driver.close();
			 driver.switchTo().window(parent5);
			Thread.sleep(2000);
			//getProcedures().click();
			getTestName().sendKeys(TestName1);
			 getSearchBtn().click();
			 getHealthInterventionsTestName().click();
			 getSelectBtn().click();
			 Thread.sleep(2000);
			 getHealthTnterventionsQty().sendKeys("1");
			 Thread.sleep(2000);
			 getHealthInterventions_Tick().click();
			 Thread.sleep(2000);
			 getUpdateBtn().click();
			Thread.sleep(2000);
			getpopup().click();
			Thread.sleep(2000);
			getHealthIntervensions().click();
			//getHealthInterventions_Delete().click();
//			Thread.sleep(3000);
//			getUpdateBtn().click();
//			Thread.sleep(3000);
//			getpopup().click();
			}
/*Health Interventions End*/	
			public void DoDiagnosis(String TestName,String Quantity,String DrugName,String DoseType,String Frequency,String Admin_Route,String TestName1,String Diagnosis_Search) throws InterruptedException {
/*Diagnosis Starts*/	
			getDiagnosis().click();
//			getCovid_Delete().click();
//			Thread.sleep(3000);
//			 getUpdateBtn().click();
//			Thread.sleep(3000);
//			getpopup().click();
			Thread.sleep(2000);
			getDiagnosis_Search().sendKeys(Diagnosis_Search);
			Thread.sleep(2000);
			getCovid().click();
			Thread.sleep(2000);
			getDiagnosis_Tick().click();
			 Thread.sleep(2000);
			 getUpdateBtn().click();
			Thread.sleep(2000);
			getpopup().click();
/*Diagnosis Ends*/				
			

		

	}

	
}
