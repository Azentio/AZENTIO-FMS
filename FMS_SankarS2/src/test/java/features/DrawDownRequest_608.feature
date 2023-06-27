Feature: User_608 to validate the Draw down request features

@AT_DDR_020
Scenario: Define the value in the new added field

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_DDR_020
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
And User_608 enter the Down Payment percentage in additional info tab
And User_608 clicks the limit details tab
And User_608 clicks the add new record button in limit details tab
And User_608 enter the product class details
And User_608 enter the Down Payment percentage under product class details tab
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_DDR_020
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
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 validate the Down Payment should be correctly in WIFAK Facilities Management Maintanance
And User_608 validate the Down Payment percentage should be correctly in WIFAK Facilities Management Maintanance
And User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_608 double click the limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_608 validate the limit details product class Down Payment should be correctly in WIFAK Facilities Management Maintanance
And User_608 validate the limit details product class Down Payment percentage should be correctly in WIFAK Facilities Management Maintanance



@AT_DDR_021
Scenario: Define the value in the new added field

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_DDR_021
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 select the Reason for submission under main screen in Request for Financing
And User_608 enter the CIF no in main screen under Request for Financing
And User_608 enter the facility type in main screen under Request for Financing
And User_608 enter the total limit in main screen under Request for Financing
And User_608 enter the Down Payment Percentage in main screen under Request for Financing
And User_608 move to the sublimit tab in main screen under Request for Financing
#And User_608 click the add new button in sublimit tab under main screen in Request for Financing
#And User_608 enter the product class in limit details tab under sublimit tab
#And User_608 enter the product class Down Payment Percentage in limit details tab under sublimit tab
#And User_608 click the add button in limit details tab under sublimit tab
#When User_608 click the Save button in main screen under Request for Financing
#And User_608 click the Validate button in main screen Request for Financing
#Then User_608 click the approve level1 under Request for Financing
#And User_608 enter the request code in approve level1 under Request for Financing
#And User_608 double click on the first row in approve level1 under Request for Financing







