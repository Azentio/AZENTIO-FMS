Feature: To check the Collateral Management features

# Create a collateral and link collateral in facilities management
@AT_CM_043
Scenario: Open the facility management screen and link a collateral

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_CM_043
And User_608 clear the caches in FMS Application
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
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Status in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the any one row in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_608 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_608 click the Collateral details button in Facilities Management Maintanance under WIFAK Application
And User_608 click the add new icon in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_608 enter the Collateral code in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_608 Click the OK button in collateral details tab Facilities Management Maintanance under WIFAK Application
When User_608 click the Save Button under Maintanance under WIFAK Facilities Management
And User_608 click the Approve menu under Facilities Management in WIFAK Application
And User_608 get the test data for test case AT_CM_043
And User_608 enter the Application Ref code in search grid under Approve screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Approve screen under WIFAK Facilities Management
And User_608 click the Approve button in Approve screen under WIFAK Facilities Management


#Create a collateral and link collateral in facilities management and validate Effect date,until, and unutilize date should be available in additional tab
@AT_CM_044
Scenario: Open the facility management screen and link a collateral

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_CM_044
And User_608 clear the caches in FMS Application
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
And User_608 get the test data for test case AT_CM_044
And User_608 enter the Code in Collateral Management Approve screen search grid
And User_608 double click the Code Collateral Management Approve screen search grid
When User_608 click the approve button under Collateral Management approve screen
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Status in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the any one row in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 click the Additional details tab in Facilities Management Maintanance under WIFAK Application
And User_608 Validate Effective Date From field should be available in Additional details tab in Facilities Management under WIFAK Application
And User_608 Validate Effective until field should be available in Additional details tab in Facilities Management under WIFAK Application
And User_608 Validate Unutilized Expiry Date field should be available in Additional details tab in Facilities Management under WIFAK Application
And User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_608 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_608 click the Collateral details button in Facilities Management Maintanance under WIFAK Application
And User_608 click the add new icon in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_608 enter the Collateral code in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_608 Click the OK button in collateral details tab Facilities Management Maintanance under WIFAK Application
When User_608 click the Save Button under Maintanance under WIFAK Facilities Management
And User_608 click the Approve menu under Facilities Management in WIFAK Application
And User_608 get the test data for test case AT_CM_044
And User_608 enter the Application Ref code in search grid under Approve screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Approve screen under WIFAK Facilities Management
And User_608 click the Approve button in Approve screen under WIFAK Facilities Management




#Create a collateral and link collateral in facilities management and Change the  Effect until, and unutilize date in additional tab
@AT_CM_045
Scenario: Open the facility management screen and link a collateral

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_CM_045
And User_608 clear the caches in FMS Application
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
And User_608 get the test data for test case AT_CM_045
And User_608 enter the Code in Collateral Management Approve screen search grid
And User_608 double click the Code Collateral Management Approve screen search grid
When User_608 click the approve button under Collateral Management approve screen
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Status in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the any one row in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 click the Additional details tab in Facilities Management Maintanance under WIFAK Application
And User_608 change the Effective until field in Additional details tab in Facilities Management under WIFAK Application
And User_608 change the Unutilized Expiry Date field in Additional details tab in Facilities Management under WIFAK Application
And User_608 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_608 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_608 click the Collateral details button in Facilities Management Maintanance under WIFAK Application
And User_608 click the add new icon in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_608 enter the Collateral code in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_608 Click the OK button in collateral details tab Facilities Management Maintanance under WIFAK Application
When User_608 click the Save Button under Maintanance under WIFAK Facilities Management
And User_608 click the Approve menu under Facilities Management in WIFAK Application
And User_608 get the test data for test case AT_CM_045
And User_608 enter the Application Ref code in search grid under Approve screen in WIFAK Facilities Management
And User_608 double click on the search grid first row in Approve screen under WIFAK Facilities Management
And User_608 click the Approve button in Approve screen under WIFAK Facilities Management






