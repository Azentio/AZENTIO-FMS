Feature: To test the IIS Param Login

  @AT_IISPRM_097
  Scenario: Check the availability of new element CIF in the JV description format

    Given navigate to IIS Param Application and login with valid credentials
   And user update the test data for AT_IISPRM_097
   And user14 click on parameters tab
   And user14 click on control record under parameter tab
   And user14 click on control record maintainence under control record tab
   And user14 click on the jv and printing tab
   And user click on customize jv description under jv and printing tab
   And user click the first option under jv description format
   And user click on add 











  @AT_IISPRM_098
  Scenario: Check the new options under IIS Prduct class profit calculation Tab
    
   Given navigate to IIS Param Application and login with valid credentials
   And user update the test data for AT_IISPRM_098
   And user14 click on parameters tab
   And user14 click on product class under parameter tab
   And user14 click on maintenance under product class tab
   And user14 click on profit calculation under maintainance tab
   And user14 validate the accrue additional profit based on deal rate dropdown defaut value
   And user14 validate the additional profit penalty rate over deal rate textfield is enabled
   And user14 validate the additional profit penalty rate over deal rate textfield is editable
   
   
   
    @AT_IISPRM_099
    Scenario: Check the new options under IIS Prduct class profit calculation Tab
    
    Given navigate to IIS Param Application and login with valid credentials
    And user update the test data for AT_IISPRM_099
    And user14 click on parameters tab
    And user14 click on product class under parameter tab
    And user14 click on maintenance under product class tab
    
    
    @AT_IISPRM_112
    Scenario: Error while Updading the Product Class IIS Exe
     
    Given navigate to IIS Param Application and login with valid credentials
    And user14 click on parameters tab
    And user14 click on product class under parameter tab
    And user14 click on maintenance under product class tab
    And user14 click on search button under product class
    And user14 click on the first option under search button
    And user14 click on profit calculation under maintainance tab
    And user14 scroll to the bottom of the page of profit calculation tab
    And user14 validate the options present on the bottom of the profit calculation tab
    
    
    @AT_IISPRM_67
    Scenario: Budget- basic Testing
    
    Given navigate to IIS Param Application and login with valid credentials
    And user update the test data for AT_IISPRM_067
    And user14 click on parameters tab
    And user14 click on budget under parameter tab
    And user click the maintainence under budget tab
    And user14 give budget year under budget tab
    And user14 click on the search lookup of division under budget tab
    And user14 select the first option under division search lookup
    And user14 click on the search lookup of branch code under division option
    And user14 select the first option under branch code search lookup under division option
    And user14 click on the save button
    And user14 click on the ok button for confirming save process
    And user14 verify the post save confirmation popup
    
    And user14 click on search button under budget
    And user14 give fiscal year under search button
    And user14 select the first option under search button
    And user14 give budget year under budget tab for modify record
    And user14 click on the save button
    And user14 click on the ok button for confirming update process
    And user14 verify the post update confirmation message
    
    
    And user14 click on search button under budget
    And user14 give fiscal year under search button
    And user14 select the first option under search button
    #And user14 give budget year under budget tab for modify record
    And user14 click on delete button
    And user14 click on the ok button for confirming update process
    And user14 verify the post delete confirmation popup
    
    And user14 give the invalid value in budget year
    And user14 verify the error message
    
    
    
    
    
     
    
    