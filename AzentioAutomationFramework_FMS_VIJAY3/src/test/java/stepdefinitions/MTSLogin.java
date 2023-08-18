package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import pageobjects.CommonElements.MTSCommonWebElements;

public class MTSLogin {

	WebDriver driver;
	MTSCommonWebElements mtsCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData iisParamLoginTestData = new ExcelData(TestDataPath, "IISParam_login", "UserType");

	ExcelData iisLoginExceldata = new ExcelData(TestDataPath, "IIS_Login", "UserType");

	Map<String, String> iisLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper;

	public MTSLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void loginIntoiisParamApplication(String userType) {
		iisLoginTestData = iisParamLoginTestData.getTestdata(userType);
		mtsCommonWebElements = new MTSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisUserName());
		mtsCommonWebElements.iisUserName().click();
		mtsCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisPassword());
		mtsCommonWebElements.iisPassword().click();
		mtsCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisLoginButon());
		mtsCommonWebElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisCompanyCode());
		mtsCommonWebElements.iisCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			mtsCommonWebElements.iisCompanyCode().sendKeys(Keys.DELETE);
		}
		mtsCommonWebElements.iisCompanyCode().sendKeys(iisLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(mtsCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(mtsCommonWebElements.iisCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisBranchCode());
		mtsCommonWebElements.iisBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			mtsCommonWebElements.iisBranchCode().sendKeys(Keys.DELETE);
		}
		mtsCommonWebElements.iisBranchCode().sendKeys(iisLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisCompanyAndBranchLogin());
		mtsCommonWebElements.iisCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = mtsCommonWebElements.iisBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisContinueButton());
		mtsCommonWebElements.iisContinueButton().click();
		for (int i = 0; i < 200; i++) {
			try {
				if (mtsCommonWebElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					mtsCommonWebElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisContinueButton());
		mtsCommonWebElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisLoginValidation());
		Assert.assertTrue(mtsCommonWebElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * mtsCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(mtsCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(mtsCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * mtsCommonWebElements.iisUserName());
		 * Assert.assertTrue(mtsCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntoiisParamApplication2(String userType) {
		iisLoginTestData = iisParamLoginTestData.getTestdata(userType);
		mtsCommonWebElements = new MTSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisUserName());
		mtsCommonWebElements.iisUserName().click();
		mtsCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisPassword());
		mtsCommonWebElements.iisPassword().click();
		mtsCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisLoginButon());
		mtsCommonWebElements.iisLoginButon().click();
//		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisContinueButton());
//		mtsCommonWebElements.iisContinueButton().click();
		for (int i = 0; i < 200; i++) {
			try {
				if (mtsCommonWebElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					mtsCommonWebElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisContinueButton());
		mtsCommonWebElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisLoginValidation());
		Assert.assertTrue(mtsCommonWebElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * mtsCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(mtsCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(mtsCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * mtsCommonWebElements.iisUserName());
		 * Assert.assertTrue(mtsCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntomtsApplication(String userType) {
		iisLoginTestData = iisLoginExceldata.getTestdata(userType);
		mtsCommonWebElements = new MTSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisUserName());
		mtsCommonWebElements.iisUserName().click();
		mtsCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisPassword());
		mtsCommonWebElements.iisPassword().click();
		mtsCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisLoginButon());
		mtsCommonWebElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisCompanyCode());
		mtsCommonWebElements.iisCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			mtsCommonWebElements.iisCompanyCode().sendKeys(Keys.DELETE);
		}
		mtsCommonWebElements.iisCompanyCode().sendKeys(iisLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(mtsCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(mtsCommonWebElements.iisCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisBranchCode());
		mtsCommonWebElements.iisBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			mtsCommonWebElements.iisBranchCode().sendKeys(Keys.DELETE);
		}
		mtsCommonWebElements.iisBranchCode().sendKeys(iisLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisCompanyAndBranchLogin());
		mtsCommonWebElements.iisCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = mtsCommonWebElements.iisBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisContinueButton());
		mtsCommonWebElements.iisContinueButton().click();
		for (int i = 0; i < 200; i++) {
			try {
				if (mtsCommonWebElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					mtsCommonWebElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisContinueButton());
		mtsCommonWebElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisLoginValidation());
		Assert.assertTrue(mtsCommonWebElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * mtsCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(mtsCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(mtsCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * mtsCommonWebElements.iisUserName());
		 * Assert.assertTrue(mtsCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntomtsApplication2(String userType) {
		iisLoginTestData = iisLoginExceldata.getTestdata(userType);
		mtsCommonWebElements = new MTSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisUserName());
		mtsCommonWebElements.iisUserName().click();
		mtsCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisPassword());
		mtsCommonWebElements.iisPassword().click();
		mtsCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisLoginButon());
		mtsCommonWebElements.iisLoginButon().click();
		for (int i = 0; i < 200; i++) {
			try {
				if (mtsCommonWebElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					mtsCommonWebElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisContinueButton());
		mtsCommonWebElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, mtsCommonWebElements.iisLoginValidation());
		Assert.assertTrue(mtsCommonWebElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * mtsCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(mtsCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(mtsCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * mtsCommonWebElements.iisUserName());
		 * Assert.assertTrue(mtsCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}

}
