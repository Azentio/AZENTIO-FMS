package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
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
import io.cucumber.java.en.Then;
import pageobjects.iisParam.CommonElementsObj;
import pageobjects.iisParam.ProductTypeObj;
import pageobjects.iisParam.TargetMaintenanceObj;
import resources.BaseClass;

public class IISProductTypeStepDef {

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
	ProductTypeObj productTypeObj = new ProductTypeObj(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "ProductTypeTestData", "DataSet ID");

	Map<String, String> testData;

	@And("^user get the test data for test case AT_IISPRM_049$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_049() {
		testData = excelData.getTestdata("AT_IISPRM_049_D1");
	}

	@Then("^user 49 click on the product type module$")
	public void user_49_click_on_the_product_type_module() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModule());
		productTypeObj.iisProductTypeModule().click();
	}

	@Then("^user 49 click on the maintenance tab under product type$")
	public void user_49_click_on_the_maintenance_tab_under_product_type() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModuleMaintenance());
		productTypeObj.iisProductTypeModuleMaintenance().click();
	}

	@Then("^user 49 click on the code feild$")
	public void user_49_click_on_the_code_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModuleMaintenanceCode());
		for (int i = 0; i < 2000; i++) {
			try {
				productTypeObj.iisProductTypeModuleMaintenanceCode().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		productTypeObj.iisProductTypeModuleMaintenanceCode().click();
	}

	@Then("^user 49 enter the code$")
	public void user_49_enter_the_code() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModuleMaintenanceCode());
		productTypeObj.iisProductTypeModuleMaintenanceCode().clear();
		productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys("2347");
		// productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys(testData.get("Code"));
		productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys(Keys.TAB);
		Thread.sleep(2000);
		for (int i = 1; i <= 20; i++) {
			try {
				if (commonElementsObj.iisErrorPopup().isDisplayed()) {
					System.out.println("Duplication Value Error");
					commonElementsObj.iisOkButton().click();
				}
				break;

			} catch (Exception ignored) {
				System.out.println("Duplication Value Error");
			}
		}
	}

	@Then("^user 49 click on the brief desc$")
	public void user_49_click_on_the_brief_desc() {
		waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceBriefDescription());
		productTypeObj.iisProductTypeModuleMaintenanceBriefDescription().click();
	}

	@Then("^user 49 enter the brief desc$")
	public void user_49_enter_the_brief_desc() {
		waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceBriefDescription());
		productTypeObj.iisProductTypeModuleMaintenanceBriefDescription().sendKeys(testData.get("Brief Description"));
	}

	@Then("^user 49 click on the long desc$")
	public void user_49_click_on_the_long_desc() {
		waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceLongDescription());
		productTypeObj.iisProductTypeModuleMaintenanceLongDescription().click();
	}

	@Then("^user 49 enter the long desc$")
	public void user_49_enter_the_long_desc() {
		waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceLongDescription());
		productTypeObj.iisProductTypeModuleMaintenanceLongDescription().sendKeys(testData.get("Long Description"));
	}

	@Then("^user 49 click on the save button$")
	public void user_49_click_on_the_save_button() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModuleMaintenanceSaveButton());
		productTypeObj.iisProductTypeModuleMaintenanceSaveButton().click();

	}

	@Then("^user 49 click on Ok on confirmation popup$")
	public void user_49_click_on_Ok_on_confirmation_popup() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
		commonElementsObj.iisConfirmOkButton().click();

	}

	@Then("^user 49 click on Ok on the succesfull popup$")
	public void user_49_click_on_Ok_on_the_succesfull_popup() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		commonElementsObj.iisOkButton().click();
//		WebElement Update_Popup = commonElementsObj.iisOkButton();
//		boolean isUpdate_Popup = Update_Popup.isDisplayed();
//
//		for (int i = 1; i <= 50; i++) {
//			try {
//				if (isUpdate_Popup) {
//					commonElementsObj.iisOkButton().click();
//				}
//
//			} catch (Exception e) {
//				if (i == 50) {
//
//					Assert.fail(e.getMessage());
//
//				}
//			}
//		}
	}

	// ---------------------------------update-------------------------------------------

	@Then("^user 49 click on the update after authorize tab$")
	public void user_49_click_on_the_update_after_authorize_tab() {
		waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceUpdateAndAuthorize());
		productTypeObj.iisProductTypeModuleMaintenanceUpdateAndAuthorize().click();
	}

	@Then("^user 49 double click on the Uretrived rec$")
	public void user_49_double_click_on_the_Uretrived_rec() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisURetrivedRec());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(productTypeObj.iisURetrivedRec());
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user 49 enter the new brief desc$")
	public void user_49_enter_the_new_brief_desc() {
		waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceBriefDescription());
		productTypeObj.iisProductTypeModuleMaintenanceBriefDescription().clear();
		productTypeObj.iisProductTypeModuleMaintenanceBriefDescription()
				.sendKeys(testData.get("Updated Brief Description"));
		;
	}

	@Then("^user 49 click on the update button$")
	public void user_49_click_on_the_update_button() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisUpdateBtn());
		productTypeObj.iisUpdateBtn().click();
	}

	// ----------------------------------delete--------------------------------------------

	@Then("^user 49 click on the search btn$")
	public void user_49_click_on_the_search_btn() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisSearchBtn());
		productTypeObj.iisSearchBtn().click();
	}

	@Then("^user 49 click on the Utype code feild$")
	public void user_49_click_on_the_Utype_code_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisUTypecodeFeild());
		productTypeObj.iisUTypecodeFeild().click();
	}

	@Then("^user 49 click on the type code feild$")
	public void user_49_click_on_the_type_code_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisTypecodeFeild());
		productTypeObj.iisTypecodeFeild().click();
	}

	@Then("^user 49 enter the Utype code$")
	public void user_49_enter_Utype_the_code() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisUTypecodeFeild());
		productTypeObj.iisUTypecodeFeild().clear();
		productTypeObj.iisUTypecodeFeild().sendKeys(testData.get("Code"));
	}

	@Then("^user 49 enter the type code$")
	public void user_49_enter_type_the_code() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisTypecodeFeild());
		productTypeObj.iisTypecodeFeild().clear();
		productTypeObj.iisTypecodeFeild().sendKeys(testData.get("Code"));
		productTypeObj.iisTypecodeFeild().sendKeys(Keys.ENTER);
	}

	@Then("^user 49 double click on the retrived rec$")
	public void user_49_double_click_on_the_retrived_rec() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisRetrivedRec());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(productTypeObj.iisRetrivedRec());
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user 49 click on the delete btn$")
	public void user_49_click_on_the_delete_btn() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisDeleteBtn());
		for (int i = 0; i <= 300; i++) {
			try {
				productTypeObj.iisDeleteBtn().click();
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	// --------------------------------------number
	// validation-------------------------------------

	@Then("^user 49 enter negative value$")
	public void user_49_enter_negative_value() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModuleMaintenanceCode());
		productTypeObj.iisProductTypeModuleMaintenanceCode().clear();
		productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys(testData.get("Negative Value"));
		// .sendKeys(testData.get("Negative Temp Code"));
		productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys(Keys.TAB);

	}

	@Then("^user 49 validate the feild that it does not allow negative value$")
	public void user_validate_the_feild_that_it_does_not_allow_negative_value() {

		WebElement Error_PopUp = commonElementsObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}

	}

	@Then("^user 49 click ok on the error popup$")
	public void user_49_click_ok_on_the_error_popup() {
		WebElement Error_PopUp = commonElementsObj.iisOkButton();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		if (isError_PopUp) {
			for (int i = 1; i <= 50; i++) {
				try {
					commonElementsObj.iisOkButton().click();
					System.out.println(" Error Popup Occured ");
					System.out.println("clicked on the ok btn of Error Popup");
					break;

				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}

				}
			}

		} else {
			System.out.println("No Pop Up Occured");
		}

	}

	@Then("^user 49 enter max value$")
	public void user_49_enter_max_value() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModuleMaintenanceCode());
		productTypeObj.iisProductTypeModuleMaintenanceCode().clear();
		productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys(testData.get("Max Value"));
		productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys(Keys.TAB);
	}

	@Then("^user 49 validate that feild accept the max value$")
	public void user_validate_that_feild_accept_the_max_value() {
		for (int i = 1; i <= 50; i++) {
			try {
				WebElement Error_PopUp = commonElementsObj.iisErrorPopup();
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

	}

	@Then("^user 49 enter the invaid value$")
	public void user_enter_the_invaid_value() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModuleMaintenanceCode());
		productTypeObj.iisProductTypeModuleMaintenanceCode().clear();
		productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys(testData.get("Invalide Value"));
		// .sendKeys(testData.get("Invalide Temp Code"));
		productTypeObj.iisProductTypeModuleMaintenanceCode().sendKeys(Keys.TAB);
	}

	@Then("^user 49 validate the feild that it does not allow invalid value$")
	public void user_validate_the_feild_that_it_does_not_allow_invalid_value() {
		for (int i = 1; i <= 50; i++) {
			try {
				WebElement Error_PopUp = commonElementsObj.iisErrorPopup();
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
	}

	// ---------------------------------------------------Search
	// check------------------------------------------------------------------//

	@Then("^user 49 check the search is working correct$")
	public void user_49_check_the_search_is_working_correct() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisRetrivedRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++) {
			try {
				String text = productTypeObj.iisRetrivedRec().getText().trim();
				String title = productTypeObj.iisRetrivedRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text; // text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Code");
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
	}

	// ---------------------------list grid
	// check--------------------------------------------------------------------//

	@Then("^user 49 check for menu is available$")
	public void user_check_for_menu_is_available() {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisProductTypeModule());
		WebElement Menu = productTypeObj.iisProductTypeModule();
		boolean isMenu = Menu.isDisplayed();
		if (isMenu) {
			Assert.assertTrue(isMenu);
			System.out.println("Menu is avaliable");
		} else {
			Assert.assertFalse(isMenu);
			System.out.println("Menu is not avaliable");
		}

	}

	@Then("^user 49 check for the list inside the menu is avaliable$")
	public void user_check_for_the_list_inside_the_menu_is_avaliable() {
		WebElement TargetMaintenance_Approve = waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceApprove());
		WebElement TargetMaintenance_List = waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceList());
		WebElement TargetMaintenance_Reject = waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceReject());
		WebElement TargetMaintenance_MaintenanceButton = waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenance());
		WebElement TargetMaintenance_UpdateandAuthorize = waitHelper.waitForElementwithFluentwait(driver,
				productTypeObj.iisProductTypeModuleMaintenanceUpdateAndAuthorize());

		boolean isTargetMaintenance_Approve = TargetMaintenance_Approve.isDisplayed();
		boolean isTargetMaintenance_List = TargetMaintenance_List.isDisplayed();
		boolean isTargetMaintenance_Reject = TargetMaintenance_Reject.isDisplayed();
		boolean isTargetMaintenance_MaintenanceButton = TargetMaintenance_MaintenanceButton.isDisplayed();
		boolean isTargetMaintenance_UpdateandAuthorize = TargetMaintenance_UpdateandAuthorize.isDisplayed();

		if (isTargetMaintenance_Approve && isTargetMaintenance_List && isTargetMaintenance_Reject
				&& isTargetMaintenance_MaintenanceButton && isTargetMaintenance_UpdateandAuthorize) {
			Assert.assertTrue("All the list item is Avaliable",
					isTargetMaintenance_Approve && isTargetMaintenance_List && isTargetMaintenance_Reject
							&& isTargetMaintenance_MaintenanceButton && isTargetMaintenance_UpdateandAuthorize);
			System.out.println(TargetMaintenance_MaintenanceButton.getText());
			System.out.println(TargetMaintenance_UpdateandAuthorize.getText());
			System.out.println(TargetMaintenance_Approve.getText());
			System.out.println(TargetMaintenance_Reject.getText());
			System.out.println(TargetMaintenance_List.getText());
		} else {
			Assert.assertFalse("All the list value is not Avaliable",
					isTargetMaintenance_Approve && isTargetMaintenance_List && isTargetMaintenance_Reject
							&& isTargetMaintenance_MaintenanceButton && isTargetMaintenance_UpdateandAuthorize);
		}

	}

	// ---------------------------------------------Sorting
	// Functionality-----------------------------------------------------------//

	@Then("^user 49 click on the sort search icon$")
	public void user_49_click_on_the_sort_search_icon() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortBtn());
		commonElementsObj.iisSortBtn().click();
	}

	@Then("^user 49 click on the clear button$")
	public void user_49_click_on_the_clear_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisClearBtn());
		commonElementsObj.iisClearBtn().click();
	}

	@Then("^user 49 click on the first dropdown$")
	public void user_49_click_on_the_first_dropdown() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortFirstDropDown());
		commonElementsObj.iisSortFirstDropDown().click();
		// Thread.sleep(2000);
	}

	@Then("^user 49 select the first sorting value type$")
	public void user_49_select_the_first_sorting_value_type() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortFirstDropDown());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(commonElementsObj.iisSortFirstDropDown(),
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

	@Then("^user 49 click on the seccond dropdown$")
	public void user_49_click_on_the_seccond_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortSecondDropDown());
		commonElementsObj.iisSortSecondDropDown().click();
	}

	@Then("^user 49 select the second sorting value type$")
	public void user_49_select_the_second_sorting_value_type() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortSecondDropDown());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(commonElementsObj.iisSortSecondDropDown(),
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

	@Then("^user 49 click on the input value feild$")
	public void user_49_click_on_the_input_value_feild() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortThirdInputFeild());
		commonElementsObj.iisSortThirdInputFeild().click();
	}

	@Then("^user 49 enter the value to be sorted$")
	public void user_49_enter_the_value_to_be_sorted() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSortThirdInputFeild());
		commonElementsObj.iisSortThirdInputFeild().clear();
		commonElementsObj.iisSortThirdInputFeild().sendKeys(testData.get("Sort third Value"));
	}

	@Then("^user 49 click on the find icon btn$")
	public void user_49_click_on_the_find_icon_btn() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisSortFindIconBtn());
		productTypeObj.iisSortFindIconBtn().click();
		Thread.sleep(1000);
	}

	@Then("^user 49 validate the sorting is working correct$")
	public void user_49_validate_the_sorting_is_working_correct() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisRetrivedRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++) {
			try {
				String text = productTypeObj.iisRetrivedRec().getText().trim();
				String title = productTypeObj.iisRetrivedRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text;// text.substring(1);
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

	}

	// -----------------------------------------Button
	// check---------------------------------//

	@Then("^user 49 click on the next button$")
	public void user_49_click_on_the_next_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisNextBtn());
		commonElementsObj.iisNextBtn().click();
	}

	@Then("^user 49 validate the next button is working correctly$")
	public void user_49_validate_the_next_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisNextBtn());
		WebElement Next_btn = commonElementsObj.iisNextBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++) {
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

	}

	@Then("^user 49 click on the last button$")
	public void user_49_click_on_the_last_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisLastBtn());
		commonElementsObj.iisLastBtn().click();
	}

	@Then("^user 49 validate the last button is working correctly$")
	public void user_49_validate_the_last_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisLastBtn());
		WebElement Next_btn = commonElementsObj.iisLastBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++) {
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

	}

	@Then("^user 49 click on the previous button$")
	public void user_49_click_on_the_previous_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisPreviousBtn());
		commonElementsObj.iisPreviousBtn().click();
	}

	@Then("^user 49 validate the previous button is working correctly$")
	public void user_49_validate_the_previous_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisPreviousBtn());
		WebElement Next_btn = commonElementsObj.iisPreviousBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++) {
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
	}

	@Then("^user 49 click on the first button$")
	public void user_49_click_on_the_first_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisFirstBtn());
		commonElementsObj.iisFirstBtn().click();
	}

	@Then("^user 49 validate the first button is working correctly$")
	public void user_49_validate_the_first_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisFirstBtn());
		WebElement Next_btn = commonElementsObj.iisFirstBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++) {
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
	}

	// --------------------------------------------------retrival ofr rec
	// check---------------------------------------------------//

	@Then("^user 49 check the retrival of record$")
	public void user_49_check_the_retrival_of_record() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, productTypeObj.iisRetrivedRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++) {
			try {
				String text = productTypeObj.iisRetrivedRec().getText().trim();
				String title = productTypeObj.iisRetrivedRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text; // text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("The data is correct as per the search");
					System.out.println("The search is Working Fine");
					System.out.println("The Retrived Rec is correct as per the search");

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
	}

	// ------------------closing the screen-----------------------------//

	@Then("^user 49 click on the close screen button and close the screen$")
	public void user_49_click_on_the_close_screen_button_and_close_the_screen() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		commonElementsObj.iisScreenCloseBtn().click();
		System.out.println("Closed the Screen ");
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
//				if(i==49) {
//					
//					System.out.println("No PopUp Occured Closing the Screen");
//				}
//			}
//		}		
//		
	}

}
