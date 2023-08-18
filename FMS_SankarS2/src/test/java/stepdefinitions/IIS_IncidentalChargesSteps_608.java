package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
import pageobjects.MTS.MTS_ApplicationObj_608;
import pageobjects.iisParam.IIS_ApplicationObj_608;
import resources.BaseClass;

public class IIS_IncidentalChargesSteps_608 {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	
	IIS_ApplicationObj_608 IISApplicationObj608 = new IIS_ApplicationObj_608(driver);
	MTS_ApplicationObj_608 MTSApplicationObj608 = new MTS_ApplicationObj_608(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\IISTestData.xlsx";
	ExcelData iisIncidentalChargesExcelData  = new ExcelData(path,"IncidentalChargesTestData","DataSet ID");
	ExcelData iisAccrualDealExcelData  = new ExcelData(path,"AccrualDealTestData","DataSet ID");
	ExcelData iisAccrualProcessExcelData  = new ExcelData(path,"AccrualProcessTestData","DataSet ID");
	ExcelData MTSEODExcelData  = new ExcelData(path,"MTSTestData","DataSet ID");
	ExcelData iisAdvancePrincipalsettlementExcelData  = new ExcelData(path,"AdvancePrincipalSettlement","DataSet ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String tmp;
	
//	@AT_IC_010
	@And("^User_608 get the test data for test case AT_IC_010$")
    public void get_the_test_data_for_test_case_AT_IC_010() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_AT_IC_010");
    }
		
//	@AT_IC_022
	@And("^User_608 get the test data for test case AT_IC_022$")
    public void get_the_test_data_for_test_case_AT_IC_022() throws Throwable {
		testData = iisIncidentalChargesExcelData.getTestdata("DS_AT_IC_022");
    }
	
	
//	Accrual Deal Feature
//	@AT_AD_003
	@And("^User_608 get the test data for test case AT_AD_003$")
    public void get_the_test_data_for_test_case_AT_AD_003() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_003");
    }
	
//	AT_AD_015
	@And("^User_608 get the test data for test case AT_AD_015$")
    public void get_the_test_data_for_test_case_AT_AD_015() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_015");
    }
	
//	AT_AD_018
	@And("^User_608 get the test data for test case AT_AD_018$")
    public void get_the_test_data_for_test_case_AT_AD_018() throws Throwable {
		testData = iisAccrualDealExcelData.getTestdata("DS_AT_AD_018");
    }
	
//	Accrual Process Feature
//	AT_AP_020
	@And("^User_608 get the test data for test case AT_AP_020$")
    public void get_the_test_data_for_test_case_AT_AP_020() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_020");
    }
	
//	AT_AP_021
	@And("^User_608 get the test data for test case AT_AP_021$")
    public void get_the_test_data_for_test_case_AT_AP_021() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_021");
    }
	
//	AT_AP_022
	@And("^User_608 get the test data for test case AT_AP_022$")
    public void get_the_test_data_for_test_case_AT_AP_022() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_022");
    }
	
//	AT_AP_023_01
	@And("^User_608 get the test data for test case AT_AP_023_01$")
    public void get_the_test_data_for_test_case_AT_AP_023_01() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_023_01");
    }
	
//	AT_AP_023_02
	@And("^User_608 get the test data for test case AT_AP_023_02$")
    public void get_the_test_data_for_test_case_AT_AP_023_02() throws Throwable {
		testData = MTSEODExcelData.getTestdata("DS_AT_AP_023_02");
    }	
	
//	@AT_AP_043
	@And("^User_608 get the test data for test case AT_AP_043$")
    public void get_the_test_data_for_test_case_AT_AP_043() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_043");
    }	
	
//	@AT_AP_044
	@And("^User_608 get the test data for test case AT_AP_044$")
    public void get_the_test_data_for_test_case_AT_AP_044() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_044");
    }
	
//	@AT_AP_045
	@And("^User_608 get the test data for test case AT_AP_045$")
    public void get_the_test_data_for_test_case_AT_AP_045() throws Throwable {
		testData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_045");
    }
	
//	@AT_AP_046
	@And("^User_608 get the test data for test case AT_AP_046$")
    public void get_the_test_data_for_test_case_AT_AP_046() throws Throwable {
		testData = MTSEODExcelData.getTestdata("DS_AT_AP_046");
    }
	
	
//	Advance Principal Settlement feature
//	@AT_APS_004
	@And("^User_608 get the test data for test case AT_APS_004$")
    public void get_the_test_data_for_test_case_AT_APS_004() throws Throwable {
		testData = iisAdvancePrincipalsettlementExcelData.getTestdata("DS_AT_APS_004");
    }
	
//	@AT_APS_005
	@And("^User_608 get the test data for test case AT_APS_005$")
    public void get_the_test_data_for_test_case_AT_APS_005() throws Throwable {
		testData = iisAdvancePrincipalsettlementExcelData.getTestdata("DS_AT_APS_005");
    }
	
//	@AT_APS_006
	@And("^User_608 get the test data for test case AT_APS_006$")
    public void get_the_test_data_for_test_case_AT_APS_006() throws Throwable {
		testData = iisAdvancePrincipalsettlementExcelData.getTestdata("DS_AT_APS_006");
    }
	
	
	
	/////////////////////////////////////////////////////
	@And("User_608 Update the test data id for AT_AP_043")
	public void user_update_the_test_data_id_for_at_ap_043() throws Throwable {
		testExecutionData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_043");
		testData = iisAccrualProcessExcelData.getTestdata(testExecutionData.get("DataSet ID"));
	}

	@And("User_608 Store the newly created Deal number in Temp variable")
	public void user_store_the_newly_created_deal_number_in_temp_variable() throws Throwable {
		tmp = testData.get("Deal Nbr");	    
	}
	
	@And("User_608 Update the test data id for AT_AP_044")
	public void user_update_the_test_data_id_for_at_ap_044() throws Throwable {
		testExecutionData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_044");
		testData = iisAccrualProcessExcelData.getTestdata(testExecutionData.get("DataSet ID"));
	}
	
	@And("User_608 Update the test data id for AT_AP_045")
	public void user_update_the_test_data_id_for_at_ap_045() throws Throwable {
		testExecutionData = iisAccrualProcessExcelData.getTestdata("DS_AT_AP_045");
		testData = iisAccrualProcessExcelData.getTestdata(testExecutionData.get("DataSet ID"));
	}
	
	@And("User_608 Store the newly Deal number for Accrual")
	public void user_store_the_newly_deal_number_for_accrual() throws Throwable {
		iisAccrualProcessExcelData.updateTestData(testExecutionData.get("DataSet ID"), "Deal Nbr", tmp);	    
	}
	
	/////////////////////////////////////////////////////
	// Change the Running Date
	@And("User_608 click the running date label in IIS Application")
	public void user_click_the_running_date_label_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCoreRunningDateLabel_608());
		for (int i = 0; i < 500; i++) {
			try {
				IISApplicationObj608.IISCoreRunningDateLabel_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Running Date under Running date poup in IIS Application")
	public void user_enter_the_running_date_under_running_date_poup_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCoreRunningDatePopup_608());
		IISApplicationObj608.IISCoreRunningDateInput_608().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		IISApplicationObj608.IISCoreRunningDateInput_608().sendKeys(testData.get("Running Date"),Keys.TAB);
	}

	@And("User_608 click the Use button under Running date poup in IIS Application")
	public void user_click_the_use_button_under_running_date_poup_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCoreRunningDateUseBtn_608());
		for (int i = 0; i < 500; i++) {
			try {
				IISApplicationObj608.IISCoreRunningDateUseBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupOkBtn_608());
		IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
	}

	@And("User_608 click the close button under Running date poup in IIS Application")
	public void user_click_the_close_button_under_running_date_poup_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCoreRunningDatePopupCloseBtn_608()); 
		for (int i = 0; i < 500; i++) {
			try {
				IISApplicationObj608.IISCoreRunningDatePopupCloseBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
	// Clear cache step
	@And("User_608 clear the caches in IIS Application")
	public void user_clear_the_caches_in_iis_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCoreTechDetailsIcon_608());
		IISApplicationObj608.IISCoreTechDetailsIcon_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCoreClearCacheBtn_608());
		IISApplicationObj608.IISCoreClearCacheBtn_608().click();
		
		for (int i = 0; i < 1000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				if (i==999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	

//	@AT_IC_010
	@And("User_608 click the Tracking & Incidental Charges module")
	public void user_click_the_tracking_incidental_charges_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISTrackingIncidentalChargesMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMenu_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMenu_608().click();
	}

	@And("User_608 click the Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesReverseMenu_608());
		IISApplicationObj608.IISTrackingIncidentalChargesReverseMenu_608().click();
	}

	@And("User_608 enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges")
	public void user_enter_the_track_number_in_searchgrid_under_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_608());
		IISApplicationObj608.IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_608().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_608 double click the searchgrid row in Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesReverseMenuSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISIncidentalChargesReverseMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}	    
	}

	@When("User_608 click the Reverse button in Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesReverseMenuTrackNbr_608());
	    for(int i = 0; i<= 300; i++) {
	    	try {
	    		javaScriptHelper.scrollIntoView(IISApplicationObj608.IISIncidentalChargesReverseMenuReverseBtn_608());
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    IISApplicationObj608.IISIncidentalChargesReverseMenuReverseBtn_608().click();
	    
	    // Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
	    IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupOkBtn_608());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    
	}

	@And("User_608 click the Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveReverseMenu_608());
		IISApplicationObj608.IISTrackingIncidentalChargesApproveReverseMenu_608().click();
	}

	@And("User_608 enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges")
	public void user_enter_the_track_number_in_searchgrid_under_approve_reverse_menu_in_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_608());
		IISApplicationObj608.IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_608().sendKeys(testData.get("Track Nbr"),Keys.ENTER);	    
	}

	@And("User_608 double click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesApproveReverseSearchgridRow_608());
	    for(int i = 0; i <=300; i++) {
	    	try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISIncidentalChargesApproveReverseSearchgridRow_608());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	}

	@When("User_608 click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges")
	public void user_click_the_reverse_button_in_approve_reverse_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISIncidentalChargesApproveReverseTrackNbr_608());
		for(int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISIncidentalChargesApproveReverseMenuReverseBtn_608());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		IISApplicationObj608.IISIncidentalChargesApproveReverseMenuReverseBtn_608().click();
		
		// Warning pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
	    IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
	    
	    // Information pop-up
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupOkBtn_608());
	    for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
	    		break;
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	}
	
	
//	@AT_IC_022
	@And("User_608 click the Maintenance menu under Tracking & Incidental Charges")
	public void user_click_the_maintenance_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceMenu_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceMenu_608().click();
	}

	@And("User_608 enter the Deal number in Maintenance under Tracking & Incidental Charges")
	public void user_enter_the_deal_number_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDealNbrInput_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDealNbrInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}	    
	}

	@And("User_608 enter the Charges code in Maintenance under Tracking & Incidental Charges")
	public void user_enter_the_charges_code_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargesCodeInput_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargesCodeInput_608().sendKeys(testData.get("Charges Code"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargesCodeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}	    
	}

	@And("User_608 select the Charge allocation criteria in Maintenance under Tracking & Incidental Charges")
	public void user_select_the_charge_allocation_criteria_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargeAllocationDropdown_608());
		dropDownHelper.SelectUsingVisibleText(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceChargeAllocationDropdown_608(), testData.get("Charge Allocation DD"));	    
	}

	@And("User_608 select the Dr Account in Maintenance under Tracking & Incidental Charges")
	public void user_select_the_dr_account_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountLookup_608());
		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountLookup_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountLookupRow_608());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountLookupRow_608());
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
	    }		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceDrAccountInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_608 click the Save button in Maintenance under Tracking & Incidental Charges")
	public void user_click_the_save_button_in_maintenance_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceSaveBtn_608());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj608.IISTrackingIncidentalChargesMaintenanceSaveBtn_608().click();
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
	    }
		
		// Warning popup
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
		
		// Success popup
		for(int i = 0; i <= 2000; i++) {
	    	try {
	    		IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
	    		break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	@And("User_608 click the Approve menu under Tracking & Incidental Charges")
	public void user_click_the_approve_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveMenu_608());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj608.IISTrackingIncidentalChargesApproveMenu_608().click();
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search Deal number in Approve menu under Tracking & Incidental Charges")
	public void user_search_deal_number_in_approve_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuSearchgridDealNbrInput_608());
		IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve menu under Tracking & Incidental Charges")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_tracking_incidental_charges() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuSearchgridRow_608());
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuSearchgridRow_608());
	    		break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuDealNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}

	@When("User_608 click the Approve button in Approve menu under Tracking & Incidental Charges")
	public void user_click_the_approve_button_in_approve_menu_under_tracking_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuApproveBtn_608());
		IISApplicationObj608.IISTrackingIncidentalChargesApproveMenuApproveBtn_608().click();
		
		// Warning popup
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
				
		// Success popup
		for(int i = 0; i <= 2000; i++) {
			try {
			   IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
			   break;
			} catch (Exception e) {
				if (i == 2000) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	// Repayment plan
	@And("User_608 click the Repayment plan module in IIS Application")
	public void user_click_the_repayment_plan_module_in_iis_application() throws Throwable {
		for(int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISRepaymentPlanModule_608());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		for(int i = 0; i <= 500; i++) {
			try {
			   IISApplicationObj608.IISRepaymentPlanModule_608().click();
			   break;
			} catch (Exception e) {
				if (i == 500) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the maintenance menu under Repayment plan")
	public void user_click_the_maintenance_menu_under_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenance_608());
		IISApplicationObj608.IISRepaymentPlanMaintenance_608().click();
	}

	@And("User_608 click the search button in maintenance under Repayment plan")
	public void user_click_the_search_button_in_maintenance_under_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceSearchBtn_608());
		for(int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISRepaymentPlanMaintenanceSearchBtn_608().click();
			   break;
			} catch (Exception e) {
				if (i == 500) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the Deal number in searchgrid under maintenance in Repayment plan")
	public void user_search_the_deal_number_in_searchgrid_under_maintenance_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceSearchgridDealNbrInput_608());
		IISApplicationObj608.IISRepaymentPlanMaintenanceSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row under maintenance in Repayment plan")
	public void user_double_click_the_searchgrid_row_under_maintenance_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceSearchgridRow_608());
		for(int i = 0; i <= 500; i++) {
			try {
			   clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISRepaymentPlanMaintenanceSearchgridRow_608());
			   break;
			} catch (Exception e) {
				if (i == 500) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Schedule details tab in maintenance under Repayment plan")
	public void user_click_the_schedule_details_tab_in_maintenance_under_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsTab_608());
		for(int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsTab_608().click();
			   break;
			} catch (Exception e) {
				if (i == 500) {
				Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_608 validate the incidental charges field showing hyperlink in maintenance under Repayment plan")
	public void user_validate_the_incidental_charges_field_showing_hyperlink_in_maintenance_under_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsRow_608());
		clicksAndActionsHelper.moveToElement(IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsRowIncidentalCharge_608());
		boolean incidentalCharge = IISApplicationObj608.IISRepaymentPlanMaintenanceScheduleDetailsRowIncidentalCharge_608().isDisplayed();
		Assert.assertTrue(incidentalCharge);
	}

	
//	@AT_AD_003 - Accrual Deal Feature
//	Investment Deals Combined without Trade Deal
	@And("User_608 click the Investment Deals Combined without Trade Deal menu")
	public void user_click_the_investment_deals_combined_without_trade_deal_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMenu_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMaintenanceMenu_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMaintenanceMenu_608().click();
	}

	@And("User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_party_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys(testData.get("Party Value"),Keys.TAB);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().sendKeys("727",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainPartyInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}		
		for (int i = 0; i < 1000; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		    	break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_category_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys(testData.get("Category Code"),Keys.TAB);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().sendKeys("3",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainCategoryInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
		
	}

	@And("User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_product_class_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys(testData.get("Product Class"),Keys.TAB);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainProductClassInput_608().sendKeys("100",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainDealCYnput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}

	@And("User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_amount_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys(testData.get("Amount"),Keys.TAB);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().sendKeys("10000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAmountInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}	    
	}
	
	@And("User_608 enter the yield details Margin value in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_yield_details_margin_value_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_608().sendKeys(testData.get("Yield Margin"),Keys.TAB);
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainYieldMarginInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
	}


	@And("User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_contributor_details_tab_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorTab_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorTab_608().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_contributor_details_row_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorTabRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorTabRow_608());
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_nostro_details_lookup_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608().click();
				break;
			} catch (Exception e) {
				
			}
    	}
	}

	@And("User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_double_click_the_nostro_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
	}

	@And("User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_maturity_account_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable { 	    
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}
	
	@And("User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_ok_button_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608().click();
	}
	
	@And("User_608 click the Close icon in contributor tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_close_icon_in_contributor_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsCloseIcon_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainContributorDetailsCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_save_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainSaveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainSaveBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	    
	}

	@And("User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal")
	public void user_click_the_repayment_plan_button_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 1000; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	    
	}
	
	@And("User_608 enter the No of Payments in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_enter_the_no_of_payments_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_608().clear();
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_608().sendKeys(testData.get("No of Payments"),Keys.TAB);
//		Cannot proceed popup
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_608().getAttribute("prevvalue").equals(testData.get("No of Payments"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	
	
	@And("User_608 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_uncheck_the_compounding_grace_period_check_box_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement gracePeriodCheckbox = IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608();
     	if(gracePeriodCheckbox.isSelected()) {
     		gracePeriodCheckbox.click();
     	}
	}
	@And("User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_click_the_create_schedule_button_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {    	
     	// create schedule button
     	waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608());
     	for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
     	
     	for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				
			}
		}
     	
	}

	
	@And("User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_close_the_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable_608());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@When("User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Incidental Charges")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_incidental_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmContinuePopup_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}			
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmCollateralPopup_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTitle_608());
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTextMsg_608());
		String text = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Deal Number: "+dealNbr);    	
    	iisIncidentalChargesExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	    
	}
	
	
	@And("User_608 close the Maintenance screen under Investment Deals Combined without Trade Deal")
	public void user_close_the_maintenance_screen_under_investment_deals_combined_without_trade_deal() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTabCloseIcon_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTabCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 close the Approve screen under Investment Deals Combined without Trade Deal")
	public void user_close_the_approve_screen_under_investment_deals_combined_without_trade_deal() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuCloseIcon_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	
	@Then("User_608 click the Approve menu under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenu_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal")
	public void user_search_the_deal_number_in_searchgrid_under_approve_menu_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
//		IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608().sendKeys("5317",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal")
	public void user_click_the_approve_button_approve_menu_in_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_608());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmPopupProceed_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		  	    	
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Report Popup cancel btn
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				
			}
		}
		
	}
	
	
//	@AT_AD_003
	@When("User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_accrual_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmContinuePopup_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}			
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmCollateralPopup_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTitle_608());
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTextMsg_608());
		String text = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Deal Number: "+dealNbr);    	
    	iisAccrualDealExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	    
	}
	
//	Settlement Module
	@And("User_608 click the Settlement module in IIS Application")
	public void user_click_the_settlement_module_in_iis_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementMenu_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}			    
	}

	@And("User_608 click the maintenance menu under Settlement module")
	public void user_click_the_maintenance_menu_under_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenance_608());
		IISApplicationObj608.IISSettlementMenuMaintenance_608().click();
	}

	@And("User_608 enter the Deal number in maintenance menu under Settlement")
	public void user_enter_the_deal_number_in_maintenance_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenanceDealNbrInput_608());
		IISApplicationObj608.IISSettlementMenuMaintenanceDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementMenuMaintenanceDealNbrInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_608 enter the Amount received from party in maintenance menu under Settlement")
	public void user_enter_the_amount_received_from_party_in_maintenance_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenancePartyAmtInput_608());
		IISApplicationObj608.IISSettlementMenuMaintenancePartyAmtInput_608().sendKeys(testData.get("Party Amt"),Keys.TAB);
//		IISApplicationObj608.IISSettlementMenuMaintenancePartyAmtInput_608().sendKeys("1000",Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementMenuMaintenancePartyAmtInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_608 click the Automatic Allocation button in maintenance menu under Settlement")
	public void user_click_the_automatic_allocation_button_in_maintenance_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementMenuMaintenanceAutoAllocationBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		IISApplicationObj608.IISSettlementMenuMaintenanceAutoAllocationBtn_608().click();
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenanceScheduleDetailsTable_608());
	}

	@When("User_608 click the Save button in maintenance menu under Settlement")
	public void user_click_the_save_button_in_maintenance_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenanceSaveBtn_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementMenuMaintenanceSaveBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuMaintenanceSuccessPopupText_608());
//		String text = IISApplicationObj608.IISSettlementMenuMaintenanceSuccessPopupText_608().getText();
//		System.err.println("Text Message: "+text);
		String settlementNbr = IISApplicationObj608.IISSettlementMenuMaintenanceSuccessPopupText_608().getText().substring(25, 29);
    	System.err.println("Settlement Number: "+settlementNbr);    	
    	iisAccrualDealExcelData.updateTestData(testData.get("DataSet ID"),"Settlement Nbr", settlementNbr);
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	
	@And("User_608 close the Settlement Maintenance menu")
	public void user_close_the_settlement_maintenance_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementMaintenanceMenuCloseIcon_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementMaintenanceMenuCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_608 click the approve menu under Settlement module")
	public void user_click_the_approve_menu_under_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuApprove_608()); 
		IISApplicationObj608.IISSettlementMenuApprove_608().click();
	}

	@And("User_608 enter the settlement number in searchgrid under approve menu in Settlement")
	public void user_enter_the_settlement_number_in_searchgrid_under_approve_menu_in_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuApproveSearchgridSettlementNbrInput_608());
		IISApplicationObj608.IISSettlementMenuApproveSearchgridSettlementNbrInput_608().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
//		IISApplicationObj608.IISSettlementMenuApproveSearchgridSettlementNbrInput_608().sendKeys("9581",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in approve menu under Settlement")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementMenuApproveSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISSettlementMenuApproveSearchgridRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementMenuApproveSettlementNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				
			}
    	}
		
	}

	@And("User_608 click the Approve button in approve menu under Settlement")
	public void user_click_the_approve_button_in_approve_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISSettlementApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmPopupProceed_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		// Report popup Cancel
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 close the Settlement Approve menu")
	public void user_close_the_settlement_approve_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementApproveMenuCloseIcon_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementApproveMenuCloseIcon_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	Settlement --> Reverse
	@And("User_608 click the Reverse menu under Settlement module")
	public void user_click_the_reverse_menu_under_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementReverseMenu_608()); 
		IISApplicationObj608.IISSettlementReverseMenu_608().click();
	}

	@And("User_608 search the settlement number in searchgrid under Reverse menu in Settlement")
	public void user_search_the_settlement_number_in_searchgrid_under_reverse_menu_in_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementReverseSearchgirdSettlementNbrInput_608());
		IISApplicationObj608.IISSettlementReverseSearchgirdSettlementNbrInput_608().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
//		IISApplicationObj608.IISSettlementReverseSearchgirdSettlementNbrInput_608().sendKeys("9583",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Reverse menu under Settlement")
	public void user_double_click_the_searchgrid_row_in_reverse_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementReverseSearchgirdRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISSettlementReverseSearchgirdRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementReverseSettlementNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}

	@And("User_608 click the Reverse button in Reverse menu under Settlement")
	public void user_click_the_reverse_button_in_reverse_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementReverseMenuReverseBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISSettlementReverseMenuReverseBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		
	}
	
	
//	Settlement --> Approve Reverse
	@And("User_608 click the Approve Reverse menu under Settlement module")
	public void user_click_the_approve_reverse_menu_under_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementApproveReverseMenu_608()); 
		IISApplicationObj608.IISSettlementApproveReverseMenu_608().click();
	}

	@And("User_608 search the settlement number in searchgrid under Approve Reverse menu in Settlement")
	public void user_search_the_settlement_number_in_searchgrid_under_approve_reverse_menu_in_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementApproveReverseSearchgirdSettlementNbrInput_608());
		IISApplicationObj608.IISSettlementApproveReverseSearchgirdSettlementNbrInput_608().sendKeys(testData.get("Settlement Nbr"),Keys.ENTER);
//		IISApplicationObj608.IISSettlementApproveReverseSearchgirdSettlementNbrInput_608().sendKeys("9583",Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve Reverse menu under Settlement")
	public void user_double_click_the_searchgrid_row_in_approve_reverse_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementApproveReverseSearchgirdRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISSettlementApproveReverseSearchgirdRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementApproveReverseSettlementNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
		
	}

	@And("User_608 click the Reverse button in Approve Reverse menu under Settlement")
	public void user_click_the_reverse_button_in_approve_reverse_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementApproveReverseMenuReverseBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISSettlementApproveReverseMenuReverseBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		// Report popup Cancel
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	
//	Advance principal settlement module
//	AT_AD_018
	@And("User_608 click the Advance principal settlement module")
	public void user_click_the_advance_principal_settlement_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISAdvancePrincipalSettlementModule_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		IISApplicationObj608.IISAdvancePrincipalSettlementModule_608().click();	    
	}

	@And("User_608 click the maintenance under Advance principal settlement module")
	public void user_click_the_maintenance_under_advance_principal_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementMaintenance_608());  
		IISApplicationObj608.IISAdvancePrincipalSettlementMaintenance_608().click();
	}

	@And("User_608 enter the Deal number in maintenance screen under Advance principal settlement")
	public void user_enter_the_deal_number_in_maintenance_screen_under_advance_principal_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceDealNbrInput_608());
		IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceDealNbrInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Advance principal in maintenance screen under Advance principal settlement")
	public void user_enter_the_advance_principal_in_maintenance_screen_under_advance_principal_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceAdvancePrincipalInput_608());
		IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceAdvancePrincipalInput_608().clear();
		IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceAdvancePrincipalInput_608().sendKeys(testData.get("Advance Principal"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceAdvancePrincipalInput_608().getAttribute("prevvalue")
						.equals(testData.get("Advance Principal"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Reschedule&Allocate button in maintenance screen under Advance principal settlement")
	public void user_click_the_reschedule_allocate_button_in_maintenance_screen_under_advance_principal_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceRescheduleAllocateBtn_608());
	    for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceRescheduleAllocateBtn_608().click();
			} catch (Exception e) {
				
			}
	    }	    
//	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
//		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
	    for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
			} catch (Exception e) {
				
			}
	    }
	    
	    waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceScheduleDetailsTable_608());
	}

	@When("User_608 click the Save button in maintenance screen under Advance principal settlement")
	public void user_click_the_save_button_in_maintenance_screen_under_advance_principal_settlement() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceScheduleDetailsTable_608());
		for (int i = 0; i <= 1000; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceSaveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for(int i = 0; i <= 500; i++) {
	    	try {
	    		IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceSaveBtn_608().click();
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
	    }
		// Success popup Ok btn
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}	
	
	@And("User_608 click the Approve menu in Advance principal settlement module")
	public void user_click_the_approve_menu_in_advance_principal_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenu_608());
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the Deal number in Approve menu under Advance principal settlement module")
	public void user_search_the_deal_number_in_approve_menu_under_advance_principal_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenuSearchgridDealNbrInput_608());
		IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenuSearchgridDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	}

	@And("User_608 double click the searchgrid row in Approve menu under Advance principal settlement module")
	public void user_double_click_the_searchgrid_row_in_approve_menu_under_advance_principal_settlement_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenuSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenuDealNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
	}

	@When("User_608 click the Approve button in Approve menu under Advance principal settlement module")
	public void user_click_the_approve_button_in_approve_menu_under_advance_principal_settlement_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISAdvancePrincipalSettlementApproveMenuApproveBtn_608().click();
		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmPopupProceed_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		
//		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmPopupProceed_608());
//		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
		  	  
//		Success popup Ok btn
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Report popup cancel button
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				
			}
		}	    
	}
	
	
//	Accrual Process Feature
	@When("User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Process")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_accrual_process() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
//		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmContinuePopup_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}			
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmCollateralPopup_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTitle_608());
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTextMsg_608());
		String text = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Deal Number: "+dealNbr);    	
    	iisAccrualProcessExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		    
	}
	
	
//	@AT_AP_020
	@And("User_608 click the Periodical Processing module in IIS Application")
	public void user_click_the_periodical_processing_module_in_iis_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISPeriodicalProcessingModule_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISPeriodicalProcessingModule_608());
		IISApplicationObj608.IISPeriodicalProcessingModule_608().click();
	}

	@And("User_608 click the Post Accrual Menu under Periodical Processing")
	public void user_click_the_post_accrual_menu_under_periodical_processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISPostAccrualsMenu_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISPostAccrualsMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Final Accruals under Post Accrual in Periodical Processing")
	public void user_click_the_final_accruals_under_post_accrual_in_periodical_processing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISFinalAccrualsSubMenu_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISFinalAccrualsSubMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 check the Specific deal flag under Final Accruals in Post Accrual")
	public void user_check_the_specific_deal_flag_under_final_accruals_in_post_accrual() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISFinalAccrualsSpecificDealCheckbox_608());
	    if (!(IISApplicationObj608.IISFinalAccrualsSpecificDealCheckbox_608().isSelected())) {
	    	IISApplicationObj608.IISFinalAccrualsSpecificDealCheckbox_608().click();
		}
	}

	@And("User_608 enter the Deal number in Final Accruals under Post Accrual")
	public void user_enter_the_deal_number_in_final_accruals_under_post_accrual() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISFinalAccrualsSpecificDealInput_608());
		IISApplicationObj608.IISFinalAccrualsSpecificDealInput_608().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISFinalAccrualsSpecificDealInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_608 enter the From Date in Final Accruals under Post Accrual")
	public void user_enter_the_from_date_in_final_accruals_under_post_accrual() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISFinalAccrualsFromDateInput_608());		
		IISApplicationObj608.IISFinalAccrualsFromDateInput_608().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		IISApplicationObj608.IISFinalAccrualsFromDateInput_608().sendKeys(testData.get("Accruals From"),Keys.TAB);
	}

	@And("User_608 enter the To Date in Final Accruals under Post Accrual")
	public void user_enter_the_to_date_in_final_accruals_under_post_accrual() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISFinalAccrualsToDateInput_608());
		IISApplicationObj608.IISFinalAccrualsToDateInput_608().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		IISApplicationObj608.IISFinalAccrualsToDateInput_608().sendKeys(testData.get("Accruals To"),Keys.TAB);
	}

	@When("User_608 click the OK button in Final Accruals under Post Accrual")
	public void user_click_the_ok_button_in_final_accruals_under_post_accrual() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISFinalAccrualsOkBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISFinalAccrualsOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Report Popup cancel btn
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				
			}
		}
	}
	
	
//	Calculators module --> @AT_AP_021
	@And("User_608 click the Calculators module in IIS Application")
	public void user_click_the_calculators_module_in_iis_application() {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISCalculatorsModule_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISCalculatorsModule_608().click();
	}

	@And("User_608 click the Reschedule Calculator With Profit menu under Calculators")
	public void user_click_the_reschedule_calculator_with_profit_menu_under_calculators() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISCalculatorsRescheduleCalculatorWithProfit_608());
		IISApplicationObj608.IISCalculatorsRescheduleCalculatorWithProfit_608().click();
	}

	@And("User_608 enter the Deal number in Reschedule Calculator With Profit menu")
	public void user_enter_the_deal_number_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRescheduleCalculatorWithProfitDealNbrInput_608());
		IISApplicationObj608.IISRescheduleCalculatorWithProfitDealNbrInput_608().sendKeys(testData.get("Deal Nbr"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISRescheduleCalculatorWithProfitDealNbrInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_608 click the Repayment Details panel in Reschedule Calculator With Profit menu")
	public void user_click_the_repayment_details_panel_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRescheduleCalculatorWithProfitRepaymentDetailsPanel_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISRescheduleCalculatorWithProfitRepaymentDetailsPanel_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the First Payment After under Repayment Details panel in Reschedule Calculator With Profit menu")
	public void user_enter_the_first_payment_after_under_repayment_details_panel_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_608());
		IISApplicationObj608.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_608().clear();
		IISApplicationObj608.IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_608().sendKeys(testData.get("First Pay After"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj608.IISRescheduleCalculatorWithProfitDealNbrInput_608().getAttribute("prevvalue")
						.equals(testData.get(""))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_608 click the Calculate button in Reschedule Calculator With Profit menu")
	public void user_click_the_calculate_button_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRescheduleCalculatorWithProfitCalculateBtn_608());	
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISRescheduleCalculatorWithProfitCalculateBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		// Success Popup OK Btn
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@When("User_608 click the Update button in Reschedule Calculator With Profit menu")
	public void user_click_the_update_button_in_reschedule_calculator_with_profit_menu() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRescheduleCalculatorWithProfitUpdateBtn_608());	
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISRescheduleCalculatorWithProfitUpdateBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
		
		// Success Popup OK Btn
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_SuccessPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	Reschedule Repayment plan module
	@And("User_608 click the Reschedule Repayment plan module in IIS Application")
	public void user_click_the_reschedule_repayment_plan_module_in_iis_application() {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISRescheduleRepaymentPlanModule_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISRescheduleRepaymentPlanModule_608().click();	    
	}

	@And("User_608 click the Approve menu under Reschedule Repayment plan")
	public void user_click_the_approve_menu_under_reschedule_repayment_plan() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRescheduleRepaymentPlanApproveMenu_608()); 
		IISApplicationObj608.IISRescheduleRepaymentPlanApproveMenu_608().click();
	}

	@And("User_608 search the Deal number in approve menu under Reschedule Repayment plan")
	public void user_search_the_deal_number_in_approve_menu_under_reschedule_repayment_plan() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRescheduleRepaymentPlanApproveSearchgridDealInput_608());
		IISApplicationObj608.IISRescheduleRepaymentPlanApproveSearchgridDealInput_608().sendKeys(testData.get("Deal Nbr"),Keys.ENTER);
	}

	@And("User_608 double click the searchgird row in approve menu under Reschedule Repayment plan")
	public void user_double_click_the_searchgird_row_in_approve_menu_under_reschedule_repayment_plan() {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISRescheduleRepaymentPlanApproveSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(IISApplicationObj608.IISRescheduleRepaymentPlanApproveSearchgridRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISRescheduleRepaymentPlanApproveMenuDealNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_608 click the Approve button in approve menu under Reschedule Repayment plan")
	public void user_click_the_approve_button_in_approve_menu_under_reschedule_repayment_plan() {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISRescheduleRepaymentPlanApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		IISApplicationObj608.IISRescheduleRepaymentPlanApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Report Popup cancel btn
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupCancelBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	

	
//	@AT_AP_022
	@And("User_608 enter the Tenure in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_tenure_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTenureInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTenureInput_608().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTenureInput_608().sendKeys(testData.get("Tenure"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTenureInput_608().getAttribute("prevvalue")
						.equals(testData.get("Tenure"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_ConfirmPopupOkBtn_608());
		IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();	
	}
	
	@And("User_608 select the Tenure dropdown as Years in maintenance under Investment Deals Combined without Trade Deal")
	public void user_select_the_tenure_dropdown_as_years_in__maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTenureDropdown_608()); 
		dropDownHelper.SelectUsingVisibleText(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTenureDropdown_608(),
				testData.get("Tenure DD"));
	}	
	
	@And("User_608 select the Profit Calculation as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_profit_calculation_as_diminising_returns_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentProfitCalculationMethodDropdown_608());
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentProfitCalculationMethodDropdown_608(),
						testData.get("Profit Calculation"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the Profit Recognition as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_profit_recognition_as_diminising_returns_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentProfitRecogMethodDropdown_608());
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentProfitRecogMethodDropdown_608(),
						testData.get("Profit Recognition"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		    
	}

	@And("User_608 enter the Grace period in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_enter_the_grace_period_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput_608().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput_608().sendKeys(testData.get("Grace Period"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainTenureInput_608().getAttribute("prevvalue")
						.equals(testData.get("Grace Period"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_608 select the Grace period dropdown as Years in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_grace_period_dropdown_as_years_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodDropdown_608()); 
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodDropdown_608(),
						testData.get("Grace Period DD"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	
//	MTS Application
//	@AT_AP_023_02
	@And("User_608 click the Parameter module in MTS Application")
	public void user_click_the_parameter_module_in_mts_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParameterModule_608());
		for (int i = 0; i <= 500; i++) {
			try {
				MTSApplicationObj608.MTSParameterModule_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Batch menu under Parameter module")
	public void user_click_the_batch_menu_under_parameter_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParameterBatch_608()); 
		for (int i = 0; i <= 500; i++) {
			try {
				MTSApplicationObj608.MTSParameterBatch_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the maintenance screen under Batch menu")
	public void user_click_the_maintenance_screen_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParameterBatchMaintenance_608()); 
		for (int i = 0; i <= 500; i++) {
			try {
				MTSApplicationObj608.MTSParameterBatchMaintenance_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Additional Ref number in maintenance under Batch menu")
	public void user_enter_the_additional_ref_number_in_maintenance_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMaintenanceAdditionalRefNbr_608());
		MTSApplicationObj608.MTSParamBatchMaintenanceAdditionalRefNbr_608().sendKeys(testData.get("Additional Ref"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(MTSApplicationObj608.MTSParamBatchMaintenanceAdditionalRefNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_608 enter the Brief name in maintenance under Batch menu")
	public void user_enter_the_brief_name_in_maintenance_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMaintenanceBriefName_608());
		MTSApplicationObj608.MTSParamBatchMaintenanceBriefName_608().sendKeys(testData.get("Brief Name"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(MTSApplicationObj608.MTSParamBatchMaintenanceBriefName_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}	    
	}

	@And("User_608 enter the Long name in maintenance under Batch menu")
	public void user_enter_the_long_name_in_maintenance_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMaintenanceLongName_608());
		MTSApplicationObj608.MTSParamBatchMaintenanceLongName_608().sendKeys(testData.get("Long Name"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(MTSApplicationObj608.MTSParamBatchMaintenanceLongName_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}	    
	}

	@And("User_608 enter the Menu ref number in maintenance under Batch menu")
	public void user_enter_the_menu_ref_number_in_maintenance_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMaintenanceMenuRefNbr_608());
		MTSApplicationObj608.MTSParamBatchMaintenanceMenuRefNbr_608().sendKeys(testData.get("Menu Ref"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(MTSApplicationObj608.MTSParamBatchMaintenanceMenuRefNbr_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}	    
	}

	@And("User_608 select Periodicity as Daily in maintenance under Batch menu")
	public void user_select_periodicity_as_daily_in_maintenance_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMaintenancePeriodicityDropdown_608());
		for(int i = 0; i <= 500; i++) {
    		try {
				dropDownHelper.SelectUsingVisibleText(MTSApplicationObj608.MTSParamBatchMaintenancePeriodicityDropdown_608(), testData.get("Periodicity DD"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_608 click the Oracle BAJ under Companies in Batch Details tab under maintenance")
	public void user_click_the_oracle_baj_under_companies_in_batch_details_tab_under_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMainBatchDetailsTabOracleBAJ_608()); 
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchMainBatchDetailsTabOracleBAJ_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 select the Head office under Oracle BAJ in Batch Details tab under maintenance")
	public void user_select_the_head_office_under_oracle_baj_in_batch_details_tab_under_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_608()); 
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 select the ICD Treasury-Invest under Oracle BAJ in Batch Details tab under maintenance")
	public void user_select_the_icd_treasury_invest_under_oracle_baj_in_batch_details_tab_under_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_608()); 
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 click the Financing Treasury under processes in Batch Details tab under maintenance")
	public void user_click_the_financing_treasury_under_processes_in_batch_details_tab_under_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMainProcessFinancingTreasury_608()); 
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchMainProcessFinancingTreasury_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 select the Create settlement under Financing Treasury in Batch Details tab under maintenance")
	public void user_select_the_create_settlement_under_financing_treasury_in_batch_details_tab_under_maintenance() throws Throwable {	    
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMainProcessFinancingTreasuryCreateSettlement_608()); 
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchMainProcessFinancingTreasuryCreateSettlement_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the Approve settlement under Financing Treasury in Batch Details tab under maintenance")
	public void user_select_the_approve_settlement_under_financing_treasury_in_batch_details_tab_under_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMainProcessFinancingTreasuryApproveSettlement_608()); 
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchMainProcessFinancingTreasuryApproveSettlement_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 select the Profit Accrual Process under Financing Treasury in Batch Details tab under maintenance")
	public void user_select_the_profit_accrual_process_under_financing_treasury_in_batch_details_tab_under_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_608()); 
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 click the Batch Control tab in maintenance under Batch menu")
	public void user_click_the_batch_control_tab_in_maintenance_under_batch_menu() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(MTSApplicationObj608.MTSParamBatchMainBatchControlTab_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchMainBatchControlTab_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 select the Process Batch as Manual under Batch Control tab in maintenance")
	public void user_select_the_process_batch_as_manual_under_batch_control_tab_in_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchMainBatchControlTabProcessBatchDropdown_608());
		for(int i = 0; i <= 500; i++) {
    		try {
				dropDownHelper.SelectUsingVisibleText(MTSApplicationObj608.MTSParamBatchMainBatchControlTabProcessBatchDropdown_608(), testData.get("Process Batch DD"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}	    
	}

	@When("User_608 click Save btn under maintenance in under Batch menu")
	public void user_click_save_btn_under_maintenance_in_under_batch_menu() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(MTSApplicationObj608.MTSParamBatchMaintenanceSaveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		MTSApplicationObj608.MTSParamBatchMaintenanceSaveBtn_608().click();
		
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	
	@And("User_608 click the Approve screen under Batch menu")
	public void user_click_the_approve_screen_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchApproveMenu_608()); 
		for (int i = 0; i <= 300; i++) {
			try {
				MTSApplicationObj608.MTSParamBatchApproveMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the Additional Ref number in Approve screen searchgrid under Batch menu")
	public void user_search_the_additional_ref_number_in_approve_screen_searchgrid_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchApproveMenuSearchgridAdditionalRefInput_608());
		MTSApplicationObj608.MTSParamBatchApproveMenuSearchgridAdditionalRefInput_608().sendKeys(testData.get("Additional Ref"),Keys.ENTER);
	}

	@And("User_608 double click the searchgird row in Approve menu under Batch menu")
	public void user_double_click_the_searchgird_row_in_approve_menu_under_batch_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSParamBatchApproveMenuSearchgridRow_608());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(MTSApplicationObj608.MTSParamBatchApproveMenuSearchgridRow_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(MTSApplicationObj608.MTSParamBatchApproveMenuAdditionalRef_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_608 click the Approve button in Approve menu under Batch menu")
	public void user_click_the_approve_button_in_approve_menu_under_batch_menu() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(MTSApplicationObj608.MTSParamBatchApproveMenuApproveBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		MTSApplicationObj608.MTSParamBatchApproveMenuApproveBtn_608().click();
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
		
		for (int i = 0; i <= 1000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}		

	}
	
	
	@And("User_608 Refresh the MTS Application")
	public void user_refresh_the_mts_application() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				driver.navigate().refresh();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 click the Process module in MTS Application")
	public void user_click_the_process_module_in_mts_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSProcessModule_608());
		MTSApplicationObj608.MTSProcessModule_608().click();
	}

	@And("User_608 click the Batch Process menu under Process module")
	public void user_click_the_batch_process_menu_under_process_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSProcessBatchProcessMenu_608());
		for (int i = 0; i <= 500; i++) {
			try {
				MTSApplicationObj608.MTSProcessBatchProcessMenu_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the created batch option under Batch process menu")
	public void user_click_the_created_batch_option_under_batch_process_menu() throws Throwable {
		Thread.sleep(5000);
		String newBatch = testData.get("Brief Name");
		System.err.println("Brief Name: "+newBatch);
		WebElement newBatchmenu = driver.findElement(By.xpath("//td[contains(text(),'"+newBatch+"')]"));
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(newBatchmenu);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, newBatchmenu);
		for (int i = 0; i <= 500; i++) {
			try {
				newBatchmenu.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click the batch run menu under new batch in Batch Process")
	public void user_click_the_batch_run_menu_under_new_batch_in_batch_process() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSProcessBatchProcessMenuBatchRun_608());
		for (int i = 0; i <= 500; i++) {
			try {
				MTSApplicationObj608.MTSProcessBatchProcessMenuBatchRun_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the batch run date in batch run menu under Batch Process")
	public void user_enter_the_batch_run_date_in_batch_run_menu_under_batch_process() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSProcessBatchProcessMenuBatchRunDate_608());
		MTSApplicationObj608.MTSProcessBatchProcessMenuBatchRunDate_608().sendKeys(testData.get("Batch Run Date"),Keys.TAB);	    
	}

	@When("User_608 click the Run button in  batch run menu under Batch Process")
	public void user_click_the_run_button_in_batch_run_menu_under_batch_process() {
		waitHelper.waitForElementwithFluentwait(driver, MTSApplicationObj608.MTSProcessBatchProcessMenuBatchRunOptRunBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				MTSApplicationObj608.MTSProcessBatchProcessMenuBatchRunOptRunBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
	}
	
	
	
	
//	Advance Principal Settlement feature
	@And("User_608 click the validate button in maintenance under Investment Deals Combined without Trade Deal for Advance Principal Settlement")
	public void user_validate_button_in_maintenance_under_investment_deals_combined_without_trade_deal_for_advance_principal_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainValidateBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmContinuePopup_608());
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
//				if (i == 2000) {
//					Assert.fail(e.getMessage());
//				}
			}
		}			
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISApproveMenuConfirmCollateralPopup_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_ConfirmPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTitle_608());
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_InformationPopupTextMsg_608());
		String text = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText();
		System.err.println("Text Message: "+text);
		String dealNbr = IISApplicationObj608.IIS_InformationPopupTextMsg_608().getText().substring(18, 22);
    	System.err.println("Deal Number: "+dealNbr);    	
    	iisAdvancePrincipalsettlementExcelData.updateTestData(testData.get("DataSet ID"),"Deal Nbr", dealNbr);
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	    
	}
	
	
//	@AT_APS_006
	@And("User_608 enter the Agency fee value in maintenance under Investment Deals Combined without Trade Deal")
	public void user_enter_the_agency_fee_value_in_maintenance_under_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAgencyFeeInput_608());
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAgencyFeeInput_608().sendKeys(testData.get("Agency Fee"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAgencyFeeInput_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}
	
	@And("User_608 enter the Compounding During Grace Period in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_enter_the_compounding_during_grace_period_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCompoundGracePeriodInput_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCompoundGracePeriodInput_608().clear();
		IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCompoundGracePeriodInput_608().sendKeys(testData.get("Compound Grace Period"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainAgencyFeeInput_608().getAttribute("prevvalue")
						.equals(testData.get("Compound Grace Period"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@And("User_608 select the Compounding During Grace Period dropdown in repayment tab under maintenance in Investment Deals Combined without Trade Deal")
	public void user_select_the_compounding_during_grace_period_dropdown_in_repayment_tab_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCompoundGracePeriodDropdown_608());  
		for (int i = 0; i <= 500; i++) {
			try {
				dropDownHelper.SelectUsingVisibleText(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentCompoundGracePeriodDropdown_608()
						, testData.get("Compound Grace Period DD"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_608 validate the Agency fees column in schedule details tab in repayment under maintenance in Investment Deals Combined without Trade Deal")
	public void user_validate_the_agency_fees_column_in_schedule_details_tab_in_repayment_under_maintenance_in_investment_deals_combined_without_trade_deal() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable_608());
		for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTabAgencyFeesColumn_608());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		Assert.assertTrue(IISApplicationObj608.IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTabAgencyFeesColumn_608().isDisplayed());
	}
	
	
	////
	@And("User_608 click the Settlement maintenance tab in IIS Application")
	public void user_click_the_settlement_maintenance_tab_in_iis_application() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementMaintenanceTab_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementMaintenanceTab_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 click the Advance principal settlement maintenance in IIS Application")
	public void user_click_the_advance_principal_settlement_maintenance_in_iis_application() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceTab_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISAdvancePrincipalSettlementMaintenanceTab_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 validate the Settlement exists popup in Advance principal settlement")
	public void user_validate_the_settlement_exists_popup_in_advance_principal_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementExistsPopup_608());
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				
			}
		}	
	}
	
	@When("User_608 click the Reject button in maintenance menu under Settlement")
	public void user_click_the_reject_button_in_maintenance_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javaScriptHelper.scrollIntoView(IISApplicationObj608.IISSettlementApproveMenuRejectBtn_608());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		for (int i = 0; i <= 300; i++) {
			try {
				IISApplicationObj608.IISSettlementApproveMenuRejectBtn_608().click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Reject Reason code in maintenance menu under Settlement")
	public void user_enter_the_reject_reason_code_in_maintenance_menu_under_settlement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IISSettlementApproveMenuRejectReasonCode_608());
		IISApplicationObj608.IISSettlementApproveMenuRejectReasonCode_608().sendKeys(testData.get("Reason Code"),Keys.TAB);
		for(int i = 0; i <= 500; i++) {
    		try {
				if(!(IISApplicationObj608.IISSettlementApproveMenuRejectReasonCode_608().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
    	}
	}

	@When("User_608 click the reject reason popup Reject button in maintenance menu under Settlement")
	public void user_click_the_reject_reason_popup_reject_button_in_maintenance_menu_under_settlement() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				IISApplicationObj608.IISSettlementApproveMenuRejectReasonPopupRejectBtn_608().click();
				break;
			} catch (Exception e) {
				
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, IISApplicationObj608.IIS_WarningPopupOkBtn_608());
		IISApplicationObj608.IIS_WarningPopupOkBtn_608().click();
		
		for (int i = 0; i <= 2000; i++) {
			try {
				IISApplicationObj608.IIS_InformationPopupOkBtn_608().click();
				break;
			} catch (Exception e) {
				
			}
		}
	    
	}
	
	
	
}
