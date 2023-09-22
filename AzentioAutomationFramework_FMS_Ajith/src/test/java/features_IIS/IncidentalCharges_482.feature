Feature: To check the Incidental Charges Feature

@AT_IC_010
Scenario: Checking the Deal Incidental charges Functionality for Reversal
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


## Create a investment deal without trade deal
# product class 100 link deal charge - Charge code 3
# tracking and incidental charges select immidiate payment
@AT_IC_019_01
Scenario: IIS Application
Given navigate to IIS application and login with valid credentials
And User_482 get the test data for test case AT_IC_019
And User_482 clear the caches in IIS Application
And User_482 click the Investment Deals Combined without Trade Deal menu
And User_482 click the Maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the Party in maintenance under Investment Deals Combined without Trade Deal
And User_482 Click Confirmation Ok For Black listed CIF Validation
And User_482 enter the category in maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the product class in maintenance under Investment Deals Combined without Trade Deal
And User_482 enter the amount in maintenance under Investment Deals Combined without Trade Deal
And User_482 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
And User_482 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
And User_482 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 click the save button in maintenance under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Information ok deal saved 
And User_482 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
And User_482 uncheck Grace period compunding Checkbox in Investment Deals Combined without Trade Deal
And User_482 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
And User_482 validate button in maintenance under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Information ok deal saved 
And User_482 Store Deal Created 
And User_482 get the test data for test case AT_IC_019
Then User_482 click the Approve menu under Investment Deals Combined without Trade Deal
And User_482 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
And User_482 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
When User_482 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And User_482 click Confirmation yes
And User_482 click Confirmation yes
And User_482 click Confirmation yes	
And User_482 click Information ok deal saved
And User_482 Click Cancel in Pop up message
@AT_IC_019
Scenario: Do an immediate payment in traacking and incidential charges screen
Given navigate to IIS application and login with valid credentials
And User_482 get the test data for test case AT_IC_019
And User_482 click the Tracking & Incidental Charges module
And User_482 Click Maintenance Screen Under Tracking and Incidental Charges Sub Menu
And User_482 User Search Deal Number in Tracking and Incidental Charges Maintenance Screen
And User_482 Search Code In Charge Code under Tracking and Incidental Charges Maintenance Screen
And User_482 Click Save Button in Tracking and Incidental Charges
And User_482 click Confirmation ok in Pop Up
And User_482 Click Confirmation Yes In Amount exceeds Amount available Warning
And User_482 Click Information ok in Transaction saved successfully 
And User_482 Click Approve Screen In Tracking and Incidental Charges
And User_482 Search deal Serial No In Tracking and Incidental Charges
And User_482 Select the searched Deal no In Tracking and Incidental Charges
And User_482 Click Approve button in Tracking and Incidental Charges
And User_482 click Confirmation ok in Pop Up
And User_482 Click Confirmation Yes In Amount exceeds Amount available Warning
And User_482 Click Information ok in Transaction saved successfully
And User_482 Click Settlement Screen 
And User_482 Click Maintenance Screen in Settlement Screen
And User_482 Click Schedule details 
And User_482 Get the first Installment amount 
And User_482 Click Settlement Details In Settlement Screen
And User_482 Enter Amount Received From Party
#And User_482 Click Schedule details
#And User_482 Enter the first Installment in Schedule details to settlemet
And User_482 Click Automatic Allocation Button
And User_482 Click Save button in settlement Screen
And User_482 Click Ok Button for success pop up
And User_482 Click Approve Screen In Settlement Screen
And User_482 Search Deal Number In Approve Settlement Screen
And User_482 Select Searched Deal Number no In Approve Settlement Screen
And User_482 Click approve button in Settlement Approve Screen
And User_482 click Confirmation Yes in Pop Up
And User_482 click Confirmation Yes in Pop Up
And User_482 Click Confirmation Yes In Amount exceeds Amount available Warning
And User_482 Click Cancel in Pop up message
And User_482 Click Ok Button for success pop up
And User_482 click the Investment Deals Combined without Trade Deal menu
And User_482 click the Maintenance under Investment Deals Combined without Trade Deal
And User_482 Click search icon In Maintenance under Investment Deals Combined without Trade Deal
And User_482 Search settlemet number In Maintenance under Investment Deals Combined without Trade Deal
And User_482 Select settlemet number no In Maintenance under Investment Deals Combined without Trade Deal
And User_482 Click Payment Instructions In Selected Deal
And User_482 Click Journal Voucher Details In Payment Instructions 
# document.querySelector('#on_bs_total_debit_T022MT').value
And User_482 Verify the Immediate payment for Incidental Charges

















