Feature: Draw Down Request
@1038987
Scenario: Check following 4 new fields are added under the Additional Details tab of Applications screen: Down Payment to Vendor %, Down Payment to Vendor, Total Down Payment % and Total Down Payment
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_DDR_074
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
And User_609 Check the Down Payment Percantage field is enabled 
And User_609 Check the Down Payment field is enabled 
And User_609 Check the Down Payment to vendor Percantage field is enabled 
And User_609 Check the Down Payment to vendor field is enabled 
And User_609 Check the Total Down Payment Percantage field is Displayed 
And User_609 Check the Total Down Payment field is Displayed 



@1038988
Scenario: Check following 5 new fields are added under the Facility Type Details tab of Request screen: Down Payment %, Down Payment to Vendor %, Down Payment to Vendor, Total Down Payment % and Total Down Payment

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_DDR_075
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
And User_609 Check the Down Payment Percantage field is enabled in Request Screen
And User_609 Check the Down Payment field is enabled in Request Screen
And User_609 Check the Down Payment to vendor Percantage field is enabled in Request Screen 
And User_609 Check the Down Payment to vendor field is enabled in Request Screen
And User_609 Check the Total Down Payment Percantage field is Displayed in Request Screen
And User_609 Check the Total Down Payment field is Displayed in Request Screen



@827639
Scenario: IIAB150404 - Modification In Draw Down Request Screen
Given navigate to FMS param application and login with valid credentials2
And User_609 Click on the Parameters menu
And User_609 Click on the Control Record submenu
And User_609 Click on Update After Approve screen in Control Record submenu
And User_609 Enable the flag General Limit By Cif in Control Record
And User_609 Click on Update in Control Record
And User_609 Click the confirm ok button
And User_609 Click the ok button

And User_609 Click on the Approve Screen in Control Record submenu
And User_609 Click on Approve in Approve Screen in Control Record submenu
And User_609 Click the confirm ok button
And User_609 Click the ok button


Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_DDR_073
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
Then User_609 Check the Fx Settlement Expiry date is Displayed

#Given navigate to FMS param application and login with valid credentials2
#And User_609 Click on the Parameters menu
#And User_609 Click on the Control Record submenu
#And User_609 Click on Update After Approve screen in Control Record submenu
#And User_609 Disable the flag General Limit By Cif in Control Record
#And User_609 Click on Update in Control Record
#And User_609 Click the confirm ok button
#And User_609 Click the ok button
#And User_609 Click on the Approve Screen in Control Record submenu
#And User_609 Click on Approve in Approve Screen in Control Record submenu
#And User_609 Click the confirm ok button
#And User_609 Click the ok button
