Feature: Facility Management
	@834953
  Scenario: Check a new flag Change After Utilization is added under the Facility Type Parameter screen
    Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 check flag allow change revolving OnOff in main details menu
    Then User_610 check  change after utilization flag avaliable or not in main details 

    @834955
  Scenario: Check the below conditions is applicable once the existing facility is changing from Revolving to One-Off or Vice versa
    Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 check the allow change revolving onOff flag is checked
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type
    
    @834955_02
    
  Scenario: Check the below conditions is applicable once the existing facility is changing from Revolving to One-Off or Vice versa
    Given navigate to FMS application2 and login with valid credentials
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    Then validate if the allow change revolving onOff flag is checked revolving onOff will editAble in facility type
    
    @834955_03
  Scenario: Check the below conditions is applicable once the existing facility is changing from Revolving to One-Off or Vice versa
    Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 check the allow change revolving onOff flag is Unchecked
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type
        
    @834955_04
    
  Scenario: Check the below conditions is applicable once the existing facility is changing from Revolving to One-Off or Vice versa
    Given navigate to FMS application2 and login with valid credentials
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    Then validate if the allow change revolving onOff flag is Unchecked revolving onOff will Not EditAble in facility type