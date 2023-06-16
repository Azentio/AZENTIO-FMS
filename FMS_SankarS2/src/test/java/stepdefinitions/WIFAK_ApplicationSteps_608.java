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
import pageobjects.fms.WIFAK_ApplicationObj_608;
import pageobjects.fmsParam.Facility_TypeObj_608;
import resources.BaseClass;

public class WIFAK_ApplicationSteps_608 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WIFAK_ApplicationObj_608 WIFAKapplicationObj608 = new WIFAK_ApplicationObj_608(driver);
	Facility_TypeObj_608 facilityTypeObj608 = new Facility_TypeObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
	Map<String, String> testData;
	
//	@AT_AFF_036
	@And("^User_608 get the test data for test case AT_AFF_036$")
    public void get_the_test_data_for_test_case_AT_AFF_036() throws Throwable {
//		executionTestData = excecutionExcelData.getTestdata("843959");
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_036");
    }
	
//	@AT_AFF_040
	@And("^User_608 get the test data for test case AT_AFF_040$")
    public void get_the_test_data_for_test_case_AT_AFF_040() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_040");
    }
	
//  @AT_RF_098_User_VAK
    @And("^User_VAK get the test data for test case AT_RF_098_User_VAK$")
    public void User_VAK_get_the_test_data_for_test_case_AT_RF_098User_VAK() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_098");
    }
	
//    @AT_RF_098_User_608
    @And("^User_608 get the test data for test case AT_RF_098_User_608$")
    public void get_the_test_data_for_test_case_AT_RF_098user2() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_098");
    }

//  @AT_RF_100
    @And("^User_608 get the test data for test case AT_RF_100$")
    public void get_the_test_data_for_test_case_AT_RF_100() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_100");
    }
    
//  @AT_RF_102
    @And("^User_608 get the test data for test case AT_RF_102$")
    public void get_the_test_data_for_test_case_AT_RF_102() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_102");
    }
    
//  @AT_RF_014_FMSCore
    @And("^User_608 get the test data for test case AT_RF_014_FMSCore$")
    public void get_the_test_data_for_test_case_AT_RF_014fmscore() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_014");
    }
    
//	@AT_FM_038_FMSCore
	@And("^User_608 get the test data for test case AT_FM_038_FMSCore$")
    public void get_the_test_data_for_test_case_AT_FM_038_FMSCore() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_038");
    }
    
//	@AT_FM_058
	@And("User_608 get the test data for test case AT_FM_058")
	public void user_get_the_test_data_for_test_case_AT_FM_058() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_058");
	}
    
	
	
	
	
//	@AT_AFF_036	
	@And("^User_608 clicks on the WIFAK_Application first link$")
	public void user_clicks_on_the_wifakapplication_first_link() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.wifakApplicationFirst_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApplicationFirst_608());
		WIFAKapplicationObj608.wifakApplicationFirst_608().click();		
	}

	@And("^User_608 clicks on the WIFAK_Application second link$")
	public void user_clicks_on_the_wifakapplication_second_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApplicationSecond_608());
		WIFAKapplicationObj608.wifakApplicationSecond_608().click();
	}

	@And("^User_608 clicks on the Application for financial facility link$")
	public void user_clicks_on_the_application_for_financial_facility_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacility_608());
		WIFAKapplicationObj608.applicationFinancialFacility_608().click();
	}
	
	@And("^User_608 clicks the maintanance menu under Application for financial facility$")
	public void user_clicks_the_maintanance_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.appFinancialFacilityMaintanance_608());
		WIFAKapplicationObj608.appFinancialFacilityMaintanance_608().click();
	}
	
	@And("^User_608 select the application for dropdown as new facility$")
	public void user_select_the_application_for_dropdown_as_new_facility() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainApplicationForDropdown_608());
//		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.mainApplicationForDropdown_608(), "New Facility");
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.mainApplicationForDropdown_608(), testData.get("Application For"));
	}

	@And("^User_608 enter the CIF No in main info tab$")
	public void user_enter_the_cif_no_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainCIFNo_608());
//		WIFAKapplicationObj608.mainCIFNo_608().sendKeys("444");
		WIFAKapplicationObj608.mainCIFNo_608().sendKeys(testData.get("CIF No"),Keys.TAB);
	}

	@And("^User_608 enter the facility type in main info tab$")
	public void user_enter_the_facility_type_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainFacilityType_608());
//		WIFAKapplicationObj608.mainFacilityType().sendKeys("369");
		WIFAKapplicationObj608.mainFacilityType_608().sendKeys(testData.get("Facility Type"),Keys.TAB);

		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj608.mainFacilityTypeLabel_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	}

	@And("^User_608 enter the country of financing in main info tab$")
	public void user_enter_the_country_of_financing_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainCountryOfFinancing_608());
//		WIFAKapplicationObj608.mainCountryOfFinancing().sendKeys("320");
		WIFAKapplicationObj608.mainCountryOfFinancing_608().sendKeys(testData.get("Country of Financing"),Keys.TAB);
	}

	@And("^User_608 enter the facility rating in main info tab$")
	public void user_enter_the_facility_rating_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainFacilityRating_608());
//		WIFAKapplicationObj608.mainFacilityRating().sendKeys("2");
		WIFAKapplicationObj608.mainFacilityRating_608().sendKeys(testData.get("Facility Rating"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj608.mainFacilityRating_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    
	}

	@And("^User_608 clicks on the additional details tab$")
	public void user_clicks_on_the_additinal_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainAdditionalTab_608());
		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj608.mainAdditionalTab_608().click();
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
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainAdditionalTabTotalValue_608());
//		WIFAKapplicationObj608.mainAdditionalTabTotalValue().sendKeys("1000");
		WIFAKapplicationObj608.mainAdditionalTabTotalValue_608().sendKeys(testData.get("Total value"),Keys.TAB);		
	}

	@And("^User_608 enter the expire date in additional info tab$")
	public void user_enter_the_expire_date_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.additionalTabExpireDate_608());
		WIFAKapplicationObj608.additionalTabExpireDate_608().sendKeys(testData.get("Expire Date"),Keys.TAB);
		
	}

	@And("^User_608 clicks the limit details tab$")
	public void user_clicks_the_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainLimitDetailsTab_608());
		WIFAKapplicationObj608.mainLimitDetailsTab_608().click();
	}

	@And("^User_608 clicks the add new record button in limit details tab$")
	public void user_clicks_the_add_new_record_button_in_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsTabAddNewRecordBtn_608());
		WIFAKapplicationObj608.limitDetailsTabAddNewRecordBtn_608().click();
	}

	@And("^User_608 enter the product class$")
	public void user_enter_the_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608());
//		WIFAKapplicationObj608.limitDetailsNewRecordProductClass().sendKeys("600");
		WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608().sendKeys(testData.get("Product Class"),Keys.TAB);
	}

	@Then("^User_608 Validate the floating rate with yield details$")
	public void validate_the_floating_rate_with_yield_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.limitDetailsFloatingRate_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsFloatingRate_608());
		String floatingRate = WIFAKapplicationObj608.limitDetailsFloatingRate_608().getAttribute("prevvalue");
		Assert.assertEquals(Integer.parseInt(floatingRate)>0, true);
	}
	
	
//	@AT_AFF_040
	@And("^User_608 clicks on the Approve level1 link$")
	public void user_clicks_on_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel1_608());
		WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel1_608().click();
	}

	@And("^User_608 search the code$")
	public void user_search_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilitySearchCode_608());
		WIFAKapplicationObj608.applicationFinancialFacilitySearchCode_608().sendKeys(testData.get("Search Code"),Keys.ENTER);
	}

	@And("^User_608 double click searched record$")
	public void user_double_click_searched_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilitySearchResult_608());
		clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.applicationFinancialFacilitySearchResult_608());
	}

	@Then("^User_608 clicks on the History log tap$")
	public void user_clicks_on_the_history_log_tap() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityHistoryLog_608());
		WIFAKapplicationObj608.applicationFinancialFacilityHistoryLog_608().click();
	}
	

//  @AT_RF_098_User_VAK
	@And("^User_VAK clicks on the WIFAK_Application first link$")
    public void User_VAK_clicks_on_the_wifakapplication_first_link() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.wifakApplicationFirst_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApplicationFirst_608());
		WIFAKapplicationObj608.wifakApplicationFirst_608().click();
    }

    @And("^User_VAK clicks on the WIFAK_Application second link$")
    public void User_VAK_clicks_on_the_wifakapplication_second_link() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApplicationSecond_608());
		WIFAKapplicationObj608.wifakApplicationSecond_608().click();
    }

    @And("^User_VAK clicks on the approval committe recommedation menu$")
    public void User_VAK_clicks_on_the_approval_committe_recommedation_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsMenu_608());
    	WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsMenu_608().click();
    }

    @And("^User_VAK clicks on the clear button in approval committe recommedations menu$")
    public void User_VAK_clicks_on_the_clear_button_in_approval_committe_recommedations_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeClearBtn());
    	WIFAKapplicationObj608.wifakApprovalCommitteeClearBtn().click();
    }

    @And("^User_VAK double click on the any one record in approval committe recommedations menu$")
    public void User_VAK_double_click_on_the_any_one_record_in_approval_committe_recommedations_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeSelectRow());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.wifakApprovalCommitteeSelectRow());
    }

    @And("^User_VAK clicks on the Recommend button in approval committe recommedations menu$")
    public void User_VAK_clicks_on_the_recommend_button_in_approval_committe_recommedations_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsCode());
    	for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608());
		WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608().click();
		
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
    	
    }

    @And("^User_VAK click the User_VAK recommended by name in recommend box$")
    public void User_VAK_click_the_User_VAK_recommended_by_name_in_recommend_box() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.wifakApprovalCommitteeRecommendByLabel_VAK());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendByLabel_VAK());
    	WIFAKapplicationObj608.wifakApprovalCommitteeRecommendByLabel_VAK().click();
    }

    @And("^User_VAK select the recommendation as approve in recommend box$")
    public void User_VAK_select_the_recommendation_as_approve_in_recommend_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationDropdown_608());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationDropdown_608(), testData.get("Decision3"));
    }

    @And("^User_VAK click the comment code lookup option in recommend box$")
    public void User_VAK_click_the_comment_code_lookup_option_in_recommend_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationDropdownOption_608());
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj608.approvalCommitteeCommentCodeLookup_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

    }

    @And("^User_VAK double click the first row of comment code lookup in recommend box$")
    public void User_VAK_double_click_the_first_row_of_comment_code_lookup_in_recommend_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeCommentCodeLookupFirstRow_608());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.wifakApprovalCommitteeCommentCodeLookupFirstRow_608());
    }

    @And("^User_VAK clicks the more comments button in recommend box$")
    public void User_VAK_clicks_the_more_comments_button_in_recommend_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeMoreCommentsBtn_608());
    	WIFAKapplicationObj608.wifakApprovalCommitteeMoreCommentsBtn_608().click();
    }

    @And("^User_VAK enter the some comments in more comments$")
    public void User_VAK_enter_the_some_comments_in_more_comments() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeMoreCommentsInput_608());
    	WIFAKapplicationObj608.wifakApprovalCommitteeMoreCommentsInput_608().sendKeys(testData.get("More Comments"));
    }

    @And("^User_VAK click the Ok button in more comments$")
    public void User_VAK_click_the_ok_button_in_more_comments() throws Throwable {
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj608.wifakApprovalCommitteeMoreCommentsOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

    }
    
    @When("^User_VAK click the Ok button in recommend box$")
    public void User_VAK_click_the_ok_button_in_recommend_box() throws Throwable {
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj608.wifakApprovalCommitteeOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}    	

    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.successPopup_608());
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.successPopupMessage_608());
    	String SuccessMsg = WIFAKapplicationObj608.successPopupMessage_608().getText().substring(23, 27);
    	fmsTransactionsExcelData.updateTestData("DS_AT_RF_098", "Search Code", SuccessMsg);
    	
    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
    }

    
    
//  @AT_RF_098_User_608
    @And("^User_608 clicks on the search button in Application for financial facility main screen$")
    public void user_clicks_on_the_search_button_in_application_for_financial_facility_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilitySearchBtn_608());
    	WIFAKapplicationObj608.applicationFinancialFacilitySearchBtn_608().click();
    }

    @And("^User_608 search the code in Application for financial facility main screen$")
    public void user_search_the_code_in_application_for_financial_facility_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilitySearchCode_608());
    	WIFAKapplicationObj608.applicationFinancialFacilitySearchCode_608().sendKeys(testData.get("Search Code"),Keys.ENTER);
    }

    @And("^User_608 double click searched record in Application for financial facility main screen$")
    public void user_double_click_searched_record_in_application_for_financial_facility_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilitySearchResult_608());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.applicationFinancialFacilitySearchResult_608());
    }

    @And("^User_608 clicks on the Approval committee button$")
    public void user_clicks_on_the_approval_committee_button() throws Throwable {
    	for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeBtn_608());
    	WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeBtn_608().click();
    }

    @And("^User_608 click the User1 name in Recommented by column$")
    public void user_click_the_user1_name_in_recommented_by_column() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeRecommendByLabel_608());
    	WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeRecommendByLabel_608().click();
    }

    @And("^User_608 clicks on the more comments button$")
    public void user_clicks_on_the_more_comments_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeMoreCommentsBtn_608());
    	WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeMoreCommentsBtn_608().click();
    }

    @Then("^User_608 validate the more comments text in input field$")
    public void user_validate_the_more_comments_text_in_input_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeMoreCommentsText_608());
    	String text = WIFAKapplicationObj608.applicationFinancialFacilityApprovalCommittieeMoreCommentsText_608().getAttribute("prevvalue");
    	System.out.println("More Comments Text: "+ text);
    	Assert.assertEquals(testData.get("More Comments"), text);
    }
    
	
	
//   @AT_RF_100
    @And("^User_608 select the application for dropdown as decrease in main screen$")
    public void user_select_the_application_for_dropdown_as_decrease_in_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainApplicationForDropdown_608());
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.mainApplicationForDropdown_608(), testData.get("Application For"));
    }

    @And("^User_608 enter the input as Existing Facility Ref in main screen$")
    public void user_enter_the_input_as_existing_facility_ref_in_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainExistingFacilityRef_608());
//    	WIFAKapplicationObj608.mainExistingFacilityRef_608().sendKeys(testData.get("Facility Ref"));
    	WIFAKapplicationObj608.mainExistingFacilityRef_608().sendKeys("1390");
    	WIFAKapplicationObj608.mainExistingFacilityRef_608().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 300; i++) {
    		try {
				if(!(WIFAKapplicationObj608.mainExistingFacilityRef_608().getAttribute("readonly").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    	

    }
    
    @And("^User_608 enter the total value under additional info tab$")
    public void user_enter_the_total_value_under_additional_info_tab() throws Throwable {    	
    	// First We get the Finance amount without total amount
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.additionalTabFinanceAmount_608());
    	String beforeFinanceAmount = WIFAKapplicationObj608.additionalTabFinanceAmount_608().getAttribute("prevvalue");
//    	System.out.println("Before Finance Amount: "+ beforeFinanceAmount);
    	fmsTransactionsExcelData.updateTestData("DS01_582426", "Finance Amount", beforeFinanceAmount);
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainAdditionalTabTotalValue_608());
		WIFAKapplicationObj608.mainAdditionalTabTotalValue_608().sendKeys(testData.get("Total value"));
		WIFAKapplicationObj608.mainAdditionalTabTotalValue_608().sendKeys(Keys.TAB);
		Thread.sleep(3000);
    }

    @And("^User_608 validate the finance amount should be decresed based on total value$")
    public void user_validate_the_finance_amount_should_be_decresed_based_on_total_value() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS01_582426");
    	String financeAmount = testData.get("Finance Amount");
    	String totalValue = testData.get("Total value");
    	
    	String afterFinanceAmount = WIFAKapplicationObj608.additionalTabFinanceAmount_608().getAttribute("prevvalue");
    	String[] splitFinaceAmount  = afterFinanceAmount.split("[.]");
    	String finalFinaceAmount = splitFinaceAmount[0].replace(",", "");
//    	System.out.println("Finance Amount: "+finalFinaceAmount);
//    	System.out.println("After Finance Amount: "+afterFinanceAmount);
    	
    	int cvValue = Integer.parseInt(financeAmount)-Integer.parseInt(totalValue);
    	String cvValueText = String.valueOf(cvValue);
    	fmsTransactionsExcelData.updateTestData("DS01_582426", "CV Value", cvValueText);
    	
    	Assert.assertEquals(cvValueText, finalFinaceAmount);
    	
    }

    @And("^User_608 validate the Facility value and CV value should be changed same as decreased finance amount under limit details$")
    public void user_validate_the_facility_value_and_cv_value_should_be_changed_same_as_decreased_finance_amount_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductFacilityValue_608());
    	String facilityValue = WIFAKapplicationObj608.limitDetailsProductFacilityValue_608().getAttribute("title");
    	String[] splitFacilityValue  = facilityValue.split("[.]");
    	String finalFacilityValue = splitFacilityValue[0].replace(",", "");
    	
    	testData = fmsTransactionsExcelData.getTestdata("DS01_582426");
    	Assert.assertEquals(testData.get("CV Value"), finalFacilityValue);
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductCVValue_608());
    	String CVValue = WIFAKapplicationObj608.limitDetailsProductCVValue_608().getAttribute("title");
    	String[] splitCVValue  = CVValue.split("[.]");
    	String finalCVValue = splitCVValue[0].replace(",", "");
    	
    	Assert.assertEquals(testData.get("CV Value"), finalCVValue);
    	
    }

    @And("^User_608 double click on the product class under limit details$")
    public void user_double_click_on_the_product_class_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductFacilityValue_608());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.limitDetailsProductFacilityValue_608());
    }
    
    @And("^User_608 click the clean flag under product calss in limit details tab$")
    public void user_click_the_clean_flag_under_product_calss_in_limit_details_tab() throws Throwable {
    	// check the clean flag
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608());
        WebElement cleanFlag = WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
    }
    
    @And("^User_608 click the edit button under product class in limit details tab$")
    public void user_click_the_edit_button_under_product_class_in_limit_details_tab() throws Throwable {
    	
    	for (int i = 0; i <= 300; i++) {
        	try {
        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.limitDetailsProductEditBtn_608());
    				break;
    			} catch (Exception e) {
    				if (i == 300) {
    					Assert.fail(e.getMessage());
    				}
    			}
    	}
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductEditBtn_608());
        WIFAKapplicationObj608.limitDetailsProductEditBtn_608().click();
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //////////////////////////////////////
    
    @And("^User_608 enter the product class details$")
    public void user_enter_the_product_class_details() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608());
        WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608().sendKeys(testData.get("Product Class"),Keys.TAB);        
        
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608());
        WebElement cleanFlag = WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
        
    }
    
    @And("^User_608 clicks on the product class add button$")
    public void user_clicks_on_the_product_class_add_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.limitDetailsProductAddBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductAddBtn_608());
    	WIFAKapplicationObj608.limitDetailsProductAddBtn_608().click();
    }
    
    @And("^User_608 move to the Document details tab$")
    public void user_move_to_the_document_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainDocumentDetailsTab_608());
    	WIFAKapplicationObj608.mainDocumentDetailsTab_608().click();
    	
    }

    @And("^User_608 enter the Solicitor Name$")
    public void user_enter_the_solicitor_name() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.documentDetailsSolicitorName_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.documentDetailsSolicitorName_608());
    	WIFAKapplicationObj608.documentDetailsSolicitorName_608().sendKeys("1",Keys.TAB);;
    }

    @And("^User_608 enter the Estimator Name$")
    public void user_enter_the_estimator_name() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.documentDetailsEstimatorName_608());
    	WIFAKapplicationObj608.documentDetailsEstimatorName_608().sendKeys("1",Keys.TAB);
    	
    }

    @And("^User_608 clicks the save button$")
    public void user_clicks_the_save_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsSaveBtn_608());
    	WIFAKapplicationObj608.limitDetailsSaveBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
    }

    @And("^User_608 clicks on the validate button$")
    public void user_clicks_on_the_validate_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsValidateBtn_608());
    	WIFAKapplicationObj608.limitDetailsValidateBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
    	
    	// Facility already created popup
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.confirmPopup_608());
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.facilityAlreadyCreatedPopup_608());
    	WIFAKapplicationObj608.facilityAlreadyCreatedPopup_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.successPopup_608());
//    	String SuccessMsg = WIFAKapplicationObj608.successPopupMessage().getText();
    	String refCode = WIFAKapplicationObj608.successPopupMessage_608().getText().substring(23, 27);
    	System.err.println("Reference Number: "+refCode);
    	fmsTransactionsExcelData.updateTestData("DS_AT_FM_038", "Reference Code", refCode);
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    
    	
    	// close the send alert pop-up box
//    	Thread.sleep(5000);
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj608.sendAlertPopup_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }
    
    @Then("User_608 clicks the Approve Level1 menu under Application for financial facilities")
    public void user_clicks_the_approve_level1_menu_under_application_for_fianancial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel1_608());
    	WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel1_608().click();	
    }

    @And("User_608 enter the reference code in Approve level1")
    public void user_enter_the_reference_code_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1RefCodeInput_608());
    	WIFAKapplicationObj608.approveLevel1RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level1")
    public void user_double_click_on_the_retrieve_reference_code_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1RetrieveCode_608());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.approveLevel1RetrieveCode_608());        
    }

    @And("User_608 select the Approve level1 decision as Forward")
    public void user_select_the_approve_level1_decision_as_forward() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1SelectDecisionForward_608());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel1SelectDecisionForward_608(), testData.get("Decision"));
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj608.approveLevel1SelectDecisionForward_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    
    }
    
    @And("User_608 select the Approve level1 decision as Approve")
    public void user_select_the_approve_level1_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel1SelectDecision_608(), testData.get("Decision3"));        
    }

    @And("User_608 select the Approve level1 decision Forward to Approve level3")
    public void user_select_the_approve_level1_decision_forward_to_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1DecisionForwardTo_608());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel1DecisionForwardTo_608(), testData.get("Forward To"));
    }

    @When("User_608 clicks on the Approve level1 submit button")
    public void user_clicks_on_the_approve_level1_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1SubmitBtn_608());
    	WIFAKapplicationObj608.approveLevel1SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();        
    }
    
    
    @Then("User_608 clicks the Approve Level2 menu under Application for financial facilities")
    public void user_clicks_the_approve_level2_menu_under_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel2_608());
    	WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel2_608().click();        
    }

    @And("User_608 enter the reference code in Approve level2")
    public void user_enter_the_reference_code_in_approve_level2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel2RefCodeInput_608());
    	WIFAKapplicationObj608.approveLevel2RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level2")
    public void user_double_click_on_the_retrieved_reference_code_in_approve_level2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel2RetrieveRefCode_608());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.approveLevel2RetrieveRefCode_608());        
    }

    @And("User_608 select the Approve level2 decision as Approve")
    public void user_select_the_approve_level2_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel2SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel2SelectDecision_608(), testData.get("Decision3"));        
    }

    @When("User_608 clicks on the Approve level2 submit button")
    public void user_clicks_on_the_approve_level2_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel2SubmitBtn_608());
    	WIFAKapplicationObj608.approveLevel2SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
    }
    
    @Then("User_608 clicks the Approve Level3 menu under Application for financial facilities")
    public void user_clicks_the_approve_level3_menu_under_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel3_608());
    	WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel3_608().click();        
    }

    @And("User_608 enter the reference code in Approve level3")
    public void user_enter_the_reference_code_in_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel3RefCodeInput_608());
    	WIFAKapplicationObj608.approveLevel3RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level3")
    public void user_double_click_on_the_retrieved_reference_code_in_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel3RetrieveRefCode_608());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.approveLevel3RetrieveRefCode_608());        
    }

    @And("User_608 select the Approve level3 decision as Approve")
    public void user_select_the_approve_level3_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel3SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel3SelectDecision_608(), testData.get("Decision3"));        
    }

    @When("User_608 clicks on the Approve level3 submit button")
    public void user_clicks_on_the_approve_level3_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel3SubmitBtn_608());
    	WIFAKapplicationObj608.approveLevel3SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
    	
    	// close the send alert pop-up box
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj608.level3SendAlertPopup_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
        
    }

    

//  @AT_RF_102
    @And("^User_608 select the Item in limit Details$")
    public void user_select_the_item_in_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsItem_608());
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.limitDetailsItem(), "Import L/C");
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.limitDetailsItem_608(), testData.get("Limit Details Item"));
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User_608 select the Maturity date in limit Details$")
    public void user_select_the_maturity_date_in_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsMaturityDateCalender_608());
    	WIFAKapplicationObj608.limitDetailsMaturityDateCalender_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsItem_608());
    	WIFAKapplicationObj608.limitDetailsMaturityDate_608().click();
    	
    	// check the Clean flag
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608());
        WebElement cleanFlag = WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
    }

    @And("^User_608 enter the Margin rate in limit Details$")
    public void user_enter_the_margin_rate_in_limit_details() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
        	try {
        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.limitDetailsMarginRateInput_608());
    				break;
    			} catch (Exception e) {
    				if (i == 300) {
    					Assert.fail(e.getMessage());
    				}
    			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsMarginRateInput_608());
//    	WIFAKapplicationObj608.limitDetailsMarginRateInput().sendKeys("2");
    	WIFAKapplicationObj608.limitDetailsMarginRateInput_608().sendKeys(testData.get("Margin Rate"));
    	WIFAKapplicationObj608.limitDetailsMarginRateInput_608().sendKeys(Keys.TAB);
        
    }
    
    @And("^User_608 clicks the validate button$")
    public void user_clicks_the_validate_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsValidateBtn_608());
    	WIFAKapplicationObj608.limitDetailsValidateBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
    	
    	// Facility already created popup
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.confirmPopup_608());
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.facilityAlreadyCreatedPopup_608());
    	WIFAKapplicationObj608.facilityAlreadyCreatedPopup_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.successPopup_608());
//    	String SuccessMsg = WIFAKapplicationObj608.successPopupMessage().getText();
    	String refCode = WIFAKapplicationObj608.successPopupMessage_608().getText().substring(23, 27);
    	System.err.println("Reference Number: "+refCode);
    	fmsTransactionsExcelData.updateTestData("DS_AT_AFF_048", "Reference Code", refCode);
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    
    	
    	// close the send alert pop-up box
//    	Thread.sleep(5000);
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj608.sendAlertPopup_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }

    
    
//    @AT_FM_058
    @And("User_608 select the limit details product class row in under limit details")
    public void user_select_the_limit_details_product_class_row_in_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WifakLimitDetailsProductClassRow_608());
    	WIFAKapplicationObj608.WifakLimitDetailsProductClassRow_608().click();
    }

    @And("User_608 click the Repayment Plan button under limit Details in Application Financial Facility Maintanance")
    public void user_click_the_repayment_plan_button_under_limit_details_in_application_financial_facility_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanBtn_608());
    	WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanBtn_608().click();        
    }

    @And("User_608 user Re_enter the no of payments in Repayment Plan tab Application Financial Facility Maintanance")
    public void user_user_re_enter_the_no_of_payments_in_repayment_plan_tab_application_financial_facility_maintanance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608());
		WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().clear();
		WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().sendKeys(testData.get("No of Payments"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().getAttribute("prevvalue")==testData.get("No of Payments")) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} 
        
    }

    @And("User_608 click the Create Schedule button in Repayment Plan tab under Application Financial Facility Maintanance")
    public void user_click_the_create_schedule_button_in_repayment_plan_tab_under_application_financial_facility_maintanance() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabCreateSheduleBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabCreateSheduleBtn_608());
		WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabCreateSheduleBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.confirmPopup_608());
		WIFAKapplicationObj608.ConfirmPopupOkBtn_608().click();
        
    }

    @And("User_608 validate the Installment Vat Amount in available in Repayment Plan tab under Application Financial Facility Maintanance")
    public void user_validate_the_installment_vat_amount_in_available_in_repayment_plan_tab_under_application_financial_facility_maintanance() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabInstallmentVatAmt_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabInstallmentVatAmt_608());
		boolean installmentVatAmt = WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabInstallmentVatAmt_608().isDisplayed();
		Assert.assertEquals(true, installmentVatAmt);
        
    }

    @And("User_608 click the Save button in Repayment Plan tab under Application Financial Facility Maintanance")
    public void user_click_the_save_button_in_repayment_plan_tab_under_application_financial_facility_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabSaveBtn_608());
    	WIFAKapplicationObj608.WifakLimitDetailsRepaymentPlanTabSaveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.ConfirmPopupOkBtn_608());
		WIFAKapplicationObj608.ConfirmPopupOkBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
		for (int i = 0; i < 500; i++) {
			try {
				WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
        
    }

    


}
