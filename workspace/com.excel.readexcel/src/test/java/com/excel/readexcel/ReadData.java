package com.excel.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.ScrollAction;

public class ReadData {

	WebDriver driver = new ChromeDriver();

	public static void searchitem() throws IOException {
		String path = "C:\\Users\\inty\\Desktop\\TestData.xlsx";
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int totalrownum = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < totalrownum; i++) {
			String item = sheet.getRow(i).getCell(1).toString();

			if (item.equals("Cucumber")) {
				System.out.println(item);
			}
		}
	}

	@Test
	public void amazonTest() throws IOException, InterruptedException {

		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("cucumber\n");
		// WebElement result =
		// driver.findElement(By.xpath(".//*[@id='s-result-count']"));
		// System.out.println(result.getText().split(":")[1]);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);
		js.executeScript("window,scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window,scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window,scrollBy(0,-800);");
		Thread.sleep(2000);

	}

	@After
	public void teardonw() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		String path = "C:\\Users\\inty\\Desktop";

		Random ran = new Random();
		String name = ran.nextInt(50000) + ".png";
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path + name));

		driver.close();
	}

	
}
