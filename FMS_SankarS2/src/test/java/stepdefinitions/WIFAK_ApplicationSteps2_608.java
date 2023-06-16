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

public class WIFAK_ApplicationSteps2_608 {
	
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
	
	
//	@AT_FM_038_FMSParam
	@And("^User_608 get the test data for test case AT_FM_038_FMSParam$")
    public void get_the_test_data_for_test_case_AT_FM_038_FMSParam() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_038");
    }
	

	
	
//	@AT_FM_038_FMSParam
	@And("^User_608 clicks on the parameter module$")
    public void user_clicks_on_the_parameter_module() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.fmsParamParameter_608());        
        facilityTypeObj608.fmsParamParameter_608().click();
    }

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
    
    
//  @AT_FM_038_FMSCore
    @And("User_608 clicks on the Approval committe recommedations menu")
    public void user_clicks_on_the_approval_committe_recommedations_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsMenu_608());
    	WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsMenu_608().click();
    }

    @And("User_608 enter the Facility type in search grid under Approval committe recommedations")
    public void user_enter_the_facility_type_in_search_grid_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsFacilityTypeInput_608());
    	WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsFacilityTypeInput_608().sendKeys(testData.get("Facility Type"),Keys.ENTER);
    }

    @And("User_608 retrieve the first row in search grid under Approval committe recommedations")
    public void user_retrieve_the_first_row_in_search_grid_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsRetrievedFirstRow_608());
        clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsRetrievedFirstRow_608());
    }

    @And("User_608 click the Recommend button under Approval committe recommedations")
    public void user_click_the_recommend_button_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsCode());
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608());
    	WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.confirmPopupOkBtn_608());
    	facilityTypeObj608.confirmPopupOkBtn_608().click();
    }
    
    @And("User_608 click the User recommended by name in approval committee user popup under Approval committe recommedations")
    public void user_click_the_user_recommended_by_name_in_approval_committee_user_popup_under_approval_committe_recommedations() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.approvalCommitteeRecommendByLabel_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approvalCommitteeRecommendByLabel_608());
    	WIFAKapplicationObj608.approvalCommitteeRecommendByLabel_608().click();
    }

    @And("User_608 select the recommendation as approve in approval committee user popup under Approval committe recommedations")
    public void user_select_the_recommendation_as_approve_in_approval_committee_user_popup_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationDropdown_608());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationDropdown_608(), testData.get("Decision3"));
    }
    
    @And("User_608 click the OK button in approval committee user popup under Approval committe recommedations")
    public void user_click_the_ok_button_in_approval_committee_user_popup_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsUserPopupOkBtn_608());
    	WIFAKapplicationObj608.wifakApprovalCommitteeRecommendationsUserPopupOkBtn_608().click();
    }

    @Then("User_608 Successfully Approve the Recommendations")
    public void user_successfully_approve_the_recommendations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.successPopup_608());
    	
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
        
    }


}
