package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompleteWebTableData {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url ="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// xpath of FirstRow of First Column
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	
		// xpath of LastRow of Last Column
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		
		for(int i=1;i<=36;i++) // goes to every Row
		{
			for(int k=1;k<=8;k++) // of Every row this loop will iterate for all the Columns in the Row 
			{
				String data=driver.findElement(By.xpath(part1+i+part2+k+part3)).getText();
				System.out.print(data+" ");
			}
			System.out.println();
			
		}
		
		driver.quit();
	}

}
