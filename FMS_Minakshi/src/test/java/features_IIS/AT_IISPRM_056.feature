Feature: To Test the FMSiis application 
@AT_IISPRM_056
Scenario: Check basic functionality of Insurance Type  module
Given user_56 navigate to the IISParam application and login with the valid credentials
Then user_56 update test data set id for AT_iisprm_058
And user_56 click on parameters tab
And user_56 click on Insurance Type
And user_56 check menus and lists are available
And user_56 click on maintenance and create a record
And user_56 enter code brief description long description and save it
And user_56 check first last prev next button
And user_56 check sorting functionality
And user_56 check grid is listing all relevant data
And user_56 retrieve the code and delete it
And user_56 close the screen
