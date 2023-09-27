Feature: Colletral Management

@280606
Scenario: IIAB150095 - Error while updating collateral.
Given navigate to FMS application and login with valid credentials
And User_611 click Technical details
And User_611 click clear caches
And User_611 Click the ok button in clear cache
And User_611 Get the data set Id for AT_CM_030
And User_611 click on the Collateral Management feature
And User_611 click on the Maintanace screen under Collateral Management
And User_611 enter the Collateral type under main information in Collateral Management main Screen
And User_611 give the valid from date under main information in Collateral Management main Screen
And User_611 give the valid to date under main information in Collateral Management main Screen
And User_611 enter the Collateral currency under main information in Collateral Management main Screen
And User_611 enter the brief description under main information in Collateral Management main Screen
And User_611 enter the long description under main information in Collateral Management main Screen
And User_611 move to the Collateral cash details tab in Collateral Management main Screen
And User_611 click the add new icon under Collateral cash details tab
And User_611 click the additional reference lookup under Collateral cash details tab
And User_611 select the any cy value under additional reference lookup
And User_611 enter the amount value under Collateral cash details tab
When User_611 click the save button under Collateral Management main Screen
And User_611 move to the Approve screen under Collateral Management
#And User_611 get the test data for test case AT_CM_043
And User_611 enter the Code in Collateral Management Approve screen search grid
And User_611 double click the Code Collateral Management Approve screen search grid
When User_611 click the approve button under Collateral Management approve screen