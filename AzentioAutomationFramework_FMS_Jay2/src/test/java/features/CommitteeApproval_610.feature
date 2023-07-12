Feature: Committee Approval

@280444
  Scenario: FMS Param UnCheck Flag Committee Approval flag
  
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
    And User_610 Uncheck the Committee Approval flag
    And User_610 check the Credit Authorization flag
    And User_610 check the Issue Facility Offer flag
    And User_610 check the Client Response flag
    And User_610 check the Document Validation flag
    And User_610 check the Final Approval flag
    And User_610 check the Create Active Facility If Within Limits flag
    And User_610 Check the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type

  @280444_01
  Scenario: BMOI150123 - Lookup query not working at approval committee recommendations for CIF-application code
  
    Given navigate to FMS application2 and login with valid credentials
    And User_610 get the test data set id for AT_CA_010
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
		And User_610 click Approval Committee Recommendations Menu
		And User_610 enter facility code in  Approval Committee Recommendations Menu
		Then User_610 validate the facility code is displaying in  Approval Committee Recommendations Menu
		
		@127769
		Scenario: Approval Committee recommendation
		
		Given navigate to FMS application2 and login with valid credentials
    And User_610 get the test data set id for AT_CA_011
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
		And User_610 click Approval Committee Recommendations Menu
		And User_610 enter facility code Approval Committee Recommendations Menu
		And User_610 enter CIF code in  Approval Committee Recommendations Menu
		Then User_610 validate facility with CIF code displaying in  Approval Committee Recommendations Menu
		And User_610 Click Recommend button in Approval Committee Recommendations
		And User_610 Select the decision in Approval Committee Recommendations
		And User_610 Click on Ok in Approval Committee Recommendations
		
@288531
    Scenario: FMS Param UnCheck Flag Committee Approval and Credit Authorization flag
  
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
    And User_610 Uncheck the Committee Approval flag
    And User_610 Uncheck the Credit Authorization flag
    And User_610 check the Issue Facility Offer flag
    And User_610 check the Client Response flag
    And User_610 check the Document Validation flag
    And User_610 check the Final Approval flag
    And User_610 check the Create Active Facility If Within Limits flag
    And User_610 Check the Automatically Approve Facility If Within Limits flag
    When User_610 clicks on the Update button
    And User_610 after the update go to the Approve menu
    And User_610 enter the code value in Approve menu
    And User_610 double click on the retrieved data in Approve menu
    When User_610 clicks on the Approve button in Approve menu under Facility Type

@288531_01
    Scenario: NBADAD150015 - view Approval Committee Recommendation if comments exceed.
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_CA_009
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
    
		And User_610 click Approval Committee Recommendations Menu
		And User_610 enter facility code Approval Committee Recommendations Menu
		And User_610 enter CIF code in  Approval Committee Recommendations Menu
		Then User_610 validate facility with CIF code displaying in  Approval Committee Recommendations Menu
		And User_610 Click Recommend button in Approval Committee Recommendations
		And User_610 Select the decision in Approval Committee Recommendations
		And User_610 Enter the comments in Approval Committee Recommendations
		And User_610 Click on Ok in Approval Committee Recommendations
		
		And User_610 Click Authorize Reject Application For Financial Facilities screen
		And User_610 retrive the first data in Authorize Reject Application For Financial Facilities screen
		And User_610 Click Approval Committiees button in Authorize Reject Application For Financial Facilities screen
		And User_610 Validate the Approval Committee Recommendations comments displayed or not in Authorize Reject screen
		
    And User_610 Click Application for financial facilities
    And User_610 Click Maintenance
    And User_610 search and retrive the first data in Application for financial facilities screen
    And User_610 Click Approval Committiees button in Authorize Reject Application For Financial Facilities screen
		And User_610 Validate the Approval Committee Recommendations comments displayed or not in Authorize Reject screen
    
    @127895
    Scenario: NBADAD150015 - view Approval Committee Recommendation if comments exceed.
    Given navigate to FMS application2 and login with valid credentials
    And User_609 click Technical details
    And User_609 click clear caches
    And User_609 Click the ok button
    And User_610 get the test data set id for AT_CA_009
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
    
		And User_610 click Approval Committee Recommendations Menu
		And User_610 enter facility code Approval Committee Recommendations Menu
		And User_610 enter CIF code in  Approval Committee Recommendations Menu
		Then User_610 validate facility with CIF code displaying in  Approval Committee Recommendations Menu
		And User_610 Click Recommend button in Approval Committee Recommendations
		And User_610 Select the decision in Approval Committee Recommendations
		And User_610 Enter the comments in Approval Committee Recommendations
    