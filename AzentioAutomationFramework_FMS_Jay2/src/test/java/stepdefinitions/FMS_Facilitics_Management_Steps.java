package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
		FMS_FaciliticsManagementObj.Click_Application_Ref().sendKeys("3561");
		FMS_FaciliticsManagementObj.Click_Application_Ref().sendKeys(Keys.TAB);
		    }

    
//    @Then("^Click Additional Details SunMenu$")
//    public void click_additional_details_sunmenu() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_Additional_Details());
//		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_Additional_Details());
//		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_Additional_Details());
//    }

    @Then("^Click ProductClass In facility Limit Details$")
    public void click_productclass_in_facility_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.DoubleClick_ProductClassIN_facility_Limit_Details());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.DoubleClick_ProductClassIN_facility_Limit_Details());
		clicksAndActionsHelper.doubleClick(FMS_FaciliticsManagementObj.DoubleClick_ProductClassIN_facility_Limit_Details());
    }

    @And("^Click Maintence Screen$")
    public void click_maintence_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_Maintenance_In_Facilities_Management());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_Maintenance_In_Facilities_Management());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_Maintenance_In_Facilities_Management());
    }

    @And("^Click Random button In Status SubMenu$")
    public void click_random_button_in_status_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_Random_button_In_Status_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_Random_button_In_Status_SubMenu());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_Random_button_In_Status_SubMenu());
		Thread.sleep(5000);
    }
    @And("^Click facility Limit Details$")
    public void click_facility_limit_details() throws Throwable {
    //	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Click_facility_Limit_Details());
	//	clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Click_facility_Limit_Details());
	//	clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_facility_Limit_Details());
		
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Click_facility_Limit_Details());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^Enter Previous data In MaturityDate$")
    public void enter_previous_data_in_maturitydate() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate());
		clicksAndActionsHelper.moveToElement(FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate());
		clicksAndActionsHelper.clickOnElement(FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate());
		FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate().sendKeys("04/01/2021");
		Assert.assertEquals(true, FMS_FaciliticsManagementObj.Enter_Previous_dataIn_MaturityDate().isDisplayed());
    }
}
