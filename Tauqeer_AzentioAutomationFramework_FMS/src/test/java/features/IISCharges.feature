
Feature: To Test the FMS application login

@808519	@AT_IC_013
Scenario: To check if A new flag ‘Create Incidental Charge’ is available in Deal charges screen
Given navigate to IIS FMS Param application and login with valid credentials
And update the test data for test case no AT_IC_013
Then user click on the parameters tab 
Then user click on the charges module
Then user click on the maintenance tab under charges module
Then user enter code value under maintenance screen 
Then user enter brief des value under maintenance screen 
Then user enter long des value under maintenance screen 
#And logout from the application