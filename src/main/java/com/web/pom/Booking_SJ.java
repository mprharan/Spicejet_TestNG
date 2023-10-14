package com.web.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.SpiceJet_Base;

public class Booking_SJ extends SpiceJet_Base {

	public Booking_SJ() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-1i10wst r-1kfrs79']")
	private WebElement continueBtn;

	public WebElement continueBtn() {
		return continueBtn;
	}

}
