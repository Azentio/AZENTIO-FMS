Feature: To Test the Financial facilities in FMS Application

  @862778
  Scenario: Details are not showing in owner Shareholders tab after validating application from Request from financing Screen
    Given navigate to FMS application and login with valid credentials
    And Click the request for financin in fms application
    And Click the request for financing under request for financin
    And click the maintenence under request for financing
    And click the reason for submission search box
    And click the customer search box
    #And click the customer word
    And click the facility type details
    And Enter the facility type code under facility type
    #And click the facility type touch
    And Enter the total limit under global limit
    #And Click the total limit word
    And Click the Disbursement Sublimit under maintenance screen
    And Add the limits under Disbursement Sublimit
    And Add the product class values in product searchbox
    #And click the product class values word
    And Add the Margin values in Margin
    #And Click the Margin values word
    #And Enter the tenure value in tenure
    And Add all the Above limit values
    And Save all the values when limits are add
    #And Confirm the popup menu when all the limits are saved
    #And Click the final save popup message
    #And Click the validate button when all the values are saved
    #And Confirm the validate popup menu
    #And Click the final validate popup
    And Click the Approve level1 screen under request for financing
    And Enter the request code in search box
    And Double tap the request code value
    And Click the customer grading recommendation under maintenance screen
    And Click the decision dropdown and select forward menu
    And click the Approval committe dropdown
    And Click the investment committe under Approval committe
    And Approve the decision under relationship
    And Confirm the Approve popup message
    And Click the final Approve popup
    And Click the Approval Committee Recommendation under request for financing
    And Enter the request code in approval committe search box
    And double tap the request code
    And Click the credit committee recommendation
    And Click the recommendation under credit committee recommendation
    And Click the recommendation add symbol under recommendation
    And double tap all the value we created
    And send back the recommendation  value
    And Click the Maitenance level in send back level
    And Confirm the recommendation popup menu
    And Accept the recommendation popup menu
    And Click the maintenance screen under request for financing
    And Click the search button
    And Enter the created request code in search box
    Then double tap the  created request code
    
    @678142_Fmscore
  Scenario: The system is reversing the off balance sheet entries upon cancelling the facility.
    Given navigate to FMS application and login with valid credentials
    And User_611 Get the data set Id for AT_RF_029
    And User_611 Click the first Wifak Application
    And User_611 Click the second Wifak Application
    And User_611 Click the application for financial facilities under second Wifak Appliaction
    And User_611 Click the maintenance under application for financial facilities
    And User_611 Click the Main information
    And User_611 Select a new facility under application
    And User_611 Enter the CIF num under cif details
    And User_611 Enter the facility type under facility type details
    And User_611 Enter the country of financing under facility type details
    And User_611 Enter the facility rating under facility type details
    And User_611 Click the Additional details
    And User_611 Enter the currency code under Additional details
    And User_611 Enter the total value under Additional details
    And User_611 enter the expire date in additional info tab
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And User_611 Clicks the product class value one
    And User_611 click the clean flag under product calss in limit details tab
    And User_611 Click the add button
    And User_611 Click the doucmentdetailstab
    And User_611 Enter the value for solicitorname
    And User_611 Enter the value for estimators name
    And User_611 clicks the save button
    And User_611 clicks the validate button
    And User_611 clicks the Approve Level1 link
    And User_611 retrive the first data in approve level1
    And User_611 select the Approve level1 decision as Approve
    And User_611 clicks on the level1 submit button
    And User_611 clicks the Approve Level2 link
    And User_611 retrive the first data in approve level2
    And User_611 select the level2 decision as approve
    And User_611 clicks on the level2 submit button
    And User_611 clicks the Approve Level3 link
    And User_611 retrive the first data in approve level3
    And User_611 select the level3 decision as approve
    And User_611 clicks on the level3 submit button
    And User_611 clicks the facility management under wifak application
    And User_611 clicks the maintenance under facility management
    And User_611 clicks the Infosearch button
    And User_611 enter the Application Ref code
    And User_611 click the Journal voucher details button in Facilities Management Maintanance
		Then User_611 validate Account details should be displayed in JV Details tab under Facilities Management Maintanance
		And User_611 click the Cancel menu under Facilities Management in WIFAK Application
		And User_611 enter the Application Ref number in search grid under Cancel screen in WIFAK Facilities Management
		And User_611 double click on the search grid first row in Cancel screen under WIFAK Facilities Management
		And User_611 click the Cancel button in Cancel screen under WIFAK Facilities Management
		And User_611 click the Approve\Reject Cancel menu under Facilities Management in WIFAK Application
		And User_611 enter the Application Ref number in search grid under Approve\Reject Cancel screen in WIFAK Facilities Management
		And User_611 double click on the search grid first row in Approve\Reject Cancel screen under WIFAK Facilities Management
		And User_611 click the Approve Cancel button in Approve\Reject Cancel screen under WIFAK Facilities Management
		And User_611 clicks the facility management under wifak application
    And User_611 clicks the maintenance under facility management
    And User_611 clicks the Infosearch button
    And User_611 enter the Application Ref code
    And User_611 click the Journal voucher details button in Facilities Management Maintanance
		Then User_611 validate Account details should be displayed in JV Details tab under Facilities Management Maintanance
    
    @434947
  Scenario: TSR-BMK150100
    Given navigate to FMS application and login with valid credentials
    And User_611 Get the data set Id for AT_RF_076
   	And User_611 Click the first Wifak Application
    And User_611 Click the second Wifak Application
    And User_611 Click the application for financial facilities under second Wifak Appliaction
    And User_611 Click the maintenance under application for financial facilities
    And User_611 Click the Main information
    And User_611 Select a new facility under application
    And User_611 Enter the CIF num under cif details
    And User_611 Enter the facility type under facility type details
    And User_611 Enter the country of financing under facility type details
    And User_611 Enter the facility rating under facility type details
    And User_611 Click the Additional details
    And User_611 Enter the currency code under Additional details
    And User_611 Enter the total value under Additional details
     And User_611 enter the expire date in additional info tab
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And user_611 choose the product class from iis param
    #And User_611 Enter the floating rate with clear btn
    And User_611 Enter the floating rate periodicity
    #And User_611 Enter the floating rate periodicity type
    And user_611 Enter the value of Yield details and Margin rate in application for financial facilities
    And User_611 Click the add button
    And User_611 Click the doucmentdetailstab
    And User_611 Enter the value for solicitorname
    And User_611 Enter the value for estimators name
    And User_611 clicks the save button
    And User_611 clicks the validate button
    And User_611 clicks the Approve Level1 link
    And User_611 retrive the first data in approve level1
    And User_611 select the Approve level1 decision as Approve
    And User_611 clicks on the level1 submit button
    And User_611 clicks the Approve Level2 link
    And User_611 retrive the first data in approve level2
    And User_611 select the level2 decision as approve
    And User_611 clicks on the level2 submit button
    And User_611 clicks the Approve Level3 link
    And User_611 retrive the first data in approve level3
    And User_611 select the level3 decision as approve
    And User_611 clicks on the level3 submit button
    And User_611 clicks the facility management under wifak application
    And User_611 clicks the maintenance under facility management
    And User_611 clicks the Infosearch button
    And User_611 enter the Application Ref code
    And User_611 clicks the Facility Limit Details Tab in maintenance under facility management 
    #And User_611 clicks the facility management under wifak application
    And user_611 clicks the update after approve under Facility management
    And User_611 clicks the Facility Limit Details Tab in update after approve under facility management
    #And User_611 click the yield and margin details in update after approve under Facility Limit Details Tab
    And user_611 Enter the value of Limit additional details rate in Facility Management
    And user_611 Enter the value of Limit additional details Margin rate in Facility Management 
    #And user_611 Enter the value of doucment code dates
  	And User_611 clicks the save button in update after approve under facility management
    And user_611 clicks the Approve menu under facility management
    #And User_611 clicks the facility management under wifak application
    And User_611 clicks the maintenance under facility management
    And User_611 clicks the Infosearch button
    And User_611 enter the Application Ref code
    And User_611 clicks the Facility Limit Details Tab in maintenance under facility management 
    And User_611 validate the Limit additional details tab is displayed in Applictaion for financial facility
    And User_611 validate To check the Limit additional details tab is updated in update after approve under Fcaility management
    
    @640897
    Scenario: TSR - FIBSI180111
    Given navigate to FMS application and login with valid credentials
And User_611 Get the data set Id for AT_RF_042
And User_611 clear the caches in FMS Application
And User_611 click on the Collateral Management feature
And User_611 click on the Maintanace screen under Collateral Management
And User_611 enter the Collateral type under main information in Collateral Management main Screen
And User_611 give the valid from date under main information in Collateral Management main Screen
And User_611 give the valid to date under main information in Collateral Management main Screen
And User_611 enter the Collateral currency under main information in Collateral Management main Screen
And User_611 enter the brief description under main information in Collateral Management main Screen
And User_611 enter the long description under main information in Collateral Management main Screen
And User_611 move to the Collateral cash details tab in Collateral Management main Screen
And User_611 click the add new icon under Collateral cash details tab
And User_611 click the additional reference lookup under Collateral cash details tab
And User_611 select the any cy value under additional reference lookup
And User_611 enter the amount value under Collateral cash details tab
When User_611 click the save button under Collateral Management main Screen
And User_611 move to the Approve screen under Collateral Management
And User_611 Get the data set Id for AT_RF_042
And User_611 enter the Code in Collateral Management Approve screen search grid
And User_611 double click the Code Collateral Management Approve screen search grid
When User_611 click the approve button under Collateral Management approve screen
And User_611 Click the first Wifak Application
And User_611 Click the second Wifak Application
And User_611 clicks the facility management under wifak application
 And User_611 clicks the maintenance under facility management
 And User_611 clicks the Infosearch button
 And User_611 enter the Application Ref code
And User_611 enter the Status in Facilities Management Maintanance Search grid under WIFAK Application
And User_611 double click the any one row in Facilities Management Maintanance Search grid under WIFAK Application
And User_611 clicks the Facility Limit Details Tab in maintenance under facility management
And User_611 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_611 click the Collateral details button in Facilities Management Maintanance under WIFAK Application
And User_611 click the add new icon in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_611 enter the Collateral code in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_611 Click the OK button in collateral details tab Facilities Management Maintanance under WIFAK Application
When User_611 click the Save Button under Maintanance under WIFAK Facilities Management
And User_611 click the Approve menu under Facilities Management in WIFAK Application
And User_611 Get the data set Id for AT_RF_042
And User_611 enter the Application Ref code in search grid under Approve screen in WIFAK Facilities Management
And User_611 double click on the search grid first row in Approve screen under WIFAK Facilities Management
And User_611 click the Approve button in Approve screen under WIFAK Facilities Management
  
  
  @640956
  Scenario: TSR - FIBSI180080  
  And User_611 Get the data set Id for AT_RF_043
And User_611 clear the caches in FMS Application
And User_611 click on the Collateral Management feature
And User_611 click on the Maintanace screen under Collateral Management
And User_611 enter the Collateral type under main information in Collateral Management main Screen
And User_611 give the valid from date under main information in Collateral Management main Screen
And User_611 give the valid to date under main information in Collateral Management main Screen
And User_611 enter the Collateral currency under main information in Collateral Management main Screen
And User_611 enter the brief description under main information in Collateral Management main Screen
And User_611 enter the long description under main information in Collateral Management main Screen
And User_611 move to the Collateral cash details tab in Collateral Management main Screen
And User_611 click the add new icon under Collateral cash details tab
And User_611 click the additional reference lookup under Collateral cash details tab
And User_611 select the any cy value under additional reference lookup
And User_611 enter the amount value under Collateral cash details tab
When User_611 click the save button under Collateral Management main Screen
And User_611 move to the Approve screen under Collateral Management
And User_611 Get the data set Id for AT_RF_043
And User_611 enter the Code in Collateral Management Approve screen search grid
And User_611 double click the Code Collateral Management Approve screen search grid
When User_611 click the approve button under Collateral Management approve screen
And User_611 Click the first Wifak Application
And User_611 Click the second Wifak Application
And User_611 clicks the facility management under wifak application
 And User_611 clicks the maintenance under facility management
 And User_611 clicks the Infosearch button
 And User_611 enter the Application Ref code
And User_611 enter the Status in Facilities Management Maintanance Search grid under WIFAK Application
And User_611 double click the any one row in Facilities Management Maintanance Search grid under WIFAK Application
And User_611 clicks the Facility Limit Details Tab in maintenance under facility management
And User_611 select the Facility limit details product class row in Facilities Management Maintanance under WIFAK Application
And User_611 click the Collateral details button in Facilities Management Maintanance under WIFAK Application
And User_611 click the add new icon in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_611 enter the Collateral code in collateral details tab Facilities Management Maintanance under WIFAK Application
And User_611 Click the OK button in collateral details tab Facilities Management Maintanance under WIFAK Application
When User_611 click the Save Button under Maintanance under WIFAK Facilities Management
And User_611 click the Approve menu under Facilities Management in WIFAK Application
And User_611 Get the data set Id for AT_RF_043
And User_611 enter the Application Ref code in search grid under Approve screen in WIFAK Facilities Management
And User_611 double click on the search grid first row in Approve screen under WIFAK Facilities Management
And User_611 click the Approve button in Approve screen under WIFAK Facilities Management

@640874_Param
Scenario: TSR - RIDB180131
Given navigate to FMS param application and login with valid credentials
And User_611 get the test data for test case AT_RF_041_Param
And User_611 clicks on the Parameter module in FMS Param
And User_611 clicks on the Collateral type module
And User_611 clicks on the Maintanance screen under Collateral type
And User_611 enter the code under Collateral Type main screen
And User_611 enter the Brief description under Collateral Type main screen
And User_611 enter the Long description under Collateral Type main screen
And User_611 select the Asset type as cash under Collateral Type main screen
When User_611 clicks on the save button under Collateral Type main screen
And User_611 clicks on the Approve screen under Collateral Type
And User_611 search the code under Collateral Type approve screen
And User_611 double click on the searched result under Collateral Type approve screen
When User_611 clicks on the Approve button under Collateral Type approve screen

 @640874_FMSCore
Scenario: TSR - RIDB180131
Given navigate to FMS application and login with valid credentials
And User_611 get the test data for test case AT_RF_041_Core
And User_611 clear the caches in FMS Application
And User_611 click on the Collateral Management feature
And User_611 click on the Maintanace screen under Collateral Management
And User_611 enter the Collateral type under main information in Collateral Management main Screen
And User_611 give the valid from date under main information in Collateral Management main Screen
And User_611 give the valid to date under main information in Collateral Management main Screen
And User_611 enter the Collateral currency under main information in Collateral Management main Screen
And User_611 enter the brief description under main information in Collateral Management main Screen
And User_611 enter the long description under main information in Collateral Management main Screen
And User_611 move to the Collateral cash details tab in Collateral Management main Screen
And User_611 click the add new icon under Collateral cash details tab
And User_611 click the additional reference lookup under Collateral cash details tab
And User_611 select the any cy value under additional reference lookup
And User_611 enter the amount value under Collateral cash details tab
When User_611 click the save button under Collateral Management main Screen
And User_611 move to the Approve screen under Collateral Management
And User_611 click the clear button under approve screen in Collateral Management
And User_611 double click on the first row in approve screen
When User_611 click the approve button under Collateral Management approve screen

    
