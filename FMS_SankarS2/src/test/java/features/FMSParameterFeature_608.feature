Feature: User_608 to check FMS Parameter Features

@AT_FP_001
Scenario: SBI190240 - Floating Rate Issue and Rate Periodicity is Blank

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FP_001
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
