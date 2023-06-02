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
		DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.Select_reason_for_submission(),
				"Modify Request");

	}

	@And("^Enter value on Existing Facility No$")
	public void enter_value_on_existing_facility_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.enter_Existing_Facility_No());
		clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.enter_Existing_Facility_No());
		Request_for_financing_Obj.enter_Existing_Facility_No().click();
		Request_for_financing_Obj.enter_Existing_Facility_No().sendKeys("1399");
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
				Request_for_financing_Obj.Click_In_and_enter_firstGroupID_onGroupLimit().sendKeys("1");
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
		Request_for_financing_Obj.Click_and_enter_firstlimit_onGroupLimit().sendKeys("2000");

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

		Request_for_financing_Obj.Click_In_and_enter_FirstGroupname_onGroupLimit().sendKeys("dq");
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
		Request_for_financing_Obj.Click_In_and_enter_secondGroupID_onGroupLimit().sendKeys("2");
	}

	@Then("^Enter Second Group limit$")
	public void enter_second_group_limit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Request_for_financing_Obj.Afterenter_value_on_SecondLimit_clickout());
		// clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Afterenter_value_on_SecondLimit_clickout());
		Request_for_financing_Obj.Click_and_enter_secondlimit_onGroupLimit().click();
		Request_for_financing_Obj.Click_and_enter_secondlimit_onGroupLimit().sendKeys("10000");
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

	String RequestNo;

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
		Request_for_financing_Obj.Click_Click_and_enter_CIF().sendKeys("8");
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
		String substring = SuccessMsg.substring(23, 27);
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

//		for (int i = 0; i < 1000; i++) {
//			try {	
//				Request_for_financing_Obj.Click_Clearsearch_on_approve_reject_cancel().click();
//				clicksAndActionsHelper
//				.doubleClick(Request_for_financing_Obj.DoubleClick_select_firstRecord_on_Click_approve_reject_cancel());
//				break;
//			} catch (Exception e) {
//				if (i == 999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//		waitHelper.waitForElementwithFluentwait(driver,
//				Request_for_financing_Obj.DoubleClick_select_firstRecord_on_Click_approve_reject_cancel());

		waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Search_cancel_code_onApproveCancel());
		Request_for_financing_Obj.Search_cancel_code_onApproveCancel().sendKeys("1389");
		Request_for_financing_Obj.Search_cancel_code_onApproveCancel().sendKeys(Keys.ENTER);
//		String xpath ="//td[contains(text(),'1441')]";
//		for (int i = 0; i <200; i++) {
//			try {
//				driver.findElement(By.xpath(xpath)).isDisplayed();
//				break;
//			} catch (Exception e) {
//			}
//		}
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

		Request_for_financing_Obj.search_approvecancelCode_OnMainteance().sendKeys("1389");

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
	
	
	//@636958
	 @And("^click the reason for submission search box$")
	    public void click_the_reason_for_submission_search_box() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.reasonforsubmisson());
	    	//Request_for_financing_Obj.SelectUsingVisibleText(Request_for_financing_Obj.reasonforsubmisson(), "New Request");
	    	DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.Select_reason_for_submission(),
					"New Request");
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
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.facilitytypedetails());
	    	Request_for_financing_Obj.facilitytypedetails().click();
	        
	    }

	    @And("^Enter the facility type code under facility type$")
	    public void enter_the_facility_type_code_under_facility_type() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.facilitytypedetailssearchbox());
	    	Request_for_financing_Obj.facilitytypedetailssearchbox().sendKeys("221");
	    	Request_for_financing_Obj.facilitytypetouch().click();
	        
	    }



	    @And("^Enter the total limit under global limit$")
	    public void enter_the_total_limit_under_global_limit() throws Throwable {
	    	
		    	for(int i = 0; i <= 300; i++) {
		    		try {
		    			JavascriptHelper.scrollIntoView(Request_for_financing_Obj.totallimitsearchbox());
					} catch (Exception e) {
						if(i == 300) {
							Assert.fail(e.getMessage());
						}
					}
		    	}
		    	Request_for_financing_Obj.totallimitsearchbox().sendKeys("10000");
		    	Request_for_financing_Obj.facilitytypetouch().click();
		    	
		    }
	    	
	    	


	    @And("^Click the Disbursement Sublimit under maintenance screen$")
	    public void click_the_disbursement_sublimit_under_maintenance_screen() throws Throwable {
	    	
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			JavascriptHelper.scrollIntoView(Request_for_financing_Obj.disbursementsublimit());
				} catch (Exception e) {
					if(i == 300) {
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
	    	waitHelper.waitForElementwithFluentwait(driver,Request_for_financing_Obj.productclasssearchbox());
	    	Request_for_financing_Obj.productclasssearchbox().sendKeys("1");
	    	Request_for_financing_Obj.productclass().click();
	        
	    }



	    @And("^Add the Margin values in Margin$")
	    public void add_the_margin_values_in_margin() throws Throwable {
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			JavascriptHelper.scrollIntoView(Request_for_financing_Obj.marginsearchbox());
	    			Request_for_financing_Obj.marginsearchbox().clear();
	    	    	Request_for_financing_Obj.marginsearchbox().sendKeys("1",Keys.ENTER);
	    			break;
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	
	    }


	    @And("^Enter the tenure value in tenure$")
	    public void enter_the_tenure_value_in_tenure() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.tenure());
	    	Request_for_financing_Obj.tenure().click();
	        
	    }

	    @And("^Add all the Above limit values$")
	    public void add_all_the_above_limit_values() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.addbutton());
	    	Request_for_financing_Obj.addbutton().click();
	        
	    }

	    @And("^Save all the values when limits are add$")
	    public void save_all_the_values_when_limits_are_add() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.savebutton());
	    	Request_for_financing_Obj.savebutton().click();
	        
	    }

	    @And("^Confirm the popup menu when all the limits are saved$")
	    public void confirm_the_popup_menu_when_all_the_limits_are_saved() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
	    	//waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_okOn_Warrning_popup());
			Request_for_financing_Obj.confirmsavepopupokbutton().click();
	       // requestID = Request_for_financing_Obj.confirmsavepopupokbutton()
	        
	    }

	    @And("^Click the final save popup message$")
	    public void click_the_final_ok_popup_message() throws Throwable {
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
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Create_Schedule_InRepaymentPlan());
	    	Request_for_financing_Obj.Click_Create_Schedule_InRepaymentPlan().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavepopupokbutton());
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			Request_for_financing_Obj.confirmsavepopupokbutton().click();
	    			break;
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	
	    	
//	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmsavesuccessfullypopup());
//	    	Request_for_financing_Obj.confirmsavesuccessfullypopup().click();
//	    	
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_saveButton_In_RepaymentPlan());
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			Request_for_financing_Obj.Click_saveButton_In_RepaymentPlan().click();
	    			break;
				} catch (Exception e) {
					if(i == 300) {
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
	    	
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			Request_for_financing_Obj.validatesuccessfullypopup().click();
	    			break;
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	        
	    }

	    @And("^Click the Approve level1 screen under request for financing$")
	    public void click_the_approve_level1_screen_under_request_for_financing() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.approvelevel1());
	    	Request_for_financing_Obj.approvelevel1().click();
	        
	    }

	    @And("^Select the record in Approve Screen1$")
	    public void select_the_record_in_Approve_Screen1() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_clearsearch_inApproveLev_1());
	    	Request_for_financing_Obj.Click_clearsearch_inApproveLev_1().click();
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.doubleClick_and_select_record_inApproveLev_1());
	    	    	clicksAndActionsHelper.doubleClick(Request_for_financing_Obj.doubleClick_and_select_record_inApproveLev_1());
	    			break;
				} catch (Exception e) {
					if(i == 300) {
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
	    	DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.select_decision_inApproveLev_1(),
					"Reject");
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.approve_buttton_inApproveLev_1());
	    	Request_for_financing_Obj.approve_buttton_inApproveLev_1().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.confirmvalidatepopupokbutton());
	    	Request_for_financing_Obj.confirmvalidatepopupokbutton().click();
	    }
	    
	    @And("^enter the reason for rejection$")
	    public void enter_the_reason_for_rejection() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.click_addButton_On_reasonForRejection());
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
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Reopen_Rejected_Applications_Under_request_for_financing());
	    	 Request_for_financing_Obj.Click_Reopen_Rejected_Applications_Under_request_for_financing().click();
	    }

	    @And("^Click mainteance under Reopen Rejected Applications$")
	    public void click_mainteance_under_reopen_rejected_applications() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_mainteance_under_Reopen_Rejected_Applications());
	    	 Request_for_financing_Obj.Click_mainteance_under_Reopen_Rejected_Applications().click();
	    }

	    @And("^Select the reopen record mainteance under Reopen Rejected Applications$")
	    public void select_the_reopen_record_mainteance_under_reopen_rejected_applications() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications());
	    	Request_for_financing_Obj.Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.DoubleClick_Select_firstRecord_Reopen_Rejected_Applications());
	    	clicksAndActionsHelper.doubleClick( Request_for_financing_Obj.DoubleClick_Select_firstRecord_Reopen_Rejected_Applications());

	    	
	    	
	    	
	    	
	    }

	
	
	
	
	
	
	
	
	
	
	
	

}
