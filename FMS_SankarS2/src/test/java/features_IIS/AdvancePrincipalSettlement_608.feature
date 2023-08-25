Feature: To check the Advance Principal Settlement feature

@AT_APS_004
Scenario: TSR-FBL140012 - Advance Principal settlement issue


Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_APS_004
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
And User_608 uncheck the Compounding Grace Period Check box in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the validate button in maintenance under Investment Deals Combined without Trade Deal for Advance Principal Settlement
And User_608 get the test data for test case AT_APS_004
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


@AT_APS_005
Scenario: TSR-BB140147 - System allowed to create advance principal settlement for a deal with an active setttlement

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_APS_005
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
And User_608 click the validate button in maintenance under Investment Deals Combined without Trade Deal for Advance Principal Settlement
And User_608 get the test data for test case AT_APS_005
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_608 click the Settlement module in IIS Application
And User_608 click the maintenance menu under Settlement module
And User_608 enter the Deal number in maintenance menu under Settlement
And User_608 enter the Amount received from party in maintenance menu under Settlement
When User_608 click the Automatic Allocation button in maintenance menu under Settlement
And User_608 click the Advance principal settlement module
And User_608 click the maintenance under Advance principal settlement module
And User_608 enter the Deal number in maintenance screen under Advance principal settlement
And User_608 enter the Advance principal in maintenance screen under Advance principal settlement
And User_608 click the Reschedule&Allocate button in maintenance screen under Advance principal settlement
And User_608 click the Settlement maintenance tab in IIS Application
When User_608 click the Save button in maintenance menu under Settlement
And User_608 click the Advance principal settlement maintenance in IIS Application
When User_608 click the Save button in maintenance screen under Advance principal settlement
And User_608 validate the Settlement exists popup in Advance principal settlement
And User_608 click the approve menu under Settlement module
And User_608 get the test data for test case AT_APS_005
And User_608 enter the settlement number in searchgrid under approve menu in Settlement
And User_608 double click the searchgrid row in approve menu under Settlement
When User_608 click the Reject button in maintenance menu under Settlement
And User_608 enter the Reject Reason code in maintenance menu under Settlement
When User_608 click the reject reason popup Reject button in maintenance menu under Settlement
And User_608 click the Advance principal settlement maintenance in IIS Application
When User_608 click the Save button in maintenance screen under Advance principal settlement
And User_608 click the Approve menu in Advance principal settlement module
And User_608 search the Deal number in Approve menu under Advance principal settlement module
And User_608 double click the searchgrid row in Approve menu under Advance principal settlement module
When User_608 click the Approve button in Approve menu under Advance principal settlement module


@AT_APS_006
Scenario: Create a non upfront deal for one year with compounding during grace period

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_APS_006
And User_608 clear the caches in IIS Application
And User_608 click the Investment Deals Combined without Trade Deal menu
And User_608 click the Maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the yield details Margin value in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Agency fee value in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_608 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_608 enter the Compounding During Grace Period in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 select the Compounding During Grace Period dropdown in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 validate the Agency fees column in schedule details tab in repayment under maintenance in Investment Deals Combined without Trade Deal
And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_608 click the validate button in maintenance under Investment Deals Combined without Trade Deal for Advance Principal Settlement
And User_608 get the test data for test case AT_APS_006
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal



@AT_APS_016
Scenario: Create a advance settlement manually on 01/06/2012 to settlement the installment due on 08/06/2014 from APS screen and check the new button “Show schedule added in the APS scree

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_APS_016
And User_608 clear the caches in IIS Application
And User_608 click the Advance principal settlement module
And User_608 click the maintenance under Advance principal settlement module
And User_608 enter the Deal number in maintenance screen under Advance principal settlement
And User_608 enter the Advance principal in maintenance screen under Advance principal settlement
And User_608 validate the Show Schedule button is available in Advance principal settlement maintenance screen
And User_608 click the Schedule details tab in Advance principal settlement maintenance screen
And User_608 enter the settlement amount under Schedule details tab in Advance principal settlement maintenance
When User_608 click the Save button in maintenance screen under Advance principal settlement
And User_608 click the Approve menu in Advance principal settlement module
And User_608 search the Deal number in Approve menu under Advance principal settlement module
And User_608 double click the searchgrid row in Approve menu under Advance principal settlement module
When User_608 click the Approve button in Approve menu under Advance principal settlement module


@AT_APS_017
Scenario: Run the profit accrual on 02/06/2012 from periodical process

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_APS_017
And User_608 clear the caches in IIS Application
And User_608 click the Periodical Processing module in IIS Application
And User_608 click the Post Accrual Menu under Periodical Processing
And User_608 click the Final Accruals under Post Accrual in Periodical Processing
And User_608 check the Specific deal flag under Final Accruals in Post Accrual
And User_608 enter the Deal number in Final Accruals under Post Accrual
When User_608 click the OK button in Final Accruals under Post Accrual





