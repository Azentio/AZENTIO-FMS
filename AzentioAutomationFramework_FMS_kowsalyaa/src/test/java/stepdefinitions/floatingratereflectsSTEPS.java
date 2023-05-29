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
import io.cucumber.java.en.Then;
import pageobjects.fms.FloatingratereflectsfromparamOBJ;
import resources.BaseClass;

public class floatingratereflectsSTEPS {
	WebDriver driver = BaseClass.driver;
	FloatingratereflectsfromparamOBJ floatingratereflects = new FloatingratereflectsfromparamOBJ(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	JavascriptHelper javascript = new JavascriptHelper(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clickactionhelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumaction = new Selenium_Actions(driver);
	FMSLogin fmslogin = new FMSLogin(driver);
	


    @And("^Click the limit details tab$")
    public void click_the_limit_details_tab() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, floatingratereflects.limitdetailstab());
    	floatingratereflects.limitdetailstab().click();
        
    }

    @And("^Click the add button under limit details tab$")
    public void click_the_add_button_under_limit_details_tab() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, floatingratereflects.limitdetailstabaddbutton());
    	floatingratereflects.limitdetailstabaddbutton().click();
    	
        
    }

    @And("^Enter the Product class$")
    public void enter_the_product_class() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, floatingratereflects.productclasssearchbox());
    	floatingratereflects.productclasssearchbox().sendKeys("2");
    	floatingratereflects.productclasssearchbox().sendKeys(Keys.TAB);
    	
        
    }

    @And("^Enter the floating rate$")
    public void enter_the_floating_rate() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, floatingratereflects.floatingRateSearchbox());
    	floatingratereflects.floatingRateSearchbox().click();
    	floatingratereflects.floatingRateSearchbox().sendKeys("41");
    	floatingratereflects.floatingRateSearchbox().sendKeys(Keys.TAB);
    	for (int i = 0; i <= 1000; i++) {
    		if (!(floatingratereflects.floatingRateSearchbox().getAttribute("prevvalue").isBlank())) {
    		break;
    		} else if (i == 1000) {
    			Assert.fail("Data Not populated");
    		}
   		}     
    }

    @And("^Enter the floating rate periodicity$")
    public void enter_the_floating_rate_periodicity() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, floatingratereflects.floatingrateperiodicitysearchbox());
    	floatingratereflects.floatingrateperiodicitysearchbox().sendKeys("2");
    	floatingratereflects.floatingrateperiodicitysearchbox().sendKeys(Keys.TAB);
        
    }
    @Then("^Enter the floating rate periodicity type$")
    public void enter_the_floating_rate_periodicity_type() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, floatingratereflects.floatingrateperiodicitytypesearchbox());
    	dropdownhelper.SelectUsingVisibleText(floatingratereflects.floatingrateperiodicitytypesearchbox(),"Month(s)");
    }
    

	
	
	
	
	
	
	
}

