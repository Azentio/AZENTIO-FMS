Feature: To Test the Financial facilities in FMS Application

  @280446
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
    And Enter the tenure value in tenure
    And Add all the Above limit values
    And Save all the values when limits are add
    And Confirm the popup menu when all the limits are saved
    And Click the final save popup message
    And Click the validate button when all the values are saved
    And Confirm the validate popup menu
    And Click the final validate popup
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
