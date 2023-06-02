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
    # And Click Request Application under Request
    #	  And Click baj Application under Request Application
    #	  And Click approve under baj Application
    #	  And Take first existing record
    #	  And ScrollDown and Approve
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
    And Add the Margin values in Margin
    And Enter the tenure value in tenure
    And Add all the Above limit values
    And Save all the values when limits are add
    And Confirm the popup menu when all the limits are saved
    And Click the final save popup message
    And Click Repayment plan button in maintance screen
    And Click Create Schedule button
    And Click the validate button when all the values are saved
    And Confirm the validate popup menu
    And Click the final validate popup
    And Click the Approve level1 screen under request for financing
    And Select the record in Approve Screen1
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
    
    
    
    
    
    
    
    
    
    
    
