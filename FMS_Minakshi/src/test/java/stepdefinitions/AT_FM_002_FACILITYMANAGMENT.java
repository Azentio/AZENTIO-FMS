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
import pageobjects.fms.AT_FM_002FACILITYMANAGMENT_OBJ;
import pageobjects.fms.ApplicationForFinancialFacilityObj;
import pageobjects.fms.ApplicationForFinancialFacility_482_Obj;
import resources.BaseClass;

 public class AT_FM_002_FACILITYMANAGMENT extends BaseClass {
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
	ApplicationForFinancialFacility_482_Obj applicationForFinancialFacilityObj = new ApplicationForFinancialFacility_482_Obj(driver);
	AT_FM_002FACILITYMANAGMENT_OBJ at_fm_002facilitymanagment=new AT_FM_002FACILITYMANAGMENT_OBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	int randomNumber;
	String Request_Code = "";

	@And("User_482 click on the Account No feild under limit details")
	public void User_482_click_on_the_Account_No_feild_under_limit_details() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.AccountNo());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.AccountNo());
	}
	 

	@And("User_482 click on the second Account No feild under limit details")
	public void User_482_click_on_the_second_Account_No_feild_under_limit_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.AccountNo());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.AccountNo());
		Thread.sleep(2000);
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.AccountNo());
	}
	 
	@And("User_482 enter the Account feild under limit details")
	public void User_482_enter_the_Account_feild_under_limit_details() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.AccountField());
		//at_fm_002facilitymanagment.AccountNo().sendKeys(Keys.ENTER);
		//at_fm_002facilitymanagment.AccountNo().sendKeys(Keys.ENTER);
		seleniumActions.getClickAndActionsHelper().doubleClick(at_fm_002facilitymanagment.AccountField());   
	}
	@And("User_482 click on the Charge Detail tab")
	public void User_482_click_on_the_Charge_Detail_tab() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.Chargedetail());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.Chargedetail());
	}
	 
	 
	@And("User_482 click on the Rec under charge details")
	public void User_482_click_on_the_Rec_under_charge_details() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.Recunderchargedetail());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.Recunderchargedetail());
	}
	 
	 
	@And("User_482 Check the Collect at FAC Approval flag")
	public void User_482_Check_the_Collect_at_FAC_Approval_flag() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.CollectAtFac());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.CollectAtFac());
	}
	 
	 
	@And("User_482 Check on the Allow Modify TFA Charge flag")
	public void User_482_Check_on_the_Allow_Modify_TFA_Charge_flag() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.AllowModifyTfa());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.AllowModifyTfa()); 
	}
	 
	 
	@And("User_482 click on the ok btn under Charge details")
	public void User_482_click_on_the_ok_btn_under_Charge_details() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.okbutton());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.okbutton()); 
	}
	 
	 
	/*@And("User_482 click on the save button")
	public void User_482_click_on_the_save_button() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.savebuttonInRequestForFinancingScreenMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.savebuttonInRequestForFinancingScreenMaintenance());
	
	}
	 
	 
	@And("User_482 click on the validate button")
	public void User_482_click_on_the_validate_button() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.validateButtonInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.validateButtonInRequestForFinancingScreen()); 
	}
	 
	 
	@And("User_482 click on the Approve level1")
	public void User_482_click_on_the_Approve_level1() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.approvalLevel1InRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.approvalLevel1InRequestForFinancingScreen());  
	}
	 
	 
	@And("User_482 click on the code under Approve level1")
	public void User_482_click_on_the_code_under_Approve_level1() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.app());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.());  
	}
	 
	 
	@And("User_482 enter the facility code")
	public void User_482_enter_the_facility_code() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.());  
	}
	 
	 
	@And("User_482 double click on the retrived rec")
	public void User_482_double_click_on_the_retrived_rec() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.()); 
	}
	 
	 
	@And("User_482 select the decision under aprrove level1 feild")
	public void User_482_select_the_decision_under_aprrove_level1_feild() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.());   
	}
	 
	 
	@And("User_482 click on th submit button under Aprrove level1")
	public void User_482_click_on_th_submit_button_under_Aprrove_level1() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.());   
	}*/
	 
	 
	@And("User_482 click on the facilty maintenance screen")
	public void User_482_click_on_the_facilty_maintenance_screen() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.FACILITYMANAGMENT());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.FACILITYMANAGMENT()); 
	}
	 
	 
	@And("User_482 click on the maintenance under facilty maintenance screen")
	public void User_482_click_on_the_maintenance_under_facilty_maintenance_screen() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.MAINTANANCEUNDERFACILITYMANAGMENT());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.MAINTANANCEUNDERFACILITYMANAGMENT());   
	}
	 
	 
	@And("User_482 click on the search button under facilty maintenance screen")
	public void User_482_click_on_the_search_button_under_facilty_maintenance_screen() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.SEARCHUNDERFACILITYMANAGMENT());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.SEARCHUNDERFACILITYMANAGMENT());   
	}
	 
	 
	@And("User_482 click on the application reference under search feild")
	public void User_482_click_on_the_application_reference_under_search_feild() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.Apllicationref());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.Apllicationref()); 
	}
	 
	 
	@And("User_482 enter the facilty code")
	public void User_482_enter_the_facilty_code() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.Apllicationref());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.Apllicationref());  
	}
	 
	 
	@And("User_482 double click on the retrived rec under facility managment screen")
	public void User_482_double_click_on_the_retrived_rec_under_facility_managment_screen() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.doubleclick());
		seleniumActions.getClickAndActionsHelper().doubleClick(at_fm_002facilitymanagment.doubleclick()); 
	}
	 
	 
	@And("User_482 click on the general voucher detail")
	public void User_482_click_on_the_general_voucher_detail() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.journalvoucher());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.journalvoucher());  
	}
	 
	 
	@And("User_482 validate the deatils are showing correctly")
	public void User_482_validate_the_deatils_are_showing_correctly() {
		waitHelper.waitForElementwithFluentwait(driver, at_fm_002facilitymanagment.validatedetail());
		seleniumActions.getClickAndActionsHelper().clickOnElement(at_fm_002facilitymanagment.validatedetail());  
	}
	

}
