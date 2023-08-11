Feature: To check the Accrual Process Features


## Create a non-upfront deal --> Periodical Processing --> Post Accruals --> Final Accruals --> Run the Accruals
@AT_AP_020
Scenario: Run Accrual on 31/01/2012

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AP_020
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
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Process
And User_608 get the test data for test case AT_AP_020
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_608 click the Periodical Processing module in IIS Application
And User_608 click the Post Accrual Menu under Periodical Processing
And User_608 click the Final Accruals under Post Accrual in Periodical Processing
And User_608 check the Specific deal flag under Final Accruals in Post Accrual
And User_608 enter the Deal number in Final Accruals under Post Accrual
And User_608 enter the From Date in Final Accruals under Post Accrual
And User_608 enter the To Date in Final Accruals under Post Accrual
When User_608 click the OK button in Final Accruals under Post Accrual


@AT_AP_021
Scenario: Run Accrual on 31/01/2012

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AP_021
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
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Process
And User_608 get the test data for test case AT_AP_021
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_608 click the Periodical Processing module in IIS Application
And User_608 click the Post Accrual Menu under Periodical Processing
And User_608 click the Final Accruals under Post Accrual in Periodical Processing
And User_608 check the Specific deal flag under Final Accruals in Post Accrual
And User_608 enter the Deal number in Final Accruals under Post Accrual
And User_608 enter the From Date in Final Accruals under Post Accrual
And User_608 enter the To Date in Final Accruals under Post Accrual
When User_608 click the OK button in Final Accruals under Post Accrual
And User_608 click the Calculators module in IIS Application
And User_608 click the Reschedule Calculator With Profit menu under Calculators
And User_608 enter the Deal number in Reschedule Calculator With Profit menu
And User_608 click the Repayment Details panel in Reschedule Calculator With Profit menu
And User_608 enter the First Payment After under Repayment Details panel in Reschedule Calculator With Profit menu
When User_608 click the Calculate button in Reschedule Calculator With Profit menu
When User_608 click the Update button in Reschedule Calculator With Profit menu
And User_608 click the Reschedule Repayment plan module in IIS Application
And User_608 click the Approve menu under Reschedule Repayment plan
And User_608 search the Deal number in approve menu under Reschedule Repayment plan
And User_608 double click the searchgird row in approve menu under Reschedule Repayment plan
When User_608 click the Approve button in approve menu under Reschedule Repayment plan
And User_608 click the Periodical Processing module in IIS Application
And User_608 click the Post Accrual Menu under Periodical Processing
And User_608 click the Final Accruals under Post Accrual in Periodical Processing
And User_608 check the Specific deal flag under Final Accruals in Post Accrual
And User_608 enter the Deal number in Final Accruals under Post Accrual
And User_608 enter the From Date in Final Accruals under Post Accrual
And User_608 enter the To Date in Final Accruals under Post Accrual
When User_608 click the OK button in Final Accruals under Post Accrual


## Create un up-front deal with --> 10 years tenure & 1 year grace period -->Profit Calculation & Profit Recognition dropdown as 'Diminising returns'
@AT_AP_022
Scenario: Create a 10 years non upfront deal with 1 year grace period

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AP_022
And User_608 clear the caches in IIS Application
And User_608 click the Investment Deals Combined without Trade Deal menu
And User_608 click the Maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Tenure in maintenance under Investment Deals Combined without Trade Deal
And User_608 select the Tenure dropdown as Years in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_608 select the Profit Calculation as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the Profit Recognition as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 enter the Grace period in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the Grace period dropdown as Years in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Process
And User_608 get the test data for test case AT_AP_022
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal


## Create un up-front deal with --> 10 years tenure & 1 year grace period  & Run accruals
@AT_AP_023_01
Scenario: Run the accrual and settlement process on the installment dates from EOD and settle the installment till 08/05/2012

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AP_023_01
And User_608 clear the caches in IIS Application
And User_608 click the Investment Deals Combined without Trade Deal menu
And User_608 click the Maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Tenure in maintenance under Investment Deals Combined without Trade Deal
And User_608 select the Tenure dropdown as Years in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_608 select the Profit Calculation as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the Profit Recognition as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 enter the Grace period in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the Grace period dropdown as Years in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Process
And User_608 get the test data for test case AT_AP_023_01
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_608 click the Periodical Processing module in IIS Application
And User_608 click the Post Accrual Menu under Periodical Processing
And User_608 click the Final Accruals under Post Accrual in Periodical Processing
And User_608 check the Specific deal flag under Final Accruals in Post Accrual
And User_608 enter the Deal number in Final Accruals under Post Accrual
When User_608 click the OK button in Final Accruals under Post Accrual


# MTS Application -- create the new batch and run
@AT_AP_023_02
Scenario: Run the accrual and settlement process on the installment dates from EOD and settle the installment till 08/05/2012

Given navigate to MTS application and login with valid credentials
And User_608 get the test data for test case AT_AP_023_02
And User_608 click the Parameter module in MTS Application
And User_608 click the Batch menu under Parameter module
And User_608 click the maintenance screen under Batch menu
And User_608 enter the Additional Ref number in maintenance under Batch menu
And User_608 enter the Brief name in maintenance under Batch menu
And User_608 enter the Long name in maintenance under Batch menu
And User_608 enter the Menu ref number in maintenance under Batch menu
And User_608 select Periodicity as Daily in maintenance under Batch menu
And User_608 click the Oracle BAJ under Companies in Batch Details tab under maintenance
And User_608 select the Head office under Oracle BAJ in Batch Details tab under maintenance
And User_608 select the ICD Treasury-Invest under Oracle BAJ in Batch Details tab under maintenance
And User_608 click the Financing Treasury under processes in Batch Details tab under maintenance
And User_608 select the Create settlement under Financing Treasury in Batch Details tab under maintenance
And User_608 select the Approve settlement under Financing Treasury in Batch Details tab under maintenance
And User_608 select the Profit Accrual Process under Financing Treasury in Batch Details tab under maintenance
And User_608 click the Batch Control tab in maintenance under Batch menu
And User_608 select the Process Batch as Manual under Batch Control tab in maintenance
When User_608 click Save btn under maintenance in under Batch menu
And User_608 click the Approve screen under Batch menu
And User_608 search the Additional Ref number in Approve screen searchgrid under Batch menu
And User_608 double click the searchgird row in Approve menu under Batch menu
When User_608 click the Approve button in Approve menu under Batch menu
# Refresh the page
And User_608 Refresh the MTS Application
And User_608 click the Process module in MTS Application
And User_608 click the Batch Process menu under Process module
And User_608 click the created batch option under Batch process menu
And User_608 click the batch run menu under new batch in Batch Process
And User_608 enter the batch run date in batch run menu under Batch Process
When User_608 click the Run button in  batch run menu under Batch Process


# Sprint- 14
@AT_AP_043
Scenario: Process the “Reschedule Repayment Plan - Installments Settled Not On the Due Date” from periodical process on 20/06/2014

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AP_043
And User_608 clear the caches in IIS Application
And User_608 click the Investment Deals Combined without Trade Deal menu
And User_608 click the Maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Tenure in maintenance under Investment Deals Combined without Trade Deal
And User_608 select the Tenure dropdown as Years in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the Close icon in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Grace period in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the Grace period dropdown as Years in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Process
And User_608 get the test data for test case AT_AP_043
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_608 close the Maintenance screen under Investment Deals Combined without Trade Deal
And User_608 close the Approve screen under Investment Deals Combined without Trade Deal

#And User_608 click the running date label in IIS Application
#And User_608 enter the Running Date under Running date poup in IIS Application
#And User_608 click the Use button under Running date poup in IIS Application
#And User_608 click the close button under Running date poup in IIS Application

### Stpes not created
#And User_608 click the Periodical Processing module in IIS Application
#And User_608 click the Reschedule Repayment Plan Installments Settled Not On the Due Date menu
#And User_608 enter the Transaction date under Installments Settled Not On the Due Date
#And User_608 click the deal number check box in Installments Settled Not On the Due Date
#And User_608 click the Process button under Installments Settled Not On the Due Date


@AT_AP_044
Scenario: Run the profit accrual on 24/06/2014 from periodical process

Given navigate to IIS application and login with valid credentials
And User_608 clear the caches in IIS Application
And User_608 Update the test data id for AT_AP_043
And User_608 Store the newly created Deal number in Temp variable
And User_608 Update the test data id for AT_AP_044
And User_608 Store the newly Deal number for Accrual
And User_608 get the test data for test case AT_AP_044
And User_608 click the Periodical Processing module in IIS Application
And User_608 click the Post Accrual Menu under Periodical Processing
And User_608 click the Final Accruals under Post Accrual in Periodical Processing
And User_608 check the Specific deal flag under Final Accruals in Post Accrual
And User_608 enter the Deal number in Final Accruals under Post Accrual
And User_608 enter the From Date in Final Accruals under Post Accrual
And User_608 enter the To Date in Final Accruals under Post Accrual
When User_608 click the OK button in Final Accruals under Post Accrual


@AT_AP_045
Scenario: Create an Advance Principal settlement on 25/06/2014 from APS screen for 1000000.00

Given navigate to IIS application and login with valid credentials
And User_608 clear the caches in IIS Application
And User_608 Update the test data id for AT_AP_043
And User_608 Store the newly created Deal number in Temp variable
And User_608 Update the test data id for AT_AP_045
And User_608 Store the newly Deal number for Accrual
And User_608 get the test data for test case AT_AP_045
And User_608 click the Advance principal settlement module
And User_608 click the maintenance under Advance principal settlement module
And User_608 enter the Deal number in maintenance screen under Advance principal settlement
And User_608 enter the Advance principal in maintenance screen under Advance principal settlement
And User_608 click the Reschedule&Allocate button in maintenance screen under Advance principal settlement
When User_608 click the Save button in maintenance screen under Advance principal settlement
And User_608 click the Approve menu in Advance principal settlement module
And User_608 search the Deal number in Approve menu under Advance principal settlement module
And User_608 double click the searchgrid row in Approve menu under Advance principal settlement module
When User_608 click the Approve button in Approve menu under Advance principal settlement module


@AT_AP_046
Scenario: Run the Accrual process from EOD process

Given navigate to MTS application and login with valid credentials
And User_608 clear the caches in IIS Application
And User_608 get the test data for test case AT_AP_046
And User_608 click the Parameter module in MTS Application
And User_608 click the Batch menu under Parameter module
And User_608 click the maintenance screen under Batch menu
And User_608 enter the Additional Ref number in maintenance under Batch menu
And User_608 enter the Brief name in maintenance under Batch menu
And User_608 enter the Long name in maintenance under Batch menu
And User_608 enter the Menu ref number in maintenance under Batch menu
And User_608 select Periodicity as Daily in maintenance under Batch menu
And User_608 click the Oracle BAJ under Companies in Batch Details tab under maintenance
And User_608 select the Head office under Oracle BAJ in Batch Details tab under maintenance
And User_608 click the Financing Treasury under processes in Batch Details tab under maintenance
And User_608 select the Profit Accrual Process under Financing Treasury in Batch Details tab under maintenance
And User_608 click the Batch Control tab in maintenance under Batch menu
And User_608 select the Process Batch as Manual under Batch Control tab in maintenance
When User_608 click Save btn under maintenance in under Batch menu
And User_608 click the Approve screen under Batch menu
And User_608 search the Additional Ref number in Approve screen searchgrid under Batch menu
And User_608 double click the searchgird row in Approve menu under Batch menu
When User_608 click the Approve button in Approve menu under Batch menu
# Refresh the page
And User_608 Refresh the MTS Application
And User_608 click the Process module in MTS Application
And User_608 click the Batch Process menu under Process module
And User_608 click the created batch option under Batch process menu
And User_608 click the batch run menu under new batch in Batch Process
And User_608 enter the batch run date in batch run menu under Batch Process
When User_608 click the Run button in  batch run menu under Batch Process








