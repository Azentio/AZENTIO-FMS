@tag
Feature: Title of your feature
  I want to use this template for my feature file

   @586488
    Scenario: 36. Check that the list screen displays all the data within the search range
    Given navigate to FMS param application and login with valid credentials
    And Click on the Parameters menu
    And User_607 Update test data for test case no 586488
    And User_607 Click Financial Indicators under Parameters 
    And User_607 Click Mainteance Under Financial Indicators
    And User_607 Check Code In Mainteance Under Financial Indicators
    
    @586449
		Scenario:5. Check that user cannot able to enter the duplicate value in code field
		Given navigate to FMS param application and login with valid credentials
		And User_607 Update test data for test case no 586449
    And Click on the Parameters menu
    And User_607 Click Financial Indicators under Parameters 
    And User_607 Click Mainteance Under Financial Indicators
		And User_607 Check duplicate Code not allow In Mainteance Under Financial Indicators
		
		
		
		
		
		
		