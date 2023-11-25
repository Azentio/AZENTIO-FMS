package stepdefinitions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import junit.framework.Assert;
import pageobjects.CommonElements.ApplicationForFinancialFacility_482_Objnew;
import pageobjects.CommonElements.IISCommonElements;
import resources.BaseClass;

public class CUSTOMERGRADING {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ApplicationForFinancialFacility_482_Objnew applicationForFinancialFacilityObjnew = new ApplicationForFinancialFacility_482_Objnew(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	//BufferHelper bufferHelper = new BufferHelper(driver);
//	FMSPageObj fMSPageObj = new FMSPageObj(driver);
	IISCommonElements commonElementsObj=new IISCommonElements(driver);
	WaitHelper waitHelper= new WaitHelper(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	String path = System.getProperty("user.dir") +"\\TestData\\FMSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ApplicationForFinancialFacility","DataSet ID");
	ExcelData facilityManagementData = new ExcelData(path,"FacilitiesManagement","DataSet ID");
	ExcelData requestForFinancingData = new ExcelData(path,"RequestForFinancing_482","DataSet ID");
	ExcelData drawDownRequestData = new ExcelData(path,"DrawDownRequest","DataSet ID");
	ExcelData customerGrading = new ExcelData(path,"CustomerGrading","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	String requestId;
	String date;
	CSMLogin csmLogin = new CSMLogin(driver);
	int randomNumber;
	
	
	@And("User_482 Update Test data set for AT_CG_010")

		public void User_482_Update_Test_data_set_for_AT_CG_010() {
	 
	 
			testExecutionData = testExecution.getTestdata("AT_CG_010");

			testData = customerGrading.getTestdata(testExecutionData.get("Data Set ID"));

			//System.out.println(testData.get("RequestID"));

		}

		@And("User_482 Update Test data set for AT_CG_011")

		public void User_482_Update_Test_data_set_for_AT_CG_011() {
	 
	 
			testExecutionData = testExecution.getTestdata("AT_CG_011");

			testData = customerGrading.getTestdata(testExecutionData.get("Data Set ID"));

			//System.out.println(testData.get("RequestID"));

		}


		@And("User_482 Select the New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_Select_the_New_Request_in_Reason_For_Submission_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.reasonForSubmissionSelect());

			seleniumActions.getDropDownHelper()

					.SelectUsingVisibleText(applicationForFinancialFacilityObjnew.reasonForSubmissionSelect(), "New Request");

			for (int i = 0; i < 200; i++) {

				try {

					if (!applicationForFinancialFacilityObjnew.requestDateValidation().getAttribute("prevvalue").isBlank()

	&& !applicationForFinancialFacilityObjnew.requestDateValidation().getAttribute("prevvalue")

									.isEmpty()) {

						break;

					}

				} catch (Exception e) {
	 
				}
	 
			}

		}
	 
		@And("User_482 click on the Cif under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_click_on_the_Cif_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.customerCIF());

			seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObjnew.customerCIF());

			seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObjnew.customerCIF());
	 
		}
	 
		@And("User_482 enter the Cif under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_enter_the_Cif_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.customerCIF());

			for (int i = 0; i < 200; i++) {

				try {

					System.out.println("CIF: " + testData.get("CIFNO"));

					// applicationForFinancialFacilityObj.customerCIF().clear();

					applicationForFinancialFacilityObjnew.customerCIF().sendKeys(testData.get("CIFNO"));

					applicationForFinancialFacilityObjnew.customerCIF().sendKeys(Keys.TAB);
	 
					break;
	 
				} catch (Exception e) {
	 
				}
	 
			}
	 
			for (int i = 0; i < 10; i++) {

				try {

					waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew.ProgressIcon());

					System.out.println("Progress Bar Appeared");
	 
					wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObjnew.ProgressIcon()));

					System.out.println("Progress Bar Disappeard");

					break;
	 
				} catch (Exception e) {
	 
				}
	 
			}
	 
		}
	 
		@And("User_482 click on the Facilty type under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_click_on_the_Facilty_type_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

//			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

//					applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());

//			seleniumActions.getClickAndActionsHelper()

//					.moveToElement(applicationForFinancialFacilityObj.facilityTypeInRequestForFinancingScreen());
	 
			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.facilityTypeInRequestForFinancingScreen().click();

					break;

				} catch (Exception e) {
	 
				}

			}

		}
	 
		@And("User_482 enter the Faclity type under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_enter_the_Faclity_type_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.facilityTypeInRequestForFinancingScreen());
	 
			for (int i = 0; i < 200; i++) {

				try {

					System.out.println("Facility Type :" + testData.get("FacilityType"));

					applicationForFinancialFacilityObjnew.facilityTypeInRequestForFinancingScreen().clear();

					applicationForFinancialFacilityObjnew.facilityTypeInRequestForFinancingScreen()

							.sendKeys(testData.get("FacilityType"));

					applicationForFinancialFacilityObjnew.facilityTypeInRequestForFinancingScreen().sendKeys(Keys.TAB);

					Thread.sleep(2000);

					break;

				} catch (Exception e) {
	 
					if (i == 200) {

						Assert.fail(e.getMessage());

					}

				}

			}
	 
//					waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());

//					System.out.println("Progress Bar Appeared");
	 
			wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObjnew.ProgressIcon()));

			System.out.println("Progress Bar Disappeard");
	 
		}
	 
		@And("User_482 click on the total limit under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_click_on_the_total_limit_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.totalLimitInRequestForFinancingScreen());

			seleniumActions.getClickAndActionsHelper()

					.moveToElement(applicationForFinancialFacilityObjnew.totalLimitInRequestForFinancingScreen());
	 
			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.totalLimitInRequestForFinancingScreen().click();

					break;

				} catch (Exception e) {

					if (i == 200) {

						Assert.fail(e.getMessage());

					}

				}

			}

		}
	 
		@And("User_482 enter the total limit under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_enter_the_total_limit_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.totalLimitInRequestForFinancingScreen());

			seleniumActions.getClickAndActionsHelper()

					.moveToElement(applicationForFinancialFacilityObjnew.totalLimitInRequestForFinancingScreen());
	 
			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.totalLimitInRequestForFinancingScreen().clear();

					applicationForFinancialFacilityObjnew.totalLimitInRequestForFinancingScreen()

							.sendKeys(testData.get("TotalLimit"));

					applicationForFinancialFacilityObjnew.totalLimitInRequestForFinancingScreen().sendKeys(Keys.TAB);

					break;

				} catch (Exception e) {

					if (i == 200) {

						Assert.fail(e.getMessage());

					}
	 
				}

			}

//			waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());

//			System.out.println("Progress Bar Appeared");
	 
			wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObjnew.displayProgIcon()));

			System.out.println("Progress icon Disappeard");

		}

		@And("User_482 click on Account field under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_click_on_Account_field_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

		    waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew.ACC_BR_InRequestForFinancingScreen());

		    for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.ACC_BR_InRequestForFinancingScreen().click();

					break;

				} catch (Exception e) {

					if (i == 200) {

						Assert.fail(e.getMessage());

					}

				}

			}

		}
	 
	 
		@And("User_482 enter the Branch Code under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_enter_the_Branch_Code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			    waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew.ACC_BR_InRequestForFinancingScreen());

			    for (int i = 0; i < 200; i++) {

					try {

						applicationForFinancialFacilityObjnew.ACC_BR_InRequestForFinancingScreen().clear();

						applicationForFinancialFacilityObjnew.ACC_BR_InRequestForFinancingScreen()

						.sendKeys(testData.get("AccBRCode"));

						applicationForFinancialFacilityObjnew.ACC_BR_InRequestForFinancingScreen().sendKeys(Keys.TAB);

						break;

					} catch (Exception e) {
	 
						if (i == 200) {

							Assert.fail(e.getMessage());

						}

					}

				}

		}
	 
	 
		@And("User_482 enter the Currency Code under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_enter_the_Currency_Code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			 waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew.ACC_CY_InRequestForFinancingScreen());

			    for (int i = 0; i < 200; i++) {

					try {

						applicationForFinancialFacilityObjnew.ACC_CY_InRequestForFinancingScreen().click();

						applicationForFinancialFacilityObjnew.ACC_CY_InRequestForFinancingScreen().clear();

						applicationForFinancialFacilityObjnew.ACC_CY_InRequestForFinancingScreen()

						.sendKeys(testData.get("AccCYCode"));

						applicationForFinancialFacilityObjnew.ACC_CY_InRequestForFinancingScreen().sendKeys(Keys.TAB);

						break;

					} catch (Exception e) {

						if (i == 200) {

							Assert.fail(e.getMessage());

						}
	 
					}

				}

		}
	 
	 
		@And("User_482 enter the  Gl Code under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_enter_the__Gl_Code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			 waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew.ACC_GL_InRequestForFinancingScreen());

			    for (int i = 0; i < 200; i++) {

					try {

						applicationForFinancialFacilityObjnew.ACC_GL_InRequestForFinancingScreen().click();

						applicationForFinancialFacilityObjnew.ACC_GL_InRequestForFinancingScreen().clear();

						applicationForFinancialFacilityObjnew.ACC_GL_InRequestForFinancingScreen()

						.sendKeys(testData.get("AccGLCode"));

						applicationForFinancialFacilityObjnew.ACC_GL_InRequestForFinancingScreen().sendKeys(Keys.TAB);

						break;

					} catch (Exception e) {

						if (i == 200) {

							Assert.fail(e.getMessage());

						}
	 
					}

				}

		}
	 
	 
		@And("User_482 enter the CIF Code under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_enter_the_CIF_Code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew.ACC_CIF_InRequestForFinancingScreen());

		    for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.ACC_CIF_InRequestForFinancingScreen().click();

					applicationForFinancialFacilityObjnew.ACC_CIF_InRequestForFinancingScreen().clear();

					applicationForFinancialFacilityObjnew.ACC_CIF_InRequestForFinancingScreen()

					.sendKeys(testData.get("AccCIFCode"));

					applicationForFinancialFacilityObjnew.ACC_CIF_InRequestForFinancingScreen().sendKeys(Keys.TAB);

					break;

				} catch (Exception e) {

					if (i == 200) {

						Assert.fail(e.getMessage());

					}
	 
				}

			}

		}
	 
	 
		@And("User_482 enter the Serial code under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_enter_the_Serial_code_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew.ACC_SL_InRequestForFinancingScreen());

		    for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.ACC_SL_InRequestForFinancingScreen().click();

					applicationForFinancialFacilityObjnew.ACC_SL_InRequestForFinancingScreen().clear();

					applicationForFinancialFacilityObjnew.ACC_SL_InRequestForFinancingScreen()

					.sendKeys(testData.get("AccSLCode"));

					applicationForFinancialFacilityObjnew.ACC_SL_InRequestForFinancingScreen().sendKeys(Keys.TAB);

					break;

				} catch (Exception e) {

					if (i == 200) {

						Assert.fail(e.getMessage());

					}
	 
				}

			}

		}
	 
		@And("User_482 click on the Shareholder and Owner Tab under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_click_on_the_Shareholder_and_Owner_Tab_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.OwnersShareholdersTAB());

//			seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.OwnersShareholdersTAB());
	 
			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.OwnersShareholdersTAB().click();

					break;

				} catch (Exception e) {

					if (i == 200) {

						Assert.fail(e.getMessage());

					}
	 
				}

			}

//			waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObj.ProgressIcon());

//			System.out.println("Progress Bar Appeared");
	 
			wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObjnew.ProgressIcon()));

			System.out.println("Progress Bar Disappeard");

		}
	 
		@And("User_482 click on the add icon under Shareholder and Owner Tab")

		public void User_482_click_on_the_add_icon_under_Shareholder_and_Owner_Tab() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.Owners_ShareholdersAddicon());

			// seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.Owners_ShareholdersAddicon());
	 
			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.Owners_ShareholdersAddicon().click();

					break;

				} catch (Exception e) {

					if (i == 200) {

						Assert.fail(e.getMessage());

					}
	 
				}

			}
	 
		}
	 
		@And("User_482 click on the New rec under Shareholder and Owner Tab")

		public void User_482_click_on_the_New_rec_under_Shareholder_and_Owner_Tab() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.OwnersShareholdersNewRec());

			// seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj.OwnersShareholdersNewRec());
	 
			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.OwnersShareholdersNewRec().click();

					break;

				} catch (Exception e) {
	 
					if (i == 200) {

						Assert.fail(e.getMessage());

					}

				}

			}

		}
	 
		@And("User_482 click on the Cif field under Shareholder and Owner Tab")

		public void User_482_click_on_the_Cif_field_under_Shareholder_and_Owner_Tab() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.OwnersShareholdersNewRecCIF());

			seleniumActions.getClickAndActionsHelper()

					.moveToElement(applicationForFinancialFacilityObjnew.OwnersShareholdersNewRecCIF());
	 
			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.OwnersShareholdersNewRecCIF().click();

					break;

				} catch (Exception e) {
	 
				}

			}
	 
		}
	 
		@And("User_482 enter the Cif")

		public void User_482_enter_the_Cif() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.OwnersShareholdersNewRecCIF());

			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.OwnersShareholdersNewRecCIF().clear();

					applicationForFinancialFacilityObjnew.OwnersShareholdersNewRecCIF().sendKeys(testData.get("CIFNO"));

					applicationForFinancialFacilityObjnew.OwnersShareholdersNewRecCIF().sendKeys(Keys.TAB);

					break;

				} catch (Exception e) {
	 
				}

			}

		}
	 
		@And("User_482 click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_click_on_Disbursement_or_Sublimit_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.disbursementOrSublimitInRequestForFinancingScreen().click();

					break;

				} catch (Exception e) {

					if (i == 199) {

						Assert.fail(e.getMessage());

					}

				}

			}

			wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObjnew.ProgressIcon()));

			System.out.println("Progress Bar Disappeard");

		}
	 
		@And("User_482 click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_click_on_Add_button_in_Disbursement_or_Sublimit_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.addIconInDisbursementOrSublimitScreen());

			seleniumActions.getClickAndActionsHelper()

					.moveToElement(applicationForFinancialFacilityObjnew.addIconInDisbursementOrSublimitScreen());
	 
			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.addIconInDisbursementOrSublimitScreen().click();

					break;

				} catch (Exception e) {

					if (i == 199) {

						Assert.fail(e.getMessage());

					}

				}

			}
	 
		}
	 
		@And("User_482 click on the Product class under sublimit")

		public void User_482_click_on_the_Product_class_under_sublimit() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.productClassInLimitDetailsPopUp());

			seleniumActions.getClickAndActionsHelper()

					.moveToElement(applicationForFinancialFacilityObjnew.productClassInLimitDetailsPopUp());

			seleniumActions.getClickAndActionsHelper()

					.clickOnElement(applicationForFinancialFacilityObjnew.productClassInLimitDetailsPopUp());

		}
	 
		@And("User_482 enter the product class under sublimit")

		public void User_482_enter_the_product_class_under_sublimit() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.productClassInLimitDetailsPopUp());

			applicationForFinancialFacilityObjnew.productClassInLimitDetailsPopUp().sendKeys(testData.get("ProductClass"));

		}
	 
		@And("User_482 click on add button under sublimit")

		public void User_482_click_on_add_button_under_sublimit() throws InterruptedException {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.addButtonInLimitDetailsPopUp());

			seleniumActions.getJavascriptHelper()

					.scrollIntoView(applicationForFinancialFacilityObjnew.addButtonInLimitDetailsPopUp());

			seleniumActions.getClickAndActionsHelper()

					.moveToElement(applicationForFinancialFacilityObjnew.addButtonInLimitDetailsPopUp());

			seleniumActions.getClickAndActionsHelper()

					.clickOnElement(applicationForFinancialFacilityObjnew.addButtonInLimitDetailsPopUp());

			Thread.sleep(2000);
	 
			if (applicationForFinancialFacilityObjnew.okButtonInInformationPopUp().isDisplayed()) {

				for (int i = 0; i < 200; i++) {
	 
					try {

						applicationForFinancialFacilityObjnew.okButtonInInformationPopUp().click();

						System.out.println("clicked on ok pop up");

						break;

					} catch (Exception e) {

						if (i == 199) {

							Assert.fail(e.getMessage());

						}

					}

				}

			}
	 
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.addButtonInLimitDetailsPopUp());

			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.addButtonInLimitDetailsPopUp().click();

					break;

				} catch (Exception e) {

					if (i == 199) {

						Assert.fail(e.getMessage());

					}

				}

			}
	 
		}
	 
		@And("User_482 click on Save button under Maintenance screen in REQUEST FOR FINANCIN")

		public void User_482_click_on_Save_button_under_Maintenance_screen_in_REQUEST_FOR_FINANCIN() {
	 
//	    	if(applicationForFinancialFacilityObj.okButtonInConfirmationPopUp().isDisplayed()) {

//	    	    System.out.println("OK pop up appeared");

//	    		applicationForFinancialFacilityObj.okButtonInConfirmationPopUp().click();

//	    	}

//	    	else {

//	    		System.out.println("OK pop up not appeared");

//	    	}
	 
			for (int i = 0; i < 200; i++) {
	 
				try {

					applicationForFinancialFacilityObjnew.savebuttonInRequestForFinancingScreenMaintenance().click();

					break;

				} catch (Exception e) {

					if (i == 199) {

						Assert.fail(e.getMessage());

					}

				}

			}

			wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObjnew.ProgressIcon()));

			System.out.println("Progress Bar Disappeard");

		}
	 
		@And("User_482 Get the Code in Success Pop up Menu")

		public void User_482_Get_the_Code_in_Success_Pop_up_Menu() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.getRequestIdInRequestForFinancingScreen());

			requestId = applicationForFinancialFacilityObjnew.getRequestIdInRequestForFinancingScreen().getText().substring(10,

					14);

			System.out.println("RequestID" + requestId);

			excelData.updateTestData(testData.get("Data Set ID"), "RequestID", requestId);

			System.out.println(requestId);

		}
	 
//	    @And("User_482 click search icon in Maintenance screen Request for financing")

//	    public void User_482_click_search_icon_in_Maintenance_screen_Request_for_financing() {

//	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

//					applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());

//			seleniumActions.getClickAndActionsHelper()

//					.moveToElement(applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());

//			seleniumActions.getClickAndActionsHelper()

//					.clickOnElement(applicationForFinancialFacilityObj.searchCodeInMaintenanceRequestForFinancing());

//	    }
	 
		@And("User_482 Search code in Maintenance screen Request for financing")

		public void User_482_Search_code_in_Maintenance_screen_Request_for_financing() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.searchCodeInMaintenanceRequestForFinancing());

			applicationForFinancialFacilityObjnew.searchCodeInMaintenanceRequestForFinancing().sendKeys(requestId);

			String xpath = "//td[contains(text(),'" + requestId + "')]";

			for (int i = 0; i < 200; i++) {

				try {

					driver.findElement(By.xpath(xpath)).isDisplayed();

					break;

				} catch (Exception e) {

					if (i == 199) {

						Assert.fail(e.getMessage());

					}

				}

			}

		}
	 
		@And("User_482 Select searched record in Maintenance screen Request for financing")

		public void User_482_Select_searched_record_in_Maintenance_screen_Request_for_financing() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.selectSearchedCodeInMaintenanceRequestForFinancing());

			seleniumActions.getClickAndActionsHelper()

					.doubleClick(applicationForFinancialFacilityObjnew.selectSearchedCodeInMaintenanceRequestForFinancing());

		}
	 
		@And("User_482 click Validate button in Main Info tab under Request for financing")

		public void User_482_click_Validate_button_in_Main_Info_tab_under_Request_for_financing()

				throws InterruptedException {

			for (int i = 0; i < 2000; i++) {

				try {

					applicationForFinancialFacilityObjnew.okButtonInInformationPopUp().click();

					break;

				} catch (Exception e) {
	 
					continue;

				}

			}

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.validateButtonInRequestForFinancingScreen());

			Thread.sleep(10000);

			for (int i = 0; i < 200; i++) {

				try {

					applicationForFinancialFacilityObjnew.validateButtonInRequestForFinancingScreen().click();

					break;

				} catch (Exception e) {
	 
				}

			}
	 
			for (int i = 0; i < 50; i++) {

				try {

					if (applicationForFinancialFacilityObjnew.okButtonInConfirmationPopUp().isDisplayed()) {

						System.out.println("OK pop up appeared");

						applicationForFinancialFacilityObjnew.okButtonInConfirmationPopUp().click();

					} else {

						applicationForFinancialFacilityObjnew.validateButtonInRequestForFinancingScreen().click();

						System.out.println("OK pop up not appeared");

					}

					break;

				} catch (Exception e) {
	 
				}

			}
	 
		}
	 
		@And("^User_482 close the Maintenance Screen$")

		public void user_482_close_the_maintenance_screen() {

			//waitHelper.waitForElementwithFluentwait(driver, commonElementsObj.iisScreenCloseBtn());

			for (int i = 0; i < 2000; i++) {

				try {

					//commonElementsObj.iisScreenCloseBtn().click();

					break;

				} catch (Exception e) {

					if (i == 1999) {

						Assert.fail(e.getMessage());

					}

				}

			}

		}
	 
		@And("User_482 click Approve Level 1 screen in Request for financing facilities under Request for financing")

		public void User_482_click_Approve_Level_1_screen_in_Request_for_financing_facilities_under_Request_for_financing() {

			for (int i = 0; i < 2000; i++) {

				try {

//					seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObj

//							.approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication());

//					seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj

//							.approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication();

					applicationForFinancialFacilityObjnew

							.approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication().click();

					break;

				} catch (Exception e) {

					if (i == 1999) {

						Assert.fail(e.getMessage());

					}

				}

			}

		}
	 
		@And("User_482 Search code in Approve Level 1 screen in Request for financing facilities")

		public void User_482_Search_code_in_Approve_Level_1_screen_in_Request_for_financing_facilities() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew

					.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());

			seleniumActions.getClickAndActionsHelper().moveToElement(applicationForFinancialFacilityObjnew

					.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());

//			seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj

//					.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());

			for (int i = 0; i < 2000; i++) {

				try {

					applicationForFinancialFacilityObjnew

							.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing().click();

					applicationForFinancialFacilityObjnew

							.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing()

							.sendKeys(requestId);

					break;

				} catch (Exception e) {

					if (i == 1999) {

						Assert.fail(e.getMessage());

					}

				}

			}
	 
			for (int i = 0; i < 10; i++) {

				applicationForFinancialFacilityObjnew

						.searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing()

						.sendKeys(Keys.ENTER);

			}
	 
		}
	 
		@And("User_482 Select searched record in Approve level 1 screen Request for financing facilities")

		public void User_482_Select_searched_record_in_Approve_level_1_screen_Request_for_financing_facilities() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew

					.selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());

			seleniumActions.getClickAndActionsHelper().doubleClick(applicationForFinancialFacilityObjnew

					.selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing());

//			wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObj.ProgressIcon()));

//			System.out.println("Progress Bar Disappeard");

		}
	 
		@And("^User_482 click on the Customer Grading tab$")

		public void user_482_click_on_the_customer_grading_tab() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.CustomerGradingTab());

			for (int i = 0; i < 2000; i++) {

				try {

					applicationForFinancialFacilityObjnew.CustomerGradingTab().click();
	 
					break;

				} catch (Exception e) {
	 
				}

			}
	 
		}
	 
		@And("User_482 Select Decision in Approve level 1 under Request for financing facilities")

		public void user_482_select_decision_in_approve_level_1_under_Request_for_financing_facilities() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.selectDecisionInApproveLevel1UnderRequestforfinancingfacilities());

			seleniumActions.getDropDownHelper().SelectUsingVisibleText(

					applicationForFinancialFacilityObjnew.selectDecisionInApproveLevel1UnderRequestforfinancingfacilities(),

					"Approve");

		}
	 
		@And("User_482 click approve button in approve screen")

		public void user_482_click_approve_button_in_approve_screen() {

			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

					applicationForFinancialFacilityObjnew.approveButtonInApproveScreen());

			seleniumActions.getClickAndActionsHelper()

					.moveToElement(applicationForFinancialFacilityObjnew.approveButtonInApproveScreen());

			// seleniumActions.getClickAndActionsHelper().clickOnElement(applicationForFinancialFacilityObj.approveButtonInApproveScreen());

			for (int i = 0; i < 2000; i++) {

				try {

					applicationForFinancialFacilityObjnew.approveButtonInApproveScreen().click();
	 
					break;

				} catch (Exception e) {
	 
				}

			}

		}
	 
		@And("User_482 click on Ok button in Confirm Pop up Menu")

		public void User_482_click_on_Ok_button_in_Confirm_Pop_up_Menu() {

			for (int i = 0; i < 5000; i++) {

				try {

					seleniumActions.getClickAndActionsHelper()

							.moveToElement(applicationForFinancialFacilityObjnew.okButtonInConfirmationPopUp());

					seleniumActions.getClickAndActionsHelper()

							.clickOnElement(applicationForFinancialFacilityObjnew.okButtonInConfirmationPopUp());

					break;

				} catch (Exception e) {
	 
				}

			}

			wait.until(ExpectedConditions.invisibilityOf(applicationForFinancialFacilityObjnew.ProgressIcon()));

			System.out.println("Progress Bar Disappeard");

		}
	 
		@And("User_482 click on Ok button in Success Pop up Menu")

		public void User_482_click_on_Ok_button_in_Success_Pop_up_Menu() {

			for (int i = 0; i < 2000; i++) {

				try {

					seleniumActions.getBrowserHelper().SwitchToWindow(1);

					seleniumActions.getBrowserHelper().switchToParentWithChildClose();

					break;

				} catch (Exception e) {
	 
				}

			}
	 
			for (int i = 0; i < 2000; i++) {

				waitHelper.waitForElementwithFluentwait(driver, applicationForFinancialFacilityObjnew.okButtonInSucessPopUp());

				try {

					seleniumActions.getClickAndActionsHelper()

							.moveToElement(applicationForFinancialFacilityObjnew.okButtonInSucessPopUp());

					seleniumActions.getClickAndActionsHelper()

							.clickOnElement(applicationForFinancialFacilityObjnew.okButtonInSucessPopUp());

					break;

				} catch (Exception e) {
	 
				}

			}

		}
}
