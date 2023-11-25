package stepdefinitions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.fms.DrawDownRequestObj;
import resources.BaseClass;

public class DrawDownRequestSd_482 {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	DrawDownRequestObj drawDownRequest = new DrawDownRequestObj(driver);
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
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,drawDownRequest.getRequestIdInDrawDownRequest_WF_482());
    	String requestId = drawDownRequest.getRequestIdInDrawDownRequest_WF_482().getText().substring(11,15);
    	drawDownRequestData.updateTestData(testExecutionData.get("Data Set ID"), "DrawDownRequestCode",requestId);
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
		for (int i = 0; i <200; i++) {
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
		for (int i = 0; i <100; i++) {
			if (!drawDownRequest.productClassNameValidation_DrawDownRequest_WF_482().getAttribute("prevvalue").isBlank()) {
				break;
			}
		}
		
	}

	@And("User_482 Click Save Button in Drawdown Maintenance")
	public void user_482_482_click_save_button_in_drawdown_maintenance() {
		for (int i = 0; i <200; i++) {
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
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(drawDownRequest.verifyScreen_DrawDownRequest_WF_482());
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
		String xpath ="//td[contains(text(),'"+testData.get("DrawDownRequestCode")+"')]";
  	  for (int i = 0; i <200; i++) {
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
		seleniumActions.getClickAndActionsHelper().doubleClick(drawDownRequest.selectSearchedCodeInVerifyScreenDrawDownRequest_WF_482());
		
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
		String xpath ="//td[contains(text(),'"+testData.get("DrawDownRequestCode")+"')]";
  	  for (int i = 0; i <200; i++) {
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
		seleniumActions.getClickAndActionsHelper().doubleClick(drawDownRequest.selectsearchedCodeApproveScreen_DrawDownRequest_WF_482());
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
		drawDownRequest.searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482().sendKeys(testData.get("DrawDownRequestCode"));
		drawDownRequest.searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482().sendKeys(Keys.ENTER);
		String xpath ="//td[contains(text(),'"+testData.get("DrawDownRequestCode")+"')]";
  	  for (int i = 0; i <200; i++) {
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
		drawDownRequest.searchCodeInMaintenanceScreen_DrawDownRequest_WF_482().sendKeys(testData.get("DrawDownRequestCode"));
		drawDownRequest.searchCodeInMaintenanceScreen_DrawDownRequest_WF_482().sendKeys(Keys.ENTER);
		String xpath ="//td[contains(text(),'"+testData.get("DrawDownRequestCode")+"')]";
  	  for (int i = 0; i <200; i++) {
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
		String cvAmount = drawDownRequest.cvAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482().getAttribute("initialvalue");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				drawDownRequest.amtInFacilityCYAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482());
		String amt = drawDownRequest.amtInFacilityCYAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482().getAttribute("initialvalue");
		Assert.assertEquals(cvAmount, amt);
	}

}
