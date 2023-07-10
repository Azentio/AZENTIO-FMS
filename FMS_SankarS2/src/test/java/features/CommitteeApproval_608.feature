Feature: To check the Committee Approval features

@AT_CA_008
@AT_CA_008_Param
Scenario: Uncheck the Committe approval flag in FMS Param Facility type

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_CA_008
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



# Create a new application and go to approval commitee recommend and reject it. Go to Reopen reject application, retrieve and approve it. Check the status in maintanance
@AT_CA_008
@AT_CA_008_Core
Scenario: DASI180384 - committee rejection

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_CA_008
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
And User_608 get the test data for test case AT_CA_008
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
And User_608 clicks on the Approval committe recommedations menu
And User_608 enter the reference code in search grid under Approval committe recommedations
And User_608 double the first row in search grid under Approval committe recommedations
And User_608 click the Recommend button under Approval committe recommedations
And User_608 click the User recommended by name in approval committee user popup under Approval committe recommedations
And User_608 select the recommendation as Reject in approval committee user popup under Approval committe recommedations
And User_608 click the OK button in approval committee user popup under Approval committe recommedations
Then User_608 click the Reopen Rejected Applications menu under WIFAK Application
And User_608 click the maintanance in Reopen Rejected Applications menu under WIFAK Application
And User_608 enter the reference code in searchgrid under WIFAK Reopen Rejected Applications maintanance
And User_608 double click the first row in searchgrid under WIFAK Reopen Rejected Applications maintanance
And User_608 click the Reopen button in WIFAK Reopen Rejected Applications maintanance
Then User_608 click the Approve\Reject menu in Reopen Rejected Applications under WIFAK Application
And User_608 enter the reference code in Approve\Reject searchgrid under WIFAK Reopen Rejected Applications
And User_608 double click the first row in Approve\Reject searchgrid under WIFAK Reopen Rejected Applications maintanance
And User_608 click the Approve button in Approve\Reject under WIFAK Reopen Rejected Applications maintanance
And User_608 again click the maintanance menu under Application for financial facility
And User_608 clicks on the search button in Application for financial facility main screen
And User_608 enter the reference code in searchgrid under Application for financial facility main screen
And User_608 double click searched record in Application for financial facility main screen
Then User_608 validate Application status should be Active in Application for financial facility main screen














