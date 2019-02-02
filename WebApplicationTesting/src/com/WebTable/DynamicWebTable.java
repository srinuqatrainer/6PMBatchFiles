package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url ="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
				
		// /html/body/div[1]/div[6]/section[1]/div
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));

		int rowCount=rows.size();
		
		System.out.println("The total number of rows in the table are : "+rowCount);
		
		for(int i=0;i<rowCount;i++) // to goto each ROW
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			
			int colsCount=cols.size();
			
			System.out.println("The total number of coluumns in the table are : "+colsCount);
			
			for(int j=0;j<colsCount;j++)
			{
				String data=cols.get(j).getText();
				System.out.print(data+" ");
			}
			System.out.println();
					
		}
		
		driver.quit();
	}

}
