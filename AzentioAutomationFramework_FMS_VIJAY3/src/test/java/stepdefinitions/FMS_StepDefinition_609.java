package stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DrawDownRequest_PageObjects_609;
import pageobjects.FMS_PageObjects_609;
import pageobjects.Facilities_Management_PageObjects_609;
import resources.BaseClass;

public class FMS_StepDefinition_609 extends BaseClass{
	
	int randomNumber;
	String FacilityCode;
	String DateSubmitted;
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	
	FMS_PageObjects_609 FmsPageobjects_609 = new FMS_PageObjects_609(driver);
	Facilities_Management_PageObjects_609 FacilitiesManagementPageObjects609 = new Facilities_Management_PageObjects_609(driver);
	DrawDownRequest_PageObjects_609 DrawDownRequestPageobjects_609 =new DrawDownRequest_PageObjects_609(driver);
	
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath, "FMS_WIFAK_ApplicationTestData", "DataSet ID");
	ExcelData fmsFacilitiesManagementExcelData = new ExcelData(TestDataPath, "FMS_Facilities_Management", "DataSet ID");
	ExcelData fmsDrawDownRequestExcelData = new ExcelData(TestDataPath, "FMS_DrawDownRequest_609", "DataSet ID");
	ExcelData fmsCommitteeApprovalExcelData = new ExcelData(TestDataPath, "FMS_CommitteeApproval_609", "DataSet ID");

	

	Map<String, String> testData;
	Map<String, String> fmsLoginTestData = new HashMap<>();

	String ApplicationNo;
	
	 @And("^User_609 get the test data set id for AT_CA_006$")
	    public void User_609_get_the_test_data_set_id_for_AT_CA_006() throws Throwable {
	    	testData = fmsCommitteeApprovalExcelData.getTestdata("AT_CA_006");	
	    }
	
	@And("^User_609 Click on the Parameters menu$")
	public void user_609_click_on_the_parameters_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters());
	}

	@And("^User_609 Click on the Facility Type Submenu$")
    public void user_609_click_on_the_facility_type_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_FacilityType());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_FacilityType());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_FacilityType());
    }
        
    @And("^User_609 Click on Update After Approve Screen$")
    public void user_609_click_on_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove());
    }

    @And("^User_609 Select the Code in Update After Approve Screen$")
   	public void user_609_select_the_code_in_update_after_approve_screen() throws Throwable {	
       	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode());
   		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode());
   		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode());
   		FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode().sendKeys(testData.get("Code"));
   		FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode().sendKeys(Keys.ENTER);
   		
   		String xpath ="//td[text()='"+String.valueOf(testData.get("Code"))+"']";
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
	
	 @And("^User_609 Click on the Facility Details Tab$")
	    public void user_609_click_on_the_facility_details_tab() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_FacilityDetails());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_FacilityDetails());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_FacilityDetails());
	    }

	    @And("^User_609 Click on the STP Facility Requirements in Facility Details Tab$")
		public void user_609_click_on_the_stp_facility_requirements_in_facility_details_tab() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver,FacilitiesManagementPageObjects609.FacilityType_Facilitydetails_STPFacilityRequirements());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_Facilitydetails_STPFacilityRequirements());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_Facilitydetails_STPFacilityRequirements());
		}
	    
	    @And("^User_609 Disable Mandatory Customer Grading flag$")
	    public void User_609_Disable_Mandatory_Customer_Grading_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_Mandatory_Customer_Grading());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_Mandatory_Customer_Grading());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_Mandatory_Customer_Grading());

			WebElement Mandatory_Customer_Grading = FacilitiesManagementPageObjects609.STPFacilityRequirements_Mandatory_Customer_Grading();
			if (Mandatory_Customer_Grading.isSelected()) {
				Mandatory_Customer_Grading.click();
			}
			else {
				Assert.assertTrue(true);
			}
	    }
	    
	    @And("^User_609 Enable Customer Grading flag$")
	    public void user_609_enable_customer_grading_flag () throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_CustomerGrading());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_CustomerGrading());
			WebElement CustomerGrading = FacilitiesManagementPageObjects609.STPFacilityRequirements_CustomerGrading();
			if (CustomerGrading.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				CustomerGrading.click();
			}
	    }
	   
	    @And("^User_609 Enable Overwrite Grading flag$")
	    public void User609_Enable_Overwrite_Grading_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_OverwriteGrading());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_OverwriteGrading());
			WebElement OverwriteGrading = FacilitiesManagementPageObjects609.STPFacilityRequirements_OverwriteGrading();
			if (OverwriteGrading.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				OverwriteGrading.click();
			}
	    }
	 
	    @And("^User_609 Enable Credit Review flag$")
	    public void User_609_Enable_Credit_Review_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_CreditReview());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_CreditReview());
			WebElement CreditReview = FacilitiesManagementPageObjects609.STPFacilityRequirements_CreditReview();
			if (CreditReview.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				CreditReview.click();
			}
	    }

	    @And("^User_609 Disable Committee Approval flag$")
	    public void User_609_Disable_Committee_Approval_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_CommitteeApproval());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_CommitteeApproval());
			WebElement CommitteeApproval = FacilitiesManagementPageObjects609.STPFacilityRequirements_CommitteeApproval();
			if (!(CommitteeApproval.isSelected())) {
				Assert.assertTrue(true);
			}
			else {
				CommitteeApproval.click();
			}
	    }
	    
	    @And("^User_609 Enable Committee Approval flag$")
	    public void User_609_enable_Committee_Approval_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_CommitteeApproval());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_CommitteeApproval());
			WebElement CommitteeApproval = FacilitiesManagementPageObjects609.STPFacilityRequirements_CommitteeApproval();
			if (!(CommitteeApproval.isSelected())) {
				CommitteeApproval.click();
			}
	    }
	    
	    @And("^User_609 Enable Credit Authorization flag$")
	    public void User_609_Enable_Credit_Authorization_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_CreditAuthorization());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_CreditAuthorization());
			WebElement CreditAuthorization = FacilitiesManagementPageObjects609.STPFacilityRequirements_CreditAuthorization();
			if (CreditAuthorization.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				CreditAuthorization.click();
			}
	    }
	    
	    @And("^User_609 Enable IssueFacilityOffer flag$")
	    public void User_609_Enable_IssueFacilityOffer_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_IssueFacilityOffer());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_IssueFacilityOffer());
			WebElement IssueFacilityOffer = FacilitiesManagementPageObjects609.STPFacilityRequirements_IssueFacilityOffer();
			if (IssueFacilityOffer.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				IssueFacilityOffer.click();
			}
	    }
	    
	    @And("^User_609 Enable Client Response flag$")
	    public void User_609_Enable_Client_Response_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_ClientResponse());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_ClientResponse());
			WebElement ClientResponse = FacilitiesManagementPageObjects609.STPFacilityRequirements_ClientResponse();
			if (ClientResponse.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				ClientResponse.click();
			}
	    }
	    
	    @And("^User_609 Enable Document Validation flag$")
	    public void User_609_Enable_Document_Validation_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_DocumentValidation());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_DocumentValidation());
			WebElement DocumentValidation = FacilitiesManagementPageObjects609.STPFacilityRequirements_DocumentValidation();
			if (DocumentValidation.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				DocumentValidation.click();
			}
	    }

	    
	    @And("^User_609 Enable Final Approval flag$")
	    public void User_609_Enable_Final_Approval_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_FinalApproval());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_FinalApproval());
			WebElement FinalApproval = FacilitiesManagementPageObjects609.STPFacilityRequirements_FinalApproval();
			if (FinalApproval.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				FinalApproval.click();
			}
	    }

	    @And("^User_609 Enable Create Active Facility If Within Limits flag$")
	    public void User_609_Enable_Create_Active_Facility_If_Within_Limits_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits());
			WebElement CreateActiveFacilityIfWithinLimits = FacilitiesManagementPageObjects609.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits();
			if (CreateActiveFacilityIfWithinLimits.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				CreateActiveFacilityIfWithinLimits.click();
			}
	    }

	    @And("^User_609 Enable Automatically Approve Facility If Within Limits flag$")
	    public void User_609_Enable_Automatically_Approve_Facility_If_Within_Limits_flag() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits());
			WebElement AutomaticallyApproveFacilityIfWithinLimits = FacilitiesManagementPageObjects609.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits();
			if (AutomaticallyApproveFacilityIfWithinLimits.isSelected()) {
				Assert.assertTrue(true);
			}
			else {
				AutomaticallyApproveFacilityIfWithinLimits.click();
			}
	    }

		@And("^User_609 Click on Update$")
		public void user_609_click_on_update() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_Update());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_Update());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_Update());
		}
	    
	    @And("^User_609 Click on Approve Screen$")
	    public void user_609_click_on_approve_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_Approvescreen());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_Approvescreen());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_Approvescreen());     
	    }

	    @And("^User_609 Select the Code in Approve Screen$")
	    public void user_609_select_the_code_in_approve_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Searchcode());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Searchcode());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Searchcode());  
			//FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Searchcode().sendKeys("19");
			FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Searchcode().sendKeys(testData.get("Code"));
			FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Searchcode().sendKeys(Keys.ENTER);
	    	
			String xpath ="//table[@id='fmsFacilityTypeListGridTbl_Id_P008P']/tbody/tr[2]/td[text()='"+String.valueOf(testData.get("Code"))+"']";
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
			/*
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Selectcode());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Selectcode());
			clicksAndActionHelper.doubleClick(FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Selectcode()); 
			*/
	    }
	    
	    @And("^User_609 Click on Approve$")
	    public void user_609_Click_on_Approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Approve());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Approve());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_ApproveScreen_Approve());         
	    }
	    
	    @And("^User_609 Click the confirm ok button$")
	    public void user_609_click_the_confirm_ok_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Confirmok());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Confirmok());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Confirmok());  
	    }
	    
	    @And("^User_609 Click the ok button$")
	    public void user_609_click_the_ok_button() throws Throwable {
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ApplicationNo_609());
	    	String ApplicationNO;
	    	ApplicationNO = FmsPageobjects_609.ApplicationNo_609().getText().substring(10, 14);
	    	System.err.println("Reference Number: " + ApplicationNO);
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Ok());
			clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Ok());
			clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Ok());         
	    }
	    
	    
	   
///************************************************Request For Financing************************************************///
	    
	    @And("^User_609 Click on the REQUEST FOR FINANCIN menu$")
	    public void user_609_click_on_the_request_for_financin_menu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FmsCore_REQUESTFORFINANCIN_609());
			clicksAndActionHelper.moveToElement(FmsPageobjects_609.FmsCore_REQUESTFORFINANCIN_609());
			clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FmsCore_REQUESTFORFINANCIN_609());
	    }
	    
	    @And("^User_609 Click on the Request For Financing submenu$")
	    public void user_609_click_on_the_request_for_financing_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_609());
			clicksAndActionHelper.moveToElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_609());
			clicksAndActionHelper.clickOnElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_609());
	    }
	      
	    @And("^User_609 Click on the Maintenance screen$")
	    public void user_609_click_on_the_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609());
			clicksAndActionHelper.moveToElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609());
			clicksAndActionHelper.clickOnElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609());
	    }
	    
	    @And("^User_609 Select the Reason For Submission field$")
	    public void user_609_select_the_reason_for_submission_field() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609());
			//clicksAndActionHelper.moveToElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609());
			dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609(),testData.get("Application For"));
	    }
	    
	    @And("^User_609 Select the Customer field$")
	    public void User_609_Select_the_Customer_field() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609());
			clicksAndActionHelper.clickOnElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609());
			
			waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609());
			WebElement Customer = FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609();
			Customer.click();
			Customer.sendKeys(testData.get("CIF No"),Keys.ENTER);
			
			String xpath ="//table[@id='gridtab_requestFinanacingCif_CSMRF00MT']/tbody/tr/td[text()='"+testData.get("CIF No")+"']";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionHelper.doubleClick(Code);
					}
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}	
	    }
	    
	    @And("^User_609 Select the Facility Type$")
	    public void User_609_Select_the_Facility_Type() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609());
	    	FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609().click();
	    	
			waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609());
			WebElement FacilityType = FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609();
			FacilityType.click();
			
			FacilityType.sendKeys(testData.get("Facility Type"),Keys.ENTER);
			String xpath ="(//table[@id='gridtab_requestFinancingFacilityType_CSMRF00MT']/tbody/tr/td[text()='"+testData.get("Facility Type")+"'])[1]";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionHelper.doubleClick(Code);
					}
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	    
	    @And("^User_609 Enter the Total Limit$")
	    public void User_609_Enter_the_Total_Limit() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609());
	    	clicksAndActionHelper.moveToElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609());
			WebElement TotalLimit = FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609();
			TotalLimit.sendKeys(testData.get("Total value"),Keys.TAB);
	    }
	    
	    @And("^User_609 Click on the Disbursement or Sublimit tab$")
	    public void User_609_Click_on_the_Disbursement_or_Sublimit_tab() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609());
			FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609().click();
			
	    }
	    
	    @And("^User_609 Click on Add icon in Disbursement or sublimit tab$")
	    public void User_609_Click_on_Add_icon_in_Disbursement_or_sublimit_tab() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_Addicon_609());
			FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_Addicon_609().click();
			
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    @And("^User_609 Select the Product Class in Request$")
	    public void User_609_Select_the_product_Class_in_Request() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609());
	    	FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609().click();
	    	
			waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_609());
			WebElement FacilityType = FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_609();
			FacilityType.click();
			
			FacilityType.sendKeys(testData.get("Product Class"),Keys.ENTER);
			String xpath ="//table[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT']/tbody/tr/td[text()='"+testData.get("Facility Type")+"']";
			for (int i = 0; i < 200; i++) {
				try {
					WebElement Code  = driver.findElement(By.xpath(xpath));
					if (Code.isDisplayed()) {
						clicksAndActionHelper.doubleClick(Code);
					}
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	    
	    
	    
	    
	    
	    @And("^User_609 Enter the New margin value$")
	    public void User_609_Enter_the_New_margin_value() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609());
			WebElement NewMargin = FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609();
	    	NewMargin.click();
	    	NewMargin.sendKeys(testData.get("Margin Rate"),Keys.TAB);
			
	    }
	    
	    @And("^User_609 Enable Clean flag in Product Class$")
	    public void User_609_Enable_Clean_flag_in_Product_Class() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609());
	    	WebElement Clean = FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609();
	    	try {
				if (Clean.isSelected()) {
					Assert.assertTrue(true);
				}
				else {
					Clean.click();
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}	
	    }
	    
	    @And("^User_609 Click on Add in Product Class$")
	    public void User_609_Click_on_Add_in_Product_Class() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609());
			FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609().click();
			
	    }
	   
	    @And("^User_609 Click the Save Button in Request Screen$")
	    public void User_609_Click_the_Save_Button_in_Request_Screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609());
			FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609().click();	
	    }
	    
	    @And("^User_609 Click the Validate Button in Request Screen$")
	    public void User_609_Click_the_Validate_Button_in_Request_Screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609());
			FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609().click();
	    }
	    
	    @And("User_609 Click Ok in Confirm pop up")
		public void User_609_Click_Ok_in_Confirm_pop_up() {
			waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ConfirmPopUp_609());
			clicksAndActionHelper.moveToElement(FmsPageobjects_609.ConfirmPopUp_609());
			try {
				if (FmsPageobjects_609.ConfirmPopUp_609().isDisplayed()) {
					FmsPageobjects_609.ConfirmPopUp_609().click();
				}
				else {
					Assert.assertTrue(true);
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}

	    @And("User_609 Click Dismiss in Send Alert")
		public void user_609_click_dismiss_in_send_alert() {
			waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.SendAlert_609());
			clicksAndActionHelper.moveToElement(FmsPageobjects_609.SendAlert_609());
			try {
				if (FmsPageobjects_609.SendAlert_609().isDisplayed()) {
					FmsPageobjects_609.SendAlert_609().click();
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	    
	    
	    
	    
	 
}
