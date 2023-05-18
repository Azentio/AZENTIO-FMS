package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.fmsParam.Control_RecordsObj;
import resources.BaseClass;

public class FMSParam_Control_Records_Steps {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Control_RecordsObj controlRecordsObj = new Control_RecordsObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMSParam_Control_Records","DataSet ID");
	Map<String, String> testData;
	
//	@305607
	@And("^User clicks on the control records feature$")
    public void user_clicks_on_the_control_records_feature() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.paramControlRecords());
        controlRecordsObj.paramControlRecords().click();
    }

    @And("^User clicks on the update after approve menu$")
    public void user_clicks_on_the_update_after_approve_menu() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsUpdateAfterApprove());
        controlRecordsObj.controlRecordsUpdateAfterApprove().click();
    }

    @And("^User validate the Officer Assigned Required checkbox$")
    public void user_validate_the_officer_assigned_required_checkbox() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.mainInfoOfficerAssignReqCheck());
    	WebElement mainInfoOfficerAssignReqCheck = controlRecordsObj.mainInfoOfficerAssignReqCheck();
    	Assert.assertEquals(true, mainInfoOfficerAssignReqCheck.isDisplayed());
    	
    	WebElement mainInfoOfficerAssignReqLabel = controlRecordsObj.mainInfoOfficerAssignReqLabel();
    	Assert.assertEquals(true, mainInfoOfficerAssignReqLabel.isDisplayed());
    }

    @And("^User uncheck the Officer Assigned Required flag$")
    public void user_uncheck_the_officer_assigned_required_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.mainInfoOfficerAssignReqCheck());
    	WebElement mainInfoOfficerAssignReqCheck = controlRecordsObj.mainInfoOfficerAssignReqCheck();
    	if(!(mainInfoOfficerAssignReqCheck.isSelected())) {
    		mainInfoOfficerAssignReqCheck.click();
    	}
    }

    @And("^User validate the Enable Markup Type checkbox$")
    public void user_validate_the_enable_markup_type_checkbox() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(controlRecordsObj.mainInfoEnableMarkupCheck());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.mainInfoEnableMarkupCheck());
    	WebElement mainInfoEnableMarkupCheck = controlRecordsObj.mainInfoEnableMarkupCheck();
    	Assert.assertEquals(true, mainInfoEnableMarkupCheck.isDisplayed());
    	
    	WebElement mainInfoOfficerAssignReqLabel = controlRecordsObj.mainInfoOfficerAssignReqLabel();
    	Assert.assertEquals(true, mainInfoOfficerAssignReqLabel.isDisplayed());
    }

    @And("^User uncheck the Enable Markup Type flag$")
    public void user_uncheck_the_enable_markup_type_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.mainInfoEnableMarkupCheck());
    	WebElement mainInfoEnableMarkupCheck = controlRecordsObj.mainInfoEnableMarkupCheck();
    	if(mainInfoEnableMarkupCheck.isSelected()) {
    		mainInfoEnableMarkupCheck.click();
    	}
    }

    @And("^User validate the Role of Officers Assigned menu$")
    public void user_validate_the_roll_of_officers_assigned_menu() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(controlRecordsObj.updateAfterRoleOfOfficersAssigned());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	WebElement updateAfterRoleOfOfficersAssigned = controlRecordsObj.updateAfterRoleOfOfficersAssigned();
    	Assert.assertEquals(true, updateAfterRoleOfOfficersAssigned.isDisplayed());
    }

    @And("^User validate the Party s History with Company menu$")
    public void user_validate_the_party_s_history_with_company_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.updateAfterPartysHistory());
    	WebElement updateAfterPartysHistory = controlRecordsObj.updateAfterPartysHistory();
    	Assert.assertEquals(true, updateAfterPartysHistory.isDisplayed());
    }

    @And("^User validate the Member Countries$")
    public void user_validate_the_member_countries() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.updateAferMemberCountries());
    	WebElement updateAferMemberCountries = controlRecordsObj.updateAferMemberCountries();
    	Assert.assertEquals(true, updateAferMemberCountries.isDisplayed());
    }

    @And("^User clicks on the update button$")
    public void user_clicks_on_the_update_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(controlRecordsObj.updateAfterUpdateBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.updateAfterUpdateBtn());
    	controlRecordsObj.updateAfterUpdateBtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.ButtonConfirmOk());
    	controlRecordsObj.ButtonConfirmOk().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.ButtonSuccessOk());
    	controlRecordsObj.ButtonSuccessOk().click();
    }
    
    @And("^User check the Officer Assigned Required flag$")
    public void user_check_the_officer_assigned_required_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.mainInfoOfficerAssignReqCheck());
    	WebElement mainInfoOfficerAssignReqCheck = controlRecordsObj.mainInfoOfficerAssignReqCheck();
    	if(mainInfoOfficerAssignReqCheck.isSelected()) {
    		mainInfoOfficerAssignReqCheck.click();
    	}
    }

    @And("^User clicks on the approve menu$")
    public void user_clicks_on_the_approve_feature() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsApprove());
    	controlRecordsObj.controlRecordsApprove().click();
    }

    @Then("^User clicks on the approve button$")
    public void user_clicks_on_the_approve_button() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
			try {
				javaScriptHelper.scrollIntoView(controlRecordsObj.approveButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	controlRecordsObj.approveButton().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.ButtonConfirmOk());
    	controlRecordsObj.ButtonConfirmOk().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.ButtonSuccessOk());
    	controlRecordsObj.ButtonSuccessOk().click();
    }
    
    
    
//    @305703
    
    @And("^User clicks on the member countries menu$")
    public void user_clicks_on_the_member_countries_menu() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.updateAferMemberCountries());
        controlRecordsObj.updateAferMemberCountries().click();
    }

    @And("^User clicks the add new row button$")
    public void user_clicks_the_add_new_row_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.memberCountriesAddNewRowBtn());
    	controlRecordsObj.memberCountriesAddNewRowBtn().click();
    }
    
    @And("^Update test data for test case no 305703$")
    public void update_test_data_for_test_case_no_305703() throws Throwable {
    	testData = fmsTransactionsExcelData.getTestdata("DS01_305703");
    }

    @And("^User enter the country code$")
    public void user_enter_the_country_code() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.countryCodeLabel());
    	controlRecordsObj.countryCodeLabel().click();
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.countryCode());
//    	controlRecordsObj.countryCode().sendKeys("320");
    	controlRecordsObj.countryCode().sendKeys(testData.get("Country Code"));
    	controlRecordsObj.countryCode().sendKeys(Keys.ENTER);
    	
    }
    
    @And("^User clicks on the membership type dropdown$")
    public void user_clicks_on_the_membership_type_dropdown() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.membershipTypeLabel());
    	controlRecordsObj.membershipTypeLabel().click();
    	controlRecordsObj.membershipTypeLabel().click();
    }
    
//    @Then("^validate the membership DDLB values$")
//    public void validate_the_membership_ddlb_values() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.membershipTypeDropDown());
//    	String[] dropDownOptions = {"ITFC","IDB Member","Both"};
//    	Select select = new Select(controlRecordsObj.membershipTypeDropDown());
//    	
//    	List<WebElement> options = select.getOptions();
//    	for (WebElement DDLBValues : options) {
//    		boolean match = false;
//			for(int i=0; i<dropDownOptions.length; i++) {
//				if(DDLBValues.getText().equals(dropDownOptions[i])) {
//					match = true;
//				}
//		}
//			Assert.assertTrue(match);
//      }    	
//    }


}
