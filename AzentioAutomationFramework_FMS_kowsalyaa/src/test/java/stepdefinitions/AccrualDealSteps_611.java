package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.iis.AccrualdealOBJ_611;
import resources.BaseClass;

public class AccrualDealSteps_611 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	AccrualdealOBJ_611 AccrualDealobj611 = new AccrualdealOBJ_611(driver);
	
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisAccrualDealExcelData  = new ExcelData(path,"AccrualDeal_611","DataSet ID");
	
	Map<String, String> testData;
	
	
//	Accrual Deal Feature
//	@AT_AD_004
	@And("^User_611 get the test data for test case AT_AD_004$")
    public void get_the_test_data_for_test_case_AT_AD_004() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_004");
    }
//	@AT_AD_005
	@And("^User_611 get the test data for test case AT_AD_005$")
    public void get_the_test_data_for_test_case_AT_AD_005() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_005");
    }
//	@AT_AD_006
	@And("^User_611 get the test data for test case AT_AD_006$")
    public void get_the_test_data_for_test_case_AT_AD_006() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_006");
    }
	//@AT_AD_008
	@And("^User_611 get the test data for test case AT_AD_008$")
    public void get_the_test_data_for_test_case_AT_AD_008() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_008");
    }
	//@AT_AD_009
		@And("^User_611 get the test data for test case AT_AD_009$")
	    public void get_the_test_data_for_test_case_AT_AD_009() throws Throwable {
			testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_009");
	    }
		//AT_AP_013
				@And("^User_611 get the test data for test case AT_AP_013$")
			    public void get_the_test_data_for_test_case_AT_AP_013() throws Throwable {
					testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_009");
			    }
	// Clear cache step
		@And("User_611 clear the caches in IIS Application")
		public void user_clear_the_caches_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISCoreTechDetailsIcon_611());
			AccrualDealobj611.IISCoreTechDetailsIcon_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISCoreClearCacheBtn_611());
			AccrualDealobj611.IISCoreClearCacheBtn_611().click();
			
			for (int i = 0; i < 2000; i++) {
				try {
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
//		@AT_AD_003 - Accrual Deal Feature
//		Investment Deals Combined without Trade Deal
		@And("User_611 click the Investment Deals Combined without Trade Deal menu")
		public void user_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMenu_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMenu_611());
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMenu_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 click the Maintenance under Investment Deals Combined without Trade Deal")
		public void user_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMaintenanceMenu_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMaintenanceMenu_611().click();
		}

		@And("User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainPartyInput_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainPartyInput_611().sendKeys(testData.get("Party Value"),Keys.TAB);
//			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainPartyInput_611().sendKeys("727",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainPartyInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
			
			for (int i = 0; i < 1000; i++) {
				try {
					AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
			    	break;
				} catch (Exception e) {
					
				}
			}
		}

		@And("User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainCategoryInput_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainCategoryInput_611().sendKeys(testData.get("Category Code"),Keys.TAB);
//			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainCategoryInput_611().sendKeys("3",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainCategoryInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
			
		}

		@And("User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainProductClassInput_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainProductClassInput_611().sendKeys(testData.get("Product Class"),Keys.TAB);
//			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainProductClassInput_611().sendKeys("100",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainDealCYnput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
		}

		@And("User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainAmountInput_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainAmountInput_611().sendKeys(testData.get("Amount"),Keys.TAB);
//			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainAmountInput_611().sendKeys("10000",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainAmountInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}	    
		}
		
		@And("User_611 enter the yield details Margin value in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_yield_details_margin_value_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}		
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_611().sendKeys(testData.get("Yield Margin"),Keys.TAB);
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
		}


		@And("User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
		public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorTab_611());
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorTab_611().click();
					break;
				} catch (Exception e) {
					
				}
	    	}
		}

		@And("User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
		public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorTabRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorTabRow_611());
					break;
				} catch (Exception e) {
					
				}
	    	}
		}

		@And("User_611 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_611());
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_611().click();
					break;
				} catch (Exception e) {
					
				}
	    	}
		}

		@And("User_611 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}		
		}

		@And("User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
			
		}
		
		@And("User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_click_the_ok_button_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_611().click();
		}
		
		@And("User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal")
		public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainSaveBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainSaveBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_ConfirmPopupOkBtn_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
			
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_InformationPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		
		    
		}

		@And("User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
		public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		    
		}
		
		@And("User_611 enter the No of Payments in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_enter_the_no_of_payments_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_611().clear();
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_611().sendKeys(testData.get("No of Payments"),Keys.TAB);
//			Cannot proceed popup
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_611().getAttribute("prevvalue").equals(testData.get("No of Payments")))) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}
		
		
		@And("User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_uncheck_the_compounding_grace_period_check_box_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			WebElement gracePeriodCheckbox = AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_611();
	     	if(gracePeriodCheckbox.isSelected()) {
	     		gracePeriodCheckbox.click();
	     	}
		}
		@And("User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {    	
	     	// create schedule button
	     	waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_611());
	     	for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
	     	
	     	for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IIS_WarningPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					
				}
			}
	     	
		}

		
		@And("User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable_611());
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}

		@When("User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Incidental Charges")
		public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_incidental_charges() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainValidateBtn_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainValidateBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_ConfirmPopupOkBtn_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_InformationPopupTitle_611());
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_InformationPopupTextMsg_611());
			String text = AccrualDealobj611.IIS_InformationPopupTextMsg_611().getText();
			System.err.println("Text Message: "+text);
			String dealNbr = AccrualDealobj611.IIS_InformationPopupTextMsg_611().getText().substring(18, 22);
	    	System.err.println("Deal Number: "+dealNbr);    	
	    	iisAccrualDealExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_InformationPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		
		    
		}
		
		
		
		@Then("User_611 click the Approve menu under Investment Deals Combined without Trade Deal")
		public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenu_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenu_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
		public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_611().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
//			AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_611().sendKeys("5317",Keys.ENTER);
		}

		@And("User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
		public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_611());
			for (int i = 0; i <= 500; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_611());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@When("User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
		public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_611());
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}		
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_ConfirmPopupOkBtn_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();		
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISApproveMenuConfirmPopupProceed_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
			  	    	
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_InformationPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
			for (int i = 0; i <= 1000; i++) {
				try {
					AccrualDealobj611.IIS_ConfirmPopupCancelBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}
		
		
//		@AT_AD_003
		@When("User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal")
		public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_accrual_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainValidateBtn_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainValidateBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISApproveMenuConfirmContinuePopup_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISApproveMenuConfirmCollateralPopup_611());	
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_InformationPopupTitle_611());
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_InformationPopupTextMsg_611());
			String text = AccrualDealobj611.IIS_InformationPopupTextMsg_611().getText();
			System.err.println("Text Message: "+text);
			String dealNbr = AccrualDealobj611.IIS_InformationPopupTextMsg_611().getText().substring(18, 22);
	    	System.err.println("Deal Number: "+dealNbr);    	
	    	iisAccrualDealExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_InformationPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		
		    
		}
		
//		Settlement Module
		@And("User_611 click the Settlement module in IIS Application")
		public void user_click_the_settlement_module_in_iis_application() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISSettlementMenu_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}	
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISSettlementMenu_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}			    
		}

		@And("User_611 click the maintenance menu under Settlement module")
		public void user_click_the_maintenance_menu_under_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuMaintenance_611());
			AccrualDealobj611.IISSettlementMenuMaintenance_611().click();
		}

		@And("User_611 enter the Deal number in maintenance menu under Settlement")
		public void user_enter_the_deal_number_in_maintenance_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuMaintenanceDealNbrInput_611());
			AccrualDealobj611.IISSettlementMenuMaintenanceDealNbrInput_611().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISSettlementMenuMaintenanceDealNbrInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@And("User_611 enter the Amount received from party in maintenance menu under Settlement")
		public void user_enter_the_amount_received_from_party_in_maintenance_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuMaintenancePartyAmtInput_611());
			AccrualDealobj611.IISSettlementMenuMaintenancePartyAmtInput_611().sendKeys(testData.get("Party Amt"),Keys.TAB);
//			AccrualDealobj611.IISSettlementMenuMaintenancePartyAmtInput_611().sendKeys("1000",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISSettlementMenuMaintenancePartyAmtInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@When("User_611 click the Automatic Allocation button in maintenance menu under Settlement")
		public void user_click_the_automatic_allocation_button_in_maintenance_menu_under_settlement() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISSettlementMenuMaintenanceAutoAllocationBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}		
			AccrualDealobj611.IISSettlementMenuMaintenanceAutoAllocationBtn_611().click();
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuMaintenanceScheduleDetailsTable_611());
		}

		@When("User_611 click the Save button in maintenance menu under Settlement")
		public void user_click_the_save_button_in_maintenance_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuMaintenanceSaveBtn_611());
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISSettlementMenuMaintenanceSaveBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuMaintenanceSuccessPopupText_611());
//			String text = AccrualDealobj611.IISSettlementMenuMaintenanceSuccessPopupText_611().getText();
//			System.err.println("Text Message: "+text);
			String settlementNbr = AccrualDealobj611.IISSettlementMenuMaintenanceSuccessPopupText_611().getText().substring(25, 29);
	    	System.err.println("Settlement Number: "+settlementNbr);    	
	    	iisAccrualDealExcelData.updateTestData(testData.get("DataSet ID"),"Settlement Nbr", settlementNbr);
			
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}
		
		
		@And("User_611 close the Settlement Maintenance menu")
		public void user_close_the_settlement_maintenance_menu() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISSettlementMaintenanceMenuCloseIcon_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISSettlementMaintenanceMenuCloseIcon_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		
		@And("User_611 click the approve menu under Settlement module")
		public void user_click_the_approve_menu_under_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuApprove_611()); 
			AccrualDealobj611.IISSettlementMenuApprove_611().click();
		}

		@And("User_611 enter the settlement number in searchgrid under approve menu in Settlement")
		public void user_enter_the_settlement_number_in_searchgrid_under_approve_menu_in_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuApproveSearchgridSettlementNbrInput_611());
			AccrualDealobj611.IISSettlementMenuApproveSearchgridSettlementNbrInput_611().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
//			AccrualDealobj611.IISSettlementMenuApproveSearchgridSettlementNbrInput_611().sendKeys("9581",Keys.ENTER);
		}

		@And("User_611 double click the searchgrid row in approve menu under Settlement")
		public void user_double_click_the_searchgrid_row_in_approve_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementMenuApproveSearchgridRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISSettlementMenuApproveSearchgridRow_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISSettlementMenuApproveSettlementNbr_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
			
		}

		@And("User_611 click the Approve button in approve menu under Settlement")
		public void user_click_the_approve_button_in_approve_menu_under_settlement() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISSettlementApproveMenuApproveBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.IISSettlementApproveMenuApproveBtn_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_ConfirmPopupOkBtn_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();		
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISApproveMenuConfirmPopupProceed_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
			
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			// Report popup Cancel
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IIS_ConfirmPopupCancelBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("User_611 close the Settlement Approve menu")
		public void user_close_the_settlement_approve_menu() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISSettlementApproveMenuCloseIcon_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISSettlementApproveMenuCloseIcon_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
//		Settlement --> Reverse
		@And("User_611 click the Reverse menu under Settlement module")
		public void user_click_the_reverse_menu_under_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementReverseMenu_611()); 
			AccrualDealobj611.IISSettlementReverseMenu_611().click();
		}

		@And("User_611 search the settlement number in searchgrid under Reverse menu in Settlement")
		public void user_search_the_settlement_number_in_searchgrid_under_reverse_menu_in_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementReverseSearchgirdSettlementNbrInput_611());
//			AccrualDealobj611.IISSettlementReverseSearchgirdSettlementNbrInput_611().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
			AccrualDealobj611.IISSettlementReverseSearchgirdSettlementNbrInput_611().sendKeys("9583",Keys.ENTER);
		}

		@And("User_611 double click the searchgrid row in Reverse menu under Settlement")
		public void user_double_click_the_searchgrid_row_in_reverse_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementReverseSearchgirdRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISSettlementReverseSearchgirdRow_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISSettlementReverseSettlementNbr_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
			
		}

		@And("User_611 click the Reverse button in Reverse menu under Settlement")
		public void user_click_the_reverse_button_in_reverse_menu_under_settlement() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISSettlementReverseMenuReverseBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.IISSettlementReverseMenuReverseBtn_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_WarningPopupOkBtn_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();		
			
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}	
			
		}
		
		
//		Settlement --> Approve Reverse
		@And("User_611 click the Approve Reverse menu under Settlement module")
		public void user_click_the_approve_reverse_menu_under_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementApproveReverseMenu_611()); 
			AccrualDealobj611.IISSettlementApproveReverseMenu_611().click();
		}

		@And("User_611 search the settlement number in searchgrid under Approve Reverse menu in Settlement")
		public void user_search_the_settlement_number_in_searchgrid_under_approve_reverse_menu_in_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementApproveReverseSearchgirdSettlementNbrInput_611());
//			AccrualDealobj611.IISSettlementApproveReverseSearchgirdSettlementNbrInput_611().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
			AccrualDealobj611.IISSettlementApproveReverseSearchgirdSettlementNbrInput_611().sendKeys("9583",Keys.ENTER);
		}

		@And("User_611 double click the searchgrid row in Approve Reverse menu under Settlement")
		public void user_double_click_the_searchgrid_row_in_approve_reverse_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISSettlementApproveReverseSearchgirdRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISSettlementApproveReverseSearchgirdRow_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISSettlementApproveReverseSettlementNbr_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
			
		}

		@And("User_611 click the Reverse button in Approve Reverse menu under Settlement")
		public void user_click_the_reverse_button_in_approve_reverse_menu_under_settlement() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISSettlementApproveReverseMenuReverseBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.IISSettlementApproveReverseMenuReverseBtn_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_WarningPopupOkBtn_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();		
			
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			// Report popup Cancel
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IIS_ConfirmPopupCancelBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}
		//@128355/AT_AD_008
		@And("User_611 click the periodical processing menu in Menu option under iis application menu")
		public void user_click_the_periodical_processing_menu_in_menu_option_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISperiodicalprocessingmenu_611()); 
			AccrualDealobj611.IISperiodicalprocessingmenu_611().click();
		   		}

		@And("User_611 click the post accruals menu in periodical processing menu under iis application menu")
		public void user_click_the_post_accruals_menu_in_periodical_processing_menu_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISperiodicalprocessingpostaccruals_611()); 
			AccrualDealobj611.IISperiodicalprocessingpostaccruals_611().click();
		  		}

		@And("User_611 click the final accrual menu in post accrual menu under iis application menu")
		public void user_click_the_final_accrual_menu_in_post_accrual_menu_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccruals_611()); 
			AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccruals_611().click();
		}

		@And("User_611 click the specific deal flag checkbox in final accrual under iis application menu")
		public void user_click_the_specific_deal_flag_checkbox_in_final_accrual_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsspecificdealflagcheckbox_611()); 
			AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsspecificdealflagcheckbox_611().click();
		}

		@And("User_611 enter the deal number in final accrual under iis application menu")
		public void user_enter_the_deal_number_in_final_accrual_under_iis_application_menu() throws Throwable{
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsdealnumsearchbox_611());
			AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsdealnumsearchbox_611().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		
		}

		@And("User_611 enter the from date in final accrual under iis application menu")
		public void user_enter_ther_from_date_in_final_accrual_under_iis_application_menu()throws Throwable{
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_611());
			AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_611().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_611().sendKeys(testData.get("FromDate"),Keys.TAB);
		   
		}

		@And("User_611 enter the to date in final accrual under iis application menu")
		public void user_enter_ther_to_date_in_final_accrual_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualstodate_611());
			AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualstodate_611().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualstodate_611().sendKeys(testData.get("Todate"),Keys.TAB);
		}
		@And("User_611 click the ok button in final accrual under iis application menu")
		public void user_click_the_ok_button_in_final_accrual_under_iis_application_menu() throws Throwable{
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsokbtn_611()); 
			AccrualDealobj611.IISperiodicalprocessingpostaccrualsfinalaccrualsokbtn_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_SuccessPopupOkBtn_611());
			for (int i = 0; i < 2000; i++) {
				try {
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		    
		}
		
		//@128356/AT_AD_009
		@And("User_611 click the advanced principal settelement menu under iis application menu")
		public void user_click_the_advanced_principal_settelement_menu_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISadvancedprincipalsettelementmenu_611()); 
			AccrualDealobj611.IISadvancedprincipalsettelementmenu_611().click();
		}

		@And("User_611 click the maintenance in advanced principal settelment menu  under iis applications menu")
		public void user_click_the_maintenance_in_advanced_principal_settelment_menu_under_iis_applications_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISadvancedprincipalsettelementmaintenance_611()); 
			AccrualDealobj611.IISadvancedprincipalsettelementmaintenance_611().click();
		}

		@And("User_611 enter the deal number in settelement details tab under advanced principal settelement menu")
		public void user_enter_the_deal_number_in_settelement_details_tab_under_advanced_principal_settelement_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISadvancedprincipalsettelementsettlementdetailsdealnum_611());
			AccrualDealobj611.IISadvancedprincipalsettelementsettlementdetailsdealnum_611().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISadvancedprincipalsettelementsettlementdetailsdealnum_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		

		@And("User_611 enter the advanced principal setteled amount in settelement details tab  under advanced principal settelement menu")
		public void user_enter_the_advanced_principal_settelement_amount_in_settelement_details_tab_under_advanced_principal_settelement_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISadvancedprincipalsettelementsettlementdetailsadvanceprincipalsetteledamount_611());
			AccrualDealobj611.IISadvancedprincipalsettelementsettlementdetailsadvanceprincipalsetteledamount_611().clear();
			AccrualDealobj611.IISadvancedprincipalsettelementsettlementdetailsadvanceprincipalsetteledamount_611().sendKeys(testData.get("AdvPrincipalSettlementAmount"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(AccrualDealobj611.IISadvancedprincipalsettelementsettlementdetailsadvanceprincipalsetteledamount_611().getAttribute("prevvalue")
							.equals(testData.get("AdvPrincipalSettlementAmount"))) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}

		@And("User_611 click the RescheduleAndAllocate button in settelement details tab  under advanced principal settelement menu")
		public void user_click_the_reschedule_and_allocate_button_in_settelement_details_tab_under_advanced_principal_settelement_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISadvancedprincipalsettelementsettelementdetailsrescheduleandallocatebtn_611());
			for(int i = 300; i <= 300; i++) {
		    	try {
		    		AccrualDealobj611.IISadvancedprincipalsettelementsettelementdetailsrescheduleandallocatebtn_611().click();
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
		    }	    
		    waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_WarningPopupOkBtn_611());
		    AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
			
		}

		@And("User_611 click the save button in schedule details under advanced principal settelement menu")
		public void user_click_the_save_button_in_schedule_details_under_advanced_principal_settelement_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISAdvancePrincipalSettlementMaintenanceScheduleDetailsTable_611());
			for(int i = 300; i <= 300; i++) {
		    	try {
		    		AccrualDealobj611.IISadvancedprincipalsettelementscheduledetailssavebtn_611().click();
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
		    }
			// Success popup Ok btn
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		
		}	
		
		@And("User_611 click the Approve menu in Advance principal settlement module")
		public void user_click_the_approve_menu_in_advance_principal_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenu_611());
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenu_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 search the Deal number in Approve menu under Advance principal settlement module")
		public void user_search_the_deal_number_in_approve_menu_under_advance_principal_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenuSearchgridDealNbrInput_611());
			AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenuSearchgridDealNbrInput_611().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
		}

		@And("User_611 double click the searchgrid row in Approve menu under Advance principal settlement module")
		public void user_double_click_the_searchgrid_row_in_approve_menu_under_advance_principal_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenuSearchgridRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenuSearchgridRow_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenuDealNbr_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}		
		}

		@When("User_611 click the Approve button in Approve menu under Advance principal settlement module")
		public void user_click_the_approve_button_in_approve_menu_under_advance_principal_settlement_module() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenuApproveBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.IISAdvancePrincipalSettlementApproveMenuApproveBtn_611().click();
			
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_ConfirmPopupOkBtn_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();		
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISApproveMenuConfirmPopupProceed_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
			
//			waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj611.IISApproveMenuConfirmPopupProceed_611());
//			IISApplicationObj611.IIS_ConfirmPopupOkBtn_611().click();
			  	  
//			Success popup Ok btn
			for (int i = 0; i <= 2000; i++) {
				try {
					AccrualDealobj611.IIS_InformationPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}

		   
		

		
		}		
	

}

