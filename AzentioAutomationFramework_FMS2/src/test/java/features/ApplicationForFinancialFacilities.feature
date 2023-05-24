Feature: To Test the FMS application
@934645
Scenario: SBI190056 - Error while approving an application - CC1RF00P1
#This test case also cover the functionality of test case no 947432
Given navigate to FMS application2 and login with valid credentials
And Update test data for test case no 934645
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User select the application for dropdown as new facility
And User enter the CIF No in main info tab
And User enter the facility type in main info tab
And User enter the country of financing in main info tab
And User enter the facility rating in main info tab
And User clicks on the additinal details tab
And User enter the total value in additional info tab
And User enter the expire date in additional info tab
And User clicks the limit details tab
And User clicks the add new record button in limit details tab
And User enter the product class details
And User retrive the one account number
And User clicks on the add button
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks the validate button

@827877
Scenario: ABEI190241 - Customization and Missing Element Issue on FMS
#Prerequestics: Make sure the Facility rating field as optional field
Given navigate to FMS application2 and login with valid credentials
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User Click on Advanced Options under Maintenance Screen
And User Click on Settings under Advanced Options in Maintenance Screen
And User Click on Icon in Facility Rating under Settings Screen
And User Click on Maintenance in Icon under Settings Screen
And User Click on Required Field in Customization Details For Facility Rating PopUp Menu
And User Click on Save Button under PopUp Menu
And User Click on Ok Button in Information PopUp Menu
And User Click on Close Button under Customization Details For Facility Rating PopUp Menu
And User Click on Icon in Facility Rating under Settings Screen
And User Click on Approve in Icon under Settings Screen
And User Click on Approve in Customization Details For Facility Rating PopUp Menu
And User Click on Ok Button in Information PopUp Menu
And User Click on Close Button under Customization Details For Facility Rating PopUp Menu
And User Click on Maintenance under Application For Financial Facilities
And User Click on Ok Button in Warning PopUp Menu
Then User Validate the Facility Rating Field is Displayed as Required


@856961
Scenario: ABSAI190175 - FMS_Application for Financial Facility > Maintenance > Final Validate - NullPoint Exception error
Given navigate to FMS application2 and login with valid credentials
And Update test data for test case no 856961
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User select the application for dropdown as new facility
And User enter the CIF No in main info tab
And User enter the facility type in main info tab
And User enter the country of financing in main info tab
And User enter the facility rating in main info tab
And User clicks on the additinal details tab
And User enter the total value in additional info tab
And User enter the expire date in additional info tab
And User clicks the limit details tab
And User clicks the add new record button in limit details tab
And User enter the product class details
And User retrive the one account number
And User clicks on the add button
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks the validate button


@834957
Scenario: Check a new field “Marketed By” is added under the Main Information Tab in Application for Financial Facilities – Maintenance screen
Given navigate to FMS application2 and login with valid credentials
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And Validate Marketed by field is displayed in Facility type details section




