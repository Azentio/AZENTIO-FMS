package stepdefinitions;
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
import pageobjects.CommonElements.FMSCommonWebElements;
import pageobjects.fms.CustomerGrading_001_OBJ;
import resources.BaseClass;

 

public class CustomerGrading_001 extends BaseClass
{
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	CustomerGrading_001_OBJ customergrading001_obj =new CustomerGrading_001_OBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();

	@And("^User_001 Click on Grading Menu$")
	public void User_001_Click_on_Grading_Menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.GRADING());
		for (int i = 0; i <= 300; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(customergrading001_obj.GRADING());
		    	seleniumActions.getClickAndActionsHelper().clickOnElement(customergrading001_obj.GRADING());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
		Thread.sleep(3000);
	}
	
	
	@And("^User_001 Click on Maintenance Under Grading$")
	public void User_001_Click_on_Maintenance_Under_Grading() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.MAINTENANCE());
		for (int i = 0; i <= 300; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(customergrading001_obj.MAINTENANCE());
		    	seleniumActions.getClickAndActionsHelper().clickOnElement(customergrading001_obj.MAINTENANCE());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
		Thread.sleep(3000);
	}
	
	@And("^User_001 Click APPi Ref Tab Under Maintenance$")
	public void User_001_Click_APPi_Ref_Tab_Under_Maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.APPIREF());
		for (int i = 0; i <= 300; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(customergrading001_obj.APPIREF());
		    	seleniumActions.getClickAndActionsHelper().clickOnElement(customergrading001_obj.APPIREF());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
		Thread.sleep(3000);
	}
	
	@And("^User_001 Enter Appi Ref Code$")
	public void User_001_Enter_Appi_Ref_Code() {
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.APPIREF());
		for (int i = 0; i <= 300; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(customergrading001_obj.APPIREF());
				customergrading001_obj.APPIREF().sendKeys("5884");
				customergrading001_obj.APPIREF().sendKeys(Keys.TAB);
		    	//seleniumActions.getClickAndActionsHelper().doubleClick(customergrading001_obj.APPIREF());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@And("^User_001 Check the system defaults the eligible Grading Factors$")
	public void User_001_Check_the_system_defaults_the_eligible_Grading_Factors() {
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.ELIGIBLEGRADINGFACTOR());
		Assert.assertTrue(customergrading001_obj.ELIGIBLEGRADINGFACTOR().isDisplayed());
		System.out.println("System should default the eligible Grading Factors for the application");
		
	}
	
	
	@And("^User_001 Click on Gride Line No$")
	public void User_001_Click_on_Gride_Line_No() {
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.LN());
		seleniumActions.getClickAndActionsHelper().clickOnElement(customergrading001_obj.LN());
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.GRIDELINENO());
		for (int i = 0; i <= 300; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(customergrading001_obj.GRIDELINENO());
		    	seleniumActions.getClickAndActionsHelper().clickOnElement(customergrading001_obj.GRIDELINENO());
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.GRIDELINENO());
		customergrading001_obj.GRIDELINENO().sendKeys("1");
	}
	
	@And("^User_001 Check the system is defaulting the Actual Score based on the scoring value and weightage value$")
	public void User_001_Check_the_system_is_defaulting_the_Actual_Score_based_on_the_scoring_value_and_weightage_value() {
		waitHelper.waitForElementwithFluentwait(driver, customergrading001_obj.ACTUALSCOREVALUE());
		Assert.assertTrue(customergrading001_obj.ACTUALSCOREVALUE().isDisplayed());
		System.out.println("System should default the Actual Score based on the scoring value and weightage value");
	}	
	
	
	
}
