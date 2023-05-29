Feature: To Test the Financial facilities in FMS Application

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
    And Click the first Wifak Appliaction
    And Click the second Wifak Appliaction
    And Click the application for financial facilities under second Wifak Appliaction
    And Click the maintenance underapplication for financial facilities
    And Click the Main information
    And Select a new facility under application
    And Enter the CIF num under cif details
    And Enter the facility type under facility type details
    And Enter the country of financing under facility type details
    And Enter the facility rating under facility type details
    And Click the Additional details
    And Enter the currency code under Additional details
    And Enter the total value under Additional details
    And Click the Document details
    And Click the estimators search box
    Then Enter the estimators code

  @127917
  Scenario: Check the floating rate,floatingrate periodicity and floatingrate periodicitytype retrived from IIs param screen
    Given navigate to FMS application and login with valid credentials
    And Click the first Wifak Appliaction
    And Click the second Wifak Appliaction
    And Click the application for financial facilities under second Wifak Appliaction
    And Click the maintenance underapplication for financial facilities
    And Click the Main information
    And Select a new facility under application
    And Enter the CIF num under cif details
    And Enter the facility type under facility type details
    And Enter the country of financing under facility type details
    And Enter the facility rating under facility type details
    And Click the Additional details
    And Enter the currency code under Additional details
    And Enter the total value under Additional details
    #And Enter the Expiry date
    And Click the limit details tab
    And Click the add button under limit details tab
    And Enter the Product class
    And Enter the floating rate
    And Enter the floating rate periodicity
    Then Enter the floating rate periodicity type

  @127925
  Scenario: To check the new modification @ FMS Standard screens in the  Application for finance screen.
    Given navigate to FMS application and login with valid credentials
    And Click the first Wifak Appliaction
    And Click the second Wifak Appliaction
    And Click the application for financial facilities under second Wifak Appliaction
    And Click the maintenance underapplication for financial facilities
    And Click the Main information
    And Select a new facility under application
    And Enter the CIF num under cif details
    And Enter the facility type under facility type details
    And Enter the country of financing under facility type details
    And Enter the facility rating under facility type details
    And Click the Additional details
    And Enter the currency code under Additional details
    And Enter the total value under Additional details
    And Enter the Expiry date
    And Click the limit details tab
    And Click the add button under limit details tab
    And Enter the Product class
    And Enter the floating rate
    And Enter the floating rate periodicity
    And Enter the floating rate periodicity type
    And Click the add button
    And Click the doucmentdetailstab
    And Enter the value for slicitorname
    And Enter the value for estimators name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
    And User retrive the first data in approve level1
    And User select the level1 decision as Reject
    And User clicks on the level1 submit button
    And user clicks the Reopen Reject menu
    And user clicks the Maintenance menu under reopenrejectmenu
    And user click the search box to retrive the data
    And Click the limit details tab
    And Click the add button under limit details tab

  @127926
  Scenario: Floating rates details are retrived all the menu under Wifak application
    Given navigate to FMS application and login with valid credentials
    And Click the first Wifak Appliaction
    And Click the second Wifak Appliaction
    And Click the application for financial facilities under second Wifak Appliaction
    And Click the maintenance underapplication for financial facilities
    And Click the Main information
    And Select a new facility under application
    And Enter the CIF num under cif details
    And Enter the facility type under facility type details
    And Enter the country of financing under facility type details
    And Enter the facility rating under facility type details
    And Click the Additional details
    And Enter the currency code under Additional details
    And Enter the total value under Additional details
    And Enter the Expiry date
    And Click the limit details tab
    And Click the add button under limit details tab
    And Enter the Product class
    And Enter the floating rate
    And Enter the floating rate periodicity
    And Enter the floating rate periodicity type
    And Click the add button
    And Click the doucmentdetailstab
    And Enter the value for slicitorname
    And Enter the value for estimators name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
    And User retrive the first data in approve level1
    And select the Approve level1 decision as approve
    And User clicks on the level1 submit button
    And User clicks the Approve Level2 link
    And User retrive the first data in approve level2
    And User select the level2 decision as approve
    And User clicks on the level2 submit button
    And User clicks the Approve Level3 link
    And User retrive the first data in approve level3
    And User select the level3 decision as approve
    When User clicks on the level3 submit button

  @678324_FMS_Param
  Scenario: Check that the param purpose of financing will show in FMS Application
    Given navigate to FMS param application and login with valid credentials
    And Click the parameters menu in param application
    And User clicks the Purpose of financing under parameters
    And User clicks the Maintenance under Purpose of financing
    And User Enter a code under maintenance screen
    And User Enter a Addditional number under maintenance screen
    And User Enter a Discription under maintenance screen
    And User clicks the Product class to add
    And User save the Product class details
    And User clicks the approve menu under Purpose of financing
    Then User clicks the final approve

  @678324_FMS_Core
  Scenario: Check that the param purpose of financing will show in FMS Application
    Given navigate to FMS application and login with valid credentials
    And Click the first Wifak Appliaction
    And Click the second Wifak Appliaction
    And Click the application for financial facilities under second Wifak Appliaction
    And Click the maintenance underapplication for financial facilities
    And Click the Main information
    And Select a new facility under application
    And Enter the CIF num under cif details
    And Enter the facility type under facility type details
    And Enter the country of financing under facility type details
    And Enter the facility rating under facility type details
    And Click the Additional details
    And Enter the currency code under Additional details
    And Enter the total value under Additional details
    And Enter the Expiry date
    And Click the limit details tab
    And Click the add button under limit details tab
    And user Clicks the product class value one
    And user clicks the Purpose of financing to retrive the value

  @678142_Fmscore
  Scenario: The system is reversing the off balance sheet entries upon cancelling the facility.
    Given navigate to FMS application and login with valid credentials
    And Click the first Wifak Appliaction
    And Click the second Wifak Appliaction
    And Click the application for financial facilities under second Wifak Appliaction
    And Click the maintenance underapplication for financial facilities
    And Click the Main information
    And Select a new facility under application
    And Enter the CIF num under cif details
    And Enter the facility type under facility type details
    And Enter the country of financing under facility type details
    And Enter the facility rating under facility type details
    And Click the Additional details
    And Enter the currency code under Additional details
    And Enter the total value under Additional details
    And Enter the Expiry date
    And Click the limit details tab
    And Click the add button under limit details tab
    And user Clicks the product class value one
    And user Enter the Customer account details
    And Click the add button
    And Click the doucmentdetailstab
    And Enter the value for slicitorname
    And Enter the value for estimators name
    And User Clicks the charge details
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
    And User retrive the first data in approve level1
    And select the Approve level1 decision as approve
    And User clicks on the level1 submit button
    And User clicks the Approve Level2 link
    And User retrive the first data in approve level2
    And User select the level2 decision as approve
    And User clicks on the level2 submit button
    And User clicks the Approve Level3 link
    And User retrive the first data in approve level3
    And User select the level3 decision as approve
    And User clicks on the level3 submit button
    
     @434947
     Scenario: Check the limit additional details will show in Fms Application Maintenance screen
     And Click the first Wifak Appliaction
    And Click the second Wifak Appliaction
    And Click the application for financial facilities under second Wifak Appliaction
    And Click the maintenance underapplication for financial facilities
    And Click the Main information
    And Select a new facility under application
    And Enter the CIF num under cif details
    And Enter the facility type under facility type details
    And Enter the country of financing under facility type details
    And Enter the facility rating under facility type details
    And Click the Additional details
    And Enter the currency code under Additional details
    And Enter the total value under Additional details
    And Enter the Expiry date
    And Click the limit details tab
    And Click the add button under limit details tab
    And user choose the product class from iis param
    And Enter the floating rate periodicity
    And Click the add button
    And Click the doucmentdetailstab
    And Enter the value for slicitorname
    And Enter the value for estimators name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
    And User retrive the first data in approve level1
    And select the Approve level1 decision as approve
    And User clicks on the level1 submit button
    And User clicks the Approve Level2 link
    And User retrive the first data in approve level2
    And User select the level2 decision as approve
    And User clicks on the level2 submit button
    And User clicks the Approve Level3 link
    And User retrive the first data in approve level3
    And User select the level3 decision as approve
    And User clicks on the level3 submit button
    And user clicks the facility management under wifak application
    And user clicks the update after approve under wifak application
    And user clicks the facility limit details tab
    And Enter the value of Rate and Margin rate
    And Click the add button
    And Click the doucmentdetailstab
    And Enter the value of doucment code dates 
    And User clicks the save button
    And user clicks the Approve menu under facility management
    And user clicks the facility limit details tab
    And User clicks the maintenance under facility management 
    And user clicks the facility limit details tab
    
    
    
    
     
     
   
    
    
    
    
