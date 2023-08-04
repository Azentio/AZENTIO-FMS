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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.IIS_PageObjects_609;
import resources.BaseClass;

public class IIS_StepDefinition_609 extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin IISLogin = new IISLogin(driver);
	IIS_PageObjects_609 IIS_PageObjects_609 = new IIS_PageObjects_609(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData  = new ExcelData(path,"IncidentalChargesTestData","DataSet ID");
	ExcelData accuraldealExcelData  = new ExcelData(path,"IIS_AccuralDeal_609","DataSet ID");
	
	Map<String, String> testData;
	String Deal_Number;
	
	@Given("^navigate to IIS application and login with valid credentials$")
	public void navigate_to_iis_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getIISApplicationUrl());
		IISLogin.loginIntoiisApplication2(configFileReader.getIISApplicationUserType());
	}
	
	@Given("^navigate to IIS param application and login with valid credentials$")
    public void navigate_to_iis_param_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getIISparamsUrl());
		IISLogin.loginIntoiisParamApplication2(configFileReader.getIISParamApplicationUserType());
    }
	
	
	
	@And("^User_609 get the test data set id for AT_AD_001$")
    public void user_609_609_get_the_test_data_set_id_for_AT_AD_001() throws Throwable {
    	testData = accuraldealExcelData.getTestdata("AT_AD_001_D1");
    }
	
	@And("^User_609 get the test data set id for AT_IC_023$")
    public void user_609_609_get_the_test_data_set_id_for_AT_IC_023() throws Throwable {
    	testData = iisIncidentalChargesExcelData.getTestdata("AT_IC_023_D1");
    }
	
	@And("^User_609 get the test data set id for AT_IC_024$")
    public void user_609_609_get_the_test_data_set_id_for_AT_IC_024() throws Throwable {
    	testData = iisIncidentalChargesExcelData.getTestdata("AT_IC_024_D1");
    }

	
	// Clear cache step
	@And("User_609 clear the caches in IIS Application")
	public void user_609_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISCoreTechDetailsIcon_609());
		IIS_PageObjects_609.IISCoreTechDetailsIcon_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISCoreClearCacheBtn_609());
		IIS_PageObjects_609.IISCoreClearCacheBtn_609().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
				if (IIS_PageObjects_609.IIS_Ok_609().isDisplayed()) {
					IIS_PageObjects_609.IIS_Ok_609().click();
			    	break;
				}
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_609 Click the Investment Deals Combined without Trade Deal menu")
	public void user_609_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609().click();		
	}

	@And("User_609 Click the Maintenance under Investment Deals Combined without Trade Deal")
	public void user_609_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_609().click();
	}

	@And("User_609 Select the Party in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_party_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609().sendKeys(testData.get("Party"),Keys.ENTER);
		Thread.sleep(2000);
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
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		 
	}

	@And("User_609 Select the Category in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_category_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609().sendKeys(testData.get("Category"),Keys.ENTER);
		
		//table[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT']/tbody/tr/td[text()='3']
		String xpath ="//table[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT']/tbody/tr/td[text()='"+testData.get("Category")+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
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

	@And("User_609 Select the Product Class in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609().sendKeys(testData.get("Product Class"),Keys.ENTER);
		
		//table[@id='gridtab_investmentDeals_CLASS_T022MT']/tbody/tr/td[text()='92']
		String xpath ="//table[@id='gridtab_investmentDeals_CLASS_T022MT']/tbody/tr/td[text()='"+testData.get("Product Class")+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
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

	@And("User_609 Enter the Amount in Investment Deals Combined without Trade Deal")
	public void user_609_Enter_the_amount_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609().clear();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609().sendKeys(testData.get("Amount"),Keys.TAB);
		Thread.sleep(2000);
	}

	@And("User_609 Enter the Tenure in Investment Deals Combined without Trade Deal")
	public void user_609_Enter_the_tenure_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609());
		clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609());
		Thread.sleep(1000);
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609().sendKeys(testData.get("Tenure"),Keys.TAB);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();

	}
	
	@And("User_609 Enter the Yield in Investment Deals Combined without Trade Deal")
	public void user_609_Enter_the_yield_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609().clear();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609().sendKeys(testData.get("Yield"),Keys.TAB);

	}

	@And("User_609 Click the Contributor Details tab in Maintenance under Investment Deals Combined without Trade Deal")
	public void user_609_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_609().click();
	}

	@And("User_609 Double Click the Contributor Details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_609_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_609());
		clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_609());
		Thread.sleep(2000);
	}

	@And("User_609 Select the Nostro in Contributor Details tab under Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_nostro_in_Contributor_details_tab_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609().sendKeys(testData.get("Nostro GL"),Keys.ENTER);
		
		//   (//table[@id='gridtab_nostro_sl_T022MT']/tbody/tr/td[text()='101101'])[1]
		String xpath ="(//table[@id='gridtab_nostro_sl_T022MT']/tbody/tr/td[text()='"+testData.get("Nostro GL")+"'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
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
				if(!(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_609().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
    	}		
	}

	@And("User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_609_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609().sendKeys(testData.get("Maturity GL"),Keys.ENTER);
		
		//table[@id='gridtab_matr_ac_sl_T022MT']/tbody/tr/td[text()='411001']
		String xpath ="//table[@id='gridtab_matr_ac_sl_T022MT']/tbody/tr/td[text()='"+testData.get("Maturity GL")+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
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
				if(!(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_609().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
	@And("User_609 Click the Ok button in Contributor Details tab in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_ok_button_in_contributor_details_tab_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609().click();
		Thread.sleep(1000);
	}
	
	@And("User_609 Click the Save button in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_save_button_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Save_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Save_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Save_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
		Thread.sleep(2000); 
	}

	@And("User_609 Click the Repayment Plan Button in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_repayment_plan_button_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_609().click();
	}
	
	@And("User_609 Select the Settlement Type in Repayment Plan")
	public void user_609_609_Select_the_Settlement_Type_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_609());
		dropDownHelper.SelectUsingVisibleText(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_609(), testData.get("Settlement Type"));
		Thread.sleep(1000); 
	}
	
	@And("User_609 Set Number of Payments in Repayment Plan")
	public void user_609_609_Set_Number_of_Payments_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609());
		clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609().sendKeys(testData.get("No Of Payments "),Keys.TAB);
		Thread.sleep(1000);
	}
	
	@And("User_609 Set Pay Every in Repayment Plan")
	public void user_609_609_Set_Pay_Every_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609());
		clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609().sendKeys(testData.get("Pay Every"),Keys.TAB);
		Thread.sleep(1000);
	}
	
	@And("User_609 Check the Include VAT in Installment flag is Enabled")
	public void user_609_609_Check_the_Include_VAT_in_Installment_flag_is_Enabled() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_609());
		WebElement VAT = IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_609();
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
		
	@And("User_609 Check the Grace period flag is Enabled")
	public void user_609_609_Check_the_Grace_period_flag_is_Enabled() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_609());
		WebElement Grace_period = IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_609();
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
		
	@And("User_609 Uncheck the Compounding During Grace period flag is Disabled")
	public void user_609_609_unheck_the_Compounding_During_Grace_period_flag_is_Enabled() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_609());
		WebElement Compounding_During_Grace_period = IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_609();
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
		
	

	@And("User_609 Click the Create schedule button in Repayment Plan in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_create_schedule_button_in_repayment_plan_in_investment_deals_combined_without_trade_deal() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_609().click();		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
	}

	@And("User_609 Click the Close Button in Repayment Plan in Investment Deals Combined without Trade Deal")
	public void user_609_609_Click_the_Close_Button_in_Repayment_Plan_in_Investment_Deals_Combined_without_Trade_Deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_609().click();
	    
	}

	@When("User_609 Validate button in Investment Deals Combined without Trade Deal")
	public void user_609_validate_button_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Validate_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Validate_609().click();
		
		//div[text()='CONFIRM']
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOkPopUp_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(5000);
		
		//div[@id='div__popup_path_sol_confirm']/div[2]/div
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOkPopUp_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		if (IIS_PageObjects_609.IIS_ConfirmOk_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}
		
	
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
//		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Information_PopUp_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Information_PopUp_TextMsg_609());
		String text = IIS_PageObjects_609.IIS_Information_PopUp_TextMsg_609().getText();
		System.err.println("Text Message: "+text);
		Deal_Number = IIS_PageObjects_609.IIS_Information_PopUp_TextMsg_609().getText().substring(18, 22);
    	System.err.println("Reference Number: "+Deal_Number);    	
    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", Deal_Number);
		for (int i = 0; i <= 2000; i++) {
			try {
				IIS_PageObjects_609.IIS_Ok_609().click();
				break;
			} catch (Exception e) {
	
			}
		}		
	    
	}
	
	@And("User_609 Click on Approve Submenu in Investment Deals Combined without Trade Deal")
	public void user_609_click_on_approve_Submenu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_609());
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_609().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_609 Select the Deal Number in Approve Submenu in Investment Deals Combined without Trade Deal")
	public void user_609_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609().sendKeys(Deal_Number,Keys.ENTER);
		
		//table[@id='investmentDealsGridTbl_Id_T022P']/tbody/tr/td[text()='000000005400']
		String xpath ="//table[@id='investmentDealsGridTbl_Id_T022P']/tbody/tr/td[text()='"+"00000000"+Deal_Number+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}	
	}


	@When("User_609 Click the Approve button in Approve Submenu in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_approve_button_in_approve_submenu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609().click();
		Thread.sleep(3000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		
		if (IIS_PageObjects_609.IIS_ConfirmOk_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		if (IIS_PageObjects_609.IIS_ConfirmOk_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		if (IIS_PageObjects_609.IIS_ConfirmCancel_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
		}
	

//	
//	
////	@AT_IC_010
//	@And("User_609 Click the Tracking & Incidental Charges module")
//	public void user_609_click_the_tracking_incidental_charges_module() throws Throwable {
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609());
//		IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609().click();
//	}
//
//	@And("User_609 Click the Reverse menu under Tracking & Incidental Charges")
//	public void user_609_click_the_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesReverseMenu_609());
//		IIS_PageObjects_609.IISTrackingIncidentalChargesReverseMenu_609().click();
//	}
//
//	@And("User_609 Enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges")
//	public void user_609_Enter_the_track_number_in_searchgrid_under_reverse_menu_in_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_609());
//		IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_609().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
//	}
//
//	@And("User_609 double Click the searchgrid row in Reverse menu under Tracking & Incidental Charges")
//	public void user_609_double_click_the_searchgrid_row_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridRow_609());
//		for (int i = 0; i <= 300; i++) {
//			try {
//				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridRow_609());
//				break;
//			} catch (Exception e) {
//				
//			}
//    	}	    
//	}
//
//	@When("User_609 Click the Reverse button in Reverse menu under Tracking & Incidental Charges")
//	public void user_609_click_the_reverse_button_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuTrackNbr_609());
//	    for(int i = 0; i<= 300; i++) {
//	    	try {
//	    		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISIncidentalChargesReverseMenuReverseBtn_609());
//	    		break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//	    }
//	    IIS_PageObjects_609.IISIncidentalChargesReverseMenuReverseBtn_609().click();
//	    
//	    // Warning pop-up
//	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_WarningPopupOkBtn_609());
//	    IIS_PageObjects_609.IIS_WarningPopupOkBtn_609().click();
//	    
//	    // Information pop-up
//	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InformationPopupOkBtn_609());
//	    for(int i = 0; i <= 2000; i++) {
//	    	try {
//	    		IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
//	    		break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//	    }
//	    
//	}
//
//	@And("User_609 Click the Approve Reverse menu under Tracking & Incidental Charges")
//	public void user_609_click_the_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesApproveReverseMenu_609());
//		IIS_PageObjects_609.IISTrackingIncidentalChargesApproveReverseMenu_609().click();
//	}
//
//	@And("User_609 Enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges")
//	public void user_609_Enter_the_track_number_in_searchgrid_under_approve_reverse_menu_in_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_609());
//		IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_609().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
//	}
//
//	@And("User_609 double Click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges")
//	public void user_609_double_click_the_searchgrid_row_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridRow_609());
//	    for(int i = 0; i <=300; i++) {
//	    	try {
//				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridRow_609());
//				break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//	    }
//	}
//
//	@When("User_609 Click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges")
//	public void user_609_click_the_reverse_button_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseTrackNbr_609());
//		for(int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISIncidentalChargesApproveReverseMenuReverseBtn_609());
//				break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//		}
//		IIS_PageObjects_609.IISIncidentalChargesApproveReverseMenuReverseBtn_609().click();
//		
//		// Warning pop-up
//	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_WarningPopupOkBtn_609());
//	    IIS_PageObjects_609.IIS_WarningPopupOkBtn_609().click();
//	    
//	    // Information pop-up
//	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InformationPopupOkBtn_609());
//	    for(int i = 0; i <= 2000; i++) {
//	    	try {
//	    		IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
//	    		break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//	    }
//	}
//	
//	
//	
//	
//	
//	
	
///***************************************************** Tracking & Incidental Charges *******************************************************************///
	
	@And("User_609 Click the Tracking and Incidental Charges menu")
	public void user_609_click_the_Tracking_and_Incidental_Charges_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_609().click();		
	}
	
	@And("User_609 Click the Maintenance Screen in Tracking and Incidental Charges")
	public void user_609_click_the_Maintenance_Screen_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_609().click();		
	}
	
	@And("User_609 Select the Deal Number in Tracking and Incidental Charges")
	public void user_609_select_the_deal_number_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNoSearch_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNoSearch_609().click();	
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609().click();	
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609().sendKeys(Deal_Number,Keys.ENTER);
		//IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609().sendKeys("5462",Keys.ENTER);
		//table[@id='gridtab_trs_deal_serial_no_T07MT']/tbody/tr/td[text()='3003']
		String xpath ="//table[@id='gridtab_trs_deal_serial_no_T07MT']/tbody/tr/td[text()='"+Deal_Number+"']";
		//String xpath ="//table[@id='gridtab_trs_deal_serial_no_T07MT']/tbody/tr/td[text()='"+5462+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
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
	
	@And("User_609 Select the Charge Code in Tracking and Incidental Charges")
	public void user_609_Select_the_Charge_Code_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCodeSearch_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCodeSearch_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609().click();
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609().sendKeys(testData.get("Category"),Keys.ENTER);
		//IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609().sendKeys("3",Keys.ENTER);
		//table[@id='gridtab_charges_code_T07MT']/tbody/tr/td[text()='3']
		//String xpath ="//table[@id='gridtab_charges_code_T07MT']/tbody/tr/td[text()='"+3+"']";
		String xpath ="//table[@id='gridtab_charges_code_T07MT']/tbody/tr/td[text()='"+testData.get("Category")+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
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
	
	@And("User_609 Select the Charge Allocation Criteria in Tracking and Incidental Charges")
	public void user_609_Select_the_Charge_Allocation_Criteria_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609());
		//dropDownHelper.SelectUsingVisibleText(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609(), "Next Installment");
		dropDownHelper.SelectUsingVisibleText(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609(), testData.get("Charge Allocation Criteria"));
		Thread.sleep(1000); 
	}

	@And("User_609 Click the Save Button in Tracking and Incidental Charges")
	public void user_609_Click_the_Save_Button_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_Save_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_Save_609());
		Thread.sleep(1000); 
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(1000);
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
		
	}

	@And("User_609 Click the Approve Screen in Tracking and Incidental Charges")
	public void user_609_Click_the_Approve_Screen_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_609());
		Thread.sleep(1000); 
	}
	
	@And("User_609 Select the Deal Number in Approve Screen in Tracking and Incidental Charges")
	public void User_609_Select_the_Deal_Number_in_Approve_Screen_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_609().sendKeys(Deal_Number,Keys.ENTER);
		//IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_609().sendKeys("5462",Keys.ENTER);
		
		//table[@id='IncidentalChargesGridTbl_Id_T07P']/tbody/tr/td[text()='000000005462']
		String xpath ="//table[@id='IncidentalChargesGridTbl_Id_T07P']/tbody/tr/td[text()='"+Deal_Number+"']";
		//String xpath ="//table[@id='IncidentalChargesGridTbl_Id_T07P']/tbody/tr/td[text()='"+"00000000"+"5462"+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
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
	
	@And("User_609 Click the Approve Button in Approve Screen in Tracking and Incidental Charges")
	public void user_609_Click_the_Approve_Button_in_Approve_Screen_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_ApproveBtn_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_ApproveBtn_609());
		Thread.sleep(1000); 
		Thread.sleep(1000); 
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(1000);
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
	}

	
	
	///********************************************* Repayment Plan **********************************************************************///

	@And("User_609 Click the Repayment Plan menu")
	public void user_609_click_the_Repayment_Plan_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_RepaymentPlan_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_609().click();		
	}
	
	@And("User_609 Click the Maintenance Screen in Repayment Plan")
	public void user_609_click_the_Maintenance_Screen_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_609().click();		
	}
	
	@And("User_609 Click the Search Button in Repayment Plan")
	public void user_609_click_the_Search_Button_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_SearchBtn_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_SearchBtn_609().click();	
		Thread.sleep(5000);
	}
	
	@And("User_609 Select the Deal Number in Repayment Plan")
	public void user_609_select_the_deal_number_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_DealNo_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_DealNo_609().click();	
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_DealNo_609().sendKeys(Deal_Number,Keys.ENTER);
		//IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_DealNo_609().sendKeys("5462",Keys.ENTER);
		
		//table[@id='repaymentPlanMgmtGridTbl_Id_T04MT']/tbody/tr/td[text()='000000005462']
		String xpath ="//table[@id='repaymentPlanMgmtGridTbl_Id_T04MT']/tbody/tr/td[text()='"+"00000000"+Deal_Number+"']";
		//String xpath ="//table[@id='repaymentPlanMgmtGridTbl_Id_T04MT']/tbody/tr/td[text()='"+"00000000"+5462+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(8000);
					break;
				}
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}	
	}
	
	@And("User_609 Click the Schedule Details tab in Repayment Plan")
	public void user_609_click_the_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_ScheduleDetails_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_ScheduleDetails_609().click();		
	}
	
	@And("User_609 Click the Incidental Charge label in Schedule Details tab in Repayment Plan")
	public void user_609_click_the_Incidental_Charge_label_in_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_ScheduleDetails_IncidentalCharge_609());
		clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_ScheduleDetails_IncidentalCharge_609());		
	}
	
	@Then("User_609 Check the Incidental Charges Dispalyed in Schedule Details tab in Repayment Plan")
	public void user_609_check_the_Incidental_Charges_displayed_in_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609());
		try {
			if (IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609().isDisplayed()) {
				Assert.assertEquals(true, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
	}
	
	@Then("User_609 Check the Charge Name Dispalyed in Schedule Details tab in Repayment Plan")
	public void user_609_check_the_Charge_name_displayed_in_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609());
		try {
			if (IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609().isDisplayed()) {
				Assert.assertEquals(true, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
	}
	
	@Then("User_609 Check the Amount is Dispalyed in Schedule Details tab in Repayment Plan")
	public void user_609_check_the_Amount_is_displayed_in_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609());
		try {
			if (IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609().isDisplayed()) {
				Assert.assertEquals(true, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
	}
	
	@Then("User_609 Check the Total is Dispalyed in Schedule Details tab in Repayment Plan")
	public void user_609_check_the_total_is_displayed_in_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609());
		try {
			if (IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609().isDisplayed()) {
				Assert.assertEquals(true, IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
	}
}
