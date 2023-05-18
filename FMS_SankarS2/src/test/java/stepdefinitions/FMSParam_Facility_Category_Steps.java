package stepdefinitions;

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
import pageobjects.fmsParam.Facility_CategoryObj;
import resources.BaseClass;

public class FMSParam_Facility_Category_Steps {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Facility_CategoryObj facilityCategoryObj = new Facility_CategoryObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	// @299883	
	@And("^User clicks on the Parameter module$")
    public void user_clicks_on_the_parameter_module() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.fmsParamParameter());
        facilityCategoryObj.fmsParamParameter().click();
    }

    @And("^User clicks on the Facility category feature$")
    public void user_clicks_on_the_facility_category_feature() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.parameterFacilityCategory());
    	facilityCategoryObj.parameterFacilityCategory().click();
    }

    @And("^User clicks on the maintanance menu$")
    public void user_clicks_on_the_maintanance_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.facilityCategoryMain());
    	facilityCategoryObj.facilityCategoryMain().click();        
    }

    @And("^User clicks on the search button$")
    public void user_clicks_on_the_search_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.mainSearchBtn());
    	facilityCategoryObj.mainSearchBtn().click();
    }

    @And("^User double clicks on the any one row$")
    public void user_double_clicks_on_the_any_one_row() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.mainSearchResult());
    	clicksAndActionsHelper.doubleClick(facilityCategoryObj.mainSearchResult());        
    }

    @And("^User clicks the CIF type search option$")
    public void user_clicks_the_cif_type_search_option() throws Throwable {
    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.mainCIFTypeSearchOption());
    	facilityCategoryObj.mainCIFTypeSearchOption().click();
    }

    @And("^User double click on the any one value$")
    public void user_double_click_on_the_any_one_value() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityCategoryObj.mainCIFTypeData());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
//    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.mainCIFTypeData());
    	clicksAndActionsHelper.doubleClick(facilityCategoryObj.mainCIFTypeData());
    }
    
    @Then("^User clicks on the save button and save the record$")
    public void user_clicks_on_the_save_button_and_save_the_record() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.mainSaveBtn());
    	facilityCategoryObj.mainSaveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.ButtonConfirmOk());
    	facilityCategoryObj.ButtonConfirmOk().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, facilityCategoryObj.ButtonSuccessOk());
    	facilityCategoryObj.ButtonSuccessOk().click();
    }



}
