
Feature: Checking the Settlement Policy feature

  @AT_IISPRM_046
  Scenario: Checking the Settlement Policy -basic Testing
    Given navigate to IIS Param Application and login with valid credentials
    And user get the test data for test case AT_IISPRM_046
    Then user click on the parameter tab under menu
    Then user 46 click on the settlement policy module 
    Then user 46 click on the maintenanace under settlement policy module 
    #Then user 46 click on the policy no feild 
    #Then user 46 enter the policy no 
    #Then user 46 click ok on the information popup
    #Then user 46 click on the policy description feild 
    #Then user 46 enter the policy description
    #Then user 46 click on the save button
    #Then user 46 click ok on the confirm popup
    #Then user 46 click ok on the succesfull popup
    
    #Then user 46 click on the policy no feild
    #Then user 46 enter a negative value
    #Then user 46 validate the feild that it does not allow negative value
    #Then user 46 dismiss the first error popup
    #Then user 46 click ok on the error popup
    #Then user 46 click on the policy no feild
    #Then user 46 enter the maximum value 
    #Then user 46 validate that feild accept the max value 
    #Then user 46 click on the policy no feild
    #Then user 46 enter the invaid value
    #Then user 46 validate the feild that it does not allow invalid value
    #Then user 46 click ok on the error popup  
    
    Then user 46 click on the search feild
    Then user 46 click on the policy no under search tab
    Then user 46 enter the policy no under search tab 
    Then user 46 validate the searching is working properly 
    
    Then user 46 check for menu is available
    Then user 46 check for the list inside the menu is avaliable
    
    Then user 46 click on the sort search icon
    Then user 46 click on the first dropdown
    Then user 46 select the first sorting value type
    Then user 46 click on the seccond dropdown
    Then user 46 select the second sorting value type
    Then user 46 click on the input value feild
    Then user 46 enter the value to be sorted 
    Then user 46 click on the find icon btn 
    Then user 46 validate the sorting is working correct
    
    Then user 46 click on the clear button 
    Then user 46 click on the next button
    Then user 46 validate the next button is working correctly
    Then user 46 click on the last button
    Then user 46 validate the last button is working correctly
    Then user 46 click on the previous button
    Then user 46 validate the previous button is working correctly
    Then user 46 click on the first button
    Then user 46 validate the first button is working correctly
    
    Then user 46 click on the policy no under search tab
    Then user 46 enter the policy no under search tab
    Then user 46 checks the retrival of the rec
    Then user 46 double click on the retrived rec
    Then user 46 check the status    
    
    Then user 46 click on the close screen button and close the screen
        
    
     
 

