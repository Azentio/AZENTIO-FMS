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
import pageobjects.Facilities_Management_PageObjects_6888;
import resources.BaseClass;

public class Facilities_Management_Steps_6888 extends BaseClass{
	WebDriver driver=BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	Facilities_Management_PageObjects_6888 FacilitiesManagementPageObjects6888 = new Facilities_Management_PageObjects_6888(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	//ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	
	ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath,"FMS_WIFAK_ApplicationTestData","DataSet ID");
    Map<String, String> testData;
	Map<String, String> fmsLoginTestData = new HashMap<>();

	/*
	@And("get the test data set id for AT_RF_192")
	public void get_the_test_data_set_id_for_at_rf_192() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_583895");
	    
	}
	
	@And("^Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION$")
    public void click_on_the_wifak_application_submenu_under_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
    }
    
*/
}
