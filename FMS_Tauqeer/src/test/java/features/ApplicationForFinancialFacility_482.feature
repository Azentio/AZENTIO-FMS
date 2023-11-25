@FinancialFacility
Feature: Testing the Functionality of Financial facility Application
@AT_AFF_004_01
Scenario: AIBBI190625 - Economic and Sub-Economic Sector Not appearing
Given User Launch the CSM params Application
And User Click CSM parameter Main Menu
And User Click CIF paramter Sub Menu
And User Click Economic Sector SubMenu
And User Click Maintenace Screen in Economic Sector 
And User Update test data set id for AT_AFF_004
And User Enter sector code in Economic Sector Maintenace Screen
And User Enter brief name in Economic Sector Maintenace Screen
And User Enter brief name Arab in Economic Sector Maintenace Screen
And User Click Save button in Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Economic Sector Maintenace Screen
And User click Approve Screen In Economic Sector
And User Update test data set id for AT_AFF_004
And User Search sector code in Economic Sector Approve Screen
And User Select the searched record in Economic Sector Approve Screen
And User click aprove button in Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Economic Sector Maintenace Screen 
And User Click Sub Economic Sector SubMenu
And User Click Maintenace Screen in Sub Economic Sector
And User Select sector key in Sub economic Sector
And User Enter sub sector code in Sub Economic Sector Maintenace Screen
And User Enter brief name in Sub Economic Sector Maintenace Screen
And User Enter brief name Arab in Sub Economic Sector Maintenace Screen
And User Click Save button in Sub Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Sub Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Sub Economic Sector Maintenace Screen
And User click Approve Screen In Sub Economic Sector
And User Search sector code in Sub Economic Sector Approve Screen
And User Select the searched record in Sub Economic Approve Screen
And User click aprove button in Sub Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Sub Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Sub Economic Sector Maintenace Screen
@AT_AFF_004_02
Scenario: AIBBI190625 - Economic and Sub-Economic Sector code should be reflected in FMS
Given navigate to FMS application and login with valid credentials
And User Update test data set id for AT_AFF_004
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Search and Validate created Economic sector code refletced in Application screen
And User Search and Validate created Sub Economic sector code refletced in Application screen
@AT_AFF_008
Scenario: BMO190221 Exception error in Production FMS
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User Update test data set id for AT_AFF_008
And User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN
And User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Search Product Class in Limit Details Pop up Menu
And User Enter the Margin value in New Tab Field in Limit Details Pop up Menu
And User Click on Add button in Limit Details Pop up
And User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User Click on Validate button under Maintenance screen in REQUEST FOR FINANCIN
And User_482 Click on Ok button in Confirm Pop up Menu
And User Click on Yes button in Confirm Pop up Menu
And User Get the Code in Success Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User Click on Approve Level 1 under REQUEST FOR FINANCIN
And User Update test data set id for AT_AFF_008
And User Search the Code in Approve Level 1 under REQUEST FOR FINANCIN
And User Select the Searched Code in Approve Level 1 under REQUEST FOR FINANCIN
And User Click on Customer Grading and Recommendations in Approve Level 1 under REQUEST FOR FINANCIN
And User Select the Decision Field as Forward and Approval Committee in Customer Grading and Recommendations under Approve Level 1
And User Select the Approval Committee as Investment Committee in Customer Grading and Recommendations under Approve Level 1
And User Click on Approve button in Customer Grading and Recommendations under Approve Level 1
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User Click on Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Search the Code in Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN
Then User Validate the Code is Displayed in Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN
@AT_AFF_019
Scenario: DBU191114 - Market Value Feild is not editable
Given navigate to FMS application and login with valid credentials
And User Click on Collateral Management under FMS application
And User Click on Maintenance under Collateral Management
And User Update test data set id for AT_AFF_019
And User Search Collateral Type in Maintenance screen under Collateral Management
And User Enter Valid From Date in Maintenance screen under Collateral Management
And User Enter Valid To Date in Maintenance screen under Collateral Management
And User Enter value for Brief Description in Maintenance screen under Collateral Management
And User Enter value for Long Description in Maintenance screen under Collateral Management
#And User Search CIF No in Maintenance screen under Collateral Management
#And User Click Ok button in Confirm pop up menu
And User Search Collateral Currency in Maintenance screen under Collateral Management
Then User Validate Additional Details Tab is Disable in Maintenance screen under Collateral Management
#pre req define min and max in facility details in params use facility code/
#@831806
@AT_AFF_024
Scenario: Not able to create application with value more than 9 digits
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_AFF_024
And User_482 Select Application For field in Maintenace Screen under WIRAK Application
And User_482 enter the CIF No in main info tab under WIRAK Application
And User_482 enter the facility type in main info tab under WIRAK Application
And User_482 enter the country of financing in main info tab under WIRAK Application
And User_482 clicks on the additional details tab under WIRAK Application
And User Validate Min value configured in fms param facility type
And User Validate Max value configured in fms param facility type
#blocked repayment plan button notworking
@AT_AFF_051
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
And User_482 click add icon in limit details popup under WIFAK Application
And User_482 click document details tab under WIFAK Application
And User_482 enter solicitor name to select from look up in document details under WIFAK Application 
And User_482 enter Estimator name to select from look up in document details under WIFAK Application
And User_482 click Maininformation tab in WIFAK Application
And User_482 click save button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Get the Code in Success Pop up Menu under WIFAK Application
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click Limit Details tab in WIFAK Application
And User_482 Click Product Class details in Limit Details
And User_482 Click Repayment Plan options Under WIFAK Application
And User_482 Select Profit Recognition Method as Straight line
And User_482 enter no of payments in repayment plan for WIFAK Application
And User_482 Click Create schedule Button Under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu

@AT_AFF_100
Scenario: Check the behavior of the following fields under the Application and Request Screen and under Limit Details window down payment
					percentage Down payment Downpayment to vendor percentage down payment total down payment percentage total down payment
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_AFF_024
And User_482 Select Application For field in Maintenace Screen under WIRAK Application
And User_482 enter the CIF No in main info tab under WIRAK Application
And User_482 enter the facility type in main info tab under WIRAK Application
And User_482 enter the country of financing in main info tab under WIRAK Application
And User_482 clicks on the additional details tab under WIRAK Application	
And User_482 Enter total value under additional details tab in WIFAK Application
Then User Enter downpayment value greater than total value system should throw validation
Then User Enter downpayment percentage and validate downpayment value automatically adjusted
Then User Enter downpayment value and validate downpayment percentage automatically adjusted
Then User Enter downpayment to vendor percentage and validate downpayment to vendor value automatically adjusted
Then User Enter downpayment to vendor value and validate downpayment to vendor percentage automatically adjusted
Then User Validate total downpayment percentage and total downpayment value

@AT_AFF_014
Scenario: ABSAI190419 - FMS 1704_System is forcing the user to enter a value in Rate field inorder to calculate Total Yield
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_AFF_024
And User_482 Select Application For field in Maintenace Screen under WIRAK Application
And User_482 enter the CIF No in main info tab under WIRAK Application
And User_482 enter the facility type in main info tab under WIRAK Application
And User_482 enter the country of financing in main info tab under WIRAK Application
And User_482 clicks on the additional details tab under WIRAK Application	
And User_482 Enter total value under additional details tab in WIFAK Application
And User_482 click Limit Details tab in WIFAK Application
And User_482 click add icon in limit details under WIFAK Application
And User_482 select the product class in limit details under WIFAK Application
And User Enter Yield details value in limit details under WIFAK Application
And User Validate Total Yield is Calculated based on Yield details and Margin Rate




  
@AT_AFF_085
Scenario: 
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
And User_482 click document details tab under WIFAK Application
And User_482 enter solicitor name to select from look up in document details under WIFAK Application 
And User_482 enter Estimator name to select from look up in document details under WIFAK Application
And User_482 click Maininformation tab in WIFAK Application
And User_482 click save button in Main Info tab under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Get the Code in Success Pop up Menu under WIFAK Application
#And User_482 Click on Ok button in Success Pop up Menu
#And User_482 click Limit Details tab in WIFAK Application
#And User_482 Click Product Class details in Limit Details
#And User_482 Click Repayment Plan options Under WIFAK Application
#And User_482 Select Profit Recognition Method as Straight line
#And User_482 enter no of payments in repayment plan for WIFAK Application
#And User_482 Click Create schedule Button Under WIFAK Application
#And User_482 Click on Ok button in Confirm Pop up Menu


And user click on the validate button under wifak application





					


