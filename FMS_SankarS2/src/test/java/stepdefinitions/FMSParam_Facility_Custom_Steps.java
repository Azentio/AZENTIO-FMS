package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.fmsParam.Facility_Custom_FieldsObj;
import resources.BaseClass;

public class FMSParam_Facility_Custom_Steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Facility_Custom_FieldsObj facilityCustomFieldsObj = new Facility_Custom_FieldsObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
//	@AT_RF_024
	@And("^ User_608 clicks on the Facility custom fields under Parameter$")
    public void user_clicks_on_the_facility_custom_fields_under_parameter() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityCustomFieldsObj.paramFacilityCustomFields());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
        waitHelper.waitForElementwithFluentwait(driver, facilityCustomFieldsObj.paramFacilityCustomFields());
        facilityCustomFieldsObj.paramFacilityCustomFields().click();
    }

    @And("^ User_608 clicks on the Maintain facility custom fields under facility custom fields$")
    public void user_clicks_on_the_maintain_facility_custom_fields_under_facility_custom_fields() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCustomFieldsObj.maintainFacilityCustomFields());
    	facilityCustomFieldsObj.maintainFacilityCustomFields().click();
    }

    @And("^ User_608 clicks on the Update after approve in Maintain facility custom fields$")
    public void user_clicks_on_the_update_after_approve_in_maintain_facility_custom_fields() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCustomFieldsObj.maintainFacilityCustomUpdateAterApprove());
    	facilityCustomFieldsObj.maintainFacilityCustomUpdateAterApprove().click();
    }

    @And("^ User_608 double click on the one record under update after approve$")
    public void user_double_click_on_the_one_record_under_update_after_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCustomFieldsObj.updateAfterApproveSearchResult());
    	clicksAndActionsHelper.doubleClick(facilityCustomFieldsObj.updateAfterApproveSearchResult());
    }

    @And("^ User_608 validate Facility Custom Fields screen are available$")
    public void user_validate_facility_custom_fields_screen_are_available() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCustomFieldsObj.facilityCustomFieldsBox());
    	WebElement facilityCustomFieldsBox = facilityCustomFieldsObj.facilityCustomFieldsBox();
    	Assert.assertTrue(facilityCustomFieldsBox.isDisplayed());
    }

}
