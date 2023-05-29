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
	
	String refID;
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
//	ExcelData excecutionExcelData = new ExcelData(path,"TestExecution","TestCaseID");
//	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"IIS_Param_TestData","DataSet ID");
	Map<String, String> testData;
//	Map<String, String> executionTestData;
	
//	843959
	@And("^get the test data for test case 843959$")
    public void get_the_test_data_for_test_case_843959() throws Throwable {
//		executionTestData = excecutionExcelData.getTestdata("843959");
		testData = fmsTransactionsExcelData.getTestdata("DS01_843959");
    }
	
//	296063
	@And("^get the test data for test case 296063$")
    public void get_the_test_data_for_test_case_296063() throws Throwable {
		fmsTransactionsExcelData.getTestdata("DS01_296063");
    }
	
//  @834966_FMS_Core
	@And("^get the test data for test case 834966_FMS_Core$")
	public void get_the_test_data_for_test_case_834966fmscore() throws Throwable {
		testData = fmsTransactionsExcelData.getTestdata("DS01_834966");
	}
	
//  @681303_FMSCore    
    @And("^get the test data for test case 681303_FMSCore$")
    public void get_the_test_data_for_test_case_681303fmscore() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS01_681303");
    }
	
//  @665923_FMSCore
    @And("^get the test data for test case 665923_FMSCore$")
    public void get_the_test_data_for_test_case_665923fmscore() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS01_665923");
    }
    
//  @640861
    @And("^get the test data for test case 640861$")
    public void get_the_test_data_for_test_case_640861() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS01_640861");
    }
    
//  @583893_User1
    @And("^get the test data for test case 583893_User1$")
    public void get_the_test_data_for_test_case_583893user1() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS01_583893_1");
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
	}

	@And("^User clicks on the additional details tab$")
	public void user_clicks_on_the_additinal_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTab());
		WIFAKapplicationObj.mainAdditionalTab().click();
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
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabExpireCalender());
		WIFAKapplicationObj.additionalTabExpireCalender().click();
		
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabExpireDate());
		WIFAKapplicationObj.additionalTabExpireDate().click();
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
	
	
//	 @296063
	@And("^User enter the product class details$")
    public void user_enter_the_product_class_details() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordProductClass());
//        WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys("1");
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
    	Thread.sleep(3000);
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
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsChargesDetailsBtn());
    	WIFAKapplicationObj.limitDetailsChargesDetailsBtn().click();
    }

//    @And("^User clicks the add new record button$")
//    public void user_clicks_the_add_new_record_button() throws Throwable {
////    	for (int i = 0; i <= 300; i++) {
////			try {
////				javaScriptHelper.scrollIntoView(WIFAKapplicationObj.chargesDetailsAddNewBtn());
////				break;
////			} catch (Exception e) {
////				if (i == 300) {
////					Assert.fail(e.getMessage());
////				}
////			}
////    	}
//    	
//    	for (int i = 0; i <= 300; i++) {
//			try {
//				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.chargesDetailsAddNewBtn(),
//						WIFAKapplicationObj.chargesDetailsAddNewBtn());
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}    	
//    	
//    }

    @And("^User enter the code and check the collect at facility approval$")
    public void user_enter_the_code_and_check_the_collect_at_facility_approval() throws Throwable {
//    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargeDetailsFirstRow());
    	WIFAKapplicationObj.chargesDetailsCodeLabel().click();
//    	WIFAKapplicationObj.chargesDetailsCode().sendKeys("1");
//    	WIFAKapplicationObj.chargesDetailsCode().sendKeys(Keys.TAB);
//    	WIFAKapplicationObj.chargesDetailsCode().sendKeys(testData.get("Charges Details Code"));
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsCheckFacApproval());
    	WIFAKapplicationObj.chargesDetailsCheckFacApproval().click();	
    }

    @And("^User click the Ok button$")
    public void user_click_the_ok_button() throws Throwable {
    	Thread.sleep(3000);
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsOkBtn());
    	WIFAKapplicationObj.chargesDetailsOkBtn().click();
    }

    @And("^User move to the Document details tab$")
    public void user_move_to_the_document_details_tab() throws Throwable {
    	Thread.sleep(3000);
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
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonConfirmOk());
    	WIFAKapplicationObj.ButtonConfirmOk().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonSuccessOk());
    	WIFAKapplicationObj.ButtonSuccessOk().click();
    }

    @And("^User clicks the validate button$")
    public void user_clicks_the_validate_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsValidateBtn());
    	WIFAKapplicationObj.limitDetailsValidateBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonConfirmOk());
    	WIFAKapplicationObj.ButtonConfirmOk().click();
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.facilityAlreadyCreatedPopup().click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.successMessage());
    	String SuccessMsg = WIFAKapplicationObj.successMessage().getText();
    	refID = SuccessMsg.substring(23, 27);
    	System.err.println("Reference Number: "+refID);
    	
    	for (int i = 0; i < 2000; i++) {
			try {
		    	WIFAKapplicationObj.ButtonSuccessOk().click();
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
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1ClearBtn());
    	WIFAKapplicationObj.approve1ClearBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1RetriveData());
    	clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel1RetriveData());
    }

    @And("^User select the level1 devision as approve$")
    public void user_select_the_level1_decision_as_approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1SelectDevision());
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), "Approve");
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), testData.get("Decision1"));
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
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel2SelectDevision(), "Approve");
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel2SelectDevision(), testData.get("Decision2"));
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
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel3SelectDevision(), "Approve");
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel3SelectDevision(), testData.get("Decision3"));
    
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

    
//  @640861
    @And("^User enter the down payment percentage in additional info tab$")
    public void user_enter_the_down_payment_percentage_in_additional_info_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabDownPayPercent());
    	WIFAKapplicationObj.additionalTabDownPayPercent().sendKeys(testData.get("Down Payment %"));
    	WIFAKapplicationObj.additionalTabDownPayPercent().sendKeys(Keys.TAB);
    }

    @And("^User enter the down payment to vendor percentage in additional info tab$")
    public void user_enter_the_down_payment_to_vendor_percentage_in_additional_info_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabDownPayToVendor());
    	WIFAKapplicationObj.additionalTabDownPayToVendor().sendKeys(testData.get("Down Payment to Vendor %"));
    	WIFAKapplicationObj.additionalTabDownPayToVendor().sendKeys(Keys.TAB);
    }
    
    @Then("^User validate the visibility of Account No input box in limit details$")
    public void user_validate_the_visibility_of_account_no_input_box_in_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsAccNoInput());
    	boolean accNoDisplayed = WIFAKapplicationObj.limitDetailsAccNoInput().isDisplayed();
    	Assert.assertEquals(true, accNoDisplayed);
    }

    @Then("^User validate the visibility of Fund Transfer rate input box in limit details$")
    public void user_validate_the_visibility_of_fund_transfer_rate_input_box_in_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsFundTransferRateInput());
    	boolean fundtransferdisplayed = WIFAKapplicationObj.limitDetailsFundTransferRateInput().isDisplayed();
    	Assert.assertEquals(true, fundtransferdisplayed);
    }
    
    
//  @583893_User1
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
		
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonConfirmOk());
    	WIFAKapplicationObj.ButtonConfirmOk().click();
    	
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
//    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approvalCommitteeRecommendationDropdown(), testData.get("Recommendation"));
    	dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approvalCommitteeRecommendationDropdown(), "Approve");
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
//    	WIFAKapplicationObj.approvalCommitteeMoreCommentsInput().sendKeys(testData.get("More Comments"));
    	WIFAKapplicationObj.approvalCommitteeMoreCommentsInput().sendKeys("Test Comments");
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
    	
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonSuccessOk());
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.successMessage());
    	String SuccessMsg = WIFAKapplicationObj.successMessage().getText();
    	refID = SuccessMsg.substring(23, 27);
    	System.err.println("Reference Number: "+refID);
    	
    	WIFAKapplicationObj.ButtonSuccessOk().click();
    }

    
//  @583893_User2
    @And("^User clicks on the search button in Application for financial facility main screen$")
    public void user_clicks_on_the_search_button_in_application_for_financial_facility_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchBtn());
    	WIFAKapplicationObj.applicationFinancialFacilitySearchBtn().click();
    }

    @And("^User search the code in Application for financial facility main screen$")
    public void user_search_the_code_in_application_for_financial_facility_main_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchCode());
    	WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys("3691");
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
    }


}
