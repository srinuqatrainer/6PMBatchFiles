package com.IdentifyingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingURL_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println("The actual Url on the Browser is :"+ actual_Url);
		
		driver.close();

	}

}
