package stepdefinitions;

import java.awt.Robot;
import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
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
		Collateral_Management_Obj.enter_Code_InMaintenance_under_Collateral_Type_607().sendKeys("361");
	   
	}

	@Given("User_607 Enter brief Description In Mainteance Under Collateral Type")
	public void user_enter_brief_description_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_Brief_Description_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_Brief_Description_InMaintenance_under_Collateral_Type_607().sendKeys("vai");
	   
	}

	@Given("User_607 Enter long Description In Mainteance Under Collateral Type")
	public void user_enter_long_description_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_Long_Description_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_Long_Description_InMaintenance_under_Collateral_Type_607().sendKeys("vai");
	   
	}

	@Given("User_607 Enter Two input in empty field In Mainteance Under Collateral Type")
	public void user_enter_two_input_in_empty_field_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_FirstEmpty_Field_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_FirstEmpty_Field_InMaintenance_under_Collateral_Type_607().sendKeys("vai");
	   
	}

	@Given("User_607 Enter Facility Coverage In Mainteance Under Collateral Type")
	public void user_enter_facility_coverage_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.enter_SecondEmpty_Field_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.enter_SecondEmpty_Field_InMaintenance_under_Collateral_Type_607().sendKeys("vai");
	   
	}

	@Given("User_607 Check apply favoring party In Mainteance Under Collateral Type")
	public void user_check_apply_favoring_party_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.Apply_Favoring_PartyCheckbox_InMaintenance_under_Collateral_Type_607());
		Collateral_Management_Obj.Apply_Favoring_PartyCheckbox_InMaintenance_under_Collateral_Type_607().click();
	   
	}

	@Given("User_607 Select assert type In Mainteance Under Collateral Type")
	public void user_select_assert_type_in_mainteance_under_collateral_type() {
		waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SelectAsset_Type_InMaintenance_under_Collateral_Type_607());
		DropDownHelper.SelectUsingVisibleText(Collateral_Management_Obj.SelectAsset_Type_InMaintenance_under_Collateral_Type_607(), "Vehicle");
	   
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
		Collateral_Management_Obj.SearchRecord_in_Approve_under_Collateral_Type_607().sendKeys("361",Keys.ENTER);
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
		Collateral_Management_Obj.SearchRecord_in_Update_after_Approve_under_Collateral_Type_607().sendKeys("361");
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
		Collateral_Management_Obj.edit_Brief_Description_in_Update_after_Approve_under_Collateral_Type_607().sendKeys("vaii");
	   
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
   	Collateral_Management_Obj.mainInfoCollateralType().sendKeys("564");
 //   	Collateral_Management_Obj.mainInfoCollateralType().sendKeys(testData.get("Collateral Type"));
    	Collateral_Management_Obj.mainInfoCollateralType().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Collateral_Management_Obj.mainInfoCollateralType().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    	
    }

    @And("^User give the valid from date under main information in Collateral Management main Screen$")
    public void user_give_the_valid_from_date_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoValidFromDate());
    	Collateral_Management_Obj.mainInfoValidFromDate().sendKeys("16/01/2021");
    	//    	Collateral_Management_Obj.mainInfoValidFromDate().sendKeys(testData.get("Valid From Date"));
    	Collateral_Management_Obj.mainInfoValidFromDate().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(Collateral_Management_Obj.mainInfoValidFromDate().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User give the valid to date under main information in Collateral Management main Screen$")
    public void user_give_the_valid_to_date_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoValidToDate());
   	Collateral_Management_Obj.mainInfoValidToDate().sendKeys("16/01/2021");
 //    	Collateral_Management_Obj.mainInfoValidToDate().sendKeys(testData.get("Valid To Date"));
    	Collateral_Management_Obj.mainInfoValidToDate().sendKeys(Keys.TAB);
    	
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
    	Collateral_Management_Obj.mainInfoBriefDescrip().sendKeys("Test");
    	//   	Collateral_Management_Obj.mainInfoBriefDescrip().sendKeys(testData.get("Brief Description"));
    }

    @And("^User enter the long description under main information in Collateral Management main Screen$")
    public void user_enter_the_long_description_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoLongDescrip());
   	Collateral_Management_Obj.mainInfoLongDescrip().sendKeys("Test");
 //    	Collateral_Management_Obj.mainInfoLongDescrip().sendKeys(testData.get("Long Description"));
    }

    @And("^User enter the Collateral currency under main information in Collateral Management main Screen$")
    public void user_enter_the_collateral_currency_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.mainInfoCollateralCurrency());
    	Collateral_Management_Obj.mainInfoCollateralCurrency().sendKeys("840");
    //	Collateral_Management_Obj.mainInfoCollateralCurrency().sendKeys(testData.get("Collateral Currency"));
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
    	Collateral_Management_Obj.CollateralCashDetailsAmount().sendKeys("1000");
    //	Collateral_Management_Obj.CollateralCashDetailsAmount().sendKeys(testData.get("Amount"));
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
	
	@Given("User_607 Search Application Ref In mainteance under Facility Management")
	public void user_search_application_ref_in_mainteance_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.SearchApplication_Ref_Inmainteance_under_FacilityManagement_607());
    	Collateral_Management_Obj.SearchApplication_Ref_Inmainteance_under_FacilityManagement_607().sendKeys("4746",Keys.TAB);
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
    	Collateral_Management_Obj.EnterCodeInFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607().sendKeys("1125",Keys.TAB);
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

	@Given("User_607 Click Approve button In approve Reject under Facility Management")
	public void user_click_approve_button_in_approve_reject_under_facility_management() {
    	waitHelper.waitForElementwithFluentwait(driver, Collateral_Management_Obj.ClickApproveBtn_InapproveReject_under_FacilityManagement_607());
    	Collateral_Management_Obj.ClickApproveBtn_InapproveReject_under_FacilityManagement_607().click();
	    
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

}
