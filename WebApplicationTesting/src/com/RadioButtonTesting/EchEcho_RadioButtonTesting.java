package com.RadioButtonTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchEcho_RadioButtonTesting {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url ="http://www.echoecho.com/htmlforms10.htm";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// xpath of the block of the web page - radioButtons block
		WebElement block=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		// <input type="radio" name="group1" value="Milk">
		// <input type="radio" name="group1" value="Butter" checked="">
		// <input type="radio" name="group1" value="Cheese">
		
		// <input type="radio" name="group2" value="Water">
		
		List<WebElement>radioButtons=block.findElements(By.name("group1"));
		
		System.out.println(radioButtons.size());
		
		for(int k=0;k<radioButtons.size();k++)
		{
			radioButtons.get(k).click();
			
			for(int p=0;p<radioButtons.size();p++)
			{
				System.out.println(radioButtons.get(p).getAttribute("value")+" - "
			                                      +radioButtons.get(p).getAttribute("checked"));
			}
		}
		
		driver.quit();
		
		
		

	}

}
