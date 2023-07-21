package tests;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import helper.AlertHelper;
import helper.DropDownHelper;
import helper.GenericHelper;
import resources.BaseClass;

public class helpercheck extends BaseClass { 
		
//	WebDriver driver =BaseClass.initializeDriver();
	DropDownHelper dropDownHelper= new DropDownHelper(driver);
	GenericHelper genericHelper=new GenericHelper();
	AlertHelper alertHelper=new AlertHelper(driver);
	
//	@Test
//	public void OpenApplication() throws IOException, InterruptedException {
//		
//		    driver=initializeDriver();
//		    driver.get("http://omayo.blogspot.com/");
//			driver.manage().window().maximize();
//			
//			
//		
//			////****Dropdown helper checking
//			WebElement dropdown=driver.findElement(By.id("drop1"));
//			dropDownHelper.SelectUsingVisibleText(dropdown,"doc 3");
//			/*
//			////****Generic helper checking
//			WebElement element=driver.findElement(By.linkText("Page One"));
//			 String value=genericHelper.readValueFromElement(element);
//			 System.out.println(value);
//		
//			
//			//******Alert helper checking
//			driver.findElement(By.id("alert1")).click();
//			alertHelper.AcceptAlert();
//			
//			*/
//			
//			Thread.sleep(5000);
//			 
//	}
	public static void main(String[] args) throws ParseException, IOException {
//		String value ="16 January 2021";
//		SimpleDateFormat fromUser = new SimpleDateFormat("dd MMMM yyyy");
//	    SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
//	    String reformattedStr = myFormat.format(fromUser.parse(value));
//	    System.out.println(reformattedStr);
//		String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
//		ExcelData requestForFinancingData = new ExcelData(path,"RequestForFinancing_482","DataSet ID");
//		ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
//		Map<String, String> testExecutionData = testExecution.getTestdata("AT_RF_166");
//	     System.out.println(testExecutionData.get("Data Set ID"));
//    	Map<String, String> testdata = requestForFinancingData.getTestdata(testExecutionData.get("Data Set ID"));
//    	System.out.println(testdata.get("DataSet ID"));
//    	System.out.println(testdata.get("RequestID"));
//		String x="Collateral : 000000001143 Save Successfully";
//		System.out.println(x.substring(21, 25));
//		
//		 Properties props = new Properties();
//	      //Populating the properties file
//		 String path = "C:\\Users\\ININDC00482\\git\\FMS_Ajith\\AzentioAutomationFramework_FMS_Ajith\\configs\\data.properties";
//		 BufferedReader reader = new BufferedReader(new FileReader(path));
//		 props.load(reader);
//	      props.setProperty("DisableNotification","no");
//	      //Instantiating the FileInputStream for output file
//	     
//	      props.store(new FileOutputStream(path), null);
	      
	      
	        String value ="16 January 2021";
	        SimpleDateFormat fromUser = new SimpleDateFormat("dd MMMM yyyy");
		    SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		    String reformattedStr = myFormat.format(fromUser.parse(value));
		    System.out.println(reformattedStr);
	      
				
	    
		
		
	}
}

