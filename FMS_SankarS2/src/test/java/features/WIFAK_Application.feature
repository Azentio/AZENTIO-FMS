Feature: To check the WIFAK Application features

@862019
Scenario: MFI190130 - History Log is empty for Application for facility--Approval/Reject option

Given navigate to FMS application and login with valid credentials
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks on the Approve level1 link
And get the test data for test case 862019
And User search the code
And User double click searched record
Then user clicks on the History log tap

@843959
Scenario: ABSAI190084 - Floating Yield Issue at FMS

Given navigate to FMS application and login with valid credentials
And get the test data for test case 843959
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
And User enter the product class
Then Validate the floating rate with yield details


@296063
Scenario: BIM140064 - Nous voulons mettre les frais au niveau de FMS Comment peut on faire ceci?

Given navigate to FMS application and login with valid credentials
And get the test data for test case 296063
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
And User retrive the one account number
And User clicks on the add button
And User clicks on the Charges details button
#And User clicks the add new record button
And User enter the code and check the collect at facility approval
And User click the Ok button
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


@294466
Scenario: NBADAD150041 - Field to update Branch Manager comments while approving

Given navigate to FMS application and login with valid credentials
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the Approve Level1 link
And User clicks on the clear button
And User double clicks on the first row of approve level1
And User move to additional details tab
When User clicks on the BM Recommendations button
Then User validate the BM Recommendations tab is editable or not


