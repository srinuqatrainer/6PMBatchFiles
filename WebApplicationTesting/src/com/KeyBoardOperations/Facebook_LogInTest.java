package com.KeyBoardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		driver = new FirefoxDriver();
		
		String url="http://facebook.com";
		
		driver.get(url);
		
		// <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		
		driver.findElement(By.id("email")).sendKeys("Srini");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("hello").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		

	}

}
