package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Application_for_Financial_FacilityObj;
import resources.BaseClass;

public class Application_for_Financial_Facility {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Application_for_Financial_FacilityObj applicationFinancialObj = new Application_for_Financial_FacilityObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path, "WIFAK_Application_TestData", "Data Set ID");
	Map<String, String> testData;
	
	
	@And("^User update test data for test case no 539219$")
	public void User_update_test_data_for_test_case_no_539219() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("AT_FM_017");
	}
	
	@Given("^User update test data for test case no 929306$")
	public void User_update_test_data_for_test_case_no_929306() {
		testData = fmsTransactionsExcelData.getTestdata("AT_AFF_007");
	}
	
	@Given("User update test data for test case no 583228")
	public void user_update_test_data_for_test_case_no_583228() {
		testData = fmsTransactionsExcelData.getTestdata("AT_RF_113");
	}
	
	@Given("User update test data for test case no 636898")
	public void user_update_test_data_for_test_case_no_636898() {
		testData = fmsTransactionsExcelData.getTestdata("AT_RF_055");
	}
	
	@Given("User update test data for test case no 824257")
	public void user_update_test_data_for_test_case_no_824257() {
		testData = fmsTransactionsExcelData.getTestdata("AT_FM_107");
	}
	
	@Given("User update test data for test case no 349582")
	public void user_update_test_data_for_test_case_no_349582() {
		testData = fmsTransactionsExcelData.getTestdata("AT_FM_108");
	}
	
//	@Given("User update test data for test case no 570417")
//	public void user_update_test_data_for_test_case_no_570417() {
//		testData = fmsTransactionsExcelData.getTestdata("AT_FM_023");
//	}
	
	@Given("User update test data for test case no 1038989")
	public void user_update_test_data_for_test_case_no_1038989() {
		testData = fmsTransactionsExcelData.getTestdata("AT_DDR_076");
	}
	
	@Given("User update test data for test case no 1039017")
	public void user_update_test_data_for_test_case_no_1039017() {
		testData = fmsTransactionsExcelData.getTestdata("AT_DDR_077");
	}

	@Given("User update test data for test case no 1039018")
	public void user_update_test_data_for_test_case_no_1039018() {
		testData = fmsTransactionsExcelData.getTestdata("AT_DDR_078");
	}
	
	


	
	@Given("^navigate to FMS application2 and login with valid credentials$")
	public void navigate_to_fms_application2_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		login.loginIntoFmsApplication(configFileReader.getFMSApplicationUserType());
	}

	@And("^Click Wifak Application first$")
	public void click_wifak_application_first() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getScrollinto_CorporateJk());
		JavascriptHelper.scrollIntoView(applicationFinancialObj.getScrollinto_CorporateJk());
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getWifak_Application_first());
		applicationFinancialObj.getWifak_Application_first().click();
	}

	@And("^Click Wifak Application Second$")
	public void click_wifak_application_second() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getWifak_Application_second());
		applicationFinancialObj.getWifak_Application_second().click();
		
	}

	@And("^Click Application for financial facilities$")
	public void click_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.getApplication_for_financial_facilities());
		applicationFinancialObj.getApplication_for_financial_facilities().click();
	}

	@And("^Click Maintenance$")
	public void click_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getMaintenance());
		//Thread.sleep(10000);
		applicationFinancialObj.getMaintenance().click();
	}

	@And("^User update test data for test case no 949677$")
	public void user_update_test_data_for_test_case_no_949677() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("AT_AFF_012");
	}

	@And("^Click and Select Application for$")
	public void click_and_select_application_for() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getApplication_for());
//		DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.getApplication_for(), "New Facility");
		//Thread.sleep(10000);
		DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.getApplication_for(),
				testData.get("Application For"));
	}

	@And("^Search CIF No$")
	public void search_cif_no() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getCIF_no());
		//clicksAndActionsHelper.moveToElement(applicationFinancialObj.getCIF_no());
//		applicationFinancialObj.getCIF_no().sendKeys("727");
		
		for (int i = 0; i <= 300; i++) {
			try {
				applicationFinancialObj.getCIF_no().click();
				//applicationFinancialObj.getCIF_no().sendKeys("727");
				applicationFinancialObj.getCIF_no().sendKeys(testData.get("CIF No"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Enter codeOn Facility Type$")
	public void enter_facility_type_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_codeOn_Facility_Type());
		applicationFinancialObj.getEnter_codeOn_Facility_Type().click();
		//applicationFinancialObj.getEnter_codeOn_Facility_Type().sendKeys("369");
		applicationFinancialObj.getEnter_codeOn_Facility_Type().sendKeys(testData.get("Facility Type"));
		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_codeOn_Facility_Type().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter Code In Country of Financing$")
	public void enter_code_in_country_of_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnterCodeIn_Country_of_Financing());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnterCodeIn_Country_of_Financing());
		applicationFinancialObj.getEnterCodeIn_Country_of_Financing().click();
		//applicationFinancialObj.getEnterCodeIn_Country_of_Financing().sendKeys("320");
		applicationFinancialObj.getEnterCodeIn_Country_of_Financing().sendKeys(testData.get("Country of Financing"));
		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnterCodeIn_Country_of_Financing().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter line Code On Facility Rating$")
	public void enter_line_code_on_facility_rating() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_lineCodeOn_Facility_Rating());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnter_lineCodeOn_Facility_Rating());
		applicationFinancialObj.getEnter_lineCodeOn_Facility_Rating().click();
		// applicationFinancialObj.getEnter_lineCodeOn_Facility_Rating().sendKeys("2");
		applicationFinancialObj.getEnter_lineCodeOn_Facility_Rating().sendKeys(testData.get("Facility Rating"));
		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_lineCodeOn_Facility_Rating().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Click on additional Details$")
	public void click_on_additional_details() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(applicationFinancialObj.getClickon_additionalDetails(),
						applicationFinancialObj.getClickon_additionalDetails());
				JavascriptHelper.JSEClick(applicationFinancialObj.getClickon_additionalDetails());
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Enter the Total Value$")
	public void enter_the_total_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_TotalValue());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnter_TotalValue());
		// applicationFinancialObj.getEnter_TotalValue().sendKeys("21000");
		applicationFinancialObj.getEnter_TotalValue().sendKeys(testData.get("Total Value"));
	}

	@And("^Click Offer Expiration SelectDate$")
	public void click_offer_expiration_selectdate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getClick_Offer_Expiration_SelectDate());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getClick_Offer_Expiration_SelectDate());
		applicationFinancialObj.getClick_Offer_Expiration_SelectDate().click();
		// applicationFinancialObj.getClick_Offer_Expiration_SelectDate().sendKeys("25/05/2023");
		applicationFinancialObj.getClick_Offer_Expiration_SelectDate().sendKeys(testData.get("Expire Date"));
		applicationFinancialObj.getClick_Offer_Expiration_SelectDate().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getClick_Offer_Expiration_SelectDate().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Select limit Details$")
	public void select_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getSelect_limitDetails());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getSelect_limitDetails());
		applicationFinancialObj.getSelect_limitDetails().click();
	}

	@And("^Click Add button on limit Detail$")
	public void click_add_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getClick_AddButtonon_limit_Detail());

		for (int i = 0; i < 200; i++) {
			try {
				applicationFinancialObj.getClick_AddButtonon_limit_Detail().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Enter ValueOn Product Class$")
	public void enter_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_ValueOn_Product_Class());
		 applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys("1");
		//applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys(testData.get("Product Class"));
		applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys(Keys.TAB);
		 for (int i = 0; i <= 300; i++) {
				if (!(applicationFinancialObj.getEnter_ValueOn_Product_Class().getAttribute("prevvalue").isBlank())) {
					break;
				}
			}
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsNewRecordCleanFlag());
	        WebElement cleanFlag = applicationFinancialObj.limitDetailsNewRecordCleanFlag();
	        try {
	        	if(!(cleanFlag.isSelected())) {
		            cleanFlag.click();
		        }
			} catch (Exception e) {
			}
	        

	}

	@And("^AfterEnter ValueOn Product Class Search$")
	public void afterenter_valueon_product_class_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.getAfterEnter_ValueOn_Product_Class_Search());
		applicationFinancialObj.getAfterEnter_ValueOn_Product_Class_Search().click();

	}

	@And("^Click Add button AfterEnter Value On Product Class$")
	public void click_add_button_afterenter_value_on_product_class() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper
						.scrollIntoView(applicationFinancialObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd());
				clicksAndActionsHelper
						.moveToElement(applicationFinancialObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd());
				applicationFinancialObj.getClickAdd_Button_AfterEnter_ValueOn_Product_Class().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
		try {
			for (int i = 0; i < 200; i++) {
				if(applicationFinancialObj.ServerLoding_pop().isDisplayed()) {
					applicationFinancialObj.ServerLoding_pop().click();
					waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getClickAdd_Button_AfterEnter_ValueOn_Product_Class());
					applicationFinancialObj.getClickAdd_Button_AfterEnter_ValueOn_Product_Class().click();
					break;
				}
			}
		} catch (Exception e) {
			
		}
		
		

	}

	@And("^Click FixedAssert button$")
	public void click_fixedassert_button() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(applicationFinancialObj.getClick_FixedAssert_Button());
				applicationFinancialObj.getClick_FixedAssert_Button().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Click AddButton OnFixedAssert screen$")
	public void click_addbutton_onfixedassert_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.getClick_AddButton_OnFixedAssert_screen());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getClick_AddButton_OnFixedAssert_screen());
		applicationFinancialObj.getClick_AddButton_OnFixedAssert_screen().click();
	}

	@And("^Enter value on Catagory$")
	public void enter_value_on_catagory() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.clickEnter_value_on_Catagory());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.clickEnter_value_on_Catagory());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.clickEnter_value_on_Catagory());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getEnter_value_on_Catagory().click();
				//applicationFinancialObj.getEnter_value_on_Catagory().sendKeys("1");
				applicationFinancialObj.getEnter_value_on_Catagory().sendKeys(testData.get("Category"));
				applicationFinancialObj.AfterEnter_value_on_Catagory_Search().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_value_on_Catagory().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on Class$")
	public void enter_value_on_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_value_on_Class());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnter_value_on_Class());

		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getEnter_value_on_Class().click();
				//applicationFinancialObj.getEnter_value_on_Class().sendKeys("1234");
				applicationFinancialObj.getEnter_value_on_Class().sendKeys(testData.get("Class"));
				applicationFinancialObj.AfterEnter_value_on_Class_Search().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_value_on_Class().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on vendor$")
	public void enter_value_on_vendor() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_value_on_vendor());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnter_value_on_vendor());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getEnter_value_on_vendor().click();
				//applicationFinancialObj.getEnter_value_on_vendor().sendKeys("1");
				applicationFinancialObj.getEnter_value_on_vendor().sendKeys(testData.get("Vendor"));
				applicationFinancialObj.getEnter_value_on_vendor().sendKeys(Keys.TAB);
				//applicationFinancialObj.AfterEnter_value_on_vendor_search().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_value_on_vendor().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on quantity$")
	public void enter_value_on_quantity() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_value_on_quantity());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnter_value_on_quantity());

		for (int i = 0; i < 300; i++) {
			try {
				//applicationFinancialObj.getEnter_value_on_quantity().sendKeys("11");
				applicationFinancialObj.getEnter_value_on_quantity().sendKeys(testData.get("Quantity"));

				applicationFinancialObj.getEnter_value_on_quantity().click();

				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_value_on_vendor().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on Unit$")
	public void enter_value_on_unit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_value_on_Unit());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnter_value_on_Unit());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getEnter_value_on_Unit().click();
				//applicationFinancialObj.getEnter_value_on_Unit().sendKeys("11");
				applicationFinancialObj.getEnter_value_on_Unit().sendKeys(testData.get("Unit"));


				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_value_on_Unit().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on Cy$")
	public void enter_value_on_cy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_value_on_Cy());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnter_value_on_Cy());

		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getEnter_value_on_Cy().click();
				//applicationFinancialObj.getEnter_value_on_Cy().sendKeys("999");
				applicationFinancialObj.getEnter_value_on_Cy().sendKeys(testData.get("Cy"));
				applicationFinancialObj.getEnter_value_on_Cy().sendKeys(Keys.TAB);
			//	applicationFinancialObj.AfterEnter_value_on_vendor_search().click();

				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_value_on_Cy().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on UnitCost$")
	public void enter_value_on_unitcost() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_value_on_UnitCost());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getEnter_value_on_UnitCost());

		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getEnter_value_on_UnitCost().click();
				//applicationFinancialObj.getEnter_value_on_UnitCost().sendKeys("11");
				applicationFinancialObj.getEnter_value_on_UnitCost().sendKeys(testData.get("UnitCost"));
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			if (!(applicationFinancialObj.getEnter_value_on_UnitCost().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Click OkButton On Fixed AssertKey Screen$")
	public void click_okbutton_on_fixed_assertkey_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.getClick_OkButton_OnFixedAssertKey_Screen());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getClick_OkButton_OnFixedAssertKey_Screen());

		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getClick_OkButton_OnFixedAssertKey_Screen().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.Click_OkButton_Warrning_Screen_ForLessAmmount());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.Click_OkButton_Warrning_Screen_ForLessAmmount());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.Click_OkButton_Warrning_Screen_ForLessAmmount().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Click Save button on limit details tab$")
	public void click_save_button_on_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.getClick_SaveButton_OnLimitDetails_Tab());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getClick_SaveButton_OnLimitDetails_Tab());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getClick_SaveButton_OnLimitDetails_Tab().click();

				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Click Ok saveOn Draft WarrningScreen$")
	public void click_ok_saveon_draft_warrningscreen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.getClickOk_saveOn_Draft_WarrningScreen());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getClickOk_saveOn_Draft_WarrningScreen());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getClickOk_saveOn_Draft_WarrningScreen().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^Click Ok OnSuccess Screen$")
	public void click_ok_onsuccess_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.SuccessScreen_Validate());
		Assert.assertTrue(applicationFinancialObj.SuccessScreen_Validate().isDisplayed());
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getClickOk_OnSuccess_Screen());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.getClickOk_OnSuccess_Screen());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.getClickOk_OnSuccess_Screen().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//*** @917005
	@And("^User update test data for test case no 917005$")
	public void user_update_test_data_for_test_case_no_917005() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("AT_AFF_017");
	}

	@And("^Go to mainInformation Screen$")
	public void go_to_maininformation_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.goto_MainInformation_Tab());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.goto_MainInformation_Tab());
		applicationFinancialObj.goto_MainInformation_Tab().click();
	}

	@Then("^Check edit rating field editable$")
	public void check_edit_rating_field_editable() throws Throwable {
		try {
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ClickOn_CreditRating());
			clicksAndActionsHelper.moveToElement(applicationFinancialObj.ClickOn_CreditRating());
			applicationFinancialObj.ClickOn_CreditRating().sendKeys("171");

		} catch (Exception e) {
			Assert.fail(("filed is not editable"));
		}
	}

	// *** @817662
	@And("^User update test data for test case no 817662$")
	public void user_update_test_data_for_test_case_no_817662() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("AT_AFF_022");
	}

	@And("^Click Document checklist$")
	public void click_document_checklist() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ClickOn_Document_Checklist());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.ClickOn_Document_Checklist());
		applicationFinancialObj.ClickOn_Document_Checklist().click();
	}

	@And("^Click for select the row$")
	public void click_for_select_the_row() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.Click_forSelect_row_on_Document_Checklist());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.Click_forSelect_row_on_Document_Checklist());

		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialObj.Click_forSelect_row_on_Document_Checklist().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Scroll down to upload file$")
	public void scroll_down_to_upload_file() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.In_Document_Checklist_Click_Choose_File());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.In_Document_Checklist_Click_Choose_File());
		JavascriptHelper.scrollIntoView(applicationFinancialObj.In_Document_Checklist_Click_Choose_File());
	}

	@And("^Click Choose file button and upload file$")
	public void click_choose_file_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.In_Document_Checklist_Click_Choose_File());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.In_Document_Checklist_Click_Choose_File());

		String file = "C:\\Users\\inindc00607\\Desktop\\sample.xlsx";

		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.In_Document_Checklist_Click_Choose_File());
		applicationFinancialObj.In_Document_Checklist_Click_Choose_File().sendKeys(file);

	}

	@And("^Click Upload Docs button$")
	public void click_upload_docs_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.In_Document_Checklist_Click_UploadDocs());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.In_Document_Checklist_Click_UploadDocs());
		applicationFinancialObj.In_Document_Checklist_Click_UploadDocs().click();

	}
//	  @Then("^Click ok Sucess screen after docUpload$")
//	    public void click_ok_sucess_screen_after_docupload() throws Throwable {
//		  waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_ok_Sucess_screen_after_docUpload());
//			clicksAndActionsHelper.moveToElement(applicationFinancialObj.Click_ok_Sucess_screen_after_docUpload());
//	    }

//****127787	

	@Given("^navigate to FMS param application and login with valid credentials2$")
	public void navigate_to_fms_param_application_and_login_with_valid_credentials2() throws Throwable {
		driver.get(configFileReader.getFMSparamsUrl());
		login.loginIntoFmsParamApplication2(configFileReader.getFMSParamApplicationUserType());
	}
	@Given("User update test data for test case no 127787")
	public void And_User_update_test_data_for_test_case_no_127787() {
		testData = fmsTransactionsExcelData.getTestdata("AT_AFF_060");
	}

	@And("^Click on the Parameters menu$")
	public void click_on_the_parameters_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Fms_ParametersMenu());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.Fms_ParametersMenu());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.Fms_ParametersMenu());
		// applicationFinancialObj.Fms_Parameters().click();
	}

	@Then("^Click on the Facility Type submenu$")
	public void click_on_the_facility_type_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Parameters_FacilityType());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.Parameters_FacilityType());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.Parameters_FacilityType());
	}

	@Then("^Search for the Code in Update After Approve screen$")
	public void search_for_the_code_in_update_after_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		//applicationFinancialObj.FacilityType_UpdateAfterApprove_Code().sendKeys("221");
		applicationFinancialObj.FacilityType_UpdateAfterApprove_Code().sendKeys(testData.get("Update After Approve Code"));
		applicationFinancialObj.FacilityType_UpdateAfterApprove_Code().sendKeys(Keys.ENTER);
	}

	@Then("^Click the Facility Details tab in update after approve screen$")
	public void click_the_facility_details_tab_in_update_after_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionsHelper
				.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
	}

	@And("^Click on the Update After Approve screen$")
	public void click_on_the_update_after_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
	}

	@And("^Click the Code in Update After Approve screen$")
	public void click_the_code_in_update_after_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
		// clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
		clicksAndActionsHelper.doubleClick(applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
	}

	@And("^Click on the Application Requirements and Details in Facility Details tab$")
	public void click_on_the_application_requirements_and_details_in_facility_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ScrolltoUpdate());
		JavascriptHelper.scrollIntoView(applicationFinancialObj.ScrolltoUpdate());
	}

	@Then("^Check the Apply Corporate Package is displayed$")
	public void check_the_apply_corporate_package_are_displayed() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage());
		// clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage());
		try {
			if (applicationFinancialObj
					.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage()
					.isEnabled()) {
				System.out.println("ApplyCorporatePackage is enabled");
			}
		} catch (Exception e) {
			System.out.println("error while clicking ApplyCorporatePackage");
		}
		Thread.sleep(3000);
	}

	@Then("^Check the Allow to edit Corporate Package Rate is displayed$")
	public void check_the_allow_to_edit_corporate_package_rate_csm_are_displayed() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate());
		// clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate());

		try {
			if (applicationFinancialObj
					.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate()
					.isEnabled()) {
				System.out.println("ApplyCorporatePackage is enabled");
			}
		} catch (Exception e) {
			System.out.println("error while clicking ApplyCorporatePackageRate");
		}
		Thread.sleep(3000);
	}

	@And("^Check the Allow to Edit @ Application is displayed$")
	public void check_the_allow_to_edit_application_are_displayed() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj
				.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication());
		// clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication());

		try {
			if (applicationFinancialObj
					.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication()
					.isEnabled()) {
				System.out.println("ApplyCorporatePackage is enabled");
			}
		} catch (Exception e) {
			System.out.println("error while clicking AllowtoEditApplication");
		}
		Thread.sleep(3000);
	}

	// ***299886
	
	
	
	
	
	
	
	
	
	
	
	
	
	@And("User update test data for test case no 299886")
	public void User_update_test_data_for_test_case_no_299886() {
		testData = fmsTransactionsExcelData.getTestdata("AT_AFF_022");
		
	}
	
	@And("^In AdditionalDetails enter value On  downPayment more than total value and check$")
	public void in_additionaldetails_enter_value_on_downpayment_more_than_total_value_and_check() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails());
		applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails().click();
	//	applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails().sendKeys("100");
		applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails().sendKeys(testData.get("Down Payment High"));
		applicationFinancialObj.clickOut_after_enterValueOn_down_payment().click();
		if (!applicationFinancialObj.down_payment_popup().isDisplayed()) {

		}
	}

	@Then("^In AdditionalDetails enter value On  downPayment less than total value and check$")
	public void in_additionaldetails_enter_value_on_downpayment_less_than_total_value_and_check() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails());

		clicksAndActionsHelper.doubleClick(applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails());
		applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails().sendKeys(Keys.DELETE);

		//applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails().sendKeys("10000");
		applicationFinancialObj.enter_valueOn_downPayment_inAdditionalDetails().sendKeys("Down Payment Less");
		
		applicationFinancialObj.clickOut_after_enterValueOn_down_payment().click();
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.down_payment_popup());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.down_payment_popup());
		Assert.assertEquals(true, applicationFinancialObj.down_payment_popup().isDisplayed());
	}
	
	
	
	/////@929306
	@Given("User update test data for test case no 929306")
	public void user_update_test_data_for_test_case_no_929306() {
		testData = fmsTransactionsExcelData.getTestdata("AT_AFF_007");
	}

	
//	@Given("^navigate to FMS param application and login with valid credentials$")
//    public void navigate to FMS param application and login with valid credentials() throws Throwable {
//		driver.get(configFileReader.getFMSparamsUrl());
//		FMSLogin.loginIntoFmsParamApplication2(configFileReader.getFMSParamApplicationUserType());
//    }
//
//	@Given("^navigate to FMS application and login with valid credentials2$")
//	public void navigate_to_fms_application_and_login_with_valid_credentials2() throws Throwable {
//		driver.get(configFileReader.getFMSApplicationUrl());
//		FMSLogin.loginIntoFmsApplication2(configFileReader.getFMSApplicationUserType());;
//	}
//	@And("^Click on the Parameters menu$")
//	public void click_on_the_parameters_menu1() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Fms_ParametersMenu());
//		clicksAndActionsHelper.moveToElement(applicationFinancialObj.Fms_ParametersMenu());
//		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.Fms_ParametersMenu());
		//applicationFinancialObj.Fms_Parameters().click();

	//}
//	  @And("^Click on the parameters menu$")
//	    public void click_on_the_parameters_menu() throws Throwable {
//	       
//	    }
	
	@Then("^Click on the facility type under parameters menu$")
	public void click_on_the_facility_type_under_parameters_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Submenu());
//		clicksAndActionsHelper.moveToElement(applicationFinancialObj.FacilityType_Submenu());
//		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_Submenu());
		applicationFinancialObj.FacilityType_Submenu().click();
	}
	@And("^Click on update after approve under facility type$")
	public void click_on_update_after_approve_under_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
	}

	@Then("^search for the reference code in update after approve$")
	public void search_for_the_reference_code_in_update_after_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Code());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.FacilityType_Code());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_Code());
		applicationFinancialObj.FacilityType_Code().sendKeys("369");
		applicationFinancialObj.FacilityType_Code().sendKeys(Keys.ENTER);
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.DoubleClick_aftersearchCode_Onupdateafterapprove_on_params());
		clicksAndActionsHelper.doubleClick(applicationFinancialObj.DoubleClick_aftersearchCode_Onupdateafterapprove_on_params());
		
	}
	

	@Then("^Click on the Facility Details$")
	public void click_on_the_facility_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Facilitydetails());
		clicksAndActionsHelper.moveToElement(applicationFinancialObj.FacilityType_Facilitydetails());
		clicksAndActionsHelper.clickOnElement(applicationFinancialObj.FacilityType_Facilitydetails());
	}
	@And("^Click on the STP Facility Requirements$")
    public void click_on_the_stp_facility_requirements() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_STP_Facility_Requirements_under_facilityDetails());
		 applicationFinancialObj.Click_STP_Facility_Requirements_under_facilityDetails().click();
    }


	 @And("^Enter first Value On Product Class$")
	    public void enter_first_value_on_product_class() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_ValueOn_Product_Class());
		 applicationFinancialObj.getEnter_ValueOn_Product_Class().click();
		// applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys("1");
		 applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys(testData.get("Product Class 1"));
			applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys(Keys.TAB);
		 for (int i = 0; i <= 300; i++) {
				if (!(applicationFinancialObj.getEnter_ValueOn_Product_Class().getAttribute("prevvalue").isBlank())) {
					break;
				}
			}
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsNewRecordCleanFlag());
	        WebElement cleanFlag = applicationFinancialObj.limitDetailsNewRecordCleanFlag();
	        if(!(cleanFlag.isSelected())) {
	            cleanFlag.click();
	        }
		 
	    }


	    @And("^Split total value and add on facility value$")
	    public void split_total_value_and_add_on_facility_value() throws Throwable {
			 waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Add_facilityValue_OnLimitDetails());
			 
			 for (int i = 0; i < 300; i++) {
					try {
						applicationFinancialObj.Add_facilityValue_OnLimitDetails().click();
						clicksAndActionsHelper.doubleClick(applicationFinancialObj.Add_facilityValue_OnLimitDetails());
						applicationFinancialObj.Add_facilityValue_OnLimitDetails().sendKeys(Keys.DELETE);
						
					//	 applicationFinancialObj.Add_facilityValue_OnLimitDetails().sendKeys("5000");
						applicationFinancialObj.Add_facilityValue_OnLimitDetails().sendKeys(testData.get("Facility Value"));
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			// applicationFinancialObj.Add_facilityValue_OnLimitDetails().click();
			
	    }

	    @And("^Enter second ValueOn Product Class$")
	    public void enter_second_valueon_product_class() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_ValueOn_Product_Class());
			 applicationFinancialObj.getEnter_ValueOn_Product_Class().click();
			 //applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys("2");
			 applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys(testData.get("Product Class 2"));
			 applicationFinancialObj.getEnter_ValueOn_Product_Class().sendKeys(Keys.TAB);
				waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsNewRecordCleanFlag());
			 for (int i = 0; i <= 300; i++) {
					if (!(applicationFinancialObj.getEnter_ValueOn_Product_Class().getAttribute("prevvalue").isBlank())) {
						break;
					}
				}
			 waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsNewRecordCleanFlag());
			  WebElement cleanFlag = applicationFinancialObj.limitDetailsNewRecordCleanFlag();
		        if(!(cleanFlag.isSelected())) {
		            cleanFlag.click();
		        }
	    }
	    @And("^Enter the floating rate$")
	    public void enter_the_floating_rate() throws Throwable {
	    	//waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.floatingRateSearchbox());
	    	
	    	for (int i = 0; i < 300; i++) {
				try {
					applicationFinancialObj.floatingRateSearchbox().click();
			    	//applicationFinancialObj.floatingRateSearchbox().sendKeys("98");
					applicationFinancialObj.floatingRateSearchbox().sendKeys(testData.get("Floating Rate"));
			    	applicationFinancialObj.floatingRateSearchbox().sendKeys(Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	
	    	for (int i = 0; i <= 300; i++) {
	    		if (!(applicationFinancialObj.floatingRateSearchbox().getAttribute("prevvalue").isBlank())) {
	    		break;
	    		} else if (i == 300) {
	    			Assert.fail("Data Not populated");
	    		}
	   		}     
	    }

	    @And("^Enter the floating rate periodicity$")
	    public void enter_the_floating_rate_periodicity() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.floatingrateperiodicitysearchbox());
	    	//applicationFinancialObj.floatingrateperiodicitysearchbox().sendKeys("2");
	    	applicationFinancialObj.floatingrateperiodicitysearchbox().sendKeys(testData.get("Floating Rate Periodicity"));
	    	applicationFinancialObj.floatingrateperiodicitysearchbox().sendKeys(Keys.TAB);
	        
	    }
	    @Then("^Enter the floating rate periodicity type$")
	    public void enter_the_floating_rate_periodicity_type() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.floatingrateperiodicitytypesearchbox());
	    	//DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.floatingrateperiodicitytypesearchbox(),"Month(s)");
	    	DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.floatingrateperiodicitytypesearchbox(),testData.get("Floating Rate Periodicity Type"));
	    }

	    @And("^Click save button on limit details$")
	    public void click_save_button_on_limit_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_saveButtonOn_Limitdetails());
	    	applicationFinancialObj.Click_saveButtonOn_Limitdetails().click();
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_ok_saveOn_draft());
	    	applicationFinancialObj.Click_ok_saveOn_draft().click();
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_ok_onScuccessWarnning_for_applicationFacility());
	    	applicationFinancialObj.Click_ok_onScuccessWarnning_for_applicationFacility().click();

	    }

	    @And("^After save click validate button$")
	    public void after_save_click_validate_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_ValidateButtonOn_Limitdetails());
	    	applicationFinancialObj.Click_ValidateButtonOn_Limitdetails().click();
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_ok_saveOn_draft());
	    	applicationFinancialObj.Click_ok_saveOn_draft().click();
	    }

	    
	    

	    @And("^User move to the Document details tab$")
	    public void user_move_to_the_document_details_tab() throws Throwable {
	    	Thread.sleep(3000);
	    	//waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.mainDocumentDetailsTab());
	    	
	    	for (int i = 0; i <= 300; i++) {
				try {
					applicationFinancialObj.mainDocumentDetailsTab().click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	
	    }

	    @And("^User enter the Solicitor Name$")
	    public void user_enter_the_solicitor_name() throws Throwable {
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.documentDetailsSolicitorName());
	    	//applicationFinancialObj.documentDetailsSolicitorName().sendKeys("1");;
			applicationFinancialObj.documentDetailsSolicitorName().sendKeys(testData.get("Solicitor Name"));
	    	applicationFinancialObj.documentDetailsSolicitorName().sendKeys(Keys.TAB);
	    	 for (int i = 0; i <= 300; i++) {
					if (!(applicationFinancialObj.documentDetailsSolicitorName().getAttribute("prevvalue").isBlank())) {
						break;
					}
				}
	    }

	    @And("^User enter the Estimator Name$")
	    public void user_enter_the_estimator_name() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.documentDetailsEstimatorName());
	    	//applicationFinancialObj.documentDetailsEstimatorName().sendKeys("1");
			applicationFinancialObj.documentDetailsEstimatorName().sendKeys(testData.get("Estimator Name"));

	    	applicationFinancialObj.documentDetailsEstimatorName().sendKeys(Keys.TAB);
	    	 for (int i = 0; i <= 300; i++) {
					if (!(applicationFinancialObj.documentDetailsSolicitorName().getAttribute("prevvalue").isBlank())) {
						break;
					}
				}
	    	
	    }

	    @And("^User clicks the save button$")
	    public void user_clicks_the_save_button() throws Throwable {
	    	for (int i = 0; i <= 300; i++) {
				try {
					JavascriptHelper.scrollIntoView(applicationFinancialObj.documentDetailsSolicitorName());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsSaveBtn());
	    	applicationFinancialObj.limitDetailsSaveBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonConfirmOk());
	    	applicationFinancialObj.ButtonConfirmOk().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonSuccessOk());
	    	applicationFinancialObj.ButtonSuccessOk().click();
	    }

	    @And("^User clicks the validate button$")
	    public void user_clicks_the_validate_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsValidateBtn());
	    	applicationFinancialObj.limitDetailsValidateBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonConfirmOk());
	    	applicationFinancialObj.ButtonConfirmOk().click();
	    	
	    	// Facility already created popup
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.confirmPopup_610());
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.facilityAlreadyCreatedPopup_610());
			applicationFinancialObj.facilityAlreadyCreatedPopup_610().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
			    	applicationFinancialObj.ButtonSuccessOk().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.sendAlertPopup_610());
			for (int i = 0; i < 2000; i++) {
				try {
					applicationFinancialObj.sendAlertPopup_610().click();
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    
	    }

	    @And("^User clicks the Approve Level1 link$")
	    public void user_clicks_the_approve_level1_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.applicationFinancialFacilityApproveLevel1());
	    	applicationFinancialObj.applicationFinancialFacilityApproveLevel1().click();  	
	    }
	    
	    @And("^User retrive the first data in approve level1$")
	    public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approve1ClearBtn());
	    	applicationFinancialObj.approve1ClearBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel1RetriveData());
	    	clicksAndActionsHelper.doubleClick(applicationFinancialObj.approveLevel1RetriveData());
	    }

	    @And("^User select the level1 devision as approve$")
	    public void user_select_the_level1_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel1SelectDevision());
	    	DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.approveLevel1SelectDevision(), testData.get("Approve1 Decision"));
	    	//DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.approveLevel1SelectDevision(), testData.get("Decision1"));
	    	
	    }

	    @And("^User clicks on the level1 submit button$")
	    public void user_clicks_on_the_level1_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel1SubmitBtn());
	    	applicationFinancialObj.approveLevel1SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonConfirmOk());
	    	applicationFinancialObj.ButtonConfirmOk().click();
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonSuccessOk());
	    	applicationFinancialObj.ButtonSuccessOk().click();
	    	
	    }

	    @And("^User clicks the Approve Level2 link$")
	    public void user_clicks_the_approve_level2_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.applicationFinancialFacilityApproveLevel2());
	    	applicationFinancialObj.applicationFinancialFacilityApproveLevel2().click();
	    }
	    
	    @And("^User retrive the first data in approve level2$")
	    public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approve2ClearBtn());
	    	applicationFinancialObj.approve2ClearBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel2RetriveData());
	    	clicksAndActionsHelper.doubleClick(applicationFinancialObj.approveLevel2RetriveData());
	    }

	    @And("^User select the level2 devision as approve$")
	    public void user_select_the_level2_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel2SelectDevision());
	    //	DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.approveLevel2SelectDevision(), "Approve");
	    	DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.approveLevel2SelectDevision(), testData.get("Approve2 Decision"));
	    }

	    @And("^User clicks on the level2 submit button$")
	    public void user_clicks_on_the_level2_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel2SubmitBtn());
	    	applicationFinancialObj.approveLevel2SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonConfirmOk());
	    	applicationFinancialObj.ButtonConfirmOk().click();
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonSuccessOk());
	    	applicationFinancialObj.ButtonSuccessOk().click();
	    }

	    @And("^User clicks the Approve Level3 link$")
	    public void user_clicks_the_approve_level3_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.applicationFinancialFacilityApproveLevel3());
	    	applicationFinancialObj.applicationFinancialFacilityApproveLevel3().click();
	    }
	    
	    @And("^User retrive the first data in approve level3$")
	    public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approve3ClearBtn());
	    	applicationFinancialObj.approve3ClearBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel3RetriveData());
	    	clicksAndActionsHelper.doubleClick(applicationFinancialObj.approveLevel3RetriveData());
	    }
	    
	    @And("^User select the level3 devision as approve$")
	    public void user_select_the_level3_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel3SelectDevision());
	    //	DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.approveLevel3SelectDevision(), "Approve");
	    	DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.approveLevel3SelectDevision(), testData.get("Approve3 Decision"));
	    
	    }
	    
	    @And("^User clicks on the level3 submit button$")
	    public void user_clicks_on_the_level3_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.approveLevel3SubmitBtn());
	    	applicationFinancialObj.approveLevel3SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonConfirmOk());
	    	applicationFinancialObj.ButtonConfirmOk().click();
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonSuccessOk());
	    	applicationFinancialObj.ButtonSuccessOk().click();
	    	
	    		for (int i = 0; i < 700; i++) {
					try {
						if (applicationFinancialObj.SendAlert_pop().isDisplayed()) {
							applicationFinancialObj.SendAlert_pop().click();
							break;
						}
					} catch (Exception e) {

					}
				}
	    }
	
	
	  //@636898
	
	    @And("^User select the application for dropdown as decrease in main screen$")
	    public void user_select_the_application_for_dropdown_as_decrease_in_main_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.select_decrease_inApplicationFor());
			//DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.select_decrease_inApplicationFor(), testData.get("Application For"));
	    	DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.select_decrease_inApplicationFor(),testData.get("ApplicationFor"));
	    }

	    @And("^User enter the input as Existing Facility Ref in main screen$")
	    public void user_enter_the_input_as_existing_facility_ref_in_main_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.mainExistingFacilityRef());
//	    	applicationFinancialObj.mainExistingFacilityRef().sendKeys(testData.get("Facility Ref"));
	    	applicationFinancialObj.mainExistingFacilityRef().sendKeys(testData.get("Existing Facility Ref"));
	    	applicationFinancialObj.mainExistingFacilityRef().sendKeys(Keys.TAB);
	    	
	    	for(int i = 0; i <= 300; i++) {
	    		try {
					if(!(applicationFinancialObj.mainExistingFacilityRef().getAttribute("readonly").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}    	

	    }
	    
	    @And("^User enter the total value under additional info tab$")
	    public void user_enter_the_total_value_under_additional_info_tab() throws Throwable {    	
	    	// First We get the Finance amount without total amount
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.additionalTabFinanceAmount());
	    	String beforeFinanceAmount = applicationFinancialObj.additionalTabFinanceAmount().getAttribute("prevvalue");
//	    	System.out.println("Before Finance Amount: "+ beforeFinanceAmount);
	    	fmsTransactionsExcelData.updateTestData("DS01_582426", "Finance Amount", beforeFinanceAmount);
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.mainAdditionalTabTotalValue());
			applicationFinancialObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Total value"));
			applicationFinancialObj.mainAdditionalTabTotalValue().sendKeys(Keys.TAB);
			Thread.sleep(3000);
	    }

	    @And("^User validate the finance amount should be decresed based on total value$")
	    public void user_validate_the_finance_amount_should_be_decresed_based_on_total_value() throws Throwable {
	    	testData = fmsTransactionsExcelData.getTestdata("DS01_582426");
	    	String financeAmount = testData.get("Finance Amount");
	    	String totalValue = testData.get("Total value");
	    	
	    	String afterFinanceAmount = applicationFinancialObj.additionalTabFinanceAmount().getAttribute("prevvalue");
	    	String[] splitFinaceAmount  = afterFinanceAmount.split("[.]");
	    	String finalFinaceAmount = splitFinaceAmount[0].replace(",", "");
//	    	System.out.println("Finance Amount: "+finalFinaceAmount);
//	    	System.out.println("After Finance Amount: "+afterFinanceAmount);
	    	
	    	int cvValue = Integer.parseInt(financeAmount)-Integer.parseInt(totalValue);
	    	String cvValueText = String.valueOf(cvValue);
	    	fmsTransactionsExcelData.updateTestData("DS01_582426", "CV Value", cvValueText);
	    	
	    	Assert.assertEquals(cvValueText, finalFinaceAmount);
	    	
	    }

	    @And("^User validate the Facility value and CV value should be changed same as decreased finance amount under limit details$")
	    public void user_validate_the_facility_value_and_cv_value_should_be_changed_same_as_decreased_finance_amount_under_limit_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsProductFacilityValue());
	    	String facilityValue = applicationFinancialObj.limitDetailsProductFacilityValue().getAttribute("title");
	    	String[] splitFacilityValue  = facilityValue.split("[.]");
	    	String finalFacilityValue = splitFacilityValue[0].replace(",", "");
	    	
	    	testData = fmsTransactionsExcelData.getTestdata("DS01_582426");
	    	Assert.assertEquals(testData.get("CV Value"), finalFacilityValue);
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsProductCVValue());
	    	String CVValue = applicationFinancialObj.limitDetailsProductCVValue().getAttribute("title");
	    	String[] splitCVValue  = CVValue.split("[.]");
	    	String finalCVValue = splitCVValue[0].replace(",", "");
	    	
	    	Assert.assertEquals(testData.get("CV Value"), finalCVValue);
	    	
	    }

	    @And("^User double click on the product class under limit details$")
	    public void user_double_click_on_the_product_class_under_limit_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsProductFacilityValue());
	    	clicksAndActionsHelper.doubleClick(applicationFinancialObj.limitDetailsProductFacilityValue());
	    }
	    
	    @And("^User click the clean flag under product calss in limit details tab$")
	    public void user_click_the_clean_flag_under_product_calss_in_limit_details_tab() throws Throwable {
	    	// check the clean flag
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsNewRecordCleanFlag());
	        WebElement cleanFlag = applicationFinancialObj.limitDetailsNewRecordCleanFlag();
	        if(!(cleanFlag.isSelected())) {
	        	cleanFlag.click();
	    	}
	    }
	    
	    @And("^User click the edit button under product class in limit details tab$")
	    public void user_click_the_edit_button_under_product_class_in_limit_details_tab() throws Throwable {
	    	
	    	for (int i = 0; i <= 300; i++) {
	        	try {
	        		JavascriptHelper.scrollIntoView(applicationFinancialObj.limitDetailsProductEditBtn());
	    				break;
	    			} catch (Exception e) {
	    				if (i == 300) {
	    					Assert.fail(e.getMessage());
	    				}
	    			}
	    	}
	        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.limitDetailsProductEditBtn());
	        applicationFinancialObj.limitDetailsProductEditBtn().click();
	    }
	    
	   @And("^Enter Total value on additional Details$")
	   public void Enter_Total_value_on_additional_Details() throws Throwable{
	        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Enter_total_value_on_additionalDetails());
	        applicationFinancialObj.Enter_total_value_on_additionalDetails().sendKeys(testData.get("Total value on additional Details"));
	        applicationFinancialObj.Enter_total_value_on_additionalDetails().sendKeys(Keys.TAB);
	        

	   }
	   
	   
		@And("^Change Total value and down payment$")
	    public void Change_Total_value_and_down_payment() throws Throwable {
	        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Enter_downPayment());
	        applicationFinancialObj.Enter_downPayment().sendKeys(testData.get("Change Down Payment"));
	        applicationFinancialObj.Enter_downPayment().sendKeys(Keys.TAB);
	        applicationFinancialObj.Click_SaveButton_AfterEdit_downPayment().click();
	        
	    }
		
		//@539219
		@And("User Click Approval Committee Recommendations")
		public void User_Click_Approval_Committee_Recommendations(){
	        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_Approval_Committee_Recommendations());
	        applicationFinancialObj.Click_Approval_Committee_Recommendations().click();
		}
		
		@And("Select the record in Approval Committee Recommendations")
		public void Select_the_record_in_Approval_Committee_Recommendations() throws InterruptedException{
	        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_ClearSearch_InApproval_Committee_Recommendations());
	        applicationFinancialObj.Click_ClearSearch_InApproval_Committee_Recommendations().click();
	        
	        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.select_the_record_InApproval_Committee_Recommendations());
	        clicksAndActionsHelper.doubleClick(applicationFinancialObj.select_the_record_InApproval_Committee_Recommendations());

		}
		@Given("Click recommend button in the Approval Committee Recommendations Screen")
		public void click_recommend_button_in_the_approval_committee_recommendations_screen() {
	        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_recommend_button_in_the_Approval_Committee_Recommendations_Screen());
	        applicationFinancialObj.Click_recommend_button_in_the_Approval_Committee_Recommendations_Screen().click();
	        
	        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ButtonConfirmOk());
	        applicationFinancialObj.ButtonConfirmOk().click();

		}

		@Given("Enter the details in Recommendations")
		public void enter_the_details_in_recommendations() {
			waitHelper.waitForElementwithFluentwait(driver,
					applicationFinancialObj.select_approve_In_recommendaionDropDown());
			applicationFinancialObj.select_approve_In_recommendaionDropDown().click();
			
			
	       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.select_approve_In_recommendaionDropDown());
	       DropDownHelper.SelectUsingVisibleText(applicationFinancialObj.select_approve_In_recommendaionDropDown(), testData.get("Select approve In recommendaion"));

	       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.enter_comment_code_In_recommendaionPopup());
	       applicationFinancialObj.enter_comment_code_In_recommendaionPopup().sendKeys(testData.get("Comment Code"));
	         
		}

		@Given("Click ok button in the Recommendations screen")
		public void click_ok_button_in_the_recommendations_screen() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_ok_After_enterValues_On_recommendaion());
		       applicationFinancialObj.Click_ok_After_enterValues_On_recommendaion().click();
		}

		//@1038989

		@Given("User_607 Enter Down Payment to Vendor Percentage In Additional DetailsTab")
		public void user_enter_down_payment_to_vendor_percentage_in_additional_details_tab() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Down_Payment_to_VendorPercentage_In_AdditionalDetailsTab_607());
		       applicationFinancialObj.Down_Payment_to_VendorPercentage_In_AdditionalDetailsTab_607().sendKeys(testData.get("Down Payment to Vendor Percentage"));			
		       applicationFinancialObj.Down_Payment_to_VendorPercentage_In_AdditionalDetailsTab_607().sendKeys(Keys.TAB);
		}

		@Given("User_607 Check Down Payment to Vendor In Additional DetailsTab")
		public void user_check_down_payment_to_vendor_in_additional_details_tab() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Down_Payment_to_Vendor_In_AdditionalDetailsTab_607());
		       String Check = applicationFinancialObj.Down_Payment_to_Vendor_In_AdditionalDetailsTab_607().getAttribute("prevvalue");
		       if (Check.isBlank()||Check.isEmpty()) {
				Assert.fail();
			}
		}

		@Given("User_607 Check Total Down Payment Percentage In Additional DetailsTab")
		public void user_enter_total_down_payment_percentage_in_additional_details_tab() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Total_Down_PaymentPercentage_In_AdditionalDetailsTab_607());
		       String Check = JavascriptHelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPaymentPercentage')[0].value").
		                toString().replace(",","").split("[.]")[0];
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}
		}

		@Given("User_607 Check Total Down Payment In Additional DetailsTab")
		public void user_check_total_down_payment_in_additional_details_tab() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Total_Down_Payment_In_AdditionalDetailsTab_607());
		       String Check = JavascriptHelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPayment')[0].value").
		                toString().replace(",","").split("[.]")[0];
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}
		}

		@Given("User_607 Check Down Payment to Vendor Percentage In limit Details")
		public void user_check_down_payment_to_vendor_percentage_in_limit_details() throws Throwable {
			   Thread.sleep(7000);
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.LimitDetails_Down_Payment_to_VendorPercentage_607());
		       String Check = JavascriptHelper.executeScript("return document.getElementsByName('applicationFacilityCO.fmsAppLimitDetCO.fmsAppLimitDetVO.VENDOR_DOWN_PAYMENT_PERC')[0].value").
		                toString().replace(",","").split("[.]")[0];
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}		
		       }

		@Given("User_607 Check Down Payment to Vendor In limit Details")
		public void user_check_down_payment_to_vendor_in_limit_details() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.LimitDetails_Down_Payment_to_Vendor_607());
		       String Check = applicationFinancialObj.LimitDetails_Down_Payment_to_Vendor_607().getAttribute("prevvalue");
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}		}

		@Given("User_607 Check Total Down Payment Percentage In limit Details")
		public void user_check_total_down_payment_percentage_in_limit_details() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.LimitDetails_Total_Down_PaymentPercentage_607());
		       String Check = applicationFinancialObj.LimitDetails_Total_Down_PaymentPercentage_607().getAttribute("prevvalue");
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}		}

		@Given("User_607 Check Total Down Payment In limit Details")
		public void user_check_total_down_payment_in_limit_details() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.LimitDetails_Total_Down_Payment_607());
		       String Check = applicationFinancialObj.LimitDetails_Total_Down_Payment_607().getAttribute("prevvalue");
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}
		}
		@Given("User_607 Enter Down Payment to Vendor Percentage In Facility type DetailsTab")
		public void user_enter_down_payment_to_vendor_percentage_in_facility_type_details_tab() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Down_Payment_to_VendorPercentage_In_FacilitytypeDetailsTab_607());
		       applicationFinancialObj.Down_Payment_to_VendorPercentage_In_FacilitytypeDetailsTab_607().sendKeys(testData.get("Down Payment to Vendor Percentage in Request for financing"),Keys.TAB);
		       
		}

		@Given("User_607 Check Down Payment to Vendor In Facility type DetailsTab")
		public void user_check_down_payment_to_vendor_in_facility_type_details_tab() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Down_Payment_to_Vendor_In_FacilitytypeDetailsTab_607());
		       String Check = applicationFinancialObj.Down_Payment_to_Vendor_In_FacilitytypeDetailsTab_607().getAttribute("prevvalue");
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}
		}

		@Given("User_607 Check Total Down Payment Percentage In Facility type DetailsTab")
		public void user_check_total_down_payment_percentage_in_facility_type_details_tab() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Total_Down_PaymentPercentage_InFacilitytypeDetailsTab_607());
		       String Check = JavascriptHelper.executeScript("return document.getElementsByName('requestFinancingCO.totalDownPaymentPercentage')[0].value").
               toString().replace(",","").split("[.]")[0];
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}
		}

		@Given("User_607 Check Total Down Payment In Facility type DetailsTab")
		public void user_check_total_down_payment_in_facility_type_details_tab() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Total_Down_Payment_In_FacilitytypeDetailsTab_607());
		       String Check = JavascriptHelper.executeScript("return document.getElementsByName('requestFinancingCO.totalDownPayment')[0].value").
		               toString().replace(",","").split("[.]")[0];
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}
		}

		@Given("User_607 Check Down Payment to Vendor Percentage In DisbursementSubLimit Details")
		public void user_check_down_payment_to_vendor_percentage_in_disbursement_sub_limit_details() {
			  JavascriptHelper.scrollIntoView(applicationFinancialObj.DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage_607());
		       String Check = applicationFinancialObj.DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage_607().getAttribute("prevvalue");
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}
		}

		@Given("User_607 Check Down Payment to Vendor In DisbursementSubLimit Details")
		public void user_check_down_payment_to_vendor_in_disbursement_sub_limit_details() {
		       waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.DisbursementSub_LimitDetails_Down_Payment_to_Vendor_607());
		       String Check = applicationFinancialObj.DisbursementSub_LimitDetails_Down_Payment_to_Vendor_607().getAttribute("prevvalue");
		       if (Check.isBlank()||Check.isEmpty()) {
					Assert.fail();
				}
		}

		@Given("User_607 Check Total Down Payment Percentage In DisbursementSubLimit Details")
		public void user_check_total_down_payment_percentage_in_disbursement_sub_limit_details() {
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.DisbursementSub_LimitDetails_Total_Down_PaymentPercentage_607());
		    String Check = applicationFinancialObj.DisbursementSub_LimitDetails_Total_Down_PaymentPercentage_607().getAttribute("prevvalue");
		    if (Check.isBlank()||Check.isEmpty()) {
				Assert.fail();
			}
		}

		@Given("User_607 Check Total Down Payment In DisbursementSubLimit Details")
		public void user_check_total_down_payment_in_disbursement_sub_limit_details() {
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.DisbursementSub_LimitDetails_Total_Down_Payment_607());
		    String Check = applicationFinancialObj.DisbursementSub_LimitDetails_Total_Down_Payment_607().getAttribute("prevvalue");
		    if (Check.isBlank()||Check.isEmpty()) {
				Assert.fail();
			}
		}
		
		
		
		//127735

		@Given("User_607 Click Collateral details in application For Financial Facilites")
		public void click_collateral_details_in_application_for_financial_facilites() {
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Click_collateral_details_in_applicationForFinancialFacilites_607());
			applicationFinancialObj.Click_collateral_details_in_applicationForFinancialFacilites_607().click();
		}

		@Given("User_607 Click AddButtonn In Collateral details in application For Financial Facilites")
		public void click_add_buttonn_in_collateral_details_in_application_for_financial_facilites() {
			//waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ClickAddBtn_In_collateral_details_in_applicationForFinancialFacilites_607());
			for (int i = 0; i < 900; i++) {
				try {
					applicationFinancialObj.ClickAddBtn_In_collateral_details_in_applicationForFinancialFacilites_607().click();
					break;
				} catch (Exception e) {
				}
			}
			//applicationFinancialObj.ClickAddBtn_In_collateral_details_in_applicationForFinancialFacilites_607().click();
			
		}

		@Given("User_607 Select First Row In Collateral details in application For Financial Facilites")
		public void select_first_row_in_collateral_details_in_application_for_financial_facilites() {
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.SelectFirstRow_In_collateral_details_in_applicationForFinancialFacilites_607());
			applicationFinancialObj.SelectFirstRow_In_collateral_details_in_applicationForFinancialFacilites_607().click();
			
		}

		@Given("User_607 Enter Collateral In collateral details in application For Financial Facilites")
		public void enter_collateral_in_collateral_details_in_application_for_financial_facilites() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.EnterCollateral_In_collateral_details_in_applicationForFinancialFacilites_607());
			applicationFinancialObj.EnterCollateral_In_collateral_details_in_applicationForFinancialFacilites_607().sendKeys("1112");
			applicationFinancialObj.EnterCollateral_In_collateral_details_in_applicationForFinancialFacilites_607().sendKeys(Keys.TAB);
			Thread.sleep(4000);
		}

		@Given("User_607 Click Ok After Link collateral In Collateral details")
		public void click_ok_after_link_collateral_in_collateral_details() {
			waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Clickok_AfterLinkcollateral_In_collateral_details_607());
			applicationFinancialObj.Clickok_AfterLinkcollateral_In_collateral_details_607().click();
		}
		
		
    
}
	
	
	
	
	
	
	
	
	

