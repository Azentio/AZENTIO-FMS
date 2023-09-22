package stepdefinitions;

import java.util.Map;

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
import io.cucumber.java.en.Given;
import pageobjects.Penalty_Obj;
import resources.BaseClass;


public class Penalty {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Penalty_Obj Penalty_Obj = new Penalty_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData Penalty =  new ExcelData(path, "Penalty", "Data Set ID");
	Map<String, String> testData;
	
	@Given("User update test data for test case no 555521")
	public void user_update_test_data_for_test_case_no_555521() {
		testData = Penalty.getTestdata("DS_AT_IISPRM_016");
	}
	
	@Given("User update test data for test case no 555523")
	public void user_update_test_data_for_test_case_no_555523() {
		testData = Penalty.getTestdata("DS_AT_IISPRM_017");
	}
	
	@Given("User update test data for test case no 555527")
	public void user_update_test_data_for_test_case_no_555527() {
		testData = Penalty.getTestdata("DS_AT_IISPRM_020");
	}
	
	
	@Given("User_607 Click Penalty Under Parameters In IISparam")
	public void user_click_penalty_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.Penalty_Under_Parameters_In_IISparam_607());
		Penalty_Obj.Penalty_Under_Parameters_In_IISparam_607().click();
	}

	@Given("User_607 Click Maintenance Under Penalty Under Parameters")
	public void user_click_maintenance_under_penalty_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickMaintenance_Under_Penalty_Under_Parameters_607());
		Penalty_Obj.ClickMaintenance_Under_Penalty_Under_Parameters_607().click();
	}

	@Given("User_607 Check Profit on Financing Amount available in DropDown Penalty Type Under Maintenance Under Penalty")
	public void user_check_profit_on_financing_amount_available_in_drop_down_penalty_type_under_maintenance_under_penalty() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.SelectPenaltyType_UnderMaintenance_Under_Penalty_607());
		DropDownHelper.SelectUsingVisibleText(Penalty_Obj.SelectPenaltyType_UnderMaintenance_Under_Penalty_607(), testData.get("Penalty Type1"));
	}
	
	@Given("User_607 Check Flat Amount on Due Days available in DropDown Penalty Type Under Maintenance Under Penalty")
	public void user_check_flat_amount_on_due_days_available_in_drop_down_penalty_type_under_maintenance_under_penalty() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.SelectPenaltyType_UnderMaintenance_Under_Penalty_607());
		DropDownHelper.SelectUsingVisibleText(Penalty_Obj.SelectPenaltyType_UnderMaintenance_Under_Penalty_607(), testData.get("Penalty Type2"));
	}
	
	@Given("User_607 Select Profit on Financing Amount available in DropDown Penalty Type Under Maintenance Under Penalty")
	public void user_select_profit_on_financing_amount_available_in_drop_down_penalty_type_under_maintenance_under_penalty() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.SelectPenaltyType_UnderMaintenance_Under_Penalty_607());
		DropDownHelper.SelectUsingVisibleText(Penalty_Obj.SelectPenaltyType_UnderMaintenance_Under_Penalty_607(), testData.get("Penalty Type1"));
	}


	@Given("User_607 Check Apply Deal Rate Flag in Maintenance Under Penalty Under Parameters")
	public void user_check_apply_deal_rate_flag_in_maintenance_under_penalty_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.Apply_Deal_Rate_InMaintenance_Under_Penalty_607());
		if (!Penalty_Obj.Apply_Deal_Rate_InMaintenance_Under_Penalty_607().isDisplayed()) {
			Assert.fail();
		}
	}

	@Given("User_607 Check default value of Apply Deal Rate Flag in Maintenance Under Penalty Under Parameters")
	public void user_check_default_value_of_apply_deal_rate_flag_in_maintenance_under_penalty_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.Apply_Deal_Rate_InMaintenance_Under_Penalty_607());
		
	}
	
	
	@Given("User_607 Check Penalty Calculation Based on in Maintenance Under Penalty Under Parameters")
	public void user_check_penalty_calculation_based_on_in_maintenance_under_penalty_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.PenaltyCalculationBased_on_InMaintenance_Under_Penalty_607());
		if (!Penalty_Obj.PenaltyCalculationBased_on_InMaintenance_Under_Penalty_607().isDisplayed()) {
			Assert.fail();
		}
	}
	
	@Given("User_607 Click Profit Calculation In Mainteance Under Product Class")
	public void user_click_profit_calculation_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.Click_Profit_CalculationIn_Mainteance_UnderProductClass_607());
		Penalty_Obj.Click_Profit_CalculationIn_Mainteance_UnderProductClass_607().click();
	}

	@Given("User_607 Check Accrue Additional Profit Based On Deal Rate Field In Profit Calculation In Mainteance Under Product Class")
	public void user_check_accrue_additional_profit_based_on_deal_rate_field_in_profit_calculation_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickAccrueAdditionalProfitBasedOnDealRate_In_Profit_CalculationIn_Mainteance_UnderProductClass_607());
		if (!Penalty_Obj.ClickAccrueAdditionalProfitBasedOnDealRate_In_Profit_CalculationIn_Mainteance_UnderProductClass_607().isDisplayed()) {
			Assert.fail();
		}
	}
	
	@Given("User_607 Click Set Fiscal implication In Profit Calculation In Mainteance Under Product Class")
	public void user_click_set_fiscal_implication_in_profit_calculation_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickSet_Fiscal_implicationIn_Mainteance_UnderProductClass_607());
		Penalty_Obj.ClickSet_Fiscal_implicationIn_Mainteance_UnderProductClass_607().click();
	}

	
	@Given("User_607 Check Additional Profit Accrual field available or not")
	public void user_check_additional_profit_accrual_field_available_or_not() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.Additional_Profit_AccrualFieldIn_Mainteance_UnderProductClass_607());
		if (!Penalty_Obj.Additional_Profit_AccrualFieldIn_Mainteance_UnderProductClass_607().isDisplayed()) {
			Assert.fail();
		}
	}
	

	@Given("User_607 Click Search button In Mainteance Under Product Class")
	public void user_click_search_button_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.Searchbtn_In_Mainteance_UnderProductClass_607());
		Penalty_Obj.Searchbtn_In_Mainteance_UnderProductClass_607().click();
	}

	@Given("User_607 Search Record In Mainteance Under Product Class")
	public void user_search_record_in_mainteance_under_product_class() throws Throwable {
		Thread.sleep(3000);
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.SearchRecord_In_Mainteance_UnderProductClass_607());
		Penalty_Obj.SearchRecord_In_Mainteance_UnderProductClass_607().sendKeys(testData.get("Search Record"));
		Penalty_Obj.SearchRecord_In_Mainteance_UnderProductClass_607().sendKeys(Keys.ENTER);
	}
	
	@Given("User_607 Select Record In Mainteance Under Product Class")
	public void user_select_record_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.SelectRecord_In_Mainteance_UnderProductClass_607());
	    clicksAndActionsHelper.doubleClick(Penalty_Obj.SelectRecord_In_Mainteance_UnderProductClass_607());
	}
	
	@Given("User_607 Click Additional Information two In Mainteance Under Product Class")
	public void user_click_additional_information_two_in_mainteance_under_product_class() throws Throwable {
		Thread.sleep(4000);
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickAdditional_InformationTwo_In_Mainteance_UnderProductClass_607());
		Penalty_Obj.ClickAdditional_InformationTwo_In_Mainteance_UnderProductClass_607().click();
	}
	
	@Given("User_607 Click Settlement In Additional In formation Tab In Mainteance Under Product Class")
	public void user_click_settlement_in_additional_in_formation_tab_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.clickSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607());  
		Penalty_Obj.clickSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607().click();
	}
	
	@Given("User_607 Click Repayment Apportionment button In Settlement In Additional Information Tab In Mainteance Under Product Class")
	public void user_click_repayment_apportionment_button_in_settlement_in_additional_information_tab_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.click_RepaymentApportionmentBtn_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607());  
		Penalty_Obj.click_RepaymentApportionmentBtn_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607().click();
	}
	
	@Given("User_607 click Add button In Repayment Apportionment In Settlement In Additional Information Tab In Mainteance Under Product Class")
	public void user_click_add_button_in_repayment_apportionment_in_settlement_in_additional_information_tab_in_mainteance_under_product_class() {
		for (int i = 0; i < 3; i++) {
			waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.click_AddBtn_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607());
			Penalty_Obj.click_AddBtn_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607().click();
		}
	}
	
	@Given("User_607 Select First line In Repayment Apportionment In Settlement In Additional Information Tab In Mainteance Under Product Class")
	public void user_select_first_line_in_repayment_apportionment_in_settlement_in_additional_information_tab_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.SelectFirstline_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607());
		Penalty_Obj.SelectFirstline_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607().click();
	}
	
	@Given("User_607 Select Product Class Repayment Apportionment In Repayment Apportionment In Settlement In Additional Information Tab In Mainteance Under Product Class")
	public void user_select_product_class_repayment_apportionment_in_repayment_apportionment_in_settlement_in_additional_information_tab_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.SelectProductClassRepaymentApportionment_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607());
	    DropDownHelper.SelectUsingVisibleText(Penalty_Obj.SelectProductClassRepaymentApportionment_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607(), testData.get("Repayment Apportionment"));
	}
	
	
	
	//555528
	
	@Given("User_607 Click Templates Under parameters")
	public void user_click_templates_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickTemplates_Under_parameters_607());
		Penalty_Obj.ClickTemplates_Under_parameters_607().click();
	}

	@Given("User_607 Click Transaction Template Under Templates Under parameters")
	public void user_click_transaction_template_under_templates_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickTransactionTemplate_UnderTemplates_Under_parameters_607());
		Penalty_Obj.ClickTransactionTemplate_UnderTemplates_Under_parameters_607().click();
	    
	}

	@Given("User_607 Click Mainteance Under Transaction Template")
	public void user_click_mainteance_under_transaction_template() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.Click_Mainteance_UnderTransactionTemplate_607());
		Penalty_Obj.Click_Mainteance_UnderTransactionTemplate_607().click();
	    
	}

	@Given("User_607 Click Add button In Transaction Template Tab In Mainteance Under Transaction Template")
	public void user_click_add_button_in_transaction_template_tab_in_mainteance_under_transaction_template() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickAdd_BtnIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607());
		Penalty_Obj.ClickAdd_BtnIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607().click();
	    
	}

	@Given("User_607 Click Formula button In First Row In Transaction Template Tab In Mainteance Under Transaction Template")
	public void user_click_formula_button_in_first_row_in_transaction_template_tab_in_mainteance_under_transaction_template() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickFirstRowRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607());
		Penalty_Obj.ClickFirstRowRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607().click();
		
		JavascriptHelper.scrollIntoViewAndClick(Penalty_Obj.Click_FormulaBtn_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607());
	    
	}

	@Given("User_607 Click Add button In Apply Formula Popup In First Row In Transaction Template Tab")
	public void user_click_add_button_in_apply_formula_popup_in_first_row_in_transaction_template_tab() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickAddBtn_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607());
		Penalty_Obj.ClickAddBtn_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607().click();
	}

	@Given("User_607 Click List Of Field In First Row In Apply Formula Popup")
	public void user_click_list_of_field_in_first_row_in_apply_formula_popup() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickListOfFieldIn_FirstRow_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607());
		Penalty_Obj.ClickListOfFieldIn_FirstRow_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate_607().click();
	    
	}

	@Given("User_607 Click Drop Down In List Of Field In First Row In Apply Formula Popup")
	public void user_click_drop_down_in_list_of_field_in_first_row_in_apply_formula_popup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickDropDown_InListOfFieldIn_FirstRow_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate());
		Penalty_Obj.ClickDropDown_InListOfFieldIn_FirstRow_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate().click();
	    
	}

	@Given("User_607 Check Additional Accrued Penalty is in the DropDown")
	public void user_check_additional_accrued_penalty_is_in_the_drop_down() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickDropDown_InListOfFieldIn_FirstRow_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate());
		DropDownHelper.SelectUsingVisibleText(Penalty_Obj.ClickDropDown_InListOfFieldIn_FirstRow_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate(), "Additional Accrued Penalty");
		
	}

	@Given("User_607 Check Waved Additional accrued Penalty is in the DropDown")
	public void user_check_waved_additional_accrued_penalty_is_in_the_drop_down() {
		waitHelper.waitForElementwithFluentwait(driver, Penalty_Obj.ClickDropDown_InListOfFieldIn_FirstRow_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate());
		DropDownHelper.SelectUsingVisibleText(Penalty_Obj.ClickDropDown_InListOfFieldIn_FirstRow_InApplyFormulaPopup_InFirstRowIn_TransactionTemplateTab_InMainteance_UnderTransactionTemplate(), "Waived Additional Accrued Penalty");
	}
	
	
	
	
}
