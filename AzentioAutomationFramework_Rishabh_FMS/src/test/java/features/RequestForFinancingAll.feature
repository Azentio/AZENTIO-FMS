Feature: Testing the Functionality of Request for financing
@AT_RF_008
Scenario: MFI190234 - Request for Financing & Application --->Limit Details-->Repayment Plan, Maturity dates not changing properly
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
And User_482 Update Test data set for AT_RF_008
And User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN
And User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Search Product Class in Limit Details Pop up Menu
#And User Enter the Margin value in New Tab Field in Limit Details Pop up Menu
And User Click on Add button in Limit Details Pop up
And User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN
And User_482 Click on Ok button in Confirm Pop up Menu
And User Get the Code in Success Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click search icon in Maintenance screen Request for financing
And User Search code in Maintenance screen Request for financing
And User Select searched record in Maintenance screen Request for financing
And User_482 Click on Ok button in Confirm Pop up Menu
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User select sublimit details in Maintenance screen Request for financing
And User click repayment plan in Maintenance screen Request for financing
And User enter no of payments in repayment plan
#And User Click on Ok button in Success Pop up Menu
And User enter pay every in repayment plan
And User Validate the Maturity Date in repayment plan

@AT_RF_064_01
Scenario: TSR - AIB180044
Given navigate to FMS param application and login with valid credentials
And User Click FMS parameter Main Menu
And User click purpose of Financing Main Menu
And User Click the Maintenance Screen In purpose of Financing
And User_482 Update Test data set for AT_RF_064
And User enter the code in Maintenance Screen under purpose of Financing sub menu
And User enter additional number in Maintenance Screen under purpose of Financing sub menu
And User enter description in Maintenance Screen under purpose of Financing sub menu 
And User click product class option in Maintenance Screen under purpose of Financing sub menu
And User click add icon in product class option
And User User add product class code in product class option
And User click save button in Maintenance Screen under purpose of Financing sub menu
And User click ok button in Waring popup 
And User click ok button in Information Pop up
And User click approve Screen in purpose of Financing sub menu
And User search code in approve screen purpose of Financing
And User Select searched record in approve screen purpose of Financing
And User click approve button in selected record purpose of Financing
And User click ok button in Waring popup
And User click ok button in Information Pop up

@AT_RF_064_02
Scenario: Validate Purpose of Financing Record refelected in Application
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
And User_482 Update Test data set for AT_RF_064
And User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN
And User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Search Product Class in Limit Details Pop up Menu
And User Validate the created purpose of financing record reflected in application 

@AT_RF_068
Scenario: TSR - SUPT170524
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User_482 click search icon in Maintenance screen Request for financing
And User Click and search final approval record in maintenance screen
And User Select searched record in Maintenance screen Request for financing
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And Open Disburment or Sublimit record
And User Validate Down payment percentage In Limit details contains decimal value
And User Validate Down payment Amount In Limit details contains decimal value
And User Validate Total facility Value In Limit details contains decimal value
And User Validate Down payment to Vendor percentage In Limit details contains decimal value
And User Validate Down payment to Vendor In Limit details contains decimal value
And User Validate Total Down payment percentage In Limit details contains decimal value
And User Validate Total Down payment Value In Limit details contains decimal value
And User Validate floor rate percentage key In Limit details contains decimal value
And User Validate sub limit lower limit percentage key In Limit details contains decimal value
And User Validate sub limit lower limit amount key In Limit details contains decimal value
And User Validate Amounts Utilized In Limit details contains decimal value
And User Validate Amounts Current Outstanding In Limit details contains decimal value
And User Validate Amounts Un Utilized In Limit details contains decimal value
And User Validate Amounts In Limit details contains decimal value
And User Validate New Global Limit In Limit details contains decimal value
And User Validate Total Global Limit In Limit details contains decimal value
And User Validate Margin New Value In Limit details contains decimal value
And User Validate Margin Approved In Limit details contains decimal value
And User Validate Total Existing In Limit details contains decimal value
And User Validate Total New In Limit details contains decimal value
And User Validate Total Approved In Limit details contains decimal value
And User Validate CV Value In Limit details contains decimal value

# blocked , weight field does not allow decimal value
@AT_RF_121
Scenario: MFI190058 - Grade Evaluation Factors weight--System is not taking one figure with decimal value
Given navigate to FMS param application and login with valid credentials
And User Click FMS parameter Main Menu
And User Click Grade Evaluation Factors Sub Menu
And User_482 Update Test data set for AT_RF_121 
And User Click Maintenance Screen In Grade Evaluation Factor
And User Validate Weight field should accept decimal value

@AT_RF_164
Scenario: To check the new modification @ FMS Modification in Request for Financing Screen.
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update Test data set for AT_RF_164
And User_482 Select Application For field in Maintenace Screen under WIRAK Application
And User_482 enter the CIF No in main info tab under WIRAK Application
And User_482 enter the facility type in main info tab under WIRAK Application
And User_482 enter the country of financing in main info tab under WIRAK Application
And User_482 clicks on the additional details tab under WIRAK Application	
And User_482 Enter total value under additional details tab in WIFAK Application
And User_482 click Limit Details tab in WIFAK Application
And User_482 click add icon in limit details under WIFAK Application
And User_482 select the product class in limit details under WIFAK Application
And User_482 select the floating rate in limit details under WIFAK Application
And User_482 enter the floating rate periodicity in limit details under WIFAK Application
And User_482 select the floating rate periodicity type in limit details under WIFAK Application

@AT_RF_166
Scenario: To check the new modification @ FMS Modification in Request for Financing Screen.
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update Test data set for AT_RF_166
And User_482 Select Application For field in Maintenace Screen under WIRAK Application
And User_482 enter the CIF No in main info tab under WIRAK Application
And User_482 enter the facility type in main info tab under WIRAK Application
And User_482 enter the country of financing in main info tab under WIRAK Application
And User_482 enter facility rating in main info tab under WIRAK Application
And User_482 clicks on the additional details tab under WIRAK Application	
And User_482 Enter total value under additional details tab in WIFAK Application
And User_482 Enter offer Expiration in Additional details under WIFAK Application
And User_482 click Limit Details tab in WIFAK Application
And User_482 click add icon in limit details under WIFAK Application
And User_482 select the product class in limit details under WIFAK Application
And User_482 check clean checkbox options in limit details under WIFAK Application
And User_482 select the floating rate in limit details under WIFAK Application
And User_482 enter the floating rate periodicity in limit details under WIFAK Application
And User_482 select the floating rate periodicity type in limit details under WIFAK Application Approve screen
And User_482 click add icon in limit details popup under WIFAK Application
And User_482 click document details tab under WIFAK Application
And User_482 enter solicitor name to select from look up in document details under WIFAK Application 
And User_482 enter Estimator name to select from look up in document details under WIFAK Application
And User_482 click Maininformation tab in WIFAK Application
And User_482 click save button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Get the Code in Success Pop up Menu under WIFAK Application1
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click Validate button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click close icon in sent alert under WIFAK Application
And User_482 update Test data set for AT_RF_166
And User_482 Click Approve Level 1 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 1 screen in Application for financial facilities
And User_482 Select searched record in Approve level 1 screen Application for financial facilities
And User_482 click Limit Details in Approve level 1 under WIFAK Application
And User_482 open product class record in Limit details Approve level 1 under WIFAK Application
And User_482 validate Floating rate code in Limit details popup Approve level 1 under WIFAK Application
And User_482 Validate Floating rate name in Limit details popup Approve level 1 under WIFAK Application