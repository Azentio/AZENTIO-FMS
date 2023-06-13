package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.inject.Key;

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
import io.cucumber.java.en.When;
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

	String SuccessMsg;
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
    ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
    Map<String, String> testData;

	@And("^Click Wifak Application first$")
	public void click_wifak_application_first() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getWifak_Application_first());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getWifak_Application_first());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getWifak_Application_first());
	}

	@And("get the test data set id for AT_RF_155")
    public void get_the_test_data_set_id_for_at_AT_RF_155() {
        testData = fmsTransactionsExcelData.getTestdata("DS01_740790");

        System.out.println("hai");

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
		//FMSWifakErrorWhileSavingObj.getEnter_codeOn_Facility_Type().sendKeys(testData.get("Facility Type"));
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
//		waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
//		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
//		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
//		FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating().sendKeys("2");

			for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating());
					FMSWifakErrorWhileSavingObj.getEnter_lineCodeOn_Facility_Rating().sendKeys("2");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}

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
		FMSWifakErrorWhileSavingObj.getClick_Offer_Expiration_SelectDate().sendKeys("06/06/2023");

	}

	@And("^Select limit Details$")
	public void select_limit_details() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getSelect_limitDetails());
//		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getSelect_limitDetails());
//		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getSelect_limitDetails());
		// FMSWifakErrorWhileSavingObj.getClick_Offer_Expiration_SelectDate().sendKeys("25/05/2023");
		
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getSelect_limitDetails());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Click Add button on limit Detail$")
	public void click_add_button_on_limit_detail() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver,
//				FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
//		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
//		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
//		Thread.sleep(4000);
		
		for (int i = 0; i < 200; i++) {
			try {
				
			//	waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
				clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
	@And("^Click Second Add button on limit Detail$")
    public void click_second_add_button_on_limit_detail() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				
			//	waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
				clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

 

    @And("^Click third Add button on limit Detail$")
    public void click_third_add_button_on_limit_detail() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				
			//	waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
				clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

 

    @And("^Click Fourth Add button on limit Detail$")
    public void click_fourth_add_button_on_limit_detail() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				
			//	waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
				clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_AddButtonon_limit_Detail());
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
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class().sendKeys("1");
		//Thread.sleep(10000);

	}
	
	@And("^Enter Facility Value$")
    public void enter_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
	//	Thread.sleep(50000);
	//	FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
				FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }
	
	@Then("^Enter second ValueOn Facility Value$")
    public void enter_second_valueon_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
	//	FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().clear();
	//	Thread.sleep(6000);
	//	FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
				FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

 

    @Then("^Enter third ValueOn Facility Value$")
    public void enter_third_valueon_facility_value() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
		//FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().clear();
	//	Thread.sleep(6000);
	//	FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
				FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

 

    @Then("^Enter Fourth ValueOn Facility Value$")
    public void enter_fourth_valueon_facility_value() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
		FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
	//	FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().clear();
	//	Thread.sleep(6000);
	//	FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue());
				FMSWifakErrorWhileSavingObj.Enter_ValueOn_FacilityValue().sendKeys("2000");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    @Then("^Enter the value on  Purpose Of Finacing$")
    public void enter_the_value_on_purpose_of_finacing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
    }

 

    @And("^Enter the second value on  Purpose Of Finacing$")
    public void enter_the_second_value_on_purpose_of_finacing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
    }

 

    @And("^Enter the third value on  Purpose Of Finacing$")
    public void enter_the_third_value_on_purpose_of_finacing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
    }

 

    @And("^Enter the Fourth value on  Purpose Of Finacing$")
    public void enter_the_fourth_value_on_purpose_of_finacing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing());
		FMSWifakErrorWhileSavingObj.Enter_ValueOn_PurposeOfFinacing().sendKeys("1"); 
    }
    
	@And("^Enter second ValueOn Product Class$")
    public void enter_second_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
//		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
//		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
//		FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class().sendKeys("1");
		
		for (int i = 0; i < 2000; i++) {
            try {
                FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class().click();
                FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class().sendKeys("1");
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
    }
	
    @And("^Enter third ValueOn Product Class$")
    public void enter_third_valueon_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class().sendKeys("1");
    }

 

    @And("^Enter Fourth ValueOn Product Class$")
    public void enter_fourth_valueon_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class());
		FMSWifakErrorWhileSavingObj.getEnter_ValueOn_Product_Class().sendKeys("1");
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
		waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
		Thread.sleep(10000);
	}
	
	

	@And("^Click Add button AfterEnter Value On Product Class$")
	public void click_add_button_afterenter_value_on_product_class() throws Throwable {
		
		for (int i = 0; i < 2000; i++) {
            try {
                FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd().click();
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
				
//		for (int i = 0; i < 2000; i++) {
//			try {
//				if(FMSWifakErrorWhileSavingObj.ServerReuest().isDisplayed()) {
//					FMSWifakErrorWhileSavingObj.Waring_OnLimitDetails_Tab().click();
//					
//				//	waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Search());
//					FMSWifakErrorWhileSavingObj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd().click();
//				}
//				break;
//			} catch (Exception e) {
//				if (i==1999) {
//                    Assert.fail(e.getMessage());
//                }
//			}
//		}
		
		
				
	}
	
	@Then("Validate how many product class in limits details")
	public void validate_how_many_product_class_in_limits_details() {
		waitHelper.waitForElementwithFluentwait(driver,FMSWifakErrorWhileSavingObj.TableHead_LimitDetails());
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ApplicationFacilityLimitDetailsGrid_WIFT001MT']//td[@tdlabel='Item']"));
		
		int count = rows.size();
		System.out.println("ROW COUNT : "+count);
		
		for(WebElement e : rows) {
	        Assert.assertEquals(true, count>3);
	    }
		
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

	    
	    @And("^Click Document Details$")
	    public void click_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Click_Document_Details());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Click_Document_Details());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_Document_Details());
			
	    	for (int i = 0; i < 1000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_Document_Details());
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    	}
	    
	    @And("^Enter The Value Solicitor Name$")
	    public void enter_the_value_solicitor_name() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.EnterTheValue_Solicitor_Name());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.EnterTheValue_Solicitor_Name());
//			clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.EnterTheValue_Solicitor_Name());
			
			for (int i = 0; i < 1000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.EnterTheValue_Solicitor_Name());
					FMSWifakErrorWhileSavingObj.EnterTheValue_Solicitor_Name().sendKeys("1");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    }

	    @And("^Enter The Value Estimator Name$")
	    public void enter_the_value_estimator_name() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.EnterTheValue_Estimator_Name());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.EnterTheValue_Estimator_Name());
//			clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.EnterTheValue_Estimator_Name());
			
			for (int i = 0; i < 1000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.EnterTheValue_Estimator_Name());
					FMSWifakErrorWhileSavingObj.EnterTheValue_Estimator_Name().sendKeys("1");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
			Thread.sleep(5000);
	    }

	    
	    
	    @And("^Click Save Button After Document Details$")
	    public void click_save_button_after_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
	    }

	    @And("^Click Ok Button In Waring Screen Document Details$")
	    public void click_ok_button_in_waring_screen_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Waring_OnLimitDetails_Tab());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Validate_Warning_ConfirmValidateProcess());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Validate_Warning_ConfirmValidateProcess());
			
			for (int i = 0; i < 2000; i++) {
				try {
				//	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Validate_Warning_ConfirmValidateProcess());
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Waring_OnLimitDetails_Tab());
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				 }
			 }
			}
	    
	    @Then("Click OK Button In Confirm Already Created IN Document Details")
	    public void click_ok_button_in_confirm_already_created_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Validate_Confirm_alreadyCreated());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Validate_Confirm_alreadyCreated());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Validate_Confirm_alreadyCreated());
			
	    	for (int i = 0; i < 2000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Validate_Confirm_alreadyCreated());
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
				    }

	    @Then("Click OK Button In Success ValidateSuccessfully IN Document Details")
	    public void click_ok_button_in_success_validate_successfully_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Validate_Success_ValidateSuccessfull());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Validate_Success_ValidateSuccessfull());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Validate_Success_ValidateSuccessfull());
	    	
			for (int i = 0; i < 2000; i++) {
				try {
					
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Validate_Success_ValidateSuccessfull());
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    }

	    @Then("Click Dismiss Button In Send Alert Popup")
	    public void click_dismiss_button_in_send_alert_popup() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Validate_SendAlert_Dismiss());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Validate_SendAlert_Dismiss());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Validate_SendAlert_Dismiss());
			
			for (int i = 0; i < 2000; i++) {
				try {
				//	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Validate_SendAlert_Dismiss());
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Validate_SendAlert_Dismiss());
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    }

	    @And("^Click OK  Button In Sucess Screen Document Details$")
	    public void click_ok_button_in_sucess_screen_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click Validate Button in Document Details$")
	    public void click_validate_button_in_document_details() throws Throwable {
	    	
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.limitDetailsValidateBtn());
	        FMSWifakErrorWhileSavingObj.limitDetailsValidateBtn().click();

	        waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.WarningPopupOkBtn());
	        FMSWifakErrorWhileSavingObj.WarningPopupOkBtn().click();

	        // Facility already created popup
	        waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.confirmPopup());
	        waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.facilityAlreadyCreatedPopup());
	        FMSWifakErrorWhileSavingObj.facilityAlreadyCreatedPopup().click();

	        waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.successPopup());
	  //      String SuccessMsg = FMSWifakErrorWhileSavingObj.successPopupMessage().getText();
	        SuccessMsg = FMSWifakErrorWhileSavingObj.successPopupMessage().getText().substring(23, 27);
	        System.err.println("Reference Number: "+SuccessMsg);
	   //     fmsTransactionsExcelData.updateTestData("DS_AT_RF_139", "Approve Code", SuccessMsg);

	        waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.successPopup());
	        for (int i = 0; i < 2000; i++) {
	            try {
	                FMSWifakErrorWhileSavingObj.SuccessPopupOkBtn().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }

	        // close the send alert pop-up box
//	        Thread.sleep(5000);
	        for (int i = 0; i < 2000; i++) {
	            try {
	                FMSWifakErrorWhileSavingObj.sendAlertPopup().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    	
	    }

	    @And("^Click OK Button In Success Screen IN Document Details$")
	    public void click_ok_button_in_success_screen_in_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
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

	    @Then("Validate holiday day allow or not")
	    public void validate_holiday_day_allow_or_not() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.validate_holidayDate());
	    	Assert.assertTrue(FMSWifakErrorWhileSavingObj.validate_holidayDate().isDisplayed());
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
			FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu().sendKeys("02/10/2021");
			FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu().sendKeys(Keys.TAB);
	    }

	   	    
	    
	    @And("^Confirm the Requested Holiday date in Limit Details SubMenu$")
	    public void confirm_the_requested_holiday_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
	    }
	    
	    //---------------
	    
	    //-------- 592279 TSR- SUPT170522 - Label missing limit Details
	    
	    
	    @Then("^Check The Level Of Product Class In LImit Details SubMenu$")
	    public void check_the_level_of_product_class_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ProductClass_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.ProductClass_InLImitDetails_SubMenu());
		//	clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Enter_Previous_dataIn_MaturityDate());
		//	FMSWifakErrorWhileSavingObj.Enter_Previous_dataIn_MaturityDate().sendKeys("04/01/2021");
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.ProductClass_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Case Non Case In LImit Details SubMenu$")
	    public void check_the_level_of_case_non_case_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.CaseNonCase_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.CaseNonCase_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.CaseNonCase_InLImitDetails_SubMenu().isDisplayed());
	      	    }

	    @Then("^Check The Level Of Exchange Rate In LImit Details SubMenu$")
	    public void check_the_level_of_exchange_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ExchangeRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.ExchangeRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.ExchangeRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Down Payment Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_down_payment_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.DownPaymentPercentage_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.DownPaymentPercentage_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.DownPaymentPercentage_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Details Down Payment To Vendor Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_details_down_payment_to_vendor_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.DownPaymentToVendorPerc_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.DownPaymentToVendorPerc_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.DownPaymentToVendorPerc_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Total Down Payment Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_total_down_payment_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TotalDownPaymentPerc_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TotalDownPaymentPerc_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.TotalDownPaymentPerc_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Total Facility Value In LImit Details SubMenu$")
	    public void check_the_level_of_total_facility_value_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TotalFacilityValue_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TotalFacilityValue_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.TotalFacilityValue_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Items In LImit Details SubMenu$")
	    public void check_the_level_of_items_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Items_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Items_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.Items_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Type In LImit Details SubMenu$")
	    public void check_the_level_of_type_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Type_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Type_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.Type_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Facility Value In LImit Details SubMenu$")
	    public void check_the_level_of_facility_value_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.FacilityValue_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.FacilityValue_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.FacilityValue_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of CV Value In LImit Details SubMenu$")
	    public void check_the_level_of_cv_value_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.CvValue_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.CvValue_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.CvValue_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Down Payment AmountIn LImit Details SubMenu$")
	    public void check_the_level_of_down_payment_amountin_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.DownPaymentAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.DownPaymentAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.DownPaymentAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Down Payment To Vendor Amt In LImit Details SubMenu$")
	    public void check_the_level_of_down_payment_to_vendor_amt_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.DownPaymentToVendorAmt_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.DownPaymentToVendorAmt_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.DownPaymentToVendorAmt_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Total Down Payment In LImit Details SubMenu$")
	    public void check_the_level_of_total_down_payment_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TotalDownPayment_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TotalDownPayment_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.TotalDownPayment_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Value Date In LImit Details SubMenu$")
	    public void check_the_level_of_value_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ValueDate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.ValueDate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.ValueDate_InLImitDetails_SubMenu().isDisplayed());
	    }
	    
	    @Then("^Check The Level Of Maturity Date In LImit Details SubMenu$")
	    public void check_the_level_of_maturity_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Maturity_Date_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Maturity_Date_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.Maturity_Date_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of  Status In LImit Details SubMenu$")
	    public void check_the_level_of_status_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.status_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.status_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.status_InLImitDetails_SubMenu().isDisplayed());  
	    }

	    @Then("^Check The Level Of  Account No In LImit Details SubMenu$")
	    public void check_the_level_of_account_no_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.AccountNo_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.AccountNo_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.AccountNo_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of  Account Name In LImit Details SubMenu$")
	    public void check_the_level_of_account_name_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.AccountName_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.AccountName_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.AccountName_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    TFA Margin Rate_In LImit Details SubMenu$")
	    public void check_the_level_of_tfa_margin_ratein_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TFAMarginRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TFAMarginRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.TFAMarginRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Sub Eco Sector In LImit Details SubMenu$")
	    public void check_the_level_of_sub_eco_sector_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SubEcoSector_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.SubEcoSector_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.SubEcoSector_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Discounting Margin percentage In LImit Details SubMenu$")
	    public void check_the_level_of_discounting_margin_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.DiscountingMarginPer_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.DiscountingMarginPer_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.DiscountingMarginPer_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Payment Method In LImit Details SubMenu$")
	    public void check_the_level_of_payment_method_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.PaymentMethod_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.PaymentMethod_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.PaymentMethod_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Installment Amount In LImit Details SubMenu$")
	    public void check_the_level_of_installment_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.InstallmentAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.InstallmentAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.InstallmentAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Security Deposit Amount In LImit Details SubMenu$")
	    public void check_the_level_of_security_deposit_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SecurityDepositAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.SecurityDepositAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.SecurityDepositAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Cap Rate In LImit Details SubMenu$")
	    public void check_the_level_of_cap_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.CapRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.CapRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.CapRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    floor Rate Method In LImit Details SubMenu$")
	    public void check_the_level_of_floor_rate_method_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.floorRateMethod_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.floorRateMethod_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.floorRateMethod_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Credit Spread In LImit Details SubMenu$")
	    public void check_the_level_of_credit_spread_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.CreditSpread_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.CreditSpread_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.CreditSpread_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Sublimit Lower Limit Amount In LImit Details SubMenu$")
	    public void check_the_level_of_sublimit_lower_limit_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SublimitLowerLimitAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.SublimitLowerLimitAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.SublimitLowerLimitAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Expected Payment Date In LImit Details SubMenu$")
	    public void check_the_level_of_expected_payment_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.ExpectedPaymenDate_inLimitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Checking On In LImit Details SubMenu$")
	    public void check_the_level_of_checking_on_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.CheckingOn_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.CheckingOn_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.CheckingOn_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Fund Transfer Rate In LImit Details SubMenu$")
	    public void check_the_level_of_fund_transfer_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.FundTransferRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.FundTransferRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.FundTransferRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Eco Sector In LImit Details SubMenu$")
	    public void check_the_level_of_eco_sector_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.EcoSector_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.EcoSector_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.EcoSector_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    TFAT enure Days In LImit Details SubMenu$")
	    public void check_the_level_of_tfat_enure_days_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TFATenureDays_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TFATenureDays_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.TFATenureDays_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Remarks In LImit Details SubMenu$")
	    public void check_the_level_of_remarks_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Remarks_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Remarks_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.Remarks_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Purpose of financing In LImit Details SubMenu$")
	    public void check_the_level_of_purpose_of_financing_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Purposeoffinancing_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Purposeoffinancing_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.Purposeoffinancing_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    No of Installments In LImit Details SubMenu$")
	    public void check_the_level_of_no_of_installments_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.NoofInstallments_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.NoofInstallments_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.NoofInstallments_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Amended Security Deposit Amount In LImit Details SubMenu$")
	    public void check_the_level_of_amended_security_deposit_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    selling price In LImit Details SubMenu$")
	    public void check_the_level_of_selling_price_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.selling_price_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.selling_price_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.selling_price_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Floor Rate Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_floor_rate_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.FloorRatePercentage_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.FloorRatePercentage_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.FloorRatePercentage_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Sublimit Lower Limit Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_sublimit_lower_limit_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SublimitLowerLimitPerc_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.SublimitLowerLimitPerc_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.SublimitLowerLimitPerc_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Clean Flag In LImit Details SubMenu$")
	    public void check_the_level_of_clean_flag_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.CleanFlag_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.CleanFlag_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.CleanFlag_InLImitDetails_SubMenu().isDisplayed());
	    }
	    
	    
	    @Then("^Check The Level Of Revolving One Off In LImit Details SubMenu$")
	    public void check_the_level_of_revolving_one_off_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.RevolvingOneOff_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.RevolvingOneOff_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.RevolvingOneOff_InLImitDetails_SubMenu().isDisplayed());
	    }

	    
	    
	    @Then("^Check The Level Of Penalty On Due Amount In LImit Details SubMenu$")
	    public void check_the_level_of_penalty_on_due_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.PenaltyOnDueAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.PenaltyOnDueAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.PenaltyOnDueAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of charges type In LImit Details SubMenu$")
	    public void check_the_level_of_charges_type_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.chargestype_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.chargestype_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.chargestype_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of PPR In LImit Details SubMenu$")
	    public void check_the_level_of_ppr_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.PPR_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.PPR_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.PPR_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of BUDGET ALLOCATION In LImit Details SubMenu$")
	    public void check_the_level_of_budget_allocation_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.PPR_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.PPR_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.PPR_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of comments and conditions In LImit Details SubMenu$")
	    public void check_the_level_of_comments_and_conditions_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.comments_and_conditions_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.comments_and_conditions_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.comments_and_conditions_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Maximum Tenure Periodicity No key In LImit Details SubMenu$")
	    public void check_the_level_of_maximum_tenure_periodicity_no_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Minimum Tenure Periodicity No In LImit Details SubMenu$")
	    public void check_the_level_of_minimum_tenure_periodicity_no_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Maximum Tenure for financing PeriodicityNo key In LImit Details SubMenu$")
	    public void check_the_level_of_maximum_tenure_for_financing_periodicityno_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Floating Rate In LImit Details SubMenu$")
	    public void check_the_level_of_floating_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.FloatingRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.FloatingRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.FloatingRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Floating Rate Periodi city Type In LImit Details SubMenu$")
	    public void check_the_level_of_floating_rate_periodi_city_type_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.FloatingRatePeriodicityType_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.FloatingRatePeriodicityType_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.FloatingRatePeriodicityType_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Total Yield In LImit Details SubMenu$")
	    public void check_the_level_of_total_yield_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TotalYield_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TotalYield_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.TotalYield_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of  limit lip start dat In LImit Details SubMenu$")
	    public void check_the_level_of_limit_lip_start_dat_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.limitlipstartdate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.limitlipstartdate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.limitlipstartdate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of zero entry cost In LImit Details SubMenu$")
	    public void check_the_level_of_zero_entry_cost_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.zeroentrycost_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.zeroentrycost_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.zeroentrycost_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Apply PenaltyIn LImit Details SubMenu$")
	    public void check_the_level_of_apply_penaltyin_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ApplyPenalty_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.ApplyPenalty_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.ApplyPenalty_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Grace Period_ In LImit Details SubMenu$")
	    public void check_the_level_of_grace_period_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.GracePeriod_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.GracePeriod_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.GracePeriod_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Vat code In LImit Details SubMenu$")
	    public void check_the_level_of_vat_code_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Vatcode_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Vatcode_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.Vatcode_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of REGIMENTAL AGENT In LImit Details SubMenu$")
	    public void check_the_level_of_regimental_agent_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.REGIMENTAL_AGENT_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.REGIMENTAL_AGENT_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.REGIMENTAL_AGENT_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  CONTRACTED In LImit Details SubMenu$")
	    public void check_the_level_of_contracted_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.CONTRACTED_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.CONTRACTED_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.CONTRACTED_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  transaction cy In LImit Details SubMenu$")
	    public void check_the_level_of_transaction_cy_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.transaction_cy_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.transaction_cy_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.transaction_cy_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Maximum Tenure Periodicity Type key In LImit Details SubMenu$")
	    public void check_the_level_of_maximum_tenure_periodicity_type_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Minimum Tenure PeriodicityType key In LImit Details SubMenu$")
	    public void check_the_level_of_minimum_tenure_periodicitytype_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Maximum Tenure for financing PeriodicityType key In LImit Details SubMenu$")
	    public void check_the_level_of_maximum_tenure_for_financing_periodicitytype_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Floating Rate Periodi city In LImit Details SubMenu$")
	    public void check_the_level_of_floating_rate_periodi_city_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.FloatingRatePeriodicit_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.FloatingRatePeriodicit_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.FloatingRatePeriodicit_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of   Margin Rate In LImit Details SubMenu$")
	    public void check_the_level_of_margin_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.MarginRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.MarginRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.MarginRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  lip perioIn LImit Details SubMenu$")
	    public void check_the_level_of_lip_perioin_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.lip_period_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.lip_period_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.lip_period_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  lip period amende In LImit Details SubMenu$")
	    public void check_the_level_of_lip_period_amende_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.lip_period_amende_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.lip_period_amende_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.lip_period_amende_InLImitDetails_SubMenu().isDisplayed());
	    }
	    
	    
	    
	    @Then("^Check The Level Of Transcation Type In LImit Details SubMenu$")
	    public void check_the_level_of_transcation_type_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TranscationType_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TranscationType_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.TranscationType_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Acc No In LImit Details SubMenu$")
	    public void check_the_level_of_acc_no_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.acc_no_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.acc_no_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.acc_no_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of  Close Button In LImit Details SubMenu$")
	    public void check_the_level_of_close_button_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.close_btn_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.close_btn_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.close_btn_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Transcation Maturity In LImit Details SubMenu$")
	    public void check_the_level_of_transcation_maturity_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TranscationMaturity_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TranscationMaturity_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.TranscationMaturity_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Bank No In LImit Details SubMenu$")
	    public void check_the_level_of_bank_no_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.bank_no_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.bank_no_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.bank_no_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Add Button In LImit Details SubMenu$")
	    public void check_the_level_of_add_button_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.acc_no_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.acc_no_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMSWifakErrorWhileSavingObj.acc_no_InLImitDetails_SubMenu().isDisplayed());
	    }
	    
	    
	    
	    //-------------@579604  Scenario: TSR - KCB170047
	    
	    
	    @Then("^Click Application For Decrease$")
	    public void click_application_for_decrease() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getApplication_for());
			// clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getMaintenance());
			DropDownhelper.SelectUsingVisibleText(FMSWifakErrorWhileSavingObj.getApplication_for(), "Decrease");
	    }

	    @And("^Enter Existing Facility Ref$")
	    public void enter_existing_facility_ref() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ExistingFacility_Ref());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.ExistingFacility_Ref());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.ExistingFacility_Ref());
			FMSWifakErrorWhileSavingObj.ExistingFacility_Ref().sendKeys("1382");
			FMSWifakErrorWhileSavingObj.ExistingFacility_Ref().sendKeys(Keys.TAB);
	    }
	    
	    @And("^Click on additional Details In Additional Details$")
	    public void click_on_additional_details_in_additional_details() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getMaintenance());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getMaintenance());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getMaintenance());
			
	    	for (int i = 0; i < 500; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Click_AdditionalDetails());
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	    	    
	    @And("^Enter the Total Value In Additional Details$")
	    public void enter_the_total_value_in_additional_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.TOTAL_AMOUNT_InAdditionalDetails());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.TOTAL_AMOUNT_InAdditionalDetails());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.TOTAL_AMOUNT_InAdditionalDetails());
			FMSWifakErrorWhileSavingObj.getEnter_TotalValue().sendKeys("50000");
	    }
	    
	    @Then("^Enter Down Payment In Percentage$")
	    public void enter_down_payment_in_percentage() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.DownPaymentAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.DownPaymentAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.DownPaymentAmount_InLImitDetails_SubMenu());
			for(int i = 0; i <= 500; i++) {
	            try {
	                if(FMSWifakErrorWhileSavingObj.DownPaymentAmo_InLImitDetails_SubMenu().getAttribute("prevvalue").isBlank()) {
	                    break;
	                }
	            } catch (Exception e) {
	                // TODO: handle exception
	            }
	        }
			FMSWifakErrorWhileSavingObj.DownPaymentAmount_InLImitDetails_SubMenu().sendKeys("10");
			FMSWifakErrorWhileSavingObj.DownPaymentAmount_InLImitDetails_SubMenu().sendKeys(Keys.TAB);
			
			int total = (50000*10)/100;
			System.err.println("Total value: "+total);
			String valueOf = String.valueOf(total);
			
			for(int i = 0; i <= 500; i++) {
	            try {
	                if(!(FMSWifakErrorWhileSavingObj.DownPaymentAmo_InLImitDetails_SubMenu().getAttribute("prevvalue").isBlank())) {
	                    break;
	                }
	            } catch (Exception e) {
	                // TODO: handle exception
	            }
	        }    
			
			
			waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.DownPaymentAmo_InLImitDetails_SubMenu());
			String attribute = FMSWifakErrorWhileSavingObj.DownPaymentAmo_InLImitDetails_SubMenu().getAttribute("prevvalue");
			System.err.println("Down payment amount: "+attribute);
			
			String[] splitAttribute  = attribute.split("[.]");
	        String finalAttribute = splitAttribute[0].replace(",", "");
	        
	        System.err.println(finalAttribute);
	        
	        Assert.assertEquals(valueOf, finalAttribute);
			
			
	    }
	    
	    
	//--------------------------------- @574947 Scenario: TSR-EWB170043 
	    
	    
	    @Then("^Check Flag in Clean Level IN Limits Detalis SubMenu$")
	    public void check_flag_in_clean_level_in_limits_detalis_submenu() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.CLEAN_FLAG_In_LimitsDetails());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.CLEAN_FLAG_In_LimitsDetails());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.CLEAN_FLAG_In_LimitsDetails());
			
			for (int i = 0; i < 200; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.CLEAN_FLAG_In_LimitsDetails());
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	    
	    @Then("^Click the Product Class In Limits Details$")
	    public void click_the_product_class_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ProductClass_In_LimitsDetails());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.ProductClass_In_LimitsDetails());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.ProductClass_In_LimitsDetails());
	    }
	    
	    @Then("^Click Ok Button In Waring Screen In Limits Details$")
	    public void click_ok_button_in_waring_screen_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
	    }

	    @Then("^Enter the value in No Of Payments  In Repayment Plan$")
	    public void enter_the_value_in_no_of_payments_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan());
			clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan());
			FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan().sendKeys(Keys.DELETE);
			
			//Thread.sleep(40000);
//			for (int i = 0; i < 500; i++) {
//				try {
//					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Popup_NoOfPayments_InRepaymentPlan());
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
			
			for (int i = 0; i < 500; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan());
					FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan().sendKeys("10");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan());
//			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan());
//			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan());
//			FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan().sendKeys("10");
	    }

	    @Then("^Click Warning popup No In Repayment Plan$")
	    public void click_warning_popup_no_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.WaringButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.WaringButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.WaringButton_OnLimitDetails_Tab());
			Thread.sleep(6000);
			//FMSWifakErrorWhileSavingObj.No_Of_Payments_InRepaymentPlan().sendKeys("10");
	    }

	    @Then("^Click Ok Button In Waring Screen In Repayment Plan$")
	    public void click_ok_button_in_waring_screen_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
		//	clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
		//	clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
			for (int i = 0; i < 2000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Waring_Screen());
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	    

	    @And("^Click Save Button After In Limits Details$")
	    public void click_save_button_after_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
			Thread.sleep(6000);
//	    	for (int i = 0; i < 200; i++) {
//				try {
//				//	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
//					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.getClick_SaveButton_OnLimitDetails_Tab());
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
	    }

	    @And("^Click OK  Button In Sucess Screen In Limits Details$")
	    public void click_ok_button_in_sucess_screen_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click Repayment Plan In Limits Details$")
	    public void click_repayment_plan_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.RepaymentPlan_btn_In_LimitsDetails());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.RepaymentPlan_btn_In_LimitsDetails());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.RepaymentPlan_btn_In_LimitsDetails());
	    }

	    @And("^Click Create Schedule In Repayment Plan$")
	    public void click_create_schedule_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.createSchedule_InRepaymentPlan());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.createSchedule_InRepaymentPlan());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.createSchedule_InRepaymentPlan());
	    }

	    @And("^Click Save Button After In Repayment Plan$")
	    public void click_save_button_after_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SaveButton_RepaymentPlan());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.SaveButton_RepaymentPlan());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.SaveButton_RepaymentPlan());
			Thread.sleep(5000);
			
//			for (int i = 0; i < 200; i++) {
//				try {
//				//	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SaveButton_RepaymentPlan());
//					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.SaveButton_RepaymentPlan());
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
	    }

	    @And("^Click OK  Button In Sucess Screen In Repayment Plan$")
	    public void click_ok_button_in_sucess_screen_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.Ok_Button_In_Sucess_Screen());
	    	Thread.sleep(10000);
//	    	for (int i = 0; i < 200; i++) {
//				try {
//				//	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SaveInformation_RepaymentPlan());
//					clicksAndActionsHelper.clickOnElement(FMSWifakErrorWhileSavingObj.SaveInformation_RepaymentPlan());
//					Thread.sleep(5000);
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
	    }
	    
	    
	  
//---------------------approvel 1	    
	    
		@And("^User clicks the Approve Level1 link$")
	    public void user_clicks_the_approve_level1_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.applicationFinancialFacilityApproveLevel1());
	    	FMSWifakErrorWhileSavingObj.applicationFinancialFacilityApproveLevel1().click();  	
	    }
	    
	    @And("^User retrive the first data in approve level1$")
	    public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValidateCode_approve_level1());
//	    	FMSWifakErrorWhileSavingObj.approve1ClearBtn().click();
	    	FMSWifakErrorWhileSavingObj.Enter_ValidateCode_approve_level1().sendKeys(SuccessMsg,Keys.ENTER);
	    	
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ClickTheValue_ValidateCode_approve_level1());
	    	clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.ClickTheValue_ValidateCode_approve_level1());
	    }

	   @And("^select the Approve level1 decision as approve$")
	    public void select_the_approve_level1_decision_as_approve() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.approveLevel1SelectDecision());
		 DropDownhelper.SelectUsingVisibleText(FMSWifakErrorWhileSavingObj.approveLevel1SelectDecision(), "Approve");
		// DropDownhelper.SelectUsingVisibleText(FMSWifakErrorWhileSavingObj.approveLevel1SelectDevision(), testData.get("Decision1"));
	 }
	    @And("^User clicks on the level1 submit button$")
	    public void user_clicks_on_the_level1_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.approveLevel1SubmitBtn());
	    	FMSWifakErrorWhileSavingObj.approveLevel1SubmitBtn().click();
//	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValidateCode_approve_level1());
//	    	FMSWifakErrorWhileSavingObj.Enter_ValidateCode_approve_level1().sendKeys(SuccessMsg,Keys.ENTER);
//	    	clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.ClickTheValue_ValidateCode_approve_level1());
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ButtonConfirmOk1());
	    	FMSWifakErrorWhileSavingObj.ButtonConfirmOk1().click();
	    	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ButtonConfirmOk1());
	    	
	    	for (int i = 0; i < 2000; i++) {
	            try {
	            	FMSWifakErrorWhileSavingObj.ButtonConfirmOk1().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    	
	    }
	    
	    //--------------------approvel 2
	    
	    @And("^User clicks the Approve Level2 link$")
	    public void user_clicks_the_approve_level2_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.applicationFinancialFacilityApproveLevel2());
	    	//FMSWifakErrorWhileSavingObj.applicationFinancialFacilityApproveLevel2().click();
	    	for (int i = 0; i < 2000; i++) {
	            try {
	                FMSWifakErrorWhileSavingObj.applicationFinancialFacilityApproveLevel2().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    }
	    
	    @And("^User retrive the first data in approve level2$")
	    public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValidateCode_approve_level2());
//	    	FMSWifakErrorWhileSavingObj.approve1ClearBtn().click();
	    	FMSWifakErrorWhileSavingObj.Enter_ValidateCode_approve_level2().sendKeys(SuccessMsg,Keys.ENTER);
	    	
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ClickTheValue_ValidateCode_approve_level2());
	    	clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.ClickTheValue_ValidateCode_approve_level2());
	    }

	    @And("^User select the level2 decision as approve$")
	    public void user_select_the_level2_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.approveLevel2SelectDecision());
        	DropDownhelper.SelectUsingVisibleText(FMSWifakErrorWhileSavingObj.approveLevel2SelectDecision(), "Approve");
	    	//DropDownhelper.SelectUsingVisibleText(FMSWifakErrorWhileSavingObj.approveLevel2SelectDecision(), testData.get("Decision2"));
	    }

	    @And("^User clicks on the level2 submit button$")
	    public void user_clicks_on_the_level2_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.approveLevel2SubmitBtn());
	    	FMSWifakErrorWhileSavingObj.approveLevel2SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ButtonConfirmOk1());
	    	FMSWifakErrorWhileSavingObj.ButtonConfirmOk1().click();
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ButtonSuccessOk1());
	    	FMSWifakErrorWhileSavingObj.ButtonSuccessOk1().click();
	    }

	    
	    //--------------------approvel 3
	    
	    
	    @And("^User clicks the Approve Level3 link$")
	    public void user_clicks_the_approve_level3_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.applicationFinancialFacilityApproveLevel3());
	    	FMSWifakErrorWhileSavingObj.applicationFinancialFacilityApproveLevel3().click();
	    }
	    
	    @And("^User retrive the first data in approve level3$")
	    public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Enter_ValidateCode_approve_level3());
//	    	FMSWifakErrorWhileSavingObj.approve1ClearBtn().click();
	    	FMSWifakErrorWhileSavingObj.Enter_ValidateCode_approve_level3().sendKeys(SuccessMsg,Keys.ENTER);
	    	
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ClickTheValue_ValidateCode_approve_level3());
	    	clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.ClickTheValue_ValidateCode_approve_level3());
	    }
	    
	    @And("^User select the level3 decision as approve$")
	    public void user_select_the_level3_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.approveLevel3SelectDecision());
        	DropDownhelper.SelectUsingVisibleText(FMSWifakErrorWhileSavingObj.approveLevel3SelectDecision(), "Approve");
	    	//DropDownhelper.SelectUsingVisibleText(FMSWifakErrorWhileSavingObj.approveLevel3SelectDecision(), testData.get("Decision3"));
	    
	    }
	    
	    @When("^User clicks on the level3 submit button$")
	    public void user_clicks_on_the_level3_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.approveLevel3SubmitBtn());
	    	FMSWifakErrorWhileSavingObj.approveLevel3SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ButtonConfirmOk1());
	    	FMSWifakErrorWhileSavingObj.ButtonConfirmOk1().click();
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.ButtonSuccessOk1());
	    	FMSWifakErrorWhileSavingObj.ButtonSuccessOk1().click();
	    } 
	    
	    //------- @814762 facility management screen
	    
	    @Given("click facility management")
	    public void click_facility_management() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.facilityManagement_screen());
	    	for (int i = 0; i < 2000; i++) {
	            try {
	                FMSWifakErrorWhileSavingObj.facilityManagement_screen().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    }

	    @Given("click update after approvel")
	    public void click_update_after_approvel() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.updateAfterApprove_screen());
	    	FMSWifakErrorWhileSavingObj.updateAfterApprove_screen().click();
	    }

	    @Given("Retrive one data in update after approvel screen")
	    public void retrive_one_data_in_update_after_approvel_screen() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.clearButton_InUpdateApproveScreen());
	    	for (int i = 0; i < 2000; i++) {
	            try {
	                FMSWifakErrorWhileSavingObj.clearButton_InUpdateApproveScreen().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.retriveData_InUpdateApproveScreen());
	    	clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.retriveData_InUpdateApproveScreen());
	    }

	    @Given("click facility application details")
	    public void click_facility_application_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.facilityApplicationDetails_InUpdateApproveScreen());
	    	FMSWifakErrorWhileSavingObj.facilityApplicationDetails_InUpdateApproveScreen().click();
	    }

	    @Given("check flag exceed facility at sublimit")
	    public void check_flag_exceed_facility_at_sublimit() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.exceedFacilityAtSublimit_InUpdateApproveScreen());
	    	FMSWifakErrorWhileSavingObj.exceedFacilityAtSublimit_InUpdateApproveScreen().click();
	    }

	    @Given("check flag subject to full repayment")
	    public void check_flag_subject_to_full_repayment() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.subjectTofullRepayment_InUpdateApproveScreen());
	    	FMSWifakErrorWhileSavingObj.subjectTofullRepayment_InUpdateApproveScreen().click();
	    }

	    @Given("click facility limit details")
	    public void click_facility_limit_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.facilityLimitDetails_InUpdateApproveScreen());
	    	FMSWifakErrorWhileSavingObj.facilityLimitDetails_InUpdateApproveScreen().click();
	    }

	    @Given("click product class")
	    public void click_product_class() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.productClass_InfacilityLimitDetails_InUpdateApproveScreen());
	    	clicksAndActionsHelper.doubleClick(FMSWifakErrorWhileSavingObj.productClass_InfacilityLimitDetails_InUpdateApproveScreen());
	    }
	    @Given("enter the value cap rate")
	    public void enter_the_value_cap_rate() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.capRate_InLimitDetails_InUpdateApproveScreen());
	    	FMSWifakErrorWhileSavingObj.capRate_InLimitDetails_InUpdateApproveScreen().click();
	    	FMSWifakErrorWhileSavingObj.capRate_InLimitDetails_InUpdateApproveScreen().sendKeys("1");
	    }

	    @Given("enter the value selling price")
	    public void enter_the_value_selling_price() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.sellingPrice_InLimitDetails_InUpdateApproveScreen());
	    	FMSWifakErrorWhileSavingObj.sellingPrice_InLimitDetails_InUpdateApproveScreen().click();
	    	FMSWifakErrorWhileSavingObj.capRate_InLimitDetails_InUpdateApproveScreen().sendKeys("1");
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.EditBUtton_InLimitDetails_InUpdateApproveScreen());
	    	FMSWifakErrorWhileSavingObj.EditBUtton_InLimitDetails_InUpdateApproveScreen().click();
	    }

	    @Given("click document details approvel screen")
	    public void click_document_details_approvel_screen() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.documentDetails_InUpdateApproveScreen());
	    	FMSWifakErrorWhileSavingObj.documentDetails_InUpdateApproveScreen().click();
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }

	    @Given("enter the date in document details")
	    public void enter_the_date_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.clickfirstRow1buttonButton_InDocumentDetails());
	    	FMSWifakErrorWhileSavingObj.clickfirstRow1buttonButton_InDocumentDetails().click();
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails());
	   // 	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().click();
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.solicitorDataReceived_InDocumentDetails());
	    	//FMSWifakErrorWhileSavingObj.solicitorDataReceived_InDocumentDetails().click();
	    	FMSWifakErrorWhileSavingObj.solicitorDataReceived_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.estimatorDateSent_InDocumentDetails());
	    //	FMSWifakErrorWhileSavingObj.estimatorDateSent_InDocumentDetails().click();
	    	FMSWifakErrorWhileSavingObj.estimatorDateSent_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.estimatorDateRecevied_InDocumentDetails());
	    //	FMSWifakErrorWhileSavingObj.estimatorDateRecevied_InDocumentDetails().click();
	    	FMSWifakErrorWhileSavingObj.estimatorDateRecevied_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.custodianDateSent_InDocumentDetails());
	    //	FMSWifakErrorWhileSavingObj.custodianDateSent_InDocumentDetails().click();
	    	FMSWifakErrorWhileSavingObj.custodianDateSent_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.solicitorDataSendRow2_InDocumentDetails());
	    //	FMSWifakErrorWhileSavingObj.solicitorDataSendRow2_InDocumentDetails().click();
	    	FMSWifakErrorWhileSavingObj.solicitorDataSendRow2_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys(Keys.TAB);
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys(Keys.TAB);
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys(Keys.TAB);
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys("13/06/2023");
	    	
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys(Keys.TAB);
	    	FMSWifakErrorWhileSavingObj.solicitorDataSend_InDocumentDetails().sendKeys("13/06/2023");
	    }
	    

	    @Given("save the details")
	    public void save_the_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SaveButton_OnLimitDetails_Tab());
	    	FMSWifakErrorWhileSavingObj.SaveButton_OnLimitDetails_Tab().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.Waring_OnLimitDetails_Tab());
	    	FMSWifakErrorWhileSavingObj.Waring_OnLimitDetails_Tab().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMSWifakErrorWhileSavingObj.SucessButton_OnLimitDetails_Tab());
	    	FMSWifakErrorWhileSavingObj.SucessButton_OnLimitDetails_Tab().click();
	    	
	    }

	    @Given("click  approvel and reject screen")
	    public void click_approvel_and_reject_screen() {
	       
	    }

	    @Given("enter the retrive data code")
	    public void enter_the_retrive_data_code() {
	        
	    }

	    @Given("validate the facility application details screen")
	    public void validate_the_facility_application_details_screen() {
	        
	    }

	    @Given("validate the product class screen")
	    public void validate_the_product_class_screen() {
	        
	    }

	    @Given("validate the document details screen")
	    public void validate_the_document_details_screen() {
	       
	    }
	    
	    
}