Feature: Test the Functionality of Draw Down Request
@AT_DDR_007
Scenario: In FMS REVERSE THE DDR3 
Given User_007 navigate to FMS application and login with valid credentials
And User_007 Click on Report menu
And User_007 Click on Availment Ticket sub menu under Report menu
#And User_007 Click on parameter under Availment Ticket
And User_007 Click on CIF No Tab
And User_007 Enter CIF No 
And User_007 click on Without header and footer
And User_007 Click On Retrive Button
And User_007 Click On Availment Ticket sub Report Drawdown
And User_007 Click On Branch code and Enter code
And User_007 Click On Retrive btn
#And User_007 Check the draw down linked in TFA are displaying in the report
And User_007 Click On Availment Ticket sub Report Facility
#And User_007 Check the draw down details are displaying when the user specify the particular facility


@AT_DDR_013
Scenario: TC to check the new section added in the Corporate Package screen
Given navigate to FMS param application and login with valid credentials
And User_013 click on language
And User_013 click parameter Menu
And User_013 click on corporate packages
And User_013 click on maintanance
And User_013 group limit tab unser maintanance
And User_013 Click on Add new Row Under Yeild Detail
And User_013 Check for the new section Group Limit added in this screen with the below features


@AT_DDR_016
Scenario: TC to check the  new  addional field for Group ID added under the Rates scetion in Corporate Package screen
Given User_016 navigate to FMS param application and login with valid credentials
And User_016 click parameter Menu
And User_016 click on corporate packages
And User_016 click on maintanance
And User_016 Check the additional Field Group ID added next to the Product Class field under the Rates section


@AT_DDR_017
Scenario: To check the new button for rates  added under the Rates scetion in Corporate Package screen
Given User_016 navigate to FMS param application and login with valid credentials
And User_016 click parameter Menu
And User_016 click on corporate packages
And User_016 click on maintanance
And User_017 Update test data set id for AT_DDR_017
And User_017 Click on Search button
And User_017 Click on code tab and Enter code No
And User_017 Click on Retrive data
And User_017 Click on add Icon under rates session
And User_017 Click on Product Class and Enter Data
And User_017 Click on Yield Detail
And User_017 Click on Add new Row Under Yeild Detail
And User_017 Check the new button for rates added under the Rates scetion in Corporate Package screen


@AT_DDR_081
Scenario: Check in Transaction Template screen, new elements 'Down Payment' and 'Down Payment Refund' is added to the amount
Given User_081 navigate to FMS param application and login with valid credentials
And User_081 Click Parameter Menu
And User_081 Click Transaction Template Menu
And User_081 Click Maintanance Under Transaction Template
And User_081 Click Add Icon Under Maintanance
And User_081 Click on LN Under AddIcon
And User_081 Click on Plus Icon Under Formula in Amount
And User_081 Click Add Icon Under Formula in Amount
And User_081 Click on List Of Fields
And User_081 drawDown Field
And User_081 Check new elements Down Payment and Down Payment Refund is added to the amount



