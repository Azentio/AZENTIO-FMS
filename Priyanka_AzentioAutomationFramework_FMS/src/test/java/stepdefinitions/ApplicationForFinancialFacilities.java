package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationForFinancialFacilitiesObj;
import resources.BaseClass;

public class ApplicationForFinancialFacilities extends BaseClass{
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	ApplicationForFinancialFacilitiesObj wIFAKapplicationObj = new ApplicationForFinancialFacilitiesObj(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(TestDataPath, "ApplicationForFinancialFaciliti", "DatasetID");
	Map<String, String> testData = new HashMap<>();
	
	@And("^Update test data for test case no AT_SL_015$")
    public void update_test_data_for_test_case_no_AT_SL_015() {
	testData = excelData.getTestdata("AT_SL_015_D1");
	}
	
	@And("^Update test data for test case no AT_SL_016$")
    public void update_test_data_for_test_case_no_AT_SL_016() {
	testData = excelData.getTestdata("AT_SL_016_D1");
	}
	
	@And("^Update test data for test case no AT_SL_017$")
    public void update_test_data_for_test_case_no_AT_SL_017() {
	testData = excelData.getTestdata("AT_SL_017_D1");
	}
	@And("^Update test data for test case no AT_SL_019$")
    public void update_test_data_for_test_case_no_AT_SL_019() {
	testData = excelData.getTestdata("AT_SL_019_D1");
	}
	@And("^Update test data for test case no AT_SL_020$")
    public void update_test_data_for_test_case_no_AT_SL_020() {
	testData = excelData.getTestdata("AT_SL_020_D1");
	}
	@And("^Update test data for test case no 668484$")
    public void update_test_data_for_test_case_no_668484() {
	testData = excelData.getTestdata("668484_D1");
	     
    }
	
	
	@And("^Update test data for test case no 671118$")
    public void update_test_data_for_test_case_no_671118() {
	testData = excelData.getTestdata("671118_D1");
	     
    }
 
	@And("^Update test data for test case no 670424$")
    public void update_test_data_for_test_case_no_670424() {
	testData = excelData.getTestdata("670424_D1");
	     
    }
	@And("^Update test data for test case no AT_RF_134$")
    public void update_test_data_for_test_case_no_AT_RF_134() {
	testData = excelData.getTestdata("AT_RF_134_D1");
	     
    }
    @And("^Update test data for test case no AT_RF_12 for maturity date$")
    public void update_test_data_for_test_case_no_AT_RF_12_for_maturity_date() {
	testData = excelData.getTestdata("AT_RF_12_D1");
	     
    }
    
//    
//    @And("^Update test data for test case no 671118$")
//    public void update_test_data_for_test_case_no_671118() {
//	testData = excelData.getTestdata("671118_D1");
//	     
//    }
    @Then("^User click on the WIFAK_Application first tab$")
    public void user_click_on_the_wifakapplication_first_tab() {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(wIFAKapplicationObj.wifakApplicationFirst());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	   wIFAKapplicationObj.wifakApplicationFirst().click();  
    }

    @Then("^User click on the WIFAK_Application second tab$")
    public void user_click_on_the_wifakapplication_second_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.wifakApplicationSecond());
    	wIFAKapplicationObj.wifakApplicationSecond().click();  
    	
    }

    @Then("^User navigate to the Application for financial facility$")
    public void user_navigate_to_the_application_for_financial_facility() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.applicationFinancialFacility());
		wIFAKapplicationObj.applicationFinancialFacility().click();   
    }

    @Then("^User clicks the maintanance menu under Application for financial facility$")
    public void user_clicks_the_maintanance_menu_under_application_for_financial_facility() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.appFinancialFacilityMaintanance());
		wIFAKapplicationObj.appFinancialFacilityMaintanance().click();  
    }

    @Then("^select the application for dropdown as new facility$")
    public void select_the_application_for_dropdown_as_new_facility() {
    	 waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainApplicationForDropdown());
		 dropDownHelper.SelectUsingVisibleText(wIFAKapplicationObj.mainApplicationForDropdown(),testData.get("ApplicationFor"));
		   
    }

    @Then("^In main info tab enter the CIF No$")
    public void in_main_info_tab_enter_the_cif_no() {
    	for (int i = 0; i <200; i++) {
			try {
				wIFAKapplicationObj.mainCIFNo().click();
				wIFAKapplicationObj.mainCIFNo().sendKeys(testData.get("CIFNO"));
				wIFAKapplicationObj.cifTouch().click();
				//String attribute = wIFAKapplicationObj.mainCIFNo().getAttribute("prevvalue");
				//System.out.println(attribute);
//				if (wIFAKapplicationObj.mainCIFNo().getAttribute("prevvalue").equalsIgnoreCase("00000"+testData.get("CIFNO"))) {
					break;
//				}
				
				
				
				
			} catch (Exception e) {
				for (int j = 0; j <60; j++) {
					if (wIFAKapplicationObj.mainCIFNo().getAttribute("prevvalue").equalsIgnoreCase("00000"+testData.get("CIFNO"))) {
						break;
					}
				}
				
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	
  
    }

    @Then("^In main info tab enter the facility type$")
    public void in_main_info_tab_enter_the_facility_type() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainFacilityType());
		wIFAKapplicationObj.mainFacilityType().sendKeys(testData.get("FacilityType"));
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.facilityTouch());
		wIFAKapplicationObj.facilityTouch().click();
    }

    @Then("^In main info tab enter the country of financing$")
    public void in_main_info_tab_enter_the_country_of_financing() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainCountryOfFinancing());
		wIFAKapplicationObj.mainCountryOfFinancing().sendKeys(testData.get("CountryOfFinancing"));
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.facilityTouch());
		wIFAKapplicationObj.facilityTouch().click();  
    }

    @Then("^In main info tab enter the facility rating$")
    public void in_main_info_tab_enter_the_facility_rating() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainFacilityRating());
    	clicksAndActionHelper.moveToElement(wIFAKapplicationObj.mainFacilityRating());
		wIFAKapplicationObj.mainFacilityRating().sendKeys(testData.get("FacilityRating"));
		wIFAKapplicationObj.facilityTouch().click();
    }

    @Then("^click on the additinal details tab$")
    public void click_on_the_additinal_details_tab() throws InterruptedException   {
    	Thread.sleep(2000);
    	for (int i = 0; i <200; i++) {
			try {
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainAdditionalTab());
		wIFAKapplicationObj.mainAdditionalTab().click(); 
			break;}
			catch(Exception e) {}
    	}
    }

    @Then("^In additional info tab enter the total value$")
    public void in_additional_info_tab_enter_the_total_value() {
    	
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainAdditionalTabTotalValue());
		wIFAKapplicationObj.mainAdditionalTabTotalValue().sendKeys(testData.get("TotalValue"));
		wIFAKapplicationObj.mainAdditionalTabScreen().click();
		
    }
   
    
    @Then("^In additional info tab enter the Down Payment$")
    public void in_additional_info_tab_enter_the_down_payment() {
    	
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainAdditionalTabDownPayment());
    	wIFAKapplicationObj.mainAdditionalTabDownPayment().isDisplayed();
		wIFAKapplicationObj.mainAdditionalTabDownPayment().sendKeys(testData.get("Down Payment"));
		wIFAKapplicationObj.mainAdditionalTabScreen().click();
		
    }
    
    @Then("^In additional info tab enter the Down Payment to vendor$")
    public void in_additional_info_tab_enter_the_down_payment_to_vendor() {
    	
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainAdditionalTabDownPaymentToVendor());
    	wIFAKapplicationObj.mainAdditionalTabDownPaymentToVendor().isDisplayed();
    	wIFAKapplicationObj.mainAdditionalTabDownPaymentToVendor().sendKeys(testData.get("Down Payment to vendor"));
		wIFAKapplicationObj.mainAdditionalTabScreen().click();
		
    }
    
    @Then("^In additional info tab validate cv value$")
    public void in_additional_info_tab_validate_cv_value() {
    	
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.main_additional_tab_CV_Value());
    	wIFAKapplicationObj.main_additional_tab_CV_Value().isDisplayed();
		String cvValue = wIFAKapplicationObj.main_additional_tab_CV_Value().getText();	
		cvValue.equals(testData.get("CV Value"));
		
    }
    
    @Then("^validate the fields Down Payment and Down Payment to vendor$")
    public void validate_the_fields_down_payment_and_down_payment_to_vendor() {
    	
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.main_LimitDetails_tab_FACILITY_VALUE());
    	wIFAKapplicationObj.main_LimitDetails_tab_FACILITY_VALUE().isDisplayed();
    	
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.main_LimitDetails_tab_DOWN_PAYMENT_PERCENTAGE());
    	wIFAKapplicationObj.main_LimitDetails_tab_DOWN_PAYMENT_PERCENTAGE().isDisplayed();
    	
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.main_LimitDetails_tab_DownPaymentToVendorPerc());
    	wIFAKapplicationObj.main_LimitDetails_tab_DownPaymentToVendorPerc().isDisplayed();
		
    }
    @Then("^In additional info tab enter the expire date$")
    public void in_additional_info_tab_enter_the_expire_date() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.additionalTabExpireDate());
		wIFAKapplicationObj.additionalTabExpireDate().click();
		wIFAKapplicationObj.additionalTabExpireDate().sendKeys(testData.get("OfferExpirationDate"));
		wIFAKapplicationObj.additionalTabExpireDate().sendKeys(Keys.ENTER);
//		for (int i = 0; i <= 300; i++) {
//		if (!(wIFAKapplicationObj.additionalTabExpireDate().getAttribute("prevvalue").isBlank())) {
//		break;
//		}
//		}

    }

    @Then("^click on the limit details tab$")
    public void click_on_the_limit_details_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.mainLimitDetailsTab());
		wIFAKapplicationObj.mainLimitDetailsTab().click();
	  
    }

    @Then("^In limit details tab click on the add new record button$")
    public void in_limit_details_tab_click_on_the_add_new_record_button() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.limitDetailsTabAddNewRecordBtn());
		wIFAKapplicationObj.limitDetailsTabAddNewRecordBtn().click();
	
    }
    @Then("^enter item details for Import LC$")
    public void enter_item_details_for_import_lc()   {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.limitDetailsNewRecordItem());
		dropDownHelper.SelectUsingVisibleText(wIFAKapplicationObj.limitDetailsNewRecordItem(), testData.get("Item1"));
	
    }

    @Then("^enter the Type$")
    public void enter_the_type()   {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.limitDetailsNewRecordType());
		wIFAKapplicationObj.limitDetailsNewRecordType().sendKeys(testData.get("Type"));
		wIFAKapplicationObj.limitDetailsNewRecordType().click();
	  
    }

    @Then("^enter the maturity date$")
    public void enter_the_maturity_date()   {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.limitDetailsNewRecordMaturityDate());
		wIFAKapplicationObj.limitDetailsNewRecordMaturityDate().sendKeys(testData.get("MaturityDate"));
		wIFAKapplicationObj.limitDetailsNewRecordMaturityDate().click();
	     }

    @Then("^click on the clean flag$")
    public void click_on_the_clean_flag()   {
    	
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(wIFAKapplicationObj.limitDetailsNewRecordCleanFlag());
				clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.limitDetailsNewRecordCleanFlag());
				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		} 

}


    @Then("^enter the product class details$")
    public void enter_the_product_class_details() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.limitDetailsNewRecordProductClass());
		wIFAKapplicationObj.limitDetailsNewRecordProductClass().sendKeys(testData.get("ProductClass"));
		wIFAKapplicationObj.limitDetailsNewRecordScreenTouch().click();
	  
    }

    @Then("^enter eco sector code$")
    public void enter_eco_sector_code() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.limitDetailsNewRecordEcoSector());
		wIFAKapplicationObj.limitDetailsNewRecordEcoSector().sendKeys(testData.get("2322"));
		wIFAKapplicationObj.limitDetailsNewRecordEcoSector().sendKeys(Keys.ENTER);
	  	
    }
    @Then("^click on the add button$")
    public void click_on_the_add_button() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.clickAddBtn());
		wIFAKapplicationObj.clickAddBtn().click();
		try{
			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.ServerRequestNotComplete_OKButton());
			wIFAKapplicationObj.ServerRequestNotComplete_OKButton().click();
			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.clickAddBtn());
			wIFAKapplicationObj.clickAddBtn().click();
			
		}catch (Exception e){
			
		}
		
	 
    }
   
    @Then("^click on the Collateral details tab$")
    public void click_on_the_collateral_details_tab() {
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Collateral_details_tab());
				clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Collateral_details_tab());
				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		} 
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Collateral_details_add());
				clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Collateral_details_add());
				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}  
    	
    }	
    @Then("^click on the Document details tab$")
    public void click_on_the_document_details_tab() {
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.clickUsingActionClass(wIFAKapplicationObj.mainDocumentDetailsTab(),
						wIFAKapplicationObj.mainDocumentDetailsTab());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}   
    }

    @Then("^enter the Solicitor Name$")
    public void enter_the_solicitor_name() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.documentDetailsSolicitorName());
		wIFAKapplicationObj.documentDetailsSolicitorName().click();
		wIFAKapplicationObj.documentDetailsSolicitorName().sendKeys(testData.get("SolicitorName"));;
		wIFAKapplicationObj.SolicitorEstimatorHeader().click();
		//wIFAKapplicationObj.documentDetailsSolicitorName().sendKeys(Keys.ENTER);
		//clicksAndActionsHelper.doubleClick(wIFAKapplicationObj.documentDetailsSolicitorName());
	 
    }

    @Then("^enter the Estimator Name$")
    public void enter_the_estimator_name() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.documentDetailsEstimatorName());
		wIFAKapplicationObj.documentDetailsEstimatorName().click();
		wIFAKapplicationObj.documentDetailsEstimatorName().sendKeys(testData.get("EstimatorName"));;
		wIFAKapplicationObj.SolicitorEstimatorHeader().click();
	 
    }

    @Then("^click on the save button$")
    public void click_on_the_save_button() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.limitDetailsSaveBtn());
		wIFAKapplicationObj.limitDetailsSaveBtn().click();
		
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.ButtonConfirmOk());
		wIFAKapplicationObj.ButtonConfirmOk().click();
		//div[contains(text(),'Application Facility : 3769 saved successfully')]
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.ButtonSuccessMessage());
        String msg=	wIFAKapplicationObj.ButtonSuccessMessage().getText();
        String applicationNumber=msg.substring(23, 27);
        System.out.println(applicationNumber);
        
        excelData.updateTestData("668484_D1", "Application Number", applicationNumber);
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.ButtonSuccessOk());
		wIFAKapplicationObj.ButtonSuccessOk().click();
	   
    }

    @Then("^click on the validate button$")
    public void click_on_the_validate_button() {
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.limitDetailsValidateBtn());
		wIFAKapplicationObj.limitDetailsValidateBtn().click();
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.ButtonConfirmOk());
		wIFAKapplicationObj.ButtonConfirmOk().click();
		
		try{
			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.FacilityAlreadyExistPopup());
			wIFAKapplicationObj.FacilityAlreadyExistPopup().click();
		}catch (Exception e){
		}

		for(int i=0;i<100;i++)
		{
			try {
				waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.ButtonSuccessOk());
				wIFAKapplicationObj.ButtonSuccessOk().click();
				break;
			}catch(Exception e) {
				if(i==100) {
					Assert.fail(e.getMessage());
				}
				
			}
		}}
    
    
    @Then("^move to the Approval level1$")
    public void move_to_the_approval_level1() throws InterruptedException   {
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Approval_Level1());
				clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Approval_Level1());
				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}  
    	
//    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Approval_Level1_Clear());
//		wIFAKapplicationObj.Approval_Level1_Clear().click();
//		Thread.sleep(2000);
//		
    }
    @Then("^retrieve the record of Application for financial facility$")
    public void retrieve_the_record_of_application_for_financial_facility() throws InterruptedException   {
    	
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Approval_Level1_Code());
		wIFAKapplicationObj.Approval_Level1_Code().click();
		wIFAKapplicationObj.Approval_Level1_Code().sendKeys(testData.get("Application Number"));
		wIFAKapplicationObj.Approval_Level1_Code().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Approval_Level1_FirstRecord());
		clicksAndActionHelper.doubleClick(wIFAKapplicationObj.Approval_Level1_FirstRecord());
		
		
		    }
    @Then("^add the decision and Approve the record$")
    public void add_the_decision_and_approve_the_record() throws InterruptedException   {
    	Thread.sleep(2000);
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Approval_Level1_Decision());
				clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Approval_Level1_Decision());
				wIFAKapplicationObj.Approval_Level1_Decision().sendKeys(testData.get("Decision"));
				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		} 
    	waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Approval_Level1_Submit());
		wIFAKapplicationObj.Approval_Level1_Submit().click();
	
		
		try{
			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Approval_Level1_Submit_confrim());
			wIFAKapplicationObj.Approval_Level1_Submit_confrim().click();
		}catch (Exception e){
		}

		for(int i=0;i<100;i++)
		{
			try {
				waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Approval_Level1_Submit_Success());
				wIFAKapplicationObj.Approval_Level1_Submit_Success().click();
				break;
			}catch(Exception e) {
				if(i==100) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
    	
    }
    @Then("^move to Facility Closure Request maintenance and save the record$")
    public void move_to_facility_closure_request_maintenance_and_save_the_record()   {
    	
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Facility_Closure_Request());
				clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Facility_Closure_Request());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		} 
    	
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Facility_Closure_Request_Maintenance());
		 wIFAKapplicationObj.Facility_Closure_Request_Maintenance().click();
		 
		 for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Facility_Closure_Request_FacilityReference());
					clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Facility_Closure_Request_FacilityReference());

					
					wIFAKapplicationObj.Facility_Closure_Request_FacilityReference().sendKeys(testData.get("Application Number"));
					wIFAKapplicationObj.Facility_Closure_Request_FacilityReference().sendKeys(Keys.ENTER);
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		 waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Facility_Closure_Request_Save());
		 wIFAKapplicationObj.Facility_Closure_Request_Save().click();
		 for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Facility_Closure_Request_SaveSuccessPopUp());
					
					//div[contains(text(),'Application Facility : 3769 saved successfully')]
					waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Facility_Closure_Request_SaveSuccessPopUp());
			        String msg=	wIFAKapplicationObj.Facility_Closure_Request_SaveSuccessPopUp().getText();
			        String facilityClosureCode=msg.substring(27, 28);
			        System.out.println("facilityClosureCode");
			        
			        excelData.updateTestData("671118_D1", "FacilityClosureCode", facilityClosureCode);
					clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Facility_Closure_Request_SaveSuccessPopUp());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}	
    }
    
    @Then("^move to Facility Closure Request Approve screen and Approve the record$")
    public void move_to_facility_closure_request_approve_screen_and_approve_the_record()   {
    	
    	for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Facility_Closure_Request_Approve());
				clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Facility_Closure_Request_Approve());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	 waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Facility_Closure_Request_Approve_code());
		 wIFAKapplicationObj.Facility_Closure_Request_Approve_code().click();
		 wIFAKapplicationObj.Facility_Closure_Request_Approve_code().sendKeys(testData.get("Application Number"));
		 wIFAKapplicationObj.Facility_Closure_Request_Approve_code().sendKeys(Keys.ENTER);
		 for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Facility_Closure_Request_Approve_FirstRecord());
					clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Facility_Closure_Request_Approve_FirstRecord());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		 waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Facility_Closure_Request_Approve_code());
		 wIFAKapplicationObj.Facility_Closure_Request_Approve_code().click();
		 
		 waitHelper.waitForElementwithFluentwait(driver,  wIFAKapplicationObj.Facility_Closure_Request_Approve_button());
		 wIFAKapplicationObj.Facility_Closure_Request_Approve_button().click();

		 for (int i = 0; i <= 300; i++) {
				try {
					clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Facility_Closure_Request_Approve_button_confirm());
					clicksAndActionHelper.clickOnElement(wIFAKapplicationObj.Facility_Closure_Request_Approve_button_confirm());
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		 
    }
 
		@Then("^Change the Application Running Date$")
	    public void change_the_application_running_date()   {
			clicksAndActionHelper.moveToElement(wIFAKapplicationObj.applicationfinancialfacilityRunDate());
			clicksAndActionHelper.doubleClick(wIFAKapplicationObj.applicationfinancialfacilityRunDate());
			
			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.applicationfinancialfacilityUserRunDate());
			wIFAKapplicationObj.applicationfinancialfacilityUserRunDate().click();
			wIFAKapplicationObj.applicationfinancialfacilityUserRunDate().sendKeys(Keys.CLEAR);
			wIFAKapplicationObj.applicationfinancialfacilityUserRunDate().sendKeys("6/01/2021");
	    }

	    @Then("^navigate to Approve level1 screen$")
	    public void navigate_to_approve_level1_screen()   {
	    	clicksAndActionHelper.moveToElement(wIFAKapplicationObj.applicationFinancialFacilitesApproveLevel1());
			wIFAKapplicationObj.applicationFinancialFacilitesApproveLevel1().click();
			
			
	    }

	    @And("^open the record add decision for approval$")
	    public void open_the_record_add_decision_for_approval()   {
	    	clicksAndActionHelper.moveToElement(wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_Clear());
			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_Clear());
			wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_Clear().click();
			
			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_OpenTheRecord());
			wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_OpenTheRecord().click();

			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_Decision());
			wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_Decision().click();
	      
	    }

	    @Then("^approve Application for Financial Facilities record$")
	    public void approve_application_for_financial_facilities_record()   {
	    	clicksAndActionHelper.moveToElement(wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_Submit());
			waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_Submit());
			wIFAKapplicationObj.fms_ApplicationForFinancialFacilites_Maintenance_Submit().click();
			
			
	    }
	   
	    
	    @Then("^click on the fixed Assets tab$")
	    public void click_on_the_fixed_assets_tab()   {
	   for (int i = 0; i <= 300; i++) {
		try {
						
			clicksAndActionHelper.moveToElement(wIFAKapplicationObj.Fixed_Assets_key());
			clicksAndActionHelper.doubleClick(wIFAKapplicationObj.Fixed_Assets_key());
	  break;
			} catch (Exception e) {
						if (i == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}	
	    
	    }
	    
	    @Then("^click on the add under fixed Assets tab$")
	    public void click_on_the_add_under_fixed_assets_tab()   {
	    waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Fixed_Assets_key_addIcon());
		wIFAKapplicationObj.Fixed_Assets_key_addIcon().click();
					
	    }
	    @Then("^add the first row details under fixed Assets tab$")
	    public void add_the_first_row_details_under_fixed_assets_tab()   {
	    	
	    waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Fixed_Assets_key_CATEGORY());
		wIFAKapplicationObj.Fixed_Assets_key_CATEGORY().sendKeys(testData.get("CATEGORY"));
		wIFAKapplicationObj.Fixed_Assets_key_CATEGORY().sendKeys(Keys.ENTER);
		
		
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Fixed_Assets_key_CLASS());
		wIFAKapplicationObj.Fixed_Assets_key_CLASS().sendKeys(testData.get("CLASS"));
		wIFAKapplicationObj.Fixed_Assets_key_CLASS().sendKeys(Keys.ENTER);
			

		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Fixed_Assets_key_VENDOR());
		wIFAKapplicationObj.Fixed_Assets_key_VENDOR().sendKeys(testData.get("VENDOR"));
		wIFAKapplicationObj.Fixed_Assets_key_VENDOR().sendKeys(Keys.ENTER);	
			
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Fixed_Assets_key_Quantity());
		wIFAKapplicationObj.Fixed_Assets_key_Quantity().sendKeys(testData.get("Quantity"));
		wIFAKapplicationObj.Fixed_Assets_key_Quantity().sendKeys(Keys.ENTER);	
		
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Fixed_Assets_key_Unit());
		wIFAKapplicationObj.Fixed_Assets_key_Unit().sendKeys(testData.get("UNIT"));
		wIFAKapplicationObj.Fixed_Assets_key_Unit().sendKeys(Keys.ENTER);	
		
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Fixed_Assets_key_CURRENCY());
		wIFAKapplicationObj.Fixed_Assets_key_CURRENCY().sendKeys(testData.get("CURRENCY"));
		wIFAKapplicationObj.Fixed_Assets_key_CURRENCY().sendKeys(Keys.ENTER);	
		
		waitHelper.waitForElementwithFluentwait(driver, wIFAKapplicationObj.Fixed_Assets_key_UNIT_COST());
		wIFAKapplicationObj.Fixed_Assets_key_UNIT_COST().sendKeys(testData.get("UNIT COST"));
		wIFAKapplicationObj.Fixed_Assets_key_UNIT_COST().sendKeys(Keys.ENTER);	
		
	    }
	    
	    @Then("^add the second row details under fixed Assets tab$")
	    public void add_the_second_row_details_under_fixed_assets_tab()   {
	    	
	    
	    }
	    
	    @Then("^validate the popup under fixed Assets tab$")
	    public void validate_the_popup_under_fixed_assets_tab()   {
	    	
	    
	    }
	   
	    
	    

	//----------------------//
	   
	    @Then("^User clicks the update after approval under Application for financial facility$")
	    public void user_clicks_the_update_after_approval_under_application_for_financial_facility()   {
	    	
	    }
	     
	    @Then("^retrieve the financial facility approved record$")
	    public void retrieve_the_financial_facility_approved_records()   {
	    }
	     
	    @Then("^Edit the Maurity date$")
	    public void edit_the_maurity_date()   {
	    }
	     
	    @Then("^save the financial facility record for update after approval$")
	    public void save_the_financial_facility_record_for_update_after_approval()   {
	    }
	   
	    @Then("^click on Accounts Module$")
	    public void click_on_accounts_module()   {
	    }
	    
	    @Then("^Click on the general accounts under accounts$")
	    public void click_on_the_general_accounts_under_accounts()   {
	    }
	     
	    @Then("^click on the Maintenance under general accounts$")
	    public void click_on_the_maintenance_under_general_accounts()   {
	    }
	     
	    @Then("^retrieve the record by searching cif number$")
	    public void retrieve_the_record_by_searching_cif_number()   {
	    }
}
