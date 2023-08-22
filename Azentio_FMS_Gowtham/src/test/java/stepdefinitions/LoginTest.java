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
	ITRS_Login itrs_Login= new ITRS_Login(driver);
	MTS_Login mts_Login = new MTS_Login(driver);
	IIS_Login iis_login = new IIS_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();

	@Given("^navigate to FMS application and login with valid credentials$")
	public void navigate_to_fms_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		FMSLogin.loginIntoFmsApplication(configFileReader.getFMSApplicationUserType());
	}

	@Given("^navigate to FMS param application and login with valid credentials$")
	public void navigate_to_fms_param_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSparamsUrl());
		//System.out.println(configFileReader.getFMSParamApplicationUserType());
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
	
	@Given("^navigate to ITRS application and login with valid credentials$")
	public void navigate_to_ITRS_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getITRS_ApplicationURL());
		itrs_Login.loginIntoITRSApplication(configFileReader.getITRSApplicationUserType());
	}

	@Given("^navigate to MTS application and login with valid credentials$")
	public void navigate_to_MTS_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getMTS_ApplicationURL());
		mts_Login.loginIntoMTSApplication(configFileReader.getMTSApplicationUserType());
	}

	@Given("navigate to IIS application and login with valid credentials")
	public void navigate_to_iis_application_and_login_with_valid_credentials() {
		driver.get(configFileReader.getIIS_ApplicationURL());
		iis_login.loginIntoIISApplication(configFileReader.getIISApplicationUserType());
	}
	
	@Given("navigate to IIS param application and login with valid credentials")
	public void navigate_to_IIS_param_application_and_login_with_valid_credentials() {
		driver.get(configFileReader.getIISparam_ApplicationURL());
		iis_login.loginIntoIISApplication(configFileReader.getIISparamApplicationUserType());
	}


}
