package stepdefinitions;

import java.util.Map;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import pageobjects.CommonElements.CommonElementObj;
import pageobjects.fms.AT_FM_001FACILITYMANAGMENT;
import pageobjects.fms.ApplicationForFinancialFacilityObj;

import resources.BaseClass;

public class AT_FM_OO1_FACILITYMANAGMENT extends BaseClass {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "ApplicationForFinancialFacility", "DataSet ID");
	ExcelData facilityManagementData = new ExcelData(path, "FacilitiesManagement", "DataSet ID");
	ExcelData requestForFinancingData = new ExcelData(path, "RequestForFinancing_482", "DataSet ID");
	ExcelData drawDownRequestData = new ExcelData(path, "DrawDownRequest", "DataSet ID");
	ExcelData testExecution = new ExcelData(path, "TestExecution", "TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;
	CSMLogin csmLogin = new CSMLogin(driver);
	ApplicationForFinancialFacilityObj applicationForFinancialFacilityObj1=new ApplicationForFinancialFacilityObj(driver);
	CommonElementObj commonElementsObj = new CommonElementObj(driver);
	AT_FM_001FACILITYMANAGMENT at_fm_001facilitymanagment=new AT_FM_001FACILITYMANAGMENT(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	int randomNumber;
	String Request_Code = "";

	@And("^user click on the Johns Request module and after johns sub module$")
	public void user_click_on_the_Johns_Request_module_and_after_johns_sub_module() {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj1.johnsRequestModule());

		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj1.johnsRequestModule());

		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj1.johnsRequestModule());

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj1.SubjohnsRequestModule());

		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj1.SubjohnsRequestModule());

		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(applicationForFinancialFacilityObj1.SubjohnsRequestModule());

	}

	@And("^user click on facility maintenance screen$")
	public void user_click_on_facility_maintenance_screen() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.FacilityManagment());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.FacilityManagment());
	}
	
	@And("^user click on update approve screen under facility maintenance$")
	public void user_click_on_update_approve_screen_under_facility_maintenance() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.UpdateApprove());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.UpdateApprove());
	}
	
	@And("^user click on clear icon under the update approve screen$")
	public void user_click_on_clear_icon_under_the_update_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.clearicon());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.clearicon());
		Thread.sleep(3000);
	}
	
	@And("^user retrive the record and update any field$")
	public void user_retrive_the_record_and_update_any_field() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.retrivedata());
		seleniumActions.getClickAndActionsHelper().doubleClick(at_fm_001facilitymanagment.retrivedata());
		Thread.sleep(3000);
		}
	
	
	@And("^user click on additional detail$")
	public void user_click_on_additional_detail() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.additionaldetail());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.additionaldetail());
		Thread.sleep(3000);
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.effectivedate());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.effectivedate());
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.effectivedateretrive());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.effectivedateretrive());
		Thread.sleep(2000);
	}
	
	@And("^user click on save button$")
	public void user_click_on_save_button() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.savebutton());
		for (int i = 0; i <= 300; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.savebutton());
				waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.okpopup());
				seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.okpopup());
				waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.oksuccessfullpopup());
				seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.oksuccessfullpopup());
				
				break;

			} catch (Exception e) {
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
	}
	@And("^user click on aprrove screen$")
	public void user_click_on_approve_screen() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.approvescreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.approvescreen());	
	}
	@And("^user click on clear icon under the approve screen$")
	public void user_click_on_clear_icon_under_the_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.clear());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.clear());
		Thread.sleep(3000);
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.retrivedata());
		seleniumActions.getClickAndActionsHelper().doubleClick(at_fm_001facilitymanagment.retrivedata());
	}
	@And("^user click on approve button$")
	public void user_click_on_approve_button() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.approvebtn());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.approvebtn());
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.confirmapprove());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.confirmapprove());
		waitHelper.waitForElementwithFluentwait(driver, at_fm_001facilitymanagment.successfullpopup());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_001facilitymanagment.successfullpopup());	
	}
}
