
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
import pageobjects.fms.CorporateScreen_017_obj;
import resources.BaseClass;

	 

public class CORPORATESCREEN_017 extends BaseClass
{
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	CorporateScreen_017_obj corporatepackage_017 =new CorporateScreen_017_obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	//ExcelData excelData = new ExcelData(path,"DrawDownRequest","DataSet ID");
	ExcelData drawDownRequestData = new ExcelData(path,"DrawDownRequest","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;
	
	
			@And("^User_017 Update test data set id for AT_DDR_017$")
			public void User_017_update_test_data_set_id_for_AT_DDR_017() {
				testExecutionData = testExecution.getTestdata("AT_DDR_017");
		    	testData = drawDownRequestData.getTestdata(testExecutionData.get("Data Set ID"));
			}
			
			@And("^User_017 Click on Search button$")
			public void User_017_Click_on_Search_button() {
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.SearchButton());
				seleniumactions.getClickAndActionsHelper().moveToElement(corporatepackage_017.SearchButton());
				seleniumactions.getClickAndActionsHelper().clickOnElement(corporatepackage_017.SearchButton());
			}
			
			@And("^User_017 Click on code tab and Enter code No$")
			public void User_017_Click_on_code_tab_and_Enter_code_No() {
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.CodeTab());
				seleniumactions.getClickAndActionsHelper().moveToElement(corporatepackage_017.CodeTab());
				seleniumactions.getClickAndActionsHelper().clickOnElement(corporatepackage_017.CodeTab());
				corporatepackage_017.CodeTab().sendKeys("0021");
				corporatepackage_017.CodeTab().sendKeys(Keys.ENTER);
			}
			
			@And("^User_017 Click on Retrive data$")
			public void User_017_Click_on_Retrive_data() {
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.RetriveData());
				seleniumactions.getClickAndActionsHelper().moveToElement(corporatepackage_017.RetriveData());
				seleniumactions.getClickAndActionsHelper().doubleClick(corporatepackage_017.RetriveData());
			}
			@And("^User_017 Click on add Icon under rates session$")
			public void User_017_Click_on_add_Icon_under_rates_session() {
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.Addicon());
				seleniumactions.getClickAndActionsHelper().moveToElement(corporatepackage_017.Addicon());
				seleniumactions.getClickAndActionsHelper().clickOnElement(corporatepackage_017.Addicon());
			}
			@And("^User_017 Click on Product Class and Enter Data$")
			public void User_017_Click_on_Product_Class_and_Enter_Data() throws Throwable {
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.ProductClass());
				seleniumactions.getClickAndActionsHelper().clickOnElement(corporatepackage_017.ProductClass());
				Thread.sleep(3000);
				Assert.assertTrue(corporatepackage_017.ProductClasstab().isDisplayed());
				//corporatepackage_017.ProductClass().sendKeys(testData.get("ProductClass").trim());
				corporatepackage_017.ProductClasstab().sendKeys("01");
				corporatepackage_017.ProductClasstab().sendKeys(Keys.ENTER);
				
			}
			@And("^User_017 Click on Yield Detail$")
			public void User_017_Click_on_Yield_Detail() throws Throwable {
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.YeildDetail());
				seleniumactions.getClickAndActionsHelper().moveToElement(corporatepackage_017.YeildDetail());
				seleniumactions.getClickAndActionsHelper().clickOnElement(corporatepackage_017.YeildDetail());
				Thread.sleep(2000);
				Assert.assertTrue(corporatepackage_017.YeildDetailScreen().isDisplayed());
			}
			@And("^User_017 Click on Add new Row Under Yeild Detail$")
			public void User_017_Click_on_Add_new_Row_Under_Yeild_Detail() {
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.AddunderYeildDetail());
			 	seleniumactions.getClickAndActionsHelper().moveToElement(corporatepackage_017.AddunderYeildDetail());
				seleniumactions.getClickAndActionsHelper().clickOnElement(corporatepackage_017.AddunderYeildDetail());
				
			}
			@And("^User_017 Check the new button for rates added under the Rates scetion in Corporate Package screen$")
			public void User_017_Check_the_new_button_for_rates_added_under_the_Rates_scetion_in_Corporate_Package_screen() {
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.NumberOfPaymentstab());
				seleniumactions.getClickAndActionsHelper().clickOnElement(corporatepackage_017.NumberOfPaymentstab());
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.NumberOfPayments());
				Assert.assertTrue(corporatepackage_017.NumberOfPayments().isDisplayed());
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.Margine());
				Assert.assertTrue(corporatepackage_017.Margine().isDisplayed());
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.Fixed());
				Assert.assertTrue(corporatepackage_017.Fixed().isDisplayed());
				seleniumactions.getWaitHelper().waitForElementwithFluentwait(driver,corporatepackage_017.CapRate());
				Assert.assertTrue(corporatepackage_017.Fixed().isDisplayed());
			}
}
