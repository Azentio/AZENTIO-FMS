@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @1265139
  Scenario: EWBI200039.004: Check whether system is allowing to display the request in ‘Authorization Screen’ after Committee Recommendation approval
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
    And User_610 uncheck the Credit Authorization flag
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
    
  @1265139_2
  Scenario: EWBI200039.004: Check whether system is allowing to display the request in ‘Authorization Screen’ after Committee Recommendation approval
   Given navigate to FMS application2 and login with valid credentials
     And User update test data for test case no 636958
     And Click Request for financin
     And Click Request for financing
     #And Goto maintenace
     #And click the reason for submission search box
    #And click the customer search box
    #And click the facility type details
    #And Enter the facility type code under facility type
    #And Enter the total limit under global limit
    #And Click the Disbursement Sublimit under maintenance screen
    #And Add the limits under Disbursement Sublimit
    #And Add the product class values in product searchbox
    #And Add all the Above limit values
    #And Save all the values when limits are add
    #And Confirm the popup menu when all the limits are saved
    #And Click the final save popup message
    #And Click the validate button when all the values are saved
    #And Confirm the validate popup menu
    #And Click the final validate popup
    
    And Click the Approve level1 screen under request for financing
    And Search the value in approve1
    And Select the record in approve1
	  And User_607 Forward the record in Approve level1
	  And User_607 Click Approve button in Approve lev1 under Request For Financing
	  And User_607 Click Approval Committee Rcommendations under Request For Financing
	  And User_607 Select record In Approval Committee Recommendations under Request For Financing
	  And User_607 Click credit Committee Recommendations Tab In Approval Committee Recommendations under Request For Financing
	  And User_607 Click RecommendationsArrow In credit Committee Recommendations Tab In Approval Committee Recommendations
	  And User_607 Click Add In RecommendationsArrow In Approval Committee Recommendations
	  And User_607 Select Approve In First Line In RecommendationsArrow In Approval Committee Recommendations
	  And User_607 Click Recommebd button In Approval Committee Recommendations under Request For Financing
	  And User_607 Click authorice Reject under Request For Financing
	  And User_607 Search Code In authorice Reject under Request For Financing
	  And User_607 Select Record In authorice Reject under Request For Financing
	  And User_607 Check the record in authorice Reject under Request For Financing
	  
	  
	  
	  
	  
	  

	@1265140
	Scenario: EWBI200039.005: Check whether system is allowing to display the application in ‘Authorization Screen’ before Committee Recommendation approval in facility increase/decrease case
	Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
	  And Click Application for financial facilities
	  And Click Maintenance
		And User select the application for dropdown as decrease in main screen
		And User enter the input as Existing Facility Ref in main screen
		And Click on additional Details
		And Enter Total value on additional Details
		And Change Total value and down payment

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
    And User Click Approval Committee Recommendations
    And Select the record in Approval Committee Recommendations
    And Click recommend button in the Approval Committee Recommendations Screen
    And Enter the details in Recommendations
    And Click ok button in the Recommendations screen
	
	
	
	
	
	
	