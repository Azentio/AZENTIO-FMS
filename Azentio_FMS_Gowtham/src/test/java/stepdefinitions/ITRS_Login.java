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

public class ITRS_Login {
	public ITRS_Login(WebDriver driver) {
		this.driver=driver;
	}
	WebDriver driver;
	FMSCommonWebElements fmsCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData ITRS_LoginExceldata = new ExcelData(TestDataPath, "IRTS_Login", "UserType");
	Map<String, String> ITRS_LoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper;
	public void loginIntoITRSApplication(String userType) {
		ITRS_LoginTestData = ITRS_LoginExceldata.getTestdata(userType);
		fmsCommonWebElements = new FMSCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsUserName());
		fmsCommonWebElements.fmsUserName().click();
		fmsCommonWebElements.fmsUserName().sendKeys(ITRS_LoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsPassword());
		fmsCommonWebElements.fmsPassword().click();
		fmsCommonWebElements.fmsPassword().sendKeys(ITRS_LoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsLoginButon());
		fmsCommonWebElements.fmsLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyCode());
		fmsCommonWebElements.fmsCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			fmsCommonWebElements.fmsCompanyCode().sendKeys(Keys.DELETE);
		}
		fmsCommonWebElements.fmsCompanyCode().sendKeys(ITRS_LoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(fmsCommonWebElements.fmsCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(fmsCommonWebElements.fmsCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, fmsCommonWebElements.fmsBranchCode());
		fmsCommonWebElements.fmsBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			fmsCommonWebElements.fmsBranchCode().sendKeys(Keys.DELETE);
		}
		fmsCommonWebElements.fmsBranchCode().sendKeys(ITRS_LoginTestData.get("BranchCode"));
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
