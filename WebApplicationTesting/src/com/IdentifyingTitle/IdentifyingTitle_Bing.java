package com.IdentifyingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingTitle_Bing {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		String title=driver.getTitle();
		
		System.out.println("The Title of Bing Home Page is: "+title);
		
		driver.close();
		
		

	}

}
