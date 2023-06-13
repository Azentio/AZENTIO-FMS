package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CommonElements.FMS_WifakApplication_Obj;
import resources.BaseClass;

public class FMS_WifakApplication_Steps {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FMS_WifakApplication_Obj FMS_WifakWifakApplication = new FMS_WifakApplication_Obj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	FMSLogin login = new FMSLogin(driver);
	DropDownHelper DropDownhelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);

	String SuccessMsg;
	
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
    ExcelData fmsTransactionsExcelData = new ExcelData(path,"FMS_WIFAK_ApplicationTestData","DataSet ID");
    Map<String, String> testData;

	@And("^Click Wifak Application first$")
	public void click_wifak_application_first() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getWifak_Application_first());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getWifak_Application_first());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getWifak_Application_first());
	}

	@And("get the test data set id for AT_RF_155")
    public void get_the_test_data_set_id_for_at_AT_RF_155() {
        testData = fmsTransactionsExcelData.getTestdata("DS01_740790");

        

    }
	
	@And("^Click Wifak Application Second$")
	public void click_wifak_application_second() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getWifak_Application_second());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getWifak_Application_second());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getWifak_Application_second());
	}

	@And("^Click Application for financial facilities$")
	public void click_application_for_financial_facilities() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakWifakApplication.getApplication_for_financial_facilities());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getApplication_for_financial_facilities());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getApplication_for_financial_facilities());
	}

	@And("^Click Maintenance$")
	public void click_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getMaintenance());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getMaintenance());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getMaintenance());
	}

	@And("^Click and Select Application for$")
	public void click_and_select_application_for() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getApplication_for());
		// clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getMaintenance());
		DropDownhelper.SelectUsingVisibleText(FMS_WifakWifakApplication.getApplication_for(), "New Facility");

	}

	@Given("Search CIF No")
	public void search_cif_no() {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getCIF_no());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getCIF_no());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getCIF_no());
		FMS_WifakWifakApplication.getCIF_no().sendKeys("727");

	}

	@And("^Enter codeOn Facility Type$")
	public void enter_codeon_facility_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_codeOn_Facility_Type());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_codeOn_Facility_Type());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_codeOn_Facility_Type());
		FMS_WifakWifakApplication.getEnter_codeOn_Facility_Type().sendKeys("369");
		//FMS_WifakWifakApplication.getEnter_codeOn_Facility_Type().sendKeys(testData.get("Facility Type"));
	}

	@And("^Enter Code In Country of Financing$")
	public void enter_code_in_country_of_financing() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver,
//				FMS_WifakWifakApplication.getEnterCodeIn_Country_of_Financing());
//		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnterCodeIn_Country_of_Financing());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnterCodeIn_Country_of_Financing());
//		FMS_WifakWifakApplication.getEnterCodeIn_Country_of_Financing().sendKeys("320");

			for (int i = 0; i < 200; i++) {
				try {
					clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnterCodeIn_Country_of_Financing());
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnterCodeIn_Country_of_Financing());
					FMS_WifakWifakApplication.getEnterCodeIn_Country_of_Financing().sendKeys("320");				
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}

	@And("^Enter line Code On Facility Rating$")
	public void enter_line_code_on_facility_rating() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getEnter_lineCodeOn_Facility_Rating());
//		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_lineCodeOn_Facility_Rating());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_lineCodeOn_Facility_Rating());
//		FMS_WifakWifakApplication.getEnter_lineCodeOn_Facility_Rating().sendKeys("2");

			for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getEnter_lineCodeOn_Facility_Rating());
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_lineCodeOn_Facility_Rating());
					FMS_WifakWifakApplication.getEnter_lineCodeOn_Facility_Rating().sendKeys("2");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}

		for (int i = 0; i <= 300; i++) {
			if (!(FMS_WifakWifakApplication.getEnter_lineCodeOn_Facility_Rating().getAttribute("prevvalue")
					.isBlank())) {
				break;
			}
		}
	}

	@And("^Click on additional Details$")
	public void click_on_additional_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getClickon_additionalDetails());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getClickon_additionalDetails());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClickon_additionalDetails());

	}

	@And("^Enter the Total Value$")
	public void enter_the_total_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_TotalValue());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_TotalValue());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_TotalValue());
		FMS_WifakWifakApplication.getEnter_TotalValue().sendKeys("10000");

	}

	@And("^Click Offer Expiration SelectDate$")
	public void click_offer_expiration_selectdate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				FMS_WifakWifakApplication.getClick_Offer_Expiration_SelectDate());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getClick_Offer_Expiration_SelectDate());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_Offer_Expiration_SelectDate());
		FMS_WifakWifakApplication.getClick_Offer_Expiration_SelectDate().sendKeys("06/06/2023");

	}

	@And("^Select limit Details$")
	public void select_limit_details() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getSelect_limitDetails());
//		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getSelect_limitDetails());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getSelect_limitDetails());
		// FMS_WifakWifakApplication.getClick_Offer_Expiration_SelectDate().sendKeys("25/05/2023");
		
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getSelect_limitDetails());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Click Add button on limit Detail$")
	public void click_add_button_on_limit_detail() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getClick_AddButtonon_limit_Detail());
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_AddButtonon_limit_Detail());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
//	@And("^Click Second Add button on limit Detail$")
//    public void click_second_add_button_on_limit_detail() throws Throwable {
//		for (int i = 0; i < 200; i++) {
//			try {
//				
//			//	waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getClick_AddButtonon_limit_Detail());
//				clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_AddButtonon_limit_Detail());
//				break;
//			} catch (Exception e) {
//				if (i == 199) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//    }

 

    @And("^Click third Add button on limit Detail$")
    public void click_third_add_button_on_limit_detail() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				
			//	waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getClick_AddButtonon_limit_Detail());
				clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_AddButtonon_limit_Detail());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

 

    @And("^Click Fourth Add button on limit Detail$")
    public void click_fourth_add_button_on_limit_detail() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				
			//	waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getClick_AddButtonon_limit_Detail());
				clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_AddButtonon_limit_Detail());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    
	@And("^Enter ValueOn Product Class$")
	public void enter_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class().sendKeys("1");
		//Thread.sleep(10000);

	}
	
	@And("^Enter Facility Value$")
    public void enter_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
	//	Thread.sleep(50000);
	//	FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
				FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }
	
	@Then("^Enter second ValueOn Facility Value$")
    public void enter_second_valueon_facility_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
	//	FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().clear();
	//	Thread.sleep(6000);
	//	FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
				FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

 

    @Then("^Enter third ValueOn Facility Value$")
    public void enter_third_valueon_facility_value() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
		//FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().clear();
	//	Thread.sleep(6000);
	//	FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
				FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys("2500");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

 

    @Then("^Enter Fourth ValueOn Facility Value$")
    public void enter_fourth_valueon_facility_value() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
		FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys(Keys.DELETE);
	//	FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().clear();
	//	Thread.sleep(6000);
	//	FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys("2500");
		for (int i = 0; i < 200; i++) {
			try {
				
				clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue());
				FMS_WifakWifakApplication.Enter_ValueOn_FacilityValue().sendKeys("2000");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    @Then("^Enter the value on  Purpose Of Finacing$")
    public void enter_the_value_on_purpose_of_finacing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
    }

 

    @And("^Enter the second value on  Purpose Of Finacing$")
    public void enter_the_second_value_on_purpose_of_finacing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
    }

 

    @And("^Enter the third value on  Purpose Of Finacing$")
    public void enter_the_third_value_on_purpose_of_finacing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing().sendKeys("1");
    }

 

    @And("^Enter the Fourth value on  Purpose Of Finacing$")
    public void enter_the_fourth_value_on_purpose_of_finacing() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing());
		FMS_WifakWifakApplication.Enter_ValueOn_PurposeOfFinacing().sendKeys("1"); 
    }
    
	@And("^Enter second ValueOn Product Class$")
    public void enter_second_valueon_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
//		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
//		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
//		FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class().sendKeys("1");
		
		for (int i = 0; i < 2000; i++) {
            try {
                FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class().click();
                FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class().sendKeys("1");
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
    }
	
    @And("^Enter third ValueOn Product Class$")
    public void enter_third_valueon_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class().sendKeys("1");
    }

 

    @And("^Enter Fourth ValueOn Product Class$")
    public void enter_fourth_valueon_product_class() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class());
		FMS_WifakWifakApplication.getEnter_ValueOn_Product_Class().sendKeys("1");
    }
	
	@And("^Click Search Button In Account No$")
    public void click_search_button_in_account_no() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.Click_Search_Button_Account_No());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Click_Search_Button_Account_No());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Click_Search_Button_Account_No());
    }

    @And("^Enter Double Click Search Account No$")
    public void enter_double_click_search_account_no() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.Double_Click_Search_Account_No());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Double_Click_Search_Account_No());
		clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.Double_Click_Search_Account_No());
	
    }

	@And("^AfterEnter ValueOn Product Class Search$")
	public void afterenter_valueon_product_class_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getAfterEnter_ValueOn_Product_Class_Search());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getAfterEnter_ValueOn_Product_Class_Search());
		
	}
	
	

	@And("^Click Add button AfterEnter Value On Product Class$")
	public void click_add_button_afterenter_value_on_product_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd());
		for (int i = 0; i < 2000; i++) {
            try {
                FMS_WifakWifakApplication.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd().click();
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.SeverReruest_Popup());	
		for (int i = 0; i < 2000; i++) {
			try {
				if(FMS_WifakWifakApplication.SeverReruest_Popup().isDisplayed()) {
					FMS_WifakWifakApplication.ServerReuestOK().click();
				}
				break;
			} catch (Exception e) {
				if (i==1999) {
                    Assert.fail(e.getMessage());
                }
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd());
		for (int i = 0; i < 2000; i++) {
            try {
                FMS_WifakWifakApplication.getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd().click();
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
				
	}
	
	@Then("Validate how many product class in limits details")
	public void validate_how_many_product_class_in_limits_details() {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.TableHead_LimitDetails());
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ApplicationFacilityLimitDetailsGrid_WIFT001MT']//td[@tdlabel='Item']"));
		
		int count = rows.size();
		System.out.println("ROW COUNT : "+count);
		
		for(WebElement e : rows) {
	        Assert.assertEquals(true, count>3);
	    }
		
	}

	// -----------------------------------@827642

	@Then("^User Enter Date Below to this current Date$")
	public void user_enter_date_below_to_this_current_date() throws Throwable {

	}

	@And("^User Check Fx Settlement Expery Date$")
	public void user_check_fx_settlement_expery_date() throws Throwable {
	}

	@And("^User Enter Date above current Date$")
	public void user_enter_date_above_current_date() throws Throwable {
	}

	// ---------------------------@1108920

	@And("^Click Fixed Assert button$")
	public void click_fixed_assert_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getClick_FixedAssert_Button());
		for (int i = 0; i < 2000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_FixedAssert_Button());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Click AddButton On FixedAssert screen$")
	public void click_addbutton_on_fixedassert_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.getClick_AddButton_OnFixedAssert_screen());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getClick_AddButton_OnFixedAssert_screen());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_AddButton_OnFixedAssert_screen());
	}

	@And("^Enter value on Catagory$")
	    public void enter_value_on_catagory() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Click_value_1_on_Catagory());
			
			for (int i=0 ;i<300;i++) {
				try { 
					FMS_WifakWifakApplication.Click_value_1_on_Catagory().click();
					FMS_WifakWifakApplication.getEnter_value_on_Catagory().click();
					FMS_WifakWifakApplication.getEnter_value_on_Catagory().sendKeys("1");
					FMS_WifakWifakApplication.getEnter_value_on_Catagory().sendKeys(Keys.TAB);
					break;
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}

	@And("^Enter value on Class$")
	public void enter_value_on_class() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_value_on_Class());
		for (int i=0 ;i<300;i++) {
			try { 
				FMS_WifakWifakApplication.getEnter_value_on_Class().click();
				FMS_WifakWifakApplication.getEnter_value_on_Class().sendKeys("1234");
				FMS_WifakWifakApplication.getEnter_value_on_Class().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^Enter value on vendor$")
	public void enter_value_on_vendor() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_value_on_vendor());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_value_on_vendor());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_value_on_vendor());
		FMS_WifakWifakApplication.getEnter_value_on_vendor().sendKeys("1");
	}

	@And("^Enter value on quantity$")
	public void enter_value_on_quantity() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_value_on_quantity());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_value_on_quantity());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_value_on_quantity());
		FMS_WifakWifakApplication.getEnter_value_on_quantity().sendKeys("1");
	}

	@And("^Enter value on Unit$")
	public void enter_value_on_unit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_value_on_Unit());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_value_on_Unit());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_value_on_Unit());
		FMS_WifakWifakApplication.getEnter_value_on_Unit().sendKeys("1");
	}

	@And("^Enter value on Cy$")
	public void enter_value_on_cy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_value_on_Cy());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_value_on_Cy());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_value_on_Cy());
		FMS_WifakWifakApplication.getEnter_value_on_Cy().sendKeys("999");
	}

	@And("^Enter value on UnitCost$")
	public void enter_value_on_unitcost() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getEnter_value_on_UnitCost());
		clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getEnter_value_on_UnitCost());
		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getEnter_value_on_UnitCost());
		FMS_WifakWifakApplication.getEnter_value_on_UnitCost().sendKeys("11");
	}

	 @And("^Enter value on Vat Code$")
	    public void enter_value_on_vat_code() throws Throwable {
		 JavascriptHelper.scrollIntoView(FMS_WifakWifakApplication.Enter_value_on_Vat_Code());
			for (int i = 0; i < 200; i++) {
				try {
				//	clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_value_on_Vat_Code());
					FMS_WifakWifakApplication.Enter_value_on_Vat_Code().click();
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	 
	 //-----------------------------------------------------
//	 @And("^Click Search Button In Account No $")
//	    public void click_search_button_in_account_no() throws Throwable {
//		 waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Search_Button_In_Account_No());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Search_Button_In_Account_No());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Search_Button_In_Account_No());
//	    }

//	    @And("^Double Click Search Account No$")
//	    public void double_click_search_account_no() throws Throwable {
//	    	 waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Currency__Button_In_Account_No());
//				clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Currency__Button_In_Account_No());
//				clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.Currency__Button_In_Account_No());
//				FMS_WifakWifakApplication.Currency__Button_In_Account_No().sendKeys("840");
//				
//								
//				waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.GLCode__Button_In_Account_No());
//				clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.GLCode__Button_In_Account_No());
//				clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.GLCode__Button_In_Account_No());
//				FMS_WifakWifakApplication.GLCode__Button_In_Account_No().sendKeys("10001");
//				
//				waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Serial__Button_In_Account_No());
//				clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Serial__Button_In_Account_No());
//				clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.Serial__Button_In_Account_No());
//				FMS_WifakWifakApplication.Serial__Button_In_Account_No().sendKeys("1");
//		    }
	    
	    @And("^Enter Currency Button In Account No$")
	    public void enter_currency_button_in_account_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Currency__Button_In_Account_No());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Currency__Button_In_Account_No());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Currency__Button_In_Account_No());
			FMS_WifakWifakApplication.Currency__Button_In_Account_No().sendKeys("840");
			//Thread.sleep(3000);
	    }

	    @And("^Enter GLCode Button In Account No$")
	    public void enter_glcode_button_in_account_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.GLCode__Button_In_Account_No());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.GLCode__Button_In_Account_No());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.GLCode__Button_In_Account_No());
			FMS_WifakWifakApplication.GLCode__Button_In_Account_No().sendKeys("10001");
			//Thread.sleep(3000);
	    }

	    @And("^Enter Serial Button In Account No$")
	    public void enter_serial_button_in_account_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Serial__Button_In_Account_No());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Serial__Button_In_Account_No());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Serial__Button_In_Account_No());
			FMS_WifakWifakApplication.Serial__Button_In_Account_No().sendKeys("1");
			//Thread.sleep(3000);
	    }
	    
	    @And("^Enter Account Number$")
	    public void enter_account_number() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_Account_Number());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Enter_Account_Number());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Enter_Account_Number());
			FMS_WifakWifakApplication.Enter_Account_Number().sendKeys("84001000100000727001");
		//	Thread.sleep(3000);
	    }
	    
	    
	    
	    @And("^User Click Charges Details$")
	    public void user_click_charges_details() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Click_Charges_Details());
				clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Click_Charges_Details());
				clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Click_Charges_Details());
		    }
	    

	    @And("^User Check Flag In Collect At Fac Approvel$")
	    public void user_check_flag_in_collect_at_fac_approvel() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Click_1_In_Charges_Details());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Click_1_In_Charges_Details());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Click_1_In_Charges_Details());
			
			waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Check_Flag_In_Collect_At_Fac_Approvel());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Check_Flag_In_Collect_At_Fac_Approvel());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Check_Flag_In_Collect_At_Fac_Approvel());
	    }

	    @And("^User Click Ok Button In Collect At Fac Approvel$")
	    public void user_click_ok_button_in_collect_at_fac_approvel() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Click_Ok_Button_In_Collect_At_Fac_Approvel());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Click_Ok_Button_In_Collect_At_Fac_Approvel());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Click_Ok_Button_In_Collect_At_Fac_Approvel());
	    }

	    @And("^Click Save Button After Collect At Fac Approvel Give Ok$")
	    public void click_save_button_after_collect_at_fac_approvel_give_ok() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
	    }

	    @And("^Click Ok Button In Waring Screen$")
	    public void click_ok_button_in_waring_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
	    }

	    @And("^Click OK In Button Sucess Screen$")
	    public void click_ok_in_button_sucess_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click Validate Button$")
	    public void click_validate_button() throws Throwable {
	        
	    }

//	    @And("^ Click Document Details $")
//	    public void click_document_details() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Click_Document_Details());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Click_Document_Details());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Click_Document_Details());
//	    }

	    
	    @And("^Click Document Details$")
	    public void click_document_details() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Click_Document_Details());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Click_Document_Details());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Click_Document_Details());
			
	    	for (int i = 0; i < 1000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Click_Document_Details());
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    	}
	    
	    @And("^Enter The Value Solicitor Name$")
	    public void enter_the_value_solicitor_name() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.EnterTheValue_Solicitor_Name());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.EnterTheValue_Solicitor_Name());
//			clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.EnterTheValue_Solicitor_Name());
			
			for (int i = 0; i < 1000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.EnterTheValue_Solicitor_Name());
					FMS_WifakWifakApplication.EnterTheValue_Solicitor_Name().sendKeys("1");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    }

	    @And("^Enter The Value Estimator Name$")
	    public void enter_the_value_estimator_name() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.EnterTheValue_Estimator_Name());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.EnterTheValue_Estimator_Name());
//			clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.EnterTheValue_Estimator_Name());
			
			for (int i = 0; i < 1000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.EnterTheValue_Estimator_Name());
					FMS_WifakWifakApplication.EnterTheValue_Estimator_Name().sendKeys("1");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
			Thread.sleep(5000);
	    }

	    
	    
	    @And("^Click Save Button After Document Details$")
	    public void click_save_button_after_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
	    }

	    @And("^Click Ok Button In Waring Screen Document Details$")
	    public void click_ok_button_in_waring_screen_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Validate_Warning_ConfirmValidateProcess());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Validate_Warning_ConfirmValidateProcess());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_Warning_ConfirmValidateProcess());
			
			for (int i = 0; i < 2000; i++) {
				try {
				//	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Validate_Warning_ConfirmValidateProcess());
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_Warning_ConfirmValidateProcess());
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
			Thread.sleep(5000);
	    }
	    
	    @Then("Click OK Button In Confirm Already Created IN Document Details")
	    public void click_ok_button_in_confirm_already_created_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Validate_Confirm_alreadyCreated());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Validate_Confirm_alreadyCreated());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_Confirm_alreadyCreated());
			
	    	for (int i = 0; i < 2000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_Confirm_alreadyCreated());
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
				    }

	    @Then("Click OK Button In Success ValidateSuccessfully IN Document Details")
	    public void click_ok_button_in_success_validate_successfully_in_document_details() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Validate_Success_ValidateSuccessfull());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Validate_Success_ValidateSuccessfull());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_Success_ValidateSuccessfull());
	    	
			for (int i = 0; i < 2000; i++) {
				try {
					
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_Success_ValidateSuccessfull());
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    }

	    @Then("Click Dismiss Button In Send Alert Popup")
	    public void click_dismiss_button_in_send_alert_popup() {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Validate_SendAlert_Dismiss());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Validate_SendAlert_Dismiss());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_SendAlert_Dismiss());
			
			for (int i = 0; i < 2000; i++) {
				try {
				//	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Validate_SendAlert_Dismiss());
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_SendAlert_Dismiss());
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				
			}
			 }
	    }

	    @And("^Click OK  Button In Sucess Screen Document Details$")
	    public void click_ok_button_in_sucess_screen_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click Validate Button in Document Details$")
	    public void click_validate_button_in_document_details() throws Throwable {
	    	
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.limitDetailsValidateBtn());
	        FMS_WifakWifakApplication.limitDetailsValidateBtn().click();
	        
	        waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.SeverReruest_Popup());
	        for (int i = 0; i < 2000; i++) {
				try {
					if(FMS_WifakWifakApplication.SeverReruest_Popup().isDisplayed()) {
						FMS_WifakWifakApplication.ServerReuestOK().click();
					}
					break;
				} catch (Exception e) {
					if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
				}
			}
	        
	        waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.limitDetailsValidateBtn());
	        FMS_WifakWifakApplication.limitDetailsValidateBtn().click();

	        waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.WarningPopupOkBtn());
	        FMS_WifakWifakApplication.WarningPopupOkBtn().click();

	        // Facility already created popup
	        waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.confirmPopup());
	        waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.facilityAlreadyCreatedPopup());
	        FMS_WifakWifakApplication.facilityAlreadyCreatedPopup().click();

	        waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.successPopup());
	  //      String SuccessMsg = FMS_WifakWifakApplication.successPopupMessage().getText();
	        SuccessMsg = FMS_WifakWifakApplication.successPopupMessage().getText().substring(23, 27);
	        System.err.println("Reference Number: "+SuccessMsg);
	   //     fmsTransactionsExcelData.updateTestData("DS_AT_RF_139", "Approve Code", SuccessMsg);

	        for (int i = 0; i < 2000; i++) {
	            try {
	                FMS_WifakWifakApplication.SuccessPopupOkBtn().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }

	        // close the send alert pop-up box
//	        Thread.sleep(5000);
	        for (int i = 0; i < 2000; i++) {
	            try {
	                FMS_WifakWifakApplication.sendAlertPopup().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    	
//	    	JavascriptHelper.scrollIntoView(FMS_WifakWifakApplication.Validate_Button());
//	    	waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.Validate_Button());
//	    	clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Validate_Button());
//	    	clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_Button());
//	    	Thread.sleep(5000);
//	    	
//	    	for (int i = 0; i < 500; i++) {
//				try {
//					if(FMS_WifakWifakApplication.PopupBefore_ValidateButton().isDisplayed()) {
//						clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.ServerReuest());
//						Thread.sleep(5000);
//						waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.Validate_Button());
//						clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Validate_Button());
//						Thread.sleep(6000);
//					}
//					break;
//				} catch (Exception e) {
//					
//				}
//				
//			} 
	    	
//	    	JavascriptHelper.scrollIntoView(FMS_WifakWifakApplication.Validate_Button());
//	    	waitHelper.waitForElementwithFluentwait(driver,FMS_WifakWifakApplication.Validate_Button());
//	    	clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
//			FMS_WifakWifakApplication.Validate_Button().click();
	    	
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
//      		clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click OK Button In Success Screen IN Document Details$")
	    public void click_ok_button_in_success_screen_in_document_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
	    }
	    
	    //-----------------------------@592970 TSR - AMANAUPG170182 - Holiday issue
	    
	    @Then("^Enter Holiday Date In Expiratin date in additional Details$")
	    public void enter_holiday_date_in_expiratin_date_in_additional_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Expiratin_date_additional_Details());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Expiratin_date_additional_Details());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Expiratin_date_additional_Details());
			FMS_WifakWifakApplication.Expiratin_date_additional_Details().sendKeys("02/10/2022");
			FMS_WifakWifakApplication.Expiratin_date_additional_Details().sendKeys(Keys.TAB);
	    }

	    @And("^Confirm the Requested Holiday date$")
	    public void confirm_the_requested_holiday_date() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Confirm_theRequested_Holiday_date());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Confirm_theRequested_Holiday_date());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Confirm_theRequested_Holiday_date());
	    }
	    
	   
	    @Then("^Enter Holiday date in Expected Payment Date in Limit Details SubMenu$")
	    public void enter_holiday_date_in_expected_payment_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ExpectedPaymenDate_inLimitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.ExpectedPaymenDate_inLimitDetails_SubMenu());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.ExpectedPaymenDate_inLimitDetails_SubMenu());
			FMS_WifakWifakApplication.ExpectedPaymenDate_inLimitDetails_SubMenu().sendKeys("02/10/2021");
			FMS_WifakWifakApplication.ExpectedPaymenDate_inLimitDetails_SubMenu().sendKeys(Keys.TAB);
	    }

	   	    
	    
	    @And("^Confirm the Requested Holiday date in Limit Details SubMenu$")
	    public void confirm_the_requested_holiday_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Confirm_theRequested_Holiday_date_In_LimitsDetails());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Confirm_theRequested_Holiday_date_In_LimitsDetails());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Confirm_theRequested_Holiday_date_In_LimitsDetails());
	    }
	    
	    //---------------
	    
	    //-------- 592279 TSR- SUPT170522 - Label missing limit Details
	    
	    
	    @Then("^Check The Level Of Product Class In LImit Details SubMenu$")
	    public void check_the_level_of_product_class_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ProductClass_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.ProductClass_InLImitDetails_SubMenu());
		//	clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Enter_Previous_dataIn_MaturityDate());
		//	FMS_WifakWifakApplication.Enter_Previous_dataIn_MaturityDate().sendKeys("04/01/2021");
			Assert.assertEquals(true, FMS_WifakWifakApplication.ProductClass_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Case Non Case In LImit Details SubMenu$")
	    public void check_the_level_of_case_non_case_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.CaseNonCase_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.CaseNonCase_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.CaseNonCase_InLImitDetails_SubMenu().isDisplayed());
	      	    }

	    @Then("^Check The Level Of Exchange Rate In LImit Details SubMenu$")
	    public void check_the_level_of_exchange_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ExchangeRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.ExchangeRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.ExchangeRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Down Payment Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_down_payment_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.DownPaymentPercentage_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.DownPaymentPercentage_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.DownPaymentPercentage_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Details Down Payment To Vendor Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_details_down_payment_to_vendor_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.DownPaymentToVendorPerc_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.DownPaymentToVendorPerc_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.DownPaymentToVendorPerc_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Total Down Payment Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_total_down_payment_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TotalDownPaymentPerc_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TotalDownPaymentPerc_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.TotalDownPaymentPerc_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Total Facility Value In LImit Details SubMenu$")
	    public void check_the_level_of_total_facility_value_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TotalFacilityValue_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TotalFacilityValue_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.TotalFacilityValue_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Items In LImit Details SubMenu$")
	    public void check_the_level_of_items_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Items_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Items_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.Items_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Type In LImit Details SubMenu$")
	    public void check_the_level_of_type_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Type_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Type_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.Type_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Facility Value In LImit Details SubMenu$")
	    public void check_the_level_of_facility_value_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.FacilityValue_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.FacilityValue_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.FacilityValue_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of CV Value In LImit Details SubMenu$")
	    public void check_the_level_of_cv_value_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.CvValue_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.CvValue_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.CvValue_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Down Payment AmountIn LImit Details SubMenu$")
	    public void check_the_level_of_down_payment_amountin_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.DownPaymentAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.DownPaymentAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.DownPaymentAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Down Payment To Vendor Amt In LImit Details SubMenu$")
	    public void check_the_level_of_down_payment_to_vendor_amt_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.DownPaymentToVendorAmt_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.DownPaymentToVendorAmt_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.DownPaymentToVendorAmt_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Total Down Payment In LImit Details SubMenu$")
	    public void check_the_level_of_total_down_payment_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TotalDownPayment_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TotalDownPayment_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.TotalDownPayment_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Value Date In LImit Details SubMenu$")
	    public void check_the_level_of_value_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ValueDate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.ValueDate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.ValueDate_InLImitDetails_SubMenu().isDisplayed());
	    }
	    
	    @Then("^Check The Level Of Maturity Date In LImit Details SubMenu$")
	    public void check_the_level_of_maturity_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Maturity_Date_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Maturity_Date_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.Maturity_Date_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of  Status In LImit Details SubMenu$")
	    public void check_the_level_of_status_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.status_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.status_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.status_InLImitDetails_SubMenu().isDisplayed());  
	    }

	    @Then("^Check The Level Of  Account No In LImit Details SubMenu$")
	    public void check_the_level_of_account_no_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.AccountNo_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.AccountNo_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.AccountNo_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of  Account Name In LImit Details SubMenu$")
	    public void check_the_level_of_account_name_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.AccountName_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.AccountName_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.AccountName_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    TFA Margin Rate_In LImit Details SubMenu$")
	    public void check_the_level_of_tfa_margin_ratein_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TFAMarginRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TFAMarginRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.TFAMarginRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Sub Eco Sector In LImit Details SubMenu$")
	    public void check_the_level_of_sub_eco_sector_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.SubEcoSector_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.SubEcoSector_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.SubEcoSector_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Discounting Margin percentage In LImit Details SubMenu$")
	    public void check_the_level_of_discounting_margin_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.DiscountingMarginPer_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.DiscountingMarginPer_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.DiscountingMarginPer_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Payment Method In LImit Details SubMenu$")
	    public void check_the_level_of_payment_method_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.PaymentMethod_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.PaymentMethod_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.PaymentMethod_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Installment Amount In LImit Details SubMenu$")
	    public void check_the_level_of_installment_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.InstallmentAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.InstallmentAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.InstallmentAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Security Deposit Amount In LImit Details SubMenu$")
	    public void check_the_level_of_security_deposit_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.SecurityDepositAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.SecurityDepositAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.SecurityDepositAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Cap Rate In LImit Details SubMenu$")
	    public void check_the_level_of_cap_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.CapRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.CapRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.CapRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    floor Rate Method In LImit Details SubMenu$")
	    public void check_the_level_of_floor_rate_method_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.floorRateMethod_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.floorRateMethod_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.floorRateMethod_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Credit Spread In LImit Details SubMenu$")
	    public void check_the_level_of_credit_spread_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.CreditSpread_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.CreditSpread_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.CreditSpread_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of    Sublimit Lower Limit Amount In LImit Details SubMenu$")
	    public void check_the_level_of_sublimit_lower_limit_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.SublimitLowerLimitAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.SublimitLowerLimitAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.SublimitLowerLimitAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Expected Payment Date In LImit Details SubMenu$")
	    public void check_the_level_of_expected_payment_date_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ExpectedPaymenDate_inLimitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.ExpectedPaymenDate_inLimitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.ExpectedPaymenDate_inLimitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Checking On In LImit Details SubMenu$")
	    public void check_the_level_of_checking_on_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.CheckingOn_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.CheckingOn_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.CheckingOn_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Fund Transfer Rate In LImit Details SubMenu$")
	    public void check_the_level_of_fund_transfer_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.FundTransferRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.FundTransferRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.FundTransferRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Eco Sector In LImit Details SubMenu$")
	    public void check_the_level_of_eco_sector_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.EcoSector_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.EcoSector_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.EcoSector_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    TFAT enure Days In LImit Details SubMenu$")
	    public void check_the_level_of_tfat_enure_days_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TFATenureDays_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TFATenureDays_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.TFATenureDays_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Remarks In LImit Details SubMenu$")
	    public void check_the_level_of_remarks_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Remarks_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Remarks_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.Remarks_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Purpose of financing In LImit Details SubMenu$")
	    public void check_the_level_of_purpose_of_financing_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Purposeoffinancing_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Purposeoffinancing_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.Purposeoffinancing_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    No of Installments In LImit Details SubMenu$")
	    public void check_the_level_of_no_of_installments_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.NoofInstallments_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.NoofInstallments_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.NoofInstallments_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Amended Security Deposit Amount In LImit Details SubMenu$")
	    public void check_the_level_of_amended_security_deposit_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.AmendedSecurityDepositAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.AmendedSecurityDepositAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.AmendedSecurityDepositAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    selling price In LImit Details SubMenu$")
	    public void check_the_level_of_selling_price_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.selling_price_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.selling_price_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.selling_price_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Floor Rate Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_floor_rate_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.FloorRatePercentage_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.FloorRatePercentage_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.FloorRatePercentage_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Sublimit Lower Limit Percentage In LImit Details SubMenu$")
	    public void check_the_level_of_sublimit_lower_limit_percentage_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.SublimitLowerLimitPerc_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.SublimitLowerLimitPerc_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.SublimitLowerLimitPerc_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of    Clean Flag In LImit Details SubMenu$")
	    public void check_the_level_of_clean_flag_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.CleanFlag_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.CleanFlag_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.CleanFlag_InLImitDetails_SubMenu().isDisplayed());
	    }
	    
	    
	    @Then("^Check The Level Of Revolving One Off In LImit Details SubMenu$")
	    public void check_the_level_of_revolving_one_off_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.RevolvingOneOff_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.RevolvingOneOff_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.RevolvingOneOff_InLImitDetails_SubMenu().isDisplayed());
	    }

	    
	    
	    @Then("^Check The Level Of Penalty On Due Amount In LImit Details SubMenu$")
	    public void check_the_level_of_penalty_on_due_amount_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.PenaltyOnDueAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.PenaltyOnDueAmount_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.PenaltyOnDueAmount_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of charges type In LImit Details SubMenu$")
	    public void check_the_level_of_charges_type_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.chargestype_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.chargestype_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.chargestype_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of PPR In LImit Details SubMenu$")
	    public void check_the_level_of_ppr_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.PPR_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.PPR_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.PPR_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of BUDGET ALLOCATION In LImit Details SubMenu$")
	    public void check_the_level_of_budget_allocation_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.PPR_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.PPR_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.PPR_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of comments and conditions In LImit Details SubMenu$")
	    public void check_the_level_of_comments_and_conditions_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.comments_and_conditions_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.comments_and_conditions_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.comments_and_conditions_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Maximum Tenure Periodicity No key In LImit Details SubMenu$")
	    public void check_the_level_of_maximum_tenure_periodicity_no_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Minimum Tenure Periodicity No In LImit Details SubMenu$")
	    public void check_the_level_of_minimum_tenure_periodicity_no_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Maximum Tenure for financing PeriodicityNo key In LImit Details SubMenu$")
	    public void check_the_level_of_maximum_tenure_for_financing_periodicityno_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Floating Rate In LImit Details SubMenu$")
	    public void check_the_level_of_floating_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.FloatingRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.FloatingRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.FloatingRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Floating Rate Periodi city Type In LImit Details SubMenu$")
	    public void check_the_level_of_floating_rate_periodi_city_type_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.FloatingRatePeriodicityType_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.FloatingRatePeriodicityType_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.FloatingRatePeriodicityType_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Total Yield In LImit Details SubMenu$")
	    public void check_the_level_of_total_yield_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TotalYield_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TotalYield_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.TotalYield_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of  limit lip start dat In LImit Details SubMenu$")
	    public void check_the_level_of_limit_lip_start_dat_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.limitlipstartdate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.limitlipstartdate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.limitlipstartdate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of zero entry cost In LImit Details SubMenu$")
	    public void check_the_level_of_zero_entry_cost_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.zeroentrycost_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.zeroentrycost_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.zeroentrycost_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Apply PenaltyIn LImit Details SubMenu$")
	    public void check_the_level_of_apply_penaltyin_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ApplyPenalty_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.ApplyPenalty_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.ApplyPenalty_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Grace Period_ In LImit Details SubMenu$")
	    public void check_the_level_of_grace_period_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.GracePeriod_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.GracePeriod_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.GracePeriod_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Vat code In LImit Details SubMenu$")
	    public void check_the_level_of_vat_code_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Vatcode_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Vatcode_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.Vatcode_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of REGIMENTAL AGENT In LImit Details SubMenu$")
	    public void check_the_level_of_regimental_agent_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.REGIMENTAL_AGENT_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.REGIMENTAL_AGENT_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.REGIMENTAL_AGENT_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  CONTRACTED In LImit Details SubMenu$")
	    public void check_the_level_of_contracted_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.CONTRACTED_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.CONTRACTED_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.CONTRACTED_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  transaction cy In LImit Details SubMenu$")
	    public void check_the_level_of_transaction_cy_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.transaction_cy_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.transaction_cy_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.transaction_cy_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Maximum Tenure Periodicity Type key In LImit Details SubMenu$")
	    public void check_the_level_of_maximum_tenure_periodicity_type_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of Minimum Tenure PeriodicityType key In LImit Details SubMenu$")
	    public void check_the_level_of_minimum_tenure_periodicitytype_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Maximum Tenure for financing PeriodicityType key In LImit Details SubMenu$")
	    public void check_the_level_of_maximum_tenure_for_financing_periodicitytype_key_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Floating Rate Periodi city In LImit Details SubMenu$")
	    public void check_the_level_of_floating_rate_periodi_city_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.FloatingRatePeriodicit_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.FloatingRatePeriodicit_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.FloatingRatePeriodicit_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of   Margin Rate In LImit Details SubMenu$")
	    public void check_the_level_of_margin_rate_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.MarginRate_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.MarginRate_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.MarginRate_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  lip perioIn LImit Details SubMenu$")
	    public void check_the_level_of_lip_perioin_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.lip_period_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.lip_period_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.lip_period_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  lip period amende In LImit Details SubMenu$")
	    public void check_the_level_of_lip_period_amende_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.lip_period_amende_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.lip_period_amende_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.lip_period_amende_InLImitDetails_SubMenu().isDisplayed());
	    }
	    
	    
	    
	    @Then("^Check The Level Of Transcation Type In LImit Details SubMenu$")
	    public void check_the_level_of_transcation_type_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TranscationType_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TranscationType_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.TranscationType_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of Acc No In LImit Details SubMenu$")
	    public void check_the_level_of_acc_no_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.acc_no_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.acc_no_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.acc_no_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @Then("^Check The Level Of  Close Button In LImit Details SubMenu$")
	    public void check_the_level_of_close_button_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.close_btn_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.close_btn_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.close_btn_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Transcation Maturity In LImit Details SubMenu$")
	    public void check_the_level_of_transcation_maturity_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TranscationMaturity_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TranscationMaturity_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.TranscationMaturity_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Bank No In LImit Details SubMenu$")
	    public void check_the_level_of_bank_no_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.bank_no_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.bank_no_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.bank_no_InLImitDetails_SubMenu().isDisplayed());
	    }

	    @And("^Check The Level Of  Add Button In LImit Details SubMenu$")
	    public void check_the_level_of_add_button_in_limit_details_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.acc_no_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.acc_no_InLImitDetails_SubMenu());
			Assert.assertEquals(true, FMS_WifakWifakApplication.acc_no_InLImitDetails_SubMenu().isDisplayed());
	    }
	    
	    
	    
	    //-------------@579604  Scenario: TSR - KCB170047
	    
	    
	    @Then("^Click Application For Decrease$")
	    public void click_application_for_decrease() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getApplication_for());
			// clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getMaintenance());
			DropDownhelper.SelectUsingVisibleText(FMS_WifakWifakApplication.getApplication_for(), "Decrease");
	    }

	    @And("^Enter Existing Facility Ref$")
	    public void enter_existing_facility_ref() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ExistingFacility_Ref());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.ExistingFacility_Ref());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.ExistingFacility_Ref());
			FMS_WifakWifakApplication.ExistingFacility_Ref().sendKeys("1382");
			FMS_WifakWifakApplication.ExistingFacility_Ref().sendKeys(Keys.TAB);
	    }
	    
	    @And("^Click on additional Details In Additional Details$")
	    public void click_on_additional_details_in_additional_details() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getMaintenance());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getMaintenance());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getMaintenance());
			
	    	for (int i = 0; i < 500; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Click_AdditionalDetails());
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	    	    
	    @And("^Enter the Total Value In Additional Details$")
	    public void enter_the_total_value_in_additional_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.TOTAL_AMOUNT_InAdditionalDetails());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.TOTAL_AMOUNT_InAdditionalDetails());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.TOTAL_AMOUNT_InAdditionalDetails());
			FMS_WifakWifakApplication.getEnter_TotalValue().sendKeys("50000");
	    }
	    
	    @Then("^Enter Down Payment In Percentage$")
	    public void enter_down_payment_in_percentage() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.DownPaymentAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.DownPaymentAmount_InLImitDetails_SubMenu());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.DownPaymentAmount_InLImitDetails_SubMenu());
			for(int i = 0; i <= 500; i++) {
	            try {
	                if(FMS_WifakWifakApplication.DownPaymentAmo_InLImitDetails_SubMenu().getAttribute("prevvalue").isBlank()) {
	                    break;
	                }
	            } catch (Exception e) {
	                // TODO: handle exception
	            }
	        }
			FMS_WifakWifakApplication.DownPaymentAmount_InLImitDetails_SubMenu().sendKeys("10");
			FMS_WifakWifakApplication.DownPaymentAmount_InLImitDetails_SubMenu().sendKeys(Keys.TAB);
			
			int total = (50000*10)/100;
			System.err.println("Total value: "+total);
			String valueOf = String.valueOf(total);
			
			for(int i = 0; i <= 500; i++) {
	            try {
	                if(!(FMS_WifakWifakApplication.DownPaymentAmo_InLImitDetails_SubMenu().getAttribute("prevvalue").isBlank())) {
	                    break;
	                }
	            } catch (Exception e) {
	                // TODO: handle exception
	            }
	        }    
			
			
			waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.DownPaymentAmo_InLImitDetails_SubMenu());
			String attribute = FMS_WifakWifakApplication.DownPaymentAmo_InLImitDetails_SubMenu().getAttribute("prevvalue");
			System.err.println("Down payment amount: "+attribute);
			
			String[] splitAttribute  = attribute.split("[.]");
	        String finalAttribute = splitAttribute[0].replace(",", "");
	        
	        System.err.println(finalAttribute);
	        
	        Assert.assertEquals(valueOf, finalAttribute);
			
			
	    }
	    
	    
	//--------------------------------- @574947 Scenario: TSR-EWB170043 
	    
	    
	    @Then("^Check Flag in Clean Level IN Limits Detalis SubMenu$")
	    public void check_flag_in_clean_level_in_limits_detalis_submenu() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.CLEAN_FLAG_In_LimitsDetails());
			for (int i = 0; i < 2000; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.CLEAN_FLAG_In_LimitsDetails());
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    }
	    
	    @Then("^Click the Product Class In Limits Details$")
	    public void click_the_product_class_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ProductClass_In_LimitsDetails());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.ProductClass_In_LimitsDetails());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.ProductClass_In_LimitsDetails());
	    }
	    
	    @Then("^Click Ok Button In Waring Screen In Limits Details$")
	    public void click_ok_button_in_waring_screen_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
	    }

	    @Then("^Enter the value in No Of Payments  In Repayment Plan$")
	    public void enter_the_value_in_no_of_payments_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan());
			clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan());
			FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan().sendKeys(Keys.DELETE);
			
			//Thread.sleep(40000);
//			for (int i = 0; i < 500; i++) {
//				try {
//					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Popup_NoOfPayments_InRepaymentPlan());
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
			
			for (int i = 0; i < 500; i++) {
				try {
					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan());
					FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan().sendKeys("10");
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan());
//			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan());
//			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan());
//			FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan().sendKeys("10");
	    }

	    @Then("^Click Warning popup No In Repayment Plan$")
	    public void click_warning_popup_no_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.WaringButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.WaringButton_OnLimitDetails_Tab());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.WaringButton_OnLimitDetails_Tab());
			Thread.sleep(6000);
			//FMS_WifakWifakApplication.No_Of_Payments_InRepaymentPlan().sendKeys("10");
	    }

	    @Then("^Click Ok Button In Waring Screen In Repayment Plan$")
	    public void click_ok_button_in_waring_screen_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Waring_Screen());
			Thread.sleep(6000);
//	    	for (int i = 0; i < 200; i++) {
//				try {
//				//	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Waring_RepaymentPlan());
//					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Waring_RepaymentPlan());
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
	    }
	    

	    @And("^Click Save Button After In Limits Details$")
	    public void click_save_button_after_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
			//clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
			//clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab());
	    	
			for (int i = 0; i < 2000; i++) {
	            try {
	                FMS_WifakWifakApplication.getClick_SaveButton_OnLimitDetails_Tab().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    }

	    @And("^Click OK  Button In Sucess Screen In Limits Details$")
	    public void click_ok_button_in_sucess_screen_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
	    }

	    @And("^Click Repayment Plan In Limits Details$")
	    public void click_repayment_plan_in_limits_details() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.RepaymentPlan_btn_In_LimitsDetails());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.RepaymentPlan_btn_In_LimitsDetails());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.RepaymentPlan_btn_In_LimitsDetails());
	    }

	    @And("^Click Create Schedule In Repayment Plan$")
	    public void click_create_schedule_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.createSchedule_InRepaymentPlan());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.createSchedule_InRepaymentPlan());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.createSchedule_InRepaymentPlan());
	    }

	    @And("^Click Save Button After In Repayment Plan$")
	    public void click_save_button_after_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.SaveButton_RepaymentPlan());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.SaveButton_RepaymentPlan());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.SaveButton_RepaymentPlan());
			Thread.sleep(5000);
			
//			for (int i = 0; i < 200; i++) {
//				try {
//				//	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.SaveButton_RepaymentPlan());
//					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.SaveButton_RepaymentPlan());
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
	    }

	    @And("^Click OK  Button In Sucess Screen In Repayment Plan$")
	    public void click_ok_button_in_sucess_screen_in_repayment_plan() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.moveToElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
			clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.Ok_Button_In_Sucess_Screen());
	    	Thread.sleep(10000);
//	    	for (int i = 0; i < 200; i++) {
//				try {
//				//	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.SaveInformation_RepaymentPlan());
//					clicksAndActionsHelper.clickOnElement(FMS_WifakWifakApplication.SaveInformation_RepaymentPlan());
//					Thread.sleep(5000);
//					break;
//				} catch (Exception e) {
//					if (i == 199) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
	    }
	    
	    
	  
//---------------------approvel 1	    
	    
		@And("^User clicks the Approve Level1 link$")
	    public void user_clicks_the_approve_level1_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.applicationFinancialFacilityApproveLevel1());
	    	FMS_WifakWifakApplication.applicationFinancialFacilityApproveLevel1().click();  	
	    }
	    
	    @And("^User retrive the first data in approve level1$")
	    public void user_retrive_the_first_data_in_approve_level1() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValidateCode_approve_level1());
            FMS_WifakWifakApplication.Enter_ValidateCode_approve_level1().sendKeys(SuccessMsg,Keys.ENTER);
	    	
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ClickTheValue_ValidateCode_approve_level1());
	    	clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.ClickTheValue_ValidateCode_approve_level1());
	    }

	   @And("^select the Approve level1 decision as approve$")
	    public void select_the_approve_level1_decision_as_approve() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.approveLevel1SelectDecision());
		 DropDownhelper.SelectUsingVisibleText(FMS_WifakWifakApplication.approveLevel1SelectDecision(), "Approve");
		// DropDownhelper.SelectUsingVisibleText(FMS_WifakWifakApplication.approveLevel1SelectDevision(), testData.get("Decision1"));
	 }
	    @And("^User clicks on the level1 submit button$")
	    public void user_clicks_on_the_level1_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.approveLevel1SubmitBtn());
	    	FMS_WifakWifakApplication.approveLevel1SubmitBtn().click();
//	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValidateCode_approve_level1());
//	    	FMS_WifakWifakApplication.Enter_ValidateCode_approve_level1().sendKeys(SuccessMsg,Keys.ENTER);
//	    	clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.ClickTheValue_ValidateCode_approve_level1());
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ButtonConfirmOk1());
	    	FMS_WifakWifakApplication.ButtonConfirmOk1().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ButtonSuccessOk1());
	//    	FMS_WifakWifakApplication.ButtonConfirmOk1().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
	            try {
	            	FMS_WifakWifakApplication.ButtonSuccessOk1().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    	
	    }
	    
	    //--------------------approvel 2
	    
	    @And("^User clicks the Approve Level2 link$")
	    public void user_clicks_the_approve_level2_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.applicationFinancialFacilityApproveLevel2());
	    	FMS_WifakWifakApplication.applicationFinancialFacilityApproveLevel2().click(); 
	    }
	    
	    @And("^User retrive the first data in approve level2$")
	    public void user_retrive_the_first_data_in_approve_level2() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValidateCode_approve_level2());
            FMS_WifakWifakApplication.Enter_ValidateCode_approve_level2().sendKeys(SuccessMsg,Keys.ENTER);
	    	
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ClickTheValue_ValidateCode_approve_level2());
	    	clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.ClickTheValue_ValidateCode_approve_level2());
	    }

	    @And("^User select the level2 decision as approve$")
	    public void user_select_the_level2_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.approveLevel2SelectDecision());
        	DropDownhelper.SelectUsingVisibleText(FMS_WifakWifakApplication.approveLevel2SelectDecision(), "Approve");
	    	//DropDownhelper.SelectUsingVisibleText(FMS_WifakWifakApplication.approveLevel2SelectDecision(), testData.get("Decision2"));
	    }

	    @And("^User clicks on the level2 submit button$")
	    public void user_clicks_on_the_level2_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.approveLevel2SubmitBtn());
	    	FMS_WifakWifakApplication.approveLevel2SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ButtonConfirmOk1());
	    	FMS_WifakWifakApplication.ButtonConfirmOk1().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ButtonSuccessOk1());
	    //	FMS_WifakWifakApplication.ButtonSuccessOk1().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
	            try {
	            	FMS_WifakWifakApplication.ButtonSuccessOk1().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    }

	    
	    //--------------------approvel 3
	    
	    
	    @And("^User clicks the Approve Level3 link$")
	    public void user_clicks_the_approve_level3_link() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.applicationFinancialFacilityApproveLevel3());
	    	FMS_WifakWifakApplication.applicationFinancialFacilityApproveLevel3().click();
	    }
	    
	    @And("^User retrive the first data in approve level3$")
	    public void user_retrive_the_first_data_in_approve_level3() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.Enter_ValidateCode_approve_level3());
//	    	FMS_WifakWifakApplication.approve1ClearBtn().click();
	    	FMS_WifakWifakApplication.Enter_ValidateCode_approve_level3().sendKeys(SuccessMsg,Keys.ENTER);
	    	
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ClickTheValue_ValidateCode_approve_level3());
	    	clicksAndActionsHelper.doubleClick(FMS_WifakWifakApplication.ClickTheValue_ValidateCode_approve_level3());
	    }
	    
	    @And("^User select the level3 decision as approve$")
	    public void user_select_the_level3_decision_as_approve() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.approveLevel3SelectDecision());
        	DropDownhelper.SelectUsingVisibleText(FMS_WifakWifakApplication.approveLevel3SelectDecision(), "Approve");
	    	//DropDownhelper.SelectUsingVisibleText(FMS_WifakWifakApplication.approveLevel3SelectDecision(), testData.get("Decision3"));
	    
	    }
	    
	    @When("^User clicks on the level3 submit button$")
	    public void user_clicks_on_the_level3_submit_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.approveLevel3SubmitBtn());
	    	FMS_WifakWifakApplication.approveLevel3SubmitBtn().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ButtonConfirmOk1());
	    	FMS_WifakWifakApplication.ButtonConfirmOk1().click();
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, FMS_WifakWifakApplication.ButtonSuccessOk1());
	    //	FMS_WifakWifakApplication.ButtonSuccessOk1().click();
	    	
	    	for (int i = 0; i < 2000; i++) {
	            try {
	            	FMS_WifakWifakApplication.ButtonSuccessOk1().click();
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	    } 
}
