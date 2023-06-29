package stepdefinitions;

import java.util.HashMap;
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
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.DrawDownRequest_PageObjects_609;
import pageobjects.Facilities_Management_PageObjects_609;
import resources.BaseClass;

public class DrawDownRequest_609 extends BaseClass{
	
		int randomNumber;
		int TotalDownPaymentPercentcalc;
		String DownPayment;
		String DownPaymentToVendor;
		int TotalDownPaymentcalc;
		
		WebDriver driver = BaseClass.driver;
		WaitHelper waitHelper = new WaitHelper(driver);
		DropDownHelper dropdownhelper = new DropDownHelper(driver);
		ConfigFileReader configFileReader = new ConfigFileReader();
		JavascriptHelper javascripthelper = new JavascriptHelper(driver);
		ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		
		FMSLogin FMSLogin = new FMSLogin(driver);
		Facilities_Management_PageObjects_609 FacilitiesManagementPageObjects609 = new Facilities_Management_PageObjects_609(driver);
		DrawDownRequest_PageObjects_609 DrawDownRequestPageobjects_609 = new DrawDownRequest_PageObjects_609(driver);
		
		String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
		ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
		ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
		ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath, "FMS_WIFAK_ApplicationTestData", "DataSet ID");
		ExcelData fmsFacilitiesManagementExcelData = new ExcelData(TestDataPath, "FMS_Facilities_Management", "DataSet ID");
		ExcelData fmsDrawDownRequestExcelData = new ExcelData(TestDataPath, "FMS_DrawDownRequest_609", "DataSet ID");
		Map<String, String> testData;
		Map<String, String> fmsLoginTestData = new HashMap<>();
		
		 @And("User_609 click Technical details")
	      public void user_609_click_technical_details() {
			 waitHelper.waitForElementwithFluentwait(driver,DrawDownRequestPageobjects_609.technicalDetails_609());
	    	  clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.technicalDetails_609());
	    	  clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.technicalDetails_609());
	      }

	      @And("User_609 click clear caches")
	      public void user_609_click_clear_caches() {
	    	  waitHelper.waitForElementwithFluentwait(driver,DrawDownRequestPageobjects_609.FSM_ClearCacheInTechnicalDetailsIcon_609());
	    	  clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.FSM_ClearCacheInTechnicalDetailsIcon_609());
	    	  clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.FSM_ClearCacheInTechnicalDetailsIcon_609());
	      }
		
		
	
		
		
		
		///**************************************************************************************///
		
		@And("User_609 Click on the Control Record submenu")
		public void user_609_click_on_the_control_record_submenu() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Parameters_ControlRecord());
			clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord());
		    
		}

		@And("User_609 Click on Update After Approve screen in Control Record submenu")
		public void user_609_click_on_update_after_approve_screen_in_control_record_submenu() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove());
			clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove());
		    
		}

		@And("User_609 Enable the flag General Limit By Cif in Control Record")
		public void user_609_enable_the_flag_general_limit_by_cif_in_control_record() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif());
			clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif());
			WebElement GeneralLimitCif = DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif();
		    try {
				if (GeneralLimitCif.isEnabled() && GeneralLimitCif.isSelected()) {
					Assert.assertTrue(true);
				}
				else {
					GeneralLimitCif.click();
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		@And("User_609 Disable the flag General Limit By Cif in Control Record")
		public void user_609_disable_the_flag_general_limit_by_cif_in_control_record() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif());
			clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif());
			WebElement GeneralLimitCif = DrawDownRequestPageobjects_609.Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif();
		    try {
				if (GeneralLimitCif.isSelected() && GeneralLimitCif.isEnabled()) {
					GeneralLimitCif.click();
				}
				else {
					Assert.assertTrue(true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}

		@And("User_609 Click on Update in Control Record")
		public void user_609_click_on_update_in_control_record() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.ControlRecord_UpdateAfterApprove_Update());
			clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.ControlRecord_UpdateAfterApprove_Update());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.ControlRecord_UpdateAfterApprove_Update());
		    
		}

		@And("User_609 Click on the Approve Screen in Control Record submenu")
		public void user_609_click_on_the_approve_screen_in_control_record_submenu() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Parameters_ControlRecord_Approve());
			clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord_Approve());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Parameters_ControlRecord_Approve());
		    
		}

		@And("User_609 Click on Approve in Approve Screen in Control Record submenu")
		public void user_609_click_on_approve_in_approve_screen_in_control_record_submenu() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.ControlRecord_Approve_Approve());
			clicksAndActionHelper.moveToElement(DrawDownRequestPageobjects_609.ControlRecord_Approve_Approve());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.ControlRecord_Approve_Approve());
		    
		}
		
		@And("^User_609 Check the Fx Settlement Expiry date is Displayed$")
		public void User_609_Check_the_Fx_Settlement_Expiry_date_is_Displayed() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver,DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetails_FXSettlementExpiryDate());
			WebElement FXSettlementExpiryDate = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetails_FXSettlementExpiryDate();
			try {
				if (FXSettlementExpiryDate.isEnabled()) {
					Assert.assertEquals(FXSettlementExpiryDate.isEnabled(), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		
}
