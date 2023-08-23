Feature: Advence Principle Settlement

# MTS Application
@258495
Scenario: Run the accrual from EOD process on 30/04/2014

Given navigate to MTS application and login with valid credentials
#And User_610 get the test data for test case AT_AP_023_02
#And User_610 click the Parameter module in MTS Application
#And User_610 click the Batch menu under Parameter module
#And User_610 click the maintenance screen under Batch menu
#And User_610 enter the Additional Ref number in maintenance under Batch menu
#And User_610 enter the Brief name in maintenance under Batch menu
#And User_610 enter the Long name in maintenance under Batch menu
#And User_610 enter the Menu ref number in maintenance under Batch menu
#And User_610 select Periodicity as Daily in maintenance under Batch menu
#And User_610 click the Oracle BAJ under Companies in Batch Details tab under maintenance
#And User_610 select the Head office under Oracle BAJ in Batch Details tab under maintenance
#And User_610 select the ICD Treasury-Invest under Oracle BAJ in Batch Details tab under maintenance
#And User_610 click the Financing Treasury under processes in Batch Details tab under maintenance
#And User_610 select the Create settlement under Financing Treasury in Batch Details tab under maintenance
#And User_610 select the Approve settlement under Financing Treasury in Batch Details tab under maintenance
#And User_610 select the Profit Accrual Process under Financing Treasury in Batch Details tab under maintenance
#And User_610 click the Batch Control tab in maintenance under Batch menu
#And User_610 select the Process Batch as Manual under Batch Control tab in maintenance
#When User_610 click Save btn under maintenance in under Batch menu
#And User_610 click the Approve screen under Batch menu
#And User_610 search the Additional Ref number in Approve screen searchgrid under Batch menu
#And User_610 double click the searchgird row in Approve menu under Batch menu
#When User_610 click the Approve button in Approve menu under Batch menu
# Refresh the page
And User_610 Refresh the MTS Application
And User_610 click the Process module in MTS Application
And User_610 click the Batch Process menu under Process module
And User_610 click the created batch option under Batch process menu
And User_610 click the batch run menu under new batch in Batch Process
And User_610 enter the batch run date in batch run menu under Batch Process
When User_610 click the Run button in  batch run menu under Batch Process


#--------------------------
@258496

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