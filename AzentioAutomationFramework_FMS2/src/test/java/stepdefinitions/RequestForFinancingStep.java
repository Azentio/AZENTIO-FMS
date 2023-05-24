package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.RequestForFinancingObj;
import resources.BaseClass;

public class RequestForFinancingStep {
	WebDriver driver = BaseClass.driver;
	RequestForFinancingObj requestforfinancingOBJ = new RequestForFinancingObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	FMSLogin fmsLogin = new FMSLogin(driver);
	String requestID;
	@And("^Click the request for financin in fms application$")
    public void click_the_request_for_financin_in_fms_application() throws Throwable {
    	for(int i = 0; i <= 100; i++) {
    		try {
    			javascriptHelper.scrollIntoView(requestforfinancingOBJ.REQUESTFORFINANCIN());
    			requestforfinancingOBJ.REQUESTFORFINANCIN().click();
    			break;
			} catch (Exception e) {
				if(i == 100) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	
    }
    
    @And("^Click the request for financing under request for financin$")
    public void click_the_request_for_financing_under_request_for_financin() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.RequestForFinancing());
    	requestforfinancingOBJ.RequestForFinancing().click();
        
    }

    @And("^click the maintenence under request for financing$")
    public void click_the_maintenence_under_request_for_financing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.maintenance());
    	requestforfinancingOBJ.maintenance().click();
        
    }

    @And("^click the reason for submission search box$")
    public void click_the_reason_for_submission_search_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.reasonforsubmisson());
    	dropDownHelper.SelectUsingVisibleText(requestforfinancingOBJ.reasonforsubmisson(), "New Request");
        
    }

    @And("^click the customer search box$")
    public void click_the_customer_search_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.customersearchbox());
    	requestforfinancingOBJ.customersearchbox().sendKeys("727");
    	requestforfinancingOBJ.customer().click();
        Thread.sleep(5000);
    }
        @And("^click the facility type details$")
    public void click_the_facility_type_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.facilitytypedetails());
    	requestforfinancingOBJ.facilitytypedetails().click();
        
    }

    @And("^Enter the facility type code under facility type$")
    public void enter_the_facility_type_code_under_facility_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.facilitytypedetailssearchbox());
    	requestforfinancingOBJ.facilitytypedetailssearchbox().sendKeys("221");
    	requestforfinancingOBJ.facilitytypetouch().click();
        
    }
         @And("^Enter the total limit under global limit$")
    public void enter_the_total_limit_under_global_limit() throws Throwable {
    	
	    	for(int i = 0; i <= 100; i++) {
	    		try {
	    			javascriptHelper.scrollIntoView(requestforfinancingOBJ.totallimitsearchbox());
	    			
				} catch (Exception e) {
					if(i == 100) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	requestforfinancingOBJ.totallimitsearchbox().sendKeys("10000");
	    	requestforfinancingOBJ.facilitytypetouch().click();
	    	
	    }

    	@And("^Click the Disbursement Sublimit under maintenance screen$")
    public void click_the_disbursement_sublimit_under_maintenance_screen() throws Throwable {
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.disbursementsublimit());
    	requestforfinancingOBJ.disbursementsublimit().click();
        
    }

    @And("^Add the limits under Disbursement Sublimit$")
    public void add_the_limits_under_disbursement_sublimit() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.disbursementsublimitaddbutton());
    	requestforfinancingOBJ.disbursementsublimitaddbutton().click();
   
        
    }

    @And("^Add the product class values in product searchbox$")
    public void add_the_product_class_values_in_product_searchbox() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,requestforfinancingOBJ.productclasssearchbox());
    	requestforfinancingOBJ.productclasssearchbox().sendKeys("1");
    	requestforfinancingOBJ.productclass().click();
        
    }
        @And("^Add the Margin values in Margin$")
    public void add_the_margin_values_in_margin() throws Throwable {
    	for(int i = 0; i <= 300; i++) {
    		try {
    			javascriptHelper.scrollIntoView(requestforfinancingOBJ.marginsearchbox());
			} catch (Exception e) {
				if(i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	requestforfinancingOBJ.marginsearchbox().sendKeys("1");
    	requestforfinancingOBJ.margin().click();
        
    }
        @And("^Enter the tenure value in tenure$")
    public void enter_the_tenure_value_in_tenure() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.tenure());
    	requestforfinancingOBJ.tenure().sendKeys("5");
        
    }

    @And("^Add all the Above limit values$")
    public void add_all_the_above_limit_values() throws Throwable {
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.addbutton());
    	requestforfinancingOBJ.addbutton().click();
    }
    @And("^Navigate to Request details section$")
    public void navigate_to_request_details_section() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.RequestDetailsSection());
    	requestforfinancingOBJ.RequestDetailsSection().click();
    }

    @And("^Navigate to Group limit section$")
    public void navigate_to_group_limit_section() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimitSection());
    	requestforfinancingOBJ.GroupLimitSection().click();
    }

    @And("^Click on Add new row icon in Group limit section$")
    public void click_on_add_new_row_icon_in_group_limit_section() throws Throwable {
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_AddButton());
    	requestforfinancingOBJ.GroupLimit_AddButton().click();
    }

    @And("^Enter Group id, Group limit, Group name for row no 1$")
    public void enter_group_id_group_limit_group_name_for_row_no_1() throws Throwable {
    	for(int i=0;i<100;i++)
    	{
    		try {
    			waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupIdTextbox());
    	    	requestforfinancingOBJ.GroupLimit_GroupIdTextbox().click();
    	    	requestforfinancingOBJ.GroupLimit_GroupId().sendKeys("1");
    	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupLimit());
    	    	requestforfinancingOBJ.GroupLimit_GroupLimit().click();
    	    	requestforfinancingOBJ.GroupLimit_GroupLimit().sendKeys("5000");
    	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupName());
    	    	requestforfinancingOBJ.GroupLimit_GroupName().click();
    	    	requestforfinancingOBJ.GroupLimit_GroupName().sendKeys("aa");
    	    	break;
    		}catch (Exception e) {
    			if(i==100) {
    				Assert.fail(e.getMessage());
    			}
    		}
    	}
//    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupId());
//    	requestforfinancingOBJ.GroupLimit_GroupId().click();
//    	requestforfinancingOBJ.GroupLimit_GroupId().sendKeys("1");
//    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupLimit());
//    	requestforfinancingOBJ.GroupLimit_GroupLimit().click();
//    	requestforfinancingOBJ.GroupLimit_GroupLimit().sendKeys("5000");
//    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupName());
//    	requestforfinancingOBJ.GroupLimit_GroupName().click();
//    	requestforfinancingOBJ.GroupLimit_GroupName().sendKeys("aa");
    	
    }

    @And("^Enter Group id, Group limit for row no2$")
    public void enter_group_id_group_limit_for_row_no2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupIdTextbox());
    	requestforfinancingOBJ.GroupLimit_GroupIdTextbox().click();
    	requestforfinancingOBJ.GroupLimit_GroupId().sendKeys("2");
    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupLimit());
    	requestforfinancingOBJ.GroupLimit_GroupLimit().click();
    	requestforfinancingOBJ.GroupLimit_GroupLimit().sendKeys("6000");
    	requestforfinancingOBJ.GroupLimit_GroupName().click();
    }

    @And("^Validate the Group limits exeeded error popup$")
    public void validate_the_group_limits_exeeded_error_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, requestforfinancingOBJ.GroupLimit_GroupLimitExeededPopup());
    	Assert.assertTrue(requestforfinancingOBJ.GroupLimit_GroupLimitExeededPopup().isDisplayed());
    }

}
