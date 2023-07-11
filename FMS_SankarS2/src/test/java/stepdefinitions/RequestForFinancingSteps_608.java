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
import pageobjects.fms.FacilitiesManagementObj_608;
import pageobjects.fmsParam.FMSParamObj_608;
import pageobjects.fmsParam.RequestForFinancingObj_608;
import resources.BaseClass;

public class RequestForFinancingSteps_608 {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	RequestForFinancingObj_608 requestForFinancingObj608 = new RequestForFinancingObj_608(driver);
	FacilitiesManagementObj_608 facilityManagementObj608 = new FacilitiesManagementObj_608(driver);
	ApplicationFinancialFacilityObj_608 applicationFinancialFacilityObj608 = new ApplicationFinancialFacilityObj_608(driver);
	FMSParamObj_608 fmsParamObj608 = new FMSParamObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"RequestForFinancingTestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"IIS_Param_TestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"DrawDownRequestTestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path, "CollateralManagementTestData", "DataSet ID");

	Map<String, String> testData;

//	@AT_FM_043
	@And("User_608 get the test data for test case AT_FM_043_FMSParam")
	public void user_get_the_test_data_for_test_case_at_fm__fms_param() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_043");
	}

	@And("User_608 get the test data for test case AT_FM_043_FMSCore")
	public void user_get_the_test_data_for_test_case_at_fm__fms_core() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_043");
	}

//  @AT_RF_098
	@And("^User get the test data for test case AT_RF_098$")
	public void User_VAK_get_the_test_data_for_test_case_AT_RF_098() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_098");
	}


//  @AT_RF_157
	@And("User_608 get the test data for test case AT_RF_157")
	public void get_the_test_data_for_test_case_at_rf_157() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_157");
	}

//	@AT_RF_158_Param
	@And("^User_608 get the test data for test case AT_RF_158_Param$")
	public void get_the_test_data_for_test_case_atrf158param() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS02_AT_RF_158");
	}

//	@AT_RF_158_Core
	@And("^User_608 get the test data for test case AT_RF_158_Core$")
	public void get_the_test_data_for_test_case_atrf158core() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_RF_158");
	}

//	@AT_DDR_025
	@And("^User_608 get the test data for test case AT_DDR_025$")
	public void get_the_test_data_for_test_case_AT_DDR_025() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_DDR_025");
	}

//	@AT_CM_043
	@And("^User_608 get the test data for test case AT_CM_043$")
	public void get_the_test_data_for_test_case_AT_CM_043() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_CM_043");
	}
	
//	@AT_CM_044
	@And("^User_608 get the test data for test case AT_CM_044$")
	public void get_the_test_data_for_test_case_AT_CM_044() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_CM_044");
	}
	
//	@AT_CM_045
	@And("^User_608 get the test data for test case AT_CM_045$")
	public void get_the_test_data_for_test_case_AT_CM_045() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_CM_045");
	}

////	@AT_FM_058
//	@And("User_608 get the test data for test case AT_FM_058")
//	public void user_get_the_test_data_for_test_case_AT_FM_058() throws Throwable {
//		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_058");
//	}

//	@AT_RF_014_IISParam
	@And("^User_608 get the test data for test case AT_RF_014_IISParam$")
	public void get_the_test_data_for_test_case_AT_RF_014iisparam() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_014");
	}

//	@AT_DDR_021
	@And("^User_608 get the test data for test case AT_DDR_021$")
	public void get_the_test_data_for_test_case_AT_DDR_021() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_DDR_021");
	}

//	@AT_RF_014
	@And("^User_608 clicks on the parameter feature in IIS Param application$")
	public void user_clicks_on_the_parameter_feature_in_iis_param_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.IISParameterFeature_608());
		requestForFinancingObj608.IISParameterFeature_608().click();
	}

	@And("^User_608 clicks on the product class module uder parameter feature$")
	public void user_clicks_on_the_product_class_module_uder_parameter_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.parameterProductClassModule_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.parameterProductClassModule_608());
		requestForFinancingObj608.parameterProductClassModule_608().click();
	}

	@And("^User_608 clicks on the maintanance screen under product class module$")
	public void user_clicks_on_the_maintanance_screen_under_product_class_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.productClassMaintanance_608());
		requestForFinancingObj608.productClassMaintanance_608().click();
	}

	@And("^User_608 clicks on the search button in maintanance under product class$")
	public void user_clicks_on_the_search_button_in_maintanance_under_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.productClassMainSearchBtn_608());
		requestForFinancingObj608.productClassMainSearchBtn_608().click();
	}

	@And("^User_608 enter the class code in maintanance under product class$")
	public void user_enter_the_class_code_in_maintanance_under_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.productClassMainSearchedRow_608());
//    	requestForFinancingObj608.productClassMainSearchClass().sendKeys("1");
		requestForFinancingObj608.productClassMainSearchClass_608().sendKeys(testData.get("Class"));
		requestForFinancingObj608.productClassMainSearchClass_608().sendKeys(Keys.ENTER);
	}

	@And("^User_608 double click on the retrived data in maitanance under product class$")
	public void user_double_click_on_the_retrived_data_in_maitanance_under_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.productClassMainSearchRowLabel_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.productClassMainSearchedRow_608());
	}

	@And("^User_608 clicks on the additional information tab in maitanance under product class$")
	public void user_clicks_on_the_additional_information_tab_in_maitanance_under_product_class() throws Throwable {
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.productClassMainAdditionalInfoTab_608().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
//    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.productClassMainAdditionalInfoTab());
//    	requestForFinancingObj608.productClassMainAdditionalInfoTab().click();
	}

	@And("^User_608 clicks on the repayment plan tab under additional information tab$")
	public void user_clicks_on_the_repayment_plan_tab_under_additional_information_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mainAdditionalInfoRepaymentTab_608());
		requestForFinancingObj608.mainAdditionalInfoRepaymentTab_608().click();
	}

	@And("^User_608 enter the value in number of payments under repayment plan tab$")
	public void user_enter_the_value_in_number_of_payments_under_repayment_plan_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.repaymentTabNoOfPaymentInput_608());
		requestForFinancingObj608.repaymentTabNoOfPaymentInput_608().clear();
//    	requestForFinancingObj608.repaymentTabNoOfPaymentInput().sendKeys("1");
		requestForFinancingObj608.repaymentTabNoOfPaymentInput_608().sendKeys(testData.get("No of payment input"));
		requestForFinancingObj608.repaymentTabNoOfPaymentInput_608().sendKeys(Keys.TAB);
	}

	@And("^User_608 select the dropdown in number of payments under repayment plan tab$")
	public void user_select_the_dropdown_in_number_of_payments_under_repayment_plan_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.repaymentTabNoOfPaymentDropdown_608());
//    	dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.repaymentTabNoOfPaymentDropdown(), "Nearest 1");
		dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.repaymentTabNoOfPaymentDropdown_608(),
				testData.get("No of Payment Select"));
	}

	@Then("^User_608 clicks save the button in maintanance under product class$")
	public void user_clicks_save_the_button_in_maintanance_under_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.productClassMainSaveBtn_608());
		requestForFinancingObj608.productClassMainSaveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.confirmPopupOkBtn_608());
		requestForFinancingObj608.confirmPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.successPopupOkBtn_608());
		requestForFinancingObj608.successPopupOkBtn_608().click();
	}

//  AT_RF_014_FMSCore
	@And("^User_608 clicks the limit details first row$")
	public void user_clicks_the_limit_details_first_row() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.limitDetailsFirstRow_608());
		requestForFinancingObj608.limitDetailsFirstRow_608().click();
	}

	@And("^User_608 clicks the repayment plan button under limit details tab$")
	public void user_clicks_the_repayment_plan_button_under_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.limitDetailsRepaymentPlanBtn_608());
		requestForFinancingObj608.limitDetailsRepaymentPlanBtn_608().click();
	}

	@Then("^User_608 validate the Rounding factor dropdown$")
	public void user_validate_the_rounding_factor_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.fmsRepaymentPlanRoundingfactorDropdown_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.fmsRepaymentPlanRoundingfactorDropdown_608());
		String roundingfactorDropdown = requestForFinancingObj608.fmsRepaymentPlanRoundingfactorDropdown_608()
				.getText();
		Assert.assertEquals(testData.get("No of Payment Select"), roundingfactorDropdown);
	}

	@Then("^User_608 validate the No of payments input$")
	public void user_validate_the_no_of_payments_input() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.fmsRepaymentPlanNoOfPaymentsInput_608());
		String NoOfPaymentsInput = requestForFinancingObj608.fmsRepaymentPlanNoOfPaymentsInput_608().getText();
		Assert.assertEquals(testData.get("No of payment input"), NoOfPaymentsInput);
	}

//  @AT_RF_024 -- FMS Param
	@And("^User_608 clicks on the Facility custom fields under Parameter$")
	public void user_clicks_on_the_facility_custom_fields_under_parameter() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.paramFacilityCustomFields_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.paramFacilityCustomFields_608());
		requestForFinancingObj608.paramFacilityCustomFields_608().click();
	}

	@And("^User_608 clicks on the Maintain facility custom fields under facility custom fields$")
	public void user_clicks_on_the_maintain_facility_custom_fields_under_facility_custom_fields() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.maintainFacilityCustomFields_608());
		requestForFinancingObj608.maintainFacilityCustomFields_608().click();
	}

	@And("^User_608 clicks on the Update after approve in Maintain facility custom fields$")
	public void user_clicks_on_the_update_after_approve_in_maintain_facility_custom_fields() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.maintainFacilityCustomUpdateAterApprove_608());
		requestForFinancingObj608.maintainFacilityCustomUpdateAterApprove_608().click();
	}

	@And("^User_608 double click on the one record under update after approve$")
	public void user_double_click_on_the_one_record_under_update_after_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.updateAfterApproveSearchResult_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.updateAfterApproveSearchResult_608());
	}

	@And("^User_608 validate Facility Custom Fields screen are available$")
	public void user_validate_facility_custom_fields_screen_are_available() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityCustomFieldsBox_608());
		boolean facilityCustomFieldsBox = requestForFinancingObj608.facilityCustomFieldsBox_608().isDisplayed();
		Assert.assertTrue(facilityCustomFieldsBox);
	}

//  @AT_RF_034_FMSParam
	@And("^User_608 uncheck the Issue Facility Offer flag$")
	public void user_uncheck_the_issue_facility_offer_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.issueFacilityOfferFlag_608());
		WebElement issueFacilityOfferFlag = fmsParamObj608.issueFacilityOfferFlag_608();
		if (issueFacilityOfferFlag.isSelected()) {
			issueFacilityOfferFlag.click();
		}
	}

	@And("^User_608 move to facility reports tab in update after approve$")
	public void user_move_to_facility_reports_tab_in_update_after_approve() throws Throwable {
		Thread.sleep(5000);
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityTypeFacilityReports_608());
		fmsParamObj608.facilityTypeFacilityReports_608().click();
	}

	@And("^User_608 clicks on the search option in issue facility offer under facility reports$")
	public void user_clicks_on_the_search_option_in_issue_facility_offer_under_facility_reports() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(fmsParamObj608.facilityReportsIssueFacilityOfferLookup_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				fmsParamObj608.facilityReportsIssueFacilityOfferLookup_608());
		fmsParamObj608.facilityReportsIssueFacilityOfferLookup_608().click();
	}

	@And("^User_608 double click on any one retrived data$")
	public void user_double_click_on_any_one_retrived_data() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsParamObj608.facilityReportsIssueFacilityOfferLookupData_608());
		clicksAndActionsHelper.doubleClick(fmsParamObj608.facilityReportsIssueFacilityOfferLookupData_608());
	}

	@And("^User_608 check the auto print flag under issue facility offer$")
	public void user_check_the_auto_print_flag_under_issue_facility_offer() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsParamObj608.facilityReportsIssueFacilityOfferAutoPrintFlag_608());
		WebElement autoPrintFlag = fmsParamObj608.facilityReportsIssueFacilityOfferAutoPrintFlag_608();
		if (!(autoPrintFlag.isSelected())) {
			autoPrintFlag.click();
		}
	}

//  @AT_RF_034_FMSCore
	@And("^User_608 clicks the issue facility offer under WIFAK Application$")
	public void user_clicks_the_issue_facility_offer_under_wifak_application() throws Throwable {
//    	System.out.println("Ref No: "+refID);
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.WIFAKAppIssueFacilityOffer_608());
		requestForFinancingObj608.WIFAKAppIssueFacilityOffer_608().click();
	}

	@And("^User_608 double click on the retrived data$")
	public void user_double_click_on_the_retrived_data() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.issueFacilityOfferSearchResult_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.issueFacilityOfferSearchResult_608());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.issueFacilityOfferCode_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@When("^User_608 clicks on the issue offer button under issue facility offer$")
	public void user_clicks_on_the_issue_offer_button_under_issue_facility_offer() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.issueFacilityOfferIssueOfferBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,requestForFinancingObj608.issueFacilityOfferIssueOfferBtn_608());
		requestForFinancingObj608.issueFacilityOfferIssueOfferBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
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

//  @AT_RF_035
	@And("^User_608 clicks on the the mortgage management module$")
	public void user_clicks_on_the_the_mortgage_management_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.arabicMortgageManagementModule_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.arabicMortgageManagementModule_608());
		requestForFinancingObj608.arabicMortgageManagementModule_608().click();
	}

	@And("^User_608 clicks on the Maintanance screen under mortgage management module$")
	public void user_clicks_on_the_maintanance_screen_under_mortgage_management_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mortgageManagementMain_608());
		requestForFinancingObj608.mortgageManagementMain_608().click();
	}

	@And("^User_608 verify the Maintanance screen should be arabic language$")
	public void user_verify_the_maintanance_screen_should_be_arabic_language() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mortgageManagementMainLabel_608());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.mortgageManagementMainEnd_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mortgageManagementMainEnd_608());
		String saveBtnText = requestForFinancingObj608.mortgageManagementMainEnd_608().getText();
//    	System.out.println("Text :"+saveBtnText);
		Assert.assertEquals(saveBtnText, "حفظ");
	}

//  @AT_RF_040  
	@Then("^User_608 validate the visibility of Account No input box in limit details$")
	public void user_validate_the_visibility_of_account_no_input_box_in_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.limitDetailsAccNoInput_608());
		boolean accNoDisplayed = requestForFinancingObj608.limitDetailsAccNoInput_608().isDisplayed();
		Assert.assertEquals(true, accNoDisplayed);
	}

	@Then("^User_608 validate the visibility of Fund Transfer rate input box in limit details$")
	public void user_validate_the_visibility_of_fund_transfer_rate_input_box_in_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.limitDetailsFundTransferRateInput_608());
		boolean fundtransferdisplayed = requestForFinancingObj608.limitDetailsFundTransferRateInput_608().isDisplayed();
		Assert.assertEquals(true, fundtransferdisplayed);
	}

//  @AT_RF_098_User_VAK
	@And("^User_VAK clicks on the WIFAK_Application first link$")
	public void User_VAK_clicks_on_the_wifakapplication_first_link() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.wifakApplicationFirst_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakApplicationFirst_608());
		applicationFinancialFacilityObj608.wifakApplicationFirst_608().click();
	}

	@And("^User_VAK clicks on the WIFAK_Application second link$")
	public void User_VAK_clicks_on_the_wifakapplication_second_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialFacilityObj608.wifakApplicationSecond_608());
		applicationFinancialFacilityObj608.wifakApplicationSecond_608().click();
	}

	@And("^User_VAK clicks on the approval committe recommedation menu$")
	public void User_VAK_clicks_on_the_approval_committe_recommedation_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApprovalCommitteeRecommendationsMenu_608());
		requestForFinancingObj608.wifakApprovalCommitteeRecommendationsMenu_608().click();
	}

	@And("^User_VAK clicks on the clear button in approval committe recommedations menu$")
	public void User_VAK_clicks_on_the_clear_button_in_approval_committe_recommedations_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApprovalCommitteeClearBtn());
		requestForFinancingObj608.wifakApprovalCommitteeClearBtn().click();
	}

	@And("^User_VAK double click on the any one record in approval committe recommedations menu$")
	public void User_VAK_double_click_on_the_any_one_record_in_approval_committe_recommedations_menu()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApprovalCommitteeSelectRow());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.wifakApprovalCommitteeSelectRow());
	}

	@And("^User_VAK clicks on the Recommend button in approval committe recommedations menu$")
	public void User_VAK_clicks_on_the_recommend_button_in_approval_committe_recommedations_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApprovalCommitteeRecommendationsCode());
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(
						requestForFinancingObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608());
		requestForFinancingObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
		applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();

	}

	@And("^User_VAK click the User_VAK recommended by name in recommend box$")
	public void User_VAK_click_the_User_VAK_recommended_by_name_in_recommend_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.wifakApprovalCommitteeRecommendByLabel_VAK());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApprovalCommitteeRecommendByLabel_VAK());
		requestForFinancingObj608.wifakApprovalCommitteeRecommendByLabel_VAK().click();
	}

	@And("^User_VAK select the recommendation as approve in recommend box$")
	public void User_VAK_select_the_recommendation_as_approve_in_recommend_box() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApprovalCommitteeRecommendationDropdown_608());
		dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.wifakApprovalCommitteeRecommendationDropdown_608(),
				testData.get("Recommendation"));
	}

	@And("^User_VAK enter the comment code in recommend box$")
	public void User_VAK_enter_the_comment_code_in_recommend_box() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakapprovalCommitteeCommentCodeInput_608());
		requestForFinancingObj608.wifakapprovalCommitteeCommentCodeInput_608().sendKeys(testData.get("Comment Code"),Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.wifakapprovalCommitteeCommentCodeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_VAK clicks the more comments button in recommend box$")
	public void User_VAK_clicks_the_more_comments_button_in_recommend_box() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApprovalCommitteeMoreCommentsBtn_608());
		requestForFinancingObj608.wifakApprovalCommitteeMoreCommentsBtn_608().click();
	}

	@And("^User_VAK enter the some comments in more comments$")
	public void User_VAK_enter_the_some_comments_in_more_comments() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApprovalCommitteeMoreCommentsInput_608());
		requestForFinancingObj608.wifakApprovalCommitteeMoreCommentsInput_608().sendKeys(testData.get("More Comments"));
	}

	@And("^User_VAK click the Ok button in more comments$")
	public void User_VAK_click_the_ok_button_in_more_comments() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				requestForFinancingObj608.wifakApprovalCommitteeMoreCommentsOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@When("^User_VAK click the Ok button and get the reference code in recommend box$")
	public void User_VAK_click_the_ok_button_and_get_the_reference_code_in_recommend_box() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				requestForFinancingObj608.wifakApprovalCommitteeOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.successPopup_608());
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.successPopupMessage_608());
		String SuccessMsg = applicationFinancialFacilityObj608.successPopupMessage_608().getText().substring(23, 27);
		fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"), "Reference Code", SuccessMsg);

		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
	}

//  @AT_RF_098_User_608
	@And("^User_608 clicks on the search button in Application for financial facility main screen$")
	public void user_clicks_on_the_search_button_in_application_for_financial_facility_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.applicationFinancialFacilitySearchBtn_608());
		requestForFinancingObj608.applicationFinancialFacilitySearchBtn_608().click();
	}

	@And("^User_608 enter the reference code in Application for financial facility main screen$")
	public void user_enter_the_reference_code_in_application_for_financial_facility_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialFacilityObj608.applicationFinancialFacilitySearchCode_608());
		applicationFinancialFacilityObj608.applicationFinancialFacilitySearchCode_608()
				.sendKeys(testData.get("Reference Code"), Keys.ENTER);
	}

	@And("^User_608 double click searched record in Application for financial facility main screen$")
	public void user_double_click_searched_record_in_application_for_financial_facility_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialFacilityObj608.applicationFinancialFacilitySearchResult_608());
		clicksAndActionsHelper
				.doubleClick(applicationFinancialFacilityObj608.applicationFinancialFacilitySearchResult_608());
	}

	@And("^User_608 clicks on the Approval committee button$")
	public void user_clicks_on_the_approval_committee_button() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(
						requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeBtn_608());
		requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeBtn_608().click();
	}

	@And("^User_608 click the User1 name in Recommented by column$")
	public void user_click_the_user1_name_in_recommented_by_column() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeRecommendByLabel_608());
		requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeRecommendByLabel_608().click();
	}

	@And("^User_608 clicks on the more comments button$")
	public void user_clicks_on_the_more_comments_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeMoreCommentsBtn_608());
		requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeMoreCommentsBtn_608().click();
	}

	@Then("^User_608 validate the more comments text in input field$")
	public void user_validate_the_more_comments_text_in_input_field() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeMoreCommentsText_608());
		String text = requestForFinancingObj608.applicationFinancialFacilityApprovalCommittieeMoreCommentsText_608()
				.getAttribute("prevvalue");
		System.out.println("More Comments Text: " + text);
		Assert.assertEquals(testData.get("More Comments"), text);
	}

//  @AT_RF_099
	@And("^User_608 clicks the Application Requirements Details option$")
	public void user_clicks_the_application_requirements_details_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.applicationReqDetails_608());
		fmsParamObj608.applicationReqDetails_608().click();
	}

	@And("^User_608 validate visibility of Collateral details button under limit details tab$")
	public void user_validate_visibility_of_collateral_details_button_under_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialFacilityObj608.limitDetailsCollateralDetailsBtn_608());
		boolean collateralDetailsBtn = applicationFinancialFacilityObj608.limitDetailsCollateralDetailsBtn_608()
				.isDisplayed();
		Assert.assertTrue(collateralDetailsBtn);
	}

//  @AT_RF_157
	@And("^User_608 clicks on the Draw Down request module under WIFAK Application$")
	public void user_clicks_on_the_draw_down_request_module_under_WIFAK_Application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApplicationDrawDownRequest_608());
		requestForFinancingObj608.wifakApplicationDrawDownRequest_608().click();
	}

	@And("^User_608 clicks on the Maintanance under Draw Down request in WIFAK Application$")
	public void user_clicks_on_the_maintanance_under_draw_down_request_in_WIFAK_Application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawDownRequestMaintanance_608());
		requestForFinancingObj608.drawDownRequestMaintanance_608().click();
	}

	@And("^User_608 enter the Facility Reference in main screen under WIFAK Draw Down request$")
	public void user_enter_the_facility_reference_in_main_screen_under_WIFAK_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainFacilityRef_608());
//    	requestForFinancingObj608.drawdownMainFacilityRef().sendKeys("1469",Keys.TAB);
		requestForFinancingObj608.drawdownMainFacilityRef_608().sendKeys(testData.get("Facility Ref"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.drawdownMainDateSubmitted_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

//    	try {
//    		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownPostApprovalYesBtn());
//        	requestForFinancingObj608.drawdownPostApprovalYesBtn().click();
//        	for(int i = 0; i <= 500; i++) {
//        		try {
//    				if(!(requestForFinancingObj608.drawdownMainDateSubmitted().getAttribute("prevvalue").isBlank())) {
//    					break;
//    				}
//    			} catch (Exception e) {
//    				// TODO: handle exception
//    			}
//        	}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

	}

	@And("^User_608 select the draw down type in main screen under Draw Down request$")
	public void user_select_the_draw_down_type_in_main_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainDrawDownTypeLookup_608());
		requestForFinancingObj608.drawdownMainDrawDownTypeLookup_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainDrawdownTypeValue_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.drawdownMainDrawdownTypeValue_608());
	}

	@And("^User_608 enter the Description in main screen under Draw Down request$")
	public void user_enter_the_description_in_main_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainDescription_608());
//    	requestForFinancingObj608.drawdownMainDescription().sendKeys("Test");
		requestForFinancingObj608.drawdownMainDescription_608().sendKeys(testData.get("Description"));
	}

	@And("User_608 click on the draw down additional details tab")
	public void user_click_on_the_draw_down_additional_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownAdditionalDetailsTab_608());
		requestForFinancingObj608.drawdownAdditionalDetailsTab_608().click();
	}

	@And("^User_608 select the product class in additional screen under Draw Down request$")
	public void user_select_the_product_class_in_additional_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.drawdownAdditionalProductClassLookup_608());
		requestForFinancingObj608.drawdownAdditionalProductClassLookup_608().click();

		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.drawdownAdditionalProductClassCode_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.drawdownAdditionalProductClassCode_608());

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.drawdownAdditionalProductClass_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_608 give the FC Amount in additional screen under Draw Down request$")
	public void user_give_the_fc_amount_in_additional_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownAdditionalFCAmount_608());
		requestForFinancingObj608.drawdownAdditionalFCAmount_608().clear();
//    	requestForFinancingObj608.drawdownAdditionalFCAmount().sendKeys("500",Keys.TAB);
		requestForFinancingObj608.drawdownAdditionalFCAmount_608().sendKeys(testData.get("FC Amount"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.drawdownAdditionalFCAmount_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_608 enter the value date in main screen under Draw Down request$")
	public void user_enter_the_value_date_in_main_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainInfoTab_608());
		requestForFinancingObj608.drawdownMainInfoTab_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainValueDate_608());
//    	requestForFinancingObj608.drawdownMainValueDate().sendKeys("05/01/2024",Keys.TAB);
		requestForFinancingObj608.drawdownMainValueDate_608().sendKeys(testData.get("Value Date"), Keys.TAB);
	}

	@When("^User_608 click the save button under in maintanance under Draw Down request$")
	public void user_click_the_save_button_under_in_maintanance_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainSaveBtn_608());
		requestForFinancingObj608.drawdownMainSaveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
		applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();

		// Post Approval popup
//    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownPostApprovalYesBtn_608());
//    	requestForFinancingObj608.drawdownPostApprovalYesBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();

		// Send Alert popup
		for (int i = 0; i < 2000; i++) {
			try {
				requestForFinancingObj608.drawdownMainSendAlertPopupClose_608().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_608 click on the Verify link under Draw Down request")
	public void user_click_on_the_verify_link_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawDownRequestVerify_608());
		requestForFinancingObj608.drawDownRequestVerify_608().click();
	}

	@And("User_608 click on the clear button in verify under Draw Down request")
	public void user_click_on_the_clear_button_in_verify_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownVerifyClearBtn_608());
		requestForFinancingObj608.drawdownVerifyClearBtn_608().click();
	}

	@And("User_608 double click on the code in verify under Draw Down request")
	public void user_double_click_on_the_code_in_verify_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownVerifyCode_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.drawdownVerifyCode_608());
	}

	@When("User_608 click on the verify button in Verify link under Draw Down request")
	public void user_click_on_the_verify_button_in_verify_link_under_draw_down_request() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.drawDownRequestVerifyBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawDownRequestVerifyBtn_608());
		requestForFinancingObj608.drawDownRequestVerifyBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
		applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();

		// Post Approval popup
//    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownPostApprovalYesBtn());
//    	requestForFinancingObj608.drawdownPostApprovalYesBtn().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();

		// Send Alert popup
		for (int i = 0; i < 2000; i++) {
			try {
				requestForFinancingObj608.drawdownVerifySendAlertPopup_608().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_608 click on the Approve link under Draw Down request")
	public void user_click_on_the_approve_link_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawDownRequestApprove_608());
		requestForFinancingObj608.drawDownRequestApprove_608().click();
	}

	@And("User_608 click on the clear button in Approve under Draw Down request")
	public void user_click_on_the_clear_button_in_approve_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownApproveClearBtn_608());
		requestForFinancingObj608.drawdownApproveClearBtn_608().click();
	}

	@And("User_608 double click on the code in Approve under Draw Down request")
	public void user_double_click_on_the_code_in_approve_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownApproveCode_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.drawdownApproveCode_608());
	}

	@When("User_608 click on the Approve button in Approve link under Draw Down request")
	public void user_click_on_the_approve_button_in_approve_link_under_draw_down_request() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.drawDownRequestApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawDownRequestApproveBtn_608());
		requestForFinancingObj608.drawDownRequestApproveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
		applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();

		// Post Approval pop-up
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownPostApprovalYesBtn_608());
		requestForFinancingObj608.drawdownPostApprovalYesBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();

	}

	@Then("User_608 again clicks on the Maintanance under Draw Down request")
	public void user_again_clicks_on_the_maintanance_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawDownRequestMaintanance_608());
		requestForFinancingObj608.drawDownRequestMaintanance_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
		applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
	}

	@And("User_608 clicks on the search button in main screen under Draw Down request")
	public void user_clicks_on_the_search_button_in_main_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainSearchBtn_608());
		requestForFinancingObj608.drawdownMainSearchBtn_608().click();
	}

	@And("User_608 click the clear button in main screen under Draw Down request")
	public void user_click_the_clear_button_in_main_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainClearBtn_608());
		requestForFinancingObj608.drawdownMainClearBtn_608().click();
	}

	@And("User_608 double click on the first line code in main screen under Draw Down request")
	public void user_double_click_on_the_first_line_code_in_main_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainCode_608());
		requestForFinancingObj608.drawdownMainCode_608().click();
	}

	@And("User_608 click on the Status Details button in main screen under Draw Down request")
	public void user_click_on_the_status_details_button_in_main_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainStatusDetailsBtn_608());
		requestForFinancingObj608.drawdownMainStatusDetailsBtn_608().click();
	}

	@And("User_608 verify the Status Details tab User Name in main screen under Draw Down request")
	public void user_verify_the_status_details_tab_user_name_in_main_screen_under_draw_down_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainStatusDetailsTab_608());
		String userName = requestForFinancingObj608.drawdownMainStatusDetailsUserName_608().getAttribute("title");
		System.out.println("User_608 Name: " + userName);
	}

	@Then("User_608 clicks on the Facility Closure Request module")
	public void user_clicks_on_the_facility_closure_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.wifakApplicationFacilityClosureRequest_608());
		requestForFinancingObj608.wifakApplicationFacilityClosureRequest_608().click();
	}

	@And("User_608 click on the Maintanance under Facility Closure Request module")
	public void user_click_on_the_maintanance_under_facility_closure_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.facilityClosureRequestMaintanance_608());
		requestForFinancingObj608.facilityClosureRequestMaintanance_608().click();
	}

	@And("User_608 enter the Facility ref in main screen under Facility Closure Request")
	public void user_enter_the_facility_ref_in_main_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityClosureMainFacilityRef_608());
		requestForFinancingObj608.facilityClosureMainFacilityRef_608().sendKeys("1336", Keys.TAB);
	}

	@And("User_608 enter the Closure reason in main screen under Facility Closure Request")
	public void user_enter_the_closure_reason_in_main_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.facilityClosureMainClosureReason_608());
		requestForFinancingObj608.facilityClosureMainClosureReason_608().sendKeys("test");
	}

	@And("User_608 click on the Save button in main screen under Facility Closure Request")
	public void user_click_on_the_save_button_in_main_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityClosureMainSaveBtn_608());
		requestForFinancingObj608.facilityClosureMainSaveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
		applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.facilityClosureMainSendAlertPopup_608());
		requestForFinancingObj608.facilityClosureMainSendAlertPopup_608().click();
	}

	@Then("User_608 clicks on the Approve under Facility Closure Request module")
	public void user_clicks_on_the_approve_under_facility_closure_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityClosureRequestApprove_608());
		requestForFinancingObj608.facilityClosureRequestApprove_608().click();
	}

	@And("User_608 click on the clear button in approve screen under Facility Closure Request")
	public void user_click_on_the_clear_button_in_approve_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityClosureApproveClearBtn_608());
		requestForFinancingObj608.facilityClosureApproveClearBtn_608().click();
	}

	@And("User_608 double click on the code in approve screen under Facility Closure Request")
	public void user_double_click_on_the_code_in_approve_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityClosureApproveCode_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.facilityClosureApproveCode_608());
	}

	@When("User_608 click on the Approve button in approve screen under Facility Closure Request")
	public void user_click_on_the_approve_button_in_approve_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityClosureApproveBtn_608());
		requestForFinancingObj608.facilityClosureApproveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
		applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
	}

	@Then("User_608 again click the Maintanance under Facility Closure Request module")
	public void user_again_click_the_maintanance_under_facility_closure_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.facilityClosureRequestMaintanance_608());
		requestForFinancingObj608.facilityClosureRequestMaintanance_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
		applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
	}

	@And("User_608 click on the search button in main screen under Facility Closure Request")
	public void user_click_on_the_search_button_in_main_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityClosureMainSearchBtn_608());
		requestForFinancingObj608.facilityClosureMainSearchBtn_608().click();

	}

	@And("User_608 double click on the code in main screen under Facility Closure Request")
	public void user_double_click_on_the_code_in_main_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityClosureMainCode_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.facilityClosureMainCode_608());

	}

	@And("User_608 click the Status details button in main screen under Facility Closure Request")
	public void user_click_the_status_details_button_in_main_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.facilityClosureMainStatusDetailsBtn_608());
		requestForFinancingObj608.facilityClosureMainStatusDetailsBtn_608().click();

	}

	@Then("User_608 verify the Status details tab in main screen under Facility Closure Request")
	public void user_verify_the_status_details_tab_in_main_screen_under_facility_closure_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.facilityClosureMainStatusDetailsTab_608());
		requestForFinancingObj608.facilityClosureMainStatusDetailsTab_608().click();

	}

//	@AT_RF_141
	@And("User_608 clicks on the Request module")
	public void user_clicks_on_the_request_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.FMSCoreRequestModule_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.FMSCoreRequestModule_608());
		requestForFinancingObj608.FMSCoreRequestModule_608().click();
	}

	@And("User_608 clicks on the Request Financing under Request module")
	public void user_clicks_on_the_request_financing_under_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestFinancingFeature_608());
		requestForFinancingObj608.requestFinancingFeature_608().click();
	}

	@And("User_608 clicks on the Request for Financing under Request Financing feature")
	public void user_clicks_on_the_request_for_financing_under_request_financing_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingFeature_608());
		requestForFinancingObj608.requestForFinancingFeature_608().click();
	}

	@And("User_608 clicks on the Maintanance screen under Request for Financing")
	public void user_clicks_on_the_maintanance_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMaintanance_608());
		requestForFinancingObj608.requestForFinancingMaintanance_608().click();
	}

	@And("User_608 click the search button under the maintanance screen in Request for Financing")
	public void user_click_the_search_button_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMaintananceSearchBtn_608());
		requestForFinancingObj608.requestForFinancingMaintananceSearchBtn_608().click();
	}

	@And("User_608 click the clear button under the maintanance screen in Request for Financing")
	public void user_click_the_clear_button_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMaintananceClearBtn_608());
		requestForFinancingObj608.requestForFinancingMaintananceClearBtn_608().click();
	}

	@Then("User_608 validate the CIF short Name available under the maintanance screen in Request for Financing")
	public void user_validate_the_cif_short_name_available_under_the_maintanance_screen_in_request_for_financing()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainCIFShortNameTitle_608());
		boolean shortNameTitle = requestForFinancingObj608.requestForFinancingMainCIFShortNameTitle_608().isDisplayed();
		Assert.assertEquals(true, shortNameTitle);

		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainCIFShortNameValue_608());
		boolean shortNameValue = requestForFinancingObj608.requestForFinancingMainCIFShortNameValue_608().isDisplayed();
		Assert.assertEquals(true, shortNameValue);

	}

	@And("User_608 validate the CIF long Name available under the maintanance screen in Request for Financing")
	public void user_validate_the_cif_long_name_available_under_the_maintanance_screen_in_request_for_financing()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainCIFLongNameTitle_608());
		boolean longNameTitle = requestForFinancingObj608.requestForFinancingMainCIFLongNameTitle_608().isDisplayed();
		Assert.assertEquals(true, longNameTitle);

		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainCIFLongNameValue_608());
		boolean longNameValue = requestForFinancingObj608.requestForFinancingMainCIFLongNameValue_608().isDisplayed();
		Assert.assertEquals(true, longNameValue);
	}

//	@AT_RF_141_arabic
	@And("^User_608 click on the language option in FMS core$")
	public void user_click_on_the_language_option_in_fms_core() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.FMSCoreLanguageBtn_608());
		requestForFinancingObj608.FMSCoreLanguageBtn_608().click();
	}

	@And("^User_608 click on the arabic under language option$")
	public void user_click_on_the_arabic_under_language_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.arabicLanguage_608());
		requestForFinancingObj608.arabicLanguage_608().click();
	}

	@And("User_608 clicks on the Funding Request module in arabic")
	public void user_clicks_on_the_funding_request_module_in_arabic() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.arabicFundingRequest_608());
		requestForFinancingObj608.arabicFundingRequest_608().click();
	}

	@And("User_608 clicks on the Request under Funding Request")
	public void user_clicks_on_the_request_under_funding_request() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.arabicRequest_608());
		requestForFinancingObj608.arabicRequest_608().click();
	}

	@And("User_608 clicks on the Funding Request in Request under Funding Request")
	public void user_clicks_on_the_funding_request_in_request_under_funding_request() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.arabicRequestFundingRequest_608());
		requestForFinancingObj608.arabicRequestFundingRequest_608().click();
	}

	@And("User_608 click the approval committee under Funding Request in Request")
	public void user_click_the_approval_committee_under_funding_request_in_request() {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.arabicFundingRequestApprovalCommittee_608());
		requestForFinancingObj608.arabicFundingRequestApprovalCommittee_608().click();
	}

	@Then("User_608 validate the search grid value are displayed in arbic language under approval committee")
	public void user_validate_the_search_grid_value_are_displayed_in_arbic_language_under_approval_committee() {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.arabicApprovalCommitteeSearchGrid_608());
		boolean approvalCommittee = requestForFinancingObj608.arabicApprovalCommitteeSearchGrid_608().isDisplayed();
		Assert.assertEquals(true, approvalCommittee);
	}

//	@AT_FM_043_FMSParam
//	@And("User_608 uncheck the Committee Approval flag")
//	public void user_uncheck_the_committee_approval_flag() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.committeeApprovalFlag_608());
//		WebElement committeeApprovalFlag = fmsParamObj608.committeeApprovalFlag_608();
//		if (committeeApprovalFlag.isSelected()) {
//			committeeApprovalFlag.click();
//		}
//	}

	@And("User_608 select the member as atleast one under Committee approval flag")
	public void user_select_the_member_as_atleast_one_under_committee_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.committeeApprovalFlagMemberDropdown_608());
		dropDownHelper.SelectUsingVisibleText(fmsParamObj608.committeeApprovalFlagMemberDropdown_608(),
				testData.get("Committee Member"));
	}

//	@AT_FM_043_FMSCore	
	@And("User_608 select the Reason for submission under main screen in Request for Financing")
	public void user_select_the_reason_for_submission_under_main_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainReasonForDropdown_608());
		dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.requestForFinancingMainReasonForDropdown_608(),
				testData.get("Reason For Submission"));
	}

	@And("User_608 enter the CIF no in main screen under Request for Financing")
	public void user_enter_the_cif_no_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainCustomerInput_608());
		requestForFinancingObj608.requestForFinancingMainCustomerInput_608().sendKeys(testData.get("Customer CIF"),
				Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.requestForFinancingMainShortNameInput_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 enter the facility type in main screen under Request for Financing")
	public void user_enter_the_facility_type_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainFacilityTypeInput_608());
		requestForFinancingObj608.requestForFinancingMainFacilityTypeInput_608().sendKeys(testData.get("Facility Type"),
				Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.requestForFinancingMainCYInput_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 enter the total limit in main screen under Request for Financing")
	public void user_enter_the_total_limit_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainTotalLimitInput_608());
		requestForFinancingObj608.requestForFinancingMainTotalLimitInput_608().sendKeys(testData.get("Total Limit"),
				Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.requestForFinancingMainTotalLimitInput_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 move to the sublimit tab in main screen under Request for Financing")
	public void user_move_to_the_sublimit_tab_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainSublimitTab_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTab_608().click();
	}

	@And("User_608 click the add new button in sublimit tab under main screen in Request for Financing")
	public void user_click_the_add_new_button_in_sublimit_tab_under_main_screen_in_request_for_financing()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewBtn_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewBtn_608().click();
	}

	@And("User_608 enter the product class in limit details tab under sublimit tab")
	public void user_enter_the_product_class_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainSublimitTabProductClassInput_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTabProductClassInput_608()
				.sendKeys(testData.get("Product Class"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.requestForFinancingMainSublimitTabProductClassLabel_608()
						.getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 enter the margin value in limit details tab under sublimit tab")
	public void user_enter_the_margin_value_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewMarginInput_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewMarginInput_608().clear();
		requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewMarginInput_608()
				.sendKeys(testData.get("Margin Value"), Keys.TAB);
	}

	@And("User_608 click the add button in limit details tab under sublimit tab")
	public void user_click_the_add_button_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper
						.scrollIntoView(requestForFinancingObj608.requestForFinancingMainSublimitTabAddBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainSublimitTabAddBtn_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTabAddBtn_608().click();
	}

	@When("User_608 click the Save button in main screen under Request for Financing")
	public void user_click_the_save_button_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainSaveBtn_608());
		requestForFinancingObj608.requestForFinancingMainSaveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonConfirmOk_608());
		requestForFinancingObj608.ButtonConfirmOk_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonSuccessOk_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.ButtonSuccessOk_608().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 click the Validate button in main screen Request for Financing")
	public void user_click_the_validate_button_in_main_screen_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainValidateBtn_608());
		requestForFinancingObj608.requestForFinancingMainValidateBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonConfirmOk_608());
		requestForFinancingObj608.ButtonConfirmOk_608().click();

		// Facility already created pop-up
		for (int i = 0; i < 2000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						requestForFinancingObj608.facilityAlreadyCreatedPopupOkBtn_608());
				requestForFinancingObj608.facilityAlreadyCreatedPopupOkBtn_608().click();
				break;
			} catch (Exception e) {

			}
		}
//    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.confirmPopup_608());
//    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityAlreadyCreatedPopupOkBtn_608());
//    	requestForFinancingObj608.facilityAlreadyCreatedPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.successPopup_608());
		String RequestID = requestForFinancingObj608.successPopupMsg_608().getText().substring(10, 14);
		System.err.println("Reference Number: " + RequestID);
		fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"), "Request Code", RequestID);

		for (int j = 0; j < 2000; j++) {
			try {
				requestForFinancingObj608.ButtonSuccessOk_608().click();
				break;
			} catch (Exception e) {
				if (j == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// close the send alert pop-up box
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.RequestSendAlertPopup_608());
		for (int k = 0; k < 2000; k++) {
			try {
				requestForFinancingObj608.requestSendAlertPopupDismissBtn_608().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("User_608 click the approve level1 under Request for Financing")
	public void user_click_the_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingApproveLevel1_608());
		requestForFinancingObj608.requestForFinancingApproveLevel1_608().click();
	}

	@And("User_608 enter the request code in approve level1 under Request for Financing")
	public void user_enter_the_request_code_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingApproveLevel1Code_608());
		requestForFinancingObj608.requestForFinancingApproveLevel1Code_608().sendKeys(testData.get("Request Code"),
				Keys.ENTER);
	}

	@And("User_608 double click on the first row in approve level1 under Request for Financing")
	public void user_double_click_on_the_first_row_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingApproveLevel1FirstRow_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.requestForFinancingApproveLevel1FirstRow_608());
	}

	@And("User_608 move to customer grading tab in approve level1 under Request for Financing")
	public void user_move_to_customer_grading_tab_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approveLevel1CustomerGradingTab_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.approveLevel1CustomerGradingTab_608().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 select the approve level1 recommendation decision as forward in approve level1 under Request for Financing")
	public void user_select_the_approve_level1_recommendation_decision_as_forward_in_approve_level1_under_request_for_financing()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper
						.scrollIntoView(requestForFinancingObj608.approveLevel1CustomerGradingApproveDecision_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		dropDownHelper.SelectUsingVisibleText(
				requestForFinancingObj608.approveLevel1CustomerGradingApproveDecision_608(),
				testData.get("Approve1 Decision"));
	}

	@And("User_608 select the decision forward to as approval committee in approve level1 under Request for Financing")
	public void user_select_the_decision_forward_to_as_approval_committee_in_approve_level1_under_request_for_financing()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approveLevel1CustomerGradingApproveForwardTo_608());
		dropDownHelper.SelectUsingVisibleText(
				requestForFinancingObj608.approveLevel1CustomerGradingApproveForwardTo_608(),
				testData.get("Decision Forward To"));
	}

	@And("User_608 select the approval committee in approve level1 under Request for Financing")
	public void user_select_the_approval_committee_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approveLevel1CustomerGradingApproveCommittee_608());
		dropDownHelper.SelectUsingVisibleText(
				requestForFinancingObj608.approveLevel1CustomerGradingApproveCommittee_608(),
				testData.get("Approval Committee"));

	}

	@And("User_608 click the Approve button in approve level1 under Request for Financing")
	public void user_click_the_approve_button_in_approve_level1_under_request_for_financing() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper
						.scrollIntoView(requestForFinancingObj608.requestForFinancingApproveLevel1ApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingApproveLevel1ApproveBtn_608());
		requestForFinancingObj608.requestForFinancingApproveLevel1ApproveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonConfirmOk_608());
		requestForFinancingObj608.ButtonConfirmOk_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonSuccessOk_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.ButtonSuccessOk_608().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_608 click the Approval committee recommendation under Request for Financing")
	public void user_click_the_approval_committee_recommendation_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingApprovalCommitteeRecom_608());
		requestForFinancingObj608.requestForFinancingApprovalCommitteeRecom_608().click();
	}

	@And("User_608 enter the code in Approval committee recommendation under Request for Financing")
	public void user_enter_the_code_in_approval_committee_recommendation_under_request_for_financing()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingApprovalCommitteeRecomCode_608());
		requestForFinancingObj608.requestForFinancingApprovalCommitteeRecomCode_608()
				.sendKeys(testData.get("Request Code"), Keys.ENTER);
	}

	@And("User_608 double click on the first row in Approval committee recommendation under Request for Financing")
	public void user_double_click_on_the_first_row_in_approval_committee_recommendation_under_request_for_financing()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingApprovalCommitteeRecomRow1_608());
		clicksAndActionsHelper
				.doubleClick(requestForFinancingObj608.requestForFinancingApprovalCommitteeRecomRow1_608());
	}

	@And("User_608 move to credit committee recommendation tab in approval committee under Request for Financing")
	public void user_move_to_credit_committee_recommendation_tab_in_approval_committee_under_request_for_financing()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approvalCommitteeCreditCommitteeTab_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.approvalCommitteeCreditCommitteeTab_608().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 click the Recommendation division in credit committee under approval committee")
	public void user_click_the_recommendation_division_in_credit_committee_under_approval_committee() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommDiv_608());
		requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommDiv_608().click();
	}

	@And("User_608 click the plus icon in Recommendation division under credit committee")
	public void user_click_the_plus_icon_in_recommendation_division_under_credit_committee() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommPlusIcon_608());
		requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommPlusIcon_608().click();
	}

	@And("User_608 select the Recommendation dropdown in Recommendation division under credit committee")
	public void user_select_the_recommendation_dropdown_in_recommendation_division_under_credit_committee()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommLabel_608());
		requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommLabel_608().click();

		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommDropdown_608());
		dropDownHelper.SelectUsingVisibleText(
				requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommDropdown_608(),
				testData.get("Recommendation"));
	}

	@When("User_608 click the Recommendation button under Approval committee recommendation")
	public void user_click_the_recommendation_button_under_approval_committee_recommendation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.approvalCommitteeRecommendationBtn_608());
		requestForFinancingObj608.approvalCommitteeRecommendationBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonConfirmOk_608());
		requestForFinancingObj608.ButtonConfirmOk_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonSuccessOk_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.ButtonSuccessOk_608().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

//	@AT_DDR_021
	@And("User_608 enter the Down Payment Percentage in main screen under Request for Financing")
	public void user_enter_the_down_payment_percentage_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainDownPaymentPercentInput_608());
		requestForFinancingObj608.requestForFinancingMainDownPaymentPercentInput_608().click();
		requestForFinancingObj608.requestForFinancingMainDownPaymentPercentInput_608()
				.sendKeys(testData.get("Down Payment Percent"), Keys.TAB);
		for (int i = 0; i <= 1000; i++) {
			try {
				if (!(requestForFinancingObj608.requestForFinancingMainDownPaymentPercentInput_608()
						.getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 enter the product class Down Payment Percentage in limit details tab under sublimit tab")
	public void user_enter_the_product_class_down_payment_percentage_in_limit_details_tab_under_sublimit_tab()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingMainSublimitTabDownPaymentPercentInput_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTabDownPaymentPercentInput_608().clear();
		requestForFinancingObj608.requestForFinancingMainSublimitTabDownPaymentPercentInput_608()
				.sendKeys(testData.get("Down Payment Percent"), Keys.TAB);
		for (int i = 0; i <= 1000; i++) {
			try {
				if (requestForFinancingObj608.requestForFinancingMainDownPaymentPercentInput_608()
						.getAttribute("prevvalue").equals(testData.get("Down Payment Percent"))) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 select the approve level1 recommendation decision as approve in approve level1 under Request for Financing")
	public void user_select_the_approve_level1_recommendation_decision_as_approve_in_approve_level1_under_request_for_financing()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper
						.scrollIntoView(requestForFinancingObj608.approveLevel1CustomerGradingApproveDecision_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		dropDownHelper.SelectUsingVisibleText(
				requestForFinancingObj608.approveLevel1CustomerGradingApproveDecision_608(), testData.get("Decision"));
	}

	@And("User_608 validate the Down Payment percentage should be correctly in approve level1 under Request for Financing")
	public void user_validate_the_down_payment_percentage_should_be_correctly_in_approve_level1_under_request_for_financing()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.requestForFinancingApproveLevel1DownPaymentPercentInput_608());
		String downPaymentPercent = requestForFinancingObj608
				.requestForFinancingApproveLevel1DownPaymentPercentInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("Down Payment Percent"), downPaymentPercent);
	}

//  @AT_RF_101_FMSParam
	@And("^User_608 clicks on the Document checklist feature$")
	public void user_clicks_on_the_document_checklist_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.paramDocumentChecklist_608());
		fmsParamObj608.paramDocumentChecklist_608().click();
	}

	@And("^User_608 clicks on the update after approve menu in Document checklist$")
	public void user_clicks_on_the_update_after_approve_menu_in_document_checklist() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistUpdateAfterApprove_608());
		fmsParamObj608.documentChecklistUpdateAfterApprove_608().click();
	}


	@And("User_608 double click on the first row in update after approve in Document checklist")
	public void user_double_click_on_the_first_row_in_update_after_approve_in_document_checklist() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistSearchgridFirstRowCode_608());
		clicksAndActionsHelper.doubleClick(fmsParamObj608.documentChecklistSearchgridFirstRowCode_608());
//		for(int i = 0; i <= 500; i++) {
//    		try {
//    			clicksAndActionsHelper.doubleClick(fmsParamObj608.documentChecklistSearchgridFirstRowCode_608());
//    			break;
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(fmsParamObj608.documentChecklistCode_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("^User_608 click the add new button under update after approve in Document checklist$")
	public void user_click_the_add_new_button_under_update_after_approve_in_document_checklist() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistRow2_608());
		fmsParamObj608.documentChecklistRow2_608().click();

		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistDeleteBtn_608());
		fmsParamObj608.documentChecklistDeleteBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistAddNewBtn_608());
		fmsParamObj608.documentChecklistAddNewBtn_608().click();
	}

	@And("^User_608 add the new record under Document details in update after approve$")
	public void user_add_the_new_record_under_document_details_in_update_after_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistRow2_608());
		fmsParamObj608.documentChecklistRow2_608().click();

		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistDoctypeInput_608());
		fmsParamObj608.documentChecklistDoctypeInput_608().sendKeys("5");

		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistDoctitleInput_608());
		fmsParamObj608.documentChecklistDoctitleInput_608().sendKeys("Test");

	}

	@And("^User_608 clicks on the update button under the update after approve in Document checklist$")
	public void user_clicks_on_the_update_button_under_the_update_after_approve_in_document_checklist()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistUpdateBtn_608());
		fmsParamObj608.documentChecklistUpdateBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
		applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();

	}

	@And("^User_608 move to the approve menu under Document checklist$")
	public void user_move_to_the_approve_menu_under_document_checklist() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistApproveMenu_608());
		fmsParamObj608.documentChecklistApproveMenu_608().click();
	}

	@And("^User_608 retrive the first data in approve under Document checklist$")
	public void user_retrive_the_first_data_in_approve_under_document_checklist() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistApproveCode_608());
		clicksAndActionsHelper.doubleClick(fmsParamObj608.documentChecklistApproveCode_608());
	}

	@And("^User_608 clicks on the Approve button under approve in Document checklist$")
	public void user_clicks_on_the_approve_button_under_approve_in_document_checklist() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistApproveBtn_608());
		for (int i = 0; i < 300; i++) {
			try {
				fmsParamObj608.documentChecklistApproveBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// close the warning popup alert
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();

		// again click the
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistApproveBtn_608());
		fmsParamObj608.documentChecklistApproveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
		applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
		applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
	}

	@And("^User_608 clicks on the Document management tab in update after approve menu$")
	public void user_clicks_on_the_document_management_tab_in_update_after_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityTypeDocManagementTab_608());
		fmsParamObj608.facilityTypeDocManagementTab_608().click();
	}

	@And("^User_608 check the Application creation checkbox under Document management tab$")
	public void user_check_the_application_creation_checkbox_under_document_management_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.applicationCreationLabel_608());
		fmsParamObj608.applicationCreationLabel_608().click();
		WebElement applicationCreationCheckbox = fmsParamObj608.applicationCreationCheckbox_608();
		applicationCreationCheckbox.click();
		if (!(applicationCreationCheckbox.isSelected())) {
			applicationCreationCheckbox.click();
		}
	}

//  @AT_RF_158_Param
	@And("^User_608 clicks on the Collateral type module$")
	public void user_clicks_on_the_collateral_type_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.parameterCollateralType_608());
		requestForFinancingObj608.parameterCollateralType_608().click();
	}

	@And("^User_608 clicks on the Maintanance screen under Collateral type$")
	public void user_clicks_on_the_maintanance_screen_under_collateral_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeMaintanance_608());
		requestForFinancingObj608.collateralTypeMaintanance_608().click();
	}

	@And("^User_608 enter the code under Collateral Type main screen$")
	public void user_enter_the_code_under_collateral_type_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeMainCode_608());
//    	requestForFinancingObj608.collateralTypeMainCode_608().sendKeys("1260");
		requestForFinancingObj608.collateralTypeMainCode_608().sendKeys(testData.get("Collateral Type"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.collateralTypeMainCode_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("^User_608 enter the Brief description under Collateral Type main screen$")
	public void user_enter_the_brief_description_under_collateral_type_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeMainBriefDescrip_608());
//    	requestForFinancingObj608.collateralTypeMainBriefDescrip_608().sendKeys("Test1");
		requestForFinancingObj608.collateralTypeMainBriefDescrip_608().sendKeys(testData.get("Brief Description"));

	}

	@And("^User_608 enter the Long description under Collateral Type main screen$")
	public void user_enter_the_long_description_under_collateral_type_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeMainLongDescrip_608());
//    	requestForFinancingObj608.collateralTypeMainLongDescrip_608().sendKeys("Test1");
		requestForFinancingObj608.collateralTypeMainLongDescrip_608().sendKeys(testData.get("Long Description"));
	}

	@And("^User_608 select the Asset type as cash under Collateral Type main screen$")
	public void user_select_the_asset_type_as_cash_under_collateral_type_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.collateralTypeMainAssetTypeDropdown_608());
//    	dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.collateralTypeMainAssetTypeDropdown_608(), "Cash");
		dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.collateralTypeMainAssetTypeDropdown_608(),
				testData.get("Asset Type"));
	}

	@When("^User_608 clicks on the save button under Collateral Type main screen$")
	public void user_clicks_on_the_save_button_under_collateral_type_main_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.collateralTypeMainSaveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeMainSaveBtn_608());
		requestForFinancingObj608.collateralTypeMainSaveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.confirmPopupOkBtn_608());
		requestForFinancingObj608.confirmPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.successPopupOkBtn_608());
		requestForFinancingObj608.successPopupOkBtn_608().click();
	}

	@And("^User_608 clicks on the Approve screen under Collateral Type$")
	public void user_clicks_on_the_approve_screen_under_collateral_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeApprove_608());
		requestForFinancingObj608.collateralTypeApprove_608().click();
	}

	@And("^User_608 search the code under Collateral Type approve screen$")
	public void user_search_the_code_under_collateral_type_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeApproveCode_608());
//    	requestForFinancingObj608.collateralTypeApproveCode_608().sendKeys("1260");
		requestForFinancingObj608.collateralTypeApproveCode_608().sendKeys(testData.get("Collateral Type"), Keys.ENTER);
	}

	@And("^User_608 double click on the searched result under Collateral Type approve screen$")
	public void user_double_click_on_the_searched_result_under_collateral_type_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeApproveCodeRow1_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.collateralTypeApproveCodeRow1_608());
	}

	@When("^User_608 clicks on the Approve button under Collateral Type approve screen$")
	public void user_clicks_on_the_approve_button_under_collateral_type_approve_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.collateralTypeApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralTypeApproveBtn_608());
		requestForFinancingObj608.collateralTypeApproveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.confirmPopupOkBtn_608());
		requestForFinancingObj608.confirmPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.successPopupOkBtn_608());
		requestForFinancingObj608.successPopupOkBtn_608().click();
	}

//  @AT_RF_158_Core
	@And("^User_608 click on the Collateral Management feature$")
	public void user_click_on_the_collateral_management_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.FMSCollateralManagement_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.FMSCollateralManagement_608());
		requestForFinancingObj608.FMSCollateralManagement_608().click();
	}

	@And("^User_608 click on the Maintanace screen under Collateral Management$")
	public void user_click_on_the_maintanace_screen_under_collateral_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.collateralManagementMaintanance_608());
		requestForFinancingObj608.collateralManagementMaintanance_608().click();
	}

	@And("^User_608 enter the Collateral type under main information in Collateral Management main Screen$")
	public void user_enter_the_collateral_type_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mainInfoCollateralType_608());
//    	requestForFinancingObj608.mainInfoCollateralType_608().sendKeys("564");
		requestForFinancingObj608.mainInfoCollateralType_608().sendKeys(testData.get("Collateral Type"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.mainInfoCollateralType_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("^User_608 give the valid from date under main information in Collateral Management main Screen$")
	public void user_give_the_valid_from_date_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mainInfoValidFromDate_608());
//    	requestForFinancingObj608.mainInfoValidFromDate_608().sendKeys("05/01/2022");
		requestForFinancingObj608.mainInfoValidFromDate_608().sendKeys(testData.get("Valid From Date"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.mainInfoValidFromDate_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_608 give the valid to date under main information in Collateral Management main Screen$")
	public void user_give_the_valid_to_date_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mainInfoValidToDate_608());
//    	requestForFinancingObj608.mainInfoValidToDate_608().sendKeys("05/01/2023");
		requestForFinancingObj608.mainInfoValidToDate_608().sendKeys(testData.get("Valid To Date"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.mainInfoValidToDate_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_608 enter the brief description under main information in Collateral Management main Screen$")
	public void user_enter_the_brief_description_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mainInfoBriefDescrip_608());
//    	requestForFinancingObj608.mainInfoBriefDescrip_608().sendKeys("Test");
		requestForFinancingObj608.mainInfoBriefDescrip_608().sendKeys(testData.get("Brief Description"));
	}

	@And("^User_608 enter the long description under main information in Collateral Management main Screen$")
	public void user_enter_the_long_description_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mainInfoLongDescrip_608());
//    	requestForFinancingObj608.mainInfoLongDescrip_608().sendKeys("Test");
		requestForFinancingObj608.mainInfoLongDescrip_608().sendKeys(testData.get("Long Description"));
	}

	@And("^User_608 enter the Collateral currency under main information in Collateral Management main Screen$")
	public void user_enter_the_collateral_currency_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.mainInfoCollateralCurrency_608());
//    	requestForFinancingObj608.mainInfoCollateralCurrency_608().sendKeys("840");
		requestForFinancingObj608.mainInfoCollateralCurrency_608().sendKeys(testData.get("Collateral Currency"),
				Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.mainInfoCollateralCurrencyLabel_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_608 move to the Collateral cash details tab in Collateral Management main Screen$")
	public void user_move_to_the_collateral_cash_details_tab_in_collateral_management_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.CollateralCashDetailsTab_608());
		for (int i = 0; i < 2000; i++) {
			try {
				requestForFinancingObj608.CollateralCashDetailsTab_608().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_608 click the add new icon under Collateral cash details tab$")
	public void user_click_the_add_new_icon_under_collateral_cash_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.CollateralCashDetailsAddIcon_608());
		requestForFinancingObj608.CollateralCashDetailsAddIcon_608().click();
	}

	@And("^User_608 click the additional reference lookup under Collateral cash details tab$")
	public void user_click_the_additional_reference_lookup_under_collateral_cash_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.CollateralCashDetailsAdditionalRefLookup_608());
		requestForFinancingObj608.CollateralCashDetailsAdditionalRefLookup_608().click();
	}

	@And("^User_608 select the any cy value under additional reference lookup$")
	public void user_select_the_any_cy_value_under_additional_reference_lookup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.CollateralCashDetailsAdditionalRefRow1_608());
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.CollateralCashDetailsAdditionalRefCy_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.CollateralCashDetailsAdditionalRefRow1_608());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.CollateralCashDetailsAdditionalRefInput_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_608 enter the amount value under Collateral cash details tab$")
	public void user_enter_the_amount_value_under_collateral_cash_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.CollateralCashDetailsAmount_608());
//    	requestForFinancingObj608.CollateralCashDetailsAmount_608().sendKeys("1000");
		requestForFinancingObj608.CollateralCashDetailsAmount_608().sendKeys(testData.get("Amount"), Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.CollateralCashDetailsAmount_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@When("^User_608 click the save button under Collateral Management main Screen$")
	public void user_click_the_save_button_under_collateral_management_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.collateralManagementMaintananceSaveBtn_608());
		requestForFinancingObj608.collateralManagementMaintananceSaveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.confirmPopupOkBtn_608());
		requestForFinancingObj608.confirmPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.successPopupTitle_608());
		String collateralCode = requestForFinancingObj608.collateralSuccessPopupMsg_608().getText().substring(21, 25);
		System.err.println("Collateral Code: " + collateralCode);
		fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"), "Collateral Code", collateralCode);

		for (int i = 0; i < 2000; i++) {
			try {
				requestForFinancingObj608.successPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.collateralSendAlertPopupDismissBtn_608().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User_608 move to the Approve screen under Collateral Management$")
	public void user_move_to_the_approve_screen_under_collateral_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralManagementApprove_608());
		requestForFinancingObj608.collateralManagementApprove_608().click();
	}

	@And("User_608 enter the Code in Collateral Management Approve screen search grid")
	public void user_enter_the_code_in_collateral_management_approve_screen_search_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralManagementApproveMenuSearchgridCodeInput_608());
		requestForFinancingObj608.collateralManagementApproveMenuSearchgridCodeInput_608().sendKeys(testData.get("Collateral Code"), Keys.ENTER);		
	}

	@And("User_608 double click the Code Collateral Management Approve screen search grid")
	public void user_double_click_the_code_collateral_management_approve_screen_search_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.collateralManagementApproveMenuSearchgridRow1_608());
		clicksAndActionsHelper
				.doubleClick(requestForFinancingObj608.collateralManagementApproveMenuSearchgridRow1_608());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.collateralManagementApproveMenuCode_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("^User_608 click the clear button under approve screen in Collateral Management$")
	public void user_click_the_clear_button_under_approve_screen_in_collateral_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.collateralManagementApproveClearBtn_608());
		requestForFinancingObj608.collateralManagementApproveClearBtn_608().click();
	}

	@And("^User_608 double click on the first row in approve screen$")
	public void user_double_click_on_the_first_row_in_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.collateralManagementApproveFirstRow_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.collateralManagementApproveFirstRow_608());
	}

	@When("^User_608 click the approve button under Collateral Management approve screen$")
	public void user_click_the_approve_button_under_collateral_management_approve_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.collateralManagementApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.collateralManagementApproveBtn_608());
		requestForFinancingObj608.collateralManagementApproveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.confirmPopupOkBtn_608());
		requestForFinancingObj608.confirmPopupOkBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.successPopupTitle_608());
		requestForFinancingObj608.successPopupOkBtn_608().click();

	}

//  @AT_DDR_025
	@And("User_608 select the application for dropdown as new facility under Application for financial facility")
	public void user_select_the_application_for_dropdown_as_new_facility_under_application_for_financial_facility()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialFacilityObj608.mainApplicationForDropdown_608());
		dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.mainApplicationForDropdown_608(),
				testData.get("Application For"));
	}

	@And("User_608 enter the CIF No in main info tab in Application for financial facility Maintanance")
	public void user_enter_the_cif_no_in_main_info_tab_in_application_for_financial_facility_maintanance()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainCIFNo_608());
		applicationFinancialFacilityObj608.mainCIFNo_608().sendKeys(testData.get("CIF No"), Keys.TAB);
	}

	@And("User_608 validate the CIF status displayed should be blacklist under Application for financial facility")
	public void user_validate_the_cif_status_displayed_should_be_blacklist_under_application_for_financial_facility()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.CIFBlacklistPopupMsg_608());
		String CIFblacklistMsg = requestForFinancingObj608.CIFBlacklistPopupMsg_608().getText().substring(7, 30);
//    	System.err.println("CIF Blacklist Message: "+CIFblacklistMsg);
		Assert.assertEquals(testData.get("CIF Blacklist Msg"), CIFblacklistMsg);

		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.CIFBlacklistPopupCancelBtn_608());
		requestForFinancingObj608.CIFBlacklistPopupCancelBtn_608().click();
	}

	@And("User_608 enter the CIF No under main information in Collateral Management main Screen")
	public void user_enter_the_cif_no_under_main_information_in_collateral_management_main_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				requestForFinancingObj608.CollateralManagementMainInfoCIFNoInput_608());
		requestForFinancingObj608.CollateralManagementMainInfoCIFNoInput_608().sendKeys(testData.get("CIF No"),
				Keys.TAB);
	}

	@And("User_608 validate the CIF status displayed should be blacklist under Collateral Management maintanance")
	public void user_validate_the_cif_status_displayed_should_be_blacklist_under_collateral_management_maintanance()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.CIFBlacklistPopupMsg_608());
		String CIFblacklistMsg = requestForFinancingObj608.CIFBlacklistPopupMsg_608().getText().substring(7, 30);
//    	System.err.println("CIF Blacklist Message in Collateral: "+CIFblacklistMsg);
		Assert.assertEquals(testData.get("CIF Blacklist Msg"), CIFblacklistMsg);
	}
	
	
//	@AT_CM_043
	@And("User_608 enter the Status in Facilities Management Maintanance Search grid under WIFAK Application")
	public void user_enter_the_status_in_facilities_management_maintanance_search_grid_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainSearchgridStatusInput_608());
		requestForFinancingObj608.wifakFacilitiesManagementMainSearchgridStatusInput_608().sendKeys(testData.get("Status"),Keys.ENTER);
	}

	@And("User_608 double click the any one row in Facilities Management Maintanance Search grid under WIFAK Application")
	public void user_double_click_the_any_one_row_in_facilities_management_maintanance_search_grid_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainSearchgridRow_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.wifakFacilitiesManagementMainSearchgridRow_608());
		for(int i = 0; i <= 500; i++) {
	 		try {
					if(!(facilityManagementObj608.wifakFacilitiesManagementMainApplicationRefInput_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	 	}
		String RefCode = facilityManagementObj608.wifakFacilitiesManagementMainApplicationRefInput_608().getAttribute("prevvalue");
		fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"), "Reference Code", RefCode);
		
	}

	@And("User_608 click the Collateral details button in Facilities Management Maintanance under WIFAK Application")
	public void user_click_the_collateral_details_button_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainLimitDetailsTabCollateralDetailsBtn_608());
		requestForFinancingObj608.wifakFacilitiesManagementMainLimitDetailsTabCollateralDetailsBtn_608().click();
	}

	@And("User_608 click the add new icon in collateral details tab Facilities Management Maintanance under WIFAK Application")
	public void user_click_the_add_new_icon_in_collateral_details_tab_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTab_608());
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_608());
//				javaScriptHelper.JSEClick(requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_608());
////				requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_608().click();
//				System.err.println("Element clicked..........");
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_608());
		clicksAndActionsHelper.doubleClick(requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_608());
//		requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_608().click();
//		requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_608().click();
	}

	@And("User_608 enter the Collateral code in collateral details tab Facilities Management Maintanance under WIFAK Application")
	public void user_enter_the_collateral_code_in_collateral_details_tab_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabFirstRow_608());
		requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabFirstRow_608().click();
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabFirstRowCollateralInput_608());
		requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabFirstRowCollateralInput_608().sendKeys(testData.get("Collateral Code"),Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabFirstRowCollateralInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}		
	}

	@And("User_608 Click the OK button in collateral details tab Facilities Management Maintanance under WIFAK Application")
	public void user_click_the_ok_button_in_collateral_details_tab_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabOkBtn_608());
		requestForFinancingObj608.wifakFacilitiesManagementMainCollateralDetailsTabOkBtn_608().click();
	}
	
	@And("User_608 enter the Application Ref code in search grid under Approve screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_code_in_search_grid_under_approve_screen_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER); 
    }

	
//	@AT_CM_044
	@And("User_608 click the Additional details tab in Facilities Management Maintanance under WIFAK Application")
	public void user_click_the_additional_details_tab_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTab_608());
		requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTab_608().click();
	}

	@And("User_608 Validate Effective Date From field should be available in Additional details tab in Facilities Management under WIFAK Application")
	public void user_validate_effective_date_from_field_should_be_available_in_additional_details_tab_in_facilities_management_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabEffectiveDateFromInput_608());
		boolean effDateFrom = requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabEffectiveDateFromInput_608().isDisplayed();
		Assert.assertTrue(effDateFrom);
	}

	@And("User_608 Validate Effective until field should be available in Additional details tab in Facilities Management under WIFAK Application")
	public void user_validate_effective_until_field_should_be_available_in_additional_details_tab_in_facilities_management_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabEffectivenUntilInput_608());
		boolean effUntil = requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabEffectivenUntilInput_608().isDisplayed();
		Assert.assertTrue(effUntil);	    
	}

	@And("User_608 Validate Unutilized Expiry Date field should be available in Additional details tab in Facilities Management under WIFAK Application")
	public void user_validate_unutilized_expiry_date_field_should_be_available_in_additional_details_tab_in_facilities_management_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabUnutilizeExpireDateInput_608());
		boolean unutilizeExpiryDate = requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabUnutilizeExpireDateInput_608().isDisplayed();
		Assert.assertTrue(unutilizeExpiryDate);
	}

	
//	@AT_CM_045
	@And("User_608 change the Effective until field in Additional details tab in Facilities Management under WIFAK Application")
	public void user_change_the_effective_until_field_in_additional_details_tab_in_facilities_management_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabEffectivenUntilInput_608());
		WebElement EffectivenUntilInput_608 = requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabEffectivenUntilInput_608();
		EffectivenUntilInput_608.clear();
		EffectivenUntilInput_608.sendKeys(testData.get("Effective Until"),Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (EffectivenUntilInput_608.getAttribute("prevvalue").equals(testData.get("Effective Until"))) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 change the Unutilized Expiry Date field in Additional details tab in Facilities Management under WIFAK Application")
	public void user_change_the_unutilized_expiry_date_field_in_additional_details_tab_in_facilities_management_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabUnutilizeExpireDateInput_608());
		WebElement UnutilizeExpireDateInput_608 = requestForFinancingObj608.wifakFacilitiesManagementMainAdditionalDetailsTabUnutilizeExpireDateInput_608();
		UnutilizeExpireDateInput_608.clear();
		UnutilizeExpireDateInput_608.sendKeys(testData.get("Unutilized Expiry Date"),Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (UnutilizeExpireDateInput_608.getAttribute("prevvalue").equals(testData.get("Unutilized Expiry Date"))) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
}
