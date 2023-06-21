Feature: Testing the Functionalities of Facilies Management feature
@AT_FM_009
Scenario: BMOUPI180168 - Existing Facility Repayment plan not showing correct Data
Given navigate to FMS application and login with valid credentials
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User click search icon in Maintenance screen Request for financing
And User_482 search Status In Maintenance under REQUEST FOR FINANCIN 
And User_482 select the searched status in Maintenance screen under REQUEST FOR FINANCIN 
And User_482 click disbursement sublimit tab in draft record Maintenance screen under REQUEST FOR FINANCIN
And User_482 select product class record in draft record Maintenance screen under REQUEST FOR FINANCIN
And User_482 click the repayment plan in draft record Maintenance screen under REQUEST FOR FINANCIN
And User_482 enter the no of payments In Limit details pop up under REQUEST FOR FINANCIN
And User_482 click create schedule option In Limit details pop up under REQUEST FOR FINANCIN
And User Click on Ok button in Confirm Pop up Menu
And User_482 Validate the No of payments Generated in repayment plan
@AT_FM_010
Scenario: TSR - MMBI170086 -Error at facility Screen
Given navigate to FMS application and login with valid credentials
And User_482 Update test data set id for AT_FM_010 
And User Click on WIFAK Application Main Menu
And User Click on WIFAK Application Sub Menu
And User_482 click Facilities Management in WIFAK Application
And User_482 click approve submenu in Request for Financing under WIFAK Application
And User_482 search active status in approve level 1 under WIFAK Application
And User_482 select the first active record of facility record under WIFAK Application 
And User_482 click approve button in facility main information under WIFAK Application
And User Click on Ok button in Confirm Pop up Menu
And User_482 Validate the approved facility record in Facility management under WIFAK Application
@AT_FM_061
Scenario: System automatically approved all the level till facility creation
Given navigate to FMS application and login with valid credentials
And User Click on WIFAK Application Main Menu
And User Click on WIFAK Application Sub Menu
And User Click Application for financial facilities 
And User Click Maintenance screen in WIFAK Application sub menu
And User update test data set for AT_AFF_024
And User Select Application For field in Maintenace Screen under WIRAK Application
And User enter the CIF No in main info tab under WIRAK Application
And User enter the facility type in main info tab under WIRAK Application
And User enter the country of financing in main info tab under WIRAK Application
And User enter facility rating in main info tab under WIRAK Application
And User clicks on the additional details tab under WIRAK Application	
And User Enter total value under additional details tab in WIFAK Application
And User Enter offer Expiration in Additional details under WIFAK Application
And User click Limit Details tab in WIFAK Application
And User click add icon in limit details under WIFAK Application
And User select the product class in limit details under WIFAK Application
And User_482 check clean checkbox options in limit details under WIFAK Application
And User click add icon in limit details popup under WIFAK Application
And User click document details tab under WIFAK Application
And User enter solicitor name to select from look up in document details under WIFAK Application 
And User enter Estimator name to select from look up in document details under WIFAK Application
And User click Maininformation tab in WIFAK Application
And User click save button in Main Info tab under WIFAK Application
And User Click on Ok button in Confirm Pop up Menu
And User Get the Code in Success Pop up Menu under WIFAK Application
And User Click on Ok button in Success Pop up Menu
And User click Validate button in Main Info tab under WIFAK Application
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Success Pop up Menu
#And User_482 Click close icon in sent alert under WIFAK Application
And User_482 Click Approve Level 1 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 1 screen in Application for financial facilities
And User_482 Select searched record in Approve level 1 screen Application for financial facilities
And User_482 Select Decision in Approve level 1 under WIFAK Application
And User_482 click submit button in approve level 1 under WIFAK Application
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User_482 Click Approve Level 2 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 2 screen in Application for financial facilities
And User_482 Select searched record in Approve level 2 screen Application for financial facilities
And User_482 Select Decision in Approve level 2 under WIFAK Application
And User_482 click submit button in approve level 2 under WIFAK Application
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User_482 Click Approve Level 3 screen in application for financial facilities under WIFAK Application
And User_482 Search code in Approve Level 3 screen in Application for financial facilities
And User_482 Select searched record in Approve level 3 screen Application for financial facilities
And User_482 Select Decision in Approve level 3 under WIFAK Application
And User_482 click submit button in approve level 3 under WIFAK Application
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User_482 close Maintenance screen WIFAK Application 
And User Click Maintenance screen in WIFAK Application sub menu
And User click search icon in Maintenance screen under WIFAK Application
And User_482 Search code in Maintenance screen in Application for financial facilities
#And User_482 Select searched record in Maintenance screen Application for financial facilities
And User_482 Validate Final approval of facility application under WIFAK Application

@AT_FM_062_Prereq
Scenario: Enable alert in fsm parameter
Given navigate to FMS param application and login with valid credentials
And User_482 click parameter Menu
And User_482 click Control record Sub Menu
And User_482 click Update After Approve in control record
And User_482 Check the Enable Alerts check box
And User_482 Uncheck the Auto Alerts Check box
And User_482 click update button in Control records
And User_482 click approve button in




