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
import dataProvider.ExcelTest;
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

public class FMS_StepDefinition_609 extends BaseClass {
	String ApplicationNo;
	// String ApplicationNO;
	int randomNumber;
	String FacilityCode;
	String DateSubmitted;
	String AccountName;
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);

	FMS_PageObjects_609 FmsPageobjects_609 = new FMS_PageObjects_609(driver);
	Facilities_Management_PageObjects_609 FacilitiesManagementPageObjects609 = new Facilities_Management_PageObjects_609(
			driver);
	DrawDownRequest_PageObjects_609 DrawDownRequestPageobjects_609 = new DrawDownRequest_PageObjects_609(driver);

	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);

	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData FacilityApplicationModificationExcelData = new ExcelData(TestDataPath, "FMS_AppModification_609",
			"DataSet ID");
	ExcelData AccountingEntriesExcelData_609 = new ExcelData(TestDataPath, "FMS_AccountingEntries_609", "DataSet ID");
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");

	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_RequestForFinancing_609", "DataSet ID");
	ExcelData RequestForFinancingExcelData = new ExcelData(TestDataPath, "FMS_RequestForFinancing_609", "DataSet ID");
	ExcelData fmsTransactionsExcelData = new ExcelData(TestDataPath, "FMS_WIFAK_ApplicationTestData", "DataSet ID");
	ExcelData fmsFacilitiesManagementExcelData = new ExcelData(TestDataPath, "FMS_Facilities_Management", "DataSet ID");
	ExcelData fmsDrawDownRequestExcelData = new ExcelData(TestDataPath, "FMS_DrawDownRequest_609", "DataSet ID");
	ExcelData fmsCommitteeApprovalExcelData = new ExcelData(TestDataPath, "FMS_CommitteeApproval_609", "DataSet ID");
	ExcelData fmsSubLimitExcelData = new ExcelData(TestDataPath, "FMS_SubLimit_609", "DataSet ID");

	ExcelData fmsCreditReviewExcelData = new ExcelData(TestDataPath, "FMS_CreditReview_609", "DataSet ID");

	ExcelData ITFCRequestForFinancingExcelData = new ExcelData(TestDataPath, "ITFC_RequestForFinancing_609",
			"DataSet ID");
	Map<String, String> User;

	Map<String, String> testData;
	Map<String, String> fmsLoginTestData = new HashMap<>();

	@And("^User_609 get the test data set id for AT_RF_172$")
	public void User_609_get_the_test_data_set_id_for_AT_RF_172() throws Throwable {
		testData = ITFCRequestForFinancingExcelData.getTestdata("AT_RF_172_D1");
	}

	@And("^User_609 get the test data set id for AT_RF_174$")
	public void User_609_get_the_test_data_set_id_for_AT_RF_174() throws Throwable {
		testData = ITFCRequestForFinancingExcelData.getTestdata("AT_RF_174_D1");
	}

	
	@And("^User_609 get the test data set id for AT_RF_144$")
	public void User_609_get_the_test_data_set_id_for_AT_RF_144() throws Throwable {
		testData = RequestForFinancingExcelData.getTestdata("AT_RF_144");
	}

	@And("^User_609 get the test data set id for AT_RF_145$")
	public void User_609_get_the_test_data_set_id_for_AT_RF_145() throws Throwable {
		testData = RequestForFinancingExcelData.getTestdata("AT_RF_145");
	}

	@And("User_609 get the test data set id for AT_RF_192")
	public void user_609_get_the_test_data_set_id_for_at_rf_192() {
		testData = RequestForFinancingExcelData.getTestdata("AT_RF_192");
	}

	@And("User_609 get the test data set id for AT_RF_195")
	public void user_609_get_the_test_data_set_id_for_at_rf_195() {
		testData = RequestForFinancingExcelData.getTestdata("AT_RF_195");
	}

	@And("User_609 get the test data set id for AT_RF_196")
	public void user_609_get_the_test_data_set_id_for_at_rf_196() {
		testData = RequestForFinancingExcelData.getTestdata("AT_RF_196");
	}

	@And("^User_609 get the test data set id for AT_AE_003$")
	public void User_609_get_the_test_data_set_id_for_AT_AE_003() throws Throwable {
		testData = AccountingEntriesExcelData_609.getTestdata("AT_AE_003");
	}

	@And("^User_609 get the test data set id for AT_AE_008$")
	public void User_609_get_the_test_data_set_id_for_AT_AE_008() throws Throwable {
		testData = AccountingEntriesExcelData_609.getTestdata("AT_AE_008");
	}

	@And("^User_609 get the test data set id for AT_FAM_004$")
	public void User_609_get_the_test_data_set_id_for_AT_FAM_004() throws Throwable {
		testData = FacilityApplicationModificationExcelData.getTestdata("AT_FAM_004");
		User = FacilityApplicationModificationExcelData.getTestdata("FMS_User11");

	}

	@And("^User_609 get the test data set id for AT_FAM_008$")
	public void User_609_get_the_test_data_set_id_for_AT_FAM_008() throws Throwable {
		testData = FacilityApplicationModificationExcelData.getTestdata("AT_FAM_008");
		User = FacilityApplicationModificationExcelData.getTestdata("FMS_User11");

	}

	@And("^User_609 get the test data set id for AT_CA_006$")
	public void User_609_get_the_test_data_set_id_for_AT_CA_006() throws Throwable {
		testData = fmsCommitteeApprovalExcelData.getTestdata("AT_CA_006");

	}

	@And("^User_609 get the test data set id for AT_CA_003$")
	public void User_609_get_the_test_data_set_id_for_AT_CA_003() throws Throwable {
		testData = fmsCommitteeApprovalExcelData.getTestdata("AT_CA_003");
		User = fmsLoginExceldata.getTestdata("FMS_User11");
		System.out.println(User.get("UserName"));
	}

	@And("^User_609 get the test data set id for AT_CA_004$")
	public void User_609_get_the_test_data_set_id_for_AT_CA_004() throws Throwable {
		testData = fmsCommitteeApprovalExcelData.getTestdata("AT_CA_004");
		User = fmsLoginExceldata.getTestdata("FMS_User11");
		System.out.println(User.get("UserName"));
	}

	@And("^User_609 get the test data set id for AT_CA_005$")
	public void User_609_get_the_test_data_set_id_for_AT_CA_005() throws Throwable {
		testData = fmsCommitteeApprovalExcelData.getTestdata("AT_CA_005");
		User = fmsLoginExceldata.getTestdata("FMS_User11");
		System.out.println(User.get("UserName"));
	}

	@And("^User_609 get the test data set id for AT_CA_007$")
	public void User_609_get_the_test_data_set_id_for_AT_CA_007() throws Throwable {
		testData = fmsCommitteeApprovalExcelData.getTestdata("AT_CA_007");
		User = fmsLoginExceldata.getTestdata("FMS_User11");
		System.out.println(User.get("UserName"));
	}

	@And("^User_609 get the test data set id for AT_SL_002$")
	public void User_609_get_the_test_data_set_id_for_AT_SL_002() throws Throwable {
		testData = fmsSubLimitExcelData.getTestdata("AT_SL_002");
	}

	@And("^User_609 get the test data set id for AT_CR_001$")
	public void User_609_get_the_test_data_set_id_for_AT_CR_001() throws Throwable {
		testData = fmsCreditReviewExcelData.getTestdata("AT_CR_001");
	}

	@And("^User_609 get the test data set id for AT_CR_002$")
	public void User_609_get_the_test_data_set_id_for_AT_CR_002() throws Throwable {
		testData = fmsCreditReviewExcelData.getTestdata("AT_CR_002");
	}
///*********************************************************FMS_PARAMS*************************************************************///

	@And("^User_609 Click on the Parameters menu$")
	public void User_609_click_on_the_parameters_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Parameters());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.Parameters());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Parameters());
	}

	@And("^User_609 Click on the Facility Type Submenu$")
	public void User_609_click_on_the_facility_type_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Parameters_FacilityType());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.Parameters_FacilityType());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Parameters_FacilityType());
	}

	@And("^User_609 Click on Update After Approve Screen$")
	public void User_609_click_on_update_after_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.FacilityType_UpdateAfterApprove());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_UpdateAfterApprove());
	}

	@And("^User_609 Select Revolving or OneOff Option in Facility Type Update After Approve screen$")
	public void User_609_Select_Revolving_or_OneOff_Option_in_Facility_Type_Update_After_Approve_screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.FacilityType_UpdateAfterApprove_RevolvingOneOff());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_UpdateAfterApprove_RevolvingOneOff());
		dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.FacilityType_UpdateAfterApprove_RevolvingOneOff(),
				testData.get("RevolvingOneOff"));

	}

	@And("^User_609 Disable the Apply Revolving Controls in Main Details tab$")
	public void User_609_enable_the_apply_revolving_controls_in_main_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.FacilityType_UpdateAfterApprove_ApplyRevolvingControls());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.FacilityType_UpdateAfterApprove_ApplyRevolvingControls());
		try {
			if (FmsPageobjects_609.FacilityType_UpdateAfterApprove_ApplyRevolvingControls().isSelected()) {
				clicksAndActionHelper
						.clickOnElement(FmsPageobjects_609.FacilityType_UpdateAfterApprove_ApplyRevolvingControls());
			} else {
				Assert.assertEquals(
						FmsPageobjects_609.FacilityType_UpdateAfterApprove_ApplyRevolvingControls().isSelected(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());

		}
	}

	@And("^User_609 Select the Code in Update After Approve Screen$")
	public void User_609_select_the_code_in_update_after_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FacilityType_UpdateAfterApprove_Code());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_UpdateAfterApprove_Code());
		FmsPageobjects_609.FacilityType_UpdateAfterApprove_Code().sendKeys(testData.get("Code"));
		FmsPageobjects_609.FacilityType_UpdateAfterApprove_Code().sendKeys(Keys.ENTER);
		String xpath = "//table[@id='fmsFacilityTypeListGridTbl_Id_P008UP']/tbody/tr[2]/td[text()='"
				+ testData.get("Code") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on the Facility Details Tab$")
	public void User_609_click_on_the_facility_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.FacilityType_UpdateAfterApprove_FacilityDetails());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_UpdateAfterApprove_FacilityDetails());
	}

	@And("^User_609 Click on the STP Facility Requirements in Facility Details Tab$")
	public void User_609_click_on_the_stp_facility_requirements_in_facility_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.FacilityType_Facilitydetails_STPFacilityRequirements());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.FacilityType_Facilitydetails_STPFacilityRequirements());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_Facilitydetails_STPFacilityRequirements());
	}

	@And("^User_609 Enable Mandatory Customer Grading flag$")
	public void User_609_Enable_Mandatory_Customer_Grading_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.STPFacilityRequirements_Mandatory_Customer_Grading());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_Mandatory_Customer_Grading());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.STPFacilityRequirements_Mandatory_Customer_Grading());

		WebElement Mandatory_Customer_Grading = FmsPageobjects_609.STPFacilityRequirements_Mandatory_Customer_Grading();
		if (Mandatory_Customer_Grading.isSelected()) {
			Assert.assertTrue(true);
		} else {
			Mandatory_Customer_Grading.click();
		}
	}

	@And("^User_609 Disable Mandatory Customer Grading flag$")
	public void User_609_Disable_Mandatory_Customer_Grading_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.STPFacilityRequirements_Mandatory_Customer_Grading());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_Mandatory_Customer_Grading());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.STPFacilityRequirements_Mandatory_Customer_Grading());

		WebElement Mandatory_Customer_Grading = FmsPageobjects_609.STPFacilityRequirements_Mandatory_Customer_Grading();
		if (Mandatory_Customer_Grading.isSelected()) {
			Mandatory_Customer_Grading.click();
		} else {
			Assert.assertTrue(true);
		}
	}

	@And("^User_609 Enable Customer Grading flag$")
	public void User_609_enable_customer_grading_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.STPFacilityRequirements_CustomerGrading());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_CustomerGrading());
		WebElement CustomerGrading = FmsPageobjects_609.STPFacilityRequirements_CustomerGrading();
		if (CustomerGrading.isSelected()) {
			Assert.assertTrue(true);
		} else {
			CustomerGrading.click();
		}
	}

	@And("^User_609 Enable Overwrite Grading flag$")
	public void User609_Enable_Overwrite_Grading_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.STPFacilityRequirements_OverwriteGrading());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_OverwriteGrading());
		WebElement OverwriteGrading = FmsPageobjects_609.STPFacilityRequirements_OverwriteGrading();
		if (OverwriteGrading.isSelected()) {
			Assert.assertTrue(true);
		} else {
			OverwriteGrading.click();
		}
	}

	@And("^User_609 Enable Credit Review flag$")
	public void User_609_Enable_Credit_Review_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.STPFacilityRequirements_CreditReview());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_CreditReview());
		WebElement CreditReview = FmsPageobjects_609.STPFacilityRequirements_CreditReview();
		if (CreditReview.isSelected()) {
			Assert.assertTrue(true);
		} else {
			CreditReview.click();
		}
	}

	@And("^User_609 Disable Committee Approval flag$")
	public void User_609_Disable_Committee_Approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.STPFacilityRequirements_CommitteeApproval());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_CommitteeApproval());
		WebElement CommitteeApproval = FmsPageobjects_609.STPFacilityRequirements_CommitteeApproval();
		if (!(CommitteeApproval.isSelected())) {
			Assert.assertTrue(true);
		} else {
			CommitteeApproval.click();
		}
	}

	@And("^User_609 Enable Committee Approval flag$")
	public void User_609_enable_Committee_Approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.STPFacilityRequirements_CommitteeApproval());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_CommitteeApproval());
		WebElement CommitteeApproval = FmsPageobjects_609.STPFacilityRequirements_CommitteeApproval();
		if (!(CommitteeApproval.isSelected())) {
			CommitteeApproval.click();
		}
	}

	@And("^User_609 Enable Credit Authorization flag$")
	public void User_609_Enable_Credit_Authorization_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.STPFacilityRequirements_CreditAuthorization());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_CreditAuthorization());
		WebElement CreditAuthorization = FmsPageobjects_609.STPFacilityRequirements_CreditAuthorization();
		if (CreditAuthorization.isSelected()) {
			Assert.assertTrue(true);
		} else {
			CreditAuthorization.click();
		}
	}

	@And("^User_609 Enable IssueFacilityOffer flag$")
	public void User_609_Enable_IssueFacilityOffer_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.STPFacilityRequirements_IssueFacilityOffer());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_IssueFacilityOffer());
		WebElement IssueFacilityOffer = FmsPageobjects_609.STPFacilityRequirements_IssueFacilityOffer();
		if (IssueFacilityOffer.isSelected()) {
			Assert.assertTrue(true);
		} else {
			IssueFacilityOffer.click();
		}
	}

	@And("^User_609 Enable Client Response flag$")
	public void User_609_Enable_Client_Response_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.STPFacilityRequirements_ClientResponse());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_ClientResponse());
		WebElement ClientResponse = FmsPageobjects_609.STPFacilityRequirements_ClientResponse();
		if (ClientResponse.isSelected()) {
			Assert.assertTrue(true);
		} else {
			ClientResponse.click();
		}
	}

	@And("^User_609 Enable Document Validation flag$")
	public void User_609_Enable_Document_Validation_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.STPFacilityRequirements_DocumentValidation());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_DocumentValidation());
		WebElement DocumentValidation = FmsPageobjects_609.STPFacilityRequirements_DocumentValidation();
		if (DocumentValidation.isSelected()) {
			Assert.assertTrue(true);
		} else {
			DocumentValidation.click();
		}
	}

	@And("^User_609 Enable Final Approval flag$")
	public void User_609_Enable_Final_Approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.STPFacilityRequirements_FinalApproval());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.STPFacilityRequirements_FinalApproval());
		WebElement FinalApproval = FmsPageobjects_609.STPFacilityRequirements_FinalApproval();
		if (FinalApproval.isSelected()) {
			Assert.assertTrue(true);
		} else {
			FinalApproval.click();
		}
	}

	@And("^User_609 Enable Create Active Facility If Within Limits flag$")
	public void User_609_Enable_Create_Active_Facility_If_Within_Limits_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits());
		WebElement CreateActiveFacilityIfWithinLimits = FmsPageobjects_609
				.STPFacilityRequirements_CreateActiveFacilityIfWithinLimits();
		if (CreateActiveFacilityIfWithinLimits.isSelected()) {
			Assert.assertTrue(true);
		} else {
			CreateActiveFacilityIfWithinLimits.click();
		}
	}

	@And("^User_609 Enable Automatically Approve Facility If Within Limits flag$")
	public void User_609_Enable_Automatically_Approve_Facility_If_Within_Limits_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits());
		WebElement AutomaticallyApproveFacilityIfWithinLimits = FmsPageobjects_609
				.STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits();
		if (AutomaticallyApproveFacilityIfWithinLimits.isSelected()) {
			Assert.assertTrue(true);
		} else {
			AutomaticallyApproveFacilityIfWithinLimits.click();
		}
	}

	@And("^User_609 Click on Update$")
	public void User_609_click_on_update() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FacilityType_Update());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.FacilityType_Update());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_Update());
	}

	@And("^User_609 Click on Approve Screen$")
	public void User_609_click_on_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FacilityType_Approvescreen());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.FacilityType_Approvescreen());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_Approvescreen());
	}

	@And("^User_609 Select the Code in Approve Screen$")
	public void User_609_select_the_code_in_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FacilityType_ApproveScreen_Code());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_ApproveScreen_Code());
		FmsPageobjects_609.FacilityType_ApproveScreen_Code().sendKeys(testData.get("Code"));
		FmsPageobjects_609.FacilityType_ApproveScreen_Code().sendKeys(Keys.ENTER);

		String xpath = "//table[@id='fmsFacilityTypeListGridTbl_Id_P008P']/tbody/tr[2]/td[text()='"
				+ testData.get("Code") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on Approve$")
	public void User_609_Click_on_Approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FacilityType_ApproveScreen_Approve());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.FacilityType_ApproveScreen_Approve());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilityType_ApproveScreen_Approve());
	}

	@And("^User_609 Click the Application confirm ok button$")
	public void User_609_click_the_Application_confirm_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Application_Confirmok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Application_Confirmok());
	}

	@And("^User_609 Click the Application ok button$")
	public void User_609_click_the_Application_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Application_Ok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Application_Ok());
	}

	@And("^User_609 Click the ok button$")
	public void User_609_click_the_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Ok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Ok());
	}

///************************************************Request For Financing************************************************///

	@And("^User_609 Click on the REQUEST FOR FINANCIN menu$")
	public void User_609_click_on_the_request_for_financin_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FmsCore_REQUESTFORFINANCIN_609());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.FmsCore_REQUESTFORFINANCIN_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FmsCore_REQUESTFORFINANCIN_609());
	}

	@And("^User_609 Click on the Request For Financing submenu$")
	public void User_609_click_on_the_request_for_financing_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_609());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_609());
	}

	@And("^User_609 Click on the Maintenance screen$")
	public void User_609_click_on_the_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609());
	}

	@And("^User_609 Select the Reason For Submission field$")
	public void User_609_select_the_reason_for_submission_field() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609());
		// clicksAndActionHelper.moveToElement(FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609(),
				testData.get("Application For"));
	}

	@And("^User_609 Select the Customer field$")
	public void User_609_Select_the_Customer_field() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609());
		WebElement Customer = FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609();
		Customer.click();
		Customer.sendKeys(testData.get("CIF No"), Keys.ENTER);

		String xpath = "//table[@id='gridtab_requestFinanacingCif_CSMRF00MT']/tbody/tr/td[text()='"
				+ testData.get("CIF No") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the Facility Type$")
	public void User_609_Select_the_Facility_Type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609());
		FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609());
		WebElement FacilityType = FmsPageobjects_609
				.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609();
		FacilityType.click();

		FacilityType.sendKeys(testData.get("Facility Type"), Keys.ENTER);
		// (//table[@id='gridtab_requestFinancingFacilityType_RFFRF00MT']/tbody/tr/td[text()='19'])[1]
		String xpath = "(//table[@id='gridtab_requestFinancingFacilityType_CSMRF00MT']/tbody/tr/td[text()='"
				+ testData.get("Facility Type") + "'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Enter the Total Limit$")
	public void User_609_Enter_the_Total_Limit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609());
		WebElement TotalLimit = FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609();
		TotalLimit.sendKeys(testData.get("Total value"), Keys.TAB);
	}

	@And("^User_609 Click on the Disbursement or Sublimit tab$")
	public void User_609_Click_on_the_Disbursement_or_Sublimit_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609());
		FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609().click();

	}

	@And("^User_609 Click on Add icon in Disbursement or sublimit tab$")
	public void User_609_Click_on_Add_icon_in_Disbursement_or_sublimit_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_Addicon_609());
		WebElement AddIcon = FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_Addicon_609();
		try {
			for (int i = 0; i <= 200; i++) {
				if (AddIcon.isDisplayed()) {
					AddIcon.click();
					break;
				}
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}

	@And("^User_609 Select the Product Class in REQUESTFORFINANCIN$")
	public void User_609_Select_the_product_Class_in_REQUESTFORFINANCIN() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609());
		FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_609());
		WebElement FacilityType = FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_609();
		FacilityType.click();

		FacilityType.sendKeys(testData.get("Product Class"), Keys.ENTER);
		String xpath = "//table[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT']/tbody/tr/td[text()='"
				+ testData.get("Product Class") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Enter the New margin value$")
	public void User_609_Enter_the_New_margin_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609());
		WebElement NewMargin = FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609();
		NewMargin.click();
		NewMargin.clear();
		NewMargin.sendKeys(testData.get("Margin Rate"), Keys.TAB);

	}

	@And("^User_609 Enable Clean flag in Product Class$")
	public void User_609_Enable_Clean_flag_in_Product_Class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609());
		WebElement Clean = FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609();
		try {
			if (Clean.isSelected()) {
				Assert.assertTrue(true);
			} else {
				Clean.click();
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Click on Add in Product Class$")
	public void User_609_Click_on_Add_in_Product_Class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609());
		FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609().click();

	}

	@And("^User_609 Click the Save Button in Request Screen$")
	public void User_609_Click_the_Save_Button_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609());
		FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609().click();
	}

	@And("^User_609 Click the Validate Button in Request Screen$")
	public void User_609_Click_the_Validate_Button_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609());
		FmsPageobjects_609.REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609().click();
	}

	@And("User_609 Click Ok in Confirm pop up")
	public void User_609_Click_Ok_in_Confirm_pop_up() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ConfirmPopUp_609());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.ConfirmPopUp_609());
		try {
			if (FmsPageobjects_609.ConfirmPopUp_609().isDisplayed()) {
				FmsPageobjects_609.ConfirmPopUp_609().click();
			} else {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Click on Dismiss if Send Alert pop up appears$")
	public void User_609_Click_on_Dismiss_if_Send_Alert_pop_up_appears() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.SendAlert_Ok_609());
		FmsPageobjects_609.SendAlert_Ok_609().click();
	}

	@And("^User_609 Click on Dismiss if Send Alert pop up1 appears$")
	public void User_609_Click_on_Dismiss_if_Send_Alert_pop_up1_appears() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.sendAlertPopup1_609());
		for (int i = 0; i < 200; i++) {
			try {
				FmsPageobjects_609.sendAlertPopup1_609().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on Approve Level1 in Request Screen$")
	public void User_609_Click_on_Approve_Level1_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_609());
		FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_609().click();
	}

	@And("User_609 Select the Code in Approve Level1 in Request Screen")
	public void User_609_Select_the_Code_in_Approve_Level1_in_Request_Screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Code_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Code_609());
		FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Code_609().sendKeys(ApplicationNo, Keys.ENTER);
		// FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_Code_609().sendKeys(Keys.ENTER);

		String xpath = "//table[@id='requestFinancingGridTbl_Id_CSMRF00P1']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_609 Click on Customer Grading Recommendations in Approve Level1 in Request Screen$")
	public void User_609_Click_on_Customer_Grading_Recommendations_in_Approve_Level1_in_Request_Screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_CustomerGradingRecommendations_609());
		FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_CustomerGradingRecommendations_609().click();
	}

	@And("^User_609 Select the Decision in Approve Level1 in Request Screen$")
	public void User_609_Select_the_Decision_in_Approve_Level1_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Decision_609());
		WebElement Approvelevel1_Decision = FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Decision_609();
		Approvelevel1_Decision.click();
		dropdownhelper.SelectUsingVisibleText(Approvelevel1_Decision, testData.get("Approve level1 Decision"));
	}

	@And("^User_609 Select the Forward Decision in Approve Level1 in Request Screen$")
	public void User_609_Select_the_Forward_Decision_in_Approve_Level1_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_ForwardDecision_609());
		WebElement Approvelevel1_Decision = FmsPageobjects_609
				.Request_RequestFinancing_ApproveLevel1_ForwardDecision_609();
		Approvelevel1_Decision.click();
		dropdownhelper.SelectUsingVisibleText(Approvelevel1_Decision, testData.get("Approve level1 Forward Decision"));
	}

	@And("^User_609 Click on Approve in Approve Level1 in Request Screen$")
	public void User_609_Click_on_Approve_in_Approve_Level1_in_Request_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Approve_609());
		FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Approve_609().click();
	}

///********************************************************Wifak Application********************************************************///

	@And("User_609 Enable the clean flag in Product class")
	public void User_609_Enable_the_clean_flag_in_Product_class() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
		// WebElement Clean =
		// FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean();
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionHelper.clickOnElement(
						FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on the WIFAK APPLICATION menu$")
	public void User_609_click_on_the_wifak_application_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Fms_Wifakappliction());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.Fms_Wifakappliction());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Fms_Wifakappliction());
	}

	@And("^User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION$")
	public void User_609_click_on_the_wifak_application_submenu_under_wifak_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.Wifakappliction_WifakapplictionSubmenu());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Wifakappliction_WifakapplictionSubmenu());
	}

	@And("^User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu$")
	public void User_609_click_on_the_application_for_financial_facilities_under_wifak_application_submenu()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakapplictionSubmenu_Applicationforfinancialfacilities());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.WifakapplictionSubmenu_Applicationforfinancialfacilities());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.WifakapplictionSubmenu_Applicationforfinancialfacilities());
	}

	@And("^User_609 Click on the Maintenance screen under Application For Financial Facilities$")
	public void User_609_click_on_the_maintenance_screen_under_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance());
	}

	@And("^User_609 Select the Application For field in Maintenance screen$")
	public void User_609_select_the_application_for_field_in_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		// clicksAndActionHelper.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		// clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Applicationfor());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Applicationfor(),
				testData.get("Application For"));

	}

	@And("^User_609 Select the CIF No in Main Information tab$")
	public void User_609_select_the_cif_no_in_main_information_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_CifnoSearch());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_CifnoSearch());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_CifnoSearch());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Cifno());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Cifno());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Cifno());

		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys(testData.get("CIF No"));
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Cifno().sendKeys(Keys.ENTER);

		String CifNo = testData.get("CIF No");
		int CifNoLen = 8 - CifNo.length();
		for (int i = 1; i <= CifNoLen; i++) {
			CifNo = "0" + CifNo;
		}

		String xpath = "//table[@id='gridtab_applicationFacilitycif_WIFT001MT']/tbody/tr[2]/td[text()='" + CifNo + "']";
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i % 5 == 0) {
					clicksAndActionHelper.moveToElement(FmsPageobjects_609.CifnoGridNext());
					clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CifnoGridNext());
				}
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the Facility Type in Main Information tab$")
	public void User_609_select_the_facility_type_in_main_information_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Facilitytype());
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Facilitytype()
				.sendKeys(testData.get("Facility Type"));
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Facilitytype().sendKeys(Keys.ENTER);

		String xpath = "//table[@id='gridtab_applicationFacilityFacilityType_WIFT001MT']/tbody/tr[2]/td[text()='"
				+ testData.get("Facility Type") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the Country of Financing in Main Information tab$")
	public void User_609_select_the_country_of_financing_in_main_information_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch());
		for (int x = 0; x <= 200; x++) {
			try {
				clicksAndActionHelper.clickOnElement(
						FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch());
				break;
			} catch (Exception e) {
				if (x == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Countryoffinancing());
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Countryoffinancing()
				.sendKeys(testData.get("Country of Financing"));
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_Countryoffinancing().sendKeys(Keys.ENTER);

		String xpath = "//table[@id='gridtab_applicationFacilityCountry_WIFT001MT']/tbody/tr/td[text()='"
				+ testData.get("Country of Financing") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_609 Check the Country of Financing field is filled")
	public void User_609_check_the_country_of_financing_field_is_filled() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Countryoffinancing_Validate_609());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.Countryoffinancing_Validate_609());
		String Countryoffinancing = FmsPageobjects_609.Countryoffinancing_Validate_609().getAttribute("prevvalue");
		System.out.println("Countryoffinancing :" + Countryoffinancing);
		try {
			Assert.assertEquals(false,
					FmsPageobjects_609.Countryoffinancing_Validate_609().getAttribute("prevvalue").isBlank());
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Select the Facility Rating$")
	public void User_609_select_the_facility_rating() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilityRating());
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilityRating()
				.sendKeys(testData.get("Facility Rating"));
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_FacilityRating().sendKeys(Keys.ENTER);

		String xpath = "//table[@id='gridtab_applicationFacilityRating_WIFT001MT']/tbody/tr[2]/td[text()='"
				+ testData.get("Facility Rating") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {

				}
			}
		}
	}

	@Then("^User_609 Check the Marketed By field is displayed$")
	public void User_609_Check_the_Marketed_By_field_is_displayed() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_MarketedBy_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_MarketedBy_609());
		try {
			if (FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_MarketedBy_609().isEnabled()) {
				Assert.assertEquals(true,
						FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_MarketedBy_609().isEnabled());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Click on the Additional Details tab$")
	public void User_609_click_on_the_additional_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab());
	}

	@And("^User_609 Select the Currency Code$")
	public void User_609_select_the_currency_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCodeSearch());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCodeSearch());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCodeSearch());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode());
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode()
				.sendKeys(testData.get("Currency Code"));
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode()
				.sendKeys(Keys.ENTER);

		String xpath = "//table[@id='gridtab_applicationFacilitylimitcurrency_WIFT001MT']/tbody/tr[2]/td[text()='"
				+ testData.get("Currency Code") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
	}

	@And("^User_609 Enter the Total Value$")
	public void User_609_enter_the_total_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue());
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue()
				.sendKeys(testData.get("Total value"));
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue()
				.sendKeys(Keys.TAB);
	}

	@And("^User_609 Select the Offer/Expiration$")
	public void User_609_select_the_offerexpiration() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration());
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration()
				.sendKeys(testData.get("Expire Date"));
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration()
				.sendKeys(Keys.TAB);
	}

	@And("^User_609 Click on the Limit Details tab$")
	public void User_609_click_on_the_limit_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab());
	}

	@And("^User_609 Click on the add new row icon$")
	public void User_609_click_on_the_add_new_row_icon() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon());
	}

	/*
	 * @And("^User_609 Click on Product Class search icon$") public void
	 * User_609_click_on_product_class_search_icon() throws Throwable {
	 * waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.
	 * Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search
	 * ()); clicksAndActionHelper.moveToElement(FmsPageobjects_609.
	 * Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search
	 * ()); clicksAndActionHelper.clickOnElement(FmsPageobjects_609.
	 * Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search
	 * ()); }
	 */
	@And("^User_609 Select the Product Class$")
	public void User_609_select_the_product_class() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass());
		WebElement ProductClass = FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass();
		ProductClass.click();
		ProductClass.sendKeys(testData.get("Product Class"));
		ProductClass.sendKeys(Keys.ENTER);
		// String xpath
		// ="//table[@id='gridtab_applicationfacilityLimitDetailsCLASS_WIFT001MT']/tbody/tr[2]/td[text()='"+String.valueOf(testData.get("Product
		// Class"))+"']";

		String xpath = "//table[@id='gridtab_applicationfacilityLimitDetailsCLASS_WIFT001MT']/tbody/tr[2]/td[text()='"
				+ testData.get("Product Class") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the GL Code$")
	public void User_609_Select_the_GL_Code() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCodeSearch());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCodeSearch());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCodeSearch());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCode());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCode());
		WebElement GLCode = FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCode();
		GLCode.click();
		GLCode.sendKeys(testData.get("GL Code"), Keys.ENTER);

		// table[@id='gridtab_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']/tbody/tr/td[text()='411001']
		String xpath = "//table[@id='gridtab_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']/tbody/tr/td[text()='"
				+ testData.get("GL Code") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}

			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.AccountName_609());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.AccountName_609());
		AccountName = FmsPageobjects_609.AccountName_609().getAttribute("prevvalue");
	}

	@And("User_609 Click on Journal Voucher Details in Facilities Management under Wifak Application")
	public void User_609_click_on_Journal_Voucher_Details_in_Facilities_Management_under_Wifak_Application()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.JournalVoucherDetails_wait_609());
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_JournalVoucherDetails());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_JournalVoucherDetails());
		// clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_JournalVoucherDetails());
	}

	@Then("User_609 Validate the Journal Voucher Details is Displayed in Facilities Management under Wifak Application")
	public void User_609_validate_the_Journal_Voucher_Details_is_displayed_in_Facilities_Management_under_Wifak_Application()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.JournalVoucherDetails_popup_609());
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.JournalVoucherDetails_Validate_609());
		Assert.assertEquals(AccountName, FmsPageobjects_609.JournalVoucherDetails_Validate_609().getText());
	}

	@And("User_609 Enable the Clean Flag")
	public void User_609_enable_the_clean_flag() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean());
	}

	@And("User_609 Select the Purpose Of Financing")
	public void User_609_select_the_purpose_of_financing() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingSearch());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingSearch());
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing());
		clicksAndActionHelper.doubleClick(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing());
		String xpath = "(//table[@id='gridtab_applicationfacilityLimitDetailsPURPOSE_OF_FIN_WIFT001MT']/tbody/tr/td[text()='"
				+ testData.get("Purpose Of Financing") + "'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(2000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on the add button$")
	public void User_609_click_on_the_add_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionHelper.clickOnElement(
						FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on Charges Details label$")
	public void User_609_Click_on_Charges_Details_label() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails());
	}

	@And("^User_609 Click and select the Charges Details$")
	public void User_609_Click_and_select_the_Charges_Details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetailsWait());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeClick());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeClick());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeSelect());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeSelect());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ChargesDetails_Ok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.ChargesDetails_Ok());
	}

	@And("^User_609 Click on the Document Details tab$")
	public void User_609_click_on_the_document_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
		clicksAndActionHelper
				.moveToElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab());
	}

	@And("^User_609 Select the Solicitor Name$")
	public void User_609_select_the_solicitor_name() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName());
		WebElement ProductClass = FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName();
		ProductClass.click();
		ProductClass.sendKeys(testData.get("Solicitor Name"));
		ProductClass.sendKeys(Keys.ENTER);

		String xpath = "//table[@id='gridtab_applicationFacilitysolicitor_WIFT001MT']/tbody/tr[2]/td[text()='"
				+ String.valueOf(testData.get("Solicitor Name")) + "']";
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i % 5 == 0) {
					clicksAndActionHelper.moveToElement(FmsPageobjects_609.SolicitorNameGridNext());
					clicksAndActionHelper.clickOnElement(FmsPageobjects_609.SolicitorNameGridNext());
				}
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the Estimator Name$")
	public void User_609_select_the_estimator_name() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
		clicksAndActionHelper.moveToElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName());
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName()
				.sendKeys(testData.get("Estimator Name"));
		FmsPageobjects_609.Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName()
				.sendKeys(Keys.ENTER);

		String xpath = "//table[@id='gridtab_applicationFacilityEstimator_WIFT001MT']/tbody/tr[2]/td[text()='"
				+ String.valueOf(testData.get("Estimator Name")) + "']";
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i % 5 == 0) {
					clicksAndActionHelper.moveToElement(FmsPageobjects_609.EstimatorNameGridNext());
					clicksAndActionHelper.clickOnElement(FmsPageobjects_609.EstimatorNameGridNext());
				}
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click the save button")
	public void User_609_click_the_save_button() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.save());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.save());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.save());
	}

	@And("User_609 Click the validate button")
	public void User_609_click_the_validate_button() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.validate());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.validate());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Application_Confirmok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Application_Confirmok());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.confirmPopup_609());
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ConfirmAlert_Ok_609());
		FmsPageobjects_609.ConfirmAlert_Ok_609().click();

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ApplicationNo_609());
		ApplicationNo = FmsPageobjects_609.ApplicationNo_609().getText().substring(23, 27);
		System.err.println("Reference Number: " + ApplicationNo);

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Application_Ok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Application_Ok());

	}

	@And("^User_609 Click on the Approve level1 Screen$")
	public void User_609_Click_on_the_Approve_level1_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel1());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel1());
		System.out.println(testData.get("Revolving/One-Off"));
	}

	@And("^User_609 Select the Code in Approve level1$")
	public void User_609_Select_the_Code_in_Approve_level1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel1_Code());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel1_Code());

		System.out.println("ApplicationNo  :" + ApplicationNo);
		FmsPageobjects_609.WifakApplication_ApproveLevel1_Code().sendKeys(ApplicationNo, Keys.ENTER);
		String xpath = "//table[@id='applicationFacilityGridTbl_Id_WIFT001AP1']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the Decision in Approve level1$")
	public void User_609_Select_the_Decision_in_Approve_level1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel1_Decision());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel1_Decision());
		dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.WifakApplication_ApproveLevel1_Decision(),
				testData.get("AL1 Decision"));
	}

	@And("^User_609 Select the More Decision in Approve level1$")
	public void User_609_Select_the_More_Decision_in_Approve_level1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_ApproveLevel1_MoreDecision());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel1_MoreDecision());
		dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.WifakApplication_ApproveLevel1_MoreDecision(),
				testData.get("AL1 Forward To  Decision"));
	}

	@And("^User_609 Click on Submit in Approve Level1$")
	public void User_609_Click_on_Submit_in_Approve_Level1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel1_Submit());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.WifakApplication_ApproveLevel1_Submit());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel1_Submit());
	}

	@And("^User_609 Click on the Approve level2 Screen$")
	public void User_609_Click_on_the_Approve_level2_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel2());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel2());
	}

	@And("^User_609 Select the Code in Approve level2$")
	public void User_609_Select_the_Code_in_Approve_level2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel2_Code());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel2_Code());
		System.out.println("ApplicationNo  :" + ApplicationNo);
		FmsPageobjects_609.WifakApplication_ApproveLevel2_Code().sendKeys(ApplicationNo, Keys.ENTER);
		String xpath = "//table[@id='applicationFacilityGridTbl_Id_WIFT001AP2']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";

		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_609 Select the Decision in Approve level2$")
	public void User_609_Select_the_Decision_in_Approve_level2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel2_Decision());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel2_Decision());
		dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.WifakApplication_ApproveLevel2_Decision(),
				testData.get("Approve level2 Decision"));
	}

	@And("^User_609 Click on Submit in Approve Level2$")
	public void User_609_Click_on_Submit_in_Approve_Level2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel2_Submit());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.WifakApplication_ApproveLevel2_Submit());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel2_Submit());
	}

	@And("^User_609 Click on the Approve level3 Screen$")
	public void User_609_Click_on_the_Approve_level3_Screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel3());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel3());
	}

	@And("^User_609 Select the Code in Approve level3$")
	public void User_609_Select_the_Code_in_Approve_level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel3_Code());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel3_Code());
		System.out.println("ApplicationNo  :" + ApplicationNo);
		FmsPageobjects_609.WifakApplication_ApproveLevel3_Code().sendKeys(ApplicationNo, Keys.ENTER);
		String xpath = "//table[@id='applicationFacilityGridTbl_Id_WIFT001AP3']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * try { WebElement Code = driver.findElement(By.xpath(xpath));
		 * waitHelper.waitForElementwithFluentwait(driver,Code); if (Code.isDisplayed())
		 * { clicksAndActionHelper.doubleClick(Code); } } catch (Exception e) {
		 * Assert.fail(e.getMessage()); }
		 */
	}

	@And("^User_609 Select the Decision in Approve level3$")
	public void User_609_Select_the_Decision_in_Approve_level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel3_Decision());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel3_Decision());
		dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.WifakApplication_ApproveLevel3_Decision(),
				testData.get("AL3 Decision"));
	}

	@And("^User_609 Select the More Decision in Approve level3$")
	public void User_609_Select_the_More_Decision_in_Approve_level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_ApproveLevel3_MoreDecision());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel3_MoreDecision());
		dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.WifakApplication_ApproveLevel3_MoreDecision(),
				testData.get("Approve level3 More Decision"));
	}

	@And("^User_609 Click on Submit in Approve Level3$")
	public void User_609_Click_on_Submit_in_Approve_Level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_ApproveLevel3_Submit());

		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApproveLevel3_Submit());
	}

	@And("^User_609 Click on Dismiss if Send Alert pop up appears in Approve Level3$")
	public void User_609_Click_on_Dismiss_if_Send_Alert_pop_up_appears_in_Approve_Level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ApproveLevel3_SendAlert_Ok_609());
		FmsPageobjects_609.ApproveLevel3_SendAlert_Ok_609().click();
	}

	@And("User_609 Click on the Facilities Management submenu")
	public void user_609_click_on_the_facilities_management_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FacilitiesManagement());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FacilitiesManagement());
	}

	@And("User_609 Click on the Maintenance Screen under Facilities Management submenu")
	public void user_609_click_on_the_maintenance_screen_under_facilities_management_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_Maintenance());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_Maintenance());

	}

	@And("User_609 Click on the Search")
	public void user_609_click_on_the_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.SearchButton());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.SearchButton());
	}

	@And("User_609 Click on the Clear")
	public void user_609_click_on_the_clear() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ClearButton());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.ClearButton());
		Thread.sleep(5000);
	}

	@And("User_609 Select the Code in Facilities Management under Wifak Application")
	public void User_609_Select_the_Code_in_Facilities_Management_under_Wifak_Application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_Code());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_Code());
//					FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_Code().sendKeys(ApplicationNo,Keys.ENTER);
//				
//					String xpath ="//table[@id='facilityManagementGridTbl_Id_WIFT008MT']/tbody/tr/td[text()='"+"000000"+ApplicationNo+"']";
		FmsPageobjects_609.WifakapplictionSubmenu_FacilitiesManagement_Code().sendKeys("5042", Keys.ENTER);
		Thread.sleep(3000);
		String xpath = "//table[@id='facilityManagementGridTbl_Id_WIFT008MT']/tbody/tr/td[text()=" + 000000
				+ "+'5042']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					Thread.sleep(3000);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	/*
	 * @Given("User_609 Click the ok button to proceed") public void
	 * User_609_click_the_ok_button_to_proceed() {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * FmsPageobjects_609.Confirmok());
	 * clicksAndActionHelper.moveToElement(FmsPageobjects_609.Confirmok()); try { if
	 * (FmsPageobjects_609.Confirmok().isDisplayed()) {
	 * FmsPageobjects_609.Confirmok().click(); } } catch (Exception e) {
	 * Assert.fail(e.getMessage()); } }
	 * 
	 * @Given("User_609 Click Dismiss in Send Alert") public void
	 * User_609_click_dismiss_in_send_alert() {
	 * waitHelper.waitForElementwithFluentwait(driver,
	 * FmsPageobjects_609.SendAlert());
	 * clicksAndActionHelper.moveToElement(FmsPageobjects_609.SendAlert()); try { if
	 * (FmsPageobjects_609.SendAlert().isDisplayed()) {
	 * FmsPageobjects_609.SendAlert().click(); } } catch (Exception e) {
	 * Assert.fail(e.getMessage()); } }
	 */

	@And("^User_609 Click on Approval Committee Recommendations in Wifak Application$")
	public void User_609_Click_on_Approval_Committee_Recommendations_in_Wifak_Application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations());
	}

	@And("^User_609 Select the Code in Approval Committee Recommendations$")
	public void User_609_Select_the_Code_in_Approval_Committee_Recommendations() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Code());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Code());
		System.out.println("ApplicationNo  :" + ApplicationNo);

		FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Code().sendKeys(ApplicationNo, Keys.ENTER);

		String xpath = "//table[@id='applicationFacilityGridTbl_Id_WIFT002MT']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click Recommend button in Approval Committee Recommendations$")
	public void User_609_Click_Recommend_button_in_Approval_Committee_Recommendations() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Recommend());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Recommend());
	}

	@And("^User_609 Select the decision in Approval Committee Recommendations$")
	public void User_609_Select_the_decision_in_Approval_Committee_Recommendations() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.ApprovalCommitteesRecommendation_Popup_609());
		String RecommendedBy = "(//table[@id='ApplicationFacilityRecommendationGrid_WIFT002MT']//td[text()='"
				+ User.get("UserName") + "'])[1]";
		for (int i = 0; i < 500; i++) {
			try {
				WebElement RecommendedBy_user = driver.findElement(By.xpath(RecommendedBy));
				RecommendedBy_user.click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation(),
				testData.get("Committee Recommendations"));

	}

	@And("^User_609 Validate the Committee Recommendation is Enabled$")
	public void User_609_Validate_the_Committee_Recommendation_is_Enabled() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation());
		Assert.assertEquals(FmsPageobjects_609
				.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation().isEnabled(), true);
		System.out.println("True");
	}

	@And("^User_609 Click on Ok in Approval Committee Recommendations$")
	public void User_609_Click_on_Ok_in_Approval_Committee_Recommendations() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok());
	}

///****************************************************Grading**********************************************************************///

	@And("^User_609 Click on Grading under WIFAK APPLICATION submenu$")
	public void User_609_Click_on_Grading_under_WIFAK_APPLICATION_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_Grading_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_Grading_609());
	}

	@And("^User_609 click on the Maintenance Screen in Grading$")
	public void User_609_click_on_the_Maintenance_Screen_in_Grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_Grading_Maintenance_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_Grading_Maintenance_609());
	}

	@And("^User_609 Select the Application Refernece in Grading$")
	public void User_609_Select_the_Application_Refernece_in_Grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_Grading_Maintenance_SearchCode_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_Grading_Maintenance_SearchCode_609());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_Grading_Maintenance_Code_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_Grading_Maintenance_Code_609());
		FmsPageobjects_609.WifakApplication_Grading_Maintenance_Code_609().sendKeys(ApplicationNo, Keys.ENTER);

		String xpath = "//table[@id='gridtab_Application_Ref_WIFT003MT']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on Save Button in Grading$")
	public void User_609_Click_on_Save_Button_in_Grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_Grading_Maintenance_Save_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_Grading_Maintenance_Save_609());
	}

	@And("^User_609 Click on Approve in Grading$")
	public void User_609_Click_on_Approve_in_Grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_Grading_Approvee_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_Grading_Approvee_609());
	}

	@And("^User_609 Select the Code in Approve screen in grading$")
	public void User_609_Select_the_Code_in_Approve_screen_in_grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.WifakApplication_Grading_Approve_Code_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_Grading_Approve_Code_609());
		FmsPageobjects_609.WifakApplication_Grading_Approve_Code_609().sendKeys(ApplicationNo, Keys.ENTER);

		String xpath = "//table[@id='cust_grade_maint_WIFT003AP']/tbody/tr[2]/td[text()='" + "000000" + ApplicationNo
				+ "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on Approve in Approve screen in Grading$")
	public void User_609_Click_on_Approve_in_Approve_screen_in_Grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.WifakApplication_Grading_Approve_ApproveButton_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.WifakApplication_Grading_Approve_ApproveButton_609());
	}

	@And("^User_609 Click on Dismiss if Send Alert pop up appears in Grading$")
	public void User_609_Click_on_Dismiss_if_Send_Alert_pop_up_appears_in_grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Grading_sendAlertPopup_609());
		for (int i = 0; i < 200; i++) {
			try {
				FmsPageobjects_609.Grading_sendAlertPopup_609().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click the Grading ok button$")
	public void User_609_click_the_Grading_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.CorporateJK_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_609());
	}

///**********************************************************************************************************************///

	@And("User_609 Click on Corporate JK menu")
	public void User_609_click_on_corporate_jk_menu() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.CorporateJK_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_609());
	}

	@And("User_609 Click on Corporate Fin submenu under Corporate JK")
	public void User_609_click_on_corporate_fin_submenu_under_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.CorporateJK_CorporateFin_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_CorporateFin_609());
	}

	@And("User_609 Click on Request For Financing under Corporate Fin submenu")
	public void User_609_click_on_request_for_financing_under_corporate_fin_submenu() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_CorporateFin_RequestForFinancing_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_CorporateFin_RequestForFinancing_609());
	}

	@And("User_609 Click on the Maintenance under Request for Financing in Corporate JK")
	public void User_609_click_on_the_maintenance_under_request_for_financing_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_CorporateFin_RequestForFinancing_Maintenance_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_CorporateFin_RequestForFinancing_Maintenance_609());
	}

	@And("User_609 Select the Reason for Submission in Corporate JK")
	public void User_609_select_the_reason_for_submission_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609(),
				testData.get("Application For"));
	}

	@And("User_609 Select the Customer in Corporate JK")
	public void User_609_select_the_customer_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_CustomerSearch_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_CustomerSearch_609());
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_Customer_609());
		WebElement Customer = FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_Customer_609();
		Customer.sendKeys(testData.get("CIF No"), Keys.ENTER);

//			String ApplicationCode = FacilityCode;
//			int ApplicationCodelen = 10 - ApplicationCode.length();
//		    for(int i = 1; i <=ApplicationCodelen ; i++){
//		    	ApplicationCode= "0" + ApplicationCode;
//		    }

		String xpath = "//table[@id='gridtab_requestFinanacingCif_CFIRF00MT']/tbody/tr/td[text()='"
				+ testData.get("CIF No") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select Facility Type in Corporate JK")
	public void User_609_select_facility_type_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_FacilityTypeSearch_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_FacilityTypeSearch_609());
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_FacilityType_609());
		WebElement FacilityType = FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_FacilityType_609();
		FacilityType.sendKeys(testData.get("Facility Type"), Keys.ENTER);

		String xpath = "(//table[@id='gridtab_requestFinancingFacilityType_CFIRF00MT']/tbody/tr/td[text()='"
				+ testData.get("Facility Type") + "'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Total Limit in Corporate JK")
	public void User_609_enter_the_total_limit_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_TotalLimit_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_TotalLimit_609());
		FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_TotalLimit_609()
				.sendKeys(testData.get("Total value"), Keys.TAB);
	}

	@And("User_609 Click on the Sublimit tab in Corporate JK")
	public void User_609_click_on_the_sublimit_tab_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_SublimitTab_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_SublimitTab_609());
	}

	@And("User_609 Click on Add icon under Sublimit tab in Corporate JK")
	public void User_609_click_on_add_icon_under_sublimit_tab_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_AddIcon_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_AddIcon_609());
	}

	@And("User_609 Select the Product Class in Corporate JK")
	public void User_609_select_the_product_class_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_ProductClassSearch_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_ProductClassSearch_609());
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_ProductClass_609());
		WebElement ProductClass = FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_ProductClass_609();
		ProductClass.sendKeys(testData.get("Product Class"), Keys.ENTER);

		String xpath = "//table[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_CFIRF00MT']/tbody/tr[2]/td[text()='"
				+ testData.get("Product Class") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enable the Clean Flag in Corporate JK")
	public void User_609_enable_the_clean_flag_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_Clean_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_Clean_609());

	}

	@And("User_609 Enter the New Margin Value in Corporate JK")
	public void User_609_enter_the_new_margin_value_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_NewMargin_609());
		WebElement NewMargin = FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_NewMargin_609();
		NewMargin.sendKeys(testData.get("Margin Rate"), Keys.TAB);
	}

	@And("User_609 Click on Add in Corporate JK")
	public void User_609_click_on_add_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_AddButton_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_SublimitTab_AddButton_609());
	}

	@And("User_609 Click on Save button in Corporate JK")
	public void User_609_click_on_save_button_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.CorporateJK_RequestForFinancing_Save_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_Save_609());
	}

	@And("User_609 Click on Validate button in Corporate JK")
	public void User_609_click_on_validate_button_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_Validate_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_Validate_609());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Application_Confirmok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Application_Confirmok());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.confirmPopup_609());
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ConfirmAlert_Ok_609());
		FmsPageobjects_609.ConfirmAlert_Ok_609().click();

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ApplicationNo_609());
		ApplicationNo = FmsPageobjects_609.ApplicationNo_609().getText().substring(23, 27);
		System.err.println("Reference Number: " + ApplicationNo);

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Application_Ok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Application_Ok());
	}

	@And("User_609 Click on Dismiss if Send Alert pop up appears in Corporate JK")
	public void User_609_click_on_dismiss_if_send_alert_pop_up_appears_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_DismissPopUp_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_DismissPopUp_609());
	}

	@And("User_609 Click on Approve Level1 in Corporate JK")
	public void User_609_click_on_approve_level1_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_609());
	}

	@And("User_609 Select the Code in Approve Level1 in Corporate JK")
	public void User_609_select_the_code_in_approve_level1_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_Code_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_Code_609());
		FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_Code_609().sendKeys(ApplicationNo, Keys.ENTER);

		String xpath = "//table[@id='requestFinancingGridTbl_Id_CFIRF00P1']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click on Customer Grading and Recommendations tab in Corporate JK")
	public void User_609_click_on_customer_grading_and_recommendations_tab_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.CorporateJK__RequestForFinancing_Maintenance_CustomerGradingandRecommendationsTab_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.CorporateJK__RequestForFinancing_Maintenance_CustomerGradingandRecommendationsTab_609());
	}

	@And("User_609 Select the Dicision in Approve Level1 in Corporate JK")
	public void User_609_select_the_dicision_in_approve_level1_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_Decision_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_Decision_609());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_Decision_609(),
				testData.get("Approve level1 Decision"));

	}

	@And("User_609 Select the Dicision Forward to in Approve Level1 in Corporate JK")
	public void User_609_select_the_dicision_Forward_to_in_approve_level1_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_ForwardDecision_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_ForwardDecision_609());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_ForwardDecision_609(),
				testData.get("AL1 Forward TO"));
	}

	@And("User_609 Click on Approve in Approve Level1 in Corporate JK")
	public void User_609_click_on_approve_in_approve_level1_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_Approve_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_Approve_609());
	}

	@And("User_609 Click on Dismiss if Send Alert pop up appears in Approve Level1 in Corporate JK")
	public void User_609_click_on_dismiss_if_send_alert_pop_up_appears_in_approve_level1_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_SendAlertPopUp_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel1_SendAlertPopUp_609());
	}

	@And("User_609 Click on Approve Level3 in Corporate JK")
	public void User_609_click_on_approve_level3_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_609());

	}

	@And("User_609 Select the Code in Approve Level3 in Corporate JK")
	public void User_609_select_the_code_in_approve_level3_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_Code_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_Code_609());
		FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_Code_609().sendKeys(ApplicationNo, Keys.ENTER);

		String xpath = "//table[@id='requestFinancingGridTbl_Id_CFIRF00P3']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the Dicision in Approve Level3 in Corporate JK")
	public void User_609_select_the_dicision_in_approve_level3_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_Decision_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_Decision_609());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_Decision_609(),
				testData.get("Approve level3  Decision"));
	}

	@And("User_609 Click on Approve in Approve Level3 in Corporate JK")
	public void User_609_click_on_approve_in_approve_level3_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_Approve_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_Approve_609());
	}

	@And("User_609 Click on Dismiss if Send Alert pop up appears in Approve Level3 in Corporate JK")
	public void User_609_click_on_dismiss_if_send_alert_pop_up_appears_in_approve_level3_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_SendAlertPopUp_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_ApproveLevel3_SendAlertPopUp_609());
	}

	@And("User_609 Click on Credit Review under Corporate Fin submenu")
	public void user_609_click_on_credit_review_under_corporate_fin_submenu() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview_609());

	}

	@And("User_609 Select the Code in Credit Review in Corporate JK")
	public void user_609_select_the_code_in_credit_review_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview_Code_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview_Code_609());

		FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview_Code_609().sendKeys(ApplicationNo, Keys.ENTER);
		String xpath = "//table[@id='requestFinancingGridTbl_Id_CFIRF00CV']/tbody/tr/td[text()='" + "000000"
				+ ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Click on Credit Committee Recommendations tab in Corporate JK")
	public void user_609_click_on_credit_committee_recommendations_tab_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_609());
	}

	@And("User_609 Click on Recommendations Dropdown in Corporate JK")
	public void user_609_click_on_recommendations_dropdown_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_609());
	}

	@And("User_609 Click on Recommendations AddIcon in Corporate JK")
	public void user_609_click_on_recommendations_add_icon_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_AddIcon_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_AddIcon_609());
	}

	@And("User_609 Select the Recommended By in Corporate JK")
	public void user_609_select_the_recommended_by_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_CRRecommendation_609());
		String RecommendedBy = "Recommended By";
		String xpath = "//table[@id='requestFinancingGridTbl_Id_CFIRF00CV']/tbody/tr/td[text()='" + User.get("UserName")
				+ "' and @tdlabel='" + RecommendedBy + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_609 Select the CR Recommendation in Corporate JK")
	public void user_609_select_the_cr_recommendation_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_CRRecommendation_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_CRRecommendation_609());
	}

	@And("User_609 Click on Credit Review Button in Corporate JK")
	public void user_609_click_on_credit_review_button_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_CreditReview_CreditReviewbutton_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK_CreditReview_CreditReviewbutton_609());
	}

	@And("User_609 Click on Dismiss if Send Alert pop up appears in Credit Review in Corporate JK")
	public void user_609_click_on_dismiss_if_send_alert_pop_up_appears_in_credit_review_in_corporate_jk() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview__SendAlertPopUp_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.CorporateJK_RequestForFinancing_CreditReview__SendAlertPopUp_609());
	}

//		@And("User_609 Select the Reason for Submission after Approve in Corporate JK")
//		public void User_609_select_the_reason_for_submission_after_Approve_in_corporate_jk() {
//			waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609());
//			clicksAndActionHelper.clickOnElement(FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609()); 
//			dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609(), testData.get(""));  
//		}
//		
//		@And("User_609 Select Existing Facility Number in Corporate JK")
//		public void User_609_Select_Existing_Facility_Number_in_Corporate_JK() {
//			waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.());
//			clicksAndActionHelper.clickOnElement(FmsPageobjects_609.()); 
//			dropdownhelper.SelectUsingVisibleText(FmsPageobjects_609.(), testData.get(""));  
//		}

	@And("^User_609 Click on Request Menu$")
	public void User_609_click_on_Request_Menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Request_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Request_609());
	}

	@And("^User_609 Click on the Request Financing submenu in Request$")
	public void User_609_click_on_the_request_financing_submenu_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Request_RequestFinancing_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Request_RequestFinancing_609());
	}

	@And("^User_609 Click on the Request For Financing under Request Financing submenu in Request$")
	public void User_609_click_on_the_request_for_financing_under_Request_Financing_submenu_in_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_609());
		clicksAndActionHelper.moveToElement(FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_609());
	}

	@And("^User_609 Click on the Maintenance screen in Request$")
	public void User_609_click_on_the_maintenance_screen_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_609());
	}

	@And("^User_609 Select the Reason For Submission field in Request$")
	public void User_609_select_the_reason_for_submission_fieldin_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_ReasonForSubmission_609());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_ReasonForSubmission_609(),
				testData.get("Application For"));
	}

	@And("^User_609 Select the Customer field in Request$")
	public void User_609_Select_the_Customer_field_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Customer_Search_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Customer_Search_609());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Customer_609());
		WebElement Customer = FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Customer_609();
		Customer.click();
		Customer.sendKeys(testData.get("CIF No"), Keys.ENTER);

		String xpath = "//table[@id='gridtab_requestFinanacingCif_RFFRF00MT']/tbody/tr/td[text()='"
				+ testData.get("CIF No") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the Facility Type in Request$")
	public void User_609_Select_the_Facility_Type_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_FacilityTypeSearch_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_FacilityTypeSearch_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_FacilityType_609());
		WebElement FacilityType = FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_FacilityType_609();
		FacilityType.click();

		FacilityType.sendKeys(testData.get("Facility Type"), Keys.ENTER);
		// table[@id='gridtab_requestFinancingFacilityType_RFFRF00MT']/tbody/tr/td[text()='19']
		String xpath = "//table[@id='gridtab_requestFinancingFacilityType_RFFRF00MT']/tbody/tr/td[text()='"
				+ testData.get("Facility Type") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Enter the Total Limit in Request$")
	public void User_609_Enter_the_Total_Limit_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_TotalLimit_609());
		WebElement TotalLimit = FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_TotalLimit_609();
		TotalLimit.sendKeys(testData.get("Total value"), Keys.TAB);
	}

	@And("^User_609 Select the Customer Account in Request$")
	public void User_609_Select_the_Customer_Account_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_CustomerAccount_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_CustomerAccount_609());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_CustomerAccount_GL_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_CustomerAccount_GL_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_CustomerAccount_GL_609()
				.sendKeys("GL", Keys.ENTER);

		String xpath = "//table[@id='gridtab_requestFinancingFacilityTypetACC_Add_Det_RFFRF00MT']/tbody/tr/td[@tdlabel='GL']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_609 Click on the Disbursement or Sublimit tab in Request$")
	public void User_609_Click_on_the_Disbursement_or_Sublimit_tab_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_609());
	}

	@And("^User_609 Click on Add icon in Disbursement or sublimit tab in Request$")
	public void User_609_Click_on_Add_icon_in_Disbursement_or_sublimit_tab_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Addicon_609());
		WebElement AddIcon = FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Addicon_609();
		try {
			for (int i = 0; i <= 200; i++) {
				if (AddIcon.isDisplayed()) {
					AddIcon.click();
					break;
				}
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}

	@And("^User_609 Select the Item in Request$")
	public void User_609_Select_the_Item_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Item_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Item_609().click();
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Item_609(),
				testData.get("Item"));
	}

	@And("^User_609 Select the Product Class in Request$")
	public void User_609_Select_the_product_Class_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_ProductClassSearch_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_ProductClassSearch_609()
				.click();

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_ProductClass_609());
		WebElement FacilityType = FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_ProductClass_609();
		FacilityType.click();

		FacilityType.sendKeys(testData.get("Product Class"), Keys.ENTER);
		String xpath = "//table[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']/tbody/tr/td[text()='"
				+ testData.get("Product Class") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Click on Fees or Charges label in Request$")
	public void User_609_Click_on_Fees_or_Charges_label_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_FeesCharges_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_FeesCharges_609());

	}

	@And("^User_609 Click and Select the Charges in Request$")
	public void User_609_Click_and_Select_the_Charges_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_FeesCharges_Select_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_FeesCharges_Select_609());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_FeesCharges_CollectAtFacilityApproval_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_FeesCharges_CollectAtFacilityApproval_609());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_FeesCharges_Ok_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_FeesCharges_Ok_609());

	}

	@And("^User_609 Select the Type in Request$")
	public void User_609_Select_the_type_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_TypeSearch_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_TypeSearch_609().click();

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Type_609());
		WebElement FacilityType = FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Type_609();
		FacilityType.click();
		FacilityType.sendKeys(testData.get("Type"), Keys.ENTER);

		String xpath = "//table[@id='gridtab_requestFinancingLimitDetailsClassType_RFFRF00MT']//tbody/tr/td[text()='"
				+ testData.get("Type") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Enter the New margin value in Request$")
	public void User_609_Enter_the_New_margin_value_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_NewMargin_609());
		WebElement NewMargin = FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_NewMargin_609();
		NewMargin.click();
		NewMargin.clear();
		NewMargin.sendKeys(testData.get("Margin Rate"), Keys.TAB);

	}

	@And("^User_609 Enable Clean flag in Product Class in Request$")
	public void User_609_Enable_Clean_flag_in_Product_Class_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Clean_609());
		WebElement Clean = FmsPageobjects_609
				.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Clean_609();
		try {
			if (Clean.isSelected()) {
				Assert.assertTrue(true);
			} else {
				Clean.click();
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Enter Values in Tenure in Request$")
	public void User_609_Enter_Values_in_Tenure_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Tenure_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Tenure_609().click();
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Tenure_609().clear();
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Tenure_609()
				.sendKeys(testData.get("Tenure"), Keys.TAB);
	}

	@And("^User_609 Click on Add in Product Class in Request$")
	public void User_609_Click_on_Add_in_Product_Class_in_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Add_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Maintenance_Sublimit_Add_609().click();
	}

	@And("^User_609 Click the Save Button in Request$")
	public void User_609_Click_the_Save_Button_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Save_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Save_609().click();
	}

	@And("^User_609 Click the Validate Button in Request$")
	public void User_609_Click_the_Validate_Button_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Validate_609());
		FmsPageobjects_609.Request_RequestFinancing_RequestForFinancing_Validate_609().click();

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Application_Confirmok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Application_Confirmok());

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.confirmPopup_609());
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ConfirmAlert_Ok_609());
		FmsPageobjects_609.ConfirmAlert_Ok_609().click();

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.ApplicationNo_609());
		ApplicationNo = FmsPageobjects_609.ApplicationNo_609().getText().substring(23, 27);
		System.err.println("Reference Number: " + ApplicationNo);

		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Application_Ok());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Application_Ok());

	}

	@And("User_609 Click on Dismiss if Send Alert pop up appears in Request")
	public void User_609_click_on_dismiss_if_send_alert_pop_up_appears_in_request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestForFinancing_DismissPopUp_609());
		try {
			if (FmsPageobjects_609.Request_RequestForFinancing_DismissPopUp_609().isDisplayed()) {
				clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Request_RequestForFinancing_DismissPopUp_609());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Click on Approve Level1 in Request$")
	public void User_609_Click_on_Approve_Level1_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_609());
		FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_609().click();
	}

	@And("User_609 Select the Code in Approve Level1 in Request")
	public void User_609_Select_the_Code_in_Approve_Level1_in_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Code_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Code_609());
		FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Code_609().sendKeys(ApplicationNo, Keys.ENTER);

		String xpath = "//table[@id='requestFinancingGridTbl_Id_RFFRF00P1']/tbody/tr[2]/td[text()='" + "000000"
				+ ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_609 Click on Customer Grading Recommendations in Approve Level1 in Request$")
	public void User_609_Click_on_Customer_Grading_Recommendations_in_Approve_Level1_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_CustomerGradingRecommendations_609());
		FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_CustomerGradingRecommendations_609().click();
	}

	@And("^User_609 Select the Decision in Approve Level1 in Request$")
	public void User_609_Select_the_Decision_in_Approve_Level1_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Decision_609());
		WebElement Approvelevel1_Decision = FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Decision_609();
		Approvelevel1_Decision.click();
		dropdownhelper.SelectUsingVisibleText(Approvelevel1_Decision, testData.get("Approve level1 Decision"));
	}

	@And("^User_609 Click on Approve in Approve Level1 in Request$")
	public void User_609_Click_on_Approve_in_Approve_Level1_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Approve_609());
		FmsPageobjects_609.Request_RequestFinancing_ApproveLevel1_Approve_609().click();
	}

	@And("User_609 Click on Dismiss if Send Alert pop up appears in Request in Approve Level1")
	public void User_609_click_on_dismiss_if_send_alert_pop_up_appears_in_request_in_Approve_Level1() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestForFinancing_ApproveLevel1_DismissPopUp_609());
		try {
			if (FmsPageobjects_609.Request_RequestForFinancing_ApproveLevel1_DismissPopUp_609().isDisplayed()) {
				clicksAndActionHelper.clickOnElement(
						FmsPageobjects_609.Request_RequestForFinancing_ApproveLevel1_DismissPopUp_609());
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Click on Credit Review screen in Request$")
	public void User_609_Click_on_Credit_Review_screen_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Request_RequestFinancing_CreditReview_609());
		FmsPageobjects_609.Request_RequestFinancing_CreditReview_609().click();
	}

	@And("User_609 Select the Code in Credit Review screen in Request")
	public void User_609_Select_the_Code_in_Credit_Review_screen_in_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_CreditReview_Code_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Request_RequestFinancing_CreditReview_Code_609());
		FmsPageobjects_609.Request_RequestFinancing_CreditReview_Code_609().sendKeys(ApplicationNo, Keys.ENTER);
		// FmsPageobjects_609.REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_Code_609().sendKeys(Keys.ENTER);

		String ApplicationCode = FacilityCode;
		int ApplicationCodelen = 10 - ApplicationCode.length();
		for (int i = 1; i <= ApplicationCodelen; i++) {
			ApplicationCode = "0" + ApplicationCode;
		}
		String xpath = "//table[@id='requestFinancingGridTbl_Id_RFFRF00CV']/tbody/tr/td[text()='" + "000000"
				+ ApplicationCode + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
					clicksAndActionHelper.doubleClick(Code);
				}
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_609 Click on Credit Committee Recommendations tab in Request$")
	public void User_609_Click_on_Credit_Committee_Recommendations_tab_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_CreditReview_CreditCommitteeRecommendations_609());
		FmsPageobjects_609.Request_RequestFinancing_CreditReview_CreditCommitteeRecommendations_609().click();
	}

	@And("^User_609 Click on Recommendations Dropdown in Request$")
	public void User_609_Click_on_Recommendations_Dropdown_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Request_RequestFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_609());
		FmsPageobjects_609.Request_RequestFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_609()
				.click();
	}

	@And("^User_609 Click on Credit Review Button in Request$")
	public void User_609_Click_on_Credit_Review_Button_in_Request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Request_RequestFinancing_CreditReviewBtton_609());
		FmsPageobjects_609.Request_RequestFinancing_CreditReviewBtton_609().click();
	}

///*******************************************************Draw Down Request**************************************************************************///

	@And("User_609 Click on Draw Down Request")
	public void user_609_click_on_draw_down_request() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Wifakappliction_DrawDownRequest_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Wifakappliction_DrawDownRequest_609());
	}

	@And("User_609 Click on Maintenance screen under Draw Down Request")
	public void user_609_click_on_maintenance_screen_under_draw_down_request() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.DrawDownRequest_Maintenanace_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_609());
	}

	@And("User_609 Select the Facility Reference in Draw Down Request")
	public void user_609_Select_the_Facility_Reference_in_draw_down_request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_FacilityReferenceSearch_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_FacilityReferenceSearch_609());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_FacilityReference_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_FacilityReference_609());
		FmsPageobjects_609.DrawDownRequest_Maintenanace_FacilityReference_609().sendKeys(ApplicationNo, Keys.ENTER);

		String xpath = "//table[@id='gridtab_drawDownRequestFacilityReference_WIFT009MT']/tbody/tr[2]/td[text()='"
				+ "000000" + ApplicationNo + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the DrawDown Type in Draw Down Request")
	public void User_609_Select_the_DrawDown_Type_in_Draw_Down_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownTypeSearch_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownTypeSearch_609());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownType_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownType_609());
		FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownType_609().sendKeys(testData.get("DrawDown Type"),
				Keys.ENTER);

		String xpath = "//table[@id='gridtab_drawDownRequestDrawDownType_WIFT009MT']/tbody/tr/td[text()='"
				+ testData.get("DrawDown Type") + "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the Value in Description English field in Draw Down Request")
	public void User_609_Enter_the_Value_in_Description_English_field_in_Draw_Down_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DescriptionEnglish_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_DescriptionEnglish_609());
		FmsPageobjects_609.DrawDownRequest_Maintenanace_DescriptionEnglish_609()
				.sendKeys(testData.get("Description English"), Keys.TAB);

	}

	@And("User_609 Enter the Value in Description Arab field in Draw Down Request")
	public void User_609_Enter_the_Value_in_Description_arab_field_in_Draw_Down_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DescriptionArab_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_DescriptionArab_609());
		FmsPageobjects_609.DrawDownRequest_Maintenanace_DescriptionArab_609().sendKeys(testData.get("Description Arab"),
				Keys.TAB);
	}

	@And("User_609 Enter the Value in Value Date field in Draw Down Request")
	public void User_609_Enter_the_Value_in_Value_Date_field_in_Draw_Down_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_ValueDate_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_ValueDate_609());
		FmsPageobjects_609.DrawDownRequest_Maintenanace_ValueDate_609().sendKeys(testData.get("Value Date"), Keys.TAB);
	}

	@And("User_609 Click on the Drawdown Additional Details in Draw Down Request")
	public void User_609_Click_on_the_Drawdown_Additional_Details_in_Draw_Down_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_609());
	}

	@And("User_609 Select the Product Class in Draw Down Request")
	public void User_609_Select_the_Product_Class_in_Draw_Down_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLNSearch_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLNSearch_609());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLN_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLN_609());
		FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLN_609()
				.sendKeys(testData.get("Description Arab"), Keys.ENTER);

		String xpath = "(//table[@id='gridtab_drawDownRequestProduct_Class_WIFT009MT']/tbody/tr[2]/td[text()='" + "000"
				+ testData.get("Product class") + "'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Select the DrawDown CY in Draw Down Request")
	public void User_609_Select_the_DrawDown_CY_in_Draw_Down_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_DrawDownCYSearch_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_DrawDownCYSearch_609());

		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_DrawDown_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_DrawDown_609());
		FmsPageobjects_609.DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_DrawDown_609()
				.sendKeys(testData.get("DrawDown CY"), Keys.ENTER);

		String xpath = "(//table[@id='gridtab_drawDownRequestDD_Cy_WIFT009MT']/tbody/tr/td[text()='"
				+ testData.get("DrawDown CY") + "'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					Assert.assertEquals(Code.isDisplayed(), true);
					clicksAndActionHelper.doubleClick(Code);
					break;
				}
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_609 Enter the FC Amount Value in Draw Down Request")
	public void User_609_Enter_the_FC_Amount_Value_in_Draw_Down_Request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.DrawDownRequest_Maintenanace_ValueDate_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Maintenanace_ValueDate_609());
		FmsPageobjects_609.DrawDownRequest_Maintenanace_ValueDate_609().sendKeys(testData.get("FC Amount"), Keys.TAB);
	}

	@And("User_609 Click on Save in Draw Down Request")
	public void user_609_click_on_save_in_draw_down_request() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.DrawDownRequest_Save_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.DrawDownRequest_Save_609());
	}

///*********************************************** ITFC ***************************************************************///

	@And("User_609 Click on the Johns request menu")
	public void User_609_Click_on_the_Johns_request_menu() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Johnsrequest_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Johnsrequest_609());
	}

	@And("User_609 Click on the Joh reqs")
	public void User_609_Click_on_the_Joh_reqs() {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.Johnsrequest_Johreqs_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Johnsrequest_Johreqs_609());
	}

	@And("User_609 Click on the Request For Financing submenu under Johns request")
	public void user_609_click_on_the_Request_For_Financing_submenu_under_Johns_request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_609());
	}

	@And("User_609 Click on the Maintenance screen under Johns request")
	public void user_609_click_on_the_Maintenance_screen_under_Johns_request() {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_609());
	}

	@And("^User_609 Select the Reason For Submission in Maintenance under Johns request$")
	public void User_609_select_the_Reason_For_Submission_in_Maintenance_under_Johns_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_ReasonForSubmission_609());
		dropdownhelper.SelectUsingVisibleText(
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_ReasonForSubmission_609(),
				testData.get("Reason For Submission"));

	}

	@And("^User_609 Select the Date in Maintenance under Johns request$$")
	public void User_609_select_the_Date_in_Maintenance_under_Johns_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Date_609());
		FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Date_609()
				.sendKeys(testData.get("Date"), Keys.TAB);
	}

	@And("^User_609 Select the Customer in Maintenance under Johns request$")
	public void User_609_Select_the_Customer_in_Maintenance_under_Johns_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerSearch_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerSearch_609());
		Thread.sleep(2000);
//		waitHelper.waitForElementwithFluentwait(driver,
//				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerClear_609());
//		clicksAndActionHelper
//				.clickOnElement(FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerClear_609());
//		
//		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Customer_609());
		clicksAndActionHelper
				.clickOnElement(FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Customer_609());

		FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Customer_609()
				.sendKeys(testData.get("Customer"), Keys.ENTER);
		Thread.sleep(2000);
		// table[@id='gridtab_requestFinanacingCif_333RF00MT']//td[text()='1069']
		String xpath = "//table[@id='gridtab_requestFinanacingCif_333RF00MT']//td[text()='" + testData.get("Customer")
				+ "']";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_609 Select the Facility Type in Maintenance under Johns request$")
	public void User_609_Select_the_Facility_Type_in_Maintenance_under_Johns_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_FacilityTypeSearch_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_FacilityTypeSearch_609());
		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_FacilityType_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_FacilityType_609());

		FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_FacilityType_609()
				.sendKeys(testData.get("Facility Type"), Keys.ENTER);
		Thread.sleep(2000);
		// (//table[@id='gridtab_requestFinancingFacilityType_333RF00MT']//td[text()='1112'])[1]
		String xpath = "(//table[@id='gridtab_requestFinancingFacilityType_333RF00MT']//td[text()='"
				+ testData.get("Facility Type") + "'])[1]";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(3000);
	}

	@And("^User_609 Check the field History with ITFC is Displaying$$")
	public void User_609_Check_the_field_History_with_ITFC_is_Displaying() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_HistorywithITFC_609());
		try {
			if (FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_HistorywithITFC_609()
					.isDisplayed()) {
				Assert.assertEquals(FmsPageobjects_609
						.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_HistorywithITFC_609().isDisplayed(),
						true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Enter the Total Limit in Maintenance under Johns request$$")
	public void User_609_Enter_the_Total_Limit_in_Maintenance_under_Johns_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_TotalLimit_609());
		javascripthelper.scrollIntoView(FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_TotalLimit_609());
		FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_TotalLimit_609()
				.sendKeys(testData.get("Total Limit"), Keys.TAB);
		Thread.sleep(2000);
	}

	@And("^User_609 Click the Funding tab in Maintenance under Johns request$$")
	public void User_609_Click_the_Funding_tab_in_Maintenance_under_Johns_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Fundingtab_609());
		clicksAndActionHelper.clickOnElement(
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Fundingtab_609());
		Thread.sleep(2000);
	}

	@And("^User_609 Click the Customer Grading and Recommendations tab in Maintenance under Johns request$$")
	public void User_609_Click_the_Customer_Grading_and_Recommendations_tab_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_609());
		Thread.sleep(2000);
	}

	@And("^User_609 Click the Add icon is Displaying under Officers Assigned in Maintenance under Johns request$$")
	public void User_609_Click_the_Add_icon_is_Displaying_under_Officers_Assigned_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Addicon_609());
		javascripthelper.scrollIntoView(FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Addicon_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Addicon_609());

		Thread.sleep(3000);
		//table[@id='RequestFinancingOfficerAssignedGridId_333RF00MT']/tbody/tr[2]/td[1]
		driver.findElement(By.xpath("//table[@id='RequestFinancingOfficerAssignedGridId_333RF00MT']/tbody/tr[2]/td[1]")).click();
		Thread.sleep(2000);
	}

	@And("^User_609 Select the User Id under Officers Assigned in Maintenance under Johns request$$")
	public void User_609_Select_the_User_Id_under_Officers_Assigned_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_UserIdSearch_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_UserIdSearch_609());
		Thread.sleep(3000);

		// (//td[@tdlabel='User Id' and text()='120524'])[3]
		String xpath = "(//td[@tdlabel='User Id' and text()='" + testData.get("User ID") + "'])";
		for (int i = 0; i < 200; i++) {
			try {
				WebElement Code = driver.findElement(By.xpath(xpath));
				if (Code.isDisplayed()) {
					clicksAndActionHelper.doubleClick(Code);
				}
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	}

	@And("^User_609 Click the Delete icon is Displaying under Officers Assigned in Maintenance under Johns request$$")
	public void User_609_Click_the_Delete_icon_is_Displaying_under_Officers_Assigned_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Deleteicon_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Deleteicon_609());

		Thread.sleep(2000);
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609.FMS_ConfirmOk_609());
		clicksAndActionHelper.clickOnElement(FmsPageobjects_609.FMS_ConfirmOk_609());

	}

	@And("^User_609 Validate the Mudarib Share percentage is Displaying in Maintenance under Johns request$$")
	public void User_609_Validate_the_Mudarib_Share_percentage_is_Displaying_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Fundingtab_MudaribShare_609());
		try {
			if (FmsPageobjects_609.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Fundingtab_MudaribShare_609()
					.isDisplayed()) {
				Assert.assertEquals(FmsPageobjects_609
						.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_Fundingtab_MudaribShare_609()
						.isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Validate the User Id is Displaying under Officers Assigned in Maintenance under Johns request$$")
	public void User_609_Validate_the_User_Id_is_Displaying_under_Officers_Assigned_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_UserId_609());
		try {
			if (FmsPageobjects_609
					.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_UserId_609()
					.isDisplayed()) {
				Assert.assertEquals(FmsPageobjects_609
						.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_UserId_609()
						.isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Validate the User Name is Displaying under Officers Assigned in Maintenance under Johns request$$")
	public void User_609_Validate_the_User_Name_is_Displaying_under_Officers_Assigned_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_UserName_609());
		try {
			if (FmsPageobjects_609
					.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_UserName_609()
					.isDisplayed()) {
				Assert.assertEquals(FmsPageobjects_609
						.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_UserName_609()
						.isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Validate the Add icon is Displaying under Officers Assigned in Maintenance under Johns request$$")
	public void User_609_Validate_the_Add_icon_is_Displaying_under_Officers_Assigned_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Addicon_609());
		try {
			if (FmsPageobjects_609
					.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Addicon_609()
					.isDisplayed()) {
				Assert.assertEquals(FmsPageobjects_609
						.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Addicon_609()
						.isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@And("^User_609 Validate the Delete icon is Displaying under Officers Assigned in Maintenance under Johns request$$")
	public void User_609_Validate_the_Delete_icon_is_Displaying_under_Officers_Assigned_in_Maintenance_under_Johns_request()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FmsPageobjects_609
				.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Deleteicon_609());
		try {
			if (FmsPageobjects_609
					.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Deleteicon_609()
					.isDisplayed()) {
				Assert.assertEquals(FmsPageobjects_609
						.Johnsrequest_Johreqs_RequestForFinancing_Maintenance_CustomerGradingRecommendationstab_Deleteicon_609()
						.isDisplayed(), true);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
