package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.fms.RequestMenuOBJ_611;
import resources.BaseClass;

public class RequestMenuSteps_611 {
	WebDriver driver = BaseClass.driver;
	RequestMenuOBJ_611 requestmenu = new RequestMenuOBJ_611(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clickandactionhelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	FMSLogin fmslogin = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsRequestForFinancingExcelData = new ExcelData(path,"RequestForFinancingTestData","DataSet ID");
	Map<String, String> testData;
	
	//@AT_RF_169
	@And("User_611 get the test data for test case AT_RF_169")
	public void user_get_the_test_data_for_test_case_at_fm_043() throws Throwable {
		testData = fmsRequestForFinancingExcelData.getTestdata("AT_RF_169");
	}
	
	//@127919_Fms_Core
		@And("User_611 clicks the Request Menu under fms application")
		public void user_clicks_the_request_menu_under_fms_application() throws Throwable {
			
		    	for(int i = 0; i <= 300; i++) {
		    		try {
		    			javascripthelper.scrollIntoView(requestmenu.fmsappliactionrequestmenu_611());
					} catch (Exception e) {
						if(i == 300) {
							Assert.fail(e.getMessage());
							break;
						}
					}
		    	}
//		    	Thread.sleep(5000);
		    	waithelper.waitForElementwithFluentwait(driver, requestmenu.fmsappliactionrequestmenu_611());
		    	requestmenu.fmsappliactionrequestmenu_611().click();
		    }
			

		@And("User_611 validate the facility management Menu are available in request financing")
		public void user_validate_the_facility_management_menu_are_available_in_request_financing() throws Throwable {
//			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestmenurequestfinancing_611());
//			requestmenu.requestmenurequestfinancing_611().click();
			
			
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingfacilitymanagement_611());
			requestmenu.requestfinancingfacilitymanagement_611().click();
		    
		}

		@And("User_611 validate the sub menus are available in request for financing menu")
		public void user_validate_the_sub_menu_s_are_available_in_request_for_financing_menu() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingrequestforfinancing_611());
			requestmenu.requestfinancingrequestforfinancing_611().click();
			
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingrequestforfinancingFirst_611());
	    	List<WebElement> code = driver.findElements(By.xpath("//div[@id='_selenuimRFFRF00']//ul/div/li/a/span[2]"));
	    	
//			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingrequestforfinancingFirst());
//	    	WebElement findElement = driver.findElement(By.xpath("//*[@id='RFFRF00LC']/span[2]"));
//	    	String text = findElement.getText();
//	    	System.out.println("Title Text: "+text);
	    	
	    	System.out.println("Code Size: "+code.size());
	    	
	    	for (WebElement webElement : code) {
	            String getCode = webElement.getText();
	            System.out.println(getCode);
	        }
		}
		
		//@809575_Fms_Core
		
		@And("User_611 clicks the Request Financing under request menu")
		public void user_clicks_the_request_financing_under_request_menu() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestmenurequestfinancing_611());
			requestmenu.requestmenurequestfinancing_611().click();
		    
		}

		@And("User_611 clicks the Request For Financing under Request Financing")
		public void user_clicks_the_request_for_financing_under_request_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingrequestforfinancing_611());
			requestmenu.requestfinancingrequestforfinancing_611().click();
		    
		}

		@And("User_611 clicks the Maintenence Menu under Request For Financing")
		public void user_clicks_the_maintenence_menu_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestforfinancingmaintenance_611());
			requestmenu.requestforfinancingmaintenance_611().click();
			
		   
		}
		
		//127920
		@And("User_611 clear the caches in FMS Application")
		public void user_clear_the_caches_in_fms_application() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.FMSCoreTechDetailsIcon_611());
			requestmenu.FMSCoreTechDetailsIcon_611().click();
			
			waithelper.waitForElementwithFluentwait(driver, requestmenu.FMSCoreClearCacheBtn_611());
			requestmenu.FMSCoreClearCacheBtn_611().click();
			
			for (int i = 0; i < 2000; i++) {
				try {
					requestmenu.SuccessPopupOkBtn_611().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("User_611 select the Reason for submission under main screen in Request for Financing")
		public void user_select_the_reason_for_submission_under_main_screen_in_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainReasonForDropdown_611());
			dropdownhelper.SelectUsingVisibleText(requestmenu.requestForFinancingMainReasonForDropdown_611(),
					testData.get("Reason For Submission"));
		}

		@And("User_611 enter the CIF no in main screen under Request for Financing")
		public void user_enter_the_cif_no_in_main_screen_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainCustomerInput_611());
			requestmenu.requestForFinancingMainCustomerInput_611().sendKeys(testData.get("Customer CIF"),
					Keys.TAB);

			for (int i = 0; i <= 500; i++) {
				try {
					if (!(requestmenu.requestForFinancingMainShortNameInput_611().getAttribute("prevvalue")
							.isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		@And("User_611 enter the facility type in main screen under Request for Financing")
		public void user_enter_the_facility_type_in_main_screen_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainFacilityTypeInput_611());
			requestmenu.requestForFinancingMainFacilityTypeInput_611().sendKeys(testData.get("Facility Type"),
					Keys.TAB);

			for (int i = 0; i <= 500; i++) {
				try {
					if (!(requestmenu.requestForFinancingMainCYInput_611().getAttribute("prevvalue")
							.isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		@And("User_611 enter the total limit in main screen under Request for Financing")
		public void user_enter_the_total_limit_in_main_screen_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainTotalLimitInput_611());
			requestmenu.requestForFinancingMainTotalLimitInput_611().sendKeys(testData.get("Total Limit"),
					Keys.TAB);

			for (int i = 0; i <= 500; i++) {
				try {
					if (!(requestmenu.requestForFinancingMainTotalLimitInput_611().getAttribute("prevvalue")
							.isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		@And("User_611 move to the sublimit tab in main screen under Request for Financing")
		public void user_move_to_the_sublimit_tab_in_main_screen_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainSublimitTab_611());
			requestmenu.requestForFinancingMainSublimitTab_611().click();
		}
		@And("User_611 click the add new button in sublimit tab under main screen in Request for Financing")
		public void user_click_the_add_new_button_in_sublimit_tab_under_main_screen_in_request_for_financing()
				throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainSublimitTabAddNewBtn_611());
			requestmenu.requestForFinancingMainSublimitTabAddNewBtn_611().click();
		}

		@And("User_611 enter the product class in limit details tab under sublimit tab")
		public void user_enter_the_product_class_in_limit_details_tab_under_sublimit_tab() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainSublimitTabProductClassInput_611());
			requestmenu.requestForFinancingMainSublimitTabProductClassInput_611()
					.sendKeys(testData.get("Product Class"), Keys.TAB);

			for (int i = 0; i <= 500; i++) {
				try {
					if (!(requestmenu.requestForFinancingMainSublimitTabProductClassLabel_611()
							.getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		@And("User_611 enter the margin value in limit details tab under sublimit tab")
		public void user_enter_the_margin_value_in_limit_details_tab_under_sublimit_tab() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainSublimitTabAddNewMarginInput_611());
			requestmenu.requestForFinancingMainSublimitTabAddNewMarginInput_611().clear();
			requestmenu.requestForFinancingMainSublimitTabAddNewMarginInput_611()
					.sendKeys(testData.get("Margin Value"), Keys.TAB);
		}

		@And("User_611 click the add button in limit details tab under sublimit tab")
		public void user_click_the_add_button_in_limit_details_tab_under_sublimit_tab() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javascripthelper
							.scrollIntoView(requestmenu.requestForFinancingMainSublimitTabAddBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainSublimitTabAddBtn_611());
			requestmenu.requestForFinancingMainSublimitTabAddBtn_611().click();
		}

		@When("User_611 click the Save button in main screen under Request for Financing")
		public void user_click_the_save_button_in_main_screen_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestForFinancingMainSaveBtn_611());
			requestmenu.requestForFinancingMainSaveBtn_611().click();

			waithelper.waitForElementwithFluentwait(driver, requestmenu.ButtonConfirmOk_611());
			requestmenu.ButtonConfirmOk_611().click();

			waithelper.waitForElementwithFluentwait(driver, requestmenu.ButtonSuccessOk_611());
			for (int i = 0; i < 500; i++) {
				try {
					requestmenu.ButtonSuccessOk_611().click();
					break;
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}

		}

		@And("User_611 click the Validate button in main screen Request for Financing")
		public void user_click_the_validate_button_in_main_screen_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingMainValidateBtn_611());
			requestmenu.requestForFinancingMainValidateBtn_611().click();

			waithelper.waitForElementwithFluentwait(driver, requestmenu.ButtonConfirmOk_611());
			requestmenu.ButtonConfirmOk_611().click();

			// Facility already created pop-up
			for (int i = 0; i < 2000; i++) {
				try {
					waithelper.waitForElementwithFluentwait(driver,
							requestmenu.facilityAlreadyCreatedPopupOkBtn_611());
					requestmenu.facilityAlreadyCreatedPopupOkBtn_611().click();
					break;
				} catch (Exception e) {

				}
			}
//	    	waitHelper.waitForElementwithFluentwait(driver, requestmenu.confirmPopup_611());
//	    	waitHelper.waitForElementwithFluentwait(driver, requestmenu.facilityAlreadyCreatedPopupOkBtn_611());
//	    	requestmenu.facilityAlreadyCreatedPopupOkBtn_611().click();

			waithelper.waitForElementwithFluentwait(driver, requestmenu.successPopup_611());
			String RequestID = requestmenu.successPopupMsg_611().getText().substring(10, 14);
			System.err.println("Reference Number: " + RequestID);
			fmsRequestForFinancingExcelData.updateTestData(testData.get("DataSet ID"), "Request Code", RequestID);

			for (int j = 0; j < 2000; j++) {
				try {
					requestmenu.ButtonSuccessOk_611().click();
					break;
				} catch (Exception e) {
					if (j == 1999) {
						Assert.fail(e.getMessage());
					}
				}
			}

			// close the send alert pop-up box
			waithelper.waitForElementwithFluentwait(driver, requestmenu.RequestSendAlertPopup_611());
			for (int k = 0; k < 2000; k++) {
				try {
					requestmenu.requestSendAlertPopupDismissBtn_611().click();
					break;
				} catch (Exception e) {

				}
			}

		}

		@Then("User_611 click the approve level1 under Request for Financing")
		public void user_click_the_approve_level1_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingApproveLevel1_611());
			requestmenu.requestForFinancingApproveLevel1_611().click();
		}

		@And("User_611 enter the request code in approve level1 under Request for Financing")
		public void user_enter_the_request_code_in_approve_level1_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingApproveLevel1Code_611());
			requestmenu.requestForFinancingApproveLevel1Code_611().sendKeys(testData.get("Request Code"),
					Keys.ENTER);
		}

		@And("User_611 double click on the first row in approve level1 under Request for Financing")
		public void user_double_click_on_the_first_row_in_approve_level1_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingApproveLevel1FirstRow_611());
			clickandactionhelper.doubleClick(requestmenu.requestForFinancingApproveLevel1FirstRow_611());
		}
		
		@And("User_611 move to customer grading tab in approve level1 under Request for Financing")
		public void user_move_to_customer_grading_tab_in_approve_level1_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approveLevel1CustomerGradingTab_611());
			for (int i = 0; i < 500; i++) {
				try {
					requestmenu.approveLevel1CustomerGradingTab_611().click();
					break;
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}

		}

		@And("User_611 select the approve level1 recommendation decision as forward in approve level1 under Request for Financing")
		public void user_select_the_approve_level1_recommendation_decision_as_forward_in_approve_level1_under_request_for_financing()
				throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javascripthelper
							.scrollIntoView(requestmenu.approveLevel1CustomerGradingApproveDecision_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			dropdownhelper.SelectUsingVisibleText(
					requestmenu.approveLevel1CustomerGradingApproveDecision_611(),
					testData.get("Decision"));
		}

		@And("User_611 select the decision forward to as approval committee in approve level1 under Request for Financing")
		public void user_select_the_decision_forward_to_as_approval_committee_in_approve_level1_under_request_for_financing()
				throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approveLevel1CustomerGradingApproveForwardTo_611());
			dropdownhelper.SelectUsingVisibleText(
					requestmenu.approveLevel1CustomerGradingApproveForwardTo_611(),
					testData.get("Forward To"));
		}

		@And("User_611 select the approval committee in approve level1 under Request for Financing")
		public void user_select_the_approval_committee_in_approve_level1_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approveLevel1CustomerGradingApproveCommittee_611());
			dropdownhelper.SelectUsingVisibleText(
					requestmenu.approveLevel1CustomerGradingApproveCommittee_611(),
					testData.get("Approval Committee"));

		}

		@And("User_611 click the Approve button in approve level1 under Request for Financing")
		public void user_click_the_approve_button_in_approve_level1_under_request_for_financing() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javascripthelper
							.scrollIntoView(requestmenu.requestForFinancingApproveLevel1ApproveBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingApproveLevel1ApproveBtn_611());
			requestmenu.requestForFinancingApproveLevel1ApproveBtn_611().click();

			waithelper.waitForElementwithFluentwait(driver, requestmenu.ButtonConfirmOk_611());
			requestmenu.ButtonConfirmOk_611().click();

			waithelper.waitForElementwithFluentwait(driver, requestmenu.ButtonSuccessOk_611());
			for (int i = 0; i < 500; i++) {
				try {
					requestmenu.ButtonSuccessOk_611().click();
					break;
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}

		}

		@Then("User_611 click the Approval committee recommendation under Request for Financing")
		public void user_click_the_approval_committee_recommendation_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingApprovalCommitteeRecom_611());
			requestmenu.requestForFinancingApprovalCommitteeRecom_611().click();
		}

		@And("User_611 enter the code in Approval committee recommendation under Request for Financing")
		public void user_enter_the_code_in_approval_committee_recommendation_under_request_for_financing()
				throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingApprovalCommitteeRecomCode_611());
			requestmenu.requestForFinancingApprovalCommitteeRecomCode_611()
					.sendKeys(testData.get("Request Code"), Keys.ENTER);
		}

		@And("User_611 double click on the first row in Approval committee recommendation under Request for Financing")
		public void user_double_click_on_the_first_row_in_approval_committee_recommendation_under_request_for_financing()
				throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.requestForFinancingApprovalCommitteeRecomRow1_611());
			clickandactionhelper
					.doubleClick(requestmenu.requestForFinancingApprovalCommitteeRecomRow1_611());
		}

		@And("User_611 move to credit committee recommendation tab in approval committee under Request for Financing")
		public void user_move_to_credit_committee_recommendation_tab_in_approval_committee_under_request_for_financing()
				throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approvalCommitteeCreditCommitteeTab_611());
			for (int i = 0; i < 500; i++) {
				try {
					requestmenu.approvalCommitteeCreditCommitteeTab_611().click();
					break;
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}

		}

		@And("User_611 click the Recommendation division in credit committee under approval committee")
		public void user_click_the_recommendation_division_in_credit_committee_under_approval_committee() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approvalCommitteeCreditCommitteeRecommDiv_611());
			requestmenu.approvalCommitteeCreditCommitteeRecommDiv_611().click();
		}

		@And("User_611 click the plus icon in Recommendation division under credit committee")
		public void user_click_the_plus_icon_in_recommendation_division_under_credit_committee() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approvalCommitteeCreditCommitteeRecommPlusIcon_611());
			requestmenu.approvalCommitteeCreditCommitteeRecommPlusIcon_611().click();
		}

		@And("User_611 select the Recommendation dropdown in Recommendation division under credit committee")
		public void user_select_the_recommendation_dropdown_in_recommendation_division_under_credit_committee()
				throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approvalCommitteeCreditCommitteeRecommLabel_611());
			requestmenu.approvalCommitteeCreditCommitteeRecommLabel_611().click();

			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approvalCommitteeCreditCommitteeRecommDropdown_611());
			dropdownhelper.SelectUsingVisibleText(
					requestmenu.approvalCommitteeCreditCommitteeRecommDropdown_611(),
					testData.get("Recommendation"));
		}

		@When("User_611 click the Recommendation button under Approval committee recommendation")
		public void user_click_the_recommendation_button_under_approval_committee_recommendation() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.approvalCommitteeRecommendationBtn_611());
			requestmenu.approvalCommitteeRecommendationBtn_611().click();

			waithelper.waitForElementwithFluentwait(driver, requestmenu.ButtonConfirmOk_611());
			requestmenu.ButtonConfirmOk_611().click();

			waithelper.waitForElementwithFluentwait(driver, requestmenu.ButtonSuccessOk_611());
			for (int i = 0; i < 500; i++) {
				try {
					requestmenu.ButtonSuccessOk_611().click();
					break;
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}

		}
		
		@And("User_611 clicks the Facilities Management feature under Request Financing")
		public void user_clicks_the_facilities_management_feature_under_request_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestFacilitiesManagementFeature_611());
			requestmenu.requestFacilitiesManagementFeature_611().click();
		}

		@And("User_611 clicks the Maintanance in Facilities Management under Request Financing")
		public void user_clicks_the_maintanance_in_facilities_management_under_request_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestFacilitiesManagementMaintanance_611());
			requestmenu.requestFacilitiesManagementMaintanance_611().click();
		}

		@And("User_611 click the search button in maintanance screen under Facilities Management")
		public void user_click_the_search_button_in_maintanance_screen_under_facilities_management() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestFacilitiesManagementMainSearchBtn_611());
			requestmenu.requestFacilitiesManagementMainSearchBtn_611().click();
		}

		@And("User_611 search the facility with CIF number in maintanance screen under Facilities Management")
		public void user_search_the_facility_with_cif_number_in_maintanance_screen_under_facilities_management() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestFacilitiesManagementMainSearchCIFInput_611());
			requestmenu.requestFacilitiesManagementMainSearchCIFInput_611().sendKeys(testData.get("CIF No"),Keys.ENTER);
		}

		@Then("User_611 retrieve the facility in maintanance screen under Facilities Management")
		public void user_retrieve_the_facility_in_maintanance_screen_under_facilities_management() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestFacilitiesManagementMainSearchRow1_611());
			clickandactionhelper.doubleClick(requestmenu.requestFacilitiesManagementMainSearchRow1_611());
		    
		    waithelper.waitForElementwithFluentwait(driver, requestmenu.requestFacilitiesManagementMainCode_611());
		    for (int i = 0; i <= 300; i++) {
				try {
					javascripthelper.scrollIntoView(requestmenu.requestFacilitiesManagementMainCode_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}
		@And("User_611 clicks the Draw Down Request under Request Financing")
		public void user_clicks_the_draw_down_request_under_request_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.RequestRequestforfinancingDrawdownrequest_611());
			requestmenu.RequestRequestforfinancingDrawdownrequest_611().click();
		   
		}

		@And("User_611 clicks the Maintenence in Draw Down Request under request for financing")
		public void user_clicks_the_maintenence_under_draw_down_request() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.RequestRequestforfinancingDrawdownrequestmaintenance_611());
			requestmenu.RequestRequestforfinancingDrawdownrequestmaintenance_611().click();
		   
		}

		@And("User_611 enter the facility reference value in drawdown request under request for financing")
		public void user_enter_the_facility_reference_value() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.RequestRequestforfinancingDrawdownrequestfacilityreference_611());
			requestmenu.RequestRequestforfinancingDrawdownrequestfacilityreference_611().sendKeys(testData.get("Request Code"),
					Keys.ENTER);
		}

		@And("user_611 enter the Drawdown type in drawdown request under request for financing")
		public void user_enter_the_drawdown_type() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.RequestRequestforfinancingDrawdownrequestdrawdowntype_611());
			requestmenu.RequestRequestforfinancingDrawdownrequestdrawdowntype_611().sendKeys(testData.get("Drawdowntype "),
					Keys.ENTER);
		    
		}
		
		@And("User_611 enter the Discription English in drawdown request under request for financing")
		public void user_enter_the_discription_english_in_drawdown_request_under_request_for_financing() throws Throwable{
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.RequestRequestforfinancingDrawdownrequestdiscriptionenglish_611());
			requestmenu.RequestRequestforfinancingDrawdownrequestdiscriptionenglish_611().sendKeys(testData.get("Request"));
		    
		}
		
		@And("User_611 enter the Discription arab in drawdown request under request for financing")
		public void user_enter_the_discription_arab() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.RequestRequestforfinancingDrawdownrequestdiscriptionarab_611());
			requestmenu.RequestRequestforfinancingDrawdownrequestdiscriptionarab_611().sendKeys(testData.get("Request"));
		}

		@And("User_611 enter the date in date submitted in drawdown request under request for financing")
		public void user_enter_the_date_in_date_submitted_in_drawdown_request_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.RequestRequestforfinancingDrawdownrequestdatesubmitted_611());
			requestmenu.RequestRequestforfinancingDrawdownrequestdatesubmitted_611().sendKeys(testData.get("15/01/2021"));
		}
		@And("User_611 enter the date in value date in drawdown request under request for financing")
		public void user_enter_the_date_in_value_date_in_drawdown_request_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.RequestRequestforfinancingDrawdownrequestvaluedate_611());
			requestmenu.RequestRequestforfinancingDrawdownrequestvaluedate_611().sendKeys(testData.get("15/01/2021"));
		}

		@And("User_611 clicks the Drawdown Additional Details Tab in drawdown request under request for financing")
		public void user_clicks_the_drawdown_additional_details_tab_in_drawdown_request_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.RequestRequestforfinancingDrawdownadditionaldetailstab_611());
			requestmenu.RequestRequestforfinancingDrawdownadditionaldetailstab_611().click();
		}

		@And("User_611 enter the product class L and N  in drawdown request Additional details tab under request for financing")
		public void user_enter_the_product_class_l_and_n_in_drawdown_request_additional_details_tab_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver,
					requestmenu.RequestRequestforfinancingDrawdownadditionaldetailstabPrductclassvalue_611());
			requestmenu.RequestRequestforfinancingDrawdownadditionaldetailstabPrductclassvalue_611().sendKeys(testData.get("Request Code"),
					Keys.ENTER);
		}

		
		

}
