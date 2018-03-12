package com.automation.working.day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program32 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		//Open the Workbook
		FileInputStream fis=new FileInputStream("C:\\Users\\VISHNU\\Documents\\Book1.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		//goto sheet1
		Sheet s=wb.getSheet("Sheet1");
		
		//goto row		
		Row r=s.getRow(0);
		
		//goto cell0
		Cell c=r.getCell(0);
		
		//get the value
		String v=c.getStringCellValue();
		//print the value
		System.out.println(v);
		
	}

}
