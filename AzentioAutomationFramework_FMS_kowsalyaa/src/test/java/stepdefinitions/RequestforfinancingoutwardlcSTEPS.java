package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.fms.RequestforfinancingoutwardlcOBJ;
import pageobjects.fms.purposeoffinancingOBJ;
import resources.BaseClass;

public class RequestforfinancingoutwardlcSTEPS {
	WebDriver driver = BaseClass.driver;
	RequestforfinancingoutwardlcOBJ outwardlc = new RequestforfinancingoutwardlcOBJ(driver);
	purposeoffinancingOBJ purposeoffinancing = new purposeoffinancingOBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper 	clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	FMSLogin fmsLogin = new FMSLogin(driver);
	
	
	@And("^User select the Item in limit Details$")
    public void user_select_the_item_in_limit_details() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, outwardlc.limitDetailsItem());
        dropDownHelper.SelectUsingVisibleText(outwardlc.limitDetailsItem(), "Import L/C");

        for(int i = 0; i <= 500; i++) {
            try {
                if(!(purposeoffinancing.productclassvalue().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        waitHelper.waitForElementwithFluentwait(driver, outwardlc.limitDetailsNewRecordCleanFlag());
        WebElement cleanFlag = outwardlc.limitDetailsNewRecordCleanFlag();
        if(!(cleanFlag.isSelected())) {
            cleanFlag.click();
            Thread.sleep(5000);
        }
        
    }

 

    @And("^User select the Maturity date in limit Details$")
    public void user_select_the_maturity_date_in_limit_details() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, outwardlc.limitDetailsMaturityDateCalender());
        outwardlc.limitDetailsMaturityDateCalender().click();
        waitHelper.waitForElementwithFluentwait(driver, outwardlc.limitDetailsItem());
        outwardlc.limitDetailsMaturityDate().click();
    }

}
