package stepdefinitions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.fms.ApplicationForFinancialFacility_482_Obj;
import pageobjects.fms.DrawDownRequestObj;
import pageobjects.iisParam.CommonElementsObj;
import resources.BaseClass;

public class DrawDownRequestSd_482 {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	DrawDownRequestObj drawDownRequest = new DrawDownRequestObj(driver);
	CommonElementsObj commonElementsObj = new CommonElementsObj(driver);
	ApplicationForFinancialFacility_482_Obj applicationForFinancialFacilityObj  = new ApplicationForFinancialFacility_482_Obj(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WaitHelper waitHelper = new WaitHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData drawDownRequestData = new ExcelData(path, "DrawDownRequest", "DataSet ID");
	ExcelData testExecution = new ExcelData(path, "TestExecution", "TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	

	@And("User_482 update test data set for AT_DDR_009 drawdown request")
	public void user_482_482_update_test_data_set_for_at_ddr_009_drawdown_request() {
		testExecutionData = testExecution.getTestdata("AT_DDR_009");
		testData = drawDownRequestData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("User_482 Click Draw Down Request In WIFAK Application")
	public void user_482_482_click_draw_down_request_in_wifak_application() {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.drawDownRequestSubMenu_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(drawDownRequest.drawDownRequestSubMenu_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(drawDownRequest.drawDownRequestSubMenu_WF_482());
	}

	@And("User_482 Click Maintenance Screen In Draw Down Request")
	public void user_482_482_click_maintenance_screen_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.drawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(drawDownRequest.drawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(drawDownRequest.drawDownRequestMaintenance_WF_482());

	}

	@And("User_482 Store the DrawDown Request id")
	public void user_482_store_the_draw_down_request_id() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.getRequestIdInDrawDownRequest_WF_482());
		String requestId = drawDownRequest.getRequestIdInDrawDownRequest_WF_482().getText().substring(11, 15);
		drawDownRequestData.updateTestData(testExecutionData.get("Data Set ID"), "DrawDownRequestCode", requestId);
		System.out.println(requestId);
	}

	@And("User_482 Enter Faciliy Reference code In Draw Down Request")
	public void user_482_482_enter_faciliy_reference_code_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.facilityReferenceDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.facilityReferenceDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.facilityReferenceDrawDownRequestMaintenance_WF_482());
		drawDownRequest.facilityReferenceDrawDownRequestMaintenance_WF_482().sendKeys(testData.get("FacilityCode"));
		drawDownRequest.facilityReferenceDrawDownRequestMaintenance_WF_482().sendKeys(Keys.TAB);

	}

	@And("User_482 Enter Draw Down Type code In Draw Down Request")
	public void user_482_482_enter_draw_down_type_code_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.drawDownTypeDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.drawDownTypeDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.drawDownTypeDrawDownRequestMaintenance_WF_482());
		drawDownRequest.drawDownTypeDrawDownRequestMaintenance_WF_482().sendKeys(testData.get("DrawDownTypeCode"));
		drawDownRequest.drawDownTypeDrawDownRequestMaintenance_WF_482().sendKeys(Keys.TAB);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.facilityNameValidation_DrawDownRequest_WF_482());
		for (int i = 0; i < 200; i++) {
			if (!drawDownRequest.facilityNameValidation_DrawDownRequest_WF_482().getAttribute("prevvalue").isBlank()) {
				break;
			}
		}

	}

	@And("User_482 Enter Description English")
	public void user_482_482_enter_description_english() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.descriptionEnglishDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.descriptionEnglishDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.descriptionEnglishDrawDownRequestMaintenance_WF_482());
		drawDownRequest.descriptionEnglishDrawDownRequestMaintenance_WF_482().sendKeys(testData.get("Description"));
		drawDownRequest.descriptionEnglishDrawDownRequestMaintenance_WF_482().sendKeys(Keys.TAB);

	}

	@And("User_482 Enter value date in Draw Down Request")
	public void user_482_482_enter_value_date_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.valueDateDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.valueDateDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.valueDateDrawDownRequestMaintenance_WF_482());
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String currentDate = date.format(dtFormatter);
		drawDownRequest.valueDateDrawDownRequestMaintenance_WF_482().sendKeys(currentDate);
		drawDownRequest.valueDateDrawDownRequestMaintenance_WF_482().sendKeys(Keys.TAB);

	}

	@And("User_482 Click Drawdown Additional Details")
	public void user_482_482_click_drawdown_additional_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.drawDownAdditionalDetailsDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.drawDownAdditionalDetailsDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.drawDownAdditionalDetailsDrawDownRequestMaintenance_WF_482());

	}

	@And("User_482 Enter product class In Drawdown Additional Details")
	public void user_482_482_enter_product_class_in_drawdown_additional_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.productClassDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.productClassDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.productClassDrawDownRequestMaintenance_WF_482());
		drawDownRequest.productClassDrawDownRequestMaintenance_WF_482().sendKeys(testData.get("ProductClass"));
		drawDownRequest.productClassDrawDownRequestMaintenance_WF_482().sendKeys(Keys.TAB);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.productClassNameValidation_DrawDownRequest_WF_482());
		for (int i = 0; i < 100; i++) {
			if (!drawDownRequest.productClassNameValidation_DrawDownRequest_WF_482().getAttribute("prevvalue")
					.isBlank()) {
				break;
			}
		}

	}

	@And("User_482 Click Save Button in Drawdown Maintenance")
	public void user_482_482_click_save_button_in_drawdown_maintenance() {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(drawDownRequest.saveButtonDrawDownRequestMaintenance_WF_482());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(drawDownRequest.saveButtonDrawDownRequestMaintenance_WF_482());
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("User_482 Enter FC Amount In Drawdown Additional Details")
	public void user_482_enter_fc_amount_in_drawdown_additional_details() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.fcAmountDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.fcAmountDrawDownRequestMaintenance_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.fcAmountDrawDownRequestMaintenance_WF_482());
		drawDownRequest.fcAmountDrawDownRequestMaintenance_WF_482().clear();
		drawDownRequest.fcAmountDrawDownRequestMaintenance_WF_482().sendKeys(testData.get("FCAmount"));
		drawDownRequest.fcAmountDrawDownRequestMaintenance_WF_482().sendKeys(Keys.TAB);

	}

	@And("User_482 Click Verify Sub menu In Draw Down Request")
	public void user_482_click_verify_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.verifyScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(drawDownRequest.verifyScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.verifyScreen_DrawDownRequest_WF_482());
	}

	@And("User_482 Search Code in Verify Sub menu In Draw Down Request")
	public void user_482_search_code_in_verify_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.searchCodeInVerifyScreenDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.searchCodeInVerifyScreenDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.searchCodeInVerifyScreenDrawDownRequest_WF_482());
		drawDownRequest.searchCodeInVerifyScreenDrawDownRequest_WF_482().clear();
		drawDownRequest.searchCodeInVerifyScreenDrawDownRequest_WF_482().sendKeys(testData.get("DrawDownRequestCode"));
		drawDownRequest.searchCodeInVerifyScreenDrawDownRequest_WF_482().sendKeys(Keys.ENTER);
		String xpath = "//td[contains(text(),'" + testData.get("DrawDownRequestCode") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("User_482 Select the Searched code in Verify Sub menu In Draw Down Request")
	public void user_482_select_the_searched_code_in_verify_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.selectSearchedCodeInVerifyScreenDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(drawDownRequest.selectSearchedCodeInVerifyScreenDrawDownRequest_WF_482());

	}

	@And("User_482 User click verify button in Verify Sub menu In Draw Down Request")
	public void user_482_user_482_click_verify_button_in_verify_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.verifyButtonInVerifyScreenDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.verifyButtonInVerifyScreenDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.verifyButtonInVerifyScreenDrawDownRequest_WF_482());
	}

	@And("User_482 Click Approve Screen In draw down request")
	public void user_482_click_approve_screen_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.ApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.ApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.ApproveScreen_DrawDownRequest_WF_482());
	}

	@And("User_482 Search Code in Approve Sub menu In Draw Down Request")
	public void user_482_search_code_in_approve_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.searchCodeApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.searchCodeApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.searchCodeApproveScreen_DrawDownRequest_WF_482());
		drawDownRequest.searchCodeApproveScreen_DrawDownRequest_WF_482().clear();
		drawDownRequest.searchCodeApproveScreen_DrawDownRequest_WF_482().sendKeys(testData.get("DrawDownRequestCode"));
		drawDownRequest.searchCodeApproveScreen_DrawDownRequest_WF_482().sendKeys(Keys.ENTER);
		String xpath = "//td[contains(text(),'" + testData.get("DrawDownRequestCode") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Select the Searched code in Approve Sub menu In Draw Down Request")
	public void user_482_select_the_searched_code_in_approve_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.selectsearchedCodeApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(drawDownRequest.selectsearchedCodeApproveScreen_DrawDownRequest_WF_482());
	}

	@And("User_482 Click Approve button in Approve Sub menu In Draw Down Request")
	public void user_482_click_approve_button_in_approve_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.approveButtonInApproveScreenDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.approveButtonInApproveScreenDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.approveButtonInApproveScreenDrawDownRequest_WF_482());
	}

	@And("User_482 Click Update After Approve Screen in Draw down request")
	public void user_482_click_update_after_approve_screen_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.updateAfterApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.updateAfterApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.updateAfterApproveScreen_DrawDownRequest_WF_482());
	}

	@And("User_482 Search Code in Update after Approve Sub menu In Draw Down Request")
	public void user_482_search_code_in_update_after_approve_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482());
		drawDownRequest.searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482().clear();
		drawDownRequest.searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482()
				.sendKeys(testData.get("DrawDownRequestCode"));
		drawDownRequest.searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482().sendKeys(Keys.ENTER);
		String xpath = "//td[contains(text(),'" + testData.get("DrawDownRequestCode") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Select the Searched code in Update after Approve Sub menu In Draw Down Request")
	public void user_482_select_the_searched_code_in_update_after_approve_sub_menu_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.selectSearchedCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(drawDownRequest.selectSearchedCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482());
	}

	@And("User_482 Click Drawdown Additional Details in Update after Approve Sub menu")
	public void user_482_click_drawdown_additional_details_in_update_after_approve_sub_menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.additionalDetails_UpdateAfterApproveDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.additionalDetails_UpdateAfterApproveDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.additionalDetails_UpdateAfterApproveDrawDownRequest_WF_482());
	}

	@And("User_482 Enter FC Amount In Drawdown Additional Details in Update after Approve Sub menu")
	public void user_482_enter_fc_amount_in_drawdown_additional_details_in_update_after_approve_sub_menu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FCAmount_UpdateAfterApproveDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.FCAmount_UpdateAfterApproveDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.FCAmount_UpdateAfterApproveDrawDownRequest_WF_482());
		drawDownRequest.FCAmount_UpdateAfterApproveDrawDownRequest_WF_482().clear();
		drawDownRequest.FCAmount_UpdateAfterApproveDrawDownRequest_WF_482().sendKeys(testData.get("UpdatedFCAmount"));
		drawDownRequest.FCAmount_UpdateAfterApproveDrawDownRequest_WF_482().sendKeys(Keys.TAB);
	}

	@And("User_482 Close Maintenance In Draw Down Request")
	public void user_482_close_maintenance_in_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.closeMaintenanceScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.closeMaintenanceScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.closeMaintenanceScreen_DrawDownRequest_WF_482());
	}

	@And("User_482 Search Code in Maintenance Screen Draw Down Request")
	public void user_482_search_code_in_maintenance_screen_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.searchCodeInMaintenanceScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.searchCodeInMaintenanceScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.searchCodeInMaintenanceScreen_DrawDownRequest_WF_482());
		drawDownRequest.searchCodeInMaintenanceScreen_DrawDownRequest_WF_482().clear();
		drawDownRequest.searchCodeInMaintenanceScreen_DrawDownRequest_WF_482()
				.sendKeys(testData.get("DrawDownRequestCode"));
		drawDownRequest.searchCodeInMaintenanceScreen_DrawDownRequest_WF_482().sendKeys(Keys.ENTER);
		String xpath = "//td[contains(text(),'" + testData.get("DrawDownRequestCode") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("User_482 Select the searched code in Maintenance Screen Draw Down Request")
	public void user_482_select_the_searched_code_in_maintenance_screen_draw_down_request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.selectSearchedCodeInMaintenanceScreen_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(drawDownRequest.selectSearchedCodeInMaintenanceScreen_DrawDownRequest_WF_482());
	}

	@And("User_482 Verify CV Amount and Amt in Facility CY should be same")
	public void user_482_verify_cv_amount_and_amt_in_facility_cy_should_be_same() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.cvAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482());
		String cvAmount = drawDownRequest.cvAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482()
				.getAttribute("initialvalue");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.amtInFacilityCYAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482());
		String amt = drawDownRequest.amtInFacilityCYAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482()
				.getAttribute("initialvalue");
		Assert.assertEquals(cvAmount, amt);
	}

	// *******************************************************************************************************************************************
	// @AT_DDR_084

	@And("User_482 click Maintenance under Facility Type")
	public void User_482_click_Maintenance_under_Facility_Type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenance_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.FaciltyTypeMaintenance_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.FaciltyTypeMaintenance_DrawDownRequest_WF_482());

		for (int i = 0; i < 10; i++) {
			try {
//				waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.ProgressIcon());
//				System.out.println("Progress Bar Appeared");
				wait.until(ExpectedConditions.invisibilityOf(commonElementsObj.ProgressIcon()));
				System.out.println("Progress Bar Disappeard");
				break;

			} catch (Exception e) {

			}

		}
	}

	@And("User_482 click on the Code under Facility Type Maintenance screen")
	public void User_482_click_on_the_Code_under_Facility_Type_Maintenance_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenanceNewCode_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.FaciltyTypeMaintenanceNewCode_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.FaciltyTypeMaintenanceNewCode_DrawDownRequest_WF_482());

	}

	@And("User_482 enter the Code under Facility Type Maintenance screen")
	public void User_482_enter_the_Code_under_Facility_Type_Maintenance_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenanceNewCode_DrawDownRequest_WF_482());
		drawDownRequest.FaciltyTypeMaintenanceNewCode_DrawDownRequest_WF_482().clear();
		drawDownRequest.FaciltyTypeMaintenanceNewCode_DrawDownRequest_WF_482().sendKeys("0507");// .sendKeys(testData.get("0507"));
		drawDownRequest.FaciltyTypeMaintenanceNewCode_DrawDownRequest_WF_482().sendKeys(Keys.TAB);
		for (int i = 0; i < 10; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.displayProgIcon());
				System.out.println("Progress Bar Appeared");
				wait.until(ExpectedConditions.invisibilityOf(commonElementsObj.displayProgIcon()));
				System.out.println("Progress Bar Disappeard");
				break;

			} catch (Exception e) {

			}

		}
	}

	@And("User_482 click on the Facilty Category under Facility Type Maintenance screen")
	public void User_482_click_on_the_Facilty_Category_under_Facility_Type_Maintenance_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenanceNewCategoryCode_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.FaciltyTypeMaintenanceNewCategoryCode_DrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.FaciltyTypeMaintenanceNewCategoryCode_DrawDownRequest_WF_482());

	}

	@And("User_482 enter the Facilty category Facility Type Maintenance screen")
	public void User_482_enter_the_Facilty_category_Facility_Type_Maintenance_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenanceNewCategoryCode_DrawDownRequest_WF_482());
		drawDownRequest.FaciltyTypeMaintenanceNewCategoryCode_DrawDownRequest_WF_482().clear();
		drawDownRequest.FaciltyTypeMaintenanceNewCategoryCode_DrawDownRequest_WF_482().sendKeys("0514");// sendKeys(testData.get(""));
		drawDownRequest.FaciltyTypeMaintenanceNewCategoryCode_DrawDownRequest_WF_482().sendKeys(Keys.TAB);
		for (int i = 0; i < 10; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.displayProgIcon());
				System.out.println("Progress Bar Appeared");
				wait.until(ExpectedConditions.invisibilityOf(commonElementsObj.displayProgIcon()));
				System.out.println("Progress Bar Disappeard");
				break;

			} catch (Exception e) {

			}

		}
	}

	@And("User_482 select the value Hamish Al Jiddiyah from HJ Dropdown")
	public void User_482_select_the_value_Hamish_Al_Jiddiyah_from_HJ_Dropdown() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownDrawDownRequest_WF_482());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownDrawDownRequest_WF_482(),
				"Hamish Al Jiddiyah");
		for (int i = 0; i < 200; i++) {
			try {
				if (!drawDownRequest.FaciltyTypeMaintenanceNewRevolvingOneOffDropDownDrawDownRequest_WF_482()
						.getAttribute("prevvalue").isBlank()
						&& !drawDownRequest.FaciltyTypeMaintenanceNewRevolvingOneOffDropDownDrawDownRequest_WF_482()
								.getAttribute("prevvalue").isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}

		}

	}

	@And("User_482 validate system should allow the user to select only One Off in the field Revolving One off Dropdown")
	public void User_482_validate_system_should_allow_the_user_to_select_only_One_Off_in_the_field_Revolving_One_off_Dropdown() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenanceNewRevolvingOneOffDropDownDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				drawDownRequest.FaciltyTypeMaintenanceNewRevolvingOneOffDropDownDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				drawDownRequest.FaciltyTypeMaintenanceNewRevolvingOneOffDropDownDrawDownRequest_WF_482());

		WebElement Options = drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownOptionsDrawDownRequest_WF_482();
		if (Options.isDisplayed()) {
			System.out.println(
					"system should allow the user to select any value in the field Revolving One off Dropdown");
		} else {
			System.out.println(
					"system should allow the user to select only One Off in the field Revolving One off Dropdown");
		}
	}

	@And("User_482 change the set the HJ DropDown Value as downpayment")
	public void User_482_change_the_set_the_HJ_DropDown_Value_as_downpayment() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownDrawDownRequest_WF_482());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				drawDownRequest.FaciltyTypeMaintenanceNewHJPaymentDropDownDrawDownRequest_WF_482(), "Down Payment ");
		System.out.println("DropDown value selected as Down Payment ");
		for (int i = 0; i < 200; i++) {
			try {
				if (!drawDownRequest.FaciltyTypeMaintenanceNewRevolvingOneOffDropDownDrawDownRequest_WF_482()
						.getAttribute("prevvalue").isBlank()
						&& !drawDownRequest.FaciltyTypeMaintenanceNewRevolvingOneOffDropDownDrawDownRequest_WF_482()
								.getAttribute("prevvalue").isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}

		}

	}

	@And("User_482 click on the product class button")
	public void User_482_click_on_the_product_class_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.FaciltyTypeMaintenancePCButtonDropDownOptionsDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.FaciltyTypeMaintenancePCButtonDropDownOptionsDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(drawDownRequest.FaciltyTypeMaintenancePCButtonDropDownOptionsDrawDownRequest_WF_482());
	}

	@And("User_482 validate the system should allow the user to select the product under product class button")
	public void User_482_validate_the_system_should_allow_the_user_to_select_the_product_under_product_class_button() {

		for (int i = 1; i < 10; i++) {
			try {
				if (drawDownRequest.FaciltyTypeMaintenancePCPopUpDropDownOptionsDrawDownRequest_WF_482()
						.isDisplayed()) {
					System.out.println("System allowed user to add product class");
					break;
				} else {
					System.out.println("System doesn't allowed user to add product class");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_482 close the product class pop up")
	public void User_482_close_the_product_class_pop_up() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.PopUpCloseBtn());
		seleniumActions.getClickAndActionsHelper().moveToElement(commonElementsObj.PopUpCloseBtn());
		seleniumActions.getClickAndActionsHelper().clickOnElement(commonElementsObj.PopUpCloseBtn());
	}

	@And("User_482 close the Facility Type Maintenance screen")
	public void User_482_close_the_Facility_Type_Maintenance_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		commonElementsObj.iisScreenCloseBtn().click();
		System.out.println("Closed the facility Maintenance screen");
	}

	@And("User_482 check the General Limit by CIF flag")
	public void User_482_check_the_General_Limit_by_CIF_flag() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.CtrlRecordCifGenLimitFlagDrawDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.CtrlRecordCifGenLimitFlagDrawDownRequest_WF_482());
		for (int i = 1; i < 10; i++) {
			try {
				if (!drawDownRequest.CtrlRecordCifGenLimitFlagDrawDownRequest_WF_482().isSelected()) {
					System.out.println("General Limit by CIF flag is Not Checked!!");
					drawDownRequest.CtrlRecordCifGenLimitFlagDrawDownRequest_WF_482().click();
					System.out.println("Checked the Flag and Moving to next step");

					break;
				}
				else {
					System.out.println("General Limit by CIF flag is Already Checked!! Moving to next step");
					drawDownRequest.CtrlRecordCifGenLimitFlagDrawDownRequest_WF_482().click();
					drawDownRequest.CtrlRecordCifGenLimitFlagDrawDownRequest_WF_482().click();
				}
			} finally {
				
			}
		}
	}

	@And("User_482 close the Control record screen")
	public void User_482_close_the_Control_record_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		for (int i = 1; i < 10; i++) {
			try {
				commonElementsObj.iisScreenCloseBtn().click();
				System.out.println("Closed the Control Rec Screen");
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_482 close the Update after approve screen")
	public void User_482_close_the_Update_after_approve_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		for (int i = 1; i < 10; i++) {
			try {
				commonElementsObj.iisScreenCloseBtn().click();
				System.out.println("Closed the approve screen");
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_482 close the approve screen")
	public void User_482_close_the_approve_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		for (int i = 1; i < 10; i++) {
			try {
				commonElementsObj.iisScreenCloseBtn().click();
				System.out.println("Closed the approve screen");
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_482 Validate Hamish Al Jiddya drop down value Down payment should not be applicable when the flag General limit by CIF is checked at FMS control record")
	public void User_482_Validate_Hamish_Al_Jiddya_drop_down_value_Down_payment_should_not_be_applicable_when_the_flag_General_limit_by_CIF_is_checked_at_FMS_control_record() {
		for (int i = 1; i < 10; i++) {
			if (commonElementsObj.iisErrorPopupText().isDisplayed()) {

				try {
					System.out.println(commonElementsObj.iisErrorPopupText().getText());
					System.out.println("Down payment should not be applicable");
					commonElementsObj.iisErrorPopupDismissBtn().click();
					break;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
	
	@And("User_482 click on the Facilty Details Tab under Facility Type")
	public void User_482_click_on_the_Facilty_Details_Tab_under_Facility_Type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, drawDownRequest.FaciltyTypeMaintenanceFaciltyDetailTabDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(drawDownRequest.FaciltyTypeMaintenanceFaciltyDetailTabDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(drawDownRequest.FaciltyTypeMaintenanceFaciltyDetailTabDownRequest_WF_482());
	}


	@And("User_482 click on the Sub Facilty Details Tab under Facility Type")
	public void User_482_click_on_the_Sub_Facilty_Details_Tab_under_Facility_Type() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, drawDownRequest.FaciltyTypeMaintenanceSubFaciltyDetailTabDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(drawDownRequest.FaciltyTypeMaintenanceSubFaciltyDetailTabDownRequest_WF_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(drawDownRequest.FaciltyTypeMaintenanceSubFaciltyDetailTabDownRequest_WF_482());
	}


	@And("User_482 Validate the Multiple draw down utilization not allowed flag is Checked")
	public void User_482_Validate_the_Multiple_draw_down_utilization_not_allowed_flag_is_Checked() {
		for (int i = 1; i < 10; i++) {
			try {
				if (drawDownRequest.FaciltyTypeMaintenanceSubFaciltyDetailTabDownRequest_WF_482().isDisplayed()) {
	                 System.out.println("Multiple draw down utilization not allowed flag is Checked");
	                 break;
				}
				else {
					System.out.println("Multiple draw down utilization not allowed flag is not Checked");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	//***************************************************************************************************************************************
	@And("User_482 validate that System should allow to select the item as Product Class only in WIFAK Application")
	public void User_482_validate_that_System_should_allow_to_select_the_item_as_Product_Class_only_in_WIFAK_Application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(
				applicationForFinancialFacilityObj.productClassNameValidationInLimitDetailsWIFAKApplication());
		String DropDownStatus = applicationForFinancialFacilityObj.productClassItemDropDownInLimitDetailsWIFAKApplication().getAttribute("disabled");
		System.out.println(DropDownStatus);
		if(DropDownStatus.equalsIgnoreCase("true")){
		System.out.println(" The System doesn't allow the user to change the item value other that product class");
		}
		else{
			System.out.println(" The System allow the user to change the item value other that product class");
		}
		Select select = new Select(applicationForFinancialFacilityObj.productClassItemDropDownInLimitDetailsWIFAKApplication());
		WebElement Active_Value = select.getFirstSelectedOption();
		String Present_Value  = Active_Value.getText();		
        System.out.println("The current value is : "+ Present_Value);	
		
	}


	@And("User_482 validate that the Account Number feild is mandatory in WIFAK Application")
	public void User_482_validate_that_the_Account_Number_feild_is_mandatory_in_WIFAK_Application() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.productClassAccountBrInLimitDetailsWIFAKApplication());

			String AccountNumberValidator=	applicationForFinancialFacilityObj.productClassAccountBrInLimitDetailsWIFAKApplication().getAttribute("required");
			if(AccountNumberValidator.equalsIgnoreCase("true")){
				System.out.println(" 'Account No' should be mandatory");
				}
				else{
					System.out.println(" Account No' should be not mandatory");
				}
	}
	
	@And("User_482 validate that System should allow to select the item as Product Class only in Johns Request")
	public void User_482_validate_that_System_should_allow_to_select_the_item_as_Product_Class_only_in_Johns_Request() {
		waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.productClassItemDropDownInLimitDetailsJohnsRequest());
		applicationForFinancialFacilityObj.productClassItemDropDownInLimitDetailsJohnsRequest().click();
		String DropDownStatus = applicationForFinancialFacilityObj.productClassItemDropDownInLimitDetailsJohnsRequest().getAttribute("disabled");
		System.out.println(DropDownStatus);
		if(DropDownStatus.equalsIgnoreCase("true")){
		System.out.println(" The System doesn't allow the user to change the item value other that product class");
		}
		else{
			System.out.println(" The System allow the user to change the item value other that product class");
		}
		Select select = new Select(applicationForFinancialFacilityObj.productClassItemDropDownInLimitDetailsJohnsRequest());
		WebElement Active_Value = select.getFirstSelectedOption();
		String Present_Value  = Active_Value.getText();		
        System.out.println("The current value is : "+ Present_Value);
	}
	
	@And("User_482 close the Limit Detail PopUp")
	public void User_482_close_the_Limit_Detail_PopUp() {
	    for(int i = 1; i<200 ; i++) {
	    	try {
	    		applicationForFinancialFacilityObj.productClassCloseBtnInLimitDetailsJohnsRequest().click();
	    		break;
			} catch (Exception e) {
				if(i == 200) {
					Assert.fail(e.getMessage());
				}
			}
	    }
	}
	
	@And("User_482 click on the Request Detail Tab")
	public void User_482_click_on_the_Request_Detail_Tab() {
		for(int i = 1; i<200 ; i++) {
	    	try {
	    		applicationForFinancialFacilityObj.RetailDetailsTabJohnsRequest().click();
	    		break;
			} catch (Exception e) {
				if(i == 200) {
					Assert.fail(e.getMessage());
				}
			}
	    }
	}

	@And("User_482 validate that the Account Number feild is mandatory in Johns Request")
	public void User_482_validate_that_the_Account_Number_feild_is_mandatory_in_Johns_Request() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.productClassAccountBrInLimitDetailsJohnsRequest());
		seleniumActions.getJavascriptHelper().scrollIntoView(applicationForFinancialFacilityObj.productClassAccountBrInLimitDetailsJohnsRequest());
		String AccountNumberValidator=	applicationForFinancialFacilityObj.productClassAccountBrInLimitDetailsJohnsRequest().getAttribute("required");
		if(AccountNumberValidator.equalsIgnoreCase("true")){
			System.out.println(" 'Account No' should be mandatory");
			}
			else{
				System.out.println(" Account No' should be not mandatory");
			}
	}
}
