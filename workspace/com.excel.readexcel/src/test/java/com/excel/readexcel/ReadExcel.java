package com.excel.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\inty\\Desktop\\myexcel.xlsx");
		FileInputStream fi = new FileInputStream(file);
		//System.out.println(file.getName());
		 XSSFWorkbook XW=new XSSFWorkbook(fi);
		 Sheet sheet=XW.getSheetAt(0);
		
		 System.out.println(sheet.getRow(1).getCell(1));
		
		
		
		fi.close();
	}

}
