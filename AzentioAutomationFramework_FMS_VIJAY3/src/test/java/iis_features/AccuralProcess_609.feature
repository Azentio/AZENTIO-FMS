Feature: Accural Process	
@252436
Scenario: Run the profit accrual on 15/06/2010 from periodical process
Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AP_024
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
And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
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
And User_609 Click the Periodical Processing menu
And User_609 Click the Post Accruals under Periodical Processing menu
And User_609 Click the Final Accruals under Post Accruals in Periodical Processing
And User_609 Enable the Specific Deal Flag in Periodical Processing
And User_609 Select the Deal number under Final Accruals in Periodical Processing
And User_609 Select the From Date under Final Accruals in Periodical Processing
And User_609 Select the To Date under Final Accruals in Periodical Processing
And User_609 Click the Ok Button under Final Accruals in Periodical Processing


@860235
Scenario: FIBSI190039 - Error with Profit Entries on Reversal of Deal
Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AP_058
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
And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
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
And User_609 Click the Periodical Processing menu
And User_609 Click the Post Accruals under Periodical Processing menu
And User_609 Click the Final Accruals under Post Accruals in Periodical Processing
And User_609 Enable the Specific Deal Flag in Periodical Processing
And User_609 Select the Deal number under Final Accruals in Periodical Processing
And User_609 Select the From Date under Final Accruals in Periodical Processing
And User_609 Select the To Date under Final Accruals in Periodical Processing
And User_609 Click the Ok Button under Final Accruals in Periodical Processing
And User_609 Click on Reverse Submenu under Settlement menu
And User_609 Select the Deal number under Reverse in Settlement
And User_609 Click the Reverse Button under Reverse in Settlement
And User_609 Click on Approve Reversal Submenu under Settlement menu
And User_609 Select the Deal number under Approve Reversal in Settlement
And User_609 Click the Reverse Button under Approve Reversal in Settlement


@871551
Scenario: Modification at the level of Accrual/Profit Transfer- Accrual Deal
Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AP_058
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
And User_609 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
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

## Disbursement deal maintenance ##

# MTS Application
@876906
Scenario: Run the EOD Accrual process on 04/04/2016

Given navigate to MTS application and login with valid credentials
#And User_609 get the test data set id for AT_AP_030
And User_609 get the test data set id for AT_AP_060
And User_609 Click the Parameter menu in MTS Application
And User_609 Click the Batch submenu under Parameter menu
And User_609 Click the Maintenance screen under Batch in Parameters
And User_609 Enter the Additional Reference Number under Batch in Parameters
And User_609 Enter the Brief Name under Batch in Parameters
And User_609 Enter the Long Name under Batch in Parameters
And User_609 Enter the Menu Reference number under Batch in Parameters
And User_609 Select the Periodicity under Batch in Parameters
And User_609 Click the Oracle BAJ under Companies in Batch Details tab under Batch in Parameters
And User_609 Select the Head office under Oracle BAJ under Batch in Parameters
And User_609 Select the ICD Treasury-Invest under Oracle BAJ under Batch in Parameters
And User_609 Click the Financing and Treasury under Processes in Batch Details tab under Batch in Parameters
And User_609 Select the Create settlement in Financing and Treasury under Batch in Parameters
And User_609 Select the Approve settlement under Financing and Treasury under Batch in Parameters
And User_609 Select the Profit Accrual Process under Financing and Treasury under Batch in Parameters
And User_609 Click the Batch Control tab in Maintenance under Batch in Parameters
And User_609 Select the Process Batch under Batch Control tab in Maintenance
When User_609 Click the Save Button under Batch in Parameters
And User_609 Click the Approve screen under Batch in Parameters
And User_609 Search the Additional Reference number in Approve screen under Batch in Parameters
And User_609 Select the Additional Reference number in Approve screen under Batch in Parameters
When User_609 Click the Approve button in Approve under Batch in Parameters
 #Refresh the page
 
And User_609 Refresh the MTS Application
And User_609 Click the Process menu in MTS Application
And User_609 Click the Batch Process submenu under Process menu
And User_609 Select the Created Batch under Batch process
And User_609 Click the Batch Run under New Batch in Batch Process
And User_609 Enter the Batch Run Date in Batch Run under Batch Process
When User_609 Click the Run button in Batch Run under Batch Process

@876908
Scenario: Run the EOD Accrual process on 05/04/2016

Given navigate to MTS application and login with valid credentials
#And User_609 get the test data set id for AT_AP_030
And User_609 get the test data set id for AT_AP_061
And User_609 Click the Parameter menu in MTS Application
And User_609 Click the Batch submenu under Parameter menu
And User_609 Click the Maintenance screen under Batch in Parameters
And User_609 Enter the Additional Reference Number under Batch in Parameters
And User_609 Enter the Brief Name under Batch in Parameters
And User_609 Enter the Long Name under Batch in Parameters
And User_609 Enter the Menu Reference number under Batch in Parameters
And User_609 Select the Periodicity under Batch in Parameters
And User_609 Click the Oracle BAJ under Companies in Batch Details tab under Batch in Parameters
And User_609 Select the Head office under Oracle BAJ under Batch in Parameters
And User_609 Select the ICD Treasury-Invest under Oracle BAJ under Batch in Parameters
And User_609 Click the Financing and Treasury under Processes in Batch Details tab under Batch in Parameters
And User_609 Select the Create settlement in Financing and Treasury under Batch in Parameters
And User_609 Select the Approve settlement under Financing and Treasury under Batch in Parameters
And User_609 Select the Profit Accrual Process under Financing and Treasury under Batch in Parameters
And User_609 Click the Batch Control tab in Maintenance under Batch in Parameters
And User_609 Select the Process Batch under Batch Control tab in Maintenance
When User_609 Click the Save Button under Batch in Parameters
And User_609 Click the Approve screen under Batch in Parameters
And User_609 Search the Additional Reference number in Approve screen under Batch in Parameters
And User_609 Select the Additional Reference number in Approve screen under Batch in Parameters
When User_609 Click the Approve button in Approve under Batch in Parameters
 #Refresh the page
 
And User_609 Refresh the MTS Application
And User_609 Click the Process menu in MTS Application
And User_609 Click the Batch Process submenu under Process menu
And User_609 Select the Created Batch under Batch process
And User_609 Click the Batch Run under New Batch in Batch Process
And User_609 Enter the Batch Run Date in Batch Run under Batch Process
When User_609 Click the Run button in Batch Run under Batch Process

@876909
Scenario: Run the EOD Accrual process on 29/06/2016

Given navigate to MTS application and login with valid credentials
#And User_609 get the test data set id for AT_AP_030
And User_609 get the test data set id for AT_AP_062
And User_609 Click the Parameter menu in MTS Application
And User_609 Click the Batch submenu under Parameter menu
And User_609 Click the Maintenance screen under Batch in Parameters
And User_609 Enter the Additional Reference Number under Batch in Parameters
And User_609 Enter the Brief Name under Batch in Parameters
And User_609 Enter the Long Name under Batch in Parameters
And User_609 Enter the Menu Reference number under Batch in Parameters
And User_609 Select the Periodicity under Batch in Parameters
And User_609 Click the Oracle BAJ under Companies in Batch Details tab under Batch in Parameters
And User_609 Select the Head office under Oracle BAJ under Batch in Parameters
And User_609 Select the ICD Treasury-Invest under Oracle BAJ under Batch in Parameters
And User_609 Click the Financing and Treasury under Processes in Batch Details tab under Batch in Parameters
And User_609 Select the Create settlement in Financing and Treasury under Batch in Parameters
And User_609 Select the Approve settlement under Financing and Treasury under Batch in Parameters
And User_609 Select the Profit Accrual Process under Financing and Treasury under Batch in Parameters
And User_609 Click the Batch Control tab in Maintenance under Batch in Parameters
And User_609 Select the Process Batch under Batch Control tab in Maintenance
When User_609 Click the Save Button under Batch in Parameters
And User_609 Click the Approve screen under Batch in Parameters
And User_609 Search the Additional Reference number in Approve screen under Batch in Parameters
And User_609 Select the Additional Reference number in Approve screen under Batch in Parameters
When User_609 Click the Approve button in Approve under Batch in Parameters
 #Refresh the page
 
And User_609 Refresh the MTS Application
And User_609 Click the Process menu in MTS Application
And User_609 Click the Batch Process submenu under Process menu
And User_609 Select the Created Batch under Batch process
And User_609 Click the Batch Run under New Batch in Batch Process
And User_609 Enter the Batch Run Date in Batch Run under Batch Process
When User_609 Click the Run button in Batch Run under Batch Process