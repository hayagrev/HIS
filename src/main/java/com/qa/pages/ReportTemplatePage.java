package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportTemplatePage extends BasePage {

	public ReportTemplatePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
private By iframe=By.id("ctl00_cphpage_txtEditor_ctl02_ctl00");
public WebElement getiframe() {
	return getElement(iframe);
}
private By TamplateNameTextBox=By.id("ctl00_cphpage_txtTemplateName");
public WebElement getTamplateNameTextBox() {
	return getElement(TamplateNameTextBox);
}
private By TamplateNameImaageSearch=By.id("ctl00_cphpage_imgTemplate");
public WebElement getTamplateNameImaageSearch() {
	return getElement(TamplateNameImaageSearch);
}

private By TamplateBody=By.xpath("/html/body");
public WebElement getTamplateBody() {
	return getElement(TamplateBody);
}
private By ProcedureImageSearch=By.id("ctl00_cphpage_imgProcedureSearch");
public WebElement getProcedureImageSearch() {
	return getElement(ProcedureImageSearch);
}                                      
private By ProcedureNameTextbox=By.id("ProcedureName");
//ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria
public WebElement getProcedureNameTextbox() {
	return getElement(ProcedureNameTextbox);
}
private By ProcedureSearchButton=By.id("btnSearch");
public WebElement getProcedureSearchButton() {
	return getElement(ProcedureSearchButton);
}
		//ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_chkTemp
private By ProcedureChekbox=By.name("chkbox[]");
public WebElement getProcedureChekbox() {
	return getElement(ProcedureChekbox);
}
private By TamplateRadioButton=By.xpath("//*[@id='ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp']");
public WebElement getTamplateRadioButton() {
	return getElement(TamplateRadioButton);
}

//ctl00_cphpage_ucCommonSearch_btnSelect
private By ProcedureSelectButton=By.id("btnSearchSelect");
public WebElement getProcedureSelectButton() {
	return getElement(ProcedureSelectButton);
}
private By ProcedureDropDownvalueSelect=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[4]/select/option");
public WebElement getProcedureDropDownSelect() {
	return getElement(ProcedureDropDownvalueSelect);
}
private By RemoveButton=By.id("ctl00_cphpage_btnRemove");
public WebElement getRemoveButton() {
	return getElement(RemoveButton);
}
private By SaveButton=By.id("ctl00_cphpage_btnSave");
public WebElement getSaveButton() {
	return getElement(SaveButton);
}
private By UpdateButton=By.id("ctl00_cphpage_btnUpdate");
public WebElement getUpdateButton() {
	return getElement(UpdateButton);
}
private By MessageButtonOK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
public WebElement getMessageButtonOK() {
	return getElement(MessageButtonOK);
}
private By ProcessImage=By.id("/html/body/div[2]/div[1]/img");
public WebElement getProcessImage() {
	return getElement(ProcessImage);
}


}
