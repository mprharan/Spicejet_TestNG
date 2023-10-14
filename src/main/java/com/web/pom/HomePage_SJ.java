package com.web.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.SpiceJet_Base;

public class HomePage_SJ extends SpiceJet_Base {

	public HomePage_SJ() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[contains(text(),'one way')]")
	private WebElement onewayCheck;

	public WebElement onewayCheck() {
		return onewayCheck;
	}

	@FindBy(xpath = "//div[@data-testid='to-testID-origin']//input[@type='text']")
	private WebElement origin;

	public WebElement origin() {
		return origin;
	}

	@FindBy(xpath = "//div[@data-testid='to-testID-destination']//input[@type='text']")
	private WebElement destination;

	public WebElement destination() {
		return destination;
	}

	@FindBy(xpath = "//div[normalize-space()='Departure Date']")
	private WebElement depBox;

	public WebElement depBox() {
		return depBox;
	}

	@FindBy(xpath = "//div[@data-testid='undefined-month-October-2023']//child::div[@class='css-1dbjc4n']//child::div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55']//child::div[text()='25']")
	private WebElement depDate;

	public WebElement depDate() {
		return depDate;
	}

	@FindBy(xpath = "//div[contains(text(),'Students')]")
	private WebElement checkbox;

	public WebElement checkbox() {
		return checkbox;
	}
	
	@FindBy(xpath = "//div[text()='Search Flight']")
	private WebElement searchFlight;

	public WebElement searchFlight() {
		return searchFlight;
	}
	
	@FindBy(xpath = "//div[@data-testid='home-page-travellers']")
	private WebElement passengers;
	
	public WebElement passengers() {
		return passengers;
	}
	
	@FindBy(xpath = "//div[@data-testid='Adult-testID-plus-one-cta']//*[@viewBox='0 0 11 11']")
	private WebElement plus;
	
	public WebElement plus() {
		return plus;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Done')]")
	private WebElement passengersDone;
	
	public WebElement passengersDone() {
		return passengersDone;
	}

}