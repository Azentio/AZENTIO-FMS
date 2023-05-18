Feature: To check the FMS Param facility category features

@299883
Scenario: DB130085 - CIF type can not be changed in FMS category

Given navigate to FMS param application and login with valid credentials
And User clicks on the Parameter module
And User clicks on the Facility category feature
And User clicks on the maintanance menu
And User clicks on the search button
And User double clicks on the any one row
And User clicks the CIF type search option
And User double click on the any one value
Then User clicks on the save button and save the record

