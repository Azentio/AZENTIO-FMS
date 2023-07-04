Feature: User_608 to validate the Application for Financila Facility features

@AT_AFF_036
Scenario: ABSAI190084 - Floating Yield Issue at FMS

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AFF_036
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
Then User_608 Validate the floating rate with yield details



@AT_AFF_040
Scenario: MFI190130 - History Log is empty for Application for facility--Approval/Reject option

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AFF_040
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks on the Approve level1 link
And User_608 search the code
And User_608 double click searched record
And User_608 clicks on the History log tap
Then User_608 validate History log tab values should be displayed


@AT_AFF_048
Scenario: BIM140064 - Nous voulons mettre les frais au niveau de FMS Comment peut on faire ceci?

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AFF_048
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
And User_608 select the collect at facility approval flag
And User_608 click the Ok button in Charges details under limit details
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_AFF_048
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



@AT_AFF_052
Scenario: NBADAD150041 - Field to update Branch Manager comments while approving

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AFF_052
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks on the Approve level1 link
And User_608 clicks on the clear button under Approve level1
And User_608 double clicks on the first row of approve level1
And User_608 move to additional details tab in approve level1
When User_608 clicks on the BM Recommendations button
Then User_608 validate the BM Recommendations tab should be editable


@AT_AFF_056
Scenario: DB130085 - CIF type can not be changed in FMS category

Given navigate to FMS param application and login with valid credentials
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Facility category feature under Parameter
And User_608 clicks on the maintanance menu under Facility category
And User_608 clicks on the search button under Facility category maintanance
And User_608 double clicks on the any one row in Maintanance under Facility category
And User_608 clicks the CIF type search option in Maintanance under Facility category
And User_608 double click on the any one value in Maintanance under Facility category
Then User_608 clicks on the save button and save the record in Maintanance under Facility category



@AT_AFF_075
Scenario: Check modification at the FMS Ctrl Record

Given navigate to FMS param application and login with valid credentials
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the control records feature under Parameter
And User_608 clicks on the update after approve menu under control records
And User_608 validate the Officer Assigned Required checkbox
And User_608 uncheck the Officer Assigned Required flag
And User_608 validate the Enable Markup Type checkbox
And User_608 uncheck the Enable Markup Type flag
And User_608 validate the Role of Officers Assigned menu
And User_608 validate the Party s History with Company menu
And User_608 validate the Member Countries
And User_608 check the Officer Assigned Required flag
And User_608 clicks on the update button under Update after approve menu in control records
And User_608 clicks on the approve menu under control records
Then User_608 clicks on the approve button in Approve menu under control records


@AT_AFF_074
Scenario: Check modification at the FMS Ctrl Rec. new radio button-Member Countries Screen

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_AFF_074
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the control records feature under Parameter
And User_608 clicks on the update after approve menu under control records
And User_608 clicks on the member countries tab in update after approve under control records
And User_608 clicks the add new row button under member countries tab in update after approve
And User_608 enter the country code under member countries tab in update after approve
And User_608 clicks on the membership type dropdown under member countries tab in update after approve


@AT_AFF_098
@AT_AFF_098_FMSParam
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_AFF_098_FMSParam
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
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type

@AT_AFF_098
@AT_AFF_098_FMSCore
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AFF_048
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as new facility
And User_608 enter the CIF No in main info tab
And User_608 enter the facility type in main info tab
And User_608 enter the country of financing in main info tab
And User_608 enter the facility rating in main info tab
And User_608 define the marketed by field in main info tab
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
And User_608 get the test data for test case AT_AFF_048
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

@AT_AFF_098
@AT_AFF_098_CSMCore
Scenario: Check by default the option “Application From & To” is selected and user can choose the Facility No from the lookup

Given navigate to CSM application and login with valid credentials
And User_608 clicks on the transfer of entities module
And User_608 clicks on the transfer of entities maintanance menu
# after the unblocked, some steps are needed


@AT_AFF_099_CSMCore
Scenario: Check the lookup of the Application From and To is matching the following conditions

Given navigate to CSM application and login with valid credentials
And User_608 clicks on the transfer of entities module
And User_608 clicks on the transfer of entities maintanance menu
# after the unblocked, some steps are needed
