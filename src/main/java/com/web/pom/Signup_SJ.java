package com.web.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.SpiceJet_Base;

public class Signup_SJ extends SpiceJet_Base {

	@FindBy(xpath = "//div[contains(text(),'Signup')]")
	private WebElement signUp;

	public WebElement signup() {
		return signUp;
	}

	@FindBy(xpath = "//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
	private WebElement title;

	public WebElement title() {
		return title;
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement fName;

	public WebElement fName() {
		return fName;
	}

	@FindBy(id = "last_name")
	private WebElement lName;

	public WebElement lName() {
		return lName;
	}

	@FindBy(xpath = "//select[@class='form-control form-select']")
	private WebElement country;

	public WebElement country() {
		return country;
	}
	
	@FindBy(id = "dobDate")
	private WebElement dob;
	
	public WebElement dob() {
		return dob;
	}
	
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	private WebElement monthselector;
	
	public WebElement monthselector() {
		return monthselector;
	}
	
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	private WebElement yearselector;
	
	public WebElement yearselector() {
		return yearselector;
	}

	@FindBy(xpath = "//div[text()='19']")
	private WebElement dateselector;
	
	public WebElement dateselector() {
		return dateselector;
	}

	
	@FindBy(xpath = "//input[@placeholder='+91 01234 56789']")
	private WebElement mobInput;
	
	public WebElement mobInput() {
		return mobInput;
	}
	
	@FindBy(xpath = "//input[@id='email_id']")
	private WebElement mailInput;
	
	public WebElement mailInput() {
		return mailInput;
	}

	@FindBy(id = "new-password")
	private WebElement passInput;
	
	public WebElement passInput() {
		return passInput;
	}
	
	@FindBy(id = "c-password")
	private WebElement cpassInput;
	
	public WebElement cpassInput() {
		return cpassInput;
	}
	
	@FindBy(css = "#defaultCheck1")
	private WebElement checkBox;
	
	public WebElement checkBox() {
		return checkBox;
	}
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement signUpBtn;
	
	public WebElement signUpBtn() {
		return signUpBtn;
	}

	public Signup_SJ() {
		PageFactory.initElements(driver, this);
	}

}
