Feature: Assert Management

@408271
Scenario: Check new flag" Default Assets from FMS" available for NONUpfront PC

Given navigate to IIS param application and login with valid credentials
And User_610 get the test data set id for AT_AM_002
And User_610 clear the caches in IIS Application
And User_610 clicks on the parameter feature in IIS Param application
And User_610 clicks on the product class module under parameter feature
And User_610 clicks on the maintenance menu under product class module
And User_610 clicks on the search button in maintenance screen under product class
And User_610 enter the product class code in searchgrid under maintenance in product class
And User_610 double click the searchgrid row in maintenance under product class
And User_610 clicks on the additional information tab in maintenance screen under product class
And User_610 validate the default assets from fms flag is available in maintenance under product class
When User_610 clicks the Save button in maintenance menu under product class module


@1077666
Scenario: Check the section for Asset Repossession Screen is renamed to Asset Management Screen at the level of fiscal implications under product class in parameters

Given navigate to IIS param application and login with valid credentials
And User_610 get the test data set id for AT_AM_002
And User_610 clear the caches in IIS Application
And User_610 clicks on the parameter feature in IIS Param application
And User_610 clicks on the product class module under parameter feature
And User_610 clicks on the maintenance menu under product class module
And User_610 clicks on the search button in maintenance screen under product class
And User_610 enter the product class code in searchgrid under maintenance in product class
And User_610 double click the searchgrid row in maintenance under product class
And User_610 clicks on the Set Fiscal implication  in Fiscal Implication screen under product class
And User_610 validate the Asset Management Screen is available in maintenance under Set Fiscal implication


@1077667
Scenario: Check the new button "Link Template" at the level of fiscal implications under Asset Management Scree in Prodcut Class


Given navigate to IIS param application and login with valid credentials
And User_610 get the test data set id for AT_AM_002
And User_610 clear the caches in IIS Application
And User_610 clicks on the parameter feature in IIS Param application
And User_610 clicks on the product class module under parameter feature
And User_610 clicks on the maintenance menu under product class module
And User_610 clicks on the search button in maintenance screen under product class
And User_610 enter the product class code in searchgrid under maintenance in product class
And User_610 double click the searchgrid row in maintenance under product class
And User_610 clicks on the Set Fiscal implication  in Fiscal Implication screen under product class
And User_610 validate the Asset Management Screen is available in maintenance under Set Fiscal implication


















































































































































