package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.iisParam.PenaltyObj_482;
import resources.BaseClass;

public class Penalty_482 {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"PenaltyTestData","DataSet ID");
	IISLogin login = new IISLogin(driver);
	Map<String, String> testdata;
	PenaltyObj_482 penaltyObj = new PenaltyObj_482(driver);
	@And("user_482 test data set id for AT_PNLT_017")
	public void user_482_test_data_set_id_for_at_pnlt_017() {
		testdata = excelData.getTestdata("AT_PNLT_017_D1");
	}
	@And("user_482 click parameters menu")
	public void user_482_click_parameters_menu() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver, penaltyObj.IIS_Params_Menu());
		penaltyObj.IIS_Params_Menu().click();
	}

	@And("user_482 click penalty sub menu")
	public void user_482_click_penalty_sub_menu() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver, penaltyObj.iis_penalty_Sub_Menu());
		penaltyObj.iis_penalty_Sub_Menu().click();
	}

	@And("user_482 click maintenance under penalty")
	public void user_482_click_maintenance_under_penalty() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver, penaltyObj.iis_Penalty_Maintenance());
		penaltyObj.iis_Penalty_Maintenance().click();
	}

	@And("user_482 select Penalty type")
	public void user_482_select_penalty_type() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver, penaltyObj.iis_Select_Penalty_Type());
		selenium_Actions.getDropDownHelper().SelectUsingVisibleText(penaltyObj.iis_Select_Penalty_Type(),testdata.get("Penalty Type"));
		
	}
	@And("user_482 Verify Apply yield rate in addition to penalty rate check box is displayed")
	public void user_482_verify_apply_yield_rate_in_addition_to_penalty_rate_check_box_is_displayed() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver, penaltyObj.iis_Penalty_Apply_Yield_Rate_In_Addition_To_Panalty_Rate());
		Assert.assertTrue(penaltyObj.iis_Penalty_Apply_Yield_Rate_In_Addition_To_Panalty_Rate().isDisplayed());
	}

	@And("user_482 Verify Grace Period days for Penalty due text box is displayed")
	public void user_482_verify_grace_period_days_for_penalty_due_text_box_is_displayed() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver, penaltyObj.iis_Grace_Period_Days_For_Penalty_Due());
		Assert.assertTrue(penaltyObj.iis_Grace_Period_Days_For_Penalty_Due().isDisplayed());
	}
	@And("user_482 click Apply yield rate in addition to penalty rate check box")
	public void user_482_click_apply_yield_rate_in_addition_to_penalty_rate_check_box() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,penaltyObj.iis_Penalty_Apply_Yield_Rate_In_Addition_To_Panalty_Rate());
		penaltyObj.iis_Penalty_Apply_Yield_Rate_In_Addition_To_Panalty_Rate().click();
	}
	@And("User_482 Search Deal Number In settlement maintenance Screen")
	public void user_482_search_deal_number_in_settlement_maintenance_screen() {
	   
	}

	@And("User_482 Select Searched Deal Number no In Settlement maintenance Screen")
	public void user_482_select_searched_deal_number_no_in_settlement_maintenance_screen() {
	   
	}

	@And("User_482 click Penalty details tab")
	public void user_482_click_penalty_details_tab() {
	   
	}

	@And("User_482 Validate previous outstanding amount")
	public void user_482_validate_previous_outstanding_amount() {
	   
	}

	@And("User_482 click details screen in Penalty details tab")
	public void user_482_click_details_screen_in_penalty_details_tab() {
	   
	}

	@And("User_482 Validate Total Incremental penalty details")
	public void user_482_validate_total_incremental_penalty_details() {
	    
	}
	

	@And("User_482 Click Allow to settle penalty checkbox")
	public void user_482_click_allow_to_settle_penalty_checkbox() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,penaltyObj.iis_Settlement_AllowToSettlePenalty());
		penaltyObj.iis_Settlement_AllowToSettlePenalty().click();
	}

	@And("User_482 Verify Amount received from party is disabled")
	public void user_482_verify_amount_received_from_party_is_disabled() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,penaltyObj.iis_Settlement_AmountReceivedFromParty());
		String attribute=null;
		for (int i = 0; i <50 ;i++) {
			attribute = penaltyObj.iis_Settlement_AmountReceivedFromParty().getAttribute("readonly");
		}
		Assert.assertTrue(attribute.equalsIgnoreCase("true"));
	}

	@And("User_482 Verify Settlement charge Details Tab disabled")
	public void user_482_verify_settlement_charge_details_tab_disabled() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,penaltyObj.iis_Settlement_SettlementChargesTab());
		String attribute=null;
		for (int i = 0; i <50 ;i++) {
			attribute = penaltyObj.iis_Settlement_SettlementChargesTab().getAttribute("aria-disabled");
		}
		Assert.assertTrue(attribute.equalsIgnoreCase("true"));
	}


}
