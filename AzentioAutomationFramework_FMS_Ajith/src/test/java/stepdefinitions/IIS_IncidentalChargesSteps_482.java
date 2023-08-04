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
import pageobjects.iisParam.IncidentalChargesObj_482;
import resources.BaseClass;

public class IIS_IncidentalChargesSteps_482 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	
	IncidentalChargesObj_482 incidentalChargesObj = new IncidentalChargesObj_482(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData  = new ExcelData(path,"IncidentalChargesTestData","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	
	Map<String, String> testData;
	
//	@AT_IC_010
	@And("^User_482 get the test data for test case AT_IC_010$")
    public void get_the_test_data_for_test_case_AT_IC_010() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_AT_IC_010");
    }
	
//	@Test
	@And("^User_482 get the test data for test case$")
    public void get_the_test_data_for_test_case() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_Test");
    }
	
	@And("User_482 get the test data for test case AT_IC_019")
	public void user_482_get_the_test_data_for_test_case_at_ic_019() {
		testExecutionData = testExecution.getTestdata("AT_IC_019");
		testData = iisIncidentalChargesExcelData.getTestdata(testExecutionData.get("Data Set ID"));
	}
	
	
	
	// Clear cache step
	@And("User_482 clear the caches in IIS Application")
	public void user_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISCoreTechDetailsIcon_482());
		incidentalChargesObj.IISCoreTechDetailsIcon_482().click();
		
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISCoreClearCacheBtn_482());
		incidentalChargesObj.IISCoreClearCacheBtn_482().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
				incidentalChargesObj.IIS_SuccessPopupOkBtn_482().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	Investment Deals Combined without Trade Deal
	@And("User_482 click the Investment Deals Combined without Trade Deal menu")
	public void user_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMenu_482());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMenu_482());
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMenu_482().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_482 click the Maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMaintenanceMenu_482());
		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMaintenanceMenu_482().click();
	}
	
	@And("User_482 enter the Party in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainPartyInput_482());
		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainPartyInput_482().sendKeys(testData.get("Party Value"),Keys.TAB);
//		incidentalChargesObj482.IISInvestmentDealWithoutTradeDealMainPartyInput_482().sendKeys("727",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainPartyInput_482().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				
			}
    	}
		
		
	}
	@And("User_482 Click Confirmation Ok For Black listed CIF Validation")
	public void user_482__click_confirmation_ok_for_black_listed_cif_validation() {
		for (int i = 0; i < 1000; i++) {
			try {
				incidentalChargesObj.IIS_ConfirmPopupYesBtn_482().click();
		    	break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("User_482 enter the category in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainCategoryInput_482());
		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainCategoryInput_482().sendKeys(testData.get("Charge Code"),Keys.TAB);
//		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainCategoryInput_482().sendKeys("3",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainCategoryInput_482().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}

	@And("User_482 enter the product class in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainProductClassInput_482());
		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainProductClassInput_482().sendKeys(testData.get("Product Class"),Keys.TAB);
//		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainProductClassInput_482().sendKeys("100",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainProductClassInput_482().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("User_482 enter the amount in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainAmountInput_482());
		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainAmountInput_482().sendKeys(testData.get("Amount"),Keys.TAB);
//		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainAmountInput_482().sendKeys("10000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainAmountInput_482().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	    
	}

	@And("User_482 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorTab_482());
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorTab_482().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_482 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorTabRow_482());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorTabRow_482());
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_482 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_482());
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_482().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_482 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_482());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_482());
				break;
			} catch (Exception e) {
				
			}
    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_482().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}		
	}

	@And("User_482 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_482().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_482());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_482());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_482().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}
	
	@And("User_482 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_ok_button_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_482());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_482().click();
	}
	
	@And("User_482 click the save button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainSaveBtn_482());
//				break;
//			} catch (Exception e) {
//
//			}
//		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainSaveBtn_482().click();
				break;
			} catch (Exception e) {
	
			}
		}
		
		
		
		
	    
	}
	@And("User_482 click Confirmation yes")
	public void user_482_click_confirmation_yes() {
		for (int i = 0; i <2000; i++) {
			try {
				incidentalChargesObj.IIS_ConfirmPopupYesBtn_482().click();
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		
	}
	@And("User_482 click Information ok deal saved")
	public void user_482_click_information_ok_deal_saved() {
		for (int i = 0; i <= 2000; i++) {
			try {
				incidentalChargesObj.IIS_InformationPopupOkBtn_482().click();
				break;
			} catch (Exception e) {
				try {
					incidentalChargesObj.IIS_InformationPopupOkBtn_482().click();
				} catch (Exception e2) {
					
				}
				
			}
		}		
	}
	
	

	@And("User_482 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_482().click();
				break;
			} catch (Exception e) {
				if (i==500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_482 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_482());
		// Un-check the Grace Period Check box
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_482());
//				break;
//			} catch (Exception e) {
//				
//			}
//		}	
		
		
     	
     	// create schedule button
     	waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_482());
     	for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_482().click();
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}
	@And("User_482 uncheck Grace period compunding Checkbox in Investment Deals Combined without Trade Deal")
	public void user_482_uncheck_grace_period_compunding_checkbox_in_investment_deals_combined_without_trade_deal() {
		WebElement gracePeriodCheckbox = incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_482();
		waitHelper.waitForElementwithFluentwait(driver, gracePeriodCheckbox);
     	if(gracePeriodCheckbox.isSelected()) {
     		gracePeriodCheckbox.click();
     	}
	}

	@And("User_482 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainValidateBtn_482());
//				break;
//			} catch (Exception e) {
//				
//			}
//		}
		for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_482().click();
				break;
			} catch (Exception e) {
				if (i==500) {
					Assert.fail(e.getMessage());
				}
				
			}
		}	    
	}

	@When("User_482 validate button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainValidateBtn_482());
		for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealMainValidateBtn_482().click();
				break;
			} catch (Exception e) {
				if (i==500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	@And("User_482 Store Deal Created")
	public void user_482_store_deal_created() {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IIS_InformationPopupTextMsg_482());
		String text = incidentalChargesObj.IIS_InformationPopupTextMsg_482().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = incidentalChargesObj.IIS_InformationPopupTextMsg_482().getText().substring(18, 22);
    	System.err.println("Reference Number: "+dealNbr);    	
    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				incidentalChargesObj.IIS_InformationPopupOkBtn_482().click();
				break;
			} catch (Exception e) {
	
			}
		}		
	}
	
	@Then("User_482 click the Approve menu under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenu_482());
		for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenu_482().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_482 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
	public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_482());
		incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_482().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
		
//		incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_482().sendKeys("5317",Keys.ENTER);
	}

	@And("User_482 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_482());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_482());
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@When("User_482 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_482());		
		incidentalChargesObj.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_482().click();

		
	}

	
//	@AT_IC_010
	@And("User_482 click the Tracking & Incidental Charges module")
	public void user_click_the_tracking_incidental_charges_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj.IISTrackingIncidentalChargesMenu_482());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISTrackingIncidentalChargesMenu_482());
		incidentalChargesObj.IISTrackingIncidentalChargesMenu_482().click();
	}

	@And("User_482 click the Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISTrackingIncidentalChargesReverseMenu_482());
		incidentalChargesObj.IISTrackingIncidentalChargesReverseMenu_482().click();
	}

	@And("User_482 enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges")
	public void user_enter_the_track_number_in_searchgrid_under_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_482());
		incidentalChargesObj.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_482().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_482 double click the searchgrid row in Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISIncidentalChargesReverseMenuSearchgridRow_482());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj.IISIncidentalChargesReverseMenuSearchgridRow_482());
				break;
			} catch (Exception e) {
				
			}
    	}	    
	}

	@When("User_482 click the Reverse button in Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISIncidentalChargesReverseMenuTrackNbr_482());
	    for(int i = 0; i<= 300; i++) {
	    	try {
	    		javaScriptHelper.scrollIntoView(incidentalChargesObj.IISIncidentalChargesReverseMenuReverseBtn_482());
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    incidentalChargesObj.IISIncidentalChargesReverseMenuReverseBtn_482().click();
	    
	    // Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IIS_WarningPopupOkBtn_482());
	    incidentalChargesObj.IIS_WarningPopupOkBtn_482().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IIS_InformationPopupOkBtn_482());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		incidentalChargesObj.IIS_InformationPopupOkBtn_482().click();
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    
	}

	@And("User_482 click the Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISTrackingIncidentalChargesApproveReverseMenu_482());
		incidentalChargesObj.IISTrackingIncidentalChargesApproveReverseMenu_482().click();
	}

	@And("User_482 enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges")
	public void user_enter_the_track_number_in_searchgrid_under_approve_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_482());
		incidentalChargesObj.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_482().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_482 double click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISIncidentalChargesApproveReverseSearchgridRow_482());
	    for(int i = 0; i <=300; i++) {
	    	try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj.IISIncidentalChargesApproveReverseSearchgridRow_482());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	}

	@When("User_482 click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IISIncidentalChargesApproveReverseTrackNbr_482());
		for(int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj.IISIncidentalChargesApproveReverseMenuReverseBtn_482());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		incidentalChargesObj.IISIncidentalChargesApproveReverseMenuReverseBtn_482().click();
		
		// Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IIS_WarningPopupOkBtn_482());
	    incidentalChargesObj.IIS_WarningPopupOkBtn_482().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj.IIS_InformationPopupOkBtn_482());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		incidentalChargesObj.IIS_InformationPopupOkBtn_482().click();
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	}
	@And("User_482 Click Cancel in Pop up message")
	public void user_482_click_cancel_in_pop_up_message() {
		for (int i = 0; i <=200; i++) {
			try {
				incidentalChargesObj.IIS_ConfirmPopupCancelBtn_482().click();
				break;
			} catch (Exception e) {
				
			}
		}
	}
	
	
	

	

	@And("User_482 Click Maintenance Screen Under Tracking and Incidental Charges Sub Menu")
	public void user_click_maintenance_screen_under_tracking_and_incidental_charges_sub_menu() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen());
	    
	}

	@And("User_482 User Search Deal Number in Tracking and Incidental Charges Maintenance Screen")
	public void user_user_search_deal_number_in_tracking_and_incidental_charges_maintenance_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_DealNo());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_DealNo());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_DealNo());
		incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_DealNo().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
	}

	@And("User_482 Search Code In Charge Code under Tracking and Incidental Charges Maintenance Screen")
	public void user_search_code_in_charge_code_under_tracking_and_incidental_charges_maintenance_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_ChargesCode());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_ChargesCode());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_ChargesCode());
		incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_ChargesCode().sendKeys(testData.get("Charge Code"),Keys.TAB);
	    
	}

	@And("User_482 Click Save Button in Tracking and Incidental Charges")
	public void user_click_save_button_in_tracking_and_incidental_charges() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_SaveButton());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_SaveButton());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_trackingIncidentalCharges_MaintenanceScreen_SaveButton());
	    
	}

	@And("User_482 click Confirmation ok in Pop Up")
	public void user_click_confirmation_ok_in_pop_up() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
	    
	}

	@And("User_482 Click Confirmation Yes In Amount exceeds Amount available Warning")
	public void user_click_confirmation_yes_in_amount_exceeds_amount_available_warning() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
	    
	}

	@And("User_482 Click Information ok in Transaction saved successfully")
	public void user_click_information_ok_in_transaction_saved_successfully() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
	    
	}

	@And("User_482 Click Approve Screen In Tracking and Incidental Charges")
	public void user_click_approve_screen_in_tracking_and_incidental_charges() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_trackingIncidentalCharges_ApproveScreen_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_trackingIncidentalCharges_ApproveScreen_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_trackingIncidentalCharges_ApproveScreen_482());
	    
	}

	@And("User_482 Search deal Serial No In Tracking and Incidental Charges")
	public void user_search_deal_serial_no_in_tracking_and_incidental_charges() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.searchCodeApproveScreen_TrackingAndIncidentalCharges());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.searchCodeApproveScreen_TrackingAndIncidentalCharges());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.searchCodeApproveScreen_TrackingAndIncidentalCharges());
		incidentalChargesObj.searchCodeApproveScreen_TrackingAndIncidentalCharges().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
	    
	}

	@And("User_482 Select the searched Deal no In Tracking and Incidental Charges")
	public void user_select_the_searched_deal_no_in_tracking_and_incidental_charges() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.selectSearchedCodeApproveScreen_TrackingAndIncidentalCharges());
		selenium_Actions.getClickAndActionsHelper().doubleClick(incidentalChargesObj.selectSearchedCodeApproveScreen_TrackingAndIncidentalCharges());
	    
	}

	@And("User_482 Click Approve button in Tracking and Incidental Charges")
	public void user_click_approve_button_in_tracking_and_incidental_charges() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.approveButtonApproveScreen_TrackingAndIncidentalCharges());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.approveButtonApproveScreen_TrackingAndIncidentalCharges());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.approveButtonApproveScreen_TrackingAndIncidentalCharges());
	    
	}

	@And("User_482 Click Settlement Screen")
	public void user_click_settlement_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_SettlementSection_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_SettlementSection_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_SettlementSection_482());
	    
	}

	@And("User_482 Click Maintenance Screen in Settlement Screen")
	public void user_click_maintenance_screen_in_settlement_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Maintenance_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Maintenance_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Maintenance_482());
	    
	}

	@And("User_482 Click Schedule details")
	public void user_click_schedule_details() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Maintenance_SheduleDetailsTab_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Maintenance_SheduleDetailsTab_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Maintenance_SheduleDetailsTab_482());
	    
	}

	@And("User_482 Get the first Installment amount")
	public void user_get_the_first_installment_amount() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_GetFirstSettlementAmount_482());
		String amount = incidentalChargesObj.IIS_Settlement_GetFirstSettlementAmount_482().getText();
		iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"), "FirstSettlement", amount);
	    
	}
	@And("User_482 Click Automatic Allocation Button")
	public void user_482_click_automatic_allocation_button() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Maintenance_AutomaticAollacationButton_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Maintenance_AutomaticAollacationButton_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Maintenance_AutomaticAollacationButton_482());
	}

	@And("User_482 Click Settlement Details In Settlement Screen")
	public void user_click_settlement_details_in_settlement_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Maintenance_SheduleDetailsTab_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Maintenance_SheduleDetailsTab_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Maintenance_SheduleDetailsTab_482());
	    
	}

	@And("User_482 Enter Amount Received From Party")
	public void user_enter_amount_received_from_party() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Maintenance_AmountReceivedFromPartyField_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Maintenance_AmountReceivedFromPartyField_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Maintenance_AmountReceivedFromPartyField_482());
		incidentalChargesObj.IIS_Settlement_Maintenance_AmountReceivedFromPartyField_482().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
	    
	}

	@And("User_482 Enter the first Installment in Schedule details to settlemet")
	public void user_enter_the_first_installment_in_schedule_details_to_settlemet() {
	    
	    
	}

	@And("User_482 Click Save button in settlement Screen")
	public void user_click_save_button_in_settlement_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Maintenance_SaveButton_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Maintenance_SaveButton_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Maintenance_SaveButton_482());
	    
	}

	@And("User_482 Click Ok Button for success pop up")
	public void user_click_ok_button_for_success_pop_up() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_SuccessPopupOkBtn_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_SuccessPopupOkBtn_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_SuccessPopupOkBtn_482());
	    
	}

	@And("User_482 Click Approve Screen In Settlement Screen")
	public void user_click_approve_screen_in_settlement_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_SuccessPopupOkBtn_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_SuccessPopupOkBtn_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_SuccessPopupOkBtn_482());
	    
	}

	@And("User_482 Search Deal Number In Approve Settlement Screen")
	public void user_search_deal_number_in_approve_settlement_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Approve_DealNbrSearchField_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Approve_DealNbrSearchField_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Approve_DealNbrSearchField_482());
		incidentalChargesObj.IIS_Settlement_Approve_DealNbrSearchField_482().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	    
	}

	@And("User_482 Select Searched Deal Number no In Approve Settlement Screen")
	public void user_select_searched_deal_number_no_in_approve_settlement_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_CombinedWithoutTradeDeal_FirstRecord_482());
		selenium_Actions.getClickAndActionsHelper().doubleClick(incidentalChargesObj.IIS_CombinedWithoutTradeDeal_FirstRecord_482());
	    
	}

	@And("User_482 Click approve button in Settlement Approve Screen")
	public void user_click_approve_button_in_settlement_approve_screen() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Approve_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Approve_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Approve_482());
	    
	}

	@And("User_482 click Confirmation Yes in Pop Up")
	public void user_click_confirmation_yes_in_pop_up() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_ConfirmPopupYesBtn_482());
	    
	}

	@And("User_482 Click search icon In Maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_search_icon_in_maintenance_under_investment_deals_combined_without_trade_deal() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_CombinedWithoutTradeDeal_SearchButton_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_CombinedWithoutTradeDeal_SearchButton_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_CombinedWithoutTradeDeal_SearchButton_482());
	    
	}

	@And("User_482 Search settlemet number In Maintenance under Investment Deals Combined without Trade Deal")
	public void user_search_settlemet_number_in_maintenance_under_investment_deals_combined_without_trade_deal() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_Settlement_Maintenance_DealNbrField_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_Settlement_Maintenance_DealNbrField_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_Settlement_Maintenance_DealNbrField_482());
		incidentalChargesObj.IIS_Settlement_Maintenance_DealNbrField_482().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	    
	}

	@And("User_482 Select settlemet number no In Maintenance under Investment Deals Combined without Trade Deal")
	public void user_select_settlemet_number_no_in_maintenance_under_investment_deals_combined_without_trade_deal() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_CombinedWithoutTradeDeal_FirstRecord_482());
		selenium_Actions.getClickAndActionsHelper().doubleClick(incidentalChargesObj.IIS_CombinedWithoutTradeDeal_FirstRecord_482());
	    
	    
	}

	@And("User_482 Click Payment Instructions In Selected Deal")
	public void user_click_payment_instructions_in_selected_deal() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton_482());
	    
	}

	@And("User_482 Click Journal Voucher Details In Payment Instructions")
	public void user_click_journal_voucher_details_in_payment_instructions() {
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,incidentalChargesObj.IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails_482());
		selenium_Actions.getClickAndActionsHelper().moveToElement(incidentalChargesObj.IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails_482());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(incidentalChargesObj.IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails_482());
	    
	}

	@And("User_482 Verify the Immediate payment for Incidental Charges")
	public void user_verify_the_immediate_payment_for_incidental_charges() {
	    
	    
	}
	
	
	
	
	
	
}
