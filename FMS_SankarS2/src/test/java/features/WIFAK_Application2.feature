Feature: To check the WIFAK Application Feature with Facility type

@AT_AFF_098_FMSParam
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to FMS param application and login with valid credentials
And get the test data for test case AT_AFF_098_FMSParam
And User clicks on the parameter module
And User clicks on the Facility Type feature
And User clicks on the update after approve menu in Facility type
And User enter the code value in update after approve menu
And User double click on the retrived data in update after approve menu
And User clicks on the facility details tab in update after approve
And User clicks on the STP Facility Requirements option
And User check the Customer Grading flag
And User check the Overwrite Grading flag
And User check the Credit Review flag
And User check the Committee Approval flag
And User check the Credit Authorization flag
And User check the Issue Facility Offer flag
And User check the Client Response flag
And User check the Document Validation flag
And User check the Final Approval flag
And User check the Create Active Facility If Within Limits flag
And User Check the Automatically Approve Facility If Within Limits flag
When User clicks on the Update button
And User after the update go to the approve menu
And User enter the code value in approve menu
And User double click on the retrived data in approve menu
When User clicks on the Approve button

@AT_AFF_098_FMSCore
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_AFF_098_FMSCore
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User select the application for dropdown as new facility
And User enter the CIF No in main info tab
And User enter the facility type in main info tab
And User enter the country of financing in main info tab
And User enter the facility rating in main info tab
And User define the marketed by field
And User clicks on the additional details tab
And User enter the total value in additional info tab
And User enter the expire date in additional info tab
And User clicks the limit details tab
And User clicks the add new record button in limit details tab
And User enter the product class details
And User clicks on the add button
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks the validate button
And User clicks the Approve Level1 link
And User retrive the first data in approve level1
And User select the level1 decision as approve
And User clicks on the level1 submit button
And User clicks the Approve Level2 link
And User retrive the first data in approve level2
And User select the level2 decision as approve
And User clicks on the level2 submit button
And User clicks the Approve Level3 link
And User retrive the first data in approve level3
And User select the level3 decision as approve
When User clicks on the level3 submit button

@AT_AFF_098_CSMCore
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to CSM application and login with valid credentials
And User clicks on the transfer of entities module
And User clicks on the transfer of entities maintanance menu
# after the unblocked, some steps are needed


@AT_AFF_099_CSMCore
Scenario: Check the lookup of the Application From and To is matching the following conditions
Given navigate to CSM application and login with valid credentials
And User clicks on the transfer of entities module
And User clicks on the transfer of entities maintanance menu
# after the unblocked, some steps are needed


# Sprint 3
@AT_RF_034_FMSParam
Scenario: TSR - CDMI180093

Given navigate to FMS param application and login with valid credentials
And get the test data for test case AT_RF_034_FMSParam
And User clicks on the parameter module
And User clicks on the Facility Type feature
And User clicks on the update after approve menu in Facility type
And User enter the code value in update after approve menu
And User double click on the retrived data in update after approve menu
And User clicks on the facility details tab in update after approve
And User clicks on the STP Facility Requirements option
And User check the Customer Grading flag
And User check the Overwrite Grading flag
And User check the Credit Review flag
And User check the Committee Approval flag
And User check the Credit Authorization flag
And User check the Client Response flag
And User check the Document Validation flag
And User check the Final Approval flag
And User check the Create Active Facility If Within Limits flag
And User Check the Automatically Approve Facility If Within Limits flag
And User uncheck the Issue Facility Offer flag
And User move to facility reports tab in update after approve
And User clicks on the search option in issue facility offer under facility reports
And User double click on any one retrived data
And User check the auto print flag under issue facility offer
When User clicks on the Update button
And User after the update go to the approve menu
And User enter the code value in approve menu
And User double click on the retrived data in approve menu
When User clicks on the Approve button

@AT_RF_034_FMSCore
Scenario: TSR - CDMI180093

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_034_FMSCore
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
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks on the validate button
And User clicks the Approve Level1 link
And User retrive the first data in approve level1
And User select the level1 decision as approve
And User clicks on the level1 submit button
And User clicks the Approve Level2 link
And User retrive the first data in approve level2
And User select the level2 decision as approve
And User clicks on the level2 submit button
And User clicks the Approve Level3 link
And User retrive the first data in approve level3
And User select the level3 decision as approve
When User clicks on the level3 submit button
And User clicks the issue facility offer under WIFAK Application
And User search the code in issue facility offer
And User double click on the retrived data
When User clicks on the issue offer button under issue facility offer


@AT_RF_099_FMSParam
Scenario: TSR - BTII170059

Given navigate to FMS param application and login with valid credentials
And get the test data for test case AT_RF_099_FMSParam
And User clicks on the parameter module
And User clicks on the Facility Type feature
And User clicks on the update after approve menu in Facility type
And User enter the code value in update after approve menu
And User double click on the retrived data in update after approve menu
And User clicks on the facility details tab in update after approve
And User clicks the Application Requirements Details option
And User select the collateral as application level
And User select the Collaterals defined at the level of as sublimit
When User clicks on the Update button
And User after the update go to the approve menu
And User enter the code value in approve menu
And User double click on the retrived data in approve menu
When User clicks on the Approve button


@AT_RF_099_FMSCore
Scenario: TSR - BTII170059

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_099_FMSCore
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
And User validate visibility of Collateral details button under limit details tab
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks on the validate button
And User clicks the Approve Level1 link
And User retrive the first data in approve level1
And User select the level1 decision as approve
And User clicks on the level1 submit button
And User clicks the Approve Level2 link
And User retrive the first data in approve level2
And User select the level2 decision as approve
And User clicks on the level2 submit button
And User clicks the Approve Level3 link
And User retrive the first data in approve level3
And User select the level3 decision as approve
When User clicks on the level3 submit button


@AT_RF_101_FMSParam
Scenario: TSR-AMANAUPG170107

Given navigate to FMS param application and login with valid credentials
And get the test data for test case AT_RF_101_FMSParam
And User clicks on the parameter module
And User clicks on the Document checklist feature
And User clicks on the update after approve menu in Document checklist
And User retrive the one data in update after approve in Document checklist
And User click the add new button under update after approve in Document checklist
And User add the new record under Document details in update after approve
And User clicks on the update button under the update after approve in Document checklist
And User move to the approve menu under Document checklist
And User retrive the first data in approve under Document checklist
And User clicks on the Approve button under approve in Document checklist
And User clicks on the Facility Type feature
And User clicks on the update after approve menu in Facility type
And User enter the code value in update after approve menu
And User double click on the retrived data in update after approve menu
And User clicks on the Document management tab in update after approve menu
And User check the Application creation checkbox under Document management tab
When User clicks on the Update button
And User after the update go to the approve menu
And User enter the code value in approve menu
And User double click on the retrived data in approve menu
When User clicks on the Approve button


@AT_RF_101_FMSCore
Scenario: TSR-AMANAUPG170107

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_101_FMSCore
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
And User clicks on the document checklist button under limit details
And User clicks on the add new button under document checklist
And User give the Document Code under document checklist
And User give the Line No under document checklist
And User click the Ok button under document checklist
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks the validate button
And User clicks the Approve Level1 link
And User retrive the first data in approve level1
And User select the level1 decision as approve
And User clicks on the level1 submit button
And User clicks the Approve Level2 link
And User retrive the first data in approve level2
And User select the level2 decision as approve
And User clicks on the level2 submit button
And User clicks the Approve Level3 link
And User retrive the first data in approve level3
And User select the level3 decision as approve
When User clicks on the level3 submit button







