package com.OHRMApplicationLogInTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRM_LogInTest 
{

	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	//String userName="admin";
	//String password="Hello";
	
	@Given("^Open FireFox Browser and navigate to OrangeHRM application$")
	public void Open_FireFox_Browser_and_navigate_to_OrangeHRM_application() 
	{
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*@When("^user enters valid userName and password and click on signIn button$")
	public void user_enters_valid_userName_and_password_and_click_on_signIn_button() 
	{
		// <input name="txtUsername" id="txtUsername" type="text">
				driver.findElement(By.id("txtUsername")).sendKeys(userName);
				
				// <input name="txtPassword" id="txtPassword" type="password">
				driver.findElement(By.id("txtPassword")).sendKeys(password);
				
				// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				
				driver.findElement(By.name("Submit")).click();
	}*/
	
	
	@When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\" and click on signIn button$")
	public void user_enters_valid_and_and_click_on_signIn_button(String userName, String password) 
	 {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.name("Submit")).click();
	 
	}

	@Then("^use should be able to succesfully logIn to the application and close the application$")
public void use_should_be_able_to_succesfully_logIn_to_the_application_and_close_the_application()
		throws IOException 
	{
		try{
			String expected_text="Welcome Admin";
	System.out.println("The expected text is :"+expected_text);
	
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	String actual_Text=driver.findElement(By.id("welcome")).getText();
	System.out.println("The actual text is : "+actual_Text);
	
	if(actual_Text.contains(expected_text))
	{
		System.out.println("Successfully logIn - PASS");
	}
	
	}
	catch(Exception e)
	{
		if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"))
		{
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./ScreenShot/img.png"));
			
			System.out.println("LogIn Failed - FAIL");
			driver.quit();
		}
			
	}
	driver.quit();
	
}

	
}
