package com.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Selection {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// class="border_grey1" - current location properties
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		List<WebElement>cityNames=currentLocation.findElements(By.tagName("option"));
		
		int cityCount=cityNames.size();
		System.out.println("Total number of cities are :"+cityCount);
		
		/*for(int k=0;k<cityCount;k++)
		{
			System.out.println(k+" "+cityNames.get(k).getText());
		}*/
		
		Select selection = new Select(currentLocation);
		//selection.selectByVisibleText("Chennai"); // should provide the text of the optional value
		//selection.selectByIndex(2); // index starts with 0 of the dropDown
		selection.selectByValue("492"); // provide the optional value number given by the developer
		
		// id="id_industry" - industry element property
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select sel = new Select(industry);
		
		sel.selectByIndex(1);
		sel.selectByValue("4");
		sel.selectByVisibleText("Banking/ Financial Services");
		sel.selectByIndex(0);
		
		sel.deselectByIndex(1);
		sel.deselectByValue("4");
		sel.deselectByVisibleText("Banking/ Financial Services");
					
		sel.deselectAll();
		
		industry.sendKeys("Any");
		
		
		//driver.quit();
	}

}
