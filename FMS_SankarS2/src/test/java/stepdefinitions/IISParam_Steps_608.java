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
import pageobjects.iisParam.IISParamObj_608;
import resources.BaseClass;

public class IISParam_Steps_608 {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IISParamObj_608 iisParamObj608 = new IISParamObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"IIS_Param_TestData","DataSet ID");
	Map<String, String> testData;
	
	
//	@AT_RF_014_IISParam
	 @And("^User_608 get the test data for test case AT_RF_014_IISParam$")
	    public void get_the_test_data_for_test_case_AT_RF_014iisparam() throws Throwable {
		 testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_014");
	    }
	
	@And("^User_608 clicks on the parameter feature in IIS Param application$")
    public void user_clicks_on_the_parameter_feature_in_iis_param_application() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.IISParameterFeature_608());
        iisParamObj608.IISParameterFeature_608().click();
    }

    @And("^User_608 clicks on the product class module uder parameter feature$")
    public void user_clicks_on_the_product_class_module_uder_parameter_feature() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(iisParamObj608.parameterProductClassModule_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.parameterProductClassModule_608());
    	iisParamObj608.parameterProductClassModule_608().click();
    }

    @And("^User_608 clicks on the maintanance screen under product class module$")
    public void user_clicks_on_the_maintanance_screen_under_product_class_module() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.productClassMaintanance_608());
    	iisParamObj608.productClassMaintanance_608().click();
    }

    @And("^User_608 clicks on the search button in maintanance under product class$")
    public void user_clicks_on_the_search_button_in_maintanance_under_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.productClassMainSearchBtn_608());
    	iisParamObj608.productClassMainSearchBtn_608().click();
    }

    @And("^User_608 enter the class code in maintanance under product class$")
    public void user_enter_the_class_code_in_maintanance_under_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.productClassMainSearchedRow_608());
//    	iisParamObj608.productClassMainSearchClass().sendKeys("1");
    	iisParamObj608.productClassMainSearchClass_608().sendKeys(testData.get("Class"));
    	iisParamObj608.productClassMainSearchClass_608().sendKeys(Keys.ENTER);
    }

    @And("^User_608 double click on the retrived data in maitanance under product class$")
    public void user_double_click_on_the_retrived_data_in_maitanance_under_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.productClassMainSearchRowLabel_608());
    	clicksAndActionsHelper.doubleClick(iisParamObj608.productClassMainSearchedRow_608());
    }

    @And("^User_608 clicks on the additional information tab in maitanance under product class$")
    public void user_clicks_on_the_additional_information_tab_in_maitanance_under_product_class() throws Throwable {
    	for (int i = 0; i < 500; i++) {
			try {
				iisParamObj608.productClassMainAdditionalInfoTab_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}   	
//    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.productClassMainAdditionalInfoTab());
//    	iisParamObj608.productClassMainAdditionalInfoTab().click();
    }

    @And("^User_608 clicks on the repayment plan tab under additional information tab$")
    public void user_clicks_on_the_repayment_plan_tab_under_additional_information_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.mainAdditionalInfoRepaymentTab_608());
    	iisParamObj608.mainAdditionalInfoRepaymentTab_608().click();
    }

    @And("^User_608 enter the value in number of payments under repayment plan tab$")
    public void user_enter_the_value_in_number_of_payments_under_repayment_plan_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.repaymentTabNoOfPaymentInput_608());
    	iisParamObj608.repaymentTabNoOfPaymentInput_608().clear();
//    	iisParamObj608.repaymentTabNoOfPaymentInput().sendKeys("1");
    	iisParamObj608.repaymentTabNoOfPaymentInput_608().sendKeys(testData.get("No of payment input"));
    	iisParamObj608.repaymentTabNoOfPaymentInput_608().sendKeys(Keys.TAB);
    }

    @And("^User_608 select the dropdown in number of payments under repayment plan tab$")
    public void user_select_the_dropdown_in_number_of_payments_under_repayment_plan_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.repaymentTabNoOfPaymentDropdown_608());
//    	dropDownHelper.SelectUsingVisibleText(iisParamObj608.repaymentTabNoOfPaymentDropdown(), "Nearest 1");
    	dropDownHelper.SelectUsingVisibleText(iisParamObj608.repaymentTabNoOfPaymentDropdown_608(), testData.get("No of Payment Select"));
    }
    
    @Then("^User_608 clicks save the button in maintanance under product class$")
    public void user_clicks_save_the_button_in_maintanance_under_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.productClassMainSaveBtn_608());
    	iisParamObj608.productClassMainSaveBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.confirmPopupOkBtn_608());
    	iisParamObj608.confirmPopupOkBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.successPopupOkBtn_608());
    	iisParamObj608.successPopupOkBtn_608().click();
    }
    
    
    
//  AT_RF_014_FMSCore
    @And("^User_608 clicks the limit details first row$")
    public void user_clicks_the_limit_details_first_row() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.limitDetailsFirstRow_608());
    	iisParamObj608.limitDetailsFirstRow_608().click();
    }

    @And("^User_608 clicks the repayment plan button under limit details tab$")
    public void user_clicks_the_repayment_plan_button_under_limit_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.limitDetailsRepaymentPlanBtn_608());
    	iisParamObj608.limitDetailsRepaymentPlanBtn_608().click();
    }
    
    @Then("^User_608 validate the Rounding factor dropdown$")
    public void user_validate_the_rounding_factor_dropdown() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(iisParamObj608.fmsRepaymentPlanRoundingfactorDropdown_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.fmsRepaymentPlanRoundingfactorDropdown_608());
    	String roundingfactorDropdown = iisParamObj608.fmsRepaymentPlanRoundingfactorDropdown_608().getText();
    	Assert.assertEquals(testData.get("No of Payment Select"), roundingfactorDropdown);
    }

    @Then("^User_608 validate the No of payments input$")
    public void user_validate_the_no_of_payments_input() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, iisParamObj608.fmsRepaymentPlanNoOfPaymentsInput_608());
    	String NoOfPaymentsInput = iisParamObj608.fmsRepaymentPlanNoOfPaymentsInput_608().getText();
    	Assert.assertEquals(testData.get("No of payment input"), NoOfPaymentsInput);
    }
	

}
