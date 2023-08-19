package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.FMSRequestForFinanceObj;
import resources.BaseClass;



public class FMSRequestForFinance extends BaseClass{

	WebDriver driver = BaseClass.driver;
	FMSRequestForFinanceObj requestforfinanceOBJ = new FMSRequestForFinanceObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData requestforfinanceexcelData = new ExcelData(TestDataPath, "RequestforFinance", "DataSet ID");
	Map<String, String> requestforfinancetestData = new HashMap<>();


	@And("^Update test data for test case no AT_RF_047$")
    public void update_test_data_for_test_case_no_AT_RF_047() {
		requestforfinancetestData = requestforfinanceexcelData.getTestdata("AT_RF_047_D1");
	     
    }
	
	
	@Then("^Navigate to the Request Tab$")
    public void navigate_to_the_request_tab() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
    			javascriptHelper.scrollIntoView(requestforfinanceOBJ.Request());
    			requestforfinanceOBJ.Request().click();
    			break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	
    }
	@Then("^click on the request financing under Request$")
	    public void click_on_the_request_financing_under_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinanceOBJ.RequestFinance());
	    	requestforfinanceOBJ.RequestFinance().click();
	        
	    }
	@Then("^click on the request for financing under request financing$")
    public void click_on_the_request_for_financing_under_request_financing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinanceOBJ.RequestForFinance());
    	requestforfinanceOBJ.RequestForFinance().click();
        
    }

	@Then("^click on the maintenence under request for financing$")
	    public void click_on_the_maintenence_under_request_for_financing() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinanceOBJ.RequestForFinance_Maintenance());
	    	requestforfinanceOBJ.RequestForFinance_Maintenance().click();
	        
	    }

	@Then("^select reason for submission$")
	    public void select_reason_for_submission() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinanceOBJ.RequestForFinance_ReasonForSubmission());
	    	dropDownHelper.SelectUsingVisibleText(requestforfinanceOBJ.RequestForFinance_ReasonForSubmission(), requestforfinancetestData.get("Reason for submission"));
	    	requestforfinanceOBJ.RequestForFinance_ReasonForSubmission().click();
	    }

	@Then("^enter the customer details$")
	    public void enter_the_customer_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinanceOBJ.RequestForFinance_Customer());
	    	requestforfinanceOBJ.RequestForFinance_Customer().sendKeys(requestforfinancetestData.get("customer details"));
	    	
	    }
	@Then("^enter the facility type code details$")
	    public void enter_the_facility_type_code_details() throws Throwable {
	    	
		for(int i = 0; i <= 100; i++) {
    		try {
    			javascriptHelper.scrollIntoView(requestforfinanceOBJ.RequestForFinance_FacilityType());
    	    	requestforfinanceOBJ.RequestForFinance_FacilityType().sendKeys(requestforfinancetestData.get("FacilityType Code"));
    	    	
    	    	requestforfinanceOBJ.RequestForFinance_FacilityTypeSearch().click();
    	    	Thread.sleep(3000);
    			break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	    	
	    }
	
	
         @And("^enter the total limit under global limit$")
    public void enter_the_total_limit_under_global_limit() throws Throwable {
    	
	    	for(int i = 0; i <= 100; i++) {
	    		try {
	    			javascriptHelper.scrollIntoView(requestforfinanceOBJ.RequestForFinance_TotalLimit());
	    			break;
				} catch (Exception e) {
					if(i == 100) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	requestforfinanceOBJ.RequestForFinance_TotalLimit().sendKeys(requestforfinancetestData.get("TotalLimit"));
	    	Thread.sleep(5000);
	    	requestforfinanceOBJ.RequestForFinance_Downpayment().click();
	    	Thread.sleep(3000);
	    	
	    }

    	@And("^click on the Disbursement Sublimit under maintenance screen$")
    public void click_on_the_disbursement_sublimit_under_maintenance_screen() throws Throwable {
    		for(int i = 0; i <= 100; i++) {
	    		try {
    		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_DisbursmentSubmit());
    		clicksAndActionsHelper.doubleClick(requestforfinanceOBJ.RequestForFinance_DisbursmentSubmit());
    	

    		break;
				} catch (Exception e) {
					if(i == 100) {
						Assert.fail(e.getMessage());
					}
				}}
        
    }

    @And("^click on the Add New Row under Disbursement Sublimit$")
    public void click_on_the_add_new_row_under_disbursement_sublimit() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_AddNewRow());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_AddNewRow());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
        
    }

    @And("^enter the product class values in product searchbox$")
    public void enter_the_product_class_values_in_product_searchbox() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,requestforfinanceOBJ.RequestForFinance_ProductClass());
    	for(int i = 0; i <= 300; i++) {
    		try {
    	requestforfinanceOBJ.RequestForFinance_ProductClass().sendKeys(requestforfinancetestData.get("product class"));
    	requestforfinanceOBJ.RequestForFinance_ProductClass().click();
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    }
        @And("^enter the yield values$")
    public void enter_the_yield_values() throws Throwable {
        	
        	for(int i = 0; i <= 100; i++) {
        		try {
    		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_Yield());
    		requestforfinanceOBJ.RequestForFinance_Yield().sendKeys(requestforfinancetestData.get("yield value"));
    		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_Yield());
    		break;
    			} catch (Exception e) {
    				if(i == 100) {
    					Assert.fail(e.getMessage());
    				}
    			}}
            
    }
      

    @Then("^click on the add buttonss$")
    public void click_on_the_add_buttonss() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_AddIt());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_AddIt());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    }

     
    @Then("^save the record of request for financing$")
    public void save_the_record_of_request_for_financing() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_Save());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_Save());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_Save_ConfrimationPopUp());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_Save_ConfrimationPopUp());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_Save_successnPopUp());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_Save_successnPopUp());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    }
    @Then("^Validate the record of request for financing$")
    public void validate_the_record_of_request_for_financing() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_Validate());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_Validate());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    }
    
    @Then("^move to Approve Level1 under request for financing$")
    public void move_to_approve_level1_under_request_for_financing() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_ApproveLevel1());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_ApproveLevel1());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinanceOBJ.RequestForFinance_ApproveLevel1_clear());
//    	requestforfinanceOBJ.RequestForFinance_FacilityType().sendKeys(requestforfinancetestData.get("FacilityType Code"));
    	requestforfinanceOBJ.RequestForFinance_ApproveLevel1_clear().click();
    	
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_ApproveLevel1_Firstrecord());
		clicksAndActionsHelper.doubleClick(requestforfinanceOBJ.RequestForFinance_ApproveLevel1_Firstrecord());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
  
    }
    
    @Then("^add decision forword and select Limit Creation$")
    public void add_decision_forword_and_select_limit_creation() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_ApproveLevel1_CustomerGradingRecommendations());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_ApproveLevel1_CustomerGradingRecommendations());

		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    	
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_Decision());
    	dropDownHelper.SelectUsingVisibleText(requestforfinanceOBJ.RequestForFinance_Decision(), requestforfinancetestData.get("Decision"));


		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    	waitHelper.waitForElementwithFluentwait(driver,requestforfinanceOBJ.RequestForFinance_Decision_LimitCreation());
    	dropDownHelper.SelectUsingVisibleText(requestforfinanceOBJ.RequestForFinance_Decision_LimitCreation(), requestforfinancetestData.get("LimitCreationDecision"));

    	
    }
     
    @Then("^Approve the record of request for financing$")
    public void approve_the_record_of_request_for_financing() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
    			clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_ApproveButton());
    	requestforfinanceOBJ.RequestForFinance_ApproveButton().click();
    	break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	

    }
    @Then("^move to Limit Creation under request for financing$")
    public void move_to_limit_creation_under_request_for_financing() throws Throwable {

    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_LimitCreation());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_LimitCreation());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    	
    }
    @Then("^retrieve the record under limit creation$")
    public void retrieve_the_record_under_limit_creation() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,requestforfinanceOBJ.RequestForFinance_LimitCreation_Clear());
    	requestforfinanceOBJ.RequestForFinance_LimitCreation_Clear().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver,requestforfinanceOBJ.RequestForFinance_LimitCreation_FirstRecord());
    	clicksAndActionsHelper.doubleClick(requestforfinanceOBJ.RequestForFinance_LimitCreation_FirstRecord());
    } 
    @Then("^Validate the status limit created$")
    public void validate_the_status_limit_created() throws Throwable {
    	

    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_LimitCreateButton());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_LimitCreateButton());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_LimitCreate_confrimPopUp());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_LimitCreate_confrimPopUp());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    	for(int i = 0; i <= 100; i++) {
    		try {
		clicksAndActionsHelper.moveToElement(requestforfinanceOBJ.RequestForFinance_LimitCreate_successPopUp());
		clicksAndActionsHelper.clickOnElement(requestforfinanceOBJ.RequestForFinance_LimitCreate_successPopUp());
		break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    }
    
	
	 
	

}
