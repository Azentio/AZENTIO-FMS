Feature: Testing the Functionality of Financial facility Application
@931766_1
Scenario: AIBBI190625 - Economic and Sub-Economic Sector Not appearing
Given User Launch the CSM params Application
And User Click CSM parameter Main Menu
And User Click CIF paramter Sub Menu
And User Click Economic Sector SubMenu
And User Click Maintenace Screen in Economic Sector 
And User Enter sector code in Economic Sector Maintenace Screen
And User Enter brief name in Economic Sector Maintenace Screen
And User Enter brief name Arab in Economic Sector Maintenace Screen
And User Click Save button in Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Economic Sector Maintenace Screen
And User click Approve Screen In Economic Sector
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
@931766_2
Scenario: AIBBI190625 - Economic and Sub-Economic Sector code should be reflected in FMS
Given navigate to FMS application and login with valid credentials
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Search and Validate created Economic sector code refletced in Application screen
And User Search and Validate created Sub Economic sector code refletced in Application screen
@947108
Scenario: BMO190221 Exception error in Production FMS
Given navigate to FMS application and login with valid credentials
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN
And User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Search Product Class in Limit Details Pop up Menu
And User Enter the Margin value in New Tab Field in Limit Details Pop up Menu
And User Click on Add button in Limit Details Pop up
And User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User Click on Validate button under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Ok button in Confirm Pop up Menu
And User Click on Yes button in Confirm Pop up Menu
And User Get the Code in Success Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User Click on Approve Level 1 under REQUEST FOR FINANCIN
And User Search the Code in Approve Level 1 under REQUEST FOR FINANCIN
And User Select the Searched Code in Approve Level 1 under REQUEST FOR FINANCIN
And User Click on Customer Grading and Recommendations in Approve Level 1 under REQUEST FOR FINANCIN
And User Select the Decision Field as Forward and Approval Committee in Customer Grading and Recommendations under Approve Level 1
And User Select the Approval Committee as Inverstment Committee in Customer Grading and Recommendations under Approve Level 1
And User Click on Approve button in Customer Grading and Recommendations under Approve Level 1
And User Click on Ok button in Confirm Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User Click on Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Search the Code in Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN
Then User Validate the Code is Displayed in Approval Committee Recommendations under Request For Financing Sub Menu in REQUEST FOR FINANCIN
@894528
Scenario: DBU191114 - Market Value Feild is not editable
Given navigate to FMS application and login with valid credentials
And User Click on Collateral Management under FMS application
And User Click on Maintenance under Collateral Management
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
@AFFF_01
Scenario: Not able to create application with value more than 9 digits
Given navigate to FMS application and login with valid credentials
And User Click on WIFAK Application Main Menu
And User Click on WIFAK Application Sub Menu
And User Click Application for financial facilities 
And User Click Maintenance screen in WIFAK Application sub menu
And User update test data set for 831806
And User Select Application For field in Maintenace Screen under WIRAK Application
And User enter the CIF No in main info tab under WIRAK Application
And User enter the facility type in main info tab under WIRAK Application
And User enter the country of financing in main info tab under WIRAK Application
And User clicks on the additional details tab under WIRAK Application
And User Validate Min value configured in fms param facility type
And User Validate Max value configured in fms param facility type
@1038990
Scenario: Check the behavior of the following fields under the Application and Request Screen and under Limit Details window down payment
					percentage Down payment Downpayment to vendor percentage down payment total down payment percentage total down payment
Given navigate to FMS application and login with valid credentials
And User Click on WIFAK Application Main Menu
And User Click on WIFAK Application Sub Menu
And User Click Application for financial facilities 
And User Click Maintenance screen in WIFAK Application sub menu
And User Select Application For field in Maintenace Screen under WIRAK Application
And User enter the CIF No in main info tab under WIRAK Application
And User enter the facility type in main info tab under WIRAK Application
And User enter the country of financing in main info tab under WIRAK Application
And User clicks on the additional details tab under WIRAK Application	
And User Enter total value under additional details tab in WIFAK Application
Then User Enter downpayment value greater than total value system should throw validation
Then User Enter downpayment percentage and validate downpayment value automatically adjusted
Then User Enter downpayment value and validate downpayment percentage automatically adjusted
Then User Enter downpayment to vendor percentage and validate downpayment to vendor value automatically adjusted
Then User Enter downpayment to vendor value and validate downpayment to vendor percentage automatically adjusted
Then User Validate total downpayment percentage and total downpayment value
@AT_RF_008
Scenario: MFI190234 - Request for Financing & Application --->Limit Details-->Repayment Plan, Maturity dates not changing properly
Given navigate to FMS application and login with valid credentials
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
And User Select New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User Search the CIF Number in Customer under Maintenance screen in REQUEST FOR FINANCIN
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCIN
And User Enter the value in Total Limit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User Search Product Class in Limit Details Pop up Menu
#And User Enter the Margin value in New Tab Field in Limit Details Pop up Menu
And User Click on Add button in Limit Details Pop up
And User Click on Save button under Maintenance screen in REQUEST FOR FINANCIN
And User Click on Ok button in Confirm Pop up Menu
And User Get the Code in Success Pop up Menu
And User Click on Ok button in Success Pop up Menu
And User click search icon in Maintenance screen Request for financing
And User Search code in Maintenance screen Request for financing
And User Select searched record in Maintenance screen Request for financing
And User Click on Ok button in Confirm Pop up Menu
And User Click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User select sublimit details in Maintenance screen Request for financing
And User click repayment plan in Maintenance screen Request for financing
And User enter no of payments in repayment plan
And User enter pay every in repayment plan
And User Validate the Maturity Date in repayment plan


					


