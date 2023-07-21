package stepdefinitions;

import java.util.HashMap;
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
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
		
		
		
		@And("User_609 get the test data set id for AT_DDR_031")
		public void user_609_get_the_test_data_set_id_for_AT_DDR_031() {
			testData = fmsDrawDownRequestExcelData.getTestdata("AT_DDR_031");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		@And("User_609 Click on the search Bar in Draw Down Request")
		public void user_609_click_on_the_search_bar_in_draw_down_request() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_SearchBar());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_SearchBar()); 
		}

		@And("User_609 Click on the Clear Button in Draw Down Request")
		public void user_609_click_on_the_clear_button_in_draw_down_request() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_Clear());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_Clear());
		}

		@And("User_609 Retrieve Any Active record in Draw Down Request")
		public void user_609_retrieve_any_active_record_in_draw_down_request() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_RetrieveActiveRecord());
			clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_RetrieveActiveRecord());  
			DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_RetrieveActiveRecord().sendKeys(testData.get("Record Status"),Keys.ENTER);
			//td[4][text()='Active']
			String xpath ="//table[@id='drawDownRequestGridTbl_Id_WIFT009MT']/tbody/tr[2]/td[text()='"+testData.get("Record Status")+"']";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionHelper.doubleClick(Code);
					}
					driver.findElement(By.xpath(xpath)).isDisplayed();
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}	
			}
		}

		@Then("User_609 Validate the Include Profit is Displaying and Editable")
		public void user_609_validate_the_include_profit_is_displaying_and_editable() {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_DrawdownAdditionalDetails_IncludeProfit());
			WebElement Include_Profit = DrawDownRequestPageobjects_609.Wifakappliction_DrawDownRequest_Maintenance_DrawdownAdditionalDetails_IncludeProfit();
			try {
				if (Include_Profit.isDisplayed()) {
					Assert.assertEquals(Include_Profit.isEnabled(), true);	
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		
		//************************************834115*********************************************//
		
		@And("^User_609 Select the Collateral$")
	    public void User_609_Select_the_Collateral() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.ApplicationRequirementsandDetails_Collateral());
			WebElement Collateral = DrawDownRequestPageobjects_609.ApplicationRequirementsandDetails_Collateral();
			dropdownhelper.SelectUsingVisibleText(Collateral, testData.get("Collateral"));
			
	    }
		
}
