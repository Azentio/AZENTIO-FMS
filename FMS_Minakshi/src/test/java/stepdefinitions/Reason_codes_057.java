
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
    import pageobjects.CommonElements.AT_IISPRM_057_OBJ;
    import pageobjects.CommonElements.FMSCommonWebElements;
	
	import resources.BaseClass;

	 

	public class Reason_codes_057 extends BaseClass
	{
		WebDriver driver = BaseClass.driver;
		FMSLogin FMSLogin = new FMSLogin(driver);
		IISLogin iisLogin = new IISLogin(driver);
		AT_IISPRM_057_OBJ atiisprm057obj =new AT_IISPRM_057_OBJ(driver);
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

	 

		@Given("^user_57 navigate to the IISParam application and login with the valid credentials$")
	    public void user_57_navigate_to_the_IISParam_application_and_login_with_the_valid_credentials() throws Throwable 
		{
			driver.get(configFileReader.getIISParamApplicationUrl());
			iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
	    }

		@Then("^user_57 update test data set id for AT_iisprm_058$")
		public void user_57_update_test_data_set_id_for_AT_iisprm_058(){
			testdata = exceldata.getTestdata("AT_iisprm_058_ID1");
			System.out.println(testdata.keySet());
		}
		

		@And("^user_57 click on parameters tab$")
		public void user_57_click_on_parameters_tab() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Parameters());
			atiisprm057obj.Parameters().click();
		}

		@And("^user_57 click on Reason code$")
		public void user_57_click_on_Reason_codet() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Reasoncode());
			atiisprm057obj.Reasoncode().click();
		}

		@And("^user_57 check menus and lists are available$")
		public void user_57_check_menus_and_lists_are_available() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Maintenance());
			Assert.assertTrue(atiisprm057obj.Maintenance().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.List());
			Assert.assertTrue(atiisprm057obj.List().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.UpdateAfterApprove());
			Assert.assertTrue(atiisprm057obj.UpdateAfterApprove().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Reject());
			Assert.assertTrue(atiisprm057obj.Reject().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Approve());
			Assert.assertTrue(atiisprm057obj.Approve().isDisplayed());
			System.out.println("Menus and lists are available");
		}

		@And("^user_57 click on maintenance and create a record$")
		public void user_57_click_on_maintenance_and_create_a_record() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Maintenance());
			atiisprm057obj.Maintenance().click();
		}

		@And("^user_57 enter code brief description long description and save it$")
		public void user_57_enter_code_brief_description_long_description_and_save_it() throws Throwable
		{
			//negative code
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Code());
			atiisprm057obj.Code().click();
			System.out.println(testdata.get("CodeNegative").trim());
			atiisprm057obj.Code().sendKeys(testdata.get("CodeNegative").trim());
			atiisprm057obj.Code().sendKeys(Keys.TAB);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.ErrorPopup());
			boolean at=atiisprm057obj.ErrorPopup().isDisplayed();
		//	String et="Minimum value should be 1 1";
			if(at==true)
			{
				System.out.println("Enter a valid code");
				atiisprm057obj.Ok().click();
			}
			else
			{
				Assert.fail();
			}
	
			//right code
			for (int i = 0; i <200; i++) {
				try {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Code());
			selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm057obj.Code());
			//atiisprm057obj.Code().sendKeys(testdata.get("Code"));
			atiisprm057obj.Code().sendKeys("4444");
			break;
				} catch (Exception e) {

				}
			}
			//brief des
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.BriefDescription());
			atiisprm057obj.BriefDescription().click();
			atiisprm057obj.BriefDescription().sendKeys(testdata.get("BriefDes"));
			//long des
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.LongDescription());
			atiisprm057obj.LongDescription().click();
			atiisprm057obj.LongDescription().sendKeys(testdata.get("LongDes"));
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Type());
			atiisprm057obj.Type().sendKeys(Keys.ENTER);
			atiisprm057obj.Type().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Save());
			atiisprm057obj.Save().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.ConfirmOk());
			atiisprm057obj.ConfirmOk().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Ok());
			atiisprm057obj.Ok().click();
		
			System.out.println("Record is created");
		}

	 

		@And("^user_57 check first last prev next button$")
		public void user_57_check_first_last_prev_next_button() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Search());
			atiisprm057obj.Search().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Clear());
			atiisprm057obj.Clear().click();
			waitHelper.setImplicitWait(30);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.NextButton());
			atiisprm057obj.NextButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.LastButton());
			atiisprm057obj.LastButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.PrevButton());
			atiisprm057obj.PrevButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.FirstButton());
			atiisprm057obj.FirstButton().click();
			System.out.println("first last prev next button is working");
		}

		@And("^user_57 check sorting functionality$")
		public void user_57_check_sorting_functionality() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.SortSearch());
			atiisprm057obj.SortSearch().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Add());
			atiisprm057obj.Add().click();
			//sort code
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.SortOptions());
			atiisprm057obj.SortOptions().click();
			atiisprm057obj.SortOptions().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.SortingInput());
			atiisprm057obj.SortingInput().click();
			//atiisprm057obj.SortingInput().sendKeys(testdata.get("Code"));
			atiisprm057obj.SortingInput().sendKeys("4444");
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.FindButton());
			atiisprm057obj.FindButton().click();
			System.out.println("Code is sorted");
		}
	
		/*@And("^user_57 search the code to check searching is working$")
		public void user_57_search_the_code_to_check_searching_is_working() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Search());
			atiisprm057obj.Search().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.SearchCode());
			atiisprm057obj.SearchCode().click();
			atiisprm057obj.SearchCode().sendKeys(testdata.get("Code"));
			atiisprm057obj.SearchCode().sendKeys(Keys.ENTER);
			//search is working
			Assert.assertTrue(atiisprm057obj.SelectCode().isDisplayed());
			System.out.println("Searching is working properly");
			//waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.GridCode());
			//selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm057obj.GridCode());
		}*/

		@And("^user_57 check grid is listing all relevant data$")
		public void user_57_check_grid_is_listing_all_relevant_data() throws Throwable
		{
			Thread.sleep(3000);
			//grid is listing all relevant data
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.GridCode());
			Assert.assertTrue(atiisprm057obj.GridCode().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.GridBrief());
			Assert.assertTrue(atiisprm057obj.GridBrief().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.GridLong());
			Assert.assertTrue(atiisprm057obj.GridLong().isDisplayed());
			System.out.println("Grid is listing all relevant data");
			selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm057obj.GridCode());
		}

		

		@And("^user_57 retrieve the code and delete it$")
		public void user_57_retrieve_the_code_and_delete_it() throws Throwable
		{
			Thread.sleep(3000);
			
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Delete());
			atiisprm057obj.Delete().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.ConfirmOk());
			atiisprm057obj.ConfirmOk().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.Ok());
			atiisprm057obj.Ok().click();
				
				
				System.out.println("Code is deleted");
		}

		@And("^user_57 close the screen$")
		public void user_57_close_the_screen() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm057obj.CloseScreen());
			atiisprm057obj.CloseScreen().click();
			System.out.println("Screen is closed");
		}

	}
