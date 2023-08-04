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
	
	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData IncidentalCharges =  new ExcelData(path, "IncidentalCharges", "Data Set ID");
	Map<String, String> testData;
	
	@And("^User_607 get the test data for test ID AT_IC_005")
    public void get_the_test_data_for_test_case_AT_IC_005() throws Throwable {
		testData = IncidentalCharges.getTestdata("DS_AT_IC_005");
    }
	
	@And("^User_607 get the test data for test ID AT_IC_006")
    public void get_the_test_data_for_test_case_AT_IC_006() throws Throwable {
		testData = IncidentalCharges.getTestdata("DS_AT_IC_006");
    }
	
	@And("^User_607 get the test data for test ID AT_IC_007")
    public void get_the_test_data_for_test_case_AT_IC_007() throws Throwable {
		testData = IncidentalCharges.getTestdata("DS_AT_IC_007");
    }
	
	@And ("User_607 get the test data for test ID AT_IC_008")
	public void get_the_test_data_for_test_case_AT_IC_008() throws Throwable {
		testData = IncidentalCharges.getTestdata("DS_AT_IC_008");
    }
	
	
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
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys(testData.get("Party Value"),Keys.TAB);
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys("727",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
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
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys(testData.get("Charge Code"),Keys.TAB);
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys("3",Keys.TAB);
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
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys(testData.get("Product Class"),Keys.TAB);
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys("100",Keys.TAB);
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
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys(testData.get("Amount"),Keys.TAB);
//		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys("10000",Keys.TAB);
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

	String temp="";
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
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISApproveMenuConfirmContinuePopup_608());
		for (int i = 0; i < 1000; i++) {
			Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608().click();
			break;
		}
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISApproveMenuConfirmCollateralPopup_608());
		for (int i = 0; i < 1000; i++) {
			Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_608().click();
			break;
		}

		
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_InformationPopupTextMsg_608());
		String text = Incidental_Charges_Obj.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = Incidental_Charges_Obj.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Reference Number: "+dealNbr);   
    	temp = dealNbr;
    	IncidentalCharges.updateTestData(testData.get("Data Set ID"),"Deal No", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
			}
		}		
	}
	
	
	@And ("User_607 Update the value in excel")
	public void User_607_Update_the_value_in_excel() throws Throwable {
		IncidentalCharges.updateTestData(testData.get("Data Set ID"),"Deal No", temp);
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
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys(testData.get("Deal No"),Keys.ENTER);
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
	
	
	@Given("User_607 Click Repayment Plan Under Menu")
	public void user_click_repayment_plan_under_menu() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_Repayment_Plan_Under_Menu_607());
		  Incidental_Charges_Obj.Click_Repayment_Plan_Under_Menu_607().click();
	}

	@Given("User_607 Click Mainteance Under Repayment Plan")
	public void user_click_mainteance_under_repayment_plan() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_Mainteance_Under_Repayment_Plan_607());
		  Incidental_Charges_Obj.Click_Mainteance_Under_Repayment_Plan_607().click();
	}

	@Given("User_607 Click Search In Mainteance Under Repayment Plan")
	public void user_click_search_in_mainteance_under_repayment_plan() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_Search_InMainteance_Under_Repayment_Plan_607());
		  Incidental_Charges_Obj.Click_Search_InMainteance_Under_Repayment_Plan_607().click();
	}

	@Given("User_607 Search Deal Record In Mainteance Under Repayment Plan")
	public void user_search_deal_record_in_mainteance_under_repayment_plan() throws Throwable {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SearchDealRecord_InMainteance_Under_Repayment_Plan_607());
		  Incidental_Charges_Obj.SearchDealRecord_InMainteance_Under_Repayment_Plan_607().sendKeys(testData.get("Deal No"),Keys.ENTER);
		  Thread.sleep(3000);
	}

	@Given("User_607 Select Record In Mainteance Under Repayment Plan")
	public void user_select_record_in_mainteance_under_repayment_plan() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectRecord_InMainteance_Under_Repayment_Plan_607());
		  clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.SelectRecord_InMainteance_Under_Repayment_Plan_607());
	}

	@Given("User_607 Click Schedule Details In Mainteance Under Repayment Plan")
	public void user_click_schedule_details_in_mainteance_under_repayment_plan() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_ScheduleDetails_InMainteance_Under_Repayment_Plan_607());
		  for (int i = 0; i < 1000; i++) {
			  try {
				  Incidental_Charges_Obj.Click_ScheduleDetails_InMainteance_Under_Repayment_Plan_607().click();
				  break;
			} catch (Exception e) {
			}
		}
	}
	int IncidentalCharge; 
	@Given("User_607 Get Incidental Charge In Mainteance Under Repayment Plan")
	public void user_Get_incidental_charge_in_mainteance_under_repayment_plan() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.getIncidentalCharge_InMainteance_Under_Repayment_Plan_607());
		 String IncidentalCharge1 = Incidental_Charges_Obj.getIncidentalCharge_InMainteance_Under_Repayment_Plan_607().getAttribute("title");
		 IncidentalCharge = Integer.parseInt(IncidentalCharge1);
		  System.out.println(IncidentalCharge);
		 Assert.assertEquals(IncidentalCharge, 1000);
	}
	
	
	
	
	
	@Given("User_607 Check Incidental Charge In Mainteance Under Repayment Plan")
	public void user_Check_incidental_charge_in_mainteance_under_repayment_plan() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.getIncidentalCharge_InMainteance_Under_Repayment_Plan_607());
		 String IncidentalCharge1 = Incidental_Charges_Obj.getIncidentalCharge_InMainteance_Under_Repayment_Plan_607().getAttribute("title");
		 IncidentalCharge = Integer.parseInt(IncidentalCharge1);
		  System.out.println(IncidentalCharge);
		 Assert.assertEquals(IncidentalCharge, 1000);
	}
	
	
	@Given("User_607 Click Settlement Under Menu")
	public void user_click_settlement_under_menu() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_Settlement_Under_Menu_607());
		  Incidental_Charges_Obj.Click_Settlement_Under_Menu_607().click();
	    
	}

	@Given("User_607 Click Mainteance Under Settlement")
	public void user_click_mainteance_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_Mainteance_UnderSettlement_607());
		  Incidental_Charges_Obj.Click_Mainteance_UnderSettlement_607().click();
	    
	}

	@Given("User_607 DealNbr In Settlement Details Tab In Mainteance Under Settlement")
	public void user_deal_nbr_in_settlement_details_tab_in_mainteance_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.DealNbr_InSettlementDetailsTab_InMainteance_UnderSettlement_607());
		  Incidental_Charges_Obj.DealNbr_InSettlementDetailsTab_InMainteance_UnderSettlement_607().sendKeys(testData.get("Deal No"),Keys.ENTER);
	}

	@Given("User_607 Click Schedule Details Tab In Mainteance Under Settlement")
	public void user_click_schedule_details_tab_in_mainteance_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_ScheduleDetailsTab_InMainteance_UnderSettlement_607());
		  Incidental_Charges_Obj.Click_ScheduleDetailsTab_InMainteance_UnderSettlement_607().click();
	    
	}

	Double ammount;
	@Given("User_607 Get Principal Charge Insurance Amt In Schedule Details In Mainteance Under Settlement")
	public void user_get_principal_charge_insurance_amt_in_schedule_details_in_mainteance_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Principal_Charge_InsuranceAmt_InScheduleDetails_InMainteance_UnderSettlement_607());
		  String ammount1 = Incidental_Charges_Obj.Principal_Charge_InsuranceAmt_InScheduleDetails_InMainteance_UnderSettlement_607().getText();
		  ammount = Double.parseDouble(ammount1);
	      System.out.println(ammount);
	      System.out.println(String.valueOf(ammount+IncidentalCharge));
	}
	
	@Given("User_607 Click settlement Details tab In Mainteance Under Settlement")
	public void user_click_settlement_tab_in_mainteance_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_settlementDetailsTab_InMainteance_UnderSettlement_607());
		  Incidental_Charges_Obj.Click_settlementDetailsTab_InMainteance_UnderSettlement_607().click();
	}
	
	@Given("User_607 Enter Amount Received From Party In Settlement Details Tab In Mainteance Under Settlement")
	public void user_enter_amount_received_from_party_in_settlement_details_tab_in_mainteance_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.EnterAmount_Received_FromParty_InSettlementDetailsTab_InMainteance_UnderSettlement_607());
		 // IncidentalChargeAndAmmount = String.valueOf(IncidentalCharge+ammount);
		  Incidental_Charges_Obj.EnterAmount_Received_FromParty_InSettlementDetailsTab_InMainteance_UnderSettlement_607().sendKeys(String.valueOf(ammount+IncidentalCharge),Keys.TAB);
	}

	@Given("User_607 Enter Settlement In Schedule Details tab In Mainteance Under Settlement")
	public void user_enter_settlement_in_schedule_details_tab_in_mainteance_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectFirstLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607());
		  Incidental_Charges_Obj.SelectFirstLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607().click();
		  clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.EnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607());
		  Incidental_Charges_Obj.EnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607().sendKeys(String.valueOf(ammount),Keys.ENTER);
	}
	
	@Given("User_607 Click Save button In Mainteance Under Settlement")
	public void user_click_save_button_in_mainteance_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickSavebtn_InMainteance_UnderSettlement_607());
		  for (int i = 0; i < 500; i++) {
			  Incidental_Charges_Obj.ClickSavebtn_InMainteance_UnderSettlement_607().click();
			  break;
		}
	}

	@Given("User_607 Click ok on save successfully")
	public void user_click_ok_on_save_successfully() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SuccessFully_Saved_popup_ok_btn_607());
		  Incidental_Charges_Obj.SuccessFully_Saved_popup_ok_btn_607().click();
	}

	@Given("User_607 Click approve Under Settlement")
	public void user_click_approve_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickApprove_UnderSettlement_607());
		  Incidental_Charges_Obj.ClickApprove_UnderSettlement_607().click();
	    
	}

	@Given("User_607 Search Deal In Approve Under Settlement")
	public void user_search_deal_in_approve_under_settlement() throws Throwable {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SearchDeal_InApprove_UnderSettlement_607());
		  Incidental_Charges_Obj.SearchDeal_InApprove_UnderSettlement_607().sendKeys(testData.get("Deal No"),Keys.ENTER);
		  Thread.sleep(3000);
	}

	@Given("User_607 Select Record In Approve Under Settlement")
	public void user_select_record_in_approve_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectRecord_InApprove_UnderSettlement_607());
		  clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.SelectRecord_InApprove_UnderSettlement_607());
	}

	@Given("User_607 Click Approve button In Approve Under Settlement")
	public void user_click_approve_button_in_approve_under_settlement() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickApproveBtn_InApprove_UnderSettlement_607());
		  Incidental_Charges_Obj.ClickApproveBtn_InApprove_UnderSettlement_607().click();

	}

	@Given("User_607 Click ok Confirm popup")
	public void user_click_ok_confirm_popup() {
		  waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.CconfirmSave_popup_ok_btn());
		  Incidental_Charges_Obj.CconfirmSave_popup_ok_btn().click();
	}
	
	
	//126188
	@Given("User_607 Enter Second Settlement In Schedule Details tab In Mainteance Under Settlement")
	public void user_enter_second_settlement_in_schedule_details_tab_in_mainteance_under_settlement() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectSecondLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607());
	    Incidental_Charges_Obj.SelectSecondLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607().click();
	    clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.EnterSecondSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607());
	    Incidental_Charges_Obj.EnterSecondSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607().sendKeys(String.valueOf(ammount),Keys.ENTER);
	}

	//126189
	
	@Given("User_607 Enter third Settlement In Schedule Details tab In Mainteance Under Settlement")
	public void user_enter_third_settlement_in_schedule_details_tab_in_mainteance_under_settlement() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectThirdLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607());
	    Incidental_Charges_Obj.SelectThirdLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607().click();
	    clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.EnterThirdSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607());
	    Incidental_Charges_Obj.EnterThirdSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607().sendKeys(String.valueOf(ammount),Keys.ENTER);
	}
	
	//130739
	
	@Given("User_607 Click Tracking Incidental Charges under menu")
	public void user_click_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.Click_Tracking_Incidental_Charges_under_menu_607().click();
	   
	}

	@Given("User_607 Click Mainteance Under Tracking Incidental Charges under menu")
	public void user_click_mainteance_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_Mainteance_Under_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.Click_Mainteance_Under_Tracking_Incidental_Charges_under_menu_607().click();
	   
	}

	@Given("User_607 Enter DealNbr In Mainteance Under Tracking Incidental Charges under menu")
	public void user_enter_deal_nbr_in_mainteance_under_tracking_incidental_charges_under_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.EnterDealNbr_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.EnterDealNbr_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607().sendKeys(testData.get("Deal No"),Keys.TAB);
	  // Thread.sleep(3000);
	}

	@Given("User_607 Select Charge Allocation Criteria In Mainteance Under Tracking Incidental Charges under menu")
	public void user_select_charge_allocation_criteria_in_mainteance_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Select_ChargeAllocationCriteria_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607());
		DropDownHelper.SelectUsingVisibleText(Incidental_Charges_Obj.Select_ChargeAllocationCriteria_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607(), testData.get("Charge Allocation Criteria"));
	   
	}

	@Given("User_607 Click Save button In Mainteance Under Tracking Incidental Charges under menu")
	public void user_click_save_button_in_mainteance_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickSave_Btn_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.ClickSave_Btn_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607().click();
	}

	@Given("User_607 Click Approve Under Tracking Incidental Charges under menu")
	public void user_click_approve_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickApprove_Under_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.ClickApprove_Under_Tracking_Incidental_Charges_under_menu_607().click();
	}
	
	@Given("User_607 Enter Charge Code In Mainteance Under Tracking Incidental Charges under menu")
	public void user_enter_charge_code_in_mainteance_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.EnterChargeCode_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.EnterChargeCode_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607().sendKeys(testData.get("Charge Code"),Keys.TAB);
	    
	}

	@Given("User_607 Click Search button In Accounts In Mainteance Under Tracking Incidental Charges under menu")
	public void user_click_search_button_in_accounts_in_mainteance_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickSearch_BtnInAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.ClickSearch_BtnInAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607().click();
	    
	}

	@Given("User_607 Select GL Code In Accounts In Mainteance Under Tracking Incidental Charges under menu")
	public void user_select_gl_code_in_accounts_in_mainteance_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectGLCode_InAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607());
		clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.SelectGLCode_InAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607());
	    
	}

	@Given("User_607 Click Approve button In Approve Under Tracking Incidental Charges under menu")
	public void user_click_approve_button_in_approve_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickApproveBtn_InApprove_Under_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.ClickApproveBtn_InApprove_Under_Tracking_Incidental_Charges_under_menu_607().click();
	    
	}
	@Given("User_607 Click Cancel in Report Generation")
	public void user_click_cancel_in_report_generation() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.ClickCancel_in_ReportGeneration_607());
		Incidental_Charges_Obj.ClickCancel_in_ReportGeneration_607().click();
		
	}
	
	@Given("User_607 Search Deal no In Approve Under Tracking Incidental Charges under menu")
	public void user_search_deal_no_in_approve_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SearchDealnbr_InApprove_Under_Tracking_Incidental_Charges_under_menu_607());
		Incidental_Charges_Obj.SearchDealnbr_InApprove_Under_Tracking_Incidental_Charges_under_menu_607().sendKeys(testData.get("Deal No"),Keys.ENTER);
	}

	@Given("User_607 Select Record in Approve Under Tracking Incidental Charges under menu")
	public void user_select_record_in_approve_under_tracking_incidental_charges_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectRecord_InApprove_Under_Tracking_Incidental_Charges_under_menu_607());
		clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.SelectRecord_InApprove_Under_Tracking_Incidental_Charges_under_menu_607());
	   
	}
	
	//130740
	
	@Given("User_607 Click Search In mainteance under Investment Deals Combined Without Trad Deal")
	public void user_click_search_in_mainteance_under_investment_deals_combined_without_trad_deal() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607());
		Incidental_Charges_Obj.Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607().click();
	}

	@Given("User_607 Search Record In mainteance under Investment Deals Combined Without Trad Deal")
	public void user_search_record_in_mainteance_under_investment_deals_combined_without_trad_deal() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SearchRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607());
		Incidental_Charges_Obj.SearchRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607().sendKeys(testData.get("Deal No"));
	}

	@Given("User_607 Select Record In mainteance under Investment Deals Combined Without Trad Deal")
	public void user_select_record_in_mainteance_under_investment_deals_combined_without_trad_deal() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SelectRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607());
		clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.SelectRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607());
	}

	@Given("User_607 Click Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal")
	public void user_click_payment_instruction_in_mainteance_under_investment_deals_combined_without_trad_deal() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_PaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607());
		for (int i = 0; i < 200; i++) {
			try {
				Incidental_Charges_Obj.Click_PaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607().click();	
				break;
			} catch (Exception e) {
			}
		}
	}

	@Given("User_607 Click Journal Voucher Details In Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal")
	public void user_click_journal_voucher_details_in_payment_instruction_in_mainteance_under_investment_deals_combined_without_trad_dea() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Click_JournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607());
		Incidental_Charges_Obj.Click_JournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607().click();
	}
	
	@Given("User_607 Check Incidental Charges In Journal Voucher Details In Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal")
	public void user_check_incidental_charges_in_journal_voucher_details_in_payment_instruction_in_mainteance_under_investment_deals_combined_without_trad_deal() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.CheckIncidental_Charges_InJournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607());
		String CvAmmount = Incidental_Charges_Obj.CheckIncidental_Charges_InJournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607().getText();
		System.out.println(CvAmmount);
	}
}
