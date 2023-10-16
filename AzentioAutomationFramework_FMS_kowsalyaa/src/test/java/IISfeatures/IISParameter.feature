Feature: To test the IIS Parameter functionalities

@721477
Scenario: Penalty -basic Testing
Given navigate to IIS param application and login with valid credentials
And User_611 get the test data for test case AT_IISPRM_075
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
And User_611 Enter the charges code under maintenance screen  
And User_611 clicks the save button under maintenance screen
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
And User_611 click the find records for validate the sorting functionality
And User_611 Validate the pentalty code in sorting functionality
And User_611 Validate the brief name eng in sorting functionality
And User_611 Validate the long name eng in sorting functionality
And User_611 close the sorting screen 
And User_611 Validate the first button in maintenance under penalty screen 
And User_611 Validate the last button in maintenance under penalty screen
And User_611 Validate the Next button in maintenance under penalty screen
And User_611 Validate the previous button in maintenance under penalty screen
And User_611 close the penalty screen tab
  
@721485
Scenario: Product Class -basic Testing
Given navigate to IIS param application and login with valid credentials
And User_611 get the test data for test case AT_IISPRM_076
And User_611 clicks on the parameter feature in IIS Param application
And User_611 clicks the productclass Menu in IIS param application 
And User_611 clicks the maintenance menu under productclass screen
And User_611 Enter and create a product class code value under maintenance screen 
And User_611 Enter the Category code under maintenance screen
And User_611 Enter the brief discription under maintenance screen
And User_611 Enter the long discription under maintenance screen in product class
And User_611 clicks the save button under maintenance screen in product class
And User_611 Validate the saving record under maintenance screen in product class
And User_611 Enter the Created product class value in class tab
And User_611 Double tab the retrive data 
And User_611 Edit the brief discription under maintenance screen
And User_611 Edit the long discription under maintenance screen in product class
And User_611 clicks the save button under maintenance screen in product class
And User_611 Validate the updating record in product class
And User_611 Double tap the creating record for delete the record in product class
And User_611 clicks the delete button in product class 
And User_611 Validate the deleting record in product class
And User_611 clicks the search button under maintenance screen in product class
And User_611 clicks the lookup clear button in product class
And User_611 Validate the class value under grid list datas
And User_611 Validate the Brief name value under grid list datas in product class
And user_611 Validate the category value under grid list datas
And user_611 Validate the category discription value under grid list datas
And User_611 Validate the Code value field accept only numeric values in maintenance under product class
And User_611 Validate the Searching button is working properly in product class
And User_611 Validate the Approve menu under product class
And User_611 Validate the List menu under product class
And User_611 Validate the Reject menu under product class
And User_611 Validate the Duplicate menu under product class
And User_611 click the find records for validate the sorting functionality under product class
And User_611 Validate the class in sorting functionality under product class
And User_611 Validate the brief name in sorting functionality
And User_611 Validate the category in sorting functionality
And User_611 Validate the category discription in sorting functionality
And User_611 close the sorting screen in product class
And User_611 Validate the first button in maintenance under product class screen 
And User_611 Validate the last button in maintenance under product class screen
And User_611 Validate the Next button in maintenance under product class screen
And User_611 Validate the previous button in maintenance under product class screen
And User_611 close the product class screen tab








