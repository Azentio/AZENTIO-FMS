Feature: Repayment plan

  @855250
  Scenario: ABSAI180125 - Error while printing repayment plan in FMS.
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_RP_008
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Repayment Plan In Limits Details
    Then User_610 Enter the value in No Of Payments  In Repayment Plan
    And User_610 Click Create Schedule In Repayment Plan
    
    And User_610 Click Yes Create Tentative Schedule Popup In Repayment Plan
    And User_610 Click Print Schedule In Repayment Plan
    Then User_610 Validate the printing repayment plan Working or Not
    
   @288803
  Scenario: ABSAI180125 - NBADAD150027 - Cannot view Repayment Plan schedule once limit line is deleted & re-inserted
  
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_RP_010
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Repayment Plan In Limits Details
    Then User_610 Enter the value in No Of Payments  In Repayment Plan
    And User_610 Click Create Schedule In Repayment Plan
    
    
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 search and retrive the first data in Application for financial facilities screen
    
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    
    And User_610 delete product class value
    
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Repayment Plan In Limits Details
    Then User_610 Enter the value in No Of Payments  In Repayment Plan
    And User_610 Click Create Schedule In Repayment Plan
    And User_610 Click Save Button After In Repayment Plan
    
    And User_610 Click Validate Button in Document Details
    