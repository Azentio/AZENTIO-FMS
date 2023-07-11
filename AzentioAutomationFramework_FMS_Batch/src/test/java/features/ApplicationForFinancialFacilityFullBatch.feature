Feature: Testing the functionalities of Application for financial Facility
@870478
  Scenario: Error while saving FMS application.
    Given navigate to FMS application and login with valid credentials
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
    Given navigate to FMS application and login with valid credentials
    And User_610 click the reports menu
    And User_610 click the availment ticket sub menu
    And User_610 click the cif and enter the cif number in availment ticket sub menu
    Then User_610 click retrieve button to view the report without error
    Then User_610 verify system should show the CIF details under availment ticket

	@592279
  Scenario: TSR- SUPT170522 - Label missing
    Given navigate to FMS application and login with valid credentials
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
    
    @949677
  Scenario: Linking Fixed Asset to Application in FMS
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 949677
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
    And Click FixedAssert button
    And Click AddButton OnFixedAssert screen
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

  @917005
  Scenario: Credit Rating Field is Disable at Level of Corporate Financing in FMS
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Application for financial facilities
    And Click Maintenance
    And User update test data for test case no 917005
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
    And Go to mainInformation Screen
    Then Check edit rating field editable

  @817662
  Scenario: Documents not showing under document checklist for Facility Application
    Given navigate to FMS application2 and login with valid credentials
    And User update test data for test case no 817662
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
    And Click Document checklist
    And Click for select the row
    And Scroll down to upload file
    And Click Choose file button and upload file
    And Click Upload Docs button
    Then Click Ok OnSuccess Screen
    
    @402668
Scenario: TS-0002-FMS-Modification new fields at the level of Application for Financial facilities screens
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_AFF_078
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu
And User_609 Click on Update After Approve Screen 
And User_609 Select for the Code in Update After Approve screen
And User_609 Select the Revolving/One-Off option in Main Details tab
And User_609 Enable the Apply Revolving Controls in Main Details tab
And User_609 Enter the value for Max Revolving Times
And User_609 Enter the value for Manual Revolving Minimum Utilization	
And User_609 Enable the Subject to Full Repayment 
And User_609 Click on Update
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click on Approve Screen
And User_609 Select the Code in Approve screen
And User_609 Click on Approve
And User_609 Click the confirm ok button
And User_609 Click the ok button


@127780
Scenario: TC to check the addition of two new flags at the Parameters -Facility Type Maintain  screen(P008)
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_AFF_059
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu  
And User_609 Click on Update After Approve Screen
And User_609 Select for the Code in Update After Approve screen
And User_609 Click on the Facility Details Tab
And User_609 Click on the Application Requirements and Details in Facility Details tab
Then User_609 Check the Apply Corporate Package is displayed
Then User_609 Check the Allow to Edit Application is displayed
Then User_609 Check the Allow to edit Corporate Package Rate is displayed

@127917
  Scenario: Check the floating rate,floatingrate periodicity and floatingrate periodicitytype retrived from IIs param screen
    Given navigate to FMS application and login with valid credentials
    And User_611 Click the first Wifak Application
    And User_611 Click the second Wifak Application
    And User_611 Click the application for financial facilities under second Wifak Appliaction
    And User_611 Click the maintenance under application for financial facilities
    And User_611 Click the Main information
    And User_611 Select a new facility under application
    And User_611 Enter the CIF num under cif details
    And User_611 Enter the facility type under facility type details
    And User_611 Enter the country of financing under facility type details
    And User_611 Enter the facility rating under facility type details
    And User_611 Click the Additional details
    And User_611 Enter the currency code under Additional details
    And User_611 Enter the total value under Additional details
    And User_611 Enter the Expiry date
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And User_611 Enter the Product class value two
    And User_611 Enter the floating rate
    And User_611 Enter the floating rate periodicity
    And User_611 Enter the floating rate periodicity type
    And User_611 Validate all the floating Rate details is displayed or Not