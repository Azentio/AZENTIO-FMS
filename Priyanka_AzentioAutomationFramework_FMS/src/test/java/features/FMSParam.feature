Feature: To Test the FMS application login

@127776 @AT_DDR_014
Scenario: to check the new addional field for Group ID added under the Rates section in Corporate Package screen
Given navigate to FMS param application and login with valid credentials
And Update test data for test case no AT_DDR_014
Then move to the Parameters Tab
Then click on the corporate packages Tab under Parameters Tab
Then click on the Maintenance under corporate packages
Then enter the cif under corporate packages main screen
Then enter the rate under corporate packages main screen
Then enter the currency under corporate packages main screen
Then enter the limit under corporate packages main screen
Then click on the Group Limit Tab
Then click on the add new row under Group Limit Tab
Then enter GroupId under Group Limit Tab
Then enter Group Name under Group Limit Tab
Then enter Limit under Group Limit Tab

Then click on the Branches Tab
Then click on the add new row under Branches Tab
Then enter Branch code under Branches Tab

Then click on the Rates Tab
Then click on the add new row under Rates tab
Then enter product class under Rates Tab
Then verify Group ID field added under the Rates section 
Then enter Floating Rate under Rates Tab
Then enter Rate under Rates Tab

Then click on the Yield Details Tab
Then enter number of payments under Yield Details Tab
Then enter Margin under Yield Details Tab
Then Check the Fixed Flag under Yield Details Tab
Then enter Cape Rate under Yield Details Tab
Then save the yeild details


@127777 @AT_DDR_015
Scenario: to check the fields added under the Yield Details section in Corporate Package screen
Given navigate to FMS param application and login with valid credentials
And Update test data for test case no AT_DDR_014
Then move to the Parameters Tab
Then click on the corporate packages Tab under Parameters Tab
Then click on the Maintenance under corporate packages
Then enter the cif under corporate packages main screen
Then enter the rate under corporate packages main screen
Then enter the currency under corporate packages main screen
Then enter the limit under corporate packages main screen
Then click on the Group Limit Tab
Then click on the add new row under Group Limit Tab
Then enter GroupId under Group Limit Tab
Then enter Group Name under Group Limit Tab
Then enter Limit under Group Limit Tab
Then click on the Branches Tab
Then click on the add new row under Branches Tab
Then enter Branch code under Branches Tab
Then click on the Rates Tab
Then click on the add new row under Rates tab
Then enter product class under Rates Tab
Then verify Group ID field added under the Rates section 
Then enter Floating Rate under Rates Tab
Then enter Rate under Rates Tab
Then click on the Yield Details Tab
Then enter number of payments under Yield Details Tab
Then enter Margin under Yield Details Tab
Then Check the Fixed Flag under Yield Details Tab
Then enter Cape Rate under Yield Details Tab
Then save the yeild details

@AT_CM_012
Scenario: TSR - RIDB180201 - Create an application with below details- inward lc or outward lc
Given navigate to FMS application and login with valid credentials
And Update test data for test case no AT_CM_012 for Collateral
Then click on the Collateral Management tab
Then click on the Maintanace screen of Collateral Management
Then enter the Collateral type under main information in Collateral Management
Then enter the valid from date under main information in Collateral Management
Then enter the valid to date under main information in Collateral Management 
Then enter the brief description under main information in Collateral Management
Then enter the long description under main information in Collateral Management
Then enter the Collateral currency under main information in Collateral Management
Then click on the Additional Details tab in Collateral Management 
Then enter the FC Valuedsf value under Additional Details tab
Then enter the Date Excepted under Additional Details tab
Then click on the add new icon under Collateral cash details tab
Then click on the additional reference under Collateral cash details tab
Then select cy value under additional reference
Then enter the amount value under Collateral cash details tab
Then click on the save button under Collateral Management 
Then click on the Approve screen under Collateral Management
Then click on the clear button under approve screen in Collateral Management
Then double click on the first row in approve screen
Then click on the approve button under Collateral Management 
Given navigate to FMS application and login with valid credentials
And Update test data for test case no 668484
Then User click on the WIFAK_Application first tab
Then User click on the WIFAK_Application second tab
Then User navigate to the Application for financial facility 
Then User clicks the maintanance menu under Application for financial facility
Then select the application for dropdown as new facility
Then In main info tab enter the CIF No 
Then In main info tab enter the facility type 
Then In main info tab enter the country of financing 
Then In main info tab enter the facility rating 
Then click on the additinal details tab
Then In additional info tab enter the total value 
Then In additional info tab enter the expire date 
Then click on the limit details tab
Then In limit details tab click on the add new record button 
Then enter item details for Import LC
Then enter the Type
Then enter the maturity date
#Then enter the product class details
Then click on the clean flag
Then click on the add button
#Then click on the Collateral details tab
Then click on the Document details tab
Then enter the Solicitor Name
Then enter the Estimator Name
Then click on the save button
Then click on the validate button
Then move to the Approval level1
Then retrieve the record of Application for financial facility 
Then add the decision and Approve the record

