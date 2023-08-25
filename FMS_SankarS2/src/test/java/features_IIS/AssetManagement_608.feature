Feature: To check the Asset Management features

# Login IIS_Param --> Product class --> Additional info --> deal setting tab --> validate 'Default Assets from FMS' is available and update the product class
@AT_AM_001
Scenario: Check new flag `Default Assets from FMS` available for Upfront PC-IJARA

Given navigate to IIS param application and login with valid credentials
And User_608 get the test data for test case AT_AM_001
And User_608 clicks on the parameter feature in IIS Param application
And User_608 clicks on the product class module under parameter feature
And User_608 clicks on the maintenance menu under product class module
And User_608 clicks on the search button in maintenance screen under product class
And User_608 enter the product class code in searchgrid under maintenance in product class
And User_608 double click the searchgrid row in maintenance under product class
And User_608 clicks on the additional information tab in maintenance screen under product class
And User_608 validate the default assets from fms flag is available in maintenance under product class
When User_608 clicks the Save button in maintenance menu under product class module