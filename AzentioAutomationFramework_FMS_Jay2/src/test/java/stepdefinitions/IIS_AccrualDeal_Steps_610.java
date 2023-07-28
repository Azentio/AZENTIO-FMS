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
import pageobjects.CommonElements.IIS_AccrualDeal_obj_610;
import resources.BaseClass;

public class IIS_AccrualDeal_Steps_610 {

	WebDriver driver = BaseClass.driver;
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
	
	Map<String, String> testData;
	
	
	
//	@Test
	@And("^User_610 get the test data for test case$")
    public void get_the_test_data_for_test_case() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_Test");
    }
	
	
	// Clear cache step
		@And("User_610 clear the caches in IIS Application")
		public void user_clear_the_caches_in_iis_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISCoreTechDetailsIcon_610());
			IIS_AccrualDeal_obj_610.IISCoreTechDetailsIcon_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISCoreClearCacheBtn_610());
			IIS_AccrualDeal_obj_610.IISCoreClearCacheBtn_610().click();
			
			for (int i = 0; i < 2000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_SuccessPopupOkBtn_610().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
//		Investment Deals Combined without Trade Deal
		@And("User_610 click the Investment Deals Combined without Trade Deal menu")
		public void user_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMenu_610());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMenu_610());
			for (int i = 0; i <= 300; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMenu_610().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_610 click the Maintenance under Investment Deals Combined without Trade Deal")
		public void user_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMaintenanceMenu_610());
			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMaintenanceMenu_610().click();
		}

		@And("User_610 enter the Party in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainPartyInput_610());
			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainPartyInput_610().sendKeys(testData.get("Party Value"),Keys.TAB);
//			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainPartyInput_610().sendKeys("727",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainPartyInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
			
			for (int i = 0; i < 1000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610().click();
			    	break;
				} catch (Exception e) {
					
				}
			}
		}

		@And("User_610 enter the category in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainCategoryInput_610());
			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainCategoryInput_610().sendKeys(testData.get("Charge Code"),Keys.TAB);
//			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainCategoryInput_610().sendKeys("3",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainCategoryInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
			
		}

		@And("User_610 enter the product class in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainProductClassInput_610());
			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainProductClassInput_610().sendKeys(testData.get("Product Class"),Keys.TAB);
//			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainProductClassInput_610().sendKeys("100",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainProductClassInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
		}

		@And("User_610 enter the amount in maintenance under Investment Deals Combined without Trade Deal")
		public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainAmountInput_610());
			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainAmountInput_610().sendKeys(testData.get("Amount"),Keys.TAB);
//			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainAmountInput_610().sendKeys("10000",Keys.TAB);
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainAmountInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}	    
		}

		@And("User_610 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
		public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorTab_610());
			for (int i = 0; i <= 300; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorTab_610().click();
					break;
				} catch (Exception e) {
					
				}
	    	}
		}

		@And("User_610 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
		public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorTabRow_610());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorTabRow_610());
					break;
				} catch (Exception e) {
					
				}
	    	}
		}

		@And("User_610 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_610());
			for (int i = 0; i <= 300; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_610().click();
					break;
				} catch (Exception e) {
					
				}
	    	}
		}

		@And("User_610 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_610());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_610());
					break;
				} catch (Exception e) {
					
				}
	    	}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}		
		}

		@And("User_610 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
			for (int i = 0; i <= 300; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_610().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_610());
			for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_610());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_610().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
			
		}
		
		@And("User_610 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_click_the_ok_button_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_610());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_610().click();
		}
		
		@And("User_610 click the save button in maintenance under Investment Deals Combined without Trade Deal")
		public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainSaveBtn_610());
					break;
				} catch (Exception e) {

				}
			}
			
			for (int i = 0; i <= 300; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainSaveBtn_610().click();
					break;
				} catch (Exception e) {
		
				}
			}
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610().click();
			
			for (int i = 0; i <= 2000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_InformationPopupOkBtn_610().click();
					break;
				} catch (Exception e) {
		
				}
			}		
		    
		}

		@And("User_610 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
		public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_610());
			for (int i = 0; i <= 500; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_610().click();
					break;
				} catch (Exception e) {
		
				}
			}
		    
		}

		@And("User_610 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
//			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_610());
			// Un-check the Grace Period Check box
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_610());
					break;
				} catch (Exception e) {
					
				}
			}		
			WebElement gracePeriodCheckbox = IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_610();
	     	if(gracePeriodCheckbox.isSelected()) {
	     		gracePeriodCheckbox.click();
	     	}
	     	
	     	// create schedule button
	     	waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_610());
	     	for (int i = 0; i <= 500; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_610().click();
					break;
				} catch (Exception e) {
		
				}
			}
		}

		@And("User_610 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
		public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainValidateBtn_610());
					break;
				} catch (Exception e) {
					
				}
			}
			for (int i = 0; i <= 500; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_610().click();
					break;
				} catch (Exception e) {
		
				}
			}	    
		}

		@When("User_610 validate button in maintenance under Investment Deals Combined without Trade Deal")
		public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainValidateBtn_610());
			for (int i = 0; i <= 500; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealMainValidateBtn_610().click();
					break;
				} catch (Exception e) {
		
				}
			}
		    
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InformationPopupTitle_610());
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_InformationPopupTextMsg_610());
			String text = IIS_AccrualDeal_obj_610.IIS_InformationPopupTextMsg_610().getText();
			System.err.println("Text Message: "+text);
			String dealNbr = IIS_AccrualDeal_obj_610.IIS_InformationPopupTextMsg_610().getText().substring(18, 22);
	    	System.err.println("Reference Number: "+dealNbr);    	
	    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
			for (int i = 0; i <= 2000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_InformationPopupOkBtn_610().click();
					break;
				} catch (Exception e) {
		
				}
			}		
		    
		}
		
		@Then("User_610 click the Approve menu under Investment Deals Combined without Trade Deal")
		public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenu_610());
			for (int i = 0; i <= 500; i++) {
				try {
					IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenu_610().click();
					break;
				} catch (Exception e) {
		
				}
			}
		}

		@And("User_610 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
		public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_610());
			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_610().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
//			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_610().sendKeys("5317",Keys.ENTER);
		}

		@And("User_610 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
		public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_610());
			for (int i = 0; i <= 500; i++) {
				try {
					clicksAndActionsHelper.doubleClick(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_610());
					break;
				} catch (Exception e) {
		
				}
			}
		}

		@When("User_610 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
		public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_610());
			for (int i = 0; i <= 300; i++) {
				try {
					javaScriptHelper.scrollIntoView(IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_610());
					break;
				} catch (Exception e) {
					
				}
			}		
			IIS_AccrualDeal_obj_610.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_610().click();
			
			waitHelper.waitForElementwithFluentwait(driver, IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610());
			IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610().click();		
			
			for (int i = 0; i <= 1000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_ConfirmPopupOkBtn_610().click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			  	    	
			for (int i = 0; i <= 2000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_InformationPopupOkBtn_610().click();
					break;
				} catch (Exception e) {
		
				}
			}
		    
			for (int i = 0; i <= 1000; i++) {
				try {
					IIS_AccrualDeal_obj_610.IIS_ConfirmPopupCancelBtn_610().click();
					break;
				} catch (Exception e) {
		
				}
			}
			
		}
		
		
}
