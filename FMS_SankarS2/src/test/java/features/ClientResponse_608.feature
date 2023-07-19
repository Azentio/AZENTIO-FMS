Feature: To check the Client Response Feature

## FMS Param --> Facility type --> update after approve --> Facility Details tab --> STP facility req
@AT_CR_005
@AT_CR_005_Param
Scenario: Check the new filds are available at the Customer Response screens 

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_CR_005
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Facility Type feature
And User_608 clicks on the update after approve menu in Facility type
And User_608 enter the code value in update after approve menu
And User_608 double click on the retrieved data in update after approve menu
And User_608 clicks on the facility details tab in update after approve
And User_608 clicks on the STP Facility Requirements option
And User_608 check the Customer Grading flag
And User_608 check the Overwrite Grading flag
And User_608 check the Credit Review flag
And User_608 check the Committee Approval flag
And User_608 check the Credit Authorization flag
And User_608 check the Issue Facility Offer flag
And User_608 uncheck the Client Response flag
And User_608 uncheck the Document Validation flag
And User_608 uncheck the Final Approval flag
And User_608 uncheck the Create Active Facility If Within Limits flag
And User_608 uncheck the Automatically Approve Facility If Within Limits flag
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type

@AT_CR_005
@AT_CR_005_Core
Scenario: Check the new filds are available at the Customer Response screens

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_CR_005
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
And User_608 enter the Floating Rate in limit details
And User_608 enter the Floating Rate Periodicity in limit details
And User_608 select the Floating Rate Periodicity type in limit details
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for Client Response Feature
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_CR_005
And User_608 enter the reference code in Approve level1
And User_608 validate the Application reference code is should be displayed in Approve level1
And User_608 select the Application reference code in Approve level1
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
And User_608 click the Client Response menu under WIFAK Application
And User_608 enter the reference code in searchgrid under Client Response
And User_608 double click the reference code in searchgrid under Client Response
And User_608 click the limit details tab under Client Response
And User_608 double click the product class row under limit details tab in Client Response
And User_608 validate the product class Floating Rate under limit details in Client Response
And User_608 validate the product class Floating Rate Periodicity under limit details in Client Response
And User_608 validate the product class Floating Rate Type under limit details in Client Response


@AT_CR_006
Scenario: Client Response

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_CR_006
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
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for Client Response Feature
And User_608 close the maintanance screen under Application for financial facility in WIFAK
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_CR_006
And User_608 enter the reference code in Approve level1
And User_608 validate the Application reference code is should be displayed in Approve level1
And User_608 select the Application reference code in Approve level1
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
And User_608 click the Client Response menu under WIFAK Application
And User_608 enter the reference code in searchgrid under Client Response
And User_608 double click the reference code in searchgrid under Client Response
When User_608 click the Reject button under Client Response menu in WIFAK
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 clicks on the search button in Application for financial facility main screen
And User_608 enter the reference code under Application for financial facility maintanance in WIFAK
And User_608 double click searched record in Application for financial facility main screen
And User_608 validate the status in Application for financial facility main screen






















