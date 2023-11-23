Feature: To check the Product Class Feature

@AT_IISPRM_003
Scenario: Checking the repayment plan under additional information tab under product class module.
Given navigate to IIS Param Application and login with valid credentials
And user get the test data for test case AT_IISPRM_003
Then user click on the parameter tab under menu
Then user click on the product class module under parameter tab
Then user click on the maintenance under product class module 
Then user click on the additonal information tab
Then user click on the repayment plan under additional tab 
Then user click on the max grace input field
Then user enter the max grace
Then user click on the max grace value drop down
Then user select the max grace value from drop down




@AT_IISPRM_022
Scenario: Check for new field ‘Disable Reimbursement Entry’ in Product Class
Given navigate to IIS Param Application and login with valid credentials
And user get the test data for test case AT_IISPRM_022
Then user click on the parameter tab under menu
Then user click on the product class module under parameter tab
Then user click on the maintenance under product class module 
Then user click on the general information tab
Then user click on the search button
Then user click on the class field
Then user enter the product class code
Then user double click on the retirved record
Then user click on the additonal information two tab
Then user check Disable Accrue Till Maturity On Early Settlement flag
Then user click on the save button
Then user click on the confirmation save button
Then user click on the update confirm button


@AT_IISPRM_023
Scenario: Check for the flag visibility - upfront/Non upfront
Given navigate to IIS Param Application and login with valid credentials
And user get the test data for test case AT_IISPRM_023
Then user click on the parameter tab under menu
Then user click on the product class module under parameter tab
Then user click on the maintenance under product class module 
Then user click on the general information tab
Then user click on the search button
Then user click on the class field
Then user enter the product class code
Then user double click on the retirved records
Then user click on the additonal information two tab
Then user validate for Disable Accrue Till Maturity On Early Settlement is avalible
Then user click on the search button
Then user double click on the retirved record
Then user click on the profit calculation
Then user check the Recognize Profit Up Front flag
Then user click on the save button for the profit calculation 
Then user click ok on the confirm save process alert popup
Then user click ok on the update successfully alert popup

Then user double click on the retirved record
Then user click on the additonal information two tab
Then user validate for disable accrue till maturity on early settlement is not avalible

@AT_IISPRM_024
Scenario: Check for the default behavior of the flag
Given navigate to IIS Param Application and login with valid credentials
Then user click on the parameter tab under menu
Then user click on the product class module under parameter tab
Then user click on the maintenance under product class module 
Then user click on the additonal information two tab
Then user validate the disable accrue till maturity on early settlement is unchecked


@AT_IISPRM_031
Scenario: Checking the common validations in the new field
Given navigate to IIS Param Application and login with valid credentials
And user get the test data for test case AT_IISPRM_031
Then user click on the parameter tab under menu
Then user click on the product class module under parameter tab
Then user click on the maintenance under product class module 
Then user click on the additonal information two tab
Then user navigate to early settlement feild


Then User click on the drop of lip calculator type dropdown
Then User select libor lip rate from the dropdown
Then User click on the pertcentage od deal tenure input feild
Then User enter the value more than 100%
And System should validate and should not allow to proceed

Then User click on the pertcentage od deal tenure input feild
Then User enter the decimal value less than 100%
And System should validate and should allow to proceed 

Then User click on the pertcentage od deal tenure input feild
Then User enter an invalid value
And System should validate and should not allow to proceed

Then User click on the drop of lip calculator type dropdown
Then User select outstanding principle from the dropdown

Then User click on the pertcentage od deal tenure input feild
Then User enter the value more than 100%
And System should validate and should not allow to proceed

Then User click on the pertcentage od deal tenure input feild
Then User enter the decimal value less than 100%
And System should validate and should allow to proceed 

Then User click on the pertcentage od deal tenure input feild
Then User enter an invalid value
And System should validate and should not allow to proceed

