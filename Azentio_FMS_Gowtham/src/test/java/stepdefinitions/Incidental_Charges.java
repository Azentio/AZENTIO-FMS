package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Incidental_Charges_Obj;
import resources.BaseClass;

public class Incidental_Charges {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	CSMLogin csmLogin = new CSMLogin(driver);
	Incidental_Charges_Obj Incidental_Charges_Obj = new Incidental_Charges_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	IIS_Login IIS_Login = new IIS_Login(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
	
//	@Test
//	@And("^User_608 get the test data for test case$")
//    public void get_the_test_data_for_test_case() throws Throwable {
//		testData = iisIncidentalChargesExcelData.getTestdata("DS_Test");
//    }
	
	
	
	
	// Clear cache step
	@And("User_608 clear the caches in IIS Application")
	public void user_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISCoreTechDetailsIcon_608());
		Incidental_Charges_Obj.IISCoreTechDetailsIcon_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISCoreClearCacheBtn_608());
		Incidental_Charges_Obj.IISCoreClearCacheBtn_608().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	Investment Deals Combined without Trade Deal
	@And("User_608 click the Investment Deals Combined without Trade Deal menu")
	public void user_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMenu_608());
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMaintenanceMenu_608());
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMaintenanceMenu_608().click();
	}

	@And("User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_608());
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys(testData.get("Party Value"),Keys.TAB);
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys("727",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
		for (int i = 0; i < 1000; i++) {
			try {
				Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_608());
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys(testData.get("Charge Code"),Keys.TAB);
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys("3",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}

	@And("User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_608());
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys(testData.get("Product Class"),Keys.TAB);
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys("100",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_608());
//		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys(testData.get("Amount"),Keys.TAB);
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys("10000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	    
	}

	@And("User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorTab_608());
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorTab_608().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorTabRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorTabRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608());
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}		
	}

	@And("User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}
	
	@And("User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_ok_button_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608().click();
	}
	
	@And("User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainSaveBtn_608());
				break;
			} catch (Exception e) {

			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainSaveBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608());
		Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}		
	    
	}

	@And("User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608());
		for (int i = 0; i <= 700; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
	}

	@And("User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_608());
		// Un-check the Grace Period Check box
		for (int i = 0; i <= 700; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608());
				break;
			} catch (Exception e) {
				
			}
		}		
		WebElement gracePeriodCheckbox = Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608();
     	if(gracePeriodCheckbox.isSelected()) {
     		gracePeriodCheckbox.click();
     	}
     	
     	// create schedule button
     	waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608());
     	for (int i = 0; i <= 600; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
				break;
			} catch (Exception e) {
				
			}
		}
		for (int i = 0; i <= 600; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_608().click();
				break;
			} catch (Exception e) {
	
			}
		}	    
	}

	String dealNbr="";
	@When("User_608 validate button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainValidateBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608());
		Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_InformationPopupTitle_608());
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_InformationPopupTextMsg_608());
		String text = Incidental_Charges_Obj.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		dealNbr = Incidental_Charges_Obj.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Reference Number: "+dealNbr);    	
    //	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}		
	    
	}
	
	@Then("User_608 click the Approve menu under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenu_608());
		for (int i = 0; i <= 500; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenu_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
	public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608());
//		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys(dealNbr,Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@When("User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_608());
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				
			}
		}		
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608());
		Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608().click();		
		
		for (int i = 0; i <= 1000; i++) {
			try {
				Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		  	    	
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
		for (int i = 0; i <= 1000; i++) {
			try {
				Incidental_Charges_Obj.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
		
	}
	
	//126187
	@Given("User_607 Click Deal Charge button In mainteance Under Investment Deals without Trading Deal")
	public void user_click_deal_charge_button_in_mainteance_under_investment_deals_without_trading_deal() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_DealCharge_btn_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607());
		Incidental_Charges_Obj.Click_DealCharge_btn_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607().click();
	    
	}

	@Given("User_607 Select First Line In Deal Charge In mainteance Under Investment Deals without Trading Deal")
	public void user_select_first_line_in_deal_charge_in_mainteance_under_investment_deals_without_trading_deal() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectFirstLine_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607());
		for (int i = 0; i < 300; i++) {
			Incidental_Charges_Obj.SelectFirstLine_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607().click();
			break;
		}
	}

	@Given("User_607 Click Create Inidental Charge Check Box In Deal Charge In mainteance Under Investment Deals without Trading Deal")
	public void user_click_create_inidental_charge_check_box_in_deal_charge_in_mainteance_under_investment_deals_without_trading_deal() {
		for (int i = 0; i < 500; i++) {
			JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.ScrollTo_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607());
			break;
		}
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607());
		Incidental_Charges_Obj.Click_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607().click();
    
	}

	@Given("User_607 Select Collect In Deal Charge In mainteance Under Investment Deals without Trading Deal")
	public void user_select_collect_in_deal_charge_in_mainteance_under_investment_deals_without_trading_deal() {
	  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Select_Collect_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607());
	  DropDownHelper.SelectUsingVisibleText(Incidental_Charges_Obj.Select_Collect_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607(), "At 1st Installment");
	    
	}

	@Given("User_607 Click ok button In Deal Charge In mainteance Under Investment Deals without Trading Deal")
	public void user_click_ok_button_in_deal_charge_in_mainteance_under_investment_deals_without_trading_deal() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickOK_Btn_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607());
		  Incidental_Charges_Obj.ClickOK_Btn_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607().click();
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
