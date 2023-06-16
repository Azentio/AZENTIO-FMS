Feature: To check the Facilities Management Feature

@AT_FM_035
Scenario: BMO180223 - Exception Error during Facility Opening from Search Field and Save the New Facility

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_035_FMSCore
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks the Facilities Management feature under Request Financing
And User_608 clicks the Maintanance in Facilities Management under Request Financing
And User_608 click the search button in maintanance screen under Facilities Management
And User_608 search the facility with CIF number in maintanance screen under Facilities Management
Then User_608 retrieve the facility in maintanance screen under Facilities Management



