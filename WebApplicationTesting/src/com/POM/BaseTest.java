package com.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
		String browserName="chrome";
		
		if(browserName.equals("FF"))
		{
		
		driver = new FirefoxDriver();
		}
		else
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				driver = new ChromeDriver();
			}
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
