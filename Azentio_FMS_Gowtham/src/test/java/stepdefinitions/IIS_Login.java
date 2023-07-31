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

public class IIS_Login {
	public IIS_Login(WebDriver driver) {
		this.driver=driver;
	}
	WebDriver driver;
	IISCommonWebElements iisCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData IIS_LoginExceldata = new ExcelData(TestDataPath, "IIS_Login", "UserType");
	Map<String, String> IIS_LoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper;
	public void loginIntoIISApplication(String userType) {
		IIS_LoginTestData = IIS_LoginExceldata.getTestdata(userType);
		iisCommonWebElements = new IISCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisUserName());
		iisCommonWebElements.iisUserName().click();
		iisCommonWebElements.iisUserName().sendKeys(IIS_LoginTestData.get("UserName"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisPassword());
		iisCommonWebElements.iisPassword().click();
		iisCommonWebElements.iisPassword().sendKeys(IIS_LoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisLoginButon());
		iisCommonWebElements.iisLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyCode());
		iisCommonWebElements.iisCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonWebElements.iisCompanyCode().sendKeys(Keys.DELETE);
		}
		iisCommonWebElements.iisCompanyCode().sendKeys(IIS_LoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(iisCommonWebElements.iisCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(iisCommonWebElements.iisCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, iisCommonWebElements.iisBranchCode());
		iisCommonWebElements.iisBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			iisCommonWebElements.iisBranchCode().sendKeys(Keys.DELETE);
		}
		iisCommonWebElements.iisBranchCode().sendKeys(IIS_LoginTestData.get("BranchCode"));
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
