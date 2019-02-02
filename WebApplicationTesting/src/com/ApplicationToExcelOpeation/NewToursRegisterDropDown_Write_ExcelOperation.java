package com.ApplicationToExcelOpeation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursRegisterDropDown_Write_ExcelOperation {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		// identify the country Element
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		int counties_Count=countries.size();
		
		System.out.println("Total number of countires are :"+counties_Count);
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\SinglTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		for(int i=0;i<counties_Count;i++)
		{
			String country_Name=countries.get(i).getText();
			System.out.println(i+" "+country_Name);
			
			Row r=sheet.createRow(i);
			Cell c=r.createCell(0);
			
			c.setCellValue(country_Name);
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\SinglTestData.xlsx");
			workBook.write(file1);
		}
		
		driver.quit();

	}

}
