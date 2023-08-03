Feature: To check the Accrual Deal Features

## Create deal in investment deal without trade deal --> validate and approve
## Settlement --> Main --> using Deal number --> Click Automatic allocation --> Save & Approve

@AT_AD_003
Scenario: Create a future settlement for the installment 05/05/2007 on 15/04/2007

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AD_003
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
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_608 get the test data for test case AT_AD_003
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_608 click the Settlement module in IIS Application
And User_608 click the maintenance menu under Settlement module
And User_608 enter the Deal number in maintenance menu under Settlement
And User_608 enter the Amount received from party in maintenance menu under Settlement
When User_608 click the Automatic Allocation button in maintenance menu under Settlement
When User_608 click the Save button in maintenance menu under Settlement
And User_608 click the approve menu under Settlement module
And User_608 get the test data for test case AT_AD_003
And User_608 enter the settlement number in searchgrid under approve menu in Settlement
And User_608 double click the searchgrid row in approve menu under Settlement
And User_608 click the Approve button in approve menu under Settlement


## Create deal in investment deal without trade deal --> validate and approve
## Settlement --> Main --> using Deal number --> Click Automatic allocation --> Save & Approve
## Settlement --> Reverse and approve the settlement
## Again create the Settlement for this Deal.
@AT_AD_015
Scenario: Execute the TC 6 again

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AD_015
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
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_608 get the test data for test case AT_AD_015
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_608 click the Settlement module in IIS Application
And User_608 click the maintenance menu under Settlement module
And User_608 enter the Deal number in maintenance menu under Settlement
And User_608 enter the Amount received from party in maintenance menu under Settlement
When User_608 click the Automatic Allocation button in maintenance menu under Settlement
When User_608 click the Save button in maintenance menu under Settlement
And User_608 close the Settlement Maintenance menu
And User_608 click the approve menu under Settlement module
And User_608 get the test data for test case AT_AD_015
And User_608 enter the settlement number in searchgrid under approve menu in Settlement
And User_608 double click the searchgrid row in approve menu under Settlement
And User_608 click the Approve button in approve menu under Settlement
And User_608 close the Settlement Approve menu
And User_608 click the Reverse menu under Settlement module
And User_608 search the settlement number in searchgrid under Reverse menu in Settlement
And User_608 double click the searchgrid row in Reverse menu under Settlement
And User_608 click the Reverse button in Reverse menu under Settlement
And User_608 click the Approve Reverse menu under Settlement module
And User_608 search the settlement number in searchgrid under Approve Reverse menu in Settlement
And User_608 double click the searchgrid row in Approve Reverse menu under Settlement
And User_608 click the Reverse button in Approve Reverse menu under Settlement
And User_608 click the Settlement module in IIS Application
And User_608 click the maintenance menu under Settlement module
And User_608 enter the Deal number in maintenance menu under Settlement
And User_608 enter the Amount received from party in maintenance menu under Settlement
When User_608 click the Automatic Allocation button in maintenance menu under Settlement
When User_608 click the Save button in maintenance menu under Settlement
And User_608 click the approve menu under Settlement module
And User_608 get the test data for test case AT_AD_015
And User_608 enter the settlement number in searchgrid under approve menu in Settlement
And User_608 double click the searchgrid row in approve menu under Settlement
And User_608 click the Approve button in approve menu under Settlement


## Create Accrual deal in investment deal without trade deal --> validate and approve
## Advance principal settlement module --  enter principal amt --> save and approve
@AT_AD_018
Scenario: Do an Advance principal on 05/01/2008

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_AD_018
And User_608 clear the caches in IIS Application
And User_608 click the Investment Deals Combined without Trade Deal menu
And User_608 click the Maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the yield details Margin value in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the No of Payments in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Accrual Deal
And User_608 get the test data for test case AT_AD_018
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
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
