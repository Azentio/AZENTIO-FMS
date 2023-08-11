Feature: Accrual Process

@130877
  Scenario: Profit accrual
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_AP_009
    And User_607 clear the caches in IIS Application
    And User_607 click the Investment Deals Combined without Trade Deal menu
    And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the Party in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the category in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the product class in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the amount in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
    And User_607 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the save button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 validate button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 Update the value in excel
    And User_607 get the test data for test ID AT_AP_009
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
    
    And User_607 click the periodical processing menu in Menu option under iis application menu
    And User_607 click the post accruals menu in periodical processing menu under iis application menu
    And User_607 click the final accrual menu in post accrual menu under iis application menu
    And User_607 click the specific deal flag checkbox in final accrual under iis application menu
    And User_607 enter the deal number in final accrual under iis application menu
    And User_607 enter the from date in final accrual under iis application menu
    And User_607 enter the to date in final accrual under iis application menu
    And User_607 click the ok button in final accrual under iis application menu
    
    And User_607 click the Calculators module in IIS Application
		And User_607 click the Reschedule Calculator With Profit menu under Calculators
		And User_607 enter the Deal number in Reschedule Calculator With Profit menu
		And User_607 click the Repayment Details panel in Reschedule Calculator With Profit menu
		And User_607 enter the First Payment After under Repayment Details panel in Reschedule Calculator With Profit menu
		When User_607 click the Calculate button in Reschedule Calculator With Profit menu
		When User_607 click the Update button in Reschedule Calculator With Profit menu
		And User_607 click the Reschedule Repayment plan module in IIS Application
		And User_607 click the Approve menu under Reschedule Repayment plan
		And User_607 search the Deal number in approve menu under Reschedule Repayment plan
		And User_607 double click the searchgird row in approve menu under Reschedule Repayment plan
		When User_607 click the Approve button in approve menu under Reschedule Repayment plan
    
		@131004
		Scenario: Run EOD for profit accrual Upto 30/06/2008
		Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_AP_010
    And User_607 clear the caches in IIS Application
    And User_607 click the Investment Deals Combined without Trade Deal menu
    And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the Party in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the category in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the product class in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the amount in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
    And User_607 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the save button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 validate button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 Update the value in excel
    And User_607 get the test data for test ID AT_AP_010
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
		 
		And User_607 click the periodical processing menu in Menu option under iis application menu
    And User_607 click the post accruals menu in periodical processing menu under iis application menu
    And User_607 click the final accrual menu in post accrual menu under iis application menu
    And User_607 click the specific deal flag checkbox in final accrual under iis application menu
    And User_607 enter the deal number in final accrual under iis application menu
    And User_607 enter the from date in final accrual under iis application menu
    And User_607 enter the to date in final accrual under iis application menu
    And User_607 click the ok button in final accrual under iis application menu
		 
		And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 Click ok Confirm popup
    And User_607 Click Search In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Search Record In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Select Record In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Click Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Click Journal Voucher Details In Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Check Incidental Charges In Journal Voucher Details In Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal
    
    
    @760736
    Scenario: Check the account entries upon running the profit accrual process for regular deals.
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_AP_056
    And User_607 clear the caches in IIS Application
    And User_607 click the Investment Deals Combined without Trade Deal menu
    And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the Party in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the category in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the product class in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the amount in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
    And User_607 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the save button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 validate button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 Update the value in excel
    And User_607 get the test data for test ID AT_AP_056
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
		 
		And User_607 click the periodical processing menu in Menu option under iis application menu
    And User_607 click the post accruals menu in periodical processing menu under iis application menu
    And User_607 click the final accrual menu in post accrual menu under iis application menu
    And User_607 click the specific deal flag checkbox in final accrual under iis application menu
    And User_607 enter the deal number in final accrual under iis application menu
    And User_607 enter the from date in final accrual under iis application menu
    And User_607 enter the to date in final accrual under iis application menu
    And User_607 click the ok button in final accrual under iis application menu
    
    And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 Click ok Confirm popup
    And User_607 Click Search In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Search Record In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Select Record In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Click Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Click Journal Voucher Details In Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Check Incidental Charges In Journal Voucher Details In Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal
    
    
    @760740
    Scenario: Check the account entries upon running the profit accrual process for irregular deals.
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_AP_057
    And User_607 clear the caches in IIS Application
    And User_607 click the Investment Deals Combined without Trade Deal menu
    And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the Party in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the category in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the product class in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the amount in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
    And User_607 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the save button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 validate button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 Update the value in excel
    And User_607 get the test data for test ID AT_AP_057
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
		 
		And User_607 click the periodical processing menu in Menu option under iis application menu
    And User_607 click the post accruals menu in periodical processing menu under iis application menu
    And User_607 click the final accrual menu in post accrual menu under iis application menu
    And User_607 click the specific deal flag checkbox in final accrual under iis application menu
    And User_607 enter the deal number in final accrual under iis application menu
    And User_607 enter the from date in final accrual under iis application menu
    And User_607 enter the to date in final accrual under iis application menu
    And User_607 click the ok button in final accrual under iis application menu
    
    @636954
    Scenario: NIZ180013 - issue in proffit accrual after upgrading new version
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_AP_054
    And User_607 clear the caches in IIS Application
    And User_607 click the Investment Deals Combined without Trade Deal menu
    And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the Party in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the category in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the product class in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the amount in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
    And User_607 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the save button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 validate button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 Update the value in excel
    And User_607 get the test data for test ID AT_AP_054
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
		 
		And User_607 click the periodical processing menu in Menu option under iis application menu
    And User_607 click the post accruals menu in periodical processing menu under iis application menu
    And User_607 click the final accrual menu in post accrual menu under iis application menu
    And User_607 click the specific deal flag checkbox in final accrual under iis application menu
    And User_607 enter the deal number in final accrual under iis application menu
    And User_607 enter the from date in final accrual under iis application menu
    And User_607 enter the to date in final accrual under iis application menu
    And User_607 click the ok button in final accrual under iis application menu
    
    
    @1376676
    Scenario: Run the accrual / Profit transfer process and confirm system does not reverse the accrual entries and profit adjust to incomes a/c
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_AP_078
    And User_607 clear the caches in IIS Application
    And User_607 click the Investment Deals Combined without Trade Deal menu
    And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the Party in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the category in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the product class in maintenance under Investment Deals Combined without Trade Deal
    And User_607 enter the amount in maintenance under Investment Deals Combined without Trade Deal
    And User_607 Tenure days In mainteance Under investment deal without trade deal menu
    And User_607 Click ok Confirm popup
    And User_607 Tenure month In mainteance Under investment deal without trade deal menu
    And User_607 click the Contributor details tab in maintenance under Investment Deals Combined without Trade Deal
    And User_607 double click the Contributor details row in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Nostro details lookup in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 double click the Nostro account in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 select the maturity account in Contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the Ok button in contributor tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 click the save button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 Number Of Payments In Repayment Plan in mainteance Under investment deal without trade deal menu
    And User_607 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 validate button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 Update the value in excel
    And User_607 get the test data for test ID AT_AP_078
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
    
    And User_607 click the periodical processing menu in Menu option under iis application menu
    And User_607 click the post accruals menu in periodical processing menu under iis application menu
    And User_607 click the final accrual menu in post accrual menu under iis application menu
    And User_607 click the specific deal flag checkbox in final accrual under iis application menu
    And User_607 enter the deal number in final accrual under iis application menu
    And User_607 enter the from date in final accrual under iis application menu
    And User_607 enter the to date in final accrual under iis application menu
    And User_607 click the ok button in final accrual under iis application menu
    
    And User_607 Click Settlement Under Menu
    And User_607 Click Mainteance Under Settlement
    And User_607 DealNbr In Settlement Details Tab In Mainteance Under Settlement
    And User_607 Click Schedule Details Tab In Mainteance Under Settlement
    And User_607 Get Principal Charge Insurance Amt In Schedule Details In Mainteance Under Settlement
    And User_607 Click settlement Details tab In Mainteance Under Settlement
    And User_607 Enter Amount Received From Party In Settlement Details Tab In Mainteance Under Settlement
    And User_607 Click Schedule Details Tab In Mainteance Under Settlement
    And User_607 Enter Settlement In Schedule Details tab In Mainteance Under Settlement
    And User_607 Click Save button In Mainteance Under Settlement
    And User_607 Click ok on save successfully
    And User_607 Click approve Under Settlement
    And User_607 Search Deal In Approve Under Settlement
    And User_607 Select Record In Approve Under Settlement
    And User_607 Click Approve button In Approve Under Settlement
    And User_607 Click ok Confirm popup
    And User_607 Click ok Confirm popup
    And User_607 Click ok on save successfully
    And User_607 Click Cancel on report generated
    
    And User_607 click the periodical processing menu in Menu option under iis application menu
    And User_607 click the post accruals menu in periodical processing menu under iis application menu
    And User_607 click the final accrual menu in post accrual menu under iis application menu
    And User_607 click the specific deal flag checkbox in final accrual under iis application menu
    And User_607 enter the deal number in final accrual under iis application menu
    And User_607 enter the from date in final accrual under iis application menu
    And User_607 enter the to date in final accrual under iis application menu
    And User_607 click the ok button in final accrual under iis application menu
    
    
    
    
    
    
    
		 