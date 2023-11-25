Feature: Testing the functionalities of Collateral Management WIFAK Application
#pre-req Im Collateral type create one custom field withou decimal
@AT_CM_025
Scenario: AIBBI190411 - Collateral Custom fields decimal places
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Collateral Management WIFAK Application
And User_482 Click Maintenance Screen in Collateral Management_WIFAK
And User_482 Update Test data set id for AT_CM_025
And User_482 Enter Collateral Type In Collateral Management_WIFAK
And User_482 Enter Valid From date In Collateral Management_WIFAK
And User_482 Enter Valid To date In Collateral Management_WIFAK
And User_482 Enter Brief Description In Collateral Management_WIFAK
And User_482 Enter Long Description In Collateral Management_WIFAK
And User_482 Enter Collateral Currency In Collateral Management_WIFAK
And User_482 Click Custom Tab In Collateral Management_WIFAK
Then User_482 Enter test Custom field and Validate system does not allow decimal field

@AT_CM_026_01
Scenario: Collateral Record Creation
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Collateral Management WIFAK Application
And User_482 Click Maintenance Screen in Collateral Management_WIFAK
And User_482 Update Test data set id for AT_CM_026
And User_482 Enter Collateral Type In Collateral Management_WIFAK
And User_482 Enter Valid From date In Collateral Management_WIFAK
And User_482 Enter Valid To date In Collateral Management_WIFAK
And User_482 Enter Brief Description In Collateral Management_WIFAK
And User_482 Enter Long Description In Collateral Management_WIFAK
And User_482 Enter Collateral Currency In Collateral Management_WIFAK
And User_482 Enter CIF NO In Collateral Management_WIFAK
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click Additional Details In Collateral Management_WIFAK
And User_482 Enter FC Valuedsf in Additional Details 
And User_482 Enter Date Accepted In Additional Details
And User_482 Enter Valuation Date in Additional Details 
And User_482 Click Custom Tab In Collateral Management_WIFAK
Then User_482 Enter test Custom field In Collateral Management_WIFAK
And User_482 Click Property Owner Details Tab In Collateral Management_WIFAK
And User_482 Click add Icon in Property Owner Details Tab Collateral Management_WIFAK
And User_482 Enter Name In Property Owner Details Collateral Management_WIFAK
And User_482 Enter Country Code In Property Owner Details Collateral Management_WIFAK
And User_482 Click Save Button In Collateral Management_WIFAK
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Get the Code in Success Pop up Menu under WIFAK Application for Collateral Management
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click close icon in sent alert under WIFAK Application
And User_482 Click Approve Sub Menu In Collateral Management WIFAK Application
And User_482 Update Test data set id for AT_CM_026
And User_482 Close Maintenance tab in collateral management under WIFAK application
And User_482 Search Code In Approve Screen Collateral Management WIFAK Application
And User_482 Select Searched Code In Approve Screen Collateral Management WIFAK Application
And User_482 Click Approve Button In Approve Screen Collateral Management WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu

@AT_CM_026
Scenario: MFI190185 - Unable to update Property Owner Details in Collateral Management from Update after Approve screen
Given navigate to FMS application and login with valid credentials
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Collateral Management WIFAK Application
And User_482 Click Udpadte After Approve In Collateral Management WIFAK Application
And User_482 Update Test data set id for AT_CM_026
And User_482 Search Code in Udpadte After Approve Under Collateral Management WIFAK Application
And User_482 Select Searched Code in Update After Approve Under Collateral Management WIFAK Application
And User_482 Click Property Owner Details in Update After Approve Screen Collateral Management WIFAK Application
And User_482 Click add icon In Update After Approve property owner details
And User_482 Enter Name2 In Property Owner Details Collateral Management_WIFAK
And User_482 Enter Country Code2 In Property Owner Details Collateral Management_WIFAK
And User_482 Click Save Button In Update After Approve Collateral Management_WIFAK
And User_482 Click add icon In property owner details
And User_482 Click add icon In property owner details
And User_482 Enter Name In Property Owner Details Collateral Management_WIFAK
And User_482 Enter Country Code In Property Owner Details Collateral Management_WIFAK
And User_482 Delete the Row and Validate
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click Approve Sub Menu In Collateral Management WIFAK Application
And User_482 Search Code In Approve Screen Collateral Management WIFAK Application
And User_482 Select Searched Code In Approve Screen Collateral Management WIFAK Application
And User_482 Click Approve Button In Approve Screen Collateral Management WIFAK Application
And User_482 Click on Ok button in Confirm Pop up Menu
And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click Maintenance Screen in Collateral Management_WIFAK
And User_482 Search Code In Maintenance Screen Collateral Management WIFAK Application
And User_482 Select Searched Code In Maintenance Screen Collateral Management WIFAK Application
And User_482 Click Property Owner Details Tab In Collateral Management_WIFAK



