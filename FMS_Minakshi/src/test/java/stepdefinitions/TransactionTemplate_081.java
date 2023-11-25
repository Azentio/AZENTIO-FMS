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
import io.cucumber.java.en.Given;
import pageobjects.fms.TransactionTemplate_081_OBJ;
import resources.BaseClass;

		 

public class TransactionTemplate_081  extends BaseClass
			{
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	TransactionTemplate_081_OBJ transactiontemplate_081 =new TransactionTemplate_081_OBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Selenium_Actions selenium_actions = new Selenium_Actions(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();

	
	@Given("^User_081 navigate to FMS param application and login with valid credentials$")
    public void User_081_navigate_to_fms_param_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSparamsUrl());
		System.out.println(configFileReader.getFMSParamApplicationUserType());
		FMSLogin.loginIntoFmsParamApplication(configFileReader.getFMSParamApplicationUserType());
    }
	@And("^User_081 Click Parameter Menu$")
	public void User_081_Click_Parameter_Menu() {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.Parameter());
		selenium_actions.getClickAndActionsHelper().moveToElement(transactiontemplate_081.Parameter());
    	selenium_actions.getClickAndActionsHelper().clickOnElement(transactiontemplate_081.Parameter());	
	}

	@And("^User_081 Click Transaction Template Menu$")
	public void User_081_Click_Transaction_Template_Menu() {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.Transactiontemplate());
		selenium_actions.getClickAndActionsHelper().moveToElement(transactiontemplate_081.Transactiontemplate());
		for (int i = 1; i <= 200; i++)

			try {
				transactiontemplate_081.Transactiontemplate().click();
				
				break;
				
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
	}
	
	@And("^User_081 Click Maintanance Under Transaction Template$")
	public void Click_Maintanance_Under_Transaction_Template() {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.Maintannance());
		for (int i = 1; i <= 200; i++)

			try {
				transactiontemplate_081.Maintannance().click();
				
				break;
				
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
	}
	@And("^User_081 Click Add Icon Under Maintanance$")
	public void User_081_Click_Add_Icon_Under_Maintanance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.AddIcon());
		for (int i = 1; i <= 200; i++)

			try {
				transactiontemplate_081.AddIcon().click();
				
				break;
				
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
	}
		@And("^User_081 Click on LN Under AddIcon$")
		public void User_081_Click_on_LN_Under_AddIcon() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.LN());
		Thread.sleep(3000);
		selenium_actions.getClickAndActionsHelper().doubleClick(transactiontemplate_081.LN());
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.LNvalidate());
		Assert.assertTrue(transactiontemplate_081.LNvalidate().isDisplayed());
		Thread.sleep(3000);
		selenium_actions.getJavascriptHelper().scrollIntoView(transactiontemplate_081.PlusIconUnderFormula());
	}
	
	@And("^User_081 Click on Plus Icon Under Formula in Amount$")
	public void User_081_Click_on_Plus_Icon_Under_Formula_in_Amount() {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.PlusIconUnderFormula());
		selenium_actions.getClickAndActionsHelper().clickOnElement(transactiontemplate_081.PlusIconUnderFormula());
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.ApplyAmount());
		Assert.assertTrue(transactiontemplate_081.ApplyAmount().isDisplayed());
	}
	
	@And("^User_081 Click Add Icon Under Formula in Amount$")
	public void User_081_Click_Add_Icon_Under_Formula_in_Amount() {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.AddIconUnderFormula());
		selenium_actions.getClickAndActionsHelper().clickOnElement(transactiontemplate_081.AddIconUnderFormula());
		
	}
	@And("^User_081 Click on List Of Fields$")
	public void User_081_Click_on_List_Of_Fields() {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.ListOfField());	
		selenium_actions.getClickAndActionsHelper().clickOnElement(transactiontemplate_081.ListOfField());
	}
	
	@And("^User_081 drawDown Field$")
	public void User_081_drawDown_Field() {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.drawDownField());
		selenium_actions.getClickAndActionsHelper().clickOnElement(transactiontemplate_081.drawDownField());
		
	}
	
	@And("^User_081 Check new elements Down Payment and Down Payment Refund is added to the amount$")
	public void User_081_Check_new_elements_Down_Payment_and_Down_Payment_Refund_is_added_to_the_amount() {
		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.DownPayment());
		Assert.assertTrue(transactiontemplate_081.DownPayment().isDisplayed());

		waitHelper.waitForElementwithFluentwait(driver, transactiontemplate_081.DownPaymentRefund());
		Assert.assertTrue(transactiontemplate_081.DownPaymentRefund().isDisplayed());

	}	
}
