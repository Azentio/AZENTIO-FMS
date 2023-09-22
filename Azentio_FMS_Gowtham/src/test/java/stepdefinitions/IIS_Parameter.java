package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import junit.framework.Assert;
import pageobjects.IIS_Parameter_Obj;
import resources.BaseClass;

public class IIS_Parameter {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IIS_Parameter_Obj IIS_Parameter_Obj = new IIS_Parameter_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	IIS_Login IIS_Login = new IIS_Login(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\IISTestData.xlsx";
	ExcelData AssetManagement =  new ExcelData(path, "Asset_Management", "Data Set ID");
	Map<String, String> testData;
	

	@Given("User_607 Click Promotion Type Under Parameters In IISparam")
	public void user_click_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Promotion_Type_Under_Parameters_In_IISparam_607());
		IIS_Parameter_Obj.Promotion_Type_Under_Parameters_In_IISparam_607().click();
		
	}

	@Given("User_607 Click Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_click_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		IIS_Parameter_Obj.ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().click();
		
	}

	@Given("User_607 Check Code Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_check_code_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Brief Description Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_check_brief_description_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Long Description Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_long_description_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Brief Description In Arabic Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_check_brief_description_in_arabic_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Long Description In Arabic Field In Mainteance Under Promotion Type Under Parameters In IISparam")
	public void user_long_description_in_arabic_field_in_mainteance_under_promotion_type_under_parameters_in_ii_sparam() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607());
		if (!IIS_Parameter_Obj.LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607().isDisplayed()) {
			Assert.fail();
		}
	}

	@Given("User_607 Click Additional Information In Mainteance Under Product Class")
	public void user_click_additional_information_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClickAdditional_Information_In_Mainteance_UnderProductClass_607());
		IIS_Parameter_Obj.ClickAdditional_Information_In_Mainteance_UnderProductClass_607().click();
	    
	}

	@Given("User_607 Click limit In Additional Information In Mainteance Under Product Class")
	public void user_click_limit_in_additional_information_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass_607());
		IIS_Parameter_Obj.ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass_607().click();
	    
	}

	@Given("User_607 Check Promotion Type Field In limit In Additional Information In Mainteance Under Product Class")
	public void user_check_promotion_type_field_in_limit_in_additional_information_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607());
		if (!IIS_Parameter_Obj.Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Insurance Type Field In limit In Additional Information In Mainteance Under Product Class")
	public void user_check_insurance_type_field_in_limit_in_additional_information_in_mainteance_under_product_class() {
		waitHelper.waitForElementwithFluentwait(driver, IIS_Parameter_Obj.Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607());
		if (!IIS_Parameter_Obj.Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607().isDisplayed()) {
			Assert.fail();
		}
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
