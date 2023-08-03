Feature: To check the Committee Approval features

@AT_CA_015
Scenario: Approval Committee Recommendations – Recommend
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_CA_015
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 select the Item in limit Details
And User_074 select the Maturity date in limit Details
And User_074 enter the Margin rate in limit Details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button
Given User_VAK navigate to FMS application and login with valid credentials
Given User_VAK navigate to FMS application and login with valid credentials
And User_VAK get the test data for test case AT_RF_098_User_VAK
And User_VAK clicks on the WIFAK_Application first link
And User_VAK clicks on the WIFAK_Application second link
And User_VAK clicks on the approval committe recommedation menu
And User_VAK clicks on the clear button in approval committe recommedations menu
And User_VAK double click on the any one record in approval committe recommedations menu
And User_VAK clicks on the Recommend button in approval committe recommedations menu
And User_VAK click the User_VAK recommended by name in recommend box
And User_VAK select the recommendation as approve in recommend box
And User_VAK click the comment code lookup option in recommend box
And User_VAK double click the first row of comment code lookup in recommend box
And User_VAK clicks the more comments button in recommend box
And User_VAK enter the some comments in more comments
And User_VAK click the Ok button in more comments
When User_VAK click the Ok button in recommend box

@AT_CA_016
Scenario: Checking the Alert functionality at the level of Approval Committee Recommendations
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_CA_016
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 select the Item in limit Details
And User_074 select the Maturity date in limit Details
And User_074 enter the Margin rate in limit Details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
#And User_074 clicks the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button
Given User_VAK navigate to FMS application and login with valid credentials
And User_VAK get the test data for test case AT_RF_098_User_VAK
And User_VAK clicks on the WIFAK_Application first link
And User_VAK clicks on the WIFAK_Application second link
And User_VAK clicks on the approval committe recommedation menu
And User_VAK clicks on the clear button in approval committe recommedations menu
And User_VAK double click on the any one record in approval committe recommedations menu
And User_VAK clicks on the Recommend button in approval committe recommedations menu
And User_VAK click the User_VAK recommended by name in recommend box
And User_VAK select the recommendation as approve in recommend box
And User_VAK click the comment code lookup option in recommend box
And User_VAK double click the first row of comment code lookup in recommend box
And User_VAK clicks the more comments button in recommend box
And User_VAK enter the some comments in more comments
And User_VAK click the Ok button in more comments
When User_VAK click the Ok button in recommend box
And User_074 clicks on the validate button and wait for Send Alert popup
And User_074 search the VAK user in search grid under Send Alert popup
And User_074 click the VAK User row in search grid under Send Alert popup
And User_074 click the Send button under Send Alert popup


@AT_CA_017
Scenario: Checking the Alert functionality at the level of Application for Financial Facilities Maintenance where alert not mandatory for approval committee member
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_CA_017
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 enter the product class details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button and wait for Send Alert popup
And User_074 search the VAK user in search grid under Send Alert popup
And User_074 click the VAK User row in search grid under Send Alert popup
And User_074 click the Send button under Send Alert popup
And User logout from FMS Application
Given User_VAK navigate to FMS application and login with valid credentials
And User_VAK Should be validate Alert popup is displayed

@AT_CA_018
Scenario:  Reject the Application/Request at the level of committee approval level and check the status
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_CA_018
And User_074 clear the caches in FMS Application
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 enter the product class details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 get the test data for test case AT_CA_018
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button
And User_074 clicks on the Approval committe recommedations menu
And User_074 enter the reference code in search grid under Approval committe recommedations
And User_074 double the first row in search grid under Approval committe recommedations
And User_074 click the Recommend button under Approval committe recommedations
And User_074 click the User recommended by name in approval committee user popup under Approval committe recommedations
And User_074 select the recommendation as Reject in approval committee user popup under Approval committe recommedations
And User_074 click the OK button in approval committee user popup under Approval committe recommedations


@AT_CA_019
Scenario:  check the above Application/Request is ready for committee approval
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_CA_019
And User_074 clear the caches in FMS Application
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 enter the product class details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 get the test data for test case AT_CA_019
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button
And User_074 clicks on the Approval committe recommedations menu
And User_074 enter the reference code in search grid under Approval committe recommedations
And User_074 double the first row in search grid under Approval committe recommedations
And User_074 click the Recommend button under Approval committe recommedations
And User_074 click the User recommended by name in approval committee user popup under Approval committe recommedations
And User_074 select the recommendation as Reject in approval committee user popup under Approval committe recommedations
And User_074 click the OK button in approval committee user popup under Approval committe recommedations
Then User_074 click the Reopen Rejected Applications menu under WIFAK Application
And User_074 click the maintanance in Reopen Rejected Applications menu under WIFAK Application
And User_074 enter the reference code in searchgrid under WIFAK Reopen Rejected Applications maintanance
And User_074 double click the first row in searchgrid under WIFAK Reopen Rejected Applications maintanance
And User_074 click the Reopen button in WIFAK Reopen Rejected Applications maintanance
Then User_074 click the Approve\Reject menu in Reopen Rejected Applications under WIFAK Application
And User_074 enter the reference code in Approve\Reject searchgrid under WIFAK Reopen Rejected Applications
And User_074 double click the first row in Approve\Reject searchgrid under WIFAK Reopen Rejected Applications maintanance
And User_074 click the Approve button in Approve\Reject under WIFAK Reopen Rejected Applications maintanance


@AT_CA_020
Scenario:  Under Approval Committee Recommendations screen
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_CA_020
And User_074 clear the caches in FMS Application
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 enter the product class details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 get the test data for test case AT_CA_020
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button
And User_074 clicks on the Approval committe recommedations menu
And User_074 enter the reference code in search grid under Approval committe recommedations
And User_074 double the first row in search grid under Approval committe recommedations
And User_074 click the Recommend button under Approval committe recommedations
And User_074 click the User recommended by name in approval committee user popup under Approval committe recommedations
And User_074 select the recommendation as Reject in approval committee user popup under Approval committe recommedations
And User_074 click the OK button in approval committee user popup under Approval committe recommedations

@AT_RF_028
Scenario: TSR - CDMI180076
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_CA_018
And User_074 clear the caches in FMS Application
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 enter the product class details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 get the test data for test case AT_CA_018
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button
And User_074 clicks on the Approval committe recommedations menu
And User_074 enter the reference code in search grid under Approval committe recommedations
And User_074 double the first row in search grid under Approval committe recommedations
And User_074 click the Recommend button under Approval committe recommedations
And User_074 click the User recommended by name in approval committee user popup under Approval committe recommedations
And User_074 select the recommendation as Reject in approval committee user popup under Approval committe recommedations
And User_074 click the OK button in approval committee user popup under Approval committe recommedations





