Feature: Asset Management

  @1077670
  Scenario: Check the columns mentioned in the FRS are available under the button “Link Asset management charges”
    Given navigate to IIS param application and login with valid credentials
    And User_607 get the test data for test ID AT_AM_007
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Product Class under Parameters IISparam
    And User_607 Click mainteance Under Product Class under Parameters IISparam
    And User_607 Click Search In mainteance Under Product Class under Parameters IISparam
    And User_607 Search Record In mainteance Under Product Class under Parameters IISparam
    And User_607 Select Record In mainteance Under Product Class under Parameters IISparam
    And User_607 Click Link Asset Management Charges button In mainteance Under Product Class under Parameters IISparam
    And User_607 Check Code field In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Check Description Field In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Check Flat Amount Field In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Check Allow Edit Field In Link Asset Management Charges In mainteance Under Product Class unde Parameters IISparam

  @1077671
  Scenario: Check the default value and validation for the columns available under Link Asset management charges screen
    Given navigate to IIS param application and login with valid credentials
    And User_607 get the test data for test ID AT_AM_008
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Product Class under Parameters IISparam
    And User_607 Click mainteance Under Product Class under Parameters IISparam
    And User_607 Click Search In mainteance Under Product Class under Parameters IISparam
    And User_607 Search Record In mainteance Under Product Class under Parameters IISparam
    And User_607 Select Record In mainteance Under Product Class under Parameters IISparam
    And User_607 Click Link Asset Management Charges button In mainteance Under Product Class under Parameters IISparam
    And User_607 Click Add button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Select Line In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Click delete button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Cancel button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Click Link Asset Management Charges button In mainteance Under Product Class under Parameters IISparam
    And User_607 Click Add button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Select Line In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Search Code without flat amount In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Check Cannot Proceed In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Search Code define charge code amount In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Flat Ammount In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Select Allow Edit In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam
    And User_607 Click Ok button In Link Asset Management Charges In mainteance Under Product Class under Parameters IISparam

  @1080828
  Scenario: Check the availability of the new menu added under the Asset Management screen for Asset Repossession/Return with sub menu options like Maintenance, verify, approve, query and reverse
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_AM_009
    And User_607 Click Asset Management under Menu Options
    And User_607 Click Asset Repossession Return under Asset Management
    And User_607 Click Mainteance Under Asset Repossession Return
    And User_607 Check the new values are available in Repossession Type field
    And User_607 Click Query Under Asset Repossession Return
    And User_607 Check Query Screen open without any Error
    And User_607 Click Verify Under Asset Repossession Return
    And User_607 Check Verify Screen open without any Error
    And User_607 Click Approve Under Asset Repossession Return
    And User_607 Check Approve Screen open without any Error
    And User_607 Click Reverse Under Asset Repossession Return
    And User_607 Check Reverse Screen open without any Error

  @1080829
  Scenario: Check the existing asset repossession screen is renamed to “Asset Management Finalization and is available under the Asset Management screen with sub menu options like Maintenance, verify, approve, query and reverse
    Given navigate to IIS application and login with valid credentials
    And User_607 get the test data for test ID AT_AM_010
    And User_607 Click Asset Management under Menu Options
    And User_607 Click Asset Management Finalization under Asset Management
    And User_607 Click Mainteance Under Asset Management Finalization
    And User_607 Check the new values are available in Repossession Type under field Asset Management Finalization
    And User_607 Click Query Under Asset Management Finalization
    And User_607 Check Query Screen open without any Error under Asset Management Finalization
    And User_607 Click Verify Under Asset Management Finalization
    And User_607 Check Verify Screen open without any Error under Asset Management Finalization
    And User_607 Click Approve Under Asset Management Finalization
    And User_607 Check Approve Screen open without any Error under Asset Management Finalization
    And User_607 Click Reverse Under Asset Management Finalization
    And User_607 Check Reverse Screen open without any Error under Asset Management Finalization
    
   
		 
		 
		 
		 
		 
		 
		 
		 
		 