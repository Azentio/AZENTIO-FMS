Feature: Incidental Charges

@1166872
Scenario: check the system shows incidental charges in a separate window in case there are multiple Incidental Charges

Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_IC_023
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
And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
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
And User_609 Click the Tracking and Incidental Charges menu
And User_609 Click the Maintenance Screen in Tracking and Incidental Charges
And User_609 Select the Deal Number in Tracking and Incidental Charges
And User_609 Select the Charge Code in Tracking and Incidental Charges
And User_609 Select the Charge Allocation Criteria in Tracking and Incidental Charges
And User_609 Click the Save Button in Tracking and Incidental Charges
And User_609 Click the Approve Screen in Tracking and Incidental Charges
And User_609 Select the Deal Number in Approve Screen in Tracking and Incidental Charges
And User_609 Click the Approve Button in Approve Screen in Tracking and Incidental Charges

And User_609 Click the Repayment Plan menu
And User_609 Click the Maintenance Screen in Repayment Plan
And User_609 Click the Search Button in Repayment Plan
And User_609 Select the Deal Number in Repayment Plan
And User_609 Click the Schedule Details tab in Repayment Plan
And User_609 Click the Incidental Charge label in Schedule Details tab in Repayment Plan
Then User_609 Check the Incidental Charges Dispalyed in Schedule Details tab in Repayment Plan
Then User_609 Check the Charge Name Dispalyed in Schedule Details tab in Repayment Plan
Then User_609 Check the Amount is Dispalyed in Schedule Details tab in Repayment Plan
Then User_609 Check the Total is Dispalyed in Schedule Details tab in Repayment Plan

@1166873
Scenario: Check the system shows the charge details - charge name, amount and the charge total in the above window in case there are multiple Incidental Charges.

Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_IC_024
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
And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
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
And User_609 Click the Repayment Plan menu
And User_609 Click the Maintenance Screen in Repayment Plan
And User_609 Click the Search Button in Repayment Plan
And User_609 Select the Deal Number in Repayment Plan
And User_609 Click the Schedule Details tab in Repayment Plan
And User_609 Click the Incidental Charge label in Schedule Details tab in Repayment Plan
Then User_609 Check the Charge Name Dispalyed in Schedule Details tab in Repayment Plan
Then User_609 Check the Amount is Dispalyed in Schedule Details tab in Repayment Plan
Then User_609 Check the Total is Dispalyed in Schedule Details tab in Repayment Plan

@1283827
Scenario: Verify server time in Tracking & Incidental Charges – T07

Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_IC_025
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
And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
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
