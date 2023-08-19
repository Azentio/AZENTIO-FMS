package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.FMSCollateralManagementObj;
import resources.BaseClass;

public class FMSCollateralManagementReport extends BaseClass{
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSCollateralManagementObj fMSCollateralManagementObj  = new FMSCollateralManagementObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javaScriptHelper =new JavascriptHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(TestDataPath, "FMSCollateralManagementReport", "Data Set ID");
	Map<String, String> testData = new HashMap<>();
	
	@And("^user update test data set id for DS836785$")
    public void user_update_test_data_set_id_for_chb014() throws Throwable {
    	testData = excelData.getTestdata("DS_836785");
    }
	@Then("^navigate to Collateral Management screen$")
    public void navigate_to_collateral_management_screen()  {
		waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_CollateralManagement());
//    	clicksAndActionHelper.doubleClick(fMSCollateralManagementObj.fms_CollateralManagement());
		fMSCollateralManagementObj.fms_CollateralManagement().click();
    }

    @Then("^navigate to Revaluation tab$")
    public void navigate_to_revaluation_tab()  {
    	waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_Revaluation());
    	clicksAndActionHelper.moveToElement(fMSCollateralManagementObj.fms_Revaluation());
    	fMSCollateralManagementObj.fms_Revaluation().click(); 
    }

    @Then("^navigate to RevaluationReports tab$")
    public void navigate_to_revaluationreports_tab()  {
//    	waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_RevaluationReports());
    	clicksAndActionHelper.moveToElement(fMSCollateralManagementObj.fms_RevaluationReports());
    	fMSCollateralManagementObj.fms_RevaluationReports().click();
    }

    @Then("^navigate to Deal Collateral Valuation Report screen$")
    public void navigate_to_deal_collateral_valuation_report_screen()  {
    	clicksAndActionHelper.moveToElement(fMSCollateralManagementObj.fms_DealCollateralValuationReport());
    	waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_DealCollateralValuationReport());
		fMSCollateralManagementObj.fms_DealCollateralValuationReport().click();
		
		waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_WarningPopup());
		fMSCollateralManagementObj.fms_WarningPopup().click();
    }
    @And("^enter Deal Collateral Valuation Report screen input fields$")
    public void enter_deal_collateral_valuation_report_screen_input_fields()  {
    	waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_CodeFrom());
		fMSCollateralManagementObj.fms_CodeFrom().click();
		fMSCollateralManagementObj.fms_CodeFrom().sendKeys(testData.get("CodeFrom"));
		
		waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_CodeTo());
		fMSCollateralManagementObj.fms_CodeTo().click();
		fMSCollateralManagementObj.fms_CodeTo().sendKeys(testData.get("CodeTo"));
    }

    @Then("^Retrieve and validate the report$")
    public void retrieve_and_validate_the_report()  {
    	waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_Retrieve());
		fMSCollateralManagementObj.fms_Retrieve().click();
		
		waitHelper.waitForElementwithFluentwait(driver, fMSCollateralManagementObj.fms_ReportVaildation());
		fMSCollateralManagementObj.fms_ReportVaildation().isDisplayed();
    }

    

}
