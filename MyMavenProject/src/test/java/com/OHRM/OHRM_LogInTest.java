package com.OHRM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LogInTest {
	
	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	String userName="admin";
	String password="pasword";
	
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
			
	
	@Test
	public void logIn() throws IOException 
	{
		// <input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		// <input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.name("Submit")).click();
		
		try{
			String expected_text="Welcome Admin";
	System.out.println("The expected text is :"+expected_text);
	
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	String actual_Text=driver.findElement(By.id("welcome")).getText();
	System.out.println("The actual text is : "+actual_Text);
	
	if(actual_Text.contains(expected_text))
	{
		System.out.println("Successfully logIn - PASS");
	}
	
	}
	catch(Exception e)
	{
		if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"))
		{
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./ScreenShot/img.png"));
			
			System.out.println("LogIn Failed - FAIL");
			driver.quit();
		}
			
	}		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
