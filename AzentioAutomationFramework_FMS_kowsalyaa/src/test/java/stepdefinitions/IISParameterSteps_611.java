package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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
	ExcelData iisAccrualDealExcelData  = new ExcelData(path,"AccrualDeal_611","DataSet ID");
	Map<String, String> testData;

//	Accrual Deal Feature
//	@AT_AD_004
	@And("^User_611 get the test data for test case AT_AD_004$")
    public void get_the_test_data_for_test_case_AT_AD_004() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_004");
    }
	@And("User_611 clicks the penalty Menu in IIS param application")
	public void user_clicks_the_penalty_feature_in_iis_param_application() {
	}
	 
	@And("User_611 clicks the maintenance menu under penalty screen")
	public void user_clicks_the_maintenance_menu_under_penalty_screen() {
	}
	@And("User_611 Enter and create a code value under maintenance screen")
	public void user_enter_and_create_a_code_value_under_maintenance_screen() {
	   
	}

	@And("User_611 Enter the brief name eng under maintenance screen")
	public void user_enter_the_brief_name_eng_under_maintenance_screen() {

	}
	 
	@And("User_611 Enter the long discription under maintenance screen")
	public void user_enter_the_long_discription_under_maintenance_screen() {

	}
 
	@And("User_611 Enter the charges code under maintenance screen")
	public void user_enter_the_charges_code_under_maintenance_screen() {

	}
	@And("User_611 clicks the save button under maintenance screen")
	public void user_clicks_the_save_button_under_maintenance_screen() {

	}
 
	@And("User_611 Validate the saving record")
	public void user_validate_the_saving_record() {
	  
	}
	
	@And("User_611 Enter the penalty code under maintenance screen")
	public void user_enter_the_penalty_code_under_maintenance_screen() {

	}
	 
	@And("User_611 Edit the brief name eng for updation under maintenance screen")
	public void user_edit_the_brief_name_eng_for_updation_under_maintenance_screen() {

	}
	 
	@And("User_611 Edit the long discription for updation under maintenance screen")
	public void user_edit_the_long_discription_for_updation_under_maintenance_screen() {
		
	}
	 
	@And("User_611 validate the updating record")
	public void user_validate_the_updating_record() {
	}
	 
	@And("User_611 Double tap the creating record for delete the record")
	public void user_double_tap_the_creating_record_for_delete_the_record() {

	}
	 
	@And("User_611 clicks the delete button")
	public void user_clicks_the_delete_button() {
	 
	}
	 
	@And("User_611 Validate the deleting record")
	public void user_validate_the_deleting_record() {
	}
	 
	@And("User_611 clicks the search button under maintenance screen")
	public void user_clicks_the_search_button_under_maintenance_screen() {

	}
 	@And("User_611 clicks the lookup clear button")
	public void user_clicks_the_lookup_clear_button() {

	}
	 
	@And("User_611 Validate the penalty code value under grid list datas")
	public void user_validate_the_penalty_code_value_under_grid_list_datas() {

	}
	@And("User_611 Validate the Brief name value under grid list datas")
	public void user_validate_the_brief_name_value_under_grid_list_datas() {
	 
	}
	 
	@And("user_611 Validate the Long name value under grid list datas")
	public void user_validate_the_long_name_value_under_grid_list_datas() {

	}
	 
	@And("User_611 Validate the Code value field accept only numeric values in maintenance under penalty screen")
	public void user_validate_the_code_value_field_accept_only_numeric_values_in_maintenance_under_penalty_screen() {

	}
	 
	@And("User_611 Validate the Searching button is working properly")
	public void user_validate_the_searching_button_is_working_properly() {

	}
	 
	@And("User_611 Validate the List menu under penalty screen")
	public void user_validate_the_list_menu_under_penalty_screen() {

	}
	@And("User_611 Validate the update after authorize menu under penalty screen")
	public void user_validate_the_update_after_authorize_menu_under_penalty_screen() {

	}
	 
	@And("User_611 Validate the reject menu under penalty screen")
	public void user_validate_the_reject_menu_under_penalty_screen() {

	}
	@And("User_611 Validate the approve menu under penalty screen")
	public void user_validate_the_approve_menu_under_penalty_screen() {
	
	}
	 
	@And("User_611 Validate the sorting functionality")
	public void user_validate_the_sorting_functionality() {

	}

	 
	@And("User_611 close the sorting screen")
	public void user_close_the_sorting_screen() {

	
	}
	 
	@And("User_611 Validate the first button in maintenance under penalty screen")
	public void user_validate_the_first_button_in_maintenance_under_penalty_screen() {

	}
	 
	@And("User_611 Validate the last button in maintenance under penalty screen")
	public void user_validate_the_last_button_in_maintenance_under_penalty_screen() {

	}
	 
	@And("User_611 Validate the Next button in maintenance under penalty screen")
	public void user_validate_the_next_button_in_maintenance_under_penalty_screen() {

	}
	 
	@And("User_611 Validate the previous button in maintenance under penalty screen")
	public void user_validate_the_previous_button_in_maintenance_under_penalty_screen() {

	}
	 
	@And("User_611 close the penalty screen tab")
	public void user_close_the_penalty_screen_tab() {

	}
}
