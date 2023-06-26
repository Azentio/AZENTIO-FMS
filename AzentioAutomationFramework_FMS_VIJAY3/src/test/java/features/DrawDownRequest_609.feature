Feature:
@1038987
Scenario: Check following 4 new fields are added under the Additional Details tab of Applications screen: Down Payment to Vendor %, Down Payment to Vendor, Total Down Payment % and Total Down Payment
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_DDR_074
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