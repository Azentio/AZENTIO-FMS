package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.AT_IISPRM_008_OBJ;
import pageobjects.CommonElements.FMSCommonWebElements;
import resources.BaseClass;

 

public class AT_IISPRM_008 extends BaseClass
{
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	AT_IISPRM_008_OBJ atiisprm008obj =new AT_IISPRM_008_OBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();


	@Given("^navigate to the IISParam Application and login with valid credentials$")
    public void navigate_to_the_IISParam_Application_and_login_with_valid_credentials() throws Throwable 
	{
		driver.get(configFileReader.getIISParamApplicationUrl());
		iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
    }

	@And("^user click on parameters$")
	public void user_click_on_parameters() throws Throwable
	{
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.Parameters());
		seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm008obj.Parameters());
	}

	@And("^user click on product class under the parameters$")
	public void user_click_on_product_class_under_the_parameters() throws Throwable
	{
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.ProductClass());
		seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm008obj.ProductClass());
		javascriptHelper.scrollIntoView(atiisprm008obj.ProductClass());
	}

	@And("^user click on maintenance under the product class$")
	public void user_click_on_maintenance_under_the_product_class() throws Throwable
	{
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.Maintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm008obj.Maintenance());
		javascriptHelper.scrollIntoView(atiisprm008obj.ProductClass());
	}

	@And("user checking the auto financingbox under the general information")
	public void user_cheking_the_auto_financingbox_under_the_general_information() {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.Autofinancingcheckbox());
		Assert.assertFalse(atiisprm008obj.Autofinancingtext().isSelected());
		//System.out.println(atiisprm008obj.Autofinancingtext());
	}


	@And("^user click on additional information$")
	public void user_click_on_additional_information() throws Throwable
	{
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.AdditionalInformationtab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm008obj.AdditionalInformationtab());
	}

	@And("^user click on repayement plan under the additional information$")
	public void user_click_on_repayement_plan_under_the_additional_information() throws Throwable
	{
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.RepayementPlan());
		seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm008obj.RepayementPlan());
		javascriptHelper.scrollIntoView(atiisprm008obj.RepayementPlan());
		
		}

	@And("^check the flag enable grace period under the informational repayment plan tab$")
	public void check_the_flag_enable_grace_period_under_the_informational_repayment_plan_tab() throws Throwable
	{
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.Graceperiodbox());
		seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm008obj.Graceperiodbox());
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.SetDatebox());
		Assert.assertTrue(atiisprm008obj.SetDatebox().isDisplayed());
		
	}
	@And("^first payment date and cutoff date for first payment date is visible$")
	public void first_payment_date_and_cutoff_date_for_first_payment_date_is_visible()throws Throwable
	{
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.FirstPaymentDay());
		Assert.assertTrue(atiisprm008obj.FirstPaymentDay().isDisplayed());
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.Cutoffdayforfirstpaymentdate());
		Assert.assertTrue(atiisprm008obj.Cutoffdayforfirstpaymentdate().isDisplayed());
	
	}
	
	@And("^user check default comment date checkbox$")
	public void user_check_default_comment_date_checkbox() {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm008obj.Defaultcomment());
		//seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm008obj.Defaultcomment());
		Assert.assertFalse(atiisprm008obj.Defaultcomment().isSelected());
	}

}