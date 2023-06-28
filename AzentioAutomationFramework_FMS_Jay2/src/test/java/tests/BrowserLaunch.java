package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;

public class BrowserLaunch  {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//	ConfigFileReader config = new ConfigFileReader();
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
//	WebDriver driver = new ChromeDriver(options);
//	driver.get(config.getFMSApplicationUrl());
//	driver.manage().window().maximize();
//	Thread.sleep(5000);
//	driver.quit();
	String path = System.getProperty("user.dir")+"\\TestData\\FMSTestData.xlsx";
	ExcelData  DrawDownPayment = new ExcelData(path, "DrawDownPayment_TestData", "DataSet ID");
	Map<String, String> testData;
	testData = DrawDownPayment.getTestdata("DS01_1105453");
	System.out.println(testData.get("Facility Rating"));
	
}
}
