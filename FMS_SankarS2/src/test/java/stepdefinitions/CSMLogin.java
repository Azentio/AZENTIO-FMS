package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import pageobjects.CommonElements.CSMCommonWebElements;

public class CSMLogin {
	WebDriver driver;

	CSMCommonWebElements csmCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData csmParamLoginTestData = new ExcelData(TestDataPath, "CSMParam_login", "UserType");
	ExcelData csmLoginExceldata = new ExcelData(TestDataPath, "CSM_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	Map<String, String> csmLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);

	ClicksAndActionsHelper clicksAndActionHelper;

	public CSMLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void loginIntoCSMParamApplication(String userType) {
		csmLoginTestData = csmParamLoginTestData.getTestdata(userType);
		csmCommonWebElements = new CSMCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		csmCommonWebElements.csmUserName().click();
		csmCommonWebElements.csmUserName().sendKeys(csmLoginTestData.get("userName"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmPassword());
		csmCommonWebElements.csmPassword().click();
		csmCommonWebElements.csmPassword().sendKeys(csmLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginButon());
		csmCommonWebElements.csmLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyCode());
		csmCommonWebElements.csmCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmCompanyCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmCompanyCode().sendKeys(csmLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmBranchCode());
		csmCommonWebElements.csmBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmBranchCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmBranchCode().sendKeys(csmLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		csmCommonWebElements.csmCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = csmCommonWebElements.csmBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginValidation());
		Assert.assertTrue(csmCommonWebElements.csmLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.moveToElement(csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmUserName());
		 * Assert.assertTrue(csmCommonWebElements.csmUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntoCSMApplication(String userType) {
		System.out.println(userType);
		csmLoginTestData = csmLoginExceldata.getTestdata(userType);
		csmCommonWebElements = new CSMCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		csmCommonWebElements.csmUserName().click();
		csmCommonWebElements.csmUserName().sendKeys(csmLoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmPassword());
		csmCommonWebElements.csmPassword().click();
		csmCommonWebElements.csmPassword().sendKeys(csmLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginButon());
		csmCommonWebElements.csmLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyCode());
		csmCommonWebElements.csmCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmCompanyCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmCompanyCode().sendKeys(csmLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmBranchCode());
		csmCommonWebElements.csmBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmBranchCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmBranchCode().sendKeys(csmLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		csmCommonWebElements.csmCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = csmCommonWebElements.csmBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}
		
		
		waitHelper.waitForElementwithFluentwait(driver,csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		for (int i = 0; i <200; i++) {
			try {
				if (csmCommonWebElements.csm_UserAlreadyLoginPopUp().isDisplayed()) {
					csmCommonWebElements.csm_UserAlreadyLoginYes().click();
					break;
				}
			} catch (Exception e) {
				
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginValidation());
		Assert.assertTrue(csmCommonWebElements.csmLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.moveToElement(csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmUserName());
		 * Assert.assertTrue(csmCommonWebElements.csmUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntoSadsApplication(String userType) {
		csmLoginTestData = sadsLoginExceldata.getTestdata(userType);
		csmCommonWebElements = new CSMCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		csmCommonWebElements.csmUserName().click();
		csmCommonWebElements.csmUserName().sendKeys(csmLoginTestData.get("userName"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmPassword());
		csmCommonWebElements.csmPassword().click();
		csmCommonWebElements.csmPassword().sendKeys(csmLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginButon());
		csmCommonWebElements.csmLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginValidation());
		Assert.assertTrue(csmCommonWebElements.csmLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.moveToElement(csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmUserName());
		 * Assert.assertTrue(csmCommonWebElements.csmUserName().isDisplayed());
		 * driver.quit();
		 */
	}

}
