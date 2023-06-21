package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CSM_App.CSM_App_Obj;
import resources.BaseClass;

public class RequestForFinancing_CSM {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_App_Obj csmAppObj = new CSM_App_Obj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ApplicationForFinancialFacility","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	CSMLogin csmLogin = new CSMLogin(driver);
	@Given("^User Launch the CSM  Application$")
    public void user_launch_the_csm_application() throws Throwable {
       driver.get(configFileReader.getCSMApplicationUrl());
       csmLogin.loginIntoCSMApplication(configFileReader.getCSMApplicationUserType());
    }

    @And("^User click request Main Menu$")
    public void user_click_request_main_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.requestMainMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.requestMainMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.requestMainMenu());
    }

    @And("^User click request application Sub Menu$")
    public void user_click_request_application_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.requestApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.requestApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.requestApplicationSubMenu());
    }

    @And("^User click Baj Application$")
    public void user_click_baj_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.bajApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.bajApplicationSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.bajApplicationSubMenu());
    }

    @And("^User click Maintenace screen in Baj Application$")
    public void user_click_maintenace_screen_in_baj_application() throws Throwable {
       
    }

    @And("^User Enter CIF No in Baj Application Maintenace screen$")
    public void user_enter_cif_no_in_baj_application_maintenace_screen() throws Throwable {
       
    }

    @And("^User Enter facility type in Baj Application Maintenace screen$")
    public void user_enter_facility_type_in_baj_application_maintenace_screen() throws Throwable {
       
    }

    @And("^User Enter the Country of Financing in Baj Application Maintenace screen$")
    public void user_enter_the_country_of_financing_in_baj_application_maintenace_screen() throws Throwable {
       
    }

    @And("^User Validate Baj Application Record$")
    public void user_validate_baj_application_record() throws Throwable {
       
    }

    @And("^User navigate to Approve screen in Baj Application$")
    public void user_navigate_to_approve_screen_in_baj_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.approveScreenInBajApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.approveScreenInBajApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.approveScreenInBajApplication());
    }

    @And("^User Search the created record in maintenance screen$")
    public void user_search_the_created_record_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.searchRequestNumberInApproveScreenUnderBajApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.searchRequestNumberInApproveScreenUnderBajApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.searchRequestNumberInApproveScreenUnderBajApplication());
		csmAppObj.searchRequestNumberInApproveScreenUnderBajApplication().sendKeys("100");
		csmAppObj.searchRequestNumberInApproveScreenUnderBajApplication().sendKeys(Keys.ENTER);
    }

    @And("^User Select the created record in maintenance screen$")
    public void user_select_the_created_record_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.selectSearchedRequestNumberInApproveScreenUnderBajApplication());
		seleniumActions.getClickAndActionsHelper().doubleClick(csmAppObj.selectSearchedRequestNumberInApproveScreenUnderBajApplication());
		
    }

    @And("^User click approve button in approve screen$")
    public void user_click_approve_button_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.approveButtonInApproveScreenBajApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.approveButtonInApproveScreenBajApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.approveButtonInApproveScreenBajApplication());
    }

    @And("^User click Request Management sub menu$")
    public void user_click_request_management_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.requestManagementInBajApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.requestManagementInBajApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.requestManagementInBajApplication());
    }

    @And("^User navigate management process batch$")
    public void user_navigate_management_process_batch() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.managementProcessBranchInBajApplication());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.managementProcessBranchInBajApplication());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.managementProcessBranchInBajApplication());
    }

    @And("^User Search the created record in management process batch$")
    public void user_search_the_created_record_in_management_process_batch() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.searchApplicationrecordInManagementBranchProcess());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.searchApplicationrecordInManagementBranchProcess());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.searchApplicationrecordInManagementBranchProcess());
		csmAppObj.searchApplicationrecordInManagementBranchProcess().sendKeys("100");
		csmAppObj.searchApplicationrecordInManagementBranchProcess().sendKeys(Keys.ENTER);
    }

    @And("^User Select the created record in management process batch$")
    public void user_select_the_created_record_in_management_process_batch() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.selectSearchedApplicationrecordInManagementBranchProcess());
		seleniumActions.getClickAndActionsHelper().doubleClick(csmAppObj.selectSearchedApplicationrecordInManagementBranchProcess());
    }

    @And("^User click process button in management process batch$")
    public void user_click_process_button_in_management_process_batch() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.processButtonInManagementBranchProcess());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.processButtonInManagementBranchProcess());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.processButtonInManagementBranchProcess());
    }

    @And("^User click ok button in sucess pop up$")
    public void user_click_ok_button_in_sucess_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.okButtonInSucessPopUpManagementBranchProcess());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.okButtonInSucessPopUpManagementBranchProcess());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.okButtonInSucessPopUpManagementBranchProcess());
    }
}
