Feature: Linking Fixed Asset to Application in FMS

  @949677
  Scenario: Linking Fixed Asset to Application in FMS
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 949677
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
    And Click FixedAssert button
    And Click AddButton OnFixedAssert screen
    And Enter value on Catagory
    And Enter value on Class
    And Enter value on vendor
    And Enter value on quantity
    And Enter value on Unit
    And Enter value on Cy
    And Enter value on UnitCost
    And Click OkButton On Fixed AssertKey Screen
    And Click Save button on limit details tab
    And Click Ok saveOn Draft WarrningScreen
    Then Click Ok OnSuccess Screen

  @917005
  Scenario: Credit Rating Field is Disable at Level of Corporate Financing in FMS
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And User update test data for test case no 917005
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
    And Go to mainInformation Screen
    Then Check edit rating field editable

  @817662
  Scenario: Documents not showing under document checklist for Facility Application
    Given navigate to FMS application2 and login with valid credentials
    And User update test data for test case no 817662
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
    And Click Document checklist
    And Click for select the row
    And Scroll down to upload file
    And Click Choose file button and upload file
    And Click Upload Docs button
    Then Click Ok OnSuccess Screen