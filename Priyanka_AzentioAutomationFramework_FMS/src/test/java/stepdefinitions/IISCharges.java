package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.IISChargesObj;
import resources.BaseClass;

public class IISCharges extends BaseClass{
	
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	IISChargesObj iISChargesObj =new IISChargesObj(driver);
	String TestDataPath = System.getProperty("user.dir")+"\\TestData\\FMSTestData.xlsx";
	
	ExcelData excelData = new ExcelData(TestDataPath, "IISCharges", "DataSet ID");
	
	Map<String, String> testData = new HashMap<>();
	
	

	
	@And("^update the test data for test case no AT_IC_013$")
	public void update_the_test_data_for_test_case_no_AT_IC_013(){
		
		testData = excelData.getTestdata("AT_IC_013_D1");
	}
	
	
	@Then("^user click on the parameters tab$")
	public void user_click_on_the_parameters_tab(){
		waitHelper.waitForElementwithFluentwait(driver, iISChargesObj.IIS_Parameters());
		iISChargesObj.IIS_Parameters().click();
		
	} 
	
	
	@Then("^user click on the charges module$")
	public void user_click_on_the_charges_module(){
		waitHelper.waitForElementwithFluentwait(driver, iISChargesObj.IIS_Charges());
		iISChargesObj.IIS_Charges().click();
	} 
	@Then("^user click on the maintenance tab under charges module$")
	public void user_click_on_the_maintenance_tab_under_charges_module(){
		waitHelper.waitForElementwithFluentwait(driver, iISChargesObj.IIS_Maintenance());
		iISChargesObj.IIS_Maintenance().click();
	}
	@Then("^user enter code value under maintenance screen$")
	public void user_enter_code_value_under_maintenance_screen(){
		waitHelper.waitForElementwithFluentwait(driver, iISChargesObj.IIS_Charges_Code());
		iISChargesObj.IIS_Charges_Code().sendKeys(testData.get("Code"));
		iISChargesObj.IIS_Charges_Code().sendKeys(Keys.ENTER);
		
	}
	@Then("^user enter brief des value under maintenance screen$")
	public void user_enter_brief_des_value_under_maintenance_screen(){
		waitHelper.waitForElementwithFluentwait(driver, iISChargesObj.IIS_Charges_BriefDes());
		iISChargesObj.IIS_Charges_BriefDes().sendKeys(testData.get("BriefDes"));
		iISChargesObj.IIS_Charges_BriefDes().sendKeys(Keys.ENTER);
		
	}  
	@Then("^user enter long des value under maintenance screen$")
	public void user_enter_long_des_value_under_maintenance_screen(){
		waitHelper.waitForElementwithFluentwait(driver, iISChargesObj.IIS_Charges_LongDes());
		iISChargesObj.IIS_Charges_LongDes().sendKeys(testData.get("LongDes"));
		iISChargesObj.IIS_Charges_LongDes().sendKeys(Keys.ENTER);
	} 
	
	
	

}
