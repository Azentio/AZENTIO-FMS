
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
        import pageobjects.CommonElements.AT_IISPRM_056_OBJ;
        import pageobjects.CommonElements.FMSCommonWebElements;
		
		import resources.BaseClass;

		 

		public class Insurance_Type_056 extends BaseClass
		{
			WebDriver driver = BaseClass.driver;
			FMSLogin FMSLogin = new FMSLogin(driver);
			IISLogin iisLogin = new IISLogin(driver);
			AT_IISPRM_056_OBJ atiisprm056obj =new AT_IISPRM_056_OBJ(driver);
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

		 

			@Given("^user_56 navigate to the IISParam application and login with the valid credentials$")
		    public void user_56_navigate_to_the_IISParam_application_and_login_with_the_valid_credentials() throws Throwable 
			{
				driver.get(configFileReader.getIISParamApplicationUrl());
				iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
		    }

			@Then("^user_56 update test data set id for AT_iisprm_058$")
			public void user_56_update_test_data_set_id_for_AT_iisprm_058(){
				testdata = exceldata.getTestdata("AT_iisprm_058_ID1");
				//System.out.println(testdata.keySet());
			}
			

			@And("^user_56 click on parameters tab$")
			public void user_56_click_on_parameters_tab() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Parameters());
				atiisprm056obj.Parameters().click();
				javascriptHelper.scrollIntoView(atiisprm056obj.Parameters());
			}

			@And("^user_56 click on Insurance Type$")
			public void user_56_click_on_Insurance_Type() throws Throwable
			{
				for(int i=1;i<=50;i++) {
					try {
						waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.InsuranceType());
						atiisprm056obj.InsuranceType().click();
						break;
					} catch (Exception e) {
						if (i == 200) {
							Assert.fail(e.getMessage());
					}
					}
				}
			}
			@And("^user_56 check menus and lists are available$")
			public void user_56_check_menus_and_lists_are_available() throws Throwable
			{
				Thread.sleep(3000);
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Maintenance());
				Assert.assertTrue(atiisprm056obj.Maintenance().isDisplayed());
				//waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.List());
				//Assert.assertTrue(atiisprm056obj.List().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.UpdateAfterApprove());
				Assert.assertTrue(atiisprm056obj.UpdateAfterApprove().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Reject());
				Assert.assertTrue(atiisprm056obj.Reject().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Approve());
				Assert.assertTrue(atiisprm056obj.Approve().isDisplayed());
				System.out.println("Menus and lists are available");
			}

			@And("^user_56 click on maintenance and create a record$")
			public void user_56_click_on_maintenance_and_create_a_record() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Maintenance());
				atiisprm056obj.Maintenance().click();
			}

			@And("^user_56 enter code brief description long description and save it$")
			public void user_56_enter_code_brief_description_long_description_and_save_it() throws Throwable
			{
				//negative code
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Code());
				atiisprm056obj.Code().click();
				System.out.println(testdata.get("CodeNegative").trim());
				atiisprm056obj.Code().sendKeys(testdata.get("CodeNegative").trim());
				atiisprm056obj.Code().sendKeys(Keys.TAB);
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.ErrorPopup());
				boolean at=atiisprm056obj.ErrorPopup().isDisplayed();
			//	String et="Minimum value should be 1 1";
				if(at==true)
				{
					System.out.println("Enter a valid code");
					atiisprm056obj.Ok().click();
				}
				else
				{
					Assert.fail();
				}
		
				//right code
				for (int i = 0; i <200; i++) {
					try {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Code());
				selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm056obj.Code());
				//atiisprm056obj.Code().sendKeys(testdata.get("Code"));
				atiisprm056obj.Code().sendKeys("9866");
				break;
					} catch (Exception e) {

					}
				}
				//brief des
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.BriefDescription());
				atiisprm056obj.BriefDescription().click();
				atiisprm056obj.BriefDescription().sendKeys(testdata.get("BriefDes"));
				//long des
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.LongDescription());
				atiisprm056obj.LongDescription().click();
				atiisprm056obj.LongDescription().sendKeys(testdata.get("LongDes"));
			
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Save());
				atiisprm056obj.Save().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.ConfirmOk());
				atiisprm056obj.ConfirmOk().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Ok());
				atiisprm056obj.Ok().click();
			
				System.out.println("Record is created");
			}

		 

			@And("^user_56 check first last prev next button$")
			public void user_56_check_first_last_prev_next_button() throws Throwable
			{
				//waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Search());
				//atiisprm056obj.Search().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Clear());
				atiisprm056obj.Clear().click();
				waitHelper.setImplicitWait(30);
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.NextButton());
				atiisprm056obj.NextButton().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.LastButton());
				atiisprm056obj.LastButton().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.PrevButton());
				atiisprm056obj.PrevButton().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.FirstButton());
				atiisprm056obj.FirstButton().click();
				System.out.println("first last prev next button is working");
			
		}
			@And("^user_56 check sorting functionality$")
			public void user_56_check_sorting_functionality() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Clear());
				atiisprm056obj.Clear().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.SortSearch());
				atiisprm056obj.SortSearch().click();
				//waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Add());
				//atiisprm056obj.Add().click();
				//sort code
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.SortOptions());
				atiisprm056obj.SortOptions().click();
				atiisprm056obj.SortOptions().sendKeys(Keys.ENTER);
				atiisprm056obj.SortOptions().sendKeys(Keys.DOWN);
				atiisprm056obj.SortOptions().click();;
				Thread.sleep(3000);
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.SortingInput());
				atiisprm056obj.SortingInput().click();
				//atiisprm056obj.SortingInput().sendKeys(testdata.get("Code"));
				atiisprm056obj.SortingInput().sendKeys("9866");
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.FindButton());
				//atiisprm056obj.FindButton().click();
				selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm056obj.FindButton());
				Thread.sleep(2000);
				System.out.println("Code is sorted");
			}
		
			

			@And("^user_56 check grid is listing all relevant data$")
			public void user_56_check_grid_is_listing_all_relevant_data() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Search());
				atiisprm056obj.Search().click();
				Thread.sleep(3000);
				//grid is listing all relevant data
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.COMPCODE());
				Assert.assertTrue(atiisprm056obj.COMPCODE().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.InsuranceTypeCode());
				Assert.assertTrue(atiisprm056obj.InsuranceTypeCode().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.GridBrief());
				Assert.assertTrue(atiisprm056obj.GridBrief().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.GridLong());
				Assert.assertTrue(atiisprm056obj.GridLong().isDisplayed());
				System.out.println("Grid is listing all relevant data");
				selenium_actions.getClickAndActionsHelper().doubleClick(atiisprm056obj.SelectCode());
			}

			

			@And("^user_56 retrieve the code and delete it$")
			public void user_56_retrieve_the_code_and_delete_it() throws Throwable
			{
				Thread.sleep(3000);
				
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Delete());
				atiisprm056obj.Delete().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.ConfirmOk());
				atiisprm056obj.ConfirmOk().click();
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.Ok());
				atiisprm056obj.Ok().click();
					
					
					System.out.println("Code is deleted");
			}

			@And("^user_56 close the screen$")
			public void user_56_close_the_screen() throws Throwable
			{
				waitHelper.waitForElementwithFluentwait(driver, atiisprm056obj.CloseScreen());
				atiisprm056obj.CloseScreen().click();
				System.out.println("Screen is closed");
			

		}
}