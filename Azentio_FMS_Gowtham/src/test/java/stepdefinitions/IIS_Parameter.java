package stepdefinitions;

import java.util.Map;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
import pageobjects.IIS_Parameter_Obj;
import resources.BaseClass;

public class IIS_Parameter {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IIS_Parameter_Obj IIS_Parameter_Obj = new IIS_Parameter_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	IIS_Login IIS_Login = new IIS_Login(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData IIS_Params =  new ExcelData(path, "IIS_Parameter", "Data Set ID");
	Map<String, String> testData;
	

	@Given("User_607 Click Promotion Type Under Parameters In IISparam")
	public void user_click_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Promotion_Type_Under_Parameters_In_IISparam_607());
		IIS_Parameter_Obj.Promotion_Type_Under_Parameters_In_IISparam_607().click();
		
	}

	@Given("User_607 Click Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_click_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		IIS_Parameter_Obj.ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().click();
		
	}

	@Given("User_607 Check Code Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_check_code_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Brief Description Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_check_brief_description_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Long Description Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_long_description_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Brief Description In Arabic Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_check_brief_description_in_arabic_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Long Description In Arabic Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_long_description_in_arabic_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
	}

	@Given("User_607 Click Additional Information In Mainteance Under Product Class")
	public void user_click_additional_information_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickAdditional_Information_In_Mainteance_UnderProductClass_607());
		IIS_Parameter_Obj.ClickAdditional_Information_In_Mainteance_UnderProductClass_607().click();
	    
	}

	@Given("User_607 Click limit In Additional Information In Mainteance Under Product Class")
	public void user_click_limit_in_additional_information_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass_607());
		IIS_Parameter_Obj.ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass_607().click();
	    
	}

	@Given("User_607 Check Promotion Type Field In limit In Additional Information In Mainteance Under Product Class")
	public void user_check_promotion_type_field_in_limit_in_additional_information_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607());
		if (!IIS_Parameter_Obj.Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Insurance Type Field In limit In Additional Information In Mainteance Under Product Class")
	public void user_check_insurance_type_field_in_limit_in_additional_information_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607());
		if (!IIS_Parameter_Obj.Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}
	
	
	//721374
	@And ("User_607 get the test data for test ID AT_IISPRM_064")
	public void get_the_test_data_for_test_case_AT_IISPRM_064() throws Throwable {
		testData = IIS_Params.getTestdata("DS_AT_IISPRM_064");
    }
	
	@Given("User_607 Click Desk Management Under Parameters")
	public void user_click_desk_management_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Click_DeskManagement_Under_Parameters_607());
		IIS_Parameter_Obj.Click_DeskManagement_Under_Parameters_607().click();
	}

	@Given("User_607 Click Mainteance Under Desk Management")
	public void user_click_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Click_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.Click_Mainteance_UnderDeskManagement_607().click();
	    
	}

	@Given("User_607 Enter Code In Mainteance Under Desk Management")
	public void user_enter_code_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CodeIn_Mainteance_UnderDeskManagement_607());
		Random r = new Random();
		int low = 10;
		int high = 1000;
		int result = r.nextInt(high-low) + low;
		String code = String.valueOf(result);
		IIS_Parameter_Obj.CodeIn_Mainteance_UnderDeskManagement_607().sendKeys(code);
	    
	}

	@Given("User_607 Enter Brief Description In Mainteance Under Desk Management")
	public void user_enter_brief_description_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.BriefDescriptionIn_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.BriefDescriptionIn_Mainteance_UnderDeskManagement_607().sendKeys(testData.get("Brief Description"),Keys.TAB);
	    
	}

	@Given("User_607 Enter Long Description In Mainteance Under Desk Management")
	public void user_enter_long_description_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LongDescriptionIn_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.LongDescriptionIn_Mainteance_UnderDeskManagement_607().sendKeys(testData.get("Long Description"),Keys.TAB);
	    
	}

	@Given("User_607 Save button In Mainteance Under Desk Management")
	public void user_save_button_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SaveBtnIn_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.SaveBtnIn_Mainteance_UnderDeskManagement_607().click();
	}

	@Given("User_607 Click Ok in Confirm Popup")
	public void user_click_ok_in_confirm_popup() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ConfirmPopup_InIISparam_607());
		IIS_Parameter_Obj.ConfirmPopup_InIISparam_607().click();
	}

	@Given("User_607 Click ok in Success popup")
	public void user_click_ok_in_success_popup() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SuccessPopup_InIISparam_607());
		IIS_Parameter_Obj.SuccessPopup_InIISparam_607().click();
	    
	}

	@Given("User_607 Click Update After Approve Under Desk Management")
	public void user_click_update_after_approve_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickUpdateAfterApprove_Under_DeskManagement_607());
		IIS_Parameter_Obj.ClickUpdateAfterApprove_Under_DeskManagement_607().click();
	}

	@Given("User_607 Search Desk Code In Update After Approve Under Desk Management")
	public void user_search_desk_code_in_update_after_approve_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Search_DeskCode_InUpdateAfterApprove_Under_DeskManagement_607());
		IIS_Parameter_Obj.Search_DeskCode_InUpdateAfterApprove_Under_DeskManagement_607().sendKeys(testData.get("Code"),Keys.ENTER);
	}

	@Given("User_607 Select Record In Desk Code In Update After Approve Under Desk Management")
	public void user_select_record_in_desk_code_in_update_after_approve_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectRecordIn_DeskCode_InUpdateAfterApprove_Under_DeskManagement_607());
		clicksAndActionsHelper.doubleClick(IIS_Parameter_Obj.SelectRecordIn_DeskCode_InUpdateAfterApprove_Under_DeskManagement_607());
	}

	@Given("User_607 ReEnter Brief Description In Update After Approve Under Desk Management")
	public void user_re_enter_brief_description_in_update_after_approve_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ReEnterBriefDescription_InUpdateAfterApprove_Under_DeskManagement_607());
		IIS_Parameter_Obj.ReEnterBriefDescription_InUpdateAfterApprove_Under_DeskManagement_607().sendKeys(testData.get("ReEnter Brief Description"),Keys.ENTER);
	}

	@Given("User_607 Click Update button In Update After Approve Under Desk Management")
	public void user_click_update_button_in_update_after_approve_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickUpdateBtn_InUpdateAfterApprove_Under_DeskManagement_607());
		IIS_Parameter_Obj.ClickUpdateBtn_InUpdateAfterApprove_Under_DeskManagement_607().click();
	    
	}

	@Given("User_607 Click Search button In Mainteance Under Desk Management")
	public void user_click_search_button_in_mainteance_under_desk_management() throws Throwable {
		Thread.sleep(3000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSearchBtnIn_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.ClickSearchBtnIn_Mainteance_UnderDeskManagement_607().click();
	}

	@Given("User_607 Search Record In Mainteance Under Desk Management")
	public void user_search_record_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SearchRecordIn_Mainteance_UnderDeskManagement());
		IIS_Parameter_Obj.SearchRecordIn_Mainteance_UnderDeskManagement().sendKeys(testData.get("Code"),Keys.ENTER);
	}

	@Given("User_607 Select Record In Mainteance Under Desk Management")
	public void user_select_record_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectRecordIn_Mainteance_UnderDeskManagement_607());
		clicksAndActionsHelper.doubleClick(IIS_Parameter_Obj.SelectRecordIn_Mainteance_UnderDeskManagement_607());
	}

	@Given("User_607 Click Delete button In Mainteance Under Desk Management")
	public void user_click_delete_button_in_mainteance_under_desk_management() throws Throwable {
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickDelBtnIn_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.ClickDelBtnIn_Mainteance_UnderDeskManagement_607().click();
	}
	
	@Given("User_607 Check the record should have brief name in grid list")
	public void user_check_the_record_should_have_brief_name_in_grid_list() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CheckBriefNameShowWhileSearchIn_Mainteance_UnderDeskManagement_607());
		String text = IIS_Parameter_Obj.CheckBriefNameShowWhileSearchIn_Mainteance_UnderDeskManagement_607().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	}

	@Given("User_607 Check the record should have long name in grid list")
	public void user_check_the_record_should_have_long_name_in_grid_list() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CheckLongNameShowWhileSearchIn_Mainteance_UnderDeskManagement_607());
		String text = IIS_Parameter_Obj.CheckLongNameShowWhileSearchIn_Mainteance_UnderDeskManagement_607().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	}

	@Given("User_607 Check Reject Field under desk mainteance")
	public void user_check_reject_field_under_desk_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.RejectUnderDeskManagement_607());
		if (!IIS_Parameter_Obj.RejectUnderDeskManagement_607().isDisplayed()) {
			Assert.fail();
		}
	}

	@Given("User_607 Check Approve Field under desk mainteance")
	public void user_check_approve_field_under_desk_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickApprove_Under_DeskManagement_607());
		if (!IIS_Parameter_Obj.ClickApprove_Under_DeskManagement_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Click Last button In Mainteance Under Desk Management")
	public void user_click_last_button_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LastBtn_In_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.LastBtn_In_Mainteance_UnderDeskManagement_607().click();
	}

	@Given("User_607 Click First button In Mainteance Under Desk Management")
	public void user_click_first_button_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.FirstBtn_In_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.FirstBtn_In_Mainteance_UnderDeskManagement_607().click();
	    
	}

	@Given("User_607 Click next button In Mainteance Under Desk Management")
	public void user_click_next_button_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderDeskManagement_607().click();
	    
	}

	@Given("User_607 Click Previous button In Mainteance Under Desk Management")
	public void user_click_previous_button_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.PreviousBtn_In_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.PreviousBtn_In_Mainteance_UnderDeskManagement_607().click();
	    
	}

	@Given("User_607 Click Search In Grid List In Mainteance Under Desk Management")
	public void user_click_search_in_grid_list_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSearchInGridList_In_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.ClickSearchInGridList_In_Mainteance_UnderDeskManagement_607().click();
	}

	@Given("User_607 Select Desk Code Shorting In Mainteance Under Desk Management")
	public void user_select_desk_code_shorting_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectDeskCodeShortingIn_Mainteance_UnderDeskManagement_607());
	    DropDownHelper.SelectUsingVisibleText(IIS_Parameter_Obj.SelectDeskCodeShortingIn_Mainteance_UnderDeskManagement_607(), testData.get("Sorting"));
	}

	@Given("User_607 Close Sorting Popup")
	public void user_close_sorting_popup() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Close_SortingPopup_607());
		IIS_Parameter_Obj.Close_SortingPopup_607().click();
	}

	@Given("User_607 Check Code Field Accept only numeric values In Mainteance Under Desk Management")
	public void user_check_code_field_accept_only_numeric_values_in_mainteance_under_desk_management() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CodeIn_Mainteance_UnderDeskManagement_607());
		IIS_Parameter_Obj.CodeIn_Mainteance_UnderDeskManagement_607().sendKeys(testData.get("Brief Description"));
	
	}
	
	@Given("User_607 Close Desk Management Maintenance Tab")
	public void user_close_desk_management_maintenance_tab() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Close_DeskManagement_MaintenanceTab_607());
		IIS_Parameter_Obj.Close_DeskManagement_MaintenanceTab_607().click();
	}
	
	//721382
	@And ("User_607 get the test data for test ID AT_IISPRM_065")
	public void get_the_test_data_for_test_case_AT_IISPRM_065() throws Throwable {
		testData = IIS_Params.getTestdata("DS_AT_IISPRM_065");
    }
	
	@Given("User_607 Click Email Under Menu Options")
	public void user_click_email_under_menu_options() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Click_Email_UnderMenuOptions_607());
		IIS_Parameter_Obj.Click_Email_UnderMenuOptions_607().click();
	    
	}

	@Given("User_607 Mainteance Under Email")
	public void user_mainteance_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Mainteance_UnderEmail_607());
		IIS_Parameter_Obj.Mainteance_UnderEmail_607().click();
	    
	}

	@Given("User_607 Click Add button In Mainteance Under Email")
	public void user_click_add_button_in_mainteance_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickAddBtn_InMainteance_UnderEmail_607());
		IIS_Parameter_Obj.ClickAddBtn_InMainteance_UnderEmail_607().click();
	}

	@Given("User_607 Select Row In Mainteance Under Email")
	public void user_select_row_in_mainteance_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectRow_InMainteance_UnderEmail_607());
		IIS_Parameter_Obj.SelectRow_InMainteance_UnderEmail_607().click();
	    
	}

	@Given("User_607 Enter Email In Row In Mainteance Under Email")
	public void user_enter_email_in_row_in_mainteance_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.EnterEmailInRow_InMainteance_UnderEmail_607());
		IIS_Parameter_Obj.EnterEmailInRow_InMainteance_UnderEmail_607().sendKeys(testData.get("Email"));
	}

	@Given("User_607 Save button In Mainteance Under Email")
	public void user_save_button_in_mainteance_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SaveBtn_InMainteance_UnderEmail_607());
		IIS_Parameter_Obj.SaveBtn_InMainteance_UnderEmail_607().click();
	}
	
	@Given("User_607 Delete the record In Mainteance Under Email")
	public void user_delete_the_record_in_mainteance_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.DeleteBtn_InMainteance_UnderEmail_607());
		IIS_Parameter_Obj.DeleteBtn_InMainteance_UnderEmail_607().click();
	}
	
	@Given("User_607 Select First Row In Mainteance Under Email")
	public void user_select_first_row_in_mainteance_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectFirstRow_InMainteance_UnderEmail_607());
		IIS_Parameter_Obj.SelectFirstRow_InMainteance_UnderEmail_607().click();
	}

	@Given("User_607 Change DropDown in Indicator In First Row In Mainteance Under Email")
	public void user_change_drop_down_in_indicator_in_first_row_in_mainteance_under_email() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.IndicatorInFirstRow_InMainteance_UnderEmail_607());
		DropDownHelper.SelectUsingVisibleText(IIS_Parameter_Obj.IndicatorInFirstRow_InMainteance_UnderEmail_607(), testData.get("Indicator"));
		Thread.sleep(2000);
	}
	

	@Given("User_607 Check Update After Authorize Field Under Email")
	public void user_check_update_after_authorize_field_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.UpdateAfterAuthorize_UnderEmail_607());
		if (!IIS_Parameter_Obj.UpdateAfterAuthorize_UnderEmail_607().isDisplayed()) {
			Assert.fail();
		}
	}

	@Given("User_607 Check Reject Under Email Field Under Email")
	public void user_check_reject_under_email_field_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Reject_UnderEmail_607());
		if (!IIS_Parameter_Obj.Reject_UnderEmail_607().isDisplayed()) {
			Assert.fail();
		}
	}

	@Given("User_607 Check approve Under Email Field Under Email")
	public void user_check_approve_under_email_field_under_email() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.approve_UnderEmail_607());
		if (!IIS_Parameter_Obj.approve_UnderEmail_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Close Parameter Email Mainteance Tab")
	public void user_close_parameter_email_mainteance_tab() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Close_ParameterEmailMainteance_Tab_607());
		IIS_Parameter_Obj.Close_ParameterEmailMainteance_Tab_607().click();
	}

	
	//721389
	
	@And ("User_607 get the test data for test ID AT_IISPRM_066")
	public void get_the_test_data_for_test_case_AT_IISPRM_066() throws Throwable {
		testData = IIS_Params.getTestdata("DS_AT_IISPRM_066");
    }
	
	@Given("User_607 Click Board Members Under Parameters")
	public void user_click_board_members_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickBoardMembers_Under_Parameters_607());
		IIS_Parameter_Obj.ClickBoardMembers_Under_Parameters_607().click();
	}

	@Given("User_607 Click Mainteance Under Board Members")
	public void user_click_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Click_Mainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.Click_Mainteance_Under_BoardMembers_607().click();
	}

	@Given("User_607 Enter Member ID In Mainteance Under Board Members")
	public void user_enter_member_id_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_MemberID_InMainteance_Under_BoardMembers_607());
		Random r = new Random();
		int low = 10;
		int high = 1000;
		int result = r.nextInt(high-low) + low;
		String code = String.valueOf(result);
		IIS_Parameter_Obj.Enter_MemberID_InMainteance_Under_BoardMembers_607().sendKeys(code);
	}

	@Given("User_607 Enter Brief Description In Mainteance Under Board Members")
	public void user_enter_brief_description_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_BoardMembers_607().sendKeys(testData.get("Brief Description"));
	}
	
	@Given("User_607 Edit Brief Description In Mainteance Under Board Members")
	public void user_edit_brief_description_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_BoardMembers_607().sendKeys(testData.get("ReEnter Brief Description"));
	}

	@Given("User_607 Enter Long Description In Mainteance Under Board Members")
	public void user_enter_long_description_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_LongDescription_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.Enter_LongDescription_InMainteance_Under_BoardMembers_607().sendKeys(testData.get("Long Description"));
	}

	@Given("User_607 Click Save button In Mainteance Under Board Members")
	public void user_click_save_button_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSaveBtn_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.ClickSaveBtn_InMainteance_Under_BoardMembers_607().click();
	}
	
	@Given("User_607 Click Search button In Mainteance Under Board Members")
	public void user_click_search_button_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSearchBtn_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.ClickSearchBtn_InMainteance_Under_BoardMembers_607().click();
	}

	@Given("User_607 Select Record In Mainteance Under Board Members")
	public void user_select_record_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectRecord_InMainteance_Under_BoardMembers_607());
	    clicksAndActionsHelper.doubleClick(IIS_Parameter_Obj.SelectRecord_InMainteance_Under_BoardMembers_607());
	}

	@Given("User_607 Click Update button In Mainteance Under Board Members")
	public void user_click_update_button_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickUpdateBtn_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.ClickUpdateBtn_InMainteance_Under_BoardMembers_607().click();
	}

	@Given("User_607 Click Delete button In Mainteance Under Board Members")
	public void user_click_delete_button_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickDelBtn_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.ClickDelBtn_InMainteance_Under_BoardMembers_607().click();
	    
	}
	

	@Given("User_607 Click Last button In Mainteance Under Board Members")
	public void user_click_last_button_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LastBtn_In_Mainteance_UnderBoardMembers_607());
		IIS_Parameter_Obj.LastBtn_In_Mainteance_UnderBoardMembers_607().click();
		
	}

	@Given("User_607 Click First button In Mainteance Under Board Members")
	public void user_click_first_button_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.FirstBtn_In_Mainteance_UnderBoardMembers_607());
		IIS_Parameter_Obj.FirstBtn_In_Mainteance_UnderBoardMembers_607().click();
		
	}

	@Given("User_607 Click next button In Mainteance Under Board Members")
	public void user_click_next_button_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderBoardMembers_607());
		IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderBoardMembers_607().click();
		
	}

	@Given("User_607 Click Previous button In Mainteance Under Board Members")
	public void user_click_previous_button_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.PreviousBtn_In_Mainteance_UnderBoardMembers_607());
		IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderBoardMembers_607().click();
		
	}

	@Given("User_607 Check Short Name Eng Show In Search In Mainteance Under Board Members")
	public void user_check_short_name_eng_show_in_search_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CheckShortNameEngShow_InSearch_InMainteance_Under_BoardMembers_607());
		String text = IIS_Parameter_Obj.CheckShortNameEngShow_InSearch_InMainteance_Under_BoardMembers_607().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Long Name Eng Show In Search In Mainteance Under Board Members")
	public void user_check_long_name_eng_show_in_search_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CheckLongNameEngShow_InSearch_InMainteance_Under_BoardMembers_607());
		String text = IIS_Parameter_Obj.CheckLongNameEngShow_InSearch_InMainteance_Under_BoardMembers_607().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Click Search In Grid List In Mainteance Under Board Members")
	public void user_click_search_in_grid_list_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSearch_InGridList_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.ClickSearch_InGridList_InMainteance_Under_BoardMembers_607().click();
		
	}

	@Given("User_607 Select Desk Code Shorting In Mainteance Under Board Members")
	public void user_select_desk_code_shorting_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectMemberIDShorting_InGridList_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.SelectMemberIDShorting_InGridList_InMainteance_Under_BoardMembers_607().sendKeys(testData.get("Sorting"));
		
	}

	@Given("User_607 Close Sorting Popup In Mainteance Under Board Members")
	public void user_close_sorting_popup_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CloseSortingPopup_InMainteance_Under_BoardMembers_607());
		IIS_Parameter_Obj.CloseSortingPopup_InMainteance_Under_BoardMembers_607().click();
		
	}

	@Given("User_607 Check List Field under Under Board Members")
	public void user_check_list_field_under_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.List_Under_BoardMembers_607());
		if (!IIS_Parameter_Obj.List_Under_BoardMembers_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Update After Authorize Field under Under Board Members")
	public void user_check_update_after_authorize_field_under_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.UpdateAfterAuthorize_Under_BoardMembers_607());
		if (!IIS_Parameter_Obj.UpdateAfterAuthorize_Under_BoardMembers_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Reject Field under Under Board Members")
	public void user_check_reject_field_under_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Reject_Under_BoardMembers_607());
		if (!IIS_Parameter_Obj.Reject_Under_BoardMembers_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Approve Field under Under Board Members")
	public void user_check_approve_field_under_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Approve_Under_BoardMembers_607());
		if (!IIS_Parameter_Obj.Approve_Under_BoardMembers_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check MemberID Accept only numeric values In Mainteance Under Board Members")
	public void user_check_code_field_accept_only_numeric_values_in_mainteance_under_board_members() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_MemberID_InMainteance_Under_BoardMembers_607());
		String text = IIS_Parameter_Obj.Enter_MemberID_InMainteance_Under_BoardMembers_607().getAttribute("prevvalue");
	    if (!text.isBlank()||!text.isEmpty()) {
			Assert.fail();
		}
	}

	@Given("User_607 Close Board Members Maintenance Tab")
	public void user_close_board_members_maintenance_tab() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Close_ParametersBoardMembersMaintenance_Tab_607());
		IIS_Parameter_Obj.Close_ParametersBoardMembersMaintenance_Tab_607().click();
	}
	
	
	
	//721405
	
	@And ("User_607 get the test data for test ID AT_IISPRM_068")
	public void get_the_test_data_for_test_case_AT_IISPRM_068() throws Throwable {
		testData = IIS_Params.getTestdata("DS_AT_IISPRM_068");
    }
	
	@Given("User_607 Click Certificate Types Under Parameters")
	public void user_click_certificate_types_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickCertificateTypes_Under_Parameters_607());
		IIS_Parameter_Obj.ClickCertificateTypes_Under_Parameters_607().click();
	    
	}

	@Given("User_607 Click Mainteance Under Certificate Types")
	public void user_click_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Click_Mainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.Click_Mainteance_Under_CertificateTypes_607().click();
	    
	}

	@Given("User_607 Enter Code In Mainteance Under Certificate Types")
	public void user_enter_code_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_Code_InMainteance_Under_CertificateTypes_607());
		Random r = new Random();
		int low = 10;
		int high = 1000;
		int result = r.nextInt(high-low) + low;
		String code = String.valueOf(result);
		IIS_Parameter_Obj.Enter_Code_InMainteance_Under_CertificateTypes_607().sendKeys(code);
	}

	@Given("User_607 Enter Brief Description In Mainteance Under Certificate Types")
	public void user_enter_brief_description_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_CertificateTypes_607().sendKeys(testData.get("Brief Description"));
	    
	}

	@Given("User_607 Enter Long Description In Mainteance Under Certificate Types")
	public void user_enter_long_description_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_LongDescription_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.Enter_LongDescription_InMainteance_Under_CertificateTypes_607().sendKeys(testData.get("Long Description"));
	    
	}

	@Given("User_607 Click Save button In Mainteance Under Certificate Types")
	public void user_click_save_button_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSaveBtn_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.ClickSaveBtn_InMainteance_Under_CertificateTypes_607().click();
	    
	}

	@Given("User_607 Click Search button In Mainteance Under Certificate Types")
	public void user_click_search_button_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSearchBtn_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.ClickSearchBtn_InMainteance_Under_CertificateTypes_607().click();
	    
	}

	@Given("User_607 Select Record In Mainteance Under Certificate Types")
	public void user_select_record_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectRecord_InMainteance_Under_CertificateTypes_607());
		clicksAndActionsHelper.doubleClick(IIS_Parameter_Obj.SelectRecord_InMainteance_Under_CertificateTypes_607());
	}

	@Given("User_607 Edit Brief Description In Mainteance Under Certificate Types")
	public void user_edit_brief_description_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_CertificateTypes_607().sendKeys(testData.get("ReEnter Brief Description"));
	    
	}

	@Given("User_607 Click Update button In Mainteance Under Certificate Types")
	public void user_click_update_button_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickUpdateBtn_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.ClickUpdateBtn_InMainteance_Under_CertificateTypes_607().click();
	    
	}

	@Given("User_607 Click Delete button In Mainteance Under Certificate Types")
	public void user_click_delete_button_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickDelBtn_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.ClickDelBtn_InMainteance_Under_CertificateTypes_607().click();
	    
	}

	@Given("User_607 Click Last button In Mainteance Under Certificate Types")
	public void user_click_last_button_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LastBtn_In_Mainteance_UnderCertificateTypes_607());
		IIS_Parameter_Obj.LastBtn_In_Mainteance_UnderCertificateTypes_607().click();
	    
	}

	@Given("User_607 Click First button In Mainteance Under Certificate Types")
	public void user_click_first_button_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.FirstBtn_In_Mainteance_UnderCertificateTypes_607());
		IIS_Parameter_Obj.FirstBtn_In_Mainteance_UnderCertificateTypes_607().click();
	    
	}

	@Given("User_607 Click next button In Mainteance Under Certificate Types")
	public void user_click_next_button_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderCertificateTypes_607());
		IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderCertificateTypes_607().click();
	    
	}

	@Given("User_607 Click Previous button In Mainteance Under Certificate Types")
	public void user_click_previous_button_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.PreviousBtn_In_Mainteance_UnderCertificateTypes_607());
		IIS_Parameter_Obj.PreviousBtn_In_Mainteance_UnderCertificateTypes_607().click();
	    
	}

	@Given("User_607 Check Brief Description In Search In Mainteance Under Certificate Types")
	public void user_check_Brief_Description_in_search_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CheckBriefDescription_InSearch_InMainteance_Under_CertificateTypes_607());
		String text = IIS_Parameter_Obj.CheckBriefDescription_InSearch_InMainteance_Under_CertificateTypes_607().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Long Description In Search In Mainteance Under Certificate Types")
	public void user_check_Long_Description_in_search_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CheckLongDescription_InSearch_InMainteance_Under_CertificateTypes_607());
		String text = IIS_Parameter_Obj.CheckLongDescription_InSearch_InMainteance_Under_CertificateTypes_607().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	}

	@Given("User_607 Click Search In Grid List In Mainteance Under Certificate Types")
	public void user_click_search_in_grid_list_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSearch_InGridList_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.ClickSearch_InGridList_InMainteance_Under_CertificateTypes_607().click();
	    
	}

	@Given("User_607 Select Certificate Code Shorting In Mainteance Under Certificate Types")
	public void user_select_certificate_code_shorting_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectCertificateCodeInShorting_InGridList_InMainteance_Under_CertificateTypes_607());
	    DropDownHelper.SelectUsingVisibleText(IIS_Parameter_Obj.SelectCertificateCodeInShorting_InGridList_InMainteance_Under_CertificateTypes_607(), testData.get("Sorting"));
	}

	@Given("User_607 Close Sorting Popup In Mainteance Under Certificate Types")
	public void user_close_sorting_popup_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CloseSortingPopup_InMainteance_Under_CertificateTypes_607());
		IIS_Parameter_Obj.CloseSortingPopup_InMainteance_Under_CertificateTypes_607().click();
	    
	}

	@Given("User_607 Check List Field under Under Certificate Types")
	public void user_check_list_field_under_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.List_Under_CertificateTypes_607());
		if (!IIS_Parameter_Obj.List_Under_CertificateTypes_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Update After Authorize Field under Under Certificate Types")
	public void user_check_update_after_authorize_field_under_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.UpdateAfterAuthorize_Under_CertificateTypes_607());
		if (!IIS_Parameter_Obj.UpdateAfterAuthorize_Under_CertificateTypes_607().isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Reject Field under Under Certificate Types")
	public void user_check_reject_field_under_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Reject_Under_CertificateTypes_607());
		if (!IIS_Parameter_Obj.Reject_Under_CertificateTypes_607().isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Approve Field under Under Certificate Types")
	public void user_check_approve_field_under_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Approve_Under_CertificateTypes_607());
		if (!IIS_Parameter_Obj.Approve_Under_CertificateTypes_607().isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Code Accept only numeric values In Mainteance Under Certificate Types")
	public void user_check_code_accept_only_numeric_values_in_mainteance_under_certificate_types() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_Code_InMainteance_Under_CertificateTypes_607());
		String text = IIS_Parameter_Obj.Enter_Code_InMainteance_Under_CertificateTypes_607().getAttribute("prevvalue");
	    if (!text.isBlank()||!text.isEmpty()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Close Parameters Certificate Types Maintenance Tab")
	public void user_close_parameters_certificate_types_maintenance_tab() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Close_ParametersCertificateTypesMaintenance_Tab_607());
		IIS_Parameter_Obj.Close_ParametersCertificateTypesMaintenance_Tab_607().click();
	}
	
	
	//721413
	
	@And ("User_607 get the test data for test ID AT_IISPRM_069")
	public void get_the_test_data_for_test_case_AT_IISPRM_069() throws Throwable {
		testData = IIS_Params.getTestdata("DS_AT_IISPRM_069");
    }
	
	@Given("User_607 Click Reason Codes Under Parameters")
	public void user_click_reason_codes_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickReasonCodes_Under_Parameters_607());
		IIS_Parameter_Obj.ClickReasonCodes_Under_Parameters_607().click();
	    
	}

	@Given("User_607 Click Mainteance Under Reason Codes")
	public void user_click_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Click_Mainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.Click_Mainteance_Under_ReasonCodes_607().click();
	    
	}
	
	String code;
	@Given("User_607 Enter Code In Mainteance Under Reason Codes")
	public void user_enter_code_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_Code_InMainteance_Under_ReasonCodes_607());
		Random r = new Random();
		int low = 10;
		int high = 1000;
		int result = r.nextInt(high-low) + low;
		code = String.valueOf(result);
		IIS_Parameter_Obj.Enter_Code_InMainteance_Under_ReasonCodes_607().sendKeys(code);
	    
	}

	@Given("User_607 Enter Brief Description In Mainteance Under Reason Codes")
	public void user_enter_brief_description_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_ReasonCodes_607().sendKeys("Test");
	}

	@Given("User_607 Enter Long Description In Mainteance Under Reason Codes")
	public void user_enter_long_description_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_LongDescription_InMainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.Enter_LongDescription_InMainteance_Under_ReasonCodes_607().sendKeys("Test");
	    
	}

	@Given("User_607 Click Save button In Mainteance Under Reason Codes")
	public void user_click_save_button_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSaveBtn_InMainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.ClickSaveBtn_InMainteance_Under_ReasonCodes_607().click();
	    
	}

	@Given("User_607 Click Search button In Mainteance Under Reason Codes")
	public void user_click_search_button_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSearchBtn_InMainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.ClickSearchBtn_InMainteance_Under_ReasonCodes_607().click();
	    
	}

	@Given("User_607 Select Record In Mainteance Under Reason Codes")
	public void user_select_record_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectRecord_InMainteance_Under_ReasonCodes_607());
	    clicksAndActionsHelper.doubleClick(IIS_Parameter_Obj.SelectRecord_InMainteance_Under_ReasonCodes_607());
	}

	@Given("User_607 Edit Brief Description In Mainteance Under Reason Codes")
	public void user_edit_brief_description_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.Enter_BriefDescription_InMainteance_Under_ReasonCodes_607().sendKeys("TestTest");
	}

	@Given("User_607 Click Delete button In Mainteance Under Reason Codes")
	public void user_click_delete_button_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickDelBtn_InMainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.ClickDelBtn_InMainteance_Under_ReasonCodes_607().click();
	    
	}

	@Given("User_607 Click Last button In Mainteance Under Reason Codes")
	public void user_click_last_button_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LastBtn_In_Mainteance_UnderReasonCodes_607());
		IIS_Parameter_Obj.LastBtn_In_Mainteance_UnderReasonCodes_607().click();
	    
	}

	@Given("User_607 Click First button In Mainteance Under Reason Codes")
	public void user_click_first_button_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.FirstBtn_In_Mainteance_UnderReasonCodes_607());
		IIS_Parameter_Obj.FirstBtn_In_Mainteance_UnderReasonCodes_607().click();
		
	}

	@Given("User_607 Click next button In Mainteance Under Reason Codes")
	public void user_click_next_button_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderReasonCodes_607());
		IIS_Parameter_Obj.nextBtn_In_Mainteance_UnderReasonCodes_607().click();
	    
	}

	@Given("User_607 Click Previous button In Mainteance Under Reason Codes")
	public void user_click_previous_button_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.PreviousBtn_In_Mainteance_UnderReasonCodes_607());
		IIS_Parameter_Obj.PreviousBtn_In_Mainteance_UnderReasonCodes_607().click();
	}

	@Given("User_607 Check Brief Description In Search In Mainteance Under Reason Codes")
	public void user_check_brief_description_in_search_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SearchReasonCode_In_Mainteance_UnderReasonCodes_607());
		IIS_Parameter_Obj.SearchReasonCode_In_Mainteance_UnderReasonCodes_607().sendKeys(code,Keys.ENTER);
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CheckBriefDescription_InSearch_InMainteance_Under_ReasonCodes_607());
		String text = IIS_Parameter_Obj.CheckBriefDescription_InSearch_InMainteance_Under_ReasonCodes_607().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Long Description In Search In Mainteance Under Reason Codes")
	public void user_check_long_description_in_search_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CheckLongDescription_InSearch_InMainteance_Under_ReasonCodes_607());
		String text = IIS_Parameter_Obj.CheckLongDescription_InSearch_InMainteance_Under_ReasonCodes_607().getText();
	    if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	}

	@Given("User_607 Click Search In Grid List In Mainteance Under Reason Codes")
	public void user_click_search_in_grid_list_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickSearch_InGridList_InMainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.ClickSearch_InGridList_InMainteance_Under_ReasonCodes_607().click();
	}

	@Given("User_607 Select Certificate Code Shorting In Mainteance Under Reason Codes")
	public void user_select_certificate_code_shorting_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.SelectCertificateCodeInShorting_InGridList_InMainteance_Under_ReasonCodes_607());
	    DropDownHelper.SelectUsingVisibleText(IIS_Parameter_Obj.SelectCertificateCodeInShorting_InGridList_InMainteance_Under_ReasonCodes_607(), "Reason Code");
	}

	@Given("User_607 Close Sorting Popup In Mainteance Under Reason Codes")
	public void user_close_sorting_popup_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CloseSortingPopup_InMainteance_Under_ReasonCodes_607());
		IIS_Parameter_Obj.CloseSortingPopup_InMainteance_Under_ReasonCodes_607().click();
	    
	}

	@Given("User_607 Check List Field under Reason Codes")
	public void user_check_list_field_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.List_Under_ReasonCodess_607());
		if (!IIS_Parameter_Obj.List_Under_ReasonCodess_607().isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Update After Authorize Field under Reason Codes")
	public void user_check_update_after_authorize_field_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.UpdateAfterAuthorize_Under_ReasonCodes_607());
		if (!IIS_Parameter_Obj.UpdateAfterAuthorize_Under_ReasonCodes_607().isDisplayed()) {
			Assert.fail();
		}  
	    
	}

	@Given("User_607 Check Reject Field under Reason Codes")
	public void user_check_reject_field_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Reject_Under_ReasonCodes_607());
		if (!IIS_Parameter_Obj.Reject_Under_ReasonCodes_607().isDisplayed()) {
			Assert.fail();
		}  
	    
	}

	@Given("User_607 Check Approve Field under Reason Codes")
	public void user_check_approve_field_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Approve_Under_ReasonCodes_607());
		if (!IIS_Parameter_Obj.Approve_Under_ReasonCodes_607().isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Code Accept only numeric values In Mainteance Under Reason Codes")
	public void user_check_code_accept_only_numeric_values_in_mainteance_under_reason_codes() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Enter_Code_InMainteance_Under_ReasonCodes_607());
		String text = IIS_Parameter_Obj.Enter_Code_InMainteance_Under_ReasonCodes_607().getAttribute("prevvalue");
	    if (!text.isBlank()||!text.isEmpty()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Close Parameters Reason Codes Maintenance Tab")
	public void user_close_parameters_reason_codes_maintenance_tab() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Close_ParametersReasonCodesMaintenance_Tab_607());
		IIS_Parameter_Obj.Close_ParametersReasonCodesMaintenance_Tab_607().click();
	}
	
	
	
	
	
	
	
	
	
	

}
