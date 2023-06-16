package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
import pageobjects.CommonElements.Request_for_financing_Obj;
import resources.BaseClass;

public class Request_for_financing_steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	CSMLogin csmLogin = new CSMLogin(driver);
	Request_for_financing_Obj Request_for_financing_Obj = new Request_for_financing_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	CSMLogin CSMLogin = new CSMLogin(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	StringBuffer refID = new StringBuffer();
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path, "WIFAK_Application_TestData", "Data Set ID");
	Map<String, String> testData;
	ExcelData fmsTransactionsExcelData1 = new ExcelData(path, "REQUEST_FOR_FINANCIN", "Data Set ID");
	Map<String, String> testData1;
	ExcelData fmsTransactionsExcelData2 = new ExcelData(path, "Baj Application", "Data Set ID");
	Map<String, String> testData2;
	ExcelData fmsTransactionsExcelData3 = new ExcelData(path, "Collateral Management", "Data Set ID");
	Map<String, String> testData3;

	@And("^Click Request for financin$")
	public void click_request_for_financin() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.RequestForFinancin());
		clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.RequestForFinancin());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Scroolinto_Click_RequestForFinancin());
		Request_for_financing_Obj.RequestForFinancin().click();

	}

	@And("^Click Request for financing$")
	public void click_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.RequestForFinancing());
		clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.RequestForFinancing());
		Request_for_financing_Obj.RequestForFinancing().click();
	}

	@Given("User update test data for test case no 669589")
	public void User_update_test_data_for_test_case_no_669589() {
		testData1 = fmsTransactionsExcelData1.getTestdata("AT_RF_021");
	}
	
	@And("^Goto maintenace$")
	public void goto_maintenace() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.maintenance_under_RequestForFinancing());
		clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.maintenance_under_RequestForFinancing());
		Request_for_financing_Obj.maintenance_under_RequestForFinancing().click();
	}

	@And("^Select Reason For Submission$")
	public void select_reason_for_submission() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Select_reason_for_submission());
		clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Select_reason_for_submission());
//		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.Select_reason_for_submission(),
//				"Modify Request");
		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.Select_reason_for_submission(),testData1.get("Reason For Submission"));

	}

	@And("^Enter value on Existing Facility No$")
	public void enter_value_on_existing_facility_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.enter_Existing_Facility_No());
		clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.enter_Existing_Facility_No());
		Request_for_financing_Obj.enter_Existing_Facility_No().click();
		//Request_for_financing_Obj.enter_Existing_Facility_No().sendKeys("1399");
		Request_for_financing_Obj.enter_Existing_Facility_No().sendKeys(testData1.get("Existing Facility"));
		Request_for_financing_Obj.Afertenter_Existing_Facility_No_ClickSearch().click();
//				for (int i = 0; i <= 300; i++) {
//					if (!(Request_for_financing_Obj.Afertenter_Existing_Facility_No_ClickSearch().getAttribute("prevvalue").isBlank())) {
//						break;
//					}
//				}
	}

	@And("^Click group limit$")
	public void click_group_limit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Afertenter_search_Existing_Facility_NoClick_Grouplimit());
		clicksAndActionsHelper
				.moveToElement(Request_for_financing_Obj.Afertenter_search_Existing_Facility_NoClick_Grouplimit());

		for (int i = 0; i < 300; i++) {
			try {
				Request_for_financing_Obj.Afertenter_search_Existing_Facility_NoClick_Grouplimit().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Click add button on group limit$")
	public void click_add_button_group_limit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.ScrollTo_gruoplimit_AddButton());
		// clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.ScrollTo_gruoplimit_AddButton());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.ScrollTo_gruoplimit_AddButton());

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Addbutton_onGrouplimit());
		// clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_Addbutton_onGrouplimit());

		for (int i = 0; i < 300; i++) {
			try {
				Request_for_financing_Obj.Click_Addbutton_onGrouplimit().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Enter first GroupID$")
	public void enter_first_groupid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit());
		// clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit());

		for (int i = 0; i < 300; i++) {
			try {
				Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit().click();
				//Request_for_financing_Obj.Click_In_and_enter_firstGroupID_onGroupLimit().sendKeys("1");
				Request_for_financing_Obj.Click_In_and_enter_firstGroupID_onGroupLimit().sendKeys(testData1.get("First GroupID"));

				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Enter first Group limit$")
	public void enter_first_group_limit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit());
		clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit());
		Request_for_financing_Obj.Click_and_enter_firstlimit_onGroupLimit().click();
		//Request_for_financing_Obj.Click_and_enter_firstlimit_onGroupLimit().sendKeys("2000");
		Request_for_financing_Obj.Click_and_enter_firstlimit_onGroupLimit().sendKeys(testData1.get("First Group Limit"));


	}

	@And("^Enter first Group name$")
	public void enter_first_group_name() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_and_enter_FirstGroupname_onGroupLimit());
		Request_for_financing_Obj.Click_and_enter_FirstGroupname_onGroupLimit().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_ok_on_error_screen());
		Request_for_financing_Obj.Click_ok_on_error_screen().click();

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_and_enter_FirstGroupname_onGroupLimit());
		Request_for_financing_Obj.Click_and_enter_FirstGroupname_onGroupLimit().click();

//			for (int i = 0; i <= 300; i++) {
//				if (!(Request_for_financing_Obj.Click_and_enter_firstlimit_onGroupLimit().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			}
	//	Request_for_financing_Obj.Click_In_and_enter_FirstGroupname_onGroupLimit().sendKeys("dq");
		Request_for_financing_Obj.Click_In_and_enter_FirstGroupname_onGroupLimit().sendKeys(testData1.get("First Group Name"));
	}

	@And("^Enter Second GroupID$")
	public void enter_second_groupid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Addbutton_onGrouplimit());
		// clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_Addbutton_onGrouplimit());

		for (int i = 0; i < 300; i++) {
			try {
				Request_for_financing_Obj.Click_Addbutton_onGrouplimit().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_and_enter_secondGroupID_onGroupLimit());
		clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_and_enter_secondGroupID_onGroupLimit());
		Request_for_financing_Obj.Click_and_enter_secondGroupID_onGroupLimit().click();
		//Request_for_financing_Obj.Click_In_and_enter_secondGroupID_onGroupLimit().sendKeys("2");
		Request_for_financing_Obj.Click_In_and_enter_secondGroupID_onGroupLimit().sendKeys(testData1.get("Second GroupID"));

	}

	@Then("^Enter Second Group limit$")
	public void enter_second_group_limit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Afterenter_value_on_SecondLimit_clickout());
		// clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Afterenter_value_on_SecondLimit_clickout());
		Request_for_financing_Obj.Click_and_enter_secondlimit_onGroupLimit().click();
		//Request_for_financing_Obj.Click_and_enter_secondlimit_onGroupLimit().sendKeys("10000");
		Request_for_financing_Obj.Click_and_enter_secondlimit_onGroupLimit().sendKeys(testData1.get("Second Group Limit"));
		Request_for_financing_Obj.Afterenter_value_on_SecondLimit_clickout().click();
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.CannotPoceed_After_enterHighvalue());
		Assert.assertEquals(true, Request_for_financing_Obj.CannotPoceed_After_enterHighvalue().isDisplayed());

	}

	////////// @664435

	@Given("^Login into CSM Application$")
	public void login_into_fms_application() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
		CSMLogin.loginIntoCSMApplication(configFileReader.getCSMApplicationUserType());
	}

	@And("^Click Request on FMS Core$")
	public void click_request_on_fms_core() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_request_OnCSM());
		Request_for_financing_Obj.Click_request_OnCSM().click();
	}

//	    @And("^Click Request Application under Request$")
//	    public void click_request_application_under_request() throws Throwable {
//	    	
//	    }

	@And("^Click request management under request$")
	public void click_request_management_under_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Request_management_under_request());
		Request_for_financing_Obj.Request_management_under_request().click();
	}

	@And("^Click management process branch under request management$")
	public void click_management_process_branch_under_request_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_Management_Process_Branch_under_Request_management());
		Request_for_financing_Obj.Click_Management_Process_Branch_under_Request_management().click();

	}

	

	@And("^Select first approve status detail$")
	public void select_first_approve_status_detail() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.DoubleClickOne_Approve_status());

		for (int i = 0; i < 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.DoubleClickOne_Approve_status());
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.get_approved_reqNo());

	}
	
	@And("^Click process button in management process branch tab$")
	public void click_process_button_in_management_process_branch_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.get_approved_reqNo());
		RequestNo = Request_for_financing_Obj.get_approved_reqNo().getAttribute("value");

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_ProcessButton_OnManagement_process_branch());
		Request_for_financing_Obj.Click_ProcessButton_OnManagement_process_branch().click();
		System.out.println(RequestNo);
	}

	@Given("User update test data for test case no 664435")
	public void user_update_test_data_for_test_case_no_664435() {
		testData2 = fmsTransactionsExcelData2.getTestdata("AT_RF_022");
	}

	
	@And("^Click on baj application$")
	public void click_on_baj_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_baj_application());
		Request_for_financing_Obj.Click_baj_application().click();
	}

	@And("^Click Application Under baj application$")
	public void click_application_under_baj_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_application_under_baj_application());
		Request_for_financing_Obj.Click_application_under_baj_application().click();
	}

	@And("^Click Application For Financial Facilities under application$")
	public void click_application_for_financial_facilities_under_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_Application_For_Financial_Facilities_under_application());
		Request_for_financing_Obj.Click_Application_For_Financial_Facilities_under_application().click();
	}

	@And("^Click Maintenance Under Application For Financial Facilities$")
	public void click_maintenance_under_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_maintenance_under_Application_For_Financial_Facilities());
		Request_for_financing_Obj.Click_maintenance_under_Application_For_Financial_Facilities().click();
	}

	@And("^Click Search button on Maintenance tab$")
	public void click_search_button_on_maintenance_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_searchOn_maintenance());
		Request_for_financing_Obj.Click_searchOn_maintenance().click();
	}
	String RequestNo;
	@And("^Enter Request No$")
	public void enter_request_no() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.Scroll_into_reqNo());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Scroll_into_reqNo());
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Enter_req_no());
		Request_for_financing_Obj.Enter_req_no().click();
		Request_for_financing_Obj.Enter_req_no().sendKeys(RequestNo);
		Request_for_financing_Obj.Enter_req_no().sendKeys(Keys.ENTER);
	}

	@And("^Double ClickOn Request no$")
	public void double_clickon_request_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.DoubleClickOn_req_no());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.DoubleClickOn_req_no());

	}

	@And("^Enter anything on Additional Reference$")
	public void enter_anything_on_additional_reference() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.AddAny_AdditionalReference());
		Request_for_financing_Obj.AddAny_AdditionalReference().sendKeys("11235");
	}

	@And("^Click validate button on down$")
	public void click_validate_button_on_down() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.Scrolldown_to_click_ValidateButton());

		for (int i = 0; i < 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Scrolldown_to_click_ValidateButton());
				Request_for_financing_Obj.click_ValidateButton_afterScroll().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.click_ValidateButton_afterScroll());

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Popup_msg());
		Request_for_financing_Obj.Popup_msg().click();
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.ClickYes_onPostApproval_screen());
		Request_for_financing_Obj.ClickYes_onPostApproval_screen().click();
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Success_Screen_AfterValidate());
		Assert.assertEquals(true, Request_for_financing_Obj.Success_Screen_AfterValidate().isDisplayed());

	}

	// @652870
	@Given("User update test data for test case no 652870")
	public void user_update_test_data_for_test_case_no_652870(){
		testData1 = fmsTransactionsExcelData1.getTestdata("AT_RF_052");
	    
	}
	
	@And("^Click Collateral Management$")
	public void click_collateral_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Collateral_Management());
		Request_for_financing_Obj.Click_Collateral_Management().click();
	}

	@And("^Click maintenance under Collateral Management$")
	public void click_maintenance_under_collateral_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_maintenance_under_Collateral_Management());
		Request_for_financing_Obj.Click_maintenance_under_Collateral_Management().click();
	}

	@And("^Click search on maintenance screen$")
	public void click_search_on_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_search_on_maintenance_screen());
		Request_for_financing_Obj.Click_search_on_maintenance_screen().click();

	}

	@And("^Click and enter CIF$")
	public void click_and_enter_cif() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Click_and_enter_CIF());
		Request_for_financing_Obj.Click_Click_and_enter_CIF().click();
		//Request_for_financing_Obj.Click_Click_and_enter_CIF().sendKeys("8");
		Request_for_financing_Obj.Click_Click_and_enter_CIF().sendKeys(testData3.get("CIF"));
		Request_for_financing_Obj.Click_Click_and_enter_CIF().sendKeys(Keys.ENTER);

	}

	@And("^After enter CIF find if any alphabetic in ID number$")
	public void after_enter_cif_find_if_any_alphabetic_in_id_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.After_enter_CIF_find_if_any_alphabetic_in_ID_number());
		String alp = Request_for_financing_Obj.After_enter_CIF_find_if_any_alphabetic_in_ID_number()
				.getAttribute("title");
		boolean flag1 = alp.matches(".*[a-zA-Z]+.*");
		assertEquals(flag1, true);

		System.out.println("done");
	}

	// @652912
	@Given("User update test data for test case no 652912")
	public void user_update_test_data_for_test_case_no_652912() {
	    //AT_RF_053
		
	}

	@And("^Click Facilities Management under WIFAK APPLICATION$")
	public void click_facilities_management_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_Facilities_Management_under_WIFAK_APPLICATION());
		Request_for_financing_Obj.Click_Facilities_Management_under_WIFAK_APPLICATION().click();
	}

	@And("^Click cancel under Facilities Management$")
	public void click_cancel_under_facilities_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_cancel_under_Facilities_Management());
		Request_for_financing_Obj.Click_cancel_under_Facilities_Management().click();
	}

	@And("^Select the existing record$")
	public void select_the_facilities_and_cancel() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Clearsearch_on_cancel_Screen());
		Request_for_financing_Obj.Click_Clearsearch_on_cancel_Screen().click();
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.DoubleClick_select_firstRecord());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.DoubleClick_select_firstRecord());

	}

	@And("^Cancel the record$")
	public void cancel_the_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.After_selectRecord_Click_Cancel());
		Request_for_financing_Obj.After_selectRecord_Click_Cancel().click();
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_okOn_Warrning_popup());
		Request_for_financing_Obj.Click_okOn_Warrning_popup().click();
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Success_Popup());
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.limitDetailsValidateSuccessMsg());
		String SuccessMsg = Request_for_financing_Obj.limitDetailsValidateSuccessMsg().getText();
		String substring = SuccessMsg.substring(11, 15);
		refID.append(substring);
		System.err.println("Reference Number: " + refID);
		Request_for_financing_Obj.Success_Popup().click();

	}

	@And("^Click approve reject cancel under WIFAK APPLICATION$")
	public void click_approve_reject_cancel_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_approve_reject_cancel_under_WIFAK_APPLICATION());
		Request_for_financing_Obj.Click_approve_reject_cancel_under_WIFAK_APPLICATION().click();
	}

	@And("^Select the record$")
	public void select_the_record() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Search_cancel_code_onApproveCancel());
		Request_for_financing_Obj.Search_cancel_code_onApproveCancel().sendKeys(refID);
		Request_for_financing_Obj.Search_cancel_code_onApproveCancel().sendKeys(Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.DoubleClick_select_firstRecord_on_Click_approve_reject_cancel());
		clicksAndActionsHelper
				.doubleClick(Request_for_financing_Obj.DoubleClick_select_firstRecord_on_Click_approve_reject_cancel());

	}

	@And("^Click approve cancel button on approve reject cancel Screen$")
	public void click_approve_cancel_button_on_approve_reject_cancel_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_approveCancel_Button());
		Request_for_financing_Obj.Click_approveCancel_Button().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_okOn_Warrning_popup());
		Request_for_financing_Obj.Click_okOn_Warrning_popup().click();

		for (int i = 0; i < 500; i++) {
			try {

				Request_for_financing_Obj.Do_youWantCancel_Warnimg().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Success_Popup());
		Request_for_financing_Obj.Success_Popup().click();
	}

	@And("^Click maintenance under WIFAK APPLICATION$")
	public void click_maintenance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_maintence_under_WIFAK_APPLICATION());

		Request_for_financing_Obj.Click_maintence_under_WIFAK_APPLICATION().click();

	}

	@And("^Select the record on maintenance screen$")
	public void select_the_record_on_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_Clearsearch_on_maintenceScreen());
		Request_for_financing_Obj.Click_Clearsearch_on_maintenceScreen().click();

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.search_approvecancelCode_OnMainteance());

		Request_for_financing_Obj.search_approvecancelCode_OnMainteance().sendKeys(refID);

		Request_for_financing_Obj.search_approvecancelCode_OnMainteance().sendKeys(Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.DoubleClick_select_firstRecord_on_maintenace());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.DoubleClick_select_firstRecord_on_maintenace());
		Thread.sleep(5000);
	}

	@Then("^Check the Status its on cancel$")
	public void check_the_status_its_on_cancel() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Check_the_Record_Status());
		String check = "";
		for (int i = 0; i <= 300; i++) {
			check = Request_for_financing_Obj.Check_the_Record_Status().getAttribute("value");
			if (check.equalsIgnoreCase("Cancelled")) {
				break;
			}
		}

		Assert.assertEquals(check, "Cancelled");
	}

	// @636958
	@Given("User update test data for test case no 636958")
	public void user_update_test_data_for_test_case_no_636958() {
	    
	}

	@And("^click the reason for submission search box$")
	public void click_the_reason_for_submission_search_box() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.reasonforsubmisson());
		// Request_for_financing_Obj.SelectUsingVisibleText(Request_for_financing_Obj.reasonforsubmisson(),
		// "New Request");
		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.Select_reason_for_submission(), "New Request");
	}

	@And("^click the customer search box$")
	public void click_the_customer_search_box() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.customersearchbox());
		Request_for_financing_Obj.customersearchbox().click();
		Request_for_financing_Obj.customersearchbox().sendKeys("727");
		Request_for_financing_Obj.customersearchbox().sendKeys(Keys.TAB);
		Thread.sleep(5000);
	}

	@And("^click the facility type details$")
	public void click_the_facility_type_details() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.facilitytypedetails());

		for (int i = 0; i <= 300; i++) {
			try {
				Request_for_financing_Obj.facilitytypedetails().click();
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Enter the facility type code under facility type$")
	public void enter_the_facility_type_code_under_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.facilitytypedetailssearchbox());
		Request_for_financing_Obj.facilitytypedetailssearchbox().sendKeys("221");
		Request_for_financing_Obj.facilitytypetouch().click();

	}

	@And("^Enter the total limit under global limit$")
	public void enter_the_total_limit_under_global_limit() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Request_for_financing_Obj.totallimitsearchbox());
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Request_for_financing_Obj.totallimitsearchbox().sendKeys("10000");
		Request_for_financing_Obj.facilitytypetouch().click();

	}

	@And("^Click the Disbursement Sublimit under maintenance screen$")
	public void click_the_disbursement_sublimit_under_maintenance_screen() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Request_for_financing_Obj.disbursementsublimit());
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.disbursementsublimit());
		Request_for_financing_Obj.disbursementsublimit().click();
	}

	@And("^Add the limits under Disbursement Sublimit$")
	public void add_the_limits_under_disbursement_sublimit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.disbursementsublimitaddbutton());
		Request_for_financing_Obj.disbursementsublimitaddbutton().click();

	}

	@And("^Add the product class values in product searchbox$")
	public void add_the_product_class_values_in_product_searchbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.productclasssearchbox());
		Request_for_financing_Obj.productclasssearchbox().sendKeys("1");
		Request_for_financing_Obj.productclasssearchbox().sendKeys(Keys.TAB);
		// Request_for_financing_Obj.productclass().click();
		for (int i = 0; i < 200; i++) {
			try {
				if (!Request_for_financing_Obj.product_Class_Name_Validation().getAttribute("prevvalue").isBlank()
						|| !Request_for_financing_Obj.product_Class_Name_Validation().getAttribute("prevvalue")
								.isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^Change the month in tenure$")
	public void change_the_month_in_tenure() throws Throwable {
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.addbutton());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.tenure());
				clicksAndActionsHelper.clickOnElement(Request_for_financing_Obj.tenure());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				Request_for_financing_Obj.tenure().clear();

				for (int j = 0; j < 200; j++) {
					try {
						if (Request_for_financing_Obj.Click_okOn_lessvalue().isDisplayed()) {
							Request_for_financing_Obj.Click_okOn_lessvalue().click();
						}
						break;
					} catch (Exception e) {
					}
				}
				Request_for_financing_Obj.tenure().sendKeys("12");
				Request_for_financing_Obj.tenure().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// Request_for_financing_Obj.select_the_moths_in_tenure());
				DropDownHelper.SelectUsingVisibleValue(Request_for_financing_Obj.select_the_moths_in_tenure(),
						"Months");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Add the Margin values in Margin$")
	public void add_the_margin_values_in_margin() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				// JavascriptHelper.scrollIntoView(Request_for_financing_Obj.marginsearchbox());
				Request_for_financing_Obj.marginsearchbox().clear();
				Request_for_financing_Obj.marginsearchbox().sendKeys("1", Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    	for (int i = 0; i <= 300; i++) {
//				if (!(Request_for_financing_Obj.marginsearchbox().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			}
	}

	@And("^Add all the Above limit values$")
	public void add_all_the_above_limit_values() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.addbutton());
		Request_for_financing_Obj.addbutton().click();

		for (int i = 0; i < 200; i++) {
			try {
				if (Request_for_financing_Obj.please_wait_server_loading().isDisplayed()) {
					Request_for_financing_Obj.please_wait_server_loading().click();
					waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.addbutton());
					Request_for_financing_Obj.addbutton().click();
					break;
				}
			} catch (Exception e) {

			}
		}
//	    	if(Request_for_financing_Obj.please_wait_server_loading().isDisplayed()) {
//	    		Request_for_financing_Obj.please_wait_server_loading().click();
//	    		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.addbutton());
//		    	Request_for_financing_Obj.addbutton().click();
//	    	}
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.confirmsavepopupokbutton());

		for (int i = 0; i < 200; i++) {
			try {
				if (Request_for_financing_Obj.confirmsavepopupokbutton().isDisplayed()) {
					Request_for_financing_Obj.confirmsavepopupokbutton().click();
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^Save all the values when limits are add$")
	public void save_all_the_values_when_limits_are_add() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.savebutton());
		Request_for_financing_Obj.savebutton().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
		Request_for_financing_Obj.confirmsavepopupokbutton().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Success_Popup());
		Request_for_financing_Obj.Success_Popup().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.savebutton());
		Request_for_financing_Obj.savebutton().click();
	}

	@And("^Confirm the popup menu when all the limits are saved$")
	public void confirm_the_popup_menu_when_all_the_limits_are_saved() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.Click_okOn_Warrning_popup());
		Request_for_financing_Obj.confirmsavepopupokbutton().click();
		// requestID = Request_for_financing_Obj.confirmsavepopupokbutton()

	}

	@And("^Click the final save popup message$")
	public void click_the_final_ok_popup_message() throws Throwable {

		for (int i = 0; i < 200; i++) {
			try {
				if (Request_for_financing_Obj.confirmsavepopupokbutton().isDisplayed()) {
					Request_for_financing_Obj.confirmsavepopupokbutton().click();
					break;
				}
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavesuccessfullypopup());
		Request_for_financing_Obj.confirmsavesuccessfullypopup().click();

	}

	@And("^Click Repayment plan button in maintance screen$")
	public void click_repayment_plan_button_in_maintance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_RepaymentPlan());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Click_RepaymentPlan());
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_RepaymentPlan());
		Request_for_financing_Obj.Click_RepaymentPlan().click();
	}

	@And("^Click Create Schedule button$")
	public void click_create_schedule_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_Create_Schedule_InRepaymentPlan());
		Request_for_financing_Obj.Click_Create_Schedule_InRepaymentPlan().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
		for (int i = 0; i <= 300; i++) {
			try {
				Request_for_financing_Obj.confirmsavepopupokbutton().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

//	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavesuccessfullypopup());
//	    	Request_for_financing_Obj.confirmsavesuccessfullypopup().click();
//	    	
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_saveButton_In_RepaymentPlan());
		for (int i = 0; i <= 300; i++) {
			try {
				Request_for_financing_Obj.Click_saveButton_In_RepaymentPlan().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
		Request_for_financing_Obj.confirmsavepopupokbutton().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavesuccessfullypopup());
		Request_for_financing_Obj.confirmsavesuccessfullypopup().click();

	}

	@And("^Click the validate button when all the values are saved$")
	public void click_the_validate_button_when_all_the_values_are_saved() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.validatebutton());
		Request_for_financing_Obj.validatebutton().click();

	}

	@And("^Confirm the validate popup menu$")
	public void confirm_the_validate_popup_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmvalidatepopupokbutton());
		Request_for_financing_Obj.confirmvalidatepopupokbutton().click();

	}

	@And("^Click the final validate popup$")
	public void click_the_final_validate_popup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.validatesuccessfullypopup());

		for (int i = 0; i <= 300; i++) {
			try {
				Request_for_financing_Obj.validatesuccessfullypopup().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 200; i++) {
			try {
				if (Request_for_financing_Obj.SendAlert_pop().isDisplayed()) {
					Request_for_financing_Obj.SendAlert_pop().click();
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^Click the Approve level1 screen under request for financing$")
	public void click_the_approve_level1_screen_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.approvelevel1());
		Request_for_financing_Obj.approvelevel1().click();

		for (int i = 0; i < 200; i++) {
			try {
				if (Request_for_financing_Obj.confirmsavepopupokbutton().isDisplayed()) {
					Request_for_financing_Obj.confirmsavepopupokbutton().click();
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^Select the record in Approve Screen1$")
	public void select_the_record_in_Approve_Screen1() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// Request_for_financing_Obj.Click_clearsearch_inApproveLev_1());
				Request_for_financing_Obj.Click_clearsearch_inApproveLev_1().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// Request_for_financing_Obj.doubleClick_and_select_record_inApproveLev_1());
				if (Request_for_financing_Obj.doubleClick_and_select_record_inApproveLev_1().isDisplayed()) {
					clicksAndActionsHelper
							.doubleClick(Request_for_financing_Obj.doubleClick_and_select_record_inApproveLev_1());
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Reject the record in Approve level1$")
	public void reject_the_record_in_approve_level1() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.approve_buttton_inApproveLev_1());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.approve_buttton_inApproveLev_1());

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.select_decision_inApproveLev_1());

		for (int i = 0; i <= 300; i++) {
			try {
				DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.select_decision_inApproveLev_1(),
						"Reject");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.approve_buttton_inApproveLev_1());
		Request_for_financing_Obj.approve_buttton_inApproveLev_1().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmvalidatepopupokbutton());
		Request_for_financing_Obj.confirmvalidatepopupokbutton().click();
	}

	@And("^enter the reason for rejection$")
	public void enter_the_reason_for_rejection() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.click_addButton_On_reasonForRejection());
		Request_for_financing_Obj.click_addButton_On_reasonForRejection().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.select_firstRow_in_RejectReason());
		Request_for_financing_Obj.select_firstRow_in_RejectReason().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.select_reasonForRejection());
		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.select_reasonForRejection(), "TEST");

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Type_detailsIn_reasonForRejection());
		Request_for_financing_Obj.Type_detailsIn_reasonForRejection().sendKeys("dc");

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.clickOk_reasonForRejection());
		Request_for_financing_Obj.clickOk_reasonForRejection().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.validatesuccessfullypopup());
		Request_for_financing_Obj.validatesuccessfullypopup().click();

	}

	@And("^Click Reopen Rejected Applications Under request for financing$")
	public void click_reopen_rejected_applications_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_Reopen_Rejected_Applications_Under_request_for_financing());
		Request_for_financing_Obj.Click_Reopen_Rejected_Applications_Under_request_for_financing().click();
	}

	@And("^Click mainteance under Reopen Rejected Applications$")
	public void click_mainteance_under_reopen_rejected_applications() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_mainteance_under_Reopen_Rejected_Applications());
		for (int i = 0; i <= 300; i++) {
			try {
				Request_for_financing_Obj.Click_mainteance_under_Reopen_Rejected_Applications().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Select the reopen record mainteance under Reopen Rejected Applications$")
	public void select_the_reopen_record_mainteance_under_reopen_rejected_applications() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications());
		Request_for_financing_Obj.Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications().click();

		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.DoubleClick_Select_firstRecord_Reopen_Rejected_Applications());

		for (int i = 0; i <= 600; i++) {
			try {
				clicksAndActionsHelper.doubleClick(
						Request_for_financing_Obj.DoubleClick_Select_firstRecord_Reopen_Rejected_Applications());
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Reopen the rejected record$")
	public void reopen_the_rejected_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_reopen_button());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Click_reopen_button());

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_reopen_button());
		Request_for_financing_Obj.Click_reopen_button().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmvalidatepopupokbutton());
		Request_for_financing_Obj.confirmvalidatepopupokbutton().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Success_Popup());
		Request_for_financing_Obj.Success_Popup().click();

	}

//	    @And("^Take the reopen record under mainteance$")
//	    public void Take_the_reopen_record_under_mainteance() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Clearsearch_on_maintenceScreen());
//	    	Request_for_financing_Obj.Click_Clearsearch_on_maintenceScreen().click();
//	    	
//	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.DoubleClick_openRecord_in_mainteance());
//	    	clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.DoubleClick_openRecord_in_mainteance());
//	    	
//	    }

	@And("^Click Approve rejection under Reopen Rejected Applications$")
	public void click_approve_rejection_under_reopen_rejected_applications() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_approve_reject_Reopen_Rejected_Applications());
		Request_for_financing_Obj.Click_approve_reject_Reopen_Rejected_Applications().click();

	}

	@And("^Select the rejected record in  Reopen Rejected Applications$")
	public void select_the_rejected_record_in_reopen_rejected_applications() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_clear_search_in_approve_reject());
		Request_for_financing_Obj.Click_clear_search_in_approve_reject().click();

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.DoubleClick_Select_firstRecord_Reopen_Rejected_Applications());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(
						Request_for_financing_Obj.DoubleClick_Select_firstRecord_Reopen_Rejected_Applications());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

//	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_clear_search_in_approve_reject());
//	    	Request_for_financing_Obj.Click_clear_search_in_approve_reject().click();

	}

	@And("^Approve the reopen request$")
	public void approve_the_reopen_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_approve_in_approve_reject());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Click_approve_in_approve_reject());

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_approve_in_approve_reject());
		Request_for_financing_Obj.Click_approve_in_approve_reject().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
		Request_for_financing_Obj.confirmvalidatepopupokbutton().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Success_Popup());
		Request_for_financing_Obj.Success_Popup().click();
	}

	@And("^click mainteance under request for financing$")
	public void click_mainteance_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_mainteance_under_request_for_financing());
		Request_for_financing_Obj.Click_mainteance_under_request_for_financing().click();

	}

	@And("^select the record in the mainteance under request for financing$")
	public void select_the_record_in_the_mainteance_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_searchIn_maintenance_under_request_for_financing());
		Request_for_financing_Obj.Click_searchIn_maintenance_under_request_for_financing().click();

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_ClearsearchIn_maintenance_under_request_for_financing());
		Request_for_financing_Obj.Click_ClearsearchIn_maintenance_under_request_for_financing().click();

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.select_recordIn_maintenance_under_request_for_financing());
		clicksAndActionsHelper
				.doubleClick(Request_for_financing_Obj.select_recordIn_maintenance_under_request_for_financing());

	}

	@And("^Select the exesting product class$")
	public void select_the_exesting_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.double_click_and_select_existing_productClass());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.double_click_and_select_existing_productClass());

	}

	@And("^change the months$")
	public void change_the_months() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.click_editbutton_in_exitstingproduct_Class());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.click_editbutton_in_exitstingproduct_Class());

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.tenure());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.tenure());
		Request_for_financing_Obj.tenure().sendKeys("5");

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.click_editbutton_in_exitstingproduct_Class());
		Request_for_financing_Obj.click_editbutton_in_exitstingproduct_Class().click();

		if (Request_for_financing_Obj.please_wait_server_loading().isDisplayed()) {
			waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.please_wait_server_loading());
			Request_for_financing_Obj.please_wait_server_loading().click();
		}

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.click_editbutton_in_exitstingproduct_Class());
		Request_for_financing_Obj.click_editbutton_in_exitstingproduct_Class().click();
	}

	@Then("^After Changes save it$")
	public void after_changes_save_it() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_save_afterEdit_productClass());
		Request_for_financing_Obj.Click_save_afterEdit_productClass().click();

	}

	////////// @123

	@And("^Search the value in approve1$")
	public void search_the_value_in_approve1() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Search_value_on_approve1());
//	    	Request_for_financing_Obj.Search_value_on_approve1().click();
//	    	Request_for_financing_Obj.Search_value_on_approve1().sendKeys("3988");
//	    	Request_for_financing_Obj.Search_value_on_approve1().sendKeys(Keys.ENTER);

		for (int i = 0; i <= 300; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// Request_for_financing_Obj.Click_clearsearch_inApproveLev_1());
				Request_for_financing_Obj.Click_clearsearch_inApproveLev_1().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// Request_for_financing_Obj.doubleClick_and_select_record_inApproveLev_1());
				if (Request_for_financing_Obj.doubleClick_and_select_record_inApproveLev_1().isDisplayed()) {
					clicksAndActionsHelper
							.doubleClick(Request_for_financing_Obj.doubleClick_and_select_record_inApproveLev_1());
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Select the record in approve1$")
	public void select_the_record_in_approve1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Select_value_on_approve1());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.Select_value_on_approve1());

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_Customer_Grading_Recommendations_For_reject());
		for (int i = 0; i <= 500; i++) {
			try {
				Request_for_financing_Obj.Click_Customer_Grading_Recommendations_For_reject().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	// @749113
	@And("^Click Grading under Wifak Application$")
	public void click_grading_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_Grading_under_Wifak_Application());
		Request_for_financing_Obj.Click_Grading_under_Wifak_Application().click();

	}

	@And("^Click Maintenance under Grading$")
	public void click_maintenance_under_grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Maintenance_under_Grading());
		Request_for_financing_Obj.Click_Maintenance_under_Grading().click();

	}

	// @749102
	@Given("Click Parameters in MTS")
	public void click_parameters_in_mts() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Parameters_in_MTS());
		Request_for_financing_Obj.Click_Parameters_in_MTS().click();
	}

	@Given("Click Batch under parameters")
	public void click_batch_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Batch_under_parameters());
		Request_for_financing_Obj.Click_Batch_under_parameters().click();

	}

	@Given("Click Maintenance underBatch")
	public void click_maintenance_under_batch() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Maintenance_underBatch());
		Request_for_financing_Obj.Click_Maintenance_underBatch().click();
	}

	@Given("Enter additionalReference")
	public void enter_additional_reference() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Enter_additionalReference());
		Request_for_financing_Obj.Enter_additionalReference().sendKeys("abcdefghia");

	}

	@Given("Enter briefName in main information")
	public void enter_brief_name_in_main_information() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Enter_briefName());
		Request_for_financing_Obj.Enter_briefName().sendKeys("abcdefghia");

	}

	@Given("Enter Long name in main information")
	public void enter_long_name_in_main_information() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Enter_LongName());
		Request_for_financing_Obj.Enter_LongName().sendKeys("Limiterdrrgm abcdefghia");

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Enter_Menu_Reference());
		Request_for_financing_Obj.Enter_Menu_Reference().sendKeys("abcdefghallia");

	}

	@Given("Select batchPeriodicity in main information")
	public void select_batch_periodicity_in_main_information() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Select_batchPeriodicity());
		for (int i = 0; i <= 300; i++) {
			try {
				DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.Select_batchPeriodicity(), "Daily");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Request_for_financing_Obj.Select_batchPeriodicity().sendKeys(Keys.ENTER);

	}

	@Given("Check head office in batch details")
	public void check_head_office_in_batch_details() {
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.Click_dropdown_in_oracalBAJ());

		for (int i = 0; i <= 500; i++) {
			try {
				Request_for_financing_Obj.Click_dropdown_in_oracalBAJ().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.cHECK_HEADOFFICE());

		for (int i = 0; i <= 500; i++) {
			try {
				Request_for_financing_Obj.cHECK_HEADOFFICE().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Click FC limit in Facility Management")
	public void click_fc_limit_in_facility_management() {
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.Scroll_into_others());

		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Scroll_into_others());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_dropDown_in_Facility_Management());
		Request_for_financing_Obj.Click_dropDown_in_Facility_Management().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_101_in_Facility_Management());
		Request_for_financing_Obj.Click_101_in_Facility_Management().click();

	}

	@Given("Click save button after adding details in mainteance")
	public void click_save_button_after_adding_details_in_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_save_button_in_mainteance_MTS());
		Request_for_financing_Obj.Click_save_button_in_mainteance_MTS().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_okOn_save_pop());
		Request_for_financing_Obj.Click_okOn_save_pop().click();

	}

	@Given("Click Approve under Batch")
	public void click_approve_under_batch() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Approve_under_Batch());
		Request_for_financing_Obj.Click_Approve_under_Batch().click();

	}

	@Given("Select the record from Approve")
	public void select_the_record_from_approve() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.select_the_record_from_Approve());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.select_the_record_from_Approve());

	}

	@Given("Approve the record on approve screen")
	public void approve_the_record_on_approve_screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Click_approveButton_in_approve_under_batch());
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Click_Approve_under_Batch());
		Request_for_financing_Obj.Click_approveButton_in_approve_under_batch().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
		Request_for_financing_Obj.confirmsavepopupokbutton().click();

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_okOn_save_pop());
		Request_for_financing_Obj.Click_okOn_save_pop().click();

	}

	@Given("Select Process under menu")
	public void select_process_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_ProcessUnder_menu());
		for (int i = 0; i <= 500; i++) {
			try {
				Request_for_financing_Obj.Click_ProcessUnder_menu().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Select batch Process under process")
	public void select_batch_process_under_process() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_batch_process_under_process());
		for (int i = 0; i <= 500; i++) {
			try {
				Request_for_financing_Obj.Click_batch_process_under_process().click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Select the approved record under process")
	public void select_the_approved_record_under_process() {
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.Select_approved_record_under_process());
		for (int i = 0; i <= 700; i++) {
			try {
				JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Select_approved_record_under_process());
				Request_for_financing_Obj.Select_approved_record_under_process().click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Select_batchRun_under_ApprovedRecord());
		Request_for_financing_Obj.Select_batchRun_under_ApprovedRecord().click();

	}

	@Given("Select record under Branches status")
	public void select_record_under_branches_status() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.select_record_underBranches_status());

		for (int i = 0; i <= 700; i++) {
			try {
				Request_for_financing_Obj.select_record_underBranches_status().click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 700; i++) {
			try {
				if(Request_for_financing_Obj.select_record_underBranches_status().isDisplayed()) {
					Request_for_financing_Obj.select_record_underBranches_status().click();
				}
				
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@Given("Run the record")
	public void run_the_record() {
		// waitHelper.waitForElementwithFluentwait(driver,
		// Request_for_financing_Obj.click_runButton_after_select_record_underBranches_status());

		for (int i = 0; i <= 700; i++) {
			try {
				clicksAndActionsHelper.moveToElement(
						Request_for_financing_Obj.click_runButton_after_select_record_underBranches_status());
				Request_for_financing_Obj.click_runButton_after_select_record_underBranches_status().click();
				break;
			} catch (Exception e) {
				if (i == 700) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("Check the Execution Status")
	public void check_the_execution_status() {
		String check = "";
		for (int i = 0; i <= 1000; i++) {
			check = Request_for_financing_Obj.CheckThe_Execution_Status().getAttribute("value");
			if (check.equalsIgnoreCase("Success")) {
				break;
			}
		}
		Assert.assertEquals(check, "Success");

	}

	// @749155

	@Given("Click request under menu")
	public void click_request_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Request_underMenu_FMS());
		Request_for_financing_Obj.Click_Request_underMenu_FMS().click();

	   
	}

	@Given("Click request financing")
	public void click_request_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Request_financing_under_request());
		Request_for_financing_Obj.Click_Request_financing_under_request().click();

	}

	@Given("Click request for financing under request financing")
	public void click_request_for_financing_under_request_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Request_for_financing_under_Request_financing());
		Request_for_financing_Obj.Click_Request_for_financing_under_Request_financing().click();
	}

	@Given("Click Approve level1 under request for financing")
	public void click_approve_level1_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.ApproveLevel1_under_Request_for_financing());
		Request_for_financing_Obj.ApproveLevel1_under_Request_for_financing().click();

	}

	@Given("Select the record from approve level1")
	public void select_the_record_from_approve_level1() {
		
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.click_clearSearch_in_approvelev1());
		Request_for_financing_Obj.click_clearSearch_in_approvelev1().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.select_record_in_approvelev1());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.select_record_in_approvelev1());


		
	}

	@Given("Select Customer Grading Recommendations tab")
	public void select_customer_grading_recommendations_tab() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.click_Customer_Grading_RecommendationsIn_approvelev1());
		Request_for_financing_Obj.click_Customer_Grading_RecommendationsIn_approvelev1().click();

	}

	@Given("Select decision in approve level")
	public void select_decision_in_approve_level() {
		JavascriptHelper.scrollIntoView(Request_for_financing_Obj.click_ApproveButton_after_Customer_Grading_RecommendationsIn_approvelev1());
		
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.select_Decision_in_approvelev1());
		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.select_Decision_in_approvelev1(), "Forward");

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Select_approveCommite_afterDecision());
		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.Select_approveCommite_afterDecision(), "Approval Committee");

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.After_select_approveCommite_selectIC());
		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.After_select_approveCommite_selectIC(), "Investment Committee");

		
	}

	@Given("approve the record")
	public void approve_the_record() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.click_ApproveButton_after_Customer_Grading_RecommendationsIn_approvelev1());
		Request_for_financing_Obj.click_ApproveButton_after_Customer_Grading_RecommendationsIn_approvelev1().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
		Request_for_financing_Obj.confirmsavepopupokbutton().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Success_Popup());
		Request_for_financing_Obj.Success_Popup().click();

		
	}

	@Given("Click Approval Committee Recommendations under	request for financing")
	public void click_approval_committee_recommendations_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Approval_Committee_Recommendations());
		Request_for_financing_Obj.Click_Approval_Committee_Recommendations().click();
	}

	@Given("Select the Approved record")
	public void select_the_approved_record() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_clearIn_Approval_Committee_Recommendations());
		 Request_for_financing_Obj.Click_clearIn_Approval_Committee_Recommendations().click();
		 
		 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.select_recordIn_Approval_Committee_Recommendations());
		 clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.select_recordIn_Approval_Committee_Recommendations());

		
	}

	@Given("click credit Committee Recommendations Tab")
	public void click_credit_committee_recommendations_tab() {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.click_creditCommitteeRecommendationsTab());
		Request_for_financing_Obj.click_creditCommitteeRecommendationsTab().click();

	}

	@Given("click Recommandations In credit Committee Recommendations Tab")
	public void click_recommandations_in_credit_committee_recommendations_tab() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.click_Recommandations_IncreditCommitteeRecommendationsTab());
		Request_for_financing_Obj.click_Recommandations_IncreditCommitteeRecommendationsTab().click();

	}
	//add button not showing
	@Given("Click the Add button in Recommandations")
	public void click_the_add_button_in_recommandations() {
	    
	}

	@Then("Check the send back level visibility")
	public void check_the_send_back_level_visibility() {
	  
	}
	
	
	//@748962
	
	@Given("Select select oneOff inFacility Type Details")
	public void select_select_one_off_in_facility_type_details() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.select_oneOff_inFacility_Type_Details());
		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.select_oneOff_inFacility_Type_Details(), "One-Off");
		
	}
	@Given("Click Facilitie Managementunder wifakApplication")
	public void click_click_facilitie_managementunder_wifak_application() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.click_Facilities_Managementunder_wifakApplication());
		Request_for_financing_Obj.click_Facilities_Managementunder_wifakApplication().click();

	   
	}

	@Given("click Maintenance under Facilities Managementunder")
	public void click_maintenance_under_facilities_managementunder() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.click_Maintenance_under_Facilities_Managementunder());
		Request_for_financing_Obj.click_Maintenance_under_Facilities_Managementunder().click();
	}

	@Given("select recordIn Maintenance under Facilities Management")
	public void select_record_in_maintenance_under_facilities_management() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.click_searchIn_Maintenance_under_Facilities_Managementunder());
		Request_for_financing_Obj.click_searchIn_Maintenance_under_Facilities_Managementunder().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.click_ClearsearchIn_Maintenance_under_Facilities_Managementunder());
		Request_for_financing_Obj.click_ClearsearchIn_Maintenance_under_Facilities_Managementunder().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.select_recordIn_Maintenance_under_Facilities_Management());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.select_recordIn_Maintenance_under_Facilities_Management());
		
	}
	String getcode;
	@Given("Get Application code from the record")
	public void get_application_code_from_the_record() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.getApplicationCode_forSelected_application());
		for (int i = 0; i <= 700; i++) {
			try {
				 getcode =	Request_for_financing_Obj.getApplicationCode_forSelected_application().getAttribute("prevvalue");	
				 if(!getcode.isEmpty()) {
					 break;
				 }
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("getcode :" +getcode);
	
	}

	@Given("Click drawDown request under wifakApplication")
	public void click_draw_down_request_under_wifak_application() {
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_drawDown_request_under_wifakApplication());
		for (int i = 0; i <= 700; i++) {
			try {
				Request_for_financing_Obj.Click_drawDown_request_under_wifakApplication().click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	}

	@Given("Click Mainteance under drawDown request")
	public void click_mainteance_under_draw_down_request() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_Mainteance_under_drawDown_request());
		Request_for_financing_Obj.Click_Mainteance_under_drawDown_request().click();

	}

	@Given("Enter Facility Reference code")
	public void enter_facility_reference_code() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.enter_Facility_Reference_code());
		for (int i = 0; i <= 700; i++) {
			try {
				Request_for_financing_Obj.enter_Facility_Reference_code().sendKeys(getcode);
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@Given("Enter drawdown type")
	public void enter_drawdown_type() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.enter_drawdown_type());
		Request_for_financing_Obj.enter_drawdown_type().sendKeys("1");

	}

	@Given("Enter Description English and date")
	public void enter_description_english_and_date() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.enter_Description_English());
		Request_for_financing_Obj.enter_Description_English().sendKeys("wdfwf");

		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.enter_valid_dateIn_drawDown_mainInformation());
		Request_for_financing_Obj.enter_valid_dateIn_drawDown_mainInformation().sendKeys("25/05/2024");

	}

	@Given("Click Drawdown Additional Details tab")
	public void click_drawdown_additional_details_tab() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_Drawdown_Additional_Details_tab());
		Request_for_financing_Obj.Click_Drawdown_Additional_Details_tab().click();
		

	}

	@Given("Enter value Product ClassLN")
	public void enter_value_product_class_ln() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Enter_value_Product_ClassLN());
		Request_for_financing_Obj.Enter_value_Product_ClassLN().sendKeys("1");
		
		//check the date after add produclassLN possible to change if change again change it
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.click_drawdown_mainInformation());
		Request_for_financing_Obj.click_drawdown_mainInformation().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.enter_valid_dateIn_drawDown_mainInformation());
		Request_for_financing_Obj.enter_valid_dateIn_drawDown_mainInformation().sendKeys("25/05/2024");

		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_Drawdown_Additional_Details_tab());
		Request_for_financing_Obj.Click_Drawdown_Additional_Details_tab().click();
		
	}

	@Given("Click save button IndrawDown Additional Details tab")
	public void click_save_button_indraw_down_additional_details_tab() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_save_button_IndrawDown_Additional_Details_tab());
		Request_for_financing_Obj.Click_save_button_IndrawDown_Additional_Details_tab().click();

		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.confirmsavepopupokbutton());
		Request_for_financing_Obj.confirmsavepopupokbutton().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_okOn_save_pop());
		Request_for_financing_Obj.Click_okOn_save_pop().click();
		
		for (int i = 0; i < 500; i++) {
			try {
				if (Request_for_financing_Obj.SendAlert_pop().isDisplayed()) {
					Request_for_financing_Obj.SendAlert_pop().click();
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@Given("Click verifyAndDeny under drawDownRequest")
	public void click_verify_and_deny_under_draw_down_request() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_verifyAndDeny_under_drawDownRequest());
		Request_for_financing_Obj.Click_verifyAndDeny_under_drawDownRequest().click();

	}

	@Given("Select Record verifyAndDeny under draw Down Request")
	public void select_record_verify_and_deny_under_draw_down_request() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.ClickClearSearch_verifyAndDeny_under_drawDownRequest());
		Request_for_financing_Obj.ClickClearSearch_verifyAndDeny_under_drawDownRequest().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.selectRecord_verifyAndDeny_under_drawDownRequest());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.selectRecord_verifyAndDeny_under_drawDownRequest());
		
	}

	@Given("Click verify button In verifyAndDeny")
	public void click_verify_button_in_verify_and_deny() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_verifyButton_InverifyAndDeny());
		Request_for_financing_Obj.Click_verifyButton_InverifyAndDeny().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.confirmsavepopupokbutton());
		Request_for_financing_Obj.confirmsavepopupokbutton().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_okOn_save_pop());
		Request_for_financing_Obj.Click_okOn_save_pop().click();
		
		for (int i = 0; i < 500; i++) {
			try {
				if (Request_for_financing_Obj.SendAlert_pop().isDisplayed()) {
					Request_for_financing_Obj.SendAlert_pop().click();
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@Given("Click Approve Reject under drawdown")
	public void click_approve_reject_under_drawdown() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_ApproveReject_under_drawdown());
		Request_for_financing_Obj.Click_ApproveReject_under_drawdown().click();

	}

	@Given("Select Record In Approve Reject under drawdown")
	public void select_record_in_approve_reject_under_drawdown() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.ClickClearsearch_InApproveReject_under_drawdown());
		Request_for_financing_Obj.ClickClearsearch_InApproveReject_under_drawdown().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.SelectRecord_InApproveReject_under_drawdown());
		clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.SelectRecord_InApproveReject_under_drawdown());

	}

	@Given("Approve The record In Approve Reject under drawdown")
	public void approve_the_record_in_approve_reject_under_drawdown() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.approveThe_recordInApproveReject_under_drawdown());
		Request_for_financing_Obj.approveThe_recordInApproveReject_under_drawdown().click();

		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.confirmsavepopupokbutton());
		Request_for_financing_Obj.confirmsavepopupokbutton().click();
		
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click_okOn_save_pop());
		Request_for_financing_Obj.Click_okOn_save_pop().click();
		
		for (int i = 0; i < 500; i++) {
			try {
				if (Request_for_financing_Obj.SendAlert_pop().isDisplayed()) {
					Request_for_financing_Obj.SendAlert_pop().click();
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@Given("Click Facility Closure Request under drawdown")
	public void click_facility_closure_request_under_drawdown() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.click_Facility_Closure_Request_under_drawdown());
		Request_for_financing_Obj.click_Facility_Closure_Request_under_drawdown().click();

	}

	@Given("Click Mainteance under Facility Closure Request under drawdown")
	public void click_mainteance_under_facility_closure_request_under_drawdown() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.clickMainteance_under_Facility_Closure_Request_under_drawdown());
		Request_for_financing_Obj.clickMainteance_under_Facility_Closure_Request_under_drawdown().click();
	}

	@Given("Enter Facility Reference In Mainteance under Facility Closure Request")
	public void enter_facility_reference_in_mainteance_under_facility_closure_request() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Enter_Facility_Reference_InMainteance_under_Facility_Closure_Request());
		Request_for_financing_Obj.Enter_Facility_Reference_InMainteance_under_Facility_Closure_Request().sendKeys(getcode);
	}

	//@542234
	@And ("Goto maintenace under request for financing")
	public void Goto_maintenace_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.Click__maintenace_under_request_for_financing());
		Request_for_financing_Obj.Click__maintenace_under_request_for_financing().click();

	}
	
	
}
