Feature: TO Check the Advance Payment Features

#Check the Advance payment availability(Maintenance, Query, Approve, Reverse,Approve Reversal Update after approve,Cancel and Increase):
@1358470/AT_APY_011
Scenario: Validate the New Screen Advance Payments availability
Given navigate to IIS application and login with valid credentials
And User_611 Validate the Advance Payment menu in IIS application 
And User_611 Validate the Maintenance Submenu under Advance Payment menu in IIS application
And User_611 Validate the Query Submenu under Advance Payment menu in IIS application
And User_611 Validate the Verify Submenu under Advance Payment menu in IIS application 
And User_611 Validate the Approve Submenu under Advance Payment menu in IIS application
And User_611 Validate the Reverse Submenu under Advance Payment menu in IIS application
And User_611 Validate the update after approve Submenu under Advance Payment menu in IIS application
And User_611 Validate the Batch Advance Payment Submenu under Advance Payment menu in IIS application
And User_611 Validate the Advance Payment-Increase Submenu under Advance Payment menu in IIS application
And User_611 Validate the  Advance Payment-Cancel Submenu under Advance Payment menu in IIS application   

@1358506/AT_APY_012 
Scenario: Validate the functionality of New Screen  Advance Payments
Given navigate to IIS application and login with valid credentials
And User_611 get the test data for test case AT_APY_012
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
And User_611 get the test data for test case AT_APY_012
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
And User_611 get the test data for test case AT_APY_012
And User_611 enter the settlement number in searchgrid under approve menu in Settlement
And User_611 double click the searchgrid row in approve menu under Settlement
And User_611 click the Approve button in approve menu under Settlement