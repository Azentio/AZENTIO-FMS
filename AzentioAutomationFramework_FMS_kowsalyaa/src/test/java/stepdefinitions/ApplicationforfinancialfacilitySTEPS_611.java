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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.fms.ApplicationforfinancialfacilityOBJ_611;
import resources.BaseClass;

public class ApplicationforfinancialfacilitySTEPS_611 {
	WebDriver driver = BaseClass.driver;
	ApplicationforfinancialfacilityOBJ_611 wifakapplicationobj_611 = new ApplicationforfinancialfacilityOBJ_611(driver);
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
	    	 Assert.assertEquals(Vatyieldflagischecked.isSelected(), true);
	    	
/*
	        if (Vatyieldflagischecked.isSelected()) {

	            Assert.assertTrue(true);

	        }
	        */
	       
	    }
	    
	    //@841963_Fms_Core
	    
	    @Then("^User_611 Validate the Product Class L and N is displayed")
	    public void user_validate_the_product_class_l_and_n_is_displayed() throws Throwable {
	    	WebElement ProductclsLandNisdisplayed = wifakapplicationobj_611.drawdownrequestmaintenancedrawdownadditionaldetailsproductclassLandNdetails_611();

	        if (ProductclsLandNisdisplayed.isDisplayed()) {

	           // Assert.assertTrue(true);
	           Assert.assertEquals(wifakapplicationobj_611.drawdownrequestmaintenancedrawdownadditionaldetailsproductclassLandNdetails_611().getAttribute("prevvalue"), "SALARY-Govt.Civil");
	        }
	       
	       
	    }
	    
	    //@586558_Fms_param
	    
	    @And("User_611 Clicks the Parameter under Parameter Application")
	    public void user_clicks_the_parameter_under_parameter_application() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.parameterApplicationparameter());
	    	wifakapplicationobj_611.parameterApplicationparameter().click();
	        
	    }
	    @And("User_611 Clicks the Facility Risk Rating under Parameter Application")
	    public void user_clicks_the_facility_risk_rating_under_parameter_application() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.parameterfacilityriskrating_611());
	    	wifakapplicationobj_611.parameterfacilityriskrating_611().click();
	        
	        
	    }

	    @And("User_611 Clicks the Maintenance under Facility Risk Rating")
	    public void user_clicks_the_maintenance_under_facility_risk_rating() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenance_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenance_611().click();
	        
	    }

	    @And("User_611 Clicks the add button to add the values")
	    public void user_clicks_the_add_button_to_add_the_values() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.maintenanceaddbtn_611());
	    	wifakapplicationobj_611.maintenanceaddbtn_611().click();
	        
	    }

	    @And("User_611 Enter the Rating value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_rating_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	
	    	
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascripthelper.scrollIntoView(wifakapplicationobj_611.facilityriskratingmaintenanceratingscrollintoview_611());
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceratingscrollintoview_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceratingscrollintoview_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancerating_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancerating_611().sendKeys("222",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	             try {
	                 if(!(wifakapplicationobj_611.facilityriskratingmaintenancerating_611().getAttribute("prevvalue").isBlank())) {
	                     break;
	                 }
	             } catch (Exception e) {
	                 // TODO: handle exception
	             }
	         }
	    
	    }

	    @And("User_611 Enter the Brief Discription value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_brief_discription_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancebriefdiscription_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancebriefdiscription_611().sendKeys("Reference",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenancebriefdiscription_611().getAttribute("prevvalue").isBlank())) {
                     break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	}

	    @And("User_611 Enter the Brief Discription in Arab under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_brief_discription_in_arab_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancebriefdiscriptionarab_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancebriefdiscriptionarab_611().sendKeys("Reference",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenancebriefdiscriptionarab_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	    }

	    @And("User_611 Enter the Long Discription value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_long_discription_value_under_facility_risk_rating_maintenance_screen() throws Throwable{
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancelongdiscription_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancelongdiscription_611().sendKeys("Reference",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenancelongdiscription_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	    }   

	    @And("User_611 Enter the Long Discription in Arab under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_long_discription_in_arab_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancelongdiscriptionarab_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancelongdiscriptionarab_611().sendKeys("Reference",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenancelongdiscriptionarab_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	        
	    } 

	    @And("User_611 Enter the Mininum value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_mininum_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().sendKeys("6",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	        
	    }      
	    

	    @And("User_611 Enter the Maximum value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_maximum_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancemaximumrate_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancemaximumrate_611().sendKeys("2",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenancemaximumrate_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

	    	}
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.maximumratecannotlessthenminimumrateokbtn_611());
	    	for(int i = 0; i <= 500; i++) {
	    		try {
	    			wifakapplicationobj_611.maximumratecannotlessthenminimumrateokbtn_611().click();
	    			break;
	    		}
	    		catch (Exception e) {
				Assert.fail(e.getMessage());
				}
	    	}
	    	
	    	
        
	    } 	
	        
	    

	    @And("User_611 Delete the Record")
	    public void user_delete_the_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancedeletebtn_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancedeletebtn_611().click();
	        
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceconfirmdelprocessokbtn_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceconfirmdelprocessokbtn_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceconfirmsaveprocessokbtn_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceconfirmsaveprocessokbtn_611().click();
	    }
	    
	    @Given("User_611 Enter the Minninum value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_Minninum_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancemaximumrate_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().sendKeys("250",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

	    	}
	        
	    }
	    
	    @Given("User_611 Enter the Maxximum value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_maxximum_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancemaximumrate_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancemaximumrate_611().sendKeys("350",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenancemaximumrate_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
	    	

	    	}
	    } 	


	    @And("User_611 Update all the Facility Risk Rating Values")
	    public void user_update_all_the_facility_risk_rating_values() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceupdatebtn_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceupdatebtn_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceconfirmsaveprocessokbtn_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceconfirmsaveprocessokbtn_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.Saverecordwasupdatedsuccessfullyokbtn_611());
	    	wifakapplicationobj_611.Saverecordwasupdatedsuccessfullyokbtn_611().click();
	        
	    }

	    //@586558_Fms_Core 
	    @Then("User_611 Validate the Param Facility rating under facility type details")
	    public void user_validate_the_param_facility_rating_under_facility_type_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityratingsmallsearchbtn_611());
	    	wifakapplicationobj_611.facilityratingsmallsearchbtn_611().click();
	        
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityratingsmallsearchbtnratingsearchbtn_611());
	    	wifakapplicationobj_611.facilityratingsmallsearchbtnratingsearchbtn_611().sendKeys("222",Keys.TAB);
	    	for(int i = 0; i <= 500; i++) {
		    	try {
	                if(!(wifakapplicationobj_611.facilityratingsmallsearchbtnratingsearchbtn_611().getAttribute("prevvalue").isBlank())) {
	                    break;
	                }
	            } catch (Exception e) {
	                // TODO: handle exception
	            }
		    	
	    	}	
	    	
	    }
	   // @586526_Fms_Core
	    @Given("User_611 Validate the facility Rating")
	    public void user_validate_the_facility_rating() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityratingisenabled_611());
	    	try {
	    		Assert.assertEquals(wifakapplicationobj_611.facilityratingisenabled_611().isEnabled(),true);
	    	}
	    	catch (Exception e) {
	    	Assert.fail(e.getMessage());
	    	}
	    }

	    //@586527_Fms_param
	    
	    @And("User_611 Enter the Raating value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_raating_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	
	    	
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascripthelper.scrollIntoView(wifakapplicationobj_611.facilityriskratingmaintenanceratingscrollintoview_611());
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceratingscrollintoview_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceratingscrollintoview_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancerating_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancerating_611().sendKeys("333",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	             try {
	                 if(!(wifakapplicationobj_611.facilityriskratingmaintenancerating_611().getAttribute("prevvalue").isBlank())) {
	                     break;
	                 }
	             } catch (Exception e) {
	                 // TODO: handle exception
	             }
	         }
	    }
	    @And("User_611 Enter the Mininumm value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_mininumm_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().sendKeys("65",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.alreadyavailableinexistingrateokbtn_611());
	    	for(int i = 0; i<= 500; i++) {
	    		try {
	    			wifakapplicationobj_611.alreadyavailableinexistingrateokbtn_611().click();
	    			break;
	    		}
	    		catch (Exception e) {
	    			Assert.fail(e.getMessage());
	    			
	    		}
	    	
	    	}
	    	
	    	
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().sendKeys("999",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	       
	    }

	    @And("User_611 Enter the Maximumm value under Facility Risk Rating Maintenance screen")
	    public void user_enter_the_maximumm_value_under_facility_risk_rating_maintenance_screen() throws Throwable {
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilityriskratingmaintenancelongdiscriptionarab_611());
	    	wifakapplicationobj_611.facilityriskratingmaintenancemaximumrate_611().sendKeys("98",Keys.TAB);
	    	
	    	for(int i = 0; i <= 500; i++) {
	    	try {
                if(!(wifakapplicationobj_611.facilityriskratingmaintenanceminimumrate_611().getAttribute("prevvalue").isBlank())) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.maximumratecannotlessthenminimumrateokbtn_611());
	    	for(int i = 0; i <= 500; i++) {
	    		try {
	    			wifakapplicationobj_611.maximumratecannotlessthenminimumrateokbtn_611().click();
	    			break;
	    		}
	    		catch (Exception e) {
				Assert.fail(e.getMessage());
				}
	    	}
	    	
	    }
	    //@280446
	    @And("^User_611 Click the request for financin in fms application$")
	    public void click_the_request_for_financin_in_fms_application() throws Throwable {
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascripthelper.scrollIntoView(wifakapplicationobj_611.REQUESTFORFINANCIN_611());
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	wifakapplicationobj_611.REQUESTFORFINANCIN_611().click();
	    }
	    
	    @And("^User_611 Click the request for financing under request for financin$")
	    public void click_the_request_for_financing_under_request_for_financin() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.RequestForFinancing_611());
	    	wifakapplicationobj_611.RequestForFinancing_611().click();
	        
	    }

	    @And("^User_611 click the maintenence under request for financing$")
	    public void click_the_maintenence_under_request_for_financing() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.requestforfinancingmaintenance_611());
	    	wifakapplicationobj_611.requestforfinancingmaintenance_611().click();
	        
	    }

	    @And("^User_611 click the reason for submission search box$")
	    public void click_the_reason_for_submission_search_box() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.reasonforsubmisson_611());
	    	dropdownhelper.SelectUsingVisibleText(wifakapplicationobj_611.reasonforsubmisson_611(), "New Request");
	        
	    }

	    @And("^User_611 click the customer search box$")
	    public void click_the_customer_search_box() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.customersearchbox_611());
	    	wifakapplicationobj_611.customersearchbox_611().sendKeys("727",Keys.TAB);
	    	
	    }  

	    @And("^User_611 click the facility type details$")
	    public void click_the_facility_type_details() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitytypedetails_611());
	    	wifakapplicationobj_611.facilitytypedetails_611().click();
	        
	    }

	    @And("^User_611 Enter the facility type code under facility type$")
	    public void enter_the_facility_type_code_under_facility_type() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.facilitytypedetailssearchbox_611());
	    	wifakapplicationobj_611.facilitytypedetailssearchbox_611().sendKeys("221",Keys.TAB);
	    	
	        
	    }



	    @And("^User_611 Enter the total limit under global limit$")
	    public void enter_the_total_limit_under_global_limit() throws Throwable {
	    	
		    	for(int i = 0; i <= 300; i++) {
		    		try {
		    			javascripthelper.scrollIntoView(wifakapplicationobj_611.totallimitsearchbox_611());
					} catch (Exception e) {
						if(i == 300) {
							Assert.fail(e.getMessage());
						}
					}
		    	}
		    	wifakapplicationobj_611.totallimitsearchbox_611().sendKeys("10000",Keys.TAB);
		    	
		    	
		    }
	    	
	    	


	    @And("^User_611 Click the Disbursement Sublimit under maintenance screen$")
	    public void click_the_disbursement_sublimit_under_maintenance_screen() throws Throwable {
	    	
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascripthelper.scrollIntoView(wifakapplicationobj_611.disbursementsublimit_611());
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.disbursementsublimit_611());
	    	wifakapplicationobj_611.disbursementsublimit_611().click();
	    }

	    @And("^User_611 Add the limits under Disbursement Sublimit$")
	    public void add_the_limits_under_disbursement_sublimit() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.disbursementsublimitaddbutton_611());
	    	wifakapplicationobj_611.disbursementsublimitaddbutton_611().click();
	   
	        
	    }

	    @And("^User_611 Add the product class values in product searchbox$")
	    public void add_the_product_class_values_in_product_searchbox() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver,wifakapplicationobj_611.productclasssearchbox_611());
	    	wifakapplicationobj_611.productclasssearchbox_611().sendKeys("1",Keys.TAB);
	    	
	    }
	    @Given("User_611 Enter the Facility risk rating value")
	    public void user_enter_the_facility_risk_rating_value() {
	    	waithelper.waitForElementwithFluentwait(driver,wifakapplicationobj_611.Productclscreenfacilityriskrating_611());
	    	wifakapplicationobj_611.Productclscreenfacilityriskrating_611().sendKeys("1",Keys.TAB);
	    }

	    @Given("User_611 Enter the date of FRR value date")
	    public void user_enter_the_date_of_frr_value_date() {
	    	waithelper.waitForElementwithFluentwait(driver,wifakapplicationobj_611.frrvaluedate_611());
	    	wifakapplicationobj_611.frrvaluedate_611().sendKeys("04/01/2021",Keys.TAB);
	        
	    }
	    



	    @And("^User_611 Add the Margin values in Margin$")
	    public void add_the_margin_values_in_margin() throws Throwable {
	    	for(int i = 0; i <= 300; i++) {
	    		try {
	    			javascripthelper.scrollIntoView(wifakapplicationobj_611.marginsearchbox_611());
	    			wifakapplicationobj_611.marginsearchbox_611().clear();
	    			wifakapplicationobj_611.marginsearchbox_611().sendKeys("1",Keys.ENTER);
	    			break;
				} catch (Exception e) {
					if(i == 300) {
						Assert.fail(e.getMessage());
					}
				}
	    	}
	    	
	    }



	   

	    @And("^User_611 Add all the Above limit values$")
	    public void add_all_the_above_limit_values() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.finaladdbutton_611());
	    	wifakapplicationobj_611.finaladdbutton_611().click();
	        
	    }

	    @And("^User_611 Save all the values when limits are add$")
	    public void save_all_the_values_when_limits_are_add() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.savebutton_611());
	    	wifakapplicationobj_611.savebutton_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.confirmsavepopupokbutton_611());
	    	wifakapplicationobj_611.confirmsavepopupokbutton_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.confirmsavesuccessfullypopup_611());
	    	wifakapplicationobj_611.confirmsavesuccessfullypopup_611().click();
	        
	    }

	    @And("^User_611 Click the validate button when all the values are saved$")
	    public void click_the_validate_button_when_all_the_values_are_saved() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.validatebutton_611());
	    	wifakapplicationobj_611.validatebutton_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.confirmvalidatepopupokbutton_611());
	    	wifakapplicationobj_611.confirmvalidatepopupokbutton_611().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.validatesuccessfullypopup_611());
	    	wifakapplicationobj_611.validatesuccessfullypopup_611().click();
	        
	        
	        
	    }

	   

	    @And("^User_611 Click the Approve level1 screen under request for financing$")
	    public void click_the_approve_level1_screen_under_request_for_financing() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, wifakapplicationobj_611.approvelevel1_611());
	    	wifakapplicationobj_611.approvelevel1_611().click();
	        
	    }

	    @And("^User_611 Enter the request code in search box$")
	    public void enter_the_request_code_in_search_box() throws Throwable {
	        
	    }

	    @And("^Double tap the request code value$")
	    public void double_tap_the_request_code_value() throws Throwable {
	        
	    }

	    @And("^User_611 Click the customer grading recommendation under maintenance screen$")
	    public void click_the_customer_grading_recommendation_under_maintenance_screen() throws Throwable {
	        
	    }

	    @And("^Click the decision dropdown and select forward menu$")
	    public void click_the_decision_dropdown_and_select_forward_menu() throws Throwable {
	        
	    }

	    @And("^User_611 click the Approval committe dropdown$")
	    public void click_the_approval_committe_dropdown() throws Throwable {
	        
	    }

	    @And("^Click the investment committe under Approval committe$")
	    public void click_the_investment_committe_under_approval_committe() throws Throwable {
	        
	    }

	    @And("^User_611 Approve the decision under relationship$")
	    public void approve_the_decision_under_relationship() throws Throwable {
	        
	    }

	    @And("^Confirm the Approve popup message$")
	    public void confirm_the_approve_popup_message() throws Throwable {
	        
	    }

	    @And("^User_611 Click the final Approve popup$")
	    public void click_the_final_approve_popup() throws Throwable {
	        
	    }

	    @And("^Click the Approval Committee Recommendation under request for financing$")
	    public void click_the_approval_committee_recommendation_under_request_for_financing() throws Throwable {
	        
	    }

	    @And("^User_611 Enter the request code in approval committe search box$")
	    public void enter_the_request_code_in_approval_committe_search_box() throws Throwable {
	        
	    }
	    
	    @And("^User_611 double tap the request code$")
	    public void double_tap_the_request_code() throws Throwable {
	        
	    }

	    @And("^User_611 Click the credit committee recommendation$")
	    public void click_the_credit_committee_recommendation() throws Throwable {
	        
	    }

	    @And("^User_611 Click the recommendation under credit committee recommendation$")
	    public void click_the_recommendation_under_credit_committee_recommendation() throws Throwable {
	        
	    }

	    @And("^Click the recommendation add symbol under recommendation$")
	    public void click_the_recommendation_add_symbol_under_recommendation() throws Throwable {
	        
	    }

	    @And("^User_611 double tap all the value we created$")
	    public void double_tap_all_the_value_we_created() throws Throwable {
	        
	    }

	    @And("^User_611 send back the recommendation  value$")
	    public void send_back_the_recommendation_value() throws Throwable {
	        
	    }

	    @And("^User_611 Click the Maitenance level in send back level$")
	    public void click_the_maitenance_level_in_send_back_level() throws Throwable {
	        
	    }

	    @And("^Confirm the recommendation popup menu$")
	    public void confirm_the_recommendation_popup_menu() throws Throwable {
	        
	    }

	    @And("^User_611 Accept the recommendation popup menu$")
	    public void accept_the_recommendation_popup_menu() throws Throwable {
	        
	    }

	    @And("^Click the maintenance screen under request for financing$")
	    public void click_the_maintenance_screen_under_request_for_financing() throws Throwable {
	        
	    }

	    @And("^User_611 Click the search button$")
	    public void click_the_search_button() throws Throwable {
	        
	    }

	    @And("^User_611 Enter the created request code in search box$")
	    public void enter_the_created_request_code_in_search_box() throws Throwable {
	        
	    }
	    @Then("^User_611 double tap the  created request code$")
	    public void double_tap_the_created_request_code() throws Throwable {
	        
	    }


	}

       


