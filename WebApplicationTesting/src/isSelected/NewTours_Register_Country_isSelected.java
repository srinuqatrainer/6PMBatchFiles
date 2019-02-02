package isSelected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_isSelected {

	public static void main(String[] args) 
	{
		String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		// identify the country Element
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		int counties_Count=countries.size();
		
		System.out.println("Total number of countires are :"+counties_Count);
		
		for(int i=0;i<counties_Count;i++)
		{
			countries.get(i).click();
			if(countries.get(i).isDisplayed())
			{
				String country_Name=countries.get(i).getText();
				System.out.println(i+" "+country_Name);
				
				if(countries.get(i).isSelected())
				{
					System.out.println("Element Active");
				}
				else
				{
					System.out.println("Element inActive");
				}
				
			}
			
		}
		
		driver.quit();

	}

}
