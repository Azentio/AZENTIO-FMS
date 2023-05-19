package stepdefinitions;

import java.util.Map;

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
import pageobjects.fms.ApplicationForFinancialFacilityObj;
import resources.BaseClass;

public class ApplicationForFacility extends BaseClass {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacilityObj applicationForFinancialFacilityObj = new ApplicationForFinancialFacilityObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ChequebookRequest","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	CSMLogin csmLogin = new CSMLogin(driver);
	@Given("^User Launch the CSM params Application$")
    public void user_launch_the_csm_params_application() throws Throwable {
		driver.get(configFileReader.getCSMParamApplicationUrl());
		csmLogin.loginIntoCSMParamApplication(configFileReader.getCSMApplicationUserType());
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
    }

    @And("^User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_search_the_cif_number_in_customer_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.customerCIF());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.customerCIF());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.customerCIF());
		applicationForFinancialFacilityObj.customerCIF().sendKeys("727");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.randomClick());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.randomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.randomClick());
    }

    @And("^User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_search_the_facility_type_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen().sendKeys("221");
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.randomClick());
		    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.randomClick());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.randomClick());
				break;
			} catch (Exception e) {
				if (i==199) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
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
    			if (applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen().getAttribute("prevvalue").equalsIgnoreCase("10000")) {
    				break;	
				}
    		} catch (Exception e) {
    			if (i==199) {
					Assert.fail(e.getMessage());
				}
    		}
		}
    }

    @And("^User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_click_on_disbursement_or_sublimit_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	for (int i = 0; i <200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.disbursementOrSublimitInRequestForFinancingScreen());
    			seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.disbursementOrSublimitInRequestForFinancingScreen());
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
    	for (int i = 0; i <200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());
    			seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());
    			break;
    		} catch (Exception e) {
    			if (i==199) {
					Assert.fail(e.getMessage());
				}
    		}
		}
    	
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
		
    }


    @And("^User Enter the Margin value in New Tab Field in Limit Details Pop up Menu$")
    public void user_enter_the_margin_value_in_new_tab_field_in_limit_details_pop_up_menu() throws Throwable {
    	seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp().clear();
		applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp().sendKeys("3");
    }

    @And("^User Click on Add button in Limit Details Pop up$")
    public void user_click_on_add_button_in_limit_details_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
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
    	requestId = applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().getText().substring(10,13);
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
				.SelectUsingVisibleText(applicationForFinancialFacilityObj.mainApplicationForDropdown(),"New Facility");
		
    }

    @And("^User enter the CIF No in main info tab under WIRAK Application$")
    public void user_enter_the_cif_no_in_main_info_tab_under_wirak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainCIFNo());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainCIFNo());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainCIFNo());
		applicationForFinancialFacilityObj.mainCIFNo().sendKeys("727");
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
				applicationForFinancialFacilityObj.mainFacilityType().sendKeys("369");
				break;
			} catch (Exception e) {
				if (i==199) {
				Assert.fail(e.getMessage());	
				}
			}
		}
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.facilityTouch());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilityTouch());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilityTouch());
    }

    @And("^User enter the country of financing in main info tab under WIRAK Application$")
    public void user_enter_the_country_of_financing_in_main_info_tab_under_wirak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainCountryOfFinancing());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainCountryOfFinancing());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainCountryOfFinancing());
		applicationForFinancialFacilityObj.mainCountryOfFinancing().sendKeys("320");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.facilityTouch());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilityTouch());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilityTouch());
    }

    @And("^User enter the facility rating in main info tab under WIRAK Application$")
    public void user_enter_the_facility_rating_in_main_info_tab_under_wirak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainFacilityRating());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainFacilityRating());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainFacilityRating());
		applicationForFinancialFacilityObj.mainFacilityRating().sendKeys("369");
    }

    @And("^User clicks on the additional details tab under WIRAK Application$")
    public void user_clicks_on_the_additional_details_tab_under_wirak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.mainAdditionalTab());
    	seleniumActions.getJavascriptHelper().JSEClick(applicationForFinancialFacilityObj.mainAdditionalTab());
    }

    @And("^User enter the total value in additional info tab under WIRAK Application$")
    public void user_enter_the_total_value_in_additional_info_tab_under_wirak_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys("2");
    }
    @And("^User Validate Min value configured in fms param facility type$")
    public void user_validate_min_value_configured_in_fms_param_facility_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys("2");
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
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys("9999999999999999");
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
	
}
