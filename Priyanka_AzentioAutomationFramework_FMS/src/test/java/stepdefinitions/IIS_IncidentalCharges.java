package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.IIS_ApplicationObj;
import resources.BaseClass;

public class IIS_IncidentalCharges extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	IIS_ApplicationObj IISApplicationObj = new IIS_ApplicationObj(driver);

	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData  = new ExcelData(path,"IncidentalCharges","DataSet ID");
	ExcelData iisAccrualDealExcelData  = new ExcelData(path,"AccrualDeal","DataSet ID");
	
	ExcelData iisAccrualProcessExcelData  = new ExcelData(path,"AccrualProcess","DataSet ID");
	Map<String, String> testData;
	
	//IncidentalCharges
	@And("^user get the test data for test case AT_IC_011$")
    public void user_get_the_test_data_for_test_case_at_ic_011() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("AT_IC_011_D1");
    }
	//IncidentalCharges
	@And("^user get the test data for test case AT_IC_012$")
    public void user_get_the_test_data_for_test_case_at_ic_012() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("AT_IC_012_D1");
    }
	
	// IncidentalCharges
	@And("^user get the test data for test case AT_IC_013$")
	public void user_get_the_test_data_for_test_case_at_ic_013() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("AT_IC_013_D1");
	}
	
	@And("^user get the test data for test case AT_AP_015$")
    public void user_get_the_test_data_for_test_case_at_ap_015() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_015_D1");
    }
	
	@And("^user get the test data for test case AT_AP_027$")
    public void user_get_the_test_data_for_test_case_at_ap_027() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_027_D1");
    }
	
	@And("^user get the test data for test case AT_AP_033$")
    public void user_get_the_test_data_for_test_case_at_ap_033() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_033_D1");
    }
	
	@And("^user get the test data for test case AT_AP_039$")
    public void user_get_the_test_data_for_test_case_at_ap_039() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_039_D1");
    }
	
	
	@And("^user get the test data for test case AT_AP_040$")
    public void user_get_the_test_data_for_test_case_at_ap_040() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_040_D1");
    }
	@And("^user get the test data for test case AT_AP_041$")
    public void user_get_the_test_data_for_test_case_at_ap_041() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_041_D1");
    }
	@And("^user get the test data for test case AT_AP_042$")
    public void user_get_the_test_data_for_test_case_at_ap_042() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_042_D1");
    }
	 
//	Investment Deals Combined without Trade Deal
	@Then("^user click the investment deals combined without trade deal tab$")
	public void user_click_the_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISInvestmentDealWithoutTradeDealMenu());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMenu());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMenu().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user click the maintenance under investment deals combined without trade deal tab$")
	public void user_click_the_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMaintenanceMenu());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMaintenanceMenu().click();
	}
	
	@Then("^user enter the party in maintenance under investment deals combined without trade deal tab$")
	public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		
		for(int i = 0; i <= 500; i++) {
    		try {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainPartyInput());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainPartyInput().sendKeys(testData.get("Party Value"),Keys.TAB);
		break;
			}
		 catch (Exception e) {
			// TODO: handle exception
		}
		}
			
	
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainPartyInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}		
		for (int i = 0; i < 1000; i++) {
			try {
				IISApplicationObj.IIS_ConfirmPopupOkBtn().click();
		    	break;
			} catch (Exception e) {
				
			}
		}
	}

	@Then("^user enter the category in maintenance under investment deals combined without trade deal tab$")
	public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainCategoryInput());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainCategoryInput().sendKeys(testData.get("Category Code"),Keys.TAB);
//		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainCategoryInput().sendKeys("3",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainCategoryInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}
	
	@Then("^user enter the product class in maintenance under investment deals combined without trade deal tab$")
	public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainProductClassInput());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainProductClassInput().sendKeys(testData.get("Product Class"),Keys.TAB);
//		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainProductClassInput().sendKeys("100",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainDealCYnput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}
	

	@Then("^user enter the amount in maintenance under investment deals combined without trade deal tab$")
	public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainAmountInput());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainAmountInput().sendKeys(testData.get("Amount"),Keys.TAB);
//		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainAmountInput().sendKeys("10000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainAmountInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	    
	}
	
	@Then("^user enter the tenure in maintenance under investment deals combined without trade deal tab$")
	public void user_enter_the_tenure_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainTenureInput());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainTenureInput().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainTenureInput().sendKeys(testData.get("Tenure"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainTenureInput().getAttribute("prevvalue")
						.equals(testData.get("Tenure"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_ConfirmPopupOkBtn());
		IISApplicationObj.IIS_ConfirmPopupOkBtn().click();	
	}
	
	@Then("^user select the tenure dropdown as years in maintenance under investment deals combined without trade deal tab$")
	public void user_select_the_tenure_dropdown_as_years_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainTenureDropdown()); 
		dropDownHelper.SelectUsingVisibleText(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainTenureDropdown(),
				testData.get("Tenure DD"));
	}	
	
	@Then("User enter the yield details Margin value in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_yield_details_margin_value_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainYieldMarginInput());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainYieldMarginInput().sendKeys(testData.get("Yield Margin"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainYieldMarginInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}
	

	@Then("^user click the contributor details tab in maintenance under investment deals combined without trade deal tab$")
	public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorTab());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorTab().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}
	
	@Then("^user double click the contributor details row in maintenance under investment deals combined without trade deal tab$")
	public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorTabRow());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorTabRow());
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@Then("^user click the nostro details in contributor tab in maintenance under investment deals combined without trade deal tab$")
	public void user_click_the_nostro_details_in_contributor_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {	waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}
	
	@Then("^user double click the nostro account in contributor tab in maintenance under investment deals combined without trade deal tab$")
	public void user_double_click_the_nostro_account_in_contributor_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
	}
	
	@Then("^user select the maturity account in contributor tab in maintenance under investment deals combined without trade deal tab$")
	public void user_select_the_maturity_account_in_contributor_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable { 	    
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}
	
	
	@Then("^user click the ok button in contributor tab in maintenance under investment deals combined without trade deal tab$")
	public void user_click_the_ok_button_in_contributor_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn().click();
	}
	
	@Then("^user click the save button in maintenance under investment deals combined without trade deal tab$")
	public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainSaveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMainSaveBtn().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_ConfirmPopupOkBtn());
		IISApplicationObj.IIS_ConfirmPopupOkBtn().click();
		
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
	    
	}

	@Then("^user click the repayment plan button in maintenance under investment deals combined without trade deal tab$")
	public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	    
	}
	
	@Then("^user select the profit calculation as diminising returns in repayment tab in maintenance under investment deals combined without trade deal tab$")
	public void user_select_the_profit_calculation_as_diminising_returns_in_repayment_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentProfitCalculationMethodDropdown());
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentProfitCalculationMethodDropdown(),
						testData.get("Profit Calculation"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("^user select the profit recognition as diminising returns in repayment tab in maintenance under investment deals combined without trade deal tab$")
	public void user_select_the_profit_recognition_as_diminising_Returns_in_repayment_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentProfitRecogMethodDropdown());
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentProfitRecogMethodDropdown(),
						testData.get("Profit Recognition"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		    
	}
	
	@Then("^user enter the grace period in repayment tab in maintenance under investment deals combined without trade deal tab$")
	public void user_enter_the_grace_period_in_repayment_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput().sendKeys(testData.get("Grace Period"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainTenureInput().getAttribute("prevvalue")
						.equals(testData.get("Grace Period"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@Then("^user select the grace period dropdown as Years in repayment tab in maintenance under investment deals combined without trade deal tab$")
	public void user_select_the_grace_period_dropdown_as_Years_in_repayment_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodDropdown()); 
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodDropdown(),
						testData.get("Grace Period DD"));
				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	

	@Then("User enter the No of Payments in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_enter_the_no_of_payments_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput().clear();
		IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput().sendKeys(testData.get("No of Payments"),Keys.TAB);
//		Cannot proceed popup
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IIS_SuccessPopupOkBtn().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField().getAttribute("prevvalue").equals(testData.get("No of Payments"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	
	
	@Then("^user uncheck the compounding grace periodcheck box in repayment tab in maintenance under investment deals combined without trade deal tab$")
	public void user_uncheck_the_compounding_grace_periodcheck_box_in_repayment_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement gracePeriodCheckbox = IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox();
     	if(gracePeriodCheckbox.isSelected()) {
     		gracePeriodCheckbox.click();
     	}
	}
	
	@Then("^user click the create schedule button in repayment tab in maintenance under investment deals combined without trade deal tab$")
	public void user_click_the_create_schedule_button_in_repayment_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {    	
     	// create schedule button
     	waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn());
     	for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
     	
     	for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IIS_WarningPopupOkBtn().click();
				break;
			} catch (Exception e) {
				
			}
		}
     	
	}
	
	
	@Then("^user close the repayment tab in repayment tab in maintenance under investment deals combined without trade deal tab$")
	public void user_close_the_repayment_tab_in_repayment_tab_in_maintenance_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	
	@Then("^user click validate button in maintenance under investment deals combined without trade deal tab for accrual process$")
	public void user_click_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_tab_for_accrual_process() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealMainValidateBtn());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealMainValidateBtn().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISApproveMenuConfirmContinuePopup());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IIS_ConfirmPopupOkBtn().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}			
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISApproveMenuConfirmCollateralPopup());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IIS_ConfirmPopupOkBtn().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
				    
	}
	
	@Then("^update the deal number in test data sheet for incidental charges$")
	public void update_the_deal_number_in_test_data_sheet_for_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_InformationPopupTitle());
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_InformationPopupTextMsg());
		String text = IISApplicationObj.IIS_InformationPopupTextMsg().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = IISApplicationObj.IIS_InformationPopupTextMsg().getText().substring(18, 22);
    	System.err.println("Deal Number: "+dealNbr);
    	
    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
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
	}
	@Then("^user click the approve menu under investment deals combined without trade deal$")
	public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenu());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenu().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
	public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput());
		IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
//		IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput().sendKeys("5317",Keys.ENTER);
	}

	@Then("user double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		IISApplicationObj.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_ConfirmPopupOkBtn());
		IISApplicationObj.IIS_ConfirmPopupOkBtn().click();		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISApproveMenuConfirmPopupProceed());
		IISApplicationObj.IIS_ConfirmPopupOkBtn().click();
		  	    	
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
	    
//		Report Popup cancel btn
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
	//..............advance principal settlement......................//
	@Then("^user click the advance principal settlement menu$")
	public void user_click_the_advance_principal_settlement_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IIS_Advance_Principal_Settlement_Menu());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_Advance_Principal_Settlement_Menu());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj.IIS_Advance_Principal_Settlement_Menu().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("^user click the maintenance under advance principal settlement menu$")
	public void user_click_the_maintenance_under_advance_principal_settlement_menu() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_Advance_Principal_Settlement_MaintenanceMenu());
		IISApplicationObj.IIS_Advance_Principal_Settlement_MaintenanceMenu().click();
	}

	@Then("^user enter the deal number in maintenance under advance principal settlement menu$")
	public void user_enter_the_deal_number_in_maintenance_under_advance_principal_settlement_menu() throws Throwable {
		for(int i = 0; i <= 500; i++) {
    		try {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_Advance_Principal_Settlement_Maintenance_DealNbr_Input());
		IISApplicationObj.IIS_Advance_Principal_Settlement_Maintenance_DealNbr_Input().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		break;
			}
		 catch (Exception e) {
			// TODO: handle exception
		}
		}
			
	
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IIS_Advance_Principal_Settlement_Maintenance_DealNbr_Input().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	
	}
	
	
	@Then("^user click the schedule details tab in maintenance under advance principal settlement menu$")
	public void user_click_the_schedule_details_tab_in_maintenance_under_advance_principal_settlement_menu() throws Throwable {
	
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_Advance_Principal_Settlement_Maintenance_ScheduleDetails_Tab());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj.IIS_Advance_Principal_Settlement_Maintenance_ScheduleDetails_Tab().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}
	
	@Then("^user validate the schedule details record$")
	public void user_validate_the_schedule_details_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_Advance_Principal_Settlement_Maintenance_PaymentDate());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj.IIS_Advance_Principal_Settlement_Maintenance_PaymentDate().isDisplayed();
				break;
			} catch (Exception e) {
				
			}
    	}
	
	
	}
	

//-----------------advance principal settlement--------------------------//
	@Then("^user click the tracking and incidental charges module$")
	public void user_click_the_tracking_and_incidental_charges_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISTrackingIncidentalChargesMenu());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesMenu());
		IISApplicationObj.IISTrackingIncidentalChargesMenu().click();
	}
	
	@Then("^user click the maintenance menu under tracking and incidental charges$")
	public void user_click_the_maintenance_menu_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesMaintenanceMenu());
		IISApplicationObj.IISTrackingIncidentalChargesMaintenanceMenu().click();
	}
	@Then("^user enter the deal number in maintenance under tracking and incidental charges$")
	public void user_enter_the_deal_number_in_maintenance_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesMaintenanceDealNbrInput());
		IISApplicationObj.IISTrackingIncidentalChargesMaintenanceDealNbrInput().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISTrackingIncidentalChargesMaintenanceDealNbrInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	@Then("^user enter the charges code in maintenance under tracking and incidental charges$")
	public void user_enter_the_charges_code_in_maintenance_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesMaintenanceChargesCodeInput());
		IISApplicationObj.IISTrackingIncidentalChargesMaintenanceChargesCodeInput().sendKeys(testData.get("Charges Code"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISTrackingIncidentalChargesMaintenanceChargesCodeInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	@Then("^user select the charge allocation criteria in maintenance under tracking and incidental charges$")
	public void user_select_the_charge_allocation_criteria_in_maintenance_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesMaintenanceChargeAllocationDropdown());
		dropDownHelper.SelectUsingVisibleText(IISApplicationObj.IISTrackingIncidentalChargesMaintenanceChargeAllocationDropdown(), testData.get("Charge Allocation DD"));	    
	
	}
	@Then("^user select the dr account in maintenance under tracking and incidental charges$")
	public void user_select_the_dr_account_in_maintenance_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesMaintenanceDrAccountLookup());
		IISApplicationObj.IISTrackingIncidentalChargesMaintenanceDrAccountLookup().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesMaintenanceDrAccountLookupRow());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		clicksAndActionsHelper.doubleClick(IISApplicationObj.IISTrackingIncidentalChargesMaintenanceDrAccountLookupRow());
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
	    }		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISTrackingIncidentalChargesMaintenanceDrAccountInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	@Then("^user click the save button in maintenance under tracking and incidental charges$")
	public void user_click_the_save_button_in_maintenance_under_tracking_and_incidental_charges() throws Throwable {
		
		
		
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj.IISTrackingIncidentalChargesMaintenanceSaveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesMaintenanceSaveBtn());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj.IISTrackingIncidentalChargesMaintenanceSaveBtn().click();
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
	    }
	
//server Warning popup
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_serverwarning_popup_ok_btn());
		IISApplicationObj.IIS_serverwarning_popup_ok_btn().click();
		
		
//		// Warning popup
//		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_WarningPopupOkBtn());
//		IISApplicationObj.IIS_WarningPopupOkBtn().click();
		
		// Success popup
		for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IISApplicationObj.IIS_SuccessPopupOkBtnn().click();
	    		break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("^user click the approve menu under tracking and incidental charges$")
	public void user_click_the_approve_menu_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesApproveMenu());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj.IISTrackingIncidentalChargesApproveMenu().click();
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("^user search deal number in approve menu under tracking and incidental charges$")
	public void user_search_deal_number_in_approve_menu_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesApproveMenuSearchgridDealNbrInput());
		IISApplicationObj.IISTrackingIncidentalChargesApproveMenuSearchgridDealNbrInput().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	
	}
	@Then("^user double click the searchgrid row in approve menu under tracking and incidental charges$")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesApproveMenuSearchgridRow());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		clicksAndActionsHelper.doubleClick(IISApplicationObj.IISTrackingIncidentalChargesApproveMenuSearchgridRow());
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj.IISTrackingIncidentalChargesApproveMenuDealNbr().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	@Then("^user click the approve button in approve menu under tracking and incidental charges$")
	public void user_click_the_approve_button_in_approve_menu_under_tracking_and_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IISTrackingIncidentalChargesApproveMenuApproveBtn());
		IISApplicationObj.IISTrackingIncidentalChargesApproveMenuApproveBtn().click();
		
		// Warning popup
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj.IIS_WarningPopupOkBtn());
		IISApplicationObj.IIS_WarningPopupOkBtn().click();
				
		// Success popup
		for(int i = 0; i <= 2000; i++) {
			try {
			   IISApplicationObj.IIS_SuccessPopupOkBtn().click();
			   break;
			} catch (Exception e) {
				if (i == 2000) {
				Assert.fail(e.getMessage());
				}
			}
		}
	
	}
	
}
