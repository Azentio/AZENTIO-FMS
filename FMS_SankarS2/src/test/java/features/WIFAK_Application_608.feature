Feature: To check the WIFAK Application Features

@AT_AFF_036
Scenario: ABSAI190084 - Floating Yield Issue at FMS

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AFF_036
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as new facility
And User_608 enter the CIF No in main info tab
And User_608 enter the facility type in main info tab
And User_608 enter the country of financing in main info tab
And User_608 enter the facility rating in main info tab
And User_608 clicks on the additional details tab
And User_608 enter the total value in additional info tab
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 clicks the add new record button in limit details tab
And User_608 enter the product class
Then User_608 Validate the floating rate with yield details


@AT_AFF_040
Scenario: MFI190130 - History Log is empty for Application for facility--Approval/Reject option

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AFF_040
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks on the Approve level1 link
And User_608 search the code
And User_608 double click searched record
Then User_608 clicks on the History log tap


@AT_RF_098_User_VAK
Scenario: TSR - BTII170041

Given User_VAK navigate to FMS application and login with valid credentials
And User_VAK get the test data for test case AT_RF_098_User_VAK
And User_VAK clicks on the WIFAK_Application first link
And User_VAK clicks on the WIFAK_Application second link
And User_VAK clicks on the approval committe recommedation menu
And User_VAK clicks on the clear button in approval committe recommedations menu
And User_VAK double click on the any one record in approval committe recommedations menu
And User_VAK clicks on the Recommend button in approval committe recommedations menu
And User_VAK click the User_VAK recommended by name in recommend box
And User_VAK select the recommendation as approve in recommend box
And User_VAK click the comment code lookup option in recommend box
And User_VAK double click the first row of comment code lookup in recommend box
And User_VAK clicks the more comments button in recommend box
And User_VAK enter the some comments in more comments
And User_VAK click the Ok button in more comments
When User_VAK click the Ok button in recommend box


@AT_RF_098_User_608
Scenario: TSR - BTII170041
Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_098_User_608
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 clicks on the search button in Application for financial facility main screen
And User_608 search the code in Application for financial facility main screen
And User_608 double click searched record in Application for financial facility main screen
And User_608 clicks on the Approval committee button
And User_608 click the User1 name in Recommented by column
And User_608 clicks on the more comments button
Then User_608 validate the more comments text in input field


#//No data available in FMSCore
@AT_RF_100
Scenario: TSR-AMANAUPG170045

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_100
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as decrease in main screen
And User_608 enter the input as Existing Facility Ref in main screen
And User_608 enter the facility rating in main info tab
And User_608 clicks on the additional details tab
And User_608 enter the total value under additional info tab
And User_608 validate the finance amount should be decresed based on total value
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User_608 double click on the product class under limit details
And User_608 click the clean flag under product calss in limit details tab
And User_608 click the edit button under product class in limit details tab
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 enter the reference code in Approve level1
And User_608 double click on the retrieved reference code in Approve level1
And User_608 select the Approve level1 decision as Approve
When User_608 clicks on the Approve level1 submit button
Then User_608 clicks the Approve Level2 menu under Application for financial facilities
And User_608 enter the reference code in Approve level2
And User_608 double click on the retrieved reference code in Approve level2
And User_608 select the Approve level2 decision as Approve
When User_608 clicks on the Approve level2 submit button
Then User_608 clicks the Approve Level3 menu under Application for financial facilities
And User_608 enter the reference code in Approve level3
And User_608 double click on the retrieved reference code in Approve level3
And User_608 select the Approve level3 decision as Approve
When User_608 clicks on the Approve level3 submit button



@AT_RF_102
Scenario: TSR-AMANAUPG170105

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_102
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as new facility
And User_608 enter the CIF No in main info tab
And User_608 enter the facility type in main info tab
And User_608 enter the country of financing in main info tab
And User_608 enter the facility rating in main info tab
And User_608 clicks on the additional details tab
And User_608 enter the total value in additional info tab
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 clicks the add new record button in limit details tab
And User_608 select the Item in limit Details
And User_608 select the Maturity date in limit Details
And User_608 enter the Margin rate in limit Details
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 enter the reference code in Approve level1
And User_608 double click on the retrieved reference code in Approve level1
And User_608 select the Approve level1 decision as Approve
When User_608 clicks on the Approve level1 submit button
Then User_608 clicks the Approve Level2 menu under Application for financial facilities
And User_608 enter the reference code in Approve level2
And User_608 double click on the retrieved reference code in Approve level2
And User_608 select the Approve level2 decision as Approve
When User_608 clicks on the Approve level2 submit button
Then User_608 clicks the Approve Level3 menu under Application for financial facilities
And User_608 enter the reference code in Approve level3
And User_608 double click on the retrieved reference code in Approve level3
And User_608 select the Approve level3 decision as Approve
When User_608 clicks on the Approve level3 submit button



@AT_FM_058
Scenario: Create a facility from Request for Finance

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_058
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as new facility
And User_608 enter the CIF No in main info tab
And User_608 enter the facility type in main info tab
And User_608 enter the country of financing in main info tab
And User_608 enter the facility rating in main info tab
And User_608 clicks on the additional details tab
And User_608 enter the total value in additional info tab
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 clicks the add new record button in limit details tab
And User_608 enter the product class details
And User_608 clicks on the product class add button
And User_608 clicks the save button
And User_608 select the limit details product class row in under limit details
And User_608 click the Repayment Plan button under limit Details in Application Financial Facility Maintanance
And User_608 user Re_enter the no of payments in Repayment Plan tab Application Financial Facility Maintanance
And User_608 click the Create Schedule button in Repayment Plan tab under Application Financial Facility Maintanance
And User_608 validate the Installment Vat Amount in available in Repayment Plan tab under Application Financial Facility Maintanance
And User_608 click the Save button in Repayment Plan tab under Application Financial Facility Maintanance
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks on the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 enter the reference code in Approve level1
And User_608 double click on the retrieved reference code in Approve level1
And User_608 select the Approve level1 decision as Forward
And User_608 select the Approve level1 decision Forward to Approve level3
When User_608 clicks on the Approve level1 submit button
Then User_608 clicks the Approve Level3 menu under Application for financial facilities
And User_608 enter the reference code in Approve level3
And User_608 double click on the retrieved reference code in Approve level3
And User_608 select the Approve level3 decision as Approve
When User_608 clicks on the Approve level3 submit button
#Then User_608 click the Facilities Management menu under WIFAK Application
#And User_608 click the Maintanance in Facilities Management under WIFAK Application
#And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
#And User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
#And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
#And User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
#And User_608 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
#And User_608 click the Repayment plan button in Facilities Management Maintanance under WIFAK Application
#And User_608 click the Schedule details tab in Repayment plan tab in Facilities Management Maintanance under WIFAK Application
#Then User_608 validate Installment Vat amount should be displayed Repayment plan tab under Facilities Management Maintanance











