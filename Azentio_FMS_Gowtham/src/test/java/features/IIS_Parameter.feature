Feature: IIS Parameter

  @555528
  Scenario: TS-NIZ170042-001
    Given navigate to IIS param application and login with valid credentials
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Promotion Type Under Parameters In IISparam
    And User_607 Click Mainteance Under Promotion Type Under Parameters In IISparam
    And User_607 Check Code Field In Mainteance Under Promotion Type Under Parameters In IISparam
    And User_607 Check Brief Description Field In Mainteance Under Promotion Type Under Parameters In IISparam
    And User_607 Long Description Field In Mainteance Under Promotion Type Under Parameters In IISparam
    And User_607 Check Brief Description In Arabic Field In Mainteance Under Promotion Type Under Parameters In IISparam
    And User_607 Check Long Description In Arabic Field In Mainteance Under Promotion Type Under Parameters In IISparam

  @572311
  Scenario: TS-NIZ170042-002
    Given navigate to IIS param application and login with valid credentials
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Product Class under Parameters IISparam
    And User_607 Click mainteance Under Product Class under Parameters IISparam
    And User_607 Click Additional Information In Mainteance Under Product Class
    And User_607 Click limit In Additional Information In Mainteance Under Product Class
    And User_607 Check Promotion Type Field In limit In Additional Information In Mainteance Under Product Class
    And User_607 Check Insurance Type Field In limit In Additional Information In Mainteance Under Product Class

  @721374
  Scenario: Desk Management- basic Testing
    Given navigate to IIS param application and login with valid credentials
    And User_607 get the test data for test ID AT_IISPRM_064
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Desk Management Under Parameters
    And User_607 Click Mainteance Under Desk Management
    And User_607 Enter Code In Mainteance Under Desk Management
    And User_607 Enter Brief Description In Mainteance Under Desk Management
    And User_607 Enter Long Description In Mainteance Under Desk Management
    And User_607 Save button In Mainteance Under Desk Management
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Update After Approve Under Desk Management
    And User_607 Search Desk Code In Update After Approve Under Desk Management
    And User_607 Select Record In Desk Code In Update After Approve Under Desk Management
    And User_607 ReEnter Brief Description In Update After Approve Under Desk Management
    And User_607 Click Update button In Update After Approve Under Desk Management
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Mainteance Under Desk Management
    And User_607 Click Ok in Confirm Popup
    And User_607 Click Search button In Mainteance Under Desk Management
    And User_607 Search Record In Mainteance Under Desk Management
    And User_607 Check the record should have brief name in grid list
    And User_607 Check the record should have long name in grid list
    And User_607 Select Record In Mainteance Under Desk Management
    And User_607 Click Delete button In Mainteance Under Desk Management
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Mainteance Under Desk Management
    And User_607 Click Ok in Confirm Popup
    And User_607 Check Reject Field under desk mainteance
    And User_607 Check Approve Field under desk mainteance
    And User_607 Click Last button In Mainteance Under Desk Management
    And User_607 Click First button In Mainteance Under Desk Management
    And User_607 Click next button In Mainteance Under Desk Management
    And User_607 Click Previous button In Mainteance Under Desk Management
    And User_607 Click Search In Grid List In Mainteance Under Desk Management
    And User_607 Select Desk Code Shorting In Mainteance Under Desk Management
    And User_607 Close Sorting Popup
    And User_607 Check Code Field Accept only numeric values In Mainteance Under Desk Management
    And User_607 Close Desk Management Maintenance Tab

  @721382
  Scenario: Email- basic Testing
    Given navigate to IIS param application and login with valid credentials
    And User_607 get the test data for test ID AT_IISPRM_065
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Email Under Menu Options
    And User_607 Mainteance Under Email
    And User_607 Click Add button In Mainteance Under Email
    And User_607 Select Row In Mainteance Under Email
    And User_607 Enter Email In Row In Mainteance Under Email
    And User_607 Save button In Mainteance Under Email
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Select First Row In Mainteance Under Email
    And User_607 Change DropDown in Indicator In First Row In Mainteance Under Email
    And User_607 Save button In Mainteance Under Email
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Select First Row In Mainteance Under Email
    And User_607 Delete the record In Mainteance Under Email
    And User_607 Save button In Mainteance Under Email
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Check Update After Authorize Field Under Email
    And User_607 Check Reject Under Email Field Under Email
    And User_607 Check approve Under Email Field Under Email
    And User_607 Close Parameter Email Mainteance Tab

    @721389
    Scenario: Email- basic Testing
    Given navigate to IIS param application and login with valid credentials
    And User_607 get the test data for test ID AT_IISPRM_066
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Board Members Under Parameters
    And User_607 Click Mainteance Under Board Members
    And User_607 Enter Member ID In Mainteance Under Board Members
    And User_607 Enter Brief Description In Mainteance Under Board Members
    And User_607 Enter Long Description In Mainteance Under Board Members
    And User_607 Click Save button In Mainteance Under Board Members
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Board Members
    And User_607 Select Record In Mainteance Under Board Members
    And User_607 Edit Brief Description In Mainteance Under Board Members
    And User_607 Click Update button In Mainteance Under Board Members
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Board Members
    And User_607 Select Record In Mainteance Under Board Members
    And User_607 Click Delete button In Mainteance Under Board Members
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Board Members
    And User_607 Click Last button In Mainteance Under Board Members
    And User_607 Click First button In Mainteance Under Board Members
    And User_607 Click next button In Mainteance Under Board Members
    And User_607 Click Previous button In Mainteance Under Board Members
    And User_607 Check Short Name Eng Show In Search In Mainteance Under Board Members
    And User_607 Check Long Name Eng Show In Search In Mainteance Under Board Members
    And User_607 Click Search In Grid List In Mainteance Under Board Members
    And User_607 Select Desk Code Shorting In Mainteance Under Board Members
    And User_607 Close Sorting Popup In Mainteance Under Board Members
    And User_607 Check List Field under Under Board Members
    And User_607 Check Update After Authorize Field under Under Board Members
    And User_607 Check Reject Field under Under Board Members
    And User_607 Check Approve Field under Under Board Members
    And User_607 Check MemberID Accept only numeric values In Mainteance Under Board Members
    And User_607 Close Board Members Maintenance Tab
    
    
    @721405
    Scenario: Certificate Type -basic Testing
    Given navigate to IIS param application and login with valid credentials
    And User_607 get the test data for test ID AT_IISPRM_068
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Certificate Types Under Parameters
    And User_607 Click Mainteance Under Certificate Types
    And User_607 Enter Code In Mainteance Under Certificate Types
    And User_607 Enter Brief Description In Mainteance Under Certificate Types
    And User_607 Enter Long Description In Mainteance Under Certificate Types
    And User_607 Click Save button In Mainteance Under Certificate Types
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Certificate Types
    And User_607 Select Record In Mainteance Under Certificate Types
    And User_607 Edit Brief Description In Mainteance Under Certificate Types
    And User_607 Click Update button In Mainteance Under Certificate Types
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Certificate Types
    And User_607 Select Record In Mainteance Under Certificate Types
    And User_607 Click Delete button In Mainteance Under Certificate Types
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Certificate Types
    And User_607 Click Last button In Mainteance Under Certificate Types
    And User_607 Click First button In Mainteance Under Certificate Types
    And User_607 Click next button In Mainteance Under Certificate Types
    And User_607 Click Previous button In Mainteance Under Certificate Types
    And User_607 Check Brief Description In Search In Mainteance Under Certificate Types
    And User_607 Check Long Description In Search In Mainteance Under Certificate Types
    And User_607 Click Search In Grid List In Mainteance Under Certificate Types
    And User_607 Select Certificate Code Shorting In Mainteance Under Certificate Types
    And User_607 Close Sorting Popup In Mainteance Under Certificate Types
    And User_607 Check List Field under Under Certificate Types
    And User_607 Check Update After Authorize Field under Under Certificate Types
    And User_607 Check Reject Field under Under Certificate Types
    And User_607 Check Approve Field under Under Certificate Types
    And User_607 Check Code Accept only numeric values In Mainteance Under Certificate Types
    And User_607 Close Parameters Certificate Types Maintenance Tab
    
    @721413
    Scenario: Certificate Type -basic Testing
    Given navigate to IIS param application and login with valid credentials
    And User_607 get the test data for test ID AT_IISPRM_069
    And User_607 Click Parameters under Menu In IISparam
    And User_607 Click Reason Codes Under Parameters
    And User_607 Click Mainteance Under Reason Codes
    And User_607 Enter Code In Mainteance Under Reason Codes
    And User_607 Enter Brief Description In Mainteance Under Reason Codes
    And User_607 Enter Long Description In Mainteance Under Reason Codes
    And User_607 Click Save button In Mainteance Under Reason Codes
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Reason Codes
    And User_607 Select Record In Mainteance Under Reason Codes
    And User_607 Edit Brief Description In Mainteance Under Reason Codes
    And User_607 Click Save button In Mainteance Under Reason Codes
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Reason Codes
    And User_607 Select Record In Mainteance Under Reason Codes
    And User_607 Click Delete button In Mainteance Under Reason Codes
    And User_607 Click Ok in Confirm Popup
    And User_607 Click ok in Success popup
    And User_607 Click Search button In Mainteance Under Reason Codes
    And User_607 Click Last button In Mainteance Under Reason Codes
    And User_607 Click First button In Mainteance Under Reason Codes
    And User_607 Click next button In Mainteance Under Reason Codes
    And User_607 Click Previous button In Mainteance Under Reason Codes
    And User_607 Check Brief Description In Search In Mainteance Under Reason Codes
    And User_607 Check Long Description In Search In Mainteance Under Reason Codes
    And User_607 Click Search In Grid List In Mainteance Under Reason Codes
    And User_607 Select Certificate Code Shorting In Mainteance Under Reason Codes
    And User_607 Close Sorting Popup In Mainteance Under Reason Codes
    And User_607 Check List Field under Reason Codes
    And User_607 Check Update After Authorize Field under Reason Codes
    And User_607 Check Reject Field under Reason Codes
    And User_607 Check Approve Field under Reason Codes
    And User_607 Check Code Accept only numeric values In Mainteance Under Reason Codes
    And User_607 Close Parameters Reason Codes Maintenance Tab
    
    
    
    
    
    
    
    
    
