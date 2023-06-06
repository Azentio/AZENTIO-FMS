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
And Click the search icon for Facility Rating
And Select the Facility Rating
And Click on the Additional Details tab
And Select the Currency Code
And Enter the Total Value  
And Select the Offer/Expiration 


And Click on the Limit Details tab
And Click on the add new row icon 
And Click on Product Class search icon
And Select the Product Class 
And Click on the add button

And Click on the Document Details tab
And Click on Solicitor Name search icon
And Select the Solicitor Name 
And Click on Estimator Name search icon
And Select the Estimator Name 

And Click the save button
And Click the confirm ok button
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
