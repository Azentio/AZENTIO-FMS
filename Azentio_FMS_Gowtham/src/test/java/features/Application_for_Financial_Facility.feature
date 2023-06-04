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

  @127787
  Scenario: TC to check the addition of two new flags at the Parameters -Facility Type Maintain  screen(P008)
    Given navigate to FMS param application and login with valid credentials2
    And Click on the Parameters menu
    Then Click on the Facility Type submenu
    And Click on the Update After Approve screen
    Then Search for the Code in Update After Approve screen
    And Click the Code in Update After Approve screen
    Then Click the Facility Details tab in update after approve screen
    And Click on the Application Requirements and Details in Facility Details tab
    Then Check the Apply Corporate Package is displayed
    And Check the Allow to Edit @ Application is displayed
    Then Check the Allow to edit Corporate Package Rate is displayed

  @299886
  Scenario: FMS cannot accept down paymetn with decimal points
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
    And In AdditionalDetails enter value On  downPayment more than total value and check
    Then In AdditionalDetails enter value On  downPayment less than total value and check

  @802912
  Scenario: Modification in Application for Financial Facilities
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance

  @929306
  Scenario: Exception error in Production
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
    And Enter first Value On Product Class
    And AfterEnter ValueOn Product Class Search
    And Split total value and add on facility value
    And Click Add button AfterEnter Value On Product Class
    And Click Add button on limit Detail
    And Enter second ValueOn Product Class
    And Enter the floating rate
    And Enter the floating rate periodicity
    And Enter the floating rate periodicity type
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
    And Click save button on limit details
    And User move to the Document details tab
    And User enter the Solicitor Name
    And User enter the Estimator Name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
		And User retrive the first data in approve level1
		And User select the level1 devision as approve
		And User clicks on the level1 submit button
		And User clicks the Approve Level2 link
		And User retrive the first data in approve level2
		And User select the level2 devision as approve
		And User clicks on the level2 submit button
		And User clicks the Approve Level3 link
		And User retrive the first data in approve level3
		And User select the level3 devision as approve
		And User clicks on the level3 submit button

		
		
		
		@583228
		Scenario: Exception error in Production
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
    And Click save button on limit details
    And User move to the Document details tab
    And User enter the Solicitor Name
    And User enter the Estimator Name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
		And User retrive the first data in approve level1
		And User select the level1 devision as approve
		And User clicks on the level1 submit button
		And User clicks the Approve Level2 link
		And User retrive the first data in approve level2
		And User select the level2 devision as approve
		And User clicks on the level2 submit button
		And User clicks the Approve Level3 link
		And User retrive the first data in approve level3
		And User select the level3 devision as approve
		And User clicks on the level3 submit button
		
	
		
		
		
		
