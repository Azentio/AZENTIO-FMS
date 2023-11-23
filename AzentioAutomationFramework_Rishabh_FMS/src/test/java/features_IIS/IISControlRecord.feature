Feature: To check the Control Feature

@AT_IISPRM_004
Scenario: Checking for the JV description for settlement and investment deal under JV and printing
Given navigate to IIS Param Application and login with valid credentials
And user get the test data for test case AT_IISPRM_004
Then user click on the parameter tab under menu
Then user click on the control record module under parameter menu tab
Then user click on the control record maintanence tab under control record
Then user click on the jv and printing tab
Then user click on the CustomizedJVDescription button
Then user click on the add button
Then user search for the newly added row
Then user click on the drop down of trx type of the newly added row
Then user selected investement deal trx type from the drop down
Then user click on the discription field for investment deal
Then user enter the discription for investment deal
Then user click on the ohk button