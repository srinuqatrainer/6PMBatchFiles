package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		// <a class="gb_P" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
		
		driver.findElement(By.className("gb_P")).click();

	}

}
