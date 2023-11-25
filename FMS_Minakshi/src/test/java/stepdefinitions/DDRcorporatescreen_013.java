package stepdefinitions;
import java.util.Map;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.fms.CorporateScreen_013_OBJ;
import resources.BaseClass;

	 

		public class DDRcorporatescreen_013 extends BaseClass
		{
			WebDriver driver = BaseClass.driver;
			FMSLogin FMSLogin = new FMSLogin(driver);
			IISLogin iisLogin = new IISLogin(driver);
			CorporateScreen_013_OBJ corporatepackage_013 =new CorporateScreen_013_OBJ(driver);
			WaitHelper waitHelper = new WaitHelper(driver);
			ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
			JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
			Selenium_Actions selenium_actions = new Selenium_Actions(driver);
			ConfigFileReader configFileReader = new ConfigFileReader();

			@And("^User_013 click on language$")
			public void User_013_click_on_language() throws Throwable {
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.Language());
				selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_013.Language());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_013.Language());
		    	Thread.sleep(3000);
		    	waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.French());
				selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_013.French());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_013.French());
		    	
			}
			
			@And("^User_013 click parameter Menu$")
			public void User_013_click_parameter_Menu() {
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.Parameter());
				selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_013.Parameter());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_013.Parameter());	
			}
			
			@And("^User_013 click on corporate packages$")
			public void User_013_click_on_corporate_packages() {
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.Coporatepackage());
				selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_013.Coporatepackage());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_013.Coporatepackage());
			}
			
			@And("^User_013 click on maintanance$")
			public void User_013_click_on_maintanance() {
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.maintanance());
				selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_013.maintanance());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_013.maintanance());
			}
			
			@And("^User_013 group limit tab unser maintanance$")
			public void User_013_group_limit_tab_unser_maintanance() {
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.GroupLimit());
				selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_013.GroupLimit());
		    	selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_013.GroupLimit());
			}
			@And("^User_013 Click on Add new Row Under Yeild Detail$")
			public void User_013_Click_on_Add_new_Row_Under_Yeild_Detail() {
				selenium_actions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_013.Addicon());
			 	selenium_actions.getClickAndActionsHelper().moveToElement(corporatepackage_013.Addicon());
				selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_013.Addicon());
				
			}
			
			@And("^User_013 Check for the new section Group Limit added in this screen with the below features$")
            public void User_013_Check_for_the_new_section_Group_Limit_added_in_this_screen_with_the_below_features() {
				selenium_actions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_013.Groupidtab());
				selenium_actions.getClickAndActionsHelper().clickOnElement(corporatepackage_013.Groupidtab());
				waitHelper.waitForElementwithFluentwait(driver,corporatepackage_013 .Groupid());
				Assert.assertTrue(corporatepackage_013.Groupid().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.Groupname());
				Assert.assertTrue(corporatepackage_013.Groupname().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.limit());
				Assert.assertTrue(corporatepackage_013.limit().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.utilizedlimit());
				Assert.assertTrue(corporatepackage_013.utilizedlimit().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.Remaininglimit());
				Assert.assertTrue(corporatepackage_013.Remaininglimit().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.insert());
				Assert.assertTrue(corporatepackage_013.insert().isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, corporatepackage_013.Delete());
				Assert.assertTrue(corporatepackage_013.Delete().isDisplayed());
				System.out.println("The above new section and all fields should be displayed in French");
            }
}
