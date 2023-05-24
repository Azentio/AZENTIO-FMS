package stepdefinitions;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.FMS_Wifak_Error_While_Saving_Obj;
import resources.BaseClass;

public class FMS_Wifak_Error_While_Saving_Steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMS_Wifak_Error_While_Saving_Obj FMSWifakErrorWhileSavingObj = new FMS_Wifak_Error_While_Saving_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	DropDownHelper DropDownhelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);

	@And("^Click Wifak Application first$")
	public void click_wifak_application_first() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getWifak_Application_first());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getWifak_Application_first());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getWifak_Application_first());
	}

	@And("^Click Wifak Application Second$")
	public void click_wifak_application_second() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getWifak_Application_second());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getWifak_Application_second());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getWifak_Application_second());
	}

	@And("^Click Application for financial facilities$")
	public void click_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.getApplication_for_financial_facilities());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getApplication_for_financial_facilities());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getApplication_for_financial_facilities());
	}

	@And("^Click Maintenance$")
	public void click_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getMaintenance());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getMaintenance());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getMaintenance());
	}

	@And("^Click and Select Application for$")
	public void click_and_select_application_for() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getApplication_for());
		// clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getMaintenance());
		DropDownhelper.SelectUsingVisibleText(FMSWifakErrorWhileSavingObj.getApplication_for(), "New Facility");

	}

	@Given("Search CIF No")
	public void search_cif_no() {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getCIF_no());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getCIF_no());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getCIF_no());
		FMSWifakErrorWhileSavingObj.getCIF_no().sendKeys("727");

	}

	@And("^Enter codeOn Facility Type$")
	public void enter_codeon_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_codeOn_Facility_Type());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_codeOn_Facility_Type());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_codeOn_Facility_Type());
		FMSWifakErrorWhileSavingObj.getEnter_codeOn_Facility_Type().sendKeys("369");
	}

	@And("^Enter Code In Country of Financing$")
	public void enter_code_in_country_of_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing());
		FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing().sendKeys("320");

//			for (int i = 0; i < 200; i++) {
//				try {
//					clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Post_Approvel_yes());
//					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Post_Approvel_yes());
//					//break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
	}

	@And("^Enter line Code On Facility Rating$")
	public void enter_line_code_on_facility_rating() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
		FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating().sendKeys("1");

//			for (int i = 0; i < 200; i++) {
//				try {
//					clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Post_Approvel_yes());
//					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Post_Approvel_yes());
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}

		for (int i = 0; i <= 300; i++) {
			if (!(FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating().getAttribute("prevvalue")
					.isBlank())) {
				break;
			}
		}
	}

	@And("^Click on additional Details$")
	public void click_on_additional_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getClickon_additionalDetails());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClickon_additionalDetails());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClickon_additionalDetails());

	}

	@And("^Enter the Total Value$")
	public void enter_the_total_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_TotalValue());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_TotalValue());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_TotalValue());
		FMSWifakErrorWhileSavingObj.getEnter_TotalValue().sendKeys("10000");

	}

	@And("^Click Offer Expiration SelectDate$")
	public void click_offer_expiration_selectdate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.getClick_Offer_Expiration_SelectDate());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_Offer_Expiration_SelectDate());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_Offer_Expiration_SelectDate());
		FMSWifakErrorWhileSavingObj.getClick_Offer_Expiration_SelectDate().sendKeys("25/05/2023");

	}

	@And("^Select limit Details$")
	public void select_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getSelect_limitDetails());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getSelect_limitDetails());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getSelect_limitDetails());
		// FMSWifakErrorWhileSavingObj.getClick_Offer_Expiration_SelectDate().sendKeys("25/05/2023");

	}

	@And("^Click Add button on limit Detail$")
	public void click_add_button_on_limit_detail() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
		Thread.sleep(4000);
	}

	@And("^Enter ValueOn Product Class$")
	public void enter_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class().sendKeys("1");
		Thread.sleep(4000);

	}

	@And("^AfterEnter ValueOn Product Class Search$")
	public void afterenter_valueon_product_class_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());

	}

	@And("^Click Add button AfterEnter Value On Product Class$")
	public void click_add_button_afterenter_value_on_product_class() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper
						.scrollIntoView(FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd());
				clicksAndActionsHelper
						.moveToElement(FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd());
				FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ErrorPopupOK());
			FMSWifakErrorWhileSavingObj.ErrorPopupOK().click();
		} catch (Exception e) {
		//	TODO: handle exception
		}
	}
	

	

//	try {
//		            WaitHelper.FMSWifakErrorWhileSavingObj(driver, WIFAKapplicationObj.ServerRequestNotComplete_OKButton());
//		            WaitHelper.FMSWifakErrorWhileSavingObj().click();
//		            WaitHelper.FMSWifakErrorWhileSavingObj(driver, WIFAKapplicationObj.clickAddBtn());
//		            FMSWifakErrorWhileSavingObj.clickAddBtn().click();
//		        } catch (Exception e) {
//		            // TODO: handle exception
//		        }
//
	
	@And("^Click ok on the warrning Screen$")
	public void click_ok_on_the_warrning_screen() throws Throwable {
	}

	// -----------------------------------@827642

	@Then("^User Enter Date Below to this current Date$")
	public void user_enter_date_below_to_this_current_date() throws Throwable {

	}

	@And("^User Check Fx Settlement Expery Date$")
	public void user_check_fx_settlement_expery_date() throws Throwable {
	}

	@And("^User Enter Date above current Date$")
	public void user_enter_date_above_current_date() throws Throwable {
	}

	// ---------------------------@1108920

	@And("^Click Fixed Assert button$")
	public void click_fixed_assert_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getClick_FixedAssert_Button());
		//clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_FixedAssert_Button());
		//clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_FixedAssert_Button());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_FixedAssert_Button());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Click AddButton On FixedAssert screen$")
	public void click_addbutton_on_fixedassert_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.getClick_AddButton_OnFixedAssert_screen());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_AddButton_OnFixedAssert_screen());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_AddButton_OnFixedAssert_screen());
	}

	@And("^Enter value on Catagory$")
	    public void enter_value_on_catagory() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory());
			//clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory());
			//clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory());
		//	FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().sendKeys("1");;
			
			for (int i=0 ;i<300;i++) {
				
				try { 
					FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().click();
					FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().sendKeys("1");;
					
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
				}
			}

			for (int i=0;i<300;i++) {
				if (FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().getAttribute("prevvalue").isBlank()) {
					
				}
				
			}
	}

	@And("^Enter value on Class$")
	public void enter_value_on_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_Class());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Class());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Class());
		FMSWifakErrorWhileSavingObj.getEnter_value_on_Class().sendKeys("1234");
	}

	@And("^Enter value on vendor$")
	public void enter_value_on_vendor() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_vendor());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_vendor());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_vendor());
		FMSWifakErrorWhileSavingObj.getEnter_value_on_vendor().sendKeys("1");
	}

	@And("^Enter value on quantity$")
	public void enter_value_on_quantity() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_quantity());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_quantity());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_quantity());
		FMSWifakErrorWhileSavingObj.getEnter_value_on_quantity().sendKeys("1");
	}

	@And("^Enter value on Unit$")
	public void enter_value_on_unit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_Unit());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Unit());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Unit());
		FMSWifakErrorWhileSavingObj.getEnter_value_on_Unit().sendKeys("1");
	}

	@And("^Enter value on Cy$")
	public void enter_value_on_cy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_Cy());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Cy());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Cy());
		FMSWifakErrorWhileSavingObj.getEnter_value_on_Cy().sendKeys("999");
	}

	@And("^Enter value on UnitCost$")
	public void enter_value_on_unitcost() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_UnitCost());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_UnitCost());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_UnitCost());
		FMSWifakErrorWhileSavingObj.getEnter_value_on_UnitCost().sendKeys("11");
	}

}
