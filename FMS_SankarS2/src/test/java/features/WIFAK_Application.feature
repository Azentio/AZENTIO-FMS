Feature: To check the WIFAK Application features

@AT_AFF_040
Scenario: MFI190130 - History Log is empty for Application for facility--Approval/Reject option

Given navigate to FMS application and login with valid credentials
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks on the Approve level1 link
And get the test data for test case AT_AFF_040
And User search the code
And User double click searched record
Then user clicks on the History log tap


#@AT_AFF_048
#Scenario: BIM140064 - Nous voulons mettre les frais au niveau de FMS Comment peut on faire ceci?
#
#Given navigate to FMS application and login with valid credentials
#And get the test data for test case AT_AFF_048
#And User clicks on the WIFAK_Application first link
#And User clicks on the WIFAK_Application second link
#And User clicks on the Application for financial facility link
#And User clicks the maintanance menu
#And User select the application for dropdown as new facility
#And User enter the CIF No in main info tab
#And User enter the facility type in main info tab
#And User enter the country of financing in main info tab
#And User enter the facility rating in main info tab
#And User clicks on the additional details tab
#And User enter the total value in additional info tab
#And User enter the expire date in additional info tab
#And User clicks the limit details tab
#And User clicks the add new record button in limit details tab
#And User enter the product class details
#And User retrive the one account number
#And User clicks on the add button
#And User clicks on the Charges details button
#And User enter the code and check the collect at facility approval
#And User click the Ok button
#And User move to the Document details tab
#And User enter the Solicitor Name
#And User enter the Estimator Name
#And User clicks the save button
#And User clicks the validate button
#And User clicks the Approve Level1 link
#And User retrive the first data in approve level1
#And User select the level1 decision as approve
#And User clicks on the level1 submit button
#And User clicks the Approve Level2 link
#And User retrive the first data in approve level2
#And User select the level2 decision as approve
#And User clicks on the level2 submit button
#And User clicks the Approve Level3 link
#And User retrive the first data in approve level3
#And User select the level3 decision as approve
#When User clicks on the level3 submit button


#@AT_AFF_052
#Scenario: NBADAD150041 - Field to update Branch Manager comments while approving
#
#Given navigate to FMS application and login with valid credentials
#And User clicks on the WIFAK_Application first link
#And User clicks on the WIFAK_Application second link
#And User clicks on the Application for financial facility link
#And User clicks the Approve Level1 link
#And User clicks on the clear button
#And User double clicks on the first row of approve level1
#And User move to additional details tab in approve level1
#When User clicks on the BM Recommendations button
#Then User validate the BM Recommendations tab is editable or not


@AT_RF_040
Scenario: TSR - RIDB180129

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_040
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
And User enter the down payment percentage in additional info tab
And User enter the down payment to vendor percentage in additional info tab
And User clicks the limit details tab
And User clicks the add new record button in limit details tab
And User enter the product class details
Then User validate the visibility of Account No input box in limit details
Then User validate the visibility of Fund Transfer rate input box in limit details



@AT_RF_098_User1
Scenario: TSR - BTII170041

Given User_VAK navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_098_User1
And User1 clicks on the WIFAK_Application first link
And User1 clicks on the WIFAK_Application second link
And User1 clicks on the approval committe recommedation menu
And User1 clicks on the clear button in approval committe recommedations menu
And User1 double click on the any one record in approval committe recommedations menu
And User1 clicks on the Recommend button in approval committe recommedations menu
And User1 click the User1 recommended by name in recommend box
And User1 select the recommendation as approve in recommend box
And User1 click the comment code lookup option in recommend box
And User1 double click the first row of comment code lookup in recommend box
And User1 clicks the more comments button in recommend box
And User1 enter the some comments in more comments
And User1 click the Ok button in more comments
When User1 click the Ok button in recommend box


@AT_RF_098_User2
Scenario: TSR - BTII170041

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_098_User2
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User clicks on the search button in Application for financial facility main screen
And User search the code in Application for financial facility main screen
And User double click searched record in Application for financial facility main screen
And User clicks on the Approval committee button
And User click the User1 name in Recommented by column
And User clicks on the more comments button
Then User validate the more comments text in input field


 #//No data available in FMSCore
@AT_RF_100
Scenario: TSR-AMANAUPG170045

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_100
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User select the application for dropdown as decrease in main screen
And User enter the input as Existing Facility Ref in main screen
And User enter the facility rating in main info tab
And User clicks on the additional details tab
And User enter the total value under additional info tab
And User validate the finance amount should be decresed based on total value
And User enter the expire date in additional info tab
And User clicks the limit details tab
And User validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User double click on the product class under limit details
And User click the clean flag under product calss in limit details tab
And User click the edit button under product class in limit details tab
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

@AT_RF_102
Scenario: TSR-AMANAUPG170105

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_102
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
And User select the Item in limit Details
And User select the Maturity date in limit Details
And User enter the Margin rate in limit Details
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


@AT_RF_157
Scenario: TSR - AMANA180702

# Draw Down request
Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_157
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Draw Down request module
And User clicks on the Maintanance under Draw Down request
And User enter the Facility Reference in main screen under Draw Down request
And User select the draw down type in main screen under Draw Down request
And User enter the Description in main screen under Draw Down request
And User click on the draw down additional details tab
And User select the product class in additional screen under Draw Down request
And User give the FC Amount in additional screen under Draw Down request
And User enter the value date in main screen under Draw Down request
When User click the save button under in maintanance under Draw Down request
Then User click on the Verify link under Draw Down request
And User click on the clear button in verify under Draw Down request
And User double click on the code in verify under Draw Down request
When User click on the verify button in Verify link under Draw Down request
Then User click on the Approve link under Draw Down request
And User click on the clear button in Approve under Draw Down request
And User double click on the code in Approve under Draw Down request
When User click on the Approve button in Approve link under Draw Down request
Then User again clicks on the Maintanance under Draw Down request
And User clicks on the search button in main screen under Draw Down request
And User click the clear button in main screen under Draw Down request
And User double click on the first line code in main screen under Draw Down request
And User click on the Status Details button in main screen under Draw Down request
And User verify the Status Details tab User Name in main screen under Draw Down request
 ########  Facility Closure Request
Then User clicks on the Facility Closure Request module
And User click on the Maintanance under Facility Closure Request module
And User enter the Facility ref in main screen under Facility Closure Request
And User enter the Closure reason in main screen under Facility Closure Request
And User click on the Save button in main screen under Facility Closure Request
Then User clicks on the Approve under Facility Closure Request module
And User click on the clear button in approve screen under Facility Closure Request
And User double click on the code in approve screen under Facility Closure Request
When User click on the Approve button in approve screen under Facility Closure Request
Then User again click the Maintanance under Facility Closure Request module
And User click on the search button in main screen under Facility Closure Request
And User double click on the code in main screen under Facility Closure Request
And User click the Status details button in main screen under Facility Closure Request
Then User verify the Status details tab in main screen under Facility Closure Request
Then User again clicks on the Maintanance under Draw Down request
And User clicks on the search button in main screen under Draw Down request
And User click the clear button in main screen under Draw Down request
And User double click on the first line code in main screen under Draw Down request
And User click on the Status Details button in main screen under Draw Down request
And User verify the Status Details tab User Name in main screen under Draw Down request


@AT_RF_139
Scenario: MFI190122 - Request for financing-->Doc Checklist-->Upload Document-->Flags Attachment and Available is not checked

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_139
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
And User clicks the all critical checkboxes in document checklist
And User click the Ok button under document checklist
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks the validate button
And User clicks the Approve Level1 link
And User retrive the first data in approve level1
And User select the level1 decision as approve
And User clicks the limit details tab under approve level1
And User select the product class in limit details under approve level1
And User click the document checklist button under limit details in approve level1
And User click the ok button in document checklist under limit details
And User clicks on the level1 submit button
And User clicks the Approve Level2 link
And User retrive the first data in approve level2
And User select the level2 decision as approve
And User clicks on the level2 submit button
And User clicks the Approve Level3 link
And User retrive the first data in approve level3
And User select the level3 decision as approve
When User clicks on the level3 submit button


@AT_RF_140
Scenario: MFI190126 - Request for financing Document Checklist-->Document name changing after uploading document and document is showing in wrong order

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_140
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
And User select the second row in document checklist tab
And User give the file in choose file input under document checklist tab
And User click the Upload docs button under document checklist tab
And User validate the Attachment flag is checked in second row under document checklist tab
And User click the Ok button under document checklist
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks the validate button
And User clicks the Approve Level1 link
And User retrive the first data in approve level1
And User select the level1 decision as approve
And User clicks the limit details tab under approve level1
And User select the product class in limit details under approve level1
And User click the document checklist button under limit details in approve level1
And User click the second row of checklist under limit details in approve level1
And User click the View button in checklist under limit details in approve level1
And User vaidate the rows are available in View tab under document checklist
And User close the View tab in document checklist under approve level1 limit details
And User click the ok button in document checklist under limit details
And User clicks on the level1 submit button
And User clicks the Approve Level2 link
And User retrive the first data in approve level2
And User select the level2 decision as approve
And User clicks on the level2 submit button
And User clicks the Approve Level3 link
And User retrive the first data in approve level3
And User select the level3 decision as approve
When User clicks on the level3 submit button




