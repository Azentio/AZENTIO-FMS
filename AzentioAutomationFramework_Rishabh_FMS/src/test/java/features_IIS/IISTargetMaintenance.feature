Feature: To check the Target Maintenance Feature

@AT_IISPRM_048
Scenario: Checking for target maintenance basic feature
Given navigate to IIS Param Application and login with valid credentials
And user get the test data for test case AT_IISPRM_048
Then user click on the parameter tab under menu
Then user click on the target maintenance module under parameter tab
Then user click on the maintenace
Then user click on the policy no feild
Then user enter the policy no
Then user click on the country feild
Then enter the country code
Then user click year feild
Then enter year 
Then user click on save button
Then user click ok on the confirm save popup
Then user click ok on saved successfull popup

Then user click on the search btn
Then user click on the class code feild 
Then user enter the class code
Then user double click on the fetched record 
Then user click on the update btn
Then user click ok on the confirm update popup
Then user click ok on update succesfull popup

Then user click on the search btn
Then user click on the class code feild 
Then user enter the class code
Then user double click on the fetched record 
Then user click on the delete btn
Then user click ok on the confirm delete popup
Then user click ok on Deleted succesfull popup

Then user click on the search btn
Then user click on the class code feild 
Then user enter the class code
Then user check for the grid and releavant data

Then user click on the policy no feild
Then user enter a negative value in policy feild
Then user validate the feild that it does not allow negative values
Then user click dismiss the error popup
Then user click on the policy no feild
Then user enter the max value 
Then user validate that feild accept the maximum value 
Then user click on the policy no feild
Then user enter the invaid values
Then user validate the feild that it does not allow invalid values
Then user click dismiss the error popup


Then user click on the class code feild 
Then user enter the class code
Then user check the searching is working correct

Then user 48 check for menu is available
Then user 48 check for the list inside the menu is avaliable

Then user 48 click on the clear button 
Then user 48 click on the next button
Then user 48 validate the next button is working correctly
Then user 48 click on the last button
Then user 48 validate the last button is working correctly
Then user 48 click on the previous button
Then user 48 validate the previous button is working correctly
Then user 48 click on the first button
Then user 48 validate the first button is working correctly

Then user click on the class code feild 
Then user enter the class code
Then user 48 check the retrival of record

Then user click on the close screen button and close the screen