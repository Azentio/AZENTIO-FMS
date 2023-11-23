//package stepdefinitions;
//
//import java.time.Duration;
//import java.util.Map;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import dataProvider.ConfigFileReader;
//import dataProvider.ExcelData;
//import helper.AlertHelper;
//import helper.ClicksAndActionsHelper;
//import helper.DropDownHelper;
//import helper.JavascriptHelper;
//import helper.Selenium_Actions;
//import helper.WaitHelper;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import pageobjects.CommonElements.IISCommonElements;
//import pageobjects.iisParam.CommonElementsObj;
//import pageobjects.iisParam.SettlementObj;
//import resources.BaseClass;
//
//public class SettlementStepDef {
//	
//	WebDriver driver = BaseClass.driver;
//	ConfigFileReader configFileReader = new ConfigFileReader();
//	WaitHelper waitHelper = new WaitHelper(driver);
//	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
//	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
//	DropDownHelper dropDownHelper = new DropDownHelper(driver);
//	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
//	Actions actions = new Actions(driver);
//	IISLogin login = new IISLogin(driver);
//	WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(2000));
//	AlertHelper alertHelper = new AlertHelper(driver);
//
//	IISCommonElements iisCommonElements = new IISCommonElements(driver);
//	CommonElementsObj commonElementsObj = new CommonElementsObj(driver);
//	SettlementObj settlementObj = new SettlementObj(driver);
//
//	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
//	ExcelData excelData = new ExcelData(path, "SettlementPolicyTestData", "DataSet ID");
//
//	Map<String, String> testData;
//	
//	@And("^user get the test data for test case AT_SETLMNT_021$")
//	public void user_get_the_test_data_for_test_case_AT_SETLMNT_021() {
//		testData = excelData.getTestdata("AT_SETLMNT_021_D1");
//	}
//	
//	@Then ("^user 021 click on settlement module$")
//	public void user_021_click_on_settlement_module(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.iisSettlementModule());
//		settlementObj.iisSettlementModule().click();
//	}
//	
//	@Then ("^user 021 click on the batch settlement screen under settlement$")
//	public void user_021_click_on_the_batch_settlement_under_settlement(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.iisSettlementBatchSettlement());
//		settlementObj.iisSettlementBatchSettlement().click();
//	}
//	
//	@Then ("^user 021 click on the create tab under batch settlement$")
//	public void user_021_click_on_the_create_tab_under_batch_settlement(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.iisSettlementBatchSettlementCreate());
//		settlementObj.iisSettlementBatchSettlementCreate().click();
//	}
//	
//	@Then ("^user 021 click on the settlement date$")
//	public void user_021_click_on_the_settlement_date(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.BatchSettlementDate());
//		settlementObj.BatchSettlementDate().click();
//	}
//	
//	@Then ("^user 021 enter the settlement date$")
//	public void user_021_enter_the_settlement_date(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.BatchSettlementDate());
//		settlementObj.BatchSettlementDate().sendKeys(testData.get("Settlement Date"));
//	}
//	
//	@Then ("^user 021 click on the cif$")
//	public void user_021_click_on_the_cif(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.BatchSettlementCIF());
//		settlementObj.BatchSettlementCIF().click();
//	}
//
//	@Then ("^user 021 enter the cif number$")
//	public void user_021_enter_the_cif_number(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.BatchSettlementCIF());
//		settlementObj.BatchSettlementCIF().sendKeys(testData.get("CIF No"));
//	}
//	
//	@Then ("^user 021 click on the by due date flag$")
//	public void user_021_click_on_the_by_due_date_flag(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.BatchSettlementDueDateFlag());
//		settlementObj.BatchSettlementDueDateFlag().click();
//	}
//	
//	@Then ("^user 021 click on the retrive button$")
//	public void user_021_click_on_the_retrive_button(){
//		waitHelper.waitForElementwithFluentwait(driver, settlementObj.BatchSettlementRetriveButton());
//		settlementObj.BatchSettlementRetriveButton().click();
//	}
//}
