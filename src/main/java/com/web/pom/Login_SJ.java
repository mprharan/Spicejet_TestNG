package com.web.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.SpiceJet_Base;

public class Login_SJ extends SpiceJet_Base{
	
	public Login_SJ() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	private WebElement login;
	
	public WebElement login() {
		return login;
	}

	@FindBy(xpath = "//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-1p0dtai r-18u37iz r-1d2f490 r-u8s1d r-zchlnj r-ipm5af']/div[@class='css-1dbjc4n r-14lw9ot r-1p0dtai r-1pcd2l5 r-wk8lta r-u8s1d r-zchlnj r-ipm5af']/div[@class='css-1dbjc4n r-156q2ks']/div[@class='css-1dbjc4n r-wk8lta r-1xcajam']/div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-18u37iz']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj r-p1pxzi']/div[2]/div[1]")
	private WebElement emailCheckBox;
	
	public WebElement emailCheckBox() {
		return emailCheckBox;
	}
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement loginMailInput;
	
	public WebElement loginMailInput() {
		return loginMailInput;
	}
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement loginPassInput;
	
	public WebElement loginPassInput() {
		return loginPassInput;
	}
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	private WebElement loginButton;
	
	public WebElement loginButton() {
		return loginButton;
	}

}
