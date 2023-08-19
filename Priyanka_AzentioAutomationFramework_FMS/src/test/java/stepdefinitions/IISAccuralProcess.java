package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.IIS_ApplicationObj;
import resources.BaseClass;

public class IISAccuralProcess extends BaseClass{
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	
	
	IIS_ApplicationObj IISApplicationObj = new IIS_ApplicationObj(driver);
	
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData  = new ExcelData(path,"IncidentalChargesTestData","DataSet ID");
	ExcelData iisAccrualDealExcelData  = new ExcelData(path,"AccrualDealTestData","DataSet ID");
	ExcelData iisAccrualProcessExcelData  = new ExcelData(path,"AccrualProcess","DataSet ID");
	ExcelData MTSEODExcelData  = new ExcelData(path,"MTSTestData","DataSet ID");
	
	Map<String, String> testData;
	
	
//	AT_AP_015
	@And("^User get the test data for test case AT_AP_015$")
    public void user_get_the_test_data_for_test_case_AT_AP_015() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_015_D1");
    }
	
//	AT_AP_016
	@And("^User get the test data for test case AT_AP_016$")
    public void user_get_the_test_data_for_test_case_AT_AP_016() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_016_D1");
    }
	
//	AT_AP_017
	@And("^User get the test data for test case AT_AP_017$")
    public void user_get_the_test_data_for_test_case_AT_AP_017() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_017_D1");
    }
	
//	// Clear cache step
//		@And("User clear the caches in IIS Application")
//		public void user_clear_the_caches_in_iis_application() throws Throwable {
//			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISCoreTechDetailsIcon());
//			IISApplicationObj.IISCoreTechDetailsIcon().click();
//			
//			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISCoreClearCacheBtn());
//			IISApplicationObj.IISCoreClearCacheBtn().click();
//			
//			for (int i = 0; i < 1000; i++) {
//				try {
//					IISApplicationObj.IIS_SuccessPopupOkBtn().click();
//			    	break;
//				} catch (Exception e) {
//					if (i==999) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
//		}
		
		@And("User click the Calculators module in IIS Application")
		public void user_click_the_calculators_module_in_iis_application() {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IISApplicationObj.IISCalculatorsModule());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			IISApplicationObj.IISCalculatorsModule().click();
		}
		
		@And("User click the Reschedule Calculator With Profit menu under Calculators")
		public void user_click_the_reschedule_calculator_with_profit_menu_under_calculators() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISCalculatorsRescheduleCalculatorWithProfit());
			IISApplicationObj.IISCalculatorsRescheduleCalculatorWithProfit().click();
		}

		@And("User enter the Deal number in Reschedule Calculator With Profit menu")
		public void user_enter_the_deal_number_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISRescheduleCalculatorWithProfitDealNbrInput());
			IISApplicationObj.IISRescheduleCalculatorWithProfitDealNbrInput().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IISApplicationObj.IISRescheduleCalculatorWithProfitDealNbrInput().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}
		@And("User click the Repayment Details panel in Reschedule Calculator With Profit menu")
		public void user_click_the_repayment_details_panel_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISRescheduleCalculatorWithProfitRepaymentDetailsPanel());
			for (int i = 0; i <= 500; i++) {
				try {
					IISApplicationObj.IISRescheduleCalculatorWithProfitRepaymentDetailsPanel().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User enter the First Payment After under Repayment Details panel in Reschedule Calculator With Profit menu")
		public void user_enter_the_first_payment_after_under_repayment_details_panel_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput());
			IISApplicationObj.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput().clear();
			IISApplicationObj.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput().sendKeys(testData.get("First Pay After"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(IISApplicationObj.IISRescheduleCalculatorWithProfitDealNbrInput().getAttribute("prevvalue")
							.equals(testData.get(""))) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}
		@When("User click the Calculate button in Reschedule Calculator With Profit menu")
		public void user_click_the_calculate_button_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISRescheduleCalculatorWithProfitCalculateBtn());	
			for (int i = 0; i <= 300; i++) {
				try {
					IISApplicationObj.IISRescheduleCalculatorWithProfitCalculateBtn().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			// Success Popup OK Btn
			for (int i = 0; i <= 1000; i++) {
				try {
					IISApplicationObj.IIS_SuccessPopupOkBtn().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}

		@When("User click the Update button in Reschedule Calculator With Profit menu")
		public void user_click_the_update_button_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISRescheduleCalculatorWithProfitUpdateBtn());	
			for (int i = 0; i <= 300; i++) {
				try {
					IISApplicationObj.IISRescheduleCalculatorWithProfitUpdateBtn().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
			
			// Success Popup OK Btn
			for (int i = 0; i <= 1000; i++) {
				try {
					IISApplicationObj.IIS_SuccessPopupOkBtn().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
//		Reschedule Repayment plan module
		@And("User click the Reschedule Repayment plan module in IIS Application")
		public void user_click_the_reschedule_repayment_plan_module_in_iis_application() {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IISApplicationObj.IISRescheduleRepaymentPlanModule());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			IISApplicationObj.IISRescheduleRepaymentPlanModule().click();	    
		}
		@And("User click the Approve menu under Reschedule Repayment plan")
		public void user_click_the_approve_menu_under_reschedule_repayment_plan() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISRescheduleRepaymentPlanApproveMenu()); 
			IISApplicationObj.IISRescheduleRepaymentPlanApproveMenu().click();
		}
		@And("User search the Deal number in approve menu under Reschedule Repayment plan")
		public void user_search_the_deal_number_in_approve_menu_under_reschedule_repayment_plan() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISRescheduleRepaymentPlanApproveSearchgridDealInput());
			IISApplicationObj.IISRescheduleRepaymentPlanApproveSearchgridDealInput().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
		}
		
		@And("User double click the searchgird row in approve menu under Reschedule Repayment plan")
		public void user_double_click_the_searchgird_row_in_approve_menu_under_reschedule_repayment_plan() {
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISRescheduleRepaymentPlanApproveSearchgridRow());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(IISApplicationObj.IISRescheduleRepaymentPlanApproveSearchgridRow());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IISApplicationObj.IISRescheduleRepaymentPlanApproveMenuDealNbr().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}
		
		@When("User click the Approve button in approve menu under Reschedule Repayment plan")
		public void user_click_the_approve_button_in_approve_menu_under_reschedule_repayment_plan() {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IISApplicationObj.IISRescheduleRepaymentPlanApproveMenuApproveBtn());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			IISApplicationObj.IISRescheduleRepaymentPlanApproveMenuApproveBtn().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_WarningPopupOkBtn());
			IISApplicationObj.IIS_WarningPopupOkBtn().click();
			
			for (int i = 0; i <= 2000; i++) {
				try {
					IISApplicationObj.IIS_InformationPopupOkBtn().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			Report Popup cancel btn
			for (int i = 0; i <= 1000; i++) {
				try {
					IISApplicationObj.IIS_ConfirmPopupCancelBtn().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}
		


		
	
}
