package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
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

	@Given("^navigate to FMS application2 and login with valid credentials$")
	public void navigate_to_fms_application2_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getFMSApplicationUrl());
		login.loginIntoFmsApplication2(configFileReader.getFMSApplicationUserType());
	}

	@And("^user click the reports menu$")
	public void user_click_the_reports_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.fmsReportsScreen());
		clicksAndActionsHelper.moveToElement(fmsReportsPaginationObj.fmsReportsScreen());
		clicksAndActionsHelper.clickOnElement(fmsReportsPaginationObj.fmsReportsScreen());
		fmsReportsPaginationObj.fmsReportsScreen().click();
		// _popup_path_sol_confirm_ok
	}

	@And("^user click the availment ticket sub menu$")
	public void user_click_the_availment_ticket_sub_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.fmsAvilmentTicketSubMenu());
		clicksAndActionsHelper.moveToElement(fmsReportsPaginationObj.fmsAvilmentTicketSubMenu());
		clicksAndActionsHelper.clickOnElement(fmsReportsPaginationObj.fmsAvilmentTicketSubMenu());
		fmsReportsPaginationObj.fmsAvilmentTicketSubMenu().click();
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(fmsReportsPaginationObj.fmsCIFNopopok());
				clicksAndActionsHelper.clickOnElement(fmsReportsPaginationObj.fmsCIFNopopok());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}



	@And("^user click the cif and enter the cif number in availment ticket sub menu$")
	public void user_click_the_cif_and_enter_the_cif_number_in_availment_ticket_sub_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.fmsCIFNo());
		clicksAndActionsHelper.moveToElement(fmsReportsPaginationObj.fmsCIFNo());
		clicksAndActionsHelper.clickOnElement(fmsReportsPaginationObj.fmsCIFNo());
		// Thread.sleep(3000000);
		fmsReportsPaginationObj.fmsCIFNo().click();
		fmsReportsPaginationObj.fmsCIFNo().sendKeys("77");
		//Thread.sleep(3000);
	}
	

	@Then("^user click retrieve button to view the report without error$")
	public void user_click_retrieve_button_to_view_the_report_without_error() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.fmsRetrieveKey());
		// clicksAndActionsHelper.moveToElement(fmsReportsPaginationObj.fmsRetrieveKey());
		// clicksAndActionsHelper.clickOnElement(fmsReportsPaginationObj.fmsRetrieveKey());
		fmsReportsPaginationObj.fmsRetrieveKey().click();
		for (int i = 0; i < 200; i++) {
			try {
				selenium_Actions.getClickAndActionsHelper().moveToElement(fmsReportsPaginationObj.fmsRetrieveKey());
				selenium_Actions.getClickAndActionsHelper().doubleClick(fmsReportsPaginationObj.fmsRetrieveKey());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());

				}
			}
		}
	}
	  @Then("^verify system shoudl show the CIF details under availment ticket$")
	    public void verify_system_shoudl_show_the_cif_details_under_availment_ticket() throws Throwable {
	     waitHelper.waitForElementwithFluentwait(driver, fmsReportsPaginationObj.AvailmentPage1to4());
	     Assert.assertTrue(fmsReportsPaginationObj.AvailmentPage1to4().isDisplayed());
	     Assert.assertTrue(fmsReportsPaginationObj.AvailmentPage2to4().isDisplayed());
	     Assert.assertTrue(fmsReportsPaginationObj.AvailmentPage3to4().isDisplayed());
	     Assert.assertTrue(fmsReportsPaginationObj.AvailmentPage4to4().isDisplayed());
	     
	    }

}
