package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.fms.ApplicationFinancialFacilityObj_608;
import pageobjects.fms.FacilitiesManagementObj_608;
import pageobjects.fmsParam.FMSParamObj_608;
import pageobjects.fmsParam.RequestForFinancingObj_608;
import resources.BaseClass;

public class ApplicationFinancialFacilitySteps_608 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	ApplicationFinancialFacilityObj_608 applicationFinancialFacilityObj608 = new ApplicationFinancialFacilityObj_608(driver);
	FacilitiesManagementObj_608 facilityManagementObj608 = new FacilitiesManagementObj_608(driver);
	RequestForFinancingObj_608 requestForFinancingObj608 = new RequestForFinancingObj_608(driver);
	FMSParamObj_608 fmsParamObj608 = new FMSParamObj_608(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"ApplicationFinancialFacility","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FacilitiesManagementTestData","DataSet ID");
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"RequestForFinancingTestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMSParameterTestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"IIS_Param_TestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"DrawDownRequestTestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"CommiteeApprovalTestData","DataSet ID");
	Map<String, String> testData;
	
	
//	@AT_AFF_036
	@And("^User_608 get the test data for test case AT_AFF_036$")
    public void get_the_test_data_for_test_case_AT_AFF_036() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_036");
    }
	
//	@AT_AFF_040
	@And("^User_608 get the test data for test case AT_AFF_040$")
    public void get_the_test_data_for_test_case_AT_AFF_040() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_040");
    }
	
//	@AT_AFF_048
	@And("^User_608 get the test data for test case AT_AFF_048$")
    public void get_the_test_data_for_test_case_AT_AFF_048() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_048");
    }
	
//	@AT_FM_058
	@And("User_608 get the test data for test case AT_FM_058")
	public void user_get_the_test_data_for_test_case_AT_FM_058() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_058");
	}
	
//	@AT_FM_059
	@And("User_608 get the test data for test case AT_FM_059")
	public void user_get_the_test_data_for_test_case_AT_FM_059() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_059");
	}
	
	
//	@AT_AFF_052
	@And("^User_608 get the test data for test case AT_AFF_052$")
    public void get_the_test_data_for_test_case_AT_AFF_052() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_052");
    }
	
	
//	@AT_AFF_074
	@And("^User_608 get the test data for test case AT_AFF_074$")
    public void get_the_test_data_for_test_case_AT_AFF_074() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_074");
    }
	
	
//	@AT_AFF_098_FMSParam
	@And("^User_608 get the test data for test case AT_AFF_098_FMSParam$")
    public void get_the_test_data_for_test_case_AT_AFF_098_FMSParam() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_098");
    }
	
//  @AT_AFF_098_FMS_Core
	@And("^get the test data for test case AT_AFF_098_FMSCore$")
	public void user_get_the_test_data_for_test_case_AT_AFF_098fmscore() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_098");
	}
	
//	@AT_RF_099
	@And("^User_608 get the test data for test case AT_RF_099$")
    public void user_get_the_test_data_for_test_case_AT_RF_099() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_099");
    }
	
    
//  @AT_RF_100
    @And("^User_608 get the test data for test case AT_RF_100$")
    public void user_get_the_test_data_for_test_case_AT_RF_100() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_100");
    }
    
//	@AT_RF_101
	@And("^User_608 get the test data for test case AT_RF_101$")
    public void user_get_the_test_data_for_test_case_AT_RF_101() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_101");
    }
    
    
//  @AT_RF_102
    @And("^User_608 get the test data for test case AT_RF_102$")
    public void user_get_the_test_data_for_test_case_AT_RF_102() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_102");
    }
    
//  @AT_RF_139
    @And("User_608 get the test data for test case AT_RF_139")
    public void user_get_the_test_data_for_test_case_at_rf_139() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_139");
    }
    
//  @AT_RF_140
    @And("User_608 get the test data for test case AT_RF_140")
    public void user_get_the_test_data_for_test_case_at_rf_140() {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_140");
    }
    
    
    
	
	
	
//  @AT_RF_014_FMSCore
    @And("^User_608 get the test data for test case AT_RF_014_FMSCore$")
    public void get_the_test_data_for_test_case_AT_RF_014fmscore() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_014");
    }
	
//  @AT_RF_034  
    @And("^User_608 get the test data for test case AT_RF_034$")
    public void get_the_test_data_for_test_case_AT_RF_034() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_034");
    }
	
//  @AT_RF_040
    @And("^User_608 get the test data for test case AT_RF_040$")
    public void get_the_test_data_for_test_case_AT_RF_040() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_040");
    }
	
    
//	@AT_FM_038
	@And("^User_608 get the test data for test case AT_FM_038$")
    public void get_the_test_data_for_test_case_AT_FM_038() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_038");
    }
    
    

//	@AT_FM_102
	@And("User_608 get the test data for test case AT_FM_102")
	public void user_get_the_test_data_for_test_case_AT_FM_102() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_102");
	}

//	@AT_FM_103
	@And("User_608 get the test data for test case AT_FM_103")
	public void user_get_the_test_data_for_test_case_AT_FM_103() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_103");
	}
	
//	@AT_FM_104
	@And("User_608 get the test data for test case AT_FM_104")
	public void user_get_the_test_data_for_test_case_AT_FM_104() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_104");
	}
	
//	@AT_FM_105_FMSParam
	@And("^User_608 get the test data for test case AT_FM_105_FMSParam$")
    public void get_the_test_data_for_test_case_AT_FM_105_FMSParam() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_105");
	}
//	@AT_FM_105_FMSCore
	@And("User_608 get the test data for test case AT_FM_105_FMSCore")
	public void user_get_the_test_data_for_test_case_AT_FM_105_FMSCore() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FM_105");
	}
	
//	@AT_FP_001
	@And("^User_608 get the test data for test case AT_FP_001$")
    public void get_the_test_data_for_test_case_AT_FP_001() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FP_001");
    }
	
//	@AT_DDR_020
	@And("^User_608 get the test data for test case AT_DDR_020$")
    public void get_the_test_data_for_test_case_AT_DDR_020() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_DDR_020");
    }	

//	@AT_DDR_022
	@And("^User_608 get the test data for test case AT_DDR_022$")
    public void get_the_test_data_for_test_case_AT_DDR_022() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_DDR_022");
    }
	
//	@AT_DDR_023
	@And("^User_608 get the test data for test case AT_DDR_023$")
    public void get_the_test_data_for_test_case_AT_DDR_023() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_DDR_023");
    }
	
//	@AT_DDR_024
	@And("^User_608 get the test data for test case AT_DDR_024$")
    public void get_the_test_data_for_test_case_AT_DDR_024() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_DDR_024");
    }
	
    
//  Committee Approval Feature Test Data
//	@AT_CA_008
	@And("^User_608 get the test data for test case AT_CA_008$")
    public void get_the_test_data_for_test_case_AT_CA_008() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_CA_008");
    }	
	
	
//	FacilityApplication - Increase/Decrease feature
//	@AT_FAID_002
	@And("User_608 get the test data for test case AT_FAID_002")
	public void user_get_the_test_data_for_test_case_at_faid_002() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_FAID_002");   
	}
	
	
	
	// Clear cache step
	@And("User_608 clear the caches in FMS Application")
	public void user_clear_the_caches_in_fms_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.FMSCoreTechDetailsIcon_608());
		applicationFinancialFacilityObj608.FMSCoreTechDetailsIcon_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.FMSCoreClearCacheBtn_608());
		applicationFinancialFacilityObj608.FMSCoreClearCacheBtn_608().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_VAK clear the caches in FMS Application")
	public void user_vak_clear_the_caches_in_fms_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.FMSCoreTechDetailsIcon_608());
		applicationFinancialFacilityObj608.FMSCoreTechDetailsIcon_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.FMSCoreClearCacheBtn_608());
		applicationFinancialFacilityObj608.FMSCoreClearCacheBtn_608().click();
		
		for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
//	@AT_AFF_036	
	@And("^User_608 clicks on the WIFAK_Application first link$")
	public void user_clicks_on_the_wifakapplication_first_link() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.wifakApplicationFirst_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakApplicationFirst_608());
		applicationFinancialFacilityObj608.wifakApplicationFirst_608().click();		
	}

	@And("^User_608 clicks on the WIFAK_Application second link$")
	public void user_clicks_on_the_wifakapplication_second_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakApplicationSecond_608());
		applicationFinancialFacilityObj608.wifakApplicationSecond_608().click();
	}

	@And("^User_608 clicks on the Application for financial facility link$")
	public void user_clicks_on_the_application_for_financial_facility_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacility_608());
		applicationFinancialFacilityObj608.applicationFinancialFacility_608().click();
	}
	
	@And("^User_608 clicks the maintanance menu under Application for financial facility$")
	public void user_clicks_the_maintanance_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.appFinancialFacilityMaintanance_608());
		applicationFinancialFacilityObj608.appFinancialFacilityMaintanance_608().click();
	}
	
	@And("^User_608 select the application for dropdown as new facility$")
	public void user_select_the_application_for_dropdown_as_new_facility() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainApplicationForDropdown_608());
//		dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.mainApplicationForDropdown_608(), "New Facility");
		dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.mainApplicationForDropdown_608(), testData.get("Application For"));
	}

	@And("^User_608 enter the CIF No in main info tab$")
	public void user_enter_the_cif_no_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainCIFNo_608());
//		applicationFinancialFacilityObj608.mainCIFNo_608().sendKeys("444");
		applicationFinancialFacilityObj608.mainCIFNo_608().sendKeys(testData.get("CIF No"),Keys.TAB);
	}

	@And("^User_608 enter the facility type in main info tab$")
	public void user_enter_the_facility_type_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainFacilityType_608());
//		applicationFinancialFacilityObj608.mainFacilityType().sendKeys("369");
		applicationFinancialFacilityObj608.mainFacilityType_608().sendKeys(testData.get("Facility Type"),Keys.TAB);

		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.mainFacilityTypeLabel_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	}

	@And("^User_608 enter the country of financing in main info tab$")
	public void user_enter_the_country_of_financing_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainCountryOfFinancing_608());
//		applicationFinancialFacilityObj608.mainCountryOfFinancing().sendKeys("320");
		applicationFinancialFacilityObj608.mainCountryOfFinancing_608().sendKeys(testData.get("Country of Financing"),Keys.TAB);
	}

	@And("^User_608 enter the facility rating in main info tab$")
	public void user_enter_the_facility_rating_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainFacilityRating_608());
//		applicationFinancialFacilityObj608.mainFacilityRating().sendKeys("2");
		applicationFinancialFacilityObj608.mainFacilityRating_608().sendKeys(testData.get("Facility Rating"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.mainFacilityRating_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    
	}

	@And("^User_608 clicks on the additional details tab$")
	public void user_clicks_on_the_additinal_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainAdditionalTab_608());
		for (int i = 0; i < 300; i++) {
			try {
				applicationFinancialFacilityObj608.mainAdditionalTab_608().click();
		    	break;
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_608 enter the total value in additional info tab$")
	public void user_enter_the_total_value_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainAdditionalTabTotalValue_608());
//		applicationFinancialFacilityObj608.mainAdditionalTabTotalValue().sendKeys("1000");
		applicationFinancialFacilityObj608.mainAdditionalTabTotalValue_608().sendKeys(testData.get("Total value"),Keys.TAB);		
	}

	@And("^User_608 enter the expire date in additional info tab$")
	public void user_enter_the_expire_date_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.additionalTabExpireDate_608());
		applicationFinancialFacilityObj608.additionalTabExpireDate_608().sendKeys(testData.get("Expire Date"),Keys.TAB);
		
	}

	@And("^User_608 clicks the limit details tab$")
	public void user_clicks_the_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainLimitDetailsTab_608());
		applicationFinancialFacilityObj608.mainLimitDetailsTab_608().click();
	}

	@And("^User_608 clicks the add new record button in limit details tab$")
	public void user_clicks_the_add_new_record_button_in_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsTabAddNewRecordBtn_608());
		applicationFinancialFacilityObj608.limitDetailsTabAddNewRecordBtn_608().click();
	}

	@And("^User_608 enter the product class details$")
    public void user_enter_the_product_class_details() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsNewRecordProductClass_608());
        applicationFinancialFacilityObj608.limitDetailsNewRecordProductClass_608().sendKeys(testData.get("Product Class"),Keys.TAB);
        for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsNewRecordProductClassValue_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
        
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsNewRecordCleanFlag_608());
        WebElement cleanFlag = applicationFinancialFacilityObj608.limitDetailsNewRecordCleanFlag_608();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
	}

	@Then("^User_608 Validate the floating rate with yield details$")
	public void validate_the_floating_rate_with_yield_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.limitDetailsFloatingRate_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsFloatingRate_608());
		int floatingRate=0;
        for (int i = 0; i <25; i++) {
            floatingRate = Integer.parseInt(applicationFinancialFacilityObj608.limitDetailsFloatingRate_608().getAttribute("prevvalue"));
        }
        Assert.assertEquals(floatingRate>0, true);
	}
	
	
	
//	@AT_AFF_040
	@And("^User_608 clicks on the Approve level1 link$")
	public void user_clicks_on_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel1_608());
		applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel1_608().click();
	}

	@And("^User_608 search the code$")
	public void user_search_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilitySearchCode_608());
		applicationFinancialFacilityObj608.applicationFinancialFacilitySearchCode_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
	}

	@And("^User_608 double click searched record$")
	public void user_double_click_searched_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilitySearchResult_608());
		clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.applicationFinancialFacilitySearchResult_608());
	}

	@And("^User_608 clicks on the History log tap$")
	public void user_clicks_on_the_history_log_tap() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityHistoryLogTab_608());
		applicationFinancialFacilityObj608.applicationFinancialFacilityHistoryLogTab_608().click();
	}
	
	@Then("User_608 validate History log tab values should be displayed")
	public void user_validate_history_log_tab_values_should_be_displayed() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityHistoryLogValues_608());
		boolean historyLogValues = applicationFinancialFacilityObj608.applicationFinancialFacilityHistoryLogValues_608().isDisplayed();
		Assert.assertTrue(historyLogValues);
	}
	
	
	
//	AT_AFF_048
	@And("User_608 retrive the Account number in limit details")
	public void user_retrive_the_account_number_in_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsAccountNoSearch_608());
		applicationFinancialFacilityObj608.limitDetailsAccountNoSearch_608().click();
        
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsRetrieveAccountNo());
        clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.limitDetailsRetrieveAccountNo());
        
        for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsAccountNoInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	    
	}
	
	@And("^User_608 clicks on the product class add button$")
    public void user_clicks_on_the_product_class_add_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.limitDetailsProductAddBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsProductAddBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsProductAddBtn_608().click();
    }
	
	@And("User_608 clicks on the Charges details button under limit details")
	public void user_clicks_on_the_charges_details_button_under_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsChargesDetailsBtn_608());
		applicationFinancialFacilityObj608.limitDetailsChargesDetailsBtn_608().click();
	}
	
	@And("User_608 select the collect at facility approval flag")
	public void user_select_the_collect_at_facility_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCodeLabel_608());
		applicationFinancialFacilityObj608.chargesDetailsCodeLabel_608().click();
   
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCode_608());
    	
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsCollectFacApprovalFlag_608());
    	WebElement chargesDetailsCollectFacApprovalFlag_608 = applicationFinancialFacilityObj608.chargesDetailsCollectFacApprovalFlag_608();
    	if(!(chargesDetailsCollectFacApprovalFlag_608.isSelected())) {
    		chargesDetailsCollectFacApprovalFlag_608.click();
    	}
	}
	
	@And("User_608 click the Ok button in Charges details under limit details")
	public void user_click_the_ok_button_in_charges_details_under_limit_details() throws Throwable {		
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.chargesDetailsOkBtn_608());
		applicationFinancialFacilityObj608.chargesDetailsOkBtn_608().click();
	}
	
	@And("^User_608 move to the Document details tab$")
    public void user_move_to_the_document_details_tab() throws Throwable {
		Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainDocumentDetailsTab_608());
    	applicationFinancialFacilityObj608.mainDocumentDetailsTab_608().click();    	
    }

    @And("^User_608 enter the Solicitor Name$")
    public void user_enter_the_solicitor_name() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.documentDetailsSolicitorName_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.documentDetailsSolicitorName_608());
    	applicationFinancialFacilityObj608.documentDetailsSolicitorName_608().sendKeys(testData.get("Solicitor Name"),Keys.TAB);
    }

    @And("^User_608 enter the Estimator Name$")
    public void user_enter_the_estimator_name() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.documentDetailsEstimatorName_608());
    	applicationFinancialFacilityObj608.documentDetailsEstimatorName_608().sendKeys(testData.get("Estimator Name"),Keys.TAB);
    	
    }

    @And("^User_608 clicks the save button$")
    public void user_clicks_the_save_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsSaveBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsSaveBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
    }

    @And("^User_608 clicks on the validate button$")
    public void user_clicks_on_the_validate_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsValidateBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsValidateBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	// Facility already created popup
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.confirmPopup_608());
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.facilityAlreadyCreatedPopup_608());
    	applicationFinancialFacilityObj608.facilityAlreadyCreatedPopup_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.successPopup_608());
//    	String SuccessMsg = applicationFinancialFacilityObj608.successPopupMessage().getText();
    	String refCode = applicationFinancialFacilityObj608.successPopupMessage_608().getText().substring(23, 27);
    	System.err.println("Reference Number: "+refCode);    	
    	fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"),"Reference Code", refCode);
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}   
    	
    	// close the send alert pop-up box
    	for (int i = 0; i < 200; i++) {
			try {
		    	applicationFinancialFacilityObj608.sendAlertPopup_608().click();
		    	break;
			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
    	
    }
    
    @Then("User_608 clicks the Approve Level1 menu under Application for financial facilities")
    public void user_clicks_the_approve_level1_menu_under_application_for_fianancial_facilities() throws Throwable {
    	Thread.sleep(5000);
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel1_608());
    	applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel1_608().click();	
    }

    @And("User_608 enter the reference code in Approve level1")
    public void user_enter_the_reference_code_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1RefCodeInput_608());    	
    	applicationFinancialFacilityObj608.approveLevel1RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level1")
    public void user_double_click_on_the_retrieve_reference_code_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1RetrieveCode_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.approveLevel1RetrieveCode_608());        
    }

    @And("User_608 select the Approve level1 decision as Forward")
    public void user_select_the_approve_level1_decision_as_forward() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SelectDecisionForward_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel1SelectDecisionForward_608(), testData.get("Decision"));
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.approveLevel1SelectDecisionForward_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    
    }
    
    @And("User_608 select the Approve level1 decision Forward to Approve level3")
    public void user_select_the_approve_level1_decision_forward_to_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1DecisionForwardTo_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel1DecisionForwardTo_608(), testData.get("Forward To"));
    }
    
    @And("User_608 select the Approve level1 decision as Approve")
    public void user_select_the_approve_level1_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel1SelectDecision_608(), testData.get("Decision3"));        
    }

//    @And("User_608 select the Approve level1 decision Forward to Approve level3")
//    public void user_select_the_approve_level1_decision_forward_to_approve_level3() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1DecisionForwardTo_608());
//    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel1DecisionForwardTo_608(), testData.get("Forward To"));
//    }

    @When("User_608 clicks on the Approve level1 submit button")
    public void user_clicks_on_the_approve_level1_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SubmitBtn_608());
    	applicationFinancialFacilityObj608.approveLevel1SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();        
    }
    
    
    @Then("User_608 clicks the Approve Level2 menu under Application for financial facilities")
    public void user_clicks_the_approve_level2_menu_under_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel2_608());
    	applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel2_608().click();        
    }

    @And("User_608 enter the reference code in Approve level2")
    public void user_enter_the_reference_code_in_approve_level2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel2RefCodeInput_608());
    	applicationFinancialFacilityObj608.approveLevel2RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level2")
    public void user_double_click_on_the_retrieved_reference_code_in_approve_level2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel2RetrieveRefCode_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.approveLevel2RetrieveRefCode_608());        
    }

    @And("User_608 select the Approve level2 decision as Approve")
    public void user_select_the_approve_level2_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel2SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel2SelectDecision_608(), testData.get("Decision3"));        
    }

    @When("User_608 clicks on the Approve level2 submit button")
    public void user_clicks_on_the_approve_level2_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel2SubmitBtn_608());
    	applicationFinancialFacilityObj608.approveLevel2SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
    }
    
    @Then("User_608 clicks the Approve Level3 menu under Application for financial facilities")
    public void user_clicks_the_approve_level3_menu_under_application_for_financial_facilities() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel3_608());
    	applicationFinancialFacilityObj608.applicationFinancialFacilityApproveLevel3_608().click();        
    }

    @And("User_608 enter the reference code in Approve level3")
    public void user_enter_the_reference_code_in_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel3RefCodeInput_608());
    	applicationFinancialFacilityObj608.approveLevel3RefCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);        
    }

    @And("User_608 double click on the retrieved reference code in Approve level3")
    public void user_double_click_on_the_retrieved_reference_code_in_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel3RetrieveRefCode_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.approveLevel3RetrieveRefCode_608());        
    }

    @And("User_608 select the Approve level3 decision as Approve")
    public void user_select_the_approve_level3_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel3SelectDecision_608());
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.approveLevel3SelectDecision_608(), testData.get("Decision3"));        
    }

    @When("User_608 clicks on the Approve level3 submit button")
    public void user_clicks_on_the_approve_level3_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel3SubmitBtn_608());
    	applicationFinancialFacilityObj608.approveLevel3SubmitBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
    	
    	// close the send alert pop-up box
    	for (int i = 0; i < 500; i++) {
			try {
		    	applicationFinancialFacilityObj608.level3SendAlertPopup_608().click();
		    	break;
			} catch (Exception e) {
				
			}
		}
        
    }

    
    
 // @AT_AFF_052
    @And("^User_608 clicks on the clear button under Approve level1$")
    public void user_clicks_on_the_clear_button() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SearchGrid_608());       
        for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(applicationFinancialFacilityObj608.approveLevel1ClearBtn_608(),
						applicationFinancialFacilityObj608.approveLevel1ClearBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^User_608 double clicks on the first row of approve level1$")
    public void user_double_clicks_on_the_first_row_of_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1SearchedData_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.approveLevel1SearchedData_608());
    }

    @And("^User_608 move to additional details tab in approve level1$")
    public void user_move_to_additional_details_tab_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1AdditionalDetailsTab_608());
    	applicationFinancialFacilityObj608.approveLevel1AdditionalDetailsTab_608().click();
    }

    
    @When("^User_608 clicks on the BM Recommendations button$")
    public void user_clicks_on_the_bm_recommendations_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.additionalDetailsBMRecommedBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	applicationFinancialFacilityObj608.additionalDetailsBMRecommedBtn_608().click();
    }

    @Then("^User_608 validate the BM Recommendations tab should be editable$")
    public void user_validate_the_bm_recommendations_tab_is_editable_or_not() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.BMRecommedTab_608());
    	applicationFinancialFacilityObj608.BMRecommedTab_608().sendKeys(testData.get("BM Recommends"));
    	String readOnly = applicationFinancialFacilityObj608.BMRecommedTab_608().getAttribute("readonly");
    	Assert.assertNull(readOnly);
    }
    
    
    
    
 // @AT_AFF_056	
 	@And("^User_608 clicks on the Parameter module in FMS Param$")
     public void user_clicks_on_the_parameter_module() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.fmsParamParameter_608());
         fmsParamObj608.fmsParamParameter_608().click();
     }

     @And("^User_608 clicks on the Facility category feature under Parameter$")
     public void user_clicks_on_the_facility_category_feature() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.parameterFacilityCategory_608());
     	fmsParamObj608.parameterFacilityCategory_608().click();
     }

     @And("^User_608 clicks on the maintanance menu under Facility category$")
     public void user_clicks_on_the_maintanance_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityCategoryMaintanance_608());
     	fmsParamObj608.facilityCategoryMaintanance_608().click();        
     }

     @And("^User_608 clicks on the search button under Facility category maintanance$")
     public void user_clicks_on_the_search_button() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityCategoryMainSearchBtn_608());
     	fmsParamObj608.facilityCategoryMainSearchBtn_608().click();
     }

     @And("^User_608 double clicks on the any one row in Maintanance under Facility category$")
     public void user_double_clicks_on_the_any_one_row() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityCategoryMainSearchResult());
     	clicksAndActionsHelper.doubleClick(fmsParamObj608.facilityCategoryMainSearchResult());        
     }

     @And("^User_608 clicks the CIF type search option in Maintanance under Facility category$")
     public void user_clicks_the_cif_type_search_option() throws Throwable {
     	Thread.sleep(3000);
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityCategoryMainCIFTypeSearchOption());
     	fmsParamObj608.facilityCategoryMainCIFTypeSearchOption().click();
     }

     @And("^User_608 double click on the any one value in Maintanance under Facility category$")
     public void user_double_click_on_the_any_one_value() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(fmsParamObj608.facilityCategoryMainCIFTypeData());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
//     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainCIFTypeData());
     	clicksAndActionsHelper.doubleClick(fmsParamObj608.facilityCategoryMainCIFTypeData());
     }
     
     @Then("^User_608 clicks on the save button and save the record in Maintanance under Facility category$")
     public void user_clicks_on_the_save_button_and_save_the_record() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityCategoryMainSaveBtn());
     	fmsParamObj608.facilityCategoryMainSaveBtn().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
     	applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
     	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
     }
     
     
// 	@AT_AFF_075
 	@And("^User_608 clicks on the control records feature under Parameter$")
     public void user_clicks_on_the_control_records_feature() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.parameterControlRecords_608());
         fmsParamObj608.parameterControlRecords_608().click();
     }

     @And("^User_608 clicks on the update after approve menu under control records$")
     public void user_clicks_on_the_update_after_approve_menu() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsUpdateAfterApprove_608());
         fmsParamObj608.controlRecordsUpdateAfterApprove_608().click();
     }

     @And("^User_608 validate the Officer Assigned Required checkbox$")
     public void user_validate_the_officer_assigned_required_checkbox() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMainInfoOfficerAssignReqCheck_608());
     	WebElement mainInfoOfficerAssignReqCheck = fmsParamObj608.controlRecordsMainInfoOfficerAssignReqCheck_608();
     	Assert.assertEquals(true, mainInfoOfficerAssignReqCheck.isDisplayed());
     	
     	WebElement mainInfoOfficerAssignReqLabel = fmsParamObj608.controlRecordsMainInfoOfficerAssignReqLabel_608();
     	Assert.assertEquals(true, mainInfoOfficerAssignReqLabel.isDisplayed());
     }

     @And("^User_608 uncheck the Officer Assigned Required flag$")
     public void user_uncheck_the_officer_assigned_required_flag() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMainInfoOfficerAssignReqCheck_608());
     	WebElement mainInfoOfficerAssignReqCheck = fmsParamObj608.controlRecordsMainInfoOfficerAssignReqCheck_608();
     	if(!(mainInfoOfficerAssignReqCheck.isSelected())) {
     		mainInfoOfficerAssignReqCheck.click();
     	}
     }

     @And("^User_608 validate the Enable Markup Type checkbox$")
     public void user_validate_the_enable_markup_type_checkbox() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(fmsParamObj608.controlRecordsMainInfoEnableMarkupCheck_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMainInfoEnableMarkupCheck_608());
     	WebElement mainInfoEnableMarkupCheck = fmsParamObj608.controlRecordsMainInfoEnableMarkupCheck_608();
     	Assert.assertEquals(true, mainInfoEnableMarkupCheck.isDisplayed());
     	
     	WebElement mainInfoOfficerAssignReqLabel = fmsParamObj608.controlRecordsMainInfoOfficerAssignReqLabel_608();
     	Assert.assertEquals(true, mainInfoOfficerAssignReqLabel.isDisplayed());
     }

     @And("^User_608 uncheck the Enable Markup Type flag$")
     public void user_uncheck_the_enable_markup_type_flag() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMainInfoEnableMarkupCheck_608());
     	WebElement mainInfoEnableMarkupCheck = fmsParamObj608.controlRecordsMainInfoEnableMarkupCheck_608();
     	if(mainInfoEnableMarkupCheck.isSelected()) {
     		mainInfoEnableMarkupCheck.click();
     	}
     }

     @And("^User_608 validate the Role of Officers Assigned menu$")
     public void user_validate_the_roll_of_officers_assigned_menu() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(fmsParamObj608.controlRecordsUpdateAfterRoleOfOfficersAssigned_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	WebElement updateAfterRoleOfOfficersAssigned = fmsParamObj608.controlRecordsUpdateAfterRoleOfOfficersAssigned_608();
     	Assert.assertEquals(true, updateAfterRoleOfOfficersAssigned.isDisplayed());
     }

     @And("^User_608 validate the Party s History with Company menu$")
     public void user_validate_the_party_s_history_with_company_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsUpdateAfterPartysHistory_608());
     	WebElement updateAfterPartysHistory = fmsParamObj608.controlRecordsUpdateAfterPartysHistory_608();
     	Assert.assertEquals(true, updateAfterPartysHistory.isDisplayed());
     }

     @And("^User_608 validate the Member Countries$")
     public void user_validate_the_member_countries() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsUpdateAferMemberCountries_608());
     	WebElement updateAferMemberCountries = fmsParamObj608.controlRecordsUpdateAferMemberCountries_608();
     	Assert.assertEquals(true, updateAferMemberCountries.isDisplayed());
     }

     @And("^User_608 clicks on the update button under Update after approve menu in control records$")
     public void user_clicks_on_the_update_button_under_Update_after_approve_menu_in_control_records() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(fmsParamObj608.controlRecordsUpdateAfterUpdateBtn_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsUpdateAfterUpdateBtn_608());
     	fmsParamObj608.controlRecordsUpdateAfterUpdateBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
     	applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
     	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
     }
     
     @And("^User_608 check the Officer Assigned Required flag$")
     public void user_check_the_officer_assigned_required_flag() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMainInfoOfficerAssignReqCheck_608());
     	WebElement mainInfoOfficerAssignReqCheck = fmsParamObj608.controlRecordsMainInfoOfficerAssignReqCheck_608();
     	if(mainInfoOfficerAssignReqCheck.isSelected()) {
     		mainInfoOfficerAssignReqCheck.click();
     	}
     }

     @And("^User_608 clicks on the approve menu under control records$")
     public void user_clicks_on_the_approve_feature() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsApproveMenu_608());
     	fmsParamObj608.controlRecordsApproveMenu_608().click();
     }

     @When("^User_608 clicks on the approve button in Approve menu under control records$")
     public void user_clicks_on_the_approve_button() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(fmsParamObj608.controlRecordsApproveButton_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	fmsParamObj608.controlRecordsApproveButton_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608());
     	applicationFinancialFacilityObj608.ConfirmPopupOkBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
     	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
     }
     
     
     
//    @AT_AFF_074    
     @And("^User_608 clicks on the member countries tab in update after approve under control records$")
     public void user_clicks_on_the_member_countries_menu() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsUpdateAferMemberCountries_608());
         fmsParamObj608.controlRecordsUpdateAferMemberCountries_608().click();
     }

     @And("^User_608 clicks the add new row button under member countries tab in update after approve$")
     public void user_clicks_the_add_new_row_button() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMemberCountriesAddNewRowBtn_608());
     	fmsParamObj608.controlRecordsMemberCountriesAddNewRowBtn_608().click();
     }
     

     @And("^User_608 enter the country code under member countries tab in update after approve$")
     public void user_enter_the_country_code() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMemberCountriesCountryCodeLabel_608());
     	fmsParamObj608.controlRecordsMemberCountriesCountryCodeLabel_608().click();
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMemberCountriesCountryCode_608());
//     	applicationFinancialFacilityObj608.countryCode().sendKeys("320");
     	fmsParamObj608.controlRecordsMemberCountriesCountryCode_608().sendKeys(testData.get("Country Code"),Keys.ENTER);     	
     }
     
     @SuppressWarnings("unlikely-arg-type")
	@And("^User_608 clicks on the membership type dropdown under member countries tab in update after approve$")
     public void user_clicks_on_the_membership_type_dropdown() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.controlRecordsMemberCountriesMembershipTypeLabel_608());
     	List<String> membershipType = Arrays.asList("ITFC","IDB Member","Both");
     	fmsParamObj608.controlRecordsMemberCountriesMembershipTypeLabel_608().click();     	
     	fmsParamObj608.controlRecordsMemberCountriesMembershipTypeLabel_608().click();
     	
     	WebElement membershipTypeDD = fmsParamObj608.controlRecordsMemberCountriesMembershipTypeDropDown_608();
     	Select getValue = new Select(membershipTypeDD);
     	List<WebElement> allOptions = getValue.getOptions();
     	
     	for (int j = 0; j < allOptions.size(); j++) {
     		String text = allOptions.get(j).getText();
     		membershipType.equals(text);
        }
     	
     }
     
     
     
//   @AT_AFF_098_FMSParam
     @And("^User_608 clicks on the Facility Type feature$")
     public void user_clicks_on_the_facility_type_feature() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.paramFacilityType_608());
     	 fmsParamObj608.paramFacilityType_608().click();
     }
     
     @And("^User_608 clicks on the update after approve menu in Facility type$")
     public void user_clicks_on_the_update_after_approve_menu_in_facility_type() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityTypeUpdateAfterApprove_608());
    	 	fmsParamObj608.facilityTypeUpdateAfterApprove_608().click();
     }
     
     @And("^User_608 enter the code value in update after approve menu$")
     public void user_enter_the_code_value_in_update_after_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityTypeSearchCode_608());
     	fmsParamObj608.facilityTypeSearchCode_608().sendKeys(testData.get("Facility Type"),Keys.ENTER);
     }
     
     @And("^User_608 double click on the retrieved data in update after approve menu$")
     public void user_double_click_on_the_retrieved_data_in_update_after_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityTypeSearchCodeResult_608());
     	for (int i = 0; i <= 300; i++) {
 			try {
 				clicksAndActionsHelper.doubleClick(fmsParamObj608.facilityTypeSearchCodeResult_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
    	 	
     }
     
     @And("^User_608 clicks on the facility details tab in update after approve$")
     public void user_clicks_on_the_facility_details_tab_in_update_after_approve() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityTypeFacilityDetails_608());
    	 	fmsParamObj608.facilityTypeFacilityDetails_608().click();
     }
  
     @And("^User_608 clicks on the STP Facility Requirements option$")
     public void user_clicks_on_the_stp_facility_requirements_option() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.STPFacilityReq_608());
     	 fmsParamObj608.STPFacilityReq_608().click();
     }

     @And("^User_608 check the Customer Grading flag$")
     public void user_check_the_customer_grading_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.customerGradingFlag_608());
     	 WebElement customerGradingFlag = fmsParamObj608.customerGradingFlag_608();
     	 if(!(customerGradingFlag.isSelected())) {
     		 customerGradingFlag.click();
      	}
     }

     @And("^User_608 check the Overwrite Grading flag$")
     public void user_check_the_overwrite_grading_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.OverwriteGradingFlag_608());
     	 WebElement overwriteGradingFlag = fmsParamObj608.OverwriteGradingFlag_608();
     	 if(!(overwriteGradingFlag.isSelected())) {
     		 overwriteGradingFlag.click();
      	}
     }

     @And("^User_608 check the Credit Review flag$")
     public void user_check_the_credit_review_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.creditReviewFlag_608());
     	 WebElement creditReviewFlag = fmsParamObj608.creditReviewFlag_608();
     	 fmsParamObj608.creditReviewFlag_608().click();
     	 if(!(creditReviewFlag.isSelected())) {
     		 creditReviewFlag.click();
      	}
     }

     @And("^User_608 check the Committee Approval flag$")
     public void user_check_the_committee_approval_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.committeeApprovalFlag_608());
     	 WebElement committeeApprovalFlag = fmsParamObj608.committeeApprovalFlag_608();
     	 if(!(committeeApprovalFlag.isSelected())) {
     		 committeeApprovalFlag.click();
      	}
     }
     
     @And("^User_608 uncheck the Committee Approval flag$")
     public void user_uncheck_the_committee_approval_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.committeeApprovalFlag_608());
     	 WebElement committeeApprovalFlag = fmsParamObj608.committeeApprovalFlag_608();
     	 if(committeeApprovalFlag.isSelected()) {
     		 committeeApprovalFlag.click();
      	}
     }
     

     @And("^User_608 check the Credit Authorization flag$")
     public void user_check_the_credit_authorization_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.creditAuthorzieFlag_608());
     	 WebElement creditAuthorzieFlag = fmsParamObj608.creditAuthorzieFlag_608();
     	 if(!(creditAuthorzieFlag.isSelected())) {
     		 creditAuthorzieFlag.click();
      	}
     }

     @And("^User_608 check the Issue Facility Offer flag$")
     public void user_check_the_issue_facility_offer_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.issueFacilityOfferFlag_608());
     	 WebElement issueFacilityOfferFlag = fmsParamObj608.issueFacilityOfferFlag_608();
     	 if(!(issueFacilityOfferFlag.isSelected())) {
     		 issueFacilityOfferFlag.click();
      	}
     }

     @And("^User_608 check the Client Response flag$")
     public void user_check_the_client_response_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.clientResponseFlag_608());
     	 WebElement clientResponseFlag = fmsParamObj608.clientResponseFlag_608();
     	 if(!(clientResponseFlag.isSelected())) {
     		 clientResponseFlag.click();
      	}
     }

     @And("^User_608 check the Document Validation flag$")
     public void user_check_the_document_validation_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentValidationFlag_608());
     	 WebElement documentValidationFlag = fmsParamObj608.documentValidationFlag_608();
     	 if(!(documentValidationFlag.isSelected())) {
     		 documentValidationFlag.click();
      	}
     }

     @And("^User_608 check the Final Approval flag$")
     public void user_check_the_final_approval_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.finalApprovalFlag_608());
     	 WebElement finalApprovalFlag = fmsParamObj608.finalApprovalFlag_608();
     	 if(!(finalApprovalFlag.isSelected())) {
     		 finalApprovalFlag.click();
      	}
     }

     @And("^User_608 check the Create Active Facility If Within Limits flag$")
     public void user_check_the_create_active_facility_if_within_limits_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.createActiveFacilityFlag_608());
     	 WebElement createActiveFacilityFlag = fmsParamObj608.createActiveFacilityFlag_608();
     	 if(!(createActiveFacilityFlag.isSelected())) {
     		 createActiveFacilityFlag.click();
      	}
     }

     @And("^User_608 Check the Automatically Approve Facility If Within Limits flag$")
     public void user_check_the_automatically_approve_facility_if_within_limits_flag() throws Throwable {
     	 waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.autoApproveFacilityFlag_608());
     	 WebElement autoApproveFacilityFlag = fmsParamObj608.autoApproveFacilityFlag_608();
     	 if(!(autoApproveFacilityFlag.isSelected())) {
     		 autoApproveFacilityFlag.click();
      	}
     }
     
     @When("^User_608 clicks on the Update button under update after approve menu in Facility type$")
     public void user_clicks_on_the_update_button_under_update_after_approve_menu_in_facility_type() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(fmsParamObj608.updateAfterApproveUpdateBtn_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
     	}
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.updateAfterApproveUpdateBtn_608());
     	fmsParamObj608.updateAfterApproveUpdateBtn_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.confirmPopupOkBtn_608());
     	fmsParamObj608.confirmPopupOkBtn_608().click();
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.successPopupOkBtn_608());
     	fmsParamObj608.successPopupOkBtn_608().click();
     }

     @And("^User_608 after the update go to the Approve menu$")
     public void user_after_the_update_go_to_the_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityTypeApproveMenu_608());
     	fmsParamObj608.facilityTypeApproveMenu_608().click();
     }
     
     @And("^User_608 enter the code value in Approve menu$")
     public void user_enter_the_code_value_in_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.approveSearchCode_608());
     	fmsParamObj608.approveSearchCode_608().sendKeys(testData.get("Facility Type"),Keys.ENTER);
     }

     @And("^User_608 double click on the retrieved data in Approve menu$")
     public void user_double_click_on_the_retrieved_data_in_approve_menu() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.approveSearchCodeResult_608());
     	clicksAndActionsHelper.doubleClick(fmsParamObj608.approveSearchCodeResult_608());
     	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(fmsParamObj608.facilityTypeApproveMenuCode_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
     }
     
     @When("^User_608 clicks on the Approve button in Approve menu under Facility Type$")
     public void user_clicks_on_the_approve_button_in_approve_menu_under_facility_type() throws Throwable {
     	for (int i = 0; i <= 300; i++) {
 			try {
 				javaScriptHelper.scrollIntoView(fmsParamObj608.facilityTypeApproveBtn_608());
 				break;
 			} catch (Exception e) {
 				if (i == 300) {
 					Assert.fail(e.getMessage());
 				}
 			}
 		}
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.facilityTypeApproveBtn_608());
     	fmsParamObj608.facilityTypeApproveBtn_608().click();
  
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.confirmPopupOkBtn_608());
     	fmsParamObj608.confirmPopupOkBtn_608().click();
     	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.successPopupOkBtn_608());
     	fmsParamObj608.successPopupOkBtn_608().click();        
     }
     
     
 //  @AT_AFF_098_FMSCore
     @And("^User_608 define the marketed by field in main info tab$")
     public void user_define_the_marketed_by_field_in_main_info_tab() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainMarketedByFieldSearch_608()); 
     	applicationFinancialFacilityObj608.mainMarketedByFieldSearch_608().click();
     	
     	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainMarketedByValue_608());
     	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.mainMarketedByValue_608());    	
     }
     
     
//   @AT_AFF_098_CSMCore    
   @And("^User_608 clicks on the transfer of entities module$")
   public void user_clicks_on_the_transfer_of_entities_module() throws Throwable {
   	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.transferOfEntitiesModule_608());
   	applicationFinancialFacilityObj608.transferOfEntitiesModule_608().click();
   }

   @And("^User_608 clicks on the transfer of entities maintanance menu$")
   public void user_clicks_on_the_transfer_of_entities_maintanance_menu() throws Throwable {
   	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.transferEntitiesMain_608());
   	applicationFinancialFacilityObj608.transferEntitiesMain_608().click();
   }
          
     

     
     
     /// Test data needed steps
// @AT_RF_099_FMSParam
   @And("^User_608 select the collateral as application level$")
	public void user_select_the_collateral_as_application_level() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.selectCollateral_608());
		fmsParamObj608.selectCollateral_608().click();
		dropDownHelper.SelectUsingVisibleText(fmsParamObj608.selectCollateral_608(), testData.get("Collateral"));
	}

	@And("^User_608 select the Collaterals defined at the level of as sublimit$")
	public void user_select_the_collaterals_defined_at_the_level_of_as_sublimit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.selectCollateralDefinedLevel_608());
		fmsParamObj608.selectCollateralDefinedLevel_608().click();
		dropDownHelper.SelectUsingVisibleText(fmsParamObj608.selectCollateralDefinedLevel_608(),
				testData.get("Collaterals defined"));

		// Dummy step
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.checkCollateralFacility_608());
		WebElement checkCollateralFacility = fmsParamObj608.checkCollateralFacility_608();
		fmsParamObj608.checkCollateralFacility_608().click();
		if (!(checkCollateralFacility.isSelected())) {
			checkCollateralFacility.click();
		}
	}
   
   
//   @AT_FM_058
   	@And("User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application")
   	public void user_enter_the_application_ref_number_in_facilities_management_maintanance_search_grid_under_wifak_application() throws Throwable {
   		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSearchApplicationRefInput_608());
   		facilityManagementObj608.wifakFacilitiesManagementMainSearchApplicationRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
   	}
   	
   	
////@AT_FM_059_User_608
  @And("User_608 clicks on the validate button and wait for Send Alert popup")
  public void user_clicks_on_the_validate_button_and_wait_for_send_alert_popup() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsValidateBtn_608());
  	applicationFinancialFacilityObj608.limitDetailsValidateBtn_608().click();
  	
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
  	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
  	
  	// Facility already created popup
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.confirmPopup_608());
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.facilityAlreadyCreatedPopup_608());
  	applicationFinancialFacilityObj608.facilityAlreadyCreatedPopup_608().click();
  	
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.successPopup_608());
//  	String SuccessMsg = applicationFinancialFacilityObj608.successPopupMessage().getText();
  	String refCode = applicationFinancialFacilityObj608.successPopupMessage_608().getText().substring(23, 27);
  	System.err.println("Reference Number: "+refCode);
  	fmsTransactionsExcelData.updateTestData("DS_AT_FM_038", "Reference Code", refCode);
  	
  	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

      
  }

  @And("User_608 search the VAK user in search grid under Send Alert popup")
  public void user_search_the_vak_user_in_search_grid_under_send_alert_popup() throws Throwable{
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.sendAlertPopup_608());
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.sendAlertSearchGridUserID_608());
  	applicationFinancialFacilityObj608.sendAlertSearchGridUserID_608().sendKeys(testData.get("Send Alert User"),Keys.ENTER);  
  }

  @And("User_608 click the VAK User row in search grid under Send Alert popup")
  public void user_click_the_vak_user_row_in_search_grid_under_send_alert_popup() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.sendAlertSearchGridUserIDRow_608());
  	applicationFinancialFacilityObj608.sendAlertSearchGridUserIDRow_608().click();
  }

  @And("User_608 click the Send button under Send Alert popup")
  public void user_click_the_send_button_under_send_alert_popup() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.sendAlertSendBtn_608());
  	applicationFinancialFacilityObj608.sendAlertSendBtn_608().click();
  }

  @And("User_VAK Should be validate Alert popup is displayed")
  public void user_vak_should_be_validate_alert_popup_is_displayed() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.UserVakAlertPopup_608());
  	boolean alertisDisplayed = applicationFinancialFacilityObj608.UserVakAlertPopup_608().isDisplayed();
  	Assert.assertEquals(true, alertisDisplayed);
  }

  @And("User_VAK click the open items under approve alert popup")
  public void user_vak_click_the_open_items_under_approve_alert_popup() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.sendAlertOpenItemLink_608());
  	applicationFinancialFacilityObj608.sendAlertOpenItemLink_608().click();
  }

  @And("User_VAK Click the Approve button under Approve item popup")
  public void user_vak_click_the_approve_button_under_approve_item_popup() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.sendAlertApproveItemCode_608());
  	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.sendAlertApproveItemApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
  	}
  	applicationFinancialFacilityObj608.sendAlertApproveItemApproveBtn_608().click();
  }
   	
   	
   
//     @AT_FM_102
     @And("User_608 user Re_enter the no of payments in Repayment Plan tab Application Financial Facility Maintanance")
     public void user_user_re_enter_the_no_of_payments_in_repayment_plan_tab_application_financial_facility_maintanance() throws Throwable {
  		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608());
  		WebElement NoOfPaymentsInput = facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608();
  		NoOfPaymentsInput.clear();
  		NoOfPaymentsInput.sendKeys(testData.get("No of Payments"));
  		facilityManagementObj608.WifakLimitDetailsRepaymentPlanTabNoOfPaymentsLabel_608().click();  		
  		for(int i = 0; i <= 500; i++) {
     		try {
  				if(NoOfPaymentsInput.getAttribute("prevvalue").equals(testData.get("No of Payments"))) {
  					break;
  				}
  			} catch (Exception e) {
  				// TODO: handle exception
  			}
  		}
  		
  		for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
  		}
     }
     
     
// 	@AT_FM_103
 	@And("User_608 validate the Repayment plan No of Payments should be changed in Facilities Management Maintanance under WIFAK Application")
 	public void usre_validate_the_repayment_plan_no_of_payments_should_be_changed_in_facilities_management_maintanance_under_wifak_application()throws Throwable {
 		waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanNoOfPaymentsInput_608());
 		String noOfPayments = facilityManagementObj608.wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanNoOfPaymentsInput_608().getAttribute("prevvalue");
 		Assert.assertEquals(testData.get("No of Payments"), noOfPayments);
 	}
     
 	
//	@AT_FM_105_FMSCore
    @And("User_608 enter the Application Ref number in Maintanance under WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_maintanance_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainApplicationRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainApplicationRefInput_608().sendKeys(testData.get("Reference Code"),Keys.TAB);
    	for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementMainCIFNo_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}   
    }
    
    @And("User_608 validate Journal Voucher Details option should be visible in Maintanance under WIFAK Facilities Management")
    public void user_validate_journal_voucher_details_option_should_be_visible_in_maintanance_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMaintananceJournalVoucherDetailsBtn_608());
    	boolean JVDetailBtn = facilityManagementObj608.wifakFacilitiesManagementMaintananceJournalVoucherDetailsBtn_608().isDisplayed();
    	Assert.assertTrue(JVDetailBtn);
    }
    
    @And("User_608 click the Documents Details tab in Maintanance under WIFAK Facilities Management")
    public void user_click_the_documents_details_tab_in_maintanance_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainDocumentsDetailsTab_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainDocumentsDetailsTab_608().click();
    }

    @And("User_608 enter the row1 Solicitor Date Sent under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row1_solicitor_date_sent_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainDocumentsDetailsFirstRow_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainDocumentsDetailsFirstRow_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSolicitorDateSentRow1_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainSolicitorDateSentRow1_608().sendKeys(testData.get("Solicitor Date Sent"),Keys.ENTER);
    }

    @And("User_608 enter the row1 Solicitor Date Received under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row1_solicitor_date_received_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSolicitorDateReceivedRow1_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainSolicitorDateReceivedRow1_608().sendKeys(testData.get("Solicitor Date Received"),Keys.ENTER);
        
    }

    @And("User_608 enter the row1 Estimator Date Sent under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row1_estimator_date_sent_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainEstimatorDateSentRow1_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainEstimatorDateSentRow1_608().sendKeys(testData.get("Estimator Date Sent"),Keys.ENTER);
        
    }

    @And("User_608 enter the row1 Estimator Date Received under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row1_estimator_date_received_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainEstimatorDateReceivedRow1_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainEstimatorDateReceivedRow1_608().sendKeys(testData.get("Estimator Date Received"),Keys.ENTER);
        
    }

    @And("User_608 enter the row1 Custodian Date Sent under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row1_custodian_date_sent_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainCustodianDateSentRow1_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainCustodianDateSentRow1_608().sendKeys(testData.get("Custodian Date Sent"),Keys.ENTER);
        
    }

    @And("User_608 enter the row2 Solicitor Date Sent under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row2_solicitor_date_sent_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainDocumentsDetailsSecondRow_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainDocumentsDetailsSecondRow_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSolicitorDateSentRow2_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainSolicitorDateSentRow2_608().sendKeys(testData.get("Solicitor Date Sent"),Keys.ENTER);
    	
    }

    @And("User_608 enter the row2 Solicitor Date Received under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row2_solicitor_date_received_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainSolicitorDateReceivedRow2_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainSolicitorDateReceivedRow2_608().sendKeys(testData.get("Solicitor Date Received"),Keys.ENTER);
    }

    @And("User_608 enter the row2 Estimator Date Sent under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row2_estimator_date_sent_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainEstimatorDateSentRow2_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainEstimatorDateSentRow2_608().sendKeys(testData.get("Estimator Date Sent"),Keys.ENTER);
    }

    @And("User_608 enter the row2 Estimator Date Received under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row2_estimator_date_received_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainEstimatorDateReceivedRow2_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainEstimatorDateReceivedRow2_608().sendKeys(testData.get("Estimator Date Received"),Keys.ENTER);
    }

    @And("User_608 enter the row2 Custodian Date Sent under Document Details in Facilities Management Maintanance")
    public void user_enter_the_row2_custodian_date_sent_under_document_details_in_facilities_management_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMainCustodianDateSentRow2_608());
    	facilityManagementObj608.wifakFacilitiesManagementMainCustodianDateSentRow2_608().sendKeys(testData.get("Custodian Date Sent"),Keys.ENTER);
    }

    @When("User_608 click the Save Button under Maintanance under WIFAK Facilities Management")
    public void user_click_the_save_button_under_maintanance_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementMaintananceSaveBtn_608());
    	facilityManagementObj608.wifakFacilitiesManagementMaintananceSaveBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
//    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementSaveMessage_608());
//    	String facilityCode = facilityManagementObj608.wifakFacilitiesManagementSaveMessage_608().getText().substring(11, 15);
//    	fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"), "Facility Code",facilityCode );
//    	System.err.println("Facility Code: "+facilityCode);
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}   
    	
    	// close the send alert pop-up box
    	for (int i = 0; i < 200; i++) {
			try {
				facilityManagementObj608.wifakFacilitiesManagementSendAlertPopup_608().click();
		    	break;
			} catch (Exception e) {

			}
		}        
    }
    
    //Approve menu under WIFAK facilities Management
    @And("User_608 enter the Application Ref number in search grid under Approve screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_approve_screen_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER); 
    }
    
    // Update after Approve menu under WIFAK facilities Management
    @And("User_608 enter the Application Ref number in search grid under Update After Approve in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_update_after_approve_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
     
     
    @And("User_608 enter the facility rating under Facility Application tab in Update After Approve")
    public void user_enter_the_facility_rating_under_facility_application_tab_in_update_after_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveFacilityAppDetailsTabFacilityRatingInput_608());
    	WebElement FacilityRating = facilityManagementObj608.wifakFacilitiesManagementUpdateAfterApproveFacilityAppDetailsTabFacilityRatingInput_608();
    	FacilityRating.clear();
    	FacilityRating.sendKeys(testData.get("New Facility Rating"),Keys.TAB);
    }
     
    // Query menu under WIFAK facilities Management
    @And("User_608 enter the Application Ref number in search grid under Query screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_query_screen_in_wifak_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementQuerySearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementQuerySearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }  
    
    // Suspend menu under WIFAK facilities Management
    @And("User_608 enter the Application Ref number in search grid under Suspend screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_suspend_screen_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementSuspendSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementSuspendSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
    
    @And("User_608 give the Suspend Reason in Suspend screen under WIFAK Facilities Management")
    public void user_give_the_suspend_reason_in_suspend_screen_under_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementSuspendReasonInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementSuspendReasonInput_608().sendKeys(testData.get("Suspend Reason"),Keys.TAB);
    	
    	for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(facilityManagementObj608.wifakFacilitiesManagementSuspendReasonInputLabel_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}        
    }
    
    // Reactivate menu in WIFAK Facilities Management
    @And("User_608 enter the Application Ref number in search grid under Reactivate screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_reactivate_screen_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementReactivateSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementReactivateSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
    
    // Reverse and Approve/Reject Reverse menu in WIFAK Facilities Management
    @And("User_608 enter the Application Ref number in search grid under Reverse screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_reverse_screen_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementReverseSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementReverseSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
    
    @And("User_608 enter the Application Ref number in search grid under Approve\\Reject Reverse screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_approve_reject_reverse_screen_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveReverseSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveReverseSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
    
    
    // Cancel and Approve/Reject Cancel menu in WIFAK Facilities Management
    @And("User_608 enter the Application Ref number in search grid under Cancel screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_cancel_screen_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementCancelSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementCancelSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
    
    @And("User_608 enter the Application Ref number in search grid under Approve\\Reject Cancel screen in WIFAK Facilities Management")
    public void user_enter_the_application_ref_number_in_search_grid_under_approve_reject_cancel_screen_in_wifak_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, facilityManagementObj608.wifakFacilitiesManagementApproveCancelSearchAppRefInput_608());
    	facilityManagementObj608.wifakFacilitiesManagementApproveCancelSearchAppRefInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
    
    
//  @AT_FP_001
    @And("User_608 enter the Floating Rate in limit details")
	public void user_enter_the_floating_rate_in_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsFloatingRate_608());
		applicationFinancialFacilityObj608.limitDetailsFloatingRate_608().sendKeys(testData.get("Floating Rate"),Keys.TAB);
		
		for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsFloatingRateLabel_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 	    
	}

	@And("User_608 enter the Floating Rate Periodicity in limit details")
	public void user_enter_the_floating_rate_periodicity_in_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsFloatingRatePeriodicityInput_608());
		applicationFinancialFacilityObj608.limitDetailsFloatingRatePeriodicityInput_608().sendKeys(testData.get("FR Periodicity"),Keys.TAB);
		for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsFloatingRatePeriodicityInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 	    
	}

	@And("User_608 select the Floating Rate Periodicity type in limit details")
	public void user_select_the_floating_rate_periodicity_type_in_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsFloatingRatePeriodicityType_608());
		dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.limitDetailsFloatingRatePeriodicityType_608(), testData.get("FR Periodicity Type"));
		for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsFloatingRatePeriodicityType_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	    
	}
    
	
	
//	@AT_DDR_020
	@And("User_608 enter the Down Payment percentage in additional info tab")
	public void user_enter_the_down_payment_percentage_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.additionalTabDownPaymentPercentInput_608());
		applicationFinancialFacilityObj608.additionalTabDownPaymentPercentInput_608().sendKeys(testData.get("Down Payment Percent"),Keys.TAB);
		for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.additionalTabDownPaymentPercentInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
		// And User get and update the Down Payment amount in Excel sheet
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.additionalTabDownPaymentAmountInput_608());
		String[] downPayment = javaScriptHelper.executeScript("return document.getElementsByName('applicationFacilityCO.fmsApplVO.DOWN_PAYMENT')[0].value").toString().replace(",", "").split("[.]");
//		System.out.println("DownPayment Amount: "+downPayment[0]);
		fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"), "Down Payment Amount", downPayment[0]);
		
	}

	@And("User_608 enter the Down Payment percentage under product class details tab")
	public void user_enter_the_down_payment_percentage_under_product_class_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.productClassDownPaymentPercentInput_608());
		applicationFinancialFacilityObj608.productClassDownPaymentPercentInput_608().clear();
		applicationFinancialFacilityObj608.productClassDownPaymentPercentInput_608().sendKeys(testData.get("Down Payment Percent"),Keys.TAB);
		for(int i = 0; i <= 1000; i++) {
    		try {
				if(applicationFinancialFacilityObj608.productClassDownPaymentPercentInput_608().getAttribute("prevvalue").equals(testData.get("Down Payment Percent"))) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}		
	}
	
	@And("User_608 validate the Down Payment should be correctly in WIFAK Facilities Management Maintanance")
	public void user_validate_the_down_payment_should_be_correctly_in_wifak_facilities_management_maintanance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementMainDownPaymentAmountInput_608());
		String facilitiesDownPayment = applicationFinancialFacilityObj608.wifakFacilitiesManagementMainDownPaymentAmountInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("Down Payment Amount"), facilitiesDownPayment);
	}

	@And("User_608 validate the Down Payment percentage should be correctly in WIFAK Facilities Management Maintanance")
	public void user_validate_the_down_payment_percentage_should_be_correctly_in_wifak_facilities_management_maintanance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementMainDownPaymentPercentInput_608());
		String facilitiesDownPaymentPercent = applicationFinancialFacilityObj608.wifakFacilitiesManagementMainDownPaymentPercentInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("Down Payment Percent"), facilitiesDownPaymentPercent);
	}
	
	@And("User_608 double click the limit details product class row in Facilities Management Maintanance under WIFAK Application")
	public void user_double_click_the_limit_details_product_class_row_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementFacilityLimitDetailsProductClassRow_608());
	    clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakFacilitiesManagementFacilityLimitDetailsProductClassRow_608());
	}

	@And("User_608 validate the limit details product class Down Payment should be correctly in WIFAK Facilities Management Maintanance")
	public void user_validate_the_limit_details_product_class_down_payment_should_be_correctly_in_wifak_facilities_management_maintanance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsDownPaymentAmountInput_608());
		String downPayment = applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsDownPaymentAmountInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("Down Payment Amount"), downPayment);
	}

	@And("User_608 validate the limit details product class Down Payment percentage should be correctly in WIFAK Facilities Management Maintanance")
	public void user_validate_the_limit_details_product_class_down_payment_percentage_should_be_correctly_in_wifak_facilities_management_maintanance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsDownPaymentPercentInput_608());
		String downPaymentPercent = applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsDownPaymentPercentInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("Down Payment Percent"), downPaymentPercent);
	    
	}

	
//	@AT_DDR_022
	@And("User_608 Retrieve the Application Code value in Facilities Management Maintanance Screen under WIFAK Application")
	public void user_retrieve_the_application_code_value_in_facilities_management_maintanance_screen_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementMainCodeInput_608());
		String applicationCode = applicationFinancialFacilityObj608.wifakFacilitiesManagementMainCodeInput_608().getAttribute("prevvalue");
		fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"),"Facility Ref", applicationCode);
	}

	@And("User_608 validate the limit details Floating Rate should be correctlty in WIFAK Facilities Management Maintanance")
	public void user_validate_the_limit_details_floating_rate_should_be_correctlty_in_wifak_facilities_management_maintanance() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsFloatingRateInput_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsFloatingRateInput_608());
		String floatingRate = applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsFloatingRateInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("Floating Rate"), floatingRate);
	}

	@And("User_608 validate the limit details Floating Rate Periodicity number should be correctlty in WIFAK Facilities Management Maintanance")
	public void user_validate_the_limit_details_floating_rate_periodicity_number_should_be_correctlty_in_wifak_facilities_management_maintanance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsFloatingRatePeriodicityInput_608());
		String floatingPeridicity = applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsFloatingRatePeriodicityInput_608().getAttribute("prevvalue");
		Assert.assertEquals(testData.get("FR Periodicity"), floatingPeridicity);	    
	}

	@And("User_608 validate the limit details Floating Rate Periodicity type should be correctlty in WIFAK Facilities Management Maintanance")
	public void user_validate_the_limit_details_floating_rate_periodicity_type_should_be_correctlty_in_wifak_facilities_management_maintanance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsFloatingRatePeriodicityTypeDropdown_608());
		boolean floatingPeridicityType = applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsFloatingRatePeriodicityTypeDropdown_608().isDisplayed();
		Assert.assertTrue(floatingPeridicityType);
	}

	@And("User_608 click the Close button in limit details tab under WIFAK Facilities Management Maintanance")
	public void user_click_the_close_button_in_limit_details_tab_under_wifak_facilities_management_maintanance() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsCloseBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsCloseBtn_608());
		applicationFinancialFacilityObj608.wifakFacilitiesManagementLimitDetailsCloseBtn_608().click();
	}

	 @And("^User_608 clicks on the Draw Down request feature under WIFAK Application$")
	    public void user_clicks_on_the_draw_down_request_feature_under_WIFAK_Application() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApplicationDrawDownRequest_608());
	    	requestForFinancingObj608.wifakApplicationDrawDownRequest_608().click();
	    }

	    @And("^User_608 clicks on the Maintanance under Draw Down request feature in WIFAK Application$")
	    public void user_clicks_on_the_maintanance_under_draw_down_request_feature_in_WIFAK_Application() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawDownRequestMaintanance_608());
	    	requestForFinancingObj608.drawDownRequestMaintanance_608().click();        
	    }

	    @And("^User_608 enter the Facility Reference in main screen under WIFAK Application Draw Down request$")
	    public void user_enter_the_facility_reference_in_main_screen_under_WIFAK_application_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainFacilityRef_608());
	    	requestForFinancingObj608.drawdownMainFacilityRef_608().sendKeys(testData.get("Facility Ref"),Keys.TAB);	    	
	    	for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(requestForFinancingObj608.drawdownMainDateSubmitted_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}

	    }

	    @And("^User_608 select the draw down type in main screen under Draw Down request feature$")
	    public void user_select_the_draw_down_type_in_main_screen_under_draw_down_request_feature() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainDrawDownTypeLookup_608());
	    	requestForFinancingObj608.drawdownMainDrawDownTypeLookup_608().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainDrawdownTypeValue_608());
	    	clicksAndActionsHelper.doubleClick(requestForFinancingObj608.drawdownMainDrawdownTypeValue_608());
	    }

	    @And("^User_608 enter the Description in main screen under Draw Down request feature$")
	    public void user_enter_the_description_in_main_screen_under_draw_down_request_feature() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainDescription_608());
	    	requestForFinancingObj608.drawdownMainDescription_608().sendKeys(testData.get("Description"));
	    }
	    
	    @And("^User_608 enter the value date in maintanance screen under WIFAK Application Draw Down request$")
	    public void user_enter_the_value_date_in_maintanance_screen_under_WIFAK_application_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainValueDate_608());
	    	requestForFinancingObj608.drawdownMainValueDate_608().sendKeys(testData.get("Value Date"),Keys.TAB);
	    }
	    
	    @And("User_608 click on the Additional details tab in Draw Down request under WIFAK Application")
	    public void user_click_on_the_additional_details_tab_in_draw_down_request_under_WIFAK_application() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownAdditionalDetailsTab_608());
	    	requestForFinancingObj608.drawdownAdditionalDetailsTab_608().click();
	    }

	    @And("^User_608 select the product class in Additional details tab under Draw Down request$")
	    public void user_select_the_product_class_in_additional_details_tab_under_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownAdditionalProductClassLookup_608());
	    	requestForFinancingObj608.drawdownAdditionalProductClassLookup_608().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownAdditionalProductClassCode_608());
	    	clicksAndActionsHelper.doubleClick(requestForFinancingObj608.drawdownAdditionalProductClassCode_608());
	    	
	    	for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(requestForFinancingObj608.drawdownAdditionalProductClass_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    }

	    @And("User_608 validate the Floating Rate displayed correctly in Additional details tab under Draw Down request")
	    public void user_validate_the_floating_rate_displayed_correctly_in_additional_details_tab_under_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestAdditionaltDetailsFloatingRate_608());
	    	String floatingRate = applicationFinancialFacilityObj608.wifakDrawDownRequestAdditionaltDetailsFloatingRate_608().getAttribute("prevvalue");
	        assertEquals(testData.get("Floating Rate"), floatingRate);
	    }

	    @And("User_608 validate the Floating Rate Periodicity displayed correctly in Additional details tab under Draw Down request")
	    public void user_validate_the_floating_rate_periodicity_displayed_correctly_in_additional_details_tab_under_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestAdditionaltDetailsFloatingRatePeriodicity_608());
	    	String floatingRatePeriodicity = applicationFinancialFacilityObj608.wifakDrawDownRequestAdditionaltDetailsFloatingRatePeriodicity_608().getAttribute("prevvalue");
	        assertEquals(testData.get("FR Periodicity"), floatingRatePeriodicity);
	    }
	    
	    
//	    @AT_DDR_023
	    @When("User_608 click the Save button in maintanance under Draw Down request")
	    public void user_click_the_save_button_in_maintanance_under_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainSaveBtn_608());
	    	requestForFinancingObj608.drawdownMainSaveBtn_608().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
	    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.drawdownMainSuccessPopupMsg_608());
	    	String DDCode = requestForFinancingObj608.drawdownMainSuccessPopupMsg_608().getText().substring(11, 15);
	    	System.err.println("Drawdown Code: "+DDCode);
	    	
	    	fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"),"DD Code", DDCode);
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
			    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}   
	    	
	    	// close the send alert pop-up box
	    	for (int i = 0; i < 200; i++) {
				try {
					requestForFinancingObj608.drawdownMainSendAlertPopupClose_608().click();
			    	break;
				} catch (Exception e) {

				}
			}
	    }

	    @Then("User_608 click on the Verify\\Deny Menu under WIFAK Draw Down request")
	    public void user_click_on_the_verify_deny_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenu_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenu_608().click();
	    }

	    @And("User_608 enter the DD code in Verify\\Deny search grid under WIFAK Draw down request")
	    public void user_enter_the_dd_code_in_verify_deny_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenuSearchgridCodeInput_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenuSearchgridCodeInput_608().sendKeys(testData.get("DD Code"),Keys.ENTER);
	    }

	    @And("User_608 double click the DD code in Verify\\Deny search grid under WIFAK Draw down request")
	    public void user_double_click_the_dd_code_in_verify_deny_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenuSearchgridCodeRow1_608());
	    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenuSearchgridCodeRow1_608());
	    	for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenuCodeInput_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}	    	
	    }

	    @And("User_608 click the Verify button in Verify\\Deny under WIFAK Draw down request")
	    public void user_click_the_verify_button_in_verify_deny_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenuVerifyBtn_608());  
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenuVerifyBtn_608().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
	    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
			    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}   
	    	
	    	// close the send alert pop-up box
	    	for (int i = 0; i < 200; i++) {
				try {
					applicationFinancialFacilityObj608.wifakDrawDownRequestVerifyMenuSendAlertDismissBtn_608().click();
			    	break;
				} catch (Exception e) {

				}
			}
	    }
	    
	    @Then("User_608 click the Approve\\Reject menu under WIFAK Draw Down request")
	    public void user_click_the_approve_reject_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectMenu_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectMenu_608().click();
	    }

	    @And("User_608 enter the DD code in Approve\\Reject search grid under WIFAK Draw down request")
	    public void user_enter_the_dd_code_in_approve_reject_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectSearchgridCodeInput_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectSearchgridCodeInput_608().sendKeys(testData.get("DD Code"),Keys.ENTER);
	    }

	    @And("User_608 double click the DD code in Approve\\Reject search grid under WIFAK Draw down request")
	    public void user_double_click_the_dd_code_in_approve_reject_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectSearchgridCodeRow1_608());
	        clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectSearchgridCodeRow1_608());
	        for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectCodeInput_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    }

	    @When("User_608 click the Approve button in Approve\\Reject under WIFAK Draw down request")
	    public void user_click_the_approve_button_in_approve_reject_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectApproveBtn_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectApproveBtn_608().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
	    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
			    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}	    	
	    }   	
	    
	    
//	    @AT_DDR_024
	    @And("User_608 click the Clear button in Facilities Management Maintanance under WIFAK Application")
	    public void user_click_the_clear_button_in_facilities_management_maintanance_under_wifak_application() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakFacilitiesManagementMaintananceClearBtn_608());
	    	applicationFinancialFacilityObj608.wifakFacilitiesManagementMaintananceClearBtn_608().click();
	    }
	    
	    @Then("User_608 click the Query Menu under WIFAK Draw Down request")
	    public void user_click_the_query_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenu_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenu_608().click();
	    }

	    @And("User_608 enter the DD code in Query search grid under WIFAK Draw down request")
	    public void user_enter_the_dd_code_in_query_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenuSearchgridCodeInput_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenuSearchgridCodeInput_608().sendKeys(testData.get("DD Code"),Keys.ENTER);
	    }

	    @And("User_608 double click the DD code in Query search grid under WIFAK Draw down request")
	    public void user_double_click_the_dd_code_in_query_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenuSearchgridCodeRow1_608());
	        clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenuSearchgridCodeRow1_608());
	        for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenuCodeInput_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    }

	    @And("User_608 click the Additional Details tab in Query Menu under WIFAK Draw Down request")
	    public void user_click_the_additional_details_tab_in_query_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenuAdditionalDetailsTab_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestQueryMenuAdditionalDetailsTab_608().click();
	    }
	    
	    
	    @Then("User_608 click the List Menu under WIFAK Draw Down request")
	    public void user_click_the_list_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestListMenu_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestListMenu_608().click();
	    }

	    @And("User_608 enter From code in List menu under WIFAK Draw down request")
	    public void user_enter_from_code_in_list_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestListMenuFromCodeInput_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestListMenuFromCodeInput_608().sendKeys(testData.get("From Code"),Keys.TAB);
	    }

	    @And("User_608 enter To code in List menu under WIFAK Draw down request")
	    public void user_enter_to_code_in_list_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestListMenuToCodeInput_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestListMenuToCodeInput_608().sendKeys(testData.get("To Code"),Keys.TAB);
	    	for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(applicationFinancialFacilityObj608.wifakDrawDownRequestListMenuToCodeInput_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    	
	    }

	    @And("User_608 click the Retrieve button in List menu under WIFAK Draw down request")
	    public void user_click_the_retrieve_button_in_list_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestListMenurRetrieveBtn_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestListMenurRetrieveBtn_608().click();
	    }

	    
	    @Then("User_608 click the Reverse menu under WIFAK Draw Down request")
	    public void user_click_the_reverse_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenu_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenu_608().click();
	    }

	    @And("User_608 enter the DD code in Reverse menu search grid under WIFAK Draw down request")
	    public void user_enter_the_dd_code_in_reverse_menu_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenuSearchgridCodeInput_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenuSearchgridCodeInput_608().sendKeys(testData.get("DD Code"),Keys.ENTER);
	    }

	    @And("User_608 double click the DD code in Reverse menu search grid under WIFAK Draw down request")
	    public void user_double_click_the_dd_code_in_reverse_menu_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenuSearchgridCodeRow1_608());
	    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenuSearchgridCodeRow1_608());
	    	for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenuCodeInput_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}	    	
	    }

	    @When("User_608 click the Reverse button in Reverse menu under WIFAK Draw down request")
	    public void user_click_the_reverse_button_in_reverse_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenuReverseBtn_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestReverseMenuReverseBtn_608().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
	    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
			    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	    
	    
	    @Then("User_608 click the Approve\\Reject Reverse menu under WIFAK Draw Down request")
	    public void user_click_the_approve_reject_reverse_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseMenu_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseMenu_608().click();
	    }

	    @And("User_608 enter the DD code in Approve\\Reject Reverse menu search grid under WIFAK Draw down request")
	    public void user_enter_the_dd_code_in_approve_reject_reverse_menu_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseMenuSearchgridCodeInput_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseMenuSearchgridCodeInput_608().sendKeys(testData.get("DD Code"),Keys.ENTER);
	    }

	    @And("User_608 double click the DD code in Approve\\Reject Reverse menu search grid under WIFAK Draw down request")
	    public void user_double_click_the_dd_code_in_approve_reject_reverse_menu_search_grid_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseMenuSearchgridCodeRow1_608());
	    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseMenuSearchgridCodeRow1_608());
	    	for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseMenuCodeInput_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    }

	    @When("User_608 click the Approve Reverse button in Approve\\Reject Reverse menu under WIFAK Draw down request")
	    public void user_click_the_approve_reverse_button_in_approve_reject_reverse_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseApproveReverseBtn_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestApproveOrRejectReverseApproveReverseBtn_608().click();
	        
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
	    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
			    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	    
	    
	    @Then("User_608 click the Update After Approve menu under WIFAK Draw Down request")
	    public void user_click_the_update_after_approve_menu_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenu_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenu_608().click();
	    }

	    @And("User_608 click the clear button in Update After Approve under WIFAK Draw Down request")
	    public void user_click_the_clear_button_in_update_after_approve_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveClearBtn_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveClearBtn_608().click();
	    }

	    @And("User_608 double click the any one record in Update After Approve under WIFAK Draw Down request")
	    public void user_double_click_the_any_one_record_in_update_after_approve_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenuSearchgridCodeRow1_608());
	        clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenuSearchgridCodeRow1_608());
	        for(int i = 0; i <= 500; i++) {
	    		try {
					if(!(applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenuCodeInput_608().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    }

	    @And("User_608 click the Additional Details tab in Update After Approve under WIFAK Draw Down request")
	    public void user_click_the_additional_details_tab_in_update_after_approve_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenuAdditionalDetailsTab_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenuAdditionalDetailsTab_608().click();
	    }
	    
	    @And("User_608 edit the FC Amount in Additional Details tab under Update After Approve in WIFAK Draw Down request")
	    public void user_edit_the_fc_amount_in_additional_details_tab_under_update_after_approve_in_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveAdditionalDetailsTabFCAmtInput_608());
	    	WebElement FCAmtInput_608 = applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveAdditionalDetailsTabFCAmtInput_608();
	    	FCAmtInput_608.sendKeys(testData.get("FC Amount"),Keys.TAB);
	    	for(int i = 0; i <= 500; i++) {
	    		try {
					if(FCAmtInput_608.getAttribute("prevvalue").equals(testData.get("FC Amount"))) {
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    }

	    @When("User_608 click the Save button in Update After Approve under WIFAK Draw Down request")
	    public void user_click_the_save_button_in_update_after_approve_under_wifak_draw_down_request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenuSaveBtn_608());
	    	applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveMenuSaveBtn_608().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
	    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
				try {
			    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
			    	break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}	    	
	    	// close the send alert pop-up box
	    	for (int i = 0; i < 200; i++) {
				try {
			    	applicationFinancialFacilityObj608.wifakDrawDownRequestUpdateAfterApproveSendAlertDismissBtn_608().click();
			    	break;
				} catch (Exception e) {
					
				}
			}	        
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    

//  @AT_RF_034_FMSCore
	@And("^User_608 search the code in issue facility offer$")
    public void user_search_the_code_in_issue_facility_offer() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.issueFacilityOfferSearchCode_608());  	
//    	requestForFinancingObj608.issueFacilityOfferSearchCode_608().sendKeys(refID);
    	requestForFinancingObj608.issueFacilityOfferSearchCode_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
	
//  @AT_RF_040
    @And("^User_608 enter the down payment percentage in additional info under main screen$")
    public void user_enter_the_down_payment_percentage_in_additional_info_under_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.additionalTabDownPayPercent_608());
    	requestForFinancingObj608.additionalTabDownPayPercent_608().sendKeys(testData.get("Down Payment %"));
    	requestForFinancingObj608.additionalTabDownPayPercent_608().sendKeys(Keys.TAB);
    }

    @And("^User_608 enter the down payment to vendor percentage in additional info tab$")
    public void user_enter_the_down_payment_to_vendor_percentage_in_additional_info_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.additionalTabDownPayToVendor_608());
    	requestForFinancingObj608.additionalTabDownPayToVendor_608().sendKeys(testData.get("Down Payment to Vendor %"));
    	requestForFinancingObj608.additionalTabDownPayToVendor_608().sendKeys(Keys.TAB);
    }
	
    
//  @AT_RF_100
    @And("^User_608 select the application for dropdown as decrease in main screen$")
    public void user_select_the_application_for_dropdown_as_decrease_in_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainApplicationForDropdown_608());
		dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.mainApplicationForDropdown_608(), testData.get("Application For"));
    }

    @And("^User_608 enter the input as Existing Facility Ref in main screen$")
    public void user_enter_the_input_as_existing_facility_ref_in_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainExistingFacilityRef_608());
//    	applicationFinancialFacilityObj608.mainExistingFacilityRef_608().sendKeys(testData.get("Facility Ref"),Keys.TAB);
    	applicationFinancialFacilityObj608.mainExistingFacilityRef_608().sendKeys("1539",Keys.TAB);	
    	for(int i = 0; i <= 300; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.mainExistingFacilityRef_608().getAttribute("readonly").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    	

    }
    
    @And("^User_608 enter the total value under additional info tab$")
    public void user_enter_the_total_value_under_additional_info_tab() throws Throwable {    	
    	// First We get the Finance amount without total amount
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.additionalTabFinanceAmount_608());
    	String beforeFinanceAmount = applicationFinancialFacilityObj608.additionalTabFinanceAmount_608().getAttribute("prevvalue");
//    	System.out.println("Before Finance Amount: "+ beforeFinanceAmount);
    	fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"), "Finance Amount", beforeFinanceAmount);
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.mainAdditionalTabTotalValue_608());
		applicationFinancialFacilityObj608.mainAdditionalTabTotalValue_608().sendKeys(testData.get("Total value"),Keys.TAB);
		
		for(int i = 0; i <= 300; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.mainAdditionalTabTotalValue_608().getAttribute("readonly").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
    }

    @And("^User_608 validate the finance amount should be decresed based on total value$")
    public void user_validate_the_finance_amount_should_be_decresed_based_on_total_value() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata(testData.get("DataSet ID"));
    	String financeAmount = testData.get("Finance Amount");
    	String totalValue = testData.get("Total value");
    	
    	String afterFinanceAmount = applicationFinancialFacilityObj608.additionalTabFinanceAmount_608().getAttribute("prevvalue");
    	String[] splitFinaceAmount  = afterFinanceAmount.split("[.]");
    	String finalFinaceAmount = splitFinaceAmount[0].replace(",", "");
//    	System.out.println("Finance Amount: "+finalFinaceAmount);
//    	System.out.println("After Finance Amount: "+afterFinanceAmount);
    	
    	int cvValue = Integer.parseInt(financeAmount)-Integer.parseInt(totalValue);
    	String cvValueText = String.valueOf(cvValue);
    	fmsTransactionsExcelData.updateTestData(testData.get("DataSet ID"), "CV Value", cvValueText);
    	
    	Assert.assertEquals(cvValueText, finalFinaceAmount);
    	
    }

    @And("^User_608 validate the Facility value and CV value should be changed same as decreased finance amount under limit details$")
    public void user_validate_the_facility_value_and_cv_value_should_be_changed_same_as_decreased_finance_amount_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsProductFacilityValue_608());
    	String facilityValue = applicationFinancialFacilityObj608.limitDetailsProductFacilityValue_608().getAttribute("title");
    	String[] splitFacilityValue  = facilityValue.split("[.]");
    	String finalFacilityValue = splitFacilityValue[0].replace(",", "");
    	
//    	testData = fmsTransactionsExcelData.getTestdata("DataSet ID");
    	Assert.assertEquals(testData.get("CV Value"), finalFacilityValue);
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsProductCVValue_608());
    	String CVValue = applicationFinancialFacilityObj608.limitDetailsProductCVValue_608().getAttribute("title");
    	String[] splitCVValue  = CVValue.split("[.]");
    	String finalCVValue = splitCVValue[0].replace(",", "");
    	
    	Assert.assertEquals(testData.get("CV Value"), finalCVValue);
    	
    }

    @And("^User_608 double click on the product class under limit details$")
    public void user_double_click_on_the_product_class_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsProductFacilityValue_608());
    	clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.limitDetailsProductFacilityValue_608());
    }
    
    @And("^User_608 click the clean flag under product calss in limit details tab$")
    public void user_click_the_clean_flag_under_product_calss_in_limit_details_tab() throws Throwable {
    	// check the clean flag
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsNewRecordCleanFlag_608());
        WebElement cleanFlag = applicationFinancialFacilityObj608.limitDetailsNewRecordCleanFlag_608();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
    }
    
    @And("^User_608 click the edit button under product class in limit details tab$")
    public void user_click_the_edit_button_under_product_class_in_limit_details_tab() throws Throwable {
    	
    	for (int i = 0; i <= 300; i++) {
        	try {
        		javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.limitDetailsProductEditBtn_608());
    				break;
    			} catch (Exception e) {
    				if (i == 300) {
    					Assert.fail(e.getMessage());
    				}
    			}
    	}
        waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsProductEditBtn_608());
        applicationFinancialFacilityObj608.limitDetailsProductEditBtn_608().click();
    }
    
    
//  @AT_RF_101_FMSParam
    @And("User_608 enter the code in search grid under update after approve menu in Document checklist")
	public void user_enter_the_code_in_search_grid_under_update_after_approve_menu_in_document_checklist() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.documentChecklistSearchgridCode_608());
		fmsParamObj608.documentChecklistSearchgridCode_608().sendKeys(testData.get("Document Code"),Keys.ENTER);
	}
    
//  @AT_RF_101_FMSCore
    @And("^User_608 clicks on the document checklist button under limit details$")
    public void user_clicks_on_the_document_checklist_button_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistBtn_608().click();
    }

    @And("^User_608 clicks on the add new button under document checklist$")
    public void user_clicks_on_the_add_new_button_under_document_checklist() throws Throwable {
    	// delete the second row 
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsdocumentChecklistSecondRow_608());
    	applicationFinancialFacilityObj608.limitDetailsdocumentChecklistSecondRow_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistDeleteBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistDeleteBtn_608().click();    	
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistAddBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistAddBtn_608().click();    	
    }

    @And("^User_608 give the Document Code under document checklist$")
    public void user_give_the_document_code_under_document_checklist() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsdocumentChecklistSecondRow_608());
    	applicationFinancialFacilityObj608.limitDetailsdocumentChecklistSecondRow_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistDocumentCodeInput_608());
//    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistDocumentCodeInput_608().sendKeys("3455");
    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistDocumentCodeInput_608().sendKeys(testData.get("Document Code"));
    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistDocumentCodeInput_608().sendKeys(Keys.TAB);
    	
    }

    @And("^User_608 give the Line No under document checklist$")
    public void user_give_the_line_no_under_document_checklist() throws Throwable {    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistLineNoInput_608());
    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistLineNoInput_608().sendKeys(testData.get("Line No"));
    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistLineNoInput_608().sendKeys(Keys.TAB); 
    	for(int i = 0; i <= 300; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsDocumentChecklistLineNoInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User_608 click the Ok button under document checklist$")
    public void user_click_the_ok_button_under_document_checklist() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistOkBtn_608());
    	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistOkBtn_608().click();
    }
    
    
    
//    @AT_FM_038_FMSCore
    @And("User_608 clicks on the Approval committe recommedations menu")
    public void user_clicks_on_the_approval_committe_recommedations_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApprovalCommitteeRecommendationsMenu_608());
    	requestForFinancingObj608.wifakApprovalCommitteeRecommendationsMenu_608().click();
    }

    @And("User_608 enter the Facility type in search grid under Approval committe recommedations")
    public void user_enter_the_facility_type_in_search_grid_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakApprovalCommitteeRecommendationsFacilityTypeInput_608());
    	applicationFinancialFacilityObj608.wifakApprovalCommitteeRecommendationsFacilityTypeInput_608().sendKeys(testData.get("Facility Type"),Keys.ENTER);
    }

    @And("User_608 double the first row in search grid under Approval committe recommedations")
    public void user_double_the_first_row_in_search_grid_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakApprovalCommitteeRecommendationsRetrievedFirstRow_608());
        clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakApprovalCommitteeRecommendationsRetrievedFirstRow_608());
        for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.wifakApprovalCommitteeRecommendationsCodeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Recommend button under Approval committe recommedations")
    public void user_click_the_recommend_button_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApprovalCommitteeRecommendationsCode());
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(requestForFinancingObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608());
    	requestForFinancingObj608.wifakApprovalCommitteeRecommendationsRecommendBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, fmsParamObj608.confirmPopupOkBtn_608());
    	fmsParamObj608.confirmPopupOkBtn_608().click();
    }
    
    @And("User_608 click the User recommended by name in approval committee user popup under Approval committe recommedations")
    public void user_click_the_user_recommended_by_name_in_approval_committee_user_popup_under_approval_committe_recommedations() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.approvalCommitteeRecommendByLabel_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approvalCommitteeRecommendByLabel_608());
    	applicationFinancialFacilityObj608.approvalCommitteeRecommendByLabel_608().click();
    }

    @And("User_608 select the recommendation as approve in approval committee user popup under Approval committe recommedations")
    public void user_select_the_recommendation_as_approve_in_approval_committee_user_popup_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApprovalCommitteeRecommendationDropdown_608());
    	dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.wifakApprovalCommitteeRecommendationDropdown_608(), testData.get("Decision3"));
    }
    
    @And("User_608 click the OK button in approval committee user popup under Approval committe recommedations")
    public void user_click_the_ok_button_in_approval_committee_user_popup_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApprovalCommitteeRecommendationsUserPopupOkBtn_608());
    	requestForFinancingObj608.wifakApprovalCommitteeRecommendationsUserPopupOkBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.successPopup_608());    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    
    
    
    
//  @AT_RF_102
    @And("^User_608 select the Item in limit Details$")
    public void user_select_the_item_in_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsItem_608());
//    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.limitDetailsItem(), "Import L/C");
    	dropDownHelper.SelectUsingVisibleText(applicationFinancialFacilityObj608.limitDetailsItem_608(), testData.get("Limit Details Item"));
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.limitDetailsNewRecordProductClass_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User_608 select the Maturity date in limit Details$")
    public void user_select_the_maturity_date_in_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsMaturityDateCalender_608());
    	applicationFinancialFacilityObj608.limitDetailsMaturityDateCalender_608().click();
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsItem_608());
    	applicationFinancialFacilityObj608.limitDetailsMaturityDate_608().click();
    	
    	// check the Clean flag
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsNewRecordCleanFlag_608());
        WebElement cleanFlag = applicationFinancialFacilityObj608.limitDetailsNewRecordCleanFlag_608();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
    }

    @And("^User_608 enter the Margin rate in limit Details$")
    public void user_enter_the_margin_rate_in_limit_details() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
        	try {
        		javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.limitDetailsMarginRateInput_608());
    				break;
    			} catch (Exception e) {
    				if (i == 300) {
    					Assert.fail(e.getMessage());
    				}
    			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsMarginRateInput_608());
//    	applicationFinancialFacilityObj608.limitDetailsMarginRateInput().sendKeys("2");
    	applicationFinancialFacilityObj608.limitDetailsMarginRateInput_608().sendKeys(testData.get("Margin Rate"));
    	applicationFinancialFacilityObj608.limitDetailsMarginRateInput_608().sendKeys(Keys.TAB);
        
    }
    
    
//  @AT_RF_139
  @And("User_608 clicks the all critical checkboxes in document checklist")
  public void user_clicks_the_all_critical_checkboxes_in_document_checklist() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistCriticalCheck_608());  	
  	List<WebElement> checkboxes = driver.findElements(By.xpath("//td[@tdlabel='Critical']//input"));  
  	for (int i = 0; i < checkboxes.size(); i++) {
  		checkboxes.get(i).click();
	}  	
  }
  
  @And("User_608 clicks the limit details tab under approve level1")
  public void user_clicks_the_limit_details_tab_under_approve_level1() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1LimitDetailsTab_608());
  	applicationFinancialFacilityObj608.approveLevel1LimitDetailsTab_608().click();  	
  }
     

  @And("User_608 select the product class in limit details under approve level1")
  public void user_select_the_product_class_in_limit_details_under_approve_level1() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1LimitDetailsProductRow_608());
  	applicationFinancialFacilityObj608.approveLevel1LimitDetailsProductRow_608().click();
  }

  @And("User_608 click the document checklist button under limit details in approve level1")
  public void user_click_the_document_checklist_button_under_limit_details_in_approve_level1() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1LimitDetailsDocChecklistBtn_608());
  	applicationFinancialFacilityObj608.approveLevel1LimitDetailsDocChecklistBtn_608().click();
  }

  @And("User_608 click the ok button in document checklist under limit details")
  public void user_click_the_ok_button_in_document_checklist_under_limit_details() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approveLevel1LimitDetailsDocChecklistRow_608());
  	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistOkBtn_608().click();
  }
    
  
//@AT_RF_140
  @And("User_608 select the second row in document checklist tab")
  public void user_select_the_second_row_in_document_checklist_tab() {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistRow2_608());
  	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistRow2_608().click();
  }

  @And("User_608 give the file in choose file input under document checklist tab")
  public void user_give_the_file_in_choose_file_input_under_document_checklist_tab() {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistChooseFileInput_608());
//  	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistChooseFileInput().sendKeys("C:\\Users\\inindc00608\\Desktop\\FMSTest.txt");
  	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistChooseFileInput_608().sendKeys(testData.get("File Location"));
  }

  @And("User_608 click the Upload docs button under document checklist tab")
  public void user_click_the_upload_docs_button_under_document_checklist_tab() {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistUploadDocsBtn_608());
  	applicationFinancialFacilityObj608.limitDetailsDocumentChecklistUploadDocsBtn_608().click();
  	
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.SuccessPopupOkBtn_608());
  	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
  }

  @And("User_608 validate the Attachment flag is checked in second row under document checklist tab")
  public void user_validate_the_attachment_flag_is_checked_in_second_row_under_document_checklist_tab() {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.limitDetailsDocumentChecklistAttachFlag_608());
  	boolean flagSelected = applicationFinancialFacilityObj608.limitDetailsDocumentChecklistAttachFlag_608().isSelected();
  	Assert.assertEquals(true, flagSelected);
  }

  
  @And("User_608 click the second row of checklist under limit details in approve level1")
  public void user_click_the_second_row_of_checklist_under_limit_details_in_approve_level1() {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approve1LimitDetailsDocumentChecklistRow2_608());
  	applicationFinancialFacilityObj608.approve1LimitDetailsDocumentChecklistRow2_608().click();
  }

  @And("User_608 click the View button in checklist under limit details in approve level1")
  public void user_click_the_view_button_in_checklist_under_limit_details_in_approve_level1() {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approve1LimitDetailsDocumentChecklistViewBtn_608());
  	applicationFinancialFacilityObj608.approve1LimitDetailsDocumentChecklistViewBtn_608().click();
  }

  @And("User_608 vaidate the rows are available in View tab under document checklist")
  public void user_vaidate_the_rows_are_available_in_view_tab_under_document_checklist() {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approve1LimitDetailsDocumentChecklistViewRow1_608());
  	boolean rowDisplayed = applicationFinancialFacilityObj608.approve1LimitDetailsDocumentChecklistViewRow1_608().isDisplayed();
  	System.out.println("Row are available: "+rowDisplayed);
  }

  @And("User_608 close the View tab in document checklist under approve level1 limit details")
  public void user_close_the_view_tab_in_document_checklist_under_approve_level1_limit_details() {
  	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.approve1LimitDetailsDocumentChecklistViewClose_608());
  	applicationFinancialFacilityObj608.approve1LimitDetailsDocumentChecklistViewClose_608().click();
  }
  
    
    
//  @AT_CA_008_Core
    @And("User_608 enter the reference code in search grid under Approval committe recommedations")
    public void user_enter_the_reference_code_in_search_grid_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakApprovalCommitteeRecommendationsSearchgridCodeInput_608());
    	applicationFinancialFacilityObj608.wifakApprovalCommitteeRecommendationsSearchgridCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }
    
    @And("User_608 select the recommendation as Reject in approval committee user popup under Approval committe recommedations")
    public void user_select_the_recommendation_as_reject_in_approval_committee_user_popup_under_approval_committe_recommedations() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, requestForFinancingObj608.wifakApprovalCommitteeRecommendationDropdown_608());
    	dropDownHelper.SelectUsingVisibleText(requestForFinancingObj608.wifakApprovalCommitteeRecommendationDropdown_608(), testData.get("Committee Recommendation"));
    }
	
    @Then("User_608 click the Reopen Rejected Applications menu under WIFAK Application")
    public void user_click_the_reopen_rejected_applications_menu_under_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedApplicationsMenu_608());
    	applicationFinancialFacilityObj608.wifakReopenRejectedApplicationsMenu_608().click();
    }

    @And("User_608 click the maintanance in Reopen Rejected Applications menu under WIFAK Application")
    public void user_click_the_maintanance_in_reopen_rejected_applications_menu_under_wifak_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedMenuMaintanance_608());
    	applicationFinancialFacilityObj608.wifakReopenRejectedMenuMaintanance_608().click();
    }

    @And("User_608 enter the reference code in searchgrid under WIFAK Reopen Rejected Applications maintanance")
    public void user_enter_the_reference_code_in_searchgrid_under_wifak_reopen_rejected_applications_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedMaintananceSearchgridCodeInput_608());
    	applicationFinancialFacilityObj608.wifakReopenRejectedMaintananceSearchgridCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }

    @And("User_608 double click the first row in searchgrid under WIFAK Reopen Rejected Applications maintanance")
    public void user_double_click_the_first_row_in_searchgrid_under_wifak_reopen_rejected_applications_maintanance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedMaintananceSearchgridFirstRowCode_608());
        clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakReopenRejectedMaintananceSearchgridFirstRowCode_608());
        for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.wifakReopenRejectedMaintananceCodeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Reopen button in WIFAK Reopen Rejected Applications maintanance")
    public void user_click_the_reopen_button_in_wifak_reopen_rejected_applications_maintanance() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
        	try {
        		javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.wifakReopenRejectedMaintananceReopenBtn_608());
    				break;
    			} catch (Exception e) {
    				if (i == 300) {
    					Assert.fail(e.getMessage());
    				}
    			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedMaintananceReopenBtn_608());
    	applicationFinancialFacilityObj608.wifakReopenRejectedMaintananceReopenBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}   	 
    }
    
    
    @Then("User_608 click the Approve\\Reject menu in Reopen Rejected Applications under WIFAK Application")
    public void user_click_the_approve_reject_menu_in_reopen_rejected_applications_under_wifak_application() {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrReject_608()); 
    	applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrReject_608().click();
    }

    @And("User_608 enter the reference code in Approve\\Reject searchgrid under WIFAK Reopen Rejected Applications")
    public void user_enter_the_reference_code_in_approve_reject_searchgrid_under_wifak_reopen_rejected_applications() {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrRejectSearchgridCodeInput_608());
    	applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrRejectSearchgridCodeInput_608().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    }

    @And("User_608 double click the first row in Approve\\Reject searchgrid under WIFAK Reopen Rejected Applications maintanance")
    public void user_double_click_the_first_row_in_approve_reject_searchgrid_under_wifak_reopen_rejected_applications_maintanance() {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrRejectSearchgridFirstRowCode_608());
        clicksAndActionsHelper.doubleClick(applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrRejectSearchgridFirstRowCode_608());
        for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrRejectCodeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 click the Approve button in Approve\\Reject under WIFAK Reopen Rejected Applications maintanance")
    public void user_click_the_approve_button_in_approve_reject_under_wifak_reopen_rejected_applications_maintanance() {
    	for (int i = 0; i <= 300; i++) {
        	try {
        		javaScriptHelper.scrollIntoView(applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrRejectApproveBtn_608());
    				break;
    			} catch (Exception e) {
    				if (i == 300) {
    					Assert.fail(e.getMessage());
    				}
    			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrRejectApproveBtn_608());
    	applicationFinancialFacilityObj608.wifakReopenRejectedMenuApproveOrRejectApproveBtn_608().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	applicationFinancialFacilityObj608.SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		} 
    }
    
    
    @And("User_608 again click the maintanance menu under Application for financial facility")
    public void user_again_click_the_maintanance_menu_under_application_for_financial_facility() {
    	waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.appFinancialFacilityMaintanance_608());
		applicationFinancialFacilityObj608.appFinancialFacilityMaintanance_608().click();
        
		waitHelper.waitForElementwithFluentwait(driver, applicationFinancialFacilityObj608.WarningPopupOkBtn_608());
    	applicationFinancialFacilityObj608.WarningPopupOkBtn_608().click();
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(applicationFinancialFacilityObj608.wifakApplicationFinancialFacilitySearchGrid_608().isDisplayed())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("User_608 enter the reference code in searchgrid under Application for financial facility main screen")
    public void user_enter_the_reference_code_in_searchgrid_under_application_for_financial_facility_main_screen() {
    	waitHelper.waitForElementwithFluentwait(driver,	applicationFinancialFacilityObj608.applicationFinancialFacilitySearchCode_608());
		applicationFinancialFacilityObj608.applicationFinancialFacilitySearchCode_608().sendKeys(testData.get("Reference Code"), Keys.ENTER);        
    }

    @Then("User_608 validate Application status should be Active in Application for financial facility main screen")
    public void user_validate_application_status_should_be_active_in_application_for_financial_facility_main_screen() {
    	waitHelper.waitForElementwithFluentwait(driver,	applicationFinancialFacilityObj608.wifakAppFinancialFacilityMaintananceReopenStatus_608());    	
    	waitHelper.waitForElementwithFluentwait(driver,	applicationFinancialFacilityObj608.wifakAppFinancialFacilityMaintananceStatus_608());
    	String getStatus = applicationFinancialFacilityObj608.wifakAppFinancialFacilityMaintananceStatus_608().getAttribute("prevvalue");
    	Assert.assertEquals(testData.get("Status"), getStatus);
    }
    


}
