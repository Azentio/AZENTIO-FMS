Feature: Testing the Functionalities of Facilies Management feature
@AT_FM_009
Scenario: BMOUPI180168 - Existing Facility Repayment plan not showing correct Data
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User_482 click search icon in Maintenance screen Request for financing
And User_482 search Status In Maintenance under REQUEST FOR FINANCIN 
And User_482 select the searched status in Maintenance screen under REQUEST FOR FINANCIN 
And User_482 click disbursement sublimit tab in draft record Maintenance screen under REQUEST FOR FINANCIN
And User_482 select product class record in draft record Maintenance screen under REQUEST FOR FINANCIN
And User_482 click the repayment plan in draft record Maintenance screen under REQUEST FOR FINANCIN
And User_482 enter the no of payments In Limit details pop up under REQUEST FOR FINANCIN
And User_482 click create schedule option In Limit details pop up under REQUEST FOR FINANCIN
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Validate the No of payments Generated in repayment plan
@AT_FM_010
Scenario: TSR - MMBI170086 -Error at facility Screen
Given navigate to FMS application and login with valid credentials
And User_482 Update test data set id for AT_FM_010 
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 click Facilities Management in WIFAK Application
And User_482 click approve submenu in Request for Financing under WIFAK Application
And User_482 search active status in approve level 1 under WIFAK Application
And User_482 select the first active record of facility record under WIFAK Application 
And User_482 click approve button in facility main information under WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Validate the approved facility record in Facility management under WIFAK Application
@AT_FM_061_PreReq
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
@AT_FM_061_01
Scenario: Check all the fals in facility type under fms param
Given navigate to FMS param application and login with valid credentials
And User_482 click parameter Menu
And User_482 click Facility Type
And User_482 click update after approve screen in Facility type
And User_482 Search facility type code in Update after approve screen Facility type
And User_482 select the searched facility type in Update after approve screen Facility type
And User_482 click facility details tab in searched record Update after approve screen Facility type
And User_482 click STP Facility Requirements
And User_482 check Customer Grading Checkbox
And User_482 Check Overwrite Grading
And User_482 check Committee Approval CheckBox
And User_482 check Credit authorization
And User_482 check Credit Review CheckBox
And User_482 check Issue Facility Offer CheckBox
And User_482 check Client Response CheckBox
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

@AT_FM_061
Scenario: System automatically approved all the level till facility creation
Given navigate to FMS application and login with valid credentials
And User_482 click Technical details
And User_482 click clear caches
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_FM_061
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
#And User_482 Click close icon in sent alert under WIFAK Application
And User_482 update test data set for AT_FM_061
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
And User_482 close Maintenance screen WIFAK Application 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 click search icon in Maintenance screen under WIFAK Application
And User_482 Search code in Maintenance screen in Application for financial facilities
#And User_482 Select searched record in Maintenance screen Application for financial facilities
And User_482 Validate Final approval of facility application under WIFAK Application

@AT_FM_062_postreq_01
Scenario: Uncheck Enable alert in fsm parameter
Given navigate to FMS param application and login with valid credentials
And User_482 click parameter Menu
And User_482 click Control record Sub Menu
And User_482 click Update After Approve in control record
And User_482 Uncheck the Enable Alerts check box
And User_482 click update button in Update after approve
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click approve screen in Control records
And User_482 click approve button in aaprove screen
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu

@AT_FM_062_prereq_Facilitype
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
And User_482 uncheck Automatically Approve Facility If Within Limits CheckBox
And User_482 click update button in Update after approve screen Facility type
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click approve screen in Facility type
And User_482 search code in approve screen Facility type 
And User_482 select searched code in approve screen Facility type
And User_482 click approve button in approve screen Facility type
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
@AT_FM_062_PreReq_01
Scenario: Clear caches in Fms application
Given navigate to FMS application and login with valid credentials
And User_482 click Technical details
And User_482 click clear caches
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
And User_482 update test data set for AT_FM_062
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
And User_482 update test data set for AT_FM_062
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
#send alert
#And User_482 Search the User id to send the alert for approve
#And User_482 Select the User id to send the alert for approve
#And User_482 click Send alert button in alert pop up screen
# defect approve not working
@AT_FM_062_Prereq_01
Scenario: Check Enable alert in fsm parameter
Given navigate to FMS param application and login with valid credentials
And User_482 click parameter Menu
And User_482 click Control record Sub Menu
And User_482 click Update After Approve in control record
And User_482 Check the Enable Alerts check box
And User_482 Uncheck the Auto Alerts Check box
And User_482 click update button in Update after approve
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click approve screen in Control records
And User_482 click approve button in aaprove screen
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
@AT_FM_062_01
Scenario: Active session for BM user to send alert 
Given navigate to FMS application and login with valid credentials for alert functionality
@AT_FM_062
Scenario: approve faclity in facility management
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 update test data set for AT_FM_062
And User_482 Click facilities management screen under WIFAK Application
And User_482 Click Maintenance screen in Facilities Management Under WIFAK Application
And User_482 Click Search Icon in Maintenance screen Facilities Management Under WIFAK Application
And User_482 Search Application Ref Num In Facilities Management Under WIFAK Application
And User_482 Select Searched Record In Facilities Management Under WIFAK Application
And User_482 Click Addtional Details Screen in Maintenance Screen Facilities Management under WIFAK Application
And User_482 Change Effective Date Until in Maintenance Screen Facilities Management under WIFAK Application
And User_482 Click Document details in Maintenance Screen Facilities Management under WIFAK Application
And User_482 Enter Solicitor Date Sent in Document Code1
And User_482 Enter Solicitor Date Received in Document Code1
And User_482 Enter Estimator Date Sent in Document Code1
And User_482 Enter Estimator Date Received in Document Code1
And User_482 Enter Custodian Date Sent in Document Code1
And User_482 Enter Solicitor Date Sent in Document Code2
And User_482 Enter Solicitor Date Received in Document Code2
And User_482 Enter Estimator Date Sent in Document Code2
And User_482 Enter Estimator Date Received in Document Code2
And User_482 Enter Custodian Date Sent in Document Code2
And User_482 Click Save Button In Facilities Management
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Search the User id to send the alert for approve_FacilitiesManagement
And User_482 Select the User id to send the alert for approve_FacilitiesManagement
And User_482 click Send alert button in alert pop up screen_FacilitiesManagement
@AT_FM_062_02
Scenario: approve the alert in BM user
Given navigate to FMS application and login with valid credentials for alert functionality
And User_482 Click open item in send alert
And User_482 Click approve button in send alert


@AT_FM_025

Scenario: SUPT180417 - Amana Bank-Issue in Corporate facility
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
And User_482 Update Test data set for AT_FM_025
And User_482 Select the New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Cif under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Cif under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Facilty type under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Faclity type under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the total limit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the total limit under Maintenance screen in REQUEST FOR FINANCIN
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
And User_482 Dismiss the alert
And User_482 close the Maintenance Screen
And User_482 Update Test data set for AT_FM_021
And User_482 click Approve Level 1 screen in Request for financing facilities under Request for financing
And User_482 Search code in Approve Level 1 screen in Request for financing facilities
And User_482 Select searched record in Approve level 1 screen Request for financing facilities
And User_482 click on the Customer Grading tab
And User_482 Select Decision in Approve level 1 under Request for financing facilities
And User_482 click approve button in approve screen
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 click on Ok button in Success Pop up Menu
#And User_482 Click on Ok button in Information Pop up Menu
#And User_482 Dismiss the alert

@AT_FM_018	

Scenario: TSR-ABAR170017
Given navigate to FMS sads application and login with valid credentials
And User_482 Update Test data set for AT_FM_021
And User_482 click on the parameters menu under sads1 application 
And User_482 click on the Account Restriction menu 
And User_482 click on the Maintenance Screen under Account Restriction menu
And User_482 click on the Code under Account Resctriction Maintenance Screen
And User_482 Enter the code under code 
And User_482 click on the discription 
And User_482 enter the discription
And User_482 selects the root under Application field
And User_482 check the root flag under Application feild
And User_482 selects the root under Companies feild 
And User_482 check the root flag under Companies feild
And User_482 click on the search bar Under User Id
And User_482 enter the user id Under User Id
And User_482 selects the User Id Search rec
And User_482 click on the add icon under Restriction type 
And User_482 selects the restriction type from the dropdown
And User_482 click on the GL search icon 
And User_482 click on the Search GL code feild 
And User_482 enter the GL code 
And User_482 selects the searched GL Rec
And User_482 click on save button under Account Resctriction Maintenance Screen
And User_482 click on Ok button in Success Pop up Menu
Given navigate to FMS application and login with valid credentials
And User_482 click on the Reports Module under parameter
And User_482 click on the Customer Account Balance Screen under Reports Module 
And User_482 click on the GL code under Account Balance Screen
And User_482 enter the GL code under Account Balance Screen
And User_482 Click on the Retrive button under Account Balance Screen


@AT_FM_027

Scenario: JAIZUP190094 - Facility request not showing at credit commit recommendation screen after latest build

Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
And User_482 Update Test data set for AT_FM_027
And User_482 Select the New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Cif under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Cif under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Facilty type under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Faclity type under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the total limit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the total limit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Product class under sublimit
And User_482 enter the product class under sublimit
And User_482 click on add button under sublimit
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
And User_482 Update Test data set for AT_FM_027
And User_482 click Approve Level 1 screen in Request for financing facilities under Request for financing
And User_482 Search code in Approve Level 1 screen in Request for financing facilities
And User_482 Select searched record in Approve level 1 screen Request for financing facilities
And User_482 click on the Customer Grading tab
And User_482 Select Decision in Approve level 1 under Request for financing facilities
And User_482 click approve button in approve screen
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 click on Ok button in Success Pop up Menu
And User_482 close the Approve Level 1 screen
And User_482 click on the Credit Review Module 
And User_482 click on the Search code Under Credit Review Module
And User_482 click enter the code under Credit Review Module
And User_482 click select the Retrived Rec under Credit Review Module
And User_482 click on the Credit Committe Recommendation 
And User_482 click on Recommedation bar Under Credit Committe Recommendation Tab
And User_482 click on the Add button under Recommendation Bar
And User_482 click on the Record 
And User_482 click on the Cr Recommendation DropDown
And User_482 select the Recommended for approval value from the DropDown
And User_482 click on the Credit Review button
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 click on Ok button in Success Pop up Menu
And User_482 close the Credit Review
And User_482 click on the Approval Committe Recommendation module 
And User_482 click on the Search code under Approval Committe Recommendation module
And User_482 enter the code under Approval Committe Recommendation module
And User_482 select the Retrived Rec under Approval Committe Recommendation module
And User_482 vaidate the Status is Showing should be under Reviewed

#@temp
#
#Given navigate to FMS application and login with valid credentials
#And User_482 click Technical details
#And User_482 click clear caches
#And User_482 Click on Ok button in Success Pop up Menu
#And User_482 Click on WIFAK Application Main Menu
#And User_482 Click on WIFAK Application Sub Menu
#And User_482 Click Application for financial facilities 
#And User_482 Click Maintenance screen in WIFAK Application sub menu
#And User_482 update test data set for AT_FM_021
#And User_482 Select Application For field in Maintenace Screen under WIRAK Application
#And User_482 enter the CIF No in main info tab under WIRAK Application
#And User_482 enter the facility type in main info tab under WIRAK Application
#And User_482 enter the country of financing in main info tab under WIRAK Application
#And User_482 enter facility rating in main info tab under WIRAK Application
#And User_482 clicks on the additional details tab under WIRAK Application	
#And User_482 Enter total value under additional details tab in WIFAK Application
#And User_482 Enter offer Expiration in Additional details under WIFAK Application
#And User_482 click Limit Details tab in WIFAK Application
#And User_482 click add icon in limit details under WIFAK Application
#And User_482 select the product class in limit details under WIFAK Application
#And User_482 check clean checkbox options in limit details under WIFAK Application
#And User_482 click add icon in limit details popup under WIFAK Application
#And User_482 click document details tab under WIFAK Application
#And User_482 click save button in Main Info tab under WIFAK Application
#And User_482 Click on Ok button in Confirm Pop up Menu
#And User_482 Get the Code in Success Pop up Menu under WIFAK Application
#And User_482 Click on Ok button in Success Pop up Menu
#And User_482 click Validate button in Main Info tab under WIFAK Application
#And User_482 click on Ok button in Confirm Pop up Menu
#And User_482 click on Ok button in Confirm Pop up Menu
#And User_482 click on Ok button in Success Pop up Menu
#And User_482 close the Maintenence screen under WIRAK Application
#And User_482 update test data set for AT_FM_021
#And User_482 Click Approve Level 1 screen in application for financial facilities under WIFAK Application
#And User_482 Search code in Approve Level 1 screen in Application for financial facilities
#And User_482 Select searched record in Approve level 1 screen Application for financial facilities
#And User_482 Select Decision in Approve level 1 under WIFAK Application
#And User_482 click submit button in approve level 1 under WIFAK Application
#And User_482 Click on Ok button in Confirm Pop up Menu
#And User_482 Click on Ok button in Confirm Pop up Menu
#And User_482 Click on Ok button in Confirm Pop up Menu
#And User_482 Close the Approval 1 Screen

@AT_FM_021
Scenario: TSR-SUPT170188
Given navigate to FMS application and login with valid credentials
And User_482 Click on REQUEST FOR FINANCIN under FMS application
And User_482 click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User_482 Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User get the system date
And User_482 Update Test data set for AT_FM_021
And User_482 Select the New Request in Reason For Submission under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Cif under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Cif under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Facilty type under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the Faclity type under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the total limit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 enter the total limit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on Add button in Disbursement or Sublimit under Maintenance screen in REQUEST FOR FINANCIN
And User_482 click on the Product class under sublimit
And User_482 enter the product class under sublimit
And User_482 click on add button under sublimit
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
And User_482 Update Test data set for AT_FM_021
And User_482 click Approve Level 1 screen in Request for financing facilities under Request for financing
And User_482 Search code in Approve Level 1 screen in Request for financing facilities
And User_482 Select searched record in Approve level 1 screen Request for financing facilities
And User_482 click on the Customer Grading tab
And User_482 Select Decision in Approve level 1 under Request for financing facilities
And User_482 click approve button in approve screen
And User_482 click on Ok button in Confirm Pop up Menu
And User_482 click on Ok button in Success Pop up Menu
And User_482 close the Approve Level 1 screen
