package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogInPage {

	@FindBy(name="txtUsername")
	WebElement userName;
	

	@FindBy(name="txtPassword")
	WebElement password;

	@FindBy(name="Submit")
	WebElement logIn;
	
	public void logIn()
	{
		userName.sendKeys("admin");
		password.sendKeys("password");
		logIn.click();
	}
	
	public OrangeHRMLogInPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}
