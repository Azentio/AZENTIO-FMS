Feature: To check the Facility Application - Increase/Decrease features


## FMS Param --> Country limit --> maintanance create new one-- Save  && go to Approve --> check available limit field is visible --> approve it
## Update after approve --> update the limit value in negative and validate the error message && possitive value and update.
## Approve menu --> validate limit and available limit & approve it
## Every time change the Country code in excel sheet
@AT_FAID_001
Scenario: AIBBI200213 - Country Limit Could be Increase but not decrease

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_FAID_001
And User_608 clicks on the Parameter module in FMS Param
And User_608 click Country limit module under Parameter in FMS Param
And User_608 click the Maintanance menu under Country limit in FMS Parameter
And User_608 enter the Country code in Maintanance under Country limit module
And User_608 enter the Currency code in Maintanance under Country limit module
And User_608 enter the limit value in Maintanance under Country limit module
When User_608 click the save button in Maintanance under Country limit module
And User_608 click the Approve menu under Country limit in FMS Parameter
And User_608 enter the Country code in searchgrid under Approve menu in Country limit module
And User_608 double click the first row in searchgrid under Approve menu in Country limit module
Then User_608 validate the Available limit field is available under Approve menu in Country limit module
When User_608 click the Approve button under Approve menu in Country limit module
And User_608 click the Update After Approve menu under Country limit in FMS Parameter
And User_608 enter the Country code in searchgrid under Update After Approve menu in Country limit module
And User_608 double click the first row in searchgrid under Update After Approve menu in Country limit module
And User_608 update the negative limit value under Update After Approve menu in Country limit module
Then User_608 validate Error message should be displayed under Update After Approve menu in Country limit module
And User_608 update the possitive limit value under Update After Approve menu in Country limit module
When User_608 click the Update button under Update After Approve menu in Country limit module
And User_608 click the Approve menu under Country limit in FMS Parameter
And User_608 enter the Country code in searchgrid under Approve menu in Country limit module
And User_608 double click the first row in searchgrid under Approve menu in Country limit module
Then User_608 validate limit value should be updated in Approve menu under Country limit module
Then User_608 validate Available limit should be updated in Approve menu under Country limit module
When User_608 click the Approve button under Approve menu in Country limit module


## FMS Param --> Control Records --> update after approve --> check the 'General limit by CIF' flag --> update and approve
## FMS Param --> Facility Type --> Update after approve --> facility details tab --> STP facility --> All flags should be checked --> update and approve
@AT_FAID_002
@AT_FAID_002_FMSParam
Scenario: AIBBI200088 - Unable to Decrease FX Nominal Limit

Given navigate to FMS param application and login with valid credentials
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the control records feature under Parameter
And User_608 clicks on the update after approve menu under control records
And User_608 check the General limit by CIF flag in update after approve menu under control records
And User_608 clicks on the update button under Update after approve menu in control records
And User_608 clicks on the approve menu under control records
When User_608 clicks on the approve button in Approve menu under control records
And User_608 clicks on the Facility Type feature
And User_608 get the test data for test case AT_FAID_002
And User_608 clicks on the update after approve menu in Facility type
And User_608 enter the code value in update after approve menu
And User_608 double click on the retrieved data in update after approve menu
And User_608 clicks on the facility details tab in update after approve
And User_608 clicks on the STP Facility Requirements option
And User_608 check the Customer Grading flag
And User_608 check the Overwrite Grading flag
And User_608 check the Credit Review flag
And User_608 check the Committee Approval flag
And User_608 check the Credit Authorization flag
And User_608 check the Issue Facility Offer flag
And User_608 check the Client Response flag
And User_608 check the Document Validation flag
And User_608 check the Final Approval flag
And User_608 check the Create Active Facility If Within Limits flag
And User_608 Check the Automatically Approve Facility If Within Limits flag
When User_608 clicks on the Update button under update after approve menu in Facility type
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type


@AT_FAID_002
@AT_FAID_002_FMSCore
Scenario: AIBBI200088 - Unable to Decrease FX Nominal Limit

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FAID_002
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
And User_608 enter the FX Nominal limit in additional info tab
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 clicks the add new record button in limit details tab
And User_608 enter the product class details
And User_608 clicks on the product class add button
And User_608 move to the Document details tab
And User_608 enter the Solicitor Name
And User_608 enter the Estimator Name
And User_608 clicks the save button
And User_608 clicks on the validate button
And User_608 close the maintanance screen under Application for financial facility in WIFAK
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_FAID_002
And User_608 enter the reference code in Approve level1
And User_608 double click on the retrieved reference code in Approve level1
And User_608 select the Approve level1 decision as Approve
When User_608 clicks on the Approve level1 submit button
Then User_608 clicks the Approve Level2 menu under Application for financial facilities
And User_608 enter the reference code in Approve level2
And User_608 double click on the retrieved reference code in Approve level2
And User_608 select the Approve level2 decision as Approve
When User_608 clicks on the Approve level2 submit button
Then User_608 clicks the Approve Level3 menu under Application for financial facilities
And User_608 enter the reference code in Approve level3
And User_608 double click on the retrieved reference code in Approve level3
And User_608 select the Approve level3 decision as Approve
When User_608 clicks on the Approve level3 submit button

Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 get the facility management code in Facilities Management Maintanance under WIFAK Application

And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as decrease in main screen
And User_608 enter the input as Existing Facility Ref in main screen
And User_608 enter the facility rating in main info tab
And User_608 clicks on the additional details tab



@AT_FAID_003
Scenario: MAI200094 - FMS LG increase error

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FAID_003
And User_608 clear the caches in FMS Application
And User_608 clicks on the WIFAK_Application first link
And User_608 clicks on the WIFAK_Application second link
And User_608 clicks on the Application for financial facility link
And User_608 clicks the maintanance menu under Application for financial facility
And User_608 select the application for dropdown as increase in main screen
And User_608 enter the input as Existing Facility Ref in main screen
And User_608 enter the facility rating in main info tab
And User_608 clicks on the additional details tab
And User_608 enter the total value in additional info tab
And User_608 enter the expire date in additional info tab
And User_608 clicks the limit details tab
And User_608 double click on the product class under limit details
And User_608 enter the facility value product class tab in limit details
And User_608 click the clean flag under product calss in limit details tab
And User_608 click the edit button under product class in limit details tab



@AT_FAID_006
Scenario: TSR-;IIAB150039 - Cant decrease DD 2608 on branch 1050.

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FAID_002
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
And User_608 clicks on the validate button
Then User_608 clicks the Approve Level1 menu under Application for financial facilities
And User_608 get the test data for test case AT_FAID_002
And User_608 enter the reference code in Approve level1
And User_608 double click on the retrieved reference code in Approve level1
And User_608 select the Approve level1 decision as Approve
When User_608 clicks on the Approve level1 submit button
Then User_608 clicks the Approve Level2 menu under Application for financial facilities
And User_608 enter the reference code in Approve level2
And User_608 double click on the retrieved reference code in Approve level2
And User_608 select the Approve level2 decision as Approve
When User_608 clicks on the Approve level2 submit button
Then User_608 clicks the Approve Level3 menu under Application for financial facilities
And User_608 enter the reference code in Approve level3
And User_608 double click on the retrieved reference code in Approve level3
And User_608 select the Approve level3 decision as Approve
When User_608 clicks on the Approve level3 submit button
Then User_608 click the Facilities Management menu under WIFAK Application
And User_608 click the Maintanance in Facilities Management under WIFAK Application
And User_608 click the search button in Facilities Management Maintanance under WIFAK Application
And User_608 enter the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 double click the Application Ref number in Facilities Management Maintanance Search grid under WIFAK Application
And User_608 get the facility management code in Facilities Management Maintanance under WIFAK Application

And User_608 clicks on the Draw Down request module under WIFAK Application
And User_608 clicks on the Maintanance under Draw Down request in WIFAK Application
And User_608 enter the Facility Reference code in main screen under WIFAK Draw Down request
And User_608 select the draw down type in main screen under WIFAK Draw Down request
And User_608 enter the Description in main screen under WIFAK Draw Down request
And User_608 click on the draw down additional details tab
And User_608 select the product class in additional screen under WIFAK Draw Down request
And User_608 give the FC Amount in additional screen under WIFAK Draw Down request
And User_608 enter the value date in main screen under WIFAK Draw Down request
When User_608 click the save button under in maintanance under Draw Down request
Then User_608 click on the Verify link under Draw Down request
And User_608 enter the from facility code in searchgrid under Verify\Deny menu in Draw Down request
And User_608 double click on the code in verify under Draw Down request
When User_608 click on the verify button in Verify link under Draw Down request
And User_608 close the Verify\Denu menu tab in WIFAK Draw Down request
Then User_608 click on the Approve link under Draw Down request
And User_608 enter the from facility code in searchgrid under Approve menu in Draw Down request
And User_608 double click on the code in Approve under Draw Down request
When User_608 click on the Approve button in Approve link under Draw Down request
And User_608 close the Approve menu tab in WIFAK Draw Down request
Then User_608 click the Update After Approve menu under WIFAK Draw Down request
And User_608 enter the from facility code in searchgrid under Update After Approve menu in Draw Down request
And User_608 double click the any one record in Update After Approve under WIFAK Draw Down request
And User_608 click the Additional Details tab in Update After Approve under WIFAK Draw Down request
And User_608 decrease the FC Amount in Additional Details tab under Update After Approve in WIFAK Draw Down request
When User_608 click the Save button in Update After Approve under WIFAK Draw Down request
Then User_608 click on the Verify link under Draw Down request
And User_608 enter the from facility code in searchgrid under Verify\Deny menu in Draw Down request
And User_608 double click on the code in verify under Draw Down request
When User_608 click on the verify button in Verify link under Draw Down request
Then User_608 click on the Approve link under Draw Down request
And User_608 enter the from facility code in searchgrid under Approve menu in Draw Down request
And User_608 double click on the code in Approve under Draw Down request
When User_608 click on the Approve button in Approve link under Draw Down request



