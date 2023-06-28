package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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

		
		@And("^User_609 Check the Down Payment Percantage field is enabled$")
		public void User_609_Check_the_Down_Payment_Percantage_field_is_enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage());
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage().isEnabled()) {
					clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage());
					DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage().sendKeys(testData.get("Down Payment %"));
					DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage().sendKeys(Keys.TAB);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		@And("^User_609 Check the Down Payment field is enabled$")
		public void User_609_Check_the_Down_Payment_field_is_enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage());
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment().isEnabled()) {
					DownPayment = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment().getAttribute("prevvalue");
					Assert.assertEquals(!(DownPayment.isBlank()), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		@And("^User_609 Check the Down Payment to vendor Percantage field is enabled$")
		public void User_609_Check_the_Down_Payment_to_vendor_Percantage_field_is_enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage());
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage().isEnabled()) {
					clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage());
					DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage().sendKeys(testData.get("Down Payment to Vendor %"));
					DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage().sendKeys(Keys.TAB);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		@And("^User_609 Check the Down Payment to vendor field is enabled$")
		public void User_609_Check_the_Down_Payment_to_vendor_field_is_enabled() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor());
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor().isEnabled()) {
					DownPaymentToVendor = DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor().getAttribute("prevvalue");
					Assert.assertEquals(!(DownPaymentToVendor.isBlank()), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		
		@And("^User_609 Check the Total Down Payment Percantage field is Displayed$")
		public void User_609_Check_the_Total_Down_Payment_Percantage_field_is_Displayed() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage());
			TotalDownPaymentPercentcalc = Integer.parseInt(testData.get("Down Payment %")) + Integer.parseInt(testData.get("Down Payment to Vendor %")) ;
			 
			try {
				String TotalDownPaymentPercentage = javascripthelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPaymentPercentage')[0].value").toString().replace(",","").split("[.]")[0];
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage().isDisplayed()) {
					Assert.assertEquals(String.valueOf(TotalDownPaymentPercentcalc), TotalDownPaymentPercentage);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		@And("^User_609 Check the Total Down Payment field is Displayed$")
		public void User_609_Check_the_Total_Down_Payment_field_is_Displayed() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPayment());
			TotalDownPaymentcalc = Integer.parseInt(DownPayment)+ Integer.parseInt(DownPaymentToVendor);
			
			String TotalDownPayment = javascripthelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPayment')[0].value").toString().replace(",","").split("[.]")[0];
			
		
			try {
				if (DrawDownRequestPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPayment().isDisplayed()) {
					Assert.assertEquals(String.valueOf(TotalDownPaymentcalc),TotalDownPayment);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		
		//************************************** 1038988 ****************************************************//

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@And("^User_609 Check the Down Payment Percantage field is enabled in Request Screen$")
		public void User_609_Check_the_Down_Payment_Percantage_field_is_enabled_in_Request_Screen() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage());
			try {
				if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage().isEnabled()) {
					
					
				}
				
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			/*
			try {
				if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage().isEnabled()) {
					clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage());
					DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage().sendKeys(testData.get("Down Payment %"));
					DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage().sendKeys(Keys.TAB);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			*/
		}
		
		@And("^User_609 Check the Down Payment field is enabled in Request Screen$")
		public void User_609_Check_the_Down_Payment_field_is_enabled_in_Request_Screen() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPayment());
			try {
				if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPayment().isEnabled()) {
					//document.getElementsByName('requestFinancingCO.fmsRequestFinancingVO.DOWN_PAYMENT')[0].value
					DownPayment = javascripthelper.executeScript("return document.getElementsByName('requestFinancingCO.fmsRequestFinancingVO.DOWN_PAYMENT')[0].value").toString().replace(",","").split("[.]")[0];
					//DownPayment = DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPayment().getAttribute("prevvalue");
					Assert.assertEquals((DownPayment.isBlank()), false);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		@And("^User_609 Check the Down Payment to vendor Percantage field is enabled in Request Screen$")
		public void User_609_Check_the_Down_Payment_to_vendor_Percantage_field_is_enabled_in_Request_Screen() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage());
			try {
				if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage().isEnabled()) {
					clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage());
					DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage().sendKeys(testData.get("Down Payment to Vendor %"));
					DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage().sendKeys(Keys.TAB);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		@And("^User_609 Check the Down Payment to vendor field is enabled in Request Screen$")
		public void User_609_Check_the_Down_Payment_to_vendor_field_is_enabled_in_Request_Screen() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor());
			try {
				if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor().isEnabled()) {
					//DownPaymentToVendor = DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor().getAttribute("prevvalue");
					Assert.assertEquals(!(DownPaymentToVendor.isBlank()), true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		
		@And("^User_609 Check the Total Down Payment Percantage field is Displayed in Request Screen$")
		public void User_609_Check_the_Total_Down_Payment_Percantage_field_is_Displayed_in_Request_Screen() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPaymentPercentage());
			TotalDownPaymentPercentcalc = Integer.parseInt(testData.get("Down Payment %")) + Integer.parseInt(testData.get("Down Payment to Vendor %")) ;
			 
			try {
				String TotalDownPaymentPercentage = javascripthelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPaymentPercentage')[0].value").toString().replace(",","").split("[.]")[0];
				if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPaymentPercentage().isDisplayed()) {
					Assert.assertEquals(String.valueOf(TotalDownPaymentPercentcalc), TotalDownPaymentPercentage);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
		@And("^User_609 Check the Total Down Payment field is Displayed in Request Screen$")
		public void User_609_Check_the_Total_Down_Payment_field_is_Displayed_in_Request_Screen() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPayment());
			
			/*
			TotalDownPaymentcalc = Integer.parseInt(DownPayment)+ Integer.parseInt(DownPaymentToVendor);
			String TotalDownPayment = javascripthelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPayment')[0].value").toString().replace(",","").split("[.]")[0];
			try {
				if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPayment().isDisplayed()) {
					Assert.assertEquals(String.valueOf(TotalDownPaymentcalc),TotalDownPayment);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
			*/
			
			
		}
				
				
				
}
