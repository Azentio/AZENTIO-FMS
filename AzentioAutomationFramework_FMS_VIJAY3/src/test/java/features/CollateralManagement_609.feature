Feature: Collateral Management

@834115
Scenario: ABEI190325 - Missing Collateral Information Error upon Modifying Facility


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
And User_609 Click on the Application Requirements and Details in Facility Details tab
And User_609 Select the Collateral 
And User_609 Click on Update
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click on Approve Screen
And User_609 Select the Code in Approve Screen
And User_609 Click on Approve 
And User_609 Click the confirm ok button
And User_609 Click the ok button




#And User_609 get the test data set id for AT_CM_011
#Given navigate to FMS application and login with valid credentials2
#And User_609 Click on the WIFAK APPLICATION menu 
#And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
#And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
#And User_609 Click on the Maintenance screen under Application For Financial Facilities
#And User_609 Select the Application For field in Maintenance screen
#And User_609 Select the CIF No in Main Information tab
#And User_609 Select the Facility Type in Main Information tab
#And User_609 Click the Country of Financing in Main Information tab
#And User_609 Select the Facility Rating
#And User_609 Click on the Additional Details tab
#And User_609 Select the Currency Code
#And User_609 Enter the Total Value  
#And User_609 Select the Offer/Expiration 
#And User_609 Click on the Limit Details tab
#And User_609 Click on the add new row icon 
#And User_609 Click on Product Class search icon
#And User_609 Select the Product Class 
#And User_609 Check the clean flag is enabled
#And User_609 Click on the add button
#And User_609 Click on the Document Details tab
#And User_609 Click on Solicitor Name search icon
#And User_609 Select the Solicitor Name 
#And User_609 Click on Estimator Name search icon
#And User_609 Select the Estimator Name 
#And User_609 Click the save button
#And Click the confirm ok button
#And Click the ok button  
#And User_609 Click the validate button
#And Click the confirm ok button

