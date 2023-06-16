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

public class IIS_Login {
	public IIS_Login(WebDriver driver) {
		this.driver=driver;
	}
	WebDriver driver;
	FMSCommonWebElements fmsCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData IIS_LoginExceldata = new ExcelData(TestDataPath, "IIS_Login", "UserType");
	Map<String, String> IIS_LoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper;
	public void loginIntoIISApplication(String userType) {
		IIS_LoginTestData = IIS_LoginExceldata.getTestdata(userType);
		fmsCommonWebElements = new FMSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsUserName());
		fmsCommonWebElements.fmsUserName().click();
		fmsCommonWebElements.fmsUserName().sendKeys(IIS_LoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsPassword());
		fmsCommonWebElements.fmsPassword().click();
		fmsCommonWebElements.fmsPassword().sendKeys(IIS_LoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginButon());
		fmsCommonWebElements.fmsLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyCode());
		fmsCommonWebElements.fmsCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			fmsCommonWebElements.fmsCompanyCode().sendKeys(Keys.DELETE);
		}
		fmsCommonWebElements.fmsCompanyCode().sendKeys(IIS_LoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsBranchCode());
		fmsCommonWebElements.fmsBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			fmsCommonWebElements.fmsBranchCode().sendKeys(Keys.DELETE);
		}
		fmsCommonWebElements.fmsBranchCode().sendKeys(IIS_LoginTestData.get("BranchCode"));
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

}
