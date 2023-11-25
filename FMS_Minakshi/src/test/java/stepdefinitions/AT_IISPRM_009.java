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
import pageobjects.CommonElements.AT_IISPRM_009_OBJ;
import pageobjects.CommonElements.FMSCommonWebElements;
import resources.BaseClass;

	 

public class AT_IISPRM_009 extends BaseClass
	{
		WebDriver driver = BaseClass.driver;
		FMSLogin FMSLogin = new FMSLogin(driver);
		IISLogin iisLogin = new IISLogin(driver);
		AT_IISPRM_009_OBJ atiisprm009obj =new AT_IISPRM_009_OBJ(driver);
		WaitHelper waitHelper = new WaitHelper(driver);
		Selenium_Actions seleniumActions = new Selenium_Actions(driver);
		ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
		FMSCommonWebElements fmsCommonWebElements = new FMSCommonWebElements(driver);
		ConfigFileReader configFileReader = new ConfigFileReader();

		
		@And("^user click on search tab$")
		public void user_click_on_search_tab() {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm009obj.Searchtab());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm009obj.Searchtab());
		}
		
		@And("^user click on class field and enter data$")
		public void user_click_on_class_field_and_enter_data() throws InterruptedException {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm009obj.productClassTexBox());
			seleniumActions.getClickAndActionsHelper().moveToElement(atiisprm009obj.productClassTexBox());
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm009obj.productClassTexBox());
			atiisprm009obj.productClassTexBox().sendKeys("100");
			atiisprm009obj.productClassTexBox().sendKeys(Keys.ENTER);
			//waitHelper.waitForElementwithFluentwait(driver, atiisprm009obj.productClassTexBox());
			for (int i = 0; i <200; i++) {
				try {
					Assert.assertTrue(atiisprm009obj.productClassTexBox().isDisplayed());
					break;
				} catch (Exception e) {
					
				}
			}
		
		}
		@And("^user double click on retrive record$")
		public void user_double_click_on_retrive_record() throws InterruptedException {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm009obj.ProductClass100());
			seleniumActions.getClickAndActionsHelper().doubleClick(atiisprm009obj.ProductClass100());
			Thread.sleep(3000);
			}
		
		
		@And("^user check the Disable Plan detail from FMS$")
		public void user_click_the_DisableplandefaultfromFMS() throws InterruptedException {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm009obj.DisableplandefaultfromFMSText());
			Assert.assertTrue(atiisprm009obj.DisableplandefaultfromFMSText().isDisplayed());
			Assert.assertFalse(atiisprm009obj.DisableplandefaultfromFMSText().isSelected());
			System.out.println(atiisprm009obj.DisableplandefaultfromFMSText());
			Thread.sleep(2000);
			}
		
		
		
		@And("^user click on Disable Plan detail from FMS$")
		public void user_click_on_Disable_Plan_default_from_FMS() throws InterruptedException {
			waitHelper.waitForElementwithFluentwait(driver, atiisprm009obj.DisableplandefaultfromFMSBox());
			for(int i = 0; i <200; i++) {
			seleniumActions.getClickAndActionsHelper().clickOnElement(atiisprm009obj.DisableplandefaultfromFMSBox());
			break;
			}
	    }
			}
		
		
	
