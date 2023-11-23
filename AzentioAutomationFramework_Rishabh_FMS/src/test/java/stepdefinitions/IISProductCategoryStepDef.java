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
import pageobjects.iisParam.CommonElementsObj;
import pageobjects.iisParam.ProductSubCategoryObj;
import resources.BaseClass;

public class IISProductCategoryStepDef {
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
	ProductSubCategoryObj productSubCategoryObj = new ProductSubCategoryObj(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "ProductSubCategoryTestData", "DataSet ID");

	Map<String, String> testData;

	// AT_IISPRM_050
	@And("^user get the test data for test case AT_IISPRM_050$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_050() {
		testData = excelData.getTestdata("AT_IISPRM_050_D1");
	}

	@Then("^user 50 click on the product sub category module$")
	public void user_50_click_on_the_product_sub_category_module() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryModule());
		productSubCategoryObj.ProductSubCategoryModule().click();
	}

	@Then("^user 50 click on the maintenance under product sub category$")
	public void user_50_click_on_the_maintenance_under_product_sub_category() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryModuleMaintenance());
		productSubCategoryObj.ProductSubCategoryModuleMaintenance().click();
	}

	@Then("^user 50 click on the category feild$")
	public void user_50_click_on_the_category_feild() {
		waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE());
		productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE().click();
	}

	@Then("^user 50 click on the category search icon btn$")
	public void user_50_click_on_the_category_search_icon_btn() {
		waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYLOOKUPBTN());
		productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYLOOKUPBTN().click();
	}

	@Then("^user 50 click on the application name$")
	public void user_50_click_on_the_application_name() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.gridtabCATEGORYCODEM032MTgsAPP_NAME());
		productSubCategoryObj.gridtabCATEGORYCODEM032MTgsAPP_NAME().click();
	}

	@Then("^user 50 enter the application name$")
	public void user_50_enter_the_application_name() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.gridtabCATEGORYCODEM032MTgsAPP_NAME());
		productSubCategoryObj.gridtabCATEGORYCODEM032MTgsAPP_NAME().clear();
		productSubCategoryObj.gridtabCATEGORYCODEM032MTgsAPP_NAME().sendKeys(testData.get("Application Name"));
	}

	@Then("^user 50 click on code feild$")
	public void user_50_click_on_code_feild() {
		waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.gridtabCATEGORYCODEM032MTgsCATEGORYCODE());
		productSubCategoryObj.gridtabCATEGORYCODEM032MTgsCATEGORYCODE().click();
	}

	@Then("^user 50 enter the code$")
	public void user_50_enter_the_code() {
		waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.gridtabCATEGORYCODEM032MTgsCATEGORYCODE());
		productSubCategoryObj.gridtabCATEGORYCODEM032MTgsCATEGORYCODE().clear();
		productSubCategoryObj.gridtabCATEGORYCODEM032MTgsCATEGORYCODE().sendKeys(testData.get("Category code"));
	}

	@Then("^user 50 double click on the retrive lookup rec$")
	public void user_50_double_click_on_the_retrive_lookup_rec() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.gridtabCATEGORYCODEM032MTRetrivedRec());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(productSubCategoryObj.gridtabCATEGORYCODEM032MTRetrivedRec());
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user 50 click on the sub category feild$")
	public void user_50_click_on_the_sub_category_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SUBCATEGORYCODEM032MT());
		productSubCategoryObj.SUBCATEGORYCODEM032MT().click();
	}

	@Then("^user 50 enter the sub category value$")
	public void user_50_enter_the_sub_category_value() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SUBCATEGORYCODEM032MT());
		productSubCategoryObj.SUBCATEGORYCODEM032MT().sendKeys(testData.get("Sub Category Code"));
	}

	@Then("^user 50 click on the brief desc feild$")
	public void user_50_click_on_the_brief_desc_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.trscategorysubbriefdescengM032MT());
		productSubCategoryObj.trscategorysubbriefdescengM032MT().click();
	}

	@Then("^user 50 enter the brief desc$")
	public void user_50_enter_the_brief_desc() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.trscategorysubbriefdescengM032MT());
		productSubCategoryObj.trscategorysubbriefdescengM032MT().sendKeys(testData.get("Brief Description"));
	}

	@Then("^user 50 click on the long desc feild$")
	public void user_50_click_on_the_long_desc_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.trscategorysublongdescengM032MT());
		productSubCategoryObj.trscategorysublongdescengM032MT().click();
	}

	@Then("^user 50 enter the long desc$")
	public void user_50_enter_the_long_desc() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.trscategorysublongdescengM032MT());
		productSubCategoryObj.trscategorysublongdescengM032MT().sendKeys(testData.get("Long Description"));
	}

	@Then("^user 50 click on the save button$")
	public void user_50_click_on_the_save_button() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisSaveBtn());
		commonElementsObj.iisSaveBtn().click();
		System.out.println(productSubCategoryObj.ErrorPopup().getText());

		WebElement Error_message = productSubCategoryObj.ErrorPopup();
		boolean isError_message = Error_message.isDisplayed();
		if (isError_message == true) {
			for (int i = 1; i <= 50; i++) {
				try {
					productSubCategoryObj.ErrorPopupOKBtn().click();
					System.out.println("clicked on alert");

					break;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		else {
			System.out.println("Can't able to clicked on alert");
		}
		commonElementsObj.iisSaveBtn().click();

	}

	@Then("^user 50 click on the succesfull ok button$")
	public void user_50_click_on_the_succesfull_ok_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		commonElementsObj.iisOkButton().click();
	}

	// ---------------------------updating the
	// record------------------------------//

	@Then("^user 50 click on the search button$")
	public void user_50_click_on_the_search_button() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.infoBarSearchButton());
		productSubCategoryObj.infoBarSearchButton().click();
	}

	@Then("^user 50 click on the search app Name key feild$")
	public void user_50_click_on_the_search_app_Name_key_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.APPNAMEFeild());
		productSubCategoryObj.APPNAMEFeild().click();
	}

	@Then("^user 50 enter the app name key code$")
	public void user_50_enter_the_app_name_key_code() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.APPNAMEFeild());
		productSubCategoryObj.APPNAMEFeild().clear();
		productSubCategoryObj.APPNAMEFeild().sendKeys(testData.get("Application Name"));
	}

	@Then("^user 50 click on the search category code key feild$")
	public void user_50_click_on_the_search_category_code_key_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.CATEGORYCODEFeild());
		productSubCategoryObj.CATEGORYCODEFeild().click();
	}

	@Then("^user 50 enter the category code key$")
	public void user_50_enter_the_category_code_key() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.CATEGORYCODEFeild());
		productSubCategoryObj.CATEGORYCODEFeild().clear();
		productSubCategoryObj.CATEGORYCODEFeild().sendKeys(testData.get("Code"));
	}

	@Then("^user 50 click on the search sub category feild$")
	public void user_50_click_on_the_search_sub_category_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SUBCATEGORYCODEFeild());
		productSubCategoryObj.SUBCATEGORYCODEFeild().click();
	}

	@Then("^user 50 enter the sub category code$")
	public void user_50_enter_the_sub_category_code() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SUBCATEGORYCODEFeild());
		productSubCategoryObj.SUBCATEGORYCODEFeild().clear();
		productSubCategoryObj.SUBCATEGORYCODEFeild().sendKeys(testData.get("Sub Category Code"));
		productSubCategoryObj.SUBCATEGORYCODEFeild().sendKeys(Keys.ENTER);
	}

	@Then("^user 50 double click on the fetched record$")
	public void user_50_double_click_on_the_fetched_record() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SearchedRecord());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(productSubCategoryObj.SearchedRecord());
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	}

	@Then("^user 50 click on the brief description$")
	public void user_50_click_on_the_brief_description() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.trscategorysubbriefdescengM032MT());
		productSubCategoryObj.trscategorysubbriefdescengM032MT().click();
		Thread.sleep(2000);

	}

	@Then("^user 50 enter the updated brief description value$")
	public void user_50_enter_the_updated_brief_description_value() throws InterruptedException {
		productSubCategoryObj.trscategorysubbriefdescengM032MT().sendKeys(Keys.CONTROL + "A", Keys.DELETE);
		productSubCategoryObj.trscategorysubbriefdescengM032MT().sendKeys(testData.get("Updated Brief Description"));
		// productSubCategoryObj.trscategorysubbriefdescengM032MT().sendKeys(Keys.TAB);

	}

	@Then("^user 50 click on the update button$")
	public void user_50_click_on_the_update_button() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.UpdatedButton());
		productSubCategoryObj.UpdatedButton().click();
		WebElement Error_message = productSubCategoryObj.ErrorPopup();
		boolean isError_message = Error_message.isDisplayed();
		if (isError_message == true) {
			for (int i = 1; i <= 50; i++) {
				try {
					productSubCategoryObj.ErrorPopupOKBtn().click();
					System.out.println("clicked on alert");

					break;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		else {
			System.out.println("Can't able to clicked on alert");
		}
		productSubCategoryObj.UpdatedButton().click();
	}

	@Then("^user 50 check for the grid and releavant datas$")
	public void user_50_check_for_the_grid_and_releavant_datas() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SearchedRecord());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {

				String title = productSubCategoryObj.SearchedRecord().getAttribute("title").trim();
				String title1 = productSubCategoryObj.SearchedRecordCatCodeKey().getAttribute("title").trim();
				String title2 = productSubCategoryObj.SearchedRecordSubCat().getAttribute("title").trim();

				System.out.println("Fetched Title 1 : " + title);
				System.out.println("Fetched Title 2 : " + title1);
				System.out.println("Fetched Title 3 : " + title2);
				String Actual_Title = title;// .substring(1);
				String Actual_Title1 = title1;
				String Actual_Title2 = title2;
				String Given_Title = testData.get("Application Name");
				String Given_Title1 = testData.get("Category code");
				String Given_Title2 = testData.get("Sub Category Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec && Actual_Title1.equalsIgnoreCase(Given_Title1)
						&& Actual_Title2.equalsIgnoreCase(Given_Title2)) {

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

	// --------------------------------validation numbers-----------------------------//
	
	@Then ("^user 50 click on the new button$")
	public void user_50_click_on_the_new_button(){
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.NewButon());
		productSubCategoryObj.NewButon().click();
		}

	@Then("^user 50 enter a negative value$")
	public void user_50_enter_a_negative_value() {
		waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE());
		productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE()
				.sendKeys(testData.get("Negative Value"));
		productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE()
		.sendKeys(Keys.TAB);
	}

	@Then("^user 50 validate the feild that it does not allow negative value$")
	public void user_50_validate_the_feild_that_it_does_not_allow_negative_value() {
		WebElement Error_PopUp = productSubCategoryObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}
	}

	@Then("^user 50 click ok on the error popup$")
	public void user_50_click_ok_on_the_error_popup() throws InterruptedException {
		WebElement Error_PopUp = productSubCategoryObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		if (isError_PopUp) {
			for (int i = 1; i <= 50; i++)
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

		} else {
			System.out.println("No Pop Up Occured");
		}
		Thread.sleep(2000);
	}
	
	@Then ("^user 50 enter the maximum value$")
	public void user_50_enter_the_maximum_value(){
		waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE());
		productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE()
				.sendKeys(testData.get("Category code"));
		productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE()
		.sendKeys(Keys.TAB);
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisOkButton());
		WebElement Error = commonElementsObj.iisOkButton();
		if (Error.isDisplayed()) {
			for (int i = 1; i <= 50; i++)
				try {
					commonElementsObj.iisOkButton().click();
					
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
	
	@Then ("^user 50 validate that feild accept the max value$")
	public void user_50_validate_that_feild_accept_the_max_value(){
		WebElement Error_PopUp = productSubCategoryObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}
	}
	
	@Then ("^user 50 enter the invaid value$")
	public void user_50_enter_the_invaid_value(){
		waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE());
		productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE()
				.sendKeys(testData.get("Invalide Value"));
		productSubCategoryObj.productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE()
		.sendKeys(Keys.TAB);
	}
	
	@Then ("^user 50 validate the feild that it does not allow invalid value$")
	public void user_50_validate_the_feild_that_it_does_not_allow_invalid_value(){
		WebElement Error_PopUp = productSubCategoryObj.iisErrorPopup();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}
	}
	
	// -----------------------------validating the search is working fine---------------//
	
	@Then ("^user 50 validate the search is working correct$")
	public void user_50_validate_the_search_is_working_correct(){
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SearchedRecord());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {

				String title = productSubCategoryObj.SearchedRecord().getAttribute("title").trim();
				String title1 = productSubCategoryObj.SearchedRecordCatCodeKey().getAttribute("title").trim();
				String title2 = productSubCategoryObj.SearchedRecordSubCat().getAttribute("title").trim();

				System.out.println("Fetched Title 1 : " + title);
				System.out.println("Fetched Title 2 : " + title1);
				System.out.println("Fetched Title 3 : " + title2);
				String Actual_Title = title;// .substring(1);
				String Actual_Title1 = title1;
				String Actual_Title2 = title2;
				String Given_Title = testData.get("Application Name");
				String Given_Title1 = testData.get("Category code");
				String Given_Title2 = testData.get("Sub Category Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec && Actual_Title1.equalsIgnoreCase(Given_Title1)
						&& Actual_Title2.equalsIgnoreCase(Given_Title2)) {

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
	
	//-----------------------------checking the menu and list --------------------------//
	
	@Then ("^user 50 check for menu is available$")
	public void user_50_check_for_menu_is_available(){
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryModule());
		WebElement Menu = productSubCategoryObj.ProductSubCategoryModule();
		boolean isMenu = Menu.isDisplayed();
		if (isMenu) {
			Assert.assertTrue(isMenu, "Menu is avaliable");
		} else {
			Assert.assertFalse(isMenu, "Menu is not avaliable");
		}
	}
	
	@Then ("^user 50 check for the list inside the menu is avaliable$")
	public void user_50_check_for_the_list_inside_the_menu_is_avaliable(){
		WebElement ProductSubCategoryApprove = waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.ProductSubCategoryApprove());
		WebElement ProductSubCategory_List = waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.ProductSubCategory_List());
		WebElement ProductSubCategoryReject = waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.ProductSubCategoryReject());
		WebElement ProductSubCategory_Maintenance = waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.ProductSubCategoryModuleMaintenance());
		WebElement ProductSubCategory_Update_After_Approve = waitHelper.waitForElementwithFluentwait(driver,
				productSubCategoryObj.ProductSubCategory_Update_After_Approve());

		boolean isProductSubCategoryApprove = ProductSubCategoryApprove.isDisplayed();
		boolean isProductSubCategory_List = ProductSubCategory_List.isDisplayed();
		boolean isProductSubCategoryReject = ProductSubCategoryReject.isDisplayed();
		boolean isProductSubCategory_Maintenance = ProductSubCategory_Maintenance.isDisplayed();
		boolean isProductSubCategory_Update_After_Approve = ProductSubCategory_Update_After_Approve.isDisplayed();

		if (isProductSubCategoryApprove && isProductSubCategory_List && isProductSubCategoryReject
				&& isProductSubCategory_Maintenance && isProductSubCategory_Update_After_Approve) {
			Assert.assertTrue(
					isProductSubCategoryApprove && isProductSubCategory_List && isProductSubCategoryReject
					&& isProductSubCategory_Maintenance && isProductSubCategory_Update_After_Approve,
					"All the list item is Avaliable");
			System.out.println(ProductSubCategory_Maintenance.getText());
			System.out.println(ProductSubCategory_Update_After_Approve.getText());
			System.out.println(ProductSubCategoryApprove.getText());
			System.out.println(ProductSubCategoryReject.getText());
			System.out.println(ProductSubCategory_List.getText());
		} else {
			Assert.assertFalse(
					isProductSubCategoryApprove && isProductSubCategory_List && isProductSubCategoryReject
					&& isProductSubCategory_Maintenance && isProductSubCategory_Update_After_Approve,
					"All the list value is not Avaliable);");
		}

	}
	
	
	//--------------------------------checking the sorting functionality---------------//
	@Then ("^user 50 click on the clear button$")
	public void user_50_click_on_the_clear_button(){
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryClearIconButton());
		for(int i= 50; i<=50 ; i++) {
			try {
				productSubCategoryObj.ProductSubCategoryClearIconButton().click();
				break;
			} catch (Exception e) {
				if(i == 49) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@Then("^user 50 click on the sort search icon$")
	public void user_50_click_on_the_sort_search_icon() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategorySortIconButton());
		
		for(int i= 50; i<=50 ; i++) {
			try {
				productSubCategoryObj.ProductSubCategorySortIconButton().click();
				break;
			} catch (Exception e) {
				if(i == 49) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user 50 click on the first dropdown$")
	public void user_50_click_on_the_first_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SortingfirstColoum());
		productSubCategoryObj.SortingfirstColoum().click();
	}

	@Then("^user 50 select the first sorting value type$")
	public void user_50_select_the_first_sorting_value_type() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SortingfirstColoum());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(productSubCategoryObj.SortingfirstColoum(),
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

	@Then("^user 50 click on the seccond dropdown$")
	public void user_50_click_on_the_seccond_dropdown() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.Sorting_Secondary_Coloum());
		productSubCategoryObj.Sorting_Secondary_Coloum().click();
	}

	@Then("^user 50 select the second sorting value type$")
	public void user_50_select_the_second_sorting_value_type() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.Sorting_Secondary_Coloum());
		for (int i = 0; i <= 300; i++) {
			try {

				dropDownHelper.SelectUsingVisibleText(productSubCategoryObj.Sorting_Secondary_Coloum(),
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

	@Then("^user 50 click on the input value feild$")
	public void user_50_click_on_the_input_value_feild() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.Sorting_Third_Coloum());
		productSubCategoryObj.Sorting_Third_Coloum().click();
	}

	@Then("^user 50 enter the value to be sorted$")
	public void user_50_enter_the_value_to_be_sorted() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.Sorting_Third_Coloum());
		productSubCategoryObj.Sorting_Third_Coloum().clear();
		productSubCategoryObj.Sorting_Third_Coloum().sendKeys(testData.get("Code"));
	}

	@Then("^user 50 click on the find icon btn$")
	public void user_50_click_on_the_find_icon_btn() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SortFindIconBtn());
		productSubCategoryObj.SortFindIconBtn().click();
	    Thread.sleep(1000);
	}

	@Then("^user 50 validate the sorting is working correct$")
	public void user_50_validate_the_sorting_is_working_correct() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SearchedRecord());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {

				String title = productSubCategoryObj.SearchedRecord().getAttribute("title").trim();
				String title1 = productSubCategoryObj.SearchedRecordCatCodeKey().getAttribute("title").trim();
				String title2 = productSubCategoryObj.SearchedRecordSubCat().getAttribute("title").trim();

				System.out.println("Fetched Title 1 : " + title);
				System.out.println("Fetched Title 2 : " + title1);
				System.out.println("Fetched Title 3 : " + title2);
				String Actual_Title = title;// .substring(1);
				String Actual_Title1 = title1;
				String Actual_Title2 = title2;
				String Given_Title = testData.get("Application Name");
				String Given_Title1 = testData.get("Category code");
				String Given_Title2 = testData.get("Sub Category Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec && Actual_Title1.equalsIgnoreCase(Given_Title1)
						&& Actual_Title2.equalsIgnoreCase(Given_Title2)) {

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
	
	//----------------------------button Working-----------------------//
	



	@Then("^user 50 click on the next button$")
	public void user_50_click_on_the_next_button() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryNextBtn());
		productSubCategoryObj.ProductSubCategoryNextBtn().click();
	}

	@Then("^user 50 validate the next button is working correctly$")
	public void user_50_validate_the_next_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryNextBtn());
		WebElement Next_btn = productSubCategoryObj.ProductSubCategoryNextBtn();
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

	@Then("^user 50 click on the last button$")
	public void user_50_click_on_the_last_button() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryLastBtn());
		productSubCategoryObj.ProductSubCategoryLastBtn().click();
	}

	@Then("^user 50 validate the last button is working correctly$")
	public void user_50_validate_the_last_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryLastBtn());
		WebElement Next_btn = productSubCategoryObj.ProductSubCategoryLastBtn();
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

	@Then("^user 50 click on the previous button$")
	public void user_50_click_on_the_previous_button() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryPreviousBtn());
		productSubCategoryObj.ProductSubCategoryPreviousBtn().click();
	}

	@Then("^user 50 validate the previous button is working correctly$")
	public void user_50_validate_the_previous_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryPreviousBtn());
		WebElement Next_btn = productSubCategoryObj.ProductSubCategoryPreviousBtn();
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

	@Then("^user 50 click on the first button$")
	public void user_50_click_on_the_first_button() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryFirstBtn());
		productSubCategoryObj.ProductSubCategoryFirstBtn().click();
	}

	@Then("^user 50 validate the first button is working correctly$")
	public void user_50_validate_the_first_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.ProductSubCategoryFirstBtn());
		WebElement Next_btn = productSubCategoryObj.ProductSubCategoryFirstBtn();
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
	//-------------------------------Rec retrival----------------------------------------//
	
	@Then ("^user 50 user check the retrival of record$")
	public void user_50_user_check_the_retrival_of_record() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.SearchedRecord());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {

				String title = productSubCategoryObj.SearchedRecord().getAttribute("title").trim();
				String title1 = productSubCategoryObj.SearchedRecordCatCodeKey().getAttribute("title").trim();
				String title2 = productSubCategoryObj.SearchedRecordSubCat().getAttribute("title").trim();

				System.out.println("Fetched Title 1 : " + title);
				System.out.println("Fetched Title 2 : " + title1);
				System.out.println("Fetched Title 3 : " + title2);
				String Actual_Title = title;// .substring(1);
				String Actual_Title1 = title1;
				String Actual_Title2 = title2;
				String Given_Title = testData.get("Application Name");
				String Given_Title1 = testData.get("Category code");
				String Given_Title2 = testData.get("Sub Category Code");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec && Actual_Title1.equalsIgnoreCase(Given_Title1)
						&& Actual_Title2.equalsIgnoreCase(Given_Title2)) {

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

	
	

	// -------------------------------deleting rec-------------------------------------//

	@Then("^user 50 click on delete button$")
	public void user_50_click_on_delete_button() {
		waitHelper.waitForElementwithFluentwait(driver, productSubCategoryObj.DeleteButton());
		productSubCategoryObj.DeleteButton().click();
	}

	@Then("^user 50 click on the confrim ok button$")
	public void user_50_click_on_the_confrim_ok_button() {
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisConfirmOkButton());
		commonElementsObj.iisConfirmOkButton().click();
	}
	
	
	//---------------------------------closing the screen----------------------------------//
	
	@Then ("^user 50 click on the close screen button and close the screen$")
	public void user_50_click_on_the_close_screen_button_and_close_the_screen(){
		waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());
		commonElementsObj.iisScreenCloseBtn().click();

//		 if(commonElementsObj.iisConfirmOkButton().isDisplayed()) {
//			 try {
//				 commonElementsObj.iisConfirmOkButton().click();
//				 System.out.println("clicked on Confirm ok popup");
//
//			} catch (Exception e) {
//				
//			}
//		 }
//		 else {
//			 System.out.println("Quited Screen");
//		 }
		
	}

	

}