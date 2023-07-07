Feature: To Test the Financial facilities in FMS Application

   @280446
   Scenario: BMOI150119 - Application that was sent back can be approved only by the user who sent it back
   Given navigate to FMS application and login with valid credentials
    And User_611 Click the request for financin in fms application
    And User_611 Click the request for financing under request for financin
    And User_611 click the maintenence under request for financing
    And User_611 click the reason for submission search box
    And User_611 click the customer search box
		And User_611 click the facility type details
    And User_611 Enter the facility type code under facility type
    And User_611 Enter the total limit under global limit
    And User_611 Click the Disbursement Sublimit under maintenance screen
    And User_611 Add the limits under Disbursement Sublimit
    And User_611 Add the product class values in product searchbox
    #And User_611 Enter the Facility risk rating value
    #And User_611 Enter the date of FRR value date
    And User_611 Add the Margin values in Margin
    And User_611 Add all the Above limit values
    And User_611 Save all the values when limits are add
    And User_611 Click the validate button when all the values are saved
    And User_611 Click the Approve level1 screen under request for financing
    And User_611 Enter the request code in search box
    And User_611 Double tap the request code value
    #And User_611 Click the customer grading recommendation under maintenance screen
    #And User_611 Click the decision dropdown and select forward menu
    #And User_611 click the Approval committe dropdown
    #And User_611 Click the investment committe under Approval committe
    #And User_611 Approve the decision under relationship
    #And User_611Click the Approval Committee Recommendation under request for financing
    #And User_611 Enter the request code in approval committe search box
    #And User_611 double tap the request code
    #And User_611 Click the credit committee recommendation
    #And User_611 Click the recommendation under credit committee recommendation
    #And User_611 Click the recommendation add symbol under recommendation
    #And User_611 double tap all the value we created
    #And User_611 send back the recommendation  value
    #And User_611 Click the Maitenance level in send back level
    #And User_611 Confirm the recommendation popup menu
    #And User_611 Accept the recommendation popup menu
    #And User_611 Click the maintenance screen under request for financing
    #And User_611 Enter the created request code in search box
    #Then User_611 double tap the  created request code
    
    @585803_FMS_Param
  Scenario: Check that the “Estimators” are reflected at the level of Application for Financial Facilities
    Given navigate to FMS param application and login with valid credentials
    And Click the parameters menu in param application
    And click the estimators menu under parameters
    And click  the maintenance under estimators
    And create a estimator code
    And Enter the value of firstbrief discription
    And Enter the value of firstlong discription
    And Enter the value of secondbrief discription
    And Enter the value of secondlong discription
    And Enter the discription address
    And Enter the mobile number
    And Enter the postal code
    Then Save all the estimators details
    And Click the approve Menu
    And Enter a code under approve menu
    Then Approve the final status

  @585803_FMS_Core
  Scenario: Check that the “Estimators” are reflected at the level of Application for Financial Facilities
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
    And User_611 Click the doucmentdetailstab
    And User_611 Click the estimators search box
    Then User_611 Enter the estimators code
    
    @127917
  Scenario: Check the floating rate,floatingrate periodicity and floatingrate periodicitytype retrived from IIs param screen
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
    And User_611 Enter the Product class value two
    And User_611 Enter the floating rate
    And User_611 Enter the floating rate periodicity
    And User_611 Enter the floating rate periodicity type
    
    @127925
  Scenario: To check the new modification @ FMS Standard screens in the  Application for finance screen.
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
    And User_611 Enter the Product class value two
   	And User_611 Enter the floating rate
    And User_611 Enter the floating rate periodicity
    And User_611 Enter the floating rate periodicity type
    And User_611 Click the add button
    And User_611 Click the doucmentdetailstab
    And User_611 Enter the value for solicitorname
    And User_611 Enter the value for estimators name
    And User_611 clicks the save button
    And User_611 clicks the validate button
    And User_611 clicks the Approve Level1 link
    
    @127926
  Scenario: Floating rates details are retrived all the menu under Wifak application
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
    And User_611 Enter the Product class value two
   	And User_611 Enter the floating rate
    And User_611 Enter the floating rate periodicity
    And User_611 Enter the floating rate periodicity type
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
    
   @808942_Fmsparam
    Scenario: MFI190036 - FMS_DrawDown_DD Additional Details_VAT Flag
    Given navigate to FMS param application and login with valid credentials
  #And User_611 get the test data for test case AT_AFF_098_FMSParam
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
	And User_611 check the Credit Authorization flag
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


   @808942_Fms_Core
   Scenario: MFI190036 - FMS_DrawDown_DD Additional Details_VAT Flag 
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
    And User_611 clicks the Facility Limit Details Tab
    And User_611 clicks the Draw Down Request Menu
    And User_611 clicks the maintenance Under Draw Down Request Menu
    And User_611 enter the facility Reference Code
    And User_611 enter the Draw Down Type
    And User_611 enter the Discription English
    And User_611 enter the Discription Arab
    And User_611 enter the date in value date
    And User_611 clicks the Draw Down Additional details
    And User_611 enter the Product class L and N value
    Then User_611 Validate the Draw Down Request Vat yield
    
    @841963_Fms_Core
    Scenario: BMO190096 - Incorrect description of Facility Limit information
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
    And User_611 clicks the Facility Limit Details Tab
    And User_611 clicks the Draw Down Request Menu
    And User_611 clicks the maintenance Under Draw Down Request Menu
    And User_611 enter the facility Reference Code
    And User_611 enter the Draw Down Type
    And User_611 enter the Discription English
    And User_611 enter the Discription Arab
    And User_611 enter the date in value date
    And User_611 clicks the Draw Down Additional details
    And User_611 enter the Product class L and N value
    Then User_611 Validate the Product Class L and N is displayed
    
    @127874_Fms_Core
    Scenario: Link the facility to IIS
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
    
    @127878_Fms_Core
    Scenario: Link the facility to IIS  on 01/03/2012
    Given navigate to FMS application and login with valid credentials
    And User_611 Get the data set Id for AT_FM_056
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
    
    @586558_Fms_param
    Scenario: Check that facility risk rating is developed with all the standard IMAL features like Maintenance/create/update/delete/list.
    Given navigate to FMS param application and login with valid credentials
    And User_611 Clicks the Parameter under Parameter Application
    And User_611 Clicks the Facility Risk Rating under Parameter Application
    And User_611 Clicks the Maintenance under Facility Risk Rating
    And User_611 Clicks the add button to add the values
    And User_611 Enter the Rating value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Brief Discription value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Brief Discription in Arab under Facility Risk Rating Maintenance screen
    And User_611 Enter the Long Discription value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Long Discription in Arab under Facility Risk Rating Maintenance screen
    And User_611 Enter the Mininum value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Maximum value under Facility Risk Rating Maintenance screen
    And User_611 Delete the Record
    And User_611 Clicks the add button to add the values
    And User_611 Enter the Rating value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Brief Discription value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Brief Discription in Arab under Facility Risk Rating Maintenance screen
    And User_611 Enter the Long Discription value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Long Discription in Arab under Facility Risk Rating Maintenance screen
    And User_611 Enter the Minninum value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Maxximum value under Facility Risk Rating Maintenance screen
    And User_611 Update all the Facility Risk Rating Values 
    
    
    @586558_Fms_Core
    Scenario: Check that facility risk rating is developed with all the standard IMAL features like Maintenance/create/update/delete/list.
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
    And User_611 Validate the Param Facility rating under facility type details
   
    
    @586526_Fms_param
    Scenario: Check the availability of “Facility Risk Rating” screen under the parameter menu option
    Given navigate to FMS param application and login with valid credentials
    And User_611 Clicks the Parameter under Parameter Application
    And User_611 Clicks the Facility Risk Rating under Parameter Application
    And User_611 Clicks the Maintenance under Facility Risk Rating
    
    @586526_Fms_Core
    Scenario: Check the availability of “Facility Risk Rating” screen under the parameter menu option
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
    And User_611 Validate the facility Rating
    
    @586527_Fms_param
    Scenario: Check that the Facility Risk Rating main option contains the below sub options
    Given navigate to FMS param application and login with valid credentials
    And User_611 Clicks the Parameter under Parameter Application
    And User_611 Clicks the Facility Risk Rating under Parameter Application
    And User_611 Clicks the Maintenance under Facility Risk Rating
    And User_611 Clicks the add button to add the values
    And User_611 Enter the Raating value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Brief Discription value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Brief Discription in Arab under Facility Risk Rating Maintenance screen
    And User_611 Enter the Long Discription value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Long Discription in Arab under Facility Risk Rating Maintenance screen
    And User_611 Enter the Mininumm value under Facility Risk Rating Maintenance screen
    And User_611 Enter the Maximumm value under Facility Risk Rating Maintenance screen
    
    
    
    
    