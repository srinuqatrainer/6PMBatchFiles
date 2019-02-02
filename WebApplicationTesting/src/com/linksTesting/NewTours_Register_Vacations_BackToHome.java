package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Vacations_BackToHome {

	public static void main(String[] args)
	{
		String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		// <a href="mercuryunderconst.php">Vacations</a>
		driver.findElement(By.linkText("Vacations")).click();
		
		// <img src="/images/forms/home.gif" width="118" height="23" border="0">
		
		// Absolute xpath
// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/	td[2]/table/tbody/tr[4]/td/a/img

		// considering Absolute xpath to automate "BackToHome" Element
//driver.findElement(By.xpath("Absolute xpath")).click();
				
					// Syntax of Relative xpath is : //tagName[@attribute='value']
		
		// Considering Relative Xpath to autmate "BackToHome" Element
		driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		
	}

}
