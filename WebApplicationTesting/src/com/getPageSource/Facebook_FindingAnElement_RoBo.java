package com.getPageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_FindingAnElement_RoBo {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		String url="http://facebook.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String pageSource=driver.getPageSource();
		
		if(pageSource.contains("RoBo"))
		{
			System.out.println("Element existing");
		}
		else
		{
			System.out.println("Element not found");
		}
driver.close();
	}

}
