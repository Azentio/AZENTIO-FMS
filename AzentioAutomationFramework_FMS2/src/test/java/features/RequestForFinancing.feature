Feature: To Test Request for financing in FMS application
@AT_FAID_011
Scenario: Create the Modify Request and increase the limit via API and check system increases the limit of the facility
Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FAID_011
And User_608 clear the caches in FMS Application
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 select the Reason for submission under main screen in Request for Financing
And User_608 select the existing facility number under main screen in Request for Financing
And User_608 Update the total limit value under main screen in Request for Financing
#And User_608 enter the CIF no in main screen under Request for Financing
#And User_608 enter the facility type in main screen under Request for Financing
#And User_608 enter the total limit in main screen under Request for Financing
And User_608 move to the sublimit tab in main screen under Request for Financing
And User_608 Validate that updated limit value is reflected in sublimit tab

@AT_FAID_012
Scenario: Create the Modify Request and decrease the limit via API and check system decreases the limit of the facility
Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FAID_012
And User_608 clear the caches in FMS Application
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 select the Reason for submission under main screen in Request for Financing
And User_608 select the existing facility number under main screen in Request for Financing
And User_608 Update the total limit value under main screen in Request for Financing
#And User_608 enter the CIF no in main screen under Request for Financing
#And User_608 enter the facility type in main screen under Request for Financing
#And User_608 enter the total limit in main screen under Request for Financing
And User_608 move to the sublimit tab in main screen under Request for Financing
And User_608 Validate that updated limit value is reflected in sublimit tab

@AT_FAM_009
Scenario: BMOI150137 - Modification request allows creation of limit without yield
Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FAM_009
And User_608 clear the caches in FMS Application
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 select the Reason for submission under main screen in Request for Financing
And User_608 select the existing facility number under main screen in Request for Financing
And User_608 Update the total limit value under main screen in Request for Financing
And User_608 click the add new button in sublimit tab under main screen in Request for Financing
And User_608 enter the product class in limit details tab under sublimit tab
And User_608 enter the margin value in limit details tab under sublimit tab
And User_608 click the add button in limit details tab under sublimit tab
When User_608 click the Save button in main screen under Request for Financing

@AT_FAM_010
Scenario: BMOI150145 - System checks on maturity date of old line upon doing modification
Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FAM_010
And User_608 clear the caches in FMS Application
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 select the Reason for submission under main screen in Request for Financing
And User_608 select the existing facility number under main screen in Request for Financing
And User_608 Update the total limit value under main screen in Request for Financing
And User_608 click the add new button in sublimit tab under main screen in Request for Financing
And User_608 enter the product class in limit details tab under sublimit tab
And User_608 enter the margin value in limit details tab under sublimit tab
And User_608 click the add button in limit details tab under sublimit tab
When User_608 click the Save button in main screen under Request for Financing

@AT_FAM_011
Scenario: ASB140021 - Modification in Facility Type screen
Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_FAM_011
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Facility Type feature
And User_608 clicks on the update after approve menu in Facility type
And User_608 enter the code value in update after approve menu
And User_608 double click on the retrieved data in update after approve menu
And User_608 clicks on the facility details tab in update after approve
And User_608 clicks on the STP Facility Requirements option
And User_608 Validate the Document validation field is displayed under STP Facility Requirements

