package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_LogInTest {

	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
	// <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		driver.findElement(By.name("email")).sendKeys("Srini5454%^$%#");
		
	// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		driver.findElement(By.id("pass")).sendKeys("hello");
		
	// <label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_2"><input value="Log In" aria-label="Log In" 
	//	data-testid="royal_login_button" type="submit" id="u_0_2"></label>
		
		WebElement logIn=driver.findElement(By.id("loginbutton"));
		//System.out.println(logIn);
		logIn.click();

	}

}
