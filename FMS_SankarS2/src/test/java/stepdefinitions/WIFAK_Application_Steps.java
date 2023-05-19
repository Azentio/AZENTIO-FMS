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
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
	Map<String, String> testData;

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
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.wifakApplicationFirst());
		WIFAKapplicationObj.wifakApplicationFirst().click();
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
	
	@And("^get the test data for test case 862019$")
    public void get_the_test_data_for_test_case_862019() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS01_862019");
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

	// @843959

	@And("^User clicks the maintanance menu$")
	public void user_clicks_the_maintanance_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.appFinancialFacilityMaintanance());
		WIFAKapplicationObj.appFinancialFacilityMaintanance().click();
	}

	@And("^get the test data for test case 843959$")
    public void get_the_test_data_for_test_case_843959() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS01_843959");
    }
	
	@And("^User select the application for dropdown as new facility$")
	public void user_select_the_application_for_dropdown_as_new_facility() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainApplicationForDropdown());
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.mainApplicationForDropdown(), "New Facility");
//		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.mainApplicationForDropdown(), testData.get("Application For"));
	}

	@And("^User enter the CIF No in main info tab$")
	public void user_enter_the_cif_no_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainCIFNo());
		WIFAKapplicationObj.mainCIFNo().sendKeys("727");
//		WIFAKapplicationObj.mainCIFNo().sendKeys(testData.get(testData.get("CIF No")));
		WIFAKapplicationObj.mainCIFNo().sendKeys(Keys.TAB);
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.cifTouch());
//		WIFAKapplicationObj.cifTouch().click();
	}

	@And("^User enter the facility type in main info tab$")
	public void user_enter_the_facility_type_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainFacilityType());
		WIFAKapplicationObj.mainFacilityType().sendKeys("369");
//		WIFAKapplicationObj.mainFacilityType().sendKeys(testData.get(testData.get("Facility Type")));
		WIFAKapplicationObj.mainFacilityType().sendKeys(Keys.TAB);
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityTouch());
//		WIFAKapplicationObj.facilityTouch().click();
	}

	@And("^User enter the country of financing in main info tab$")
	public void user_enter_the_country_of_financing_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainCountryOfFinancing());
		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys("320");
//		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys(testData.get("Country of Financing"));
		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys(Keys.TAB);
		
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityTouch());
//		WIFAKapplicationObj.facilityTouch().click();
	}

	@And("^User enter the facility rating in main info tab$")
	public void user_enter_the_facility_rating_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainFacilityRating());
		WIFAKapplicationObj.mainFacilityRating().sendKeys("2");
//		WIFAKapplicationObj.mainFacilityRating().sendKeys(testData.get("Facility Rating"));
		WIFAKapplicationObj.mainFacilityRating().sendKeys(Keys.TAB);
//		WIFAKapplicationObj.facilityTouch().click();
	}

	@And("^User clicks on the additional details tab$")
	public void user_clicks_on_the_additinal_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTab());
		WIFAKapplicationObj.mainAdditionalTab().click();
	}

	@And("^User enter the total value in additional info tab$")
	public void user_enter_the_total_value_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTabTotalValue());
		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys("1000");
//		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(testData.get("Total value"));
		WIFAKapplicationObj.mainAdditionalTabScreen().click();;
	}

	@And("^User enter the expire date in additional info tab$")
	public void user_enter_the_expire_date_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabExpireCalender());
		WIFAKapplicationObj.additionalTabExpireCalender().click();
		
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabExpireDate());
		WIFAKapplicationObj.additionalTabExpireDate().click();
	}

	@And("^User clicks the limit details tab$")
	public void user_clicks_the_limit_details_tab() throws Throwable {
		Thread.sleep(5000);
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
		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys("600");
//		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(testData.get("Product Class"));
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
		// document.getElementById('lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT').value

		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsFloatingRate());
		String floatingRate = WIFAKapplicationObj.limitDetailsFloatingRate().getAttribute("prevvalue");
		Assert.assertEquals(Integer.parseInt(floatingRate)>0, true);

	}
	
	
	// @296063
	 @And("^get the test data for test case 296063$")
	    public void get_the_test_data_for_test_case_296063() throws Throwable {
		 testData = fmsTransactionsExcelData.getTestdata("DS01_296063");
	    }
	 
	@And("^User enter the product class details$")
    public void user_enter_the_product_class_details() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordProductClass());
        WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys("1");
//        WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(testData.get("Product Class"));        
        WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(Keys.TAB);
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
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clickAddBtn());
    	WIFAKapplicationObj.clickAddBtn().click();
    	
    	try {
			waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ServerRequestNotComplete_OKButton());
			WIFAKapplicationObj.ServerRequestNotComplete_OKButton().click();
			waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clickAddBtn());
			WIFAKapplicationObj.clickAddBtn().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @And("^User clicks on the Charges details button$")
    public void user_clicks_on_the_charges_details_button() throws Throwable {
    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsChargesDetailsBtn());
    	WIFAKapplicationObj.limitDetailsChargesDetailsBtn().click();
    }

    @And("^User clicks the add new record button$")
    public void user_clicks_the_add_new_record_button() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsAddNewBtn());
//    	WIFAKapplicationObj.chargesDetailsAddNewBtn().click();
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.chargesDetailsAddNewBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	Thread.sleep(3000);
//    	WIFAKapplicationObj.chargesDetailsAddNewBtn().click();
    	
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.chargesDetailsAddNewBtn(),
						WIFAKapplicationObj.chargesDetailsAddNewBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}    	
    	
    }

    @And("^User enter the code and check the collect at facility approval$")
    public void user_enter_the_code_and_check_the_collect_at_facility_approval() throws Throwable {
    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargeDetailsFirstRow());
    	WIFAKapplicationObj.chargesDetailsCodeLabel().click();
    	WIFAKapplicationObj.chargesDetailsCode().sendKeys("1");
    	WIFAKapplicationObj.chargesDetailsCode().sendKeys(Keys.TAB);
//    	WIFAKapplicationObj.chargesDetailsCode().sendKeys(testData.get("Charges Details Code"));
    	
//    	Thread.sleep(3000);
//    	for (int i = 0; i <= 300; i++) {
//			try {
//				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.chargesDetailsCheckFacApproval(),
//						WIFAKapplicationObj.chargesDetailsCheckFacApproval());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsCheckFacApproval());
//    	WIFAKapplicationObj.chargesDetailsCheckFacApproval().click();
    }

    @And("^User click the Ok button$")
    public void user_click_the_ok_button() throws Throwable {
    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsOkBtn());
    	WIFAKapplicationObj.chargesDetailsOkBtn().click();
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
//    	Thread.sleep(5000);
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
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonConfirmOk());
    	WIFAKapplicationObj.ButtonConfirmOk().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonSuccessOk());
    	WIFAKapplicationObj.ButtonSuccessOk().click();
    }

    @And("^User clicks the validate button$")
    public void user_clicks_the_validate_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsValidateBtn());
    	WIFAKapplicationObj.limitDetailsValidateBtn().click();
    	
    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonConfirmOk());
    	WIFAKapplicationObj.ButtonConfirmOk().click();
    	
    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityAlreadyCreatedPopup());
		WIFAKapplicationObj.facilityAlreadyCreatedPopup().click();
		
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.ButtonSuccessOk(),
						WIFAKapplicationObj.ButtonSuccessOk());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		
//		Thread.sleep(5000);
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonSuccessOk());
//		WIFAKapplicationObj.ButtonSuccessOk().click();

    }

    @And("^User clicks the Approve Level1 link$")
    public void user_clicks_the_approve_level1_link() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1());
    	WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1().click();  	
    }
    
    @And("^User retrive the first data in approve level1$")
    public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1ClearBtn());
    	WIFAKapplicationObj.approve1ClearBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1RetriveData());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel1RetriveData());
    }

    @And("^User select the level1 devision as approve$")
    public void user_select_the_level1_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1SelectDevision());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), "Approve");
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), testData.get("Decision1"));
    }

    @And("^User clicks on the level1 submit button$")
    public void user_clicks_on_the_level1_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1SubmitBtn());
    	WIFAKapplicationObj.approveLevel1SubmitBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonConfirmOk());
    	WIFAKapplicationObj.ButtonConfirmOk().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonSuccessOk());
    	WIFAKapplicationObj.ButtonSuccessOk().click();
    	
    }

    @And("^User clicks the Approve Level2 link$")
    public void user_clicks_the_approve_level2_link() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApproveLevel2());
    	WIFAKapplicationObj.applicationFinancialFacilityApproveLevel2().click();
    }
    
    @And("^User retrive the first data in approve level2$")
    public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve2ClearBtn());
    	WIFAKapplicationObj.approve2ClearBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2RetriveData());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel2RetriveData());
    }

    @And("^User select the level2 devision as approve$")
    public void user_select_the_level2_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2SelectDevision());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel2SelectDevision(), "Approve");
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel2SelectDevision(), testData.get("Decision2"));
    }

    @And("^User clicks on the level2 submit button$")
    public void user_clicks_on_the_level2_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2SubmitBtn());
    	WIFAKapplicationObj.approveLevel2SubmitBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonConfirmOk());
    	WIFAKapplicationObj.ButtonConfirmOk().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonSuccessOk());
    	WIFAKapplicationObj.ButtonSuccessOk().click();
    }

    @And("^User clicks the Approve Level3 link$")
    public void user_clicks_the_approve_level3_link() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilityApproveLevel3());
    	WIFAKapplicationObj.applicationFinancialFacilityApproveLevel3().click();
    }
    
    @And("^User retrive the first data in approve level3$")
    public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve3ClearBtn());
    	WIFAKapplicationObj.approve3ClearBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3RetriveData());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel3RetriveData());
    }
    
    @And("^User select the level3 devision as approve$")
    public void user_select_the_level3_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3SelectDevision());
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel3SelectDevision(), "Approve");
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel3SelectDevision(), testData.get("Decision3"));
    
    }
    
    @When("^User clicks on the level3 submit button$")
    public void user_clicks_on_the_level3_submit_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3SubmitBtn());
    	WIFAKapplicationObj.approveLevel3SubmitBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonConfirmOk());
    	WIFAKapplicationObj.ButtonConfirmOk().click();
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonSuccessOk());
    	WIFAKapplicationObj.ButtonSuccessOk().click();
    }
    
    
    // @294466
    @And("^User clicks on the clear button$")
    public void user_clicks_on_the_clear_button() throws Throwable {
//        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clearBtn());
//        WIFAKapplicationObj.clearBtn().click();
        
        for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.clearBtn(),
						WIFAKapplicationObj.clearBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^User double clicks on the first row of approve level1$")
    public void user_double_clicks_on_the_first_row_of_approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.searchedData());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.searchedData());
    }

    @And("^User move to additional details tab$")
    public void user_move_to_additional_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTab());
    	WIFAKapplicationObj.mainAdditionalTab().click();
    }
    
    @When("^User clicks on the BM Recommendations button$")
    public void user_clicks_on_the_bm_recommendations_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.additionalDetailsBMRecommedBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	WIFAKapplicationObj.additionalDetailsBMRecommedBtn().click();
    }

    @Then("^User validate the BM Recommendations tab is editable or not$")
    public void user_validate_the_bm_recommendations_tab_is_editable_or_not() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.BMRecommedTab());
    	String readOnly = WIFAKapplicationObj.BMRecommedTab().getAttribute("readonly");
    	Assert.assertNull(readOnly);
    }



}
