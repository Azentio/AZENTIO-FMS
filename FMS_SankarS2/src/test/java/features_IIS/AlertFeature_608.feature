Feature: To check the Alert features

@AT_AL_003 @AT_AL_003_01
Scenario: ABEI190414 - IIS Deal Alerts Issues

Given navigate to IIS param application and login with valid credentials
And User_608 clicks on the parameter feature in IIS Param application
And User_608 click the Control Record module under parameter in IIS Param
And User_608 click the maintenance menu under Control Record module in parameter
And User_608 click the investment deal tab under maintenance in Control Record
And User_608 click the System tab under investment deal under maintenance in Control Record
And User_608 click the Enable alerts flag under System tab in investment deal under Control Record maintenance
When User_608 clicks the Save button under maintenance in Control Record


@AT_AL_003 @AT_AL_003_02
Scenario: ABEI190414 - IIS Deal Alerts Issues

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AL_003
And User_608 clear the caches in IIS Application
And User_608 click the Investment Deals Combined without Trade Deal menu
And User_608 click the Maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_608 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the validate button in maintenance under Investment Deals Combined without Trade Deal for Advance Principal Settlement
And User_608 enter the userID in searchgrid under send alert popup in IIS Application
And User_608 select the row in searchgrid under send alert popup in IIS Application
And User_608 click the Send button under send alert popup in IIS Application


#@AT_AL_003 @AT_AL_003_03
#Scenario: ABEI190414 - IIS Deal Alerts Issues
#
#Given User2 navigate to IIS application and login with valid credentials










