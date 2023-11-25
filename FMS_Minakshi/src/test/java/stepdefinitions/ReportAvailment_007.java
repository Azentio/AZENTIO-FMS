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
import pageobjects.fms.ReportAvailment_007_OBJ;
import resources.BaseClass;

	 

public class ReportAvailment_007 extends BaseClass
	{
		WebDriver driver = BaseClass.driver;
		FMSLogin FMSLogin = new FMSLogin(driver);
		IISLogin iisLogin = new IISLogin(driver);
		ReportAvailment_007_OBJ reportAvailment =new ReportAvailment_007_OBJ(driver);
		WaitHelper waitHelper = new WaitHelper(driver);
		Selenium_Actions seleniumActions = new Selenium_Actions(driver);
		ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
		FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
		ConfigFileReader configFileReader = new ConfigFileReader();

		@Given("^User_007 navigate to FMS application and login with valid credentials$")
	    public void User_007_navigate_to_fms_application_and_login_with_valid_credentials() throws Throwable {
			driver.get(configFileReader.getFMSApplicationUrl());
			FMSLogin.loginIntoFmsApplication(configFileReader.getFMSApplicationUserType());
	    }

		@And("^User_007 Click on Report menu$")
		public void User_007_Click_on_Report_menu() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.Report());
			for (int i = 1; i <= 200; i++)

				try {
					reportAvailment.Report().click();
					
					break;
					
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			javascriptHelper.scrollIntoView(reportAvailment.Report());
		}
		
		@And("^User_007 Click on Availment Ticket sub menu under Report menu$")
		public void User_007_Click_on_Availment_Ticket_sub_menu_under_Report_menu() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.AvailmentTicket());	
			for (int i = 1; i <= 200; i++)

				try {
					reportAvailment.AvailmentTicket().click();
					
					break;
					
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			
		}
		
		
		/*@And("^User_007 Click on parameter under Availment Ticket$")
		public void User_007_Click_on_parameter_under_Availment_Ticket() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.Parameter());
			for (int i = 1; i <= 200; i++)

				try {
					reportAvailment.Parameter().click();
					
					break;
					
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			
		}*/
		
		
		@And("^User_007 Click on CIF No Tab$")
		public void User_007_Click_on_CIF_No_Tab() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.CIFNo());
			seleniumActions.getClickAndActionsHelper().clickOnElement(reportAvailment.CIFNo());
		}
		
		@And("^User_007 Enter CIF No$") 
		public void User_007_Enter_CIF_No() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.CIFNo());
			reportAvailment.CIFNo().sendKeys("77");
		}
		
		@And("^User_007 click on Without header and footer$")
		public void User_007_click_on_Without_header_and_footer() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.WithoutHeader());
			seleniumActions.getClickAndActionsHelper().clickOnElement(reportAvailment.WithoutHeader());
		}
		
		@And("^User_007 Click On Retrive Button$")
		public void User_007_Click_On_Retrive_Button() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.RetriveButton());
			seleniumActions.getClickAndActionsHelper().clickOnElement(reportAvailment.RetriveButton());
			Thread.sleep(3000);
		}
		
		@And("^User_007 Click On Availment Ticket sub Report Drawdown$")
		public void User_007_Click_On_Availment_Ticket_sub_Report_Drawdown() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.AvailmentTicketsubDrawdown());
			for (int i = 1; i <= 200; i++)

				try {
					reportAvailment.AvailmentTicketsubDrawdown().click();
					
					break;
					
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			
		}
		
		@And("^User_007 Click On Branch code and Enter code$")
		public void User_007_Click_On_Branch_code_and_Enter_code() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.BranchCode());
			seleniumActions.getClickAndActionsHelper().clickOnElement(reportAvailment.BranchCode());
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.BranchCode());
			for (int i = 1; i <= 200; i++)

				try {
					reportAvailment.BranchCode().sendKeys("101");
					
					break;
					
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			
			
			
		}
		@And("^User_007 Click On Retrive btn$")
		public void User_007_Click_On_Retrive_btn() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.Retrive());
			seleniumActions.getClickAndActionsHelper().clickOnElement(reportAvailment.Retrive());
			Thread.sleep(5000);
		}
		/*@And("^User_007 Check the draw down linked in TFA are displaying in the report$")
		public void User_007_Check_the_draw_down_linked_in_TFA_are_displaying_in_the_report() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.Drawdowndisplayingreport());
			Assert.assertTrue(reportAvailment.Drawdowndisplayingreport().isDisplayed());
		}*/
		
		@And("^User_007 Click On Availment Ticket sub Report Facility$")
		public void User_007_Click_On_Availment_Ticket_sub_Report_Facility() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.AvailmentTicketsubfacility());
			for (int i = 1; i <= 200; i++)

				try {
					reportAvailment.AvailmentTicketsubfacility().click();
					
					break;
					
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			
		}
		
		
		
		/*@And("^User_007 Check the draw down details are displaying when the user specify the particular facility$")
		public void User_007_Check_the_draw_dow_details_are_displaying_when_the_user_specify_the_particular_facility() {
			waitHelper.waitForElementwithFluentwait(driver, reportAvailment.facilitydisplayingdetail());
			Assert.assertTrue(reportAvailment.facilitydisplayingdetail().isDisplayed());
		}*/

		
		
}
