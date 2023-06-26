package stepdefinitions;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationForFinancialFacilityObj;
import resources.BaseClass;

public class ApplicationForFacility extends BaseClass {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacilityObj applicationForFinancialFacilityObj = new ApplicationForFinancialFacilityObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ApplicationForFinancialFacility","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;
	CSMLogin csmLogin = new CSMLogin(driver);
	int randomNumber;
	@And("^User update test data set for 831806$")
    public void user_update_test_data_set_for_831806() throws Throwable {
		testExecutionData = testExecution.getTestdata("AFFF_01");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }

	@Given("^User Launch the CSM params Application$")
    public void user_launch_the_csm_params_application() throws Throwable {
		driver.get(configFileReader.getCSMParamApplicationUrl());
	//	csmLogin.loginIntoCSMParamApplication(configFileReader.getCSMApplicationUserType());
    }
	
	@Then("^User Validate the Code is Displayed in Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
    public void user_validate_the_code_is_displayed_in_approval_committee_recommendations_under_request_for_financing_sub_menu_in_request_for_financin() throws Throwable {
		String xpath ="//td[contains(text(),'"+requestId+"')]";
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

    @And("^User Click on REQUEST FOR FINANCIN under FMS application$")
    public void user_click_on_request_for_financin_under_fms_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.requestForFinancingMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.requestForFinancingMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.requestForFinancingMenu());
    }

    @And("^User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN$")
    public void user_click_the_request_for_financing_sub_menu_under_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.requestForFinancingSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.requestForFinancingSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.requestForFinancingSubMenu());
    }

    @And("^User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
    public void user_click_on_maintenance_under_request_for_financing_sub_menu_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.requestForFinancingMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.requestForFinancingMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.requestForFinancingMaintenanceScreen());
    }

    @And("^User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_select_new_request_in_reason_for_submission_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.reasonForSubmissionSelect());
		seleniumActions.getDropDownHelper()
				.SelectUsingVisibleText(applicationForFinancialFacilityObj.reasonForSubmissionSelect(), "New Request");
		 for (int i = 0; i <200; i++) {
	  			try {
	  				if (!applicationForFinancialFacilityObj.requestDateValidation().getAttribute("prevvalue").isBlank()&&!applicationForFinancialFacilityObj.requestDateValidation().getAttribute("prevvalue").isEmpty()) {
						break;	
					}
	  			} catch (Exception e) {
	  				
	  			}
	  			
	  		}
    }

    @And("^User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_search_the_cif_number_in_customer_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.customerCIF());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.customerCIF());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.customerCIF());
		applicationForFinancialFacilityObj.customerCIF().sendKeys("727");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		for (int i = 0; i <200; i++) {
  			try {
  				if (!applicationForFinancialFacilityObj.customerNameValidationInRequestForFinancingScreen().getAttribute("prevvalue").isBlank()&&!applicationForFinancialFacilityObj.customerNameValidationInRequestForFinancingScreen().getAttribute("prevvalue").isEmpty()) {
					break;	
				}
  			} catch (Exception e) {
  				
  			}	
  		}
		
    }

    @And("^User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_search_the_facility_type_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
		    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen().sendKeys("221");
				break;
			} catch (Exception e) {
				if (i==199) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		for (int i = 0; i <200; i++) {
  			try {
  				if (!applicationForFinancialFacilityObj.facilityNameValidationInRequestForFinancingScreen().getAttribute("prevvalue").isBlank()&&!applicationForFinancialFacilityObj.facilityNameValidationInRequestForFinancingScreen().getAttribute("prevvalue").isEmpty()) {
    				break;	
    			}
  			} catch (Exception e) {
  				
  			}	
  		}
    }

    @And("^User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_enter_the_value_in_total_limit_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	for (int i = 0; i <200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
    			seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
    			applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen().sendKeys("10000");
    			break;
    		} catch (Exception e) {
    			if (i==199) {
					Assert.fail(e.getMessage());
				}
    		}
		}
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		for (int i = 0; i <200; i++) {
  			try {
  				if (!applicationForFinancialFacilityObj.cvValueValidationInRequestForFinancingScreen().getAttribute("prevvalue").isBlank()&&!applicationForFinancialFacilityObj.cvValueValidationInRequestForFinancingScreen().getAttribute("prevvalue").isEmpty()) {
    				break;	
    			}
  			} catch (Exception e) {
  				
  			}	
  		}
		
    }

    @And("^User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_click_on_disbursement_or_sublimit_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	Thread.sleep(1000);
    	for (int i = 0; i <200; i++) {
			try {
				applicationForFinancialFacilityObj.disbursementOrSublimitInRequestForFinancingScreen().click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	
    }

    @And("^User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_click_on_add_button_in_disbursement_or_sublimit_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());
    	seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());
    	
    }

    @And("^User Search Product Class in Limit Details Pop up Menu$")
    public void user_search_product_class_in_limit_details_pop_up_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
		applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp().sendKeys("1");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.productClassRandomClick());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.productClassRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.productClassRandomClick());
		for (int i = 0; i <200; i++) {
  			try {
  				if (!applicationForFinancialFacilityObj.productClassNameValidationInRepaymentPlan().getAttribute("prevvalue").isBlank()
  						||!applicationForFinancialFacilityObj.productClassNameValidationInRepaymentPlan().getAttribute("prevvalue").isEmpty()) {
    				break;	
    			}
  			} catch (Exception e) {
  				
  			}	
  		}
    }


    @And("^User Enter the Margin value in New Tab Field in Limit Details Pop up Menu$")
    public void user_enter_the_margin_value_in_new_tab_field_in_limit_details_pop_up_menu() throws Throwable {
    	seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp().sendKeys("3");
		for (int i = 0; i <200; i++) {
  			try {
  				if (!applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp().getText().isBlank()
  						||!applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp().getText().isEmpty()) {
      				break;	
      			}
  			} catch (Exception e) {
  				
  			}	
  		}
    }

    @And("^User Click on Add button in Limit Details Pop up$")
    public void user_click_on_add_button_in_limit_details_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
    	seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
    }

    @And("^User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_click_on_save_button_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.savebuttonInRequestForFinancingScreenMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.savebuttonInRequestForFinancingScreenMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.savebuttonInRequestForFinancingScreenMaintenance());
    }

    @And("^User Click on Ok button in Confirm Pop up Menu$")
    public void user_click_on_ok_button_in_confirm_pop_up_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInConfirmationPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInConfirmationPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInConfirmationPopUp());
    }

    @And("^User Click on Ok button in Success Pop up Menu$")
    public void user_click_on_ok_button_in_success_pop_up_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInSucessPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
    }

    @And("^User Click on Validate button under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_click_on_validate_button_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen());
    }

    @And("^User Click on Yes button in Confirm Pop up Menu$")
    public void user_click_on_yes_button_in_confirm_pop_up_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.confirmDoYouWantToProceedYes());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.confirmDoYouWantToProceedYes());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.confirmDoYouWantToProceedYes());
    }

    @And("^User Get the Code in Success Pop up Menu$")
    public void user_get_the_code_in_success_pop_up_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
    	requestId = applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().getText().substring(10,14);
    	System.out.println(requestId);
    }

    @And("^User Click on Approve Level 1 under REQUEST FOR FINANCIN$")
    public void user_click_on_approve_level_1_under_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approvalLevel1InRequestForFinancingScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approvalLevel1InRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approvalLevel1InRequestForFinancingScreen());
    }

    @And("^User Search the Code in Approve Level 1 under REQUEST FOR FINANCIN$")
    public void user_search_the_code_in_approve_level_1_under_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1().sendKeys("3");
    }

    @And("^User Select the Searched Code in Approve Level 1 under REQUEST FOR FINANCIN$")
    public void user_select_the_searched_code_in_approve_level_1_under_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectApprovedFacilityRecordInApprovalLevel1());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.selectApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.selectApprovedFacilityRecordInApprovalLevel1());
    }

    @And("^User Click on Customer Grading and Recommendations in Approve Level 1 under REQUEST FOR FINANCIN$")
    public void user_click_on_customer_grading_and_recommendations_in_approve_level_1_under_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.customerGradingRecommendation());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.customerGradingRecommendation());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.customerGradingRecommendation());

    }

    @And("^User Select the Decision Field as Forward and Approval Committee in Customer Grading and Recommendations under Approve Level 1$")
    public void user_select_the_decision_field_as_forward_and_approval_committee_in_customer_grading_and_recommendations_under_approve_level_1() throws Throwable {
    	seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.selectDecisionInApprovalLevel1Reccommendation());
    	seleniumActions.getDropDownHelper().SelectUsingVisibleText(applicationForFinancialFacilityObj.customerGradingRecommendation(), "Forward");
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectDecisionInApprovalLevel1Reccommendation());
    	seleniumActions.getDropDownHelper().SelectUsingVisibleText(applicationForFinancialFacilityObj.selectDecisionInApprovalLevel1Reccommendation(), "Approval Committee");
    }

    @And("^User Select the Approval Committee as Inverstment Committee in Customer Grading and Recommendations under Approve Level 1$")
    public void user_select_the_approval_committee_as_inverstment_committee_in_customer_grading_and_recommendations_under_approve_level_1() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectApprovalCommitteInApprovalLevel1Reccommendation());
    	seleniumActions.getDropDownHelper().SelectUsingVisibleText(applicationForFinancialFacilityObj.selectApprovalCommitteInApprovalLevel1Reccommendation(), "Investment Committee");
    	
    }

    @And("^User Click on Approve button in Customer Grading and Recommendations under Approve Level 1$")
    public void user_click_on_approve_button_in_customer_grading_and_recommendations_under_approve_level_1() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveButtonInApprovalLevel1());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveButtonInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonInApprovalLevel1());
    }

    @And("^User Click on Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
    public void user_click_on_approval_committee_recommendations_under_request_for_financing_sub_menu_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approvalCommitteeRecommendations());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approvalCommitteeRecommendations());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approvalCommitteeRecommendations());
    }

    @And("^User Search the Code in Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
    public void user_search_the_code_in_approval_committee_recommendations_under_request_for_financing_sub_menu_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1().sendKeys("3");
    }
	
 //****************************************************Market Field TestCase***********************************************//
    @Then("^User Validate Additional Details Tab is Disable in Maintenance screen under Collateral Management$")
    public void user_validate_additional_details_tab_is_disable_in_maintenance_screen_under_collateral_management() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_ValidateAdditionalDetailsTabIsDisableInMaintenanceScreen());
		String attribute = applicationForFinancialFacilityObj.fms_ValidateAdditionalDetailsTabIsDisableInMaintenanceScreen().getAttribute("class");
		Assert.assertTrue(attribute.contains("disabled"));
    }

    @And("^User Click on Collateral Management under FMS application$")
    public void user_click_on_collateral_management_under_fms_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_CollateralManagementMainMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_CollateralManagementMainMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_CollateralManagementMainMenu());
    }

    @And("^User Click on Maintenance under Collateral Management$")
    public void user_click_on_maintenance_under_collateral_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_MaintenanceSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_MaintenanceSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_MaintenanceSubMenu());
    }

    @And("^User Search Collateral Type in Maintenance screen under Collateral Management$")
    public void user_search_collateral_type_in_maintenance_screen_under_collateral_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_SearchCollateralTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_SearchCollateralTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_SearchCollateralTypeInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_SearchCollateralTypeInMaintenanceScreen().sendKeys("0026");
    }

    @And("^User Enter Valid From Date in Maintenance screen under Collateral Management$")
    public void user_enter_valid_from_date_in_maintenance_screen_under_collateral_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen().sendKeys("01/05/2021");
		for (int i = 0; i <50; i++) {
			applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen().getAttribute("prevvalue");
		}
		
		
    }

    @And("^User Enter Valid To Date in Maintenance screen under Collateral Management$")
    public void user_enter_valid_to_date_in_maintenance_screen_under_collateral_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen().sendKeys("31/05/2023");
		applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen().sendKeys(Keys.ENTER);
		for (int i = 0; i <15; i++) {
			applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen().getAttribute("prevvalue");
		}
    }

    @And("^User Enter value for Brief Description in Maintenance screen under Collateral Management$")
    public void user_enter_value_for_brief_description_in_maintenance_screen_under_collateral_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fmsEnterValueForBriefDescriptionInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fmsEnterValueForBriefDescriptionInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fmsEnterValueForBriefDescriptionInMaintenanceScreen());
		applicationForFinancialFacilityObj.fmsEnterValueForBriefDescriptionInMaintenanceScreen().sendKeys("hgfyhjbjhgb");
    }

    @And("^User Enter value for Long Description in Maintenance screen under Collateral Management$")
    public void user_enter_value_for_long_description_in_maintenance_screen_under_collateral_management() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_EnterValueForLongDescriptionInMaintenanceScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_EnterValueForLongDescriptionInMaintenanceScreen());
				applicationForFinancialFacilityObj.fms_EnterValueForLongDescriptionInMaintenanceScreen().sendKeys("hgfyhjbjhgb");
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }

    @And("^User Search CIF No in Maintenance screen under Collateral Management$")
    public void user_search_cif_no_in_maintenance_screen_under_collateral_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen().sendKeys("727");
    }

    @And("^User Click Ok button in Confirm pop up menu$")
    public void user_click_ok_button_in_confirm_pop_up_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_ClickOkButtonInConfirmPopUpMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_ClickOkButtonInConfirmPopUpMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_ClickOkButtonInConfirmPopUpMenu());
    }

    @And("^User Search Collateral Currency in Maintenance screen under Collateral Management$")
    public void user_search_collateral_currency_in_maintenance_screen_under_collateral_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen().sendKeys("999");
    }
    //***********************************************MIN  MAX VALUE**********************************************************//
    @And("^User Click on WIFAK Application Main Menu$")
    public void user_click_on_wifak_application_main_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fmsWifakApplicationMainMenu());
    	seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.fmsWifakApplicationMainMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fmsWifakApplicationMainMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fmsWifakApplicationMainMenu());
    }

    @And("^User Click on WIFAK Application Sub Menu$")
    public void user_click_on_wifak_application_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fmsWifakApplicationInWifakApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fmsWifakApplicationInWifakApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fmsWifakApplicationInWifakApplication());
    }

    @And("^User Click Application for financial facilities$")
    public void user_click_application_for_financial_facilities() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
    }

    @And("^User Click Maintenance screen in WIFAK Application sub menu$")
    public void user_click_maintenance_screen_in_wifak_application_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.fmsMaintenanceInApplicationForFinancialFacilities());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fmsMaintenanceInApplicationForFinancialFacilities());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fmsMaintenanceInApplicationForFinancialFacilities());
    }

    @And("^User Select Application For field in Maintenace Screen under WIRAK Application$")
    public void user_select_application_for_field_in_maintenace_screen_under_wirak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainApplicationForDropdown());
				seleniumActions.getDropDownHelper()
				.SelectUsingVisibleText(applicationForFinancialFacilityObj.mainApplicationForDropdown(),testData.get("ApplicationFor"));
		
    }

    @And("^User enter the CIF No in main info tab under WIRAK Application$")
    public void user_enter_the_cif_no_in_main_info_tab_under_wirak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainCIFNo());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainCIFNo());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainCIFNo());
		applicationForFinancialFacilityObj.mainCIFNo().sendKeys(testData.get("CIF NO"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.cifTouch());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.cifTouch());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.cifTouch());
    }

    @And("^User enter the facility type in main info tab under WIRAK Application$")
    public void user_enter_the_facility_type_in_main_info_tab_under_wirak_application() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainFacilityType());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainFacilityType());
				applicationForFinancialFacilityObj.mainFacilityType().sendKeys(testData.get("Facility Type"));
				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilityTouch());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilityTouch());
				break;
			} catch (Exception e) {
				if (i==199) {
				Assert.fail(e.getMessage());	
				}
			}
		}
		
		
    }

    @And("^User enter the country of financing in main info tab under WIRAK Application$")
    public void user_enter_the_country_of_financing_in_main_info_tab_under_wirak_application() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainCountryOfFinancing());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainCountryOfFinancing());
				applicationForFinancialFacilityObj.mainCountryOfFinancing().sendKeys(testData.get("Country of Financing"));
				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilityTouch());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilityTouch());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    

    @And("^User clicks on the additional details tab under WIRAK Application$")
    public void user_clicks_on_the_additional_details_tab_under_wirak_application() throws Throwable {
    	Thread.sleep(1000);
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.mainAdditionalTab());
    	applicationForFinancialFacilityObj.mainAdditionalTab().click();
    }

   
    @And("^User Validate Min value configured in fms param facility type$")
    public void user_validate_min_value_configured_in_fms_param_facility_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Min Value"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.minValueValidation());
		Assert.assertTrue(applicationForFinancialFacilityObj.minValueValidation().isDisplayed());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
    }

    @And("^User Validate Max value configured in fms param facility type$")
    public void user_validate_max_value_configured_in_fms_param_facility_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().clear();
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Max Value"));
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.maxValueValidation());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.maxValueValidation());
		Assert.assertTrue(applicationForFinancialFacilityObj.maxValueValidation().isDisplayed());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
    }
    //*********************************************down payment field validate***********************************************//
    @Then("^User Enter downpayment percentage and validate downpayment value automatically adjusted$")
    public void user_enter_downpayment_percentage_and_validate_downpayment_value_automatically_adjusted() throws Throwable {
    	String totalValue ="1000";
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentPercentage());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentPercentage());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentPercentage());
		applicationForFinancialFacilityObj.downPaymentPercentage().sendKeys("10");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentValue());
		String downpaymentValue = "";
		for (int i = 0; i <200; i++) {
			downpaymentValue = applicationForFinancialFacilityObj.downPaymentValue().getAttribute("prevvalue");
			if (!downpaymentValue.equalsIgnoreCase("0")&&!downpaymentValue.isBlank()&&!downpaymentValue.isEmpty()) {
				break;
			}
		}
		System.out.println(downpaymentValue);
		String[] split = downpaymentValue.split("[.]");
		String finaldownpaymentValue = split[0];
		if (finaldownpaymentValue.contains(",")) {
			 finaldownpaymentValue = finaldownpaymentValue.replace(",","");
		}
		System.out.println(Integer.toString((10/Integer.parseInt(totalValue))*100*Integer.parseInt(totalValue)));
		Assert.assertEquals(finaldownpaymentValue, Integer.toString((10/Integer.parseInt(totalValue))*100*Integer.parseInt(totalValue)));
		
		
    }

    @Then("^User Enter downpayment value and validate downpayment percentage automatically adjusted$")
    public void user_enter_downpayment_value_and_validate_downpayment_percentage_automatically_adjusted() throws Throwable {
    	String totalValue ="1000";
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentValue());
		applicationForFinancialFacilityObj.downPaymentValue().sendKeys("100");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentPercentage());
		String downpaymentPercentage = applicationForFinancialFacilityObj.downPaymentPercentage().getAttribute("prevvalue");
		System.out.println(downpaymentPercentage);
		String[] split = downpaymentPercentage.split(".");
		String finaldownpaymentpercentage = split[0];
		System.out.println(finaldownpaymentpercentage);
		System.out.println(Integer.toString(Integer.parseInt(totalValue)/100));
		Assert.assertEquals(finaldownpaymentpercentage, Integer.toString(Integer.parseInt(totalValue)/100));
    }

    @Then("^User Enter downpayment value greater than total value system should throw validation$")
    public void user_enter_downpayment_value_greater_than_total_value_system_should_throw_validation() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentValue());
		for (int i = 0; i <200; i++) {
			try {
				applicationForFinancialFacilityObj.downPaymentValue().sendKeys("1000000");
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentValue());
		for (int i = 0; i <200; i++) {
			try {
				applicationForFinancialFacilityObj.downPaymentValue().sendKeys("1000000");
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentGreaterThanTotalAmountValidation());
		Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentGreaterThanTotalAmountValidation().isDisplayed());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentPopUpOk());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentPopUpOk());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentPopUpOk());
    }

    @Then("^User Enter downpayment to vendor percentage and validate downpayment to vendor value automatically adjusted$")
    public void user_enter_downpayment_to_vendor_percentage_and_validate_downpayment_to_vendor_value_automatically_adjusted() throws Throwable {
    	String totalValue ="1000";
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		applicationForFinancialFacilityObj.downPaymentToVendorPercentage().sendKeys("10");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorValue());
		String downPaymentToVendorValue = applicationForFinancialFacilityObj.downPaymentToVendorValue().getAttribute("prevvalue");
		System.out.println(downPaymentToVendorValue);
		String[] split = downPaymentToVendorValue.split(".");
		String finaldownPaymentToVendorValue = split[0].replace(",", "");
		System.out.println(finaldownPaymentToVendorValue);
		System.out.println(Integer.toString((10/Integer.parseInt(totalValue))*100*Integer.parseInt(totalValue)));
		Assert.assertEquals(finaldownPaymentToVendorValue, Integer.toString((10/Integer.parseInt(totalValue))*100*Integer.parseInt(totalValue)));
    }

    @Then("^User Enter downpayment to vendor value and validate downpayment to vendor percentage automatically adjusted$")
    public void user_enter_downpayment_to_vendor_value_and_validate_downpayment_to_vendor_percentage_automatically_adjusted() throws Throwable {
    	String totalValue ="1000";
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorValue());
		applicationForFinancialFacilityObj.downPaymentValue().sendKeys("100");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		String downpaymentToVendorPercentage = applicationForFinancialFacilityObj.downPaymentToVendorPercentage().getAttribute("prevvalue");
		System.out.println(downpaymentToVendorPercentage);
		String[] split = downpaymentToVendorPercentage.split(".");
		String finaldownpaymentToVendorPercentage = split[0];
		System.out.println(finaldownpaymentToVendorPercentage);
		System.out.println(Integer.toString(Integer.parseInt(totalValue)/100));
		Assert.assertEquals(finaldownpaymentToVendorPercentage, Integer.toString(Integer.parseInt(totalValue)/100));
    }

    @Then("^User Validate total downpayment percentage and total downpayment value$")
    public void user_validate_total_downpayment_percentage_and_total_downpayment_value() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentPercentage());
    	String downpaymentPercentage = applicationForFinancialFacilityObj.downPaymentPercentage().getAttribute("prevvalue");
		System.out.println(downpaymentPercentage);
		String[] split = downpaymentPercentage.split(".");
		String finaldownpaymentpercentage = split[0];
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		String downpaymentToVendorPercentage = applicationForFinancialFacilityObj.downPaymentToVendorPercentage().getAttribute("prevvalue");
		System.out.println(downpaymentToVendorPercentage);
		String[] split1 = downpaymentToVendorPercentage.split(".");
		String finaldownpaymentToVendorPercentage = split1[0];
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.totalDownPaymentPercentage());
		Assert.assertEquals(applicationForFinancialFacilityObj.totalDownPaymentPercentage().getAttribute("prevalue"), finaldownpaymentToVendorPercentage+finaldownpaymentpercentage);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentPercentage());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentPercentage());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentPercentage());
		applicationForFinancialFacilityObj.downPaymentPercentage().sendKeys("10");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentValue());
		String downpaymentValue = applicationForFinancialFacilityObj.downPaymentValue().getAttribute("prevvalue");
		System.out.println(downpaymentValue);
		String[] split2 = downpaymentValue.split(".");
		String finaldownpaymentValue = split2[0].replace(",", "");
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		applicationForFinancialFacilityObj.downPaymentToVendorPercentage().sendKeys("10");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorValue());
		String downPaymentToVendorValue = applicationForFinancialFacilityObj.downPaymentToVendorValue().getAttribute("prevvalue");
		System.out.println(downPaymentToVendorValue);
		String[] split3 = downPaymentToVendorValue.split(".");
		String finaldownPaymentToVendorValue = split3[0].replace(",", "");
		System.out.println(finaldownPaymentToVendorValue);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.totalDownPaymentValue());
		Assert.assertEquals(applicationForFinancialFacilityObj.totalDownPaymentPercentage().getAttribute("prevalue"), finaldownpaymentValue+finaldownPaymentToVendorValue);
    }

    @And("^User Enter total value under additional details tab in WIFAK Application$")
    public void user_enter_total_value_under_additional_details_tab_in_wifak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys("10000");
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys(Keys.ENTER);
    	
    }
    //*************************************************Economic and Sub economic sector *****************************//
    @And("^User Click CSM parameter Main Menu$")
    public void user_click_csm_parameter_main_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.parameterMainMenu_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.parameterMainMenu_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.parameterMainMenu_CSM());
    }
    @And("^User Click CIF paramter Sub Menu$")
    public void user_click_cif_paramter_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.CIFparameterSubMenu_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.CIFparameterSubMenu_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.CIFparameterSubMenu_CSM());
    }
    @And("^User Click Economic Sector SubMenu$")
    public void user_click_economic_sector_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.economicSectorMenu_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.economicSectorMenu_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.economicSectorMenu_CSM());
    }

    @And("^User Click Maintenace Screen in Economic Sector$")
    public void user_click_maintenace_screen_in_economic_sector() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.maintenanceEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.maintenanceEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.maintenanceEconomicSector_CSM());
    }

    @And("^User Click Maintenace Screen in Sub Economic Sector$")
    public void user_click_maintenace_screen_in_sub_economic_sector() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.maintenanceSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.maintenanceSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.maintenanceSubEconomicSector_CSM());
    }

    @And("^User Enter sector code in Economic Sector Maintenace Screen$")
    public void user_enter_sector_code_in_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.sectorCodeEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.sectorCodeEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.sectorCodeEconomicSector_CSM());
		Random random = new Random();
		randomNumber = random.nextInt(500 - 50) + 500;
		applicationForFinancialFacilityObj.sectorCodeEconomicSector_CSM().sendKeys(String.valueOf(randomNumber));
    }

    @And("^User Enter brief name in Economic Sector Maintenace Screen$")
    public void user_enter_brief_name_in_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.briefNameEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.briefNameEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.briefNameEconomicSector_CSM());
		applicationForFinancialFacilityObj.briefNameEconomicSector_CSM().sendKeys("Test");
    }

    @And("^User Enter brief name Arab in Economic Sector Maintenace Screen$")
    public void user_enter_brief_name_arab_in_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.briefNameArabEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.briefNameArabEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.briefNameArabEconomicSector_CSM());
		applicationForFinancialFacilityObj.briefNameArabEconomicSector_CSM().sendKeys("Test");
    }

    @And("^User Click Save button in Economic Sector Maintenace Screen$")
    public void user_click_save_button_in_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.saveButtonEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.saveButtonEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.saveButtonEconomicSector_CSM());
    }

    @And("^User click Approve Screen In Economic Sector$")
    public void user_click_approve_screen_in_economic_sector() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveScreenEconomicSector_CSM());
    }

    @And("^User click aprove button in Economic Sector Maintenace Screen$")
    public void user_click_aprove_button_in_economic_sector_maintenace_screen() throws Throwable {
    	  //seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveButtonEconomicSector_CSM());
		  for (int i = 0; i <200; i++) {
			try {
				  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveButtonEconomicSector_CSM());
				  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonEconomicSector_CSM());
				  break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	  
    		
    }

    @And("^User click Approve Screen In Sub Economic Sector$")
    public void user_click_approve_screen_in_sub_economic_sector() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveButtonSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveButtonSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonSubEconomicSector_CSM());
    }

    @And("^User click aprove button in Sub Economic Sector Maintenace Screen$")
    public void user_click_aprove_button_in_sub_economic_sector_maintenace_screen() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getJavascriptHelper().JSEClick(applicationForFinancialFacilityObj.approveButtonSubEconomicSector_CSM());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }


    @And("^User Click Sub Economic Sector SubMenu$")
    public void user_click_sub_economic_sector_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.subEconomicSectorMenu_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.subEconomicSectorMenu_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.subEconomicSectorMenu_CSM());
    }

    @And("^User Enter brief name in Sub Economic Sector Maintenace Screen$")
    public void user_enter_brief_name_in_sub_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.briefNameSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.briefNameSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.briefNameSubEconomicSector_CSM());
		applicationForFinancialFacilityObj.briefNameSubEconomicSector_CSM().sendKeys("adad");
    }

    @And("^User Enter brief name Arab in Sub Economic Sector Maintenace Screen$")
    public void user_enter_brief_name_arab_in_sub_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.briefNameArabSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.briefNameArabSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.briefNameArabSubEconomicSector_CSM());
		applicationForFinancialFacilityObj.briefNameArabSubEconomicSector_CSM().sendKeys("adad");
    }

    @And("^User Click Save button in Sub Economic Sector Maintenace Screen$")
    public void user_click_save_button_in_sub_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.saveButtonInSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.saveButtonInSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.saveButtonInSubEconomicSector_CSM());
    }
    @And("^User Search sector code in Economic Sector Approve Screen$")
    public void user_search_sector_code_in_economic_sector_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM());
		applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM().sendKeys(String.valueOf(randomNumber));
		applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM().sendKeys(Keys.ENTER);
		String xpath ="//td[text()='"+String.valueOf(randomNumber)+"']";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    @And("^User Search sector code in Sub Economic Sector Approve Screen$")
    public void user_search_sector_code_in_sub_economic_sector_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM());
		applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM().sendKeys(String.valueOf(randomNumber));
		applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM().sendKeys(Keys.ENTER);
		String xpath ="//td[text()='"+String.valueOf(randomNumber)+"']";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }
    @And("^User Select the searched record in Economic Sector Approve Screen$")
    public void user_select_the_searched_record_in_economic_sector_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectSearchedCodeApproveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeApproveScreenEconomicSector_CSM());
    }
    @And("^User Select sector key in Sub economic Sector$")
    public void user_select_sector_key_in_sub_economic_sector() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getDropDownHelper().SelectUsingVisibleText(applicationForFinancialFacilityObj.selectSectorKeySubEconomicSector_CSM(), String.valueOf(randomNumber)+" Test");
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

    	
    }

    @And("^User Enter sub sector code in Sub Economic Sector Maintenace Screen$")
    public void user_enter_sub_sector_code_in_sub_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM());
		applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM().sendKeys(String.valueOf(randomNumber));
		applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM().sendKeys(Keys.ENTER);
		for (int i = 0; i < 50; i++) {
			try {
				applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM().getAttribute("prevvalue");
				break;
			} catch (Exception e) {
				if (i==49) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
    }
    @And("^User Select the searched record in Sub Economic Approve Screen$")
    public void user_select_the_searched_record_in_sub_economic_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectSearchedCodeApproveScreenSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeApproveScreenSubEconomicSector_CSM());
    }
    @And("^User Click ok button in confirm pop up Economic Sector Maintenace Screen$")
    public void user_click_ok_button_in_confirm_pop_up_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
    }

    @And("^User Click ok button in Sucess pop up Economic Sector Maintenace Screen$")
    public void user_click_ok_button_in_sucess_pop_up_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
		Thread.sleep(4000);
    }
    @And("^User Click ok button in confirm pop up Sub Economic Sector Maintenace Screen$")
    public void user_click_ok_button_in_confirm_pop_up_sub_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
    }

    @And("^User Click ok button in Sucess pop up Sub Economic Sector Maintenace Screen$")
    public void user_click_ok_button_in_sucess_pop_up_sub_economic_sector_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
    }
    @Given("^Test Ended$")
    public void test_ended() throws Throwable {
        System.out.println("Excel Test runner executed");
    }
    @And("^User Search and Validate created Economic sector code refletced in Application screen$")
    public void user_search_and_validate_created_economic_sector_code_refletced_in_application_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen().sendKeys(String.valueOf(randomNumber));
    }

    @And("^User Search and Validate created Sub Economic sector code refletced in Application screen$")
    public void user_search_and_validate_created_sub_economic_sector_code_refletced_in_application_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen());
		applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen().sendKeys(String.valueOf(randomNumber));
    }
    @And("^User get the system date$")
    public void user_get_the_system_date() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.systemDate());
    	date = applicationForFinancialFacilityObj.systemDate().getText();
    }
    //**************************************************************repayment plan********************************//
    @And("^User click search icon in Maintenance screen Request for financing$")
    public void user_click_search_icon_in_maintenance_screen_request_for_financing() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchIconInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchIconInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchIconInMaintenanceRequestForFinancing());
    }

    @And("^User Search code in Maintenance screen Request for financing$")
    public void user_search_code_in_maintenance_screen_request_for_financing() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
		applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing().sendKeys(requestId);
		String xpath ="//td[contains(text(),'"+requestId+"')]";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }
    @And("^User Click and search final approval record in maintenance screen$")
    public void user_click_and_search_final_approval_record_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys("Final");
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys(Keys.ENTER);
    }

    @And("^User Select searched record in Maintenance screen Request for financing$")
    public void user_select_searched_record_in_maintenance_screen_request_for_financing() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());

    }
    @And("^User select sublimit details in Maintenance screen Request for financing$")
    public void user_select_sublimit_details_in_maintenance_screen_request_for_financing() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.productClassInDisbursementSublimit());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.productClassInDisbursementSublimit());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.productClassInDisbursementSublimit());
    }

    @And("^User click repayment plan in Maintenance screen Request for financing$")
    public void user_click_repayment_plan_in_maintenance_screen_request_for_financing() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.repaymentPlanOption());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.repaymentPlanOption());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.repaymentPlanOption());
    }

    @And("^User enter no of payments in repayment plan$")
    public void user_enter_no_of_payments_in_repayment_plan() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().clear();
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInSucessPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().sendKeys("10");
		
			for (int i = 0; i <50; i++) {
				try {
					if (!applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().getAttribute("prevvalue").isBlank()&&!applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().getAttribute("prevvalue").isEmpty()) {
						break;	
					}
				} catch (Exception e) {
					
				}
				
			}

    }

    @And("^User enter pay every in repayment plan$")
    public void user_enter_pay_every_in_repayment_plan() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.payEveryInrepaymentPlan());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.payEveryInrepaymentPlan());
				applicationForFinancialFacilityObj.payEveryInrepaymentPlan().clear();
				break;
			} catch (Exception e) {
				
			}
			
		}
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInSucessPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		applicationForFinancialFacilityObj.payEveryInrepaymentPlan().sendKeys("3");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		for (int i = 0; i <200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.payEveryInrepaymentPlan().getAttribute("prevvalue").isBlank()&&!applicationForFinancialFacilityObj.payEveryInrepaymentPlan().getAttribute("prevvalue").isEmpty()) {
					break;	
				}
			} catch (Exception e) {
				
			}
			
		}
    }

    @And("^User Validate the Maturity Date in repayment plan$")
    public void user_validate_the_maturity_date_in_repayment_plan() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.maturityDateInrepaymentPlan());
    	String maturityDate = null;
    	for (int i = 0; i <20; i++) {
    		maturityDate = applicationForFinancialFacilityObj.maturityDateInrepaymentPlan().getAttribute("prevvalue").substring(0, 10);
		}
    	
    	System.out.println(maturityDate);
		String[] split = date.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		String substring = split[1].substring(0, 3);
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("MMM").withLocale(Locale.US);
		TemporalAccessor temporalAccessor = dtFormatter.parse(substring);
		//System.out.println(temporalAccessor.get(ChronoField.MONTH_OF_YEAR));
		LocalDate date = LocalDate.of(Integer.parseInt(split[2]), temporalAccessor.get(ChronoField.MONTH_OF_YEAR),
				Integer.parseInt(split[0]));
		LocalDate plusMonths = date.plusMonths(28);
		System.out.println(plusMonths);
		Assert.assertEquals(plusMonths.toString(), maturityDate);
	
    }
  //***************************request for financing (Purpose of financing)***************************************//
  	@And("^User Click FMS parameter Main Menu$")
      public void user_click_fms_parameter_main_menu() throws Throwable {
  		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.parameterMainMenu_FMS());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.parameterMainMenu_FMS());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.parameterMainMenu_FMS());
      }

      @And("^User click purpose of Financing Main Menu$")
      public void user_click_purpose_of_financing_main_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.purposeOfFinancingSubMenu());
  		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.purposeOfFinancingSubMenu());
  		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.purposeOfFinancingSubMenu());
      }

      @And("^User Click the Maintenance Screen In purpose of Financing$")
      public void user_click_the_maintenance_screen_in_purpose_of_financing() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.maintenanceInPurposeOfFinancingSubMenu());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.maintenanceInPurposeOfFinancingSubMenu());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.maintenanceInPurposeOfFinancingSubMenu());
      }

      @And("^User enter the code in Maintenance Screen under purpose of Financing sub menu$")
      public void user_enter_the_code_in_maintenance_screen_under_purpose_of_financing_sub_menu() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.codeInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.codeInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.codeInMaintenancePurposeOfFinancing());
    	  Random random = new Random();
  		  randomNumber = random.nextInt(5000 - 1) + 5000;
  		  System.out.println(randomNumber);
    	  applicationForFinancialFacilityObj.codeInMaintenancePurposeOfFinancing().sendKeys(String.valueOf(randomNumber));
      }

      @And("^User enter additional number in Maintenance Screen under purpose of Financing sub menu$")
      public void user_enter_additional_number_in_maintenance_screen_under_purpose_of_financing_sub_menu() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
    	  Random random = new Random();
  		  int randomNumber = random.nextInt(5000 - 1) + 5000;
    	  applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing().sendKeys(String.valueOf(randomNumber));
      }

      @And("^User enter description in Maintenance Screen under purpose of Financing sub menu$")
      public void user_enter_description_in_maintenance_screen_under_purpose_of_financing_sub_menu() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.descriptionInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.descriptionInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.descriptionInMaintenancePurposeOfFinancing());
    	  applicationForFinancialFacilityObj.descriptionInMaintenancePurposeOfFinancing().sendKeys("Test"+randomNumber);
      }

      @And("^User click product class option in Maintenance Screen under purpose of Financing sub menu$")
      public void user_click_product_class_option_in_maintenance_screen_under_purpose_of_financing_sub_menu() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.productClassInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.productClassInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.productClassInMaintenancePurposeOfFinancing());
      }

      @And("^User click add icon in product class option$")
      public void user_click_add_icon_in_product_class_option() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.addProductClassInProductClassOptions());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.addProductClassInProductClassOptions());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.addProductClassInProductClassOptions());
      }

      @And("^User User add product class code in product class option$")
      public void user_user_add_product_class_code_in_product_class_option() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.clickToEnterProductCodeInProductOptions());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.clickToEnterProductCodeInProductOptions());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.clickToEnterProductCodeInProductOptions());
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchProductCodeInProductOptions());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchProductCodeInProductOptions());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchProductCodeInProductOptions());
    	  applicationForFinancialFacilityObj.searchProductCodeInProductOptions().sendKeys("1");
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
    	  
    	  for (int i = 0; i <200; i++) {
  			try {
  				if (!applicationForFinancialFacilityObj.productClassNameValidationInPurposeOfFinancing().getText().isBlank()&&!applicationForFinancialFacilityObj.productClassNameValidationInPurposeOfFinancing().getText().isEmpty()) {
      				break;	
      			}
  			} catch (Exception e) {
  				
  			}
  			
  		}
      }

      @And("^User click save button in Maintenance Screen under purpose of Financing sub menu$")
      public void user_click_save_button_in_maintenance_screen_under_purpose_of_financing_sub_menu() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.saveButtonInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.saveButtonInMaintenancePurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.saveButtonInMaintenancePurposeOfFinancing());
      }

      @And("^User click ok button in Waring popup$")
      public void user_click_ok_button_in_waring_popup() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInWarningPopUp());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInWarningPopUp());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInWarningPopUp());
      }

      

      @And("^User search code in approve screen purpose of Financing$")
      public void user_search_code_in_approve_screen_purpose_of_financing() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing());
    	  applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing().sendKeys(String.valueOf(randomNumber));
    	  applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing().sendKeys(Keys.ENTER);
      }

      @And("^User Select searched record in approve screen purpose of Financing$")
      public void user_select_searched_record_in_approve_screen_purpose_of_financing() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectSearchedCodeInApproveScreenPurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.selectSearchedCodeInApproveScreenPurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeInApproveScreenPurposeOfFinancing());
      }

      @And("^User click approve button in selected record purpose of Financing$")
      public void user_click_approve_button_in_selected_record_purpose_of_financing() throws Throwable {
    	  for (int i = 0; i <200; i++) {
  			try {
  			  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveButtonInApproveScreenPurposeOfFinancing());
  	    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonInApproveScreenPurposeOfFinancing());
  	    	  break;
  			} catch (Exception e) {
  				if (i==199) {
  					Assert.fail(e.getMessage());
  				}
  			}
  		}
  
      }
      @And("^User Validate the created purpose of financing record reflected in application$")
      public void user_validate_the_created_purpose_of_financing_record_reflected_in_application() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreen());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreen());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreen());
    	  applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreen().sendKeys("8692");
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreenRandomClick());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreenRandomClick());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreenRandomClick());
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation());
   for (int i = 0; i <200; i++) {
	   if (!applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation().getAttribute("prevvalue").isBlank()&&
 			  !applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation().getAttribute("prevvalue").isEmpty()) {
			break;
		}
   		}
    	  
    	  Assert.assertTrue(!applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation().getAttribute("prevvalue").isBlank()&&
    			  !applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation().getAttribute("prevvalue").isEmpty());
      }
      @And("^User click ok button in Information Pop up$")
      public void user_click_ok_button_in_information_pop_up() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInInformationPopUp());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInInformationPopUp());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInInformationPopUp());
      }
      @And("^User click approve Screen in purpose of Financing sub menu$")
      public void user_click_approve_screen_in_purpose_of_financing_sub_menu() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveSubMenuInPurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveSubMenuInPurposeOfFinancing());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveSubMenuInPurposeOfFinancing());
      }
      
      //************************************************ Decimal Value******************************************************
      @And("^Open Disburment or Sublimit record$")
      public void open_disburment_or_sublimit_record() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.openDisbursemnetSublimitProductClassRecord());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.openDisbursemnetSublimitProductClassRecord());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.openDisbursemnetSublimitProductClassRecord());
    	  seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.openDisbursemnetSublimitProductClassRecord());
      }

      @And("^User Validate Down payment percentage In Limit details contains decimal value$")
      public void user_validate_down_payment_percentage_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentPercentageInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentPercentageInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Down payment Amount In Limit details contains decimal value$")
      public void user_validate_down_payment_amount_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentAmountInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentAmountInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Total facility Value In Limit details contains decimal value$")
      public void user_validate_total_facility_value_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalFacilityValueInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.totalFacilityValueInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Down payment to Vendor percentage In Limit details contains decimal value$")
      public void user_validate_down_payment_to_vendor_percentage_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorPercentageInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentToVendorPercentageInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Down payment to Vendor In Limit details contains decimal value$")
      public void user_validate_down_payment_to_vendor_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.downPaymentToVendorAmountInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentToVendorAmountInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Total Down payment percentage In Limit details contains decimal value$")
      public void user_validate_total_down_payment_percentage_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalDownPaymentPercentageInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.totalDownPaymentPercentageInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }
      @And("^User Validate Total Down payment Value In Limit details contains decimal value$")
      public void user_validate_total_down_payment_value_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalDownPaymentAmountInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.totalDownPaymentAmountInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate floor rate percentage key In Limit details contains decimal value$")
      public void user_validate_floor_rate_percentage_key_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.floorRatePercentageKeyInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.floorRatePercentageKeyInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.floorRatePercentageKeyInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate sub limit lower limit percentage key In Limit details contains decimal value$")
      public void user_validate_sub_limit_lower_limit_percentage_key_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate sub limit lower limit amount key In Limit details contains decimal value$")
      public void user_validate_sub_limit_lower_limit_amount_key_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Amounts Utilized In Limit details contains decimal value$")
      public void user_validate_amounts_utilized_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.amountsUtilizedInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.amountsUtilizedInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.amountsUtilizedInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Amounts Current Outstanding In Limit details contains decimal value$")
      public void user_validate_amounts_current_outstanding_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.currenOutstandingInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.currenOutstandingInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.currenOutstandingInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Amounts Un Utilized In Limit details contains decimal value$")
      public void user_validate_amounts_un_utilized_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.unUtilizedInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.unUtilizedInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.unUtilizedInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Amounts In Limit details contains decimal value$")
      public void user_validate_amounts_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.amountsInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.amountsInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.amountsInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate New Global Limit In Limit details contains decimal value$")
      public void user_validate_new_global_limit_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.newGlobalLimitInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.newGlobalLimitInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.newGlobalLimitInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Total Global Limit In Limit details contains decimal value$")
      public void user_validate_total_global_limit_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalGlobalLimitInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.totalGlobalLimitInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.totalGlobalLimitInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Margin New Value In Limit details contains decimal value$")
      public void user_validate_margin_new_value_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.marginNewInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.marginNewInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.marginNewInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Margin Approved In Limit details contains decimal value$")
      public void user_validate_margin_approved_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.marginApprovedInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.marginApprovedInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.marginApprovedInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Total Existing In Limit details contains decimal value$")
      public void user_validate_total_existing_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalExistingInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.totalExistingInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.totalExistingInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Total New In Limit details contains decimal value$")
      public void user_validate_total_new_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalNewInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.totalNewInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.totalNewInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate Total Approved In Limit details contains decimal value$")
      public void user_validate_total_approved_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalApprovedInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.totalApprovedInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.totalApprovedInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }

      @And("^User Validate CV Value In Limit details contains decimal value$")
      public void user_validate_cv_value_in_limit_details_contains_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.cvValueInLimitDetailsPopUpScreen());
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.cvValueInLimitDetailsPopUpScreen());
    	  Assert.assertTrue(applicationForFinancialFacilityObj.cvValueInLimitDetailsPopUpScreen().getAttribute("nbformat").contains(".0"));
      }
      @And("^User Click Grade Evaluation Factors Sub Menu$")
      public void user_click_grade_evaluation_factors_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.gradingEvaluationFactorsSubMenu());
    	seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.gradingEvaluationFactorsSubMenu());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.gradingEvaluationFactorsSubMenu());
  		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.gradingEvaluationFactorsSubMenu());
      }

      @And("^User Click Maintenance Screen In Grade Evaluation Factor$")
      public void user_click_maintenance_screen_in_grade_evaluation_factor() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.maintenamceScreenIngradingEvaluationFactors());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.maintenamceScreenIngradingEvaluationFactors());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.maintenamceScreenIngradingEvaluationFactors());
      }

      @And("^User Validate Weight field should accept decimal value$")
      public void user_validate_weight_field_should_accept_decimal_value() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen());
    	  applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen().sendKeys("123.23");
    	  for (int i = 0; i <200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen().getAttribute("prevvalue").isEmpty()
						&&!applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen().getAttribute("prevvalue").isBlank()) {
					break;
				}
				
			} catch (Exception e) {
				
			}
		}
    	  Assert.assertEquals(applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen().getAttribute("prevvalue"), "123.23");
      }
//****************************************************Total yield auto pop pulate*****************************//
      @And("^User click Limit Details tab in WIFAK Application$")
      public void user_click_limit_details_tab_in_wifak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.limitDetailsInWIFAKApplication());
  		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.limitDetailsInWIFAKApplication());
  		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.limitDetailsInWIFAKApplication());
      }

      @And("^User click add icon in limit details under WIFAK Application$")
      public void user_click_add_icon_in_limit_details_under_wifak_application() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.addButtonInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsWIFAKApplication());
      }

      @And("^User select the product class in limit details under WIFAK Application$")
      public void user_select_the_product_class_in_limit_details_under_wifak_application() throws Throwable {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
    	  applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication().sendKeys("2");
    	 // applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication().sendKeys(Keys.ENTER);
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.typeInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.typeInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.typeInLimitDetailsWIFAKApplication());
    	  for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication().getAttribute("prevvalue").isBlank() 
					&&!applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication().getAttribute("prevvalue").isEmpty()) {
					break;
				}
			} catch (Exception e) {
			
			}
		}
      }

      @And("^User Enter Yield details value in limit details under WIFAK Application$")
      public void user_enter_yield_details_value_in_limit_details_under_wifak_application() throws Throwable {
    	  seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication());
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication());
    	  seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication());
    	  applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication().sendKeys("30");
    	  applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication().sendKeys(Keys.ENTER);
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.marginRateInLimitDetailsWIFAKApplication());
    	  applicationForFinancialFacilityObj.marginRateInLimitDetailsWIFAKApplication().click();
      }

      @And("^User Validate Total Yield is Calculated based on Yield details and Margin Rate$")
      public void user_validate_total_yield_is_calculated_based_on_yield_details_and_margin_rate() throws Throwable {
    	  //Thread.sleep(1000);
    	  //seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication());
    	  for (int i = 0; i <500; i++) {
			try {
				if (!applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication().getAttribute("prevvalue").split("[.]")[0].equals("0")
						&&!applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication().getAttribute("prevvalue").isBlank()
						&&!applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication().getAttribute("prevvalue").isEmpty()) {
					break;
				}
				
			} catch (Exception e) {
				
			}
		}
    	  String totalYield = applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication().getAttribute("prevvalue");
    	  String split = totalYield.split("[.]")[0];
    	  System.out.println(split);
    	  System.out.println(totalYield.split("[.]")[1]);   	  
    	  String split1 = "";
    	  for (int i = 0; i <200; i++) {
			try {
				//document.querySelector("#applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT").value	
				split1 = (String) seleniumActions.getJavascriptHelper().executeScript("return document.querySelector"
						+ "(\"#applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT\").value");
				split1 = split1.split("[.]")[0];
				System.out.println(split1);
				break;
			} catch (Exception e) {
				
			}
		}
    	  
    	  int calculateTotalValue =30+Integer.parseInt(split1);
    	  Assert.assertEquals(Integer.parseInt(split), calculateTotalValue);
      }
}