package stepdefinitions;

import java.util.Map;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.AT_IISPRM_111_OBJ;
import pageobjects.CommonElements.FMSCommonWebElements;

import resources.BaseClass;

public class Product_Class_111 extends BaseClass {
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	AT_IISPRM_111_OBJ atiisprm111obj = new AT_IISPRM_111_OBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Selenium_Actions selenium_actions = new Selenium_Actions(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();

	@Given("^user_111 navigate to the IISParam application and login with the valid credentials$")
	public void user_111_navigate_to_the_IISParam_application_and_login_with_the_valid_credentials() throws Throwable {
		driver.get(configFileReader.getIISParamApplicationUrl());
		iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
	}

	@And("user_111 click on parameters tab")
	public void user_111_click_on_parameters_tab() {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.iisParam_Parameters());
		atiisprm111obj.iisParam_Parameters().click();
	}

	@And("user_111 click on product class under parameter tab")
	public void user_111_click_on_product_class_under_parameter_tab() {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.iisParam_ProductClass());
		atiisprm111obj.iisParam_ProductClass().click();

	}

	@And("user_111 click on maintenance under product class tab")
	public void user_111_click_on_maintenance_under_product_class_tab() {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.iisParam_Maintenance());

		for (int i = 0; i <= 300; i++) {
			try {
				atiisprm111obj.iisParam_Maintenance().click();
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}

	}

	@And("user_111 click on search button under product class")
	public void user_111_click_on_search_button_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.iisParam_SearchBtn());
		atiisprm111obj.iisParam_SearchBtn().click();
	}

	@And("user_111 click on the first option under search button")
	public void user_111_click_on_the_first_option_under_search_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.productClassTexBox());
		selenium_actions.getClickAndActionsHelper().moveToElement(atiisprm111obj.productClassTexBox());
		selenium_actions.getClickAndActionsHelper().clickOnElement(atiisprm111obj.productClassTexBox());
		atiisprm111obj.productClassTexBox().sendKeys("0876");
		atiisprm111obj.productClassTexBox().sendKeys(Keys.ENTER);
		//waitHelper.waitForElementwithFluentwait(driver, atiisprm009obj.productClassTexBox());
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(atiisprm111obj.productClassTexBox().isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.productClass0876());
		selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm111obj.productClass0876());

	}

	@And("user_111 click on profit calculation under maintainance tab")
	public void user_111_click_on_profit_calculation_under_maintainance_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.iisparam_ProfitCalculation());

		for (int i = 0; i <= 300; i++) {
			try {
				atiisprm111obj.iisparam_ProfitCalculation().click();
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
		javascriptHelper.scrollIntoView(atiisprm111obj.iisparam_ProfitCalculation());
		Thread.sleep(3000);
	}

	
	@And("user_111 check flag under profit calculation tab")
	public void user_111_check_flag_under_profit_calculation_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				atiisprm111obj.MaintainDiminishingProfitDistuponRescheduling());
		Assert.assertTrue(atiisprm111obj.MaintainDiminishingProfitDistuponRescheduling().isDisplayed());
		Thread.sleep(2000);

		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.RetainTransferredProfitUponRescheduling());
		Assert.assertTrue(atiisprm111obj.RetainTransferredProfitUponRescheduling().isDisplayed());
		Thread.sleep(2000);
	}

	@And("^user_111 click on additional information$")
	public void user_111_click_on_additional_information() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				selenium_actions.getClickAndActionsHelper().clickOnElement(atiisprm111obj.AdditionalInformationtab());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
		Thread.sleep(3000);
	}

	@And("^user_111 click on repayement plan under the additional information$")
	public void user_111_click_on_repayement_plan_under_the_additional_information() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.RepayementPlan());
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_actions.getClickAndActionsHelper().clickOnElement(atiisprm111obj.RepayementPlan());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}

	}

	@And("^user_111 validates for the Accural Entry At Revaluation$")
	public void user_111_validates_for_the_Accural_Entry_At_Revaluation() throws Throwable {

		WebElement Text = waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.AccuralEntryAtRevaluation());
		boolean isActual_Text = Text.isDisplayed();
		String Actual_text = Text.getText().trim();
		System.out.println(isActual_Text);
		System.out.println(Actual_text);

		String Given_Text = "Accrual Entry at Revaluation/Rescheduling";

		if (Actual_text.equalsIgnoreCase(Given_Text)) {
			System.out.println("the value is changed to Accrual Entry at Revaluation/Rescheduling ");
		} else {
			System.out.println("the value is not changed to Accrual Entry at Revaluation/Rescheduling ");
		}
	}
	
	@And("^user_111 check the availble option of Accural Entry At Revaluation$")
	public void user_111_check_the_availble_option_of_Accural_Entry_At_Revaluation() throws Throwable {
	
	waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.Revaluation());
	atiisprm111obj.Revaluation().click();
	
	waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.Reversal());
	Assert.assertTrue(atiisprm111obj.Reversal().isDisplayed());
	waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.ReverseRebook());
	Assert.assertTrue(atiisprm111obj.ReverseRebook().isDisplayed());
	waitHelper.waitForElementwithFluentwait(driver, atiisprm111obj.Adjustment());
	Assert.assertTrue(atiisprm111obj.Adjustment().isDisplayed());
	}	

}
