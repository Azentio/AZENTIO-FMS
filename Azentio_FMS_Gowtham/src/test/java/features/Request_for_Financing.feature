Feature: Title of your feature
  I want to use this template for my feature file

  @669589
  Scenario: BMK180027
    Given navigate to FMS application2 and login with valid credentials
    And Click Request for financin
    And Click Request for financing
    And Goto maintenace
    And Select Reason For Submission
    And Enter value on Existing Facility No
    And Click group limit
    And Click add button on group limit
    And Enter first GroupID
    And Enter first Group limit
    And Enter first Group name
    And Enter Second GroupID
    Then Enter Second Group limit

  @666615
  Scenario: AMANA180343
    Given navigate to FMS param application and login with valid credentials2
    And Click on the Parameters menu
    Then Click on the Facility Type submenu
    And Click on the Update After Approve screen
    Then Search for the Code in Update After Approve screen
    And Click the Code in Update After Approve screen
    Then Click the Facility Details tab in update after approve screen

  @664435
  Scenario: BTII180015
    Given Login into CSM Application
    And Click Request on FMS Core
    And Click request management under request
    And Click management process branch under request management
    And Select first approve status detail
    And Click process button in management process branch tab

  @6644352
  Scenario: BTII180015
    Given navigate to FMS application2 and login with valid credentials
    And Click on baj application
    And Click Application Under baj application
    And Click Application For Financial Facilities under application
    And Click Maintenance Under Application For Financial Facilities
    And Click Search button on Maintenance tab
    And Enter Request No
    And Double ClickOn Request no
    And Enter anything on Additional Reference
    And Click validate button on down
    
    
    @652870
		 Scenario: TSR - BTII180030
		 Given navigate to FMS application2 and login with valid credentials
		  And Click Collateral Management
      And Click maintenance under Collateral Management
      And Click search on maintenance screen
      And Click and enter CIF 
      And After enter CIF find if any alphabetic in ID number
    
    @652912
    Scenario: TSR - BTII180039
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Facilities Management under WIFAK APPLICATION
    And Click cancel under Facilities Management
    And Select the existing record
    And Cancel the record
    And Click approve reject cancel under WIFAK APPLICATION
    And Select the record
    And Click approve cancel button on approve reject cancel Screen
    And Click maintenance under WIFAK APPLICATION
    And Select the record on maintenance screen
    Then Check the Status its on cancel
    
   
    @636958
    Scenario: TSR - EWB180031
     Given navigate to FMS application2 and login with valid credentials
     And Click Request for financin
     And Click Request for financing
     And Goto maintenace
     And click the reason for submission search box
     And click the customer search box
    And click the facility type details
    And Enter the facility type code under facility type
    And Enter the total limit under global limit
    And Click the Disbursement Sublimit under maintenance screen
    And Add the limits under Disbursement Sublimit
    And Add the product class values in product searchbox
    And Change the month in tenure
    And Add the Margin values in Margin
    And Add all the Above limit values
    And Save all the values when limits are add
    And Confirm the popup menu when all the limits are saved
    And Click the final save popup message
    And Click Repayment plan button in maintance screen
    And Click Create Schedule button
    And Click the validate button when all the values are saved
    And Confirm the validate popup menu
    And Click the final validate popup
   
  
    @6369582
    Scenario: TSR - EWB180031
    Given navigate to FMS application2 and login with valid credentials
     And Click Request for financin
     And Click Request for financing
    And Click the Approve level1 screen under request for financing
    And Search the value in approve1
    And Select the record in approve1
    And Reject the record in Approve level1 
    And enter the reason for rejection
    And Click Reopen Rejected Applications Under request for financing
    And Click mainteance under Reopen Rejected Applications
    And Select the reopen record mainteance under Reopen Rejected Applications
    And Reopen the rejected record
    #And Goto maintenace
    #And Take the reopen record under mainteance 
    And Click Approve rejection under Reopen Rejected Applications
    And Select the rejected record in  Reopen Rejected Applications
    And Approve the reopen request
    And click mainteance under request for financing
    And select the record in the mainteance under request for financing
    And Click the Disbursement Sublimit under maintenance screen
    And Select the exesting product class 
    And change the months
    Then After Changes save it
    
    
    @583228
		Scenario: Exception error in Production
		Given navigate to FMS application2 and login with valid credentials
		And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 949677
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
    And Click save button on limit details
    And User move to the Document details tab
    And User enter the Solicitor Name
    And User enter the Estimator Name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
		And User retrive the first data in approve level1
		And User select the level1 devision as approve
		And User clicks on the level1 submit button
		And User clicks the Approve Level2 link
		And User retrive the first data in approve level2
		And User select the level2 devision as approve
		And User clicks on the level2 submit button
		And User clicks the Approve Level3 link
		And User retrive the first data in approve level3
		And User select the level3 devision as approve
		And User clicks on the level3 submit button
    
    
    	
	  @636898
   Scenario: TSR - BIPL180002
		Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 949677
    And Click Application for financial facilities
    And Click Maintenance
    And User select the application for dropdown as decrease in main screen
		And User enter the input as Existing Facility Ref in main screen
		And Enter line Code On Facility Rating
    And Click on additional Details
		And User enter the total value under additional info tab
		And User validate the finance amount should be decresed based on total value
		And Click Offer Expiration SelectDate
    And Select limit Details
		And User validate the Facility value and CV value should be changed same as decreased finance amount under limit details
		And User double click on the product class under limit details
		And User click the clean flag under product calss in limit details tab
		And User click the edit button under product class in limit details tab
	  And User move to the Document details tab
    And User enter the Solicitor Name
    And User enter the Estimator Name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
		And User retrive the first data in approve level1
		And User select the level1 devision as approve
		And User clicks on the level1 submit button
		And User clicks the Approve Level2 link
		And User retrive the first data in approve level2
		And User select the level2 devision as approve
		And User clicks on the level2 submit button
		And User clicks the Approve Level3 link
		And User retrive the first data in approve level3
		And User select the level3 devision as approve
		And User clicks on the level3 submit button 
		And Click Maintenance
		And User select the application for dropdown as decrease in main screen
		And User enter the input as Existing Facility Ref in main screen
		And Click on additional Details
		And Enter Total value on additional Details
		And Change Total value and down payment
    
 
    
  @749113
  Scenario: TSR - NIZ180070
  Given navigate to FMS application2 and login with valid credentials
  And Click Wifak Application first
  And Click Wifak Application Second
  And Click Grading under Wifak Application
  And Click Maintenance under Grading
  
  
  @749102
   Scenario: TSR - AIBBI180296
   Given navigate to MTS application and login with valid credentials
   And Click Parameters in MTS
   And Click Batch under parameters
   And Click Maintenance underBatch 
   And Enter additionalReference
   And Enter briefName in main information
   And Enter Long name in main information
   And Select batchPeriodicity in main information
   And Check head office in batch details 
   And Click FC limit in Facility Management
   And Click save button after adding details in mainteance
   And Click Approve under Batch
   And Select the record from Approve
   And Approve the record on approve screen
   And Select Process under menu
   And Select batch Process under process
   And Select the approved record under process
   And Select record under Branches status
   And Run the record
   Then Check the Execution Status
   
   @749155
   Scenario: SUPT180347 - Users are able to choose Decision and Send Back level simultaneously
   Given navigate to FMS application2 and login with valid credentials
   And Click request under menu 
   And Click request financing
   And Click request for financing under request financing
   And Click Approve level1 under request for financing
   And Select the record from approve level1
   And Select Customer Grading Recommendations tab 
   And Select decision in approve level 
   And approve the record
   And Click Approval Committee Recommendations under	request for financing
   And Select the Approved record 
   And click credit Committee Recommendations Tab
   And click Recommandations In credit Committee Recommendations Tab
   And Click the Add button in Recommandations
   Then Check the send back level visibility
   
   @748962
   Scenario: TSR - NIZ180070:
   Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 949677
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Select select oneOff inFacility Type Details
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
    And Click save button on limit details
    And User move to the Document details tab
    And User enter the Solicitor Name
    And User enter the Estimator Name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
		And User retrive the first data in approve level1
		And User select the level1 devision as approve
		And User clicks on the level1 submit button
		And User clicks the Approve Level2 link
		And User retrive the first data in approve level2
		And User select the level2 devision as approve
		And User clicks on the level2 submit button
		And User clicks the Approve Level3 link
		And User retrive the first data in approve level3
		And User select the level3 devision as approve
		And User clicks on the level3 submit button
		And Click Facilitie Managementunder wifakApplication
		And click Maintenance under Facilities Managementunder
		And select recordIn Maintenance under Facilities Management
		And Get Application code from the record
		And Click drawDown request under wifakApplication
		And Click Mainteance under drawDown request
		And Enter Facility Reference code
		And Enter drawdown type
		And Enter Description English and date
		And Click Drawdown Additional Details tab
		And Enter value Product ClassLN
		And Click save button IndrawDown Additional Details tab
		And Click verifyAndDeny under drawDownRequest
		And Select Record verifyAndDeny under draw Down Request
		And Click verify button In verifyAndDeny
		And Click Approve Reject under drawdown
		And Select Record In Approve Reject under drawdown
		And Approve The record In Approve Reject under drawdown
#		before goto facility closure need to create deal for this facility in irts
		And Click Facility Closure Request under drawdown
		And Click Mainteance under Facility Closure Request under drawdown
		And Enter Facility Reference In Mainteance under Facility Closure Request
		
		
		 @7489622
   Scenario: TSR - NIZ180070:
   Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
		And Click Facilitie Managementunder wifakApplication
		And click Maintenance under Facilities Managementunder
		And select recordIn Maintenance under Facilities Management
		And Get Application code from the record
		And Click drawDown request under wifakApplication
		And Click Mainteance under drawDown request
		And Enter Facility Reference code
		And Enter drawdown type
		And Enter Description English and date
		And Click Drawdown Additional Details tab
		And Enter value Product ClassLN
		And Click save button IndrawDown Additional Details tab
		And Click verifyAndDeny under drawDownRequest
		And Select Record verifyAndDeny under draw Down Request
		And Click verify button In verifyAndDeny
		And Click Approve Reject under drawdown
		And Select Record In Approve Reject under drawdown
		And Approve The record In Approve Reject under drawdown
#		before goto facility closure need to create deal for this facility in irts
		And Click Facility Closure Request under drawdown
		And Click Mainteance under Facility Closure Request under drawdown
		And Enter Facility Reference In Mainteance under Facility Closure Request
		
		
		
		
		
   
   
   
   
   
   
   
   
   
   
   
   
   
    
