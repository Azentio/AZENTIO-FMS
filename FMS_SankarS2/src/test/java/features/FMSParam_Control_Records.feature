Feature: To check the control records features

@305607
Scenario: Check modification at the FMS Ctrl Record

Given navigate to FMS param application and login with valid credentials
And User clicks on the Parameter module
And User clicks on the control records feature
And User clicks on the update after approve menu
And User validate the Officer Assigned Required checkbox
And User uncheck the Officer Assigned Required flag
And User validate the Enable Markup Type checkbox
And User uncheck the Enable Markup Type flag
And User validate the Role of Officers Assigned menu
And User validate the Party s History with Company menu
And User validate the Member Countries
And User check the Officer Assigned Required flag
And User clicks on the update button
And User clicks on the approve menu
Then User clicks on the approve button

@305703
Scenario: Check modification at the FMS Ctrl Rec. new radio button-Member Countries Screen

Given navigate to FMS param application and login with valid credentials
And User clicks on the Parameter module
And User clicks on the control records feature
And User clicks on the update after approve menu
And User clicks on the member countries menu
And User clicks the add new row button
And Update test data for test case no 305703
And User enter the country code
And User clicks on the membership type dropdown
#Then validate the membership DDLB values









 