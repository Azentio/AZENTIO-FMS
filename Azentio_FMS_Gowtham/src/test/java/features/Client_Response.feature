@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
   @733338_2
    Scenario: Check and Uncheck the flags in FacilityType FMS_params
    Given navigate to FMS param application and login with valid credentials
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 clicks on the facility details tab in update after approve
    And User_610 clicks on the STP Facility Requirements option
    And User_610 check the Customer Grading flag
    And User_610 check the Overwrite Grading flag
    And User_610 check the Credit Review flag
    And User_610 check the Committee Approval flag
    And User_610 check the Credit Authorization flag
    And User_610 check the Issue Facility Offer flag
    And User_610 uncheck the Client Response flag
    And User_610 check the Document Validation flag
    And User_610 check the Final Approval flag
    And User_610 check the Create Active Facility If Within Limits flag
    And User_610 Check the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type
  

  @733338
  Scenario: TSR - AIBBI180206 - Issue with Client response
     Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 733338
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And User_607 Get App Created Date In Mainteance under Wifak
    And User_607 Enter Offer Expiration same as App Created Date In Mainteance under Wifak
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
		And User_607 Click Client Respose under Wifak
		And User_607 Search Record In Client Respose under Wifak
		And User_607 Select Record In Client Respose under Wifak
		And User_607 Click Accept button In Client Respose under Wifak
		And User_607 Accept the record In Client Respose under Wifak
		
		
		
		
		
		
		
		
    