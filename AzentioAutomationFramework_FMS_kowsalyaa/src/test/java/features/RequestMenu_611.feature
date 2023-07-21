Feature: To validate FMs Application

  @127919_Fms_Core
  Scenario: To check the new modification @ FMS corporate screens in the  request for finance screen.
    Given navigate to FMS application and login with valid credentials
    And User_611 clicks the Request Menu under fms application
    And User_611 validate the facility management Menu are available in request financing
    And User_611 validate the sub menus are available in request for financing menu

  @127920_Fms_Core
  Scenario: To check the new modification @ FMS Modification in Request for Financing - DD Screen and the editability of the new fields.
    Given navigate to FMS application and login with valid credentials
    And User_611 clicks the Request Menu under fms application
    And User_611 clicks the Request Financing under request menu
    And User_611 clicks the Request For Financing under Request Financing
    And User_611 clicks the Maintenence Menu under Request For Financing
    And User_611 clicks the Reason for Submission as New facility
    And User_611 enter the Customer number in cif details
    And User_611 enter the facility type number
    And User_611 enter the total limit number
    And User_611 clicks the disbursement and sublimit tab
    And User_611 clicks the add button
    And User_611 enter the product class value
    And User_611 enter the margin number
    And User_611 enter the floating rate
    And User_611 enter the floating rate periodicity number
    And User_611 enter the floating rate periodicity month
    And User_611 clicks the productclassvalues add button
    And User_611 clicks the save button
    And User_611 clicks the validate button
    And User_611 clicks the Approval level1
    And User_611 enter the request code in search box
    And User_611 clicks the customer Grading Recommendations Tab
    And User_611 select the decision dropdown
    And User_611 select the Forwardto dropdown
    And User_611 select the Approval committee dropdown
    And User_611 clicks the Approve button
    And User_611 click the Approval committee recommendation under Request for Financing
    And User_611 enter the code in Approval committee recommendation under Request for Financing
    And User_611 double click on the first row in Approval committee recommendation under Request for Financing
    And User_611 move to credit committee recommendation tab in approval committee under Request for Financing
    And User_611 click the Recommendation division in credit committee under approval committee
    And User_611 click the plus icon in Recommendation division under credit committee
    And User_611 select the Recommendation dropdown in Recommendation division under credit committee
    And User_611 click the Recommendation button under Approval committee recommendation
    And User_611 clicks the facility management menu under Request Financing
    And User_611 clicks the maintenance menu under facility management
    And User_611 clicks the Infosearchbox
    And User_611 enter the Application Ref code 
    And User_611 clicks the Draw Down Request under Request Financing
    And User_611 clicks the Maintenence under Draw Down Request
    And User_611 enter the facility reference value
    And user_611 enter the Drawdown type
    And User_611 enter the Discription English
    And User_611 enter the Discription arab
    And User_611 enter the date in date submitted
    And User_611 enter the date in value date
    And User_611 clicks the Drawdown Additional Details Tab
    And User_611 enter the product class L and N
    
    @809575_Fms_Core
    Scenario: JAIZUP190085 - error message with facility request
    Given navigate to FMS application and login with valid credentials
    And User_611 clicks the Request Menu under fms application
    And User_611 clicks the Request Financing under request menu
    And User_611 clicks the Request For Financing under Request Financing
    And User_611 clicks the Maintenence Menu under Request For Financing
    
    @288807
    Scenario:Check the new text field in Customer Grading &Recommendations Tab against each ‘Recommendation’ fields in Request for Finance
    Given navigate to FMS application and login with valid credentials
    And User_611 clicks the Request Menu under fms application
    And User_611 clicks the Request Financing under request menu
    And User_611 clicks the Request For Financing under Request Financing
    And User_611 clicks the Maintenence Menu under Request For Financing
    
    
    
