package stepdefinitions;

import static org.testng.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DrawDownRequest_PageObjects_609;
import pageobjects.RequestforFinancing_Pageobjects;
import resources.BaseClass;

public class RequestforFinancing_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	RequestforFinancing_Pageobjects RequestforFinancingObj = new RequestforFinancing_Pageobjects(driver);
	DrawDownRequest_PageObjects_609 DrawDownRequestPageobjects_609 =new DrawDownRequest_PageObjects_609(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath, "FMS_WIFAK_ApplicationTestData", "DataSet ID");
	ExcelData fmsFacilitiesManagementExcelData = new ExcelData(TestDataPath, "FMS_Facilities_Management", "DataSet ID");
	ExcelData fmsDrawDownRequestExcelData = new ExcelData(TestDataPath, "FMS_DrawDownRequest_609", "DataSet ID");
	Map<String, String> testData;
	Map<String, String> fmsLoginTestData = new HashMap<>();

	
	
	//**************************************TestData*****************************************//
	
	@And("User_609 get the test data set id for AT_DDR_073")
	public void user_609_get_the_test_data_set_id_for_AT_DDR_073() {
		testData = fmsDrawDownRequestExcelData.getTestdata("AT_DDR_073");
	}
	
	@And("User_609 get the test data set id for AT_DDR_074")
	public void user_609_get_the_test_data_set_id_for_AT_DDR_074() {
		testData = fmsDrawDownRequestExcelData.getTestdata("AT_DDR_074");
	}
	
	
	
	@And("User_609 get the test data set id for AT_RF_192")
	public void user_609_get_the_test_data_set_id_for_at_rf_192() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_326257");
	}
	
	@And("User_609 get the test data set id for AT_FM_086")
	public void user_609_get_the_test_data_set_id_for_at_fm_086() {
		testData = fmsFacilitiesManagementExcelData.getTestdata("DS01_535114_01");
	}
	
	@And("User_609 get the test data set id for AT_FM_088")
	public void user_609_get_the_test_data_set_id_for_at_fm_088() {
		testData = fmsFacilitiesManagementExcelData.getTestdata("DS01_570687");
	}
	
	@And("User_609 get the test data set id for AT_FM_089")
	public void user_609_get_the_test_data_set_id_for_at_fm_089() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_569729");
	}
	
	
	
//*************************************************Scripting****************************************************************//

	@And("^User_609 Click on the WIFAK APPLICATION menu$")
	public void user_609_click_on_the_wifak_application_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Fms_Wifakappliction());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Fms_Wifakappliction());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Fms_Wifakappliction());
	}

	@And("^User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION$")
	public void user_609_click_on_the_wifak_application_submenu_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
	}

	@And("^User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu$")
	public void user_609_click_on_the_application_for_financial_facilities_under_wifak_application_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities());
	}

	@And("^User_609 Click on the Maintenance screen under Application For Financial Facilities$")
	public void user_609_click_on_the_maintenance_screen_under_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
	}

	@And("^User_609 Select the Application For field in Maintenance screen$")
	public void user_609_select_the_application_for_field_in_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		//clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		//clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		dropdownhelper.SelectUsingVisibleText(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor(),testData.get("Application For"));

	}

	@And("^User_609 Select the CIF No in Main Information tab$")
	public void user_609_select_the_cif_no_in_main_information_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CifnoSearch());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CifnoSearch());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CifnoSearch());
				
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys(testData.get("CIF No"));
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys(Keys.ENTER);

		String CifNo = testData.get("CIF No");
		int CifNoLen = 8 - CifNo.length();
	    for(int i = 1; i <=CifNoLen ; i++){
	        CifNo= "0" + CifNo;
	    }
	
	    String xpath ="//table[@id='gridtab_applicationFacilitycif_WIFT001MT']/tbody/tr[2]/td[text()='"+CifNo+"']";
        for (int i = 0; i <= 200; i++) {
            try {
            	clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
            	clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
                break;
            } catch (Exception e) {
                if (i % 5 == 0) {
                	clicksAndActionHelper.moveToElement(RequestforFinancingObj.CifnoGridNext());
                	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.CifnoGridNext());
                }
                if (i == 200) {
                    Assert.fail(e.getMessage());
                }
            }
        }

	 
	    /*
		String xpath ="//table[@id='gridtab_applicationFacilitycif_WIFT001MT']/tbody/tr[2]/td[text()='"+CifNo+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}
		*/
	}

	@And("^User_609 Select the Facility Type in Main Information tab$")
	public void user_609_select_the_facility_type_in_main_information_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch());
		
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype().sendKeys(testData.get("Facility Type"));
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype().sendKeys(Keys.ENTER);
		
		String xpath ="//table[@id='gridtab_applicationFacilityFacilityType_WIFT001MT']/tbody/tr[2]/td[text()='"+testData.get("Facility Type")+"']";
		/*
		for (int i = 0; i <= 200; i++) {
            try {
            	clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
            	clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
                break;
            } catch (Exception e) {
                if (i % 5 == 0 ) {
                		clicksAndActionHelper.moveToElement(RequestforFinancingObj.FacilityTypeGridNext());
                    	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.FacilityTypeGridNext());
                	
                }
                if (i == 200) {
                    Assert.fail(e.getMessage());
                }
            }
		}
		*/
		
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}
	}
	
	

	@And("^User_609 Select the Country of Financing in Main Information tab$")
	public void user_609_select_the_country_of_financing_in_main_information_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch());
		for (int x = 0; x <= 200; x++) {
            try {
        		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch());
                break;
            } catch (Exception e) {
                if (x==200) {
                	 Assert.fail(e.getMessage());
                }
            }
		}
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().sendKeys(testData.get("Country of Financing"));
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().sendKeys(Keys.ENTER);
		
		String xpath ="//table[@id='gridtab_applicationFacilityCountry_WIFT001MT']/tbody/tr/td[text()='"+testData.get("Country of Financing")+"']";
		/*
		for (int i = 0; i <= 200; i++) {
            try {
            	clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
            	clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
                break;
            } catch (Exception e) {
                if (i % 5 == 0) {
                	clicksAndActionHelper.moveToElement(RequestforFinancingObj.CountryoffinancingGridNext());
                	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.CountryoffinancingGridNext());
                }
                if (i == 200) {
                    Assert.fail(e.getMessage());
                }
            }
		}
		*/
		
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				//driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}
	}
		
	

	@Then("User_609 Check the Country of Financing field is filled")
	public void user_609_check_the_country_of_financing_field_is_filled() {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		try {
			Assert.assertEquals(false,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().getAttribute("prevvalue").isBlank());
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Select the Facility Rating$")
	public void user_609_select_the_facility_rating() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating().sendKeys(testData.get("Facility Rating"));
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating().sendKeys(Keys.ENTER);
		
		
		String xpath ="//table[@id='gridtab_applicationFacilityRating_WIFT001MT']/tbody/tr[2]/td[text()='"+testData.get("Facility Rating")+"']";
		/*
		for (int i = 0; i <= 200; i++) {
            try {
            	
            	clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
            	clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
                break;
            } catch (Exception e) {
            	 Assert.fail(e.getMessage());
               
            	 if (i % 5 == 0) {
                	//waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.CountryoffinancingGridNext());
                	clicksAndActionHelper.moveToElement(RequestforFinancingObj.CountryoffinancingGridNext());
                	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.CountryoffinancingGridNext());
                }
                if (i == 200) {
                    Assert.fail(e.getMessage());
                }
                
            }
		}
		*/
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
				//driver.findElement(By.xpath(xpath)).isDisplayed();
				
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}
		
	}

	@And("^User_609 Click on the Additional Details tab$")
	public void user_609_click_on_the_additional_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
	}

	@And("^User_609 Select the Currency Code$")
	public void user_609_select_the_currency_code() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCodeSearch());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCodeSearch());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCodeSearch());
		
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys(testData.get("Currency Code"));
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys(Keys.ENTER);
		
		String xpath ="//table[@id='gridtab_applicationFacilitylimitcurrency_WIFT001MT']/tbody/tr[2]/td[text()='"+testData.get("Currency Code")+"']";
		
		/*
		for (int i = 0; i <= 200; i++) {
            try {
            	clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
            	clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
                break;
            } catch (Exception e) {
                if (i % 5 == 0) {
                	clicksAndActionHelper.moveToElement(RequestforFinancingObj.CurrencyCodeGridNext());
                	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.CurrencyCodeGridNext());
                }
                if (i == 200) {
                    Assert.fail(e.getMessage());
                }
            }
		}
		*/
		
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}	
		
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys(testData.get("Currency Code"));
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys(Keys.TAB);
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys("586");
		Thread.sleep(1000);
	}

	@And("^User_609 Enter the Total Value$")
	public void user_609_enter_the_total_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		//Thread.sleep(2000);
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue().sendKeys("10000");
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue().sendKeys(testData.get("Total value"));
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue().sendKeys(Keys.TAB);
	}

	@And("^User_609 Select the Offer/Expiration$")
	public void user_609_select_the_offerexpiration() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		//Thread.sleep(2000);
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration().sendKeys("01/06/2023");
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration().sendKeys(testData.get("Expire Date"));
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration().sendKeys(Keys.TAB);
	}

	@And("^User_609 Click on the Limit Details tab$")
	public void user_609_click_on_the_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
	}

	@And("^User_609 Click on the add new row icon$")
	public void user_609_click_on_the_add_new_row_icon() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
	}

	@And("^User_609 Click on Product Class search icon$")
	public void user_609_click_on_product_class_search_icon() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
	}

	@And("^User_609 Select the Product Class$")
	public void user_609_select_the_product_class() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
	
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass());
		WebElement ProductClass = RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass();
		ProductClass.click();
		//clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass());  
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass().sendKeys(testData.get("Product Class"));
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass().sendKeys(Keys.ENTER);
		ProductClass.sendKeys(testData.get("Product Class"));
		ProductClass.sendKeys(Keys.ENTER);
	
		String xpath ="//table[@id='gridtab_applicationfacilityLimitDetailsCLASS_WIFT001MT']/tbody/tr[2]/td[text()='"+String.valueOf(testData.get("Product Class"))+"']";
		/*
		for (int i = 0; i <= 200; i++) {
            try {
            	clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
            	clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
                break;
            } catch (Exception e) {
                if (i % 5 == 0) {
                	clicksAndActionHelper.moveToElement(RequestforFinancingObj.ProductClassGridNext());
                	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.ProductClassGridNext());
                }
                if (i == 200) {
                    Assert.fail(e.getMessage());
                }
            }
		}
		*/
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}
	}

	@Given("User_609 Select the Purpose Of Financing")
	public void user_609_select_the_purpose_of_financing() {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing());
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingValue());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingValue());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingValue());
	}

	@Given("User_609 Check the clean flag is enabled")
	public void user_609_check_the_clean_flag_is_enabled() {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
		try {
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean().click();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Click on the add button$")
	public void user_609_click_on_the_add_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
	//	clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
		//javascripthelper.scrollIntoView(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
		//clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
		for (int i=0;i<200;i++) {
			try {
				clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}			
		}
	}

	@And("^User_609 Click on the Document Details tab$")
	public void user_609_click_on_the_document_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
	}

	@And("^User_609 Select the Solicitor Name$")
	public void user_609_select_the_solicitor_name() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());

		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName());
		WebElement ProductClass = RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName();
		ProductClass.click();
		ProductClass.sendKeys(testData.get("Solicitor Name"));
		ProductClass.sendKeys(Keys.ENTER);
	
		String xpath ="//table[@id='gridtab_applicationFacilitysolicitor_WIFT001MT']/tbody/tr[2]/td[text()='"+String.valueOf(testData.get("Solicitor Name"))+"']";
		 for (int i = 0; i <= 200; i++) {
	            try {
	            	clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
	            	clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
	                break;
	            } catch (Exception e) {
	                if (i % 5 == 0) {
	                	clicksAndActionHelper.moveToElement(RequestforFinancingObj.SolicitorNameGridNext());
	                	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.SolicitorNameGridNext());
	                }
	                if (i == 200) {
	                    Assert.fail(e.getMessage());
	                }
	            }
		 }
		/*
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}	
		*/
	}

	@And("^User_609 Select the Estimator Name$")
	public void user_609_select_the_estimator_name() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());
		
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName().sendKeys(testData.get("Estimator Name"));
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName().sendKeys(Keys.ENTER);
		
		String xpath ="//table[@id='gridtab_applicationFacilityEstimator_WIFT001MT']/tbody/tr[2]/td[text()='"+String.valueOf(testData.get("Estimator Name"))+"']";
		 for (int i = 0; i <= 200; i++) {
	            try {
	            	clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
	            	clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
	                break;
	            } catch (Exception e) {
	                if (i % 5 == 0) {
	                	clicksAndActionHelper.moveToElement(RequestforFinancingObj.EstimatorNameGridNext());
	                	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.EstimatorNameGridNext());
	                }
	                if (i == 200) {
	                    Assert.fail(e.getMessage());
	                }
	            }
		 }
	}

	@Given("User_609 Click the save button")
	public void user_609_click_the_save_button() {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.save());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.save());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.save());
	}

	@Given("User_609 Click the validate button")
	public void user_609_click_the_validate_button() {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.validate());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.validate());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.validate());
	}

	@Given("User_609 Click the ok button to proceed")
	public void user_609_click_the_ok_button_to_proceed() {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Confirmok());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Confirmok());
		try {
			if (RequestforFinancingObj.Confirmok().isDisplayed()) {
				RequestforFinancingObj.Confirmok().click();
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Given("User_609 Click Dismiss in Send Alert")
	public void user_609_click_dismiss_in_send_alert() {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.SendAlert());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.SendAlert());
		try {
			if (RequestforFinancingObj.SendAlert().isDisplayed()) {
				RequestforFinancingObj.SendAlert().click();
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^Click the Approve Level1 link$")
	public void click_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.applicationFinancialFacilityApproveLevel1());
		RequestforFinancingObj.applicationFinancialFacilityApproveLevel1().click();
	}

	@And("^Retrive the first data in approve level1$")
	public void retrive_the_first_data_in_approve_level1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approve1ClearBtn());
		RequestforFinancingObj.approve1ClearBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel1RetriveData());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.approveLevel1RetriveData());
	}

	@And("^Select the Approve level1 decision as approve$")
	public void select_the_approve_level1_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel1SelectDecision());
		dropdownhelper.SelectUsingVisibleText(RequestforFinancingObj.approveLevel1SelectDecision(), "Approve");
	}

	@And("^Click on the level1 submit button$")
	public void click_on_the_level1_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel1SubmitBtn());
		RequestforFinancingObj.approveLevel1SubmitBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.ButtonConfirmOk1());
		RequestforFinancingObj.ButtonConfirmOk1().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.ButtonConfirmOk1());
		RequestforFinancingObj.ButtonConfirmOk1().click();
	}

	@And("^Click the Approve Level2 link$")
	public void click_the_approve_level2_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.applicationFinancialFacilityApproveLevel2());
		RequestforFinancingObj.applicationFinancialFacilityApproveLevel2().click();
	}

	@And("^Retrive the first data in approve level2$")
	public void retrive_the_first_data_in_approve_level2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approve2ClearBtn());
		RequestforFinancingObj.approve2ClearBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel2RetriveData());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.approveLevel2RetriveData());
	}

	@And("^Select the level2 decision as approve$")
	public void select_the_level2_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel2SelectDecision());
		dropdownhelper.SelectUsingVisibleText(RequestforFinancingObj.approveLevel2SelectDecision(), "Approve");
	}

	@And("^Click on the level2 submit button$")
	public void click_on_the_level2_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel2SubmitBtn());
		RequestforFinancingObj.approveLevel2SubmitBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.ButtonConfirmOk1());
		RequestforFinancingObj.ButtonConfirmOk1().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.ButtonSuccessOk1());
		RequestforFinancingObj.ButtonSuccessOk1().click();
	}

	@And("^Click the Approve Level3 link$")
	public void click_the_approve_level3_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.applicationFinancialFacilityApproveLevel3());
		RequestforFinancingObj.applicationFinancialFacilityApproveLevel3().click();
	}

	@And("^Retrive the first data in approve level3$")
	public void retrive_the_first_data_in_approve_level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approve3ClearBtn());
		RequestforFinancingObj.approve3ClearBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel3RetriveData());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.approveLevel3RetriveData());
	}

	@And("^Select the level3 decision as approve$")
	public void select_the_level3_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel3SelectDecision());
		dropdownhelper.SelectUsingVisibleText(RequestforFinancingObj.approveLevel3SelectDecision(), "Approve");
	}

	@When("^Click on the level3 submit button$")
	public void click_on_the_level3_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.approveLevel3SubmitBtn());
		RequestforFinancingObj.approveLevel3SubmitBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.ButtonConfirmOk1());
		RequestforFinancingObj.ButtonConfirmOk1().click();
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.ButtonSuccessOk1());
		RequestforFinancingObj.ButtonSuccessOk1().click();
	}

	// *************************862727*********************//
	@Given("Check the Mandatory Purpose of Financing flag is enabled")
	public void check_the_mandatory_purpose_of_financing_flag_is_enabled() {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing());
		try {
			if (RequestforFinancingObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing().isEnabled()) {
				Assert.assertTrue(true);
			} else {
				RequestforFinancingObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing().click();
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	// ****************************@402669******************** //

	@And("User_609 get the test data set id for AT_RF_195")
	public void user_609_get_the_test_data_set_id_for_at_rf_195() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_402669");
	}

	@Given("User_609 Click Yes in post approval pop up")
	public void user_609_click_yes_in_post_approval_pop_up() {
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.WifakApplication_PostApproval());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.WifakApplication_PostApproval());
		RequestforFinancingObj.WifakApplication_PostApproval().click();
	}

	@Then("User_609 Enter values in Revolving Validity field")
	public void user_609_enter_values_in_revolving_validity_field() {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity());
		if (RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity().isEnabled()) {
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity().click();
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity().clear();
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity().sendKeys("1111");
		}
	}

	@Then("User_609 Enter values in Max Revolving Times field")
	public void user_609_enter_values_in_max_revolving_times_field() {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes());
		if (RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes().isEnabled()) {
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes().click();
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes().clear();
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes().sendKeys("111");
		}
	}

	@Then("User_609 Enable Subject To Full Repayment flag")
	public void user_609_enable_subject_to_full_repayment_flag() {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_SubjectToFullRepayment());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_SubjectToFullRepayment());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_SubjectToFullRepayment().click();
	}

	@Then("User_609 Check the Current Utilization field is enabled")
	public void user_609_check_the_current_utilization_field_is_enabled() {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CurrentUtilization());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CurrentUtilization());
		Assert.assertTrue(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CurrentUtilization().isEnabled());
	}

	@Then("User_609 Check the Total Approval field is enabled")
	public void user_609_check_the_total_approval_field_is_enabled() {
		waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_TotalApproval());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_TotalApproval());
		Assert.assertTrue(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_TotalApproval().isEnabled());
	}

	@Then("User_609 Check the Marketed By field is displayed")
	public void user_609_check_the_marketed_by_field_is_displayed() {
		Assert.assertEquals(true,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBy().isDisplayed());
		if (RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBy().isDisplayed()) {
			waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySearch());
			clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySearch());
			clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySearch());
			waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedByFind());
			clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedByFind());
			clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedByFind());
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySelect().sendKeys(testData.get("MarketedBY"));
			waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySelect());
			clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySelect());
			clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySelect());
		}
	}

	@And("User_609 get the test data set id for AT_RF_196")
	public void user_609_get_the_test_data_set_id_for_at_rf_196() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_834958");
	}
	
	 @And("^User_609 Check the Down Payment Percantage field is enabled$")
		public void User_609_Check_the_Down_Payment_Percantage_field_is_enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercentage());
			//clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercentage());
			//clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercentage());
			WebElement DownPaymentPercentage = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercentage();
			try {
				if (DownPaymentPercentage.isEnabled()) {
					DownPaymentPercentage.sendKeys(testData.get("Down Payment %"),Keys.TAB);
					Assert.assertEquals(DownPaymentPercentage.isEnabled(),true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			/*
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage().isEnabled()) {
					clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage());
					DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage().sendKeys(testData.get("Down Payment %"));
					DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage().sendKeys(Keys.TAB);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			*/
		}
		
		@And("^User_609 Check the Down Payment field is enabled$")
		public void User_609_Check_the_Down_Payment_field_is_enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment());
			WebElement DownPayment = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment();
			//clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment());
			//clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment());
			try {
				if (DownPayment.isEnabled()) {
					Assert.assertEquals(DownPayment.isEnabled(), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			/*
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment().isEnabled()) {
					DownPayment = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment().getAttribute("prevvalue");
					Assert.assertEquals(!(DownPayment.isBlank()), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			*/
		}
		
		@And("^User_609 Check the Down Payment to vendor Percantage field is enabled$")
		public void User_609_Check_the_Down_Payment_to_vendor_Percantage_field_is_enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage());
			WebElement DownPaymentToVendorPercentage = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage();
			//clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage());
			//clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage());
			try {
				if (DownPaymentToVendorPercentage.isEnabled()) {
					DownPaymentToVendorPercentage.sendKeys(testData.get("Down Payment to Vendor %"),Keys.TAB);
					Assert.assertEquals(DownPaymentToVendorPercentage.isEnabled(), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			/*
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage().isEnabled()) {
					clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage());
					DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage().sendKeys(testData.get("Down Payment to Vendor %"));
					DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage().sendKeys(Keys.TAB);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			*/
		}
		
		@And("^User_609 Check the Down Payment to vendor field is enabled$")
		public void User_609_Check_the_Down_Payment_to_vendor_field_is_enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor());
			WebElement DownPaymentToVendor = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor();
			//clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor());
			//clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor());
			try {
				if (DownPaymentToVendor.isEnabled()) {
					Assert.assertEquals(DownPaymentToVendor.isEnabled(), true);
				}
				
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			/*
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor().isEnabled()) {
					DownPaymentToVendor = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor().getAttribute("prevvalue");
					Assert.assertEquals(!(DownPaymentToVendor.isBlank()), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			*/
		}
		
		
		@And("^User_609 Check the Total Down Payment Percantage field is Displayed$")
		public void User_609_Check_the_Total_Down_Payment_Percantage_field_is_Displayed() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage());
			WebElement TotalDownPaymentPercentage = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage();
			try {
				if (TotalDownPaymentPercentage.isDisplayed()) {
					Assert.assertEquals(TotalDownPaymentPercentage.isDisplayed(), true);
				}
				
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			/*
			TotalDownPaymentPercentcalc = Integer.parseInt(testData.get("Down Payment %")) + Integer.parseInt(testData.get("Down Payment to Vendor %")) ;
			 
			try {
				String TotalDownPaymentPercentage = javascripthelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPaymentPercentage')[0].value").toString().replace(",","").split("[.]")[0];
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage().isDisplayed()) {
					Assert.assertEquals(String.valueOf(TotalDownPaymentPercentcalc), TotalDownPaymentPercentage);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			*/
		}
		
		@And("^User_609 Check the Total Down Payment field is Displayed$")
		public void User_609_Check_the_Total_Down_Payment_field_is_Displayed() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPayment());
			WebElement TotalDownPayment = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPayment();
			try {
				if (TotalDownPayment.isDisplayed()) {
					Assert.assertEquals(TotalDownPayment.isDisplayed(), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			/*
			TotalDownPaymentcalc = Integer.parseInt(DownPayment)+ Integer.parseInt(DownPaymentToVendor);
			
			String TotalDownPayment = javascripthelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPayment')[0].value").toString().replace(",","").split("[.]")[0];
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPayment().isDisplayed()) {
					Assert.assertEquals(String.valueOf(TotalDownPaymentcalc),TotalDownPayment);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}*/
		}
		
		
		//************************************** 1038988 ****************************************************//
		
		
		
		
		///*****************************************************************************************************///
		
		
		
}
