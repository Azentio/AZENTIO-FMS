Feature: To check the FMSParam & FMSCore WIFAK Application Features

@AT_FM_038_FMSParam
Scenario: JAIZ150014 - INABILITY TO CRAETE A LIMIT ON APPROVE FACILITY

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_FM_038_FMSParam
And User_608 clicks on the parameter module
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
When User_608 clicks on the Update button
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type


@AT_FM_038_FMSCore
Scenario: JAIZ150014 - INABILITY TO CRAETE A LIMIT ON APPROVE FACILITY

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_038_FMSCore
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
#And User_608 clicks on the Application for financial facility link
#And User_608 clicks the maintanance menu
#And User_608 select the application for dropdown as new facility
#And User_608 enter the CIF No in main info tab
#And User_608 enter the facility type in main info tab
#And User_608 enter the country of financing in main info tab
#And User_608 enter the facility rating in main info tab
#And User_608 clicks on the additional details tab
#And User_608 enter the total value in additional info tab
#And User_608 enter the expire date in additional info tab
#And User_608 clicks the limit details tab
#And User_608 clicks the add new record button in limit details tab
#And User_608 enter the product class details
#And User_608 clicks on the add button
#And User_608 move to the Document details tab
#And User_608 enter the Solicitor Name
#And User_608 enter the Estimator Name
#And User_608 clicks the save button
#And User_608 clicks on the validate button
#Then User_608 clicks the Approve Level1 menu under Application for financial facilities
#And User_608 enter the reference code in Approve level1
#And User_608 double click on the retrieved reference code in Approve level1
#And User_608 select the Approve level1 decision as Forward
#And User_608 select the Approve level1 decision Forward to Approve level3
#When User_608 clicks on the Approve level1 submit button
#Then User_608 clicks the Approve Level3 menu under Application for financial facilities
#And User_608 enter the reference code in Approve level3
#And User_608 double click on the retrieved reference code in Approve level3
#And User_608 select the Approve level3 decision as Approve
#When User_608 clicks on the Approve level3 submit button

And User_608 clicks on the Approval committe recommedations menu
And User_608 enter the Facility type in search grid under Approval committe recommedations
And User_608 retrieve the first row in search grid under Approval committe recommedations
And User_608 click the Recommend button under Approval committe recommedations
And User_608 click the User recommended by name in approval committee user popup under Approval committe recommedations
And User_608 select the recommendation as approve in approval committee user popup under Approval committe recommedations
And User_608 click the OK button in approval committee user popup under Approval committe recommedations
And User_608 Successfully Approve the Recommendations



