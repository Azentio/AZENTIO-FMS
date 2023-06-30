package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	
	@Given("navigate to FMS application and login with valid credentials for alert functionality")
	public void navigate_to_fms_application_and_login_with_valid_credentials_for_alert_functionality() {
		driver.get(configFileReader.getFMSApplicationUrl());
		FMSLogin.loginIntoFmsApplication(configFileReader.getFMSApplicationUserTypeSendAlert());
	}

	@Given("^navigate to FMS application and login with valid credentials$")
    public void navigate_to_fms_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		FMSLogin.loginIntoFmsApplication(configFileReader.getFMSApplicationUserType());
    }
	@And("^User Enter value for Long Description  in Maintenance screen under Collateral Management$")
    public void user_enter_value_for_long_description_in_maintenance_screen_under_collateral_management() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		FMSLogin.loginIntoFmsApplication(configFileReader.getFMSApplicationUserType());
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
