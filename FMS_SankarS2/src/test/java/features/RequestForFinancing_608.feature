Feature: To check the Request For Financing Feature

## IIS Param --> Product class --> Maintanance --> Additional tab --> repayment paln tab --> no of payments dropdown  as "Nearest 1" --> Save
# Sprint 3
@AT_RF_014
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

# FMS Cire --> wifak --> Application Financial facility --> Create one application in Maintanance -->
# limit details --> repayment plan btn --> validate no of payments dropdown "Nearest 1"
@AT_RF_014
@AT_RF_014_FMSCore
Scenario: IIS Param Application

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_014_FMSCore
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
And User_608 clicks the limit details first row
And User_608 clicks the repayment plan button under limit details tab
Then User_608 validate the Rounding factor dropdown as Nearest1


# FMS Param --> Facility Custom Fields --> maintain Facility custom fields -->
# update after approve --> double click any one record --> validate 'Facility custom fields' should be available
# Sprint 3
@AT_RF_024
Scenario: TSR - FIBSI180217

Given navigate to FMS param application and login with valid credentials
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Facility custom fields under Parameter
And User_608 clicks on the Maintain facility custom fields under facility custom fields
And User_608 clicks on the Update after approve in Maintain facility custom fields
And User_608 double click on the one record under update after approve
And User_608 validate Facility Custom Fields screen are available


# FMS Param --> facility tye --> update after approve --> retrive the data -->
# facility details tab --> STP Facility req division-- check all flags except "issue facility offer" flag
# facility reports tab --> issue facility offer --> select reprot ID --> check "Auto print" flag --> Update & Approve
#
# Sprint 3
@AT_RF_034
@AT_RF_034_FMSParam
Scenario: TSR - CDMI180093

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_RF_034
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
And User_608 uncheck the Issue Facility Offer flag
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


# FMS Core --> WIFAK APP --> App for financial facility --> Create a new application and go to issue facility offer menu and click the issue offer button
@AT_RF_034
@AT_RF_034_FMSCore
Scenario: TSR - CDMI180093

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_034
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
And User_608 clicks on the validate button for request for financing
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_RF_034
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
And User_608 clicks the issue facility offer under WIFAK Application
And User_608 search the code in issue facility offer
And User_608 double click on the retrived data
When User_608 clicks on the issue offer button under issue facility offer


# FMS Core --> change the language in "Arabic" --> go to the mortgage management module --> Maintanance sceen --> verify field should be arabic language
# Sprint 3
@AT_RF_035
Scenario: TSR - SBYB160013

Given navigate to FMS application and login with valid credentials
And User_608 click on the language option in FMS core
And User_608 click on the arabic under language option
And User_608 clicks on the the mortgage management module
And User_608 open the Maintanance screen under mortgage management module
And User_608 verify the Maintanance screen should be arabic language


# Sprint 4
# FMS Core --> WIFAK APP --> Application for financial facility --> 
# Additional details tab --> To validate down payment and down payment vendor should be editable.
# limit details --> Product class tab  --> Account label field and found transfer label should be visible
@AT_RF_040
Scenario: TSR - RIDB180129

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_040
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
And User_608 validate the down payment percentage should be editable in additional info under main screen
And User_608 enter the down payment percentage in additional info under main screen
And User_608 validate the down payment to vendor percentage should be editable in additional info under main screen
And User_608 enter the down payment to vendor percentage in additional info tab
And User_608 clicks the limit details tab
And User_608 clicks the add new record button in limit details tab
And User_608 enter the product class details
Then User_608 validate the visibility of Account No input box in limit details
Then User_608 validate the visibility of Fund Transfer rate input box in limit details


## 1. Login VAK User and go to wifak Approval commitee recommendation menu give recommend select the VAK user give approve and go to more comment give the some comments
## 2. Login SANKAR User and go to wifak Application for financial facilities Main screen search the Ref Code and click the approval commitees button.
## 2. select the VAK User and click the More comments button validate the comment
# Every time run this scenario change the 'Search Code' in Excel sheet
@AT_RF_098
@AT_RF_098_User_VAK
Scenario: TSR - BTII170041

Given User_VAK navigate to FMS application and login with valid credentials
And User get the test data for test case AT_RF_098
And User_VAK clear the caches in FMS Application
And User_VAK clicks on the WIFAK_Application first link
And User_VAK clicks on the WIFAK_Application second link
And User_VAK clicks on the approval committe recommedation menu
And User_VAK clicks on the clear button in approval committe recommedations menu
#And User_VAK enter the code in searchgrid under approval committe recommedations menu
And User_VAK double click on the any one record in approval committe recommedations menu
And User_VAK clicks on the Recommend button in approval committe recommedations menu
And User_VAK click the User_VAK recommended by name in recommend box
And User_VAK select the recommendation as approve in recommend box
And User_VAK enter the comment code in recommend box
And User_VAK clicks the more comments button in recommend box
And User_VAK enter the some comments in more comments
And User_VAK click the Ok button in more comments
When User_VAK click the Ok button and get the reference code in recommend box


@AT_RF_098
@AT_RF_098_User_608
Scenario: TSR - BTII170041

Given navigate to FMS application and login with valid credentials
And User get the test data for test case AT_RF_098
And User_608 clear the caches in FMS Application
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 clicks on the search button in Application for financial facility main screen
And User_608 enter the reference code in Application for financial facility main screen
And User_608 double click searched record in Application for financial facility main screen
And User_608 clicks on the Approval committee button
And User_608 click the User1 name in Recommented by column
And User_608 clicks on the more comments button
Then User_608 validate the more comments text in input field


@AT_RF_099
@AT_RF_099_FMSParam
Scenario: TSR - BTII170059

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_RF_099
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Facility Type feature
And User_608 clicks on the update after approve menu in Facility type
And User_608 enter the code value in update after approve menu
And User_608 double click on the retrieved data in update after approve menu
And User_608 clicks on the facility details tab in update after approve
And User_608 clicks the Application Requirements Details option
And User_608 select the collateral as application level
And User_608 select the Collaterals defined at the level of as sublimit
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type


## Validate the Collateral Details button under Wifak Application for financial facilities main screen --> Limit details tab
@AT_RF_099
@AT_RF_099_FMSCore
Scenario: TSR - BTII170059

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_099
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
And User_608 validate visibility of Collateral details button under limit details tab
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for request for financing
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_RF_099
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


# Before the execution all the flags are checked in facility type --> STP requirements tab
@AT_RF_100
@AT_RF_100_Param
Scenario: Before the Execution all the flags are checked in Facility type -> STB Requirements tab

Given navigate to FMS param application and login with valid credentials
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Facility Type feature
And User_608 get the test data for test case AT_RF_100
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
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type

# Create a one facility in Application for financial facilities
# Create a application for 'decrease' and validate the FC amount are decreased based on Total value--> limit details Validate CV Value --> validate and approve
@AT_RF_100
@AT_RF_100_Core
Scenario: TSR-AMANAUPG170045

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_100
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
And User_608 clicks on the validate button for request for financing
And User_608 close the maintanance screen under Application for financial facility in WIFAK
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_RF_100
And User_608 enter the reference code in Approve level1
And User_608 double click on the retrieved reference code in Approve level1
And User_608 select the Approve level1 decision as Approve
When User_608 clicks on the Approve level1 submit button
And User_608 close the Approve level1 screen under Application for financial facility in WIFAK
Then User_608 clicks the Approve Level2 menu under Application for financial facilities
And User_608 enter the reference code in Approve level2
And User_608 double click on the retrieved reference code in Approve level2
And User_608 select the Approve level2 decision as Approve
When User_608 clicks on the Approve level2 submit button
And User_608 close the Approve level2 screen under Application for financial facility in WIFAK
Then User_608 clicks the Approve Level3 menu under Application for financial facilities
And User_608 enter the reference code in Approve level3
And User_608 double click on the retrieved reference code in Approve level3
And User_608 select the Approve level3 decision as Approve
When User_608 clicks on the Approve level3 submit button
And User_608 close the Approve level3 screen under Application for financial facility in WIFAK
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 get the facility management code in Facilities Management Maintanance under WIFAK Application
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as decrease in main screen
And User_608 get the test data for test case AT_RF_100
And User_608 enter the input as Existing Facility Ref in main screen
And User_608 enter the facility rating in main info tab
And User_608 clicks on the additional details tab
And User_608 enter the decrease total value under additional info tab
And User_608 get the test data for test case AT_RF_100
And User_608 validate the finance amount should be decresed based on total value
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 get the test data for test case AT_RF_100
And User_608 validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User_608 double click on the product class under limit details
And User_608 click the clean flag under product calss in limit details tab
And User_608 click the edit button under product class in limit details tab
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for decrease in request for financing
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_RF_100
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


## FMS Param --> Document Checklist --> update after approve --> Search one record --> add new document details --> update and approve
## FMS Param --> Facility Type --> update after approve --> Document management tab --> check Application creation checkbox --> update and approve
@AT_RF_101
@AT_RF_101_FMSParam
Scenario: TSR-AMANAUPG170107

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_RF_101
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Document checklist feature
And User_608 clicks on the update after approve menu in Document checklist
And User_608 enter the code in search grid under update after approve menu in Document checklist
And User_608 double click on the first row in update after approve in Document checklist
And User_608 click the add new button under update after approve in Document checklist
And User_608 add the new record under Document details in update after approve
And User_608 clicks on the update button under the update after approve in Document checklist
And User_608 move to the approve menu under Document checklist
And User_608 retrive the first data in approve under Document checklist
And User_608 clicks on the Approve button under approve in Document checklist
And User_608 clicks on the Facility Type feature
And User_608 clicks on the update after approve menu in Facility type
And User_608 enter the code value in update after approve menu
And User_608 double click on the retrieved data in update after approve menu
And User_608 clicks on the Document management tab in update after approve menu
And User_608 check the Application creation checkbox under Document management tab
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type


## FMS core --> wifak application financial facility --> main --> create application --> limit details tab --> document chekclist tab --> add new record & save --> validate & Approve
@AT_RF_101
@AT_RF_101_FMSCore
Scenario: TSR-AMANAUPG170107

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_101
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
And User_608 clicks on the document checklist button under limit details
And User_608 clicks on the add new button under document checklist
And User_608 give the Document Code under document checklist
And User_608 give the Line No under document checklist
And User_608 click the Ok button under document checklist
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for request for financing
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_RF_101
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


## FMS core --> wifak application financial facility --> main --> create application with limit details product class item 'Import L/C',Maturity date ,margin rate --> update & Approve
@AT_RF_102
Scenario: TSR-AMANAUPG170105

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_102
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
And User_608 select the Item in limit Details
And User_608 select the Maturity date in limit Details
And User_608 enter the Margin rate in limit Details
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for request for financing
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_RF_102
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



#Sprint 5
@AT_RF_157
Scenario: TSR - AMANA180702

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_157
And User_608 clear the caches in FMS Application
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 click the clear button in Facilities Management Maintanance under WIFAK Application
And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 get the facility ref code in Facilities Management Maintanance under WIFAK Application
And User_608 clicks on the Draw Down request module under WIFAK Application
And User_608 clicks on the Maintanance under Draw Down request in WIFAK Application
And User_608 get the test data for test case AT_RF_157
And User_608 enter the Facility Reference in main screen under WIFAK Draw Down request
And User_608 select the draw down type in main screen under Draw Down request
And User_608 enter the Description in main screen under Draw Down request
And User_608 click on the draw down additional details tab
And User_608 select the product class in additional screen under Draw Down request
And User_608 give the FC Amount in additional screen under Draw Down request
And User_608 enter the value date in main screen under Draw Down request
When User_608 click the save button under in maintanance under Draw Down request
And User_608 close the maintanance screen under Draw Down request in WIFAK
Then User_608 click on the Verify link under Draw Down request
And User_608 click on the clear button in verify under Draw Down request
And User_608 double click on the code in verify under Draw Down request
When User_608 click on the verify button in Verify link under Draw Down request
And User_608 close the Verify\Denu menu tab in WIFAK Draw Down request
Then User_608 click on the Approve link under Draw Down request
And User_608 click on the clear button in Approve under Draw Down request
And User_608 double click on the code in Approve under Draw Down request
When User_608 click on the Approve button in Approve link under Draw Down request
And User_608 close the Approve menu tab in WIFAK Draw Down request
And User_608 clicks on the Maintanance under Draw Down request in WIFAK Application
And User_608 clicks on the search button in main screen under Draw Down request
And User_608 click the clear button in main screen under Draw Down request
And User_608 double click on the first line code in main screen under Draw Down request
And User_608 click on the Status Details button in main screen under Draw Down request
And User_608 verify the Status Details tab User Name in main screen under Draw Down request
 ########  Facility Closure Request
Then User_608 clicks on the Facility Closure Request module
And User_608 click on the Maintanance under Facility Closure Request module
And User_608 enter the Facility ref in main screen under Facility Closure Request
And User_608 enter the Closure reason in main screen under Facility Closure Request
And User_608 click on the Save button in main screen under Facility Closure Request
And User_608 close the maintanance screen under Facility Closure Request in WIFAK
Then User_608 clicks on the Approve under Facility Closure Request module
And User_608 click on the clear button in approve screen under Facility Closure Request
And User_608 double click on the code in approve screen under Facility Closure Request
When User_608 click on the Approve button in approve screen under Facility Closure Request
And User_608 click on the Maintanance under Facility Closure Request module
And User_608 click on the search button in main screen under Facility Closure Request
And User_608 double click on the code in main screen under Facility Closure Request
And User_608 click the Status details button in main screen under Facility Closure Request
Then User_608 verify the Status details tab in main screen under Facility Closure Request
And User_608 close the Status details tab in main screen under Facility Closure Request
And User_608 clicks on the Maintanance under Draw Down request in WIFAK Application
And User_608 clicks on the search button in main screen under Draw Down request
And User_608 click the clear button in main screen under Draw Down request
And User_608 double click on the first line code in main screen under Draw Down request
And User_608 click on the Status Details button in main screen under Draw Down request
And User_608 verify the Status Details tab User Name in main screen under Draw Down request



@AT_RF_158
@AT_RF_158_Param
Scenario: TSR - AIBBI180226

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_RF_158_Param
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Collateral type module
And User_608 clicks on the Maintanance screen under Collateral type
And User_608 enter the code under Collateral Type main screen
And User_608 enter the Brief description under Collateral Type main screen
And User_608 enter the Long description under Collateral Type main screen
And User_608 select the Asset type as cash under Collateral Type main screen
When User_608 clicks on the save button under Collateral Type main screen
And User_608 clicks on the Approve screen under Collateral Type
And User_608 search the code under Collateral Type approve screen
And User_608 double click on the searched result under Collateral Type approve screen
When User_608 clicks on the Approve button under Collateral Type approve screen


@AT_RF_158
@AT_RF_158_Core
Scenario: TSR - AIBBI180226

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_158_Core
And User_608 clear the caches in FMS Application
And User_608 click on the Collateral Management feature
And User_608 click on the Maintanace screen under Collateral Management
And User_608 enter the Collateral type under main information in Collateral Management main Screen
And User_608 give the valid from date under main information in Collateral Management main Screen
And User_608 give the valid to date under main information in Collateral Management main Screen
And User_608 enter the Collateral currency under main information in Collateral Management main Screen
And User_608 enter the brief description under main information in Collateral Management main Screen
And User_608 enter the long description under main information in Collateral Management main Screen
And User_608 move to the Collateral cash details tab in Collateral Management main Screen
And User_608 click the add new icon under Collateral cash details tab
And User_608 click the additional reference lookup under Collateral cash details tab
And User_608 select the any cy value under additional reference lookup
And User_608 enter the amount value under Collateral cash details tab
When User_608 click the save button under Collateral Management main Screen
And User_608 move to the Approve screen under Collateral Management
And User_608 click the clear button under approve screen in Collateral Management
And User_608 double click on the first row in approve screen
When User_608 click the approve button under Collateral Management approve screen



@AT_RF_139
Scenario: MFI190122 - Request for financing-->Doc Checklist-->Upload Document-->Flags Attachment and Available is not checked

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_139
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
And User_608 clicks on the document checklist button under limit details
And User_608 clicks the all critical checkboxes in document checklist
And User_608 click the Ok button under document checklist
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for request for financing
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_RF_139
And User_608 enter the reference code in Approve level1
And User_608 double click on the retrieved reference code in Approve level1
And User_608 select the Approve level1 decision as Approve
And User_608 clicks the limit details tab under approve level1
And User_608 select the product class in limit details under approve level1
And User_608 click the document checklist button under limit details in approve level1
And User_608 click the ok button in document checklist under limit details
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



@AT_RF_140
Scenario: MFI190126 - Request for financing Document Checklist-->Document name changing after uploading document and document is showing in wrong order

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_140
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
And User_608 clicks on the document checklist button under limit details
And User_608 select the second row in document checklist tab
And User_608 give the file in choose file input under document checklist tab
And User_608 click the Upload docs button under document checklist tab
And User_608 validate the Attachment flag is checked in second row under document checklist tab
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for request for financing
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_RF_140
And User_608 enter the reference code in Approve level1
And User_608 double click on the retrieved reference code in Approve level1
And User_608 select the Approve level1 decision as Approve
And User_608 clicks the limit details tab under approve level1
And User_608 select the product class in limit details under approve level1
And User_608 click the document checklist button under limit details in approve level1
And User_608 click the second row of checklist under limit details in approve level1
And User_608 click the View button in checklist under limit details in approve level1
And User_608 vaidate the rows are available in View tab under document checklist
And User_608 close the View tab in document checklist under approve level1 limit details
And User_608 click the ok button in document checklist under limit details
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



@AT_RF_141
Scenario: MFI190131 - Request for financing Screen, Search criteria CIF name is not showing properly and Arabic Translation is not correct

Given navigate to FMS application and login with valid credentials
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 click the search button under the maintanance screen in Request for Financing
And User_608 click the clear button under the maintanance screen in Request for Financing
Then User_608 validate the CIF short Name available under the maintanance screen in Request for Financing
And User_608 validate the CIF long Name available under the maintanance screen in Request for Financing

# Arabic language
@AT_RF_141
@AT_RF_141_arabic
Scenario: MFI190131 - Request for financing Screen, Search criteria CIF name is not showing properly and Arabic Translation is not correct

Given navigate to FMS application and login with valid credentials
And User_608 click on the language option in FMS core
And User_608 click on the arabic under language option
And User_608 clicks on the Funding Request module in arabic
And User_608 clicks on the Request under Funding Request
And User_608 clicks on the Funding Request in Request under Funding Request
And User_608 click the approval committee under Funding Request in Request
Then User_608 validate the search grid value are displayed in arbic language under approval committee
