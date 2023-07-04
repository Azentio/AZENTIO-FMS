Feature: Collateral Management

  @930369
  Scenario: AIBBI190622 - Error appearing while retrieving the collateral
    Given navigate to FMS application2 and login with valid credentials
    And User_610 click Collateral Management Screen
    And User_610 click maintenance in Collateral Management Screen
    And User_610 enter collateral type Collateral Management Screen
    And User_610 enter Valid From Date in Collateral Management Screen
    And User_610 enter Valid To Date in Collateral Management Screen
    And User_610 enter Brief Description in Collateral Management Screen
    And User_610 enter Long Description in Collateral Management Screen
    And User_610 enter CIF NO in Collateral Management Screen
    And User_610 enter Collateral Currency in Collateral Management Screen
    And User_610 click additional details in Collateral Management Screen
    And User_610 enter FC Valuesf in additional details Screen
    And User_610 enter Date Accepted in additional details Screen
    And User_610 enter Valuation Date in additional details Screen
    And User_610 click save button
    And User_610 click Verify Screen in additional details Screen
    And User_610 Retrive the success code
    And User_610 click verify button
    And User_610 click Approvel Screen in additional details Screen
    And User_610 Retrive the success code
    And User_610 click approvel button

  @828050_01
  Scenario: ABEI190245 - Errors on Sub-Limit Collateral Allocation
    Given navigate to FMS application2 and login with valid credentials
    And User_610 click Collateral Management Screen
    And User_610 click maintenance in Collateral Management Screen
    And User_610 enter collateral type Collateral Management Screen
    And User_610 enter Valid From Date in Collateral Management Screen
    And User_610 enter Valid To Date in Collateral Management Screen
    And User_610 enter Brief Description in Collateral Management Screen
    And User_610 enter Long Description in Collateral Management Screen
    And User_610 enter CIF NO in Collateral Management Screen
    And User_610 enter Collateral Currency in Collateral Management Screen
    And User_610 click additional details in Collateral Management Screen
    And User_610 enter FC Valuesf in additional details Screen
    And User_610 enter Date Accepted in additional details Screen
    And User_610 enter Valuation Date in additional details Screen
    And User_610 click save button
    And User_610 click Verify Screen in additional details Screen
    And User_610 Retrive the success code
    And User_610 click verify button
    And User_610 click Approvel Screen in additional details Screen
    And User_610 Retrive the success code
    And User_610 click approvel button
    
    @828050_02
    Scenario: ABEI190245 - Errors on Sub-Limit Collateral Allocation
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
		And User_610 Enter Facility Value
		And User_610 Click Add button AfterEnter Value On Product Class