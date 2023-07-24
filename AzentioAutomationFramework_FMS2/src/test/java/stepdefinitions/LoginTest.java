package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.FMSCommonWebElements;
import resources.BaseClass;

public class LoginTest extends BaseClass {
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	CSMLogin csmLogin = new CSMLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	@Given("^navigate to FMS application and login with valid credentials$")
    public void navigate_to_fms_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		FMSLogin.loginIntoFmsApplication(configFileReader.getFMSApplicationUserType());
    }
	
	@Given("^User_VAK navigate to FMS application and login with valid credentials$")
    public void User_VAK_navigate_to_fms_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		System.out.println(configFileReader.getFMSApplicationUserType1());
		FMSLogin.loginIntoFmsApplication2(configFileReader.getFMSApplicationUserType1());
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
	
	// CSM_India
		@Given("^navigate to CSM application and login with valid credentials$")
		public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {

			driver.get(configFileReader.getCSMApplicationUrl());
			csmLogin.loginIntoCSMApplication(configFileReader.getCSMApplicationUserType());
		}
//		@Given("^navigate to CSM param application and login with valid credentials$")
//		public void navigate_to_csm_param_application_and_login_with_valid_credentials() throws Throwable {
//			driver.get(configFileReader.getCSMparamsUrl());
//			csmLogin.loginIntoCSMParamApplication("CSMParamUser1");
//		}
		
		
//		IIS_Param
		@Given("^navigate to IIS param application and login with valid credentials$")
	    public void navigate_to_iis_param_application_and_login_with_valid_credentials() throws Throwable {
			driver.get(configFileReader.getIISParamUrl());
			iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
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
