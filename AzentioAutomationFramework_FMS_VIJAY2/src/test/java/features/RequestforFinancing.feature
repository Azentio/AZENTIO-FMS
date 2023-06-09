Feature: Request for Financing
@863738
Scenario: MAII190020 - wrong CV amount
Given navigate to FMS application and login with valid credentials2
And Click on the WIFAK APPLICATION menu 
And Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And Click on the Maintenance screen under Application For Financial Facilities

And Select the Application For field in Maintenance screen
And Select the CIF No in Main Information tab
And Select the Facility Type in Main Information tab
And Click the Country of Financing in Main Information tab
#And Click the search icon for Facility Rating
And Select the Facility Rating
And Click on the Additional Details tab
And Select the Currency Code
And Enter the Total Value  
And Select the Offer/Expiration 


And Click on the Limit Details tab
And Click on the add new row icon 
And Click on Product Class search icon
And Select the Product Class 
And Check the clean flag is enabled
And Click on the add button

And Click on the Document Details tab
And Click on Solicitor Name search icon
And Select the Solicitor Name 
And Click on Estimator Name search icon
And Select the Estimator Name 

And Click the save button
And Click the confirm ok button
And Click the ok button  
And Click the validate button
And Click the confirm ok button

And Click the ok button to proceed
And Click the ok button  

And Click Dismiss in Send Alert



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
And Click on the WIFAK APPLICATION menu 
And Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And Click on the Maintenance screen under Application For Financial Facilities
And Select the Application For field in Maintenance screen
And Select the CIF No in Main Information tab
And Select the Facility Type in Main Information tab
And Click the Country of Financing in Main Information tab
And Select the Facility Rating
And Click on the Additional Details tab
And Enter the Total Value  
And Select the Offer/Expiration 
And Click on the Limit Details tab
And Click on the add new row icon 
And Click on Product Class search icon
And Select the Product Class 

And Select the Purpose Of Financing

And Click on the add button

And Click the save button
And Click the confirm ok button
And Click the ok button  
And Click the validate button
And Click the confirm ok button
And Click the ok button 

And Click Dismiss in Send Alert 

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
And get the test data set id for AT_RF_192
And Click on the WIFAK APPLICATION menu 
And Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And Click on the Maintenance screen under Application For Financial Facilities
And Select the Application For field in Maintenance screen
And Select the CIF No in Main Information tab
And Click the Country of Financing in Main Information tab
Then Check the Country of Financing field is filled 




@402669
Scenario:TS-0003-FMS-Modification new fields at the level of Request for Finance Screen
Given navigate to FMS application and login with valid credentials2
And get the test data set id for AT_RF_195
And Click on the WIFAK APPLICATION menu 
And Click on the WIFAK APPLICATION submenu under WIFAK APPLICATION
And Click on the Application For Financial Facilities under WIFAK APPLICATION submenu
And Click on the Maintenance screen under Application For Financial Facilities
And Select the Application For field in Maintenance screen
And Select the CIF No in Main Information tab
And Select the Facility Type in Main Information tab
And Click the Country of Financing in Main Information tab
And Click Yes in post approval pop up 
And Select the Facility Rating
Then Enter values in Revolving Validity field
Then Enter values in Max Revolving Times field
Then Enable Subject To Full Repayment flag
Then Check the Current Utilization field is enabled
Then Check the Total Approval field is enabled
 