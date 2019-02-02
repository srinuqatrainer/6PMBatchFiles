package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours__Register_Click {

	public static void main(String[] args)
	{
		String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
				
		//a - Anchor tag -- link -- type of Element
		// href -- attribue
		
		// locator -- linkText
		// Selector -- REGISTER (name of the link)
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
