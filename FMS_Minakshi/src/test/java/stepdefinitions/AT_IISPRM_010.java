package stepdefinitions;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;

	import dataProvider.ConfigFileReader;
	import helper.ClicksAndActionsHelper;
	import helper.JavascriptHelper;
	import helper.Selenium_Actions;
	import helper.WaitHelper;
	import io.cucumber.java.en.And;
	
    import pageobjects.CommonElements.AT_IISPRM_010_OBJ;
    import pageobjects.CommonElements.FMSCommonWebElements;
	import resources.BaseClass;

		 

	public class AT_IISPRM_010 extends BaseClass
		{
			WebDriver driver = BaseClass.driver;
			FMSLogin FMSLogin = new FMSLogin(driver);
			IISLogin iisLogin = new IISLogin(driver);
			AT_IISPRM_010_OBJ atiisprm010obj =new AT_IISPRM_010_OBJ(driver);
			WaitHelper waitHelper = new WaitHelper(driver);
			Selenium_Actions seleniumActions = new Selenium_Actions(driver);
			ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
			JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
			FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
			ConfigFileReader configFileReader = new ConfigFileReader();

			
			@And("^User_482 Select new created product class$")
			public void user_482_Select_new_created_product_class() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.NewCreatedProductClass());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.NewCreatedProductClass());
				
			}
			@And("^User_482 Click on replayment plan under WIRAK Application$")
			public void user_482_Click_on_replayment_plan_under_WIRAK_Application() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.Replaymentplantab());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.Replaymentplantab());
			}
			
			
			@And ("^User_482 Click on button create schedule under the replayment plan tab$")
			public void User_482_Click_on_button_create_schedule_under_the_replayment_plan_tab() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.CreateSchedulebtn());
				javascriptHelper.scrollIntoView(atiisprm010obj.Replaymentplantab());
				
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.CreateSchedulebtn());
				
			}
			@And ("^User_482 Click on yes button in Warning Pop up Menu$")
			public void User_482_Click_on_yes_button_in_Warning_Pop_up_Menu() throws InterruptedException {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.YesbtninWarningPopup());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.YesbtninWarningPopup());
				Thread.sleep(50000);
				
			}
			//@And ("^User_482 Click on button plan details$")
			//public void User_482_Click_on_button_plan_details() throws InterruptedException {
				//waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.Plandetailbtn());
				//seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.Plandetailbtn());
				//Thread.sleep(5000);
			//}
			@And("^User_482 Click on save button under the plan detail$")
			public void User_482_Click_on_save_button_under_the_plan_detail() throws InterruptedException {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.SavebtnUnderPlanDeatil());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.SavebtnUnderPlanDeatil());
				javascriptHelper.scrollIntoView(atiisprm010obj.Replaymentplantab());
				Thread.sleep(3000);
			}
			@And ("^User_482 Click on yes button in Warning Pop up$")
			public void User_482_Click_on_yes_button_in_Warning_Pop_up() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.YesbtninWarningPopUnderPlanDetail());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.YesbtninWarningPopUnderPlanDetail());
			}
			
			@And ("^User_482 Click on Ok button in Success$")
			public void User_482_Click_on_Ok_button_in_Success() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.OkbtninSuccessunderplandetail());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.OkbtninSuccessunderplandetail());
			}
			@And ("^User_482 Click Validate button$")
			public void User_482_Click_Validate_button() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.Validatebtnunderplandetail());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.Validatebtnunderplandetail());
				javascriptHelper.scrollIntoView(atiisprm010obj.Replaymentplantab());
			}
			
			@And ("^User_482 Click on ok btn after validate$")
			public void User_482_Click_on_ok_btn_after_validate() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.Okbtnaftervalidate());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.Okbtnaftervalidate());
				//javascriptHelper.scrollIntoView(atiisprm010obj.Plandetailbtn());
			}
			@And ("^User_482 Click on yes button in confirm Pop up after validation$")
			public void User_482_Click_on_yes_button_in_confirm_Pop_up_after_validation() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.yesconfirmaftervalidate());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.yesconfirmaftervalidate());
			}
			
			@And ("^User_482 Click on ok button in confirm Pop up after validation$")
			public void User_482_Click_on_ok_button_in_confirm_Pop_up_after_validation() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.okconfirmaftervalidate());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.okconfirmaftervalidate());
			}
			
			@And ("^User_482 Click on close sign$")
			public void User_482_Click_on_close_sign() {
				waitHelper.waitForElementwithFluentwait(driver, atiisprm010obj.closesign());
				seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm010obj.closesign());
			}
}
