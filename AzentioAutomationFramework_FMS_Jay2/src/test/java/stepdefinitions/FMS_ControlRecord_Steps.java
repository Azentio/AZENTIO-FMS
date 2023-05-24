package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.FMS_ControlRecord_obj;
import resources.BaseClass;

public class FMS_ControlRecord_Steps {

	WebDriver driver = BaseClass.driver;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	Map<String, String> fmsLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
// 	ApplicationForFinancialFacility_obj applicationFinancialObj = new ApplicationForFinancialFacility_obj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	FMS_ControlRecord_obj ControlRecordobj = new FMS_ControlRecord_obj(driver);

	@And("^User clicks on the Parameter module$")
    public void user_clicks_on_the_parameter_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.fmsParamParameter());
		ControlRecordobj.fmsParamParameter().click();
    }
	
	@And("^User clicks on the control records feature$")
	public void user_clicks_on_the_control_records_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.paramControlRecords());
		ControlRecordobj.paramControlRecords().click();
	}

	@And("^User clicks on the update after approve menu$")
	public void user_clicks_on_the_update_after_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.controlRecordsUpdateAfterApprove());
		ControlRecordobj.controlRecordsUpdateAfterApprove().click();
	}
	
	 @And("^User Check Flag General Limit By CIF$")
	    public void user_check_flag_general_limit_by_cif() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.GeneralLimitByCIF());
		ControlRecordobj.GeneralLimitByCIF().click();
	 }


	@And("^User clicks on the update button$")
	public void user_clicks_on_the_update_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascripthelper.scrollIntoView(ControlRecordobj.updateAfterUpdateBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.updateAfterUpdateBtn());
		ControlRecordobj.updateAfterUpdateBtn().click();

		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.ButtonConfirmOk());
		ControlRecordobj.ButtonConfirmOk().click();

		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.ButtonSuccessOk());
		ControlRecordobj.ButtonSuccessOk().click();
	}

	@And("^User clicks on the approve menu$")
	public void user_clicks_on_the_approve_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.controlRecordsApprove());
		ControlRecordobj.controlRecordsApprove().click();
	}

	@Then("^User clicks on the approve button$")
	public void user_clicks_on_the_approve_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascripthelper.scrollIntoView(ControlRecordobj.approveButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		ControlRecordobj.approveButton().click();

		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.ButtonConfirmOk());
		ControlRecordobj.ButtonConfirmOk().click();

		waitHelper.waitForElementwithFluentwait(driver, ControlRecordobj.ButtonSuccessOk());
		ControlRecordobj.ButtonSuccessOk().click();
	}
}
