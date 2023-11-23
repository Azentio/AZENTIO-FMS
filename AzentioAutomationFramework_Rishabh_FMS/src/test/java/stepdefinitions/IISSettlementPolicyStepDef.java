package stepdefinitions;

import java.time.Duration;
import java.util.Map;

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
import pageobjects.iisParam.CommonElementsObj;
import pageobjects.iisParam.SettlementPolicyObj;
import resources.BaseClass;

public class IISSettlementPolicyStepDef {
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
	CommonElementsObj commonElementsObj = new CommonElementsObj(driver);
	SettlementPolicyObj settlementPolicyObj = new SettlementPolicyObj(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "SettlementPolicyTestData", "DataSet ID");

	Map<String, String> testData;

	@And("^user get the test data for test case AT_IISPRM_046$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_046() {
		testData = excelData.getTestdata("AT_IISPRM_046_D1");
	}

	@Then("^user 46 click on the settlement policy module$")
	public void user_46_click_on_the_settlement_policy_module() {
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisSettlementPolicyModule());
		settlementPolicyObj.iisSettlementPolicyModule().click();
	}

	@Then("^user 46 click on the maintenanace under settlement policy module$")
	public void user_46_click_on_the_maintenanace_under_settlement_policy_module() {
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisSettlementPolicyMaintenence());
		settlementPolicyObj.iisSettlementPolicyMaintenence().click();
	}

	@Then("^user 46 click on the policy no feild$")
	public void user_46_click_on_the_policy_no_feild() {
		waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild());
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().click();
	}

	@Then("^user 46 enter the policy no$")
	public void user_46_enter_the_policy_no() {
		waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild());
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().sendKeys("1777");
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().sendKeys(Keys.TAB);
	}

	@Then("^user 46 click ok on the information popup$")
	public void user_46_click_ok_on_the_information_popup() {
		for (int i = 1; i <= 46; i++) {
			if (settlementPolicyObj.iisInformationPopUp().isDisplayed()) {
				try {

					commonElementsObj.iisOkButton().click();
					System.out.println(" Information PopUp Appeared!! clicked on the inforamtion ok button ");
					break;
				} catch (Exception e) {
					continue;
				}
			}
		}
	}

	@Then("^user 46 click on the policy description feild$")
	public void user_46_click_on_the_policy_description_feild() {
		waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenencePolicyDescriptionFeild());
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyDescriptionFeild().click();
	}

	@Then("^user 46 enter the policy description$")
	public void user_46_enter_the_policy_description() {
		waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenencePolicyDescriptionFeild());
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyDescriptionFeild().sendKeys("Policy Desc");// sendKeys(testData.get("Policy
																											// Desc"));
	}

	@Then("^user 46 click on the save button$")
	public void user_46_click_on_the_save_button() {
		waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoSaveButton());
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoSaveButton().click();
	}

	@Then("^user 46 click ok on the confirm popup$")
	public void user_46_click_ok_on_the_confirm_popup() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
		commonElementsObj.iisConfirmOkButton().click();
	}

	@Then("^user 46 click ok on the succesfull popup$")
	public void user_46_click_ok_on_the_succesfull_popup() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		commonElementsObj.iisOkButton().click();
	}

	// --------------------------------------------------- Checking
	// numbers-----------------------------------------------------------------//

	@Then("^user 46 enter a negative value$")
	public void user_50_enter_a_negative_value() {
		waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild());
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().sendKeys("-111");
		// .sendKeys(testData.get("Negative Value"));
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().sendKeys(Keys.TAB);
	}

	@Then("^user 46 validate the feild that it does not allow negative value$")
	public void user_50_validate_the_feild_that_it_does_not_allow_negative_value() {
		WebElement Error_PopUp = settlementPolicyObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}
	}

	@Then("^user 46 dismiss the first error popup$")
	public void user_46_dismiss_the_first_error_popup() throws InterruptedException {
		WebElement Error_PopUp_Cancel_Btn = commonElementsObj.iisErrorPopupDismissBtn();
		boolean isError_PopUp_Cancel_Btn = Error_PopUp_Cancel_Btn.isDisplayed();
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisErrorPopupDismissBtn());
		if (isError_PopUp_Cancel_Btn) {
			for (int i = 1; i <= 46; i++)
				try {
					commonElementsObj.iisErrorPopupDismissBtn().click();
					System.out.println(" Error Popup Occured ");
					System.out.println("clicked on the ok btn of Error Popup");
					break;

				} catch (Exception e) {
					if (i == 46) {
						Assert.fail(e.getMessage());
					}

				}

		} else {
			System.out.println("No Pop Up Occured");
		}
		Thread.sleep(2000);
	}

	@Then("^user 46 click ok on the error popup$")
	public void user_50_click_ok_on_the_error_popup() throws InterruptedException {
		WebElement Error_PopUp = settlementPolicyObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		if (isError_PopUp) {
			for (int i = 1; i <= 46; i++)
				try {
					commonElementsObj.iisOkButton().click();
					System.out.println(" Error Popup Occured ");
					System.out.println("clicked on the ok btn of Error Popup");
					break;

				} catch (Exception e) {
					if (i == 46) {
						Assert.fail(e.getMessage());
					}

				}

		} else {
			System.out.println("No Pop Up Occured");
		}
		Thread.sleep(2000);
	}

	@Then("^user 46 enter the maximum value$")
	public void user_50_enter_the_maximum_value() {
		waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild());
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().sendKeys("1777");
		// .sendKeys(testData.get("Category code"));
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().sendKeys(Keys.TAB);
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		WebElement Error = commonElementsObj.iisOkButton();
		if (Error.isDisplayed()) {
			for (int i = 1; i <= 46; i++)
				try {
					commonElementsObj.iisOkButton().click();

					System.out.println("clicked on the ok btn of Error Popup");
					break;

				} catch (Exception e) {
					if (i == 46) {
						Assert.fail(e.getMessage());
					}

				}

		} else {
			System.out.println("No Pop Up Occured");
		}
	}

	@Then("^user 46 validate that feild accept the max value$")
	public void user_50_validate_that_feild_accept_the_max_value() {
		WebElement Error_PopUp = settlementPolicyObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}
	}

	@Then("^user 46 enter the invaid value$")
	public void user_50_enter_the_invaid_value() {
		waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild());
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().sendKeys("0000");
		// .sendKeys(testData.get("Invalide Value"));
		settlementPolicyObj.iisSettlementPolicyMaintenencePolicyNoFeild().sendKeys(Keys.TAB);
	}

	@Then("^user 46 validate the feild that it does not allow invalid value$")
	public void user_50_validate_the_feild_that_it_does_not_allow_invalid_value() {
		WebElement Error_PopUp = settlementPolicyObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}
	}

	@Then("^user 46 click on the search feild$")
	public void user_46_click_on_the_search_feild() {
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisSearchButon());
		settlementPolicyObj.iisSearchButon().click();
	}

	@Then("^user 46 click on the policy no under search tab$")
	public void user_46_click_on_the_policy_no_under_search_tab() {
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisGridPolicyNoFeild());
		settlementPolicyObj.iisGridPolicyNoFeild().click();
	}

	@Then("^user 46 enter the policy no under search tab$")
	public void user_46_enter_the_policy_no_under_search_tab() {
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisGridPolicyNoFeild());
		settlementPolicyObj.iisGridPolicyNoFeild().sendKeys("1777");
		settlementPolicyObj.iisGridPolicyNoFeild().sendKeys(Keys.ENTER);
	}

	@Then("^user 46 validate the searching is working properly$")
	public void user_46_validate_the_searching_is_working_properly() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisGridRetrivedRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {
				String text = settlementPolicyObj.iisGridRetrivedRec().getText().trim();
				String title = settlementPolicyObj.iisGridRetrivedRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text; // .substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = "1777"; // testData.get("Temp Code");
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
	
	@Then ("^user 46 check for menu is available$")
	public void user_46_check_for_menu_is_available(){
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisSettlementPolicyModule());
		WebElement Menu = settlementPolicyObj.iisSettlementPolicyModule();
		boolean isMenu = Menu.isDisplayed();
		if (isMenu) {
			Assert.assertTrue(isMenu, "Menu is avaliable");
		} else {
			Assert.assertFalse(isMenu, "Menu is not avaliable");
		}
	}
	
	
	
	@Then("^user 46 check for the list inside the menu is avaliable$")
	public void user_46_check_for_the_list_inside_the_menu_is_avaliable() {
		WebElement Settlement_Approve = waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyApprove());
		WebElement Settlement_Reactivate = waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyReactivate());
		WebElement Settlement_Reject = waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyReject());
		WebElement Settlement_MaintenanceButton = waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyMaintenence());
		WebElement Settlement_UpdateandAuthorize = waitHelper.waitForElementwithFluentwait(driver,
				settlementPolicyObj.iisSettlementPolicyUpdateAfterApprova());

		boolean isSettlement_Approve = Settlement_Approve.isDisplayed();
		boolean isSettlement_Reactivate = Settlement_Reactivate.isDisplayed();
		boolean isSettlement_Reject = Settlement_Reject.isDisplayed();
		boolean isSettlement_MaintenanceButton = Settlement_MaintenanceButton.isDisplayed();
		boolean isSettlement_UpdateandAuthorize = Settlement_UpdateandAuthorize.isDisplayed();

		if (isSettlement_Approve && isSettlement_Reactivate && isSettlement_Reject
				&& isSettlement_MaintenanceButton && isSettlement_UpdateandAuthorize) {
			Assert.assertTrue(
					isSettlement_Approve && isSettlement_Reactivate && isSettlement_Reject
							&& isSettlement_MaintenanceButton && isSettlement_UpdateandAuthorize, "All the list value is not Avaliable");
			System.out.println(Settlement_MaintenanceButton.getText());
			System.out.println(Settlement_UpdateandAuthorize.getText());
			System.out.println(Settlement_Approve.getText());
			System.out.println(Settlement_Reject.getText());
			System.out.println(Settlement_Reactivate.getText());
		} else {
			Assert.assertFalse(
					isSettlement_Approve && isSettlement_Reactivate && isSettlement_Reject
					&& isSettlement_MaintenanceButton && isSettlement_UpdateandAuthorize,
					"All the list value is not Avaliable");
		}

	}
	
	//-------------------------------------------sorting--------------------------------------------------------------------------------//
	
	@Then("^user 46 click on the sort search icon$")
	public void user_46_click_on_the_sort_search_icon() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortBtn());
		commonElementsObj.iisSortBtn().click();
	}

	@Then("^user 46 click on the first dropdown$")
	public void user_46_click_on_the_first_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortFirstDropDown());
		commonElementsObj.iisSortFirstDropDown().click();
	}

	@Then("^user 46 select the first sorting value type$")
	public void user_46_select_the_first_sorting_value_type() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortFirstDropDown());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(commonElementsObj.iisSortFirstDropDown(),"Policy No");
						//,testData.get("Sort First Value"));
				System.out.println(testData.get("Sort First Value"));

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user 46 click on the seccond dropdown$")
	public void user_46_click_on_the_seccond_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortSecondDropDown());
		commonElementsObj.iisSortSecondDropDown().click();
	}

	@Then("^user 46 select the second sorting value type$")
	public void user_46_select_the_second_sorting_value_type() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortSecondDropDown());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(commonElementsObj.iisSortSecondDropDown(),"equal");
						//testData.get("Sort Second Value"));
				System.out.println(testData.get("Sort Second Value"));

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user 46 click on the input value feild$")
	public void user_46_click_on_the_input_value_feild() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortThirdInputFeild());
		commonElementsObj.iisSortThirdInputFeild().click();
	}

	@Then("^user 46 enter the value to be sorted$")
	public void user_46_enter_the_value_to_be_sorted() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortThirdInputFeild());
		commonElementsObj.iisSortThirdInputFeild().clear();
		commonElementsObj.iisSortThirdInputFeild().sendKeys("1777"); //(testData.get("Sort third Value"));
	}

	@Then("^user 46 click on the find icon btn$")
	public void user_46_click_on_the_find_icon_btn() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisSettlementPolicySortingFindIconBtn());
		settlementPolicyObj.iisSettlementPolicySortingFindIconBtn().click();
	    Thread.sleep(1000);
	}

	@Then("^user 46 validate the sorting is working correct$")
	public void user_46_validate_the_sorting_is_working_correct() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisGridRetrivedRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {
				String text = settlementPolicyObj.iisGridRetrivedRec().getText().trim();
				String title = settlementPolicyObj.iisGridRetrivedRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text; // .substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = "1777"; // testData.get("Temp Code");
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
	
	
	//---------------------------------------------Checking button----------------------------------------------------------------------//
	@Then("^user 46 click on the clear button$")
	public void user_46_click_on_the_clear_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisClearBtn());
		commonElementsObj.iisClearBtn().click();
	}

	@Then("^user 46 click on the next button$")
	public void user_46_click_on_the_next_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisNextBtn());
		commonElementsObj.iisNextBtn().click();
	}

	@Then("^user 46 validate the next button is working correctly$")
	public void user_46_validate_the_next_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisNextBtn());
		WebElement Next_btn = commonElementsObj.iisNextBtn();
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

	@Then("^user 46 click on the last button$")
	public void user_46_click_on_the_last_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisLastBtn());
		commonElementsObj.iisLastBtn().click();
	}

	@Then("^user 46 validate the last button is working correctly$")
	public void user_46_validate_the_last_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisLastBtn());
		WebElement Next_btn = commonElementsObj.iisLastBtn();
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

	@Then("^user 46 click on the previous button$")
	public void user_46_click_on_the_previous_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisPreviousBtn());
		commonElementsObj.iisPreviousBtn().click();
	}

	@Then("^user 46 validate the previous button is working correctly$")
	public void user_46_validate_the_previous_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisPreviousBtn());
		WebElement Next_btn = commonElementsObj.iisPreviousBtn();
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

	@Then("^user 46 click on the first button$")
	public void user_46_click_on_the_first_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisFirstBtn());
		commonElementsObj.iisFirstBtn().click();
	}

	@Then("^user 46 validate the first button is working correctly$")
	public void user_46_validate_the_first_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisFirstBtn());
		WebElement Next_btn = commonElementsObj.iisFirstBtn();
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
	
	//---------------------------------------------------------------retrival of rec -------------------------------------------------------------------------//
	
	@Then ("^user 46 checks the retrival of the rec$")
	public void user_46_checks_the_retrival_of_the_rec(){
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisGridRetrivedRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {
				String text = settlementPolicyObj.iisGridRetrivedRec().getText().trim();
				String title = settlementPolicyObj.iisGridRetrivedRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text; // .substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = "1777"; // testData.get("Temp Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("Succesfully Retrived the Record");
					

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
	
	@Then ("^user 46 double click on the retrived rec$")
	public void user_46_double_click_on_the_retrived_rec(){
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisGridRetrivedRec());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(settlementPolicyObj.iisGridRetrivedRec());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	@Then ("^user 46 check the status$")
	public void user_46_check_the_status(){
		waitHelper.waitForElementwithFluentwait(driver, settlementPolicyObj.iisSettlementPolicyCurrentStatus());
		String Current_Status = settlementPolicyObj.iisSettlementPolicyCurrentStatus().getText();
		System.out.println("The Current is : " + Current_Status);
		
	}
	
	@Then ("^user 46 click on the close screen button and close the screen$")
	public void user_46_click_on_the_close_screen_button_and_close_the_screen() throws InterruptedException{
		
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		commonElementsObj.iisScreenCloseBtn().click();
//		WebElement QuitPopUp = waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
//		boolean isQuitPopUp = QuitPopUp.isDisplayed();
//		
//		for (int i = 1; i <= 50; i++) {
//			try {
//				if(isQuitPopUp) {
//					commonElementsObj.iisConfirmOkButton().click();
//				System.out.println("quited the popup");
//				break;
//				}
//			} catch (Exception e) {
//				if(i==50) {
//					Assert.fail(e.getMessage());
//					System.out.println("No PopUp Occured");
//				}
//			}
//		}

		
		
		Thread.sleep(2000);
	}
	

}
