Feature: Testing the Functionality of Financial facility Application
@931766
Scenario: AIBBI190625 - Economic and Sub-Economic Sector Not appearing
Given User Launch the CSM params Application
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
#pre req define min and max in facility details in params
@831806
Scenario: Not able to create application with value more than 9 digits
Given navigate to FMS application and login with valid credentials
And User Click on WIFAK Application Main Menu
And User Click on WIFAK Application Sub Menu
And User Click Application for financial facilities 
And User Click Maintenance screen in WIFAK Application sub menu
And User Select Application For field in Maintenace Screen under WIRAK Application
And User enter the CIF No in main info tab under WIRAK Application
And User enter the facility type in main info tab under WIRAK Application
And User enter the country of financing in main info tab under WIRAK Application
And User enter the facility rating in main info tab under WIRAK Application
And User clicks on the additional details tab under WIRAK Application
And User enter the total value in additional info tab under WIRAK Application


