
	package stepdefinitions;

	import java.util.Map;


	import org.openqa.selenium.By;
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
    import pageobjects.CommonElements.AT_IISPRM_053_OBJ;
	import pageobjects.CommonElements.FMSCommonWebElements;
	import resources.BaseClass;

	 

	public class ItemProperty_053 extends BaseClass
	{
		WebDriver driver = BaseClass.driver;
		FMSLogin FMSLogin = new FMSLogin(driver);
		IISLogin iisLogin = new IISLogin(driver);
		AT_IISPRM_053_OBJ atiisprm053obj =new AT_IISPRM_053_OBJ(driver);
		WaitHelper waitHelper = new WaitHelper(driver);
		Selenium_Actions seleniumActions = new Selenium_Actions(driver);
		ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
		FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
		ConfigFileReader configFileReader = new ConfigFileReader();
		//String path = System.getProperty("user.dir") +"\\TestData\\iisprmTestData.xlsx";
		//ExcelData excelData = new ExcelData(path,"ItemProperly","Test Set id ");
		//Map<String, String> testdata;	
		
		
		String path = System.getProperty("user.dir") +"\\TestData\\iisprmTestData.xlsx";
		//String path="C:\\Users\\ININDC00629\\git\\AZENTIO-FMS1\\AzentioAutomationFramework_FMS_Ajith\\TestData\\iisprmTestData.xlsx";
		ExcelData exceldata = new ExcelData(path,"ReasonCode","DataSetID");
		Map<String, String> testdata;

		
		
		
		
		@Given("^user_53 navigate to the IISParam Application and login with valid credentials$")
	    public void user_53_navigate_to_the_IISParam_Application_and_login_with_valid_credentials() throws Throwable 
		{
			driver.get(configFileReader.getIISParamApplicationUrl());
			iisLogin.loginIntoIISParamApplication(configFileReader.getIISParamApplicationUserType());
	    }
		
		
		@And("^user_53 click on parameters$")
		public void user_53_click_on_parameters() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.Parameters());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.Parameters());
		}
		
		@And("^user_53 click on Item under the parameters$")
		public void user_53_click_on_Item_under_the_parameters() {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.Itemtabunderparameters());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.Itemtabunderparameters());
		}
		
		
		
		@And ("^user_53 click on Item Property Tab under the Item$")
		public void user_53_click_on_Item_Property_Tab_under_the_Item() {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.ItemProperly());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.ItemProperly());
		}
		
		@And("^user_53 check menus and lists are available$")
		public void user_53_check_menus_and_lists_are_available() {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.MaintananceunderItemProperty());
			Assert.assertTrue(atiisprm053obj.MaintananceunderItemProperty().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.ListunderItemProperty());
			Assert.assertTrue(atiisprm053obj.ListunderItemProperty().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.UpdateAfterApproveunderitemproperty());
			Assert.assertTrue(atiisprm053obj.UpdateAfterApproveunderitemproperty().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.RejectunderItemProperty());
			Assert.assertTrue(atiisprm053obj.RejectunderItemProperty().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.ApproveunderItemProperty());
			Assert.assertTrue(atiisprm053obj.ApproveunderItemProperty().isDisplayed());
			System.out.println("Menus and lists are available");
		}
		
		
		
		@And ("^user_53 click on maintenance under the Item Properly Tab$")
		public void user_53_click_on_maintenance_under_the_Item_Properly_Tab() {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.MaintananceunderItemProperty());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.MaintananceunderItemProperty());
		}
		
		@Then("^user_53 update test data set id for AT_iisprm_058$")
		public void user_53_update_test_data_set_id_for_AT_iisprm_058(){
			testdata = exceldata.getTestdata("AT_iisprm_058_ID1");
			//System.out.println(testdata.keySet());
		}
		
		@And("^user_53 enter code brief description long description$")
		public void user_53_enter_code_brief_description_long_description() throws Throwable
		{
			//negative code
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.CodeTab());
			atiisprm053obj.CodeTab().click();
			System.out.println(testdata.get("CodeNegative").trim());
			atiisprm053obj.CodeTab().sendKeys(testdata.get("CodeNegative").trim());
			atiisprm053obj.CodeTab().sendKeys(Keys.TAB);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.ErrorPopup());
			boolean at=atiisprm053obj.ErrorPopup().isDisplayed();
		//	String et="Minimum value should be 1 1";
			if(at==true)
			{
				System.out.println("Enter a valid code");
				atiisprm053obj.ok().click();
			}
			else
			{
				Assert.fail();
			}
	
			//right code
			for (int i = 0; i <200; i++) {
				try {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.CodeTab());
			seleniumActions.getClickAndActionsHelper().doubleClick(atiisprm053obj.CodeTab());
			atiisprm053obj.CodeTab().sendKeys(testdata.get("Code"));
			break;
				} catch (Exception e) {

				}
			}
			//brief des
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.BriefDescription());
			atiisprm053obj.BriefDescription().click();
			atiisprm053obj.BriefDescription().sendKeys(testdata.get("BriefDes"));
			//long des
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.Longdescription());
			atiisprm053obj.Longdescription().click();
			atiisprm053obj.Longdescription().sendKeys(testdata.get("LongDes"));
		
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.Allowduplicatevalue());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.Allowduplicatevalue());
			System.out.println("Record is created");
		}

	 

		
		
		@And("^user_53 click on save button$")
		public void user_53_click_on_save_button() {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.SavebuttonunderAdditionalDetail());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.SavebuttonunderAdditionalDetail());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.Okpopupaftersave());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.Okpopupaftersave());
	        waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.successfullyokpopupaftersave());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.successfullyokpopupaftersave());
		
		}
		
		
		
		@And("^user_53 click on search Tab$")
		public void user_53_click_on_search_Tab() {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.SearchTabunderItemProperly());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.SearchTabunderItemProperly());
			
			
		}
		
		@And("^user_53 check first last prev next button$")
		public void user_53_check_first_last_prev_next_button() throws Throwable
		{
			//waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.Search());
			//atiisprm053obj.Search().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.ClearSearch());
			atiisprm053obj.ClearSearch().click();
			//waitHelper.setImplicitWait(30);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.NextButton());
			atiisprm053obj.NextButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.LastButton());
			atiisprm053obj.LastButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.PrevButton());
			atiisprm053obj.PrevButton().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.FirstButton());
			atiisprm053obj.FirstButton().click();
			System.out.println("first last prev next button is working");
		}		
		
		
		
		@And("^user_53 check sorting functionality$")
		public void user_57_check_sorting_functionality() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.ClearSearch());
			atiisprm053obj.ClearSearch().click();
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.SortSearch());
			atiisprm053obj.SortSearch().click();
			//waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.Add());
			//atiisprm053obj.Add().click();
			//sort code
			
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.SortOptions());
			atiisprm053obj.SortOptions().click();
			atiisprm053obj.SortOptions().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.SortingInput());
			atiisprm053obj.SortingInput().click();
			atiisprm053obj.SortingInput().sendKeys(testdata.get("Code"));
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.FindButton());
			atiisprm053obj.FindButton().click();

			System.out.println("Code is sorted");
		
		}
			
		
		
		@And("^user_53 select the retrive data$")
		public void user_53_select_the_retrive_data() throws Throwable {
			//waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.RetriveData());
			//grid is listing all relevant data
			Thread.sleep(3000);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.PROPERTY_CODE());
			Assert.assertTrue(atiisprm053obj.PROPERTY_CODE().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.BRIEF_DESC_ENG());
			Assert.assertTrue(atiisprm053obj.BRIEF_DESC_ENG().isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.LONG_DESC_ENG());
			Assert.assertTrue(atiisprm053obj.LONG_DESC_ENG().isDisplayed());
			//waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.BRIEF_DESC_ARAB());
			//Assert.assertTrue(atiisprm053obj.BRIEF_DESC_ARAB().isDisplayed());
			System.out.println("Grid is listing all relevant data");
			seleniumActions.getClickAndActionsHelper().doubleClick(atiisprm053obj.selected());
			
			
			
		}
			
		
		@And("^user_53 click on delete button$")
		public void user_53_click_on_delete_button() throws Throwable {
			
			Thread.sleep(3000);
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.Deleteundermaininformation());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.Deleteundermaininformation());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.YesPopupAfterDelete());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.YesPopupAfterDelete());
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.okconfirmPopupAfterDelete());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm053obj.okconfirmPopupAfterDelete());
		
		}
		
		@And("^user_53 close the screen$")
		public void user_53_close_the_screen() throws Throwable
		{
			waitHelper.waitForElementwithFluentwait(driver, atiisprm053obj.CloseScreen());
			atiisprm053obj.CloseScreen().click();
			System.out.println("Screen is closed");
		}

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

