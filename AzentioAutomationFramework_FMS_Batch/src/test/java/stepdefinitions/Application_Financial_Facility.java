package stepdefinitions;

import java.util.HashMap;
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
import pageobjects.fms.Application_Financial_Facility_Pageobjects;
import resources.BaseClass;

public class Application_Financial_Facility extends BaseClass {

	WebDriver driver=BaseClass.driver;
	//FMSCommonWebElements fmsCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	//String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xls";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	//ExcelData FmsParamsApplicationFacility = new ExcelData(TestDataPath, "FMS_Params_ApplicationFinancialFacility","TestCaseID" );
	Map<String, String> fmsLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	Application_Financial_Facility_Pageobjects applicationFinancialObj = new Application_Financial_Facility_Pageobjects(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	//Map<String, String> testData;
	ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath, "WIFAK_Application_609", "DataSet ID");
	Map<String, String> testData;
	
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
	
	@Then("^Click on the facility type under parameters menu$")
	public void click_on_the_facility_type_under_parameters_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Submenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Submenu());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Submenu());
	}

//	@Then("^search for the reference code in update after approve$")
//	public void search_for_the_reference_code_in_update_after_approve() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Code());
//		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Code());
//		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Code());
//		applicationFinancialObj.FacilityType_Code().sendKeys("369");
//		applicationFinancialObj.FacilityType_Code().sendKeys(Keys.ENTER);
//		
//	}

	@Then("^Click on the Facility Details$")
	public void click_on_the_facility_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Facilitydetails());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Facilitydetails());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Facilitydetails());
	}


///////
    @Then("^check Credit Review under STP Facility Requirements$")
    public void check_credit_review_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_CreditReview());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_CreditReview());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_CreditReview());
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @Then("^Uncheck Credit Authorization under STP Facility Requirements$")
    public void uncheck_credit_authorization_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_CreditAuthorization());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_CreditAuthorization());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_CreditAuthorization());
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @Then("^check Overwrite Grading under STP Facility Requirements$")
    public void check_overwrite_grading_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_CreditAuthorization());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_CreditAuthorization());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_CreditAuthorization());
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @Then("^check Final Approval  under STP Facility Requirements$")
    public void check_final_approval_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_FinalApproval());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_FinalApproval());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_FinalApproval());
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @Then("^check  CreateActiveFacilityIfWithinLimitsunder STP Facility Requirements$")
    public void check_createactivefacilityifwithinlimitsunder_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_CreateActiveFacilityIfWithinLimits());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_CreateActiveFacilityIfWithinLimits());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_CreateActiveFacilityIfWithinLimits());  
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @And("^Check customer grading under STP Facility Requirements$")
    public void check_customer_grading_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_CustomerGrading());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_CustomerGrading());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_CustomerGrading()); 
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @And("^Uncheck Committee Approval under STP Facility Requirements$")
    public void uncheck_committee_approval_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_CommitteeApproval());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_CommitteeApproval());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_CommitteeApproval());
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @And("^Uncheck  IssueFacilityOffer under STP Facility Requirements$")
    public void uncheck_issuefacilityoffer_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_IssueFacilityOffer());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_IssueFacilityOffer());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_IssueFacilityOffer()); 
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @And("^check Client Response under STP Facility Requirements$")
    public void check_client_response_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_ClientResponse());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_ClientResponse());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_ClientResponse());
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @And("^check AutomaticallyApproveFacilityIfWithinLimits under STP Facility Requirements$")
    public void check_automaticallyapprovefacilityifwithinlimits_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_AutomaticallyApproveFacilityIfWithinLimits());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_AutomaticallyApproveFacilityIfWithinLimits());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_AutomaticallyApproveFacilityIfWithinLimits());
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
    }

    @And("^check  DocumentValidation  under STP Facility Requirements$")
    public void check_documentvalidation_under_stp_facility_requirements() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_DocumentValidation());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_DocumentValidation());
		try {
			if(applicationFinancialObj.FacilityType_DocumentValidation().isEnabled()) {
				System.out.println("FacilityType_DocumentValidation enabled");
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_DocumentValidation()); 
			}
		} catch (Exception e) {
			System.out.println("FacilityType_DocumentValidation error");
		}
			
    }
///
	
	@Then("^Click the reference code$")
	public void click_the_reference_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_SelectCode());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_SelectCode());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_SelectCode());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.FacilityType_SelectCode());
		
	}

	@And("^Click on the Parameters menu$")
	public void click_on_the_parameters_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Fms_ParametersMenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Fms_ParametersMenu());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Fms_ParametersMenu());
		//applicationFinancialObj.Fms_Parameters().click();

	}

	@And("^Click on update after approve under facility type$")
	public void click_on_update_after_approve_under_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
	}

	@And("^Click on the STP Facility Requirements$")
	public void click_on_the_stp_facility_requirements() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,applicationFinancialObj.FacilityType_Facilitydetails_STPFacilityRequirements());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Facilitydetails_STPFacilityRequirements());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Facilitydetails_STPFacilityRequirements());

	}
	
	@Then("^Click on approve under facility type$")
	public void click_on_approve_under_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Approvescreen());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Approvescreen());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Approvescreen());
	}


	@And("^Search for the reference code$")
	public void search_for_the_reference_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Approve_Code());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Approve_Code());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Approve_Code());
	}
	/*
	@Then("^Click the reference code under approve screen$")
	public void click_the_reference_code_under_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Approve_Selectcode());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Approve_Selectcode());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Approve_Selectcode());
	}
	*/

	@And("^Click on Update$")
	public void click_on_update() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_update());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_update());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_update());
	}

	/*
	 * @Then("^Click on approve$") public void click_on_approve() throws Throwable {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * applicationFinancialObj.FacilityType_Approve());
	 * clicksAndActionHelper.moveToElement(applicationFinancialObj.
	 * FacilityType_Approve());
	 * clicksAndActionHelper.clickOnElement(applicationFinancialObj.
	 * FacilityType_Approve()); }
	 */
	
	
	
	//---------------------@293656_01----------------------//
	
	
    @Then("^Click on the wifak application submenu under wifak application$")
    public void click_on_the_wifak_application_submenu_under_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu());
    }

    @Then("^Click on the maintenance screen under application for financial facilities$")
    public void click_on_the_maintenance_screen_under_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Applicationforfinancialfacilities_maintenanace());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Applicationforfinancialfacilities_maintenanace());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Applicationforfinancialfacilities_maintenanace()); 
    }

    @Then("^Select the cif no$")
    public void select_the_cif_no() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Cifdetails_Cifno());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Cifdetails_Cifno());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Cifdetails_Cifno());   
		applicationFinancialObj.Cifdetails_Cifno().sendKeys("727");
    }

    @Then("^Select the country of financing$")
    public void select_the_country_of_financing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytypedetails_Countryoffinancing());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytypedetails_Countryoffinancing());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Facilitytypedetails_Countryoffinancing()); 
		applicationFinancialObj.Facilitytypedetails_Countryoffinancing().sendKeys("324");
    }

    @And("^Click on the wifak application menu$")
    public void click_on_the_wifak_application_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Fms_Wifakappliction());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Fms_Wifakappliction());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Fms_Wifakappliction());
        
    }

    @And("^Click on the application for financial facilities under wifak application submenu$")
    public void click_on_the_application_for_financial_facilities_under_wifak_application_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Applicationforfinancialfacilities());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Applicationforfinancialfacilities());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Applicationforfinancialfacilities());
        
    }

    @And("^Select the application for field under main information tab$")
    public void select_the_application_for_field_under_main_information_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Maintenanace_Applicationfor());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Maintenanace_Applicationfor());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Maintenanace_Applicationfor());
		dropdownhelper.SelectUsingVisibleText(applicationFinancialObj.Maintenanace_Applicationfor(), "New Facility");
    }

    @And("^Select the facility type$")
    public void select_the_facility_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytypedetails_Facilitytype());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytypedetails_Facilitytype());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Facilitytypedetails_Facilitytype());
		applicationFinancialObj.Facilitytypedetails_Facilitytype().sendKeys("369");
    }

    @And("^Clickon the approval committees under maintenance screen$")
    public void clickon_the_approval_committee_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Maintenance_Approvalcommittees());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Maintenance_Approvalcommittees());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Maintenance_Approvalcommittees());
    }
    
    //-------------------@293656-------------------------//
    
/*
    @Then("^Click on the approval committee field1$")
    public void Click_on_the_approval_committee_field1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytype_Approvalcommitteefield1());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytype_Approvalcommitteefield1());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.Facilitytype_Approvalcommitteefield1());	
    }
    
    @Then("^Enter the approval committee field value1$")
    public void Enter_the_approval_committee_field_value1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytype_Approvalcommitteefield_Addvalue1());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytype_Approvalcommitteefield_Addvalue1());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Facilitytype_Approvalcommitteefield_Addvalue1());
		applicationFinancialObj.Facilitytype_Approvalcommitteefield_Addvalue1().sendKeys("1");
			
    }
    
    @Then("^Click on the approval committee field2$")
    public void Click_on_the_approval_committee_field2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytype_Approvalcommitteefield2());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytype_Approvalcommitteefield2());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.Facilitytype_Approvalcommitteefield2());	
    }
    
    @Then("^Enter the approval committee field value2$")
    public void Enter_the_approval_committee_field_value2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytype_Approvalcommitteefield_Addvalue2());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytype_Approvalcommitteefield_Addvalue2());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Facilitytype_Approvalcommitteefield_Addvalue2());
		applicationFinancialObj.Facilitytype_Approvalcommitteefield_Addvalue2().sendKeys("3");
			
    }
    */
/*
    @Then("^Select the approval committee value2$")
    public void select_the_approval_committee_value2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytype_Approvalcommittee_Addvalue2());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytype_Approvalcommittee_Addvalue2());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.Facilitytype_Approvalcommittee_Addvalue2());
		//applicationFinancialObj.Facilitytype_Approvalcommittee_Addvalue().sendKeys("3");
		
    }
*/

    @Then("^Click on the Approval Committee tab in Update After Approve screen$")
    public void click_on_the_approval_committee_tab_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_Approvalcommittee());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_Approvalcommittee());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_Approvalcommittee());
    }

    @Then("^Select the Approval Committee value1$")
    public void select_the_approval_committee_value1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value1());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value1());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value1());
		applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value1().sendKeys("1");
		applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value1().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
    }

    @Then("^Select the Approval Committee value2$")
    public void select_the_approval_committee_value2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value2());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value2());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value2());
		applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value1().sendKeys("3");
		applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value1().sendKeys(Keys.ENTER);
    }
    
    @Then("^Click the confirm ok button$")
    public void click_the_confirm_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Confirmok());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Confirmok());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Confirmok());
    }

    @And("^Click on the add icon$")
    public void click_on_the_add_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow());      
    }
    
    @And("^Click the ok button$")
    public void click_the_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Ok());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Ok());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Ok());  
    }
    
    
    //************************* TestCase = @127780 ******************************//
    
    @Then("^Click on the Facility Type submenu$")
    public void click_on_the_facility_type_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Parameters_FacilityType());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Parameters_FacilityType());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Parameters_FacilityType());
    }
    
	
	  @And("^User_609 get the test data set id for AT_AFF_059") 
	  public void User_609_get_the_test_data_set_id_for_AT_AFF_059() throws Throwable {
		  testData = fmsTransactionsExcelData.getTestdata("DS01_127780");
	  }
	  
	  @And("^User_609 get the test data set id for AT_AFF_078") 
	  public void User_609_get_the_test_data_set_id_for_AT_AFF_078() throws Throwable {
		  testData = fmsTransactionsExcelData.getTestdata("DS01_402668");
	  }
	  
	 

    @And("^User_609 Select for the Code in Update After Approve screen$")
    public void User_609_select_for_the_code_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_Code());
		//applicationFinancialObj.FacilityType_Code().sendKeys("221");
		applicationFinancialObj.FacilityType_Code().sendKeys(testData.get("Code"));
		applicationFinancialObj.FacilityType_Code().sendKeys(Keys.ENTER); 
		
		String xpath ="//td[text()='"+String.valueOf(testData.get("Code"))+"']";
		//String xpath ="//td[text()='"+String.valueOf("221")+"']";
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

    @Then("^Click the Facility Details tab in update after approve screen$")
    public void click_the_facility_details_tab_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails());
    }

//    @And("^User_609 Click on the Update After Approve screen$")
//    public void User_609_click_on_the_update_after_approve_screen() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove());
//		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
//		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove());
//    }
/*
    @And("^User_609 Click the Code in Update After Approve screen$")
    public void User_609_click_the_code_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.FacilityType_UpdateAfterApprove_SelectCode());    
    }
*/
    @And("^User_609 Click on the Application Requirements and Details in Facility Details tab$")
    public void User_609_click_on_the_application_requirements_and_details_in_facility_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails());
    }
   
    @Then("^User_609 Check the Apply Corporate Package is displayed$")
    public void User_609_check_the_apply_corporate_package_are_displayed() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_update());
    	javascripthelper.scrollIntoView(applicationFinancialObj.FacilityType_update());
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage());
		try {
			Assert.assertEquals(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage().isEnabled(),true);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
    }

    @Then("^User_609 Check the Allow to edit Corporate Package Rate is displayed$")
    public void User_609_check_the_allow_to_edit_corporate_package_rate_csm_are_displayed() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate());    	
    	try {
			Assert.assertEquals(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate().isEnabled(),true);	
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
    }

    @And("^User_609 Check the Allow to Edit Application is displayed$")
    public void User_609_check_the_allow_to_edit_application_is_displayed() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication());
    	try {
    		Assert.assertEquals(applicationFinancialObj.FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication().isEnabled(),true);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
    }	
    
    //******************TestCase = @402668 *****************************//
    
    @Then("^User_609 Select the Revolving/One-Off option in Main Details tab$")
    public void User_609_select_the_revolvingoneoff_option_in_main_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_RevolvingOneOff());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_RevolvingOneOff());
		dropdownhelper.SelectUsingVisibleText(applicationFinancialObj.FacilityType_UpdateAfterApprove_RevolvingOneOff(), "Revolving");
    }

    @Then("^User_609 Enter the value for Max Revolving Times$")
    public void User_609_enter_the_value_for_max_revolving_times() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_MaxRevolvingTimes());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_MaxRevolvingTimes());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_MaxRevolvingTimes());
		applicationFinancialObj.FacilityType_UpdateAfterApprove_MaxRevolvingTimes().clear();
		applicationFinancialObj.FacilityType_UpdateAfterApprove_MaxRevolvingTimes().sendKeys("2");
		applicationFinancialObj.FacilityType_UpdateAfterApprove_MaxRevolvingTimes().sendKeys(Keys.ENTER);
    }

    @And("^User_609 Enable the Subject to Full Repayment$")
    public void User_609_enable_the_subject_to_full_repayment() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_SubjecttoFullRepayment());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_SubjecttoFullRepayment());
    	try {
			if(applicationFinancialObj.FacilityType_UpdateAfterApprove_SubjecttoFullRepayment().isSelected()){
				Assert.assertEquals(applicationFinancialObj.FacilityType_UpdateAfterApprove_SubjecttoFullRepayment().isSelected(), true);
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_SubjecttoFullRepayment());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}   
    }

    @Then("^Click on confirm ok$")
    public void click_on_confirm_ok() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Confirmok());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Confirmok());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Confirmok());  
    }

    @Then("^Click on the Approve screen$")
    public void click_on_the_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Approvescreen());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Approvescreen());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Approvescreen());     
    }

    @Then("^User_609 Click the Code in Approve screen$")
    public void User_609_click_the_code_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Approve_SelectCode());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Approve_SelectCode());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.FacilityType_Approve_SelectCode());  
    }

    @And("^User_609 Enable the Apply Revolving Controls in Main Details tab$")
    public void User_609_enable_the_apply_revolving_controls_in_main_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_ApplyRevolvingControls());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_ApplyRevolvingControls());
		try {
			if(applicationFinancialObj.FacilityType_UpdateAfterApprove_ApplyRevolvingControls().isSelected()){
				Assert.assertEquals(applicationFinancialObj.FacilityType_UpdateAfterApprove_ApplyRevolvingControls().isSelected(), true);
			}
			else {
				clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_ApplyRevolvingControls());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
			
		}
    }

    @And("^User_609 Enter the value for Manual Revolving Minimum Utilization$")
    public void User_609_enter_the_value_for_manual_revolving_minimum_utilization() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_UpdateAfterApprove_ManualRevolvingMinimumUtilization());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_ManualRevolvingMinimumUtilization());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_UpdateAfterApprove_ManualRevolvingMinimumUtilization());
		applicationFinancialObj.FacilityType_UpdateAfterApprove_ManualRevolvingMinimumUtilization().clear();
		applicationFinancialObj.FacilityType_UpdateAfterApprove_ManualRevolvingMinimumUtilization().sendKeys("3");
		applicationFinancialObj.FacilityType_UpdateAfterApprove_ManualRevolvingMinimumUtilization().sendKeys(Keys.ENTER);
    }

    @And("^click on ok$")
    public void click_on_ok() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Ok());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Ok());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Ok());         
    }

    @And("^User_609 Select the Code in Approve screen$")
    public void User_609_select_the_code_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Approve_Code());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Approve_Code());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Approve_Code());
		applicationFinancialObj.FacilityType_Approve_Code().sendKeys(testData.get("Code"));
		applicationFinancialObj.FacilityType_Approve_Code().sendKeys(Keys.ENTER);
		//table[@id='fmsFacilityTypeListGridTbl_Id_P008P']/tbody/tr[2]/td[text()='221']
		//String xpath ="//td[text()='"+String.valueOf(testData.get("Code"))+"']";
		String xpath ="//table[@id='fmsFacilityTypeListGridTbl_Id_P008P']/tbody/tr[2]/td[text()='"+String.valueOf(testData.get("Code"))+"']";
		//String xpath ="//td[text()='"+String.valueOf("221")+"']";
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
		/*
		applicationFinancialObj.FacilityType_Approve_Code().sendKeys("221");
		applicationFinancialObj.FacilityType_Approve_Code().sendKeys(Keys.ENTER); 
		*/
		Thread.sleep(2000);
    }

    @And("^Click on Approve in Approve screen$")
    public void click_on_approve_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FacilityType_Approve_Approve());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FacilityType_Approve_Approve());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FacilityType_Approve_Approve());         
    }

//****************************TestCase = @402668_01*****************************//
    
    @Then("^Click on the Request For Financing	submenu$")
    public void click_on_the_request_for_financingsubmenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing());
    }
      
    @Then("^Select the Reason For Submission field$")
    public void select_the_reason_for_submission_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission());
		dropdownhelper.SelectUsingVisibleText(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission(), "New Request");
    }

    @Then("^Enter the value for Facility Type field in Facility Type Details tab$")
    public void enter_the_value_for_facility_type_field_in_facility_type_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType());
		applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType().sendKeys("221");
    }

    @Then("^Check the Max Revolving Times field is set$")
    public void check_the_max_revolving_times_field_is_set() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_MaxRevolvingTimes());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_MaxRevolvingTimes());
		applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_MaxRevolvingTimes().getText();
    }

    @Then("^Check the Current Utilization is disabled$")
    public void check_the_current_utilization_is_disabled() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_CurrentUtilization());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_CurrentUtilization());
		try {
			Assert.assertTrue(!applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_CurrentUtilization().isEnabled());
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
    }

    @And("^Click on the REQUEST FOR FINANCIN menu$")
    public void click_on_the_request_for_financin_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN());
    }

    @And("^Click on the Maintenance screen$")
    public void click_on_the_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
    }

    @And("^Enter the value in Customer field$")
    public void enter_the_value_in_customer_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer());
		applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer().sendKeys("727");
    }

    @And("^Select the Revolving/One-Off option in Facility Type Details tab$")
    public void select_the_revolvingoneoff_option_in_facility_type_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_RevolvingOneOff());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_RevolvingOneOff());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_RevolvingOneOff());	
    }

    @And("^Check the Subject to Full Repayment is enabled$")
    public void check_the_subject_to_full_repayment_is_enabled() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_SubjecttoFullRepayment());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_SubjecttoFullRepayment());
		try {
			Assert.assertTrue(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_SubjecttoFullRepayment().isEnabled());
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
    }

    @And("^Check the Total Approvals is disabled$")
    public void check_the_total_approvals_is_disabled() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalApprovals());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalApprovals());
		try {
			Assert.assertTrue(!applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalApprovals().isEnabled());
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
    }
    
    @And("^Click on the search icon for Facility Type$")
    public void click_on_the_search_icon_for_facility_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch());
    }
    
    @And("^Click on the search icon for Customer$")
    public void click_on_the_search_icon_for_customer() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search());
    }
    
    //************************ TestCase = @300125 ********************************//
    
    @And("^Click on the Facilities Management submenu in wifak application submenu$")
    public void click_on_the_facilities_management_submenu_in_wifak_application_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement());
    }

    @And("^Click on the Query screen$")
    public void click_on_the_query_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query());
    }
    
    @And("^Search for the code in Query screen$")
    public void search_for_the_code_in_query_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_Code());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_Code());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_Code());
		applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_Code().sendKeys("1378");
		applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_Code().sendKeys(Keys.ENTER);
    }

    @And("^Select the code in Query screen$")
    public void select_the_code_in_query_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_SelectCode());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_SelectCode());
		clicksAndActionHelper.doubleClick(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_SelectCode());
    }
    
    @And("^Click on the Facility Drawdown Details tab in Query screen$")
    public void click_on_the_facility_drawdown_details_tab_in_query_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_FacilityDrawdownDetails());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_FacilityDrawdownDetails());
		clicksAndActionHelper.clickOnElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_FacilityDrawdownDetails());
    }
    
    @Then("^Check for the Unutilized Amount shows negative value or not$")
    public void check_for_the_unutilized_amount_shows_negative_value_or_not() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_FacilityDrawdownDetails_UnutilizedAmount());
		clicksAndActionHelper.moveToElement(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_FacilityDrawdownDetails_UnutilizedAmount());
		try {
			double UnutilizedAmount = Double.parseDouble(applicationFinancialObj.Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_FacilityDrawdownDetails_UnutilizedAmount().getText());  
			Assert.assertEquals(UnutilizedAmount, UnutilizedAmount>=0);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
    }
 
}
