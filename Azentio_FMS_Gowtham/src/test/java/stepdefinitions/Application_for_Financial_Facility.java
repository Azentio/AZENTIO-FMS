package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
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
	Application_for_Financial_FacilityObj WIFAKapplicationObj = new Application_for_Financial_FacilityObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);

	String DataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(DataPath, "Accounts Restriction", "Data Set ID");
	Map<String, String> testData;

	@Given("^navigate to FMS application2 and login with valid credentials$")
	public void navigate_to_fms_application2_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		login.loginIntoFmsApplication2(configFileReader.getFMSApplicationUserType());
	}

	@And("^Click Wifak Application first$")
	public void click_wifak_application_first() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getScrollinto_CorporateJk());
		JavascriptHelper.scrollIntoView(WIFAKapplicationObj.getScrollinto_CorporateJk());
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getWifak_Application_first());
		WIFAKapplicationObj.getWifak_Application_first().click();

	}

	@And("^Click Wifak Application Second$")
	public void click_wifak_application_second() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getWifak_Application_second());
		WIFAKapplicationObj.getWifak_Application_second().click();
	}

	@And("^Click Application for financial facilities$")
	public void click_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getApplication_for_financial_facilities());
		WIFAKapplicationObj.getApplication_for_financial_facilities().click();
	}

	@And("^Click Maintenance$")
	public void click_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getMaintenance());
		WIFAKapplicationObj.getMaintenance().click();
	}

	@And("^Click and Select Application for$")
	public void click_and_select_application_for() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getApplication_for());
		DropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.getApplication_for(), "New Facility");

	}

	@And("^Search CIF No$")
	public void search_cif_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getCIF_no());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getCIF_no());
		WIFAKapplicationObj.getCIF_no().click();
		WIFAKapplicationObj.getCIF_no().sendKeys("727");
	}

	@And("^Enter codeOn Facility Type$")
	public void enter_facility_type_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_codeOn_Facility_Type());
		WIFAKapplicationObj.getEnter_codeOn_Facility_Type().click();
		WIFAKapplicationObj.getEnter_codeOn_Facility_Type().sendKeys("369");
		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_codeOn_Facility_Type().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter Code In Country of Financing$")
	public void enter_code_in_country_of_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnterCodeIn_Country_of_Financing());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnterCodeIn_Country_of_Financing());
		WIFAKapplicationObj.getEnterCodeIn_Country_of_Financing().click();
		WIFAKapplicationObj.getEnterCodeIn_Country_of_Financing().sendKeys("320");
		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnterCodeIn_Country_of_Financing().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter line Code On Facility Rating$")
	public void enter_line_code_on_facility_rating() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_lineCodeOn_Facility_Rating());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnter_lineCodeOn_Facility_Rating());
		WIFAKapplicationObj.getEnter_lineCodeOn_Facility_Rating().click();
		WIFAKapplicationObj.getEnter_lineCodeOn_Facility_Rating().sendKeys("2");
		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_lineCodeOn_Facility_Rating().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Click on additional Details$")
	public void click_on_additional_details() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.getClickon_additionalDetails(),
						WIFAKapplicationObj.getClickon_additionalDetails());
				JavascriptHelper.JSEClick(WIFAKapplicationObj.getClickon_additionalDetails());
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
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_TotalValue());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnter_TotalValue());
		WIFAKapplicationObj.getEnter_TotalValue().sendKeys("21000");
	}

	@And("^Click Offer Expiration SelectDate$")
	public void click_offer_expiration_selectdate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getClick_Offer_Expiration_SelectDate());
		WIFAKapplicationObj.getClick_Offer_Expiration_SelectDate().click();
		WIFAKapplicationObj.getClick_Offer_Expiration_SelectDate().sendKeys("25/05/2023");
		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getClick_Offer_Expiration_SelectDate().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Select limit Details$")
	public void select_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getSelect_limitDetails());
		WIFAKapplicationObj.getSelect_limitDetails().click();
	}

	@And("^Click Add button on limit Detail$")
	public void click_add_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getClick_AddButtonon_limit_Detail());
		WIFAKapplicationObj.getClick_AddButtonon_limit_Detail().click();
	}

	@And("^Enter ValueOn Product Class$")
	public void enter_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_ValueOn_Product_Class());
		WIFAKapplicationObj.getEnter_ValueOn_Product_Class().sendKeys("160");

	}

	@And("^AfterEnter ValueOn Product Class Search$")
	public void afterenter_valueon_product_class_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				WIFAKapplicationObj.getAfterEnter_ValueOn_Product_Class_Search());
		WIFAKapplicationObj.getAfterEnter_ValueOn_Product_Class_Search().click();

	}

	@And("^Click Add button AfterEnter Value On Product Class$")
	public void click_add_button_afterenter_value_on_product_class() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper.scrollIntoView(WIFAKapplicationObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd());
				clicksAndActionsHelper
						.moveToElement(WIFAKapplicationObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd());
				WIFAKapplicationObj.getClickAdd_Button_AfterEnter_ValueOn_Product_Class().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Click FixedAssert button$")
	public void click_fixedassert_button() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getClick_FixedAssert_Button());
				WIFAKapplicationObj.getClick_FixedAssert_Button().click();
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
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getClick_AddButton_OnFixedAssert_screen());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getClick_AddButton_OnFixedAssert_screen());
		WIFAKapplicationObj.getClick_AddButton_OnFixedAssert_screen().click();
	}

	@And("^Enter value on Catagory$")
	public void enter_value_on_catagory() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clickEnter_value_on_Catagory());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.clickEnter_value_on_Catagory());
		clicksAndActionsHelper.clickOnElement(WIFAKapplicationObj.clickEnter_value_on_Catagory());
		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getEnter_value_on_Catagory().click();
				WIFAKapplicationObj.getEnter_value_on_Catagory().sendKeys("1");
				WIFAKapplicationObj.AfterEnter_value_on_Catagory_Search().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_value_on_Catagory().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on Class$")
	public void enter_value_on_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_value_on_Class());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnter_value_on_Class());

		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getEnter_value_on_Class().click();
				WIFAKapplicationObj.getEnter_value_on_Class().sendKeys("1234");
				WIFAKapplicationObj.AfterEnter_value_on_Class_Search().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_value_on_Class().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on vendor$")
	public void enter_value_on_vendor() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_value_on_vendor());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnter_value_on_vendor());
		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getEnter_value_on_vendor().click();
				WIFAKapplicationObj.getEnter_value_on_vendor().sendKeys("1");
				WIFAKapplicationObj.AfterEnter_value_on_vendor_search().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_value_on_vendor().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on quantity$")
	public void enter_value_on_quantity() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_value_on_quantity());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnter_value_on_quantity());

		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getEnter_value_on_quantity().sendKeys("11");
				WIFAKapplicationObj.getEnter_value_on_quantity().click();

				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_value_on_vendor().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on Unit$")
	public void enter_value_on_unit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_value_on_Unit());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnter_value_on_Unit());
		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getEnter_value_on_Unit().click();
				WIFAKapplicationObj.getEnter_value_on_Unit().sendKeys("11");

				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_value_on_Unit().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on Cy$")
	public void enter_value_on_cy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_value_on_Cy());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnter_value_on_Cy());

		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getEnter_value_on_Cy().click();
				WIFAKapplicationObj.getEnter_value_on_Cy().sendKeys("999");
				WIFAKapplicationObj.AfterEnter_value_on_vendor_search().click();

				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_value_on_Cy().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Enter value on UnitCost$")
	public void enter_value_on_unitcost() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getEnter_value_on_UnitCost());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getEnter_value_on_UnitCost());

		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getEnter_value_on_UnitCost().click();
				WIFAKapplicationObj.getEnter_value_on_UnitCost().sendKeys("11");

				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			if (!(WIFAKapplicationObj.getEnter_value_on_UnitCost().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^Click OkButton On Fixed AssertKey Screen$")
	public void click_okbutton_on_fixed_assertkey_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				WIFAKapplicationObj.getClick_OkButton_OnFixedAssertKey_Screen());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getClick_OkButton_OnFixedAssertKey_Screen());

		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getClick_OkButton_OnFixedAssertKey_Screen().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				WIFAKapplicationObj.Click_OkButton_Warrning_Screen_ForLessAmmount());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.Click_OkButton_Warrning_Screen_ForLessAmmount());
		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.Click_OkButton_Warrning_Screen_ForLessAmmount().click();
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
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getClick_SaveButton_OnLimitDetails_Tab());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getClick_SaveButton_OnLimitDetails_Tab());
		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getClick_SaveButton_OnLimitDetails_Tab().click();

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
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getClickOk_saveOn_Draft_WarrningScreen());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getClickOk_saveOn_Draft_WarrningScreen());
		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getClickOk_saveOn_Draft_WarrningScreen().click();
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
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessScreen_Validate());
		Assert.assertTrue( WIFAKapplicationObj.SuccessScreen_Validate().isDisplayed());
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.getClickOk_OnSuccess_Screen());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.getClickOk_OnSuccess_Screen());
		for (int i = 0; i < 300; i++) {
			try {
				WIFAKapplicationObj.getClickOk_OnSuccess_Screen().click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
