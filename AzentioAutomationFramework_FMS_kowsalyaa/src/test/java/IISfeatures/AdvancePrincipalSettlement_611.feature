Feature: To check Advance Principal Settlement features 
@135535/AT_APS_001
Scenario: Do Advance Principal Settlement
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_APS_001
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the yield details Margin value in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the No of Payments in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_611 get the test data for test case AT_APS_001
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_611 click the advanced principal settelement menu under iis application menu
And User_611 click the maintenance in advanced principal settelment menu  under iis applications menu
And User_611 enter the deal number in settelement details tab under advanced principal settelement menu
And User_611 enter the advanced principal setteled amount in settelement details tab  under advanced principal settelement menu
And User_611 click the RescheduleAndAllocate button in settelement details tab  under advanced principal settelement menu
And User_611 click the save button in schedule details under advanced principal settelement menu
And User_611 click the Approve menu in Advance principal settlement module
And User_611 search the Deal number in Approve menu under Advance principal settlement module
And User_611 double click the searchgrid row in Approve menu under Advance principal settlement module
When User_611 click the Approve button in Approve menu under Advance principal settlement module


@135550/AT_APS_002
Scenario: Do Advance Principle Settlement with maturity account with Restricted CIF
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_APS_002
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the yield details Margin value in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the No of Payments in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_611 get the test data for test case AT_APS_002
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_611 click the advanced principal settelement menu under iis application menu
And User_611 click the maintenance in advanced principal settelment menu  under iis applications menu
And User_611 enter the deal number in settelement details tab under advanced principal settelement menu
And User_611 enter the advanced principal setteled amount in settelement details tab  under advanced principal settelement menu
And User_611 click the RescheduleAndAllocate button in settelement details tab  under advanced principal settelement menu
And User_611 click the save button in schedule details under advanced principal settelement menu
And User_611 click the Approve menu in Advance principal settlement module
And User_611 search the Deal number in Approve menu under Advance principal settlement module
And User_611 double click the searchgrid row in Approve menu under Advance principal settlement module
When User_611 click the Approve button in Approve menu under Advance principal settlement module

@261520/AT_APS_019
Scenario: Create a settlement manually on 08/07/2014 to settlement the installment due on 08/07/2012
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_APS_019
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
And User_611 get the test data for test case AT_APS_019
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
And User_611 get the test data for test case AT_APS_019
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement

@261521/AT_APS_020
Scenario: Run the profit accrual on 31/08/2012 from Periodical process
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_APS_020
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
And User_611 get the test data for test case AT_APS_020
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

@261522/AT_APS_021
Scenario: 1.9 Create a advance settlement manually on 01/09/2012 from APS screen to settle the installment of 08/08/2012 and 08/09/2012
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_APS_021
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
And User_611 get the test data for test case AT_APS_021
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
And User_611 get the test data for test case AT_APS_021
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement

@261523/AT_APS_022
Scenario: Run the profit accrual on 02/09/2012 from periodical process
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_APS_022
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
And User_611 get the test data for test case AT_APS_022
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

## Create un up-front deal with --> 10 years tenure & 1 year grace period -->Profit Calculation & Profit Recognition dropdown as 'Diminising returns'
@261524/AT_APS_023
Scenario: Create a 10 years non upfront deal with 1 year grace period

Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_APS_023
And User_611 clear the caches in IIS Application
And User_611 click the Investment Deals Combined without Trade Deal menu
And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_611 enter the Tenure in maintenance under Investment Deals Combined without Trade Deal
And User_611 select the Tenure dropdown as Years in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_611 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_611 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_611 select the Profit Calculation as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the Profit Recognition as Diminising Returns in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 enter the Grace period in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 select the Grace period dropdown as Years in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_611 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Process
And User_611 get the test data for test case AT_APS_023
Then User_611 click the Approve menu under Investment Deals Combined without Trade Deal
And User_611 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_611 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_611 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal











