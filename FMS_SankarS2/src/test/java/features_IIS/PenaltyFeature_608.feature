Feature: To check the Penalty features


# Login IIS_Param --> Product class --> Additional info --> limit --> validate 'Apply Penalty on due payment flag' is available
# validate 'grace period' and 'Penalty percentage' Fields are available & user can define the values.
@AT_PNLT_001
Scenario: check the functionality of new flag `Apply penalty on due payment` in product class

Given navigate to IIS param application and login with valid credentials
And User_608 get the test data for test case AT_PNLT_001
And User_608 clicks on the parameter feature in IIS Param application
And User_608 clicks on the product class module under parameter feature
And User_608 clicks on the maintenance menu under product class module
And User_608 clicks on the search button in maintenance screen under product class
And User_608 enter the product class code in searchgrid under maintenance in product class
And User_608 double click the searchgrid row in maintenance under product class
And User_608 clicks on the additional information tab in maintenance screen under product class
And User_608 click the limit tab under additional info tab in maintenance screen under product class
And User_608 validate Apply Penalty on due payment flag is available in limit tab under additional info tab in maintenance
And User_608 validate grace period field is available in limit tab under additional info tab in maintenance
And User_608 enter the grace period value in limit tab under additional info tab in maintenance
And User_608 validate penalty percentage field is available in limit tab under additional info tab in maintenance
And User_608 enter the penalty percentage value in limit tab under additional info tab in maintenance
When User_608 clicks the Save button in maintenance menu under product class module

