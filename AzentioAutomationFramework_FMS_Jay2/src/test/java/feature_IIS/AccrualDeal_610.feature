Feature: To check the Incidental Charges Feature

## Create a investment deal without trade deal

@128357
Scenario: Create a Non Upfront deal with 48 monthly installments at month beginning in T022 screen
Given navigate to IIS application and login with valid credentials
And User_610 get the test data set id for AT_AD_010
And User_610 clear the caches in IIS Application
And User_610 Click the Investment Deals Combined without Trade Deal menu
And User_610 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_610 Select the Party in Investment Deals Combined without Trade Deal
And User_610 Select the Category in Investment Deals Combined without Trade Deal
And User_610 Select the Product Class in Investment Deals Combined without Trade Deal
And User_610 Enter the Amount in Investment Deals Combined without Trade Deal
And User_610 Enter the Tenure in Investment Deals Combined without Trade Deal
And User_610 Enter the Yield in Investment Deals Combined without Trade Deal
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


@128358
Scenario: Create a manual settlement on 05/04/2007

Given navigate to IIS application and login with valid credentials
And User_610 get the test data set id for AT_AD_010
And User_610 clear the caches in IIS Application
And User_610 Click the Investment Deals Combined without Trade Deal menu
And User_610 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_610 Select the Party in Investment Deals Combined without Trade Deal
And User_610 Select the Category in Investment Deals Combined without Trade Deal
And User_610 Select the Product Class in Investment Deals Combined without Trade Deal
And User_610 Enter the Amount in Investment Deals Combined without Trade Deal
And User_610 Enter the Tenure in Investment Deals Combined without Trade Deal
And User_610 Enter the Yield in Investment Deals Combined without Trade Deal
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
#-----settlement
And User_610 click the Settlement module in IIS Application
And User_610 click the maintenance menu under Settlement module
And User_610 enter the Deal number in maintenance menu under Settlement
And User_610 enter the Amount received from party in maintenance menu under Settlement
When User_610 click the Automatic Allocation button in maintenance menu under Settlement
When User_610 click the Save button in maintenance menu under Settlement
And User_610 click the approve menu under Settlement module
And User_610 get the test data for test case AT_AD_003
And User_610 enter the settlement number in searchgrid under approve menu in Settlement
And User_610 double click the searchgrid row in approve menu under Settlement
And User_610 click the Approve button in approve menu under Settlement


@128359

Scenario: Create a future settlement for the installment 05/05/2007 on 15/04/2007

Given navigate to IIS application and login with valid credentials
And User_610 get the test data set id for AT_AD_010
And User_610 clear the caches in IIS Application
And User_610 Click the Investment Deals Combined without Trade Deal menu
And User_610 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_610 Select the Party in Investment Deals Combined without Trade Deal
And User_610 Select the Category in Investment Deals Combined without Trade Deal
And User_610 Select the Product Class in Investment Deals Combined without Trade Deal
And User_610 Enter the Amount in Investment Deals Combined without Trade Deal
And User_610 Enter the Tenure in Investment Deals Combined without Trade Deal
And User_610 Enter the Yield in Investment Deals Combined without Trade Deal
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
#-----settlement
And User_610 click the Settlement module in IIS Application
And User_610 click the maintenance menu under Settlement module
And User_610 enter the Deal number in maintenance menu under Settlement
And User_610 enter the Amount received from party in maintenance menu under Settlement
When User_610 click the Automatic Allocation button in maintenance menu under Settlement
When User_610 click the Save button in maintenance menu under Settlement
And User_610 click the approve menu under Settlement module
And User_610 get the test data for test case AT_AD_003
And User_610 enter the settlement number in searchgrid under approve menu in Settlement
And User_610 double click the searchgrid row in approve menu under Settlement
And User_610 click the Approve button in approve menu under Settlement


#--------------

@128357
Scenario: Create a Non Upfront deal with 48 monthly installments at month beginning in T022 screen
Given navigate to IIS application and login with valid credentials
And User_610 get the test data set id for AT_AD_010
And User_610 clear the caches in IIS Application
And User_610 Click the Investment Deals Combined without Trade Deal menu
And User_610 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_610 Select the Party in Investment Deals Combined without Trade Deal
And User_610 Select the Category in Investment Deals Combined without Trade Deal
And User_610 Select the Product Class in Investment Deals Combined without Trade Deal
And User_610 Enter the Amount in Investment Deals Combined without Trade Deal
And User_610 Enter the Tenure in Investment Deals Combined without Trade Deal
And User_610 Enter the Yield in Investment Deals Combined without Trade Deal
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

@128357
Scenario: Create a Non Upfront deal with 48 monthly installments at month beginning in T022 screen
Given navigate to IIS application and login with valid credentials
And User_610 get the test data set id for AT_AD_010
And User_610 clear the caches in IIS Application
And User_610 Click the Investment Deals Combined without Trade Deal menu
And User_610 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_610 Select the Party in Investment Deals Combined without Trade Deal
And User_610 Select the Category in Investment Deals Combined without Trade Deal
And User_610 Select the Product Class in Investment Deals Combined without Trade Deal
And User_610 Enter the Amount in Investment Deals Combined without Trade Deal
And User_610 Enter the Tenure in Investment Deals Combined without Trade Deal
And User_610 Enter the Yield in Investment Deals Combined without Trade Deal
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
#-----settlement
And User_610 click the Settlement module in IIS Application
And User_610 click the maintenance menu under Settlement module
And User_610 enter the Deal number in maintenance menu under Settlement
And User_610 enter the Amount received from party in maintenance menu under Settlement
When User_610 click the Automatic Allocation button in maintenance menu under Settlement
When User_610 click the Save button in maintenance menu under Settlement
And User_610 click the approve menu under Settlement module
And User_610 get the test data for test case AT_AD_003
And User_610 enter the settlement number in searchgrid under approve menu in Settlement
And User_610 double click the searchgrid row in approve menu under Settlement
And User_610 click the Approve button in approve menu under Settlement


#---------------------------

#------------------

@128357
Scenario: Create a Non Upfront deal with 48 monthly installments at month beginning in T022 screen
Given navigate to IIS application and login with valid credentials
And User_610 get the test data set id for AT_AD_010
And User_610 clear the caches in IIS Application
And User_610 Click the Investment Deals Combined without Trade Deal menu
And User_610 Click the Maintenance under Investment Deals Combined without Trade Deal
And User_610 Select the Party in Investment Deals Combined without Trade Deal
And User_610 Select the Category in Investment Deals Combined without Trade Deal
And User_610 Select the Product Class in Investment Deals Combined without Trade Deal
And User_610 Enter the Amount in Investment Deals Combined without Trade Deal
And User_610 Enter the Tenure in Investment Deals Combined without Trade Deal
And User_610 Enter the Yield in Investment Deals Combined without Trade Deal
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
#-----settlement
And User_610 click the Settlement module in IIS Application
And User_610 click the maintenance menu under Settlement module
And User_610 enter the Deal number in maintenance menu under Settlement
And User_610 enter the Amount received from party in maintenance menu under Settlement
When User_610 click the Automatic Allocation button in maintenance menu under Settlement
When User_610 click the Save button in maintenance menu under Settlement
And User_610 click the approve menu under Settlement module
And User_610 get the test data for test case AT_AD_003
And User_610 enter the settlement number in searchgrid under approve menu in Settlement
And User_610 double click the searchgrid row in approve menu under Settlement
And User_610 click the Approve button in approve menu under Settlement
#Reverse
And User_610 click the Reverse menu under Settlement module
And User_610 search the settlement number in searchgrid under Reverse menu in Settlement
And User_610 double click the searchgrid row in Reverse menu under Settlement
And User_610 click the Reverse button in Reverse menu under Settlement
And User_610 click the Approve Reverse menu under Settlement module
And User_610 search the settlement number in searchgrid under Approve Reverse menu in Settlement
And User_610 double click the searchgrid row in Approve Reverse menu under Settlement
And User_610 click the Reverse button in Approve Reverse menu under Settlement






















































