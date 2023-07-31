Feature: Accrual Deal
@128348
Scenario: Create a Non Upfront deal with 48 monthly installments at month beginning in T022 screen

#AT_AD_001
Given navigate to IIS application and login with valid credentials
And User_609 get the test data for test case
And User_609 clear the caches in IIS Application
And User_609 Click the Investment Deals Combined without Trade Deal menu
And User_609 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_609 Select the Party in Investment Deals Combined without Trade Deal
And User_609 Select the Category in Investment Deals Combined without Trade Deal
And User_609 Select the Product Class in Investment Deals Combined without Trade Deal
And User_609 Enter the Amount in Investment Deals Combined without Trade Deal

And User_609 Click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_609 double Click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_609 Click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_609 double Click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_609 Click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_609 Click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_609 Click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_609 Click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_609 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_609 validate button in maintenance under Investment Deals Combined without Trade Deal
And User_609 get the test data for test case
Then User_609 Click the Approve menu under Investment Deals Combined without Trade Deal
And User_609 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_609 double Click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_609 Click the Approve button Approve menu in under Investment Deals Combined without Trade Deal