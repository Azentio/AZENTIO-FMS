Feature: Repayment plan


@855250_01
    Scenario: FMS Param UnCheck Flag Committee Approval and Credit Authorization flag
  
	  Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 clicks on the facility details tab in update after approve
    And User_610 clicks on the STP Facility Requirements option
    And User_610 check the Customer Grading flag
    And User_610 check the Overwrite Grading flag
    And User_610 check the Credit Review flag
    And User_610 Uncheck the Committee Approval flag
    And User_610 Uncheck the Credit Authorization flag
    And User_610 check the Issue Facility Offer flag
    And User_610 check the Client Response flag
    And User_610 check the Document Validation flag
    And User_610 check the Final Approval flag
    And User_610 check the Create Active Facility If Within Limits flag
    And User_610 Check the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type
    
    
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
    Then User_610 Click Warning popup No In Repayment Plan
    And User_610 Click Save Button After In Repayment Plan
    Then User_610 Click Ok Button In Waring Screen In Repayment Plan
    And User_610 Click OK  Button In Sucess Screen In Repayment Plan
    
    And User_610 Close the repayment Tab
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    
   
    And User_610 Click Maintenance
    And User_610 search and retrive the first data in Application for financial facilities screen
        
    And User_610 Select limit Details
    Then User_610 Click the Product Class In Limits Details
    And User_610 delete product class value
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    
       
    And User_610 Click Validate Button in Document Details
    And User_610 clicks the Approve Level1 link
    And User_610 retrive the first data in approve level1
    
    And User_610 Validate the Schedule Details displaying or Not
    
    And User_610 select the Approve level1 decision as approve
    And User_610 clicks on the level1 submit button
    And User_610 clicks the Approve Level2 link
    And User_610 retrive the first data in approve level2
    And User_610 select the level2 decision as approve
    And User_610 clicks on the level2 submit button
    And User_610 clicks the Approve Level3 link
    And User_610 retrive the first data in approve level3
    And User_610 select the level3 decision as approve
    When User_610 clicks on the level3 submit button
    
    @127909
    Scenario:Check the new filds are available at the   Approval Committee Recommendations screens

    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_CA_014
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
    
    And User_610 Enter Floating Rate in limit Detail
    And User_610 Enter Floating Rate Periodicity in limit Detail
    And User_610 Enter Floating Rate Periodicity Type in limit Detail
    
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    #   And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User_610 clicks the Approve Level1 link
    And User_610 retrive the first data in approve level1
    And User_610 select the Approve level1 decision as approve
    And User_610 clicks on the level1 submit button
    And User_610 clicks the Approve Level2 link
    And User_610 retrive the first data in approve level2
    And User_610 select the level2 decision as approve
    And User_610 clicks on the level2 submit button
    And User_610 clicks the Approve Level3 link
    And User_610 retrive the first data in approve level3
    And User_610 select the level3 decision as forward to Approvel Committee
    When User_610 clicks on the level3 submit button
    
		And User_610 click Approval Committee Recommendations Menu
		And User_610 enter facility code Approval Committee Recommendations Menu
		And User_610 enter CIF code in  Approval Committee Recommendations Menu