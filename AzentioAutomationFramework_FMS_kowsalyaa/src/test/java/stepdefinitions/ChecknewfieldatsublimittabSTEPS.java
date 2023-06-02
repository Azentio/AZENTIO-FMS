package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.fms.ChecknewfieldatsublimittabOBJ;
import pageobjects.fms.LimitadditionaldetailsOBJ;
import resources.BaseClass;

public class ChecknewfieldatsublimittabSTEPS {
	WebDriver driver = BaseClass.driver;
	ChecknewfieldatsublimittabOBJ checknewfieldatsublimittab = new ChecknewfieldatsublimittabOBJ(driver);
	LimitadditionaldetailsOBJ limitadditionaldetails = new LimitadditionaldetailsOBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper 	clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	FMSLogin fmsLogin = new FMSLogin(driver);
	StringBuffer refID = new StringBuffer();
	
	@And("^Enter the Expiry date$")
	public void enter_the_expiry_date() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.additionalTabExpireCalender());
		checknewfieldatsublimittab.additionalTabExpireCalender().click();
		
		waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.additionalTabExpireDate());
		checknewfieldatsublimittab.additionalTabExpireDate().click();
	}
	 
	
	@And("^Click the add button$")
    public void click_the_add_button() throws Throwable {
		for(int i = 0; i <= 300; i++) {
    		try {
    			javascriptHelper.scrollIntoView(checknewfieldatsublimittab.addProductclass());
			} catch (Exception e) {
				if(i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.addProductclass());
		checknewfieldatsublimittab.addProductclass().click();
        
    }
	
	  @And("^Click the doucmentdetailstab$")
	    public void click_the_doucmentdetailstab() throws Throwable {
		  for(int i = 0; i <= 500; i++) {
	    		try {
	    			clicksAndActionsHelper.clickUsingActionClass(checknewfieldatsublimittab.documentdetailstab(),
	    					checknewfieldatsublimittab.documentdetailstab());
				} catch (Exception e) {
					if(i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
		  
//		  waitHelper.waitForElementwithFluentwait(driver, newmodificationfmsobj.documentdetailstab());
//	      newmodificationfmsobj.documentdetailstab().click();
	    }

	    @And("^Enter the value for slicitorname$")
	    public void enter_the_value_for_slicitorname() throws Throwable {
	    	for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.scrollIntoView(checknewfieldatsublimittab.solicitornamesearchbox());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.solicitornamesearchbox());
	    	checknewfieldatsublimittab.solicitornamesearchbox().sendKeys("1");;
	    	checknewfieldatsublimittab.solicitornamesearchbox().sendKeys(Keys.TAB);
	    }


	    @And("^Enter the value for estimators name$")
	    public void enter_the_value_for_estimators_name() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.estimatornamesearchbox());
	    	checknewfieldatsublimittab.estimatornamesearchbox().sendKeys("1");
	    	checknewfieldatsublimittab.estimatornamesearchbox().sendKeys(Keys.TAB);
	    	
	    }
	    @And("^User clicks the save button$")
	    public void user_clicks_the_save_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.limitDetailsSaveBtn());
	    	checknewfieldatsublimittab.limitDetailsSaveBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.ButtonConfirmOk());
	    	checknewfieldatsublimittab.ButtonConfirmOk().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.ButtonSuccessOk());
	    	checknewfieldatsublimittab.ButtonSuccessOk().click();
	    }

	    @And("^User clicks the validate button$")
	    public void user_clicks_the_validate_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.limitDetailsValidateBtn());
	    	checknewfieldatsublimittab.limitDetailsValidateBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.ButtonConfirmOk());
	    	checknewfieldatsublimittab.ButtonConfirmOk().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
					checknewfieldatsublimittab.facilityAlreadyCreatedPopup().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.limitDetailsValidateSuccessMsg());
	    	String SuccessMsg = checknewfieldatsublimittab.limitDetailsValidateSuccessMsg().getText();
	    	String substring = SuccessMsg.substring(23, 27);
	    	refID.append(substring);
	    	System.err.println("Reference Number: "+refID);
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
					checknewfieldatsublimittab.ButtonSuccessOk().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
					
				}
			}   	
	    	waitHelper.waitForElementwithFluentwait(driver, limitadditionaldetails.sendAlertPopup());
	    	limitadditionaldetails.sendAlertPopup().click();
	    }

	    @And("^User clicks the Approve Level1 link$")
	    public void user_clicks_the_approve_level1_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.applicationFinancialFacilityApproveLevel1());
	    	checknewfieldatsublimittab.applicationFinancialFacilityApproveLevel1().click();  	
	    }
	    
	    @And("^User retrive the first data in approve level1$")
	    public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.approve1ClearBtn());
	    	checknewfieldatsublimittab.approve1ClearBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.approveLevel1RetriveData());
	    	clicksAndActionsHelper.doubleClick(checknewfieldatsublimittab.approveLevel1RetriveData());
	    }

	    @And("^User select the level1 devision as approve$")
	    public void user_select_the_level1_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.approveLevel1SelectDevision());
        	dropDownHelper.SelectUsingVisibleText(checknewfieldatsublimittab.approveLevel1SelectDevision(), "Approve");
	    	//dropDownHelper.SelectUsingVisibleText(floatingratereflectsallmenu.approveLevel1SelectDevision(), testData.get("Decision1"));
	    }

	    @And("^User clicks on the level1 submit button$")
	    public void user_clicks_on_the_level1_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.approveLevel1SubmitBtn());
	    	checknewfieldatsublimittab.approveLevel1SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.ButtonConfirmOk());
	    	checknewfieldatsublimittab.ButtonConfirmOk().click();
	    	waitHelper.waitForElementwithFluentwait(driver, checknewfieldatsublimittab.ButtonSuccessOk());
	    	checknewfieldatsublimittab.ButtonSuccessOk().click();
	    	
	    }

	    
	
		
	}


 