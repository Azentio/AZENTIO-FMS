package stepdefinitions;

import org.openqa.selenium.WebDriver;
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
	
}
