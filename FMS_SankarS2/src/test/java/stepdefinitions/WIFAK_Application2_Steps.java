package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.fmsParam.Facility_TypeObj;
import resources.BaseClass;

public class WIFAK_Application2_Steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Facility_TypeObj facilityTypeObj = new Facility_TypeObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
//	@834966_FMS_Param
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
   	 	facilityTypeObj.facilityTypeSearchCode().sendKeys("369");
   	 	facilityTypeObj.facilityTypeSearchCode().sendKeys(Keys.ENTER);
    }
    
    @And("^User double click on the retrived data in update after approve menu$")
    public void user_double_click_on_the_retrived_data_in_update_after_approve_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.facilityTypeCode());
   	 	clicksAndActionsHelper.doubleClick(facilityTypeObj.facilityTypeCode());
    }
    
    @And("^User clicks on the facility details tab$")
    public void user_clicks_on_the_facility_details_tab() throws Throwable {
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
    	facilityTypeObj.approveSearchCode().sendKeys("369");
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
    
//    @834966_FMS_Core
    
    @And("^User define the marketed by field$")
    public void user_define_the_marketed_by_field() throws Throwable {
//    	Thread.sleep(5000);
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.marketedByFieldSearch()); 
    	facilityTypeObj.marketedByFieldSearch().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj.marketedByValue());
    	clicksAndActionsHelper.doubleClick(facilityTypeObj.marketedByValue());
    	
    }
}
