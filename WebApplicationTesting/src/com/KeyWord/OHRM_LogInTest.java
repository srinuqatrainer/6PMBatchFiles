package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LogInTest 
{
	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	//String userName="admin";
	//String password="password";
	
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
			
	
	@Test
	public void logIn() throws IOException, InterruptedException
	{
		
FileInputStream file = new FileInputStream
                               (".\\src\\com\\ApplicationTestDataFiles\\OHRM_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		
		FileInputStream file2 = new FileInputStream("./ohrm.properties");
		Properties p = new Properties();
		p.load(file2);
		
		Row r=sheet.getRow(1);		
		
		// <input name="txtUsername" id="txtUsername" type="text">
driver.findElement(By.id(p.getProperty("userName"))).sendKeys(r.getCell(0).getStringCellValue());
		
		Thread.sleep(5000);
		// <input name="txtPassword" id="txtPassword" type="password">
driver.findElement(By.id(p.getProperty("password"))).sendKeys(r.getCell(1).getStringCellValue());
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.name(p.getProperty("submit"))).click();
		
		String expected_Text="Welcome Admin";
		System.out.println("The expected text after login is : "+expected_Text);
		
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		String actual_Text=driver.findElement(By.id("welcome")).getText();
		System.out.println("The actual text after logIn is : "+actual_Text);
		
		if(actual_Text.equals(expected_Text))
		{
			System.out.println("LogIn Successfull - PASS");
			r.createCell(2).setCellValue("LogIn Successfull - PASS");
		}
		else
		{
			System.out.println("LogIn Failed - FAIL");
			r.createCell(2).setCellValue("LogIn Failed - FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream
				   (".\\src\\com\\ApplicationTestResultFiles\\OHRM_LogInTestResult.xlsx");
		workBook.write(file1);
		
		driver.findElement(By.id("welcome")).click();
		
		// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
