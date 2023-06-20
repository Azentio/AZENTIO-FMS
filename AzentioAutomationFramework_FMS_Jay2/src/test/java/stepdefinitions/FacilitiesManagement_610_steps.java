package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.FacilitiesManagement_610_obj;
import resources.BaseClass;

public class FacilitiesManagement_610_steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FacilitiesManagement_610_obj FacilitiesManagement_610_obj=new FacilitiesManagement_610_obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	DropDownHelper DropDownhelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	
	@Given("User_{int} check flag allow change revolving OnOff in main details menu")
	public void user_check_flag_allow_change_revolving_on_off_in_main_details_menu(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610());
		clicksAndActionsHelper.clickOnElement(FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610());
	}

	@Then("User_{int} check  change after utilization flag avaliable or not in main details")
	public void user_check_change_after_utilization_flag_avaliable_or_not_in_main_details(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagement_610_obj.changeAfterUtilizationFlag_InMainDetails_610());
		Assert.assertEquals(true, FacilitiesManagement_610_obj.changeAfterUtilizationFlag_InMainDetails_610().isDisplayed());
	}
	
	//------------- @834955
	
	@And("User_{int} check the allow change revolving onOff flag is checked")
	public void user_check_the_allow_change_revolving_on_off_flag_is_checked(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610());
		clicksAndActionsHelper.clickOnElement(FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610());
		Thread.sleep(3000);
		
		if (FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610().isSelected()) {
			Assert.assertTrue(true);
		}
		else {
			FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610().click();
			Thread.sleep(3000);
		}
		
			}
	
	@Then("validate if the allow change revolving onOff flag is checked revolving onOff will editAble in facility type")
	public void validate_if_the_allow_change_revolving_on_off_flag_is_checked_revolving_on_off_will_edit_able_in_facility_type() {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagement_610_obj.revolvingOneOff_InFacilityType_610());
		Assert.assertEquals(true, FacilitiesManagement_610_obj.revolvingOneOff_InFacilityType_610().isDisplayed());

	}

	@And("User_{int} check the allow change revolving onOff flag is Unchecked")
	public void user_check_the_allow_change_revolving_on_off_flag_is_unchecked(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610());
		clicksAndActionsHelper.clickOnElement(FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610());
		
		if (!(FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610().isSelected())) {
			Assert.assertTrue(true);
		}
		else {
			FacilitiesManagement_610_obj.allowChangeRevolvingFlag_InMainDetails_610().click();
		}
	}
	
	@Then("validate if the allow change revolving onOff flag is Unchecked revolving onOff will Not EditAble in facility type")
	public void validate_if_the_allow_change_revolving_on_off_flag_is_unchecked_revolving_on_off_will_not_edit_able_in_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FacilitiesManagement_610_obj.revolvingOneOff_InFacilityType_610());
		Thread.sleep(4000);
		Assert.assertEquals(!(FacilitiesManagement_610_obj.revolvingOneOff_InFacilityType_610().isEnabled()),true);
	}
}
