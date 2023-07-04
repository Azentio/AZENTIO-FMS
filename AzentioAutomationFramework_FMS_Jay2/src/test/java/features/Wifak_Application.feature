Feature: Wifak Application

    
  @285052
  Scenario: System giving error on updating an application
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
    #  And Click ok on the warrning Screen
    And Click Fixed Assert button
    And Click AddButton On FixedAssert screen
    And Enter value on Catagory
    And Enter value on Class
    And Enter value on vendor
    And Enter value on quantity
    And Enter value on Unit
    And Enter value on Cy
    And Enter value on UnitCost

  #  And Click OkButton On Fixed AssertKey Screen
  #  And Click Save button on limit details tab
  #  And Click Ok saveOn Draft WarrningScreen
  #  Then Click Ok OnSuccess Screen
  # And logout from the application
  @1108920
  Scenario: BAJI200117 - VAT on advance insurance is wrongly calculated - BAJI200034
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
    And AfterEnter ValueOn Product Class Search
    And User_610 Click Add button AfterEnter Value On Product Class
    #  And Click ok on the warrning Screen
    And Click Fixed Assert button
    And Click AddButton On FixedAssert screen
    And Enter value on Catagory
    And Enter value on Class
    And Enter value on vendor
    And Enter value on quantity
    And Enter value on Unit
    And Enter value on Cy
    And Enter value on UnitCost
    And Enter value on Vat Code

  @1159358
  Scenario: BAJI200117 - VAT on advance insurance is wrongly calculated - BAJI200034
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
    And Click Search Button In Account No
    And Enter Double Click Search Account No
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    And User Click Charges Details
    And User Check Flag In Collect At Fac Approvel
    And User Click Ok Button In Collect At Fac Approvel
    And Click Save Button After Collect At Fac Approvel Give Ok
    And Click Ok Button In Waring Screen
    And Click OK In Button Sucess Screen
    #  And Click Validate Button
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    And User_610 Click Validate Button in Document Details

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
    Then Enter Holiday Date In Expiratin date in additional Details
    And Validate holiday day allow or not
    And Confirm the Requested Holiday date
    And Click Save Button After Document Details
    And Click Ok Button In Waring Screen Document Details
    And Click OK  Button In Sucess Screen Document Details
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then Enter Holiday date in Expected Payment Date in Limit Details SubMenu
    And Validate holiday day allow or not
    And Confirm the Requested Holiday date in Limit Details SubMenu
    #   And  Confirm the Requested Holiday date in Limit Details SubMenu
   # And Click Add button AfterEnter Value On Product Class

  
  @579604
  Scenario: TSR - KCB170047
    Given navigate to FMS application2 and login with valid credentials
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    Then Click Application For Decrease
    And Enter Existing Facility Ref
    And Click on additional Details In Additional Details
    And Enter the Total Value In Additional Details
    Then Enter Down Payment In Percentage

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
  @814762
  Scenario: AIBBI190201 - Errors at facility update after approve
    Given navigate to FMS application2 and login with valid credentials
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 click facility management
    And User_610 click update after approvel
    And User_610 Retrive one data in update after approvel screen
    And User_610 click facility application details
    And User_610 check flag exceed facility at sublimit
    And User_610 check flag subject to full repayment
    And User_610 click facility limit details
    And User_610 click product class
    And User_610 enter the value cap rate
    And User_610 enter the value selling price
    And User_610 click document details approvel screen
    And User_610 enter the date in document details
    And User_610 save the details
    And User_610 click  approvel and reject screen
    And User_610 enter the retrive data code
    And User_610 validate the facility application details screen
    And User_610 validate the product class screen
    And User_610 validate the document details screen

  @828238
  Scenario: ABEI190282 - Facility Closure Error
    Given navigate to FMS application2 and login with valid credentials
    And User_610 get the test data set id for AT_AFF_037
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
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
 #   And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User clicks the Approve Level1 link
    And User retrive the first data in approve level1
    And select the Approve level1 decision as approve
    And User clicks on the level1 submit button
    And User clicks the Approve Level2 link
    And User retrive the first data in approve level2
    And User select the level2 decision as approve
    And User clicks on the level2 submit button
    And User clicks the Approve Level3 link
    And User retrive the first data in approve level3
    And User select the level3 decision as approve
    When User clicks on the level3 submit button

  #check flag FMS params
  @315144
  Scenario: Remaining Cash margin updation after complete utilization of facility value -IIAB150154
    
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
    
      
    #create facility num
    @315144_02
    
    Scenario: Remaining Cash margin updation after complete utilization of facility value -IIAB150154
    Given navigate to FMS application2 and login with valid credentials
    And User_610 get the test data set id for AT_AFF_037
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
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
#    And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User clicks the Approve Level1 link
    And User retrive the first data in approve level1
    And select the Approve level1 decision as approve
    And User clicks on the level1 submit button
    And User clicks the Approve Level2 link
    And User retrive the first data in approve level2
    And User select the level2 decision as approve
    And User clicks on the level2 submit button
    And User clicks the Approve Level3 link
    And User retrive the first data in approve level3
    And User select the level3 decision as approve
    When User clicks on the level3 submit button
    
    @315144_03
    
    Scenario: Remaining Cash margin updation after complete utilization of facility value -IIAB150154
		 Given navigate to FMS application2 and login with valid credentials
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 click facility management
    And User_610 click update after approvel
    And User_610 Retrive one data in update after approvel screen
    And User_610 Retrive Finance Amount in update after approvel
    And User_610 click facility application details screen
    And User_610 enter cash Margin value in facility application details
    And User_610 click document details approvel screen
    And User_610 enter the date in document details
    And User_610 save the details
    And User_610 click  approvel and reject screen
    And User_610 enter the retrive data code
    And User_610 click facility application details screen
    And User_610 click Approve button in facility application details
    And User_610 click Draw Down Request screen
    And User_610 click Maintenance in Draw Down Request screen
    And User_610 enter Facility Refercence in Draw Down Request screen
    And User_610 enter Drawdown Type in Draw Down Request screen
    And User_610 enter Description English in Draw Down Request screen
    And User_610 enter Description Arab in Draw Down Request screen
    And User_610 enter Date Submitted in Draw Down Request screen
    And User_610 enter Date ValueDate in Draw Down Request screen
    And User_610 click Drawdown Additional Details 
    And User_610  validate Accepting or not extra amount in FC Amount
    
    @247933
    Scenario: TSR-BMOI140488-Salary of the CIF is not defaulting in ‘Average salary for DBR Calc’ field upon doing a modify request for the approved facility.

		Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data third row in update after approve menu
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
    
    @247933_02
    Scenario: TSR-BMOI140488-Salary of the CIF is not defaulting in ‘Average salary for DBR Calc’ field upon doing a modify request for the approved facility.
    
    Given navigate to FMS application and login with valid credentials
And User_610 get the test data for test case AT_FM_043_FMSCore
And User_610 clicks on the Request module
And User_610 clicks on the Request Financing under Request module
And User_610 clicks on the Request for Financing under Request Financing feature
And User_610 clicks on the Maintanance screen under Request for Financing
And User_610 select the Reason for submission under main screen in Request for Financing
And User_610 enter the CIF no in main screen under Request for Financing
And User_610 enter the facility type in main screen under Request for Financing
And User_610 enter the total limit in main screen under Request for Financing
And User_610 move to the sublimit tab in main screen under Request for Financing
And User_610 click the add new button in sublimit tab under main screen in Request for Financing
And User_610 enter the product class in limit details tab under sublimit tab
And User_610 enter the margin value in limit details tab under sublimit tab
And User_610 click the add button in limit details tab under sublimit tab
When User_610 click the Save button in main screen under Request for Financing
And User_610 click the Validate button in main screen Request for Financing
Then User_610 click the approve level1 under Request for Financing
And User_610 enter the request code in approve level1 under Request for Financing
And User_610 double click on the first row in approve level1 under Request for Financing
And User_610 move to customer grading tab in approve level1 under Request for Financing
And User_610 select the approve level1 recommendation decision in approve level1 under Request for Financing
And User_610 select the decision forward to as approval committee in approve level1 under Request for Financing
And User_610 select the approval committee in approve level1 under Request for Financing
And User_610 click the Approve button in approve level1 under Request for Financing
Then User_610 click the Approval committee recommendation under Request for Financing
And User_610 enter the code in Approval committee recommendation under Request for Financing
And User_610 double click on the first row in Approval committee recommendation under Request for Financing



@1038991
Scenario: Check at the Limit Details window, the existing fields “Facility Value” and “Total Facility Value” is reset as follows
		Given navigate to FMS application2 and login with valid credentials
		And User_610 get the test data set id for AT_FM_099
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
    And User_610 enter Down Payment Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Validate Finance Amount
    
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    And User_610 Enter down Payment amount
    Then User_610 Validate Total Facility Value 



























































































































































































