Feature: To check the FMS param facility custom fields feature

@AT_RF_024
Scenario: TSR - FIBSI180217

Given navigate to FMS param application and login with valid credentials
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Facility custom fields under Parameter
And User_608 clicks on the Maintain facility custom fields under facility custom fields
And User_608 clicks on the Update after approve in Maintain facility custom fields
And User_608 double click on the one record under update after approve
And User_608 validate Facility Custom Fields screen are available
