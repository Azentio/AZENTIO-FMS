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