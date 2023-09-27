Feature: Committee Approval

		@Flagcheck_Param
    Scenario: system is allowing to display the application in‘Authorization Screen’ after Committee Recommendation approval
    Given navigate to FMS param application and login with valid credentials
    And User_611 clicks the Parameter in FMS Param
		And User_611 clicks on the Facility Type feature
		And User_611 clicks on the update after approve menu in Facility type
		And User_611 enter the code value in update after approve menu
		And User_611 double click on the retrieved data in update after approve menu
		And User_611 clicks on the facility details tab in update after approve
		And User_611 clicks on the STP Facility Requirements option
		And User_611 check the Customer Grading flag
		And User_611 check the Overwrite Grading flag
		And User_611 check the Credit Review flag
		And User_611 check the Committee Approval flag
		And User_611 uncheck the Committee Approval flag
		And User_611 check the Credit Authorization flag
#		And User_611 uncheck the Credit Authorization flag
		And User_611 check the Issue Facility Offer flag
		And User_611 check the Client Response flag
		And User_611 check the Document Validation flag
		And User_611 check the Final Approval flag
		And User_611 check the Create Active Facility If Within Limits flag
		And User_611 Check the Automatically Approve Facility If Within Limits flag
		And User_611 clicks on the Update button under update after approve menu in Facility type
		And User_611 clicks the approve menu under facility type
		And User_611 enter the code value in Approve menu
		And User_611 double click on the retrieved data in Approve menu
		And User_611 clicks on the Approve button in Approve menu under Facility Type
    

@616977
Scenario: increase the width and the characters for committee member’s comments from 50 to 300 characters
		Given navigate to FMS application and login with valid credentials
		And User_611 Get the data set Id for AT_CA_021 
    And User_611 Click the first Wifak Application
    And User_611 Click the second Wifak Application
    #And User_611 Click the application for financial facilities under second Wifak Appliaction
    #And User_611 Click the maintenance under application for financial facilities
    #And User_611 Click the Main information
    #And User_611 Select a new facility under application
    #And User_611 Enter the CIF num under cif details
    #And User_611 Enter the facility type under facility type details
    #And User_611 Enter the country of financing under facility type details
    #And User_611 Enter the facility rating under facility type details
    #And User_611 Click the Additional details
    #And User_611 Enter the currency code under Additional details
    #And User_611 Enter the total value under Additional details
    #And User_611 Enter the Expiry date
    #And User_611 Click the limit details tab
    #And User_611 Click the add button under limit details tab
    #And User_611 Clicks the product class value one
    #And User_611 Click the add button
    #And User_611 Click the doucmentdetailstab
    #And User_611 Enter the value for solicitorname
    #And User_611 Enter the value for estimators name
    #And User_611 clicks the save button
    #And User_611 clicks the validate button
    #And User_611 clicks the Approve Level1 link
    #And User_611 retrive the first data in approve level1
    #And User_611 select the Approve level1 decision as Approve
    #And User_611 clicks on the level1 submit button
    #And User_611 clicks the Approve Level2 link
    #And User_611 retrive the first data in approve level2
    #And User_611 select the level2 decision as approve
    #And User_611 clicks on the level2 submit button
    #And User_611 clicks the Approve Level3 link
    #And User_611 retrive the first data in approve level3
    #And User_611 select the level3 decision as approve
    #And User_611 clicks on the level3 submit button
    And User_611 clicks the Approval Committee Recommendation tab
    And User_611 Retrive the facility code data in Approval Committee Recommendation tab
    And User_611 clicks the recommendation button
   	And User_611 Select the approve button 
    And User_611 Enter the Comments
    And User_611 Validate the characters should allow above 300 characters
    
  	@1265137
    Scenario: system is allowing to display the application in‘Authorization Screen’ after Committee Recommendation approval
    Given navigate to FMS application and login with valid credentials
   	And User_611 Get the data set Id for AT_CA_022 
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
    And User_611 Enter the Expiry date
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And User_611 Clicks the product class value one
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
    And User_611 clicks the Approval Committee Recommendation tab
    And User_611 Retrive the facility code data in Approval Committee Recommendation tab
    And User_611 clicks the recommendation button
   	And User_611 Select the approve button
   	And User_611 Click the ok button
   	And User_611 click the Authorize Reject Application for financial tab under Wifak application
   	And User_611 Validate the Facility code Retrive data in Approval Committee Recommendation tab  
    And User_611 Validate the Facility code Retrive data in Authorize screen
    
    @1265138
    Scenario: EWBI200039.003: Check whether system is allowing to display the request in ‘Authorization Screen’ before Committee Recommendation approval
    Given navigate to FMS application and login with valid credentials
    And User_611 Get the data set Id for AT_CA_023
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
    And User_611 Enter the Expiry date
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And User_611 Clicks the product class value one
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
    And User_611 clicks the Approval Committee Recommendation tab
    And User_611 Retrive the facility code data in Approval Committee Recommendation tab
    And User_611 Validate the Facility code Retrive data in Approval Committee Recommendation tab
    And User_611 validate the facility code data not Retrive in Authorize Screen
    
    @127860
    Scenario: Open the facility management screen and link a collateral
    Given navigate to FMS application and login with valid credentials
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
    And User_611 Enter the Expiry date
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And User_611 Clicks the product class value one
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
    
   
    
    