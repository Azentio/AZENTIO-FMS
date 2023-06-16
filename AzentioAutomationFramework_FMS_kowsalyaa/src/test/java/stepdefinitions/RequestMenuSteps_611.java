package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.fms.RequestMenuOBJ_611;
import resources.BaseClass;

public class RequestMenuSteps_611 {
	WebDriver driver = BaseClass.driver;
	RequestMenuOBJ_611 requestmenu = new RequestMenuOBJ_611(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clickandactionhelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	FMSLogin fmslogin = new FMSLogin(driver);
	
	//@127919_Fms_Core
		@And("User_611 clicks the Request Menu under fms application")
		public void user_clicks_the_request_menu_under_fms_application() throws Throwable {
			
		    	for(int i = 0; i <= 300; i++) {
		    		try {
		    			javascripthelper.scrollIntoView(requestmenu.fmsappliactionrequestmenu_611());
					} catch (Exception e) {
						if(i == 300) {
							Assert.fail(e.getMessage());
						}
					}
		    	}
//		    	Thread.sleep(5000);
		    	waithelper.waitForElementwithFluentwait(driver, requestmenu.fmsappliactionrequestmenu_611());
		    	requestmenu.fmsappliactionrequestmenu_611().click();
		    }
			

		@And("User_611 validate the facility management Menu are available in request financing")
		public void user_validate_the_facility_management_menu_are_available_in_request_financing() throws Throwable {
//			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestmenurequestfinancing_611());
//			requestmenu.requestmenurequestfinancing_611().click();
			
			
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingfacilitymanagement_611());
			requestmenu.requestfinancingfacilitymanagement_611().click();
		    
		}

		@And("User_611 validate the sub menus are available in request for financing menu")
		public void user_validate_the_sub_menu_s_are_available_in_request_for_financing_menu() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingrequestforfinancing_611());
			requestmenu.requestfinancingrequestforfinancing_611().click();
			
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingrequestforfinancingFirst_611());
	    	List<WebElement> code = driver.findElements(By.xpath("//div[@id='_selenuimRFFRF00']//ul/div/li/a/span[2]"));
	    	
//			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingrequestforfinancingFirst());
//	    	WebElement findElement = driver.findElement(By.xpath("//*[@id='RFFRF00LC']/span[2]"));
//	    	String text = findElement.getText();
//	    	System.out.println("Title Text: "+text);
	    	
	    	System.out.println("Code Size: "+code.size());
	    	
	    	for (WebElement webElement : code) {
	            String getCode = webElement.getText();
	            System.out.println(getCode);
	        }
		}
		
		//@809575_Fms_Core
		
		@And("User_611 clicks the Request Financing under request menu")
		public void user_clicks_the_request_financing_under_request_menu() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestmenurequestfinancing_611());
			requestmenu.requestmenurequestfinancing_611().click();
		    
		}

		@And("User_611 clicks the Request For Financing under Request Financing")
		public void user_clicks_the_request_for_financing_under_request_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestfinancingrequestforfinancing_611());
			requestmenu.requestfinancingrequestforfinancing_611().click();
		    
		}

		@And("User_611 clicks the Maintenence Menu under Request For Financing")
		public void user_clicks_the_maintenence_menu_under_request_for_financing() throws Throwable {
			waithelper.waitForElementwithFluentwait(driver, requestmenu.requestforfinancingmaintenance_611());
			requestmenu.requestforfinancingmaintenance_611().click();
			
		   
		}
		
		

}
