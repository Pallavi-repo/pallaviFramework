package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File src=new File("./TestData/testdata.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
		    wb = new XSSFWorkbook(fis);
			 
		} catch (Exception e) {
			System.out.println("Unable to read Excel file"+e.getMessage());
		}
	}
	
	public String getStringData(String sheetName,int row,int column)
	{
		String str=wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		return str;
	}
	
	public double numricData(String sheetName,int row,int column)
	{
		double dbl=wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		return dbl;
	}
	
	
		
	
}
