@AT_IISPRM_010
Feature: Testing the Functionality of Financial facility Application
Scenario: System automatically approved all the level till facility creation
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
And User_482 click add icon in limit details popup under WIFAK Application
And User_482 click save button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Get the Code in Success Pop up Menu under WIFAK Application
And User_482 Click on Ok button in Success Pop up Menu
#And User_482 click Validate button in Main Info tab under WIFAK Application
And User_482 Select new created product class
And User_482 Click on replayment plan under WIRAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click on button create schedule under the replayment plan tab
And User_482 Click on yes button in Warning Pop up Menu
And User_482 Click on save button under the plan detail 
And User_482 Click on yes button in Warning Pop up
And User_482 Click on Ok button in Success
And User_482 Click Validate button
#And User_482 Click on ok btn after validate
And User_482 Click on yes button in confirm Pop up after validation
And  User_482 Click on ok button in confirm Pop up after validation
And  User_482 Click on close sign 
And User_482 Click Approve Level 1 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 1 screen in Application for financial facilities
And User_482 Select searched record in Approve level 1 screen Application for financial facilities
And User_482 Select Decision in Approve level 1 under WIFAK Application
And User_482 click submit button in approve level 1 under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu