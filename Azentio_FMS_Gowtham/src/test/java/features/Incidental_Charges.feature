Feature: Incidental_Charges

  @Test
  Scenario: IIS Application Creating Deal Combained without trading deal
    Given navigate to IIS application and login with valid credentials
    #And User_608 get the test data for test case
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
    And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal
    #And User_608 get the test data for test case
    Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
    
    @126187
    Scenario: Create a manual settlement on 01/07/2012 and check the allocation of settled amount
    Given navigate to IIS application and login with valid credentials
    #And User_608 get the test data for test case
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
    And User_607 Click Deal Charge button In mainteance Under Investment Deals without Trading Deal
    And User_607 Select First Line In Deal Charge In mainteance Under Investment Deals without Trading Deal
    And User_607 Click Create Inidental Charge Check Box In Deal Charge In mainteance Under Investment Deals without Trading Deal
    And User_607 Select Collect In Deal Charge In mainteance Under Investment Deals without Trading Deal
    And User_607 Click ok button In Deal Charge In mainteance Under Investment Deals without Trading Deal
    
    And User_608 click the Repayment plan button in maintenance under Investment Deals Combined without Trade Deal
    And User_608 click the create schedule button in repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_608 close the repayment tab under maintenance in Investment Deals Combined without Trade Deal
    And User_608 validate button in maintenance under Investment Deals Combined without Trade Deal
    #And User_608 get the test data for test case
    Then User_608 click the Approve menu under Investment Deals Combined without Trade Deal
    And User_608 search the deal number in searchgrid under Approve menu in Investment Deals Combined without Trade Deal
    And User_608 double click the searchgrid row in Approve menu under Investment Deals Combined without Trade Deal
    When User_608 click the Approve button Approve menu in under Investment Deals Combined without Trade Deal
    
    
    
    
    
    
