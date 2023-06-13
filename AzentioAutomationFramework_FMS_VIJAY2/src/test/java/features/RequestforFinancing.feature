Feature: Request for Financing
@863738
Scenario: MAII190020 - wrong CV amount
Given navigate to FMS application and login with valid credentials2
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Click the Country of Financing in Main Information tab
And User_609 Select the Facility Rating
And User_609 Click on the Additional Details tab
And User_609 Select the Currency Code
And User_609 Enter the Total Value  
And User_609 Select the Offer/Expiration 
And User_609 Click on the Limit Details tab
And User_609 Click on the add new row icon 
And User_609 Click on Product Class search icon
And User_609 Select the Product Class 
And User_609 Check the clean flag is enabled
And User_609 Click on the add button
And User_609 Click on the Document Details tab
And User_609 Click on Solicitor Name search icon
And User_609 Select the Solicitor Name 
And User_609 Click on Estimator Name search icon
And User_609 Select the Estimator Name 
And User_609 Click the save button
And Click the confirm ok button
And Click the ok button  
And User_609 Click the validate button
And Click the confirm ok button

And User_609 Click the ok button to proceed
And Click the ok button  

And User_609 Click Dismiss in Send Alert



And Click the Approve Level1 link
And Retrive the first data in approve level1
And Select the Approve level1 decision as approve
And Click on the level1 submit button
And Click the Approve Level2 link
And Retrive the first data in approve level2
And Select the level2 decision as approve
And Click on the level2 submit button
And Click the Approve Level3 link
And Retrive the first data in approve level3
And Select the level3 decision as approve
When Click on the level3 submit button


@862727
Scenario: MFI190186 - Issue in Purpose of Financing Field from Request for Financing Screen
Given navigate to FMS param application and login with valid credentials2
And Click on the Parameters menu
And Click on the Facility Type submenu
And Click on the Update After Approve screen 
And Search for the Code in Update After Approve screen
And Click the Code in Update After Approve screen
And Click the Facility Details tab in update after approve screen
And Click on the Application Requirements and Details in Facility Details tab
And Check the Mandatory Purpose of Financing flag is enabled
And Click on Update
And Click on confirm ok
And click on ok
And Click on the Approve screen
And Search for the Code in Approve screen
And Click the Code in Approve screen
And Click on Approve in Approve screen
And Click on confirm ok
And click on ok

Given navigate to FMS application and login with valid credentials2
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Click the Country of Financing in Main Information tab
And User_609 Select the Facility Rating
And User_609 Click on the Additional Details tab
And User_609 Enter the Total Value  
And User_609 Select the Offer/Expiration 
And User_609 Click on the Limit Details tab
And User_609 Click on the add new row icon 
And User_609 Click on Product Class search icon
And User_609 Select the Product Class 
And User_609 Select the Purpose Of Financing
And User_609 Click on the add button
And User_609 Click the save button
And Click the confirm ok button
And Click the ok button  
And User_609 Click the validate button
And Click the confirm ok button
And Click the ok button 
And User_609 Click Dismiss in Send Alert 
And User_609 Click on the Additional Details tab
And User_609 Select the Currency Code
And User_609 Enter the Total Value  
And User_609 Select the Offer/Expiration 
And User_609 Click on the Limit Details tab
And User_609 Click on the add new row icon 
And User_609 Click on Product Class search icon
And User_609 Select the Product Class 
And User_609 Check the clean flag is enabled
And User_609 Click on the add button
And User_609 Click on the Document Details tab
And User_609 Click on Solicitor Name search icon
And User_609 Select the Solicitor Name 
And User_609 Click on Estimator Name search icon
And User_609 Select the Estimator Name 
And User_609 Click the save button
And Click the confirm ok button
And Click the ok button  
And User_609 Click the validate button
And Click the confirm ok button
And User_609 Click the ok button to proceed
And Click the ok button  












And Click the Approve Level1 link
And Retrive the first data in approve level1
And Select the Approve level1 decision as approve
And Click on the level1 submit button
And Click the Approve Level2 link
And Retrive the first data in approve level2
And Select the level2 decision as approve
And Click on the level2 submit button
And Click the Approve Level3 link
And Retrive the first data in approve level3
And Select the level3 decision as approve
When Click on the level3 submit button


@326257
Scenario: To check the new Country of Financing added at the request for finance screen

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_RF_192
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Click the Country of Financing in Main Information tab
Then User_609 Check the Country of Financing field is filled




@402669
Scenario: TS-0003-FMS-Modification new fields at the level of Request for Finance Screen
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_RF_195
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Click the Country of Financing in Main Information tab
And User_609 Click Yes in post approval pop up 
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
And User_609 Click on the WIFAK APPLICATION menu 
And User_609 Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And User_609 Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And User_609 Click on the Maintenance screen under Application For Financial Facilities
And User_609 Select the Application For field in Maintenance screen
And User_609 Select the CIF No in Main Information tab
And User_609 Select the Facility Type in Main Information tab
And User_609 Click the Country of Financing in Main Information tab
And User_609 Select the Facility Rating
Then User_609 Check the Marketed By field is displayed
 