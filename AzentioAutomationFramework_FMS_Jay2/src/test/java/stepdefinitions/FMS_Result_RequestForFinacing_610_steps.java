package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.FMS_Result_RequestForFinacing_610_obj;
import pageobjects.CommonElements.FMS_WifakApplication_Obj;
import resources.BaseClass;

public class FMS_Result_RequestForFinacing_610_steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMS_Result_RequestForFinacing_610_obj FMS_Result_RequestForFinacing_610_obj = new FMS_Result_RequestForFinacing_610_obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	DropDownHelper DropDownhelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	
	@And("^User Click on REQUEST FOR FINANCIN under FMS application$")
    public void user_click_on_request_for_financin_under_fms_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.requestForFinancingMenu());
		clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMenu());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMenu());
    }

    @And("^User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN$")
    public void user_click_the_request_for_financing_sub_menu_under_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.requestForFinancingSubMenu());
		clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.requestForFinancingSubMenu());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.requestForFinancingSubMenu());
    }

    @And("^User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN$")
    public void user_click_on_maintenance_under_request_for_financing_sub_menu_in_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.requestForFinancingMaintenanceScreen());
		clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMaintenanceScreen());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.requestForFinancingMaintenanceScreen());
    }

    @And("^User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_select_new_request_in_reason_for_submission_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.reasonForSubmissionSelect());
		DropDownhelper
				.SelectUsingVisibleText(FMS_Result_RequestForFinacing_610_obj.reasonForSubmissionSelect(), "New Request");
		 for (int i = 0; i <200; i++) {
	  			try {
	  				if (!FMS_Result_RequestForFinacing_610_obj.requestDateValidation().getAttribute("prevvalue").isBlank()&&!FMS_Result_RequestForFinacing_610_obj.requestDateValidation().getAttribute("prevvalue").isEmpty()) {
						break;	
					}
	  			} catch (Exception e) {
	  				
	  			}
	  			
	  		}
    }

    @And("^User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_search_the_cif_number_in_customer_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.customerCIF());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.customerCIF());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.customerCIF());
	//	FMS_Result_RequestForFinacing_610_obj.customerCIF().sendKeys(testData.get("CIFNO"));
		
		FMS_Result_RequestForFinacing_610_obj.customerCIF().sendKeys(null);
		waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
		clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
		for (int i = 0; i <200; i++) {
  			try {
  				if (!FMS_Result_RequestForFinacing_610_obj.customerNameValidationInRequestForFinancingScreen().getAttribute("prevvalue").isBlank()&&!FMS_Result_RequestForFinacing_610_obj.customerNameValidationInRequestForFinancingScreen().getAttribute("prevvalue").isEmpty()) {
					break;	
				}
  			} catch (Exception e) {
  				
  			}	
  		}
		
    }

    @And("^User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_search_the_facility_type_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
		clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
	    clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
	//    FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen().sendKeys(testData.get("FacilityType"));
	    FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen().sendKeys(null);
	    
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.totalLimitInRequestForFinancingScreen());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.totalLimitInRequestForFinancingScreen());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.totalLimitInRequestForFinancingScreen());
		for (int i = 0; i <200; i++) {
  			try {
  				if (!FMS_Result_RequestForFinacing_610_obj.facilityNameValidationInRequestForFinancingScreen().getAttribute("prevvalue").isBlank()||
  						!FMS_Result_RequestForFinacing_610_obj.facilityNameValidationInRequestForFinancingScreen().getAttribute("prevvalue").isEmpty()) {
    				break;	
    			}
  			} catch (Exception e) {
  				
  			}	
  		}
    }

    @And("^User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_enter_the_value_in_total_limit_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.totalLimitInRequestForFinancingScreen());
    			clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.totalLimitInRequestForFinancingScreen());
    			clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.totalLimitInRequestForFinancingScreen());
    	//		FMS_Result_RequestForFinacing_610_obj.totalLimitInRequestForFinancingScreen().sendKeys(testData.get("TotalLimit"));
    			FMS_Result_RequestForFinacing_610_obj.totalLimitInRequestForFinancingScreen().sendKeys(null);
    			
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.facilityTypeInRequestForFinancingScreen());
		for (int i = 0; i <200; i++) {
  			try {
  				if (!FMS_Result_RequestForFinacing_610_obj.cvValueValidationInRequestForFinancingScreen().getAttribute("prevvalue").isBlank()||
  						!FMS_Result_RequestForFinacing_610_obj.cvValueValidationInRequestForFinancingScreen().getAttribute("prevvalue").isEmpty()) {
    				break;	
    			}
  			} catch (Exception e) {
  				
  			}	
  		}
		
    }

    @And("^User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_click_on_disbursement_or_sublimit_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	Thread.sleep(1000);
    	for (int i = 0; i <200; i++) {
			try {
				FMS_Result_RequestForFinacing_610_obj.disbursementOrSublimitInRequestForFinancingScreen().click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	
    }

    @And("^User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_click_on_add_button_in_disbursement_or_sublimit_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.addIconInDisbursementOrSublimitScreen());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.addIconInDisbursementOrSublimitScreen());
    	clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.addIconInDisbursementOrSublimitScreen());
    	
    }

    @And("^User Search Product Class in Limit Details Pop up Menu$")
    public void user_search_product_class_in_limit_details_pop_up_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.productClassInLimitDetailsPopUp());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.productClassInLimitDetailsPopUp());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.productClassInLimitDetailsPopUp());
//		FMS_Result_RequestForFinacing_610_obj.productClassInLimitDetailsPopUp().sendKeys(testData.get("ProductClass"));
		FMS_Result_RequestForFinacing_610_obj.productClassInLimitDetailsPopUp().sendKeys(null);
		
		waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.productClassRandomClick());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.productClassRandomClick());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.productClassRandomClick());
		for (int i = 0; i <200; i++) {
  			try {
  				if (!FMS_Result_RequestForFinacing_610_obj.productClassNameValidationInRepaymentPlan().getAttribute("prevvalue").isBlank()
  						||!FMS_Result_RequestForFinacing_610_obj.productClassNameValidationInRepaymentPlan().getAttribute("prevvalue").isEmpty()) {
    				break;	
    			}
  			} catch (Exception e) {
  				
  			}	
  		}
    }


    @And("^User Enter the Margin value in New Tab Field in Limit Details Pop up Menu$")
    public void user_enter_the_margin_value_in_new_tab_field_in_limit_details_pop_up_menu() throws Throwable {
    	JavascriptHelper.scrollIntoView(FMS_Result_RequestForFinacing_610_obj.marginValueInLimitDetailsPopUp());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.marginValueInLimitDetailsPopUp());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.marginValueInLimitDetailsPopUp());
		clicksAndActionsHelper.doubleClick(FMS_Result_RequestForFinacing_610_obj.marginValueInLimitDetailsPopUp());
	//	FMS_Result_RequestForFinacing_610_obj.marginValueInLimitDetailsPopUp().sendKeys(testData.get("MarginValue"));
		FMS_Result_RequestForFinacing_610_obj.marginValueInLimitDetailsPopUp().sendKeys(null);
		
		for (int i = 0; i <200; i++) {
  			try {
  				if (!FMS_Result_RequestForFinacing_610_obj.marginValueInLimitDetailsPopUp().getText().isBlank()
  						||!FMS_Result_RequestForFinacing_610_obj.marginValueInLimitDetailsPopUp().getText().isEmpty()) {
      				break;	
      			}
  			} catch (Exception e) {
  				
  			}	
  		}
    }

    @And("^User Click on Add button in Limit Details Pop up$")
    public void user_click_on_add_button_in_limit_details_pop_up() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.addButtonInLimitDetailsPopUp());
    	JavascriptHelper.scrollIntoView(FMS_Result_RequestForFinacing_610_obj.addButtonInLimitDetailsPopUp());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.addButtonInLimitDetailsPopUp());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.addButtonInLimitDetailsPopUp());
    }

    @And("^User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN$")
    public void user_click_on_save_button_under_maintenance_screen_in_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.savebuttonInRequestForFinancingScreenMaintenance());
    	clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.savebuttonInRequestForFinancingScreenMaintenance());
		clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.savebuttonInRequestForFinancingScreenMaintenance());
    }

    @And("^User Click on Ok button in Confirm Pop up Menu$")
    public void user_click_on_ok_button_in_confirm_pop_up_menu() throws Throwable {
    	//waitHelper.waitForElementwithFluentwait(driver,FMS_Result_RequestForFinacing_610_obj.okButtonInConfirmationPopUp());
    	for (int i = 0; i <2000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.okButtonInConfirmationPopUp());
				clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.okButtonInConfirmationPopUp());
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^User Click on Ok button in Success Pop up Menu$")
    public void user_click_on_ok_button_in_success_pop_up_menu() throws Throwable {
    	for (int i = 0; i <2000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(FMS_Result_RequestForFinacing_610_obj.okButtonInSucessPopUp());
				clicksAndActionsHelper.clickOnElement(FMS_Result_RequestForFinacing_610_obj.okButtonInSucessPopUp());
				break;
			} catch (Exception e) {
				
			}
		}    	
    }
	
}
