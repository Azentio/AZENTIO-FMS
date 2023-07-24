Feature: Validate the Collateral Management module features
@AT_CM_003
Scenario: AIBBI190384 - Collateral Coverage Issue
Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_CM_003
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

@AT_CM_004
Scenario: BBLI190262 - Collateral- Amending the description of the field is reflecting on all the fields
Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_CM_004
And User click on the Collateral Management feature
And User click on the Maintanace screen under Collateral Management
And User enter the Collateral type under main information in Collateral Management main Screen
And User give the valid from date under main information in Collateral Management main Screen
And User give the valid to date under main information in Collateral Management main Screen
And User enter the Collateral currency under main information in Collateral Management main Screen
And User enter the brief description under main information in Collateral Management main Screen
And User enter the long description under main information in Collateral Management main Screen
And Navigate to Additional details tab in Collateral management
And Click on Advanced Options in Home page
And Select Setting option in Advanced options dropdown
And Click on Pencil icon on top of FC Value in Market Value section
And Update the field label to Market FC Value in labeling page
And Click on Save icon in Labeling page
And Clic on ok button on approved successful popup
And Close the labeling window
And User click on the Maintanace screen under Collateral Management
And Click on OK button in Warning popup in collateral management
And User enter the Collateral type under main information in Collateral Management main Screen
And User give the valid from date under main information in Collateral Management main Screen
And User give the valid to date under main information in Collateral Management main Screen
And User enter the Collateral currency under main information in Collateral Management main Screen
And User enter the brief description under main information in Collateral Management main Screen
And User enter the long description under main information in Collateral Management main Screen
And Navigate to Additional details tab in Collateral management
And Validate the field name is changed to Market FC Value in Market value section

@AT_CM_006
Scenario: ABSAI190356 - Collateral Allocated Amount is showing wrong in Collateral Details in FMS
Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_CM_006
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

@AT_RF_027
Scenario: TSR - RIDB180198
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


@AT_RF_105
Scenario: TSR - BTII170131
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

@AT_CM_005
Scenario: AIBBI190408 - Linked/Unlinked collateral headings
Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_CM_005
And Navigate to 360 degrees view
And Enter the existing CIF no in CIF no field
And Click on Close icon in View memo section
And Click on View grid button in 360 degrees view
And Click on Collateral link in 360 degrees view
And Validate that Linked and Unlinked collaterals is displayed in 360 degrees view

@AT_CM_007
Scenario: BBLI190331 - When defining a collateral with favoring party (without percentage%), the collateral will be displayed more than one in 360 Deg
Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_CM_007
And Navigate to 360 degrees view
And Enter the existing CIF no in CIF no field
And Click on View grid button in 360 degrees view
And Click on Collateral link in 360 degrees view
And Click on Cy 840 - USD Link
And Validate the respective collateral ID is displayed


@AT_CM_008
Scenario: AIBBI190495 - Show Details Button is not Visible at Collateral Screen in 360 Degree View
Given navigate to FMS application and login with valid credentials
And get the test data for test case AT_CM_008
And Navigate to 360 degrees view
And Enter the existing CIF no in CIF no field
And Click on View grid button in 360 degrees view
And Click on Collateral link in 360 degrees view
And Click on Cy 840 - USD Link
And Click on Query button in 360 degrees view
And Validate Show details button is present in Collateral section
And Validate JV Details button is present in Collateral section




