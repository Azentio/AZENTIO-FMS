package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import pageobjects.CommonElements.IISCommonElements;

public class IISLogin {	
	WebDriver driver;
	
//	iisCommonWebElements iisCommonWebElements;
//	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
//	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
//	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
//	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
//	Map<String, String> iisLoginTestData = new HashMap<>();
//	WaitHelper waitHelper = new WaitHelper(driver);
//	ClicksAndActionsHelper clicksAndActionHelper;
	
	IISCommonElements iisCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData iisParamLoginTestData = new ExcelData(TestDataPath, "IISParam_Login", "UserType");
	ExcelData iisLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	Map<String, String> iisLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper;
	
	public IISLogin(WebDriver driver) {
		this.driver = driver;
	}

	
	public void loginIntoIISParamApplication(String userType) {
		iisLoginTestData = iisParamLoginTestData.getTestdata(userType);
		iisCommonWebElements = new IISCommonElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisUserName());
		iisCommonWebElements.iisUserName().click();
		iisCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisPassword());
		iisCommonWebElements.iisPassword().click();
		iisCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginButon());
		iisCommonWebElements.iisLoginButon().click();
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.fmsContinueButton());
//		iisCommonWebElements.fmsContinueButton().click();
		for (int i = 0; i <500; i++) {
			try {
				if (iisCommonWebElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					iisCommonWebElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisContinueButton());
		iisCommonWebElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginValidation());
		Assert.assertTrue(iisCommonWebElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.fmsLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.iisUserName());
		 * Assert.assertTrue(iisCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	
}
