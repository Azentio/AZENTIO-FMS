Feature: TC to check the modification in the Maintain Application Facility Screen

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

  @866195
  Scenario: SUPT190214 Pagination issue from FMS Portal
    Given navigate to FMS application2 and login with valid credentials
    And User_610 click the reports menu
    And User_610 click the availment ticket sub menu
    And User_610 click the cif and enter the cif number in availment ticket sub menu
    Then User_610 click retrieve button to view the report without error
    Then verify system shoudl show the CIF details under availment ticket

	@592279
  Scenario: TSR- SUPT170522 - Label missing
    Given navigate to FMS application2 and login with valid credentials
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
    And  User_610 Check The Level Of Items In LImit Details SubMenu
    Then User_610 Check The Level Of Product Class In LImit Details SubMenu
    And User_610 Check The Level Of Type In LImit Details SubMenu
    Then User_610 Check The Level Of Case Non Case In LImit Details SubMenu
    And User_610 Check The Level Of Facility Value In LImit Details SubMenu
    Then User_610 Check The Level Of Exchange Rate In LImit Details SubMenu
    And User_610 Check The Level Of CV Value In LImit Details SubMenu
    Then User_610 Check The Level Of Down Payment Percentage In LImit Details SubMenu
    And User_610 Check The Level Of Down Payment AmountIn LImit Details SubMenu
    Then User_610 Check The Level Of Details Down Payment To Vendor Percentage In LImit Details SubMenu
    And User_610 Check The Level Of Down Payment To Vendor Amt In LImit Details SubMenu
    Then User_610 Check The Level Of Total Down Payment Percentage In LImit Details SubMenu
    And User_610 Check The Level Of  Total Down Payment In LImit Details SubMenu
    Then User_610 Check The Level Of Total Facility Value In LImit Details SubMenu
    And User_610 Check The Level Of Value Date In LImit Details SubMenu
    Then User_610 Check The Level Of Maturity Date In LImit Details SubMenu
    And User_610 Check The Level Of Expected Payment Date In LImit Details SubMenu
    Then User_610 Check The Level Of  Status In LImit Details SubMenu
    And User_610 Check The Level Of Checking On In LImit Details SubMenu
    Then User_610 Check The Level Of  Account No In LImit Details SubMenu
    Then User_610 Check The Level Of  Account Name In LImit Details SubMenu
    And User_610 Check The Level Of Fund Transfer Rate In LImit Details SubMenu
    Then User_610 Check The Level Of TFA Margin Rate_In LImit Details SubMenu
    And User_610 Check The Level Of Eco Sector In LImit Details SubMenu
    Then User_610 Check The Level Of Sub Eco Sector In LImit Details SubMenu
    And User_610 Check The Level Of TFAT enure Days In LImit Details SubMenu
    Then User_610 Check The Level Of Discounting Margin percentage In LImit Details SubMenu
    And User_610 Check The Level Of Remarks In LImit Details SubMenu
    Then User_610 Check The Level Of Payment Method In LImit Details SubMenu
    And User_610 Check The Level Of Purpose of financing In LImit Details SubMenu
    Then User_610 Check The Level Of Installment Amount In LImit Details SubMenu
    And User_610 Check The Level Of No of Installments In LImit Details SubMenu
    Then User_610 Check The Level Of Security Deposit Amount In LImit Details SubMenu
    And User_610 Check The Level Of Amended Security Deposit Amount In LImit Details SubMenu
    Then User_610 Check The Level Of Cap Rate In LImit Details SubMenu
    And User_610 Check The Level Of selling price In LImit Details SubMenu
    Then User_610 Check The Level Of floor Rate Method In LImit Details SubMenu
    And User_610 Check The Level Of Floor Rate Percentage In LImit Details SubMenu
    Then User_610 Check The Level Of Credit Spread In LImit Details SubMenu
    And User_610 Check The Level Of Sublimit Lower Limit Percentage In LImit Details SubMenu
    Then User_610 Check The Level Of Sublimit Lower Limit Amount In LImit Details SubMenu
    And User_610 Check The Level Of Clean Flag In LImit Details SubMenu
    Then User_610 Check The Level Of Revolving One Off In LImit Details SubMenu
    And User_610 Check The Level Of  Apply PenaltyIn LImit Details SubMenu
    Then User_610 Check The Level Of Penalty On Due Amount In LImit Details SubMenu
    And User_610 Check The Level Of Grace Period_ In LImit Details SubMenu
    Then User_610 Check The Level Of charges type In LImit Details SubMenu
    And User_610 Check The Level Of Vat code In LImit Details SubMenu
    Then User_610 Check The Level Of PPR In LImit Details SubMenu
    And User_610 Check The Level Of REGIMENTAL AGENT In LImit Details SubMenu
    Then User_610 Check The Level Of BUDGET ALLOCATION In LImit Details SubMenu
    And User_610 Check The Level Of  CONTRACTED In LImit Details SubMenu
    Then User_610 Check The Level Of comments and conditions In LImit Details SubMenu
    And User_610 Check The Level Of  transaction cy In LImit Details SubMenu
    Then User_610 Check The Level Of Maximum Tenure Periodicity No key In LImit Details SubMenu
    And User_610 Check The Level Of Maximum Tenure Periodicity Type key In LImit Details SubMenu
    Then User_610 Check The Level Of Minimum Tenure Periodicity No In LImit Details SubMenu
    And User_610 Check The Level Of Minimum Tenure PeriodicityType key In LImit Details SubMenu
    Then User_610 Check The Level Of Maximum Tenure for financing PeriodicityNo key In LImit Details SubMenu
    And User_610 Check The Level Of  Maximum Tenure for financing PeriodicityType key In LImit Details SubMenu
    Then User_610 Check The Level Of Floating Rate In LImit Details SubMenu
    And User_610 Check The Level Of  Floating Rate Periodi city In LImit Details SubMenu
    Then User_610 Check The Level Of Floating Rate Periodi city Type In LImit Details SubMenu
    And User_610 Check The Level Of   Margin Rate In LImit Details SubMenu
    Then User_610 Check The Level Of Total Yield In LImit Details SubMenu
    And User_610 Check The Level Of  lip perioIn LImit Details SubMenu
    Then User_610 Check The Level Of  limit lip start dat In LImit Details SubMenu
    And User_610 Check The Level Of  lip period amende In LImit Details SubMenu
    Then User_610 Check The Level Of zero entry cost In LImit Details SubMenu
    And User_610 Check The Level Of  Transcation Maturity In LImit Details SubMenu
    Then User_610 Check The Level Of Transcation Type In LImit Details SubMenu
    And User_610 Check The Level Of  Bank No In LImit Details SubMenu
    Then User_610 Check The Level Of Acc No In LImit Details SubMenu
    And User_610 Check The Level Of  Add Button In LImit Details SubMenu
    Then User_610 Check The Level Of  Close Button In LImit Details SubMenu
    
  @127788
  Scenario: TC to check the modification in the Maintain Application Facility Screen(T001)
    Given navigate to FMS param application and login with valid credentials2
    And Click on the Parameters menu
    Then Click on the Facility Type submenu
    And Click on the Update After Approve screen
    Then Search for the Code in Update After Approve screen
    And Click the Code in Update After Approve screen
    Then Click the Facility Details tab in update after approve screen
    And Click on the Application Requirements and Details in Facility Details tab
    And Check Apply corporate package flag
    And After check flag in corporate package then click Update
    And Its shows warning button then click ok button
    And Its shows Information button then click ok button
    And Go to Approve sub menu
    And Search for the Code in Updated in update after screen sub menu
    And Click the Code in Updated in update after screen sub menu
    And Click the Facility Details tab in update after approve screen sub menu
    And Click the approve button in facility Details screen approve screen
    And Its shows warning button then click ok button approve screen
    And Its shows Information button then click ok button approve screen

  @127788_01
  Scenario: TC to check the modification in the Maintain Application Facility Screen(T001)
    Given navigate to FMS application and login with valid credentials2
    And Click Wifak Application first01
    And Click Wifak Application Second01
    And Click Application for financial facilities01
    And Click Maintenance01
    And Click and Select Application for01
    And Search CIF No01
    And Enter codeOn Facility Type01
    Then Check the apply corporate package flag is disabled

  @834957
  Scenario: Check a new field “Marketed By” is added under the Main Information Tab in Application for Financial Facilities – Maintenance screen
    Given navigate to FMS param application and login with valid credentials2
    And User clicks on the Parameter module
    And User clicks on the control records feature
    And User clicks on the update after approve menu
    And User Check Flag General Limit By CIF
    And User clicks on the update button
    And User clicks on the approve menu
    Then User clicks on the approve button

  @834957_01
  Scenario: Check a new field “Marketed By” is added under the Main Information Tab in Application for Financial Facilities – Maintenance screen
    Given navigate to FMS application and login with valid credentials2
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    #  And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And User Check Fx Settlement Expery Date
    And User Enter Date above current Date
    Then User Enter Date Below to this current Date
