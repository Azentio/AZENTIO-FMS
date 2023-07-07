Feature: Title of your feature
  I want to use this template for my feature file

  @127727
  Scenario: 2. Check whether the user can create Vehicle collateral Type
   Given navigate to FMS param application and login with valid credentials
    And Click on the Parameters menu
    And User_607 Click Collateral Type under Parameters
    And User_607 Click Mainteance Under Collateral Type
    And User_607 Enter Code In Mainteance Under Collateral Type
    And User_607 Enter brief Description In Mainteance Under Collateral Type
    And User_607 Enter long Description In Mainteance Under Collateral Type
    And User_607 Enter Two input in empty field In Mainteance Under Collateral Type
    And User_607 Enter Facility Coverage In Mainteance Under Collateral Type
    And User_607 Check apply favoring party In Mainteance Under Collateral Type
    And User_607 Select assert type In Mainteance Under Collateral Type
    And User_607 Save the record In Mainteance Under Collateral Type
    
    And User_607 Click Approve Under Collateral Type
    And User_607 Search the record in Approve Under Collateral Type
    And User_607 Select the record in Approve Under Collateral Type
    And User_607 Approve the record in Approve Under Collateral Type
    And User_607 Click Update After Approve Under Collateral Type
    And User_607 Search the record in Update After Approve Under Collateral Type
    And User_607 Select the record in Update After Approve Under Collateral Type
    And User_607 Update the brief Description in Update After Approve Under Collateral Type
    And User_607 Update the record in Update After Approve Under Collateral Type
    And User_607 Again Click Approve Under Collateral Type
    And User_607 Search the record in Approve Under Collateral Type
    And User_607 Select the record in Approve Under Collateral Type
    And User_607 Approve the record in Approve Under Collateral Type
    
    @127734
    Scenario: Check whether the Collateral Management” screen is displaying when the user click on Query button
    Given navigate to FMS application2 and login with valid credentials
    And User_607 Click Collateral Management under Menu Options 
    And User_607 Click query under Collateral Management
    And User_607 Select the record in query under Collateral Management
    And User_607 Check the field are Non editable in query
    And User_607 Check the records in query
    
    @CreateCollateral
    Scenario: Collateral Query button display
    Given navigate to FMS application2 and login with valid credentials
    And User click on the Collateral Management feature
		And User click on the Maintanace screen under Collateral Management
		And User enter the Collateral type under main information in Collateral Management main Screen
		And User give the valid from date under main information in Collateral Management main Screen
		And User give the valid to date under main information in Collateral Management main Screen
		And User enter the Collateral currency under main information in Collateral Management main Screen
		And User enter the brief description under main information in Collateral Management main Screen
		And User enter the long description under main information in Collateral Management main Screen
		And User move to the Collateral cash details tab in Collateral Management main Screen
		And User click the add new icon under Collateral cash details tab
		And User click the additional reference lookup under Collateral cash details tab
		And User select the any cy value under additional reference lookup
		And User enter the amount value under Collateral cash details tab
		When User click the save button under Collateral Management main Screen
		And User move to the Approve screen undrer Collateral Management
		And User click the clear button under approve screen in Collateral Management
		And User double click on the first row in approve screen
		When User click the approve button under Collateral Management approve screen
		
    @127735
    Scenario: Collateral Query button display
    Given navigate to FMS application2 and login with valid credentials
    And User click on the Collateral Management feature
		And User click on the Maintanace screen under Collateral Management
		And User enter the Collateral type under main information in Collateral Management main Screen
		And User give the valid from date under main information in Collateral Management main Screen
		And User give the valid to date under main information in Collateral Management main Screen
		And User enter the Collateral currency under main information in Collateral Management main Screen
		And User enter the brief description under main information in Collateral Management main Screen
		And User enter the long description under main information in Collateral Management main Screen
		And User move to the Collateral cash details tab in Collateral Management main Screen
		And User click the add new icon under Collateral cash details tab
		And User click the additional reference lookup under Collateral cash details tab
		And User select the any cy value under additional reference lookup
		And User enter the amount value under Collateral cash details tab
		When User click the save button under Collateral Management main Screen
		And User move to the Approve screen undrer Collateral Management
		And User click the clear button under approve screen in Collateral Management
		And User double click on the first row in approve screen
		When User click the approve button under Collateral Management approve screen
    
    @127735_2
    Scenario: Collateral Query button display
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 583228
    And Click Application for financial facilities
    And Click Maintenance
    And Click and Select Application for
    And Search CIF No
    And Enter codeOn Facility Type
    And Enter Code In Country of Financing
    And Enter line Code On Facility Rating
    And Click on additional Details
    And Enter the Total Value
    And Click Offer Expiration SelectDate
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
    And User_607 Click Collateral details in application For Financial Facilites 
    And User_607 Click AddButtonn In Collateral details in application For Financial Facilites
    And User_607 Select First Row In Collateral details in application For Financial Facilites
    And User_607 Enter Collateral In collateral details in application For Financial Facilites
    And User_607 Click Ok After Link collateral In Collateral details
    And Click save button on limit details
    And User move to the Document details tab
    And User enter the Solicitor Name
    And User enter the Estimator Name
    And User clicks the save button
    And User clicks the validate button
    And User clicks the Approve Level1 link
		And User retrive the first data in approve level1
		And User select the level1 devision as approve
		And User clicks on the level1 submit button
		And User clicks the Approve Level2 link
		And User retrive the first data in approve level2
		And User select the level2 devision as approve
		And User clicks on the level2 submit button
		And User clicks the Approve Level3 link
		And User retrive the first data in approve level3
		And User select the level3 devision as approve
		And User clicks on the level3 submit button
		
		@127735_3
		Scenario: Collateral Query button display
    And Click Facilitie Managementunder wifakApplication
		And click Maintenance under Facilities Managementunder
		And select recordIn Maintenance under Facilities Management
    And User_607 Click facility Limit Details
    And User_607 Select product class in facility Limit Details
    And User_607 Click Collateral Details in mainteance under Facility Management
    And User_607 Select row in Collateral Details
    And User_607 Click Query button in Collateral Details
    And User_607 Check Collateral Details are present
  
    
    @127765
    Scenario: Open the facility management screen and link a collateral
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    #And User update test data for test case no 583228
    #And Click Application for financial facilities
    #And Click Maintenance
    #And Click and Select Application for
    #And Search CIF No
    #And Enter codeOn Facility Type
    #And Enter Code In Country of Financing
    #And Enter line Code On Facility Rating
    #And Click on additional Details
    #And Enter the Total Value
    #And Click Offer Expiration SelectDate
    #And Select limit Details
    #And Click Add button on limit Detail
    #And Enter ValueOn Product Class
    #And AfterEnter ValueOn Product Class Search
    #And Click Add button AfterEnter Value On Product Class
    #And User_607 Click Collateral details in application For Financial Facilites 
    #And User_607 Click AddButtonn In Collateral details in application For Financial Facilites
    #And User_607 Select First Row In Collateral details in application For Financial Facilites
    #And User_607 Enter Collateral In collateral details in application For Financial Facilites
    #And User_607 Click Ok After Link collateral In Collateral details
    #And Click save button on limit details
    #And User move to the Document details tab
    #And User enter the Solicitor Name
    #And User enter the Estimator Name
    #And User clicks the save button
    #And User clicks the validate button
    #And User clicks the Approve Level1 link
#		And User retrive the first data in approve level1
#		And User select the level1 devision as approve
#		And User clicks on the level1 submit button
#		And User clicks the Approve Level2 link
#		And User retrive the first data in approve level2
#		And User select the level2 devision as approve
#		And User clicks on the level2 submit button
#		And User clicks the Approve Level3 link
#		And User retrive the first data in approve level3
#		And User select the level3 devision as approve
#		And User clicks on the level3 submit button
		
		@127765_2
		Scenario: Open the facility management screen and link a collateral
		Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
		And Click Facilitie Managementunder wifakApplication
		And click Maintenance under Facilities Managementunder
		And User_607 Search Application Ref In mainteance under Facility Management
		And User_607 Check CIF no In mainteance under Facility Management
		And User_607 Click Additional Detail Tab In mainteance under Facility Management
		And User_607 Change Effective Until In Additional DetailTab In mainteance under Facility Management
		And User_607 Change Unutilized Expiry Date In Additional DetailTab In mainteance under Facility Management
		And User_607 Click facility Limit Details Tab In mainteance under Facility Management
		And User_607 Select Product Class In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Click collateral Details button In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Click Add button In collateral Details In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Select First Line In collateral Details In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Click Ok In collateral Details In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Save the Record In mainteance under Facility Management
    And User_607 Click Approve Reject under Facility Management
    And User_607 Search record in approve Reject under Facility Management
    And User_607 Select Record In approve Reject under Facility Management
    And User_607 Click Approve button In approve Reject under Facility Management
    
    
    
    @127773
    Scenario: Open the facility management screen and link a collateral
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
		And Click Facilitie Managementunder wifakApplication
		And click Maintenance under Facilities Managementunder
		And User_607 Search Application Ref In mainteance under Facility Management
		And User_607 Check CIF no In mainteance under Facility Management
		And User_607 Click Additional Detail Tab In mainteance under Facility Management
		And User_607 Change Effective Until In Additional DetailTab In mainteance under Facility Management
		And User_607 Change Unutilized Expiry Date In Additional DetailTab In mainteance under Facility Management
		And User_607 Click facility Limit Details Tab In mainteance under Facility Management
		And User_607 Select Product Class In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Click collateral Details button In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Click Add button In collateral Details In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Select First Line In collateral Details In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Click Ok In collateral Details In facility Limit Details Tab In mainteance under Facility Management
		And User_607 Save the Record In mainteance under Facility Management
    And User_607 Click Approve Reject under Facility Management
    And User_607 Search record in approve Reject under Facility Management
    And User_607 Select Record In approve Reject under Facility Management
    And User_607 Click Approve button In approve Reject under Facility Management
    
    And User_607 Cloce WIFAK APPLICATION WIFAKAPPLICATION Facilities Management Maintenance tab 
    And click Maintenance under Facilities Managementunder
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    