package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		driver = new FirefoxDriver();
		
		String url="http://amazon.in";
		
		driver.get(url);
		
		// id="nav-link-yourAccount" - helloSignIn Element properties

		WebElement helloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
		
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn).perform();;
		
		// <span class="nav-text">Your Orders</span>
		// <span class="nav-text">Your Wish List</span>
		// //*[@id="nav-flyout-yourAccount"]/div[3]/a[3]/span
		
		// automating Your Wish list of the Drop down after Mousehover on helloSignIn Element
		driver.findElement(By.xpath("//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span")).click();
		
		
		
		
	}

}
