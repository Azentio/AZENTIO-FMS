
Feature: Checking the Repayment plan template feature 


  @AT_IISPRM_047
  
  
  Scenario: RepaymentPlan Templatebasic Testing
    Given navigate to IIS Param Application and login with valid credentials
    And user get the test data for test case AT_IISPRM_047
    Then user click on the parameter tab under menu
    Then user click on the Repayment plan template
    Then user click on maintanence under Repayment plan template
    Then user click on the new button
    Then user click on the template code field
    Then user enter the template code
    Then user click on the short description field
    Then user enter the short description field
    Then user click on the long description field
    Then user enter the long description field
    Then user click on the template details tab
    Then user click on add button icon 
    Then user click on the form feild
    Then user enter a value in form feild
    Then user enter value in To feild 
    Then user enter value in date feild
    Then user click on th dropdown
    Then user select value from the dropdown
    Then user click on the save button for template code
    Then user click ok on confirm save popup
    Then user click ok on the update successfull popup
   
   #New_Rec___________________________________________________________________________
    
    Then user click on the search bar
    Then user click on the enter template code field
    Then user enter the existing template code
    Then user double click on the retrived record
    Then user click on the template details tab
    Then user click on the form feild of existing rec
    Then user enter updated value in form feild
    Then user enter updated value in To feild 
    Then user enter pdated value in date feild
    Then user click on th dropdown
    Then user select updated value from the dropdown
    Then user click on the save button for template code
    Then user click ok on confirm save popup
    Then user click ok on the update successfull popup
    
   #delete rec___________________________________________________________________________
   
    Then user click on the search bar
    Then user click on the enter template code field
    Then user enter the existing template code
    Then user double click on the retrived record
    Then user click on the delete button
    Then user click ok on confirm delete popup
    Then user click ok on the delete successfull popup   
    
    
    
   #Check the grid list all releavent datas_______________________________________________
    
    
    Then user click on the search bar
    Then user click on the enter template code field
    Then user enter the another existing template code
    Then user check for the grid and releavant datas
    
   #Check whether the fields accept negative numbers,greater than the maximum limit,Invalid data and get proper validation message same as PB.
    
    Then user click on the new button
    Then user click on the template code field
    Then user enter a negative value 
    Then user validate the feild that it does not allow negative value
    Then user click ok on the error popup
    Then user click on the template code field
    Then user enter the maximum value 
    Then user validate that feild accept the max value 
    Then user click on the template code field
    Then user enter the invaid value
    Then user validate the feild that it does not allow invalid value
    Then user click ok on the error popup
    
   #Check the searching is working properly________________________________________
    
    Then user click on the search bar
    Then user click on the enter template code field
    Then user enter the another existing template code
    Then user check the search is working correct
    
   #Check the Menus and lists are available__________________________________________
    
    Then user check for menu is available
    Then user check for the list inside the menu is avaliable
    
   #check the sorting functionality
   
    #Then user click on the search bar
    Then user click on the clear button 
    Then user click on the sort search icon
    Then user click on the first dropdown
    Then user select the first sorting value type
    Then user click on the seccond dropdown
    Then user select the second sorting value type
    Then user click on the input value feild
    Then user enter the value to be sorted 
    Then user click on the find icon btn 
    Then user validate the sorting is working correct
    
   #Check the First,Last,Next and Previous Buttons Functionality
   
   
    Then user click on the clear button 
    Then user click on the next button
    Then user validate the next button is working correctly
    Then user click on the last button
    Then user validate the last button is working correctly
    Then user click on the previous button
    Then user validate the previous button is working correctly
    Then user click on the first button
    Then user validate the first button is working correctly
    
   #Check the Retrieval of records
   
    
    Then user click on the enter template code field
    Then user enter the another existing template code
    Then user check the retrival of record
    
   #close the screen
   
    Then user click on the close screen button and close the screen
    
    
    