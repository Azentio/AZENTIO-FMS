
Feature: Facilities Management
@299879
Scenario: JAIZ130083 - ERROR WHILE CREATING A FACILITY REQUEST
Given navigate to FMS param application and login with valid credentials2
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu  
And User_609 Click on Update After Approve Screen
And User_609 Select the Code in Update After Approve Screen
And User_609 Click on the Facility Details Tab
And User_609 Click on the STP Facility Requirements in Facility Details Tab
And User_609 Disable Mandatory Customer Grading flag
And User_609 Enable Customer Grading flag 
And User_609 Enable Overwrite Grading flag
And User_609 Enable Credit Review flag
And User_609 Disable Committee Approval flag
And User_609 Enable Credit Authorization flag
And User_609 Enable IssueFacilityOffer flag
And User_609 Enable Client Response flag
And User_609 Enable Document Validation flag
And User_609 Enable Final Approval flag
And User_609 Enable Automatically Approve Facility If Within Limits flag
And User_609 Enable Create Active Facility If Within Limits flag
And User_609 Click on Update
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click on Approve Screen
And User_609 Select the Code in Approve Screen
And User_609 Click on Approve 
And User_609 Click the confirm ok button
And User_609 Click the ok button

@299879_01
Scenario: JAIZ130083 - ERROR WHILE CREATING A FACILITY REQUEST

Given navigate to FMS application and login with valid credentials2
And User_609 Click on the REQUEST FOR FINANCIN menu
And User_609 Click on the Request For Financing submenu
And User_609 Click on the Maintenance screen 
And User_609 Select the Reason For Submission field
And User_609 Enter the value in Customer field
And User_609 Select the Facility Type in Facility Type Details tab
And User_609 Select the Revolving/One-Off in Facility Type Details tab


@569729
Scenario: ICD160045 -Facility Type
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_FM_089
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu  
And User_609 Click on Maintenance Screen in Facility Type submenu
And User_609 Click on the Facility Details Tab in Maintenance Screen
#(Blocked)And User_609 Check the Apply Global Limit is Unchecked By default  


@570687
Scenario: ICD160045 -Global Limit- Facility Management
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_FM_088
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Select the Country of Financing in Main Information tab
And User_609 Select the Facility Rating
And User_609 Click on the Additional Details tab
And User_609 Select the Currency Code
And User_609 Enter the Total Value  
And User_609 Select the Offer/Expiration 
Then User_609 Check the Global Limit Code is enabled
Then User_609 Check the Actual Limit Utilized is enabled

@586385
Scenario: Check that the “Draw Down Types” are reflected at the level of “Facility Management – Suspend” screen - "T008SP"
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_FM_087
And User_609 Click on the Parameters menu
And User_609 Click on the Suspend Reasons submenu
And User_609 Click on the Maintenance screen in Suspend Reasons submenu
And User_609 Enter the Code in Suspend Reasons Maintenance screen
And User_609 Enter the Brief name Suspend Reasons Maintenance screen
And User_609 Enter the Long name Suspend Reasons Maintenance screen
And User_609 Enter the Brief name in Arab in Suspend Reasons Maintenance screen
And User_609 Enter the Long name in Arab in Suspend Reasons Maintenance screen
And User_609 Click on Save in Suspend Reasons
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click on the Approve screen in Suspend Reasons submenu
And User_609 Select the Code in Approve screen under Suspend Reasons submenu
And User_609 Click on Approve in Suspend Reasons submenu
And User_609 Click the confirm ok button
And User_609 Click the ok button

Given navigate to FMS application and login with valid credentials2
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Facilities Management under WIFAK APPLICATION submenu
And User_609 Click on the Suspend screen under Facilities Management
And User_609 Retrieve any record from the Suspend screen
Then User_609 Click on Suspend Button to check Whether the application is suspended without Suspend Reason
Then User_609 Check the Suspend Reason Code is Displayed and Select the Code
Then User_609 Check the Suspend Reason Description is Displayed
And User_609 Click on Suspend Button
And User_609 Click the confirm ok button
And User_609 Click the ok button


@535114
Scenario: BIPL160092-Facility DrawDown Creation-One Off
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_FM_086
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu  
And User_609 Click on Update After Approve Screen
And User_609 Select the Code in Update After Approve Screen
And User_609 Select Revoloving or OneOff option in Main Details Tab 
And User_609 Click on the Facility Details Tab
And User_609 Click on the STP Facility Requirements in Facility Details Tab
And User_609 Disable Mandatory Customer Grading flag
And User_609 Enable Customer Grading flag 
And User_609 Enable Overwrite Grading flag
And User_609 Enable Credit Review flag
And User_609 Enable Committee Approval flag
And User_609 Enable Credit Authorization flag
And User_609 Enable IssueFacilityOffer flag
And User_609 Enable Client Response flag
And User_609 Enable Document Validation flag
And User_609 Enable Final Approval flag
And User_609 Enable Automatically Approve Facility If Within Limits flag
And User_609 Enable Create Active Facility If Within Limits flag
And User_609 Click on the Application Requirements and Details Tab
And User_609 Enable Allow to add sublimit in multiple groups flag
And User_609 Click on Update
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click on Approve Screen
And User_609 Select the Code in Approve Screen
And User_609 Click on Approve 
And User_609 Click the confirm ok button
And User_609 Click the ok button

@535114_01
Scenario: BIPL160092-Facility DrawDown Creation-One Off
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_FM_086
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Select the Country of Financing in Main Information tab
And User_609 Select the Facility Rating
And User_609 Click on the Additional Details tab
And User_609 Select the Currency Code
And User_609 Enter the Total Value  
And User_609 Select the Offer/Expiration 
And User_609 Click on the Limit Details tab
And User_609 Click on the add new row icon 
And User_609 Select the Product Class 
And User_609 Click on the add button
And User_609 Click on the Group Limit in Limit Details Tab
And User_609 Add Group Limit Details Value1
And User_609 Add Group Limit Details Value2 
And User_609 Click on Group Limit Ok
And User_609 Click on the Group Id in Limit Details Tab
And User_609 Select the Group Id Value1
And User_609 Select the Group Id Value2
And User_609 Click on Group ID Ok
And User_609 Click on the Document Details tab
And User_609 Select the Solicitor Name 
And User_609 Select the Estimator Name 
And User_609 Click the save button
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click the validate button
And User_609 Click the confirm ok button
And User_609 Click Yes if Confirm Alert appears
And User_609 Click the ok button
And User_609 Click on Dismiss if Send Alert pop up appears
And User_609 Click on the Approve level1 Screen
And User_609 Select the Code in Approve level1 
And User_609 Select the Decision in Approve level1
And User_609 Click on ApproveLevel1 Submit 
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click on the Approve level3 Screen
And User_609 Select the Code in Approve level3 
And User_609 Select the Decision in Approve level3
And User_609 Click on ApproveLevel3 Submit
And User_609 Click the confirm ok button
And User_609 Click the ok button


And User_609 Click on the Facilities Management submenu
And User_609 Click on the Maintenance Screen under Facilities Management submenu
And User_609 Click on the Search
And User_609 Click on the Clear
And User_609 Extract Code from Maintenance Screen 
And User_609 Click on the Save Button









And User_609 Click on the Draw Down Request under Wifak Appliction Submenu
And User_609 Click on the Maintenace Screen under Draw Down Request 
And User_609 Select the Facility Reference
And User_609 Select the Drawdown Type
And User_609 Enter the Description in English
And User_609 Enter the Description in Arab
And User_609 Enter the Date Submitted
And User_609 Enter the Value Date
And User_609 Click on the Drawdown Additional Details tab
And User_609 Select the product Class LN Key
And User_609 Click on Save in Draw Down Request





