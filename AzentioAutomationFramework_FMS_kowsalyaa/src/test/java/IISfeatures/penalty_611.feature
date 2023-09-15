Feature: To test the Penalty features
@555545/AT_PNLT_008
Scenario: Check the penalty case6
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_008
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_611 get the test data for test case AT_PNLT_008
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_611 click the Settlement module in IIS Application
And User_611 click the maintenance menu under Settlement module
And User_611 enter the Deal number in maintenance menu under Settlement
And User_611 enter the Amount received from party in maintenance menu under Settlement
When User_611 click the Automatic Allocation button in maintenance menu under Settlement
When User_611 click the Save button in maintenance menu under Settlement
And User_611 click the approve menu under Settlement module
And User_611 get the test data for test case AT_PNLT_008
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement 

#MTS Application
@555545/AT_PNLT_008_01
Scenario: Run the EOD Additional profit accraul process
Given navigate to MTS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_008_01
And User_611 click the Parameter module in MTS Application
And User_611 click the Batch menu under Parameter module
And User_611 click the maintenance screen under Batch menu
And User_611 enter the Additional Ref number in maintenance under Batch menu
And User_611 enter the Brief name in maintenance under Batch menu
And User_611 enter the Long name in maintenance under Batch menu
And User_611 enter the Menu ref number in maintenance under Batch menu
And User_611 select Periodicity as Daily in maintenance under Batch menu
And User_611 click the Oracle BAJ under Companies in Batch Details tab under maintenance
And User_611 select the Head office under Oracle BAJ in Batch Details tab under maintenance
And User_611 select the ICD Treasury-Invest under Oracle BAJ in Batch Details tab under maintenance
And User_611 click the Financing Treasury under processes in Batch Details tab under maintenance
And User_611 select the Profit Accrual Process under Financing Treasury in Batch Details tab under maintenance
And User_611 click the Batch Control tab in maintenance under Batch menu
And User_611 select the Process Batch as Manual under Batch Control tab in maintenance
When User_611 click Save btn under maintenance in under Batch menu
And User_611 click the Approve screen under Batch menu
And User_611 search the Additional Ref number in Approve screen searchgrid under Batch menu
And User_611 double click the searchgird row in Approve menu under Batch menu
When User_611 click the Approve button in Approve menu under Batch menu
# Refresh the page
And User_611 Refresh the MTS Application
And User_611 click the Process module in MTS Application
And User_611 click the Batch Process menu under Process module
And User_611 click the created batch option under Batch process menu
And User_611 click the batch run menu under new batch in Batch Process
And User_611 enter the batch run date in batch run menu under Batch Process
When User_611 click the Run button in  batch run menu under Batch Process

@555546/AT_PNLT_009
Scenario: Check the penalty case7
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_009
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_611 get the test data for test case AT_PNLT_009
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_611 click the Settlement module in IIS Application
And User_611 click the maintenance menu under Settlement module
And User_611 enter the Deal number in maintenance menu under Settlement
And User_611 enter the Amount received from party in maintenance menu under Settlement
When User_611 click the Automatic Allocation button in maintenance menu under Settlement
When User_611 click the Save button in maintenance menu under Settlement
And User_611 click the approve menu under Settlement module
And User_611 get the test data for test case AT_PNLT_009
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement 

#MTS Application
@555546/AT_PNLT_009_01
Scenario: Run the EOD Additional profit accraul process
Given navigate to MTS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_009_01
And User_611 click the Parameter module in MTS Application
And User_611 click the Batch menu under Parameter module
And User_611 click the maintenance screen under Batch menu
And User_611 enter the Additional Ref number in maintenance under Batch menu
And User_611 enter the Brief name in maintenance under Batch menu
And User_611 enter the Long name in maintenance under Batch menu
And User_611 enter the Menu ref number in maintenance under Batch menu
And User_611 select Periodicity as Daily in maintenance under Batch menu
And User_611 click the Oracle BAJ under Companies in Batch Details tab under maintenance
And User_611 select the Head office under Oracle BAJ in Batch Details tab under maintenance
And User_611 select the ICD Treasury-Invest under Oracle BAJ in Batch Details tab under maintenance
And User_611 click the Financing Treasury under processes in Batch Details tab under maintenance
And User_611 select the Profit Accrual Process under Financing Treasury in Batch Details tab under maintenance
And User_611 click the Batch Control tab in maintenance under Batch menu
And User_611 select the Process Batch as Manual under Batch Control tab in maintenance
When User_611 click Save btn under maintenance in under Batch menu
And User_611 click the Approve screen under Batch menu
And User_611 search the Additional Ref number in Approve screen searchgrid under Batch menu
And User_611 double click the searchgird row in Approve menu under Batch menu
When User_611 click the Approve button in Approve menu under Batch menu
# Refresh the page
And User_611 Refresh the MTS Application
And User_611 click the Process module in MTS Application
And User_611 click the Batch Process menu under Process module
And User_611 click the created batch option under Batch process menu
And User_611 click the batch run menu under new batch in Batch Process
And User_611 enter the batch run date in batch run menu under Batch Process
When User_611 click the Run button in  batch run menu under Batch Process

@555548/AT_PNLT_010
Scenario: Check the validation reschedule calculatos in case the additional profit available for the deal
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_010
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_611 get the test data for test case AT_PNLT_010
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_611 click the Settlement module in IIS Application
And User_611 click the maintenance menu under Settlement module
And User_611 enter the Deal number in maintenance menu under Settlement
And User_611 enter the Amount received from party in maintenance menu under Settlement
When User_611 click the Automatic Allocation button in maintenance menu under Settlement
When User_611 click the Save button in maintenance menu under Settlement
And User_611 click the approve menu under Settlement module
And User_611 get the test data for test case AT_PNLT_010
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement 

#MTS Application
@555548/AT_PNLT_010_01
Scenario: Run the EOD Additional profit accraul process
Given navigate to MTS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_010_01
And User_611 click the Parameter module in MTS Application
And User_611 click the Batch menu under Parameter module
And User_611 click the maintenance screen under Batch menu
And User_611 enter the Additional Ref number in maintenance under Batch menu
And User_611 enter the Brief name in maintenance under Batch menu
And User_611 enter the Long name in maintenance under Batch menu
And User_611 enter the Menu ref number in maintenance under Batch menu
And User_611 select Periodicity as Daily in maintenance under Batch menu
And User_611 click the Oracle BAJ under Companies in Batch Details tab under maintenance
And User_611 select the Head office under Oracle BAJ in Batch Details tab under maintenance
And User_611 select the ICD Treasury-Invest under Oracle BAJ in Batch Details tab under maintenance
And User_611 click the Financing Treasury under processes in Batch Details tab under maintenance
And User_611 select the Profit Accrual Process under Financing Treasury in Batch Details tab under maintenance
And User_611 click the Batch Control tab in maintenance under Batch menu
And User_611 select the Process Batch as Manual under Batch Control tab in maintenance
When User_611 click Save btn under maintenance in under Batch menu
And User_611 click the Approve screen under Batch menu
And User_611 search the Additional Ref number in Approve screen searchgrid under Batch menu
And User_611 double click the searchgird row in Approve menu under Batch menu
When User_611 click the Approve button in Approve menu under Batch menu
# Refresh the page
And User_611 Refresh the MTS Application
And User_611 click the Process module in MTS Application
And User_611 click the Batch Process menu under Process module
And User_611 click the created batch option under Batch process menu
And User_611 click the batch run menu under new batch in Batch Process
And User_611 enter the batch run date in batch run menu under Batch Process
When User_611 click the Run button in  batch run menu under Batch Process

#Navigate to Reschedule calculators screen
@555548/AT_PNLT_010_02
Scenario: Navigate to Reschedule calculators screen
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_010_02
And User_611 click the Calculators module in IIS Application
And User_611 click the Reschedule Calculator With Profit menu under Calculators
And User_611 enter the Deal number in Reschedule Calculator With Profit menu
And User_611 click the Repayment Details panel in Reschedule Calculator With Profit menu
And User_611 enter the First Payment After under Repayment Details panel in Reschedule Calculator With Profit menu
When User_611 click the Calculate button in Reschedule Calculator With Profit menu
When User_611 click the Update button in Reschedule Calculator With Profit menu
And User_611 click the Reschedule Repayment plan module in IIS Application
And User_611 click the Approve menu under Reschedule Repayment plan
And User_611 search the Deal number in approve menu under Reschedule Repayment plan
And User_611 double click the searchgird row in approve menu under Reschedule Repayment plan
When User_611 click the Approve button in approve menu under Reschedule Repayment plan
And User_611 click the periodical processing menu in Menu option under iis application menu
And User_611 click the post accruals menu in periodical processing menu under iis application menu
And User_611 click the final accrual menu in post accrual menu under iis application menu 
And User_611 click the specific deal flag checkbox in final accrual under iis application menu
And User_611 enter the deal number in final accrual under iis application menu 
And User_611 enter the from date in final accrual under iis application menu 
And User_611 enter the to date in final accrual under iis application menu
And User_611 click the ok button in final accrual under iis application menu 


@555549/AT_PNLT_011
Scenario: Check the validation reschedule calculatos in case the additional profit available for the deal
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_011
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_611 get the test data for test case AT_PNLT_011
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_611 click the periodical processing menu in Menu option under iis application menu
And User_611 click the post accruals menu in periodical processing menu under iis application menu
And User_611 click the final accrual menu in post accrual menu under iis application menu 
And User_611 click the specific deal flag checkbox in final accrual under iis application menu
And User_611 enter the deal number in final accrual under iis application menu 
And User_611 enter the from date in final accrual under iis application menu 
And User_611 enter the to date in final accrual under iis application menu
And User_611 click the ok button in final accrual under iis application menu
And User_611 click the Calculators module in IIS Application
And User_611 click the Reschedule Calculator With Profit menu under Calculators
And User_611 enter the Deal number in Reschedule Calculator With Profit menu
And User_611 click the Repayment Details panel in Reschedule Calculator With Profit menu
And User_611 enter the First Payment After under Repayment Details panel in Reschedule Calculator With Profit menu
When User_611 click the Calculate button in Reschedule Calculator With Profit menu
When User_611 click the Update button in Reschedule Calculator With Profit menu
And User_611 click the Reschedule Repayment plan module in IIS Application
And User_611 click the Approve menu under Reschedule Repayment plan
And User_611 search the Deal number in approve menu under Reschedule Repayment plan
And User_611 double click the searchgird row in approve menu under Reschedule Repayment plan
When User_611 click the Approve button in approve menu under Reschedule Repayment plan

@555550/AT_PNLT_012
Scenario: Check the additional profit case in the Floating rate revaluation
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_012
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_611 get the test data for test case AT_PNLT_012
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_611 click the Settlement module in IIS Application
And User_611 click the maintenance menu under Settlement module
And User_611 enter the Deal number in maintenance menu under Settlement
And User_611 enter the Amount received from party in maintenance menu under Settlement
When User_611 click the Automatic Allocation button in maintenance menu under Settlement
When User_611 click the Save button in maintenance menu under Settlement
And User_611 close the Settlement Maintenance menu
And User_611 click the approve menu under Settlement module
And User_611 get the test data for test case AT_PNLT_012
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement
And User_611 close the Settlement Approve menu

@582129/AT_PNLT_013
Scenario: Check the availability of the new flag "Default Outstanding Penalty Amount as Penalty Amount Paid"
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_PNLT_013
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_611 get the test data for test case AT_PNLT_013
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_611 click the Settlement module in IIS Application
And User_611 click the maintenance menu under Settlement module
And User_611 enter the Deal number in maintenance menu under Settlement
And User_611 enter the Amount received from party in maintenance menu under Settlement
When User_611 click the Automatic Allocation button in maintenance menu under Settlement
When User_611 click the Save button in maintenance menu under Settlement
And User_611 close the Settlement Maintenance menu
And User_611 click the approve menu under Settlement module
And User_611 get the test data for test case AT_PNLT_013
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement
And User_611 close the Settlement Approve menu



