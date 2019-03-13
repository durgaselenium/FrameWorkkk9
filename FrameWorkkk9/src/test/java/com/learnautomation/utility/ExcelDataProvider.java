package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
 	
//create constructore	
public ExcelDataProvider()
{
File src = new File("./TestData/Data.xlsx");	
try {
	FileInputStream fis = new FileInputStream(src);
	wb = new XSSFWorkbook(src);
} 
catch (Exception e)
{
System.out.println("Unable to read Excel File>>"+e.getMessage());	
} 

}
	
public String getStringData(int sheetIndex,int row,int column)
{
return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();	
}
	
public String getStringData(String sheetName,int row, int column)
{
return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();	
}
	
public double getNumStringData(String sheetName,int row,int column)
{
return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();	
}
}
