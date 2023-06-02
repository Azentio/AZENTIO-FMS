package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.fms.CashcolletralamtdecreasedOBJ;
import resources.BaseClass;

public class CashcolletralamtdecreasedSTEPS {
	WebDriver driver = BaseClass.driver;
	CashcolletralamtdecreasedOBJ cashcolletral = new CashcolletralamtdecreasedOBJ(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper 	clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	FMSLogin fmsLogin = new FMSLogin(driver);
	
	@And("^User click the colletral type in parameter$")
    public void user_click_the_colletral_type_in_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cashcolletral.paramcolletraltype());
		cashcolletral.paramcolletraltype().click();
        
    }

    @And("^user click the Maintenence menu under colletral type$")
    public void user_click_the_maintenence_menu_under_colletral_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramcolletraltypemaintenance());
		cashcolletral.Paramcolletraltypemaintenance().click();
		
		waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramcolletraltypemaintenancesearchcode());
		//cashcolletral.colletraltypemaintenancesearchcode().click();
		cashcolletral.Paramcolletraltypemaintenancesearchcode().sendKeys("3695");
        
    }

    @And("^user enter the value of brief discription$")
    public void user_enter_the_value_of_brief_discription() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Parambriefdiscription());
    	cashcolletral.Parambriefdiscription().sendKeys("Testadata");
        
    }

    @And("^user enter the value of long discription$")
    public void user_enter_the_value_of_long_discription() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramlongdiscription());
    	cashcolletral.Paramlongdiscription().sendKeys("Testadata");
        
    }

    @And("^user enter the value of facility coverage$")
    public void user_enter_the_value_of_facility_coverage() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramfacilitycoverage());
    	cashcolletral.Paramfacilitycoverage().sendKeys("100",Keys.TAB);
    	cashcolletral.Paramallowtoedit().click();
    }

    @And("^user select the Asset type$")
    public void user_select_the_asset_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramassettype());
    	dropDownHelper.SelectUsingVisibleText(cashcolletral.Paramassettype(),"Cash");
    	
    	for(int i = 0; i <= 300; i++) {
    		try {
    			javascriptHelper.scrollIntoView(cashcolletral.Parammaintenancesavebutton());
			} catch (Exception e) {
				if(i == 300) {
					Assert.fail(e.getMessage());
				}
			}
    	}

    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Parammaintenancesavebutton());
    	cashcolletral.Parammaintenancesavebutton().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramconfirmsaveprocess());
    	cashcolletral.Paramconfirmsaveprocess().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramrecordapprovesuccess());
    	cashcolletral.Paramrecordapprovesuccess().click();
    	
    }
    	
    	
    	
    	

    @And("^user Click the Approve menu under Colletral type$")
    public void user_click_the_approve_menu_under_colletral_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramcolletraltypeapprove());
    	cashcolletral.Paramcolletraltypeapprove().click();
    	
//    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.approveclearbtn());
//    	cashcolletral.approveclearbtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramcoderetrivedatadoubletap());
    	clicksAndActionsHelper.doubleClick(cashcolletral.Paramcoderetrivedatadoubletap());
    	
//    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.retrivedatadoubletap());
//    	cashcolletral.retrivedatadoubletap().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramcashcolletralapprove());
    	cashcolletral.Paramcashcolletralapprove().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramconfirmapproveprocess());
    	cashcolletral.Paramconfirmapproveprocess().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.Paramrecordapprovesuccess());
    	cashcolletral.Paramrecordapprovesuccess().click();
    	
     }

       // @And("^user Approve the cash colletral value$")
//    public void user_approve_the_cash_colletral_value() throws Throwable {
//    	cashcolletral.cashcolletralapprove().click();
//    	//cashcolletral.approveclearbtn().click();
//    	//cashcolletral.retrivedatadoubletap().click();
//    	cashcolletral.colletraltypeapprove().click();
//    	cashcolletral.confirmapproveprocess().click();
//    	cashcolletral.recordapprovesuccess().click();
//    }

    @And("^user Click the Colletral management menu$")
    public void user_click_the_colletral_management_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagement());
    	cashcolletral.colletralmanagement().click();
        
    }

    @And("^user click the maintenance under Colletral management$")
    public void user_click_the_maintenance_under_colletral_management() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagementmaintenance());
    	cashcolletral.colletralmanagementmaintenance().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagementmaintenancesearchbox());
    	cashcolletral.colletralmanagementmaintenancesearchbox().sendKeys("3695");
    }

    @And("^user select the valid from date$")
    public void user_select_the_valid_from_date() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.validfromdate());
    	cashcolletral.validfromdate().sendKeys("02/06/2023");
    
        
    }

    @And("^user select the valid to date$")
    public void user_select_the_valid_to_date() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.validtodate());
    	cashcolletral.validtodate().sendKeys("02/06/2023");
        
    }

    @And("^user Enter the value of brief discription in main information$")
    public void user_enter_the_value_of_brief_discription_in_main_information() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.maininformationbriefdiscription());
    	cashcolletral.maininformationbriefdiscription().sendKeys("fmscore");
        
    }

    @And("^user Enter the value of long discription in main information$")
    public void user_enter_the_value_of_long_discription_in_main_information() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.maininformationlongdiscription());
    	cashcolletral.maininformationlongdiscription().sendKeys("fmscore");
        
    }

    @And("^User Enter the value of CIFNO in main information$")
    public void user_enter_the_value_of_cifno_in_main_information() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.maininformationcifno());
    	cashcolletral.maininformationcifno().sendKeys("727");
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.doyouwanttoproceedpopup());
    	cashcolletral.doyouwanttoproceedpopup().click();
    }

    @And("^user Enter the value of colletral currency$")
    public void user_enter_the_value_of_colletral_currency() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.maininformationcolletralcurrency());
    	cashcolletral.maininformationcolletralcurrency().sendKeys("840");
        
    }

    @And("^user Enter the cash colletral details$")
    public void user_enter_the_cash_colletral_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralcashdetailstab());
    	cashcolletral.colletralcashdetailstab().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralcashdetailstabaddbtn());
    	cashcolletral.colletralcashdetailstabaddbtn().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.additionalreferenecesearchbox());
    	cashcolletral.additionalreferenecesearchbox().click();
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.additionalReferenceretrivedatadoubletap());
        clicksAndActionsHelper.doubleClick(cashcolletral.additionalReferenceretrivedatadoubletap());
        
        waitHelper.waitForElementwithFluentwait(driver, cashcolletral.additionalReferenceamountdetails());
        javascriptHelper.scrollIntoView(cashcolletral.additionalReferenceamountdetails());
        cashcolletral.additionalReferenceamountdetails().sendKeys("10000",Keys.ENTER);
        
        waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagmentsavebtn());
        cashcolletral.colletralmanagmentsavebtn().click();
        
        waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagmentconfirmsaveprocessok());
        cashcolletral.colletralmanagmentconfirmsaveprocessok().click();
    }

    @And("^user click the approve menu in colletral management$")
    public void user_click_the_approve_menu_in_colletral_management() throws Throwable {
    	
    	waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagementapprove());
        cashcolletral.colletralmanagementapprove().click();
        
        waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagementapproveclrbtn());
        cashcolletral.colletralmanagementapproveclrbtn().click();
        
        waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagementapproveretrivedatadoubletap());
        clicksAndActionsHelper.doubleClick(cashcolletral.colletralmanagementapproveretrivedatadoubletap());
        
        waitHelper.waitForElementwithFluentwait(driver, cashcolletral.colletralmanagementapproveretrivedatadoubletapfinalapprove());
        cashcolletral.colletralmanagementapproveretrivedatadoubletapfinalapprove().click();
        
    }


}
