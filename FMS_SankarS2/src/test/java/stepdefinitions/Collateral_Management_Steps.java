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
import pageobjects.fms.Collateral_ManagementObj;
import resources.BaseClass;

public class Collateral_Management_Steps {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Collateral_ManagementObj collateralManagementObj = new Collateral_ManagementObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
//	@680390
	@And("^User click on the language option in FMS core$")
    public void user_click_on_the_language_option_in_fms_core() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMSCoreLanguageBtn());
        collateralManagementObj.FMSCoreLanguageBtn().click();
    }

    @And("^User click on the arabic under language option$")
    public void user_click_on_the_arabic_under_language_option() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.arabicLanguage());
    	collateralManagementObj.arabicLanguage().click();
    }

    @And("^User clicks on the the mortgage management module$")
    public void user_clicks_on_the_the_mortgage_management_module() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.arabicMortgageManagementModule());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.arabicMortgageManagementModule());
		collateralManagementObj.arabicMortgageManagementModule().click();
    }

    @And("^User clicks on the Maintanance screen under mortgage management module$")
    public void user_clicks_on_the_maintanance_screen_under_mortgage_management_module() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mortgageManagementMain());
    	collateralManagementObj.mortgageManagementMain().click();
    }

    @And("^User verify the Maintanance screen should be arabic language$")
    public void user_verify_the_maintanance_screen_should_be_arabic_language() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mortgageManagementMainLabel());
    	
    	
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.mortgageManagementMainEnd());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mortgageManagementMainEnd());
    	String saveBtnText = collateralManagementObj.mortgageManagementMainEnd().getText();
//    	System.out.println("Text :"+saveBtnText);
    	Assert.assertEquals(saveBtnText, "حفظ");
    	
    	
    	
    }


}
