Feature: To check the Accrual Process Features

@131160/AT_AP_013
Scenario: Run Accrual Till 15/02/2010 Check the JV posting
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_AP_013
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
And User_611 get the test data for test case AT_AP_013
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
And User_611 get the test data for test case AT_AP_013
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement
And User_611 close the Settlement Approve menu
And User_611 click the periodical processing menu in Menu option under iis application menu
And User_611 click the post accruals menu in periodical processing menu under iis application menu
And User_611 click the final accrual menu in post accrual menu under iis application menu 
And User_611 click the specific deal flag checkbox in final accrual under iis application menu
And User_611 enter the deal number in final accrual under iis application menu 
And User_611 enter the from date in final accrual under iis application menu 
And User_611 enter the to date in final accrual under iis application menu
And User_611 click the ok button in final accrual under iis application menu
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Payment instruction tab under maintenanace in Investment Deals Combined without Trade Deal
And User_611 click the Journal vocher details tab under payment instruction
And User_611 Validate the Journal vocher details tab its open or not by deal number 

@131585/AT_AP_014
Scenario: Ran the accrual profit process on 31/01/2010
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_AP_014
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
And User_611 get the test data for test case AT_AP_014
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

#MTS Application
@252527/AT_AP_048
Scenario: Run the profit accrual on 09/07/2014 from EOD process
Given navigate to MTS application and login with valid credentials
And User_611 get the test data for test case AT_AP_048
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

@352413/AT_AP_049
Scenario: Periodical Process - Post Accruals / Trial Accruals - T10EMT
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_AP_049
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
And User_611 get the test data for test case AT_AP_049
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
And User_611 get the test data for test case AT_AP_049
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement
And User_611 click the periodical processing menu in Menu option under iis application menu
And User_611 click the post accruals menu in periodical processing menu under iis application menu
And User_611 click the trial accrual menu in post accrual under periodical processing menu
And User_611 check the flag in specific deal for entering deal number
And User_611 enter the deal number in specific deal under trial accrual menu
And User_611 enter the from date in Trial accrual under iis application menu 
And User_611 enter the to date in Trial accrual under iis application menu
And User_611 click the ok button in Trial accrual under iis application menu

@352414/AT_AP_050
Scenario: Periodical Process - Post Accruals / Final Accruals - T10EMF
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_AP_050
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
And User_611 get the test data for test case AT_AP_050
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
And User_611 get the test data for test case AT_AP_050
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement
And User_611 close the Settlement Approve menu
And User_611 click the periodical processing menu in Menu option under iis application menu
And User_611 click the post accruals menu in periodical processing menu under iis application menu
And User_611 click the final accrual menu in post accrual menu under iis application menu 
And User_611 click the specific deal flag checkbox in final accrual under iis application menu
And User_611 enter the deal number in final accrual under iis application menu 
And User_611 enter the from date in final accrual under iis application menu 
And User_611 enter the to date in final accrual under iis application menu
And User_611 click the ok button in final accrual under iis application menu
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Payment instruction tab under maintenanace in Investment Deals Combined without Trade Deal
And User_611 click the Journal vocher details tab under payment instruction
And User_611 Validate the Journal vocher details tab its open or not by deal number 

@352415/AT_AP_051
Scenario: Periodical Process - Post Accruals till Maturity date - T10MM
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_AP_051
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
And User_611 get the test data for test case AT_AP_051
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
And User_611 get the test data for test case AT_AP_051
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement
And User_611 close the Settlement Approve menu
And User_611 click the periodical processing menu in Menu option under iis application menu
And User_611 click the Post Accruals till Maturity date menu in Menu options under iis application menu
And User_611 enter the deal number under Post Accruals till Maturity date menu
And User_611 click the trial button under Post Accruals till Maturity date menu
And User_611 click the Process executed successfully ok button for trial button under Post Accruals till Maturity date menu
And User_611 click the final button under Post Accruals till Maturity date menu
And User_611 click the Process executed successfully ok button for final button under Post Accruals till Maturity date menu

@482872/AT_AP_052
Scenario:
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_AP_052
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
And User_611 get the test data for test case AT_AP_052
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
And User_611 get the test data for test case AT_AP_052
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement
And User_611 close the Settlement Approve menu
And User_611 click the periodical processing menu in Menu option under iis application menu
And User_611 click the post accruals menu in periodical processing menu under iis application menu
And User_611 click the trial accrual menu in post accrual under periodical processing menu
And User_611 check the flag in specific deal for entering deal number
And User_611 enter the deal number in specific deal under trial accrual menu
And User_611 enter the from date in Trial accrual under iis application menu 
And User_611 enter the to date in Trial accrual under iis application menu
And User_611 click the ok button in Trial accrual under iis application menu
And User_611 click the final accrual menu in post accrual menu under iis application menu 
And User_611 click the specific deal flag checkbox in final accrual under iis application menu
And User_611 enter the deal number in final accrual under iis application menu 
And User_611 click the ok button in final accrual under iis application menu



