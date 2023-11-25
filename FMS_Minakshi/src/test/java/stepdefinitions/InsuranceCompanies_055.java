
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
import pageobjects.CommonElements.AT_IISPRM_055_OBJ;
import pageobjects.CommonElements.FMSCommonWebElements;
	
	import resources.BaseClass;

	 

	public class InsuranceCompanies_055 extends BaseClass
	{
		WebDriver driver = BaseClass.driver;
		FMSLogin FMSLogin = new FMSLogin(driver);
		IISLogin iisLogin = new IISLogin(driver);
		AT_IISPRM_055_OBJ atiisprm055obj =new AT_IISPRM_055_OBJ(driver);
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

	 

		@Given("^user_55 navigate to the IISParam application and login with the valid credentials$")
	    public void user_55_navigate_to_the_IISParam_application_and_login_with_the_valid_credentials() throws Throwable 
		{
			driver.get(configFileReader.getIISParamApplicationUrl());
			iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
	    }
		@Then("^user_55 update test data set id for AT_IISPRM_058$")
		public void user_55_update_test_data_set_id_for_AT_IISPRM_058(){
			testdata = exceldata.getTestdata("AT_iisprm_058_ID1");
			System.out.println(testdata.keySet());
		}
		

		@And("^user_55 click on parameters tab$")
		public void user_55_click_on_parameters_tab() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Parameters());
			atiisprm055obj.Parameters().click();
		}

		@And("^user_55 click on Insurance companies$")
		public void user_55_click_on_Insurance_companies() throws Throwable
		{

			for(int i=1;i<=50;i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.InsuranceCompanies());
					atiisprm055obj.InsuranceCompanies().click();
					break;
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
				}
				}
			}
		}

		@And("^user_55 check menus and lists are available$")
		public void user_55_check_menus_and_lists_are_available() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Maintenance());
			Assert.assertTrue(atiisprm055obj.Maintenance().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.UpdateAfterApprove());
			Assert.assertTrue(atiisprm055obj.UpdateAfterApprove().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Reject());
			Assert.assertTrue(atiisprm055obj.Reject().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Approve());
			Assert.assertTrue(atiisprm055obj.Approve().isDisplayed());
			System.out.println("Menus and lists are available");
		}

		@And("^user_55 click on maintenance and create a record$")
		public void user_55_click_on_maintenance_and_create_a_record() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Maintenance());
			atiisprm055obj.Maintenance().click();
		}

		@And("^user_55 enter code brief description long description and save it$")
		public void user_55_enter_code_brief_description_long_description_and_save_it() throws Throwable
		{
			//negative code
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Code());
			atiisprm055obj.Code().click();
			System.out.println(testdata.get("CodeNegative").trim());
			atiisprm055obj.Code().sendKeys(testdata.get("CodeNegative").trim());
			atiisprm055obj.Code().sendKeys(Keys.TAB);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.ErrorPopup());
			boolean at=atiisprm055obj.ErrorPopup().isDisplayed();
		//	String et="Minimum value should be 1 1";
			if(at==true)
			{
				System.out.println("Enter a valid code");
				atiisprm055obj.Ok().click();
			}
			else
			{
				Assert.fail();
			}
	
			//right code
			for (int i = 0; i <200; i++) {
				try {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Code());
			selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm055obj.Code());
			atiisprm055obj.Code().sendKeys(testdata.get("Code"));
			break;
				} catch (Exception e) {

				}
			}
			//brief des
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.BriefDescription());
			atiisprm055obj.BriefDescription().click();
			atiisprm055obj.BriefDescription().sendKeys(testdata.get("BriefDes"));
			//long des
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.LongDescription());
			atiisprm055obj.LongDescription().click();
			atiisprm055obj.LongDescription().sendKeys(testdata.get("LongDes"));
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Tracker());
			//atiisprm055obj.Type().sendKeys(Keys.ENTER);
			atiisprm055obj.Tracker().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Save());
			atiisprm055obj.Save().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.ConfirmOk());
			atiisprm055obj.ConfirmOk().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Ok());
			atiisprm055obj.Ok().click();
		
			System.out.println("Record is created");
		}

		/*@And("^user_55 search code and update it$")
		public void user_55_search_code_and_update_it() {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Search());
			atiisprm055obj.Search().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.SearchCode());
			atiisprm055obj.SearchCode().click();
			atiisprm055obj.SearchCode().sendKeys("4321");
			atiisprm055obj.SearchCode().click();
			atiisprm055obj.SearchCode().sendKeys(Keys.ENTER);
			waitHelper.waitForElementwithFluentwait(driver,atiisprm055obj.insurancecode());
			selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm055obj.insurancecode());
			//waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.SettlementNumber());
			//atiisprm055obj.SettlementNumber().click();
			//atiisprm055obj.SettlementNumber().sendKeys("1234");
			//waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Tracker());
			//atiisprm055obj.Type().sendKeys(Keys.ENTER);
			//atiisprm055obj.Tracker().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.LongDescription());
			atiisprm055obj.LongDescription().click();
			atiisprm055obj.LongDescription().sendKeys(testdata.get("LongDes"));
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Update());
			atiisprm055obj.Update().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.ConfirmOk());
			atiisprm055obj.ConfirmOk().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Ok());
			atiisprm055obj.Ok().click();
		
			System.out.println("Record is update");
			
			
		}*/

		@And("^user_55 check first last prev next button$")
		public void user_55_check_first_last_prev_next_button() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Search());
			atiisprm055obj.Search().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Clear());
			atiisprm055obj.Clear().click();
			waitHelper.setImplicitWait(30);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.NextButton());
			atiisprm055obj.NextButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.LastButton());
			atiisprm055obj.LastButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.PrevButton());
			atiisprm055obj.PrevButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.FirstButton());
			atiisprm055obj.FirstButton().click();
			System.out.println("first last prev next button is working");
		}

		@And("^user_55 check sorting functionality$")
		public void user_55_check_sorting_functionality() throws Throwable
		{
			Thread.sleep(3000);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Clear());
			atiisprm055obj.Clear().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.SortSearch());
			atiisprm055obj.SortSearch().click();
			
	        waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Add());
			atiisprm055obj.Add().click();
			//sort code
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.SortOptions());
			atiisprm055obj.SortOptions().click();
			atiisprm055obj.SortOptions().sendKeys(Keys.ENTER);
			
			Thread.sleep(3000);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.SortingInput());
			atiisprm055obj.SortingInput().click();
			atiisprm055obj.SortingInput().sendKeys(testdata.get("Code"));
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.FindButton());
			atiisprm055obj.FindButton().click();
			System.out.println("Code is sorted");
		}
	
		

		@And("^user_55 check grid is listing all relevant data$")
		public void user_55_check_grid_is_listing_all_relevant_data() throws Throwable
		{
			Thread.sleep(3000);
			//grid is listing all relevant data
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.GridCode());
			Assert.assertTrue(atiisprm055obj.GridCode().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.GridBrief());
			Assert.assertTrue(atiisprm055obj.GridBrief().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.GridLong());
			Assert.assertTrue(atiisprm055obj.GridLong().isDisplayed());
			System.out.println("Grid is listing all relevant data");
			selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm055obj.GridCode());
		}

		

		@And("^user_55 retrieve the code and delete it$")
		public void user_55_retrieve_the_code_and_delete_it() throws Throwable
		{
			Thread.sleep(3000);
			
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Delete());
			atiisprm055obj.Delete().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.ConfirmOk());
			atiisprm055obj.ConfirmOk().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.Ok());
			atiisprm055obj.Ok().click();
				
				
				System.out.println("Code is deleted");
		}

		@And("^user_55 close the screen$")
		public void user_55_close_the_screen() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm055obj.CloseScreen());
			atiisprm055obj.CloseScreen().click();
			System.out.println("Screen is closed");
		}

	}

