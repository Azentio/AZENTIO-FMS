Feature: Authorize_Reject

  @140578_AlertEnable
  Scenario: Check Enable alert in fsm parameter
    Given navigate to FMS param application and login with valid credentials
    And User_610 clicks on the parameter module
    And User_482 click Control record Sub Menu
    And User_482 click Update After Approve in control record
    And User_482 Check the Enable Alerts check box
    And User_482 click update button in Update after approve
    And User_482 click approve screen in Control records
    And User_482 click approve button in aaprove screen
    
    
    @140578_FacilityFlags
    Scenario: Check and Uncheck the flags in FacilityType FMS_params
    Given navigate to FMS param application and login with valid credentials
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu for req
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
    And User_610 enter the code value in Approve menu for req
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type
    
    @140578_Login_For_Alert
    Scenario: Login_For_alert
    Given navigate to FMS application2 and login with valid credentials for alert

  @140578
  Scenario: Check the Alert Response message received to User A from User B from Authorize/Reject application screen
    Given navigate to FMS application2 and login with valid credentials
    And User update test data for test case no 853171
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

  @140578_2
  Scenario: Check the Alert Response message received to User A from User B from Authorize/Reject application screen
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
    And User_607 Click Authorize button In Authorize Reject Under Request For Financing for alert
    And User_607 Search User in Alert Popup
    And User_607 Select User in Alert Popup
    And User_607 Click Send button in Alert Popup
   
    @140578_Login_For_Alert2
    Scenario: Login_For_alert
    Given navigate to FMS application2 and login with valid credentials for alert
    And User_607 Click Open items in Alert popup
    
    
    
    
    
    
    
    
    
