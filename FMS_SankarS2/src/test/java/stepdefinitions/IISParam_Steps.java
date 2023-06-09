package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import pageobjects.iisParam.IISParamObj;
import resources.BaseClass;

public class IISParam_Steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IISParamObj iisParamObj = new IISParamObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"IIS_Param_TestData","DataSet ID");
	Map<String, String> testData;
	
	
//	@AT_RF_014_IISParam
	 @And("^get the test data for test case AT_RF_014_IISParam$")
	    public void get_the_test_data_for_test_case_AT_RF_014iisparam() throws Throwable {
		 testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_014");
	    }
	
	@And("^User clicks on the parameter feature in IIS Param application$")
    public void user_clicks_on_the_parameter_feature_in_iis_param_application() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, iisParamObj.IISParameterFeature());
        iisParamObj.IISParameterFeature().click();
    }

    @And("^User clicks on the product class module uder parameter feature$")
    public void user_clicks_on_the_product_class_module_uder_parameter_feature() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(iisParamObj.parameterProductClassModule());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.parameterProductClassModule());
    	iisParamObj.parameterProductClassModule().click();
    }

    @And("^User clicks on the maintanance screen under product class module$")
    public void user_clicks_on_the_maintanance_screen_under_product_class_module() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.productClassMaintanance());
    	iisParamObj.productClassMaintanance().click();
    }

    @And("^User clicks on the search button in maintanance under product class$")
    public void user_clicks_on_the_search_button_in_maintanance_under_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.productClassMainSearchBtn());
    	iisParamObj.productClassMainSearchBtn().click();
    }

    @And("^User enter the class code in maintanance under product class$")
    public void user_enter_the_class_code_in_maintanance_under_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.productClassMainSearchedRow());
//    	iisParamObj.productClassMainSearchClass().sendKeys("1");
    	iisParamObj.productClassMainSearchClass().sendKeys(testData.get("Class"));
    	iisParamObj.productClassMainSearchClass().sendKeys(Keys.ENTER);
    }

    @And("^User double click on the retrived data in maitanance under product class$")
    public void user_double_click_on_the_retrived_data_in_maitanance_under_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.productClassMainSearchRowLabel());
    	clicksAndActionsHelper.doubleClick(iisParamObj.productClassMainSearchedRow());
    }

    @And("^User clicks on the additional information tab in maitanance under product class$")
    public void user_clicks_on_the_additional_information_tab_in_maitanance_under_product_class() throws Throwable {
    	for (int i = 0; i < 500; i++) {
			try {
				iisParamObj.productClassMainAdditionalInfoTab().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}   	
//    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.productClassMainAdditionalInfoTab());
//    	iisParamObj.productClassMainAdditionalInfoTab().click();
    }

    @And("^User clicks on the repayment plan tab under additional information tab$")
    public void user_clicks_on_the_repayment_plan_tab_under_additional_information_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.mainAdditionalInfoRepaymentTab());
    	iisParamObj.mainAdditionalInfoRepaymentTab().click();
    }

    @And("^User enter the value in number of payments under repayment plan tab$")
    public void user_enter_the_value_in_number_of_payments_under_repayment_plan_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.repaymentTabNoOfPaymentInput());
    	iisParamObj.repaymentTabNoOfPaymentInput().clear();
//    	iisParamObj.repaymentTabNoOfPaymentInput().sendKeys("1");
    	iisParamObj.repaymentTabNoOfPaymentInput().sendKeys(testData.get("No of payment input"));
    	iisParamObj.repaymentTabNoOfPaymentInput().sendKeys(Keys.TAB);
    }

    @And("^User select the dropdown in number of payments under repayment plan tab$")
    public void user_select_the_dropdown_in_number_of_payments_under_repayment_plan_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.repaymentTabNoOfPaymentDropdown());
//    	dropDownHelper.SelectUsingVisibleText(iisParamObj.repaymentTabNoOfPaymentDropdown(), "Nearest 1");
    	dropDownHelper.SelectUsingVisibleText(iisParamObj.repaymentTabNoOfPaymentDropdown(), testData.get("No of Payment Select"));
    }
    
    @Then("^User clicks save the button in maintanance under product class$")
    public void user_clicks_save_the_button_in_maintanance_under_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.productClassMainSaveBtn());
    	iisParamObj.productClassMainSaveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.confirmOkBtn());
    	iisParamObj.confirmOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.successOkBtn());
    	iisParamObj.successOkBtn().click();
    }
    
    
    
//  AT_RF_014_FMSCore
    @And("^User clicks the limit details first row$")
    public void user_clicks_the_limit_details_first_row() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.limitDetailsFirstRow());
    	iisParamObj.limitDetailsFirstRow().click();
    }

    @And("^User clicks the repayment plan button under limit details tab$")
    public void user_clicks_the_repayment_plan_button_under_limit_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.limitDetailsRepaymentPlanBtn());
    	iisParamObj.limitDetailsRepaymentPlanBtn().click();
    }
    
    @Then("^User validate the Rounding factor dropdown$")
    public void user_validate_the_rounding_factor_dropdown() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(iisParamObj.fmsRepaymentPlanRoundingfactorDropdown());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.fmsRepaymentPlanRoundingfactorDropdown());
    	String roundingfactorDropdown = iisParamObj.fmsRepaymentPlanRoundingfactorDropdown().getText();
    	Assert.assertEquals(testData.get("No of Payment Select"), roundingfactorDropdown);
    }

    @Then("^User validate the No of payments input$")
    public void user_validate_the_no_of_payments_input() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj.fmsRepaymentPlanNoOfPaymentsInput());
    	String NoOfPaymentsInput = iisParamObj.fmsRepaymentPlanNoOfPaymentsInput().getText();
    	Assert.assertEquals(testData.get("No of payment input"), NoOfPaymentsInput);
    }
	

}
