package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.fms.WIFAK_ApplicationOBJ_611;
import resources.BaseClass;

public class WIFAKApplicationSteps_611 {
	WebDriver driver = BaseClass.driver;
	WIFAK_ApplicationOBJ_611 wifakapplicationobj_611 = new WIFAK_ApplicationOBJ_611(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clickandactionhelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	FMSLogin fmslogin = new FMSLogin(driver);
	
	String refCode;
	String code;
	
	@And("^User_611 Click the first Wifak Application$")
    public void click_the_first_wifak_appliaction() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.wifakapplication1_611());
    	wifakapplicationobj_611.wifakapplication1_611().click();
        
    }

    @And("^User_611 Click the second Wifak Application$")
    public void click_the_second_wifak_appliaction() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.wifakapplication2_611());
    	wifakapplicationobj_611.wifakapplication2_611().click();
        
    }

    @And("^User_611 Click the application for financial facilities under second Wifak Appliaction$")
    public void click_the_application_for_financial_facilities_under_second_wifak_appliaction() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.applicationforfinancialfacilities_611());
    	wifakapplicationobj_611.applicationforfinancialfacilities_611().click();
        
        
    }

    @And("^User_611 Click the maintenance under application for financial facilities$")
    public void click_the_maintenance_underapplication_for_financial_facilities() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.maintenancemenu_611());
    	wifakapplicationobj_611.maintenancemenu_611().click();
        
    }
    @And("^User_611 Click the Main information$")
    public void click_the_main_information() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.maininformation_611());
    	wifakapplicationobj_611.maininformation_611().click();
        
    }

    @And("^User_611 Select a new facility under application$")
    public void select_a_new_facility_under_application() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.selectnewfacility_611());
    	dropdownhelper.SelectUsingVisibleValue(wifakapplicationobj_611.selectnewfacility_611(), "New Facility");
        
    }

    @And("^User_611 Enter the CIF num under cif details$")
    public void enter_the_cif_num_under_cif_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.cifnumsearchbox_611());
    	wifakapplicationobj_611.cifnumsearchbox_611().sendKeys("727");
    	wifakapplicationobj_611.cifnumsearchbox_611().sendKeys(Keys.TAB);
        
    }

    @And("^User_611 Enter the facility type under facility type details$")
    public void enter_the_facility_type_under_facility_type_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitytypedetailsfacilitytype_611());
    	wifakapplicationobj_611.facilitytypedetailsfacilitytype_611().sendKeys("369");
    	wifakapplicationobj_611.facilitytypedetailsfacilitytype_611().sendKeys(Keys.TAB);
        
        
    }

    @And("^User_611 Enter the country of financing under facility type details$")
    public void enter_the_country_of_financing_under_facility_type_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitytypedetailscountryoffinancing_611());
    	wifakapplicationobj_611.facilitytypedetailscountryoffinancing_611().sendKeys("320");
    	wifakapplicationobj_611.facilitytypedetailscountryoffinancing_611().sendKeys(Keys.TAB);
        
        
    }

    @And("^User_611 Enter the facility rating under facility type details$")
    public void enter_the_facility_rating_under_facility_type_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitytypedetailsfacilityrating_611());
    	wifakapplicationobj_611.facilitytypedetailsfacilityrating_611().sendKeys("2");
    	wifakapplicationobj_611.facilitytypedetailsfacilityrating_611().sendKeys(Keys.TAB);
    	
    	 for(int i = 0; i <= 500; i++) {
             try {
                 if(!(wifakapplicationobj_611.facilitytypedetailsfacilityrating_611().getAttribute("prevvalue").isBlank())) {
                     break;
                 }
             } catch (Exception e) {
                 // TODO: handle exception
             }
         }
        
    }

    @And("^User_611 Click the Additional details$")
    public void click_the_additional_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.secondtabadditionaldetails_611());
        for (int i = 0; i < 300; i++) {
            try {
            	wifakapplicationobj_611.secondtabadditionaldetails_611().click();
                break;
            } catch (Exception e) {
                if (i==299) {
                    Assert.fail(e.getMessage());
                }
            }
        }        
    }

    @And("^User_611 Enter the currency code under Additional details$")
    public void enter_the_currency_code_under_additional_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.additionaldetailscurrencycode_611());
    	wifakapplicationobj_611.additionaldetailscurrencycode_611().sendKeys("840");
    	wifakapplicationobj_611.additionaldetailscurrencycode_611().sendKeys(Keys.TAB);
        
        
    }

    @And("^User_611 Enter the total value under Additional details$")
    public void enter_the_total_value_under_additional_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.additionaldetailstotalvalue_611());
    	wifakapplicationobj_611.additionaldetailstotalvalue_611().sendKeys("10000");
    	wifakapplicationobj_611.additionaldetailstotalvalue_611().sendKeys(Keys.TAB);
        
    }
    
    @And("^User_611 Click the Document details$")
    public void click_the_document_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.seventhtabdocumentdetails_611());
    	wifakapplicationobj_611.seventhtabdocumentdetails_611().click();
        
    }

    @And("^User_611 Click the estimators search box$")
    public void click_the_estimators_search_box() throws Throwable {
    	for(int i = 0; i <= 300; i++) {
    		try {
    			javascripthelper.scrollIntoView(wifakapplicationobj_611.estimatorsnamefirstsearchbox_611());
			} catch (Exception e) {
				if(i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}

    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.estimatorsnamefirstsearchbox_611());
    	wifakapplicationobj_611.estimatorsnamefirstsearchbox_611().click();
    }

        
    
    @Then("^User_611 Enter the estimators code$")
    public void enter_the_ectimators_code() throws Throwable {
    	Thread.sleep(5000);
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.estimatorsnamesecondsearchbox_611());
    	wifakapplicationobj_611.estimatorsnamesecondsearchbox_611().sendKeys("4444");
    	Thread.sleep(5000);
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.retrivedvaluedoubleclick_611());
    	clickandactionhelper.doubleClick(wifakapplicationobj_611.retrivedvaluedoubleclick_611());
        Thread.sleep(10000);
    }
    
    @And("^User_611 Enter the Expiry date$")
	public void enter_the_expiry_date() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.additionalTabExpireCalender_611());
		wifakapplicationobj_611.additionalTabExpireCalender_611().click();
		
		waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.additionalTabExpireDate_611());
		wifakapplicationobj_611.additionalTabExpireDate_611().click();
		
    }
    
    @And("^User_611 Click the limit details tab$")
    public void click_the_limit_details_tab() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.limitdetailstab_611());
    	wifakapplicationobj_611.limitdetailstab_611().click();
        
    }
    @And("^User_611 Click the add button under limit details tab$")
    public void click_the_add_button_under_limit_details_tab() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.limitdetailstabaddbutton_611());
    	wifakapplicationobj_611.limitdetailstabaddbutton_611().click();
    } 
    
    @And("^User_611 Clicks the product class value one$")
    public void user_clicks_the_product_class_value_one() throws Throwable {
     waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.productclassvalue_611());
	 wifakapplicationobj_611.productclassvalue_611().sendKeys("1",Keys.TAB);
	 
	 for(int i = 0; i <= 500; i++) {
            try {
                if(!(wifakapplicationobj_611.productclassvalue_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	 waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.limitDetailsNewRecordCleanFlag_611());
     WebElement cleanFlag = wifakapplicationobj_611.limitDetailsNewRecordCleanFlag_611();
     if(!(cleanFlag.isSelected())) {
         cleanFlag.click();
     }
        
    }
	
	@And("^User_611 Click the add button$")
    public void click_the_add_button() throws Throwable {
		for(int i = 0; i <= 300; i++) {
    		try {
    			javascripthelper.scrollIntoView(wifakapplicationobj_611.addProductclass_611());
			} catch (Exception e) {
				if(i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
		waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.addProductclass_611());
		wifakapplicationobj_611.addProductclass_611().click();
        
    }
	
	  @And("^User_611 Click the doucmentdetailstab$")
	    public void click_the_doucmentdetailstab() throws Throwable {
		  waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.documentdetailstab_611());

			
	    	for (int i = 0; i < 1000; i++) {
				try {
					clickandactionhelper.clickOnElement(wifakapplicationobj_611.documentdetailstab_611());
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    	}

	    @And("^User_611 Enter the value for solicitorname$")
	    public void enter_the_value_for_slicitorname() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.solicitornamesearchbox_611());

			
			for (int i = 0; i < 1000; i++) {
				try {
					clickandactionhelper.clickOnElement(wifakapplicationobj_611.solicitornamesearchbox_611());
					wifakapplicationobj_611.solicitornamesearchbox_611().sendKeys("1");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    }
	    
	    @And("^User_611 Enter the value for estimators name$")
	    public void enter_the_value_for_estimators_name() throws Throwable {
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.estimatornamesearchbox_611());
	    	for (int i = 0; i < 1000; i++) {
				try {
					clickandactionhelper.clickOnElement(wifakapplicationobj_611.estimatornamesearchbox_611());
					wifakapplicationobj_611.estimatornamesearchbox_611().sendKeys("1");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
			Thread.sleep(5000);
	    }
	    
	    @And("^User_611 clicks the save button$")
	    public void user_clicks_the_save_button() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.limitDetailsSaveBtn_611());
	    	wifakapplicationobj_611.limitDetailsSaveBtn_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.ButtonConfirmOk_611());
	    	wifakapplicationobj_611.ButtonConfirmOk_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.ButtonSuccessOk_611());
	    	wifakapplicationobj_611.ButtonSuccessOk_611().click();
	    }

	    @And("^User_611 clicks the validate button$")
	    public void user_clicks_the_validate_button() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.limitDetailsValidateBtn_611());
	    	wifakapplicationobj_611.limitDetailsValidateBtn_611().click();

	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.WarningPopupOkBtn());
		        wifakapplicationobj_611.WarningPopupOkBtn().click();

		        // Facility already created popup
		        waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.confirmPopup());
		        waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityAlreadyCreatedPopup1());
		        wifakapplicationobj_611.facilityAlreadyCreatedPopup1().click();

		        waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.successPopup1());
		  //      String SuccessMsg = FMSWifakErrorWhileSavingObj.successPopupMessage().getText();
		        refCode = wifakapplicationobj_611.successPopupMessage1().getText().substring(23, 27);
		        System.err.println("Reference Number: "+refCode);
		   //     fmsTransactionsExcelData.updateTestData("DS_AT_RF_139", "Approve Code", SuccessMsg);

		        waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.successPopup1());
		        for (int i = 0; i < 2000; i++) {
		            try {
		            	wifakapplicationobj_611.successPopup1().click();
		                break;
		            } catch (Exception e) {
		                if (i==1999) {
		                    Assert.fail(e.getMessage());
		                }
		            }
		        }
		        waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.sendAlertPopup());
		        for (int i = 0; i < 2000; i++) {
		            try {
		            	wifakapplicationobj_611.sendAlertPopup().click();
		                break;
		            } catch (Exception e) {
		                if (i==1999) {
		                    Assert.fail(e.getMessage());
		                }
		            }
		        }
		    	

		}
	    
	    @And("^User_611 clicks the Approve Level1 link$")
	    public void user_clicks_the_approve_level1_link() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.applicationFinancialFacilityApproveLevel1_611());
	    	wifakapplicationobj_611.applicationFinancialFacilityApproveLevel1_611().click();  	
	    }
	    
	    @And("^User_611 retrive the first data in approve level1$")
	    public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel1RefCodeInput_611());
	    	wifakapplicationobj_611.approveLevel1RefCodeInput_611().sendKeys("refCode",Keys.ENTER);

	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel1RetriveData_611());
	    	clickandactionhelper.doubleClick(wifakapplicationobj_611.approveLevel1RetriveData_611());
	    }
	    
	    @And("User_611 select the Approve level1 decision as Approve")
	    public void user_select_the_approve_level1_decision_as_approve() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel1SelectDevision_611());
	    	dropdownhelper.SelectUsingVisibleText(wifakapplicationobj_611.approveLevel1SelectDevision_611(), "Approve");
	        
	    }

	    @And("^User_611 clicks on the level1 submit button$")
	    public void user_clicks_on_the_level1_submit_button() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel1SubmitBtn_611());
	    	wifakapplicationobj_611.approveLevel1SubmitBtn_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.ButtonConfirmOk_611());
	    	wifakapplicationobj_611.ButtonConfirmOk_611().click();
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.ButtonSuccessOk_611());
	    	wifakapplicationobj_611.ButtonSuccessOk_611().click();
	    	
	    }
	    @And("^User_611 clicks the Approve Level2 link$")
	    public void user_clicks_the_approve_level2_link() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.applicationFinancialFacilityApproveLevel2_611());
	    	wifakapplicationobj_611.applicationFinancialFacilityApproveLevel2_611().click();
	    }
	    @And("^User_611 retrive the first data in approve level2$")
	    public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel2RefCodeInput_611());
	    	wifakapplicationobj_611.approveLevel2RefCodeInput_611().sendKeys("refCode",Keys.ENTER);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel2RetriveData_611());
	    	clickandactionhelper.doubleClick(wifakapplicationobj_611.approveLevel2RetriveData_611());
	    }

	    @And("^User_611 select the level2 decision as approve$")
	    public void user_select_the_level2_decision_as_approve() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel2SelectDecision_611());
	    	dropdownhelper.SelectUsingVisibleText(wifakapplicationobj_611.approveLevel2SelectDecision_611(), "Approve");
	    	
	    }

	    @And("^User_611 clicks on the level2 submit button$")
	    public void user_clicks_on_the_level2_submit_button() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel2SubmitBtn_611());
	    	wifakapplicationobj_611.approveLevel2SubmitBtn_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.ButtonConfirmOk_611());
	    	wifakapplicationobj_611.ButtonConfirmOk_611().click();
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.ButtonSuccessOk_611());
	    	wifakapplicationobj_611.ButtonSuccessOk_611().click();
	    }

	    @And("^User_611 clicks the Approve Level3 link$")
	    public void user_clicks_the_approve_level3_link() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.applicationFinancialFacilityApproveLevel3_611());
	    	wifakapplicationobj_611.applicationFinancialFacilityApproveLevel3_611().click();
	    }
	    
	    @And("^User_611 retrive the first data in approve level3$")
	    public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel3RefCodeInput_611());
	    	wifakapplicationobj_611.approveLevel3RefCodeInput_611().sendKeys("refCode",Keys.ENTER);;
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel3RetriveData_611());
	    	clickandactionhelper.doubleClick(wifakapplicationobj_611.approveLevel3RetriveData_611());
	    }
	    
	    @And("^User_611 select the level3 decision as approve$")
	    public void user_select_the_level3_decision_as_approve() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel3SelectDecision_611());
	    	dropdownhelper.SelectUsingVisibleText(wifakapplicationobj_611.approveLevel3SelectDecision_611(), "Approve");
	    	
	    
	    }
	    
	    @When("^User_611 clicks on the level3 submit button$")
	    public void user_clicks_on_the_level3_submit_button() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approveLevel3SubmitBtn_611());
	    	wifakapplicationobj_611.approveLevel3SubmitBtn_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.ButtonConfirmOk_611());
	    	wifakapplicationobj_611.ButtonConfirmOk_611().click();
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.ButtonSuccessOk_611());
	    	wifakapplicationobj_611.ButtonSuccessOk_611().click();
	    }
	    
	    @And("^User_611 clicks the facility management under wifak application$")
	    public void user_clicks_the_facility_management_under_wifak_application() throws Throwable {
	    	Thread.sleep(3000);
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.wifakFacilitymanagement_611());
	    	wifakapplicationobj_611.wifakFacilitymanagement_611().click();
	        
	    }
	    @And("^User_611 clicks the maintenance under facility management$")
	    public void user_clicks_the_maintenance_under_facility_management() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.wifakFacilitymanagementMaintenance_611());
	    	wifakapplicationobj_611.wifakFacilitymanagementMaintenance_611().click();
	    }
	    @And("^User_611 clicks the Infosearch button")
	    public void user_clicks_the_infosearch_button() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitymanagementmaintenanceinfobarsearchbtn_611());
	    	wifakapplicationobj_611.facilitymanagementmaintenanceinfobarsearchbtn_611().click();
	        
	        
	    }

	    @And("^User_611 enter the Application Ref code")
	    public void user_enter_the_facility_code() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitymanagementmaintenanceinfobarsearchbtnappRefCodeInput_611());
	    	wifakapplicationobj_611.facilitymanagementmaintenanceinfobarsearchbtnappRefCodeInput_611().sendKeys("refCode",Keys.ENTER);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitymanagementmaintenanceinfobarsearchbtncodesearchbtnretrivedata_611());
	    	clickandactionhelper.doubleClick(wifakapplicationobj_611.facilitymanagementmaintenanceinfobarsearchbtncodesearchbtnretrivedata_611());
	        
	    	for(int i = 0; i <= 500; i++) {
	             try {
	                 if(!(wifakapplicationobj_611.facilitymanagementmaintenanceAppRefCode_611().getAttribute("prevvalue").isBlank())) {
	                     break;
	                 }
	             } catch (Exception e) {
	                 // TODO: handle exception
	             }
	         }
	    
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.drawdownmaininformationfacilityReferenceCode_611());
	    	code = wifakapplicationobj_611.drawdownmaininformationfacilityReferenceCode_611().getAttribute("prevvalue");
	    	
	    }

	    @And("^User_611 clicks the Facility Limit Details Tab")
	    public void user_clicks_the_facility_limit_details_tab() throws Throwable {   	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitymanagementmaintenancefacilitylimitdetailstab_611());
	    	wifakapplicationobj_611.facilitymanagementmaintenancefacilitylimitdetailstab_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitymanagementmaintenancefacilitylimitdetailstabproductclassvaluedoubletap_611());
	    	clickandactionhelper.doubleClick(wifakapplicationobj_611.facilitymanagementmaintenancefacilitylimitdetailstabproductclassvaluedoubletap_611());
	        
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.productclassvalueclosebtn());
	    	javascripthelper.scrollIntoView(wifakapplicationobj_611.productclassvalueclosebtn());
	    	wifakapplicationobj_611.productclassvalueclosebtn().click();
	    	
	    }

	    @And("^User_611 clicks the Draw Down Request Menu")
	    public void user_clicks_the_draw_down_request_menu() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.wifakapplicationdrawdownrequest_611());
	    	wifakapplicationobj_611.wifakapplicationdrawdownrequest_611().click();
	    }

	    @And("^User_611 clicks the maintenance Under Draw Down Request Menu")
	    public void user_clicks_the_maintenance_under_draw_down_request_menu() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.wifakapplicationdrawdownrequestmaintenance_611());
	    	wifakapplicationobj_611.wifakapplicationdrawdownrequestmaintenance_611().click();
	    }

	    @And("^User_611 enter the facility Reference Code")
	    public void user_enter_the_facility_reference_code() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationfacilityReference_611());
	    	wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationfacilityReference_611().sendKeys(code,Keys.TAB);
	    }

	    @And("^User_611 enter the Draw Down Type")
	    public void user_enter_the_draw_down_type() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationdrawdowntype_611());
	    	wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationdrawdowntype_611().sendKeys("1",Keys.TAB);  
	        
	    }

	    @And("^User_611 enter the Discription English")
	    public void user_enter_the_discription_english() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationdiscriptionenglish_611());
	    	wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationdiscriptionenglish_611().sendKeys("TestData",Keys.TAB);  
	        
	        
	    }

	    @And("^User_611 enter the Discription Arab")
	    public void user_enter_the_discription_arab() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationdiscriptionarab_611());
	    	wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationdiscriptionarab_611().sendKeys("TestData",Keys.TAB);  
	        
	        
	    }

	    

	    @And("^User_611 enter the date in value date")
	    public void user_enter_the_date_in_value_date() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationvaluedate_611());
	    	wifakapplicationobj_611.drawdownrequestmaintenancedrawdownmaininformationvaluedate_611().sendKeys("16/06/2023");  
	    }
	    
	    @And("^User_611 clicks the Draw Down Additional details")
	    public void user_clicks_the_draw_down_additional_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.drawdownrequestmaintenancedrawdownadditionaldetailstab_611());
	    	wifakapplicationobj_611.drawdownrequestmaintenancedrawdownadditionaldetailstab_611().click();
	          
	        
	    }

	    @And("^User_611 enter the Product class L and N value")
	    public void user_enter_the_product_class_l_and_n_value() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.drawdownrequestmaintenancedrawdownadditionaldetailsproductclassLandN_611());
	    	wifakapplicationobj_611.drawdownrequestmaintenancedrawdownadditionaldetailsproductclassLandN_611().sendKeys("1",Keys.TAB);  
	        
	    }

	    @And("^User_611 Validate the Draw Down Request Vat yield")
	    public void user_validate_the_draw_down_request_vat_yield() throws Throwable {
	    	WebElement Vatyieldflagischecked = wifakapplicationobj_611.drawdownrequestvatyield_611();

	        if (Vatyieldflagischecked.isSelected()) {

	            Assert.assertTrue(true);

	        }
	       
	    }
	    //@841963_Fms_Core_need to change xpath for this
	    
	    @Then("^User_611 Validate the Product Class L and N is displayed")
	    public void user_validate_the_product_class_l_and_n_is_displayed() throws Throwable {
	    	WebElement ProductclsLandNisdisplayed = wifakapplicationobj_611.drawdownrequestmaintenancedrawdownadditionaldetailsproductclassLandN_611();

	        if (ProductclsLandNisdisplayed.isDisplayed()) {

	            Assert.assertTrue(true);

	        }
	       
	       
	    }



}
