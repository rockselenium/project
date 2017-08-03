package com.excel.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	
	
	@Test
	public void test1()
	{
		Map<String, String> wb=new HashMap<>();
		wb.put("usrname", "inty");
		System.out.println(	wb.get("usrname"));
		
	
	}

	@Test
	public void readexcel() throws IOException {
		File file = new File("C:\\Users\\inty\\Desktop\\myexcel.xlsx");
		FileInputStream fi = new FileInputStream(file);
		XSSFWorkbook XW = new XSSFWorkbook(fi);
		Sheet sheet = XW.getSheetAt(0);
		sheet.createRow(1).createCell(1);
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getRow(1).getCell(1));

		fi.close();
	}

}
