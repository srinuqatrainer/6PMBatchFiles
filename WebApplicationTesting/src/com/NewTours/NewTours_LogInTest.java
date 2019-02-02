package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		
		String expected_HomePageTitle="Welcome: Mercury Tours";
		System.out.println("Expected Title of newTours Home page is "+ expected_HomePageTitle);
		
		String actual_HomePageTitle=driver.getTitle();
		System.out.println("Actual title of newTours home page is :"+actual_HomePageTitle);
		
		if(actual_HomePageTitle.equals(expected_HomePageTitle))
		{
			System.out.println("NewTours Home Page successfully launched - PASS");
		}
		else
		{
			System.out.println("NewTours Home page failed to launch - FAIL");
			
		}
		
		// <input type="text" name="userName" size="10">
		
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys("tutorial");
		
		// <input type="password" name="password" size="10">
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		// <input type="image" name="login" value="Login" 
		// src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
		
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		System.out.println("The expected title is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("The actual title is : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("LogIn Successfull - PASS");
		}
		else
		{
			System.out.println("LogIn Failed - FAIL");
		}
		
		driver.close();
	}

}
