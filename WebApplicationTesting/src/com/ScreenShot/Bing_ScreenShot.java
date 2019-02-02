package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException
	{
		String url="http://bing.com";
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// type casting
		File bing_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(bing_ScreenShot, new 
		             File("C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\ScreenShots\\bing.png"));
		
		driver.quit();

	}

}
