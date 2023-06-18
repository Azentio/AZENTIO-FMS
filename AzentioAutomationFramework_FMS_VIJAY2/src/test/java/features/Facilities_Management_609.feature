
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
And User_609 Enter the Total Limit	
And User_609 Click on the Disbursement or Sublimit tab
And User_609 Click the add new row icon
And User_609 Select the Product Class
And User_609 Enter the value in New Margin field
And User_609 Click the Add Button
And User_609 Click the Save Button
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click the Validate Button
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click on the Approve Level1 submenu
And User_609 Select the Code in Approve Level1 submenu
And User_609 Click on the Customer Grading Recommendations tab
And User_609 Select the Decision
And User_609 Select the More Recommendatiions
And User_609 Select the Approval Committee
And User_609 Click on Approve Button
And User_609 Click on the Approval Committee Recommendations submenu
And User_609 Select the Code in Approval Committee Recommendations Submenu
And User_609 Click the Credit Committee Recommendations tab
And User_609 Click on the Recommendations Label
And User_609 Click on the Recommendations icon 
And User_609 Select the Approval Committee Recommendations field
And User_609 Click on Approve Button in Approval Committee Recommendations submenu
And User_609 Click on Search in REQUEST FOR FINANCIN menu
And User_609 Click on Clear in REQUEST FOR FINANCIN menu



