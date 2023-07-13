Feature: RepaymentPlan
@956327
Scenario: SUPT190406 - Getting error while clicking on the repayment plan _BMO180218
		Given navigate to FMS application and login with valid credentials
    And User_611 Get the data set Id for AT_RP_001
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
    #And User_611 Enter the currency code under Additional details
    And User_611 Enter the total value under Additional details
    And User_611 Enter the Expiry date
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And User_611 Clicks the product class value one
    And User_611 Click the add button
    And User_611 clicks the save button
    And User_611 Click the Application Facility Limit Details Row for Repayment Tab Enabled
    And User_611 Clicks the Repayment Plan Tab
    And User_611 Validate the Repayment Plan Tab is Open or Not
    
    #need to clarify date details
    @651656 
    Scenario: BMOUPI180205 - Last Installment in Repayment Plan Bug 379428
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
    And User_611 clicks the save button
    And User_611 Click the Application Facility Limit Details Row for Repayment Tab Enabled
    And User_611 Clicks the Repayment Plan Tab
    
    @594207
    Scenario: BMOUPI170721 - Repayment Plan Creation, Saving and Retrieval slowness in FMS by using IE 11.0.9600.18816
    Given navigate to FMS application and login with valid credentials
    And User_611 Get the data set Id for AT_RP_003
   	And User_611 Click the first Wifak Application
    And User_611 Click the second Wifak Application
    And User_611 Click the application for financial facilities under second Wifak Appliaction
    And User_611 Click the maintenance under application for financial facilities
    #And User_611 Click the Main information
    And User_611 Select a new facility under application
    And User_611 Enter the CIF num under cif details
    And User_611 Enter the facility type under facility type details
    And User_611 Enter the country of financing under facility type details
    And User_611 Enter the facility rating under facility type details
    And User_611 Click the Additional details
    #And User_611 Enter the currency code under Additional details
    And User_611 Enter the total value under Additional details
    And User_611 Enter the Expiry date
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And User_611 Clicks the product class value one
    And User_611 Click the add button
    And User_611 clicks the save button
    And User_611 Click the Application Facility Limit Details Row for Repayment Tab Enabled
    And User_611 Clicks the Repayment Plan Tab
    And User_611 Enter the No Of Payment Number under repayment plan page
    And User_611 Click the create schedule button
    And User_611 validate the No Of Payment is created or Not 
    
    @816212
    Scenario: ABSAI190039 - Difference in FMS and IIS re payment plan
    Given navigate to FMS application and login with valid credentials
    And User_611 Get the data set Id for AT_RP_003
   	And User_611 Click the first Wifak Application
    And User_611 Click the second Wifak Application
    And User_611 Click the application for financial facilities under second Wifak Appliaction
    And User_611 Click the maintenance under application for financial facilities
     And User_611 Select a new facility under application
    And User_611 Enter the CIF num under cif details
    And User_611 Enter the facility type under facility type details
    And User_611 Enter the country of financing under facility type details
    And User_611 Enter the facility rating under facility type details
    And User_611 Click the Additional details
    And User_611 Enter the total value under Additional details
    And User_611 Enter the Expiry date
    And User_611 Click the limit details tab
    And User_611 Click the add button under limit details tab
    And User_611 Clicks the product class value one
    And User_611 Click the add button
    And User_611 clicks the save button
    And User_611 Click the Application Facility Limit Details Row for Repayment Tab Enabled
    And User_611 Clicks the Repayment Plan Tab