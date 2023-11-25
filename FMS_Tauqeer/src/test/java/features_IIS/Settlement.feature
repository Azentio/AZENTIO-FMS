Feature: Testing the functionality of Settlement feature
#EWBI200022
@AT_SETLMNT_185
 Scenario: Create a deal and with the penalty linked PC and verify the penalty calculated as
            Penalty for the late payments = Past due Amount on the Settlement Date * 
            number of Past due Days on the Settlement Date * (financing profit rate + x%)
Given navigate to IIS application and login with valid credentials
And User_482 get the test data for test case AT_SETLMNT_185
And User_482 clear the caches in IIS Application
And User_482 click the Investment Deals Combined without Trade Deal menu
And User_482 click the Maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_482 Click Confirmation Ok For Black listed CIF Validation
And User_482 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_482 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_482 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Information ok deal saved 
And User_482 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_482 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 validate button in maintenance under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Information ok deal saved 
And User_482 Store Deal Created 
Then User_482 click the Approve menu under Investment Deals Combined without Trade Deal
And User_482 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_482 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_482 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes	
And User_482 click Information ok deal saved
And User_482 Click Cancel in Pop up message
And User_482 Click Settlement Screen 
And User_482 Click Maintenance Screen in Settlement Screen
And User_482 Search Settlement nbr

#EWBI200022
@AT_SETLMNT_186
 Scenario: Check and verify the new flag" Allow to settle penalty" added in settlement screen
Given navigate to IIS application and login with valid credentials
And User_482 get the test data for test case AT_SETLMNT_186
And User_482 clear the caches in IIS Application
And User_482 click the Investment Deals Combined without Trade Deal menu
And User_482 click the Maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_482 Click Confirmation Ok For Black listed CIF Validation
And User_482 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_482 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_482 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Information ok deal saved 
And User_482 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_482 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 validate button in maintenance under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Information ok deal saved 
And User_482 Store Deal Created for Settlement
Then User_482 click the Approve menu under Investment Deals Combined without Trade Deal
And User_482 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_482 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_482 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes	
And User_482 click Confirmation yes
And User_482 click Information ok deal saved
And User_482 Click Cancel in Pop up message
And User_482 Click Settlement Screen 
And User_482 Click Maintenance Screen in Settlement Screen
And User_482 Search Settlement nbr
And User_482 Click Allow to settle penalty checkbox
And User_482 Verify Amount received from party is disabled
And User_482 Verify Settlement charge Details Tab disabled
 