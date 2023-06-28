package stepdefinitions;

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
	
	ExcelData  DrawDownPayment = new ExcelData(path, "DrawDownPayment_TestData", "DataSet ID");
	
	@And("User_610 get the test data set id for AT_DDR_083")
	public void get_the_test_data_set_id_for_at_ddr_083() {
		testData = DrawDownPayment.getTestdata("DS01_1105454");
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

	@And("User_610 get the test data set id for AT_AFF_037")
	public void get_the_test_data_set_id_for_at_aff_037() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_870478");
	}
	
	@And("User_610 get the test data set id for AT_RF_012")
	public void get_the_test_data_set_id_for_at_at_rf_012() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_665893");
	}

	@And("User_610 get the test data set id for AT_RF_074")
	public void get_the_test_data_set_id_for_at_at_at_rf_074() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_592970");
	}
	
	@And("User_610 get the test data set id for AT_RF_011")
	public void get_the_test_data_set_id_for_at_at_rf_011() {
		testData = fmsTransactionsExcelData.getTestdata("DS01_592279");
	}
	
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
	public void click_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.getApplication_for_financial_facilities_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getApplication_for_financial_facilities_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getApplication_for_financial_facilities_610());
	}

	@And("^User_610 Click Maintenance$")
	public void click_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getMaintenance_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getMaintenance_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getMaintenance_610());
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
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_TotalValue());
	//	clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_TotalValue());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_TotalValue());
		FMS_WifakApplication_Obj.getEnter_TotalValue().sendKeys(testData.get("Total value"));
		FMS_WifakApplication_Obj.getEnter_TotalValue().sendKeys(Keys.TAB);
				
				
		String TotalValue = FMS_WifakApplication_Obj.getEnter_TotalValue().getAttribute("prevvalue");
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
	public void click_add_button_on_limit_detail() throws Throwable {
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

	@And("^Click Second Add button on limit Detail$")
	public void click_second_add_button_on_limit_detail() throws Throwable {
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

	@And("^Click third Add button on limit Detail$")
	public void click_third_add_button_on_limit_detail() throws Throwable {
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

	@And("^Click Fourth Add button on limit Detail$")
	public void click_fourth_add_button_on_limit_detail() throws Throwable {
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
	public void enter_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		// FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class().sendKeys("1");
		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys(testData.get("Product Class"));
		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys(Keys.TAB);
		// Thread.sleep(10000);

	}
	
	@And("User_{int} Enter down Payment amount")
	public void user_enter_total_down_payment(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails());
		
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		 FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails().clear();
		 FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails().sendKeys(testData.get("Total Down Payment"));
		 FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails().sendKeys(Keys.TAB);
		 
		 Thread.sleep(10000);
		 
		 String downPaymentAnount_InLimitsDetails = FMS_WifakApplication_Obj.downPaymentAnount_InLimitsDetails().getAttribute("prevvalue").toString().replace(",","").split("[.]")[0];
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
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.TotalFacilityValue_InLImitDetails_SubMenu());
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
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.downPayment_InAdditionalDetails());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.downPayment_InAdditionalDetails());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		 FMS_WifakApplication_Obj.downPayment_InAdditionalDetails().sendKeys(testData.get("Down Payment"));
		 FMS_WifakApplication_Obj.downPayment_InAdditionalDetails().sendKeys(Keys.TAB);
		 Thread.sleep(6000);
		 
		    String downpayment = FMS_WifakApplication_Obj.downPayment_InAdditionalDetails().getAttribute("prevvalue");
		//	System.err.println("downpayment: " + downpayment);
			downPayment = Integer.parseInt(downpayment);
			System.err.println("downPayment: " + downPayment);
		 
	//	FMS_WifakApplication_Obj.downPayment_InAdditionalDetails().sendKeys(testData.get("Product Class"));
	}

	

	@And("^Enter Facility Value$")
	public void enter_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
		// Thread.sleep(50000);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
				FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^Enter second ValueOn Facility Value$")
	public void enter_second_valueon_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().clear();
		// Thread.sleep(6000);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
				FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^Enter third ValueOn Facility Value$")
	public void enter_third_valueon_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().clear();
		// Thread.sleep(6000);
		// FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {

				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
				FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^Enter Fourth ValueOn Facility Value$")
	public void enter_fourth_valueon_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
		FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys("2000");
//		
//		for (int i = 0; i < 200; i++) {
//			try {
//				
//				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue());
//				FMS_WifakApplication_Obj.Enter_ValueOn_FacilityValue().sendKeys("2000");
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
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
	}

	@And("^Enter the second value on  Purpose Of Finacing$")
	public void enter_the_second_value_on_purpose_of_finacing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
	}

	@And("^Enter the third value on  Purpose Of Finacing$")
	public void enter_the_third_value_on_purpose_of_finacing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
	}

	@And("^Enter the Fourth value on  Purpose Of Finacing$")
	public void enter_the_fourth_value_on_purpose_of_finacing() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing());
		FMS_WifakApplication_Obj.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
	}

	@And("^Enter second ValueOn Product Class$")
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

	@And("^Enter third ValueOn Product Class$")
	public void enter_third_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys("1");
	}

	@And("^Enter Fourth ValueOn Product Class$")
	public void enter_fourth_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610());
		FMS_WifakApplication_Obj.getEnter_ValueOn_Product_Class_610().sendKeys("1");
	}

	@And("^Click Search Button In Account No$")
	public void click_search_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_Search_Button_Account_No());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Search_Button_Account_No());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Search_Button_Account_No());
	}

	@And("^Enter Double Click Search Account No$")
	public void enter_double_click_search_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Double_Click_Search_Account_No());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Double_Click_Search_Account_No());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.Double_Click_Search_Account_No());
		Thread.sleep(300000);
	}

	@And("^AfterEnter ValueOn Product Class Search$")
	public void afterenter_valueon_product_class_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.getAfterEnter_ValueOn_Product_Class_Search());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getAfterEnter_ValueOn_Product_Class_Search());
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

	@Then("Validate how many product class in limits details")
	public void validate_how_many_product_class_in_limits_details() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.TableHead_LimitDetails());
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

	@And("^Click Fixed Assert button$")
	public void click_fixed_assert_button() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// FMS_WifakApplication_Obj.getClick_FixedAssert_Button());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getClick_FixedAssert_Button());
		// clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_FixedAssert_Button());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_FixedAssert_Button());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Click AddButton On FixedAssert screen$")
	public void click_addbutton_on_fixedassert_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.getClick_AddButton_OnFixedAssert_screen());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getClick_AddButton_OnFixedAssert_screen());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getClick_AddButton_OnFixedAssert_screen());
	}

	@And("^Enter value on Catagory$")
	public void enter_value_on_catagory() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// FMS_WifakApplication_Obj.getEnter_value_on_Catagory());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_Catagory());
		// clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_Catagory());
		// FMS_WifakApplication_Obj.getEnter_value_on_Catagory().sendKeys("1");;

		for (int i = 0; i < 300; i++) {

			try {
				FMS_WifakApplication_Obj.Click_value_1_on_Catagory().click();

//					FMS_WifakApplication_Obj.getEnter_value_on_Catagory().click();
				FMS_WifakApplication_Obj.getEnter_value_on_Catagory().sendKeys("1");
				FMS_WifakApplication_Obj.getEnter_value_on_Catagory().sendKeys(Keys.TAB);
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

	@And("^Enter value on Class$")
	public void enter_value_on_class() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_Class());
//		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_Class());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_Class());
//		FMS_WifakApplication_Obj.getEnter_value_on_Class().sendKeys("1234");

		for (int i = 0; i < 300; i++) {

			try {
				FMS_WifakApplication_Obj.Click_value_1_on_Catagory().click();

//				FMS_WifakApplication_Obj.getEnter_value_on_Catagory().click();
				FMS_WifakApplication_Obj.getEnter_value_on_Class().sendKeys("1234");
				FMS_WifakApplication_Obj.getEnter_value_on_Class().sendKeys(Keys.TAB);
				break;

			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(5000);

	}

	@And("^Enter value on vendor$")
	public void enter_value_on_vendor() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_vendor());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_vendor());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_vendor());
		FMS_WifakApplication_Obj.getEnter_value_on_vendor().sendKeys("1");
	}

	@And("^Enter value on quantity$")
	public void enter_value_on_quantity() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_quantity());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_quantity());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_quantity());
		FMS_WifakApplication_Obj.getEnter_value_on_quantity().sendKeys("1");
	}

	@And("^Enter value on Unit$")
	public void enter_value_on_unit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_Unit());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_Unit());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_Unit());
		FMS_WifakApplication_Obj.getEnter_value_on_Unit().sendKeys("1");
	}

	@And("^Enter value on Cy$")
	public void enter_value_on_cy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_Cy());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_Cy());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_Cy());
		FMS_WifakApplication_Obj.getEnter_value_on_Cy().sendKeys("999");
	}

	@And("^Enter value on UnitCost$")
	public void enter_value_on_unitcost() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getEnter_value_on_UnitCost());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getEnter_value_on_UnitCost());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getEnter_value_on_UnitCost());
		FMS_WifakApplication_Obj.getEnter_value_on_UnitCost().sendKeys("11");
	}

	@And("^Enter value on Vat Code$")
	public void enter_value_on_vat_code() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper.scrollIntoView(FMS_WifakApplication_Obj.Enter_value_on_Vat_Code());
				clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_value_on_Vat_Code());
				FMS_WifakApplication_Obj.Enter_value_on_Vat_Code().click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	// -----------------------------------------------------

	@And("^Enter Currency Button In Account No$")
	public void enter_currency_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Currency__Button_In_Account_No());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Currency__Button_In_Account_No());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Currency__Button_In_Account_No());
		FMS_WifakApplication_Obj.Currency__Button_In_Account_No().sendKeys("840");
		// Thread.sleep(3000);
	}

	@And("^Enter GLCode Button In Account No$")
	public void enter_glcode_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.GLCode__Button_In_Account_No());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.GLCode__Button_In_Account_No());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.GLCode__Button_In_Account_No());
		FMS_WifakApplication_Obj.GLCode__Button_In_Account_No().sendKeys("10001");
		// Thread.sleep(3000);
	}

	@And("^Enter Serial Button In Account No$")
	public void enter_serial_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Serial__Button_In_Account_No());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Serial__Button_In_Account_No());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Serial__Button_In_Account_No());
		FMS_WifakApplication_Obj.Serial__Button_In_Account_No().sendKeys("1");
		// Thread.sleep(3000);
	}

	@And("^Enter Account Number$")
	public void enter_account_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Enter_Account_Number());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Enter_Account_Number());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_Account_Number());
		FMS_WifakApplication_Obj.Enter_Account_Number().sendKeys("84001000100000727001");
	}

	@And("^User Click Charges Details$")
	public void user_click_charges_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_Charges_Details());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Charges_Details());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Charges_Details());
	}

	@And("^User Check Flag In Collect At Fac Approvel$")
	public void user_check_flag_in_collect_at_fac_approvel() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Click_1_In_Charges_Details());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_1_In_Charges_Details());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_1_In_Charges_Details());

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Check_Flag_In_Collect_At_Fac_Approvel());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Check_Flag_In_Collect_At_Fac_Approvel());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Check_Flag_In_Collect_At_Fac_Approvel());
	}

	@And("^User Click Ok Button In Collect At Fac Approvel$")
	public void user_click_ok_button_in_collect_at_fac_approvel() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Click_Ok_Button_In_Collect_At_Fac_Approvel());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Click_Ok_Button_In_Collect_At_Fac_Approvel());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_Ok_Button_In_Collect_At_Fac_Approvel());
	}

	@And("^Click Save Button After Collect At Fac Approvel Give Ok$")
	public void click_save_button_after_collect_at_fac_approvel_give_ok() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
	}

	@And("^Click Ok Button In Waring Screen$")
	public void click_Ok_Button_In_Waring_Screen_610() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
	}

	@And("^Click OK In Button Sucess Screen$")
	public void click_ok_in_button_sucess_screen() throws Throwable {
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
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name());
//			clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name());

		for (int i = 0; i < 1000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name_610());
				// FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name().sendKeys("1");
				FMS_WifakApplication_Obj.EnterTheValue_Estimator_Name_610().sendKeys(testData.get("Estimator Name"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
		Thread.sleep(5000);
	}

	@And("^Click Save Button After Document Details$")
	public void click_save_button_after_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_OnLimitDetail_610());
	}

	@And("^Click Ok Button In Waring Screen Document Details$")
	public void click_Ok_Button_In_Waring_Screen_610_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Waring_OnLimitDetails_Tab());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Validate_Warning_ConfirmValidateProcess());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_Warning_ConfirmValidateProcess());

		for (int i = 0; i < 2000; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// FMS_WifakApplication_Obj.Validate_Warning_ConfirmValidateProcess());
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Waring_OnLimitDetails_Tab());
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("Click OK Button In Confirm Already Created IN Document Details")
	public void click_ok_button_in_confirm_already_created_in_document_details() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Validate_Confirm_alreadyCreated());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Validate_Confirm_alreadyCreated());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_Confirm_alreadyCreated());

		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_Confirm_alreadyCreated());
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
				FMS_WifakApplication_Obj.Validate_Success_ValidateSuccessfull());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Validate_Success_ValidateSuccessfull());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_Success_ValidateSuccessfull());

		for (int i = 0; i < 2000; i++) {
			try {

				clicksAndActionsHelper
						.clickOnElement(FMS_WifakApplication_Obj.Validate_Success_ValidateSuccessfull());
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@Then("Click Dismiss Button In Send Alert Popup")
	public void click_dismiss_button_in_send_alert_popup() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss());

		for (int i = 0; i < 2000; i++) {
			try {
				// waitHelper.waitForElementwithFluentwait(driver,
				// FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss());
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Validate_SendAlert_Dismiss());
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("^Click OK  Button In Sucess Screen Document Details$")
	public void click_Ok_Button_In_Sucess_Screen_610_document_details() throws Throwable {
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

//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.limitDetailsValidateBtn());
//		FMS_WifakApplication_Obj.limitDetailsValidateBtn().click();
//
//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SeverReruest_Popup());
//		for (int i = 0; i < 2000; i++) {
//			try {
//				if (FMS_WifakApplication_Obj.SeverReruest_Popup().isDisplayed()) {
//					FMS_WifakApplication_Obj.ServerReuestOK().click();
//				}
//				break;
//			} catch (Exception e) {
//				if (i == 1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.limitDetailsValidateBtn());
		FMS_WifakApplication_Obj.limitDetailsValidateBtn().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WarningPopupOkBtn());
		FMS_WifakApplication_Obj.WarningPopupOkBtn().click();

		// Facility already created popup
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.confirmPopup());
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityAlreadyCreatedPopup_610());
		FMS_WifakApplication_Obj.facilityAlreadyCreatedPopup_610().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup());
		// String SuccessMsg =
		// FMS_WifakApplication_Obj.successPopupMessage().getText();
		SuccessMsg = FMS_WifakApplication_Obj.successPopupMessage().getText().substring(23, 27);
		System.err.println("Reference Number: " + SuccessMsg);
		// fmsTransactionsExcelData.updateTestData("DS_AT_RF_139", "Approve Code",
		// SuccessMsg);

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup());
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
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.sendAlertPopup());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.sendAlertPopup().click();
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

	@Then("^Enter Holiday Date In Expiratin date in additional Details$")
	public void enter_holiday_date_in_expiratin_date_in_additional_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.Expiratin_date_additional_Details());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Expiratin_date_additional_Details());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Expiratin_date_additional_Details());
		FMS_WifakApplication_Obj.Expiratin_date_additional_Details().sendKeys(testData.get("Expire Date"));
		FMS_WifakApplication_Obj.Expiratin_date_additional_Details().sendKeys(Keys.TAB);
	}

	@Then("Validate holiday day allow or not")
	public void validate_holiday_day_allow_or_not() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.validate_holidayDate());
		Assert.assertTrue(FMS_WifakApplication_Obj.validate_holidayDate().isDisplayed());
	}

	@And("^Confirm the Requested Holiday date$")
	public void confirm_the_requested_holiday_date() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date());
	}

	@Then("^Enter Holiday date in Expected Payment Date in Limit Details SubMenu$")
	public void enter_holiday_date_in_expected_payment_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu());
		FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu().sendKeys(testData.get("Expected Payment Date"));
		FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu().sendKeys(Keys.TAB);
	}

	@And("^Confirm the Requested Holiday date in Limit Details SubMenu$")
	public void confirm_the_requested_holiday_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
		clicksAndActionsHelper
				.clickOnElement(FMS_WifakApplication_Obj.Confirm_theRequested_Holiday_date_In_LimitsDetails());
	}

	// ---------------

	// -------- 592279 TSR- SUPT170522 - Label missing limit Details

	@Then("^User_610 Check The Level Of Product Class In LImit Details SubMenu$")
	public void check_the_level_of_product_class_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ProductClass_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ProductClass_InLImitDetails_SubMenu());
		// clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate());
		// FMS_WifakApplication_Obj.Enter_Previous_dataIn_MaturityDate().sendKeys("04/01/2021");
		Assert.assertEquals(true, FMS_WifakApplication_Obj.ProductClass_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Case Non Case In LImit Details SubMenu$")
	public void check_the_level_of_case_non_case_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.CaseNonCase_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CaseNonCase_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CaseNonCase_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Exchange Rate In LImit Details SubMenu$")
	public void check_the_level_of_exchange_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ExchangeRate_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ExchangeRate_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.ExchangeRate_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Down Payment Percentage In LImit Details SubMenu$")
	public void check_the_level_of_down_payment_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DownPaymentPercentage_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.DownPaymentPercentage_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.DownPaymentPercentage_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Details Down Payment To Vendor Percentage In LImit Details SubMenu$")
	public void check_the_level_of_details_down_payment_to_vendor_percentage_in_limit_details_submenu()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DownPaymentToVendorPerc_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.DownPaymentToVendorPerc_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.DownPaymentToVendorPerc_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Total Down Payment Percentage In LImit Details SubMenu$")
	public void check_the_level_of_total_down_payment_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TotalDownPaymentPerc_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TotalDownPaymentPerc_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.TotalDownPaymentPerc_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Total Facility Value In LImit Details SubMenu$")
	public void check_the_level_of_total_facility_value_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TotalFacilityValue_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TotalFacilityValue_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.TotalFacilityValue_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Items In LImit Details SubMenu$")
	public void check_the_level_of_items_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Items_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Items_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Items_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Type In LImit Details SubMenu$")
	public void check_the_level_of_type_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Type_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Type_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Type_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Facility Value In LImit Details SubMenu$")
	public void check_the_level_of_facility_value_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FacilityValue_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FacilityValue_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.FacilityValue_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of CV Value In LImit Details SubMenu$")
	public void check_the_level_of_cv_value_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.CvValue_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CvValue_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CvValue_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Down Payment AmountIn LImit Details SubMenu$")
	public void check_the_level_of_down_payment_amountin_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Down Payment To Vendor Amt In LImit Details SubMenu$")
	public void check_the_level_of_down_payment_to_vendor_amt_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DownPaymentToVendorAmt_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.DownPaymentToVendorAmt_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.DownPaymentToVendorAmt_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  Total Down Payment In LImit Details SubMenu$")
	public void check_the_level_of_total_down_payment_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TotalDownPayment_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TotalDownPayment_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TotalDownPayment_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Value Date In LImit Details SubMenu$")
	public void check_the_level_of_value_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ValueDate_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ValueDate_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.ValueDate_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Maturity Date In LImit Details SubMenu$")
	public void check_the_level_of_maturity_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Maturity_Date_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Maturity_Date_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Maturity_Date_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of  Status In LImit Details SubMenu$")
	public void check_the_level_of_status_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.status_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.status_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.status_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of  Account No In LImit Details SubMenu$")
	public void check_the_level_of_account_no_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.AccountNo_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.AccountNo_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.AccountNo_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of  Account Name In LImit Details SubMenu$")
	public void check_the_level_of_account_name_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.AccountName_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.AccountName_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.AccountName_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of TFA Margin Rate_In LImit Details SubMenu$")
	public void check_the_level_of_tfa_margin_ratein_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TFAMarginRate_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TFAMarginRate_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TFAMarginRate_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Sub Eco Sector In LImit Details SubMenu$")
	public void check_the_level_of_sub_eco_sector_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.SubEcoSector_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SubEcoSector_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.SubEcoSector_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Discounting Margin percentage In LImit Details SubMenu$")
	public void check_the_level_of_discounting_margin_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DiscountingMarginPer_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DiscountingMarginPer_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.DiscountingMarginPer_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Payment Method In LImit Details SubMenu$")
	public void check_the_level_of_payment_method_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.PaymentMethod_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.PaymentMethod_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.PaymentMethod_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Installment Amount In LImit Details SubMenu$")
	public void check_the_level_of_installment_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.InstallmentAmount_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.InstallmentAmount_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.InstallmentAmount_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Security Deposit Amount In LImit Details SubMenu$")
	public void check_the_level_of_security_deposit_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.SecurityDepositAmount_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.SecurityDepositAmount_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.SecurityDepositAmount_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Cap Rate In LImit Details SubMenu$")
	public void check_the_level_of_cap_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.CapRate_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CapRate_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CapRate_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of floor Rate Method In LImit Details SubMenu$")
	public void check_the_level_of_floor_rate_method_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.floorRateMethod_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.floorRateMethod_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.floorRateMethod_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Credit Spread In LImit Details SubMenu$")
	public void check_the_level_of_credit_spread_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.CreditSpread_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CreditSpread_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CreditSpread_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Sublimit Lower Limit Amount In LImit Details SubMenu$")
	public void check_the_level_of_sublimit_lower_limit_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.SublimitLowerLimitAmount_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.SublimitLowerLimitAmount_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.SublimitLowerLimitAmount_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Expected Payment Date In LImit Details SubMenu$")
	public void check_the_level_of_expected_payment_date_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.ExpectedPaymenDate_inLimitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Checking On In LImit Details SubMenu$")
	public void check_the_level_of_checking_on_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.CheckingOn_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CheckingOn_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CheckingOn_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Fund Transfer Rate In LImit Details SubMenu$")
	public void check_the_level_of_fund_transfer_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FundTransferRate_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FundTransferRate_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.FundTransferRate_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Eco Sector In LImit Details SubMenu$")
	public void check_the_level_of_eco_sector_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.EcoSector_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.EcoSector_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.EcoSector_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of TFAT enure Days In LImit Details SubMenu$")
	public void check_the_level_of_tfat_enure_days_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TFATenureDays_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TFATenureDays_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TFATenureDays_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Remarks In LImit Details SubMenu$")
	public void check_the_level_of_remarks_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Remarks_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Remarks_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Remarks_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Purpose of financing In LImit Details SubMenu$")
	public void check_the_level_of_purpose_of_financing_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Purposeoffinancing_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Purposeoffinancing_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.Purposeoffinancing_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of No of Installments In LImit Details SubMenu$")
	public void check_the_level_of_no_of_installments_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.NoofInstallments_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.NoofInstallments_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.NoofInstallments_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Amended Security Deposit Amount In LImit Details SubMenu$")
	public void check_the_level_of_amended_security_deposit_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.AmendedSecurityDepositAmount_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of selling price In LImit Details SubMenu$")
	public void check_the_level_of_selling_price_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.selling_price_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.selling_price_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.selling_price_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Floor Rate Percentage In LImit Details SubMenu$")
	public void check_the_level_of_floor_rate_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FloorRatePercentage_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FloorRatePercentage_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.FloorRatePercentage_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Sublimit Lower Limit Percentage In LImit Details SubMenu$")
	public void check_the_level_of_sublimit_lower_limit_percentage_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.SublimitLowerLimitPerc_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.SublimitLowerLimitPerc_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.SublimitLowerLimitPerc_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Clean Flag In LImit Details SubMenu$")
	public void check_the_level_of_clean_flag_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.CleanFlag_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CleanFlag_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CleanFlag_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Revolving One Off In LImit Details SubMenu$")
	public void check_the_level_of_revolving_one_off_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.RevolvingOneOff_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.RevolvingOneOff_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.RevolvingOneOff_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Penalty On Due Amount In LImit Details SubMenu$")
	public void check_the_level_of_penalty_on_due_amount_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.PenaltyOnDueAmount_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.PenaltyOnDueAmount_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.PenaltyOnDueAmount_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of charges type In LImit Details SubMenu$")
	public void check_the_level_of_charges_type_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.chargestype_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.chargestype_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.chargestype_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of PPR In LImit Details SubMenu$")
	public void check_the_level_of_ppr_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of BUDGET ALLOCATION In LImit Details SubMenu$")
	public void check_the_level_of_budget_allocation_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.PPR_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of comments and conditions In LImit Details SubMenu$")
	public void check_the_level_of_comments_and_conditions_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.comments_and_conditions_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.comments_and_conditions_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.comments_and_conditions_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Maximum Tenure Periodicity No key In LImit Details SubMenu$")
	public void check_the_level_of_maximum_tenure_periodicity_no_key_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Minimum Tenure Periodicity No In LImit Details SubMenu$")
	public void check_the_level_of_minimum_tenure_periodicity_no_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Maximum Tenure for financing PeriodicityNo key In LImit Details SubMenu$")
	public void check_the_level_of_maximum_tenure_for_financing_periodicityno_key_in_limit_details_submenu()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(
				FMS_WifakApplication_Obj.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj
				.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Floating Rate In LImit Details SubMenu$")
	public void check_the_level_of_floating_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FloatingRate_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.FloatingRate_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.FloatingRate_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Floating Rate Periodi city Type In LImit Details SubMenu$")
	public void check_the_level_of_floating_rate_periodi_city_type_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FloatingRatePeriodicityType_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.FloatingRatePeriodicityType_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.FloatingRatePeriodicityType_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Total Yield In LImit Details SubMenu$")
	public void check_the_level_of_total_yield_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TotalYield_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TotalYield_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TotalYield_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of  limit lip start dat In LImit Details SubMenu$")
	public void check_the_level_of_limit_lip_start_dat_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.limitlipstartdate_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.limitlipstartdate_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.limitlipstartdate_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of zero entry cost In LImit Details SubMenu$")
	public void check_the_level_of_zero_entry_cost_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.zeroentrycost_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.zeroentrycost_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.zeroentrycost_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  Apply PenaltyIn LImit Details SubMenu$")
	public void check_the_level_of_apply_penaltyin_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ApplyPenalty_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ApplyPenalty_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.ApplyPenalty_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Grace Period_ In LImit Details SubMenu$")
	public void check_the_level_of_grace_period_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.GracePeriod_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.GracePeriod_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.GracePeriod_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Vat code In LImit Details SubMenu$")
	public void check_the_level_of_vat_code_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Vatcode_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Vatcode_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.Vatcode_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of REGIMENTAL AGENT In LImit Details SubMenu$")
	public void check_the_level_of_regimental_agent_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.REGIMENTAL_AGENT_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.REGIMENTAL_AGENT_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.REGIMENTAL_AGENT_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  CONTRACTED In LImit Details SubMenu$")
	public void check_the_level_of_contracted_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.CONTRACTED_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CONTRACTED_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.CONTRACTED_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  transaction cy In LImit Details SubMenu$")
	public void check_the_level_of_transaction_cy_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.transaction_cy_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.transaction_cy_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.transaction_cy_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Maximum Tenure Periodicity Type key In LImit Details SubMenu$")
	public void check_the_level_of_maximum_tenure_periodicity_type_key_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of Minimum Tenure PeriodicityType key In LImit Details SubMenu$")
	public void check_the_level_of_minimum_tenure_periodicitytype_key_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  Maximum Tenure for financing PeriodicityType key In LImit Details SubMenu$")
	public void check_the_level_of_maximum_tenure_for_financing_periodicitytype_key_in_limit_details_submenu()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(
				FMS_WifakApplication_Obj.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj
				.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  Floating Rate Periodi city In LImit Details SubMenu$")
	public void check_the_level_of_floating_rate_periodi_city_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.FloatingRatePeriodicit_InLImitDetails_SubMenu());
		clicksAndActionsHelper
				.moveToElement(FMS_WifakApplication_Obj.FloatingRatePeriodicit_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.FloatingRatePeriodicit_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of   Margin Rate In LImit Details SubMenu$")
	public void check_the_level_of_margin_rate_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.MarginRate_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.MarginRate_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.MarginRate_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  lip perioIn LImit Details SubMenu$")
	public void check_the_level_of_lip_perioin_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.lip_period_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.lip_period_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.lip_period_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  lip period amende In LImit Details SubMenu$")
	public void check_the_level_of_lip_period_amende_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.lip_period_amende_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.lip_period_amende_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.lip_period_amende_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Transcation Type In LImit Details SubMenu$")
	public void check_the_level_of_transcation_type_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TranscationType_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TranscationType_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.TranscationType_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of Acc No In LImit Details SubMenu$")
	public void check_the_level_of_acc_no_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu().isEnabled());
	}

	@Then("^User_610 Check The Level Of  Close Button In LImit Details SubMenu$")
	public void check_the_level_of_close_button_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.close_btn_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.close_btn_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.close_btn_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  Transcation Maturity In LImit Details SubMenu$")
	public void check_the_level_of_transcation_maturity_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.TranscationMaturity_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TranscationMaturity_InLImitDetails_SubMenu());
		Assert.assertEquals(true,
				FMS_WifakApplication_Obj.TranscationMaturity_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  Bank No In LImit Details SubMenu$")
	public void check_the_level_of_bank_no_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.bank_no_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.bank_no_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.bank_no_InLImitDetails_SubMenu().isEnabled());
	}

	@And("^User_610 Check The Level Of  Add Button In LImit Details SubMenu$")
	public void check_the_level_of_add_button_in_limit_details_submenu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu());
		Assert.assertEquals(true, FMS_WifakApplication_Obj.acc_no_InLImitDetails_SubMenu().isEnabled());
	}

	// -------------@579604 Scenario: TSR - KCB170047

	@Then("^Click Application For Decrease$")
	public void click_application_for_decrease() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getApplication_for_610());
		// clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getMaintenance());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.getApplication_for_610(), "Decrease");
	}

	@And("^Enter Existing Facility Ref$")
	public void enter_existing_facility_ref() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ExistingFacility_Ref());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.ExistingFacility_Ref());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.ExistingFacility_Ref());
		FMS_WifakApplication_Obj.ExistingFacility_Ref().sendKeys("1382");
		FMS_WifakApplication_Obj.ExistingFacility_Ref().sendKeys(Keys.TAB);
	}

	@And("^Click on additional Details In Additional Details$")
	public void click_on_additional_details_in_additional_details() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.getMaintenance());
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.getMaintenance());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.getMaintenance());

		for (int i = 0; i < 500; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Click_AdditionalDetails());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Enter the Total Value In Additional Details$")
	public void enter_the_total_value_in_additional_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.TOTAL_AMOUNT_InAdditionalDetails());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.TOTAL_AMOUNT_InAdditionalDetails());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.TOTAL_AMOUNT_InAdditionalDetails());
		FMS_WifakApplication_Obj.getEnter_TotalValue().sendKeys("50000");
	}

	@Then("^Enter Down Payment In Percentage$")
	public void enter_down_payment_in_percentage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu());
		for (int i = 0; i <= 500; i++) {
			try {
				if (FMS_WifakApplication_Obj.DownPaymentAmo_InLImitDetails_SubMenu().getAttribute("prevvalue")
						.isBlank()) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu().sendKeys("10");
		FMS_WifakApplication_Obj.DownPaymentAmount_InLImitDetails_SubMenu().sendKeys(Keys.TAB);

		int total = (50000 * 10) / 100;
		System.err.println("Total value: " + total);
		String valueOf = String.valueOf(total);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.DownPaymentAmo_InLImitDetails_SubMenu().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.DownPaymentAmo_InLImitDetails_SubMenu());
		String attribute = FMS_WifakApplication_Obj.DownPaymentAmo_InLImitDetails_SubMenu()
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
//			clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.CLEAN_FLAG_In_LimitsDetails());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.CLEAN_FLAG_In_LimitsDetails());

		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.CLEAN_FLAG_In_LimitsDetails_610());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.FRRValueDate_In_LimitsDetails());
//		FMS_WifakApplication_Obj.FRRValueDate_In_LimitsDetails().sendKeys("04/01/2021");
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

	@Then("^Enter the value in No Of Payments  In Repayment Plan$")
	public void enter_the_value_in_no_of_payments_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan());
		FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan().sendKeys(Keys.DELETE);

		for (int i = 0; i < 500; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan());
				FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan().sendKeys("10");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^Click Warning popup No In Repayment Plan$")
	public void click_warning_popup_no_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WaringButton_OnLimitDetails_Tab());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.WaringButton_OnLimitDetails_Tab());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.WaringButton_OnLimitDetails_Tab());
		Thread.sleep(6000);
		// FMS_WifakApplication_Obj.No_Of_Payments_InRepaymentPlan().sendKeys("10");
	}

	@Then("^Click Ok Button In Waring Screen In Repayment Plan$")
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

	@And("^Click Repayment Plan In Limits Details$")
	public void click_repayment_plan_in_limits_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.RepaymentPlan_btn_In_LimitsDetails());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.RepaymentPlan_btn_In_LimitsDetails());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.RepaymentPlan_btn_In_LimitsDetails());
	}

	@And("^Click Create Schedule In Repayment Plan$")
	public void click_create_schedule_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.createSchedule_InRepaymentPlan());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.createSchedule_InRepaymentPlan());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.createSchedule_InRepaymentPlan());
	}

	@And("^Click Save Button After In Repayment Plan$")
	public void click_save_button_after_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_RepaymentPlan());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.SaveButton_RepaymentPlan());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_RepaymentPlan());
		Thread.sleep(5000);

	}

	@And("^Click OK  Button In Sucess Screen In Repayment Plan$")
	public void click_Ok_Button_In_Sucess_Screen_610_in_repayment_plan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		Thread.sleep(10000);
	}

//---------------------approvel 1	    

	@And("^User clicks the Approve Level1 link$")
	public void user_clicks_the_approve_level1_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel1());
		FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel1().click();
	}

	@And("^User retrive the first data in approve level1$")
	public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level1());
//	    	FMS_WifakApplication_Obj.approve1ClearBtn().click();
		FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level1().sendKeys(SuccessMsg, Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level1());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level1());
	}

	@And("^select the Approve level1 decision as approve$")
	public void select_the_approve_level1_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel1SelectDecision());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel1SelectDecision(), "Approve");
		// DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel1SelectDevision(),
		// testData.get("Decision1"));
	}

	@And("^User clicks on the level1 submit button$")
	public void user_clicks_on_the_level1_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel1SubmitBtn());
		FMS_WifakApplication_Obj.approveLevel1SubmitBtn().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1());
		FMS_WifakApplication_Obj.ButtonConfirmOk1().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonSuccessOk1());

		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.ButtonSuccessOk1().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	// --------------------approvel 2

	@And("^User clicks the Approve Level2 link$")
	public void user_clicks_the_approve_level2_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel2());
		// FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel2().click();
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel2().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User retrive the first data in approve level2$")
	public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level2());
//	    	FMS_WifakApplication_Obj.approve1ClearBtn().click();
		FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level2().sendKeys(SuccessMsg, Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level2());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level2());
	}

	@And("^User select the level2 decision as approve$")
	public void user_select_the_level2_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel2SelectDecision());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel2SelectDecision(), "Approve");
		// DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel2SelectDecision(),
		// testData.get("Decision2"));
	}

	@And("^User clicks on the level2 submit button$")
	public void user_clicks_on_the_level2_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel2SubmitBtn());
		FMS_WifakApplication_Obj.approveLevel2SubmitBtn().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1());
		FMS_WifakApplication_Obj.ButtonConfirmOk1().click();
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonSuccessOk1());
		FMS_WifakApplication_Obj.ButtonSuccessOk1().click();
	}

	// --------------------approvel 3

	@And("^User clicks the Approve Level3 link$")
	public void user_clicks_the_approve_level3_link() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel3());
		FMS_WifakApplication_Obj.applicationFinancialFacilityApproveLevel3().click();
	}

	@And("^User retrive the first data in approve level3$")
	public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level3());
//	    	FMS_WifakApplication_Obj.approve1ClearBtn().click();
		FMS_WifakApplication_Obj.Enter_ValidateCode_approve_level3().sendKeys(SuccessMsg, Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level3());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.ClickTheValue_ValidateCode_approve_level3());
	}

	@And("^User select the level3 decision as approve$")
	public void user_select_the_level3_decision_as_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel3SelectDecision());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel3SelectDecision(), "Approve");
		// DropDownhelper.SelectUsingVisibleText(FMS_WifakApplication_Obj.approveLevel3SelectDecision(),
		// testData.get("Decision3"));

	}

	@When("^User clicks on the level3 submit button$")
	public void user_clicks_on_the_level3_submit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveLevel3SubmitBtn());
		FMS_WifakApplication_Obj.approveLevel3SubmitBtn().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1());
		FMS_WifakApplication_Obj.ButtonConfirmOk1().click();
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonSuccessOk1());
		FMS_WifakApplication_Obj.ButtonSuccessOk1().click();
	}

	// ------- @814762 facility management screen

	@Given("User_610 click facility management")
	public void click_facility_management() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.facilityManagement_screen());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.facilityManagement_screen().click();
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
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.updateAfterApprove_screen());
		FMS_WifakApplication_Obj.updateAfterApprove_screen().click();
	}

	@Given("User_610 Retrive one data in update after approvel screen")
	public void retrive_one_data_in_update_after_approvel_screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.clearButton_InUpdateApproveScreen());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.clearButton_InUpdateApproveScreen().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.retriveData_InUpdateApproveScreen());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.retriveData_InUpdateApproveScreen());
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
				FMS_WifakApplication_Obj.facilityApplicationDetails_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.facilityApplicationDetails_InUpdateApproveScreen().click();
	}

	@Given("User-{int} click cash margin in update after approvel screen")
	public void user_click_cash_margin_in_update_after_approvel_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.cashMargin_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.cashMargin_InUpdateApproveScreen().click();
		FMS_WifakApplication_Obj.cashMargin_InUpdateApproveScreen().clear();
		FMS_WifakApplication_Obj.cashMargin_InUpdateApproveScreen().sendKeys("10");
	}

	@Given("User_610 check flag exceed facility at sublimit")
	public void check_flag_exceed_facility_at_sublimit() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InUpdateApproveScreen().click();
	}

	@Given("User_610 check flag subject to full repayment")
	public void check_flag_subject_to_full_repayment() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.subjectTofullRepayment_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.subjectTofullRepayment_InUpdateApproveScreen().click();
	}

	@Given("User_610 click facility limit details")
	public void click_facility_limit_details() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityLimitDetails_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.facilityLimitDetails_InUpdateApproveScreen().click();
	}

	@Given("User_610 click product class")
	public void click_product_class() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.productClass_InfacilityLimitDetails_InUpdateApproveScreen());
		clicksAndActionsHelper
				.doubleClick(FMS_WifakApplication_Obj.productClass_InfacilityLimitDetails_InUpdateApproveScreen());
	}

	@Given("User_610 enter the value cap rate")
	public void enter_the_value_cap_rate() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen().click();
		FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen().clear();
		FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen().sendKeys("10");
	}

	@Given("User_610 enter the value selling price")
	public void enter_the_value_selling_price() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen().click();
		FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen().clear();
		FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen().sendKeys("10");

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.EditBUtton_InLimitDetails_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.EditBUtton_InLimitDetails_InUpdateApproveScreen().click();
	}

	@Given("User_610 click document details approvel screen")
	public void click_document_details_approvel_screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.documentDetails_InUpdateApproveScreen());
		FMS_WifakApplication_Obj.documentDetails_InUpdateApproveScreen().click();
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
				FMS_WifakApplication_Obj.clickfirstRow1buttonButton_InDocumentDetails());
		FMS_WifakApplication_Obj.clickfirstRow1buttonButton_InDocumentDetails().click();

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails());
		FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails().click();
		FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		// FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails().click();

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.solicitorDataSend_InDocumentDetails().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDataReceived_InDocumentDetails());
		FMS_WifakApplication_Obj.solicitorDataReceived_InDocumentDetails().click();
		FMS_WifakApplication_Obj.solicitorDataReceived_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.solicitorDataReceived_InDocumentDetails().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.estimatorDateSent_InDocumentDetails());
		FMS_WifakApplication_Obj.estimatorDateSent_InDocumentDetails().click();
		FMS_WifakApplication_Obj.estimatorDateSent_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.estimatorDateSent_InDocumentDetails().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.estimatorDateRecevied_InDocumentDetails());
		FMS_WifakApplication_Obj.estimatorDateRecevied_InDocumentDetails().click();
		FMS_WifakApplication_Obj.estimatorDateRecevied_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.estimatorDateRecevied_InDocumentDetails().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.custodianDateSent_InDocumentDetails());
		FMS_WifakApplication_Obj.custodianDateSent_InDocumentDetails().click();
		FMS_WifakApplication_Obj.custodianDateSent_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.custodianDateSent_InDocumentDetails().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		// ------2nd row

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.clicksolicitorDataSendRow2_InDocumentDetails());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.clicksolicitorDataSendRow2_InDocumentDetails().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDataSendRow2_InDocumentDetails());
		FMS_WifakApplication_Obj.solicitorDataSendRow2_InDocumentDetails().click();
		FMS_WifakApplication_Obj.solicitorDataSendRow2_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.solicitorDataSendRow2_InDocumentDetails().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDataDataRecived2_InDocumentDetails());
		FMS_WifakApplication_Obj.solicitorDataDataRecived2_InDocumentDetails().click();
		FMS_WifakApplication_Obj.solicitorDataDataRecived2_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.solicitorDataDataRecived2_InDocumentDetails()
						.getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.estimatorDateSent2_InDocumentDetails());
		FMS_WifakApplication_Obj.estimatorDateSent2_InDocumentDetails().click();
		FMS_WifakApplication_Obj.estimatorDateSent2_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.estimatorDateSent2_InDocumentDetails().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.estimatorDateReceviedt2_InDocumentDetails());
		FMS_WifakApplication_Obj.estimatorDateReceviedt2_InDocumentDetails().click();
		FMS_WifakApplication_Obj.estimatorDateReceviedt2_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.estimatorDateReceviedt2_InDocumentDetails().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.custodianDateSent2_InDocumentDetails());
		FMS_WifakApplication_Obj.custodianDateSent2_InDocumentDetails().click();
		FMS_WifakApplication_Obj.custodianDateSent2_InDocumentDetails().sendKeys("15/06/2023", Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(FMS_WifakApplication_Obj.custodianDateSent2_InDocumentDetails().getAttribute("prevvalue")
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
				FMS_WifakApplication_Obj.SaveButton_DocumentDetails_updateafter_Tab());
		FMS_WifakApplication_Obj.SaveButton_DocumentDetails_updateafter_Tab().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WaringButton_OnLimitDetails_Tab());
		FMS_WifakApplication_Obj.WaringButton_OnLimitDetails_Tab().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup());
		// String SuccessMsg =
		// FMS_WifakApplication_Obj.successPopupMessage().getText();
		SuccessMsg2 = FMS_WifakApplication_Obj.successPopupMessage().getText().substring(11, 15);
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
				FMS_WifakApplication_Obj.sendAlertPopup_facilityManagement());
		for (int i = 0; i < 2000; i++) {
			try {
				FMS_WifakApplication_Obj.sendAlertPopup_facilityManagement().click();
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
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.approveRejectScreen_FM());
		FMS_WifakApplication_Obj.approveRejectScreen_FM().click();
	}

	@Given("User_610 enter the retrive data code")
	public void enter_the_retrive_data_code() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.enterCode_InapprovelScreen());
		FMS_WifakApplication_Obj.enterCode_InapprovelScreen().sendKeys(SuccessMsg2, Keys.ENTER);

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.selectFirstRow_InapprovelScreen());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.selectFirstRow_InapprovelScreen());

	}

	@Given("User_{int} click facility application details screen")
	public void user_click_facility_application_details_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityApplicationDetails_InapprovelScreen());
		clicksAndActionsHelper
				.clickOnElement(FMS_WifakApplication_Obj.facilityApplicationDetails_InapprovelScreen());

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

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.WarningPopupOkBtn());
		FMS_WifakApplication_Obj.WarningPopupOkBtn().click();

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup());
		// String SuccessMsg =
		// FMS_WifakApplication_Obj.successPopupMessage().getText();
		SuccessMsgFM = FMS_WifakApplication_Obj.successPopupMessage().getText().substring(11, 15);
		System.err.println("Reference Number: " + SuccessMsgFM);
		// fmsTransactionsExcelData.updateTestData("DS_AT_RF_139", "Approve Code",
		// SuccessMsg);

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.successPopup());
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
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityApplicationDetails_InapprovelScreen());
		clicksAndActionsHelper
				.clickOnElement(FMS_WifakApplication_Obj.facilityApplicationDetails_InapprovelScreen());

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InapprovelScreen());
//	    	Assert.assertTrue(FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InapprovelScreen().isDisplayed());
		WebElement exceedFacilityAtSublimit = FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InapprovelScreen();
		if (exceedFacilityAtSublimit.isSelected()) {
			Assert.assertTrue(true);
		}

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.subjectToFullRepayment_InapprovelScreen());
//	    	Assert.assertTrue(FMS_WifakApplication_Obj.exceedFacilityAtSublimit_InapprovelScreen().isDisplayed());
		WebElement subjectToFullRepayment = FMS_WifakApplication_Obj.subjectToFullRepayment_InapprovelScreen();
		if (subjectToFullRepayment.isSelected()) {
			Assert.assertTrue(true);
		}

	}

	@Given("User_610 validate the product class screen")
	public void validate_the_product_class_screen() {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.facilityLimitDetails_InapprovelScreen());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.facilityLimitDetails_InapprovelScreen());

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.productClass_InapprovelScreen());
		clicksAndActionsHelper.doubleClick(FMS_WifakApplication_Obj.productClass_InapprovelScreen());

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen());
		Assert.assertEquals("10",
				FMS_WifakApplication_Obj.capRate_InLimitDetails_InUpdateApproveScreen().getAttribute("prevvalue"));

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen());
		Assert.assertEquals("10", FMS_WifakApplication_Obj.sellingPrice_InLimitDetails_InUpdateApproveScreen()
				.getAttribute("prevvalue"));

		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.closeButton_InapprovelScreen());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.closeButton_InapprovelScreen());
	}

	@And("User_610 validate the document details screen")
	public void validate_the_document_details_screen() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.documentDetails_InapprovelScreen());
		clicksAndActionsHelper.clickOnElement(FMS_WifakApplication_Obj.documentDetails_InapprovelScreen());

		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakApplication_Obj.solicitorDateSent_InapprovelScreen());
		Assert.assertEquals("15/06/2023", FMS_WifakApplication_Obj.solicitorDateSent_InapprovelScreen().getText());
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
		String string = testData.get("Facility Type In Facility Limits");
		System.err.println(string);
//		FMS_WifakApplication_Obj.facilityTypeSearchCode_610().sendKeys("19", Keys.ENTER);
//		FMS_WifakApplication_Obj.facilityTypeSearchCode_610().sendKeys(testData.get("Facility Type"));
		FMS_WifakApplication_Obj.facilityTypeSearchCode_610().sendKeys(testData.get("Facility Type In Facility Limits"), Keys.ENTER);
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

	@And("^User_610 check the Credit Authorization flag$")
	public void user_check_the_credit_authorization_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.creditAuthorzieFlag_610());
		WebElement creditAuthorzieFlag = FMS_WifakApplication_Obj.creditAuthorzieFlag_610();
		if (!(creditAuthorzieFlag.isSelected())) {
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
		FMS_WifakApplication_Obj.approveSearchCode_610().sendKeys("19", Keys.ENTER);
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
	
	

}
