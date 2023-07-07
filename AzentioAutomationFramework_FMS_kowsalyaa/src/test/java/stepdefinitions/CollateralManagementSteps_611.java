package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.fms.CollateralManagementObj_611;
import resources.BaseClass;

public class CollateralManagementSteps_611 {
	WebDriver driver = BaseClass.driver;
	CollateralManagementObj_611 collateralmanagementObj_611 = new CollateralManagementObj_611(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clickandactionhelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	FMSLogin fmslogin = new FMSLogin(driver);

	String CollateralCode;
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	   ExcelData FMS_CollateralManagementExcelData = new ExcelData(path,"FMS_CollateralManagement","Data Set ID");
	    Map<String, String> testData;
	    
	    @And("^User_611 Get the data set Id for AT_CM_030$")
	    public void User_611_Get_the_data_set_Id_for_AT_FM_030() throws Throwable {
			testData = FMS_CollateralManagementExcelData.getTestdata("AT_CM_030");
	    }
	
	@And("^User_611 click on the Collateral Management feature$")
	public void user_click_on_the_collateral_management_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascripthelper.scrollIntoView(collateralmanagementObj_611.FMSCollateralManagement_611());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.FMSCollateralManagement_611());
		collateralmanagementObj_611.FMSCollateralManagement_611().click();
	}

	@And("^User_611 click on the Maintanace screen under Collateral Management$")
	public void user_click_on_the_maintanace_screen_under_collateral_management() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver,
				collateralmanagementObj_611.collateralManagementMaintanance_611());
		collateralmanagementObj_611.collateralManagementMaintanance_611().click();
	}

	@And("^User_611 enter the Collateral type under main information in Collateral Management main Screen$")
	public void user_enter_the_collateral_type_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.mainInfoCollateralType_611());
//    	collateralmanagementObj_611.mainInfoCollateralType_611().sendKeys("564");
		collateralmanagementObj_611.mainInfoCollateralType_611().sendKeys(testData.get("Collateral Type"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(collateralmanagementObj_611.mainInfoCollateralType_611().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("^User_611 give the valid from date under main information in Collateral Management main Screen$")
	public void user_give_the_valid_from_date_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.mainInfoValidFromDate_611());
//    	collateralmanagementObj_611.mainInfoValidFromDate_611().sendKeys("05/01/2022");
		collateralmanagementObj_611.mainInfoValidFromDate_611().sendKeys(testData.get("Valid From Date"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(collateralmanagementObj_611.mainInfoValidFromDate_611().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_611 give the valid to date under main information in Collateral Management main Screen$")
	public void user_give_the_valid_to_date_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.mainInfoValidToDate_611());
//    	collateralmanagementObj_611.mainInfoValidToDate_611().sendKeys("05/01/2023");
		collateralmanagementObj_611.mainInfoValidToDate_611().sendKeys(testData.get("Valid To Date"), Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(collateralmanagementObj_611.mainInfoValidToDate_611().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_611 enter the brief description under main information in Collateral Management main Screen$")
	public void user_enter_the_brief_description_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.mainInfoBriefDescrip_611());
//    	collateralmanagementObj_611.mainInfoBriefDescrip_611().sendKeys("Testdata");
		collateralmanagementObj_611.mainInfoBriefDescrip_611().sendKeys(testData.get("Brief Description"));
	}

	@And("^User_611 enter the long description under main information in Collateral Management main Screen$")
	public void user_enter_the_long_description_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.mainInfoLongDescrip_611());
//    	collateralmanagementObj_611.mainInfoLongDescrip_611().sendKeys("Testdata");
		collateralmanagementObj_611.mainInfoLongDescrip_611().sendKeys(testData.get("Long Description"));
	}

	@And("^User_611 enter the Collateral currency under main information in Collateral Management main Screen$")
	public void user_enter_the_collateral_currency_under_main_information_in_collateral_management_main_screen()
			throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.mainInfoCollateralCurrency_611());
//    	collateralmanagementObj_611.mainInfoCollateralCurrency_611().sendKeys("840");
		collateralmanagementObj_611.mainInfoCollateralCurrency_611().sendKeys(testData.get("Collateral Currency"),
				Keys.TAB);

		for (int i = 0; i <= 500; i++) {
			try {
				if (!(collateralmanagementObj_611.mainInfoCollateralCurrencyLabel_611().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("^User_611 move to the Collateral cash details tab in Collateral Management main Screen$")
	public void user_move_to_the_collateral_cash_details_tab_in_collateral_management_main_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.CollateralCashDetailsTab_611());
		for (int i = 0; i < 2000; i++) {
			try {
				collateralmanagementObj_611.CollateralCashDetailsTab_611().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_611 click the add new icon under Collateral cash details tab$")
	public void user_click_the_add_new_icon_under_collateral_cash_details_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.CollateralCashDetailsAddIcon_611());
		collateralmanagementObj_611.CollateralCashDetailsAddIcon_611().click();
	}

	@And("^User_611 click the additional reference lookup under Collateral cash details tab$")
	public void user_click_the_additional_reference_lookup_under_collateral_cash_details_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver,
				collateralmanagementObj_611.CollateralCashDetailsAdditionalRefLookup_611());
		collateralmanagementObj_611.CollateralCashDetailsAdditionalRefLookup_611().click();
	}

	@And("^User_611 select the any cy value under additional reference lookup$")
	public void user_select_the_any_cy_value_under_additional_reference_lookup() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver,
				collateralmanagementObj_611.CollateralCashDetailsAdditionalRefRow1_611());
		waithelper.waitForElementwithFluentwait(driver,
				collateralmanagementObj_611.CollateralCashDetailsAdditionalRefCy_611());
		clickandactionhelper.doubleClick(collateralmanagementObj_611.CollateralCashDetailsAdditionalRefRow1_611());
	}

	@And("^User_611 enter the amount value under Collateral cash details tab$")
	public void user_enter_the_amount_value_under_collateral_cash_details_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.CollateralCashDetailsAmount_611());
//    	collateralmanagementObj_611.CollateralCashDetailsAmount_611().sendKeys("1000");
		collateralmanagementObj_611.CollateralCashDetailsAmount_611().sendKeys(testData.get("Amount"), Keys.TAB);
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(collateralmanagementObj_611.CollateralCashDetailsAmount_611().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@When("^User_611 click the save button under Collateral Management main Screen$")
	public void user_click_the_save_button_under_collateral_management_main_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver,
				collateralmanagementObj_611.collateralManagementMaintananceSaveBtn_611());
		collateralmanagementObj_611.collateralManagementMaintananceSaveBtn_611().click();

		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.confirmPopupOkBtn_611());
		collateralmanagementObj_611.confirmPopupOkBtn_611().click();

		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.successPopupTitle_611());
		String collateralCode = collateralmanagementObj_611.collateralSuccessPopupMsg_611().getText().substring(21, 25);
		System.err.println("Collateral Code: " + collateralCode);
		//collateralmanagementObj_611.updateTestData(testData.get("DataSet ID"), "Collateral Code", collateralCode);

		for (int i = 0; i < 2000; i++) {
			try {
				collateralmanagementObj_611.successPopupOkBtn_611().click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 500; i++) {
			try {
				collateralmanagementObj_611.collateralSendAlertPopupDismissBtn_611().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User_611 move to the Approve screen under Collateral Management$")
	public void user_move_to_the_approve_screen_under_collateral_management() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.collateralManagementApprove_611());
		collateralmanagementObj_611.collateralManagementApprove_611().click();
	}

	@And("User_611 enter the Code in Collateral Management Approve screen search grid")
	public void user_enter_the_code_in_collateral_management_approve_screen_search_grid() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.collateralManagementApproveMenuSearchgridCodeInput_611());
		collateralmanagementObj_611.collateralManagementApproveMenuSearchgridCodeInput_611().sendKeys(CollateralCode,Keys.ENTER);		
	}

	@And("User_611 double click the Code Collateral Management Approve screen search grid")
	public void user_double_click_the_code_collateral_management_approve_screen_search_grid() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver,
				collateralmanagementObj_611.collateralManagementApproveMenuSearchgridRow1_611());
		clickandactionhelper
				.doubleClick(collateralmanagementObj_611.collateralManagementApproveMenuSearchgridRow1_611());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(collateralmanagementObj_611.collateralManagementApproveMenuCode_611().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	@And("^User_611 click the clear button under approve screen in Collateral Management$")
	public void user_click_the_clear_button_under_approve_screen_in_collateral_management() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver,
				collateralmanagementObj_611.collateralManagementApproveClearBtn_611());
		collateralmanagementObj_611.collateralManagementApproveClearBtn_611().click();
	}

	@And("^User_611 double click on the first row in approve screen$")
	public void user_double_click_on_the_first_row_in_approve_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver,
				collateralmanagementObj_611.collateralManagementApproveFirstRow_611());
		clickandactionhelper.doubleClick(collateralmanagementObj_611.collateralManagementApproveFirstRow_611());
	}

	@When("^User_611 click the approve button under Collateral Management approve screen$")
	public void user_click_the_approve_button_under_collateral_management_approve_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascripthelper.scrollIntoView(collateralmanagementObj_611.collateralManagementApproveBtn_611());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.collateralManagementApproveBtn_611());
		collateralmanagementObj_611.collateralManagementApproveBtn_611().click();

		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.confirmPopupOkBtn_611());
		collateralmanagementObj_611.confirmPopupOkBtn_611().click();

		waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.successPopupTitle_611());
		collateralmanagementObj_611.successPopupOkBtn_611().click();

	}
	//clear cache
	@And("User_611 click Technical details")
    public void user_611_click_technical_details() {
		waithelper.waitForElementwithFluentwait(driver,collateralmanagementObj_611.technicalDetails_611());
		clickandactionhelper.moveToElement(collateralmanagementObj_611.technicalDetails_611());
		clickandactionhelper.clickOnElement(collateralmanagementObj_611.technicalDetails_611());
    }
@And("User_611 click clear caches")
    public void user_611_click_clear_caches() {
	waithelper.waitForElementwithFluentwait(driver,collateralmanagementObj_611.FSM_ClearCacheInTechnicalDetailsIcon_611());
	clickandactionhelper.moveToElement(collateralmanagementObj_611.FSM_ClearCacheInTechnicalDetailsIcon_611());
	clickandactionhelper.clickOnElement(collateralmanagementObj_611.FSM_ClearCacheInTechnicalDetailsIcon_611());
    }
 

@And("^User_611 Click the ok button in clear cache$")
  public void user_611_click_the_ok_button_in_clear_cache() throws Throwable {
	waithelper.waitForElementwithFluentwait(driver, collateralmanagementObj_611.Ok());
	clickandactionhelper.clickOnElement(collateralmanagementObj_611.Ok());         
  }

}

