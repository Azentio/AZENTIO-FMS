package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Facilities_Management_PageObjects_609;
import resources.BaseClass;

public class DrawDownRequest_609 extends BaseClass{
	
		
		int randomNumber;
		WebDriver driver = BaseClass.driver;
		WaitHelper waitHelper = new WaitHelper(driver);
		ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		Facilities_Management_PageObjects_609 FacilitiesManagementPageObjects609 = new Facilities_Management_PageObjects_609(driver);
		ConfigFileReader configFileReader = new ConfigFileReader();
		FMSLogin FMSLogin = new FMSLogin(driver);
		DropDownHelper dropdownhelper = new DropDownHelper(driver);
		JavascriptHelper javascripthelper = new JavascriptHelper(driver);
		String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
		ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
		ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
		ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath, "FMS_WIFAK_ApplicationTestData", "DataSet ID");
		ExcelData fmsFacilitiesManagementExcelData = new ExcelData(TestDataPath, "FMS_Facilities_Management", "DataSet ID");
		Map<String, String> testData;
		Map<String, String> fmsLoginTestData = new HashMap<>();

		@And("User_609 get the test data set id for AT_DDR_074")
		public void user_609_get_the_test_data_set_id_for_at_ddr_074() {
			testData = fmsFacilitiesManagementExcelData.getTestdata("DS01_");
		}

}
