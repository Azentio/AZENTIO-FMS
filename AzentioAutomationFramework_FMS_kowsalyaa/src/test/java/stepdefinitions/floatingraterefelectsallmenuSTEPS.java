package stepdefinitions;

import org.openqa.selenium.WebDriver;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.fms.floatingratereflectsallmenuOBJ;
import resources.BaseClass;

public class floatingraterefelectsallmenuSTEPS {
	WebDriver driver = BaseClass.driver;
	floatingratereflectsallmenuOBJ floatingratereflectsallmenu = new floatingratereflectsallmenuOBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper 	clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	FMSLogin fmsLogin = new FMSLogin(driver);
	StringBuffer refID = new StringBuffer();
	
	 @And("^select the Approve level1 decision as approve $")
	    public void select_the_approve_level1_decision_as_approve() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approveLevel1SelectDecision());
		 dropDownHelper.SelectUsingVisibleText(floatingratereflectsallmenu.approveLevel1SelectDecision(), "Approve");
		// dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), testData.get("Decision1"));
	 }
	 
	 @And("^User clicks the Approve Level2 link$")
	    public void user_clicks_the_approve_level2_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.applicationFinancialFacilityApproveLevel2());
	    	floatingratereflectsallmenu.applicationFinancialFacilityApproveLevel2().click();
	    }
	    
	    @And("^User retrive the first data in approve level2$")
	    public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approve2ClearBtn());
	    	floatingratereflectsallmenu.approve2ClearBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approveLevel2RetriveData());
	    	clicksAndActionsHelper.doubleClick(floatingratereflectsallmenu.approveLevel2RetriveData());
	    }

	    @And("^User select the level2 decision as approve$")
	    public void user_select_the_level2_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approveLevel2SelectDecision());
        	dropDownHelper.SelectUsingVisibleText(floatingratereflectsallmenu.approveLevel2SelectDecision(), "Approve");
	    	//dropDownHelper.SelectUsingVisibleText(floatingratereflectsallmenu.approveLevel2SelectDecision(), testData.get("Decision2"));
	    }

	    @And("^User clicks on the level2 submit button$")
	    public void user_clicks_on_the_level2_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approveLevel2SubmitBtn());
	    	floatingratereflectsallmenu.approveLevel2SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.ButtonConfirmOk1());
	    	floatingratereflectsallmenu.ButtonConfirmOk1().click();
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.ButtonSuccessOk1());
	    	floatingratereflectsallmenu.ButtonSuccessOk1().click();
	    }

	    @And("^User clicks the Approve Level3 link$")
	    public void user_clicks_the_approve_level3_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.applicationFinancialFacilityApproveLevel3());
	    	floatingratereflectsallmenu.applicationFinancialFacilityApproveLevel3().click();
	    }
	    
	    @And("^User retrive the first data in approve level3$")
	    public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approve3ClearBtn());
	    	floatingratereflectsallmenu.approve3ClearBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approveLevel3RetriveData());
	    	clicksAndActionsHelper.doubleClick(floatingratereflectsallmenu.approveLevel3RetriveData());
	    }
	    
	    @And("^User select the level3 decision as approve$")
	    public void user_select_the_level3_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approveLevel3SelectDecision());
        	dropDownHelper.SelectUsingVisibleText(floatingratereflectsallmenu.approveLevel3SelectDecision(), "Approve");
	    	//dropDownHelper.SelectUsingVisibleText(floatingratereflectsallmenu.approveLevel3SelectDecision(), testData.get("Decision3"));
	    
	    }
	    
	    @When("^User clicks on the level3 submit button$")
	    public void user_clicks_on_the_level3_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.approveLevel3SubmitBtn());
	    	floatingratereflectsallmenu.approveLevel3SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.ButtonConfirmOk1());
	    	floatingratereflectsallmenu.ButtonConfirmOk1().click();
	    	waitHelper.waitForElementwithFluentwait(driver, floatingratereflectsallmenu.ButtonSuccessOk1());
	    	floatingratereflectsallmenu.ButtonSuccessOk1().click();
	    }
		 
}
