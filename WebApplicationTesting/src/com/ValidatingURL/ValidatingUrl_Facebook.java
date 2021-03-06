package com.ValidatingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingUrl_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String expected_Url="facebook.com";
		System.out.println("The Client expected URL is :"+expected_Url);
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println("The actual Url on the Browser is :"+ actual_Url);
		
		
		if (actual_Url.contains(expected_Url))
		{
			System.out.println("URL matched - Succeessfully launched Facebook HomePage - PASS");
		}
		else
		{
			System.out.println("URL not matched - FAIL");
		}
		
		driver.close();


	}

}
