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
import pageobjects.fmsParam.Facility_TypeObj_608;
import pageobjects.fmsParam.RequestForFinancingObj_608;
import resources.BaseClass;

public class RequestForFinancingSteps_608 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	RequestForFinancingObj_608 requestForFinancingObj608 = new RequestForFinancingObj_608(driver);
	Facility_TypeObj_608 facilityTypeObj608 = new Facility_TypeObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"Request_For_FinancingTestData","DataSet ID");
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"IIS_Param_TestData","DataSet ID");
	
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
				if (i==499) {
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
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.repaymentTabNoOfPaymentDropdown_608());
//    	dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.repaymentTabNoOfPaymentDropdown(), "Nearest 1");
    	dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.repaymentTabNoOfPaymentDropdown_608(), testData.get("No of Payment Select"));
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
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.fmsRepaymentPlanRoundingfactorDropdown_608());
    	String roundingfactorDropdown = requestForFinancingObj608.fmsRepaymentPlanRoundingfactorDropdown_608().getText();
    	Assert.assertEquals(testData.get("No of Payment Select"), roundingfactorDropdown);
    }

    @Then("^User_608 validate the No of payments input$")
    public void user_validate_the_no_of_payments_input() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.fmsRepaymentPlanNoOfPaymentsInput_608());
    	String NoOfPaymentsInput = requestForFinancingObj608.fmsRepaymentPlanNoOfPaymentsInput_608().getText();
    	Assert.assertEquals(testData.get("No of payment input"), NoOfPaymentsInput);
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
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMaintananceSearchBtn_608());
		requestForFinancingObj608.requestForFinancingMaintananceSearchBtn_608().click();
	}

	@And("User_608 click the clear button under the maintanance screen in Request for Financing")
	public void user_click_the_clear_button_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMaintananceClearBtn_608());
		requestForFinancingObj608.requestForFinancingMaintananceClearBtn_608().click();
	}

	@Then("User_608 validate the CIF short Name available under the maintanance screen in Request for Financing")
	public void user_validate_the_cif_short_name_available_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainCIFShortNameTitle_608());
		boolean shortNameTitle = requestForFinancingObj608.requestForFinancingMainCIFShortNameTitle_608().isDisplayed();
		Assert.assertEquals(true, shortNameTitle);
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainCIFShortNameValue_608());
		boolean shortNameValue = requestForFinancingObj608.requestForFinancingMainCIFShortNameValue_608().isDisplayed();		
		Assert.assertEquals(true, shortNameValue);

	}

	@And("User_608 validate the CIF long Name available under the maintanance screen in Request for Financing")
	public void user_validate_the_cif_long_name_available_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainCIFLongNameTitle_608());
		boolean longNameTitle = requestForFinancingObj608.requestForFinancingMainCIFLongNameTitle_608().isDisplayed();
		Assert.assertEquals(true, longNameTitle);
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainCIFLongNameValue_608());
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
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.arabicFundingRequestApprovalCommittee_608());
		requestForFinancingObj608.arabicFundingRequestApprovalCommittee_608().click();
	}

	@Then("User_608 validate the search grid value are displayed in arbic language under approval committee")
	public void user_validate_the_search_grid_value_are_displayed_in_arbic_language_under_approval_committee() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.arabicApprovalCommitteeSearchGrid_608());
		boolean approvalCommittee = requestForFinancingObj608.arabicApprovalCommitteeSearchGrid_608().isDisplayed();
		Assert.assertEquals(true, approvalCommittee);
	}	
	
	

//	@AT_FM_043_FMSParam
	@And("User_608 uncheck the Committee Approval flag")
	public void user_uncheck_the_committee_approval_flag() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.committeeApprovalFlag_608());
    	 WebElement committeeApprovalFlag = facilityTypeObj608.committeeApprovalFlag_608();
    	 if(committeeApprovalFlag.isSelected()) {
    		 committeeApprovalFlag.click();
     	}	    
	}

	@And("User_608 select the member as atleast one under Committee approval flag")
	public void user_select_the_member_as_atleast_one_under_committee_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.committeeApprovalFlagMemberDropdown_608());
   	 	dropDownHelper.SelectUsingVisibleText(facilityTypeObj608.committeeApprovalFlagMemberDropdown_608(), testData.get("Committee Member"));	    
	}

		
	
//	@AT_FM_043_FMSCore	
	@And("User_608 select the Reason for submission under main screen in Request for Financing")
	public void user_select_the_reason_for_submission_under_main_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainReasonForDropdown_608());
	    dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.requestForFinancingMainReasonForDropdown_608(), testData.get("Reason For Submission"));
	}

	@And("User_608 enter the CIF no in main screen under Request for Financing")
	public void user_enter_the_cif_no_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainCustomerInput_608());
		requestForFinancingObj608.requestForFinancingMainCustomerInput_608().sendKeys(testData.get("Customer CIF"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(requestForFinancingObj608.requestForFinancingMainShortNameInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	}

	@And("User_608 enter the facility type in main screen under Request for Financing")
	public void user_enter_the_facility_type_in_main_screen_under_request_for_financing()throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainFacilityTypeInput_608());
		requestForFinancingObj608.requestForFinancingMainFacilityTypeInput_608().sendKeys(testData.get("Facility Type"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(requestForFinancingObj608.requestForFinancingMainCYInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("User_608 enter the total limit in main screen under Request for Financing")
	public void user_enter_the_total_limit_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainTotalLimitInput_608());
		requestForFinancingObj608.requestForFinancingMainTotalLimitInput_608().sendKeys(testData.get("Total Limit"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(requestForFinancingObj608.requestForFinancingMainTotalLimitInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	    
	}

	@And("User_608 move to the sublimit tab in main screen under Request for Financing")
	public void user_move_to_the_sublimit_tab_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainSublimitTab_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTab_608().click();
	}

	@And("User_608 click the add new button in sublimit tab under main screen in Request for Financing")
	public void user_click_the_add_new_button_in_sublimit_tab_under_main_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewBtn_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewBtn_608().click();
	}

	@And("User_608 enter the product class in limit details tab under sublimit tab")
	public void user_enter_the_product_class_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewProductClassInput_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewProductClassInput_608().sendKeys(testData.get("Product Class"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewProductClassInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_608 enter the margin value in limit details tab under sublimit tab")
	public void user_enter_the_margin_value_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewMarginInput_608());
		requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewMarginInput_608().clear();
		requestForFinancingObj608.requestForFinancingMainSublimitTabAddNewMarginInput_608().sendKeys(testData.get("Margin Value"),Keys.TAB);
	}

	@And("User_608 click the add button in limit details tab under sublimit tab")
	public void user_click_the_add_button_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		Thread.sleep(3000);
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainSublimitTabAddBtn_608());
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
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("User_608 click the Validate button in main screen Request for Financing")
	public void user_click_the_validate_button_in_main_screen_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingMainValidateBtn_608());
		requestForFinancingObj608.requestForFinancingMainValidateBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonConfirmOk_608());
		requestForFinancingObj608.ButtonConfirmOk_608().click();
		
		// Facility already created popup
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.confirmPopup_608());
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.facilityAlreadyCreatedPopupOkBtn_608());
    	requestForFinancingObj608.facilityAlreadyCreatedPopupOkBtn_608().click();
		
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.successPopup_608());
		String RequestID = requestForFinancingObj608.successPopupMsg_608().getText().substring(10, 14);
    	System.err.println("Reference Number: "+RequestID);
    	fmsTransactionsExcelData.updateTestData("DS_AT_FM_043", "Request Code", RequestID);
    	
    	for (int i = 0; i < 2000; i++) {
			try {
				requestForFinancingObj608.ButtonSuccessOk_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    
    	
    	// close the send alert pop-up box
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.RequestSendAlertPopup_608());
    	for (int i = 0; i < 2000; i++) {
			try {
				requestForFinancingObj608.requestSendAlertPopupDismissBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@Then("User_608 click the approve level1 under Request for Financing")
	public void user_click_the_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingApproveLevel1_608());
		requestForFinancingObj608.requestForFinancingApproveLevel1_608().click();
	}	
	
	@And("User_608 enter the request code in approve level1 under Request for Financing")
	public void user_enter_the_request_code_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingApproveLevel1Code_608());
		requestForFinancingObj608.requestForFinancingApproveLevel1Code_608().sendKeys(testData.get("Request Code"),Keys.ENTER);
	}

	@And("User_608 double click on the first row in approve level1 under Request for Financing")
	public void user_double_click_on_the_first_row_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingApproveLevel1FirstRow_608());
	    clicksAndActionsHelper.doubleClick(requestForFinancingObj608.requestForFinancingApproveLevel1FirstRow_608());
	}

	@And("User_608 move to customer grading tab in approve level1 under Request for Financing")
	public void user_move_to_customer_grading_tab_in_approve_level1_under_request_for_financing() throws Throwable {		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approveLevel1CustomerGradingTab_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.approveLevel1CustomerGradingTab_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("User_608 select the approve level1 recommendation decision in approve level1 under Request for Financing")
	public void user_select_the_approve_level1_recommendation_decision_in_approve_level1_under_request_for_financing() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.approveLevel1CustomerGradingApproveDecision_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
		dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.approveLevel1CustomerGradingApproveDecision_608(), testData.get("Approve1 Decision"));
	}

	@And("User_608 select the decision forward to as approval committee in approve level1 under Request for Financing")
	public void user_select_the_decision_forward_to_as_approval_committee_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approveLevel1CustomerGradingApproveForwardTo_608());
		dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.approveLevel1CustomerGradingApproveForwardTo_608(), testData.get("Decision Forward To"));
	}

	@And("User_608 select the approval committee in approve level1 under Request for Financing")
	public void user_select_the_approval_committee_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approveLevel1CustomerGradingApproveCommittee_608()); 
		dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.approveLevel1CustomerGradingApproveCommittee_608(), testData.get("Approval Committee"));
	    
	}

	@And("User_608 click the Approve button in approve level1 under Request for Financing")
	public void user_click_the_approve_button_in_approve_level1_under_request_for_financing() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.requestForFinancingApproveLevel1ApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingApproveLevel1ApproveBtn_608());
		requestForFinancingObj608.requestForFinancingApproveLevel1ApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonConfirmOk_608());
		requestForFinancingObj608.ButtonConfirmOk_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonSuccessOk_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.ButtonSuccessOk_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@Then("User_608 click the Approval committee recommendation under Request for Financing")
	public void user_click_the_approval_committee_recommendation_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingApprovalCommitteeRecom_608());
		requestForFinancingObj608.requestForFinancingApprovalCommitteeRecom_608().click();
	}
	
	@And("User_608 enter the code in Approval committee recommendation under Request for Financing")
	public void user_enter_the_code_in_approval_committee_recommendation_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingApprovalCommitteeRecomCode_608());
		requestForFinancingObj608.requestForFinancingApprovalCommitteeRecomCode_608().sendKeys(testData.get("Request Code"),Keys.ENTER);
	}

	@And("User_608 double click on the first row in Approval committee recommendation under Request for Financing")
	public void user_double_click_on_the_first_row_in_approval_committee_recommendation_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.requestForFinancingApprovalCommitteeRecomRow1_608());
	    clicksAndActionsHelper.doubleClick(requestForFinancingObj608.requestForFinancingApprovalCommitteeRecomRow1_608());
	}

	@And("User_608 move to credit committee recommendation tab in approval committee under Request for Financing")
	public void user_move_to_credit_committee_recommendation_tab_in_approval_committee_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approvalCommitteeCreditCommitteeTab_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.approvalCommitteeCreditCommitteeTab_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("User_608 click the Recommendation division in credit committee under approval committee")
	public void user_click_the_recommendation_division_in_credit_committee_under_approval_committee() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommDiv_608()); 
		requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommDiv_608().click();
	}

	@And("User_608 click the plus icon in Recommendation division under credit committee")
	public void user_click_the_plus_icon_in_recommendation_division_under_credit_committee() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommPlusIcon_608());
		requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommPlusIcon_608().click();
	}

	@And("User_608 select the Recommendation dropdown in Recommendation division under credit committee")
	public void user_select_the_recommendation_dropdown_in_recommendation_division_under_credit_committee() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommLabel_608()); 
		requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommLabel_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommDropdown_608());
		dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.approvalCommitteeCreditCommitteeRecommDropdown_608(), testData.get("Recommendation"));
	}

	@When("User_608 click the Recommendation button under Approval committee recommendation")
	public void user_click_the_recommendation_button_under_approval_committee_recommendation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.approvalCommitteeRecommendationBtn_608());
		requestForFinancingObj608.approvalCommitteeRecommendationBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonConfirmOk_608());
		requestForFinancingObj608.ButtonConfirmOk_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.ButtonSuccessOk_608());
		for (int i = 0; i < 500; i++) {
			try {
				requestForFinancingObj608.ButtonSuccessOk_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	
	


}
