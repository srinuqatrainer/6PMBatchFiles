package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_Click {

	public static void main(String[] args) 
	{
		String url="http://google.com";
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a class="gb_Pe gb_Ba gb_Mb" id="gb_70" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		//continue=https://www.google.com/" target="_top">Sign in</a>
		
		//driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
