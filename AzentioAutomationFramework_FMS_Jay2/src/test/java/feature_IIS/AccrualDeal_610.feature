Feature: To check the Incidental Charges Feature

## Create a investment deal without trade deal
@Test
Scenario: IIS Application

Given navigate to IIS application and login with valid credentials
And User_610 get the test data for test case
And User_610 clear the caches in IIS Application
And User_610 click the Investment Deals Combined without Trade Deal menu
And User_610 click the Maintenance under Investment Deals Combined without Trade Deal
And User_610 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_610 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_610 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_610 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_610 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_610 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_610 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_610 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_610 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_610 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_610 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_610 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_610 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_610 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_610 validate button in maintenance under Investment Deals Combined without Trade Deal
And User_610 get the test data for test case
Then User_610 click the Approve menu under Investment Deals Combined without Trade Deal
And User_610 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_610 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_610 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal