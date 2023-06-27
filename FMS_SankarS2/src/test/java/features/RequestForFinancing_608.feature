Feature: To check the Request For Financing Feature

@AT_RF_014
@AT_RF_014_IISParam
Scenario: IIS Param Application

Given navigate to IIS param application and login with valid credentials
And User_608 get the test data for test case AT_RF_014_IISParam
And User_608 clicks on the parameter feature in IIS Param application
And User_608 clicks on the product class module uder parameter feature
And User_608 clicks on the maintanance screen under product class module
And User_608 clicks on the search button in maintanance under product class
And User_608 enter the class code in maintanance under product class
And User_608 double click on the retrived data in maitanance under product class
And User_608 clicks on the additional information tab in maitanance under product class
And User_608 clicks on the repayment plan tab under additional information tab
And User_608 enter the value in number of payments under repayment plan tab
And User_608 select the dropdown in number of payments under repayment plan tab
Then User_608 clicks save the button in maintanance under product class

@AT_RF_014
@AT_RF_014_FMSCore
Scenario: IIS Param Application

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_RF_014_FMSCore
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
And User_608 clicks the save button
And User_608 clicks the limit details first row
And User_608 clicks the repayment plan button under limit details tab
Then User_608 validate the Rounding factor dropdown
Then User_608 validate the No of payments input




@AT_RF_141
Scenario: MFI190131 - Request for financing Screen, Search criteria CIF name is not showing properly and Arabic Translation is not correct

Given navigate to FMS application and login with valid credentials
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 click the search button under the maintanance screen in Request for Financing
And User_608 click the clear button under the maintanance screen in Request for Financing
Then User_608 validate the CIF short Name available under the maintanance screen in Request for Financing
And User_608 validate the CIF long Name available under the maintanance screen in Request for Financing

# Arabic language
@AT_RF_141_arabic
Scenario: MFI190131 - Request for financing Screen, Search criteria CIF name is not showing properly and Arabic Translation is not correct

Given navigate to FMS application and login with valid credentials
And User_608 click on the language option in FMS core
And User_608 click on the arabic under language option
And User_608 clicks on the Funding Request module in arabic
And User_608 clicks on the Request under Funding Request
And User_608 clicks on the Funding Request in Request under Funding Request
And User_608 click the approval committee under Funding Request in Request
Then User_608 validate the search grid value are displayed in arbic language under approval committee



@AT_FM_043
@AT_FM_043_FMSParam
Scenario: JAIZ150014 INABILITY TO CRAETE A LIMIT ON APPROVE FACILITY

Given navigate to FMS param application and login with valid credentials
And User_608 get the test data for test case AT_FM_043_FMSParam
And User_608 clicks on the Parameter module in FMS Param
And User_608 clicks on the Facility Type feature
And User_608 clicks on the update after approve menu in Facility type
And User_608 enter the code value in update after approve menu
And User_608 double click on the retrieved data in update after approve menu
And User_608 clicks on the facility details tab in update after approve
And User_608 clicks on the STP Facility Requirements option
And User_608 check the Customer Grading flag
And User_608 check the Overwrite Grading flag
And User_608 check the Credit Review flag
And User_608 uncheck the Committee Approval flag
And User_608 select the member as atleast one under Committee approval flag
And User_608 check the Credit Authorization flag
And User_608 check the Client Response flag
And User_608 check the Document Validation flag
And User_608 check the Final Approval flag
And User_608 check the Create Active Facility If Within Limits flag
And User_608 Check the Automatically Approve Facility If Within Limits flag
And User_608 check the Issue Facility Offer flag
When User_608 clicks on the Update button
And User_608 after the update go to the Approve menu
And User_608 enter the code value in Approve menu
And User_608 double click on the retrieved data in Approve menu
When User_608 clicks on the Approve button in Approve menu under Facility Type

@AT_FM_043
@AT_FM_043_FMSCore
Scenario: JAIZ150014 INABILITY TO CRAETE A LIMIT ON APPROVE FACILITY

Given navigate to FMS application and login with valid credentials
And User_608 get the test data for test case AT_FM_043_FMSCore
And User_608 clicks on the Request module
And User_608 clicks on the Request Financing under Request module
And User_608 clicks on the Request for Financing under Request Financing feature
And User_608 clicks on the Maintanance screen under Request for Financing
And User_608 select the Reason for submission under main screen in Request for Financing
And User_608 enter the CIF no in main screen under Request for Financing
And User_608 enter the facility type in main screen under Request for Financing
And User_608 enter the total limit in main screen under Request for Financing
And User_608 move to the sublimit tab in main screen under Request for Financing
And User_608 click the add new button in sublimit tab under main screen in Request for Financing
And User_608 enter the product class in limit details tab under sublimit tab
And User_608 enter the margin value in limit details tab under sublimit tab
And User_608 click the add button in limit details tab under sublimit tab
When User_608 click the Save button in main screen under Request for Financing
And User_608 click the Validate button in main screen Request for Financing
Then User_608 click the approve level1 under Request for Financing
And User_608 get the test data for test case AT_FM_043_FMSCore
And User_608 enter the request code in approve level1 under Request for Financing
And User_608 double click on the first row in approve level1 under Request for Financing
And User_608 move to customer grading tab in approve level1 under Request for Financing
And User_608 select the approve level1 recommendation decision in approve level1 under Request for Financing
And User_608 select the decision forward to as approval committee in approve level1 under Request for Financing
And User_608 select the approval committee in approve level1 under Request for Financing
And User_608 click the Approve button in approve level1 under Request for Financing
Then User_608 click the Approval committee recommendation under Request for Financing
And User_608 enter the code in Approval committee recommendation under Request for Financing
And User_608 double click on the first row in Approval committee recommendation under Request for Financing
And User_608 move to credit committee recommendation tab in approval committee under Request for Financing
And User_608 click the Recommendation division in credit committee under approval committee
And User_608 click the plus icon in Recommendation division under credit committee
And User_608 select the Recommendation dropdown in Recommendation division under credit committee
When User_608 click the Recommendation button under Approval committee recommendation



