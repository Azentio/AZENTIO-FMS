package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
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
import resources.BaseClass;

public class FMSFacilityCustomFields extends BaseClass{
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSApplicationforFinancialFacilityObj fMSApplicationforFinancialFacilityObj  = new FMSApplicationforFinancialFacilityObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javaScriptHelper =new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(TestDataPath, "FmsPara_FacilityCustomFields", "DataSet ID");
	ExcelData producClassExcelData = new ExcelData(TestDataPath, "IISFmsPara_ProductClass", "DataSet ID");

	Map<String, String> testData ;
	Map<String, String> producClasstestData ;
	
	 @And("^user update test data set id for DS964142$")
	    public void user_update_test_data_set_id_for_ds964142()  {
		 testData = excelData.getTestdata("DS_01_964142");
	    }
	 @And("^user update test data set id for DS903740$")
	    public void user_update_test_data_set_id_for_ds903740()  {
		 producClasstestData = producClassExcelData.getTestdata("DS_01_903740");
	    }
	
	//		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_WIFAKAPPLICATION());
	    
	    @Then("^navigate to Paramters tab$")
	    public void navigate_to_paramters_tab()  {
	    	waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_Parameters());
	    	fMSApplicationforFinancialFacilityObj.fmsPara_Parameters().click();    
		   
	    }

	    @Then("^navigate to Facility Custom Fields screen$")
	    public void navigate_to_facility_custom_fields_screen() throws InterruptedException  {
	    	waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_FacilityCustomFields());
	    	clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fmsPara_FacilityCustomFields());
	    	fMSApplicationforFinancialFacilityObj.fmsPara_FacilityCustomFields().click(); 	
	        
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields().click(); 	
	        
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance().click(); 	
	        
//		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_WarningPopup());
//		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_WarningPopup().click(); 	
	        
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_Code());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_Code().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_Code().sendKeys(testData.get("Code"));
		    
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClass());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClass().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClass().sendKeys(testData.get("ProductClass"));
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClass().sendKeys(Keys.ENTER);

//		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClassSearch());
//		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClassSearch().click(); 	
//		    
		    
		    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_AddNewRow());
	    	waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_AddNewRow());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_AddNewRow().click(); 	
	        
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_Name());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_Name().click(); 	
			waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_NameSearch());
			fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_NameSearch().click();
		    Thread.sleep(2000);
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_FACILITY_CUSTOM_CODE());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_FACILITY_CUSTOM_CODE().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_FACILITY_CUSTOM_CODE().sendKeys(testData.get("FacilityCustomCode"));
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_FACILITY_CUSTOM_CODE().sendKeys(Keys.ENTER);
		   
			
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_FacilityCustomCode_SuggestedRecord());
		    clicksAndActionHelper.doubleClick(fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_FacilityCustomCode_SuggestedRecord());
	
//		    javaScriptHelper.JSEClick(fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LABEL());
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LABEL());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LABEL().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LABEL().sendKeys(testData.get("LABEL"));
//		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LABEL().sendKeys(Keys.ENTER);
		    
		    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LENGTH());
//		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LENGTH());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LENGTH().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_LENGTH().sendKeys(testData.get("LENGTH"));
		    
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_DECIMALS());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_DECIMALS().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_DECIMALS().sendKeys(testData.get("DECIMALS"));
		    
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_CATEGORY());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_CATEGORY().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_CATEGORY().sendKeys(testData.get("CATEGORY"));
		    
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_MANDATORY());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_MANDATORY().click(); 
		    
		    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ORDERNUMBER());

		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ORDERNUMBER());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ORDERNUMBER().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_ORDERNUMBER().sendKeys(testData.get("ORDERNUMBER"));
		    
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_Save());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_Save().click(); 	
		    
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_SaveWarningPopUp());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Maintenance_SaveWarningPopUp().click(); 	
		    
		    
	 
	    
	    }
	    
	    @Then("^Approve Facility Custom Fields record$")
	    public void approve_facility_custom_fields_record()  {
//-------Approve----------//
	    	waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_FacilityCustomFields());
	    	clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fmsPara_FacilityCustomFields());
	    	fMSApplicationforFinancialFacilityObj.fmsPara_FacilityCustomFields().click(); 	
	        
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields().click(); 	
	        
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve().click(); 	
		    
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_CODE());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_CODE().click(); 	
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_CODE().sendKeys(testData.get("Code"));
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_CODE().sendKeys(Keys.ENTER);

		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_SuggestedRecord());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_SuggestedRecord().click(); 	
	    
		    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_ApproveButton());

		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_ApproveButton());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_ApproveButton().click(); 
	    
		    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_InformationPopUp());
		    fMSApplicationforFinancialFacilityObj.fmsPara_MaintainFacilityCustomFields_Approve_InformationPopUp().click(); 
	   
	  
	    }
	    
	    @Then("^navigate to REQUEST FOR FINANCIN  tab$")
	    public void navigate_to_request_for_financin_tab()   {
	   for (int i = 0; i <200; i++) {
			try {
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_REQUESTFORFINANCIN());
	    fMSApplicationforFinancialFacilityObj.fms_REQUESTFORFINANCIN().click(); 
	    break;
			} catch (Exception e) {}
		}
	    
	    for (int i = 0; i <200; i++) {
			try {
		clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_SubTab());
	    fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_SubTab().click(); 
	    break;
				} catch (Exception e) {}
			}
	    }
	    @Then("^navigate to Request For Financing Maintenance Screen$")
	    public void navigate_to_request_for_financing_maintenance_screen()   {
	    for (int i = 0; i <200; i++) {
	 	try {
	    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Maintenance());
		fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Maintenance().click(); 
		 break;
			} catch (Exception e) {}
			}
//	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_Warning_popup());
//	    fMSApplicationforFinancialFacilityObj.fms_Warning_popup().click(); 
   
		   }
	    @Then("^enter all the details for Request For Financing Screen$")
	    public void enter_all_the_details_for_request_for_financing_screen() throws InterruptedException   {
		 waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_ReasonForSubmission());
		 dropDownHelper.SelectUsingVisibleText(fMSApplicationforFinancialFacilityObj.fms_ReasonForSubmission(),testData.get("ReasonForSubmission"));
		 
		 waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Customer());
		 fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Customer().click(); 	
		 fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Customer().sendKeys(testData.get("Customer"));
		   
		 
		 for (int i = 0; i <30; i++) {
			 	try {
			    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_FacilityType());
			    break;
				} catch (Exception e) {if (i==199) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
				}
			 	clicksAndActionHelper.doubleClick(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_FacilityType());
			    fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_FacilityType().click(); 
				fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_FacilityType().sendKeys(testData.get("FacilityType"));

				fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_FacilityType().sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(10000);
//				waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.randomClick());
//				clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.randomClick());
//				clicksAndActionHelper.clickOnElement(fMSApplicationforFinancialFacilityObj.randomClick());
			    
			}
		 Thread.sleep(10000);	
		 
		 
	     for (int i = 0; i <200; i++) {
			 	try {
			    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_TotalLimit());
				fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_TotalLimit().click();
				fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_TotalLimit().sendKeys(testData.get("TotalLimit"));
				
    				break;	
				
				
				} catch (Exception e) {
					if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		 Thread.sleep(5000);
		 
//		 
//		 for (int i = 0; i <200; i++) {
//			 	try {
//			    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_DisbursementSublimitTab());
//			    clicksAndActionHelper.doubleClick(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_DisbursementSublimitTab());
////			    fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_DisbursementSublimitTab().click(); 
//				break;
//				} catch (Exception e) {}
//			}
//		 
//		 for (int i = 0; i <200; i++) {
//			 	try {
//			    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_ProductClass_AddNewRow());
//				fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_ProductClass_AddNewRow().click(); 
//				 break;
//					} catch (Exception e) {}
//			}
//		 
//		 waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_ProductClass());
//		 fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_ProductClass().click(); 	
//		 fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_ProductClass().sendKeys(testData.get("ProductClass"));
//
//		 
//		 for (int i = 0; i <200; i++) {
//			 	try {
//			    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_ProductClass_Add());
//				fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_ProductClass_Add().click(); 
//				break;
//					} catch (Exception e) {}
//			}
//		 
//		 for (int i = 0; i <200; i++) {
//			 	try {
//			    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Save());
//				fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Save().click(); 
//				 break;
//					} catch (Exception e) {}
//			}
//		 waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Save_ConfrimationPopUp());
//		 fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Save_ConfrimationPopUp().click(); 	
//
//		 
//		 waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Validate());
//		 fMSApplicationforFinancialFacilityObj.fms_RequestForFinancing_Validate().click(); 	
//
	    }

	    //-------------------903740--------------------//
	    
	    @Then("^Click on Product class under Parameters$")
	    public void click_on_product_class_under_parameters()  {
	    	for (int i = 0; i <200; i++) {
			 	try {
			    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass());
				fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass().click(); 
				 break;
					} catch (Exception e) {
						if (i==199) {
							Assert.fail(e.getMessage());
						}
					}
			}    
	    }

	    @Then("^Click on Maintenance under Product class  Sub Menu in Parameters$")
	    public void click_on_maintenance_under_product_class_sub_menu_in_parameters()  {
	    	for (int i = 0; i <200; i++) {
			 	try {
			    clicksAndActionHelper.moveToElement(fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_Maintenance());
				fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_Maintenance().click(); 
				 break;
					} catch (Exception e) {
						if (i==199) {
							Assert.fail(e.getMessage());
						}
					}
			}   
	    }

	    @Then("^Click on Search and search Class Code$")
	    public void click_on_search_and_search_class_code() throws InterruptedException  {
	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_Maintenance_Search());
		fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_Maintenance_Search().click(); 	
		
		waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_SearchClass());
		fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_SearchClass().click(); 
		fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_SearchClass().sendKeys("600");
		fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_SearchClass().sendKeys(Keys.ENTER); 
		Thread.sleep(5000);
	  
	    }

	    @Then("^Open the suggested record of Product class$")
	    public void open_the_suggested_record_of_product_class()  {
	    	for (int i = 0; i <200; i++) {
			 	try {
	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_SearchClass());
//		fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_SuggestedRecord().click(); 
		clicksAndActionHelper.doubleClick(fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_SuggestedRecord());	
		break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
}   
	    }

	    @Then("^Click on Profit Calculation Menu$")
	    public void click_on_profit_calculation_menu()  {
	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_ProfitCalculation());
	  	fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_ProfitCalculation().click(); 
	  		    
	    }

	    @And("^Validate Floating rate checkbox is checked$")
	    public void validate_floating_rate_checkbox_is_checked() {
	    waitHelper.waitForElementwithFluentwait(driver, fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_FloatingRate());
		fMSApplicationforFinancialFacilityObj.fmsIISPara_ProductClass_FloatingRate().getAttribute("checked").equalsIgnoreCase("checked"); 
		  	  
	    }

}
