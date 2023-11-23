package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.iisParam.AccrualProcessObj;
import pageobjects.iisParam.CommonElementsObj;
import resources.BaseClass;

public class Accrual_Process_StepDef {

	String DealNo = "";
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);

	CommonElementsObj commonElementsObj = new CommonElementsObj(driver);
	AccrualProcessObj accrualProcessObj = new AccrualProcessObj(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "Accrual Process", "DataSet ID");

	Map<String, String> testData;

	@And("^user get the test data for test case AT_AP_026$")
	public void user_get_the_test_data_for_test_case_AT_AP_026() {
		testData = excelData.getTestdata("AT_AP_026_D1");
	}

	@And("^User_05 Click on the Periodical Processing Module$")
	public void user_05_click_on_the_periodical_processing_module() {

		waitHelper.waitForElementwithFluentwait(driver, accrualProcessObj.iisPeriodicalProcessing());
		for (int i = 1; i < 100; i++) {

			try {
				accrualProcessObj.iisPeriodicalProcessing().click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_05 Click on the Reschedule Repayment Plan Installments Settled Not On the Due Date Under Periodical Processing Module$")
	public void user_05_click_on_the_reschedule_repayment_plan_installments_settled_not_on_the_due_date_under_periodical_processing_module() {
		waitHelper.waitForElementwithFluentwait(driver, accrualProcessObj.iisRescheduleRepaymentPlan_T10RA());
		for (int i = 1; i < 100; i++) {

			try {
				accrualProcessObj.iisRescheduleRepaymentPlan_T10RA().click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_05 Selects the Record$")
	public void user_05_selects_the_record() throws InterruptedException {
		Thread.sleep(2000);
		DealNo = testData.get("DealNo").trim();
		WebElement dealNo_xpath = driver
				.findElement(By.xpath("//tr//td//td[@title='" + DealNo + "'][@tdlabel='Deal No']"));

		waitHelper.waitForElementwithFluentwait(driver, dealNo_xpath);
		for (int i = 1; i < 100; i++) {

			try {
				dealNo_xpath.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_05 Click on the Process Button$")
	public void user_05_click_on_the_process_button() {
		waitHelper.waitForElementwithFluentwait(driver, accrualProcessObj.iisProcessBtn_T10RA());
		for (int i = 1; i < 100; i++) {

			try {
				accrualProcessObj.iisProcessBtn_T10RA().click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_05 Validate the Process will ran successfully$")
	public void user_05_validate_the_process_will_ran_successfully() {
		waitHelper.waitForElementwithFluentwait(driver, accrualProcessObj.iisSuccessFullPopUpMessage());
		String SuccessFull_Msg = accrualProcessObj.iisSuccessFullPopUpMessage().getText().trim();
		System.out.println(SuccessFull_Msg);
		Assert.assertTrue(SuccessFull_Msg.contains("Process Completed Successfully"));
	}

	// *********************************************************************************************************************

	@And("^user get the test data for test case AT_AP_027$")
	public void user_get_the_test_data_for_test_case_AT_AP_027() {
		testData = excelData.getTestdata("AT_AP_027_D1");
		System.out.println("Deal NO : " + DealNo);

	}

	@And("User_05 Click the Post Accruals under Periodical Processing menu")
	public void User_05_Click_the_Post_Accruals_under_Periodical_Processing_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_05());
		for (int i = 1; i < 100; i++) {

			try {
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_05().click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_05 Click the Final Accruals under Post Accruals in Periodical Processing")
	public void User_05_Click_the_Final_Accruals_under_Post_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_05());
		for (int i = 1; i < 100; i++) {

			try {
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_05().click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_05 Enable the Specific Deal Flag in Periodical Processing")
	public void User_05_Enable_the_Specific_Deal_Flag_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_05());
		try {
			if (accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_05()
					.isSelected()) {
				Assert.assertTrue(true);
			} else {
				selenium_Actions.getClickAndActionsHelper().clickOnElement(
						accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_05());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("User_05 Select the Deal number under Final Accruals in Periodical Processing")
	public void User_05_Select_the_Deal_number_under_Final_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_05());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_05());
		DealNo = testData.get("DealNo").trim();
		System.out.println(" DealNo : " + DealNo);
		waitHelper.waitForElementwithFluentwait(driver,
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_05());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_05());
		accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_05().sendKeys(DealNo,
				Keys.ENTER);

		// table[@id='gridtab_postChargeAccuralProcessSpecificDeal_T10EMF']/tbody/tr[2]//td[text()='5464']
		String xpath = "//table[@id='gridtab_postChargeAccuralProcessSpecificDeal_T10EMF']/tbody/tr[2]/td[text()='"
				+ DealNo + "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					selenium_Actions.getClickAndActionsHelper().doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_05 Select the From Date under Final Accruals in Periodical Processing")
	public void User_05_Select_the_From_Date_under_Final_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_05());
		selenium_Actions.getClickAndActionsHelper()
				.clickOnElement(accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_05());
		accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_05()
				.sendKeys(testData.get("From Date"), Keys.TAB);
	}

	@And("User_05 Select the To Date under Final Accruals in Periodical Processing")
	public void User_05_Select_the_To_Date_under_Final_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_05());
		selenium_Actions.getClickAndActionsHelper()
				.clickOnElement(accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_05());
		accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_05()
				.sendKeys(testData.get("To Date"), Keys.TAB);
	}

	@And("User_05 Click the Ok Button under Final Accruals in Periodical Processing")
	public void User_05_Click_the_Ok_Button_under_Final_Accruals_in_Periodical_Processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_05());
		selenium_Actions.getClickAndActionsHelper()
				.clickOnElement(accrualProcessObj.IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_05());

		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		commonElementsObj.iisOkButton().click();
	}
}