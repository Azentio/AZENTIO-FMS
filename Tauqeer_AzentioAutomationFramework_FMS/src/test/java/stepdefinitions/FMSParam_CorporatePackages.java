package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.FMSParam_CorporatePackagesObj;
import resources.BaseClass;

public class FMSParam_CorporatePackages {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSParam_CorporatePackagesObj corporatePackagesObj  = new FMSParam_CorporatePackagesObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javaScriptHelper =new JavascriptHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData corporatePackagesexcelData = new ExcelData(TestDataPath, "CorporatePackages", "DatasetID");
	Map<String, String>corporatePackagestestData = new HashMap<>();
	String code;
	
	@And("^Update test data for test case no AT_DDR_014$")
    public void update_test_data_for_test_case_no_AT_DDR_014() {
		corporatePackagestestData = corporatePackagesexcelData.getTestdata("AT_DDR_014_D1");
	     
    }
	@And("^Update test data for test case no AT_DDR_015$")
    public void update_test_data_for_test_case_no_AT_DDR_015() {
		corporatePackagestestData = corporatePackagesexcelData.getTestdata("AT_DDR_015_D1");
	     
    }
	 
	@Then("^move to the Parameters Tab$")
    public void move_to_the_parameters_tab() {
		 waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.Parameters());
		 corporatePackagesObj.Parameters().click();
	}
	
	@Then("^click on the corporate packages Tab under Parameters Tab$")
    public void click_on_the_corporate_packages_tab_under_parameters_tab() {
		 for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionHelper.moveToElement(corporatePackagesObj.CorporatePackages());
					clicksAndActionHelper.clickOnElement(corporatePackagesObj.CorporatePackages());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}}
	}
	
	@Then("^click on the Maintenance under corporate packages$")
    public void click_on_the_maintenance_under_corporate_packages() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance());
		 corporatePackagesObj.CorporatePackages_Maintenance().click();
	}
	@Then("^enter the cif under corporate packages main screen$")
    public void enter_the_cif_under_corporate_packages_main_screen() {
		 waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_CIF());
		 corporatePackagesObj.CorporatePackages_Maintenance_CIF().sendKeys(corporatePackagestestData.get("CIF Number"));
		 corporatePackagesObj.CorporatePackages_Maintenance_CIF().sendKeys(Keys.ENTER);
	}
	 
	@Then("^enter the rate under corporate packages main screen$")
    public void enter_the_rate_under_corporate_packages_main_screen() {
		 waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Rate());
		 corporatePackagesObj.CorporatePackages_Maintenance_Rate().sendKeys(corporatePackagestestData.get("Rate"));
		 corporatePackagesObj.CorporatePackages_Maintenance_Rate().sendKeys(Keys.ENTER);
	} 
	@Then("^enter the currency under corporate packages main screen$")
    public void enter_the_currency_under_corporate_packages_main_screen() {
		 waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Currency());
		 corporatePackagesObj.CorporatePackages_Maintenance_Currency().sendKeys(corporatePackagestestData.get("Currency"));
		 corporatePackagesObj.CorporatePackages_Maintenance_Currency().sendKeys(Keys.ENTER);
	}
	@Then("^enter the limit under corporate packages main screen$")
    public void enter_the_limit_under_corporate_packages_main_screen() {
		 waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Limit());
		 corporatePackagesObj.CorporatePackages_Maintenance_Limit().sendKeys(corporatePackagestestData.get("Limit"));
		 corporatePackagesObj.CorporatePackages_Maintenance_Limit().sendKeys(Keys.ENTER);
	}
	
	
	@Then("^click on the Group Limit Tab$")
    public void click_on_the_group_limit_tab() {
	waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_GroupLimitTab());
	corporatePackagesObj.CorporatePackages_Maintenance_GroupLimitTab().click();
		 
	}
	
	@Then("^click on the add new row under Group Limit Tab$")
    public void click_on_the_add_new_row_under_group_limit_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_AddGroupLimit());
		corporatePackagesObj.CorporatePackages_Maintenance_AddGroupLimit().click();
	}
	@Then("^enter GroupId under Group Limit Tab$")
    public void enter_groupid_under_group_limit_tab() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_GroupId());
		corporatePackagesObj.CorporatePackages_Maintenance_GroupId().click();
		
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_GroupIdInput());
		corporatePackagesObj.CorporatePackages_Maintenance_GroupIdInput().sendKeys("001");
		corporatePackagesObj.CorporatePackages_Maintenance_GroupIdInput().sendKeys(Keys.ENTER);
		
	}
	@Then("^enter Group Name under Group Limit Tab$")
    public void enter_group_name_under_group_limit_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_GroupName());
		corporatePackagesObj.CorporatePackages_Maintenance_GroupName().click();
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_GroupNameInput());
		corporatePackagesObj.CorporatePackages_Maintenance_GroupNameInput().sendKeys("abc");
		corporatePackagesObj.CorporatePackages_Maintenance_GroupNameInput().sendKeys(Keys.ENTER);
		
	
	}
	
	@Then("^enter Limit under Group Limit Tab$")
    public void enter_limit_under_group_limit_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_GroupLimit());
		corporatePackagesObj.CorporatePackages_Maintenance_GroupLimit().click();
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_GroupLimitInput());
		corporatePackagesObj.CorporatePackages_Maintenance_GroupLimitInput().sendKeys("200");
		corporatePackagesObj.CorporatePackages_Maintenance_GroupLimitInput().sendKeys(Keys.ENTER);
	}
	
	
	@Then("^click on the Branches Tab$")
    public void click_on_the_branches_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Branches());
		corporatePackagesObj.CorporatePackages_Maintenance_Branches().click();
	} 
	@Then("^click on the add new row under Branches Tab$")
    public void click_on_the_add_new_row_under_branches_tab() {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(corporatePackagesObj.CorporatePackages_Maintenance_AddBranches());
				clicksAndActionHelper.clickOnElement(corporatePackagesObj.CorporatePackages_Maintenance_AddBranches());
		
		break;
	} catch (Exception e) {
		if (i == 300) {
			Assert.fail(e.getMessage());
		}
	}}
	}
	@Then("^enter Branch code under Branches Tab$")
    public void enter_branch_code_under_branches_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_BrancheCode());
		corporatePackagesObj.CorporatePackages_Maintenance_BrancheCode().click();
		
		
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_BrancheCodeInput());
		corporatePackagesObj.CorporatePackages_Maintenance_BrancheCodeInput().sendKeys("01");
		corporatePackagesObj.CorporatePackages_Maintenance_BrancheCodeInput().sendKeys(Keys.ENTER);
	}
	
	@Then("^click on the Rates Tab$")
    public void click_on_the_rates_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_RatesTab());
		corporatePackagesObj.CorporatePackages_Maintenance_RatesTab().click();
		
	}
	@Then("^click on the add new row under Rates tab$")
    public void click_on_the_add_new_row_under_rates_tab() {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(corporatePackagesObj.CorporatePackages_Maintenance_RatesAddNewRow());
				clicksAndActionHelper.clickOnElement(corporatePackagesObj.CorporatePackages_Maintenance_RatesAddNewRow());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}}
	} 
	@Then("^enter product class under Rates Tab$")
    public void enter_the_product_class_under_rates_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Rates_ProductClass());
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_ProductClass().click();
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Rates_ProductClassInput());
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_ProductClassInput().sendKeys("0002");
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_ProductClassInput().sendKeys(Keys.ENTER);
	} 
	@Then("^verify Group ID field added under the Rates section$")
    public void verify_group_id_field_added_under_the_rates_section() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Rates_GroupID());
		boolean groupID = corporatePackagesObj.CorporatePackages_Maintenance_Rates_GroupID().isDisplayed();
		System.out.println(groupID);
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_GroupID().click();
		
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Rates_GroupIDInput());
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_GroupIDInput().sendKeys("001");
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_GroupIDInput().sendKeys(Keys.ENTER);
	}  
	 
	
	@Then("^enter Floating Rate under Rates Tab$")
    public void enter_floating_rate_under_rates_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Rates_FloatingRate());
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_FloatingRate().click();
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Rates_FloatingRateInput());
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_FloatingRateInput().sendKeys("01");
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_FloatingRateInput().sendKeys(Keys.ENTER);
	}
	
	
	@Then("^enter Rate under Rates Tab$")
    public void enter_rate_under_rates_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Rates_RateInput());
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_RateInput().sendKeys("5");
		corporatePackagesObj.CorporatePackages_Maintenance_Rates_RateInput().sendKeys(Keys.ENTER);
	}
	
	 
	@Then("^click on the Yield Details Tab$")
    public void click_on_the_yield_details_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_YieldDetails());
		corporatePackagesObj.CorporatePackages_Maintenance_YieldDetails().click();
		
	}
	
	@Then("^enter number of payments under Yield Details Tab$")
    public void enter_number_of_payments_under_yield_details_tab() throws InterruptedException {
		
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(corporatePackagesObj.CorporatePackages_Maintenance_YieldDetailsAdd());
				clicksAndActionHelper.doubleClick(corporatePackagesObj.CorporatePackages_Maintenance_YieldDetailsAdd());
				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}}
//		clicksAndActionHelper.doubleClick(corporatePackagesObj.CorporatePackages_Maintenance_YieldDetailsAdd());
	
//		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_YieldDetailsAdd());
//		corporatePackagesObj.CorporatePackages_Maintenance_YieldDetailsAdd().click();
		for (int i = 0; i <= 300; i++) {
		try {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_NumberOfPayements());
		clicksAndActionHelper.doubleClick(corporatePackagesObj.CorporatePackages_Maintenance_NumberOfPayements());
//		corporatePackagesObj.CorporatePackages_Maintenance_NumberOfPayements().click();
		Thread.sleep(400);
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_NumberOfPayementsInput());
		corporatePackagesObj.CorporatePackages_Maintenance_NumberOfPayementsInput().sendKeys("10");
		corporatePackagesObj.CorporatePackages_Maintenance_NumberOfPayementsInput().sendKeys(Keys.ENTER);

		break;
	} catch (Exception e) {
		if (i == 300) {
			Assert.fail(e.getMessage());
		}
	}}
		
	}
	@Then("^enter Margin under Yield Details Tab$")
    public void enter_margin_under_yield_details_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Margin());
		corporatePackagesObj.CorporatePackages_Maintenance_Margin().isDisplayed();
		corporatePackagesObj.CorporatePackages_Maintenance_Margin().click();
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_MarginInput());
		corporatePackagesObj.CorporatePackages_Maintenance_MarginInput().sendKeys("2");
		corporatePackagesObj.CorporatePackages_Maintenance_MarginInput().sendKeys(Keys.ENTER);
	}
	@Then("^Check the Fixed Flag under Yield Details Tab$")
    public void check_the_fixed_flag_under_yield_details_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_Fixed());
		corporatePackagesObj.CorporatePackages_Maintenance_Fixed().isDisplayed();
		corporatePackagesObj.CorporatePackages_Maintenance_Fixed().click();
	}
	@Then("^enter Cape Rate under Yield Details Tab$")
    public void enter_cape_rate_under_yield_details_tab() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_Maintenance_CapRate());
		corporatePackagesObj.CorporatePackages_Maintenance_CapRate().isDisplayed();
		corporatePackagesObj.CorporatePackages_Maintenance_CapRate().sendKeys("200");
		corporatePackagesObj.CorporatePackages_Maintenance_CapRate().sendKeys(Keys.ENTER);
	}
	@Then("^save the yeild details$")
    public void save_the_yield_details() {
		waitHelper.waitForElementwithFluentwait(driver, corporatePackagesObj.CorporatePackages_YieldDetailsOk());
		corporatePackagesObj.CorporatePackages_YieldDetailsOk().click();
	}
	
}
