Feature: To test the IIS Parameter functionalities

@721477
Scenario: Penalty -basic Testing
Given navigate to IIS param application and login with valid credentials
And User_611 clicks on the parameter feature in IIS Param application
And User_611 clicks the penalty Menu in IIS param application 
And User_611 clicks the maintenance menu under penalty screen
And User_611 Enter and create a code value under maintenance screen 
And User_611 Enter the brief name eng under maintenance screen
And User_611 Enter the long discription under maintenance screen
And User_611 Enter the charges code under maintenance screen 
And User_611 clicks the save button under maintenance screen
And User_611 Validate the saving record
And User_611 Enter the penalty code under maintenance screen
And User_611 Edit the brief name eng for updation under maintenance screen
And User_611 Edit the long discription for updation under maintenance screen  
#save button include
And User_611 validate the updating record 
And User_611 Double tap the creating record for delete the record
And User_611 clicks the delete button 
And User_611 Validate the deleting record
And User_611 clicks the search button under maintenance screen
And User_611 clicks the lookup clear button
And User_611 Validate the penalty code value under grid list datas
And User_611 Validate the Brief name value under grid list datas
And user_611 Validate the Long name value under grid list datas
And User_611 Validate the Code value field accept only numeric values in maintenance under penalty screen
And User_611 Validate the Searching button is working properly
And User_611 Validate the List menu under penalty screen
And User_611 Validate the update after authorize menu under penalty screen
And User_611 Validate the reject menu under penalty screen 
And User_611 Validate the approve menu under penalty screen 
And User_611 Validate the sorting functionality
And User_611 close the sorting screen 
And User_611 Validate the first button in maintenance under penalty screen 
And User_611 Validate the last button in maintenance under penalty screen
And User_611 Validate the Next button in maintenance under penalty screen
And User_611 Validate the previous button in maintenance under penalty screen
And User_611 close the penalty screen tab
  





