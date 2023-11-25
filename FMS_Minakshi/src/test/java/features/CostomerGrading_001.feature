Feature: Testing the Functionality of Financial facility Application
@AT_CG_001
Scenario: Check the Customer Grade Detail
Given navigate to FMS application and login with valid credentials
And User_482 click Technical details
And User_482 click clear caches
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_001 Click on Grading Menu
And User_001 Click on Maintenance Under Grading
And User_001 Click APPi Ref Tab Under Maintenance
And User_001 Enter Appi Ref Code
And User_001 Check the system defaults the eligible Grading Factors
And User_001 Click on Gride Line No
And User_001 Check the system is defaulting the Actual Score based on the scoring value and weightage value


@AT_CG_014
Scenario: 
#show joint accoount flag should be checked first in control rec(params)
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
And User_482 Update Test data set for AT_CG_010
And User_482 Select the New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Cif under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Cif under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Facilty type under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Faclity type under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the total limit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the total limit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on Account field under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Branch Code under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Currency Code under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the  Gl Code under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the CIF Code under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Serial code under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Shareholder and Owner Tab under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the add icon under Shareholder and Owner Tab
And User_482 click on the New rec under Shareholder and Owner Tab
And User_482 click on the Cif field under Shareholder and Owner Tab
And User_482 enter the Cif
And User_482 click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Product class under sublimit
And User_482 enter the product class under sublimit
And User_482 click on add button under sublimit
And User_482 click on the Customer Grading tab
And User_482 click on the Apply Grading button under Customer and Grading Tab
And User_482 click on the First CIF record under Customer Grading Tab
And User_482 enter the score for the First CIF Record under Customer Grading Tab 
And User_482 click on the Second CIF record under Customer Grading Tab
And User_482 enter the score for the Second CIF Record under Customer Grading Tab
And User_482 click on the Third CIF record under Customer Grading Tab
And User_482 enter the score for the Third CIF Record under Customer Grading Tab 
And User_482 click on Save button under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 Get the Code in Success Pop up Menu
And User_482 click on Ok button in Success Pop up Menu
And User_482 click search icon in Maintenance screen Request for financing
And User_482 Search code in Maintenance screen Request for financing
And User_482 Select searched record in Maintenance screen Request for financing
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 click Validate button in Main Info tab under Request for financing
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 click on Ok button in Success Pop up Menu
#And User_482 Click on Ok button in Information Pop up Menu
#And User_482 Dismiss the alert
And User_482 close the Maintenance Screen
And User_482 Update Test data set for AT_CG_010
And User_482 click Approve Level 1 screen in Request for financing facilities under Request for financing
And User_482 Search code in Approve Level 1 screen in Request for financing facilities
And User_482 Select searched record in Approve level 1 screen Request for financing facilities
And User_482 click on the Customer Grading tab
And User_482 Select Decision in Approve level 1 under Request for financing facilities
And User_482 click approve button in approve screen
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 click on Ok button in Success Pop up Menu








@AT_SL_014
Scenario: Check that the Facility Risk Rating are reflected at the level of Application for Financial Facilities  
Given navigate to FMS application and login with valid credentials
And User_482 click Technical details
And User_482 click clear caches
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_AFF_051
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
And User_482 click on the Account No feild under limit details
And User_482 enter the Account feild under limit details
And User_482 check clean checkbox options in limit details under WIFAK Application
And User_482 click add icon in limit details popup under WIFAK Application
And User_482 clicks on the additional details tab under WIRAK Application	
And User_482 Enter total value under additional details tab in WIFAK Application
#And User_482 Enter offer Expiration in Additional details under WIFAK Application
And User_482 click Limit Details tab in WIFAK Application
And User_482 click add icon in limit details under WIFAK Application
And User_482 select the product class in limit details under WIFAK Application
And User_482 click on the second Account No feild under limit details
And User_482 enter the Account feild under limit details
And User_482 check clean checkbox options in limit details under WIFAK Application
And User_482 click add icon in limit details popup under WIFAK Application
And User_482 click save button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_014 Check that the Facility Risk Rating are reflected at the level of Application for Financial Facilities 

@AT_SL_018
Scenario: BMOI150254 - schedule with Straight Line method
Given navigate to FMS application and login with valid credentials
And User_482 click Technical details
And User_482 click clear caches
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_AFF_051
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
And User_018 Check the field Profit Rate Margin is disabled
