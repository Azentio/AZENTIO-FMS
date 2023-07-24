package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.AlertHelper;
import helper.DropDownHelper;
import helper.GenericHelper;
import resources.BaseClass;

public class helpercheck extends BaseClass { 
		
	WebDriver driver;
	DropDownHelper dropDownHelper= new DropDownHelper(driver);
	GenericHelper genericHelper=new GenericHelper();
	AlertHelper alertHelper=new AlertHelper(driver);
	
	public static void main(String[] args) {
		String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
		ExcelData RequestForFinancingExcelData = new ExcelData(path,"RequestForFinancingTestData","DataSet ID");
		Map<String, String> testdata = RequestForFinancingExcelData.getTestdata("DS01_140576");
		System.out.println(testdata.get("Facility Type"));
		
	}
}

