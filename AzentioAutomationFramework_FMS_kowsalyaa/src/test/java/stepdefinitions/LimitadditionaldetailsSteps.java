package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.fms.LimitadditionaldetailsOBJ;
import resources.BaseClass;

public class LimitadditionaldetailsSteps {
	WebDriver driver = BaseClass.driver;
	LimitadditionaldetailsOBJ limitadditionaldetails = new LimitadditionaldetailsOBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper 	clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	FMSLogin fmsLogin = new FMSLogin(driver);
	
	
	@And("^user choose the product class from iis param$")
    public void user_choose_the_product_class_from_iis_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.productclassvalue());
		limitadditionaldetails.productclassvalue().sendKeys("5588",Keys.TAB);
		
		waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.limitDetailsNewRecordCleanFlag());
        WebElement cleanFlag = limitadditionaldetails.limitDetailsNewRecordCleanFlag();
        if(!(cleanFlag.isSelected())) {
            cleanFlag.click();
            Thread.sleep(5000);
        }
		
	}
	 @And("^user clicks the facility management under wifak application$")
	    public void user_clicks_the_facility_management_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.facilitymanagement());
		limitadditionaldetails.facilitymanagement().click();
	        
	    }

	    @And("^user clicks the update after approve under wifak application$")
	    public void user_clicks_the_update_after_approve_under_wifak_application() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.updateafterapprove());
			limitadditionaldetails.updateafterapprove().click();
			limitadditionaldetails.updateafterapproveclearbtn().click();
			clicksAndActionsHelper.doubleClick(limitadditionaldetails.retrivedatadoubleclick());
	        
	    }
	    @And("^user clicks the facility limit details tab$")
	    public void user_clicks_the_facility_limit_details_tab() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.facilitylimitdetails());
			limitadditionaldetails.facilitylimitdetails().click();
	        
	    }

	    @And("^Enter the value of Yield details and Margin rate$")
	    public void enter_the_value_of_yield_details_and_margin_rate() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.limitadditionalyielddetails());
	    	limitadditionaldetails.limitadditionalyielddetails().clear();
	    	limitadditionaldetails.limitadditionalyielddetails().sendKeys("11");
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.limitadditionaldetailsMarginRate());
	    	limitadditionaldetails.limitadditionaldetailsMarginRate().clear();
	    	limitadditionaldetails.limitadditionaldetailsMarginRate().sendKeys("2");
	    	
	    }
	    @And("^Enter the value of doucment code dates$")
	    public void enter_the_value_of_doucment_code_dates() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.solicitordatesent());
	    	limitadditionaldetails.doubleclickfordatevalue().click();
	    	limitadditionaldetails.solicitordatesent().sendKeys("30/05/2023");
	        limitadditionaldetails.solicitordatereceived().sendKeys("30/05/2023");
	        limitadditionaldetails.estimatordatesent().sendKeys("30/05/2023");
	        limitadditionaldetails.estimatordatereceived().sendKeys("30/05/2023");
	    }
	    @And("^user clicks the Approve menu under facility management$")
	    public void user_clicks_the_approve_menu_under_facility_management() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.facilitymanagementapprove());
	    	limitadditionaldetails.facilitymanagementapprove().click();
	    }
	    @And("^User clicks the maintenance under facility management$")
	    public void user_clicks_the_maintenance_under_facility_management() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.facilitymanagementmaintenance());
	    	limitadditionaldetails.facilitymanagementmaintenance().click();
	    	limitadditionaldetails.facilitymanagementmaintenanceclear().clear();
	    	
	    }
	   
	    
	    
	    



}
