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
	
	Map<String, String> testData;
	
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
	
//	@AT_IC_010
	@And("^User_609 get the test data for test case AT_IC_010$")
    public void get_the_test_data_for_test_case_AT_IC_010() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_AT_IC_010");
    }
	
//	@Test
	@And("^User_609 get the test data for test case$")
    public void get_the_test_data_for_test_case() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_Test");
    }
	
	
	
	
	// Clear cache step
	@And("User_609 clear the caches in IIS Application")
	public void user_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISCoreTechDetailsIcon_609());
		IIS_PageObjects_609.IISCoreTechDetailsIcon_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISCoreClearCacheBtn_609());
		IIS_PageObjects_609.IISCoreClearCacheBtn_609().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
				if (IIS_PageObjects_609.IIS_SuccessPopupOkBtn_609().isDisplayed()) {
					IIS_PageObjects_609.IIS_SuccessPopupOkBtn_609().click();
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
	public void user_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609().click();		
	}

	@And("User_609 Click the Maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_609().click();
	}

	@And("User_609 Select the Party in Investment Deals Combined without Trade Deal")
	public void user_Select_the_party_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609().sendKeys(testData.get("Party Value"),Keys.ENTER);
		
		String CifNo = testData.get("Party Value");
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
		
		for (int i = 0; i < 1000; i++) {
			try {
				IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		    	break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}

	@And("User_609 Select the Category in Investment Deals Combined without Trade Deal")
	public void user_Select_the_category_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609().sendKeys(testData.get("Charge Code"),Keys.ENTER);
		
		//table[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT']/tbody/tr/td[text()='3']
		String xpath ="//table[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT']/tbody/tr/td[text()='"+testData.get("Charge Code")+"']";
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

	@And("User_609 Select the Product Class in Investment Deals Combined without Trade Deal")
	public void user_Select_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
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
	public void user_Enter_the_amount_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609().clear();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609().sendKeys(testData.get("Amount"),Keys.TAB);
	}

	@And("User_609 Enter the Tenure in Investment Deals Combined without Trade Deal")
	public void user_Enter_the_tenure_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609().clear();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609().sendKeys(testData.get("Tenure"),Keys.TAB);
		
		for (int i = 0; i < 1000; i++) {
			try {
				IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		    	break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
	
	
	
	
	@And("User_609 Click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorTab_609());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorTab_609().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_609 double Click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorTabRow_609());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorTabRow_609());
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_609 Click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_609());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_609().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_609 double Click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_609());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_609());
				break;
			} catch (Exception e) {
				
			}
    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_609().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
    	}		
	}

	@And("User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_609().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_609());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_609());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_609().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
    	}
		
	}
	
	@And("User_609 Click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_ok_button_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_609());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_609().click();
	}
	
	@And("User_609 Click the save button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainSaveBtn_609());
				break;
			} catch (Exception e) {

			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainSaveBtn_609().click();
				break;
			} catch (Exception e) {
	
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmPopupOkBtn_609());
		IIS_PageObjects_609.IIS_ConfirmPopupOkBtn_609().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
				break;
			} catch (Exception e) {
	
			}
		}		
	    
	}

	@And("User_609 Click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_609());
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_609().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
	}

	@And("User_609 Click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_609());
		// Un-check the Grace Period Check box
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_609());
				break;
			} catch (Exception e) {
				
			}
		}		
		WebElement gracePeriodCheckbox = IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_609();
     	if(gracePeriodCheckbox.isSelected()) {
     		gracePeriodCheckbox.click();
     	}
     	
     	// create schedule button
     	waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_609());
     	for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_609().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_609 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainValidateBtn_609());
				break;
			} catch (Exception e) {
				
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_609().click();
				break;
			} catch (Exception e) {
	
			}
		}	    
	}

	@When("User_609 validate button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainValidateBtn_609());
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealMainValidateBtn_609().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmPopupOkBtn_609());
		IIS_PageObjects_609.IIS_ConfirmPopupOkBtn_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InformationPopupTitle_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InformationPopupTextMsg_609());
		String text = IIS_PageObjects_609.IIS_InformationPopupTextMsg_609().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = IIS_PageObjects_609.IIS_InformationPopupTextMsg_609().getText().substring(18, 22);
    	System.err.println("Reference Number: "+dealNbr);    	
    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
				break;
			} catch (Exception e) {
	
			}
		}		
	    
	}
	
	@Then("User_609 Click the Approve menu under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenu_609());
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenu_609().click();
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@And("User_609 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
	public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_609());
		IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_609().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
//		IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_609().sendKeys("5317",Keys.Enter);
	}

	@And("User_609 double Click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_609());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_609());
				break;
			} catch (Exception e) {
	
			}
		}
	}

	@When("User_609 Click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_609());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_609());
				break;
			} catch (Exception e) {
				
			}
		}		
		IIS_PageObjects_609.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_609().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmPopupOkBtn_609());
		IIS_PageObjects_609.IIS_ConfirmPopupOkBtn_609().click();		
		
		for (int i = 0; i <= 1000; i++) {
			try {
				IIS_PageObjects_609.IIS_ConfirmPopupOkBtn_609().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		  	    	
		for (int i = 0; i <= 2000; i++) {
			try {
				IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
				break;
			} catch (Exception e) {
	
			}
		}
	    
		for (int i = 0; i <= 1000; i++) {
			try {
				IIS_PageObjects_609.IIS_ConfirmPopupCancelBtn_609().click();
				break;
			} catch (Exception e) {
	
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@AT_IC_010
	@And("User_609 Click the Tracking & Incidental Charges module")
	public void user_click_the_tracking_incidental_charges_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609());
		IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609().click();
	}

	@And("User_609 Click the Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesReverseMenu_609());
		IIS_PageObjects_609.IISTrackingIncidentalChargesReverseMenu_609().click();
	}

	@And("User_609 Enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges")
	public void user_Enter_the_track_number_in_searchgrid_under_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_609());
		IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_609().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_609 double Click the searchgrid row in Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridRow_609());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridRow_609());
				break;
			} catch (Exception e) {
				
			}
    	}	    
	}

	@When("User_609 Click the Reverse button in Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuTrackNbr_609());
	    for(int i = 0; i<= 300; i++) {
	    	try {
	    		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISIncidentalChargesReverseMenuReverseBtn_609());
	    		break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
	    }
	    IIS_PageObjects_609.IISIncidentalChargesReverseMenuReverseBtn_609().click();
	    
	    // Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_WarningPopupOkBtn_609());
	    IIS_PageObjects_609.IIS_WarningPopupOkBtn_609().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InformationPopupOkBtn_609());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
	    		break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
	    }
	    
	}

	@And("User_609 Click the Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesApproveReverseMenu_609());
		IIS_PageObjects_609.IISTrackingIncidentalChargesApproveReverseMenu_609().click();
	}

	@And("User_609 Enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges")
	public void user_Enter_the_track_number_in_searchgrid_under_approve_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_609());
		IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_609().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_609 double Click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridRow_609());
	    for(int i = 0; i <=300; i++) {
	    	try {
				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridRow_609());
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
	    }
	}

	@When("User_609 Click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseTrackNbr_609());
		for(int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISIncidentalChargesApproveReverseMenuReverseBtn_609());
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		IIS_PageObjects_609.IISIncidentalChargesApproveReverseMenuReverseBtn_609().click();
		
		// Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_WarningPopupOkBtn_609());
	    IIS_PageObjects_609.IIS_WarningPopupOkBtn_609().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InformationPopupOkBtn_609());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
	    		break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
	    }
	}
	
	
	
	
	
	
	
	
	


}
