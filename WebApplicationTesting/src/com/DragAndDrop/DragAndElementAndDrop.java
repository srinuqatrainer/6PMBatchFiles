package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DragAndElementAndDrop {

	public static void main(String[] args)
	{
		
		WebDriver driver=null;
		String url="https://jqueryui.com/droppable/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(5);
				
		// class="demo-frame" - frame properies
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		// id="draggable" - Drag Element Properties
			
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		// id="droppable" - drop element properties
		
		WebElement drop_Element=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag_Element, drop_Element).perform();
		
		driver.switchTo().defaultContent();
	}

}
