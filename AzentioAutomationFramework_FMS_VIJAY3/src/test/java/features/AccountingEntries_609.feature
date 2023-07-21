
Feature: Accounting Entries

@814025_01
Scenario: Retrieving data. Wait a few seconds and try to cut or copy again
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_AE_003
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
And User_609 Enable Committee Approval flag
And User_609 Enable Credit Authorization flag
And User_609 Enable IssueFacilityOffer flag
And User_609 Enable Client Response flag
And User_609 Enable Document Validation flag
And User_609 Enable Final Approval flag
And User_609 Enable Automatically Approve Facility If Within Limits flag
And User_609 Enable Create Active Facility If Within Limits flag
And User_609 Click on Update
And User_609 Click the Application confirm ok button
And User_609 Click the ok button
And User_609 Click on Approve Screen
And User_609 Select the Code in Approve Screen
And User_609 Click on Approve 
And User_609 Click the Application confirm ok button
And User_609 Click the ok button



@814025

Scenario: Retrieving data. Wait a few seconds and try to cut or copy again

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_AE_003
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

And User_609 Select the GL Code 
And User_609 Enable the Clean Flag

And User_609 Click on the add button

And User_609 Click on Charges Details label
And User_609 Click and select the Charges Details

And User_609 Click on the Document Details tab
And User_609 Select the Solicitor Name 
And User_609 Select the Estimator Name 

And User_609 Click the save button
And User_609 Click the Application confirm ok button
And User_609 Click the ok button
And User_609 Click the validate button

And User_609 Click on Dismiss if Send Alert pop up appears

And User_609 Click on the Approve level1 Screen
And User_609 Select the Code in Approve level1 
And User_609 Select the Decision in Approve level1
And User_609 Select the More Decision in Approve level1
And User_609 Click on Submit in Approve Level1
And User_609 Click the Application confirm ok button
And User_609 Click the ok button
And User_609 Click on the Approve level3 Screen
And User_609 Select the Code in Approve level3 
And User_609 Select the Decision in Approve level3
And User_609 Click on Submit in Approve Level3
And User_609 Click the Application confirm ok button
And User_609 Click the ok button

And User_609 Click on the Facilities Management submenu
And User_609 Click on the Maintenance Screen under Facilities Management submenu
And User_609 Click on the Search
And User_609 Click on the Clear
And User_609 Select the Code in Facilities Management under Wifak Application 	

And User_609 Click on Journal Voucher Details in Facilities Management under Wifak Application
Then User_609 Validate the Journal Voucher Details is Displayed in Facilities Management under Wifak Application


@400863

Scenario: IIAB150404 - Accounts validation are generating while defining the Finance Account @ Facility Level

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_AE_003
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Facilities Management submenu
And User_609 Click on the Maintenance Screen under Facilities Management submenu

And User_609 Select the Application Reference in Facilities Management
And User_609 Click Yes in Post Approval Popup
And User_609 Click on Facility Limit Details tab in Facilities Management
And User_609 Select the Product Class in Facilities Management
Then User_609 Validate the Accounts are Generating


















@400865

Scenario: IIAB150404 - Change Facility Currency When the Finance Account is base CY

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_AE_008
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
And User_609 Enable the Clean Flag
And User_609 Click on the add button
And User_609 Click on the Document Details tab
And User_609 Select the Solicitor Name 
And User_609 Select the Estimator Name 
And User_609 Click the save button
And User_609 Click the Application confirm ok button
And User_609 Click the ok button
And User_609 Click the validate button
And User_609 Click on Dismiss if Send Alert pop up appears
And User_609 Click on the Approve level1 Screen
And User_609 Select the Code in Approve level1 
And User_609 Select the Decision in Approve level1
And User_609 Select the More Decision in Approve level1
And User_609 Click on Submit in Approve Level1
And User_609 Click the Application confirm ok button
And User_609 Click the ok button
And User_609 Click on the Approve level3 Screen
And User_609 Select the Code in Approve level3 
And User_609 Select the Decision in Approve level3
And User_609 Click on Submit in Approve Level3
And User_609 Click the Application confirm ok button
And User_609 Click the ok button

And User_609 Click on Draw Down Request
And User_609 Click on Maintenance screen under Draw Down Request
And User_609 Select the Facility Reference in Draw Down Request
And User_609 Select the DrawDown Type in Draw Down Request
And User_609 Enter the Value in Description English field in Draw Down Request
And User_609 Enter the Value in Description Arab field in Draw Down Request
And User_609 Enter the Value in Value Date field in Draw Down Request
And User_609 Click on the Drawdown Additional Details in Draw Down Request
And User_609 Select the Product Class in Draw Down Request
And User_609 Select the DrawDown CY in Draw Down Request
And User_609 Enter the FC Amount Value in Draw Down Request
And User_609 Click on Save in Draw Down Request
And User_609 Click the Application confirm ok button




