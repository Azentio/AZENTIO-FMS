Feature: Testing the functionalities of Penalty feature
@AT_PNLT_017
Scenario: Check and Verify the availability/behavior of Apply Yield on top of Penalty Rate flag at the level of penalty parameter EWBI200022
 Given navigate to IIS Param Application and login with valid credentials
 And user_482 click parameters menu
 And user_482 click penalty sub menu
 And user_482 click maintenance under penalty
 And user_482 test data set id for AT_PNLT_017
 And user_482 select Penalty type
 And user_482 Verify Apply yield rate in addition to penalty rate check box is displayed
 @AT_PNLT_018
 Scenario: Check and verify the availability , default value and behavior of new field ‘Grace Period days for Penalty due EWBI200022
 Given navigate to IIS Param Application and login with valid credentials
 And user_482 click parameters menu
 And user_482 click penalty sub menu
 And user_482 click maintenance under penalty
 And user_482 test data set id for AT_PNLT_017
 And user_482 select Penalty type
 And user_482 click Apply yield rate in addition to penalty rate check box
 And user_482 Verify Grace Period days for Penalty due text box is displayed
 #product class 1155 no need to select contributor details
 #Upfront deal no need to run accural , Accure additional profit based on deal rate should be none,the flag is overdue principle
 #then need to run additional profit accural process
 @AT_PNLT_019
 Scenario: Check and  Verify the penalty details defaulted in deal screen for upfront product as Total Penalty% = Yield + Penalty rate EWBI200022
Given navigate to IIS application and login with valid credentials
And User_482 get the test data for test case AT_PNLT_019
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
And User_482 Click Schedule details 
And User_482 Get the first Installment amount 
And User_482 Click Settlement Details In Settlement Screen
And User_482 Enter Amount Received From Party
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
And User_482 Click Settlement Screen 
And User_482 Click Maintenance Screen in Settlement Screen
#And User_482 Search Deal Number In settlement maintenance Screen
#And User_482 Select Searched Deal Number no In Settlement maintenance Screen
#And User_482 click Penalty details tab
#And User_482 Validate previous outstanding amount
#And User_482 click details screen in Penalty details tab
#And User_482 Validate Total Incremental penalty details

@AT_PNLT_020
 Scenario: Check and Verify the penalty details defaulted in deal screen for Accural product as Total Penalty% = Yield + Margin + Penalty rate EWBI200022
Given navigate to IIS application and login with valid credentials
And User_482 get the test data for test case AT_PNLT_020
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
 And User_482 Click Settlement Screen 
And User_482 Click Maintenance Screen in Settlement Screen
And User_482 Click Schedule details 
And User_482 Get the first Installment amount 
And User_482 Click Settlement Details In Settlement Screen
And User_482 Enter Amount Received From Party
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
And User_482 Click Settlement Screen 
And User_482 Click Maintenance Screen in Settlement Screen
And User_482 Search Deal Number In settlement maintenance Screen
And User_482 Select Searched Deal Number no In Settlement maintenance Screen
And User_482 click Penalty details tab
And User_482 Validate previous outstanding amount
And User_482 click details screen in Penalty details tab
And User_482 Validate Total Incremental penalty details

 