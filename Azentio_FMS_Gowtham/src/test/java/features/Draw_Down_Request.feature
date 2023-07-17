Feature: Draw Down Request

  @1038989
  Scenario: Check following 4 new fields are added under the Limit Details window of both Applications and Request screen: Down Payment to Vendor %,
    Down Payment to Vendor, Total Down Payment % and Total Down Payment
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 1038989
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
    And User_607 Enter Down Payment to Vendor Percentage In Additional DetailsTab
    And User_607 Check Down Payment to Vendor In Additional DetailsTab
    And User_607 Check Total Down Payment Percentage In Additional DetailsTab
    And User_607 Check Total Down Payment In Additional DetailsTab
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And User_607 Check Down Payment to Vendor Percentage In limit Details
    And User_607 Check Down Payment to Vendor In limit Details
    And User_607 Check Total Down Payment Percentage In limit Details
    And User_607 Check Total Down Payment In limit Details
    And Click Add button AfterEnter Value On Product Class
    And Click Request for financin
    And Click Request for financing
    And Goto maintenace
    And click the reason for submission search box
    And click the customer search box
    And click the facility type details
    And Enter the facility type code under facility type
    And Enter the total limit under global limit
    And User_607 Enter Down Payment to Vendor Percentage In Facility type DetailsTab
    And User_607 Check Down Payment to Vendor In Facility type DetailsTab
    And User_607 Check Total Down Payment Percentage In Facility type DetailsTab
    And User_607 Check Total Down Payment In Facility type DetailsTab
    And Click the Disbursement Sublimit under maintenance screen
    And Add the limits under Disbursement Sublimit
    And Add the product class values in product searchbox
    And User_607 Check Down Payment to Vendor Percentage In DisbursementSubLimit Details
    And User_607 Check Down Payment to Vendor In DisbursementSubLimit Details
    And User_607 Check Total Down Payment Percentage In DisbursementSubLimit Details
    And User_607 Check Total Down Payment In DisbursementSubLimit Details


  @1039017
  Scenario: Check following 4 new fields are added under the Facility Main Information tab of Facility Management screen:
    Down Payment to Vendor %, Down Payment to Vendor, Total Down Payment % and Total Down Payment
    Given navigate to FMS application2 and login with valid credentials
		And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 1039017
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
    And User_607 Enter Down Payment to Vendor Percentage In Additional DetailsTab
    And Select limit Details
    And Click Add button on limit Detail
    And Enter ValueOn Product Class
    And AfterEnter ValueOn Product Class Search
    And Click Add button AfterEnter Value On Product Class
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
		And Click Facilitie Managementunder wifakApplication
		And click Maintenance under Facilities Management
		And select recordIn Maintenance under Facilities Management
		And User_607 Check Down Payment to Vendor Percentage In CIF_Details
    And User_607 Check Down Payment to Vendor In CIF_Details
    And User_607 Check Total Down Payment Percentage In CIF_Details
    And User_607 Check Total Down Payment In CIF_Details
		And User_607 Click Facility Limit Details in facilityMng mainteance
		And User_607 Select Product class record in facilityMng mainteance
		And User_607 Check Down Payment to Vendor Percentage In limitDetails facilityMng mainteance
    And User_607 Check Down Payment to Vendor In limitDetails facilityMng mainteance
    And User_607 Check Total Down Payment Percentage In limitDetails facilityMng mainteance
    And User_607 Check Total Down Payment In limitDetails facilityMng mainteance
		
#	excel pending	
#	need to create 	facility in Request for financin 
		And Click Request for financin 
    And User_607 Click facility Management under Request for financin
    And User_607 Click mainteance facility Management under Request for financin
    And User_607 Search the record in mainteance facility Management under Request for financin
    And User_607 Select the record in mainteance facility Management under Request for financin
    And User_607 Check Down Payment to Vendor in facility Management under Request for financin
    And User_607 Check Down Payment to Vendor percentage in facility Management under Request for financin
    And User_607 Check Total Down Payment in facility Management under Request for financin
    And User_607 Check Total Down Payment Percentage in facility Management under Request for financin
    And User_607 Click facility limit DetailsTab In Mainteance under Request For Financing
    And User_607 Select Record In facility limit DetailsTab In Mainteance under Request For Financing
    And User_607 Check Down Payment to Vendor Percentage In facility limit DetailsTab In Mainteance under Request For Financing
    And User_607 Check Down Payment to Vendor In facility limit DetailsTab In Mainteance under Request For Financing
    And User_607 Check Total Down Payment Percentage In facility limit DetailsTab In Mainteance under Request For Financing
    And User_607 Check Total Down Payment In facility limit DetailsTab In Mainteance under Request For Financing
    
    
  
    @1039018
    Scenario: Check the new fields down payment, down payment to vendor and total down payment details added at the limit details are defaulted to the facility limit details screens
    Given navigate to FMS application2 and login with valid credentials
		And Click Wifak Application first
    And Click Wifak Application Second
    And User update test data for test case no 1039018
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
    And User_607 Check Down Payment percentage in LimitDetails In Application For Financial Facilities
    And User_607 Check Down Payment in LimitDetails In Application For Financial Facilities
    And User_607 Check Down Payment to Vendor Percentage In LimitDetails_In_Application_For_Financial_Facilities
    And User_607 Check Down Payment to Vendor In LimitDetails_In_Application_For_Financial_Facilities
    And User_607 Check Total Down Payment Percentage In LimitDetails_In_Application_For_Financial_Facilities
    And User_607 Check Total Down Payment In LimitDetails_In_Application_For_Financial_Facilities
    
    @1039018_2
    Scenario: Check the new fields down payment, down payment to vendor and total down payment details added at the limit details are defaulted to the facility limit details screens
    Given navigate to FMS application2 and login with valid credentials
    And User update test data for test case no 1039018_2
    And Click Request for financin
    And Click Request for financing
    And Goto maintenace
    And click the reason for submission search box
    And click the customer search box
    And click the facility type details
    And Enter the facility type code under facility type
    And Enter the total limit under global limit
    And Click the Disbursement Sublimit under maintenance screen
    And Add the limits under Disbursement Sublimit
    And Add the product class values in product searchbox
    And User_607 Check Down Payment percentage in LimitDetails In DisbursementSubLimit Details in Request for Financing
    And User_607 Check Down Payment in LimitDetails In DisbursementSubLimit Details in Request for Financing
    And User_607 Check Down Payment to Vendor Percentage In DisbursementSubLimit Details in Request for Financing
    And User_607 Check Down Payment to Vendor In DisbursementSubLimit Details in Request for Financing
    And User_607 Check Total Down Payment Percentage In DisbursementSubLimit Details in Request for Financing
    And User_607 Check Total Down Payment In DisbursementSubLimit Details in Request for Financing
    
    @1105450
    Scenario: Check in ‘Link Template to Product Class/Facility Type’ screen, the header in ‘Details’ button is renamed as ‘Hamish Al Jiddiya / Down Payment’
    Given navigate to FMS param application and login with valid credentials
    And Click on the Parameters menu
    And User_607 Click Link Template to Product Class Facility Type under Parameters
    And User_607 Click Maintenance under Link Template to Product Class Facility Type
    And User_607 Click Details Key in Product Class
    And User_607 Check title On Details Key in Product Class
    And User_607 Click Facility In Maintenance under Link Template to Product Class Facility Type
    And User_607 Click Details Key in Facility Type
    And User_607 Check title On Details Key in Facility Type
    
    
    @1039019
    Scenario: Check 2 new fields are added under the Drawdown Additional Details tab in Draw Down Request: “Down payment to vendor” and "Total Down Payment"
    Given navigate to FMS application2 and login with valid credentials
    And Click Wifak Application first
    And Click Wifak Application Second
    And Click Facilitie Managementunder wifakApplication
		And click Maintenance under Facilities Management
		And User_607 select Approed record In Maintenance under Facilities Management
		And Get Application code from the record
		And Click drawDown request under wifakApplication
		And Click Mainteance under drawDown request
		And Enter Facility Reference code
		And Enter drawdown type
		And Click Drawdown Additional Details tab
    And User_607 Check Down Payment In draw Down Request Additional Details Tab
    And User_607 Check down payment to vendor In draw Down Request Additional Details Tab
    And User_607 Check Total Down Payment In draw Down Request Additional Details Tab
    
    @1039019_2
    Scenario: Check 2 new fields are added under the Drawdown Additional Details tab in Draw Down Request: “Down payment to vendor” and "Total Down Payment"
    Given navigate to FMS application2 and login with valid credentials
    And Click request under menu 
    And Click request financing
    And User_607 Click facility Management Under Request financing
    And User_607 Click mainteance under facility Management
    And User_607 Search Status mainteance under facility Management
    And User_607 Select Record in mainteance under facility Management
    And User_607 Get Record Code In mainteance under facility Management
    And User_607 Click Draw Down Request under facility Management
    And User_607 Click mainteance under Draw Down Request
    And User_607 Enter Code In Facility Reference mainteance under Draw Down Request
    And User_607 Click draw Down Request Addition Details Tabs In mainteance under Draw Down Request
    And User_607 Check Down Payment In Addition Details Tabs In mainteance under Draw Down Request
    And User_607 Check payment to vendor In Addition Details Tabs In mainteance under Draw Down Request
    And User_607 Check Total Down Payment In Addition Details Tabs In mainteance under Draw Down Request
    
    
    
    
    
    
    
		