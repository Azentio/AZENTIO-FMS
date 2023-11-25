Feature: To Test the FMSiis application 
@AT_IISPRM_057
Scenario: Check basic functionality of Reason code  module
Given user_57 navigate to the IISParam application and login with the valid credentials
Then user_57 update test data set id for AT_iisprm_058
And user_57 click on parameters tab
And user_57 click on Reason code
And user_57 check menus and lists are available
And user_57 click on maintenance and create a record
And user_57 enter code brief description long description and save it
And user_57 check first last prev next button
And user_57 check sorting functionality
And user_57 check grid is listing all relevant data
And user_57 retrieve the code and delete it
And user_57 close the screen