Feature: To Test the Financial facilities in FMS Application

  #@127917 need to del
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
