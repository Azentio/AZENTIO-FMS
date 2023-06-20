Feature: User_608 to validate the Facilities Management features

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
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_608 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_608 click the Repayment plan button in Facilities Management Maintanance under WIFAK Application
And User_608 click the Schedule details tab in Repayment plan tab in Facilities Management Maintanance under WIFAK Application
Then User_608 validate Installment Vat amount should be displayed Repayment plan tab under Facilities Management Maintanance



@AT_FM_102
Scenario: Check when the charge code is created with the flag “Charge per installment” checked, then fields Percentage, VAT code, VAT amount and transaction template is not applicable and user can define the charge amount in facility currency as per existing functiON

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_102
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
And User_608 retrive the Account number in limit details
And User_608 clicks on the product class add button
And User_608 clicks on the Charges details button under limit details
And User_608 click the collect charges per installment on PI approve flag
And User_608 click the collect charges on deal approve flag
And User_608 click the collect at facility approval flag
And User_608 click the Ok button in Charges details under limit details
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


@AT_FM_103
Scenario: Check the changes in ‘Charges at deal plan’ and ‘repayment plan’ is added under the Facility Management screen

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_103
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
And User_608 retrive the Account number in limit details
And User_608 clicks on the product class add button
And User_608 clicks on the Charges details button under limit details
And User_608 click the collect charges per installment on PI approve flag
And User_608 click the collect charges on deal approve flag
And User_608 click the collect at facility approval flag
And User_608 click the Ok button in Charges details under limit details
And User_608 clicks the save button
And User_608 select the limit details product class row in under limit details
And User_608 click the Repayment Plan button under limit Details in Application Financial Facility Maintanance
And User_608 user Re_enter the no of payments in Repayment Plan tab Application Financial Facility Maintanance
And User_608 click the Create Schedule button in Repayment Plan tab under Application Financial Facility Maintanance
And User_608 click the Save button in Repayment Plan tab under Application Financial Facility Maintanance
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
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
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_608 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_608 click the Repayment plan button in Facilities Management Maintanance under WIFAK Application



