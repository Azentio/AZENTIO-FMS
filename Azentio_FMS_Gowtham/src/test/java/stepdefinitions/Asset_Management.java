package stepdefinitions;

import java.util.ArrayList;
import java.util.List;
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
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.Asset_Management_Obj;
import resources.BaseClass;

public class Asset_Management {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Asset_Management_Obj Asset_Management_Obj = new Asset_Management_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	IIS_Login IIS_Login = new IIS_Login(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData AssetManagement =  new ExcelData(path, "Asset_Management", "Data Set ID");
	Map<String, String> testData;
	
	
	@And ("User_607 get the test data for test ID AT_AM_007")
	public void get_the_test_data_for_test_case_AT_AM_007() throws Throwable {
		testData = AssetManagement.getTestdata("DS_AT_AM_007");
    }
	
	@And ("User_607 get the test data for test ID AT_AM_008")
	public void get_the_test_data_for_test_case_AT_AM_008() throws Throwable {
		testData = AssetManagement.getTestdata("DS_AT_AM_008");
    }
	
	@And ("User_607 get the test data for test ID AT_AM_009")
	public void get_the_test_data_for_test_case_AT_AM_009() throws Throwable {
		testData = AssetManagement.getTestdata("DS_AT_AM_009");
    }
	
	@And ("User_607 get the test data for test ID AT_AM_010")
	public void get_the_test_data_for_test_case_AT_AM_010() throws Throwable {
		testData = AssetManagement.getTestdata("DS_AT_AM_010");
    }
	

	
	
	
	//@1077670
	
	@And("User_607 Click Parameters under Menu In IISparam")
	public void user_click_parameters_under_menu_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Parameters_underMenuIn_IISparam_607());
		Asset_Management_Obj.Click_Parameters_underMenuIn_IISparam_607().click();
	    
	}
	

	@And("User_607 Click Product Class under Parameters IISparam")
	public void user_click_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.Click_ProductClass_underParameters_IISparam_607().click();
	    
	}

	@And("User_607 Click mainteance Under Product Class under Parameters IISparam")
	public void user_click_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_mainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.Click_mainteanceUnder_ProductClass_underParameters_IISparam_607().click();
	    
	}

	@And("User_607 Click Search In mainteance Under Product Class under Parameters IISparam")
	public void user_click_search_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.ClickSearch_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.ClickSearch_InmainteanceUnder_ProductClass_underParameters_IISparam_607().click();
	}

	@And("User_607 Search Record In mainteance Under Product Class under Parameters IISparam")
	public void user_search_record_in_mainteance_under_product_class_under_parameters_ii_sparam() throws Throwable {
		for(int i = 0; i < 1000; i++) {
			try {
				if (Asset_Management_Obj.SelectRecord_InmainteanceUnder_ProductClass_underParameters_IISparam_607().isDisplayed()) {
					break;
				}
			} catch (Exception e) {
			}
			
		}
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SelectRecord_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SearchRecord_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.SearchRecord_InmainteanceUnder_ProductClass_underParameters_IISparam_607().sendKeys(testData.get("Search Product Class Record"),Keys.ENTER);
	}

	@And("User_607 Select Record In mainteance Under Product Class under Parameters IISparam")
	public void user_select_record_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SelectRecord_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		for (int i = 0; i < 700; i++) {
			clicksAndActionsHelper.doubleClick(Asset_Management_Obj.SelectRecord_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
			break;
		}
	}

	@And("User_607 Click Link Asset Management Charges button In mainteance Under Product Class under Parameters IISparam")
	public void user_click_link_asset_management_charges_button_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.ClickLinkAssetManagementChargesBtn_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.ClickLinkAssetManagementChargesBtn_InmainteanceUnder_ProductClass_underParameters_IISparam_607().click();
	    
	}

	@And("User_607 Check Code field In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_check_code_field_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.CheckCodefield_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
        if (!Asset_Management_Obj.CheckCodefield_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@And("User_607 Check Description Field In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_check_description_field_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.CheckDescriptionField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		if (!Asset_Management_Obj.CheckDescriptionField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@And("User_607 Check Flat Amount Field In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_check_flat_amount_field_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.CheckFlatAmountField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		if (!Asset_Management_Obj.CheckFlatAmountField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@And("User_607 Check Allow Edit Field In Link Asset Management Charges In mainteance Under Product Class unde Parameters IISparam")
	public void user_check_allow_edit_field_in_link_asset_management_charges_in_mainteance_under_product_class_unde_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.CheckAllowEditField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		if (!Asset_Management_Obj.CheckAllowEditField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
	}
	
	//1077671
	
	@And("User_607 Click Add button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_click_add_button_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.ClickAddBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		for (int i = 0; i < 700; i++) {
			selenium_Actions.getClickAndActionsHelper().moveToElement(Asset_Management_Obj.ClickAddBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
			Asset_Management_Obj.ClickAddBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().click();
			break;
		}
	}

	@And("User_607 Select Line In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_select_line_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SelectLine_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam());
		Asset_Management_Obj.SelectLine_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam().click();
	}

	@And("User_607 Click delete button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_click_delete_button_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.deleteBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.deleteBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().click();
	}

	@And("User_607 Cancel button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_cancel_button_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.CancelBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.CancelBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().click();
	}

	@And("User_607 Search Code without flat amount In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_search_code_without_flat_amount_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SearchCode_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.SearchCode_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().sendKeys(testData.get("Search Code without flat amount"),Keys.ENTER);
	}

	@And("User_607 Check Cannot Proceed In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_check_cannot_proceed_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Cannot_Proceed_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		if (Asset_Management_Obj.Cannot_Proceed_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().isDisplayed()) {
			Asset_Management_Obj.IIS_SuccessPopupOkBtn_607().click();
		}
	}

	@And("User_607 Search Code define charge code amount In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_search_code_define_charge_code_amount_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SearchCode_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.SearchCode_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().sendKeys(testData.get("Search Code define charge code amount"),Keys.ENTER);

	}

	@And("User_607 Flat Ammount In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_flat_ammount_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.FlatAmmount_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		String text = Asset_Management_Obj.FlatAmmount_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().getAttribute("prevvalue");
		if (text.isBlank()||text.isEmpty()) {
			Assert.fail();
		}
	}

	@And("User_607 Select Allow Edit In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_select_allow_edit_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SelectAllowEdit_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		DropDownHelper.SelectUsingVisibleText(Asset_Management_Obj.SelectAllowEdit_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607(), testData.get("Select Allow Edit"));
	}

	@And("User_607 Click Ok button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam")
	public void user_click_ok_button_in_link_asset_management_charges_in_mainteance_under_product_class_under_parameters_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.OkBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607());
		Asset_Management_Obj.OkBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607().click();
	}
	
	
	
	//@1080828
	
	@Given("User_607 Click Asset Management under Menu Options")
	public void user_click_asset_management_under_menu_options() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Asset_Management_under_MenuOptions_607());
		Asset_Management_Obj.Asset_Management_under_MenuOptions_607().click();
	    
	}

	@Given("User_607 Click Asset Repossession Return under Asset Management")
	public void user_click_asset_repossession_return_under_asset_management() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.AssetRepossessionReturn_under_Asset_Management_607());
		Asset_Management_Obj.AssetRepossessionReturn_under_Asset_Management_607().click();
	    
	}

	@Given("User_607 Click Mainteance Under Asset Repossession Return")
	public void user_click_mainteance_under_asset_repossession_return() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Mainteance_Under_AssetRepossessionReturn_607());
		Asset_Management_Obj.Click_Mainteance_Under_AssetRepossessionReturn_607().click();
	    
	}

	@Given("User_607 Check the new values are available in Repossession Type field")
	public void user_check_the_new_values_are_available_in_repossession_type_field() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SelectRepossession_Type_InMainteance_Under_AssetRepossessionReturn_607());
		DropDownHelper.SelectUsingVisibleText(Asset_Management_Obj.SelectRepossession_Type_InMainteance_Under_AssetRepossessionReturn_607(), testData.get("Repossession Type field1"));
		DropDownHelper.SelectUsingVisibleText(Asset_Management_Obj.SelectRepossession_Type_InMainteance_Under_AssetRepossessionReturn_607(), testData.get("Repossession Type field2"));
		
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.IIS_SuccessPopupOkBtn_607());
		Asset_Management_Obj.IIS_SuccessPopupOkBtn_607().click();
	}
	
	
	@Given("User_607 Click Query Under Asset Repossession Return")
	public void user_click_query_under_asset_repossession_return() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Query_Under_AssetRepossessionReturn_607());
		Asset_Management_Obj.Click_Query_Under_AssetRepossessionReturn_607().click();
	    
	}

	@Given("User_607 Check Query Screen open without any Error")
	public void user_check_query_screen_open_without_any_error() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.TrancationNo_InQuery_Under_AssetRepossessionReturn_607());
		if (!Asset_Management_Obj.TrancationNo_InQuery_Under_AssetRepossessionReturn_607().isDisplayed()) {
			Assert.fail();
		}
   
	    
	}

	@Given("User_607 Click Verify Under Asset Repossession Return")
	public void user_click_verify_under_asset_repossession_return() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Verify_Under_AssetRepossessionReturn_607());
		Asset_Management_Obj.Click_Verify_Under_AssetRepossessionReturn_607().click();
	    
	}

	@Given("User_607 Check Verify Screen open without any Error")
	public void user_check_verify_screen_open_without_any_error() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.TrancationNo_InVerify_Under_AssetRepossessionReturn_607());
		if (!Asset_Management_Obj.TrancationNo_InVerify_Under_AssetRepossessionReturn_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Click Approve Under Asset Repossession Return")
	public void user_click_approve_under_asset_repossession_return() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Approve_Under_AssetRepossessionReturn_607());
		Asset_Management_Obj.Click_Approve_Under_AssetRepossessionReturn_607().click();
	    
	}

	@Given("User_607 Check Approve Screen open without any Error")
	public void user_check_approve_screen_open_without_any_error() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.TrancationNo_InApprove_Under_AssetRepossessionReturn_607());
		if (!Asset_Management_Obj.TrancationNo_InApprove_Under_AssetRepossessionReturn_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Click Reverse Under Asset Repossession Return")
	public void user_click_reverse_under_asset_repossession_return() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Reverse_Under_AssetRepossessionReturn_607());
		Asset_Management_Obj.Click_Reverse_Under_AssetRepossessionReturn_607().click();
	    
	}

	@Given("User_607 Check Reverse Screen open without any Error")
	public void user_check_reverse_screen_open_without_any_error() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.TrancationNo_Reverse_Under_AssetRepossessionReturn_607());
		if (!Asset_Management_Obj.TrancationNo_Reverse_Under_AssetRepossessionReturn_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	
	//1080829
	
	
	@Given("User_607 Click Asset Management Finalization under Asset Management")
	public void user_click_asset_management_finalization_under_asset_management() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_AssetManagementFinalization_under_Asset_Management_607());
		Asset_Management_Obj.Click_AssetManagementFinalization_under_Asset_Management_607().click();
	    
	}

	@Given("User_607 Click Mainteance Under Asset Management Finalization")
	public void user_click_mainteance_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Mainteance_Under_AssetManagementFinalization_607());
		Asset_Management_Obj.Click_Mainteance_Under_AssetManagementFinalization_607().click();
	    
	}

	@Given("User_607 Check the new values are available in Repossession Type under field Asset Management Finalization")
	public void user_check_the_new_values_are_available_in_repossession_type_field_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SelectRepossession_Type_InMainteance_Under_AssetManagementFinalization_607());
		DropDownHelper.SelectUsingVisibleText(Asset_Management_Obj.SelectRepossession_Type_InMainteance_Under_AssetManagementFinalization_607(), testData.get("Repossession Type field1"));
		DropDownHelper.SelectUsingVisibleText(Asset_Management_Obj.SelectRepossession_Type_InMainteance_Under_AssetManagementFinalization_607(), testData.get("Repossession Type field2"));
		
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.IIS_SuccessPopupOkBtn_607());
		Asset_Management_Obj.IIS_SuccessPopupOkBtn_607().click();
	}
	
	
	@Given("User_607 Click Query Under Asset Management Finalization")
	public void user_click_query_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Query_Under_AssetManagementFinalization_607());
		Asset_Management_Obj.Click_Query_Under_AssetManagementFinalization_607().click();
	    
	}

	@Given("User_607 Check Query Screen open without any Error under Asset Management Finalization")
	public void user_check_query_screen_open_without_any_error_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SettlementNo_InQuery_Under_AssetManagementFinalization_607());
		if (!Asset_Management_Obj.SettlementNo_InQuery_Under_AssetManagementFinalization_607().isDisplayed()) {
			Assert.fail();
		}
   
	    
	}

	@Given("User_607 Click Verify Under Asset Management Finalization")
	public void user_click_verify_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Verify_Under_AssetManagementFinalization_607());
		Asset_Management_Obj.Click_Verify_Under_AssetManagementFinalization_607().click();
	    
	}

	@Given("User_607 Check Verify Screen open without any Error under Asset Management Finalization")
	public void user_check_verify_screen_open_without_any_error_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SettlementNo_InVerify_Under_AssetManagementFinalization_607());
		if (!Asset_Management_Obj.SettlementNo_InVerify_Under_AssetManagementFinalization_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Click Approve Under Asset Management Finalization")
	public void user_click_approve_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Approve_Under_AssetManagementFinalization_607());
		Asset_Management_Obj.Click_Approve_Under_AssetManagementFinalization_607().click();
	    
	}

	@Given("User_607 Check Approve Screen open without any Error under Asset Management Finalization")
	public void user_check_approve_screen_open_without_any_error_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SettlementNo_InApprove_Under_AssetManagementFinalization_607());
		if (!Asset_Management_Obj.SettlementNo_InApprove_Under_AssetManagementFinalization_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Click Reverse Under Asset Management Finalization")
	public void user_click_reverse_under_asset_management_finalization() {
		//waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.Click_Reverse_Under_AssetManagementFinalization_607());
		for (int i = 0; i < 1000; i++) {
			Asset_Management_Obj.Click_Reverse_Under_AssetManagementFinalization_607().click();
			break;
		}
	}

	@Given("User_607 Check Reverse Screen open without any Error under Asset Management Finalization")
	public void user_check_reverse_screen_open_without_any_error_under_asset_management_finalization() {
		waitHelper.waitForElementwithFluentwait(driver, Asset_Management_Obj.SettlementNo_Reverse_Under_AssetManagementFinalization_607());
		if (!Asset_Management_Obj.SettlementNo_Reverse_Under_AssetManagementFinalization_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
