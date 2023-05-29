package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v108.fetch.model.RequestId;
import org.testng.Assert;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.fms.RequestforfinancingOBJ;
import resources.BaseClass;

public class RequestforfinancingSTEPS {
	WebDriver driver = BaseClass.driver;
	RequestforfinancingOBJ requestforfinancingOBJ = new RequestforfinancingOBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper 	clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	FMSLogin fmsLogin = new FMSLogin(driver);
	String requestID;

	    @And("^Click the request for financin in fms application$")
	    public void click_the_request_for_financin_in_fms_application() throws Throwable {
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascriptHelper.scrollIntoView(requestforfinancingOBJ.REQUESTFORFINANCIN());
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	requestforfinancingOBJ.REQUESTFORFINANCIN().click();
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

//	    @And("^click the customer word$")
//	    public void click_the_customer_word() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.customer());
//	    	requestforfinancingOBJ.customer().click();
//	    	
//	        
//	    }

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

//	    @And("^click the facility type touch$")
//	    public void click_the_facility_type_touch() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.facilitytypetouch());
//	    	requestforfinancingOBJ.facilitytypetouch().click();
//	        
//	    }

	    @And("^Enter the total limit under global limit$")
	    public void enter_the_total_limit_under_global_limit() throws Throwable {
	    	
		    	for(int i = 0; i <= 300; i++) {
		    		try {
		    			javascriptHelper.scrollIntoView(requestforfinancingOBJ.totallimitsearchbox());
					} catch (Exception e) {
						if(i == 300) {
							Assert.fail(e.getMessage());
						}
					}
		    	}
		    	requestforfinancingOBJ.totallimitsearchbox().sendKeys("10000");
		    	requestforfinancingOBJ.facilitytypetouch().click();
		    	
		    }
	    	
	    	
//	    @And("^Click the total limit word$")
//	    public void click_the_total_limit_word() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.totallimit());
//	    	requestforfinancingOBJ.totallimitsearchbox().click();
//	    }

	    @And("^Click the Disbursement Sublimit under maintenance screen$")
	    public void click_the_disbursement_sublimit_under_maintenance_screen() throws Throwable {
	    	
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascriptHelper.scrollIntoView(requestforfinancingOBJ.disbursementsublimit());
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
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

//	    @And("^click the product class values word$")
//	    public void click_the_product_class_values_word() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.productclass());
//	    	requestforfinancingOBJ.productclass().click();
//	        
//	    }

	    @And("^Add the Margin values in Margin$")
	    public void add_the_margin_values_in_margin() throws Throwable {
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascriptHelper.scrollIntoView(requestforfinancingOBJ.marginsearchbox());
	    			requestforfinancingOBJ.marginsearchbox().clear();
	    	    	requestforfinancingOBJ.marginsearchbox().sendKeys("1",Keys.ENTER);
	    			break;
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	
	    }

//	    @And("^Click the Margin values word$")
//	    public void click_the_margin_values_word() throws Throwable {
//	        
//	    }

	    @And("^Enter the tenure value in tenure$")
	    public void enter_the_tenure_value_in_tenure() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.tenure());
	    	requestforfinancingOBJ.tenure().click();
	        
	    }

	    @And("^Add all the Above limit values$")
	    public void add_all_the_above_limit_values() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.addbutton());
	    	requestforfinancingOBJ.addbutton().click();
	        
	    }

	    @And("^Save all the values when limits are add$")
	    public void save_all_the_values_when_limits_are_add() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.savebutton());
	    	requestforfinancingOBJ.savebutton().click();
	        
	    }

	    @And("^Confirm the popup menu when all the limits are saved$")
	    public void confirm_the_popup_menu_when_all_the_limits_are_saved() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.confirmsavepopupokbutton());
	       // requestID = requestforfinancingOBJ.confirmsavepopupokbutton()
	        
	    }

	    @And("^Click the final save popup message$")
	    public void click_the_final_ok_popup_message() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.confirmsavesuccessfullypopup());
	    	requestforfinancingOBJ.confirmsavesuccessfullypopup().click();
	    	
	        
	    }

	    @And("^Click the validate button when all the values are saved$")
	    public void click_the_validate_button_when_all_the_values_are_saved() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.validatebutton());
	    	requestforfinancingOBJ.validatebutton().click();
	        
	    }

	    @And("^Confirm the validate popup menu$")
	    public void confirm_the_validate_popup_menu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.confirmvalidatepopupokbutton());
	    	requestforfinancingOBJ.confirmvalidatepopupokbutton().click();
	        
	        
	    }

	    @And("^Click the final validate popup$")
	    public void click_the_final_validate_popup() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.validatesuccessfullypopup());
	    	requestforfinancingOBJ.validatesuccessfullypopup().click();
	        
	    }

	    @And("^Click the Approve level1 screen under request for financing$")
	    public void click_the_approve_level1_screen_under_request_for_financing() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestforfinancingOBJ.approvelevel1());
	    	requestforfinancingOBJ.approvelevel1().click();
	        
	    }

	    @And("^Enter the request code in search box$")
	    public void enter_the_request_code_in_search_box() throws Throwable {
	        
	    }

	    @And("^Double tap the request code value$")
	    public void double_tap_the_request_code_value() throws Throwable {
	        
	    }

	    @And("^Click the customer grading recommendation under maintenance screen$")
	    public void click_the_customer_grading_recommendation_under_maintenance_screen() throws Throwable {
	        
	    }

	    @And("^Click the decision dropdown and select forward menu$")
	    public void click_the_decision_dropdown_and_select_forward_menu() throws Throwable {
	        
	    }

	    @And("^click the Approval committe dropdown$")
	    public void click_the_approval_committe_dropdown() throws Throwable {
	        
	    }

	    @And("^Click the investment committe under Approval committe$")
	    public void click_the_investment_committe_under_approval_committe() throws Throwable {
	        
	    }

	    @And("^Approve the decision under relationship$")
	    public void approve_the_decision_under_relationship() throws Throwable {
	        
	    }

	    @And("^Confirm the Approve popup message$")
	    public void confirm_the_approve_popup_message() throws Throwable {
	        
	    }

	    @And("^Click the final Approve popup$")
	    public void click_the_final_approve_popup() throws Throwable {
	        
	    }

	    @And("^Click the Approval Committee Recommendation under request for financing$")
	    public void click_the_approval_committee_recommendation_under_request_for_financing() throws Throwable {
	        
	    }

	    @And("^Enter the request code in approval committe search box$")
	    public void enter_the_request_code_in_approval_committe_search_box() throws Throwable {
	        
	    }
	    
	    @And("^double tap the request code$")
	    public void double_tap_the_request_code() throws Throwable {
	        
	    }

	    @And("^Click the credit committee recommendation$")
	    public void click_the_credit_committee_recommendation() throws Throwable {
	        
	    }

	    @And("^Click the recommendation under credit committee recommendation$")
	    public void click_the_recommendation_under_credit_committee_recommendation() throws Throwable {
	        
	    }

	    @And("^Click the recommendation add symbol under recommendation$")
	    public void click_the_recommendation_add_symbol_under_recommendation() throws Throwable {
	        
	    }

	    @And("^double tap all the value we created$")
	    public void double_tap_all_the_value_we_created() throws Throwable {
	        
	    }

	    @And("^send back the recommendation  value$")
	    public void send_back_the_recommendation_value() throws Throwable {
	        
	    }

	    @And("^Click the Maitenance level in send back level$")
	    public void click_the_maitenance_level_in_send_back_level() throws Throwable {
	        
	    }

	    @And("^Confirm the recommendation popup menu$")
	    public void confirm_the_recommendation_popup_menu() throws Throwable {
	        
	    }

	    @And("^Accept the recommendation popup menu$")
	    public void accept_the_recommendation_popup_menu() throws Throwable {
	        
	    }

	    @And("^Click the maintenance screen under request for financing$")
	    public void click_the_maintenance_screen_under_request_for_financing() throws Throwable {
	        
	    }

	    @And("^Click the search button$")
	    public void click_the_search_button() throws Throwable {
	        
	    }

	    @And("^Enter the created request code in search box$")
	    public void enter_the_created_request_code_in_search_box() throws Throwable {
	        
	    }
	    @Then("^double tap the  created request code$")
	    public void double_tap_the_created_request_code() throws Throwable {
	        
	    }


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



