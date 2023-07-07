Feature: To Test the Financial facilities in FMS Application
    
    @140601
    Scenario: Checking the Alert functionality at the level of Draw Down Request screens
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
    And User_611 Validate the Product Class L and N is displayed
    
    @316166
    Scenario: 2.1-To check the-New Parameter ‘Maintain Reason’ and its DDLB values