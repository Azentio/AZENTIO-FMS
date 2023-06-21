package tests;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;



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
	
//	String x="05 January 2021";
//	String[] split = x.split(" ");
//	for (String string : split) {
//		System.out.println(string);
//	}
//	String substring = String.valueOf(Integer.parseInt(split[0]));
//	
//	
//	DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("d")
//            .withLocale(Locale.US);
//TemporalAccessor temporalAccessor = dtFormatter.parse(substring);
//System.out.println(temporalAccessor.get(ChronoField.DAY_OF_WEEK)); 
//	//LocalDate date =LocalDate.of(Integer.parseInt(split[2]), Month.JANUARY, Integer.parseInt(split[0]));
//	LocalDate date = LocalDate.of(Integer.parseInt(split[0]),temporalAccessor.get(ChronoField.MONTH_OF_YEAR),Integer.parseInt(split[2]));
//	LocalDate plusMonths = date.plusMonths(28);
//	System.out.println(plusMonths);
//	  String date1="29-05-2023";
//	  String[] split = date1.split("[-]");
//	  String currentDate;
//	  DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//	  Date date1 = new Date();
//	  int day = date1.getDay();
//	  if (day==5||day==6||day==7) {
//		  LocalDate date =LocalDate.now();
//		  currentDate = date.plusDays(3).format(dtFormatter).toString();
//	}
//	  else {
//		  currentDate =LocalDate.now().format(dtFormatter).toString();
//	}
	String sample ="Application Facility : 4134 saved successfully";
	String substring = sample.substring(23, 28);
	System.out.println(substring);
	System.out.println(sample.indexOf('4'));
	
	  
//	 Date date = new Date();
//	 int day = date.getDay();
//	 System.out.println(day);
//	List<Integer> test = new ArrayList<Integer>();
//	for (int j = 1; j <=4; j++) {
//		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='facilityManagementGridTbl_Id_WIFT008QY']//tr"));	
//		for (int i = 1; i < findElements.size(); i++) {
//			List<WebElement> findElements2 = findElements.get(i).findElements(By.tagName("td"));
//			String text = findElements2.get(0).getText();
//			test.add(Integer.parseInt(text));
//			
//		}
//		driver.findElement(By.xpath("sd")).click();
//	}
//	test.add(0);
//	test.add(0);
//	test.add(2);
//	test.add(2);
//	
//	for(int i =0; i < test.size(); i++) {
//        if (test.contains(test.get(i))) {
//            System.out.println(test.get(i)+" is duplicated");
//            Assert.fail();
//        }
//   }
//	
//}
}
}
