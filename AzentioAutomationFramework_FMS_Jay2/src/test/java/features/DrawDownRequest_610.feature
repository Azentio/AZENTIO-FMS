Feature: DrawDownRequest

 @1105453
Scenario: Check a new GL type “Down payment” is added to transaction template in order to map the down payment account defined at the product class

    Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 click Transaction Template 
    And User_610 click Maintenance Screen in Transaction Template
    And User_610 click add icon in Transaction Template Details 
    And User_610 click GL Type 
    Then User_610 validate Down Payment Account Visiable or Not 

@1105454
Scenario: Check in ‘Facility Type’ parameter screen, existing flag ‘Hamish Al Jiddiya’ is modified to Drop down field and have the three values ‘None’, ‘Hamish Al Jiddiya’ and ‘Down Payment’ and by default drop down value ‘None’ is set

    Given navigate to FMS param application and login with valid credentials2
    And User_610 get the test data set id for AT_DDR_083
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data third row in update after approve menu
    And User_610 click HJ Down Payment in Main Details
    Then User_610 validate the HJ Down Payment Value Visiable or Not
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    