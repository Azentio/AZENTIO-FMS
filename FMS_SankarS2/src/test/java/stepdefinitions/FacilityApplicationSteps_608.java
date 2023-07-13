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
import io.cucumber.java.en.When;
import pageobjects.fms.ApplicationFinancialFacilityObj_608;
import pageobjects.fmsParam.FMSParamObj_608;
import resources.BaseClass;

public class FacilityApplicationSteps_608 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	ApplicationFinancialFacilityObj_608 applicationFinancialFacilityObj608 = new ApplicationFinancialFacilityObj_608(driver);
	FMSParamObj_608 fmsParamObj608 = new FMSParamObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FacilityApplicationTestData","DataSet ID");
	Map<String, String> testData;
	
	
//	FacilityApplication - Increase/Decrease feature
//	@AT_FAID_001
	@And("User_608 get the test data for test case AT_FAID_001")
	public void user_get_the_test_data_for_test_case_at_faid_001() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FAID_001");   
	}
	
	
	
	
	
	
	// Steps - @AT_FAID_001	
	@And("User_608 click Country limit module under Parameter in FMS Param")
	public void user_click_country_limit_module_under_parameter_in_fms_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitModule_608());
		fmsParamObj608.paramCountryLimitModule_608().click();
	}

	@And("User_608 click the Maintanance menu under Country limit in FMS Parameter")
	public void user_click_the_maintanance_menu_under_country_limit_in_fms_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitMaintananceMenu_608());
		fmsParamObj608.paramCountryLimitMaintananceMenu_608().click();
	}

	@And("User_608 enter the Country code in Maintanance under Country limit module")
	public void user_enter_the_country_code_in_maintanance_under_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitMainCountryCodeInput_608());
		fmsParamObj608.paramCountryLimitMainCountryCodeInput_608().sendKeys(testData.get("Country Code"),Keys.TAB);
		for (int i = 0; i <= 1000; i++) {
			try {
				if (!(fmsParamObj608.paramCountryLimitMainCountryCodeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 enter the Currency code in Maintanance under Country limit module")
	public void user_enter_the_currency_code_in_maintanance_under_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitMainCurrencyCodeInput_608());
		fmsParamObj608.paramCountryLimitMainCurrencyCodeInput_608().sendKeys(testData.get("Currency Code"),Keys.TAB);
		for (int i = 0; i <= 1000; i++) {
			try {
				if (!(fmsParamObj608.paramCountryLimitMainCurrencyCodeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	    
	}

	@And("User_608 enter the limit value in Maintanance under Country limit module")
	public void user_enter_the_limit_value_in_maintanance_under_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitMainLimitInput_608());
		fmsParamObj608.paramCountryLimitMainLimitInput_608().sendKeys(testData.get("Limit Value"),Keys.TAB);
		for (int i = 0; i <= 1000; i++) {
			try {
				if (!(fmsParamObj608.paramCountryLimitMainLimitInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    
	}

	@When("User_608 click the save button in Maintanance under Country limit module")
	public void user_click_the_save_button_in_maintanance_under_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitMainSaveBtn_608());
		fmsParamObj608.paramCountryLimitMainSaveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Approve menu under Country limit in FMS Parameter")
	public void user_click_the_approve_menu_under_country_limit_in_fms_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitApproveMenu_608());
		fmsParamObj608.paramCountryLimitApproveMenu_608().click();	    
	}

	@And("User_608 enter the Country code in searchgrid under Approve menu in Country limit module")
	public void user_enter_the_country_code_in_searchgrid_under_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitApproveSearchgridCountryCode_608());
//		fmsParamObj608.paramCountryLimitApproveSearchgridCountryCode_608().sendKeys("340",Keys.ENTER);
		fmsParamObj608.paramCountryLimitApproveSearchgridCountryCode_608().sendKeys(testData.get("Country Code"),Keys.ENTER);
	}

	@And("User_608 double click the first row in searchgrid under Approve menu in Country limit module")
	public void user_double_click_the_first_row_in_searchgrid_under_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitApproveMenuSearchgridFirstRow_608());
	    clicksAndActionsHelper.doubleClick(fmsParamObj608.paramCountryLimitApproveMenuSearchgridFirstRow_608());
	}

	@Then("User_608 validate the Available limit field is available under Approve menu in Country limit module")
	public void user_validate_the_available_limit_field_is_available_under_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitApproveMenuAvailableLimitInput_608());
		boolean availableLimitfield = fmsParamObj608.paramCountryLimitApproveMenuAvailableLimitInput_608().isDisplayed();
		Assert.assertTrue(availableLimitfield);
	}

	@When("User_608 click the Approve button under Approve menu in Country limit module")
	public void user_click_the_approve_button_under_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitApproveMenuApproveBtn_608());
		fmsParamObj608.paramCountryLimitApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	// close the approve tab
    	waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitApproveMenuCloseIcon_608());
    	for (int i = 0; i < 2000; i++) {
			try {
				fmsParamObj608.paramCountryLimitApproveMenuCloseIcon_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
	@And("User_608 click the Update After Approve menu under Country limit in FMS Parameter")
	public void user_click_the_update_after_approve_menu_under_country_limit_in_fms_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitUpdateAfterApproveMenu_608());
		fmsParamObj608.paramCountryLimitUpdateAfterApproveMenu_608().click();
	}

	@And("User_608 enter the Country code in searchgrid under Update After Approve menu in Country limit module")
	public void user_enter_the_country_code_in_searchgrid_under_update_after_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitUpdateAfterApproveSearchgridCountryCode_608());
		fmsParamObj608.paramCountryLimitUpdateAfterApproveSearchgridCountryCode_608().sendKeys(testData.get("Country Code"),Keys.ENTER);
	}

	@And("User_608 double click the first row in searchgrid under Update After Approve menu in Country limit module")
	public void user_double_click_the_first_row_in_searchgrid_under_update_after_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitUpdateAfterApproveSearchgridFirstRow_608());
	    clicksAndActionsHelper.doubleClick(fmsParamObj608.paramCountryLimitUpdateAfterApproveSearchgridFirstRow_608());
	}

	@And("User_608 update the negative limit value under Update After Approve menu in Country limit module")
	public void user_update_the_negative_limit_value_under_update_after_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuLimitInput_608());
		fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuLimitInput_608().clear();
		fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuLimitInput_608().sendKeys(testData.get("Negative Limit"),Keys.TAB);
	}

	@Then("User_608 validate Error message should be displayed under Update After Approve menu in Country limit module")
	public void user_validate_error_message_should_be_displayed_under_update_after_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.errorPopup_608());
		boolean errorPopup = fmsParamObj608.errorPopup_608().isDisplayed();
		Assert.assertTrue(errorPopup);	    
		for (int i = 0; i < 100; i++) {
			try {
				fmsParamObj608.errorPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 update the possitive limit value under Update After Approve menu in Country limit module")
	public void user_update_the_possitive_limit_value_under_update_after_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuLimitInput_608());
		fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuLimitInput_608().clear();
		fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuLimitInput_608().sendKeys(testData.get("Possitive Limit"),Keys.TAB);
		
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuLimitInput_608().getAttribute("prevvalue")
						.equals(testData.get("Possitive Limit")))) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@When("User_608 click the Update button under Update After Approve menu in Country limit module")
	public void user_click_the_update_button_under_update_after_approve_menu_in_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuUpdateBtn_608());
		fmsParamObj608.paramCountryLimitUpdateAfterApproveMenuUpdateBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());    	
    	for (int i = 0; i < 500; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_608 validate limit value should be updated in Approve menu under Country limit module")
	public void user_validate_limit_value_should_be_updated_in_approve_menu_under_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitApproveMenuLimitValueInput_608());
		String limitValue = fmsParamObj608.paramCountryLimitApproveMenuLimitValueInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("Possitive Limit"), limitValue);
	}

	@Then("User_608 validate Available limit should be updated in Approve menu under Country limit module")
	public void user_validate_available_limit_should_be_updated_in_approve_menu_under_country_limit_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.paramCountryLimitApproveMenuAvailableLimitInput_608());
		String availableLimit = fmsParamObj608.paramCountryLimitApproveMenuAvailableLimitInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("Possitive Limit"), availableLimit);
	}
	
	
	
//	AT_FAID_002_Param
	@And("User_608 check the General limit by CIF flag in update after approve menu under control records")
	public void user_check_the_general_limit_by_cif_flag_in_update_after_approve_menu_under_control_records() {
		waitHelper.waitForElementwithFluentwait(driver,	fmsParamObj608.controlRecordsUpdateAfterApproveGeneralLimitCIFFlag_608());
		WebElement GeneralLimitCIFFlag = fmsParamObj608.controlRecordsUpdateAfterApproveGeneralLimitCIFFlag_608();
		if(!(GeneralLimitCIFFlag.isSelected())) {
			GeneralLimitCIFFlag.click();
     	}
	}

	
}
