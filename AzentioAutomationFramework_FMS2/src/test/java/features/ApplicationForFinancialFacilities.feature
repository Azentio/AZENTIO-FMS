Feature: To Test the FMS application
@AT_AFF_003
Scenario: SBI190056 - Error while approving an application - CC1RF00P1
#This test case also cover the functionality of test case no AT_AFF_009
Given navigate to FMS application2 and login with valid credentials
And Update test data for test case no AT_AFF_003
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User select the application for dropdown as new facility
And User enter the CIF No in main info tab
And User enter the facility type in main info tab
And User enter the country of financing in main info tab
And User enter the facility rating in main info tab
And User clicks on the additinal details tab
And User enter the total value in additional info tab
And User enter the expire date in additional info tab
And User clicks the limit details tab
And User clicks the add new record button in limit details tab
And User enter the product class details
And User retrive the one account number
And User clicks on the add button
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks the validate button

@AT_AFF_023
Scenario: ABEI190241 - Customization and Missing Element Issue on FMS
#Prerequestics: Make sure the Facility rating field as optional field
Given navigate to FMS application2 and login with valid credentials
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User Click on Advanced Options under Maintenance Screen
And User Click on Settings under Advanced Options in Maintenance Screen
And User Click on Icon in Facility Rating under Settings Screen
And User Click on Maintenance in Icon under Settings Screen
And User Click on Required Field in Customization Details For Facility Rating PopUp Menu
And User Click on Save Button under PopUp Menu
And User Click on Ok Button in Information PopUp Menu
And User Click on Close Button under Customization Details For Facility Rating PopUp Menu
And User Click on Icon in Facility Rating under Settings Screen
And User Click on Approve in Icon under Settings Screen
And User Click on Approve in Customization Details For Facility Rating PopUp Menu
And User Click on Ok Button in Information PopUp Menu
And User Click on Close Button under Customization Details For Facility Rating PopUp Menu
And User Click on Maintenance under Application For Financial Facilities
And User Click on Ok Button in Warning PopUp Menu
Then User Validate the Facility Rating Field is Displayed as Required


@AT_AFF_028
Scenario: ABSAI190175 - FMS_Application for Financial Facility > Maintenance > Final Validate - NullPoint Exception error
Given navigate to FMS application2 and login with valid credentials
And Update test data for test case no AT_AFF_028
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And User select the application for dropdown as new facility
And User enter the CIF No in main info tab
And User enter the facility type in main info tab
And User enter the country of financing in main info tab
And User enter the facility rating in main info tab
And User clicks on the additinal details tab
And User enter the total value in additional info tab
And User enter the expire date in additional info tab
And User clicks the limit details tab
And User clicks the add new record button in limit details tab
And User enter the product class details
And User retrive the one account number
And User clicks on the add button
And User move to the Document details tab
And User enter the Solicitor Name
And User enter the Estimator Name
And User clicks the save button
And User clicks the validate button


@AT_AFF_097
Scenario: Check a new field “Marketed By” is added under the Main Information Tab in Application for Financial Facilities – Maintenance screen
Given navigate to FMS application2 and login with valid credentials
And User clicks on the WIFAK_Application first link
And User clicks on the WIFAK_Application second link
And User clicks on the Application for financial facility link
And User clicks the maintanance menu
And Validate Marketed by field is displayed in Facility type details section


@AT_AFF_013
Scenario: ABSAI190417 - FMS 1704_Margin > Not accepting Negative Margin
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_AFF_013
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 select the Item in limit Details
And User_074 select the Maturity date in limit Details
And User_074 enter the Margin rate in limit Details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button

@AT_AFF_033
Scenario: AIBBI190316 - Formatting of JV under FMS
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_AFF_033
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 select the Item in limit Details
And User_074 select the Maturity date in limit Details
And User_074 enter the Margin rate in limit Details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button

@AT_AFF_082
Scenario: BIPL160092-Application for One Off Facility Creation
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_AFF_082
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 select the Item in limit Details
And User_074 select the Maturity date in limit Details
And User_074 enter the Margin rate in limit Details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button

@AT_AFF_083
Scenario: BIPL160092-Application for Revolving Facility Creation
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_AFF_083
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 select the Item in limit Details
And User_074 select the Maturity date in limit Details
And User_074 enter the Margin rate in limit Details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button


@AT_AFF_084
Scenario: BIPL160092-Application for Facility Creation with Cash & Non cash products
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_AFF_084
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as new facility
And User_074 enter the CIF No in main info tab
And User_074 enter the facility type in main info tab
And User_074 enter the country of financing in main info tab
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value in additional info tab
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 clicks the add new record button in limit details tab
And User_074 select the Item in limit Details
And User_074 select the Maturity date in limit Details
And User_074 enter the Margin rate in limit Details
And User_074 clicks on the product class add button
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button

@AT_RF_037
Scenario: TSR - AMANA180342
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_RF_037
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as decrease in main screen
And User_074 enter the input as Existing Facility Ref in main screen
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value under additional info tab
And User_074 validate the finance amount should be decresed based on total value
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User_074 double click on the product class under limit details
And User_074 click the clean flag under product calss in limit details tab
And User_074 click the edit button under product class in limit details tab
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button

@AT_RF_103
Scenario: TSR-SUPT170428
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_RF_103
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as decrease in main screen
And User_074 enter the input as Existing Facility Ref in main screen
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value under additional info tab
And User_074 validate the finance amount should be decresed based on total value
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User_074 double click on the product class under limit details
And User_074 click the clean flag under product calss in limit details tab
And User_074 click the edit button under product class in limit details tab
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button

@AT_RF_104
Scenario: TSR- AMANAUPG170108
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_RF_104
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as decrease in main screen
And User_074 enter the input as Existing Facility Ref in main screen
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value under additional info tab
And User_074 validate the finance amount should be decresed based on total value
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User_074 double click on the product class under limit details
And User_074 click the clean flag under product calss in limit details tab
And User_074 click the edit button under product class in limit details tab
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button


@AT_RF_115
Scenario: TSR - BTII170138
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_RF_115
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as decrease in main screen
And User_074 enter the input as Existing Facility Ref in main screen
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value under additional info tab
And User_074 validate the finance amount should be decresed based on total value
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User_074 double click on the product class under limit details
And User_074 click the clean flag under product calss in limit details tab
And User_074 click the edit button under product class in limit details tab
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button

@AT_FAID_007
Scenario: TSR-IIAB140131 - Cant decrease DD
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_FAID_007
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as decrease in main screen
And User_074 enter the input as Existing Facility Ref in main screen
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value under additional info tab
And User_074 validate the finance amount should be decresed based on total value
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User_074 double click on the product class under limit details
And User_074 click the clean flag under product calss in limit details tab
And User_074 click the edit button under product class in limit details tab
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button
Then User_074 clicks the Approve Level1 menu under Application for financial facilities
And User_074 enter the reference code in Approve level1
And User_074 double click on the retrieved reference code in Approve level1
And User_074 select the Approve level1 decision as Approve
When User_074 clicks on the Approve level1 submit button
Then User_074 clicks the Approve Level2 menu under Application for financial facilities
And User_074 enter the reference code in Approve level2
And User_074 double click on the retrieved reference code in Approve level2
And User_074 select the Approve level2 decision as Approve
When User_074 clicks on the Approve level2 submit button
Then User_074 clicks the Approve Level3 menu under Application for financial facilities
And User_074 enter the reference code in Approve level3
And User_074 double click on the retrieved reference code in Approve level3
And User_074 select the Approve level3 decision as Approve
When User_074 clicks on the Approve level3 submit button

@AT_FAID_008
Scenario: Check the new fields behavior in Increase/Decrease/Modification application
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_FAID_008
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as decrease in main screen
And User_074 enter the input as Existing Facility Ref in main screen
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value under additional info tab
And User_074 validate the finance amount should be decresed based on total value

@AT_FAID_009
Scenario: Create the Increase Application via API and check system increases the limit of the facility
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_FAID_009
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as decrease in main screen
And User_074 enter the input as Existing Facility Ref in main screen
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value under additional info tab
And User_074 validate the finance amount should be decresed based on total value
And User_074 enter the expire date in additional info tab
And User_074 clicks the limit details tab
And User_074 validate the Facility value and CV value should be changed same as decreased finance amount under limit details
And User_074 double click on the product class under limit details
And User_074 click the clean flag under product calss in limit details tab
And User_074 click the edit button under product class in limit details tab
And User_074 move to the Document details tab
And User_074 enter the Solicitor Name
And User_074 enter the Estimator Name
And User_074 clicks the save button
And User_074 clicks on the validate button

@AT_FAID_010
Scenario: Create the Decrease Application via API and check system decreases the limit of the facility
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_FAID_010
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 clicks on the Application for financial facility link
And User_074 clicks the maintanance menu under Application for financial facility
And User_074 select the application for dropdown as decrease in main screen
And User_074 enter the input as Existing Facility Ref in main screen
And User_074 enter the facility rating in main info tab
And User_074 clicks on the additional details tab
And User_074 enter the total value under additional info tab
And User_074 validate the finance amount should be decresed based on total value


@AT_AR_006
Scenario: The document check list will be editable in application Committee/Authorize/Reject Applications
Given navigate to FMS application and login with valid credentials
And User_074 get the test data for test case AT_AR_006
And User_074 clicks on the WIFAK_Application first link
And User_074 clicks on the WIFAK_Application second link
And User_074 Click on the Document validation link
And User_074 Click on Clear button in Document validation page
And User_074 Click on the existing record in document validation page
And User_074 Navigate to Limit details section in Document validation
And User_074 Select the existing row in limit details section
And User_074 Click on Document checklist button in Document validation
And User_074 Validate that user can able to edit values in Document validation page
