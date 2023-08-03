Feature: To check the Incidental Charges Feature

# IIS --> tracking&incidental charges --> Retrieve the approved record --> Reverse the Record & Approve
@AT_IC_010
Scenario: Checking the Deal Incidental charges Functionality fro Reversal

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_IC_010
And User_608 clear the caches in IIS Application
And User_608 click the Tracking & Incidental Charges module
And User_608 click the Reverse menu under Tracking & Incidental Charges
And User_608 enter the track number in searchgrid under Reverse menu in Tracking & Incidental Charges
And User_608 double click the searchgrid row in Reverse menu under Tracking & Incidental Charges
When User_608 click the Reverse button in Reverse menu under Tracking & Incidental Charges
And User_608 click the Approve Reverse menu under Tracking & Incidental Charges
And User_608 enter the track number in searchgrid under Approve Reverse menu in Tracking & Incidental Charges
And User_608 double click the searchgrid row in Approve Reverse menu under Tracking & Incidental Charges
When User_608 click the Reverse button in Approve Reverse menu under Tracking & Incidental Charges


# IIS --> Create a "investment deal without trade deal" ,
# Tracking&incidental charges --> Main --> retrieve the record --> Save & Approve
# Repayment plan --> Main --> retrieve the record --> schedule details tab --> incidental charges column validate the hyper link
@AT_IC_022
Scenario: Check On moving the cursor on incidental charge field, system showing the hyper link

Given navigate to IIS application and login with valid credentials
And User_608 get the test data for test case AT_IC_022
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
And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal for Incidental Charges
And User_608 get the test data for test case AT_IC_022
Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_608 click the Tracking & Incidental Charges module
And User_608 click the Maintenance menu under Tracking & Incidental Charges
And User_608 enter the Deal number in Maintenance under Tracking & Incidental Charges
And User_608 enter the Charges code in Maintenance under Tracking & Incidental Charges
And User_608 select the Charge allocation criteria in Maintenance under Tracking & Incidental Charges
And User_608 select the Dr Account in Maintenance under Tracking & Incidental Charges
When User_608 click the Save button in Maintenance under Tracking & Incidental Charges
And User_608 click the Approve menu under Tracking & Incidental Charges
And User_608 search Deal number in Approve menu under Tracking & Incidental Charges
And User_608 double click the searchgrid row in Approve menu under Tracking & Incidental Charges
When User_608 click the Approve button in Approve menu under Tracking & Incidental Charges
And User_608 click the Repayment plan module in IIS Application
And User_608 click the maintenance menu under Repayment plan
And User_608 click the search button in maintenance under Repayment plan
And User_608 search the Deal number in searchgrid under maintenance in Repayment plan
And User_608 double click the searchgrid row under maintenance in Repayment plan
And User_608 click the Schedule details tab in maintenance under Repayment plan
Then User_608 validate the incidental charges field showing hyperlink in maintenance under Repayment plan 
