package stepdefinitions;

import java.util.Map;

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
import io.cucumber.java.en.When;
import pageobjects.Collateral_ManagementObj;
//import pageobjects.fms.Collateral_ManagementObj;
import resources.BaseClass;

public class Collateral_Management_Steps {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	//Collateral_ManagementObj collateralManagementObj = new Collateral_ManagementObj(driver);
	Collateral_ManagementObj collateralManagementObj = new Collateral_ManagementObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_Collateral_Management","DataSet ID");
	Map<String, String> testData;
	
//	@AT_RF_158_Param
	@And("^get the test data for test case AT_RF_158_Param$")
	public void get_the_test_data_for_test_case_atrf158param() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS02_AT_RF_158");  
	}

//	@AT_RF_158_Core
	@And("^get the test data for test case AT_RF_158_Core$")
	public void get_the_test_data_for_test_case_atrf158core() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_RF_158");
	}
	@And("get the test data for test case AT_CM_003")
	public void get_the_test_data_for_test_case_AT_CM_003() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_CM_003");
	}
	@And("get the test data for test case AT_CM_004")
	public void get_the_test_data_for_test_case_AT_CM_004() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_CM_004");
	}
	@And("get the test data for test case AT_CM_006")
	public void get_the_test_data_for_test_case_AT_CM_006() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_CM_006");
	}
	@And("User_074 get the test data for test case AT_RF_027")
	public void User_074_get_the_test_data_for_test_case_AT_RF_027() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_RF_027");
	}
	@And("User_074 get the test data for test case AT_RF_105")
	public void User_074_get_the_test_data_for_test_case_AT_RF_105() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_RF_105");
	}
	
	
//	@AT_RF_035
	@And("^User click on the language option in FMS core$")
    public void user_click_on_the_language_option_in_fms_core() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMSCoreLanguageBtn());
        collateralManagementObj.FMSCoreLanguageBtn().click();
    }

    @And("^User click on the arabic under language option$")
    public void user_click_on_the_arabic_under_language_option() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.arabicLanguage());
    	collateralManagementObj.arabicLanguage().click();
    }

    @And("^User clicks on the the mortgage management module$")
    public void user_clicks_on_the_the_mortgage_management_module() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.arabicMortgageManagementModule());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.arabicMortgageManagementModule());
		collateralManagementObj.arabicMortgageManagementModule().click();
    }

    @And("^User clicks on the Maintanance screen under mortgage management module$")
    public void user_clicks_on_the_maintanance_screen_under_mortgage_management_module() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mortgageManagementMain());
    	collateralManagementObj.mortgageManagementMain().click();
    }

    @And("^User verify the Maintanance screen should be arabic language$")
    public void user_verify_the_maintanance_screen_should_be_arabic_language() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mortgageManagementMainLabel());
    	
    	
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.mortgageManagementMainEnd());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mortgageManagementMainEnd());
    	String saveBtnText = collateralManagementObj.mortgageManagementMainEnd().getText();
//    	System.out.println("Text :"+saveBtnText);
    	Assert.assertEquals(saveBtnText, "حفظ");	
    }
    
    
//  @AT_RF_158_Param
    @And("^User clicks on the Collateral type module$")
    public void user_clicks_on_the_collateral_type_module() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.parameterCollateralType());
    	collateralManagementObj.parameterCollateralType().click();
    }

    @And("^User clicks on the Maintanance screen under Collateral type$")
    public void user_clicks_on_the_maintanance_screen_under_collateral_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeMaintanance());
    	collateralManagementObj.collateralTypeMaintanance().click();
    }

    @And("^User enter the code under Collateral Type main screen$")
    public void user_enter_the_code_under_collateral_type_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeMainCode());
//    	collateralManagementObj.collateralTypeMainCode().sendKeys("1260");
    	collateralManagementObj.collateralTypeMainCode().sendKeys(testData.get("Collateral Type"));
    	collateralManagementObj.collateralTypeMainCode().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.collateralTypeMainCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    	
    }

    @And("^User enter the Brief description under Collateral Type main screen$")
    public void user_enter_the_brief_description_under_collateral_type_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeMainBriefDescrip());
//    	collateralManagementObj.collateralTypeMainBriefDescrip().sendKeys("Test1");
    	collateralManagementObj.collateralTypeMainBriefDescrip().sendKeys(testData.get("Brief Description"));
    	
    }

    @And("^User enter the Long description under Collateral Type main screen$")
    public void user_enter_the_long_description_under_collateral_type_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeMainLongDescrip());
//    	collateralManagementObj.collateralTypeMainLongDescrip().sendKeys("Test1");
    	collateralManagementObj.collateralTypeMainLongDescrip().sendKeys(testData.get("Long Description"));
    }

    @And("^User select the Asset type as cash under Collateral Type main screen$")
    public void user_select_the_asset_type_as_cash_under_collateral_type_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeMainAssetTypeDropdown());
//    	dropDownHelper.SelectUsingVisibleText(collateralManagementObj.collateralTypeMainAssetTypeDropdown(), "Cash");
    	dropDownHelper.SelectUsingVisibleText(collateralManagementObj.collateralTypeMainAssetTypeDropdown(), testData.get("Asset Type"));
    }
    
    @When("^User clicks on the save button under Collateral Type main screen$")
    public void user_clicks_on_the_save_button_under_collateral_type_main_screen() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.collateralTypeMainSaveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeMainSaveBtn());
    	collateralManagementObj.collateralTypeMainSaveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.confirmPopupOkBtn());
    	collateralManagementObj.confirmPopupOkBtn().click();
  
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.SuccessPopupOkBtn());
    	collateralManagementObj.SuccessPopupOkBtn().click();
    }
    
    @And("^User clicks on the Approve screen under Collateral Type$")
    public void user_clicks_on_the_approve_screen_under_collateral_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeApprove());
    	collateralManagementObj.collateralTypeApprove().click();
    }

    @And("^User search the code under Collateral Type approve screen$")
    public void user_search_the_code_under_collateral_type_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeApproveCode());
//    	collateralManagementObj.collateralTypeApproveCode().sendKeys("1260");
    	collateralManagementObj.collateralTypeMainCode().sendKeys(testData.get("Collateral Type"));
    	collateralManagementObj.collateralTypeApproveCode().sendKeys(Keys.ENTER);
    }

    @And("^User double click on the searched result under Collateral Type approve screen$")
    public void user_double_click_on_the_searched_result_under_collateral_type_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeApproveCodeRow1());
    	clicksAndActionsHelper.doubleClick(collateralManagementObj.collateralTypeApproveCodeRow1());
    }
    
    @When("^User clicks on the Approve button under Collateral Type approve screen$")
    public void user_clicks_on_the_approve_button_under_collateral_type_approve_screen() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.collateralTypeApproveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralTypeApproveBtn());
    	collateralManagementObj.collateralTypeApproveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.confirmPopupOkBtn());
    	collateralManagementObj.confirmPopupOkBtn().click();
  
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.SuccessPopupOkBtn());
    	collateralManagementObj.SuccessPopupOkBtn().click();
    }

    
    
//  @AT_RF_158_Core
    @And("^User click on the Collateral Management feature$")
    public void user_click_on_the_collateral_management_feature() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.FMSCollateralManagement());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMSCollateralManagement());
    	collateralManagementObj.FMSCollateralManagement().click();        
    }

    @And("^User click on the Maintanace screen under Collateral Management$")
    public void user_click_on_the_maintanace_screen_under_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementMaintanance());
    	collateralManagementObj.collateralManagementMaintanance().click();
    }

    @And("^User enter the Collateral type under main information in Collateral Management main Screen$")
    public void user_enter_the_collateral_type_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoCollateralType());
//    	collateralManagementObj.mainInfoCollateralType().sendKeys("564");
    	collateralManagementObj.mainInfoCollateralType().sendKeys(testData.get("Collateral Type"));
    	collateralManagementObj.mainInfoCollateralType().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.mainInfoCollateralType().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    	
    }

    @And("^User give the valid from date under main information in Collateral Management main Screen$")
    public void user_give_the_valid_from_date_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoValidFromDate());
//    	collateralManagementObj.mainInfoValidFromDate().sendKeys("05/01/2022");
    	collateralManagementObj.mainInfoValidFromDate().sendKeys(testData.get("Valid From Date"));
    	collateralManagementObj.mainInfoValidFromDate().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.mainInfoValidFromDate().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User give the valid to date under main information in Collateral Management main Screen$")
    public void user_give_the_valid_to_date_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoValidToDate());
//    	collateralManagementObj.mainInfoValidToDate().sendKeys("05/01/2023");
    	collateralManagementObj.mainInfoValidToDate().sendKeys(testData.get("Valid To Date"));
    	collateralManagementObj.mainInfoValidToDate().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.mainInfoValidToDate().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User enter the brief description under main information in Collateral Management main Screen$")
    public void user_enter_the_brief_description_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoBriefDescrip());
//    	collateralManagementObj.mainInfoBriefDescrip().sendKeys("Test");
    	collateralManagementObj.mainInfoBriefDescrip().sendKeys(testData.get("Brief Description"));
    }

    @And("^User enter the long description under main information in Collateral Management main Screen$")
    public void user_enter_the_long_description_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoLongDescrip());
//    	collateralManagementObj.mainInfoLongDescrip().sendKeys("Test");
    	collateralManagementObj.mainInfoLongDescrip().sendKeys(testData.get("Long Description"));
    }

    @And("^User enter the Collateral currency under main information in Collateral Management main Screen$")
    public void user_enter_the_collateral_currency_under_main_information_in_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoCollateralCurrency());
    	collateralManagementObj.mainInfoCollateralCurrency().sendKeys("840");
    	collateralManagementObj.mainInfoCollateralCurrency().sendKeys(testData.get("Collateral Currency"));
    	collateralManagementObj.mainInfoCollateralCurrency().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.mainInfoCollateralCurrencyLabel().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User move to the Collateral cash details tab in Collateral Management main Screen$")
    public void user_move_to_the_collateral_cash_details_tab_in_collateral_management_main_screen() throws Throwable {    	   	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsTab());
    	for (int i = 0; i < 2000; i++) {
			try {
				collateralManagementObj.CollateralCashDetailsTab().click();
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
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAddIcon());
    	collateralManagementObj.CollateralCashDetailsAddIcon().click();
    }

    @And("^User click the additional reference lookup under Collateral cash details tab$")
    public void user_click_the_additional_reference_lookup_under_collateral_cash_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAdditionalRefLookup());
    	collateralManagementObj.CollateralCashDetailsAdditionalRefLookup().click();
    }

    @And("^User select the any cy value under additional reference lookup$")
    public void user_select_the_any_cy_value_under_additional_reference_lookup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAdditionalRefRow1());
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAdditionalRefCy());
    	clicksAndActionsHelper.doubleClick(collateralManagementObj.CollateralCashDetailsAdditionalRefRow1());
    }

    @And("^User enter the amount value under Collateral cash details tab$")
    public void user_enter_the_amount_value_under_collateral_cash_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAmount());
//    	collateralManagementObj.CollateralCashDetailsAmount().sendKeys("1000");
    	collateralManagementObj.CollateralCashDetailsAmount().sendKeys(testData.get("Amount"));
    	collateralManagementObj.CollateralCashDetailsAmount().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.CollateralCashDetailsAmount().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    	
    }
    
    @When("^User click the save button under Collateral Management main Screen$")
    public void user_click_the_save_button_under_collateral_management_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementMaintananceSaveBtn());
    	collateralManagementObj.collateralManagementMaintananceSaveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.confirmPopupTitle());
    	collateralManagementObj.confirmPopupOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.successPopupTitle());
    	collateralManagementObj.SuccessPopupOkBtn().click();
    	
    	for (int i = 0; i < 500; i++) {
			try {
				collateralManagementObj.sendAlertPopupClose().click();
		    	break;
			} catch (Exception e) {

			}
		}

    }
    
    @And("^User move to the Approve screen undrer Collateral Management$")
    public void user_move_to_the_approve_screen_undrer_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementApprove());
    	collateralManagementObj.collateralManagementApprove().click();
    }

    @And("^User click the clear button under approve screen in Collateral Management$")
    public void user_click_the_clear_button_under_approve_screen_in_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementApproveClearBtn());
    	collateralManagementObj.collateralManagementApproveClearBtn().click();
    }

    @And("^User double click on the first row in approve screen$")
    public void user_double_click_on_the_first_row_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementApproveFirstRow());
    	clicksAndActionsHelper.doubleClick(collateralManagementObj.collateralManagementApproveFirstRow());
    }
    
    @When("^User click the approve button under Collateral Management approve screen$")
    public void user_click_the_approve_button_under_collateral_management_approve_screen() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.collateralManagementApproveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementApproveBtn());
    	collateralManagementObj.collateralManagementApproveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.confirmPopupTitle());
    	collateralManagementObj.confirmPopupOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.successPopupTitle());
    	collateralManagementObj.SuccessPopupOkBtn().click();
        
    }
    @And("Navigate to Additional details tab in Collateral management")
    public void navigate_to_additional_details_tab_in_collateral_management() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_AdditionalDetailsTab());
    	collateralManagementObj.collateral_management_AdditionalDetailsTab().click();
    }

    @And("Click on Advanced Options in Home page")
    public void click_on_advanced_options_in_home_page() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_AdvancedOptions());
    	collateralManagementObj.collateral_management_AdvancedOptions().click();
    }

    @And("Select Setting option in Advanced options dropdown")
    public void select_setting_option_in_advanced_options_dropdown() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_SettingsOption());
    	collateralManagementObj.collateral_management_SettingsOption().click();
    }

    @And("Click on Pencil icon on top of FC Value in Market Value section")
    public void click_on_pencil_icon_on_top_of_fc_value_in_market_value_section() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_FCValueFieldInMarketValueSection());
    	collateralManagementObj.collateral_management_FCValueFieldInMarketValueSection().click();
    }

    @And("Update the field label to Market FC Value in labeling page")
    public void update_the_field_label_to_market_fc_value_in_labeling_page() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_LabelTranslation());
    	collateralManagementObj.collateral_management_LabelTranslation().click();
    	collateralManagementObj.collateral_management_LabelTranslation().clear();
    	collateralManagementObj.collateral_management_LabelTranslation().sendKeys(testData.get("Field Label"));
       
    }

    @And("Click on Save icon in Labeling page")
    public void click_on_save_icon_in_labeling_page() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_LabelTranslation_SaveButton());
    	collateralManagementObj.collateral_management_LabelTranslation_SaveButton().click();
       
    }

    @And("Clic on ok button on approved successful popup")
    public void clic_on_ok_button_on_approved_successful_popup() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_OKButtoninRecordUpdatedPopup());
    	collateralManagementObj.collateral_management_OKButtoninRecordUpdatedPopup().click();
       
    }

    @And("Close the labeling window")
    public void close_the_labeling_window() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_Labeling_Closeicon());
    	collateralManagementObj.collateral_management_Labeling_Closeicon().click(); 
    }

    @And("Click on OK button in Warning popup in collateral management")
    public void click_on_ok_button_in_warning_popup_in_collateral_management() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_OKButtonInReloadPopup());
    	collateralManagementObj.collateral_management_OKButtonInReloadPopup().click();
    }

    @And("Validate the field name is changed to Market FC Value in Market value section")
    public void validate_the_field_name_is_changed_to_market_fc_value_in_market_value_section() {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateral_management_MarketFCValueField());
    	Assert.assertTrue(collateralManagementObj.collateral_management_MarketFCValueField().isDisplayed());
    }
    @And("^get the test data for test case AT_CM_005$")
	public void get_the_test_data_for_test_case_AT_CM_005() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_CM_005");
	}
	@And("^get the test data for test case AT_CM_007$")
	public void get_the_test_data_for_test_case_AT_CM_007() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_CM_007");
	}
	@And("^get the test data for test case AT_CM_008$")
	public void get_the_test_data_for_test_case_AT_CM_008() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS01_AT_CM_008");
	}

	@And("Navigate to 360 degrees view")
	public void navigate_to_degrees_view() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360DegreesViewButton());
		collateralManagementObj.FMS_360DegreesViewButton().click();
	}
	@And("Enter the existing CIF no in CIF no field")
	public void enter_the_existing_cif_no_in_cif_no_field() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_CIFNoField());
		collateralManagementObj.FMS_360Degrees_CIFNoField().click();
		collateralManagementObj.FMS_360Degrees_CIFNoField().clear();
		collateralManagementObj.FMS_360Degrees_CIFNoField().sendKeys(testData.get("CIFID"));
	}
	@And("Click on Close icon in View memo section")
	public void click_on_close_icon_in_view_memo_section() {   
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_ViewGridButton());
		collateralManagementObj.FMS_360Degrees_ViewGridButton().click();
	}
	@And("Click on View grid button in 360 degrees view")
	public void click_on_view_grid_button_in_degrees_view() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_ViewGridButton());
		collateralManagementObj.FMS_360Degrees_ViewGridButton().click();
	}
	@And("Click on Collateral link in 360 degrees view")
	public void click_on_collateral_link_in_degrees_view() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_CollateralsLink());
		collateralManagementObj.FMS_360Degrees_CollateralsLink().click();
	}
	@And("Validate that Linked and Unlinked collaterals is displayed in 360 degrees view")
	public void validate_that_linked_and_unlinked_collaterals_is_displayed_in_degrees_view() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_LinkedCollateralText());
		Assert.assertTrue(collateralManagementObj.FMS_360Degrees_LinkedCollateralText().isDisplayed());  
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_UnLinkedCollateralText());
		Assert.assertTrue(collateralManagementObj.FMS_360Degrees_UnLinkedCollateralText().isDisplayed());  
	}
	@And("Click on Cy 840 - USD Link")
	public void click_on_cy_usd_link() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_CY840USDLink());
		collateralManagementObj.FMS_360Degrees_CY840USDLink().click();
	}
	@And("Validate the respective collateral ID is displayed")
	public void validate_the_respective_collateral_id_is_displayed() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_JVDetailsButton());
		Assert.assertTrue(collateralManagementObj.FMS_360Degrees_JVDetailsButton().isDisplayed());  
	}

	@And("Click on Query button in 360 degrees view")
	public void click_on_query_button_in_degrees_view() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_QueryLink());
		collateralManagementObj.FMS_360Degrees_QueryLink().click();
	}

	@And("Validate Show details button is present in Collateral section")
	public void validate_show_details_button_is_present_in_collateral_section() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_ShowDetailsButton());
		Assert.assertTrue(collateralManagementObj.FMS_360Degrees_ShowDetailsButton().isDisplayed());
	}

	@And("Validate JV Details button is present in Collateral section")
	public void validate_jv_details_button_is_present_in_collateral_section() {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMS_360Degrees_JVDetailsButton());
		Assert.assertTrue(collateralManagementObj.FMS_360Degrees_JVDetailsButton().isDisplayed());
	}
    


}
