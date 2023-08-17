package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.CommonElements.FMSCommonWebElements;
import resources.BaseClass;

public class LoginTest extends BaseClass {
	WebDriver driver = BaseClass.driver;
	CSMLogin csmLogin = new CSMLogin(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	FMSLogin FMSLogin = new FMSLogin(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	@Given("^navigate to FMS application and login with valid credentials$")
    public void navigate_to_fms_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		System.out.println(configFileReader.getFMSApplicationUserType());
		FMSLogin.loginIntoFmsApplication(configFileReader.getFMSApplicationUserType());
    }

	@Given("^navigate to FMS param application and login with valid credentials$")
    public void navigate_to_fms_param_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSparamsUrl());
		System.out.println(configFileReader.getFMSParamApplicationUserType());
		FMSLogin.loginIntoFmsParamApplication(configFileReader.getFMSParamApplicationUserType());
    }
	
	@Given("^navigate to IIS FMS Param application and login with valid credentials$")
	public void navigate_to_iis_fms_param_application_and_login_with_valid_credentials() throws Throwable {

		driver.get(configFileReader.getIISFMSparamsUrl());
		System.out.println(configFileReader.getIISFMSParamApplicationUserType());
		FMSLogin.loginIntoIISFmsParamApplication(configFileReader.getIISFMSParamApplicationUserType());
	}
	@Given("^navigate to IIS FMS application and login with valid credentials$")
	public void navigate_to_iis_fms_application_and_login_with_valid_credentials() throws Throwable {

		driver.get(configFileReader.getIISFMSUrl());
		System.out.println(configFileReader.getIISFMSApplicationUserType());
		FMSLogin.loginIntoIISFmsApplication(configFileReader.getIISFMSApplicationUserType());
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
	@Given("^navigate to CSM application and login with valid credentials$")
	public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		
		driver.get(configFileReader.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication();
	}

	@Given("^navigate to CSM param application and login with valid credentials$")
	public void navigate_to_csm_param_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getCSMparamsUrl());
		csmLogin.loginIntoCSMParamApplication();
	}

	@Given("^navigate to CSM sads application and login with valid credentials$")
	public void navigate_to_csm_sads_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getSADSApplicationUrl());
		csmLogin.loginIntoSadsApplication();
	}

	@And("^logout from the applications$")
	public void logout_from_the_applications() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLogoutButton());
		clicksAndActionHelper.moveToElement(csmCommonWebElements.csmLogoutButton());
		clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmLogoutButton());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		Assert.assertTrue(csmCommonWebElements.csmUserName().isDisplayed());
	}


}
