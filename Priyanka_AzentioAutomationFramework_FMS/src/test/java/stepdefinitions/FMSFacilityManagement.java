package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.FMSFacilityManagementObj;
import resources.BaseClass;

public class FMSFacilityManagement extends BaseClass{
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSFacilityManagementObj facilityManagementObj  = new FMSFacilityManagementObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javaScriptHelper =new JavascriptHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData facilityManagementexcelData = new ExcelData(TestDataPath, "FacilityManagement", "DataSet ID");
	Map<String, String>facilityManagementtestData = new HashMap<>();
	String code;
	
	@And("^Update test data for test case no AT_RF_049$")
    public void update_test_data_for_test_case_no_AT_RF_049() {
		facilityManagementtestData = facilityManagementexcelData.getTestdata("AT_RF_049_D1");
	     
    }
	
	@Then("^click on the Facilities Management under WIFAK Application$")
    public void click_on_the_facilities_management_under_wifak_application() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
    	clicksAndActionHelper.moveToElement(facilityManagementObj.facilitiesManagement());
    	clicksAndActionHelper.clickOnElement(facilityManagementObj.facilitiesManagement());
     	break;
	} catch (Exception e) {
		if (i==1999) {
			Assert.fail(e.getMessage());
		}
	}
}
    }
	
	
	@Then("^click on the Update After Approve under Facilities Management$")
    public void click_on_the_update_after_approve_under_facilities_management() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionHelper.moveToElement(facilityManagementObj.facilitiesManagement_UpdateAfterApprove());
		    	clicksAndActionHelper.clickOnElement(facilityManagementObj.facilitiesManagement_UpdateAfterApprove());
		     break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}}
    }
	 
	@Then("^click on the clear under Update After Approve in Facilities Management$")
    public void click_on_the_clear_under_update_after_approve_in_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj.facilitiesManagement_UpdateAfterApprove_clear());
    	facilityManagementObj.facilitiesManagement_UpdateAfterApprove_clear().click();
    }
	 
	@Then("^double click on the first row under Update After Approve in Facilities Management$")
    public void double_click_on_the_first_row_under_update_after_approve_in_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj.facilitiesManagement_UpdateAfterApprove_firstRecord());
    	clicksAndActionHelper.doubleClick(facilityManagementObj.facilitiesManagement_UpdateAfterApprove_firstRecord());
    }
	
	@Then("^click on the Additional Details Facilities Management$")
    public void click_on_the_additional_details_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj.facilitiesManagement_UpdateAfterApprove_AdditionalDetails());
    	facilityManagementObj.facilitiesManagement_UpdateAfterApprove_AdditionalDetails().click();
    }
	
	 
	@Then("^enter holiday date in Effective Until field and validate it$")
    public void enter_holiday_date_in_effective_until_field_and_validate_it() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj.facilitiesManagement_UpdateAfterApprove_EffectiveUntil());
    	facilityManagementObj.facilitiesManagement_UpdateAfterApprove_EffectiveUntil().clear();
    	facilityManagementObj.facilitiesManagement_UpdateAfterApprove_EffectiveUntil().sendKeys(facilityManagementtestData.get("EffectiveUntil"));
    	facilityManagementObj.facilitiesManagement_UpdateAfterApprove_EffectiveUntil().sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
	}

}
