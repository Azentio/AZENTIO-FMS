Feature: Advance Payment

@1358320
Scenario: Validate the  Modification at IISP Template level  to pass entry at Advance payments:
Given navigate to IIS application and login with valid credentials
And User_610 get the test data set id for AT_AD_010
And User_610 clear the caches in IIS Application
And User_610 Click the Investment Deals Combined without Trade Deal menu
And User_610 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_610 Select the Party in Investment Deals Combined without Trade Deal
And User_610 Select the Category in Investment Deals Combined without Trade Deal
And User_610 Select the Product Class in Investment Deals Combined without Trade Deal
And User_610 Enter the Amount in Investment Deals Combined without Trade Deal
#And User_610 Enter the Tenure in Investment Deals Combined without Trade Deal
#And User_610 Enter the Yield in Investment Deals Combined without Trade Deal
And User_610 Click the Contributor Details tab in Maintenance under Investment Deals Combined without Trade Deal
And User_610 Double Click the Contributor Details row in maintenance under Investment Deals Combined without Trade Deal
And User_610 Select the Nostro in Contributor Details tab under Investment Deals Combined without Trade Deal
And User_610 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_610 Click the Ok button in Contributor Details tab in Investment Deals Combined without Trade Deal
And User_610 Click the Save button in Investment Deals Combined without Trade Deal
And User_610 Click the Repayment Plan Button in Investment Deals Combined without Trade Deal
And User_610 Select the Settlement Type in Repayment Plan
And User_610 Check the Include VAT in Installment flag is Enabled
And User_610 Set Number of Payments in Repayment Plan
And User_610 Set Pay Every in Repayment Plan
And User_610 Check the Grace period flag is Enabled
And User_610 Uncheck the Compounding During Grace period flag is Disabled
And User_610 Click the Create schedule button in Repayment Plan in Investment Deals Combined without Trade Deal
And User_610 Click the Close Button in Repayment Plan in Investment Deals Combined without Trade Deal
And User_610 Validate button in Investment Deals Combined without Trade Deal
And User_610 Click on Approve Submenu in Investment Deals Combined without Trade Deal
And User_610 Select the Deal Number in Approve Submenu in Investment Deals Combined without Trade Deal
When User_610 Click the Approve button in Approve Submenu in Investment Deals Combined without Trade Deal

#------------------


