Feature: Testing the functionalities of FMS Application

@854862 @AT_RF_134
Scenario: JAIZUP190253 - error in approve commit recommendation
#Create Collateral 
Given navigate to FMS application and login with valid credentials
And Update test data for test case no AT_RF_134 for Collateral
Then click on the Collateral Management tab
Then click on the Maintanace screen of Collateral Management
Then enter the Collateral type under main information in Collateral Management
Then enter the valid from date under main information in Collateral Management
Then enter the valid to date under main information in Collateral Management 
Then enter the brief description under main information in Collateral Management
Then enter the long description under main information in Collateral Management
Then enter the Collateral currency under main information in Collateral Management
Then click on the Collateral cash details tab in Collateral Management 
Then click on the add new icon under Collateral cash details tab
Then click on the additional reference under Collateral cash details tab
Then select cy value under additional reference
Then enter the amount value under Collateral cash details tab
Then click on the save button under Collateral Management 
Then click on the Approve screen under Collateral Management
Then click on the clear button under approve screen in Collateral Management
Then double click on the first row in approve screen
Then click on the approve button under Collateral Management 

#And Update test data for test case no AT_RF_134
#Then User click on the WIFAK_Application first tab
#Then User click on the WIFAK_Application second tab
#Then User navigate to the Application for financial facility 
#Then User clicks the maintanance menu under Application for financial facility
#Then select the application for dropdown as new facility
#Then In main info tab enter the CIF No 
#Then In main info tab enter the facility type 
#Then In main info tab enter the country of financing 
#Then In main info tab enter the facility rating 
#Then click on the additinal details tab
#Then In additional info tab enter the total value 
#Then In additional info tab enter the expire date 
#Then click on the limit details tab
#Then In limit details tab click on the add new record button 
#Then enter the maturity date
#Then enter the product class details
#Then click on the add button
#Then click on the Document details tab
#Then enter the Solicitor Name
#Then enter the Estimator Name
#Then click on the save button
#Then click on the validate button
#Then navigate to Approve level1 screen
#And open the record add decision for approval 
#Then approve Application for Financial Facilities record

@520516 @AT_FM_012
Scenario: TSR-AMANA140197 - The maturity date changed at level of FMS     
					is automatically reflected on CSM at accounts level.
 
Given navigate to FMS application and login with valid credentials
And Update test data for test case no AT_RF_12 for maturity date
Then User click on the WIFAK_Application first tab
Then User click on the WIFAK_Application first tab
Then User click on the WIFAK_Application second tab
Then User navigate to the Application for financial facility 
Then User clicks the update after approval under Application for financial facility
Then retrieve the financial facility approved record
Then click on the limit details tab
Then Edit the Maurity date
Then save the financial facility record for update after approval
Then navigate to Approve level1 screen
And open the record add decision for approval
Then approve Application for Financial Facilities record
Given navigate to CSM application and login with valid credentials
Then click on Accounts Module
Then Click on the general accounts under accounts
Then click on the Maintenance under general accounts
Then retrieve the record by searching cif number





@530717 @AT_FM_013
Scenario: JAIZUP190253 - check if the system created correct cash collateral
#Create Collateral 
Given navigate to FMS application and login with valid credentials
And Update test data for test case no AT_RF_13 for Collateral
Then click on the Collateral Management tab
Then click on the Maintanace screen of Collateral Management
Then enter the Collateral type under main information in Collateral Management
Then enter the valid from date under main information in Collateral Management
 Then enter the valid to date under main information in Collateral Management 
Then enter the brief description under main information in Collateral Management
Then enter the long description under main information in Collateral Management
Then enter the Collateral currency under main information in Collateral Management
Then click on the Collateral cash details tab in Collateral Management 
Then click on the add new icon under Collateral cash details tab
Then click on the additional reference under Collateral cash details tab
Then select cy value under additional reference
Then enter the amount value under Collateral cash details tab
Then click on the save button under Collateral Management 
Then click on the Approve screen under Collateral Management
Then click on the clear button under approve screen in Collateral Management
Then double click on the first row in approve screen
Then click on the approve button under Collateral Management


@530719 @AT_FM_014
Scenario: TSR-GABUP150013-update after approve of Cash collateral should allow changing the Cash collateral amount 
#Create Collateral 
Given navigate to FMS application and login with valid credentials
And Update test data for test case no AT_RF_14 for Collateral
Then click on the Collateral Management tab
Then click on the Maintanace screen of Collateral Management
Then enter the Collateral type under main information in Collateral Management
Then enter the valid from date under main information in Collateral Management
Then enter the valid to date under main information in Collateral Management 
Then enter the brief description under main information in Collateral Management
Then enter the long description under main information in Collateral Management
Then enter the Collateral currency under main information in Collateral Management
Then click on the Collateral cash details tab in Collateral Management 
Then click on the add new icon under Collateral cash details tab
Then click on the additional reference under Collateral cash details tab
Then select cy value under additional reference
Then enter the amount value under Collateral cash details tab
Then click on the save button under Collateral Management 
Then click on the Approve screen under Collateral Management
Then click on the clear button under approve screen in Collateral Management
Then double click on the first row in approve screen
Then click on the approve button under Collateral Management 
Then click on update after approval under Collateral Management
Then retrieve the cash collateral approved record
Then click on the Collateral cash details tab under update after approval under Collateral Management
Then modify the amount value under Collateral cash details tab
Then click on the save button under update after approval under Collateral Management 
Then click on the Approve screen under Collateral Management
Then retrieved the cash collateral record
Then click on the approve button under Collateral Management 


@641509 @AT_RF_048
Scenario: TSR - FIBSI180079 - Collateral Management Create and verify
#Create Collateral 
Given navigate to FMS application and login with valid credentials
And Update test data for test case no AT_RF_048 
Then click on the Collateral Management tab
Then click on the Maintanace screen of Collateral Management
Then enter the Collateral type under main information in Collateral Management
Then enter the valid from date under main information in Collateral Management
Then enter the valid to date under main information in Collateral Management 
Then enter the brief description under main information in Collateral Management
Then enter the long description under main information in Collateral Management
Then enter the Collateral currency under main information in Collateral Management
Then click on the Collateral cash details tab in Collateral Management 
Then click on the add new icon under Collateral cash details tab
Then click on the additional reference under Collateral cash details tab
Then select cy value under additional reference
Then enter the amount value under Collateral cash details tab
Then click on the save button under Collateral Management 
Then click on the Approve screen under Collateral Management
Then click on the clear button under approve screen in Collateral Management
Then double click on the first row in approve screen
Then click on the approve button under Collateral Management 
Then move to verify tab under collateral Management


@649979 @AT_RF_049
Scenario: TSR - BLME180008 - System validation is available upon inputting the facility effective until date as holiday.
Given navigate to FMS application and login with valid credentials
Then User click on the WIFAK_Application first tab
Then User click on the WIFAK_Application second tab
And Update test data for test case no AT_RF_049
Then click on the Facilities Management under WIFAK Application
Then click on the Update After Approve under Facilities Management
Then click on the clear under Update After Approve in Facilities Management
Then double click on the first row under Update After Approve in Facilities Management
Then click on the Additional Details Facilities Management
Then enter holiday date in Effective Until field and validate it

@642011	@AT_RF_047
Scenario: BMOUPI180163 - Limit Creation
Given navigate to FMS application and login with valid credentials
Then Navigate to the Request Tab 
Then click on the request financing under Request
Then click on the request for financing under request financing
Then click on the maintenence under request for financing
And Update test data for test case no AT_RF_047
Then select reason for submission 
Then enter the customer details
Then enter the facility type code details
Then enter the total limit under global limit
Then click on the Disbursement Sublimit under maintenance screen
Then click on the Add New Row under Disbursement Sublimit
Then enter the product class values in product searchbox
Then enter the yield values
Then click on the add buttonss
Then save the record of request for financing
Then Validate the record of request for financing
Then move to Approve Level1 under request for financing
Then add decision forword and select Limit Creation
Then Approve the record of request for financing
Then move to Limit Creation under request for financing
Then retrieve the record under limit creation
Then Validate the status limit created