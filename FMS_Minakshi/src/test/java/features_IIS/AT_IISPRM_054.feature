 Feature: To Test the iisparam application
@AT_IISPRM_054
Scenario: Check basic functionality of charge module
Given user_54 navigate to the IISParam application and login with the valid credentials
Then user_54 update test data set id for AT_IISPRM_058
And user_54 click on parameters tab
And user_54 click on charge
And user_54 check menus and lists are available
And user_54 click on maintenance and create a record
And user_54 enter code brief description long description and save it
And user_54 check first last prev next button
And user_54 check sorting functionality
And user_54 check grid is listing all relevant data
And user_54 retrieve the code and delete it
And user_54 close the screen

 

 