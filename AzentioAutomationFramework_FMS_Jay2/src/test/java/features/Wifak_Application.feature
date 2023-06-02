Feature: Wifak Application

  @870478
  Scenario: Error while saving FMS application.
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class

  #And Click Add button in Limits Detalis
  #And CLick Save button in Limits Detlis
  #And click Waring
  @285052
  Scenario: System giving error on updating an application
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
    And Click ok on the warrning Screen
    And Click Fixed Assert button
    And Click AddButton On FixedAssert screen
    And Enter value on Catagory
    And Enter value on Class
    And Enter value on vendor
    And Enter value on quantity
    And Enter value on Unit
    And Enter value on Cy
    And Enter value on UnitCost
    And Click OkButton On Fixed AssertKey Screen
    And Click Save button on limit details tab
    And Click Ok saveOn Draft WarrningScreen
    Then Click Ok OnSuccess Screen

  # And logout from the application
  @1108920
  Scenario: BAJI200117 - VAT on advance insurance is wrongly calculated - BAJI200034
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
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
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And Click Search Button In Account No
    And Enter Double Click Search Account No
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
    And Click Document Details
    And Enter The Value Solicitor Name
    And Enter The Value Estimator Name
    And Click Save Button After Document Details
    And Click Ok Button In Waring Screen Document Details
    And Click OK  Button In Sucess Screen Document Details
    And Click Validate Button in Document Details
    And Click Ok Button In Waring Screen Document Details
    And Click OK Button In Success Screen IN Document Details

  @665893
  Scenario: TSR - RIDB180130 Maturity Date of any sublimit
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
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
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    Then Enter Holiday Date In Expiratin date in additional Details
    And Confirm the Requested Holiday date
    And Click Save Button After Document Details
    And Click Ok Button In Waring Screen Document Details
    And Click OK  Button In Sucess Screen Document Details
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    Then Enter Holiday date in Expected Payment Date in Limit Details SubMenu
    And Confirm the Requested Holiday date in Limit Details SubMenu
    #   And  Confirm the Requested Holiday date in Limit Details SubMenu
    And Click Add button AfterEnter Value On Product Class

  @592279
  Scenario: TSR- SUPT170522 - Label missing
     Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
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
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    Then Click Application For Decrease
    And Enter Existing Facility Ref
		And Click on additional Details In Additional Details
    And Enter the Total Value In Additional Details
    Then Enter Down Payment In Percentage
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
