Feature: To Test the request for financing with ITFC 
@468154
Scenario: ITFCI160285
Given navigate to FMS application and login with valid credentials
And User_611 Clicks the Johns Request menu 
And User_611 Clicks the Joh Request menu 
And User_611 Clicks the Request for financing menu  
And User_611 Clicks the maintenance menu 
And User_611 Clicks the reason for submission select box for select the new request
And User_611 Clicks the source/destination tab
And User_611 Check the flag in member countries
And User_611 Check the flag in non member countries
And User_611 Enter the expected percentage for member countries
And User_611 Enter the expected percentage for non member countries
And User_611 Click the add new row button in specific countries 
And User_611 Enter the country code in specific countries 
And User_611 Enter the expected percentage in specific countries
And User_611 Click the add new row button in specific suppliers
And User_611 Enter the CIF number in specific suppliers 
And User_611 Enter the expected percentage in specific suppliers
And User_611 Validate the Source popup destination 

@468167
Scenario: ITFCI160315
Given navigate to FMS application and login with valid credentials
And User_611 Clicks the Johns Request menu 
And User_611 Clicks the Joh Request menu 
And User_611 Clicks the Request for financing menu  
And User_611 Clicks the maintenance menu 
And User_611 Clicks the reason for submission select box for select the new request
And User_611 Enter the customer Cif details 
And User_611 Enter the Info Completion Date
And User_611 Enter the Facility Type
And User_611 Enter the  Total limit value 
And User_611 Click the funding tab 
And User_611 Click the add button to add and validate the amount
And User_611 Enter the Fund Code in Funding tab
And User_611 Validate the amount value in Funding tab
And User_611 Validate the popup while we entering amount greater

@468169
Scenario: ITFCI160416
Given navigate to FMS application and login with valid credentials
And User_611 Clicks the Johns Request menu 
And User_611 Clicks the Joh Request menu 
And User_611 Clicks the Request for financing menu  
And User_611 Clicks the maintenance menu 
And User_611 Clicks the reason for submission select box for select the new request
And User_611 Enter the customer Cif details 
And User_611 Enter the Info Completion Date
And User_611 Click the Commodities and Security Components tab
And User_611 Validate the provider tab
And User_611 Validate the Fixed Amount tab
And User_611 Validate the  Cost bearing party tab

@569548
Scenario: Check the case to verify new dropdown options
Given navigate to IIS param application and login with valid credentials
And User_611 clicks on the parameter feature in IIS Param application
And User_611 clicks on the product class module under parameter feature
And User_611 clicks on the maintenance menu under product class module
And User_611 clicks on the search button in maintenance screen under product class
And User_611 enter the product class code in searchgrid under maintenance in product class
And User_611 double click the searchgrid row in maintenance under product class
And User_611 Click the profit calculation tab
And User_611 Validate the Acquisition Value is default value 
And User_611 Validate the Net Asset Value is displayed
And User_611 Validate the Capitalized Value is displayed





