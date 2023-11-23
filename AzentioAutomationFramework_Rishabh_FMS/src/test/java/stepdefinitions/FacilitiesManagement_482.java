package stepdefinitions;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.fms.ApplicationForFinancialFacility_482_Obj;
import pageobjects.fms.FacilitiesManagmentObj;
import pageobjects.fmsparams.ApplicationForFinancialFacilityParamObj;
import pageobjects.iisParam.CommonElementsObj;
import resources.BaseClass;

public class FacilitiesManagement_482 {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacility_482_Obj applicationForFinancialFacilityObj = new ApplicationForFinancialFacility_482_Obj(
			driver);
	ApplicationForFinancialFacilityParamObj fmsParamObj = new ApplicationForFinancialFacilityParamObj(driver);
	FacilitiesManagmentObj facilitiesManagmentObj = new FacilitiesManagmentObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "ApplicationForFinancialFacility", "DataSet ID");
	ExcelData facilityManagementData = new ExcelData(path, "FacilitiesManagement", "DataSet ID");
	ExcelData facilityManagementData_482 = new ExcelData(path, "FacilitiesManagement_482", "DataSet ID");
	ExcelData requestForFinancingData = new ExcelData(path, "RequestForFinancing_482", "DataSet ID");
	ExcelData drawDownRequestData = new ExcelData(path, "DrawDownRequest", "DataSet ID");
	ExcelData customerGrading = new ExcelData(path, "CustomerGrading_482", "DataSet ID");
	
	
	ExcelData testExecution = new ExcelData(path, "TestExecution", "TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	List<Boolean> checkbox = new LinkedList<Boolean>();
	String UserId_xpath, GLCode, CR_Rec_Xpath, ACR_Xpath; // requestId,
	String requestId; // = "5860";
	String date;
	CSMLogin csmLogin = new CSMLogin(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	CommonElementsObj commonElementsObj = new CommonElementsObj(driver);

	int randomNumber;

	// approve facility record in facility management
	@Given("User_482 click Facilities Management in WIFAK Application")
	public void user_482_click_facilities_management_in_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
	}

	@Given("User_482 click approve submenu in Request for Financing under WIFAK Application")
	public void user_482_click_approve_submenu_in_request_for_financing_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
	}

	@Given("User_482 search active status in approve level 1 under WIFAK Application")
	public void user_482_search_active_status_in_approve_level_1_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
				.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
		applicationForFinancialFacilityObj
				.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication()
				.sendKeys(testData.get("SearchStatus"));
		applicationForFinancialFacilityObj
				.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication().sendKeys(Keys.ENTER);
	}

	@Given("User_482 select the first active record of facility record under WIFAK Application")
	public void user_482_select_the_first_active_record_of_facility_record_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj
				.selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
	}

	@Given("User_482 click approve button in facility main information under WIFAK Application")
	public void user_482_click_approve_button_in_facility_main_information_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
				.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
	}

	@Given("User_482 Validate the approved facility record in Facility management under WIFAK Application")
	public void user_482_validate_the_approved_facility_record_in_facility_management_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().isDisplayed());
	}

	@Given("User_482 Update test data set id for AT_FM_010")
	public void user_482_update_test_data_set_id_for_at_fm_010() {
		testData = excelData.getTestdata("AT_FM_010_D1");
	}

	@Given("User_482 search Status In Maintenance under REQUEST FOR FINANCIN")
	public void user_482_search_status_in_maintenance_under_request_for_financin() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys("draft");
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys(Keys.ENTER);
	}

	@Given("User_482 select the searched status in Maintenance screen under REQUEST FOR FINANCIN")
	public void user_482_select_the_searched_status_in_maintenance_screen_under_request_for_financin() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
	}

	@And("User_482 click parameter Menu")
	public void user_482_click_parameter_menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.parameterMainMenu_FMS());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.parameterMainMenu_FMS());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.parameterMainMenu_FMS());
	}

	@And("User_482 click Control record Sub Menu")
	public void user_482_click_control_record_sub_menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ControlRecordScreenInFSMParam_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.ControlRecordScreenInFSMParam_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.ControlRecordScreenInFSMParam_482());
	}

	@And("User_482 click Update After Approve in control record")
	public void user_482_click_update_after_approve_in_control_record() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.updateAfterapproveScreen_ControlRecordInFSMParam_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.updateAfterapproveScreen_ControlRecordInFSMParam_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.updateAfterapproveScreen_ControlRecordInFSMParam_482());
	}

	@And("User_482 Check the Enable Alerts check box")
	public void user_482_check_the_enable_alerts_check_box() {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getJavascriptHelper()
						.scrollIntoView(applicationForFinancialFacilityObj.enableAlertsCheckBox_482());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.enableAlertsCheckBox_482());
		if (applicationForFinancialFacilityObj.enableAlertsCheckBox_482().getAttribute("initialvalue").isBlank()
				|| applicationForFinancialFacilityObj.enableAlertsCheckBox_482().getAttribute("initialvalue")
						.isEmpty()) {
			applicationForFinancialFacilityObj.enableAlertsCheckBox_482().click();
		}
	}

	@And("User_482 Uncheck the Enable Alerts check box")
	public void user_482_uncheck_the_enable_alerts_check_box() {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getJavascriptHelper()
						.scrollIntoView(applicationForFinancialFacilityObj.enableAlertsCheckBox_482());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.enableAlertsCheckBox_482());
		if (!applicationForFinancialFacilityObj.enableAlertsCheckBox_482().getAttribute("initialvalue").isBlank()
				|| !applicationForFinancialFacilityObj.enableAlertsCheckBox_482().getAttribute("initialvalue")
						.isEmpty()) {
			applicationForFinancialFacilityObj.enableAlertsCheckBox_482().click();
		} else {
			Assume.assumeTrue(false);
		}
	}

	@And("User_482 Uncheck the Auto Alerts Check box")
	public void user_482_uncheck_the_auto_alerts_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.AutoAlertsCheckBox_482());
		if (applicationForFinancialFacilityObj.AutoAlertsCheckBox_482().getAttribute("initialvalue").isBlank()
				|| applicationForFinancialFacilityObj.AutoAlertsCheckBox_482().getAttribute("initialvalue").isEmpty()) {
			applicationForFinancialFacilityObj.AutoAlertsCheckBox_482().click();
		} else {
			Assume.assumeTrue(false);
		}

	}

	@And("User_482 click update button in Update after approve")
	public void user_482_click_update_button_in_update_after_approve() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.updateButton_UpdateAfterApproveInControlRecord_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.updateButton_UpdateAfterApproveInControlRecord_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.updateButton_UpdateAfterApproveInControlRecord_482());
	}

	@And("User_482 click approve screen in Control records")
	public void user_482_click_approve_screen_in_control_records() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveScreen_ControlRecordInFSMParam_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveScreen_ControlRecordInFSMParam_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approveScreen_ControlRecordInFSMParam_482());
	}

	@And("User_482 click approve button in aaprove screen")
	public void user_482_click_approve_button_in_aaprove_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveButtonInApproveScreenControlRecord_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveButtonInApproveScreenControlRecord_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approveButtonInApproveScreenControlRecord_482());
	}

	// facility type

	@And("User_482 click Facility Type")
	public void user_482_click_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.facilityTypeSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.facilityTypeSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.facilityTypeSubMenu());
	}

	@And("User_482 click update after approve screen in Facility type")
	public void user_482_click_update_after_approve_screen_in_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.updateAfterApprove_FacilityType());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.updateAfterApprove_FacilityType());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.updateAfterApprove_FacilityType());
	}

	@And("User_482 Search facility type code in Update after approve screen Facility type")
	public void user_482_search_facility_type_code_in_update_after_approve_screen_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen().sendKeys("740");
		fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen().sendKeys(Keys.ENTER);
		String xpath = "//td[text()='740']";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("User_482 select the searched facility type in Update after approve screen Facility type")
	public void user_482_select_the_searched_facility_type_in_update_after_approve_screen_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.selectSearchedFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(fmsParamObj.selectSearchedFacilityTypeInUdateAfterApproveScreen());
	}

	@And("User_482 click facility details tab in searched record Update after approve screen Facility type")
	public void user_482_click_facility_details_tab_in_searched_record_update_after_approve_screen_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.facilityDetailsTab());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.facilityDetailsTab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.facilityDetailsTab());
	}

	@And("User_482 click STP Facility Requirements")
	public void user_482_click_stp_facility_requirements() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.StpFacilityRequirementsOption());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.StpFacilityRequirementsOption());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.StpFacilityRequirementsOption());
	}

	@And("User_482 check Customer Grading Checkbox")
	public void user_482_check_customer_grading_checkbox(Integer int1) {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.customerGradingCheckbox_482());
		if (fmsParamObj.customerGradingCheckbox_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.customerGradingCheckbox_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.customerGradingCheckbox_482().click();
			checkbox.add(true);
		}
	}

	@And("User_482 Check Overwrite Grading")
	public void user_482_check_overwrite_grading(Integer int1) {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.overWriteGradingCheckbox_482());
		if (fmsParamObj.overWriteGradingCheckbox_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.overWriteGradingCheckbox_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.overWriteGradingCheckbox_482().click();
			checkbox.add(true);
		}
	}

	@And("User_482 check Committee Approval CheckBox")
	public void user_482_check_committee_approval_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.checkBoxApprovalCommittee());
		if (fmsParamObj.checkBoxApprovalCommittee().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxApprovalCommittee().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxApprovalCommittee().click();
			checkbox.add(true);
		}

	}

	@And("User_482 check Credit authorization")
	public void user_482_check_credit_authorization() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.checkBoxCreditAuthorization());
		if (fmsParamObj.checkBoxCreditAuthorization().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxCreditAuthorization().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxCreditAuthorization().click();
			checkbox.add(true);
		}
	}

	@And("User_482 check Credit Review CheckBox")
	public void user_482_check_credit_review_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.checkBoxCreditReview_482());
		if (fmsParamObj.checkBoxCreditReview_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxCreditReview_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxCreditReview_482().click();
			checkbox.add(true);
		}
	}

	@And("User_482 check Issue Facility Offer CheckBox")
	public void user_482_check_issue_facility_offer_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.checkBoxIssueFacilityOffer_482());
		if (fmsParamObj.checkBoxIssueFacilityOffer_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxIssueFacilityOffer_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxIssueFacilityOffer_482().click();
			checkbox.add(true);
		}
	}

	@Given("User_482 Uncheck Issue Facility Offer CheckBox")
	public void user_482_uncheck_issue_facility_offer_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.checkBoxIssueFacilityOffer_482());
		if (!fmsParamObj.checkBoxIssueFacilityOffer_482().getAttribute("initialvalue").isBlank()
				|| !fmsParamObj.checkBoxIssueFacilityOffer_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxIssueFacilityOffer_482().click();
			checkbox.add(true);
		}
	}

	@Given("User_482 Uncheck Client Response CheckBox")
	public void user_482_uncheck_client_response_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.checkBoxClientResponse_482());
		if (!fmsParamObj.checkBoxClientResponse_482().getAttribute("initialvalue").isBlank()
				|| !fmsParamObj.checkBoxClientResponse_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxClientResponse_482().click();
			checkbox.add(true);
		}
	}

	@Given("User_482 check Client Response CheckBox")
	public void user_482_check_client_response_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.checkBoxClientResponse_482());
		if (fmsParamObj.checkBoxClientResponse_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxClientResponse_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxClientResponse_482().click();
			checkbox.add(true);
		}
	}

	@Given("User_482 Uncheck Document Validation CheckBox")
	public void user_482_uncheck_document_validation_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.checkBoxDocumentValidation_482());
		if (!fmsParamObj.checkBoxDocumentValidation_482().getAttribute("initialvalue").isBlank()
				|| !fmsParamObj.checkBoxDocumentValidation_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxDocumentValidation_482().click();
			checkbox.add(true);
		}
	}

	@Given("User_482 Uncheck Final Approval CheckBox")
	public void user_482_uncheck_final_approval_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.checkBoxFinalApproval_482());
		if (!fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isBlank()
				|| !fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxFinalApproval_482().click();
			checkbox.add(true);
		}
	}

	@Given("User_482 Uncheck Create Active Facility If Within Limits CheckBox")
	public void user_482_uncheck_create_active_facility_if_within_limits_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482());
		if (!fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482().getAttribute("initialvalue").isBlank()
				|| !fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482().click();
			checkbox.add(true);
		}
	}

	@And("User_482 check Document Validation CheckBox")
	public void user_482_check_document_validation_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.checkBoxDocumentValidation_482());
		if (fmsParamObj.checkBoxDocumentValidation_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxDocumentValidation_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxDocumentValidation_482().click();
			checkbox.add(true);
		}
	}

	@And("User_482 check Final Approval CheckBox")
	public void user_482_check_final_approval_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.checkBoxFinalApproval_482());
		if (fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxFinalApproval_482().click();
			checkbox.add(true);
		}
	}

	@And("User_482 check Create Active Facility If Within Limits CheckBox")
	public void user_482_check_create_active_facility_if_within_limits_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482());
		if (fmsParamObj.checkBoxCreateActiveFacilityIfWithinLimit_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxFinalApproval_482().getAttribute("initialvalue").isEmpty()) {
			fmsParamObj.checkBoxFinalApproval_482().click();
			checkbox.add(true);
		}
	}

	@And("User_482 uncheck Automatically Approve Facility If Within Limits CheckBox")
	public void user_482_uncheck_automatically_approve_facility_if_within_limits_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482());
		if (!fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().getAttribute("initialvalue").isBlank()
				|| !fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().getAttribute("initialvalue")
						.isEmpty()) {
			fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().click();
			checkbox.add(true);
		}

	}

	@Given("User_482 check Automatically Approve Facility If Within Limits CheckBox")
	public void user_482_check_automatically_approve_facility_if_within_limits_check_box() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482());
		if (fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().getAttribute("initialvalue").isBlank()
				|| fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().getAttribute("initialvalue")
						.isEmpty()) {
			fmsParamObj.checkBoxAutomaticallyApproveFacilityIfWithinLimits_482().click();
			checkbox.add(true);
		} else if (!checkbox.contains(true)) {
			Assume.assumeTrue(false);
		}
	}

	@And("User_482 click update button in Update after approve screen Facility type")
	public void user_482_click_update_button_in_update_after_approve_screen_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
	}

	@And("User_482 click approve screen in Facility type")
	public void user_482_click_approve_screen_in_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, fmsParamObj.approveScreenInFacilityType());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.approveScreenInFacilityType());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.approveScreenInFacilityType());
	}

	@And("User_482 search code in approve screen Facility type")
	public void user_482_search_code_in_approve_screen_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.searchFacilityTypeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.searchFacilityTypeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.searchFacilityTypeInApproveScreen());
		fmsParamObj.searchFacilityTypeInApproveScreen().sendKeys("740");
		fmsParamObj.searchFacilityTypeInApproveScreen().sendKeys(Keys.ENTER);
		String xpath = "//td[text()='740']";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 select searched code in approve screen Facility type")
	public void user_482_select_searched_code_in_approve_screen_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.selectSearchedFacilityTypeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(fmsParamObj.selectSearchedFacilityTypeInApproveScreen());
	}

	@And("User_482 click approve button in approve screen Facility type")
	public void user_482_click_approve_button_in_approve_screen_facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsParamObj.approveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.approveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.approveButtonInApproveScreen());

	}

	// ************************************* Start
	// ****************************************************************

	@And("User_482 Update Test data set for AT_FM_025")
	public void User_482_Update_Test_data_set_for_AT_FM_025() {

		// testData = excelData.getTestdata("AT_FM_021_D1");

		testExecutionData = testExecution.getTestdata("AT_FM_025");
		testData = facilityManagementData.getTestdata(testExecutionData.get("Data Set ID"));
		System.out.println(testData.get("RequestID"));
	}

	@And("User_482 Update Test data set for AT_CG_010")
	public void User_482_Update_Test_data_set_for_AT_CG_010() {


		testExecutionData = testExecution.getTestdata("AT_CG_010");
		testData = customerGrading.getTestdata(testExecutionData.get("Data Set ID"));
		//System.out.println(testData.get("RequestID"));
	}
	
	@And("User_482 Update Test data set for AT_CG_011")
	public void User_482_Update_Test_data_set_for_AT_CG_011() {


		testExecutionData = testExecution.getTestdata("AT_CG_011");
		testData = customerGrading.getTestdata(testExecutionData.get("Data Set ID"));
		//System.out.println(testData.get("RequestID"));
	}
	
	
	@And("User_482 Select the New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_Select_the_New_Request_in_Reason_For_Submission_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.reasonForSubmissionSelect());
		seleniumActions.getDropDownHelper()
				.SelectUsingVisibleText(applicationForFinancialFacilityObj.reasonForSubmissionSelect(), "New Request");
		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.requestDateValidation().getAttribute("prevvalue").isBlank()
						&& !applicationForFinancialFacilityObj.requestDateValidation().getAttribute("prevvalue")
								.isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("User_482 click on the Cif under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_click_on_the_Cif_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.customerCIF());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.customerCIF());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.customerCIF());

	}

	@And("User_482 enter the Cif under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_enter_the_Cif_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.customerCIF());
		for (int i = 0; i < 200; i++) {
			try {
				System.out.println("CIF: " + testData.get("CIFNO"));
				// applicationForFinancialFacilityObj.customerCIF().clear();
				applicationForFinancialFacilityObj.customerCIF().sendKeys(testData.get("CIFNO"));
				applicationForFinancialFacilityObj.customerCIF().sendKeys(Keys.TAB);

				break;

			} catch (Exception e) {

			}

		}

		for (int i = 0; i < 10; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());
				System.out.println("Progress Bar Appeared");

				wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
				System.out.println("Progress Bar Disappeard");
				break;

			} catch (Exception e) {

			}

		}

	}

	@And("User_482 click on the Facilty type under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_click_on_the_Facilty_type_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
//		seleniumActions.getClickAndActionsHelper()
//				.moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());

		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 enter the Faclity type under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_enter_the_Faclity_type_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());

		for (int i = 0; i < 200; i++) {
			try {
				System.out.println("Facility Type :" + testData.get("FacilityType"));
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen().clear();
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen()
						.sendKeys(testData.get("FacilityType"));
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen().sendKeys(Keys.TAB);
				Thread.sleep(2000);
				break;
			} catch (Exception e) {

				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

//				waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());
//				System.out.println("Progress Bar Appeared");

		wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
		System.out.println("Progress Bar Disappeard");

	}

	@And("User_482 click on the total limit under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_click_on_the_total_limit_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());

		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen().click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 enter the total limit under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_enter_the_total_limit_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());

		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen().clear();
				applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen()
						.sendKeys(testData.get("TotalLimit"));
				applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}

			}
		}
//		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());
//		System.out.println("Progress Bar Appeared");

		wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.displayProgIcon()));
		System.out.println("Progress icon Disappeard");
	}
	
	@And("User_482 click on Account field under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_click_on_Account_field_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
	    waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ACC_BR_InRequestForFinancingScreen());
	    for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.ACC_BR_InRequestForFinancingScreen().click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@And("User_482 enter the Branch Code under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_enter_the_Branch_Code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		    waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ACC_BR_InRequestForFinancingScreen());
		    for (int i = 0; i < 200; i++) {
				try {
					applicationForFinancialFacilityObj.ACC_BR_InRequestForFinancingScreen().clear();
					applicationForFinancialFacilityObj.ACC_BR_InRequestForFinancingScreen()
					.sendKeys(testData.get("AccBRCode"));
			applicationForFinancialFacilityObj.ACC_BR_InRequestForFinancingScreen().sendKeys(Keys.TAB);
					break;
				} catch (Exception e) {

					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}


	@And("User_482 enter the Currency Code under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_enter_the_Currency_Code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		 waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ACC_CY_InRequestForFinancingScreen());
		    for (int i = 0; i < 200; i++) {
				try {
					applicationForFinancialFacilityObj.ACC_CY_InRequestForFinancingScreen().click();
					applicationForFinancialFacilityObj.ACC_CY_InRequestForFinancingScreen().clear();
					applicationForFinancialFacilityObj.ACC_CY_InRequestForFinancingScreen()
					.sendKeys(testData.get("AccCYCode"));
			applicationForFinancialFacilityObj.ACC_CY_InRequestForFinancingScreen().sendKeys(Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}

				}
			}
	}


	@And("User_482 enter the  Gl Code under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_enter_the__Gl_Code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		 waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ACC_GL_InRequestForFinancingScreen());
		    for (int i = 0; i < 200; i++) {
				try {
					applicationForFinancialFacilityObj.ACC_GL_InRequestForFinancingScreen().click();
					applicationForFinancialFacilityObj.ACC_GL_InRequestForFinancingScreen().clear();
					applicationForFinancialFacilityObj.ACC_GL_InRequestForFinancingScreen()
					.sendKeys(testData.get("AccGLCode"));
			applicationForFinancialFacilityObj.ACC_GL_InRequestForFinancingScreen().sendKeys(Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}

				}
			}
	}


	@And("User_482 enter the CIF Code under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_enter_the_CIF_Code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ACC_CIF_InRequestForFinancingScreen());
	    for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.ACC_CIF_InRequestForFinancingScreen().click();
				applicationForFinancialFacilityObj.ACC_CIF_InRequestForFinancingScreen().clear();
				applicationForFinancialFacilityObj.ACC_CIF_InRequestForFinancingScreen()
				.sendKeys(testData.get("AccCIFCode"));
		applicationForFinancialFacilityObj.ACC_CIF_InRequestForFinancingScreen().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}


	@And("User_482 enter the Serial code under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_enter_the_Serial_code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ACC_SL_InRequestForFinancingScreen());
	    for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.ACC_SL_InRequestForFinancingScreen().click();
				applicationForFinancialFacilityObj.ACC_SL_InRequestForFinancingScreen().clear();
				applicationForFinancialFacilityObj.ACC_SL_InRequestForFinancingScreen()
				.sendKeys(testData.get("AccSLCode"));
		applicationForFinancialFacilityObj.ACC_SL_InRequestForFinancingScreen().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User_482 click on the Shareholder and Owner Tab under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_click_on_the_Shareholder_and_Owner_Tab_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.OwnersShareholdersTAB());
//		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.OwnersShareholdersTAB());

		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.OwnersShareholdersTAB().click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}

			}
		}
//		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());
//		System.out.println("Progress Bar Appeared");

		wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
		System.out.println("Progress Bar Disappeard");
	}

	@And("User_482 click on the add icon under Shareholder and Owner Tab")
	public void User_482_click_on_the_add_icon_under_Shareholder_and_Owner_Tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.Owners_ShareholdersAddicon());
		// seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.Owners_ShareholdersAddicon());

		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.Owners_ShareholdersAddicon().click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("User_482 click on the New rec under Shareholder and Owner Tab")
	public void User_482_click_on_the_New_rec_under_Shareholder_and_Owner_Tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.OwnersShareholdersNewRec());
		// seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.OwnersShareholdersNewRec());

		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.OwnersShareholdersNewRec().click();
				break;
			} catch (Exception e) {

				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 click on the Cif field under Shareholder and Owner Tab")
	public void User_482_click_on_the_Cif_field_under_Shareholder_and_Owner_Tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.OwnersShareholdersNewRecCIF());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.OwnersShareholdersNewRecCIF());

		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.OwnersShareholdersNewRecCIF().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("User_482 enter the Cif")
	public void User_482_enter_the_Cif() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.OwnersShareholdersNewRecCIF());
		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.OwnersShareholdersNewRecCIF().clear();
				applicationForFinancialFacilityObj.OwnersShareholdersNewRecCIF().sendKeys(testData.get("CIFNO"));
				applicationForFinancialFacilityObj.OwnersShareholdersNewRecCIF().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_click_on_Disbursement_or_Sublimit_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.disbursementOrSublimitInRequestForFinancingScreen().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
		System.out.println("Progress Bar Disappeard");
	}

	@And("User_482 click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_click_on_Add_button_in_Disbursement_or_Sublimit_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());

		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_482 click on the Product class under sublimit")
	public void User_482_click_on_the_Product_class_under_sublimit() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
	}

	@And("User_482 enter the product class under sublimit")
	public void User_482_enter_the_product_class_under_sublimit() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
		applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp().sendKeys(testData.get("ProductClass"));
	}

	@And("User_482 click on add button under sublimit")
	public void User_482_click_on_add_button_under_sublimit() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		Thread.sleep(2000);

		if (applicationForFinancialFacilityObj.okButtonInInformationPopUp().isDisplayed()) {
			for (int i = 0; i < 200; i++) {

				try {
					applicationForFinancialFacilityObj.okButtonInInformationPopUp().click();
					System.out.println("clicked on ok pop up");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_482 click on Save button under Maintenance screen in REQUEST FOR FINANCIN")
	public void User_482_click_on_Save_button_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

//    	if(applicationForFinancialFacilityObj.okButtonInConfirmationPopUp().isDisplayed()) {
//    	    System.out.println("OK pop up appeared");
//    		applicationForFinancialFacilityObj.okButtonInConfirmationPopUp().click();
//    	}
//    	else {
//    		System.out.println("OK pop up not appeared");
//    	}

		for (int i = 0; i < 200; i++) {

			try {
				applicationForFinancialFacilityObj.savebuttonInRequestForFinancingScreenMaintenance().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
		System.out.println("Progress Bar Disappeard");
	}

	@And("User_482 Get the Code in Success Pop up Menu")
	public void User_482_Get_the_Code_in_Success_Pop_up_Menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
		requestId = applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().getText().substring(10,
				14);
		System.out.println("RequestID" + requestId);
		excelData.updateTestData(testData.get("Data Set ID"), "RequestID", requestId);
		System.out.println(requestId);
	}

//    @And("User_482 click search icon in Maintenance screen Request for financing")
//    public void User_482_click_search_icon_in_Maintenance_screen_Request_for_financing() {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
//		seleniumActions.getClickAndActionsHelper()
//				.moveToElement(applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
//		seleniumActions.getClickAndActionsHelper()
//				.clickOnElement(applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
//    }

	@And("User_482 Search code in Maintenance screen Request for financing")
	public void User_482_Search_code_in_Maintenance_screen_Request_for_financing() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
		applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing().sendKeys(requestId);
		String xpath = "//td[contains(text(),'" + requestId + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 Select searched record in Maintenance screen Request for financing")
	public void User_482_Select_searched_record_in_Maintenance_screen_Request_for_financing() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
	}

	@And("User_482 click Validate button in Main Info tab under Request for financing")
	public void User_482_click_Validate_button_in_Main_Info_tab_under_Request_for_financing()
			throws InterruptedException {
		for (int i = 0; i < 2000; i++) {
			try {
				applicationForFinancialFacilityObj.okButtonInInformationPopUp().click();
				break;
			} catch (Exception e) {

				continue;
			}
		}
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen());
		Thread.sleep(10000);
		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen().click();
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 50; i++) {
			try {
				if (applicationForFinancialFacilityObj.okButtonInConfirmationPopUp().isDisplayed()) {
					System.out.println("OK pop up appeared");
					applicationForFinancialFacilityObj.okButtonInConfirmationPopUp().click();
				} else {
					applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen().click();
					System.out.println("OK pop up not appeared");
				}
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User_482 close the Maintenance Screen$")
	public void user_482_close_the_maintenance_screen() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		for (int i = 0; i < 2000; i++) {
			try {
				commonElementsObj.iisScreenCloseBtn().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 click Approve Level 1 screen in Request for financing facilities under Request for financing")
	public void User_482_click_Approve_Level_1_screen_in_Request_for_financing_facilities_under_Request_for_financing() {
		for (int i = 0; i < 2000; i++) {
			try {
//				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
//						.approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication());
//				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
//						.approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication();
				applicationForFinancialFacilityObj
						.approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 Search code in Approve Level 1 screen in Request for financing facilities")
	public void User_482_Search_code_in_Approve_Level_1_screen_in_Request_for_financing_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());
//		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
//				.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());
		for (int i = 0; i < 2000; i++) {
			try {
				applicationForFinancialFacilityObj
						.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing().click();
				applicationForFinancialFacilityObj
						.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing()
						.sendKeys(requestId);
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			applicationForFinancialFacilityObj
					.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing()
					.sendKeys(Keys.ENTER);
		}

	}

	@And("User_482 Select searched record in Approve level 1 screen Request for financing facilities")
	public void User_482_Select_searched_record_in_Approve_level_1_screen_Request_for_financing_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj
				.selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());
//		wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
//		System.out.println("Progress Bar Disappeard");
	}

	@And("^User_482 click on the Customer Grading tab$")
	public void user_482_click_on_the_customer_grading_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CustomerGradingTab());
		for (int i = 0; i < 2000; i++) {
			try {
				applicationForFinancialFacilityObj.CustomerGradingTab().click();

				break;
			} catch (Exception e) {

			}
		}

	}

	@And("User_482 Select Decision in Approve level 1 under Request for financing facilities")
	public void user_482_select_decision_in_approve_level_1_under_Request_for_financing_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectDecisionInApproveLevel1UnderRequestforfinancingfacilities());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.selectDecisionInApproveLevel1UnderRequestforfinancingfacilities(),
				"Approve");
	}

	@And("User_482 click approve button in approve screen")
	public void user_482_click_approve_button_in_approve_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveButtonInApproveScreen());
		// seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonInApproveScreen());
		for (int i = 0; i < 2000; i++) {
			try {
				applicationForFinancialFacilityObj.approveButtonInApproveScreen().click();

				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on Ok button in Confirm Pop up Menu")
	public void User_482_click_on_Ok_button_in_Confirm_Pop_up_Menu() {
		for (int i = 0; i < 5000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.okButtonInConfirmationPopUp());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.okButtonInConfirmationPopUp());
				break;
			} catch (Exception e) {

			}
		}
		wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
		System.out.println("Progress Bar Disappeard");
	}

	@And("User_482 click on Ok button in Success Pop up Menu")
	public void User_482_click_on_Ok_button_in_Success_Pop_up_Menu() {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getBrowserHelper().SwitchToWindow(1);
				seleniumActions.getBrowserHelper().switchToParentWithChildClose();
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 2000; i++) {
			waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.okButtonInSucessPopUp());
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
				break;
			} catch (Exception e) {

			}
		}
	}
	
	@And("User_482 Dismiss the alert")
	public void User_482_Dismiss_the_alert() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		for(int i = 0; i < 2000; i++) {
		try {
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
			break;
		} catch (Exception e) {

		}
		}
	}


	// *************************************** End  **************************************************************

	// *************************************** Start **************************************************************
	// @AT_FM_018

	@And("User_482 click on the parameters menu under sads1 application")
	public void User_482_click_on_the_parameters_menu_under_sads1_application() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.SadsParameterMenu());
		facilitiesManagmentObj.SadsParameterMenu().click();
		System.out.println("Succesfully Clicked on Parameter");
	}

	@And("User_482 click on the Account Restriction menu")
	public void User_482_click_on_the_Account_Restriction_menu() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountModule());
		facilitiesManagmentObj.RescrictAccountModule().click();
		System.out.println("Succesfully Clicked on Account Restriction menu");
	}

	@And("User_482 click on the Maintenance Screen under Account Restriction menu")
	public void User_482_click_on_the_Maintenance_Screen_under_Account_Restriction_menu() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountMaintenance());
		facilitiesManagmentObj.RescrictAccountMaintenance().click();
		System.out.println("Succesfully Clicked on Maintenance Screen under Account Restriction menu");
	}

	@And("User_482 click on the Code under Account Resctriction Maintenance Screen")
	public void User_482_click_on_the_Code_under_Account_Resctriction_Maintenance_Screen() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictCodeFeild());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictCodeFeild().click();
				System.out.println("Succesfully Clicked on Code Feild");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on Code Feild");
			}
		}
	}

	@And("User_482 Enter the code under code")
	public void User_482_Enter_the_code_under_code() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictCodeFeild());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictCodeFeild().clear();
				facilitiesManagmentObj.RescrictCodeFeild().sendKeys(testData.get("ResCode"));
				// facilitiesManagmentObj.RescrictCodeFeild().sendKeys("234");
				facilitiesManagmentObj.RescrictCodeFeild().sendKeys(Keys.TAB);
				wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.displayProgIcon()));
				System.out.println("Progress icon Disappeard");
				// System.out.println("Succesfully Enter on Code Feild");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Enter Code");
			}
		}

	}

	@And("User_482 click on the discription")
	public void User_482_click_on_the_discription() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountDescription());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountDescription().click();
				System.out.println("Succesfully Clicked on Description Feild");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on Description Feild");
			}
		}
	}

	@And("User_482 enter the discription")
	public void User_482_enter_the_discription() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountDescription());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountDescription().clear();
				facilitiesManagmentObj.RescrictAccountDescription().sendKeys(testData.get("Description"));
				// facilitiesManagmentObj.RescrictAccountDescription().sendKeys("Test");
				System.out.println("Succesfully Enter on Description Feild");
				facilitiesManagmentObj.RescrictAccountDescription().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Enter Description");
			}
		}
	}

	@And("User_482 selects the root under Application field")
	public void User_482_selects_the_root_under_Application_field() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountAppRecRoot());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountAppRecRoot().click();
				System.out.println("Succesfully Clicked on App Rec Root Feild");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on App Rec Root Feild");
			}
		}
	}

	@And("User_482 check the root flag under Application feild")
	public void User_482_check_the_root_flag_under_Application_feild() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountAppRootFlag());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountAppRootFlag().click();
				System.out.println("Succesfully Clicked on App Root Flag");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on App Root Flag");
			}
		}
	}

	@And("User_482 selects the root under Companies feild")
	public void User_482_selects_the_root_under_Companies_feild() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountCompaniesRecRoot());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountCompaniesRecRoot().click();
				System.out.println("Succesfully Clicked on Companies Rec Root Feild");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on Companies Rec Root Feild");
			}
		}
	}

	@And("User_482 check the root flag under Companies feild")
	public void User_482_check_the_root_flag_under_Companies_feild() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountCompaniesRootFlag());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountCompaniesRootFlag().click();
				System.out.println("Succesfully Clicked on Companies Root Flag");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on Companies Root Flag");
			}
		}
	}

	@And("User_482 click on the search bar Under User Id")
	public void User_482_click_on_the_search_bar_Under_User_Id() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountUserIdSearchBar());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountUserIdSearchBar().click();
				System.out.println("Succesfully Clicked on User Id Search Bar");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on User Id Search Bar");
			}
		}
	}

	@And("User_482 enter the user id Under User Id")
	public void User_482_enter_the_user_id_Under_User_Id() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountUserIdSearchBar());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountUserIdSearchBar().clear();
				facilitiesManagmentObj.RescrictAccountUserIdSearchBar().sendKeys(testData.get("UserId"));
				// facilitiesManagmentObj.RescrictAccountUserIdSearchBar().sendKeys("MODEL.B");
				System.out.println("Succesfully Enter on Description Feild");
				facilitiesManagmentObj.RescrictAccountUserIdSearchBar().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Enter Description");
			}
		}
	}

	@And("User_482 selects the User Id Search rec")
	public void User_482_selects_the_User_Id_Search_rec() {
		UserId_xpath = "//td[@title= '" + testData.get("UserId") + "']";
		// UserId_xpath = "//td[@title= 'MODEL.B']";
//    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(UserId_xpath))));    	
		for (int i = 1; i < 200; i++) {
			try {
				driver.findElement(By.xpath(UserId_xpath)).click();
				System.out.println("Succesfully Clicked on User Id Search Bar");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on User Id Search Bar");
			}
		}
	}

	@And("User_482 click on the add icon under Restriction type")
	public void User_482_click_on_the_add_icon_under_Restriction_type() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountAddIconBtn());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountAddIconBtn().click();
				System.out.println("Succesfully Clicked on add icon");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on add icon");
			}
		}
	}

	@And("User_482 selects the restriction type from the dropdown")
	public void User_482_selects_the_restriction_type_from_the_dropdown() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				facilitiesManagmentObj.RescrictAccountRestrictTypeDropDown());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				// facilitiesManagmentObj.RescrictAccountRestrictTypeDropDown(), "GL" );
				facilitiesManagmentObj.RescrictAccountRestrictTypeDropDown(), testData.get("Restrict Type"));
		System.out.println("Succesfully Selected the Restrict Type Rec");
	}

	@And("User_482 click on the GL search icon")
	public void User_482_click_on_the_GL_search_icon() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountGlCodeSearchIcon());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountGlCodeSearchIcon().click();
				System.out.println("Succesfully Clicked on add icon");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on add icon");
			}
		}
	}

	@And("User_482 click on the Search GL code feild")
	public void User_482_click_on_the_Search_GL_code_feild() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountGlCodeSearchFeild());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountGlCodeSearchFeild().click();
				System.out.println("Succesfully Clicked on Gl Code Search Feild");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on Gl Code Search Feild");
			}
		}
	}

	@And("User_482 enter the GL code")
	public void User_482_enter_the_GL_code() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountGlCodeSearchFeild());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountGlCodeSearchFeild().clear();
				facilitiesManagmentObj.RescrictAccountGlCodeSearchFeild().sendKeys(testData.get("GLCode"));
				// facilitiesManagmentObj.RescrictAccountGlCodeSearchFeild().sendKeys("805224");
				System.out.println("Succesfully Enter on Description Feild");
				facilitiesManagmentObj.RescrictAccountGlCodeSearchFeild().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Enter Description");
			}
		}
	}

	@And("User_482 selects the searched GL Rec")
	public void User_482_selects_the_searched_GL_Rec() {
		GLCode = "//td[@title= '" + testData.get("GLCode") + "']";
		// GLCode = "//td[@title= '805224']";

		for (int i = 1; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().doubleClick(driver.findElement(By.xpath(GLCode)));
				System.out.println("Succesfully Selects the searched GL Rec");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Selects the searched GL Rec");
			}
		}

	}

	@And("User_482 click on save button under Account Resctriction Maintenance Screen")
	public void User_482_click_on_save_button_under_Account_Resctriction_Maintenance_Screen() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.RescrictAccountSave_key());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.RescrictAccountSave_key().click();
				System.out.println("Succesfully !! Clicked on the Save Button");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Click on the Save Button");
			}
		}
	}
	// sads end...........................

	// FMS Starts>>
	@And("User_482 click on the Reports Module under parameter")
	public void User_482_click_on_the_Reports_Module_under_parameter() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.ReportsMenu());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.ReportsMenu().click();
				System.out.println("Succesfully !! Clicked on the Reports");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on the Customer Account Balance Screen under Reports Module")
	public void User_482_click_on_the_Customer_Account_Balance_Screen_under_Reports_Module() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.ReportsCustomerAccountsBalancesModule());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.ReportsCustomerAccountsBalancesModule().click();
				System.out.println("Succesfully !! Clicked on the Customer Account Balanc");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on the GL code under Account Balance Screen")
	public void User_482_click_on_the_GL_code_under_Account_Balance_Screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				facilitiesManagmentObj.ReportsCustomerAccountsBalancesGL_Feild());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.ReportsCustomerAccountsBalancesGL_Feild().click();
				System.out.println("Succesfully !! Clicked on the GLCode Feild");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 enter the GL code under Account Balance Screen")
	public void User_482_enter_the_GL_code_under_Account_Balance_Screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				facilitiesManagmentObj.ReportsCustomerAccountsBalancesGL_Feild());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.ReportsCustomerAccountsBalancesGL_Feild().clear();
				// facilitiesManagmentObj.ReportsCustomerAccountsBalancesGL_Feild().sendKeys(testData.get("GLCode"));
				facilitiesManagmentObj.ReportsCustomerAccountsBalancesGL_Feild().sendKeys("805224");
				wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
				System.out.println("Progress icon Disappeard");
				System.out.println("Succesfully Enter on GLCode Feild");
				facilitiesManagmentObj.ReportsCustomerAccountsBalancesGL_Feild().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Click on the Retrive button under Account Balance Screen")
	public void User_482_Click_on_the_Retrive_button_under_Account_Balance_Screen() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.ReportsRetriveBtn());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.ReportsRetriveBtn().click();
				System.out.println("Succesfully !! Clicked on the Retrive Button");
				break;
			} catch (Exception e) {

			}
		}
	}

	// *************************************** End
	// **************************************************************

	// *************************************** Start
	// ************************************************************
	// @AT_FM_027

	@And("User_482 Update Test data set for AT_FM_027")
	public void User_482_Update_Test_data_set_for_AT_FM_027() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_FM_027");
		testData = facilityManagementData_482.getTestdata(testExecutionData.get("Data Set ID"));
		System.out.println(testData.get("DataSet ID"));
		System.out.println(testData.get("ApplicationFor"));

	}

	@And("User_482 Update Test data set for AT_FM_021")
	public void User_482_Update_Test_data_set_for_AT_FM_021() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_FM_021");
		testData = facilityManagementData_482.getTestdata(testExecutionData.get("Data Set ID"));
		System.out.println(testData.get("DataSet ID"));
		System.out.println(testData.get("ApplicationFor"));

	}
	
	@And("^User_482 close the Approve Level 1 screen$")
	public void user_482_close_Approve_Level_1_screen() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		for (int i = 0; i < 2000; i++) {
			try {
				commonElementsObj.iisScreenCloseBtn().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 click on the Credit Review Module")
	public void User_482_click_on_the_Credit_Review_Module() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.CreditReviewModule());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewModule().click();
				System.out.println("Succesfully !! Clicked on the Credit Review Module");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on the Search code Under Credit Review Module")
	public void User_482_click_on_the_Search_code_Under_Credit_Review_Module() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.CreditReviewSearchCode());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewSearchCode().click();
				System.out.println("Succesfully !! Clicked on the Credit Review Search code");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click enter the code under Credit Review Module")
	public void User_482_click_enter_the_code_under_Credit_Review_Module() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.CreditReviewSearchCode());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewSearchCode().clear();
				facilitiesManagmentObj.CreditReviewSearchCode().sendKeys(requestId);
				wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
				System.out.println("Progress icon Disappeard");
				System.out.println("Succesfully Enter on GLCode Feild");
				facilitiesManagmentObj.CreditReviewSearchCode().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click select the Retrived Rec under Credit Review Module")
	public void User_482_click_select_the_Retrived_Rec_under_Credit_Review_Module() {
		CR_Rec_Xpath = "//tr[@id = '1']//td[contains(text(), '" + requestId
				+ "')][@aria-describedby='requestFinancingGridTbl_Id_CSMRF00CV_fmsRequestFinancingVO.CODE']";

		for (int i = 1; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().doubleClick(driver.findElement(By.xpath(CR_Rec_Xpath)));
				System.out.println("Succesfully Selects the searched Rec");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Selects the searched Rec");
			}
		}
		wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
		System.out.println("Progress Bar Disappeard");
	}

	@And("User_482 click on the Credit Committe Recommendation")
	public void User_482_click_on_the_Credit_Committe_Recommendation() {
		waitHelper.waitForElementwithFluentwait(driver,
				facilitiesManagmentObj.CreditReviewCommitteeRecommendationsTab());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewCommitteeRecommendationsTab().click();
				System.out.println("Succesfully !! Clicked ");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on Recommedation bar Under Credit Committe Recommendation Tab")
	public void User_482_click_on_Recommedation_bar_Under_Credit_Committe_Recommendation_Tab() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.CreditReviewCrRecommendationsBar());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewCrRecommendationsBar().click();
				System.out.println("Succesfully !! Clicked ");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on the Add button under Recommendation Bar")
	public void User_482_click_on_the_Add_button_under_Recommendation_Bar() {
		waitHelper.waitForElementwithFluentwait(driver,
				facilitiesManagmentObj.CreditReviewCrRecommendationsBarAddIcon());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewCrRecommendationsBarAddIcon().click();
				System.out.println("Succesfully !! Clicked ");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on the Record")
	public void User_482_click_on_the_Record() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.CreditReviewCrRecommendationsRec());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewCrRecommendationsRec().click();
				System.out.println("Succesfully !! Clicked ");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on the Cr Recommendation DropDown")
	public void User_482_click_on_the_Cr_Recommendation_DropDown() {
		waitHelper.waitForElementwithFluentwait(driver,
				facilitiesManagmentObj.CreditReviewCrRecommendationsRecCRDropDown());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewCrRecommendationsRecCRDropDown().click();
				System.out.println("Succesfully !! Clicked ");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 select the Recommended for approval value from the DropDown")
	public void User_482_select_the_Recommended_for_approval_value_from_the_DropDown() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				facilitiesManagmentObj.CreditReviewCrRecommendationsRecCRDropDown());

		for (int i = 1; i < 200; i++) {
			try {
				seleniumActions.getDropDownHelper().SelectUsingVisibleText(
						facilitiesManagmentObj.CreditReviewCrRecommendationsRecCRDropDown(),
						testData.get("Credit Review Approval Value"));
				// facilitiesManagmentObj.CreditReviewCrRecommendationsRecCRDropDown(),
				// "Recommended for approval");;
				System.out.println("DropDown Value : " + testData.get("Credit Review Approval Value"));
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on the Credit Review button")
	public void User_482_click_on_the_Credit_Review_button() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.CreditReviewSubmitBtn());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.CreditReviewSubmitBtn().click();
				System.out.println("Succesfully !! Clicked ");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 click on the Approval Committe Recommendation module")
	public void User_482_click_on_the_Approval_Committe_Recommendation_module() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.ApprovalCommitteRecommendationModule());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.ApprovalCommitteRecommendationModule().click();
				System.out.println("Succesfully !! Clicked ");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^User_482 close the Credit Review$")
	public void user_482_close_the_Credit_Review() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		for (int i = 0; i < 2000; i++) {
			try {
				commonElementsObj.iisScreenCloseBtn().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 click on the Search code under Approval Committe Recommendation module")
	public void User_482_click_on_the_Search_code_under_Approval_Committe_Recommendation_module() {
		waitHelper.waitForElementwithFluentwait(driver,
				facilitiesManagmentObj.ApprovalCommitteRecommendationSearchCode());
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.ApprovalCommitteRecommendationSearchCode().click();
				System.out.println("Succesfully !! Clicked ");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 enter the code under Approval Committe Recommendation module")
	public void User_482_enter_the_code_under_Approval_Committe_Recommendation_module() {
		for (int i = 1; i < 200; i++) {
			try {
				facilitiesManagmentObj.ApprovalCommitteRecommendationSearchCode().clear();
				facilitiesManagmentObj.ApprovalCommitteRecommendationSearchCode().sendKeys(requestId);
				wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
				System.out.println("Progress icon Disappeard");
				System.out.println("Succesfully Enter on GLCode Feild");
				facilitiesManagmentObj.ApprovalCommitteRecommendationSearchCode().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 select the Retrived Rec under Approval Committe Recommendation module")
	public void User_482_select_the_Retrived_Rec_under_Approval_Committe_Recommendation_module() {
		ACR_Xpath = "//tr[@id = '1']//td[contains(text(), '" + requestId
				+ "')][@aria-describedby='requestFinancingGridTbl_Id_CSMRF00AC_fmsRequestFinancingVO.CODE']";

		for (int i = 1; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().doubleClick(driver.findElement(By.xpath(ACR_Xpath)));
				System.out.println("Succesfully Selects the searched Rec");
				break;
			} catch (Exception e) {
				System.out.println("Can't able to Selects the searched Rec");
			}
		}
//    	wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
//		System.out.println("Progress Bar Disappeard");
	}

	@And("User_482 vaidate the Status is Showing should be under Reviewed")
	public void User_482_vaidate_the_Status_is_Showing_should_be_under_Reviewed() {
		waitHelper.waitForElementwithFluentwait(driver, facilitiesManagmentObj.ApprovalCommitteRecommendationStatus());
		String ActualStatus = facilitiesManagmentObj.ApprovalCommitteRecommendationStatus().getAttribute("prevvalue");
		String GivenStatus = testData.get("Status");

		System.out.println(ActualStatus);
		if (ActualStatus.equalsIgnoreCase(GivenStatus)) {
			System.out.println("The Status is Correct : " + ActualStatus);
		}

		else if (facilitiesManagmentObj.ApprovalCommitteRecommendationStatusReviewed().isDisplayed()) {
			System.out.println("The Status is Correctly displayed : " + ActualStatus);
		}

		else {
			System.out.println("The Status is InCorrect : " + ActualStatus);
		}
	}

	//************************************************** End ****************************************************************
	
	//************************************************** Start ****************************************************************	
	//@AT_CG_010
	
	@And("User_482 click on the Apply Grading button under Customer and Grading Tab")
	public void User_482_click_on_the_Apply_Grading_button_under_Customer_and_Grading_Tab() {
	    waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.RFF_ApplyGradingBtn());
	    for(int i = 1 ; i<200 ; i++) {
	    	try {
	    		applicationForFinancialFacilityObj.RFF_ApplyGradingBtn().click();
	    		break;
			} catch (Exception e) {
			  if (i == 200) {
                 Assert.fail(e.getMessage());				
			}
			}
	    }
	}


	@And("User_482 click on the First CIF record under Customer Grading Tab")
	public void User_482_click_on_the_First_CIF_record_under_Customer_Grading_Tab() {
		  waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.RFF_FirstCifRecord());
		    for(int i = 1 ; i<200 ; i++) {
		    	try {
		    		applicationForFinancialFacilityObj.RFF_FirstCifRecord().click();
		    		break;
				} catch (Exception e) {
				  if (i == 200) {
	                 Assert.fail(e.getMessage());				
				}
				}
		    }
	}


	@And("User_482 enter the score for the First CIF Record under Customer Grading Tab")
	public void User_482_enter_the_score_for_the_First_CIF_Record_under_Customer_Grading_Tab() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.RFF_FirstCifInputField());
	    for(int i = 1 ; i<200 ; i++) {
	    	try {
	    		applicationForFinancialFacilityObj.RFF_FirstCifInputField().click();
	    		applicationForFinancialFacilityObj.RFF_FirstCifInputField().clear();
	    		applicationForFinancialFacilityObj.RFF_FirstCifInputField().sendKeys(testData.get("FirstScore"));
	    		applicationForFinancialFacilityObj.RFF_FirstCifInputField().sendKeys(Keys.TAB);
	    		break;
			} catch (Exception e) {
			  if (i == 200) {
                 Assert.fail(e.getMessage());				
			}
			}
	    }
	}


	@And("User_482 click on the Second CIF record under Customer Grading Tab")
	public void User_482_click_on_the_Second_CIF_record_under_Customer_Grading_Tab() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.RFF_SecondCifRecord());
	    for(int i = 1 ; i<200 ; i++) {
	    	try {
	    		applicationForFinancialFacilityObj.RFF_SecondCifRecord().click();
	    		break;
			} catch (Exception e) {
			  if (i == 200) {
                 Assert.fail(e.getMessage());				
			}
			}
	    }
	}


	@And("User_482 enter the score for the Second CIF Record under Customer Grading Tab")
	public void User_482_enter_the_score_for_the_Second_CIF_Record_under_Customer_Grading_Tab() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.RFF_SecondCifInputField());
	    for(int i = 1 ; i<200 ; i++) {
	    	try {
	    		applicationForFinancialFacilityObj.RFF_SecondCifInputField().click();
	    		applicationForFinancialFacilityObj.RFF_SecondCifInputField().clear();
	    		applicationForFinancialFacilityObj.RFF_SecondCifInputField().sendKeys(testData.get("SecondScore"));
	    		applicationForFinancialFacilityObj.RFF_SecondCifInputField().sendKeys(Keys.TAB);
	    		break;
			} catch (Exception e) {
			  if (i == 200) {
                 Assert.fail(e.getMessage());				
			}
			}
	    }
	}


	@And("User_482 click on the Third CIF record under Customer Grading Tab")
	public void User_482_click_on_the_Third_CIF_record_under_Customer_Grading_Tab() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.RFF_ThirdCifRecord());
	    for(int i = 1 ; i<200 ; i++) {
	    	try {
	    		applicationForFinancialFacilityObj.RFF_ThirdCifRecord().click();
	    		break;
			} catch (Exception e) {
			  if (i == 200) {
                 Assert.fail(e.getMessage());				
			}
			}
	    }
	}


	@And("User_482 enter the score for the Third CIF Record under Customer Grading Tab")
	public void User_482_enter_the_score_for_the_Third_CIF_Record_under_Customer_Grading_Tab() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.RFF_ThirdCifInputField());
	    for(int i = 1 ; i<200 ; i++) {
	    	try {
	    		applicationForFinancialFacilityObj.RFF_ThirdCifInputField().click();
	    		applicationForFinancialFacilityObj.RFF_ThirdCifInputField().clear();
	    		applicationForFinancialFacilityObj.RFF_ThirdCifInputField().sendKeys(testData.get("ThirdScore"));
	    		applicationForFinancialFacilityObj.RFF_ThirdCifInputField().sendKeys(Keys.TAB);
	    		break;
			} catch (Exception e) {
			  if (i == 200) {
                 Assert.fail(e.getMessage());				
			}
			}
	    }
	}
	
	
	
	//************************************************** End ****************************************************************
	
}
