 Feature: To Test the iisparam application
@AT_iis_143
Scenario: Check basic functionality of charge module
Given user_143 navigate to the IISParam application and login with the valid credentials
Then user_143 update test data set id for AT_IISPRM_058
And user_143 click on parameters tab
And user_143 click on charge
And user_143 click on maintenance and create a record
And user_143 enter code brief description long description
And user_143 click on additional detail 
And user_143 click on save button
@AT_RF_143
Scenario: create request
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
And User_482 Update Test data set for AT_RF_064
And User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN
And User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Disbursement or Sublimit 
And User Click on Add button in Disbursement or Sublimit 
And User Enter productclass 
And User Click on Add button 
And User click on feesCharges tab

