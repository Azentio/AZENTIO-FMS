Feature: To check the Collateral Management module features

@AT_RF_035
Scenario: TSR - SBYB160013

Given navigate to FMS application and login with valid credentials
And User click on the language option in FMS core
And User click on the arabic under language option
And User clicks on the the mortgage management module
And User clicks on the Maintanance screen under mortgage management module
And User verify the Maintanance screen should be arabic language

@AT_RF_158
@AT_RF_158_Param
Scenario: TSR - AIBBI180226

Given navigate to FMS param application and login with valid credentials
And get the test data for test case AT_RF_158_Param
And User clicks on the parameter module
And User clicks on the Collateral type module
And User clicks on the Maintanance screen under Collateral type
And User enter the code under Collateral Type main screen
And User enter the Brief description under Collateral Type main screen
And User enter the Long description under Collateral Type main screen
And User select the Asset type as cash under Collateral Type main screen
When User clicks on the save button under Collateral Type main screen
And User clicks on the Approve screen under Collateral Type
And User search the code under Collateral Type approve screen
And User double click on the searched result under Collateral Type approve screen
When User clicks on the Approve button under Collateral Type approve screen


@AT_RF_158
@AT_RF_158_Core
Scenario: TSR - AIBBI180226

Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_RF_158_Core
And User click on the Collateral Management feature
And User click on the Maintanace screen under Collateral Management
And User enter the Collateral type under main information in Collateral Management main Screen
And User give the valid from date under main information in Collateral Management main Screen
And User give the valid to date under main information in Collateral Management main Screen
And User enter the Collateral currency under main information in Collateral Management main Screen
And User enter the brief description under main information in Collateral Management main Screen
And User enter the long description under main information in Collateral Management main Screen
And User move to the Collateral cash details tab in Collateral Management main Screen
And User click the add new icon under Collateral cash details tab
And User click the additional reference lookup under Collateral cash details tab
And User select the any cy value under additional reference lookup
And User enter the amount value under Collateral cash details tab
When User click the save button under Collateral Management main Screen
And User move to the Approve screen undrer Collateral Management
And User click the clear button under approve screen in Collateral Management
And User double click on the first row in approve screen
When User click the approve button under Collateral Management approve screen


