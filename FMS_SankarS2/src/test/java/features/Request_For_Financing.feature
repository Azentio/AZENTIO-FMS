Feature: To check the Request for Financing features

@AT_RF_141
Scenario: MFI190131 - Request for financing Screen, Search criteria CIF name is not showing properly and Arabic Translation is not correct

Given navigate to FMS application and login with valid credentials
And User clicks on the Request module
And User clicks on the Request Financing under Request module
And User clicks on the Request for Financing under Request Financing feature
And User click the maintanance under Request for Financing
And User click the search button under the maintanance screen in Request for Financing
And User click the clear button under the maintanance screen in Request for Financing
Then User validate the CIF short Name available under the maintanance screen in Request for Financing
And User validate the CIF long Name available under the maintanance screen in Request for Financing

# Arabic language
@AT_RF_141_arabic
Scenario: MFI190131 - Request for financing Screen, Search criteria CIF name is not showing properly and Arabic Translation is not correct

Given navigate to FMS application and login with valid credentials
And User click on the language option in FMS core
And User click on the arabic under language option
And User clicks on the Funding Request module in arabic
And User clicks on the Request under Funding Request
And User clicks on the Funding Request in Request under Funding Request
And User click the approval committee under Funding Request in Request
Then User validate the search grid value are displayed in arbic language under approval committee