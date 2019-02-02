package com.Xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_LogInTest {

	public static void main(String[] args) 
	{
		String url="http://facebook.com";
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		
		// <input type="email" data-testid="royal_email">
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Srini");
		
		// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		/// Relative xpath with Multiple properties(considering locator of WebDriver)
driver.findElement(By.xpath("//*[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("Hello");
		
		

	}

}
