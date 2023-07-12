package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.Collateral_Management_610_obj;
import pageobjects.CommonElements.FMS_WifakApplication_Obj;
import resources.BaseClass;

public class Collateral_Management_610_steps extends BaseClass{
	
	WebDriver driver=BaseClass.driver;
	//FMSCommonWebElements fmsCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsParamLoginTestData = new ExcelData(TestDataPath, "FMSParam_login", "UserType");
	ExcelData fmsLoginExceldata = new ExcelData(TestDataPath, "FMS_Login", "UserType");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "UserType");
	Map<String, String> fmsLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	Collateral_Management_610_obj CollateralManagement_610_obj = new Collateral_Management_610_obj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMSLogin FMSLogin = new FMSLogin(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	FMS_WifakApplication_Obj FMS_WifakApplication_Obj = new FMS_WifakApplication_Obj(driver);
	
	@And("User_{int} click Collateral Management Screen")
	public void user_click_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.CollateralManagementScreen_610());
		
	    	}

	@And("User_{int} click maintenance in Collateral Management Screen")
	public void user_click_maintenance_in_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.MaintenanceIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.MaintenanceIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.MaintenanceIN_CollateralManagementScreen_610());
	}

	@And("User_{int} enter collateral type Collateral Management Screen")
	public void user_enter_collateral_type_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.collateralType_INCollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.collateralType_INCollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.collateralType_INCollateralManagementScreen_610());
		CollateralManagement_610_obj.collateralType_INCollateralManagementScreen_610().sendKeys("6",Keys.TAB);
	}

	@And("User_{int} enter Valid From Date in Collateral Management Screen")
	public void user_enter_valid_from_date_in_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.ValidFromDateIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.ValidFromDateIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.ValidFromDateIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.ValidFromDateIN_CollateralManagementScreen_610().sendKeys("16/01/2021",Keys.TAB);
	}

	@And("User_{int} enter Valid To Date in Collateral Management Screen")
	public void user_enter_valid_to_date_in_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.ValidToDateIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.ValidToDateIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.ValidToDateIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.ValidToDateIN_CollateralManagementScreen_610().sendKeys("16/01/2021,Keys.TAB");
	}

	@And("User_{int} enter Brief Description in Collateral Management Screen")
	public void user_enter_brief_description_in_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.BriefDescriptionIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.BriefDescriptionIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.BriefDescriptionIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.BriefDescriptionIN_CollateralManagementScreen_610().sendKeys("test");
	}

	@And("User_{int} enter Long Description in Collateral Management Screen")
	public void user_enter_long_description_in_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.LongDescriptionIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.LongDescriptionIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.LongDescriptionIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.LongDescriptionIN_CollateralManagementScreen_610().sendKeys("testJay");
	}

	@And("User_{int} enter CIF NO in Collateral Management Screen")
	public void user_enter_cif_no_in_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.cifNoIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.cifNoIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.cifNoIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.cifNoIN_CollateralManagementScreen_610().sendKeys("727",Keys.TAB);
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.ButtonConfirmOk1_610());
		clicksAndActionHelper.moveToElement(FMS_WifakApplication_Obj.ButtonConfirmOk1_610());
		clicksAndActionHelper.clickOnElement(FMS_WifakApplication_Obj.ButtonConfirmOk1_610());
	}
	
	@And("User_{int} enter Collateral Currency in Collateral Management Screen")
	public void user_enter_collateral_currency_in_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.collateralCurrencyIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.collateralCurrencyIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.collateralCurrencyIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.collateralCurrencyIN_CollateralManagementScreen_610().sendKeys("999",Keys.TAB);
		
		for (int i = 0; i <= 300; i++) {
			if (!(CollateralManagement_610_obj.collateralCurrencyIN_CollateralManagementScreen_610().getAttribute("prevvalue")
					.isBlank())) {
				break;
			}
		}
	}
		
	@And("User_{int} click additional details in Collateral Management Screen")
	public void user_click_additional_details_in_collateral_management_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.AdditionalDetailsIN_CollateralManagementScreen_610());
	//	clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.AdditionalDetailsIN_CollateralManagementScreen_610());
		for (int i = 0; i < 200; i++) {
			try {
				CollateralManagement_610_obj.AdditionalDetailsIN_CollateralManagementScreen_610().click();;
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_{int} enter FC Valuesf in additional details Screen")
	public void user_enter_fc_valuesf_in_additional_details_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.FCValuesfIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.FCValuesfIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.FCValuesfIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.FCValuesfIN_CollateralManagementScreen_610().sendKeys("10000");
	}

	@And("User_{int} enter Date Accepted in additional details Screen")
	public void user_enter_date_accepted_in_additional_details_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.DateAcceptedfIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.DateAcceptedfIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.DateAcceptedfIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.DateAcceptedfIN_CollateralManagementScreen_610().sendKeys("16/01/2021",Keys.TAB);
	}

	@And("User_{int} enter Valuation Date in additional details Screen")
	public void user_enter_valuation_date_in_additional_details_screen(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, CollateralManagement_610_obj.ValuationDatefIN_CollateralManagementScreen_610());
		clicksAndActionHelper.moveToElement(CollateralManagement_610_obj.ValuationDatefIN_CollateralManagementScreen_610());
		clicksAndActionHelper.clickOnElement(CollateralManagement_610_obj.ValuationDatefIN_CollateralManagementScreen_610());
		CollateralManagement_610_obj.ValuationDatefIN_CollateralManagementScreen_610().sendKeys("16/01/2021",Keys.TAB);
	}

	@And("User_{int} click save button")
	public void user_click_save_button(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.SaveButton_DocumentDetails_updateafter_Tab_610());
		clicksAndActionHelper.moveToElement(FMS_WifakApplication_Obj.SaveButton_DocumentDetails_updateafter_Tab_610());
		clicksAndActionHelper.clickOnElement(FMS_WifakApplication_Obj.SaveButton_DocumentDetails_updateafter_Tab_610());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		clicksAndActionHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Waring_Screen_610());
		
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionHelper.moveToElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
		clicksAndActionHelper.clickOnElement(FMS_WifakApplication_Obj.Ok_Button_In_Sucess_Screen_610());
	}


}
