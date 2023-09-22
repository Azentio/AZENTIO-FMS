Feature: Penalty

@721174
Scenario:	Authorization Limit -basic Testing

Given navigate to IIS application and login with valid credentials
And User_609 get the test data set id for AT_AUTL_006
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
And User_609 Click the Update After Approve screen in Authorization limit under Limit Management
And User_609 Click Confirm ok to switch tab
And User_609 Select the User ID in Update After Approve1 in Authorization limit under Limit Management
And User_609 Click the Limits Details tab in Update After Approve in Authorization limit under Limit Management
And User_609 Click the Add icon in Update After Approve in Authorization limit under Limit Management
And User_609 Enter the Intra Day Limit in Update After Approve in Authorization limit under Limit Management
Then User_609 Check the Limit cannot be greater than User Limit is Displaying
And User_609 Click the Maintenance screen in Authorization limit under Limit Management
And User_609 Click the Search Button in Authorization limit under Limit Management
And User_609 Click the Page Next Button in Authorization limit under Limit Management
And User_609 Click the Page Prev Button in Authorization limit under Limit Management
And User_609 Click the Page Last Button in Authorization limit under Limit Management
And User_609 Click the Page First Button in Authorization limit under Limit Management
And User_609 Click the Find Records icon in Authorization limit under Limit Management
And User_609 Select the SortBy in Authorization limit under Limit Management