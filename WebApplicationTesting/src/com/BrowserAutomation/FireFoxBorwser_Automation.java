package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FireFoxBorwser_Automation {

	public static void main(String[] args)
	{
		// firefox Browser till 44.0 vesion
		//FirefoxDriver hi = new FirefoxDriver();
		
		// firefox Browser automation above 50 to the latest version
		// download the gecko driver file from "http://seleniumhq.org" 
		// use Selenium server standalone jar file above 3 version
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\driverFiles\\geckodriver.exe");
	//	FirefoxDriver hello = new FirefoxDriver();
		
		// Chrome Browser automation
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
		ChromeDriver chello = new ChromeDriver(); 
		
		// Edge Browser
		///System.setProperty("webdriver.edge.driver", "C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\driverFiles\\MicrosoftWebDriver.exe");
		//EdgeDriver dr = new EdgeDriver();
		//dr.get("http://gmail.com");
		
		// Internet Explorer Browser
	//	System.setProperty("webdriver.ie.driver", "C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\driverFiles\\IEDriverServer.exe.exe");
		//InternetExplorerDriver d = new InternetExplorerDriver();
		
		
	}

}
