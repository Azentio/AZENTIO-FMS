Feature: Title of your feature
  I want to use this template for my feature file
  
  @127859_Params
  Scenario: Final Approval
  Given navigate to FMS param application and login with valid credentials
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 clicks on the facility details tab in update after approve
    And User_610 clicks on the STP Facility Requirements option
    And User_610 unCheck the Mandatory Customer Grading flag
    And User_610 check the Customer Grading flag
    And User_610 check the Overwrite Grading flag
    And User_610 uncheck the Credit Review flag
    And User_610 uncheck the Committee Approval flag
    And User_610 uncheck the Credit Authorization flag
    And User_610 uncheck the Issue Facility Offer flag
    And User_610 uncheck the Client Response flag
    And User_610 uncheck the Document Validation flag
    And User_610 uncheck the Final Approval flag
    And User_610 uncheck the Create Active Facility If Within Limits flag
    And User_610 unCheck the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type

  @127859
  Scenario: Final Approval
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 583228
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
		

		@899818
		Scenario: ABSAI190416 - FMS 1704_Facility application with Charge line > Final Approval - Invalid/Missing Account
		Given navigate to FMS application2 and login with valid credentials
		And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 583228
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
    And User_607 Select the Account Code 
    And Click Add button AfterEnter Value On Product Class
    And User_607 Click on Charges Details label
    And User_607 Click and select the Charges Details
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
		And User_607 Click final Approval under wifakApplication
		And User_607 Check the record is display in final Approval under wifakApplication
		
		
		@853171
		Scenario: AIBBI190383 - Issue facility offer letter at the level of Request for Financing
		Given navigate to FMS application2 and login with valid credentials
		And User update test data for test case no 636958
		And User_607 Click Request under menu Options
		And User_607 Click Request Financing under Request
		And Click Request for financing
		And Goto maintenace
    And click the reason for submission search box
    And click the customer search box
    And click the facility type details
    And Enter the facility type code under facility type
    And Enter the total limit under global limit
    And Click the Disbursement Sublimit under maintenance screen
    And Add the limits under Disbursement Sublimit
    And Add the product class values in product searchbox
    And Add all the Above limit values
    And Save all the values when limits are add
    And Click the validate button when all the values are saved
    And Confirm the validate popup menu
    And Click the final validate popup
    
    #And Click the Approve level1 screen under request for financing
    #And Search the value in approve1
#	  And User_607 Forward the record in Approve level1 to Authorize and Reject
#	  And User_607 Click Approve button in Approve lev1 under Request For Financing
    #And User_607 click Authorize Reject Under Request For Financing
    #And User_607 Search Record In Authorize Reject Under Request For Financing
    #And User_607 Select Record In Authorize Reject Under Request For Financing
    #And User_607 Click Authorize button In Authorize Reject Under Request For Financing
    #And User_607 Click Issue Facility Offer Under Request For Financing
    #And User_607 Select Record In Issue Facility Offer Under Request For Financing
    #And User_607 Click Issue offer button In Issue Facility Offer Under Request For Financing
   
    @853171_2
    Scenario: AIBBI190383 - Issue facility offer letter at the level of Request for Financing
    Given navigate to FMS application2 and login with valid credentials
		And User update test data for test case no 636958
		And User_607 Click Request under menu Options
		And User_607 Click Request Financing under Request
		And Click Request for financing
    And Click the Approve level1 screen under request for financing
    And Search the value in approve1
	  And User_607 Forward the record in Approve level1 to Authorize and Reject
	  And User_607 Click Approve button in Approve lev1 under Request For Financing
    And User_607 click Authorize Reject Under Request For Financing
    And User_607 Search Record In Authorize Reject Under Request For Financing
    And User_607 Select Record In Authorize Reject Under Request For Financing
    And User_607 Click Authorize button In Authorize Reject Under Request For Financing
    And User_607 Click Issue Facility Offer Under Request For Financing
    And User_607 Select Record In Issue Facility Offer Under Request For Financing
    And User_607 Click Issue offer button In Issue Facility Offer Under Request For Financing
    
    
    
    