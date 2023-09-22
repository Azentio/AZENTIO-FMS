Feature: Authorization limit
@1215513
Scenario: AMN210018 - IIS Limit Managment


Given navigate to IIS application and login with valid credentials
#And User_609 get the test data set id for AT_AUTL_009
And User_609 clear the caches in IIS Application
And User_609 Click the Limit_Management menu
And User_609 Click the Authorization limit submenu under Limit Management
And User_609 Click the Maintenance screen in Authorization limit under Limit Management
And User_609 Verify the Maintenance Screen loads Completely in Authorization limit under Limit Management
And User_609 Click the Approve screen in Authorization limit under Limit Management
And User_609 Verify the Approve Screen loads Completely in Authorization limit under Limit Management

#And User_609 Click the Search Button in Authorization limit under Limit Management
#And User_609 Click the New Button in Authorization limit under Limit Management
#And User_609 Select the User ID in Authorization limit under Limit Management
#And User_609 Enter the Authorization Limit in Authorization limit under Limit Management
#And User_609 Enter the Percentage in Authorization limit under Limit Management
#And User_609 Click the Save Button in Authorization limit under Limit Management
#And User_609 Select the User ID in Authorization limit under Limit Management
#And User_609 Click the Approve screen in Authorization limit under Limit Management
#And User_609 Select the User ID for Approve in Authorization limit under Limit Management
#And User_609 Click the Approve Button in Authorization limit under Limit Management
#

@1298317
Scenario:	 BOAI210160 - Error while Approve the Limit Management


Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AUTL_009
And User_609 clear the caches in IIS Application
And User_609 Click the Limit_Management menu
And User_609 Click the Authorization limit submenu under Limit Management
And User_609 Click the Update After Approve screen in Authorization limit under Limit Management
And User_609 Select the User ID in Update After Approve1 in Authorization limit under Limit Management
And User_609 Click the Limits in Update After Approve in Authorization limit under Limit Management
And User_609 Click the Update Button in Update After Approve in Authorization limit under Limit Management
And User_609 Click the Approve screen in Authorization limit under Limit Management
And User_609 Select the User ID for Approve after Update in Authorization limit under Limit Management
And User_609 Click the Approve Button in Authorization limit under Limit Management



#And User_609 Click the Update After Approve screen in Authorization limit under Limit Management
#And User_609 Select the User ID in Update After Approve in Authorization limit under Limit Management
#And User_609 Click the Update Button in Update After Approve in Authorization limit under Limit Management
#And User_609 Click the Approve screen in Authorization limit under Limit Management
#And User_609 Select the User ID for Approve in Authorization limit under Limit Management
#And User_609 Click the Approve Button in Authorization limit under Limit Management



@1038916
Scenario: AUBBHU200120 - Verify screen and Authorization Limit

Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AUTL_009
And User_609 clear the caches in IIS Application
And User_609 Click the Investment Deals Combined without Trade Deal menu
And User_609 Click the Verify screen under Investment Deals Combined without Trade Deal
Then User_609 Validate the Verify Screen loads Completely under Investment Deals Combined without Trade Deal
And User_609 Click on Approve Submenu in Investment Deals Combined without Trade Deal
Then User_609 Validate the Approve Screen loads Completely under Investment Deals Combined without Trade Deal

@1163976
Scenario: BB210146 - utilization amount is not matching with the screen

Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AUTL_008

And User_609 Click the Limit_Management menu
And User_609 Click the Authorization limit submenu under Limit Management
And User_609 Click the Update After Approve screen in Authorization limit under Limit Management
And User_609 Select the User ID in Update After Approve1 in Authorization limit under Limit Management

And User_609 Select the Based on value in Update After Approve1 in Authorization limit under Limit Management
And User_609 Enter the Limit in Update After Approve1 in Authorization limit under Limit Management
And User_609 Select the Validation Type in Update After Approve1 in Authorization limit under Limit Management


And User_609 Click the Limits in Update After Approve in Authorization limit under Limit Management
And User_609 Click the Update Button in Update After Approve in Authorization limit under Limit Management
And User_609 Click the Approve screen in Authorization limit under Limit Management
And User_609 Select the User ID for Approve after Update in Authorization limit under Limit Management
And User_609 Click the Approve Button in Authorization limit under Limit Management
