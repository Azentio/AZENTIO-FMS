Feature: Application for Financial Facility

@402668
Scenario: TS-0002-FMS-Modification new fields at the level of Application for Financial facilities screens
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_AFF_078
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu
And User_609 Click on Update After Approve Screen 
And User_609 Select for the Code in Update After Approve screen
And User_609 Select the Revolving/One-Off option in Main Details tab
And User_609 Enable the Apply Revolving Controls in Main Details tab
And User_609 Enter the value for Max Revolving Times
And User_609 Enter the value for Manual Revolving Minimum Utilization	
And User_609 Enable the Subject to Full Repayment 
And User_609 Click on Update
And User_609 Click the confirm ok button
And User_609 Click the ok button
And User_609 Click on Approve Screen
And User_609 Select the Code in Approve screen
And User_609 Click on Approve
And User_609 Click the confirm ok button
And User_609 Click the ok button


@127780
Scenario: TC to check the addition of two new flags at the Parameters -Facility Type Maintain  screen(P008)
Given navigate to FMS param application and login with valid credentials2
And User_609 get the test data set id for AT_AFF_059
And User_609 Click on the Parameters menu
And User_609 Click on the Facility Type Submenu  
And User_609 Click on Update After Approve Screen
And User_609 Select for the Code in Update After Approve screen
And User_609 Click on the Facility Details Tab
And User_609 Click on the Application Requirements and Details in Facility Details tab
Then User_609 Check the Apply Corporate Package is displayed
Then User_609 Check the Allow to Edit Application is displayed
Then User_609 Check the Allow to edit Corporate Package Rate is displayed