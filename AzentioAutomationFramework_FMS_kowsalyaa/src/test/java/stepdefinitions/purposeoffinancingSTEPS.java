package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.fms.purposeoffinancingOBJ;
import resources.BaseClass;

public class purposeoffinancingSTEPS {
	WebDriver driver = BaseClass.driver;
	purposeoffinancingOBJ purposeoffinancing = new purposeoffinancingOBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper 	clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	FMSLogin fmsLogin = new FMSLogin(driver);
	
	
//Fms_param
    @And("^User clicks the Purpose of financing under parameters$")
    public void user_clicks_the_purpose_of_financing_under_parameters() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.purposeoffinancing());
		 purposeoffinancing.purposeoffinancing().click();
       
    }

    @And("^User clicks the Maintenance under Purpose of financing$")
    public void user_clicks_the_maintenance_under_purpose_of_financing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.purposeoffinancingmaintenance());
		 purposeoffinancing.purposeoffinancingmaintenance().click();
       
    }

    @And("^User Enter a code under maintenance screen$")
    public void user_enter_a_code_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.maintenancecode());
		 purposeoffinancing.maintenancecode().sendKeys("6565");
       
    }

    @And("^User Enter a Addditional number under maintenance screen$")
    public void user_enter_a_addditional_number_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.additionalnumber());
		 purposeoffinancing.additionalnumber().sendKeys("123456");
       
    }

    @And("^User Enter a Discription under maintenance screen$")
    public void user_enter_a_discription_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.discription());
		 purposeoffinancing.discription().sendKeys("123456");
       
    }

    @And("^User clicks the Product class to add$")
    public void user_clicks_the_product_class_to_add() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.productclass());
		 purposeoffinancing.productclass().click();
		 
		// waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.productclassaddbutton());
		 purposeoffinancing.productclassaddbutton().click();
		 
		// waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.productclasssearchbutton());
		 purposeoffinancing.productclasssearchbutton().sendKeys("1");
		 purposeoffinancing.productclasssearchbutton().sendKeys(Keys.TAB);
      
       
    }

    @And("^User save the Product class details$")
    public void user_save_the_product_class_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.productclasssavebutton());
		 purposeoffinancing.productclasssavebutton().click();
		 
		 waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.saveButtonConfirmOk());
		 purposeoffinancing.saveButtonConfirmOk().click();
		 
		 waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.saveButtonSuccessOk());
		 purposeoffinancing.saveButtonSuccessOk().click();
		 
       
    }

    @And("^User clicks the approve menu under Purpose of financing$")
    public void user_clicks_the_approve_menu_under_purpose_of_financing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.purposeoffinancingapprove());
		 purposeoffinancing.purposeoffinancingapprove().click();
		 
		 waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.approvesearchbox());
		 purposeoffinancing.approvesearchbox().sendKeys("6565");
		 purposeoffinancing.approvesearchbox().sendKeys(Keys.ENTER);
		 clicksAndActionsHelper.doubleClick(purposeoffinancing.approvesearchboxretrivedata());
       
    }
    @Then("^User clicks the final approve$")
    public void user_clicks_the_final_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.approvebutton());
		 purposeoffinancing.approvebutton().click();
       
    }
	
	//Fms_core
	 @And("^user Clicks the product class value one$")
	    public void user_clicks_the_product_class_value_one() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.productclassvalue());
		 purposeoffinancing.productclassvalue().sendKeys("1");
	        
	    }

	    @And("^user clicks the Purpose of financing to retrive the value$")
	    public void user_clicks_the_purpose_of_financing_to_retrive_the_value() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, purposeoffinancing.purposeoffinancing());
	    	Thread.sleep(3000);
			 purposeoffinancing.purposeoffinancing().click();
	        
	    }

	

}
