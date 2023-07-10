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
import pageobjects.fms.ApplicationFinancialFacilityObj_608;
import pageobjects.fms.FacilitiesManagementObj_608;
import pageobjects.fmsParam.Facility_TypeObj_608;
import resources.BaseClass;

public class FacilitiesManagementSteps_608 {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FacilitiesManagementObj_608 facilityManagementObj608 = new FacilitiesManagementObj_608(driver);
	ApplicationFinancialFacilityObj_608 applicationFinancialFacilityObj608 = new ApplicationFinancialFacilityObj_608(driver);
	Facility_TypeObj_608 facilityTypeObj608 = new Facility_TypeObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FacilitiesManagementTestData","DataSet ID");
	Map<String, String> testData;
	
//	@AT_FM_035
	@And("User_608 get the test data for test case AT_FM_035_FMSCore")
	public void user_get_the_test_data_for_test_case_at_fm__fms_core() {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_035");
	}
	
	
	
	
	
//	@AT_FM_035
	@And("User_608 clicks the Facilities Management feature under Request Financing")
	public void user_clicks_the_facilities_management_feature_under_request_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.requestFacilitiesManagementFeature_608());
		facilityManagementObj608.requestFacilitiesManagementFeature_608().click();
	}

	@And("User_608 clicks the Maintanance in Facilities Management under Request Financing")
	public void user_clicks_the_maintanance_in_facilities_management_under_request_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.requestFacilitiesManagementMaintanance_608());
		facilityManagementObj608.requestFacilitiesManagementMaintanance_608().click();
	}

	@And("User_608 click the search button in maintanance screen under Facilities Management")
	public void user_click_the_search_button_in_maintanance_screen_under_facilities_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.requestFacilitiesManagementMainSearchBtn_608());
		facilityManagementObj608.requestFacilitiesManagementMainSearchBtn_608().click();
	}

	@And("User_608 search the facility with CIF number in maintanance screen under Facilities Management")
	public void user_search_the_facility_with_cif_number_in_maintanance_screen_under_facilities_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.requestFacilitiesManagementMainSearchCIFInput_608());
		facilityManagementObj608.requestFacilitiesManagementMainSearchCIFInput_608().sendKeys(testData.get("CIF No"),Keys.ENTER);
	}

	@Then("User_608 retrieve the facility in maintanance screen under Facilities Management")
	public void user_retrieve_the_facility_in_maintanance_screen_under_facilities_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.requestFacilitiesManagementMainSearchRow1_608());
	    clicksAndActionsHelper.doubleClick(facilityManagementObj608.requestFacilitiesManagementMainSearchRow1_608());
	    
	    waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.requestFacilitiesManagementMainCode_608());
	    for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityManagementObj608.requestFacilitiesManagementMainCode_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	
	
	
//  @AT_FM_058
   @And("User_608 select the limit details product class row in under limit details")
   public void user_select_the_limit_details_product_class_row_in_under_limit_details() throws Throwable {
   	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.WifakLimitDetailsProductClassRow_608());
   	facilityManagementObj608.WifakLimitDetailsProductClassRow_608().click();
   }

   @And("User_608 click the Repayment Plan button under limit Details in Application Financial Facility Maintanance")
   public void user_click_the_repayment_plan_button_under_limit_details_in_application_financial_facility_maintanance() throws Throwable {
   	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.WifakLimitDetailsRepaymentPlanBtn_608());
   	facilityManagementObj608.WifakLimitDetailsRepaymentPlanBtn_608().click();        
   }

//   @And("User_608 user Re_enter the no of payments in Repayment Plan tab Application Financial Facility Maintanance")
//   public void user_user_re_enter_the_no_of_payments_in_repayment_plan_tab_application_financial_facility_maintanance() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608());
//		facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().clear();
//		facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().sendKeys(testData.get("No of Payments"),Keys.TAB);
//		
//		for(int i = 0; i <= 500; i++) {
//   		try {
//				if(facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608().getAttribute("prevvalue")==testData.get("No of Payments")) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		} 
//       
//   }

   @And("User_608 click the Create Schedule button in Repayment Plan tab under Application Financial Facility Maintanance")
   public void user_click_the_create_schedule_button_in_repayment_plan_tab_under_application_financial_facility_maintanance() throws Throwable {
   	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabCreateSheduleBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
   	}
		
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabCreateSheduleBtn_608());
		facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabCreateSheduleBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
		applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();
       
   }

   @And("User_608 validate the Installment Vat Amount in available in Repayment Plan tab under Application Financial Facility Maintanance")
   public void user_validate_the_installment_vat_amount_in_available_in_repayment_plan_tab_under_application_financial_facility_maintanance() throws Throwable {
   	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabInstallmentVatAmt_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
   	}
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabInstallmentVatAmt_608());
		boolean installmentVatAmt = facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabInstallmentVatAmt_608().isDisplayed();
		Assert.assertEquals(true, installmentVatAmt);
       
   }

   @And("User_608 click the Save button in Repayment Plan tab under Application Financial Facility Maintanance")
   public void user_click_the_save_button_in_repayment_plan_tab_under_application_financial_facility_maintanance() throws Throwable {
	   	Thread.sleep(5000);  		
	   	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabSaveBtn_608());
   		facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabSaveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
		applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();
		
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
   
   @Then("User_608 click the Facilities Management menu under WIFAK Application")
 public void user_click_the_facilities_management_menu_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMenu_608());
 	facilityManagementObj608.wifakFacilitiesManagementMenu_608().click();
 }

 @And("User_608 click the Maintanance in Facilities Management under WIFAK Application")
 public void user_click_the_maintanance_in_facilities_management_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMaintanance_608());
 	facilityManagementObj608.wifakFacilitiesManagementMaintanance_608().click();
 }

 @And("User_608 click the search button in Facilities Management Maintanance under WIFAK Application")
 public void user_click_the_search_button_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSearchBtn_608());
 	facilityManagementObj608.wifakFacilitiesManagementMainSearchBtn_608().click();
 }

 @And("User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application")
 public void user_double_click_the_application_ref_number_in_facilities_management_maintanance_search_grid_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSearchResultRow_608());
     clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementMainSearchResultRow_608());
     for(int i = 0; i <= 500; i++) {
 		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementMainApplicationRefInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
 	}
     
 }

 @And("User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application")
 public void user_click_the_facility_limit_details_tab_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitDetailsTab_608());
 	facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitDetailsTab_608().click();
 }

 @And("User_608 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application")
 public void user_select_the_facility_limit_details_product_class_row_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitDetailsProductClassRow_608());
 	facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitDetailsProductClassRow_608().click();
 }

 @And("User_608 click the Repayment plan button in Facilities Management Maintanance under WIFAK Application")
 public void user_click_the_repayment_plan_button_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitDetailsRepaymentplanBtn_608());
 	facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitDetailsRepaymentplanBtn_608().click();
 }

 @And("User_608 click the Schedule details tab in Repayment plan tab in Facilities Management Maintanance under WIFAK Application")
 public void user_click_the_schedule_details_tab_in_repayment_plan_tab_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitRepaymentplanScheduleDetailsTab_608());
 	facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitRepaymentplanScheduleDetailsTab_608().click();
 }

 @Then("User_608 validate Installment Vat amount should be displayed Repayment plan tab under Facilities Management Maintanance")
 public void user_validate_installment_vat_amount_should_be_displayed_repayment_plan_tab_under_facilities_management_maintanance() throws Throwable {
 	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabInstallmentVatAmt_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
 	}
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitRepaymentplanScheduleDetailsInstallVatAmt_608());
		boolean installmentVatAmt = facilityManagementObj608.wifakFacilitiesManagementMainFacilityLimitRepaymentplanScheduleDetailsInstallVatAmt_608().isDisplayed();
		Assert.assertEquals(true, installmentVatAmt);    	 
     
 }
	
	
	
	
	
	
//	@AT_FM_102	
	@And("User_608 click the collect charges per installment on PI approve flag")
	public void user_click_the_collect_charges_per_installment_on_pi_approve_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCodeLabel_608());
		applicationFinancialFacilityObj608.chargesDetailsCodeLabel_608().click();
   
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCode_608());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityManagementObj608.chargesDetailsCollectChgsPerInstApproveFlag_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.chargesDetailsCollectChgsPerInstApproveFlag_608());
		WebElement chargesDetailsCollectChgsPerInstApproveFlag_608 = facilityManagementObj608.chargesDetailsCollectChgsPerInstApproveFlag_608();			
   	 	if(!(chargesDetailsCollectChgsPerInstApproveFlag_608.isSelected())) {
   	 		chargesDetailsCollectChgsPerInstApproveFlag_608.click();
    	}
	}

	@And("User_608 click the collect charges on deal approve flag")
	public void user_click_the_collect_charges_on_deal_approve_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.chargesDetailsCollectChgsOnDealApproveFlag_608());		
		WebElement chargesDetailsCollectChgsOnDealApproveFlag_608 = facilityManagementObj608.chargesDetailsCollectChgsOnDealApproveFlag_608();
		if(!(chargesDetailsCollectChgsOnDealApproveFlag_608.isSelected())) {
			chargesDetailsCollectChgsOnDealApproveFlag_608.click();
    	}
	}

	@And("User_608 click the collect at facility approval flag")
	public void user_click_the_collect_at_facility_approval_flag() throws Throwable {    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCollectFacApprovalFlag_608());
    	WebElement chargesDetailsCollectFacApprovalFlag_608 = applicationFinancialFacilityObj608.chargesDetailsCollectFacApprovalFlag_608();
    	if(!(chargesDetailsCollectFacApprovalFlag_608.isSelected())) {
    		chargesDetailsCollectFacApprovalFlag_608.click();
    	}	    
	}
	
	
	
//	@AT_FM_103
	@And("User_608 validate the Repayment plan schedule details should be displayed in Facilities Management Maintanance under WIFAK Application")
	public void usre_validate_the_repayment_plan_schedule_details_should_be_displayed_in_facilities_management_maintanance_under_wifak_application()throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanScheduleTable_608());
		boolean scheduleDatailsTable = facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanScheduleTable_608().isDisplayed();
		Assert.assertTrue(scheduleDatailsTable);
	}

	@And("User_608 close the Repament plan tab in Facilities Management Maintanance under WIFAK Application")
	public void user_close_the_repament_plan_tab_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanCloseIcon_608());
		facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanCloseIcon_608().click();
	}

	@And("User_608 click the Charges Details button in Facilities Management Maintanance under WIFAK Application")
	public void user_click_the_charges_details_button_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsBtn_608());
		facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsBtn_608().click();
	}

	@And("User_608 validate the Collect at Fac approval flag should be checked in Facilities Management Maintanance under WIFAK Application")
	public void user_validate_the_collect_at_fac_approval_flag_should_be_checked_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsRow_608());
		boolean FacApprovalFlag = facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsCollectFacApprovalFlag_608().isSelected();
//		System.err.println("Fac Approval Flag: "+ FacApprovalFlag);
		Assert.assertTrue(FacApprovalFlag);		
	}

	@And("User_608 validate the Collect charges per inst PI approve flag should be checked in Facilities Management Maintanance under WIFAK Application")
	public void user_validate_the_collect_charges_per_inst_pi_approve_flag_should_be_checked_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsCollectChgsPerPIApproveFlag_608());
		boolean PIApproveFlag = facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsCollectChgsPerPIApproveFlag_608().isSelected();
//		System.err.println("PI Approve Flag: "+ PIApproveFlag);
		Assert.assertTrue(PIApproveFlag);
	}

	@And("User_608 validate the Collect charges on Deal approve flag should be checked in Facilities Management Maintanance under WIFAK Application")
	public void user_validate_the_collect_charges_on_deal_approve_flag_should_be_checked_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsCollectChgsDealApproveFlag_608());
		boolean DealApproveFlag = facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsCollectChgsDealApproveFlag_608().isSelected();
//		System.err.println("Deal Approve Flag: "+ DealApproveFlag);
		Assert.assertTrue(DealApproveFlag);
	}

	

//	@AT_FM_104
	@And("User_608 click the Journal voucher details button in Facilities Management Maintanance")
	public void user_click_the_journal_voucher_details_button_in_facilities_management_maintanance() {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMaintananceJournalVoucherDetailsBtn_608());
		facilityManagementObj608.wifakFacilitiesManagementMaintananceJournalVoucherDetailsBtn_608().click();
	}

	@Then("User_608 validate Account details should be displayed in JV Details tab under Facilities Management Maintanance")
	public void user_validate_account_details_should_be_displayed_in_jv_details_tab_under_facilities_management_maintanance() {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMaintananceJVDetailsTabAccountDetails_608());
		boolean JVDetailsAccount = facilityManagementObj608.wifakFacilitiesManagementMaintananceJVDetailsTabAccountDetails_608().isDisplayed();
		Assert.assertTrue(JVDetailsAccount);
	}

	@Then("User_608 validate Total Debit value should be displayed in JV Details tab under Facilities Management Maintanance")
	public void user_validate_total_debit_value_should_be_displayed_in_jv_details_tab_under_facilities_management_maintanance() {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMaintananceJVDetailsTabTotalDebitValue_608());
		boolean totalDebitValue = facilityManagementObj608.wifakFacilitiesManagementMaintananceJVDetailsTabTotalDebitValue_608().isDisplayed();
		Assert.assertTrue(totalDebitValue);
	}

	@Then("User_608 validate Total Credit value should be displayed in JV Details tab under Facilities Management Maintanance")
	public void user_validate_total_credit_value_should_be_displayed_in_jv_details_tab_under_facilities_management_maintanance() {
		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMaintananceJVDetailsTabTotalCreditValue_608()); 
		boolean totalCreditValue = facilityManagementObj608.wifakFacilitiesManagementMaintananceJVDetailsTabTotalCreditValue_608().isDisplayed();
		Assert.assertTrue(totalCreditValue);
	}

	
//	@AT_FM_105_FMSParam
	@And("^User_608 uncheck the Create Active Facility If Within Limits flag$")
    public void user_check_the_create_active_facility_if_within_limits_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.createActiveFacilityFlag_608());
    	 WebElement createActiveFacilityFlag = facilityTypeObj608.createActiveFacilityFlag_608();
    	 if(createActiveFacilityFlag.isSelected()) {
    		 createActiveFacilityFlag.click();
     	}
    }

    @And("^User_608 uncheck the Automatically Approve Facility If Within Limits flag$")
    public void user_check_the_automatically_approve_facility_if_within_limits_flag() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, facilityTypeObj608.autoApproveFacilityFlag_608());
    	 WebElement autoApproveFacilityFlag = facilityTypeObj608.autoApproveFacilityFlag_608();
    	 if(autoApproveFacilityFlag.isSelected()) {
    		 autoApproveFacilityFlag.click();
     	}
    }
	
    
//	@AT_FM_105_FMSCore
    @And("User_608 click the Approve menu under Facilities Management in WIFAK Application")
    public void user_click_the_approve_reject_under_facilities_management_in_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveMenu_608().click();
    }

    @And("User_608 double click on the search grid first row in Approve screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_approve_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveSearchGridFirstRow_608());
    	clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementApproveSearchGridFirstRow_608());
    	for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementApproveCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    	
    }

    @And("User_608 click the Approve button in Approve screen under WIFAK Facilities Management")
    public void user_click_the_approve_button_in_approve_screen_under_wifak_facilities_management() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityManagementObj608.wifakFacilitiesManagementApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveMenuApproveBtn_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveMenuApproveBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
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


    @And("User_608 click the Update After Approve menu under Facilities Management in WIFAK Application")
    public void user_click_the_update_after_approve_menu_under_facilities_management_in_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveMenu_608().click();
    }


    @And("User_608 double click on the search grid first row in Update After Approve screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_update_after_approve_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveSearchGridFirstRow_608());
    	clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveSearchGridFirstRow_608());
    	for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
    }

    @And("User_608 click the Facility Application tab in Update After Approve under WIFAK Facilities Management")
    public void user_click_the_facility_application_tab_in_update_after_approve_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveFacilityAppDetailsTab_608());  
    	facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveFacilityAppDetailsTab_608().click();
    }


    @And("User_608 click the Save button in Update After Approve under WIFAK Facilities Management")
    public void user_click_the_save_button_in_update_after_approve_under_wifak_facilities_management() throws Throwable {
        Thread.sleep(2000);
        waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveSaveBtn_608());
        for (int i = 0; i < 2000; i++) {
			try {
				facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveSaveBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}        
        waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
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
    
    
    
    @And("User_608 click the Query menu under Facilities Management in WIFAK Application")
    public void user_click_the_query_menu_under_facilities_management_in_wifak_application() {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementQueryMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementQueryMenu_608().click();
    }

    @And("User_608 double click on the search grid first row in Query screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_query_screen_under_wifak_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementQuerySearchGridFirstRow_608());
        clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementQuerySearchGridFirstRow_608());
        for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementQueryCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 validate the Query menu status should be Active under WIFAK Facilities Management")
    public void user_validate_the_query_menu_status_should_be_active_under_wifak_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementQueryStatus_608());
    	boolean QueryStatus = facilityManagementObj608.wifakFacilitiesManagementQueryStatus_608().isDisplayed();
    	Assert.assertTrue(QueryStatus);
    }
    
    
    @And("User_608 again click the Approve menu under Facilities Management in WIFAK Application")
    public void user_again_click_the_approve_menu_under_facilities_management_in_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveMenu_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();        
    }

    @And("User_608 click the Suspend menu under Facilities Management in WIFAK Application")
    public void user_click_the_suspend_menu_under_facilities_management_in_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementSuspendMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementSuspendMenu_608().click();
    }

    @And("User_608 double click on the search grid first row in Suspend screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_suspend_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementSuspendSearchGridFirstRow_608());
        clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementSuspendSearchGridFirstRow_608());
        
        for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementSuspendCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Suspend button in Suspend screen under WIFAK Facilities Management")
    public void user_click_the_suspend_button_in_suspend_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementSuspendMenuSuspendBtn_608());
    	facilityManagementObj608.wifakFacilitiesManagementSuspendMenuSuspendBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
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

    @And("User_608 click the Reactivate menu under Facilities Management in WIFAK Application")
    public void user_click_the_reactivate_menu_under_facilities_management_in_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementReactivateMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementReactivateMenu_608().click();
    }

    @And("User_608 double click on the search grid first row in Reactivate screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_reactivate_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementReactivateSearchGridFirstRow_608());
        clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementReactivateSearchGridFirstRow_608());
        
        for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementReactivateCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Reactivate button in Reactivate screen under WIFAK Facilities Management")
    public void user_click_the_suspend_button_in_reactivate_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementReactivateReactivateBtn_608());
    	facilityManagementObj608.wifakFacilitiesManagementReactivateReactivateBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
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

    @And("User_608 click the Reverse menu under Facilities Management in WIFAK Application")
    public void user_click_the_reverse_menu_under_facilities_management_in_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementReverseMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementReverseMenu_608().click();
    }

    @And("User_608 double click on the search grid first row in Reverse screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_reverse_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementReverseSearchGridFirstRow_608());
    	clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementReverseSearchGridFirstRow_608());
    	for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementReverseCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Reverse button in Reverse screen under WIFAK Facilities Management")
    public void user_click_the_suspend_button_in_reverse_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementReverseMenuReverseBtn_608()); 
    	facilityManagementObj608.wifakFacilitiesManagementReverseMenuReverseBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
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

	
    @And("User_608 click the Approve\\Reject Reverse menu under Facilities Management in WIFAK Application")
    public void user_click_the_approve_reject_reverse_menu_under_facilities_management_in_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveReverseMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveReverseMenu_608().click();
    }

    @And("User_608 double click on the search grid first row in Approve\\Reject Reverse screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_approve_reject_reverse_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveReverseSearchGridFirstRow_608());
        clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementApproveReverseSearchGridFirstRow_608());
        
        for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementApproveReverseCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Reject Reverse button in Approve\\Reject Reverse screen under WIFAK Facilities Management")
    public void user_click_the_reject_reverse_button_in_approve_reject_reverse_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveReverseMenuRejectReverseBtn_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveReverseMenuRejectReverseBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
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

    
    @And("User_608 click the Cancel menu under Facilities Management in WIFAK Application")
    public void user_click_the_cancel_menu_under_facilities_management_in_wifak_application() {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementCancelMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementCancelMenu_608().click();
    }

    @And("User_608 double click on the search grid first row in Cancel screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_cancel_screen_under_wifak_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementCancelSearchGridFirstRow_608());
    	clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementCancelSearchGridFirstRow_608());
    	for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementCancelCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Cancel button in Cancel screen under WIFAK Facilities Management")
    public void user_click_the_cancel_button_in_cancel_screen_under_wifak_facilities_management() {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityManagementObj608.wifakFacilitiesManagementCancelMenuCancelBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementCancelMenuCancelBtn_608());
    	facilityManagementObj608.wifakFacilitiesManagementCancelMenuCancelBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
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
    
    
    @And("User_608 click the Approve\\Reject Cancel menu under Facilities Management in WIFAK Application")
    public void user_click_the_approve_reject_cancel_menu_under_facilities_management_in_wifak_application() {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveCancelMenu_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveCancelMenu_608().click();
    }

    

    @And("User_608 double click on the search grid first row in Approve\\Reject Cancel screen under WIFAK Facilities Management")
    public void user_double_click_on_the_search_grid_first_row_in_approve_reject_cancel_screen_under_wifak_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveCancelSearchGridFirstRow_608());
        clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementApproveCancelSearchGridFirstRow_608());
        for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementApproveCancelCIFNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Approve Cancel button in Approve\\Reject Cancel screen under WIFAK Facilities Management")
    public void user_click_the_approve_cancel_button_in_approve_reject_cancel_screen_under_wifak_facilities_management() {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(facilityManagementObj608.wifakFacilitiesManagementApproveCancelMenuApproveCancelBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveCancelMenuApproveCancelBtn_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveCancelMenuApproveCancelBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
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
    
    

}
