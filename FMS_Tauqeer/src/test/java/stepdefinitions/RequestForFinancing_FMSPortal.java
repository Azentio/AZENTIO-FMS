package stepdefinitions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.fms.ApplicationForFinancialFacility_482_Obj;
import pageobjects.fms.RequestForFinancingObj;
import resources.BaseClass;

public class RequestForFinancing_FMSPortal {

	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacility_482_Obj applicationForFinancialFacilityObj = new ApplicationForFinancialFacility_482_Obj(driver);
	RequestForFinancingObj requestForFinancingObj= new RequestForFinancingObj(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ApplicationForFinancialFacility","DataSet ID");
	//ExcelData facilityManagementData = new ExcelData(path,"FacilitiesManagement","DataSet ID");
	ExcelData requestForFinancingData = new ExcelData(path,"RequestForFinancing_482","DataSet ID");
	ExcelData loginData = new ExcelData(path,"FMS_Login","UserType");
	ExcelData requestForFinancingDataFM = new ExcelData(path,"RequestForFinancing","DataSet ID");
	//ExcelData drawDownRequestData = new ExcelData(path,"DrawDownRequest","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	ClicksAndActionsHelper clickAndActionHelper=new ClicksAndActionsHelper(driver);
	
	WaitHelper waitHelper=new WaitHelper(driver);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	
	DropDownHelper dropDownHelper=new DropDownHelper(driver);
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;
	CSMLogin csmLogin = new CSMLogin(driver);
	int randomNumber;
	
	
	@And("^User_482 update test data set for AT_RF_092$")
    public void user_482_update_test_data_set_for_AT_RF_092() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_RF_092");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
	
	@And("^User_482 update test data set for AT_RF_094$")
    public void user_482_update_test_data_set_for_AT_RF_094() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_RF_094");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
	
	@And("^User_482 update test data set for AT_FM_078$")
    public void user_482_update_test_data_set_for_AT_FM_078() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_FM_078");
    	testData = requestForFinancingDataFM.getTestdata(testExecutionData.get("Data Set ID"));
    }
	
	@And("^User_482 update test data set for AT_FM_074$")
    public void user_482_update_test_data_set_for_AT_FM_074() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_FM_074");
    	testData = requestForFinancingDataFM.getTestdata(testExecutionData.get("Data Set ID"));
    }
	
	
	 
	 
	 
	 @And ("User_482 Click on the Date for changing to running date")
	 public void User_482_Click_on_the_Date_for_changing_to_running_date() {
		 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, requestForFinancingObj.calendar_Request_For_Financing());
		 
		 for(int i=0; i<=200; i++) {
			 
			 try {
				 
				 requestForFinancingObj.calendar_Request_For_Financing().click();
				 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, requestForFinancingObj.calendar_Popup_Title_Request_For_Financing());	
				 seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.calendar_Popup_Date_Request_For_Financing());
				 requestForFinancingObj.calendar_Popup_Date_Request_For_Financing().clear();
				 DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 LocalDate date =LocalDate.now();
				// LocalDate date =LocalDate.of(2017, 10, 03);
			  	  String currentDate = date.format(dtFormatter);
			  	requestForFinancingObj.calendar_Popup_Date_Request_For_Financing().sendKeys(currentDate);
			  	seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.calendar_Popup_UseBtn_Request_For_Financing());
			  	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, requestForFinancingObj.calendar_Popup_InformationTitle_Request_For_Financing());
			  	seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.calendar_Popup_InformationTitle_OkBtn_Request_For_Financing());
			  	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, requestForFinancingObj.calendar_Popup_Title_Request_For_Financing());
			  	seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.calendar_Popup_CloseBtn_Request_For_Financing());
				  break;
			 }catch (Exception e) {
				// TODO: handle exception
				 if(i==200)
					 Assert.fail(e.getMessage());
			}
		 }
	 }
	 
	 @And("^User_482 Click on REQUEST FOR FINANCING under KKDemo in the FMS Application$")
	    public void user_482_click_on_request_for_financin_under_kkdemo_in_the_fms_application() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
	    }
	 
	 @And("^User_482 click on the TauqTest Request$")
	    public void user_482_click_on_the_tauqtest_request() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.tauqTest_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.tauqTest_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.tauqTest_Under_MenuOption_Request_For_Financing());
	    }
	 
	 @And("^User_482 Click on REQUEST FOR FINANCING under KosDemo in the FMS Application$")
	    public void user_482_click_on_request_for_financin_under_kosdemo_in_fms_application() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
			//seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_Title_Under_MenuOption_Request_For_Financing());
			/*for(int i=0; i<=50; i++) {
				try {
					requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing().sendKeys(Keys.ARROW_DOWN);
					break;
				}catch (Exception e) {
					// TODO: handle exception
					if(i==50)
						Assert.fail(e.getMessage());
				}
			}
			//requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing().sendKeys(Keys.ARROW_DOWN);
			requestForFinancingObj.kosDemo_Title_Under_MenuOption_Request_For_Financing().click();
			//seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_Title_Under_MenuOption_Request_For_Financing());
			//seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_RequestForFinance_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_RequestForFinance_Under_MenuOption_Request_For_Financing());
		//	seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_Maintainence_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_Maintainence_Under_MenuOption_Request_For_Financing());*/
			
			
	    }
	 
	 
	 @And("^User_482 click on the Tauqtest Under TauqTest Request$")
	    public void user_482_click_on_the_tauqtest_under_tauqtest_request() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.tauqTest_Title_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.tauqTest_Title_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.tauqTest_Title_Under_MenuOption_Request_For_Financing());
			
			
			
	    }
	 

	 
	 @And("^User_482 Click on submenu under KosDemo in the FMS Application$")
	    public void user_482_click_on_submenu_under_kosdemo_in_fms_application() throws Throwable {
	    	
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_Title_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_Title_Under_MenuOption_Request_For_Financing());
			
			
	    }
	 
		 
	 @And("^User_482 Click on REQUEST FOR FINANCING under KOSDemo$")
	    public void user_482_click_on_request_for_financing_under_kosdemo() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_Under_MenuOption_Request_For_Financing());
			
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.kosDemo_Title_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_Title_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_Title_Under_MenuOption_Request_For_Financing());
	    }
	 
	 @And("^User_482 click the Request For Financing Sub Menu under KOSDemo$")
	    public void user_482_click_the_request_for_financing_sub_menu_under_request_for_financin() throws Throwable {
		 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.kosDemo_RequestForFinance_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_RequestForFinance_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_RequestForFinance_Under_MenuOption_Request_For_Financing());
	    }
	 
	 @And("^User_482 click on the Request For Financing Under TauqTest$")
	    public void user_482_click_the_request_for_financing_under_tauqtest() throws Throwable {
		
		 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.tauqTest_RequestForFinance_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.tauqTest_RequestForFinance_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.tauqTest_RequestForFinance_Under_MenuOption_Request_For_Financing());
	    }
	 
	 @And("^User_482 Click on Maintenance under KOSDemo Sub Menu in REQUEST FOR FINANCIN$")
	    public void user_482_click_on_maintenance_under_kosdemo_sub_menu_in_request_for_financin() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.kosDemo_Maintainence_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.kosDemo_Maintainence_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.kosDemo_Maintainence_Under_MenuOption_Request_For_Financing());
	    }
	 
	 @And("^User_482 click on the Maintainence Under Request For Financing$")
	    public void user_482_click_on_maintenance_under_request_for_financin() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.tauqTest_Maintainence_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.tauqTest_Maintainence_Under_MenuOption_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.tauqTest_Maintainence_Under_MenuOption_Request_For_Financing());
	    }
	 
	 @And("^User Select NewRequest in Reason For Submission under Maintenance screen in REQUEST FOR FINANCING$")
	    public void user_select_newrequest_in_reason_for_submission_under_maintenance_screen_in_request_for_financing() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,applicationForFinancialFacilityObj.reasonForSubmissionSelect());
			seleniumActions.getDropDownHelper()
					.SelectUsingVisibleText(applicationForFinancialFacilityObj.reasonForSubmissionSelect(), "New Request");
			 for (int i = 0; i <200; i++) {
		  			try {
		  				if (!applicationForFinancialFacilityObj.requestDateValidation().getAttribute("prevvalue").isBlank()&&!applicationForFinancialFacilityObj.requestDateValidation().getAttribute("prevvalue").isEmpty()) {
							break;	
						}
		  			} catch (Exception e) {
		  				
		  			}
		  			
		  		}
	    }
	 
	 
	 @And("User_482 select the Request for submission under Maintainence")
	 public void user_482_select_the_request_for_submission_under_maintainence() {
		 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_RequestForSubmission());
			seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_RequestForSubmission());
			for(int i=0; i<=200; i++) {
				
				try {
					
					dropDownHelper.SelectUsingVisibleValue(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_RequestForSubmission(), "New Request");
					applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_RequestForSubmission().sendKeys(Keys.TAB);
					break;
				}catch (Exception e) {
					// TODO: handle exception
					if(i==200)
						Assert.fail(e.getMessage());
				}
			}

			/*
			 * boolean
			 * buffer=applicationForFinancialFacilityObj.displayProgIcon().isDisplayed();
			 * 
			 * if(buffer==true) {
			 * 
			 * try { waitHelper.waitForElementwithFluentwait(driver,
			 * applicationForFinancialFacilityObj.displayProgIcon());
			 * System.out.println("Progress Bar Appeared");
			 * wait.until(ExpectedConditions.invisibilityOf(
			 * applicationForFinancialFacilityObj.displayProgIcon()));
			 * System.out.println("Progress Bar Disappeard");
			 * 
			 * 
			 * } catch (Exception e) { Assert.fail(e.getMessage()); } }
			 */
	 }
	 
	 
	 
	 
	 @And("^User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCING$")
	    public void user_search_the_cif_number_in_customer_under_maintenance_screen_in_request_for_financing() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,requestForFinancingObj.customerCIF_Request_For_Financing());
	    	seleniumActions.getClickAndActionsHelper().moveToElement(requestForFinancingObj.customerCIF_Request_For_Financing());
			seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.customerCIF_Request_For_Financing());
			for(int i=0; i<=200; i++) {
				
				try {
					applicationForFinancialFacilityObj.customerCIF().sendKeys("727",Keys.TAB);
					//applicationForFinancialFacilityObj.customerCIF().sendKeys(testData.get("CIFNO"));
					break;
				}catch (Exception e) {
					// TODO: handle exception
                     if(i==200)
                    	 Assert.fail(e.getMessage());
		  		}
			}
			
			
			
	    }
	 
	 @And ("User_482 enter the Info Completion Date under Maintainence")
	 public void User_482_enter_the_info_completion_date_under_maintainence() {
		 
		 for(int i=0; i<=300; i++) {
				
				try {
					
					seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_InfoCompletionDate());
					seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_InfoCompletionDate());
					//seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_InfoCompletionDate());
					//requestForFinancingObj.fms_tauqtest_Maintainence_CIF().sendKeys(testData.get("Info_Completion_Date"),Keys.TAB);
					//requestForFinancingObj.fms_tauqtest_Maintainence_CIF().sendKeys(testData.get("Info_Completion_Date"));
					applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_InfoCompletionDate().sendKeys("09/11/2023",Keys.TAB);
					break;
				}catch (Exception e) {
					// TODO: handle exception
					if(i==300)
						Assert.fail(e.getMessage());
				}
				
				
			}
	 }
	 
	 
    @And("User_482 enter the Customer CIF no under Maintainence")
    public void user_482_enter_the_customer_cif_no_under_maintainence() {
for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_CIF());
			    seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_CIF());
			    seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_CIF());
			    applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_CIF().sendKeys(testData.get("Customer_CIF"),Keys.TAB);
			    //requestForFinancingObj.fms_tauqtest_Maintainence_CIF().sendKeys(testData.get("Customer_CIF"));
			    Thread.sleep(10000);
			    break;
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}

		/*
		 * for (int i = 0; i < 10; i++) { try {
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * applicationForFinancialFacilityObj.ProgressIcon());
		 * System.out.println("Progress Bar Appeared");
		 * wait.until(ExpectedConditions.invisibilityOf(
		 * applicationForFinancialFacilityObj.ProgressIcon()));
		 * System.out.println("Progress Bar Disappeard"); break;
		 * 
		 * } catch (Exception e) {
		 * 
		 * }
		 * 
		 * }
		 */
    }

	@And("User_482 enter the Facility Type under Facility Type Details under Maintainence")
	public void user_482_enter_the_facility_type_under_facility_type_details_under_maintainence() throws InterruptedException {
for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityTypeDetailsTab());
				
				seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityTypeDetailsTab());
				clickAndActionHelper.moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityTypeDetailsTab());

				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType());
				
				seleniumActions.getClickAndActionsHelper().moveToElement(
						    applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType());
			
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType().sendKeys("1441",Keys.TAB);
				System.out.println("first time");
				
				
				    break;
				
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
		/*
		 * for (int i = 0; i < 10; i++) { try {
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * applicationForFinancialFacilityObj.ProgressIcon());
		 * System.out.println("Progress Bar Appeared"); boolean visible=
		 * applicationForFinancialFacilityObj.ProgressIcon().isDisplayed();
		 * System.out.println("visible "+visible); if(visible==true) {
		 * wait.until(ExpectedConditions.invisibilityOf(
		 * applicationForFinancialFacilityObj.ProgressIcon()));
		 * System.out.println("Progress Bar Disappeard"); break; } break; } catch
		 * (Exception e) { if(i==9) Assert.fail(e.getMessage()); } }
		 */
		
		
			for(int j=0; j<=300; j++) {
				
				try {
					
			

					seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
							applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType());
					
					seleniumActions.getClickAndActionsHelper().moveToElement(
							applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType());
					
					applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
					applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType().sendKeys("1441");
					Thread.sleep(5000);
					applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
					applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType().sendKeys("1441");
					applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FacilityType().sendKeys(Keys.TAB);
					System.out.println("second time");
					
					
					    break;
					
					
				}catch (Exception e) {
					// TODO: handle exception
					if(j==300)
						Assert.fail(e.getMessage());
				}
			}
			
			/*
			 * for (int i = 0; i < 10; i++) { try {
			 * waitHelper.waitForElementwithFluentwait(driver,
			 * applicationForFinancialFacilityObj.ProgressIcon());
			 * System.out.println("Progress Bar Appeared"); boolean visible=
			 * applicationForFinancialFacilityObj.ProgressIcon().isDisplayed();
			 * System.out.println("visible "+visible); if(visible==true) {
			 * wait.until(ExpectedConditions.invisibilityOf(
			 * applicationForFinancialFacilityObj.ProgressIcon()));
			 * System.out.println("Progress Bar Disappeard"); break; } break; } catch
			 * (Exception e) { if(i==9) Assert.fail(e.getMessage()); } }
			 * Thread.sleep(20000);
			 */
		
	}
	
	
	@And("User_482 enter the Total Limit under Facility Type Details under Maintainence")
	public void user_482_enter_the_total_limit_under_facility_type_details_under_maintainence() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				                applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_TotalLimit());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				                  applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_TotalLimit());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_TotalLimit());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_TotalLimit().sendKeys(testData.get("TotalLimit"));
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_TotalLimit().sendKeys(Keys.TAB);
				
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
		/*
		 * try { waitHelper.waitForElementwithFluentwait(driver,
		 * applicationForFinancialFacilityObj.displayProgIcon());
		 * System.out.println("Progress Bar Appeared");
		 * wait.until(ExpectedConditions.invisibilityOf(
		 * applicationForFinancialFacilityObj.displayProgIcon()));
		 * System.out.println("Progress Bar Disappeard");
		 * 
		 * 
		 * } catch (Exception e) { Assert.fail(e.getMessage()); }
		 */
		
	}
	
	
	@And("User_482 select the History of ITFC under Facility Details under Maintainence")
	public void User_482_select_the_history_of_itfc_under_facility_details_under_maintainence() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_HistoryWithITFC());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_HistoryWithITFC());
		for(int i=0; i<=300; i++) {
			
			try {
				
				dropDownHelper.SelectUsingVisibleText(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_HistoryWithITFC(),testData.get("HistoryWithITFC"));
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And("User_482 select the Commodities and Securities Component Tab Under Request Details")
	public void user_482_select_the_commodities_and_securities_component_tab_under_request_details() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				   applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_RequestDetails_CommoditiesAndSecurityComponentTab());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_RequestDetails_CommoditiesAndSecurityComponentTab());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_RequestDetails_CommoditiesAndSecurityComponentTab());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
		
	}
	
	@And("User_482 verify the Title and click on Add Button under Approved Commodities")
	public void user_482_verify_the_title_and_click_on_add_button_under_approved_commodities() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				                 fms_tauqtest_Maintainence_RequestDetails_CommoditiesAndSecurity_ApprovedCommoditiesTitle());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				fms_tauqtest_Maintainence_RequestDetails_CommoditiesAndSecurity_ApprovedCommodities_AddBtn());
		for(int i=0; i<=300; i++) {
			
			try {
				boolean verify=applicationForFinancialFacilityObj.
						 fms_tauqtest_Maintainence_RequestDetails_CommoditiesAndSecurity_ApprovedCommoditiesTitle().isDisplayed();
				
				System.out.println("verify "+verify);
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.
						  fms_tauqtest_Maintainence_RequestDetails_CommoditiesAndSecurity_ApprovedCommodities_AddBtn());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	@And("User_482 add the Catogery under Approved Commodities")
	public void user_482_add_the_catogery_under_approved_commodities() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				        fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_SubCat_CatogoryBeforeClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				        fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_SubCat_CatogoryBeforeClick());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						    fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_SubCat_CatogoryBeforeClick());
				
				applicationForFinancialFacilityObj.
				fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_SubCat_CatogoryAfterClick().sendKeys("1",Keys.TAB);
				
				Thread.sleep(2000);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	@And("User_482 add the SubCatogery Code under Approved Commodities")
	public void user_482_add_the_subCatogery_code_under_approved_commodities() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				         fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_SubCat_CodeAfterClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				         fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_SubCat_CodeAfterClick());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						    fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_SubCat_CodeAfterClick());
				
				applicationForFinancialFacilityObj.
				 fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_SubCat_CodeAfterClick().sendKeys("11",Keys.TAB);
				Thread.sleep(2000);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
		
	}
	
	
	@And("User_482 add the Commodity Code Under Approved Commodities")
	public void user_482_add_the_commodity_code_under_approved_commodities() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				              fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_Comm_CodeAfterClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				              fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_Comm_CodeAfterClick());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						     fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_Comm_CodeAfterClick());
				
				applicationForFinancialFacilityObj.
				 fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_Comm_CodeAfterClick().sendKeys("1",Keys.TAB);
				Thread.sleep(2000);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	
	}
	
	
	@And("User_482 add the Expected Percent under Approved Commodities")
	public void user_482_add_the_expected_percent_under_approved_commodities() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				          fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_Comm_ExpectedPercentAfter());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				          fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_Comm_ExpectedPercentAfter());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						     fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_Comm_ExpectedPercentAfter());
				
				applicationForFinancialFacilityObj.
				fms_tauqtest_Maintainence_RequestDetails_ComdAndSec_ApprovedCommodities_Comm_ExpectedPercentAfter().sendKeys("100",Keys.TAB);
				Thread.sleep(2000);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	
	
	@And("User_482 select the Source Destination Tab under Facility Details under Maintainence")
	public void User_482_select_the_source_destination_tab_under_facility_details_under_maintainence() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And("User_482 add the row in the Specific Countries")
	public void user_482_add_the_row_in_the_specific_countries() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountriesTitle());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountriesTitle());

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_AddBtn());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_AddBtn());
          
		for(int i =0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_AddBtn());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}

	}
	
	@And("User_482 enter the value in Country Code under Specific Countries")
	public void user_482_enter_the_value_in_country_code_under_specific_countries() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
			 applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCodeBeforeClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCodeBeforeClick());

		for(int i =0; i<=300; i++) {

			try {

				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						            fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCodeBeforeClick());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj
				              .fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCodeAfterClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				              .fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCodeAfterClick());
		
		for(int i =0; i<=300; i++) {

			try {

			
				applicationForFinancialFacilityObj.
				     fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCodeAfterClick().sendKeys("1",Keys.TAB,Keys.TAB);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And("User_482 enter the percent in the Expected percent under Specific Countries")
	public void user_482_enter_the_percent_in_the_expected_percent_under_specific_countries() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCode_ExpectedPercent());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCode_ExpectedPercent());

		for(int i =0; i<=300; i++) {

			try {

				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.
						    fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCode_ExpectedPercent());
				
				applicationForFinancialFacilityObj.
				 fms_tauqtest_Maintainence_SourceDestinationTab_specificCountries_CountryCode_ExpectedPercent().sendKeys("50",Keys.TAB);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
	}
	
	
	@And("User_482 add the row in the Specific Suppliers")
	public void user_482_add_the_row_in_the_specific_suppliers() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliersTitle());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliersTitle());

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_AdBtn());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_AdBtn());
          
		for(int i =0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						 applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_AdBtn());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
	}
	
	
	
	
	
	
	
	@And("User_482 enter the percent in the Expected percent under Specific Suppliers")
	public void user_482_enter_the_percent_in_the_expected_percent_under_specific_suppliers() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_ExpectedPercent());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_ExpectedPercent());

		for(int i =0; i<=300; i++) {

			try {

				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.
						                fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_ExpectedPercent());
				applicationForFinancialFacilityObj.
				          fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_ExpectedPercent().sendKeys("50",Keys.TAB);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And("User_482 click on the Disbursement Sublimit Tab")
	public void User_482_click_on_the_disbursement_sublimit_tab() {
seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
		                  applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				          applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit());
		for(int i=0; i<=300; i++) {
 
			try {
 
				seleniumActions.getClickAndActionsHelper().doubleClick(
						  applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And("User_482 click on the add button icon under Disbursement Sublimit Tab")
	public void user_482_click_on_the_add_button_under_disbursement_sublimit_under_maintainence() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_AddBtn());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_AddBtn());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.
						                                        fms_tauqtest_Maintainence_DisbursementSublimit_AddBtn());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@And("User_482 verify the Limit Details window")
	public void user_482_verify_the_limit_details_window() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				     applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_LimitDetailsWindowTitle());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_LimitDetailsWindowTitle());
		for(int i=0; i<=300; i++) {

			try {

				boolean visible=applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_LimitDetailsWindowTitle().isDisplayed();
				if(visible==true) {
					System.out.println("Visible "+visible);
					break;
				}
				
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
	}
	
	@And("User_482 add the Product Class under Limit Details")
	public void user_482_add_the_product_class_under_limit_details() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				   applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj
				                                     .fms_tauqtest_Maintainence_DisbursementSublimit_productClass());
		for(int i=0; i<=300; i++) {

			try {

				seleniumActions.getClickAndActionsHelper().clickOnElement(
						    applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass());
				
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys("100");
				Thread.sleep(5000);
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys(Keys.TAB);
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys("100");
				Thread.sleep(10000);
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys(Keys.TAB);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
		
		}
	
	
		/*
		 * @And("User_482 enter the Maturity Date") public void
		 * user_482_enter_the_maturity_date() {
		 * 
		 * seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
		 * applicationForFinancialFacilityObj.
		 * fms_tauqtest_Maintainence_DisbursementSublimit_MaturityDate());
		 * 
		 * seleniumActions.getClickAndActionsHelper().moveToElement(
		 * applicationForFinancialFacilityObj.
		 * fms_tauqtest_Maintainence_DisbursementSublimit_MaturityDate()); for(int i=0;
		 * i<=300; i++) {
		 * 
		 * try {
		 * 
		 * seleniumActions.getClickAndActionsHelper().clickOnElement(
		 * applicationForFinancialFacilityObj.
		 * fms_tauqtest_Maintainence_DisbursementSublimit_MaturityDate());
		 * 
		 * applicationForFinancialFacilityObj.
		 * fms_tauqtest_Maintainence_DisbursementSublimit_MaturityDate().sendKeys(Keys.
		 * CONTROL+"A", Keys.BACK_SPACE,"03/11/2024",Keys.TAB); break; }catch (Exception
		 * e) { // TODO: handle exception if(i==300) Assert.fail(e.getMessage()); } } }
		 */
	
	@And("User_482 enter the Tenure Year")
	public void user_482_enter_the_tenure_year() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				      applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_Tenure());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				      applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_Tenure());
		for(int i=0; i<=300; i++) {

			try {

				seleniumActions.getClickAndActionsHelper().clickOnElement(
						  applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_Tenure());
				
				applicationForFinancialFacilityObj.
				   fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE,"1",Keys.TAB);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
		
		
	}
	
	
	@And("user_482 select the year for tenure under limit details under disbursement sublimit under maintainence")
	public void user_482_select_the_year_for_tenure_under_limit_details_under_disbursement_sublimit_under_maintainence() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				             applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_Tenure_Years());
		
		
		seleniumActions.getDropDownHelper()
				.SelectUsingVisibleText(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_Tenure_Years(), "");
		
		
		 for (int i = 0; i <200; i++) {
	  			try {
	  				if (!applicationForFinancialFacilityObj.requestDateValidation().getAttribute("prevvalue").isBlank()&&!applicationForFinancialFacilityObj.requestDateValidation().getAttribute("prevvalue").isEmpty()) {
						break;	
					}
	  			} catch (Exception e) {
	  				
	  			}
	  			
	  		}
	}
	
	
	@And("User_482 click on the Add button under Limit Detail window")
	public void user_482_click_on_the_add_button_under_limit_detail_window() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				        applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_limitDetails_AddBtn());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				        applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_limitDetails_AddBtn());
		for(int i=0; i<=300; i++) {

			try {			
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_limitDetails_AddBtn().click();
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
	}
	
	@And("User_482 click on the Pricing Details Button")
	public void user_482_click_on_the_pricing_details_button(){
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetailsButton());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetailsButton());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetailsButton());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	
	@And("User_482 verify the Title and click on the Add button under Pricing Details Window")
	public void user_482_verify_the_title_and_click_on_the_add_button_under_pricing_details_window(){
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				    applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetailsTitleWindow());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				    applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_AddBtn());
		for(int i=0; i<=300; i++) {
			
			try {
				boolean verify=applicationForFinancialFacilityObj.
						fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetailsTitleWindow().isDisplayed();
				
				System.out.println("verify "+verify);
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.
						                              fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_AddBtn());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	
	@And("User_482 click on the Start Date under Pricing Details")
	public void user_482_click_on_the_start_date_under_pricing_details(){
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_StartDateBefore());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				  applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_StartDateBefore());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						            fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_StartDateBefore());
				Thread.sleep(2000);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	
	@And("User_482 add the Markup Spread Percent under Pricing Details")
	public void user_482_add_the_markup_spread_percent_under_pricing_details(){
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				                  fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_MarkupSpreadPercentAfter());
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				                fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_MarkupSpreadPercentAfter());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						         fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_MarkupSpreadPercentAfter());
				
				applicationForFinancialFacilityObj.
				fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_MarkupSpreadPercentAfter().sendKeys("1",Keys.TAB);
				Thread.sleep(2000);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	
	@And("User_482 add the Floor Percent under Pricing Details")
	public void user_482_add_the_floor_spread_percent_under_pricing_details(){
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_FloorPercentAfter());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				                     fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_FloorPercentAfter());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						        fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_FloorPercentAfter());
				
				applicationForFinancialFacilityObj.
				fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_FloorPercentAfter().sendKeys("1",Keys.TAB);
				Thread.sleep(2000);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	
	@And("User_482 add the Cap Percent under Pricing Details")
	public void user_482_add_the_cap_spread_percent_under_pricing_details(){
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				                       fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_CapPercentAfter());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				                       fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_CapPercentAfter());
		for(int i=0; i<=300; i++) {
			
			try {
				
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						           fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_CapPercentAfter());
				
				applicationForFinancialFacilityObj.
				fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_CapPercentAfter().sendKeys("1",Keys.TAB);
				Thread.sleep(2000);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
 
		}
	}
	
	
	@And("User_482 click on the Ok Button under Pricing Details")
	public void user_482_click_on_the_ok_button_pricing_details() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				                                        fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_OkBtn());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				                                  fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_OkBtn());
		for(int i=0; i<=300; i++) {
 
			try {
 
			
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_DisbursementSublimit_PricingDetails_OkBtn().click();
				System.out.println("Ok button clicked");
				
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
	}
	
	
	@And("User_482 enter the value in CIFNo under Specific Suppliers")
	public void user_482_enter_the_value_in_cifno_under_specific_suppliers() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				                      fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_CIFNoBeforeClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_CIFNoBeforeClick());

		for(int i =0; i<=300; i++) {

			try {

				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						              fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_CIFNoBeforeClick());
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				                              fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_CIFNoAfterClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				                              fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_CIFNoAfterClick());
		
		for(int i =0; i<=300; i++) {

			try {

			//	seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_CIFNoAfterClick());
				applicationForFinancialFacilityObj.
				   fms_tauqtest_Maintainence_SourceDestinationTab_specificSuppliers_CIFNoAfterClick().sendKeys("727",Keys.TAB,Keys.TAB);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
	}
	
	
	
	@And("User_482 click on the Funding Tab under Maintainence")
	public void user_482_click_on_the_funding_tab_under_maintainence() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				     applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab());
		
		for(int i=0; i<=300; i++) {

			try {

				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab());
				
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
	}
	
	@And("User_482 click on the add button under Funding Tab")
	public void user_482_click_on_the_add_button_under_funding_tab() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, 
				              applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(
				              applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn());
		for(int i=0; i<=300; i++) {

			try {

				seleniumActions.getClickAndActionsHelper().clickOnElement(
						    applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn());
				
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
	}
	
	@And("User_482 add first row in Funding")
	public void user_482_add_first_row_in_funding() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				                                          fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode1BeforeClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				                                          fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode1BeforeClick());
		for(int i=0; i<=300; i++) {
 
			try {
 
				seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObj.
						                              fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode1BeforeClick());
				
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.
				                                      fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode1AfterClick());
		
		seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.
				                                           fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode1AfterClick());
		for(int i=0; i<=300; i++) {
 
			try {
 
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.
						                          fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode1AfterClick());
				
				applicationForFinancialFacilityObj.
				    fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode1AfterClick().sendKeys("294",Keys.TAB,Keys.TAB);
				
				Thread.sleep(5000);
				seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.
						                                     fms_tauqtest_Maintainence_FundingTab_AddBtn_AmountAfterClick());
				
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_AmountAfterClick().
				                                                                   sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
				
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_AmountAfterClick().
				                                                                              sendKeys("50000",Keys.TAB);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());  
			}
		}
	}
	
	@And("User_482 add second row in Funding")
	public void user_482_add_second_row_in_funding() {
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode2BeforeClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode2BeforeClick());
		for (int i = 0; i <= 300; i++) {
 
			try {
 
				seleniumActions.getClickAndActionsHelper().doubleClick(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode2BeforeClick());
				// applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
 
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode2AfterClick());
		seleniumActions.getClickAndActionsHelper().moveToElement(
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode2AfterClick());
		for (int i = 0; i <= 300; i++) {
 
			try {
 
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode2AfterClick());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_FundingTab_AddBtn_FundCode2AfterClick()
						.sendKeys("1069", Keys.TAB, Keys.TAB);
				Thread.sleep(5000);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
      }
	
	
	
	@And("User_482 click on the Conditions Tab under Request For Financing Maintainence")
	public void user_482_click_on_the_conditions_tab_under_request_for_financing_maintainence() {
 
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab());
 
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab());
		for (int i = 0; i <= 300; i++) {
 
			try {
 
				seleniumActions.getClickAndActionsHelper()
						.doubleClick(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
 
	}
	
	
	@Then("User_482 enter the value in Time Limits under Condition tab")
	public void User_482_enter_the_value_in_Time_Limits_under_Condition_tab() {
 
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_SigningAgreement());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_SigningAgreement());
 
		for (int i = 0; i <= 300; i++) {
 
			try {
 
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_SigningAgreement());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_SigningAgreement().sendKeys("1",
						Keys.TAB);
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_Effctiveness());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_Effctiveness().sendKeys("1", Keys.TAB);
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_FirstDisbursement());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_FirstDisbursement().sendKeys("1",
						Keys.TAB);
				seleniumActions.getClickAndActionsHelper().clickOnElement(
						applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_FullUtilization());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ConditionsTab_FullUtilization().sendKeys("1",
						Keys.TAB);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
 
	}
	
	
	@And("User_482 click on the Save Button")
	public void user_482_click_on_the_save_button() {
 
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				         applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn());
		for (int i = 0; i <= 300; i++) {
 
			try {
 
				// seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.fms_tauqtest_Maintainence_DisbursementSublimit_limitDetails_AddBtn());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn().click();
				System.out.println("Save button clicked");
				// requestForFinancingObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys(Keys.CONTROL+"A",
				// Keys.BACK_SPACE,"03/11/2024",Keys.TAB);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	
	
	@And("User_482 click on the Ok button in confirm Popup")
	public void user_482_click_on_the_ok_button_in_confirm_popup() {
 
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn_ConfirmPopup());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn_ConfirmPopup_OkBtn());
		for (int i = 0; i <= 300; i++) {
 
			try {
 
				// seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.fms_tauqtest_Maintainence_DisbursementSublimit_limitDetails_AddBtn());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn_ConfirmPopup_OkBtn().click();
				System.out.println("ok confirm popup button clicked");
				// requestForFinancingObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys(Keys.CONTROL+"A",
				// Keys.BACK_SPACE,"03/11/2024",Keys.TAB);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
 
	}
	
	
	
	@And("User_482 click on the Ok button in Success Popup")
	public void user_482_click_on_the_ok_button_in_success_popup() {
 
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn_SuccessPopup());
		// wait.until(ExpectedConditions.visibilityOf(requestForFinancingObj.fms_tauqtest_Maintainence_SaveBtn_SuccessPopup()));
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn_SuccesPopup_OkBtn());
		for (int i = 0; i <= 300; i++) {
 
			try {
 
				// seleniumActions.getClickAndActionsHelper().clickOnElement(requestForFinancingObj.fms_tauqtest_Maintainence_DisbursementSublimit_limitDetails_AddBtn());
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn_SuccesPopup_OkBtn().click();
				System.out.println("ok success popup button clicked");
				// requestForFinancingObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys(Keys.CONTROL+"A",
				// Keys.BACK_SPACE,"03/11/2024",Keys.TAB);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
 
	}
	
	
	@And("^User_482 Get the Code in Success Pop up Menu$")
	public void user_get_the_code_in_success_pop_up_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn_SuccessPopup());
		requestId = applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_SaveBtn_SuccesPopup_RequestText().getText()
				.substring(10, 14);
		excelData.updateTestData(testExecutionData.get("Data Set ID"), "RequestID", requestId);
		System.out.println(requestId);
	}
	
	
	@And("User_482 click on the Validation Button")
	public void user_482_click_on_the_validation_button() {
 
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ValidateBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ValidateBtn());
		for (int i = 0; i <= 300; i++) {
 
			try {
 
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(applicationForFinancialFacilityObj.fms_tauqtest_Maintainence_ValidateBtn());
				// requestForFinancingObj.fms_tauqtest_Maintainence_ValidateBtn().click();
				System.out.println("ok validation button clicked");
				// requestForFinancingObj.fms_tauqtest_Maintainence_DisbursementSublimit_productClass().sendKeys(Keys.CONTROL+"A",
				// Keys.BACK_SPACE,"03/11/2024",Keys.TAB);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
 
	}
	
}	

