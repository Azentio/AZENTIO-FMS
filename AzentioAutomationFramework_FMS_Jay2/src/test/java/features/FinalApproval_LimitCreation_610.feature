 Feature: Final Approval Limit Creation

  @127849_01
  Scenario: FMS Param UnCheck Last Three flag
    Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 clicks on the facility details tab in update after approve
    And User_610 clicks on the STP Facility Requirements option
    And User_610 check the Customer Grading flag
    And User_610 check the Overwrite Grading flag
    And User_610 check the Credit Review flag
    And User_610 check the Committee Approval flag
    And User_610 check the Credit Authorization flag
    And User_610 check the Issue Facility Offer flag
    And User_610 check the Client Response flag
    And User_610 check the Document Validation flag
    And User_610 Uncheck the Final Approval flag
    And User_610 Uncheck the Create Active Facility If Within Limits flag
    And User_610 UnCheck the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type


	 #S11 1-------------------------------
	 
  @899828
  Scenario: ABSAI190418 - FMS 1704_System defaults to Minimum Charges on Final Approval
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_FALC_002
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    #   And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User_610 clicks the Approve Level1 link
    And User_610 retrive the first data in approve level1
    And User_610 select the Approve level1 decision as approve
    And User_610 clicks on the level1 submit button
    And User_610 clicks the Approve Level2 link
    And User_610 retrive the first data in approve level2
    And User_610 select the level2 decision as approve
    And User_610 clicks on the level2 submit button
    And User_610 clicks the Approve Level3 link
    And User_610 retrive the first data in approve level3
    And User_610 select the level3 decision as approve
    When User_610 clicks on the level3 submit button
    
    And User_610 clicks Final Approval Screen
    And User_610 retrive the first data in Final Approval Screen
    And User_610 Select limit Details in Final Approval Screen
    Then User_610 Click the Product Class In Final Approval Screen
    When User_610 clicks and Validate Charges Details IsEnabled or Not In Final Approval Screen
    
    #S11 2-------------------------------
        
    @828096
  Scenario: ABEI190268 - Reject an application on "Final Approval" Screen.
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_FALC_003
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    #   And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User_610 clicks the Approve Level1 link
    And User_610 retrive the first data in approve level1
    And User_610 select the Approve level1 decision as approve
    And User_610 clicks on the level1 submit button
    And User_610 clicks the Approve Level2 link
    And User_610 retrive the first data in approve level2
    And User_610 select the level2 decision as approve
    And User_610 clicks on the level2 submit button
    And User_610 clicks the Approve Level3 link
    And User_610 retrive the first data in approve level3
    And User_610 select the level3 decision as approve
    When User_610 clicks on the level3 submit button
    
    
    And User_610 clicks Final Approval Screen
    And User_610 retrive the first data in Final Approval Screen
    And User_610 clicks Other Details in Final Approval Screen
    And User_610 enter Reject Reason In Other Details in Final Approval Screen
    And User_610 enter Comments In Other Details in Final Approval Screen
    Then User_610 Reject the Final Approval Screen
    
    #S11 6---------------------------------------------
    
    @127849
  Scenario: Final Approval
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_FALC_007
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    #   And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User_610 clicks the Approve Level1 link
    And User_610 retrive the first data in approve level1
    And User_610 select the Approve level1 decision as approve
    And User_610 clicks on the level1 submit button
    And User_610 clicks the Approve Level2 link
    And User_610 retrive the first data in approve level2
    And User_610 select the level2 decision as approve
    And User_610 clicks on the level2 submit button
    And User_610 clicks the Approve Level3 link
    And User_610 retrive the first data in approve level3
    And User_610 select the level3 decision as approve
    When User_610 clicks on the level3 submit button
    
    
    And User_610 clicks Final Approval Screen
    And User_610 retrive the first data in Final Approval Screen
    And User_610 clicks Other Details in Final Approval Screen
    And User_610 enter Reject Reason In Other Details in Final Approval Screen
    And User_610 enter Comments In Other Details in Final Approval Screen
    Then User_610 Reject the Final Approval Screen
    
    #retrive Application for financial facilities screen
    And User_610 Click Maintenance
    And User_610 Click Ok On Do you need to reload the tab
    And User_610 search and retrive the first data in Application for financial facilities screen
    And User_610 Validate Check the Status of Final Rejection or Not in Application for financial facilities screen
    
    #S11 4------------------------------------------
    
    
     @127772
  Scenario: Final Approval
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_FALC_005
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    #   And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User_610 clicks the Approve Level1 link
    And User_610 retrive the first data in approve level1
    And User_610 select the Approve level1 decision as approve
    And User_610 clicks on the level1 submit button
    And User_610 clicks the Approve Level2 link
    And User_610 retrive the first data in approve level2
    And User_610 select the level2 decision as approve
    And User_610 clicks on the level2 submit button
    And User_610 clicks the Approve Level3 link
    And User_610 retrive the first data in approve level3
    And User_610 select the level3 decision as approve
    When User_610 clicks on the level3 submit button
    
    And User_610 clicks Final Approval Screen
    And User_610 retrive the first data in Final Approval Screen
    And User_610 Click  Final Approval button in Final Approval Screen
    And User_610 Validate the approved the Value in Final Approval Screen
    
    #S11 5 params ------------------------------UnCheck All flag
    
    @127842_01
    Scenario: FMS Param UnCheck All flag
    Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 clicks on the facility details tab in update after approve
    And User_610 clicks on the STP Facility Requirements option
    And User_610 check the Customer Grading flag
    And User_610 Uncheck the Overwrite Grading flag
    And User_610 Uncheck the Credit Review flag
    And User_610 Uncheck the Committee Approval flag
    And User_610 Uncheck the Credit Authorization flag
    And User_610 Uncheck the Issue Facility Offer flag
    And User_610 Uncheck the Client Response flag
    And User_610 Uncheck the Document Validation flag
    And User_610 Uncheck the Final Approval flag
    And User_610 Uncheck the Create Active Facility If Within Limits flag
    And User_610 UnCheck the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type
    
    #S11 5------------------------------
    
     @127842
  Scenario: Check the Final Approval flow
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_FALC_004
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    #   And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User_610 clicks the Approve Level1 link
    And User_610 retrive the first data in approve level1
    And User_610 select the Approve level1 decision as approve
    And User_610 clicks on the level1 submit button
    And User_610 clicks the Approve Level2 link
    And User_610 retrive the first data in approve level2
    And User_610 select the level2 decision as approve
    And User_610 clicks on the level2 submit button
    And User_610 clicks the Approve Level3 link
    And User_610 retrive the first data in approve level3
    And User_610 select the level3 decision as forward to Approvel Committee
    When User_610 clicks on the level3 submit button
    
    #Approval Committee
 		And User_610 click Approval Committee Recommendations Menu
		And User_610 enter facility code Approval Committee Recommendations Menu
		And User_610 enter CIF code in  Approval Committee Recommendations Menu
		Then User_610 validate facility with CIF code displaying in  Approval Committee Recommendations Menu
		And User_610 Click Recommend button in Approval Committee Recommendations
		And User_610 Select the decision in Approval Committee Recommendations
		And User_610 Click on Ok in Approval Committee Recommendations
		
		#Authorize Reject
		And User_610 Click Authorize Reject Application For Financial Facilities screen
		And User_610 retrive the first data in Authorize Reject Application For Financial Facilities screen
		And User_610 Click Authorize button in Authorize Reject Application For Financial Facilities screen
		
		#Issue Facility
		And User_610 clicks Issue Facility Offer Screen
    And User_610 retrive the first data in Issue Facility Offer Screen
    And User_610 Click Issueoffer button in Issue Facility Offer Screen
   
    #Client Response
    And User_610 clicks Client Response Screen
    And User_610 retrive the first data in Client Response Screen
    And User_610 Click Accept button in Client Response Offer Screen
    
    #Document Validation
    And User_610 clicks Document Validation Screen
    And User_610 retrive the first data in Document ValidationScreen
    And User_610 Click Validate button in Client Document Validation Screen
    
    #Final Approval Screen
    And User_610 clicks Final Approval Screen
    And User_610 retrive the first data in Final Approval Screen
    And User_610 Click  Final Approval button in Final Approval Screen
    And User_610 Validate the approved the Value in Final Approval Screen
    
    
   
    #S11 3 params -------------- only chech Credit Authorization flag
    
    @127764_01
    Scenario: FMS Param UnCheck All flag
    Given navigate to FMS param application and login with valid credentials2
    And User_610 clicks on the parameter module
    And User_610 clicks on the Facility Type feature
    And User_610 clicks on the update after approve menu in Facility type
    And User_610 enter the code value in update after approve menu
    And User_610 double click on the retrieved data in update after approve menu
    And User_610 clicks on the facility details tab in update after approve
    And User_610 clicks on the STP Facility Requirements option
    And User_610 check the Customer Grading flag
    And User_610 Uncheck the Overwrite Grading flag
    And User_610 Uncheck the Credit Review flag
    And User_610 Uncheck the Committee Approval flag
    And User_610 check the Credit Authorization flag
    And User_610 Uncheck the Issue Facility Offer flag
    And User_610 Uncheck the Client Response flag
    And User_610 Uncheck the Document Validation flag
    And User_610 Uncheck the Final Approval flag
    And User_610 Uncheck the Create Active Facility If Within Limits flag
    And User_610 UnCheck the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type
    
    #S11 3-------------------------------------
    
     @127764
  Scenario: Check the Final Approval flow
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_FALC_006
    And User_610 Click Wifak Application first
    And User_610 Click Wifak Application Second
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 Click and Select Application for
    And User_610 Search CIF No
    And User_610 Enter codeOn Facility Type
    And User_610 Enter Code In Country of Financing
    And User_610 Enter line Code On Facility Rating
    And User_610 Click on additional Details
    And User_610 Enter the Total Value
    And User_610 Click Offer Expiration SelectDate
    And User_610 Select limit Details
    And User_610 Click Add button on limit Detail
    And User_610 Enter ValueOn Product Class
    Then User_610 Check Flag in Clean Level IN Limits Detalis SubMenu
    And User_610 Click Add button AfterEnter Value On Product Class
    Then User_610 Click the Product Class In Limits Details
    And User_610 Click Save Button After In Limits Details
    Then User_610 Click Ok Button In Waring Screen In Limits Details
    And User_610 Click OK  Button In Sucess Screen In Limits Details
    And User_610 Click Document Details
    And User_610 Enter The Value Solicitor Name
    And User_610 Enter The Value Estimator Name
    #   And User_610 Save button
    And User_610 Click Validate Button in Document Details
    And User_610 clicks the Approve Level1 link
    And User_610 retrive the first data in approve level1
    And User_610 select the Approve level1 decision as approve
    And User_610 clicks on the level1 submit button
    And User_610 clicks the Approve Level2 link
    And User_610 retrive the first data in approve level2
    And User_610 select the level2 decision as approve
    And User_610 clicks on the level2 submit button
    And User_610 clicks the Approve Level3 link
    And User_610 retrive the first data in approve level3
    And User_610 select the level3 decision as forward to Approvel Committee
    When User_610 clicks on the level3 submit button
    
    #Approval Committee
 		And User_610 click Approval Committee Recommendations Menu
		And User_610 enter facility code Approval Committee Recommendations Menu
		And User_610 enter CIF code in  Approval Committee Recommendations Menu
		Then User_610 validate facility with CIF code displaying in  Approval Committee Recommendations Menu
		And User_610 Click Recommend button in Approval Committee Recommendations
		And User_610 Select the decision in Approval Committee Recommendations
		And User_610 Click on Ok in Approval Committee Recommendations
		
 		#Issue Facility
		And User_610 clicks Issue Facility Offer Screen
    And User_610 retrive the first data in Issue Facility Offer Screen
    And User_610 Click Issueoffer button in Issue Facility Offer Screen
   
    #Client Response
    And User_610 clicks Client Response Screen
    And User_610 retrive the first data in Client Response Screen
    And User_610 Click Accept button in Client Response Offer Screen
    
    #Document Validation
    And User_610 clicks Document Validation Screen
    And User_610 retrive the first data in Document ValidationScreen
    And User_610 Click Validate button in Client Document Validation Screen
    
    #Final Approval Screen
    And User_610 clicks Final Approval Screen
    And User_610 retrive the first data in Final Approval Screen
    And User_610 Click  Final Approval button in Final Approval Screen
    And User_610 Validate the approved the Value in Final Approval Screen
   
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 