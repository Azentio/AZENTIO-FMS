
Feature: To check the modification at the level of Request for Finance screen-a new DDLB filed Economic Sector and Sub-Economic Sector
@931766_1
Scenario: AIBBI190625 - Economic and Sub-Economic Sector Not appearing
Given User Launch the CSM params Application
And User Click CSM parameter Main Menu
And User Click CIF paramter Sub Menu
And User Click Economic Sector SubMenu
And User Click Maintenace Screen in Economic Sector 
And User Enter sector code in Economic Sector Maintenace Screen
And User Enter brief name in Economic Sector Maintenace Screen
And User Enter brief name Arab in Economic Sector Maintenace Screen
And User Click Save button in Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Economic Sector Maintenace Screen
And User click Approve Screen In Economic Sector
And User Search sector code in Economic Sector Approve Screen
And User Select the searched record in Economic Sector Approve Screen
And User click aprove button in Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Economic Sector Maintenace Screen 

And User Click Sub Economic Sector SubMenu
And User Click Maintenace Screen in Sub Economic Sector
And User Select sector key in Sub economic Sector
And User Enter sub sector code in Sub Economic Sector Maintenace Screen
And User Enter brief name in Sub Economic Sector Maintenace Screen
And User Enter brief name Arab in Sub Economic Sector Maintenace Screen

And User Click Save button in Sub Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Sub Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Sub Economic Sector Maintenace Screen
And User click Approve Screen In Sub Economic Sector
And User Search sector code in Sub Economic Sector Approve Screen
And User Select the searched record in Sub Economic Approve Screen
And User click aprove button in Sub Economic Sector Maintenace Screen
And User Click ok button in confirm pop up Sub Economic Sector Maintenace Screen
And User Click ok button in Sucess pop up Sub Economic Sector Maintenace Screen

Given navigate to FMS application and login with valid credentials2
And User Click on REQUEST FOR FINANCIN under FMS application
And User click the Request For Financing Sub Menu under REQUEST FOR FINANCIN
And User Click on Maintenance under Request For Financing Sub Menu in REQUEST FOR FINANCIN
And User Search and Validate created Economic sector code refletced in Application screen
And User Search and Validate created Sub Economic sector code refletced in Application screen