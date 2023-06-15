Feature: To test the IIS Param Application

@AT_RF_014_IISParam
Scenario: IIS Param Application

Given navigate to IIS param application and login with valid credentials
And User_608 get the test data for test case AT_RF_014_IISParam
And User_608 clicks on the parameter feature in IIS Param application
And User_608 clicks on the product class module uder parameter feature
And User_608 clicks on the maintanance screen under product class module
And User_608 clicks on the search button in maintanance under product class
And User_608 enter the class code in maintanance under product class
And User_608 double click on the retrived data in maitanance under product class
And User_608 clicks on the additional information tab in maitanance under product class
And User_608 clicks on the repayment plan tab under additional information tab
And User_608 enter the value in number of payments under repayment plan tab
And User_608 select the dropdown in number of payments under repayment plan tab
Then User_608 clicks save the button in maintanance under product class

@AT_RF_014_FMSCore
Scenario: IIS Param Application

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_014_FMSCore
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
And User_608 clicks on the add button
And User_608 clicks the save button
And User_608 clicks the limit details first row
And User_608 clicks the repayment plan button under limit details tab
Then User_608 validate the Rounding factor dropdown
Then User_608 validate the No of payments input