package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.FMSCommonWebElements;
import resources.BaseClass;

public class LoginTest extends BaseClass {
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	@Given("^navigate to FMS application and login with valid credentials$")
    public void navigate_to_fms_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		System.out.println(configFileReader.getFMSApplicationUserType());
		FMSLogin.loginIntoFmsApplication2(configFileReader.getFMSApplicationUserType());
    }

	@Given("^navigate to FMS param application and login with valid credentials$")
    public void navigate_to_fms_param_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSparamsUrl());
		System.out.println(configFileReader.getFMSParamApplicationUserType());
		FMSLogin.loginIntoFmsParamApplication(configFileReader.getFMSParamApplicationUserType());
    }
	@Given("^navigate to FMS sads application and login with valid credentials$")
    public void navigate_to_fms_sads_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getSADSApplicationUrl());
		FMSLogin.loginIntoSadsApplication(configFileReader.getSADSApplicationUserType());
    }
	
	@And("^logout from the application$")
	public void logout_from_the_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLogoutButton());
		clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsLogoutButton());
		clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsLogoutButton());
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsUserName());
		Assert.assertTrue(fmsCommonWebElements.fmsUserName().isDisplayed());
	}

}
