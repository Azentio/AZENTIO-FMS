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
And User_609 Click Ok in Confirm pop up
And User_609 Click the ok button


And User_609 Click the Validate Button in Request Screen
And User_609 Click the confirm ok button
And User_609 Click Ok in Confirm pop up
And User_609 Click the ok button

And User_609 Click Dismiss in Send Alert

And User_609 Click on Approve Level1 in Request Screen
And User_609 Select the Code in Approve Level1 in Request Screen
And User_609 Click on Customer Grading Recommendations in Approve Level1 in Request Screen
And User_609 Select the Decision in Approve Level1 in Request Screen

And User_609 Click on Approve in Approve Level1 in Request Screen
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click Dismiss in Send Alert



@802723
Scenario: ABSAI190041 - Check the Approval committtee Recommendation flow in Application for financial facilities screen
Given navigate to FMS application and login with valid credentials2
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button
And User_609 get the test data set id for AT_CA_003
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
And User_609 Enable the clean flag in Product class
And User_609 Click on the add button
And User_609 Click on the Document Details tab
And User_609 Select the Solicitor Name 
And User_609 Select the Estimator Name 
And User_609 Click the save button
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click the validate button
#And User_609 Click the Application confirm ok button
#And User_609 Click Yes if Confirm Alert appears
#And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up appears
And User_609 Click on the Approve level1 Screen
And User_609 Select the Code in Approve level1 
And User_609 Select the Decision in Approve level1
And User_609 Click on Submit in Approve Level1 
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on the Approve level2 Screen
And User_609 Select the Code in Approve level2 
And User_609 Select the Decision in Approve level2
And User_609 Click on Submit in Approve Level2 
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on the Approve level3 Screen
And User_609 Select the Code in Approve level3
And User_609 Select the Decision in Approve level3
And User_609 Select the More Decision in Approve level3
And User_609 Click on Submit in Approve Level3
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up1 appears
And User_609 Click on Approval Committee Recommendations in Wifak Application
And User_609 Select the Code in Approval Committee Recommendations
And User_609 Click Recommend button in Approval Committee Recommendations
And User_609 Click the Application confirm ok button
And User_609 Select the decision in Approval Committee Recommendations
And User_609 Click on Ok in Approval Committee Recommendations

@814432
Scenario: JAIZUP180090 - Committee Approval Is Recommended
Given navigate to FMS application and login with valid credentials2
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button
And User_609 get the test data set id for AT_CA_004
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
And User_609 Enable the clean flag in Product class
And User_609 Click on the add button
And User_609 Click on the Document Details tab
And User_609 Select the Solicitor Name 
And User_609 Select the Estimator Name 
And User_609 Click the save button
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click the validate button
#And User_609 Click the Application confirm ok button
#And User_609 Click Yes if Confirm Alert appears
#And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up appears
And User_609 Click on the Approve level1 Screen
And User_609 Select the Code in Approve level1 
And User_609 Select the Decision in Approve level1
And User_609 Click on Submit in Approve Level1 
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on the Approve level2 Screen
And User_609 Select the Code in Approve level2 
And User_609 Select the Decision in Approve level2
And User_609 Click on Submit in Approve Level2 
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on the Approve level3 Screen
And User_609 Select the Code in Approve level3
And User_609 Select the Decision in Approve level3
And User_609 Select the More Decision in Approve level3
And User_609 Click on Submit in Approve Level3
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up1 appears
And User_609 Click on Approval Committee Recommendations in Wifak Application
And User_609 Select the Code in Approval Committee Recommendations
And User_609 Click Recommend button in Approval Committee Recommendations
And User_609 Click the Application confirm ok button
And User_609 Select the decision in Approval Committee Recommendations
And User_609 Click on Ok in Approval Committee Recommendations





@765243
Scenario: DASI180596 - Committee should be right for collective funding
Given navigate to FMS application and login with valid credentials2
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button
And User_609 get the test data set id for AT_CA_005
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
And User_609 Enable the clean flag in Product class
And User_609 Click on the add button
And User_609 Click on the Document Details tab
And User_609 Select the Solicitor Name 
And User_609 Select the Estimator Name 
And User_609 Click the save button
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click the validate button
#And User_609 Click the Application confirm ok button
#And User_609 Click Yes if Confirm Alert appears
#And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up appears
And User_609 Click on the Approve level1 Screen
And User_609 Select the Code in Approve level1 
And User_609 Select the Decision in Approve level1
And User_609 Click on Submit in Approve Level1 
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on the Approve level2 Screen
And User_609 Select the Code in Approve level2 
And User_609 Select the Decision in Approve level2
And User_609 Click on Submit in Approve Level2 
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on the Approve level3 Screen
And User_609 Select the Code in Approve level3
And User_609 Select the Decision in Approve level3
And User_609 Select the More Decision in Approve level3
And User_609 Click on Submit in Approve Level3
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up1 appears
And User_609 Click on Approval Committee Recommendations in Wifak Application
And User_609 Select the Code in Approval Committee Recommendations
And User_609 Click Recommend button in Approval Committee Recommendations
And User_609 Click the Application confirm ok button
And User_609 Select the decision in Approval Committee Recommendations
Then User_609 Validate the Committee Recommendation is Enabled
And User_609 Click on Ok in Approval Committee Recommendations


@717911_01
Scenario: DASI180345 - Scoring is showing under Committees
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_CA_007
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu  
And User_609 Click on Update After Approve Screen
And User_609 Select the Code in Update After Approve Screen
And User_609 Click on the Facility Details Tab
And User_609 Click on the STP Facility Requirements in Facility Details Tab
And User_609 Enable Mandatory Customer Grading flag
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
And User_609 Click the Application ok button
And User_609 Click on Approve Screen
And User_609 Select the Code in Approve Screen
And User_609 Click on Approve 
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button


@717911
Scenario: DASI180345 - Scoring is showing under Committees
Given navigate to FMS application and login with valid credentials2
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button
And User_609 get the test data set id for AT_CA_005
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
And User_609 Enable the clean flag in Product class
And User_609 Click on the add button
And User_609 Click on the Document Details tab
And User_609 Select the Solicitor Name 
And User_609 Select the Estimator Name 
And User_609 Click the save button
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click the validate button
And User_609 Click on Dismiss if Send Alert pop up appears
And User_609 Click on the Approve level1 Screen
And User_609 Select the Code in Approve level1 
And User_609 Select the Decision in Approve level1
And User_609 Click on Submit in Approve Level1 
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on Grading under WIFAK APPLICATION submenu    
And User_609 click on the Maintenance Screen in Grading          
And User_609 Select the Application Refernece in Grading            
And User_609 Click on Save Button in Grading                      
And User_609 Click the Grading ok button
And User_609 Click on Dismiss if Send Alert pop up appears in Grading
And User_609 Click on Approve in Grading                          
And User_609 Select the Code in Approve screen in grading         
And User_609 Click on Approve in Approve screen in Grading        
And User_609 Click the Application confirm ok button
And User_609 Click the Grading ok button
