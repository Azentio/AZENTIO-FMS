package stepdefinitions;

import java.time.Duration;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.google.inject.Key;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.AlertHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.VerificationHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.IISCommonElements;
import pageobjects.iisParam.ProductClassObj;
import resources.BaseClass;

public class IISProductClassStepDef {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	AlertHelper alertHelper = new AlertHelper(driver);

	IISCommonElements iisCommonElements =  new IISCommonElements(driver);
	ProductClassObj productClassObj = new ProductClassObj(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "ProductClassTestData", "DataSet ID");

	Map<String, String> testData;

	// @AT_IISPRM_003

	@And("^user get the test data for test case AT_IISPRM_003$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_003() {
		testData = excelData.getTestdata("AT_IISPRM_003_D1");
	}

	@Then("user click on the parameter tab under menu")
	public void user_click_on_the_parameter_tab_under_menu() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisParametertab());
		productClassObj.iisParametertab().click();
	}

	@Then("user click on the product class module under parameter tab")
	public void user_click_on_the_product_class_module_under_parameter_tab() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassModule());
		productClassObj.iisProductClassModule().click();
	}

	@Then("user click on the maintenance under product class module")
	public void user_click_on_the_maintenance_under_product_class_module() {
		//waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassMaintenance());
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisMaintenanceButton());
		productClassObj.iisProductClassMaintenance().click();
	}

	@Then("user click on the additonal information tab")
	public void user_click_on_the_additonal_information_tab() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassAdditionalInformation_M003MT());
		productClassObj.iisProductClassAdditionalInformation_M003MT().click();
	}

	@Then("user click on the repayment plan under additional tab")
	public void user_click_on_the_repayment_plan_under_additional_tab() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisProductClassAdditionalInformationRepaymentPlan_M003MT());
		productClassObj.iisProductClassAdditionalInformationRepaymentPlan_M003MT().click();
	}

	@Then("user click on the max grace input field")
	public void user_click_on_the_max_grace_input_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR());
		productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR().click();
	}

	@Then("user enter the max grace")
	public void user_enter_the_max_grace() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR());
		productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR().sendKeys(testData.get("Max Grade Nbr"));
	}

	@Then("user click on the max grace value drop down")
	public void user_click_on_the_max_grace_value_drop_down() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE());
		productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE().click();
	}

	@Then("user select the max grace value from drop down")
	public void user_select_the_max_grace_value_from_drop_down() {
		// waitHelper.waitForElementwithFluentwait(driver,
		// productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE());
		// productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE().sendKeys(testData.get("Max
		// Grade Value"));

		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE());
		dropDownHelper.SelectUsingVisibleText(productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE(),
				testData.get("Max Grade Value"));
	}

	// @AT_IISPRM_022_________________________________________________________________________________________________________________________________________________

	@And("^user get the test data for test case AT_IISPRM_022$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_022() {
		testData = excelData.getTestdata("AT_IISPRM_022_D1");
	}

	@And("^user get the test data for test case AT_IISPRM_023$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_023() {
		testData = excelData.getTestdata("AT_IISPRM_023_D1");
	}

	@Then("user click on the general information tab")
	public void user_click_on_the_general_information_tab() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductGeneralInformation());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductGeneralInformation().click();
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementwithFluentwait(driver, productClassObj.WarningPopUp());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.WarningPopUp().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^user click on the search button$")
	public void user_click_on_the_search_button() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassinfoBarSearchButton_M003MT());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassinfoBarSearchButton_M003MT().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^user click on the class field$")
	public void user_click_on_the_class_field() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassField());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassField().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@Then("^user enter the product class code$")
	public void user_enter_the_product_class_code() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassField());
		System.out.println(testData.get("Product Class Code"));
		productClassObj.iisProductClassField().sendKeys(testData.get("Product Class Code"));
		productClassObj.iisProductClassField().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("^user double click on the retirved record$")
	public void user_double_click_on_the_retirved_record() throws InterruptedException {
		javaScriptHelper.scrollUpVertically();
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductRetrivedRecord());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(productClassObj.iisProductRetrivedRecord());
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^user double click on the retirved records$")
	public void user_double_click_on_the_retirved_records() throws InterruptedException {
		javaScriptHelper.scrollUpVertically();
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductRetrivedRecord());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(productClassObj.iisProductRetrivedRecord());
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^user click on the profit calculation$")
	public void user_click_on_the_profit_calculation() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.profitcalculation());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.profitcalculation().click();
				break;
			} catch (Exception e) {

			}
		}
		Thread.sleep(2000);
	}

	@Then("^user check the Recognize Profit Up Front flag")
	public void user_check_the_Recognize_Profit_Up_Front_flag() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.RecognizeProfitUpFrontFlag());

		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.RecognizeProfitUpFrontFlag().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(5000);
	}

	@Then("^user click on the additonal information two tab$")
	public void user_click_on_the_additonal_information_two_tab() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductAdditionalInformationTwo());
		for (int i = 0; i <= 300; i++) {
			try {

				productClassObj.iisProductAdditionalInformationTwo().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@Then("^user check Disable Accrue Till Maturity On Early Settlement flag$")
	public void user_check_Disable_Accrue_Till_Maturity_On_Early_Settlement_flag() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisProductClassDisableReimburseEntryYNFeild_M003MT());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassDisableReimburseEntryYNFeild_M003MT().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^user click on the save button$")
	public void user_click_on_the_save_button() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassMaintFormId_M003MT_Save_key());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassMaintFormId_M003MT_Save_key().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@Then("^user click on the confirmation save button$")
	public void user_click_on_the_confirmation_save_button() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisProductClassMaintFormPopupUpdateconfirmSaveBtn());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassMaintFormPopupUpdateconfirmSaveBtn().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@Then("^user click on the update confirm button$")
	public void user_click_on_the_update_confirm_button() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassMaintFormPopupconfirmSaveBtn());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassMaintFormPopupconfirmSaveBtn().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@Then("^user click on the save button for the profit calculation$")
	public void user_click_on_the_save_button_for_the_profit_calculation() {
//		javaScriptHelper.scrollToElemet(productClassObj.iisProductClassMaintFormPopupconfirmSaveBtn());

		// waitHelper.waitForElementwithFluentwait(driver,
		// productClassObj.iisProductClassMaintFormPopupconfirmSaveBtn());
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_Actions.getJavascriptHelper()
						.scrollIntoView(productClassObj.iisProductClassMaintFormId_M003MT_Save_key());
				productClassObj.iisProductClassMaintFormId_M003MT_Save_key().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user validate for Disable Accrue Till Maturity On Early Settlement is avalible$")
	public void user_validate_for_Disable_Accrue_Till_Maturity_On_Early_Settlement_is_avalible() {
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_Actions.getJavascriptHelper()
						.scrollIntoView(productClassObj.iisProductClassDisableReimburseEntryYNFeild_M003MT());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement CheckBox = productClassObj.iisProductClassDisableReimburseEntryYNFeild_M003MT();

		boolean isCheckBoxVisible = CheckBox.isDisplayed();

		if (isCheckBoxVisible) {
			System.out.println("Disable Accrue Till Maturity On Early Settlement is avalible");
		} else {
			System.out.println("Disable Accrue Till Maturity On Early Settlement is not avalible");
		}

	}

	@Then("^user click ok on the confirm save process alert popup$")
	public void user_click_ok_on_the_confirm_save_process_alert_popup() {

		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassMaintFormPopupconfirmSaveBtn().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());

				}
			}

		}

	}

	@Then("^user click ok on the update successfully alert popup$")
	public void user_click_ok_on_the_update_successfully_alert_popup() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisProductClassMaintFormPopupUpdateconfirmSaveBtn());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassMaintFormPopupUpdateconfirmSaveBtn().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^user validate for disable accrue till maturity on early settlement is not avalible$")
	public void user_validate_for_disable_accrue_till_maturity_on_early_settlement_is_not_avalible() {
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_Actions.getJavascriptHelper()
						.scrollIntoView(productClassObj.iisProductClassDisableReimburseEntryYNFeild_M003MT());
				String AttributeValue = productClassObj.iisProductClassDisableReimburseEntryYN_M003MT()
						.getAttribute("style");
				System.out.println("AttributeValue" + ":" + AttributeValue);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement CheckBox = productClassObj.iisProductClassDisableReimburseEntryYN_M003MT();

		boolean isCheckBoxVisible = CheckBox.isDisplayed();

		if (isCheckBoxVisible) {
			System.out.println("Disable Accrue Till Maturity On Early Settlement is avalible");
		} else {
			System.out.println("Disable Accrue Till Maturity On Early Settlement is not avalible");
		}
	}

// @AT_IISPRM_024_________________________________________________________________________________________________________________________________________________

	@Then("^user validate the disable accrue till maturity on early settlement is unchecked$")
	public void user_validate_the_disable_accrue_till_maturity_on_early_settlement_is_unchecked() {
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_Actions.getJavascriptHelper()
						.scrollIntoView(productClassObj.iisProductClassDisableReimburseEntryYNFeild_M003MT());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement CheckBox = productClassObj.iisProductClassDisableReimburseEntryYNFeild_M003MT();

		boolean isCheckBoxBehaviour = CheckBox.isSelected();

		if (isCheckBoxBehaviour) {
			System.out.println("Disable Accrue Till Maturity On Early Settlement is checked");
		} else {
			System.out.println("Disable Accrue Till Maturity On Early Settlement is not checked");
		}
	}

//	@AT_IISPRM_031____________________________________________________________________________________________________________________

	@And("^user get the test data for test case AT_IISPRM_031$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_031() {
		testData = excelData.getTestdata("AT_IISPRM_031_D1");
	}

	/*
	 * @Then("user navigate to early settlement feild") public void
	 * user_navigate_to_early_settlement_feild() { for (int i = 0; i <= 300; i++) {
	 * try { selenium_Actions.getJavascriptHelper()
	 * .scrollIntoView(productClassObj.iisProductClassMaintEarlySettlementFeild());
	 * break; } catch (Exception e) { if (i == 300) { Assert.fail(e.getMessage()); }
	 * } }
	 * 
	 * }
	 * 
	 * @Then("^User select libor lip rate from the dropdown$") public void
	 * User_select_libor_lip_rate_from_the_dropdown() {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT()); for (int
	 * i = 0; i <= 300; i++) { try {
	 * 
	 * dropDownHelper.SelectUsingVisibleText(
	 * productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT(),
	 * testData.get("LipCalDropDownFirstValue"));
	 * System.out.println(testData.get("LipCalDropDownFirstValue")); //
	 * productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT().click();
	 * break; } catch (Exception e) { if (i == 300) { Assert.fail(e.getMessage()); }
	 * } } }
	 * 
	 * @Then("User click on the pertcentage od deal tenure input feild") public void
	 * user_click_on_the_pertcentage_od_deal_tenure_input_feild() {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT()); for (int i =
	 * 0; i <= 300; i++) { try {
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().click();
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * CONTROL + "A", Keys.DELETE);
	 * 
	 * } catch (Exception e) { if (i == 300) { Assert.fail(e.getMessage()); } } } }
	 * 
	 * @Then("^User enter the value more than 100%$") public void
	 * User_enter_the_value_more_than_100() throws InterruptedException {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT()); // for (int i
	 * = 0; i <= 300; i++) { // try { //
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().click(); //
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * CONTROL + "A", Keys.DELETE); //
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(
	 * testData.get("First_Value")); // System.out.println("First Value : " +
	 * testData.get("First_Value")); // break; // } catch (Exception e) { // if (i
	 * == 300) { // Assert.fail(e.getMessage()); // } // } // }
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().click();
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * CONTROL + "A", Keys.DELETE);
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(
	 * testData.get("First_Value")); System.out.println("First Value : " +
	 * testData.get("First_Value"));
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * TAB); Thread.sleep(2000);
	 * 
	 * }
	 * 
	 * @And("^System should validate and should not allow to proceed$") public void
	 * System_should_validate_and_should_not_allow_to_proceed() {
	 * 
	 * for (int i = 0; i <= 300; i++) { try { WebElement Error_alert_PopUp =
	 * productClassObj.iisProductClassLockPeriodPercentageErrorPopUp_M003MT();
	 * boolean isError_alert_PopUpVisible = Error_alert_PopUp.isDisplayed(); if
	 * (isError_alert_PopUpVisible) {
	 * System.out.println("System doesn't allow user to proceed");
	 * productClassObj.iisProductClassLockPeriodPercentagePopUpBtn_M003MT().click();
	 * break;
	 * 
	 * } else { System.out.println("System allow user to proceed");
	 * 
	 * }
	 * 
	 * break; } catch (Exception e) { // if (i == 300) { //
	 * Assert.fail(e.getMessage()); // } continue; } }
	 * 
	 * 
	 * }
	 * 
	 * @And("^System should validate and should allow to proceed$") public void
	 * System_should_validate_and_should_allow_to_proceed() {
	 * 
	 * for (int i = 0; i <= 300; i++) { try { WebElement Error_alert_PopUp =
	 * productClassObj.iisProductClassLockPeriodPercentageErrorPopUp_M003MT();
	 * boolean isError_alert_PopUpVisible = Error_alert_PopUp.isDisplayed(); if
	 * (isError_alert_PopUpVisible) {
	 * System.out.println("System doesn't user allow to proceed");
	 * productClassObj.iisProductClassLockPeriodPercentagePopUpBtn_M003MT().click();
	 * break;
	 * 
	 * } else { System.out.println("System allow user to proceed");
	 * 
	 * }
	 * 
	 * //break; } catch (Exception e) { // if (i == 300) { //
	 * Assert.fail(e.getMessage()); // } continue; } }
	 * 
	 * 
	 * }
	 * 
	 * @Then("^User enter the decimal value less than 100%$") public void
	 * User_enter_the_decimal_value_less_than_100() {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT()); // for (int i
	 * = 0; i <= 300; i++) { // try { // //
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * CONTROL + "A", Keys.DELETE); //
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(
	 * testData.get("Second_Value")); // System.out.println("Second_Value : " +
	 * testData.get("Second_Value")); // // break; // } catch (Exception e) { // if
	 * (i == 300) { // Assert.fail(e.getMessage()); // } // } // }
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * CONTROL + "A", Keys.DELETE);
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(
	 * testData.get("Second_Value")); System.out.println("Second_Value : " +
	 * testData.get("Second_Value"));
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * TAB);
	 * 
	 * }
	 * 
	 * @Then("^User enter an invalid value$") public void
	 * User_enter_an_invalid_value() { // for (int i = 0; i <= 300; i++) { // try {
	 * // productClassObj.iisProductClassLockPeriodPercentage_M003MT().click(); //
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * CONTROL+"A", Keys.DELETE); //
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(
	 * testData.get("Third_value")); // System.out.println("Third_value : " +
	 * testData.get("Third_value")); // break; // } catch (Exception e) { // if (i
	 * == 300) { // Assert.fail(e.getMessage()); // } // } // }
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().click();
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * CONTROL+"A", Keys.DELETE);
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(
	 * testData.get("Third_value")); System.out.println("Third_value : " +
	 * testData.get("Third_value"));
	 * productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.
	 * TAB);
	 * 
	 * }
	 * 
	 * @Then("^User click on the drop of lip calculator type dropdown$") public void
	 * User_click_on_the_drop_of_lip_calculator_type_dropdown() {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT()); for (int
	 * i = 0; i <= 300; i++) { try {
	 * productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT().click();
	 * break; } catch (Exception e) { if (i == 300) { Assert.fail(e.getMessage()); }
	 * } } }
	 * 
	 * @Then("^User select outstanding principle from the dropdown$") public void
	 * User_select_outstanding_principle_from_the_dropdown() {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT()); for (int
	 * i = 0; i <= 300; i++) { try {
	 * 
	 * // waitHelper.waitForElementwithFluentwait(driver, //
	 * productClassObj.iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE());
	 * dropDownHelper.SelectUsingVisibleText(
	 * productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT(),
	 * testData.get("TextLipCalDropDownSecondValue"));
	 * System.out.println("value 2 :" +
	 * testData.get("TextLipCalDropDownSecondValue")); //
	 * productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT().click();
	 * break; } catch (Exception e) { if (i == 300) { Assert.fail(e.getMessage()); }
	 * } }
	 * 
	 * }
	 */

	// --------------------------------------------------------------------------------------------------------------------------------------------------

	@Then("user navigate to early settlement feild")
	public void user_navigate_to_early_settlement_feild() {
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_Actions.getJavascriptHelper()
						.scrollIntoView(productClassObj.iisProductClassMaintEarlySettlementFeild());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^User select libor lip rate from the dropdown$")
	public void User_select_libor_lip_rate_from_the_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(
						productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT(),
						testData.get("LipCalDropDownFirstValue"));
				System.out.println(testData.get("LipCalDropDownFirstValue"));
				// productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User click on the pertcentage od deal tenure input feild")
	public void user_click_on_the_pertcentage_od_deal_tenure_input_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassLockPeriodPercentage_M003MT());
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().click();
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.CONTROL + "A", Keys.DELETE);

	}

	@Then("^User click on the drop of lip calculator type dropdown$")
	public void User_click_on_the_drop_of_lip_calculator_type_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT());
		for (int i = 0; i <= 300; i++) {
			try {
				productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^User select outstanding principle from the dropdown$")
	public void User_select_outstanding_principle_from_the_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver,
				productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(
						productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT(),
						testData.get("TextLipCalDropDownSecondValue"));
				System.out.println("value 2 :" + testData.get("TextLipCalDropDownSecondValue"));
				// productClassObj.iisProductClassLIPCalculationTypeDropDown_M003MT().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^User enter the value more than 100%$")
	public void User_enter_the_value_more_than_100() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassLockPeriodPercentage_M003MT());
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.CONTROL, Keys.DELETE);
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(testData.get("First_Value"));
		Thread.sleep(3000);
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.TAB);
	}

	@Then("^User enter the decimal value less than 100%$")
	public void User_enter_the_decimal_value_less_than_100() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassLockPeriodPercentage_M003MT());
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.CONTROL, Keys.DELETE);
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(testData.get("Second_Value"));
		Thread.sleep(3000);
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.TAB);

	}

	@Then("^User enter an invalid value$")
	public void User_enter_an_invalid_value() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productClassObj.iisProductClassLockPeriodPercentage_M003MT());
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.CONTROL, Keys.DELETE);
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(testData.get("Third_value"));
		Thread.sleep(3000);
		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.TAB);
	}

	@And("^System should validate and should not allow to proceed$")
	public void System_should_validate_and_should_not_allow_to_proceed() {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement Error_alert_PopUp = productClassObj.iisProductClassLockPeriodPercentageErrorPopUp_M003MT();
				boolean isError_alert_PopUpVisible = Error_alert_PopUp.isDisplayed();
				if (isError_alert_PopUpVisible) {
					System.out.println("System doesn't allow user to proceed");
					productClassObj.iisProductClassLockPeriodPercentagePopUpBtn_M003MT().click();
					break;

				}

				break;
			} catch (Exception e) {
				System.out.println("System allow user to proceed");
			}
		}

		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.CONTROL, Keys.DELETE);
	}

	@And("^System should validate and should allow to proceed$")
	public void System_should_validate_and_should_allow_to_proceed() {

		for (int i = 0; i <= 300; i++)
			try {
				WebElement Error_alert_PopUp = productClassObj.iisProductClassLockPeriodPercentageErrorPopUp_M003MT();
				boolean isError_alert_PopUpVisible = Error_alert_PopUp.isDisplayed();
				if (isError_alert_PopUpVisible) {

					waitHelper.waitForElementToVisibleWithFluentWait(driver, Error_alert_PopUp, 10000, 2000);
					productClassObj.iisProductClassLockPeriodPercentagePopUpBtn_M003MT().click();

					System.out.println("System not allow user to proceed");

					break;
				}

			} catch (Exception e) {
				System.out.println("System allow user to proceed");
				break;

			}

		productClassObj.iisProductClassLockPeriodPercentage_M003MT().sendKeys(Keys.CONTROL, Keys.DELETE);
	}
	
}