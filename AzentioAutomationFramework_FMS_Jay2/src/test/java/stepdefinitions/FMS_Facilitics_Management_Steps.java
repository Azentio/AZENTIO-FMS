package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.FMS_Facility_Management_obj;
import resources.BaseClass;

public class FMS_Facilitics_Management_Steps {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMS_Facility_Management_obj FMS_FaciliticsManagementObj = new FMS_Facility_Management_obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	DropDownHelper DropDownhelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);

	@Then("^Click Facilities Management$")
    public void click_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_Facilities_Management());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_Facilities_Management());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_Facilities_Management());
    }

    @Then("^Click and Enter Application Ref No$")
    public void click_and_enter_application_ref_no() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_Application_Ref());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_Application_Ref());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_Application_Ref());
    }
    
    @Then("^Click Additional Details SunMenu$")
    public void click_additional_details_sunmenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_Additional_Details());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_Additional_Details());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_Additional_Details());
    }

    @Then("^Click ProductClass In facility Limit Details$")
    public void click_productclass_in_facility_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.DoubleClick_ProductClassIN_facility_Limit_Details());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.DoubleClick_ProductClassIN_facility_Limit_Details());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.DoubleClick_ProductClassIN_facility_Limit_Details());
    }

    @And("^Click Maintence Screen$")
    public void click_maintence_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_Maintenance_In_Facilities_Management());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_Maintenance_In_Facilities_Management());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_Maintenance_In_Facilities_Management());
    }

    @And("^Click Application Ref Search button$")
    public void click_application_ref_search_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_Application_Ref_Search_button());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_Application_Ref_Search_button());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_Application_Ref_Search_button());
		FMS_FaciliticsManagementObj.Click_Application_Ref_Search_button().sendKeys("3561");
    }
    @And("^Click facility Limit Details$")
    public void click_facility_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_facility_Limit_Details());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_facility_Limit_Details());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_facility_Limit_Details());
    }

    @And("^Enter Previous data In MaturityDate$")
    public void enter_previous_data_in_maturitydate() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate());
		FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate().sendKeys("04/01/2021");
    }
}
