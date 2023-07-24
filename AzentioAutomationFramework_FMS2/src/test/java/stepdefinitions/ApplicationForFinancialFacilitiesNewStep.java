package stepdefinitions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import pageobjects.ApplicationForFinancialFacilitiesNewObj;
import resources.BaseClass;

public class ApplicationForFinancialFacilitiesNewStep {
	WebDriver driver = BaseClass.driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	ConfigFileReader configFileReader = new ConfigFileReader();
	ApplicationForFinancialFacilitiesNewObj WIFAKapplicationObj = new ApplicationForFinancialFacilitiesNewObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData csmTransactionsExcelData = new ExcelData(path,"ApplicationForFinancialFaciliti","DatasetID");
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
		waitHelper.waitForElementwithFluentwait(driver,
				WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1());
		WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1().click();
	}

	@And("^User search the code$")
	public void user_search_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.applicationFinancialFacilitySearchCode());
//		WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys(testData.get("Search Code"));
		WIFAKapplicationObj.applicationFinancialFacilitySearchCode().sendKeys("3451");
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
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainApplicationForDropdown());
//		WIFAKapplicationObj.mainApplicationForDropdown().click();
//		WIFAKapplicationObj.mainApplicationForDropdown().sendKeys(testData.get("ApplicationFor"));
		
		
		selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainApplicationForDropdown());
		WIFAKapplicationObj.mainApplicationForDropdown().click();
		WIFAKapplicationObj.mainApplicationForDropdown().sendKeys(testData.get("ApplicationFor"));
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainApplicationForDropdown());
//		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.mainApplicationForDropdown(), "New Facility");
	}

	@And("^User enter the CIF No in main info tab$")
	public void user_enter_the_cif_no_in_main_info_tab() throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				WIFAKapplicationObj.mainCIFNo().click();
				WIFAKapplicationObj.mainCIFNo().sendKeys(testData.get("CIFNO"));
				WIFAKapplicationObj.cifTouch().click();
				//String attribute = WIFAKapplicationObj.mainCIFNo().getAttribute("prevvalue");
				//System.out.println(attribute);
				if (WIFAKapplicationObj.mainCIFNo().getAttribute("prevvalue").equalsIgnoreCase("00000"+testData.get("CIFNO"))) {
					break;
				}
				
				
				
				
			} catch (Exception e) {
				//String attribute = WIFAKapplicationObj.mainCIFNo().getAttribute("prevvalue");
				//System.out.println(attribute);
				for (int j = 0; j <60; j++) {
					if (WIFAKapplicationObj.mainCIFNo().getAttribute("prevvalue").equalsIgnoreCase("00000"+testData.get("CIFNO"))) {
						break;
					}
				}
				
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.cifTouch());
		
	}

	@And("^User enter the facility type in main info tab$")
	public void user_enter_the_facility_type_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainFacilityType());
		WIFAKapplicationObj.mainFacilityType().sendKeys(testData.get("FacilityType"));
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityTouch());
		WIFAKapplicationObj.facilityTouch().click();
	}

	@And("^User enter the country of financing in main info tab$")
	public void user_enter_the_country_of_financing_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainCountryOfFinancing());
		WIFAKapplicationObj.mainCountryOfFinancing().sendKeys(testData.get("CountryOfFinancing"));
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.facilityTouch());
		WIFAKapplicationObj.facilityTouch().click();
	}

	@And("^User enter the facility rating in main info tab$")
	public void user_enter_the_facility_rating_in_main_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainFacilityRating());
		clicksAndActionsHelper.moveToElement(WIFAKapplicationObj.mainFacilityRating());
		WIFAKapplicationObj.mainFacilityRating().sendKeys(testData.get("FacilityRating"));
		WIFAKapplicationObj.facilityTouch().click();
//		for(int i = 0; i<=300;i++)
//		{
//			if(!(WIFAKapplicationObj.mainFacilityRating().getAttribute("prevalue").isBlank())) {
//				break;
//			}
//	}
	}	

	@And("^User clicks on the additinal details tab$")
	public void user_clicks_on_the_additinal_details_tab() throws Throwable {
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTab());
		WIFAKapplicationObj.mainAdditionalTab().click();
	}

	@And("^User enter the total value in additional info tab$")
	public void user_enter_the_total_value_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.mainAdditionalTabTotalValue());
		WIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(testData.get("TotalValue"));
		WIFAKapplicationObj.mainAdditionalTabScreen().click();
	}

	@And("^User enter the expire date in additional info tab$")
	public void user_enter_the_expire_date_in_additional_info_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabExpireDate());
		WIFAKapplicationObj.additionalTabExpireDate().click();
		WIFAKapplicationObj.additionalTabExpireDate().sendKeys(testData.get("OfferExpirationDate"));
		for (int i = 0; i <= 300; i++) {
		if (!(WIFAKapplicationObj.additionalTabExpireDate().getAttribute("prevvalue").isBlank())) {
		break;
		}
		}
		
	}
		
//		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.additionalTabExpireDate());
//		WIFAKapplicationObj.additionalTabExpireDate().click();
//		WIFAKapplicationObj.additionalTabExpireDate().sendKeys("31/5/2023");
//		Thread.sleep(2000);
//		WIFAKapplicationObj.mainAdditionalTabScreen().click();
	

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
		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(testData.get("ApplicationFor"));
		WIFAKapplicationObj.limitDetailsNewRecordScreenTouch().click();
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
		String floatingRate = WIFAKapplicationObj.limitDetailsFloatingRate().getText();
		Assert.assertEquals("1", floatingRate);

	}

	// @296063
	@And("^User enter the product class details$")
	public void user_enter_the_product_class_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsNewRecordProductClass());
		WIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(testData.get("ProductClassDetails"));

		WIFAKapplicationObj.limitDetailsNewRecordScreenTouch();
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
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clickAddBtn());
		WIFAKapplicationObj.clickAddBtn().click();
		try{
			waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ServerRequestNotComplete_OKButton());
			WIFAKapplicationObj.ServerRequestNotComplete_OKButton().click();
			waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clickAddBtn());
			WIFAKapplicationObj.clickAddBtn().click();
		}catch (Exception e){
			
		}
		
		
	}

	@And("^User clicks on the Charges details button$")
	public void user_clicks_on_the_charges_details_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.limitDetailsChargesDetailsBtn());
		WIFAKapplicationObj.limitDetailsChargesDetailsBtn();
	}

	@And("^User clicks the add new record button$")
	public void user_clicks_the_add_new_record_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsAddNewBtn());
		WIFAKapplicationObj.chargesDetailsAddNewBtn().click();
	}

	@And("^User enter the code and check the collect at facility approval$")
	public void user_enter_the_code_and_check_the_collect_at_facility_approval() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsCodeLabel());
		WIFAKapplicationObj.chargesDetailsCodeLabel().click();

		WIFAKapplicationObj.chargesDetailsCode().sendKeys("1");
		WIFAKapplicationObj.chargesDetailsCheckFacApproval().click();
	}

	@And("^User click the Ok button$")
	public void user_click_the_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.chargesDetailsOkBtn());
		WIFAKapplicationObj.chargesDetailsOkBtn().click();
	}

	@And("^User move to the Document details tab$")
	public void user_move_to_the_document_details_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(WIFAKapplicationObj.mainDocumentDetailsTab(),
						WIFAKapplicationObj.mainDocumentDetailsTab());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User enter the Solicitor Name$")
	public void user_enter_the_solicitor_name() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.documentDetailsSolicitorName());
		WIFAKapplicationObj.documentDetailsSolicitorName().click();
		WIFAKapplicationObj.documentDetailsSolicitorName().sendKeys(testData.get("SolicitorName"));;
		WIFAKapplicationObj.SolicitorEstimatorHeader().click();
		//WIFAKapplicationObj.documentDetailsSolicitorName().sendKeys(Keys.ENTER);
		//clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.documentDetailsSolicitorName());
	}

	@And("^User enter the Estimator Name$")
	public void user_enter_the_estimator_name() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.documentDetailsEstimatorName());
		WIFAKapplicationObj.documentDetailsEstimatorName().click();
		WIFAKapplicationObj.documentDetailsEstimatorName().sendKeys(testData.get("EstimatorName"));;
		WIFAKapplicationObj.SolicitorEstimatorHeader().click();
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
		
		try{
			waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.FacilityAlreadyExistPopup());
			WIFAKapplicationObj.FacilityAlreadyExistPopup().click();
		}catch (Exception e){
		}

		for(int i=0;i<100;i++)
		{
			try {
				waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.ButtonSuccessOk());
				WIFAKapplicationObj.ButtonSuccessOk().click();
				break;
			}catch(Exception e) {
				if(i==100) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
		
	}

	@And("^User clicks the Approve Level1 link$")
	public void user_clicks_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1());
		WIFAKapplicationObj.applicationFinancialFacilityApproveLevel1().click();
	}

	@And("^User retrive the first data in approve level1$")
	public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve1ClearBtn());
		WIFAKapplicationObj.approve1ClearBtn();

		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1RetriveData());
		clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel1RetriveData());
	}

	@And("^User select the level1 devision as approve$")
	public void user_select_the_level1_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1SelectDevision());
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel1SelectDevision(), "Approve");
	}

	@And("^User clicks on the level1 submit button$")
	public void user_clicks_on_the_level1_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel1SubmitBtn());
		WIFAKapplicationObj.approveLevel1SubmitBtn().click();
	}

	@And("^User clicks the Approve Level2 link$")
	public void user_clicks_the_approve_level2_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				WIFAKapplicationObj.applicationFinancialFacilityApproveLevel2());
		WIFAKapplicationObj.applicationFinancialFacilityApproveLevel2().click();
	}

	@And("^User retrive the first data in approve level2$")
	public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve2ClearBtn());
		WIFAKapplicationObj.approve2ClearBtn();

		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2RetriveData());
		clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel2RetriveData());
	}

	@And("^User select the level2 devision as approve$")
	public void user_select_the_level2_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2SelectDevision());
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel2SelectDevision(), "Approve");
	}

	@And("^User clicks on the level2 submit button$")
	public void user_clicks_on_the_level2_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel2SubmitBtn());
		WIFAKapplicationObj.approveLevel2SubmitBtn();
	}

	@And("^User clicks the Approve Level3 link$")
	public void user_clicks_the_approve_level3_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				WIFAKapplicationObj.applicationFinancialFacilityApproveLevel3());
		WIFAKapplicationObj.applicationFinancialFacilityApproveLevel3();
	}

	@And("^User retrive the first data in approve level3$")
	public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approve3ClearBtn());
		WIFAKapplicationObj.approve3ClearBtn();

		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3RetriveData());
		clicksAndActionsHelper.doubleClick(WIFAKapplicationObj.approveLevel3RetriveData());
	}

	@And("^User select the level3 devision as approve$")
	public void user_select_the_level3_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3SelectDevision());
		dropDownHelper.SelectUsingVisibleText(WIFAKapplicationObj.approveLevel3SelectDevision(), "Approve");
	}

	@When("^User clicks on the level3 submit button$")
	public void user_clicks_on_the_level3_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.approveLevel3SubmitBtn());
		WIFAKapplicationObj.approveLevel3SubmitBtn().click();
	}

	// @294466
	@And("^User clicks on the clear button$")
	public void user_clicks_on_the_clear_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, WIFAKapplicationObj.clearBtn());
		WIFAKapplicationObj.clearBtn().click();
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
		Assert.assertNotNull(readOnly);
	}
	@And("^Update test data for test case no AT_AFF_003$")
    public void update_test_data_for_test_case_no_AT_AFF_003() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS_AT_AFF_003");
    }
	@Then("^User Validate the Facility Rating Field is Displayed as Required$")
    public void user_validate_the_facility_rating_field_is_displayed_as_required() throws Throwable {
		Thread.sleep(10000);
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsValidateTheFacilityRatingFieldisRequired());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsValidateTheFacilityRatingFieldisRequired());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsValidateTheFacilityRatingFieldisRequired());
    }

    @And("^User Click on WIFAK APPLICATION under FMS application$")
    public void user_click_on_wifak_application_under_fms_application() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsWifakApplicationMainMenu());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsWifakApplicationMainMenu());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsWifakApplicationMainMenu());
    }

    @And("^User Click on WIFAK APPLICATION under WIFAK APPLICATION Main Menu$")
    public void user_click_on_wifak_application_under_wifak_application_main_menu() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsWifakApplicationInWifakApplication());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsWifakApplicationInWifakApplication());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsWifakApplicationInWifakApplication());
    }

    @And("^User Click on Application For Financial Facilities under WIFAK APPLICATION Sub Menu$")
    public void user_click_on_application_for_financial_facilities_under_wifak_application_sub_menu() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu());
    }

    @And("^User Click on Maintenance under Application For Financial Facilities$")
    public void user_click_on_maintenance_under_application_for_financial_facilities() throws Throwable {
    	Thread.sleep(2000);
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsMaintenanceInApplicationForFinancialFacilities());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsMaintenanceInApplicationForFinancialFacilities());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsMaintenanceInApplicationForFinancialFacilities());
    }

    @And("^User Click on Advanced Options under Maintenance Screen$")
    public void user_click_on_advanced_options_under_maintenance_screen() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.mainFacilityRating());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsAdvancedOptionsInMaintenanceScreen());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsAdvancedOptionsInMaintenanceScreen());
    }

    @And("^User Click on Settings under Advanced Options in Maintenance Screen$")
    public void user_click_on_settings_under_advanced_options_in_maintenance_screen() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsSettingsInAdvancedOptions());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsSettingsInAdvancedOptions());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsSettingsInAdvancedOptions());
    }

    @And("^User Click on Icon in Facility Rating under Settings Screen$")
    public void user_click_on_icon_in_facility_rating_under_settings_screen() throws Throwable {
    	javaScriptHelper.scrollIntoView(WIFAKapplicationObj.fmsIconInFacilityRatingUnderSettings());
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsIconInFacilityRatingUnderSettings());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsIconInFacilityRatingUnderSettings());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsIconInFacilityRatingUnderSettings());
    }

    @And("^User Click on Maintenance in Icon under Settings Screen$")
    public void user_click_on_maintenance_in_icon_under_settings_screen() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsMaintenanceInIcon());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsMaintenanceInIcon());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsMaintenanceInIcon());
    }

    @And("^User Click on Required Field in Customization Details For Facility Rating PopUp Menu$")
    public void user_click_on_required_field_in_customization_details_for_facility_rating_popup_menu() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsRequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu());
    	for (int i=0;i<100;i++)
    	{
    		try {
    			selenium_Actions.getDropDownHelper().SelectUsingVisibleText(WIFAKapplicationObj.fmsRequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu(), "Required");
    			//selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsRequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu());
    			//selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsRequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu());
    			break;
    		}
    		catch (Exception e) {
    			if (i==100) {
    				Assert.fail(e.getMessage());
    			}
    		}
    	}
    	
		
    }

    @And("^User Select the Required Option in the Required Field under PopUp Menu$")
    public void user_select_the_required_option_in_the_required_field_under_popup_menu() throws Throwable {
//    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsSelectTheRequiredOptionInTheRequiredField());
//		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsSelectTheRequiredOptionInTheRequiredField());
//		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsSelectTheRequiredOptionInTheRequiredField());
   }

    @And("^User Select the Not Required Option in the Required Field under PopUp Menu$")
    public void user_select_the_not_required_option_in_the_required_field_under_popup_menu() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsSelectTheNotRequiredOptioInTheRequiredField());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsSelectTheNotRequiredOptioInTheRequiredField());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsSelectTheNotRequiredOptioInTheRequiredField());
    }

    @And("^User Click on Save Button under PopUp Menu$")
    public void user_click_on_save_button_under_popup_menu() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsSaveButtonInPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsSaveButtonInPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsSaveButtonInPopUpMenu());
    }

    @And("^User Click on Ok Button in Information PopUp Menu$")
    public void user_click_on_ok_button_in_information_popup_menu() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsOkButtonInInformationPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsOkButtonInInformationPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsOkButtonInInformationPopUpMenu());
    }

    @And("^User Click on Close Button under Customization Details For Facility Rating PopUp Menu$")
    public void user_click_on_close_button_under_customization_details_for_facility_rating_popup_menu() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsCloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsCloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsCloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu());
    }
    	

    @And("^User Click on Approve in Icon under Settings Screen$")
    public void user_click_on_approve_in_icon_under_settings_screen() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsApproveInIconUnderSettingsScreen());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsApproveInIconUnderSettingsScreen());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsApproveInIconUnderSettingsScreen());
    }

    @And("^User Click on Approve in Customization Details For Facility Rating PopUp Menu$")
    public void user_click_on_approve_in_customization_details_for_facility_rating_popup_menu() throws Throwable {
    	Thread.sleep(2000);
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsApproveInCustomizationDetailsForFacilityRatingPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsApproveInCustomizationDetailsForFacilityRatingPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsApproveInCustomizationDetailsForFacilityRatingPopUpMenu());
    }

    @And("^User Click on Ok Button in Warning PopUp Menu$")
    public void user_click_on_ok_button_in_warning_popup_menu() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver,WIFAKapplicationObj.fmsOkButtonInWarningPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().moveToElement(WIFAKapplicationObj.fmsOkButtonInWarningPopUpMenu());
		selenium_Actions.getClickAndActionsHelper().clickOnElement(WIFAKapplicationObj.fmsOkButtonInWarningPopUpMenu());
    }
    @And("^Validate Marketed by field is displayed in Facility type details section$")
    public void validate_marketed_by_field_is_displayed_in_facility_type_details_section() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementwithFluentwait(driver, WIFAKapplicationObj.FMS_MarketedByField());
    	Assert.assertTrue(WIFAKapplicationObj.FMS_MarketedByField().isDisplayed());
    }
    
    
}
