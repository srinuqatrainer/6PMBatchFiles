package com.ExcelFileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\SinglTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row r=sheet.createRow(2);
		Cell c=r.createCell(5);
		
		c.setCellValue("Selenium");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\6PMBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\SinglTestData.xlsx");
		workBook.write(file1);
	}

}
