package tests;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import bsh.ParseException;
import dataProvider.ConfigFileReader;

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
	
	String x="05 January 2021";
	String[] split = x.split(" ");
	for (String string : split) {
		System.out.println(string);
	}
	String substring = split[1].substring(0, 3);
	DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("MMM")
            .withLocale(Locale.US);
TemporalAccessor temporalAccessor = dtFormatter.parse(substring);
System.out.println(temporalAccessor.get(ChronoField.MONTH_OF_YEAR)); 
	//LocalDate date =LocalDate.of(Integer.parseInt(split[2]), Month.JANUARY, Integer.parseInt(split[0]));
	LocalDate date = LocalDate.of(Integer.parseInt(split[0]),temporalAccessor.get(ChronoField.MONTH_OF_YEAR),Integer.parseInt(split[2]));
	LocalDate plusMonths = date.plusMonths(28);
	System.out.println(plusMonths);
	
}
}
