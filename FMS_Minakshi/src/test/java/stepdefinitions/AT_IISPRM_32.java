
package stepdefinitions;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.AT_IISPRM_032_OBJ;
import pageobjects.CommonElements.FMSCommonWebElements;
import resources.BaseClass;

public class AT_IISPRM_32 extends BaseClass {
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	AT_IISPRM_032_OBJ atiisprm32obj = new AT_IISPRM_032_OBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();

	@And("^user check the deafult maturity account from facility$")
	public void user_check_the_deafult_maturity_account_from_facility() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm32obj.Maturityaccountfacitycheckbox());
		seleniumActions.getClickAndActionsHelper().moveToElement(atiisprm32obj.Maturityaccountfacitycheckbox());

		WebElement checkbox = atiisprm32obj.Maturityaccountfacitycheckbox();

		boolean ischeckboxselected = checkbox.isSelected();

		if (ischeckboxselected) {
			System.out.println("Maturity account facility checkbox is already checked Saving it now ");

			waitHelper.waitForElementwithFluentwait(driver, atiisprm32obj.iisProductClassMaintFormId_M003MT_Save_key());
			for (int i = 1; i <= 200; i++)

				try {
					//atiisprm32obj.iisProductClassMaintFormId_M003MT_Save_key().click();
					
					break;
					
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			
		}

		seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm32obj.Maturityaccountfacitycheckbox());
		System.out.println("clicked on save button");
        Thread.sleep(5000);
	}
	@And ("^user click on ok button$")
	public void user_click_on_ok_botton() {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm32obj.iisProductClassMaintFormId_M003MT_Save_key());
		atiisprm32obj.iisProductClassMaintFormId_M003MT_Save_key().click();
		waitHelper.waitForElementwithFluentwait(driver, atiisprm32obj.okbuttonaftersave());
		seleniumActions.getClickAndActionsHelper().moveToElement(atiisprm32obj.okbuttonaftersave());

	}
	@And ("^user click on confirm button$")
	public void user_click_on_confirm_botton() {
		
	}
	
}