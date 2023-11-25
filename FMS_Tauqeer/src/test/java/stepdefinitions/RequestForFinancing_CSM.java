package stepdefinitions;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CSM_App.CSM_App_Obj;
import pageobjects.fms.ApplicationForFinancialFacility_482_Obj;
import pageobjects.fms.RequestForFinancingObj;
import resources.BaseClass;

public class RequestForFinancing_CSM {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_App_Obj csmAppObj = new CSM_App_Obj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ApplicationForFinancialFacility","DataSet ID");
	ExcelData requestForFinancingData = new ExcelData(path,"RequestForFinancing_482","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	CSMLogin csmLogin = new CSMLogin(driver);
	RequestForFinancingObj requestForFinancing = new RequestForFinancingObj(driver);
	ApplicationForFinancialFacility_482_Obj applicationForFinancialFacilityObj = new ApplicationForFinancialFacility_482_Obj(driver);
	
	@And("User_482 Update test data set id for AT_RF_026")
    public void user_482_update_test_data_set_id_for_at_rf_026() {
		testExecutionData = testExecution.getTestdata("AT_RF_026");
    	testData = requestForFinancingData.getTestdata(testExecutionData.get("Data Set ID"));
    }
	
	@Given("^User Launch the CSM  Application$")
    public void user_launch_the_csm_application() throws Throwable {
       driver.get(configFileReader.getCSMApplicationUrl());
       csmLogin.loginIntoCSMApplication(configFileReader.getCSMApplicationUserType());
    }
	@Given("User_482 Get the Code in Success Pop up Menu under Collateral Management")
    public void user_482_get_the_code_in_success_pop_up_menu_under_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
    	String requestId = applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().getText().substring(21,25);
    	requestForFinancingData.updateTestData(testExecutionData.get("Data Set ID"), "RequestID",requestId);
    	System.out.println(requestId);
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
    @And("User_482 Click Collateral Management")
    public void user_482_click_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.collateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.collateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.collateralManagement_482());
    }

    @And("User_482 Click Update After Approve Screen In Collateral Management")
    public void user_482_click_update_after_approve_screen_in_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.updateAfterApproveScreen_CollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.updateAfterApproveScreen_CollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.updateAfterApproveScreen_CollateralManagement_482());
    }

    @And("User_482 Change Approve Coverage Value")
    public void user_482_change_approve_coverage_value() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.approveCoverageCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.approveCoverageCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.approveCoverageCollateralManagement_482());
		requestForFinancing.approveCoverageCollateralManagement_482().clear();
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.okButtonInSucessPopUp());
		requestForFinancing.approveCoverageCollateralManagement_482().sendKeys(testData.get("Approve Coverage"));
		requestForFinancing.approveCoverageCollateralManagement_482().sendKeys(Keys.TAB);
		
    }

    @And("User_482 Select Country In Collateral Management")
    public void user_482_select_country_in_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.country_CollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.country_CollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.country_CollateralManagement_482());
		requestForFinancing.country_CollateralManagement_482().sendKeys(testData.get("CountryofFinancing"));
		requestForFinancing.country_CollateralManagement_482().sendKeys(Keys.TAB);
		
    }

    @And("User_482 Click Approve Screen In Collateral Management")
    public void user_482_click_approve_screen_in_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.approveScreen_Collateral_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.approveScreen_Collateral_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.approveScreen_Collateral_482());
		
    }

    @And("User_482 Search code in Approve Screen Under Collateral Management")
    public void user_482_search_code_in_approve_screen_under_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.searchCodeInApproveScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.searchCodeInApproveScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.searchCodeInApproveScreenUnderCollateralManagement_482());
		requestForFinancing.searchCodeInApproveScreenUnderCollateralManagement_482().sendKeys(testData.get("RequestID"));
		for (int i = 0; i <15; i++) {
			requestForFinancing.searchCodeInApproveScreenUnderCollateralManagement_482().sendKeys(Keys.ENTER);
		}
    }

    @And("User_482 Select searched record in Approve Screen Under Collateral Management")
    public void user_482_select_searched_record_in_approve_screen_under_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.selectSearchedCodeInApproveScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().doubleClick(requestForFinancing.selectSearchedCodeInApproveScreenUnderCollateralManagement_482());
    }

    @And("User_482 Click Approve Button in Approve Screen Under Collateral Management")
    public void user_482_click_approve_button_in_approve_screen_under_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.approveButtonInApproveScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.approveButtonInApproveScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.approveButtonInApproveScreenUnderCollateralManagement_482());
    }

    @And("User_482 Click Maintenance Screen In Collateral Management")
    public void user_482_click_maintenance_screen_in_collateral_management() {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.maintenanceScreen_CollateralManagement_482());
				seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.maintenanceScreen_CollateralManagement_482());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
			}
		}
    	}

		
    }

    @And("User_482 click search icon in Maintenance screen under Collateral Management")
    public void user_482_click_search_icon_in_maintenance_screen_under_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.searchIconMaintenance_CollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.searchIconMaintenance_CollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.searchIconMaintenance_CollateralManagement_482());
    }

    @And("User_482 Search code in Maintenance Screen Under Collateral Management")
    public void user_482_search_code_in_maintenance_screen_under_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.searchCodeInMaintenanceScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.searchCodeInMaintenanceScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.searchCodeInMaintenanceScreenUnderCollateralManagement_482());
		requestForFinancing.searchCodeInMaintenanceScreenUnderCollateralManagement_482().sendKeys(testData.get("RequestID"));
		for (int i = 0; i <15; i++) {
			requestForFinancing.searchCodeInMaintenanceScreenUnderCollateralManagement_482().sendKeys(Keys.ENTER);
		}
    }

    @And("User_482 Select searched record in Maintenance Screen Under Collateral Management")
    public void user_482_select_searched_record_in_maintenance_screen_under_collateral_management() {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().doubleClick(requestForFinancing.selectSearchedCodeInMaintenanceScreenUnderCollateralManagement_482());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		
    }
    
    @Given("User_482 Click last Button in Audit details View")
    public void user_click_last_button_in_audit_details_view() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.lastPageauditPageInMaintenanceScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.lastPageauditPageInMaintenanceScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.lastPageauditPageInMaintenanceScreenUnderCollateralManagement_482());
    }

    @And("User_482 Validate Audit Details Updated Properly")
    public void user_482_validate_audit_details_updated_properly() {
    	List<String> test = new LinkedList<String>();
    	List<WebElement> auditDetails = new LinkedList<WebElement>();
    	for (int i = 0; i <15; i++) {
			try {
			 auditDetails = driver.findElements(By.xpath("//*[@id='auditActionsGrid_Id']//tr[@id]//td[@tdlabel='User Id']/preceding-sibling::td[@tdlabel='Action Type']"));
			} catch (Exception e) {
				
			}
		}
    	for (WebElement webElement : auditDetails) {
    		String text = webElement.getAttribute("title");
    		System.out.println(text);
    		test.add(text);
		}
    	System.out.println(test.get(test.size()-1));
    	System.out.println(test.get(test.size()-2));
    	Assert.assertEquals(test.get(test.size()-1),"Retrieve");
    	Assert.assertEquals(test.get(test.size()-2),"Update");
        
    }
    @And("User_482 Click Save button In Update After Approve Collateral Management")
    public void user_482_click_save_button_in_update_after_approve_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.saveButttonUpdateAfterApprove_CollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.saveButttonUpdateAfterApprove_CollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.saveButttonUpdateAfterApprove_CollateralManagement_482());
    }
    @And("User_482 Click Audit button In Maintenance Screen Under Collateral Management")
    public void user_482_click_audit_button_in_maintenance_screen_under_collateral_management() {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.auditOptionInMaintenanceScreenUnderCollateralManagement_482());
				seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.auditOptionInMaintenanceScreenUnderCollateralManagement_482());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		
    }
    @Given("User_482 Click Clear in grid view")
    public void user_482_click_clear_in_grid_view() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.clearSearchInGrid_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.clearSearchInGrid_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.clearSearchInGrid_482());
    }
    @And("User_482 Search Code in Update After Approve Under Collateral Management")
    public void user_482_search_code_in_update_after_approve_under_collateral_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.searchCodeInUpdateAfterApproveScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing.searchCodeInUpdateAfterApproveScreenUnderCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing.searchCodeInUpdateAfterApproveScreenUnderCollateralManagement_482());
		requestForFinancing.searchCodeInUpdateAfterApproveScreenUnderCollateralManagement_482().sendKeys(testData.get("CollateralManagement Code"));
		for (int i = 0; i <15; i++) {
			requestForFinancing.searchCodeInUpdateAfterApproveScreenUnderCollateralManagement_482().sendKeys(Keys.ENTER);
		}
    }

    @Given("User_482 Select first record in Update After Approve Collaterl Management")
    public void user_482_select_first_record_in_update_after_approve_collaterl_management() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing.firstRecord_UpdateAfterApproveCollateralManagement_482());
		seleniumActions.getClickAndActionsHelper().doubleClick(requestForFinancing.firstRecord_UpdateAfterApproveCollateralManagement_482());
    }

    
}
