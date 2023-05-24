Feature: TC to check the modification in the Maintain Application Facility Screen

  @127788
  Scenario: TC to check the modification in the Maintain Application Facility Screen(T001)
    Given navigate to FMS param application and login with valid credentials2
    And Click on the Parameters menu
    Then Click on the Facility Type submenu
    And Click on the Update After Approve screen
    Then Search for the Code in Update After Approve screen
    And Click the Code in Update After Approve screen
    Then Click the Facility Details tab in update after approve screen
    And Click on the Application Requirements and Details in Facility Details tab
    And Check Apply corporate package flag
    And After check flag in corporate package then click Update
    And Its shows warning button then click ok button
    And Its shows Information button then click ok button
    And Go to Approve sub menu
    And Search for the Code in Updated in update after screen sub menu
    And Click the Code in Updated in update after screen sub menu
    And Click the Facility Details tab in update after approve screen sub menu
    And Click the approve button in facility Details screen approve screen
    And Its shows warning button then click ok button approve screen
    And Its shows Information button then click ok button approve screen

  @127788_01
  Scenario: TC to check the modification in the Maintain Application Facility Screen(T001)
    Given navigate to FMS application and login with valid credentials2
    And Click Wifak Application first01
    And Click Wifak Application Second01
    And Click Application for financial facilities01
    And Click Maintenance01
    And Click and Select Application for01
    And Search CIF No01
    And Enter codeOn Facility Type01
    Then Check the apply corporate package flag is disabled

  @834957
  Scenario: Check a new field “Marketed By” is added under the Main Information Tab in Application for Financial Facilities – Maintenance screen
    Given navigate to FMS param application and login with valid credentials2
    And User clicks on the Parameter module
    And User clicks on the control records feature
    And User clicks on the update after approve menu
    And User Check Flag General Limit By CIF
    And User clicks on the update button
    And User clicks on the approve menu
    Then User clicks on the approve button

  @834957_01
  Scenario: Check a new field “Marketed By” is added under the Main Information Tab in Application for Financial Facilities – Maintenance screen
    Given navigate to FMS application and login with valid credentials2
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
  #  And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And User Check Fx Settlement Expery Date
    And User Enter Date above current Date
    Then User Enter Date Below to this current Date
