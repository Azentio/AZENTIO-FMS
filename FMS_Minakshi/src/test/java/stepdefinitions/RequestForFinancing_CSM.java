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

    @And("^User click Baj Request$")
    public void user_click_baj_Request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.bajRequest());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.bajRequest());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.bajRequest());
    }

    @And("^User click Maintenace screen in Baj Request$")
    public void user_click_maintenace_screen_in_baj_Request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.maintanencescreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.maintanencescreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.maintanencescreen());
    }

    @And("^User click on reason for submission tab in maintenence screen$")
    public void User_click_on_reason_for_submission_tab_in_maintenence_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.RESEAONFORSUBMISSION());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.RESEAONFORSUBMISSION());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.RESEAONFORSUBMISSION());
		csmAppObj.RESEAONFORSUBMISSION().sendKeys(Keys.DOWN);
		csmAppObj.RESEAONFORSUBMISSION().sendKeys(Keys.DOWN);
		csmAppObj.RESEAONFORSUBMISSION().sendKeys(Keys.ENTER);
    }

    
    
    @And("^User click on customer tab in maintenence screen$")
    public void User_click_on_customer_tab_in_maintenence_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.customer());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.customer());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.customer());
		csmAppObj.customer().sendKeys("727");
		csmAppObj.customer().sendKeys(Keys.TAB);
    }

    
    

    @And("^User Enter facility type in Baj Request Maintenace screen$")
    public void user_enter_facility_type_in_baj_Request_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.facilitytype());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.facilitytype());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.facilitytype());
		csmAppObj.facilitytype().sendKeys("66");
		csmAppObj.facilitytype().sendKeys(Keys.TAB);
    }

    @And("^User click on total limite tab$")
    public void User_click_on_total_limite_tab() throws Throwable {
       
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.totallimit());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.totallimit());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.totallimit());
		csmAppObj.totallimit().sendKeys("10");
		csmAppObj.totallimit().sendKeys(Keys.TAB);
    	
    }

    @And("^User click disbursement tab under maintenence$")
    public void User_click_disbursement_tab_under_maintenence() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.disbursement());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.disbursement());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.disbursement());
       
    }

    @And("^User click on add icon button under disbursement$")
    public void User_click_on_add_icon_button_under_disbursement() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.add());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.add());
		seleniumActions.getClickAndActionsHelper().doubleClick(csmAppObj.add());
		Thread.sleep(3000);
    }

    @And("^User click on product class tab$")
    public void User_click_on_product_class_tab() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.Productcalsstab());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.Productcalsstab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.Productcalsstab());
		csmAppObj.Productcalsstab().sendKeys("5");
		csmAppObj.Productcalsstab().sendKeys(Keys.TAB);
    }

    @And("^User click on add button$")
    public void User_click_on_add_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.addbtn());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.addbtn());
		seleniumActions.getClickAndActionsHelper().doubleClick(csmAppObj.addbtn());
    }

    @And("^User click on smart tab$")
    public void User_click_on_smart_tab() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.smarttab());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.smarttab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.smarttab());
    }

    @And("^User click on texttab under smart$")
    public void User_click_on_texttab_under_smart() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.texttab());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.texttab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.texttab());
		csmAppObj.texttab().sendKeys("09/10/2023");
		csmAppObj.texttab().sendKeys(Keys.ENTER);
    }
    
    @And("^User click on ok button under smart$")
    public void User_click_on_ok_button_under_smart() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.okundersmart());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.okundersmart());
		csmAppObj.okundersmart().click();
    }
    
    
    @And("^User click on save$")
    public void user_click_on_save() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.save());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.save());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmAppObj.save());
    }

    @And("^User click on validate$")
    public void user_User_click_on_validate() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAppObj.validate());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmAppObj.validate());
		csmAppObj.validate().click();
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
