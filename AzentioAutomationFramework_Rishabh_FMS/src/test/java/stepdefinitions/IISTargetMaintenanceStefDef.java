package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.google.inject.Key;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.IISCommonElements;
import pageobjects.iisParam.ControlRecordObj;
import pageobjects.iisParam.RepaymentPlanObj;
import pageobjects.iisParam.TargetMaintenanceObj;
import resources.BaseClass;

public class IISTargetMaintenanceStefDef {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	Actions actions = new Actions(driver);
	IISLogin login = new IISLogin(driver);
	
	IISCommonElements iisCommonElements = new IISCommonElements(driver);
	TargetMaintenanceObj targetMaintenanceObj =  new TargetMaintenanceObj(driver);
	RepaymentPlanObj repaymentPlanObj = new RepaymentPlanObj(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "TargetMaintenanceTestdata", "DataSet ID");

	Map<String, String> testData;

	@And ("^user get the test data for test case AT_IISPRM_048$")
	public void user_get_the_test_data_for_test_case_AT_IISPRM_048(){
		testData = excelData.getTestdata("AT_IISPRM_048_D1");
	}
	
	@Then ("^user click on the target maintenance module under parameter tab$")
	public void user_click_on_the_target_maintenance_module_under_parameter_tab(){
		
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceModule());
		targetMaintenanceObj.iisTargetMaintenanceModule().click();
	}

	@Then ("^user click on the maintenace$")
	public void user_click_on_the_maintenace(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceModuleMaintenance());
		targetMaintenanceObj.iisTargetMaintenanceModuleMaintenance().click();
	}

	@Then ("^user click on the policy no feild$")
	public void user_click_on_the_policy_no_feild(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild());
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().click();
	}
	
	@Then ("^user enter the policy no$")
	public void user_enter_the_policy_no(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild());
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().clear();
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().sendKeys(testData.get("Policy No"));
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().sendKeys(Keys.TAB);
	}

	@Then ("^user click on the country feild$")
	public void user_click_on_the_country_feild(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceCountryFeild());
	targetMaintenanceObj.iisTargetMaintenanceCountryFeild().click();
	}
	
	@Then ("^enter the country code$")
	public void enter_the_country_code(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceCountryFeild());
		targetMaintenanceObj.iisTargetMaintenanceCountryFeild().clear();
		targetMaintenanceObj.iisTargetMaintenanceCountryFeild().sendKeys(testData.get("Country Code"));
		targetMaintenanceObj.iisTargetMaintenanceCountryFeild().sendKeys(Keys.TAB);
	}
	
	@Then ("^user click year feild$")
	public void user_click_year_feild(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceYearFeild());
		targetMaintenanceObj.iisTargetMaintenanceYearFeild().click();
	}
	
	@Then ("^enter year$")
	public void enter_year(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceYearFeild());
		targetMaintenanceObj.iisTargetMaintenanceYearFeild().clear();
		targetMaintenanceObj.iisTargetMaintenanceYearFeild().sendKeys(testData.get("Year"));
		targetMaintenanceObj.iisTargetMaintenanceYearFeild().sendKeys(Keys.TAB);
	}
	
	
	@Then ("^user click on save button$")
	public void user_click_on_save_button(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenancesaveBtn());
		for(int i = 1; i<=500 ; i++)
			try {
				targetMaintenanceObj.iisTargetMaintenancesaveBtn().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		
	}
	
	@Then ("^user click ok on the confirm save popup$")
	public void user_click_ok_on_the_confirm_save_popup(){
		
		
		for (int i = 0; i <= 300; i++) {
			waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceConfirmOkBtn());
			try {
				targetMaintenanceObj.iisTargetMaintenanceConfirmOkBtn().click();
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
	
	@Then ("^user click ok on saved successfull popup$")
	public void user_click_ok_on_saved_successfull_popup() throws InterruptedException{
		//waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceSuccesfullySavedBtn());
		
		for (int i = 0; i <= 300; i++) {
			waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceSuccesfullOkBtn());
			try {
				targetMaintenanceObj.iisTargetMaintenanceSuccesfullOkBtn().click();
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	//-------------------------------------------------------------------------------------------

	@Then ("^user click on the search btn$")
	public void user_click_on_the_search_btn(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceSearchBtn());
		targetMaintenanceObj.iisTargetMaintenanceSearchBtn().click();
	}

	@Then ("^user click on the class code feild$")
	public void user_click_on_the_class_code_feild(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceClassCodeFeild());
		targetMaintenanceObj.iisTargetMaintenanceClassCodeFeild().click();
	}
	
	@Then ("^user enter the class code$")
	public void user_enter_the_class_code(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceClassCodeFeild());
		targetMaintenanceObj.iisTargetMaintenanceClassCodeFeild().clear();
		targetMaintenanceObj.iisTargetMaintenanceClassCodeFeild().sendKeys(testData.get("Policy No"));
		targetMaintenanceObj.iisTargetMaintenanceClassCodeFeild().sendKeys(Keys.ENTER);
	}
	
	@Then ("^user double click on the fetched record$")
	public void user_double_click_on_the_fetched_record(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceClassRec());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.doubleClick(targetMaintenanceObj.iisTargetMaintenanceClassRec());
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then ("^user click on the update btn$")
	public void user_click_on_the_update_btn(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceUpdateBtn());
		for(int i =1 ; i<=50 ; i++) 
			try {
				targetMaintenanceObj.iisTargetMaintenanceUpdateBtn().click();
				System.out.println("clicked on update btn : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
	}
	
	@Then ("^user click ok on the confirm update popup$")
	public void user_click_ok_on_the_confirm_update_popup(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceConfirmOkBtn());
		
		for (int i = 0; i <= 300; i++) {
			
			try {
				targetMaintenanceObj.iisTargetMaintenanceConfirmOkBtn().click();
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@Then ("^user click ok on update succesfull popup$")
	public void user_click_ok_on_update_succesfull_popup(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceSuccesfullOkBtn());
		targetMaintenanceObj.iisTargetMaintenanceSuccesfullOkBtn().click();
	}
	

   //-------------------------------------delete rec----------------------------//
	
	@Then ("^user click on the delete btn$")
	public void user_click_on_the_delete_btn(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceDeleteBtn());
		for(int i =1 ; i<=50 ; i++) 
			try {
				targetMaintenanceObj.iisTargetMaintenanceDeleteBtn().click();
				System.out.println( "clicked on delete : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
	}

	@Then ("^user click ok on the confirm delete popup$")
	public void user_click_ok_on_the_confirm_delete_popup(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceConfirmOkBtn());	
		
		for (int i = 0; i <= 300; i++) {
			
			try {
				targetMaintenanceObj.iisTargetMaintenanceConfirmOkBtn().click();
				System.out.println("Clicked : " + i);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then ("^user click ok on Deleted succesfull popup$")
	public void user_click_ok_on_Deleted_succesfull_popup(){
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceSuccesfullOkBtn());
		targetMaintenanceObj.iisTargetMaintenanceSuccesfullOkBtn().click();
	}

    //------------------------------------------------------------------------------
	
	
	@Then("^user check for the grid and releavant data$")
	public void user_check_for_the_grid_and_releavant_data() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTemplateMaintenancePolicyRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
			try {
				String text = targetMaintenanceObj.iisTemplateMaintenancePolicyRec().getText().trim();
				String title = targetMaintenanceObj.iisTemplateMaintenancePolicyRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Policy No");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("The grid and the releavant data is correct");

				} else {
					System.out.println("The grid and the releavant data is not correct");
				}

				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}

	}
	
	//-----------------------------number validation check--------------------------------//
	
	
	@Then("^user enter a negative value in policy feild$")
	public void user_enter_a_negative_value_in_policy_feild() {
		waitHelper.waitForElementwithFluentwait(driver,
				targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild());
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().clear();
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild()
				.sendKeys(testData.get("Negative Value"));
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().sendKeys(Keys.TAB);

	}

	@Then("^user validate the feild that it does not allow negative values$")
	public void user_validate_the_feild_that_it_does_not_allow_negative_value() {

		WebElement Error_PopUp = targetMaintenanceObj.iisTargetMaintenenaceErrorPopUpOkBtn();
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		if (isError_PopUp) {
			System.out.println("System Can't allow Negative value");
		} else {
			System.out.println("System allowed Negative value");
		}

	}

	@Then("^user click dismiss the error popup$")
	public void user_click_dismiss_the_error_popup() throws InterruptedException {
		WebElement Error_PopUp = waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenenaceErrorPopUpOkBtn());
		boolean isError_PopUp = Error_PopUp.isDisplayed();
		WebElement Error_PopUp2 = waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenenaceErrorPopUpOkBtn());
		boolean isError_PopUp2 = Error_PopUp2.isDisplayed();
//		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenenaceErrorPopUpOkBtn());
		for (int i = 1; i <= 50; i++) {
		if (isError_PopUp || isError_PopUp2) {
			
				try {
					targetMaintenanceObj.iisTargetMaintenenaceErrorPopUpOkBtn().click();
					System.out.println(" Error Popup Occured ");
					System.out.println("clicked on the ok btn of Error Popup");
					break;

				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}

				}

		} 
		}
		
		
		
	}

	@Then("^user enter the max value$")
	public void user_enter_the_maximum_value() {
		waitHelper.waitForElementwithFluentwait(driver,
				targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild());
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().clear();
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().sendKeys(testData.get("Max Value"));
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().sendKeys(Keys.TAB);
	}

	@Then("^user validate that feild accept the maximum value$")
	public void user_validate_that_feild_accept_the_maximum_value() {
		for (int i = 1; i <= 50; i++) {
			try {
				WebElement Error_PopUp = targetMaintenanceObj.iisTargetMaintenenaceErrorPopUpOkBtn();
				boolean isError_PopUp = Error_PopUp.isDisplayed();
				if (isError_PopUp) {
					System.out.println("System Can't allow maximum value");
				}
				break;
			} catch (Exception e) {
				System.out.println("System allowed maximum value");
				break;
			}
		}
	}

	@Then("^user enter the invaid values$")
	public void user_enter_the_invaid_values() throws InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver,
				targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild());
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().clear();
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild()
				.sendKeys(testData.get("Invalide Value"));
		targetMaintenanceObj.iisTargetMaintenancePolicyNoFeild().sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	@Then("^user validate the feild that it does not allow invalid values$")
	public void user_validate_the_feild_that_it_does_not_allow_invalid_values() throws InterruptedException {
		for (int i = 1; i <= 50; i++) {
			try {
				WebElement Error_PopUp = targetMaintenanceObj.iisTargetMaintenenaceErrorPopUpOkBtn();
				WebElement Error_PopUp2 = targetMaintenanceObj.iisTargetMaintenanceConfirmOkBtn();
				boolean isError_PopUp = Error_PopUp.isDisplayed();
				boolean isError_PopUp2 = Error_PopUp2.isDisplayed();
				if (isError_PopUp || isError_PopUp2) {
					System.out.println("System Can't allow Invalid value");

				}
				break;
			} catch (Exception e) {
				System.out.println("System allowed Invalid value");
				break;
			}
		}
		Thread.sleep(2000);
	}

	@Then("^user check the searching is working correct$")
	public void user_check_the_searching_is_working_correct() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTemplateMaintenancePolicyRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
		{
			try {
				String text = targetMaintenanceObj.iisTemplateMaintenancePolicyRec().getText().trim();
				String title = targetMaintenanceObj.iisTemplateMaintenancePolicyRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Policy No");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("The grid and the releavant data is correct");

				} else {
					System.out.println("The grid and the releavant data is not correct");
				}

				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	//---------------------------menu list--------------------------//
	
	@Then("^user 48 check for menu is available$")
	public void user_48_check_for_menu_is_available() {
		waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTargetMaintenanceModule());
		WebElement Menu = targetMaintenanceObj.iisTargetMaintenanceModule();
		boolean isMenu = Menu.isDisplayed();
		if (isMenu) {
			Assert.assertTrue(isMenu, "Menu is avaliable");
		} else {
			Assert.assertFalse(isMenu, "Menu is not avaliable");
		}

	}

	@Then("^user 48 check for the list inside the menu is avaliable$")
	public void user_check_for_the_list_inside_the_menu_is_avaliable() {
		WebElement Repayment_iisRepaymentApprove = waitHelper.waitForElementwithFluentwait(driver,
				targetMaintenanceObj.iisTargetMaintenenaceApprove());
		WebElement Repayment_iisRepaymentList = waitHelper.waitForElementwithFluentwait(driver,
				targetMaintenanceObj.iisTargetMaintenenaceList());
		WebElement Repayment_iisMaintenanceButton = waitHelper.waitForElementwithFluentwait(driver,
				targetMaintenanceObj.iisTargetMaintenanceModuleMaintenance());
	

		boolean isRepayment_iisRepaymentApprove = Repayment_iisRepaymentApprove.isDisplayed();
		boolean isRepayment_iisRepaymentList = Repayment_iisRepaymentList.isDisplayed();
		boolean isRepayment_iisMaintenanceButton = Repayment_iisMaintenanceButton.isDisplayed();
		

		if (isRepayment_iisRepaymentApprove && isRepayment_iisRepaymentList && isRepayment_iisMaintenanceButton ) {
			Assert.assertTrue(
					isRepayment_iisRepaymentApprove && isRepayment_iisRepaymentList && isRepayment_iisMaintenanceButton, "All the list item is Avaliable");
			System.out.println(Repayment_iisMaintenanceButton.getText());
			System.out.println(Repayment_iisRepaymentApprove.getText());
			System.out.println(Repayment_iisRepaymentList.getText());
		} else {
			Assert.assertFalse(
					isRepayment_iisRepaymentApprove && isRepayment_iisRepaymentList
							&& isRepayment_iisMaintenanceButton,"All the list value is not Avaliable);");
		}

	}

	//----------------------------button Working-----------------------//
	
	@Then("^user 48 click on the clear button$")
	public void user_48_click_on_the_clear_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentClearBtn());
		repaymentPlanObj.iisRepaymentClearBtn().click();
	}

	@Then("^user 48 click on the next button$")
	public void user_48_click_on_the_next_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentNextBtn());
		repaymentPlanObj.iisRepaymentNextBtn().click();
	}

	@Then("^user 48 validate the next button is working correctly$")
	public void user_48_validate_the_next_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentNextBtn());
		WebElement Next_btn = repaymentPlanObj.iisRepaymentNextBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++)
			try {
				if (isNext_btn) {
					Assert.assertTrue(isNext_btn);
					System.out.println("Clicked on Next btn");
				}
				break;
			} catch (Exception e) {
                  System.out.println("click on not working");
			}

	}

	@Then("^user 48 click on the last button$")
	public void user_48_click_on_the_last_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentLastBtn());
		repaymentPlanObj.iisRepaymentLastBtn().click();
	}

	@Then("^user 48 validate the last button is working correctly$")
	public void user_48_validate_the_last_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentLastBtn());
		WebElement Next_btn = repaymentPlanObj.iisRepaymentLastBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++)
			try {
				if (isNext_btn) {
					Assert.assertTrue(isNext_btn);
					System.out.println("Clicked on Last btn");
				}
				break;
			} catch (Exception e) {
                  System.out.println("click on not working");
			}

	}

	@Then("^user 48 click on the previous button$")
	public void user_48_click_on_the_previous_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentPreviousBtn());
		repaymentPlanObj.iisRepaymentPreviousBtn().click();
	}

	@Then("^user 48 validate the previous button is working correctly$")
	public void user_48_validate_the_previous_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentPreviousBtn());
		WebElement Next_btn = repaymentPlanObj.iisRepaymentPreviousBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++)
			try {
				if (isNext_btn) {
					Assert.assertTrue(isNext_btn);
					System.out.println("Clicked on Previous btn");
				}
				break;
			} catch (Exception e) {
                  System.out.println("click on not working");
			}
	}

	@Then("^user 48 click on the first button$")
	public void user_48_click_on_the_first_button() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentFirstBtn());
		repaymentPlanObj.iisRepaymentFirstBtn().click();
	}

	@Then("^user 48 validate the first button is working correctly$")
	public void user_48_validate_the_first_button_is_working_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, repaymentPlanObj.iisRepaymentFirstBtn());
		WebElement Next_btn = repaymentPlanObj.iisRepaymentFirstBtn();
		boolean isNext_btn = Next_btn.isEnabled();
		for (int i = 1; i <= 50; i++)
			try {
				if (isNext_btn) {
					Assert.assertTrue(isNext_btn);
					System.out.println("Clicked on First btn");
				}
				break;
			} catch (Exception e) {
                  System.out.println("click on not working");
			}
	}
	
	
	@Then("^user 48 check the retrival of record$")
	public void user_48_check_the_retrival_of_record() {
		WebElement Rec = waitHelper.waitForElementwithFluentwait(driver, targetMaintenanceObj.iisTemplateMaintenancePolicyRec());
		boolean isRec = Rec.isDisplayed();
		for (int i = 1; i <= 50; i++)
		{
			try {
				String text = targetMaintenanceObj.iisTemplateMaintenancePolicyRec().getText().trim();
				String title = targetMaintenanceObj.iisTemplateMaintenancePolicyRec().getAttribute("title").trim();
				System.out.println("Fetched text : " + text);
				System.out.println("Fetched Title : " + title);
				String Actual_Title = text.substring(1);
				System.out.println(Actual_Title);// Get the digits from index 1 to the end isRec &
				String Given_Title = testData.get("Policy No");
				System.out.println(Given_Title);
				if (Actual_Title.equalsIgnoreCase(Given_Title) && isRec) {

					System.out.println("The grid and the releavant data is correct");

				} else {
					System.out.println("The grid and the releavant data is not correct");
				}

				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
}
