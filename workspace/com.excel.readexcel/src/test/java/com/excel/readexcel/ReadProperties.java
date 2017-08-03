package com.excel.readexcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		String filepath = "C:\\Users\\inty\\workspace\\com.excel.readexcel\\target\\data.properties";

		FileInputStream file = new FileInputStream(filepath);
		Properties config = new Properties();
		config.load(file);
		System.out.println(config.getProperty("email"));
		file.close();

	}

}
