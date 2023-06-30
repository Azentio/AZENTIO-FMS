package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.FMS_Parameter_Obj;
import resources.BaseClass;

public class FMS_Parameter_Steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMS_Parameter_Obj  FMS_Parameter_Obj = new FMS_Parameter_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData1 = new ExcelData(path, "REQUEST_FOR_FINANCIN", "Data Set ID");
	Map<String, String> testData1;

	// @586488
	
	@Given("User_607 Click Financial Indicators under Parameters")
	public void user_click_financial_indicators_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Parameter_Obj.Click_FinancialIndicators_under_Parameters_607());
		FMS_Parameter_Obj.Click_FinancialIndicators_under_Parameters_607().click();
	}

	@Given("User_607 Click Mainteance Under Financial Indicators")
	public void user_click_mainteance_under_financial_indicators() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Parameter_Obj.Click_Mainteance_Under_FinancialIndicators_607());
		FMS_Parameter_Obj.Click_Mainteance_Under_FinancialIndicators_607().click();
	}

	@Given("User_607 Check Code In Mainteance Under Financial Indicators")
	public void user_check_code_in_mainteance_under_financial_indicators() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607());
		FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().sendKeys("dgs");
		FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().sendKeys(Keys.TAB);
		String Check = FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().getAttribute("prevvalue");
		if(!Check.isBlank()||!Check.isEmpty()) {
			Assert.fail();
		}
		FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().click();
		FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().sendKeys("654");
		FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			if (!(FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
		String Check1 = FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().getAttribute("prevvalue");
		if(Check1.isEmpty()||Check1.isBlank()) {
			Assert.fail();
		}
	}
	
	//@586449
	
	@Given("User_607 Check duplicate Code not allow In Mainteance Under Financial Indicators")
	public void user_check_duplicate_code_not_allow_in_mainteance_under_financial_indicators() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607());
		FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().click();
		FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().sendKeys("1");
		FMS_Parameter_Obj.Enter_Code_InMainteance_Under_FinancialIndicators_607().sendKeys(Keys.TAB);
		waitHelper.waitForElementwithFluentwait(driver, FMS_Parameter_Obj.Duplicate_Value_popup());
		if(!FMS_Parameter_Obj.Duplicate_Value_popup().isDisplayed()) {
			Assert.fail();
		}
		
	}
}
