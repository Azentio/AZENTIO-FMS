Feature: User_608 to validate the Facilities Management features


@AT_FM_043
@AT_FM_043_FMSParam
Scenario: JAIZ150014 INABILITY TO CRAETE A LIMIT ON APPROVE FACILITY

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_FM_043
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
And User_608 uncheck the Committee Approval flag
And User_608 select the member as atleast one under Committee approval flag
And User_608 check the Credit Authorization flag
And User_608 check the Client Response flag
And User_608 check the Document Validation flag
And User_608 check the Final Approval flag
And User_608 check the Create Active Facility If Within Limits flag
And User_608 Check the Automatically Approve Facility If Within Limits flag
And User_608 check the Issue Facility Offer flag
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type

@AT_FM_043
@AT_FM_043_FMSCore
Scenario: JAIZ150014 INABILITY TO CRAETE A LIMIT ON APPROVE FACILITY

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_043
And User_608 clear the caches in FMS Application
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 select the Reason for submission under main screen in Request for Financing
And User_608 enter the CIF no in main screen under Request for Financing
And User_608 enter the facility type in main screen under Request for Financing
And User_608 enter the total limit in main screen under Request for Financing
And User_608 move to the sublimit tab in main screen under Request for Financing
And User_608 click the add new button in sublimit tab under main screen in Request for Financing
And User_608 enter the product class in limit details tab under sublimit tab
And User_608 enter the margin value in limit details tab under sublimit tab
And User_608 click the add button in limit details tab under sublimit tab
When User_608 click the Save button in main screen under Request for Financing
And User_608 click the Validate button in main screen Request for Financing
Then User_608 click the approve level1 under Request for Financing
And User_608 get the test data for test case AT_FM_043
And User_608 enter the request code in approve level1 under Request for Financing
And User_608 double click on the first row in approve level1 under Request for Financing
And User_608 move to customer grading tab in approve level1 under Request for Financing
And User_608 select the approve level1 recommendation decision as forward in approve level1 under Request for Financing
And User_608 select the decision forward to as approval committee in approve level1 under Request for Financing
And User_608 select the approval committee in approve level1 under Request for Financing
And User_608 click the Approve button in approve level1 under Request for Financing
Then User_608 click the Approval committee recommendation under Request for Financing
And User_608 enter the code in Approval committee recommendation under Request for Financing
And User_608 double click on the first row in Approval committee recommendation under Request for Financing
And User_608 move to credit committee recommendation tab in approval committee under Request for Financing
And User_608 click the Recommendation division in credit committee under approval committee
And User_608 click the plus icon in Recommendation division under credit committee
And User_608 select the Recommendation dropdown in Recommendation division under credit committee
When User_608 click the Recommendation button under Approval committee recommendation


@AT_FM_035
Scenario: BMO180223 - Exception Error during Facility Opening from Search Field and Save the New Facility

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_035_FMSCore
And User_608 clear the caches in FMS Application
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks the Facilities Management feature under Request Financing
And User_608 clicks the Maintanance in Facilities Management under Request Financing
And User_608 click the search button in maintanance screen under Facilities Management
And User_608 search the facility with CIF number in maintanance screen under Facilities Management
Then User_608 retrieve the facility in maintanance screen under Facilities Management


@AT_FM_038
@AT_FM_038_FMSParam
Scenario: Uncheck the Committe approval flag in FMS Param Facility type

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_FM_038
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
And User_608 uncheck the Committee Approval flag
And User_608 check the Credit Authorization flag
And User_608 check the Client Response flag
And User_608 check the Document Validation flag
And User_608 check the Final Approval flag
And User_608 check the Create Active Facility If Within Limits flag
And User_608 Check the Automatically Approve Facility If Within Limits flag
And User_608 check the Issue Facility Offer flag
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type


@AT_FM_038
@AT_FM_038_FMSCore
Scenario: JAIZ150014 - INABILITY TO CRAETE A LIMIT ON APPROVE FACILITY

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_038
And User_608 clear the caches in FMS Application
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
And User_608 clicks on the validate button for Facilities Management
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_FM_038
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
And User_608 clicks on the Approval committe recommedations menu
And User_608 enter the Facility type in search grid under Approval committe recommedations
And User_608 double the first row in search grid under Approval committe recommedations
And User_608 click the Recommend button under Approval committe recommedations
And User_608 click the User recommended by name in approval committee user popup under Approval committe recommedations
And User_608 select the recommendation as approve in approval committee user popup under Approval committe recommedations
And User_608 click the OK button in approval committee user popup under Approval committe recommedations


@AT_FM_058
@AT_FM_058_FMSParam
Scenario: Check the All the flags in FMS Param Facility type

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_FM_038
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
And User_608 check the Client Response flag
And User_608 check the Document Validation flag
And User_608 check the Final Approval flag
And User_608 check the Create Active Facility If Within Limits flag
And User_608 Check the Automatically Approve Facility If Within Limits flag
And User_608 check the Issue Facility Offer flag
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type


@AT_FM_058
@AT_FM_058_FMSCore
Scenario: Create a facility from Request for Finance

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_058
And User_608 clear the caches in FMS Application
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
And User_608 clicks on the validate button for Facilities Management
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_FM_058
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



@AT_FM_059
@AT_FM_059_User_608
Scenario: Checking the Alert functionality at the level of Facilities Management screens

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_059
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
And User_608 clicks on the validate button and wait for Send Alert popup
And User_608 search the VAK user in search grid under Send Alert popup
And User_608 click the VAK User row in search grid under Send Alert popup
And User_608 click the Send button under Send Alert popup

@AT_FM_059
@AT_FM_059_User_VAK
Scenario: Checking the Alert functionality at the level of Facilities Management screens

Given User_VAK navigate to FMS application and login with valid credentials
And User_VAK Should be validate Alert popup is displayed
And User_VAK click the open items under approve alert popup
And User_VAK Click the Approve button under Approve item popup



@AT_FM_102
Scenario: Check when the charge code is created with the flag “Charge per installment” checked, then fields Percentage, VAT code, VAT amount and transaction template is not applicable and user can define the charge amount in facility currency as per existing functiON

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_102
And User_608 clear the caches in FMS Application
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
And User_608 clicks on the validate button for Facilities Management
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_FM_102
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
And User_608 clear the caches in FMS Application
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
And User_608 clicks on the validate button for Facilities Management
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_FM_103
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
And User_608 validate the Repayment plan No of Payments should be changed in Facilities Management Maintanance under WIFAK Application
And User_608 click the Schedule details tab in Repayment plan tab in Facilities Management Maintanance under WIFAK Application
And User_608 validate the Repayment plan schedule details should be displayed in Facilities Management Maintanance under WIFAK Application
And User_608 close the Repament plan tab in Facilities Management Maintanance under WIFAK Application
And User_608 click the Charges Details button in Facilities Management Maintanance under WIFAK Application
And User_608 validate the Collect at Fac approval flag should be checked in Facilities Management Maintanance under WIFAK Application
And User_608 validate the Collect charges per inst PI approve flag should be checked in Facilities Management Maintanance under WIFAK Application
And User_608 validate the Collect charges on Deal approve flag should be checked in Facilities Management Maintanance under WIFAK Application



@AT_FM_104
Scenario: Create the Facility and check the JV entries posted based on the transaction template

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_104
And User_608 clear the caches in FMS Application
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
And User_608 clicks on the validate button for Facilities Management
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_FM_104
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
And User_608 click the Journal voucher details button in Facilities Management Maintanance
Then User_608 validate Account details should be displayed in JV Details tab under Facilities Management Maintanance
Then User_608 validate Total Debit value should be displayed in JV Details tab under Facilities Management Maintanance
Then User_608 validate Total Credit value should be displayed in JV Details tab under Facilities Management Maintanance


@AT_FM_105
@AT_FM_105_FMSParam
Scenario: Check the modification changes in Facility Management screen

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_FM_105_FMSParam
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
And User_608 check the Client Response flag
And User_608 check the Document Validation flag
And User_608 check the Final Approval flag
And User_608 uncheck the Create Active Facility If Within Limits flag
And User_608 uncheck the Automatically Approve Facility If Within Limits flag
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type


@AT_FM_105
@AT_FM_105_FMSCore
Scenario: Check the modification changes in Facility Management screen

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_105_FMSCore
And User_608 clear the caches in FMS Application
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
And User_608 clicks on the validate button for Facilities Management
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_FM_105_FMSCore
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
And User_608 enter the Application Ref number in Maintanance under WIFAK Facilities Management
And User_608 validate Journal Voucher Details option should be visible in Maintanance under WIFAK Facilities Management 
And User_608 click the Documents Details tab in Maintanance under WIFAK Facilities Management
And User_608 enter the row1 Solicitor Date Sent under Document Details in Facilities Management Maintanance
And User_608 enter the row1 Solicitor Date Received under Document Details in Facilities Management Maintanance
And User_608 enter the row1 Estimator Date Sent under Document Details in Facilities Management Maintanance
And User_608 enter the row1 Estimator Date Received under Document Details in Facilities Management Maintanance
And User_608 enter the row1 Custodian Date Sent under Document Details in Facilities Management Maintanance
And User_608 enter the row2 Solicitor Date Sent under Document Details in Facilities Management Maintanance
And User_608 enter the row2 Solicitor Date Received under Document Details in Facilities Management Maintanance
And User_608 enter the row2 Estimator Date Sent under Document Details in Facilities Management Maintanance
And User_608 enter the row2 Estimator Date Received under Document Details in Facilities Management Maintanance
And User_608 enter the row2 Custodian Date Sent under Document Details in Facilities Management Maintanance
When User_608 click the Save Button under Maintanance under WIFAK Facilities Management
And User_608 click the Approve menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Approve screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Approve screen under WIFAK Facilities Management
And User_608 click the Approve button in Approve screen under WIFAK Facilities Management
And User_608 click the Update After Approve menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Update After Approve in WIFAK Facilities Management
And User_608 double click on the search grid first row in Update After Approve screen under WIFAK Facilities Management
And User_608 click the Facility Application tab in Update After Approve under WIFAK Facilities Management
And User_608 enter the facility rating under Facility Application tab in Update After Approve
And User_608 click the Save button in Update After Approve under WIFAK Facilities Management
And User_608 click the Query menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Query screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Query screen under WIFAK Facilities Management
And User_608 validate the Query menu status should be Active under WIFAK Facilities Management
And User_608 again click the Approve menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Approve screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Approve screen under WIFAK Facilities Management
And User_608 click the Approve button in Approve screen under WIFAK Facilities Management
And User_608 click the Suspend menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Suspend screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Suspend screen under WIFAK Facilities Management
And User_608 give the Suspend Reason in Suspend screen under WIFAK Facilities Management
And User_608 click the Suspend button in Suspend screen under WIFAK Facilities Management
And User_608 click the Reactivate menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Reactivate screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Reactivate screen under WIFAK Facilities Management
And User_608 click the Reactivate button in Reactivate screen under WIFAK Facilities Management
And User_608 again click the Approve menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Approve screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Approve screen under WIFAK Facilities Management
And User_608 click the Approve button in Approve screen under WIFAK Facilities Management
And User_608 click the Reverse menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Reverse screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Reverse screen under WIFAK Facilities Management
And User_608 click the Reverse button in Reverse screen under WIFAK Facilities Management
And User_608 click the Approve\Reject Reverse menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Approve\Reject Reverse screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Approve\Reject Reverse screen under WIFAK Facilities Management
And User_608 click the Reject Reverse button in Approve\Reject Reverse screen under WIFAK Facilities Management
And User_608 click the Cancel menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Cancel screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Cancel screen under WIFAK Facilities Management
And User_608 click the Cancel button in Cancel screen under WIFAK Facilities Management
And User_608 click the Approve\Reject Cancel menu under Facilities Management in WIFAK Application
And User_608 enter the Application Ref number in search grid under Approve\Reject Cancel screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Approve\Reject Cancel screen under WIFAK Facilities Management
And User_608 click the Approve Cancel button in Approve\Reject Cancel screen under WIFAK Facilities Management

