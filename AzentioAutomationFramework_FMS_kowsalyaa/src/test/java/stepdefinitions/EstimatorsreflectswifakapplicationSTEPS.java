package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.fms.CoreestimatorsreflectswifakapplicationOBJ;
import pageobjects.fms.ParamestimatorsreflectswifakapplicationOBJ;
import resources.BaseClass;

public class EstimatorsreflectswifakapplicationSTEPS {
	WebDriver driver = BaseClass.driver;
	ParamestimatorsreflectswifakapplicationOBJ paramestimatesreflects = new ParamestimatorsreflectswifakapplicationOBJ(driver);
	CoreestimatorsreflectswifakapplicationOBJ coreestimatesreflects = new CoreestimatorsreflectswifakapplicationOBJ(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clickandactionhelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	FMSLogin fmslogin = new FMSLogin(driver);
	
	 @And("^Click the parameters menu in param application$")
	    public void click_the_parameters_menu_in_param_application() throws Throwable {
		 waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.paramparameters());
		 paramestimatesreflects.paramparameters().click();
	        
	    }

	    @And("^click the estimators menu under parameters$")
	    public void click_the_estimators_menu_under_parameters() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.parametersestimators());
			 paramestimatesreflects.parametersestimators().click();
	        
	    }

	    @And("^click  the maintenance under estimators$")
	    public void click_the_maintenance_under_estimators() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.estimatorsmaintenance());
			 paramestimatesreflects.estimatorsmaintenance().click();
	        
	        
	    }

	    @And("^create a estimator code$")
	    public void create_a_estimator_code() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.estimatorscode());
			 paramestimatesreflects.estimatorscode().sendKeys("4444");
			 paramestimatesreflects.estimatorscodetouch().click();
			 
	        
	    }

	    @And("^Enter the value of firstbrief discription$")
	    public void enter_the_value_of_firstbrief_discription() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.briefdiscription());
			 paramestimatesreflects.briefdiscription().sendKeys("testdata");
	        
	    }

	    @And("^Enter the value of firstlong discription$")
	    public void enter_the_value_of_firstlong_discription() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.longdiscription());
			 paramestimatesreflects.longdiscription().sendKeys("testdata");
	        
	    }

	    @And("^Enter the value of secondbrief discription$")
	    public void enter_the_value_of_secondbrief_discription() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.briefdiscriptionarabic());
			 paramestimatesreflects.briefdiscriptionarabic().sendKeys("testdata");
	        
	    }

	    @And("^Enter the value of secondlong discription$")
	    public void enter_the_value_of_secondlong_discription() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.longdiscriptionarabic());
			 paramestimatesreflects.longdiscriptionarabic().sendKeys("testdata");
	        
	        
	    }

	    @And("^Enter the discription address$")
	    public void enter_the_discription_address() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.discriptionaddress());
			 paramestimatesreflects.discriptionaddress().sendKeys("estimators");
	        
	    }

	    @And("^Enter the mobile number$")
	    public void enter_the_mobile_number() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.mobilenumber());
			 paramestimatesreflects.mobilenumber().sendKeys("3542186");
	        
	    }

	    @And("^Enter the postal code$")
	    public void enter_the_postal_code() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.postalcode());
			 paramestimatesreflects.postalcode().sendKeys("636006");
	        
	    }
	    @Then("^Save all the estimators details$")
	    public void save_all_the_estimators_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.savebutton());
			 paramestimatesreflects.savebutton().click();
	       
	    }

	    @And("^Click the approve Menu$")
	    public void click_the_approve_menu() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.approvescreen());
			 paramestimatesreflects.approvescreen().click();
	        
	    }

	    @And("^Enter a code under approve menu$")
	    public void enter_a_code_under_approve_menu() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.approvescreenclicksearchbox());
			 paramestimatesreflects.approvescreenclicksearchbox().sendKeys("4444");
			 paramestimatesreflects.approvescreenclicksearchbox().sendKeys(Keys.ENTER);
			 clickandactionhelper.doubleClick(paramestimatesreflects.searchboxdoubleclick());
	        
	    }
	    @Then("^Approve the final status$")
	    public void approve_the_final_status() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, paramestimatesreflects.finalapprove());
			 paramestimatesreflects.finalapprove().click();
	       
	    }
	    @And("^Click the first Wifak Appliaction$")
	    public void click_the_first_wifak_appliaction() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.wifakapplication1());
	    	coreestimatesreflects.wifakapplication1().click();
	        
	    }

	    @And("^Click the second Wifak Appliaction$")
	    public void click_the_second_wifak_appliaction() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.wifakapplication2());
	    	coreestimatesreflects.wifakapplication2().click();
	        
	    }

	    @And("^Click the application for financial facilities under second Wifak Appliaction$")
	    public void click_the_application_for_financial_facilities_under_second_wifak_appliaction() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.applicationforfinancialfacilities());
	    	coreestimatesreflects.applicationforfinancialfacilities().click();
	        
	        
	    }

	    @And("^Click the maintenance underapplication for financial facilities$")
	    public void click_the_maintenance_underapplication_for_financial_facilities() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.maintenancemenu());
	    	coreestimatesreflects.maintenancemenu().click();
	        
	    }
	    @And("^Click the Main information$")
	    public void click_the_main_information() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.maininformation());
	    	coreestimatesreflects.maininformation().click();
	        
	    }

	    @And("^Select a new facility under application$")
	    public void select_a_new_facility_under_application() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.selectnewfacility());
	    	dropdownhelper.SelectUsingVisibleValue(coreestimatesreflects.selectnewfacility(), "New Facility");
	        
	    }

	    @And("^Enter the CIF num under cif details$")
	    public void enter_the_cif_num_under_cif_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.cifnumsearchbox());
	    	coreestimatesreflects.cifnumsearchbox().sendKeys("727");
	    	coreestimatesreflects.cifnumsearchbox().sendKeys(Keys.TAB);
	        
	    }

	    @And("^Enter the facility type under facility type details$")
	    public void enter_the_facility_type_under_facility_type_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.facilitytypedetailsfacilitytype());
	    	coreestimatesreflects.facilitytypedetailsfacilitytype().sendKeys("369");
	    	coreestimatesreflects.facilitytypedetailsfacilitytype().sendKeys(Keys.TAB);
	        
	        
	    }

	    @And("^Enter the country of financing under facility type details$")
	    public void enter_the_country_of_financing_under_facility_type_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.facilitytypedetailscountryoffinancing());
	    	coreestimatesreflects.facilitytypedetailscountryoffinancing().sendKeys("320");
	    	coreestimatesreflects.facilitytypedetailscountryoffinancing().sendKeys(Keys.TAB);
	        
	        
	    }

	    @And("^Enter the facility rating under facility type details$")
	    public void enter_the_facility_rating_under_facility_type_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.facilitytypedetailsfacilityrating());
	    	coreestimatesreflects.facilitytypedetailsfacilityrating().sendKeys("2");
	    	coreestimatesreflects.facilitytypedetailsfacilityrating().sendKeys(Keys.TAB);
	        
	    }

	    @And("^Click the Additional details$")
	    public void click_the_additional_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.secondtabadditionaldetails());
	    	coreestimatesreflects.secondtabadditionaldetails().click();	        
	    }

	    @And("^Enter the currency code under Additional details$")
	    public void enter_the_currency_code_under_additional_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.additionaldetailscurrencycode());
	    	coreestimatesreflects.additionaldetailscurrencycode().sendKeys("840");
	    	coreestimatesreflects.additionaldetailscurrencycode().sendKeys(Keys.TAB);
	        
	        
	    }

	    @And("^Enter the total value under Additional details$")
	    public void enter_the_total_value_under_additional_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.additionaldetailstotalvalue());
	    	coreestimatesreflects.additionaldetailstotalvalue().sendKeys("10000");
	    	coreestimatesreflects.additionaldetailstotalvalue().sendKeys(Keys.TAB);
	        
	    }
	    
	    @And("^Click the Document details$")
	    public void click_the_document_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.seventhtabdocumentdetails());
	    	coreestimatesreflects.seventhtabdocumentdetails().click();
	        
	    }

	    @And("^Click the estimators search box$")
	    public void click_the_estimators_search_box() throws Throwable {
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascripthelper.scrollIntoView(coreestimatesreflects.estimatorsnamefirstsearchbox());
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
//	    	Thread.sleep(5000);
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.estimatorsnamefirstsearchbox());
	    	coreestimatesreflects.estimatorsnamefirstsearchbox().click();
	    }
//	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.estimatorsnamefirstsearchbox());
//	    	coreestimatesreflects.estimatorsnamefirstsearchbox().sendKeys("3696");
//	    	coreestimatesreflects.estimatorsnamefirstsearchbox().sendKeys(Keys.TAB);
	    	
	        
	    
	    @Then("^Enter the estimators code$")
	    public void enter_the_ectimators_code() throws Throwable {
	    	Thread.sleep(5000);
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.estimatorsnamesecondsearchbox());
	    	coreestimatesreflects.estimatorsnamesecondsearchbox().sendKeys("4444");
	    	Thread.sleep(5000);
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.retrivedvaluedoubleclick());
	    	clickandactionhelper.doubleClick(coreestimatesreflects.retrivedvaluedoubleclick());
	        Thread.sleep(10000);
	    }
	    


	}


	
	
	
	

	
	