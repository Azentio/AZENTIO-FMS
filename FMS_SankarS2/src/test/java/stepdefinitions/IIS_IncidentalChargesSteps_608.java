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
import pageobjects.iisParam.IncidentalChargesObj_608;
import resources.BaseClass;

public class IIS_IncidentalChargesSteps_608 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	
	IncidentalChargesObj_608 incidentalChargesObj608 = new IncidentalChargesObj_608(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData  = new ExcelData(path,"IncidentalChargesTestData","DataSet ID");
	
	Map<String, String> testData;
	
//	@AT_IC_010
	@And("^User_608 get the test data for test case AT_IC_010$")
    public void get_the_test_data_for_test_case_AT_IC_010() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_AT_IC_010");
    }
	
//	@Test
	@And("^User_608 get the test data for test case$")
    public void get_the_test_data_for_test_case() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_Test");
    }
	
	
	
	
	// Clear cache step
	@And("User_608 clear the caches in IIS Application")
	public void user_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISCoreTechDetailsIcon_608());
		incidentalChargesObj608.IISCoreTechDetailsIcon_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISCoreClearCacheBtn_608());
		incidentalChargesObj608.IISCoreClearCacheBtn_608().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
				incidentalChargesObj608.IIS_SuccessPopupOkBtn_608().click();
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
				javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMenu_608());
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMenu_608().click();
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
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMaintenanceMenu_608());
		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMaintenanceMenu_608().click();
	}

	@And("User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608());
		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys(testData.get("Party Value"),Keys.TAB);
//		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys("727",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
		for (int i = 0; i < 1000; i++) {
			try {
				incidentalChargesObj608.IIS_ConfirmPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608());
		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys(testData.get("Charge Code"),Keys.TAB);
//		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys("3",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}

	@And("User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608());
		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys(testData.get("Product Class"),Keys.TAB);
//		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys("100",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608());
		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys(testData.get("Amount"),Keys.TAB);
//		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys("10000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	    
	}

	@And("User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorTab_608());
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorTab_608().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorTabRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorTabRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608());
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_608().getAttribute("prevvalue").isBlank())) {
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
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_608().getAttribute("prevvalue").isBlank())) {
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
				javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608().click();
	}
	
	@And("User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainSaveBtn_608());
				break;
			} catch (Exception e) {

			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainSaveBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_ConfirmPopupOkBtn_608());
		incidentalChargesObj608.IIS_ConfirmPopupOkBtn_608().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				incidentalChargesObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}		
	    
	}

	@And("User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
	}

	@And("User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_608());
		// Un-check the Grace Period Check box
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608());
				break;
			} catch (Exception e) {
				
			}
		}		
		WebElement gracePeriodCheckbox = incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608();
     	if(gracePeriodCheckbox.isSelected()) {
     		gracePeriodCheckbox.click();
     	}
     	
     	// create schedule button
     	waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608());
     	for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
				break;
			} catch (Exception e) {
				
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_608().click();
				break;
			} catch (Exception e) {
	
			}
		}	    
	}

	@When("User_608 validate button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_ConfirmPopupOkBtn_608());
		incidentalChargesObj608.IIS_ConfirmPopupOkBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_InformationPopupTitle_608());
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_InformationPopupTextMsg_608());
		String text = incidentalChargesObj608.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = incidentalChargesObj608.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Reference Number: "+dealNbr);    	
    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				incidentalChargesObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}		
	    
	}
	
	@Then("User_608 click the Approve menu under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenu_608());
		for (int i = 0; i <= 500; i++) {
			try {
				incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenu_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
	public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608());
		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
//		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys("5317",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@When("User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_608());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				
			}
		}		
		incidentalChargesObj608.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_ConfirmPopupOkBtn_608());
		incidentalChargesObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		for (int i = 0; i <= 1000; i++) {
			try {
				incidentalChargesObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		  	    	
		for (int i = 0; i <= 2000; i++) {
			try {
				incidentalChargesObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
		for (int i = 0; i <= 1000; i++) {
			try {
				incidentalChargesObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
	
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@AT_IC_010
	@And("User_608 click the Tracking & Incidental Charges module")
	public void user_click_the_tracking_incidental_charges_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISTrackingIncidentalChargesMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISTrackingIncidentalChargesMenu_608());
		incidentalChargesObj608.IISTrackingIncidentalChargesMenu_608().click();
	}

	@And("User_608 click the Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISTrackingIncidentalChargesReverseMenu_608());
		incidentalChargesObj608.IISTrackingIncidentalChargesReverseMenu_608().click();
	}

	@And("User_608 enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges")
	public void user_enter_the_track_number_in_searchgrid_under_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_608());
		incidentalChargesObj608.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_608().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_608 double click the searchgrid row in Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISIncidentalChargesReverseMenuSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj608.IISIncidentalChargesReverseMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}	    
	}

	@When("User_608 click the Reverse button in Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISIncidentalChargesReverseMenuTrackNbr_608());
	    for(int i = 0; i<= 300; i++) {
	    	try {
	    		javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISIncidentalChargesReverseMenuReverseBtn_608());
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    incidentalChargesObj608.IISIncidentalChargesReverseMenuReverseBtn_608().click();
	    
	    // Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_WarningPopupOkBtn_608());
	    incidentalChargesObj608.IIS_WarningPopupOkBtn_608().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_InformationPopupOkBtn_608());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		incidentalChargesObj608.IIS_InformationPopupOkBtn_608().click();
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    
	}

	@And("User_608 click the Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISTrackingIncidentalChargesApproveReverseMenu_608());
		incidentalChargesObj608.IISTrackingIncidentalChargesApproveReverseMenu_608().click();
	}

	@And("User_608 enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges")
	public void user_enter_the_track_number_in_searchgrid_under_approve_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_608());
		incidentalChargesObj608.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_608().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_608 double click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISIncidentalChargesApproveReverseSearchgridRow_608());
	    for(int i = 0; i <=300; i++) {
	    	try {
				clicksAndActionsHelper.doubleClick(incidentalChargesObj608.IISIncidentalChargesApproveReverseSearchgridRow_608());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	}

	@When("User_608 click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IISIncidentalChargesApproveReverseTrackNbr_608());
		for(int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(incidentalChargesObj608.IISIncidentalChargesApproveReverseMenuReverseBtn_608());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		incidentalChargesObj608.IISIncidentalChargesApproveReverseMenuReverseBtn_608().click();
		
		// Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_WarningPopupOkBtn_608());
	    incidentalChargesObj608.IIS_WarningPopupOkBtn_608().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, incidentalChargesObj608.IIS_InformationPopupOkBtn_608());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		incidentalChargesObj608.IIS_InformationPopupOkBtn_608().click();
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	}
	
	
	
	
	
	
	
	
	
}
