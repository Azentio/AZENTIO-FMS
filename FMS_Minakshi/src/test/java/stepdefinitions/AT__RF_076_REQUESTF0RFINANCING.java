package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.FMSCommonWebElements;
import pageobjects.fms.RequestForFinancing_Obj1;
import resources.BaseClass;

 

public class AT__RF_076_REQUESTF0RFINANCING  extends BaseClass
{
	WebDriver driver = BaseClass.driver;
	FMSLogin FMSLogin = new FMSLogin(driver);
	IISLogin iisLogin = new IISLogin(driver);
	RequestForFinancing_Obj1 requestForFinancing_Obj1 =new RequestForFinancing_Obj1(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ApplicationForFinancialFacility","DataSet ID");
	ExcelData facilityManagementData = new ExcelData(path,"FacilitiesManagement","DataSet ID");
	ExcelData requestForFinancingData = new ExcelData(path,"RequestForFinancing_482","DataSet ID");
	ExcelData drawDownRequestData = new ExcelData(path,"DrawDownRequest","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;

	Robot r;
	@And("^User click on msdemo menu under FMS application$")
	public void User_click_on_msdemo_menu_under_FMS_application() {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.msdemo_Under_MenuOption_Request_For_Financing());
	for(int i=1;i<=20;i++) {
		try { 
	
	          requestForFinancing_Obj1.msdemo_Under_MenuOption_Request_For_Financing().click();
		}catch (Exception e) {
		if(i==20)
			Assert.fail(e.getMessage());
			}	
		}
	}
	@And("^User click the msdemo Sub Menu under msdemo$")
	public void User_click_the_msdemo_Sub_Menu_under_msdemo() {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.msdemo_Title_Under_MenuOption_Request_For_Financing());	
	requestForFinancing_Obj1.msdemo_Title_Under_MenuOption_Request_For_Financing().click();
	}
	
	
	@And("^User click on Request For Financing Sub Menu in msdemo$")
	public void User_click_on_Request_For_Financing_Sub_Menu_in_msdemo() {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.msdemo_RequestForFinance_Under_MenuOption_Request_For_Financing());
	requestForFinancing_Obj1.msdemo_RequestForFinance_Under_MenuOption_Request_For_Financing().click();
	}
	
	
	@And("^User click Maintenace under Request for financing$")
	public void User_click_Maintenace_under_Request_for_financing() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.msdemo_Maintainence_Under_MenuOption_Request_For_Financing());
	requestForFinancing_Obj1.msdemo_Maintainence_Under_MenuOption_Request_For_Financing().click();
		Thread.sleep(3000);	}
	/*@And("^User update test data set for AT_AFF_024$")
    public void user_update_test_data_set_for_AT_AFF_024() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AFF_024");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }*/
	
	@And("^User click on Reason For Submission tab in maintenence screen$")
	public void User_click_on_reason_for_submission_tab_in_maintenence_screen() throws AWTException {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.reasonForSubmissionSelect());
	seleniumActions.getDropDownHelper();
	//selectUsingVisibleText(requestForFinancing_Obj1.reasonForSubmissionSelect(), "New Request");
	r=new Robot();
	
	for (int i = 0; i <=20; i++) {
		try {
			requestForFinancing_Obj1.reasonForSubmissionSelect().sendKeys(Keys.ARROW_DOWN);
			requestForFinancing_Obj1.reasonForSubmissionSelect().sendKeys(Keys.ARROW_DOWN);
			requestForFinancing_Obj1.reasonForSubmissionSelect().sendKeys(Keys.ENTER);
			requestForFinancing_Obj1.reasonForSubmissionSelect().sendKeys(Keys.TAB);
			break;
			
		} catch (Exception e) {
			if(i==20)
				Assert.fail(e.getMessage());
		}
	}
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.Completiondate());
	r=new Robot();
	requestForFinancing_Obj1.Completiondate().sendKeys("16/01/2021");
	requestForFinancing_Obj1.Completiondate().sendKeys(Keys.TAB);
	}
	
	@And("^User click on Customer tab in maintenence screen$")
	public void User_click_on_custome_tab_in_maintenence_screen() throws AWTException, Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.customerCIF());
	seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.customerCIF());
	seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing_Obj1.customerCIF());
	//requestForFinancing_Obj1.reasonForSubmissionSelect().sendKeys(Keys.ARROW_DOWN);
	//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.facilityTypeInRequestForFinancingScreen());
	//seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.facilityTypeInRequestForFinancingScreen());
	//eleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing_Obj1.facilityTypeInRequestForFinancingScreen());
	r=new Robot();
	requestForFinancing_Obj1.customerCIF().sendKeys("727");
	requestForFinancing_Obj1.customerCIF().sendKeys(Keys.TAB);
	Thread.sleep(3000);
	
	
	}
	  @And("^User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCING$")
	public void user_search_the_facility_type_under_maintenance_screen_in_request_for_financing() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.facilityTypeInRequestForFinancingScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.facilityTypeInRequestForFinancingScreen());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing_Obj1.facilityTypeInRequestForFinancingScreen());
	    r=new Robot();
		requestForFinancing_Obj1.facilityTypeInRequestForFinancingScreen().sendKeys("9876");
		requestForFinancing_Obj1.facilityTypeInRequestForFinancingScreen().sendKeys(Keys.TAB);
		Thread.sleep(3000);
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancing_Obj1.totallimit());
		seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.totallimit());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing_Obj1.totallimit());
	    
	    requestForFinancing_Obj1.totallimit().sendKeys("100000");
	    requestForFinancing_Obj1.totallimit().sendKeys(Keys.TAB);
  		}

	 

	/*  @And("^User_482 click on Disbursement tab$")
		public void User_482_click_on_Disbursement_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.disbursementOrSublimitInRequestForFinancingScreen());
			seleniumActions.getJavascriptHelper()
					.scrollIntoView(requestForFinancing_Obj1.disbursementOrSublimitInRequestForFinancingScreen());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(requestForFinancing_Obj1.disbursementOrSublimitInRequestForFinancingScreen());
			for (int i = 1; i < 50; i++) {
				try {
					requestForFinancing_Obj1.disbursementOrSublimitInRequestForFinancingScreen().click();
					break;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

	 

		}

	  @And("User_482 click on add icon btn under disbursement")
		public void User_482_click_on_add_icon_btn_under_disbursement() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.addIconInDisbursementOrSublimitScreen());
			seleniumActions.getJavascriptHelper()
					.scrollIntoView(requestForFinancing_Obj1.addIconInDisbursementOrSublimitScreen());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(requestForFinancing_Obj1.addIconInDisbursementOrSublimitScreen());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(requestForFinancing_Obj1.addIconInDisbursementOrSublimitScreen());
		}

	  @And("User_482 click on product class")
		public void User_482_click_on_product_class() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.ProductClass());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.ProductClass());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing_Obj1.ProductClass());
		}
	
	  @And("User_482 enter the product class code")
		public void User_482_enter_the_product_class_code() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.ProductClass());
			requestForFinancing_Obj1.totallimit().clear();
			requestForFinancing_Obj1.totallimit().sendKeys("1");
			requestForFinancing_Obj1.totallimit().sendKeys(Keys.TAB);
		}
	  
	  @And("User_482 click on the add button")
		public void User_482_click_on_the_add_button() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.ProductClassAdd());
			for (int i = 1; i < 100; i++) {
				try {
					requestForFinancing_Obj1.ProductClassAdd().click();
					break;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	 

		@And("^User_482 select the newly added product class rec$")
		public void User_482_select_the_newly_added_product_class_rec() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.PricingClassRec());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.PricingClassRec());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing_Obj1.PricingClassRec());
		}

	 

		@And("User_482 click on the pricing details tab")
		public void User_482_click_on_the_pricing_details_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.PricingDetailsBtn());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(requestForFinancing_Obj1.PricingDetailsBtn());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(requestForFinancing_Obj1.PricingDetailsBtn());

	 

		}
		@And("User_482 click on the markup spreadsheet perc under pricing details tab")
		public void User_482_click_on_the_markup_spreadsheet_perc_under_pricing_details_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.MarkupSpreadRec());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.MarkupSpreadRec());
			seleniumActions.getClickAndActionsHelper().doubleClick(requestForFinancing_Obj1.MarkupSpreadRec());
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.MarkupSpreadInput());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(requestForFinancing_Obj1.MarkupSpreadInput());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(requestForFinancing_Obj1.MarkupSpreadInput());

	 

		}

	 

		@And("User_482 enter the markup spreadsheet perc under pricing details tab")
		public void User_482_enter_the_markup_spreadsheet_perc_under_pricing_details_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.MarkupSpreadInput());
			requestForFinancing_Obj1.MarkupSpreadInput().clear();
			requestForFinancing_Obj1.MarkupSpreadInput().sendKeys("1");
			requestForFinancing_Obj1.MarkupSpreadInput().sendKeys(Keys.TAB);
		}

	 

		@And("User_482 click on the floor perc under pricing details tab")
		public void User_482_click_on_the_floor_perc_under_pricing_details_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.FloorInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.FloorInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing_Obj1.FloorInput());
		}

	 

		@And("User_482 enter the floor perc under pricing details tab")
		public void User_482_enter_the_floor_perc_under_pricing_details_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.FloorInput());
			requestForFinancing_Obj1.FloorInput().clear();
			requestForFinancing_Obj1.FloorInput().sendKeys("1");
			requestForFinancing_Obj1.FloorInput().sendKeys(Keys.TAB);
		}

	 

		@And("User_482 click on the cap perc under pricing details tab")
		public void User_482_click_on_the_cap_perc_under_pricing_details_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.CapInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancing_Obj1.CapInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancing_Obj1.CapInput());
		}

	 

		@And("User_482 enter the cap perc under pricing details tab")
		public void User_482_enter_the_cap_perc_under_pricing_details_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.CapInput());
			requestForFinancing_Obj1.CapInput().clear();
			requestForFinancing_Obj1.CapInput().sendKeys("1");
			requestForFinancing_Obj1.CapInput().sendKeys(Keys.TAB);
		}

	 

		@And("User_483 click on the ohk button under pricing details tab")
		public void User_483_click_on_the_ohk_button_under_pricing_details_tab() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					requestForFinancing_Obj1.PricingDetailsOKBtn());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(requestForFinancing_Obj1.PricingDetailsOKBtn());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(requestForFinancing_Obj1.PricingDetailsOKBtn());
		}*/
}
