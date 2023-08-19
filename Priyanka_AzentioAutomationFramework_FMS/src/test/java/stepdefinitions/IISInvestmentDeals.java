package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.IISInvestmentDealsObj;
import resources.BaseClass;

public class IISInvestmentDeals extends BaseClass{
	WebDriver driver = BaseClass.driver;
	IISInvestmentDealsObj investmentDealsObj = new IISInvestmentDealsObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData investmentDealsexcelData = new ExcelData(TestDataPath, "IISInvestmentDeals", "DataSet ID");
	Map<String, String> investmentDealstestData = new HashMap<>();


	@And("^Update test data for test case no AT_IC_011$")
    public void update_test_data_for_test_case_no_AT_IC_011() {
		investmentDealstestData = investmentDealsexcelData.getTestdata("AT_IC_011_D1");
	     
    }
	@Then("^user click on the investment deals combined without trade deal tab$")
    public void user_click_on_the_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_CombinedwithoutTradeDeal());
		investmentDealsObj.InvestmentDeals_CombinedwithoutTradeDeal().click();
   
	}
	@Then("^user click on the maintenance tab under investment deals combined without trade deal tab$")
    public void user_click_on_the_maintenance_tab_under_investment_deals_combined_without_trade_deal_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Maintenance());
		investmentDealsObj.InvestmentDeals_Maintenance().click();
   
	} 
	@Then("^enter the party value under maintenance screen$")
    public void enter_the_party_value_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Party());
		investmentDealsObj.InvestmentDeals_Party().sendKeys(investmentDealstestData.get("Party")); 
		investmentDealsObj.InvestmentDeals_Party().sendKeys(Keys.ENTER);
		
		for (int i = 0; i < 2000; i++) {
			try {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Party_confirm_ok());		
		investmentDealsObj.InvestmentDeals_Party_confirm_ok().click();
		 break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}}
	} 
	@Then("^enter the category value under maintenance screen$")
    public void enter_the_category_value_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Category());
		investmentDealsObj.InvestmentDeals_Category().sendKeys(investmentDealstestData.get("Category")); 
		investmentDealsObj.InvestmentDeals_Category().sendKeys(Keys.ENTER);
	}
	@Then("^enter the product class value under maintenance screen$")
    public void enter_the_product_class_value_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_ProductClass());
		investmentDealsObj.InvestmentDeals_ProductClass().sendKeys(investmentDealstestData.get("ProductClass")); 
		investmentDealsObj.InvestmentDeals_ProductClass().sendKeys(Keys.ENTER);
	} 
	@Then("^enter the deal currency value under deal details screen$")
    public void enter_the_deal_currency_value_under_deal_details_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_DealCY());
		investmentDealsObj.InvestmentDeals_DealCY().sendKeys(Keys.CLEAR);
		investmentDealsObj.InvestmentDeals_DealCY().sendKeys(investmentDealstestData.get("DealCY")); 
		investmentDealsObj.InvestmentDeals_DealCY().sendKeys(Keys.ENTER);
	} 
	@Then("^enter the amount value under deal details screen$")
    public void enter_the_amount_value_under_deal_details_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Amount());
		investmentDealsObj.InvestmentDeals_Amount().sendKeys(investmentDealstestData.get("Amount")); 
		investmentDealsObj.InvestmentDeals_Amount().sendKeys(Keys.ENTER);
	}
	@Then("^enter the yield value under deal details screen$")
    public void enter_the_yield_value_under_deal_details_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Yield());
		investmentDealsObj.InvestmentDeals_Yield().sendKeys(investmentDealstestData.get("Yield")); 
		investmentDealsObj.InvestmentDeals_Yield().sendKeys(Keys.ENTER);
	}
	@Then("^user click on the contributor details tab$")
    public void user_click_on_the_contributor_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_ContributorDetails());
		investmentDealsObj.InvestmentDeals_ContributorDetails().click(); 
		
	}
	@Then("^open the record of contributor details$")
    public void open_the_record_of_contributor_details() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(investmentDealsObj.InvestmentDeals_ContributorDetailsRecord());
				clicksAndActionsHelper.doubleClick(investmentDealsObj.InvestmentDeals_ContributorDetailsRecord());
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}}
		
		
	}
	@Then("^enter the nostro details$")
    public void enter_the_nostro_details() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(investmentDealsObj.InvestmentDeals_NostroDetails_searchIcon());
				investmentDealsObj.InvestmentDeals_NostroDetails_searchIcon().click();
				clicksAndActionsHelper.moveToElement(investmentDealsObj.InvestmentDeals_NostroDetails_selectRecord());
				clicksAndActionsHelper.doubleClick(investmentDealsObj.InvestmentDeals_NostroDetails_selectRecord());
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}}
		
		
	}
	@Then("^enter the maturity details$")
    public void enter_the_maturity_details() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(investmentDealsObj.InvestmentDeals_MaturityDetails_searchIcon());
				investmentDealsObj.InvestmentDeals_MaturityDetails_searchIcon().click();
				clicksAndActionsHelper.moveToElement(investmentDealsObj.InvestmentDeals_MaturityDetails_selectRecord());
				clicksAndActionsHelper.doubleClick(investmentDealsObj.InvestmentDeals_MaturityDetails_selectRecord());
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}}
		
		
	}
	@Then("^click on the ok button of contributor details screen$")
    public void click_on_the_ok_button_of_contributor_details_screen() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(investmentDealsObj.InvestmentDeals_ContribDetSave());
				investmentDealsObj.InvestmentDeals_ContribDetSave().click();
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}}
		
		
	} 
	@Then("^save the investment deals record$")
    public void save_the_investment_deals_record() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(investmentDealsObj.InvestmentDeals_Save());
				investmentDealsObj.InvestmentDeals_Save().click();
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}}
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Save_Confrim());
		investmentDealsObj.InvestmentDeals_Save_Confrim().click(); 
		
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_alertOk());
		investmentDealsObj.InvestmentDeals_alertOk().click(); 
		
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_InformationOk());
		investmentDealsObj.InvestmentDeals_InformationOk().click();
	}  
	@Then("^click on the repayment plan tab$")
    public void click_on_the_repayment_plan_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Repayment_plan());
		investmentDealsObj.InvestmentDeals_Repayment_plan().click(); 
			
	} 
	@Then("^click on the create schedule$")
    public void click_on_the_create_schedule() throws Throwable {
		 
		
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_compoundingCheckBox());
		investmentDealsObj.InvestmentDeals_compoundingCheckBox().click(); 
		
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Create_Schedule());
		investmentDealsObj.InvestmentDeals_Create_Schedule().click();
		
			
	} 
	@Then("^close the create schedule page$")
    public void close_the_creat_schedule_page() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_RepaymentSchedule_close());
		investmentDealsObj.InvestmentDeals_RepaymentSchedule_close().click(); 
	}
	@Then("^validate the investment deals record$")
    public void validate_the_investment_deals_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Validate());
		investmentDealsObj.InvestmentDeals_Validate().click(); 
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Validate_confirm());
		investmentDealsObj.InvestmentDeals_Validate_confirm().click(); 
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Validate_confirm_ok());
		investmentDealsObj.InvestmentDeals_Validate_confirm_ok().click(); 
		waitHelper.waitForElementwithFluentwait(driver, investmentDealsObj.InvestmentDeals_Validate_confirmation());
		investmentDealsObj.InvestmentDeals_Validate_confirmation().click();
	}
	
	
}
