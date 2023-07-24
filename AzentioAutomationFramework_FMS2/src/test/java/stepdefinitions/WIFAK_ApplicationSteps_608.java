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
import pageobjects.Facility_TypeObj_608;
import pageobjects.WIFAK_ApplicationObj_608;
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
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FacilitiesManagementTestData","DataSet ID");
	Map<String, String> testData;
	
	
	
//	@AT_AFF_036 --  moved to ApplicationFinancialFacility

	
//	@AT_AFF_040 --  moved to ApplicationFinancialFacility
	
	


//
////  @AT_RF_100
//    @And("^User_608 get the test data for test case AT_RF_100$")
//    public void get_the_test_data_for_test_case_AT_RF_100() throws Throwable {
//    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_100");
//    }
    
////  @AT_RF_102
//    @And("^User_608 get the test data for test case AT_RF_102$")
//    public void get_the_test_data_for_test_case_AT_RF_102() throws Throwable {
//    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_102");
//    }
    

    
//	@AT_FM_038_FMSCore
	@And("^User_608 get the test data for test case AT_FM_038_FMSCore$")
    public void get_the_test_data_for_test_case_AT_FM_038_FMSCore() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_038");
    }
    

    
	
//	@AT_FM_059
	@And("User_608 get the test data for test case AT_FM_059")
	public void user_get_the_test_data_for_test_case_AT_FM_059() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_059");
	}
	
	
  
//	
////   @AT_RF_100
//    @And("^User_608 select the application for dropdown as decrease in main screen$")
//    public void user_select_the_application_for_dropdown_as_decrease_in_main_screen() th_rows Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainApplicationForDropdown_608());
//		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.mainApplicationForDropdown_608(), testData.get("Application For"));
//    }
//
//    @And("^User_608 enter the input as Existing Facility Ref in main screen$")
//    public void user_enter_the_input_as_existing_facility_ref_in_main_screen() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainExistingFacilityRef_608());
////    	WIFAKapplicationObj608.mainExistingFacilityRef_608().sendKeys(testData.get("Facility Ref"));
//    	WIFAKapplicationObj608.mainExistingFacilityRef_608().sendKeys("1390");
//    	WIFAKapplicationObj608.mainExistingFacilityRef_608().sendKeys(Keys.TAB);
//    	
//    	for(int i = 0; i <= 300; i++) {
//    		try {
//				if(!(WIFAKapplicationObj608.mainExistingFacilityRef_608().getAttribute("readonly").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}    	
//
//    }
//    
//    @And("^User_608 enter the total value under additional info tab$")
//    public void user_enter_the_total_value_under_additional_info_tab() throws Throwable {    	
//    	// First We get the Finance amount without total amount
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.additionalTabFinanceAmount_608());
//    	String beforeFinanceAmount = WIFAKapplicationObj608.additionalTabFinanceAmount_608().getAttribute("prevvalue");
////    	System.out.println("Before Finance Amount: "+ beforeFinanceAmount);
//    	fmsTransactionsExcelData.updateTestData("DS01_582426", "Finance Amount", beforeFinanceAmount);
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainAdditionalTabTotalValue_608());
//		WIFAKapplicationObj608.mainAdditionalTabTotalValue_608().sendKeys(testData.get("Total value"));
//		WIFAKapplicationObj608.mainAdditionalTabTotalValue_608().sendKeys(Keys.TAB);
//		Thread.sleep(3000);
//    }
//
//    @And("^User_608 validate the finance amount should be decresed based on total value$")
//    public void user_validate_the_finance_amount_should_be_decresed_based_on_total_value() throws Throwable {
//    	testData = fmsTransactionsExcelData.getTestdata("DS01_582426");
//    	String financeAmount = testData.get("Finance Amount");
//    	String totalValue = testData.get("Total value");
//    	
//    	String afterFinanceAmount = WIFAKapplicationObj608.additionalTabFinanceAmount_608().getAttribute("prevvalue");
//    	String[] splitFinaceAmount  = afterFinanceAmount.split("[.]");
//    	String finalFinaceAmount = splitFinaceAmount[0].replace(",", "");
////    	System.out.println("Finance Amount: "+finalFinaceAmount);
////    	System.out.println("After Finance Amount: "+afterFinanceAmount);
//    	
//    	int cvValue = Integer.parseInt(financeAmount)-Integer.parseInt(totalValue);
//    	String cvValueText = String.valueOf(cvValue);
//    	fmsTransactionsExcelData.updateTestData("DS01_582426", "CV Value", cvValueText);
//    	
//    	Assert.assertEquals(cvValueText, finalFinaceAmount);
//    	
//    }
//
//    @And("^User_608 validate the Facility value and CV value should be changed same as decreased finance amount under limit details$")
//    public void user_validate_the_facility_value_and_cv_value_should_be_changed_same_as_decreased_finance_amount_under_limit_details() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductFacilityValue_608());
//    	String facilityValue = WIFAKapplicationObj608.limitDetailsProductFacilityValue_608().getAttribute("title");
//    	String[] splitFacilityValue  = facilityValue.split("[.]");
//    	String finalFacilityValue = splitFacilityValue[0].replace(",", "");
//    	
//    	testData = fmsTransactionsExcelData.getTestdata("DS01_582426");
//    	Assert.assertEquals(testData.get("CV Value"), finalFacilityValue);
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductCVValue_608());
//    	String CVValue = WIFAKapplicationObj608.limitDetailsProductCVValue_608().getAttribute("title");
//    	String[] splitCVValue  = CVValue.split("[.]");
//    	String finalCVValue = splitCVValue[0].replace(",", "");
//    	
//    	Assert.assertEquals(testData.get("CV Value"), finalCVValue);
//    	
//    }
//
//    @And("^User_608 double click on the product class under limit details$")
//    public void user_double_click_on_the_product_class_under_limit_details() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductFacilityValue_608());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.limitDetailsProductFacilityValue_608());
//    }
//    
//    @And("^User_608 click the clean flag under product calss in limit details tab$")
//    public void user_click_the_clean_flag_under_product_calss_in_limit_details_tab() throws Throwable {
//    	// check the clean flag
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608());
//        WebElement cleanFlag = WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608();
//        if(!(cleanFlag.isSelected())) {
//        	cleanFlag.click();
//    	}
//    }
//    
//    @And("^User_608 click the edit button under product class in limit details tab$")
//    public void user_click_the_edit_button_under_product_class_in_limit_details_tab() throws Throwable {
//    	
//    	for (int i = 0; i <= 300; i++) {
//        	try {
//        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.limitDetailsProductEditBtn_608());
//    				break;
//    			} catch (Exception e) {
//    				if (i == 300) {
//    					Assert.fail(e.getMessage());
//    				}
//    			}
//    	}
//        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductEditBtn_608());
//        WIFAKapplicationObj608.limitDetailsProductEditBtn_608().click();
//    }
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    //////////////////////////////////////
//    
//    @And("^User_608 enter the product class details$")
//    public void user_enter_the_product_class_details() throws Throwable {
//        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608());
//        WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608().sendKeys(testData.get("Product Class"),Keys.TAB);
//        for(int i = 0; i <= 500; i++) {
//    		try {
//				if(!(WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	} 
//        
//        //FRR Value Date
//        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordProductClassFRRValueDate_608());
//        WIFAKapplicationObj608.limitDetailsNewRecordProductClassFRRValueDate_608().sendKeys(testData.get("FRR Value Date"),Keys.TAB);
//        
//        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608());
//        WebElement cleanFlag = WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608();
//        if(!(cleanFlag.isSelected())) {
//        	cleanFlag.click();
//    	}
//        
//    }
//    
//    @And("^User_608 clicks on the product class add button$")
//    public void user_clicks_on_the_product_class_add_button() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.limitDetailsProductAddBtn_608());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	Thread.sleep(2000);
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsProductAddBtn_608());
//    	WIFAKapplicationObj608.limitDetailsProductAddBtn_608().click();
//    }
//    
//    @And("^User_608 move to the Document details tab$")
//    public void user_move_to_the_document_details_tab() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.mainDocumentDetailsTab_608());
//    	WIFAKapplicationObj608.mainDocumentDetailsTab_608().click();    	
//    }
//
//    @And("^User_608 enter the Solicitor Name$")
//    public void user_enter_the_solicitor_name() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.documentDetailsSolicitorName_608());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//    	}
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.documentDetailsSolicitorName_608());
//    	WIFAKapplicationObj608.documentDetailsSolicitorName_608().sendKeys("1",Keys.TAB);;
//    }
//
//    @And("^User_608 enter the Estimator Name$")
//    public void user_enter_the_estimator_name() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.documentDetailsEstimatorName_608());
//    	WIFAKapplicationObj608.documentDetailsEstimatorName_608().sendKeys("1",Keys.TAB);
//    	
//    }
//
//    @And("^User_608 clicks the save button$")
//    public void user_clicks_the_save_button() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsSaveBtn_608());
//    	WIFAKapplicationObj608.limitDetailsSaveBtn_608().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
//    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
//    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
//    }
//
//    @And("^User_608 clicks on the validate button$")
//    public void user_clicks_on_the_validate_button() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsValidateBtn_608());
//    	WIFAKapplicationObj608.limitDetailsValidateBtn_608().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
//    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
//    	
//    	// Facility already created popup
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.confirmPopup_608());
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.facilityAlreadyCreatedPopup_608());
//    	WIFAKapplicationObj608.facilityAlreadyCreatedPopup_608().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.successPopup_608());
////    	String SuccessMsg = WIFAKapplicationObj608.successPopupMessage().getText();
//    	String refCode = WIFAKapplicationObj608.successPopupMessage_608().getText().substring(23, 27);
//    	System.err.println("Reference Number: "+refCode);
//    	fmsTransactionsExcelData.updateTestData("DS_AT_AFF_048", "Reference Code", refCode);
//    	
//    	for (int i = 0; i < 2000; i++) {
//			try {
//		    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
//		    	break;
//			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    
//    	
//    	// close the send alert pop-up box
////    	Thread.sleep(5000);
////    	for (int i = 0; i < 2000; i++) {
////			try {
////		    	WIFAKapplicationObj608.sendAlertPopup_608().click();
////		    	break;
////			} catch (Exception e) {
////				if (i==1999) {
////					Assert.fail(e.getMessage());
////				}
////			}
////		}
//    	
//    }
//    
////    @Then("User_608 clicks the Approve Level1 menu under Application for financial facilities")
////    public void user_clicks_the_approve_level1_menu_under_application_for_fianancial_facilities() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel1_608());
////    	WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel1_608().click();	
////    }
////
////    @And("User_608 enter the reference code in Approve level1")
////    public void user_enter_the_reference_code_in_approve_level1() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1RefCodeInput_608());
////    	WIFAKapplicationObj608.approveLevel1RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
////    }
////
////    @And("User_608 double click on the retrieved reference code in Approve level1")
////    public void user_double_click_on_the_retrieve_reference_code_in_approve_level1() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1RetrieveCode_608());
////    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.approveLevel1RetrieveCode_608());        
////    }
////
////    @And("User_608 select the Approve level1 decision as Forward")
////    public void user_select_the_approve_level1_decision_as_forward() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1SelectDecisionForward_608());
////    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel1SelectDecisionForward_608(), testData.get("Decision"));
////    	for(int i = 0; i <= 500; i++) {
////    		try {
////				if(!(WIFAKapplicationObj608.approveLevel1SelectDecisionForward_608().getAttribute("prevvalue").isBlank())) {
////					break;
////				}
////			} catch (Exception e) {
////				// TODO: handle exception
////			}
////    	}    
////    }
////    
////    @And("User_608 select the Approve level1 decision as Approve")
////    public void user_select_the_approve_level1_decision_as_approve() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1SelectDecision_608());
////    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel1SelectDecision_608(), testData.get("Decision3"));        
////    }
//////
//    @And("User_608 select the Approve level1 decision Forward to Approve level3")
//    public void user_select_the_approve_level1_decision_forward_to_approve_level3() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1DecisionForwardTo_608());
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel1DecisionForwardTo_608(), testData.get("Forward To"));
//    }
//////
////    @When("User_608 clicks on the Approve level1 submit button")
////    public void user_clicks_on_the_approve_level1_submit_button() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel1SubmitBtn_608());
////    	WIFAKapplicationObj608.approveLevel1SubmitBtn_608().click();
////    	
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
////    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
////    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();        
////    }
////    
////    
////    @Then("User_608 clicks the Approve Level2 menu under Application for financial facilities")
////    public void user_clicks_the_approve_level2_menu_under_application_for_financial_facilities() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel2_608());
////    	WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel2_608().click();        
////    }
////
////    @And("User_608 enter the reference code in Approve level2")
////    public void user_enter_the_reference_code_in_approve_level2() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel2RefCodeInput_608());
////    	WIFAKapplicationObj608.approveLevel2RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
////    }
////
////    @And("User_608 double click on the retrieved reference code in Approve level2")
////    public void user_double_click_on_the_retrieved_reference_code_in_approve_level2() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel2RetrieveRefCode_608());
////    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.approveLevel2RetrieveRefCode_608());        
////    }
////
////    @And("User_608 select the Approve level2 decision as Approve")
////    public void user_select_the_approve_level2_decision_as_approve() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel2SelectDecision_608());
////    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel2SelectDecision_608(), testData.get("Decision3"));        
////    }
////
////    @When("User_608 clicks on the Approve level2 submit button")
////    public void user_clicks_on_the_approve_level2_submit_button() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel2SubmitBtn_608());
////    	WIFAKapplicationObj608.approveLevel2SubmitBtn_608().click();
////    	
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
////    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
////    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
////    }
////    
////    @Then("User_608 clicks the Approve Level3 menu under Application for financial facilities")
////    public void user_clicks_the_approve_level3_menu_under_application_for_financial_facilities() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel3_608());
////    	WIFAKapplicationObj608.applicationFinancialFacilityApproveLevel3_608().click();        
////    }
////
////    @And("User_608 enter the reference code in Approve level3")
////    public void user_enter_the_reference_code_in_approve_level3() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel3RefCodeInput_608());
////    	WIFAKapplicationObj608.approveLevel3RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
////    }
////
////    @And("User_608 double click on the retrieved reference code in Approve level3")
////    public void user_double_click_on_the_retrieved_reference_code_in_approve_level3() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel3RetrieveRefCode_608());
////    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj608.approveLevel3RetrieveRefCode_608());        
////    }
////
////    @And("User_608 select the Approve level3 decision as Approve")
////    public void user_select_the_approve_level3_decision_as_approve() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel3SelectDecision_608());
////    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.approveLevel3SelectDecision_608(), testData.get("Decision3"));        
////    }
////
////    @When("User_608 clicks on the Approve level3 submit button")
////    public void user_clicks_on_the_approve_level3_submit_button() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.approveLevel3SubmitBtn_608());
////    	WIFAKapplicationObj608.approveLevel3SubmitBtn_608().click();
////    	
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
////    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.SuccessPopupOkBtn_608());
////    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
////    	
////    	// close the send alert pop-up box
////    	for (int i = 0; i < 2000; i++) {
////			try {
////		    	WIFAKapplicationObj608.level3SendAlertPopup_608().click();
////		    	break;
////			} catch (Exception e) {
////				if (i==1999) {
////					Assert.fail(e.getMessage());
////				}
////			}
////		}
////        
////    }
//
//    
//
////  @AT_RF_102
//    @And("^User_608 select the Item in limit Details$")
//    public void user_select_the_item_in_limit_details() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsItem_608());
////    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.limitDetailsItem(), "Import L/C");
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj608.limitDetailsItem_608(), testData.get("Limit Details Item"));
//    	
//    	for(int i = 0; i <= 500; i++) {
//    		try {
//				if(!(WIFAKapplicationObj608.limitDetailsNewRecordProductClass_608().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}
//    }
//
//    @And("^User_608 select the Maturity date in limit Details$")
//    public void user_select_the_maturity_date_in_limit_details() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsMaturityDateCalender_608());
//    	WIFAKapplicationObj608.limitDetailsMaturityDateCalender_608().click();
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsItem_608());
//    	WIFAKapplicationObj608.limitDetailsMaturityDate_608().click();
//    	
//    	// check the Clean flag
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608());
//        WebElement cleanFlag = WIFAKapplicationObj608.limitDetailsNewRecordCleanFlag_608();
//        if(!(cleanFlag.isSelected())) {
//        	cleanFlag.click();
//    	}
//    }
//
//    @And("^User_608 enter the Margin rate in limit Details$")
//    public void user_enter_the_margin_rate_in_limit_details() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//        	try {
//        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj608.limitDetailsMarginRateInput_608());
//    				break;
//    			} catch (Exception e) {
//    				if (i == 300) {
//    					Assert.fail(e.getMessage());
//    				}
//    			}
//    	}
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsMarginRateInput_608());
////    	WIFAKapplicationObj608.limitDetailsMarginRateInput().sendKeys("2");
//    	WIFAKapplicationObj608.limitDetailsMarginRateInput_608().sendKeys(testData.get("Margin Rate"));
//    	WIFAKapplicationObj608.limitDetailsMarginRateInput_608().sendKeys(Keys.TAB);
//        
//    }
//    
//    @And("^User_608 clicks the validate button$")
//    public void user_clicks_the_validate_button() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.limitDetailsValidateBtn_608());
//    	WIFAKapplicationObj608.limitDetailsValidateBtn_608().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.WarningPopupOkBtn_608());
//    	WIFAKapplicationObj608.WarningPopupOkBtn_608().click();
//    	
//    	// Facility already created popup
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.confirmPopup_608());
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.facilityAlreadyCreatedPopup_608());
//    	WIFAKapplicationObj608.facilityAlreadyCreatedPopup_608().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj608.successPopup_608());
////    	String SuccessMsg = WIFAKapplicationObj608.successPopupMessage().getText();
//    	String refCode = WIFAKapplicationObj608.successPopupMessage_608().getText().substring(23, 27);
//    	System.err.println("Reference Number: "+refCode);
//    	fmsTransactionsExcelData.updateTestData("DS_AT_AFF_048", "Reference Code", refCode);
//    	
//    	for (int i = 0; i < 2000; i++) {
//			try {
//		    	WIFAKapplicationObj608.SuccessPopupOkBtn_608().click();
//		    	break;
//			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    
//    	
//    	// close the send alert pop-up box
////    	Thread.sleep(5000);
//    	for (int i = 0; i < 2000; i++) {
//			try {
//		    	WIFAKapplicationObj608.sendAlertPopup_608().click();
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
//    

//    
//    
//
//
//    
////  @AT_FM_059_User_608
   


}
