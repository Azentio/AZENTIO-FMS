package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.fms.Request_FacilitiesManagementObj_608;
import resources.BaseClass;

public class FacilitiesManagementSteps_608 {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Request_FacilitiesManagementObj_608 requestFacilityManagementObj608 = new Request_FacilitiesManagementObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"Facilities_ManagementTestData","DataSet ID");
	Map<String, String> testData;
	
//	@AT_FM_035
	@And("User_608 get the test data for test case AT_FM_035_FMSCore")
	public void user_get_the_test_data_for_test_case_at_fm__fms_core() {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_035");
	}
	
	
	
//	@AT_FM_035
	@And("User_608 clicks the Facilities Management feature under Request Financing")
	public void user_clicks_the_facilities_management_feature_under_request_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestFacilityManagementObj608.requestFacilitiesManagementFeature_608());
		requestFacilityManagementObj608.requestFacilitiesManagementFeature_608().click();
	}

	@And("User_608 clicks the Maintanance in Facilities Management under Request Financing")
	public void user_clicks_the_maintanance_in_facilities_management_under_request_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestFacilityManagementObj608.requestFacilitiesManagementMaintanance_608());
		requestFacilityManagementObj608.requestFacilitiesManagementMaintanance_608().click();
	}

	@And("User_608 click the search button in maintanance screen under Facilities Management")
	public void user_click_the_search_button_in_maintanance_screen_under_facilities_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestFacilityManagementObj608.requestFacilitiesManagementMainSearchBtn_608());
		requestFacilityManagementObj608.requestFacilitiesManagementMainSearchBtn_608().click();
	}

	@And("User_608 search the facility with CIF number in maintanance screen under Facilities Management")
	public void user_search_the_facility_with_cif_number_in_maintanance_screen_under_facilities_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestFacilityManagementObj608.requestFacilitiesManagementMainSearchCIFInput_608());
		requestFacilityManagementObj608.requestFacilitiesManagementMainSearchCIFInput_608().sendKeys(testData.get("CIF No"),Keys.ENTER);
	}

	@Then("User_608 retrieve the facility in maintanance screen under Facilities Management")
	public void user_retrieve_the_facility_in_maintanance_screen_under_facilities_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestFacilityManagementObj608.requestFacilitiesManagementMainSearchRow1_608());
	    clicksAndActionsHelper.doubleClick(requestFacilityManagementObj608.requestFacilitiesManagementMainSearchRow1_608());
	    
	    waitHelper.waitForElementwithFluentwait(driver, requestFacilityManagementObj608.requestFacilitiesManagementMainCode_608());
	    for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestFacilityManagementObj608.requestFacilitiesManagementMainCode_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}


}
