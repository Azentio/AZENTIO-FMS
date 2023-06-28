package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CommonElements.FMS_Result_RequestForFinacing_610_obj;
import resources.BaseClass;

public class FMS_Result_RequestForFinacing_610_steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMS_Result_RequestForFinacing_610_obj FMS_Result_RequestForFinacing_610_obj = new FMS_Result_RequestForFinacing_610_obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	DropDownHelper DropDownhelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	
	@And("User_610 clicks on the Request module")
	public void user_clicks_on_the_request_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(FMS_Result_RequestForFinacing_610_obj.FMSCoreRequestModule_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.FMSCoreRequestModule_610());
	    FMS_Result_RequestForFinacing_610_obj.FMSCoreRequestModule_610().click();
	}

	@And("User_610 clicks on the Request Financing under Request module")
	public void user_clicks_on_the_request_financing_under_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestFinancingFeature_610());
		FMS_Result_RequestForFinacing_610_obj.requestFinancingFeature_610().click();	    
	}

	@And("User_610 clicks on the Request for Financing under Request Financing feature")
	public void user_clicks_on_the_request_for_financing_under_request_financing_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingFeature_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingFeature_610().click();	    
	}

	@And("User_610 clicks on the Maintanance screen under Request for Financing")
	public void user_clicks_on_the_maintanance_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMaintanance_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingMaintanance_610().click();	    
	}
@And("User_610 select the Reason for submission under main screen in Request for Financing")
	public void user_select_the_reason_for_submission_under_main_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainReasonForDropdown_610());
	 //   DropDownhelper.SelectUsingVisibleText(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainReasonForDropdown_610(), testData.get("Reason For Submission"));
	}

	@And("User_610 enter the CIF no in main screen under Request for Financing")
	public void user_enter_the_cif_no_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainCustomerInput_610());
	//	FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainCustomerInput_610().sendKeys(testData.get("Customer CIF"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainShortNameInput_610().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	}

	@And("User_610 enter the facility type in main screen under Request for Financing")
	public void user_enter_the_facility_type_in_main_screen_under_request_for_financing()throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainFacilityTypeInput_610());
	//	FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainFacilityTypeInput_610().sendKeys(testData.get("Facility Type"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainCYInput_610().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("User_610 enter the total limit in main screen under Request for Financing")
	public void user_enter_the_total_limit_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainTotalLimitInput_610());
	//	FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainTotalLimitInput_610().sendKeys(testData.get("Total Limit"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainTotalLimitInput_610().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	    
	}

	@And("User_610 move to the sublimit tab in main screen under Request for Financing")
	public void user_move_to_the_sublimit_tab_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTab_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTab_610().click();
	}

	@And("User_610 click the add new button in sublimit tab under main screen in Request for Financing")
	public void user_click_the_add_new_button_in_sublimit_tab_under_main_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddNewBtn_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddNewBtn_610().click();
	}

	@And("User_610 enter the product class in limit details tab under sublimit tab")
	public void user_enter_the_product_class_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddNewProductClassInput_610());
//		FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddNewProductClassInput_610().sendKeys(testData.get("Product Class"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddNewProductClassInput_610().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_610 enter the margin value in limit details tab under sublimit tab")
	public void user_enter_the_margin_value_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddNewMarginInput_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddNewMarginInput_610().clear();
	//	FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddNewMarginInput_610().sendKeys(testData.get("Margin Value"),Keys.TAB);
	}

	@And("User_610 click the add button in limit details tab under sublimit tab")
	public void user_click_the_add_button_in_limit_details_tab_under_sublimit_tab() throws Throwable {
		Thread.sleep(3000);
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddBtn_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSublimitTabAddBtn_610().click();		
	}
	
	@When("User_610 click the Save button in main screen under Request for Financing")
	public void user_click_the_save_button_in_main_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSaveBtn_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainSaveBtn_610().click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.ButtonConfirmOk_610());
		FMS_Result_RequestForFinacing_610_obj.ButtonConfirmOk_610().click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.ButtonSuccessOk_610());
		for (int i = 0; i < 500; i++) {
			try {
				FMS_Result_RequestForFinacing_610_obj.ButtonSuccessOk_610().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("User_610 click the Validate button in main screen Request for Financing")
	public void user_click_the_validate_button_in_main_screen_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainValidateBtn_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingMainValidateBtn_610().click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.ButtonConfirmOk_610());
		FMS_Result_RequestForFinacing_610_obj.ButtonConfirmOk_610().click();
		
		// Facility already created popup
    	waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.confirmPopup_610());
    	waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.facilityAlreadyCreatedPopup_610());
    	FMS_Result_RequestForFinacing_610_obj.facilityAlreadyCreatedPopup_610().click();
		
    	waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.successPopup_610());
		String RequestID = FMS_Result_RequestForFinacing_610_obj.successPopupMsg_610().getText().substring(10, 14);
    	System.err.println("Reference Number: "+RequestID);
    //	fmsTransactionsExcelData.updateTestData("DS_AT_FM_043", "Request Code", RequestID);
    	
    	for (int i = 0; i < 2000; i++) {
			try {
				FMS_Result_RequestForFinacing_610_obj.ButtonSuccessOk_610().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    
    	
    	// close the send alert pop-up box
    	waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.RequestSendAlertPopup_610());
    	for (int i = 0; i < 2000; i++) {
			try {
				FMS_Result_RequestForFinacing_610_obj.requestSendAlertPopupDismissBtn_610().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@Then("User_610 click the approve level1 under Request for Financing")
	public void user_click_the_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1_610().click();
	}	
	
	@And("User_610 enter the request code in approve level1 under Request for Financing")
	public void user_enter_the_request_code_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1Code_610());
	//	FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1Code_610().sendKeys(testData.get("Request Code"),Keys.ENTER);
	}

	@And("User_610 double click on the first row in approve level1 under Request for Financing")
	public void user_double_click_on_the_first_row_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1FirstRow_610());
	    clicksAndActionsHelper.doubleClick(FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1FirstRow_610());
	}

	@And("User_610 move to customer grading tab in approve level1 under Request for Financing")
	public void user_move_to_customer_grading_tab_in_approve_level1_under_request_for_financing() throws Throwable {		
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.approveLevel1CustomerGradingTab_610());
		for (int i = 0; i < 500; i++) {
			try {
				FMS_Result_RequestForFinacing_610_obj.approveLevel1CustomerGradingTab_610().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("User_610 select the approve level1 recommendation decision in approve level1 under Request for Financing")
	public void user_select_the_approve_level1_recommendation_decision_in_approve_level1_under_request_for_financing() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(FMS_Result_RequestForFinacing_610_obj.approveLevel1CustomerGradingApproveDecision_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
	//	DropDownhelper.SelectUsingVisibleText(FMS_Result_RequestForFinacing_610_obj.approveLevel1CustomerGradingApproveDecision_610(), testData.get("Approve1 Decision"));
	}

	@And("User_610 select the decision forward to as approval committee in approve level1 under Request for Financing")
	public void user_select_the_decision_forward_to_as_approval_committee_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.approveLevel1CustomerGradingApproveForwardTo_610());
	//	DropDownhelper.SelectUsingVisibleText(FMS_Result_RequestForFinacing_610_obj.approveLevel1CustomerGradingApproveForwardTo_610(), testData.get("Decision Forward To"));
	}

	@And("User_610 select the approval committee in approve level1 under Request for Financing")
	public void user_select_the_approval_committee_in_approve_level1_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.approveLevel1CustomerGradingApproveCommittee_610()); 
	//	DropDownhelper.SelectUsingVisibleText(FMS_Result_RequestForFinacing_610_obj.approveLevel1CustomerGradingApproveCommittee_610(), testData.get("Approval Committee"));
	    
	}

	@And("User_610 click the Approve button in approve level1 under Request for Financing")
	public void user_click_the_approve_button_in_approve_level1_under_request_for_financing() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1ApproveBtn_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1ApproveBtn_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingApproveLevel1ApproveBtn_610().click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.ButtonConfirmOk_610());
		FMS_Result_RequestForFinacing_610_obj.ButtonConfirmOk_610().click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.ButtonSuccessOk_610());
		for (int i = 0; i < 500; i++) {
			try {
				FMS_Result_RequestForFinacing_610_obj.ButtonSuccessOk_610().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@Then("User_610 click the Approval committee recommendation under Request for Financing")
	public void user_click_the_approval_committee_recommendation_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingApprovalCommitteeRecom_610());
		FMS_Result_RequestForFinacing_610_obj.requestForFinancingApprovalCommitteeRecom_610().click();
	}
	
	@And("User_610 enter the code in Approval committee recommendation under Request for Financing")
	public void user_enter_the_code_in_approval_committee_recommendation_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingApprovalCommitteeRecomCode_610());
	//	FMS_Result_RequestForFinacing_610_obj.requestForFinancingApprovalCommitteeRecomCode_610().sendKeys(testData.get("Request Code"),Keys.ENTER);
	}

	@And("User_610 double click on the first row in Approval committee recommendation under Request for Financing")
	public void user_double_click_on_the_first_row_in_approval_committee_recommendation_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Result_RequestForFinacing_610_obj.requestForFinancingApprovalCommitteeRecomRow1_610());
	    clicksAndActionsHelper.doubleClick(FMS_Result_RequestForFinacing_610_obj.requestForFinancingApprovalCommitteeRecomRow1_610());
	}
}
