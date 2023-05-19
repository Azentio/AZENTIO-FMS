Feature: To check the WIFAK Application Feature with Facility type

@834966_FMS_Param
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to FMS param application and login with valid credentials 
And User clicks on the parameter module
And User clicks on the Facility Type feature
And User clicks on the update after approve menu in Facility type
And User enter the code value in update after approve menu
And User double click on the retrived data in update after approve menu
And User clicks on the facility details tab
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

@834966_FMS_Core
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to FMS application and login with valid credentials
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
And User select the level1 devision as approve
And User clicks on the level1 submit button
And User clicks the Approve Level2 link
And User retrive the first data in approve level2
And User select the level2 devision as approve
And User clicks on the level2 submit button
And User clicks the Approve Level3 link
And User retrive the first data in approve level3
And User select the level3 devision as approve
When User clicks on the level3 submit button

@834966_CSM_Core
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to CSM application and login with valid credentials
#And User clicks on the transfer of entities module
#And User clicks on the transfer of entities maintanance menu
# after the unblocked some steps are needed



