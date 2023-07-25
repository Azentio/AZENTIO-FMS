Feature: Request For Financing

  @1108920
  Scenario: BAJI200117 - VAT on advance insurance is wrongly calculated - BAJI200034
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_RF_010
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
    #  And Click ok on the warrning Screen
    And User_610 Click Fixed Assert button
    And User_610 Click AddButton On FixedAssert screen
    And User_610 Enter value on Catagory
    And User_610 Enter value on Class
    And User_610 Enter value on vendor
    And User_610 Enter value on quantity
    And User_610 Enter value on Unit
    And User_610 Enter value on Cy
    And User_610 Enter value on UnitCost
    And User_610 Enter value on Vat Code
    And User_610 Validate Vat Amount Dispalying or Not

#-------------------------------------

#S3 params -------------- all chech Credit Authorization flag
    
    @1159358_01
    Scenario: FMS Param UnCheck All flag
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
    And User_610 check the Committee Approval flag
    And User_610 check the Credit Authorization flag
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
    
    
  @1159358
  Scenario: BAJI200084 - Some issues appears after the delivery of the modification BAJI200012
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_RF_011
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
    And User_610 Click Search Button In Account No
    And User_610 Enter Double Click Search Account No
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    And User_610 User Click Charges Details
    And User_610 User Check Flag In Collect At Fac Approvel
    And User_610 User Click Ok Button In Collect At Fac Approvel
    And User_610 Click Save Button After Collect At Fac Approvel Give Ok
    And User_610 Click Ok Button In Waring Screen
    And User_610 Click OK In Button Sucess Screen
    #  And Click Validate Button
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    
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
    And User_610 select the level3 decision as approve
    When User_610 clicks on the level3 submit button
    
    #facility management
    And User_610 click facility management
    And User_610 click maintenance screen in facility Management
    And User_610 click search button in facility Management
    And User_610 retrive the first data in facility Management
    And User_610 click Journal Voucher Details in facility Management
    And User_610 Validate the Account Number should displaying correct in JV Details  
    
    
    @665893
  Scenario: TSR - RIDB180130 Maturity Date of any sublimit
    Given navigate to FMS application2 and login with valid credentials
    And User_610 get the test data set id for AT_RF_012
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Facilities Management
    And User_610 Click Maintence Screen
    And User_610 Click and Enter Application Ref No
    And User_610 Click facility Limit Details in Facilities Management
    And User_610 Click ProductClass In facility Limit Details
    Then User_610 Enter Previous data In MaturityDate
    
    @592970
  Scenario: TSR - AMANAUPG170182 - Holiday issue
    Given navigate to FMS application2 and login with valid credentials
    And User_610 get the test data set id for AT_RF_074
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
    Then User_610 Enter Holiday Date In Expiratin date in additional Details
    And User_610 Confirm the Requested Holiday date
    And User_610 Validate holiday day allow or not 
    
        And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Enter Holiday date in Expected Payment Date in Limit Details SubMenu
    And User_610 Confirm the Requested Holiday date in Limit Details SubMenu
    And User_610 Validate Expected Payment Date is holiday day allow or not in product class 
    
    
     @579604
  Scenario: TSR - KCB170047
    Given navigate to FMS application2 and login with valid credentials
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    Then User_610 Click Application For Decrease
    And User_610 Enter Existing Facility Ref
    And User_610 Click on additional Details In Additional Details
    And User_610 Enter the Total Value In Additional Details
    Then User_610 Enter Down Payment In Percentage
    
    @574947
  Scenario: TSR-EWB170043
    Given navigate to FMS application2 and login with valid credentials
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
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
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
    And User_610 select the level3 decision as approve
    When User_610 clicks on the level3 submit button
    
     @740809
  Scenario: TSR-AIBBI180258
    Given navigate to FMS application2 and login with valid credentials
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
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
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
    And User_610 select the level3 decision as approve
    When User_610 clicks on the level3 submit button

  # Then Click Update After Approve in Application For Finacial Facilities
  # facilityManagement
