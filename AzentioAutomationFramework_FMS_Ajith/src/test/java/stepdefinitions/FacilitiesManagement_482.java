package stepdefinitions;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.fms.ApplicationForFinancialFacility_482_Obj;
import pageobjects.fmsparams.ApplicationForFinancialFacilityParamObj;
import resources.BaseClass;

public class FacilitiesManagement_482 {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacility_482_Obj applicationForFinancialFacilityObj = new ApplicationForFinancialFacility_482_Obj(driver);
	ApplicationForFinancialFacilityParamObj fmsParamObj = new ApplicationForFinancialFacilityParamObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"FacilitiesManagement","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	List<Boolean> checkbox = new LinkedList<Boolean>();
	String requestId;
	String date;
	CSMLogin csmLogin = new CSMLogin(driver);
	int randomNumber;
	
	 // approve facility record in facility management
    @Given("User_482 click Facilities Management in WIFAK Application")
    public void user_482_click_facilities_management_in_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
    }
    @Given("User_482 click approve submenu in Request for Financing under WIFAK Application")
    public void user_482_click_approve_submenu_in_request_for_financing_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
  	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
  	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
    }
    @Given("User_482 search active status in approve level 1 under WIFAK Application")
    public void user_482_search_active_status_in_approve_level_1_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication().sendKeys(testData.get("SearchStatus"));
  	  applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication().sendKeys(Keys.ENTER);
    }
    @Given("User_482 select the first active record of facility record under WIFAK Application")
    public void user_482_select_the_first_active_record_of_facility_record_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication()); 
  	  seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
    }
    @Given("User_482 click approve button in facility main information under WIFAK Application")
    public void user_482_click_approve_button_in_facility_main_information_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
    }
    @Given("User_482 Validate the approved facility record in Facility management under WIFAK Application")
    public void user_482_validate_the_approved_facility_record_in_facility_management_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
  	  Assert.assertTrue(applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().isDisplayed());
    }
    @Given("User_482 Update test data set id for AT_FM_010")
    public void user_482_update_test_data_set_id_for_at_fm_010() {
    	testData = excelData.getTestdata("AT_FM_010_D1");
    }

    @Given("User_482 search Status In Maintenance under REQUEST FOR FINANCIN")
    public void user_482_search_status_in_maintenance_under_request_for_financin() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys("draft");
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys(Keys.ENTER);
    }
    @Given("User_482 select the searched status in Maintenance screen under REQUEST FOR FINANCIN")
    public void user_482_select_the_searched_status_in_maintenance_screen_under_request_for_financin() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
    }
    @And("User_482 click parameter Menu")
    public void user_482_click_parameter_menu() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.parameterMainMenu_FMS());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.parameterMainMenu_FMS());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.parameterMainMenu_FMS());
    }

    @And("User_482 click Control record Sub Menu")
    public void user_482_click_control_record_sub_menu() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.ControlRecordScreenInFSMParam_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.ControlRecordScreenInFSMParam_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.ControlRecordScreenInFSMParam_482());
    }

    @And("User_482 click Update After Approve in control record")
    public void user_482_click_update_after_approve_in_control_record() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.updateAfterapproveScreen_ControlRecordInFSMParam_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.updateAfterapproveScreen_ControlRecordInFSMParam_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.updateAfterapproveScreen_ControlRecordInFSMParam_482());
    }

    @And("User_482 Check the Enable Alerts check box")
    public void user_482_check_the_enable_alerts_check_box() {
    	for (int i = 0; i <2000; i++) {
			try {
				seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.enableAlertsCheckBox_482());
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.enableAlertsCheckBox_482());
    	if (applicationForFinancialFacilityObj.enableAlertsCheckBox_482().getAttribute("initialvalue").isBlank()
    			||applicationForFinancialFacilityObj.enableAlertsCheckBox_482().getAttribute("initialvalue").isEmpty()) {
    		applicationForFinancialFacilityObj.enableAlertsCheckBox_482().click();
		}
    }
    @And("User_482 Uncheck the Enable Alerts check box")
    public void user_482_uncheck_the_enable_alerts_check_box() {
    	for (int i = 0; i <2000; i++) {
			try {
				seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.enableAlertsCheckBox_482());
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.enableAlertsCheckBox_482());
    	if (!applicationForFinancialFacilityObj.enableAlertsCheckBox_482().getAttribute("initialvalue").isBlank()
    			||!applicationForFinancialFacilityObj.enableAlertsCheckBox_482().getAttribute("initialvalue").isEmpty()) {
    		applicationForFinancialFacilityObj.enableAlertsCheckBox_482().click();
		}
    	else {
			Assume.assumeTrue(false);
		}
    }

    @And("User_482 Uncheck the Auto Alerts Check box")
    public void user_482_uncheck_the_auto_alerts_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.AutoAlertsCheckBox_482());
    	if (applicationForFinancialFacilityObj.AutoAlertsCheckBox_482().getAttribute("initialvalue").isBlank()
    			||applicationForFinancialFacilityObj.AutoAlertsCheckBox_482().getAttribute("initialvalue").isEmpty()) {
    		applicationForFinancialFacilityObj.AutoAlertsCheckBox_482().click();
		}
    	else {
			Assume.assumeTrue(false);
		}
    	
    }
    
    @And("User_482 click update button in Update after approve")
    public void user_482_click_update_button_in_update_after_approve() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.updateButton_UpdateAfterApproveInControlRecord_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.updateButton_UpdateAfterApproveInControlRecord_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.updateButton_UpdateAfterApproveInControlRecord_482());
    }

    @And("User_482 click approve screen in Control records")
    public void user_482_click_approve_screen_in_control_records() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveScreen_ControlRecordInFSMParam_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveScreen_ControlRecordInFSMParam_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveScreen_ControlRecordInFSMParam_482());
    }

    @And("User_482 click approve button in aaprove screen")
    public void user_482_click_approve_button_in_aaprove_screen() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveButtonInApproveScreenControlRecord_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveButtonInApproveScreenControlRecord_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonInApproveScreenControlRecord_482());
    }
    
    // facility type
    
    @And("User_482 click Facility Type")
    public void user_482_click_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.facilityTypeSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.facilityTypeSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.facilityTypeSubMenu());
    }

    @And("User_482 click update after approve screen in Facility type")
    public void user_482_click_update_after_approve_screen_in_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.updateAfterApprove_FacilityType());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.updateAfterApprove_FacilityType());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.updateAfterApprove_FacilityType());
    }

    @And("User_482 Search facility type code in Update after approve screen Facility type")
    public void user_482_search_facility_type_code_in_update_after_approve_screen_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen().sendKeys("740");
		fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen().sendKeys(Keys.ENTER);
		String xpath ="//td[text()='740']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				
			}
		}
		

    }

    @And("User_482 select the searched facility type in Update after approve screen Facility type")
    public void user_482_select_the_searched_facility_type_in_update_after_approve_screen_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.selectSearchedFacilityTypeInUdateAfterApproveScreen());
    	seleniumActions.getClickAndActionsHelper().doubleClick(fmsParamObj.selectSearchedFacilityTypeInUdateAfterApproveScreen());
    }

    @And("User_482 click facility details tab in searched record Update after approve screen Facility type")
    public void user_482_click_facility_details_tab_in_searched_record_update_after_approve_screen_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.facilityDetailsTab());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.facilityDetailsTab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.facilityDetailsTab());
    }

    @And("User_482 click STP Facility Requirements")
    public void user_482_click_stp_facility_requirements() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.StpFacilityRequirementsOption());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.StpFacilityRequirementsOption());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.StpFacilityRequirementsOption());
    }
    @And("User_482 check Customer Grading Checkbox")
    public void user_482_check_customer_grading_checkbox(Integer int1) {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.customerGradingCheckbox_482());
    	if (fmsParamObj.customerGradingCheckbox_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.customerGradingCheckbox_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.customerGradingCheckbox_482().click();
    		checkbox.add(true);
		}
    }

    @And("User_482 Check Overwrite Grading")
    public void user_482_check_overwrite_grading(Integer int1) {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.overWriteGradingCheckbox_482());
    	if (fmsParamObj.overWriteGradingCheckbox_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.overWriteGradingCheckbox_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.overWriteGradingCheckbox_482().click();
    		checkbox.add(true);
		}
    }

    @And("User_482 check Committee Approval CheckBox")
    public void user_482_check_committee_approval_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxApprovalCommittee());
    	if (fmsParamObj.checkBoxApprovalCommittee().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxApprovalCommittee().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxApprovalCommittee().click();
    		checkbox.add(true);
		}
    	
    }
    @And("User_482 check Credit authorization")
    public void user_482_check_credit_authorization() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxCreditAuthorization());
    	if (fmsParamObj.checkBoxCreditAuthorization().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxCreditAuthorization().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxCreditAuthorization().click();
    		checkbox.add(true);
		}
    }

    @And("User_482 check Credit Review CheckBox")
    public void user_482_check_credit_review_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxCreditReview_482());
    	if (fmsParamObj.checkBoxCreditReview_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxCreditReview_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxCreditReview_482().click();
    		checkbox.add(true);
		}
    }

    @And("User_482 check Issue Facility Offer CheckBox")
    public void user_482_check_issue_facility_offer_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxIssueFacilityOffer_482());
    	if (fmsParamObj.checkBoxIssueFacilityOffer_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxIssueFacilityOffer_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxIssueFacilityOffer_482().click();
    		checkbox.add(true);
		}
    }
    @Given("User_482 Uncheck Issue Facility Offer CheckBox")
    public void user_482_uncheck_issue_facility_offer_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxIssueFacilityOffer_482());
    	if (!fmsParamObj.checkBoxIssueFacilityOffer_482().getAttribute("initialvalue").isBlank()||
    			!fmsParamObj.checkBoxIssueFacilityOffer_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxIssueFacilityOffer_482().click();
    		checkbox.add(true);
		}
    }
    @Given("User_482 Uncheck Client Response CheckBox")
    public void user_482_uncheck_client_response_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxClientResponse_482());
    	if (!fmsParamObj.checkBoxClientResponse_482().getAttribute("initialvalue").isBlank()||
    			!fmsParamObj.checkBoxClientResponse_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxClientResponse_482().click();
    		checkbox.add(true);
		}
    }
    @Given("User_482 check Client Response CheckBox")
    public void user_482_check_client_response_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxClientResponse_482());
    	if (fmsParamObj.checkBoxClientResponse_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxClientResponse_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxClientResponse_482().click();
    		checkbox.add(true);
		}
    }
    
    @Given("User_482 Uncheck Document Validation CheckBox")
    public void user_482_uncheck_document_validation_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxDocumentValidation_482());
    	if (!fmsParamObj.checkBoxDocumentValidation_482().getAttribute("initialvalue").isBlank()||
    			!fmsParamObj.checkBoxDocumentValidation_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxDocumentValidation_482().click();
    		checkbox.add(true);
		}
    }

    @Given("User_482 Uncheck Final Approval CheckBox")
    public void user_482_uncheck_final_approval_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxFinalApproval_482());
    	if (!fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isBlank()||
    			!fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxFinalApproval_482().click();
    		checkbox.add(true);
		}
    }

    @Given("User_482 Uncheck Create Active Facility If Within Limits CheckBox")
    public void user_482_uncheck_create_active_facility_if_within_limits_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482());
    	if (!fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482().getAttribute("initialvalue").isBlank()||
    			!fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482().click();
    		checkbox.add(true);
		}
    }

    @And("User_482 check Document Validation CheckBox")
    public void user_482_check_document_validation_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxDocumentValidation_482());
    	if (fmsParamObj.checkBoxDocumentValidation_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxDocumentValidation_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxDocumentValidation_482().click();
    		checkbox.add(true);
		}
    }

    @And("User_482 check Final Approval CheckBox")
    public void user_482_check_final_approval_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxFinalApproval_482());
    	if (fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxFinalApproval_482().click();
    		checkbox.add(true);
		}
    }

    @And("User_482 check Create Active Facility If Within Limits CheckBox")
    public void user_482_check_create_active_facility_if_within_limits_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482());
    	if (fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxFinalApproval_482().click();
    		checkbox.add(true);
		}
    }

    @And("User_482 uncheck Automatically Approve Facility If Within Limits CheckBox")
    public void user_482_uncheck_automatically_approve_facility_if_within_limits_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482());
    	if (!fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().getAttribute("initialvalue").isBlank()||
    			!fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().click();
    		checkbox.add(true);
		}
    	
    }
    @Given("User_482 check Automatically Approve Facility If Within Limits CheckBox")
    public void user_482_check_automatically_approve_facility_if_within_limits_check_box() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482());
    	if (fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().getAttribute("initialvalue").isBlank()||
    			fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().getAttribute("initialvalue").isEmpty()) {
    		fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().click();
    		checkbox.add(true);
		}
    	else if (!checkbox.contains(true)) {
    		Assume.assumeTrue(false);
		} 
    }

    @And("User_482 click update button in Update after approve screen Facility type")
    public void user_482_click_update_button_in_update_after_approve_screen_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
    }

    @And("User_482 click approve screen in Facility type")
    public void user_482_click_approve_screen_in_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.approveScreenInFacilityType());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.approveScreenInFacilityType());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.approveScreenInFacilityType());
    }

    @And("User_482 search code in approve screen Facility type")
    public void user_482_search_code_in_approve_screen_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.searchFacilityTypeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.searchFacilityTypeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.searchFacilityTypeInApproveScreen());
		fmsParamObj.searchFacilityTypeInApproveScreen().sendKeys("740");
		fmsParamObj.searchFacilityTypeInApproveScreen().sendKeys(Keys.ENTER);
		String xpath ="//td[text()='740']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("User_482 select searched code in approve screen Facility type")
    public void user_482_select_searched_code_in_approve_screen_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.selectSearchedFacilityTypeInApproveScreen());
    	seleniumActions.getClickAndActionsHelper().doubleClick(fmsParamObj.selectSearchedFacilityTypeInApproveScreen());
    }

    @And("User_482 click approve button in approve screen Facility type")
    public void user_482_click_approve_button_in_approve_screen_facility_type() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.approveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.approveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.approveButtonInApproveScreen());
       
    }
    
    

}
