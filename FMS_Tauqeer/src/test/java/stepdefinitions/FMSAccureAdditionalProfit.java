package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.fms.ApplicationForFinancialFacility_482_Obj;
import pageobjects.iisParam.FMSAccureAdditionalProfitObj;
import resources.BaseClass;

public class FMSAccureAdditionalProfit extends BaseClass {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	// ApplicationForFinancialFacility_482_Obj applicationForFinancialFacilityObj =
	// new ApplicationForFinancialFacility_482_Obj(driver);
	FMSAccureAdditionalProfitObj fmsAccureAdditionalProfitObj = new FMSAccureAdditionalProfitObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "ApplicationForFinancialFacility", "DataSet ID");
	ExcelData facilityManagementData = new ExcelData(path, "FacilitiesManagement", "DataSet ID");
	ExcelData requestForFinancingData = new ExcelData(path, "RequestForFinancing_482", "DataSet ID");
	ExcelData drawDownRequestData = new ExcelData(path, "DrawDownRequest", "DataSet ID");
	ExcelData testExecution = new ExcelData(path, "TestExecution", "TestCaseID");

	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper jsHelper = new JavascriptHelper(driver);

	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;

	@And("user update the test data for AT_IISPRM_098")
	public void user_update_the_test_data_for_at_iisprm_098() {

	}

	@And("user update the test data for AT_IISPRM_099")
	public void user_update_the_test_data_for_at_iisprm_099() {

	}

	@And("user update the test data for AT_IISPRM_067")
	public void user_update_the_test_data_for_at_iisprm_067() {

	}

	@And("user14 click on parameters tab")
	public void user14_click_on_parameters_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Parameters());
		fmsAccureAdditionalProfitObj.iisParam_Parameters().click();
	}

	@And("user14 click on product class under parameter tab")
	public void user14_click_on_product_class_under_parameter_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_ProductClass());
		fmsAccureAdditionalProfitObj.iisParam_ProductClass().click();

	}

	@And("user14 click on maintenance under product class tab")
	public void user14_click_on_maintenance_under_product_class_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Maintenance());

		for (int i = 0; i <= 300; i++) {
			try {
				fmsAccureAdditionalProfitObj.iisParam_Maintenance().click();
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}

	}

	// Profit Calculation
	@And("user14 click on profit calculation under maintainance tab")
	public void user14_click_on_profit_calculation_under_maintainance_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisparam_ProfitCalculation());

		for (int i = 0; i <= 300; i++) {
			try {
				fmsAccureAdditionalProfitObj.iisparam_ProfitCalculation().click();
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}

	}

	@And("user14 validate the accrue additional profit based on deal rate dropdown defaut value")
	public void user14_validate_the_accrue_additional_profit_based_on_deal_rate_dropdown_defaut_value() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.accrueAdditionalProfitBasedOnDealRateText());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(fmsAccureAdditionalProfitObj.accrueAdditionalProfitBasedOnDealRateText());
		// String drpdwnText=
		// fmsAccureAdditionalProfitObj.accrueAdditionalProfitBasedOnDealRateText()

		// jsHelper.scrollToElemet(fmsAccureAdditionalProfitObj.accureAdditionalProfitDrpdwn());
		String drpdwnText = fmsAccureAdditionalProfitObj.accureAdditionalProfitDrpdwn().getText();
		System.out.println(drpdwnText);
	}

	@And("user14 validate the additional profit penalty rate over deal rate textfield is enabled")
	public void user14_validate_the_additional_profit_penalty_rate_over_deal_rate_textfield_is_enabled() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.additionalProfitPenaltyOverDealRateTextfield());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.additionalProfitPenaltyOverDealRateTextfield().isEnabled());
	}

	@And("user14 validate the additional profit penalty rate over deal rate textfield is editable")
	public void user14_validate_the_additional_profit_penalty_rate_over_deal_rate_textfield_is_editable() {
		fmsAccureAdditionalProfitObj.additionalProfitPenaltyOverDealRateTextfield().sendKeys("123");
	}

	@And("user14 click on control record under parameter tab")
	public void user14_click_on_control_record_under_parameter_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_ControlRecord());
		fmsAccureAdditionalProfitObj.iisParam_Budget().click();
	}

	@And("user14 click on control record maintainence under control record tab")
	public void user14_click_on_control_record_maintainence_under_control_record_tab() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_ControlRecordMaintainence());
		fmsAccureAdditionalProfitObj.iisParam_Maintenance().click();
	}

	@And("user14 click on the jv and printing tab")
	public void user14_click_on_the_jv_and_printing_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_CR_JVAndPrinting());
		fmsAccureAdditionalProfitObj.iisParam_CR_JVAndPrinting().click();
	}

	@And("user click on customize jv description under jv and printing tab")
	public void user_click_on_customize_jv_description_under_jv_and_printing_tab() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_CR_CustomizedJVDescription());
		fmsAccureAdditionalProfitObj.iisParam_CR_CustomizedJVDescription().click();
	}

	@And("user click the first option under jv description format")
	public void user_click_the_first_option_under_jv_description_format() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_CR_JVDescriptionFormat());
		fmsAccureAdditionalProfitObj.iisParam_CR_JVDescriptionFormat().click();
	}

	// product class

	@And("user14 click on search button under product class")
	public void user_click_on_search_button_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_SearchBtn());
		fmsAccureAdditionalProfitObj.iisParam_SearchBtn().click();
	}

	@And("user14 click on the first option under search button")
	public void user_click_on_the_first_option_under_search_button() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_firstOptionUnderSearchBtn());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(fmsAccureAdditionalProfitObj.iisParam_firstOptionUnderSearchBtn());
	}

	@And("user14 scroll to the bottom of the page of profit calculation tab")
	public void user14_scroll_to_the_bottom_of_the_page_of_profit_calculation_tab() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_PC_RemittanceThroughCSM());
		jsHelper.scrollIntoView(fmsAccureAdditionalProfitObj.iisParam_PC_RemittanceThroughCSM());
		// seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsAccureAdditionalProfitObj.iisParam_ProfCal_PrincipalInstallment());
		// seleniumActions.getClickAndActionsHelper().moveToElement(fmsAccureAdditionalProfitObj.iisParam_ProfCal_PrincipalInstallment());
	}

	@And("user14 validate the options present on the bottom of the profit calculation tab")
	public void user14_validate_the_options_present_on_the_bottom_of_the_profit_calculation_tab() {

		// Principal Installment
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_ProfCal_PrincipalInstallment());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.iisParam_ProfCal_PrincipalInstallment().isDisplayed());

		// Link Charges
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_ProfCal_LinkCharges());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.iisParam_ProfCal_LinkCharges().isDisplayed());

		// Additional Fields
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_ProfCal_AdditionalFields());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.iisParam_ProfCal_AdditionalFields().isDisplayed());

		// Eco Sector Validation Period
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_ProfCal_AdditionalFields());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.iisParam_ProfCal_AdditionalFields().isDisplayed());

		// Define Accounts
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_ProfCal_DefineAccounts());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.iisParam_ProfCal_DefineAccounts().isDisplayed());

		// Link Charges To Deal Plan
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_ProfCal_LinkChargesToDealPlan());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.iisParam_ProfCal_LinkChargesToDealPlan().isDisplayed());

		// Set Reports
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_ProfCal_SetReports());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.iisParam_ProfCal_SetReports().isDisplayed());

		// Set Fiscal Implications
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_ProfCal_SetFiscalImplication());
		Assert.assertTrue(fmsAccureAdditionalProfitObj.iisParam_ProfCal_SetReports().isDisplayed());
	}

	// budget
	@And("user14 click on budget under parameter tab")
	public void user14_click_on_budget_under_parameter_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Budget());
		for (int i = 0; i <= 300; i++) {
			try {
				fmsAccureAdditionalProfitObj.iisParam_Budget().click();
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}

	}

	@And("user click the maintainence under budget tab")
	public void user_click_the_maintainence_under_budget_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Budget_Maintainence());
		fmsAccureAdditionalProfitObj.iisParam_Budget_Maintainence().click();
	}
            
	     //new
	@And("user14 give budget year under budget tab")
	public void user14_give_budget_year_under_budget_tab() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Budget_BudgetYear());
		fmsAccureAdditionalProfitObj.iisParam_Budget_BudgetYear().sendKeys("2031");
	}
	
	     //modify
	@And("user14 give budget year under budget tab for modify record")
	public void user14_give_budget_year_under_budget_tab_for_modify_record() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Budget_BudgetYear());
		fmsAccureAdditionalProfitObj.iisParam_Budget_BudgetYear().sendKeys("2033");
	}

	@And("user14 click on the search lookup of division under budget tab")
	public void user14_click_on_the_search_lookup_of_division_under_budget_tab() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_DivisionSearchLookup());
		fmsAccureAdditionalProfitObj.iisParam_Budget_DivisionSearchLookup().click();
	}

	@And("user14 select the first option under division search lookup")
	public void user14_select_the_first_option_under_division_search_lookup() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_firstOptionDivisionSearchLookUP());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(fmsAccureAdditionalProfitObj.iisParam_Budget_firstOptionDivisionSearchLookUP());

	}

	@And("user14 click on the search lookup of branch code under division option")
	public void user14_click_on_the_search_lookup_of_branch_code_under_division_option() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_BranchCodeSearchLookUp());
		fmsAccureAdditionalProfitObj.iisParam_Budget_BranchCodeSearchLookUp().click();
	}

	@And("user14 select the first option under branch code search lookup under division option")
	public void user14_select_the_first_option_under_branch_code_search_lookup_under_division_option() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_FirstOptionBranchCodeSearchLookUp());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(fmsAccureAdditionalProfitObj.iisParam_Budget_FirstOptionBranchCodeSearchLookUp());
	}

	@And("user14 click on the save button")
	public void user14_click_on_the_save_button() {
		jsHelper.scrollIntoView(fmsAccureAdditionalProfitObj.iisParam_Budget_SaveBtn());
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Budget_SaveBtn());
		fmsAccureAdditionalProfitObj.iisParam_Budget_SaveBtn().click();
	}
	
	
           //save
	@And("user14 click on the ok button for confirming save process")
	public void user14_click_on_the_ok_button_for_confirming_save_process() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_SaveConformationOK());
		fmsAccureAdditionalProfitObj.iisParam_Budget_SaveConformationOK().click();
	}
	
	
	       //update
	@And("user14 click on the ok button for confirming update process")
	public void user14_click_on_the_ok_button_for_confirming_update_process() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_SaveConformationOK());
		fmsAccureAdditionalProfitObj.iisParam_Budget_SaveConformationOK().click();
	}
	
	@And("user14 click on delete button")
	public void user14_click_on_delete_button() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_DeleteBtn());
		fmsAccureAdditionalProfitObj.iisParam_Budget_DeleteBtn().click();
	}

	@And("user14 verify the post save confirmation popup")
	public void user14_verify_the_post_save_confirmation_popup() {
		String expPopUp = "Saved_Successfully_key";
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_SavedSuccessfullyPopUp());
		String actualPopUp = fmsAccureAdditionalProfitObj.iisParam_Budget_SavedSuccessfullyPopUp().getText();

		if (expPopUp.equalsIgnoreCase(actualPopUp)) {
			System.out.println(actualPopUp);
		}

		else {
			Assert.fail();
		}
	}
	
	
	@And("user14 verify the post update confirmation message")
	public void user14_verify_the_post_update_confirmation_message() {
		String expPopUp = "Updated Successfully";
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_UpdatedSuccessfullyPopUp());
		String actualPopUp = fmsAccureAdditionalProfitObj.iisParam_Budget_UpdatedSuccessfullyPopUp().getText();

		if (expPopUp.equalsIgnoreCase(actualPopUp)) {
			System.out.println(actualPopUp);
		}

		else {
			Assert.fail();
		}
	}
	
	@And("user14 verify the post delete confirmation popup")
	public void user14_verify_the_post_delete_confirmation_popup() {
		String expPopUp = "Deleted Successfully";
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_DeletedSuccessfullyPopup());
		String actualPopUp = fmsAccureAdditionalProfitObj.iisParam_Budget_DeletedSuccessfullyPopup().getText();

		if (expPopUp.equalsIgnoreCase(actualPopUp)) {
			System.out.println(actualPopUp);
		}

		else {
			Assert.fail();
		}
	}

	// update budget
	@And("user14 click on search button under budget")
	public void user14_click_on_search_button_under_budget() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Budget_SearchBtn());
		fmsAccureAdditionalProfitObj.iisParam_Budget_SearchBtn().click();
	}

	@And("user14 give fiscal year under search button")
	public void user14_give_fiscal_year_under_search_button() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_Search_FiscalYear());
		fmsAccureAdditionalProfitObj.iisParam_Budget_Search_FiscalYear().sendKeys("2031");
		fmsAccureAdditionalProfitObj.iisParam_Budget_Search_FiscalYear().sendKeys(Keys.ENTER);
	}
	
	
	@And("user14 select the first option under search button")
	public void user14_select_the_first_option_under_search_button() {
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_firstOptionUnderSearchBtn());
		seleniumActions.getClickAndActionsHelper().doubleClick(fmsAccureAdditionalProfitObj.iisParam_firstOptionUnderSearchBtn());
	}
	
	
	@And("user14 give the invalid value in budget year")
	public void user14_give_the_invalid_value_in_budget_year() {
		waitHelper.waitForElementwithFluentwait(driver, fmsAccureAdditionalProfitObj.iisParam_Budget_BudgetYear());
		fmsAccureAdditionalProfitObj.iisParam_Budget_BudgetYear().sendKeys("-1");
	}
	
	@And("user14 verify the error message")
	public void user14_verify_the_error_message() {
		String expPopUp = "Deleted Successfully";
		waitHelper.waitForElementwithFluentwait(driver,
				fmsAccureAdditionalProfitObj.iisParam_Budget_invalidTextfieldError());
		String actualPopUp = fmsAccureAdditionalProfitObj.iisParam_Budget_invalidTextfieldError().getText();

		if (expPopUp.equalsIgnoreCase(actualPopUp)) {
			System.out.println(actualPopUp);
		}

		else {
			Assert.fail();
		}
	}
}
