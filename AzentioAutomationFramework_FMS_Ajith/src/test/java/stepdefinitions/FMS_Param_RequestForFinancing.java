package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.fmsparams.ApplicationForFinancialFacilityParamObj;
import resources.BaseClass;

public class FMS_Param_RequestForFinancing {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacilityParamObj fmsParamObj = new ApplicationForFinancialFacilityParamObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ApplicationForFinancialFacility","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	CSMLogin csmLogin = new CSMLogin(driver);
	
	@And("^User Click Facility Type Sub Menu$")
    public void user_click_facility_type_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.facilityTypeSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.facilityTypeSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.facilityTypeSubMenu());
    }
	@And("^User click update after approve Sub Menu$")
    public void user_click_update_after_approve_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.updateAfterApprove_FacilityType());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.updateAfterApprove_FacilityType());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.updateAfterApprove_FacilityType());
    }

    @And("^User Search facility type in Facility Type Sub Menu$")
    public void user_search_facility_type_in_facility_type_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen());
		fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen().sendKeys("75");
		fmsParamObj.searchFacilityTypeInUdateAfterApproveScreen().sendKeys(Keys.ENTER);
		
    }

    @And("^User Select Searched Facility type record$")
    public void user_select_searched_facility_type_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.selectSearchedFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(fmsParamObj.selectSearchedFacilityTypeInUdateAfterApproveScreen());
    }

    @And("^User click facilty details tab$")
    public void user_click_facilty_details_tab() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.facilityDetailsTab());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.facilityDetailsTab());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.facilityDetailsTab());
    }

    @And("^User click STP facility Requirements$")
    public void user_click_stp_facility_requirements() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.StpFacilityRequirementsOption());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.StpFacilityRequirementsOption());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.StpFacilityRequirementsOption());
    }

    @And("^User un check committe approval$")
    public void user_un_check_committe_approval() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.StpFacilityRequirementsOption());	
    	for (int i = 0; i <200; i++) {
			try {
				if (fmsParamObj.StpFacilityRequirementsOption().getAttribute("initialvalue").isBlank()&&
						fmsParamObj.StpFacilityRequirementsOption().getAttribute("initialvalue").isEmpty()) {
					fmsParamObj.StpFacilityRequirementsOption().click();
					break;
				}
				else {
					fmsParamObj.StpFacilityRequirementsOption().click();
					fmsParamObj.StpFacilityRequirementsOption().click();
					break;
				}
					
			} catch (Exception e) {
				
			}
		}
    }

    @And("^User click update button in facility type record$")
    public void user_click_update_button_in_facility_type_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.updateButtonInUpdateAfterApproveSubMenu());
    }

    @And("^User click approve submenu in facility type$")
    public void user_click_approve_submenu_in_facility_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.approveScreenInFacilityType());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.approveScreenInFacilityType());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.approveScreenInFacilityType());
    }

    @And("^User Search facility type in Approve screen Facility type$")
    public void user_search_facility_type_in_approve_screen_facility_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.searchFacilityTypeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.searchFacilityTypeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.searchFacilityTypeInApproveScreen());
		fmsParamObj.searchFacilityTypeInApproveScreen().sendKeys("75");
		fmsParamObj.searchFacilityTypeInApproveScreen().sendKeys(Keys.ENTER);
    }

    @And("^User Select Searched in Approve screen Facility type$")
    public void user_select_searched_in_approve_screen_facility_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.selectSearchedFacilityTypeInUdateAfterApproveScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(fmsParamObj.selectSearchedFacilityTypeInUdateAfterApproveScreen());
    }

    @And("^User click approve button in Approve screen Facility type$")
    public void user_click_approve_button_in_approve_screen_facility_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,fmsParamObj.aprroveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(fmsParamObj.aprroveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(fmsParamObj.aprroveButtonInApproveScreen());
}
}
