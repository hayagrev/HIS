package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.util.util;

public class MaternityCertificatepages extends BasePage {
	util utilobj=new util();
	public MaternityCertificatepages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By Maternitycertification_IPno=By.id("ctl00_cphpage_imgbtnInsuranceno");
	public WebElement getMaternitycertification_IPnoLink() {
		return getElement(Maternitycertification_IPno);
	}
		private By Maternitycertification_IPno_searchtextbox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
		public WebElement getMaternitycertification_IPno_searchtextboxLink() {
			return getElement(Maternitycertification_IPno_searchtextbox);
		}
		private By Maternitycertification_IPno_searchbutton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
		public WebElement getMaternitycertification_IPno_searchbuttonlink() {
			return  getElement(Maternitycertification_IPno_searchbutton);
		}
		private By Maternitycertification_IPno_selectRadioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
		public WebElement getMaternitycertification_IPno_selectRadioButtonLink() {
			return getElement(Maternitycertification_IPno_selectRadioButton);
			
		}
		private By Maternitycertification_IPno_selectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
		public WebElement getMaternitycertification_IPno_selectButtonLink() {
			return getElement(Maternitycertification_IPno_selectButton);
			
		} 
		private By Maternitycertification_IPno_DDL=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria");
		public WebElement getMaternitycertification_IPno_DDLLink() {//ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria
			return getElement(Maternitycertification_IPno_DDL);
			
		}
		private By Maternitycertification_Layout_Durationofpragnancytxtbox=By.id("ctl00_cphpage_txtDurationOfPregnancy");
		public WebElement getMaternitycertification_Layout_DurationofpragnancytxtboxLink() {
			return getElement(Maternitycertification_Layout_Durationofpragnancytxtbox);
		}                                                                         
		private By Maternitycertification_Layout_ExpectedDateOfConfinement=By.id("ctl00_cphpage_txtExpectedDateOfConfinement");
		public WebElement getMaternitycertification_Layout_ExpectedDateOfConfinementLink() {
			return getElement(Maternitycertification_Layout_ExpectedDateOfConfinement);
		}
		private By Maternitycertification_Layout_DateOfConfinement=By.id("ctl00_cphpage_txtdateofConfinement");
		public WebElement getMaternitycertification_Layout_DateOfConfinement() {
			return getElement(Maternitycertification_Layout_DateOfConfinement);
		}
		
		private By Maternitycertification_Layout_ExpectedDateOfConfinement_date=By.id("ctl00_cphpage_CalendarExtender12_day_1_2");
		public WebElement getMaternitycertification_Layout_ExpectedDateOfConfinement_dateLink() {
			return getElement(Maternitycertification_Layout_ExpectedDateOfConfinement_date);
		}
		private By Maternitycertification_Layout_certificateOfMiscarriageRadioButton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_2");
		public WebElement getMaternitycertification_Layout_certificateOfMiscarriageLink() {
			return getElement(Maternitycertification_Layout_certificateOfMiscarriageRadioButton);
		}
		private By Maternitycertification_Layout_Dateofmiscariege=By.id("ctl00_cphpage_txtdateofMiscariage");
		public WebElement getMaternitycertification_Layout_DateofmiscariegeLink() {
			return getElement(Maternitycertification_Layout_Dateofmiscariege);
		}
		private By Maternitycertification_Layout_Dateofmiscariege_date=By.id("ctl00_cphpage_CalendarExtender11_day_1_2");
		public WebElement getMaternitycertification_Layout_Dateofmiscariege_dateLink() {
			return getElement(Maternitycertification_Layout_Dateofmiscariege_date);
		}
		private By Maternitycertification_Layout_Placeofmiscariege=By.id("ctl00_cphpage_txtPlaceofMiscariage");
		public WebElement getMaternitycertification_Layout_PlaceofmiscariegeLink() {
			return getElement(Maternitycertification_Layout_Placeofmiscariege);
		}
		private By Maternitycertification_layout_certificateOfpregnancyradiobutton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_3");
		public WebElement getMaternitycertification_layout_certificateOfpregnancyradiobuttonLink() {
			return getElement(Maternitycertification_layout_certificateOfpregnancyradiobutton);
		}
		private By Maternitycertification_layout_certificateOfpregnancy_Remarx=By.id("ctl00_cphpage_txtMaternityRemrks");
		public WebElement getMaternitycertification_layout_certificateOfpregnancy_RemarxLink() {
			return getElement(Maternitycertification_layout_certificateOfpregnancy_Remarx);
		}
		private By Maternitycertification_layout_previousCertification_hidebutton=By.id("ctl00_cphpage_Image5");
		public WebElement getMaternitycertification_layout_previousCertification_hidebuttonLink() {
			return getElement(Maternitycertification_layout_previousCertification_hidebutton);
		}                                                                                     //ctl00_cphpage_MyMessageBoxInfo_ButtonOK 
		private By Maternitycertification_layout_previousCertification_WarningmsgboxOk=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
		public WebElement getMaternitycertification_layout_previousCertification_WarningmsgboxOkLink() {
			return getElement(Maternitycertification_layout_previousCertification_WarningmsgboxOk);
		}
		private By Maternitycertification_layout_certificateofconfinementform18RadioButton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_1");
		public WebElement getMaternitycertification_layout_certificateofconfinementform18RadioButton() {
			return getElement(Maternitycertification_layout_certificateofconfinementform18RadioButton);
		}
		private By Maternitycertification_layout_outcomeofpregnancyDDL=By.id("ctl00_cphpage_ddlOutcomeofPregnancy");
		public WebElement getMaternitycertification_layout_outcomeofpregnancyDDL() {
			return getElement(Maternitycertification_layout_outcomeofpregnancyDDL);
		}
		private By Maternitycertification_layout_Placeofconfinementtxtbox=By.id("ctl00_cphpage_txtPlaceofConfinement");
		public WebElement getMaternitycertification_layout_Placeofconfinementtxtbox() {
			return getElement(Maternitycertification_layout_Placeofconfinementtxtbox);
		}
		private By Maternitycertification_layout_Remarks=By.id("ctl00_cphpage_txtMaternityRemrks");
		public WebElement getMaternitycertification_layout_Remarks() {
			return getElement(Maternitycertification_layout_Remarks);
		}
		private By Maternitycertification_printButton=By.id("ctl00_cphpage_btnPrint");
		public WebElement getMaternitycertification_printButton() {
			return getElement(Maternitycertification_printButton);
		}
		private By Maternitycertification_SaveButton=By.id("ctl00_cphpage_btnSave");
		public WebElement getMaternitycertification_SaveButton() {
			return getElement(Maternitycertification_SaveButton);
		}
		private By Maternitycertification_layout_IWintend=By.id("ctl00_cphpage_txtLeavefromConfinement");
		public WebElement getMaternitycertification_layout_IWintend() {
			return getElement(Maternitycertification_layout_IWintend);
		}
		private By Maternitycertification_SaveButtonSuccesOK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
		public WebElement getMaternitycertification_SaveButtonSuccesOK() {
			return getElement(Maternitycertification_SaveButtonSuccesOK);
		}
		private By Maternitycertification_ClearButton=By.id("ctl00_cphpage_btnClear");
		public WebElement getMaternitycertification_ClearButton() {
			return getElement(Maternitycertification_ClearButton);
		}
		private By BlackOverlay=By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div/div/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[1]");
		public WebElement getBlackOverlay() {
			return getElement(BlackOverlay);
		}
		
		
		
		
		
			
				
		
		

			

}
