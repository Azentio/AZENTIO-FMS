package stepdefinitions;

import static org.testng.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
import pageobjects.RequestforFinancing_Pageobjects;
import resources.BaseClass;

public class RequestforFinancing_Steps extends BaseClass{
	WebDriver driver=BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	RequestforFinancing_Pageobjects RequestforFinancingObj = new RequestforFinancing_Pageobjects(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	//ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	
	ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath,"FMS_WIFAK_ApplicationTestData","DataSet ID");
    Map<String, String> testData;
	Map<String, String> fmsLoginTestData = new HashMap<>();

	@And("get the test data set id for AT_RF_192")
	public void get_the_test_data_set_id_for_at_rf_192() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_583895");
	    
	}
	
	
    @And("^Click on the WIFAK APPLICATION menu$")
    public void click_on_the_wifak_application_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Fms_Wifakappliction());
    	clicksAndActionHelper.moveToElement(RequestforFinancingObj.Fms_Wifakappliction());
    	clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Fms_Wifakappliction());
    }

    @And("^Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION$")
    public void click_on_the_wifak_application_submenu_under_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Wifakappliction_WifakapplictionSubmenu());
    }

    @And("^Click on the Application For Financial Facilities under WIFAK APPLICATION submenu$")
    public void click_on_the_application_for_financial_facilities_under_wifak_application_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities());
    }

    @And("^Click on the Maintenance screen under Application For Financial Facilities$")
    public void click_on_the_maintenance_screen_under_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
    }
    
    @And("^Select the Application For field in Maintenance screen$")
    public void select_the_application_for_field_in_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		//dropdownhelper.SelectUsingVisibleText(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor(), "New Facility");
		dropdownhelper.SelectUsingVisibleText(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor(), testData.get("Application For"));
    }

    @And("^Select the CIF No in Main Information tab$")
    public void select_the_cif_no_in_main_information_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		for (int i = 0; i < 300; i++) {
			try {
				//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys("727");
				RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys(testData.get("CIF No"));
				clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CifnoSearch());
				clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CifnoSearch());
				
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
				}
		}

    }

    @And("^Select the Facility Type in Main Information tab$")
    public void select_the_facility_type_in_main_information_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		for (int i = 0; i < 300; i++) {
			try {
				RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype().sendKeys(testData.get("Facility Type"));
				
				/*Thread.sleep(1000);
				clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch());
				clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch());
				*/
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
				}
		}
    }

    @And("^Click the Country of Financing in Main Information tab$")
    public void click_the_country_of_financing_in_main_information_tab() throws Throwable {	
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch());
    	RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch().click();
    	
    	try {
    		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
    		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
    		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
    		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().sendKeys(testData.get("Country of Financing"));
    		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().sendKeys(Keys.ENTER);
    		Thread.sleep(2000);
    		
    		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().sendKeys(Keys.ENTER);
    		
        	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSelect());
    		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSelect());
        	clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSelect());
        	
			} catch (Exception e) {
				Assert.fail(e.getMessage());
				}
    }
    /*
    @Then("Check the Country of Financing field is filled")
    public void check_the_country_of_financing_field_is_filled() {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		//String countryoffinancing = RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().getText();
		//System.out.println(countryoffinancing);
		for (int i = 0; i <200; i++) {
            try {
                if (RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().getAttribute("prevvalue").isBlank()
                		&&RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().getAttribute("prevvalue").isEmpty()) {
                  break;    
              }
            } catch (Exception e) {
            	Assert.fail(e.getMessage());
            }    
        }
	*/	
		/*
		try {
	    	Assert.assertTrue(!(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().getAttribute("prevvalue") != null));
	    	Assert.assertTrue(false);
	    	
	     if ((RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().getAttribute("prevvalue")) != null){
	    	 RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().isDisplayed();
	             }
	             
		}
	     catch (Exception e) {
	    	 Assert.fail(e.getMessage());
		}
		
    }
    
    /*
    @And("^Click the search icon for Facility Rating$")
    public void click_the_search_icon_for_facility_rating() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		for (int i = 0; i < 300; i++) {
			try {
				RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch().click();
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
				}
		}
		*/
    

    @And("^Select the Facility Rating$")
    public void select_the_facility_rating() throws Throwable {
    	/*
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating().sendKeys("2");
		*/
		
                waitHelper.waitForElementwithFluentwait(driver,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
                clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
              //  RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating().sendKeys("2");
              // RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating().sendKeys(Keys.ENTER);
                RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating().sendKeys(testData.get("Facility Rating"));
                Thread.sleep(2000);
        }
    
    
    
    
    
    @And("^Click on the Additional Details tab$")
    public void click_on_the_additional_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
    }

    @And("^Select the Currency Code$")
    public void select_the_currency_code() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys(Keys.DELETE);
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys("586");
		Thread.sleep(2000);
		/*
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().clear();
		for (int i = 0; i < 300; i++) {
			try {
				RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys("586");
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
				}
		}
		*/
		
    }

    @And("^Enter the Total Value$")
    public void enter_the_total_value() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		Thread.sleep(2000);
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue().sendKeys("10000");
		
		/*
		
		for (int i = 0; i < 500; i++) {
			try {
				clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
				clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
				RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue().sendKeys("10000");
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
				}
		}
		
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue().sendKeys(Keys.ENTER);
	//	Thread.sleep(5000);
	 * */
	 
    }

    @And("^Select the Offer/Expiration$")
    public void select_the_offerexpiration() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		Thread.sleep(2000);
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration().sendKeys("01/06/2023");
	//	RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration().sendKeys(Keys.ENTER);
		
    }
    
    @And("^Click on the Limit Details tab$")
    public void click_on_the_limit_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
    }

    @And("^Click on the add new row icon$")
    public void click_on_the_add_new_row_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
    }

    @And("^Click on Product Class search icon$")
    public void click_on_product_class_search_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
    }
    
    @And("^Select the Product Class$")
    public void select_the_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass());
    }
    
    @Given("Select the Purpose Of Financing")
    public void select_the_purpose_of_financing() {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing());
		
		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingValue());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingValue());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingValue());
    }
    
    @Given("Check the clean flag is enabled")
    public void check_the_clean_flag_is_enabled() {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
		//clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
		try { 
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean().click();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		
    }

    @And("^Click on the add button$")
    public void click_on_the_add_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
    }

    
    
    @And("^Click on the Document Details tab$")
    public void click_on_the_document_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
    }
    
    @And("^Click on Solicitor Name search icon$")
    public void click_on_solicitor_name_search_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());
    }

    @And("^Select the Solicitor Name$")
    public void select_the_solicitor_name() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName());
    }

    @And("^Click on Estimator Name search icon$")
    public void click_on_estimator_name_search_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());
    }

    @And("^Select the Estimator Name$")
    public void select_the_estimator_name() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
    }
    
    
    @Given("Click the save button")
    public void click_the_save_button() {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.save());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.save());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.save());
        
    }
    
    @Given("Click the validate button")
    public void click_the_validate_button() {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.validate());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.validate());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.validate());
    }
    
    @Given("Click the ok button to proceed")
    public void click_the_ok_button_to_proceed() {
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
    
    @Given("Click Dismiss in Send Alert")
    public void click_dismiss_in_send_alert() {
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
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.applicationFinancialFacilityApproveLevel1());
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
   	// dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), testData.get("Decision1"));
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
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.applicationFinancialFacilityApproveLevel2());
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
    	//dropDownHelper.SelectUsingVisibleText(RequestforFinancingObj.approveLevel2SelectDecision(), testData.get("Decision2"));
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
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.applicationFinancialFacilityApproveLevel3());
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
    	//dropDownHelper.SelectUsingVisibleText(RequestforFinancingObj.approveLevel3SelectDecision(), testData.get("Decision3"));
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
    
  //*************************862727*********************//
  	@Given("Check the Mandatory Purpose of Financing flag is enabled")
  	public void check_the_mandatory_purpose_of_financing_flag_is_enabled() {
  		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing());
		try {
			if (RequestforFinancingObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing().isEnabled()) {
				Assert.assertTrue(true);
			}	
			else {
				RequestforFinancingObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing().click();		
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		
  	    
  	}
  	
  	
  //	****************************@402669********************    //
  	
  	@And("get the test data set id for AT_RF_195")
	public void get_the_test_data_set_id_for_at_rf_195() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_402669");
	    
	}
  	
  	@Given("Click Yes in post approval pop up")
  	public void click_yes_in_post_approval_pop_up() {
  		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.WifakApplication_PostApproval());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.WifakApplication_PostApproval());
		RequestforFinancingObj.WifakApplication_PostApproval().click();
  	}
  	
  	@Then("Enter values in Revolving Validity field")
  	public void enter_values_in_revolving_validity_field() {
  		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity());
		
		if (RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity().isEnabled()) {
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity().click();
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity().clear();
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_RevolvingValidity().sendKeys("1111");
		};
		
  	}
  	
  	@Then("Enter values in Max Revolving Times field")
  	public void enter_values_in_max_revolving_times_field() {
  		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes());
		if (RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes().isEnabled()) {
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes().click();
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes().clear();
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes().sendKeys("111");
		}
		
  	}
  	
  	@Then("Enable Subject To Full Repayment flag")
  	public void enable_subject_to_full_repayment_flag() {
  		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_SubjectToFullRepayment());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_SubjectToFullRepayment());
		//if (!(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_TotalApproval().isEnabled())){
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_SubjectToFullRepayment().click();
	//	}
  	}
  	
  	@Then("Check the Current Utilization field is enabled")
  	public void check_the_current_utilization_field_is_enabled() {
  		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CurrentUtilization());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CurrentUtilization());
		Assert.assertTrue(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CurrentUtilization().isEnabled());
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_CurrentUtilization().click();
  	}
  	
  	@Then("Check the Total Approval field is enabled")
  	public void check_the_total_approval_field_is_enabled() {
  		waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_TotalApproval());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_TotalApproval());
		Assert.assertTrue(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_TotalApproval().isEnabled());
		//RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_TotalApproval().click();
  	}

  	@Then("Check the Marketed By field is displayed")
  	public void check_the_marketed_by_field_is_displayed() {
		Assert.assertEquals(true,RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBy().isDisplayed());
		if (RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBy().isDisplayed()) {
		
			waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySearch());
			clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySearch());
			clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySearch());

			
			waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedByFind());
			clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedByFind());
			clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedByFind());
			RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySelect().sendKeys(testData.get("MarketedBY"));
			
			waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySelect());
			clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySelect());
			clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_MarketedBySelect());	
		}
  	}
   
  	@And("get the test data set id for AT_RF_196")
	public void get_the_test_data_set_id_for_at_rf_196() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_834958");
	}
  	
}
