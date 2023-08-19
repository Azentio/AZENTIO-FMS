package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.FMSApplicationforFinancialFacilityObj;
import pageobjects.FMSCollateralManagementObj;
import resources.BaseClass;

public class FMSApplicationforFinancialFacility extends BaseClass{
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSApplicationforFinancialFacilityObj fMSApplicationforFinancialFacilityObj  = new FMSApplicationforFinancialFacilityObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javaScriptHelper =new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(TestDataPath, "ApplicationforFinancialFacility", "Data Set ID");
	Map<String, String> testData ;
	
	 @And("^user update test data set id for DS802878$")
	    public void user_update_test_data_set_id_for_ds802878()  {
		 testData = excelData.getTestdata("DS_802878");
	    }

	 @And("^user update test data set id for DS841275$")
	    public void user_update_test_data_set_id_for_ds841275()  {
		 testData = excelData.getTestdata("DS_841275");
	    }
	  @Then("^navigate to Wifak Application tab$")
	    public void navigate_to_wifak_application_tab()  {
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_WIFAKAPPLICATION());
	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_WIFAKAPPLICATION());
	    fMSApplicationforFinancialFacilityObj.fms_WIFAKAPPLICATION().click();    
	  
	    
	    
	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_WIFAKAPPLICATION_Tab2());
	    fMSApplicationforFinancialFacilityObj.fms_WIFAKAPPLICATION_Tab2().click();    
	   
	  }

	    @Then("^navigate to Application for financial facilities tab$")
	    public void navigate_to_application_for_financial_facilities_tab()  {
	    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_WIFAKApplication_ApplicationForFinancialFacilites());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_WIFAKApplication_ApplicationForFinancialFacilites());
		fMSApplicationforFinancialFacilityObj.fms_WIFAKApplication_ApplicationForFinancialFacilites().click();    
		    
	    }

	    @Then("^navigate to Application for financial facilities Maintenance screen$")
	    public void navigate_to_application_for_financial_facilities_maintenance_screen()  {
	    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance());
		fMSApplicationforFinancialFacilityObj.fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance().click();    
			
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance_popup());
		fMSApplicationforFinancialFacilityObj.fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance_popup().click();
	    }
	    
	    @And("^Create record for Application for Financial Facilities$")
	    public void create_record_for_application_for_financial_facilities()  {
	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ApplicationForDropdown());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ApplicationForDropdown().click();
		       //---//
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CifNo());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CifNo().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CifNo().sendKeys(testData.get("CifNo"));
		 
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CifNoSearch());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CifNoSearch().click();
			 	 
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityType());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityType().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityType().sendKeys(testData.get("FacilityType"));
 	 
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityTypeSearch());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityTypeSearch().click();
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancing());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancing().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancing().sendKeys(testData.get("CountryOfFinancing"));
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancingSearch());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancingSearch().click();
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityRating());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityRating().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityRating().sendKeys(testData.get("CountryOfFinancing"));
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityRatingSearch());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_FacilityRatingSearch().click();
		
	    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_AdditionalDetails());
	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_AdditionalDetails());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_AdditionalDetails().click();
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_TotalValue());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_TotalValue().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_TotalValue().sendKeys(testData.get("TotalValue"));
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_OfferExpiryDate());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_OfferExpiryDate().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_OfferExpiryDate().sendKeys(testData.get("OfferExpiryDate"));
		
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_LimitDetails());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_LimitDetails());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_LimitDetails().click();
		
		
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_AddNewRow());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_AddNewRow());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_AddNewRow().click();
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ProductClass());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ProductClass().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ProductClass().sendKeys(testData.get("ProductClass"));
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ProductClassSearch());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ProductClassSearch().click();
		
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ProductClassAdd());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ProductClassAdd());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ProductClassAdd().click();
		
		
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_DocumentDetails());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_DocumentDetails());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_DocumentDetails().click();
		
		
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SolicitorName());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SolicitorName());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SolicitorName().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SolicitorName().sendKeys(testData.get("SolicitorName"));

		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SolicitorNameSearch());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SolicitorNameSearch().click();
		
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_EstimatorName());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_EstimatorName());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_EstimatorName().click();
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_EstimatorName().sendKeys(testData.get("EstimatorName"));

		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_EstimatorNameSearch());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_EstimatorNameSearch().click();
		
		
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_MainInformation());
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_MainInformation());
		fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_MainInformation().click();

		 }
	    @Then("^save and validate the Application for Financial Facilities record$")
	    public void save_and_validate_the_application_for_financial_facilities_record()  {
	    	
	    	clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Save());
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Save());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Save().click();
			
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SaveConfrimationPopup());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SaveConfrimationPopup().click();
			
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SaveSuccessPopup());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SaveSuccessPopup().click();
			
			
			clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Validate());
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Validate());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Validate().click();
			
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ValidateConfrimationPopup());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ValidateConfrimationPopup().click();
			
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ValidateSuccessPopup());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ValidateSuccessPopup().click();
			
		      
	    }

	    @Then("^navigate to Approve level1 reject screen$")
	    public void navigate_to_approve_level1_reject_screen()  {

			clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1());
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1().click();
			
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1WarningPopup());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1WarningPopup().click();
			
			   
	    }
	    @And("^open the record add decision$")
	    public void open_the_record_add_decision()  {

			clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Clear());
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Clear());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Clear().click();
			
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_OpenTheRecord());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_OpenTheRecord().click();
			//----////
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Decision());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Decision().click();
	    }
	    @Then("^approve the Application for Financial Facilities record$")
	    public void approve_the_application_for_financial_facilities_record()  {
	    	clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Submit());
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Submit());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_Submit().click();
			
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SubmitConfrimationPopup());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SubmitConfrimationPopup().click();
			
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SubmitSuccessPopup());
			fMSApplicationforFinancialFacilityObj.fms_ApplicationForFinancialFacilites_Maintenance_SubmitSuccessPopup().click();
			
	    }

	   

	    

	    


}
