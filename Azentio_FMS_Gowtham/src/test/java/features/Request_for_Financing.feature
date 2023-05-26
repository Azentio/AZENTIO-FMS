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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
