package stepdefinitions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
import pageobjects.fmsParam.Facility_TypeObj_608;
import resources.BaseClass;

public class ApplicationFinancialFacilitySteps_608 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	ApplicationFinancialFacilityObj_608 applicationFinancialFacilityObj608 = new ApplicationFinancialFacilityObj_608(driver);
	FacilitiesManagementObj_608 facilityManagementObj608 = new FacilitiesManagementObj_608(driver);
	Facility_TypeObj_608 facilityTypeObj608 = new Facility_TypeObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"ApplicationFinancialFacility","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FacilitiesManagementTestData","DataSet ID");
	Map<String, String> testData;
	
	
//	@AT_AFF_036
	@And("^User_608 get the test data for test case AT_AFF_036$")
    public void get_the_test_data_for_test_case_AT_AFF_036() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_036");
    }
	
//	@AT_AFF_040
	@And("^User_608 get the test data for test case AT_AFF_040$")
    public void get_the_test_data_for_test_case_AT_AFF_040() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_040");
    }
	
//	@AT_AFF_048
	@And("^User_608 get the test data for test case AT_AFF_048$")
    public void get_the_test_data_for_test_case_AT_AFF_048() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_048");
    }
	
//	@AT_FM_058
	@And("User_608 get the test data for test case AT_FM_058")
	public void user_get_the_test_data_for_test_case_AT_FM_058() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_058");
	}
	
	
//	@AT_AFF_052
	@And("^User_608 get the test data for test case AT_AFF_052$")
    public void get_the_test_data_for_test_case_AT_AFF_052() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_052");
    }
	
	
//	@AT_AFF_074
	@And("^User_608 get the test data for test case AT_AFF_074$")
    public void get_the_test_data_for_test_case_AT_AFF_074() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_074");
    }
	
	
//	@AT_AFF_098_FMSParam
	@And("^User_608 get the test data for test case AT_AFF_098_FMSParam$")
    public void get_the_test_data_for_test_case_AT_AFF_098_FMSParam() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_098");
    }
	
//  @AT_AFF_098_FMS_Core
	@And("^get the test data for test case AT_AFF_098_FMSCore$")
	public void get_the_test_data_for_test_case_AT_AFF_098fmscore() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_098");
	}
	
	
	
	
	
	
	
	
	
	
	
//	@AT_FM_102
	@And("User_608 get the test data for test case AT_FM_102")
	public void user_get_the_test_data_for_test_case_AT_FM_102() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_102");
	}

//	@AT_FM_103
	@And("User_608 get the test data for test case AT_FM_103")
	public void user_get_the_test_data_for_test_case_AT_FM_103() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_103");
	}

	
	
//	@AT_AFF_036	
	@And("^User_608 clicks on the WIFAK_Application first link$")
	public void user_clicks_on_the_wifakapplication_first_link() throws Throwable {
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

	@And("^User_608 clicks on the WIFAK_Application second link$")
	public void user_clicks_on_the_wifakapplication_second_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakApplicationSecond_608());
		applicationFinancialFacilityObj608.wifakApplicationSecond_608().click();
	}

	@And("^User_608 clicks on the Application for financial facility link$")
	public void user_clicks_on_the_application_for_financial_facility_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacility_608());
		applicationFinancialFacilityObj608.applicationFinancialFacility_608().click();
	}
	
	@And("^User_608 clicks the maintanance menu under Application for financial facility$")
	public void user_clicks_the_maintanance_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.appFinancialFacilityMaintanance_608());
		applicationFinancialFacilityObj608.appFinancialFacilityMaintanance_608().click();
	}
	
	@And("^User_608 select the application for dropdown as new facility$")
	public void user_select_the_application_for_dropdown_as_new_facility() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainApplicationForDropdown_608());
//		dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.mainApplicationForDropdown_608(), "New Facility");
		dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.mainApplicationForDropdown_608(), testData.get("Application For"));
	}

	@And("^User_608 enter the CIF No in main info tab$")
	public void user_enter_the_cif_no_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainCIFNo_608());
//		applicationFinancialFacilityObj608.mainCIFNo_608().sendKeys("444");
		applicationFinancialFacilityObj608.mainCIFNo_608().sendKeys(testData.get("CIF No"),Keys.TAB);
	}

	@And("^User_608 enter the facility type in main info tab$")
	public void user_enter_the_facility_type_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainFacilityType_608());
//		applicationFinancialFacilityObj608.mainFacilityType().sendKeys("369");
		applicationFinancialFacilityObj608.mainFacilityType_608().sendKeys(testData.get("Facility Type"),Keys.TAB);

		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.mainFacilityTypeLabel_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	}

	@And("^User_608 enter the country of financing in main info tab$")
	public void user_enter_the_country_of_financing_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainCountryOfFinancing_608());
//		applicationFinancialFacilityObj608.mainCountryOfFinancing().sendKeys("320");
		applicationFinancialFacilityObj608.mainCountryOfFinancing_608().sendKeys(testData.get("Country of Financing"),Keys.TAB);
	}

	@And("^User_608 enter the facility rating in main info tab$")
	public void user_enter_the_facility_rating_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainFacilityRating_608());
//		applicationFinancialFacilityObj608.mainFacilityRating().sendKeys("2");
		applicationFinancialFacilityObj608.mainFacilityRating_608().sendKeys(testData.get("Facility Rating"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.mainFacilityRating_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    
	}

	@And("^User_608 clicks on the additional details tab$")
	public void user_clicks_on_the_additinal_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainAdditionalTab_608());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialFacilityObj608.mainAdditionalTab_608().click();
		    	break;
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_608 enter the total value in additional info tab$")
	public void user_enter_the_total_value_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainAdditionalTabTotalValue_608());
//		applicationFinancialFacilityObj608.mainAdditionalTabTotalValue().sendKeys("1000");
		applicationFinancialFacilityObj608.mainAdditionalTabTotalValue_608().sendKeys(testData.get("Total value"),Keys.TAB);		
	}

	@And("^User_608 enter the expire date in additional info tab$")
	public void user_enter_the_expire_date_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.additionalTabExpireDate_608());
		applicationFinancialFacilityObj608.additionalTabExpireDate_608().sendKeys(testData.get("Expire Date"),Keys.TAB);
		
	}

	@And("^User_608 clicks the limit details tab$")
	public void user_clicks_the_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainLimitDetailsTab_608());
		applicationFinancialFacilityObj608.mainLimitDetailsTab_608().click();
	}

	@And("^User_608 clicks the add new record button in limit details tab$")
	public void user_clicks_the_add_new_record_button_in_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsTabAddNewRecordBtn_608());
		applicationFinancialFacilityObj608.limitDetailsTabAddNewRecordBtn_608().click();
	}

	@And("^User_608 enter the product class details$")
    public void user_enter_the_product_class_details() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsNewRecordProductClass_608());
        applicationFinancialFacilityObj608.limitDetailsNewRecordProductClass_608().sendKeys(testData.get("Product Class"),Keys.TAB);
        for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsNewRecordProductClass_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
        
        //FRR Value Date
//        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsNewRecordProductClassFRRValueDate_608());
//        applicationFinancialFacilityObj608.limitDetailsNewRecordProductClassFRRValueDate_608().sendKeys(testData.get("FRR Value Date"),Keys.TAB);
        
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsNewRecordCleanFlag_608());
        WebElement cleanFlag = applicationFinancialFacilityObj608.limitDetailsNewRecordCleanFlag_608();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
	}

	@Then("^User_608 Validate the floating rate with yield details$")
	public void validate_the_floating_rate_with_yield_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.limitDetailsFloatingRate_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsFloatingRate_608());
		String floatingRate = applicationFinancialFacilityObj608.limitDetailsFloatingRate_608().getAttribute("prevvalue");
		Assert.assertEquals(Integer.parseInt(floatingRate)>0, true);
	}
	
	
	
//	@AT_AFF_040
	@And("^User_608 clicks on the Approve level1 link$")
	public void user_clicks_on_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel1_608());
		applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel1_608().click();
	}

	@And("^User_608 search the code$")
	public void user_search_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilitySearchCode_608());
		applicationFinancialFacilityObj608.applicationFinancialFacilitySearchCode_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
	}

	@And("^User_608 double click searched record$")
	public void user_double_click_searched_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilitySearchResult_608());
		clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.applicationFinancialFacilitySearchResult_608());
	}

	@And("^User_608 clicks on the History log tap$")
	public void user_clicks_on_the_history_log_tap() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityHistoryLogTab_608());
		applicationFinancialFacilityObj608.applicationFinancialFacilityHistoryLogTab_608().click();
	}
	
	@Then("User_608 validate History log tab values should be displayed")
	public void user_validate_history_log_tab_values_should_be_displayed() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityHistoryLogValues_608());
		boolean historyLogValues = applicationFinancialFacilityObj608.applicationFinancialFacilityHistoryLogValues_608().isDisplayed();
		Assert.assertTrue(historyLogValues);
	}
	
	
	
//	AT_AFF_048
	@And("User_608 retrive the Account number in limit details")
	public void user_retrive_the_account_number_in_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsAccountNoSearch_608());
		applicationFinancialFacilityObj608.limitDetailsAccountNoSearch_608().click();
        
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsRetrieveAccountNo());
        clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.limitDetailsRetrieveAccountNo());
        
        for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsAccountNoInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	    
	}
	
	@And("^User_608 clicks on the product class add button$")
    public void user_clicks_on_the_product_class_add_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.limitDetailsProductAddBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsProductAddBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsProductAddBtn_608().click();
    }
	
	@And("User_608 clicks on the Charges details button under limit details")
	public void user_clicks_on_the_charges_details_button_under_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsChargesDetailsBtn_608());
		applicationFinancialFacilityObj608.limitDetailsChargesDetailsBtn_608().click();
	}
	
	@And("User_608 select the collect at facility approval flag")
	public void user_select_the_collect_at_facility_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCodeLabel_608());
		applicationFinancialFacilityObj608.chargesDetailsCodeLabel_608().click();
   
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCode_608());
    	
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCollectFacApprovalFlag_608());
    	WebElement chargesDetailsCollectFacApprovalFlag_608 = applicationFinancialFacilityObj608.chargesDetailsCollectFacApprovalFlag_608();
    	if(!(chargesDetailsCollectFacApprovalFlag_608.isSelected())) {
    		chargesDetailsCollectFacApprovalFlag_608.click();
    	}
	}
	
	@And("User_608 click the Ok button in Charges details under limit details")
	public void user_click_the_ok_button_in_charges_details_under_limit_details() throws Throwable {		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsOkBtn_608());
		applicationFinancialFacilityObj608.chargesDetailsOkBtn_608().click();
	}
	
	@And("^User_608 move to the Document details tab$")
    public void user_move_to_the_document_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainDocumentDetailsTab_608());
    	applicationFinancialFacilityObj608.mainDocumentDetailsTab_608().click();    	
    }

    @And("^User_608 enter the Solicitor Name$")
    public void user_enter_the_solicitor_name() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.documentDetailsSolicitorName_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.documentDetailsSolicitorName_608());
    	applicationFinancialFacilityObj608.documentDetailsSolicitorName_608().sendKeys(testData.get("Solicitor Name"),Keys.TAB);
    }

    @And("^User_608 enter the Estimator Name$")
    public void user_enter_the_estimator_name() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.documentDetailsEstimatorName_608());
    	applicationFinancialFacilityObj608.documentDetailsEstimatorName_608().sendKeys(testData.get("Estimator Name"),Keys.TAB);
    	
    }

    @And("^User_608 clicks the save button$")
    public void user_clicks_the_save_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsSaveBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsSaveBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
    }

    @And("^User_608 clicks on the validate button$")
    public void user_clicks_on_the_validate_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsValidateBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsValidateBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	// Facility already created popup
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.confirmPopup_608());
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.facilityAlreadyCreatedPopup_608());
    	applicationFinancialFacilityObj608.facilityAlreadyCreatedPopup_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.successPopup_608());
//    	String SuccessMsg = applicationFinancialFacilityObj608.successPopupMessage().getText();
    	String refCode = applicationFinancialFacilityObj608.successPopupMessage_608().getText().substring(23, 27);
    	System.err.println("Reference Number: "+refCode);
    	
    	fmsTransactionsExcelData.updateTestData("DS_AT_AFF_048", "Reference Code", refCode);
    	
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
    
    	
    	// close the send alert pop-up box
//    	Thread.sleep(5000);
//    	for (int i = 0; i < 2000; i++) {
//			try {
//		    	applicationFinancialFacilityObj608.sendAlertPopup_608().click();
//		    	break;
//			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
    	
    }
    
    @Then("User_608 clicks the Approve Level1 menu under Application for financial facilities")
    public void user_clicks_the_approve_level1_menu_under_application_for_fianancial_facilities() throws Throwable {
    	Thread.sleep(5000);
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel1_608());
    	applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel1_608().click();	
    }

    @And("User_608 enter the reference code in Approve level1")
    public void user_enter_the_reference_code_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1RefCodeInput_608());
    	applicationFinancialFacilityObj608.approveLevel1RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level1")
    public void user_double_click_on_the_retrieve_reference_code_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1RetrieveCode_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.approveLevel1RetrieveCode_608());        
    }

    @And("User_608 select the Approve level1 decision as Forward")
    public void user_select_the_approve_level1_decision_as_forward() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SelectDecisionForward_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel1SelectDecisionForward_608(), testData.get("Decision"));
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.approveLevel1SelectDecisionForward_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    
    }
    
    @And("User_608 select the Approve level1 decision as Approve")
    public void user_select_the_approve_level1_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel1SelectDecision_608(), testData.get("Decision3"));        
    }

//    @And("User_608 select the Approve level1 decision Forward to Approve level3")
//    public void user_select_the_approve_level1_decision_forward_to_approve_level3() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1DecisionForwardTo_608());
//    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel1DecisionForwardTo_608(), testData.get("Forward To"));
//    }

    @When("User_608 clicks on the Approve level1 submit button")
    public void user_clicks_on_the_approve_level1_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SubmitBtn_608());
    	applicationFinancialFacilityObj608.approveLevel1SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();        
    }
    
    
    @Then("User_608 clicks the Approve Level2 menu under Application for financial facilities")
    public void user_clicks_the_approve_level2_menu_under_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel2_608());
    	applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel2_608().click();        
    }

    @And("User_608 enter the reference code in Approve level2")
    public void user_enter_the_reference_code_in_approve_level2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel2RefCodeInput_608());
    	applicationFinancialFacilityObj608.approveLevel2RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level2")
    public void user_double_click_on_the_retrieved_reference_code_in_approve_level2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel2RetrieveRefCode_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.approveLevel2RetrieveRefCode_608());        
    }

    @And("User_608 select the Approve level2 decision as Approve")
    public void user_select_the_approve_level2_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel2SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel2SelectDecision_608(), testData.get("Decision3"));        
    }

    @When("User_608 clicks on the Approve level2 submit button")
    public void user_clicks_on_the_approve_level2_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel2SubmitBtn_608());
    	applicationFinancialFacilityObj608.approveLevel2SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
    }
    
    @Then("User_608 clicks the Approve Level3 menu under Application for financial facilities")
    public void user_clicks_the_approve_level3_menu_under_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel3_608());
    	applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel3_608().click();        
    }

    @And("User_608 enter the reference code in Approve level3")
    public void user_enter_the_reference_code_in_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel3RefCodeInput_608());
    	applicationFinancialFacilityObj608.approveLevel3RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level3")
    public void user_double_click_on_the_retrieved_reference_code_in_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel3RetrieveRefCode_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.approveLevel3RetrieveRefCode_608());        
    }

    @And("User_608 select the Approve level3 decision as Approve")
    public void user_select_the_approve_level3_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel3SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel3SelectDecision_608(), testData.get("Decision3"));        
    }

    @When("User_608 clicks on the Approve level3 submit button")
    public void user_clicks_on_the_approve_level3_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel3SubmitBtn_608());
    	applicationFinancialFacilityObj608.approveLevel3SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
    	
    	// close the send alert pop-up box
    	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.level3SendAlertPopup_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
        
    }

    
    
 // @AT_AFF_052
    @And("^User_608 clicks on the clear button under Approve level1$")
    public void user_clicks_on_the_clear_button() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SearchGrid_608());       
        for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(applicationFinancialFacilityObj608.approveLevel1ClearBtn_608(),
						applicationFinancialFacilityObj608.approveLevel1ClearBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^User_608 double clicks on the first row of approve level1$")
    public void user_double_clicks_on_the_first_row_of_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SearchedData_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.approveLevel1SearchedData_608());
    }

    @And("^User_608 move to additional details tab in approve level1$")
    public void user_move_to_additional_details_tab_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1AdditionalDetailsTab_608());
    	applicationFinancialFacilityObj608.approveLevel1AdditionalDetailsTab_608().click();
    }

    
    @When("^User_608 clicks on the BM Recommendations button$")
    public void user_clicks_on_the_bm_recommendations_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.additionalDetailsBMRecommedBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	applicationFinancialFacilityObj608.additionalDetailsBMRecommedBtn_608().click();
    }

    @Then("^User_608 validate the BM Recommendations tab should be editable$")
    public void user_validate_the_bm_recommendations_tab_is_editable_or_not() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.BMRecommedTab_608());
    	applicationFinancialFacilityObj608.BMRecommedTab_608().sendKeys(testData.get("BM Recommends"));
    	String readOnly = applicationFinancialFacilityObj608.BMRecommedTab_608().getAttribute("readonly");
    	Assert.assertNull(readOnly);
    }
    
    
    
    
 // @AT_AFF_056	
 	@And("^User_608 clicks on the Parameter module in FMS Param$")
     public void user_clicks_on_the_parameter_module() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.fmsParamParameter_608());
         applicationFinancialFacilityObj608.fmsParamParameter_608().click();
     }

     @And("^User_608 clicks on the Facility category feature under Parameter$")
     public void user_clicks_on_the_facility_category_feature() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.parameterFacilityCategory_608());
     	applicationFinancialFacilityObj608.parameterFacilityCategory_608().click();
     }

     @And("^User_608 clicks on the maintanance menu under Facility category$")
     public void user_clicks_on_the_maintanance_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.facilityCategoryMaintanance_608());
     	applicationFinancialFacilityObj608.facilityCategoryMaintanance_608().click();        
     }

     @And("^User_608 clicks on the search button under Facility category maintanance$")
     public void user_clicks_on_the_search_button() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.facilityCategoryMainSearchBtn_608());
     	applicationFinancialFacilityObj608.facilityCategoryMainSearchBtn_608().click();
     }

     @And("^User_608 double clicks on the any one row in Maintanance under Facility category$")
     public void user_double_clicks_on_the_any_one_row() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.facilityCategoryMainSearchResult());
     	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.facilityCategoryMainSearchResult());        
     }

     @And("^User_608 clicks the CIF type search option in Maintanance under Facility category$")
     public void user_clicks_the_cif_type_search_option() throws Throwable {
     	Thread.sleep(3000);
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.facilityCategoryMainCIFTypeSearchOption());
     	applicationFinancialFacilityObj608.facilityCategoryMainCIFTypeSearchOption().click();
     }

     @And("^User_608 double click on the any one value in Maintanance under Facility category$")
     public void user_double_click_on_the_any_one_value() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.facilityCategoryMainCIFTypeData());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
//     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainCIFTypeData());
     	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.facilityCategoryMainCIFTypeData());
     }
     
     @Then("^User_608 clicks on the save button and save the record in Maintanance under Facility category$")
     public void user_clicks_on_the_save_button_and_save_the_record() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.facilityCategoryMainSaveBtn());
     	applicationFinancialFacilityObj608.facilityCategoryMainSaveBtn().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
     	applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
     	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
     }
     
     
// 	@AT_AFF_075
 	@And("^User_608 clicks on the control records feature under Parameter$")
     public void user_clicks_on_the_control_records_feature() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.parameterControlRecords_608());
         applicationFinancialFacilityObj608.parameterControlRecords_608().click();
     }

     @And("^User_608 clicks on the update after approve menu under control records$")
     public void user_clicks_on_the_update_after_approve_menu() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsUpdateAfterApprove_608());
         applicationFinancialFacilityObj608.controlRecordsUpdateAfterApprove_608().click();
     }

     @And("^User_608 validate the Officer Assigned Required checkbox$")
     public void user_validate_the_officer_assigned_required_checkbox() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMainInfoOfficerAssignReqCheck_608());
     	WebElement mainInfoOfficerAssignReqCheck = applicationFinancialFacilityObj608.controlRecordsMainInfoOfficerAssignReqCheck_608();
     	Assert.assertEquals(true, mainInfoOfficerAssignReqCheck.isDisplayed());
     	
     	WebElement mainInfoOfficerAssignReqLabel = applicationFinancialFacilityObj608.controlRecordsMainInfoOfficerAssignReqLabel_608();
     	Assert.assertEquals(true, mainInfoOfficerAssignReqLabel.isDisplayed());
     }

     @And("^User_608 uncheck the Officer Assigned Required flag$")
     public void user_uncheck_the_officer_assigned_required_flag() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMainInfoOfficerAssignReqCheck_608());
     	WebElement mainInfoOfficerAssignReqCheck = applicationFinancialFacilityObj608.controlRecordsMainInfoOfficerAssignReqCheck_608();
     	if(!(mainInfoOfficerAssignReqCheck.isSelected())) {
     		mainInfoOfficerAssignReqCheck.click();
     	}
     }

     @And("^User_608 validate the Enable Markup Type checkbox$")
     public void user_validate_the_enable_markup_type_checkbox() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.controlRecordsMainInfoEnableMarkupCheck_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMainInfoEnableMarkupCheck_608());
     	WebElement mainInfoEnableMarkupCheck = applicationFinancialFacilityObj608.controlRecordsMainInfoEnableMarkupCheck_608();
     	Assert.assertEquals(true, mainInfoEnableMarkupCheck.isDisplayed());
     	
     	WebElement mainInfoOfficerAssignReqLabel = applicationFinancialFacilityObj608.controlRecordsMainInfoOfficerAssignReqLabel_608();
     	Assert.assertEquals(true, mainInfoOfficerAssignReqLabel.isDisplayed());
     }

     @And("^User_608 uncheck the Enable Markup Type flag$")
     public void user_uncheck_the_enable_markup_type_flag() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMainInfoEnableMarkupCheck_608());
     	WebElement mainInfoEnableMarkupCheck = applicationFinancialFacilityObj608.controlRecordsMainInfoEnableMarkupCheck_608();
     	if(mainInfoEnableMarkupCheck.isSelected()) {
     		mainInfoEnableMarkupCheck.click();
     	}
     }

     @And("^User_608 validate the Role of Officers Assigned menu$")
     public void user_validate_the_roll_of_officers_assigned_menu() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.controlRecordsUpdateAfterRoleOfOfficersAssigned_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	WebElement updateAfterRoleOfOfficersAssigned = applicationFinancialFacilityObj608.controlRecordsUpdateAfterRoleOfOfficersAssigned_608();
     	Assert.assertEquals(true, updateAfterRoleOfOfficersAssigned.isDisplayed());
     }

     @And("^User_608 validate the Party s History with Company menu$")
     public void user_validate_the_party_s_history_with_company_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsUpdateAfterPartysHistory_608());
     	WebElement updateAfterPartysHistory = applicationFinancialFacilityObj608.controlRecordsUpdateAfterPartysHistory_608();
     	Assert.assertEquals(true, updateAfterPartysHistory.isDisplayed());
     }

     @And("^User_608 validate the Member Countries$")
     public void user_validate_the_member_countries() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsUpdateAferMemberCountries_608());
     	WebElement updateAferMemberCountries = applicationFinancialFacilityObj608.controlRecordsUpdateAferMemberCountries_608();
     	Assert.assertEquals(true, updateAferMemberCountries.isDisplayed());
     }

     @And("^User_608 clicks on the update button under Update after approve menu in control records$")
     public void user_clicks_on_the_update_button_under_Update_after_approve_menu_in_control_records() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.controlRecordsUpdateAfterUpdateBtn_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsUpdateAfterUpdateBtn_608());
     	applicationFinancialFacilityObj608.controlRecordsUpdateAfterUpdateBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
     	applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
     	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
     }
     
     @And("^User_608 check the Officer Assigned Required flag$")
     public void user_check_the_officer_assigned_required_flag() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMainInfoOfficerAssignReqCheck_608());
     	WebElement mainInfoOfficerAssignReqCheck = applicationFinancialFacilityObj608.controlRecordsMainInfoOfficerAssignReqCheck_608();
     	if(mainInfoOfficerAssignReqCheck.isSelected()) {
     		mainInfoOfficerAssignReqCheck.click();
     	}
     }

     @And("^User_608 clicks on the approve menu under control records$")
     public void user_clicks_on_the_approve_feature() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsApproveMenu_608());
     	applicationFinancialFacilityObj608.controlRecordsApproveMenu_608().click();
     }

     @Then("^User_608 clicks on the approve button in Approve menu under control records$")
     public void user_clicks_on_the_approve_button() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.controlRecordsApproveButton_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	applicationFinancialFacilityObj608.controlRecordsApproveButton_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
     	applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
     	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
     }
     
     
     
//    @AT_AFF_074    
     @And("^User_608 clicks on the member countries tab in update after approve under control records$")
     public void user_clicks_on_the_member_countries_menu() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsUpdateAferMemberCountries_608());
         applicationFinancialFacilityObj608.controlRecordsUpdateAferMemberCountries_608().click();
     }

     @And("^User_608 clicks the add new row button under member countries tab in update after approve$")
     public void user_clicks_the_add_new_row_button() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMemberCountriesAddNewRowBtn_608());
     	applicationFinancialFacilityObj608.controlRecordsMemberCountriesAddNewRowBtn_608().click();
     }
     

     @And("^User_608 enter the country code under member countries tab in update after approve$")
     public void user_enter_the_country_code() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMemberCountriesCountryCodeLabel_608());
     	applicationFinancialFacilityObj608.controlRecordsMemberCountriesCountryCodeLabel_608().click();
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMemberCountriesCountryCode_608());
//     	applicationFinancialFacilityObj608.countryCode().sendKeys("320");
     	applicationFinancialFacilityObj608.controlRecordsMemberCountriesCountryCode_608().sendKeys(testData.get("Country Code"),Keys.ENTER);     	
     }
     
     @SuppressWarnings("unlikely-arg-type")
	@And("^User_608 clicks on the membership type dropdown under member countries tab in update after approve$")
     public void user_clicks_on_the_membership_type_dropdown() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.controlRecordsMemberCountriesMembershipTypeLabel_608());
     	List<String> membershipType = Arrays.asList("ITFC","IDB Member","Both");
     	applicationFinancialFacilityObj608.controlRecordsMemberCountriesMembershipTypeLabel_608().click();     	
     	applicationFinancialFacilityObj608.controlRecordsMemberCountriesMembershipTypeLabel_608().click();
     	
     	WebElement membershipTypeDD = applicationFinancialFacilityObj608.controlRecordsMemberCountriesMembershipTypeDropDown_608();
     	Select getValue = new Select(membershipTypeDD);
     	List<WebElement> allOptions = getValue.getOptions();
     	
     	for (int j = 0; j < allOptions.size(); j++) {
     		String text = allOptions.get(j).getText();
     		membershipType.equals(text);
        }
     	
     }
     
     
     
//   @AT_AFF_098_FMSParam
     @And("^User_608 clicks on the Facility Type feature$")
     public void user_clicks_on_the_facility_type_feature() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.paramFacilityType_608());
     	 facilityTypeObj608.paramFacilityType_608().click();
     }
     
     @And("^User_608 clicks on the update after approve menu in Facility type$")
     public void user_clicks_on_the_update_after_approve_menu_in_facility_type() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.facilityTypeUpdateAfterApprove_608());
    	 	facilityTypeObj608.facilityTypeUpdateAfterApprove_608().click();
     }
     
     @And("^User_608 enter the code value in update after approve menu$")
     public void user_enter_the_code_value_in_update_after_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.facilityTypeSearchCode_608());
     	facilityTypeObj608.facilityTypeSearchCode_608().sendKeys(testData.get("Search Code"),Keys.ENTER);
     }
     
     @And("^User_608 double click on the retrieved data in update after approve menu$")
     public void user_double_click_on_the_retrieved_data_in_update_after_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.facilityTypeSearchCodeResult_608());
     	for (int i = 0; i <= 300; i++) {
 			try {
 				clicksAndActionsHelper.doubleClick(facilityTypeObj608.facilityTypeSearchCodeResult_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
    	 	
     }
     
     @And("^User_608 clicks on the facility details tab in update after approve$")
     public void user_clicks_on_the_facility_details_tab_in_update_after_approve() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.facilityTypeFacilityDetails_608());
    	 	facilityTypeObj608.facilityTypeFacilityDetails_608().click();
     }
  
     @And("^User_608 clicks on the STP Facility Requirements option$")
     public void user_clicks_on_the_stp_facility_requirements_option() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.STPFacilityReq_608());
     	 facilityTypeObj608.STPFacilityReq_608().click();
     }

     @And("^User_608 check the Customer Grading flag$")
     public void user_check_the_customer_grading_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.customerGradingFlag_608());
     	 WebElement customerGradingFlag = facilityTypeObj608.customerGradingFlag_608();
     	 if(!(customerGradingFlag.isSelected())) {
     		 customerGradingFlag.click();
      	}
     }

     @And("^User_608 check the Overwrite Grading flag$")
     public void user_check_the_overwrite_grading_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.OverwriteGradingFlag_608());
     	 WebElement overwriteGradingFlag = facilityTypeObj608.OverwriteGradingFlag_608();
     	 if(!(overwriteGradingFlag.isSelected())) {
     		 overwriteGradingFlag.click();
      	}
     }

     @And("^User_608 check the Credit Review flag$")
     public void user_check_the_credit_review_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.creditReviewFlag_608());
     	 WebElement creditReviewFlag = facilityTypeObj608.creditReviewFlag_608();
     	 facilityTypeObj608.creditReviewFlag_608().click();
     	 if(!(creditReviewFlag.isSelected())) {
     		 creditReviewFlag.click();
      	}
     }

     @And("^User_608 check the Committee Approval flag$")
     public void user_check_the_committee_approval_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.committeeApprovalFlag_608());
     	 WebElement committeeApprovalFlag = facilityTypeObj608.committeeApprovalFlag_608();
     	 if(!(committeeApprovalFlag.isSelected())) {
     		 committeeApprovalFlag.click();
      	}
     }
     
     @And("^User_608 uncheck the Committee Approval flag$")
     public void user_uncheck_the_committee_approval_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.committeeApprovalFlag_608());
     	 WebElement committeeApprovalFlag = facilityTypeObj608.committeeApprovalFlag_608();
     	 if(committeeApprovalFlag.isSelected()) {
     		 committeeApprovalFlag.click();
      	}
     }
     

     @And("^User_608 check the Credit Authorization flag$")
     public void user_check_the_credit_authorization_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.creditAuthorzieFlag_608());
     	 WebElement creditAuthorzieFlag = facilityTypeObj608.creditAuthorzieFlag_608();
     	 if(!(creditAuthorzieFlag.isSelected())) {
     		 creditAuthorzieFlag.click();
      	}
     }

     @And("^User_608 check the Issue Facility Offer flag$")
     public void user_check_the_issue_facility_offer_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.issueFacilityOfferFlag_608());
     	 WebElement issueFacilityOfferFlag = facilityTypeObj608.issueFacilityOfferFlag_608();
     	 if(!(issueFacilityOfferFlag.isSelected())) {
     		 issueFacilityOfferFlag.click();
      	}
     }

     @And("^User_608 check the Client Response flag$")
     public void user_check_the_client_response_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.clientResponseFlag_608());
     	 WebElement clientResponseFlag = facilityTypeObj608.clientResponseFlag_608();
     	 if(!(clientResponseFlag.isSelected())) {
     		 clientResponseFlag.click();
      	}
     }

     @And("^User_608 check the Document Validation flag$")
     public void user_check_the_document_validation_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.documentValidationFlag_608());
     	 WebElement documentValidationFlag = facilityTypeObj608.documentValidationFlag_608();
     	 if(!(documentValidationFlag.isSelected())) {
     		 documentValidationFlag.click();
      	}
     }

     @And("^User_608 check the Final Approval flag$")
     public void user_check_the_final_approval_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.finalApprovalFlag_608());
     	 WebElement finalApprovalFlag = facilityTypeObj608.finalApprovalFlag_608();
     	 if(!(finalApprovalFlag.isSelected())) {
     		 finalApprovalFlag.click();
      	}
     }

     @And("^User_608 check the Create Active Facility If Within Limits flag$")
     public void user_check_the_create_active_facility_if_within_limits_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.createActiveFacilityFlag_608());
     	 WebElement createActiveFacilityFlag = facilityTypeObj608.createActiveFacilityFlag_608();
     	 if(!(createActiveFacilityFlag.isSelected())) {
     		 createActiveFacilityFlag.click();
      	}
     }

     @And("^User_608 Check the Automatically Approve Facility If Within Limits flag$")
     public void user_check_the_automatically_approve_facility_if_within_limits_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.autoApproveFacilityFlag_608());
     	 WebElement autoApproveFacilityFlag = facilityTypeObj608.autoApproveFacilityFlag_608();
     	 if(!(autoApproveFacilityFlag.isSelected())) {
     		 autoApproveFacilityFlag.click();
      	}
     }
     
     @When("^User_608 clicks on the Update button$")
     public void user_clicks_on_the_update_button() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(facilityTypeObj608.updateAfterApproveUpdateBtn_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
     	}
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.updateAfterApproveUpdateBtn_608());
     	facilityTypeObj608.updateAfterApproveUpdateBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.confirmPopupOkBtn_608());
     	facilityTypeObj608.confirmPopupOkBtn_608().click();
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.successPopupOkBtn_608());
     	facilityTypeObj608.successPopupOkBtn_608().click();
     }

     @And("^User_608 after the update go to the Approve menu$")
     public void user_after_the_update_go_to_the_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.facilityTypeApproveMenu_608());
     	facilityTypeObj608.facilityTypeApproveMenu_608().click();
     }
     
     @And("^User_608 enter the code value in Approve menu$")
     public void user_enter_the_code_value_in_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.approveSearchCode_608());
     	facilityTypeObj608.approveSearchCode_608().sendKeys(testData.get("Search Code"),Keys.ENTER);
     }

     @And("^User_608 double click on the retrieved data in Approve menu$")
     public void user_double_click_on_the_retrieved_data_in_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.approveSearchCodeResult_608());
     	clicksAndActionsHelper.doubleClick(facilityTypeObj608.approveSearchCodeResult_608());
     }
     
     @When("^User_608 clicks on the Approve button in Approve menu under Facility Type$")
     public void user_clicks_on_the_approve_button_in_approve_menu_under_facility_type() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(facilityTypeObj608.facilityTypeApproveBtn_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.facilityTypeApproveBtn_608());
     	facilityTypeObj608.facilityTypeApproveBtn_608().click();
  
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.confirmPopupOkBtn_608());
     	facilityTypeObj608.confirmPopupOkBtn_608().click();
     	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.successPopupOkBtn_608());
     	facilityTypeObj608.successPopupOkBtn_608().click();        
     }
     
     
 //  @AT_AFF_098_FMSCore
     @And("^User_608 define the marketed by field in main info tab$")
     public void user_define_the_marketed_by_field_in_main_info_tab() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainMarketedByFieldSearch_608()); 
     	applicationFinancialFacilityObj608.mainMarketedByFieldSearch_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainMarketedByValue_608());
     	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.mainMarketedByValue_608());    	
     }
     
     
//   @AT_AFF_098_CSMCore    
   @And("^User_608 clicks on the transfer of entities module$")
   public void user_clicks_on_the_transfer_of_entities_module() throws Throwable {
   	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.transferOfEntitiesModule_608());
   	applicationFinancialFacilityObj608.transferOfEntitiesModule_608().click();
   }

   @And("^User_608 clicks on the transfer of entities maintanance menu$")
   public void user_clicks_on_the_transfer_of_entities_maintanance_menu() throws Throwable {
   	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.transferEntitiesMain_608());
   	applicationFinancialFacilityObj608.transferEntitiesMain_608().click();
   }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

     
     
     /// Test data needed steps
//     @AT_FM_102
     @And("User_608 user Re_enter the no of payments in Repayment Plan tab Application Financial Facility Maintanance")
     public void user_user_re_enter_the_no_of_payments_in_repayment_plan_tab_application_financial_facility_maintanance() throws Throwable {
  		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608());
  		facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().clear();
  		facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().sendKeys(testData.get("No of Payments"),Keys.TAB);
  		
  		for(int i = 0; i <= 500; i++) {
     		try {
  				if(facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().getAttribute("prevvalue")==testData.get("No of Payments")) {
  					break;
  				}
  			} catch (Exception e) {
  				// TODO: handle exception
  			}
  		} 
         
     }
     
     
     
     
     
     

}
