package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
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
import pageobjects.fms.Request_For_FinancingObj;
import resources.BaseClass;

public class Request_For_FinancingSteps {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Request_For_FinancingObj requestForFinancingObj = new Request_For_FinancingObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
	Map<String, String> testData;
	
	
//	AT_RF_141
	@And("User clicks on the Request module")
	public void user_clicks_on_the_request_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj.FMSCoreRequestModule());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.FMSCoreRequestModule());
	    requestForFinancingObj.FMSCoreRequestModule().click();
	}

	@And("User clicks on the Request Financing under Request module")
	public void user_clicks_on_the_request_financing_under_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestFinancingFeature());
		requestForFinancingObj.requestFinancingFeature().click();
	}

	@And("User clicks on the Request for Financing under Request Financing feature")
	public void user_clicks_on_the_request_for_financing_under_request_financing_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestForFinancingFeature());
		requestForFinancingObj.requestForFinancingFeature().click();
	}

	@And("User click the maintanance under Request for Financing")
	public void user_click_the_maintanance_under_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestForFinancingMaintanance());
		requestForFinancingObj.requestForFinancingMaintanance().click();
	}

	@And("User click the search button under the maintanance screen in Request for Financing")
	public void user_click_the_search_button_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestForFinancingMaintananceSearchBtn());
		requestForFinancingObj.requestForFinancingMaintananceSearchBtn().click();
	}

	@And("User click the clear button under the maintanance screen in Request for Financing")
	public void user_click_the_clear_button_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestForFinancingMaintananceClearBtn());
		requestForFinancingObj.requestForFinancingMaintananceClearBtn().click();
	}

	@Then("User validate the CIF short Name available under the maintanance screen in Request for Financing")
	public void user_validate_the_cif_short_name_available_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestForFinancingMainCIFShortNameTitle());
		boolean shortNameTitle = requestForFinancingObj.requestForFinancingMainCIFShortNameTitle().isDisplayed();
		Assert.assertEquals(true, shortNameTitle);
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestForFinancingMainCIFShortNameValue());
		boolean shortNameValue = requestForFinancingObj.requestForFinancingMainCIFShortNameValue().isDisplayed();		
		Assert.assertEquals(true, shortNameValue);

	}

	@And("User validate the CIF long Name available under the maintanance screen in Request for Financing")
	public void user_validate_the_cif_long_name_available_under_the_maintanance_screen_in_request_for_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestForFinancingMainCIFLongNameTitle());
		boolean longNameTitle = requestForFinancingObj.requestForFinancingMainCIFLongNameTitle().isDisplayed();
		Assert.assertEquals(true, longNameTitle);
		
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.requestForFinancingMainCIFLongNameValue());
		boolean longNameValue = requestForFinancingObj.requestForFinancingMainCIFLongNameValue().isDisplayed();
		Assert.assertEquals(true, longNameValue);
	}
	

//	@AT_RF_141_arabic
	@And("User clicks on the Funding Request module in arabic")
	public void user_clicks_on_the_funding_request_module_in_arabic() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.arabicFundingRequest());
		requestForFinancingObj.arabicFundingRequest().click();
	}

	@And("User clicks on the Request under Funding Request")
	public void user_clicks_on_the_request_under_funding_request() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.arabicRequest());
		requestForFinancingObj.arabicRequest().click();
	}

	@And("User clicks on the Funding Request in Request under Funding Request")
	public void user_clicks_on_the_funding_request_in_request_under_funding_request() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.arabicRequestFundingRequest());
		requestForFinancingObj.arabicRequestFundingRequest().click();
	}

	@And("User click the approval committee under Funding Request in Request")
	public void user_click_the_approval_committee_under_funding_request_in_request() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.arabicFundingRequestApprovalCommittee());
		requestForFinancingObj.arabicFundingRequestApprovalCommittee().click();
	}

	@Then("User validate the search grid value are displayed in arbic language under approval committee")
	public void user_validate_the_search_grid_value_are_displayed_in_arbic_language_under_approval_committee() {
		waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj.arabicApprovalCommitteeSearchGrid());
		boolean approvalCommittee = requestForFinancingObj.arabicApprovalCommitteeSearchGrid().isDisplayed();
		Assert.assertEquals(true, approvalCommittee);
	}

	

}
