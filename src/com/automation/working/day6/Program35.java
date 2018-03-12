package com.automation.working.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program35 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\VISHNU\\Documents\\Book1.xlsx");
	    
	    Workbook wb=WorkbookFactory.create(fis);
	    
	    int rc=wb.getSheet("Sheet1").getLastRowNum();
	    System.out.println(rc);
	    
	    int rc1=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
	    System.out.println(rc1);
	}

}
