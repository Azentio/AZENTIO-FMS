Feature: Title of your feature
  I want to use this template for my feature file

  @539219
  Scenario: TSR-SUPT170241
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 539219
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
    And User Click Approval Committee Recommendations
    And Select the record in Approval Committee Recommendations
    And Click recommend button in the Approval Committee Recommendations Screen
    And Enter the details in Recommendations
    And Click ok button in the Recommendations screen

  @542234
  Scenario: TSR-EWBI170417
    Given navigate to FMS application2 and login with valid credentials
    And User update test data for test case no 542234
    And User_607 clicks on the Request module
    And User_607 clicks on the Request Financing under Request module
    And User_607 clicks on the Request for Financing under Request Financing feature
    And User_607 clicks on the Maintanance screen under Request for Financing
    And User_607 select the Reason for submission under main screen in Request for Financing
    And User_607 enter the CIF no in main screen under Request for Financing
    And User_607 enter the facility type in main screen under Request for Financing
    And User_607 enter the total limit in main screen under Request for Financing
    And User_607 move to the sublimit tab in main screen under Request for Financing
    And User_607 click the add new button in sublimit tab under main screen in Request for Financing
    And User_607 enter the product class in limit details tab under sublimit tab
    And User_607 enter the margin value in limit details tab under sublimit tab
    And User_607 click the add button in limit details tab under sublimit tab
    When User_607 click the Save button in main screen under Request for Financing
    And User_607 click the Validate button in main screen Request for Financing
    Then User_607 click the approve level1 under Request for Financing
    And User_607 enter the request code in approve level1 under Request for Financing
    And User_607 double click on the first row in approve level1 under Request for Financing
    And User_607 Click the Disbursement Sublimit In ApproveLev1
    And user_607 Open the Product class in approve lev1
    Then user_607 Check the ammount in decimal value

  @292089
  Scenario: BIPL150025 - Duplicate corporate facility created by facility management
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User_607 clicks the facility management under wifak application
    And user clicks the query menu under facility management
    And user clicks on the clear button in query under facility management
    And user validate the retrived records are not duplicate

  @172636
  Scenario: TSR-SUPT140138 - Update Facility
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User_607 update test data for test case no 172636
    And User_607 clicks the facility management under wifak application
    And User_607 Click update AfterApprove under facility management
    And User_607 Select Record in update AfterApprove under Facilities Management
    And User_607 Click Facility Application Details In updateAfterApprove
    And User_607 Check Exceed Facility at Sublimit In update AfterApprove
    And User_607 Click Document Details In update AfterApprove under Facilities Management
    And User_607 Enter Solicitor Date Sent In DocumentD etails
    And User_607 Enter Solicitor Date Received In Document Details
    And User_607 Enter Estimator Date Sent In Document Details
    And User_607 Enter Estimator Date Received In Document Details
    And User_607 Enter Custodian date Sent In Document Details
    And User_607 Enter second Solicitor Date Sent In DocumentD etails
    And User_607 Enter second Solicitor Date Received In Document Details
    And User_607 Enter second Estimator Date Sent In Document Details
    And User_607 Enter second Estimator Date Received In Document Details
    And User_607 Enter second Custodian date Sent In Document Details
    And User_607 Click save button In update AfterApprove under Facilities Management
    And User_607 Click ApproveReject under Facilities Management
    And User_607 Select Record In ApproveReject under Facilities Management
    And User_607 Approve Record In ApproveReject under Facilities Management
    And User_607 Click Mainteance under Facilities Management
    And User_607 Search the record in Mainteance under Facilities Management
    And User_607 Select Record In Mainteance under Facilities Management
    And User_607 Click Facility Application Details In Mainteance under Facilities Management
    And User_607 Check the Flag Is Check or Not In Facility Application Details In Mainteance under Facilities Management
    And User_607 Click Document Details In Mainteance under Facilities Management
    And User_607 Check date Filled Or Not In Document Details In Mainteance under Facilities Management

  @165388
  Scenario: SRA140005 - Facility Limit Utilization Not Updated After Linked To An Approved Investment Deal
    Given navigate to IIS application and login with valid credentials
    And User_607 Change the date in iis
    And User_607 Click Investment Deals -Combined without Trade Deal under menu
    And User_607 Click Maintenance under Investment Deals -Combined without Trade Deal under menu
    And User_607 Click link button in Maintenance tab

  @403133
  Scenario: 8.6 Check the additional fields added not existing in TAR 130024 is translated inArabic/ French in Facility-Funding tab
    Given navigate to FMS application2 and login with valid credentials
    And User_607 Change the Language into French
    And User_607 Click retail under menu
    And User_607 Click body under retail
    And User_607 Click request for financing under retail
    And User_607 clicks on the Maintanance screen under Request for Financing in french
    And User_607 Select Submission Reason in Maintanance screen
    Then User_607 Check the record Language in french

  @403177
  Scenario: 9.4 Create the DD based on the above facility
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click drawDown request under wifakApplication
    And Click Mainteance under drawDown request
    And Enter Facility Reference code
    And Enter drawdown type
    And Enter Description English and date
    And Click Drawdown Additional Details tab
    And Enter value Product ClassLN
    And Click save button IndrawDown Additional Details tab
    And Click verifyAndDeny under drawDownRequest
    And Select Record verifyAndDeny under draw Down Request
    And Click verify button In verifyAndDeny
    And Click Approve Reject under drawdown
    And Select Record In Approve Reject under drawdown
    And Approve The record In Approve Reject under drawdown
    And Click Mainteance under drawDown request
    And User_607 Select the record in Mainteance
    And User_607 Check the record Status
    And Click Mainteance under drawDown request
    And Enter Facility Reference code
    And Enter drawdown type
    And Enter Description English and date
    And Click Drawdown Additional Details tab
    And Enter value Product ClassLN
    And Click save button IndrawDown Additional Details tab
    And Click verifyAndDeny under drawDownRequest
    And Select Record verifyAndDeny under draw Down Request
    And User_607 Click Deny button In verifyAndDeny
    And Click Mainteance under drawDown request
    And User_607 Check the Status after Deny
    And Click Mainteance under drawDown request
    And Enter Facility Reference code
    And Enter drawdown type
    And Enter Description English and date
    And Click Drawdown Additional Details tab
    And Enter value Product ClassLN
    And Click save button IndrawDown Additional Details tab
    And Click verifyAndDeny under drawDownRequest
    And Select Record verifyAndDeny under draw Down Request
    And Click verify button In verifyAndDeny
    And Click Approve Reject under drawdown
    And Select Record In Approve Reject under drawdown
    And User_607 Reject the record in Approve Reject
    And User_607 Check the Status after Reject

  @824257
  Scenario: DASI190145 - Facility closure request:error during approve
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
    And Click Facilitie Managementunder wifakApplication
    And click Maintenance under Facilities Managementunder
    And select recordIn Maintenance under Facilities Management
    And Get Application code from the record
    And User_607 Click Facility Closure Request under WIFAK Application
    And User_607 Click maintaince under Facility Closure Request
    And User_607 Enter value in Facility Reference under maintaince
    And User_607 Click Save button In Mainteance under Facility Closure Request
    And User_607 Click Approve under Facility Closure Request
    And User_607 Select record in Approve under Facility Closure Request
    And User_607 ApproveRecord in Approve under Facility Closure Request
    And User_607 Click maintaince under Facility Closure Request
    And User_607 Select record in maintaince under Facility Closure Request
    And User_607 Check the Status in maintaince under Facility Closure Request
    And click Maintenance under Facilities Managementunder
    And select recordIn Maintenance under Facilities Management
    And Check the Status is in Closed

  @349582_2
  Scenario: DASI190145 - Facility closure request:error during approve
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User_607 Click Facility Closure Request under WIFAK Application
    #And User_607 Click reverse under Facility Closure Request
    #And User_607 Select Record In reverse under Facility Closure Request
    #And User_607 Click Reverse button Inreverse under Facility Closure Request
    #And User_607 Click Approve Reject Reverse under Facility Closure Request
    #And User_607 Select record In Approve Reject Reverse under Facility Closure Request
    #And User_607 Click Approve Reverse button In Approve Reject Reverse under Facility Closure Request
    And User_607 Click Query under Facility Closure Request
    And User_607 Select Record In Query under Facility Closure Request
    And User_607 Check Status In Query under Facility Closure Request

  @349582
  Scenario: Facility Closure Request
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
    And Click Facilitie Managementunder wifakApplication
    And click Maintenance under Facilities Managementunder
    And select recordIn Maintenance under Facilities Management
    And Get Application code from the record
    And User_607 Click Facility Closure Request under WIFAK Application
    And User_607 Click maintaince under Facility Closure Request
    And User_607 Enter value in Facility Reference under maintaince
    And User_607 Click Save button In Mainteance under Facility Closure Request
    And User_607 Click Approve under Facility Closure Request
    And User_607 Select record in Approve under Facility Closure Request
    And User_607 ApproveRecord in Approve under Facility Closure Request
    And User_607 Click reverse under Facility Closure Request
    And User_607 Select Record In reverse under Facility Closure Request
    And User_607 Click Reverse button Inreverse under Facility Closure Request
    And User_607 Click Approve Reject Reverse under Facility Closure Request
    And User_607 Select record In Approve Reject Reverse under Facility Closure Request
    And User_607 Click Approve Reverse button In Approve Reject Reverse under Facility Closure Request
    And User_607 Click Query under Facility Closure Request
    And User_607 Select Record In Query under Facility Closure Request
    And User_607 Check Status In Query under Facility Closure Request
    
    @570417
    Scenario: TSR - ITFCI170619
		Given navigate to FMS application2 and login with valid credentials
		And Click request under menu 
    And Click request financing
    And Click request for financing under request financing
    And Goto maintenace under request for financing under request financing
    And click the reason for submission search box
    And User_607 Existing Facility No In Mainteance under Request For Financing
		And User_607 Change Total limit In Mainteance under Request For Financing
#		And User_607 Check Finance Amount In Mainteance under Request For Financing
		And User_607 Click Disbursement Sublimit In Mainteance under Request For Financing
		And User_607 Check total limit In Disbursement Sublimit
		And User_607 Click Save button In Mainteance under Request For Financing
		And User_607 Click Validate button In Mainteance under Request For Financing
		And User_607 Click Approve Level1 under Request For Financing
		And User_607 Select Record In Approve Level1 under Request For Financing
		And User_607 Check total Ammount In Approve Level1 under Request For Financing
#		And User_607 Click Finance Amount In Approve Level1
		And User_607 Click Disbursement Sublimit In Approve Level1 under Request For Financing
		And User_607 Click Disbursement Sublimit In Disbursement Sublimi Approve Level1
		
		
		
			
		
		