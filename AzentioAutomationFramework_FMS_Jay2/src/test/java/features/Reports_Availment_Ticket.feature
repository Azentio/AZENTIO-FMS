Feature: Pagination issue from FMS Portal
@866195
Scenario: SUPT190214 Pagination issue from FMS Portal
Given navigate to FMS application2 and login with valid credentials
And User_610 click the reports menu
And User_610 click the availment ticket sub menu
And User_610 click the cif and enter the cif number in availment ticket sub menu
Then User_610 click retrieve button to view the report without error
Then User_610 verify system shoudl show the CIF details under availment ticket