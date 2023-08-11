Feature: Incidental_Charges

  @Test
  Scenario: IIS Application Creating Deal Combained without trading deal
    Given navigate to IIS application and login with valid credentials
    #And User_607 get the test data for test case
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
    #And User_607 get the test data for test case
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal

  @126187
  Scenario: Create a manual settlement on 01/07/2012 and check the allocation of settled amount
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_IC_005
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
    #Link Deal Charge
    #And User_607 Click Deal Charge button In mainteance Under Investment Deals without Trading Deal
    #And User_607 Select First Line In Deal Charge In mainteance Under Investment Deals without Trading Deal
    #And User_607 Click Create Inidental Charge Check Box In Deal Charge In mainteance Under Investment Deals without Trading Deal
    #And User_607 Select Collect In Deal Charge In mainteance Under Investment Deals without Trading Deal
    #And User_607 Click ok button In Deal Charge In mainteance Under Investment Deals without Trading Deal
    And User_607 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_607 validate button in maintenance under Investment Deals Combined without Trade Deal
    And User_607 get the test data for test ID AT_IC_006
    And User_607 Update the value in excel
    And User_607 get the test data for test ID AT_IC_007
    And User_607 Update the value in excel
    And User_607 get the test data for test ID AT_IC_005
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
    #get incidental charge ammount in repayment plan
    And User_607 Click Repayment Plan Under Menu
    And User_607 Click Mainteance Under Repayment Plan
    And User_607 Click Search In Mainteance Under Repayment Plan
    And User_607 Search Deal Record In Mainteance Under Repayment Plan
    And User_607 Select Record In Mainteance Under Repayment Plan
    And User_607 Click Schedule Details In Mainteance Under Repayment Plan
    And User_607 Get Incidental Charge In Mainteance Under Repayment Plan
    #Settlement for deal
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

  @126188
  Scenario: Create a manual settlement on 02/07/2012 and check the allocation of settled amount
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_IC_006
    And User_607 Click Settlement Under Menu
    And User_607 Click Mainteance Under Settlement
    And User_607 DealNbr In Settlement Details Tab In Mainteance Under Settlement
    And User_607 Click Schedule Details Tab In Mainteance Under Settlement
    And User_607 Get Principal Charge Insurance Amt In Schedule Details In Mainteance Under Settlement
    And User_607 Click settlement Details tab In Mainteance Under Settlement
    And User_607 Enter Amount Received From Party In Settlement Details Tab In Mainteance Under Settlement
    And User_607 Click Schedule Details Tab In Mainteance Under Settlement
    And User_607 Enter Second Settlement In Schedule Details tab In Mainteance Under Settlement
    And User_607 Click Save button In Mainteance Under Settlement
    And User_607 Click ok on save successfully
    And User_607 Click approve Under Settlement
    And User_607 Search Deal In Approve Under Settlement
    And User_607 Select Record In Approve Under Settlement
    And User_607 Click Approve button In Approve Under Settlement
    And User_607 Click ok Confirm popup
    And User_607 Click ok Confirm popup
    And User_607 Click ok on save successfully

  @126189
  Scenario: Create a manual settlement on 01/08/2012 and check the allocation of settled amount
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_IC_007
    And User_607 Click Settlement Under Menu
    And User_607 Click Mainteance Under Settlement
    And User_607 DealNbr In Settlement Details Tab In Mainteance Under Settlement
    And User_607 Click Schedule Details Tab In Mainteance Under Settlement
    And User_607 Get Principal Charge Insurance Amt In Schedule Details In Mainteance Under Settlement
    And User_607 Click settlement Details tab In Mainteance Under Settlement
    And User_607 Enter Amount Received From Party In Settlement Details Tab In Mainteance Under Settlement
    And User_607 Click Schedule Details Tab In Mainteance Under Settlement
    And User_607 Enter third Settlement In Schedule Details tab In Mainteance Under Settlement
    And User_607 Click Save button In Mainteance Under Settlement
    And User_607 Click ok on save successfully
    And User_607 Click approve Under Settlement
    And User_607 Search Deal In Approve Under Settlement
    And User_607 Select Record In Approve Under Settlement
    And User_607 Click Approve button In Approve Under Settlement
    And User_607 Click ok Confirm popup
    And User_607 Click ok Confirm popup
    And User_607 Click ok on save successfully

  @130739
  Scenario: Checking the Deal Incidental charges Functionality
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_IC_008
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
    And User_607 get the test data for test ID AT_IC_008
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
    #Link Tracking Incidental Charges to deal
    And User_607 Click Tracking Incidental Charges under menu
    And User_607 Click Mainteance Under Tracking Incidental Charges under menu
    And User_607 Enter DealNbr In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Enter Charge Code In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Select Charge Allocation Criteria In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Click Search button In Accounts In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Select GL Code In Accounts In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Click Save button In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Click ok Confirm popup
    And User_607 Click ok on save successfully
    And User_607 Click Approve Under Tracking Incidental Charges under menu
    And User_607 Search Deal no In Approve Under Tracking Incidental Charges under menu
    And User_607 Select Record in Approve Under Tracking Incidental Charges under menu
    And User_607 Click Approve button In Approve Under Tracking Incidental Charges under menu
    And User_607 Click ok Confirm popup
    And User_607 Click ok on save successfully
    #get incidental charge ammount in repayment plan
    And User_607 Click Repayment Plan Under Menu
    And User_607 Click Mainteance Under Repayment Plan
    And User_607 Click Search In Mainteance Under Repayment Plan
    And User_607 Search Deal Record In Mainteance Under Repayment Plan
    And User_607 Select Record In Mainteance Under Repayment Plan
    And User_607 Click Schedule Details In Mainteance Under Repayment Plan
    And User_607 Check Incidental Charge In Mainteance Under Repayment Plan

  @130740
  Scenario: Checking the Deal Incidental charges Functionality
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_IC_008
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
    And User_607 get the test data for test ID AT_IC_008
    Then User_607 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_607 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_607 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_607 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
    #Link Tracking Incidental Charges to deal
    And User_607 Click Tracking Incidental Charges under menu
    And User_607 Click Mainteance Under Tracking Incidental Charges under menu
    And User_607 Enter DealNbr In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Enter Charge Code In Mainteance Under Tracking Incidental Charges under menu
    #And User_607 Select Charge Allocation Criteria In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Click Search button In Accounts In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Select GL Code In Accounts In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Click Save button In Mainteance Under Tracking Incidental Charges under menu
    And User_607 Click ok Confirm popup
    And User_607 Click ok on save successfully
    And User_607 Click Approve Under Tracking Incidental Charges under menu
    And User_607 Search Deal no In Approve Under Tracking Incidental Charges under menu
    And User_607 Select Record in Approve Under Tracking Incidental Charges under menu
    And User_607 Click Approve button In Approve Under Tracking Incidental Charges under menu
    And User_607 Click ok Confirm popup
    And User_607 Click ok on save successfully
    
    And User_607 click the Maintenance under Investment Deals Combined without Trade Deal
    And User_607 Click ok Confirm popup
    And User_607 Click Search In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Search Record In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Select Record In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Click Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Click Journal Voucher Details In Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal
    And User_607 Check Incidental Charges In Journal Voucher Details In Payment Instruction In mainteance under Investment Deals Combined Without Trad Deal

  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
    
    
    
    
    
    