package stepdefinitions;

import java.util.Iterator;

import org.openqa.selenium.Keys;
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
//		waitHelper.waitForElementwithFluentwait(driver,
//				FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing());
//		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing());
//		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing());
//		FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing().sendKeys("320");

			for (int i = 0; i < 200; i++) {
				try {
					clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing());
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing());
					FMSWifakErrorWhileSavingObj.getEnterCodeIn_Country_of_Financing().sendKeys("320");				
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}

	@And("^Enter line Code On Facility Rating$")
	public void enter_line_code_on_facility_rating() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
		FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating().sendKeys("2");

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
		Thread.sleep(10000);

	}
	
	@And("^Click Search Button In Account No$")
    public void click_search_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.Click_Search_Button_Account_No());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Click_Search_Button_Account_No());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_Search_Button_Account_No());
    }

    @And("^Enter Double Click Search Account No$")
    public void enter_double_click_search_account_no() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.Double_Click_Search_Account_No());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Double_Click_Search_Account_No());
		clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.Double_Click_Search_Account_No());
		Thread.sleep(300000);
    }

	@And("^AfterEnter ValueOn Product Class Search$")
	public void afterenter_valueon_product_class_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
		Thread.sleep(10000);
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
				
	}
	
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
	//	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getClick_FixedAssert_Button());
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
	    //	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory());
			//clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory());
			//clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory());
		//	FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().sendKeys("1");;
			
			for (int i=0 ;i<300;i++) {
				
				try { 
					FMSWifakErrorWhileSavingObj.Click_value_1_on_Catagory().click();
					
//					FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().click();
					FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().sendKeys("1");
					FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().sendKeys(Keys.TAB);
					break;
					
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Thread.sleep(5000);
//			for (int i=0;i<300;i++) {
//				if (FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().getAttribute("prevvalue").isBlank()) {
//					
//				}
//				
//			}
	}

	@And("^Enter value on Class$")
	public void enter_value_on_class() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_value_on_Class());
//		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Class());
//		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_value_on_Class());
//		FMSWifakErrorWhileSavingObj.getEnter_value_on_Class().sendKeys("1234");
		
		for (int i=0 ;i<300;i++) {
			
			try { 
				FMSWifakErrorWhileSavingObj.Click_value_1_on_Catagory().click();
				
//				FMSWifakErrorWhileSavingObj.getEnter_value_on_Catagory().click();
				FMSWifakErrorWhileSavingObj.getEnter_value_on_Class().sendKeys("1234");
				FMSWifakErrorWhileSavingObj.getEnter_value_on_Class().sendKeys(Keys.TAB);
				break;
				
				
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(5000);
		
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

	 @And("^Enter value on Vat Code$")
	    public void enter_value_on_vat_code() throws Throwable {
			for (int i = 0; i < 200; i++) {
				try {
					JavascriptHelper
							.scrollIntoView(FMSWifakErrorWhileSavingObj.Enter_value_on_Vat_Code());
					clicksAndActionsHelper
							.moveToElement(FMSWifakErrorWhileSavingObj.Enter_value_on_Vat_Code());
					FMSWifakErrorWhileSavingObj.Enter_value_on_Vat_Code().click();
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	 
	 //-----------------------------------------------------
//	 @And("^Click Search Button In Account No $")
//	    public void click_search_button_in_account_no() throws Throwable {
//		 waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Search_Button_In_Account_No());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Search_Button_In_Account_No());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Search_Button_In_Account_No());
//	    }

//	    @And("^Double Click Search Account No$")
//	    public void double_click_search_account_no() throws Throwable {
//	    	 waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Currency__Button_In_Account_No());
//				clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Currency__Button_In_Account_No());
//				clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.Currency__Button_In_Account_No());
//				FMSWifakErrorWhileSavingObj.Currency__Button_In_Account_No().sendKeys("840");
//				
//								
//				waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.GLCode__Button_In_Account_No());
//				clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.GLCode__Button_In_Account_No());
//				clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.GLCode__Button_In_Account_No());
//				FMSWifakErrorWhileSavingObj.GLCode__Button_In_Account_No().sendKeys("10001");
//				
//				waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Serial__Button_In_Account_No());
//				clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Serial__Button_In_Account_No());
//				clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.Serial__Button_In_Account_No());
//				FMSWifakErrorWhileSavingObj.Serial__Button_In_Account_No().sendKeys("1");
//		    }
	    
	    @And("^Enter Currency Button In Account No$")
	    public void enter_currency_button_in_account_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Currency__Button_In_Account_No());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Currency__Button_In_Account_No());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Currency__Button_In_Account_No());
			FMSWifakErrorWhileSavingObj.Currency__Button_In_Account_No().sendKeys("840");
			//Thread.sleep(3000);
	    }

	    @And("^Enter GLCode Button In Account No$")
	    public void enter_glcode_button_in_account_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.GLCode__Button_In_Account_No());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.GLCode__Button_In_Account_No());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.GLCode__Button_In_Account_No());
			FMSWifakErrorWhileSavingObj.GLCode__Button_In_Account_No().sendKeys("10001");
			//Thread.sleep(3000);
	    }

	    @And("^Enter Serial Button In Account No$")
	    public void enter_serial_button_in_account_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Serial__Button_In_Account_No());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Serial__Button_In_Account_No());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Serial__Button_In_Account_No());
			FMSWifakErrorWhileSavingObj.Serial__Button_In_Account_No().sendKeys("1");
			//Thread.sleep(3000);
	    }
	    
	    @And("^Enter Account Number$")
	    public void enter_account_number() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_Account_Number());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_Account_Number());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Enter_Account_Number());
			FMSWifakErrorWhileSavingObj.Enter_Account_Number().sendKeys("84001000100000727001");
		//	Thread.sleep(3000);
	    }
	    
	    
	    
	    @And("^User Click Charges Details$")
	    public void user_click_charges_details() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Click_Charges_Details());
				clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Click_Charges_Details());
				clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_Charges_Details());
		    }
	    

	    @And("^User Check Flag In Collect At Fac Approvel$")
	    public void user_check_flag_in_collect_at_fac_approvel() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Click_1_In_Charges_Details());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Click_1_In_Charges_Details());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_1_In_Charges_Details());
			
			waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Check_Flag_In_Collect_At_Fac_Approvel());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Check_Flag_In_Collect_At_Fac_Approvel());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Check_Flag_In_Collect_At_Fac_Approvel());
	    }

	    @And("^User Click Ok Button In Collect At Fac Approvel$")
	    public void user_click_ok_button_in_collect_at_fac_approvel() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Click_Ok_Button_In_Collect_At_Fac_Approvel());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Click_Ok_Button_In_Collect_At_Fac_Approvel());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_Ok_Button_In_Collect_At_Fac_Approvel());
	    }

	    @And("^Click Save Button After Collect At Fac Approvel Give Ok$")
	    public void click_save_button_after_collect_at_fac_approvel_give_ok() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
	    }

	    @And("^Click Ok Button In Waring Screen$")
	    public void click_ok_button_in_waring_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
	    }

	    @And("^Click OK In Button Sucess Screen$")
	    public void click_ok_in_button_sucess_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click Validate Button$")
	    public void click_validate_button() throws Throwable {
	        
	    }

//	    @And("^ Click Document Details $")
//	    public void click_document_details() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Click_Document_Details());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Click_Document_Details());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_Document_Details());
//	    }

	    
	    @And("^Click Document Details$")
	    public void click_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Click_Document_Details());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Click_Document_Details());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_Document_Details());
	    }
	    
	    @And("^Enter The Value Solicitor Name$")
	    public void enter_the_value_solicitor_name() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.EnterTheValue_Solicitor_Name());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.EnterTheValue_Solicitor_Name());
			clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.EnterTheValue_Solicitor_Name());
	    }

	    @And("^Enter The Value Estimator Name$")
	    public void enter_the_value_estimator_name() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.EnterTheValue_Estimator_Name());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.EnterTheValue_Estimator_Name());
			clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.EnterTheValue_Estimator_Name());
	    }

	    
	    
	    @And("^Click Save Button After Document Details$")
	    public void click_save_button_after_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
	    }

	    @And("^Click Ok Button In Waring Screen Document Details$")
	    public void click_ok_button_in_waring_screen_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
	    }

	    @And("^Click OK  Button In Sucess Screen Document Details$")
	    public void click_ok_button_in_sucess_screen_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click Validate Button in Document Details$")
	    public void click_validate_button_in_document_details() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click OK Button In Success Screen IN Document Details$")
	    public void click_ok_button_in_success_screen_in_document_details() throws Throwable {
	        
	    }
	    
	    //-----------------------------@592970 TSR - AMANAUPG170182 - Holiday issue
	    
	    @Then("^Enter Holiday Date In Expiratin date in additional Details$")
	    public void enter_holiday_date_in_expiratin_date_in_additional_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Expiratin_date_additional_Details());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Expiratin_date_additional_Details());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Expiratin_date_additional_Details());
			FMSWifakErrorWhileSavingObj.Expiratin_date_additional_Details().sendKeys("02/10/2022");
			FMSWifakErrorWhileSavingObj.Expiratin_date_additional_Details().sendKeys(Keys.TAB);
	    }

	    @And("^Confirm the Requested Holiday date$")
	    public void confirm_the_requested_holiday_date() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date());
	    }
	    
	   
	    @Then("^Enter Holiday date in Expected Payment Date in Limit Details SubMenu$")
	    public void enter_holiday_date_in_expected_payment_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu());
			FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu().sendKeys("02/10/2022");
			FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu().sendKeys(Keys.TAB);
	    }

	   	    
	    
	    @And("^Confirm the Requested Holiday date in Limit Details SubMenu$")
	    public void confirm_the_requested_holiday_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
	    }
	    
	    //---------------
}
