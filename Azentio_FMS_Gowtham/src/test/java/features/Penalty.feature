Feature: Penalty

	  @555521
	  Scenario: Check whether two new options available under the penalty type dropdown list
    Given navigate to IIS param application and login with valid credentials
    And User update test data for test case no 555521
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Penalty Under Parameters In IISparam
    And User_607 Click Maintenance Under Penalty Under Parameters
    And User_607 Check Profit on Financing Amount available in DropDown Penalty Type Under Maintenance Under Penalty
    And User_607 Check Flat Amount on Due Days available in DropDown Penalty Type Under Maintenance Under Penalty
    
    @555523
    Scenario: Check whether new check box available in penalty screen
		Given navigate to IIS param application and login with valid credentials
		And User update test data for test case no 555523
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Penalty Under Parameters In IISparam
    And User_607 Click Maintenance Under Penalty Under Parameters
    And User_607 Select Profit on Financing Amount available in DropDown Penalty Type Under Maintenance Under Penalty
    And User_607 Check Apply Deal Rate Flag in Maintenance Under Penalty Under Parameters
    #And User_607 Check default value of Apply Deal Rate Flag in Maintenance Under Penalty Under Parameters
    
    @555524
    Scenario: Check the newly added drop down value under the Profit calculation based on field
    Given navigate to IIS param application and login with valid credentials
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Penalty Under Parameters In IISparam
    And User_607 Click Maintenance Under Penalty Under Parameters
    And User_607 Check Penalty Calculation Based on in Maintenance Under Penalty Under Parameters
    
    @555525
    Scenario: Check New added flag is available under the Profit calculation tab
    Given navigate to IIS param application and login with valid credentials
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Product Class under Parameters IISparam
    And User_607 Click mainteance Under Product Class under Parameters IISparam
    And User_607 Click Profit Calculation In Mainteance Under Product Class
    And User_607 Check Accrue Additional Profit Based On Deal Rate Field In Profit Calculation In Mainteance Under Product Class
    
    @555526
    Scenario: Check the new section added for linking the template for additional interest accrual under the fiscal implication button
    Given navigate to IIS param application and login with valid credentials
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Product Class under Parameters IISparam
    And User_607 Click mainteance Under Product Class under Parameters IISparam
    And User_607 Click Profit Calculation In Mainteance Under Product Class
    And User_607 Click Set Fiscal implication In Profit Calculation In Mainteance Under Product Class
    And User_607 Check Additional Profit Accrual field available or not
    
    @555527
    Scenario: Check the new drop down value added under the Repayment apportionment under the settlement tab
    Given navigate to IIS param application and login with valid credentials
    And User update test data for test case no 555527
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Product Class under Parameters IISparam
    And User_607 Click mainteance Under Product Class under Parameters IISparam
    And User_607 Click Search button In Mainteance Under Product Class
    And User_607 Search Record In Mainteance Under Product Class
    And User_607 Select Record In Mainteance Under Product Class
    And User_607 Click Additional Information two In Mainteance Under Product Class
    And User_607 Click Settlement In Additional In formation Tab In Mainteance Under Product Class
    And User_607 Click Repayment Apportionment button In Settlement In Additional Information Tab In Mainteance Under Product Class
    And User_607 click Add button In Repayment Apportionment In Settlement In Additional Information Tab In Mainteance Under Product Class
    And User_607 Select First line In Repayment Apportionment In Settlement In Additional Information Tab In Mainteance Under Product Class
    And User_607 Select Product Class Repayment Apportionment In Repayment Apportionment In Settlement In Additional Information Tab In Mainteance Under Product Class
    
    @555528
    Scenario: Check two new fields added under list fields window in the template maintenance screen
    Given navigate to IIS param application and login with valid credentials
    And User_607 Click Parameters under Menu In IISparam
    
    
    
    
    
    
    
  