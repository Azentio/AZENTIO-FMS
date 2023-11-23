package stepdefinitions;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
import pageobjects.iisParam.ControlRecordObj;
import resources.BaseClass;

public class IISControlRecord {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	

	ControlRecordObj controlRecordObj = new ControlRecordObj(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "ControlRecordTestData", "DataSet ID");

	Map<String, String> testData;

	@And ("^user get the test data for test case AT_IISPRM_004$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_004(){
		testData = excelData.getTestdata("AT_IISPRM_004_D1");
	}
	

	@Then("user click on the control record module under parameter menu tab")
	public void user_click_on_the_control_record_module_under_parameter_menu_tab() {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordmodule());
		controlRecordObj.iisControlRecordmodule().click();
	}

	@Then("user click on the control record maintanence tab under control record")
	public void user_click_on_the_control_record_maintanence_tab_under_control_record() {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordmaintenance());
		controlRecordObj.iisControlRecordmaintenance().click();
	}

	@Then("user click on the jv and printing tab")
	public void user_click_on_the_jv_and_printing_tab() {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordJVAndPrinting_C00MT());
		controlRecordObj.iisControlRecordJVAndPrinting_C00MT().click();
	}
	
	@Then("user click on the CustomizedJVDescription button")
	public void user_click_on_the_CustomizedJVDescription_button() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordCustomizedJVDescription_C00MT());
		controlRecordObj.iisControlRecordCustomizedJVDescription_C00MT().click();
		Thread.sleep(5000);
	}
	
	@Then("user click on the add button")
	public void user_click_on_the_add_button() throws InterruptedException {
		
		for (int i = 0; i <200; i++) {
			try {
				javaScriptHelper.JSEClick(controlRecordObj.add_iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Thread.sleep(3000);
		
	}
		

	@Then("user search for the newly added row")
	public void user_search_for_the_newly_added_row() {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT());
		controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT().click();
	
		
		
		 
	}

	@Then("user click on the drop down of trx type of the newly added row")
	public void user_click_on_the_drop_down_of_trx_type_of_the_newly_added_row() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_DropDown_C00MT());
		controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_DropDown_C00MT().click();
		 
	}

	@Then("user selected investement deal trx type from the drop down")
	public void user_selected_investement_deal_trx_type_from_the_drop_down() {
		 waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_DropDown_C00MT());
		 System.out.println(testData.get("Trx Value"));
		 controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_DropDown_C00MT().sendKeys(testData.get("Trx Value"));
		// controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_DropDown_C00MT().sendKeys("Investment Deal");
	}

	@Then("user click on the discription field for investment deal")
	public void user_click_on_the_discription_field_for_investment_deal() {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT_iisctrlJvDescriptionsVO_DESCRIPTION());
		controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT_iisctrlJvDescriptionsVO_DESCRIPTION().click();
		
	}
	
	@Then("user enter the discription for investment deal")
	public void user_enter_the_discription_for_investment_deal() {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT_iisctrlJvDescriptionsVO_DESCRIPTION());
		controlRecordObj.iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT_iisctrlJvDescriptionsVO_DESCRIPTION().sendKeys(testData.get("Trx Discription"));
		
	}
	
	@Then("user click on the ohk button")
	public void user_click_on_the_ohk_button() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordObj.iisjvAndPrintCustomizedJVDesc_save_btn_C00MT());
		controlRecordObj.iisjvAndPrintCustomizedJVDesc_save_btn_C00MT().click();
		Thread.sleep(15000);
	}
	
	
	

}
