package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import pageobjects.CommonElements.FMSCommonWebElements;

public class FMSLogin {
	WebDriver driver;
	FMSCommonWebElements fmsCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	Map<String, String> fmsLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper;

	public FMSLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void loginIntoFmsParamApplication2(String userType) {
		fmsLoginTestData = fmsParamLoginTestData.getTestdata(userType);
		fmsCommonWebElements = new FMSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsUserName());
		fmsCommonWebElements.fmsUserName().click();
		fmsCommonWebElements.fmsUserName().sendKeys(fmsLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsPassword());
		fmsCommonWebElements.fmsPassword().click();
		fmsCommonWebElements.fmsPassword().sendKeys(fmsLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginButon());
		fmsCommonWebElements.fmsLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyCode());
		fmsCommonWebElements.fmsCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			fmsCommonWebElements.fmsCompanyCode().sendKeys(Keys.DELETE);
		}
		fmsCommonWebElements.fmsCompanyCode().sendKeys(fmsLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsBranchCode());
		fmsCommonWebElements.fmsBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			fmsCommonWebElements.fmsBranchCode().sendKeys(Keys.DELETE);
		}
		fmsCommonWebElements.fmsBranchCode().sendKeys(fmsLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyAndBranchLogin());
		fmsCommonWebElements.fmsCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = fmsCommonWebElements.fmsBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsContinueButton());
		fmsCommonWebElements.fmsContinueButton().click();
		for (int i = 0; i <200; i++) {
			try {
				if (fmsCommonWebElements.fms_UserAlreadyLoginPopUp().isDisplayed()) {
					fmsCommonWebElements.fms_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsContinueButton());
		fmsCommonWebElements.fmsContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginValidation());
		Assert.assertTrue(fmsCommonWebElements.fmsLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsUserName());
		 * Assert.assertTrue(fmsCommonWebElements.fmsUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoFmsParamApplication(String userType) {
		fmsLoginTestData = fmsParamLoginTestData.getTestdata(userType);
		fmsCommonWebElements = new FMSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsUserName());
		fmsCommonWebElements.fmsUserName().click();
		fmsCommonWebElements.fmsUserName().sendKeys(fmsLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsPassword());
		fmsCommonWebElements.fmsPassword().click();
		fmsCommonWebElements.fmsPassword().sendKeys(fmsLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginButon());
		fmsCommonWebElements.fmsLoginButon().click();
//		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsContinueButton());
//		fmsCommonWebElements.fmsContinueButton().click();
		for (int i = 0; i <200; i++) {
			try {
				if (fmsCommonWebElements.fms_UserAlreadyLoginPopUp().isDisplayed()) {
					fmsCommonWebElements.fms_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsContinueButton());
		fmsCommonWebElements.fmsContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginValidation());
		Assert.assertTrue(fmsCommonWebElements.fmsLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsUserName());
		 * Assert.assertTrue(fmsCommonWebElements.fmsUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoFmsApplication(String userType) {
		fmsLoginTestData = fmsLoginExceldata.getTestdata(userType);
		fmsCommonWebElements = new FMSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsUserName());
		fmsCommonWebElements.fmsUserName().click();
		fmsCommonWebElements.fmsUserName().sendKeys(fmsLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsPassword());
		fmsCommonWebElements.fmsPassword().click();
		fmsCommonWebElements.fmsPassword().sendKeys(fmsLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginButon());
		fmsCommonWebElements.fmsLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyCode());
		fmsCommonWebElements.fmsCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			fmsCommonWebElements.fmsCompanyCode().sendKeys(Keys.DELETE);
		}
		fmsCommonWebElements.fmsCompanyCode().sendKeys(fmsLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsBranchCode());
		fmsCommonWebElements.fmsBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			fmsCommonWebElements.fmsBranchCode().sendKeys(Keys.DELETE);
		}
		fmsCommonWebElements.fmsBranchCode().sendKeys(fmsLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyAndBranchLogin());
		fmsCommonWebElements.fmsCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = fmsCommonWebElements.fmsBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsContinueButton());
		fmsCommonWebElements.fmsContinueButton().click();
		for (int i = 0; i <200; i++) {
			try {
				if (fmsCommonWebElements.fms_UserAlreadyLoginPopUp().isDisplayed()) {
					fmsCommonWebElements.fms_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsContinueButton());
		fmsCommonWebElements.fmsContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginValidation());
		Assert.assertTrue(fmsCommonWebElements.fmsLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsUserName());
		 * Assert.assertTrue(fmsCommonWebElements.fmsUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoFmsApplication2(String userType) {
		fmsLoginTestData = fmsLoginExceldata.getTestdata(userType);
		fmsCommonWebElements = new FMSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsUserName());
		fmsCommonWebElements.fmsUserName().click();
		fmsCommonWebElements.fmsUserName().sendKeys(fmsLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsPassword());
		fmsCommonWebElements.fmsPassword().click();
		fmsCommonWebElements.fmsPassword().sendKeys(fmsLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginButon());
		fmsCommonWebElements.fmsLoginButon().click();
		for (int i = 0; i <200; i++) {
			try {
				if (fmsCommonWebElements.fms_UserAlreadyLoginPopUp().isDisplayed()) {
					fmsCommonWebElements.fms_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsContinueButton());
		fmsCommonWebElements.fmsContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginValidation());
		Assert.assertTrue(fmsCommonWebElements.fmsLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsUserName());
		 * Assert.assertTrue(fmsCommonWebElements.fmsUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntoSadsApplication(String userType) {
		fmsLoginTestData = sadsLoginExceldata.getTestdata(userType);
		fmsCommonWebElements = new FMSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsUserName());
		fmsCommonWebElements.fmsUserName().click();
		fmsCommonWebElements.fmsUserName().sendKeys(fmsLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsPassword());
		fmsCommonWebElements.fmsPassword().click();
		fmsCommonWebElements.fmsPassword().sendKeys(fmsLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginButon());
		fmsCommonWebElements.fmsLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginValidation());
		Assert.assertTrue(fmsCommonWebElements.fmsLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * fmsCommonWebElements.fmsUserName());
		 * Assert.assertTrue(fmsCommonWebElements.fmsUserName().isDisplayed());
		 * driver.quit();
		 */
	}

}
