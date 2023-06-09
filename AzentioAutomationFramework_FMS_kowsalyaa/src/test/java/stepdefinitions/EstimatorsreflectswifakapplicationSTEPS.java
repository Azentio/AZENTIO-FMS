package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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
	String financeamt;
	
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
	    
	    //@584744
	    
	    @And("^Click the UpdateafterApprove under application for financial facilities$")
	    public void click_the_updateafterapprove_under_application_for_financial_facilities() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.applicationforfinancialfacilitiesupdateafterapprove());
	    	coreestimatesreflects.applicationforfinancialfacilitiesupdateafterapprove().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.applicationforfinancialfacilitiesupdateafterapproveclearbtn());
	    	coreestimatesreflects.applicationforfinancialfacilitiesupdateafterapproveclearbtn().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.applicationforfinancialfacilitiesupdateafterapproveclearbtnfirstretrivedata());
	    	clickandactionhelper.doubleClick(coreestimatesreflects.applicationforfinancialfacilitiesupdateafterapproveclearbtnfirstretrivedata());
	        
	    }
	    
	    @And("^Enter the downpayment Amount in Additional details$")
	    public void enter_the_downpayment_amount_in_additional_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.additionaldetailsdownpayment());
	    	coreestimatesreflects.additionaldetailsdownpayment().sendKeys("2",Keys.TAB);
	    	for(int i = 0; i <= 500; i++) {
	            try {
	                if(!(coreestimatesreflects.additionaldetailsdownpayment().getAttribute("prevvalue").isBlank())) {
	                    break;
	                }
	            } catch (Exception e) {
	                // TODO: handle exception
	            }
	        }
	    	
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.additionaldetailsfinanceamount());
	    	financeamt = coreestimatesreflects.additionaldetailsfinanceamount().getAttribute("prevvalue");
	        System.out.println(financeamt);
	    }

	 

	    @And("^Doubletap the retrived data$")
	    public void doubletap_the_retrived_data() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.limitdetailsretrivedatadoubletap());
	    	clickandactionhelper.doubleClick(coreestimatesreflects.limitdetailsretrivedatadoubletap());
	        
	    }

	 

	    @And("^Enter the facility value under limit details$")
	    public void enter_the_facility_value_under_limit_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.limitdetailsfacilityvalue());
	    	coreestimatesreflects.limitdetailsfacilityvalue().sendKeys("financeamt");
	    }

	 

	    @And("^Enter the downpayment Amount in limit details$")
	    public void enter_the_downpayment_amount_in_limit_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.limitdetailsdownpaymentamount());
	    	coreestimatesreflects.limitdetailsdownpaymentamount().sendKeys("2",Keys.TAB);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.limitdetailsdownpaymentamounteditbutton());
	    	coreestimatesreflects.limitdetailsdownpaymentamounteditbutton().click();
	        
	    }

	 

	    @And("^validate all the above details$")
	    public void validate_all_the_above_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.limitdetailsvalidate());
	    	coreestimatesreflects.limitdetailsvalidate().click();
	        
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.confirmvalidateokbtn());
	    	coreestimatesreflects.confirmvalidateokbtn().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.confirmvalidateokbtnvalidatedsuccessfully());
	    	coreestimatesreflects.confirmvalidateokbtnvalidatedsuccessfully().click();
	        
	    }
	    
	    
	    
	    
	    //771445
	    
	    @And("^Retrive the Cif profile value$")
	    public void retrive_the_cif_profile_value() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.maininformationcifprofilesearchbox());
	    	coreestimatesreflects.maininformationcifprofilesearchbox().sendKeys("5656",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	            try {
	                if(!(coreestimatesreflects.maininformationcifprofilesearchbox().getAttribute("prevvalue").isBlank())) {
	                    break;
	                }
	            } catch (Exception e) {
	                // TODO: handle exception
	            }
	        }
	    	
	    	String attribute = coreestimatesreflects.maininformationcifprofilesearchbox().getAttribute("prevvalue");
	    	Assert.assertEquals("5656", attribute);
	    	

	    }
	    //@759182_Fms_Core
	    
	    @Given("user click the client response under wifak application$")
	    public void user_click_the_client_response_under_wifak_application() {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.wifakapplicationclientresponse());
	    	coreestimatesreflects.wifakapplicationclientresponse().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.wifakapplicationclientresponseclrbtn());
	    	coreestimatesreflects.wifakapplicationclientresponseclrbtn().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.wifakapplicationclientresponseclrbtnfirstretrivedata());
	    	clickandactionhelper.doubleClick(coreestimatesreflects.wifakapplicationclientresponseclrbtnfirstretrivedata());
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.clientresponsereject());
	    	coreestimatesreflects.clientresponsereject().click();
	    	
	    }
	    @Given("user search the rejected data in maintenance")
	    public void user_search_the_rejected_data_in_maintenance() {
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.appforfinancialmanagmentmaintenencefirstsearchbtn());
	    	coreestimatesreflects.appforfinancialmanagmentmaintenencefirstsearchbtn().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.appforfinancialmanagmentmaintenencesecondclrbtn());
	    	coreestimatesreflects.appforfinancialmanagmentmaintenencesecondclrbtn().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.appforfinancialmanagmentmaintenencesecondclrbtnretrivedata());
	    	clickandactionhelper.doubleClick(coreestimatesreflects.appforfinancialmanagmentmaintenencesecondclrbtnretrivedata());
	        
	    }

	    
	    // @749202_Fms_Core
	    @And("user clicks the query menu under facility management")
	    public void user_clicks_the_query_menu_under_facility_management() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.facilitymanagementquerymenu());
	    	coreestimatesreflects.facilitymanagementquerymenu().click();	        
	    }

	    @And("user clicks on the clear button in query under facility management")
	    public void user_clicks_on_the_clear_button_in_query_under_facility_management() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.facilitymanagementquerymenuclearbtn());  
	    	coreestimatesreflects.facilitymanagementquerymenuclearbtn().click();
	    }

	    @And("user validate the retrived records are not duplicate")
	    public void user_validate_the_retrived_records_are_not_duplicate() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, coreestimatesreflects.facilitymanagementquerymenuCode());
	    	List<WebElement> code = driver.findElements(By.xpath("//table[@id='facilityManagementGridTbl_Id_WIFT008QY']//td[@tdlabel='Code']"));
	    	
	    	System.out.println("Code Size: "+code.size());
	    	
	    	for (WebElement webElement : code) {
	            String getCode = webElement.getText();
	            System.out.println(getCode);
	        }
	    }        
}

	    
	    


	


	
	
	
	

	
	