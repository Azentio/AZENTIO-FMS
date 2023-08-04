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
And User_611 click the Investment Deals Combined without Trade Deal menu
#And User_611 click the Maintenance under Investment Deals Combined without Trade Deal
#And User_611 click the Journal Voucher details tab in maintenance under Investment Deals Combined without Trade Deal

