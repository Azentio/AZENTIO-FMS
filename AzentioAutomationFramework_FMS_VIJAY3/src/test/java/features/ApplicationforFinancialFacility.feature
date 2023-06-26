Feature: Application for Financial Facility
#@861963
#Scenario: ABEI190395 - Error with Application Process
#
#And Click on the parameters menu
#Then Click on the facility type under parameters menu
#And Click on update after approve under facility type
#Then search for the reference code in update after approve
#And Click the reference code 
#Then Click on the Facility Details  
#And Click on the STP Facility Requirements
#And Check customer grading under STP Facility Requirements
#Then check Credit Review under STP Facility Requirements
#And Uncheck Committee Approval under STP Facility Requirements
#Then Uncheck Credit Authorization under STP Facility Requirements
#And Uncheck  IssueFacilityOffer under STP Facility Requirements
#Then check Overwrite Grading under STP Facility Requirements
#And check Client Response under STP Facility Requirements
#Then check Final Approval  under STP Facility Requirements
#And check AutomaticallyApproveFacilityIfWithinLimits under STP Facility Requirements
#Then check  CreateActiveFacilityIfWithinLimitsunder STP Facility Requirements
#And check  DocumentValidation  under STP Facility Requirements
#And Click on Update
#Then Click on approve under facility type 
#And Search for the reference code 
#Then Click the reference code under approve screen
#Then Click on approve 

#@861963_01
#Scenario: ABEI190395 - Error with Application Process
#Given navigate to FMS application and login with valid credentials
#And Click on the wifak application menu 
#Then Click on the wifak application submenu under wifak application
#And Click on the application for financial facilities under wifak application submenu
#Then Click on the maintenance screen under application for financial facilities
#And Select the application for field under main information tab
#Then Select the cif no  
#And Select the facility type  
#Then Select the country of financing 
#And Click on the application details tab
#Then select the currency code
#And Click and enter the total value 
#Then Select the offer/expiration
#And Click on the limit details tab
#Then Click on the add new row icon 
#And Select the product class
#Then Click on the add button
#And Click on the document details tab
#Then Select the solicitor name
#And Select the estimator name
#Then Click the save button
#And Click the confirm ok button
#Then Click the ok button  


@293656
Scenario: NBADAD150042 - Validate if application has a minimum of 2 committee
Given navigate to FMS param application and login with valid credentials2

And Click on the Parameters menu
Then Click on the Facility Type submenu
And Click on the Update After Approve screen 
Then Search for the Code in Update After Approve screen
And Click the Code in Update After Approve screen

Then Click on the Approval Committee tab in Update After Approve screen
And Click on the add icon 
Then Select the Approval Committee value1
And Click on the add icon 
Then Select the Approval Committee value2
#Then Click on the approval committee field1
#And Enter the approval committee field value1
#Then Click on the add icon 
#And Click on the approval committee field2
#Then Enter the approval committee field value2
And Click on Update
Then Click the confirm ok button
And Click the ok button  



@293656_01
Scenario: NBADAD150042 - Validate if application has a minimum of 2 committee
Given navigate to FMS application and login with valid credentials2
And Click on the wifak application menu 
Then Click on the wifak application submenu under wifak application
And Click on the application for financial facilities under wifak application submenu
Then Click on the maintenance screen under application for financial facilities
And Select the application for field under main information tab
Then Select the cif no  
And Select the facility type  
Then Select the country of financing 
And Clickon the approval committees under maintenance screen
Then Check the values 

@127780
Scenario: TC to check the addition of two new flags at the Parameters -Facility Type Maintain  screen(P008)
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_AFF_059
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu  
And User_609 Click on Update After Approve Screen
And User_609 Select the Code in Update After Approve Screen
And User_609 Click on the Facility Details Tab
And User_609 Click on the Application Requirements and Details in Facility Details tab
Then User_609 Check the Apply Corporate Package is displayed
Then User_609 Check the Allow to Edit Application is displayed
Then User_609 Check the Allow to edit Corporate Package Rate is displayed

@300125
Scenario: BMK130124 - Negative Utilization amount
Given navigate to FMS application and login with valid credentials2
And Click on the wifak application menu 
And Click on the wifak application submenu under wifak application
And Click on the Facilities Management submenu in wifak application submenu
And Click on the Query screen 
And Search for the code in Query screen 
And Select the code in Query screen  
And Click on the Facility Drawdown Details tab in Query screen 
Then Check for the Unutilized Amount shows negative value or not  

@402668
Scenario: TS-0002-FMS-Modification new fields at the level of Application for Financial facilities screens
Given navigate to FMS param application and login with valid credentials2
And Click on the Parameters menu
And Click on the Facility Type submenu
And Click on the Update After Approve screen 
And Search for the Code in Update After Approve screen
And Click the Code in Update After Approve screen
And Select the Revolving/One-Off option in Main Details tab
And Enable the Apply Revolving Controls in Main Details tab
And Enter the value for Max Revolving Times
And Enter the value for Manual Revolving Minimum Utilization	
And Enable the Subject to Full Repayment 
And Click on Update
And Click on confirm ok
And click on ok
And Click on the Approve screen
And Search for the Code in Approve screen
And Click the Code in Approve screen
And Click on Approve in Approve screen
And Click on confirm ok
And click on ok

@402668_01
Scenario: TS-0002-FMS-Modification new fields at the level of Application for Financial facilities screens
Given navigate to FMS application and login with valid credentials2
And Click on the REQUEST FOR FINANCIN menu
Then Click on the Request For Financing	submenu
And Click on the Maintenance screen 
Then Select the Reason For Submission field
And Enter the value in Customer field
And Click on the search icon for Customer
Then Enter the value for Facility Type field in Facility Type Details tab
And Click on the search icon for Facility Type
And Select the Revolving/One-Off option in Facility Type Details tab
Then Check the Max Revolving Times field is set 
And Check the Subject to Full Repayment is enabled
Then Check the Current Utilization is disabled
And Check the Total Approvals is disabled
