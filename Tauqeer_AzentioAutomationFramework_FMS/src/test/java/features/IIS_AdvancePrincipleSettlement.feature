Feature: To check the Advance Principle Settlement

@AT_APS_012
Scenario: Reverse the advance principal settlment
Given navigate to IIS FMS application and login with valid credentials
And user get the test data for test case AT_APS_012
And user click on advance principle settlement menu
And user click on maintainence under advance principle settlement menu
And user enter the Deal number in maintainence under advance principle settlement menu
And user click on the save button in maintainence under advance principle settlement menu
And user click on approve under advance principle settlement menu
And user search the settlement number on approve screen under advance principle settlement menu
And user open the settlement record on approve screen under advance principle settlement menu
And user click on the approve button on approve screen under advance principle settlement menu
And user click on reverse under advance principle settlement menu
And user search the settlement number on reverse screen under advance principle settlement menu
And user open the settlement record on reverse screen under advance principle settlement menu
And user click on the reverse button on reverse screen under advance principle settlement menu

@AT_APS_013
Scenario: investment deals combined without trade deal
Given navigate to IIS FMS application and login with valid credentials
And user get the test data for test case AT_APS_013
Then user click the investment deals combined without trade deal tab
Then user click the maintenance under investment deals combined without trade deal tab
Then user enter the party in maintenance under investment deals combined without trade deal tab
Then user enter the category in maintenance under investment deals combined without trade deal tab
Then user enter the product class in maintenance under investment deals combined without trade deal tab
Then user enter the amount in maintenance under investment deals combined without trade deal tab
Then user enter the tenure in maintenance under investment deals combined without trade deal tab
Then user select the tenure dropdown as years in maintenance under investment deals combined without trade deal tab
Then user click the contributor details tab in maintenance under investment deals combined without trade deal tab
Then user double click the contributor details row in maintenance under investment deals combined without trade deal tab
Then user click the nostro details in contributor tab in maintenance under investment deals combined without trade deal tab
Then user double click the nostro account in contributor tab in maintenance under investment deals combined without trade deal tab
Then user select the maturity account in contributor tab in maintenance under investment deals combined without trade deal tab
Then user click the ok button in contributor tab in maintenance under investment deals combined without trade deal tab
Then user click the save button in maintenance under investment deals combined without trade deal tab
Then user click the repayment plan button in maintenance under investment deals combined without trade deal tab
Then user select the profit calculation as diminising returns in repayment tab in maintenance under investment deals combined without trade deal tab
Then user select the profit recognition as diminising returns in repayment tab in maintenance under investment deals combined without trade deal tab
Then user enter the grace period in repayment tab in maintenance under investment deals combined without trade deal tab
Then user select the grace period dropdown as Years in repayment tab in maintenance under investment deals combined without trade deal tab
Then user uncheck the compounding grace periodcheck box in repayment tab in maintenance under investment deals combined without trade deal tab
Then user click the create schedule button in repayment tab in maintenance under investment deals combined without trade deal tab
Then user close the repayment tab in repayment tab in maintenance under investment deals combined without trade deal tab
Then user click validate button in maintenance under investment deals combined without trade deal tab for accrual process
And update the deal number in test data sheet for incidental charges
And user get the test data for test case AT_APS_013
Then user click the approve menu under investment deals combined without trade deal
Then user search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
Then user double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
Then user click the Approve button Approve menu in under Investment Deals Combined without Trade Deal



@AT_APS_014
Scenario: Run the accrual and settlement process on the installment dates from EOD and settle the installment 
Given navigate to IIS FMS application and login with valid credentials
And user get the test data for test case AT_APS_014
Then user click the investment deals combined without trade deal tab
Then user click the maintenance under investment deals combined without trade deal tab
Then user enter the party in maintenance under investment deals combined without trade deal tab
Then user enter the category in maintenance under investment deals combined without trade deal tab
Then user enter the product class in maintenance under investment deals combined without trade deal tab
Then user enter the amount in maintenance under investment deals combined without trade deal tab
Then user enter the tenure in maintenance under investment deals combined without trade deal tab
Then user select the tenure dropdown as years in maintenance under investment deals combined without trade deal tab
Then user click the contributor details tab in maintenance under investment deals combined without trade deal tab
Then user double click the contributor details row in maintenance under investment deals combined without trade deal tab
Then user click the nostro details in contributor tab in maintenance under investment deals combined without trade deal tab
Then user double click the nostro account in contributor tab in maintenance under investment deals combined without trade deal tab
Then user select the maturity account in contributor tab in maintenance under investment deals combined without trade deal tab
Then user click the ok button in contributor tab in maintenance under investment deals combined without trade deal tab
Then user click the save button in maintenance under investment deals combined without trade deal tab
Then user click the repayment plan button in maintenance under investment deals combined without trade deal tab
Then user select the profit calculation as diminising returns in repayment tab in maintenance under investment deals combined without trade deal tab
Then user select the profit recognition as diminising returns in repayment tab in maintenance under investment deals combined without trade deal tab
Then user enter the grace period in repayment tab in maintenance under investment deals combined without trade deal tab
Then user select the grace period dropdown as Years in repayment tab in maintenance under investment deals combined without trade deal tab
Then user uncheck the compounding grace periodcheck box in repayment tab in maintenance under investment deals combined without trade deal tab
Then user click the create schedule button in repayment tab in maintenance under investment deals combined without trade deal tab
Then user close the repayment tab in repayment tab in maintenance under investment deals combined without trade deal tab
Then user click validate button in maintenance under investment deals combined without trade deal tab for accrual process
#And update the deal number in test data sheet for incidental charges
And user get the test data for test case AT_APS_014
Then user click the approve menu under investment deals combined without trade deal
Then user search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
Then user double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
Then user click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
And user click the Periodical Processing module in IIS Application
And user click the Post Accrual Menu under Periodical Processing
And user click the Final Accruals under Post Accrual in Periodical Processing
And user check the Specific deal flag under Final Accruals in Post Accrual
And user enter the Deal number in Final Accruals under Post Accrual
When user click the OK button in Final Accruals under Post Accrual



