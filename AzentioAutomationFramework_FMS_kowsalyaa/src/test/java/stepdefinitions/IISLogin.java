package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import pageobjects.CommonElements.IISCommonElements;


public class IISLogin {	
	WebDriver driver;
	IISCommonElements iisCommonElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData iisParamLoginTestData = new ExcelData(TestDataPath, "IISParam_Login", "UserType");
	ExcelData iisLoginExceldata = new ExcelData(TestDataPath, "IIS_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	Map<String, String> iisLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper;

	public IISLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void loginIntoiisParamApplication2(String userType) {
		iisLoginTestData = iisParamLoginTestData.getTestdata(userType);
		iisCommonElements = new IISCommonElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisUserName());
		iisCommonElements.iisUserName().click();
		iisCommonElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisPassword());
		iisCommonElements.iisPassword().click();
		iisCommonElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginButon());
		iisCommonElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisCompanyCode());
		iisCommonElements.iisCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonElements.iisCompanyCode().sendKeys(Keys.DELETE);
		}
		iisCommonElements.iisCompanyCode().sendKeys(iisLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(iisCommonElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(iisCommonElements.iisCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisBranchCode());
		iisCommonElements.iisBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonElements.iisBranchCode().sendKeys(Keys.DELETE);
		}
		iisCommonElements.iisBranchCode().sendKeys(iisLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisCompanyAndBranchLogin());
		iisCommonElements.iisCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = iisCommonElements.iisBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
		iisCommonElements.iisContinueButton().click();
		for (int i = 0; i <200; i++) {
			try {
				if (iisCommonElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					iisCommonElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
		iisCommonElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginValidation());
		Assert.assertTrue(iisCommonElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisUserName());
		 * Assert.assertTrue(iisCommonElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoiisParamApplication(String userType) {
		iisLoginTestData = iisParamLoginTestData.getTestdata(userType);
		iisCommonElements = new IISCommonElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisUserName());
		iisCommonElements.iisUserName().click();
		iisCommonElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisPassword());
		iisCommonElements.iisPassword().click();
		iisCommonElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginButon());
		iisCommonElements.iisLoginButon().click();
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
//		iisCommonElements.iisContinueButton().click();
		for (int i = 0; i <200; i++) {
			try {
				if (iisCommonElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					iisCommonElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
		iisCommonElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginValidation());
		Assert.assertTrue(iisCommonElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisUserName());
		 * Assert.assertTrue(iisCommonElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoiisApplication(String userType) {
		iisLoginTestData = iisLoginExceldata.getTestdata(userType);
		iisCommonElements = new IISCommonElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisUserName());
		iisCommonElements.iisUserName().click();
		iisCommonElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisPassword());
		iisCommonElements.iisPassword().click();
		iisCommonElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginButon());
		iisCommonElements.iisLoginButon().click();
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisCompanyCode());
//		iisCommonElements.iisCompanyCode().click();
//		for (int i = 0; i <= 10; i++) {
//			iisCommonElements.iisCompanyCode().sendKeys(Keys.DELETE);
//		}
//		iisCommonElements.iisCompanyCode().sendKeys(iisLoginTestData.get("CompanyCode"));
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisCompanyAndBranchLogin());
//		clicksAndActionHelper.moveToElement(iisCommonElements.iisCompanyAndBranchLogin());
//		clicksAndActionHelper.clickOnElement(iisCommonElements.iisCompanyAndBranchLogin());
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisBranchCode());
//		iisCommonElements.iisBranchCode().click();
//		for (int i = 0; i <= 10; i++) {
//			iisCommonElements.iisBranchCode().sendKeys(Keys.DELETE);
//		}
//		iisCommonElements.iisBranchCode().sendKeys(iisLoginTestData.get("BranchCode"));
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisCompanyAndBranchLogin());
//		iisCommonElements.iisCompanyAndBranchLogin().click();
//		for (int i = 0; i <= 50; i++) {
//
//			String headOffice = iisCommonElements.iisBranchCodeValidation().getAttribute("prevvalue");
//
//			if (!(headOffice.isBlank())) {
//				break;
//			}
//
//		}

//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
//		iisCommonElements.iisContinueButton().click();
		for (int i = 0; i <200; i++) {
			try {
				if (iisCommonElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					iisCommonElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
		iisCommonElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginValidation());
		Assert.assertTrue(iisCommonElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisUserName());
		 * Assert.assertTrue(iisCommonElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoiisApplication2(String userType) {
		iisLoginTestData = iisLoginExceldata.getTestdata(userType);
		iisCommonElements = new IISCommonElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisUserName());
		iisCommonElements.iisUserName().click();
		iisCommonElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisPassword());
		iisCommonElements.iisPassword().click();
		iisCommonElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginButon());
		iisCommonElements.iisLoginButon().click();
		for (int i = 0; i <200; i++) {
			try {
				if (iisCommonElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
					iisCommonElements.iis_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
		iisCommonElements.iisContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginValidation());
		Assert.assertTrue(iisCommonElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisUserName());
		 * Assert.assertTrue(iisCommonElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntoSadsApplication(String userType) {
		iisLoginTestData = sadsLoginExceldata.getTestdata(userType);
		iisCommonElements = new IISCommonElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisUserName());
		iisCommonElements.iisUserName().click();
		iisCommonElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisPassword());
		iisCommonElements.iisPassword().click();
		iisCommonElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginButon());
		iisCommonElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginValidation());
		Assert.assertTrue(iisCommonElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonElements.iisUserName());
		 * Assert.assertTrue(iisCommonElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	
	//	WebDriver driver;
//	
////	iisCommonElements iisCommonElements;
////	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\iisTestData.xlsx";
////	ExcelData iisParamLoginTestData = new ExcelData(TestDataPath, "iisParam_login", "UserType");
////	ExcelData iisLoginExceldata = new ExcelData(TestDataPath, "iis_Login", "UserType");
////	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
////	Map<String, String> iisLoginTestData = new HashMap<>();
////	WaitHelper waitHelper = new WaitHelper(driver);
////	ClicksAndActionsHelper clicksAndActionHelper;
//	
//	IISCommonElements iisCommonElements;
//	String TestDataPath = System.getProperty("user.dir") + "TestData\\IISTestData.xlsx";
//	ExcelData iisParamLoginTestData = new ExcelData(TestDataPath, "IISParam_Login", "UserType");
//	ExcelData iisLoginExceldata = new ExcelData(TestDataPath, "IIS_Login", "UserType");
//	Map<String, String> iisLoginTestData = new HashMap<>();
//	WaitHelper waitHelper = new WaitHelper(driver);
//	ClicksAndActionsHelper clicksAndActionHelper;
//	
//	public IISLogin(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	public void loginIntoIISApplication(String userType) {
//		iisLoginTestData = iisLoginExceldata.getTestdata(userType);
//		iisCommonElements = new IISCommonElements(driver);
//		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisUserName());
//		iisCommonElements.iisUserName().click();
//		iisCommonElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisPassword());
//		iisCommonElements.iisPassword().click();
//		iisCommonElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginButon());
//		iisCommonElements.iisLoginButon().click();
//
//		for (int i = 0; i <500; i++) {
//			try {
//				if (iisCommonElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
//					iisCommonElements.iis_UserAlreadyLoginYes().click();
//					break;
//				}
//			} catch (Exception e) {
//				
//			}
//		}
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
//		iisCommonElements.iisContinueButton().click();
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginValidation());
//		Assert.assertTrue(iisCommonElements.iisLoginValidation().isDisplayed());
//		/*
//		 * waitHelper.waitForElementwithFluentwait(driver,
//		 * iisCommonElements.iisLogoutButton());
//		 * clicksAndActionHelper.moveToElement(iisCommonElements.iisLogoutButton());
//		 * clicksAndActionHelper.clickOnElement(iisCommonElements.iisLogoutButton());
//		 * waitHelper.waitForElementwithFluentwait(driver,
//		 * iisCommonElements.iisUserName());
//		 * Assert.assertTrue(iisCommonElements.iisUserName().isDisplayed());
//		 * driver.quit();
//		 */
//	}
//	
//	public void loginIntoIISParamApplication(String userType) {
//		iisLoginTestData = iisParamLoginTestData.getTestdata(userType);
//		iisCommonElements = new IISCommonElements(driver);
//		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisUserName());
//		iisCommonElements.iisUserName().click();
//		iisCommonElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisPassword());
//		iisCommonElements.iisPassword().click();
//		iisCommonElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginButon());
//		iisCommonElements.iisLoginButon().click();
//		for (int i = 0; i <500; i++) {
//			try {
//				if (iisCommonElements.iis_UserAlreadyLoginPopUp().isDisplayed()) {
//					iisCommonElements.iis_UserAlreadyLoginYes().click();
//					break;
//				}
//			} catch (Exception e) {
//				
//			}
//		}
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisContinueButton());
//		iisCommonElements.iisContinueButton().click();
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisLoginValidation());
//		Assert.assertTrue(iisCommonElements.iisLoginValidation().isDisplayed());
//		/*
//		 * waitHelper.waitForElementwithFluentwait(driver,
//		 * iisCommonElements.iisLogoutButton());
//		 * clicksAndActionHelper.moveToElement(iisCommonElements.iisLogoutButton());
//		 * clicksAndActionHelper.clickOnElement(iisCommonElements.iisLogoutButton());
//		 * waitHelper.waitForElementwithFluentwait(driver,
//		 * iisCommonElements.iisUserName());
//		 * Assert.assertTrue(iisCommonElements.iisUserName().isDisplayed());
//		 * driver.quit();
//		 */
//	}
//	
//	

	
}
