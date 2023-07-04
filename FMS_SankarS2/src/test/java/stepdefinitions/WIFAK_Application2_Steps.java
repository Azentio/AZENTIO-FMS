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
import io.cucumber.java.en.When;
import pageobjects.fms.WIFAK_ApplicationObj;
import pageobjects.fmsParam.Facility_TypeObj;
import resources.BaseClass;

public class WIFAK_Application2_Steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WIFAK_ApplicationObj WIFAKapplicationObj = new WIFAK_ApplicationObj(driver);
	Facility_TypeObj facilityTypeObj = new Facility_TypeObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	StringBuffer refID = new StringBuffer();
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
	Map<String, String> testData;
	
//	@AT_AFF_098_FMSParam
	@And("^get the test data for test case AT_AFF_098_FMSParam$")
    public void get_the_test_data_for_test_case_AT_AFF_098fmsparam() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_098");
    }
	



	

	

	
	@And("^User clicks on the parameter module$")
    public void user_clicks_on_the_parameter_module() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.fmsParamParameter());        
        facilityTypeObj.fmsParamParameter().click();
    }

    @And("^User clicks on the Facility Type feature$")
    public void user_clicks_on_the_facility_type_feature() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.paramFacilityType());
    	 facilityTypeObj.paramFacilityType().click();
    }
    
    @And("^User clicks on the update after approve menu in Facility type$")
    public void user_clicks_on_the_update_after_approve_menu_in_facility_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityTypeUpdateAfterApprove());
   	 	facilityTypeObj.facilityTypeUpdateAfterApprove().click();
    }
    
    @And("^User enter the code value in update after approve menu$")
    public void user_enter_the_code_value_in_update_after_approve_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityTypeSearchCode());
//   	 	facilityTypeObj.facilityTypeSearchCode().sendKeys("369");
    	facilityTypeObj.facilityTypeSearchCode().sendKeys(testData.get("Search Code"));    	
   	 	facilityTypeObj.facilityTypeSearchCode().sendKeys(Keys.ENTER);
    }
    
    @And("^User double click on the retrived data in update after approve menu$")
    public void user_double_click_on_the_retrived_data_in_update_after_approve_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityTypeCode());
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(facilityTypeObj.facilityTypeCode());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
   	 	
    }
    
    @And("^User clicks on the facility details tab in update after approve$")
    public void user_clicks_on_the_facility_details_tab_in_update_after_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityTypeFacilityDetails());
   	 	facilityTypeObj.facilityTypeFacilityDetails().click();
    }
 
    @And("^User clicks on the STP Facility Requirements option$")
    public void user_clicks_on_the_stp_facility_requirements_option() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.STPFacilityReq());
    	 facilityTypeObj.STPFacilityReq().click();
    }

    @And("^User check the Customer Grading flag$")
    public void user_check_the_customer_grading_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.customerGradingFlag());
    	 WebElement customerGradingFlag = facilityTypeObj.customerGradingFlag();
    	 if(!(customerGradingFlag.isSelected())) {
    		 customerGradingFlag.click();
     	}
    }

    @And("^User check the Overwrite Grading flag$")
    public void user_check_the_overwrite_grading_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.OverwriteGradingFlag());
    	 WebElement overwriteGradingFlag = facilityTypeObj.OverwriteGradingFlag();
    	 if(!(overwriteGradingFlag.isSelected())) {
    		 overwriteGradingFlag.click();
     	}
    }

    @And("^User check the Credit Review flag$")
    public void user_check_the_credit_review_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.creditReviewFlag());
    	 WebElement creditReviewFlag = facilityTypeObj.creditReviewFlag();
    	 facilityTypeObj.creditReviewFlag().click();
    	 if(!(creditReviewFlag.isSelected())) {
    		 creditReviewFlag.click();
     	}
    }

    @And("^User check the Committee Approval flag$")
    public void user_check_the_committee_approval_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.committeeApprovalFlag());
    	 WebElement committeeApprovalFlag = facilityTypeObj.committeeApprovalFlag();
    	 if(!(committeeApprovalFlag.isSelected())) {
    		 committeeApprovalFlag.click();
     	}
    }

    @And("^User check the Credit Authorization flag$")
    public void user_check_the_credit_authorization_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.creditAuthorzieFlag());
    	 WebElement creditAuthorzieFlag = facilityTypeObj.creditAuthorzieFlag();
    	 if(!(creditAuthorzieFlag.isSelected())) {
    		 creditAuthorzieFlag.click();
     	}
    }

    @And("^User check the Issue Facility Offer flag$")
    public void user_check_the_issue_facility_offer_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.issueFacilityOfferFlag());
    	 WebElement issueFacilityOfferFlag = facilityTypeObj.issueFacilityOfferFlag();
    	 if(!(issueFacilityOfferFlag.isSelected())) {
    		 issueFacilityOfferFlag.click();
     	}
    }

    @And("^User check the Client Response flag$")
    public void user_check_the_client_response_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.clientResponseFlag());
    	 WebElement clientResponseFlag = facilityTypeObj.clientResponseFlag();
    	 if(!(clientResponseFlag.isSelected())) {
    		 clientResponseFlag.click();
     	}
    }

    @And("^User check the Document Validation flag$")
    public void user_check_the_document_validation_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.documentValidationFlag());
    	 WebElement documentValidationFlag = facilityTypeObj.documentValidationFlag();
    	 if(!(documentValidationFlag.isSelected())) {
    		 documentValidationFlag.click();
     	}
    }

    @And("^User check the Final Approval flag$")
    public void user_check_the_final_approval_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.finalApprovalFlag());
    	 WebElement finalApprovalFlag = facilityTypeObj.finalApprovalFlag();
    	 if(!(finalApprovalFlag.isSelected())) {
    		 finalApprovalFlag.click();
     	}
    }

    @And("^User check the Create Active Facility If Within Limits flag$")
    public void user_check_the_create_active_facility_if_within_limits_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.createActiveFacilityFlag());
    	 WebElement createActiveFacilityFlag = facilityTypeObj.createActiveFacilityFlag();
    	 if(!(createActiveFacilityFlag.isSelected())) {
    		 createActiveFacilityFlag.click();
     	}
    }

    @And("^User Check the Automatically Approve Facility If Within Limits flag$")
    public void user_check_the_automatically_approve_facility_if_within_limits_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.autoApproveFacilityFlag());
    	 WebElement autoApproveFacilityFlag = facilityTypeObj.autoApproveFacilityFlag();
    	 if(!(autoApproveFacilityFlag.isSelected())) {
    		 autoApproveFacilityFlag.click();
     	}
    }
    
    @When("^User clicks on the Update button$")
    public void user_clicks_on_the_update_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityTypeObj.updateAfterApproveUpdateBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.updateAfterApproveUpdateBtn());
    	facilityTypeObj.updateAfterApproveUpdateBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.ButtonConfirmOk());
    	facilityTypeObj.ButtonConfirmOk().click();
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.ButtonSuccessOk());
    	facilityTypeObj.ButtonSuccessOk().click();
    }

    @And("^User after the update go to the approve menu$")
    public void user_after_the_update_go_to_the_approve_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityTypeApproveMenu());
    	facilityTypeObj.facilityTypeApproveMenu().click();
    }
    
    @And("^User enter the code value in approve menu$")
    public void user_enter_the_code_value_in_approve_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.approveSearchCode());
//    	facilityTypeObj.approveSearchCode().sendKeys("369");
    	facilityTypeObj.approveSearchCode().sendKeys(testData.get("Search Code"));
    	facilityTypeObj.approveSearchCode().sendKeys(Keys.ENTER);
    }

    @And("^User double click on the retrived data in approve menu$")
    public void user_double_click_on_the_retrived_data_in_approve_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.approveCode());
    	clicksAndActionsHelper.doubleClick(facilityTypeObj.approveCode());
    }
    
    @When("^User clicks on the Approve button$")
    public void user_clicks_on_the_approve_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityTypeObj.approveApproveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.approveApproveBtn());
    	facilityTypeObj.approveApproveBtn().click();
 
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.ButtonConfirmOk());
    	facilityTypeObj.ButtonConfirmOk().click();
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.ButtonSuccessOk());
    	facilityTypeObj.ButtonSuccessOk().click();
        
    }
    
////  @AT_AFF_098_FMSCore
//    @And("^User define the marketed by field$")
//    public void user_define_the_marketed_by_field() throws Throwable {
////    	Thread.sleep(5000);
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.marketedByFieldSearch()); 
//    	facilityTypeObj.marketedByFieldSearch().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.marketedByValue());
//    	clicksAndActionsHelper.doubleClick(facilityTypeObj.marketedByValue());    	
//    }
//    
////    @AT_AFF_098_CSMCore    
//    @And("^User clicks on the transfer of entities module$")
//    public void user_clicks_on_the_transfer_of_entities_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.transferOfEntitiesModule());
//    	facilityTypeObj.transferOfEntitiesModule().click();
//    }
//
//    @And("^User clicks on the transfer of entities maintanance menu$")
//    public void user_clicks_on_the_transfer_of_entities_maintanance_menu() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.transferEntitiesMain());
//    	facilityTypeObj.transferEntitiesMain().click();
//    }
    
    
    
    
////  @AT_RF_034_FMSParam
//    @And("^User uncheck the Issue Facility Offer flag$")
//    public void user_uncheck_the_issue_facility_offer_flag() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.issueFacilityOfferFlag());
//    	WebElement issueFacilityOfferFlag = facilityTypeObj.issueFacilityOfferFlag();
//    	if(issueFacilityOfferFlag.isSelected()) {
//    		 issueFacilityOfferFlag.click();
//    	}
//    }
//
//    @And("^User move to facility reports tab in update after approve$")
//    public void user_move_to_facility_reports_tab_in_update_after_approve() throws Throwable {
//    	Thread.sleep(5000);
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityTypeFacilityReports());
//    	facilityTypeObj.facilityTypeFacilityReports().click();
//    	}
//
//    @And("^User clicks on the search option in issue facility offer under facility reports$")
//    public void user_clicks_on_the_search_option_in_issue_facility_offer_under_facility_reports() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(facilityTypeObj.facilityReportsIssueFacilityOfferLookup());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityReportsIssueFacilityOfferLookup());
//    	facilityTypeObj.facilityReportsIssueFacilityOfferLookup().click();
//    }
//
//    @And("^User double click on any one retrived data$")
//    public void user_double_click_on_any_one_retrived_data() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityReportsIssueFacilityOfferLookupData());
//    	clicksAndActionsHelper.doubleClick(facilityTypeObj.facilityReportsIssueFacilityOfferLookupData());
//    }
//
//    @And("^User check the auto print flag under issue facility offer$")
//    public void user_check_the_auto_print_flag_under_issue_facility_offer() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityReportsIssueFacilityOfferAutoPrintFlag());
//    	WebElement autoPrintFlag = facilityTypeObj.facilityReportsIssueFacilityOfferAutoPrintFlag();
//    	if(!(autoPrintFlag.isSelected())) {
//    		autoPrintFlag.click();
//    	}
//    }
 
//  @681303_FMSCore
    @And("^User clicks on the validate button$")
    public void user_clicks_on_the_validate_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsValidateBtn());
    	WIFAKapplicationObj.limitDetailsValidateBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
    	WIFAKapplicationObj.WarningPopupOkBtn().click();
    	
    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityAlreadyCreatedPopup());
//    	WIFAKapplicationObj.facilityAlreadyCreatedPopup().click();
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.facilityAlreadyCreatedPopup().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.successPopup());
//    	String SuccessMsg = WIFAKapplicationObj.successPopupMessage().getText();
//    	String substring = SuccessMsg.substring(23, 27);
//    	refID.append(substring);
    	
    	
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
    	
    	// Send Alert pop-up
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.sendAlertPopup().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
   
//    @And("^User clicks the issue facility offer under WIFAK Application$")
//    public void user_clicks_the_issue_facility_offer_under_wifak_application() throws Throwable {    	
//    	System.out.println("Ref No: "+refID);
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.WIFAKAppIssueFacilityOffer());
//    	facilityTypeObj.WIFAKAppIssueFacilityOffer().click();
//    }
//
//    @And("^User search the code in issue facility offer$")
//    public void user_search_the_code_in_issue_facility_offer() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.issueFacilityOfferSearchCode());  	
//    	facilityTypeObj.issueFacilityOfferSearchCode().sendKeys(refID);
//    	facilityTypeObj.issueFacilityOfferSearchCode().sendKeys(Keys.ENTER);
//    }
//
//    @And("^User double click on the retrived data$")
//    public void user_double_click_on_the_retrived_data() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.issueFacilityOfferSearchResult());
//    	clicksAndActionsHelper.doubleClick(facilityTypeObj.issueFacilityOfferSearchResult());        
//    }
//    
//    @When("^User clicks on the issue offer button under issue facility offer$")
//    public void user_clicks_on_the_issue_offer_button_under_issue_facility_offer() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(facilityTypeObj.facilityReportsIssueFacilityOfferLookup());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.issueFacilityOfferIssueOfferBtn());
//    	facilityTypeObj.issueFacilityOfferIssueOfferBtn().click();
//    }
    
    
    

    


    
    
    
    
    
}
