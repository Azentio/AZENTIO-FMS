package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.fms.CorporateScreen_016_OBJ;
import resources.BaseClass;

	 

		public class CORPORATESCREEN_016 extends BaseClass
		{
			WebDriver driver = BaseClass.driver;
			FMSLogin FMSLogin = new FMSLogin(driver);
			IISLogin iisLogin = new IISLogin(driver);
			CorporateScreen_016_OBJ corporatepackage_016 =new CorporateScreen_016_OBJ(driver);
			WaitHelper waitHelper = new WaitHelper(driver);
			ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
			JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
			Selenium_Actions selenium_actions = new Selenium_Actions(driver);
			ConfigFileReader configFileReader = new ConfigFileReader();

			@Given("^User_016 navigate to FMS param application and login with valid credentials$")
		    public void User_016_navigate_to_fms_param_application_and_login_with_valid_credentials() throws Throwable {
				driver.get(configFileReader.getFMSparamsUrl());
				System.out.println(configFileReader.getFMSParamApplicationUserType());
				FMSLogin.loginIntoFmsParamApplication(configFileReader.getFMSParamApplicationUserType());
		    }
			@And("^User_016 click parameter Menu$")
			public void User_016_click_parameter_Menu() {
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_016.Parameter());
				selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_016.Parameter());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_016.Parameter());	
			}
			
			@And("^User_016 click on corporate packages$")
			public void User_016_click_on_corporate_packages() {
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_016.Coporatepackage());
				selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_016.Coporatepackage());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_016.Coporatepackage());
			}
			
			@And("^User_016 click on maintanance$")
			public void User_016_click_on_maintanance() throws Throwable {
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_016.maintanance());
				for (int i = 0; i <= 300; i++) {
					try {
						selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_016.maintanance());
				    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_016.maintanance());
						break;

					} catch (Exception e) {
						if (i == 300)
							Assert.fail(e.getMessage());
					}
				}
				Thread.sleep(3000);
			}
			
			@And("^User_016 Check the additional Field Group ID added next to the Product Class field under the Rates section$")
			public void User_016_Check_the_additional_Field_Group_ID_added_next_to_the_Product_Class_field_under_the_Rates_section() {
				waitHelper.waitForElementwithFluentwait(driver,corporatepackage_016 .GroupID());
				String a= "Group ID";
				String b= corporatepackage_016.GroupID().getText();
				if(a.equalsIgnoreCase(b))
				{
				Assert.assertTrue(corporatepackage_016.GroupID().isDisplayed());
				System.out.println("An Additional Field \"Group ID\" should be available next to the Product class under Rates section");
				}
				else
				{
					Assert.fail();
				}
			}
			
			
			
}
		
		
		
		
