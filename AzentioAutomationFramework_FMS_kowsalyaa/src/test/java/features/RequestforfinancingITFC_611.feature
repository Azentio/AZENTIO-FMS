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

@468167
Scenario: ITFCI160315
Given navigate to FMS application and login with valid credentials
