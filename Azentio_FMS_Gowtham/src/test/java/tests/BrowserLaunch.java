package tests;

import java.util.Random;

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
	
//	String i = "3333,33.3";
//	
//	String str = i.replace(",","");
//	System.out.println(str);
	
//	int i = 10;
//	for (int j = 0; j < 100; j++) {
//		if (i==40) {
//			break;
//		}
//		else {
//			i=i+1;
//			System.out.println(i);
//		}
//	}
	
	
	Random r = new Random();
//	int low = 10;
//	int high = 1000;
//	int result = r.nextInt(high-low) + low;
//	System.out.println(result);
	
	int low = 10;
	int high = 1000;
	int result = r.nextInt(high-low) + low;
	String code = String.valueOf(result);
	System.out.println(code);
	
}
}
