package com.AutoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadImage {
	
	
	WebDriver driver = null;
	String url="https://imgur.com/";
	
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
			
	
	@Test(priority=0)
	public void uploadFile()
	{
		driver.findElement(By.className("Button-label")).click();
	}
	
	@Test(priority=1)
	public void browser() throws IOException
	{
		driver.findElement(By.className("browse-btn")).click();
		
		java.lang.Runtime.getRuntime().exec("./AutoItScripts/FileUpload.exe");
	}
	

}
