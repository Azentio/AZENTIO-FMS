Feature: Committee Approval

@718066_01
Scenario: ABSAI190041 - Check the Approval committtee Recommendation flow in Application for financial facilities screen
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


@718066
Scenario: ABSAI190041 - Check the Approval committtee Recommendation flow in Application for financial facilities screen

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_CA_006
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button
And User_609 Click on the REQUEST FOR FINANCIN menu
And User_609 Click on the Request For Financing submenu
And User_609 Click on the Maintenance screen 
And User_609 Select the Reason For Submission field
And User_609 Select the Customer field
And User_609 Select the Facility Type
And User_609 Enter the Total Limit
And User_609 Click on the Disbursement or Sublimit tab
And User_609 Click on Add icon in Disbursement or sublimit tab
And User_609 Select the Product Class in Request
And User_609 Enter the New margin value
And User_609 Enable Clean flag in Product Class
And User_609 Click on Add in Product Class 
And User_609 Click the Save Button in Request Screen
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click Ok in Confirm pop up

And User_609 Click the Validate Button in Request Screen
And User_609 Click the confirm ok button
And User_609 Click the ok button

And User_609 Click Dismiss in Send Alert
