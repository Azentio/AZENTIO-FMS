Feature: User_608 to validate the Accounting Entries features

# WIFAK --> Application for Financial facility --> maintanance --> click Marketed By field lookup and display the values & define the value manualy
@AT_AE_009
Scenario: Check the field “Marketed By” is lookup field and it is editable and it is listing all the iMAL users and user can able to select any user id from the lookup or user can able to enter the user id manually

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AE_009
And User_608 clear the caches in FMS Application
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as new facility
And User_608 enter the CIF No in main info tab
And User_608 enter the facility type in main info tab
And User_608 enter the country of financing in main info tab
And User_608 enter the facility rating in main info tab
And User_608 validate Marketed By field should be displayed in main info tab
And User_608 click the marketed by lookup field and it should be display all the values
And User_608 define the marketed by value manualy in main info tab


# Change the non-mandatory field to mandatory field using shortcut key "CTRL+F2"
# Create a application in save and validate with the mandatory field
# Again change that mandatory field into Non-mandatory field using --> Header page --> Advance Options --> Settings 
@AT_AE_010
Scenario: Check this field is non-mandatory and user can able to make this field as mandatory using customization option

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AE_010
And User_608 clear the caches in FMS Application
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 give the shortcut key for customize menu in main info tab
And User_608 click the Marketed By spanner icon in main info tab
And User_608 click the maintanance option under Marketed By spanner icon in main info tab
And User_608 select the Required as Required under Marketed By Cutomize tab
And User_608 click the Save button under Marketed By Cutomize tab
And User_608 click the Close button under Marketed By Cutomize tab
And User_608 click the Marketed By spanner icon in main info tab
And User_608 click the Approve option under Marketed By spanner icon in main info tab
And User_608 click the Approve button in under Marketed By Cutomize tab
And User_608 click the Close button under Marketed By Cutomize tab
And User_608 give the shortcut key for customize menu in main info tab
And User_608 close the maintanance screen under Application for financial facility in WIFAK
And User_608 clear the caches in FMS Application
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as new facility
And User_608 enter the CIF No in main info tab
And User_608 enter the facility type in main info tab
And User_608 enter the country of financing in main info tab
And User_608 enter the facility rating in main info tab
And User_608 define the marketed by value manualy in main info tab
And User_608 clicks on the additional details tab
And User_608 enter the total value in additional info tab
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 clicks the add new record button in limit details tab
And User_608 enter the product class details
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for Accounting Entries Feature
And User_608 close the maintanance screen under Application for financial facility in WIFAK
And User_608 clear the caches in FMS Application
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 click the header page Advanced Options menu in FMS core 
And User_608 click the Settings option under Advanced Options menu in FMS core
And User_608 click the Marketed By spanner icon in main info tab
And User_608 click the maintanance option under Marketed By spanner icon in main info tab
And User_608 select the Required as Not Required under Marketed By Cutomize tab
And User_608 click the Save button under Marketed By Cutomize tab
And User_608 click the Close button under Marketed By Cutomize tab
And User_608 click the Marketed By spanner icon in main info tab
And User_608 click the Approve option under Marketed By spanner icon in main info tab
And User_608 click the Approve button in under Marketed By Cutomize tab
And User_608 click the Close button under Marketed By Cutomize tab
And User_608 click the header page Advanced Options menu in FMS core 
And User_608 click the Settings option under Advanced Options menu in FMS core
And User_608 close the maintanance screen under Application for financial facility in WIFAK


# Create one application in Wifak Application --> save & validate --> again open the application in Main screen --> do some changes(add marketed by) --> validate
@AT_AE_011

Scenario: Check user can able to save the record once the record is being retrieved

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_AE_011
And User_608 clear the caches in FMS Application
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as new facility
And User_608 enter the CIF No in main info tab
And User_608 enter the facility type in main info tab
And User_608 enter the country of financing in main info tab
And User_608 enter the facility rating in main info tab
And User_608 clicks on the additional details tab
And User_608 enter the total value in additional info tab
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 clicks the add new record button in limit details tab
And User_608 enter the product class details
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button for Accounting Entries Feature
And User_608 close the maintanance screen under Application for financial facility in WIFAK
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 get the test data for test case AT_AE_011
And User_608 clicks on the search button in Application for financial facility main screen
And User_608 search the reference code in Application for financial facility main screen
And User_608 double click searched record in Application for financial facility main screen
And User_608 define the marketed by value manualy in main info tab
And User_608 clicks on the validate button after made changes for Accounting Entries Feature



