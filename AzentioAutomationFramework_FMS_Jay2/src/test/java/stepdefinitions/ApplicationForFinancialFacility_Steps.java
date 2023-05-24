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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.ApplicationForFinancialFacility_obj;
import resources.BaseClass;

public class ApplicationForFinancialFacility_Steps extends BaseClass{
	
	WebDriver driver=BaseClass.driver;
	//FMSCommonWebElements fmsCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	Map<String, String> fmsLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	ApplicationForFinancialFacility_obj applicationFinancialObj = new ApplicationForFinancialFacility_obj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	
	@Given("^navigate to FMS param application and login with valid credentials2$")
    public void navigate_to_fms_param_application_and_login_with_valid_credentials2() throws Throwable {
		driver.get(configFileReader.getFMSparamsUrl());
		FMSLogin.loginIntoFmsParamApplication2(configFileReader.getFMSParamApplicationUserType());
    }

	@Given("^navigate to FMS application and login with valid credentials2$")
	public void navigate_to_fms_application_and_login_with_valid_credentials2() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		FMSLogin.loginIntoFmsApplication2(configFileReader.getFMSApplicationUserType());;
	}

	@Then("^Click on the Facility Type submenu$")
    public void click_on_the_facility_type_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Parameters_FacilityType());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Parameters_FacilityType());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Parameters_FacilityType());
    }
	
	@And("^Click on the Parameters menu$")
    public void click_on_the_parameters_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsParameters());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsParameters());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FmsParameters());
    }


    @Then("^Search for the Code in Update After Approve screen$")
    public void search_for_the_code_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		applicationFinancialObj.FacilityType_UpdateAfterApprove_Code().sendKeys("369");
		applicationFinancialObj.FacilityType_UpdateAfterApprove_Code().sendKeys(Keys.ENTER); 
    }

//    @Then("^Click the Facility Details tab in update after approve screen$")
//    public void click_the_facility_details_tab_in_update_after_approve_screen() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
//		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
//		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
//    }
    

    @And("^Click the Facility Details tab in update after approve screen$")
    public void click_the_facility_details_tab_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
    }

    @And("^Click on the Update After Approve screen$")
    public void click_on_the_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
    }

    @And("^Click the Code in Update After Approve screen$")
    public void click_the_code_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
		//clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());    
    }

    @And("^Click on the Application Requirements and Details in Facility Details tab$")
    public void click_on_the_application_requirements_and_details_in_facility_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
    	
    }


    @And("^Check Apply corporate package flag$")
    public void check_apply_corporate_package_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ApplyCorporatePackage());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.ApplyCorporatePackage());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.ApplyCorporatePackage());
		javascripthelper.scrollIntoView(applicationFinancialObj.ApplicationRequirement_Updatebutton());
    }

    @And("^After check flag in corporate package then click Update$")
    public void after_check_flag_in_corporate_package_then_click_update() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ApplicationRequirement_Updatebutton());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.ApplicationRequirement_Updatebutton());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.ApplicationRequirement_Updatebutton());
        
    }

    @And("^Its shows warning button then click ok button$")
    public void its_shows_warning_button_then_click_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.popuppathConfirm_ok());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.popuppathConfirm_ok());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.popuppathConfirm_ok());
    }
    
    @And("^Its shows Information button then click ok button$")
    public void its_shows_information_button_then_click_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.informatioPopupOk());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.informatioPopupOk());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.informatioPopupOk());
    }

    @And("^Go to Approve sub menu$")
    public void go_to_approve_sub_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ApproveMenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.ApproveMenu());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.ApproveMenu());
    }

 

    @And("^Search for the Code in Updated in update after screen sub menu$")
    public void search_for_the_code_in_updated_in_update_after_screen_sub_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.SearchforcodeApproveMenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.SearchforcodeApproveMenu());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.SearchforcodeApproveMenu());
		applicationFinancialObj.SearchforcodeApproveMenu().sendKeys("369");
		applicationFinancialObj.SearchforcodeApproveMenu().sendKeys(Keys.ENTER); 
    }

    @And("^Click the Code in Updated in update after screen sub menu$")
    public void click_the_code_in_updated_in_update_after_screen_sub_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.SearchforcodeSelectApproveMenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.SearchforcodeSelectApproveMenu());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.SearchforcodeSelectApproveMenu());
		
    }
    
    @And("^Click the Facility Details tab in update after approve screen sub menu$")
    public void click_the_facility_details_tab_in_update_after_approve_screen_sub_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityDetailsApproveMenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityDetailsApproveMenu());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.FacilityDetailsApproveMenu());
    }

    @And("^Click the approve button in facility Details screen approve screen$")
    public void click_the_approve_button_in_facility_details_screen_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ClickApproveInApproveMenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.ClickApproveInApproveMenu());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.ClickApproveInApproveMenu());
    }
    
   

//    @And("^Click the Facility Details tab in update after approve screen sub menu$")
//    public void click_the_approve_button_in_facility_details_screen() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityDetailsApproveMenu());
//		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityDetailsApproveMenu());
//		clicksAndActionHelper.doubleClick(applicationFinancialObj.FacilityDetailsApproveMenu());
//    	
//    }
    
//    @And("^Click the approve button in facility Details screen$")
//    public void click_the_approve_button_in_facility_details_screen() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityDetailsApproveMenu());
//		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityDetailsApproveMenu());
//		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityDetailsApproveMenu());
//    }

    @And("^Its shows warning button then click ok button approve screen$")
    public void its_shows_warning_button_then_click_ok_button_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ClickConfirmApproveMenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.ClickConfirmApproveMenu());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.ClickConfirmApproveMenu());
    }

    @And("^Its shows Information button then click ok button approve screen$")
    public void its_shows_information_button_then_click_ok_button_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ClickInformationConfirmApproveMenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.ClickInformationConfirmApproveMenu());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.ClickInformationConfirmApproveMenu());
    }
    
    //------------------------
    
    @And("^Click Wifak Application first01$")
    public void click_wifak_application_first() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getWifak_Application_first());
    	clicksAndActionHelper.moveToElement(applicationFinancialObj.getWifak_Application_first());
    	clicksAndActionHelper.clickOnElement(applicationFinancialObj.getWifak_Application_first());
    }

    @And("^Click Wifak Application Second01$")
    public void click_wifak_application_second() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getWifak_Application_second());
    	clicksAndActionHelper.moveToElement(applicationFinancialObj.getWifak_Application_second());
    	clicksAndActionHelper.clickOnElement(applicationFinancialObj.getWifak_Application_second());
    }

    @And("^Click Application for financial facilities01$")
    public void click_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getApplication_for_financial_facilities());
    	clicksAndActionHelper.moveToElement(applicationFinancialObj.getApplication_for_financial_facilities());
    	clicksAndActionHelper.clickOnElement(applicationFinancialObj.getApplication_for_financial_facilities());
    }

    @And("^Click Maintenance01$")
    public void click_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getMaintenance());
    	clicksAndActionHelper.moveToElement(applicationFinancialObj.getMaintenance());
    	clicksAndActionHelper.clickOnElement(applicationFinancialObj.getMaintenance());
    }

    @And("^Click and Select Application for01$")
    public void click_and_select_application_for() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getApplication_for ());
		//clicksAndActionsHelper.moveToElement(FMSWifakErrorWhileSavingObj.getMaintenance());
    	dropdownhelper.SelectUsingVisibleText(applicationFinancialObj.getApplication_for(),"New Facility");
        
    }

    @Given("Search CIF No01")
    public void search_cif_no() {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getCIF_no());
    	clicksAndActionHelper.moveToElement(applicationFinancialObj.getCIF_no());
    	clicksAndActionHelper.clickOnElement(applicationFinancialObj.getCIF_no());
		applicationFinancialObj.getCIF_no().sendKeys("727");
        
    }

    @And("^Enter codeOn Facility Type01$")
    public void enter_codeon_facility_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.getEnter_codeOn_Facility_Type());
    	clicksAndActionHelper.moveToElement(applicationFinancialObj.getEnter_codeOn_Facility_Type());
    	clicksAndActionHelper.clickOnElement(applicationFinancialObj.getEnter_codeOn_Facility_Type());
		applicationFinancialObj.getEnter_codeOn_Facility_Type().sendKeys("369");
    }
    
    @Then("^Check the apply corporate package flag is disabled$")
    public void check_the_apply_corporate_package_flag_is_disabled() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.ApplyCorporatePackagebuttonIsDisabled());
    	clicksAndActionHelper.moveToElement(applicationFinancialObj.ApplyCorporatePackagebuttonIsDisabled());
    	try {
			if (!applicationFinancialObj.ApplyCorporatePackagebuttonIsDisabled().isEnabled()) {
				System.out.println("Apply Corporate Package Flag IsDisabled");
				
			}
		} catch (Exception e) {
			System.out.println("Error in Apply Corporate Package Flag");
		}
    }

//    @And("^Enter Code In Country of Financing$")
//    public void enter_code_in_country_of_financing() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.get());
//    	clicksAndActionHelper.moveToElement(applicationFinancialObj.getEnterCodeIn_Country_of_Financing());
//    	clicksAndActionHelper.clickOnElement(applicationFinancialObj.getEnterCodeIn_Country_of_Financing());
//    	applicationFinancialObj.getEnterCodeIn_Country_of_Financing().sendKeys("320");
    
    
    //----------------------------------------@
    
    
    String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMSParam_Control_Records","DataSet ID");
	Map<String, String> testData;
	
//	@305607
	

    
    
    
    
    
    
    
}
