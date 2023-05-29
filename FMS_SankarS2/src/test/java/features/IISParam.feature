Feature: To test the IIS Param Application

@665923_IISParam
Scenario: IIS Param Application

Given navigate to IIS param application and login with valid credentials
And get the test data for test case 665923_IISParam
And User clicks on the parameter feature in IIS Param application
And User clicks on the product class module uder parameter feature
And User clicks on the maintanance screen under product class module
And User clicks on the search button in maintanance under product class
And User enter the class code in maintanance under product class
And User double click on the retrived data in maitanance under product class
And User clicks on the additional information tab in maitanance under product class
And User clicks on the repayment plan tab under additional information tab
And User enter the value in number of payments under repayment plan tab
And User select the dropdown in number of payments under repayment plan tab
Then User clicks save the button in maintanance under product class

@665923_FMSCore
Scenario: IIS Param Application

Given navigate to FMS application and login with valid credentials
And get the test data for test case 665923_FMSCore
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User select the application for dropdown as new facility
And User enter the CIF No in main info tab
And User enter the facility type in main info tab
And User enter the country of financing in main info tab
And User enter the facility rating in main info tab
And User clicks on the additional details tab
And User enter the total value in additional info tab
And User enter the expire date in additional info tab
And User clicks the limit details tab
And User clicks the add new record button in limit details tab
And User enter the product class details
And User clicks on the add button
And User clicks the save button
And User clicks the limit details first row
And User clicks the repayment plan button under limit details tab
Then User validate the Rounding factor dropdown
Then User validate the No of payments input