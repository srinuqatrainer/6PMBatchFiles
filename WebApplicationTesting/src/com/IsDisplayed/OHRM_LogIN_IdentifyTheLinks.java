package com.IsDisplayed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRM_LogIN_IdentifyTheLinks {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		System.out.println("Total number of links are : "+linksCount);
		
		for(int p=0;p<linksCount;p++)
		{
			if(links.get(p).isDisplayed())
			{
				System.out.println(p+" "+links.get(p).getText());
			}
		}
		
		driver.quit();
		
	}

}
