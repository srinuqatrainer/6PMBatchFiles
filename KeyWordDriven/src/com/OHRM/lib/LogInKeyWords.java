package com.OHRM.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInKeyWords 
{
	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void navigate()
	{
		driver.get(url);
	}
	public void enterUsername()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	}
	public void enterPassword()
	{
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("password");
	}
	public void clickLogin()
	{
		driver.findElement(By.cssSelector("#btnLogin")).click();
	}

}