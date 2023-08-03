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




