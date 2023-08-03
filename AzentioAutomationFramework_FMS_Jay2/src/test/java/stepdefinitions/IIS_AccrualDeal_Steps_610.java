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
import io.cucumber.java.en.When;
import pageobjects.CommonElements.IIS_AccrualDeal_obj_610;
import resources.BaseClass;

public class IIS_AccrualDeal_Steps_610 {

	WebDriver driver = BaseClass.driver;
	String Deal_Number;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	
	IIS_AccrualDeal_obj_610 IIS_AccrualDeal_obj_610 = new IIS_AccrualDeal_obj_610(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData  = new ExcelData(path,"Accrual_Deal","DataSet ID");
	ExcelData accuraldealExcelData  = new ExcelData(path,"IIS_AccuralDeal_610","DataSet ID");
	
	Map<String, String> testData;
	
	
			//---------------------------------------------------
		
	//-----------AccuralDeal
		
		@And("^User_610 get the test data set id for AT_AD_010$")
	    public void user_610_610_get_the_test_data_set_id_for_AT_AD_010() throws Throwable {
	    	testData = accuraldealExcelData.getTestdata("AT_AD_010_D1");
	    }
		
//		@AT_AD_003
		@And("^User_610 get the test data for test case AT_AD_003$")
	    public void get_the_test_data_for_test_case_AT_AD_003() throws Throwable {
			testData = accuraldealExcelData.getTestdata("DS_AT_AD_003");
	    }
		
		
		// Clear cache step
		@And("User_610 clear the caches in IIS Application")
		public void user_610_clear_the_caches_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISCoreTechDetailsIcon_610());
			IIS_AccrualDeal_obj_610.IISCoreTechDetailsIcon_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISCoreClearCacheBtn_610());
			IIS_AccrualDeal_obj_610.IISCoreClearCacheBtn_610().click();
			
			for (int i = 0; i < 2000; i++) {
				try {
					if (IIS_AccrualDeal_obj_610.IIS_Ok_610().isDisplayed()) {
						IIS_AccrualDeal_obj_610.IIS_Ok_610().click();
				    	break;
					}
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("User_610 Click the Investment Deals Combined without Trade Deal menu")
		public void user_610_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_610());
			javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_610().click();		
		}

		@And("User_610 Click the Maintenance under Investment Deals Combined without Trade Deal")
		public void user_610_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_610().click();
		}

		@And("User_610 Select the Party in Investment Deals Combined without Trade Deal")
		public void user_610_Select_the_party_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_610().click();
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_610().sendKeys(testData.get("Party"),Keys.ENTER);
			
			String CifNo = testData.get("Party");
			int CifNoLen = 8 - CifNo.length();
		    for(int i = 1; i <=CifNoLen ; i++){
		        CifNo= "0" + CifNo;
		    }
		    
			//table[@id='gridtab_investmentDeals_PARTY_T022MT']/tbody/tr/td[text()='00001069']
			String xpath ="//table[@id='gridtab_investmentDeals_PARTY_T022MT']/tbody/tr/td[text()='"+CifNo+"']";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionsHelper.doubleClick(Code);
						break;
					}
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}	
			}
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			 
		}

		@And("User_610 Select the Category in Investment Deals Combined without Trade Deal")
		public void user_610_Select_the_category_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_610().click();
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_610().sendKeys(testData.get("Category"),Keys.ENTER);
			
			//table[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT']/tbody/tr/td[text()='3']
			String xpath ="//table[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT']/tbody/tr/td[text()='"+testData.get("Category")+"']";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionsHelper.doubleClick(Code);
						Thread.sleep(2000);
						break;
					}
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}	
			}	
		}

		@And("User_610 Select the Product Class in Investment Deals Combined without Trade Deal")
		public void user_610_Select_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_610().click();
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_610().sendKeys(testData.get("Product Class"),Keys.ENTER);
			
			//table[@id='gridtab_investmentDeals_CLASS_T022MT']/tbody/tr/td[text()='92']
			String xpath ="//table[@id='gridtab_investmentDeals_CLASS_T022MT']/tbody/tr/td[text()='"+testData.get("Product Class")+"']";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionsHelper.doubleClick(Code);
						Thread.sleep(1000);
						break;
					}
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}	
			}	
		}

		@And("User_610 Enter the Amount in Investment Deals Combined without Trade Deal")
		public void user_610_Enter_the_amount_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_610().clear();
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_610().sendKeys(testData.get("Amount"),Keys.TAB);
			Thread.sleep(2000);
		}

		@And("User_610 Enter the Tenure in Investment Deals Combined without Trade Deal")
		public void user_610_Enter_the_tenure_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_610());
			clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_610());
			Thread.sleep(1000);
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_610().sendKeys(testData.get("Tenure"),Keys.TAB);
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();

		}
		
		@And("User_610 Enter the Yield in Investment Deals Combined without Trade Deal")
		public void user_610_Enter_the_yield_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_610().clear();
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_610().sendKeys(testData.get("Yield"),Keys.TAB);

		}

		@And("User_610 Click the Contributor Details tab in Maintenance under Investment Deals Combined without Trade Deal")
		public void user_610_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_610().click();
		}

		@And("User_610 Double Click the Contributor Details row in maintenance under Investment Deals Combined without Trade Deal")
		public void user_610_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_610());
			clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_610());
			Thread.sleep(2000);
		}

		@And("User_610 Select the Nostro in Contributor Details tab under Investment Deals Combined without Trade Deal")
		public void user_610_Select_the_nostro_in_Contributor_details_tab_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_610().click();
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_610().sendKeys(testData.get("Nostro GL"),Keys.ENTER);
			
			//   (//table[@id='gridtab_nostro_sl_T022MT']/tbody/tr/td[text()='101101'])[1]
			String xpath ="(//table[@id='gridtab_nostro_sl_T022MT']/tbody/tr/td[text()='"+testData.get("Nostro GL")+"'])[1]";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionsHelper.doubleClick(Code);
						Thread.sleep(2000);
						break;
					}
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}	
			}		
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					Assert.fail(e.getMessage());
				}
	    	}	
			Thread.sleep(3000);
		}

		@And("User_610 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_610_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_610().click();
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_610().sendKeys(testData.get("Maturity GL"),Keys.ENTER);
			
			//table[@id='gridtab_matr_ac_sl_T022MT']/tbody/tr/td[text()='411001']
			String xpath ="//table[@id='gridtab_matr_ac_sl_T022MT']/tbody/tr/td[text()='"+testData.get("Maturity GL")+"']";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionsHelper.doubleClick(Code);
						Thread.sleep(2000);
						break;
					}
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}	
			}		
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			Thread.sleep(2000);
		}
		
		@And("User_610 Click the Ok button in Contributor Details tab in Investment Deals Combined without Trade Deal")
		public void user_610_click_the_ok_button_in_contributor_details_tab_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_610());
			javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_610().click();
			Thread.sleep(1000);
		}
		
		@And("User_610 Click the Save button in Investment Deals Combined without Trade Deal")
		public void user_610_click_the_save_button_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Save_610());
			javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Save_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Save_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			Thread.sleep(2000);
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_Ok_610());
			IIS_AccrualDeal_obj_610.IIS_Ok_610().click();
			Thread.sleep(2000); 
		}

		@And("User_610 Click the Repayment Plan Button in Investment Deals Combined without Trade Deal")
		public void user_610_click_the_repayment_plan_button_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_610().click();
		}
		
		@And("User_610 Select the Settlement Type in Repayment Plan")
		public void user_610_610_Select_the_Settlement_Type_in_Repayment_Plan() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_610());
			dropDownHelper.SelectUsingVisibleText(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_610(), testData.get("Settlement Type"));
			Thread.sleep(1000); 
		}
		
		@And("User_610 Set Number of Payments in Repayment Plan")
		public void user_610_610_Set_Number_of_Payments_in_Repayment_Plan() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_610());
			clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_610().sendKeys(testData.get("No Of Payments "),Keys.TAB);
			Thread.sleep(1000);
		}
		
		@And("User_610 Set Pay Every in Repayment Plan")
		public void user_610_610_Set_Pay_Every_in_Repayment_Plan() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_610());
			clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_610().sendKeys(testData.get("Pay Every"),Keys.TAB);
			Thread.sleep(1000);
		}
		
		@And("User_610 Check the Include VAT in Installment flag is Enabled")
		public void user_610_610_Check_the_Include_VAT_in_Installment_flag_is_Enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_610());
			WebElement VAT = IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_610();
			try {
				if (VAT.isSelected()) {
					Assert.assertTrue(true);
				}
				else {
					VAT.click();
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
			
		@And("User_610 Check the Grace period flag is Enabled")
		public void user_610_610_Check_the_Grace_period_flag_is_Enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_610());
			WebElement Grace_period = IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_610();
			try {
				if (Grace_period.isSelected()) {
					Assert.assertTrue(true);
				}
				else {
					Grace_period.click();
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}	
		}
			
		@And("User_610 Uncheck the Compounding During Grace period flag is Disabled")
		public void user_610_610_unheck_the_Compounding_During_Grace_period_flag_is_Enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_610());
			WebElement Compounding_During_Grace_period = IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_610();
			try {
				if (Compounding_During_Grace_period.isSelected()) {
					Compounding_During_Grace_period.click();
				}
				else {
					Assert.assertTrue(true);
			}	
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
			
		

		@And("User_610 Click the Create schedule button in Repayment Plan in Investment Deals Combined without Trade Deal")
		public void user_610_click_the_create_schedule_button_in_repayment_plan_in_investment_deals_combined_without_trade_deal() throws Throwable {
	     	waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_610().click();		
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
		}

		@And("User_610 Click the Close Button in Repayment Plan in Investment Deals Combined without Trade Deal")
		public void user_610_610_Click_the_Close_Button_in_Repayment_Plan_in_Investment_Deals_Combined_without_Trade_Deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_610());
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_610().click();
		    
		}

		@When("User_610 Validate button in Investment Deals Combined without Trade Deal")
		public void user_610_validate_button_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Validate_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Validate_610().click();
			
			//div[text()='CONFIRM']
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOkPopUp_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			Thread.sleep(5000);
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InformationPopupTitle_610());
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InformationPopupTextMsg_610());
			String text1 = IIS_AccrualDeal_obj_610.IIS_InformationPopupTextMsg_610().getText();
			System.err.println("Text Message: "+text1);
			String dealNbr = IIS_AccrualDeal_obj_610.IIS_InformationPopupTextMsg_610().getText().substring(18, 22);
	    	System.err.println("Deal Number: "+dealNbr);    
	    	
			//div[@id='div__popup_path_sol_confirm']/div[2]/div
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOkPopUp_610());
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			if (IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().isDisplayed()) {
				IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			}
			
		
//			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
//			IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_Information_PopUp_610());
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_Information_PopUp_TextMsg_610());
			String text = IIS_AccrualDeal_obj_610.IIS_Information_PopUp_TextMsg_610().getText();
			System.err.println("Text Message: "+text);
			Deal_Number = IIS_AccrualDeal_obj_610.IIS_Information_PopUp_TextMsg_610().getText().substring(18, 22);
	    	System.err.println("Reference Number: "+Deal_Number);    	
	    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", Deal_Number);
			for (int i = 0; i <= 2000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_Ok_610().click();
					break;
				} catch (Exception e) {
		
				}
			}		
		    
		}
		
		@And("User_610 Click on Approve Submenu in Investment Deals Combined without Trade Deal")
		public void user_610_click_on_approve_Submenu_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Approve_610());
			for (int i = 0; i <= 500; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Approve_610().click();
					break;
				} catch (Exception e) {
		
				}
			}
		}

		@And("User_610 Select the Deal Number in Approve Submenu in Investment Deals Combined without Trade Deal")
		public void user_610_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_610().sendKeys(Deal_Number,Keys.ENTER);
			
			//table[@id='investmentDealsGridTbl_Id_T022P']/tbody/tr/td[text()='000000005400']
			String xpath ="//table[@id='investmentDealsGridTbl_Id_T022P']/tbody/tr/td[text()='"+"00000000"+Deal_Number+"']";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionsHelper.doubleClick(Code);
						break;
					}
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}	
			}	
		}


		@When("User_610 Click the Approve button in Approve Submenu in Investment Deals Combined without Trade Deal")
		public void user_610_click_the_approve_button_in_approve_submenu_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_610());
			javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_610());
			IIS_AccrualDeal_obj_610.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_610().click();
			Thread.sleep(3000);
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			
			if (IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().isDisplayed()) {
				IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			}
			Thread.sleep(2000);
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			if (IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().isDisplayed()) {
				IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			}
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610());
			if (IIS_AccrualDeal_obj_610.IIS_ConfirmCancel_610().isDisplayed()) {
				IIS_AccrualDeal_obj_610.IIS_ConfirmOk_610().click();
			}
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_Ok_610());
			IIS_AccrualDeal_obj_610.IIS_Ok_610().click();
			}
		
		
		//---------------------------------------------settlement
		
		
		@And("User_610 click the Settlement module in IIS Application")
		public void user_click_the_settlement_module_in_iis_application() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISSettlementMenu_610());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}	
			for (int i = 0; i <= 300; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISSettlementMenu_610().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}			    
		}
		
		@And("User_610 click the maintenance menu under Settlement module")
		public void user_click_the_maintenance_menu_under_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenance_610());
			IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenance_610().click();
		}

		@And("User_610 enter the Deal number in maintenance menu under Settlement")
		public void user_enter_the_deal_number_in_maintenance_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceDealNbrInput_610());
			IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceDealNbrInput_610().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceDealNbrInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@And("User_610 enter the Amount received from party in maintenance menu under Settlement")
		public void user_enter_the_amount_received_from_party_in_maintenance_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenancePartyAmtInput_610());
			IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenancePartyAmtInput_610().sendKeys(testData.get("Party Amt"),Keys.TAB);
//			IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenancePartyAmtInput_610().sendKeys("1000",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenancePartyAmtInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		}

		@When("User_610 click the Automatic Allocation button in maintenance menu under Settlement")
		public void user_click_the_automatic_allocation_button_in_maintenance_menu_under_settlement() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceAutoAllocationBtn_610());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}		
			IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceAutoAllocationBtn_610().click();
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceScheduleDetailsTable_610());
		}

		@When("User_610 click the Save button in maintenance menu under Settlement")
		public void user_click_the_save_button_in_maintenance_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceSaveBtn_610());
			for (int i = 0; i <= 300; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceSaveBtn_610().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceSuccessPopupText_610());
//			String text = IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceSuccessPopupText_610().getText();
//			System.err.println("Text Message: "+text);
			
			String settlementNbr = IIS_AccrualDeal_obj_610.IISSettlementMenuMaintenanceSuccessPopupText_610().getText().substring(25, 29);
	    	System.err.println("Settlement Number: "+settlementNbr);  
	    	
	    	accuraldealExcelData.updateTestData(testData.get("DataSet ID"),"Settlement Nbr", settlementNbr);
			
			for (int i = 0; i <= 2000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_SuccessPopupOkBtn_610().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}
		
		
		@And("User_610 close the Settlement Maintenance menu")
		public void user_close_the_settlement_maintenance_menu() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISSettlementMaintenanceMenuCloseIcon_610());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i <= 300; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISSettlementMaintenanceMenuCloseIcon_610().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		
		@And("User_610 click the approve menu under Settlement module")
		public void user_click_the_approve_menu_under_settlement_module() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuApprove_610()); 
			IIS_AccrualDeal_obj_610.IISSettlementMenuApprove_610().click();
		}

		@And("User_610 enter the settlement number in searchgrid under approve menu in Settlement")
		public void user_enter_the_settlement_number_in_searchgrid_under_approve_menu_in_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuApproveSearchgridSettlementNbrInput_610());
			IIS_AccrualDeal_obj_610.IISSettlementMenuApproveSearchgridSettlementNbrInput_610().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
//			IIS_AccrualDeal_obj_610.IISSettlementMenuApproveSearchgridSettlementNbrInput_610().sendKeys("9581",Keys.ENTER);
		}

		@And("User_610 double click the searchgrid row in approve menu under Settlement")
		public void user_double_click_the_searchgrid_row_in_approve_menu_under_settlement() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISSettlementMenuApproveSearchgridRow_610());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IISSettlementMenuApproveSearchgridRow_610());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISSettlementMenuApproveSettlementNbr_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
			
		}

		@And("User_610 click the Approve button in approve menu under Settlement")
		public void user_click_the_approve_button_in_approve_menu_under_settlement() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISSettlementApproveMenuApproveBtn_610());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			IIS_AccrualDeal_obj_610.IISSettlementApproveMenuApproveBtn_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610().click();		
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISApproveMenuConfirmPopupProceed_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610().click();
			
			for (int i = 0; i <= 2000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_SuccessPopupOkBtn_610().click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
           }
		
		
		
		
		
		
		
		
		
		
		
		
}
