package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MaLetterPage extends BasePage {

	public MaLetterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}  
	

	private By SelectDropDown = By.xpath("//select[contains(@id,'ctl00_cphpage_Page')]/option[2]");

	public List<WebElement> SelectDropDown() {
		return getElements(SelectDropDown);
	}
	
	private By Box = By.xpath("//span//child::input[contains(@id,'ctl00_cphpage_Page')]");

	public List<WebElement> SelectCheckbox() {
		return getElements(Box);
	}

	
	private By EnterNumericalValueText = By.xpath("//input[@placeholder='Numeric Value' and not(@disabled)]");

	public List<WebElement> EnterNumericalValueText() {
		return getElements(EnterNumericalValueText);
	}

	private By EnterNumericText = By.xpath("//input[@placeholder='Numeric' and not(@disabled)]");

	public List<WebElement> EnterNumericText() {
		return getElements(EnterNumericText);
	}

	private By EnterFloatValueText = By.xpath("//input[@placeholder='Float Value' and not(@disabled)]");

	public List<WebElement> EnterFloatValueText() {
		return getElements(EnterFloatValueText);
	}
	
	private By EnterFloatText = By.xpath("//input[@placeholder='Float' and not(@disabled)]");

	public List<WebElement> EnterFloatText() {
		return getElements(EnterFloatText);
	}

	private By EnterAlphaText = By.xpath("//input[@placeholder='Alphanumeric' and not(@disabled)]");

	public List<WebElement> EnterAlphaText() {
		return getElements(EnterAlphaText);
	}

	private By save = By.xpath("//input[@id='ctl00_cphpage_btnNext']");

	public WebElement Next() {
		return getElement(save);

	}

	private By EnterText = By.xpath("//input[@placeholder='' and not(@disabled)]");

	public List<WebElement> EnterText() {
		return getElements(EnterText);

	}
}