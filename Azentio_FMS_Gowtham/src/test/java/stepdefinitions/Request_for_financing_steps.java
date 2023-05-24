package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.Request_for_financing_Obj;
import resources.BaseClass;

public class Request_for_financing_steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	CSMLogin csmLogin = new CSMLogin(driver);
	Request_for_financing_Obj Request_for_financing_Obj = new Request_for_financing_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	CSMLogin CSMLogin = new CSMLogin(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\FMSTestData.xlsx";
	ExcelData fmsTransactionsExcelData = new ExcelData(path, "WIFAK_Application_TestData", "Data Set ID");
	Map<String, String> testData;

	  @And("^Click Request for financin$")
	    public void click_request_for_financin() throws Throwable {
		  waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.RequestForFinancin());
			clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.RequestForFinancin());
			JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Scroolinto_Click_RequestForFinancin());
		  Request_for_financing_Obj.RequestForFinancin().click();
	        
	    }

	    @And("^Click Request for financing$")
	    public void click_request_for_financing() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.RequestForFinancing());
				clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.RequestForFinancing());
				 Request_for_financing_Obj.RequestForFinancing().click();
	    }

	    @And("^Goto maintenace$")
	    public void goto_maintenace() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.maintenance_under_RequestForFinancing());
				clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.maintenance_under_RequestForFinancing());
				Request_for_financing_Obj.maintenance_under_RequestForFinancing().click();
	    }

	    @And("^Select Reason For Submission$")
	    public void select_reason_for_submission() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Select_reason_for_submission());
				clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Select_reason_for_submission());
				DropDownHelper.SelectUsingVisibleText(Request_for_financing_Obj.Select_reason_for_submission(), "Modify Request");
				
				
	    }

	    @And("^Enter value on Existing Facility No$")
	    public void enter_value_on_existing_facility_no() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.enter_Existing_Facility_No());
				clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.enter_Existing_Facility_No());
				Request_for_financing_Obj.enter_Existing_Facility_No().click();
				Request_for_financing_Obj.enter_Existing_Facility_No().sendKeys("1399");
				Request_for_financing_Obj.Afertenter_Existing_Facility_No_ClickSearch().click();
//				for (int i = 0; i <= 300; i++) {
//					if (!(Request_for_financing_Obj.Afertenter_Existing_Facility_No_ClickSearch().getAttribute("prevvalue").isBlank())) {
//						break;
//					}
//				}
	    }

	    @And("^Click group limit$")
	    public void click_group_limit() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Afertenter_search_Existing_Facility_NoClick_Grouplimit());
				clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Afertenter_search_Existing_Facility_NoClick_Grouplimit());
				
				for (int i = 0; i < 300; i++) {
					try {
						Request_for_financing_Obj.Afertenter_search_Existing_Facility_NoClick_Grouplimit().click();						
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
	    }

	    @And("^Click add button on group limit$")
	    public void click_add_button_group_limit() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.ScrollTo_gruoplimit_AddButton());
			//clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.ScrollTo_gruoplimit_AddButton());
			JavascriptHelper.scrollIntoView( Request_for_financing_Obj.ScrollTo_gruoplimit_AddButton());
		
	    	
	    	
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Addbutton_onGrouplimit());
				//clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_Addbutton_onGrouplimit());
			
				for (int i = 0; i < 300; i++) {
					try {
						Request_for_financing_Obj.Click_Addbutton_onGrouplimit().click();					
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
	    }
	    

	    @And("^Enter first GroupID$")
	    public void enter_first_groupid() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit());
			//clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit());
			
			
			for (int i = 0; i < 300; i++) {
				try {
					Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit().click();
					Request_for_financing_Obj.Click_In_and_enter_firstGroupID_onGroupLimit().sendKeys("1");			
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
	    }

	    @And("^Enter first Group limit$")
	    public void enter_first_group_limit() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit());
			clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_and_enter_firstGroupID_onGroupLimit());
			Request_for_financing_Obj.Click_and_enter_firstlimit_onGroupLimit().click();
			Request_for_financing_Obj.Click_and_enter_firstlimit_onGroupLimit().sendKeys("2000");
			
			
	    }

	    @And("^Enter first Group name$")
	    public void enter_first_group_name() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_and_enter_FirstGroupname_onGroupLimit());
			Request_for_financing_Obj.Click_and_enter_FirstGroupname_onGroupLimit().click();
			
			waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_ok_on_error_screen());
			Request_for_financing_Obj.Click_ok_on_error_screen().click();
			
			
			
			waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_and_enter_FirstGroupname_onGroupLimit());
			Request_for_financing_Obj.Click_and_enter_FirstGroupname_onGroupLimit().click();
			
			
//			for (int i = 0; i <= 300; i++) {
//				if (!(Request_for_financing_Obj.Click_and_enter_firstlimit_onGroupLimit().getAttribute("prevvalue").isBlank())) {
//					break;
//				}
//			}
			
			Request_for_financing_Obj.Click_In_and_enter_FirstGroupname_onGroupLimit().sendKeys("dq");
	    }

	    @And("^Enter Second GroupID$")
	    public void enter_second_groupid() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Addbutton_onGrouplimit());
				//clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_Addbutton_onGrouplimit());
			
				for (int i = 0; i < 300; i++) {
					try {
						Request_for_financing_Obj.Click_Addbutton_onGrouplimit().click();					
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_and_enter_secondGroupID_onGroupLimit());
			clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Click_and_enter_secondGroupID_onGroupLimit());
			Request_for_financing_Obj.Click_and_enter_secondGroupID_onGroupLimit().click();
			Request_for_financing_Obj.Click_In_and_enter_secondGroupID_onGroupLimit().sendKeys("2");
	    }
	    
	    @Then("^Enter Second Group limit$")
	    public void enter_second_group_limit() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Afterenter_value_on_SecondLimit_clickout());
			//clicksAndActionsHelper.moveToElement(Request_for_financing_Obj.Afterenter_value_on_SecondLimit_clickout());
			Request_for_financing_Obj.Click_and_enter_secondlimit_onGroupLimit().click();
			Request_for_financing_Obj.Click_and_enter_secondlimit_onGroupLimit().sendKeys("10000");
			Request_for_financing_Obj.Afterenter_value_on_SecondLimit_clickout().click();
			waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.CannotPoceed_After_enterHighvalue());
			Assert.assertEquals(true, Request_for_financing_Obj.CannotPoceed_After_enterHighvalue().isDisplayed());
			
	    }
	    
	    //////////@664435
	    
	    @Given("^Login into FMS Application$")
	    public void login_into_fms_application() throws Throwable {
	    	driver.get(configFileReader.getCSMApplicationUrl());
	    	CSMLogin.loginIntoCSMApplication(configFileReader.getCSMApplicationUserType());
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    @And("^Click on baj application$")
	    public void click_on_baj_application() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_baj_application());
	    	Request_for_financing_Obj.Click_baj_application().click();
	    }

	    @And("^Click Application Under baj application$")
	    public void click_application_under_baj_application() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_application_under_baj_application());
	    	Request_for_financing_Obj.Click_application_under_baj_application().click();
	    }

	    @And("^Click Application For Financial Facilities under application$")
	    public void click_application_for_financial_facilities_under_application() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_Application_For_Financial_Facilities_under_application());
	    	Request_for_financing_Obj.Click_Application_For_Financial_Facilities_under_application().click();
	    }

	    @And("^Click Maintenance Under Application For Financial Facilities$")
	    public void click_maintenance_under_application_for_financial_facilities() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_maintenance_under_Application_For_Financial_Facilities());
	    	Request_for_financing_Obj.Click_maintenance_under_Application_For_Financial_Facilities().click();
	    }

	    @And("^Click Search button on Maintenance tab$")
	    public void click_search_button_on_maintenance_tab() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Click_searchOn_maintenance());
	    	Request_for_financing_Obj.Click_searchOn_maintenance().click();
	    }

	    @And("^Enter Request No$")
	    public void enter_request_no() throws Throwable {
	    	//waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Scroll_into_reqNo());
	    	JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Scroll_into_reqNo());
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Enter_req_no());
	    	Request_for_financing_Obj.Enter_req_no().click();
	    	Request_for_financing_Obj.Enter_req_no().sendKeys("128");
	    	Request_for_financing_Obj.Enter_req_no().sendKeys(Keys.ENTER);
	    	
	    }

	    @And("^Double ClickOn Request no$")
	    public void double_clickon_request_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.DoubleClickOn_req_no());
	    	clicksAndActionsHelper.doubleClick( Request_for_financing_Obj.DoubleClickOn_req_no());
	        
	    }

	    @And("^Enter anything on Additional Reference$")
	    public void enter_anything_on_additional_reference() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.AddAny_AdditionalReference());
	    	Request_for_financing_Obj.AddAny_AdditionalReference().sendKeys("1123567");
	    }

	    @And("^Click validate button on down$")
	    public void click_validate_button_on_down() throws Throwable {
	    	//waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Scrolldown_to_click_ValidateButton());
	    	
	    	for (int i = 0; i < 300; i++) {
				try {
					JavascriptHelper.scrollIntoView(Request_for_financing_Obj.Scrolldown_to_click_ValidateButton());
					Request_for_financing_Obj.click_ValidateButton_afterScroll().click();
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	//waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.click_ValidateButton_afterScroll());
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Popup_msg());
	    	Request_for_financing_Obj.Popup_msg().click();
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.ClickYes_onPostApproval_screen());
	    	Request_for_financing_Obj.ClickYes_onPostApproval_screen().click();
	    	waitHelper.waitForElementwithFluentwait(driver, Request_for_financing_Obj.Success_Screen_AfterValidate());
	    	Assert.assertEquals(true, Request_for_financing_Obj.Success_Screen_AfterValidate().isDisplayed());
	        
	    }

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    
	    
	    
	    

	

