package stepdefinitions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.inject.Key;

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
	int Application_Ref, Menu_Ref, Sads_Code, ProductclassCode;
	String Brief_Name, Long_Name;
	String user, userid = null;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin IISLogin = new IISLogin(driver);
	IIS_PageObjects_609 IIS_PageObjects_609 = new IIS_PageObjects_609(driver);

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData = new ExcelData(path, "IIS_IncidentalCharges_609", "DataSet ID");
	ExcelData iisAccountBalanceCheckingExcelData = new ExcelData(path, "IIS_AccountBalanceChecking_609", "DataSet ID");
	ExcelData iisAccuralDealExcelData = new ExcelData(path, "IIS_AccuralDeal_609", "DataSet ID");
	ExcelData iisAdvancePrincipalSettlementExcelData = new ExcelData(path, "IIS_AdvancePrincipalSettlement",
			"DataSet ID");
	ExcelData iisAccrualProcessExcelData = new ExcelData(path, "IIS_AccrualProcess_609", "DataSet ID");
	ExcelData mtsExcelData = new ExcelData(path, "MTS_TestData_609", "DataSet ID");
	ExcelData iisAuthorizationlimitExcelData = new ExcelData(path, "IIS_AuthorizationLimit_609", "DataSet ID");
	ExcelData iisParametersExcelData = new ExcelData(path, "IIS_Parameters_609", "DataSet ID");
	Map<String, String> testData;
	String Deal_Number;

	ExcelData iisLoginExceldata = new ExcelData(path, "IIS_Login", "UserType");
	Map<String, String> iisLoginTestData;

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

	@Given("^navigate to MTS application and login with valid credentials$")
	public void navigate_to_mts_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getMTSApplicationUrl());
		IISLogin.loginIntomtsApplication2(configFileReader.getMTSApplicationUserType());

	}

	@Given("^navigate to Sads application and login with valid credentials$")
	public void navigate_to_Sads_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getSADSApplicationUrl());
		IISLogin.loginIntoSadsApplication2(configFileReader.getSADSApplicationUserType());

	}

	@Given("^navigate to IIS Params application and login with valid credentials$")
	public void navigate_to_IIS_Params_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getIISparamsUrl());
		IISLogin.loginIntoiisParamApplication2(configFileReader.getIISParamApplicationUserType());

	}

	@And("^User_609 get the test data set id for AT_AD_001$")
	public void user_609_get_the_test_data_set_id_for_AT_AD_001() throws Throwable {
		testData = iisAccuralDealExcelData.getTestdata("AT_AD_001_D1");
	}

	@And("^User_609 get the test data set id for AT_AD_002$")
	public void user_609_get_the_test_data_set_id_for_AT_AD_002() throws Throwable {
		testData = iisAccuralDealExcelData.getTestdata("AT_AD_002_D1");
	}
	// **** Authorization Limit ****//

	@And("^User_609 get the test data set id for AT_AUTL_006$")
	public void user_609_get_the_test_data_set_id_for_AT_AUTL_006() throws Throwable {
		testData = iisAuthorizationlimitExcelData.getTestdata("AT_AUTL_006_D1");
	}

	@And("^User_609 get the test data set id for AT_AUTL_008$")
	public void user_609_get_the_test_data_set_id_for_AT_AUTL_008() throws Throwable {
		testData = iisAuthorizationlimitExcelData.getTestdata("AT_AUTL_008_D1");
		iisLoginTestData = iisLoginExceldata.getTestdata(configFileReader.getIISApplicationUserType());
	}

	@And("^User_609 get the test data set id for AT_AUTL_009$")
	public void user_609_get_the_test_data_set_id_for_AT_AUTL_009() throws Throwable {
		testData = iisAuthorizationlimitExcelData.getTestdata("AT_AUTL_009_D1");
		iisLoginTestData = iisLoginExceldata.getTestdata(configFileReader.getIISApplicationUserType());
	}

	@And("^User_609 get the test data set id for AT_AUTL_010$")
	public void user_609_get_the_test_data_set_id_for_AT_AUTL_0010() throws Throwable {
		testData = iisAuthorizationlimitExcelData.getTestdata("AT_AUTL_0010_D1");
		iisLoginTestData = iisLoginExceldata.getTestdata(configFileReader.getIISApplicationUserType());
	}

	// ** IIS Parameters **//
	@And("^User_609 get the test data set id for AT_IISPRM_007$")
	public void user_609_get_the_test_data_set_id_for_AT_IISPRM_007() throws Throwable {
		testData = iisParametersExcelData.getTestdata("AT_IISPRM_007_D1");
	}

	@And("^User_609 get the test data set id for AT_IISPRM_030$")
	public void user_609_get_the_test_data_set_id_for_AT_IISPRM_030() throws Throwable {
		testData = iisParametersExcelData.getTestdata("AT_IISPRM_030_D1");
	}

	@And("^User_609 get the test data set id for AT_IISPRM_036$")
	public void user_609_get_the_test_data_set_id_for_AT_IISPRM_036() throws Throwable {
		testData = iisParametersExcelData.getTestdata("AT_IISPRM_036_D1");
	}
	
	@And("^User_609 get the test data set id for AT_IISPRM_037$")
	public void user_609_get_the_test_data_set_id_for_AT_IISPRM_037() throws Throwable {
		testData = iisParametersExcelData.getTestdata("AT_IISPRM_037_D1");
	}

	// **IncidentalCharges**//
	@And("^User_609 get the test data set id for AT_IC_023$")
	public void user_609_get_the_test_data_set_id_for_AT_IC_023() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("AT_IC_023_D1");
	}

	@And("^User_609 get the test data set id for AT_IC_024$")
	public void user_609_get_the_test_data_set_id_for_AT_IC_024() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("AT_IC_024_D1");
	}

	@And("^User_609 get the test data set id for AT_IC_025$")
	public void user_609_get_the_test_data_set_id_for_AT_IC_025() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("AT_IC_025_D1");
	}

	@And("^User_609 get the test data set id for AT_ABC_007$")
	public void user_609_get_the_test_data_set_id_for_AT_ABC_007() throws Throwable {
		testData = iisAccountBalanceCheckingExcelData.getTestdata("AT_ABC_007_D1");
	}

	@And("^User_609 get the test data set id for AT_AP_024$")
	public void user_609_get_the_test_data_set_id_for_AT_AP_024() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_024_D1");
	}

	@And("^User_609 get the test data set id for AT_AP_058$")
	public void user_609_get_the_test_data_set_id_for_AT_AP_058() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_058_D1");
	}

	@And("^User_609 get the test data set id for AT_AP_030$")
	public void user_609_get_the_test_data_set_id_for_AT_AP_030() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("AT_AP_030_D1");
	}

	@And("^User_609 get the test data set id for AT_AP_060$")
	public void user_609_get_the_test_data_set_id_for_AT_AP_060() throws Throwable {
		testData = mtsExcelData.getTestdata("AT_AP_060_D1");
	}

	@And("^User_609 get the test data set id for AT_AP_061$")
	public void user_609_get_the_test_data_set_id_for_AT_AP_061() throws Throwable {
		testData = mtsExcelData.getTestdata("AT_AP_061_D1");
	}

	@And("^User_609 get the test data set id for AT_AP_062$")
	public void user_609_get_the_test_data_set_id_for_AT_AP_062() throws Throwable {
		testData = mtsExcelData.getTestdata("AT_AP_062_D1");
	}

	@And("^User_609 get the test data set id for AT_APS_030$")
	public void user_609_get_the_test_data_set_id_for_AT_APS_030() throws Throwable {
		testData = iisAdvancePrincipalSettlementExcelData.getTestdata("AT_APS_030_D1");
	}

	@And("^User_609 get the test data set id for AT_APS_031$")
	public void user_609_get_the_test_data_set_id_for_AT_APS_031() throws Throwable {
		testData = iisAdvancePrincipalSettlementExcelData.getTestdata("AT_APS_031_D1");
	}

	@And("^User_609 get the test data set id for AT_APS_032$")
	public void user_609_get_the_test_data_set_id_for_AT_APS_032() throws Throwable {
		testData = iisAdvancePrincipalSettlementExcelData.getTestdata("AT_APS_032_D1");
	}

	// Clear cache step
	@And("User_609 clear the caches in IIS Application")
	public void user_609_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISCoreTechDetailsIcon_609());
		IIS_PageObjects_609.IISCoreTechDetailsIcon_609().click();

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISCoreClearCacheBtn_609());
		IIS_PageObjects_609.IISCoreClearCacheBtn_609().click();

		for (int i = 0; i < 2000; i++) {
			try {
				if (IIS_PageObjects_609.IIS_Ok_609().isDisplayed()) {
					IIS_PageObjects_609.IIS_Ok_609().click();
					break;
				}
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Investment Deals Combined without Trade Deal menu")
	public void user_609_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_609().click();
	}

	@And("User_609 Click the Maintenance under Investment Deals Combined without Trade Deal")
	public void user_609_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_609().click();
	}

	@And("User_609 Select the Party in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_party_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609());

		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609().sendKeys(testData.get("Party"),
				Keys.ENTER);
		Thread.sleep(2000);
		String CifNo = testData.get("Party");
		int CifNoLen = 8 - CifNo.length();
		for (int i = 1; i <= CifNoLen; i++) {
			CifNo = "0" + CifNo;
		}

		// table[@id='gridtab_investmentDeals_PARTY_T022MT']/tbody/tr/td[text()='00001069']
		String xpath = "//table[@id='gridtab_investmentDeals_PARTY_T022MT']/tbody/tr/td[text()='" + CifNo + "']";
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='gridtab_investmentDeals_PARTY_T022MT']/tbody/tr/td[text()='"+CifNo+"']")));

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();

	}

	@And("User_609 Select the Category in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_category_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609()
				.sendKeys(testData.get("Category"), Keys.ENTER);

		// table[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT']/tbody/tr/td[text()='3']
		String xpath = "//table[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT']/tbody/tr/td[text()='"
				+ testData.get("Category") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Product Class in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609()
				.sendKeys(testData.get("Product Class"), Keys.ENTER);

		// table[@id='gridtab_investmentDeals_CLASS_T022MT']/tbody/tr/td[text()='92']
		String xpath = "//table[@id='gridtab_investmentDeals_CLASS_T022MT']/tbody/tr/td[text()='"
				+ testData.get("Product Class") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(3000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Amount in Investment Deals Combined without Trade Deal")
	public void user_609_Enter_the_amount_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609().clear();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609().sendKeys(testData.get("Amount"),
				Keys.TAB);
		Thread.sleep(5000);
	}

	@And("User_609 Enter the Tenure in Investment Deals Combined without Trade Deal")
	public void user_609_Enter_the_tenure_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609());
		clicksAndActionHelper
				.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609());
		Thread.sleep(3000);
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609().sendKeys(testData.get("Tenure"),
				Keys.TAB);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();

	}

	@And("User_609 Enter the Yield in Investment Deals Combined without Trade Deal")
	public void user_609_Enter_the_yield_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609().clear();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609().sendKeys(testData.get("Yield"),
				Keys.TAB);

	}

	@And("User_609 Click the Contributor Details tab in Maintenance under Investment Deals Combined without Trade Deal")
	public void user_609_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_609().click();
	}

	@And("User_609 Double Click the Contributor Details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_609_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_609());
		clicksAndActionHelper.doubleClick(
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_609());
		Thread.sleep(2000);
	}

	@And("User_609 Select the Nostro in Contributor Details tab under Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_nostro_in_Contributor_details_tab_under_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609
				.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_609()
				.click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609()
				.sendKeys(testData.get("Nostro GL"), Keys.ENTER);

		// (//table[@id='gridtab_nostro_sl_T022MT']/tbody/tr/td[text()='101101'])[1]
		String xpath = "(//table[@id='gridtab_nostro_sl_T022MT']/tbody/tr/td[text()='" + testData.get("Nostro GL")
				+ "'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(IIS_PageObjects_609
						.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_609()
						.getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}

	@And("User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_609_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal()
			throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609
				.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_609()
				.click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609().click();
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609()
				.sendKeys(testData.get("Maturity GL"), Keys.ENTER);

		// table[@id='gridtab_matr_ac_sl_T022MT']/tbody/tr/td[text()='411001']
		String xpath = "(//table[@id='gridtab_matr_ac_sl_T022MT']/tbody/tr/td[text()='" + testData.get("Maturity GL")
				+ "'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(IIS_PageObjects_609
						.IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_609()
						.getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}

	@And("User_609 Click the Ok button in Contributor Details tab in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_ok_button_in_contributor_details_tab_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609());
		javaScriptHelper
				.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609().click();
		Thread.sleep(1000);
	}

	@And("User_609 Click the Save button in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_save_button_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Save_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Save_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Save_609().click();

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
		Thread.sleep(2000);
	}

	@And("User_609 Click the Deal Charges Button in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_Deal_Charges_button_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_609().click();
	}

	@And("User_609 Select the Code1 in Deal Charges in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_Code1_in_Deal_Charges_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealChargesPopUp_609());
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_AddIcon_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_AddIcon_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		clicksAndActionHelper
				.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609().sendKeys(testData.get("Code"),
				Keys.TAB);

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609()
				.sendKeys(testData.get("Deal CY"), Keys.TAB);
	}

	@And("User_609 Select the Code2 in Deal Charges in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_Code2_in_Deal_Charges_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		clicksAndActionHelper
				.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609().sendKeys(testData.get("Code"),
				Keys.TAB);

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609()
				.sendKeys(testData.get("Deal CY2"), Keys.TAB);
	}

	@And("User_609 Select the Code3 in Deal Charges in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_Code3_in_Deal_Charges_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		clicksAndActionHelper
				.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609().sendKeys(testData.get("Code"),
				Keys.TAB);

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609()
				.sendKeys(testData.get("Deal CY3"), Keys.TAB);
	}

	@And("User_609 Click the Repayment Plan Button in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_repayment_plan_button_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_609().click();
	}

	@And("User_609 Select the Settlement Type in Repayment Plan")
	public void user_609_Select_the_Settlement_Type_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_609(),
				testData.get("Settlement Type"));
		Thread.sleep(1000);
	}

	@And("User_609 Set Number of Payments in Repayment Plan")
	public void user_609_Set_Number_of_Payments_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609());
		clicksAndActionHelper.doubleClick(
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609()
				.sendKeys(testData.get("No Of Payments "), Keys.TAB);
		Thread.sleep(1000);
	}

	@And("User_609 Set Pay Every in Repayment Plan")
	public void user_609_Set_Pay_Every_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609());
		clicksAndActionHelper
				.doubleClick(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609()
				.sendKeys(testData.get("Pay Every"), Keys.TAB);
		Thread.sleep(1000);
	}

	@And("User_609 Set Pay Every Time Period in Repayment Plan")
	public void user_609_Set_Pay_Every_Time_Period_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEveryTimePeriod_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEveryTimePeriod_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEveryTimePeriod_609(),
				testData.get("Time Period"));
	}

	@And("User_609 Check the Include VAT in Installment flag is Enabled")
	public void user_609_Check_the_Include_VAT_in_Installment_flag_is_Enabled() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_609());
		WebElement VAT = IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_609();
		try {
			if (VAT.isSelected()) {
				Assert.assertTrue(true);
			} else {
				VAT.click();
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Check the Grace period flag is Enabled")
	public void user_609_Check_the_Grace_period_flag_is_Enabled() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_609());
		WebElement Grace_period = IIS_PageObjects_609
				.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_609();
		try {
			if (Grace_period.isSelected()) {
				Assert.assertTrue(true);
			} else {
				Grace_period.click();
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Uncheck the Compounding During Grace period flag is Disabled")
	public void user_609_unheck_the_Compounding_During_Grace_period_flag_is_Enabled() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609
				.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_609());
		WebElement Compounding_During_Grace_period = IIS_PageObjects_609
				.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_609();
		try {
			if (Compounding_During_Grace_period.isSelected()) {
				Compounding_During_Grace_period.click();
			} else {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Click the Create schedule button in Repayment Plan in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_create_schedule_button_in_repayment_plan_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_609().click();
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
	}

	@And("User_609 Click the Close Button in Repayment Plan in Investment Deals Combined without Trade Deal")
	public void user_609_Click_the_Close_Button_in_Repayment_Plan_in_Investment_Deals_Combined_without_Trade_Deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_609());
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_609().click();

	}

	@When("User_609 Validate button in Investment Deals Combined without Trade Deal")
	public void user_609_validate_button_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Validate_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Validate_609().click();

		// div[text()='CONFIRM']
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOkPopUp_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(5000);

		// div[@id='div__popup_path_sol_confirm']/div[2]/div
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOkPopUp_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		if (IIS_PageObjects_609.IIS_ConfirmOk_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}

//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
//		IIS_PageObjects_609.IIS_ConfirmOk_609().click();

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Information_PopUp_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Information_PopUp_TextMsg_609());
		String text = IIS_PageObjects_609.IIS_Information_PopUp_TextMsg_609().getText();
		System.err.println("Text Message: " + text);
		Deal_Number = IIS_PageObjects_609.IIS_Information_PopUp_TextMsg_609().getText().substring(18, 22);
		System.err.println("Reference Number: " + Deal_Number);
		iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"), "Deal Nbr", Deal_Number);
		for (int i = 0; i <= 2000; i++) {
			try {
				IIS_PageObjects_609.IIS_Ok_609().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("User_609 Click on Approve Submenu in Investment Deals Combined without Trade Deal")
	public void user_609_click_on_approve_Submenu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_609());
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_609().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_609 Select the Deal Number in Approve Submenu in Investment Deals Combined without Trade Deal")
	public void user_609_Select_the_deal_number_in_approve_submenu_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609().sendKeys(Deal_Number, Keys.ENTER);

		// table[@id='investmentDealsGridTbl_Id_T022P']/tbody/tr/td[text()='000000005400']
		String xpath = "//table[@id='investmentDealsGridTbl_Id_T022P']/tbody/tr/td[text()='" + "00000000" + Deal_Number
				+ "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User_609 Click the Approve button in Approve Submenu in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_approve_button_in_approve_submenu_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609());
		javaScriptHelper
				.scrollIntoView(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609().click();
		Thread.sleep(3000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());

		if (IIS_PageObjects_609.IIS_ConfirmOk_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		if (IIS_PageObjects_609.IIS_ConfirmOk_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		if (IIS_PageObjects_609.IIS_ConfirmCancel_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
	}

//	
//	
////	@AT_IC_010
//	@And("User_609 Click the Tracking & Incidental Charges module")
//	public void user_609_click_the_tracking_incidental_charges_module() throws Throwable {
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609());
//		IIS_PageObjects_609.IISTrackingIncidentalChargesMenu_609().click();
//	}
//
//	@And("User_609 Click the Reverse menu under Tracking & Incidental Charges")
//	public void user_609_click_the_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesReverseMenu_609());
//		IIS_PageObjects_609.IISTrackingIncidentalChargesReverseMenu_609().click();
//	}
//
//	@And("User_609 Enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges")
//	public void user_609_Enter_the_track_number_in_searchgrid_under_reverse_menu_in_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_609());
//		IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_609().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
//	}
//
//	@And("User_609 double Click the searchgrid row in Reverse menu under Tracking & Incidental Charges")
//	public void user_609_double_click_the_searchgrid_row_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridRow_609());
//		for (int i = 0; i <= 300; i++) {
//			try {
//				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISIncidentalChargesReverseMenuSearchgridRow_609());
//				break;
//			} catch (Exception e) {
//				
//			}
//    	}	    
//	}
//
//	@When("User_609 Click the Reverse button in Reverse menu under Tracking & Incidental Charges")
//	public void user_609_click_the_reverse_button_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesReverseMenuTrackNbr_609());
//	    for(int i = 0; i<= 300; i++) {
//	    	try {
//	    		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISIncidentalChargesReverseMenuReverseBtn_609());
//	    		break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//	    }
//	    IIS_PageObjects_609.IISIncidentalChargesReverseMenuReverseBtn_609().click();
//	    
//	    // Warning pop-up
//	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_WarningPopupOkBtn_609());
//	    IIS_PageObjects_609.IIS_WarningPopupOkBtn_609().click();
//	    
//	    // Information pop-up
//	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InformationPopupOkBtn_609());
//	    for(int i = 0; i <= 2000; i++) {
//	    	try {
//	    		IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
//	    		break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//	    }
//	    
//	}
//
//	@And("User_609 Click the Approve Reverse menu under Tracking & Incidental Charges")
//	public void user_609_click_the_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISTrackingIncidentalChargesApproveReverseMenu_609());
//		IIS_PageObjects_609.IISTrackingIncidentalChargesApproveReverseMenu_609().click();
//	}
//
//	@And("User_609 Enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges")
//	public void user_609_Enter_the_track_number_in_searchgrid_under_approve_reverse_menu_in_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_609());
//		IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_609().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
//	}
//
//	@And("User_609 double Click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges")
//	public void user_609_double_click_the_searchgrid_row_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridRow_609());
//	    for(int i = 0; i <=300; i++) {
//	    	try {
//				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.IISIncidentalChargesApproveReverseSearchgridRow_609());
//				break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//	    }
//	}
//
//	@When("User_609 Click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges")
//	public void user_609_click_the_reverse_button_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IISIncidentalChargesApproveReverseTrackNbr_609());
//		for(int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IISIncidentalChargesApproveReverseMenuReverseBtn_609());
//				break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//		}
//		IIS_PageObjects_609.IISIncidentalChargesApproveReverseMenuReverseBtn_609().click();
//		
//		// Warning pop-up
//	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_WarningPopupOkBtn_609());
//	    IIS_PageObjects_609.IIS_WarningPopupOkBtn_609().click();
//	    
//	    // Information pop-up
//	    waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_InformationPopupOkBtn_609());
//	    for(int i = 0; i <= 2000; i++) {
//	    	try {
//	    		IIS_PageObjects_609.IIS_InformationPopupOkBtn_609().click();
//	    		break;
//			} catch (Exception e) {
//				Assert.fail(e.getMessage());
//			}
//	    }
//	}
//	

	@And("User_609 Click the Search Button in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_Search_Button_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_SearchBtn_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_SearchBtn_609().click();
	}

	@And("User_609 Select the Deal Number under Maintenance in Investment Deals Combined without Trade Deal")
	public void user_609_search_the_deal_number_under_Maintenance_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_DealNumber_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_DealNumber_609().sendKeys(Deal_Number,
				Keys.ENTER);

		// table[@id='investmentDealsGridTbl_Id_T022MT']/tbody/tr/td[text()='000000005462']
		String xpath = "//table[@id='investmentDealsGridTbl_Id_T022MT']/tbody/tr/td[text()='" + "00000000" + Deal_Number
				+ "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Status Button in Investment Deals Combined without Trade Deal")
	public void user_609_click_the_Status_Button_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusBtn_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusBtn_609().click();
	}

	@And("User_609 Check the Server Date is Displaying in Investment Deals Combined without Trade Deal")
	public void user_609_Check_the_Server_Date_is_Displaying_in_investment_deals_combined_without_trade_deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_PopUp_609());
		IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_PopUp_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_ServerDate_609());
		try {
			if (IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_ServerDate_609()
					.isDisplayed()) {
				Assert.assertEquals(true, IIS_PageObjects_609
						.IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_ServerDate_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

///***************************************************** Tracking & Incidental Charges *******************************************************************///

	@And("User_609 Click the Tracking and Incidental Charges menu")
	public void user_609_click_the_Tracking_and_Incidental_Charges_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_609().click();
	}

	@And("User_609 Click the Maintenance Screen in Tracking and Incidental Charges")
	public void user_609_click_the_Maintenance_Screen_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_609().click();
	}

	@And("User_609 Select the Deal Number in Tracking and Incidental Charges")
	public void user_609_select_the_deal_number_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNoSearch_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNoSearch_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609().click();
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609().sendKeys(Deal_Number, Keys.ENTER);
		// IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609().sendKeys("5462",Keys.ENTER);
		// table[@id='gridtab_trs_deal_serial_no_T07MT']/tbody/tr/td[text()='3003']
		String xpath = "//table[@id='gridtab_trs_deal_serial_no_T07MT']/tbody/tr/td[text()='" + Deal_Number + "']";
		// String xpath
		// ="//table[@id='gridtab_trs_deal_serial_no_T07MT']/tbody/tr/td[text()='"+5462+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Charge Code in Tracking and Incidental Charges")
	public void user_609_Select_the_Charge_Code_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCodeSearch_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCodeSearch_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609().click();
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609()
				.sendKeys(testData.get("Category"), Keys.ENTER);
		// IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609().sendKeys("3",Keys.ENTER);
		// table[@id='gridtab_charges_code_T07MT']/tbody/tr/td[text()='3']
		// String xpath
		// ="//table[@id='gridtab_charges_code_T07MT']/tbody/tr/td[text()='"+3+"']";
		String xpath = "//table[@id='gridtab_charges_code_T07MT']/tbody/tr/td[text()='" + testData.get("Category")
				+ "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Charge Allocation Criteria in Tracking and Incidental Charges")
	public void user_609_Select_the_Charge_Allocation_Criteria_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609());
		// dropDownHelper.SelectUsingVisibleText(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609(),
		// "Next Installment");
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609(),
				testData.get("Charge Allocation Criteria"));
		Thread.sleep(1000);
	}

	@And("User_609 Click the Save Button in Tracking and Incidental Charges")
	public void user_609_Click_the_Save_Button_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_Save_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Maintenance_Save_609());
		Thread.sleep(1000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(1000);

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();

	}

	@And("User_609 Click the Approve Screen in Tracking and Incidental Charges")
	public void user_609_Click_the_Approve_Screen_in_Tracking_and_Incidental_Charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_609());
		Thread.sleep(1000);
	}

	@And("User_609 Select the Deal Number in Approve Screen in Tracking and Incidental Charges")
	public void User_609_Select_the_Deal_Number_in_Approve_Screen_in_Tracking_and_Incidental_Charges()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_609());
		IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_609().sendKeys(Deal_Number, Keys.ENTER);
		// IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_609().sendKeys("5462",Keys.ENTER);

		// table[@id='IncidentalChargesGridTbl_Id_T07P']/tbody/tr/td[text()='000000005462']
		String xpath = "//table[@id='IncidentalChargesGridTbl_Id_T07P']/tbody/tr/td[text()='" + Deal_Number + "']";
		// String xpath
		// ="//table[@id='IncidentalChargesGridTbl_Id_T07P']/tbody/tr/td[text()='"+"00000000"+"5462"+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Approve Button in Approve Screen in Tracking and Incidental Charges")
	public void user_609_Click_the_Approve_Button_in_Approve_Screen_in_Tracking_and_Incidental_Charges()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_ApproveBtn_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_TrackingandIncidentalCharges_Approve_DealNo_ApproveBtn_609());
		Thread.sleep(1000);
		Thread.sleep(1000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(1000);

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
	}

	/// ********************************************* Repayment Plan
	/// **********************************************************************///

	@And("User_609 Click the Repayment Plan menu")
	public void user_609_click_the_Repayment_Plan_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_RepaymentPlan_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_609().click();
	}

	@And("User_609 Click the Maintenance Screen in Repayment Plan")
	public void user_609_click_the_Maintenance_Screen_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_609().click();
	}

	@And("User_609 Click the Search Button in Repayment Plan")
	public void user_609_click_the_Search_Button_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_SearchBtn_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_SearchBtn_609().click();
		Thread.sleep(5000);
	}

	@And("User_609 Select the Deal Number in Repayment Plan")
	public void user_609_select_the_deal_number_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_DealNo_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_DealNo_609().click();
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_DealNo_609().sendKeys(Deal_Number, Keys.ENTER);
		// IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_DealNo_609().sendKeys("5462",Keys.ENTER);

		// table[@id='repaymentPlanMgmtGridTbl_Id_T04MT']/tbody/tr/td[text()='000000005462']
		String xpath = "//table[@id='repaymentPlanMgmtGridTbl_Id_T04MT']/tbody/tr/td[text()='" + "00000000"
				+ Deal_Number + "']";
		// String xpath
		// ="//table[@id='repaymentPlanMgmtGridTbl_Id_T04MT']/tbody/tr/td[text()='"+"00000000"+5462+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(8000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Schedule Details tab in Repayment Plan")
	public void user_609_click_the_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_ScheduleDetails_609());
		IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_ScheduleDetails_609().click();
	}

	@And("User_609 Click the Incidental Charge label in Schedule Details tab in Repayment Plan")
	public void user_609_click_the_Incidental_Charge_label_in_Schedule_Details_tab_in_Repayment_Plan()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_ScheduleDetails_IncidentalCharge_609());
		clicksAndActionHelper
				.doubleClick(IIS_PageObjects_609.IIS_RepaymentPlan_Maintenance_ScheduleDetails_IncidentalCharge_609());
	}

	@Then("User_609 Check the Incidental Charges Dispalyed in Schedule Details tab in Repayment Plan")
	public void user_609_check_the_Incidental_Charges_displayed_in_Schedule_Details_tab_in_Repayment_Plan()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_609());
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609());
		try {
			if (IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609().isDisplayed()) {
				Assert.assertEquals(true,
						IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Then("User_609 Check the Charge Name Dispalyed in Schedule Details tab in Repayment Plan")
	public void user_609_check_the_Charge_name_displayed_in_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_609());
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609());
		try {
			if (IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609().isDisplayed()) {
				Assert.assertEquals(true,
						IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Then("User_609 Check the Amount is Dispalyed in Schedule Details tab in Repayment Plan")
	public void user_609_check_the_Amount_is_displayed_in_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609());
		try {
			if (IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609().isDisplayed()) {
				Assert.assertEquals(true,
						IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Then("User_609 Check the Total is Dispalyed in Schedule Details tab in Repayment Plan")
	public void user_609_check_the_total_is_displayed_in_Schedule_Details_tab_in_Repayment_Plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609());
		try {
			if (IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609().isDisplayed()) {
				Assert.assertEquals(true,
						IIS_PageObjects_609.IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609().isDisplayed());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	/// ***************************************************** Settlement
	/// *******************************************************************///

	@And("User_609 Click the Settlement menu")
	public void User_609_Click_the_Settlement_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_Settlement_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_609());
	}

	@And("User_609 Click the Maintenance under Settlement menu")
	public void User_609_Click_the_Maintenance_under_Settlement_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_Maintenance_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Maintenance_609());
	}

	@And("User_609 Select the Deal number in Settlement")
	public void User_609_Select_the_Deal_number_in_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_Settlement_Maintenance_DealNumberSearch_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Maintenance_DealNumberSearch_609());

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_Settlement_Maintenance_DealNumber_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Maintenance_DealNumber_609());
		IIS_PageObjects_609.IIS_Settlement_Maintenance_DealNumber_609().sendKeys(Deal_Number, Keys.ENTER);

		// table[@id='gridtab_dealNo_T06MT']/tbody/tr[2]/td[text()='5462']
		String xpath = "//table[@id='gridtab_dealNo_T06MT']/tbody/tr[2]/td[text()='" + Deal_Number + "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Party Amount in Settlement")
	public void User_609_Enter_the_Party_Amount_in_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_Settlement_Maintenance_PartyAmount_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Maintenance_PartyAmount_609());
		IIS_PageObjects_609.IIS_Settlement_Maintenance_PartyAmount_609().sendKeys(testData.get("Party Amount"),
				Keys.TAB);
	}

	@And("User_609 Click the Automatic Allocation label in Settlement")
	public void User_609_Click_the_Automatic_Allocation_label_in_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_Settlement_Maintenance_AutomaticAllocation_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Maintenance_AutomaticAllocation_609());
	}

	@And("User_609 Click the Save Button in Settlement")
	public void User_609_Click_the_Save_Button_in_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_Settlement_Maintenance_ScheduleDetailsPopUp_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_Maintenance_SaveBtn_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Maintenance_SaveBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
	}

	@And("User_609 Click on Approve Submenu under Settlement menu")
	public void User_609_Click_on_Approve_Submenu_under_Settlement_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_Approve_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Approve_609());
	}

	@And("User_609 Select the Deal number under Approve in Settlement")
	public void User_609_Select_the_Deal_number_under_Approve_in_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_Approve_DealNumber_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Approve_DealNumber_609());
		IIS_PageObjects_609.IIS_Settlement_Approve_DealNumber_609().sendKeys(Deal_Number, Keys.ENTER);

		// table[@id='settlementMgmtGridTbl_Id_T06P']/tbody/tr[2]/td[text()='000000005462']
		String xpath = "//table[@id='settlementMgmtGridTbl_Id_T06P']/tbody/tr[2]/td[text()='" + "00000000" + Deal_Number
				+ "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Approve Button under Approve in Settlement")
	public void User_609_Click_the_Approve_Button_under_Approve_in_Settlement() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_Approve_ApproveBtn_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Approve_ApproveBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(2000);

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
	}

	@And("User_609 Click on Reverse Submenu under Settlement menu")
	public void User_609_Click_on_Reverse_Submenu_under_Settlement_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_Reverse_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_Settlement_Reverse_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Reverse_609());
	}

	@And("User_609 Select the Deal number under Reverse in Settlement")
	public void User_609_Select_the_Deal_number_under_Reverse_in_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_Reverse_DealNumber_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Reverse_DealNumber_609());
		IIS_PageObjects_609.IIS_Settlement_Reverse_DealNumber_609().sendKeys(Deal_Number, Keys.ENTER);

		// table[@id='settlementMgmtGridTbl_Id_T06RR']/tbody/tr/td[text()='000000005462']
		String xpath = "//table[@id='settlementMgmtGridTbl_Id_T06RR']/tbody/tr/td[text()='" + "00000000" + Deal_Number
				+ "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Reverse Button under Reverse in Settlement")
	public void User_609_Click_the_Reverse_Button_under_Reverse_in_Settlement() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_Reverse_ReverseBtn_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_Reverse_ReverseBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(2000);

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
	}

	@And("User_609 Click on Approve Reversal Submenu under Settlement menu")
	public void User_609_Click_on_Approve_Reversal_Submenu_under_Settlement_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Settlement_ApproveReversal_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_ApproveReversal_609());
	}

	@And("User_609 Select the Deal number under Approve Reversal in Settlement")
	public void User_609_Select_the_Deal_number_under_Approve_Reversal_in_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_Settlement_ApproveReversal_DealNumber_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_ApproveReversal_DealNumber_609());
		IIS_PageObjects_609.IIS_Settlement_ApproveReversal_DealNumber_609().sendKeys(Deal_Number, Keys.ENTER);

		// table[@id='settlementMgmtGridTbl_Id_T06V']/tbody/tr/td[text()='000000005462']
		String xpath = "//table[@id='settlementMgmtGridTbl_Id_T06V']/tbody/tr/td[text()='" + "00000000" + Deal_Number
				+ "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Reverse Button under Approve Reversal in Settlement")
	public void User_609_Click_the_Reverse_Button_under_Approve_Reversal_in_Settlement() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_Settlement_ApproveReversal_ReverseBtn_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Settlement_ApproveReversal_ReverseBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(2000);

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
	}

///*************************************************** Periodical Processing ****************************************************************///

	@And("User_609 Click the Periodical Processing menu")
	public void User_609_Click_the_Periodical_Processing_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_PeriodicalProcessing_609());
		javaScriptHelper.scrollIntoView(IIS_PageObjects_609.IIS_PeriodicalProcessing_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_PeriodicalProcessing_609());
	}

	@And("User_609 Click the Post Accruals under Periodical Processing menu")
	public void User_609_Click_the_Post_Accruals_under_Periodical_Processing_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_609());
	}

	@And("User_609 Click the Final Accruals under Post Accruals in Periodical Processing")
	public void User_609_Click_the_Final_Accruals_under_Post_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_609());
	}

	@And("User_609 Enable the Specific Deal Flag in Periodical Processing")
	public void User_609_Enable_the_Specific_Deal_Flag_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_609());
		try {
			if (IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_609()
					.isSelected()) {
				Assert.assertTrue(true);
			} else {
				clicksAndActionHelper.clickOnElement(
						IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_609());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Select the Deal number under Final Accruals in Periodical Processing")
	public void User_609_Select_the_Deal_number_under_Final_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_609());

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_609());
		IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_609().sendKeys(Deal_Number,
				Keys.ENTER);

		// table[@id='gridtab_postChargeAccuralProcessSpecificDeal_T10EMF']/tbody/tr[2]//td[text()='5464']
		String xpath = "//table[@id='gridtab_postChargeAccuralProcessSpecificDeal_T10EMF']/tbody/tr[2]/td[text()='"
				+ Deal_Number + "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the From Date under Final Accruals in Periodical Processing")
	public void User_609_Select_the_From_Date_under_Final_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_609());
		IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_609()
				.sendKeys(testData.get("From Date"), Keys.TAB);
	}

	@And("User_609 Select the To Date under Final Accruals in Periodical Processing")
	public void User_609_Select_the_To_Date_under_Final_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_609());
		IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_609()
				.sendKeys(testData.get("To Date"), Keys.TAB);
	}

	@And("User_609 Click the Ok Button under Final Accruals in Periodical Processing")
	public void User_609_Click_the_Ok_Button_under_Final_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
	}

//	MTS Application
//	@AT_AP_023_02
	@And("User_609 Click the Parameter menu in MTS Application")
	public void user_609_click_the_parameter_menu_in_mts_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTSParameterModule_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.MTSParameterModule_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Batch submenu under Parameter menu")
	public void user_609_click_the_batch_submenu_under_parameter_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTSParameterBatch_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.MTSParameterBatch_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Maintenance screen under Batch in Parameters")
	public void user_609_click_the_maintenance_screen_under_batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTSParameterBatchMaintenance_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IIS_PageObjects_609.MTSParameterBatchMaintenance_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Additional Reference Number under Batch in Parameters")
	public void user_609_enter_the_additional_Reference_number_under_batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMaintenanceAdditionalRefNbr_608());
		Random random = new Random();
		Application_Ref = random.nextInt(5000 - 500) + 5000;
		IIS_PageObjects_609.MTSParamBatchMaintenanceAdditionalRefNbr_608().sendKeys(String.valueOf(Application_Ref),
				Keys.TAB);
		mtsExcelData.updateTestData(testData.get("DataSet ID"), "Additional Ref", String.valueOf(Application_Ref));

		// IIS_PageObjects_609.MTSParamBatchMaintenanceAdditionalRefNbr_608().sendKeys(testData.get("Additional
		// Ref"),Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(IIS_PageObjects_609.MTSParamBatchMaintenanceAdditionalRefNbr_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Brief Name under Batch in Parameters")
	public void user_609_enter_the_brief_name_under_batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTSParamBatchMaintenanceBriefName_608());
		// IIS_PageObjects_609.MTSParamBatchMaintenanceBriefName_608().sendKeys(testData.get("Brief
		// Name"),Keys.TAB);

		Random random = new Random();
		Menu_Ref = random.nextInt(500 - 50) + 500;
		mtsExcelData.updateTestData(testData.get("DataSet ID"), "Menu Ref", String.valueOf(Menu_Ref));
		Brief_Name = "EOD" + String.valueOf(Menu_Ref);
		IIS_PageObjects_609.MTSParamBatchMaintenanceBriefName_608().sendKeys(Brief_Name, Keys.TAB);
		mtsExcelData.updateTestData(testData.get("DataSet ID"), "Brief Name", Brief_Name);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(IIS_PageObjects_609.MTSParamBatchMaintenanceBriefName_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Long Name under Batch in Parameters")
	public void user_609_enter_the_long_name_under_batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTSParamBatchMaintenanceLongName_608());
		// IIS_PageObjects_609.MTSParamBatchMaintenanceLongName_608().sendKeys(testData.get("Long
		// Name"),Keys.TAB);

		Long_Name = "EOD" + String.valueOf(Menu_Ref);
		IIS_PageObjects_609.MTSParamBatchMaintenanceBriefName_608().sendKeys(Long_Name, Keys.TAB);
		mtsExcelData.updateTestData(testData.get("DataSet ID"), "Long Name", Long_Name);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(IIS_PageObjects_609.MTSParamBatchMaintenanceLongName_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Menu Reference number under Batch in Parameters")
	public void user_609_enter_the_menu_Reference_number_under_batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTSParamBatchMaintenanceMenuRefNbr_608());
		// IIS_PageObjects_609.MTSParamBatchMaintenanceMenuRefNbr_608().sendKeys(testData.get("Menu
		// Ref"),Keys.TAB);
		IIS_PageObjects_609.MTSParamBatchMaintenanceMenuRefNbr_608().sendKeys(String.valueOf(Menu_Ref), Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(IIS_PageObjects_609.MTSParamBatchMaintenanceMenuRefNbr_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Periodicity under Batch in Parameters")
	public void user_609_select_the_periodicity_under_batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMaintenancePeriodicityDropdown_608());
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(
						IIS_PageObjects_609.MTSParamBatchMaintenancePeriodicityDropdown_608(),
						testData.get("Periodicity DD"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Oracle BAJ under Companies in Batch Details tab under Batch in Parameters")
	public void user_609_click_the_oracle_baj_under_companies_in_batch_details_tab_under_under_Batch_in_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMainBatchDetailsTabOracleBAJ_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchMainBatchDetailsTabOracleBAJ_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Head office under Oracle BAJ under Batch in Parameters")
	public void user_609_select_the_head_office_under_oracle_baj_under_Batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Select the ICD Treasury-Invest under Oracle BAJ under Batch in Parameters")
	public void user_609_select_the_icd_treasury_invest_under_oracle_baj_under_Batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Click the Financing and Treasury under Processes in Batch Details tab under Batch in Parameters")
	public void user_609_click_the_financing_and_treasury_under_processes_in_batch_details_tab_under_Batch_in_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMainProcessFinancingTreasury_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchMainProcessFinancingTreasury_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Select the Create settlement in Financing and Treasury under Batch in Parameters")
	public void user_609_select_the_create_settlement_in_financing_and_treasury_under_Batch_in_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMainProcessFinancingTreasuryCreateSettlement_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchMainProcessFinancingTreasuryCreateSettlement_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Approve settlement under Financing and Treasury under Batch in Parameters")
	public void user_609_select_the_approve_settlement_under_financing_and_treasury_under_Batch_in_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMainProcessFinancingTreasuryApproveSettlement_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchMainProcessFinancingTreasuryApproveSettlement_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Select the Profit Accrual Process under Financing and Treasury under Batch in Parameters")
	public void user_609_select_the_profit_accrual_process_under_financing_and_treasury_under_Batch_in_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Click the Batch Control tab in Maintenance under Batch in Parameters")
	public void user_609_click_the_batch_control_tab_in_maintenance_under_batch_in_Parameters() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.MTSParamBatchMainBatchControlTab_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchMainBatchControlTab_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Process Batch under Batch Control tab in Maintenance")
	public void user_609_select_the_process_batch_as_manual_under_batch_control_tab_in_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchMainBatchControlTabProcessBatchDropdown_608());
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(
						IIS_PageObjects_609.MTSParamBatchMainBatchControlTabProcessBatchDropdown_608(),
						testData.get("Process Batch DD"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User_609 Click the Save Button under Batch in Parameters")
	public void user_609_click_the_save_button_under_batch_in_parameters() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.MTSParamBatchMaintenanceSaveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IIS_PageObjects_609.MTSParamBatchMaintenanceSaveBtn_608().click();

		for (int i = 0; i <= 1000; i++) {
			try {
				IIS_PageObjects_609.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Click the Approve screen under Batch in Parameters")
	public void user_609_click_the_approve_screen_under_batch_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTSParamBatchApproveMenu_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IIS_PageObjects_609.MTSParamBatchApproveMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Search the Additional Reference number in Approve screen under Batch in Parameters")
	public void user_609_search_the_additional_Reference_number_in_approve_screen_under_batch_in_parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchApproveMenuSearchgridAdditionalRefInput_608());
		IIS_PageObjects_609.MTSParamBatchApproveMenuSearchgridAdditionalRefInput_608()
				.sendKeys(testData.get("Additional Ref"), Keys.ENTER);
	}

	@And("User_609 Select the Additional Reference number in Approve screen under Batch in Parameters")
	public void user_609_select_the_additional_Reference_number_in_approve_screen_under_batch_in_parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTSParamBatchApproveMenuSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.doubleClick(IIS_PageObjects_609.MTSParamBatchApproveMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(IIS_PageObjects_609.MTSParamBatchApproveMenuAdditionalRef_608().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User_609 Click the Approve button in Approve under Batch in Parameters")
	public void user_609_click_the_approve_button_in_approve_under_batch_in_parameters() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(IIS_PageObjects_609.MTSParamBatchApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IIS_PageObjects_609.MTSParamBatchApproveMenuApproveBtn_608().click();

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_WarningPopupOkBtn_608());
		IIS_PageObjects_609.IIS_WarningPopupOkBtn_608().click();

		for (int i = 0; i <= 1000; i++) {
			try {
				IIS_PageObjects_609.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Refresh the MTS Application")
	public void user_609_refresh_the_mts_application() throws Throwable {
		driver.navigate().refresh();
	}

	@And("User_609 Click the Process menu in MTS Application")
	public void user_609_click_the_process_menu_in_mts_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTS_Process_609());
		IIS_PageObjects_609.MTS_Process_609().click();
	}

	@And("User_609 Click the Batch Process submenu under Process menu")
	public void user_609_click_the_batch_process_submenu_under_process_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTS_Process_BatchProcess_609());
		IIS_PageObjects_609.MTS_Process_BatchProcess_609().click();

	}

	@And("User_609 Select the Created Batch under Batch process")
	public void user_609_select_the_created_batch_under_batch_process() throws Throwable {
		Thread.sleep(5000);
		String newBatch = testData.get("Brief Name");
		System.err.println("Brief Name: " + newBatch);
		WebElement newBatchmenu = driver.findElement(By.xpath("//td[contains(text(),'" + newBatch + "')]"));
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(newBatchmenu);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, newBatchmenu);
		for (int i = 0; i <= 500; i++) {
			try {
				newBatchmenu.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Batch Run under New Batch in Batch Process")
	public void user_609_click_the_batch_run_under_new_batch_in_batch_process() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.MTS_Process_BatchProcess_BatchRun_609());
		IIS_PageObjects_609.MTS_Process_BatchProcess_BatchRun_609().click();
	}

	@And("User_609 Enter the Batch Run Date in Batch Run under Batch Process")
	public void user_609_enter_the_batch_run_date_in_batch_run_under_batch_process() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTS_Process_BatchProcess_BatchRun_Date_609());
		IIS_PageObjects_609.MTS_Process_BatchProcess_BatchRun_Date_609().sendKeys(testData.get("Batch Run Date"),
				Keys.TAB);
	}

	@When("User_609 Click the Run button in Batch Run under Batch Process")
	public void user_609_click_the_run_button_in_batch_run_under_batch_process() {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.MTS_Process_BatchProcess_BatchRun_RunBtn_609());
		IIS_PageObjects_609.MTS_Process_BatchProcess_BatchRun_RunBtn_609().click();
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
	}

	/// ************************************************** SADS
	/// ****************************************************************************///

	@And("User_609 Click on the Parameters menu in iis")
	public void User_609_Click_on_the_Parameters_menu_in_iis() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.Sads_Parameters_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Sads_Parameters_609());

	}

	@And("User_609 Click on Account Restriction submenu in Parameters")
	public void User_609_Click_on_Account_Restriction_submenu_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_609());
	}

	@And("User_609 Click on the Maintenance screen under Account Restriction in Parameters")
	public void User_609_Click_on_the_Maintenance_screen_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_609());
	}

	@And("User_609 Enter the Code under Account Restriction in Parameters")
	public void User_609_Enter_the_Code_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Code_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Code_609());
		Random random = new Random();
		Sads_Code = random.nextInt(500 - 50) + 500;
		IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Code_609()
				.sendKeys(String.valueOf(Sads_Code), Keys.TAB);
	}

	@And("User_609 Enter the Description under Account Restriction in Parameters")
	public void User_609_Enter_the_Description_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Description_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Description_609());
		IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Description_609()
				.sendKeys(testData.get("Description"), Keys.TAB);
	}

	@And("User_609 Select the Application OPt under Account Restriction in Parameters")
	public void User_609_Select_the_Application_OPt_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_609());

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_Root_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_Root_609());
	}

	@And("User_609 Select the Companies under Account Restriction in Parameters")
	public void User_609_Select_the_Companies_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Companies_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Companies_609());

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Companies_Root_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Companies_Root_609());
		Thread.sleep(10000);
	}

	@And("User_609 Select the User id under Account Restriction in Parameters")
	public void User_609_Select_the_User_id_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Userid_609());

		// table[@id='userGridId_UR00M']/tbody/tr[2]/td[1]
		String xpath = "//table[@id='userGridId_UR00M']/tbody/tr[2]/td[1]";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.clickOnElement(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Restricting Type under Account Restriction in Parameters")
	public void User_609_Select_the_Restricting_Type_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_AddIcon_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_AddIcon_609());

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_RestrictionType_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_RestrictionType_609(),
				testData.get("Restriction Type"));
	}

	@And("User_609 Select the GL code under Account Restriction in Parameters")
	public void User_609_Select_the_GL_code_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_GLSearch_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_GLSearch_609());

		// table[@id='gridtab_glCode_no_UR00M']//tr[2]/td[1]
		String xpath = "//table[@id='gridtab_glCode_no_UR00M']//tr[2]/td[1]";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Click on Save Button under Account Restriction in Parameters")
	public void User_609_Click_on_Save_Button_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Save_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Maintenance_Save_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Ok_609());

	}

	@And("User_609 Click on Approve screen under Account Restriction in Parameters")
	public void User_609_Click_on_Approve_screen_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Approve_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Approve_609());
	}

	@And("User_609 Select the Code in Approve under Account Restriction in Parameters")
	public void User_609_Select_the_Code_in_Approve_under_Account_Restriction_in_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Approve_Code_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Approve_Code_609());

		// table[@id='ctsRestrictionsListGridTbl_Id_UR00P']//tr/td[text()='1254']
		String xpath = "//table[@id='ctsRestrictionsListGridTbl_Id_UR00P']//tr/td[text()='" + Sads_Code + "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Approve Button in Approve under Account Restriction in Parameters")
	public void User_609_Click_the_Approve_Button_in_Approve_under_Account_Restriction_in_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Approve_ApproveBtn_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Sads_Parameters_AccountRestrictions_Approve_ApproveBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Ok_609());
	}

	/// ******************************************** Advance Principal Settlement
	/// *************************************************************///

	@And("User_609 Click the Advance Principal Settlement menu")
	public void User_609_Click_the_Advance_Principal_Settlement_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_609());

	}

	@And("User_609 Click the Maintenance under Advance Principal Settlement")
	public void User_609_Click_the_Maintenance_under_Advance_Principal_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_609());

	}

	@And("User_609 Select the Deal number in Maintenance screen under Advance Principal Settlement")
	public void User_609_Select_the_Deal_number_in_Maintenance_screen_under_Advance_Principal_Settlement()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_DealNoSearch_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_DealNoSearch_609());

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_DealNo_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_DealNo_609());
		IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_DealNo_609().sendKeys(testData.get(Deal_Number),
				Keys.ENTER);

		// table[@id='gridtab_dealNo_T036MT']/tbody/tr/td[text()='5689']
		String xpath = "//table[@id='gridtab_dealNo_T036MT']/tbody/tr/td[text()='" + Deal_Number + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Advance Principal in Maintenance under Advance Principal Settlement")
	public void User_609_Enter_the_Advance_Principal_in_Maintenance_under_Advance_Principal_Settlement()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_AdvancePrincipal_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_AdvancePrincipal_609());
		IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_AdvancePrincipal_609()
				.sendKeys(testData.get("Advance Principal"), Keys.TAB);

	}

	@And("User_609 Click the Reschedule&Allocate Button in Maintenance under Advance Principal Settlement")
	public void User_609_Click_the_RescheduleAllocate_Button_in_Maintenance_under_Advance_Principal_Settlement()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_RescheduleAllocateBtn_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_RescheduleAllocateBtn_609());
	}

	@And("User_609 Click the Save button in Maintenance under Advance Principal Settlement")
	public void User_609_Click_the_Save_button_in_Maintenance_under_Advance_Principal_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_ScheduleDetailsTable_609());
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_Save_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_Save_609());
	}

	@And("User_609 Click the Approve Screen in Advance Principal Settlement")
	public void User_609_Click_the_Approve_Screen_in_Advance_Principal_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Approve_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Approve_609());
	}

	@And("User_609 Select the Deal number in Approve under Advance Principal Settlement")
	public void User_609_Select_the_Deal_number_in_Approve_under_Advance_Principal_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_ScheduleDetailsTable_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_Save_609());
		IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Maintenance_DealNo_609().sendKeys(testData.get(Deal_Number),
				Keys.ENTER);

		// table[@id='settlementMgmtGridTbl_Id_T036P']/tbody/tr[2]/td[@tdlabel='Deal
		// Nbr' and text()='000000005689']
		String xpath = "//table[@id='settlementMgmtGridTbl_Id_T036P']/tbody/tr[2]/td[@tdlabel='Deal Nbr' and text()='"
				+ "00000000" + Deal_Number + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the Approve button in Approve under Advance Principal Settlement")
	public void User_609_Click_the_Approve_button_in_Approve_under_Advance_Principal_Settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Approve_ApproveBtn_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_AdvancePrincipalSettlement_Approve_ApproveBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOkPopUp_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(3000);

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOkPopUp_609());
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		if (IIS_PageObjects_609.IIS_ConfirmOk_609().isDisplayed()) {
			IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		}

	}

	/// *********************** Authorization Limit
	/// *******************************////

	@And("User_609 Click the Limit_Management menu")
	public void User_609_Click_the_Limit_Management_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_LimitManagement_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_609());
	}

	@And("User_609 Click the Authorization limit submenu under Limit Management")
	public void User_609_Click_the_Authorization_limit_submenu_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_609());
	}

	@And("User_609 Click the Maintenance screen in Authorization limit under Limit Management")
	public void User_609_Click_the_Maintenance_screen_in_Authorization_limit_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_609());
		Thread.sleep(5000);
	}

	@And("User_609 Click the Search Button in Authorization limit under Limit Management")
	public void User_609_Click_the_Search_Button_in_Authorization_limit_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_SearchBtn_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_SearchBtn_609());
		Thread.sleep(2000);
	}

	@And("User_609 Click the New Button in Authorization limit under Limit Management")
	public void User_609_Click_the_New_Button_in_Authorization_limit_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_NewBtn_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_NewBtn_609());
	}

	@And("User_609 Verify the Maintenance Screen loads Completely in Authorization limit under Limit Management")
	public void User_609_Verify_the_Maintenance_Screen_loads_Completely_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609());
		try {
			if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609()
					.isDisplayed()) {
				Assert.assertEquals(IIS_PageObjects_609
						.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609().isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Verify the Approve Screen loads Completely in Authorization limit under Limit Management")
	public void User_609_Verify_the_Approve_Screen_loads_Completely_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609());
		try {
			if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609().isDisplayed()) {
				Assert.assertEquals(
						IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609().isDisplayed(),
						true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Select the User ID in Authorization limit under Limit Management")
	public void User_609_Select_the_User_ID_in_Authorization_limit_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609());
//		for (int a = 1; a <= 50; a++) {
//			if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609()
//					.isDisplayed()) {
//				clicksAndActionHelper.clickOnElement(
//						IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609());
//				Thread.sleep(2000);
//				break;
//			}
//		}
		int Pageno = 1, j = 1;
		for (int i = 1; i < 50; i++) {
			System.out.println("value of i is :" + i);
			try {
				if (i % 6 > 0) {
					clicksAndActionHelper.clickOnElement(
							IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609());
					Thread.sleep(2000);
					WebElement Page = driver.findElement(By.xpath(
							"//td[@id='pagerid_userid_M06MT_center']//td[text()='Page ']//following-sibling::td/input"));
					Page.clear();
					Page.sendKeys(String.valueOf(Pageno), Keys.ENTER);
					Thread.sleep(1000);
					j += 1;
					clicksAndActionHelper.doubleClick(driver
							.findElement(By.xpath("//table[@id='gridtab_userid_M06MT']/tbody/tr[" + j + "]/td[1]")));
					Thread.sleep(2000);

					// String user = null;
					WebElement UserName = driver.findElement(By.xpath("//input[@id='first_name_M06MT']"));
					WebElement Useridfind = driver.findElement(By.xpath("//input[@id='lookuptxt_userid_M06MT']"));
					for (int j2 = 0; j2 < 200; j2++) {
						user = UserName.getAttribute("prevvalue");
						userid = Useridfind.getAttribute("prevvalue");
						if (!user.isBlank() || !user.isEmpty()) {
							System.out.println("user Name is : " + user);
							System.out.println("user id is : " + userid);
							break;
						}
					}

//					if ((boolean) IIS_PageObjects_609.IIS_Ok_609().isDisplayed()) {
//						clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Ok_609());
//						Thread.sleep(1000);
//					}
					if ((boolean) driver.getPageSource().contains("[900298] Duplicate Value")) {
						clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Ok_609());
						Thread.sleep(1000);
					} else {
						break;
					}
				} else if (i % 6 == 0) {
					Pageno += 1;
					j = 1;
					j += 1;
					for (int a = 1; a <= 50; a++) {
						if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609()
								.isDisplayed()) {
							clicksAndActionHelper.clickOnElement(IIS_PageObjects_609
									.IIS_LimitManagement_AuthorizationLimit_Maintenance_UserIDSearch_609());
							break;
						}
					}
					Thread.sleep(2000);
					WebElement PageFind = driver.findElement(By.xpath(
							"//td[@id='pagerid_userid_M06MT_center']//td[text()='Page ']//following-sibling::td/input"));
					PageFind.clear();
					PageFind.sendKeys(String.valueOf(Pageno), Keys.ENTER);
					Thread.sleep(1000);

					clicksAndActionHelper.doubleClick(driver
							.findElement(By.xpath("//table[@id='gridtab_userid_M06MT']/tbody/tr[" + j + "]/td[1]")));
					Thread.sleep(1000);
					WebElement UserName = driver.findElement(By.xpath("//input[@id='first_name_M06MT']"));
					// String user = null;
					for (int j2 = 0; j2 < 200; j2++) {
						user = UserName.getAttribute("prevvalue");
						if (!user.isBlank() || !user.isEmpty()) {
							System.out.println("user Name is : " + user);
							break;
						}
					}
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}

	@And("User_609 Enter the Authorization Limit in Authorization limit under Limit Management")
	public void User_609_Enter_the_Authorization_Limit_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_AuthorizationLimit_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_AuthorizationLimit_609());
		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_AuthorizationLimit_609()
				.sendKeys(testData.get("Authorization Limit"), Keys.TAB);
		Thread.sleep(1000);
	}

	@And("User_609 Enter the Percentage in Authorization limit under Limit Management")
	public void User_609_Enter_the_Percentage_in_Authorization_limit_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_Percentage_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_Percentage_609());
		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_Percentage_609()
				.sendKeys(testData.get("Percentage"), Keys.TAB);
		Thread.sleep(1000);
	}

	@And("User_609 Click the Save Button in Authorization limit under Limit Management")
	public void User_609_Click_the_Save_Button_in_Authorization_limit_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Savebtn_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Savebtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_ConfirmOk_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Ok_609());
	}

	@And("User_609 Click the Approve screen in Authorization limit under Limit Management")
	public void User_609_Click_the_Approve_screen_in_Authorization_limit_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_609());
		Thread.sleep(2000);
	}

	@And("User_609 Select the User ID for Approve in Authorization limit under Limit Management")
	public void User_609_Select_the_User_ID_for_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609());
		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609().sendKeys(userid, Keys.ENTER);

		// table[@id='limitAuthorizationListTbl_Id_M06P']//td[text()='900768']
		String xpath = "//table[@id='limitAuthorizationListTbl_Id_M06P']//td[text()='" + userid + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Click the Approve Button in Authorization limit under Limit Management")
	public void User_609_Click_the_Approve_Button_in_Authorization_limit_under_Limit_Management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_ApproveBtn_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_ApproveBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_ConfirmOk_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Ok_609());
	}

	@And("User_609 Click the Update After Approve screen in Authorization limit under Limit Management")
	public void User_609_Click_the_Update_After_Approve_screen_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_609());
		Thread.sleep(2000);
	}

	@And("User_609 Click Confirm ok to switch tab")
	public void User_609_Click_Confirm_ok_to_switch_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_ConfirmOk_609());
		Thread.sleep(2000);
	}

	@And("User_609 Select the User ID in Update After Approve in Authorization limit under Limit Management")
	public void User_609_Select_the_User_ID_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_UserID_609());
//		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_UserID_609().sendKeys(IISLogin.loginIntoiisApplication2(configFileReader.getIISApplicationUserType())));

		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_UserID_609()
				.sendKeys(iisLoginTestData.get("UserName"), Keys.ENTER);
		System.out.println(iisLoginTestData.get("UserName"));

		Thread.sleep(2000);
		// table[@id='limitAuthorizationListTbl_Id_M06UP']//td[text()='VIJAYK']
		String xpath = "//table[@id='limitAuthorizationListTbl_Id_M06UP']//td[text()='"
				+ iisLoginTestData.get("UserName") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	}

	@And("User_609 Click the Limits in Update After Approve in Authorization limit under Limit Management")
	public void User_609_Click_the_Limits_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_LimitsSelect_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_LimitsSelect_609());

		try {
			if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_LimitsSelect_609()
					.isSelected()) {
				clicksAndActionHelper.clickOnElement(IIS_PageObjects_609
						.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_LimitsSelect_609());
			} else {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Select the User ID in Update After Approve1 in Authorization limit under Limit Management")
	public void User_609_Select_the_User_ID_in_Update_After_Approve1_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_UserID_609());

		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_UserID_609()
				.sendKeys(testData.get("UserName"), Keys.ENTER);
		System.out.println(testData.get("UserName"));

		// table[@id='limitAuthorizationListTbl_Id_M06UP']//td[text()='VIJAYK']
		String xpath = "//table[@id='limitAuthorizationListTbl_Id_M06UP']//td[text()='" + testData.get("UserName")
				+ "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the User ID for Approve after Update in Authorization limit under Limit Management")
	public void User_609_Select_the_User_ID_for_Approve_after_Update_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609());
		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Approve_UserID_609()
				.sendKeys(testData.get("UserName"), Keys.ENTER);

		// table[@id='limitAuthorizationListTbl_Id_M06P']//td[text()='900768']
		String xpath = "//table[@id='limitAuthorizationListTbl_Id_M06P']//td[text()='" + testData.get("UserName")
				+ "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);

	}

	@And("User_609 Click the Update Button in Update After Approve in Authorization limit under Limit Management")
	public void User_609_Click_the_Update_Button__in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_UpdateBtn_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_UpdateBtn_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_ConfirmOk_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_Ok_609());
	}

	@And("User_609 Click the Find Records icon in Authorization limit under Limit Management")
	public void User_609_Click_the_Find_Records_icon_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_ListSearch_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_ListSearch_609());
	}

	@And("User_609 Select the SortBy in Authorization limit under Limit Management")
	public void User_609_Select_the_SortBy_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_ListSearch_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_ListSearch_609());
		Thread.sleep(2000);

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_Sortby_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_Sortby_609(),
				testData.get("SortBy"));
		Thread.sleep(2000);

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_SortbyDecision_609());
		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_SortbyDecision_609()
				.sendKeys(testData.get("Decision"), Keys.ENTER);
		Thread.sleep(2000);

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_Find_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_Find_609());

	}

	@Then("User_609 Click the Page Next Button in Authorization limit under Limit Management")
	public void User_609_Click_the_Page_Next_Button_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageNext_609());
		try {
			if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageNext_609().isDisplayed()) {
				Assert.assertEquals(IIS_PageObjects_609
						.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageNext_609().isDisplayed(), true);
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageNext_609().click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Then("User_609 Click the Page Prev Button in Authorization limit under Limit Management")
	public void User_609_Click_the_Page_Prev_Button_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PagePrev_609());
		try {
			if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PagePrev_609().isDisplayed()) {
				Assert.assertEquals(IIS_PageObjects_609
						.IIS_LimitManagement_AuthorizationLimit_Maintenance_PagePrev_609().isDisplayed(), true);
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PagePrev_609().click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Then("User_609 Click the Page Last Button in Authorization limit under Limit Management")
	public void User_609_Click_the_Page_Last_Button_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageLast_609());
		try {
			if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageLast_609().isDisplayed()) {
				Assert.assertEquals(IIS_PageObjects_609
						.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageLast_609().isDisplayed(), true);
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageLast_609().click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Then("User_609 Click the Page First Button in Authorization limit under Limit Management")
	public void User_609_Click_the_Page_First_Button_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageFirst_609());
		try {
			if (IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageFirst_609().isDisplayed()) {
				Assert.assertEquals(IIS_PageObjects_609
						.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageFirst_609().isDisplayed(), true);
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_PageFirst_609().click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Click the Limits Details tab in Update After Approve in Authorization limit under Limit Management")
	public void User_609_Click_the_Limits_Details_tab_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_LimitDetailsTab_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_LimitDetailsTab_609());
	}

	@And("User_609 Click the Add icon in Update After Approve in Authorization limit under Limit Management")
	public void User_609_Click_the_Add_icon_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_LimitDetailsTab_Addicon_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_LimitDetailsTab_Addicon_609());
		Thread.sleep(2000);
	}

	@And("User_609 Enter the Intra Day Limit in Update After Approve in Authorization limit under Limit Management")
	public void User_609_Enter_the_Intra_Day_Limit_in_Update_After_Approve_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609
				.IIS_LimitManagement_AuthorizationLimit_Maintenance_LimitDetailsTab_IntraDayLimit_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609
				.IIS_LimitManagement_AuthorizationLimit_Maintenance_LimitDetailsTab_IntraDayLimit_609());
		IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_Maintenance_LimitDetailsTab_IntraDayLimit_609()
				.sendKeys(testData.get("Limit"), Keys.TAB);
	}

	@And("User_609 Check the Limit cannot be greater than User Limit is Displaying")
	public void User_609_Check_the_Limit_cannot_be_greater_than_User_Limit_is_Displaying() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		try {
			if (IIS_PageObjects_609.IIS_Ok_609().isDisplayed()) {
				Assert.assertEquals(IIS_PageObjects_609.IIS_Ok_609().isDisplayed(), true);
				IIS_PageObjects_609.IIS_Ok_609().click();
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Click the Verify screen under Investment Deals Combined without Trade Deal")
	public void User_609_Click_the_Verify_screen_under_Investment_Deals_Combined_without_Trade_Deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Verify_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Verify_609());
	}

	@And("User_609 Validate the Verify Screen loads Completely under Investment Deals Combined without Trade Deal")
	public void User_609_Validate_the_Verify_screen_loads_Completely_under_Investment_Deals_Combined_without_Trade_Deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Verify_Userid_609());
		try {
			if (IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Verify_Userid_609().isDisplayed()) {
				Assert.assertEquals(
						IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Verify_Userid_609().isDisplayed(), true);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Validate the Approve Screen loads Completely under Investment Deals Combined without Trade Deal")
	public void User_609_Validate_the_Approve_screen_loads_Completely_under_Investment_Deals_Combined_without_Trade_Deal()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609());
		try {
			if (IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609().isDisplayed()) {
				Assert.assertEquals(
						IIS_PageObjects_609.IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609().isDisplayed(),
						true);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	//// ************************************ IIS Parameter
	//// *********************************************////

	@And("User_609 Click on the Product Class submenu")
	public void User_609_Click_on_the_Product_Class_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.Parameters_ProductClass_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_609());

	}

	@And("User_609 Click on the Maintenance screen in Product Class under Parameters")
	public void User_609_Click_on_the_Maintenance_screen_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.Parameters_ProductClass_Maintenance_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_609());

	}

	@And("User_609 Click on the Search Button in Product Class under Parameters")
	public void User_609_Click_on_the_Search_Button_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_SearchBtn_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_SearchBtn_609());
		Thread.sleep(3000);

	}

	@And("User_609 Select the Product Class in Product Class under Parameters")
	public void User_609_Select_the_Product_Class_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Class_609());
//		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Class_609());
		IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Class_609().sendKeys(testData.get("Product Class"),
				Keys.ENTER);
		Thread.sleep(10000);

		String Class = testData.get("Product Class");
		int ClassLen = 4 - Class.length();
		for (int i = 1; i <= ClassLen; i++) {
			Class = "0" + Class;
		}

		// table[@id='iISProductClassListGridTbl_Id_M003MT']/tbody/tr/td[text()='0100']
		String xpath = "//table[@id='iISProductClassListGridTbl_Id_M003MT']/tbody/tr/td[text()='" + Class + "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);

					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(5000);
	}

	@And("User_609 Click on the Profit Calculation tab in Product Class under Parameters")
	public void User_609_Click_on_the_Profit_Calculation_tab_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_609());
		Thread.sleep(2000);

	}

	@And("User_609 Check the flag Buy Back is displaying and Enable it in Product Class under Parameters")
	public void User_609_Check_the_flag_Buy_Back_is_displaying_and_Enable_it_in_Product_Class_under_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_BuyBack_609());
		try {
			if (!IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_BuyBack_609().isSelected()) {
				Assert.assertEquals(!IIS_PageObjects_609
						.Parameters_ProductClass_Maintenance_ProfitCalculation_BuyBack_609().isSelected(), true);
				clicksAndActionHelper.clickOnElement(
						IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_BuyBack_609());
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Select the Based on value in Update After Approve1 in Authorization limit under Limit Management")
	public void User_609_Select_the_Based_on_value_in_Update_After_Approve1_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_Basedonvalue_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_Basedonvalue_609(),
				testData.get("BasedonValue"));
		Thread.sleep(2000);
	}

	@And("User_609 Enter the Limit in Update After Approve1 in Authorization limit under Limit Management")
	public void User_609_Enter_the_Limit_in_Update_After_Approve1_in_Update_After_Approve1_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_Limit_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_BuyBack_609());
		IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_BuyBack_609()
				.sendKeys(testData.get("Limit"));
		Thread.sleep(2000);
	}

	@And("User_609 Select the Validation Type in Update After Approve1 in Authorization limit under Limit Management")
	public void User_609_Select_the_Validation_Type_in_Update_After_Approve1_in_Authorization_limit_under_Limit_Management()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_ValidationType_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.IIS_LimitManagement_AuthorizationLimit_UpdateAfterApprove_ValidationType_609(),
				testData.get("Validation Type"));
		Thread.sleep(2000);
	}

	@And("User_609 Click on the Additional Information2 tab in Product Class under Parameters")
	public void User_609_Click_on_the_Additional_Information2_tab_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformation2_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformation2_609());
		Thread.sleep(2000);

	}

	@And("User_609 Check the field percentage of Deal Tenure available in Period field in Product Class under Parameters")
	public void User_609_Check_the_field_percentage_of_Deal_Tenure_available_in_Period_field_in_Product_Class_under_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformation2_DealTenure_609());
		try {
			if (IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformation2_DealTenure_609()
					.isDisplayed()) {
				Assert.assertEquals(IIS_PageObjects_609
						.Parameters_ProductClass_Maintenance_AdditionalInformation2_DealTenure_609().isDisplayed(),
						true);
				Assert.assertEquals(IIS_PageObjects_609
						.Parameters_ProductClass_Maintenance_AdditionalInformation2_DealTenure_609().isEnabled(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Then("User_609 Select the Calculate Profit in Product Class under Parameters")
	public void User_609_Select_the_Calculate_Profit_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_CalculateProfit_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_CalculateProfit_609(),
				testData.get("Calculate Profit"));
		Thread.sleep(2000);
	}

	@And("User_609 Select the Profit Distribution Method in Product Class under Parameters")
	public void User_609_Select_the_Profit_Distribution_Method_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609
				.Parameters_ProductClass_Maintenance_ProfitCalculation_ProfitDistributionMethod_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609
						.Parameters_ProductClass_Maintenance_ProfitCalculation_ProfitDistributionMethod_609(),
				testData.get("Profit Distribution Method"));
		Thread.sleep(2000);
	}

	@And("User_609 Click the Allocation Others tab in Product Class under Parameters")
	public void User_609_Click_the_Allocation_Others_tab_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformation2_AllocationOthers_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformation2_AllocationOthers_609());
	}

	@And("User_609 Check the Project Finance deal is Displaying in Product Class under Parameters")
	public void User_609_Check_the_Project_Finance_deal_is_Displaying_in_Product_Class_under_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609
				.Parameters_ProductClass_Maintenance_AdditionalInformation2_AllocationOthers_ProjectFinancedeal_609());
		try {
			if (IIS_PageObjects_609
					.Parameters_ProductClass_Maintenance_AdditionalInformation2_AllocationOthers_ProjectFinancedeal_609()
					.isDisplayed()) {
				Assert.assertEquals(IIS_PageObjects_609
						.Parameters_ProductClass_Maintenance_AdditionalInformation2_AllocationOthers_ProjectFinancedeal_609()
						.isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_609 Validate the Maintenance Button loads completely in Product Class under Parameters")
	public void User_609_Validate_the_Maintenance_Button_loads_completely_in_Product_Class_under_Parameters()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_SearchBtn_609());
		try {
			if (IIS_PageObjects_609.Parameters_ProductClass_Maintenance_SearchBtn_609().isDisplayed()) {
				Assert.assertEquals(
						IIS_PageObjects_609.Parameters_ProductClass_Maintenance_SearchBtn_609().isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		Thread.sleep(3000);
	}

	@And("User_609 Select the Application in Product Class under Parameters")
	public void User_609_Select_the_Application_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Application_609());
		dropDownHelper.SelectUsingVisibleText(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Application_609(),
				testData.get("Application"));
		Thread.sleep(2000);
	}

	@And("User_609 Select the Customer in Product Class under Parameters")
	public void User_609_Select_the_Customer_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_CategorySearch_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_CategorySearch_609());
		
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Category_609());
		IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Category_609().sendKeys(testData.get("Customer"),
				Keys.ENTER);

		Thread.sleep(2000);
		// table[@id='gridtab_iisProductClassCategory_M003MT']//td[text()='3']
		String xpath = "//table[@id='gridtab_iisProductClassCategory_M003MT']//td[text()='" + testData.get("Customer")
				+ "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	}

	@And("User_609 Enter the Product Class Code in Product Class under Parameters")
	public void User_609_Enter_the_Product_Class_Code_in_Product_Class_under_Parameters() throws Throwable {

		Random random = new Random();
		ProductclassCode = random.nextInt(5000 - 500) + 5000;
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProductclassCode_609());
		IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProductclassCode_609()
				.sendKeys(String.valueOf(ProductclassCode), Keys.TAB);
		Thread.sleep(2000);
		iisParametersExcelData.updateTestData(testData.get("DataSet ID"), "Product Class Code", String.valueOf(ProductclassCode));
	}

	@And("User_609 Enter the Brief Description in Product Class under Parameters")
	public void User_609_Enter_the_Brief_Description_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_BriefDescription_609());
		IIS_PageObjects_609.Parameters_ProductClass_Maintenance_BriefDescription_609()
				.sendKeys(testData.get("Brief Description")+String.valueOf(ProductclassCode), Keys.TAB);
		Thread.sleep(2000);
	}

	@And("User_609 Enter the Long Description in Product Class under Parameters")
	public void User_609_Enter_the_Long_Description_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_LongDescription_609());
		IIS_PageObjects_609.Parameters_ProductClass_Maintenance_LongDescription_609()
				.sendKeys(testData.get("Long Description")+String.valueOf(ProductclassCode), Keys.TAB);
		Thread.sleep(2000);
	}

	@And("User_609 Enter the Exposure Limit in Product Class under Parameters")
	public void User_609_Enter_the_Exposure_Limit_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_ExposureLimit_609());
		IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_ExposureLimit_609()
				.sendKeys(testData.get("Exposure Limit"), Keys.TAB);
		Thread.sleep(2000);
	}

	@And("User_609 Check the Profit Upfront flag in Product Class under Parameters")
	public void User_609_Check_the_Profit_Upfront_flag_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_ProfitUpfront_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_ProfitCalculation_ProfitUpfront_609());
		Thread.sleep(2000);
	}

	@And("User_609 Click on the Additional Information tab in Product Class under Parameters")
	public void User_609_Click_on_the_Additional_Information_tab_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_609());
		clicksAndActionHelper
				.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_609());
		Thread.sleep(2000);
	}

	@And("User_609 Check the VAT Applicable flag in Product Class under Parameters")
	public void User_609_Check_the_VAT_Applicable_flag_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_VatApplicable_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_VatApplicable_609());
		Thread.sleep(2000);
	}

	@And("User_609 Select the VAT Code in Product Class under Parameters")
	public void User_609_Select_the_VAT_Code_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_VatCodeSearch_609());
		clicksAndActionHelper.clickOnElement(
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_VatCodeSearch_609());

		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_VatCode_609());
		IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_VatCode_609()
				.sendKeys(testData.get("VAT Code"), Keys.ENTER);
		Thread.sleep(2000);

		// table[@id='gridtab_iisProductClassVatCode_M003MT']//td[text()='1']
		String xpath = "//table[@id='gridtab_iisProductClassVatCode_M003MT']//td[text()='" + testData.get("VAT Code")
				+ "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	}

	@And("User_609 Select the VAT Percentage On in Product Class under Parameters")
	public void User_609_Select_the_VAT_Percentage_On_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_VatPercentageon_609());
		dropDownHelper.SelectUsingVisibleText(
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_AdditionalInformationTab_VatPercentageon_609(),
				testData.get("VAT Percentage On"));
		Thread.sleep(2000);

	}

	@And("User_609 Check the Include Vat Settlement flag in Product Class under Parameters")
	public void User_609_Check_the_Include_Vat_Settlement_flag_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609
				.Parameters_ProductClass_Maintenance_AdditionalInformationTab_IncludeVatinSettlement_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609
				.Parameters_ProductClass_Maintenance_AdditionalInformationTab_IncludeVatinSettlement_609());
		Thread.sleep(2000);
	}

	@And("User_609 Click on the Save Button in Product Class under Parameters")
	public void User_609_Click_on_the_Save_Button_in_Product_Class_under_Parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Save_609());
		clicksAndActionHelper.clickOnElement(IIS_PageObjects_609.Parameters_ProductClass_Maintenance_Save_609());

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_ConfirmOk_609());
		IIS_PageObjects_609.IIS_ConfirmOk_609().click();
		Thread.sleep(2000);

		waitHelper.waitForElementwithFluentwait(driver, IIS_PageObjects_609.IIS_Ok_609());
		IIS_PageObjects_609.IIS_Ok_609().click();
		Thread.sleep(2000);
	}
}
