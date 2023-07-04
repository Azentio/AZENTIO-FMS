Feature: To check the Collateral Management features

@AT_CM_043
Scenario: Open the facility management screen and link a collateral

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_CM_043
And User_608 click on the Collateral Management feature
And User_608 click on the Maintanace screen under Collateral Management
And User_608 enter the Collateral type under main information in Collateral Management main Screen
And User_608 give the valid from date under main information in Collateral Management main Screen
And User_608 give the valid to date under main information in Collateral Management main Screen
And User_608 enter the Collateral currency under main information in Collateral Management main Screen
And User_608 enter the brief description under main information in Collateral Management main Screen
And User_608 enter the long description under main information in Collateral Management main Screen
And User_608 move to the Collateral cash details tab in Collateral Management main Screen
And User_608 click the add new icon under Collateral cash details tab
And User_608 click the additional reference lookup under Collateral cash details tab
And User_608 select the any cy value under additional reference lookup
And User_608 enter the amount value under Collateral cash details tab
When User_608 click the save button under Collateral Management main Screen
And User_608 move to the Approve screen under Collateral Management
And User_608 get the test data for test case AT_CM_043
And User_608 enter the Code in Collateral Management Approve screen search grid
And User_608 double click the Code Collateral Management Approve screen search grid
When User_608 click the approve button under Collateral Management approve screen

And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
