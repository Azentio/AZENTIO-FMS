Feature: Wifak Application

  @870478
  Scenario: Error while saving FMS application.
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
    And User_610 Save button
   # And User_610 Click Validate Button in Document Details

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
    Then Check Flag in Clean Level IN Limits Detalis SubMenu
    #  And Enter Currency Button In Account No
    #   And Enter GLCode Button In Account No
    #   And Enter Serial Button In Account No
    #   And Enter Account Number
    #   And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
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
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    Then Click Facilities Management
    And Click Maintence Screen
    Then Click and Enter Application Ref No
    #  And Click Random button In Status SubMenu
    #  Then Click Additional Details SunMenu
    And Click facility Limit Details
    Then Click ProductClass In facility Limit Details
    And Enter Previous data In MaturityDate

  @592970
  Scenario: TSR - AMANAUPG170182 - Holiday issue
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

  @592279
  Scenario: TSR- SUPT170522 - Label missing
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
    And Check The Level Of Items In LImit Details SubMenu
    Then Check The Level Of Product Class In LImit Details SubMenu
    And Check The Level Of Type In LImit Details SubMenu
    Then Check The Level Of Case Non Case In LImit Details SubMenu
    And Check The Level Of Facility Value In LImit Details SubMenu
    Then Check The Level Of Exchange Rate In LImit Details SubMenu
    And Check The Level Of CV Value In LImit Details SubMenu
    Then Check The Level Of Down Payment Percentage In LImit Details SubMenu
    And Check The Level Of Down Payment AmountIn LImit Details SubMenu
    Then Check The Level Of Details Down Payment To Vendor Percentage In LImit Details SubMenu
    And Check The Level Of Down Payment To Vendor Amt In LImit Details SubMenu
    Then Check The Level Of Total Down Payment Percentage In LImit Details SubMenu
    And Check The Level Of  Total Down Payment In LImit Details SubMenu
    Then Check The Level Of Total Facility Value In LImit Details SubMenu
    And Check The Level Of Value Date In LImit Details SubMenu
    Then Check The Level Of Maturity Date In LImit Details SubMenu
    And Check The Level Of Expected Payment Date In LImit Details SubMenu
    Then Check The Level Of  Status In LImit Details SubMenu
    And Check The Level Of Checking On In LImit Details SubMenu
    Then Check The Level Of  Account No In LImit Details SubMenu
    Then Check The Level Of  Account Name In LImit Details SubMenu
    And Check The Level Of    Fund Transfer Rate In LImit Details SubMenu
    Then Check The Level Of    TFA Margin Rate_In LImit Details SubMenu
    And Check The Level Of    Eco Sector In LImit Details SubMenu
    Then Check The Level Of    Sub Eco Sector In LImit Details SubMenu
    And Check The Level Of    TFAT enure Days In LImit Details SubMenu
    Then Check The Level Of    Discounting Margin percentage In LImit Details SubMenu
    And Check The Level Of    Remarks In LImit Details SubMenu
    Then Check The Level Of    Payment Method In LImit Details SubMenu
    And Check The Level Of    Purpose of financing In LImit Details SubMenu
    Then Check The Level Of    Installment Amount In LImit Details SubMenu
    And Check The Level Of    No of Installments In LImit Details SubMenu
    Then Check The Level Of    Security Deposit Amount In LImit Details SubMenu
    And Check The Level Of    Amended Security Deposit Amount In LImit Details SubMenu
    Then Check The Level Of    Cap Rate In LImit Details SubMenu
    And Check The Level Of    selling price In LImit Details SubMenu
    Then Check The Level Of    floor Rate Method In LImit Details SubMenu
    And Check The Level Of    Floor Rate Percentage In LImit Details SubMenu
    Then Check The Level Of    Credit Spread In LImit Details SubMenu
    And Check The Level Of    Sublimit Lower Limit Percentage In LImit Details SubMenu
    Then Check The Level Of    Sublimit Lower Limit Amount In LImit Details SubMenu
    And Check The Level Of    Clean Flag In LImit Details SubMenu
    Then Check The Level Of Revolving One Off In LImit Details SubMenu
    And Check The Level Of  Apply PenaltyIn LImit Details SubMenu
    Then Check The Level Of Penalty On Due Amount In LImit Details SubMenu
    And Check The Level Of Grace Period_ In LImit Details SubMenu
    Then Check The Level Of charges type In LImit Details SubMenu
    And Check The Level Of Vat code In LImit Details SubMenu
    Then Check The Level Of PPR In LImit Details SubMenu
    And Check The Level Of REGIMENTAL AGENT In LImit Details SubMenu
    Then Check The Level Of BUDGET ALLOCATION In LImit Details SubMenu
    And Check The Level Of  CONTRACTED In LImit Details SubMenu
    Then Check The Level Of comments and conditions In LImit Details SubMenu
    And Check The Level Of  transaction cy In LImit Details SubMenu
    Then Check The Level Of Maximum Tenure Periodicity No key In LImit Details SubMenu
    And Check The Level Of Maximum Tenure Periodicity Type key In LImit Details SubMenu
    Then Check The Level Of Minimum Tenure Periodicity No In LImit Details SubMenu
    And Check The Level Of Minimum Tenure PeriodicityType key In LImit Details SubMenu
    Then Check The Level Of Maximum Tenure for financing PeriodicityNo key In LImit Details SubMenu
    And Check The Level Of  Maximum Tenure for financing PeriodicityType key In LImit Details SubMenu
    Then Check The Level Of Floating Rate In LImit Details SubMenu
    And Check The Level Of  Floating Rate Periodi city In LImit Details SubMenu
    Then Check The Level Of Floating Rate Periodi city Type In LImit Details SubMenu
    And Check The Level Of   Margin Rate In LImit Details SubMenu
    Then Check The Level Of Total Yield In LImit Details SubMenu
    And Check The Level Of  lip perioIn LImit Details SubMenu
    Then Check The Level Of  limit lip start dat In LImit Details SubMenu
    And Check The Level Of  lip period amende In LImit Details SubMenu
    Then Check The Level Of zero entry cost In LImit Details SubMenu
    And Check The Level Of  Transcation Maturity In LImit Details SubMenu
    Then Check The Level Of Transcation Type In LImit Details SubMenu
    And Check The Level Of  Bank No In LImit Details SubMenu
    Then Check The Level Of Acc No In LImit Details SubMenu
    And Check The Level Of  Add Button In LImit Details SubMenu
    Then Check The Level Of  Close Button In LImit Details SubMenu

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
    Then Check Flag in Clean Level IN Limits Detalis SubMenu
    And Click Add button AfterEnter Value On Product Class
    #  Then Click the Product Class In Limits Details
    # And Click Repayment Plan In Limits Details
    And Click Save Button After In Limits Details
    Then Click Ok Button In Waring Screen In Limits Details
    And Click OK  Button In Sucess Screen In Limits Details
    Then Click the Product Class In Limits Details
    And Click Repayment Plan In Limits Details
    Then Enter the value in No Of Payments  In Repayment Plan
    And Click Create Schedule In Repayment Plan
    Then Click Warning popup No In Repayment Plan
    And Click Save Button After In Repayment Plan
    Then Click Ok Button In Waring Screen In Repayment Plan
    And Click OK  Button In Sucess Screen In Repayment Plan
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    And User_610 Click Validate Button in Document Details
    #    And Click Ok Button In Waring Screen Document Details
    #   Then Click OK Button In Confirm Already Created IN Document Details
    #    And Click OK Button In Success ValidateSuccessfully IN Document Details
    #  Then Click Dismiss Button In Send Alert Popup
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

  @740790
  Scenario: TSR - AIBBI180271
    Given navigate to FMS application2 and login with valid credentials
 #   And get the test data set id for AT_RF_192
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
    And Enter Facility Value
    Then Enter the value on  Purpose Of Finacing
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    And Click Second Add button on limit Detail
    And Enter second ValueOn Product Class
    Then Enter second ValueOn Facility Value
    And Enter the second value on  Purpose Of Finacing
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    And Click third Add button on limit Detail
    And Enter third ValueOn Product Class
    Then Enter third ValueOn Facility Value
    And Enter the third value on  Purpose Of Finacing
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    And Click Fourth Add button on limit Detail
    And Enter Fourth ValueOn Product Class
    Then Enter Fourth ValueOn Facility Value
    And Enter the Fourth value on  Purpose Of Finacing
    Then Check Flag in Clean Level IN Limits Detalis SubMenu
    And Click Add button AfterEnter Value On Product Class
    Then Validate how many product class in limits details

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
    And Click Repayment Plan In Limits Details
    Then Enter the value in No Of Payments  In Repayment Plan
    And Click Create Schedule In Repayment Plan
    Then Click Warning popup No In Repayment Plan
    And Click Save Button After In Repayment Plan
    Then Click Ok Button In Waring Screen In Repayment Plan
    And Click OK  Button In Sucess Screen In Repayment Plan
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
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
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN
And User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Search Product Class in Limit Details Pop up Menu
And User Enter the Margin value in New Tab Field in Limit Details Pop up Menu
And User Click on Add button in Limit Details Pop up
And User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User Click on Validate button under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Ok button in Confirm Pop up Menu
And User Click on Yes button in Confirm Pop up Menu
And User Get the Code in Success Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User Click on Approve Level 1 under REQUEST FOR FINANCIN
And User Search the Code in Approve Level 1 under REQUEST FOR FINANCIN
And User Select the Searched Code in Approve Level 1 under REQUEST FOR FINANCIN
And User Click on Customer Grading and Recommendations in Approve Level 1 under REQUEST FOR FINANCIN
And User Select the Decision Field as Forward and Approval Committee in Customer Grading and Recommendations under Approve Level 1
And User Select the Approval Committee as Inverstment Committee in Customer Grading and Recommendations under Approve Level 1
And User Click on Approve button in Customer Grading and Recommendations under Approve Level 1
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User Click on Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN