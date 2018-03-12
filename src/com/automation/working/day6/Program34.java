package com.automation.working.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program34 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		//Open the Workbook
	    FileInputStream fis=new FileInputStream("C:\\Users\\VISHNU\\Documents\\Book1.xlsx");
	    
	    Workbook wb=WorkbookFactory.create(fis);
	    
	    for(int i=0;i<=2;i++)
	    {
	    	for(int j=0;j<=2;j++)
	    	{
	    		Cell c=wb.getSheet("Sheet1").getRow(i).getCell(j);
	    		String v=c.toString();
	    		System.out.print(v+" ");
	    	}
	    	System.out.println();
	    }
	}

}
