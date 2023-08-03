Feature: To Test Request for financing in FMS application
@AT_FAID_011
Scenario: Create the Modify Request and increase the limit via API and check system increases the limit of the facility
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_FAID_011
And User_074 clear the caches in FMS Application
And User_074 clicks on the Request module
And User_074 clicks on the Request Financing under Request module
And User_074 clicks on the Request for Financing under Request Financing feature
And User_074 clicks on the Maintanance screen under Request for Financing
And User_074 select the Reason for submission under main screen in Request for Financing
And User_074 select the existing facility number under main screen in Request for Financing
And User_074 Update the total limit value under main screen in Request for Financing
#And User_074 enter the CIF no in main screen under Request for Financing
#And User_074 enter the facility type in main screen under Request for Financing
#And User_074 enter the total limit in main screen under Request for Financing
And User_074 move to the sublimit tab in main screen under Request for Financing
And User_074 Validate that updated limit value is reflected in sublimit tab

@AT_FAID_012
Scenario: Create the Modify Request and decrease the limit via API and check system decreases the limit of the facility
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_FAID_012
And User_074 clear the caches in FMS Application
And User_074 clicks on the Request module
And User_074 clicks on the Request Financing under Request module
And User_074 clicks on the Request for Financing under Request Financing feature
And User_074 clicks on the Maintanance screen under Request for Financing
And User_074 select the Reason for submission under main screen in Request for Financing
And User_074 select the existing facility number under main screen in Request for Financing
And User_074 Update the total limit value under main screen in Request for Financing
#And User_074 enter the CIF no in main screen under Request for Financing
#And User_074 enter the facility type in main screen under Request for Financing
#And User_074 enter the total limit in main screen under Request for Financing
And User_074 move to the sublimit tab in main screen under Request for Financing
And User_074 Validate that updated limit value is reflected in sublimit tab

@AT_FAM_009
Scenario: BMOI150137 - Modification request allows creation of limit without yield
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_FAM_009
And User_074 clear the caches in FMS Application
And User_074 clicks on the Request module
And User_074 clicks on the Request Financing under Request module
And User_074 clicks on the Request for Financing under Request Financing feature
And User_074 clicks on the Maintanance screen under Request for Financing
And User_074 select the Reason for submission under main screen in Request for Financing
And User_074 select the existing facility number under main screen in Request for Financing
And User_074 Update the total limit value under main screen in Request for Financing
And User_074 click the add new button in sublimit tab under main screen in Request for Financing
And User_074 enter the product class in limit details tab under sublimit tab
And User_074 enter the margin value in limit details tab under sublimit tab
And User_074 click the add button in limit details tab under sublimit tab
When User_074 click the Save button in main screen under Request for Financing

@AT_FAM_010
Scenario: BMOI150145 - System checks on maturity date of old line upon doing modification
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_FAM_010
And User_074 clear the caches in FMS Application
And User_074 clicks on the Request module
And User_074 clicks on the Request Financing under Request module
And User_074 clicks on the Request for Financing under Request Financing feature
And User_074 clicks on the Maintanance screen under Request for Financing
And User_074 select the Reason for submission under main screen in Request for Financing
And User_074 select the existing facility number under main screen in Request for Financing
And User_074 Update the total limit value under main screen in Request for Financing
And User_074 click the add new button in sublimit tab under main screen in Request for Financing
And User_074 enter the product class in limit details tab under sublimit tab
And User_074 enter the margin value in limit details tab under sublimit tab
And User_074 click the add button in limit details tab under sublimit tab
When User_074 click the Save button in main screen under Request for Financing

@AT_FAM_011
Scenario: ASB140021 - Modification in Facility Type screen
Given navigate to FMS param application and login with valid credentials
And User_074 get the test data for test case AT_FAM_011
And User_074 clicks on the Parameter module in FMS Param
And User_074 clicks on the Facility Type feature
And User_074 clicks on the update after approve menu in Facility type
And User_074 enter the code value in update after approve menu
And User_074 double click on the retrieved data in update after approve menu
And User_074 clicks on the facility details tab in update after approve
And User_074 clicks on the STP Facility Requirements option
And User_074 Validate the Document validation field is displayed under STP Facility Requirements

@AT_DDR_001
Scenario: ITFCI160197 - Revolving one off feilds should be hidden
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_DDR_001
And User_074 clear the caches in FMS Application
And User_074 clicks on the Request module
And User_074 clicks on the Request Financing under Request module
And User_074 clicks on the Request for Financing under Request Financing feature
And User_074 clicks on the Maintanance screen under Request for Financing
And User_074 select the Reason for submission under main screen in Request for Financing
And User_074 select the existing facility number under main screen in Request for Financing
And User_074 enter the CIF no in main screen under Request for Financing
And User_074 Select the value in Revolving Oneoff dropdown
And User_074 Validate that Expiration date field is displayed


@AT_RF_027
Scenario: TSR - RIDB180198
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_RF_027
And User_074 clear the caches in FMS Application
And User_074 click on the Collateral Management feature
And User_074 click on the Maintanace screen under Collateral Management
And User_074 enter the Collateral type under main information in Collateral Management main Screen
And User_074 give the valid from date under main information in Collateral Management main Screen
And User_074 give the valid to date under main information in Collateral Management main Screen
And User_074 enter the Collateral currency under main information in Collateral Management main Screen
And User_074 enter the brief description under main information in Collateral Management main Screen
And User_074 enter the long description under main information in Collateral Management main Screen
And User_074 move to the Collateral cash details tab in Collateral Management main Screen
And User_074 click the add new icon under Collateral cash details tab
And User_074 click the additional reference lookup under Collateral cash details tab
And User_074 select the any cy value under additional reference lookup
And User_074 enter the amount value under Collateral cash details tab
When User_074 click the save button under Collateral Management main Screen
And User_074 move to the Approve screen under Collateral Management
And User_074 get the test data for test case AT_RF_027
And User_074 enter the Code in Collateral Management Approve screen search grid
And User_074 double click the Code Collateral Management Approve screen search grid
When User_074 click the approve button under Collateral Management approve screen
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
Then User_074 click the Facilities Management menu under WIFAK Application
And User_074 click the Maintanance in Facilities Management under WIFAK Application
And User_074 click the search button in Facilities Management Maintanance under WIFAK Application
And User_074 enter the Status in Facilities Management Maintanance Search grid under WIFAK Application
And User_074 double click the any one row in Facilities Management Maintanance Search grid under WIFAK Application
And User_074 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_074 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_074 click the Collateral details button in Facilities Management Maintanance under WIFAK Application
And User_074 click the add new icon in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_074 enter the Collateral code in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_074 Click the OK button in collateral details tab Facilities Management Maintanance under WIFAK Application
When User_074 click the Save Button under Maintanance under WIFAK Facilities Management
And User_074 click the Approve menu under Facilities Management in WIFAK Application

@AT_RF_105
Scenario: TSR - BTII170131
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_RF_105
And User_074 clear the caches in FMS Application
And User_074 click on the Collateral Management feature
And User_074 click on the Maintanace screen under Collateral Management
And User_074 enter the Collateral type under main information in Collateral Management main Screen
And User_074 give the valid from date under main information in Collateral Management main Screen
And User_074 give the valid to date under main information in Collateral Management main Screen
And User_074 enter the Collateral currency under main information in Collateral Management main Screen
And User_074 enter the brief description under main information in Collateral Management main Screen
And User_074 enter the long description under main information in Collateral Management main Screen
And User_074 move to the Collateral cash details tab in Collateral Management main Screen
And User_074 click the add new icon under Collateral cash details tab
And User_074 click the additional reference lookup under Collateral cash details tab
And User_074 select the any cy value under additional reference lookup
And User_074 enter the amount value under Collateral cash details tab
When User_074 click the save button under Collateral Management main Screen
And User_074 move to the Approve screen under Collateral Management
And User_074 get the test data for test case AT_RF_105
And User_074 enter the Code in Collateral Management Approve screen search grid
And User_074 double click the Code Collateral Management Approve screen search grid
When User_074 click the approve button under Collateral Management approve screen
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
Then User_074 click the Facilities Management menu under WIFAK Application
And User_074 click the Maintanance in Facilities Management under WIFAK Application
And User_074 click the search button in Facilities Management Maintanance under WIFAK Application
And User_074 enter the Status in Facilities Management Maintanance Search grid under WIFAK Application
And User_074 double click the any one row in Facilities Management Maintanance Search grid under WIFAK Application
And User_074 click the Facility limit details tab in Facilities Management Maintanance under WIFAK Application
And User_074 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_074 click the Collateral details button in Facilities Management Maintanance under WIFAK Application
And User_074 click the add new icon in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_074 enter the Collateral code in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_074 Click the OK button in collateral details tab Facilities Management Maintanance under WIFAK Application
When User_074 click the Save Button under Maintanance under WIFAK Facilities Management
And User_074 click the Approve menu under Facilities Management in WIFAK Application




