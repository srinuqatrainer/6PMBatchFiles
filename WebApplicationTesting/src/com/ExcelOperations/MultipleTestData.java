package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\MultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++) // to goto each Row
		{
			Row r=sheet.getRow(i);
			
			int cellCount=r.getLastCellNum();
			for(int k=0;k<cellCount;k++)
			{
				Cell c=r.getCell(k);
				String data=c.getStringCellValue();
				System.out.print(data+" ");
				
			}
			System.out.println();
			
		}

	}

}
