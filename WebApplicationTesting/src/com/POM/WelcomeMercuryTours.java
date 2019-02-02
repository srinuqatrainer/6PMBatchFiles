package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{

	// Object Repository
	// <a href="mercurysignon.php">SIGN-ON</a>
	
	/*WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	signOn.click(); */
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn()
	{
		signOn.click();
	}
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}		
	@FindBy(name="userName")
	WebElement userName;

	@FindBy(name="password")
	WebElement password;

	@FindBy(name="login")
	WebElement signIn;
	
	public void logIn(String uName,String pwd)
	{
		userName.sendKeys(uName);
		password.sendKeys(pwd);
		signIn.click();
	}
}
