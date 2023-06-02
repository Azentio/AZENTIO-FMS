Feature: Testing the Functionality of Request for financing
@AT_RF_008
Scenario: MFI190234 - Request for Financing & Application --->Limit Details-->Repayment Plan, Maturity dates not changing properly
Given navigate to FMS application and login with valid credentials
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
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
And User Click on Ok button in Confirm Pop up Menu
And User Get the Code in Success Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User click search icon in Maintenance screen Request for financing
And User Search code in Maintenance screen Request for financing
And User Select searched record in Maintenance screen Request for financing
And User Click on Ok button in Confirm Pop up Menu
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User select sublimit details in Maintenance screen Request for financing
And User click repayment plan in Maintenance screen Request for financing
And User enter no of payments in repayment plan
And User Click on Ok button in Success Pop up Menu
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
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
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
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User click search icon in Maintenance screen Request for financing
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




