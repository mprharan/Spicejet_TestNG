package com.web.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.SpiceJet_Base;

public class Details extends SpiceJet_Base {

	public Details() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41'][normalize-space()='I prefer not to receive future communication and newsletter from SpiceJet over text, WhatsApp or e-mail.']")
	private WebElement mailCheckBox;
	
	public WebElement mailCheckBox() {
		return mailCheckBox;
	}
	
	@FindBy(xpath = "//div[contains(text(),'I am flying as the primary passenger')]")
	private WebElement primaryCheckBox;
	
	public WebElement primaryCheckBox() {
		return primaryCheckBox;
	}
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-lfiufh r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj']//input[@type='text']")
	private WebElement fNameDetail;
	
	public WebElement fNameDetail() {
		return fNameDetail;
	}
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-mvpalk r-5360zw']//input[@type='text']")
	private WebElement LNameDetail;
	
	public WebElement LNameDetail() {
		return LNameDetail;
	}
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-adyw6z r-1kfrs79']")
	private WebElement continueDetail;
	
	public WebElement continueDetail() {
		return continueDetail;
	}
}
