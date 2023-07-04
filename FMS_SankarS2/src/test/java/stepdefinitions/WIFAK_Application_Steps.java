package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
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
import pageobjects.fms.WIFAK_ApplicationObj;
import resources.BaseClass;

public class WIFAK_Application_Steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WIFAK_ApplicationObj WIFAKapplicationObj = new WIFAK_ApplicationObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
//	ExcelData excecutionExcelData = new ExcelData(path,"TestExecution","TestCaseID");
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"Draw_Down_Request","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"IIS_Param_TestData","DataSet ID");
	Map<String, String> testData;
//	Map<String, String> executionTestData;
	
//	@AT_AFF_036
	@And("^get the test data for test case AT_AFF_036$")
    public void get_the_test_data_for_test_case_AT_AFF_036() throws Throwable {
//		executionTestData = excecutionExcelData.getTestdata("843959");
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_036");
    }
	
//	@AT_AFF_040
	@And("^get the test data for test case AT_AFF_040$")
    public void get_the_test_data_for_test_case_AT_AFF_040() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_040");
    }
	

	
////  @AT_AFF_098_FMS_Core
//	@And("^get the test data for test case AT_AFF_098_FMSCore$")
//	public void get_the_test_data_for_test_case_AT_AFF_098fmscore() throws Throwable {
//		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_098");
//	}
	

	
//  @AT_RF_014_FMSCore
    @And("^get the test data for test case AT_RF_014_FMSCore$")
    public void get_the_test_data_for_test_case_AT_RF_014fmscore() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_014");
    }
    

    


    

    


    

    
//  @AT_RF_139
    @And("get the test data for test case AT_RF_139")
    public void get_the_test_data_for_test_case_at_rf_139() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_139");
    }
    
//  @AT_RF_140
    @And("get the test data for test case AT_RF_140")
    public void get_the_test_data_for_test_case_at_rf_140() {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_140");
    }
    
	
	@And("^User clicks on the WIFAK_Application first link$")
	public void user_clicks_on_the_wifakapplication_first_link() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.wifakApplicationFirst());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationFirst());
		WIFAKapplicationObj.wifakApplicationFirst().click();
//		highlightEle.highlightElement(WIFAKapplicationObj.wifakApplicationFirst().click());
		
	}

	@And("^User clicks on the WIFAK_Application second link$")
	public void user_clicks_on_the_wifakapplication_second_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationSecond());
		WIFAKapplicationObj.wifakApplicationSecond().click();
	}

	@And("^User clicks on the Application for financial facility link$")
	public void user_clicks_on_the_application_for_financial_facility_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacility());
		WIFAKapplicationObj.applicationFinancialFacility().click();
	}

	@And("^User clicks on the Approve level1 link$")
	public void user_clicks_on_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1());
		WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1().click();
	}

	@And("^User search the code$")
	public void user_search_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchCode());
		WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys(testData.get("Search Code"));
		WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys(Keys.ENTER);

	}

	@And("^User double click searched record$")
	public void user_double_click_searched_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchResult());
		clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.applicationFinancialFacilitySearchResult());
	}

	@Then("^user clicks on the History log tap$")
	public void user_clicks_on_the_history_log_tap() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityHistoryLog());
		WIFAKapplicationObj.applicationFinancialFacilityHistoryLog().click();
	}

	// @AT_AFF_036
	@And("^User clicks the maintanance menu$")
	public void user_clicks_the_maintanance_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.appFinancialFacilityMaintanance());
		WIFAKapplicationObj.appFinancialFacilityMaintanance().click();
	}
	
	@And("^User select the application for dropdown as new facility$")
	public void user_select_the_application_for_dropdown_as_new_facility() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainApplicationForDropdown());
//		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.mainApplicationForDropdown(), "New Facility");
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.mainApplicationForDropdown(), testData.get("Application For"));
	}

	@And("^User enter the CIF No in main info tab$")
	public void user_enter_the_cif_no_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainCIFNo());
//		WIFAKapplicationObj.mainCIFNo().sendKeys("444");
		WIFAKapplicationObj.mainCIFNo().sendKeys(testData.get("CIF No"));
		WIFAKapplicationObj.mainCIFNo().sendKeys(Keys.TAB);
	}

	@And("^User enter the facility type in main info tab$")
	public void user_enter_the_facility_type_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainFacilityType());
//		WIFAKapplicationObj.mainFacilityType().sendKeys("369");
		WIFAKapplicationObj.mainFacilityType().sendKeys(testData.get("Facility Type"));
		WIFAKapplicationObj.mainFacilityType().sendKeys(Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj.mainFacilityTypeLabel().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	}

	@And("^User enter the country of financing in main info tab$")
	public void user_enter_the_country_of_financing_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainCountryOfFinancing());
//		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys("320");
		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys(testData.get("Country of Financing"));
		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys(Keys.TAB);
	}

	@And("^User enter the facility rating in main info tab$")
	public void user_enter_the_facility_rating_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainFacilityRating());
//		WIFAKapplicationObj.mainFacilityRating().sendKeys("2");
		WIFAKapplicationObj.mainFacilityRating().sendKeys(testData.get("Facility Rating"));
		WIFAKapplicationObj.mainFacilityRating().sendKeys(Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj.mainFacilityRating().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    
	}

	@And("^User clicks on the additional details tab$")
	public void user_clicks_on_the_additinal_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTab());
		for (int i = 0; i < 300; i++) {
			try {
		    	WIFAKapplicationObj.mainAdditionalTab().click();
		    	break;
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User enter the total value in additional info tab$")
	public void user_enter_the_total_value_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTabTotalValue());
//		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys("1000");
		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Total value"));
		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(Keys.TAB);
		
	}

	@And("^User enter the expire date in additional info tab$")
	public void user_enter_the_expire_date_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabExpireDate());
		WIFAKapplicationObj.additionalTabExpireDate().sendKeys(testData.get("Expire Date"),Keys.TAB);
		
	}

	@And("^User clicks the limit details tab$")
	public void user_clicks_the_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainLimitDetailsTab());
		WIFAKapplicationObj.mainLimitDetailsTab().click();
	}

	@And("^User clicks the add new record button in limit details tab$")
	public void user_clicks_the_add_new_record_button_in_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsTabAddNewRecordBtn());
		WIFAKapplicationObj.limitDetailsTabAddNewRecordBtn().click();
	}

	@And("^User enter the product class$")
	public void user_enter_the_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordProductClass());
//		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys("600");
		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(testData.get("Product Class"));
		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(Keys.TAB);
	}

	@Then("^Validate the floating rate with yield details$")
	public void validate_the_floating_rate_with_yield_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.limitDetailsFloatingRate());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsFloatingRate());
		String floatingRate = WIFAKapplicationObj.limitDetailsFloatingRate().getAttribute("prevvalue");
		Assert.assertEquals(Integer.parseInt(floatingRate)>0, true);

	}
	
	

   
    
    
    // @AT_AFF_052
//    @And("^User clicks on the clear button$")
//    public void user_clicks_on_the_clear_button() throws Throwable {
////        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clearBtn());
////        WIFAKapplicationObj.clearBtn().click();
//        
//        for (int i = 0; i <= 300; i++) {
//			try {
//				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.clearBtn(),
//						WIFAKapplicationObj.clearBtn());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    }
//
//    @And("^User double clicks on the first row of approve level1$")
//    public void user_double_clicks_on_the_first_row_of_approve_level1() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.searchedData());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.searchedData());
//    }
//
//    @And("^User move to additional details tab in approve level1$")
//    public void user_move_to_additional_details_tab_in_approve_level1() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1AdditionalDetailsTab());
//    	WIFAKapplicationObj.approveLevel1AdditionalDetailsTab().click();
//    }
//
//    
//    @When("^User clicks on the BM Recommendations button$")
//    public void user_clicks_on_the_bm_recommendations_button() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.additionalDetailsBMRecommedBtn());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	WIFAKapplicationObj.additionalDetailsBMRecommedBtn().click();
//    }
//
//    @Then("^User validate the BM Recommendations tab is editable or not$")
//    public void user_validate_the_bm_recommendations_tab_is_editable_or_not() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.BMRecommedTab());
//    	String readOnly = WIFAKapplicationObj.BMRecommedTab().getAttribute("readonly");
//    	Assert.assertNull(readOnly);
//    }

    
////  @AT_RF_040
//    @And("^User enter the down payment percentage in additional info tab$")
//    public void user_enter_the_down_payment_percentage_in_additional_info_tab() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabDownPayPercent());
//    	WIFAKapplicationObj.additionalTabDownPayPercent().sendKeys(testData.get("Down Payment %"));
//    	WIFAKapplicationObj.additionalTabDownPayPercent().sendKeys(Keys.TAB);
//    }
//
//    @And("^User enter the down payment to vendor percentage in additional info tab$")
//    public void user_enter_the_down_payment_to_vendor_percentage_in_additional_info_tab() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabDownPayToVendor());
//    	WIFAKapplicationObj.additionalTabDownPayToVendor().sendKeys(testData.get("Down Payment to Vendor %"));
//    	WIFAKapplicationObj.additionalTabDownPayToVendor().sendKeys(Keys.TAB);
//    }
//    
//    @Then("^User validate the visibility of Account No input box in limit details$")
//    public void user_validate_the_visibility_of_account_no_input_box_in_limit_details() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsAccNoInput());
//    	boolean accNoDisplayed = WIFAKapplicationObj.limitDetailsAccNoInput().isDisplayed();
//    	Assert.assertEquals(true, accNoDisplayed);
//    }
//
//    @Then("^User validate the visibility of Fund Transfer rate input box in limit details$")
//    public void user_validate_the_visibility_of_fund_transfer_rate_input_box_in_limit_details() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsFundTransferRateInput());
//    	boolean fundtransferdisplayed = WIFAKapplicationObj.limitDetailsFundTransferRateInput().isDisplayed();
//    	Assert.assertEquals(true, fundtransferdisplayed);
//    }

    
    

    
    

    
    
////  @AT_RF_157
//    @And("^User clicks on the Draw Down request module$")
//    public void user_clicks_on_the_draw_down_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationDrawDownRequest());
//    	WIFAKapplicationObj.wifakApplicationDrawDownRequest().click();
//    }
//
//    @And("^User clicks on the Maintanance under Draw Down request$")
//    public void user_clicks_on_the_maintanance_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestMaintanance());
//    	WIFAKapplicationObj.drawDownRequestMaintanance().click();        
//    }
//
//    @And("^User enter the Facility Reference in main screen under Draw Down request$")
//    public void user_enter_the_facility_reference_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainFacilityRef());
////    	WIFAKapplicationObj.drawdownMainFacilityRef().sendKeys("1469",Keys.TAB);
//    	WIFAKapplicationObj.drawdownMainFacilityRef().sendKeys(testData.get("Facility Ref"),Keys.TAB);
//    	
//    	for(int i = 0; i <= 500; i++) {
//    		try {
//				if(!(WIFAKapplicationObj.drawdownMainDateSubmitted().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}
//    	
////    	try {
////    		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownPostApprovalYesBtn());
////        	WIFAKapplicationObj.drawdownPostApprovalYesBtn().click();
////        	for(int i = 0; i <= 500; i++) {
////        		try {
////    				if(!(WIFAKapplicationObj.drawdownMainDateSubmitted().getAttribute("prevvalue").isBlank())) {
////    					break;
////    				}
////    			} catch (Exception e) {
////    				// TODO: handle exception
////    			}
////        	}
////		} catch (Exception e) {
////			// TODO: handle exception
////		}
//
//    }
//
//    @And("^User select the draw down type in main screen under Draw Down request$")
//    public void user_select_the_draw_down_type_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainDrawDownTypeLookup());
//    	WIFAKapplicationObj.drawdownMainDrawDownTypeLookup().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainDrawdownTypeValue());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.drawdownMainDrawdownTypeValue());
//    }
//
//    @And("^User enter the Description in main screen under Draw Down request$")
//    public void user_enter_the_description_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainDescription());
////    	WIFAKapplicationObj.drawdownMainDescription().sendKeys("Test");
//    	WIFAKapplicationObj.drawdownMainDescription().sendKeys(testData.get("Description"));
//    }
//    
//    @And("User click on the draw down additional details tab")
//    public void user_click_on_the_draw_down_additional_details_tab() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownAdditionalDetailsTab());
//    	WIFAKapplicationObj.drawdownAdditionalDetailsTab().click();
//    }
//
//    @And("^User select the product class in additional screen under Draw Down request$")
//    public void user_select_the_product_class_in_additional_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownAdditionalProductClassLookup());
//    	WIFAKapplicationObj.drawdownAdditionalProductClassLookup().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownAdditionalProductClassCode());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.drawdownAdditionalProductClassCode());
//    	
//    	for(int i = 0; i <= 500; i++) {
//    		try {
//				if(!(WIFAKapplicationObj.drawdownAdditionalProductClass().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}
//    }
//
//    @And("^User give the FC Amount in additional screen under Draw Down request$")
//    public void user_give_the_fc_amount_in_additional_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownAdditionalFCAmount());
//    	WIFAKapplicationObj.drawdownAdditionalFCAmount().clear();
////    	WIFAKapplicationObj.drawdownAdditionalFCAmount().sendKeys("500",Keys.TAB);
//    	WIFAKapplicationObj.drawdownAdditionalFCAmount().sendKeys(testData.get("FC Amount"),Keys.TAB);
//    	
//    	for(int i = 0; i <= 500; i++) {
//    		try {
//				if(!(WIFAKapplicationObj.drawdownAdditionalFCAmount().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}
//    }
//    
//    @And("^User enter the value date in main screen under Draw Down request$")
//    public void user_enter_the_value_date_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainInfoTab());
//    	WIFAKapplicationObj.drawdownMainInfoTab().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainValueDate());
////    	WIFAKapplicationObj.drawdownMainValueDate().sendKeys("05/01/2024",Keys.TAB);
//    	WIFAKapplicationObj.drawdownMainValueDate().sendKeys(testData.get("Value Date"),Keys.TAB);
//    }
//    
//    @When("^User click the save button under in maintanance under Draw Down request$")
//    public void user_click_the_save_button_under_in_maintanance_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainSaveBtn());
//    	WIFAKapplicationObj.drawdownMainSaveBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	// Post Approval popup
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownPostApprovalYesBtn());
//    	WIFAKapplicationObj.drawdownPostApprovalYesBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    	
//    	// Send Alert popup
//    	for (int i = 0; i < 2000; i++) {
//			try {
//		    	WIFAKapplicationObj.sendAlertPopup().click();
//		    	break;
//			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	
//    }
//    
//    
//    @Then("User click on the Verify link under Draw Down request")
//    public void user_click_on_the_verify_link_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestVerify());
//    	WIFAKapplicationObj.drawDownRequestVerify().click();
//    }
//    @And("User click on the clear button in verify under Draw Down request")
//    public void user_click_on_the_clear_button_in_verify_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownVerifyClearBtn());
//    	WIFAKapplicationObj.drawdownVerifyClearBtn().click();
//    }
//    @And("User double click on the code in verify under Draw Down request")
//    public void user_double_click_on_the_code_in_verify_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownVerifyCode());
//        clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.drawdownVerifyCode());
//    }
//    @When("User click on the verify button in Verify link under Draw Down request")
//    public void user_click_on_the_verify_button_in_verify_link_under_draw_down_request() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//        	try {
//        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj.drawDownRequestVerifyBtn());
//    				break;
//    			} catch (Exception e) {
//    				if (i == 300) {
//    					Assert.fail(e.getMessage());
//    				}
//    			}
//    	}
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestVerifyBtn());
//    	WIFAKapplicationObj.drawDownRequestVerifyBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	// Post Approval popup
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownPostApprovalYesBtn());
////    	WIFAKapplicationObj.drawdownPostApprovalYesBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    	
//    	// Send Alert popup
//    	for (int i = 0; i < 2000; i++) {
//			try {
//		    	WIFAKapplicationObj.drawdownVerifySendAlertPopup().click();
//		    	break;
//			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	
//    }
//    	
//    @Then("User click on the Approve link under Draw Down request")
//    public void user_click_on_the_approve_link_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestApprove());
//    	WIFAKapplicationObj.drawDownRequestApprove().click();
//    }
//    @And("User click on the clear button in Approve under Draw Down request")
//    public void user_click_on_the_clear_button_in_approve_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownApproveClearBtn());
//    	WIFAKapplicationObj.drawdownApproveClearBtn().click();
//    }
//    @And("User double click on the code in Approve under Draw Down request")
//    public void user_double_click_on_the_code_in_approve_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownApproveCode());
//        clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.drawdownApproveCode());
//    }
//    @When("User click on the Approve button in Approve link under Draw Down request")
//    public void user_click_on_the_approve_button_in_approve_link_under_draw_down_request() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//        	try {
//        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj.drawDownRequestApproveBtn());
//    				break;
//    			} catch (Exception e) {
//    				if (i == 300) {
//    					Assert.fail(e.getMessage());
//    				}
//    			}
//    	}
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestApproveBtn());
//    	WIFAKapplicationObj.drawDownRequestApproveBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	// Post Approval pop-up
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownPostApprovalYesBtn());
//    	WIFAKapplicationObj.drawdownPostApprovalYesBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    	
//    	
//    	
//        
//    }
//    @Then("User again clicks on the Maintanance under Draw Down request")
//    public void user_again_clicks_on_the_maintanance_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestMaintanance());
//    	WIFAKapplicationObj.drawDownRequestMaintanance().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();        
//    }
//    @And("User clicks on the search button in main screen under Draw Down request")
//    public void user_clicks_on_the_search_button_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainSearchBtn());
//    	WIFAKapplicationObj.drawdownMainSearchBtn().click();
//    }
//    @And("User click the clear button in main screen under Draw Down request")
//    public void user_click_the_clear_button_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainClearBtn());
//    	WIFAKapplicationObj.drawdownMainClearBtn().click();        
//    }
//    @And("User double click on the first line code in main screen under Draw Down request")
//    public void user_double_click_on_the_first_line_code_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainCode());
//    	WIFAKapplicationObj.drawdownMainCode().click();    	
//    }
//    @And("User click on the Status Details button in main screen under Draw Down request")
//    public void user_click_on_the_status_details_button_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainStatusDetailsBtn());
//    	WIFAKapplicationObj.drawdownMainStatusDetailsBtn().click();        
//    }
//    @And("User verify the Status Details tab User Name in main screen under Draw Down request")
//    public void user_verify_the_status_details_tab_user_name_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainStatusDetailsTab());
//    	String userName = WIFAKapplicationObj.drawdownMainStatusDetailsUserName().getAttribute("title");
//    	System.out.println("User Name: "+ userName);
//    }
//    
//    
//    @Then("User clicks on the Facility Closure Request module")
//    public void user_clicks_on_the_facility_closure_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationFacilityClosureRequest());
//    	WIFAKapplicationObj.wifakApplicationFacilityClosureRequest().click();
//    }
//    @And("User click on the Maintanance under Facility Closure Request module")
//    public void user_click_on_the_maintanance_under_facility_closure_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureRequestMaintanance());
//    	WIFAKapplicationObj.facilityClosureRequestMaintanance().click();
//    }
//    @And("User enter the Facility ref in main screen under Facility Closure Request")
//    public void user_enter_the_facility_ref_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainFacilityRef());
//    	WIFAKapplicationObj.facilityClosureMainFacilityRef().sendKeys("1336",Keys.TAB);
//    }
//    @And("User enter the Closure reason in main screen under Facility Closure Request")
//    public void user_enter_the_closure_reason_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainClosureReason());
//    	WIFAKapplicationObj.facilityClosureMainClosureReason().sendKeys("test");
//    }
//    @And("User click on the Save button in main screen under Facility Closure Request")
//    public void user_click_on_the_save_button_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainSaveBtn());
//    	WIFAKapplicationObj.facilityClosureMainSaveBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainSendAlertPopup());
//    	WIFAKapplicationObj.facilityClosureMainSendAlertPopup().click();
//    }
//
//    @Then("User clicks on the Approve under Facility Closure Request module")
//    public void user_clicks_on_the_approve_under_facility_closure_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureRequestApprove());
//    	WIFAKapplicationObj.facilityClosureRequestApprove().click();
//    }
//    @And("User click on the clear button in approve screen under Facility Closure Request")
//    public void user_click_on_the_clear_button_in_approve_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureApproveClearBtn());
//    	WIFAKapplicationObj.facilityClosureApproveClearBtn().click();
//    }
//    @And("User double click on the code in approve screen under Facility Closure Request")
//    public void user_double_click_on_the_code_in_approve_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureApproveCode());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.facilityClosureApproveCode());
//    }
//    @When("User click on the Approve button in approve screen under Facility Closure Request")
//    public void user_click_on_the_approve_button_in_approve_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureApproveBtn());
//    	WIFAKapplicationObj.facilityClosureApproveBtn().click();
//        
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    }
//    
//    @Then("User again click the Maintanance under Facility Closure Request module")
//    public void user_again_click_the_maintanance_under_facility_closure_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureRequestMaintanance());
//    	WIFAKapplicationObj.facilityClosureRequestMaintanance().click();
//        
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();        
//    }
//    @And("User click on the search button in main screen under Facility Closure Request")
//    public void user_click_on_the_search_button_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainSearchBtn());
//    	WIFAKapplicationObj.facilityClosureMainSearchBtn().click();
//        
//    }
//    @And("User double click on the code in main screen under Facility Closure Request")
//    public void user_double_click_on_the_code_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainCode());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.facilityClosureMainCode());
//        
//    }
//    @And("User click the Status details button in main screen under Facility Closure Request")
//    public void user_click_the_status_details_button_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainStatusDetailsBtn());
//    	WIFAKapplicationObj.facilityClosureMainStatusDetailsBtn().click();
//        
//    }
//    @Then("User verify the Status details tab in main screen under Facility Closure Request")
//    public void user_verify_the_status_details_tab_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainStatusDetailsTab());
//    	WIFAKapplicationObj.facilityClosureMainStatusDetailsTab().click();
//        
//    }
    
    
//    @AT_RF_139
    @And("User clicks the all critical checkboxes in document checklist")
    public void user_clicks_the_all_critical_checkboxes_in_document_checklist() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistCriticalCheck());
    	
    	List<WebElement> checkboxes = driver.findElements(By.xpath("//td[@tdlabel='Critical']//input"));  
    	for (int i = 0; i < checkboxes.size(); i++) {
    		checkboxes.get(i).click();
		}
    	
    }
    
    @And("User clicks the limit details tab under approve level1")
    public void user_clicks_the_limit_details_tab_under_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1LimitDetailsTab());
    	WIFAKapplicationObj.approveLevel1LimitDetailsTab().click();
    	
    }
       

    @And("User select the product class in limit details under approve level1")
    public void user_select_the_product_class_in_limit_details_under_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1LimitDetailsProductRow());
    	WIFAKapplicationObj.approveLevel1LimitDetailsProductRow().click();
    }

    @And("User click the document checklist button under limit details in approve level1")
    public void user_click_the_document_checklist_button_under_limit_details_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1LimitDetailsDocChecklistBtn());
    	WIFAKapplicationObj.approveLevel1LimitDetailsDocChecklistBtn().click();
    }

    @And("User click the ok button in document checklist under limit details")
    public void user_click_the_ok_button_in_document_checklist_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1LimitDetailsDocChecklistRow());
    	WIFAKapplicationObj.limitDetailsDocumentChecklistOkBtn().click();
    }
    
    
    
//  @AT_RF_140
    @And("User select the second row in document checklist tab")
    public void user_select_the_second_row_in_document_checklist_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistRow2());
    	WIFAKapplicationObj.limitDetailsDocumentChecklistRow2().click();
    }

    @And("User give the file in choose file input under document checklist tab")
    public void user_give_the_file_in_choose_file_input_under_document_checklist_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistChooseFileInput());
//    	WIFAKapplicationObj.limitDetailsDocumentChecklistChooseFileInput().sendKeys("C:\\Users\\inindc00608\\Desktop\\FMSTest.txt");
    	WIFAKapplicationObj.limitDetailsDocumentChecklistChooseFileInput().sendKeys(testData.get("File Location"));
    }

    @And("User click the Upload docs button under document checklist tab")
    public void user_click_the_upload_docs_button_under_document_checklist_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistUploadDocsBtn());
    	WIFAKapplicationObj.limitDetailsDocumentChecklistUploadDocsBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("User validate the Attachment flag is checked in second row under document checklist tab")
    public void user_validate_the_attachment_flag_is_checked_in_second_row_under_document_checklist_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistAttachFlag());
    	boolean flagSelected = WIFAKapplicationObj.limitDetailsDocumentChecklistAttachFlag().isSelected();
    	Assert.assertEquals(true, flagSelected);
    }

    
    @And("User click the second row of checklist under limit details in approve level1")
    public void user_click_the_second_row_of_checklist_under_limit_details_in_approve_level1() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistRow2());
    	WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistRow2().click();
    }

    @And("User click the View button in checklist under limit details in approve level1")
    public void user_click_the_view_button_in_checklist_under_limit_details_in_approve_level1() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewBtn());
    	WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewBtn().click();
    }

    @And("User vaidate the rows are available in View tab under document checklist")
    public void user_vaidate_the_rows_are_available_in_view_tab_under_document_checklist() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewRow1());
    	boolean rowDisplayed = WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewRow1().isDisplayed();
    	System.out.println("Row are available: "+rowDisplayed);
    }

    @And("User close the View tab in document checklist under approve level1 limit details")
    public void user_close_the_view_tab_in_document_checklist_under_approve_level1_limit_details() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewClose());
    	WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewClose().click();
    }



}
