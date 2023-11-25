Feature: To Test the FMSiis application 
@AT_IISPRM_053
Scenario: Item Property -basic Testing
Given user_53 navigate to the IISParam Application and login with valid credentials
And user_53 click on parameters
And user_53 click on Item under the parameters
And user_53 click on Item Property Tab under the Item 
And user_53 check menus and lists are available
And user_53 click on maintenance under the Item Properly Tab
Then user_53 update test data set id for AT_iisprm_058 
And user_53 enter code brief description long description
And user_53 click on save button
And user_53 click on search Tab 
And user_53 check first last prev next button
And user_53 check sorting functionality
And user_53 select the retrive data 
And user_53 click on delete button 
And user_53 close the screen