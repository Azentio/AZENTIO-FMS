Feature: Test the Functionality of Draw down request
@AT_DDR_009_01
Scenario: Check the flag in facility type to get facilities in Facility Management 
Given navigate to FMS param application and login with valid credentials
And User_482 click parameter Menu
And User_482 click Facility Type
And User_482 click update after approve screen in Facility type
And User_482 Search facility type code in Update after approve screen Facility type
And User_482 select the searched facility type in Update after approve screen Facility type
And User_482 click facility details tab in searched record Update after approve screen Facility type
And User_482 click STP Facility Requirements
And User_482 check Committee Approval CheckBox
And User_482 check Credit Review CheckBox
And User_482 check Issue Facility Offer CheckBox
And User_482 check Document Validation CheckBox
And User_482 check Final Approval CheckBox
And User_482 check Create Active Facility If Within Limits CheckBox
And User_482 check Automatically Approve Facility If Within Limits CheckBox
And User_482 click update button in Update after approve screen Facility type
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click approve screen in Facility type
And User_482 search code in approve screen Facility type 
And User_482 select searched code in approve screen Facility type
And User_482 click approve button in approve screen Facility type
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
@AT_DDR_009_02
Scenario: create application for facilities in WIFAK Application
Given navigate to FMS application and login with valid credentials
And User_482 click Technical details
And User_482 click clear caches
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_DDR_009
And User_482 Select Application For field in Maintenace Screen under WIRAK Application
And User_482 enter the CIF No in main info tab under WIRAK Application
And User_482 enter the facility type in main info tab under WIRAK Application
And User_482 enter the country of financing in main info tab under WIRAK Application
And User_482 enter facility rating in main info tab under WIRAK Application
And User_482 clicks on the additional details tab under WIRAK Application	
And User_482 Enter total value under additional details tab in WIFAK Application
And User_482 Enter offer Expiration in Additional details under WIFAK Application
And User_482 click Limit Details tab in WIFAK Application
And User_482 click add icon in limit details under WIFAK Application
And User_482 select the product class in limit details under WIFAK Application
And User_482 check clean checkbox options in limit details under WIFAK Application
And User_482 click add icon in limit details popup under WIFAK Application
And User_482 click document details tab under WIFAK Application
And User_482 enter solicitor name to select from look up in document details under WIFAK Application 
And User_482 enter Estimator name to select from look up in document details under WIFAK Application
And User_482 click Maininformation tab in WIFAK Application
And User_482 click save button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Get the Code in Success Pop up Menu under WIFAK Application
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click Validate button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 update test data set for AT_DDR_009
And User_482 Click Approve Level 1 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 1 screen in Application for financial facilities
And User_482 Select searched record in Approve level 1 screen Application for financial facilities
And User_482 Select Decision in Approve level 1 under WIFAK Application
And User_482 click submit button in approve level 1 under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click Approve Level 2 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 2 screen in Application for financial facilities
And User_482 Select searched record in Approve level 2 screen Application for financial facilities
And User_482 Select Decision in Approve level 2 under WIFAK Application
And User_482 click submit button in approve level 2 under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click Approve Level 3 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 3 screen in Application for financial facilities
And User_482 Select searched record in Approve level 3 screen Application for financial facilities
And User_482 Select Decision in Approve level 3 under WIFAK Application
And User_482 click submit button in approve level 3 under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
@AT_DDR_009_03
Scenario: create facility in WIFAK Application
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 update test data set for AT_DDR_009
And User_482 Click facilities management screen under WIFAK Application
And User_482 Click Maintenance screen in Facilities Management Under WIFAK Application
And User_482 Click Search Icon in Maintenance screen Facilities Management Under WIFAK Application
And User_482 Search Application Ref Num In Facilities Management Under WIFAK Application
And User_482 Select Searched Record In Facilities Management Under WIFAK Application
And User_482 Store Facility Code In Facilities Management Under WIFAK Application
@AT_DDR_009
Scenario: IIAB150201 - Differnce between the Drawdown amount feilds.
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Draw Down Request In WIFAK Application
And User_482 Click Maintenance Screen In Draw Down Request
And User_482 update test data set for AT_DDR_009 drawdown request
And User_482 Enter Faciliy Reference code In Draw Down Request
And User_482 Enter Draw Down Type code In Draw Down Request
And User_482 Enter Description English 
And User_482 Enter value date in Draw Down Request
And User_482 Click Drawdown Additional Details
And User_482 Enter product class In Drawdown Additional Details
And User_482 Enter FC Amount In Drawdown Additional Details 
And User_482 Click Save Button in Drawdown Maintenance
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Store the DrawDown Request id 
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click close icon in sent alert under WIFAK Application
And User_482 Click Verify Sub menu In Draw Down Request
And User_482 Search Code in Verify Sub menu In Draw Down Request
And User_482 Select the Searched code in Verify Sub menu In Draw Down Request 
And User_482 User click verify button in Verify Sub menu In Draw Down Request
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click close icon in sent alert under WIFAK Application
And User_482 Click Approve Screen In draw down request 
And User_482 Search Code in Approve Sub menu In Draw Down Request
And User_482 Select the Searched code in Approve Sub menu In Draw Down Request 
And User_482 Click Approve button in Approve Sub menu In Draw Down Request
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click Update After Approve Screen in Draw down request
And User_482 Search Code in Update after Approve Sub menu In Draw Down Request
And User_482 Select the Searched code in Update after Approve Sub menu In Draw Down Request 
And User_482 Click Drawdown Additional Details in Update after Approve Sub menu 
And User_482 Enter FC Amount In Drawdown Additional Details in Update after Approve Sub menu
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click close icon in sent alert under WIFAK Application
And User_482 Click Approve Screen In draw down request 
And User_482 Search Code in Approve Sub menu In Draw Down Request
And User_482 Select the Searched code in Approve Sub menu In Draw Down Request 
And User_482 Click Approve button in Approve Sub menu In Draw Down Request
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Close Maintenance In Draw Down Request
And User_482 Click Maintenance Screen In Draw Down Request
And User_482 Search Code in Maintenance Screen Draw Down Request
And User_482 Select the searched code in Maintenance Screen Draw Down Request
And User_482 Verify CV Amount and Amt in Facility CY should be same






 
