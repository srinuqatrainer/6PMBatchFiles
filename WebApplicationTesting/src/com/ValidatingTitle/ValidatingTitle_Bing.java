package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Bing {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
		ChromeDriver driv = new ChromeDriver();
		
		String expected_Title="Bing";
		System.out.println("The expected Title of Bing Home Page is :"+expected_Title);
		
		String actual_title=driver.getTitle();
		
		System.out.println("The actual Title of Bing Home Page is: "+actual_title);
		
		if(actual_title.equals(expected_Title))
		{
			System.out.println("Title matched - Bing Home Page Successfully Opened - PASS");
		}
		else
		{
			System.out.println("Title not matched - FAIL");
		}
		
		driver.close();

	}

}
