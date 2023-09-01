package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.IISInvestmentDealsObj;
import pageobjects.IIS_AdvancePrincipleSettlementObj;
import resources.BaseClass;

public class IIS_AdvancePrincipleSettlement extends BaseClass{
	WebDriver driver = BaseClass.driver;
	IIS_AdvancePrincipleSettlementObj iIS_AdvancePrincipleSettlementObj = new IIS_AdvancePrincipleSettlementObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData IISAdvancePrincipleSettlementexcelData = new ExcelData(TestDataPath, "IncidentalCharges", "DataSet ID");
	Map<String, String> testData = new HashMap<>();
	
	
	
	
	@And ("^user get the test data for test case AT_APS_012$")
	public void user_get_the_test_data_for_test_case_at_aps_012() {
		testData = IISAdvancePrincipleSettlementexcelData.getTestdata("AT_APS_012_D1");
	}
	
	@And ("^user get the test data for test case AT_APS_013$")
	public void user_get_the_test_data_for_test_case_at_aps_013() {
		testData = IISAdvancePrincipleSettlementexcelData.getTestdata("AT_APS_013_D1");
		
	}
	
	@And ("^user get the test data for test case AT_APS_014$")
	public void user_get_the_test_data_for_test_case_at_aps_014() {
		testData = IISAdvancePrincipleSettlementexcelData.getTestdata("AT_APS_014_D1");
		
	}
	
	
	@And ("^user click on advance principle settlement menu$")
	public void user_click_on_advance_principle_settlement_menu() {
		
		for(int i=0;i<=300;i++) {
		try{
			javascriptHelper.scrollIntoView(iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlementModule());
		    break;
		}
		    catch(Exception e) {
			if(i==300) {
		     Assert.fail(e.getMessage());
			}
		    }
			}
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlementModule());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlementModule().click();
	}
	
	
	@And ("^user click on maintainence under advance principle settlement menu$")
	public void user_click_on_maintainence_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Maintainence());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Maintainence().click();
	}
	
	@And ("^user enter the Deal number in maintainence under advance principle settlement menu$")
	public void user_enter_the_deal_number_in_maintainence_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_DealNbr());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_DealNbr().sendKeys(testData.get("Deal Nbr"),Keys.TAB);

		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_DealNbr().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}		
		
	}
	
	@And ("^user click on the save button in maintainence under advance principle settlement menu$")
	public void user_click_on_the_save_button_in_maintainence_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_SaveBtn());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_SaveBtn().click();
	}
	
	@And ("^user click on approve under advance principle settlement menu$")
	public void user_click_on_approve_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_ApproveModule());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_ApproveModule().click();
	}

	@And ("^user search the settlement number on approve screen under advance principle settlement menu$")
	public void user_search_the_settlement_number_on_approve_screen_under_advance_principle_settlement_menu() {
		
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Approve_SearchSettlementNumber());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Approve_SearchSettlementNumber().sendKeys(testData.get("settlement Nbr"),Keys.TAB);

		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_DealNbr().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	
		
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Approve_ClickSettlementNumber());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Approve_ClickSettlementNumber().click();

		
	}
	
	@And ("^user open the settlement record on approve screen under advance principle settlement menu$")
	public void user_open_the_settlement_record_on_approve_screen_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Approve_ClickSettlementNumber());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Approve_ClickSettlementNumber().click();
	}
	
	@And ("^user click on the approve button on approve screen under advance principle settlement menu$")
	public void user_click_on_the_approve_button_on_approve_screen_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Approve_ApproveSettlemenntNumberBtn());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Approve_ApproveSettlemenntNumberBtn().click();
	}
	
	@And ("^user click on reverse under advance principle settlement menu$")
	public void user_click_on_reverse_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_ApproveModule());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_ApproveModule().click();
	}
	
	
	@And ("^user search the settlement number on reverse screen under advance principle settlement menu")
	public void user_search_the_settlement_number_on_reverse_screen_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Reversal_SearchSettlementNumber());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Reversal_SearchSettlementNumber().sendKeys(null);//update
	}
	
	@And ("^user open the settlement record on reverse screen under advance principle settlement menu$")
	public void user_open_the_settlement_record_on_reverse_screen_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Reversal_ClickSettlementNumber());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Reversal_ClickSettlementNumber().click();
	}
	
	@And ("^user click on the reverse button on reverse screen under advance principle settlement menu$")
	public void user_click_on_the_reverse_button_on_reverse_screen_under_advance_principle_settlement_menu() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Reversal_ReverseSettlementNumberBtn());
		iIS_AdvancePrincipleSettlementObj.IISAdvancePrincipleSettlement_Reversal_ReverseSettlementNumberBtn().click();
	}
	
	
	//3rd test case
	@And ("^user click the Periodical Processing module in IIS Application$")
	public void user_click_the_periodical_processing_module_in_iis_application() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(iIS_AdvancePrincipleSettlementObj.IISPeriodicalProcessingModule());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISPeriodicalProcessingModule());
		iIS_AdvancePrincipleSettlementObj.IISPeriodicalProcessingModule().click();
	}
	
	@And ("^user click the Post Accrual Menu under Periodical Processing$")
	public void user_click_the_post_accrual_menu_under_periodical_processing() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISPostAccrualsMenu());
		for (int i = 0; i <= 500; i++) {
			try {
				iIS_AdvancePrincipleSettlementObj.IISPostAccrualsMenu().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And ("^user click the Final Accruals under Post Accrual in Periodical Processing$")
	public void user_click_the_final_accruals_under_post_accrual_in_periodical_processing() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsSubMenu());
		for (int i = 0; i <= 500; i++) {
			try {
				iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsSubMenu().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And ("^user check the Specific deal flag under Final Accruals in Post Accrual$")
	public void user_check_the_specific_deal_flag_under_final_accruals_in_post_accrual() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsSpecificDealCheckbox());
	    if (!(iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsSpecificDealCheckbox().isSelected())) {
	    	iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsSpecificDealCheckbox().click();
		}
	}
	
	@And ("^user enter the Deal number in Final Accruals under Post Accrual$")
	public void user_enter_the_deal_number_in_final_accruals_under_post_accrual() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsSpecificDealInput());
		iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsSpecificDealInput().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsSpecificDealInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	
	@When ("^user click the OK button in Final Accruals under Post Accrual$")
	public void user_click_the_ok_button_in_final_accruals_under_post_accrual() {
		waitHelper.waitForElementwithFluentwait(driver, iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsOkBtn());
		for (int i = 0; i <= 500; i++) {
			try {
				iIS_AdvancePrincipleSettlementObj.IISFinalAccrualsOkBtn().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 1000; i++) {
			try {
				iIS_AdvancePrincipleSettlementObj.IIS_SuccessPopupOkBtn().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		}
	}
	
