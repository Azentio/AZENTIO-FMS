Feature: Pagination issue from FMS Portal
@866195
Scenario: SUPT190214 Pagination issue from FMS Portal
Given navigate to FMS application2 and login with valid credentials
And user click the reports menu
And user click the availment ticket sub menu
And user click the cif and enter the cif number in availment ticket sub menu
#And user randomly click in availment ticket sub menu
Then user click retrieve button to view the report without error
Then verify system shoudl show the CIF details under availment ticket