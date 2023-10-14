package com.web.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.SpiceJet_Base;

public class FinalPage extends SpiceJet_Base {
	
	public FinalPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]")
	private WebElement FinalContinue;
	
	public WebElement FinalContinue() {
		return FinalContinue;
	}
	

}
