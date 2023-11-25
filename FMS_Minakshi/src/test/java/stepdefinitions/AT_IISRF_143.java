package stepdefinitions;

import java.util.Map;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.AT_IISPRM_054_OBJ;
import pageobjects.CommonElements.AT_RF_143_OBJ;
import pageobjects.CommonElements.FMSCommonWebElements;
import resources.BaseClass;

	 

		public class AT_IISRF_143 extends BaseClass
		{
			WebDriver driver = BaseClass.driver;
			FMSLogin FMSLogin = new FMSLogin(driver);
			IISLogin iisLogin = new IISLogin(driver);
			AT_IISPRM_054_OBJ atiisprm054obj =new AT_IISPRM_054_OBJ(driver);
			AT_RF_143_OBJ atrf143obj =new AT_RF_143_OBJ(driver);
			WaitHelper waitHelper = new WaitHelper(driver);
			ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
			JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
			Selenium_Actions selenium_actions = new Selenium_Actions(driver);
			FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
			ConfigFileReader configFileReader = new ConfigFileReader();

			String path = System.getProperty("user.dir") +"\\TestData\\iisprmTestData.xlsx";
			//String path="C:\\Users\\ININDC00629\\git\\AZENTIO-FMS1\\AzentioAutomationFramework_FMS_Ajith\\TestData\\iisprmTestData.xlsx";
			ExcelData exceldata = new ExcelData(path,"ReasonCode","DataSetID");
			Map<String, String> testdata;

		 

			@Given("^user_143 navigate to the IISParam application and login with the valid credentials$")
		    public void user_143_navigate_to_the_IISParam_application_and_login_with_the_valid_credentials() throws Throwable 
			{
				driver.get(configFileReader.getIISParamApplicationUrl());
				iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
		    }

			@Then("^user_143 update test data set id for AT_IISPRM_058$")
			public void user_143_update_test_data_set_id_for_AT_IISPRM_058() 
			{
				testdata = exceldata.getTestdata("AT_IISPRM_058_ID1");
			}

			@And("^user_143 click on parameters tab$")
			public void user_143_click_on_parameters_tab() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Parameters());
				atiisprm054obj.Parameters().click();
			}

			@And("^user_143 click on charge$")
			public void user_143_click_on_charge() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.ChargesTabunderParameter());
				javascriptHelper.scrollToElemet(atiisprm054obj.ChargesTabunderParameter());
				atiisprm054obj.ChargesTabunderParameter().click();
			}

			
			@And("^user_143 click on maintenance and create a record$")
			public void user_143_click_on_maintenance_and_create_a_record() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.MaintananceUnderCharge());
				atiisprm054obj.MaintananceUnderCharge().click();
			}

			@And("^user_143 enter code brief description long description$")
			public void user_143_enter_code_brief_description_long_description() throws Throwable
			{
				
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.CodeTabunderMaintanancecharge());
				selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm054obj.CodeTabunderMaintanancecharge());
				for (int i = 0; i <500; i++) {
					try {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.CodeTabunderMaintanancecharge());
				selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm054obj.CodeTabunderMaintanancecharge());
				//atiisprm054obj.CodeTabunderMaintanancecharge().sendKeys(testdata.get("Code"));
				atiisprm054obj.CodeTabunderMaintanancecharge().sendKeys("6694");
				break;
					} catch (Exception e) {

					}
				}
				//brief des
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.BriefDescriptionunderMaintanancecharge());
				atiisprm054obj.BriefDescriptionunderMaintanancecharge().click();
				atiisprm054obj.BriefDescriptionunderMaintanancecharge().sendKeys(testdata.get("BriefDes"));
				//long des
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.LongDescriptionunderMaintanancecharge());
				atiisprm054obj.LongDescriptionunderMaintanancecharge().click();
				atiisprm054obj.LongDescriptionunderMaintanancecharge().sendKeys(testdata.get("LongDes"));
				
			}
			
			@And("^user_143 click on additional detail$")
			public void user_143_on_additional_detail() throws InterruptedException{
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.Additionaldetail());
				selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.Additionaldetail());
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.Flatammount());
				selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.Flatammount());
				atrf143obj.Flatammount().sendKeys("10000");
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.Allowtoeditcharge());
				selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.Allowtoeditcharge());
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.flatammountcirrencytype());
				selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.flatammountcirrencytype());
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.Allowtoeditchargepercentage());
				selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.Allowtoeditchargepercentage());
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.chargereceivable());
				selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.chargereceivable());
				Thread.sleep(3000);
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.retrivedata());
				selenium_actions.getClickAndActionsHelper().doubleClick(atrf143obj.retrivedata());
			}
			@And("^user_143 click on save button$")
			public void user_143_click_on_save_button() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.savebutton());
				atiisprm054obj.savebutton().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Okaftersave());
				atiisprm054obj.Okaftersave().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.successfulOkaftersave());
				atiisprm054obj.successfulOkaftersave().click();
			}
			
			@And("^User Click on Disbursement or Sublimit$")
			public void  user_click_on_Disbursement_or_Sublimit() {
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.Disbursement());
				selenium_actions.getClickAndActionsHelper().moveToElement(atrf143obj.Disbursement());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.Disbursement());
			}
			@And("^User Click on Add button in Disbursement or Sublimit$")
			public void user_Click_on_Add_button_in_Disbursement_or_Sublimits() {
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.addicon());
				selenium_actions.getClickAndActionsHelper().moveToElement(atrf143obj.addicon());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.addicon());
			}
			
			@And("^User Enter productclass$")
			public void user_Enter_productclass() {
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.productclass());
				selenium_actions.getClickAndActionsHelper().moveToElement(atrf143obj.productclass());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.productclass());
		    	atrf143obj.productclass().sendKeys("1");
			}
			
			@And("^User Click on Add button$")
			public void user_Click_on_Add_button() {
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.addbutton());
				selenium_actions.getClickAndActionsHelper().moveToElement(atrf143obj.addbutton());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.addbutton());
		    	
			}
			
			
			@And("^User click on feesCharges tab$")
		    public void user_click_on_feesCharges_tab() {
				waitHelper.waitForElementwithFluentwait(driver, atrf143obj.feescharges());
		    	selenium_actions.getClickAndActionsHelper().moveToElement(atrf143obj.feescharges());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(atrf143obj.feescharges());
		    }
			
		}
