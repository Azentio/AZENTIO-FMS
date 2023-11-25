
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
import pageobjects.CommonElements.FMSCommonWebElements;
import resources.BaseClass;

	 

		public class Charges_054 extends BaseClass
		{
			WebDriver driver = BaseClass.driver;
			FMSLogin FMSLogin = new FMSLogin(driver);
			IISLogin iisLogin = new IISLogin(driver);
			AT_IISPRM_054_OBJ atiisprm054obj =new AT_IISPRM_054_OBJ(driver);
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

		 

			@Given("^user_54 navigate to the IISParam application and login with the valid credentials$")
		    public void user_54_navigate_to_the_IISParam_application_and_login_with_the_valid_credentials() throws Throwable 
			{
				driver.get(configFileReader.getIISParamApplicationUrl());
				iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
		    }

			@Then("^user_54 update test data set id for AT_IISPRM_058$")
			public void user_54_update_test_data_set_id_for_AT_IISPRM_058() 
			{
				testdata = exceldata.getTestdata("AT_IISPRM_058_ID1");
			}

			@And("^user_54 click on parameters tab$")
			public void user_54_click_on_parameters_tab() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Parameters());
				atiisprm054obj.Parameters().click();
			}

			@And("^user_54 click on charge$")
			public void user_54_click_on_charge() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.ChargesTabunderParameter());
				javascriptHelper.scrollToElemet(atiisprm054obj.ChargesTabunderParameter());
				atiisprm054obj.ChargesTabunderParameter().click();
			}

			@And("^user_54 check menus and lists are available$")
			public void user_54_check_menus_and_lists_are_available() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.MaintananceUnderCharge());
				Assert.assertTrue(atiisprm054obj.MaintananceUnderCharge().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.ApproveUnderCharge());
				Assert.assertTrue(atiisprm054obj.ApproveUnderCharge().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.ListUnderCharge());
				Assert.assertTrue(atiisprm054obj.ListUnderCharge().isDisplayed());
				//waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Reject());
				//Assert.assertTrue(atiisprm054obj.Reject().isDisplayed());
				System.out.println("Menus and lists are available");
			}

			@And("^user_54 click on maintenance and create a record$")
			public void user_54_click_on_maintenance_and_create_a_record() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.MaintananceUnderCharge());
				atiisprm054obj.MaintananceUnderCharge().click();
			}

			@And("^user_54 enter code brief description long description and save it$")
			public void user_54_enter_code_brief_description_long_description_and_save_it() throws Throwable
			{
				//passing Zero in code
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.CodeTabunderMaintanancecharge());
				atiisprm054obj.CodeTabunderMaintanancecharge().click();
				atiisprm054obj.CodeTabunderMaintanancecharge().sendKeys(testdata.get("CodeNegative"));
				atiisprm054obj.CodeTabunderMaintanancecharge().sendKeys(Keys.TAB);
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.errorpop());
				boolean at=atiisprm054obj.errorpop().isDisplayed();
				//	String et="Minimum value should be 1 1";
					if(at==true)
					{
						System.out.println("Enter a valid code");
						atiisprm054obj.ok().click();
					}
					else
					{
						Assert.fail();
					}
			
				//right code
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.CodeTabunderMaintanancecharge());
				selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm054obj.CodeTabunderMaintanancecharge());
				for (int i = 0; i <500; i++) {
					try {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.CodeTabunderMaintanancecharge());
				selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm054obj.CodeTabunderMaintanancecharge());
				atiisprm054obj.CodeTabunderMaintanancecharge().sendKeys(testdata.get("Code"));
				//atiisprm054obj.CodeTabunderMaintanancecharge().sendKeys("6672");
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
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.savebutton());
				atiisprm054obj.savebutton().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Okaftersave());
				atiisprm054obj.Okaftersave().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.successfulOkaftersave());
				atiisprm054obj.successfulOkaftersave().click();
				System.out.println("Record is created");
			}

		 

			@And("^user_54 check first last prev next button$")
			public void user_54_check_first_last_prev_next_button() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.SearchTabunderMaintanancecharge());
				atiisprm054obj.SearchTabunderMaintanancecharge().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Clear());
				atiisprm054obj.Clear().click();
				waitHelper.setImplicitWait(30);
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Next());
				atiisprm054obj.Next().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Last());
				atiisprm054obj.Last().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Pre());
				atiisprm054obj.Pre().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.first());
				atiisprm054obj.first().click();
				System.out.println("first last prev next button is working");
			}

			@And("^user_54 check sorting functionality$")
			public void user_54_check_sorting_functionality() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Clear());
				atiisprm054obj.Clear().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.shortsearch());
				atiisprm054obj.shortsearch().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Add());
				atiisprm054obj.Add().click();
				//sort code
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.sortoption());
				atiisprm054obj.sortoption().click();
				atiisprm054obj.sortoption().sendKeys(Keys.ENTER);
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.sortinput());
				atiisprm054obj.sortinput().click();
				//atiisprm054obj.CodeTabunderMaintanancecharge().sendKeys("6672");
				atiisprm054obj.sortinput().sendKeys(testdata.get("Code"));
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.find());
				atiisprm054obj.find().click();
				System.out.println("Code is sorted");		
			}

			

			@And("^user_54 check grid is listing all relevant data$")
			public void user_54_check_grid_is_listing_all_relevant_data() throws Throwable
			{
				Thread.sleep(3000);
				//grid is listing all relevant data
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Gridcode());
				Assert.assertTrue(atiisprm054obj.Gridcode().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.GridBrief());
				Assert.assertTrue(atiisprm054obj.GridBrief().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Gridlong());
				Assert.assertTrue(atiisprm054obj.Gridlong().isDisplayed());
				System.out.println("Grid is listing all relevant data");
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Gridcode());
				selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm054obj.Gridcode());
				System.out.println("Record is retrieved");
				
			}

			@And("^user_54 retrieve the code and delete it$")
			public void user_54_retrieve_the_code_and_delete_it() throws Throwable
			{
				Thread.sleep(2000);
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Delete());
				atiisprm054obj.Delete().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Deleteconfirm());
				atiisprm054obj.Deleteconfirm().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.Deleteok());
				atiisprm054obj.Deleteok().click();
				System.out.println("Code is deleted");
			}

		 

			@And("^user_54 close the screen$")
			public void user_54_close_the_screen() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm054obj.CloseTab());
				atiisprm054obj.CloseTab().click();
				System.out.println("Screen is closed");
			}


		}

		 
