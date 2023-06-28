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
import pageobjects.CommonElements.DrawDownRequest_610_Obj;
import resources.BaseClass;

public class DrawDownRequest_610_Steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	DrawDownRequest_610_Obj DrawDownRequest_610_Obj = new DrawDownRequest_610_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	DropDownHelper DropDownhelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData  DrawDownPayment_TestData= new ExcelData(path, "DrawDownPayment_TestData", "DataSet ID");
	Map<String, String> testData;

	
	
	//------@1105454
	/*
	@And("User_610 get the test data set id for AT_DDR_082")
	public void get_the_test_data_set_id_for_at_ddr_082() {
		testData =DrawDownPayment_TestData.getTestdata("DS01_870478");
	}
	*/
	@And("User_{int} click HJ Down Payment in Main Details")
	public void user_click_hj_down_payment_in_main_details(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.HJ_Down_Payment_InMainDetails_610());
		clicksAndActionsHelper.moveToElement(DrawDownRequest_610_Obj.HJ_Down_Payment_InMainDetails_610());
		clicksAndActionsHelper.clickOnElement(DrawDownRequest_610_Obj.HJ_Down_Payment_InMainDetails_610());
	}

	@Then("User_{int} validate the HJ Down Payment Value Visiable or Not")
	public void user_validate_the_hj_down_payment_value_visiable_or_not(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.HJ_Down_Payment_None_InMainDetails_610());
		Assert.assertEquals(DrawDownRequest_610_Obj.HJ_Down_Payment_None_InMainDetails_610().isEnabled(), true);
		
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.HJ_Down_Payment_HamishAlJiddiyah_InMainDetails_610());
		Assert.assertEquals(DrawDownRequest_610_Obj.HJ_Down_Payment_HamishAlJiddiyah_InMainDetails_610().isEnabled(), true);
		
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.HJ_Down_Payment_DownPayment_InMainDetails_610());
		Assert.assertEquals(DrawDownRequest_610_Obj.HJ_Down_Payment_DownPayment_InMainDetails_610().isEnabled(), true);
	}
	//-------
	
	//--------------------@1105453
	
	@And("User_{int} click Transaction Template")
	public void user_click_transaction_template(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.TransactionTemplate_Screen_610());
		clicksAndActionsHelper.moveToElement(DrawDownRequest_610_Obj.TransactionTemplate_Screen_610());
		clicksAndActionsHelper.clickOnElement(DrawDownRequest_610_Obj.TransactionTemplate_Screen_610());
	}

	@And("User_{int} click Maintenance Screen in Transaction Template")
	public void user_click_maintenance_screen_in_transaction_template(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.MaintenanceScreen_InTransactionTemplate_610());
		clicksAndActionsHelper.moveToElement(DrawDownRequest_610_Obj.MaintenanceScreen_InTransactionTemplate_610());
		clicksAndActionsHelper.clickOnElement(DrawDownRequest_610_Obj.MaintenanceScreen_InTransactionTemplate_610());
	}

	@And("User_{int} click add icon in Transaction Template Details")
	public void user_click_add_icon_in_transaction_template_details(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.addIcon_InTransactionTemplate_610());
		clicksAndActionsHelper.moveToElement(DrawDownRequest_610_Obj.addIcon_InTransactionTemplate_610());
		clicksAndActionsHelper.clickOnElement(DrawDownRequest_610_Obj.addIcon_InTransactionTemplate_610());
	}

	@And("User_{int} click GL Type")
	public void user_click_gl_type(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.GlType_InTransactionTemplate_610());
		clicksAndActionsHelper.moveToElement(DrawDownRequest_610_Obj.GlType_InTransactionTemplate_610());
		clicksAndActionsHelper.clickOnElement(DrawDownRequest_610_Obj.GlType_InTransactionTemplate_610());
		Thread.sleep(5000);
		
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.GlTypeSelectRowValues_InTransactionTemplate_610());
		clicksAndActionsHelper.moveToElement(DrawDownRequest_610_Obj.GlTypeSelectRowValues_InTransactionTemplate_610());
		clicksAndActionsHelper.clickOnElement(DrawDownRequest_610_Obj.GlTypeSelectRowValues_InTransactionTemplate_610());
		Thread.sleep(5000);
		
	}

	@Then("User_{int} validate Down Payment Account Visiable or Not")
	public void user_validate_down_payment_account_visiable_or_not(Integer int1) {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.DownPaymentAccount_InTransactionTemplate_610());
			JavascriptHelper.scrollIntoView(DrawDownRequest_610_Obj.DownPaymentAccount_InTransactionTemplate_610());
			clicksAndActionsHelper.clickOnElement(DrawDownRequest_610_Obj.DownPaymentAccount_InTransactionTemplate_610());
			
	//	waitHelper.waitForElementwithFluentwait(driver, DrawDownRequest_610_Obj.DownPaymentAccount_InTransactionTemplate_610());
	//	clicksAndActionsHelper.moveToElement(DrawDownRequest_610_Obj.DownPaymentAccount_InTransactionTemplate_610());
	//	JavascriptHelper.scrollIntoView(DrawDownRequest_610_Obj.DownPaymentAccount_InTransactionTemplate_610());
	//	clicksAndActionsHelper.clickOnElement(DrawDownRequest_610_Obj.DownPaymentAccount_InTransactionTemplate_610());
		Assert.assertEquals(DrawDownRequest_610_Obj.DownPaymentAccount_InTransactionTemplate_610().isDisplayed(), true);
	}
	
	
	
	
}
