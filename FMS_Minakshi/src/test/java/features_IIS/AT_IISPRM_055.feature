Feature: To Test the iisparam application
@AT_IISPRM_055
Scenario: Check basic functionality of Insurance companies module
Given user_55 navigate to the IISParam application and login with the valid credentials
Then user_55 update test data set id for AT_IISPRM_058
And user_55 click on parameters tab
And user_55 click on Insurance companies
And user_55 check menus and lists are available
And user_55 click on maintenance and create a record
And user_55 enter code brief description long description and save it
And user_55 check first last prev next button
And user_55 check sorting functionality
And user_55 check grid is listing all relevant data
And user_55 retrieve the code and delete it
And user_55 close the screen
