Feature: Accrual Deal
@128348
Scenario: Create a Non Upfront deal with 48 monthly installments at month beginning in T022 screen

#AT_AD_001
Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AD_001
And User_609 clear the caches in IIS Application
And User_609 Click the Investment Deals Combined without Trade Deal menu
And User_609 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_609 Select the Party in Investment Deals Combined without Trade Deal
And User_609 Select the Category in Investment Deals Combined without Trade Deal
And User_609 Select the Product Class in Investment Deals Combined without Trade Deal
And User_609 Enter the Amount in Investment Deals Combined without Trade Deal
And User_609 Enter the Tenure in Investment Deals Combined without Trade Deal
And User_609 Enter the Yield in Investment Deals Combined without Trade Deal
And User_609 Click the Contributor Details tab in Maintenance under Investment Deals Combined without Trade Deal
And User_609 Double Click the Contributor Details row in maintenance under Investment Deals Combined without Trade Deal
And User_609 Select the Nostro in Contributor Details tab under Investment Deals Combined without Trade Deal
#And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_609 Click the Ok button in Contributor Details tab in Investment Deals Combined without Trade Deal
And User_609 Click the Save button in Investment Deals Combined without Trade Deal
And User_609 Click the Repayment Plan Button in Investment Deals Combined without Trade Deal
And User_609 Select the Settlement Type in Repayment Plan
And User_609 Check the Include VAT in Installment flag is Enabled
And User_609 Set Number of Payments in Repayment Plan
And User_609 Set Pay Every in Repayment Plan
And User_609 Check the Grace period flag is Enabled
And User_609 Uncheck the Compounding During Grace period flag is Disabled
And User_609 Click the Create schedule button in Repayment Plan in Investment Deals Combined without Trade Deal
And User_609 Click the Close Button in Repayment Plan in Investment Deals Combined without Trade Deal
And User_609 Validate button in Investment Deals Combined without Trade Deal
And User_609 Click on Approve Submenu in Investment Deals Combined without Trade Deal
And User_609 Select the Deal Number in Approve Submenu in Investment Deals Combined without Trade Deal
When User_609 Click the Approve button in Approve Submenu in Investment Deals Combined without Trade Deal




@128349
Scenario: Create a manual settlement on 05/04/2007
Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AD_002
And User_609 clear the caches in IIS Application
And User_609 Click the Investment Deals Combined without Trade Deal menu
And User_609 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_609 Select the Party in Investment Deals Combined without Trade Deal
And User_609 Select the Category in Investment Deals Combined without Trade Deal
And User_609 Select the Product Class in Investment Deals Combined without Trade Deal
And User_609 Enter the Amount in Investment Deals Combined without Trade Deal
#And User_609 Enter the Tenure in Investment Deals Combined without Trade Deal
#And User_609 Enter the Yield in Investment Deals Combined without Trade Deal
And User_609 Click the Contributor Details tab in Maintenance under Investment Deals Combined without Trade Deal
And User_609 Double Click the Contributor Details row in maintenance under Investment Deals Combined without Trade Deal
And User_609 Select the Nostro in Contributor Details tab under Investment Deals Combined without Trade Deal
#And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_609 Click the Ok button in Contributor Details tab in Investment Deals Combined without Trade Deal
And User_609 Click the Save button in Investment Deals Combined without Trade Deal
And User_609 Click the Repayment Plan Button in Investment Deals Combined without Trade Deal
#And User_609 Select the Settlement Type in Repayment Plan
#And User_609 Check the Include VAT in Installment flag is Enabled
#And User_609 Set Number of Payments in Repayment Plan
#And User_609 Set Pay Every in Repayment Plan
And User_609 Check the Grace period flag is Enabled
And User_609 Uncheck the Compounding During Grace period flag is Disabled
And User_609 Click the Create schedule button in Repayment Plan in Investment Deals Combined without Trade Deal
And User_609 Click the Close Button in Repayment Plan in Investment Deals Combined without Trade Deal
And User_609 Validate button in Investment Deals Combined without Trade Deal
And User_609 Click on Approve Submenu in Investment Deals Combined without Trade Deal
And User_609 Select the Deal Number in Approve Submenu in Investment Deals Combined without Trade Deal
When User_609 Click the Approve button in Approve Submenu in Investment Deals Combined without Trade Deal

And User_609 Click the Settlement menu
And User_609 Click the Maintenance under Settlement menu
And User_609 Select the Deal number in Settlement
And User_609 Enter the Party Amount in Settlement
And User_609 Click the Automatic Allocation label in Settlement
And User_609 Click the Save Button in Settlement
And User_609 Click on Approve Submenu under Settlement menu
And User_609 Select the Deal number under Approve in Settlement
And User_609 Click the Approve Button under Approve in Settlement




