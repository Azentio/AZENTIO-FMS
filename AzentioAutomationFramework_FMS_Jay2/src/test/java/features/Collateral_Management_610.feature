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
