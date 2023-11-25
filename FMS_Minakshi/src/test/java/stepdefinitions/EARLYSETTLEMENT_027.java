package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.EARLYSETTLEMENT_OBJ;
import pageobjects.CommonElements.FMSCommonWebElements;

import resources.BaseClass;

public class EARLYSETTLEMENT_027 extends BaseClass {
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	EARLYSETTLEMENT_OBJ earlysettlement_027 = new EARLYSETTLEMENT_OBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Selenium_Actions selenium_actions = new Selenium_Actions(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();

	@And("^user click on early settlement tab$")
	public void user_click_on_early_settlement_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, earlysettlement_027.EARLYSETTLEMENT());
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_actions.getClickAndActionsHelper().clickOnElement(earlysettlement_027.EARLYSETTLEMENT());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
      Thread.sleep(2000);
	}

	
	
	
	@And("^user click on batch early settlement under early settlement tab$")
	public void user_click_on_batch_early_settlement_under_early_settlement_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, earlysettlement_027.BATCHEARLYSETTLEMENT());
		
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_actions.getClickAndActionsHelper().clickOnElement(earlysettlement_027.BATCHEARLYSETTLEMENT());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
		Thread.sleep(2000);
	}
	
	
	
	@And("^user Check the new menu option Batch Create under early settlement$")
	public void user_Check_the_new_menu_option_Batch_Create_under_early_settlement() {
		waitHelper.waitForElementwithFluentwait(driver, earlysettlement_027.CREATE());
		javascriptHelper.scrollIntoView(earlysettlement_027.BATCHEARLYSETTLEMENT());
		Assert.assertTrue(earlysettlement_027.CREATE().isDisplayed());
		
	}
	
	
}
