package com.GetAttratibute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_GetURL {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		String referanceUrl=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println("The referance URl of Registe Element is :"+referanceUrl);
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		String actualUrl=driver.getCurrentUrl();
		System.out.println("The register element navigated Web URl is :"+actualUrl);
		
		if(actualUrl.equals(referanceUrl))
		{
			System.out.println("Successfully navigated to Register Web Page - PASS");
		}
		else
		{
			System.out.println("Failed to reach Register web page - FAIL");
		}
		
		
		driver.quit();
	}

}
