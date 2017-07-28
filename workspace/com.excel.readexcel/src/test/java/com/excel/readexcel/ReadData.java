package com.excel.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
	@Test
	public void read() throws IOException{
		File scr = new File("C:\\Users\\inty\\workspace\\com.excel.readexcel\\src\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);
		System.out.println(sheet1.getActiveCell().split(",").toString());
		System.out.println(sheet1.getRow(0).getCell(1));
		
		
	}
	}


