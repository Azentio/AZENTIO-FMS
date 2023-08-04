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
And User_611 get the test data for test case AT_RF_169
And User_611 clear the caches in FMS Application
And User_611 clicks the Request Menu under fms application
And User_611 clicks the Request Financing under request menu
And User_611 clicks the Request For Financing under Request Financing
And User_611 clicks the Maintenence Menu under Request For Financing
And User_611 select the Reason for submission under main screen in Request for Financing
And User_611 enter the CIF no in main screen under Request for Financing
And User_611 enter the facility type in main screen under Request for Financing
And User_611 enter the total limit in main screen under Request for Financing
And User_611 move to the sublimit tab in main screen under Request for Financing
And User_611 click the add new button in sublimit tab under main screen in Request for Financing
And User_611 enter the product class in limit details tab under sublimit tab
And User_611 enter the margin value in limit details tab under sublimit tab
And User_611 click the add button in limit details tab under sublimit tab
When User_611 click the Save button in main screen under Request for Financing
And User_611 click the Validate button in main screen Request for Financing
Then User_611 click the approve level1 under Request for Financing
And User_611 get the test data for test case AT_RF_169
And User_611 enter the request code in approve level1 under Request for Financing
And User_611 double click on the first row in approve level1 under Request for Financing
And User_611 move to customer grading tab in approve level1 under Request for Financing
And User_611 select the approve level1 recommendation decision as forward in approve level1 under Request for Financing
And User_611 select the decision forward to as approval committee in approve level1 under Request for Financing
And User_611 select the approval committee in approve level1 under Request for Financing
And User_611 click the Approve button in approve level1 under Request for Financing
Then User_611 click the Approval committee recommendation under Request for Financing
And User_611 enter the code in Approval committee recommendation under Request for Financing
And User_611 double click on the first row in Approval committee recommendation under Request for Financing
And User_611 move to credit committee recommendation tab in approval committee under Request for Financing
And User_611 click the Recommendation division in credit committee under approval committee
And User_611 click the plus icon in Recommendation division under credit committee
And User_611 select the Recommendation dropdown in Recommendation division under credit committee
When User_611 click the Recommendation button under Approval committee recommendation
And User_611 clicks the Facilities Management feature under Request Financing
And User_611 clicks the Maintanance in Facilities Management under Request Financing
And User_611 click the search button in maintanance screen under Facilities Management
And User_611 search the facility with CIF number in maintanance screen under Facilities Management
Then User_611 retrieve the facility in maintanance screen under Facilities Management
 And User_611 clicks the Draw Down Request under Request Financing
 And User_611 clicks the Maintenence in Draw Down Request under request for financing
And User_611 enter the facility reference value in drawdown request under request for financing
And user_611 enter the Drawdown type in drawdown request under request for financing
And User_611 enter the Discription English in drawdown request under request for financing
And User_611 enter the Discription arab in drawdown request under request for financing
And User_611 enter the date in date submitted in drawdown request under request for financing
And User_611 enter the date in value date in drawdown request under request for financing
 And User_611 clicks the Drawdown Additional Details Tab in drawdown request under request for financing
And User_611 enter the product class L and N  in drawdown request Additional details tab under request for financing
    
   
    
    @809575_Fms_Core
    Scenario: JAIZUP190115 - error message with facility request
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
    
    
    
