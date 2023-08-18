Feature: Account Restrictions

@131558
Scenario: SADS -Account Restriction

Given navigate to Sads application and login with valid credentials
And User_609 get the test data set id for AT_AR_001
And User_609 Click on the Parameters menu in iis
And User_609 Click on Account Restriction submenu in Parameters
And User_609 Click on the Maintenance screen under Account Restriction in Parameters
And User_609 Enter the Code under Account Restriction in Parameters
And User_609 Enter the Description under Account Restriction in Parameters
And User_609 Select the Application OPt under Account Restriction in Parameters
And User_609 Select the Companies under Account Restriction in Parameters
And User_609 Select the User id under Account Restriction in Parameters
And User_609 Select the Restricting Type under Account Restriction in Parameters
And User_609 Select the GL code under Account Restriction in Parameters
And User_609 Click on Save Button under Account Restriction in Parameters

And User_609 Click on Approve screen under Account Restriction in Parameters
And User_609 Select the Code in Approve under Account Restriction in Parameters
And User_609 Click the Approve Button in Approve under Account Restriction in Parameters


@131559
Scenario: Checking the SMART  in T022 screen

Given navigate to Sads application and login with valid credentials
And User_609 get the test data set id for AT_AR_002






























#And User_609 Click on Application submenu in Parameters
#And User_609 Click on Control Record submenu in Parameters
#And User_609 Click on the Maintenance screen in Parameters
#And Click on the search icon in Parameters
#And Select the Application in Parameters
#Then Check the Enable SMART Access Privileges is Checked in Parameters