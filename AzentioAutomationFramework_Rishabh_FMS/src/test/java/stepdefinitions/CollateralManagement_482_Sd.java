package stepdefinitions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import pageobjects.fms.CollateralManagement_482_Obj;
import pageobjects.iisParam.CommonElementsObj;
import resources.BaseClass;

public class CollateralManagement_482_Sd extends BaseClass {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CollateralManagement_482_Obj collateralManagementObj = new CollateralManagement_482_Obj(driver);
	CommonElementsObj commonElementsObj = new CommonElementsObj(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData collateralManagementData = new ExcelData(path, "CollateralManagement_482", "DataSet ID");
	ExcelData testExecution = new ExcelData(path, "TestExecution", "TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String CollateralRequestCode,VerifySrchCodeRecXpath;
	WebElement SearchedRecRow ;
	

	@And("User_482 Click Collateral Management WIFAK Application")
	public void user_482_click_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(collateralManagementObj.CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.CollateralManagement_WF_482());

	}

	@And("User_482 Update Test data set id for AT_CM_025")
	public void user_482_update_test_data_set_id_for_at_cm_025() {
		testExecutionData = testExecution.getTestdata("AT_CM_025");
		testData = collateralManagementData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 Update Test data set id for AT_CM_026")
	public void user_482_update_test_data_set_id_for_at_cm_026() {
		testExecutionData = testExecution.getTestdata("AT_CM_026");
		testData = collateralManagementData.getTestdata(testExecutionData.get("Data Set ID"));
	}
	
	@And("User_482 Update Test data set id for AT_CM_017")
	public void User_482_Update_Test_data_set_id_for_AT_CM_017() {
		testExecutionData = testExecution.getTestdata("AT_CM_017");
		testData = collateralManagementData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 Click Maintenance Screen in Collateral Management_WIFAK")
	public void user_482_click_maintenance_screen_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.MaintenanceScreen_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.MaintenanceScreen_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.MaintenanceScreen_CollateralManagement_WF_482());

	}

	@And("User_482 Enter Collateral Type In Collateral Management_WIFAK")
	public void user_482_enter_collateral_type_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.collateralType_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(collateralManagementObj.collateralType_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(collateralManagementObj.collateralType_WF_482());
		collateralManagementObj.collateralType_WF_482().sendKeys(testData.get("CollateralType"));
		collateralManagementObj.collateralType_WF_482().sendKeys(Keys.TAB);    
		for (int i = 0; i < 200; i++) {
			if (!collateralManagementObj.collateralTypeNameValidation_WF_482().getAttribute("prevvalue").isBlank()
					|| !collateralManagementObj.collateralTypeNameValidation_WF_482().getAttribute("prevvalue")
							.isEmpty()) {
				break;
			}
		}

	}

	@And("User_482 Enter Valid From date In Collateral Management_WIFAK")
	public void user_482_enter_valid_from_date_in_collateral_management_wifak() throws ParseException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.validFromDate_CollateralManagement_WF_482());
		String runningdate = collateralManagementObj.system_RunningDate_482().getText();
		SimpleDateFormat fromUser = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		String reformattedStr = myFormat.format(fromUser.parse(runningdate));
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.validFromDate_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.validFromDate_CollateralManagement_WF_482());
		collateralManagementObj.validFromDate_CollateralManagement_WF_482().sendKeys(reformattedStr);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.system_RunningDate_482());

	}

	@And("User_482 Enter Valid To date In Collateral Management_WIFAK")
	public void user_482_enter_valid_to_date_in_collateral_management_wifak() throws ParseException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.validToDate_CollateralManagement_WF_482());
		String runningdate = collateralManagementObj.system_RunningDate_482().getText();
		SimpleDateFormat fromUser = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		String reformattedStr = myFormat.format(fromUser.parse(runningdate));
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.validToDate_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.validToDate_CollateralManagement_WF_482());
		collateralManagementObj.validToDate_CollateralManagement_WF_482().sendKeys(reformattedStr);

	}

	@And("User_482 Enter Brief Description In Collateral Management_WIFAK")
	public void user_482_enter_brief_description_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.briefDescription_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.briefDescription_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.briefDescription_CollateralManagement_WF_482());
		collateralManagementObj.briefDescription_CollateralManagement_WF_482()
				.sendKeys(testData.get("BriefDescription"));

	}

	@And("User_482 Enter Long Description In Collateral Management_WIFAK")
	public void user_482_enter_long_description_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.longDescription_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.longDescription_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.longDescription_CollateralManagement_WF_482());
		collateralManagementObj.longDescription_CollateralManagement_WF_482().sendKeys(testData.get("LongDescription"));

	}

	@And("User_482 Enter Collateral Currency In Collateral Management_WIFAK")
	public void user_482_enter_collateral_currency_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.collateralCurrency_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.collateralCurrency_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.collateralCurrency_CollateralManagement_WF_482());
		collateralManagementObj.collateralCurrency_CollateralManagement_WF_482()
				.sendKeys(testData.get("CollateralCurrency"));
		collateralManagementObj.collateralCurrency_CollateralManagement_WF_482().sendKeys(Keys.TAB);
		for (int i = 0; i < 2000; i++) {
			if (!collateralManagementObj.collateralTypeNameValidation_WF_482().getAttribute("prevvalue").isBlank()
					|| !collateralManagementObj.collateralTypeNameValidation_WF_482().getAttribute("prevvalue")
							.isEmpty()) {
				break;
			}
		}

	}

	@And("User_482 Click Custom Tab In Collateral Management_WIFAK")
	public void user_482_click_custom_tab_in_collateral_management_wifak() {
		for (int i = 0; i < 10; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(collateralManagementObj.customFieldsTab_CollateralManagement_WF_482());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(collateralManagementObj.customFieldsTab_CollateralManagement_WF_482());
			} catch (Exception e) {

			}

		}

	}

	@Then("User_482 Enter test Custom field and Validate system does not allow decimal field")
	public void user_482_enter_test_custom_field_and_validate_system_does_not_allow_decimal_field() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.testCustomField_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.testCustomField_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.testCustomField_CollateralManagement_WF_482());
		collateralManagementObj.testCustomField_CollateralManagement_WF_482().sendKeys(testData.get("CustomValue"));
		for (int i = 0; i < 10; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(collateralManagementObj.customFieldsTab_CollateralManagement_WF_482());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(collateralManagementObj.customFieldsTab_CollateralManagement_WF_482());
			} catch (Exception e) {

			}

		}
		String customField = "";
		for (int i = 0; i < 20; i++) {
			customField = collateralManagementObj.testCustomField_CollateralManagement_WF_482()
					.getAttribute("prevvalue");
		}
		System.out.println(customField);
		Assert.assertEquals(customField,
				String.valueOf(testData.get("CustomValue").charAt(testData.get("CustomValue").length() - 1)));

	}

	@And("User_482 Get the Code in Success Pop up Menu under WIFAK Application for Collateral Management")
	public void user_482_get_the_code_in_success_pop_up_menu_under_wifak_application_for_collateral_management() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.getRequestIdInCollateralManagementScreen_WIFAK());
		 CollateralRequestCode = collateralManagementObj.getRequestIdInCollateralManagementScreen_WIFAK()
				.getText().substring(21, 25);
		collateralManagementData.updateTestData(testExecutionData.get("Data Set ID"), "CollateralRequestCode",
				CollateralRequestCode);
		System.out.println(CollateralRequestCode);
	}

	@And("User_482 Enter CIF NO In Collateral Management_WIFAK")
	public void user_482_enter_cif_no_in_collateral_management_wifak() {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(collateralManagementObj.cifNo_CollateralManagement_WF_482());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(collateralManagementObj.cifNo_CollateralManagement_WF_482());
				collateralManagementObj.cifNo_CollateralManagement_WF_482().sendKeys(testData.get("CIFNO"));
				collateralManagementObj.cifNo_CollateralManagement_WF_482().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 Click Additional Details In Collateral Management_WIFAK")
	public void user_482_click_additional_details_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.AdditionalDetails_CollateralManagement_WF_482());
		for (int i = 0; i < 20; i++) {
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(collateralManagementObj.AdditionalDetails_CollateralManagement_WF_482());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(collateralManagementObj.AdditionalDetails_CollateralManagement_WF_482());
		}

	}

	@And("User_482 Enter FC Valuedsf in Additional Details")
	public void user_482_enter_fc_valuedsf_in_additional_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.fcValuedsf_AdditionalDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.fcValuedsf_AdditionalDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.fcValuedsf_AdditionalDetails_WF_482());
		collateralManagementObj.fcValuedsf_AdditionalDetails_WF_482().sendKeys(testData.get("FCValuedsf"));
		collateralManagementObj.fcValuedsf_AdditionalDetails_WF_482().sendKeys(Keys.TAB);
		for (int i = 0; i < 200; i++) {
			try {
				if (!collateralManagementObj.marketFCValue_AdditionalDetails_WF_482().getAttribute("prevvalue")
						.isBlank()
						|| !collateralManagementObj.marketFCValue_AdditionalDetails_WF_482().getAttribute("prevvalue")
								.isEmpty()) {
					break;
				}

			} catch (Exception e) {

			}
		}

	}

	@And("User_482 Enter Date Accepted In Additional Details")
	public void user_482_enter_date_accepted_in_additional_details() throws ParseException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.dateAccepted_AdditionalDetails_WF_482());
		String runningdate = collateralManagementObj.system_RunningDate_482().getText();
		SimpleDateFormat fromUser = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		String reformattedStr = myFormat.format(fromUser.parse(runningdate));
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.dateAccepted_AdditionalDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.dateAccepted_AdditionalDetails_WF_482());
		collateralManagementObj.dateAccepted_AdditionalDetails_WF_482().sendKeys(reformattedStr);
		collateralManagementObj.dateAccepted_AdditionalDetails_WF_482().sendKeys(Keys.TAB);

	}

	@And("User_482 Enter Valuation Date in Additional Details")
	public void user_482_enter_valuation_date_in_additional_details() throws ParseException {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.valuationDate_AdditionalDetails_WF_482());
		String runningdate = collateralManagementObj.system_RunningDate_482().getText();
		SimpleDateFormat fromUser = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		String reformattedStr = myFormat.format(fromUser.parse(runningdate));
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.valuationDate_AdditionalDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.valuationDate_AdditionalDetails_WF_482());
		collateralManagementObj.valuationDate_AdditionalDetails_WF_482().sendKeys(reformattedStr);
		collateralManagementObj.valuationDate_AdditionalDetails_WF_482().sendKeys(Keys.TAB);

	}

	@And("User_482 Click Property Owner Details Tab In Collateral Management_WIFAK")
	public void user_482_click_property_owner_details_tab_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				collateralManagementObj.propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				collateralManagementObj.propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482());

	}

	@And("User_482 Click add Icon in Property Owner Details Tab Collateral Management_WIFAK")
	public void user_482_click_add_icon_in_property_owner_details_tab_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.addIcon_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.addIcon_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.addIcon_PropertyOwnerDetails_WF_482());

	}

	@And("User_482 Enter Name In Property Owner Details Collateral Management_WIFAK")
	public void user_482_enter_name_in_property_owner_details_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.clickToAddPropertyDetails_Maintenance_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().doubleClick(
				collateralManagementObj.clickToAddPropertyDetails_Maintenance_CollateralManagement_WF_482());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.name_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.name_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.name_PropertyOwnerDetails_WF_482());
		collateralManagementObj.name_PropertyOwnerDetails_WF_482().sendKeys(testData.get("NameProperty"));
//		collateralManagementObj.name_PropertyOwnerDetails_WF_482().sendKeys(Keys.TAB);

	}

	@And("User_482 Enter Country Code In Property Owner Details Collateral Management_WIFAK")
	public void user_482_enter_country_code_in_property_owner_details_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482());
		collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482().sendKeys(testData.get("CountryCode"));
		collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482().sendKeys(Keys.ENTER);
		collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482().sendKeys(Keys.ENTER);

	}

	@And("User_482 Click Save Button In Collateral Management_WIFAK")
	public void user_482_click_save_button_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.saveButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				collateralManagementObj.saveButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				collateralManagementObj.saveButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK());

	}

	@And("User_482 Click Approve Sub Menu In Collateral Management WIFAK Application")
	public void user_482_click_approve_sub_menu_in_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.approveScreenInCollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.approveScreenInCollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.approveScreenInCollateralManagementScreen_WIFAK());

	}

	@Given("User_482 Close Maintenance tab in collateral management under WIFAK application")
	public void user_482_close_maintenance_tab_in_collateral_management_under_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.closeWIFAKAPPCollateralMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.closeWIFAKAPPCollateralMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.closeWIFAKAPPCollateralMaintenance_WF_482());
	}

	@And("User_482 Search Code In Approve Screen Collateral Management WIFAK Application")
	public void user_482_search_code_in_approve_screen_collateral_management_wifak_application() {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(
						collateralManagementObj.searchCodeInApproveScreen_CollateralManagementScreen_WIFAK());
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						collateralManagementObj.searchCodeInApproveScreen_CollateralManagementScreen_WIFAK());
				collateralManagementObj.searchCodeInApproveScreen_CollateralManagementScreen_WIFAK()
						.sendKeys(testData.get("CollateralRequestCode"));
				collateralManagementObj.searchCodeInApproveScreen_CollateralManagementScreen_WIFAK()
						.sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String xpath = "//td[contains(text(),'" + testData.get("CollateralRequestCode") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Select Searched Code In Approve Screen Collateral Management WIFAK Application")
	public void user_482_select_searched_code_in_approve_screen_collateral_management_wifak_application() {
		String ApproveSrchCodeRecXpath1 = "//td[@tdlabel ='Code'][contains(text() ,'"+CollateralRequestCode+"')]";
		WebElement SearchedRecRowApprove = driver.findElement(By.xpath(ApproveSrchCodeRecXpath1));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, SearchedRecRowApprove);
		seleniumActions.getClickAndActionsHelper().moveToElement(SearchedRecRowApprove);
		for(int i = 1 ; i<200 ; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
				.doubleClick(SearchedRecRowApprove);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("User_482 Click Approve Button In Approve Screen Collateral Management WIFAK Application")
	public void user_482_click_approve_button_in_approve_screen_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.approveButtonInApproveScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.approveButtonInApproveScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				collateralManagementObj.approveButtonInApproveScreen_CollateralManagementScreen_WIFAK());

	}
	
	//********************************************************** Verify Start *****************************************************************
	
	@And("User_482 Search Code In Verify Screen Collateral Management WIFAK Application")
	public void user_482_search_code_in_Verify_screen_collateral_management_wifak_application() {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(
						collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK());
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK());
				collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK()
						.sendKeys(testData.get("CollateralRequestCode"));
				collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK()
						.sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String xpath = "//td[contains(text(),'" + testData.get("CollateralRequestCode") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Select Searched Code In Verify Screen Collateral Management WIFAK Application")
	public void user_482_select_searched_code_in_Verify_screen_collateral_management_wifak_application() {
	    VerifySrchCodeRecXpath = "//tr//td[@tdlabel = 'Code'][contains(text(), '"+CollateralRequestCode+"')]";
	    SearchedRecRow = driver.findElement(By.xpath(VerifySrchCodeRecXpath));
		System.out.println("Searched Rec Row Xapth : "+ SearchedRecRow);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, SearchedRecRow);
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(SearchedRecRow);
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(SearchedRecRow);

	}

	@And("User_482 Click Verify Button In Verify Screen Collateral Management WIFAK Application")
	public void user_482_click_Verify_button_in_Verify_screen_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.VerifyButtonInVerifyScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.VerifyButtonInVerifyScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getJavascriptHelper().scrollIntoView(collateralManagementObj.VerifyButtonInVerifyScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.VerifyButtonInVerifyScreen_CollateralManagementScreen_WIFAK());

	}

	@And("User_482 close the verify Tab in collateral management under WIFAK application")
	public void User_482_close_the_verify_Tab_in_collateral_management_under_WIFAK_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				commonElementsObj.iisScreenCloseBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(commonElementsObj.iisScreenCloseBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(commonElementsObj.iisScreenCloseBtn());
	}
		//********************************************************** Verify End*****************************************************************
	

	@And("User_482 Click Verify Menu In Collateral Management WIFAK Application")
	public void User_482_Click_Verify_Sub_Menu_In_Collateral_Management_WIFAK_Application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.VerifyScreenInCollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.VerifyScreenInCollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.VerifyScreenInCollateralManagementScreen_WIFAK());

	}

	@And("User_482 Search Code in Udpadte After Approve Under Collateral Management WIFAK Application")
	public void user_482_search_code_in_udpadte_after_approve_under_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK());
		collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK()
				.sendKeys(testData.get("CollateralRequestCode"));
		collateralManagementObj.searchCodeInVerifyScreen_CollateralManagementScreen_WIFAK()
				.sendKeys(Keys.ENTER);
		String xpath = "//td[contains(text(),'" + testData.get("CollateralRequestCode") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}

	}
	

	@And("User_482 Select Searched Code in Update After Approve Under Collateral Management WIFAK Application")
	public void user_482_select_searched_code_in_update_after_approve_under_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, collateralManagementObj
				.selectSearchCodeInVerifyScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(collateralManagementObj.selectSearchCodeInVerifyScreen_CollateralManagementScreen_WIFAK());

	}

	@And("User_482 Click Property Owner Details in Collateral Management WIFAK Application")
	public void user_482_click_property_owner_details_in_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				collateralManagementObj.propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				collateralManagementObj.propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482());

	}

	@And("User_482 Click add icon In property owner details")
	public void user_482_click_add_icon_in_property_owner_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.addIcon_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.addIcon_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.addIcon_PropertyOwnerDetails_WF_482());

	}

	@And("User_482 Click Save Button In Update After Approve Collateral Management_WIFAK")
	public void user_482_click_save_button_in_update_after_approve_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.saveButtonInUpdateAfterApproveScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				collateralManagementObj.saveButtonInUpdateAfterApproveScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				collateralManagementObj.saveButtonInUpdateAfterApproveScreen_CollateralManagementScreen_WIFAK());

	}

	@And("User_482 Delete the Row and Validate")
	public void user_482_delete_the_row_and_validate() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.deleteIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.deleteIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.deleteIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482());

	}

	@And("User_482 Select Searched Code in Udpadte After Approve Under Collateral Management WIFAK Application")
	public void user_482_select_searched_code_in_udpadte_after_approve_under_collateral_management_wifak_application() {

	}

	@And("User_482 Search Code In Maintenance Screen Collateral Management WIFAK Application")
	public void user_482_search_code_in_maintenance_screen_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.searchCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				collateralManagementObj.searchCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				collateralManagementObj.searchCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK());
		collateralManagementObj.searchCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK()
				.sendKeys(testData.get("CollateralRequestCode"));
		collateralManagementObj.searchCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK().sendKeys(Keys.ENTER);
		String xpath = "//td[contains(text(),'" + testData.get("CollateralRequestCode") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Select Searched Code In Maintenance Screen Collateral Management WIFAK Application")
	public void user_482_select_searched_code_in_maintenance_screen_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.selectSearchedCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper().doubleClick(
				collateralManagementObj.selectSearchedCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK());
	}

	@And("User_482 Click Property Owner Details in Update After Approve Screen Collateral Management WIFAK Application")
	public void user_482_click_property_owner_details_in_update_after_approve_screen_collateral_management_wifak_application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.propertyOwnerDetails_UpdateAfterApprove_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				collateralManagementObj.propertyOwnerDetails_UpdateAfterApprove_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				collateralManagementObj.propertyOwnerDetails_UpdateAfterApprove_CollateralManagement_WF_482());
	}

	@And("User_482 Enter test Custom field In Collateral Management_WIFAK")
	public void user_482_enter_test_custom_field_in_collateral_management_wifak() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.testCustomField_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.testCustomField_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.testCustomField_CollateralManagement_WF_482());
		collateralManagementObj.testCustomField_CollateralManagement_WF_482().sendKeys(testData.get("CustomValue"));
	}

	@Given("User_482 Click add icon In Update After Approve property owner details")
	public void user_482_click_add_icon_in_update_after_approve_property_owner_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.addIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.addIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.addIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482());
	}

	@Given("User_482 Enter Name2 In Property Owner Details Collateral Management_WIFAK")
	public void user_482_enter_name2_in_property_owner_details_collateral_management_wifak(Integer int1) {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.clickToAddPropertyDetails2_UpdateAfterApprove_CollateralManagement_WF_482());
		seleniumActions.getClickAndActionsHelper().doubleClick(
				collateralManagementObj.clickToAddPropertyDetails2_UpdateAfterApprove_CollateralManagement_WF_482());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.name_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.name_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.name_PropertyOwnerDetails_WF_482());
		collateralManagementObj.name_PropertyOwnerDetails_WF_482().sendKeys(testData.get("NameProperty"));
	}

	@Given("User_482 Enter Country Code2 In Property Owner Details Collateral Management_WIFAK")
	public void user_482_enter_country_code2_in_property_owner_details_collateral_management_wifak(Integer int1) {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482());
		collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482().sendKeys(testData.get("CountryCode"));
		collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482().sendKeys(Keys.ENTER);
		collateralManagementObj.countryCode_PropertyOwnerDetails_WF_482().sendKeys(Keys.ENTER);
	}

	// *****************************************************************************************************************************************
	// @AT_CM_017

	@And("User_482 click on Reverse tab under Collateral Management WIFAK Application")
	public void User_482_click_on_Reverse_tab_under_Collateral_Management_WIFAK_Application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.ReverseScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.ReverseScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.ReverseScreen_CollateralManagementScreen_WIFAK());
	}

	@And("User_482 get the ID")
	public void User_482_get_the_ID() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.ReverseScreen_CollateralManagementScreen_WIFAK());
		String ID = collateralManagementObj.ReverseScreen_CollateralManagementScreen_WIFAK().getAttribute("menuvar");
		System.out.println("ID :" + ID);
	}

	@And("User_482 click on the code under Reverse Search")
	public void User_482_click_on_the_code_under_Reverse_Search() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.searchCodeInReverseScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.searchCodeInReverseScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.searchCodeInReverseScreen_CollateralManagementScreen_WIFAK());
	}

	@And("User_482 enter the code under Reverse Search")
	public void User_482_enter_the_code_under_Reverse_Search() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.searchCodeInReverseScreen_CollateralManagementScreen_WIFAK());
		collateralManagementObj.searchCodeInReverseScreen_CollateralManagementScreen_WIFAK().clear();
		collateralManagementObj.searchCodeInReverseScreen_CollateralManagementScreen_WIFAK().sendKeys("CollateralRequestCode");
		// collateralManagementObj.ReverseScreen_CollateralManagementScreen_WIFAK().sendKeys(testData.get("code"));
		collateralManagementObj.searchCodeInReverseScreen_CollateralManagementScreen_WIFAK().sendKeys(Keys.ENTER);
	}

	@And("User_482 select the Retrived Rec under Reverse Search")
	public void User_482_select_the_Retrived_Rec_under_Reverse_Search() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.selectSearchedCodeInReverseScreen_CollateralManagementScreen_WIFAK());		
		seleniumActions.getClickAndActionsHelper().doubleClick(
				collateralManagementObj.selectSearchedCodeInReverseScreen_CollateralManagementScreen_WIFAK());
		for (int i = 0; i < 10; i++) {
			try {
				seleniumActions.getWaitHelper().waitForBufferToInvisible(driver, commonElementsObj.ProgressIcon());
				break;

			} catch (Exception e) {

			}

		}

	}

	@And("User_482 click on the Reverse Submit Button")
	public void User_482_click_on_the_Reverse_Submit_Button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				collateralManagementObj.ReverseButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(collateralManagementObj.ReverseButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(collateralManagementObj.ReverseButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK());
	}
	
	
	//@AT_CM_016**********************************************************************************************************************************************************************


	@And("User_482 Enter the Leverage Ratio In Collateral Management_WIFAK")
	public void User_482_Enter_the_Leverage_Ratio_In_Collateral_Management_WIFAK() {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(collateralManagementObj.cifNo_CollateralManagement_WF_482());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(collateralManagementObj.cifNo_CollateralManagement_WF_482());
				collateralManagementObj.cifNo_CollateralManagement_WF_482().sendKeys(testData.get("CIFNO"));
				collateralManagementObj.cifNo_CollateralManagement_WF_482().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@And("User_482 Click on the Collateral Cash Details Tab under Collateral Management_WIFAK")
	public void User_482_Click_on_the_Collateral_Cash_Details_Tab_under_Collateral_Management_WIFAK() {
	    // Implement your logic here
	}


	@And("User_482 Click on the add icon under Collateral Cash Details Screen")
	public void User_482_Click_on_the_add_icon_under_Collateral_Cash_Details_Screen() {
	    // Implement your logic here
	}


	@And("User_482 Enter the Portfolio Branch under Collateral Cash Details Screen")
	public void User_482_Enter_the_Portfolio_Branch_under_Collateral_Cash_Details_Screen() {
	    // Implement your logic here
	}


	@And("User_482 Enter the Acc Branch under Collateral Cash Details Screen")
	public void User_482_Enter_the_Acc_Branch_under_Collateral_Cash_Details_Screen() {
	    // Implement your logic here
	}


	@And("User_482 Enter the Acc Gl under Collateral Cash Details Screen")
	public void User_482_Enter_the_Acc_Gl_under_Collateral_Cash_Details_Screen() {
	    // Implement your logic here
	}


	@And("User_482 Enter the Acc CIF under Collateral Cash Details Screen")
	public void User_482_Enter_the_Acc_CIF_under_Collateral_Cash_Details_Screen() {
	    // Implement your logic here
	}


	@And("User_482 Enter the Acc Sl under Collateral Cash Details Screen")
	public void User_482_Enter_the_Acc_Sl_under_Collateral_Cash_Details_Screen() {
	    // Implement your logic here
	}


	@And("User_482 Enter the Amount under Collateral Cash Details Screen")
	public void User_482_Enter_the_Amount_under_Collateral_Cash_Details_Screen() {
	    // Implement your logic here
	}


	@And("User_482 Click on the Custom Feilds Tab In Collateral Management_WIFAK")
	public void User_482_Click_on_the_Custom_Feilds_Tab_In_Collateral_Management_WIFAK() {
	    // Implement your logic here
	}


	@And("User_482 Enter the Tset In Collateral Management_WIFAK")
	public void User_482_Enter_the_Tset_In_Collateral_Management_WIFAK() {
	    // Implement your logic here
	}


}
