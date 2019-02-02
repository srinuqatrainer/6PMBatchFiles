package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class APSRTC_HeaderBlock_Testing {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = null;
		String url = "https://apsrtconline.in/oprs-web/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// class="menu-wrap"
		
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>headerBlock_Links=headerBlock.findElements(By.tagName("a"));
		
		int headerBlockLinks_Count=headerBlock_Links.size();
		
System.out.println("The total number of links in the headerBlock are : "+headerBlockLinks_Count);
		
		for(int k=0;k<headerBlockLinks_Count;k++)
		{
			String headerBlock_LinkName=headerBlock_Links.get(k).getText();
			System.out.println(k+" "+headerBlock_LinkName);
			
			headerBlock_Links.get(k).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Thread.sleep(5000);// Explicit Wait - WebDriver will wait for sure for the given time
			
			headerBlock=driver.findElement(By.className("menu-wrap"));
			
			headerBlock_Links=headerBlock.findElements(By.tagName("a"));
			
			
		}
		
		driver.close();
	}

}
