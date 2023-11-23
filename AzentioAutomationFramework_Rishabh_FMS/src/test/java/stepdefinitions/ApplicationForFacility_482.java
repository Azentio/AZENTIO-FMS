package stepdefinitions;

import static org.testng.Assert.fail;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import de.erichseifert.vectorgraphics2d.Document;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.IISCommonElements;
import pageobjects.fms.ApplicationForFinancialFacility_482_Obj;
import pageobjects.iisParam.CommonElementsObj;
import resources.BaseClass;

public class ApplicationForFacility_482 extends BaseClass {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacility_482_Obj applicationForFinancialFacilityObj = new ApplicationForFinancialFacility_482_Obj(
			driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "ApplicationForFinancialFacility", "DataSet ID");
	ExcelData facilityManagementData = new ExcelData(path, "FacilitiesManagement", "DataSet ID");
	ExcelData facilityManagementData_482 = new ExcelData(path, "FacilitiesManagement_482", "DataSet ID");
	ExcelData requestForFinancingData = new ExcelData(path, "RequestForFinancing_482", "DataSet ID");
	ExcelData drawDownRequestData = new ExcelData(path, "DrawDownRequest", "DataSet ID");
	ExcelData testExecution = new ExcelData(path, "TestExecution", "TestCaseID");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;
	String ApplicationFor;
	CSMLogin csmLogin = new CSMLogin(driver);
	CommonElementsObj commonElementsObj = new CommonElementsObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	int randomNumber;
	String Request_Code = "";

	@And("^User_482 update test data set for AT_AFF_024$")
	public void user_482_update_test_data_set_for_AT_AFF_024() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AFF_024");
		testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User Update test data set id for AT_AFF_004")
	public void user_update_test_data_set_id_for_at_aff_004() {
		testExecutionData = testExecution.getTestdata("AT_AFF_004");
		testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User Update test data set id for AT_AFF_008")
	public void user_update_test_data_set_id_for_at_aff_008() {
		testExecutionData = testExecution.getTestdata("AT_AFF_008");
		testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User Update test data set id for AT_AFF_019")
	public void user_update_test_data_set_id_for_at_aff_019() {
		testExecutionData = testExecution.getTestdata("AT_AFF_019");
		testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 update test data set for AT_AFF_051")
	public void user_update_test_data_set_id_for_at_aff_051() {
		testExecutionData = testExecution.getTestdata("AT_AFF_051");
		testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 update test data set for AT_FM_061")
	public void user_update_test_data_set_for_at_aff() {
		testExecutionData = testExecution.getTestdata("AT_FM_061");
		testData = facilityManagementData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@Given("User_482 update test data set for AT_FM_062")
	public void user_update_test_data_set_for_at_fm_062() {
		testExecutionData = testExecution.getTestdata("AT_FM_062");
		testData = facilityManagementData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 update test data set for AT_RF_025")
	public void user_482_update_test_data_set_for_at_fm_025() {
		testExecutionData = testExecution.getTestdata("AT_RF_025");
		testData = requestForFinancingData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 update test data set for AT_DDR_009")
	public void user_update_test_data_set_for_at_fm_009() {
		testExecutionData = testExecution.getTestdata("AT_DDR_009");
		testData = drawDownRequestData.getTestdata(testExecutionData.get("Data Set ID"));

	}

	@And("User_482 Update Test data set for AT_RF_008")
	public void user_482_update_test_data_set_for_at_rf_008() {
		testExecutionData = testExecution.getTestdata("AT_RF_008");
		testData = requestForFinancingData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 Update Test data set for AT_RF_064")
	public void user_482_update_test_data_set_for_at_rf_064() {
		testExecutionData = testExecution.getTestdata("AT_RF_064");
		testData = requestForFinancingData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 Update Test data set for AT_RF_121")
	public void user_482_update_test_data_set_for_at_rf_121() {
		testExecutionData = testExecution.getTestdata("AT_RF_121");
		testData = requestForFinancingData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 update Test data set for AT_RF_164")
	public void user_482_update_test_data_set_for_at_rf_164() {
		testExecutionData = testExecution.getTestdata("AT_RF_164");
		testData = requestForFinancingData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 update Test data set for AT_RF_166")
	public void user_482_update_test_data_set_for_at_rf_166() {
		testExecutionData = testExecution.getTestdata("AT_RF_166");
		testData = requestForFinancingData.getTestdata(testExecutionData.get("Data Set ID"));
		System.out.println(testData.get("RequestID"));

	}

	@And("User_482 update Test data set for AT_RF_001")
	public void user_482_update_test_data_set_for_AT_RF_001() {
		// testExecutionData = testExecution.getTestdata("AT_RF_001");
		testData = requestForFinancingData.getTestdata("AT_RF_001_D1");
		// System.out.println(testData.get(requestForFinancingData.getTestdata("AT_RF_001")));

	}

	@And("User_482 update Test data set for AT_RF_002")
	public void user_482_update_test_data_set_for_AT_RF_002() {
		// testExecutionData = testExecution.getTestdata("AT_RF_001");
		testData = requestForFinancingData.getTestdata("AT_RF_002_D1");
		// System.out.println(testData.get(requestForFinancingData.getTestdata("AT_RF_001")));

	}

	@And("User_482 update test data set for AT_DDR_084_01")
	public void User_482_update_test_data_set_for_AT_DDR_084_01() {
		testExecutionData = testExecution.getTestdata("AT_DDR_084_01");
		testData = drawDownRequestData.getTestdata(testExecutionData.get("Data Set ID"));
		System.out.println(testData.get("Data Set ID"));

	}

	@Given("^User Launch the CSM params Application$")
	public void user_launch_the_csm_params_application() throws Throwable {
		driver.get(configFileReader.getCSMParamApplicationUrl());
		csmLogin.loginIntoCSMParamApplication(configFileReader.getCSMApplicationUserType());
	}

	@Then("^User Validate the Code is Displayed in Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
	public void user_validate_the_code_is_displayed_in_approval_committee_recommendations_under_request_for_financing_sub_menu_in_request_for_financin()
			throws Throwable {
		String xpath = "//td[contains(text(),'" + testData.get("RequestID") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_482 Click on REQUEST FOR FINANCIN under FMS application$")
	public void user_482_click_on_request_for_financin_under_fms_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.requestForFinancingMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.requestForFinancingMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.requestForFinancingMenu());
	}

	@And("^User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN$")
	public void user_482_click_the_request_for_financing_sub_menu_under_request_for_financin() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.requestForFinancingSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.requestForFinancingSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.requestForFinancingSubMenu());
	}

	@And("^User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
	public void user_482_click_on_maintenance_under_request_for_financing_sub_menu_in_request_for_financin()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.requestForFinancingMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.requestForFinancingMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.requestForFinancingMaintenanceScreen());
	}

	@And("^User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN$")
	public void user_select_new_request_in_reason_for_submission_under_maintenance_screen_in_request_for_financin()
			throws Throwable {
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

	@And("^User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN$")
	public void user_search_the_cif_number_in_customer_under_maintenance_screen_in_request_for_financin()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.customerCIF());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.customerCIF());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.customerCIF());
		applicationForFinancialFacilityObj.customerCIF().sendKeys(testData.get("CIFNO"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.customerNameValidationInRequestForFinancingScreen()
						.getAttribute("prevvalue").isBlank()
						&& !applicationForFinancialFacilityObj.customerNameValidationInRequestForFinancingScreen()
								.getAttribute("prevvalue").isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN$")
	public void user_search_the_facility_type_under_maintenance_screen_in_request_for_financin() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen()
				.sendKeys(testData.get("FacilityType"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.facilityNameValidationInRequestForFinancingScreen()
						.getAttribute("prevvalue").isBlank()
						|| !applicationForFinancialFacilityObj.facilityNameValidationInRequestForFinancingScreen()
								.getAttribute("prevvalue").isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN$")
	public void user_enter_the_value_in_total_limit_under_maintenance_screen_in_request_for_financin()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen());
		applicationForFinancialFacilityObj.totalLimitInRequestForFinancingScreen().sendKeys(testData.get("TotalLimit"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.cvValueValidationInRequestForFinancingScreen()
						.getAttribute("prevvalue").isBlank()
						|| !applicationForFinancialFacilityObj.cvValueValidationInRequestForFinancingScreen()
								.getAttribute("prevvalue").isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN$")
	public void user_click_on_disbursement_or_sublimit_under_maintenance_screen_in_request_for_financin()
			throws Throwable {
		Thread.sleep(1000);
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

	}

	@And("^User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN$")
	public void user_click_on_add_button_in_disbursement_or_sublimit_under_maintenance_screen_in_request_for_financin()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.addIconInDisbursementOrSublimitScreen());

	}

	@And("^User Search Product Class in Limit Details Pop up Menu$")
	public void user_search_product_class_in_limit_details_pop_up_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp());
		applicationForFinancialFacilityObj.productClassInLimitDetailsPopUp().sendKeys(testData.get("ProductClass"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.productClassRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.productClassRandomClick());
		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.productClassNameValidationInRepaymentPlan()
						.getAttribute("prevvalue").isBlank()
						|| !applicationForFinancialFacilityObj.productClassNameValidationInRepaymentPlan()
								.getAttribute("prevvalue").isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^User Enter the Margin value in New Tab Field in Limit Details Pop up Menu$")
	public void user_enter_the_margin_value_in_new_tab_field_in_limit_details_pop_up_menu() throws Throwable {
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp());
		applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp().sendKeys(testData.get("MarginValue"));
		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp().getText().isBlank()
						|| !applicationForFinancialFacilityObj.marginValueInLimitDetailsPopUp().getText().isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^User Click on Add button in Limit Details Pop up$")
	public void user_click_on_add_button_in_limit_details_pop_up() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUp());
	}

	@And("^User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN$")
	public void user_click_on_save_button_under_maintenance_screen_in_request_for_financin() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.savebuttonInRequestForFinancingScreenMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.savebuttonInRequestForFinancingScreenMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.savebuttonInRequestForFinancingScreenMaintenance());
	}

	@And("^User_482 Click on Ok button in Confirm Pop up Menu$")
	public void user_482_click_on_ok_button_in_confirm_pop_up_menu() throws Throwable {
		// seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInConfirmationPopUp());
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.okButtonInConfirmationPopUp());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.okButtonInConfirmationPopUp());
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^User_482 Click on Ok button in Success Pop up Menu$")
	public void user_482_click_on_ok_button_in_success_pop_up_menu() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getBrowserHelper().SwitchToWindow(1);
				seleniumActions.getBrowserHelper().switchToParentWithChildClose();
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 2000; i++) {
			if (applicationForFinancialFacilityObj.okButtonInSucessPopUp().isDisplayed()) {
				try {
					seleniumActions.getClickAndActionsHelper()
							.moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
					seleniumActions.getClickAndActionsHelper()
							.clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
					break;
				} catch (Exception e) {

				}
			} else {
				System.out.println("No Pop Up Appeared");
				continue;
			}
		}
	}

	@And("^User_482 Click on Ok button in Information Pop up Menu$")
	public void user_482_click_on_ok_button_in_information_pop_up_menu() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getBrowserHelper().SwitchToWindow(1);
				seleniumActions.getBrowserHelper().switchToParentWithChildClose();
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okButtonInInformationPopUp());
		for (int i = 0; i < 2000; i++) {
			try {
				applicationForFinancialFacilityObj.okButtonInInformationPopUp().click();
				;
				break;
			} catch (Exception e) {

			}
		}
	}


	public void User_482_Dismiss_the_alert() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getBrowserHelper().SwitchToWindow(1);
				seleniumActions.getBrowserHelper().switchToParentWithChildClose();
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.AlertDismissBtn());
		for (int i = 0; i < 2000; i++) {
			try {
				applicationForFinancialFacilityObj.AlertDismissBtn().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^User Click on Validate button under Maintenance screen in REQUEST FOR FINANCIN$")
	public void user_click_on_validate_button_under_maintenance_screen_in_request_for_financin() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.validateButtonInRequestForFinancingScreen());
	}

	@And("^User Click on Yes button in Confirm Pop up Menu$")
	public void user_click_on_yes_button_in_confirm_pop_up_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.confirmDoYouWantToProceedYes());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.confirmDoYouWantToProceedYes());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.confirmDoYouWantToProceedYes());
	}

	@And("^User Get the Code in Success Pop up Menu$")
	public void user_get_the_code_in_success_pop_up_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
		requestId = applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().getText().substring(10,
				14);
		excelData.updateTestData(testExecutionData.get("Data Set ID"), "RequestID", requestId);
		System.out.println(requestId);
	}

	@Given("User_482 Get the Code in Success Pop up Menu under WIFAK Application")
	public void user_482_get_the_code_in_success_pop_up_menu_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
		requestId = applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().getText().substring(23,
				28);
		requestForFinancingData.updateTestData(testExecutionData.get("Data Set ID"), "RequestID", requestId);
		System.out.println(requestId);
	}

	@Given("User_482 Get the Code in Success Pop up Menu under WIFAK Application1")
	public void user_482_get_the_code_in_success_pop_up_menu_under_wifak_application1() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
		requestId = applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().getText().substring(23,
				28);
		requestForFinancingData.updateTestData(testExecutionData.get("Data Set ID"), "RequestID", requestId);
		System.out.println(requestId);
	}

	@Given("User_482 Get the Code in Success Pop up Menu under WIFAK Application for Draw down")
	public void user_482_get_the_code_in_success_pop_up_menu_under_wifak_application_for_draw_down() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
		requestId = applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().getText().substring(23,
				28);
		drawDownRequestData.updateTestData(testExecutionData.get("Data Set ID"), "RequestID", requestId);
		System.out.println(requestId);
	}

	@And("^User Click on Approve Level 1 under REQUEST FOR FINANCIN$")
	public void user_click_on_approve_level_1_under_request_for_financin() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approvalLevel1InRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approvalLevel1InRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approvalLevel1InRequestForFinancingScreen());
	}

	@And("^User Search the Code in Approve Level 1 under REQUEST FOR FINANCIN$")
	public void user_search_the_code_in_approve_level_1_under_request_for_financin() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1()
				.sendKeys(testData.get("RequestID"));
	}

	@And("^User Select the Searched Code in Approve Level 1 under REQUEST FOR FINANCIN$")
	public void user_select_the_searched_code_in_approve_level_1_under_request_for_financin() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.selectApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.selectApprovedFacilityRecordInApprovalLevel1());
	}

	@And("^User Click on Customer Grading and Recommendations in Approve Level 1 under REQUEST FOR FINANCIN$")
	public void user_click_on_customer_grading_and_recommendations_in_approve_level_1_under_request_for_financin()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.customerGradingRecommendation());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.customerGradingRecommendation());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.customerGradingRecommendation());

	}

	@And("^User Select the Decision Field as Forward and Approval Committee in Customer Grading and Recommendations under Approve Level 1$")
	public void user_select_the_decision_field_as_forward_and_approval_committee_in_customer_grading_and_recommendations_under_approve_level_1()
			throws Throwable {
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.selectDecisionInApprovalLevel1Reccommendation());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.customerGradingRecommendation(), testData.get("DecisionField"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectDecisionInApprovalLevel1Reccommendation());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.selectDecisionInApprovalLevel1Reccommendation(),
				testData.get("Recommendation"));
	}

	@And("^User Select the Approval Committee as Investment Committee in Customer Grading and Recommendations under Approve Level 1$")
	public void user_select_the_approval_committee_as_investment_committee_in_customer_grading_and_recommendations_under_approve_level_1()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectApprovalCommitteInApprovalLevel1Reccommendation());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.selectApprovalCommitteInApprovalLevel1Reccommendation(),
				testData.get("Approval Committee"));

	}

	@And("^User Click on Approve button in Customer Grading and Recommendations under Approve Level 1$")
	public void user_click_on_approve_button_in_customer_grading_and_recommendations_under_approve_level_1()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveButtonInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveButtonInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approveButtonInApprovalLevel1());
	}

	@And("^User Click on Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
	public void user_click_on_approval_committee_recommendations_under_request_for_financing_sub_menu_in_request_for_financin()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approvalCommitteeRecommendations());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approvalCommitteeRecommendations());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approvalCommitteeRecommendations());
	}

	@And("^User Search the Code in Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
	public void user_search_the_code_in_approval_committee_recommendations_under_request_for_financing_sub_menu_in_request_for_financin()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1());
		applicationForFinancialFacilityObj.searchApprovedFacilityRecordInApprovalLevel1()
				.sendKeys(testData.get("RequestID"));
	}

	// ****************************************************Market Field
	// TestCase***********************************************//
	@Then("^User Validate Additional Details Tab is Disable in Maintenance screen under Collateral Management$")
	public void user_validate_additional_details_tab_is_disable_in_maintenance_screen_under_collateral_management()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_ValidateAdditionalDetailsTabIsDisableInMaintenanceScreen());
		String attribute = applicationForFinancialFacilityObj
				.fms_ValidateAdditionalDetailsTabIsDisableInMaintenanceScreen().getAttribute("class");
		Assert.assertTrue(attribute.contains("disabled"));
	}

	@And("^User Click on Collateral Management under FMS application$")
	public void user_click_on_collateral_management_under_fms_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_CollateralManagementMainMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_CollateralManagementMainMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_CollateralManagementMainMenu());
	}

	@And("^User Click on Maintenance under Collateral Management$")
	public void user_click_on_maintenance_under_collateral_management() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_MaintenanceSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_MaintenanceSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_MaintenanceSubMenu());
	}

	@And("^User Search Collateral Type in Maintenance screen under Collateral Management$")
	public void user_search_collateral_type_in_maintenance_screen_under_collateral_management() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_SearchCollateralTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_SearchCollateralTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_SearchCollateralTypeInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_SearchCollateralTypeInMaintenanceScreen()
				.sendKeys(testData.get("CollateralType"));
	}

	@And("^User Enter Valid From Date in Maintenance screen under Collateral Management$")
	public void user_enter_valid_from_date_in_maintenance_screen_under_collateral_management() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen());
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String currentDate = LocalDate.now().format(dtFormatter).toString();
		applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen().sendKeys(currentDate);
		applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen().sendKeys(Keys.TAB);
		for (int i = 0; i < 50; i++) {
			applicationForFinancialFacilityObj.fms_EnterValidFromDateInMaintenanceScreen().getAttribute("prevvalue");
		}

	}

	@And("^User Enter Valid To Date in Maintenance screen under Collateral Management$")
	public void user_enter_valid_to_date_in_maintenance_screen_under_collateral_management() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen());
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String currentDate = LocalDate.now().format(dtFormatter).toString();
		applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen().sendKeys(currentDate);
		applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen().sendKeys(Keys.TAB);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fmsEnterValueForBriefDescriptionInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fmsEnterValueForBriefDescriptionInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.fmsEnterValueForBriefDescriptionInMaintenanceScreen());
		for (int i = 0; i < 15; i++) {
			applicationForFinancialFacilityObj.fms_EnterValidToDateInMaintenanceScreen().getAttribute("prevvalue");
		}
	}

	@And("^User Enter value for Brief Description in Maintenance screen under Collateral Management$")
	public void user_enter_value_for_brief_description_in_maintenance_screen_under_collateral_management()
			throws Throwable {

		applicationForFinancialFacilityObj.fmsEnterValueForBriefDescriptionInMaintenanceScreen()
				.sendKeys(testData.get("BriefDescription"));
	}

	@And("^User Enter value for Long Description in Maintenance screen under Collateral Management$")
	public void user_enter_value_for_long_description_in_maintenance_screen_under_collateral_management()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_EnterValueForLongDescriptionInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_EnterValueForLongDescriptionInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.fms_EnterValueForLongDescriptionInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_EnterValueForLongDescriptionInMaintenanceScreen()
				.sendKeys(testData.get("LongDescription"));

	}

	@And("^User Search CIF No in Maintenance screen under Collateral Management$")
	public void user_search_cif_no_in_maintenance_screen_under_collateral_management() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen().sendKeys("727");
	}

	@And("^User Click Ok button in Confirm pop up menu$")
	public void user_click_ok_button_in_confirm_pop_up_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_ClickOkButtonInConfirmPopUpMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_ClickOkButtonInConfirmPopUpMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_ClickOkButtonInConfirmPopUpMenu());
	}

	@And("^User Search Collateral Currency in Maintenance screen under Collateral Management$")
	public void user_search_collateral_currency_in_maintenance_screen_under_collateral_management() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen());
		applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen()
				.sendKeys(testData.get("CollateralCurrency"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fms_SearchCIFNoInMaintenanceScreen());
		for (int i = 0; i < 50; i++) {
			applicationForFinancialFacilityObj.fms_SearchCollateralCurrencyInMaintenanceScreen()
					.getAttribute("prevvalue");
		}
	}

	// ***********************************************MIN MAX
	// VALUE**********************************************************//
	@And("^User_482 Click on WIFAK Application Main Menu$")
	public void user_482_click_on_wifak_application_main_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fmsWifakApplicationMainMenu());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.fmsWifakApplicationMainMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fmsWifakApplicationMainMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fmsWifakApplicationMainMenu());
	}

	@And("^User_482 Click on WIFAK Application Sub Menu$")
	public void user_482_click_on_wifak_application_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fmsWifakApplicationInWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fmsWifakApplicationInWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fmsWifakApplicationInWifakApplication());
	}

	@And("^User_482 Click Application for financial facilities$")
	public void user_482_click_application_for_financial_facilities() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
	}

	@And("^User_482 Click Maintenance screen in WIFAK Application sub menu$")
	public void user_482_click_maintenance_screen_in_wifak_application_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fmsMaintenanceInApplicationForFinancialFacilities());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fmsMaintenanceInApplicationForFinancialFacilities());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fmsMaintenanceInApplicationForFinancialFacilities());
//		for (int i = 0; i < 10; i++) {
//			if (applicationForFinancialFacilityObj.ProgressIcon().isDisplayed()) {
//				try {
//					waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());
//					System.out.println("Progress Bar Appeared");
//					wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
//					System.out.println("Progress Bar Disappeard");
//					break;
//
//				} catch (Exception e) {
//
//				}
//			} else {
//				continue;
//			}
//		}

	}

	@And("^User_482 Select Application For field in Maintenace Screen under WIRAK Application$")
	public void user_482_select_application_for_field_in_maintenace_screen_under_wirak_application() throws Throwable {
		ApplicationFor = testData.get("ApplicationFor");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainApplicationForDropdown());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.mainApplicationForDropdown(), ApplicationFor);

	}

	@And("User_482 enter the CIF No in main info tab under WIRAK Application$")
	public void user_482_enter_the_cif_no_in_main_info_tab_under_wirak_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainCIFNo());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.mainCIFNo());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.mainCIFNo());
		for (int i = 1; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.mainCIFNo().clear();
				applicationForFinancialFacilityObj.mainCIFNo().sendKeys(testData.get("CIFNO").trim());
				applicationForFinancialFacilityObj.mainCIFNo().sendKeys(Keys.TAB);
				System.out.println(testData.get("CIFNO").trim());
				break;

			} catch (Exception e) {
				// TODO: handle exception
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

	@And("^User_482 enter the facility type in main info tab under WIRAK Application$")
	public void user_482_enter_the_facility_type_in_main_info_tab_under_wirak_application() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.mainFacilityType());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.mainFacilityType());
				applicationForFinancialFacilityObj.mainFacilityType().clear();
				applicationForFinancialFacilityObj.mainFacilityType().sendKeys(testData.get("FacilityType"));// .sendKeys("514");
				applicationForFinancialFacilityObj.mainFacilityType().sendKeys(Keys.TAB);
				System.out.println(testData.get("FacilityType"));

				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
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

	@And("User_482 selects the Revolviing On Off from DropDown")
	public void User_482_selects_the_Revolviing_On_Off_from_DropDown() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainCountryOfFinancingRevolvingOneoffDropDown());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.mainCountryOfFinancingRevolvingOneoffDropDown(), "One-Off");
	}

	@And("^User_482 enter the country of financing in main info tab under WIRAK Application$")
	public void user_482_enter_the_country_of_financing_in_main_info_tab_under_wirak_application() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.mainCountryOfFinancing());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.mainCountryOfFinancing());
				applicationForFinancialFacilityObj.mainCountryOfFinancing()
						.sendKeys(testData.get("CountryofFinancing"));
				applicationForFinancialFacilityObj.mainCountryOfFinancing().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
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

	@And("^User_482 clicks on the additional details tab under WIRAK Application$")
	public void user_482_clicks_on_the_additional_details_tab_under_wirak_application() throws Throwable {

		for (int i = 0; i < 2000; i++) {
			if (applicationForFinancialFacilityObj.mainAdditionalTab().isDisplayed()) {
				try {
					applicationForFinancialFacilityObj.mainAdditionalTab().click();
					break;
				} catch (Exception e) {

				}

			}
		}

	}

	@And("^User Validate Min value configured in fms param facility type$")
	public void user_validate_min_value_configured_in_fms_param_facility_type() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Min Value"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.minValueValidation());
		Assert.assertTrue(applicationForFinancialFacilityObj.minValueValidation().isDisplayed());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
	}

	@And("^User Validate Max value configured in fms param facility type$")
	public void user_validate_max_value_configured_in_fms_param_facility_type() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().clear();
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Max Value"));
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.financeAmountRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.maxValueValidation());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.maxValueValidation());
		Assert.assertTrue(applicationForFinancialFacilityObj.maxValueValidation().isDisplayed());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okbuttonInFacilityValuePopUp());
	}

	// *********************************************down payment field
	// validate***********************************************//
	@Then("^User Enter downpayment percentage and validate downpayment value automatically adjusted$")
	public void user_enter_downpayment_percentage_and_validate_downpayment_value_automatically_adjusted()
			throws Throwable {
		String totalValue = "1000";
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentPercentage());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentPercentage());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentPercentage());
		applicationForFinancialFacilityObj.downPaymentPercentage().sendKeys("10");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentValue());
		String downpaymentValue = "";
		for (int i = 0; i < 200; i++) {
			downpaymentValue = applicationForFinancialFacilityObj.downPaymentValue().getAttribute("prevvalue");
			if (!downpaymentValue.equalsIgnoreCase("0") && !downpaymentValue.isBlank() && !downpaymentValue.isEmpty()) {
				break;
			}
		}
		System.out.println(downpaymentValue);
		String[] split = downpaymentValue.split("[.]");
		String finaldownpaymentValue = split[0];
		if (finaldownpaymentValue.contains(",")) {
			finaldownpaymentValue = finaldownpaymentValue.replace(",", "");
		}
		System.out.println(Integer.toString((10 / Integer.parseInt(totalValue)) * 100 * Integer.parseInt(totalValue)));
		Assert.assertEquals(finaldownpaymentValue,
				Integer.toString((10 / Integer.parseInt(totalValue)) * 100 * Integer.parseInt(totalValue)));

	}

	@Then("^User Enter downpayment value and validate downpayment percentage automatically adjusted$")
	public void user_enter_downpayment_value_and_validate_downpayment_percentage_automatically_adjusted()
			throws Throwable {
		String totalValue = "1000";
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentValue());
		applicationForFinancialFacilityObj.downPaymentValue().sendKeys("100");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentPercentage());
		String downpaymentPercentage = applicationForFinancialFacilityObj.downPaymentPercentage()
				.getAttribute("prevvalue");
		System.out.println(downpaymentPercentage);
		String[] split = downpaymentPercentage.split(".");
		String finaldownpaymentpercentage = split[0];
		System.out.println(finaldownpaymentpercentage);
		System.out.println(Integer.toString(Integer.parseInt(totalValue) / 100));
		Assert.assertEquals(finaldownpaymentpercentage, Integer.toString(Integer.parseInt(totalValue) / 100));
	}

	@Then("^User Enter downpayment value greater than total value system should throw validation$")
	public void user_enter_downpayment_value_greater_than_total_value_system_should_throw_validation()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentValue());
		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.downPaymentValue().sendKeys("1000000");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.downPaymentValue());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentValue());
		for (int i = 0; i < 200; i++) {
			try {
				applicationForFinancialFacilityObj.downPaymentValue().sendKeys("1000000");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentGreaterThanTotalAmountValidation());
		Assert.assertTrue(
				applicationForFinancialFacilityObj.downPaymentGreaterThanTotalAmountValidation().isDisplayed());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentPopUpOk());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentPopUpOk());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentPopUpOk());
	}

	@Then("^User Enter downpayment to vendor percentage and validate downpayment to vendor value automatically adjusted$")
	public void user_enter_downpayment_to_vendor_percentage_and_validate_downpayment_to_vendor_value_automatically_adjusted()
			throws Throwable {
		String totalValue = "1000";
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		applicationForFinancialFacilityObj.downPaymentToVendorPercentage().sendKeys("10");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorValue());
		String downPaymentToVendorValue = applicationForFinancialFacilityObj.downPaymentToVendorValue()
				.getAttribute("prevvalue");
		System.out.println(downPaymentToVendorValue);
		String[] split = downPaymentToVendorValue.split(".");
		String finaldownPaymentToVendorValue = split[0].replace(",", "");
		System.out.println(finaldownPaymentToVendorValue);
		System.out.println(Integer.toString((10 / Integer.parseInt(totalValue)) * 100 * Integer.parseInt(totalValue)));
		Assert.assertEquals(finaldownPaymentToVendorValue,
				Integer.toString((10 / Integer.parseInt(totalValue)) * 100 * Integer.parseInt(totalValue)));
	}

	@Then("^User Enter downpayment to vendor value and validate downpayment to vendor percentage automatically adjusted$")
	public void user_enter_downpayment_to_vendor_value_and_validate_downpayment_to_vendor_percentage_automatically_adjusted()
			throws Throwable {
		String totalValue = "1000";
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorValue());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorValue());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorValue());
		applicationForFinancialFacilityObj.downPaymentValue().sendKeys("100");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		String downpaymentToVendorPercentage = applicationForFinancialFacilityObj.downPaymentToVendorPercentage()
				.getAttribute("prevvalue");
		System.out.println(downpaymentToVendorPercentage);
		String[] split = downpaymentToVendorPercentage.split(".");
		String finaldownpaymentToVendorPercentage = split[0];
		System.out.println(finaldownpaymentToVendorPercentage);
		System.out.println(Integer.toString(Integer.parseInt(totalValue) / 100));
		Assert.assertEquals(finaldownpaymentToVendorPercentage, Integer.toString(Integer.parseInt(totalValue) / 100));
	}

	@Then("^User Validate total downpayment percentage and total downpayment value$")
	public void user_validate_total_downpayment_percentage_and_total_downpayment_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentPercentage());
		String downpaymentPercentage = applicationForFinancialFacilityObj.downPaymentPercentage()
				.getAttribute("prevvalue");
		System.out.println(downpaymentPercentage);
		String[] split = downpaymentPercentage.split(".");
		String finaldownpaymentpercentage = split[0];
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		String downpaymentToVendorPercentage = applicationForFinancialFacilityObj.downPaymentToVendorPercentage()
				.getAttribute("prevvalue");
		System.out.println(downpaymentToVendorPercentage);
		String[] split1 = downpaymentToVendorPercentage.split(".");
		String finaldownpaymentToVendorPercentage = split1[0];
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalDownPaymentPercentage());
		Assert.assertEquals(applicationForFinancialFacilityObj.totalDownPaymentPercentage().getAttribute("prevalue"),
				finaldownpaymentToVendorPercentage + finaldownpaymentpercentage);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentPercentage());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentPercentage());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentPercentage());
		applicationForFinancialFacilityObj.downPaymentPercentage().sendKeys("10");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentValue());
		String downpaymentValue = applicationForFinancialFacilityObj.downPaymentValue().getAttribute("prevvalue");
		System.out.println(downpaymentValue);
		String[] split2 = downpaymentValue.split(".");
		String finaldownpaymentValue = split2[0].replace(",", "");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentToVendorPercentage());
		applicationForFinancialFacilityObj.downPaymentToVendorPercentage().sendKeys("10");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.downPaymentRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorValue());
		String downPaymentToVendorValue = applicationForFinancialFacilityObj.downPaymentToVendorValue()
				.getAttribute("prevvalue");
		System.out.println(downPaymentToVendorValue);
		String[] split3 = downPaymentToVendorValue.split(".");
		String finaldownPaymentToVendorValue = split3[0].replace(",", "");
		System.out.println(finaldownPaymentToVendorValue);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalDownPaymentValue());
		Assert.assertEquals(applicationForFinancialFacilityObj.totalDownPaymentPercentage().getAttribute("prevalue"),
				finaldownpaymentValue + finaldownPaymentToVendorValue);
	}

	@And("^User_482 Enter total value under additional details tab in WIFAK Application$")
	public void user_482_enter_total_value_under_additional_details_tab_in_wifak_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.mainAdditionalTabTotalValue());
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys(testData.get("TotalValue"));
		applicationForFinancialFacilityObj.mainAdditionalTabTotalValue().sendKeys(Keys.TAB);

//		for (int i = 0; i < 10; i++) {
//			try {
//				waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.displayProgIcon());
//				System.out.println("Progress Bar Appeared");
//				wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.displayProgIcon()));
//				System.out.println("Progress Bar Disappeard");
//				break;
//
//			} catch (Exception e) {
//
//			}
//
//		}

	}

	// *************************************************Economic and Sub economic
	// sector *****************************//
	@And("^User Click CSM parameter Main Menu$")
	public void user_click_csm_parameter_main_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.parameterMainMenu_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.parameterMainMenu_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.parameterMainMenu_CSM());
	}

	@And("^User Click CIF paramter Sub Menu$")
	public void user_click_cif_paramter_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CIFparameterSubMenu_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.CIFparameterSubMenu_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.CIFparameterSubMenu_CSM());
	}

	@And("^User Click Economic Sector SubMenu$")
	public void user_click_economic_sector_submenu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.economicSectorMenu_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.economicSectorMenu_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.economicSectorMenu_CSM());
	}

	@And("^User Click Maintenace Screen in Economic Sector$")
	public void user_click_maintenace_screen_in_economic_sector() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.maintenanceEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.maintenanceEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.maintenanceEconomicSector_CSM());
	}

	@And("^User Click Maintenace Screen in Sub Economic Sector$")
	public void user_click_maintenace_screen_in_sub_economic_sector() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.maintenanceSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.maintenanceSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.maintenanceSubEconomicSector_CSM());
	}

	@And("^User Enter sector code in Economic Sector Maintenace Screen$")
	public void user_enter_sector_code_in_economic_sector_maintenace_screen() throws Throwable {
		Random random = new Random();
		int randomNumber = random.nextInt(500 - 50) + 500;
		excelData.updateTestData(testExecutionData.get("Data Set ID"), "SectorCode", String.valueOf(randomNumber));
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.sectorCodeEconomicSector_CSM());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.sectorCodeEconomicSector_CSM());
				applicationForFinancialFacilityObj.sectorCodeEconomicSector_CSM()
						.sendKeys(String.valueOf(randomNumber));
				break;

			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User Enter brief name in Economic Sector Maintenace Screen$")
	public void user_enter_brief_name_in_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.briefNameEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.briefNameEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.briefNameEconomicSector_CSM());
		applicationForFinancialFacilityObj.briefNameEconomicSector_CSM().sendKeys(testData.get("BriefName"));
	}

	@And("^User Enter brief name Arab in Economic Sector Maintenace Screen$")
	public void user_enter_brief_name_arab_in_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.briefNameArabEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.briefNameArabEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.briefNameArabEconomicSector_CSM());
		applicationForFinancialFacilityObj.briefNameArabEconomicSector_CSM().sendKeys(testData.get("BriefName"));
	}

	@And("^User Click Save button in Economic Sector Maintenace Screen$")
	public void user_click_save_button_in_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.saveButtonEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.saveButtonEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.saveButtonEconomicSector_CSM());
	}

	@And("^User click Approve Screen In Economic Sector$")
	public void user_click_approve_screen_in_economic_sector() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approveScreenEconomicSector_CSM());
	}

	@And("^User click aprove button in Economic Sector Maintenace Screen$")
	public void user_click_aprove_button_in_economic_sector_maintenace_screen() throws Throwable {
		// seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveButtonEconomicSector_CSM());
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.approveButtonEconomicSector_CSM());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.approveButtonEconomicSector_CSM());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User click Approve Screen In Sub Economic Sector$")
	public void user_click_approve_screen_in_sub_economic_sector() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveScreenSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveScreenSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approveScreenSubEconomicSector_CSM());
	}

	@And("^User click aprove button in Sub Economic Sector Maintenace Screen$")
	public void user_click_aprove_button_in_sub_economic_sector_maintenace_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getJavascriptHelper()
						.JSEClick(applicationForFinancialFacilityObj.approveButtonSubEconomicSector_CSM());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User Click Sub Economic Sector SubMenu$")
	public void user_click_sub_economic_sector_submenu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.subEconomicSectorMenu_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.subEconomicSectorMenu_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.subEconomicSectorMenu_CSM());
	}

	@And("^User Enter brief name in Sub Economic Sector Maintenace Screen$")
	public void user_enter_brief_name_in_sub_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.briefNameSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.briefNameSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.briefNameSubEconomicSector_CSM());
		applicationForFinancialFacilityObj.briefNameSubEconomicSector_CSM().sendKeys(testData.get("BriefName"));
	}

	@And("^User Enter brief name Arab in Sub Economic Sector Maintenace Screen$")
	public void user_enter_brief_name_arab_in_sub_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.briefNameArabSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.briefNameArabSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.briefNameArabSubEconomicSector_CSM());
		applicationForFinancialFacilityObj.briefNameArabSubEconomicSector_CSM().sendKeys(testData.get("BriefName"));

	}

	@And("^User Click Save button in Sub Economic Sector Maintenace Screen$")
	public void user_click_save_button_in_sub_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.saveButtonInSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.saveButtonInSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.saveButtonInSubEconomicSector_CSM());
	}

	@And("^User Search sector code in Economic Sector Approve Screen$")
	public void user_search_sector_code_in_economic_sector_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM());
		applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM()
				.sendKeys(testData.get("SectorCode"));
		applicationForFinancialFacilityObj.searchCodeApproveScreenEconomicSector_CSM().sendKeys(Keys.ENTER);
		String xpath = "//td[text()='" + testData.get("SectorCode") + "']";
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

	@And("^User Search sector code in Sub Economic Sector Approve Screen$")
	public void user_search_sector_code_in_sub_economic_sector_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM());
		applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM()
				.sendKeys(testData.get("SectorCode"));
		applicationForFinancialFacilityObj.SearchCodeInApproveScreenSubEconomicSector_CSM().sendKeys(Keys.ENTER);
		String xpath = "//td[text()='" + testData.get("SectorCode") + "']";
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

	@And("^User Select the searched record in Economic Sector Approve Screen$")
	public void user_select_the_searched_record_in_economic_sector_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectSearchedCodeApproveScreenEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeApproveScreenEconomicSector_CSM());
	}

	@And("^User Select sector key in Sub economic Sector$")
	public void user_select_sector_key_in_sub_economic_sector() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getDropDownHelper().SelectUsingVisibleText(
						applicationForFinancialFacilityObj.selectSectorKeySubEconomicSector_CSM(),
						testData.get("SectorCode") + " " + testData.get("BriefName"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User Enter sub sector code in Sub Economic Sector Maintenace Screen$")
	public void user_enter_sub_sector_code_in_sub_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM());
		applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM().sendKeys(testData.get("SectorCode"));
		applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM().sendKeys(Keys.ENTER);
		for (int i = 0; i < 50; i++) {
			try {
				applicationForFinancialFacilityObj.subSectorCodeSubEconomicSector_CSM().getAttribute("prevvalue");
				break;
			} catch (Exception e) {
				if (i == 49) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User Select the searched record in Sub Economic Approve Screen$")
	public void user_select_the_searched_record_in_sub_economic_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectSearchedCodeApproveScreenSubEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeApproveScreenSubEconomicSector_CSM());
	}

	@And("^User Click ok button in confirm pop up Economic Sector Maintenace Screen$")
	public void user_click_ok_button_in_confirm_pop_up_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
	}

	@And("^User Click ok button in Sucess pop up Economic Sector Maintenace Screen$")
	public void user_click_ok_button_in_sucess_pop_up_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
	}

	@And("^User Click ok button in confirm pop up Sub Economic Sector Maintenace Screen$")
	public void user_click_ok_button_in_confirm_pop_up_sub_economic_sector_maintenace_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okButtonInConfirmEconomicSector_CSM());
	}

	@And("^User Click ok button in Sucess pop up Sub Economic Sector Maintenace Screen$")
	public void user_click_ok_button_in_sucess_pop_up_sub_economic_sector_maintenace_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUpEconomicSector_CSM());
				break;
			} catch (Exception e) {

			}
		}

	}

	@Given("^Test Ended$")
	public void test_ended() throws Throwable {
		System.out.println("Excel Test runner executed");
	}

	@And("^User Search and Validate created Economic sector code refletced in Application screen$")
	public void user_search_and_validate_created_economic_sector_code_refletced_in_application_screen()
			throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getJavascriptHelper()
						.scrollIntoView(applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen().sendKeys(testData.get("SectorCode"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen());
		String subsector = "";
		for (int i = 0; i < 5000; i++) {
			try {
				subsector = applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen()
						.getAttribute("prevvalue");
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// Assert.assertEquals(subsector,testData.get("SectorCode"));
	}

	@And("^User Search and Validate created Sub Economic sector code refletced in Application screen$")
	public void user_search_and_validate_created_sub_economic_sector_code_refletced_in_application_screen()
			throws Throwable {
		applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen()
				.sendKeys(testData.get("SectorCode"));
		// seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.sectorCodeInrequestForFinancingScreen());
		String subsector = "";
		for (int i = 0; i < 5000; i++) {
			try {
				subsector = applicationForFinancialFacilityObj.subSectorCodeInrequestForFinancingScreen()
						.getAttribute("prevvalue");

				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// Assert.assertEquals(subsector,testData.get("SectorCode"));
	}

	@And("^User get the system date$")
	public void user_get_the_system_date() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.systemDate());
		date = applicationForFinancialFacilityObj.systemDate().getText();
	}

	// **************************************************************repayment
	// plan********************************//
	@And("^User_482 click search icon in Maintenance screen Request for financing$")
	public void user_482_click_search_icon_in_maintenance_screen_request_for_financing() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchIconInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchIconInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchIconInMaintenanceRequestForFinancing());
	}

	@And("^User Search code in Maintenance screen Request for financing$")
	public void user_search_code_in_maintenance_screen_request_for_financing() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());
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

	@And("^User Click and search final approval record in maintenance screen$")
	public void user_click_and_search_final_approval_record_in_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys("Final");
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys(Keys.ENTER);
	}

	@And("^User Select searched record in Maintenance screen Request for financing$")
	public void user_select_searched_record_in_maintenance_screen_request_for_financing() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());

	}

	@And("^User select sublimit details in Maintenance screen Request for financing$")
	public void user_select_sublimit_details_in_maintenance_screen_request_for_financing() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassInDisbursementSublimit());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.productClassInDisbursementSublimit());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.productClassInDisbursementSublimit());
	}

	@And("^User click repayment plan in Maintenance screen Request for financing$")
	public void user_click_repayment_plan_in_maintenance_screen_request_for_financing() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.repaymentPlanOption());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.repaymentPlanOption());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.repaymentPlanOption());
	}

	@And("^User enter no of payments in repayment plan$")
	public void user_enter_no_of_payments_in_repayment_plan() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().clear();
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().sendKeys(testData.get("No of Payments"));
		applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().sendKeys(Keys.TAB);

		for (int i = 0; i < 50; i++) {
			try {
				if (!applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().getAttribute("prevvalue")
						.isBlank()
						&& !applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan().getAttribute("prevvalue")
								.isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}

		}

	}

	@And("^User enter pay every in repayment plan$")
	public void user_enter_pay_every_in_repayment_plan() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.payEveryInrepaymentPlan());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.payEveryInrepaymentPlan());
				applicationForFinancialFacilityObj.payEveryInrepaymentPlan().clear();
				break;
			} catch (Exception e) {

			}

		}
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		applicationForFinancialFacilityObj.payEveryInrepaymentPlan().sendKeys(testData.get("Pay Every"));
		applicationForFinancialFacilityObj.payEveryInrepaymentPlan().sendKeys(Keys.TAB);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.noOfPaymentsInrepaymentPlan());
		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.payEveryInrepaymentPlan().getAttribute("prevvalue").isBlank()
						&& !applicationForFinancialFacilityObj.payEveryInrepaymentPlan().getAttribute("prevvalue")
								.isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("^User Validate the Maturity Date in repayment plan$")
	public void user_validate_the_maturity_date_in_repayment_plan() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.maturityDateInrepaymentPlan());
		String maturityDate = null;
		for (int i = 0; i < 20; i++) {
			maturityDate = applicationForFinancialFacilityObj.maturityDateInrepaymentPlan().getAttribute("prevvalue")
					.substring(0, 10);
		}

		System.out.println(maturityDate);
		String[] split = date.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		String substring = split[1].substring(0, 3);
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("MMM").withLocale(Locale.US);
		TemporalAccessor temporalAccessor = dtFormatter.parse(substring);
		// System.out.println(temporalAccessor.get(ChronoField.MONTH_OF_YEAR));
		LocalDate date = LocalDate.of(Integer.parseInt(split[2]), temporalAccessor.get(ChronoField.MONTH_OF_YEAR),
				Integer.parseInt(split[0]));
		LocalDate plusMonths = date.plusMonths(28);
		System.out.println(plusMonths);
		Assert.assertEquals(plusMonths.toString(), maturityDate);

	}

	// ***************************request for financing (Purpose of
	// financing)***************************************//
	@And("^User Click FMS parameter Main Menu$")
	public void user_click_fms_parameter_main_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.parameterMainMenu_FMS());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.parameterMainMenu_FMS());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.parameterMainMenu_FMS());
	}

	@And("^User click purpose of Financing Main Menu$")
	public void user_click_purpose_of_financing_main_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.purposeOfFinancingSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.purposeOfFinancingSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.purposeOfFinancingSubMenu());
	}

	@And("^User Click the Maintenance Screen In purpose of Financing$")
	public void user_click_the_maintenance_screen_in_purpose_of_financing() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.maintenanceInPurposeOfFinancingSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.maintenanceInPurposeOfFinancingSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.maintenanceInPurposeOfFinancingSubMenu());
	}

	@And("^User enter the code in Maintenance Screen under purpose of Financing sub menu$")
	public void user_enter_the_code_in_maintenance_screen_under_purpose_of_financing_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.codeInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.codeInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.codeInMaintenancePurposeOfFinancing());
		Random random = new Random();
		randomNumber = random.nextInt(5000 - 1) + 5000;
		System.out.println(randomNumber);
		requestForFinancingData.updateTestData(testExecutionData.get("Data Set ID"), "Purpose Of Financing",
				String.valueOf(randomNumber));
		applicationForFinancialFacilityObj.codeInMaintenancePurposeOfFinancing().sendKeys(String.valueOf(randomNumber));
	}

	@And("^User enter additional number in Maintenance Screen under purpose of Financing sub menu$")
	public void user_enter_additional_number_in_maintenance_screen_under_purpose_of_financing_sub_menu()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
		Random random = new Random();
		int randomNumber = random.nextInt(5000 - 1) + 5000;
		applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing()
				.sendKeys(String.valueOf(randomNumber));
	}

	@And("^User enter description in Maintenance Screen under purpose of Financing sub menu$")
	public void user_enter_description_in_maintenance_screen_under_purpose_of_financing_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.descriptionInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.descriptionInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.descriptionInMaintenancePurposeOfFinancing());
		applicationForFinancialFacilityObj.descriptionInMaintenancePurposeOfFinancing().sendKeys("Test" + randomNumber);
	}

	@And("^User click product class option in Maintenance Screen under purpose of Financing sub menu$")
	public void user_click_product_class_option_in_maintenance_screen_under_purpose_of_financing_sub_menu()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.productClassInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.productClassInMaintenancePurposeOfFinancing());
	}

	@And("^User click add icon in product class option$")
	public void user_click_add_icon_in_product_class_option() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.addProductClassInProductClassOptions());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.addProductClassInProductClassOptions());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.addProductClassInProductClassOptions());
	}

	@And("^User User add product class code in product class option$")
	public void user_user_add_product_class_code_in_product_class_option() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.clickToEnterProductCodeInProductOptions());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.clickToEnterProductCodeInProductOptions());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.clickToEnterProductCodeInProductOptions());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchProductCodeInProductOptions());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchProductCodeInProductOptions());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchProductCodeInProductOptions());
		applicationForFinancialFacilityObj.searchProductCodeInProductOptions().sendKeys("1");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.additionalNumberInMaintenancePurposeOfFinancing());

		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.productClassNameValidationInPurposeOfFinancing().getText()
						.isBlank()
						&& !applicationForFinancialFacilityObj.productClassNameValidationInPurposeOfFinancing()
								.getText().isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("^User click save button in Maintenance Screen under purpose of Financing sub menu$")
	public void user_click_save_button_in_maintenance_screen_under_purpose_of_financing_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.saveButtonInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.saveButtonInMaintenancePurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.saveButtonInMaintenancePurposeOfFinancing());
	}

	@And("^User click ok button in Waring popup$")
	public void user_click_ok_button_in_waring_popup() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okButtonInWarningPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okButtonInWarningPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okButtonInWarningPopUp());
	}

	@And("^User search code in approve screen purpose of Financing$")
	public void user_search_code_in_approve_screen_purpose_of_financing() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing());
		applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing()
				.sendKeys(String.valueOf(randomNumber));
		applicationForFinancialFacilityObj.searchCodeInApproveScreenPurposeOfFinancing().sendKeys(Keys.ENTER);
	}

	@And("^User Select searched record in approve screen purpose of Financing$")
	public void user_select_searched_record_in_approve_screen_purpose_of_financing() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectSearchedCodeInApproveScreenPurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.selectSearchedCodeInApproveScreenPurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeInApproveScreenPurposeOfFinancing());
	}

	@And("^User click approve button in selected record purpose of Financing$")
	public void user_click_approve_button_in_selected_record_purpose_of_financing() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(
						applicationForFinancialFacilityObj.approveButtonInApproveScreenPurposeOfFinancing());
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.approveButtonInApproveScreenPurposeOfFinancing());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User Validate the created purpose of financing record reflected in application$")
	public void user_validate_the_created_purpose_of_financing_record_reflected_in_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreen());
		applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreen()
				.sendKeys(testData.get("Purpose Of Financing"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreenRandomClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreenRandomClick());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsPopUpScreenRandomClick());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation());
		for (int i = 0; i < 200; i++) {
			if (!applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation()
					.getAttribute("prevvalue").isBlank()
					&& !applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation()
							.getAttribute("prevvalue").isEmpty()) {
				break;
			}
		}

		Assert.assertTrue(!applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation()
				.getAttribute("prevvalue").isBlank()
				&& !applicationForFinancialFacilityObj.purposeOfFinancingInLimitDetailsValidation()
						.getAttribute("prevvalue").isEmpty());
	}

	@And("^User click ok button in Information Pop up$")
	public void user_click_ok_button_in_information_pop_up() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.okButtonInInformationPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.okButtonInInformationPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.okButtonInInformationPopUp());
	}

	@And("^User click approve Screen in purpose of Financing sub menu$")
	public void user_click_approve_screen_in_purpose_of_financing_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveSubMenuInPurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveSubMenuInPurposeOfFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approveSubMenuInPurposeOfFinancing());
	}

	// ************************************************ Decimal
	// Value******************************************************
	@And("^Open Disburment or Sublimit record$")
	public void open_disburment_or_sublimit_record() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.openDisbursemnetSublimitProductClassRecord());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.openDisbursemnetSublimitProductClassRecord());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.openDisbursemnetSublimitProductClassRecord());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.openDisbursemnetSublimitProductClassRecord());
	}

	@And("^User Validate Down payment percentage In Limit details contains decimal value$")
	public void user_validate_down_payment_percentage_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentPercentageInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentPercentageInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Down payment Amount In Limit details contains decimal value$")
	public void user_validate_down_payment_amount_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentAmountInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentAmountInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Total facility Value In Limit details contains decimal value$")
	public void user_validate_total_facility_value_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalFacilityValueInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.totalFacilityValueInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Down payment to Vendor percentage In Limit details contains decimal value$")
	public void user_validate_down_payment_to_vendor_percentage_in_limit_details_contains_decimal_value()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorPercentageInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentToVendorPercentageInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Down payment to Vendor In Limit details contains decimal value$")
	public void user_validate_down_payment_to_vendor_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.downPaymentToVendorAmountInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.downPaymentToVendorAmountInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Total Down payment percentage In Limit details contains decimal value$")
	public void user_validate_total_down_payment_percentage_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalDownPaymentPercentageInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.totalDownPaymentPercentageInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Total Down payment Value In Limit details contains decimal value$")
	public void user_validate_total_down_payment_value_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalDownPaymentAmountInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.totalDownPaymentAmountInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate floor rate percentage key In Limit details contains decimal value$")
	public void user_validate_floor_rate_percentage_key_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.floorRatePercentageKeyInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.floorRatePercentageKeyInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.floorRatePercentageKeyInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate sub limit lower limit percentage key In Limit details contains decimal value$")
	public void user_validate_sub_limit_lower_limit_percentage_key_in_limit_details_contains_decimal_value()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate sub limit lower limit amount key In Limit details contains decimal value$")
	public void user_validate_sub_limit_lower_limit_amount_key_in_limit_details_contains_decimal_value()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Amounts Utilized In Limit details contains decimal value$")
	public void user_validate_amounts_utilized_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.amountsUtilizedInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.amountsUtilizedInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.amountsUtilizedInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Amounts Current Outstanding In Limit details contains decimal value$")
	public void user_validate_amounts_current_outstanding_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.currenOutstandingInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.currenOutstandingInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.currenOutstandingInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Amounts Un Utilized In Limit details contains decimal value$")
	public void user_validate_amounts_un_utilized_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.unUtilizedInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.unUtilizedInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.unUtilizedInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Amounts In Limit details contains decimal value$")
	public void user_validate_amounts_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.amountsInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.amountsInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.amountsInLimitDetailsPopUpScreen().getAttribute("nbformat")
				.contains(".0"));
	}

	@And("^User Validate New Global Limit In Limit details contains decimal value$")
	public void user_validate_new_global_limit_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.newGlobalLimitInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.newGlobalLimitInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.newGlobalLimitInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Total Global Limit In Limit details contains decimal value$")
	public void user_validate_total_global_limit_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalGlobalLimitInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.totalGlobalLimitInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.totalGlobalLimitInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Margin New Value In Limit details contains decimal value$")
	public void user_validate_margin_new_value_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.marginNewInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.marginNewInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.marginNewInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Margin Approved In Limit details contains decimal value$")
	public void user_validate_margin_approved_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.marginApprovedInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.marginApprovedInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.marginApprovedInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Total Existing In Limit details contains decimal value$")
	public void user_validate_total_existing_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalExistingInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.totalExistingInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.totalExistingInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Total New In Limit details contains decimal value$")
	public void user_validate_total_new_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalNewInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.totalNewInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.totalNewInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate Total Approved In Limit details contains decimal value$")
	public void user_validate_total_approved_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalApprovedInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.totalApprovedInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.totalApprovedInLimitDetailsPopUpScreen()
				.getAttribute("nbformat").contains(".0"));
	}

	@And("^User Validate CV Value In Limit details contains decimal value$")
	public void user_validate_cv_value_in_limit_details_contains_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.cvValueInLimitDetailsPopUpScreen());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.cvValueInLimitDetailsPopUpScreen());
		Assert.assertTrue(applicationForFinancialFacilityObj.cvValueInLimitDetailsPopUpScreen().getAttribute("nbformat")
				.contains(".0"));
	}

	@And("^User Click Grade Evaluation Factors Sub Menu$")
	public void user_click_grade_evaluation_factors_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.gradingEvaluationFactorsSubMenu());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.gradingEvaluationFactorsSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.gradingEvaluationFactorsSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.gradingEvaluationFactorsSubMenu());
	}

	@And("^User Click Maintenance Screen In Grade Evaluation Factor$")
	public void user_click_maintenance_screen_in_grade_evaluation_factor() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.maintenamceScreenIngradingEvaluationFactors());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.maintenamceScreenIngradingEvaluationFactors());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.maintenamceScreenIngradingEvaluationFactors());
	}

	@And("^User Validate Weight field should accept decimal value$")
	public void user_validate_weight_field_should_accept_decimal_value() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen());
		applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen()
				.sendKeys(testData.get("Weight Field"));
		applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen().sendKeys(Keys.TAB);
		for (int i = 0; i < 200; i++) {
			try {
				if (!applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen()
						.getAttribute("prevvalue").isEmpty()
						&& !applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen()
								.getAttribute("prevvalue").isBlank()) {
					break;
				}

			} catch (Exception e) {

			}
		}
		Assert.assertEquals(applicationForFinancialFacilityObj.weightFieldIngradingEvaluationFactorsMaintenaceScreen()
				.getAttribute("prevvalue"), "123.23");
	}

//****************************************************Total yield auto pop pulate*****************************//
	@And("^User_482 click Limit Details tab in WIFAK Application$")
	public void user_482_click_limit_details_tab_in_wifak_application() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.limitDetailsInWIFAKApplication());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.limitDetailsInWIFAKApplication());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_482 click add icon in limit details under WIFAK Application$")
	public void user_482_click_add_icon_in_limit_details_under_wifak_application() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsWIFAKApplication());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_482 select the product class in limit details under WIFAK Application$")
	public void user_482_select_the_product_class_in_limit_details_under_wifak_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
		applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication()
				.sendKeys(testData.get("ProductClass"));
		// applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication().sendKeys(Keys.ENTER);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.typeInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.typeInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.typeInLimitDetailsWIFAKApplication());
		for (int i = 0; i < 2000; i++) {
			try {
				if (!applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication()
						.getAttribute("prevvalue").isBlank()
						|| !applicationForFinancialFacilityObj
								.productClassNameValidationInLimitDetailsWIFAKApplication().getAttribute("prevvalue")
								.isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@Given("User_482 check clean checkbox options in limit details under WIFAK Application")
	public void user_482_check_clean_checkbox_options_in_limit_details_under_wifak_application() {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(
						applicationForFinancialFacilityObj.cleanCheckBoxInLimitDetailsWIFAKApplication());
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.cleanCheckBoxInLimitDetailsWIFAKApplication());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User Enter Yield details value in limit details under WIFAK Application$")
	public void user_enter_yield_details_value_in_limit_details_under_wifak_application() throws Throwable {
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication());
		applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication().sendKeys("30");
		applicationForFinancialFacilityObj.yieldDetailsInLimitDetailsWIFAKApplication().sendKeys(Keys.ENTER);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.marginRateInLimitDetailsWIFAKApplication());
		applicationForFinancialFacilityObj.marginRateInLimitDetailsWIFAKApplication().click();
	}

	@And("^User Validate Total Yield is Calculated based on Yield details and Margin Rate$")
	public void user_validate_total_yield_is_calculated_based_on_yield_details_and_margin_rate() throws Throwable {
		// Thread.sleep(1000);
		// seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication());
		for (int i = 0; i < 500; i++) {
			try {
				if (!applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication()
						.getAttribute("prevvalue").split("[.]")[0].equals("0")
						&& !applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication()
								.getAttribute("prevvalue").isBlank()
						&& !applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication()
								.getAttribute("prevvalue").isEmpty()) {
					break;
				}

			} catch (Exception e) {

			}
		}
		String totalYield = applicationForFinancialFacilityObj.totalYieldInLimitDetailsWIFAKApplication()
				.getAttribute("prevvalue");
		String split = totalYield.split("[.]")[0];
		System.out.println(split);
		System.out.println(totalYield.split("[.]")[1]);
		String split1 = "";
		for (int i = 0; i < 200; i++) {
			try {
				// document.querySelector("#applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT").value
				split1 = (String) seleniumActions.getJavascriptHelper().executeScript("return document.querySelector"
						+ "(\"#applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT\").value");
				split1 = split1.split("[.]")[0];
				System.out.println(split1);
				break;
			} catch (Exception e) {

			}
		}

		int calculateTotalValue = 30 + Integer.parseInt(split1);
		Assert.assertEquals(Integer.parseInt(split), calculateTotalValue);
	}

	// ****************************floating
	// rate************************************************************************//
	@And("^User_482 select the floating rate in limit details under WIFAK Application$")
	public void user_482_select_the_floating_rate_in_limit_details_under_wifak_application() throws Throwable {
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.floatingRateInLimitDetailsWIFAKApplication());
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.floatingRateInLimitDetailsWIFAKApplication());
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.floatingRateInLimitDetailsWIFAKApplication());
				applicationForFinancialFacilityObj.floatingRateInLimitDetailsWIFAKApplication().sendKeys("41");
				applicationForFinancialFacilityObj.floatingRateInLimitDetailsWIFAKApplication().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.bankProfitShareInLimitDetailsWIFAKApplication());
//    	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.bankProfitShareInLimitDetailsWIFAKApplication());
//    	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.bankProfitShareInLimitDetailsWIFAKApplication());
		for (int i = 0; i < 2000; i++) {
			try {
				if (!applicationForFinancialFacilityObj.floatingRateNameValidationInLimitDetailsWIFAKApplication()
						.getAttribute("prevvalue").isBlank()
						|| !applicationForFinancialFacilityObj
								.floatingRateNameValidationInLimitDetailsWIFAKApplication().getAttribute("prevvalue")
								.isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^User_482 enter the floating rate periodicity in limit details under WIFAK Application$")
	public void user_482_enter_the_floating_rate_periodicity_in_limit_details_under_wifak_application()
			throws Throwable {
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.floatingRatePeriodicityInLimitDetailsWIFAKApplication());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.floatingRatePeriodicityInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.floatingRatePeriodicityInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.floatingRatePeriodicityInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().doubleClick(
				applicationForFinancialFacilityObj.floatingRatePeriodicityInLimitDetailsWIFAKApplication());
		applicationForFinancialFacilityObj.floatingRatePeriodicityInLimitDetailsWIFAKApplication().sendKeys("2");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.bankProfitShareInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.bankProfitShareInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.bankProfitShareInLimitDetailsWIFAKApplication());
	}

	@And("^User_482 select the floating rate periodicity type in limit details under WIFAK Application$")
	public void user_482_select_the_floating_rate_periodicity_type_in_limit_details_under_wifak_application()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication(),
				"Day(s)");
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication(),
				"Year(s)");
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication(),
				"Week(s)");
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication(),
				"Month(s)");
	}

	@Given("User_482 select the floating rate periodicity type in limit details under WIFAK Application Approve screen")
	public void user_482_select_the_floating_rate_periodicity_type_in_limit_details_under_wifak_application_approve_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication(),
				"Month(s)");
	}

	@And("^User_482 enter facility rating in main info tab under WIRAK Application$")
	public void user_482_enter_facility_rating_in_main_info_tab_under_wirak_application() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(
						applicationForFinancialFacilityObj.facilityRatingInMainInformationWIFAKApplication());
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.facilityRatingInMainInformationWIFAKApplication());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		applicationForFinancialFacilityObj.facilityRatingInMainInformationWIFAKApplication()
				.sendKeys(testData.get("Facility Rating"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.marketedByRandomClickInMainInformationTab());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.marketedByRandomClickInMainInformationTab());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.marketedByRandomClickInMainInformationTab());

	}

	@And("^User_482 click add icon in limit details popup under WIFAK Application$")
	public void user_482_click_add_icon_in_limit_details_popup_under_wifak_application() throws Throwable {
		Thread.sleep(1000);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUpWifakapplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUpWifakapplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.addButtonInLimitDetailsPopUpWifakapplication());
	}

	@And("^User_482 click document details tab under WIFAK Application$")
	public void user_482_click_document_details_tab_under_wifak_application() throws Throwable {

		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.documentDetailsUnderWIFAKApplication());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.documentDetailsUnderWIFAKApplication());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_482 click document details Btn under WIFAK Application$")
	public void user_482_click_document_details_btn_under_wifak_application() throws Throwable {

		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.AppDocumentChecklistKey());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.AppDocumentChecklistKey());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_482 enter solicitor name to select from look up in document details under WIFAK Application$")
	public void user_482_enter_solicitor_name_to_select_from_look_up_in_document_details_under_wifak_application()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.solicitorNameInDocumentDetails());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.solicitorNameInDocumentDetails());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.solicitorNameInDocumentDetails());
		applicationForFinancialFacilityObj.solicitorNameInDocumentDetails().sendKeys(testData.get("SolicitorName"));
	}

	@And("^User_482 enter Estimator name to select from look up in document details under WIFAK Application$")
	public void user_482_enter_estimator_name_to_select_from_look_up_in_document_details_under_wifak_application()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.estimatorNameInDocumentDetails());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.estimatorNameInDocumentDetails());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.estimatorNameInDocumentDetails());
		applicationForFinancialFacilityObj.estimatorNameInDocumentDetails().sendKeys(testData.get("EstimatorName"));
	}

	@And("^User_482 click Maininformation tab in WIFAK Application$")
	public void user_482_click_maininformation_tab_in_wifak_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainInformationTabUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainInformationTabUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.mainInformationTabUnderWIFAKApplication());
	}

	@And("^User_482 click save button in Main Info tab under WIFAK Application$")
	public void user_482_click_save_button_in_main_info_tab_under_wifak_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.saveButtonInWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.saveButtonInWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.saveButtonInWIFAKApplication());
	}

	@And("^User_482 click Validate button in Main Info tab under WIFAK Application$")
	public void user_482_click_validate_button_in_main_info_tab_under_wifak_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
				.validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication());
	}

	@Given("User_482 Click Approve Level 1 screen in application for financial facilities under WIFAK Application")
	public void user_482_click_approve_level_1_screen_in_application_for_financial_facilities_under_wifak_application() {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.AffApproveLevel1Reject());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.AffApproveLevel1Reject());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_482 click Limit Details in Approve level 1 under WIFAK Application")
	public void user_482_click_limit_details_in_approve_level_1_under_wifak_application() {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(
						applicationForFinancialFacilityObj.limitDetailsInWIFAKApplicationApproveLevel1());
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.limitDetailsInWIFAKApplicationApproveLevel1());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_482 open product class record in Limit details Approve level 1 under WIFAK Application")
	public void user_482_open_product_class_record_in_limit_details_approve_level_1_under_wifak_application() {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().doubleClick(
						applicationForFinancialFacilityObj.openProductClassRecordInLimitClassApproveLevel1());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_482 validate Floating rate code in Limit details popup Approve level 1 under WIFAK Application")
	public void user_482_validate_floating_rate_code_in_limit_details_popup_approve_level_1_under_wifak_application() {
		for (int i = 0; i < 2000; i++) {
			try {
				seleniumActions.getJavascriptHelper().scrollIntoView(
						applicationForFinancialFacilityObj.validateFloatingrateInWIFAKApplicationApproveLevel1());
				Assert.assertTrue(!applicationForFinancialFacilityObj
						.validateFloatingrateInWIFAKApplicationApproveLevel1().getAttribute("prevvalue").isBlank());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_482 Validate Floating rate name in Limit details popup Approve level 1 under WIFAK Application")
	public void user_482_validate_floating_rate_name_in_limit_details_popup_approve_level_1_under_wifak_application() {
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!applicationForFinancialFacilityObj
						.validateFloatingratePeriodicityInWIFAKApplicationApproveLevel1().getAttribute("prevvalue")
						.isBlank());
				Assert.assertTrue(!applicationForFinancialFacilityObj
						.validateFloatingratePeriodicityTypeInWIFAKApplicationApproveLevel1().getAttribute("prevvalue")
						.isBlank());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_482 Enter offer Expiration in Additional details under WIFAK Application")
	public void user_482_enter_offer_expiration_in_additional_details_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.offerExpirationMainAdditionalTab_WIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.offerExpirationMainAdditionalTab_WIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.offerExpirationMainAdditionalTab_WIFAKApplication());
		String currentDate;
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Date date1 = new Date();
		@SuppressWarnings("deprecation")
		int day = date1.getDay();
		if (day == 5 || day == 6 || day == 7) {
			LocalDate date = LocalDate.now();
			currentDate = date.plusDays(3).format(dtFormatter).toString();
		} else {
			currentDate = LocalDate.now().format(dtFormatter).toString();
		}
		applicationForFinancialFacilityObj.offerExpirationMainAdditionalTab_WIFAKApplication().sendKeys(currentDate);
		applicationForFinancialFacilityObj.offerExpirationMainAdditionalTab_WIFAKApplication().sendKeys(Keys.TAB);

	}

	@And("User_482 Search code in Approve Level 1 screen in Application for financial facilities")
	public void user_482_search_code_in_approve_level_1_screen_application_for_financial_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.AffApproveLevel1SearchCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.AffApproveLevel1SearchCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.AffApproveLevel1SearchCode());
		applicationForFinancialFacilityObj.AffApproveLevel1SearchCode().sendKeys(requestId);
		// .sendKeys(testData.get("RequestID"));
		for (int i = 0; i < 10; i++) {
			applicationForFinancialFacilityObj.AffApproveLevel1SearchCode().sendKeys(Keys.ENTER);
		}

	}

	@And("User_482 Select searched record in Approve level 1 screen Application for financial facilities")
	public void user_482_select_searched_record_in_approve_level_1_screen_application_for_financial_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj
				.selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication());
	}

	@Given("User_482 Click close icon in sent alert under WIFAK Application")
	public void user_482_click_close_icon_in_sent_alert_under_wifak_application() {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.closeIconInSendAlertPopup());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.closeIconInSendAlertPopup());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					// Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 click disbursement sublimit tab in draft record Maintenance screen under REQUEST FOR FINANCIN")
	public void user_482_click_disbursement_sublimit_tab_in_draft_record_maintenance_screen_under_request_for_financin() {

	}

	@And("User_482 select product class record in draft record Maintenance screen under REQUEST FOR FINANCIN")
	public void user_482_select_product_class_record_in_draft_record_maintenance_screen_under_request_for_financin() {

	}

	@And("User_482 click the repayment plan in draft record Maintenance screen under REQUEST FOR FINANCIN")
	public void user_482_click_the_repayment_plan_in_draft_record_maintenance_screen_under_request_for_financin() {

	}

	@And("User_482 enter the no of payments In Limit details pop up under REQUEST FOR FINANCIN")
	public void user_482_enter_the_no_of_payments_in_limit_details_pop_up_under_request_for_financin() {

	}

	@And("User_482 click create schedule option In Limit details pop up under REQUEST FOR FINANCIN")
	public void user_482_click_create_schedule_option_in_limit_details_pop_up_under_request_for_financin() {

	}

	@And("User_482 Validate the No of payments Generated in repayment plan")
	public void user_482_validate_the_no_of_payments_generated_in_repayment_plan() {

	}

	@And("User_482 Select Decision in Approve level 1 under WIFAK Application")
	public void user_482_select_decision_in_approve_level_1_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectDecisionInApproveLevel1UnderWifakApplication());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.selectDecisionInApproveLevel1UnderWifakApplication(), "Approve");
	}

	@And("User_482 Select Decision in Approve level 2 under WIFAK Application")
	public void user_482_select_decision_in_approve_level_2_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectDecisionInApproveLevel2UnderWifakApplication());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.selectDecisionInApproveLevel2UnderWifakApplication(), "Approve");
	}

	@And("User_482 Select Decision in Approve level 3 under WIFAK Application")
	public void user_482_select_decision_in_approve_level_3_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectDecisionInApproveLevel3UnderWifakApplication());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.selectDecisionInApproveLevel3UnderWifakApplication(), "Approve");
	}

	@And("User_482 click submit button in approve level 1 under WIFAK Application")
	public void user_482_click_submit_button_in_approve_level_1_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.submitButtonInApproveLevel1UnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.submitButtonInApproveLevel1UnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.submitButtonInApproveLevel1UnderWifakApplication());
	}

	@And("User_482 Click Approve Level 2 screen in application for financial facilities under WIFAK Application")
	public void user_482_click_approve_level_2_screen_in_application_for_financial_facilities_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ApproveLevel2ScreenUnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.ApproveLevel2ScreenUnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.ApproveLevel2ScreenUnderWifakApplication());
	}

	@And("User_482 Click Approve Level 3 screen in application for financial facilities under WIFAK Application")
	public void user_482_click_approve_level_3_screen_in_application_for_financial_facilities_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ApproveLevel3creenUnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.ApproveLevel3creenUnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.ApproveLevel3creenUnderWifakApplication());
	}

	@And("User_482 Search code in Approve Level 2 screen in Application for financial facilities")
	public void user_482_search_code_in_approve_level_2_screen_application_for_financial_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
				.searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		applicationForFinancialFacilityObj
				.searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication()
				.sendKeys(testData.get("RequestID"));
		applicationForFinancialFacilityObj
				.searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication().sendKeys(Keys.ENTER);
	}

	@And("User_482 Select searched record in Approve level 2 screen Application for financial facilities")
	public void user_482_select_searched_record_in_approve_level_2_screen_application_for_financial_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.selectsearchedCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj
				.selectsearchedCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication());
	}

	@And("User_482 Search code in Maintenance screen in Application for financial facilities")
	public void user_482_search_code_in_maintenance_screen_application_for_financial_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
				.searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication());
		applicationForFinancialFacilityObj
				.searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication()
				.sendKeys(testData.get("RequestID"));
		applicationForFinancialFacilityObj
				.searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication()
				.sendKeys(Keys.ENTER);
	}

	@And("User_482 Select searched record in Maintenance screen Application for financial facilities")
	public void user_482_select_searched_record_in_maintenance_screen_application_for_financial_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.selectsearchedCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj
				.selectsearchedCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication());
	}

	@And("User_482 Search code in Approve Level 3 screen in Application for financial facilities")
	public void user_482_search_code_in_approve_level_3_screen_application_for_financial_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
				.searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		applicationForFinancialFacilityObj
				.searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication()
				.sendKeys(testData.get("RequestID"));
		applicationForFinancialFacilityObj
				.searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication().sendKeys(Keys.ENTER);
	}

	@And("User_482 Select searched record in Approve level 3 screen Application for financial facilities")
	public void user_482_select_searched_record_in_approve_level_3_screen_application_for_financial_facilities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.selectsearchedCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj
				.selectsearchedCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication());
	}

	@And("User_482 click submit button in approve level 2 under WIFAK Application")
	public void user_482_click_submit_button_in_approve_level_2_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.submitButtonInApproveLevel2UnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.submitButtonInApproveLevel2UnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.submitButtonInApproveLevel2UnderWifakApplication());
	}

	@And("User_482 click submit button in approve level 3 under WIFAK Application")
	public void user_482_click_submit_button_in_approve_level_3_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.submitButtonInApproveLevel3UnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.submitButtonInApproveLevel3UnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.submitButtonInApproveLevel3UnderWifakApplication());
	}

	@And("User_482 Validate Final approval of facility application under WIFAK Application")
	public void user_482_validate_final_approval_of_facility_application_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FinalApprovalValidationUnderWIFAKApplication());
		Assert.assertTrue(
				applicationForFinancialFacilityObj.FinalApprovalValidationUnderWIFAKApplication().isDisplayed());
	}

	@And("User_482 Click Issue Facility Offer Sub Menu Under WIFAK Application")
	public void user_482_click_issue_facility_offer_sub_menu_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.IssueFacilityOfferWifakApplication_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.IssueFacilityOfferWifakApplication_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.IssueFacilityOfferWifakApplication_482());
	}

	@And("User_482 Search code in Issue Facility Offer screen Under WIFAK Application")
	public void user_482_search_code_in_issue_facility_offer_screen_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
				.searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication());
		applicationForFinancialFacilityObj.searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication()
				.sendKeys(testData.get("RequestID"));
		for (int i = 0; i < 15; i++) {
			applicationForFinancialFacilityObj
					.searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication().sendKeys(Keys.ENTER);
		}
	}

	@And("User_482 Select searched record in Issue Facility Offer screen Under WIFAK Application")
	public void user_482_select_searched_record_in_issue_facility_offer_screen_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.selectsearchedCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj
				.selectsearchedCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication());
	}

	@And("User_482 Click Issue Offer button in Issue Facility Offer screen Under WIFAK Application")
	public void user_482_click_issue_offer_button_in_issue_facility_offer_screen_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				.issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
				.issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication());
	}

	@And("User_482 Validate the system is printing the offer letter automatically at the level of issue facility offer")
	public void user_482_validate_the_system_is_printing_the_offer_letter_automatically_at_the_level_of_issue_facility_offer() {

	}

	@And("User_482 close Maintenance screen WIFAK Application")
	public void user_482_close_maintenance_screen_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.closeIconMaintenanceScreenWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.closeIconMaintenanceScreenWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.closeIconMaintenanceScreenWifakApplication());

	}

	@And("User_482 click search icon in Maintenance screen under WIFAK Application")
	public void user_482_click_search_icon_in_maintenance_screen_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchIconInMaintenanceUnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchIconInMaintenanceUnderWifakApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchIconInMaintenanceUnderWifakApplication());
	}

	@And("User_482 click Technical details")
	public void user_click_technical_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.technicalDetails_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.technicalDetails_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.technicalDetails_482());
	}

	@And("User_482 click clear caches")
	public void user_click_clear_caches() {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.FSM_ClearCacheInTechnicalDetailsIcon());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.FSM_ClearCacheInTechnicalDetailsIcon());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_482 Search the User id to send the alert for approve")
	public void user_482_search_the_user_id_to_send_the_alert_for_approve() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchUserIdInSendAlert());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchUserIdInSendAlert());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchUserIdInSendAlert());
		applicationForFinancialFacilityObj.searchUserIdInSendAlert().sendKeys(testData.get("UserID"));
		applicationForFinancialFacilityObj.searchUserIdInSendAlert().sendKeys(Keys.ENTER);
		String xpath = "//td[text()='MODEL.B']";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Select the User id to send the alert for approve")
	public void user_482_select_the_user_id_to_send_the_alert_for_approve() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectSearchedUserIdInSendAlert());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.selectSearchedUserIdInSendAlert());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.selectSearchedUserIdInSendAlert());
	}

	@And("User_482 click Send alert button in alert pop up screen")
	public void user_482_click_send_alert_button_in_alert_pop_up_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.sendButtonInSendAlert());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.sendButtonInSendAlert());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.sendButtonInSendAlert());

	}

	@Given("User_482 Search the User id to send the alert for approve_FacilitiesManagement")
	public void user_482_search_the_user_id_to_send_the_alert_for_approve_facilities_management() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchUserIdInSendAlert_FacilitiesManagement());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchUserIdInSendAlert_FacilitiesManagement());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchUserIdInSendAlert_FacilitiesManagement());
		applicationForFinancialFacilityObj.searchUserIdInSendAlert_FacilitiesManagement()
				.sendKeys(testData.get("UserID"));
		applicationForFinancialFacilityObj.searchUserIdInSendAlert_FacilitiesManagement().sendKeys(Keys.ENTER);
		String xpath = "//td[text()='MODEL.B']";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}
	}

	@Given("User_482 Select the User id to send the alert for approve_FacilitiesManagement")
	public void user_482_select_the_user_id_to_send_the_alert_for_approve_facilities_management() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.selectSearchedUserIdInSendAlert_FacilitiesManagement());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.selectSearchedUserIdInSendAlert_FacilitiesManagement());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.selectSearchedUserIdInSendAlert_FacilitiesManagement());
	}

	@Given("User_482 click Send alert button in alert pop up screen_FacilitiesManagement")
	public void user_482_click_send_alert_button_in_alert_pop_up_screen_facilities_management() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.sendButtonInSendAlert_FacilitiesManagement());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.sendButtonInSendAlert_FacilitiesManagement());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.sendButtonInSendAlert_FacilitiesManagement());

	}

	@And("User_482 Click open item in send alert")
	public void user_482_click_open_item_in_send_alert() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.openItemInSendAlert());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.openItemInSendAlert());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.openItemInSendAlert());
	}

	@And("User_482 Click approve button in send alert")
	public void user_482_click_approve_button_in_send_alert() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.approveButtonInOpenItem());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.approveButtonInOpenItem());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.approveButtonInOpenItem());
	}

	@And("User_482 Click facilities management screen under WIFAK Application")
	public void user_482_click_facilities_management_screen_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
	}

	@And("User_482 Click Maintenance screen in Facilities Management Under WIFAK Application")
	public void user_482_click_maintenance_screen_in_facilities_management_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.maintenance_facilitiesManagementUnderWIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.maintenance_facilitiesManagementUnderWIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.maintenance_facilitiesManagementUnderWIFAK_482());
	}

	@And("User_482 Click Search Icon in Maintenance screen Facilities Management Under WIFAK Application")
	public void user_482_click_search_icon_in_maintenance_screen_facilities_management_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchIcon_facilitiesManagementUnderWIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.searchIcon_facilitiesManagementUnderWIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.searchIcon_facilitiesManagementUnderWIFAK_482());
	}

	@And("User_482 Click Addtional Details Screen in Maintenance Screen Facilities Management under WIFAK Application")
	public void user_482_click_addtional_details_screen_in_maintenance_screen_facilities_management_under_wifak_application() {
		for (int i = 0; i < 300; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
						.additionalDetails_Maintenance_facilitiesManagementUnderWIFAK_482());
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj
						.additionalDetails_Maintenance_facilitiesManagementUnderWIFAK_482());
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_482 Change Effective Date Until in Maintenance Screen Facilities Management under WIFAK Application")
	public void user_482_change_effective_date_until_in_maintenance_screen_facilities_management_under_wifak_application() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.effectiveDateUntil_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.effectiveDateUntil_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.effectiveDateUntil_482());
		applicationForFinancialFacilityObj.effectiveDateUntil_482().clear();
		applicationForFinancialFacilityObj.effectiveDateUntil_482().sendKeys(currentDate);
		// applicationForFinancialFacilityObj.effectiveDateUntil_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Click Document details in Maintenance Screen Facilities Management under WIFAK Application")
	public void user_482_click_document_details_in_maintenance_screen_facilities_management_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.documentDetailsFacilitiesManagement_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.documentDetailsFacilitiesManagement_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.documentDetailsFacilitiesManagement_482());
	}

	@And("User_482 Enter Solicitor Date Sent in Document Code1")
	public void user_482_enter_solicitor_date_sent_in_document_code1() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.randomClickDocumentDate_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.randomClickDocumentDate_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.randomClickDocumentDate_482());
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.solicitorDateSent_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.solicitorDateSent_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.solicitorDateSent_482());
		applicationForFinancialFacilityObj.solicitorDateSent_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.solicitorDateSent_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Solicitor Date Received in Document Code1")
	public void user_482_enter_solicitor_date_received_in_document_code1() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.solicitorDateReceived_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.solicitorDateReceived_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.solicitorDateReceived_482());
		applicationForFinancialFacilityObj.solicitorDateReceived_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.solicitorDateReceived_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Estimator Date Sent in Document Code1")
	public void user_482_enter_estimator_date_sent_in_document_code1() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.estimatorDateSent_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.estimatorDateSent_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.estimatorDateSent_482());
		applicationForFinancialFacilityObj.estimatorDateSent_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.estimatorDateSent_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Estimator Date Received in Document Code1")
	public void user_482_enter_estimator_date_Received_in_document_code1() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.estimatorDateReceived_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.estimatorDateReceived_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.estimatorDateReceived_482());
		applicationForFinancialFacilityObj.estimatorDateReceived_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.estimatorDateReceived_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Custodian Date Sent in Document Code1")
	public void user_482_enter_custodian_date_sent_in_document_code1() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.custodianDateSent_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.custodianDateSent_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.custodianDateSent_482());
		applicationForFinancialFacilityObj.custodianDateSent_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.custodianDateSent_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Solicitor Date Sent in Document Code2")
	public void user_482_enter_solicitor_date_sent_in_document_code2() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.randomClickDocumentDate2_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.randomClickDocumentDate2_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.randomClickDocumentDate2_482());
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.solicitorDateSent_Document2_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.solicitorDateSent_Document2_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.solicitorDateSent_Document2_482());
		applicationForFinancialFacilityObj.solicitorDateSent_Document2_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.solicitorDateSent_Document2_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Solicitor Date Received in Document Code2")
	public void user_482_enter_solicitor_date_received_in_document_code2() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.solicitorDateReceived_Document2_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.solicitorDateReceived_Document2_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.solicitorDateReceived_Document2_482());
		applicationForFinancialFacilityObj.solicitorDateReceived_Document2_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.solicitorDateReceived_Document2_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Estimator Date Sent in Document Code2")
	public void user_482_enter_estimator_date_sent_in_document_code2() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.estimatorDateSent_Document2_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.estimatorDateSent_Document2_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.estimatorDateSent_Document2_482());
		applicationForFinancialFacilityObj.estimatorDateSent_Document2_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.estimatorDateSent_Document2_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Estimator Date Received in Document Code2")
	public void user_482_enter_estimator_date_Received_in_document_code2() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.estimatorDateReceivedDocument2_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.estimatorDateReceivedDocument2_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.estimatorDateReceivedDocument2_482());
		applicationForFinancialFacilityObj.estimatorDateReceivedDocument2_482().sendKeys(currentDate);
		applicationForFinancialFacilityObj.estimatorDateReceivedDocument2_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Enter Custodian Date Sent in Document Code2")
	public void user_482_enter_custodian_date_sent_in_document_code2() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.custodianDateSent_Document2_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.custodianDateSent_Document2_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.custodianDateSent_Document2_482());
		applicationForFinancialFacilityObj.custodianDateSent_Document2_482().sendKeys(currentDate);
//    	  applicationForFinancialFacilityObj.custodianDateSent_Document2_482().sendKeys(Keys.TAB);
	}

	@Given("User_482 Search Application Ref Num In Facilities Management Under WIFAK Application")
	public void user_482_search_application_ref_num_in_facilities_management_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.searchApplicationRefNum_facilitiesManagementUnderWIFAK_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.searchApplicationRefNum_facilitiesManagementUnderWIFAK_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.searchApplicationRefNum_facilitiesManagementUnderWIFAK_482());
		applicationForFinancialFacilityObj.searchApplicationRefNum_facilitiesManagementUnderWIFAK_482()
				.sendKeys(testData.get("RequestID"));
		applicationForFinancialFacilityObj.searchApplicationRefNum_facilitiesManagementUnderWIFAK_482()
				.sendKeys(Keys.ENTER);
		String xpath = "//td[contains(text(),'" + testData.get("RequestID") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Select Searched Record In Facilities Management Under WIFAK Application")
	public void user_482_select_searched_record_in_facilities_management_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				.selectsearchedApplicationRefNum_facilitiesManagementUnderWIFAK_482());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj
				.selectsearchedApplicationRefNum_facilitiesManagementUnderWIFAK_482());
	}

	@And("User_482 Click Save Button In Facilities Management")
	public void user_482_click_save_button_in_facilities_management() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.saveButtonFacilitiesManagement_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.saveButtonFacilitiesManagement_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.saveButtonFacilitiesManagement_482());
	}

	@Given("User_482 Store Facility Code In Facilities Management Under WIFAK Application")
	public void user_482_store_facility_code_in_facilities_management_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.storeFacilityCode_FacilitiesManagement_482());
		String facilityCode = applicationForFinancialFacilityObj.storeFacilityCode_FacilitiesManagement_482().getText()
				.substring(6);
		drawDownRequestData.updateTestData(testExecutionData.get("Data Set ID"), "FacilityCode", facilityCode);
		System.out.println(facilityCode);
	}

	@Given("User_482 Click Product Class details in Limit Details")
	public void user_click_product_class_details_in_limit_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassSelect_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.productClassSelect_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.productClassSelect_WIFAK_482());
	}

	@Given("User_482 Click Repayment Plan options Under WIFAK Application")
	public void user_click_repayment_plan_options_under_Wifak_Application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.repaymentPlan_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.repaymentPlan_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.repaymentPlan_WIFAK_482());
	}

	@Given("User_482 Select Profit Recognition Method as Straight line")
	public void user_482_select_profit_recognition_method_as_straight_line() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.profitRecognitionMethod_WIFAK_482());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.profitRecognitionMethod_WIFAK_482(),
				testData.get("ProfitRecognitionMethod"));
	}

	@Given("User_482 enter no of payments in repayment plan for WIFAK Application")
	public void user_482_enter_no_of_payments_in_repayment_plan_for_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.no_Of_Payments_RepaymentPlan_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.no_Of_Payments_RepaymentPlan_WIFAK_482());
		applicationForFinancialFacilityObj.no_Of_Payments_RepaymentPlan_WIFAK_482()
				.sendKeys(testData.get("No of payments"));
	}

	@Given("User_482 Click Create schedule Button Under WIFAK Application")
	public void user_482_click_create_schedule_button_under_wifak_application() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.createScheduleButton_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.createScheduleButton_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.createScheduleButton_WIFAK_482());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.totalAmountRepayment_WIFAK_482());
		int TotalAmount = Integer.parseInt(applicationForFinancialFacilityObj.totalAmountRepayment_WIFAK_482()
				.getAttribute("prevvalue").replace(",", "").replace(".000", ""));
		System.err.println(TotalAmount);
		int noOfPayments = Integer.parseInt(testData.get("No of payments"));
		System.err.println(noOfPayments);
		int installAmountCalculated = TotalAmount / noOfPayments;
		System.err.println(installAmountCalculated);
		List<WebElement> InstallmentWebElement = driver.findElements(By.xpath("//td[@tdlabel='Installment Amount']"));

		for (int i = 1; i < InstallmentWebElement.size(); i++) {
			int InstallmentAmountSystem = Integer
					.parseInt(InstallmentWebElement.get(i).getText().replace(",", "").replace(".00", ""));
			System.err.println(InstallmentAmountSystem);
			if (installAmountCalculated != InstallmentAmountSystem) {
				Assert.fail("installment amount not calculated in the system ");
			}

			if (i == noOfPayments) {
				break;
			}

		}

	}

	@And("^User_482 user checks validation for the Civil ID Expiry Date on inputting the CIF$")
	public void User_482_user_checks_validation_for_the_Civil_ID_Expiry_Date_on_inputting_the_CIF() {
		WebElement Validation_PopUp = seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CivilIDExpiryValidationPopUp_WIFAK_482());
		boolean isValidationPopUp = Validation_PopUp.isDisplayed();

		if (isValidationPopUp) {
			System.out.println("Civil ID is Expired");
			System.out.println(Validation_PopUp.getText());
		} else {
			System.out.println("Civil ID is not Expired");
		}
	}

	@And("^User_482 click on the system date$")
	public void User_482_click_on_the_system_date() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.systemDate());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.systemDate());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.systemDate());

	}

	@And("^user_482 change the running date$")
	public void user_482_change_the_running_date() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RunnningDateFeild_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RunnningDateFeild_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RunnningDateFeild_WIFAK_482());
		applicationForFinancialFacilityObj.RunnningDateFeild_WIFAK_482().clear();
		applicationForFinancialFacilityObj.RunnningDateFeild_WIFAK_482().sendKeys(testData.get("Running Date"));
		applicationForFinancialFacilityObj.RunnningDateFeild_WIFAK_482().sendKeys(Keys.TAB);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RunnningDateUseBtn_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RunnningDateUseBtn_WIFAK_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RunnningDateUseBtn_WIFAK_482());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
		seleniumActions.getClickAndActionsHelper().moveToElement(commonElementsObj.iisConfirmOkButton());
		seleniumActions.getClickAndActionsHelper().clickOnElement(commonElementsObj.iisConfirmOkButton());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		seleniumActions.getClickAndActionsHelper().moveToElement(commonElementsObj.iisOkButton());
		seleniumActions.getClickAndActionsHelper().clickOnElement(commonElementsObj.iisOkButton());

	}

	@And("^user_482 close the change running date$")
	public void user_482_close_the_change_running_date() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				commonElementsObj.RunningDateBoxCloseBtn());
		seleniumActions.getClickAndActionsHelper().moveToElement(commonElementsObj.RunningDateBoxCloseBtn());
		seleniumActions.getClickAndActionsHelper().clickOnElement(commonElementsObj.RunningDateBoxCloseBtn());

	}

// **************************************************************************************************************************************************

	@And("^User_482 update test data set for AT_AFF_103$")
	public void user_482_update_test_data_set_for_AT_AFF_103() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AFF_103");
		testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("^User_482 update test data set for AT_AFF_105$")
	public void user_482_update_test_data_set_for_AT_AFF_105() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AFF_105");
		testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("^User_482 update test data set for AT_AFF_106$")
	public void user_482_update_test_data_set_for_AT_AFF_106() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AFF_106");
		testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("^User_482 Click on App Screen Application Main Menu$")
	public void User_482_Click_on_App_Screen_Application_Main_Menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.AppscreenMainMenu());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.AppscreenMainMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.AppscreenMainMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.AppscreenMainMenu());
	}

	@And("^User_482 Click on App Screen Application Sub Menu$")
	public void User_482_Click_on_App_Screen_Application_Sub_Menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.AppscreenSubMenu());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.AppscreenSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.AppscreenSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.AppscreenSubMenu());
	}

	@And("^User_482 Click Application for financial facilities for App Screen$")
	public void User_482_Click_Application_for_financial_facilities_for_App_Screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInAppScreenApplicationSubMenu());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInAppScreenApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInAppScreenApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInAppScreenApplicationSubMenu());
	}

	@And("^User_482 Click Maintenance screen in App Screen Application sub menu$")
	public void User_482_Click_Maintenance_screen_in_App_Screen_Application_sub_menu() throws Throwable {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_MaintenanceInApplicationForFinancialFacilitiesAppScreen());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.fms_MaintenanceInApplicationForFinancialFacilitiesAppScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_MaintenanceInApplicationForFinancialFacilitiesAppScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.fms_MaintenanceInApplicationForFinancialFacilitiesAppScreen());

	}

	@And("^User_482 Select Application For field in Maintenace Screen under App Screen Application$")
	public void user_482_select_application_for_field_in_maintenace_screen_under_App_Screen_application()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainApplicationForDropdownAppScreen());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.mainApplicationForDropdownAppScreen(),
				testData.get("ApplicationFor"));

	}

	@And("^User_482 enter the CIF No in main info tab under App Screen Application$")
	public void user_482_enter_the_cif_no_in_main_info_tab_under_App_Screen_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainCIFNoAppScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainCIFNoAppScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.mainCIFNoAppScreen());
		applicationForFinancialFacilityObj.mainCIFNoAppScreen().sendKeys(testData.get("CIFNO"));
		applicationForFinancialFacilityObj.mainCIFNoAppScreen().sendKeys(Keys.TAB);

	}

	@And("^User_482 enter the facility type in main info tab under App Screen Application$")
	public void user_482_enter_the_facility_type_in_main_info_tab_under_App_Screen_application() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(applicationForFinancialFacilityObj.mainFacilityTypeAppScreen());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.mainFacilityTypeAppScreen());
				applicationForFinancialFacilityObj.mainFacilityTypeAppScreen().sendKeys(testData.get("Facility Type"));
				applicationForFinancialFacilityObj.mainFacilityTypeAppScreen().sendKeys(testData.get("CIFNO"));

				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_482 Validate the App scenarios are working fine$")
	public void User_482_Validate_the_App_scenarios_are_working_fine() {
		WebElement Tab = seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceScreen());
		boolean isTab = Tab.isDisplayed();

		if (isTab == true) {
			System.out.println("Applicaion for finnance scenarios are working fine");
		} else {
			System.out.println("Applicaion for finnance scenarios are not working fine");
		}
	}

	@And("^User_482 Click on the close button for maintenance tab$")
	public void User_482_Click_on_the_close_button_for_maintenance_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());

		seleniumActions.getClickAndActionsHelper().moveToElement(commonElementsObj.iisScreenCloseBtn());
		seleniumActions.getClickAndActionsHelper().clickOnElement(commonElementsObj.iisScreenCloseBtn());

	}

	// ***************************************Req
	// Screen***************************************************************

	@And("^User_482 Click on Req Screen Reqlication Main Menu$")
	public void User_482_Click_on_Req_Screen_Reqlication_Main_Menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.AppscreenMainMenu());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.ReqscreenMainMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.ReqscreenMainMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.ReqscreenMainMenu());
	}

	@And("^User_482 Click on Req Screen Reqlication Sub Menu$")
	public void User_482_Click_on_Req_Screen_Reqlication_Sub_Menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ReqscreenSubMenu());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.ReqscreenSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.ReqscreenSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.ReqscreenSubMenu());
	}

	@And("^User_482 Click on Req Screen for financial facilities for Req Screen$")
	public void User_482_Click_on_Req_Screen_for_financial_facilities_for_Req_Screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInReqScreenApplicationSubMenu());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInReqScreenApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInReqScreenApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.fmsApplicationForFinancialFacilitiesInReqScreenApplicationSubMenu());

	}

	@And("^User_482 Click Maintenance screen in Req Screen Reqlication sub menu$")
	public void User_482_Click_Maintenance_screen_in_Req_Screen_Reqlication_sub_menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_MaintenanceInApplicationForFinancialFacilitiesReqScreen());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.fms_MaintenanceInApplicationForFinancialFacilitiesReqScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_MaintenanceInApplicationForFinancialFacilitiesReqScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.fms_MaintenanceInApplicationForFinancialFacilitiesReqScreen());
	}

	@And("^User_482 Validate the Req scenarios are working fine$")
	public void User_482_Validate_the_Req_scenarios_are_working_fine() {
		WebElement ReqTab = seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeReqMaintenanceScreen());
		boolean isReqTab = ReqTab.isDisplayed();

		if (isReqTab == true) {
			System.out.println("Request for finnance scenarios are working fine");
		} else {
			System.out.println("Request for finnance scenarios are not working fine");
		}
	}

	@And("^User_482 Click on the search button$")
	public void User_482_Click_on_the_search_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchBtn());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchBtn());
	}

	@And("^User_482 enter code under Cif search feild$")
	public void User_482_enter_code_under_Cif_search_feild() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchCIFCodeFeild());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchCIFCodeFeild());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchCIFCodeFeild());
		for (int i = 1; i < 50; i++) {
			try {
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchCIFCodeFeild().clear();
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchCIFCodeFeild()
						.sendKeys(testData.get("Facilty Code"));
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearchCIFCodeFeild()
						.sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User_482 double click on the searhed record$")
	public void User_482_double_click_on_the_searhed_record() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearhedRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearhedRec());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceSearhedRec());
	}

	@And("^User_482 click Limit Details tab in App Screen Application$")
	public void User_482_click_Limit_Details_tab_in_App_Screen_Application() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceLimitDetailTab());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceLimitDetailTab());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceLimitDetailTab());
		Thread.sleep(2000);
		for (int i = 1; i < 50; i++) {
			try {
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceLimitDetailTab().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User_482 select the product class in limit details under App Screen Application$")
	public void User_482_select_the_product_class_in_limit_details_under_App_Screen_Application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceProductClassRec());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceProductClassRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceProductClassRec());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceProductClassRec());
	}

	@And("^User_482 click on Fixed Assets$")
	public void User_482_click_on_Fixed_Assets() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsTab());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsTab());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsTab());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsTab());
	}

	@And("^User_482 click on the Add icon under Fixed Assets key$")
	public void User_482_click_on_the_Add_icon_under_Fixed_Assets_key() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyAddIconBtn());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyAddIconBtn());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyAddIconBtn());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyAddIconBtn());
	}

	@And("^User_482 doble click on the new rec$")
	public void User_482_doble_click_on_the_new_rec() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRec());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRec());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRec());
	}

	@And("^User_482 Select the Category under Fixed Assets Key$")
	public void User_482_Select_the_Category_under_Fixed_Assets_Key() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCATEGORYCODE());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCATEGORYCODE());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCATEGORYCODE());

		for (int i = 1; i < 50; i++) {
			try {
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCATEGORYCODE()
						.sendKeys(testData.get("CATEGORY CODE"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User_482 Select the class under Fixed Assets Key$")
	public void User_482_Select_the_class_under_Fixed_Assets_Key() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE());

		for (int i = 1; i < 50; i++) {
			try {
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE().clear();
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE()
						.sendKeys(testData.get("CLASS CODE"));
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE()
						.sendKeys(Keys.TAB);
				Thread.sleep(5000);
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user_482 enter profit rate under Fixed Assets Key$")
	public void user_482_enter_profit_rate_under_Fixed_Assets_Key() {
		try {
			while (true) {

				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE()
						.sendKeys(Keys.ARROW_RIGHT);

				waitHelper.waitForElementToVisibleWithFluentWait(driver,
						applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecProfitRate(),
						1000, 500);

				javascriptHelper.JSEClick(
						applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecProfitRate());
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecProfitRate().clear();
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecProfitRate()
						.sendKeys(testData.get("Profit Rate"));
				break;

			}
		} catch (Exception e) {
			// Catch any exception (e.g., if the target element doesn't appear)
			System.out.println("Target element did not appear. Stopping the loop.");
		}

	}

	@And("^User_482 Click on ok button Under Fixed Assets Key$")
	public void User_482_Click_on_ok_button_Under_Fixed_Assets_Key() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecOKBtn());
		seleniumActions.getJavascriptHelper().scrollIntoView(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecOKBtn());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecOKBtn());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyRecOKBtn());
	}

	@And("^User_482 validate the warning message is displayed$")
	public void User_482_validate_the_warning_message_is_displayed() {
		WebElement Warning_Message = seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.mainFacilityTypeAppMaintenanceFixedAssetsKeyWarning_Message());

		boolean isWarning_Message = Warning_Message.isDisplayed();

		if (isWarning_Message == true) {
			System.out.println(Warning_Message.getText());
		} else {
			System.out.println("No Warning Message Apperead");
		}
	}

//**********************************************************************************************************

	@And("^User_482 click on Request screen module under menu$")
	public void User_482_click_on_Request_screen_module_under_menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModule());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.RequestModule());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.RequestModule());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.RequestModule());
	}

	@And("^User_482 click on Request for finance under Request screen$")
	public void User_482_click_on_Request_for_finance_under_Request_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestForFinancing());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.RequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RequestForFinancing());
	}

	@And("^User_482 click on Sub Request for finance under Request screen$")
	public void User_482_click_on_Sub_Request_for_finance_under_Request_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SubRequestForFinancing());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.SubRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SubRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SubRequestForFinancing());
	}

	@And("^User_482 click on maintenance under Sub Reuest for finance$")
	public void User_482_click_on_maintenance_under_Sub_Reuest_for_finance() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SubRequestForFinancingMaintenance());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.SubRequestForFinancingMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SubRequestForFinancingMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SubRequestForFinancingMaintenance());
	}

	@And("^User_482 click on the search button$")
	public void User_482_click_on_the_search_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleSearchButton());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.RequestModuleSearchButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleSearchButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RequestModuleSearchButton());
	}

	@And("^User_482 click on the code$")
	public void User_482_click_on_the_code() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleSearchCode());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.RequestModuleSearchCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleSearchCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RequestModuleSearchCode());
	}

	@And("^User_482 enter the code$")
	public void User_482_enter_the_code() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleSearchCode());
		applicationForFinancialFacilityObj.RequestModuleSearchCode().clear();
		applicationForFinancialFacilityObj.RequestModuleSearchCode().sendKeys(testData.get("Request Code"));
		applicationForFinancialFacilityObj.RequestModuleSearchCode().sendKeys(Keys.ENTER);

	}

	@And("^User_482 double click on the retrived record$")
	public void User_482_double_click_on_the_retrived_record() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleSearchedRetrievedRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleSearchedRetrievedRec());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.RequestModuleSearchedRetrievedRec());
		for (int i = 1; i < 50; i++) {
			try {
				commonElementsObj.iisConfirmOkButton().click();
				System.out.println("Pop Up appeared");
				break;

			} catch (Exception e) {
				System.out.println("Pop Up not appeared");
			}
		}

	}

	@And("^User_482 click on Disbursement tab$")
	public void User_482_click_on_Disbursement_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleDisbursementTab());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.RequestModuleDisbursementTab());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleDisbursementTab());
		for (int i = 1; i < 50; i++) {
			try {
				applicationForFinancialFacilityObj.RequestModuleDisbursementTab().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("^User_482 click on the product class rec$")
	public void User_482_click_on_the_product_class_rec() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleDisbursementProductClassRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleDisbursementProductClassRec());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RequestModuleDisbursementProductClassRec());
	}

	@And("^User_482 click on the Fees Charge button$")
	public void User_482_click_on_the_Fees_Charge_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleFixedChargeBtn());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.RequestModuleFixedChargeBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleFixedChargeBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RequestModuleFixedChargeBtn());
	}

	@And("^User_482 click on the code under charge details$")
	public void User_482_click_on_the_code_under_charge_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleChargeCodeRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleChargeCodeRec());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RequestModuleChargeCodeRec());
	}

	@And("^User_482 enter the new charge code under charge details$")
	public void User_482_enter_the_new_charge_code_under_charge_details() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleChargeCode());
		applicationForFinancialFacilityObj.RequestModuleChargeCode().click();
		applicationForFinancialFacilityObj.RequestModuleChargeCode().clear();
		applicationForFinancialFacilityObj.RequestModuleChargeCode().sendKeys(testData.get("Charge Code"));
		applicationForFinancialFacilityObj.RequestModuleChargeCode().sendKeys(Keys.TAB);

	}

	@And("^User_482 click on the Ok under charge details$")
	public void User_482_click_on_the_Ok_under_charge_details() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleChargeOKBtn());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.RequestModuleChargeOKBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleChargeOKBtn());

		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RequestModuleChargeOKBtn());
	}

	@And("^user_482 click on the validate button$")
	public void user_482_click_on_the_validate_button() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.RequestModuleValidateBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.RequestModuleValidateBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.RequestModuleValidateBtn());
	}

	@And("^User_482 click on the confirm ok button$")
	public void User_482_click_on_the_confirm_ok_button() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
		seleniumActions.getClickAndActionsHelper().moveToElement(commonElementsObj.iisConfirmOkButton());
		for (int i = 1; i < 500; i++) {
			try {
				commonElementsObj.iisConfirmOkButton().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					continue;
				}

			}
		}

	}

	@And("^User_482 click on the cofirm yes button$")
	public void User_482_click_on_the_cofirm_yes_button() throws InterruptedException {

		for (int i = 1; i < 500; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
				commonElementsObj.iisConfirmOkButton().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					continue;
				}

			}
		}

	}

	@And("^User_483 click on the ok button$")
	public void User_483_click_on_the_ok_button() {

		for (int i = 1; i < 100; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().clickOnElement(commonElementsObj.iisOkButton());
				break;
			} catch (Exception e) {
				if (i == 100) {

					continue;
				}
			}
		}

	}

	@And("^user_482 validate the charge code is changed or not$")
	public void user_482_validate_the_charge_code_is_changed_or_not() {
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.RequestModuleChargeCodeRec().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		String Existing_Charge_Code = applicationForFinancialFacilityObj.RequestModuleChargeCode().getText();

		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.RequestModuleChargeCode().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		String Defined_Charge_code = testData.get("Charge Code");
		System.out.println(" Existing_Charge_Code : " + Existing_Charge_Code);
		System.out.println(" Defined_Charge_code : " + Defined_Charge_code);

		if (Existing_Charge_Code.equalsIgnoreCase(Defined_Charge_code)) {
			System.out.println(" The Charge Code is Same as Defined Earlier");

		} else {
			System.out.println("The Charge Code is Different as Defined Earlier");
		}
	}

	// @AT_RF_110*************************************************************************************************************

	@And("User_482 update Test data set for AT_RF_110")
	public void user_482_update_test_data_set_for_AT_RF_110() {
		// testExecutionData = testExecution.getTestdata("AT_RF_001");
		testData = requestForFinancingData.getTestdata("AT_RF_110_D1");
		// System.out.println(testData.get(requestForFinancingData.getTestdata("AT_RF_001")));

	}

	@And("^User_482 click on the Johns Request module and after johns sub module$")
	public void User_482_click_on_the_Johns_Request_module_and_after_johns_sub_module() {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.johnsRequestModule());

		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.johnsRequestModule());

		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.johnsRequestModule());

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SubjohnsRequestModule());

		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SubjohnsRequestModule());

		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SubjohnsRequestModule());

	}

	@And("User_482 click on the sub Johns Request")
	public void User_482_click_on_the_sub_Johns_Request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SubjohnsRequestModule());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.SubjohnsRequestModule());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SubjohnsRequestModule());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SubjohnsRequestModule());
	}

	@And("User_482 click on the Request For finnancing under sub Johns Request")
	public void User_482_click_on_the_Request_For_finnancing_under_sub_Johns_Request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SubjohnsRequestForFinancing());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.SubjohnsRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SubjohnsRequestForFinancing());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SubjohnsRequestForFinancing());
	}

	@And("User_482 click on the maintenance under Request For finnancing")
	public void User_482_click_on_the_maintenance_under_Request_For_finnancing() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SubjohnsRequestForFinancingMaintenance());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.SubjohnsRequestForFinancingMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SubjohnsRequestForFinancingMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SubjohnsRequestForFinancingMaintenance());
	}

	@And("User_482 select the new request from the request for submission drop down")
	public void User_482_select_the_new_request_from_the_request_for_submission_drop_down() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ReasonForSubmissionDropDown());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.ReasonForSubmissionDropDown(), testData.get("ApplicationFor"));
	}

	@And("User_482 click on info completion date")
	public void User_482_click_on_info_completion_date() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.InfoCompletionDate());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.InfoCompletionDate());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.InfoCompletionDate());
	}

	@And("User_482 enter the infor completion date")
	public void User_482_enter_the_infor_completion_date() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.InfoCompletionDate());
		// applicationForFinancialFacilityObj.InfoCompletionDate().sendKeys("16/01/2021");
		applicationForFinancialFacilityObj.InfoCompletionDate().sendKeys(testData.get("Info Date"));
		applicationForFinancialFacilityObj.InfoCompletionDate().sendKeys(Keys.TAB);
	}

	@And("User_482 click on the customer")
	public void User_482_click_on_the_customer() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CustomerCIFFeild());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.CustomerCIFFeild());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.CustomerCIFFeild());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.CustomerCIFFeild());
	}

	@And("User_482 enter the customer code")
	public void User_482_enter_the_customer_code() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CustomerCIFFeild());

		applicationForFinancialFacilityObj.CustomerCIFFeild().clear();
		// applicationForFinancialFacilityObj.CustomerCIFFeild().sendKeys("727");
		applicationForFinancialFacilityObj.CustomerCIFFeild().sendKeys(testData.get("CIFNO"));
		applicationForFinancialFacilityObj.CustomerCIFFeild().sendKeys(Keys.TAB);

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
	
	

	@And("User_482 click on the Facility type")
	public void User_482_click_on_the_Facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilityType());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.FacilityType());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.FacilityType());
		// seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.FacilityType());
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.FacilityType().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_482 enter the Facility type")
	public void User_482_enter_the_Facility_type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilityType());

		for (int i = 1; i < 100; i++) {
//			if (applicationForFinancialFacilityObj.FacilityType().getAttribute("prevvalue").isBlank()
//					||applicationForFinancialFacilityObj.FacilityType().getAttribute("prevvalue").isEmpty())
			try {
				applicationForFinancialFacilityObj.FacilityType().clear();
				applicationForFinancialFacilityObj.FacilityType().sendKeys("1112");
				applicationForFinancialFacilityObj.FacilityType().sendKeys(testData.get("FacilityType"));
				applicationForFinancialFacilityObj.FacilityType().sendKeys(Keys.TAB);
//				waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());
//				System.out.println("Progress Bar Appeared");
//				wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
//				System.out.println("Progress Bar Disappeard");			
				break;
			} catch (Exception e) {
				// TODO: handle exception
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
			
//			for (int i = 0; i <200; i++) {
//				try {
//					if (!applicationForFinancialFacilityObj.FacilityType().getAttribute("prevvalue").isBlank()
//							||!applicationForFinancialFacilityObj.FacilityType().getAttribute("prevvalue").isEmpty()) {
//						break;
//					}
//					
//				} catch (Exception e) {
//					
//				}
//			}
		

	}
	
	@And("User_482 selects the Revolviing On Off from DropDown in John Request")
	public void User_482_selects_the_Revolviing_On_Off_from_DropDown_in_John_Request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.requestFinancingRevolvingOneOffDropdown());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.requestFinancingRevolvingOneOffDropdown(), "One-Off");
//		for (int i = 0; i < 5; i++) {
//			try {
//				waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());
//				System.out.println("Progress Bar Appeared");
//				wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));
//				System.out.println("Progress Bar Disappeard");							
//				break;
// 
//			} catch (Exception e) {
// 
//			}
// 
//		}
	}

	@And("^User_482 select the History with ITFC$")
	public void User_482_select_the_History_with_ITFC() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.HistorywithITFC());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(applicationForFinancialFacilityObj.HistorywithITFC(),
				testData.get("HistorywithITFC")
		// "TEST1"
		);
	}

	@And("User_482 click on the total limit")
	public void User_482_click_on_the_total_limit() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.TotalLimit());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.TotalLimit());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.TotalLimit());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.TotalLimit());
	}

	@And("User_482 enter the total limit")
	public void User_482_enter_the_total_limit() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.TotalLimit());

		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.TotalLimit().clear();
				// applicationForFinancialFacilityObj.TotalLimit().sendKeys("100000");
				applicationForFinancialFacilityObj.TotalLimit().sendKeys(testData.get("TotalLimit"));
				applicationForFinancialFacilityObj.TotalLimit().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		for (int i = 0; i < 5; i++) {
		try {
			waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.displayProgIcon());
			System.out.println("Progress Bar Appeared");
			wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.displayProgIcon()));
			System.out.println("Progress Bar Disappeard");							
			break;

		} catch (Exception e) {

		}

	}

	}

	@And("User_482 click on add icon btn under disbursement")
	public void User_482_click_on_add_icon_btn_under_disbursement() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.add_RequestFinancingLimitDetails());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.add_RequestFinancingLimitDetails());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.add_RequestFinancingLimitDetails());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.add_RequestFinancingLimitDetails());
	}

	@And("User_482 click on product class")
	public void User_482_click_on_product_class() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ProductClass());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.ProductClass());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.ProductClass());
	}

	@And("User_482 enter the product class code")
	public void User_482_enter_the_product_class_code() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ProductClass());
		applicationForFinancialFacilityObj.ProductClass().clear();
		// applicationForFinancialFacilityObj.ProductClass().sendKeys("1");
		applicationForFinancialFacilityObj.ProductClass().sendKeys(testData.get("ProductClass"));
		applicationForFinancialFacilityObj.ProductClass().sendKeys(Keys.TAB);
	}

	@And("User_482 click on the add button")
	public void User_482_click_on_the_add_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ProductClassAdd());
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.ProductClassAdd().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		for (int i = 1; i < 100; i++) {
			try {
				commonElementsObj.iisOkButton().click();
				break;
			} catch (Exception e) {
				applicationForFinancialFacilityObj.ProductClassAdd().click();
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProductClassAdd());
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.ProductClassAdd().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("^User_482 select the newly added product class rec$")
	public void User_482_select_the_newly_added_product_class_rec() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.PricingClassRec());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.PricingClassRec());
		// seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.PricingClassRec());
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.PricingClassRec().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("User_482 click on the pricing details tab")
	public void User_482_click_on_the_pricing_details_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.PricingDetailsBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.PricingDetailsBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.PricingDetailsBtn());

	}

	@And("User_482 click on add button under pricing details tab")
	public void User_482_click_on_add_button_under_pricing_details_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.addIcon_PricingDetails());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.addIcon_PricingDetails());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.addIcon_PricingDetails());
	}

	@And("User_482 click on the markup spreadsheet perc under pricing details tab")
	public void User_482_click_on_the_markup_spreadsheet_perc_under_pricing_details_tab() {

		for (int i = 0; i <= 300; i++) {

			try {
				applicationForFinancialFacilityObj.StartDate().click();

				System.out.println(i);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("User_482 enter the markup spreadsheet perc under pricing details tab")
	public void User_482_enter_the_markup_spreadsheet_perc_under_pricing_details_tab() {

		for (int i = 0; i <= 300; i++) {

			try {
				applicationForFinancialFacilityObj.Markup_Spread_InputBx().click();
				seleniumActions.getClickAndActionsHelper()
						.doubleClick(applicationForFinancialFacilityObj.Markup_Spread_InputBx());
				// applicationForFinancialFacilityObj.Markup_Spread_InputBx().sendKeys("1.00000");
				applicationForFinancialFacilityObj.Markup_Spread_InputBx()
						.sendKeys(testData.get("Markup Spreadsheet per"));
				applicationForFinancialFacilityObj.Markup_Spread_InputBx().sendKeys(Keys.TAB);
				System.out.println("clicked on Spread sheet");
				System.out.println(i);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("User_482 click on the floor perc under pricing details tab")
	public void User_482_click_on_the_floor_perc_under_pricing_details_tab() {
		for (int i = 0; i <= 300; i++) {

			try {
				applicationForFinancialFacilityObj.FloorInput().click();

				System.out.println(i);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User_482 enter the floor perc under pricing details tab")
	public void User_482_enter_the_floor_perc_under_pricing_details_tab() {

		for (int i = 0; i <= 300; i++) {

			try {
				applicationForFinancialFacilityObj.FloorInput().click();
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.FloorInput());
				// applicationForFinancialFacilityObj.FloorInput().sendKeys("1.00000");
				applicationForFinancialFacilityObj.FloorInput().sendKeys(testData.get("Floor perc"));
				applicationForFinancialFacilityObj.FloorInput().sendKeys(Keys.TAB);
				System.out.println("clicked on Floor Input");
				System.out.println(i);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("User_482 click on the cap perc under pricing details tab")
	public void User_482_click_on_the_cap_perc_under_pricing_details_tab() {
		for (int i = 0; i <= 300; i++) {

			try {
				applicationForFinancialFacilityObj.CapInput().click();

				System.out.println(i);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User_482 enter the cap perc under pricing details tab")
	public void User_482_enter_the_cap_perc_under_pricing_details_tab() {
		for (int i = 0; i <= 300; i++) {

			try {
				applicationForFinancialFacilityObj.FloorInput().click();
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.CapInput());
				// applicationForFinancialFacilityObj.CapInput().sendKeys("1.00000");
				applicationForFinancialFacilityObj.CapInput().sendKeys(testData.get("Cap perc"));
				applicationForFinancialFacilityObj.CapInput().sendKeys(Keys.TAB);
				System.out.println("clicked on Cap Input");
				System.out.println(i);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User_483 click on the ohk button under pricing details tab")
	public void User_483_click_on_the_ohk_button_under_pricing_details_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.PricingDetailsOKBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.PricingDetailsOKBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.PricingDetailsOKBtn());
	}

	@And("User_482 click on the funding tab")
	public void User_482_click_on_the_funding_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FundingTab());
		// seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.FundingTab());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.FundingTab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.FundingTab());
	}

	@And("User_482 click on the add icon btn under funding")
	public void User_482_click_on_the_add_icon_btn_under_funding() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FundingAddBtn());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.FundingAddBtn());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.FundingAddBtn());
	}

	@And("User_482 click on the new fund rec")
	public void User_482_click_on_the_new_fund_rec() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FundingFundRec());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.FundingFundRec());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.FundingFundRec());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FundingFundCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.FundingFundCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.FundingFundCode());

	}

	@And("User_482 enter the fund code")
	public void User_482_enter_the_fund_code() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FundingFundCode());
		applicationForFinancialFacilityObj.FundingFundCode().clear();
		// applicationForFinancialFacilityObj.FundingFundCode().sendKeys("294");
		applicationForFinancialFacilityObj.FundingFundCode().sendKeys(testData.get("Fund code"));
		applicationForFinancialFacilityObj.FundingFundCode().sendKeys(Keys.TAB);
	}

	@And("User_482 click on condition tab")
	public void User_482_click_on_condition_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ConditionsTab());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.ConditionsTab());
		for (int i = 0; i <= 300; i++) {

			try {
				applicationForFinancialFacilityObj.ConditionsTab().click();

				System.out.println(i);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("User_482 click on Signing Agreemen days")
	public void User_482_click_on_Signing_Agreemen_days() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SigningAgreementFromDay());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SigningAgreementFromDay());
		for (int i = 0; i <= 300; i++) {

			try {
				applicationForFinancialFacilityObj.SigningAgreementFromDay().click();

				System.out.println(i);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("User_482 enter Signing Agreemen days")
	public void User_482_enter_Signing_Agreemen_days() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SigningAgreementFromDay());
		applicationForFinancialFacilityObj.SigningAgreementFromDay().clear();
		// applicationForFinancialFacilityObj.SigningAgreementFromDay().sendKeys("1");
		applicationForFinancialFacilityObj.SigningAgreementFromDay().sendKeys(testData.get("Signing Agreement days"));
		applicationForFinancialFacilityObj.SigningAgreementFromDay().sendKeys(Keys.TAB);
	}

	@And("User_482 click on Effectiveness days")
	public void User_482_click_on_Effectiveness_days() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.EffectiveFromDays());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.EffectiveFromDays());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.EffectiveFromDays());
	}

	@And("User_482 enter the Effectiveness days")
	public void User_482_enter_the_Effectiveness_days() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.EffectiveFromDays());
		applicationForFinancialFacilityObj.EffectiveFromDays().clear();
		// applicationForFinancialFacilityObj.EffectiveFromDays().sendKeys("1");
		applicationForFinancialFacilityObj.EffectiveFromDays().sendKeys(testData.get("Effectiveness days"));
		applicationForFinancialFacilityObj.EffectiveFromDays().sendKeys(Keys.TAB);
	}

	@And("User_482 click on the First Disbursement Days")
	public void User_482_click_on_the_First_Disbursement_Days() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FirstDisburseFromDays());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.FirstDisburseFromDays());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.FirstDisburseFromDays());
	}

	@And("User_482 enter the Disbursement Days")
	public void User_482_enter_the_Disbursement_Days() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FirstDisburseFromDays());
		applicationForFinancialFacilityObj.FirstDisburseFromDays().clear();
		// applicationForFinancialFacilityObj.FirstDisburseFromDays().sendKeys("1");
		applicationForFinancialFacilityObj.FirstDisburseFromDays().sendKeys(testData.get("Disbursement Days"));
		applicationForFinancialFacilityObj.FirstDisburseFromDays().sendKeys(Keys.TAB);
	}

	@And("User_482 click on the Utilization days")
	public void User_482_click_on_the_Utilization_days() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fullUtilizationFromDays());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fullUtilizationFromDays());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.fullUtilizationFromDays());
	}

	@And("User_482 enter the Full Utilization days")
	public void User_482_enter_the_Full_Utilization_days() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fullUtilizationFromDays());
		applicationForFinancialFacilityObj.fullUtilizationFromDays().clear();
		// applicationForFinancialFacilityObj.fullUtilizationFromDays().sendKeys("1");
		applicationForFinancialFacilityObj.fullUtilizationFromDays().sendKeys(testData.get("Utilization days"));
		applicationForFinancialFacilityObj.fullUtilizationFromDays().sendKeys(Keys.TAB);
	}

	@And("User_482 click on the commodities and security component tab")
	public void User_482_click_on_the_commodities_and_security_component_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CommoditiesandSecurityComponents());
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(applicationForFinancialFacilityObj.CommoditiesandSecurityComponents());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.CommoditiesandSecurityComponents());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.CommoditiesandSecurityComponents());
	}

	@And("User_482 click on add button under commodities and security component tab")
	public void User_482_click_on_add_button_under_commodities_and_security_component_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.AddCommoditiesBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.AddCommoditiesBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.AddCommoditiesBtn());
	}

	@And("User_482 click on the category under approve commmodities")
	public void User_482_click_on_the_category_under_approve_commmodities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CommoditiesNewRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.CommoditiesNewRec());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.CommoditiesNewRec());
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				applicationForFinancialFacilityObj.CommoditiesCategoryInput());
//		seleniumActions.getClickAndActionsHelper()
//				.moveToElement(applicationForFinancialFacilityObj.CommoditiesCategoryInput());
//		seleniumActions.getClickAndActionsHelper()
//				.clickOnElement(applicationForFinancialFacilityObj.CommoditiesCategoryInput());
	}

	@And("User_482 enter the category under approve commmodities")
	public void User_482_enter_the_category_under_approve_commmodities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CommoditiesCategoryInput());
		// applicationForFinancialFacilityObj.CommoditiesCategoryInput().click();
		// applicationForFinancialFacilityObj.CommoditiesCategoryInput().sendKeys("01");
		applicationForFinancialFacilityObj.CommoditiesCategoryInput().sendKeys(testData.get("Category Code"));
		applicationForFinancialFacilityObj.CommoditiesCategoryInput().sendKeys(Keys.TAB);
	}

	@And("User_482 click on the sub category code under approve commmodities")
	public void User_482_click_on_the_sub_category_code_under_approve_commmodities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CommoditiesSubCategoryCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.CommoditiesSubCategoryCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.CommoditiesSubCategoryCode());
	}

	@And("User_482 enter the sub category code under approve commmodities")
	public void User_482_enter_the_sub_category_code_under_approve_commmodities() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CommoditiesSubCategoryCode());
		applicationForFinancialFacilityObj.CommoditiesSubCategoryCode().click();
		// applicationForFinancialFacilityObj.CommoditiesSubCategoryCode().sendKeys("11");
		applicationForFinancialFacilityObj.CommoditiesSubCategoryCode().sendKeys(testData.get("Sub Category Code"));
		applicationForFinancialFacilityObj.CommoditiesSubCategoryCode().sendKeys(Keys.TAB);
	}

	@And("User_482 click on commodities code")
	public void User_482_click_on_commodities_code() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CommoditiesCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.CommoditiesCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.CommoditiesCode());
	}

	@And("User_482 enter on commodities code")
	public void User_482_enter_on_commodities_code() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CommoditiesCode());
		applicationForFinancialFacilityObj.CommoditiesCode().click();
		// applicationForFinancialFacilityObj.CommoditiesCode().sendKeys("1");
		applicationForFinancialFacilityObj.CommoditiesCode().sendKeys(testData.get("Commodities Code"));
		applicationForFinancialFacilityObj.CommoditiesCode().sendKeys(Keys.TAB);
	}

	@And("User_482 click on expected perc")
	public void User_482_click_on_expected_perc() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.Expectedperc());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.Expectedperc());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.Expectedperc());
	}

	@And("User_482 enter on expected perc")
	public void User_482_enter_on_expected_perc() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.Expectedperc());

		// applicationForFinancialFacilityObj.Expectedperc().sendKeys("100");
		applicationForFinancialFacilityObj.Expectedperc().sendKeys(testData.get("Expected perc"));
		applicationForFinancialFacilityObj.Expectedperc().sendKeys(Keys.TAB);
	}

	@And("User_482 click on the Source Destination tab")
	public void User_482_click_on_the_Source_Destination_tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SourceDestinationTab());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SourceDestinationTab());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SourceDestinationTab());
	}

	@And("User_482 click on the add  button under specific country")
	public void User_482_click_on_the_add__button_under_specific_country() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SourceDestinationAddBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SourceDestinationAddBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SourceDestinationAddBtn());
	}

	@And("User_482 click on the country code new rec")
	public void User_482_click_on_the_country_code_new_rec() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SourceDestinationSpecificCountryCodeRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SourceDestinationSpecificCountryCodeRec());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SourceDestinationSpecificCountryCodeRec());
	}

	@And("User_482 enter the Country code")
	public void User_482_enter_the_Country_code() {
		// applicationForFinancialFacilityObj.SourceDestinationSpecificCountryCodeinput().sendKeys("320");
		applicationForFinancialFacilityObj.SourceDestinationSpecificCountryCodeinput()
				.sendKeys(testData.get("CountryofFinancing"));
		applicationForFinancialFacilityObj.SourceDestinationSpecificCountryCodeinput().sendKeys(Keys.TAB);
	}

	@And("User_482 click on the expected perc under specific country")
	public void User_482_click_on_the_expected_perc_under_specific_country() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SourceDestinationSpecificCountryEXPECTEDPERC());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.SourceDestinationSpecificCountryEXPECTEDPERC());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.SourceDestinationSpecificCountryEXPECTEDPERC());
	}

	@And("User_482 enter expected per under specific country")
	public void User_482_enter_expected_per_under_specific_country() {
		// applicationForFinancialFacilityObj.SourceDestinationSpecificCountryEXPECTEDPERC().sendKeys("100");
		applicationForFinancialFacilityObj.SourceDestinationSpecificCountryEXPECTEDPERC()
				.sendKeys(testData.get("Expected perc"));
		applicationForFinancialFacilityObj.SourceDestinationSpecificCountryEXPECTEDPERC().sendKeys(Keys.TAB);
	}

	@And("User_482 save the request")
	public void User_482_save_the_request() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.SaveBtn());
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.SaveBtn().click();
				System.out.println("clicked on save button ");
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 1; i < 100; i++) {
			try {
				commonElementsObj.iisConfirmOkButton().click();
				System.out.println("clicked on Confirm save button ");
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 1; i < 100; i++) {
			waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
			try {
				commonElementsObj.iisOkButton().click();
				System.out.println("clicked on ok button ");
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_482 clear the cache")
	public void User_482_clear_the_cache() {
		// Implement your logic here
	}

	@And("User_482 validate the request")
	public void User_482_validate_the_request() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ValidateBtn());
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.ValidateBtn().click();
				System.out.println("clicked on Validate button ");
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
		for (int i = 1; i < 200; i++) {
			try {
				commonElementsObj.iisConfirmOkButton().click();
				System.out.println("clicked on Confrim Validate button ");
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		for (int i = 1; i < 100; i++) {
//			try {
//				commonElementsObj.iisConfirmOkButton().click();
//				System.out.println("clicked on Confirm ok button After Fetching the Request code ");
//				break;
//			} catch (Exception e) {
//				if(i == 100 ) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}

	}

	@And("User_482 Confirm validate the request")
	public void User_482_Confirm_validate_the_request() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());

		for (int i = 1; i < 300; i++) {
			try {
				commonElementsObj.iisConfirmOkButton().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 1; i < 300; i++) {
			try {
				commonElementsObj.iisConfirmOkButton().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_482 fetch the Request code from the pop up")
	public void User_482_fetch_the_Request_code_from_the_pop_up() {

		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.SuccessfullPopup());

		String SuccessfullPopup = applicationForFinancialFacilityObj.SuccessfullPopup().getText();

		String text = SuccessfullPopup;

		Pattern pattern = Pattern.compile("\\b\\d{4}\\b");

		Matcher matcher = pattern.matcher(text);

		// Iterate through the matches and print each 4-digit integer
		while (matcher.find()) {
			Request_Code = matcher.group().trim();
			System.out.println("Request Code: " + Request_Code);

			System.out.println("Fetched the Request code");

		}

		for (int i = 1; i < 100; i++) {
			try {
				commonElementsObj.iisOkButton().click();
				System.out.println("clicked on OK button After Fetching the Request code ");
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_482 close the screen$")
	public void User_482_close_the_screen() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		for (int i = 1; i < 100; i++) {
			try {
				commonElementsObj.iisScreenCloseBtn().click();
				System.out.println("clicked on OK button After Fetching the Request code ");
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		if (commonElementsObj.iisConfirmOkButton().isDisplayed())

			for (int i = 1; i < 100; i++) {
				try {
					commonElementsObj.iisConfirmOkButton().click();
					System.out.println("clicked on OK button After Fetching the Request code ");
					break;
				} catch (Exception e) {
					continue;
				}
			}

	}

	@And("User_482 click on the aprrove 1 tab under maintenence")
	public void User_482_click_on_the_aprrove_1_tab_under_maintenence() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.Approve1Tab());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.Approve1Tab());
		// seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.Approve1Tab());
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.Approve1Tab().click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 click on the search button under Approve level one")
	public void User_482_click_on_the_search_button_under_Approve_level_one() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.Approve1SearchBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.Approve1SearchBtn());
		// seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.Approve1SearchBtn());
		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.Approve1SearchBtn().click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_482 click on clear button under search$")
	public void User_482_click_on_clear_button_under_search() {

		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisClearBtn());
		for (int i = 1; i < 10; i++) {
			try {
				commonElementsObj.iisClearBtn().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("User_482 click on the code under Approve level one")
	public void User_482_click_on_the_code_under_Approve_level_one() throws InterruptedException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.Approve1SearchCodeFeild());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.Approve1SearchCodeFeild());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.Approve1SearchCodeFeild());
		Thread.sleep(20000);
	}

	@And("User_482 enter the code under Approve level one")
	public void User_482_enter_the_code_under_Approve_level_one() {
		applicationForFinancialFacilityObj.Approve1SearchCodeFeild().sendKeys(Request_Code);
		applicationForFinancialFacilityObj.Approve1SearchCodeFeild().sendKeys(Keys.ENTER);
	}

	@And("^User_482 selects the record$")
	public void User_482_selects_the_record() throws InterruptedException {

		Thread.sleep(3000);
		applicationForFinancialFacilityObj.Approve1SearchCodeFeild().sendKeys(Keys.ARROW_DOWN);
	}

	@And("User_482 double click on the retrived record under Approve level one")
	public void User_482_double_click_on_the_retrived_record_under_Approve_level_one() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.Approve1SearchFetch_Rec());

		for (int i = 1; i < 100; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.doubleClick(applicationForFinancialFacilityObj.Approve1SearchFetch_Rec());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("User_482 click on Customer Grading Tab")
	public void User_482_click_on_Customer_Grading_Tab() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.CustomerGradingTab());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.CustomerGradingTab());

		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.CustomerGradingTab().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_482 select the approve from the approve level one dropdown")
	public void User_482_select_the_approve_from_the_approve_level_one_dropdown() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ApproveLevel1DropDown());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				applicationForFinancialFacilityObj.ApproveLevel1DropDown(), testData.get("DecisionApproveLevel1"));
	}

	@And("User_482 click on the Approve btn under under Approve level one")
	public void User_482_click_on_the_Approve_btn_under_under_Approve_level_one() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.ApproveBTN());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.ApproveBTN());

		for (int i = 1; i < 100; i++) {
			try {
				applicationForFinancialFacilityObj.ApproveBTN().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
		for (int i = 1; i < 100; i++) {
			try {
				commonElementsObj.iisConfirmOkButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		for (int i = 1; i < 100; i++) {
			try {
				commonElementsObj.iisOkButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	// ****************************************************************************************************************************
	// @AT_RF_108

	@And("User_482 click on the facilty managment screen under johns sub module")
	public void User_482_click_on_the_facilty_managment_screen_under_johns_sub_module() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementModule());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.FacilitiesManagementModule());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.FacilitiesManagementModule());
	}

	@And("User_482 click on the maintenance under facility managment screen")
	public void User_482_click_on_the_maintenance_under_facility_managment_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.FacilitiesManagementMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.FacilitiesManagementMaintenance());
	}

	@And("User_482 click on the search button under facility managment screen")
	public void User_482_click_on_the_search_button_under_facility_managment_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.infoBarSearchButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.infoBarSearchButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.infoBarSearchButton());
	}

	@And("User_482 click on the code feild under facility managment screen")
	public void User_482_click_on_the_code_feild_under_facility_managment_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.FacilitiesManagementCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.FacilitiesManagementCode());
	}

	@And("User_482 enter the facility code")
	public void User_482_enter_the_facility_code() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementCode());
		applicationForFinancialFacilityObj.FacilitiesManagementCode().sendKeys("1822");
		applicationForFinancialFacilityObj.FacilitiesManagementCode().sendKeys(Keys.ENTER);
	}

	@And("User_482 double click on the the retrieved rec")
	public void User_482_double_click_on_the_the_retrieved_rec() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementRetrivedRec());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.FacilitiesManagementRetrivedRec());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(applicationForFinancialFacilityObj.FacilitiesManagementRetrivedRec());
	}

	@And("User_482 click on the additonal tab under facilty managment screen")
	public void User_482_click_on_the_additonal_tab_under_facilty_managment_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementAdditional_Details_Tab());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.FacilitiesManagementAdditional_Details_Tab());
		for (int i = 1; i < 50; i++) {
			try {
				applicationForFinancialFacilityObj.FacilitiesManagementAdditional_Details_Tab().click();
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 click on the commodities and security component screen")
	public void User_482_click_on_the_commodities_and_security_component_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementCommoditiesandSecurityComponentTab());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.FacilitiesManagementCommoditiesandSecurityComponentTab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.FacilitiesManagementCommoditiesandSecurityComponentTab());
	}

	@And("User_482 validate is the system is defaulting Coverage Type and Required Coverage perc from Application to Facility")
	public void User_482_validate_is_the_system_is_defaulting_Coverage_Type_and_Required_Coverage_perc_from_Application_to_Facility() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementCoverageTypeDropDown());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.FacilitiesManagementRequiredCoveragePerc());

		String CoverageDropDown = applicationForFinancialFacilityObj.FacilitiesManagementCoverageTypeDropDown()
				.getAttribute("prevvalue").trim();// .getText();
		String CoverageRequiredPerc = applicationForFinancialFacilityObj.FacilitiesManagementRequiredCoveragePerc()
				.getText().trim();

		String Fixed = "F";
		String Flexible = "E";

		System.out.println(CoverageDropDown);
		System.out.println(CoverageRequiredPerc);

		if (CoverageDropDown.equalsIgnoreCase(Flexible)) {
			System.out.println(
					"The system is defaulting Coverage Type and Required Coverage % from Application to Facility Correctly");
		} else {
			System.out.println(
					"The system is defaulting Coverage Type and Required Coverage % from Application to Facility Correctly InCorrectly");
		}

	}

	// **********************************************************************************************************************************
	// @AT_RF_123

	@And("User_482 update Test data set for AT_RF_123")
	public void user_482_update_test_data_set_for_AT_RF_123() {
		// testExecutionData = testExecution.getTestdata("AT_RF_001");
		testData = requestForFinancingData.getTestdata("AT_RF_123_D1");
		// System.out.println(testData.get(requestForFinancingData.getTestdata("AT_RF_001")));

	}
	
	@And("User_482 update Test data set for AT_CM_010")
	public void user_482_update_test_data_set_for_AT_CM_010() {
		 testExecutionData = testExecution.getTestdata("AT_CM_010");
		//testData = requestForFinancingData.getTestdata("AT_RF_123_D1");
		 System.out.println(testData.get(requestForFinancingData.getTestdata("AT_CM_010")));

	}

	@And("User_482 click on the document checklist button")
	public void User_482_click_on_the_document_checklist_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.DocumentChecklistKey());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.DocumentChecklistKey());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.DocumentChecklistKey());
	}

	@And("User_482 fetch the Request code from the save pop up")
	public void User_482_fetch_the_Request_code_from_the_save_pop_up() {

		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.SavefullPopup1());

		String SuccessfullPopup = applicationForFinancialFacilityObj.SavefullPopup1().getText();

		String text = SuccessfullPopup;

		Pattern pattern = Pattern.compile("\\b\\d{4}\\b");

		Matcher matcher = pattern.matcher(text);

		// Iterate through the matches and print each 4-digit integer
		while (matcher.find()) {
			Request_Code = matcher.group().trim();
			System.out.println("Request Code: " + Request_Code);

			System.out.println("Fetched the Request code");

		}

		for (int i = 1; i < 100; i++) {
			try {
				commonElementsObj.iisOkButton().click();
				System.out.println("clicked on OK button After Fetching the Request code ");
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_482 check System should display the documents successfully")
	public void User_482_check_System_should_display_the_documents_successfully() {

		for (int i = 1; i <= 2; i++) {
			WebElement Document_Records = seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					applicationForFinancialFacilityObj.Document_Records());

			if (Document_Records.isDisplayed()) {
				System.out.println("Record Found :" + i);
				System.out
						.println("Record" + i + ":" + applicationForFinancialFacilityObj.Document_Records().getText());
			}

			else {
				System.out.println("No Record Found");
			}

		}

	}

	@And("^User_482 click on the ok button document checklist$")
	public void user_482_click_on_the_ok_button_document_checklist() {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.DocumentChecklist());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.DocumentChecklist());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj.DocumentChecklist());
	}

	@And("User_482 close the Maintenence screen under WIRAK Application")
	public void User_482_close_the_Maintenence_screen_under_WIRAK_Application() {
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

	@And("User_482 Close the Approval 1 Screen")
	public void User_482_Close_the_Approval_1_Screen() {
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

	
}
