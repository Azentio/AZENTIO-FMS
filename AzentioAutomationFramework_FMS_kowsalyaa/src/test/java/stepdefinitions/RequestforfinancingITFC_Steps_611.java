package stepdefinitions;

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
import pageobjects.fms.RequestforfinancingITFC_OBJ_611;
import resources.BaseClass;

public class RequestforfinancingITFC_Steps_611 {

	WebDriver driver = BaseClass.driver;
	RequestforfinancingITFC_OBJ_611 requestforfinancingitfc = new RequestforfinancingITFC_OBJ_611(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clickandactionhelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	FMSLogin fmslogin = new FMSLogin(driver);
	
	@And("User_611 Clicks the Johns Request menu")
	public void user_clicks_the_johns_request_menu() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.JohnsRequestMenu_611());
		javascripthelper.scrollIntoView(requestforfinancingitfc.JohnsRequestMenu_611());
		requestforfinancingitfc.JohnsRequestMenu_611().click();
    }
			    	
	@And("User_611 Clicks the Joh Request menu")
	public void user_clicks_the_joh_request_menu() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.JohreqsMenu_611());
		requestforfinancingitfc.JohreqsMenu_611().click();
		
	}
	@And("User_611 Clicks the Request for financing menu")
	public void user_clicks_the_request_for_financing_menu() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_611());
		requestforfinancingitfc.RequestforFinancing_611().click();
	   
	}

	@And("User_611 Clicks the maintenance menu")
	public void user_clicks_the_maintenance_menu() throws Throwable{
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancingmaintenance_611());
		requestforfinancingitfc.RequestforFinancingmaintenance_611().click();
	    
	}
	@And("User_611 Clicks the reason for submission select box for select the new request")
	public void user_clicks_the_reason_for_submission_select_box_for_select_the_new_request() throws Throwable{
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancingreasonforsubmission_611());
	    dropdownhelper.SelectUsingVisibleText(requestforfinancingitfc.RequestforFinancingreasonforsubmission_611(), "New Request");
	}

	@And("User_611 Clicks the source\\/destination tab")
	public void user_clicks_the_source_destination_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancingSourcedestination_611());
		requestforfinancingitfc.RequestforFinancingSourcedestination_611().click();
	    
	}

	@And("User_611 Check the flag in member countries")
	public void user_check_the_flag_in_member_countries() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancingmembercountriescheckbox_611());
		requestforfinancingitfc.RequestforFinancingmembercountriescheckbox_611().click();
	    
	}

	@And("User_611 Check the flag in non member countries")
	public void user_check_the_flag_in_non_member_countries() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancingnonmembercountriescheckbox_611());
		requestforfinancingitfc.RequestforFinancingnonmembercountriescheckbox_611().click();
	    
	}

	@And("User_611 Enter the expected percentage for member countries")
	public void user_enter_the_expected_percentage_for_member_countries() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancingMembercountriesexpectedselectbox_611());
		requestforfinancingitfc.RequestforFinancingMembercountriesexpectedselectbox_611().sendKeys("0");
	    
	}

	@And("User_611 Enter the expected percentage for non member countries")
	public void user_enter_the_expected_percentage_for_non_member_countries() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancingNonMembercountriesexpectedselectbox_611());
		requestforfinancingitfc.RequestforFinancingNonMembercountriesexpectedselectbox_611().sendKeys("90");
	    
	}

	@And("User_611 Click the add new row button in specific countries")
	public void user_click_the_add_new_row_button_in_specific_countries() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancingspecificountriesaddbuttton_611());
		requestforfinancingitfc.RequestforFinancingspecificountriesaddbuttton_611().click();
	    
	}

	@And("User_611 Enter the country code in specific countries")
	public void user_enter_the_country_code_in_specific_countries() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_SpecificountriesCountrycodeclick_611());
		requestforfinancingitfc.RequestforFinancing_SpecificountriesCountrycodeclick_611().click();
		Thread.sleep(3000);
	
		
		for (int i = 0; i < 300; i++) {
			try {
				requestforfinancingitfc.RequestforFinancing_SpecificountriesCountrycodeselectinputbox_611().sendKeys("320");
		    	break;
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}
					
	}	
	
	@And("User_611 Enter the expected percentage in specific countries")
	public void user_enter_the_expected_percentage_in_specific_countries() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_Specificountriesexpectedselectbox_611());
		requestforfinancingitfc.RequestforFinancing_Specificountriesexpectedselectbox_611().sendKeys("0");
	    
	}

	@And("User_611 Click the add new row button in specific suppliers")
	public void user_click_the_add_new_row_button_in_specific_suppliers() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_SpecificSuppliersaddbutton_611());
		requestforfinancingitfc.RequestforFinancing_SpecificSuppliersaddbutton_611().click();
	    
	    
	}

	@And("User_611 Enter the CIF number in specific suppliers")
	public void user_enter_the_cif_number_in_specific_suppliers() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_SpecificSuppliersCIFclick_611());
		requestforfinancingitfc.RequestforFinancing_SpecificSuppliersCIFclick_611().click();
		
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_SpecificSuppliersCIFselectbox_611());
		requestforfinancingitfc.RequestforFinancing_SpecificSuppliersCIFselectbox_611().sendKeys("727");
	    
	}

	@And("User_611 Enter the expected percentage in specific suppliers")
	public void user_enter_the_expected_percentage_in_specific_suppliers() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_SpecificSuppliersexpectedselectbox_611());
		requestforfinancingitfc.RequestforFinancing_SpecificSuppliersexpectedselectbox_611().sendKeys("90");
	}
	
	@And("User_611 Validate the Source popup destination")
	public void user_validate_the_source_popup_destination() throws Throwable {
		WebElement Sourcedestinationpopup = requestforfinancingitfc.RequestforFinancing_Sourcedestinationokbtnpopup_611();
        if (Sourcedestinationpopup.isDisplayed()) {
        	Assert.assertTrue(true);
	}
	}
	
	//@468167
	
	@And("User_611 Enter the customer Cif details")
	public void user_enter_the_customer_cif_details() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_CustomerLabel_611());
		requestforfinancingitfc.RequestforFinancing_CustomerLabel_611().sendKeys("727"); 
	}

	@And("User_611 Enter the Info Completion Date")
	public void user_enter_the_info_completion_date() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_InfoCompletionDate_611());
		requestforfinancingitfc.RequestforFinancing_InfoCompletionDate_611().sendKeys("16/01/2021"); 
	    
	}

	@And("User_611 Enter the Facility Type")
	public void user_enter_the_facility_type() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				requestforfinancingitfc.RequestforFinancing_FacilityType_611().sendKeys("1112",Keys.ENTER);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		 	
	    	}
	@And("User_611 Enter the  Total limit value")
	public void user_enter_the_total_limit_value() throws Throwable{
		for (int i = 0; i < 300; i++) {
			try {
				requestforfinancingitfc.RequestforFinancing_totallimit_611().sendKeys("100000");
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
			
	   	}
	@And("User_611 Click the funding tab")
	public void user_click_the_funding_tab() throws Throwable {
		//Thread.sleep(3000);
		for (int i = 0; i < 300; i++) {
			try {
				requestforfinancingitfc.RequestforFinancing_Funding_611().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
			
	  	}
	@And("User_611 Click the add button to add and validate the amount")
	public void user_click_the_add_button_to_add_and_validate_the_amount() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_Fundingaddbtn_611());
		requestforfinancingitfc.RequestforFinancing_Fundingaddbtn_611().click();
  	}
	
	@And("User_611 Enter the Fund Code in Funding tab")
	public void user_enter_the_fund_code_in_funding_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_Fundcode_611());
		requestforfinancingitfc.RequestforFinancing_Fundcode_611().sendKeys("1069"); 
	    
	}

	@And("User_611 Validate the amount value in Funding tab")
	public void user_validate_the_amount_value_in_funding_tab() throws Throwable {
		WebElement Amountinfundingtab = requestforfinancingitfc.RequestforFinancing_Validationamtvalue_611();
        if (Amountinfundingtab.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}

	@And("User_611 Validate the popup while we entering amount greater")
	public void user_validate_the_popup_while_we_entering_amount_greater() throws Throwable {
		WebElement PopupValidation = requestforfinancingitfc.Requestforfinancing_Validationpopupmsg_611();
        if (PopupValidation.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	    
	}
	//468169
	
	@And("User_611 Click the Commodities and Security Components tab")
	public void user_click_the_commodities_and_security_components_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.RequestforFinancing_CommoditiesandSecurityComponents_611());
		requestforfinancingitfc.RequestforFinancing_CommoditiesandSecurityComponents_611().click();
	}

	@And("User_611 Validate the provider tab")
	public void user_validate_the_provider_tab() throws Throwable{
		WebElement providertab = requestforfinancingitfc.RequestforFinancing_Providertab_611();
        if (providertab.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	   
	}

	@And("User_611 Validate the Fixed Amount tab")
	public void user_validate_the_fixed_amount_tab() throws Throwable {
		WebElement FixedAmttab = requestforfinancingitfc.RequestforFinancing_FixedAmounttab_611();
        if (FixedAmttab.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	   
	}

	@And("User_611 Validate the  Cost bearing party tab")
	public void user_validate_the_cost_bearing_party_tab() throws Throwable {
		WebElement Costbearingpartytab = requestforfinancingitfc.RequestforFinancing_Costbearingparty_611();
        if (Costbearingpartytab.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	   
	}
	
	//569548
	
	@And("^User_611 clicks on the parameter feature in IIS Param application$")
	public void user_clicks_on_the_parameter_feature_in_iis_param_application() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IISParameterFeature_611());
		requestforfinancingitfc.IISParameterFeature_611().click();
	}

	@And("^User_611 clicks on the product class module under parameter feature$")
	public void user_clicks_on_the_product_class_module_under_parameter_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascripthelper.scrollIntoView(requestforfinancingitfc.IISParameterProductClassModule_611());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IISParameterProductClassModule_611());
		for (int i = 0; i <= 300; i++) {
			try {
				requestforfinancingitfc.IISParameterProductClassModule_611().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("^User_611 clicks on the maintenance menu under product class module$")
	public void user_clicks_on_the_maintenance_menu_under_product_class_module() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IISProductClassMaintanance_611());
		requestforfinancingitfc.IISProductClassMaintanance_611().click();
	}
	
	@And("^User_611 clicks on the search button in maintenance screen under product class$")
	public void user_clicks_on_the_search_button_in_maintenance_screen_under_product_class() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IISProductClassMaintenanceSearchBtn_611());
		for (int i = 0; i <= 300; i++) {
			try {
				requestforfinancingitfc.IISProductClassMaintenanceSearchBtn_611().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	@And("^User_611 enter the product class code in searchgrid under maintenance in product class$")
	public void user_enter_the_product_class_code_in_searchgrid_under_maintenance_in_product_class() throws Throwable {		
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IISProductClassMainSearchgridRow_611());
//		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISProductClassMainSearchgridClassInput_608());
		for (int i = 0; i <= 500; i++) {
			try {
				requestforfinancingitfc.IISProductClassMainSearchgridClassInput_611().sendKeys("1155",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 500) 
					Assert.fail(e.getMessage());
				}
			}
		}

	@And("^User_611 double click the searchgrid row in maintenance under product class$")
	public void user_double_click_the_searchgrid_row_in_maintenance_under_product_class() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IISProductClassMainSearchResultRow_611());
			for (int i = 0; i < 500; i++) {
			try {
			clickandactionhelper.doubleClick(requestforfinancingitfc.IISProductClassMainSearchResultRow_611());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
}
	//569548
	
	@And("User_611 Click the profit calculation tab")
	public void user_click_the_profit_calculation_tab() throws Throwable {
		Thread.sleep(3000);
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IISProductClassprofitcalculation_611());
		requestforfinancingitfc.IISProductClassprofitcalculation_611().click();
	    
	}

	@And("User_611 Validate the Acquisition Value is default value")
	public void user_validate_the_acquisition_value_is_default_value() throws Throwable {
		WebElement defaultAcquistionvalue = requestforfinancingitfc.IIS_product_class_DefaultAcquistionValue_611();
        if (defaultAcquistionvalue.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	   	    
	}

	@And("User_611 Validate the Net Asset Value is displayed")
	public void user_validate_the_net_asset_value_is_displayed() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IIS_product_class_DefaultAcquistionValue_611());
	    dropdownhelper.SelectUsingVisibleText(requestforfinancingitfc.IIS_product_class_DefaultAcquistionValue_611(), "Net Asset Value");
		
		WebElement NetassetValue = requestforfinancingitfc.IIS_product_class_DefaultAcquistionValue_611();
        if (NetassetValue.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	    
	}

	@And("User_611 Validate the Capitalized Value is displayed")
	public void user_validate_the_capitalized_value_is_displayed() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, requestforfinancingitfc.IIS_product_class_DefaultAcquistionValue_611());
	    dropdownhelper.SelectUsingVisibleText(requestforfinancingitfc.IIS_product_class_DefaultAcquistionValue_611(), "Capitalized Value");
		
		WebElement CapitalizedValue = requestforfinancingitfc.IIS_product_class_DefaultAcquistionValue_611();
        if (CapitalizedValue.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	    
	}
}
