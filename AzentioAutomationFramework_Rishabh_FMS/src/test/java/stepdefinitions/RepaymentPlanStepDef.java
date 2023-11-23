package stepdefinitions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.AlertHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.IISCommonElements;
import pageobjects.iisParam.RepaymentPlanObj;
import pageobjects.iisParam.TargetMaintenanceObj;
import resources.BaseClass;

public class RepaymentPlanStepDef {
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

	IISCommonElements iisCommonElements = new IISCommonElements(driver);
	RepaymentPlanObj repaymentPlanObj = new RepaymentPlanObj(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "RepaymentPlanTestData", "DataSet ID");

	Map<String, String> testData;

	// AT_IISPRM_047
	@And("^user get the test data for test case AT_IISPRM_047$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_047() {
		testData = excelData.getTestdata("AT_IISPRM_047_D1");
	}

	@Then("user click on the Repayment plan template")
	public void user_click_on_the_repayment_plan_template() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentPlanTemplate());
		repaymentPlanObj.iisRepaymentPlanTemplate().click();

	}

	@Then("user click on maintanence under Repayment plan template")
	public void user_click_on_maintanence_under_repayment_plan_template() {
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisMaintenanceButton());
		iisCommonElements.iisMaintenanceButton().click();
	}

	@Then("^user click on the new button$")
	public void user_click_on_the_new_button() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateCodeNew());
		repaymentPlanObj.iisTemplateCodeNew().click();
		Thread.sleep(2000);
	}

	@Then("^user click on the template code field$")
	public void user_click_on_the_template_code_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().click();
	}

	@Then("^user enter the template code$")
	public void user_enter_the_template_code() {
		waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().sendKeys(testData.get("Template Code"));
		;
	}

	@Then("^user click on the short description field$")
	public void user_click_on_the_short_description_field() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisrepaymentPlanTemplateShortDescEng_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateShortDescEng_M029MT().click();
	}

	@Then("^user enter the short description field$")
	public void user_enter_the_short_description_field() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisrepaymentPlanTemplateShortDescEng_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateShortDescEng_M029MT().sendKeys(testData.get("Short Desc"));
	}

	@Then("^user click on the long description field$")
	public void user_click_on_the_long_description_field() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisrepaymentPlanTemplateShortLongEng_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateShortLongEng_M029MT().click();
	}

	@Then("^user enter the long description field$")
	public void user_enter_the_long_description_field() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisrepaymentPlanTemplateShortLongEng_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateShortLongEng_M029MT().sendKeys(testData.get("Long Desc"));
	}

	@Then("user click on the template details tab")
	public void user_click_on_the_template_details_tab() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDetailTab());
		for (int i = 0; i <= 300; i++) {
			try {
				selenium_Actions.getJavascriptHelper().scrollIntoView(repaymentPlanObj.iisTemplateDetailTab());
				repaymentPlanObj.iisTemplateDetailTab().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user click on add button icon")
	public void user_click_on_add_button_icon() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDeatilsAddBtn());
		for (int i = 0; i <= 300; i++) {
			try {
				repaymentPlanObj.iisTemplateDeatilsAddBtn().click();
				System.out.println("Clicked" + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(3000);
	}

	@Then("user click on the form feild")
	public void user_click_on_the_form_feild() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDetailsFormFeild());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(repaymentPlanObj.iisTemplateDetailsFormFeild());
				System.out.println("Clicked" + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user enter a value in form feild")
	public void user_enter_a_value_in_form_feild() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDetailsFormFeildEntry());

		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.JSEClick(repaymentPlanObj.iisTemplateDetailsFormFeildEntry());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		repaymentPlanObj.iisTemplateDetailsFormFeildEntry().click();
		repaymentPlanObj.iisTemplateDetailsFormFeildEntry().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
		repaymentPlanObj.iisTemplateDetailsFormFeildEntry().sendKeys(testData.get("From value"));
		repaymentPlanObj.iisTemplateDetailsFormFeildEntry().sendKeys(Keys.TAB);

	}

	@Then("user enter value in To feild")
	public void user_enter_value_in_to_feild() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateToFeildEntry());
		repaymentPlanObj.iisTemplateToFeildEntry().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
		repaymentPlanObj.iisTemplateToFeildEntry().sendKeys(testData.get("To Value"));
		repaymentPlanObj.iisTemplateToFeildEntry().sendKeys(Keys.TAB);
	}

	@Then("user enter value in date feild")
	public void user_enter_value_in_date_feild() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplatePeriodNbrFeildEntry());
		// repaymentPlanObj.iisTemplatePeriodNbrFeild().sendKeys(Keys.CONTROL+ "A",
		// Keys.DELETE);
		repaymentPlanObj.iisTemplatePeriodNbrFeildEntry().sendKeys(testData.get("Period Value"));
		repaymentPlanObj.iisTemplatePeriodNbrFeildEntry().sendKeys(Keys.TAB);
	}

	@Then("user click on th dropdown")
	public void user_click_on_th_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDropDown());
		repaymentPlanObj.iisTemplateDropDown().click();

	}

	@Then("user select value from the dropdown")
	public void user_select_value_from_the_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDropDown());
		for (int i = 0; i <= 300; i++) {
			try {
				repaymentPlanObj.iisTemplateDropDown().click();
				dropDownHelper.SelectUsingVisibleText(repaymentPlanObj.iisTemplateDropDown(),
						testData.get("Period Type"));
				System.out.println(testData.get("Period Type"));

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user click on the save button for template code$")
	public void user_click_on_the_save_button_for_template_code() {
		waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisrepaymentPlanTemplateMaintFormIdM029MT_Save_key());
		for (int i = 0; i <= 300; i++) {
			try {
				repaymentPlanObj.iisrepaymentPlanTemplateMaintFormIdM029MT_Save_key().click();
				break;
			} catch (Exception e) {
				System.out.println("Can't Able To Click");
			}
		}
	}

	@Then("user click ok on confirm save popup")
	public void user_click_ok_on_confirm_save_popup() {
		WebElement Confirm_Save_Popup = waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisFormPopupconfirmSaveBtn());
		boolean isConfirm_Save_Popup = Confirm_Save_Popup.isDisplayed();
		if (isConfirm_Save_Popup) {
			repaymentPlanObj.iisFormPopupconfirmSaveBtn().click();
		}
	}

	@Then("user click ok on the update successfull popup")
	public void user_click_ok_on_the_update_successfull_popup() {
		WebElement Confirm_Save_Popup = waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisFormPopupUpdateconfirmSaveBtn());
		boolean isConfirm_Save_Popup = Confirm_Save_Popup.isDisplayed();
		if (isConfirm_Save_Popup) {
			repaymentPlanObj.iisFormPopupUpdateconfirmSaveBtn().click();
		}
	}

	// updating the rec

	@Then("user click on the search bar")
	public void user_click_on_the_search_bar() {
		waitHelper.waitForElementwithFluentwait(driver, iisCommonElements.iisSearchBar());
		iisCommonElements.iisSearchBar().click();
	}

	@Then("^user click on the enter template code field$")
	public void user_click_on_the_enter_template_code_field() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisSrchTemplateCode());
		repaymentPlanObj.iisSrchTemplateCode().click();

	}

	@Then("^user enter the existing template code$")
	public void user_enter_the_existing_template_code() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisSrchTemplateCode());
		repaymentPlanObj.iisSrchTemplateCode().clear();
		repaymentPlanObj.iisSrchTemplateCode().sendKeys(testData.get("Template Code"));
		repaymentPlanObj.iisSrchTemplateCode().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user double click on the retrived record")
	public void user_double_click_on_the_retrived_record() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateCodeRec());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(repaymentPlanObj.iisTemplateCodeRec());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user click on the form feild of existing rec")
	public void user_click_on_the_form_feild_feild_of_existing_rec() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDetailsFormFeildUpdate());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(repaymentPlanObj.iisTemplateDetailsFormFeildUpdate());
				System.out.println("Clicked" + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^user enter updated value in form feild$")
	public void user_enter_updated_value_in_form_feild() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDetailsFormFeildEntryUpdate());

		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.JSEClick(repaymentPlanObj.iisTemplateDetailsFormFeildEntryUpdate());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		repaymentPlanObj.iisTemplateDetailsFormFeildEntryUpdate().click();
		repaymentPlanObj.iisTemplateDetailsFormFeildEntryUpdate().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
		repaymentPlanObj.iisTemplateDetailsFormFeildEntryUpdate().sendKeys(testData.get("Updated From Value"));
		repaymentPlanObj.iisTemplateDetailsFormFeildEntryUpdate().sendKeys(Keys.TAB);
	}

	@Then("^user enter updated value in To feild$")
	public void user_enter_updated_value_in_To_feild() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateToFeildEntryUpdate());
		repaymentPlanObj.iisTemplateToFeildEntryUpdate().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
		repaymentPlanObj.iisTemplateToFeildEntryUpdate().sendKeys(testData.get("Updated To Value"));
		repaymentPlanObj.iisTemplateToFeildEntryUpdate().sendKeys(Keys.TAB);
	}

	@Then("^user enter pdated value in date feild$")
	public void user_enter_pdated_value_in_date_feild() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplatePeriodNbrFeildEntryUpdate());
		// repaymentPlanObj.iisTemplatePeriodNbrFeild().sendKeys(Keys.CONTROL+ "A",
		// Keys.DELETE);
		repaymentPlanObj.iisTemplatePeriodNbrFeildEntryUpdate().sendKeys(testData.get("Updated Period Value"));
		repaymentPlanObj.iisTemplatePeriodNbrFeildEntryUpdate().sendKeys(Keys.TAB);
	}

	@Then("^user select updated value from the dropdown$")
	public void user_select_updated_value_from_the_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateDropDown());
		for (int i = 0; i <= 300; i++) {
			try {
				repaymentPlanObj.iisTemplateDropDown().click();
				dropDownHelper.SelectUsingVisibleText(repaymentPlanObj.iisTemplateDropDown(),
						testData.get("Period Type"));
				System.out.println(testData.get("Updated Period Type"));

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	// ----------------------del rec--------------------

	@Then("^user click on the delete button$")
	public void user_click_on_the_delete_button() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisrepaymentPlanTemplateMaint_del_M029MT());
		for (int i = 1; i <= 50; i++)
			try {
				repaymentPlanObj.iisrepaymentPlanTemplateMaint_del_M029MT().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		Thread.sleep(1000);
	}

	@Then("user click ok on confirm delete popup")
	public void user_click_ok_on_confirm_delete_popup() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisFormPopupconfirmdeleteBtn());
		for (int i = 1; i <= 50; i++)
			try {
				repaymentPlanObj.iisFormPopupconfirmdeleteBtn().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}

	}

	@Then("user click ok on the delete successfull popup")
	public void user_click_ok_on_the_delete_successfull_popup() {
		WebElement update_Delete_Popup = waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisFormPopupUpdateDeleteBtn());
		boolean isupdate_Delete_Popup = update_Delete_Popup.isDisplayed();
		if (isupdate_Delete_Popup) {
			for (int i = 1; i <= 50; i++)
				try {
					repaymentPlanObj.iisFormPopupUpdateDeleteBtn().click();
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}

		}
	}

	// -----------------

	/**
	 * // tr[@class='ui-widget-content jqgrow ui-row-ltr']/td+[+i+]+. for(
	 * 
	 * int i = 1;i<3;i++) {
	 * 
	 * String s = driver.findElement(By.xpath("//tr[@class='ui-widget-content jqgrow
	 * ui-row-ltr']/td[" + i + "]" + "")) .getAttribute("title");
	 * System.out.println(s); } }
	 **/

	@Then("^user enter the another existing template code$")
	public void user_enter_the_another_existing_template_code() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisSrchTemplateCode());
		repaymentPlanObj.iisSrchTemplateCode().clear();
		repaymentPlanObj.iisSrchTemplateCode().sendKeys(testData.get("Temp Code"));
		repaymentPlanObj.iisSrchTemplateCode().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("^user check for the grid and releavant datas$")
	public void user_check_for_the_grid_and_releavant_datas() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateCodeRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {
				String text = repaymentPlanObj.iisTemplateCodeRec().getText().trim();
				String title = repaymentPlanObj.iisTemplateCodeRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Temp Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("The grid and the releavant data is correct");

				} else {
					System.out.println("The grid and the releavant data is not correct");
				}

				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}

	}

	// ______________check for number validation

	@Then("^user enter a negative value$")
	public void user_enter_a_negative_value() {
		waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().clear();
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT()
				.sendKeys(testData.get("Negative Temp Code"));
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().sendKeys(Keys.TAB);

	}

	@Then("^user validate the feild that it does not allow negative value$")
	public void user_validate_the_feild_that_it_does_not_allow_negative_value() {

		WebElement Error_PopUp = repaymentPlanObj.iisTemplateErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}

	}

	@Then("^user click ok on the error popup$")
	public void user_click_ok_on_the_error_popup() {
		WebElement Error_PopUp = repaymentPlanObj.iisTemplateErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateErrorPopUpOkBtn());
		if (isError_PopUp) {
			for (int i = 1; i <= 50; i++)
				try {
					repaymentPlanObj.iisTemplateErrorPopUpOkBtn().click();
					System.out.println(" Error Popup Occured ");
					System.out.println("clicked on the ok btn of Error Popup");
					break;

				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}

				}

		} else {
			System.out.println("No Pop Up Occured");
		}

	}

	@Then("^user enter the maximum value$")
	public void user_enter_the_maximum_value() {
		waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().clear();
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().sendKeys(testData.get("Max Temp Code"));
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().sendKeys(Keys.TAB);
	}

	@Then("^user validate that feild accept the max value$")
	public void user_validate_that_feild_accept_the_max_value() {
		for (int i = 1; i <= 50; i++)
			try {
				WebElement Error_PopUp = repaymentPlanObj.iisTemplateErrorPopup();
				boolean isError_PopUp = Error_PopUp.isDisplayed();
				if (isError_PopUp) {
					System.out.println("System Can't allow maximum value");
				}
				break;
			} catch (Exception e) {
				System.out.println("System allowed maximum value");
				break;
			}

	}

	@Then("^user enter the invaid value$")
	public void user_enter_the_invaid_value() {
		waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT());
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().clear();
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT()
				.sendKeys(testData.get("Invalide Temp Code"));
		repaymentPlanObj.iisrepaymentPlanTemplateMaintTemplateCode_M029MT().sendKeys(Keys.TAB);
	}

	@Then("^user validate the feild that it does not allow invalid value$")
	public void user_validate_the_feild_that_it_does_not_allow_invalid_value() {
		for (int i = 1; i <= 50; i++)
			try {
				WebElement Error_PopUp = repaymentPlanObj.iisTemplateErrorPopup();
				boolean isError_PopUp = Error_PopUp.isDisplayed();
				if (isError_PopUp) {
					System.out.println("System Can't allow Invalid value");

				}
				break;
			} catch (Exception e) {
				System.out.println("System allowed Invalid value");
				break;
			}
	}

	@Then("^user check the search is working correct$")
	public void user_check_the_search_is_working_correct() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateCodeRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {
				String text = repaymentPlanObj.iisTemplateCodeRec().getText().trim();
				String title = repaymentPlanObj.iisTemplateCodeRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Temp Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("The data is correct as per the search");
					System.out.println("The search is Working Fine");

				} else {
					System.out.println("The data is incorrect as per the search");
				}

				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}

	}

	@Then("^user check for menu is available$")
	public void user_check_for_menu_is_available() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentPlanTemplate());
		WebElement Menu = repaymentPlanObj.iisRepaymentPlanTemplate();
		boolean isMenu = Menu.isDisplayed();
		if (isMenu) {
			Assert.assertTrue(isMenu, "Menu is avaliable");
		} else {
			Assert.assertFalse(isMenu, "Menu is not avaliable");
		}

	}

	@Then("^user check for the list inside the menu is avaliable$")
	public void user_check_for_the_list_inside_the_menu_is_avaliable() {
		WebElement Repayment_iisRepaymentApprove = waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisRepaymentApprove());
		WebElement Repayment_iisRepaymentList = waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisRepaymentList());
		WebElement Repayment_iisRepaymentReject = waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisRepaymentReject());
		WebElement Repayment_iisMaintenanceButton = waitHelper.waitForElementwithFluentwait(driver,
				iisCommonElements.iisMaintenanceButton());
		WebElement Repayment_UpdateandAuthorize = waitHelper.waitForElementwithFluentwait(driver,
				repaymentPlanObj.iisTemplateUpdateandAuthorize());

		boolean isRepayment_iisRepaymentApprove = Repayment_iisRepaymentApprove.isDisplayed();
		boolean isRepayment_iisRepaymentList = Repayment_iisRepaymentList.isDisplayed();
		boolean isRepayment_iisRepaymentReject = Repayment_iisRepaymentReject.isDisplayed();
		boolean isRepayment_iisMaintenanceButton = Repayment_iisMaintenanceButton.isDisplayed();
		boolean isRepayment_UpdateandAuthorize = Repayment_UpdateandAuthorize.isDisplayed();

		if (isRepayment_iisRepaymentApprove && isRepayment_iisRepaymentList && isRepayment_iisRepaymentReject
				&& isRepayment_iisMaintenanceButton && isRepayment_UpdateandAuthorize) {
			Assert.assertTrue(
					isRepayment_iisRepaymentApprove && isRepayment_iisRepaymentList && isRepayment_iisRepaymentReject
							&& isRepayment_iisMaintenanceButton && isRepayment_UpdateandAuthorize,
					"All the list item is Avaliable");
			System.out.println(Repayment_iisMaintenanceButton.getText());
			System.out.println(Repayment_UpdateandAuthorize.getText());
			System.out.println(Repayment_iisRepaymentApprove.getText());
			System.out.println(Repayment_iisRepaymentReject.getText());
			System.out.println(Repayment_iisRepaymentList.getText());
		} else {
			Assert.assertFalse(
					isRepayment_iisRepaymentApprove && isRepayment_iisRepaymentList && isRepayment_iisRepaymentReject
							&& isRepayment_iisMaintenanceButton && isRepayment_UpdateandAuthorize,
					"All the list value is not Avaliable);");
		}

	}

	// ---------------------------sorting----------------------------//

	@Then("^user click on the sort search icon$")
	public void user_click_on_the_sort_search_icon() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentSortSearchIcon());
		repaymentPlanObj.iisRepaymentSortSearchIcon().click();
	}

	@Then("^user click on the first dropdown$")
	public void user_click_on_the_first_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentSortFirstDropDown());
		repaymentPlanObj.iisRepaymentSortFirstDropDown().click();
	}

	@Then("^user select the first sorting value type$")
	public void user_select_the_first_sorting_value_type() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentSortFirstDropDown());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(repaymentPlanObj.iisRepaymentSortFirstDropDown(),
						testData.get("Sort First Value"));
				System.out.println(testData.get("Sort First Value"));

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user click on the seccond dropdown$")
	public void user_click_on_the_seccond_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentSortSecondDropDown());
		repaymentPlanObj.iisRepaymentSortSecondDropDown().click();
	}

	@Then("^user select the second sorting value type$")
	public void user_select_the_second_sorting_value_type() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentSortSecondDropDown());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(repaymentPlanObj.iisRepaymentSortSecondDropDown(),
						testData.get("Sort Second Value"));
				System.out.println(testData.get("Sort Second Value"));

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user click on the input value feild$")
	public void user_click_on_the_input_value_feild() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentSortThirdInputFeild());
		repaymentPlanObj.iisRepaymentSortThirdInputFeild().click();
	}

	@Then("^user enter the value to be sorted$")
	public void user_enter_the_value_to_be_sorted() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentSortThirdInputFeild());
		repaymentPlanObj.iisRepaymentSortThirdInputFeild().clear();
		repaymentPlanObj.iisRepaymentSortThirdInputFeild().sendKeys(testData.get("Sort third Value"));
	}

	@Then("^user click on the find icon btn$")
	public void user_click_on_the_find_icon_btn() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentSortFindIconBtn());
		repaymentPlanObj.iisRepaymentSortFindIconBtn().click();
	    Thread.sleep(1000);
	}

	@Then("^user validate the sorting is working correct$")
	public void user_validate_the_sorting_is_working_correct() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateCodeRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {
				String text = repaymentPlanObj.iisTemplateCodeRec().getText().trim();
				String title = repaymentPlanObj.iisTemplateCodeRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Sort third Value");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("The data is correct as per the search");
					System.out.println("The sorting feature is Working Fine");

				} 

				break;
			} catch (Exception e) {
				
					System.out.println("The data is incorrect as per the search");
				}
			

	}

	// ---------------------buttons check--------------------------//

	@Then("^user click on the clear button$")
	public void user_click_on_the_clear_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentClearBtn());
		repaymentPlanObj.iisRepaymentClearBtn().click();
	}

	@Then("^user click on the next button$")
	public void user_click_on_the_next_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentNextBtn());
		repaymentPlanObj.iisRepaymentNextBtn().click();
	}

	@Then("^user validate the next button is working correctly$")
	public void user_validate_the_next_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentNextBtn());
		WebElement Next_btn = repaymentPlanObj.iisRepaymentNextBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++)
			try {
				if (isNext_btn) {
					Assert.assertTrue(isNext_btn);
					System.out.println("Clicked on Next btn");
				}
				break;
			} catch (Exception e) {
                  System.out.println("click on not working");
			}

	}

	@Then("^user click on the last button$")
	public void user_click_on_the_last_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentLastBtn());
		repaymentPlanObj.iisRepaymentLastBtn().click();
	}

	@Then("^user validate the last button is working correctly$")
	public void user_validate_the_last_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentLastBtn());
		WebElement Next_btn = repaymentPlanObj.iisRepaymentLastBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++)
			try {
				if (isNext_btn) {
					Assert.assertTrue(isNext_btn);
					System.out.println("Clicked on Last btn");
				}
				break;
			} catch (Exception e) {
                  System.out.println("click on not working");
			}

	}

	@Then("^user click on the previous button$")
	public void user_click_on_the_previous_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentPreviousBtn());
		repaymentPlanObj.iisRepaymentPreviousBtn().click();
	}

	@Then("^user validate the previous button is working correctly$")
	public void user_validate_the_previous_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentPreviousBtn());
		WebElement Next_btn = repaymentPlanObj.iisRepaymentPreviousBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++)
			try {
				if (isNext_btn) {
					Assert.assertTrue(isNext_btn);
					System.out.println("Clicked on Previous btn");
				}
				break;
			} catch (Exception e) {
                  System.out.println("click on not working");
			}
	}

	@Then("^user click on the first button$")
	public void user_click_on_the_first_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentFirstBtn());
		repaymentPlanObj.iisRepaymentFirstBtn().click();
	}

	@Then("^user validate the first button is working correctly$")
	public void user_validate_the_first_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentFirstBtn());
		WebElement Next_btn = repaymentPlanObj.iisRepaymentFirstBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++)
			try {
				if (isNext_btn) {
					Assert.assertTrue(isNext_btn);
					System.out.println("Clicked on First btn");
				}
				break;
			} catch (Exception e) {
                  System.out.println("click on not working");
			}
	}
	
	//----------------------Retrival Rec------------------------------//
	
	@Then("^user check the retrival of record$")
	public void user_check_the_retrival_of_record() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisTemplateCodeRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {
				String text = repaymentPlanObj.iisTemplateCodeRec().getText().trim();
				String title = repaymentPlanObj.iisTemplateCodeRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Temp Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("The grid and the releavant data is correct");

				} else {
					System.out.println("The grid and the releavant data is not correct");
				}

				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}

	}
	
	//------------------------close screen---------------------------//
	
	@Then ("^user click on the close screen button and close the screen$")
	public void user_click_on_the_close_screen_button_and_close_the_screen() throws InterruptedException{
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisScreenCloseBtn());
		repaymentPlanObj.iisScreenCloseBtn().click();
		WebElement QuitPopUp = waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisFormPopupconfirmdeleteBtn());
		boolean isQuitPopUp = QuitPopUp.isDisplayed();
		
		for (int i = 1; i <= 50; i++) {
			try {
				if(isQuitPopUp) {
					repaymentPlanObj.iisFormPopupconfirmdeleteBtn().click();
				System.out.println("quited the popup");
				break;
				}
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
					System.out.println("No PopUp Occured");
				}
			}
		}

		
		
		Thread.sleep(10000);
	}


}
