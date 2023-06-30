package stepdefinitions;

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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.fms.WIFAK_ApplicationObj;
import resources.BaseClass;

public class WIFAK_Application_Steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WIFAK_ApplicationObj WIFAKapplicationObj = new WIFAK_ApplicationObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
//	ExcelData excecutionExcelData = new ExcelData(path,"TestExecution","TestCaseID");
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"Draw_Down_Request","DataSet ID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"IIS_Param_TestData","DataSet ID");
	Map<String, String> testData;
//	Map<String, String> executionTestData;
	
//	@AT_AFF_036
	@And("^get the test data for test case AT_AFF_036$")
    public void get_the_test_data_for_test_case_AT_AFF_036() throws Throwable {
//		executionTestData = excecutionExcelData.getTestdata("843959");
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_036");
    }
	
//	@AT_AFF_040
	@And("^get the test data for test case AT_AFF_040$")
    public void get_the_test_data_for_test_case_AT_AFF_040() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_040");
    }
	

	
////  @AT_AFF_098_FMS_Core
//	@And("^get the test data for test case AT_AFF_098_FMSCore$")
//	public void get_the_test_data_for_test_case_AT_AFF_098fmscore() throws Throwable {
//		testData = fmsTransactionsExcelData.getTestdata("DS_AT_AFF_098");
//	}
	

	
//  @AT_RF_014_FMSCore
    @And("^get the test data for test case AT_RF_014_FMSCore$")
    public void get_the_test_data_for_test_case_AT_RF_014fmscore() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_014");
    }
    

    
//  @AT_RF_098_User1
    @And("^get the test data for test case AT_RF_098_User1$")
    public void get_the_test_data_for_test_case_AT_RF_098user1() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_098");
    }
    
//  @AT_RF_098_User2
    @And("^get the test data for test case AT_RF_098_User2$")
    public void get_the_test_data_for_test_case_AT_RF_098user2() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_098");
    }
    
//	@AT_RF_099_FMSCore
    @And("^get the test data for test case AT_RF_099_FMSCore$")
    public void get_the_test_data_for_test_case_AT_RF_099fmscore() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_099");
    }
    
//  @AT_RF_100
    @And("^get the test data for test case AT_RF_100$")
    public void get_the_test_data_for_test_case_AT_RF_100() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_100");
    }
    
//  @AT_RF_101_FMSCore
    @And("^get the test data for test case AT_RF_101_FMSCore$")
    public void get_the_test_data_for_test_case_AT_RF_101fmscore() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS01_582480");
    }
    
//  @AT_RF_102
    @And("^get the test data for test case AT_RF_102$")
    public void get_the_test_data_for_test_case_AT_RF_102() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_102");
    }
    

    
//  @AT_RF_139
    @And("get the test data for test case AT_RF_139")
    public void get_the_test_data_for_test_case_at_rf_139() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_139");
    }
    
//  @AT_RF_140
    @And("get the test data for test case AT_RF_140")
    public void get_the_test_data_for_test_case_at_rf_140() {
    	testData = fmsTransactionsExcelData.getTestdata("DS_AT_RF_140");
    }
    
	
	@And("^User clicks on the WIFAK_Application first link$")
	public void user_clicks_on_the_wifakapplication_first_link() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.wifakApplicationFirst());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationFirst());
		WIFAKapplicationObj.wifakApplicationFirst().click();
//		highlightEle.highlightElement(WIFAKapplicationObj.wifakApplicationFirst().click());
		
	}

	@And("^User clicks on the WIFAK_Application second link$")
	public void user_clicks_on_the_wifakapplication_second_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationSecond());
		WIFAKapplicationObj.wifakApplicationSecond().click();
	}

	@And("^User clicks on the Application for financial facility link$")
	public void user_clicks_on_the_application_for_financial_facility_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacility());
		WIFAKapplicationObj.applicationFinancialFacility().click();
	}

	@And("^User clicks on the Approve level1 link$")
	public void user_clicks_on_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1());
		WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1().click();
	}

	@And("^User search the code$")
	public void user_search_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchCode());
		WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys(testData.get("Search Code"));
		WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys(Keys.ENTER);

	}

	@And("^User double click searched record$")
	public void user_double_click_searched_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchResult());
		clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.applicationFinancialFacilitySearchResult());
	}

	@Then("^user clicks on the History log tap$")
	public void user_clicks_on_the_history_log_tap() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityHistoryLog());
		WIFAKapplicationObj.applicationFinancialFacilityHistoryLog().click();
	}

	// @AT_AFF_036
	@And("^User clicks the maintanance menu$")
	public void user_clicks_the_maintanance_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.appFinancialFacilityMaintanance());
		WIFAKapplicationObj.appFinancialFacilityMaintanance().click();
	}
	
	@And("^User select the application for dropdown as new facility$")
	public void user_select_the_application_for_dropdown_as_new_facility() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainApplicationForDropdown());
//		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.mainApplicationForDropdown(), "New Facility");
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.mainApplicationForDropdown(), testData.get("Application For"));
	}

	@And("^User enter the CIF No in main info tab$")
	public void user_enter_the_cif_no_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainCIFNo());
//		WIFAKapplicationObj.mainCIFNo().sendKeys("444");
		WIFAKapplicationObj.mainCIFNo().sendKeys(testData.get("CIF No"));
		WIFAKapplicationObj.mainCIFNo().sendKeys(Keys.TAB);
	}

	@And("^User enter the facility type in main info tab$")
	public void user_enter_the_facility_type_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainFacilityType());
//		WIFAKapplicationObj.mainFacilityType().sendKeys("369");
		WIFAKapplicationObj.mainFacilityType().sendKeys(testData.get("Facility Type"));
		WIFAKapplicationObj.mainFacilityType().sendKeys(Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj.mainFacilityTypeLabel().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	} 
	}

	@And("^User enter the country of financing in main info tab$")
	public void user_enter_the_country_of_financing_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainCountryOfFinancing());
//		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys("320");
		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys(testData.get("Country of Financing"));
		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys(Keys.TAB);
	}

	@And("^User enter the facility rating in main info tab$")
	public void user_enter_the_facility_rating_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainFacilityRating());
//		WIFAKapplicationObj.mainFacilityRating().sendKeys("2");
		WIFAKapplicationObj.mainFacilityRating().sendKeys(testData.get("Facility Rating"));
		WIFAKapplicationObj.mainFacilityRating().sendKeys(Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj.mainFacilityRating().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    
	}

	@And("^User clicks on the additional details tab$")
	public void user_clicks_on_the_additinal_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTab());
		for (int i = 0; i < 300; i++) {
			try {
		    	WIFAKapplicationObj.mainAdditionalTab().click();
		    	break;
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User enter the total value in additional info tab$")
	public void user_enter_the_total_value_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTabTotalValue());
//		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys("1000");
		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Total value"));
		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(Keys.TAB);
		
	}

	@And("^User enter the expire date in additional info tab$")
	public void user_enter_the_expire_date_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabExpireDate());
		WIFAKapplicationObj.additionalTabExpireDate().sendKeys(testData.get("Expire Date"),Keys.TAB);
		
	}

	@And("^User clicks the limit details tab$")
	public void user_clicks_the_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainLimitDetailsTab());
		WIFAKapplicationObj.mainLimitDetailsTab().click();
	}

	@And("^User clicks the add new record button in limit details tab$")
	public void user_clicks_the_add_new_record_button_in_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsTabAddNewRecordBtn());
		WIFAKapplicationObj.limitDetailsTabAddNewRecordBtn().click();
	}

	@And("^User enter the product class$")
	public void user_enter_the_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordProductClass());
//		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys("600");
		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(testData.get("Product Class"));
		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(Keys.TAB);
	}

	@Then("^Validate the floating rate with yield details$")
	public void validate_the_floating_rate_with_yield_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.limitDetailsFloatingRate());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsFloatingRate());
		String floatingRate = WIFAKapplicationObj.limitDetailsFloatingRate().getAttribute("prevvalue");
		Assert.assertEquals(Integer.parseInt(floatingRate)>0, true);

	}
	
	
//	 @AT_AFF_048
	@And("^User enter the product class details$")
    public void user_enter_the_product_class_details() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordProductClass());
        WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(testData.get("Product Class"));        
        WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(Keys.TAB);
        
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordCleanFlag());
        WebElement cleanFlag = WIFAKapplicationObj.limitDetailsNewRecordCleanFlag();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
        
    }

    @And("^User retrive the one account number$")
    public void user_retrive_the_one_account_number() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.accountNoSearch());
        WIFAKapplicationObj.accountNoSearch().click();
        
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.retriveAccountNo());
        clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.retriveAccountNo());
    }

    @And("^User clicks on the add button$")
    public void user_clicks_on_the_add_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.clickAddBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clickAddBtn());
    	WIFAKapplicationObj.clickAddBtn().click();
    }
    
    @And("^User validate visibility of Collateral details button under limit details tab$")
    public void user_validate_visibility_of_collateral_details_button_under_limit_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsCollateralDetailsBtn());
    	boolean collateralDetailsBtn = WIFAKapplicationObj.limitDetailsCollateralDetailsBtn().isDisplayed();
    	Assert.assertTrue(collateralDetailsBtn);
    }

    @And("^User clicks on the Charges details button$")
    public void user_clicks_on_the_charges_details_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsChargesDetailsBtn());
    	WIFAKapplicationObj.limitDetailsChargesDetailsBtn().click();
    }

    @And("^User enter the code and check the collect at facility approval$")
    public void user_enter_the_code_and_check_the_collect_at_facility_approval() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsCodeLabel());
    	WIFAKapplicationObj.chargesDetailsCodeLabel().click();
   
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsCode());    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsCheckFacApproval());
    	WIFAKapplicationObj.chargesDetailsCheckFacApproval().click();	
    }

    @And("^User click the Ok button$")
    public void user_click_the_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsOkBtn());
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.chargesDetailsOkBtn().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
//    	WIFAKapplicationObj.chargesDetailsOkBtn().click();
    }

    @And("^User move to the Document details tab$")
    public void user_move_to_the_document_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainDocumentDetailsTab());
    	WIFAKapplicationObj.mainDocumentDetailsTab().click();
    	
    }

    @And("^User enter the Solicitor Name$")
    public void user_enter_the_solicitor_name() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.documentDetailsSolicitorName());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.documentDetailsSolicitorName());
    	WIFAKapplicationObj.documentDetailsSolicitorName().sendKeys("1");;
    	WIFAKapplicationObj.documentDetailsSolicitorName().sendKeys(Keys.TAB);
    }

    @And("^User enter the Estimator Name$")
    public void user_enter_the_estimator_name() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.documentDetailsEstimatorName());
    	WIFAKapplicationObj.documentDetailsEstimatorName().sendKeys("1");
    	WIFAKapplicationObj.documentDetailsEstimatorName().sendKeys(Keys.TAB);
    	
    }

    @And("^User clicks the save button$")
    public void user_clicks_the_save_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsSaveBtn());
    	WIFAKapplicationObj.limitDetailsSaveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
    	WIFAKapplicationObj.WarningPopupOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
    }

    @And("^User clicks the validate button$")
    public void user_clicks_the_validate_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsValidateBtn());
    	WIFAKapplicationObj.limitDetailsValidateBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
    	WIFAKapplicationObj.WarningPopupOkBtn().click();
    	
    	// Facility already created popup
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.confirmPopup());
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityAlreadyCreatedPopup());
    	WIFAKapplicationObj.facilityAlreadyCreatedPopup().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.successPopup());
//    	String SuccessMsg = WIFAKapplicationObj.successPopupMessage().getText();
    	String SuccessMsg = WIFAKapplicationObj.successPopupMessage().getText().substring(23, 27);
    	System.err.println("Reference Number: "+SuccessMsg);
    	fmsTransactionsExcelData.updateTestData("DS_AT_AFF_048", "Reference Code", SuccessMsg);
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    
    	
    	// close the send alert pop-up box
//    	Thread.sleep(5000);
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.sendAlertPopup().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }

    @And("^User clicks the Approve Level1 link$")
    public void user_clicks_the_approve_level1_link() throws Throwable {    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1());
    	WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1().click();	
    }
    
    @And("^User retrive the first data in approve level1$")
    public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1CodeInput());
//    	WIFAKapplicationObj.approveLevel1CodeInput().sendKeys("4067",Keys.ENTER);
    	WIFAKapplicationObj.approveLevel1CodeInput().sendKeys(testData.get("Reference Code"),Keys.ENTER);
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1RetriveData());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel1RetriveData());
    }

    @And("^User select the level1 decision as approve$")
    public void user_select_the_level1_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1SelectDevision());
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), "Approve");
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), testData.get("Decision"));
    }

    @And("^User clicks on the level1 submit button$")
    public void user_clicks_on_the_level1_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1SubmitBtn());
    	WIFAKapplicationObj.approveLevel1SubmitBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
    	WIFAKapplicationObj.WarningPopupOkBtn().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
    	
    }

    @And("^User clicks the Approve Level2 link$")
    public void user_clicks_the_approve_level2_link() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApproveLevel2());
    	WIFAKapplicationObj.applicationFinancialFacilityApproveLevel2().click();
    }
    
    @And("^User retrive the first data in approve level2$")
    public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2CodeInput());
//    	WIFAKapplicationObj.approveLevel2CodeInput().sendKeys("4064",Keys.ENTER);
    	WIFAKapplicationObj.approveLevel2CodeInput().sendKeys(testData.get("Approve Code"),Keys.ENTER);
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2RetriveData());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel2RetriveData());
    }

    @And("^User select the level2 decision as approve$")
    public void user_select_the_level2_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2SelectDevision());
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel2SelectDevision(), "Approve");
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel2SelectDevision(), testData.get("Decision"));
    }

    @And("^User clicks on the level2 submit button$")
    public void user_clicks_on_the_level2_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2SubmitBtn());
    	WIFAKapplicationObj.approveLevel2SubmitBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
    	WIFAKapplicationObj.WarningPopupOkBtn().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
    }

    @And("^User clicks the Approve Level3 link$")
    public void user_clicks_the_approve_level3_link() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApproveLevel3());
    	WIFAKapplicationObj.applicationFinancialFacilityApproveLevel3().click();
    }
    
    @And("^User retrive the first data in approve level3$")
    public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3CodeInput());
//    	WIFAKapplicationObj.approveLevel3CodeInput().sendKeys("4064",Keys.ENTER);
    	WIFAKapplicationObj.approveLevel3CodeInput().sendKeys(testData.get("Approve Code"),Keys.ENTER);
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3RetriveData());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel3RetriveData());
    }
    
    @And("^User select the level3 decision as approve$")
    public void user_select_the_level3_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3SelectDevision());
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel3SelectDevision(), "Approve");
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel3SelectDevision(), testData.get("Decision"));
    
    }
    
    @When("^User clicks on the level3 submit button$")
    public void user_clicks_on_the_level3_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3SubmitBtn());
    	WIFAKapplicationObj.approveLevel3SubmitBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
    	WIFAKapplicationObj.WarningPopupOkBtn().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
    	
    	// close the send alert pop-up box
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.level3SendAlertPopup().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    
    // @AT_AFF_052
//    @And("^User clicks on the clear button$")
//    public void user_clicks_on_the_clear_button() throws Throwable {
////        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clearBtn());
////        WIFAKapplicationObj.clearBtn().click();
//        
//        for (int i = 0; i <= 300; i++) {
//			try {
//				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.clearBtn(),
//						WIFAKapplicationObj.clearBtn());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    }
//
//    @And("^User double clicks on the first row of approve level1$")
//    public void user_double_clicks_on_the_first_row_of_approve_level1() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.searchedData());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.searchedData());
//    }
//
//    @And("^User move to additional details tab in approve level1$")
//    public void user_move_to_additional_details_tab_in_approve_level1() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1AdditionalDetailsTab());
//    	WIFAKapplicationObj.approveLevel1AdditionalDetailsTab().click();
//    }
//
//    
//    @When("^User clicks on the BM Recommendations button$")
//    public void user_clicks_on_the_bm_recommendations_button() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//			try {
//				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.additionalDetailsBMRecommedBtn());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	WIFAKapplicationObj.additionalDetailsBMRecommedBtn().click();
//    }
//
//    @Then("^User validate the BM Recommendations tab is editable or not$")
//    public void user_validate_the_bm_recommendations_tab_is_editable_or_not() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.BMRecommedTab());
//    	String readOnly = WIFAKapplicationObj.BMRecommedTab().getAttribute("readonly");
//    	Assert.assertNull(readOnly);
//    }

    
////  @AT_RF_040
//    @And("^User enter the down payment percentage in additional info tab$")
//    public void user_enter_the_down_payment_percentage_in_additional_info_tab() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabDownPayPercent());
//    	WIFAKapplicationObj.additionalTabDownPayPercent().sendKeys(testData.get("Down Payment %"));
//    	WIFAKapplicationObj.additionalTabDownPayPercent().sendKeys(Keys.TAB);
//    }
//
//    @And("^User enter the down payment to vendor percentage in additional info tab$")
//    public void user_enter_the_down_payment_to_vendor_percentage_in_additional_info_tab() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabDownPayToVendor());
//    	WIFAKapplicationObj.additionalTabDownPayToVendor().sendKeys(testData.get("Down Payment to Vendor %"));
//    	WIFAKapplicationObj.additionalTabDownPayToVendor().sendKeys(Keys.TAB);
//    }
//    
//    @Then("^User validate the visibility of Account No input box in limit details$")
//    public void user_validate_the_visibility_of_account_no_input_box_in_limit_details() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsAccNoInput());
//    	boolean accNoDisplayed = WIFAKapplicationObj.limitDetailsAccNoInput().isDisplayed();
//    	Assert.assertEquals(true, accNoDisplayed);
//    }
//
//    @Then("^User validate the visibility of Fund Transfer rate input box in limit details$")
//    public void user_validate_the_visibility_of_fund_transfer_rate_input_box_in_limit_details() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsFundTransferRateInput());
//    	boolean fundtransferdisplayed = WIFAKapplicationObj.limitDetailsFundTransferRateInput().isDisplayed();
//    	Assert.assertEquals(true, fundtransferdisplayed);
//    }
    
    
//  @AT_RF_098_User1
    @And("^User1 clicks on the WIFAK_Application first link$")
    public void user1_clicks_on_the_wifakapplication_first_link() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.wifakApplicationFirst());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationFirst());
		WIFAKapplicationObj.wifakApplicationFirst().click();
    }

    @And("^User1 clicks on the WIFAK_Application second link$")
    public void user1_clicks_on_the_wifakapplication_second_link() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationSecond());
		WIFAKapplicationObj.wifakApplicationSecond().click();
    }

    @And("^User1 clicks on the approval committe recommedation menu$")
    public void user1_clicks_on_the_approval_committe_recommedation_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeRecommendations());
    	WIFAKapplicationObj.approvalCommitteeRecommendations().click();
    }

    @And("^User1 clicks on the clear button in approval committe recommedations menu$")
    public void user1_clicks_on_the_clear_button_in_approval_committe_recommedations_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeClearBtn());
    	WIFAKapplicationObj.approvalCommitteeClearBtn().click();
    }

    @And("^User1 double click on the any one record in approval committe recommedations menu$")
    public void user1_double_click_on_the_any_one_record_in_approval_committe_recommedations_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeSelectRow());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approvalCommitteeSelectRow());
    }

    @And("^User1 clicks on the Recommend button in approval committe recommedations menu$")
    public void user1_clicks_on_the_recommend_button_in_approval_committe_recommedations_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeCode());
    	for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.approvalCommitteeRecommendBtn());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeRecommendBtn());
		WIFAKapplicationObj.approvalCommitteeRecommendBtn().click();
		
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
    	WIFAKapplicationObj.WarningPopupOkBtn().click();
    	
    }

    @And("^User1 click the User1 recommended by name in recommend box$")
    public void user1_click_the_user1_recommended_by_name_in_recommend_box() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.approvalCommitteeRecommendByLabel());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeRecommendByLabel());
    	WIFAKapplicationObj.approvalCommitteeRecommendByLabel().click();
    }

    @And("^User1 select the recommendation as approve in recommend box$")
    public void user1_select_the_recommendation_as_approve_in_recommend_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeRecommendationDropdown());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approvalCommitteeRecommendationDropdown(), testData.get("Recommendation"));
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approvalCommitteeRecommendationDropdown(), "Approve");
    }

    @And("^User1 click the comment code lookup option in recommend box$")
    public void user1_click_the_comment_code_lookup_option_in_recommend_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeRecommendationDropdownOption());
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.approvalCommitteeCommentCodeLookup().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeCommentCodeLookup());
//    	WIFAKapplicationObj.approvalCommitteeCommentCodeLookup().click();
    }

    @And("^User1 double click the first row of comment code lookup in recommend box$")
    public void user1_double_click_the_first_row_of_comment_code_lookup_in_recommend_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeCommentCodeLookupFirstRow());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approvalCommitteeCommentCodeLookupFirstRow());
    }

    @And("^User1 clicks the more comments button in recommend box$")
    public void user1_clicks_the_more_comments_button_in_recommend_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeMoreCommentsBtn());
    	WIFAKapplicationObj.approvalCommitteeMoreCommentsBtn().click();
    }

    @And("^User1 enter the some comments in more comments$")
    public void user1_enter_the_some_comments_in_more_comments() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeMoreCommentsInput());
    	WIFAKapplicationObj.approvalCommitteeMoreCommentsInput().sendKeys(testData.get("More Comments"));
//    	WIFAKapplicationObj.approvalCommitteeMoreCommentsInput().sendKeys("Test Comments");
    }

    @And("^User1 click the Ok button in more comments$")
    public void user1_click_the_ok_button_in_more_comments() throws Throwable {
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.approvalCommitteeMoreCommentsOkBtn().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeMoreCommentsOkBtn());
//    	WIFAKapplicationObj.approvalCommitteeMoreCommentsOkBtn().click();
    }
    
    @When("^User1 click the Ok button in recommend box$")
    public void user1_click_the_ok_button_in_recommend_box() throws Throwable {
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.approvalCommitteeOkBtn().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approvalCommitteeOkBtn());    	
//    	WIFAKapplicationObj.approvalCommitteeOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.successPopup());
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.successPopupMessage());
    	String SuccessMsg = WIFAKapplicationObj.successPopupMessage().getText().substring(23, 27);
    	fmsTransactionsExcelData.updateTestData("DS_AT_RF_098", "Search Code", SuccessMsg);
    	
    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
    }

    
//  @AT_RF_098_User2
    @And("^User clicks on the search button in Application for financial facility main screen$")
    public void user_clicks_on_the_search_button_in_application_for_financial_facility_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchBtn());
    	WIFAKapplicationObj.applicationFinancialFacilitySearchBtn().click();
    }

    @And("^User search the code in Application for financial facility main screen$")
    public void user_search_the_code_in_application_for_financial_facility_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchCode());
    	WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys(testData.get("Search Code"));
    	WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys(Keys.ENTER);
    }

    @And("^User double click searched record in Application for financial facility main screen$")
    public void user_double_click_searched_record_in_application_for_financial_facility_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchResult());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.applicationFinancialFacilitySearchResult());
    }

    @And("^User clicks on the Approval committee button$")
    public void user_clicks_on_the_approval_committee_button() throws Throwable {
    	for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeBtn());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeBtn());
    	WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeBtn().click();
    }

    @And("^User click the User1 name in Recommented by column$")
    public void user_click_the_user1_name_in_recommented_by_column() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeRecommendByLabel());
    	WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeRecommendByLabel().click();
    }

    @And("^User clicks on the more comments button$")
    public void user_clicks_on_the_more_comments_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeMoreCommentsBtn());
    	WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeMoreCommentsBtn().click();
    }

    @Then("^User validate the more comments text in input field$")
    public void user_validate_the_more_comments_text_in_input_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeMoreCommentsText());
    	String text = WIFAKapplicationObj.applicationFinancialFacilityApprovalCommittieeMoreCommentsText().getAttribute("prevvalue");
    	System.out.println("More Comments Text: "+ text);
    	Assert.assertEquals(testData.get("More Comments"), text);
    }
    
    
//  @AT_RF_100
    @And("^User select the application for dropdown as decrease in main screen$")
    public void user_select_the_application_for_dropdown_as_decrease_in_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainApplicationForDropdown());
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.mainApplicationForDropdown(), testData.get("Application For"));
    }

    @And("^User enter the input as Existing Facility Ref in main screen$")
    public void user_enter_the_input_as_existing_facility_ref_in_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainExistingFacilityRef());
//    	WIFAKapplicationObj.mainExistingFacilityRef().sendKeys(testData.get("Facility Ref"));
    	WIFAKapplicationObj.mainExistingFacilityRef().sendKeys("1390");
    	WIFAKapplicationObj.mainExistingFacilityRef().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 300; i++) {
    		try {
				if(!(WIFAKapplicationObj.mainExistingFacilityRef().getAttribute("readonly").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}    	

    }
    
    @And("^User enter the total value under additional info tab$")
    public void user_enter_the_total_value_under_additional_info_tab() throws Throwable {    	
    	// First We get the Finance amount without total amount
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabFinanceAmount());
    	String beforeFinanceAmount = WIFAKapplicationObj.additionalTabFinanceAmount().getAttribute("prevvalue");
//    	System.out.println("Before Finance Amount: "+ beforeFinanceAmount);
    	fmsTransactionsExcelData.updateTestData("DS01_582426", "Finance Amount", beforeFinanceAmount);
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTabTotalValue());
		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Total value"));
		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(Keys.TAB);
		Thread.sleep(3000);
    }

    @And("^User validate the finance amount should be decresed based on total value$")
    public void user_validate_the_finance_amount_should_be_decresed_based_on_total_value() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS01_582426");
    	String financeAmount = testData.get("Finance Amount");
    	String totalValue = testData.get("Total value");
    	
    	String afterFinanceAmount = WIFAKapplicationObj.additionalTabFinanceAmount().getAttribute("prevvalue");
    	String[] splitFinaceAmount  = afterFinanceAmount.split("[.]");
    	String finalFinaceAmount = splitFinaceAmount[0].replace(",", "");
//    	System.out.println("Finance Amount: "+finalFinaceAmount);
//    	System.out.println("After Finance Amount: "+afterFinanceAmount);
    	
    	int cvValue = Integer.parseInt(financeAmount)-Integer.parseInt(totalValue);
    	String cvValueText = String.valueOf(cvValue);
    	fmsTransactionsExcelData.updateTestData("DS01_582426", "CV Value", cvValueText);
    	
    	Assert.assertEquals(cvValueText, finalFinaceAmount);
    	
    }

    @And("^User validate the Facility value and CV value should be changed same as decreased finance amount under limit details$")
    public void user_validate_the_facility_value_and_cv_value_should_be_changed_same_as_decreased_finance_amount_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsProductFacilityValue());
    	String facilityValue = WIFAKapplicationObj.limitDetailsProductFacilityValue().getAttribute("title");
    	String[] splitFacilityValue  = facilityValue.split("[.]");
    	String finalFacilityValue = splitFacilityValue[0].replace(",", "");
    	
    	testData = fmsTransactionsExcelData.getTestdata("DS01_582426");
    	Assert.assertEquals(testData.get("CV Value"), finalFacilityValue);
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsProductCVValue());
    	String CVValue = WIFAKapplicationObj.limitDetailsProductCVValue().getAttribute("title");
    	String[] splitCVValue  = CVValue.split("[.]");
    	String finalCVValue = splitCVValue[0].replace(",", "");
    	
    	Assert.assertEquals(testData.get("CV Value"), finalCVValue);
    	
    }

    @And("^User double click on the product class under limit details$")
    public void user_double_click_on_the_product_class_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsProductFacilityValue());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.limitDetailsProductFacilityValue());
    }
    
    @And("^User click the clean flag under product calss in limit details tab$")
    public void user_click_the_clean_flag_under_product_calss_in_limit_details_tab() throws Throwable {
    	// check the clean flag
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordCleanFlag());
        WebElement cleanFlag = WIFAKapplicationObj.limitDetailsNewRecordCleanFlag();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
    }
    
    @And("^User click the edit button under product class in limit details tab$")
    public void user_click_the_edit_button_under_product_class_in_limit_details_tab() throws Throwable {
    	
    	for (int i = 0; i <= 300; i++) {
        	try {
        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj.limitDetailsProductEditBtn());
    				break;
    			} catch (Exception e) {
    				if (i == 300) {
    					Assert.fail(e.getMessage());
    				}
    			}
    	}
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsProductEditBtn());
        WIFAKapplicationObj.limitDetailsProductEditBtn().click();
    }
    
    
//  @AT_RF_102
    @And("^User select the Item in limit Details$")
    public void user_select_the_item_in_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsItem());
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.limitDetailsItem(), "Import L/C");
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.limitDetailsItem(), testData.get("Limit Details Item"));
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(WIFAKapplicationObj.limitDetailsNewRecordProductClass().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

    @And("^User select the Maturity date in limit Details$")
    public void user_select_the_maturity_date_in_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsMaturityDateCalender());
    	WIFAKapplicationObj.limitDetailsMaturityDateCalender().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsItem());
    	WIFAKapplicationObj.limitDetailsMaturityDate().click();
    	
    	// check the Clean flag
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordCleanFlag());
        WebElement cleanFlag = WIFAKapplicationObj.limitDetailsNewRecordCleanFlag();
        if(!(cleanFlag.isSelected())) {
        	cleanFlag.click();
    	}
    }

    @And("^User enter the Margin rate in limit Details$")
    public void user_enter_the_margin_rate_in_limit_details() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
        	try {
        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj.limitDetailsMarginRateInput());
    				break;
    			} catch (Exception e) {
    				if (i == 300) {
    					Assert.fail(e.getMessage());
    				}
    			}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsMarginRateInput());
//    	WIFAKapplicationObj.limitDetailsMarginRateInput().sendKeys("2");
    	WIFAKapplicationObj.limitDetailsMarginRateInput().sendKeys(testData.get("Margin Rate"));
    	WIFAKapplicationObj.limitDetailsMarginRateInput().sendKeys(Keys.TAB);
        
    }
    
    
////  @AT_RF_157
//    @And("^User clicks on the Draw Down request module$")
//    public void user_clicks_on_the_draw_down_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationDrawDownRequest());
//    	WIFAKapplicationObj.wifakApplicationDrawDownRequest().click();
//    }
//
//    @And("^User clicks on the Maintanance under Draw Down request$")
//    public void user_clicks_on_the_maintanance_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestMaintanance());
//    	WIFAKapplicationObj.drawDownRequestMaintanance().click();        
//    }
//
//    @And("^User enter the Facility Reference in main screen under Draw Down request$")
//    public void user_enter_the_facility_reference_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainFacilityRef());
////    	WIFAKapplicationObj.drawdownMainFacilityRef().sendKeys("1469",Keys.TAB);
//    	WIFAKapplicationObj.drawdownMainFacilityRef().sendKeys(testData.get("Facility Ref"),Keys.TAB);
//    	
//    	for(int i = 0; i <= 500; i++) {
//    		try {
//				if(!(WIFAKapplicationObj.drawdownMainDateSubmitted().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}
//    	
////    	try {
////    		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownPostApprovalYesBtn());
////        	WIFAKapplicationObj.drawdownPostApprovalYesBtn().click();
////        	for(int i = 0; i <= 500; i++) {
////        		try {
////    				if(!(WIFAKapplicationObj.drawdownMainDateSubmitted().getAttribute("prevvalue").isBlank())) {
////    					break;
////    				}
////    			} catch (Exception e) {
////    				// TODO: handle exception
////    			}
////        	}
////		} catch (Exception e) {
////			// TODO: handle exception
////		}
//
//    }
//
//    @And("^User select the draw down type in main screen under Draw Down request$")
//    public void user_select_the_draw_down_type_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainDrawDownTypeLookup());
//    	WIFAKapplicationObj.drawdownMainDrawDownTypeLookup().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainDrawdownTypeValue());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.drawdownMainDrawdownTypeValue());
//    }
//
//    @And("^User enter the Description in main screen under Draw Down request$")
//    public void user_enter_the_description_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainDescription());
////    	WIFAKapplicationObj.drawdownMainDescription().sendKeys("Test");
//    	WIFAKapplicationObj.drawdownMainDescription().sendKeys(testData.get("Description"));
//    }
//    
//    @And("User click on the draw down additional details tab")
//    public void user_click_on_the_draw_down_additional_details_tab() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownAdditionalDetailsTab());
//    	WIFAKapplicationObj.drawdownAdditionalDetailsTab().click();
//    }
//
//    @And("^User select the product class in additional screen under Draw Down request$")
//    public void user_select_the_product_class_in_additional_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownAdditionalProductClassLookup());
//    	WIFAKapplicationObj.drawdownAdditionalProductClassLookup().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownAdditionalProductClassCode());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.drawdownAdditionalProductClassCode());
//    	
//    	for(int i = 0; i <= 500; i++) {
//    		try {
//				if(!(WIFAKapplicationObj.drawdownAdditionalProductClass().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}
//    }
//
//    @And("^User give the FC Amount in additional screen under Draw Down request$")
//    public void user_give_the_fc_amount_in_additional_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownAdditionalFCAmount());
//    	WIFAKapplicationObj.drawdownAdditionalFCAmount().clear();
////    	WIFAKapplicationObj.drawdownAdditionalFCAmount().sendKeys("500",Keys.TAB);
//    	WIFAKapplicationObj.drawdownAdditionalFCAmount().sendKeys(testData.get("FC Amount"),Keys.TAB);
//    	
//    	for(int i = 0; i <= 500; i++) {
//    		try {
//				if(!(WIFAKapplicationObj.drawdownAdditionalFCAmount().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//    	}
//    }
//    
//    @And("^User enter the value date in main screen under Draw Down request$")
//    public void user_enter_the_value_date_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainInfoTab());
//    	WIFAKapplicationObj.drawdownMainInfoTab().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainValueDate());
////    	WIFAKapplicationObj.drawdownMainValueDate().sendKeys("05/01/2024",Keys.TAB);
//    	WIFAKapplicationObj.drawdownMainValueDate().sendKeys(testData.get("Value Date"),Keys.TAB);
//    }
//    
//    @When("^User click the save button under in maintanance under Draw Down request$")
//    public void user_click_the_save_button_under_in_maintanance_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainSaveBtn());
//    	WIFAKapplicationObj.drawdownMainSaveBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	// Post Approval popup
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownPostApprovalYesBtn());
//    	WIFAKapplicationObj.drawdownPostApprovalYesBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    	
//    	// Send Alert popup
//    	for (int i = 0; i < 2000; i++) {
//			try {
//		    	WIFAKapplicationObj.sendAlertPopup().click();
//		    	break;
//			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	
//    }
//    
//    
//    @Then("User click on the Verify link under Draw Down request")
//    public void user_click_on_the_verify_link_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestVerify());
//    	WIFAKapplicationObj.drawDownRequestVerify().click();
//    }
//    @And("User click on the clear button in verify under Draw Down request")
//    public void user_click_on_the_clear_button_in_verify_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownVerifyClearBtn());
//    	WIFAKapplicationObj.drawdownVerifyClearBtn().click();
//    }
//    @And("User double click on the code in verify under Draw Down request")
//    public void user_double_click_on_the_code_in_verify_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownVerifyCode());
//        clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.drawdownVerifyCode());
//    }
//    @When("User click on the verify button in Verify link under Draw Down request")
//    public void user_click_on_the_verify_button_in_verify_link_under_draw_down_request() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//        	try {
//        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj.drawDownRequestVerifyBtn());
//    				break;
//    			} catch (Exception e) {
//    				if (i == 300) {
//    					Assert.fail(e.getMessage());
//    				}
//    			}
//    	}
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestVerifyBtn());
//    	WIFAKapplicationObj.drawDownRequestVerifyBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	// Post Approval popup
////    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownPostApprovalYesBtn());
////    	WIFAKapplicationObj.drawdownPostApprovalYesBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    	
//    	// Send Alert popup
//    	for (int i = 0; i < 2000; i++) {
//			try {
//		    	WIFAKapplicationObj.drawdownVerifySendAlertPopup().click();
//		    	break;
//			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	
//    }
//    	
//    @Then("User click on the Approve link under Draw Down request")
//    public void user_click_on_the_approve_link_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestApprove());
//    	WIFAKapplicationObj.drawDownRequestApprove().click();
//    }
//    @And("User click on the clear button in Approve under Draw Down request")
//    public void user_click_on_the_clear_button_in_approve_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownApproveClearBtn());
//    	WIFAKapplicationObj.drawdownApproveClearBtn().click();
//    }
//    @And("User double click on the code in Approve under Draw Down request")
//    public void user_double_click_on_the_code_in_approve_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownApproveCode());
//        clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.drawdownApproveCode());
//    }
//    @When("User click on the Approve button in Approve link under Draw Down request")
//    public void user_click_on_the_approve_button_in_approve_link_under_draw_down_request() throws Throwable {
//    	for (int i = 0; i <= 300; i++) {
//        	try {
//        		javaScriptHelper.scrollIntoView(WIFAKapplicationObj.drawDownRequestApproveBtn());
//    				break;
//    			} catch (Exception e) {
//    				if (i == 300) {
//    					Assert.fail(e.getMessage());
//    				}
//    			}
//    	}
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestApproveBtn());
//    	WIFAKapplicationObj.drawDownRequestApproveBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	// Post Approval pop-up
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownPostApprovalYesBtn());
//    	WIFAKapplicationObj.drawdownPostApprovalYesBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    	
//    	
//    	
//        
//    }
//    @Then("User again clicks on the Maintanance under Draw Down request")
//    public void user_again_clicks_on_the_maintanance_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawDownRequestMaintanance());
//    	WIFAKapplicationObj.drawDownRequestMaintanance().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();        
//    }
//    @And("User clicks on the search button in main screen under Draw Down request")
//    public void user_clicks_on_the_search_button_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainSearchBtn());
//    	WIFAKapplicationObj.drawdownMainSearchBtn().click();
//    }
//    @And("User click the clear button in main screen under Draw Down request")
//    public void user_click_the_clear_button_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainClearBtn());
//    	WIFAKapplicationObj.drawdownMainClearBtn().click();        
//    }
//    @And("User double click on the first line code in main screen under Draw Down request")
//    public void user_double_click_on_the_first_line_code_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainCode());
//    	WIFAKapplicationObj.drawdownMainCode().click();    	
//    }
//    @And("User click on the Status Details button in main screen under Draw Down request")
//    public void user_click_on_the_status_details_button_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainStatusDetailsBtn());
//    	WIFAKapplicationObj.drawdownMainStatusDetailsBtn().click();        
//    }
//    @And("User verify the Status Details tab User Name in main screen under Draw Down request")
//    public void user_verify_the_status_details_tab_user_name_in_main_screen_under_draw_down_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.drawdownMainStatusDetailsTab());
//    	String userName = WIFAKapplicationObj.drawdownMainStatusDetailsUserName().getAttribute("title");
//    	System.out.println("User Name: "+ userName);
//    }
//    
//    
//    @Then("User clicks on the Facility Closure Request module")
//    public void user_clicks_on_the_facility_closure_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationFacilityClosureRequest());
//    	WIFAKapplicationObj.wifakApplicationFacilityClosureRequest().click();
//    }
//    @And("User click on the Maintanance under Facility Closure Request module")
//    public void user_click_on_the_maintanance_under_facility_closure_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureRequestMaintanance());
//    	WIFAKapplicationObj.facilityClosureRequestMaintanance().click();
//    }
//    @And("User enter the Facility ref in main screen under Facility Closure Request")
//    public void user_enter_the_facility_ref_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainFacilityRef());
//    	WIFAKapplicationObj.facilityClosureMainFacilityRef().sendKeys("1336",Keys.TAB);
//    }
//    @And("User enter the Closure reason in main screen under Facility Closure Request")
//    public void user_enter_the_closure_reason_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainClosureReason());
//    	WIFAKapplicationObj.facilityClosureMainClosureReason().sendKeys("test");
//    }
//    @And("User click on the Save button in main screen under Facility Closure Request")
//    public void user_click_on_the_save_button_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainSaveBtn());
//    	WIFAKapplicationObj.facilityClosureMainSaveBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainSendAlertPopup());
//    	WIFAKapplicationObj.facilityClosureMainSendAlertPopup().click();
//    }
//
//    @Then("User clicks on the Approve under Facility Closure Request module")
//    public void user_clicks_on_the_approve_under_facility_closure_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureRequestApprove());
//    	WIFAKapplicationObj.facilityClosureRequestApprove().click();
//    }
//    @And("User click on the clear button in approve screen under Facility Closure Request")
//    public void user_click_on_the_clear_button_in_approve_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureApproveClearBtn());
//    	WIFAKapplicationObj.facilityClosureApproveClearBtn().click();
//    }
//    @And("User double click on the code in approve screen under Facility Closure Request")
//    public void user_double_click_on_the_code_in_approve_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureApproveCode());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.facilityClosureApproveCode());
//    }
//    @When("User click on the Approve button in approve screen under Facility Closure Request")
//    public void user_click_on_the_approve_button_in_approve_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureApproveBtn());
//    	WIFAKapplicationObj.facilityClosureApproveBtn().click();
//        
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();
//    	
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
//    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
//    }
//    
//    @Then("User again click the Maintanance under Facility Closure Request module")
//    public void user_again_click_the_maintanance_under_facility_closure_request_module() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureRequestMaintanance());
//    	WIFAKapplicationObj.facilityClosureRequestMaintanance().click();
//        
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.WarningPopupOkBtn());
//    	WIFAKapplicationObj.WarningPopupOkBtn().click();        
//    }
//    @And("User click on the search button in main screen under Facility Closure Request")
//    public void user_click_on_the_search_button_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainSearchBtn());
//    	WIFAKapplicationObj.facilityClosureMainSearchBtn().click();
//        
//    }
//    @And("User double click on the code in main screen under Facility Closure Request")
//    public void user_double_click_on_the_code_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainCode());
//    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.facilityClosureMainCode());
//        
//    }
//    @And("User click the Status details button in main screen under Facility Closure Request")
//    public void user_click_the_status_details_button_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainStatusDetailsBtn());
//    	WIFAKapplicationObj.facilityClosureMainStatusDetailsBtn().click();
//        
//    }
//    @Then("User verify the Status details tab in main screen under Facility Closure Request")
//    public void user_verify_the_status_details_tab_in_main_screen_under_facility_closure_request() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityClosureMainStatusDetailsTab());
//    	WIFAKapplicationObj.facilityClosureMainStatusDetailsTab().click();
//        
//    }
    
    
//    @AT_RF_139
    @And("User clicks the all critical checkboxes in document checklist")
    public void user_clicks_the_all_critical_checkboxes_in_document_checklist() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistCriticalCheck());
    	
    	List<WebElement> checkboxes = driver.findElements(By.xpath("//td[@tdlabel='Critical']//input"));  
    	for (int i = 0; i < checkboxes.size(); i++) {
    		checkboxes.get(i).click();
		}
    	
    }
    
    @And("User clicks the limit details tab under approve level1")
    public void user_clicks_the_limit_details_tab_under_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1LimitDetailsTab());
    	WIFAKapplicationObj.approveLevel1LimitDetailsTab().click();
    	
    }
       

    @And("User select the product class in limit details under approve level1")
    public void user_select_the_product_class_in_limit_details_under_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1LimitDetailsProductRow());
    	WIFAKapplicationObj.approveLevel1LimitDetailsProductRow().click();
    }

    @And("User click the document checklist button under limit details in approve level1")
    public void user_click_the_document_checklist_button_under_limit_details_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1LimitDetailsDocChecklistBtn());
    	WIFAKapplicationObj.approveLevel1LimitDetailsDocChecklistBtn().click();
    }

    @And("User click the ok button in document checklist under limit details")
    public void user_click_the_ok_button_in_document_checklist_under_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1LimitDetailsDocChecklistRow());
    	WIFAKapplicationObj.limitDetailsDocumentChecklistOkBtn().click();
    }
    
    
    
//  @AT_RF_140
    @And("User select the second row in document checklist tab")
    public void user_select_the_second_row_in_document_checklist_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistRow2());
    	WIFAKapplicationObj.limitDetailsDocumentChecklistRow2().click();
    }

    @And("User give the file in choose file input under document checklist tab")
    public void user_give_the_file_in_choose_file_input_under_document_checklist_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistChooseFileInput());
//    	WIFAKapplicationObj.limitDetailsDocumentChecklistChooseFileInput().sendKeys("C:\\Users\\inindc00608\\Desktop\\FMSTest.txt");
    	WIFAKapplicationObj.limitDetailsDocumentChecklistChooseFileInput().sendKeys(testData.get("File Location"));
    }

    @And("User click the Upload docs button under document checklist tab")
    public void user_click_the_upload_docs_button_under_document_checklist_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistUploadDocsBtn());
    	WIFAKapplicationObj.limitDetailsDocumentChecklistUploadDocsBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.SuccessPopupOkBtn());
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.SuccessPopupOkBtn().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("User validate the Attachment flag is checked in second row under document checklist tab")
    public void user_validate_the_attachment_flag_is_checked_in_second_row_under_document_checklist_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsDocumentChecklistAttachFlag());
    	boolean flagSelected = WIFAKapplicationObj.limitDetailsDocumentChecklistAttachFlag().isSelected();
    	Assert.assertEquals(true, flagSelected);
    }

    
    @And("User click the second row of checklist under limit details in approve level1")
    public void user_click_the_second_row_of_checklist_under_limit_details_in_approve_level1() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistRow2());
    	WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistRow2().click();
    }

    @And("User click the View button in checklist under limit details in approve level1")
    public void user_click_the_view_button_in_checklist_under_limit_details_in_approve_level1() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewBtn());
    	WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewBtn().click();
    }

    @And("User vaidate the rows are available in View tab under document checklist")
    public void user_vaidate_the_rows_are_available_in_view_tab_under_document_checklist() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewRow1());
    	boolean rowDisplayed = WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewRow1().isDisplayed();
    	System.out.println("Row are available: "+rowDisplayed);
    }

    @And("User close the View tab in document checklist under approve level1 limit details")
    public void user_close_the_view_tab_in_document_checklist_under_approve_level1_limit_details() {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewClose());
    	WIFAKapplicationObj.approve1LimitDetailsDocumentChecklistViewClose().click();
    }



}
