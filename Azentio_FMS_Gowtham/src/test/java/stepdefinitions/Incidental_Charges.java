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
	ExcelData Accrual_Process =  new ExcelData(path, "Accrual_Process", "Data Set ID");
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
	
	@And ("User_607 get the test data for test ID AT_AP_078")
	public void get_the_test_data_for_test_case_AT_AP_078() throws Throwable {
		testData = Accrual_Process.getTestdata("DS_AT_AP_078");
    }
	
	@And ("User_607 get the test data for test ID AT_AP_009")
	public void get_the_test_data_for_test_case_AT_AP_009() throws Throwable {
		testData = Accrual_Process.getTestdata("DS_AT_AP_009");
    }
	
	@And ("User_607 get the test data for test ID AT_AP_010")
	public void get_the_test_data_for_test_case_AT_AP_010() throws Throwable {
		testData = Accrual_Process.getTestdata("DS_AT_AP_010");
    }
	
	@And ("User_607 get the test data for test ID AT_AP_056")
	public void get_the_test_data_for_test_case_AT_AP_056() throws Throwable {
		testData = Accrual_Process.getTestdata("DS_AT_AP_056");
    }
	
	@And ("User_607 get the test data for test ID AT_AP_057")
	public void get_the_test_data_for_test_case_AT_AP_057() throws Throwable {
		testData = Accrual_Process.getTestdata("DS_AT_AP_057");
    }
	
	@And ("User_607 get the test data for test ID AT_AP_054")
	public void get_the_test_data_for_test_case_AT_AP_054() throws Throwable {
		testData = Accrual_Process.getTestdata("DS_AT_AP_054");
    }
	
	// Clear cache step
	@And("User_607 clear the caches in IIS Application")
	public void user_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISCoreTechDetailsIcon_607());
		Incidental_Charges_Obj.IISCoreTechDetailsIcon_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISCoreClearCacheBtn_607());
		Incidental_Charges_Obj.IISCoreClearCacheBtn_607().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_SuccessPopupOkBtn_607().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	Investment Deals Combined without Trade Deal
	@And("User_607 click the Investment Deals Combined without Trade Deal menu")
	public void user_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMenu_607());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMenu_607());
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMenu_607().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 click the Maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMaintenanceMenu_607());
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMaintenanceMenu_607().click();
	}

	@And("User_607 enter the Party in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_607());
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_607().sendKeys(testData.get("Party Value"),Keys.TAB);
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_607().sendKeys("727",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainPartyInput_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
			}
    	}
		
		for (int i = 0; i < 1000; i++) {
			try {
				Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607().click();
		    	break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("User_607 enter the category in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_607());
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_607().sendKeys(testData.get("Charge Code"),Keys.TAB);
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_607().sendKeys("3",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainCategoryInput_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}

	@And("User_607 enter the product class in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_607());
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_607().sendKeys(testData.get("Product Class"),Keys.TAB);
	//	Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_607().sendKeys("100",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainProductClassInput_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("User_607 enter the amount in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_607());
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_607().sendKeys(testData.get("Amount"),Keys.TAB);
//		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_607().sendKeys("10000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainAmountInput_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	    
	}

	@And("User_607 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorTab_607());
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorTab_607().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_607 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorTabRow_607());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorTabRow_607());
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_607 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_607());
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_607().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_607 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_607());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_607());
				break;
			} catch (Exception e) {
				
			}
    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}		
	}

	@And("User_607 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_607().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_607());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_607());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}
	
	@And("User_607 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_ok_button_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_607());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_607().click();
	}
	
	@And("User_607 click the save button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainSaveBtn_607());
				break;
			} catch (Exception e) {

			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainSaveBtn_607().click();
				break;
			} catch (Exception e) {
	
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607());
		Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_607().click();
				break;
			} catch (Exception e) {
	
			}
		}	
		
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_607().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
	}

	@And("User_607 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_607());
		for (int i = 0; i <= 700; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_607().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
	}

	@And("User_607 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_607());
		// Un-check the Grace Period Check box
		for (int i = 0; i <= 700; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_607());
				break;
			} catch (Exception e) {
				
			}
		}		
		WebElement gracePeriodCheckbox = Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_607();
     	if(gracePeriodCheckbox.isSelected()) {
     		gracePeriodCheckbox.click();
     	}
     	
     	// create schedule button
     	waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_607());
     	for (int i = 0; i <= 600; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_607().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_607 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainValidateBtn_607());
				break;
			} catch (Exception e) {
				
			}
		}
		for (int i = 0; i <= 600; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_607().click();
				break;
			} catch (Exception e) {
	
			}
		}	    
	}

	String temp="";
	@When("User_607 validate button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainValidateBtn_607());
		for (int i = 0; i <= 500; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealMainValidateBtn_607().click();
				break;
			} catch (Exception e) {
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISApproveMenuConfirmContinuePopup_607());
		for (int i = 0; i < 1000; i++) {
			Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607().click();
			break;
		}
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISApproveMenuConfirmCollateralPopup_607());
		for (int i = 0; i < 1000; i++) {
			Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607().click();
			break;
		}

		
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_InformationPopupTextMsg_607());
		String text = Incidental_Charges_Obj.IIS_InformationPopupTextMsg_607().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = Incidental_Charges_Obj.IIS_InformationPopupTextMsg_607().getText().substring(18, 22);
    	System.err.println("Reference Number: "+dealNbr);   
    	temp = dealNbr;
    	IncidentalCharges.updateTestData(testData.get("Data Set ID"),"Deal No", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_607().click();
				break;
			} catch (Exception e) {
			}
		}		
	}
	
	
	@And ("User_607 Update the value in excel")
	public void User_607_Update_the_value_in_excel() throws Throwable {
		Accrual_Process.updateTestData(testData.get("Data Set ID"),"Deal No", temp);
	}
	
	@Then("User_607 click the Approve menu under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenu_607());
		for (int i = 0; i <= 500; i++) {
			try {
				Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenu_607().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
	public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_607());
//		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_607().sendKeys(testData.get("Deal No"),Keys.ENTER);
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_607().sendKeys(testData.get("Deal No"),Keys.ENTER);
	}

	@And("User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_607());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_607());
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@When("User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_607());
		for (int i = 0; i <= 400; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_607());
				break;
			} catch (Exception e) {
				
			}
		}		
		Incidental_Charges_Obj.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607());
		Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607().click();		
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISApproveMenuConfirmPopupProceed_607());
		Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607().click();
		
//		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISApproveMenuConfirmPopupProceed_607());
//		Incidental_Charges_Obj.IIS_ConfirmPopupOkBtn_607().click();
		  	  
//		Success popup Ok btn
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_607().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Report popup cancel button
		for (int i = 0; i <= 1000; i++) {
			try {
				Incidental_Charges_Obj.IIS_ConfirmPopupCancelBtn_607().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
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
		  if(ammount1.contains(",")) {
			  String str = ammount1.replace(",","");
			  ammount = Double.parseDouble(str);
		      System.out.println(ammount);
		      System.out.println(String.valueOf(ammount+IncidentalCharge));
		  }
		  else {
			  ammount = Double.parseDouble(ammount1);
		      System.out.println(ammount);
		      System.out.println(String.valueOf(ammount+IncidentalCharge));
		}
		  
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
		for (int i = 0; i < 700; i++) {
			try {
				Incidental_Charges_Obj.Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607().click();
			} catch (Exception e) {
			}
			break;
		}
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
	
	//130877
	@And("User_607 click the periodical processing menu in Menu option under iis application menu")
	public void user_click_the_periodical_processing_menu_in_menu_option_under_iis_application_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISperiodicalprocessingmenu_607()); 
		Incidental_Charges_Obj.IISperiodicalprocessingmenu_607().click();
	   		}

	@And("User_607 click the post accruals menu in periodical processing menu under iis application menu")
	public void user_click_the_post_accruals_menu_in_periodical_processing_menu_under_iis_application_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISperiodicalprocessingpostaccruals_607()); 
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccruals_607().click();
	  		}

	@And("User_607 click the final accrual menu in post accrual menu under iis application menu")
	public void user_click_the_final_accrual_menu_in_post_accrual_menu_under_iis_application_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccruals_607()); 
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccruals_607().click();
	}

	@And("User_607 click the specific deal flag checkbox in final accrual under iis application menu")
	public void user_click_the_specific_deal_flag_checkbox_in_final_accrual_under_iis_application_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsspecificdealflagcheckbox_607()); 
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsspecificdealflagcheckbox_607().click();
	}

	@And("User_607 enter the deal number in final accrual under iis application menu")
	public void user_enter_the_deal_number_in_final_accrual_under_iis_application_menu() throws Throwable{
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsdealnumsearchbox_607());
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsdealnumsearchbox_607().sendKeys(testData.get("Deal No"),Keys.TAB);
	
	}

	@And("User_607 enter the from date in final accrual under iis application menu")
	public void user_enter_ther_from_date_in_final_accrual_under_iis_application_menu()throws Throwable{
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_607());
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_607().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_607().sendKeys(testData.get("From date"),Keys.TAB);
	   
	}

	@And("User_607 enter the to date in final accrual under iis application menu")
	public void user_enter_ther_to_date_in_final_accrual_under_iis_application_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualstodate_607());
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualstodate_607().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualstodate_607().sendKeys(testData.get("To date"),Keys.TAB);
	}
	@And("User_607 click the ok button in final accrual under iis application menu")
	public void user_click_the_ok_button_in_final_accrual_under_iis_application_menu() throws Throwable{
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsokbtn_607()); 
		Incidental_Charges_Obj.IISperiodicalprocessingpostaccrualsfinalaccrualsokbtn_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.SuccessFully_Saved_popup_ok_btn_607());
		for (int i = 0; i < 2000; i++) {
			try {
				Incidental_Charges_Obj.SuccessFully_Saved_popup_ok_btn_607().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
//	Calculators module 
	@And("User_607 click the Calculators module in IIS Application")
	public void user_click_the_calculators_module_in_iis_application() {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISCalculatorsModule_607());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Incidental_Charges_Obj.IISCalculatorsModule_607().click();
	}

	@And("User_607 click the Reschedule Calculator With Profit menu under Calculators")
	public void user_click_the_reschedule_calculator_with_profit_menu_under_calculators() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISCalculatorsRescheduleCalculatorWithProfit_607());
		Incidental_Charges_Obj.IISCalculatorsRescheduleCalculatorWithProfit_607().click();
	}

	@And("User_607 enter the Deal number in Reschedule Calculator With Profit menu")
	public void user_enter_the_deal_number_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitDealNbrInput_607());
		Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitDealNbrInput_607().sendKeys(testData.get("Deal No"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitDealNbrInput_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_607 click the Repayment Details panel in Reschedule Calculator With Profit menu")
	public void user_click_the_repayment_details_panel_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitRepaymentDetailsPanel_607());
		for (int i = 0; i <= 500; i++) {
			try {
				Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitRepaymentDetailsPanel_607().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 enter the First Payment After under Repayment Details panel in Reschedule Calculator With Profit menu")
	public void user_enter_the_first_payment_after_under_repayment_details_panel_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_607());
		Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_607().clear();
	//	Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_607().sendKeys(testData.get("First Pay After"),Keys.TAB);
		Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_607().sendKeys(testData.get("First Pay After"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitDealNbrInput_607().getAttribute("prevvalue")
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

	@When("User_607 click the Calculate button in Reschedule Calculator With Profit menu")
	public void user_click_the_calculate_button_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitCalculateBtn_607());	
		for (int i = 0; i <= 500; i++) {
			try {
				Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitCalculateBtn_607().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		// Success Popup OK Btn
		for (int i = 0; i <= 1000; i++) {
			try {
				Incidental_Charges_Obj.IIS_SuccessPopupOkBtn_607().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@When("User_607 click the Update button in Reschedule Calculator With Profit menu")
	public void user_click_the_update_button_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitUpdateBtn_607());	
		for (int i = 0; i <= 300; i++) {
			try {
				Incidental_Charges_Obj.IISRescheduleCalculatorWithProfitUpdateBtn_607().click();
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
				Incidental_Charges_Obj.IIS_SuccessPopupOkBtn_607().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	Reschedule Repayment plan module
	@And("User_607 click the Reschedule Repayment plan module in IIS Application")
	public void user_click_the_reschedule_repayment_plan_module_in_iis_application() {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISRescheduleRepaymentPlanModule_607());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Incidental_Charges_Obj.IISRescheduleRepaymentPlanModule_607().click();	    
	}

	@And("User_607 click the Approve menu under Reschedule Repayment plan")
	public void user_click_the_approve_menu_under_reschedule_repayment_plan() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveMenu_607()); 
		Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveMenu_607().click();
	}

	@And("User_607 search the Deal number in approve menu under Reschedule Repayment plan")
	public void user_search_the_deal_number_in_approve_menu_under_reschedule_repayment_plan() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveSearchgridDealInput_607());
		Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveSearchgridDealInput_607().sendKeys(testData.get("Deal No"),Keys.ENTER);
	}

	@And("User_607 double click the searchgird row in approve menu under Reschedule Repayment plan")
	public void user_double_click_the_searchgird_row_in_approve_menu_under_reschedule_repayment_plan() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveSearchgridRow_607());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveSearchgridRow_607());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveMenuDealNbr_607().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_607 click the Approve button in approve menu under Reschedule Repayment plan")
	public void user_click_the_approve_button_in_approve_menu_under_reschedule_repayment_plan() {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveMenuApproveBtn_607());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Incidental_Charges_Obj.IISRescheduleRepaymentPlanApproveMenuApproveBtn_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_WarningPopupOkBtn_607());
		Incidental_Charges_Obj.IIS_WarningPopupOkBtn_607().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				Incidental_Charges_Obj.IIS_InformationPopupOkBtn_607().click();
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
				Incidental_Charges_Obj.IIS_ConfirmPopupCancelBtn_607().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	//1376676
	
	@Given("User_607 Tenure days In mainteance Under investment deal without trade deal menu")
	public void user_tenure_days_in_mainteance_under_investment_deal_without_trade_deal_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Tenure_dateIn_mainteance_Under_investment_deal_without_trade_deal_menu_607());
		clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.Tenure_dateIn_mainteance_Under_investment_deal_without_trade_deal_menu_607());
		Incidental_Charges_Obj.Tenure_dateIn_mainteance_Under_investment_deal_without_trade_deal_menu_607().sendKeys("3",Keys.TAB);
	  
	}

	@Given("User_607 Tenure month In mainteance Under investment deal without trade deal menu")
	public void user_tenure_month_in_mainteance_under_investment_deal_without_trade_deal_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.Tenure_monthIn_mainteance_Under_investment_deal_without_trade_deal_menu_607());
		DropDownHelper.SelectUsingVisibleText(Incidental_Charges_Obj.Tenure_monthIn_mainteance_Under_investment_deal_without_trade_deal_menu_607(), "Months");
	    
	}
	
	@Given("User_607 Number Of Payments In Repayment Plan in mainteance Under investment deal without trade deal menu")
	public void user_number_of_payments_in_repayment_plan_in_mainteance_under_investment_deal_without_trade_deal_menu() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.No_Of_Payments_InRepaymentPlan_In_mainteance_Under_investment_deal_without_trade_deal_menu_607());
		clicksAndActionsHelper.doubleClick(Incidental_Charges_Obj.No_Of_Payments_InRepaymentPlan_In_mainteance_Under_investment_deal_without_trade_deal_menu_607());
		Incidental_Charges_Obj.No_Of_Payments_InRepaymentPlan_In_mainteance_Under_investment_deal_without_trade_deal_menu_607().sendKeys("3",Keys.TAB);
	}
	
	@Given("User_607 Click Cancel on report generated")
	public void click_cancel_on_report_generated() {
		waitHelper.waitForElementwithFluentwait(driver, Incidental_Charges_Obj.IIS_ConfirmPopupCancelBtn_607());
		Incidental_Charges_Obj.IIS_ConfirmPopupCancelBtn_607().click();
		
	}
	
}
