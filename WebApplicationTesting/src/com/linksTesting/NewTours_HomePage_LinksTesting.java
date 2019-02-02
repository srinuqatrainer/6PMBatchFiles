package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksTesting {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
				
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int links_Count=links.size();
		
		System.out.println("The total number of links on the new tours home page are :"+links_Count);
				
		for(int k=0;k<links_Count;k++) // goes to every index of an array and will get the text
		{
			String linkName=links.get(k).getText();
			System.out.println(k+" "+linkName);
			
			links.get(k).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			// re-creating the arrayList
			links=driver.findElements(By.tagName("a"));
		}
		
		driver.close();

	}

}
