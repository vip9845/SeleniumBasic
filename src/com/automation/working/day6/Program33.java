package com.automation.working.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program33 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		//Open the Workbook
	    FileInputStream fis=new FileInputStream("C:\\Users\\VISHNU\\Documents\\Book1.xlsx");
	    
	    Workbook wb=WorkbookFactory.create(fis);
	    Cell c=wb.getSheet("Sheet1").getRow(0).getCell(0);
	    
	    String value=c.toString();
	    System.out.println(value);
	    
	    c.setCellValue("SuperGrapes");//Write
	    FileOutputStream fos=new FileOutputStream("C:\\Users\\VISHNU\\Documents\\Book1.xlsx");
	    
	    wb.write(fos);
	}

}
