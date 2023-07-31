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
import pageobjects.iisParam.IIS_ApplicationObj_608;
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
	
	IIS_ApplicationObj_608 IISApplicationObj608 = new IIS_ApplicationObj_608(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData  = new ExcelData(path,"IncidentalChargesTestData","DataSet ID");
	ExcelData iisAccrualDealExcelData  = new ExcelData(path,"AccrualDealTestData","DataSet ID");
	
	Map<String, String> testData;
	
//	@AT_IC_010
	@And("^User_608 get the test data for test case AT_IC_010$")
    public void get_the_test_data_for_test_case_AT_IC_010() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_AT_IC_010");
    }
		
//	@AT_IC_022
	@And("^User_608 get the test data for test case AT_IC_022$")
    public void get_the_test_data_for_test_case_AT_IC_022() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_AT_IC_022");
    }
	
	
//	Accrual Deal Feature
//	@AT_AD_003
	@And("^User_608 get the test data for test case AT_AD_003$")
    public void get_the_test_data_for_test_case_AT_AD_003() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_003");
    }
	
//	AT_AD_015
	@And("^User_608 get the test data for test case AT_AD_015$")
    public void get_the_test_data_for_test_case_AT_AD_015() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_015");
    }
	
//	AT_AD_018
	@And("^User_608 get the test data for test case AT_AD_018$")
    public void get_the_test_data_for_test_case_AT_AD_018() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_018");
    }
	
	
	
	
	// Clear cache step
	@And("User_608 clear the caches in IIS Application")
	public void user_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCoreTechDetailsIcon_608());
		IISApplicationObj608.IISCoreTechDetailsIcon_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCoreClearCacheBtn_608());
		IISApplicationObj608.IISCoreClearCacheBtn_608().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	

//	@AT_IC_010
	@And("User_608 click the Tracking & Incidental Charges module")
	public void user_click_the_tracking_incidental_charges_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISTrackingIncidentalChargesMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMenu_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMenu_608().click();
	}

	@And("User_608 click the Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesReverseMenu_608());
		IISApplicationObj608.IISTrackingIncidentalChargesReverseMenu_608().click();
	}

	@And("User_608 enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges")
	public void user_enter_the_track_number_in_searchgrid_under_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_608());
		IISApplicationObj608.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_608().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_608 double click the searchgrid row in Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesReverseMenuSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISIncidentalChargesReverseMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}	    
	}

	@When("User_608 click the Reverse button in Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesReverseMenuTrackNbr_608());
	    for(int i = 0; i<= 300; i++) {
	    	try {
	    		javaScriptHelper.scrollIntoView(IISApplicationObj608.IISIncidentalChargesReverseMenuReverseBtn_608());
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    IISApplicationObj608.IISIncidentalChargesReverseMenuReverseBtn_608().click();
	    
	    // Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
	    IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupOkBtn_608());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    
	}

	@And("User_608 click the Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveReverseMenu_608());
		IISApplicationObj608.IISTrackingIncidentalChargesApproveReverseMenu_608().click();
	}

	@And("User_608 enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges")
	public void user_enter_the_track_number_in_searchgrid_under_approve_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_608());
		IISApplicationObj608.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_608().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_608 double click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesApproveReverseSearchgridRow_608());
	    for(int i = 0; i <=300; i++) {
	    	try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISIncidentalChargesApproveReverseSearchgridRow_608());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	}

	@When("User_608 click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesApproveReverseTrackNbr_608());
		for(int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISIncidentalChargesApproveReverseMenuReverseBtn_608());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		IISApplicationObj608.IISIncidentalChargesApproveReverseMenuReverseBtn_608().click();
		
		// Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
	    IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupOkBtn_608());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	}
	
	
//	@AT_IC_022
	@And("User_608 click the Maintenance menu under Tracking & Incidental Charges")
	public void user_click_the_maintenance_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceMenu_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceMenu_608().click();
	}

	@And("User_608 enter the Deal number in Maintenance under Tracking & Incidental Charges")
	public void user_enter_the_deal_number_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDealNbrInput_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDealNbrInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}	    
	}

	@And("User_608 enter the Charges code in Maintenance under Tracking & Incidental Charges")
	public void user_enter_the_charges_code_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargesCodeInput_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargesCodeInput_608().sendKeys(testData.get("Charges Code"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargesCodeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}	    
	}

	@And("User_608 select the Charge allocation criteria in Maintenance under Tracking & Incidental Charges")
	public void user_select_the_charge_allocation_criteria_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargeAllocationDropdown_608());
		dropDownHelper.SelectUsingVisibleText(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargeAllocationDropdown_608(), testData.get("Charge Allocation DD"));	    
	}

	@And("User_608 select the Dr Account in Maintenance under Tracking & Incidental Charges")
	public void user_select_the_dr_account_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountLookup_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountLookup_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountLookupRow_608());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountLookupRow_608());
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
	    }		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_608 click the Save button in Maintenance under Tracking & Incidental Charges")
	public void user_click_the_save_button_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceSaveBtn_608());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceSaveBtn_608().click();
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
	    }
		
		// Warning popup
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
		
		// Success popup
		for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
	    		break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	@And("User_608 click the Approve menu under Tracking & Incidental Charges")
	public void user_click_the_approve_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveMenu_608());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj608.IISTrackingIncidentalChargesApproveMenu_608().click();
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search Deal number in Approve menu under Tracking & Incidental Charges")
	public void user_search_deal_number_in_approve_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuSearchgridDealNbrInput_608());
		IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_tracking_incidental_charges() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuSearchgridRow_608());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuSearchgridRow_608());
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuDealNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}

	@When("User_608 click the Approve button in Approve menu under Tracking & Incidental Charges")
	public void user_click_the_approve_button_in_approve_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuApproveBtn_608());
		IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuApproveBtn_608().click();
		
		// Warning popup
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
				
		// Success popup
		for(int i = 0; i <= 2000; i++) {
			try {
			   IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
			   break;
			} catch (Exception e) {
				if (i == 2000) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	// Repayment plan
	@And("User_608 click the Repayment plan module in IIS Application")
	public void user_click_the_repayment_plan_module_in_iis_application() throws Throwable {
		for(int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISRepaymentPlanModule_608());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		for(int i = 0; i <= 500; i++) {
			try {
			   IISApplicationObj608.IISRepaymentPlanModule_608().click();
			   break;
			} catch (Exception e) {
				if (i == 500) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the maintenance menu under Repayment plan")
	public void user_click_the_maintenance_menu_under_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenance_608());
		IISApplicationObj608.IISRepaymentPlanMaintenance_608().click();
	}

	@And("User_608 click the search button in maintenance under Repayment plan")
	public void user_click_the_search_button_in_maintenance_under_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceSearchBtn_608());
		for(int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISRepaymentPlanMaintenanceSearchBtn_608().click();
			   break;
			} catch (Exception e) {
				if (i == 500) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the Deal number in searchgrid under maintenance in Repayment plan")
	public void user_search_the_deal_number_in_searchgrid_under_maintenance_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceSearchgridDealNbrInput_608());
		IISApplicationObj608.IISRepaymentPlanMaintenanceSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row under maintenance in Repayment plan")
	public void user_double_click_the_searchgrid_row_under_maintenance_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceSearchgridRow_608());
		for(int i = 0; i <= 500; i++) {
			try {
			   clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISRepaymentPlanMaintenanceSearchgridRow_608());
			   break;
			} catch (Exception e) {
				if (i == 500) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Schedule details tab in maintenance under Repayment plan")
	public void user_click_the_schedule_details_tab_in_maintenance_under_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsTab_608());
		for(int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsTab_608().click();
			   break;
			} catch (Exception e) {
				if (i == 500) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_608 validate the incidental charges field showing hyperlink in maintenance under Repayment plan")
	public void user_validate_the_incidental_charges_field_showing_hyperlink_in_maintenance_under_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsRow_608());
		clicksAndActionsHelper.moveToElement(IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsRowIncidentalCharge_608());
		boolean incidentalCharge = IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsRowIncidentalCharge_608().isDisplayed();
		Assert.assertTrue(incidentalCharge);
	}

	
//	@AT_AD_003 - Accrual Deal Feature
//	Investment Deals Combined without Trade Deal
	@And("User_608 click the Investment Deals Combined without Trade Deal menu")
	public void user_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMenu_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMenu_608().click();
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
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMaintenanceMenu_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMaintenanceMenu_608().click();
	}

	@And("User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys(testData.get("Party Value"),Keys.TAB);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys("727",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
		for (int i = 0; i < 1000; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys(testData.get("Category Code"),Keys.TAB);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys("3",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}

	@And("User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys(testData.get("Product Class"),Keys.TAB);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys("100",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainDealCYnput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys(testData.get("Amount"),Keys.TAB);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys("10000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	    
	}
	
	@And("User_608 enter the yield details Margin value in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_yield_details_margin_value_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_608().sendKeys(testData.get("Yield Margin"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}


	@And("User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorTab_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorTab_608().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorTabRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorTabRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
	}

	@And("User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}
	
	@And("User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_ok_button_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608().click();
	}
	
	@And("User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainSaveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainSaveBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	    
	}

	@And("User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	    
	}
	
	@And("User_608 enter the No of Payments in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_enter_the_no_of_payments_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_608().clear();
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_608().sendKeys(testData.get("No of Payments"),Keys.TAB);
//		Cannot proceed popup
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_608().getAttribute("prevvalue").equals(testData.get("No of Payments")))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	
	
	@And("User_608 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_uncheck_the_compounding_grace_period_check_box_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement gracePeriodCheckbox = IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608();
     	if(gracePeriodCheckbox.isSelected()) {
     		gracePeriodCheckbox.click();
     	}
	}
	@And("User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {    	
     	// create schedule button
     	waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608());
     	for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
     	
     	for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
     	
	}

	
	@And("User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable_608());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@When("User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Incidental Charges")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTitle_608());
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTextMsg_608());
		String text = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Deal Number: "+dealNbr);    	
    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	    
	}
	
	
	
	@Then("User_608 click the Approve menu under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenu_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
	public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys("5317",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_608());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmPopupProceed_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		  	    	
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	
//	@AT_AD_003
	@When("User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_accrual_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTitle_608());
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTextMsg_608());
		String text = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Deal Number: "+dealNbr);    	
    	iisAccrualDealExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	    
	}
	
//	Settlement Module
	@And("User_608 click the Settlement module in IIS Application")
	public void user_click_the_settlement_module_in_iis_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}			    
	}

	@And("User_608 click the maintenance menu under Settlement module")
	public void user_click_the_maintenance_menu_under_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenance_608());
		IISApplicationObj608.IISSettlementMenuMaintenance_608().click();
	}

	@And("User_608 enter the Deal number in maintenance menu under Settlement")
	public void user_enter_the_deal_number_in_maintenance_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenanceDealNbrInput_608());
		IISApplicationObj608.IISSettlementMenuMaintenanceDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementMenuMaintenanceDealNbrInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_608 enter the Amount received from party in maintenance menu under Settlement")
	public void user_enter_the_amount_received_from_party_in_maintenance_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenancePartyAmtInput_608());
		IISApplicationObj608.IISSettlementMenuMaintenancePartyAmtInput_608().sendKeys(testData.get("Party Amt"),Keys.TAB);
//		IISApplicationObj608.IISSettlementMenuMaintenancePartyAmtInput_608().sendKeys("1000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementMenuMaintenancePartyAmtInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_608 click the Automatic Allocation button in maintenance menu under Settlement")
	public void user_click_the_automatic_allocation_button_in_maintenance_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementMenuMaintenanceAutoAllocationBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		IISApplicationObj608.IISSettlementMenuMaintenanceAutoAllocationBtn_608().click();
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenanceScheduleDetailsTable_608());
	}

	@When("User_608 click the Save button in maintenance menu under Settlement")
	public void user_click_the_save_button_in_maintenance_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenanceSaveBtn_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementMenuMaintenanceSaveBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenanceSuccessPopupText_608());
//		String text = IISApplicationObj608.IISSettlementMenuMaintenanceSuccessPopupText_608().getText();
//		System.err.println("Text Message: "+text);
		String settlementNbr = IISApplicationObj608.IISSettlementMenuMaintenanceSuccessPopupText_608().getText().substring(25, 29);
    	System.err.println("Settlement Number: "+settlementNbr);    	
    	iisAccrualDealExcelData.updateTestData(testData.get("DataSet ID"),"Settlement Nbr", settlementNbr);
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	
	@And("User_608 close the Settlement Maintenance menu")
	public void user_close_the_settlement_maintenance_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementMaintenanceMenuCloseIcon_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementMaintenanceMenuCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_608 click the approve menu under Settlement module")
	public void user_click_the_approve_menu_under_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuApprove_608()); 
		IISApplicationObj608.IISSettlementMenuApprove_608().click();
	}

	@And("User_608 enter the settlement number in searchgrid under approve menu in Settlement")
	public void user_enter_the_settlement_number_in_searchgrid_under_approve_menu_in_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuApproveSearchgridSettlementNbrInput_608());
		IISApplicationObj608.IISSettlementMenuApproveSearchgridSettlementNbrInput_608().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
//		IISApplicationObj608.IISSettlementMenuApproveSearchgridSettlementNbrInput_608().sendKeys("9581",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in approve menu under Settlement")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuApproveSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISSettlementMenuApproveSearchgridRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementMenuApproveSettlementNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}

	@And("User_608 click the Approve button in approve menu under Settlement")
	public void user_click_the_approve_button_in_approve_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISSettlementApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmPopupProceed_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
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
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 close the Settlement Approve menu")
	public void user_close_the_settlement_approve_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementApproveMenuCloseIcon_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementApproveMenuCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	Settlement --> Reverse
	@And("User_608 click the Reverse menu under Settlement module")
	public void user_click_the_reverse_menu_under_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementReverseMenu_608()); 
		IISApplicationObj608.IISSettlementReverseMenu_608().click();
	}

	@And("User_608 search the settlement number in searchgrid under Reverse menu in Settlement")
	public void user_search_the_settlement_number_in_searchgrid_under_reverse_menu_in_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementReverseSearchgirdSettlementNbrInput_608());
//		IISApplicationObj608.IISSettlementReverseSearchgirdSettlementNbrInput_608().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
		IISApplicationObj608.IISSettlementReverseSearchgirdSettlementNbrInput_608().sendKeys("9583",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Reverse menu under Settlement")
	public void user_double_click_the_searchgrid_row_in_reverse_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementReverseSearchgirdRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISSettlementReverseSearchgirdRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementReverseSettlementNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}

	@And("User_608 click the Reverse button in Reverse menu under Settlement")
	public void user_click_the_reverse_button_in_reverse_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementReverseMenuReverseBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISSettlementReverseMenuReverseBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		
	}
	
	
//	Settlement --> Approve Reverse
	@And("User_608 click the Approve Reverse menu under Settlement module")
	public void user_click_the_approve_reverse_menu_under_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementApproveReverseMenu_608()); 
		IISApplicationObj608.IISSettlementApproveReverseMenu_608().click();
	}

	@And("User_608 search the settlement number in searchgrid under Approve Reverse menu in Settlement")
	public void user_search_the_settlement_number_in_searchgrid_under_approve_reverse_menu_in_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementApproveReverseSearchgirdSettlementNbrInput_608());
//		IISApplicationObj608.IISSettlementApproveReverseSearchgirdSettlementNbrInput_608().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
		IISApplicationObj608.IISSettlementApproveReverseSearchgirdSettlementNbrInput_608().sendKeys("9583",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve Reverse menu under Settlement")
	public void user_double_click_the_searchgrid_row_in_approve_reverse_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementApproveReverseSearchgirdRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISSettlementApproveReverseSearchgirdRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementApproveReverseSettlementNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}

	@And("User_608 click the Reverse button in Approve Reverse menu under Settlement")
	public void user_click_the_reverse_button_in_approve_reverse_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementApproveReverseMenuReverseBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISSettlementApproveReverseMenuReverseBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
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
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	
}
