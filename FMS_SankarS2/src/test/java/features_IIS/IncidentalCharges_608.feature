Feature: To check the Incidental Charges Feature

@AT_IC_010
Scenario: Checking the Deal Incidental charges Functionality fro Reversal

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_IC_010
And User_608 clear the caches in IIS Application
And User_608 click the Tracking & Incidental Charges module
And User_608 click the Reverse menu under Tracking & Incidental Charges
And User_608 enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges
And User_608 double click the searchgrid row in Reverse menu under Tracking & Incidental Charges
When User_608 click the Reverse button in Reverse menu under Tracking & Incidental Charges
And User_608 click the Approve Reverse menu under Tracking & Incidental Charges
And User_608 enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges
And User_608 double click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges
When User_608 click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges


## Create a investment deal without trade deal
@Test
Scenario: IIS Application

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case
And User_608 clear the caches in IIS Application
And User_608 click the Investment Deals Combined without Trade Deal menu
#And User_608 click the Maintenance under Investment Deals Combined without Trade Deal
#And User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal
#And User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal
#And User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal
#And User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal
#And User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
#And User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
#And User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
#And User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
#And User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
#And User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
#And User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal
#And User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
#And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
#And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
#And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal
#And User_608 get the test data for test case
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal









