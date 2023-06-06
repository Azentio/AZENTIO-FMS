package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.RequestforFinancing_Pageobjects;
import resources.BaseClass;

public class RequestforFinancing_Steps extends BaseClass{
	WebDriver driver=BaseClass.driver;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	Map<String, String> fmsLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	RequestforFinancing_Pageobjects RequestforFinancingObj = new RequestforFinancing_Pageobjects(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);

	
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
		dropdownhelper.SelectUsingVisibleText(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Applicationfor(), "New Facility");
    }

    @And("^Select the CIF No in Main Information tab$")
    public void select_the_cif_no_in_main_information_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys("727");
    }

    @And("^Select the Facility Type in Main Information tab$")
    public void select_the_facility_type_in_main_information_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys("369");
    }

    @And("^Click the Country of Financing in Main Information tab$")
    public void click_the_country_of_financing_in_main_information_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys("320");
    }
    
    @And("^Click the search icon for Facility Rating$")
    public void click_the_search_icon_for_facility_rating() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
    }

    @And("^Select the Facility Rating$")
    public void select_the_facility_rating() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		clicksAndActionHelper.doubleClick(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_FacilityRating());
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
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode().sendKeys("586");
    }

    @And("^Enter the Total Value$")
    public void enter_the_total_value() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue().sendKeys("10000");
    }

    @And("^Select the Offer/Expiration$")
    public void select_the_offerexpiration() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		clicksAndActionHelper.moveToElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		clicksAndActionHelper.clickOnElement(RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration().sendKeys("01/06/2023");
		RequestforFinancingObj.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration().sendKeys(Keys.ENTER);
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
   
}
