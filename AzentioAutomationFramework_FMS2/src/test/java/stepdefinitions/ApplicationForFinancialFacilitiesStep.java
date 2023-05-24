package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.ApplicationForFinancialFacilitiesObj;
import pageobjects.CommonElements.FMSCommonWebElements;
import resources.BaseClass;

public class ApplicationForFinancialFacilitiesStep {
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacilitiesObj appfinancialfacilitiesobj = new ApplicationForFinancialFacilitiesObj(driver);
	SoftAssert softassert = new SoftAssert();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData csmTransactionsExcelData = new ExcelData(path,"ApplicationForFinancialFacilities","DatasetID");
	Map<String, String> testData;
	
	@Given("^navigate to FMS application2 and login with valid credentials$")
    public void navigate_to_fms_application2_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		System.out.println(configFileReader.getFMSApplicationUserType());
		FMSLogin.loginIntoFmsApplication2(configFileReader.getFMSApplicationUserType());
    }
	
	@And("^Navigate to WIFAK Application Main menu$")
    public void navigate_to_wifak_application_main_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.WIFAKApplicationMainMenu());
    	appfinancialfacilitiesobj.WIFAKApplicationMainMenu().click();
    }

    @And("^Navigate to WIFAX Application Sub menu$")
    public void navigate_to_wifax_application_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.WIFAKApplicationSubMenu());
    	appfinancialfacilitiesobj.WIFAKApplicationSubMenu().click();
    }

    @And("^Navigate to Application for financial facilities section$")
    public void navigate_to_application_for_financial_facilities_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApplicationForFinancialFacilities());
    	appfinancialfacilitiesobj.ApplicationForFinancialFacilities().click();
    }

    @And("^Navigate to Maintenance page in financial facilities section$")
    public void navigate_to_maintenance_page_in_financial_facilities_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApplicationForFinancialFacilities_Maintenance());
    	appfinancialfacilitiesobj.ApplicationForFinancialFacilities_Maintenance().click();
    }

    @And("^Select the value in Application for dropdown$")
    public void select_the_value_in_application_for_dropdown() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApplicationForDropdown());
    	appfinancialfacilitiesobj.ApplicationForDropdown().click();
    	appfinancialfacilitiesobj.ApplicationForDropdown().sendKeys(testData.get("ApplicationFor"));
    	//appfinancialfacilitiesobj.ApplicationForDropdown().sendKeys(Keys.ENTER);
    }

    @And("^Search the CIF No$")
    public void search_the_cif_no() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				appfinancialfacilitiesobj.ApplicationForFinancialFacilities_CIFNoField());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(appfinancialfacilitiesobj.ApplicationForFinancialFacilities_CIFNoField());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(appfinancialfacilitiesobj.ApplicationForFinancialFacilities_CIFNoField());
		for (int i = 0; i <200; i++) {
			try {
				appfinancialfacilitiesobj.ApplicationForFinancialFacilities_CIFNoField().sendKeys(testData.get("CIFNO"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(appfinancialfacilitiesobj.randomClickWIFAKApplication());
		seleniumActions.getClickAndActionsHelper()
		.clickOnElement(appfinancialfacilitiesobj.randomClickWIFAKApplication());
    			
    	
    }

    @And("^Search the value in Facility type$")
    public void search_the_value_in_facility_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.FacilityTypeSearchIcon());
    	appfinancialfacilitiesobj.FacilityTypeSearchIcon().click();
    }

    @And("^Search the value in Country of financing$")
    public void search_the_value_in_country_of_financing() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.CountryOfFinancingSearch());
    	appfinancialfacilitiesobj.CountryOfFinancingSearch().click();
    }

    @And("^Click on Yes button in Post approval popup$")
    public void click_on_yes_button_in_post_approval_popup() throws Throwable {
    	
    }

    @And("^Navigate to Additional details section$")
    public void navigate_to_additional_details_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.AdditionalDetailsSection());
    	appfinancialfacilitiesobj.AdditionalDetailsSection().click();
    }

    @And("^Enter values in Total value field$")
    public void enter_values_in_total_value_field() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.AdditionalDetails_TotalValueField());
    	appfinancialfacilitiesobj.AdditionalDetails_TotalValueField().click();
    	appfinancialfacilitiesobj.AdditionalDetails_TotalValueField().sendKeys(testData.get("TotalValue"));
    	appfinancialfacilitiesobj.AdditionalDetails_TotalValueField().sendKeys(Keys.ENTER);
    }

    @And("^Select Date in OfferExpiration field$")
    public void select_date_in_offerexpiration_field() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.AdditionalDetails_OfferExpirationDate());
    	appfinancialfacilitiesobj.AdditionalDetails_OfferExpirationDate().click();
    	appfinancialfacilitiesobj.AdditionalDetails_OfferExpirationDate().sendKeys(testData.get("OfferExpirationDate"));
    	appfinancialfacilitiesobj.AdditionalDetails_OfferExpirationDate().sendKeys(Keys.ENTER);
    }

    @And("^Navigate to Limit details section$")
    public void navigate_to_limit_details_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.LimitDetailsSection());
    	appfinancialfacilitiesobj.LimitDetailsSection().click();
    }

    @And("^Click on Add button in Limit details$")
    public void click_on_add_button_in_limit_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.LimitDetails_AddIcon());
    	appfinancialfacilitiesobj.LimitDetails_AddIcon().click();
    }

    @And("^Search the product class in limit details$")
    public void search_the_product_class_in_limit_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.LimitDetails_ProductClassSearchIcon());
    	appfinancialfacilitiesobj.LimitDetails_ProductClassSearchIcon().click();
    }

    @And("^Navigate to Document detail section$")
    public void navigate_to_document_detail_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.DocumentDetailsSection());
    	appfinancialfacilitiesobj.DocumentDetailsSection().click();
    }

    @And("^Search the Solicitor name$")
    public void search_the_solicitor_name() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.DocumentDetails_SolicitorNameSearchIcon());
    	appfinancialfacilitiesobj.DocumentDetails_SolicitorNameSearchIcon().click();
    }

    @And("^Search the Estimator name$")
    public void search_the_estimator_name() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.DocumentDetails_EstimatorNameSearchField());
    	appfinancialfacilitiesobj.DocumentDetails_EstimatorNameSearchField().click();
    }

    @And("^Click on Save button$")
    public void click_on_save_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.DocumentDetails_SaveButton());
    	appfinancialfacilitiesobj.DocumentDetails_SaveButton().click();
    }
    

    @And("^Click on Save Confirm button$")
    public void click_on_save_confirm_button() throws Throwable {
    	
    }

    @And("^Click on Validate button$")
    public void click_on_validate_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.DocumentDetails_ValidateButton());
    	appfinancialfacilitiesobj.DocumentDetails_ValidateButton().click();
    }

    @And("^Click on Yes in Validate confirm button$")
    public void click_on_yes_in_validate_confirm_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.OkButtoninConfirmValidationPopup());
    	appfinancialfacilitiesobj.OkButtoninConfirmValidationPopup().click();
    }

    @And("^Navigate to Approve Level1 Section$")
    public void navigate_to_approve_level1_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApproveRejectLevel1Section());
    	appfinancialfacilitiesobj.ApproveRejectLevel1Section().click();
    }

    @And("^Search the record$")
    public void search_the_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApproveLevel1Reject_ClearSearchIcon());
    	appfinancialfacilitiesobj.ApproveLevel1Reject_ClearSearchIcon().click();
    }

    @And("^Select the value in Decision field$")
    public void select_the_value_in_decision_field() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApproveLevel1Reject_DecisionField());
    	appfinancialfacilitiesobj.ApproveLevel1Reject_DecisionField().click();
    }

    @And("^Click on Submit button$")
    public void click_on_submit_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApproveLevel1Reject_SubmitButton());
    	appfinancialfacilitiesobj.ApproveLevel1Reject_SubmitButton().click();
    }

    @And("^Click on Yes button in Final Approval popup$")
    public void click_on_yes_button_in_final_approval_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApproveLevel1Reject_OkButtonInConfirmApproveProcess());
    	appfinancialfacilitiesobj.ApproveLevel1Reject_OkButtonInConfirmApproveProcess().click();
    }
    @And("^Validate the approved successful popup$")
    public void validate_the_approved_successful_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, appfinancialfacilitiesobj.ApproveLevel1Reject_OkButtonInApprovedSuccessfullyPopup());
    	Assert.assertTrue(appfinancialfacilitiesobj.ApproveLevel1Reject_OkButtonInApprovedSuccessfullyPopup().isDisplayed());
    	
    }
    

}
