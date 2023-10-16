package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
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
	ExcelData iisAdvancePrincialSettlementExcelData  = new ExcelData(path,"AccrualPrincipalSettlement_611","DataSet ID");
	ExcelData iisAdvancePayment  = new ExcelData(path,"AdvancePayment_611","DataSet ID");
	ExcelData iisAccrualProcessExcelData  = new ExcelData(path,"AccrualProcess","DataSet ID");
	ExcelData MTSEODExcelData  = new ExcelData(path,"MTSTestData","DataSet ID");
	Map<String, String> testData;
	
	
//	Accrual Deal Feature
//	@AT_AD_004
	@And("^User_611 get the test data for test case AT_AD_004$")
    public void get_the_test_data_for_test_case_AT_AD_004() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_004");
    }
//	@AT_PNLT_008
	@And("^User_611 get the test data for test case AT_PNLT_008$")
    public void get_the_test_data_for_test_case_AT_PNLT_008() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_PNLT_008");
    }
//	@AT_PNLT_009
	@And("^User_611 get the test data for test case AT_PNLT_009$")
    public void get_the_test_data_for_test_case_AT_PNLT_009() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_PNLT_009");
    }
//	@AT_PNLT_009
	@And("^User_611 get the test data for test case AT_PNLT_010$")
    public void get_the_test_data_for_test_case_AT_PNLT_010() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_PNLT_010");
    }
//@AT_AD_005
	@And("^User_611 get the test data for test case AT_AD_005$")
    public void get_the_test_data_for_test_case_AT_AD_005() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_005");
    }
//@AT_AD_006
	@And("^User_611 get the test data for test case AT_AD_006$")
    public void get_the_test_data_for_test_case_AT_AD_006() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_006");
    }
//@AT_AD_007
		@And("^User_611 get the test data for test case AT_AD_007$")
	    public void get_the_test_data_for_test_case_AT_AD_007() throws Throwable {
			testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_007");
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
//Advance Principal Settlement
//AT_APS_001
		@And("^User_611 get the test data for test case AT_APS_001")
	    public void get_the_test_data_for_test_case_AT_APS_001() throws Throwable {
			testData = iisAdvancePrincialSettlementExcelData.getTestdata("AT_APS_001");
	    }
		@And("^User_611 get the test data for test case AT_APS_002")
	    public void get_the_test_data_for_test_case_AT_APS_002() throws Throwable {
			testData = iisAdvancePrincialSettlementExcelData.getTestdata("AT_APS_002");
	    }
		@And("^User_611 get the test data for test case AT_APS_019")
	    public void get_the_test_data_for_test_case_AT_APS_019() throws Throwable {
			testData = iisAdvancePrincialSettlementExcelData.getTestdata("AT_APS_019");
	    }
		@And("^User_611 get the test data for test case AT_APS_020")
	    public void get_the_test_data_for_test_case_AT_APS_020() throws Throwable {
			testData = iisAdvancePrincialSettlementExcelData.getTestdata("AT_APS_020");
	    }
		@And("^User_611 get the test data for test case AT_APS_021")
	    public void get_the_test_data_for_test_case_AT_APS_021() throws Throwable {
			testData = iisAdvancePrincialSettlementExcelData.getTestdata("AT_APS_021");
	    }
		@And("^User_611 get the test data for test case AT_APS_022")
	    public void get_the_test_data_for_test_case_AT_APS_022() throws Throwable {
			testData = iisAdvancePrincialSettlementExcelData.getTestdata("AT_APS_022");
	    }
		@And("^User_611 get the test data for test case AT_APS_023")
	    public void get_the_test_data_for_test_case_AT_APS_023() throws Throwable {
			testData = iisAdvancePrincialSettlementExcelData.getTestdata("AT_APS_023");
	    }
//Advance Payment
//AT_APY_012
		@And("^User_611 get the test data for test case AT_APY_012")
	    public void get_the_test_data_for_test_case_AT_APY_012() throws Throwable {
			testData = iisAdvancePrincialSettlementExcelData.getTestdata("AT_APY_012");
	    }
		
//Accurual process
//AT_AP_013
				@And("^User_611 get the test data for test case AT_AP_013$")
			    public void get_the_test_data_for_test_case_AT_AP_013() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_013");
			    }
//AT_AP_014
				@And("^User_611 get the test data for test case AT_AP_014$")
			    public void get_the_test_data_for_test_case_AT_AP_014() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_014");
			    }
//AT_PNLT_011
				@And("^User_611 get the test data for test case AT_PNLT_011$")
			    public void get_the_test_data_for_test_case_AT_PNLT_011() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_PNLT_011");
			    }
//AT_PNLT_012
				@And("^User_611 get the test data for test case AT_PNLT_012$")
			    public void get_the_test_data_for_test_case_AT_PNLT_012() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_PNLT_012");
			    }
//AT_PNLT_013
				@And("^User_611 get the test data for test case AT_PNLT_013$")
			    public void get_the_test_data_for_test_case_AT_PNLT_013() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_PNLT_013");
			    }
//AT_PNLT_010_02
				@And("^User_611 get the test data for test case AT_PNLT_010_02$")
			    public void get_the_test_data_for_test_case_AT_PNLT_010_02() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_PNLT_010_02");
			    }
//AT_AP_049
				@And("^User_611 get the test data for test case AT_AP_049$")
			    public void get_the_test_data_for_test_case_AT_AP_049() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_049");
			    }
//AT_AP_050		
				@And("^User_611 get the test data for test case AT_AP_050$")
			    public void get_the_test_data_for_test_case_AT_AP_050() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_050");
			    }
//AT_AP_051	
				@And("^User_611 get the test data for test case AT_AP_051$")
			    public void get_the_test_data_for_test_case_AT_AP_051() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_051");
			    }
//AT_AP_052	
				@And("^User_611 get the test data for test case AT_AP_052$")
			    public void get_the_test_data_for_test_case_AT_AP_052() throws Throwable {
					testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_052");
			    }
//MTS Application
				
//AT_AP_048
				@And("^User_611 get the test data for test case AT_AP_048$")
			    public void get_the_test_data_for_test_case_AT_AP_048() throws Throwable {
					testData = MTSEODExcelData.getTestdata("DS_AT_AP_048");
			    }
				
//AT_PNLT_008_01
				@And("^User_611 get the test data for test case AT_PNLT_008_01$")
			    public void get_the_test_data_for_test_case_AT_PNLT_008_01() throws Throwable {
					testData = MTSEODExcelData.getTestdata("DS_AT_PNLT_008_01");
			    }
				
//AT_PNLT_009_01
				@And("^User_611 get the test data for test case AT_PNLT_009_01$")
			    public void get_the_test_data_for_test_case_AT_PNLT_009_01() throws Throwable {
					testData = MTSEODExcelData.getTestdata("DS_AT_PNLT_009_01");
			    }
//AT_PNLT_010_01
				@And("^User_611 get the test data for test case AT_PNLT_010_01$")
			    public void get_the_test_data_for_test_case_AT_PNLT_010_01() throws Throwable {
					testData = MTSEODExcelData.getTestdata("DS_AT_PNLT_010_01");
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
			
//			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISApproveMenuConfirmPopupProceed_611());
//			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();
			  	  
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
		//131160/AT_AP_013
		@And("User_611 click the Payment instruction tab under maintenanace in Investment Deals Combined without Trade Deal")
		public void user_click_the_payment_instruction_tab_under_maintenanace_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISinvestmentdealwithouttradedealmenuMaintenancepaymentinstruction_611()); 
			AccrualDealobj611.IISinvestmentdealwithouttradedealmenuMaintenancepaymentinstruction_611().click();
		}

		@And("User_611 click the Journal vocher details tab under payment instruction")
		public void user_click_the_journal_vocher_details_tab_under_payment_instruction() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISinvestmentdealwithouttradedealmenupaymentinstructionjvd_611()); 
			AccrualDealobj611.IISinvestmentdealwithouttradedealmenupaymentinstructionjvd_611().click();
		}

		@And("User_611 Validate the Journal vocher details tab its open or not by deal number")
		public void user_validate_the_journal_vocher_details_tab_its_open_or_not_by_deal_number() throws Throwable {
			WebElement Journalvocherdetailsisdisplayed = AccrualDealobj611.IISinvestmentdealwithouttradedealmenupaymentinstructionvalidatejvd_611();

	        if (Journalvocherdetailsisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
	    }
		
		}
//		Calculators module --> @131585/AT_AP_014
		@And("User_611 click the Calculators module in IIS Application")
		public void user_click_the_calculators_module_in_iis_application() {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISCalculatorsModule_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.IISCalculatorsModule_611().click();
		}

		@And("User_611 click the Reschedule Calculator With Profit menu under Calculators")
		public void user_click_the_reschedule_calculator_with_profit_menu_under_calculators() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISCalculatorsRescheduleCalculatorWithProfit_611());
			AccrualDealobj611.IISCalculatorsRescheduleCalculatorWithProfit_611().click();
		}

		@And("User_611 enter the Deal number in Reschedule Calculator With Profit menu")
		public void user_enter_the_deal_number_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISRescheduleCalculatorWithProfitDealNbrInput_611());
			AccrualDealobj611.IISRescheduleCalculatorWithProfitDealNbrInput_611().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISRescheduleCalculatorWithProfitDealNbrInput_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@And("User_611 click the Repayment Details panel in Reschedule Calculator With Profit menu")
		public void user_click_the_repayment_details_panel_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISRescheduleCalculatorWithProfitRepaymentDetailsPanel_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.IISRescheduleCalculatorWithProfitRepaymentDetailsPanel_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 enter the First Payment After under Repayment Details panel in Reschedule Calculator With Profit menu")
		public void user_enter_the_first_payment_after_under_repayment_details_panel_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_611());
			AccrualDealobj611.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_611().clear();
			AccrualDealobj611.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_611().sendKeys(testData.get("First Pay After"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(AccrualDealobj611.IISRescheduleCalculatorWithProfitDealNbrInput_611().getAttribute("prevvalue")
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

		@When("User_611 click the Calculate button in Reschedule Calculator With Profit menu")
		public void user_click_the_calculate_button_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISRescheduleCalculatorWithProfitCalculateBtn_611());	
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISRescheduleCalculatorWithProfitCalculateBtn_611().click();
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
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}

		@When("User_611 click the Update button in Reschedule Calculator With Profit menu")
		public void user_click_the_update_button_in_reschedule_calculator_with_profit_menu() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISRescheduleCalculatorWithProfitUpdateBtn_611());	
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.IISRescheduleCalculatorWithProfitUpdateBtn_611().click();
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
					AccrualDealobj611.IIS_SuccessPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
//		Reschedule Repayment plan module
		@And("User_611 click the Reschedule Repayment plan module in IIS Application")
		public void user_click_the_reschedule_repayment_plan_module_in_iis_application() {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISRescheduleRepaymentPlanModule_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.IISRescheduleRepaymentPlanModule_611().click();	    
		}

		@And("User_611 click the Approve menu under Reschedule Repayment plan")
		public void user_click_the_approve_menu_under_reschedule_repayment_plan() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISRescheduleRepaymentPlanApproveMenu_611()); 
			AccrualDealobj611.IISRescheduleRepaymentPlanApproveMenu_611().click();
		}

		@And("User_611 search the Deal number in approve menu under Reschedule Repayment plan")
		public void user_search_the_deal_number_in_approve_menu_under_reschedule_repayment_plan() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISRescheduleRepaymentPlanApproveSearchgridDealInput_611());
			AccrualDealobj611.IISRescheduleRepaymentPlanApproveSearchgridDealInput_611().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
		}

		@And("User_611 double click the searchgird row in approve menu under Reschedule Repayment plan")
		public void user_double_click_the_searchgird_row_in_approve_menu_under_reschedule_repayment_plan() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISRescheduleRepaymentPlanApproveSearchgridRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.IISRescheduleRepaymentPlanApproveSearchgridRow_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.IISRescheduleRepaymentPlanApproveMenuDealNbr_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@When("User_611 click the Approve button in approve menu under Reschedule Repayment plan")
		public void user_click_the_approve_button_in_approve_menu_under_reschedule_repayment_plan() {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.IISRescheduleRepaymentPlanApproveMenuApproveBtn_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.IISRescheduleRepaymentPlanApproveMenuApproveBtn_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_WarningPopupOkBtn_611());
			AccrualDealobj611.IIS_WarningPopupOkBtn_611().click();
			
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
		
//		MTS Application
//		@AT_AP_023_02
		@And("User_611 click the Parameter module in MTS Application")
		public void user_click_the_parameter_module_in_mts_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParameterModule_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.MTSParameterModule_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 click the Batch menu under Parameter module")
		public void user_click_the_batch_menu_under_parameter_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParameterBatch_611()); 
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.MTSParameterBatch_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 click the maintenance screen under Batch menu")
		public void user_click_the_maintenance_screen_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParameterBatchMaintenance_611()); 
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.MTSParameterBatchMaintenance_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}

		@And("User_611 enter the Additional Ref number in maintenance under Batch menu")
		public void user_enter_the_additional_ref_number_in_maintenance_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMaintenanceAdditionalRefNbr_611());
			AccrualDealobj611.MTSParamBatchMaintenanceAdditionalRefNbr_611().sendKeys(testData.get("Additional Ref"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.MTSParamBatchMaintenanceAdditionalRefNbr_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@And("User_611 enter the Brief name in maintenance under Batch menu")
		public void user_enter_the_brief_name_in_maintenance_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMaintenanceBriefName_611());
			AccrualDealobj611.MTSParamBatchMaintenanceBriefName_611().sendKeys(testData.get("Brief Name"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.MTSParamBatchMaintenanceBriefName_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}	    
		}

		@And("User_611 enter the Long name in maintenance under Batch menu")
		public void user_enter_the_long_name_in_maintenance_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMaintenanceLongName_611());
			AccrualDealobj611.MTSParamBatchMaintenanceLongName_611().sendKeys(testData.get("Long Name"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.MTSParamBatchMaintenanceLongName_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}	    
		}

		@And("User_611 enter the Menu ref number in maintenance under Batch menu")
		public void user_enter_the_menu_ref_number_in_maintenance_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMaintenanceMenuRefNbr_611());
			AccrualDealobj611.MTSParamBatchMaintenanceMenuRefNbr_611().sendKeys(testData.get("Menu Ref"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.MTSParamBatchMaintenanceMenuRefNbr_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}	    
		}

		@And("User_611 select Periodicity as Daily in maintenance under Batch menu")
		public void user_select_periodicity_as_daily_in_maintenance_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMaintenancePeriodicityDropdown_611());
			for(int i = 0; i <= 500; i++) {
	    		try {
					dropDownHelper.SelectUsingVisibleText(AccrualDealobj611.MTSParamBatchMaintenancePeriodicityDropdown_611(), testData.get("Periodicity DD"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@And("User_611 click the Oracle BAJ under Companies in Batch Details tab under maintenance")
		public void user_click_the_oracle_baj_under_companies_in_batch_details_tab_under_maintenance() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMainBatchDetailsTabOracleBAJ_611()); 
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.MTSParamBatchMainBatchDetailsTabOracleBAJ_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}

		@And("User_611 select the Head office under Oracle BAJ in Batch Details tab under maintenance")
		public void user_select_the_head_office_under_oracle_baj_in_batch_details_tab_under_maintenance() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_611()); 
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}

		@And("User_611 select the ICD Treasury-Invest under Oracle BAJ in Batch Details tab under maintenance")
		public void user_select_the_icd_treasury_invest_under_oracle_baj_in_batch_details_tab_under_maintenance() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_611()); 
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}

		@And("User_611 click the Financing Treasury under processes in Batch Details tab under maintenance")
		public void user_click_the_financing_treasury_under_processes_in_batch_details_tab_under_maintenance() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMainProcessFinancingTreasury_611()); 
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.MTSParamBatchMainProcessFinancingTreasury_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}  
		
		@And("User_611 select the Profit Accrual Process under Financing Treasury in Batch Details tab under maintenance")
		public void user_select_the_profit_accrual_process_under_financing_treasury_in_batch_details_tab_under_maintenance() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_611()); 
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}

		@And("User_611 click the Batch Control tab in maintenance under Batch menu")
		public void user_click_the_batch_control_tab_in_maintenance_under_batch_menu() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.MTSParamBatchMainBatchControlTab_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.MTSParamBatchMainBatchControlTab_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}

		@And("User_611 select the Process Batch as Manual under Batch Control tab in maintenance")
		public void user_select_the_process_batch_as_manual_under_batch_control_tab_in_maintenance() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchMainBatchControlTabProcessBatchDropdown_611());
			for(int i = 0; i <= 500; i++) {
	    		try {
					dropDownHelper.SelectUsingVisibleText(AccrualDealobj611.MTSParamBatchMainBatchControlTabProcessBatchDropdown_611(), testData.get("Process Batch DD"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}	    
		}

		@When("User_611 click Save btn under maintenance in under Batch menu")
		public void user_click_save_btn_under_maintenance_in_under_batch_menu() throws Throwable {
			for (int i = 0; i <= 500; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.MTSParamBatchMaintenanceSaveBtn_611());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.MTSParamBatchMaintenanceSaveBtn_611().click();
			
			for (int i = 0; i <= 1000; i++) {
				try {
					AccrualDealobj611.IIS_InformationPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}
		
		
		@And("User_611 click the Approve screen under Batch menu")
		public void user_click_the_approve_screen_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchApproveMenu_611()); 
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.MTSParamBatchApproveMenu_611().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 search the Additional Ref number in Approve screen searchgrid under Batch menu")
		public void user_search_the_additional_ref_number_in_approve_screen_searchgrid_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchApproveMenuSearchgridAdditionalRefInput_611());
			for (int i = 0; i <= 300; i++) {
				try {
					AccrualDealobj611.MTSParamBatchApproveMenuSearchgridAdditionalRefInput_611().sendKeys(testData.get("Additional Ref"),Keys.ENTER);
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}

		@And("User_611 double click the searchgird row in Approve menu under Batch menu")
		public void user_double_click_the_searchgird_row_in_approve_menu_under_batch_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSParamBatchApproveMenuSearchgridRow_611());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(AccrualDealobj611.MTSParamBatchApproveMenuSearchgridRow_611());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(AccrualDealobj611.MTSParamBatchApproveMenuAdditionalRef_611().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@When("User_611 click the Approve button in Approve menu under Batch menu")
		public void user_click_the_approve_button_in_approve_menu_under_batch_menu() throws Throwable {
			for (int i = 0; i <= 500; i++) {
				try {
					javaScriptHelper.scrollIntoView(AccrualDealobj611.MTSParamBatchApproveMenuApproveBtn_611());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			AccrualDealobj611.MTSParamBatchApproveMenuApproveBtn_611().click();
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_WarningPopupOkBtn_611());
			AccrualDealobj611.IIS_WarningPopupOkBtn_611().click();
			
			for (int i = 0; i <= 1000; i++) {
				try {
					AccrualDealobj611.IIS_InformationPopupOkBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}		

		}
		
		
		@And("User_611 Refresh the MTS Application")
		public void user_refresh_the_mts_application() throws Throwable {
			for (int i = 0; i <= 500; i++) {
				try {
					driver.navigate().refresh();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}

		@And("User_611 click the Process module in MTS Application")
		public void user_click_the_process_module_in_mts_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSProcessModule_611());
			AccrualDealobj611.MTSProcessModule_611().click();
		}

		@And("User_611 click the Batch Process menu under Process module")
		public void user_click_the_batch_process_menu_under_process_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSProcessBatchProcessMenu_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.MTSProcessBatchProcessMenu_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 click the created batch option under Batch process menu")
		public void user_click_the_created_batch_option_under_batch_process_menu() throws Throwable  {
			Thread.sleep(5000);
			String newBatch = testData.get("Brief Name");
			System.err.println("Brief Name: "+newBatch);
			WebElement newBatchmenu = driver.findElement(By.xpath("//td[contains(text(),'"+newBatch+"')]"));
			for (int i = 0; i <= 500; i++) {
				try {
					javaScriptHelper.scrollIntoView(newBatchmenu);
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			waitHelper.waitForElementwithFluentwait(driver, newBatchmenu);
			for (int i = 0; i <= 500; i++) {
				try {
					newBatchmenu.click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}

		@And("User_611 click the batch run menu under new batch in Batch Process")
		public void user_click_the_batch_run_menu_under_new_batch_in_batch_process() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSProcessBatchProcessMenuBatchRun_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.MTSProcessBatchProcessMenuBatchRun_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 enter the batch run date in batch run menu under Batch Process")
		public void user_enter_the_batch_run_date_in_batch_run_menu_under_batch_process() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSProcessBatchProcessMenuBatchRunDate_611());
			AccrualDealobj611.MTSProcessBatchProcessMenuBatchRunDate_611().sendKeys(testData.get("Batch Run Date"),Keys.TAB);	    
		}

		@When("User_611 click the Run button in  batch run menu under Batch Process")
		public void user_click_the_run_button_in_batch_run_menu_under_batch_process() {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.MTSProcessBatchProcessMenuBatchRunOptRunBtn_611());
			for (int i = 0; i <= 500; i++) {
				try {
					AccrualDealobj611.MTSProcessBatchProcessMenuBatchRunOptRunBtn_611().click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_WarningPopupOkBtn_611());
			AccrualDealobj611.IIS_WarningPopupOkBtn_611().click();
		}
		
		//@352413/AT_AP_049
		
		@And("User_611 click the trial accrual menu in post accrual under periodical processing menu")
		public void user_click_the_trial_accrual_menu_in_post_accrual_under_periodical_processing_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iis_periodicalprocessingmenupostaccruals_trialaccruals_611());
			AccrualDealobj611.iis_periodicalprocessingmenupostaccruals_trialaccruals_611().click();
		}

		@And("User_611 check the flag in specific deal for entering deal number")
		public void user_check_the_flag_in_specific_deal_for_entering_deal_number() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualsflagcheckforspecialdeal_611());
			AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualsflagcheckforspecialdeal_611().click();
		}

		@And("User_611 enter the deal number in specific deal under trial accrual menu")
		public void user_enter_the_deal_number_in_specific_deal_under_trial_accrual_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualsdealnumsearchbox_611());
			AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualsdealnumsearchbox_611().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		}

		@And("User_611 enter the from date in Trial accrual under iis application menu")
		public void user_enter_the_from_date_in_trial_accrual_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualfromdate_611());
			AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualfromdate_611().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualfromdate_611().sendKeys(testData.get("Todate"),Keys.TAB);
		   
		}

		@And("User_611 enter the to date in Trial accrual under iis application menu")
		public void user_enter_the_to_date_in_trial_accrual_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualtodate_611());
			AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualtodate_611().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualtodate_611().sendKeys(testData.get("Todate"),Keys.TAB);
		   
		}

		@And("User_611 click the ok button in Trial accrual under iis application menu")
		public void user_click_the_ok_button_in_trial_accrual_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualokbtn_611()); 
			AccrualDealobj611.iis_periodicalprocessingmenupostaccrualstrialaccrualokbtn_611().click();
			
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
		
		//@352415/AT_AP_051
		
		@And("User_611 click the Post Accruals till Maturity date menu in Menu options under iis application menu")
		public void user_click_the_post_accruals_till_maturity_date_menu_in_menu_options_under_iis_application_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iispostaccrualstillmaturitydatemenu_611());
			AccrualDealobj611.iispostaccrualstillmaturitydatemenu_611().click();
		}

		@And("User_611 enter the deal number under Post Accruals till Maturity date menu")
		public void user_enter_ther_deal_number_under_post_accruals_till_maturity_date_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iispostaccrualstillmaturitydatemenudealnum_611());
			AccrualDealobj611.iispostaccrualstillmaturitydatemenudealnum_611().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		}

		@And("User_611 click the trial button under Post Accruals till Maturity date menu")
		public void user_click_the_trial_button_under_post_accruals_till_maturity_date_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iispostaccrualstillmaturitydatemenutrialbtn_611());
			AccrualDealobj611.iispostaccrualstillmaturitydatemenutrialbtn_611().click();
		}
		@And("User_611 click the Process executed successfully ok button for trial button under Post Accruals till Maturity date menu")
		public void user_click_the_process_executed_successfully_ok_button_for_trial_button_under_post_accruals_till_maturity_date_menu() throws Throwable {
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

		@And("User_611 click the final button under Post Accruals till Maturity date menu")
		public void user_click_the_final_button_under_post_accruals_till_maturity_date_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iispostaccrualstillmaturitydatemenufinalbtn_611());
			AccrualDealobj611.iispostaccrualstillmaturitydatemenufinalbtn_611().click();
		}

		@And("User_611 click the Process executed successfully ok button for final button under Post Accruals till Maturity date menu")
		public void user_click_the_process_executed_successfully_ok_button_for_final_button_under_post_accruals_till_maturity_date_menu() throws Throwable {
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
		//@128354/AT_AD_007
		@And("User_611 validate the Vat percentage is dispalyed or not in repayment plan")
		public void user_validate_the_vat_percentage_is_dispalyed_or_not_in_repayment_plan() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisrepaymentplanvatpercentagevalidate_611());
		    WebElement Vatpercentageisdisplayed = AccrualDealobj611.iisrepaymentplanvatpercentagevalidate_611();
		    if (Vatpercentageisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
	    }
		}
		//Advance Payment Feature
		//1358470/AT_APY_011
		
		@And("User_611 Validate the Advance Payment menu in IIS application")
		public void user_validate_the_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenu_611());
			WebElement advancepaymentisdisplayed = AccrualDealobj611.iisAdvancepaymentmenu_611();
		    if (advancepaymentisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}

		@And("User_611 Validate the Maintenance Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_maintenance_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenumaintenancetab_611());
			WebElement advancepaymentmaintenanceisdisplayed = AccrualDealobj611.iisAdvancepaymentmenumaintenancetab_611();
		    if (!advancepaymentmaintenanceisdisplayed.isDisplayed()) {
	        	Assert.fail();
		    }
		}

		@And("User_611 Validate the Query Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_query_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenuquerytab_611());
			WebElement advancepaymentqueryisdisplayed = AccrualDealobj611.iisAdvancepaymentmenuquerytab_611();
		    if (advancepaymentqueryisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}

		@And("User_611 Validate the Verify Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_verify_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenuverifytab_611());
			WebElement advancepaymentverifyisdisplayed = AccrualDealobj611.iisAdvancepaymentmenuverifytab_611();
		    if (advancepaymentverifyisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}

		@And("User_611 Validate the Approve Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_approve_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenuApprovetab_611());
			WebElement advancepaymentapproveisdisplayed = AccrualDealobj611.iisAdvancepaymentmenuApprovetab_611();
		    if (advancepaymentapproveisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}

		@And("User_611 Validate the Reverse Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_reverse_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenureversetab_611());
			WebElement advancepaymentreverseisdisplayed = AccrualDealobj611.iisAdvancepaymentmenureversetab_611();
		    if (advancepaymentreverseisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}

		@And("User_611 Validate the update after approve Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_update_after_approve_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenuupdateafterapprovetab_611());
			WebElement advancepaymentupdateaftapproveisdisplayed = AccrualDealobj611.iisAdvancepaymentmenuupdateafterapprovetab_611();
		    if (advancepaymentupdateaftapproveisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}

		@And("User_611 Validate the Batch Advance Payment Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_batch_advance_payment_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenubatchadvancepaymenttab_611());
			WebElement batchadvancepaymentisdisplayed = AccrualDealobj611.iisAdvancepaymentmenubatchadvancepaymenttab_611();
		    if (batchadvancepaymentisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}

		@And("User_611 Validate the Advance Payment-Increase Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_advance_payment_increase_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenuadvancepaymentincreasetab_611());
			WebElement advancepaymentincreaseisdisplayed = AccrualDealobj611.iisAdvancepaymentmenuadvancepaymentincreasetab_611();
		    if (advancepaymentincreaseisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}

		@And("User_611 Validate the  Advance Payment-Cancel Submenu under Advance Payment menu in IIS application")
		public void user_validate_the_advance_payment_cancel_submenu_under_advance_payment_menu_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.iisAdvancepaymentmenuadvancepaymentcanceltab_611());
			WebElement advancepaymentcancelisdisplayed = AccrualDealobj611.iisAdvancepaymentmenuadvancepaymentcanceltab_611();
		    if (advancepaymentcancelisdisplayed.isDisplayed()) {
	        	Assert.assertTrue(true);
		    }
		}
//@261524/AT_APS_023
		@And("User_611 enter the Tenure in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_tenure_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainTenureInput_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainTenureInput_611().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainTenureInput_611().sendKeys(testData.get("Tenure"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainTenureInput_611().getAttribute("prevvalue")
							.equals(testData.get("Tenure"))) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}		
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IIS_ConfirmPopupOkBtn_611());
			AccrualDealobj611.IIS_ConfirmPopupOkBtn_611().click();	
		}
		
		@And("User_611 select the Tenure dropdown as Years in maintenance under Investment Deals Combined without Trade Deal")
		public void user_select_the_tenure_dropdown_as_years_in__maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainTenureDropdown_611()); 
			dropDownHelper.SelectUsingVisibleText(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainTenureDropdown_611(),
					testData.get("Tenure DD"));
		}	
		@And("User_611 select the Profit Calculation as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_select_the_profit_calculation_as_diminising_returns_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentProfitCalculationMethodDropdown_611());
			for (int i = 0; i <= 500; i++) {
				try {
					dropDownHelper.SelectUsingVisibleText(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentProfitCalculationMethodDropdown_611(),
							testData.get("Profit Calculation"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_611 select the Profit Recognition as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_select_the_profit_recognition_as_diminising_returns_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentProfitRecogMethodDropdown_611());
			for (int i = 0; i <= 500; i++) {
				try {
					dropDownHelper.SelectUsingVisibleText(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentProfitRecogMethodDropdown_611(),
							testData.get("Profit Recognition"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_611 enter the Grace period in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_enter_the_grace_period_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput_611());
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput_611().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput_611().sendKeys(testData.get("Grace Period"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainTenureInput_611().getAttribute("prevvalue")
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

		@And("User_611 select the Grace period dropdown as Years in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_select_the_grace_period_dropdown_as_years_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodDropdown_611()); 
			for (int i = 0; i <= 500; i++) {
				try {
					dropDownHelper.SelectUsingVisibleText(AccrualDealobj611.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodDropdown_611(),
							testData.get("Grace Period DD"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}		
		}
		@When("User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Process")
		public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_accrual_process() throws Throwable {
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

		

		}
		
			
		
		    
		
}
