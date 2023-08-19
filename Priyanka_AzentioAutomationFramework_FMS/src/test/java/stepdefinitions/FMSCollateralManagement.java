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
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.FMSCollateralManagementObj;
import resources.BaseClass;

public class FMSCollateralManagement extends BaseClass{
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FMSCollateralManagementObj collateralManagementObj  = new FMSCollateralManagementObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javaScriptHelper =new JavascriptHelper(driver);
	
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData CollateralManagementexcelData = new ExcelData(TestDataPath, "CollateralManagement", "DataSet ID");
	Map<String, String> CollateralManagementtestData = new HashMap<>();
	String code;
 
	@And("^Update test data for test case no AT_RF_048$")
    public void update_test_data_for_test_case_no_AT_RF_048() {
		CollateralManagementtestData = CollateralManagementexcelData.getTestdata("AT_RF_048_D1");
	     
    }
	@And("^Update test data for test case no AT_RF_134 for Collateral$")
    public void update_test_data_for_test_case_no_AT_RF_134_for_collateral() {
		CollateralManagementtestData = CollateralManagementexcelData.getTestdata("AT_RF_134_D1");
	     
    }
	@And("^Update test data for test case no AT_RF_13 for Collateral$")
    public void update_test_data_for_test_case_no_AT_RF_13_for_collateral() {
		CollateralManagementtestData = CollateralManagementexcelData.getTestdata("AT_RF_13_D1");
	     
    }
	@And("^Update test data for test case no AT_RF_14 for Collateral$")
    public void update_test_data_for_test_case_no_AT_RF_14_for_collateral() {
		CollateralManagementtestData = CollateralManagementexcelData.getTestdata("AT_RF_14_D1");
	     
    }
	
	@And("^Update test data for test case no AT_CM_012 for Collateral$")
    public void update_test_data_for_test_case_no_AT_CM_012_for_collateral() {
		CollateralManagementtestData = CollateralManagementexcelData.getTestdata("AT_CM_012_D1");
	     
    }
	@Then("^click on the Collateral Management tab$")
    public void click_on_the_collateral_management_tab() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.FMSCollateralManagement());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.FMSCollateralManagement());
    	collateralManagementObj.FMSCollateralManagement().click();        
    }
	
	@Then("^click on the Maintanace screen of Collateral Management$")
    public void click_on_the_maintanace_screen_of_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementMaintanance());
    	collateralManagementObj.collateralManagementMaintanance().click();
    }
	
	@Then("^enter the Collateral type under main information in Collateral Management$")
    public void enter_the_collateral_type_under_main_information_in_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoCollateralType());

    	collateralManagementObj.mainInfoCollateralType().sendKeys(CollateralManagementtestData.get("Collateral Type"));
    	collateralManagementObj.mainInfoCollateralType().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.mainInfoCollateralType().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    	
    }
	  
	@Then("^enter the valid from date under main information in Collateral Management$")
    public void enter_the_valid_from_date_under_main_information_in_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoValidFromDate());
//    	collateralManagementObj.mainInfoValidFromDate().sendKeys("05/01/2022");
    	collateralManagementObj.mainInfoValidFromDate().sendKeys(CollateralManagementtestData.get("Valid From Date"));
   	    collateralManagementObj.mainInfoValidFromDate().sendKeys(Keys.ENTER);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.mainInfoValidFromDate().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }
	 
	@Then("^enter the valid to date under main information in Collateral Management$")
    public void enter_the_valid_to_date_under_main_information_in_collateral_management() throws Throwable {
		Thread.sleep(4000);
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoValidToDate());
//    	collateralManagementObj.mainInfoValidToDate().sendKeys("05/01/2023");
    	
    	collateralManagementObj.mainInfoValidToDate().sendKeys(CollateralManagementtestData.get("Valid To Date"));
    	collateralManagementObj.mainInfoValidToDate().sendKeys(Keys.ENTER);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.mainInfoValidToDate().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

	@Then("^enter the brief description under main information in Collateral Management$")
    public void enter_the_brief_description_under_main_information_in_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoBriefDescrip());
//    	collateralManagementObj.mainInfoBriefDescrip().sendKeys("Test");
    	collateralManagementObj.mainInfoBriefDescrip().sendKeys(CollateralManagementtestData.get("Brief Description"));
    }

	@Then("^enter the long description under main information in Collateral Management$")
    public void enter_the_long_description_under_main_information_in_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoLongDescrip());
//    	collateralManagementObj.mainInfoLongDescrip().sendKeys("Test");
    	collateralManagementObj.mainInfoLongDescrip().sendKeys(CollateralManagementtestData.get("Long Description"));
    }

	@Then("^enter the Collateral currency under main information in Collateral Management$")
    public void enter_the_collateral_currency_under_main_information_in_collateral_management() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoCollateralCif());
    	collateralManagementObj.mainInfoCollateralCif().sendKeys(CollateralManagementtestData.get("CIF Number"));
    	collateralManagementObj.mainInfoCollateralCif().sendKeys(Keys.ENTER);
    	for(int i=1; i<=500; i++)
    	{
    		try{clicksAndActionHelper.moveToElement(collateralManagementObj.mainInfoCollateralCifPopUp());
    	
    	clicksAndActionHelper.clickOnElement(collateralManagementObj.mainInfoCollateralCifPopUp());
    break;
    		}
    		catch(Exception e) {}
    	}
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.mainInfoCollateralCurrency());
    	collateralManagementObj.mainInfoCollateralCurrency().sendKeys(CollateralManagementtestData.get("Collateral Currency"));
    	collateralManagementObj.mainInfoCollateralCurrency().sendKeys(Keys.ENTER);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.mainInfoCollateralCurrencyLabel().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

	@Then("^click on the Collateral cash details tab in Collateral Management$")
    public void click_on_the_collateral_cash_details_tab_in_collateral_management() throws Throwable {
    	   	
//    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsTab());
    	for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionHelper.moveToElement(collateralManagementObj.CollateralCashDetailsTab());
				clicksAndActionHelper.clickOnElement(collateralManagementObj.CollateralCashDetailsTab());
				
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
    
    }
	@Then("^click on the add new icon under Collateral cash details tab$")
    public void click_on_the_add_new_icon_under_collateral_cash_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAddIcon());
    	collateralManagementObj.CollateralCashDetailsAddIcon().click();
    }

	@Then("^click on the additional reference under Collateral cash details tab$")
    public void click_on_the_additional_reference_under_collateral_cash_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAdditionalRefLookup());
    	collateralManagementObj.CollateralCashDetailsAdditionalRefLookup().click();
    }

	@Then("^select cy value under additional reference$")
    public void select_cy_value_under_additional_reference() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAdditionalRefRow1());
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAdditionalRefCy());
    	clicksAndActionHelper.doubleClick(collateralManagementObj.CollateralCashDetailsAdditionalRefRow1());
    }

	@Then("^enter the amount value under Collateral cash details tab$")
    public void enter_the_amount_value_under_collateral_cash_details_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsAmount());
//    	collateralManagementObj.CollateralCashDetailsAmount().sendKeys("1000");
    	collateralManagementObj.CollateralCashDetailsAmount().sendKeys(CollateralManagementtestData.get("Amount"));
    	collateralManagementObj.CollateralCashDetailsAmount().sendKeys(Keys.TAB);
    	
    	for(int i = 0; i <= 500; i++) {
    		try {
				if(!(collateralManagementObj.CollateralCashDetailsAmount().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
    	
    }
    
	@Then("^click on the save button under Collateral Management$")
    public void click_on_the_save_button_under_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementMaintananceSaveBtn());
    	collateralManagementObj.collateralManagementMaintananceSaveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.confirmPopupTitle());
    	collateralManagementObj.confirmPopupOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.successPopupTitle());
    	collateralManagementObj.SuccessPopupOkBtn().click();
    }
    
    
	@Then("^click on the Approve screen under Collateral Management$")
    public void click_on_the_approve_screen_undrer_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementApprove());
    	collateralManagementObj.collateralManagementApprove().click();        
    }

	@Then("^click on the clear button under approve screen in Collateral Management$")
    public void click_on_the_clear_button_under_approve_screen_in_collateral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementApproveClearBtn());
    	collateralManagementObj.collateralManagementApproveClearBtn().click();
    }

	@Then("^double click on the first row in approve screen$")
    public void double_click_on_the_first_row_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementApproveFirstRow());
    	clicksAndActionHelper.doubleClick(collateralManagementObj.collateralManagementApproveFirstRow());
    	
    	//input[@id='collateralCode_T014AP']initialvalue="1053"prevvalue="1053"
    	for (int i = 0; i <= 300; i++) {
			try {
    	clicksAndActionHelper.moveToElement(collateralManagementObj.collateralManagementApproveCode());
    	code = collateralManagementObj.collateralManagementApproveCode().getAttribute("prevvalue");
    	break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}}
    	
    	CollateralManagementexcelData.updateTestData("AT_RF_134_D1", "Code", code);
//        CollateralManagementtestData = excelDataForChequeBookRequest.getTestdata(dataSetID);
        
    	
    	
    }
    
	@Then("^click on the approve button under Collateral Management$")
    public void click_on_the_approve_button_under_collateral_management() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(collateralManagementObj.collateralManagementApproveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.collateralManagementApproveBtn());
    	collateralManagementObj.collateralManagementApproveBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.confirmPopupTitle());
    	collateralManagementObj.confirmPopupOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.successPopupTitle());
    	collateralManagementObj.SuccessPopupOkBtn().click();
        
    }
	
	//-----------------verify----------//
	 
	@Then("^move to verify tab under collateral Management$")
    public void move_to_verif_under_collateral_management() throws Throwable {
		
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionHelper.moveToElement(collateralManagementObj.collateral_management_verify());
				clicksAndActionHelper.clickOnElement(collateralManagementObj.collateral_management_verify());
				
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	@Then("^click on update after approval under Collateral Management$")
    public void click_on_update_after_approval_under_collateral_management() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionHelper.moveToElement(collateralManagementObj.collateral_management_updateAfterApproval());
				clicksAndActionHelper.clickOnElement(collateralManagementObj.collateral_management_updateAfterApproval());
				
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@Then("^retrieve the cash collateral approved record$")
    public void retrieve_the_cash_collateral_approved_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.updateAfterApproval_searchCODE());
    	collateralManagementObj.updateAfterApproval_searchCODE().sendKeys(CollateralManagementtestData.get("Code"));
    	collateralManagementObj.updateAfterApproval_searchCODE().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath("//td[text()='"+CollateralManagementtestData.get("0000"+"Code")+"']")).isDisplayed();
				WebElement record = driver.findElement(By.xpath("//td[text()='" + CollateralManagementtestData.get("0000"+"Code") + "']"));
				clicksAndActionHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("^click on the Collateral cash details tab under update after approval under Collateral Management$")
    public void click_on_the_collateral_cash_details_tab_under_update_after_approval_under_collateral_management() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionHelper.moveToElement(collateralManagementObj.updateAfterApproval_cash_details_tab());
				clicksAndActionHelper.clickOnElement(collateralManagementObj.updateAfterApproval_cash_details_tab());
				
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("^modify the amount value under Collateral cash details tab$")
    public void modify_the_amount_value_under_collateral_cash_details_tab() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionHelper.moveToElement(collateralManagementObj.updateAfterApproval_amount());
				clicksAndActionHelper.clickOnElement(collateralManagementObj.updateAfterApproval_amount());
				collateralManagementObj.updateAfterApproval_amount().sendKeys(CollateralManagementtestData.get("ModifyAmount"));
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("^click on the save button under update after approval under Collateral Management$")
	public void click_on_the_save_button_under_update_after_approval_under_collateral_management() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionHelper.moveToElement(collateralManagementObj.updateAfterApproval_save());
				clicksAndActionHelper.clickOnElement(collateralManagementObj.updateAfterApproval_save());
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.confirmPopupTitle());
    	collateralManagementObj.confirmPopupOkBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.successPopupTitle());
    	collateralManagementObj.SuccessPopupOkBtn().click();
	}	
	
	 
	@Then("^retrieved the cash collateral record$")
	public void retrieved_the_cash_collateral_record()throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.Approval_searchcode());
    	collateralManagementObj.Approval_searchcode().sendKeys(CollateralManagementtestData.get("Code"));
    	collateralManagementObj.Approval_searchcode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath("//td[text()='"+CollateralManagementtestData.get("0000"+"Code")+"']")).isDisplayed();
				WebElement record = driver.findElement(By.xpath("//td[text()='" + CollateralManagementtestData.get("0000"+"Code") + "']"));
				clicksAndActionHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	 
	}
	
	
//	@Then("^click on the Additional Details tab in Collateral Management$")
//    public void click_on_the_additional_details_tab_in_collateral_management() throws Throwable {
//    	   	
////  	waitHelper.waitForElementwithFluentwait(driver, collateralManagementObj.CollateralCashDetailsTab());
//    	for (int i = 0; i < 2000; i++) {
//			try {
//				clicksAndActionHelper.moveToElement(collateralManagementObj.collateral_Additional_Details_Tab());
//				clicksAndActionHelper.doubleClick(collateralManagementObj.collateral_Additional_Details_Tab());
//				
//		    	break;
//			} catch (Exception e) {
//				if (i==1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    
//    }
	 
	@Then("^enter the FC Valuedsf value under Additional Details tab$")
    public void enter_fc_valuedsf_value_under_addtional_details_tab() throws Throwable {
		
		
	}
	@Then("^enter the Date Excepted under Additional Details tab$")
    public void enter_the_date_excepted_under_additional_details_tab() throws Throwable {
    
	}
}
