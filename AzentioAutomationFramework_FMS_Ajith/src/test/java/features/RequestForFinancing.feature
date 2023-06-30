Feature: Testing the Functionality of Request for financing
@AT_RF_008
Scenario: MFI190234 - Request for Financing & Application --->Limit Details-->Repayment Plan, Maturity dates not changing properly
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
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
Scenario: MFI190234 - Request for Financing & Application --->Limit Details-->Repayment Plan, Maturity dates not changing properly
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
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
# blocked , weight field allow decimal value
@AT_RF_121
Scenario: MFI190058 - Grade Evaluation Factors weight--System is not taking one figure with decimal value
Given navigate to FMS param application and login with valid credentials
And User Click FMS parameter Main Menu
And User Click Grade Evaluation Factors Sub Menu
And User Click Maintenance Screen In Grade Evaluation Factor
And User Validate Weight field should accept decimal value
#blocked due all user able to display the record
@AT_RF_120
Scenario: MFI190065 - Request for financing - Facility Application is not flowing to Approval Committee
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN
And User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Search Product Class in Limit Details Pop up Menu
And User Enter the Margin value in New Tab Field in Limit Details Pop up Menu
And User Click on Add button in Limit Details Pop up
And User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User Click on Validate button under Maintenance screen in REQUEST FOR FINANCIN
And User_482 Click on Ok button in Confirm Pop up Menu
And User Click on Yes button in Confirm Pop up Menu
And User Get the Code in Success Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User Click on Approve Level 1 under REQUEST FOR FINANCIN
And User Search the Code in Approve Level 1 under REQUEST FOR FINANCIN
And User Select the Searched Code in Approve Level 1 under REQUEST FOR FINANCIN
And User Click on Customer Grading and Recommendations in Approve Level 1 under REQUEST FOR FINANCIN
And User Select the Decision Field as Forward and Approval Committee in Customer Grading and Recommendations under Approve Level 1
And User Select the Approval Committee as Investment Committee in Customer Grading and Recommendations under Approve Level 1
And User Click on Approve button in Customer Grading and Recommendations under Approve Level 1
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User Click on Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN

@AT_RF_119_01
Scenario: Uncheck the approval committe check box in facility type 
Given navigate to FMS param application and login with valid credentials
And User Click FMS parameter Main Menu
And User Click Facility Type Sub Menu
And User click update after approve Sub Menu
And User Search facility type in Facility Type Sub Menu
And User Select Searched Facility type record
And User click facilty details tab
And User click STP facility Requirements
And User un check committe approval 
And User click update button in facility type record
And User click approve submenu in facility type
And User Search facility type in Approve screen Facility type
And User Select Searched in Approve screen Facility type
And User click approve button in Approve screen Facility type

@AT_RF_119_02
Scenario: TSR-BTII170105
Given User Launch the CSM  Application
And User click request Main Menu
And User click request application Sub Menu
And User click Baj Application
#And User click Maintenace screen in Baj Application
#And User Enter CIF No in Baj Application Maintenace screen
#And User Enter facility type in Baj Application Maintenace screen
#And User Enter the Country of Financing in Baj Application Maintenace screen
#And User Validate Baj Application Record
And User navigate to Approve screen in Baj Application
And User Search the created record in maintenance screen
And User Select the created record in maintenance screen
And User click approve button in approve screen 
And User click Request Management sub menu
And User navigate management process batch 
And User Search the created record in management process batch
And User Select the created record in management process batch
And User click process button in management process batch
And User click ok button in sucess pop up

# blocked test case
#@AT_RF_119_03
#Scenario: User approve the faciliy application in FMS application ,record created in csm application
#Given navigate to FMS application and login with valid credentials
#And User click Baj Application Menu
#And User click Application in Baj Application Menu
#And User click Application for financial facilities in Application Sub menu
#And User click Maintenance Screen In Application Sub menu
#And User search and select the facility record created in CSM application
#And User Enter the additional reference number in Maintenance Screen under Application Sub menu
#And User click Validate button in Maintenance Screen under Application Sub menu
#And User click ok button in warning popup in Maintenance Screen under Application Sub menu
#And User click yes button in do you want to proceed option under post approval pop up screen
#And User Store application facility request number in Sucess pop up
#And User click ok button in sucess pop up under Maintenance Screen Application
#And User click approval level 1 in Application for financial facilities under Baj application
#And User search and select the facility application in approval level 1 screen under baj application
#And User Select Decision as forward in Approve level 1 recommendation under financial facility application record
#And User click submit button in Approve level 1 under financial facility application record
#And User click ok button in warning popup in Approve level 1 under financial facility application record
#And User click yes button in do you want to proceed option in Approve level 1 under financial facility application record
#And User click ok button in Sucess pop up under approval level 1 under Baj application
#And User click approval level 2 in Application for financial facilities under Baj application
#And User search and select the facility application in approval level 2 screen under baj application
#And User Select Decision as forward in Approve level 2 recommendation under financial facility application record
#And User click submit button in Approve level 2 under financial facility application record
#And User click ok button in warning popup in Approve level 2 under financial facility application record
#And User click yes button in do you want to proceed option in Approve level 2 under financial facility application record
#And User click ok button in Sucess pop up under approval level 2 under Baj application
#And User click approval level 3in Application for financial facilities under Baj application
#And User search and select the facility application in approval level 3 screen under baj application
#And User Select Decision as forward in Approve level 3 recommendation under financial facility application record
#And User click submit button in Approve level 3 under financial facility application record
#And User click ok button in warning popup in Approve level 3 under financial facility application record
#And User click yes button in do you want to proceed option in Approve level 3 under financial facility application record
#And User click ok button in Sucess pop up under approval level 3 under Baj application
#And User click approval committee recommendations screen under Baj application
#And User search and select the facility application in approval committee recommendations screen under Baj application
#And User click additional details tab in selected facility application under approval committee recommendation Baj application
#And User Validate BM recommendation screen in selected facility application under approval committee recommendation Baj application

@AT_RF_164
Scenario: To check the new modification @ FMS Modification in Request for Financing Screen.
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_AFF_024
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
And User_482 update test data set for AT_AFF_024
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
And User_482 Get the Code in Success Pop up Menu under WIFAK Application
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click Validate button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click close icon in sent alert under WIFAK Application
And User_482 Click Approve Level 1 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 1 screen in Application for financial facilities
And User_482 Select searched record in Approve level 1 screen Application for financial facilities
And User_482 click Limit Details in Approve level 1 under WIFAK Application
And User_482 open product class record in Limit details Approve level 1 under WIFAK Application
And User_482 validate Floating rate code in Limit details popup Approve level 1 under WIFAK Application
And User_482 Validate Floating rate name in Limit details popup Approve level 1 under WIFAK Application



