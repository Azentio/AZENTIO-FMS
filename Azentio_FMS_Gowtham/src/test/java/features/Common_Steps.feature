@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @params
  Scenario: check and uncheck facility flags in params 
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
    And User_610 check the Client Response flag
    And User_610 check the Document Validation flag
    And User_610 check the Final Approval flag
    And User_610 check the Create Active Facility If Within Limits flag
    And User_610 Check the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type
    
    And User_610 uncheck the Customer Grading flag
    And User_610 uncheck the Overwrite Grading flag
    And User_610 uncheck the Credit Review flag
    And User_610 uncheck the Committee Approval flag
    And User_610 uncheck the Credit Authorization flag
    And User_610 uncheck the Issue Facility Offer flag
    And User_610 uncheck the Client Response flag
    And User_610 uncheck the Document Validation flag
    And User_610 uncheck the Final Approval flag
    And User_610 uncheck the Create Active Facility If Within Limits flag
    And User_610 unCheck the Automatically Approve Facility If Within Limits flag