package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.Given;
import pageobjects.fms.ApplicationForFinancialFacilityObj;
import resources.BaseClass;

public class FacilitiesManagement_482 {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacilityObj applicationForFinancialFacilityObj = new ApplicationForFinancialFacilityObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"FacilitiesManagement","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;
	CSMLogin csmLogin = new CSMLogin(driver);
	int randomNumber;
	
	 // approve facility record in facility management
    @Given("User_482 click Facilities Management in WIFAK Application")
    public void user_482_click_facilities_management_in_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.facilitiesManagementInWIFAKApplication());
    }
    @Given("User_482 click approve submenu in Request for Financing under WIFAK Application")
    public void user_482_click_approve_submenu_in_request_for_financing_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
  	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
  	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveRejectScreenInFacilitiesManagement());
    }
    @Given("User_482 search active status in approve level 1 under WIFAK Application")
    public void user_482_search_active_status_in_approve_level_1_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication().sendKeys(testData.get("SearchStatus"));
  	  applicationForFinancialFacilityObj.searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication().sendKeys(Keys.ENTER);
    }
    @Given("User_482 select the first active record of facility record under WIFAK Application")
    public void user_482_select_the_first_active_record_of_facility_record_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication()); 
  	  seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
    }
    @Given("User_482 click approve button in facility main information under WIFAK Application")
    public void user_482_click_approve_button_in_facility_main_information_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
  	  seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication());
    }
    @Given("User_482 Validate the approved facility record in Facility management under WIFAK Application")
    public void user_482_validate_the_approved_facility_record_in_facility_management_under_wifak_application() {
  	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen());
  	  Assert.assertTrue(applicationForFinancialFacilityObj.getRequestIdInRequestForFinancingScreen().isDisplayed());
    }
    @Given("User_482 Update test data set id for AT_FM_010")
    public void user_482_update_test_data_set_id_for_at_fm_010() {
    	testData = excelData.getTestdata("AT_FM_010_D1");
    }
    @Given("User_482 search Status In Maintenance under REQUEST FOR FINANCIN")
    public void user_482_search_status_in_maintenance_under_request_for_financin() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing());
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys("draft");
		applicationForFinancialFacilityObj.searchStatusInMaintenanceRequestForFinancing().sendKeys(Keys.ENTER);
    }
    @Given("User_482 select the searched status in Maintenance screen under REQUEST FOR FINANCIN")
    public void user_482_select_the_searched_status_in_maintenance_screen_under_request_for_financin() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
		seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.selectSearchedCodeInMaintenanceRequestForFinancing());
    }
    @Given("User_482 click parameter Menu")
    public void user_482_click_parameter_menu() {
        
    }

    @Given("User_482 click Control record Sub Menu")
    public void user_482_click_control_record_sub_menu() {
        
    }

    @Given("User_482 click Update After Approve in control record")
    public void user_482_click_update_after_approve_in_control_record() {
        
    }

    @Given("User_482 Check the Enable Alerts check box")
    public void user_482_check_the_enable_alerts_check_box() {
       
    }

    @Given("User_482 Uncheck the Auto Alerts Check box")
    public void user_482_uncheck_the_auto_alerts_check_box() {
        
    }
    
    

}
