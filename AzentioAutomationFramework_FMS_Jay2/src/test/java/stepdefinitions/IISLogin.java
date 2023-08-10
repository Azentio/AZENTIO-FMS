package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import pageobjects.CommonElements.IISCommonWebElements;

public class IISLogin {

	WebDriver driver;
	IISCommonWebElements iisCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData iisParamLoginTestData = new ExcelData(TestDataPath, "IIS_Params_Login", "UserType");
	ExcelData iisLoginExceldata = new ExcelData(TestDataPath, "IIS_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	Map<String, String> iisLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper;

	public IISLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void loginIntoiisParamApplication(String userType) {
		iisLoginTestData = iisParamLoginTestData.getTestdata(userType);
		iisCommonWebElements = new IISCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisUserName());
		iisCommonWebElements.iisUserName().click();
		iisCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisPassword());
		iisCommonWebElements.iisPassword().click();
		iisCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginButon());
		iisCommonWebElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyCode());
		iisCommonWebElements.iisCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonWebElements.iisCompanyCode().sendKeys(Keys.DELETE);
		}
		iisCommonWebElements.iisCompanyCode().sendKeys(iisLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(iisCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisBranchCode());
		iisCommonWebElements.iisBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonWebElements.iisBranchCode().sendKeys(Keys.DELETE);
		}
		iisCommonWebElements.iisBranchCode().sendKeys(iisLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyAndBranchLogin());
		iisCommonWebElements.iisCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = iisCommonWebElements.iisBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisContinueButton());
		iisCommonWebElements.iisContinueButton().click();
		for (int i = 0; i <200; i++) {
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
		 * iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.iisUserName());
		 * Assert.assertTrue(iisCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoiisParamApplication2(String userType) {
		iisLoginTestData = iisParamLoginTestData.getTestdata(userType);
		iisCommonWebElements = new IISCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisUserName());
		iisCommonWebElements.iisUserName().click();
		iisCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisPassword());
		iisCommonWebElements.iisPassword().click();
		iisCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginButon());
		iisCommonWebElements.iisLoginButon().click();
//		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisContinueButton());
//		iisCommonWebElements.iisContinueButton().click();
		for (int i = 0; i <200; i++) {
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
		 * iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.iisUserName());
		 * Assert.assertTrue(iisCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoiisApplication(String userType) {
		iisLoginTestData = iisLoginExceldata.getTestdata(userType);
		iisCommonWebElements = new IISCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisUserName());
		iisCommonWebElements.iisUserName().click();
		iisCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisPassword());
		iisCommonWebElements.iisPassword().click();
		iisCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginButon());
		iisCommonWebElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyCode());
		iisCommonWebElements.iisCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonWebElements.iisCompanyCode().sendKeys(Keys.DELETE);
		}
		iisCommonWebElements.iisCompanyCode().sendKeys(iisLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(iisCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisBranchCode());
		iisCommonWebElements.iisBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonWebElements.iisBranchCode().sendKeys(Keys.DELETE);
		}
		iisCommonWebElements.iisBranchCode().sendKeys(iisLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyAndBranchLogin());
		iisCommonWebElements.iisCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = iisCommonWebElements.iisBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisContinueButton());
		iisCommonWebElements.iisContinueButton().click();
		for (int i = 0; i <200; i++) {
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
		 * iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.iisUserName());
		 * Assert.assertTrue(iisCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	public void loginIntoiisApplication2(String userType) {
		iisLoginTestData = iisLoginExceldata.getTestdata(userType);
		iisCommonWebElements = new IISCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisUserName());
		iisCommonWebElements.iisUserName().click();
		iisCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisPassword());
		iisCommonWebElements.iisPassword().click();
		iisCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginButon());
		iisCommonWebElements.iisLoginButon().click();
		for (int i = 0; i <200; i++) {
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
		 * iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.iisUserName());
		 * Assert.assertTrue(iisCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntoSadsApplication(String userType) {
		iisLoginTestData = sadsLoginExceldata.getTestdata(userType);
		iisCommonWebElements = new IISCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisUserName());
		iisCommonWebElements.iisUserName().click();
		iisCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisPassword());
		iisCommonWebElements.iisPassword().click();
		iisCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginButon());
		iisCommonWebElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginValidation());
		Assert.assertTrue(iisCommonWebElements.iisLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.iisUserName());
		 * Assert.assertTrue(iisCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}
	
	//--------------------MTS application
	
	
	public void loginIntomtsApplication(String userType) {
		iisLoginTestData = iisLoginExceldata.getTestdata(userType);
		iisCommonWebElements = new IISCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisUserName());
		iisCommonWebElements.iisUserName().click();
		iisCommonWebElements.iisUserName().sendKeys(iisLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisPassword());
		iisCommonWebElements.iisPassword().click();
		iisCommonWebElements.iisPassword().sendKeys(iisLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginButon());
		iisCommonWebElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyCode());
		iisCommonWebElements.iisCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonWebElements.iisCompanyCode().sendKeys(Keys.DELETE);
		}
		iisCommonWebElements.iisCompanyCode().sendKeys(iisLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(iisCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisBranchCode());
		iisCommonWebElements.iisBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonWebElements.iisBranchCode().sendKeys(Keys.DELETE);
		}
		iisCommonWebElements.iisBranchCode().sendKeys(iisLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyAndBranchLogin());
		iisCommonWebElements.iisCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = iisCommonWebElements.iisBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisContinueButton());
		iisCommonWebElements.iisContinueButton().click();
		for (int i = 0; i <200; i++) {
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
		 * iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.moveToElement(iisCommonWebElements.iisLogoutButton());
		 * clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * iisCommonWebElements.iisUserName());
		 * Assert.assertTrue(iisCommonWebElements.iisUserName().isDisplayed());
		 * driver.quit();
		 */
	}
}
