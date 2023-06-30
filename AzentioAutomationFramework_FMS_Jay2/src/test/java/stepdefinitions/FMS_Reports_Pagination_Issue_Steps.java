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
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.FMS_Reports_Pagination_Obj;
import resources.BaseClass;

public class FMS_Reports_Pagination_Issue_Steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMS_Reports_Pagination_Obj fmsReportsPaginationObj = new FMS_Reports_Pagination_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	

	@Given("^navigate to FMS application2 and login with valid credentials$")
	public void navigate_to_fms_application2_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		login.loginIntoFmsApplication2(configFileReader.getFMSApplicationUserType());
	}

	@And("^User_610 click the reports menu$")
	public void user_click_the_reports_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.fms_Reports_Screen_610());
		clicksAndActionsHelper.moveToElement(fmsReportsPaginationObj.fms_Reports_Screen_610());
		clicksAndActionsHelper.clickOnElement(fmsReportsPaginationObj.fms_Reports_Screen_610());
			}

	@And("^User_610 click the availment ticket sub menu$")
	public void user_click_the_availment_ticket_sub_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.fms_AvailmentTicket_SubMenu_610());
		clicksAndActionsHelper.moveToElement(fmsReportsPaginationObj.fms_AvailmentTicket_SubMenu_610());
		clicksAndActionsHelper.clickOnElement(fmsReportsPaginationObj.fms_AvailmentTicket_SubMenu_610());
		
	}

	@And("^User_610 click the cif and enter the cif number in availment ticket sub menu$")
	public void user_click_the_cif_and_enter_the_cif_number_in_availment_ticket_sub_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.enterCIFNO_InavalimentTicket_610());
		clicksAndActionsHelper.moveToElement(fmsReportsPaginationObj.enterCIFNO_InavalimentTicket_610());
		clicksAndActionsHelper.clickOnElement(fmsReportsPaginationObj.enterCIFNO_InavalimentTicket_610());
		fmsReportsPaginationObj.enterCIFNO_InavalimentTicket_610().sendKeys("77",Keys.TAB);
		
	}
	
	@Then("^User_610 click retrieve button to view the report without error$")
	public void user_click_retrieve_button_to_view_the_report_without_error() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.fms_RetrieveKey_InavalimentTicket_610());
		fmsReportsPaginationObj.fms_RetrieveKey_InavalimentTicket_610().click();
	
	}
	  @Then("^User_610 verify system shoudl show the CIF details under availment ticket$")
	    public void verify_system_shoudl_show_the_cif_details_under_availment_ticket() throws Throwable {
	     waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.AvailmentPage1to4_InavalimentTicket_610());
	     JavascriptHelper.scrollIntoView(fmsReportsPaginationObj.AvailmentPage1to4_InavalimentTicket_610());
	     Assert.assertTrue(fmsReportsPaginationObj.AvailmentPage1to4_InavalimentTicket_610().isDisplayed());
	     
	     JavascriptHelper.scrollIntoView(fmsReportsPaginationObj.AvailmentPage1to4_InavalimentTicket_610());
	     Assert.assertTrue(fmsReportsPaginationObj.AvailmentPage2to4_InavalimentTicket_610().isDisplayed());
	     
	     JavascriptHelper.scrollIntoView(fmsReportsPaginationObj.AvailmentPage1to4_InavalimentTicket_610());
	     Assert.assertTrue(fmsReportsPaginationObj.AvailmentPage3to4_InavalimentTicket_610().isDisplayed());
	     
	     JavascriptHelper.scrollIntoView(fmsReportsPaginationObj.AvailmentPage1to4_InavalimentTicket_610());
	     Assert.assertTrue(fmsReportsPaginationObj.AvailmentPage4to4_InavalimentTicket_610().isDisplayed());
	     
	    }

}
