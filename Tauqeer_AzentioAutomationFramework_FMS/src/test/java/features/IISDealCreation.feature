
Feature: To Test the FMS application login

@708527	@AT_IC_011
Scenario: If the value selected is Base Currency in Tracking & Incidental Charges
Given navigate to IIS FMS application and login with valid credentials
And Update test data for test case no AT_IC_011
Then user click on the investment deals combined without trade deal tab
Then user click on the maintenance tab under investment deals combined without trade deal tab
Then enter the party value under maintenance screen
Then enter the category value under maintenance screen
Then enter the product class value under maintenance screen
Then enter the deal currency value under deal details screen
Then enter the amount value under deal details screen
Then enter the yield value under deal details screen
Then user click on the contributor details tab 
Then open the record of contributor details
Then enter the nostro details
Then enter the maturity details
Then click on the ok button of contributor details screen
Then save the investment deals record
Then click on the repayment plan tab
Then click on the create schedule
Then close the create schedule page
Then validate the investment deals record
And logout from the application

@708529	@AT_IC_012
Scenario: If the value selected is Base Currency in Tracking & Incidental Charges
Given navigate to IIS FMS application and login with valid credentials
And Update test data for test case no AT_IC_012
Then user click on the investment deals combined without trade deal tab
Then user click on the maintenance tab under investment deals combined without trade deal tab
Then enter the party value under maintenance screen
Then enter the category value under maintenance screen
Then enter the product class value under maintenance screen
Then enter the deal currency value under deal details screen
Then enter the amount value under deal details screen
Then enter the yield value under deal details screen
Then user click on the contributor details tab 
Then open the record of contributor details
Then enter the nostro details
Then enter the maturity details
Then click on the ok button of contributor details screen
Then save the investment deals record
Then click on the repayment plan tab
Then click on the create schedule
Then close the create schedule page
Then validate the investment deals record
And logout from the application