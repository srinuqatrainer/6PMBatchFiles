package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class APSRTC_CheckAvailability_Click {

	public static void main(String[] args)
	{
		String url="https://apsrtconline.in/oprs-web/";
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String alert_Message=alt.getText();
		System.out.println(alert_Message);
		
		Sleeper.sleepTightInSeconds(10);
		
		alt.accept();// will accept the alert - OK
		
		//alt.dismiss(); // will perform cancel
		
		//alt.sendKeys("srini"); // used to send the data into textBox
		
		

	}

}
