Feature: User_608 to validate the Draw down request features


#@AT_DDR_020 @AT_DDR_021 @AT_DDR_022 @AT_DDR_023 @AT_DDR_024
Scenario: FMS Parameter Facility Type --> STP Facilit Requirement all flags should be checked 

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_DDR_020
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
And User_608 check the Create Active Facility If Within Limits flag
And User_608 Check the Automatically Approve Facility If Within Limits flag
And User_608 move to facility reports tab in update after approve
And User_608 clicks on the search option in issue facility offer under facility reports
And User_608 double click on any one retrived data
And User_608 check the auto print flag under issue facility offer
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type

@AT_DDR_020
Scenario: Define the value in the new added field

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_DDR_020
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
And User_608 clear the caches in FMS Application
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
And User_608 click the add new button in sublimit tab under main screen in Request for Financing
And User_608 enter the product class in limit details tab under sublimit tab
And User_608 enter the product class Down Payment Percentage in limit details tab under sublimit tab
And User_608 click the add button in limit details tab under sublimit tab
When User_608 click the Save button in main screen under Request for Financing
And User_608 click the Validate button in main screen Request for Financing
Then User_608 click the approve level1 under Request for Financing
And User_608 get the test data for test case AT_DDR_021
And User_608 enter the request code in approve level1 under Request for Financing
And User_608 double click on the first row in approve level1 under Request for Financing
And User_608 validate the Down Payment percentage should be correctly in approve level1 under Request for Financing
And User_608 move to credit committee recommendation tab in approval committee under Request for Financing
And User_608 select the approve level1 recommendation decision as approve in approve level1 under Request for Financing
And User_608 click the Approve button in approve level1 under Request for Financing


@AT_DDR_022
Scenario: Check the values are defaulted in the Draw Down screen, and also check the fields are editable or not

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_DDR_022
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
And User_608 enter the Floating Rate in limit details
And User_608 enter the Floating Rate Periodicity in limit details
And User_608 select the Floating Rate Periodicity type in limit details
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_DDR_022
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
And User_608 Retrieve the Application Code value in Facilities Management Maintanance Screen under WIFAK Application
And User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_608 double click the limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_608 validate the limit details Floating Rate should be correctlty in WIFAK Facilities Management Maintanance
And User_608 validate the limit details Floating Rate Periodicity number should be correctlty in WIFAK Facilities Management Maintanance
And User_608 validate the limit details Floating Rate Periodicity type should be correctlty in WIFAK Facilities Management Maintanance
And User_608 click the Close button in limit details tab under WIFAK Facilities Management Maintanance
And User_608 clicks on the Draw Down request feature under WIFAK Application
And User_608 get the test data for test case AT_DDR_022
And User_608 clicks on the Maintanance under Draw Down request feature in WIFAK Application
And User_608 enter the Facility Reference in main screen under WIFAK Application Draw Down request
And User_608 select the draw down type in main screen under Draw Down request feature
And User_608 enter the Description in main screen under Draw Down request feature
And User_608 enter the value date in maintanance screen under WIFAK Application Draw Down request
And User_608 click on the Additional details tab in Draw Down request under WIFAK Application
And User_608 select the product class in Additional details tab under Draw Down request
And User_608 validate the Floating Rate displayed correctly in Additional details tab under Draw Down request
And User_608 validate the Floating Rate Periodicity displayed correctly in Additional details tab under Draw Down request


@AT_DDR_023
Scenario: Check the values are defaulted in the Draw Down screen, and also check the fields are editable or not

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_DDR_023
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
And User_608 enter the Floating Rate in limit details
And User_608 enter the Floating Rate Periodicity in limit details
And User_608 select the Floating Rate Periodicity type in limit details
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_DDR_023
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
And User_608 Retrieve the Application Code value in Facilities Management Maintanance Screen under WIFAK Application
And User_608 clicks on the Draw Down request feature under WIFAK Application
And User_608 clicks on the Maintanance under Draw Down request feature in WIFAK Application
And User_608 get the test data for test case AT_DDR_023
And User_608 enter the Facility Reference in main screen under WIFAK Application Draw Down request
And User_608 select the draw down type in main screen under Draw Down request feature
And User_608 enter the Description in main screen under Draw Down request feature
And User_608 enter the value date in maintanance screen under WIFAK Application Draw Down request
And User_608 click on the Additional details tab in Draw Down request under WIFAK Application
And User_608 select the product class in Additional details tab under Draw Down request
And User_608 validate the Floating Rate displayed correctly in Additional details tab under Draw Down request
And User_608 validate the Floating Rate Periodicity displayed correctly in Additional details tab under Draw Down request
When User_608 click the Save button in maintanance under Draw Down request
Then User_608 click on the Verify\Deny Menu under WIFAK Draw Down request
And User_608 get the test data for test case AT_DDR_023
And User_608 enter the DD code in Verify\Deny search grid under WIFAK Draw down request
And User_608 double click the DD code in Verify\Deny search grid under WIFAK Draw down request
And User_608 click the Verify button in Verify\Deny under WIFAK Draw down request
Then User_608 click the Approve\Reject menu under WIFAK Draw Down request
And User_608 enter the DD code in Approve\Reject search grid under WIFAK Draw down request
And User_608 double click the DD code in Approve\Reject search grid under WIFAK Draw down request
When User_608 click the Approve button in Approve\Reject under WIFAK Draw down request


@AT_DDR_024
Scenario: Draw down Request

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_DDR_024
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
And User_608 clicks on the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_DDR_024
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
And User_608 click the Clear button in Facilities Management Maintanance under WIFAK Application
And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 Retrieve the Application Code value in Facilities Management Maintanance Screen under WIFAK Application
And User_608 clicks on the Draw Down request feature under WIFAK Application
And User_608 clicks on the Maintanance under Draw Down request feature in WIFAK Application
And User_608 enter the Facility Reference in main screen under WIFAK Application Draw Down request
And User_608 select the draw down type in main screen under Draw Down request feature
And User_608 enter the Description in main screen under Draw Down request feature
And User_608 enter the value date in maintanance screen under WIFAK Application Draw Down request
And User_608 click on the Additional details tab in Draw Down request under WIFAK Application
And User_608 select the product class in Additional details tab under Draw Down request
When User_608 click the Save button in maintanance under Draw Down request
And User_608 get the test data for test case AT_DDR_024
And User_608 enter the Facility Reference in main screen under WIFAK Application Draw Down request
Then User_608 click on the Verify\Deny Menu under WIFAK Draw Down request
And User_608 enter the DD code in Verify\Deny search grid under WIFAK Draw down request
And User_608 double click the DD code in Verify\Deny search grid under WIFAK Draw down request
And User_608 click the Verify button in Verify\Deny under WIFAK Draw down request
Then User_608 click the Approve\Reject menu under WIFAK Draw Down request
And User_608 enter the DD code in Approve\Reject search grid under WIFAK Draw down request
And User_608 double click the DD code in Approve\Reject search grid under WIFAK Draw down request
When User_608 click the Approve button in Approve\Reject under WIFAK Draw down request
Then User_608 click the Query Menu under WIFAK Draw Down request
And User_608 enter the DD code in Query search grid under WIFAK Draw down request
And User_608 double click the DD code in Query search grid under WIFAK Draw down request
And User_608 click the Additional Details tab in Query Menu under WIFAK Draw Down request
Then User_608 click the List Menu under WIFAK Draw Down request
And User_608 enter From code in List menu under WIFAK Draw down request
And User_608 enter To code in List menu under WIFAK Draw down request
And User_608 click the Retrieve button in List menu under WIFAK Draw down request
Then User_608 click the Reverse menu under WIFAK Draw Down request
And User_608 enter the DD code in Reverse menu search grid under WIFAK Draw down request
And User_608 double click the DD code in Reverse menu search grid under WIFAK Draw down request
When User_608 click the Reverse button in Reverse menu under WIFAK Draw down request
Then User_608 click the Approve\Reject Reverse menu under WIFAK Draw Down request
And User_608 enter the DD code in Approve\Reject Reverse menu search grid under WIFAK Draw down request
And User_608 double click the DD code in Approve\Reject Reverse menu search grid under WIFAK Draw down request
When User_608 click the Approve Reverse button in Approve\Reject Reverse menu under WIFAK Draw down request
Then User_608 click the Update After Approve menu under WIFAK Draw Down request
And User_608 click the clear button in Update After Approve under WIFAK Draw Down request
And User_608 double click the any one record in Update After Approve under WIFAK Draw Down request
And User_608 click the Additional Details tab in Update After Approve under WIFAK Draw Down request
And User_608 edit the FC Amount in Additional Details tab under Update After Approve in WIFAK Draw Down request
When User_608 click the Save button in Update After Approve under WIFAK Draw Down request


@AT_DDR_025
Scenario: Draw Down Request

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_DDR_025
And User_608 clear the caches in FMS Application
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as new facility under Application for financial facility 
And User_608 enter the CIF No in main info tab in Application for financial facility Maintanance
And User_608 validate the CIF status displayed should be blacklist under Application for financial facility
And User_608 click on the Collateral Management feature
And User_608 click on the Maintanace screen under Collateral Management
And User_608 enter the Collateral type under main information in Collateral Management main Screen
And User_608 give the valid from date under main information in Collateral Management main Screen
And User_608 give the valid to date under main information in Collateral Management main Screen
And User_608 enter the Collateral currency under main information in Collateral Management main Screen
And User_608 enter the brief description under main information in Collateral Management main Screen
And User_608 enter the long description under main information in Collateral Management main Screen
And User_608 enter the CIF No under main information in Collateral Management main Screen
And User_608 validate the CIF status displayed should be blacklist under Collateral Management maintanance


