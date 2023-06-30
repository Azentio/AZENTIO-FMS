package stepdefinitions;

import static org.junit.Assert.fail;

import java.util.Iterator;
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
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.Draw_Down_Request_Obj;
import resources.BaseClass;

public class Draw_Down_Request {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Draw_Down_Request_Obj Draw_Down_Request_Obj = new Draw_Down_Request_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData1 = new ExcelData(path, "REQUEST_FOR_FINANCIN", "Data Set ID");
	Map<String, String> testData1;
	//@1039017
	@Given("User_607 Check Down Payment to Vendor Percentage In CIF_Details")
	public void user_enter_down_payment_to_vendor_percentage_in_cif_details() throws Throwable {
		Thread.sleep(10000);
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_Down_Payment_to_VendorPercentage_In_CIF_Details_607());
		String check = Draw_Down_Request_Obj.Check_Down_Payment_to_VendorPercentage_In_CIF_Details_607().getAttribute("prevvalue");
	   System.out.println(check);
	}

	@Given("User_607 Check Down Payment to Vendor In CIF_Details")
	public void user_check_down_payment_to_vendor_in_cif_details() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_Down_Payment_to_Vendor_CIF_Details_607());
	String check =	Draw_Down_Request_Obj.Check_Down_Payment_to_Vendor_CIF_Details_607().getAttribute("prevvalue");
	System.out.println(check);
	   
	}

	@Given("User_607 Check Total Down Payment Percentage In CIF_Details")
	public void user_check_total_down_payment_percentage_in_cif_details() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_Total_Down_PaymentPercentage_In_CIF_Details_607());
		String check =	Draw_Down_Request_Obj.Check_Total_Down_PaymentPercentage_In_CIF_Details_607().getAttribute("prevvalue");
		System.out.println(check);
	}

	@Given("User_607 Check Total Down Payment In CIF_Details")
	public void user_check_total_down_payment_in_cif_details() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Total_Down_Payment_In_CIF_Details_607());
		String check =	Draw_Down_Request_Obj.Total_Down_Payment_In_CIF_Details_607().getAttribute("prevvalue");
		System.out.println(check);
	}

	@Given("User_607 Click Facility Limit Details in facilityMng mainteance")
	public void user_click_facility_limit_details_in_facility_mng_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Click_Facility_Limit_Details_607());
		Draw_Down_Request_Obj.Click_Facility_Limit_Details_607().click();
	   
	}

	@Given("User_607 Select Product class record in facilityMng mainteance")
	public void user_select_product_class_record_in_facility_mng_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.DoubleClick_ProductClass_In_Facility_Limit_Details_607());
		clicksAndActionsHelper.doubleClick(Draw_Down_Request_Obj.DoubleClick_ProductClass_In_Facility_Limit_Details_607());

	}

	@Given("User_607 Check Down Payment to Vendor Percentage In limitDetails facilityMng mainteance")
	public void user_check_down_payment_to_vendor_percentage_in_limit_details_facility_mng_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_Down_Payment_to_VendorPercentage_In_limit_Details_facilityMng_607());
		String check =	Draw_Down_Request_Obj.Check_Down_Payment_to_VendorPercentage_In_limit_Details_facilityMng_607().getAttribute("prevvalue");
		System.out.println(check);
	}

	@Given("User_607 Check Down Payment to Vendor In limitDetails facilityMng mainteance")
	public void user_check_down_payment_to_vendor_in_limit_details_facility_mng_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_Down_Payment_to_Vendor_In_limit_Details_facilityMng_607());
		String check =	Draw_Down_Request_Obj.Check_Down_Payment_to_Vendor_In_limit_Details_facilityMng_607().getAttribute("prevvalue");
		System.out.println(check);
	}

	@Given("User_607 Check Total Down Payment Percentage In limitDetails facilityMng mainteance")
	public void user_check_total_down_payment_percentage_in_limit_details_facility_mng_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Total_Down_PaymentPercentage_In_limit_Details_facilityMng_607());
		String check =	Draw_Down_Request_Obj.Total_Down_PaymentPercentage_In_limit_Details_facilityMng_607().getAttribute("prevvalue");
		System.out.println(check);
	}

	@Given("User_607 Check Total Down Payment In limitDetails facilityMng mainteance")
	public void user_check_total_down_payment_in_limit_details_facility_mng_mainteance() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_Total_Down_Payment_In_limit_Details_facilityMng_607());
		String check =	Draw_Down_Request_Obj.Check_Total_Down_Payment_In_limit_Details_facilityMng_607().getAttribute("prevvalue");
		System.out.println(check);
	}
	
	
	
	
	@Given("User_607 Click facility Management under Request for financin")
	public void user_click_facility_management_under_request_for_financin() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.ClickfacilityManagement_under_RequestForFinancing_607());
		Draw_Down_Request_Obj.ClickfacilityManagement_under_RequestForFinancing_607().click();

	}

	@Given("User_607 Click mainteance facility Management under Request for financin")
	public void user_click_mainteance_facility_management_under_request_for_financin() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.ClickMainteance_under_RequestForFinancing_607());
		Draw_Down_Request_Obj.ClickMainteance_under_RequestForFinancing_607().click();
	    
	}

	@Given("User_607 Search the record in mainteance facility Management under Request for financin")
	public void user_search_the_record_in_mainteance_facility_management_under_request_for_financin() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Click_search_InMainteance_under_RequestForFinancing_607());
		Draw_Down_Request_Obj.Click_search_InMainteance_under_RequestForFinancing_607().click();
	}

	@Given("User_607 Select the record in mainteance facility Management under Request for financin")
	public void user_select_the_record_in_mainteance_facility_management_under_request_for_financin() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Click_Clearsearch_InMainteance_under_RequestForFinancing_607());
		Draw_Down_Request_Obj.Click_Clearsearch_InMainteance_under_RequestForFinancing_607().click();
		
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.SelectRecord_InMainteance_under_RequestForFinancing_607());
		clicksAndActionsHelper.doubleClick(Draw_Down_Request_Obj.SelectRecord_InMainteance_under_RequestForFinancing_607());
		
	}
	
	@Given("User_607 Check Down Payment to Vendor in facility Management under Request for financin")
	public void user_check_down_payment_to_vendor_in_facility_management_under_request_for_financin() throws Throwable {
		Thread.sleep(10000);
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.CheckDown_Payment_to_Vendor_InMainteance_under_RequestForFinancing_607());
		String Check = Draw_Down_Request_Obj.CheckDown_Payment_to_Vendor_InMainteance_under_RequestForFinancing_607().getAttribute("prevvalue");
		
		System.out.println(Check);
	}

	@Given("User_607 Check Down Payment to Vendor percentage in facility Management under Request for financin")
	public void user_check_down_payment_to_vendor_percentage_in_facility_management_under_request_for_financin() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.CheckDown_Payment_to_VendorPercentage_InMainteance_under_RequestForFinancing_607());
		String Check = Draw_Down_Request_Obj.CheckDown_Payment_to_VendorPercentage_InMainteance_under_RequestForFinancing_607().getAttribute("prevvalue");
		System.out.println(Check);
	}

	@Given("User_607 Check Total Down Payment in facility Management under Request for financin")
	public void user_check_total_down_payment_in_facility_management_under_request_for_financin() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.CheckTotal_Down_Payment_InMainteance_under_RequestForFinancing_607());
		String Check = Draw_Down_Request_Obj.CheckTotal_Down_Payment_InMainteance_under_RequestForFinancing_607().getAttribute("prevvalue");
		System.out.println(Check);
	}

	@Given("User_607 Check Total Down Payment Percentage in facility Management under Request for financin")
	public void user_check_total_down_payment_percentage_in_facility_management_under_request_for_financin() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.CheckTotal_Down_PaymentPercentage_InMainteance_under_RequestForFinancing_607());
		String Check = Draw_Down_Request_Obj.CheckTotal_Down_PaymentPercentage_InMainteance_under_RequestForFinancing_607().getAttribute("prevvalue");
		System.out.println(Check);
	}

	@Given("User_607 Click facility limit DetailsTab In Mainteance under Request For Financing")
	public void user_click_facility_limit_details_tab_in_mainteance_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Click_facilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607());
		Draw_Down_Request_Obj.Click_facilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607().click();
	}

	@Given("User_607 Select Record In facility limit DetailsTab In Mainteance under Request For Financing")
	public void user_select_record_in_facility_limit_details_tab_in_mainteance_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.SelectRecord_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607());
		clicksAndActionsHelper.doubleClick(Draw_Down_Request_Obj.SelectRecord_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607());
	    
	}

	@Given("User_607 Check Down Payment to Vendor Percentage In facility limit DetailsTab In Mainteance under Request For Financing")
	public void user_check_down_payment_to_vendor_percentage_in_facility_limit_details_tab_in_mainteance_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.CheckDown_Payment_to_VendorPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607());
		String Check = Draw_Down_Request_Obj.CheckDown_Payment_to_VendorPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607().getAttribute("prevvalue");
		System.out.println(Check);
	}

	@Given("User_607 Check Down Payment to Vendor In facility limit DetailsTab In Mainteance under Request For Financing")
	public void user_check_down_payment_to_vendor_in_facility_limit_details_tab_in_mainteance_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.CheckDown_Payment_to_Vendor_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607());
		String Check = Draw_Down_Request_Obj.CheckDown_Payment_to_Vendor_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607().getAttribute("prevvalue");
		System.out.println(Check);
	}

	@Given("User_607 Check Total Down Payment Percentage In facility limit DetailsTab In Mainteance under Request For Financing")
	public void user_check_total_down_payment_percentage_in_facility_limit_details_tab_in_mainteance_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.CheckTotal_Down_PaymentPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607());
		String Check = Draw_Down_Request_Obj.CheckTotal_Down_PaymentPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607().getAttribute("prevvalue");
		System.out.println(Check);
	}

	@Given("User_607 Check Total Down Payment In facility limit DetailsTab In Mainteance under Request For Financing")
	public void user_check_total_down_payment_in_facility_limit_details_tab_in_mainteance_under_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.CheckTotal_Down_Payment_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607());
		String Check = Draw_Down_Request_Obj.CheckTotal_Down_Payment_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607().getAttribute("prevvalue");
		System.out.println(Check);
	}
	
	

	
	//1039018
	
	
	
	
	@Given("User_607 Check Down Payment percentage in LimitDetails In Application For Financial Facilities")
	public void user_check_down_payment_percentage_in_limit_details_in_application_for_financial_facilities() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_Down_Payment_percentage_in_LimitDetails_In_Application_For_Financial_Facilities_607());
		if (!Draw_Down_Request_Obj.Check_Down_Payment_percentage_in_LimitDetails_In_Application_For_Financial_Facilities_607().isDisplayed()) {
			Assert.fail();
		}
		
	   
	}

	@Given("User_607 Check Down Payment in LimitDetails In Application For Financial Facilities")
	public void user_check_down_payment_in_limit_details_in_application_for_financial_facilities() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_Down_Payment_in_LimitDetails_In_Application_For_Financial_Facilities_607());
		if (!Draw_Down_Request_Obj.Check_Down_Payment_in_LimitDetails_In_Application_For_Financial_Facilities_607().isDisplayed()) {
			Assert.fail();
		}
	   
	}

	@Given("User_607 Check Down Payment to Vendor Percentage In LimitDetails_In_Application_For_Financial_Facilities")
	public void user_check_down_payment_to_vendor_percentage_in_limit_details_in_application_for_financial_facilities() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.LimitDetails_Down_Payment_to_VendorPercentage_607());
		if (!Draw_Down_Request_Obj.LimitDetails_Down_Payment_to_VendorPercentage_607().isDisplayed()) {
			Assert.fail();
		}
	   
	}

	@Given("User_607 Check Down Payment to Vendor In LimitDetails_In_Application_For_Financial_Facilities")
	public void user_check_down_payment_to_vendor_in_limit_details_in_application_for_financial_facilities() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.LimitDetails_Down_Payment_to_Vendor_607());
		if (!Draw_Down_Request_Obj.LimitDetails_Down_Payment_to_Vendor_607().isDisplayed()) {
			Assert.fail();
		}
	   
	}

	@Given("User_607 Check Total Down Payment Percentage In LimitDetails_In_Application_For_Financial_Facilities")
	public void user_check_total_down_payment_percentage_in_limit_details_in_application_for_financial_facilities() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.LimitDetails_Total_Down_PaymentPercentage_607());
		if (!Draw_Down_Request_Obj.LimitDetails_Total_Down_PaymentPercentage_607().isDisplayed()) {
			Assert.fail();
		}
	   
	}

	@Given("User_607 Check Total Down Payment In LimitDetails_In_Application_For_Financial_Facilities")
	public void user_check_total_down_payment_in_limit_details_in_application_for_financial_facilities() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.LimitDetails_Total_Down_Payment_607());
		if (!Draw_Down_Request_Obj.LimitDetails_Total_Down_Payment_607().isDisplayed()) {
			Assert.fail();
		}
	}
	
	@Given("User_607 Check Down Payment percentage in LimitDetails In DisbursementSubLimit Details in Request for Financing")
	public void user_check_down_payment_percentage_in_limit_details_in_disbursement_sub_limit_details_in_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Down_Payment_Down_PaymentPercentage_607());
		if (!Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Down_Payment_Down_PaymentPercentage_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Down Payment in LimitDetails In DisbursementSubLimit Details in Request for Financing")
	public void user_check_down_payment_in_limit_details_in_disbursement_sub_limit_details_in_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Down_Payment_Down_PaymentAmmount_607());
		if (!Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Down_Payment_Down_PaymentAmmount_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Down Payment to Vendor Percentage In DisbursementSubLimit Details in Request for Financing")
	public void user_check_down_payment_to_vendor_percentage_in_disbursement_sub_limit_details_in_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage_607());
		if (!Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Down Payment to Vendor In DisbursementSubLimit Details in Request for Financing")
	public void user_check_down_payment_to_vendor_in_disbursement_sub_limit_details_in_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Down_Payment_to_Vendor_607());
		if (!Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Down_Payment_to_Vendor_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Total Down Payment Percentage In DisbursementSubLimit Details in Request for Financing")
	public void user_check_total_down_payment_percentage_in_disbursement_sub_limit_details_in_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Total_Down_PaymentPercentage_607());
		if (!Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Total_Down_PaymentPercentage_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Total Down Payment In DisbursementSubLimit Details in Request for Financing")
	public void user_check_total_down_payment_in_disbursement_sub_limit_details_in_request_for_financing() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Total_Down_Payment_607());
		if (!Draw_Down_Request_Obj.DisbursementSub_LimitDetails_Total_Down_Payment_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	//@1105450
	
	@Given("User_607 Click Link Template to Product Class Facility Type under Parameters")
	public void user_click_link_template_to_product_class_facility_type_under_parameters() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Click_Link_Template_to_Product_ClassFacility_Type_under_Parameters_607());
		Draw_Down_Request_Obj.Click_Link_Template_to_Product_ClassFacility_Type_under_Parameters_607().click();
	   
	}

	@Given("User_607 Click Maintenance under Link Template to Product Class Facility Type")
	public void user_click_maintenance_under_link_template_to_product_class_facility_type() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Click_Maintenance_under_Link_Template_to_Product_ClassFacility_Type_607());
		Draw_Down_Request_Obj.Click_Maintenance_under_Link_Template_to_Product_ClassFacility_Type_607().click();
	   
	}

	@Given("User_607 Click Details Key in Product Class")
	public void user_click_details_key_in_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Click_DetailsKey_in_ProductClass_607());
		Draw_Down_Request_Obj.Click_DetailsKey_in_ProductClass_607().click();
	   
	}

	@Given("User_607 Check title On Details Key in Product Class")
	public void user_check_title_on_details_key_in_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_title_OnDetailsKey_in_ProductClass_607());
		String Check = Draw_Down_Request_Obj.Check_title_OnDetailsKey_in_ProductClass_607().getText();
		Assert.assertEquals(Check, "Hamish Al Jiddiya /Down payment");
		
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.ClickOk_After_Check_title_OnDetailsKey_in_ProductClass_607());
		Draw_Down_Request_Obj.ClickOk_After_Check_title_OnDetailsKey_in_ProductClass_607().click();
	   
	}

	@Given("User_607 Click Facility In Maintenance under Link Template to Product Class Facility Type")
	public void user_click_facility_in_maintenance_under_link_template_to_product_class_facility_type() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.ClickFacility_In_Maintenance_underLink_Template_to_Product_ClassFacility_Type_607());
		Draw_Down_Request_Obj.ClickFacility_In_Maintenance_underLink_Template_to_Product_ClassFacility_Type_607().click();
	   
	}

	@Given("User_607 Click Details Key in Facility Type")
	public void user_click_details_key_in_facility_type() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Click_DetailsKey_in_FacilityType_607());
		Draw_Down_Request_Obj.Click_DetailsKey_in_FacilityType_607().click();
	   
	}

	@Given("User_607 Check title On Details Key in Facility Type")
	public void user_check_title_on_details_key_in_facility_type() {
		waitHelper.waitForElementwithFluentwait(driver, Draw_Down_Request_Obj.Check_title_OnDetailsKey_in_FacilityType_607());
		String Check = Draw_Down_Request_Obj.Check_title_OnDetailsKey_in_FacilityType_607().getText();
		Assert.assertEquals(Check, "Hamish Al Jiddiya /Down payment");
	   
	}

	
	
	

	
	
	
	
}
