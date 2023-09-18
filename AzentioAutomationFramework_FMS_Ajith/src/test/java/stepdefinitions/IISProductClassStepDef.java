package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.fmsparams.ApplicationForFinancialFacilityParamObj;
import pageobjects.iisParam.IncidentalChargesObj_482;
import pageobjects.iisParam.ProductClassObj;
import resources.BaseClass;

public class IISProductClassStepDef {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	
	
	ProductClassObj productClassObj = new ProductClassObj(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData excelData  = new ExcelData(path,"ProductClassTestData","DataSet ID");
	
	Map<String, String> testData;
	

	@And ("^user get the test data for test case AT_IISPRM_003$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_003(){
		testData = excelData.getTestdata("AT_IISPRM_003_D1");
	}
	
	@Then("user click on the parameter tab under menu")
	public void user_click_on_the_parameter_tab_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisParametertab());
		productClassObj.iisParametertab().click();
	}

	@Then("user click on the product class module under parameter tab")
	public void user_click_on_the_product_class_module_under_parameter_tab() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassModule());
		productClassObj.iisProductClassModule().click();
	}

	@Then("user click on the maintenance under product class module")
	public void user_click_on_the_maintenance_under_product_class_module() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassMaintenance());
		productClassObj.iisProductClassMaintenance().click();
	}

	@Then("user click on the additonal information tab")
	public void user_click_on_the_additonal_information_tab() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassAdditionalInformation_M003MT());
		productClassObj.iisProductClassAdditionalInformation_M003MT().click();
	}

	@Then("user click on the repayment plan under additional tab")
	public void user_click_on_the_repayment_plan_under_additional_tab() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassAdditionalInformationRepaymentPlan_M003MT());
		productClassObj.iisProductClassAdditionalInformationRepaymentPlan_M003MT().click();
	}

	@Then("user click on the max grace input field")
	public void user_click_on_the_max_grace_input_field() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR());
		productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR().click();
	}

	@Then("user enter the max grace")
	public void user_enter_the_max_grace() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR());
		productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR().sendKeys(testData.get("Max Grade Nbr"));
	}

	@Then("user click on the max grace value drop down")
	public void user_click_on_the_max_grace_value_drop_down() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE());
		productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE().click();
	}

	@Then("user select the max grace value from drop down")
	public void user_select_the_max_grace_value_from_drop_down() {
		//waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE());
		//productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE().sendKeys(testData.get("Max Grade Value"));
		
		 waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE());
		 dropDownHelper.SelectUsingVisibleText(productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE(),testData.get("Max Grade Value"));
	}

}
