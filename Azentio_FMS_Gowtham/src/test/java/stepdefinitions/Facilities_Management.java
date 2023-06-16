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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CommonElements.Facilities_Management_Obj;
import resources.BaseClass;

public class Facilities_Management {
	
		WebDriver driver = BaseClass.driver;
		ConfigFileReader configFileReader = new ConfigFileReader();
		Facilities_Management_Obj FacilitiesManagementObj = new Facilities_Management_Obj(driver);
		WaitHelper waitHelper = new WaitHelper(driver);
		ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
		Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
		FMSLogin login = new FMSLogin(driver);
		JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
		DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
		String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
		ExcelData fmsTransactionsExcelData1 = new ExcelData(path, "Request", "Data Set ID");
		Map<String, String> testData1;
	
		ExcelData fmsTransactionsExcelData2 = new ExcelData(path, "Facility_Management_Under_WIFAK", "Data Set ID");
		Map<String, String> testData2;
		//@542234
		
		@Given("User update test data for test case no 542234")
		public void user_update_test_data_for_test_case_no_542234() {
			testData1 = fmsTransactionsExcelData1.getTestdata("AT_FM_020");
		}
		
		
		@And("User_607 clicks on the Request module")
		public void user_clicks_on_the_request_module() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					JavascriptHelper.scrollIntoView(FacilitiesManagementObj.FMSCoreRequestModule_607());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.FMSCoreRequestModule_607());
		    FacilitiesManagementObj.FMSCoreRequestModule_607().click();
		}

		@And("User_607 clicks on the Request Financing under Request module")
		public void user_clicks_on_the_request_financing_under_request_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestFinancingFeature_607());
			FacilitiesManagementObj.requestFinancingFeature_607().click();	    
		}

		@And("User_607 clicks on the Request for Financing under Request Financing feature")
		public void user_clicks_on_the_request_for_financing_under_request_financing_feature() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingFeature_607());
			FacilitiesManagementObj.requestForFinancingFeature_607().click();	    
		}

		@And("User_607 clicks on the Maintanance screen under Request for Financing")
		public void user_clicks_on_the_maintanance_screen_under_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMaintanance_607());
			FacilitiesManagementObj.requestForFinancingMaintanance_607().click();	    
		}
	@And("User_607 select the Reason for submission under main screen in Request for Financing")
		public void user_select_the_reason_for_submission_under_main_screen_in_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainReasonForDropdown_607());
		    DropDownHelper.SelectUsingVisibleText(FacilitiesManagementObj.requestForFinancingMainReasonForDropdown_607(), testData1.get("Reason For Submission"));
		}

		@And("User_607 enter the CIF no in main screen under Request for Financing")
		public void user_enter_the_cif_no_in_main_screen_under_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainCustomerInput_607());
			FacilitiesManagementObj.requestForFinancingMainCustomerInput_607().sendKeys(testData1.get("Customer CIF"),Keys.TAB);
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(FacilitiesManagementObj.requestForFinancingMainShortNameInput_607().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					
				}
	    	} 
		}

		@And("User_607 enter the facility type in main screen under Request for Financing")
		public void user_enter_the_facility_type_in_main_screen_under_request_for_financing()throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainFacilityTypeInput_607());
			FacilitiesManagementObj.requestForFinancingMainFacilityTypeInput_607().sendKeys(testData1.get("Facility Type"),Keys.TAB);
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(FacilitiesManagementObj.requestForFinancingMainCYInput_607().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					
				}
	    	}
		}

		@And("User_607 enter the total limit in main screen under Request for Financing")
		public void user_enter_the_total_limit_in_main_screen_under_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainTotalLimitInput_607());
			FacilitiesManagementObj.requestForFinancingMainTotalLimitInput_607().sendKeys(testData1.get("Total Limit"),Keys.TAB);
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(FacilitiesManagementObj.requestForFinancingMainTotalLimitInput_607().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					
				}
			}	    
		}

		@And("User_607 move to the sublimit tab in main screen under Request for Financing")
		public void user_move_to_the_sublimit_tab_in_main_screen_under_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainSublimitTab_607());
			FacilitiesManagementObj.requestForFinancingMainSublimitTab_607().click();
		}

		@And("User_607 click the add new button in sublimit tab under main screen in Request for Financing")
		public void user_click_the_add_new_button_in_sublimit_tab_under_main_screen_in_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewBtn_607());
			FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewBtn_607().click();
		}

		@And("User_607 enter the product class in limit details tab under sublimit tab")
		public void user_enter_the_product_class_in_limit_details_tab_under_sublimit_tab() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewProductClassInput_607());
			FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewProductClassInput_607().sendKeys(testData1.get("Product Class"),Keys.TAB);
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewProductClassInput_607().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					 
				}
			}
		}

		@And("User_607 enter the margin value in limit details tab under sublimit tab")
		public void user_enter_the_margin_value_in_limit_details_tab_under_sublimit_tab() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewMarginInput_607());
			FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewMarginInput_607().clear();
			FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewMarginInput_607().sendKeys(testData1.get("Margin Value"),Keys.TAB);
			
			for (int i = 0; i <= 300; i++) {
				if (!(FacilitiesManagementObj.requestForFinancingMainSublimitTabAddNewMarginInput_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			}
		}

		@And("User_607 click the add button in limit details tab under sublimit tab")
		public void user_click_the_add_button_in_limit_details_tab_under_sublimit_tab() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainSublimitTabAddBtn_607());
			FacilitiesManagementObj.requestForFinancingMainSublimitTabAddBtn_607().click();		
			
			try {
				for (int i = 0; i < 200; i++) {
					if(FacilitiesManagementObj.ServerLoding_pop().isDisplayed()) {
						FacilitiesManagementObj.ServerLoding_pop().click();
						waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainSublimitTabAddBtn_607());
						FacilitiesManagementObj.requestForFinancingMainSublimitTabAddBtn_607().click();
						break;
					}
				}
			} catch (Exception e) {
				
			}
		}
		String RequestID;
		@When("User_607 click the Save button in main screen under Request for Financing")
		public void user_click_the_save_button_in_main_screen_under_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainSaveBtn_607());
			FacilitiesManagementObj.requestForFinancingMainSaveBtn_607().click();
			
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.confirmsavepopupokbutton_607());
			FacilitiesManagementObj.confirmsavepopupokbutton_607().click();
			
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.confirmsavesuccessfullypopup_607());
			
			RequestID = FacilitiesManagementObj.successPopupMsg_607().getText().substring(10, 14);
	    	System.err.println("Reference Number: "+RequestID);
	    	fmsTransactionsExcelData1.updateTestData("AT_FM_020", "Request Code", RequestID);
	    	
			for (int i = 0; i < 500; i++) {
				try {
					FacilitiesManagementObj.confirmsavesuccessfullypopup_607().click();
			    	break;
				} catch (Exception e) {
					if (i==499) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}

		@And("User_607 click the Validate button in main screen Request for Financing")
		public void user_click_the_validate_button_in_main_screen_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingMainValidateBtn_607());
			FacilitiesManagementObj.requestForFinancingMainValidateBtn_607().click();
			
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.confirmsavepopupokbutton_607());
			FacilitiesManagementObj.confirmsavepopupokbutton_607().click();
			
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.CONFIRM_pop());
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.facilityAlreadyCreatedPopup());
			FacilitiesManagementObj.facilityAlreadyCreatedPopup().click();
			    	
	    		for (int i = 0; i < 1000; i++) {
	    			try {
					 if(FacilitiesManagementObj.confirmsavesuccessfullypopup_607().isDisplayed()) {
						 FacilitiesManagementObj.confirmsavesuccessfullypopup_607().click();
						 break;
					 }
				
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
			}
			}
	    		}
	    		
				for (int i = 0; i < 1000; i++) {
	    			try {
	    				if(FacilitiesManagementObj.SendAlert_pop().isDisplayed()) {
							 FacilitiesManagementObj.SendAlert_pop().click(); 
							 break;
						 }
				
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
			}
			}
				}
	    	
		}
		
		@Then("User_607 click the approve level1 under Request for Financing")
		public void user_click_the_approve_level1_under_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingApproveLevel1_607());
	    	FacilitiesManagementObj.requestForFinancingApproveLevel1_607().click();
		}
		
		@And("User_607 enter the request code in approve level1 under Request for Financing")
		public void user_enter_the_request_code_in_approve_level1_under_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingApproveLevel1Code_607());
			FacilitiesManagementObj.requestForFinancingApproveLevel1Code_607().sendKeys(RequestID,Keys.ENTER);
		}

		@And("User_607 double click on the first row in approve level1 under Request for Financing")
		public void user_double_click_on_the_first_row_in_approve_level1_under_request_for_financing() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.requestForFinancingApproveLevel1FirstRow_607());
		    clicksAndActionsHelper.doubleClick(FacilitiesManagementObj.requestForFinancingApproveLevel1FirstRow_607());
		}
		
		
		@Given("User_607 Click the Disbursement Sublimit In ApproveLev1")
		public void user_click_the_disbursement_sublimit_in_approve_lev1() {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_DisbursementSublimitInApproveLev1());
			
			for (int i = 0; i < 1000; i++) {
				try {
					FacilitiesManagementObj.Click_DisbursementSublimitInApproveLev1().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Given("user_607 Open the Product class in approve lev1")
		public void user_open_the_product_class_in_approve_lev1() {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Select_productClassIn_Approvelev1());
			clicksAndActionsHelper.doubleClick(FacilitiesManagementObj.Select_productClassIn_Approvelev1());

		}

		@Then("user_607 Check the ammount in decimal value")
		public void user_check_the_ammount_in_decimal_value() {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Check_ammount_In_productClass());
			String checkammount = FacilitiesManagementObj.Check_ammount_In_productClass().getAttribute("value");
			Double i=Double.parseDouble(checkammount);
			boolean isDecimal = i % 1 != 0;
			Assert.assertEquals(true, isDecimal);
		
		}

	
	///	@165388
		

		@And("^User_607 clicks the facility management under wifak application$")
        public void user_607clicks_the_facility_management_under_wifak_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.facilitymanagement_607());
			FacilitiesManagementObj.facilitymanagement_607().click();
		}
		@And("user clicks the query menu under facility management")
	    public void user_clicks_the_query_menu_under_facility_management() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.facilitymanagementquerymenu());
	    	FacilitiesManagementObj.facilitymanagementquerymenu().click();	        
	    }

	    @And("user clicks on the clear button in query under facility management")
	    public void user_clicks_on_the_clear_button_in_query_under_facility_management() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.facilitymanagementquerymenuclearbtn());  
	    	for (int i = 0; i < 1000; i++) {
				try {
					FacilitiesManagementObj.facilitymanagementquerymenuclearbtn().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	
	    }

	    @And("user validate the retrived records are not duplicate")
	    public void user_validate_the_retrived_records_are_not_duplicate() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.facilitymanagementquerymenuCode());
	    	List<WebElement> code = driver.findElements(By.xpath("table[@id='facilityManagementGridTbl_Id_WIFT008QY']td[@tdlabel='Code']"));
	    	
	    	System.out.println("Code Size: "+code.size());
	    	
	    	for (WebElement webElement : code) {
	            String getCode = webElement.getText();
	            System.out.println(getCode);
	        }
	    }   
	
	
	
	//@172636
	    @Given("User_607 update test data for test case no 172636")
		public void user_update_test_data_for_test_case_no() {
			testData2 = fmsTransactionsExcelData2.getTestdata("AT_FM_054");
		}
	   
	    @Given("User_607 Click update AfterApprove under facility management")
	    public void user_click_update_after_approve_under_facility_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_updateAfterApprove_under_Facilities_Management_607());
	    	FacilitiesManagementObj.Click_updateAfterApprove_under_Facilities_Management_607().click();
	        
	    }

	    @Given("User_607 Select Record in update AfterApprove under Facilities Management")
	    public void user_select_record_in_update_after_approve_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_Clearsearch_updateAfterApprove_under_Facilities_Management_607());
	    	for (int i = 0; i < 1000; i++) {
				try {
					FacilitiesManagementObj.Click_Clearsearch_updateAfterApprove_under_Facilities_Management_607().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.SelectRecord_updateAfterApprove_under_Facilities_Management_607());
	    	clicksAndActionsHelper.doubleClick(FacilitiesManagementObj.SelectRecord_updateAfterApprove_under_Facilities_Management_607());

	    }

	    @Given("User_607 Click Facility Application Details In updateAfterApprove")
	    public void user_click_facility_application_details_in_update_after_approve() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_Facility_Application_Details_InupdateAfterApprove_under_Facilities_Management());
	    	FacilitiesManagementObj.Click_Facility_Application_Details_InupdateAfterApprove_under_Facilities_Management().click();
	        
	    }

	    @Given("User_607 Check Exceed Facility at Sublimit In update AfterApprove")
	    public void user_check_exceed_facility_at_sublimit_in_update_after_approve() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Check_Exceed_Facility_at_SublimitInupdateAfterApprove_under_Facilities_Management_607());
	    	FacilitiesManagementObj.Check_Exceed_Facility_at_SublimitInupdateAfterApprove_under_Facilities_Management_607().click();
	        
	    }

	    @Given("User_607 Click Document Details In update AfterApprove under Facilities Management")
	    public void user_click_document_details_in_update_after_approve_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.click_DocumentDetails_InupdateAfterApprove_under_Facilities_Management_607());
	    	FacilitiesManagementObj.click_DocumentDetails_InupdateAfterApprove_under_Facilities_Management_607().click();

	        
	    }

	    @Given("User_607 Enter Solicitor Date Sent In DocumentD etails")
	    public void user_enter_solicitor_date_sent_in_document_d_etails() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_Firstline_InDocumentDetails_607());
	    	FacilitiesManagementObj.Click_Firstline_InDocumentDetails_607().click();
	    	System.out.println(testData2.get("Solicitor Date Sent"));
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_SolicitorDateSent_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_SolicitorDateSent_InDocumentDetails_607().sendKeys(testData2.get("Solicitor Date Sent"));

	    }

	    @Given("User_607 Enter Solicitor Date Received In Document Details")
	    public void user_enter_solicitor_date_received_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_SolicitorDateReceived_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_SolicitorDateReceived_InDocumentDetails_607().sendKeys(testData2.get("Solicitor Date Received"));

	        
	    }

	    @Given("User_607 Enter Estimator Date Sent In Document Details")
	    public void user_enter_estimator_date_sent_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_EstimatorDateSent_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_EstimatorDateSent_InDocumentDetails_607().sendKeys(testData2.get("Estimator Date Sent"));

	    }

	    @Given("User_607 Enter Estimator Date Received In Document Details")
	    public void user_enter_estimator_date_received_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_EstimatorDateReceived_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_EstimatorDateReceived_InDocumentDetails_607().sendKeys(testData2.get("Estimator Date Received"));
	        
	    }

	    @Given("User_607 Enter Custodian date Sent In Document Details")
	    public void user_enter_custodian_date_sent_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_CustodiandateSent_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_CustodiandateSent_InDocumentDetails_607().sendKeys(testData2.get("Custodian date Sent"));
	        
	    }

	    @Given("User_607 Enter second Solicitor Date Sent In DocumentD etails")
	    public void user_enter_second_solicitor_date_sent_in_document_d_etails() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_Secondline_InDocumentDetails_607());
	    	FacilitiesManagementObj.Click_Secondline_InDocumentDetails_607().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_2ndSolicitorDateSent_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_2ndSolicitorDateSent_InDocumentDetails_607().sendKeys(testData2.get("second Solicitor Date"));
	        
	    }

	    @Given("User_607 Enter second Solicitor Date Received In Document Details")
	    public void user_enter_second_solicitor_date_received_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_2ndSolicitorDateReceived_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_2ndSolicitorDateReceived_InDocumentDetails_607().sendKeys(testData2.get("second Solicitor Date"));
	        
	    }

	    @Given("User_607 Enter second Estimator Date Sent In Document Details")
	    public void user_enter_second_estimator_date_sent_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_2ndEstimatorDateSent_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_2ndEstimatorDateSent_InDocumentDetails_607().sendKeys(testData2.get("Custodian date Sent"));
	    }

	    @Given("User_607 Enter second Estimator Date Received In Document Details")
	    public void user_enter_second_estimator_date_received_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_2ndEstimatorDateReceived_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_2ndEstimatorDateReceived_InDocumentDetails_607().sendKeys(testData2.get("second Estimator Date"));

	        
	    }

	    @Given("User_607 Enter second Custodian date Sent In Document Details")
	    public void user_enter_second_custodian_date_sent_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.enter_2ndCustodiandateSent_InDocumentDetails_607());
	    	FacilitiesManagementObj.enter_2ndCustodiandateSent_InDocumentDetails_607().sendKeys(testData2.get("second Custodian date"));
	    	
	        
	    }

	    @Given("User_607 Click save button In update AfterApprove under Facilities Management")
	    public void user_click_save_button_in_update_after_approve_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_saveButton_InupdateAfterApprove_under_Facilities_Management_607());
	    	FacilitiesManagementObj.Click_saveButton_InupdateAfterApprove_under_Facilities_Management_607().click();
	    	
	    	
	    	
	    	for (int i = 0; i < 1000; i++) {
				try {
					if(FacilitiesManagementObj.ServerLoding_pop().isDisplayed()) {
						FacilitiesManagementObj.ServerLoding_pop().click();
						
						//waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_saveButton_InupdateAfterApprove_under_Facilities_Management_607());
				    	FacilitiesManagementObj.Click_saveButton_InupdateAfterApprove_under_Facilities_Management_607().click();
					break;
				}} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	
	    	for (int i = 0; i < 1000; i++) {
				try {
				//	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.confirmsavepopupokbutton_607());
			    	FacilitiesManagementObj.confirmsavepopupokbutton_607().click();
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	
	    	for (int i = 0; i < 1000; i++) {
				try {
					//waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.successPopupMsg_607());
			    	FacilitiesManagementObj.successPopupMsg_607().click();

				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	for (int i = 0; i < 1000; i++) {
				try {

			    	//waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.SendAlert_pop());
			    	FacilitiesManagementObj.SendAlert_pop().click();

				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}

	    	
	    }

	    @Given("User_607 Click ApproveReject under Facilities Management")
	    public void user_click_approve_reject_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_ApproveReject_under_Facilities_Management_607());
	    	FacilitiesManagementObj.Click_ApproveReject_under_Facilities_Management_607().click();

	    }

	    @Given("User_607 Select Record In ApproveReject under Facilities Management")
	    public void user_select_record_in_approve_reject_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_Clearsearch_InApproveReject_under_Facilities_Management());
	    	FacilitiesManagementObj.Click_Clearsearch_InApproveReject_under_Facilities_Management().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.SelectRecordIn_ApproveReject_under_Facilities_Management_607());
	    	clicksAndActionsHelper.doubleClick(FacilitiesManagementObj.SelectRecordIn_ApproveReject_under_Facilities_Management_607());

	    }

	    @Given("User_607 Approve Record In ApproveReject under Facilities Management")
	    public void user_approve_record_in_approve_reject_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.ApproveRecordIn_ApproveReject_under_Facilities_Management_607());
	    	FacilitiesManagementObj.ApproveRecordIn_ApproveReject_under_Facilities_Management_607().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.confirmsavepopupokbutton_607());
	    	FacilitiesManagementObj.confirmsavepopupokbutton_607().click();

	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.successPopupMsg_607());
	    	FacilitiesManagementObj.successPopupMsg_607().click();

	    }

	    @Given("User_607 Click Mainteance under Facilities Management")
	    public void user_click_mainteance_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.ClickMainteance_under_Facilities_Management_607());
	    	FacilitiesManagementObj.ClickMainteance_under_Facilities_Management_607().click();

	    }

	    @Given("User_607 Search the record in Mainteance under Facilities Management")
	    public void user_search_the_record_in_mainteance_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_search_InMainteance_under_Facilities_Management_607());
	    	FacilitiesManagementObj.Click_search_InMainteance_under_Facilities_Management_607().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_ClearSearch_InMainteance_under_Facilities_Management_607());
	    	FacilitiesManagementObj.Click_ClearSearch_InMainteance_under_Facilities_Management_607().click();
	    }

	    @Given("User_607 Select Record In Mainteance under Facilities Management")
	    public void user_select_record_in_mainteance_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.SelectRecord_InMainteance_under_Facilities_Management_607());
	    	clicksAndActionsHelper.doubleClick(FacilitiesManagementObj.SelectRecord_InMainteance_under_Facilities_Management_607());
	    }

	    @Given("User_607 Click Facility Application Details In Mainteance under Facilities Management")
	    public void user_click_facility_application_details_in_mainteance_under_facilities_management() {
	    	//waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.click_Facility_Application_Details_InMainteance_under_Facilities_Management_607());
	    	for (int i = 0; i < 1000; i++) {
				try {
					FacilitiesManagementObj.click_Facility_Application_Details_InMainteance_under_Facilities_Management_607().click();

				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	

	    }

	    @Given("User_607 Check the Flag Is Check or Not In Facility Application Details In Mainteance under Facilities Management")
	    public void user_check_the_flag_is_check_or_not_in_facility_application_details_in_mainteance_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.check_theFlagIsCheckorNot_InFacility_Application_Details_InMainteance_under_Facilities_Management_607());
	    	String Check =FacilitiesManagementObj.check_theFlagIsCheckorNot_InFacility_Application_Details_InMainteance_under_Facilities_Management_607().getAttribute("checked");
	    	Assert.assertEquals("checked", "checked");
	    }

	    @Given("User_607 Click Document Details In Mainteance under Facilities Management")
	    public void user_click_document_details_in_mainteance_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Click_DocumentDetails_InMainteance_under_Facilities_Management_607());
	    	FacilitiesManagementObj.Click_DocumentDetails_InMainteance_under_Facilities_Management_607().click();

	    }

	    @Given("User_607 Check date Filled Or Not In Document Details In Mainteance under Facilities Management")
	    public void user_check_date_filled_or_not_in_document_details_in_mainteance_under_facilities_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementObj.Check_dateFilledOrNot_InDocumentDetails_InMainteance_under_Facilities_Management_607());
	    	String Checkdate = FacilitiesManagementObj.Check_dateFilledOrNot_InDocumentDetails_InMainteance_under_Facilities_Management_607().getText();
	    	if (Checkdate.isBlank()||Checkdate.isEmpty()) {
				Assert.fail();
			}

	    }

	
	
}
