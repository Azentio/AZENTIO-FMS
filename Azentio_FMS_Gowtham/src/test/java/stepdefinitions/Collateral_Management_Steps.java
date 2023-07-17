package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.CommonElements.Collateral_Management_Obj;
import resources.BaseClass;

public class Collateral_Management_Steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Collateral_Management_Obj Collateral_Management_Obj = new Collateral_Management_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path, "Collateral Management", "Data Set ID");
	Map<String, String> testData;
	
	@And("^User_607 update test data for test case no 127727$")
	public void user_update_test_data_for_test_case_no_127727() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("AT_CM_037");
	}
	
	@And("^User_607 update test data for test case no 127735$")
	public void user_update_test_data_for_test_case_no_127735() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("AT_CM_039");
	}
	
	
	@Given("User_607 Click Collateral Type under Parameters")
	public void user_click_collateral_type_under_parameters() {
	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_Collateral_Type_under_Parameters_607());
	Collateral_Management_Obj.Click_Collateral_Type_under_Parameters_607().click();

	}

	@Given("User_607 Click Mainteance Under Collateral Type")
	public void user_click_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_Maintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.Click_Maintenance_under_Collateral_Type_607().click();
	   
	}

	@Given("User_607 Enter Code In Mainteance Under Collateral Type")
	public void user_enter_code_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_Code_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_Code_InMaintenance_under_Collateral_Type_607().sendKeys(testData.get("Code"));
	   
	}

	@Given("User_607 Enter brief Description In Mainteance Under Collateral Type")
	public void user_enter_brief_description_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_Brief_Description_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_Brief_Description_InMaintenance_under_Collateral_Type_607().sendKeys(testData.get("brief Description"));
	   
	}

	@Given("User_607 Enter long Description In Mainteance Under Collateral Type")
	public void user_enter_long_description_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_Long_Description_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_Long_Description_InMaintenance_under_Collateral_Type_607().sendKeys(testData.get("long Description"));
	   
	}

	@Given("User_607 Enter Two input in empty field In Mainteance Under Collateral Type")
	public void user_enter_two_input_in_empty_field_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_FirstEmpty_Field_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_FirstEmpty_Field_InMaintenance_under_Collateral_Type_607().sendKeys(testData.get("Enter First Empty Field"));
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_SecondEmpty_Field_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_SecondEmpty_Field_InMaintenance_under_Collateral_Type_607().sendKeys(testData.get("Enter Second Empty Field"));
	   
	}

	@Given("User_607 Enter Facility Coverage In Mainteance Under Collateral Type")
	public void user_enter_facility_coverage_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_Facility_Coverage_InMaintenance_under_Collateral_Type());
		Collateral_Management_Obj.enter_Facility_Coverage_InMaintenance_under_Collateral_Type().sendKeys(testData.get("Enter Facility Coverage"));
	   
	}

	@Given("User_607 Check apply favoring party In Mainteance Under Collateral Type")
	public void user_check_apply_favoring_party_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Apply_Favoring_PartyCheckbox_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.Apply_Favoring_PartyCheckbox_InMaintenance_under_Collateral_Type_607().click();
	   
	}

	@Given("User_607 Select assert type In Mainteance Under Collateral Type")
	public void user_select_assert_type_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SelectAsset_Type_InMaintenance_under_Collateral_Type_607());
		DropDownHelper.SelectUsingVisibleText(Collateral_Management_Obj.SelectAsset_Type_InMaintenance_under_Collateral_Type_607(), testData.get("Select assert type"));
	   
	}

	@Given("User_607 Save the record In Mainteance Under Collateral Type")
	public void user_save_the_record_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickSave_btn_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.ClickSave_btn_InMaintenance_under_Collateral_Type_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmsavepopupokbutton());
		Collateral_Management_Obj.confirmsavepopupokbutton().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmsavesuccessfullypopup());
		Collateral_Management_Obj.confirmsavesuccessfullypopup().click();
		
	   
	}

	@Given("User_607 Click Approve Under Collateral Type")
	public void user_click_approve_under_collateral_type()  throws Throwable{
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_Approve_under_Collateral_Type_607());
		Collateral_Management_Obj.Click_Approve_under_Collateral_Type_607().click();
	}

	@Given("User_607 Search the record in Approve Under Collateral Type")
	public void user_search_the_record_in_approve_under_collateral_type() {
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SearchRecord_in_Approve_under_Collateral_Type_607());
		Collateral_Management_Obj.SearchRecord_in_Approve_under_Collateral_Type_607().sendKeys(testData.get("Search Record in Approve"),Keys.ENTER);
		Collateral_Management_Obj.SearchRecord_in_Approve_under_Collateral_Type_607().sendKeys(Keys.ENTER);
	}

	@Given("User_607 Select the record in Approve Under Collateral Type")
	public void user_select_the_record_in_approve_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Select_firstRecord_in_approve_under_Collateral_Type_607());
		clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.Select_firstRecord_in_approve_under_Collateral_Type_607());
	   
	}

	@Given("User_607 Approve the record in Approve Under Collateral Type")
	public void user_approve_the_record_in_approve_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ApproveRecord_in_approve_under_Collateral_Type_607());
		Collateral_Management_Obj.ApproveRecord_in_approve_under_Collateral_Type_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmsavepopupokbutton());
		Collateral_Management_Obj.confirmsavepopupokbutton().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmsavesuccessfullypopup());
		Collateral_Management_Obj.confirmsavesuccessfullypopup().click();
	   
	}

	@Given("User_607 Click Update After Approve Under Collateral Type")
	public void user_click_update_after_approve_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_Update_after_Approve_under_Collateral_Type_607());
		Collateral_Management_Obj.Click_Update_after_Approve_under_Collateral_Type_607().click();
	   
	}

	@Given("User_607 Search the record in Update After Approve Under Collateral Type")
	public void user_search_the_record_in_update_after_approve_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SearchRecord_in_Update_after_Approve_under_Collateral_Type_607());
		Collateral_Management_Obj.SearchRecord_in_Update_after_Approve_under_Collateral_Type_607().sendKeys(testData.get("Code"));
		Collateral_Management_Obj.SearchRecord_in_Update_after_Approve_under_Collateral_Type_607().sendKeys(Keys.ENTER);
	}

	@Given("User_607 Select the record in Update After Approve Under Collateral Type")
	public void user_select_the_record_in_update_after_approve_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Select_firstRecord_in_Update_after_Approve_under_Collateral_Type_607());
		clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.Select_firstRecord_in_Update_after_Approve_under_Collateral_Type_607());
	   
	}

	@Given("User_607 Update the brief Description in Update After Approve Under Collateral Type")
	public void user_update_the_brief_description_in_update_after_approve_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.edit_Brief_Description_in_Update_after_Approve_under_Collateral_Type_607());
		Collateral_Management_Obj.edit_Brief_Description_in_Update_after_Approve_under_Collateral_Type_607().click();
		Collateral_Management_Obj.edit_Brief_Description_in_Update_after_Approve_under_Collateral_Type_607().sendKeys(testData.get("Update the brief Description"));
	   
	}

	@Given("User_607 Update the record in Update After Approve Under Collateral Type")
	public void user_update_the_record_in_update_after_approve_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.saveRecord_in_Update_after_Approve_under_Collateral_Type_607());
		Collateral_Management_Obj.saveRecord_in_Update_after_Approve_under_Collateral_Type_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmsavepopupokbutton());
		Collateral_Management_Obj.confirmsavepopupokbutton().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmsavesuccessfullypopup());
		Collateral_Management_Obj.confirmsavesuccessfullypopup().click();
	   
	}
	@Given("User_607 Again Click Approve Under Collateral Type")
	public void user_again_click_approve_under_collateral_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_Approve_under_Collateral_Type_607());
		Collateral_Management_Obj.Click_Approve_under_Collateral_Type_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmsavepopupokbutton());
		Collateral_Management_Obj.confirmsavepopupokbutton().click();

		Thread.sleep(4000);
	}
	
	//127734

	@Given("User_607 Click Collateral Management under Menu Options")
	public void user_collateral_management() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.click_Collateral_Management_under_menu_607());
		Collateral_Management_Obj.click_Collateral_Management_under_menu_607().click();
	}

	@Given("User_607 Click query under Collateral Management")
	public void user_click_query_under_collateral_management() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.click_Query_under_Collateral_Management_607());
		Collateral_Management_Obj.click_Query_under_Collateral_Management_607().click();
	}

	@Given("User_607 Select the record in query under Collateral Management")
	public void user_select_the_record_in_query_under_collateral_management() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.click_ClearSearch_InQuery_under_Collateral_Management_607());
		Collateral_Management_Obj.click_ClearSearch_InQuery_under_Collateral_Management_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Select_firstRecord_InQuery_under_Collateral_Management_607());
		clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.Select_firstRecord_InQuery_under_Collateral_Management_607());
		
	}
	
	@Given("User_607 Check the field are Non editable in query")
	public void user_check_the_field_are_non_editable_in_query() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Check_CollateralType_InQuery_under_Collateral_Management_607());
		String Check = Collateral_Management_Obj.Check_CollateralType_InQuery_under_Collateral_Management_607().getAttribute("readonly");
		Assert.assertEquals(Check, "true");
	}

	@Given("User_607 Check the records in query")
	public void user_check_the_records_in_query() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Check_CollateralType_InQuery_under_Collateral_Management_607());
		String Check = Collateral_Management_Obj.Check_CollateralType_InQuery_under_Collateral_Management_607().getAttribute("prevvalue");
		System.out.println(Check);
		if(Check.isBlank()||Check.isEmpty()) {
			Assert.fail();
		}
	}
	
	//127735
	@And("^User click on the Collateral Management feature$")
    public void user_click_on_the_collateral_management_feature() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Collateral_Management_Obj.FMSCollateralManagement());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.FMSCollateralManagement());
    	Collateral_Management_Obj.FMSCollateralManagement().click();        
    }

    @And("^User click on the Maintanace screen under Collateral Management$")
    public void user_click_on_the_maintanace_screen_under_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.collateralManagementMaintanance());
    	Collateral_Management_Obj.collateralManagementMaintanance().click();
    }

    @And("^User enter the Collateral type under main information in Collateral Management main Screen$")
    public void user_enter_the_collateral_type_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoCollateralType());
   //	Collateral_Management_Obj.mainInfoCollateralType().sendKeys("564");
    	Collateral_Management_Obj.mainInfoCollateralType().sendKeys(testData.get("Collateral Type"));
    	Collateral_Management_Obj.mainInfoCollateralType().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Collateral_Management_Obj.mainInfoCollateralType().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
			}
    	}
    	
    }

    @And("^User give the valid from date under main information in Collateral Management main Screen$")
    public void user_give_the_valid_from_date_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoValidFromDate());
    	//Collateral_Management_Obj.mainInfoValidFromDate().sendKeys("16/01/2021");
       	Collateral_Management_Obj.mainInfoValidFromDate().sendKeys(testData.get("Valid From Date"));
    	Collateral_Management_Obj.mainInfoValidFromDate().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Collateral_Management_Obj.mainInfoValidFromDate().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
			}
    	}
    }

    @And("^User give the valid to date under main information in Collateral Management main Screen$")
    public void user_give_the_valid_to_date_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoValidToDate());
   	Collateral_Management_Obj.mainInfoValidToDate().sendKeys("16/01/2021");
     	Collateral_Management_Obj.mainInfoValidToDate().sendKeys(testData.get("Valid To Date"));
    //	Collateral_Management_Obj.mainInfoValidToDate().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Collateral_Management_Obj.mainInfoValidToDate().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User enter the brief description under main information in Collateral Management main Screen$")
    public void user_enter_the_brief_description_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoBriefDescrip());
    	//Collateral_Management_Obj.mainInfoBriefDescrip().sendKeys("Test");
    	   	Collateral_Management_Obj.mainInfoBriefDescrip().sendKeys(testData.get("Brief Description"));
    }

    @And("^User enter the long description under main information in Collateral Management main Screen$")
    public void user_enter_the_long_description_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoLongDescrip());
   //	Collateral_Management_Obj.mainInfoLongDescrip().sendKeys("Test");
     	Collateral_Management_Obj.mainInfoLongDescrip().sendKeys(testData.get("Long Description"));
    }

    @And("^User enter the Collateral currency under main information in Collateral Management main Screen$")
    public void user_enter_the_collateral_currency_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoCollateralCurrency());
    	//Collateral_Management_Obj.mainInfoCollateralCurrency().sendKeys("840");
    	Collateral_Management_Obj.mainInfoCollateralCurrency().sendKeys(testData.get("Collateral Currency"));
    	Collateral_Management_Obj.mainInfoCollateralCurrency().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Collateral_Management_Obj.mainInfoCollateralCurrencyLabel().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User move to the Collateral cash details tab in Collateral Management main Screen$")
    public void user_move_to_the_collateral_cash_details_tab_in_collateral_management_main_screen() throws Throwable {    	   	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CollateralCashDetailsTab());
    	for (int i = 0; i < 2000; i++) {
			try {
				Collateral_Management_Obj.CollateralCashDetailsTab().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    
    }

    @And("^User click the add new icon under Collateral cash details tab$")
    public void user_click_the_add_new_icon_under_collateral_cash_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CollateralCashDetailsAddIcon());
    	Collateral_Management_Obj.CollateralCashDetailsAddIcon().click();
    }

    @And("^User click the additional reference lookup under Collateral cash details tab$")
    public void user_click_the_additional_reference_lookup_under_collateral_cash_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CollateralCashDetailsAdditionalRefLookup());
    	Collateral_Management_Obj.CollateralCashDetailsAdditionalRefLookup().click();
    }

    @And("^User select the any cy value under additional reference lookup$")
    public void user_select_the_any_cy_value_under_additional_reference_lookup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CollateralCashDetailsAdditionalRefRow1());
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CollateralCashDetailsAdditionalRefCy());
    	clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.CollateralCashDetailsAdditionalRefRow1());
    }

    @And("^User enter the amount value under Collateral cash details tab$")
    public void user_enter_the_amount_value_under_collateral_cash_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CollateralCashDetailsAmount());
    //	Collateral_Management_Obj.CollateralCashDetailsAmount().sendKeys("1000");
    	Collateral_Management_Obj.CollateralCashDetailsAmount().sendKeys(testData.get("Amount"));
    	Collateral_Management_Obj.CollateralCashDetailsAmount().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Collateral_Management_Obj.CollateralCashDetailsAmount().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    	
    }
    
    @When("^User click the save button under Collateral Management main Screen$")
    public void user_click_the_save_button_under_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.collateralManagementMaintananceSaveBtn());
    	Collateral_Management_Obj.collateralManagementMaintananceSaveBtn().click();
    	
    	try {
			for (int i = 0; i < 500; i++) {
				if (Collateral_Management_Obj.ServerLoding_pop().isDisplayed()) {
					Collateral_Management_Obj.ServerLoding_pop().click();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmPopupTitle());
    	Collateral_Management_Obj.confirmPopupOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.successPopupTitle());
    	Collateral_Management_Obj.SuccessPopupOkBtn().click();
    	
    	for (int i = 0; i < 500; i++) {
			try {
				Collateral_Management_Obj.sendAlertPopupClose().click();
		    	break;
			} catch (Exception e) {
			}
		}

    }
    
    @And("^User move to the Approve screen undrer Collateral Management$")
    public void user_move_to_the_approve_screen_undrer_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.collateralManagementApprove());
    	Collateral_Management_Obj.collateralManagementApprove().click();
    }

    @And("^User click the clear button under approve screen in Collateral Management$")
    public void user_click_the_clear_button_under_approve_screen_in_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.collateralManagementApproveClearBtn());
    	Collateral_Management_Obj.collateralManagementApproveClearBtn().click();
    }

    @And("^User double click on the first row in approve screen$")
    public void user_double_click_on_the_first_row_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.collateralManagementApproveFirstRow());
    	clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.collateralManagementApproveFirstRow());
    }
    
    @When("^User click the approve button under Collateral Management approve screen$")
    public void user_click_the_approve_button_under_collateral_management_approve_screen() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Collateral_Management_Obj.collateralManagementApproveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.collateralManagementApproveBtn());
    	Collateral_Management_Obj.collateralManagementApproveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmPopupTitle());
    	Collateral_Management_Obj.confirmPopupOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.successPopupTitle());
    	Collateral_Management_Obj.SuccessPopupOkBtn().click();
    }
    

	@Given("User_607 Click facility Limit Details")
	public void user_click_facility_limit_details() throws Throwable {
		Thread.sleep(10000);
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_facilityLimitDetails_607());
    	Collateral_Management_Obj.Click_facilityLimitDetails_607().click();
	}

	@Given("User_607 Select product class in facility Limit Details")
	public void user_select_product_class_in_facility_limit_details() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.selectRow_InfacilityLimitDetailsTabin_mainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.selectRow_InfacilityLimitDetailsTabin_mainteance_under_FacilityManagement_607().click();

	}

	@Given("User_607 Click Collateral Details in mainteance under Facility Management")
	public void user_click_collateral_details_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_collateralDetails_in_mainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.Click_collateralDetails_in_mainteance_under_FacilityManagement_607().click();
	}

	@Given("User_607 Select row in Collateral Details")
	public void user_select_row_in_collateral_details() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.selectRow_InCollateralDetails_mainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.selectRow_InCollateralDetails_mainteance_under_FacilityManagement_607().click();
	}

	@Given("User_607 Click Query button in Collateral Details")
	public void user_click_query_button_in_collateral_details() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickQuerybtn_InCollateralDetails_mainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.ClickQuerybtn_InCollateralDetails_mainteance_under_FacilityManagement_607().click();
	}

	@Given("User_607 Check Collateral Details are present")
	public void user_check_collateral_details_are_present() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CheckCode_InCollateralDetails_mainteance_under_FacilityManagement_607());
    	String check = Collateral_Management_Obj.CheckCode_InCollateralDetails_mainteance_under_FacilityManagement_607().getAttribute("prevvalue");
		if(check.isBlank()||check.isEmpty()) {
			Assert.fail();
		}
	}
    
	//127765
	
	@Given("User_607 Close All open tabs in wifiak application")
	public void user_close_all_open_tabs_in_wifiak_application() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_Facilities_Maintenance_607());
    	Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_Facilities_Maintenance_607().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_ApproveLevel1Reject_607());
    	Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_ApproveLevel1Reject_607().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_ApproveLevel2Reject_607());
    	Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_ApproveLevel2Reject_607().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_ApproveLevel3Reject_607());
    	Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_ApproveLevel3Reject_607().click();
    	
//    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_Facilities_Maintenance_607());
//    	Collateral_Management_Obj.CloseTab_WIFAK_APPLICATION_WIFAK_APPLICATION_Application_For_Financial_Facilities_Maintenance_607().click();
    	
	}

	@Given("User_607 Close tab Collateral Management Maintenance")
	public void Close_tab_Collateral_Management_Maintenance() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CloseTab_Collateral_Management_Maintenance_607());
    	Collateral_Management_Obj.CloseTab_Collateral_Management_Maintenance_607().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmsavepopupokbutton());
    	Collateral_Management_Obj.confirmsavepopupokbutton().click();

	}
	
	
	@Given("User_607 Search Application Ref In mainteance under Facility Management")
	public void user_search_application_ref_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SearchApplication_Ref_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.SearchApplication_Ref_Inmainteance_under_FacilityManagement_607().sendKeys("4785",Keys.TAB);
	}

	@Given("User_607 Check CIF no In mainteance under Facility Management")
	public void user_check_cif_no_in_mainteance_under_facility_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CheckCIFno_Inmainteance_under_FacilityManagement_607());
    	Thread.sleep(15000);
    	String Check = "";
    	//System.out.println(Check);
    	for (int i = 0; i < 1000; i++) {
    		Check = Collateral_Management_Obj.CheckCIFno_Inmainteance_under_FacilityManagement_607().getAttribute("prevvalue");
			if(!Check.isBlank()||!Check.isEmpty()) {
				break;
			}
		}
    	if (Check.isBlank()||Check.isEmpty()) {
    		//Assert.assertEquals(Check, "727");
    		Assert.fail();
		}
	}
	
	

	@Given("User_607 Click Additional Detail Tab In mainteance under Facility Management")
	public void user_click_additional_detail_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickAdditionalDetailTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.ClickAdditionalDetailTab_Inmainteance_under_FacilityManagement_607().click();
    	
	}

	@Given("User_607 Change Effective Until In Additional DetailTab In mainteance under Facility Management")
	public void user_change_effective_until_in_additional_detail_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ChangeEffective_UntilInAdditionalDetailTab_Inmainteance_under_FacilityManagement_607());
    	clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.ChangeEffective_UntilInAdditionalDetailTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.ChangeEffective_UntilInAdditionalDetailTab_Inmainteance_under_FacilityManagement_607().sendKeys("2022");
	}

	@Given("User_607 Change Unutilized Expiry Date In Additional DetailTab In mainteance under Facility Management")
	public void user_change_unutilized_expiry_date_in_additional_detail_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ChangeUnutilized_Expiry_DateInAdditionalDetailTab_Inmainteance_under_FacilityManagement_607());
    	clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.ChangeUnutilized_Expiry_DateInAdditionalDetailTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.ChangeUnutilized_Expiry_DateInAdditionalDetailTab_Inmainteance_under_FacilityManagement_607().sendKeys("2022");
	}

	@Given("User_607 Click facility Limit Details Tab In mainteance under Facility Management")
	public void user_click_facility_limit_details_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.facilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.facilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().click();
	    
	}

	@Given("User_607 Select Product Class In facility Limit Details Tab In mainteance under Facility Management")
	public void user_select_product_class_in_facility_limit_details_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SelectproductClass_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.SelectproductClass_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().click();
	    
	}

	@Given("User_607 Click collateral Details button In facility Limit Details Tab In mainteance under Facility Management")
	public void user_click_collateral_details_button_in_facility_limit_details_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickcollateralDetails_btn_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.ClickcollateralDetails_btn_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().click();
	    
	}

	@Given("User_607 Click Add button In collateral Details In facility Limit Details Tab In mainteance under Facility Management")
	public void user_click_add_button_in_collateral_details_in_facility_limit_details_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickAddbtn_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607());
    	for (int i = 0; i < 10; i++) {
    		Collateral_Management_Obj.ClickAddbtn_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().click();
		}
	}

	@Given("User_607 Select First Line In collateral Details In facility Limit Details Tab In mainteance under Facility Management")
	public void user_select_first_line_in_collateral_details_in_facility_limit_details_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SelectFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.SelectFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().click();
	    
	}

	@Given("User_607 Click Ok In collateral Details In facility Limit Details Tab In mainteance under Facility Management")
	public void user_click_ok_in_collateral_details_in_facility_limit_details_tab_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SelectFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.SelectFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().click();
	  
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.EnterCodeInFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.EnterCodeInFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().sendKeys("1129",Keys.TAB);
    	
    	
    		for (int i = 0; i < 700; i++) {
    			try {
    			if(Collateral_Management_Obj.confirmsavepopupokbutton().isDisplayed()) {
        			Collateral_Management_Obj.confirmsavepopupokbutton().click();
        			break;
        		}
			
    		
		} catch (Exception e) {
		}	
	}
	}

	@Given("User_607 Save the Record In mainteance under Facility Management")
	public void user_save_the_record_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickOk_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.ClickOk_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickSave_btn_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.ClickSave_btn_Inmainteance_under_FacilityManagement_607().click();
    	
    	for (int i = 0; i < 700; i++) {
			try {
				if (Collateral_Management_Obj.confirmsavepopupokbutton().isDisplayed()) {
					Collateral_Management_Obj.confirmsavepopupokbutton().click();
					break;
				}
			} catch (Exception e) {
			}}
    	
    	for (int i = 0; i < 700; i++) {
			try {
				if (Collateral_Management_Obj.confirmsavesuccessfullypopup().isDisplayed()) {
					Collateral_Management_Obj.confirmsavesuccessfullypopup().click();
					break;
				}
			} catch (Exception e) {
			}}
    	for (int i = 0; i < 700; i++) {
			try {
				if (Collateral_Management_Obj.SendAlert_pop().isDisplayed()) {
					Collateral_Management_Obj.SendAlert_pop().click();
					break;
				}
			} catch (Exception e) {
			}
		}
    	
	}

	@Given("User_607 Click Approve Reject under Facility Management")
	public void user_click_approve_reject_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_approveReject_under_FacilityManagement_607());
    	Collateral_Management_Obj.Click_approveReject_under_FacilityManagement_607().click();
	    
	}

	@Given("User_607 Search record in approve Reject under Facility Management")
	public void user_search_record_in_approve_reject_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_ClearSearch_approveReject_under_FacilityManagement_607());
    	Collateral_Management_Obj.Click_ClearSearch_approveReject_under_FacilityManagement_607().click();
	    
	}

	@Given("User_607 Select Record In approve Reject under Facility Management")
	public void user_select_record_in_approve_reject_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SelectRecord_InapproveReject_under_FacilityManagement_607());
    	clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.SelectRecord_InapproveReject_under_FacilityManagement_607());
	    
	}

	StringBuffer refID = new StringBuffer();
	@Given("User_607 Click Approve button In approve Reject under Facility Management")
	public void user_click_approve_button_in_approve_reject_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickApproveBtn_InapproveReject_under_FacilityManagement_607());
    	Collateral_Management_Obj.ClickApproveBtn_InapproveReject_under_FacilityManagement_607().click();
	    
    	for (int i = 0; i < 1000; i++) {
			try {
				if (Collateral_Management_Obj.confirmsavepopupokbutton().isDisplayed()) {
					Collateral_Management_Obj.confirmsavepopupokbutton().click();
					break;
				}
			} catch (Exception e) {
			}}
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ValidateSuccessMsg());
    	String SuccessMsg = Collateral_Management_Obj.ValidateSuccessMsg().getText();
		String substring = SuccessMsg.substring(11, 15);
		refID.append(substring);
		System.err.println("Reference Number: " + refID);
	
    	
    	for (int i = 0; i < 700; i++) {
			try {
				if (Collateral_Management_Obj.confirmsavesuccessfullypopup().isDisplayed()) {
					Collateral_Management_Obj.confirmsavesuccessfullypopup().click();
					break;
				}
			} catch (Exception e) {
			}}
    	
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.sendAlertPopup_610());
		for (int i = 0; i < 2000; i++) {
			try {
				Collateral_Management_Obj.sendAlertPopup_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	//flag check and uncheck in params
	
	@And("^User_610 clicks on the parameter module$")
	public void user_clicks_on_the_parameter_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.fmsParamParameter_610());
		Collateral_Management_Obj.fmsParamParameter_610().click();
	}

	@And("^User_610 clicks on the Facility Type feature$")
	public void user_clicks_on_the_facility_type_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.paramFacilityType_610());
		Collateral_Management_Obj.paramFacilityType_610().click();
	}

	@And("^User_610 clicks on the update after approve menu in Facility type$")
	public void user_clicks_on_the_update_after_approve_menu_in_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				Collateral_Management_Obj.facilityTypeUpdateAfterApprove_610());
		Collateral_Management_Obj.facilityTypeUpdateAfterApprove_610().click();
	}

	@And("^User_610 enter the code value in update after approve menu$")
	public void user_enter_the_code_value_in_update_after_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.facilityTypeSearchCode_610());
//		String string = testData.get("Facility Type In Facility Limits");
//		System.err.println(string);
		
		Collateral_Management_Obj.facilityTypeSearchCode_610().sendKeys("369", Keys.ENTER);
		
//		Collateral_Management_Obj.facilityTypeSearchCode_610().sendKeys(testData.get("Facility Type"));
//		Collateral_Management_Obj.facilityTypeSearchCode_610().sendKeys(testData.get("Facility Type In Facility Limits"), Keys.ENTER);
	}

	@And("^User_610 double click on the retrieved data in update after approve menu$")
	public void user_double_click_on_the_retrieved_data_in_update_after_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.facilityTypeSearchCodeResult_610());
		
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.facilityTypeSearchCodeResult_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	@Given("User_{int} double click on the retrieved data third row in update after approve menu")
	public void user_double_click_on_the_retrieved_data_third_row_in_update_after_approve_menu(Integer int1) {
     waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.facilityTypeSearchCodeResultRow3_610());
		
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.facilityTypeSearchCodeResultRow3_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_610 clicks on the facility details tab in update after approve$")
	public void user_clicks_on_the_facility_details_tab_in_update_after_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.facilityTypeFacilityDetails_610());
		Collateral_Management_Obj.facilityTypeFacilityDetails_610().click();
	}

	@And("^User_610 clicks on the STP Facility Requirements option$")
	public void user_clicks_on_the_stp_facility_requirements_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.STPFacilityReq_610());
		Collateral_Management_Obj.STPFacilityReq_610().click();
	}

	@And("^User_610 check the Customer Grading flag$")
	public void user_check_the_customer_grading_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.customerGradingFlag_610());
		WebElement customerGradingFlag = Collateral_Management_Obj.customerGradingFlag_610();
		if (!(customerGradingFlag.isSelected())) {
			customerGradingFlag.click();
		}
	}

	@And("^User_610 check the Overwrite Grading flag$")
	public void user_check_the_overwrite_grading_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.OverwriteGradingFlag_610());
		WebElement overwriteGradingFlag = Collateral_Management_Obj.OverwriteGradingFlag_610();
		if (!(overwriteGradingFlag.isSelected())) {
			overwriteGradingFlag.click();
		}
	}

	@And("^User_610 check the Credit Review flag$")
	public void user_check_the_credit_review_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.creditReviewFlag_610());
		WebElement creditReviewFlag = Collateral_Management_Obj.creditReviewFlag_610();
		Collateral_Management_Obj.creditReviewFlag_610().click();
		if (!(creditReviewFlag.isSelected())) {
			creditReviewFlag.click();
		}
	}

	@And("^User_610 check the Committee Approval flag$")
	public void user_check_the_committee_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.committeeApprovalFlag_610());
		WebElement committeeApprovalFlag = Collateral_Management_Obj.committeeApprovalFlag_610();
		if (!(committeeApprovalFlag.isSelected())) {
			committeeApprovalFlag.click();
		}
	}
	
//	@And("^User_610 check the Committee Approval flag$")
//	public void user_uncheck_the_committee_approval_flag() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.committeeApprovalFlag_610());
//		WebElement committeeApprovalFlag = Collateral_Management_Obj.committeeApprovalFlag_610();
//		if (!(committeeApprovalFlag.isSelected())) {
//			committeeApprovalFlag.click();
//		}
//	}

	@And("^User_610 check the Credit Authorization flag$")
	public void user_check_the_credit_authorization_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.creditAuthorzieFlag_610());
		WebElement creditAuthorzieFlag = Collateral_Management_Obj.creditAuthorzieFlag_610();
		if (!(creditAuthorzieFlag.isSelected())) {
			creditAuthorzieFlag.click();
		}
	}
	
	@And("^User_610 uncheck the Credit Authorization flag$")
	public void user_uncheck_the_credit_authorization_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.creditAuthorzieFlag_610());
		WebElement creditAuthorzieFlag = Collateral_Management_Obj.creditAuthorzieFlag_610();
		if ((creditAuthorzieFlag.isSelected())) {
			creditAuthorzieFlag.click();
		}
	}

	@And("^User_610 check the Issue Facility Offer flag$")
	public void user_check_the_issue_facility_offer_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.issueFacilityOfferFlag_610());
		WebElement issueFacilityOfferFlag = Collateral_Management_Obj.issueFacilityOfferFlag_610();
		if (!(issueFacilityOfferFlag.isSelected())) {
			issueFacilityOfferFlag.click();
		}
	}

	@And("^User_610 check the Client Response flag$")
	public void user_check_the_client_response_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.clientResponseFlag_610());
		WebElement clientResponseFlag = Collateral_Management_Obj.clientResponseFlag_610();
		if (!(clientResponseFlag.isSelected())) {
			clientResponseFlag.click();
		}
	}

	@And("^User_610 check the Document Validation flag$")
	public void user_check_the_document_validation_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.documentValidationFlag_610());
		WebElement documentValidationFlag = Collateral_Management_Obj.documentValidationFlag_610();
		if (!(documentValidationFlag.isSelected())) {
			documentValidationFlag.click();
		}
	}

	@And("^User_610 check the Final Approval flag$")
	public void user_check_the_final_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.finalApprovalFlag_610());
		WebElement finalApprovalFlag = Collateral_Management_Obj.finalApprovalFlag_610();
		if (!(finalApprovalFlag.isSelected())) {
			finalApprovalFlag.click();
		}
	}

	@And("^User_610 check the Create Active Facility If Within Limits flag$")
	public void user_check_the_create_active_facility_if_within_limits_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.createActiveFacilityFlag_610());
		WebElement createActiveFacilityFlag = Collateral_Management_Obj.createActiveFacilityFlag_610();
		if (!(createActiveFacilityFlag.isSelected())) {
			createActiveFacilityFlag.click();
		}
	}

	@And("^User_610 Check the Automatically Approve Facility If Within Limits flag$")
	public void user_check_the_automatically_approve_facility_if_within_limits_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.autoApproveFacilityFlag_610());
		WebElement autoApproveFacilityFlag = Collateral_Management_Obj.autoApproveFacilityFlag_610();
		if (!(autoApproveFacilityFlag.isSelected())) {
			autoApproveFacilityFlag.click();
		}
	}

	@When("^User_610 clicks on the Update button$")
	public void user_clicks_on_the_update_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Collateral_Management_Obj.updateAfterApproveUpdateBtn_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.updateAfterApproveUpdateBtn_610());
		Collateral_Management_Obj.updateAfterApproveUpdateBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmPopupOkBtn());
		Collateral_Management_Obj.confirmPopupOkBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SuccessPopupOkBtn());
		Collateral_Management_Obj.SuccessPopupOkBtn().click();
	}

	@And("^User_610 after the update go to the Approve menu$")
	public void user_after_the_update_go_to_the_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.facilityTypeApproveMenu_610());
		Collateral_Management_Obj.facilityTypeApproveMenu_610().click();
	}

	@And("^User_610 enter the code value in Approve menu$")
	public void user_enter_the_code_value_in_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.approveSearchCode_610());
		// Collateral_Management_Obj.approveSearchCode_610().sendKeys(testData.get("Search
		// Code"),Keys.ENTER);
		Collateral_Management_Obj.approveSearchCode_610().sendKeys("369", Keys.ENTER);
	}

	@And("^User_610 double click on the retrieved data in Approve menu$")
	public void user_double_click_on_the_retrieved_data_in_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.approveSearchCodeResult_610());
		clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.approveSearchCodeResult_610());
	}

	@When("^User_610 clicks on the Approve button in Approve menu under Facility Type$")
	public void user_clicks_on_the_approve_button_in_approve_menu_under_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.facilityTypeApproveBtn_610());
		
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(Collateral_Management_Obj.facilityTypeApproveBtn_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.facilityTypeApproveBtn_610());
		Collateral_Management_Obj.facilityTypeApproveBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.confirmPopupOkBtn());
		Collateral_Management_Obj.confirmPopupOkBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SuccessPopupOkBtn());
		Collateral_Management_Obj.SuccessPopupOkBtn().click();
	}
	
	//cache clear
	@And("User_607 click Technical details")
    public void user_607_click_technical_details() {
		 waitHelper.waitForElementwithFluentwait(driver,Collateral_Management_Obj.technicalDetails_607());
  	  clicksAndActionsHelper.moveToElement(Collateral_Management_Obj.technicalDetails_607());
  	  clicksAndActionsHelper.clickOnElement(Collateral_Management_Obj.technicalDetails_607());
    }

	@And("User_607 click clear caches")
	public void user_607_click_clear_caches() {
		waitHelper.waitForElementwithFluentwait(driver,
				Collateral_Management_Obj.FSM_ClearCacheInTechnicalDetailsIcon_607());
		clicksAndActionsHelper.moveToElement(Collateral_Management_Obj.FSM_ClearCacheInTechnicalDetailsIcon_607());
		clicksAndActionsHelper.clickOnElement(Collateral_Management_Obj.FSM_ClearCacheInTechnicalDetailsIcon_607());
	}

	@And("^User_607 Click the ok button$")
	public void user_607_click_the_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Ok());
		clicksAndActionsHelper.clickOnElement(Collateral_Management_Obj.Ok());
	}

	
	
	
	//127773
	
	@Given("User_607 Close WIFAK APPLICATION WIFAKAPPLICATION Facilities Management Maintenance tab")
	public void user_close_wifak_application_wifakapplication_facilities_management_maintenance_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Close_WIFAKAPPLICATION_WIFAKAPPLICATION_FacilitiesManagement_Maintenance_tab_607());
    	Collateral_Management_Obj.Close_WIFAKAPPLICATION_WIFAKAPPLICATION_FacilitiesManagement_Maintenance_tab_607().click();
		
	}

	@Given("User_607 Search the Facilities in Maintenance under Facilities Management")
	public void user_search_the_facilities_in_maintenance_under_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Click_search_in_mainteance_Under_facilitiesMainteance_607());
    	Collateral_Management_Obj.Click_search_in_mainteance_Under_facilitiesMainteance_607().click();
		
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.searchCode_in_mainteance_Under_facilitiesMainteance_607());
    	Collateral_Management_Obj.searchCode_in_mainteance_Under_facilitiesMainteance_607().sendKeys(refID);
    	Collateral_Management_Obj.searchCode_in_mainteance_Under_facilitiesMainteance_607().sendKeys(Keys.ENTER);
	}

	@Given("User_607 Check the Facilities in Maintenance under Facilities Management")
	public void user_check_the_facilities_in_maintenance_under_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SelectRecord_in_mainteance_Under_facilitiesMainteance_607());
    	clicksAndActionsHelper.doubleClick(Collateral_Management_Obj.SelectRecord_in_mainteance_Under_facilitiesMainteance_607());
		
	}
	
	
	//@127822
	
	@Given("User_607 Wait to load CIF no In mainteance under Facility Management")
	public void user_Wait_to_load_cif_no_in_mainteance_under_facility_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.CheckCIFno_Inmainteance_under_FacilityManagement_607());
    	Thread.sleep(15000);
    	String Check = "";
    	//System.out.println(Check);
    	for (int i = 0; i < 1000; i++) {
    		Check = Collateral_Management_Obj.CheckCIFno_Inmainteance_under_FacilityManagement_607().getAttribute("prevvalue");
			if(!Check.isBlank()||!Check.isEmpty()) {
				break;
			}
		}
    	if (Check.isBlank()||Check.isEmpty()) {
			Assert.fail();
		}
	}
	
	
	
	
	

}
