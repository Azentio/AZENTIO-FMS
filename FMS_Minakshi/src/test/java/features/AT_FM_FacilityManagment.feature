Feature: Testing the Functionalities of Facility Management features
@AT_FM_001
Scenario: fms application
Given navigate to FMS application and login with valid credentials
And user click on the Johns Request module and after johns sub module
And user click on facility maintenance screen
And user click on update approve screen under facility maintenance
And user click on clear icon under the update approve screen 
And user retrive the record and update any field
And user click on additional detail
And user click on save button
And user click on aprrove screen
And user click on clear icon under the approve screen 
And user click on approve button


@AT_FM_002

Scenario: ABSAI190533 - FMS 1837_Facility Charge Collection JV_Wrong Debit Accounts_ABL_1014
Given navigate to FMS application and login with valid credentials
And User_482 click Technical details
And User_482 click clear caches
#And User_482 Click on Ok button in Success Pop up Menu
And User_482 Click on WIFAK Application Main Menu
And User_482 Click on WIFAK Application Sub Menu
And User_482 Click Application for financial facilities 
And User_482 Click Maintenance screen in WIFAK Application sub menu
#And User_482 update test data set for AT_FM_002
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
And User_482 click on the Charge Detail tab 
And User_482 click on the Rec under charge details 
And User_482 Check the Collect at FAC Approval flag 
And User_482 Check on the Allow Modify TFA Charge flag
And User_482 click on the ok btn under Charge details
And User_482 Click on Ok button in Success Pop up Menu
And User_482 click Limit Details tab in WIFAK Application
And User_482 Click Product Class details in Limit Details
#And User_482 click on the validate button
#And User_482 click on the Approve level1
#And User_482 click on the code under Approve level1
#And User_482 enter the facility code
#And User_482 double click on the retrived rec
#And User_482 select the decision under aprrove level1 feild 
#And User_482 click on th submit button under Aprrove level1
And User_482 click on the facilty maintenance screen 
And User_482 click on the maintenance under facilty maintenance screen
And User_482 click on the search button under facilty maintenance screen
And User_482 click on the application reference under search feild 
And User_482 enter the facilty code
And User_482 double click on the retrived rec under facility managment screen 
And User_482 click on the general voucher detail
And User_482 validate the deatils are showing correctly
