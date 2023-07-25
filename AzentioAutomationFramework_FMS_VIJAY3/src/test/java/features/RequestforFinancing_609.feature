Feature: Request for Financing
@863738
Scenario: MAII190020 - wrong CV amount

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_RF_145
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button 
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
And User_609 Click on Dismiss if Send Alert pop up appears in Approve Level3 




@862727
Scenario: MFI190186 - Issue in Purpose of Financing Field from Request for Financing Screen
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_RF_144
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu  
And User_609 Click on Update After Approve Screen
And User_609 Select the Code in Update After Approve Screen
And User_609 Click on the Facility Details Tab
And User_609 Click on the Application Requirements and Details in Facility Details tab
And User_609 Check the Mandatory Purpose of Financing flag is enabled
And User_609 Click on Update
And User_609 Click the Application confirm ok button
And User_609 Click the ok button
And User_609 Click on Approve Screen
And User_609 Select the Code in Approve Screen
And User_609 Click on Approve 
And User_609 Click the Application confirm ok button
And User_609 Click the ok button

Given navigate to FMS application and login with valid credentials2
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button 
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
And User_609 Select the Purpose Of Financing
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
And User_609 Click on Dismiss if Send Alert pop up appears in Approve Level3


@326257
Scenario: To check the new Country of Financing added at the request for finance screen

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_RF_192
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button 
And User_609 Click on the WIFAK APPLICATION menu
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Select the Country of Financing in Main Information tab
Then User_609 Check the Country of Financing field is filled




@402669
Scenario: TS-0003-FMS-Modification new fields at the level of Request for Finance Screen
#Given navigate to FMS application and login with valid credentials2
#And User_609 get the test data set id for AT_RF_195
#And User_609 Click on the WIFAK APPLICATION menu 
#And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
#And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
#And User_609 Click on the Maintenance screen under Application For Financial Facilities
#And User_609 Select the Application For field in Maintenance screen
#And User_609 Select the CIF No in Main Information tab
#And User_609 Select the Facility Type in Main Information tab
#And User_609 Click the Country of Financing in Main Information tab
#And User_609 Click Yes in post approval pop up 
#And User_609 Select the Facility Rating
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_RF_195
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button 
And User_609 Click on the WIFAK APPLICATION menu
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Select the Country of Financing in Main Information tab
And User_609 Select the Facility Rating
Then User_609 Enter values in Revolving Validity field
Then User_609 Enter values in Max Revolving Times field
Then User_609 Enable Subject To Full Repayment flag
Then User_609 Check the Current Utilization field is enabled
Then User_609 Check the Total Approval field is enabled

@834958
Scenario: Check a new field “Marketed By” is added under the Request Details Tab in Request for Financing – Maintenance screen

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_RF_196
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button 
And User_609 Click on the WIFAK APPLICATION menu
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Select the Country of Financing in Main Information tab
And User_609 Select the Facility Rating
Then User_609 Check the Marketed By field is displayed
 