package stepdefinitions;

import java.util.Iterator;
import java.util.List;
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
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CommonElements.FMS_WifakApplication_Obj;
import resources.BaseClass;

public class FMS_WifakApplication_Steps {
		
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMS_WifakApplication_Obj FMS_WifakApplication_Obj = new FMS_WifakApplication_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	DropDownHelper DropDownhelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	
    String SuccessMsg;
	String SuccessMsg2;
	String SuccessMsgFM;
	String SuccessMsgRepay;
	
	int FinanceAmt;
	int FCAmount;
	
	int downPayment;
	int totalValueWifak;
	int financeAmount;
	int facilityValueInLimit;
	
	int downpaymentAmountInDet;
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	
	ExcelData fmsTransactionsExcelData = new ExcelData(path, "FMS_WIFAK_ApplicationTestData", "DataSet ID");
	Map<String, String> testData;
	Map<String, String> User;
	ExcelData  DrawDownPayment = new ExcelData(path, "DrawDownPayment_TestData", "DataSet ID");
	
	@And("User_610 get the test data set id for AT_DDR_083")
	public void get_the_test_data_set_id_for_at_ddr_083() {
		testData = DrawDownPayment.getTestdata("DS01_1105454");
	}

	
	@And("User_609 click Technical details")
    public void user_609_click_technical_details() {
		 waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.technicalDetails_610());
		 clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.technicalDetails_610());
		 clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.technicalDetails_610());
    }
    @And("User_609 click clear caches")
    public void user_609_click_clear_caches() {
  	  waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.FSM_ClearCacheInTechnicalDetailsIcon_610());
  	clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FSM_ClearCacheInTechnicalDetailsIcon_610());
  	clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.FSM_ClearCacheInTechnicalDetailsIcon_610());
    }
 

   @And("^User_609 Click the ok button$")
  public void user_609_click_the_ok_button() throws Throwable {
  	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok());
  	clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok());         
  }


	@And("^User_610 Click Wifak Application first$")
	public void click_wifak_application_first() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getWifak_Application_first_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getWifak_Application_first_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getWifak_Application_first_610());
	}

	@And("User_610 get the test data set id for AT_FM_099")
	public void get_the_test_data_set_id_for_at_AT_FM_099() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_1038991");

			}

	//-- Application for financing facility
	
	@And("User_610 get the test data set id for AT_AFF_037")
	public void get_the_test_data_set_id_for_at_aff_037() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_870478");
	}
	
	@And("User_610 get the test data set id for AT_RF_011")
	public void get_the_test_data_set_id_for_at_at_rf_011() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_592279");
	}
	
	@And("User_610 get the test data set id for AT_RF_012")
	public void get_the_test_data_set_id_for_at_at_rf_012() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_665893");
	}

	@And("User_610 get the test data set id for AT_RF_074")
	public void get_the_test_data_set_id_for_at_at_at_rf_074() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_592970");
	}
	
	
	
	
	
	@And("User_610 get the test data set id for AT_CA_013")
	public void get_the_test_data_set_id_for_at_at_ca_013() {
		testData = fmsTransactionsExcelData.getTestdata("AT_CA_013");
	}
	
	//--------- Committee recommendation
	
	@And("User_610 get the test data set id for AT_CA_010")
	public void get_the_test_data_set_id_for_at_ca_010() {
		testData = fmsTransactionsExcelData.getTestdata("AT_CA_010");
	}
	
	@And("User_610 get the test data set id for AT_CA_011")
	public void get_the_test_data_set_id_for_at_ca_011() {
		testData = fmsTransactionsExcelData.getTestdata("AT_CA_011");
	}
	
	@And("User_610 get the test data set id for AT_CA_009")
	public void get_the_test_data_set_id_for_at_at_ca_009() {
		testData = fmsTransactionsExcelData.getTestdata("AT_CA_009");
	}
	
	//----------- repayment plan
	
	@And("User_610 get the test data set id for AT_RP_008")
	public void get_the_test_data_set_id_for_at_rp_008() {
		testData = fmsTransactionsExcelData.getTestdata("AT_RP_008");
	}
	
	@And("User_610 get the test data set id for AT_RP_010")
	public void get_the_test_data_set_id_for_at_at_010() {
		testData = fmsTransactionsExcelData.getTestdata("AT_RP_010");
	}
	
	@And("User_610 get the test data set id for AT_CA_014")
	public void get_the_test_data_set_id_for_at_ca_014() {
		testData = fmsTransactionsExcelData.getTestdata("AT_CA_014");
	}
	
	
	
	
	
	//------------------------------------
	
	@And("^User_610 Click Wifak Application Second$")
	public void click_wifak_application_second() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getWifak_Application_second_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getWifak_Application_second_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getWifak_Application_second_610());
	}

	//-----Facilities Management  in application for facility
	
	@And("^User_610 Click Facilities Management$")
    public void click_facilities_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_Facilities_Management_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Facilities_Management_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Facilities_Management_610());
	//	Thread.sleep(6000);
		
    }
	
	@And("^User_610 Click Maintence Screen$")
    public void click_maintence_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_Maintenance_In_Facilities_Management_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Maintenance_In_Facilities_Management_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Maintenance_In_Facilities_Management_610());
    }

    @And("^User_610 Click and Enter Application Ref No$")
    public void click_and_enter_application_ref_no() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_Application_Ref_610());
//		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Application_Ref_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Application_Ref_610());
		FMS_WifakApplication_Obj.Click_Application_Ref_610().sendKeys(testData.get("Application Ref No in Facilities Management"));
		FMS_WifakApplication_Obj.Click_Application_Ref_610().sendKeys(Keys.TAB);
		
/*		String xpath ="//input[@id='facilityMgtMainCif_WIFT008MT']";
		for (int i = 0; i <200000; i++) {
		
			
			  if
			  (!driver.findElement(By.xpath(xpath)).getAttribute("initialvalue").isBlank()
			  ||!driver.findElement(By.xpath(xpath)).getAttribute("initialvalue").isEmpty()
			  ) { break;
			 		
			}
			if (driver.findElement(By.xpath(xpath)).isEnabled())	{
				break;
			}
				
		}     */       
		    }
    
    @And("User_610 Click facility Limit Details in Facilities Management")
    public void user_click_facility_limit_details_in_facilities_management() {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_facility_Limit_Details_610());
    	//clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_facility_Limit_Details_610());
    	
    		for (int i = 0; i < 2000; i++) {
    			try {
    				if (FMS_WifakApplication_Obj.Click_facility_Limit_Details_610().isDisplayed()) {
    					clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Click_facility_Limit_Details_610());
    					break;
					}
 
    			} catch (Exception e) {
    				if (i == 1999) {
    					Assert.fail(e.getMessage());
    				}
    			}
    		}
    }
    
    @And("^User_610 Click ProductClass In facility Limit Details$")
    public void click_productclass_in_facility_limit_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.DoubleClick_ProductClassIN_facility_Limit_Details_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DoubleClick_ProductClassIN_facility_Limit_Details_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.DoubleClick_ProductClassIN_facility_Limit_Details_610());
    }

        
    @Then("^User_610 Enter Previous data In MaturityDate$")
    public void enter_previous_data_in_maturitydate() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate_610());
		FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate_610().sendKeys("0/01/2021");
		
	//	FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate_610().sendKeys(testData.get("Maturity Date facility management"));
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Validate_dataIn_MaturityDate_610().isDisplayed());
    }
    
    //----------------
	
	@And("^User_610 Click Application for financial facilities$")
	public void User_610_click_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.getApplication_for_financial_facilities_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getApplication_for_financial_facilities_610());
		
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getApplication_for_financial_facilities_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click Maintenance$")
	public void click_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getMaintenance_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getMaintenance_610());
		
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getMaintenance_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click and Select Application for$")
	public void click_and_select_application_for() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getApplication_for_610());
	//	clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getApplication_for());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.getApplication_for_610(),testData.get("Application For"));

	}

	@Given("User_610 Search CIF No")
	public void search_cif_no() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getCIF_no_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getCIF_no_610());
		// FMS_WifakApplication_Obj.getCIF_no().sendKeys("727");
		FMS_WifakApplication_Obj.getCIF_no_610().sendKeys(testData.get("CIF No"));
		FMS_WifakApplication_Obj.getCIF_no_610().sendKeys(Keys.TAB);
	}

	@And("^User_610 Enter codeOn Facility Type$")
	public void enter_codeon_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_codeOn_Facility_Type_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_codeOn_Facility_Type_610());
		// FMS_WifakApplication_Obj.getEnter_codeOn_Facility_Type().sendKeys("369");
		FMS_WifakApplication_Obj.getEnter_codeOn_Facility_Type_610().sendKeys(testData.get("Facility Type"));
		FMS_WifakApplication_Obj.getEnter_codeOn_Facility_Type_610().sendKeys(Keys.TAB);

	}

	@And("^User_610 Enter Code In Country of Financing$")
	public void enter_code_in_country_of_financing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.getEnterCodeIn_Country_of_Financing_610());
		FMS_WifakApplication_Obj.getEnterCodeIn_Country_of_Financing_610().sendKeys(testData.get("Country of Financing"));

	}

	@And("^User_610 Enter line Code On Facility Rating$")
	public void enter_line_code_on_facility_rating() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.getEnter_lineCodeOn_Facility_Rating_610());
		FMS_WifakApplication_Obj.getEnter_lineCodeOn_Facility_Rating_610().sendKeys(testData.get("Facility Rating"));
		FMS_WifakApplication_Obj.getEnter_lineCodeOn_Facility_Rating_610().sendKeys(Keys.TAB);

		for (int i = 0; i <= 300; i++) {
			if (!(FMS_WifakApplication_Obj.getEnter_lineCodeOn_Facility_Rating_610().getAttribute("prevvalue")
					.isBlank())) {
				break;
			}
		}
	}

	@And("^User_610 Click on additional Details$")
	public void click_on_additional_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getClickon_additionalDetails_610());
		
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClickon_additionalDetails_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_610 Enter the Total Value$")
	public void enter_the_total_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_TotalValue_610());
	//	clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_TotalValue());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_TotalValue_610());
		FMS_WifakApplication_Obj.getEnter_TotalValue_610().sendKeys(testData.get("Total value"));
		FMS_WifakApplication_Obj.getEnter_TotalValue_610().sendKeys(Keys.TAB);
				
				
		String TotalValue = FMS_WifakApplication_Obj.getEnter_TotalValue_610().getAttribute("prevvalue");
		System.err.println("TotalValue: " + TotalValue);
		totalValueWifak = Integer.parseInt(TotalValue);
		System.out.println("totalValueWifak: " + totalValueWifak);
	}

	@And("^User_610 Click Offer Expiration SelectDate$")
	public void click_offer_expiration_selectdate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.getClick_Offer_Expiration_SelectDate_610());
	//	clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getClick_Offer_Expiration_SelectDate());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_Offer_Expiration_SelectDate_610());
	//	 FMS_WifakApplication_Obj.getClick_Offer_Expiration_SelectDate().sendKeys("06/06/2023");
		FMS_WifakApplication_Obj.getClick_Offer_Expiration_SelectDate_610().sendKeys(testData.get("Expire Date"));

	}

	@And("^User_610 Select limit Details$")
	public void select_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getSelect_limitDetails_610());

		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getSelect_limitDetails_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click Add button on limit Detail$")
	public void User_610_click_add_button_on_limit_detail() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.getClick_AddButtonon_limit_Detail_610());

		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_AddButtonon_limit_Detail_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click Second Add button on limit Detail$")
	public void User_610_click_second_add_button_on_limit_detail() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.getClick_AddButtonon_limit_Detail_610());

		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_AddButtonon_limit_Detail_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click third Add button on limit Detail$")
	public void User_610_click_third_add_button_on_limit_detail() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.getClick_AddButtonon_limit_Detail_610());

		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_AddButtonon_limit_Detail_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click Fourth Add button on limit Detail$")
	public void User_610_click_fourth_add_button_on_limit_detail() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.getClick_AddButtonon_limit_Detail_610());

		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_AddButtonon_limit_Detail_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Enter ValueOn Product Class$")
	public void User_610_enter_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		// FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class().sendKeys("1");
		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys(testData.get("Product Class"));
		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys(Keys.TAB);
		// Thread.sleep(10000);

	}
	
	@And("User_{int} Enter down Payment amount")
	public void User_610_user_enter_total_down_payment(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails_610());
		
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		 FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails_610().clear();
		 FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails_610().sendKeys(testData.get("Total Down Payment"));
		 FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails_610().sendKeys(Keys.TAB);
		 
		 Thread.sleep(10000);
		 
		 String downPaymentAnount_InLimitsDetails = FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails_610().getAttribute("prevvalue").toString().replace(",","").split("[.]")[0];
			System.err.println("totaldownPayment_InLimitsDetails: " + downPaymentAnount_InLimitsDetails);
			downpaymentAmountInDet = Integer.parseInt(downPaymentAnount_InLimitsDetails);
			System.err.println("downpaymentAmountInDet: " + downpaymentAmountInDet);
//		 FMS_WifakApplication_Obj.totaldownPayment_InLimitsDetails().sendKeys(testData.get("Total Down Payment"));	}   TFA training needed
		}
	
	@And("User_610 Validate Finance Amount")
	public void user_610_validate_finance_amount() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.financeAmount_InAdditionalDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.financeAmount_InAdditionalDetails_610());
		String financeAmt = JavascriptHelper.executeScript("return document.getElementsByName('applicationFacilityCO.fmsApplVO.VALUE')[0].value").
				toString().replace(",","").split("[.]")[0];
		//		System.err.println("finaceamount :"+ financeAmt );
				int FinanceAmt = Integer.parseInt(financeAmt);
				System.err.println("FinanceAmt :"+ FinanceAmt );
				Assert.assertEquals((Integer.parseInt(testData.get("Total value")) - Integer.parseInt(testData.get("Down Payment"))), FinanceAmt);
					
	}
	
	@Then("User_{int} Validate Total Facility Value")
	public void user_validate_total_facility_value(Integer int1) {
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityValue_InAdditionalDetails_610());
		String facilityValueInLimitDe = FMS_WifakApplication_Obj.facilityValue_InAdditionalDetails_610().getAttribute("prevvalue");
	//	System.err.println("TotalValue: " + facilityValueInLimitDe);
		facilityValueInLimit = Integer.parseInt(facilityValueInLimitDe);
	//	System.err.println("facilityValueInLimit: " + facilityValueInLimit);
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.TotalFacilityValue_InLImitDetails_SubMenu_610());
		String totalfacilityvalue = JavascriptHelper.executeScript("return document.getElementsByName('applicationFacilityCO.fmsAppLimitDetCO.TOTAl_FACILITY_VALUE')[0].value").
				toString().replace(",","").split("[.]")[0];
		
		int totalfacilityValue = Integer.parseInt(totalfacilityvalue);
		System.err.println("totalfacilityValue: " + totalfacilityValue);
		System.err.println("downpaymentAmountInDet: " + downpaymentAmountInDet);
		System.err.println("facilityValueInLimit: " + facilityValueInLimit);
		
		Assert.assertEquals((downpaymentAmountInDet+facilityValueInLimit), totalfacilityValue);
		
	}
	
	@And("User_{int} enter Down Payment Value")
	public void user_enter_down_payment_value(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.downPayment_InAdditionalDetails_610());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.downPayment_InAdditionalDetails_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		 FMS_WifakApplication_Obj.downPayment_InAdditionalDetails_610().sendKeys(testData.get("Down Payment"));
		 FMS_WifakApplication_Obj.downPayment_InAdditionalDetails_610().sendKeys(Keys.TAB);
		 Thread.sleep(6000);
		 
		    String downpayment = FMS_WifakApplication_Obj.downPayment_InAdditionalDetails_610().getAttribute("prevvalue");
		//	System.err.println("downpayment: " + downpayment);
			downPayment = Integer.parseInt(downpayment);
			System.err.println("downPayment: " + downPayment);
		 
	//	FMS_WifakApplication_Obj.downPayment_InAdditionalDetails().sendKeys(testData.get("Product Class"));
	}

	

	@And("^User_610 Enter Facility Value$")
	public void enter_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys(Keys.DELETE);
		// Thread.sleep(50000);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
				FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^User_610 Enter second ValueOn Facility Value$")
	public void enter_second_valueon_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys(Keys.DELETE);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().clear();
		// Thread.sleep(6000);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
				FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^User_610 Enter third ValueOn Facility Value$")
	public void enter_third_valueon_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys(Keys.DELETE);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().clear();
		// Thread.sleep(6000);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
				FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^User_610 Enter Fourth ValueOn Facility Value$")
	public void enter_fourth_valueon_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys(Keys.DELETE);

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys("2000");
//		
//		for (int i = 0; i < 200; i++) {
//			try {
//				
//				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610());
//				FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue_610().sendKeys("2000");
//				break;
//			} catch (Exception e) {
//				if (i == 199) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
	}

	@Then("^Enter the value on  Purpose Of Finacing$")
	public void enter_the_value_on_purpose_of_finacing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610().sendKeys("1");
	}

	@And("^Enter the second value on  Purpose Of Finacing$")
	public void enter_the_second_value_on_purpose_of_finacing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610().sendKeys("1");
	}

	@And("^Enter the third value on  Purpose Of Finacing$")
	public void enter_the_third_value_on_purpose_of_finacing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610().sendKeys("1");
	}

	@And("^Enter the Fourth value on  Purpose Of Finacing$")
	public void enter_the_fourth_value_on_purpose_of_finacing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610());
		FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing_610().sendKeys("1");
	}

	@And("^User_610 Enter second ValueOn Product Class$")
	public void enter_second_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
//		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class());
//		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class().sendKeys("1");

		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().click();
				FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys("1");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Enter third ValueOn Product Class$")
	public void enter_third_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys("1");
	}

	@And("^User_610 Enter Fourth ValueOn Product Class$")
	public void User_610_enter_fourth_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys("1");
	}

	@And("^User_610 Click Search Button In Account No$")
	public void User_610_click_search_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_Search_Button_Account_No_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Search_Button_Account_No());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Search_Button_Account_No_610());
	}

	@And("^User_610 Enter Double Click Search Account No$")
	public void User_610_enter_double_click_search_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Double_Click_Search_Account_No_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Double_Click_Search_Account_No());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Double_Click_Search_Account_No_610());
		Thread.sleep(300000);
	}

	@And("^AfterEnter ValueOn Product Class Search$")
	public void afterenter_valueon_product_class_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.getAfterEnter_ValueOn_Product_Class_Search_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getAfterEnter_ValueOn_Product_Class_Search_610());
		Thread.sleep(10000);
	}

	@And("^User_610 Click Add button AfterEnter Value On Product Class$")
	public void click_add_button_afterenter_value_on_product_class() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd_610());
		
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_610 Validate how many product class in limits details")
	public void validate_how_many_product_class_in_limits_details() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.TableHead_LimitDetails_610());
		List<WebElement> rows = driver.findElements(
				By.xpath("//table[@id='ApplicationFacilityLimitDetailsGrid_WIFT001MT']//td[@tdlabel='Item']"));

		int count = rows.size();
		System.out.println("ROW COUNT : " + count);

		for (WebElement e : rows) {
			Assert.assertEquals(true, count > 3);
		}

	}

	// -----------------------------------@827642

	@Then("^User Enter Date Below to this current Date$")
	public void user_enter_date_below_to_this_current_date() throws Throwable {

	}

	@And("^User Check Fx Settlement Expery Date$")
	public void user_check_fx_settlement_expery_date() throws Throwable {
	}

	@And("^User Enter Date above current Date$")
	public void user_enter_date_above_current_date() throws Throwable {
	}

	// ---------------------------@1108920

	@And("^User_610 Click Fixed Assert button$")
	public void click_fixed_assert_button() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// FMS_WifakApplication_Obj.getClick_FixedAssert_Button());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getClick_FixedAssert_Button());
		// clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_FixedAssert_Button());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_FixedAssert_Button_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click AddButton On FixedAssert screen$")
	public void click_addbutton_on_fixedassert_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.getClick_AddButton_OnFixedAssert_screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getClick_AddButton_OnFixedAssert_screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_AddButton_OnFixedAssert_screen_610());
	}

	@And("^User_610 Enter value on Catagory$")
	public void enter_value_on_catagory() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// FMS_WifakApplication_Obj.getEnter_value_on_Catagory());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_Catagory());
		// clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_Catagory());
		// FMS_WifakApplication_Obj.getEnter_value_on_Catagory().sendKeys("1");;

		for (int i = 0; i < 300; i++) {

			try {
				FMS_WifakApplication_Obj.Click_value_1_on_Catagory_610().click();

//					FMS_WifakApplication_Obj.getEnter_value_on_Catagory().click();
				FMS_WifakApplication_Obj.getEnter_value_on_Catagory_610().sendKeys("1");
				FMS_WifakApplication_Obj.getEnter_value_on_Catagory_610().sendKeys(Keys.TAB);
				break;

			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(5000);
//			for (int i=0;i<300;i++) {
//				if (FMS_WifakApplication_Obj.getEnter_value_on_Catagory().getAttribute("prevvalue").isBlank()) {
//					
//				}
//				
//			}
	}

	@And("^User_610 Enter value on Class$")
	public void enter_value_on_class() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_Class());
//		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_Class());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_Class());
//		FMS_WifakApplication_Obj.getEnter_value_on_Class().sendKeys("1234");

		for (int i = 0; i < 300; i++) {

			try {
				FMS_WifakApplication_Obj.Click_value_1_on_Catagory_610().click();

//				FMS_WifakApplication_Obj.getEnter_value_on_Catagory().click();
				FMS_WifakApplication_Obj.getEnter_value_on_Class_610().sendKeys("1234");
				FMS_WifakApplication_Obj.getEnter_value_on_Class_610().sendKeys(Keys.TAB);
				break;

			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(5000);

	}

	@And("^User_610 Enter value on vendor$")
	public void enter_value_on_vendor() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_vendor_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_vendor_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_vendor_610());
		FMS_WifakApplication_Obj.getEnter_value_on_vendor_610().sendKeys("1");
	}

	@And("^User_610 Enter value on quantity$")
	public void enter_value_on_quantity() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_quantity_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_quantity_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_quantity_610());
		FMS_WifakApplication_Obj.getEnter_value_on_quantity_610().sendKeys("1");
	}

	@And("^User_610 Enter value on Unit$")
	public void enter_value_on_unit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_Unit_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_Unit_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_Unit_610());
		FMS_WifakApplication_Obj.getEnter_value_on_Unit_610().sendKeys("1");
	}

	@And("^User_610 Enter value on Cy$")
	public void enter_value_on_cy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_Cy_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_Cy_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_Cy_610());
		FMS_WifakApplication_Obj.getEnter_value_on_Cy_610().sendKeys("999");
	}

	@And("^User_610 Enter value on UnitCost$")
	public void enter_value_on_unitcost() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_UnitCost_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_UnitCost_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_UnitCost_610());
		FMS_WifakApplication_Obj.getEnter_value_on_UnitCost_610().sendKeys("11");
	}

	@And("^User_610 Enter value on Vat Code$")
	public void enter_value_on_vat_code() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper.scrollIntoView(FMS_WifakApplication_Obj.Enter_value_on_Vat_Code_610());
				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_value_on_Vat_Code_610());
				FMS_WifakApplication_Obj.Enter_value_on_Vat_Code_610().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	// -----------------------------------------------------

	@And("^User_610 Enter Currency Button In Account No$")
	public void enter_currency_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Currency__Button_In_Account_No_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Currency__Button_In_Account_No_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Currency__Button_In_Account_No_610());
		FMS_WifakApplication_Obj.Currency__Button_In_Account_No_610().sendKeys("840");
		// Thread.sleep(3000);
	}

	@And("^User_610 Enter GLCode Button In Account No$")
	public void enter_glcode_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.GLCode__Button_In_Account_No_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.GLCode__Button_In_Account_No_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.GLCode__Button_In_Account_No_610());
		FMS_WifakApplication_Obj.GLCode__Button_In_Account_No_610().sendKeys("10001");
		// Thread.sleep(3000);
	}

	@And("^User_610 Enter Serial Button In Account No$")
	public void enter_serial_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Serial__Button_In_Account_No_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Serial__Button_In_Account_No_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Serial__Button_In_Account_No_610());
		FMS_WifakApplication_Obj.Serial__Button_In_Account_No_610().sendKeys("1");
		// Thread.sleep(3000);
	}

	@And("^User_610 Enter Account Number$")
	public void enter_account_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_Account_Number_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_Account_Number_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_Account_Number_610());
		FMS_WifakApplication_Obj.Enter_Account_Number_610().sendKeys("84001000100000727001");
	}

	@And("^User_610 User Click Charges Details$")
	public void User_610_user_click_charges_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_Charges_Details_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Charges_Details_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Charges_Details_610());
	}

	@And("^User_610 User Check Flag In Collect At Fac Approvel$")
	public void User_610_user_check_flag_in_collect_at_fac_approvel() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_1_In_Charges_Details_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_1_In_Charges_Details_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_1_In_Charges_Details_610());

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Check_Flag_In_Collect_At_Fac_Approvel_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Check_Flag_In_Collect_At_Fac_Approvel_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Check_Flag_In_Collect_At_Fac_Approvel_610());
	}

	@And("^User_610 User Click Ok Button In Collect At Fac Approvel$")
	public void User_610_user_click_ok_button_in_collect_at_fac_approvel() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Click_Ok_Button_In_Collect_At_Fac_Approvel_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Ok_Button_In_Collect_At_Fac_Approvel_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Ok_Button_In_Collect_At_Fac_Approvel_610());
	}

	@And("^User_610 Click Save Button After Collect At Fac Approvel Give Ok$")
	public void User_610_click_save_button_after_collect_at_fac_approvel_give_ok() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
	}

	@And("^User_610 Click Ok Button In Waring Screen$")
	public void User_610_click_Ok_Button_In_Waring_Screen_610() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
	}

	@And("^User_610 Click OK In Button Sucess Screen$")
	public void User_610_click_ok_in_button_sucess_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
	}

	@And("^Click Validate Button$")
	public void click_validate_button() throws Throwable {

	}

	@And("^User_610 Click Document Details$")
	public void click_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_Document_Details_610());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Document_Details());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Document_Details());

		for (int i = 0; i < 1000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Document_Details_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("^User_610 Enter The Value Solicitor Name$")
	public void enter_the_value_solicitor_name() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.EnterTheValue_Solicitor_Name_610());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.EnterTheValue_Solicitor_Name());
//			clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.EnterTheValue_Solicitor_Name());

		for (int i = 0; i < 1000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.EnterTheValue_Solicitor_Name_610());
				// FMS_WifakApplication_Obj.EnterTheValue_Solicitor_Name().sendKeys("1");
				FMS_WifakApplication_Obj.EnterTheValue_Solicitor_Name_610().sendKeys(testData.get("Solicitor Name"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("^User_610 Enter The Value Estimator Name$")
	public void enter_the_value_estimator_name() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name_610());

		for (int i = 0; i < 1000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name_610());
				FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name_610().sendKeys(testData.get("Estimator Name"));
				FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name_610().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
			}

	@And("^User_610 Click Save Button After Document Details$")
	public void click_save_button_after_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
	}

	@And("^User_610 Click Ok Button In Waring Screen Document Details$")
	public void click_Ok_Button_In_Waring_Screen_610_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Waring_OnLimitDetails_Tab_610());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Validate_Warning_ConfirmValidateProcess());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_Warning_ConfirmValidateProcess());

		for (int i = 0; i < 2000; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// FMS_WifakApplication_Obj.Validate_Warning_ConfirmValidateProcess());
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Waring_OnLimitDetails_Tab_610());
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("Click OK Button In Confirm Already Created IN Document Details")
	public void click_ok_button_in_confirm_already_created_in_document_details() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Validate_Confirm_alreadyCreated_610());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Validate_Confirm_alreadyCreated());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_Confirm_alreadyCreated());

		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_Confirm_alreadyCreated_610());
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@Then("Click OK Button In Success ValidateSuccessfully IN Document Details")
	public void click_ok_button_in_success_validate_successfully_in_document_details() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Validate_Success_ValidateSuccessfull_610());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Validate_Success_ValidateSuccessfull());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_Success_ValidateSuccessfull());

		for (int i = 0; i < 2000; i++) {
			try {

				clicksAndActionsHelper
						.clickOnElement(FMS_WifakApplication_Obj.Validate_Success_ValidateSuccessfull_610());
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@Then("Click Dismiss Button In Send Alert Popup")
	public void click_dismiss_button_in_send_alert_popup() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss_610());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss());

		for (int i = 0; i < 2000; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss());
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss_610());
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("^User_610 Click OK  Button In Sucess Screen Document Details$")
	public void User_610_click_Ok_Button_In_Sucess_Screen_610_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
	}

	@And("User_{int} Save button")
	public void user_validate_save_button_in_document_details(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());

		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
	}

	@And("^User_610 Click Validate Button in Document Details$")
	public void click_validate_button_in_document_details() throws Throwable {


		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.limitDetailsValidateBtn_610());
		FMS_WifakApplication_Obj.limitDetailsValidateBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WarningPopupOkBtn_610());
		FMS_WifakApplication_Obj.WarningPopupOkBtn_610().click();

		// Facility already created popup
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.confirmPopup_610());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityAlreadyCreatedPopup_610());
		FMS_WifakApplication_Obj.facilityAlreadyCreatedPopup_610().click();

		//get facility code
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup_610());
		SuccessMsg = FMS_WifakApplication_Obj.successPopupMessage_610().getText().substring(23, 27);
		System.err.println("Reference Number: " + SuccessMsg);
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.successPopupOkBtn_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.sendAlertPopup_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.sendAlertPopup_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Click OK Button In Success Screen IN Document Details$")
	public void click_ok_button_in_success_screen_in_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
	}

	// -----------------------------@592970 TSR - AMANAUPG170182 - Holiday issue

	@Then("^User_610 Enter Holiday Date In Expiratin date in additional Details$")
	public void User_610_enter_holiday_date_in_expiratin_date_in_additional_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Expiratin_date_additional_Details_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Expiratin_date_additional_Details_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Expiratin_date_additional_Details_610());
		FMS_WifakApplication_Obj.Expiratin_date_additional_Details_610().sendKeys(testData.get("Expire Date"));
		FMS_WifakApplication_Obj.Expiratin_date_additional_Details_610().sendKeys(Keys.TAB);
	}

	@Then("User_610 Validate holiday day allow or not")
	public void User_610_validate_holiday_day_allow_or_not() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.validate_holidayDate_610());
		Assert.assertTrue(FMS_WifakApplication_Obj.validate_holidayDate_610().isDisplayed());
	}

	@And("^User_610 Confirm the Requested Holiday date$")
	public void User_610_confirm_the_requested_holiday_date() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_610());
	}

	@Then("^User_610 Enter Holiday date in Expected Payment Date in Limit Details SubMenu$")
	public void User_610_enter_holiday_date_in_expected_payment_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu_610());
		FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu_610().sendKeys(testData.get("Expected Payment Date"));
		FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu_610().sendKeys(Keys.TAB);
	}

	@And("^User_610 Confirm the Requested Holiday date in Limit Details SubMenu$")
	public void User_610_confirm_the_requested_holiday_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_In_LimitsDetails_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_In_LimitsDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_In_LimitsDetails_610());
	}

	// ---------------

	// -------- 592279 TSR- SUPT170522 - Label missing limit Details

	@Then("^User_610 Check The Level Of Product Class In LImit Details SubMenu$")
	public void check_the_level_of_product_class_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.ProductClass_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ProductClass_InLImitDetails_SubMenu_610());
		// clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate());
		// FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate().sendKeys("04/01/2021");
		Assert.assertEquals(true, FMS_WifakApplication_Obj.ProductClass_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Case Non Case In LImit Details SubMenu$")
	public void check_the_level_of_case_non_case_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.CaseNonCase_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CaseNonCase_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CaseNonCase_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Exchange Rate In LImit Details SubMenu$")
	public void check_the_level_of_exchange_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.ExchangeRate_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ExchangeRate_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.ExchangeRate_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Down Payment Percentage In LImit Details SubMenu$")
	public void check_the_level_of_down_payment_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.DownPaymentPercentage_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DownPaymentPercentage_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,FMS_WifakApplication_Obj.DownPaymentPercentage_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Details Down Payment To Vendor Percentage In LImit Details SubMenu$")
	public void check_the_level_of_details_down_payment_to_vendor_percentage_in_limit_details_submenu()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.DownPaymentToVendorPerc_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DownPaymentToVendorPerc_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,FMS_WifakApplication_Obj.DownPaymentToVendorPerc_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Total Down Payment Percentage In LImit Details SubMenu$")
	public void check_the_level_of_total_down_payment_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.TotalDownPaymentPerc_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TotalDownPaymentPerc_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,FMS_WifakApplication_Obj.TotalDownPaymentPerc_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Total Facility Value In LImit Details SubMenu$")
	public void check_the_level_of_total_facility_value_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.TotalFacilityValue_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TotalFacilityValue_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,FMS_WifakApplication_Obj.TotalFacilityValue_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Items In LImit Details SubMenu$")
	public void check_the_level_of_items_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Items_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Items_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Items_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Type In LImit Details SubMenu$")
	public void check_the_level_of_type_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Type_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Type_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Type_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Facility Value In LImit Details SubMenu$")
	public void check_the_level_of_facility_value_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FacilityValue_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FacilityValue_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.FacilityValue_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of CV Value In LImit Details SubMenu$")
	public void check_the_level_of_cv_value_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.CvValue_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CvValue_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CvValue_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Down Payment AmountIn LImit Details SubMenu$")
	public void check_the_level_of_down_payment_amountin_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Down Payment To Vendor Amt In LImit Details SubMenu$")
	public void check_the_level_of_down_payment_to_vendor_amt_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DownPaymentToVendorAmt_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.DownPaymentToVendorAmt_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.DownPaymentToVendorAmt_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  Total Down Payment In LImit Details SubMenu$")
	public void check_the_level_of_total_down_payment_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TotalDownPayment_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TotalDownPayment_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TotalDownPayment_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Value Date In LImit Details SubMenu$")
	public void check_the_level_of_value_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ValueDate_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ValueDate_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.ValueDate_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Maturity Date In LImit Details SubMenu$")
	public void check_the_level_of_maturity_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Maturity_Date_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Maturity_Date_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Maturity_Date_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of  Status In LImit Details SubMenu$")
	public void check_the_level_of_status_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.status_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.status_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.status_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of  Account No In LImit Details SubMenu$")
	public void check_the_level_of_account_no_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.AccountNo_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.AccountNo_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.AccountNo_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of  Account Name In LImit Details SubMenu$")
	public void check_the_level_of_account_name_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.AccountName_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.AccountName_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.AccountName_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of TFA Margin Rate_In LImit Details SubMenu$")
	public void check_the_level_of_tfa_margin_ratein_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TFAMarginRate_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TFAMarginRate_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TFAMarginRate_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Sub Eco Sector In LImit Details SubMenu$")
	public void check_the_level_of_sub_eco_sector_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.SubEcoSector_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SubEcoSector_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.SubEcoSector_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Discounting Margin percentage In LImit Details SubMenu$")
	public void check_the_level_of_discounting_margin_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DiscountingMarginPer_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DiscountingMarginPer_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.DiscountingMarginPer_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Payment Method In LImit Details SubMenu$")
	public void check_the_level_of_payment_method_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.PaymentMethod_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.PaymentMethod_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.PaymentMethod_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Installment Amount In LImit Details SubMenu$")
	public void check_the_level_of_installment_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.InstallmentAmount_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.InstallmentAmount_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.InstallmentAmount_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Security Deposit Amount In LImit Details SubMenu$")
	public void check_the_level_of_security_deposit_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.SecurityDepositAmount_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.SecurityDepositAmount_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.SecurityDepositAmount_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Cap Rate In LImit Details SubMenu$")
	public void check_the_level_of_cap_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.CapRate_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CapRate_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CapRate_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of floor Rate Method In LImit Details SubMenu$")
	public void check_the_level_of_floor_rate_method_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.floorRateMethod_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.floorRateMethod_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.floorRateMethod_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Credit Spread In LImit Details SubMenu$")
	public void check_the_level_of_credit_spread_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.CreditSpread_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CreditSpread_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CreditSpread_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Sublimit Lower Limit Amount In LImit Details SubMenu$")
	public void check_the_level_of_sublimit_lower_limit_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.SublimitLowerLimitAmount_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SublimitLowerLimitAmount_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,FMS_WifakApplication_Obj.SublimitLowerLimitAmount_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Expected Payment Date In LImit Details SubMenu$")
	public void check_the_level_of_expected_payment_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu_610());
		Assert.assertEquals(true,FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Checking On In LImit Details SubMenu$")
	public void check_the_level_of_checking_on_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.CheckingOn_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CheckingOn_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CheckingOn_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Fund Transfer Rate In LImit Details SubMenu$")
	public void check_the_level_of_fund_transfer_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FundTransferRate_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FundTransferRate_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.FundTransferRate_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Eco Sector In LImit Details SubMenu$")
	public void check_the_level_of_eco_sector_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.EcoSector_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.EcoSector_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.EcoSector_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of TFAT enure Days In LImit Details SubMenu$")
	public void check_the_level_of_tfat_enure_days_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TFATenureDays_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TFATenureDays_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TFATenureDays_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Remarks In LImit Details SubMenu$")
	public void check_the_level_of_remarks_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Remarks_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Remarks_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Remarks_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Purpose of financing In LImit Details SubMenu$")
	public void check_the_level_of_purpose_of_financing_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Purposeoffinancing_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Purposeoffinancing_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.Purposeoffinancing_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of No of Installments In LImit Details SubMenu$")
	public void check_the_level_of_no_of_installments_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.NoofInstallments_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.NoofInstallments_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.NoofInstallments_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Amended Security Deposit Amount In LImit Details SubMenu$")
	public void check_the_level_of_amended_security_deposit_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of selling price In LImit Details SubMenu$")
	public void check_the_level_of_selling_price_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.selling_price_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.selling_price_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.selling_price_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Floor Rate Percentage In LImit Details SubMenu$")
	public void check_the_level_of_floor_rate_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FloorRatePercentage_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FloorRatePercentage_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.FloorRatePercentage_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Sublimit Lower Limit Percentage In LImit Details SubMenu$")
	public void check_the_level_of_sublimit_lower_limit_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.SublimitLowerLimitPerc_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.SublimitLowerLimitPerc_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.SublimitLowerLimitPerc_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Clean Flag In LImit Details SubMenu$")
	public void check_the_level_of_clean_flag_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.CleanFlag_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CleanFlag_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CleanFlag_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Revolving One Off In LImit Details SubMenu$")
	public void check_the_level_of_revolving_one_off_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.RevolvingOneOff_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.RevolvingOneOff_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.RevolvingOneOff_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Penalty On Due Amount In LImit Details SubMenu$")
	public void check_the_level_of_penalty_on_due_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.PenaltyOnDueAmount_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.PenaltyOnDueAmount_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.PenaltyOnDueAmount_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of charges type In LImit Details SubMenu$")
	public void check_the_level_of_charges_type_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.chargestype_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.chargestype_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.chargestype_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of PPR In LImit Details SubMenu$")
	public void check_the_level_of_ppr_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of BUDGET ALLOCATION In LImit Details SubMenu$")
	public void check_the_level_of_budget_allocation_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of comments and conditions In LImit Details SubMenu$")
	public void check_the_level_of_comments_and_conditions_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.comments_and_conditions_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.comments_and_conditions_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.comments_and_conditions_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Maximum Tenure Periodicity No key In LImit Details SubMenu$")
	public void check_the_level_of_maximum_tenure_periodicity_no_key_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Minimum Tenure Periodicity No In LImit Details SubMenu$")
	public void check_the_level_of_minimum_tenure_periodicity_no_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Maximum Tenure for financing PeriodicityNo key In LImit Details SubMenu$")
	public void check_the_level_of_maximum_tenure_for_financing_periodicityno_key_in_limit_details_submenu()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(
				FMS_WifakApplication_Obj.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj
				.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Floating Rate In LImit Details SubMenu$")
	public void check_the_level_of_floating_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FloatingRate_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FloatingRate_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.FloatingRate_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Floating Rate Periodi city Type In LImit Details SubMenu$")
	public void check_the_level_of_floating_rate_periodi_city_type_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FloatingRatePeriodicityType_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.FloatingRatePeriodicityType_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.FloatingRatePeriodicityType_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Total Yield In LImit Details SubMenu$")
	public void check_the_level_of_total_yield_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TotalYield_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TotalYield_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TotalYield_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of  limit lip start dat In LImit Details SubMenu$")
	public void check_the_level_of_limit_lip_start_dat_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.limitlipstartdate_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.limitlipstartdate_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.limitlipstartdate_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of zero entry cost In LImit Details SubMenu$")
	public void check_the_level_of_zero_entry_cost_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.zeroentrycost_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.zeroentrycost_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.zeroentrycost_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  Apply PenaltyIn LImit Details SubMenu$")
	public void check_the_level_of_apply_penaltyin_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ApplyPenalty_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ApplyPenalty_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.ApplyPenalty_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Grace Period_ In LImit Details SubMenu$")
	public void check_the_level_of_grace_period_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.GracePeriod_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.GracePeriod_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.GracePeriod_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Vat code In LImit Details SubMenu$")
	public void check_the_level_of_vat_code_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Vatcode_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Vatcode_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Vatcode_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of REGIMENTAL AGENT In LImit Details SubMenu$")
	public void check_the_level_of_regimental_agent_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.REGIMENTAL_AGENT_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.REGIMENTAL_AGENT_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.REGIMENTAL_AGENT_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  CONTRACTED In LImit Details SubMenu$")
	public void check_the_level_of_contracted_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.CONTRACTED_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CONTRACTED_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CONTRACTED_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  transaction cy In LImit Details SubMenu$")
	public void check_the_level_of_transaction_cy_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.transaction_cy_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.transaction_cy_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.transaction_cy_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Maximum Tenure Periodicity Type key In LImit Details SubMenu$")
	public void check_the_level_of_maximum_tenure_periodicity_type_key_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of Minimum Tenure PeriodicityType key In LImit Details SubMenu$")
	public void check_the_level_of_minimum_tenure_periodicitytype_key_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  Maximum Tenure for financing PeriodicityType key In LImit Details SubMenu$")
	public void check_the_level_of_maximum_tenure_for_financing_periodicitytype_key_in_limit_details_submenu()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(
				FMS_WifakApplication_Obj.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj
				.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  Floating Rate Periodi city In LImit Details SubMenu$")
	public void check_the_level_of_floating_rate_periodi_city_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FloatingRatePeriodicit_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.FloatingRatePeriodicit_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.FloatingRatePeriodicit_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of   Margin Rate In LImit Details SubMenu$")
	public void check_the_level_of_margin_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MarginRate_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.MarginRate_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.MarginRate_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  lip perioIn LImit Details SubMenu$")
	public void check_the_level_of_lip_perioin_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.lip_period_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.lip_period_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.lip_period_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  lip period amende In LImit Details SubMenu$")
	public void check_the_level_of_lip_period_amende_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.lip_period_amende_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.lip_period_amende_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.lip_period_amende_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Transcation Type In LImit Details SubMenu$")
	public void check_the_level_of_transcation_type_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TranscationType_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TranscationType_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TranscationType_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of Acc No In LImit Details SubMenu$")
	public void check_the_level_of_acc_no_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu_610().isEnabled());
	}

	@Then("^User_610 Check The Level Of  Close Button In LImit Details SubMenu$")
	public void check_the_level_of_close_button_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.close_btn_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.close_btn_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.close_btn_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  Transcation Maturity In LImit Details SubMenu$")
	public void check_the_level_of_transcation_maturity_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TranscationMaturity_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TranscationMaturity_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.TranscationMaturity_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  Bank No In LImit Details SubMenu$")
	public void check_the_level_of_bank_no_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.bank_no_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.bank_no_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.bank_no_InLImitDetails_SubMenu_610().isEnabled());
	}

	@And("^User_610 Check The Level Of  Add Button In LImit Details SubMenu$")
	public void check_the_level_of_add_button_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu_610());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu_610().isEnabled());
	}

	// -------------@579604 Scenario: TSR - KCB170047

	@Then("^User_610 Click Application For Decrease$")
	public void click_application_for_decrease() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getApplication_for_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getMaintenance());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.getApplication_for_610(), "Decrease");
	}

	@And("^User_610 Enter Existing Facility Ref$")
	public void enter_existing_facility_ref() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ExistingFacility_Ref_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ExistingFacility_Ref_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.ExistingFacility_Ref_610());
		FMS_WifakApplication_Obj.ExistingFacility_Ref_610().sendKeys("1382");
		FMS_WifakApplication_Obj.ExistingFacility_Ref_610().sendKeys(Keys.TAB);
	}

	@And("^User_610 Click on additional Details In Additional Details$")
	public void click_on_additional_details_in_additional_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_AdditionalDetails_610());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getMaintenance());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getMaintenance());

		for (int i = 0; i < 500; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_AdditionalDetails_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Enter the Total Value In Additional Details$")
	public void enter_the_total_value_in_additional_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.TOTAL_AMOUNT_InAdditionalDetails_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TOTAL_AMOUNT_InAdditionalDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.TOTAL_AMOUNT_InAdditionalDetails_610());
		FMS_WifakApplication_Obj.TOTAL_AMOUNT_InAdditionalDetails_610().sendKeys("50000");
	}

	@Then("^User_610 Enter Down Payment In Percentage$")
	public void enter_down_payment_in_percentage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610());
		for (int i = 0; i <= 500; i++) {
			try {
				if (FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610().getAttribute("prevvalue")
						.isBlank()) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610().sendKeys("10");
		FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610().sendKeys(Keys.TAB);

		int total = (50000 * 10) / 100;
		System.err.println("Total value: " + total);
		String valueOf = String.valueOf(total);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DownPaymentAmo_InLImitDetails_SubMenu_610());
		String attribute = FMS_WifakApplication_Obj.DownPaymentAmo_InLImitDetails_SubMenu_610()
				.getAttribute("prevvalue");
		System.err.println("Down payment amount: " + attribute);

		String[] splitAttribute = attribute.split("[.]");
		String finalAttribute = splitAttribute[0].replace(",", "");

		System.err.println(finalAttribute);

		Assert.assertEquals(valueOf, finalAttribute);

	}

	// --------------------------------- @574947 Scenario: TSR-EWB170043

	@Then("^User_610 Check Flag in Clean Level IN Limits Detalis SubMenu$")
	public void check_flag_in_clean_level_in_limits_detalis_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.CLEAN_FLAG_In_LimitsDetails_610());

		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.CLEAN_FLAG_In_LimitsDetails_610());
				FMS_WifakApplication_Obj.CLEAN_FLAG_In_LimitsDetails_610().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("^User_610 Click the Product Class In Limits Details$")
	public void click_the_product_class_in_limits_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ProductClass_In_LimitsDetails_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ProductClass_In_LimitsDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.ProductClass_In_LimitsDetails_610());
	}

	@Then("^User_610 Click Ok Button In Waring Screen In Limits Details$")
	public void click_Ok_Button_In_Waring_Screen_610_in_limits_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
	}

	@Then("^User_610 Enter the value in No Of Payments  In Repayment Plan$")
	public void enter_the_value_in_no_of_payments_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan_610());
		FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan_610().sendKeys(Keys.DELETE);

		for (int i = 0; i < 500; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan_610());
				FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan_610().sendKeys("10");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan_610().sendKeys(Keys.TAB);

	}

	@Then("^User_610 Click Warning popup No In Repayment Plan$")
	public void click_warning_popup_no_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.okButton_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.okButton_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.okButton_610());
		Thread.sleep(3000);
		// FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan_610().sendKeys("10");
	}

	@Then("^User_610 Click Ok Button In Waring Screen In Repayment Plan$")
	public void click_Ok_Button_In_Waring_Screen_610_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		// clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click Save Button After In Limits Details$")
	public void click_save_button_after_in_limits_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getClick_SaveButton_OnLimitDetail_610s_Tab());
		// clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_SaveButton_OnLimitDetail_610s_Tab());
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 Click OK  Button In Sucess Screen In Limits Details$")
	public void click_Ok_Button_In_Sucess_Screen_610_in_limits_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
	}

	@And("^User_610 Click Repayment Plan In Limits Details$")
	public void click_repayment_plan_in_limits_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.RepaymentPlan_btn_In_LimitsDetails_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.RepaymentPlan_btn_In_LimitsDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.RepaymentPlan_btn_In_LimitsDetails_610());
	}

	@And("^User_610 Click Create Schedule In Repayment Plan$")
	public void click_create_schedule_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.createSchedule_InRepaymentPlan_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.createSchedule_InRepaymentPlan_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.createSchedule_InRepaymentPlan_610());
	}

	@And("^User_610 Click Save Button After In Repayment Plan$")
	public void click_save_button_after_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_RepaymentPlan_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SaveButton_RepaymentPlan_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_RepaymentPlan_610());
		Thread.sleep(5000);

	}

	@And("^User_610 Click OK  Button In Sucess Screen In Repayment Plan$")
	public void click_Ok_Button_In_Sucess_Screen_610_in_repayment_plan() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.InformationPopup_InRepaymentPlan_610());
		// String SuccessMsg =
		// FMS_WifakApplication_Obj.successPopupMessage().getText();
		SuccessMsg2 = FMS_WifakApplication_Obj.successPopupMessage_610().getText().substring(10, 14);
		System.err.println("Reference Number: " + SuccessMsg2);
	

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopupOkBtn_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.successPopupOkBtn_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

				
//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
//		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		
				
	}

//---------------------approvel 1	    

	@And("^User_610 clicks the Approve Level1 link$")
	public void user_clicks_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel1_610());
		FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel1_610().click();
	}

	@And("^User_610 retrive the first data in approve level1$")
	public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level1_610());
		System.out.println("SuccessMsg:"+SuccessMsg);
		FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level1_610().sendKeys(SuccessMsg, Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level1_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level1_610());
	}

	@And("^User_610 select the Approve level1 decision as approve$")
	public void select_the_approve_level1_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel1SelectDecision_610());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel1SelectDecision_610(), "Approve");
		// DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel1SelectDevision(),
		// testData.get("Decision1"));
	}

	@And("^User_610 clicks on the level1 submit button$")
	public void user_clicks_on_the_level1_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel1SubmitBtn_610());
		FMS_WifakApplication_Obj.approveLevel1SubmitBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1_610());
		FMS_WifakApplication_Obj.ButtonConfirmOk1_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonSuccessOk1_610());

		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.ButtonSuccessOk1_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	// --------------------approvel 2

	@And("^User_610 clicks the Approve Level2 link$")
	public void user_clicks_the_approve_level2_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel2_610());
		// FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel2().click();
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel2_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 retrive the first data in approve level2$")
	public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level2_610());
//	    	FMS_WifakApplication_Obj.approve1ClearBtn().click();
		FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level2_610().sendKeys(SuccessMsg, Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level2_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level2_610());
	}

	@And("^User_610 select the level2 decision as approve$")
	public void user_select_the_level2_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel2SelectDecision_610());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel2SelectDecision_610(), "Approve");
		// DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel2SelectDecision(),
		// testData.get("Decision2"));
	}

	@And("^User_610 clicks on the level2 submit button$")
	public void user_clicks_on_the_level2_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel2SubmitBtn_610());
		FMS_WifakApplication_Obj.approveLevel2SubmitBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1_610());
		FMS_WifakApplication_Obj.ButtonConfirmOk1_610().click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.ButtonSuccessOk1_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	// --------------------approvel 3

	@And("^User_610 clicks the Approve Level3 link$")
	public void user_clicks_the_approve_level3_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel3_610());
		FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel3_610().click();
	}

	@And("^User_610 retrive the first data in approve level3$")
	public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level3_610());
//	    	FMS_WifakApplication_Obj.approve1ClearBtn().click();
		FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level3_610().sendKeys(SuccessMsg, Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level3_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level3_610());
	}

	@And("^User_610 select the level3 decision as approve$")
	public void user_select_the_level3_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel3SelectDecision_610());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel3SelectDecision_610(), "Approve");
		// DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel3SelectDecision(),
		// testData.get("Decision3"));

	}

	@When("^User_610 clicks on the level3 submit button$")
	public void user_clicks_on_the_level3_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel3SubmitBtn_610());
		FMS_WifakApplication_Obj.approveLevel3SubmitBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1_610());
		FMS_WifakApplication_Obj.ButtonConfirmOk1_610().click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.ButtonSuccessOk1_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.sendAlertPopup1_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.sendAlertPopup1_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	// ------- @814762 facility management screen

	@Given("User_610 click facility management")
	public void click_facility_management() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityManagement_screen_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.facilityManagement_screen_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_610 click update after approvel")
	public void click_update_after_approvel() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.updateAfterApprove_screen_610());
		FMS_WifakApplication_Obj.updateAfterApprove_screen_610().click();
	}

	@Given("User_610 Retrive one data in update after approvel screen")
	public void retrive_one_data_in_update_after_approvel_screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.clearButton_InUpdateApproveScreen_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.clearButton_InUpdateApproveScreen_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.retriveData_InUpdateApproveScreen_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.retriveData_InUpdateApproveScreen_610());
	}

	@Given("User_610 Retrive Finance Amount in update after approvel")
	public void retrive_finance_amount_in_update_after_approvel() {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.facilityManagementFinanceAmt_Validate_610());
		String facilityFinanceAmt = FMS_WifakApplication_Obj.facilityManagementFinanceAmt_Validate_610().getAttribute("prevvalue");
		System.err.println("Finance Amount String: " + facilityFinanceAmt);
		FinanceAmt = Integer.parseInt(facilityFinanceAmt);
		System.out.println("Finance Amount: " + FinanceAmt);
	}

	@Given("User_610 click facility application details")
	public void click_facility_application_details() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityApplicationDetails_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.facilityApplicationDetails_InUpdateApproveScreen_610().click();
	}

	@Given("User-{int} click cash margin in update after approvel screen")
	public void user_click_cash_margin_in_update_after_approvel_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.cashMargin_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.cashMargin_InUpdateApproveScreen_610().click();
		FMS_WifakApplication_Obj.cashMargin_InUpdateApproveScreen_610().clear();
		FMS_WifakApplication_Obj.cashMargin_InUpdateApproveScreen_610().sendKeys("10");
	}

	@Given("User_610 check flag exceed facility at sublimit")
	public void check_flag_exceed_facility_at_sublimit() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InUpdateApproveScreen_610().click();
	}

	@Given("User_610 check flag subject to full repayment")
	public void check_flag_subject_to_full_repayment() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.subjectTofullRepayment_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.subjectTofullRepayment_InUpdateApproveScreen_610().click();
	}

	@Given("User_610 click facility limit details")
	public void click_facility_limit_details() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityLimitDetails_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.facilityLimitDetails_InUpdateApproveScreen_610().click();
	}

	@Given("User_610 click product class")
	public void click_product_class() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.productClass_InfacilityLimitDetails_InUpdateApproveScreen_610());
		clicksAndActionsHelper
				.doubleClick(FMS_WifakApplication_Obj.productClass_InfacilityLimitDetails_InUpdateApproveScreen_610());
	}

	@Given("User_610 enter the value cap rate")
	public void enter_the_value_cap_rate() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen_610().click();
		FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen_610().clear();
		FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen_610().sendKeys("10");
	}

	@Given("User_610 enter the value selling price")
	public void enter_the_value_selling_price() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen_610().click();
		FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen_610().clear();
		FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen_610().sendKeys("10");

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.EditBUtton_InLimitDetails_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.EditBUtton_InLimitDetails_InUpdateApproveScreen_610().click();
	}

	@Given("User_610 click document details approvel screen")
	public void click_document_details_approvel_screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.documentDetails_InUpdateApproveScreen_610());
		FMS_WifakApplication_Obj.documentDetails_InUpdateApproveScreen_610().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Given("User_610 enter the date in document details")
	public void enter_the_date_in_document_details() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.clickfirstRow1buttonButton_InDocumentDetails_610());
		FMS_WifakApplication_Obj.clickfirstRow1buttonButton_InDocumentDetails_610().click();

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails_610());
		FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		// FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails().click();

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails_610());
		FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.solicitorDataReceived_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.estimatorDateSent_InDocumentDetails_610());
		FMS_WifakApplication_Obj.estimatorDateSent_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.estimatorDateSent_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.estimatorDateSent_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.estimatorDateRecevied_InDocumentDetails_610());
		FMS_WifakApplication_Obj.estimatorDateRecevied_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.estimatorDateRecevied_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.estimatorDateRecevied_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.custodianDateSent_InDocumentDetails_610());
		FMS_WifakApplication_Obj.custodianDateSent_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.custodianDateSent_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.custodianDateSent_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		// ------2nd row

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.clicksolicitorDataSendRow2_InDocumentDetails_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.clicksolicitorDataSendRow2_InDocumentDetails_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDataSendRow2_InDocumentDetails_610());
		FMS_WifakApplication_Obj.solicitorDataSendRow2_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.solicitorDataSendRow2_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.solicitorDataSendRow2_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDataDataRecived2_InDocumentDetails_610());
		FMS_WifakApplication_Obj.solicitorDataDataRecived2_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.solicitorDataDataRecived2_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.solicitorDataDataRecived2_InDocumentDetails_610()
						.getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.estimatorDateSent2_InDocumentDetails_610());
		FMS_WifakApplication_Obj.estimatorDateSent2_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.estimatorDateSent2_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.estimatorDateSent2_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.estimatorDateReceviedt2_InDocumentDetails_610());
		FMS_WifakApplication_Obj.estimatorDateReceviedt2_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.estimatorDateReceviedt2_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.estimatorDateReceviedt2_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.custodianDateSent2_InDocumentDetails_610());
		FMS_WifakApplication_Obj.custodianDateSent2_InDocumentDetails_610().click();
		FMS_WifakApplication_Obj.custodianDateSent2_InDocumentDetails_610().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.custodianDateSent2_InDocumentDetails_610().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@Given("User_610 save the details")
	public void save_the_details() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.SaveButton_DocumentDetails_updateafter_Tab_610());
		FMS_WifakApplication_Obj.SaveButton_DocumentDetails_updateafter_Tab_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WaringButton_OnLimitDetails_Tab_610());
		FMS_WifakApplication_Obj.WaringButton_OnLimitDetails_Tab_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup_610());
		// String SuccessMsg =
		// FMS_WifakApplication_Obj.successPopupMessage().getText();
		SuccessMsg2 = FMS_WifakApplication_Obj.successPopupMessage_610().getText().substring(11, 15);
		System.err.println("Reference Number: " + SuccessMsg2);
		// fmsTransactionsExcelData.updateTestData("DS_AT_RF_139", "Approve Code",
		// SuccessMsg);

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopupOkBtn_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.successPopupOkBtn_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.sendAlertPopup_facilityManagement_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.sendAlertPopup_facilityManagement_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_610 click  approvel and reject screen")
	public void click_approvel_and_reject_screen() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveRejectScreen_FM_610());
		FMS_WifakApplication_Obj.approveRejectScreen_FM_610().click();
	}

	@Given("User_610 enter the retrive data code")
	public void enter_the_retrive_data_code() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.enterCode_InapprovelScreen_610());
		FMS_WifakApplication_Obj.enterCode_InapprovelScreen_610().sendKeys(SuccessMsg2, Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.selectFirstRow_InapprovelScreen_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.selectFirstRow_InapprovelScreen_610());

	}

	@Given("User_{int} click facility application details screen")
	public void user_click_facility_application_details_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityApplicationDetails_InapprovelScreen_610());
		clicksAndActionsHelper
				.clickOnElement(FMS_WifakApplication_Obj.facilityApplicationDetails_InapprovelScreen_610());

	}

	@Given("User_{int} enter cash Margin value in facility application details")
	public void user_enter_cash_margin_value_in_facility_application_details(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.cashMargin_InFacilityAppDetails_approvel_610());
		// clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.cashMargin_InFacilityAppDetails_approvel_610());
		// FMS_WifakApplication_Obj.cashMargin_InFacilityAppDetails_approvel_610().sendKeys(Keys.DELETE);;
		// FMS_WifakApplication_Obj.cashMargin_InFacilityAppDetails_approvel_610().click();
		FMS_WifakApplication_Obj.cashMargin_InFacilityAppDetails_approvel_610().clear();
		FMS_WifakApplication_Obj.cashMargin_InFacilityAppDetails_approvel_610().sendKeys("10");

	}

	@Given("User_{int} click Approve button in facility application details")
	public void user_click_approve_button_in_facility_application_detailsd(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.approvelbutton_InFacilityAppDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approvelbutton_InFacilityAppDetails_610());

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WarningPopupOkBtn_610());
		FMS_WifakApplication_Obj.WarningPopupOkBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup_610());
		// String SuccessMsg =
		// FMS_WifakApplication_Obj.successPopupMessage().getText();
		SuccessMsgFM = FMS_WifakApplication_Obj.successPopupMessage_610().getText().substring(11, 15);
		System.err.println("Reference Number: " + SuccessMsgFM);
		// fmsTransactionsExcelData.updateTestData("DS_AT_RF_139", "Approve Code",
		// SuccessMsg);

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.successPopupOkBtn_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//	        waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.sendAlertPopup());
//  	        for (int i = 0; i < 2000; i++) {
//  	            try {
//  	                FMS_WifakApplication_Obj.sendAlertPopup().click();
//  	                break;
//  	            } catch (Exception e) {
//  	                if (i==1999) {
//  	                    Assert.fail(e.getMessage());
//  	                }
//  	            }
//  	        }

	}

	@Given("User_610 validate the facility application details screen")
	public void validate_the_facility_application_details_screen() {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.facilityApplicationDetails_InapprovelScreen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.facilityApplicationDetails_InapprovelScreen_610());

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InapprovelScreen_610());
//	    	Assert.assertTrue(FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InapprovelScreen().isDisplayed());
		WebElement exceedFacilityAtSublimit = FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InapprovelScreen_610();
		if (exceedFacilityAtSublimit.isSelected()) {
			Assert.assertTrue(true);
		}

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.subjectToFullRepayment_InapprovelScreen_610());
//	    	Assert.assertTrue(FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InapprovelScreen().isDisplayed());
		WebElement subjectToFullRepayment = FMS_WifakApplication_Obj.subjectToFullRepayment_InapprovelScreen_610();
		if (subjectToFullRepayment.isSelected()) {
			Assert.assertTrue(true);
		}

	}

	@Given("User_610 validate the product class screen")
	public void validate_the_product_class_screen() {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.facilityLimitDetails_InapprovelScreen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.facilityLimitDetails_InapprovelScreen_610());

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.productClass_InapprovelScreen_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.productClass_InapprovelScreen_610());

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen_610());
		Assert.assertEquals("10",FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen_610().getAttribute("prevvalue"));

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen_610());
		Assert.assertEquals("10", FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen_610().getAttribute("prevvalue"));

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.closeButton_InapprovelScreen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.closeButton_InapprovelScreen_610());
	}

	@And("User_610 validate the document details screen")
	public void validate_the_document_details_screen() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.documentDetails_InapprovelScreen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.documentDetails_InapprovelScreen_610());

		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.solicitorDateSent_InapprovelScreen_610());
		Assert.assertEquals("15/06/2023", FMS_WifakApplication_Obj.solicitorDateSent_InapprovelScreen_610().getText());
	}

	@And("User_{int} click Draw Down Request screen")
	public void user_click_draw_down_request_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.drawDownRequest_Screen_610());
		FMS_WifakApplication_Obj.drawDownRequest_Screen_610().click();
	}

	@And("User_{int} click Maintenance in Draw Down Request screen")
	public void user_click_maintenance_in_draw_down_request_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.drawDownRequestMaintenance_Screen_610());
		FMS_WifakApplication_Obj.drawDownRequestMaintenance_Screen_610().click();
	}

	@And("User_{int} enter Facility Refercence in Draw Down Request screen")
	public void user_enter_facility_refercence_in_draw_down_request_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityReference_drawDownMainInformation_610());
		FMS_WifakApplication_Obj.facilityReference_drawDownMainInformation_610().sendKeys(SuccessMsgFM, Keys.ENTER);
	}

	@And("User_{int} enter Drawdown Type in Draw Down Request screen")
	public void user_enter_drawdown_type_in_draw_down_request_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.drawdownType_drawDownMainInformation_610());
		FMS_WifakApplication_Obj.drawdownType_drawDownMainInformation_610().sendKeys("1");
	}

	@And("User_{int} enter Description English in Draw Down Request screen")
	public void user_enter_description_english_in_draw_down_request_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.descriptionEnglish_drawDownMainInformation_610());
		FMS_WifakApplication_Obj.descriptionEnglish_drawDownMainInformation_610().sendKeys("abc");
	}

	@And("User_{int} enter Description Arab in Draw Down Request screen")
	public void user_enter_description_arab_in_draw_down_request_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.descriptionArab_drawDownMainInformation_610());
		FMS_WifakApplication_Obj.descriptionArab_drawDownMainInformation_610().sendKeys("xyz");
	}

	@And("User_{int} enter Date Submitted in Draw Down Request screen")
	public void user_enter_date_submitted_in_draw_down_request_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.dateDatesubmitted_drawDownMainInformation_610());
		FMS_WifakApplication_Obj.dateDatesubmitted_drawDownMainInformation_610().sendKeys("5/01/2021");
	}

	@And("User_{int} enter Date ValueDate in Draw Down Request screen")
	public void user_enter_date_value_date_in_draw_down_request_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.valueDatesubmitted_drawDownMainInformation_610());
		FMS_WifakApplication_Obj.valueDatesubmitted_drawDownMainInformation_610().sendKeys("5/01/2021");
	}

	@And("User_{int} click Drawdown Additional Details")
	public void user_click_drawdown_additional_details(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DrawdownAdditionalDetails_Screen_610());
		FMS_WifakApplication_Obj.DrawdownAdditionalDetails_Screen_610().click();
		;
	}

	@And("User_{int}  validate Accepting or not extra amount in FC Amount")
	public void user_validate_accepting_or_not_extra_amount_in_fc_amount(Integer int1) {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.FCAmount_DrawdownAdditionalDetails_Screen_610());        
//	    	Assert.assertEquals(true,FMS_WifakApplication_Obj.FCAmount_DrawdownAdditionalDetails_Screen_610().getAttribute("prevvalue"));
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FCAmount_DrawdownAdditionalDetails_Screen_610());
		String FCAmt = FMS_WifakApplication_Obj.FCAmount_DrawdownAdditionalDetails_Screen_610()
				.getAttribute("prevvalue");
		System.err.println("FC Amount String: " + FCAmt);
		FCAmount = Integer.parseInt(FCAmt);
		System.out.println("Finance Amount: " + FCAmount);

		Assert.assertEquals(true, FinanceAmt < FCAmount);

	}

	// @315144-01 #check flag in param screen

	@And("^User_610 clicks on the parameter module$")
	public void user_clicks_on_the_parameter_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.fmsParamParameter_610());
		FMS_WifakApplication_Obj.fmsParamParameter_610().click();
	}

	@And("^User_610 clicks on the Facility Type feature$")
	public void user_clicks_on_the_facility_type_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.paramFacilityType_610());
		FMS_WifakApplication_Obj.paramFacilityType_610().click();
	}

	@And("^User_610 clicks on the update after approve menu in Facility type$")
	public void user_clicks_on_the_update_after_approve_menu_in_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityTypeUpdateAfterApprove_610());
		FMS_WifakApplication_Obj.facilityTypeUpdateAfterApprove_610().click();
	}

	@And("^User_610 enter the code value in update after approve menu$")
	public void user_enter_the_code_value_in_update_after_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityTypeSearchCode_610());
//		String string = testData.get("Facility Type In Facility Limits");
//		System.err.println(string);
		
		FMS_WifakApplication_Obj.facilityTypeSearchCode_610().sendKeys("369", Keys.ENTER);
		
//		FMS_WifakApplication_Obj.facilityTypeSearchCode_610().sendKeys(testData.get("Facility Type"));
//		FMS_WifakApplication_Obj.facilityTypeSearchCode_610().sendKeys(testData.get("Facility Type In Facility Limits"), Keys.ENTER);
	}

	@And("^User_610 double click on the retrieved data in update after approve menu$")
	public void user_double_click_on_the_retrieved_data_in_update_after_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityTypeSearchCodeResult_610());
		
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.facilityTypeSearchCodeResult_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	@Given("User_{int} double click on the retrieved data third row in update after approve menu")
	public void user_double_click_on_the_retrieved_data_third_row_in_update_after_approve_menu(Integer int1) {
     waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityTypeSearchCodeResultRow3_610());
		
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.facilityTypeSearchCodeResultRow3_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_610 clicks on the facility details tab in update after approve$")
	public void user_clicks_on_the_facility_details_tab_in_update_after_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityTypeFacilityDetails_610());
		FMS_WifakApplication_Obj.facilityTypeFacilityDetails_610().click();
	}

	@And("^User_610 clicks on the STP Facility Requirements option$")
	public void user_clicks_on_the_stp_facility_requirements_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.STPFacilityReq_610());
		FMS_WifakApplication_Obj.STPFacilityReq_610().click();
	}

	@And("^User_610 check the Customer Grading flag$")
	public void user_check_the_customer_grading_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.customerGradingFlag_610());
		WebElement customerGradingFlag = FMS_WifakApplication_Obj.customerGradingFlag_610();
		if (!(customerGradingFlag.isSelected())) {
			customerGradingFlag.click();
		}
	}

	@And("^User_610 check the Overwrite Grading flag$")
	public void user_check_the_overwrite_grading_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.OverwriteGradingFlag_610());
		WebElement overwriteGradingFlag = FMS_WifakApplication_Obj.OverwriteGradingFlag_610();
		if (!(overwriteGradingFlag.isSelected())) {
			overwriteGradingFlag.click();
		}
	}

	@And("^User_610 check the Credit Review flag$")
	public void user_check_the_credit_review_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.creditReviewFlag_610());
		WebElement creditReviewFlag = FMS_WifakApplication_Obj.creditReviewFlag_610();
		FMS_WifakApplication_Obj.creditReviewFlag_610().click();
		if (!(creditReviewFlag.isSelected())) {
			creditReviewFlag.click();
		}
	}

	@And("^User_610 check the Committee Approval flag$")
	public void user_check_the_committee_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.committeeApprovalFlag_610());
		WebElement committeeApprovalFlag = FMS_WifakApplication_Obj.committeeApprovalFlag_610();
		if (!(committeeApprovalFlag.isSelected())) {
			committeeApprovalFlag.click();
		}
	}
	
	@And("^User_610 Uncheck the Committee Approval flag$")
	public void user_uncheck_the_committee_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.committeeApprovalFlag_610());
		WebElement committeeApprovalFlag = FMS_WifakApplication_Obj.committeeApprovalFlag_610();
		if ((committeeApprovalFlag.isSelected())) {
			committeeApprovalFlag.click();
		}
	}

	@And("^User_610 check the Credit Authorization flag$")
	public void user_check_the_credit_authorization_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.creditAuthorzieFlag_610());
		WebElement creditAuthorzieFlag = FMS_WifakApplication_Obj.creditAuthorzieFlag_610();
		if (!(creditAuthorzieFlag.isSelected())) {
			creditAuthorzieFlag.click();
		}
	}
	
	@And("^User_610 Uncheck the Credit Authorization flag$")
	public void user_uncheck_the_credit_authorization_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.creditAuthorzieFlag_610());
		WebElement creditAuthorzieFlag = FMS_WifakApplication_Obj.creditAuthorzieFlag_610();
		if ((creditAuthorzieFlag.isSelected())) {
			creditAuthorzieFlag.click();
		}
	}

	@And("^User_610 check the Issue Facility Offer flag$")
	public void user_check_the_issue_facility_offer_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.issueFacilityOfferFlag_610());
		WebElement issueFacilityOfferFlag = FMS_WifakApplication_Obj.issueFacilityOfferFlag_610();
		if (!(issueFacilityOfferFlag.isSelected())) {
			issueFacilityOfferFlag.click();
		}
	}

	@And("^User_610 check the Client Response flag$")
	public void user_check_the_client_response_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.clientResponseFlag_610());
		WebElement clientResponseFlag = FMS_WifakApplication_Obj.clientResponseFlag_610();
		if (!(clientResponseFlag.isSelected())) {
			clientResponseFlag.click();
		}
	}

	@And("^User_610 check the Document Validation flag$")
	public void user_check_the_document_validation_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.documentValidationFlag_610());
		WebElement documentValidationFlag = FMS_WifakApplication_Obj.documentValidationFlag_610();
		if (!(documentValidationFlag.isSelected())) {
			documentValidationFlag.click();
		}
	}

	@And("^User_610 check the Final Approval flag$")
	public void user_check_the_final_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.finalApprovalFlag_610());
		WebElement finalApprovalFlag = FMS_WifakApplication_Obj.finalApprovalFlag_610();
		if (!(finalApprovalFlag.isSelected())) {
			finalApprovalFlag.click();
		}
	}

	@And("^User_610 check the Create Active Facility If Within Limits flag$")
	public void user_check_the_create_active_facility_if_within_limits_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.createActiveFacilityFlag_610());
		WebElement createActiveFacilityFlag = FMS_WifakApplication_Obj.createActiveFacilityFlag_610();
		if (!(createActiveFacilityFlag.isSelected())) {
			createActiveFacilityFlag.click();
		}
	}

	@And("^User_610 Check the Automatically Approve Facility If Within Limits flag$")
	public void user_check_the_automatically_approve_facility_if_within_limits_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.autoApproveFacilityFlag_610());
		WebElement autoApproveFacilityFlag = FMS_WifakApplication_Obj.autoApproveFacilityFlag_610();
		if (!(autoApproveFacilityFlag.isSelected())) {
			autoApproveFacilityFlag.click();
		}
	}

	@When("^User_610 clicks on the Update button$")
	public void user_clicks_on_the_update_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(FMS_WifakApplication_Obj.updateAfterApproveUpdateBtn_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.updateAfterApproveUpdateBtn_610());
		FMS_WifakApplication_Obj.updateAfterApproveUpdateBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.confirmPopupOkBtn_610());
		FMS_WifakApplication_Obj.confirmPopupOkBtn_610().click();
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopupOkBtn_610());
		FMS_WifakApplication_Obj.successPopupOkBtn_610().click();
	}

	@And("^User_610 after the update go to the Approve menu$")
	public void user_after_the_update_go_to_the_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityTypeApproveMenu_610());
		FMS_WifakApplication_Obj.facilityTypeApproveMenu_610().click();
	}

	@And("^User_610 enter the code value in Approve menu$")
	public void user_enter_the_code_value_in_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveSearchCode_610());
		// FMS_WifakApplication_Obj.approveSearchCode_610().sendKeys(testData.get("Search
		// Code"),Keys.ENTER);
		FMS_WifakApplication_Obj.approveSearchCode_610().sendKeys("369", Keys.ENTER);
	}

	@And("^User_610 double click on the retrieved data in Approve menu$")
	public void user_double_click_on_the_retrieved_data_in_approve_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveSearchCodeResult_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.approveSearchCodeResult_610());
	}

	@When("^User_610 clicks on the Approve button in Approve menu under Facility Type$")
	public void user_clicks_on_the_approve_button_in_approve_menu_under_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityTypeApproveBtn_610());
		
		for (int i = 0; i <= 300; i++) {
			try {
				JavascriptHelper.scrollIntoView(FMS_WifakApplication_Obj.facilityTypeApproveBtn_610());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityTypeApproveBtn_610());
		FMS_WifakApplication_Obj.facilityTypeApproveBtn_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.confirmPopupOkBtn_610());
		FMS_WifakApplication_Obj.confirmPopupOkBtn_610().click();
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopupOkBtn_610());
		FMS_WifakApplication_Obj.successPopupOkBtn_610().click();
	}
	
	//----------------Committee Approval 

	@And("User_{int} select the level3 decision as forward to Approvel Committee")
	public void user_select_the_level3_decision_as_forward_to_approvel_committee(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel3ForwardDecision_610());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel3ForwardDecision_610(), "Forward");
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel3RecommendationCmt_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.approveLevel3RecommendationCmt_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approveLevel3RecommendationCmt_610());
		FMS_WifakApplication_Obj.approveLevel3RecommendationCmt_610().sendKeys("hbv");
	}

	@And("User_{int} click Approval Committee Recommendations Menu")
	public void user_click_approval_committee_recommendations_menu(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
	}

	@And("User_{int} enter facility code in  Approval Committee Recommendations Menu")
	public void user_enter_facility_code_in_approval_committee_recommendations_menu(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		FMS_WifakApplication_Obj.enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610().sendKeys(SuccessMsg, Keys.ENTER);
		
	}
	
	@And("User_{int} enter facility code Approval Committee Recommendations Menu")
	public void user_enter_facility_approval_committee_recommendations_menu(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		FMS_WifakApplication_Obj.enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610().sendKeys(SuccessMsg, Keys.TAB);
		
	}
	

	@Then("User_{int} validate the facility code is displaying in  Approval Committee Recommendations Menu")
	public void user_validate_the_facility_code_is_displaying_in_approval_committee_recommendations_menu(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
		Assert.assertEquals(true,FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610().isDisplayed());
		Thread.sleep(5000);
	//	clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
	}
	
	//--------------------------
	
	@And("User_{int} enter CIF code in  Approval Committee Recommendations Menu")
	public void user_enter_cif_code_in_approval_committee_recommendations_menu(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.enterCIFCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.enterCIFCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.enterCIFCodeIn_ApprovalCommitteeRecommendationsScreen_610());
		FMS_WifakApplication_Obj.enterCIFCodeIn_ApprovalCommitteeRecommendationsScreen_610().sendKeys(testData.get("CIF NO IN Approval Committee"), Keys.ENTER);
		Thread.sleep(5000);
	}

	@Then("User_{int} validate facility with CIF code displaying in  Approval Committee Recommendations Menu")
	public void user_validate_facility_with_cif_code_displaying_in_approval_committee_recommendations_menu(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
		Assert.assertEquals(true,FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610().isDisplayed());
		
		String xpath ="//table[@id='applicationFacilityGridTbl_Id_WIFT002MT']/tbody/tr[2]/td[text()='"+"000000"+SuccessMsg+"']";
		                for (int i = 0; i < 200; i++) {
		                    try {
		                        WebElement Code  = driver.findElement(By.xpath(xpath));
		                        if (Code.isDisplayed()) {
		                            Assert.assertEquals(Code.isDisplayed(), true);
		                            clicksAndActionsHelper.doubleClick(Code);
		                        }
		                        break;
		                    } catch (Exception e) {
		                        if (i==199) {
		                            Assert.fail(e.getMessage());
		                        }
		                    }
		                }
		
	//	clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.ApprovalCommitteeRecommendationsScreen_610());
		
	}
	
	//---------
	
	@And("^User_610 Click on Approval Committee Recommendations in Wifak Application$")
	public void User_609_Click_on_Approval_Committee_Recommendations_in_Wifak_Application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations());
	}
	
//	@And("^User_609 Select the Code in Approval Committee Recommendations$")
//	public void User_609_Select_the_Code_in_Approval_Committee_Recommendations() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Code());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Code());		
//		String ApplicationCode = ApplicationNO;
//		int ApplicationCodelen = 10 - ApplicationCode.length();
//	    for(int i = 1; i <=ApplicationCodelen ; i++){
//	    	ApplicationCode= "0" + ApplicationCode;
//	    }
//	  
//		String xpath ="//table[@id='applicationFacilityGridTbl_Id_WIFT002MT']/tbody/tr[2]/td[text()='"+ApplicationCode+"']";
//		for (int i = 0; i < 200; i++) {
//			try {
//				WebElement Code  = driver.findElement(By.xpath(xpath));
//				if (Code.isDisplayed()) {
//					Assert.assertEquals(Code.isDisplayed(), true);
//					clicksAndActionsHelper.doubleClick(Code);
//				}
//				break;
//			} catch (Exception e) {
//				if (i==199) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//	}
	
	@And("^User_610 Click Recommend button in Approval Committee Recommendations$")
	public void User_609_Click_Recommend_button_in_Approval_Committee_Recommendations() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Recommend());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Recommend());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityAlreadyCreatedPopup_610());
		FMS_WifakApplication_Obj.facilityAlreadyCreatedPopup_610().click();
	}

	@And("^User_610 Select the decision in Approval Committee Recommendations$")
	public void User_609_Select_the_decision_in_Approval_Committee_Recommendations() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ApprovalCommitteesRecommendationPopup_610());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.selectUserJAY_ApprovalCommitteesRecommendationPopup_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.selectUserJAY_ApprovalCommitteesRecommendationPopup_610());
		
		//User = fmsLoginExceldata.getTestdata("FMS_User11");	
	//	(//table[@id='ApplicationFacilityRecommendationGrid_WIFT002MT']//td[text()='JAY'])[1]
//		String RecommendedBy = "(//table[@id='ApplicationFacilityRecommendationGrid_WIFT002MT']//td[text()='"+"JAY"+"'])[1]";
//		WebElement RecommendedBy_user = driver.findElement(By.xpath(RecommendedBy));
//		RecommendedBy_user.click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation(), testData.get("Committee Recommendations"));
	}
	
	
	
	@And("User_{int} Enter the comments in Approval Committee Recommendations")
	public void user_enter_the_comments_in_approval_committee_recommendations(Integer int1) throws Throwable {
		
		String num="0123456789", comments="";
		for (int i = 1 ;i<=30;i++ ) {
			comments=comments+num;
					}
		System.err.println(comments);
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.enterCMT_UserJAY_ApprovalCommitteesRecommendationPopup_610());
	//	clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.enterCMT_UserJAY_ApprovalCommitteesRecommendationPopup_610());
		FMS_WifakApplication_Obj.enterCMT_UserJAY_ApprovalCommitteesRecommendationPopup_610().sendKeys(comments,Keys.TAB);
		Thread.sleep(5000);
	}
	
	@And("^User_610 Click on Ok in Approval Committee Recommendations$")
	public void User_609_Click_on_Ok_in_Approval_Committee_Recommendations() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok());
		
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup_610());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.successPopupOkBtn_610().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		}
	
	//---Authorize Reject Application
	
	@And("User_{int} Click Authorize Reject Application For Financial Facilities screen")
	public void user_click_authorize_reject_application_for_financial_facilities_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.AuthorizeRejectApplicationForFinancialFacilitiesscreen_610());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.AuthorizeRejectApplicationForFinancialFacilitiesscreen_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_{int} retrive the first data in Authorize Reject Application For Financial Facilities screen")
	public void user_retrive_the_first_data_in_authorize_reject_application_for_financial_facilities_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Enter_ValidateCode_AuthorizeRejectApplication_610());
	    FMS_WifakApplication_Obj.Enter_ValidateCode_AuthorizeRejectApplication_610().sendKeys(SuccessMsg, Keys.ENTER);

	waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.ClickTheValue_AuthorizeRejectApplication_610());
	clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.ClickTheValue_AuthorizeRejectApplication_610());
	}

	@And("User_{int} Click Approval Committiees button in Authorize Reject Application For Financial Facilities screen")
	public void user_click_approval_committiees_button_in_authorize_reject_application_for_financial_facilities_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approvalcommittieeskey_AuthorizeRejectApplication_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approvalcommittieeskey_AuthorizeRejectApplication_610());
		
	}

	@And("User_{int} Validate the Approval Committee Recommendations comments displayed or not in Authorize Reject screen")
	public void user_validate_the_approval_committee_recommendations_comments_displayed_or_not_in_authorize_reject_screen(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.enterCMT_UserJAY_AuthorizeRejectApplication_610());
		for (int i = 0; i < 200; i++) {
			try {
				if (FMS_WifakApplication_Obj.enterCMT_UserJAY_AuthorizeRejectApplication_610().isDisplayed()) {
					clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.enterCMT_UserJAY_AuthorizeRejectApplication_610());
					Assert.assertEquals(!(FMS_WifakApplication_Obj.enterCMT_UserJAY_AuthorizeRejectApplication_610().getAttribute("title").isBlank()),true);
					break;
				}
			
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		Thread.sleep(5000);
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.closeIcon_AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610());
		for (int i = 0; i < 200; i++) {
			try {
				if (FMS_WifakApplication_Obj.closeIcon_AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610().isDisplayed()) {
					clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.closeIcon_AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610());
					Thread.sleep(5000);
					break;
				}
				
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	//-----------------application for ff search nd retrive data
	
	@And("User_{int} search and retrive the first data in Application for financial facilities screen")
	public void user_search_and_retrive_the_first_data_in_application_for_financial_facilities_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.searchbutton_ApplicationForFinancialFacilities_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.searchbutton_ApplicationForFinancialFacilities_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.searchbutton_ApplicationForFinancialFacilities_610());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.searchCode_ApplicationForFinancialFacilities_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.searchCode_ApplicationForFinancialFacilities_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.searchCode_ApplicationForFinancialFacilities_610());
		FMS_WifakApplication_Obj.searchCode_ApplicationForFinancialFacilities_610().sendKeys(SuccessMsg2,Keys.ENTER);
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.retriveFirstRow_ApplicationForFinancialFacilities_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.retriveFirstRow_ApplicationForFinancialFacilities_610());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.retriveFirstRow_ApplicationForFinancialFacilities_610());
		
//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approvalcommittieeskey_ApplicationForFinancialFacilities_610());
//		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.approvalcommittieeskey_ApplicationForFinancialFacilities_610());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approvalcommittieeskey_ApplicationForFinancialFacilities_610());
	}
	
	//----------------Repayment plan
	
	@And("User_{int} Click Yes Create Tentative Schedule Popup In Repayment Plan")
	public void user_click_yes_create_tentative_schedule_popup_in_repayment_plan(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.createTentativeSchedulePopup_InRepaymentPlan_610());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.createTentativeSchedulePopupYes_InRepaymentPlan_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.createTentativeSchedulePopupYes_InRepaymentPlan_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.createTentativeSchedulePopupYes_InRepaymentPlan_610());
	}

	@And("User_{int} Click Print Schedule In Repayment Plan")
	public void user_click_print_schedule_in_repayment_plan(Integer int1) {
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ScheduleDetailsMenu_InRepaymentPlan_610());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.clickPrintSchedule_InRepaymentPlan_610());
		
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.clickPrintSchedule_InRepaymentPlan_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
			}
	}

	@Then("User_{int} Validate the printing repayment plan Working or Not")
	public void user_validate_the_printing_repayment_plan_working_or_not(Integer int1) throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ReportDataIsGeneratedPopup_InRepaymentPlan_610());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WarningPopupOkBtn_610());
		FMS_WifakApplication_Obj.WarningPopupOkBtn_610().click();
		Thread.sleep(5000);
	}

	
	@And("User_{int} Close the repayment Tab")
	public void user_close_the_repayment_tab(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.RemoveTab_InRepaymentPlan_610());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.RemoveTab_InRepaymentPlan_610());
		FMS_WifakApplication_Obj.RemoveTab_InRepaymentPlan_610().click();
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.confirmRemoveTab_InRepaymentPlan_610());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.okButton_610());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.okButton_610());
		FMS_WifakApplication_Obj.okButton_610().click();
	}

	@And("User_{int} delete product class value")
	public void user_delete_product_class_value(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.deleteButtonIcon_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.deleteButtonIcon_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.deleteButtonIcon_610());
	}

	//----approvel 1 limit nd repayment 
	
	@And("User_{int} Validate the Schedule Details displaying or Not")
	public void user_validate_the_schedule_details_displaying_or_not(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approvel1_LimitsDetails_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.approvel1_LimitsDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approvel1_LimitsDetails_610());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approvel1_RepaymentPlan_btn_In_LimitsDetails_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.approvel1_RepaymentPlan_btn_In_LimitsDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approvel1_RepaymentPlan_btn_In_LimitsDetails_610());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approvel1_ScheduleDetails_In_LimitsDetails_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.approvel1_ScheduleDetails_In_LimitsDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approvel1_ScheduleDetails_In_LimitsDetails_610());
		
		Assert.assertEquals(true, FMS_WifakApplication_Obj.approvel1_ScheduleDetails_In_LimitsDetails_610().isDisplayed());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approvel1_CloseIcon_ScheduleDetails_In_LimitsDetails_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.approvel1_CloseIcon_ScheduleDetails_In_LimitsDetails_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approvel1_CloseIcon_ScheduleDetails_In_LimitsDetails_610());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approvel1_MainInformation_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.approvel1_MainInformation_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.approvel1_MainInformation_610());
	}
	
	//---------
	
	@And("User_{int} Enter Floating Rate in limit Detail")
	public void user_enter_floating_rate_in_limit_detail(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.FloatingRateinlimitDetail_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.FloatingRateinlimitDetail_610());
		FMS_WifakApplication_Obj.FloatingRateinlimitDetail_610().sendKeys(testData.get("Floating Rate"));
		
	}

	@And("User_{int} Enter Floating Rate Periodicity in limit Detail")
	public void user_enter_floating_rate_periodicity_in_limit_detail(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.FloatingRateinlimitDetail_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.FloatingRateinlimitDetail_610());
		FMS_WifakApplication_Obj.FloatingRateinlimitDetail_610().sendKeys(testData.get("Floating Rate Periodicity"));
	}

	@And("User_{int} Enter Floating Rate Periodicity Type in limit Detail")
	public void user_enter_floating_rate_periodicity_type_in_limit_detail(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.FloatingRatePeriodicityTypeinlimitDetail_610());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.FloatingRatePeriodicityTypeinlimitDetail_610(),testData.get("Floating Rate Periodicity Type"));
	}
}
