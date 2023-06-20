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
import resources.BaseClass;

public class FacilitiesManagementSteps_608 {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FacilitiesManagementObj_608 facilityManagementObj608 = new FacilitiesManagementObj_608(driver);
	ApplicationFinancialFacilityObj_608 applicationFinancialFacilityObj608 = new ApplicationFinancialFacilityObj_608(driver);
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

 @And("User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application")
 public void user_enter_the_application_ref_number_in_facilities_management_maintanance_search_grid_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSearchApplicationRefInput_608());
 	facilityManagementObj608.wifakFacilitiesManagementMainSearchApplicationRefInput_608().sendKeys("4197",Keys.ENTER);
 }

 @And("User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application")
 public void user_double_click_the_application_ref_number_in_facilities_management_maintanance_search_grid_under_wifak_application() throws Throwable {
 	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSearchResultRow_608());
     clicksAndActionsHelper.doubleClick(facilityManagementObj608.wifakFacilitiesManagementMainSearchResultRow_608());
     for(int i = 0; i <= 500; i++) {
 		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementMainApplicationRef_608().getAttribute("prevvalue").isBlank())) {
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

	
	
	
	

	


}
