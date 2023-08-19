Feature: Testing the functionalities of SADS , CSM Application
@925755
Scenario: System should open the more score window upon clicking on More scores button
Given navigate to FMS application and login with valid credentials
Then navigate to 360Degrees View screen
Then Click on More Scores button and check the system is opening the more scores window
And logout from the application

@964142
Scenario: BMO190221 - Exception error in Production - FMS
#Given navigate to FMS param application and login with valid credentials
#And user update test data set id for DS964142
#Then navigate to Paramters tab
#Then navigate to Facility Custom Fields screen
#Then Approve Facility Custom Fields record
#And logout from the application
Given navigate to FMS application and login with valid credentials
And user update test data set id for DS964142

Then navigate to REQUEST FOR FINANCIN  tab
Then navigate to Request For Financing Maintenance Screen
Then enter all the details for Request For Financing Screen

@903740
Scenario: BMO190221 - Exception error in Production - FMS
Given navigate to IIS FMS Param application and login with valid credentials
Then navigate to Paramters tab
And user update test data set id for DS903740
Then Click on Product class under Parameters
Then Click on Maintenance under Product class  Sub Menu in Parameters 
Then Click on Search and search Class Code
Then Open the suggested record of Product class
Then Click on Profit Calculation Menu
And Validate Floating rate checkbox is checked 
And logout from the application
#Given navigate to FMS application and login with valid credentials
#Then navigate to REQUEST FOR FINANCIN  tab
#Then navigate to Request For Financing Maintenance Screen
#Then enter all the details for Request For Financing Screen
#And logout from the application


@836785
Scenario: MFI180040 - user unable to view the transactions in LIST screen for attached screen shots in FMS
Given navigate to FMS application and login with valid credentials
And user update test data set id for DS836785
Then navigate to Collateral Management screen
Then navigate to Revaluation tab
Then navigate to RevaluationReports tab
Then navigate to Deal Collateral Valuation Report screen
And enter Deal Collateral Valuation Report screen input fields
Then Retrieve and validate the report
And logout from the application

@802878 
Scenario: Create validate Application for Financial Facilities   
Given navigate to FMS application and login with valid credentials
And user update test data set id for DS802878
Then navigate to Wifak Application tab
Then navigate to Application for financial facilities tab
Then navigate to Application for financial facilities Maintenance screen
And Create record for Application for Financial Facilities
Then save and validate the Application for Financial Facilities record 

@841275
Scenario: Approve Application for Financial Facilities   
Given navigate to FMS application and login with valid credentials
And user update test data set id for DS841275
Then navigate to Wifak Application tab
Then navigate to Application for financial facilities tab
Then navigate to Application for financial facilities Maintenance screen
And Create record for Application for Financial Facilities
Then save and validate the Application for Financial Facilities record 
Then navigate to Approve level1 reject screen
And open the record add decision 
Then approve the Application for Financial Facilities record

@668484
Scenario: TSR - RIDB180201 - Create an application with below details- inward lc or outward lc
#In This test case we need to use Facility type as revolving type 
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


@671118
Scenario: TSR - CDMI180064 - Create an application 
#After validation change user run date and then approve the record
Given navigate to FMS application and login with valid credentials
And Update test data for test case no 671118
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
Then enter the maturity date
Then enter the product class details
Then click on the clean flag
Then click on the add button
Then click on the Document details tab
Then enter the Solicitor Name
Then enter the Estimator Name
Then click on the save button
Then click on the validate button
Then move to the Approval level1
Then retrieve the record of Application for financial facility 
Then add the decision and Approve the record
Then move to Facility Closure Request maintenance and save the record
Then move to Facility Closure Request Approve screen and Approve the record

@670424
Scenario: TSR - BTII180049 - Create an application Define product class Specify the eco sector code
Given navigate to FMS application and login with valid credentials
And Update test data for test case no 670424
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
Then enter the product class details
Then enter the maturity date
Then enter eco sector code
Then click on the add button
Then click on the Document details tab
Then enter the Solicitor Name
Then enter the Estimator Name
Then click on the save button
Then click on the validate button
Then navigate to Approve level1 screen
And open the record add decision for approval 
Then approve Application for Financial Facilities record

@670986
Scenario: TSR - CDMI180064 - Create an application 
#After validation change user run date and then approve the record
Given navigate to FMS application and login with valid credentials
And Update test data for test case no 670986
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
Then enter the maturity date
Then enter the product class details
Then click on the add button
Then click on the Document details tab
Then enter the Solicitor Name
Then enter the Estimator Name
Then click on the save button
Then click on the validate button
Then Change the Application Running Date
Then navigate to Approve level1 screen
And open the record add decision for approval 
Then approve Application for Financial Facilities record

@670990
Scenario: TSR - CDMI180064 - Create an application 
#After validation change user run date and then approve the record
Given navigate to FMS application and login with valid credentials
And Update test data for test case no 670990
Then User click on the WIFAK_Application first tab
Then User click on the WIFAK_Application second tab
Then User navigate to the Application for financial facility 


@642105
Scenario: TSR - ICD180039 - Create an  application for change currency. 
Given navigate to FMS application and login with valid credentials
And Update test data for test case no 642105
Then User click on the WIFAK_Application first tab
Then User click on the WIFAK_Application second tab
Then User navigate to the Application for financial facility
Then User clicks the maintanance menu under Application for financial facility
Then select the application for dropdown as new facility