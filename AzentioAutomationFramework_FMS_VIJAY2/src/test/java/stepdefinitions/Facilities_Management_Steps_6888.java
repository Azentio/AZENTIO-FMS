package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;
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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import pageobjects.Facilities_Management_PageObjects_6888;
import pageobjects.RequestforFinancing_Pageobjects;
import resources.BaseClass;

public class Facilities_Management_Steps_6888 extends BaseClass{
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	Facilities_Management_PageObjects_6888 FacilitiesManagementPageObjects6888 = new Facilities_Management_PageObjects_6888(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath, "FMS_WIFAK_ApplicationTestData", "DataSet ID");
	Map<String, String> testData;
	Map<String, String> fmsLoginTestData = new HashMap<>();

	

	@And("^User_609 Click on the Parameters menu$")
	public void user_609_click_on_the_parameters_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.Parameters());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.Parameters());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.Parameters());
	}

	@And("^User_609 Click on the Facility Type Submenu$")
    public void user_609_click_on_the_facility_type_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.Parameters_FacilityType());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.Parameters_FacilityType());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.Parameters_FacilityType());
    }
        
    @And("^User_609 Click on Update After Approve Screen$")
    public void user_609_click_on_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove());
    }

    @And("^User_609 Select the Code in Update After Approve Screen$")
	public void user_609_select_the_code_in_update_after_approve_screen() throws Throwable {
    	
    	
    	
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_SearchCode());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_SearchCode());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_SearchCode());
		FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_SearchCode().sendKeys("19");
		FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_SearchCode().sendKeys(Keys.ENTER);
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_SelectCode());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_SelectCode());
		clicksAndActionHelper.doubleClick(FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_SelectCode());
	}

    @And("^User_609 Click on the Facility Details Tab$")
    public void user_609_click_on_the_facility_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FacilityType_UpdateAfterApprove_FacilityDetails());
    }

    @And("^User_609 Click on the STP Facility Requirements in Facility Details Tab$")
	public void user_609_click_on_the_stp_facility_requirements_in_facility_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FacilitiesManagementPageObjects6888.FacilityType_Facilitydetails_STPFacilityRequirements());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_Facilitydetails_STPFacilityRequirements());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FacilityType_Facilitydetails_STPFacilityRequirements());

	}
    
    @And("^User_609 Disable Mandatory Customer Grading flag$")
    public void User_609_Disable_Mandatory_Customer_Grading_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_Mandatory_Customer_Grading());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_Mandatory_Customer_Grading());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_Mandatory_Customer_Grading());

		WebElement Mandatory_Customer_Grading = FacilitiesManagementPageObjects6888.STPFacilityRequirements_Mandatory_Customer_Grading();
		if (Mandatory_Customer_Grading.isSelected()) {
			Mandatory_Customer_Grading.click();
		}
		else {
			Assert.assertTrue(true);
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_Mandatory_Customer_Grading().getAttribute("initialvalue").isBlank()) {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_Mandatory_Customer_Grading().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }
    
    @And("^User_609 Enable Customer Grading flag$")
    public void user_609_enable_customer_grading_flag () throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_CustomerGrading());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CustomerGrading());
		WebElement CustomerGrading = FacilitiesManagementPageObjects6888.STPFacilityRequirements_CustomerGrading();
		if (CustomerGrading.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			CustomerGrading.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CustomerGrading().isSelected()) {
					Assert.assertTrue(true);
				}
				
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_CustomerGrading().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
    */}
   
    @And("^User_609 Enable Overwrite Grading flag$")
    public void User609_Enable_Overwrite_Grading_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_OverwriteGrading());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_OverwriteGrading());
		WebElement OverwriteGrading = FacilitiesManagementPageObjects6888.STPFacilityRequirements_OverwriteGrading();
		if (OverwriteGrading.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			OverwriteGrading.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_OverwriteGrading().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_OverwriteGrading().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}*/
    }
 
    @And("^User_609 Enable Credit Review flag$")
    public void User_609_Enable_Credit_Review_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditReview());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditReview());
		WebElement CreditReview = FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditReview();
		if (CreditReview.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			CreditReview.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditReview().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditReview().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }

    @And("^User_609 Disable Committee Approval flag$")
    public void User_609_Disable_Committee_Approval_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_CommitteeApproval());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CommitteeApproval());
		WebElement CommitteeApproval = FacilitiesManagementPageObjects6888.STPFacilityRequirements_CommitteeApproval();
		if (!(CommitteeApproval.isSelected())) {
			Assert.assertTrue(true);
		}
		else {
			CommitteeApproval.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CommitteeApproval().getAttribute("initialvalue").isBlank()) {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_CommitteeApproval().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }
    
    @And("^User_609 Enable Credit Authorization flag$")
    public void User_609_Enable_Credit_Authorization_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditAuthorization());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditAuthorization());
		WebElement CreditAuthorization = FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditAuthorization();
		if (CreditAuthorization.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			CreditAuthorization.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditAuthorization().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreditAuthorization().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }
    
    @And("^User_609 Enable IssueFacilityOffer flag$")
    public void User_609_Enable_IssueFacilityOffer_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_IssueFacilityOffer());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_IssueFacilityOffer());
		WebElement IssueFacilityOffer = FacilitiesManagementPageObjects6888.STPFacilityRequirements_IssueFacilityOffer();
		if (IssueFacilityOffer.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			IssueFacilityOffer.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_IssueFacilityOffer().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_IssueFacilityOffer().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }
    
    @And("^User_609 Enable Client Response flag$")
    public void User_609_Enable_Client_Response_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_ClientResponse());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_ClientResponse());
		WebElement ClientResponse = FacilitiesManagementPageObjects6888.STPFacilityRequirements_ClientResponse();
		if (ClientResponse.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			ClientResponse.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_ClientResponse().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_ClientResponse().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }
    
    @And("^User_609 Enable Document Validation flag$")
    public void User_609_Enable_Document_Validation_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_DocumentValidation());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_DocumentValidation());
		WebElement DocumentValidation = FacilitiesManagementPageObjects6888.STPFacilityRequirements_DocumentValidation();
		if (DocumentValidation.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			DocumentValidation.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_DocumentValidation().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_DocumentValidation().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }

    
    @And("^User_609 Enable Final Approval flag$")
    public void User_609_Enable_Final_Approval_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_FinalApproval());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_FinalApproval());
		WebElement FinalApproval = FacilitiesManagementPageObjects6888.STPFacilityRequirements_FinalApproval();
		if (FinalApproval.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			FinalApproval.click();
		}
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_FinalApproval().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_FinalApproval().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }

    @And("^User_609 Enable Create Active Facility If Within Limits flag$")
    public void User_609_Enable_Create_Active_Facility_If_Within_Limits_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits());
		WebElement CreateActiveFacilityIfWithinLimits = FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits();
		if (CreateActiveFacilityIfWithinLimits.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			CreateActiveFacilityIfWithinLimits.click();
		}
		
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }

    @And("^User_609 Enable Automatically Approve Facility If Within Limits flag$")
    public void User_609_Enable_Automatically_Approve_Facility_If_Within_Limits_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits());
		WebElement AutomaticallyApproveFacilityIfWithinLimits = FacilitiesManagementPageObjects6888.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits();
		if (AutomaticallyApproveFacilityIfWithinLimits.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			AutomaticallyApproveFacilityIfWithinLimits.click();
		}
		
		
		/*
		for(int i=0;i<200;i++) {
			try {
				if(FacilitiesManagementPageObjects6888.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits().getAttribute("initialvalue")=="checked") {
					Assert.assertTrue(true);
				}
				else {
					FacilitiesManagementPageObjects6888.STPFacilityRequirements_CustomerGrading().click();
				}
			}
				catch (Exception e) {
					Assert.fail(e.getMessage());
				}
			}
			*/
    }

	@And("^User_609 Click on Update$")
	public void user_609_click_on_update() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_Update());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_Update());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FacilityType_Update());
	}
    
    @And("^User_609 Click on Approve Screen$")
    public void user_609_click_on_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_Approvescreen());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_Approvescreen());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FacilityType_Approvescreen());     
    }

    @And("^User_609 Select the Code in Approve Screen$")
    public void user_609_select_the_code_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Searchcode());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Searchcode());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Searchcode());  
		FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Searchcode().sendKeys("19");
		FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Searchcode().sendKeys(Keys.ENTER);
    	
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Selectcode());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Selectcode());
		clicksAndActionHelper.doubleClick(FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Selectcode()); 
		/*
		String xpath ="//td[text()='"+19+"']";
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		*/
    }
    
    @And("^User_609 Click on Approve$")
    public void user_609_Click_on_Approve() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Approve());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Approve());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FacilityType_ApproveScreen_Approve());         
    }
    
    @And("^User_609 Click the confirm ok button$")
    public void user_609_click_the_confirm_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.Confirmok());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.Confirmok());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.Confirmok());  
    }
    
    @And("^User_609 Click the ok button$")
    public void user_609_click_the_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.Ok());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.Ok());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.Ok());         
    }


    
    
    
    
    @And("^User_609 Click on the REQUEST FOR FINANCIN menu$")
    public void user_609_click_on_the_request_for_financin_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.FmsCore_REQUESTFORFINANCIN());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.FmsCore_REQUESTFORFINANCIN());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.FmsCore_REQUESTFORFINANCIN());
    }
    
    @And("^User_609 Click on the Request For Financing submenu$")
    public void user_609_click_on_the_request_for_financing_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing());
    }
      
    @And("^User_609 Click on the Maintenance screen$")
    public void user_609_click_on_the_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
    }
    
    @And("^User_609 Select the Reason For Submission field$")
    public void user_609_select_the_reason_for_submission_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission());
		dropdownhelper.SelectUsingVisibleText(FacilitiesManagementPageObjects6888.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission(), "New Request");
    }
   
}
