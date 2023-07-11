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
import io.cucumber.java.en.Then;
import pageobjects.fms.DrawDownRequest_PageObjects_609;
import pageobjects.fms.Facilities_Management_PageObjects_609;
import resources.BaseClass;

public class Facilities_Management_Steps_609 extends BaseClass{
	
	int randomNumber;
	String FacilityCode;
	String DateSubmitted;
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
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

	Map<String, String> testData;
	Map<String, String> fmsLoginTestData = new HashMap<>();

	String ApplicationNo;
	
	@And("User_609 get the test data set id for AT_FM_085")
	public void user_609_get_the_test_data_set_id_for_at_fm_085() {
		testData = fmsFacilitiesManagementExcelData.getTestdata("DS01_535171");
	}
	
	@And("User_609 get the test data set id for AT_DDR_075")
	public void user_609_get_the_test_data_set_id_for_AT_DDR_075() {
		testData = fmsDrawDownRequestExcelData.getTestdata("AT_DDR_075");
	}
	
	@And("User_609 get the test data set id for AT_FM_087")
	public void user_609_get_the_test_data_set_id_for_at_fm_087() {
		testData = fmsFacilitiesManagementExcelData.getTestdata("DS01_586385");
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

    
    
    ///******************not working****************/////
    @And("^User_609 Select the Code in Update After Approve Screen$")
	public void user_609_select_the_code_in_update_after_approve_screen() throws Throwable {	
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode());
		//FacilitiesManagementPageObjects609.FacilityType_UpdateAfterApprove_SearchCode().sendKeys("19");
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

    
    //////////////********************************////////////////////
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
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Ok());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Ok());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Ok());         
    }
    
    @And("^User_609 Click on the REQUEST FOR FINANCIN menu$")
    public void user_609_click_on_the_request_for_financin_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FmsCore_REQUESTFORFINANCIN());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FmsCore_REQUESTFORFINANCIN());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FmsCore_REQUESTFORFINANCIN());
    }
    
    @And("^User_609 Click on the Request For Financing submenu$")
    public void user_609_click_on_the_request_for_financing_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing());
    }
      
    @And("^User_609 Click on the Maintenance screen$")
    public void user_609_click_on_the_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance());
    }
    
    @And("^User_609 Select the Reason For Submission field$")
    public void user_609_select_the_reason_for_submission_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission());
		//clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission());
		dropdownhelper.SelectUsingVisibleText(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission(),testData.get("Application For"));
    }
    
    @And("^User_609 Select the Customer field$")
    public void User_609_Select_the_Customer_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer());
		WebElement Customer = FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer();
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
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch());
    	FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch().click();
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType());
		WebElement FacilityType = FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType();
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
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit());
		WebElement TotalLimit = FacilitiesManagementPageObjects609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit();
		TotalLimit.sendKeys(testData.get("Total value"),Keys.TAB);
    }
   
   
   
    //*********************************569729*****************************//
    
    @And("User_609 Click on Maintenance Screen in Facility Type submenu")
    public void user_609_click_on_maintenance_screen_in_Facility_Type_submenu() throws Throwable{
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance());
    }
    
    @And("User_609 Click on the Facility Details Tab in Maintenance Screen")
    public void user_609_click_on_the_facility_details_tab_in_maintenance_screen() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance_FacilityDetails());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance_FacilityDetails());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance_FacilityDetails());
    }
    
    @And("User_609 Check the Apply Global Limit is Unchecked By default")
    public void user_609_click_the_Apply_Global_Limit_is_unchecked_by_default() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance_FacilityDetails_ApplyGlobalLimit());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance_FacilityDetails_ApplyGlobalLimit());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance_FacilityDetails_ApplyGlobalLimit());
		Assert.assertEquals(!(FacilitiesManagementPageObjects609.Parameters_FacilityType_Maintenance_FacilityDetails_ApplyGlobalLimit().isSelected()), true);
    }
    
    //*******************************570687*********************//
    
    @And("User_609 Check the Global Limit Code is enabled")
    public void user_609_check_the_global_limit_code_is_enabled() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_GlobalLimitCode());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_GlobalLimitCode());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_GlobalLimitCode());
		Assert.assertEquals((FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_GlobalLimitCode().isEnabled()), true);
    }
    
    
    @And("User_609 Check the Actual Limit Utilized is enabled")
    public void user_609_check_the_actual_limit_utilized_is_enabled() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_ActualLimitUtilized());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_ActualLimitUtilized());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_ActualLimitUtilized());
		Assert.assertEquals((FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_ActualLimitUtilized().isEnabled()), true);
    }
    
    
    //*********************586385***********************************//
    
    @And("User_609 Click on the Suspend Reasons submenu")
    public void user_609_click_on_the_suspend_reasons_submenu() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons());
        
    }

    @And("User_609 Click on the Maintenance screen in Suspend Reasons submenu")
    public void user_609_click_on_the_maintenance_screen_in_suspend_reasons_submenu() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance());
    }

    @And("User_609 Enter the Code in Suspend Reasons Maintenance screen")
    public void user_609_enter_the_code_in_suspend_reasons_maintenance_screen() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_Code());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_Code());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_Code());
		
		Random random = new Random();
		randomNumber = random.nextInt(500 - 50) + 500;
		FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_Code().sendKeys(String.valueOf(randomNumber));
    }

    @And("User_609 Enter the Brief name Suspend Reasons Maintenance screen")
    public void user_609_enter_the_brief_name_suspend_reasons_maintenance_screen() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_BriefDescription());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_BriefDescription());
		//clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_BriefDescription());
		WebElement BriefDescription = FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_BriefDescription();
		BriefDescription.click();
		//BriefDescription.sendKeys("qwerty");
		BriefDescription.sendKeys(testData.get("Brief Name"));
    }

    @And("User_609 Enter the Long name Suspend Reasons Maintenance screen")
    public void user_609_enter_the_long_name_suspend_reasons_maintenance_screen() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_LongDescription());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_LongDescription());
		//clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_LongDescription());
		WebElement LongDescription = FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_LongDescription();
		LongDescription.click();
		//LongDescription.sendKeys("qwerty");
		LongDescription.sendKeys(testData.get("Long Name"));
    }
    
    @And("User_609 Enter the Brief name in Arab in Suspend Reasons Maintenance screen")
    public void user_609_enter_the_brief_name_in_arab_in_suspend_reasons_maintenance_screen() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_BriefDescriptionArab());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_BriefDescriptionArab());
		//clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_BriefDescriptionArab());
		WebElement BriefDescriptionArab = FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_BriefDescriptionArab();
		BriefDescriptionArab.click();
		//BriefDescriptionArab.sendKeys("qwerty");
		BriefDescriptionArab.sendKeys(testData.get("Brief Name Arab"));
    }

    @And("User_609 Enter the Long name in Arab in Suspend Reasons Maintenance screen")
    public void user_609_enter_the_long_name_in_arab_in_suspend_reasons_maintenance_screen() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_LongDescriptionArab());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_LongDescriptionArab());
		//clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_LongDescriptionArab());
		WebElement LongDescriptionArab = FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_LongDescriptionArab();
		LongDescriptionArab.click();
		//LongDescriptionArab.sendKeys("qwerty");
		LongDescriptionArab.sendKeys(testData.get("Long Name Arab"));
    }
    
    @And("User_609 Click on Save in Suspend Reasons")
    public void user_609_click_on_save_in_suspend_reasons() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_Save());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_Save());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Maintenance_Save());
    }

    @And("User_609 Click on the Approve screen in Suspend Reasons submenu")
    public void user_609_click_on_the_approve_screen_in_suspend_reasons_submenu() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve());
    }

    @And("User_609 Select the Code in Approve screen under Suspend Reasons submenu")
    public void user_609_select_the_code_in_approve_screen_under_suspend_reasons_submenu() {
    	waitHelper.waitForElementwithFluentwait(driver,FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve_Code());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve_Code());
    	clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve_Code());
		FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve_Code().sendKeys(String.valueOf(randomNumber));
		FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve_Code().sendKeys(Keys.ENTER);
		String xpath ="//table[@id='paramSuspendReasonListGridTbl_Id_P011P']/tbody/tr[2]/td[text()='"+String.valueOf(randomNumber)+"']";
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

    @And("User_609 Click on Approve in Suspend Reasons submenu")
    public void user_609_click_on_approve_in_suspend_reasons_submenu() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve_ApproveBtn());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve_ApproveBtn());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Parameters_SuspendReasons_Approve_ApproveBtn());
    }
    
    //****************************586385_01************************//
    
    @And("User_609 Click on the Facilities Management under WIFAK APPLICATION submenu")
    public void user_609_click_on_the_facilities_management_under_wifak_application_submenu() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement());
    }
    
    @And("User_609 Click on the Suspend screen under Facilities Management")
    public void user_609_click_on_the_suspend_screen_under_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend());   
    }
    
    @And("User_609 Retrieve any record from the Suspend screen")
    public void User_609_Retrieve_any_record_from_the_Suspend_screen() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_ClearBtn());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_ClearBtn());
    	WebElement clearbutton = FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_ClearBtn();
    	clearbutton.click();
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SelectRecord());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SelectRecord());
    	clicksAndActionHelper.doubleClick(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SelectRecord());
    }

    @Then("User_609 Click on Suspend Button to check Whether the application is suspended without Suspend Reason")
    public void user_609_click_on_suspend_button_to_check_whether_the_application_is_suspended_without_suspend_reason() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendBtn());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendBtn());
    	WebElement SuspendButton = FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendBtn();
    	SuspendButton.click();
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Confirmok());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Confirmok());
    	FacilitiesManagementPageObjects609.Confirmok().click();
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendReasonCannotProceed());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendReasonCannotProceed());
    	try {
    		Assert.assertEquals(FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendReasonCannotProceed().getText(), "Cannot Proceed");
    		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendReasonCannotProceed_Ok());
    	    clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendReasonCannotProceed_Ok());
    	    FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendReasonCannotProceed_Ok().click();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
    }

    @Then("User_609 Check the Suspend Reason Code is Displayed and Select the Code")
    public void user_609_check_the_suspend_reason_code_is_displayed_and_select_the_code() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonSearch());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonSearch());
		WebElement SuspendReasonSearch = FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonSearch();
		SuspendReasonSearch.click();
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonCode());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonCode());
		WebElement SuspendReasonCode= FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonCode();
		FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonCode().sendKeys(String.valueOf(randomNumber));
		FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonCode().sendKeys(Keys.ENTER);
		String xpath ="//table[@id='gridtab_facilityMgtMainSuspendReason_WIFT008SP']/tbody/tr[2]/td[text()='"+String.valueOf(randomNumber)+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
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

    @Then("User_609 Check the Suspend Reason Description is Displayed")
    public void user_609_check_the_suspend_reason_description_is_displayed() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonDescription());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonDescription());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonDescription());
		WebElement SuspendReasonDescription = FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonDescription();
		try {
			Assert.assertEquals(SuspendReasonDescription.getAttribute("prevvalue"), testData.get("Brief Name"));
			FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonDescription().isEnabled();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		} 
    }

    @Then("User_609 Click on Suspend Button")
    public void user_609_click_on_suspend_button() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendBtn());
    	clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendBtn());
    	WebElement SuspendButton = FacilitiesManagementPageObjects609.FacilitiesManagement_SuspendBtn();
    	SuspendButton.click(); 
    }
    
    //*********************************535114*****************************//
    
    @And("^User_609 Click on the Application Requirements and Details Tab$")
    public void User_609_Click_on_the_Application_Requirements_and_Details_Tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_Facilitydetails_ApplicationRequirementsAndDetails());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_Facilitydetails_ApplicationRequirementsAndDetails());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_Facilitydetails_ApplicationRequirementsAndDetails());
    }
    
    @And("^User_609 Enable Allow to add sublimit in multiple groups flag$")
    public void User_609_Enable_Allow_to_add_sublimit_in_multiple_groups_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApplicationRequirementsAndDetails_Allowtoaddsublimitinmultiplegroups());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApplicationRequirementsAndDetails_Allowtoaddsublimitinmultiplegroups());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApplicationRequirementsAndDetails_Allowtoaddsublimitinmultiplegroups());
		WebElement  Allowtoaddsublimitinmultiplegroups = FacilitiesManagementPageObjects609.ApplicationRequirementsAndDetails_Allowtoaddsublimitinmultiplegroups();
		if (Allowtoaddsublimitinmultiplegroups.isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			Allowtoaddsublimitinmultiplegroups.click();
		}
    }
    
    @And("^User_609 Select Revoloving or OneOff option in Main Details Tab$")
    public void User_609_Select_Revoloving_or_OneOff_option_in_Main_Details_Tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilityType_Maindetails_RevolvingOneOff());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.FacilityType_Maindetails_RevolvingOneOff());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilityType_Maindetails_RevolvingOneOff());
		dropdownhelper.SelectUsingVisibleText(FacilitiesManagementPageObjects609.FacilityType_Maindetails_RevolvingOneOff(),testData.get("Revolving/One-Off"));

    }
    
    @And("^User_609 Click on the Group Limit in Limit Details Tab$")
    public void User_609_Click_on_the_Group_Limit_in_Limit_Details_Tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GroupLimit());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GroupLimit());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GroupLimit());
    }
    
    
    @And("^User_609 Add Group Limit Details Value1$")
    public void User_609_Add_Group_Limit_Details_Value1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Addicon());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Addicon());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Addicon());
		
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_SelectRow1());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_SelectRow1());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_SelectRow1());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId1());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId1());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId1());
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId1().sendKeys(testData.get("Group Id1"));
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId1().sendKeys(Keys.TAB);
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName1());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName1());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName1());
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName1().sendKeys(testData.get("Group Name1"));
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName1().sendKeys(Keys.TAB);
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit1());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit1());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit1());
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit1().sendKeys(testData.get("Group Limit1"));
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit1().sendKeys(Keys.TAB);
    }
    
    @And("^User_609 Add Group Limit Details Value2$")
    public void User_609_Add_Group_Limit_Details_Value2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Addicon());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Addicon());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Addicon());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_SelectRow2());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_SelectRow2());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_SelectRow2());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId2());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId2());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId2());
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId1().sendKeys(testData.get("Group Id2"));
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupId1().sendKeys(Keys.TAB);
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName2());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName2());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName2());
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName1().sendKeys(testData.get("Group Name2"));
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupName1().sendKeys(Keys.TAB);
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit2());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit2());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit2());
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit1().sendKeys(testData.get("Group Limit2"));
		FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_GroupLimit1().sendKeys(Keys.TAB);
    }
    
    @And("^User_609 Click on Group Limit Ok$")
    public void User_609_Click_on_Group_Limit_Ok() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Ok());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Ok());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupLimit_Ok());
    }
    
    
    
    
    @And("^User_609 Click on the Group Id in Limit Details Tab$")
    public void User_609_Click_on_the_Group_Id_in_Limit_Details_Tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupId());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId());
    }
    
    @And("^User_609 Select the Group Id Value1$")
    public void User_609_Select_the_Group_Id_Value1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupId_Field1());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId_Field1());
		clicksAndActionHelper.doubleClick(FacilitiesManagementPageObjects609.LimitDetails_GroupId_Field1());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupId_flag1());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId_flag1());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId_flag1());
    }
    
    @And("^User_609 Select the Group Id Value2$")
    public void User_609_Select_the_Group_Id_Value2() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupId_Field2());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId_Field2());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId_Field2());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.LimitDetails_GroupId_flag2());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId_flag2());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.LimitDetails_GroupId_flag2());
    }
    
    @And("^User_609 Click on Group ID Ok$")
    public void User_609_Click_on_Group_ID_Ok() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.GroupId_Ok());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.GroupId_Ok());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.GroupId_Ok());
    }
    
    
    
    
    
    @And("^User_609 Click Yes if Confirm Alert appears$")
    public void User_609_Click_Yes_if_Confirm_Alert_appears() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ConfirmAlert_Ok());
		for(int i= 0; i< 200;i++) {
			try {
				if(FacilitiesManagementPageObjects609.ConfirmAlert_Ok().isDisplayed()) {
					FacilitiesManagementPageObjects609.ConfirmAlert_Ok().click();
				}
			} catch (Exception e) {
				if(i==199) {
					Assert.fail(e.getMessage());
				}			
			}
		}
    }
    
    
    @And("^User_609 Click on Dismiss if Send Alert pop up appears$")
    public void User_609_Click_on_Dismiss_if_Send_Alert_pop_up_appears() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.SendAlert_Ok());
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.SendAlert_Ok());
		for(int i= 0; i< 200;i++) {
			try {
				if(FacilitiesManagementPageObjects609.SendAlert_Ok().isDisplayed()) {
					FacilitiesManagementPageObjects609.SendAlert_Ok().click();
				}
			} catch (Exception e) {
				if(i==199) {
					Assert.fail(e.getMessage());
				}			
			}
		}
    }
    
    @And("^User_609 Click on the Approve level1 Screen$")
    public void User_609_Click_on_the_Approve_level1_Screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApproveLevel1());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApproveLevel1());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApproveLevel1());
    }
    
    @And("^User_609 Select the Code in Approve level1$")
    public void User_609_Select_the_Code_in_Approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApproveLevel1_Code());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApproveLevel1_Code());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApproveLevel1_Code());
    }
    
    @And("^User_609 Select the Decision in Approve level1$")
    public void User_609_Select_the_Decision_in_Approve_level1() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApproveLevel1_Decision());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApproveLevel1_Decision());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApproveLevel1_Decision());
    }
    
    @And("^User_609 Click on ApproveLevel1 Submit$")
    public void User_609_Click_on_ApproveLevel1_Submit() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApproveLevel1_Submit());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApproveLevel1_Submit());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApproveLevel1_Submit());
    }
    
    @And("^User_609 Click on the Approve level3 Screen$")
    public void User_609_Click_on_the_Approve_level3_Screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApproveLevel3());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApproveLevel3());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApproveLevel3());
    }
    
    @And("^User_609 Select the Code in Approve level3$")
    public void User_609_Select_the_Code_in_Approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApproveLevel3_Code());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApproveLevel3_Code());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApproveLevel3_Code());
    }
    
    @And("^User_609 Select the Decision in Approve level3$")
    public void User_609_Select_the_Decision_in_Approve_level3() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApproveLevel3_Decision());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApproveLevel3_Decision());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApproveLevel3_Decision());
    }
    
    @And("^User_609 Click on ApproveLevel3 Submit$")
    public void User_609_Click_on_ApproveLevel3_Submit() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ApproveLevel3_Submit());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.ApproveLevel3_Submit());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ApproveLevel3_Submit());
    }
    
    @And("User_609 Click on the Facilities Management submenu")
    public void user_609_click_on_the_facilities_management_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilitiesManagement());
		
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilitiesManagement());
        
    }

    @And("User_609 Click on the Maintenance Screen under Facilities Management submenu")
    public void user_609_click_on_the_maintenance_screen_under_facilities_management_submenu()throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Maintenance());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_FacilitiesManagement_Maintenance());
        
    }

    @And("User_609 Click on the Search")
    public void user_609_click_on_the_search()throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.SearchButton());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.SearchButton());
    }

    @And("User_609 Click on the Clear")
    public void user_609_click_on_the_clear() throws Throwable{
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.ClearButton());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.ClearButton());
    }
    

    @And("User_609 Extract Code from Maintenance Screen")
    public void User_609_Extract_Code_from_Maintenance_Screen() throws Throwable{
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilitiesManagement_Maintenance_ExtractCode());
		FacilityCode = FacilitiesManagementPageObjects609.FacilitiesManagement_Maintenance_ExtractCode().getAttribute("prevvalue");
    }

    @And("User_609 Click on the Save Button")
    public void user_609_click_on_the_save_button()throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.FacilitiesManagement_Save());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.FacilitiesManagement_Save()); 
    }
    
    
    
    
    
    @And("User_609 Click on the Draw Down Request under Wifak Appliction Submenu")
    public void user_609_click_on_the_draw_down_request_under_wifak_appliction_submenu() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.WifakapplictionSubmenu_DrawDownRequest());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.WifakapplictionSubmenu_DrawDownRequest());
        
    }

    @And("User_609 Click on the Maintenace Screen under Draw Down Request")
    public void user_609_click_on_the_maintenace_screen_under_draw_down_request() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace());
        
    }

    @And("User_609 Select the Facility Reference")
    public void user_609_select_the_facility_reference() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_FacilityReferenceSearch());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_FacilityReferenceSearch());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_FacilityReference());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_FacilityReference());
		
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_FacilityReference().sendKeys(FacilityCode);
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_FacilityReference().sendKeys(Keys.ENTER);
		
		String FacilityRefCode = FacilityCode;
		int FacilityRefCodelen = 10 - FacilityRefCode.length();
	    for(int i = 1; i <=FacilityRefCodelen ; i++){
	    	FacilityRefCode= "0" + FacilityRefCode;
	    }
		String xpath ="//table[@id='gridtab_drawDownRequestFacilityReference_WIFT009MT']/tbody/tr/td[text()='"+String.valueOf(randomNumber)+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
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

    @And("User_609 Select the Drawdown Type")
    public void user_609_select_the_drawdown_type() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownTypeSearch());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownTypeSearch());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownType());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownType());
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownType().sendKeys(testData.get("DrawDown Type"));
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownType().sendKeys(Keys.ENTER);
		
		String xpath ="//table[@id='gridtab_drawDownRequestDrawDownType_WIFT009MT']/tbody/tr/td[text()='"+testData.get("DrawDown Type")+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
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

    @And("User_609 Enter the Description in English")
    public void user_609_enter_the_description_in_english() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DescriptionEnglish());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DescriptionEnglish());
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DescriptionEnglish().sendKeys("asdfg");
        
    }

    @And("User_609 Enter the Description in Arab")
    public void user_609_enter_the_description_in_arab() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DescriptionArab());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DescriptionArab());
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DescriptionArab().sendKeys("asdfg");
    }

    @And("User_609 Enter the Date Submitted")
    public void user_609_enter_the_date_submitted() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DateSubmitted());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DateSubmitted());
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DateSubmitted().getAttribute("prevvalue");
        
    }

    @And("User_609 Enter the Value Date")
    public void user_609_enter_the_value_date() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_ValueDate());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_ValueDate());
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_ValueDate().sendKeys(DateSubmitted);
        
    }

    @And("User_609 Click on the Drawdown Additional Details tab")
    public void user_609_click_on_the_drawdown_additional_details_tab() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails());
		clicksAndActionHelper.moveToElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails());
    	clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails());
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @And("User_609 Select the product Class LN Key")
    public void user_609_select_the_product_class_ln_key() {
    	
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownTypeSearch());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownTypeSearch());
		
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownType());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownType());
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownType().sendKeys(FacilityCode);
		FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_DrawdownType().sendKeys(Keys.ENTER);
		
    	String xpath ="//table[@id='gridtab_drawDownRequestProduct_Class_WIFT009MT']/tbody/tr/td[text()='"+FacilityCode+"']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code  = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
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

    @And("User_609 Click on Save in Draw Down Request")
    public void user_609_click_on_save_in_draw_down_request() {
    	waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_Save());
		clicksAndActionHelper.clickOnElement(FacilitiesManagementPageObjects609.DrawDownRequest_Maintenanace_Save());
        
    }
    
    
    
    
    
    
    @And("^User_609 Check the Down Payment Percantage field is enabled in Request Screen$")
	public void User_609_Check_the_Down_Payment_Percantage_field_is_enabled_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage());
		WebElement DownPaymentPercentage = DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage();
		try {
			if (DownPaymentPercentage.isEnabled()) {
				DownPaymentPercentage.sendKeys(testData.get("Down Payment %"),Keys.TAB);
				Assert.assertEquals(DownPaymentPercentage.isEnabled(), true);
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
		WebElement DownPayment = DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPayment();
		try {
			if (DownPayment.isEnabled()) {
				Assert.assertEquals(DownPayment.isEnabled(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		/*
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
		*/
	}
	
	@And("^User_609 Check the Down Payment to vendor Percantage field is enabled in Request Screen$")
	public void User_609_Check_the_Down_Payment_to_vendor_Percantage_field_is_enabled_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage());
		WebElement DownPaymentToVendorPercentage = DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage();
		try {
			if (DownPaymentToVendorPercentage.isEnabled()) {
				DownPaymentToVendorPercentage.sendKeys(testData.get("Down Payment to Vendor %"),Keys.TAB);
				Assert.assertEquals(DownPaymentToVendorPercentage.isEnabled(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		/*
		try {
			if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage().isEnabled()) {
				clicksAndActionHelper.clickOnElement(DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage());
				DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage().sendKeys(testData.get("Down Payment to Vendor %"));
				DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage().sendKeys(Keys.TAB);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		*/
	}
	
	@And("^User_609 Check the Down Payment to vendor field is enabled in Request Screen$")
	public void User_609_Check_the_Down_Payment_to_vendor_field_is_enabled_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor());
		WebElement DownPaymentToVendor = DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor();
		try {
			if (DownPaymentToVendor.isEnabled()) {
				Assert.assertEquals(DownPaymentToVendor.isEnabled(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		/*
		try {
			if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor().isEnabled()) {
				//DownPaymentToVendor = DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor().getAttribute("prevvalue");
				Assert.assertEquals(!(DownPaymentToVendor.isBlank()), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		*/
	}
	
	
	@And("^User_609 Check the Total Down Payment Percantage field is Displayed in Request Screen$")
	public void User_609_Check_the_Total_Down_Payment_Percantage_field_is_Displayed_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPaymentPercentage());
		WebElement TotalDownPaymentPercentage = DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPaymentPercentage();
		try {
			if (TotalDownPaymentPercentage.isDisplayed()) {
				Assert.assertEquals(TotalDownPaymentPercentage.isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		/*
		TotalDownPaymentPercentcalc = Integer.parseInt(testData.get("Down Payment %")) + Integer.parseInt(testData.get("Down Payment to Vendor %")) ;
		 
		try {
			String TotalDownPaymentPercentage = javascripthelper.executeScript("return document.getElementsByName('applicationFacilityCO.totalDownPaymentPercentage')[0].value").toString().replace(",","").split("[.]")[0];
			if (DrawDownRequestPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPaymentPercentage().isDisplayed()) {
				Assert.assertEquals(String.valueOf(TotalDownPaymentPercentcalc), TotalDownPaymentPercentage);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		*/
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
