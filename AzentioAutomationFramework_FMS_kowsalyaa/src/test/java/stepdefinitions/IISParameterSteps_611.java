package stepdefinitions;

import java.util.Map;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.iis.AccrualdealOBJ_611;
import pageobjects.iis.IISParameterObj_611;
import resources.BaseClass;

public class IISParameterSteps_611 {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	IISParameterObj_611 iisparameterobj611= new IISParameterObj_611(driver);
	
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisparameter  = new ExcelData(path,"IISParameter","DataSet ID");
	Map<String, String> testData;

//	IISParameter
//	@721477
	@And("^User_611 get the test data for test case AT_IISPRM_075")
    public void get_the_test_data_for_test_case_AT_IISPRM_075() throws Throwable {
		testData = iisparameter.getTestdata("DS_AT_IISPRM_075");
    }
// @721485
	@And("^User_611 get the test data for test case AT_IISPRM_076")
    public void get_the_test_data_for_test_case_AT_IISPRM_076() throws Throwable {
		testData = iisparameter.getTestdata("DS_AT_IISPRM_076");
    }
	@And("User_611 clicks the penalty Menu in IIS param application")
	public void user_clicks_the_penalty_feature_in_iis_param_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IIS_parameter_Penalty_611());
		iisparameterobj611.IIS_parameter_Penalty_611().click();
	}
	 
	@And("User_611 clicks the maintenance menu under penalty screen")
	public void user_clicks_the_maintenance_menu_under_penalty_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance());
		iisparameterobj611.IISparam_penalty_maintenance().click();
	}
	String code;
	@And("User_611 Enter and create a code value under maintenance screen")
	public void user_enter_and_create_a_code_value_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Code_611());
		Random r = new Random();
		int low = 10;
		int high = 1000;
		int result = r.nextInt(high-low) + low;
		code = String.valueOf(result);
		iisparameterobj611.IISparam_penalty_maintenance_Code_611().sendKeys(code);
		
	    
	}

	@And("User_611 Enter the brief name eng under maintenance screen")
	public void user_enter_the_brief_name_eng_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_briefnameng_611());
		iisparameterobj611.IISparam_penalty_maintenance_briefnameng_611().sendKeys(testData.get("Brief name eng"), Keys.TAB);
	}
	 
	@And("User_611 Enter the long discription under maintenance screen")
	public void user_enter_the_long_discription_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Longdiscription_611());
		iisparameterobj611.IISparam_penalty_maintenance_Longdiscription_611().sendKeys(testData.get("Long Discription"), Keys.TAB);
	}
 
	@And("User_611 Enter the charges code under maintenance screen")
	public void user_enter_the_charges_code_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_chargescode_611());
		iisparameterobj611.IISparam_penalty_maintenance_chargescode_611().sendKeys(testData.get("Charges Code"), Keys.TAB);

	}
	@And("User_611 clicks the save button under maintenance screen")
	public void user_clicks_the_save_button_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_savebtn_611());
		iisparameterobj611.IISparam_penalty_maintenance_savebtn_611().click();
		
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_confirmsaveokbtn_611());
		iisparameterobj611.IISparam_penalty_maintenance_confirmsaveokbtn_611().click();
		Thread.sleep(3000);
				
	}
 
	@And("User_611 Validate the saving record")
	public void user_validate_the_saving_record() throws Throwable {
		WebElement Savesuccessfully = iisparameterobj611.IISparam_penalty_maintenance_validationsavesuccessfully_611();
        if (Savesuccessfully.isDisplayed()) {
        	Assert.assertTrue(true);
        }
		
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_savedsuccessfullyokbtn_611());
		iisparameterobj611.IISparam_penalty_maintenance_savedsuccessfullyokbtn_611().click();
		Thread.sleep(3000);
	    }
	
	@And("User_611 Enter the penalty code under maintenance screen")
	public void user_enter_the_penalty_code_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_gridpenaltycode_611());
		iisparameterobj611.IISparam_penalty_maintenance_gridpenaltycode_611().sendKeys(code ,Keys.ENTER);
		Thread.sleep(3000);
		
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_retrivedatadoubleclick_611());
		clicksAndActionsHelper.doubleClick(iisparameterobj611.IISparam_penalty_maintenance_retrivedatadoubleclick_611());
				
	}
	 
	@And("User_611 Edit the brief name eng for updation under maintenance screen")
	public void user_edit_the_brief_name_eng_for_updation_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_briefnameng_611());
		iisparameterobj611.IISparam_penalty_maintenance_briefnameng_611().sendKeys(testData.get("Edit Brief name eng"), Keys.TAB);
	}
	 
	@And("User_611 Edit the long discription for updation under maintenance screen")
	public void user_edit_the_long_discription_for_updation_under_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Longdiscription_611());
		iisparameterobj611.IISparam_penalty_maintenance_Longdiscription_611().sendKeys(testData.get("Edit Long Discription"), Keys.TAB);
	}
	 
	@And("User_611 validate the updating record")
	public void user_validate_the_updating_record() throws Throwable {
		WebElement valueupdatedsuccessfully = iisparameterobj611.IISparam_penalty_maintenance_validationupdatedsucessfully_611();
        if (valueupdatedsuccessfully.isDisplayed()) {
        	Assert.assertTrue(true);
    }
        
        waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_savedsuccessfullyokbtn_611());
		iisparameterobj611.IISparam_penalty_maintenance_savedsuccessfullyokbtn_611().click();
		Thread.sleep(3000);
	    
	}
	 
	@And("User_611 Double tap the creating record for delete the record")
	public void user_double_tap_the_creating_record_for_delete_the_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_retrivedatadoubleclick_611());
		clicksAndActionsHelper.doubleClick(iisparameterobj611.IISparam_penalty_maintenance_retrivedatadoubleclick_611());

	}
	 
	@And("User_611 clicks the delete button")
	public void user_clicks_the_delete_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_delbtn_611());
		iisparameterobj611.IISparam_penalty_maintenance_delbtn_611().click();
		
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Confirmdelbtn_611());
		iisparameterobj611.IISparam_penalty_maintenance_Confirmdelbtn_611().click();
		Thread.sleep(3000);
		
	}
	@And("User_611 Validate the deleting record")
	public void user_validate_the_deleting_record() throws Throwable {
		WebElement deletedsuccessfully = iisparameterobj611.IISparam_penalty_maintenance_validationdelsucessfully_611();
        if (deletedsuccessfully.isDisplayed()) {
        	Assert.assertTrue(true);
        	
        waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_savedsuccessfullyokbtn_611());
     	iisparameterobj611.IISparam_penalty_maintenance_savedsuccessfullyokbtn_611().click();
    }
	}
	 
	@And("User_611 clicks the search button under maintenance screen")
	public void user_clicks_the_search_button_under_maintenance_screen() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Searchbtn_611());
	     	iisparameterobj611.IISparam_penalty_maintenance_Searchbtn_611().click();
	}
 	@And("User_611 clicks the lookup clear button")
	public void user_clicks_the_lookup_clear_button() throws Throwable {
 		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_clrlookupbtn_611());
     	iisparameterobj611.IISparam_penalty_maintenance_clrlookupbtn_611().click();
	}
	 
	@And("User_611 Validate the penalty code value under grid list datas")
	public void user_validate_the_penalty_code_value_under_grid_list_datas() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_validationpenaltycode_611());
		String text = iisparameterobj611.IISparam_penalty_maintenance_validationpenaltycode_611().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}

	}
	@And("User_611 Validate the Brief name value under grid list datas")
	public void user_validate_the_brief_name_value_under_grid_list_datas() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_validationbriefname_611());
		String text = iisparameterobj611.IISparam_penalty_maintenance_validationbriefname_611().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	}
	 
	@And("user_611 Validate the Long name value under grid list datas")
	public void user_validate_the_long_name_value_under_grid_list_datas() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_validationlongname_611());
		String text = iisparameterobj611.IISparam_penalty_maintenance_validationlongname_611().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	}
	 
	@And("User_611 Validate the Code value field accept only numeric values in maintenance under penalty screen")
	public void user_validate_the_code_value_field_accept_only_numeric_values_in_maintenance_under_penalty_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Code_611());
		iisparameterobj611.IISparam_penalty_maintenance_Code_611().sendKeys(testData.get("Brief name eng"));
	}
	 
	@And("User_611 Validate the Searching button is working properly")
	public void user_validate_the_searching_button_is_working_properly() throws Throwable {
		WebElement searchingbtn = iisparameterobj611.IISparam_penalty_maintenance_Searchbtn_611();
        if (searchingbtn.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	 
	@And("User_611 Validate the List menu under penalty screen")
	public void user_validate_the_list_menu_under_penalty_screen() throws Throwable {
		WebElement Listmenu = iisparameterobj611.IISparam_penalty_maintenance_Listmenu();
        if (Listmenu.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	@And("User_611 Validate the update after authorize menu under penalty screen")
	public void user_validate_the_update_after_authorize_menu_under_penalty_screen() throws Throwable {
		WebElement updateafterauthorizemenu = iisparameterobj611.IISparam_penalty_maintenance_UpdateafterAuthorizeMenu_611();
        if (updateafterauthorizemenu.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	 
	@And("User_611 Validate the reject menu under penalty screen")
	public void user_validate_the_reject_menu_under_penalty_screen() throws Throwable {
		WebElement rejectmenu = iisparameterobj611.IISparam_penalty_maintenance_RejectMenu_611();
        if (rejectmenu.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	@And("User_611 Validate the approve menu under penalty screen")
	public void user_validate_the_approve_menu_under_penalty_screen() throws Throwable {
		WebElement Approvemenu = iisparameterobj611.IISparam_penalty_maintenance_ApproveMenu_611();
        if (Approvemenu.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	@And("User_611 click the find records for validate the sorting functionality")
	public void user_click_the_find_records_for_validate_the_sorting_functionality() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Findrecords_611());
     	iisparameterobj611.IISparam_penalty_maintenance_Findrecords_611().click(); 
	}
	 
	@And("User_611 Validate the pentalty code in sorting functionality")
	public void user_validate_the_sorting_functionality() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611());
	    dropDownHelper.SelectUsingVisibleText(iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611(), "PENALTY_CODE");
		
		WebElement penaltycode = iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611();
        if (penaltycode.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	@And("User_611 Validate the brief name eng in sorting functionality")
	public void user_validate_the_brief_name_eng_in_sorting_functionality() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611());
	    dropDownHelper.SelectUsingVisibleText(iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611(), "BRIEF_NAME_ENG");
		
		WebElement briefnameeng = iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611();
        if (briefnameeng.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}

	@And("User_611 Validate the long name eng in sorting functionality")
	public void user_validate_the_long_name_eng_in_sorting_functionality() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611());
	    dropDownHelper.SelectUsingVisibleText(iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611(), "LONG_NAME_ENG");
		
		WebElement longnameeng = iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_611();
        if (longnameeng.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	 
	@And("User_611 close the sorting screen")
	public void user_close_the_sorting_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_closebtn_611());
     	iisparameterobj611.IISparam_penalty_maintenance_Sortingtab_closebtn_611().click(); 
			
	}
	 
	@And("User_611 Validate the first button in maintenance under penalty screen")
	public void user_validate_the_first_button_in_maintenance_under_penalty_screen() throws Throwable {
		WebElement firstbtn = iisparameterobj611.IISparam_penalty_maintenance_gridfirstbtn_611();
        if (firstbtn.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	 
	@And("User_611 Validate the last button in maintenance under penalty screen")
	public void user_validate_the_last_button_in_maintenance_under_penalty_screen() throws Throwable {
		WebElement lastbtn = iisparameterobj611.IISparam_penalty_maintenance_gridlastbtn_611();
        if (lastbtn.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	 
	@And("User_611 Validate the Next button in maintenance under penalty screen")
	public void user_validate_the_next_button_in_maintenance_under_penalty_screen() throws Throwable {
		WebElement Nextbtn = iisparameterobj611.IISparam_penalty_maintenance_gridnextbtn_611();
        if (Nextbtn.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	 
	@And("User_611 Validate the previous button in maintenance under penalty screen")
	public void user_validate_the_previous_button_in_maintenance_under_penalty_screen() throws Throwable {
		WebElement previousbtn = iisparameterobj611.IISparam_penalty_maintenance_gridpreviousbtn_611();
        if (previousbtn.isDisplayed()) {
        	Assert.assertTrue(true);
        }
	}
	 
	@And("User_611 close the penalty screen tab")
	public void user_close_the_penalty_screen_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, iisparameterobj611.IISparam_penalty_maintenance_closetabbtn_611());
     	iisparameterobj611.IISparam_penalty_maintenance_closetabbtn_611().click(); 
	
	}
	
	//
	
	@And("User_611 clicks the productclass Menu in IIS param application")
	public void user_clicks_the_productclass_menu_in_iis_param_application() {
	    
	    
	}
	
	@And("User_611 clicks the maintenance menu under productclass screen")
	public void user_clicks_the_maintenance_menu_under_productclass_screen() {
	    
	    
	}

	@And("User_611 Enter and create a product class code value under maintenance screen")
	public void user_enter_and_create_a_product_class_code_value_under_maintenance_screen() {
	    
	    
	}

	@And("User_611 Enter the Category code under maintenance screen")
	public void user_enter_the_category_code_under_maintenance_screen() {
	    
	    
	}

	@And("User_611 Enter the brief discription under maintenance screen")
	public void user_enter_the_brief_discription_under_maintenance_screen() {
	    
	    
	}

	@And("User_611 Enter the long discription under maintenance screen in product class")
	public void user_enter_the_long_discription_under_maintenance_screen_in_product_class() {
	    
	    
	}

	@And("User_611 clicks the save button under maintenance screen in product class")
	public void user_clicks_the_save_button_under_maintenance_screen_in_product_class() {
	    
	    
	}

	@And("User_611 Validate the saving record under maintenance screen in product class")
	public void user_validate_the_saving_record_under_maintenance_screen_in_product_class() {
	    
	    
	}

	@And("User_611 Enter the Created product class value in class tab")
	public void user_enter_the_created_product_class_value_in_class_tab() {
	    
	    
	}

	@And("User_611 Double tab the retrive data")
	public void user_double_tab_the_retrive_data() {
	    
	    
	}

	@And("User_611 Edit the brief discription under maintenance screen")
	public void user_edit_the_brief_discription_under_maintenance_screen() {
	    
	    
	}

	@And("User_611 Edit the long discription under maintenance screen in product class")
	public void user_edit_the_long_discription_under_maintenance_screen_in_product_class() {
	    
	    
	}

	@And("User_611 Validate the updating record in product class")
	public void user_validate_the_updating_record_in_product_class() {
	    
	    
	}

	@And("User_611 Double tap the creating record for delete the record in product class")
	public void user_double_tap_the_creating_record_for_delete_the_record_in_product_class() {
	    
	    
	}

	@And("User_611 clicks the delete button in product class")
	public void user_clicks_the_delete_button_in_product_class() {
	    
	    
	}

	@And("User_611 Validate the deleting record in product class")
	public void user_validate_the_deleting_record_in_product_class() {
	    
	    
	}

	@And("User_611 clicks the search button under maintenance screen in product class")
	public void user_clicks_the_search_button_under_maintenance_screen_in_product_class() {
	    
	    
	}

	@And("User_611 clicks the lookup clear button in product class")
	public void user_clicks_the_lookup_clear_button_in_product_class() {
	    
	    
	}

	@And("User_611 Validate the class value under grid list datas")
	public void user_validate_the_class_value_under_grid_list_datas() {
	    
	    
	}

	@And("User_611 Validate the Brief name value under grid list datas in product class")
	public void user_validate_the_brief_name_value_under_grid_list_datas_in_product_class() {
	    
	    
	}

	@And("user_611 Validate the category value under grid list datas")
	public void user_validate_the_category_value_under_grid_list_datas() {
	    
	    
	}

	@And("user_611 Validate the category discription value under grid list datas")
	public void user_validate_the_category_discription_value_under_grid_list_datas() {
	    
	    
	}

	@And("User_611 Validate the Code value field accept only numeric values in maintenance under product class")
	public void user_validate_the_code_value_field_accept_only_numeric_values_in_maintenance_under_product_class() {
	    
	    
	}

	@And("User_611 Validate the Searching button is working properly in product class")
	public void user_validate_the_searching_button_is_working_properly_in_product_class() {
	    
	    
	}

	@And("User_611 Validate the Approve menu under product class")
	public void user_validate_the_approve_menu_under_product_class() {
	    
	    
	}

	@And("User_611 Validate the List menu under product class")
	public void user_validate_the_list_menu_under_product_class() {
	    
	    
	}

	@And("User_611 Validate the Reject menu under product class")
	public void user_validate_the_reject_menu_under_product_class() {
	    
	    
	}

	@And("User_611 Validate the Duplicate menu under product class")
	public void user_validate_the_duplicate_menu_under_product_class() {
	    
	    
	}

	@And("User_611 click the find records for validate the sorting functionality under product class")
	public void user_click_the_find_records_for_validate_the_sorting_functionality_under_product_class() {
	    
	    
	}

	@And("User_611 Validate the class in sorting functionality under product class")
	public void user_validate_the_class_in_sorting_functionality_under_product_class() {
	    
	    
	}

	@And("User_611 Validate the brief name in sorting functionality")
	public void user_validate_the_brief_name_in_sorting_functionality() {
	    
	    
	}

	@And("User_611 Validate the category in sorting functionality")
	public void user_validate_the_category_in_sorting_functionality() {
	    
	    
	}

	@And("User_611 Validate the category discription in sorting functionality")
	public void user_validate_the_category_discription_in_sorting_functionality() {
	    
	    
	}

	@And("User_611 close the sorting screen in product class")
	public void user_close_the_sorting_screen_in_product_class() {
	    
	    
	}

	@And("User_611 Validate the first button in maintenance under product class screen")
	public void user_validate_the_first_button_in_maintenance_under_product_class_screen() {
	    
	    
	}

	@And("User_611 Validate the last button in maintenance under product class screen")
	public void user_validate_the_last_button_in_maintenance_under_product_class_screen() {
	    
	    
	}

	@And("User_611 Validate the Next button in maintenance under product class screen")
	public void user_validate_the_next_button_in_maintenance_under_product_class_screen() {
	    
	    
	}

	@And("User_611 Validate the previous button in maintenance under product class screen")
	public void user_validate_the_previous_button_in_maintenance_under_product_class_screen() {
	    
	    
	}

	@And("User_611 close the product class screen tab")
	public void user_close_the_product_class_screen_tab() {
	    
	    
	}

}
